package net.p001a.p002a.p003a;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;

/* renamed from: net.a.a.a.c */
public final class C0381c {
    public static final C0381c f354a = null;
    public static final C0381c f355b = null;
    public static final C0381c f356c = null;
    protected String f357d;

    static {
        fixHelper.fixfunc(new int[]{14832, 1});
        C0381c.__clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native C0381c(String str);

    static void __clinit__() {
        f354a = new C0381c("WITH_TONE_NUMBER");
        f355b = new C0381c("WITHOUT_TONE");
        f356c = new C0381c("WITH_TONE_MARK");
    }
}
