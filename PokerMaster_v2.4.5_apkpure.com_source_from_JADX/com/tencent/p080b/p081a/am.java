package com.tencent.p080b.p081a;

import android.content.Context;
import com.tencent.p080b.p081a.p082a.C1032c;
import com.tencent.p080b.p081a.p082a.C1034f;

/* renamed from: com.tencent.b.a.am */
final class am implements Runnable {
    final /* synthetic */ Context f8015a;
    final /* synthetic */ Throwable f8016b;

    am(Context context, Throwable th) {
        this.f8015a = context;
        this.f8016b = th;
    }

    public final void run() {
        try {
            if (C1058c.m5765c()) {
                new C1069n(new C1032c(this.f8015a, C1060e.m5788a(this.f8015a, null), this.f8016b, C1034f.f7982a)).m5827a();
            }
        } catch (Throwable th) {
            C1060e.f8178q.m5668e("reportSdkSelfException error: " + th);
        }
    }
}
