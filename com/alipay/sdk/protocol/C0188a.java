package com.alipay.sdk.protocol;

import android.text.TextUtils;
import com.igexin.sdk.PushBuildConfig;

/* renamed from: com.alipay.sdk.protocol.a */
public enum C0188a {
    None(PushBuildConfig.sdk_conf_debug_level),
    WapPay("js://wappay"),
    Update("js://update");
    
    private String f446d;

    private C0188a(String str) {
        this.f446d = str;
    }

    public static C0188a m584a(String str) {
        if (TextUtils.isEmpty(str)) {
            return None;
        }
        C0188a c0188a = None;
        for (C0188a c0188a2 : C0188a.values()) {
            if (str.startsWith(c0188a2.f446d)) {
                return c0188a2;
            }
        }
        return c0188a;
    }
}
