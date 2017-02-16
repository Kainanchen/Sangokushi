package com.amap.p003a;

import android.content.Context;
import java.util.List;

/* renamed from: com.amap.a.n */
public final class SDKDBOperation {
    DBOperation f688a;
    Context f689b;

    public SDKDBOperation(Context context, boolean z) {
        this.f689b = context;
        this.f688a = SDKDBOperation.m702a(this.f689b, z);
    }

    static DBOperation m702a(Context context, boolean z) {
        try {
            return new DBOperation(context, DBOperation.m675a(LogDBCreator.class));
        } catch (Throwable th) {
            if (z) {
                th.printStackTrace();
                return null;
            }
            cm.m637a(th, "SDKDB", "getDB");
            return null;
        }
    }

    public final List<cj> m703a() {
        List<cj> list = null;
        try {
            list = this.f688a.m681a(cj.m610e(), cj.class, true);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return list;
    }
}
