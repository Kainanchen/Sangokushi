package com.amap.p003a;

import android.content.Context;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.HashMap;
import java.util.Map;

/* compiled from: BinaryRequest */
/* renamed from: com.amap.a.ai */
public abstract class ai extends am {
    protected Context f180a;
    protected cj f181b;

    public ai(Context context, cj cjVar) {
        if (context != null) {
            this.f180a = context.getApplicationContext();
        }
        this.f181b = cjVar;
    }

    protected static byte[] m156a(byte[] bArr) {
        byte length = (byte) (bArr.length % AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY);
        return new byte[]{(byte) (bArr.length / AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY), length};
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m157j() {
        /*
        r1 = new java.io.ByteArrayOutputStream;
        r1.<init>();
        r0 = "PANDORA$";
        r0 = com.amap.p003a.ck.m624a(r0);	 Catch:{ Throwable -> 0x0033 }
        r1.write(r0);	 Catch:{ Throwable -> 0x0033 }
        r0 = 1;
        r0 = new byte[r0];	 Catch:{ Throwable -> 0x0033 }
        r2 = 0;
        r3 = 1;
        r0[r2] = r3;	 Catch:{ Throwable -> 0x0033 }
        r1.write(r0);	 Catch:{ Throwable -> 0x0033 }
        r0 = 1;
        r0 = new byte[r0];	 Catch:{ Throwable -> 0x0033 }
        r2 = 0;
        r3 = 0;
        r0[r2] = r3;	 Catch:{ Throwable -> 0x0033 }
        r1.write(r0);	 Catch:{ Throwable -> 0x0033 }
        r0 = r1.toByteArray();	 Catch:{ Throwable -> 0x0033 }
        r1.close();	 Catch:{ Throwable -> 0x002a }
    L_0x0029:
        return r0;
    L_0x002a:
        r1 = move-exception;
        r2 = "BinaryRequest";
        r3 = "getBinaryHead";
        com.amap.p003a.cm.m637a(r1, r2, r3);
        goto L_0x0029;
    L_0x0033:
        r0 = move-exception;
        r2 = "BinaryRequest";
        r3 = "getBinaryHead";
        com.amap.p003a.cm.m637a(r0, r2, r3);	 Catch:{ all -> 0x0049 }
        r1.close();	 Catch:{ Throwable -> 0x0040 }
    L_0x003e:
        r0 = 0;
        goto L_0x0029;
    L_0x0040:
        r0 = move-exception;
        r1 = "BinaryRequest";
        r2 = "getBinaryHead";
        com.amap.p003a.cm.m637a(r0, r1, r2);
        goto L_0x003e;
    L_0x0049:
        r0 = move-exception;
        r1.close();	 Catch:{ Throwable -> 0x004e }
    L_0x004d:
        throw r0;
    L_0x004e:
        r1 = move-exception;
        r2 = "BinaryRequest";
        r3 = "getBinaryHead";
        com.amap.p003a.cm.m637a(r1, r2, r3);
        goto L_0x004d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.a.ai.j():byte[]");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] m158k() {
        /*
        r6 = this;
        r5 = 1;
        r4 = 0;
        r1 = new java.io.ByteArrayOutputStream;
        r1.<init>();
        r0 = 1;
        r0 = new byte[r0];	 Catch:{ Throwable -> 0x0067 }
        r2 = 0;
        r3 = 3;
        r0[r2] = r3;	 Catch:{ Throwable -> 0x0067 }
        r1.write(r0);	 Catch:{ Throwable -> 0x0067 }
        r0 = r6.m162d();	 Catch:{ Throwable -> 0x0067 }
        if (r0 == 0) goto L_0x005d;
    L_0x0017:
        r0 = r6.f180a;	 Catch:{ Throwable -> 0x0067 }
        r0 = com.amap.p003a.cd.m539a(r0);	 Catch:{ Throwable -> 0x0067 }
        r2 = com.amap.p003a.ai.m156a(r0);	 Catch:{ Throwable -> 0x0067 }
        r1.write(r2);	 Catch:{ Throwable -> 0x0067 }
        r1.write(r0);	 Catch:{ Throwable -> 0x0067 }
    L_0x0027:
        r0 = r6.m165g();	 Catch:{ Throwable -> 0x0067 }
        r0 = com.amap.p003a.ck.m624a(r0);	 Catch:{ Throwable -> 0x0067 }
        if (r0 == 0) goto L_0x0077;
    L_0x0031:
        r2 = r0.length;	 Catch:{ Throwable -> 0x0067 }
        if (r2 <= 0) goto L_0x0077;
    L_0x0034:
        r2 = com.amap.p003a.ai.m156a(r0);	 Catch:{ Throwable -> 0x0067 }
        r1.write(r2);	 Catch:{ Throwable -> 0x0067 }
        r1.write(r0);	 Catch:{ Throwable -> 0x0067 }
    L_0x003e:
        r0 = r6.m164f();	 Catch:{ Throwable -> 0x0067 }
        r0 = com.amap.p003a.ck.m624a(r0);	 Catch:{ Throwable -> 0x0067 }
        if (r0 == 0) goto L_0x0086;
    L_0x0048:
        r2 = r0.length;	 Catch:{ Throwable -> 0x0067 }
        if (r2 <= 0) goto L_0x0086;
    L_0x004b:
        r2 = com.amap.p003a.ai.m156a(r0);	 Catch:{ Throwable -> 0x0067 }
        r1.write(r2);	 Catch:{ Throwable -> 0x0067 }
        r1.write(r0);	 Catch:{ Throwable -> 0x0067 }
    L_0x0055:
        r0 = r1.toByteArray();	 Catch:{ Throwable -> 0x0067 }
        r1.close();	 Catch:{ Throwable -> 0x0090 }
    L_0x005c:
        return r0;
    L_0x005d:
        r0 = 2;
        r0 = new byte[r0];	 Catch:{ Throwable -> 0x0067 }
        r0 = {0, 0};	 Catch:{ Throwable -> 0x0067 }
        r1.write(r0);	 Catch:{ Throwable -> 0x0067 }
        goto L_0x0027;
    L_0x0067:
        r0 = move-exception;
        r2 = "BinaryRequest";
        r3 = "getPublicData";
        com.amap.p003a.cm.m637a(r0, r2, r3);	 Catch:{ all -> 0x0081 }
        r1.close();	 Catch:{ Throwable -> 0x0099 }
    L_0x0072:
        r0 = new byte[r5];
        r0[r4] = r4;
        goto L_0x005c;
    L_0x0077:
        r0 = 2;
        r0 = new byte[r0];	 Catch:{ Throwable -> 0x0067 }
        r0 = {0, 0};	 Catch:{ Throwable -> 0x0067 }
        r1.write(r0);	 Catch:{ Throwable -> 0x0067 }
        goto L_0x003e;
    L_0x0081:
        r0 = move-exception;
        r1.close();	 Catch:{ Throwable -> 0x00a2 }
    L_0x0085:
        throw r0;
    L_0x0086:
        r0 = 2;
        r0 = new byte[r0];	 Catch:{ Throwable -> 0x0067 }
        r0 = {0, 0};	 Catch:{ Throwable -> 0x0067 }
        r1.write(r0);	 Catch:{ Throwable -> 0x0067 }
        goto L_0x0055;
    L_0x0090:
        r1 = move-exception;
        r2 = "BinaryRequest";
        r3 = "getRequestEncryptData";
        com.amap.p003a.cm.m637a(r1, r2, r3);
        goto L_0x005c;
    L_0x0099:
        r0 = move-exception;
        r1 = "BinaryRequest";
        r2 = "getRequestEncryptData";
        com.amap.p003a.cm.m637a(r0, r1, r2);
        goto L_0x0072;
    L_0x00a2:
        r1 = move-exception;
        r2 = "BinaryRequest";
        r3 = "getRequestEncryptData";
        com.amap.p003a.cm.m637a(r1, r2, r3);
        goto L_0x0085;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.a.ai.k():byte[]");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] m159l() {
        /*
        r7 = this;
        r6 = 1;
        r5 = 0;
        r1 = new java.io.ByteArrayOutputStream;
        r1.<init>();
        r0 = r7.m166h();	 Catch:{ Throwable -> 0x0050 }
        if (r0 == 0) goto L_0x0010;
    L_0x000d:
        r2 = r0.length;	 Catch:{ Throwable -> 0x0050 }
        if (r2 != 0) goto L_0x002b;
    L_0x0010:
        r0 = 1;
        r0 = new byte[r0];	 Catch:{ Throwable -> 0x0050 }
        r2 = 0;
        r3 = 0;
        r0[r2] = r3;	 Catch:{ Throwable -> 0x0050 }
        r1.write(r0);	 Catch:{ Throwable -> 0x0050 }
        r0 = r1.toByteArray();	 Catch:{ Throwable -> 0x0050 }
        r1.close();	 Catch:{ Throwable -> 0x0022 }
    L_0x0021:
        return r0;
    L_0x0022:
        r1 = move-exception;
        r2 = "BinaryRequest";
        r3 = "getRequestRawData";
        com.amap.p003a.cm.m637a(r1, r2, r3);
        goto L_0x0021;
    L_0x002b:
        r2 = 1;
        r2 = new byte[r2];	 Catch:{ Throwable -> 0x0050 }
        r3 = 0;
        r4 = 1;
        r2[r3] = r4;	 Catch:{ Throwable -> 0x0050 }
        r1.write(r2);	 Catch:{ Throwable -> 0x0050 }
        r2 = com.amap.p003a.ai.m156a(r0);	 Catch:{ Throwable -> 0x0050 }
        r1.write(r2);	 Catch:{ Throwable -> 0x0050 }
        r1.write(r0);	 Catch:{ Throwable -> 0x0050 }
        r0 = r1.toByteArray();	 Catch:{ Throwable -> 0x0050 }
        r1.close();	 Catch:{ Throwable -> 0x0047 }
        goto L_0x0021;
    L_0x0047:
        r1 = move-exception;
        r2 = "BinaryRequest";
        r3 = "getRequestRawData";
        com.amap.p003a.cm.m637a(r1, r2, r3);
        goto L_0x0021;
    L_0x0050:
        r0 = move-exception;
        r2 = "BinaryRequest";
        r3 = "getRequestRawData";
        com.amap.p003a.cm.m637a(r0, r2, r3);	 Catch:{ all -> 0x0069 }
        r1.close();	 Catch:{ Throwable -> 0x0060 }
    L_0x005b:
        r0 = new byte[r6];
        r0[r5] = r5;
        goto L_0x0021;
    L_0x0060:
        r0 = move-exception;
        r1 = "BinaryRequest";
        r2 = "getRequestRawData";
        com.amap.p003a.cm.m637a(r0, r1, r2);
        goto L_0x005b;
    L_0x0069:
        r0 = move-exception;
        r1.close();	 Catch:{ Throwable -> 0x006e }
    L_0x006d:
        throw r0;
    L_0x006e:
        r1 = move-exception;
        r2 = "BinaryRequest";
        r3 = "getRequestRawData";
        com.amap.p003a.cm.m637a(r1, r2, r3);
        goto L_0x006d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.a.ai.l():byte[]");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] m160m() {
        /*
        r7 = this;
        r6 = 1;
        r5 = 0;
        r1 = new java.io.ByteArrayOutputStream;
        r1.<init>();
        r0 = r7.m167i();	 Catch:{ Throwable -> 0x0054 }
        if (r0 == 0) goto L_0x0010;
    L_0x000d:
        r2 = r0.length;	 Catch:{ Throwable -> 0x0054 }
        if (r2 != 0) goto L_0x002b;
    L_0x0010:
        r0 = 1;
        r0 = new byte[r0];	 Catch:{ Throwable -> 0x0054 }
        r2 = 0;
        r3 = 0;
        r0[r2] = r3;	 Catch:{ Throwable -> 0x0054 }
        r1.write(r0);	 Catch:{ Throwable -> 0x0054 }
        r0 = r1.toByteArray();	 Catch:{ Throwable -> 0x0054 }
        r1.close();	 Catch:{ Throwable -> 0x0022 }
    L_0x0021:
        return r0;
    L_0x0022:
        r1 = move-exception;
        r2 = "BinaryRequest";
        r3 = "getRequestEncryptData";
        com.amap.p003a.cm.m637a(r1, r2, r3);
        goto L_0x0021;
    L_0x002b:
        r2 = 1;
        r2 = new byte[r2];	 Catch:{ Throwable -> 0x0054 }
        r3 = 0;
        r4 = 1;
        r2[r3] = r4;	 Catch:{ Throwable -> 0x0054 }
        r1.write(r2);	 Catch:{ Throwable -> 0x0054 }
        r0 = com.amap.p003a.cd.m541a(r0);	 Catch:{ Throwable -> 0x0054 }
        r2 = com.amap.p003a.ai.m156a(r0);	 Catch:{ Throwable -> 0x0054 }
        r1.write(r2);	 Catch:{ Throwable -> 0x0054 }
        r1.write(r0);	 Catch:{ Throwable -> 0x0054 }
        r0 = r1.toByteArray();	 Catch:{ Throwable -> 0x0054 }
        r1.close();	 Catch:{ Throwable -> 0x004b }
        goto L_0x0021;
    L_0x004b:
        r1 = move-exception;
        r2 = "BinaryRequest";
        r3 = "getRequestEncryptData";
        com.amap.p003a.cm.m637a(r1, r2, r3);
        goto L_0x0021;
    L_0x0054:
        r0 = move-exception;
        r2 = "BinaryRequest";
        r3 = "getRequestEncryptData";
        com.amap.p003a.cm.m637a(r0, r2, r3);	 Catch:{ all -> 0x006d }
        r1.close();	 Catch:{ Throwable -> 0x0064 }
    L_0x005f:
        r0 = new byte[r6];
        r0[r5] = r5;
        goto L_0x0021;
    L_0x0064:
        r0 = move-exception;
        r1 = "BinaryRequest";
        r2 = "getRequestEncryptData";
        com.amap.p003a.cm.m637a(r0, r1, r2);
        goto L_0x005f;
    L_0x006d:
        r0 = move-exception;
        r1.close();	 Catch:{ Throwable -> 0x0072 }
    L_0x0071:
        throw r0;
    L_0x0072:
        r1 = move-exception;
        r2 = "BinaryRequest";
        r3 = "getRequestEncryptData";
        com.amap.p003a.cm.m637a(r1, r2, r3);
        goto L_0x0071;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.a.ai.m():byte[]");
    }

    public Map<String, String> m161a() {
        String f = cb.m523f(this.f180a);
        String a = cd.m536a();
        String a2 = cd.m537a(this.f180a, a, "key=" + f);
        Map<String, String> hashMap = new HashMap();
        hashMap.put("ts", a);
        hashMap.put("key", f);
        hashMap.put("scode", a2);
        return hashMap;
    }

    public boolean m162d() {
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] m163e() {
        /*
        r4 = this;
        r1 = new java.io.ByteArrayOutputStream;
        r1.<init>();
        r0 = com.amap.p003a.ai.m157j();	 Catch:{ Throwable -> 0x0032 }
        r1.write(r0);	 Catch:{ Throwable -> 0x0032 }
        r0 = r4.m158k();	 Catch:{ Throwable -> 0x0032 }
        r1.write(r0);	 Catch:{ Throwable -> 0x0032 }
        r0 = r4.m159l();	 Catch:{ Throwable -> 0x0032 }
        r1.write(r0);	 Catch:{ Throwable -> 0x0032 }
        r0 = r4.m160m();	 Catch:{ Throwable -> 0x0032 }
        r1.write(r0);	 Catch:{ Throwable -> 0x0032 }
        r0 = r1.toByteArray();	 Catch:{ Throwable -> 0x0032 }
        r1.close();	 Catch:{ Throwable -> 0x0029 }
    L_0x0028:
        return r0;
    L_0x0029:
        r1 = move-exception;
        r2 = "BinaryRequest";
        r3 = "getEntityBytes";
        com.amap.p003a.cm.m637a(r1, r2, r3);
        goto L_0x0028;
    L_0x0032:
        r0 = move-exception;
        r2 = "BinaryRequest";
        r3 = "getEntityBytes";
        com.amap.p003a.cm.m637a(r0, r2, r3);	 Catch:{ all -> 0x0048 }
        r1.close();	 Catch:{ Throwable -> 0x003f }
    L_0x003d:
        r0 = 0;
        goto L_0x0028;
    L_0x003f:
        r0 = move-exception;
        r1 = "BinaryRequest";
        r2 = "getEntityBytes";
        com.amap.p003a.cm.m637a(r0, r1, r2);
        goto L_0x003d;
    L_0x0048:
        r0 = move-exception;
        r1.close();	 Catch:{ Throwable -> 0x004d }
    L_0x004c:
        throw r0;
    L_0x004d:
        r1 = move-exception;
        r2 = "BinaryRequest";
        r3 = "getEntityBytes";
        com.amap.p003a.cm.m637a(r1, r2, r3);
        goto L_0x004c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.a.ai.e():byte[]");
    }

    public String m164f() {
        return String.format("platform=Android&sdkversion=%s&product=%s", new Object[]{this.f181b.m612b(), this.f181b.m611a()});
    }

    protected String m165g() {
        return "2.1";
    }

    public abstract byte[] m166h();

    public abstract byte[] m167i();
}
