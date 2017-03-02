package com.tencent.open.web.security;

import com.tencent.connect.common.Constants;
import com.tencent.open.ProGuard.ProGuard;

/* compiled from: ProGuard */
public class SecureJsInterface extends ProGuard {
    public static boolean isPWDEdit;
    private String f1752a;

    static {
        isPWDEdit = false;
    }

    public boolean customCallback() {
        return true;
    }

    public void curPosFromJS(String str) {
        com.tencent.open.p067a.ProGuard.m2117b("openSDK_LOG.SecureJsInterface", "-->curPosFromJS: " + str);
        int i = -1;
        try {
            i = Integer.parseInt(str);
        } catch (Throwable e) {
            com.tencent.open.p067a.ProGuard.m2118b("openSDK_LOG.SecureJsInterface", "-->curPosFromJS number format exception.", e);
        }
        if (i < 0) {
            throw new RuntimeException("position is illegal.");
        }
        if (ProGuard.f1755c) {
        }
        if (!ProGuard.f1754b) {
            this.f1752a = ProGuard.f1753a;
            JniInterface.insetTextToArray(i, this.f1752a, this.f1752a.length());
            com.tencent.open.p067a.ProGuard.m2114a("openSDK_LOG.SecureJsInterface", "curPosFromJS mKey: " + this.f1752a);
        } else if (Boolean.valueOf(JniInterface.BackSpaceChar(ProGuard.f1754b, i)).booleanValue()) {
            ProGuard.f1754b = false;
        }
    }

    public void isPasswordEdit(String str) {
        com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.SecureJsInterface", "-->is pswd edit, flag: " + str);
        int i = -1;
        try {
            i = Integer.parseInt(str);
        } catch (Exception e) {
            com.tencent.open.p067a.ProGuard.m2122e("openSDK_LOG.SecureJsInterface", "-->is pswd edit exception: " + e.getMessage());
        }
        if (i != 0 && i != 1) {
            throw new RuntimeException("is pswd edit flag is illegal.");
        } else if (i == 0) {
            isPWDEdit = false;
        } else if (i == 1) {
            isPWDEdit = true;
        }
    }

    public void clearAllEdit() {
        com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.SecureJsInterface", "-->clear all edit.");
        try {
            JniInterface.clearAllPWD();
        } catch (Throwable e) {
            com.tencent.open.p067a.ProGuard.m2122e("openSDK_LOG.SecureJsInterface", "-->clear all edit exception: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public String getMD5FromNative() {
        com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.SecureJsInterface", "-->get md5 form native");
        String str = Constants.STR_EMPTY;
        try {
            str = JniInterface.getPWDKeyToMD5(null);
            com.tencent.open.p067a.ProGuard.m2114a("openSDK_LOG.SecureJsInterface", "-->getMD5FromNative, MD5= " + str);
            return str;
        } catch (Throwable e) {
            com.tencent.open.p067a.ProGuard.m2122e("openSDK_LOG.SecureJsInterface", "-->get md5 form native exception: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
