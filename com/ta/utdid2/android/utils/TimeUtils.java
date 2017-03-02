package com.ta.utdid2.android.utils;

import android.util.Log;
import com.igexin.getuiext.data.Consts;

public class TimeUtils {
    public static final String TAG;
    public static final int TOTAL_M_S_ONE_DAY = 86400000;

    static {
        TAG = TimeUtils.class.getName();
    }

    public static boolean isUpToDate(long timeStamp, int diffDay) {
        boolean isUpToDate = (System.currentTimeMillis() - timeStamp) / Consts.TIME_24HOUR < ((long) diffDay);
        if (DebugUtils.DBG) {
            Log.d(TAG, "isUpToDate: " + isUpToDate + "; oldTimestamp: " + timeStamp + "; currentTimestamp" + System.currentTimeMillis());
        }
        return isUpToDate;
    }
}
