package com.igexin.push.core.p051e;

import android.content.Intent;
import com.igexin.push.core.C0483g;
import com.igexin.sdk.PushActivity;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.igexin.push.core.e.b */
public class C0480b {
    private static C0480b f1273b;
    private Map f1274a;

    public C0480b() {
        this.f1274a = new HashMap();
    }

    public static C0480b m1688a() {
        if (f1273b == null) {
            f1273b = new C0480b();
        }
        return f1273b;
    }

    private void m1689d(C0479a c0479a) {
        if (c0479a != null) {
            this.f1274a.put(c0479a.m1672a(), c0479a);
        }
    }

    public C0479a m1690a(Long l) {
        return (C0479a) this.f1274a.get(l);
    }

    public void m1691a(C0479a c0479a) {
        if (c0479a != null) {
            m1689d(c0479a);
            Intent intent = new Intent(C0483g.f1321g, PushActivity.class);
            intent.putExtra("activityid", c0479a.m1672a());
            intent.setFlags(268435456);
            C0483g.f1321g.startActivity(intent);
        }
    }

    public void m1692b(C0479a c0479a) {
        if (c0479a != null) {
            c0479a.m1687i();
            m1693c(c0479a);
        }
    }

    public void m1693c(C0479a c0479a) {
        if (c0479a != null) {
            this.f1274a.remove(c0479a.m1672a());
        }
    }
}
