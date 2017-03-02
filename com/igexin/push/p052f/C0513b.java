package com.igexin.push.p052f;

import android.content.Intent;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.alipay.sdk.util.C0203j;
import com.igexin.p022a.p023a.p024a.C0227a;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.p022a.p031b.C0259a;
import com.igexin.push.config.C0377k;
import com.igexin.push.core.C0483g;
import com.igexin.push.core.bean.C0431e;
import com.igexin.push.core.p050d.C0474h;
import com.igexin.sdk.PushService;
import com.tencent.tauth.AuthActivity;
import com.zkunity.app.ResourceIDs;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* renamed from: com.igexin.push.f.b */
public class C0513b {
    private static final String f1415a;

    static {
        f1415a = C0377k.f1013a + "_FileUtils";
    }

    public static void m1847a() {
        Throwable th;
        FileOutputStream fileOutputStream = null;
        FileOutputStream fileOutputStream2;
        try {
            File file = new File(C0483g.f1313Y);
            if (file.exists() || file.createNewFile()) {
                fileOutputStream2 = new FileOutputStream(C0483g.f1313Y);
                try {
                    fileOutputStream2.write(C0227a.m724b((("v01" + C0483g.f1338x) + String.valueOf(C0483g.f1332r) + "|" + C0483g.f1315a + "|" + C0483g.f1333s).getBytes(), C0483g.f1290B));
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                            return;
                        } catch (Exception e) {
                            return;
                        }
                    }
                    return;
                } catch (Exception e2) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e3) {
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (Exception e4) {
                        }
                    }
                    throw th;
                }
            }
            C0247a.m838b(f1415a + "create file : " + file.toString() + " failed !!!");
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Exception e5) {
                }
            }
        } catch (Exception e6) {
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        } catch (Throwable th3) {
            Throwable th4 = th3;
            fileOutputStream2 = fileOutputStream;
            th = th4;
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            throw th;
        }
    }

    public static void m1848a(C0431e c0431e) {
        try {
            Intent intent;
            File file = new File(C0483g.ac + "/" + c0431e.m1489c());
            File file2 = new File(C0483g.ad + "/" + c0431e.m1489c());
            if (file2.exists()) {
                if (C0259a.m876a(C0483g.f1321g, file2.getAbsolutePath()).equals(c0431e.m1495f())) {
                    C0247a.m838b(f1415a + " downloadExtension ext is exsit " + file2);
                    intent = new Intent(C0483g.f1321g, PushService.class);
                    intent.putExtra(AuthActivity.ACTION_KEY, "com.igexin.sdk.action.extdownloadsuccess");
                    intent.putExtra(ResourceIDs.ID, c0431e.m1481a());
                    intent.putExtra(C0203j.f519c, true);
                    C0483g.f1321g.startService(intent);
                    return;
                }
                file2.delete();
            }
            if (file.exists() && C0259a.m876a(C0483g.f1321g, file.getAbsolutePath()).equals(c0431e.m1495f())) {
                C0247a.m838b(f1415a + " download Extension ext is exsit do copy " + file);
                if (C0513b.m1849a(file, file2, c0431e.m1495f())) {
                    intent = new Intent(C0483g.f1321g, PushService.class);
                    intent.putExtra(AuthActivity.ACTION_KEY, "com.igexin.sdk.action.extdownloadsuccess");
                    intent.putExtra(ResourceIDs.ID, c0431e.m1481a());
                    intent.putExtra(C0203j.f519c, true);
                    C0483g.f1321g.startService(intent);
                    return;
                }
            }
            C0247a.m838b(f1415a + " ext is not exsit start download name = " + c0431e.m1489c());
            new Thread(new C0474h(C0483g.f1321g, c0431e, false)).start();
        } catch (Exception e) {
            C0247a.m838b(f1415a + "|" + e.toString());
        }
    }

    public static boolean m1849a(File file, File file2, String str) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream;
        Exception e;
        FileInputStream fileInputStream2;
        Throwable th;
        FileOutputStream fileOutputStream2 = null;
        boolean z = false;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                } catch (Exception e2) {
                    e = e2;
                    bufferedOutputStream = null;
                    fileOutputStream2 = fileOutputStream;
                    fileInputStream2 = fileInputStream;
                    try {
                        C0247a.m838b(f1415a + e.toString());
                        if (file2.exists()) {
                            file2.delete();
                        }
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (Exception e3) {
                            }
                        }
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        return z;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        fileOutputStream = fileOutputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception e4) {
                                throw th;
                            }
                        }
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedOutputStream = null;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (Exception e5) {
                e = e5;
                bufferedOutputStream = null;
                fileInputStream2 = fileInputStream;
                C0247a.m838b(f1415a + e.toString());
                if (file2.exists()) {
                    file2.delete();
                }
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
                return z;
            } catch (Throwable th4) {
                th = th4;
                bufferedOutputStream = null;
                fileOutputStream = null;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
            try {
                Object obj = new byte[AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT];
                while (true) {
                    int read = fileInputStream.read(obj);
                    if (read == -1) {
                        break;
                    }
                    Object obj2 = new byte[read];
                    System.arraycopy(obj, 0, obj2, 0, read);
                    bufferedOutputStream.write(obj2);
                }
                fileInputStream.close();
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                fileOutputStream.close();
                if (C0259a.m876a(C0483g.f1321g, file2.getAbsolutePath()).equals(str)) {
                    C0247a.m838b(f1415a + " copyFile success from : " + file + " to : " + file2);
                    z = true;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception e6) {
                        }
                    }
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                } else {
                    file2.delete();
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception e7) {
                        }
                    }
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                }
            } catch (Exception e8) {
                e = e8;
                fileOutputStream2 = fileOutputStream;
                fileInputStream2 = fileInputStream;
                C0247a.m838b(f1415a + e.toString());
                if (file2.exists()) {
                    file2.delete();
                }
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
                return z;
            } catch (Throwable th5) {
                th = th5;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (Exception e9) {
            e = e9;
            bufferedOutputStream = null;
            fileInputStream2 = null;
            C0247a.m838b(f1415a + e.toString());
            if (file2.exists()) {
                file2.delete();
            }
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            return z;
        } catch (Throwable th6) {
            th = th6;
            bufferedOutputStream = null;
            fileOutputStream = null;
            fileInputStream = null;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            throw th;
        }
        return z;
    }

    public static boolean m1850a(String str) {
        try {
            File file = new File(C0483g.ad + "/" + str);
            if (file.exists()) {
                file.delete();
            }
            file = new File(C0483g.ad + "/" + str + ".dex");
            if (file.exists()) {
                file.delete();
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static String m1851b() {
        String str = null;
        try {
            byte[] b = C0513b.m1852b(C0483g.f1313Y);
            if (b == null) {
                C0247a.m838b(f1415a + " read file cid id = null");
                return str;
            }
            String[] split = new String(C0227a.m722a(b, C0483g.f1290B)).split("\\|");
            if (split != null && split.length > 2) {
                String str2 = split[2];
                if (str2 != null) {
                    try {
                        if (!str2.equals("null")) {
                            str = str2;
                        }
                    } catch (Exception e) {
                        str = str2;
                    }
                } else {
                    str = str2;
                }
            }
            C0247a.m838b(f1415a + " get cid from file cid = " + str);
            return str;
        } catch (Exception e2) {
        }
    }

    private static byte[] m1852b(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        byte[] bArr = null;
        if (new File(str).exists()) {
            byte[] bArr2 = new byte[AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT];
            FileInputStream fileInputStream;
            try {
                fileInputStream = new FileInputStream(str);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        try {
                            int read = fileInputStream.read(bArr2);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr2, 0, read);
                        } catch (Exception e) {
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    bArr = byteArrayOutputStream.toByteArray();
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception e2) {
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception e3) {
                        }
                    }
                } catch (Exception e4) {
                    byteArrayOutputStream = bArr;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception e5) {
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception e6) {
                        }
                    }
                    return bArr;
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    byteArrayOutputStream = bArr;
                    th = th4;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception e7) {
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception e8) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e9) {
                byteArrayOutputStream = bArr;
                fileInputStream = bArr;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                return bArr;
            } catch (Throwable th32) {
                fileInputStream = bArr;
                byte[] bArr3 = bArr;
                th = th32;
                byteArrayOutputStream = bArr3;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                throw th;
            }
        }
        return bArr;
    }

    public static String m1853c() {
        String str;
        Exception e;
        try {
            C0247a.m838b(f1415a + " get device id from file : " + C0483g.f1314Z);
            byte[] b = C0513b.m1852b(C0483g.f1314Z);
            if (b == null) {
                C0247a.m838b(f1415a + " read file device id = null");
                return null;
            }
            str = new String(b, "utf-8");
            try {
                C0247a.m838b(f1415a + " read file device id = " + str);
                return str;
            } catch (Exception e2) {
                e = e2;
                C0247a.m838b(f1415a + " get device id from file : " + e.toString());
                return str;
            }
        } catch (Exception e3) {
            Exception exception = e3;
            str = null;
            e = exception;
            C0247a.m838b(f1415a + " get device id from file : " + e.toString());
            return str;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m1854d() {
        /*
        r2 = 0;
        r0 = com.igexin.push.core.C0483g.f1313Y;	 Catch:{ Exception -> 0x0077 }
        r0 = com.igexin.push.p052f.C0513b.m1852b(r0);	 Catch:{ Exception -> 0x0077 }
        if (r0 != 0) goto L_0x0023;
    L_0x000a:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0077 }
        r0.<init>();	 Catch:{ Exception -> 0x0077 }
        r1 = f1415a;	 Catch:{ Exception -> 0x0077 }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x0077 }
        r1 = " read session from file, not exist";
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x0077 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x0077 }
        com.igexin.p022a.p023a.p030c.C0247a.m838b(r0);	 Catch:{ Exception -> 0x0077 }
    L_0x0022:
        return r2;
    L_0x0023:
        r1 = new java.lang.String;	 Catch:{ Exception -> 0x0077 }
        r4 = com.igexin.push.core.C0483g.f1290B;	 Catch:{ Exception -> 0x0077 }
        r0 = com.igexin.p022a.p023a.p024a.C0227a.m722a(r0, r4);	 Catch:{ Exception -> 0x0077 }
        r1.<init>(r0);	 Catch:{ Exception -> 0x0077 }
        r0 = "null";
        r0 = r1.indexOf(r0);	 Catch:{ Exception -> 0x0077 }
        if (r0 < 0) goto L_0x0070;
    L_0x0036:
        r0 = 7;
        r0 = r1.substring(r0);	 Catch:{ Exception -> 0x0077 }
    L_0x003b:
        if (r0 == 0) goto L_0x007a;
    L_0x003d:
        r1 = "|";
        r1 = r0.indexOf(r1);	 Catch:{ Exception -> 0x0077 }
        if (r1 < 0) goto L_0x004a;
    L_0x0045:
        r4 = 0;
        r0 = r0.substring(r4, r1);	 Catch:{ Exception -> 0x0077 }
    L_0x004a:
        r0 = java.lang.Long.parseLong(r0);	 Catch:{ Exception -> 0x0077 }
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 == 0) goto L_0x007a;
    L_0x0052:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = f1415a;
        r2 = r2.append(r3);
        r3 = " session : ";
        r2 = r2.append(r3);
        r2 = r2.append(r0);
        r2 = r2.toString();
        com.igexin.p022a.p023a.p030c.C0247a.m838b(r2);
        r2 = r0;
        goto L_0x0022;
    L_0x0070:
        r0 = 20;
        r0 = r1.substring(r0);	 Catch:{ Exception -> 0x0077 }
        goto L_0x003b;
    L_0x0077:
        r0 = move-exception;
        r0 = r2;
        goto L_0x0052;
    L_0x007a:
        r0 = r2;
        goto L_0x0052;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.f.b.d():long");
    }

    public static void m1855e() {
        FileOutputStream fileOutputStream;
        Throwable th;
        if (C0483g.f1340z != null) {
            C0247a.m838b(f1415a + " save device id to file : " + C0483g.f1314Z);
            FileOutputStream fileOutputStream2 = null;
            try {
                File file = new File(C0483g.f1314Z);
                if (!(file.exists() || file.createNewFile())) {
                    C0247a.m838b(f1415a + "create file : " + file.toString() + " failed !!!");
                }
                fileOutputStream = new FileOutputStream(C0483g.f1314Z);
                try {
                    fileOutputStream.write(C0483g.f1340z.getBytes("utf-8"));
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e) {
                        }
                    }
                } catch (Exception e2) {
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (Exception e3) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e4) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e5) {
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                fileOutputStream = null;
                th = th4;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        }
    }

    public static void m1856f() {
        FileOutputStream fileOutputStream;
        Throwable th;
        FileOutputStream fileOutputStream2 = null;
        String str = "/data/data/" + C0483g.f1319e + "/files/" + "init.pid";
        try {
            if (new File(str).exists()) {
                byte[] bytes = C0483g.f1333s.getBytes();
                byte[] bArr = new byte[bytes.length];
                for (int i = 0; i < bytes.length; i++) {
                    bArr[i] = (byte) (bytes[i] ^ C0483g.ae[i]);
                }
                fileOutputStream = new FileOutputStream(str);
                try {
                    fileOutputStream.write(bArr);
                } catch (Exception e) {
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (Exception e2) {
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e3) {
                        }
                    }
                    throw th;
                }
            }
            fileOutputStream = null;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Exception e4) {
                }
            }
        } catch (Exception e5) {
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
        } catch (Throwable th3) {
            Throwable th4 = th3;
            fileOutputStream = null;
            th = th4;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            throw th;
        }
    }
}
