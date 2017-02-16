package com.tencent.p063a.p064a.p065a.p066a;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.tencent.a.a.a.a.g */
public final class C1027g {
    private static C1027g f7177d;
    private Map<Integer, C1022f> f7178a;
    private int f7179b;
    private Context f7180c;

    static {
        f7177d = null;
    }

    private C1027g(Context context) {
        this.f7178a = null;
        this.f7179b = 0;
        this.f7180c = null;
        this.f7180c = context.getApplicationContext();
        this.f7178a = new HashMap(3);
        this.f7178a.put(Integer.valueOf(1), new C1026e(context));
        this.f7178a.put(Integer.valueOf(2), new C1023b(context));
        this.f7178a.put(Integer.valueOf(4), new C1025d(context));
    }

    private C1024c m4644a(List<Integer> list) {
        if (list.size() >= 0) {
            for (Integer num : list) {
                C1022f c1022f = (C1022f) this.f7178a.get(num);
                if (c1022f != null) {
                    C1024c c = c1022f.m4632c();
                    if (c != null && C1028h.m4654b(c.f7175c)) {
                        return c;
                    }
                }
            }
        }
        return new C1024c();
    }

    public static synchronized C1027g m4645a(Context context) {
        C1027g c1027g;
        synchronized (C1027g.class) {
            if (f7177d == null) {
                f7177d = new C1027g(context);
            }
            c1027g = f7177d;
        }
        return c1027g;
    }

    public final C1024c m4646a() {
        return m4644a(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(4)})));
    }

    public final void m4647a(String str) {
        C1024c a = m4646a();
        a.f7175c = str;
        if (!C1028h.m4652a(a.f7173a)) {
            a.f7173a = C1028h.m4648a(this.f7180c);
        }
        if (!C1028h.m4652a(a.f7174b)) {
            a.f7174b = C1028h.m4653b(this.f7180c);
        }
        a.f7176d = System.currentTimeMillis();
        for (Entry value : this.f7178a.entrySet()) {
            ((C1022f) value.getValue()).m4628a(a);
        }
    }
}
