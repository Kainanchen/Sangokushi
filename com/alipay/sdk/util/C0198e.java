package com.alipay.sdk.util;

import android.app.Activity;
import android.content.Intent;
import android.content.ServiceConnection;
import com.alipay.android.app.IAlixPay;
import com.alipay.android.app.IRemoteServiceCallback;
import com.alipay.sdk.app.statistic.C0144a;
import com.alipay.sdk.app.statistic.C0146c;
import com.alipay.sdk.util.C0206l.C0205a;

/* renamed from: com.alipay.sdk.util.e */
public class C0198e {
    public static final String f499b = "failed";
    public Activity f500a;
    private IAlixPay f501c;
    private final Object f502d;
    private boolean f503e;
    private C0134a f504f;
    private ServiceConnection f505g;
    private IRemoteServiceCallback f506h;

    /* renamed from: com.alipay.sdk.util.e.a */
    public interface C0134a {
        void m376a();
    }

    public C0198e(Activity activity, C0134a c0134a) {
        this.f502d = IAlixPay.class;
        this.f505g = new C0199f(this);
        this.f506h = new C0200g(this);
        this.f500a = activity;
        this.f504f = c0134a;
    }

    public final String m658a(String str) {
        try {
            C0205a a = C0206l.m675a(this.f500a, C0206l.f524b);
            if (a.m673a()) {
                return f499b;
            }
            if (a != null && a.f522b > 78) {
                Intent intent = new Intent();
                intent.setClassName(C0206l.f524b, "com.alipay.android.app.TransProcessPayActivity");
                this.f500a.startActivity(intent);
                Thread.sleep(200);
            }
            return m657b(str);
        } catch (Throwable th) {
            C0144a.m399a(C0146c.f242b, C0146c.f236C, th);
        }
    }

    private void m655a(C0205a c0205a) throws InterruptedException {
        if (c0205a != null && c0205a.f522b > 78) {
            Intent intent = new Intent();
            intent.setClassName(C0206l.f524b, "com.alipay.android.app.TransProcessPayActivity");
            this.f500a.startActivity(intent);
            Thread.sleep(200);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m657b(java.lang.String r9) {
        /*
        r8 = this;
        r7 = 0;
        r6 = 0;
        r0 = new android.content.Intent;
        r0.<init>();
        r1 = "com.eg.android.AlipayGphone";
        r0.setPackage(r1);
        r1 = "com.eg.android.AlipayGphone.IAlixPay";
        r0.setAction(r1);
        r1 = r8.f500a;
        r1 = com.alipay.sdk.util.C0206l.m697g(r1);
        r2 = r8.f500a;	 Catch:{ Throwable -> 0x0093 }
        r2 = r2.getApplicationContext();	 Catch:{ Throwable -> 0x0093 }
        r3 = r8.f505g;	 Catch:{ Throwable -> 0x0093 }
        r4 = 1;
        r2.bindService(r0, r3, r4);	 Catch:{ Throwable -> 0x0093 }
        r2 = r8.f502d;
        monitor-enter(r2);
        r0 = r8.f501c;	 Catch:{ all -> 0x00a7 }
        if (r0 != 0) goto L_0x0038;
    L_0x002a:
        r0 = r8.f502d;	 Catch:{ InterruptedException -> 0x009e }
        r3 = com.alipay.sdk.data.C0168a.m472b();	 Catch:{ InterruptedException -> 0x009e }
        r3 = r3.m477a();	 Catch:{ InterruptedException -> 0x009e }
        r4 = (long) r3;	 Catch:{ InterruptedException -> 0x009e }
        r0.wait(r4);	 Catch:{ InterruptedException -> 0x009e }
    L_0x0038:
        monitor-exit(r2);	 Catch:{ all -> 0x00a7 }
        r0 = r8.f501c;	 Catch:{ Throwable -> 0x00f1 }
        if (r0 != 0) goto L_0x00aa;
    L_0x003d:
        r0 = r8.f500a;	 Catch:{ Throwable -> 0x00f1 }
        r0 = com.alipay.sdk.util.C0206l.m697g(r0);	 Catch:{ Throwable -> 0x00f1 }
        r2 = r8.f500a;	 Catch:{ Throwable -> 0x00f1 }
        r2 = com.alipay.sdk.util.C0206l.m698h(r2);	 Catch:{ Throwable -> 0x00f1 }
        r3 = "biz";
        r4 = "ClientBindFailed";
        r5 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00f1 }
        r5.<init>();	 Catch:{ Throwable -> 0x00f1 }
        r1 = r5.append(r1);	 Catch:{ Throwable -> 0x00f1 }
        r5 = "|";
        r1 = r1.append(r5);	 Catch:{ Throwable -> 0x00f1 }
        r0 = r1.append(r0);	 Catch:{ Throwable -> 0x00f1 }
        r1 = "|";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x00f1 }
        r0 = r0.append(r2);	 Catch:{ Throwable -> 0x00f1 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x00f1 }
        com.alipay.sdk.app.statistic.C0144a.m398a(r3, r4, r0);	 Catch:{ Throwable -> 0x00f1 }
        r0 = "failed";
        r1 = r8.f501c;	 Catch:{ Throwable -> 0x014e }
        r2 = r8.f506h;	 Catch:{ Throwable -> 0x014e }
        r1.unregisterCallback(r2);	 Catch:{ Throwable -> 0x014e }
    L_0x007a:
        r1 = r8.f500a;	 Catch:{ Throwable -> 0x014b }
        r2 = r8.f505g;	 Catch:{ Throwable -> 0x014b }
        r1.unbindService(r2);	 Catch:{ Throwable -> 0x014b }
    L_0x0081:
        r8.f506h = r6;
        r8.f505g = r6;
        r8.f501c = r6;
        r1 = r8.f503e;
        if (r1 == 0) goto L_0x0092;
    L_0x008b:
        r1 = r8.f500a;
        r1.setRequestedOrientation(r7);
        r8.f503e = r7;
    L_0x0092:
        return r0;
    L_0x0093:
        r0 = move-exception;
        r1 = "biz";
        r2 = "ClientBindServiceFailed";
        com.alipay.sdk.app.statistic.C0144a.m399a(r1, r2, r0);
        r0 = "failed";
        goto L_0x0092;
    L_0x009e:
        r0 = move-exception;
        r3 = "biz";
        r4 = "BindWaitTimeoutEx";
        com.alipay.sdk.app.statistic.C0144a.m399a(r3, r4, r0);	 Catch:{ all -> 0x00a7 }
        goto L_0x0038;
    L_0x00a7:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
    L_0x00aa:
        r0 = r8.f504f;	 Catch:{ Throwable -> 0x00f1 }
        if (r0 == 0) goto L_0x00b3;
    L_0x00ae:
        r0 = r8.f504f;	 Catch:{ Throwable -> 0x00f1 }
        r0.m376a();	 Catch:{ Throwable -> 0x00f1 }
    L_0x00b3:
        r0 = r8.f500a;	 Catch:{ Throwable -> 0x00f1 }
        r0 = r0.getRequestedOrientation();	 Catch:{ Throwable -> 0x00f1 }
        if (r0 != 0) goto L_0x00c4;
    L_0x00bb:
        r0 = r8.f500a;	 Catch:{ Throwable -> 0x00f1 }
        r1 = 1;
        r0.setRequestedOrientation(r1);	 Catch:{ Throwable -> 0x00f1 }
        r0 = 1;
        r8.f503e = r0;	 Catch:{ Throwable -> 0x00f1 }
    L_0x00c4:
        r0 = r8.f501c;	 Catch:{ Throwable -> 0x00f1 }
        r1 = r8.f506h;	 Catch:{ Throwable -> 0x00f1 }
        r0.registerCallback(r1);	 Catch:{ Throwable -> 0x00f1 }
        r0 = r8.f501c;	 Catch:{ Throwable -> 0x00f1 }
        r0 = r0.Pay(r9);	 Catch:{ Throwable -> 0x00f1 }
        r1 = r8.f501c;	 Catch:{ Throwable -> 0x0149 }
        r2 = r8.f506h;	 Catch:{ Throwable -> 0x0149 }
        r1.unregisterCallback(r2);	 Catch:{ Throwable -> 0x0149 }
    L_0x00d8:
        r1 = r8.f500a;	 Catch:{ Throwable -> 0x0147 }
        r2 = r8.f505g;	 Catch:{ Throwable -> 0x0147 }
        r1.unbindService(r2);	 Catch:{ Throwable -> 0x0147 }
    L_0x00df:
        r8.f506h = r6;
        r8.f505g = r6;
        r8.f501c = r6;
        r1 = r8.f503e;
        if (r1 == 0) goto L_0x0092;
    L_0x00e9:
        r1 = r8.f500a;
        r1.setRequestedOrientation(r7);
        r8.f503e = r7;
        goto L_0x0092;
    L_0x00f1:
        r0 = move-exception;
        r1 = "biz";
        r2 = "ClientBindException";
        com.alipay.sdk.app.statistic.C0144a.m399a(r1, r2, r0);	 Catch:{ all -> 0x011e }
        r0 = com.alipay.sdk.app.C0142h.m385a();	 Catch:{ all -> 0x011e }
        r1 = r8.f501c;	 Catch:{ Throwable -> 0x0145 }
        r2 = r8.f506h;	 Catch:{ Throwable -> 0x0145 }
        r1.unregisterCallback(r2);	 Catch:{ Throwable -> 0x0145 }
    L_0x0104:
        r1 = r8.f500a;	 Catch:{ Throwable -> 0x0143 }
        r2 = r8.f505g;	 Catch:{ Throwable -> 0x0143 }
        r1.unbindService(r2);	 Catch:{ Throwable -> 0x0143 }
    L_0x010b:
        r8.f506h = r6;
        r8.f505g = r6;
        r8.f501c = r6;
        r1 = r8.f503e;
        if (r1 == 0) goto L_0x0092;
    L_0x0115:
        r1 = r8.f500a;
        r1.setRequestedOrientation(r7);
        r8.f503e = r7;
        goto L_0x0092;
    L_0x011e:
        r0 = move-exception;
        r1 = r8.f501c;	 Catch:{ Throwable -> 0x0141 }
        r2 = r8.f506h;	 Catch:{ Throwable -> 0x0141 }
        r1.unregisterCallback(r2);	 Catch:{ Throwable -> 0x0141 }
    L_0x0126:
        r1 = r8.f500a;	 Catch:{ Throwable -> 0x013f }
        r2 = r8.f505g;	 Catch:{ Throwable -> 0x013f }
        r1.unbindService(r2);	 Catch:{ Throwable -> 0x013f }
    L_0x012d:
        r8.f506h = r6;
        r8.f505g = r6;
        r8.f501c = r6;
        r1 = r8.f503e;
        if (r1 == 0) goto L_0x013e;
    L_0x0137:
        r1 = r8.f500a;
        r1.setRequestedOrientation(r7);
        r8.f503e = r7;
    L_0x013e:
        throw r0;
    L_0x013f:
        r1 = move-exception;
        goto L_0x012d;
    L_0x0141:
        r1 = move-exception;
        goto L_0x0126;
    L_0x0143:
        r1 = move-exception;
        goto L_0x010b;
    L_0x0145:
        r1 = move-exception;
        goto L_0x0104;
    L_0x0147:
        r1 = move-exception;
        goto L_0x00df;
    L_0x0149:
        r1 = move-exception;
        goto L_0x00d8;
    L_0x014b:
        r1 = move-exception;
        goto L_0x0081;
    L_0x014e:
        r1 = move-exception;
        goto L_0x007a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.util.e.b(java.lang.String):java.lang.String");
    }

    private void m654a() {
        this.f500a = null;
    }
}
