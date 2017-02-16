package com.tencent.p080b.p081a.p082a;

import android.content.Context;
import com.tencent.p080b.p081a.C1060e;
import com.tencent.p080b.p081a.C1061f;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.b.a.a.a */
public final class C1030a extends C1029d {
    protected C1031b f7962a;
    private long f7963n;

    public C1030a(Context context, int i, String str, C1061f c1061f) {
        super(context, i, c1061f);
        this.f7962a = new C1031b();
        this.f7963n = -1;
        this.f7962a.f7964a = str;
    }

    public final C1031b m5635a() {
        return this.f7962a;
    }

    public final boolean m5636a(JSONObject jSONObject) {
        jSONObject.put("ei", this.f7962a.f7964a);
        if (this.f7963n > 0) {
            jSONObject.put("du", this.f7963n);
        }
        if (this.f7962a.f7965b == null) {
            if (this.f7962a.f7964a != null) {
                Map a = C1060e.m5791a(this.f7962a.f7964a);
                if (a != null && a.size() > 0) {
                    if (this.f7962a.f7966c == null || this.f7962a.f7966c.length() == 0) {
                        this.f7962a.f7966c = new JSONObject(a);
                    } else {
                        for (Entry entry : a.entrySet()) {
                            try {
                                this.f7962a.f7966c.put(entry.getKey().toString(), entry.getValue());
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
            jSONObject.put("kv", this.f7962a.f7966c);
        } else {
            jSONObject.put("ar", this.f7962a.f7965b);
        }
        return true;
    }

    public final C1033e m5637b() {
        return C1033e.CUSTOM;
    }
}
