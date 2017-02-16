package com.tencent.p080b.p081a.p083b;

import java.io.File;

/* renamed from: com.tencent.b.a.b.p */
final class C1053p {
    private static int f8099a;

    static {
        f8099a = -1;
    }

    public static boolean m5727a() {
        if (f8099a == 1) {
            return true;
        }
        if (f8099a == 0) {
            return false;
        }
        String[] strArr = new String[]{"/bin", "/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/"};
        int i = 0;
        while (i < 6) {
            try {
                if (new File(strArr[i] + "su").exists()) {
                    f8099a = 1;
                    return true;
                }
                i++;
            } catch (Exception e) {
            }
        }
        f8099a = 0;
        return false;
    }
}
