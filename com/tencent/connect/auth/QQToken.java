package com.tencent.connect.auth;

/* compiled from: ProGuard */
public class QQToken {
    public static final int AUTH_QQ = 2;
    public static final int AUTH_QZONE = 3;
    public static final int AUTH_WEB = 1;
    private String f1535a;
    private String f1536b;
    private String f1537c;
    private int f1538d;
    private long f1539e;

    public QQToken(String str) {
        this.f1538d = AUTH_WEB;
        this.f1539e = -1;
        this.f1535a = str;
    }

    public boolean isSessionValid() {
        return this.f1536b != null && System.currentTimeMillis() < this.f1539e;
    }

    public String getAppId() {
        return this.f1535a;
    }

    public void setAppId(String str) {
        this.f1535a = str;
    }

    public String getAccessToken() {
        return this.f1536b;
    }

    public void setAccessToken(String str, String str2) throws NumberFormatException {
        this.f1536b = str;
        this.f1539e = 0;
        if (str2 != null) {
            this.f1539e = System.currentTimeMillis() + (Long.parseLong(str2) * 1000);
        }
    }

    public String getOpenId() {
        return this.f1537c;
    }

    public void setOpenId(String str) {
        this.f1537c = str;
    }

    public int getAuthSource() {
        return this.f1538d;
    }

    public void setAuthSource(int i) {
        this.f1538d = i;
    }

    public long getExpireTimeInSecond() {
        return this.f1539e;
    }
}
