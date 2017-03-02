package com.ta.utdid2.aid;

import android.content.Context;
import android.util.Log;
import com.ta.utdid2.android.utils.NetworkUtils;
import com.ta.utdid2.android.utils.StringUtils;
import com.ta.utdid2.android.utils.TimeUtils;
import com.tencent.connect.common.Constants;
import com.ut.device.AidCallback;
import com.ut.device.AidConstants;

public class AidManager {
    private static final int NUM_DAY_OUT_OF_DATE = 1;
    private static final String TAG;
    private static AidManager sAidManager;
    private Context mContext;

    static {
        sAidManager = null;
        TAG = AidManager.class.getName();
    }

    public static synchronized AidManager getInstance(Context context) {
        AidManager aidManager;
        synchronized (AidManager.class) {
            if (sAidManager == null) {
                sAidManager = new AidManager(context);
            }
            aidManager = sAidManager;
        }
        return aidManager;
    }

    private AidManager(Context context) {
        this.mContext = context;
    }

    public void requestAid(String appName, String token, String utdid, AidCallback callback) {
        boolean z = false;
        if (callback == null) {
            Log.e(TAG, "callback is null!");
        } else if (this.mContext == null || StringUtils.isEmpty(appName) || StringUtils.isEmpty(token)) {
            boolean z2;
            String str = TAG;
            StringBuilder append = new StringBuilder("mContext:").append(this.mContext).append("; callback:").append(callback).append("; has appName:");
            if (StringUtils.isEmpty(appName)) {
                z2 = false;
            } else {
                z2 = true;
            }
            StringBuilder append2 = append.append(z2).append("; has token:");
            if (!StringUtils.isEmpty(token)) {
                z = true;
            }
            Log.e(str, append2.append(z).toString());
            callback.onAidEventChanged(AidConstants.EVENT_REQUEST_FAILED, Constants.STR_EMPTY);
        } else {
            String aid = AidStorageController.getAidValueFromSP(this.mContext, appName, token);
            if (!StringUtils.isEmpty(aid) && TimeUtils.isUpToDate(AidStorageController.getAidGenTimeFromSP(this.mContext, appName, token), NUM_DAY_OUT_OF_DATE)) {
                callback.onAidEventChanged(AidConstants.EVENT_REQUEST_SUCCESS, aid);
            } else if (NetworkUtils.isConnected(this.mContext)) {
                AidRequester.getInstance(this.mContext).postRestAsync(appName, token, utdid, aid, callback);
            } else {
                callback.onAidEventChanged(AidConstants.EVENT_NETWORK_ERROR, aid);
            }
        }
    }

    public String getValue(String appName, String token, String utdid) {
        boolean z = false;
        if (this.mContext == null || StringUtils.isEmpty(appName) || StringUtils.isEmpty(token)) {
            String str = TAG;
            StringBuilder append = new StringBuilder("mContext:").append(this.mContext).append("; has appName:").append(!StringUtils.isEmpty(appName)).append("; has token:");
            if (!StringUtils.isEmpty(token)) {
                z = true;
            }
            Log.e(str, append.append(z).toString());
            return Constants.STR_EMPTY;
        }
        String aid = AidStorageController.getAidValueFromSP(this.mContext, appName, token);
        if ((StringUtils.isEmpty(aid) || !TimeUtils.isUpToDate(AidStorageController.getAidGenTimeFromSP(this.mContext, appName, token), NUM_DAY_OUT_OF_DATE)) && NetworkUtils.isConnected(this.mContext)) {
            return genAidValue(appName, token, utdid);
        }
        return aid;
    }

    private synchronized String genAidValue(String appName, String token, String utdid) {
        String str;
        if (this.mContext == null) {
            Log.e(TAG, "no context!");
            str = Constants.STR_EMPTY;
        } else {
            str = Constants.STR_EMPTY;
            if (NetworkUtils.isConnected(this.mContext)) {
                str = AidRequester.getInstance(this.mContext).postRest(appName, token, utdid, AidStorageController.getAidValueFromSP(this.mContext, appName, token));
            }
            AidStorageController.setAidValueToSP(this.mContext, appName, str, token);
        }
        return str;
    }
}
