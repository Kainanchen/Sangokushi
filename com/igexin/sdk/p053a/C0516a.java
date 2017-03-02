package com.igexin.sdk.p053a;

import android.content.Context;
import com.igexin.sdk.IPushCore;

/* renamed from: com.igexin.sdk.a.a */
public class C0516a {
    private static String f1437a;
    private static C0516a f1438c;
    private IPushCore f1439b;

    static {
        f1437a = "PushSdk";
    }

    private C0516a() {
    }

    public static C0516a m1869a() {
        if (f1438c == null) {
            f1438c = new C0516a();
        }
        return f1438c;
    }

    public void m1870a(IPushCore iPushCore) {
        this.f1439b = iPushCore;
    }

    public boolean m1871a(Context context) {
        try {
            IPushCore iPushCore = (IPushCore) context.getClassLoader().loadClass("com.igexin.push.core.stub.PushCore").newInstance();
            if (iPushCore != null) {
                m1870a(iPushCore);
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public IPushCore m1872b() {
        return this.f1439b;
    }
}
