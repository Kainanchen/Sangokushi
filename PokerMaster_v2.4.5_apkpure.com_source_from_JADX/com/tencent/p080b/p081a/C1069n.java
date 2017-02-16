package com.tencent.p080b.p081a;

import android.content.Context;
import android.support.v4.view.PointerIconCompat;
import com.tencent.p080b.p081a.p082a.C1029d;
import com.tencent.p080b.p081a.p083b.C1049l;
import com.tencent.p080b.p081a.p083b.C1054q;
import com.texaspoker.moment.TexasPoker.QuickGameRoomPushMsg;
import com.texaspoker.moment.TexasPoker.SCGameActionRsp;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: com.tencent.b.a.n */
final class C1069n {
    private static volatile long f8205f;
    private C1029d f8206a;
    private C1059d f8207b;
    private boolean f8208c;
    private Context f8209d;
    private long f8210e;

    static {
        f8205f = 0;
    }

    public C1069n(C1029d c1029d) {
        this.f8207b = null;
        this.f8208c = false;
        this.f8209d = null;
        this.f8210e = System.currentTimeMillis();
        this.f8206a = c1029d;
        this.f8207b = C1058c.m5747a();
        this.f8208c = c1029d.m5633e();
        this.f8209d = c1029d.m5632d();
    }

    private void m5823a(ah ahVar) {
        ai.m5656b(C1060e.f8181t).m5657a(this.f8206a, ahVar);
    }

    private void m5825b() {
        if (C1073r.m5834a().f8218b <= 0 || !C1058c.f8139m) {
            m5823a(new C1072q(this));
            return;
        }
        C1073r.m5834a().m5859a(this.f8206a, null, this.f8208c, true);
        C1073r.m5834a().m5858a(-1);
    }

    public final void m5827a() {
        boolean z;
        long k;
        if (C1058c.f8134h > 0) {
            if (this.f8210e > C1060e.f8169h) {
                C1060e.f8168g.clear();
                C1060e.f8169h = this.f8210e + C1058c.f8135i;
                if (C1058c.m5762b()) {
                    C1060e.f8178q.m5662a("clear methodsCalledLimitMap, nextLimitCallClearTime=" + C1060e.f8169h);
                }
            }
            Integer valueOf = Integer.valueOf(this.f8206a.m5630b().f7981j);
            Integer num = (Integer) C1060e.f8168g.get(valueOf);
            if (num != null) {
                C1060e.f8168g.put(valueOf, Integer.valueOf(num.intValue() + 1));
                if (num.intValue() > C1058c.f8134h) {
                    if (C1058c.m5762b()) {
                        C1060e.f8178q.m5668e("event " + this.f8206a.m5634f() + " was discard, cause of called limit, current:" + num + ", limit:" + C1058c.f8134h + ", period:" + C1058c.f8135i + " ms");
                    }
                    z = true;
                    if (z) {
                        if (C1058c.f8140n > 0 && this.f8210e >= f8205f) {
                            C1060e.m5801c(this.f8209d);
                            f8205f = this.f8210e + C1058c.f8141o;
                            if (C1058c.m5762b()) {
                                C1060e.f8178q.m5662a("nextFlushTime=" + f8205f);
                            }
                        }
                        if (C1062g.m5813a(this.f8209d).m5818b()) {
                            C1073r.m5835a(this.f8209d).m5859a(this.f8206a, null, this.f8208c, false);
                            return;
                        }
                        if (C1058c.m5762b()) {
                            C1060e.f8178q.m5662a("sendFailedCount=" + C1060e.f8162a);
                        }
                        if (C1060e.m5795a()) {
                            if (this.f8206a.f7961m != null && this.f8206a.f7961m.f8185d) {
                                this.f8207b = C1059d.INSTANT;
                            }
                            if (C1058c.f8136j && C1062g.m5813a(C1060e.f8181t).m5817a()) {
                                this.f8207b = C1059d.INSTANT;
                            }
                            if (C1058c.m5762b()) {
                                C1060e.f8178q.m5662a("strategy=" + this.f8207b.name());
                            }
                            switch (C1065j.f8199a[this.f8207b.ordinal()]) {
                                case SQLiteDatabase.OPEN_READONLY /*1*/:
                                    m5825b();
                                case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                                    C1073r.m5835a(this.f8209d).m5859a(this.f8206a, null, this.f8208c, false);
                                    if (C1058c.m5762b()) {
                                        C1060e.f8178q.m5662a("PERIOD currTime=" + this.f8210e + ",nextPeriodSendTs=" + C1060e.f8164c + ",difftime=" + (C1060e.f8164c - this.f8210e));
                                    }
                                    if (C1060e.f8164c == 0) {
                                        C1060e.f8164c = C1054q.m5729a(this.f8209d, "last_period_ts");
                                        if (this.f8210e > C1060e.f8164c) {
                                            C1060e.m5803d(this.f8209d);
                                        }
                                        k = this.f8210e + ((long) ((C1058c.m5776k() * 60) * PointerIconCompat.TYPE_DEFAULT));
                                        if (C1060e.f8164c > k) {
                                            C1060e.f8164c = k;
                                        }
                                        ad.m5650a(this.f8209d).m5651a();
                                    }
                                    if (C1058c.m5762b()) {
                                        C1060e.f8178q.m5662a("PERIOD currTime=" + this.f8210e + ",nextPeriodSendTs=" + C1060e.f8164c + ",difftime=" + (C1060e.f8164c - this.f8210e));
                                    }
                                    if (this.f8210e > C1060e.f8164c) {
                                        C1060e.m5803d(this.f8209d);
                                    }
                                case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                                case SQLiteDatabase.CONFLICT_IGNORE /*4*/:
                                    C1073r.m5835a(this.f8209d).m5859a(this.f8206a, null, this.f8208c, false);
                                case SQLiteDatabase.CONFLICT_REPLACE /*5*/:
                                    C1073r.m5835a(this.f8209d).m5859a(this.f8206a, new C1070o(this), this.f8208c, true);
                                case SCGameActionRsp.LBETTINGID_FIELD_NUMBER /*6*/:
                                    if (C1062g.m5813a(C1060e.f8181t).f8189b != 1) {
                                        m5825b();
                                    } else {
                                        C1073r.m5835a(this.f8209d).m5859a(this.f8206a, null, this.f8208c, false);
                                    }
                                case QuickGameRoomPushMsg.STFROMUSER_FIELD_NUMBER /*7*/:
                                    if (C1049l.m5699e(this.f8209d)) {
                                        m5823a(new C1071p(this));
                                    }
                                default:
                                    C1060e.f8178q.m5667d("Invalid stat strategy:" + C1058c.m5747a());
                            }
                        }
                        C1073r.m5835a(this.f8209d).m5859a(this.f8206a, null, this.f8208c, false);
                        if (this.f8210e - C1060e.f8163b > 1800000) {
                            C1060e.m5792a(this.f8209d);
                            return;
                        }
                        return;
                    }
                }
            }
            C1060e.f8168g.put(valueOf, Integer.valueOf(1));
        }
        z = false;
        if (z) {
            C1060e.m5801c(this.f8209d);
            f8205f = this.f8210e + C1058c.f8141o;
            if (C1058c.m5762b()) {
                C1060e.f8178q.m5662a("nextFlushTime=" + f8205f);
            }
            if (C1062g.m5813a(this.f8209d).m5818b()) {
                C1073r.m5835a(this.f8209d).m5859a(this.f8206a, null, this.f8208c, false);
                return;
            }
            if (C1058c.m5762b()) {
                C1060e.f8178q.m5662a("sendFailedCount=" + C1060e.f8162a);
            }
            if (C1060e.m5795a()) {
                C1073r.m5835a(this.f8209d).m5859a(this.f8206a, null, this.f8208c, false);
                if (this.f8210e - C1060e.f8163b > 1800000) {
                    C1060e.m5792a(this.f8209d);
                    return;
                }
                return;
            }
            this.f8207b = C1059d.INSTANT;
            this.f8207b = C1059d.INSTANT;
            if (C1058c.m5762b()) {
                C1060e.f8178q.m5662a("strategy=" + this.f8207b.name());
            }
            switch (C1065j.f8199a[this.f8207b.ordinal()]) {
                case SQLiteDatabase.OPEN_READONLY /*1*/:
                    m5825b();
                case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                    C1073r.m5835a(this.f8209d).m5859a(this.f8206a, null, this.f8208c, false);
                    if (C1058c.m5762b()) {
                        C1060e.f8178q.m5662a("PERIOD currTime=" + this.f8210e + ",nextPeriodSendTs=" + C1060e.f8164c + ",difftime=" + (C1060e.f8164c - this.f8210e));
                    }
                    if (C1060e.f8164c == 0) {
                        C1060e.f8164c = C1054q.m5729a(this.f8209d, "last_period_ts");
                        if (this.f8210e > C1060e.f8164c) {
                            C1060e.m5803d(this.f8209d);
                        }
                        k = this.f8210e + ((long) ((C1058c.m5776k() * 60) * PointerIconCompat.TYPE_DEFAULT));
                        if (C1060e.f8164c > k) {
                            C1060e.f8164c = k;
                        }
                        ad.m5650a(this.f8209d).m5651a();
                    }
                    if (C1058c.m5762b()) {
                        C1060e.f8178q.m5662a("PERIOD currTime=" + this.f8210e + ",nextPeriodSendTs=" + C1060e.f8164c + ",difftime=" + (C1060e.f8164c - this.f8210e));
                    }
                    if (this.f8210e > C1060e.f8164c) {
                        C1060e.m5803d(this.f8209d);
                    }
                case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                case SQLiteDatabase.CONFLICT_IGNORE /*4*/:
                    C1073r.m5835a(this.f8209d).m5859a(this.f8206a, null, this.f8208c, false);
                case SQLiteDatabase.CONFLICT_REPLACE /*5*/:
                    C1073r.m5835a(this.f8209d).m5859a(this.f8206a, new C1070o(this), this.f8208c, true);
                case SCGameActionRsp.LBETTINGID_FIELD_NUMBER /*6*/:
                    if (C1062g.m5813a(C1060e.f8181t).f8189b != 1) {
                        C1073r.m5835a(this.f8209d).m5859a(this.f8206a, null, this.f8208c, false);
                    } else {
                        m5825b();
                    }
                case QuickGameRoomPushMsg.STFROMUSER_FIELD_NUMBER /*7*/:
                    if (C1049l.m5699e(this.f8209d)) {
                        m5823a(new C1071p(this));
                    }
                default:
                    C1060e.f8178q.m5667d("Invalid stat strategy:" + C1058c.m5747a());
            }
        }
    }
}
