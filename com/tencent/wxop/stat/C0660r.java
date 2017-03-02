package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.p069a.C0617d;

/* renamed from: com.tencent.wxop.stat.r */
final class C0660r implements Runnable {
    final /* synthetic */ Throwable f2100a;
    final /* synthetic */ Context f2101b;
    final /* synthetic */ StatSpecifyReportedInfo f2102c;

    C0660r(Throwable th, Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        this.f2100a = th;
        this.f2101b = context;
        this.f2102c = statSpecifyReportedInfo;
    }

    public final void run() {
        if (this.f2100a == null) {
            StatServiceImpl.f1839q.error((Object) "The Throwable error message of StatService.reportException() can not be null!");
        } else {
            new aq(new C0617d(this.f2101b, StatServiceImpl.m2223a(this.f2101b, false, this.f2102c), 1, this.f2100a, this.f2102c)).m2308a();
        }
    }
}
