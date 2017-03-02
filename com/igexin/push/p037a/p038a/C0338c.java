package com.igexin.push.p037a.p038a;

import com.igexin.push.config.C0378l;
import com.igexin.push.core.C0465c;
import com.igexin.push.core.C0482f;
import com.igexin.push.core.p045a.C0402e;
import com.igexin.push.p035e.p036b.C0335d;
import com.igexin.push.p047d.C0495a;
import java.util.Calendar;

/* renamed from: com.igexin.push.a.a.c */
public class C0338c implements C0335d {
    private static C0338c f900c;
    private long f901a;
    private long f902b;
    private boolean f903d;

    private C0338c() {
        this.f901a = 0;
        this.f902b = 0;
        this.f903d = false;
    }

    public static C0338c m1132c() {
        if (f900c == null) {
            f900c = new C0338c();
        }
        return f900c;
    }

    public void m1133a() {
        m1136d();
    }

    public void m1134a(long j) {
        this.f901a = j;
    }

    public boolean m1135b() {
        return System.currentTimeMillis() - this.f901a > this.f902b;
    }

    public void m1136d() {
        this.f902b = 3600000;
        long currentTimeMillis = System.currentTimeMillis();
        if (C0378l.f1015b != 0) {
            Calendar instance = Calendar.getInstance();
            C0495a c0495a;
            if (C0402e.m1330a().m1363a(currentTimeMillis)) {
                if (!this.f903d) {
                    this.f903d = true;
                    c0495a = new C0495a();
                    c0495a.m1744a(C0465c.stop);
                    C0482f.m1694a().m1713h().m1774a(c0495a);
                }
                if (C0378l.f1014a + C0378l.f1015b > 24) {
                    instance.set(11, (C0378l.f1014a + C0378l.f1015b) - 24);
                } else {
                    instance.set(11, C0378l.f1014a + C0378l.f1015b);
                }
                instance.set(12, 0);
                instance.set(13, 0);
                if (instance.getTimeInMillis() < currentTimeMillis) {
                    instance.add(5, 1);
                }
            } else {
                if (this.f903d) {
                    this.f903d = false;
                    c0495a = new C0495a();
                    c0495a.m1744a(C0465c.start);
                    C0482f.m1694a().m1713h().m1774a(c0495a);
                }
                instance.set(11, C0378l.f1014a);
                instance.set(12, 0);
                instance.set(13, 0);
                if (instance.getTimeInMillis() < currentTimeMillis) {
                    instance.add(5, 1);
                }
            }
            this.f902b = instance.getTimeInMillis() - currentTimeMillis;
        } else if (this.f903d) {
            this.f903d = false;
            C0495a c0495a2 = new C0495a();
            c0495a2.m1744a(C0465c.start);
            C0482f.m1694a().m1713h().m1774a(c0495a2);
        }
        if (C0378l.f1016c > this.f902b + currentTimeMillis) {
            this.f902b = C0378l.f1016c - currentTimeMillis;
            if (!this.f903d) {
                this.f903d = true;
                C0495a c0495a3 = new C0495a();
                c0495a3.m1744a(C0465c.stop);
                C0482f.m1694a().m1713h().m1774a(c0495a3);
            }
        }
    }
}
