package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.p069a.C0619g;

final class am implements Runnable {
    final /* synthetic */ StatGameUser f1930a;
    final /* synthetic */ Context f1931b;
    final /* synthetic */ StatSpecifyReportedInfo f1932c;

    am(StatGameUser statGameUser, Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        this.f1930a = statGameUser;
        this.f1931b = context;
        this.f1932c = statSpecifyReportedInfo;
    }

    public final void run() {
        if (this.f1930a == null) {
            StatServiceImpl.f1839q.error((Object) "The gameUser of StatService.reportGameUser() can not be null!");
        } else if (this.f1930a.getAccount() == null || this.f1930a.getAccount().length() == 0) {
            StatServiceImpl.f1839q.error((Object) "The account of gameUser on StatService.reportGameUser() can not be null or empty!");
        } else {
            try {
                new aq(new C0619g(this.f1931b, StatServiceImpl.m2223a(this.f1931b, false, this.f1932c), this.f1930a, this.f1932c)).m2308a();
            } catch (Throwable th) {
                StatServiceImpl.f1839q.m2360e(th);
                StatServiceImpl.m2229a(this.f1931b, th);
            }
        }
    }
}
