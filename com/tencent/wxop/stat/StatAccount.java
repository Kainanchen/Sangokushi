package com.tencent.wxop.stat;

import com.tencent.connect.common.Constants;
import com.tencent.wxop.stat.common.C0639k;
import com.tencent.wxop.stat.common.C0645q;
import org.json.JSONException;
import org.json.JSONObject;

public class StatAccount {
    public static final int CUSTOM_TYPE = 7;
    public static final int DEFAULT_TYPE = 0;
    public static final int EMAIL_TYPE = 6;
    public static final int PHONE_NUM_TYPE = 5;
    public static final int QQ_NUM_TYPE = 1;
    public static final int QQ_OPENID_TYPE = 3;
    public static final int WECHAT_ID_TYPE = 2;
    public static final int WECHAT_OPENID_TYPE = 4;
    private String f1762a;
    private int f1763b;
    private String f1764c;
    private String f1765d;

    public StatAccount(String str) {
        this.f1762a = Constants.STR_EMPTY;
        this.f1763b = DEFAULT_TYPE;
        this.f1764c = Constants.STR_EMPTY;
        this.f1765d = Constants.STR_EMPTY;
        this.f1762a = str;
    }

    public StatAccount(String str, int i) {
        this.f1762a = Constants.STR_EMPTY;
        this.f1763b = DEFAULT_TYPE;
        this.f1764c = Constants.STR_EMPTY;
        this.f1765d = Constants.STR_EMPTY;
        this.f1762a = str;
        this.f1763b = i;
    }

    public String getAccount() {
        return this.f1762a;
    }

    public int getAccountType() {
        return this.f1763b;
    }

    public String getExt() {
        return this.f1764c;
    }

    public String getExt1() {
        return this.f1765d;
    }

    public void setAccount(String str) {
        this.f1762a = str;
    }

    public void setAccountType(int i) {
        this.f1763b = i;
    }

    public void setExt(String str) {
        this.f1764c = str;
    }

    public void setExt1(String str) {
        this.f1765d = str;
    }

    public String toJsonString() {
        JSONObject jSONObject = new JSONObject();
        if (C0639k.m2405c(this.f1762a)) {
            try {
                C0645q.m2449a(jSONObject, "a", this.f1762a);
                jSONObject.put("t", this.f1763b);
                C0645q.m2449a(jSONObject, "e", this.f1764c);
                C0645q.m2449a(jSONObject, "e1", this.f1765d);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject.toString();
    }

    public String toString() {
        return "StatAccount [account=" + this.f1762a + ", accountType=" + this.f1763b + ", ext=" + this.f1764c + ", ext1=" + this.f1765d + "]";
    }
}
