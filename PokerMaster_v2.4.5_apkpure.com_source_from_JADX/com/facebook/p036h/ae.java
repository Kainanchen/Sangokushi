package com.facebook.p036h;

import android.net.Uri;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.p036h.FileLruCache.FileLruCache;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: UrlRedirectCache */
/* renamed from: com.facebook.h.ae */
class ae {
    static final String f1558a;
    private static final String f1559b;
    private static volatile FileLruCache f1560c;

    ae() {
    }

    static {
        f1558a = ae.class.getSimpleName();
        f1559b = f1558a + "_Redirect";
    }

    private static synchronized FileLruCache m1484a() {
        FileLruCache fileLruCache;
        synchronized (ae.class) {
            if (f1560c == null) {
                f1560c = new FileLruCache(f1558a, new FileLruCache());
            }
            fileLruCache = f1560c;
        }
        return fileLruCache;
    }

    static Uri m1483a(Uri uri) {
        Throwable th;
        Uri uri2 = null;
        Object obj = null;
        if (uri != null) {
            String uri3 = uri.toString();
            Closeable inputStreamReader;
            try {
                FileLruCache a = ae.m1484a();
                String str = uri3;
                Closeable closeable = uri2;
                while (true) {
                    try {
                        InputStream a2 = a.m1665a(str, f1559b);
                        if (a2 == null) {
                            break;
                        }
                        inputStreamReader = new InputStreamReader(a2);
                        try {
                            char[] cArr = new char[AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS];
                            StringBuilder stringBuilder = new StringBuilder();
                            while (true) {
                                int read = inputStreamReader.read(cArr, 0, AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
                                if (read <= 0) {
                                    break;
                                }
                                stringBuilder.append(cArr, 0, read);
                            }
                            af.m1513a(inputStreamReader);
                            str = stringBuilder.toString();
                            closeable = inputStreamReader;
                            int i = 1;
                        } catch (IOException e) {
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (IOException e2) {
                        inputStreamReader = closeable;
                    } catch (Throwable th3) {
                        th = th3;
                        inputStreamReader = closeable;
                    }
                }
                if (obj != null) {
                    uri2 = Uri.parse(str);
                    af.m1513a(closeable);
                } else {
                    af.m1513a(closeable);
                }
            } catch (IOException e3) {
                obj = uri2;
                af.m1513a(inputStreamReader);
                return uri2;
            } catch (Throwable th4) {
                Throwable th5 = th4;
                inputStreamReader = uri2;
                th = th5;
                af.m1513a(inputStreamReader);
                throw th;
            }
        }
        return uri2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m1485a(android.net.Uri r5, android.net.Uri r6) {
        /*
        if (r5 == 0) goto L_0x0004;
    L_0x0002:
        if (r6 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0 = 0;
        r1 = com.facebook.p036h.ae.m1484a();	 Catch:{ IOException -> 0x0023, all -> 0x0028 }
        r2 = r5.toString();	 Catch:{ IOException -> 0x0023, all -> 0x0028 }
        r3 = f1559b;	 Catch:{ IOException -> 0x0023, all -> 0x0028 }
        r0 = r1.m1666b(r2, r3);	 Catch:{ IOException -> 0x0023, all -> 0x0028 }
        r1 = r6.toString();	 Catch:{ IOException -> 0x0023, all -> 0x0030 }
        r1 = r1.getBytes();	 Catch:{ IOException -> 0x0023, all -> 0x0030 }
        r0.write(r1);	 Catch:{ IOException -> 0x0023, all -> 0x0030 }
        com.facebook.p036h.af.m1513a(r0);
        goto L_0x0004;
    L_0x0023:
        r1 = move-exception;
        com.facebook.p036h.af.m1513a(r0);
        goto L_0x0004;
    L_0x0028:
        r1 = move-exception;
        r4 = r1;
        r1 = r0;
        r0 = r4;
    L_0x002c:
        com.facebook.p036h.af.m1513a(r1);
        throw r0;
    L_0x0030:
        r1 = move-exception;
        r4 = r1;
        r1 = r0;
        r0 = r4;
        goto L_0x002c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.h.ae.a(android.net.Uri, android.net.Uri):void");
    }
}
