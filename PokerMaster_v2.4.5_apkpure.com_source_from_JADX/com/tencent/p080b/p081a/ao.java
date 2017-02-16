package com.tencent.p080b.p081a;

import android.content.Context;
import com.tencent.p080b.p081a.p082a.C1029d;
import com.tencent.p080b.p081a.p082a.C1030a;
import com.tencent.p080b.p081a.p082a.C1031b;

/* renamed from: com.tencent.b.a.ao */
final class ao implements Runnable {
    final /* synthetic */ Context f8017a;
    final /* synthetic */ C1061f f8018b;
    final /* synthetic */ C1031b f8019c;

    ao(Context context, C1031b c1031b) {
        this.f8017a = context;
        this.f8018b = null;
        this.f8019c = c1031b;
    }

    public final void run() {
        try {
            C1029d c1030a = new C1030a(this.f8017a, C1060e.m5788a(this.f8017a, this.f8018b), this.f8019c.f7964a, this.f8018b);
            c1030a.m5635a().f7966c = this.f8019c.f7966c;
            new C1069n(c1030a).m5827a();
        } catch (Throwable th) {
            C1060e.f8178q.m5665b(th);
            C1060e.m5794a(this.f8017a, th);
        }
    }
}
