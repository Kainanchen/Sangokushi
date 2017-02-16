package com.tencent.p080b.p081a.p082a;

import android.content.Context;
import com.tencent.p080b.p081a.C1061f;
import com.tencent.p080b.p081a.p083b.C1041d;
import com.tencent.p080b.p081a.p083b.C1049l;
import org.json.JSONObject;

/* renamed from: com.tencent.b.a.a.h */
public final class C1036h extends C1029d {
    private C1041d f7986a;
    private JSONObject f7987n;

    public C1036h(Context context, int i, JSONObject jSONObject, C1061f c1061f) {
        super(context, i, c1061f);
        this.f7987n = null;
        this.f7986a = new C1041d(context);
        this.f7987n = jSONObject;
    }

    public final boolean m5645a(JSONObject jSONObject) {
        if (this.f7954e != null) {
            jSONObject.put("ut", this.f7954e.f8027c);
        }
        if (this.f7987n != null) {
            jSONObject.put("cfg", this.f7987n);
        }
        if (C1049l.m5720u(this.l)) {
            jSONObject.put("ncts", 1);
        }
        this.f7986a.m5673a(jSONObject, null);
        return true;
    }

    public final C1033e m5646b() {
        return C1033e.SESSION_ENV;
    }
}
