package net.p001a.p002a;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.io.BufferedInputStream;

/* renamed from: net.a.a.h */
class C0392h {
    static Class f375a;

    static {
        fixHelper.fixfunc(new int[]{28097, 1});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    native C0392h();

    static BufferedInputStream m362a(String str) {
        Class b;
        if (f375a == null) {
            b = C0392h.m363b("net.a.a.h");
            f375a = b;
        } else {
            b = f375a;
        }
        return new BufferedInputStream(b.getResourceAsStream(str));
    }

    private static Class m363b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }
}
