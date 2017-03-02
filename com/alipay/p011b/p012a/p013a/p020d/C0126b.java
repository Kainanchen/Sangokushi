package com.alipay.p011b.p012a.p013a.p020d;

import android.os.Environment;
import com.alipay.p011b.p012a.p013a.p014a.C0111b;
import java.io.File;

/* renamed from: com.alipay.b.a.a.d.b */
public final class C0126b {
    public static String m341a(String str) {
        try {
            if (C0126b.m342a()) {
                String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
                if (new File(absolutePath, str).exists()) {
                    return C0111b.m242a(absolutePath, str);
                }
            }
        } catch (Exception e) {
        }
        return null;
    }

    public static boolean m342a() {
        String externalStorageState = Environment.getExternalStorageState();
        return externalStorageState != null && externalStorageState.length() > 0 && ((externalStorageState.equals("mounted") || externalStorageState.equals("mounted_ro")) && Environment.getExternalStorageDirectory() != null);
    }
}
