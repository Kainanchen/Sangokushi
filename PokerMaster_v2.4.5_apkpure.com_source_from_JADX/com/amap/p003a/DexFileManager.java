package com.amap.p003a;

import a.does.not.Exists2;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import com.ali.fixHelper;
import com.amap.p003a.aa.DynamicPlugin;
import dalvik.system.DexFile;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

/* renamed from: com.amap.a.w */
public final class DexFileManager {

    /* renamed from: com.amap.a.w.1 */
    static class DexFileManager implements Runnable {
        final /* synthetic */ Context f720a;
        final /* synthetic */ String f721b;
        final /* synthetic */ String f722c;

        static {
            fixHelper.fixfunc(new int[]{2658, 2659});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native DexFileManager(Context context, String str, String str2);

        public final native void run();
    }

    /* renamed from: com.amap.a.w.a */
    public static class DexFileManager {
        public static aa m731a(DBOperation dBOperation, String str) {
            List a = dBOperation.m681a(aa.m68b(str), aa.class, false);
            return a.size() > 0 ? (aa) a.get(0) : null;
        }

        public static List<aa> m732a(DBOperation dBOperation, String str, String str2) {
            return dBOperation.m681a(aa.m69b(str, str2), aa.class, false);
        }
    }

    static String m733a(Context context) {
        return context.getFilesDir().getAbsolutePath() + File.separator + "pngex";
    }

    static String m734a(Context context, DBOperation dBOperation, cj cjVar) {
        List a = dBOperation.m681a(aa.m69b(cjVar.m611a(), "copy"), aa.class, false);
        if (a.size() == 0) {
            return null;
        }
        String str;
        ac.m106a(a);
        int i = 0;
        while (i < a.size()) {
            aa aaVar = (aa) a.get(i);
            String str2 = aaVar.f75a;
            if (ac.m107a(dBOperation, str2, DexFileManager.m735a(context, str2), cjVar)) {
                try {
                    DexFileManager.m739a(context, dBOperation, cjVar, DexFileManager.m735a(context, aaVar.f75a), aaVar.f78d);
                    str = aaVar.f78d;
                    break;
                } catch (Throwable th) {
                    cm.m637a(th, "FileManager", "loadAvailableD");
                }
            } else {
                DexFileManager.m743b(context, dBOperation, aaVar.f75a);
                i++;
            }
        }
        str = null;
        return str;
    }

    static String m735a(Context context, String str) {
        return DexFileManager.m733a(context) + File.separator + str;
    }

    static String m736a(Context context, String str, String str2) {
        return cg.m586b(str + str2 + ce.m567q(context)) + ".png";
    }

    static String m737a(String str) {
        return str + ".o";
    }

    static void m738a(Context context, cj cjVar) {
        try {
            String b = DexFileManager.m742b(context, cjVar.m611a(), cjVar.m612b());
            if (!TextUtils.isEmpty(b)) {
                File file = new File(b);
                File parentFile = file.getParentFile();
                if (file.exists()) {
                    String a = DexFileManager.m735a(context, DexFileManager.m737a(file.getName()));
                    DexFile loadDex = DexFile.loadDex(b, a, 0);
                    if (loadDex != null) {
                        loadDex.close();
                        Object obj = null;
                        DBOperation dBOperation = new DBOperation(context, DynamicFileDBCreator.m751b());
                        aa a2 = DexFileManager.m731a(dBOperation, file.getName());
                        if (a2 != null) {
                            obj = a2.f78d;
                        }
                        File file2 = new File(a);
                        if (!TextUtils.isEmpty(obj) && file2.exists()) {
                            a = cg.m584a(a);
                            String name = file2.getName();
                            DynamicPlugin dynamicPlugin = new DynamicPlugin(name, a, cjVar.m611a(), cjVar.m612b(), obj);
                            dynamicPlugin.f74f = "useod";
                            dBOperation.m683a(dynamicPlugin.m64a(), aa.m68b(name));
                        }
                    }
                } else if (parentFile != null && parentFile.exists()) {
                    DexFileManager.m744c(context, cjVar.m611a(), cjVar.m612b());
                }
            }
        } catch (Throwable th) {
            cm.m637a(th, "BaseClassLoader", "getInstanceByThread()");
        }
    }

    static void m739a(Context context, DBOperation dBOperation, cj cjVar, String str, String str2) {
        Closeable fileInputStream;
        Throwable th;
        Closeable closeable;
        Closeable closeable2 = null;
        try {
            String a = cjVar.m611a();
            String a2 = DexFileManager.m736a(context, a, cjVar.m612b());
            DexFileManager.m740a(context, dBOperation, a2);
            fileInputStream = new FileInputStream(new File(str));
            try {
                fileInputStream.read(new byte[32]);
                File file = new File(DexFileManager.m742b(context, a, cjVar.m612b()));
                Closeable fileOutputStream = new FileOutputStream(file, true);
                try {
                    byte[] bArr = new byte[AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read > 0) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            DynamicPlugin dynamicPlugin = new DynamicPlugin(a2, cg.m584a(file.getAbsolutePath()), a, cjVar.m612b(), str2);
                            dynamicPlugin.f74f = "used";
                            Object a3 = dynamicPlugin.m64a();
                            dBOperation.m683a(a3, aa.m68b(a3.f75a));
                            ac.m105a(fileInputStream);
                            ac.m105a(fileOutputStream);
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    closeable2 = fileOutputStream;
                    ac.m105a(fileInputStream);
                    ac.m105a(closeable2);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                ac.m105a(fileInputStream);
                ac.m105a(closeable2);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            ac.m105a(fileInputStream);
            ac.m105a(closeable2);
            throw th;
        }
    }

    static void m740a(Context context, DBOperation dBOperation, String str) {
        DexFileManager.m743b(context, dBOperation, str);
        DexFileManager.m743b(context, dBOperation, DexFileManager.m737a(str));
    }

    static void m741a(DBOperation dBOperation, Context context, String str) {
        List<aa> a = DexFileManager.m732a(dBOperation, str, "used");
        if (a != null && a.size() > 0) {
            for (aa aaVar : a) {
                if (aaVar != null) {
                    DexFileManager.m740a(context, dBOperation, aaVar.f75a);
                    List a2 = dBOperation.m681a(aa.m66a(str, aaVar.f78d), aa.class, false);
                    if (a2.size() > 0) {
                        Object obj = (aa) a2.get(0);
                        obj.f79e = "errorstatus";
                        dBOperation.m683a(obj, aa.m68b(obj.f75a));
                        File file = new File(DexFileManager.m735a(context, obj.f75a));
                        if (file.exists()) {
                            file.delete();
                        }
                    }
                }
            }
        }
    }

    static String m742b(Context context, String str, String str2) {
        return DexFileManager.m735a(context, DexFileManager.m736a(context, str, str2));
    }

    static void m743b(Context context, DBOperation dBOperation, String str) {
        File file = new File(DexFileManager.m735a(context, str));
        if (file.exists()) {
            file.delete();
        }
        dBOperation.m684a(aa.m68b(str), aa.class);
    }

    static void m744c(Context context, String str, String str2) {
        cp.m658b().submit(new DexFileManager(context, str, str2));
    }
}
