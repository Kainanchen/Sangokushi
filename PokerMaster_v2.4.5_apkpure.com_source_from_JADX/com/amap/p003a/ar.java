package com.amap.p003a;

import a.does.not.Exists2;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/* compiled from: StatisticsManager */
/* renamed from: com.amap.a.ar */
public class ar {
    private static boolean f212a;

    /* renamed from: com.amap.a.ar.1 */
    static class StatisticsManager implements Runnable {
        final /* synthetic */ aq f210a;
        final /* synthetic */ Context f211b;

        static {
            fixHelper.fixfunc(new int[]{1521, 1522});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native StatisticsManager(aq aqVar, Context context);

        public final native void run();
    }

    static {
        f212a = true;
    }

    public static void m189a(Context context) {
        try {
            if (ar.m196f(context)) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(new SimpleDateFormat("yyyyMMdd HHmmss").format(new Date()));
                stringBuffer.append(" ");
                stringBuffer.append(UUID.randomUUID().toString());
                stringBuffer.append(" ");
                if (stringBuffer.length() == 53) {
                    Object a = ck.m624a(stringBuffer.toString());
                    Object b = ar.m192b(context);
                    Object d = ar.m194d(context);
                    byte[] bArr = new byte[(b.length + d.length)];
                    System.arraycopy(b, 0, bArr, 0, b.length);
                    System.arraycopy(d, 0, bArr, b.length, d.length);
                    b = ar.m191a(bArr);
                    byte[] bArr2 = new byte[(a.length + b.length)];
                    System.arraycopy(a, 0, bArr2, 0, a.length);
                    System.arraycopy(b, 0, bArr2, a.length, b.length);
                    am coVar = new co(ck.m630c(bArr2), "2");
                    ah.m149a();
                    ah.m151a(coVar);
                }
            }
        } catch (Throwable th) {
            cm.m637a(th, "StatisticsManager", "updateStaticsData");
        }
    }

    public static synchronized void m190a(aq aqVar, Context context) {
        synchronized (ar.class) {
            cp.m658b().submit(new StatisticsManager(aqVar, context));
        }
    }

    private static byte[] m191a(byte[] bArr) {
        try {
            return cd.m541a(bArr);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static byte[] m192b(Context context) {
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[0];
        try {
            ck.m621a(byteArrayOutputStream, "1.2.13.6");
            ck.m621a(byteArrayOutputStream, "Android");
            ck.m621a(byteArrayOutputStream, ce.m567q(context));
            ck.m621a(byteArrayOutputStream, ce.m559i(context));
            ck.m621a(byteArrayOutputStream, ce.m556f(context));
            ck.m621a(byteArrayOutputStream, Build.MANUFACTURER);
            ck.m621a(byteArrayOutputStream, Build.MODEL);
            ck.m621a(byteArrayOutputStream, Build.DEVICE);
            ck.m621a(byteArrayOutputStream, ce.m568r(context));
            ck.m621a(byteArrayOutputStream, cb.m520c(context));
            ck.m621a(byteArrayOutputStream, cb.m521d(context));
            ck.m621a(byteArrayOutputStream, cb.m523f(context));
            byteArrayOutputStream.write(new byte[]{(byte) 0});
            bArr = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th = th2;
                th.printStackTrace();
                return bArr;
            }
        } catch (Throwable th3) {
            th = th3;
            th.printStackTrace();
        }
        return bArr;
    }

    private static int m193c(Context context) {
        int i = 0;
        try {
            File file = new File(cn.m642a(context, cn.f658e));
            if (file.exists()) {
                i = file.list().length;
            }
        } catch (Throwable th) {
            cm.m637a(th, "StatisticsManager", "getFileNum");
        }
        return i;
    }

    private static byte[] m194d(Context context) {
        Throwable th;
        int i = 0;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[0];
        String a = cn.m642a(context, cn.f658e);
        ad adVar = null;
        try {
            adVar = ad.m118a(new File(a), 102400);
            File file = new File(a);
            if (file.exists()) {
                String[] list = file.list();
                int length = list.length;
                while (i < length) {
                    String str = list[i];
                    if (str.contains(".0")) {
                        byteArrayOutputStream.write(as.m197a(adVar, str.split("\\.")[0]));
                    }
                    i++;
                }
            }
            bArr = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (adVar != null) {
                try {
                    adVar.close();
                } catch (Throwable th2) {
                    th = th2;
                    th.printStackTrace();
                    return bArr;
                }
            }
        } catch (Throwable th3) {
            cm.m637a(th3, "StatisticsManager", "getContent");
            try {
                byteArrayOutputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            if (adVar != null) {
                adVar.close();
            }
        } catch (Throwable th4) {
            th3 = th4;
            th3.printStackTrace();
        }
        return bArr;
    }

    private static long m195e(android.content.Context r7) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.amap.a.ar.e(android.content.Context):long. bs: [B:17:0x0038, B:39:0x0061]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
*/
        /*
        r0 = 0;
        r2 = "c.log";
        r2 = com.amap.p003a.cn.m642a(r7, r2);
        r5 = new java.io.File;
        r5.<init>(r2);
        r2 = r5.exists();
        if (r2 != 0) goto L_0x0014;
    L_0x0013:
        return r0;
    L_0x0014:
        r4 = 0;
        r3 = new java.io.FileInputStream;	 Catch:{ FileNotFoundException -> 0x0036, IOException -> 0x0047, Throwable -> 0x0058, all -> 0x0083 }
        r3.<init>(r5);	 Catch:{ FileNotFoundException -> 0x0036, IOException -> 0x0047, Throwable -> 0x0058, all -> 0x0083 }
        r2 = r3.available();	 Catch:{ FileNotFoundException -> 0x008a, IOException -> 0x0088, Throwable -> 0x0086 }
        r2 = new byte[r2];	 Catch:{ FileNotFoundException -> 0x008a, IOException -> 0x0088, Throwable -> 0x0086 }
        r3.read(r2);	 Catch:{ FileNotFoundException -> 0x008a, IOException -> 0x0088, Throwable -> 0x0086 }
        r2 = com.amap.p003a.ck.m618a(r2);	 Catch:{ FileNotFoundException -> 0x008a, IOException -> 0x0088, Throwable -> 0x0086 }
        r0 = java.lang.Long.parseLong(r2);	 Catch:{ FileNotFoundException -> 0x008a, IOException -> 0x0088, Throwable -> 0x0086 }
        if (r3 == 0) goto L_0x0013;
    L_0x002d:
        r3.close();	 Catch:{ Throwable -> 0x0031 }
        goto L_0x0013;
    L_0x0031:
        r2 = move-exception;
    L_0x0032:
        r2.printStackTrace();
        goto L_0x0013;
    L_0x0036:
        r2 = move-exception;
        r3 = r4;
    L_0x0038:
        r4 = "StatisticsManager";	 Catch:{ all -> 0x0077 }
        r5 = "getUpdateTime";	 Catch:{ all -> 0x0077 }
        com.amap.p003a.cm.m637a(r2, r4, r5);	 Catch:{ all -> 0x0077 }
        if (r3 == 0) goto L_0x0013;
    L_0x0041:
        r3.close();	 Catch:{ Throwable -> 0x0045 }
        goto L_0x0013;
    L_0x0045:
        r2 = move-exception;
        goto L_0x0032;
    L_0x0047:
        r2 = move-exception;
        r3 = r4;
    L_0x0049:
        r4 = "StatisticsManager";	 Catch:{ all -> 0x0077 }
        r5 = "getUpdateTime";	 Catch:{ all -> 0x0077 }
        com.amap.p003a.cm.m637a(r2, r4, r5);	 Catch:{ all -> 0x0077 }
        if (r3 == 0) goto L_0x0013;
    L_0x0052:
        r3.close();	 Catch:{ Throwable -> 0x0056 }
        goto L_0x0013;
    L_0x0056:
        r2 = move-exception;
        goto L_0x0032;
    L_0x0058:
        r2 = move-exception;
        r3 = r4;
    L_0x005a:
        r4 = "StatisticsManager";	 Catch:{ all -> 0x0077 }
        r6 = "getUpdateTime";	 Catch:{ all -> 0x0077 }
        com.amap.p003a.cm.m637a(r2, r4, r6);	 Catch:{ all -> 0x0077 }
        r2 = r5.exists();	 Catch:{ Throwable -> 0x0072 }
        if (r2 == 0) goto L_0x006a;	 Catch:{ Throwable -> 0x0072 }
    L_0x0067:
        r5.delete();	 Catch:{ Throwable -> 0x0072 }
    L_0x006a:
        if (r3 == 0) goto L_0x0013;
    L_0x006c:
        r3.close();	 Catch:{ Throwable -> 0x0070 }
        goto L_0x0013;
    L_0x0070:
        r2 = move-exception;
        goto L_0x0032;
    L_0x0072:
        r2 = move-exception;
        r2.printStackTrace();	 Catch:{ all -> 0x0077 }
        goto L_0x006a;
    L_0x0077:
        r0 = move-exception;
    L_0x0078:
        if (r3 == 0) goto L_0x007d;
    L_0x007a:
        r3.close();	 Catch:{ Throwable -> 0x007e }
    L_0x007d:
        throw r0;
    L_0x007e:
        r1 = move-exception;
        r1.printStackTrace();
        goto L_0x007d;
    L_0x0083:
        r0 = move-exception;
        r3 = r4;
        goto L_0x0078;
    L_0x0086:
        r2 = move-exception;
        goto L_0x005a;
    L_0x0088:
        r2 = move-exception;
        goto L_0x0049;
    L_0x008a:
        r2 = move-exception;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.a.ar.e(android.content.Context):long");
    }

    private static boolean m196f(Context context) {
        FileOutputStream fileOutputStream;
        FileNotFoundException e;
        Throwable th;
        IOException e2;
        try {
            if (ce.m563m(context) != 1 || !f212a || ar.m193c(context) < 100) {
                return false;
            }
            long e3 = ar.m195e(context);
            long time = new Date().getTime();
            if (time - e3 < 3600000) {
                return false;
            }
            File file = new File(cn.m642a(context, "c.log"));
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(ck.m624a(String.valueOf(time)));
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                } catch (FileNotFoundException e4) {
                    e = e4;
                    try {
                        e.printStackTrace();
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        f212a = false;
                        return true;
                    } catch (Throwable th3) {
                        th = th3;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th22) {
                                th22.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (IOException e5) {
                    e2 = e5;
                    e2.printStackTrace();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th222) {
                            th222.printStackTrace();
                        }
                    }
                    f212a = false;
                    return true;
                }
            } catch (FileNotFoundException e6) {
                e = e6;
                fileOutputStream = null;
                e.printStackTrace();
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                f212a = false;
                return true;
            } catch (IOException e7) {
                e2 = e7;
                fileOutputStream = null;
                e2.printStackTrace();
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                f212a = false;
                return true;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
            f212a = false;
            return true;
        } catch (Throwable th5) {
            cm.m637a(th5, "StatisticsManager", "isUpdate");
            return false;
        }
    }
}
