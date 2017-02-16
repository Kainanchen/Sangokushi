package com.sina.weibo.sdk.statistic;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.sina.weibo.sdk.net.HttpManager;
import com.sina.weibo.sdk.utils.LogUtil;
import com.sina.weibo.sdk.utils.MD5;
import com.sina.weibo.sdk.utils.Utility;
import com.tencent.android.tpush.common.MessageKey;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class LogReport {
    private static final int CONNECTION_TIMEOUT = 25000;
    private static final String PRIVATE_CODE = "dqwef1864il4c9m6";
    private static final int SOCKET_TIMEOUT = 20000;
    private static String UPLOADTIME;
    private static String mAid;
    private static String mAppkey;
    private static String mBaseUrl;
    private static String mChannel;
    private static String mKeyHash;
    public static LogReport mLogReport;
    private static String mPackageName;
    private static JSONObject mParams;
    private static String mVersionName;

    static {
        UPLOADTIME = "uploadtime";
        mBaseUrl = "https://api.weibo.com/2/proxy/sdk/statistic.json";
    }

    public LogReport(Context context) {
        try {
            if (mPackageName == null) {
                mPackageName = context.getPackageName();
            }
            mAppkey = StatisticConfig.getAppkey(context);
            checkAid(context);
            mKeyHash = Utility.getSign(context, mPackageName);
            mVersionName = LogBuilder.getVersion(context);
            mChannel = StatisticConfig.getChannel(context);
        } catch (Exception e) {
            LogUtil.m4622e(WBAgent.TAG, e.toString());
        }
        initCommonParams();
    }

    private static JSONObject initCommonParams() {
        if (mParams == null) {
            mParams = new JSONObject();
        }
        try {
            mParams.put(LogBuilder.KEY_APPKEY, mAppkey);
            mParams.put(LogBuilder.KEY_PLATFORM, "Android");
            mParams.put(LogBuilder.KEY_PACKAGE_NAME, mPackageName);
            mParams.put(LogBuilder.KEY_HASH, mKeyHash);
            mParams.put(LogBuilder.KEY_VERSION, mVersionName);
            mParams.put(LogBuilder.KEY_CHANNEL, mChannel);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return mParams;
    }

    private static void checkAid(Context context) {
        if (TextUtils.isEmpty(mAid)) {
            mAid = Utility.getAid(context, mAppkey);
        }
        if (mParams == null) {
            mParams = new JSONObject();
        }
        try {
            mParams.put(LogBuilder.KEY_AID, mAid);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void setPackageName(String str) {
        mPackageName = str;
    }

    public static String getPackageName() {
        return mPackageName;
    }

    public static synchronized void uploadAppLogs(Context context, String str) {
        synchronized (LogReport.class) {
            if (mLogReport == null) {
                mLogReport = new LogReport(context);
            }
            if (isNetworkConnected(context)) {
                List<JSONArray> validUploadLogs = LogBuilder.getValidUploadLogs(str);
                if (validUploadLogs == null) {
                    LogUtil.m4623i(WBAgent.TAG, "applogs is null");
                } else {
                    List<JSONArray> arrayList = new ArrayList();
                    checkAid(context);
                    for (JSONArray jSONArray : validUploadLogs) {
                        HttpResponse requestHttpExecute = requestHttpExecute(mBaseUrl, "POST", mParams, jSONArray);
                        if (requestHttpExecute == null || requestHttpExecute.getStatusLine().getStatusCode() != 200) {
                            arrayList.add(jSONArray);
                            LogUtil.m4622e(WBAgent.TAG, "upload applogs error");
                        } else {
                            updateTime(context, Long.valueOf(System.currentTimeMillis()));
                        }
                    }
                    LogFileUtil.delete(LogFileUtil.getAppLogPath(LogFileUtil.ANALYTICS_FILE_NAME));
                    if (arrayList.size() > 0) {
                        for (JSONArray jSONArray2 : arrayList) {
                            LogFileUtil.writeToFile(LogFileUtil.getAppLogPath(LogFileUtil.ANALYTICS_FILE_NAME), jSONArray2.toString(), true);
                            LogUtil.m4621d(WBAgent.TAG, "save failed_log");
                        }
                    }
                }
            } else {
                LogUtil.m4623i(WBAgent.TAG, "network is not connected");
                LogFileUtil.writeToFile(LogFileUtil.getAppLogPath(LogFileUtil.ANALYTICS_FILE_NAME), str, true);
            }
        }
    }

    private static HttpResponse requestHttpExecute(String str, String str2, JSONObject jSONObject, JSONArray jSONArray) {
        HttpClient newHttpClient;
        UnsupportedEncodingException e;
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        ClientProtocolException e2;
        IOException e3;
        HttpResponse httpResponse = null;
        try {
            HttpUriRequest httpGet;
            newHttpClient = HttpManager.getNewHttpClient();
            if (jSONObject == null) {
                try {
                    jSONObject = initCommonParams();
                } catch (UnsupportedEncodingException e4) {
                    e = e4;
                    byteArrayOutputStream = null;
                    try {
                        e.printStackTrace();
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e5) {
                            }
                        }
                        shutdownHttpClient(newHttpClient);
                        return httpResponse;
                    } catch (Throwable th2) {
                        th = th2;
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e6) {
                            }
                        }
                        shutdownHttpClient(newHttpClient);
                        throw th;
                    }
                } catch (ClientProtocolException e7) {
                    e2 = e7;
                    byteArrayOutputStream = null;
                    e2.printStackTrace();
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e8) {
                        }
                    }
                    shutdownHttpClient(newHttpClient);
                    return httpResponse;
                } catch (IOException e9) {
                    e3 = e9;
                    byteArrayOutputStream = null;
                    e3.printStackTrace();
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e10) {
                        }
                    }
                    shutdownHttpClient(newHttpClient);
                    return httpResponse;
                } catch (Throwable th3) {
                    byteArrayOutputStream = null;
                    th = th3;
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    shutdownHttpClient(newHttpClient);
                    throw th;
                }
            }
            try {
                jSONObject.put("time", System.currentTimeMillis() / 1000);
                jSONObject.put("length", jSONArray.length());
                jSONObject.put("sign", getSign(jSONObject.getString(LogBuilder.KEY_AID), jSONObject.getString(LogBuilder.KEY_APPKEY), jSONObject.getLong("time")));
                jSONObject.put(MessageKey.MSG_CONTENT, jSONArray);
                LogUtil.m4621d(WBAgent.TAG, "post content--- " + jSONObject.toString());
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
            if (str2.equals("GET")) {
                httpGet = new HttpGet(new StringBuilder(String.valueOf(str)).append("?").append(jSONObject.toString()).toString());
                byteArrayOutputStream = null;
            } else if (!str2.equals("POST")) {
                httpGet = null;
                byteArrayOutputStream = null;
            } else if (TextUtils.isEmpty(mAppkey)) {
                LogUtil.m4622e(WBAgent.TAG, "unexpected null AppKey");
                shutdownHttpClient(newHttpClient);
                return httpResponse;
            } else {
                httpGet = getNewHttpPost(new StringBuilder(String.valueOf(str)).append("?source=").append(mAppkey).toString(), jSONObject);
                byteArrayOutputStream = new ByteArrayOutputStream();
                if (StatisticConfig.isNeedGizp()) {
                    byteArrayOutputStream.write(gzipLogs(jSONObject.toString()));
                } else {
                    byteArrayOutputStream.write(jSONObject.toString().getBytes());
                }
                httpGet.setEntity(new ByteArrayEntity(byteArrayOutputStream.toByteArray()));
            }
            try {
                httpResponse = newHttpClient.execute(httpGet);
                LogUtil.m4623i(WBAgent.TAG, "status code = " + httpResponse.getStatusLine().getStatusCode());
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e12) {
                    }
                }
                shutdownHttpClient(newHttpClient);
            } catch (UnsupportedEncodingException e13) {
                e = e13;
                e.printStackTrace();
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                shutdownHttpClient(newHttpClient);
                return httpResponse;
            } catch (ClientProtocolException e14) {
                e2 = e14;
                e2.printStackTrace();
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                shutdownHttpClient(newHttpClient);
                return httpResponse;
            } catch (IOException e15) {
                e3 = e15;
                e3.printStackTrace();
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                shutdownHttpClient(newHttpClient);
                return httpResponse;
            }
        } catch (UnsupportedEncodingException e16) {
            e = e16;
            byteArrayOutputStream = null;
            newHttpClient = null;
            e.printStackTrace();
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            shutdownHttpClient(newHttpClient);
            return httpResponse;
        } catch (ClientProtocolException e17) {
            e2 = e17;
            byteArrayOutputStream = null;
            newHttpClient = null;
            e2.printStackTrace();
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            shutdownHttpClient(newHttpClient);
            return httpResponse;
        } catch (IOException e18) {
            e3 = e18;
            byteArrayOutputStream = null;
            newHttpClient = null;
            e3.printStackTrace();
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            shutdownHttpClient(newHttpClient);
            return httpResponse;
        } catch (Throwable th32) {
            byteArrayOutputStream = null;
            newHttpClient = null;
            th = th32;
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            shutdownHttpClient(newHttpClient);
            throw th;
        }
        return httpResponse;
    }

    private static boolean isNetworkConnected(Context context) {
        if (context == null) {
            LogUtil.m4622e(WBAgent.TAG, "unexpected null context in isNetworkConnected");
            return false;
        } else if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) != 0) {
            return false;
        } else {
            NetworkInfo activeNetworkInfo;
            try {
                activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            } catch (NullPointerException e) {
                activeNetworkInfo = null;
            }
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            return true;
        }
    }

    private static synchronized HttpPost getNewHttpPost(String str, JSONObject jSONObject) {
        HttpPost httpPost;
        synchronized (LogReport.class) {
            httpPost = new HttpPost(str);
            httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded");
            httpPost.setHeader("Connection", "Keep-Alive");
            httpPost.addHeader("Content-Encoding", StatisticConfig.isNeedGizp() ? "gzip" : "charset=UTF-8");
            httpPost.addHeader("Accept", "*/*");
            httpPost.addHeader("Accept-Language", "en-us");
            httpPost.addHeader("Accept-Encoding", "gzip");
        }
        return httpPost;
    }

    private static String getSign(String str, String str2, long j) {
        StringBuilder stringBuilder = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            stringBuilder.append(str);
        }
        stringBuilder.append(str2).append(PRIVATE_CODE).append(j);
        String hexdigest = MD5.hexdigest(stringBuilder.toString());
        hexdigest = hexdigest.substring(hexdigest.length() - 6);
        String hexdigest2 = MD5.hexdigest(new StringBuilder(String.valueOf(hexdigest)).append(hexdigest.substring(0, 4)).toString());
        return new StringBuilder(String.valueOf(hexdigest)).append(hexdigest2.substring(hexdigest2.length() - 1)).toString();
    }

    private static byte[] gzipLogs(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bytes = str.getBytes("utf-8");
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bytes);
            gZIPOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static long getTime(Context context) {
        return context.getSharedPreferences(UPLOADTIME, 0).getLong("lasttime", 0);
    }

    private static void updateTime(Context context, Long l) {
        Editor edit = context.getSharedPreferences(UPLOADTIME, 0).edit();
        edit.putLong("lasttime", l.longValue());
        edit.commit();
    }

    private static void shutdownHttpClient(HttpClient httpClient) {
        if (httpClient != null) {
            try {
                httpClient.getConnectionManager().closeExpiredConnections();
            } catch (Exception e) {
            }
        }
    }
}