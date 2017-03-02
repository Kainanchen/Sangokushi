package com.loopj.android.http;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.util.Log;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.wxop.stat.StatAccount;
import com.tencent.wxop.stat.common.StatConstants;

public class LogHandler implements LogInterface {
    boolean mLoggingEnabled;
    int mLoggingLevel;

    public LogHandler() {
        this.mLoggingEnabled = true;
        this.mLoggingLevel = 2;
    }

    public boolean isLoggingEnabled() {
        return this.mLoggingEnabled;
    }

    public void setLoggingEnabled(boolean loggingEnabled) {
        this.mLoggingEnabled = loggingEnabled;
    }

    public int getLoggingLevel() {
        return this.mLoggingLevel;
    }

    public void setLoggingLevel(int loggingLevel) {
        this.mLoggingLevel = loggingLevel;
    }

    public boolean shouldLog(int logLevel) {
        return logLevel >= this.mLoggingLevel;
    }

    public void log(int logLevel, String tag, String msg) {
        logWithThrowable(logLevel, tag, msg, null);
    }

    public void logWithThrowable(int logLevel, String tag, String msg, Throwable t) {
        if (isLoggingEnabled() && shouldLog(logLevel)) {
            switch (logLevel) {
                case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                    Log.v(tag, msg, t);
                case StatConstants.STAT_DB_VERSION /*3*/:
                    Log.d(tag, msg, t);
                case StatAccount.WECHAT_OPENID_TYPE /*4*/:
                    Log.i(tag, msg, t);
                case StatAccount.PHONE_NUM_TYPE /*5*/:
                    Log.w(tag, msg, t);
                case StatAccount.EMAIL_TYPE /*6*/:
                    Log.e(tag, msg, t);
                case IMediaObject.TYPE_EMOJI /*8*/:
                    if (Integer.valueOf(VERSION.SDK).intValue() > 8) {
                        checkedWtf(tag, msg, t);
                    } else {
                        Log.e(tag, msg, t);
                    }
                default:
            }
        }
    }

    @TargetApi(8)
    private void checkedWtf(String tag, String msg, Throwable t) {
        Log.wtf(tag, msg, t);
    }

    public void m1898v(String tag, String msg) {
        log(2, tag, msg);
    }

    public void m1899v(String tag, String msg, Throwable t) {
        logWithThrowable(2, tag, msg, t);
    }

    public void m1892d(String tag, String msg) {
        log(2, tag, msg);
    }

    public void m1893d(String tag, String msg, Throwable t) {
        logWithThrowable(3, tag, msg, t);
    }

    public void m1896i(String tag, String msg) {
        log(4, tag, msg);
    }

    public void m1897i(String tag, String msg, Throwable t) {
        logWithThrowable(4, tag, msg, t);
    }

    public void m1900w(String tag, String msg) {
        log(5, tag, msg);
    }

    public void m1901w(String tag, String msg, Throwable t) {
        logWithThrowable(5, tag, msg, t);
    }

    public void m1894e(String tag, String msg) {
        log(6, tag, msg);
    }

    public void m1895e(String tag, String msg, Throwable t) {
        logWithThrowable(6, tag, msg, t);
    }

    public void wtf(String tag, String msg) {
        log(8, tag, msg);
    }

    public void wtf(String tag, String msg, Throwable t) {
        logWithThrowable(8, tag, msg, t);
    }
}
