package com.amap.p003a;

import android.content.Context;
import android.text.TextUtils;
import com.autonavi.aps.amapapi.model.AMapLocationServer;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/* compiled from: Cache */
/* renamed from: com.amap.a.bd */
public final class bd {
    private static bd f370a;
    private Hashtable<String, ArrayList<Cache>> f371b;
    private long f372c;
    private boolean f373d;

    /* renamed from: com.amap.a.bd.a */
    static class Cache {
        AMapLocationServer f368a;
        String f369b;

        protected Cache() {
            this.f368a = null;
            this.f369b = null;
        }
    }

    static {
        f370a = null;
    }

    private bd() {
        this.f371b = new Hashtable();
        this.f372c = 0;
        this.f373d = false;
    }

    private synchronized Cache m337a(StringBuilder stringBuilder, String str) {
        Cache cache;
        if (this.f371b.isEmpty() || TextUtils.isEmpty(stringBuilder)) {
            cache = null;
        } else if (this.f371b.containsKey(str)) {
            Hashtable hashtable = new Hashtable();
            Hashtable hashtable2 = new Hashtable();
            Hashtable hashtable3 = new Hashtable();
            ArrayList arrayList = (ArrayList) this.f371b.get(str);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Cache cache2 = (Cache) arrayList.get(size);
                if (!TextUtils.isEmpty(cache2.f369b)) {
                    boolean z;
                    String str2;
                    Object obj = null;
                    String str3 = cache2.f369b;
                    if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(stringBuilder)) {
                        z = false;
                    } else {
                        if (str3.contains(",access")) {
                            if (stringBuilder.indexOf(",access") != -1) {
                                String[] split = str3.split(",access");
                                Object substring = split[0].contains("#") ? split[0].substring(split[0].lastIndexOf("#") + 1) : split[0];
                                z = TextUtils.isEmpty(substring) ? false : stringBuilder.toString().contains(substring + ",access");
                            }
                        }
                        z = false;
                    }
                    if (z) {
                        obj = 1;
                        if (bd.m340a(cache2.f369b, stringBuilder)) {
                            cache = cache2;
                            break;
                        }
                    }
                    Object obj2 = obj;
                    bd.m339a(cache2.f369b, hashtable);
                    bd.m339a(stringBuilder.toString(), hashtable2);
                    hashtable3.clear();
                    for (String str22 : hashtable.keySet()) {
                        hashtable3.put(str22, LetterIndexBar.SEARCH_ICON_LETTER);
                    }
                    for (String str222 : hashtable2.keySet()) {
                        hashtable3.put(str222, LetterIndexBar.SEARCH_ICON_LETTER);
                    }
                    Set keySet = hashtable3.keySet();
                    double[] dArr = new double[keySet.size()];
                    double[] dArr2 = new double[keySet.size()];
                    Iterator it = keySet.iterator();
                    int i = 0;
                    while (it != null && it.hasNext()) {
                        str222 = (String) it.next();
                        dArr[i] = hashtable.containsKey(str222) ? 1.0d : 0.0d;
                        dArr2[i] = hashtable2.containsKey(str222) ? 1.0d : 0.0d;
                        i++;
                    }
                    keySet.clear();
                    double[] a = bd.m341a(dArr, dArr2);
                    if (a[0] < 0.800000011920929d) {
                        if (a[1] < 0.618d) {
                            if (obj2 != null && a[0] >= 0.618d) {
                                cache = cache2;
                                break;
                            }
                        }
                        cache = cache2;
                        break;
                    }
                    cache = cache2;
                    break;
                }
            }
            cache = null;
            hashtable.clear();
            hashtable2.clear();
            hashtable3.clear();
        } else {
            cache = null;
        }
        return cache;
    }

    public static synchronized bd m338a() {
        bd bdVar;
        synchronized (bd.class) {
            if (f370a == null) {
                f370a = new bd();
            }
            bdVar = f370a;
        }
        return bdVar;
    }

    private static void m339a(String str, Hashtable<String, String> hashtable) {
        if (!TextUtils.isEmpty(str)) {
            hashtable.clear();
            for (Object obj : str.split("#")) {
                if (!(TextUtils.isEmpty(obj) || obj.contains("|"))) {
                    hashtable.put(obj, LetterIndexBar.SEARCH_ICON_LETTER);
                }
            }
        }
    }

    public static boolean m340a(String str, StringBuilder stringBuilder) {
        String[] split = str.split("#");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < split.length) {
            if (split[i].contains(",nb") || split[i].contains(",access")) {
                arrayList.add(split[i]);
            }
            i++;
        }
        String[] split2 = stringBuilder.toString().split("#");
        i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < split2.length) {
            if (split2[i2].contains(",nb") || split2[i2].contains(",access")) {
                i3++;
                if (arrayList.contains(split2[i2])) {
                    i++;
                }
            }
            i2++;
        }
        return ((double) (i * 2)) >= ((double) (arrayList.size() + i3)) * 0.618d;
    }

    private static double[] m341a(double[] dArr, double[] dArr2) {
        int i;
        double[] dArr3 = new double[3];
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        int i2 = 0;
        int i3 = 0;
        for (i = 0; i < dArr.length; i++) {
            d2 += dArr[i] * dArr[i];
            d3 += dArr2[i] * dArr2[i];
            d += dArr[i] * dArr2[i];
            if (dArr2[i] == 1.0d) {
                i2++;
                if (dArr[i] == 1.0d) {
                    i3++;
                }
            }
        }
        dArr3[0] = d / (Math.sqrt(d3) * Math.sqrt(d2));
        dArr3[1] = (1.0d * ((double) i3)) / ((double) i2);
        dArr3[2] = (double) i3;
        for (i = 0; i < 2; i++) {
            if (dArr3[i] > 1.0d) {
                dArr3[i] = 1.0d;
            }
        }
        return dArr3;
    }

    private boolean m342b() {
        return this.f372c == 0 ? false : this.f371b.size() > 360 ? true : bu.m477b() - this.f372c > 36000000;
    }

    private void m343c() {
        this.f372c = 0;
        if (!this.f371b.isEmpty()) {
            this.f371b.clear();
        }
        this.f373d = false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.autonavi.aps.amapapi.model.AMapLocationServer m344a(java.lang.String r5, java.lang.StringBuilder r6, boolean r7) {
        /*
        r4 = this;
        r1 = 0;
        monitor-enter(r4);
        r0 = "gps";
        r0 = r5.contains(r0);	 Catch:{ all -> 0x0096 }
        if (r0 != 0) goto L_0x0012;
    L_0x000a:
        if (r7 == 0) goto L_0x0012;
    L_0x000c:
        r0 = com.amap.p003a.bn.m419s();	 Catch:{ all -> 0x0096 }
        if (r0 != 0) goto L_0x0015;
    L_0x0012:
        r0 = r1;
    L_0x0013:
        monitor-exit(r4);
        return r0;
    L_0x0015:
        r0 = r4.m342b();	 Catch:{ all -> 0x0096 }
        if (r0 == 0) goto L_0x0020;
    L_0x001b:
        r4.m343c();	 Catch:{ all -> 0x0096 }
        r0 = r1;
        goto L_0x0013;
    L_0x0020:
        r0 = r4.f371b;	 Catch:{ all -> 0x0096 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0096 }
        if (r0 == 0) goto L_0x002a;
    L_0x0028:
        r0 = r1;
        goto L_0x0013;
    L_0x002a:
        r0 = "cgiwifi";
        r0 = r5.contains(r0);	 Catch:{ all -> 0x0096 }
        if (r0 == 0) goto L_0x0067;
    L_0x0032:
        r0 = r4.m337a(r6, r5);	 Catch:{ all -> 0x0096 }
        if (r0 == 0) goto L_0x0038;
    L_0x0038:
        if (r0 == 0) goto L_0x0065;
    L_0x003a:
        r2 = r0.f368a;	 Catch:{ all -> 0x0096 }
        r2 = com.amap.p003a.bu.m471a(r2);	 Catch:{ all -> 0x0096 }
        if (r2 == 0) goto L_0x0065;
    L_0x0042:
        r0 = r0.f368a;	 Catch:{ all -> 0x0096 }
        r2 = "mem";
        r0.m797f(r2);	 Catch:{ all -> 0x0096 }
        r2 = com.amap.p003a.bc.f350d;	 Catch:{ all -> 0x0096 }
        r2 = android.text.TextUtils.isEmpty(r2);	 Catch:{ all -> 0x0096 }
        if (r2 == 0) goto L_0x005b;
    L_0x0051:
        r2 = r0.m787b();	 Catch:{ all -> 0x0096 }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x0096 }
        com.amap.p003a.bc.f350d = r2;	 Catch:{ all -> 0x0096 }
    L_0x005b:
        r2 = r0.getTime();	 Catch:{ all -> 0x0096 }
        r2 = com.amap.p003a.bn.m394b(r2);	 Catch:{ all -> 0x0096 }
        if (r2 != 0) goto L_0x0013;
    L_0x0065:
        r0 = r1;
        goto L_0x0013;
    L_0x0067:
        r0 = "wifi";
        r0 = r5.contains(r0);	 Catch:{ all -> 0x0096 }
        if (r0 == 0) goto L_0x0076;
    L_0x006f:
        r0 = r4.m337a(r6, r5);	 Catch:{ all -> 0x0096 }
        if (r0 == 0) goto L_0x0038;
    L_0x0075:
        goto L_0x0038;
    L_0x0076:
        r0 = "cgi";
        r0 = r5.contains(r0);	 Catch:{ all -> 0x0096 }
        if (r0 == 0) goto L_0x0099;
    L_0x007e:
        r0 = r4.f371b;	 Catch:{ all -> 0x0096 }
        r0 = r0.containsKey(r5);	 Catch:{ all -> 0x0096 }
        if (r0 == 0) goto L_0x0099;
    L_0x0086:
        r0 = r4.f371b;	 Catch:{ all -> 0x0096 }
        r0 = r0.get(r5);	 Catch:{ all -> 0x0096 }
        r0 = (java.util.ArrayList) r0;	 Catch:{ all -> 0x0096 }
        r2 = 0;
        r0 = r0.get(r2);	 Catch:{ all -> 0x0096 }
        r0 = (com.amap.p003a.bd.Cache) r0;	 Catch:{ all -> 0x0096 }
        goto L_0x0038;
    L_0x0096:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
    L_0x0099:
        r0 = r1;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.a.bd.a(java.lang.String, java.lang.StringBuilder, boolean):com.autonavi.aps.amapapi.model.AMapLocationServer");
    }

    public final void m345a(Context context) {
        if (!this.f373d) {
            bu.m477b();
            try {
                bf.m347a().m349a(context);
            } catch (Throwable th) {
                bc.m330a(th, "Cache", "loadDB");
            }
            this.f373d = true;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void m346a(java.lang.String r8, java.lang.StringBuilder r9, com.autonavi.aps.amapapi.model.AMapLocationServer r10, android.content.Context r11, boolean r12) {
        /*
        r7 = this;
        r6 = 0;
        r0 = 1;
        r1 = 0;
        monitor-enter(r7);
        r2 = android.text.TextUtils.isEmpty(r8);	 Catch:{ all -> 0x0131 }
        if (r2 != 0) goto L_0x0010;
    L_0x000a:
        r2 = com.amap.p003a.bu.m471a(r10);	 Catch:{ all -> 0x0131 }
        if (r2 != 0) goto L_0x0015;
    L_0x0010:
        r0 = r1;
    L_0x0011:
        if (r0 != 0) goto L_0x0029;
    L_0x0013:
        monitor-exit(r7);
        return;
    L_0x0015:
        r2 = "#";
        r2 = r8.startsWith(r2);	 Catch:{ all -> 0x0131 }
        if (r2 == 0) goto L_0x001f;
    L_0x001d:
        r0 = r1;
        goto L_0x0011;
    L_0x001f:
        r2 = "network";
        r2 = r8.contains(r2);	 Catch:{ all -> 0x0131 }
        if (r2 != 0) goto L_0x0011;
    L_0x0027:
        r0 = r1;
        goto L_0x0011;
    L_0x0029:
        r0 = r10.m794e();	 Catch:{ all -> 0x0131 }
        r2 = "mem";
        r0 = r0.equals(r2);	 Catch:{ all -> 0x0131 }
        if (r0 != 0) goto L_0x0013;
    L_0x0035:
        r0 = r10.m794e();	 Catch:{ all -> 0x0131 }
        r2 = "file";
        r0 = r0.equals(r2);	 Catch:{ all -> 0x0131 }
        if (r0 != 0) goto L_0x0013;
    L_0x0041:
        r0 = r10.m790c();	 Catch:{ all -> 0x0131 }
        r2 = "-3";
        r0 = r0.equals(r2);	 Catch:{ all -> 0x0131 }
        if (r0 != 0) goto L_0x0013;
    L_0x004d:
        r0 = r7.m342b();	 Catch:{ all -> 0x0131 }
        if (r0 == 0) goto L_0x0056;
    L_0x0053:
        r7.m343c();	 Catch:{ all -> 0x0131 }
    L_0x0056:
        r0 = r10.m796f();	 Catch:{ all -> 0x0131 }
        r2 = "offpct";
        r2 = com.amap.p003a.bu.m473a(r0, r2);	 Catch:{ all -> 0x0131 }
        if (r2 == 0) goto L_0x006a;
    L_0x0062:
        r2 = "offpct";
        r0.remove(r2);	 Catch:{ all -> 0x0131 }
        r10.m785a(r0);	 Catch:{ all -> 0x0131 }
    L_0x006a:
        r0 = "wifi";
        r0 = r8.contains(r0);	 Catch:{ all -> 0x0131 }
        if (r0 == 0) goto L_0x0140;
    L_0x0072:
        r0 = android.text.TextUtils.isEmpty(r9);	 Catch:{ all -> 0x0131 }
        if (r0 != 0) goto L_0x0013;
    L_0x0078:
        r0 = r10.getAccuracy();	 Catch:{ all -> 0x0131 }
        r2 = 1133903872; // 0x43960000 float:300.0 double:5.60222949E-315;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 < 0) goto L_0x0134;
    L_0x0082:
        r0 = r9.toString();	 Catch:{ all -> 0x0131 }
        r2 = "#";
        r2 = r0.split(r2);	 Catch:{ all -> 0x0131 }
        r3 = r2.length;	 Catch:{ all -> 0x0131 }
        r0 = r1;
    L_0x008e:
        if (r1 >= r3) goto L_0x009f;
    L_0x0090:
        r4 = r2[r1];	 Catch:{ all -> 0x0131 }
        r5 = ",";
        r4 = r4.contains(r5);	 Catch:{ all -> 0x0131 }
        if (r4 == 0) goto L_0x009c;
    L_0x009a:
        r0 = r0 + 1;
    L_0x009c:
        r1 = r1 + 1;
        goto L_0x008e;
    L_0x009f:
        r1 = 8;
        if (r0 >= r1) goto L_0x0013;
    L_0x00a3:
        r0 = "cgiwifi";
        r0 = r8.contains(r0);	 Catch:{ all -> 0x0131 }
        if (r0 == 0) goto L_0x00d2;
    L_0x00ab:
        r0 = r10.m798g();	 Catch:{ all -> 0x0131 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ all -> 0x0131 }
        if (r0 != 0) goto L_0x00d2;
    L_0x00b5:
        r0 = "cgiwifi";
        r1 = "cgi";
        r1 = r8.replace(r0, r1);	 Catch:{ all -> 0x0131 }
        r3 = r10.m800h();	 Catch:{ all -> 0x0131 }
        r0 = com.amap.p003a.bu.m471a(r3);	 Catch:{ all -> 0x0131 }
        if (r0 == 0) goto L_0x00d2;
    L_0x00c7:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0131 }
        r2.<init>();	 Catch:{ all -> 0x0131 }
        r5 = 1;
        r0 = r7;
        r4 = r11;
        r0.m346a(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x0131 }
    L_0x00d2:
        r0 = 1;
        r0 = r7.m344a(r8, r9, r0);	 Catch:{ all -> 0x0131 }
        r1 = com.amap.p003a.bu.m471a(r0);	 Catch:{ all -> 0x0131 }
        if (r1 == 0) goto L_0x00ec;
    L_0x00dd:
        r0 = r0.toStr();	 Catch:{ all -> 0x0131 }
        r1 = 3;
        r1 = r10.toStr(r1);	 Catch:{ all -> 0x0131 }
        r0 = r0.equals(r1);	 Catch:{ all -> 0x0131 }
        if (r0 != 0) goto L_0x0013;
    L_0x00ec:
        r0 = com.amap.p003a.bu.m477b();	 Catch:{ all -> 0x0131 }
        r7.f372c = r0;	 Catch:{ all -> 0x0131 }
        r1 = new com.amap.a.bd$a;	 Catch:{ all -> 0x0131 }
        r1.<init>();	 Catch:{ all -> 0x0131 }
        r1.f368a = r10;	 Catch:{ all -> 0x0131 }
        r0 = android.text.TextUtils.isEmpty(r9);	 Catch:{ all -> 0x0131 }
        if (r0 == 0) goto L_0x015f;
    L_0x00ff:
        r0 = r6;
    L_0x0100:
        r2 = android.text.TextUtils.isEmpty(r0);	 Catch:{ all -> 0x0131 }
        if (r2 == 0) goto L_0x0164;
    L_0x0106:
        r0 = 0;
        r1.f369b = r0;	 Catch:{ all -> 0x0131 }
    L_0x0109:
        r0 = r7.f371b;	 Catch:{ all -> 0x0131 }
        r0 = r0.containsKey(r8);	 Catch:{ all -> 0x0131 }
        if (r0 == 0) goto L_0x016f;
    L_0x0111:
        r0 = r7.f371b;	 Catch:{ all -> 0x0131 }
        r0 = r0.get(r8);	 Catch:{ all -> 0x0131 }
        r0 = (java.util.ArrayList) r0;	 Catch:{ all -> 0x0131 }
        r0.add(r1);	 Catch:{ all -> 0x0131 }
    L_0x011c:
        if (r12 == 0) goto L_0x0013;
    L_0x011e:
        r0 = com.amap.p003a.bf.m347a();	 Catch:{ Throwable -> 0x0127 }
        r0.m351a(r8, r10, r9, r11);	 Catch:{ Throwable -> 0x0127 }
        goto L_0x0013;
    L_0x0127:
        r0 = move-exception;
        r1 = "Cache";
        r2 = "add";
        com.amap.p003a.bc.m330a(r0, r1, r2);	 Catch:{ all -> 0x0131 }
        goto L_0x0013;
    L_0x0131:
        r0 = move-exception;
        monitor-exit(r7);
        throw r0;
    L_0x0134:
        r0 = r10.getAccuracy();	 Catch:{ all -> 0x0131 }
        r1 = 1092616192; // 0x41200000 float:10.0 double:5.398241246E-315;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 > 0) goto L_0x00a3;
    L_0x013e:
        goto L_0x0013;
    L_0x0140:
        r0 = "cgi";
        r0 = r8.contains(r0);	 Catch:{ all -> 0x0131 }
        if (r0 == 0) goto L_0x00d2;
    L_0x0148:
        r0 = ",";
        r0 = r9.indexOf(r0);	 Catch:{ all -> 0x0131 }
        r1 = -1;
        if (r0 != r1) goto L_0x0013;
    L_0x0151:
        r0 = r10.m790c();	 Catch:{ all -> 0x0131 }
        r1 = "4";
        r0 = r0.equals(r1);	 Catch:{ all -> 0x0131 }
        if (r0 == 0) goto L_0x00d2;
    L_0x015d:
        goto L_0x0013;
    L_0x015f:
        r0 = r9.toString();	 Catch:{ all -> 0x0131 }
        goto L_0x0100;
    L_0x0164:
        r2 = "##";
        r3 = "#";
        r0 = r0.replace(r2, r3);	 Catch:{ all -> 0x0131 }
        r1.f369b = r0;	 Catch:{ all -> 0x0131 }
        goto L_0x0109;
    L_0x016f:
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0131 }
        r0.<init>();	 Catch:{ all -> 0x0131 }
        r0.add(r1);	 Catch:{ all -> 0x0131 }
        r1 = r7.f371b;	 Catch:{ all -> 0x0131 }
        r1.put(r8, r0);	 Catch:{ all -> 0x0131 }
        goto L_0x011c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.a.bd.a(java.lang.String, java.lang.StringBuilder, com.autonavi.aps.amapapi.model.AMapLocationServer, android.content.Context, boolean):void");
    }
}
