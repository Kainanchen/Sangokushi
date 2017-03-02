package com.tencent.wxop.stat.common;

import android.content.Context;
import com.tencent.wxop.stat.C0625a;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.tencent.wxop.stat.common.b */
public class C0630b {
    static C0632d f2001a;
    private static StatLogger f2002d;
    private static JSONObject f2003e;
    Integer f2004b;
    String f2005c;

    static {
        f2002d = C0639k.m2401b();
        f2003e = new JSONObject();
    }

    public C0630b(Context context) {
        this.f2004b = null;
        this.f2005c = null;
        try {
            C0630b.m2369a(context);
            this.f2004b = C0639k.m2420m(context.getApplicationContext());
            this.f2005c = C0625a.m2283a(context).m2292b();
        } catch (Throwable th) {
            f2002d.m2360e(th);
        }
    }

    static synchronized C0632d m2369a(Context context) {
        C0632d c0632d;
        synchronized (C0630b.class) {
            if (f2001a == null) {
                f2001a = new C0632d(null);
            }
            c0632d = f2001a;
        }
        return c0632d;
    }

    public static void m2370a(Context context, Map<String, String> map) {
        if (map != null) {
            for (Entry entry : new HashMap(map).entrySet()) {
                f2003e.put((String) entry.getKey(), entry.getValue());
            }
        }
    }

    public void m2371a(JSONObject jSONObject, Thread thread) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (f2001a != null) {
                f2001a.m2372a(jSONObject2, thread);
            }
            C0645q.m2449a(jSONObject2, "cn", this.f2005c);
            if (this.f2004b != null) {
                jSONObject2.put("tn", this.f2004b);
            }
            if (thread == null) {
                jSONObject.put("ev", jSONObject2);
            } else {
                jSONObject.put("errkv", jSONObject2.toString());
            }
            if (f2003e != null && f2003e.length() > 0) {
                jSONObject.put("eva", f2003e);
            }
        } catch (Throwable th) {
            f2002d.m2360e(th);
        }
    }
}
