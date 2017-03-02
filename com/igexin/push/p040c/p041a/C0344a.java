package com.igexin.push.p040c.p041a;

import com.igexin.p022a.p023a.p025d.p026a.C0229f;
import com.igexin.p022a.p023a.p027b.C0234f;
import com.igexin.p022a.p023a.p027b.C0242c;
import com.igexin.p022a.p023a.p027b.C0245e;
import com.igexin.push.p040c.p043c.C0351e;
import com.igexin.push.p040c.p043c.C0352a;
import com.igexin.push.p040c.p043c.C0353b;
import com.igexin.push.p040c.p043c.C0358h;
import com.igexin.push.p040c.p043c.C0361k;
import com.igexin.push.p040c.p043c.C0363m;
import com.igexin.push.p040c.p043c.C0364n;
import com.igexin.push.p040c.p043c.C0365o;
import com.tencent.mm.sdk.constants.ConstantsAPI;
import com.tencent.wxop.stat.StatAccount;

/* renamed from: com.igexin.push.c.a.a */
public class C0344a extends C0242c {
    C0344a(String str, C0242c c0242c) {
        super(str, true);
        m785a(c0242c);
    }

    public Object m1156a(C0234f c0234f, C0245e c0245e, Object obj) {
        if (obj instanceof C0351e) {
            C0351e c0351e = (C0351e) obj;
            C0353b c0353b = new C0353b();
            c0353b.f938b = (byte) c0351e.f928i;
            c0353b.m1183a(c0351e.m1176d());
            c0353b.f939c = c0351e.f929j;
            return c0353b;
        } else if (!(obj instanceof C0351e[])) {
            return null;
        } else {
            C0351e[] c0351eArr = (C0351e[]) obj;
            Object obj2 = new C0353b[c0351eArr.length];
            for (int i = 0; i < c0351eArr.length; i++) {
                obj2[i] = new C0353b();
                obj2[i].f938b = (byte) c0351eArr[i].f928i;
                obj2[i].m1183a(c0351eArr[i].m1176d());
            }
            return obj2;
        }
    }

    public C0229f m1157b(C0234f c0234f, C0245e c0245e, Object obj) {
        C0351e c0351e = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof C0358h) {
            return (C0229f) obj;
        }
        C0353b c0353b = (C0353b) obj;
        switch (c0353b.f938b) {
            case StatAccount.PHONE_NUM_TYPE /*5*/:
                c0351e = new C0361k();
                break;
            case ConstantsAPI.COMMAND_ADD_CARD_TO_EX_CARD_PACKAGE /*9*/:
                c0351e = new C0365o();
                break;
            case (byte) 26:
                c0351e = new C0364n();
                break;
            case (byte) 28:
                c0351e = new C0352a();
                break;
            case (byte) 37:
                c0351e = new C0363m();
                break;
        }
        if (c0351e != null) {
            c0351e.m1174a(c0353b.f940d);
        }
        return c0351e;
    }

    public /* synthetic */ Object m1158c(C0234f c0234f, C0245e c0245e, Object obj) {
        return m1157b(c0234f, c0245e, obj);
    }
}
