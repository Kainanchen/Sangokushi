package com.tencent.p080b.p081a.p083b;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.p080b.p081a.C1058c;
import com.tencent.p080b.p081a.C1062g;
import com.tencent.p080b.p081a.C1073r;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tencent.b.a.b.d */
public final class C1041d {
    static C1042e f8032a;
    private static C1039b f8033d;
    private static JSONObject f8034e;
    Integer f8035b;
    String f8036c;

    static {
        f8033d = C1049l.m5693c();
        f8034e = new JSONObject();
    }

    public C1041d(Context context) {
        this.f8035b = null;
        this.f8036c = null;
        try {
            C1041d.m5672a(context);
            this.f8035b = C1049l.m5710k(context.getApplicationContext());
            this.f8036c = C1062g.m5813a(context).f8190c;
        } catch (Throwable th) {
            f8033d.m5665b(th);
        }
    }

    private static synchronized C1042e m5672a(Context context) {
        C1042e c1042e;
        synchronized (C1041d.class) {
            if (f8032a == null) {
                f8032a = new C1042e((byte) 0);
            }
            c1042e = f8032a;
        }
        return c1042e;
    }

    public final void m5673a(JSONObject jSONObject, Thread thread) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (f8032a != null) {
                C1042e c1042e = f8032a;
                if (thread == null) {
                    if (c1042e.f8039c != null) {
                        jSONObject2.put("sr", c1042e.f8039c.widthPixels + "*" + c1042e.f8039c.heightPixels);
                        jSONObject2.put("dpi", c1042e.f8039c.xdpi + "*" + c1042e.f8039c.ydpi);
                    }
                    if (C1062g.m5813a(c1042e.f8051o).m5817a()) {
                        JSONObject jSONObject3 = new JSONObject();
                        C1055r.m5737a(jSONObject3, "bs", C1055r.m5741c(c1042e.f8051o));
                        C1055r.m5737a(jSONObject3, "ss", C1055r.m5742d(c1042e.f8051o));
                        if (jSONObject3.length() > 0) {
                            C1055r.m5737a(jSONObject2, "wf", jSONObject3.toString());
                        }
                    }
                    JSONArray f = C1055r.m5744f(c1042e.f8051o);
                    if (f != null && f.length() > 0) {
                        C1055r.m5737a(jSONObject2, "wflist", f.toString());
                    }
                    C1055r.m5737a(jSONObject2, "sen", c1042e.f8052p);
                } else {
                    C1055r.m5737a(jSONObject2, "thn", thread.getName());
                    C1055r.m5737a(jSONObject2, "qq", C1058c.m5763c(c1042e.f8051o));
                    C1055r.m5737a(jSONObject2, "cui", C1058c.m5767d(c1042e.f8051o));
                    if (C1049l.m5695c(c1042e.f8054r) && c1042e.f8054r.split("/").length == 2) {
                        C1055r.m5737a(jSONObject2, "fram", c1042e.f8054r.split("/")[0]);
                    }
                    if (C1049l.m5695c(c1042e.f8055s) && c1042e.f8055s.split("/").length == 2) {
                        C1055r.m5737a(jSONObject2, "from", c1042e.f8055s.split("/")[0]);
                    }
                    if (C1073r.m5835a(c1042e.f8051o).m5860b(c1042e.f8051o) != null) {
                        jSONObject2.put("ui", C1073r.m5835a(c1042e.f8051o).m5860b(c1042e.f8051o).f8025a);
                    }
                    C1055r.m5737a(jSONObject2, "mid", C1058c.m5770e(c1042e.f8051o));
                }
                C1055r.m5737a(jSONObject2, "pcn", C1049l.m5713n(c1042e.f8051o));
                C1055r.m5737a(jSONObject2, "osn", VERSION.RELEASE);
                C1055r.m5737a(jSONObject2, "av", c1042e.f8037a);
                C1055r.m5737a(jSONObject2, "ch", c1042e.f8044h);
                C1055r.m5737a(jSONObject2, "mf", c1042e.f8042f);
                C1055r.m5737a(jSONObject2, "sv", c1042e.f8038b);
                C1055r.m5737a(jSONObject2, "osd", Build.DISPLAY);
                C1055r.m5737a(jSONObject2, "prod", Build.PRODUCT);
                C1055r.m5737a(jSONObject2, "tags", Build.TAGS);
                C1055r.m5737a(jSONObject2, "id", Build.ID);
                C1055r.m5737a(jSONObject2, "fng", Build.FINGERPRINT);
                C1055r.m5737a(jSONObject2, "lch", c1042e.f8050n);
                C1055r.m5737a(jSONObject2, "ov", Integer.toString(c1042e.f8040d));
                jSONObject2.put("os", 1);
                C1055r.m5737a(jSONObject2, "op", c1042e.f8045i);
                C1055r.m5737a(jSONObject2, "lg", c1042e.f8043g);
                C1055r.m5737a(jSONObject2, "md", c1042e.f8041e);
                C1055r.m5737a(jSONObject2, "tz", c1042e.f8046j);
                if (c1042e.f8048l != 0) {
                    jSONObject2.put("jb", c1042e.f8048l);
                }
                C1055r.m5737a(jSONObject2, "sd", c1042e.f8047k);
                C1055r.m5737a(jSONObject2, "apn", c1042e.f8049m);
                C1055r.m5737a(jSONObject2, "cpu", c1042e.f8053q);
                C1055r.m5737a(jSONObject2, "abi", Build.CPU_ABI);
                C1055r.m5737a(jSONObject2, "abi2", Build.CPU_ABI2);
                C1055r.m5737a(jSONObject2, "ram", c1042e.f8054r);
                C1055r.m5737a(jSONObject2, "rom", c1042e.f8055s);
            }
            C1055r.m5737a(jSONObject2, "cn", this.f8036c);
            if (this.f8035b != null) {
                jSONObject2.put("tn", this.f8035b);
            }
            if (thread == null) {
                jSONObject.put("ev", jSONObject2);
            } else {
                jSONObject.put("errkv", jSONObject2.toString());
            }
            if (f8034e != null && f8034e.length() > 0) {
                jSONObject.put("eva", f8034e);
            }
        } catch (Throwable th) {
            f8033d.m5665b(th);
        }
    }
}
