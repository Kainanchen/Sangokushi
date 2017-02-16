package com.amap.p003a;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import java.util.List;
import org.json.JSONObject;

/* compiled from: WifiManagerWrapper */
/* renamed from: com.amap.a.ba */
public final class ba {
    WifiManager f339a;
    JSONObject f340b;
    Context f341c;
    long f342d;
    String f343e;

    public ba(Context context, WifiManager wifiManager, JSONObject jSONObject) {
        this.f342d = 0;
        this.f343e = null;
        this.f339a = wifiManager;
        this.f340b = jSONObject;
        this.f341c = context;
    }

    public final List<ScanResult> m311a() {
        if (this.f339a != null) {
            try {
                List<ScanResult> scanResults = this.f339a.getScanResults();
                this.f343e = null;
                return scanResults;
            } catch (SecurityException e) {
                this.f343e = e.getMessage();
            } catch (Throwable th) {
                this.f343e = null;
                bc.m330a(th, "WifiManagerWrapper", "getScanResults");
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m312a(android.net.ConnectivityManager r6) {
        /*
        r5 = this;
        r0 = 1;
        r1 = 0;
        r2 = r5.f339a;
        if (r2 != 0) goto L_0x0007;
    L_0x0006:
        return r1;
    L_0x0007:
        r3 = r5.m314c();
        if (r3 == 0) goto L_0x0006;
    L_0x000d:
        r3 = r6.getActiveNetworkInfo();	 Catch:{ Throwable -> 0x005c }
        r3 = com.amap.p003a.bj.m362a(r3);	 Catch:{ Throwable -> 0x005c }
        if (r3 != r0) goto L_0x0065;
    L_0x0017:
        r2 = r2.getConnectionInfo();	 Catch:{ Throwable -> 0x005c }
        if (r2 == 0) goto L_0x0027;
    L_0x001d:
        r3 = r2.getBSSID();	 Catch:{ Throwable -> 0x005c }
        r3 = android.text.TextUtils.isEmpty(r3);	 Catch:{ Throwable -> 0x005c }
        if (r3 == 0) goto L_0x002c;
    L_0x0027:
        r2 = r1;
    L_0x0028:
        if (r2 == 0) goto L_0x0065;
    L_0x002a:
        r1 = r0;
        goto L_0x0006;
    L_0x002c:
        r3 = r2.getSSID();	 Catch:{ Throwable -> 0x005c }
        if (r3 != 0) goto L_0x0034;
    L_0x0032:
        r2 = r1;
        goto L_0x0028;
    L_0x0034:
        r3 = r2.getBSSID();	 Catch:{ Throwable -> 0x005c }
        r4 = "00:00:00:00:00:00";
        r3 = r3.equals(r4);	 Catch:{ Throwable -> 0x005c }
        if (r3 == 0) goto L_0x0042;
    L_0x0040:
        r2 = r1;
        goto L_0x0028;
    L_0x0042:
        r3 = r2.getBSSID();	 Catch:{ Throwable -> 0x005c }
        r4 = " :";
        r3 = r3.contains(r4);	 Catch:{ Throwable -> 0x005c }
        if (r3 == 0) goto L_0x0050;
    L_0x004e:
        r2 = r1;
        goto L_0x0028;
    L_0x0050:
        r2 = r2.getSSID();	 Catch:{ Throwable -> 0x005c }
        r2 = android.text.TextUtils.isEmpty(r2);	 Catch:{ Throwable -> 0x005c }
        if (r2 == 0) goto L_0x0067;
    L_0x005a:
        r2 = r1;
        goto L_0x0028;
    L_0x005c:
        r0 = move-exception;
        r2 = "WifiManagerWrapper";
        r3 = "wifiAccess";
        com.amap.p003a.bc.m330a(r0, r2, r3);
        goto L_0x0006;
    L_0x0065:
        r0 = r1;
        goto L_0x002a;
    L_0x0067:
        r2 = r0;
        goto L_0x0028;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.a.ba.a(android.net.ConnectivityManager):boolean");
    }

    public final boolean m313b() {
        try {
            return String.valueOf(bp.m426a(this.f339a, "startScanActive", new Object[0])).equals("true");
        } catch (Throwable th) {
            bc.m330a(th, "WifiManagerWrapper", "startScanActive");
            return false;
        }
    }

    public final boolean m314c() {
        boolean z = false;
        WifiManager wifiManager = this.f339a;
        if (wifiManager != null) {
            try {
                z = wifiManager.isWifiEnabled();
            } catch (Throwable th) {
                bc.m330a(th, "WifiManagerWrapper", "wifiEnabled1");
            }
            if (!z && bu.m485c() > 17) {
                try {
                    z = String.valueOf(bp.m426a(wifiManager, "isScanAlwaysAvailable", new Object[0])).equals("true");
                } catch (Throwable th2) {
                    bc.m330a(th2, "WifiManagerWrapper", "wifiEnabled");
                }
            }
        }
        return z;
    }
}
