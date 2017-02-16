package com.amap.p003a;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: DiskLruCache */
/* renamed from: com.amap.a.ad */
public final class ad implements Closeable {
    static final Pattern f151a;
    private static final OutputStream f152q;
    ae f153b;
    final ThreadPoolExecutor f154c;
    private final File f155d;
    private final File f156e;
    private final File f157f;
    private final File f158g;
    private final int f159h;
    private long f160i;
    private final int f161j;
    private long f162k;
    private Writer f163l;
    private final LinkedHashMap<String, DiskLruCache> f164m;
    private int f165n;
    private long f166o;
    private final Callable<Void> f167p;

    /* renamed from: com.amap.a.ad.1 */
    class DiskLruCache implements Callable<Void> {
        final /* synthetic */ ad f133a;

        DiskLruCache(ad adVar) {
            this.f133a = adVar;
        }

        private Void m109a() {
            synchronized (this.f133a) {
                if (this.f133a.f163l == null) {
                } else {
                    this.f133a.m137i();
                    if (this.f133a.m135g()) {
                        this.f133a.m133f();
                        this.f133a.f165n = 0;
                    }
                }
            }
            return null;
        }

        public final /* synthetic */ Object call() {
            return m109a();
        }
    }

    /* renamed from: com.amap.a.ad.2 */
    static class DiskLruCache extends OutputStream {
        DiskLruCache() {
        }

        public final void write(int i) {
        }
    }

    /* renamed from: com.amap.a.ad.a */
    public final class DiskLruCache {
        final DiskLruCache f135a;
        final boolean[] f136b;
        boolean f137c;
        final /* synthetic */ ad f138d;
        private boolean f139e;

        /* renamed from: com.amap.a.ad.a.a */
        private class DiskLruCache extends FilterOutputStream {
            final /* synthetic */ DiskLruCache f134a;

            static {
                fixHelper.fixfunc(new int[]{1222, 1223, 1224, 1225, 1226, 1227});
                if (VERSION.SDK_INT <= 0) {
                    Exists2.class.toString();
                }
            }

            private native DiskLruCache(DiskLruCache diskLruCache, OutputStream outputStream);

            native /* synthetic */ DiskLruCache(DiskLruCache diskLruCache, OutputStream outputStream, byte b);

            public final native void close();

            public final native void flush();

            public final native void write(int i);

            public final native void write(byte[] bArr, int i, int i2);
        }

        private DiskLruCache(ad adVar, DiskLruCache diskLruCache) {
            this.f138d = adVar;
            this.f135a = diskLruCache;
            this.f136b = diskLruCache.f147c ? null : new boolean[adVar.f161j];
        }

        public final OutputStream m110a() {
            if (this.f138d.f161j <= 0) {
                throw new IllegalArgumentException("Expected index 0 to be greater than 0 and less than the maximum value count of " + this.f138d.f161j);
            }
            OutputStream c;
            synchronized (this.f138d) {
                File b;
                OutputStream fileOutputStream;
                if (this.f135a.f148d != this) {
                    throw new IllegalStateException();
                }
                if (!this.f135a.f147c) {
                    this.f136b[0] = true;
                }
                b = this.f135a.m117b(0);
                try {
                    fileOutputStream = new FileOutputStream(b);
                } catch (FileNotFoundException e) {
                    this.f138d.f155d.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(b);
                    } catch (FileNotFoundException e2) {
                        c = ad.f152q;
                    }
                }
                c = new DiskLruCache(this, fileOutputStream, (byte) 0);
            }
            return c;
        }

        public final void m111b() {
            if (this.f137c) {
                this.f138d.m120a(this, false);
                this.f138d.m142c(this.f135a.f145a);
            } else {
                this.f138d.m120a(this, true);
            }
            this.f139e = true;
        }

        public final void m112c() {
            this.f138d.m120a(this, false);
        }
    }

    /* renamed from: com.amap.a.ad.b */
    public final class DiskLruCache implements Closeable {
        final InputStream[] f140a;
        final /* synthetic */ ad f141b;
        private final String f142c;
        private final long f143d;
        private final long[] f144e;

        private DiskLruCache(ad adVar, String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.f141b = adVar;
            this.f142c = str;
            this.f143d = j;
            this.f140a = inputStreamArr;
            this.f144e = jArr;
        }

        public final void close() {
            for (Closeable a : this.f140a) {
                ag.m146a(a);
            }
        }
    }

    /* renamed from: com.amap.a.ad.c */
    private final class DiskLruCache {
        final String f145a;
        final long[] f146b;
        boolean f147c;
        DiskLruCache f148d;
        long f149e;
        final /* synthetic */ ad f150f;

        private DiskLruCache(ad adVar, String str) {
            this.f150f = adVar;
            this.f145a = str;
            this.f146b = new long[adVar.f161j];
        }

        private static IOException m113b(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final File m114a(int i) {
            return new File(this.f150f.f155d, this.f145a + "." + i);
        }

        public final String m115a() {
            StringBuilder stringBuilder = new StringBuilder();
            for (long append : this.f146b) {
                stringBuilder.append(' ').append(append);
            }
            return stringBuilder.toString();
        }

        final void m116a(String[] strArr) {
            if (strArr.length != this.f150f.f161j) {
                throw DiskLruCache.m113b(strArr);
            }
            int i = 0;
            while (i < strArr.length) {
                try {
                    this.f146b[i] = Long.parseLong(strArr[i]);
                    i++;
                } catch (NumberFormatException e) {
                    throw DiskLruCache.m113b(strArr);
                }
            }
        }

        public final File m117b(int i) {
            return new File(this.f150f.f155d, this.f145a + "." + i + ".tmp");
        }
    }

    static {
        f151a = Pattern.compile("[a-z0-9_-]{1,120}");
        f152q = new DiskLruCache();
    }

    private ad(File file, long j) {
        this.f162k = 0;
        this.f164m = new LinkedHashMap(0, 0.75f, true);
        this.f166o = 0;
        this.f154c = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.f167p = new DiskLruCache(this);
        this.f155d = file;
        this.f159h = 1;
        this.f156e = new File(file, "journal");
        this.f157f = new File(file, "journal.tmp");
        this.f158g = new File(file, "journal.bkp");
        this.f161j = 1;
        this.f160i = j;
    }

    public static ad m118a(File file, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                ad.m123a(file2, file3, false);
            }
        }
        ad adVar = new ad(file, j);
        if (adVar.f156e.exists()) {
            try {
                adVar.m127d();
                adVar.m131e();
                adVar.f163l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(adVar.f156e, true), ag.f174a));
                return adVar;
            } catch (Throwable th) {
                adVar.close();
                ag.m147a(adVar.f155d);
            }
        }
        file.mkdirs();
        adVar = new ad(file, j);
        adVar.m133f();
        return adVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m120a(com.amap.p003a.ad.DiskLruCache r11, boolean r12) {
        /*
        r10 = this;
        r0 = 0;
        monitor-enter(r10);
        r2 = r11.f135a;	 Catch:{ all -> 0x000e }
        r1 = r2.f148d;	 Catch:{ all -> 0x000e }
        if (r1 == r11) goto L_0x0011;
    L_0x0008:
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x000e }
        r0.<init>();	 Catch:{ all -> 0x000e }
        throw r0;	 Catch:{ all -> 0x000e }
    L_0x000e:
        r0 = move-exception;
        monitor-exit(r10);
        throw r0;
    L_0x0011:
        if (r12 == 0) goto L_0x004c;
    L_0x0013:
        r1 = r2.f147c;	 Catch:{ all -> 0x000e }
        if (r1 != 0) goto L_0x004c;
    L_0x0017:
        r1 = r0;
    L_0x0018:
        r3 = r10.f161j;	 Catch:{ all -> 0x000e }
        if (r1 >= r3) goto L_0x004c;
    L_0x001c:
        r3 = r11.f136b;	 Catch:{ all -> 0x000e }
        r3 = r3[r1];	 Catch:{ all -> 0x000e }
        if (r3 != 0) goto L_0x003a;
    L_0x0022:
        r11.m112c();	 Catch:{ all -> 0x000e }
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x000e }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x000e }
        r3 = "Newly created entry didn't create value for index ";
        r2.<init>(r3);	 Catch:{ all -> 0x000e }
        r1 = r2.append(r1);	 Catch:{ all -> 0x000e }
        r1 = r1.toString();	 Catch:{ all -> 0x000e }
        r0.<init>(r1);	 Catch:{ all -> 0x000e }
        throw r0;	 Catch:{ all -> 0x000e }
    L_0x003a:
        r3 = r2.m117b(r1);	 Catch:{ all -> 0x000e }
        r3 = r3.exists();	 Catch:{ all -> 0x000e }
        if (r3 != 0) goto L_0x0049;
    L_0x0044:
        r11.m112c();	 Catch:{ all -> 0x000e }
    L_0x0047:
        monitor-exit(r10);
        return;
    L_0x0049:
        r1 = r1 + 1;
        goto L_0x0018;
    L_0x004c:
        r1 = r10.f161j;	 Catch:{ all -> 0x000e }
        if (r0 >= r1) goto L_0x007d;
    L_0x0050:
        r1 = r2.m117b(r0);	 Catch:{ all -> 0x000e }
        if (r12 == 0) goto L_0x0079;
    L_0x0056:
        r3 = r1.exists();	 Catch:{ all -> 0x000e }
        if (r3 == 0) goto L_0x0076;
    L_0x005c:
        r3 = r2.m114a(r0);	 Catch:{ all -> 0x000e }
        r1.renameTo(r3);	 Catch:{ all -> 0x000e }
        r1 = r2.f146b;	 Catch:{ all -> 0x000e }
        r4 = r1[r0];	 Catch:{ all -> 0x000e }
        r6 = r3.length();	 Catch:{ all -> 0x000e }
        r1 = r2.f146b;	 Catch:{ all -> 0x000e }
        r1[r0] = r6;	 Catch:{ all -> 0x000e }
        r8 = r10.f162k;	 Catch:{ all -> 0x000e }
        r4 = r8 - r4;
        r4 = r4 + r6;
        r10.f162k = r4;	 Catch:{ all -> 0x000e }
    L_0x0076:
        r0 = r0 + 1;
        goto L_0x004c;
    L_0x0079:
        com.amap.p003a.ad.m122a(r1);	 Catch:{ all -> 0x000e }
        goto L_0x0076;
    L_0x007d:
        r0 = r10.f165n;	 Catch:{ all -> 0x000e }
        r0 = r0 + 1;
        r10.f165n = r0;	 Catch:{ all -> 0x000e }
        r0 = 0;
        r2.f148d = r0;	 Catch:{ all -> 0x000e }
        r0 = r2.f147c;	 Catch:{ all -> 0x000e }
        r0 = r0 | r12;
        if (r0 == 0) goto L_0x00d9;
    L_0x008b:
        r0 = 1;
        r2.f147c = r0;	 Catch:{ all -> 0x000e }
        r0 = r10.f163l;	 Catch:{ all -> 0x000e }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x000e }
        r3 = "CLEAN ";
        r1.<init>(r3);	 Catch:{ all -> 0x000e }
        r3 = r2.f145a;	 Catch:{ all -> 0x000e }
        r1 = r1.append(r3);	 Catch:{ all -> 0x000e }
        r3 = r2.m115a();	 Catch:{ all -> 0x000e }
        r1 = r1.append(r3);	 Catch:{ all -> 0x000e }
        r3 = 10;
        r1 = r1.append(r3);	 Catch:{ all -> 0x000e }
        r1 = r1.toString();	 Catch:{ all -> 0x000e }
        r0.write(r1);	 Catch:{ all -> 0x000e }
        if (r12 == 0) goto L_0x00bd;
    L_0x00b4:
        r0 = r10.f166o;	 Catch:{ all -> 0x000e }
        r4 = 1;
        r4 = r4 + r0;
        r10.f166o = r4;	 Catch:{ all -> 0x000e }
        r2.f149e = r0;	 Catch:{ all -> 0x000e }
    L_0x00bd:
        r0 = r10.f163l;	 Catch:{ all -> 0x000e }
        r0.flush();	 Catch:{ all -> 0x000e }
        r0 = r10.f162k;	 Catch:{ all -> 0x000e }
        r2 = r10.f160i;	 Catch:{ all -> 0x000e }
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 > 0) goto L_0x00d0;
    L_0x00ca:
        r0 = r10.m135g();	 Catch:{ all -> 0x000e }
        if (r0 == 0) goto L_0x0047;
    L_0x00d0:
        r0 = r10.f154c;	 Catch:{ all -> 0x000e }
        r1 = r10.f167p;	 Catch:{ all -> 0x000e }
        r0.submit(r1);	 Catch:{ all -> 0x000e }
        goto L_0x0047;
    L_0x00d9:
        r0 = r10.f164m;	 Catch:{ all -> 0x000e }
        r1 = r2.f145a;	 Catch:{ all -> 0x000e }
        r0.remove(r1);	 Catch:{ all -> 0x000e }
        r0 = r10.f163l;	 Catch:{ all -> 0x000e }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x000e }
        r3 = "REMOVE ";
        r1.<init>(r3);	 Catch:{ all -> 0x000e }
        r2 = r2.f145a;	 Catch:{ all -> 0x000e }
        r1 = r1.append(r2);	 Catch:{ all -> 0x000e }
        r2 = 10;
        r1 = r1.append(r2);	 Catch:{ all -> 0x000e }
        r1 = r1.toString();	 Catch:{ all -> 0x000e }
        r0.write(r1);	 Catch:{ all -> 0x000e }
        goto L_0x00bd;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.a.ad.a(com.amap.a.ad$a, boolean):void");
    }

    private static void m122a(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void m123a(File file, File file2, boolean z) {
        if (z) {
            ad.m122a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m127d() {
        /*
        r10 = this;
        r9 = 5;
        r0 = 0;
        r8 = -1;
        r3 = new com.amap.a.af;
        r1 = new java.io.FileInputStream;
        r2 = r10.f156e;
        r1.<init>(r2);
        r2 = com.amap.p003a.ag.f174a;
        r3.<init>(r1, r2);
        r1 = r3.m145a();	 Catch:{ all -> 0x008e }
        r2 = r3.m145a();	 Catch:{ all -> 0x008e }
        r4 = r3.m145a();	 Catch:{ all -> 0x008e }
        r5 = r3.m145a();	 Catch:{ all -> 0x008e }
        r6 = r3.m145a();	 Catch:{ all -> 0x008e }
        r7 = "libcore.io.DiskLruCache";
        r7 = r7.equals(r1);	 Catch:{ all -> 0x008e }
        if (r7 == 0) goto L_0x0055;
    L_0x002d:
        r7 = "1";
        r7 = r7.equals(r2);	 Catch:{ all -> 0x008e }
        if (r7 == 0) goto L_0x0055;
    L_0x0035:
        r7 = r10.f159h;	 Catch:{ all -> 0x008e }
        r7 = java.lang.Integer.toString(r7);	 Catch:{ all -> 0x008e }
        r4 = r7.equals(r4);	 Catch:{ all -> 0x008e }
        if (r4 == 0) goto L_0x0055;
    L_0x0041:
        r4 = r10.f161j;	 Catch:{ all -> 0x008e }
        r4 = java.lang.Integer.toString(r4);	 Catch:{ all -> 0x008e }
        r4 = r4.equals(r5);	 Catch:{ all -> 0x008e }
        if (r4 == 0) goto L_0x0055;
    L_0x004d:
        r4 = "";
        r4 = r4.equals(r6);	 Catch:{ all -> 0x008e }
        if (r4 != 0) goto L_0x0093;
    L_0x0055:
        r0 = new java.io.IOException;	 Catch:{ all -> 0x008e }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x008e }
        r7 = "unexpected journal header: [";
        r4.<init>(r7);	 Catch:{ all -> 0x008e }
        r1 = r4.append(r1);	 Catch:{ all -> 0x008e }
        r4 = ", ";
        r1 = r1.append(r4);	 Catch:{ all -> 0x008e }
        r1 = r1.append(r2);	 Catch:{ all -> 0x008e }
        r2 = ", ";
        r1 = r1.append(r2);	 Catch:{ all -> 0x008e }
        r1 = r1.append(r5);	 Catch:{ all -> 0x008e }
        r2 = ", ";
        r1 = r1.append(r2);	 Catch:{ all -> 0x008e }
        r1 = r1.append(r6);	 Catch:{ all -> 0x008e }
        r2 = "]";
        r1 = r1.append(r2);	 Catch:{ all -> 0x008e }
        r1 = r1.toString();	 Catch:{ all -> 0x008e }
        r0.<init>(r1);	 Catch:{ all -> 0x008e }
        throw r0;	 Catch:{ all -> 0x008e }
    L_0x008e:
        r0 = move-exception;
        com.amap.p003a.ag.m146a(r3);
        throw r0;
    L_0x0093:
        r1 = r0;
    L_0x0094:
        r4 = r3.m145a();	 Catch:{ EOFException -> 0x00b5 }
        r0 = 32;
        r5 = r4.indexOf(r0);	 Catch:{ EOFException -> 0x00b5 }
        if (r5 != r8) goto L_0x00c4;
    L_0x00a0:
        r0 = new java.io.IOException;	 Catch:{ EOFException -> 0x00b5 }
        r2 = new java.lang.StringBuilder;	 Catch:{ EOFException -> 0x00b5 }
        r5 = "unexpected journal line: ";
        r2.<init>(r5);	 Catch:{ EOFException -> 0x00b5 }
        r2 = r2.append(r4);	 Catch:{ EOFException -> 0x00b5 }
        r2 = r2.toString();	 Catch:{ EOFException -> 0x00b5 }
        r0.<init>(r2);	 Catch:{ EOFException -> 0x00b5 }
        throw r0;	 Catch:{ EOFException -> 0x00b5 }
    L_0x00b5:
        r0 = move-exception;
        r0 = r10.f164m;	 Catch:{ all -> 0x008e }
        r0 = r0.size();	 Catch:{ all -> 0x008e }
        r0 = r1 - r0;
        r10.f165n = r0;	 Catch:{ all -> 0x008e }
        com.amap.p003a.ag.m146a(r3);
        return;
    L_0x00c4:
        r0 = r5 + 1;
        r2 = 32;
        r6 = r4.indexOf(r2, r0);	 Catch:{ EOFException -> 0x00b5 }
        if (r6 != r8) goto L_0x00e6;
    L_0x00ce:
        r0 = r4.substring(r0);	 Catch:{ EOFException -> 0x00b5 }
        r2 = 6;
        if (r5 != r2) goto L_0x0159;
    L_0x00d5:
        r2 = "REMOVE";
        r2 = r4.startsWith(r2);	 Catch:{ EOFException -> 0x00b5 }
        if (r2 == 0) goto L_0x0159;
    L_0x00dd:
        r2 = r10.f164m;	 Catch:{ EOFException -> 0x00b5 }
        r2.remove(r0);	 Catch:{ EOFException -> 0x00b5 }
    L_0x00e2:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0094;
    L_0x00e6:
        r0 = r4.substring(r0, r6);	 Catch:{ EOFException -> 0x00b5 }
        r2 = r0;
    L_0x00eb:
        r0 = r10.f164m;	 Catch:{ EOFException -> 0x00b5 }
        r0 = r0.get(r2);	 Catch:{ EOFException -> 0x00b5 }
        r0 = (com.amap.p003a.ad.DiskLruCache) r0;	 Catch:{ EOFException -> 0x00b5 }
        if (r0 != 0) goto L_0x0100;
    L_0x00f5:
        r0 = new com.amap.a.ad$c;	 Catch:{ EOFException -> 0x00b5 }
        r7 = 0;
        r0.<init>(r2, r7);	 Catch:{ EOFException -> 0x00b5 }
        r7 = r10.f164m;	 Catch:{ EOFException -> 0x00b5 }
        r7.put(r2, r0);	 Catch:{ EOFException -> 0x00b5 }
    L_0x0100:
        if (r6 == r8) goto L_0x0122;
    L_0x0102:
        if (r5 != r9) goto L_0x0122;
    L_0x0104:
        r2 = "CLEAN";
        r2 = r4.startsWith(r2);	 Catch:{ EOFException -> 0x00b5 }
        if (r2 == 0) goto L_0x0122;
    L_0x010c:
        r2 = r6 + 1;
        r2 = r4.substring(r2);	 Catch:{ EOFException -> 0x00b5 }
        r4 = " ";
        r2 = r2.split(r4);	 Catch:{ EOFException -> 0x00b5 }
        r4 = 1;
        r0.f147c = r4;	 Catch:{ EOFException -> 0x00b5 }
        r4 = 0;
        r0.f148d = r4;	 Catch:{ EOFException -> 0x00b5 }
        r0.m116a(r2);	 Catch:{ EOFException -> 0x00b5 }
        goto L_0x00e2;
    L_0x0122:
        if (r6 != r8) goto L_0x0137;
    L_0x0124:
        if (r5 != r9) goto L_0x0137;
    L_0x0126:
        r2 = "DIRTY";
        r2 = r4.startsWith(r2);	 Catch:{ EOFException -> 0x00b5 }
        if (r2 == 0) goto L_0x0137;
    L_0x012e:
        r2 = new com.amap.a.ad$a;	 Catch:{ EOFException -> 0x00b5 }
        r4 = 0;
        r2.<init>(r0, r4);	 Catch:{ EOFException -> 0x00b5 }
        r0.f148d = r2;	 Catch:{ EOFException -> 0x00b5 }
        goto L_0x00e2;
    L_0x0137:
        if (r6 != r8) goto L_0x0144;
    L_0x0139:
        r0 = 4;
        if (r5 != r0) goto L_0x0144;
    L_0x013c:
        r0 = "READ";
        r0 = r4.startsWith(r0);	 Catch:{ EOFException -> 0x00b5 }
        if (r0 != 0) goto L_0x00e2;
    L_0x0144:
        r0 = new java.io.IOException;	 Catch:{ EOFException -> 0x00b5 }
        r2 = new java.lang.StringBuilder;	 Catch:{ EOFException -> 0x00b5 }
        r5 = "unexpected journal line: ";
        r2.<init>(r5);	 Catch:{ EOFException -> 0x00b5 }
        r2 = r2.append(r4);	 Catch:{ EOFException -> 0x00b5 }
        r2 = r2.toString();	 Catch:{ EOFException -> 0x00b5 }
        r0.<init>(r2);	 Catch:{ EOFException -> 0x00b5 }
        throw r0;	 Catch:{ EOFException -> 0x00b5 }
    L_0x0159:
        r2 = r0;
        goto L_0x00eb;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.a.ad.d():void");
    }

    private static void m129d(String str) {
        if (!f151a.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    private void m131e() {
        ad.m122a(this.f157f);
        Iterator it = this.f164m.values().iterator();
        while (it.hasNext()) {
            DiskLruCache diskLruCache = (DiskLruCache) it.next();
            int i;
            if (diskLruCache.f148d == null) {
                for (i = 0; i < this.f161j; i++) {
                    this.f162k += diskLruCache.f146b[i];
                }
            } else {
                diskLruCache.f148d = null;
                for (i = 0; i < this.f161j; i++) {
                    ad.m122a(diskLruCache.m114a(i));
                    ad.m122a(diskLruCache.m117b(i));
                }
                it.remove();
            }
        }
    }

    private synchronized void m133f() {
        if (this.f163l != null) {
            this.f163l.close();
        }
        Writer bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f157f), ag.f174a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f159h));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f161j));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (DiskLruCache diskLruCache : this.f164m.values()) {
                if (diskLruCache.f148d != null) {
                    bufferedWriter.write("DIRTY " + diskLruCache.f145a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + diskLruCache.f145a + diskLruCache.m115a() + '\n');
                }
            }
            if (this.f156e.exists()) {
                ad.m123a(this.f156e, this.f158g, true);
            }
            ad.m123a(this.f157f, this.f156e, false);
            this.f158g.delete();
            this.f163l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f156e, true), ag.f174a));
        } finally {
            bufferedWriter.close();
        }
    }

    private boolean m135g() {
        return this.f165n >= 2000 && this.f165n >= this.f164m.size();
    }

    private void m136h() {
        if (this.f163l == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private void m137i() {
        while (this.f162k > this.f160i) {
            String str = (String) ((Entry) this.f164m.entrySet().iterator().next()).getKey();
            m142c(str);
            if (this.f153b != null) {
                this.f153b.m143a(str);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.amap.p003a.ad.DiskLruCache m138a(java.lang.String r10) {
        /*
        r9 = this;
        r1 = 0;
        r2 = 0;
        monitor-enter(r9);
        r9.m136h();	 Catch:{ all -> 0x007c }
        com.amap.p003a.ad.m129d(r10);	 Catch:{ all -> 0x007c }
        r0 = r9.f164m;	 Catch:{ all -> 0x007c }
        r0 = r0.get(r10);	 Catch:{ all -> 0x007c }
        r0 = (com.amap.p003a.ad.DiskLruCache) r0;	 Catch:{ all -> 0x007c }
        if (r0 != 0) goto L_0x0015;
    L_0x0013:
        monitor-exit(r9);
        return r1;
    L_0x0015:
        r3 = r0.f147c;	 Catch:{ all -> 0x007c }
        if (r3 == 0) goto L_0x0013;
    L_0x0019:
        r3 = r9.f161j;	 Catch:{ all -> 0x007c }
        r6 = new java.io.InputStream[r3];	 Catch:{ all -> 0x007c }
        r3 = r2;
    L_0x001e:
        r4 = r9.f161j;	 Catch:{ FileNotFoundException -> 0x0030 }
        if (r3 >= r4) goto L_0x0042;
    L_0x0022:
        r4 = new java.io.FileInputStream;	 Catch:{ FileNotFoundException -> 0x0030 }
        r5 = r0.m114a(r3);	 Catch:{ FileNotFoundException -> 0x0030 }
        r4.<init>(r5);	 Catch:{ FileNotFoundException -> 0x0030 }
        r6[r3] = r4;	 Catch:{ FileNotFoundException -> 0x0030 }
        r3 = r3 + 1;
        goto L_0x001e;
    L_0x0030:
        r0 = move-exception;
        r0 = r2;
    L_0x0032:
        r2 = r9.f161j;	 Catch:{ all -> 0x007c }
        if (r0 >= r2) goto L_0x0013;
    L_0x0036:
        r2 = r6[r0];	 Catch:{ all -> 0x007c }
        if (r2 == 0) goto L_0x0013;
    L_0x003a:
        r2 = r6[r0];	 Catch:{ all -> 0x007c }
        com.amap.p003a.ag.m146a(r2);	 Catch:{ all -> 0x007c }
        r0 = r0 + 1;
        goto L_0x0032;
    L_0x0042:
        r1 = r9.f165n;	 Catch:{ all -> 0x007c }
        r1 = r1 + 1;
        r9.f165n = r1;	 Catch:{ all -> 0x007c }
        r1 = r9.f163l;	 Catch:{ all -> 0x007c }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x007c }
        r3 = "READ ";
        r2.<init>(r3);	 Catch:{ all -> 0x007c }
        r2 = r2.append(r10);	 Catch:{ all -> 0x007c }
        r3 = 10;
        r2 = r2.append(r3);	 Catch:{ all -> 0x007c }
        r2 = r2.toString();	 Catch:{ all -> 0x007c }
        r1.append(r2);	 Catch:{ all -> 0x007c }
        r1 = r9.m135g();	 Catch:{ all -> 0x007c }
        if (r1 == 0) goto L_0x006f;
    L_0x0068:
        r1 = r9.f154c;	 Catch:{ all -> 0x007c }
        r2 = r9.f167p;	 Catch:{ all -> 0x007c }
        r1.submit(r2);	 Catch:{ all -> 0x007c }
    L_0x006f:
        r1 = new com.amap.a.ad$b;	 Catch:{ all -> 0x007c }
        r4 = r0.f149e;	 Catch:{ all -> 0x007c }
        r7 = r0.f146b;	 Catch:{ all -> 0x007c }
        r8 = 0;
        r2 = r9;
        r3 = r10;
        r1.<init>(r3, r4, r6, r7, r8);	 Catch:{ all -> 0x007c }
        goto L_0x0013;
    L_0x007c:
        r0 = move-exception;
        monitor-exit(r9);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.a.ad.a(java.lang.String):com.amap.a.ad$b");
    }

    public final synchronized boolean m139a() {
        return this.f163l == null;
    }

    final synchronized DiskLruCache m140b(String str) {
        DiskLruCache diskLruCache;
        m136h();
        ad.m129d(str);
        DiskLruCache diskLruCache2 = (DiskLruCache) this.f164m.get(str);
        if (-1 == -1 || (diskLruCache2 != null && diskLruCache2.f149e == -1)) {
            DiskLruCache diskLruCache3;
            if (diskLruCache2 == null) {
                diskLruCache2 = new DiskLruCache(str, (byte) 0);
                this.f164m.put(str, diskLruCache2);
                diskLruCache3 = diskLruCache2;
            } else if (diskLruCache2.f148d != null) {
                diskLruCache = null;
            } else {
                diskLruCache3 = diskLruCache2;
            }
            diskLruCache = new DiskLruCache(diskLruCache3, (byte) 0);
            diskLruCache3.f148d = diskLruCache;
            this.f163l.write("DIRTY " + str + '\n');
            this.f163l.flush();
        } else {
            diskLruCache = null;
        }
        return diskLruCache;
    }

    public final synchronized void m141b() {
        m136h();
        m137i();
        this.f163l.flush();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean m142c(java.lang.String r7) {
        /*
        r6 = this;
        r1 = 0;
        monitor-enter(r6);
        r6.m136h();	 Catch:{ all -> 0x0053 }
        com.amap.p003a.ad.m129d(r7);	 Catch:{ all -> 0x0053 }
        r0 = r6.f164m;	 Catch:{ all -> 0x0053 }
        r0 = r0.get(r7);	 Catch:{ all -> 0x0053 }
        r0 = (com.amap.p003a.ad.DiskLruCache) r0;	 Catch:{ all -> 0x0053 }
        if (r0 == 0) goto L_0x0016;
    L_0x0012:
        r2 = r0.f148d;	 Catch:{ all -> 0x0053 }
        if (r2 == 0) goto L_0x002a;
    L_0x0016:
        r0 = r1;
    L_0x0017:
        monitor-exit(r6);
        return r0;
    L_0x0019:
        r2 = r6.f162k;	 Catch:{ all -> 0x0053 }
        r4 = r0.f146b;	 Catch:{ all -> 0x0053 }
        r4 = r4[r1];	 Catch:{ all -> 0x0053 }
        r2 = r2 - r4;
        r6.f162k = r2;	 Catch:{ all -> 0x0053 }
        r2 = r0.f146b;	 Catch:{ all -> 0x0053 }
        r4 = 0;
        r2[r1] = r4;	 Catch:{ all -> 0x0053 }
        r1 = r1 + 1;
    L_0x002a:
        r2 = r6.f161j;	 Catch:{ all -> 0x0053 }
        if (r1 >= r2) goto L_0x0056;
    L_0x002e:
        r2 = r0.m114a(r1);	 Catch:{ all -> 0x0053 }
        r3 = r2.exists();	 Catch:{ all -> 0x0053 }
        if (r3 == 0) goto L_0x0019;
    L_0x0038:
        r3 = r2.delete();	 Catch:{ all -> 0x0053 }
        if (r3 != 0) goto L_0x0019;
    L_0x003e:
        r0 = new java.io.IOException;	 Catch:{ all -> 0x0053 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0053 }
        r3 = "failed to delete ";
        r1.<init>(r3);	 Catch:{ all -> 0x0053 }
        r1 = r1.append(r2);	 Catch:{ all -> 0x0053 }
        r1 = r1.toString();	 Catch:{ all -> 0x0053 }
        r0.<init>(r1);	 Catch:{ all -> 0x0053 }
        throw r0;	 Catch:{ all -> 0x0053 }
    L_0x0053:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
    L_0x0056:
        r0 = r6.f165n;	 Catch:{ all -> 0x0053 }
        r0 = r0 + 1;
        r6.f165n = r0;	 Catch:{ all -> 0x0053 }
        r0 = r6.f163l;	 Catch:{ all -> 0x0053 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0053 }
        r2 = "REMOVE ";
        r1.<init>(r2);	 Catch:{ all -> 0x0053 }
        r1 = r1.append(r7);	 Catch:{ all -> 0x0053 }
        r2 = 10;
        r1 = r1.append(r2);	 Catch:{ all -> 0x0053 }
        r1 = r1.toString();	 Catch:{ all -> 0x0053 }
        r0.append(r1);	 Catch:{ all -> 0x0053 }
        r0 = r6.f164m;	 Catch:{ all -> 0x0053 }
        r0.remove(r7);	 Catch:{ all -> 0x0053 }
        r0 = r6.m135g();	 Catch:{ all -> 0x0053 }
        if (r0 == 0) goto L_0x0088;
    L_0x0081:
        r0 = r6.f154c;	 Catch:{ all -> 0x0053 }
        r1 = r6.f167p;	 Catch:{ all -> 0x0053 }
        r0.submit(r1);	 Catch:{ all -> 0x0053 }
    L_0x0088:
        r0 = 1;
        goto L_0x0017;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.a.ad.c(java.lang.String):boolean");
    }

    public final synchronized void close() {
        if (this.f163l != null) {
            Iterator it = new ArrayList(this.f164m.values()).iterator();
            while (it.hasNext()) {
                DiskLruCache diskLruCache = (DiskLruCache) it.next();
                if (diskLruCache.f148d != null) {
                    diskLruCache.f148d.m112c();
                }
            }
            m137i();
            this.f163l.close();
            this.f163l = null;
        }
    }
}
