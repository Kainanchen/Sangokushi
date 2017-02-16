package com.tencent.android.tpush.stat.p079b;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.tencent.android.tpush.stat.b.h */
class ProGuard {
    private static ProGuard f7862b;
    private Map f7863a;

    private ProGuard(Context context) {
        this.f7863a = null;
        this.f7863a = new HashMap(3);
        this.f7863a.put(Integer.valueOf(1), new ProGuard(context));
        this.f7863a.put(Integer.valueOf(2), new ProGuard(context));
        this.f7863a.put(Integer.valueOf(4), new ProGuard(context));
    }

    static {
        f7862b = null;
    }

    static synchronized ProGuard m5555a(Context context) {
        ProGuard proGuard;
        synchronized (ProGuard.class) {
            if (f7862b == null) {
                f7862b = new ProGuard(context);
            }
            proGuard = f7862b;
        }
        return proGuard;
    }

    ProGuard m5556a() {
        return m5557a(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(4)})));
    }

    ProGuard m5557a(List list) {
        if (list != null && list.size() >= 0) {
            for (Integer num : list) {
                ProGuard proGuard = (ProGuard) this.f7863a.get(num);
                if (proGuard != null) {
                    ProGuard e = proGuard.m5538e();
                    if (e != null && e.m5547a()) {
                        return e;
                    }
                }
            }
        }
        return new ProGuard();
    }

    void m5558a(ProGuard proGuard) {
        for (Entry value : this.f7863a.entrySet()) {
            ((ProGuard) value.getValue()).m5532a(proGuard);
        }
    }
}
