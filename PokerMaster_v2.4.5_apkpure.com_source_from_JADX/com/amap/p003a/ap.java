package com.amap.p003a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.amap.p003a.ad.DiskLruCache;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* compiled from: OfflineLocManager */
/* renamed from: com.amap.a.ap */
public class ap {

    /* renamed from: com.amap.a.ap.1 */
    static class OfflineLocManager implements Runnable {
        final /* synthetic */ ao f203a;
        final /* synthetic */ Context f204b;

        OfflineLocManager(ao aoVar, Context context) {
            this.f203a = aoVar;
            this.f204b = context;
        }

        public final void run() {
            ad a;
            Throwable th;
            OutputStream outputStream = null;
            synchronized (ap.class) {
                try {
                    ao aoVar = this.f203a;
                    byte[] a2 = ck.m624a(cd.m542b(ck.m624a(ao.m179a(aoVar.f200a, aoVar.f201b, aoVar.f202c))));
                    a = ad.m118a(new File(cn.m642a(this.f204b, cn.f659f)), 204800);
                    try {
                        DiskLruCache b = a.m140b(Long.toString(System.currentTimeMillis()));
                        outputStream = b.m110a();
                        outputStream.write(a2);
                        b.m111b();
                        a.m141b();
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th2) {
                                th2.printStackTrace();
                            }
                        }
                        if (a != null) {
                            try {
                                a.close();
                            } catch (Throwable th22) {
                                th22.printStackTrace();
                            }
                        }
                    } catch (Throwable th3) {
                        th22 = th3;
                        try {
                            cm.m637a(th22, "OfflineLocManager", "applyOfflineLocEntity");
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (Throwable th222) {
                                    th222.printStackTrace();
                                }
                            }
                            if (a != null) {
                                try {
                                    a.close();
                                } catch (Throwable th2222) {
                                    th2222.printStackTrace();
                                }
                            }
                        } catch (Throwable th4) {
                            th2222 = th4;
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (Throwable th5) {
                                    th5.printStackTrace();
                                }
                            }
                            if (a != null) {
                                try {
                                    a.close();
                                } catch (Throwable th52) {
                                    th52.printStackTrace();
                                }
                            }
                            throw th2222;
                        }
                    }
                } catch (Throwable th6) {
                    th2222 = th6;
                    a = null;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (a != null) {
                        a.close();
                    }
                    throw th2222;
                }
            }
        }
    }

    private static String m180a(String str) {
        Throwable th;
        StringBuilder stringBuilder = new StringBuilder();
        Object obj = 1;
        ad adVar = null;
        try {
            adVar = ad.m118a(new File(str), 204800);
            File file = new File(str);
            if (file.exists()) {
                for (String str2 : file.list()) {
                    String str22;
                    if (str22.contains(".0")) {
                        str22 = ck.m618a(as.m197a(adVar, str22.split("\\.")[0]));
                        if (obj != null) {
                            obj = null;
                        } else {
                            stringBuilder.append(",");
                        }
                        stringBuilder.append("{\"log\":\"").append(str22).append("\"}");
                    }
                }
            }
            if (adVar != null) {
                try {
                    adVar.close();
                } catch (Throwable th2) {
                    th = th2;
                    th.printStackTrace();
                    return stringBuilder.toString();
                }
            }
        } catch (Throwable th3) {
            cm.m637a(th3, "StatisticsManager", "getContent");
            if (adVar != null) {
                adVar.close();
            }
        } catch (Throwable th4) {
            th3 = th4;
            th3.printStackTrace();
        }
        return stringBuilder.toString();
    }

    public static void m181a(Context context) {
        FileOutputStream fileOutputStream;
        Throwable th;
        Object a;
        String b;
        StringBuilder stringBuilder;
        String stringBuilder2;
        am coVar;
        FileOutputStream fileOutputStream2 = null;
        try {
            if (ap.m185d(context)) {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    File file = new File(cn.m642a(context, "f.log"));
                    if (!file.getParentFile().exists()) {
                        file.getParentFile().mkdirs();
                    }
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        fileOutputStream.write(ck.m624a(String.valueOf(currentTimeMillis)));
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                th2.printStackTrace();
                            }
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            cm.m637a(th2, "OfflineLocManager", "updateLogUpdateTime");
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            a = ap.m180a(cn.m642a(context, cn.f659f));
                            if (!TextUtils.isEmpty(a)) {
                                b = cd.m542b(ck.m624a(ap.m186e(context)));
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("{\"pinfo\":\"").append(b).append("\",\"els\":[");
                                stringBuilder.append(a);
                                stringBuilder.append("]}");
                                stringBuilder2 = stringBuilder.toString();
                            }
                            if (TextUtils.isEmpty(stringBuilder2)) {
                                coVar = new co(ck.m630c(ck.m624a(stringBuilder2)), "6");
                                ah.m149a();
                                ah.m151a(coVar);
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            fileOutputStream2 = fileOutputStream;
                            if (fileOutputStream2 != null) {
                                try {
                                    fileOutputStream2.close();
                                } catch (Throwable th5) {
                                    th5.printStackTrace();
                                }
                            }
                            throw th2;
                        }
                    }
                } catch (Throwable th6) {
                    th2 = th6;
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                    }
                    throw th2;
                }
                a = ap.m180a(cn.m642a(context, cn.f659f));
                if (TextUtils.isEmpty(a)) {
                    b = cd.m542b(ck.m624a(ap.m186e(context)));
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("{\"pinfo\":\"").append(b).append("\",\"els\":[");
                    stringBuilder.append(a);
                    stringBuilder.append("]}");
                    stringBuilder2 = stringBuilder.toString();
                }
                if (TextUtils.isEmpty(stringBuilder2)) {
                    coVar = new co(ck.m630c(ck.m624a(stringBuilder2)), "6");
                    ah.m149a();
                    ah.m151a(coVar);
                }
            }
        } catch (Throwable th22) {
            cm.m637a(th22, "OfflineLocManager", "updateOfflineLocData");
        }
    }

    public static synchronized void m182a(ao aoVar, Context context) {
        synchronized (ap.class) {
            cp.m658b().submit(new OfflineLocManager(aoVar, context));
        }
    }

    private static int m183b(Context context) {
        int i = 0;
        try {
            File file = new File(cn.m642a(context, cn.f659f));
            if (file.exists()) {
                i = file.list().length;
            }
        } catch (Throwable th) {
            cm.m637a(th, "OfflineLocManager", "getFileNum");
        }
        return i;
    }

    private static long m184c(Context context) {
        Throwable th;
        File file = new File(cn.m642a(context, "f.log"));
        if (!file.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                byte[] bArr = new byte[fileInputStream2.available()];
                fileInputStream2.read(bArr);
                long parseLong = Long.parseLong(ck.m618a(bArr));
                if (fileInputStream2 == null) {
                    return parseLong;
                }
                try {
                    fileInputStream2.close();
                    return parseLong;
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    return parseLong;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            cm.m637a(th, "OfflineLocManager", "getUpdateTime");
            if (file.exists()) {
                file.delete();
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return System.currentTimeMillis();
        }
    }

    private static boolean m185d(Context context) {
        try {
            if (ce.m563m(context) == 1) {
                return System.currentTimeMillis() - ap.m184c(context) > 604800000 || ap.m183b(context) >= 100;
            }
        } catch (Throwable th) {
            cm.m637a(th, "StatisticsManager", "isUpdate");
        }
        return false;
    }

    private static String m186e(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            stringBuilder.append("\"key\":\"").append(cb.m523f(context)).append("\",\"platform\":\"android\",\"diu\":\"").append(ce.m567q(context)).append("\",\"mac\":\"").append(ce.m559i(context)).append("\",\"tid\":\"").append(ce.m556f(context)).append("\",\"manufacture\":\"").append(Build.MANUFACTURER).append("\",\"device\":\"").append(Build.DEVICE).append("\",\"sim\":\"").append(ce.m568r(context)).append("\",\"pkg\":\"").append(cb.m520c(context)).append("\",\"model\":\"").append(Build.MODEL).append("\",\"appversion\":\"").append(cb.m521d(context)).append("\"");
        } catch (Throwable th) {
            cm.m637a(th, "CInfo", "getPublicJSONInfo");
        }
        return stringBuilder.toString();
    }
}
