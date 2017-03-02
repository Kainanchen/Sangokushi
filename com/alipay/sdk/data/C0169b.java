package com.alipay.sdk.data;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.packet.C0180b;
import com.alipay.sdk.packet.C0182d;
import com.alipay.sdk.packet.impl.C0185b;
import com.alipay.sdk.sys.C0191b;
import com.alipay.sdk.util.C0202i;
import com.alipay.sdk.util.C0204k;
import com.tencent.connect.common.Constants;
import org.json.JSONObject;

/* renamed from: com.alipay.sdk.data.b */
final class C0169b implements Runnable {
    final /* synthetic */ Context f385a;
    final /* synthetic */ C0168a f386b;

    C0169b(C0168a c0168a, Context context) {
        this.f386b = c0168a;
        this.f385a = context;
    }

    public final void run() {
        try {
            C0182d c0185b = new C0185b();
            Context context = this.f385a;
            C0180b a = c0185b.m561a(context, Constants.STR_EMPTY, C0204k.m671a(context), true);
            if (a != null) {
                C0168a c0168a = this.f386b;
                Object obj = a.f416b;
                if (!TextUtils.isEmpty(obj)) {
                    try {
                        JSONObject optJSONObject = new JSONObject(obj).optJSONObject(C0168a.f380g);
                        c0168a.f383i = optJSONObject.optInt(C0168a.f379f, C0168a.f374a);
                        c0168a.f384j = optJSONObject.optString(C0168a.f381h, C0168a.f375b).trim();
                    } catch (Throwable th) {
                    }
                }
                C0168a c0168a2 = this.f386b;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C0168a.f379f, c0168a2.m477a());
                    jSONObject.put(C0168a.f381h, c0168a2.f384j);
                    C0202i.m664a(C0191b.m600a().f467a, C0168a.f378e, jSONObject.toString());
                } catch (Exception e) {
                }
            }
        } catch (Throwable th2) {
        }
    }
}
