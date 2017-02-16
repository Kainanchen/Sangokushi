package com.tencent.p080b.p081a.p082a;

import android.content.Context;
import com.tencent.p080b.p081a.C1058c;
import com.tencent.p080b.p081a.C1061f;
import com.tencent.p080b.p081a.p083b.C1055r;
import org.json.JSONObject;

/* renamed from: com.tencent.b.a.a.f */
public final class C1034f extends C1029d {
    public static final C1061f f7982a;

    static {
        C1061f c1061f = new C1061f();
        f7982a = c1061f;
        c1061f.f8182a = "A9VH9B8L4GX4";
    }

    public C1034f(Context context) {
        super(context, 0, f7982a);
    }

    public final boolean m5641a(JSONObject jSONObject) {
        C1055r.m5737a(jSONObject, "actky", C1058c.m5748a(this.l));
        return true;
    }

    public final C1033e m5642b() {
        return C1033e.NETWORK_DETECTOR;
    }
}
