package org.p005a.p006a.p008b;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;

/* renamed from: org.a.a.b.d */
public enum IdentityScopeType {
    ;

    static {
        fixHelper.fixfunc(new int[]{12759, 1});
        IdentityScopeType.__clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    static void __clinit__() {
        f399a = new IdentityScopeType("Session", 0);
        f400b = new IdentityScopeType("None", 1);
        f401c = new IdentityScopeType[]{f399a, f400b};
    }
}
