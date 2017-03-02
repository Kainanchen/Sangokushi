package com.igexin.push.p052f;

import android.content.pm.PackageManager;
import android.os.Process;
import com.igexin.push.config.C0367a;
import com.igexin.push.config.C0378l;
import com.igexin.push.core.C0483g;
import com.igexin.push.core.bean.C0431e;
import com.igexin.push.core.bean.C0432f;
import com.igexin.sdk.PushBuildConfig;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.igexin.push.f.a */
public class C0512a {
    public static void m1840a(C0432f c0432f) {
        C0483g.ap = 0;
        C0483g.aq = 0;
        C0483g.as = c0432f;
        Map b = c0432f.m1504b();
        C0431e c0431e;
        if (C0378l.f1033t != null) {
            int intValue;
            Map b2 = C0378l.f1033t.m1504b();
            List<Integer> arrayList = new ArrayList();
            for (Entry entry : b2.entrySet()) {
                intValue = ((Integer) entry.getKey()).intValue();
                c0431e = (C0431e) entry.getValue();
                if (!b.containsKey(Integer.valueOf(intValue))) {
                    C0483g.at = true;
                    C0513b.m1850a(c0431e.m1489c());
                    arrayList.add(Integer.valueOf(intValue));
                }
            }
            if (arrayList != null && arrayList.size() > 0) {
                for (Integer intValue2 : arrayList) {
                    b2.remove(Integer.valueOf(intValue2.intValue()));
                }
                C0367a.m1224a().m1240g();
            }
            boolean z = true;
            for (Entry entry2 : b.entrySet()) {
                boolean z2;
                intValue = ((Integer) entry2.getKey()).intValue();
                c0431e = (C0431e) entry2.getValue();
                if (b2.containsKey(Integer.valueOf(intValue))) {
                    if (!((C0431e) b2.get(Integer.valueOf(intValue))).m1486b().equals(c0431e.m1486b())) {
                        C0483g.at = true;
                        C0483g.ap++;
                        C0513b.m1848a(c0431e);
                        z = false;
                    }
                    z2 = z;
                } else {
                    C0483g.ap++;
                    C0513b.m1848a(c0431e);
                    z2 = false;
                }
                z = z2;
            }
            if (z) {
                C0378l.f1033t.m1502a(c0432f.m1501a());
                C0367a.m1224a().m1240g();
                Process.killProcess(Process.myPid());
                return;
            }
            return;
        }
        for (Entry entry22 : b.entrySet()) {
            c0431e = (C0431e) entry22.getValue();
            C0483g.ap++;
            C0513b.m1848a(c0431e);
        }
    }

    public static boolean m1841a() {
        try {
            if (PushBuildConfig.sdk_conf_debug_level.equals(C0378l.f1034u)) {
                return false;
            }
            String[] split = C0378l.f1034u.split(",");
            for (String b : split) {
                if (C0512a.m1845b(b)) {
                    return false;
                }
            }
            if (PushBuildConfig.sdk_conf_debug_level.equals(C0378l.f1035v)) {
                return false;
            }
            split = C0378l.f1035v.split(",");
            Class cls = Class.forName("android.os.ServiceManager");
            Method method = cls.getMethod("getService", new Class[]{String.class});
            method.setAccessible(true);
            for (String a : split) {
                if (C0512a.m1842a(cls, method, a)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static boolean m1842a(Class cls, Method method, String str) {
        try {
            return method.invoke(cls, new Object[]{str}) != null;
        } catch (Exception e) {
            return true;
        }
    }

    public static boolean m1843a(String str) {
        try {
            return C0483g.f1321g.getPackageManager().getLaunchIntentForPackage(str) != null;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean m1844b() {
        return System.currentTimeMillis() > C0378l.f1016c;
    }

    private static boolean m1845b(String str) {
        try {
            C0483g.f1321g.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean m1846c() {
        PackageManager packageManager = C0483g.f1321g.getPackageManager();
        String packageName = C0483g.f1321g.getPackageName();
        return packageManager.checkPermission("android.permission.ACCESS_WIFI_STATE", packageName) == 0 && packageManager.checkPermission("android.permission.CHANGE_WIFI_STATE", packageName) == 0;
    }
}
