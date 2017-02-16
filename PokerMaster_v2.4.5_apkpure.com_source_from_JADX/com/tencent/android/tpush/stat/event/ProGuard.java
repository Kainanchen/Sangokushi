package com.tencent.android.tpush.stat.event;

import android.content.Context;
import org.json.JSONObject;

/* renamed from: com.tencent.android.tpush.stat.event.e */
public class ProGuard extends ProGuard {
    private com.tencent.android.tpush.stat.p078a.ProGuard f7899a;
    private JSONObject f7900k;

    public ProGuard(Context context, int i, JSONObject jSONObject, long j) {
        super(context, i, j);
        this.f7900k = null;
        this.f7899a = new com.tencent.android.tpush.stat.p078a.ProGuard(context, j);
        this.f7900k = jSONObject;
    }

    public EventType m5587b() {
        return EventType.SESSION_ENV;
    }

    public boolean m5586a(JSONObject jSONObject) {
        jSONObject.put("ut", 1);
        if (this.f7900k != null) {
            jSONObject.put("cfg", this.f7900k);
        }
        if (com.tencent.android.tpush.stat.p078a.ProGuard.m5480j(this.j)) {
            jSONObject.put("ncts", 1);
        }
        this.f7899a.m5448a(jSONObject, null);
        return true;
    }
}
