package com.alipay.sdk.packet.impl;

import android.content.Context;
import com.alipay.sdk.packet.C0180b;
import com.alipay.sdk.packet.C0182d;
import com.loopj.android.http.RequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.alipay.sdk.packet.impl.c */
public final class C0186c extends C0182d {
    public static final String f441t = "log_v";

    protected final List<Header> m580a(boolean z, String str) {
        List<Header> arrayList = new ArrayList();
        arrayList.add(new BasicHeader(C0182d.f419a, String.valueOf(z)));
        arrayList.add(new BasicHeader(C0182d.f422d, RequestParams.APPLICATION_OCTET_STREAM));
        arrayList.add(new BasicHeader(C0182d.f425g, "CBC"));
        return arrayList;
    }

    protected final String m582c() throws JSONException {
        HashMap hashMap = new HashMap();
        hashMap.put(C0182d.f427i, "/sdk/log");
        hashMap.put(C0182d.f428j, "1.0.0");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(f441t, "1.0");
        return C0182d.m553a(hashMap, hashMap2);
    }

    protected final JSONObject m581a() throws JSONException {
        return null;
    }

    protected final String m579a(String str, JSONObject jSONObject) {
        return str;
    }

    public final C0180b m578a(Context context, String str) throws Throwable {
        return m561a(context, str, "http://mcgw.alipay.com/sdklog.do", true);
    }
}
