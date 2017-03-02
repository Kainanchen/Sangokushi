package com.alipay.sdk.auth;

public class APAuthInfo {
    private String f277a;
    private String f278b;
    private String f279c;
    private String f280d;

    public APAuthInfo(String str, String str2, String str3) {
        this(str, str2, str3, null);
    }

    public APAuthInfo(String str, String str2, String str3, String str4) {
        this.f277a = str;
        this.f278b = str2;
        this.f280d = str3;
        this.f279c = str4;
    }

    public String getAppId() {
        return this.f277a;
    }

    public String getProductId() {
        return this.f278b;
    }

    public String getPid() {
        return this.f279c;
    }

    public String getRedirectUri() {
        return this.f280d;
    }
}
