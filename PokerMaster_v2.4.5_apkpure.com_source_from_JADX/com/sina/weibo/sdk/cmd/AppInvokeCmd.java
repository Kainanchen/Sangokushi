package com.sina.weibo.sdk.cmd;

import com.sina.weibo.sdk.constant.WBPageConstants.ParamKey;
import org.json.JSONObject;

class AppInvokeCmd extends BaseCmd {
    private String appPackage;
    private String scheme;
    private String url;

    public AppInvokeCmd(String str) {
        super(str);
    }

    public AppInvokeCmd(JSONObject jSONObject) {
        super(jSONObject);
    }

    public void initFromJsonObj(JSONObject jSONObject) {
        super.initFromJsonObj(jSONObject);
        this.appPackage = jSONObject.optString("package");
        this.scheme = jSONObject.optString("scheme");
        this.url = jSONObject.optString(ParamKey.URL);
    }

    public String getAppPackage() {
        return this.appPackage;
    }

    public void setAppPackage(String str) {
        this.appPackage = str;
    }

    public String getScheme() {
        return this.scheme;
    }

    public void setScheme(String str) {
        this.scheme = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
