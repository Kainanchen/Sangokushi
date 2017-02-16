package com.amap.p003a;

import android.content.Context;
import android.text.TextUtils;
import java.util.Hashtable;
import org.json.JSONObject;

/* compiled from: HeatMap */
/* renamed from: com.amap.a.bg */
public final class bg {
    private static bg f378c;
    Hashtable<String, JSONObject> f379a;
    boolean f380b;

    static {
        f378c = null;
    }

    private bg() {
        this.f379a = new Hashtable();
        this.f380b = false;
    }

    public static synchronized bg m354a() {
        bg bgVar;
        synchronized (bg.class) {
            if (f378c == null) {
                f378c = new bg();
            }
            bgVar = f378c;
        }
        return bgVar;
    }

    public final void m355a(Context context) {
        if (av.f292a && !this.f380b) {
            bu.m477b();
            try {
                bf.m347a().m353c(context);
            } catch (Throwable th) {
                bc.m330a(th, "HeatMap", "loadDB");
            }
            this.f380b = true;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void m356a(android.content.Context r10, java.lang.String r11, com.autonavi.aps.amapapi.model.AMapLocationServer r12) {
        /*
        r9 = this;
        monitor-enter(r9);
        r3 = 0;
        r0 = com.amap.p003a.bu.m471a(r12);	 Catch:{ all -> 0x0071 }
        if (r0 == 0) goto L_0x000e;
    L_0x0008:
        if (r10 == 0) goto L_0x000e;
    L_0x000a:
        r0 = com.amap.p003a.av.f292a;	 Catch:{ all -> 0x0071 }
        if (r0 != 0) goto L_0x0010;
    L_0x000e:
        monitor-exit(r9);
        return;
    L_0x0010:
        r0 = r9.f379a;	 Catch:{ all -> 0x0071 }
        r0 = r0.size();	 Catch:{ all -> 0x0071 }
        r1 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        if (r0 <= r1) goto L_0x002e;
    L_0x001a:
        r0 = r12.getLatitude();	 Catch:{ all -> 0x0071 }
        r2 = r12.getLongitude();	 Catch:{ all -> 0x0071 }
        r3 = com.amap.p003a.ax.m266a(r0, r2);	 Catch:{ all -> 0x0071 }
        r0 = r9.f379a;	 Catch:{ all -> 0x0071 }
        r0 = r0.containsKey(r3);	 Catch:{ all -> 0x0071 }
        if (r0 == 0) goto L_0x000e;
    L_0x002e:
        if (r3 != 0) goto L_0x003c;
    L_0x0030:
        r0 = r12.getLatitude();	 Catch:{ all -> 0x0071 }
        r2 = r12.getLongitude();	 Catch:{ all -> 0x0071 }
        r3 = com.amap.p003a.ax.m266a(r0, r2);	 Catch:{ all -> 0x0071 }
    L_0x003c:
        r0 = new org.json.JSONObject;	 Catch:{ all -> 0x0071 }
        r0.<init>();	 Catch:{ all -> 0x0071 }
        r1 = "key";
        r0.put(r1, r11);	 Catch:{ Throwable -> 0x0068 }
        r1 = "lat";
        r4 = r12.getLatitude();	 Catch:{ Throwable -> 0x0068 }
        r0.put(r1, r4);	 Catch:{ Throwable -> 0x0068 }
        r1 = "lon";
        r4 = r12.getLongitude();	 Catch:{ Throwable -> 0x0068 }
        r0.put(r1, r4);	 Catch:{ Throwable -> 0x0068 }
        r4 = r0.toString();	 Catch:{ Throwable -> 0x0068 }
        r5 = 1;
        r6 = com.amap.p003a.bu.m464a();	 Catch:{ Throwable -> 0x0068 }
        r8 = 1;
        r1 = r9;
        r2 = r10;
        r1.m357a(r2, r3, r4, r5, r6, r8);	 Catch:{ Throwable -> 0x0068 }
        goto L_0x000e;
    L_0x0068:
        r0 = move-exception;
        r1 = "HeatMap";
        r2 = "update";
        com.amap.p003a.bc.m330a(r0, r1, r2);	 Catch:{ all -> 0x0071 }
        goto L_0x000e;
    L_0x0071:
        r0 = move-exception;
        monitor-exit(r9);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.a.bg.a(android.content.Context, java.lang.String, com.autonavi.aps.amapapi.model.AMapLocationServer):void");
    }

    public final synchronized void m357a(Context context, String str, String str2, int i, long j, boolean z) {
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (av.f292a) {
                    JSONObject jSONObject = (JSONObject) this.f379a.get(str);
                    JSONObject jSONObject2 = jSONObject == null ? new JSONObject() : jSONObject;
                    try {
                        jSONObject2.put("x", str2);
                        jSONObject2.put("time", j);
                        if (this.f379a.containsKey(str)) {
                            jSONObject2.put("num", jSONObject2.getInt("num") + i);
                        } else {
                            jSONObject2.put("num", i);
                        }
                    } catch (Throwable th) {
                        bc.m330a(th, "HeatMap", "update1");
                    }
                    this.f379a.put(str, jSONObject2);
                    if (!(bc.f360n || bt.m456b(context, "pref", "ddex", false) || i < 120)) {
                        bc.f360n = true;
                        bt.m453a(context, "pref", "ddex", true);
                        br.m433a(context, "OffLocation");
                    }
                    if (z) {
                        try {
                            bf.m347a().m350a(context, str, str2, j);
                        } catch (Throwable th2) {
                            bc.m330a(th2, "HeatMap", "update");
                        }
                    }
                }
            }
        }
    }
}
