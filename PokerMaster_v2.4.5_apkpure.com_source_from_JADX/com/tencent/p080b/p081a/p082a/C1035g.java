package com.tencent.p080b.p081a.p082a;

import android.content.Context;
import com.tencent.p080b.p081a.C1061f;
import com.tencent.p080b.p081a.C1062g;
import com.tencent.p080b.p081a.p083b.C1049l;
import com.tencent.p080b.p081a.p083b.C1055r;
import org.json.JSONObject;

/* renamed from: com.tencent.b.a.a.g */
public final class C1035g extends C1029d {
    private static String f7983n;
    public String f7984a;
    private String f7985o;

    static {
        f7983n = null;
    }

    public C1035g(Context context, int i, C1061f c1061f) {
        super(context, i, c1061f);
        this.f7985o = null;
        this.f7984a = null;
        this.f7985o = C1062g.m5813a(context).f8190c;
        if (f7983n == null) {
            f7983n = C1049l.m5705h(context);
        }
    }

    public final boolean m5643a(JSONObject jSONObject) {
        C1055r.m5737a(jSONObject, "op", f7983n);
        C1055r.m5737a(jSONObject, "cn", this.f7985o);
        jSONObject.put("sp", this.f7984a);
        return true;
    }

    public final C1033e m5644b() {
        return C1033e.NETWORK_MONITOR;
    }
}
