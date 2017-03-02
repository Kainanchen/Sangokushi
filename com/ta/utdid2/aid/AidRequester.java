package com.ta.utdid2.aid;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.ta.utdid2.android.utils.DebugUtils;
import com.ta.utdid2.android.utils.NetworkUtils;
import com.tencent.connect.common.Constants;
import com.ut.device.AidCallback;
import com.ut.device.AidConstants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

public class AidRequester {
    private static final String AIDFUNCNAME = "/get_aid/";
    private static final String AIDSERVER = "http://hydra.alibaba.com/";
    private static final String NAME_AID = "&aid=";
    private static final String NAME_ID = "&id=";
    private static final String NAME_RESULT_ACTION = "action";
    private static final String NAME_RESULT_AID = "aid";
    private static final String NAME_RESULT_ISERROR = "isError";
    private static final String NAME_RESULT_STATUS = "status";
    private static final String NAME_RESUTL_DATA = "data";
    private static final String NAME_TOKEN = "auth[token]=";
    private static final String NAME_TYPE = "&type=";
    private static final String RSP_ACTION_CHANGED = "changed";
    private static final String RSP_ACTION_NEW = "new";
    private static final String RSP_ACTION_UNCHANGED = "unchanged";
    private static final String RSP_ISERROR_FALSE = "false";
    private static final String RSP_ISERROR_TRUE = "true";
    private static final String RSP_STATUS_INVALID_APP = "404";
    private static final String RSP_STATUS_INVALID_TOKEN = "401";
    private static final String RSP_STATUS_OK = "200";
    private static final int SESSION_TIME_OUT = 1000;
    private static final String TAG;
    private static final String TYPE_UTDID = "utdid";
    private static final int WEAK_SESSION_TIME_OUT = 3000;
    private static AidRequester sAidRequester;
    private Context mContext;
    private Object mLock;

    class PostRestThread extends Thread {
        String mAppName;
        AidCallback mCallback;
        String mOldAid;
        HttpPost mPost;
        String mRspLine;
        String mToken;

        public PostRestThread(HttpPost post) {
            this.mRspLine = Constants.STR_EMPTY;
            this.mToken = Constants.STR_EMPTY;
            this.mPost = post;
        }

        public PostRestThread(HttpPost post, AidCallback callback, String oldAid, String appName, String token) {
            this.mRspLine = Constants.STR_EMPTY;
            this.mToken = Constants.STR_EMPTY;
            this.mPost = post;
            this.mCallback = callback;
            this.mOldAid = oldAid;
            this.mAppName = appName;
            this.mToken = token;
        }

        public void run() {
            if (this.mCallback != null) {
                this.mCallback.onAidEventChanged(AidRequester.SESSION_TIME_OUT, this.mOldAid);
            }
            HttpResponse response = null;
            try {
                response = new DefaultHttpClient().execute(this.mPost);
            } catch (Exception e) {
                if (this.mCallback != null) {
                    this.mCallback.onAidEventChanged(AidConstants.EVENT_REQUEST_FAILED, this.mOldAid);
                }
                Log.e(AidRequester.TAG, e.toString());
            }
            BufferedReader rd = null;
            if (response != null) {
                try {
                    rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent(), Charset.forName(AsyncHttpResponseHandler.DEFAULT_CHARSET)));
                } catch (Exception e2) {
                    if (this.mCallback != null) {
                        this.mCallback.onAidEventChanged(AidConstants.EVENT_REQUEST_FAILED, this.mOldAid);
                    }
                    Log.e(AidRequester.TAG, e2.toString());
                }
            } else {
                Log.e(AidRequester.TAG, "response is null!");
            }
            String line = Constants.STR_EMPTY;
            if (rd != null) {
                while (true) {
                    line = rd.readLine();
                    if (line == null) {
                        break;
                    }
                    try {
                        if (DebugUtils.DBG) {
                            Log.d(AidRequester.TAG, line);
                        }
                        this.mRspLine = line;
                    } catch (Exception e22) {
                        if (this.mCallback != null) {
                            this.mCallback.onAidEventChanged(AidConstants.EVENT_REQUEST_FAILED, this.mOldAid);
                        }
                        Log.e(AidRequester.TAG, e22.toString());
                    }
                }
            } else {
                Log.e(AidRequester.TAG, "BufferredReader is null!");
            }
            if (rd != null) {
                try {
                    rd.close();
                    if (DebugUtils.DBG) {
                        Log.d(AidRequester.TAG, "close the bufferreader");
                    }
                } catch (IOException e3) {
                    Log.e(AidRequester.TAG, e3.toString());
                }
            }
            if (this.mCallback == null) {
                synchronized (AidRequester.this.mLock) {
                    AidRequester.this.mLock.notifyAll();
                }
                return;
            }
            String aid = AidRequester.getAidFromJsonRsp(this.mRspLine, this.mOldAid);
            this.mCallback.onAidEventChanged(AidConstants.EVENT_REQUEST_SUCCESS, aid);
            AidStorageController.setAidValueToSP(AidRequester.this.mContext, this.mAppName, aid, this.mToken);
        }

        public String getResponseLine() {
            return this.mRspLine;
        }
    }

    static {
        TAG = AidRequester.class.getName();
        sAidRequester = null;
    }

    public static synchronized AidRequester getInstance(Context context) {
        AidRequester aidRequester;
        synchronized (AidRequester.class) {
            if (sAidRequester == null) {
                sAidRequester = new AidRequester(context);
            }
            aidRequester = sAidRequester;
        }
        return aidRequester;
    }

    public AidRequester(Context context) {
        this.mLock = new Object();
        this.mContext = context;
    }

    public void postRestAsync(String appName, String token, String utdid, String oldAid, AidCallback callback) {
        String url = getPostUrl(appName, token, utdid, oldAid);
        if (DebugUtils.DBG) {
            Log.d(TAG, "url:" + url + "; len:" + url.length());
        }
        new PostRestThread(new HttpPost(url), callback, oldAid, appName, token).start();
    }

    public String postRest(String appName, String token, String utdid, String oldAid) {
        String aid = Constants.STR_EMPTY;
        String url = getPostUrl(appName, token, utdid, oldAid);
        int timeout = NetworkUtils.isConnectedToWeakNetwork(this.mContext) ? WEAK_SESSION_TIME_OUT : SESSION_TIME_OUT;
        if (DebugUtils.DBG) {
            Log.d(TAG, "url:" + url + "; timeout:" + timeout);
        }
        PostRestThread prThread = new PostRestThread(new HttpPost(url));
        prThread.start();
        try {
            synchronized (this.mLock) {
                this.mLock.wait((long) timeout);
            }
        } catch (Exception e) {
            Log.e(TAG, e.toString());
        }
        aid = prThread.getResponseLine();
        if (DebugUtils.DBG) {
            Log.d(TAG, "mLine:" + aid);
        }
        return getAidFromJsonRsp(aid, oldAid);
    }

    private static String getAidFromJsonRsp(String jsonData, String oldAid) {
        String aid = oldAid;
        if (TextUtils.isEmpty(jsonData)) {
            return aid;
        }
        String action = Constants.STR_EMPTY;
        try {
            JSONObject jObject = new JSONObject(jsonData);
            if (jObject.has(NAME_RESUTL_DATA)) {
                JSONObject data = jObject.getJSONObject(NAME_RESUTL_DATA);
                if (!data.has(NAME_RESULT_ACTION) || !data.has(NAME_RESULT_AID)) {
                    return aid;
                }
                action = data.getString(NAME_RESULT_ACTION);
                return (action.equalsIgnoreCase(RSP_ACTION_NEW) || action.equalsIgnoreCase(RSP_ACTION_CHANGED)) ? data.getString(NAME_RESULT_AID) : aid;
            } else if (!jObject.has(NAME_RESULT_ISERROR) || !jObject.has(NAME_RESULT_STATUS)) {
                return aid;
            } else {
                String isError = jObject.getString(NAME_RESULT_ISERROR);
                String status = jObject.getString(NAME_RESULT_STATUS);
                if (!isError.equalsIgnoreCase(RSP_ISERROR_TRUE)) {
                    return aid;
                }
                if (!status.equalsIgnoreCase(RSP_STATUS_INVALID_APP) && !status.equalsIgnoreCase(RSP_STATUS_INVALID_TOKEN)) {
                    return aid;
                }
                if (DebugUtils.DBG) {
                    Log.d(TAG, "remove the AID, status:" + status);
                }
                return Constants.STR_EMPTY;
            }
        } catch (JSONException e) {
            Log.e(TAG, e.toString());
            return aid;
        } catch (Exception e2) {
            Log.e(TAG, e2.toString());
            return aid;
        }
    }

    private static String getPostUrl(String appName, String token, String utdid, String oldAid) {
        String encodedUtdid;
        StringBuilder sb = new StringBuilder();
        try {
            encodedUtdid = URLEncoder.encode(utdid, AsyncHttpResponseHandler.DEFAULT_CHARSET);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            encodedUtdid = utdid;
        }
        return sb.append(AIDSERVER).append(appName).append(AIDFUNCNAME).append("?").append(NAME_TOKEN).append(token).append(NAME_TYPE).append(TYPE_UTDID).append(NAME_ID).append(encodedUtdid).append(NAME_AID).append(oldAid).toString();
    }
}
