package net.p001a.p002a.p003a;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;

/* renamed from: net.a.a.a.a */
public final class C0379a {
    public static final C0379a f348a = null;
    public static final C0379a f349b = null;
    protected String f350c;

    static {
        fixHelper.fixfunc(new int[]{15197, 1});
        C0379a.__clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native C0379a(String str);

    static void __clinit__() {
        f348a = new C0379a("UPPERCASE");
        f349b = new C0379a("LOWERCASE");
    }
}
