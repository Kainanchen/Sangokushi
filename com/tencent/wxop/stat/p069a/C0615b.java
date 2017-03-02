package com.tencent.wxop.stat.p069a;

import android.content.Context;
import com.tencent.wxop.stat.StatServiceImpl;
import com.tencent.wxop.stat.StatSpecifyReportedInfo;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.wxop.stat.a.b */
public class C0615b extends C0613e {
    protected C0616c f1861a;
    private long f1862m;

    public C0615b(Context context, int i, String str, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        super(context, i, statSpecifyReportedInfo);
        this.f1861a = new C0616c();
        this.f1862m = -1;
        this.f1861a.f1863a = str;
    }

    private void m2261h() {
        if (this.f1861a.f1863a != null) {
            Map commonKeyValueForKVEvent = StatServiceImpl.getCommonKeyValueForKVEvent(this.f1861a.f1863a);
            if (commonKeyValueForKVEvent != null && commonKeyValueForKVEvent.size() > 0) {
                if (this.f1861a.f1865c == null || this.f1861a.f1865c.length() == 0) {
                    this.f1861a.f1865c = new JSONObject(commonKeyValueForKVEvent);
                    return;
                }
                for (Entry entry : commonKeyValueForKVEvent.entrySet()) {
                    try {
                        this.f1861a.f1865c.put(entry.getKey().toString(), entry.getValue());
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public C0618f m2262a() {
        return C0618f.CUSTOM;
    }

    public void m2263a(long j) {
        this.f1862m = j;
    }

    public boolean m2264a(JSONObject jSONObject) {
        jSONObject.put("ei", this.f1861a.f1863a);
        if (this.f1862m > 0) {
            jSONObject.put("du", this.f1862m);
        }
        if (this.f1861a.f1864b == null) {
            m2261h();
            jSONObject.put("kv", this.f1861a.f1865c);
        } else {
            jSONObject.put("ar", this.f1861a.f1864b);
        }
        return true;
    }

    public C0616c m2265b() {
        return this.f1861a;
    }
}
