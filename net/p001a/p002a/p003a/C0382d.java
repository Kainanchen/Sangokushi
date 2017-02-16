package net.p001a.p002a.p003a;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;

/* renamed from: net.a.a.a.d */
public final class C0382d {
    public static final C0382d f358a = null;
    public static final C0382d f359b = null;
    public static final C0382d f360c = null;
    protected String f361d;

    static {
        fixHelper.fixfunc(new int[]{14772, 1});
        C0382d.__clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native C0382d(String str);

    static void __clinit__() {
        f358a = new C0382d("WITH_U_AND_COLON");
        f359b = new C0382d("WITH_V");
        f360c = new C0382d("WITH_U_UNICODE");
    }
}
