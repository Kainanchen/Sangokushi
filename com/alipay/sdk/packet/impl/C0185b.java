package com.alipay.sdk.packet.impl;

import com.alipay.sdk.packet.C0182d;
import com.tencent.open.utils.SystemUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.alipay.sdk.packet.impl.b */
public final class C0185b extends C0182d {
    protected final String m577b() {
        return SystemUtils.QQ_VERSION_NAME_5_0_0;
    }

    protected final JSONObject m576a() throws JSONException {
        return C0182d.m555a("sdkConfig", "obtain");
    }
}
