package com.illuminate.texaspoker.utils.p056a;

import com.tencent.android.tpush.common.Constants;
import org.json.JSONObject;

/* renamed from: com.illuminate.texaspoker.utils.a.g */
public final class Purchase {
    String f6639a;
    String f6640b;
    String f6641c;
    String f6642d;
    long f6643e;
    int f6644f;
    public String f6645g;
    String f6646h;
    public String f6647i;
    public String f6648j;

    public Purchase(String str, String str2, String str3) {
        this.f6639a = str;
        this.f6647i = str2;
        JSONObject jSONObject = new JSONObject(this.f6647i);
        this.f6640b = jSONObject.optString("orderId");
        this.f6641c = jSONObject.optString(Constants.FLAG_PACKAGE_NAME);
        this.f6642d = jSONObject.optString("productId");
        this.f6643e = jSONObject.optLong("purchaseTime");
        this.f6644f = jSONObject.optInt("purchaseState");
        this.f6645g = jSONObject.optString("developerPayload");
        this.f6646h = jSONObject.optString(Constants.FLAG_TOKEN, jSONObject.optString("purchaseToken"));
        this.f6648j = str3;
    }

    public final String toString() {
        return "PurchaseInfo(type:" + this.f6639a + "):" + this.f6647i;
    }
}
