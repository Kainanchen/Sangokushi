package com.tencent.p055a.p056a.p057a.p058a;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.tencent.a.a.a.a.g */
public final class C0579g {
    private static C0579g f1457V;
    private Map<Integer, C0574f> f1458U;
    private int f1459b;
    private Context f1460c;

    static {
        f1457V = null;
    }

    private C0579g(Context context) {
        this.f1458U = null;
        this.f1459b = 0;
        this.f1460c = null;
        this.f1460c = context.getApplicationContext();
        this.f1458U = new HashMap(3);
        this.f1458U.put(Integer.valueOf(1), new C0578e(context));
        this.f1458U.put(Integer.valueOf(2), new C0575b(context));
        this.f1458U.put(Integer.valueOf(4), new C0577d(context));
    }

    public static synchronized C0579g m1921E(Context context) {
        C0579g c0579g;
        synchronized (C0579g.class) {
            if (f1457V == null) {
                f1457V = new C0579g(context);
            }
            c0579g = f1457V;
        }
        return c0579g;
    }

    private C0576c m1922b(List<Integer> list) {
        if (list.size() >= 0) {
            for (Integer num : list) {
                C0574f c0574f = (C0574f) this.f1458U.get(num);
                if (c0574f != null) {
                    C0576c o = c0574f.m1908o();
                    if (o != null && C0580h.m1931c(o.f1456c)) {
                        return o;
                    }
                }
            }
        }
        return new C0576c();
    }

    public final void m1923a(String str) {
        C0576c p = m1924p();
        p.f1456c = str;
        if (!C0580h.m1930b(p.f1454a)) {
            p.f1454a = C0580h.m1925a(this.f1460c);
        }
        if (!C0580h.m1930b(p.f1455b)) {
            p.f1455b = C0580h.m1929b(this.f1460c);
        }
        p.f1453T = System.currentTimeMillis();
        for (Entry value : this.f1458U.entrySet()) {
            ((C0574f) value.getValue()).m1904a(p);
        }
    }

    public final C0576c m1924p() {
        return m1922b(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(4)})));
    }
}
