package com.igexin.push.core.p050d;

import com.igexin.push.core.C0483g;
import com.igexin.push.core.bean.PushTaskBean;
import com.igexin.push.p040c.p043c.C0352a;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.igexin.push.core.d.e */
class C0471e extends TimerTask {
    final /* synthetic */ PushTaskBean f1257a;
    final /* synthetic */ C0352a f1258b;
    final /* synthetic */ C0469c f1259c;

    C0471e(C0469c c0469c, PushTaskBean pushTaskBean, C0352a c0352a) {
        this.f1259c = c0469c;
        this.f1257a = pushTaskBean;
        this.f1258b = c0352a;
    }

    public void run() {
        if (C0483g.ak.containsKey(this.f1257a.getTaskId())) {
            ((Timer) C0483g.ak.get(this.f1257a.getTaskId())).cancel();
            C0483g.ak.remove(this.f1257a.getTaskId());
        }
        this.f1259c.m1650a(this.f1257a, this.f1258b);
        this.f1258b.m1180b(this.f1258b.m1181c() + 1);
    }
}
