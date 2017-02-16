package com.amap.p003a;

import android.content.Context;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import com.amap.p003a.DexFileManager.DexFileManager;
import com.amap.p003a.aa.DynamicPlugin;
import dalvik.system.DexFile;
import java.io.Closeable;
import java.io.File;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.util.Date;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/* renamed from: com.amap.a.x */
final class DynamicClassLoader extends BaseClassLoader {
    private PublicKey f727g;

    /* renamed from: com.amap.a.x.1 */
    class DynamicClassLoader implements Runnable {
        final /* synthetic */ Context f723a;
        final /* synthetic */ String f724b;
        final /* synthetic */ String f725c;
        final /* synthetic */ DynamicClassLoader f726d;

        DynamicClassLoader(DynamicClassLoader dynamicClassLoader, Context context, String str, String str2) {
            this.f726d = dynamicClassLoader;
            this.f723a = context;
            this.f724b = str;
            this.f725c = str2;
        }

        public final void run() {
            try {
                this.f726d.m749a(this.f723a, this.f724b, this.f725c);
            } catch (Throwable th) {
                cm.m637a(th, "dLoader", "run()");
            }
        }
    }

    DynamicClassLoader(Context context, cj cjVar) {
        super(context, cjVar);
        this.f727g = null;
        String b = DexFileManager.m742b(context, cjVar.m611a(), cjVar.m612b());
        String a = DexFileManager.m733a(context);
        if (TextUtils.isEmpty(b) || TextUtils.isEmpty(a)) {
            throw new Exception("dexPath or dexOutputDir is null.");
        }
        String str = a + File.separator + DexFileManager.m737a(new File(b).getName());
        try {
            if (this.c == null) {
                m725b();
                this.c = DexFile.loadDex(b, str, 0);
            }
            cp.m658b().submit(new DynamicClassLoader(this, context, b, a));
        } catch (Throwable th) {
            cm.m637a(th, "dLoader", "loadFile");
            Exception exception = new Exception("load file fail");
        }
    }

    private static void m745a(JarFile jarFile, JarEntry jarEntry) {
        Closeable closeable = null;
        try {
            closeable = jarFile.getInputStream(jarEntry);
            while (true) {
                if (closeable.read(new byte[AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD]) <= 0) {
                    break;
                }
            }
        } catch (Throwable th) {
            cm.m637a(th, "DyLoader", "loadJa");
        } finally {
            ac.m105a(closeable);
        }
    }

    private boolean m746a(DBOperation dBOperation, String str, String str2) {
        String a = DexFileManager.m735a(this.a, str);
        if (ac.m107a(dBOperation, str, a, this.e)) {
            return true;
        }
        if (DexFileManager.m731a(dBOperation, str) != null) {
            return false;
        }
        if (!TextUtils.isEmpty(this.f)) {
            DynamicPlugin dynamicPlugin = new DynamicPlugin(str, cg.m584a(a), this.e.m611a(), this.e.m612b(), str2);
            dynamicPlugin.f74f = "useod";
            dBOperation.m683a(dynamicPlugin.m64a(), aa.m68b(str));
        }
        return true;
    }

    private boolean m747a(File file) {
        Throwable th;
        Throwable th2;
        boolean z = false;
        Closeable closeable = null;
        try {
            if (this.f727g == null) {
                this.f727g = ac.m104a();
            }
            Closeable jarFile = new JarFile(file);
            try {
                JarEntry jarEntry = jarFile.getJarEntry("classes.dex");
                if (jarEntry == null) {
                    ac.m105a(jarFile);
                } else {
                    DynamicClassLoader.m745a(jarFile, jarEntry);
                    Certificate[] certificates = jarEntry.getCertificates();
                    if (certificates == null) {
                        ac.m105a(jarFile);
                    } else {
                        z = m748a(certificates);
                        ac.m105a(jarFile);
                    }
                }
            } catch (Throwable th3) {
                th2 = th3;
                closeable = jarFile;
                ac.m105a(closeable);
                throw th2;
            }
        } catch (Throwable th4) {
            th = th4;
            cm.m637a(th, "DyLoader", "verify");
            ac.m105a(closeable);
            return z;
        }
        return z;
    }

    private boolean m748a(Certificate[] certificateArr) {
        try {
            if (certificateArr.length > 0) {
                int length = certificateArr.length - 1;
                if (length >= 0) {
                    certificateArr[length].verify(this.f727g);
                    return true;
                }
            }
        } catch (Throwable e) {
            cm.m637a(e, "DyLoader", "check");
        }
        return false;
    }

    final void m749a(Context context, String str, String str2) {
        boolean z = false;
        new Date().getTime();
        try {
            DBOperation dBOperation = new DBOperation(context, DynamicFileDBCreator.m751b());
            File file = new File(str);
            aa a = DexFileManager.m731a(dBOperation, file.getName());
            if (a != null) {
                this.f = a.f78d;
            }
            cj cjVar = this.e;
            String absolutePath = file.getAbsolutePath();
            if (m747a(new File(absolutePath))) {
                z = ac.m107a(dBOperation, DexFileManager.m736a(this.a, cjVar.m611a(), cjVar.m612b()), absolutePath, cjVar);
            }
            if (!z) {
                this.d = false;
                DexFileManager.m740a(this.a, dBOperation, file.getName());
                Object a2 = DexFileManager.m734a(this.a, dBOperation, this.e);
                if (!TextUtils.isEmpty(a2)) {
                    this.f = a2;
                    DexFileManager.m738a(this.a, this.e);
                }
            }
            if (file.exists()) {
                if (new File(str2 + File.separator + DexFileManager.m737a(file.getName())).exists() && !m746a(dBOperation, DexFileManager.m737a(file.getName()), this.f)) {
                    DexFileManager.m738a(this.a, this.e);
                }
                new Date().getTime();
            }
        } catch (Throwable th) {
            cm.m637a(th, "dLoader", "verifyD()");
        }
    }

    protected final Class<?> findClass(String str) {
        try {
            if (this.c == null) {
                throw new ClassNotFoundException(str);
            }
            Class<?> cls = (Class) this.b.get(str);
            if (cls == null) {
                cls = this.c.loadClass(str, this);
                if (cls == null) {
                    throw new ClassNotFoundException(str);
                }
                this.b.put(str, cls);
            }
            return cls;
        } catch (Throwable th) {
            cm.m637a(th, "dLoader", "findCl");
            ClassNotFoundException classNotFoundException = new ClassNotFoundException(str);
        }
    }
}
