package com.tencent.android.tpush.service.channel.p076c;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.tencent.android.tpush.service.channel.c.b */
public class ProGuard extends InputStream {
    final /* synthetic */ ProGuard f7677a;

    protected ProGuard(ProGuard proGuard) {
        this.f7677a = proGuard;
    }

    public int available() {
        int a;
        synchronized (this.f7677a) {
            if (this.f7677a.f7674i) {
                throw new IOException("InputStream has been closed, it is not ready.");
            }
            a = this.f7677a.m5235g();
        }
        return a;
    }

    public void close() {
        synchronized (this.f7677a) {
            this.f7677a.f7674i = true;
        }
    }

    public void mark(int i) {
        synchronized (this.f7677a) {
            if (this.f7677a.f7666a.length - 1 > i) {
                this.f7677a.f7670e = i;
                this.f7677a.f7669d = this.f7677a.f7667b;
            }
        }
    }

    public boolean markSupported() {
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read() {
        /*
        r4 = this;
    L_0x0000:
        r1 = r4.f7677a;
        monitor-enter(r1);
        r0 = r4.f7677a;	 Catch:{ all -> 0x0011 }
        r0 = r0.f7674i;	 Catch:{ all -> 0x0011 }
        if (r0 == 0) goto L_0x0014;
    L_0x0009:
        r0 = new java.io.IOException;	 Catch:{ all -> 0x0011 }
        r2 = "InputStream has been closed; cannot read from a closed InputStream.";
        r0.<init>(r2);	 Catch:{ all -> 0x0011 }
        throw r0;	 Catch:{ all -> 0x0011 }
    L_0x0011:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0011 }
        throw r0;
    L_0x0014:
        r0 = r4.f7677a;	 Catch:{ all -> 0x0011 }
        r0 = r0.m5235g();	 Catch:{ all -> 0x0011 }
        if (r0 <= 0) goto L_0x0047;
    L_0x001c:
        r0 = r4.f7677a;	 Catch:{ all -> 0x0011 }
        r0 = r0.f7666a;	 Catch:{ all -> 0x0011 }
        r2 = r4.f7677a;	 Catch:{ all -> 0x0011 }
        r2 = r2.f7667b;	 Catch:{ all -> 0x0011 }
        r0 = r0[r2];	 Catch:{ all -> 0x0011 }
        r0 = r0 & 255;
        r2 = r4.f7677a;	 Catch:{ all -> 0x0011 }
        r3 = r2.f7667b;	 Catch:{ all -> 0x0011 }
        r3 = r3 + 1;
        r2.f7667b = r3;	 Catch:{ all -> 0x0011 }
        r2 = r4.f7677a;	 Catch:{ all -> 0x0011 }
        r2 = r2.f7667b;	 Catch:{ all -> 0x0011 }
        r3 = r4.f7677a;	 Catch:{ all -> 0x0011 }
        r3 = r3.f7666a;	 Catch:{ all -> 0x0011 }
        r3 = r3.length;	 Catch:{ all -> 0x0011 }
        if (r2 != r3) goto L_0x0040;
    L_0x003b:
        r2 = r4.f7677a;	 Catch:{ all -> 0x0011 }
        r3 = 0;
        r2.f7667b = r3;	 Catch:{ all -> 0x0011 }
    L_0x0040:
        r2 = r4.f7677a;	 Catch:{ all -> 0x0011 }
        r2.m5237i();	 Catch:{ all -> 0x0011 }
        monitor-exit(r1);	 Catch:{ all -> 0x0011 }
    L_0x0046:
        return r0;
    L_0x0047:
        r0 = r4.f7677a;	 Catch:{ all -> 0x0011 }
        r0 = r0.f7676k;	 Catch:{ all -> 0x0011 }
        if (r0 == 0) goto L_0x0050;
    L_0x004d:
        r0 = -1;
        monitor-exit(r1);	 Catch:{ all -> 0x0011 }
        goto L_0x0046;
    L_0x0050:
        monitor-exit(r1);	 Catch:{ all -> 0x0011 }
        r0 = 100;
        java.lang.Thread.sleep(r0);	 Catch:{ Exception -> 0x0057 }
        goto L_0x0000;
    L_0x0057:
        r0 = move-exception;
        r0 = new java.io.IOException;
        r1 = "Blocking read operation interrupted.";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.android.tpush.service.channel.c.b.read():int");
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(byte[] r7, int r8, int r9) {
        /*
        r6 = this;
    L_0x0000:
        r1 = r6.f7677a;
        monitor-enter(r1);
        r0 = r6.f7677a;	 Catch:{ all -> 0x0011 }
        r0 = r0.f7674i;	 Catch:{ all -> 0x0011 }
        if (r0 == 0) goto L_0x0014;
    L_0x0009:
        r0 = new java.io.IOException;	 Catch:{ all -> 0x0011 }
        r2 = "InputStream has been closed; cannot read from a closed InputStream.";
        r0.<init>(r2);	 Catch:{ all -> 0x0011 }
        throw r0;	 Catch:{ all -> 0x0011 }
    L_0x0011:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0011 }
        throw r0;
    L_0x0014:
        r0 = r6.f7677a;	 Catch:{ all -> 0x0011 }
        r0 = r0.m5235g();	 Catch:{ all -> 0x0011 }
        if (r0 <= 0) goto L_0x0069;
    L_0x001c:
        r0 = java.lang.Math.min(r9, r0);	 Catch:{ all -> 0x0011 }
        r2 = r6.f7677a;	 Catch:{ all -> 0x0011 }
        r2 = r2.f7666a;	 Catch:{ all -> 0x0011 }
        r2 = r2.length;	 Catch:{ all -> 0x0011 }
        r3 = r6.f7677a;	 Catch:{ all -> 0x0011 }
        r3 = r3.f7667b;	 Catch:{ all -> 0x0011 }
        r2 = r2 - r3;
        r2 = java.lang.Math.min(r0, r2);	 Catch:{ all -> 0x0011 }
        r3 = r0 - r2;
        r4 = r6.f7677a;	 Catch:{ all -> 0x0011 }
        r4 = r4.f7666a;	 Catch:{ all -> 0x0011 }
        r5 = r6.f7677a;	 Catch:{ all -> 0x0011 }
        r5 = r5.f7667b;	 Catch:{ all -> 0x0011 }
        java.lang.System.arraycopy(r4, r5, r7, r8, r2);	 Catch:{ all -> 0x0011 }
        if (r3 <= 0) goto L_0x0061;
    L_0x003d:
        r4 = r6.f7677a;	 Catch:{ all -> 0x0011 }
        r4 = r4.f7666a;	 Catch:{ all -> 0x0011 }
        r5 = 0;
        r2 = r2 + r8;
        java.lang.System.arraycopy(r4, r5, r7, r2, r3);	 Catch:{ all -> 0x0011 }
        r2 = r6.f7677a;	 Catch:{ all -> 0x0011 }
        r2.f7667b = r3;	 Catch:{ all -> 0x0011 }
    L_0x004a:
        r2 = r6.f7677a;	 Catch:{ all -> 0x0011 }
        r2 = r2.f7667b;	 Catch:{ all -> 0x0011 }
        r3 = r6.f7677a;	 Catch:{ all -> 0x0011 }
        r3 = r3.f7666a;	 Catch:{ all -> 0x0011 }
        r3 = r3.length;	 Catch:{ all -> 0x0011 }
        if (r2 != r3) goto L_0x005a;
    L_0x0055:
        r2 = r6.f7677a;	 Catch:{ all -> 0x0011 }
        r3 = 0;
        r2.f7667b = r3;	 Catch:{ all -> 0x0011 }
    L_0x005a:
        r2 = r6.f7677a;	 Catch:{ all -> 0x0011 }
        r2.m5237i();	 Catch:{ all -> 0x0011 }
        monitor-exit(r1);	 Catch:{ all -> 0x0011 }
    L_0x0060:
        return r0;
    L_0x0061:
        r2 = r6.f7677a;	 Catch:{ all -> 0x0011 }
        r3 = r2.f7667b;	 Catch:{ all -> 0x0011 }
        r3 = r3 + r0;
        r2.f7667b = r3;	 Catch:{ all -> 0x0011 }
        goto L_0x004a;
    L_0x0069:
        r0 = r6.f7677a;	 Catch:{ all -> 0x0011 }
        r0 = r0.f7676k;	 Catch:{ all -> 0x0011 }
        if (r0 == 0) goto L_0x0072;
    L_0x006f:
        r0 = -1;
        monitor-exit(r1);	 Catch:{ all -> 0x0011 }
        goto L_0x0060;
    L_0x0072:
        monitor-exit(r1);	 Catch:{ all -> 0x0011 }
        r0 = 100;
        java.lang.Thread.sleep(r0);	 Catch:{ Exception -> 0x0079 }
        goto L_0x0000;
    L_0x0079:
        r0 = move-exception;
        r0 = new java.io.IOException;
        r1 = "Blocking read operation interrupted.";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.android.tpush.service.channel.c.b.read(byte[], int, int):int");
    }

    public void reset() {
        synchronized (this.f7677a) {
            if (this.f7677a.f7674i) {
                throw new IOException("InputStream has been closed; cannot reset a closed InputStream.");
            }
            this.f7677a.f7667b = this.f7677a.f7669d;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long skip(long r6) {
        /*
        r5 = this;
    L_0x0000:
        r2 = r5.f7677a;
        monitor-enter(r2);
        r0 = r5.f7677a;	 Catch:{ all -> 0x0011 }
        r0 = r0.f7674i;	 Catch:{ all -> 0x0011 }
        if (r0 == 0) goto L_0x0014;
    L_0x0009:
        r0 = new java.io.IOException;	 Catch:{ all -> 0x0011 }
        r1 = "InputStream has been closed; cannot skip bytes on a closed InputStream.";
        r0.<init>(r1);	 Catch:{ all -> 0x0011 }
        throw r0;	 Catch:{ all -> 0x0011 }
    L_0x0011:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0011 }
        throw r0;
    L_0x0014:
        r0 = r5.f7677a;	 Catch:{ all -> 0x0011 }
        r0 = r0.m5235g();	 Catch:{ all -> 0x0011 }
        if (r0 <= 0) goto L_0x0057;
    L_0x001c:
        r1 = (int) r6;	 Catch:{ all -> 0x0011 }
        r0 = java.lang.Math.min(r1, r0);	 Catch:{ all -> 0x0011 }
        r1 = r5.f7677a;	 Catch:{ all -> 0x0011 }
        r1 = r1.f7666a;	 Catch:{ all -> 0x0011 }
        r1 = r1.length;	 Catch:{ all -> 0x0011 }
        r3 = r5.f7677a;	 Catch:{ all -> 0x0011 }
        r3 = r3.f7667b;	 Catch:{ all -> 0x0011 }
        r1 = r1 - r3;
        r1 = java.lang.Math.min(r0, r1);	 Catch:{ all -> 0x0011 }
        r1 = r0 - r1;
        if (r1 <= 0) goto L_0x004f;
    L_0x0033:
        r3 = r5.f7677a;	 Catch:{ all -> 0x0011 }
        r3.f7667b = r1;	 Catch:{ all -> 0x0011 }
    L_0x0037:
        r1 = r5.f7677a;	 Catch:{ all -> 0x0011 }
        r1 = r1.f7667b;	 Catch:{ all -> 0x0011 }
        r3 = r5.f7677a;	 Catch:{ all -> 0x0011 }
        r3 = r3.f7666a;	 Catch:{ all -> 0x0011 }
        r3 = r3.length;	 Catch:{ all -> 0x0011 }
        if (r1 != r3) goto L_0x0047;
    L_0x0042:
        r1 = r5.f7677a;	 Catch:{ all -> 0x0011 }
        r3 = 0;
        r1.f7667b = r3;	 Catch:{ all -> 0x0011 }
    L_0x0047:
        r1 = r5.f7677a;	 Catch:{ all -> 0x0011 }
        r1.m5237i();	 Catch:{ all -> 0x0011 }
        r0 = (long) r0;	 Catch:{ all -> 0x0011 }
        monitor-exit(r2);	 Catch:{ all -> 0x0011 }
    L_0x004e:
        return r0;
    L_0x004f:
        r1 = r5.f7677a;	 Catch:{ all -> 0x0011 }
        r3 = r1.f7667b;	 Catch:{ all -> 0x0011 }
        r3 = r3 + r0;
        r1.f7667b = r3;	 Catch:{ all -> 0x0011 }
        goto L_0x0037;
    L_0x0057:
        r0 = r5.f7677a;	 Catch:{ all -> 0x0011 }
        r0 = r0.f7676k;	 Catch:{ all -> 0x0011 }
        if (r0 == 0) goto L_0x0061;
    L_0x005d:
        r0 = 0;
        monitor-exit(r2);	 Catch:{ all -> 0x0011 }
        goto L_0x004e;
    L_0x0061:
        monitor-exit(r2);	 Catch:{ all -> 0x0011 }
        r0 = 100;
        java.lang.Thread.sleep(r0);	 Catch:{ Exception -> 0x0068 }
        goto L_0x0000;
    L_0x0068:
        r0 = move-exception;
        r0 = new java.io.IOException;
        r1 = "Blocking read operation interrupted.";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.android.tpush.service.channel.c.b.skip(long):long");
    }
}
