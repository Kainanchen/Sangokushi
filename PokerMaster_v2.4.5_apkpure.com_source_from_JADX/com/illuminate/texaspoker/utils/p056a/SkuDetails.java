package com.illuminate.texaspoker.utils.p056a;

import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.android.tpush.common.MessageKey;
import org.json.JSONObject;

/* renamed from: com.illuminate.texaspoker.utils.a.i */
public final class SkuDetails {
    String f6649a;
    String f6650b;
    String f6651c;
    public String f6652d;
    String f6653e;
    String f6654f;
    String f6655g;

    public SkuDetails(String str, String str2) {
        this.f6649a = str;
        this.f6655g = str2;
        JSONObject jSONObject = new JSONObject(this.f6655g);
        this.f6650b = jSONObject.optString("productId");
        this.f6651c = jSONObject.optString(MessageKey.MSG_TYPE);
        this.f6652d = jSONObject.optString("price");
        this.f6653e = jSONObject.optString(MessageKey.MSG_TITLE);
        this.f6654f = jSONObject.optString(WBConstants.GAME_PARAMS_DESCRIPTION);
    }

    public final String toString() {
        return "SkuDetails:" + this.f6655g;
    }
}
