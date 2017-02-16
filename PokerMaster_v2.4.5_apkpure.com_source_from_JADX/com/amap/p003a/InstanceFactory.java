package com.amap.p003a;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.lang.reflect.Constructor;

/* renamed from: com.amap.a.s */
public final class InstanceFactory {

    /* renamed from: com.amap.a.s.1 */
    static class InstanceFactory implements Runnable {
        final /* synthetic */ Context f709a;
        final /* synthetic */ String f710b;

        InstanceFactory(Context context, String str) {
            this.f709a = context;
            this.f710b = str;
        }

        public final void run() {
            try {
                DexFileManager.m741a(new DBOperation(this.f709a, DynamicFileDBCreator.m751b()), this.f709a, this.f710b);
            } catch (Throwable th) {
                cm.m637a(th, "InstanceFactory", "rollBack");
            }
        }
    }

    public static <T> T m717a(Context context, cj cjVar, String str, Class cls, Class[] clsArr, Object[] objArr) {
        T a = InstanceFactory.m718a(InstanceFactory.m723b(context, cjVar), str, clsArr, objArr);
        if (a == null) {
            a = InstanceFactory.m719a(cls, clsArr, objArr);
            if (a == null) {
                throw new ca("\u83b7\u53d6\u5bf9\u8c61\u9519\u8bef");
            }
        }
        return a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> T m718a(com.amap.p003a.BaseClassLoader r3, java.lang.String r4, java.lang.Class[] r5, java.lang.Object[] r6) {
        /*
        r0 = 1;
        if (r3 == 0) goto L_0x0022;
    L_0x0003:
        r1 = r3.m724a();	 Catch:{ Throwable -> 0x0024 }
        if (r1 == 0) goto L_0x0022;
    L_0x0009:
        r1 = r3.f714d;	 Catch:{ Throwable -> 0x0024 }
        if (r1 == 0) goto L_0x0022;
    L_0x000d:
        if (r0 == 0) goto L_0x002c;
    L_0x000f:
        r0 = r3.loadClass(r4);	 Catch:{ Throwable -> 0x0024 }
        if (r0 == 0) goto L_0x002c;
    L_0x0015:
        r0 = r0.getDeclaredConstructor(r5);	 Catch:{ Throwable -> 0x0024 }
        r1 = 1;
        r0.setAccessible(r1);	 Catch:{ Throwable -> 0x0024 }
        r0 = r0.newInstance(r6);	 Catch:{ Throwable -> 0x0024 }
    L_0x0021:
        return r0;
    L_0x0022:
        r0 = 0;
        goto L_0x000d;
    L_0x0024:
        r0 = move-exception;
        r1 = "IFactory";
        r2 = "getWrap";
        com.amap.p003a.cm.m637a(r0, r1, r2);
    L_0x002c:
        r0 = 0;
        goto L_0x0021;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.a.s.a(com.amap.a.t, java.lang.String, java.lang.Class[], java.lang.Object[]):T");
    }

    private static <T> T m719a(Class cls, Class[] clsArr, Object[] objArr) {
        T t = null;
        if (cls != null) {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(clsArr);
                declaredConstructor.setAccessible(true);
                t = declaredConstructor.newInstance(objArr);
            } catch (Throwable th) {
                cm.m637a(th, "IFactory", "gIns2()");
            }
        }
        return t;
    }

    public static void m720a(Context context, DexDownloadItem dexDownloadItem, cj cjVar) {
        if (dexDownloadItem != null) {
            try {
                if (!TextUtils.isEmpty(dexDownloadItem.f701a) && !TextUtils.isEmpty(dexDownloadItem.f702b) && !TextUtils.isEmpty(dexDownloadItem.f705e)) {
                    new DexDownLoad(context, dexDownloadItem, cjVar).start();
                }
            } catch (Throwable th) {
                cm.m637a(th, "IFactory", "dDownload()");
            }
        }
    }

    public static void m721a(Context context, String str) {
        try {
            cp.m658b().submit(new InstanceFactory(context, str));
        } catch (Throwable th) {
            cm.m637a(th, "InstanceFactory", "rollBack");
        }
    }

    public static boolean m722a(Context context, cj cjVar) {
        try {
            File file = new File(DexFileManager.m742b(context, cjVar.m611a(), cjVar.m612b()));
            if (file.exists()) {
                return true;
            }
            File parentFile = file.getParentFile();
            if (file.exists() || parentFile == null || !parentFile.exists()) {
                return false;
            }
            DexFileManager.m744c(context, cjVar.m611a(), cjVar.m612b());
            return false;
        } catch (Throwable th) {
            cm.m637a(th, "IFactory", "isdowned");
            return false;
        }
    }

    private static BaseClassLoader m723b(Context context, cj cjVar) {
        BaseClassLoader baseClassLoader = null;
        try {
            if (InstanceFactory.m722a(context, cjVar)) {
                baseClassLoader = ClassLoaderFactory.m726a().m727a(context, cjVar);
            }
        } catch (Throwable th) {
            cm.m637a(th, "IFactory", "gIns1");
        }
        return baseClassLoader;
    }
}
