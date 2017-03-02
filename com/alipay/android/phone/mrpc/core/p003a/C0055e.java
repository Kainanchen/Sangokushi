package com.alipay.android.phone.mrpc.core.p003a;

import com.alipay.android.phone.mrpc.core.RpcException;
import com.alipay.p000a.p001a.C0042f;
import com.tencent.connect.common.Constants;
import com.zkunity.app.ResourceIDs;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: com.alipay.android.phone.mrpc.core.a.e */
public final class C0055e extends C0053b {
    private int f11c;
    private Object f12d;

    public C0055e(int i, String str, Object obj) {
        super(str, obj);
        this.f11c = i;
    }

    public final void m43a(Object obj) {
        this.f12d = obj;
    }

    public final byte[] m44a() {
        try {
            List arrayList = new ArrayList();
            if (this.f12d != null) {
                arrayList.add(new BasicNameValuePair("extParam", C0042f.m20a(this.f12d)));
            }
            arrayList.add(new BasicNameValuePair("operationType", this.a));
            arrayList.add(new BasicNameValuePair(ResourceIDs.ID, this.f11c));
            new StringBuilder("mParams is:").append(this.b);
            arrayList.add(new BasicNameValuePair("requestData", this.b == null ? "[]" : C0042f.m20a(this.b)));
            return URLEncodedUtils.format(arrayList, "utf-8").getBytes();
        } catch (Throwable e) {
            Throwable th = e;
            throw new RpcException(Integer.valueOf(9), new StringBuilder("request  =").append(this.b).append(":").append(th).toString() == null ? Constants.STR_EMPTY : th.getMessage(), th);
        }
    }
}
