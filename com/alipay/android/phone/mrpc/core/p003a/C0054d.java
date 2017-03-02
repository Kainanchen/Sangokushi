package com.alipay.android.phone.mrpc.core.p003a;

import com.alipay.android.phone.mrpc.core.RpcException;
import com.alipay.p000a.p001a.C0041e;
import com.alipay.sdk.util.C0203j;
import com.tencent.connect.common.Constants;
import com.ut.device.AidConstants;
import java.lang.reflect.Type;
import org.json.JSONObject;

/* renamed from: com.alipay.android.phone.mrpc.core.a.d */
public final class C0054d extends C0051a {
    public C0054d(Type type, byte[] bArr) {
        super(type, bArr);
    }

    public final Object m42a() {
        try {
            String str = new String(this.b);
            new StringBuilder("threadid = ").append(Thread.currentThread().getId()).append("; rpc response:  ").append(str);
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt(C0203j.f517a);
            if (i == AidConstants.EVENT_REQUEST_STARTED) {
                return this.a == String.class ? jSONObject.optString(C0203j.f519c) : C0041e.m19a(jSONObject.optString(C0203j.f519c), this.a);
            } else {
                throw new RpcException(Integer.valueOf(i), jSONObject.optString("tips"));
            }
        } catch (Exception e) {
            throw new RpcException(Integer.valueOf(10), new StringBuilder("response  =").append(new String(this.b)).append(":").append(e).toString() == null ? Constants.STR_EMPTY : e.getMessage());
        }
    }
}
