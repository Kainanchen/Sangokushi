package com.zkunity.log;

import android.util.Log;

public class ZLogger {
    private static String logTag;

    static {
        logTag = "ZLogger-logInfo";
    }

    public static void printLog(String logInfo) {
        Log.e(logTag, logInfo);
    }
}
