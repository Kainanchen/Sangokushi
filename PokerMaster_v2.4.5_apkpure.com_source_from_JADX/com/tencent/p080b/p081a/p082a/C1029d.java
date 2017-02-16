package com.tencent.p080b.p081a.p082a;

import android.content.Context;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.p063a.p064a.p065a.p066a.C1028h;
import com.tencent.p080b.p081a.C1058c;
import com.tencent.p080b.p081a.C1061f;
import com.tencent.p080b.p081a.C1073r;
import com.tencent.p080b.p081a.p083b.C1040c;
import com.tencent.p080b.p081a.p083b.C1049l;
import com.tencent.p080b.p081a.p083b.C1055r;
import org.json.JSONObject;

/* renamed from: com.tencent.b.a.a.d */
public abstract class C1029d {
    protected static String f7950j;
    protected String f7951b;
    protected long f7952c;
    protected int f7953d;
    protected C1040c f7954e;
    protected int f7955f;
    protected String f7956g;
    protected String f7957h;
    protected String f7958i;
    protected boolean f7959k;
    protected Context f7960l;
    public C1061f f7961m;

    static {
        f7950j = null;
    }

    C1029d(Context context, int i, C1061f c1061f) {
        this.f7951b = null;
        this.f7954e = null;
        this.f7956g = null;
        this.f7957h = null;
        this.f7958i = null;
        this.f7959k = false;
        this.f7961m = null;
        this.f7960l = context;
        this.f7952c = System.currentTimeMillis() / 1000;
        this.f7953d = i;
        this.f7957h = C1058c.m5759b(context);
        this.f7958i = C1049l.m5706i(context);
        this.f7951b = C1058c.m5748a(context);
        if (c1061f != null) {
            this.f7961m = c1061f;
            if (C1049l.m5695c(c1061f.f8182a)) {
                this.f7951b = c1061f.f8182a;
            }
            if (C1049l.m5695c(c1061f.f8183b)) {
                this.f7957h = c1061f.f8183b;
            }
            if (C1049l.m5695c(c1061f.f8184c)) {
                this.f7958i = c1061f.f8184c;
            }
            this.f7959k = c1061f.f8186e;
        }
        this.f7956g = C1058c.m5767d(context);
        this.f7954e = C1073r.m5835a(context).m5860b(context);
        if (m5630b() != C1033e.NETWORK_DETECTOR) {
            this.f7955f = C1049l.m5715p(context).intValue();
        } else {
            this.f7955f = -C1033e.NETWORK_DETECTOR.f7981j;
        }
        if (!C1028h.m4654b(f7950j)) {
            String e = C1058c.m5770e(context);
            f7950j = e;
            if (!C1049l.m5695c(e)) {
                f7950j = "0";
            }
        }
    }

    private boolean m5628b(JSONObject jSONObject) {
        boolean z = false;
        try {
            C1055r.m5737a(jSONObject, "ky", this.f7951b);
            jSONObject.put("et", m5630b().f7981j);
            if (this.f7954e != null) {
                jSONObject.put("ui", this.f7954e.f8025a);
                C1055r.m5737a(jSONObject, "mc", this.f7954e.f8026b);
                int i = this.f7954e.f8027c;
                jSONObject.put("ut", i);
                if (i == 0 && C1049l.m5718s(this.f7960l) == 1) {
                    jSONObject.put("ia", 1);
                }
            }
            C1055r.m5737a(jSONObject, "cui", this.f7956g);
            if (m5630b() != C1033e.SESSION_ENV) {
                C1055r.m5737a(jSONObject, "av", this.f7958i);
                C1055r.m5737a(jSONObject, "ch", this.f7957h);
            }
            if (this.f7959k) {
                jSONObject.put("impt", 1);
            }
            C1055r.m5737a(jSONObject, "mid", f7950j);
            jSONObject.put("idx", this.f7955f);
            jSONObject.put("si", this.f7953d);
            jSONObject.put("ts", this.f7952c);
            jSONObject.put("dts", C1049l.m5681a(this.f7960l, false));
            z = m5629a(jSONObject);
        } catch (Throwable th) {
        }
        return z;
    }

    public abstract boolean m5629a(JSONObject jSONObject);

    public abstract C1033e m5630b();

    public final long m5631c() {
        return this.f7952c;
    }

    public final Context m5632d() {
        return this.f7960l;
    }

    public final boolean m5633e() {
        return this.f7959k;
    }

    public final String m5634f() {
        try {
            JSONObject jSONObject = new JSONObject();
            m5628b(jSONObject);
            return jSONObject.toString();
        } catch (Throwable th) {
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
    }
}
