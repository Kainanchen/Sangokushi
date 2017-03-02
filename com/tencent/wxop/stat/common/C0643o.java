package com.tencent.wxop.stat.common;

import java.io.File;

/* renamed from: com.tencent.wxop.stat.common.o */
class C0643o {
    private static int f2068a;

    static {
        f2068a = -1;
    }

    public static boolean m2438a() {
        if (f2068a == 1) {
            return true;
        }
        if (f2068a == 0) {
            return false;
        }
        String[] strArr = new String[]{"/bin", "/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/"};
        int i = 0;
        while (i < 6) {
            try {
                if (new File(strArr[i] + "su").exists()) {
                    f2068a = 1;
                    return true;
                }
                i++;
            } catch (Exception e) {
            }
        }
        f2068a = 0;
        return false;
    }
}
