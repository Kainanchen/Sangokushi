package net.p001a.p002a;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;

/* renamed from: net.a.a.g */
public final class C0391g {
    static final C0391g f368a = null;
    public static final C0391g f369b = null;
    public static final C0391g f370c = null;
    public static final C0391g f371d = null;
    public static final C0391g f372e = null;
    static final C0391g f373f = null;
    protected String f374g;

    static {
        fixHelper.fixfunc(new int[]{27495, 27496});
        C0391g.__clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native C0391g(String str);

    static void __clinit__() {
        f368a = new C0391g("Hanyu");
        f369b = new C0391g("Wade");
        f370c = new C0391g("MPSII");
        f371d = new C0391g("Yale");
        f372e = new C0391g("Tongyong");
        f373f = new C0391g("Gwoyeu");
    }

    final native String m361a();
}
