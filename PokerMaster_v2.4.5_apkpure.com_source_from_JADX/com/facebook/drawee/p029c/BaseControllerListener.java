package com.facebook.drawee.p029c;

import android.graphics.drawable.Animatable;
import javax.annotation.Nullable;

/* renamed from: com.facebook.drawee.c.c */
public class BaseControllerListener<INFO> implements ControllerListener<INFO> {
    private static final ControllerListener<Object> f1316a;

    static {
        f1316a = new BaseControllerListener();
    }

    public static <INFO> ControllerListener<INFO> m1309a() {
        return f1316a;
    }

    public final void m1311a(String str, Object obj) {
    }

    public void m1312a(String str, @Nullable INFO info, @Nullable Animatable animatable) {
    }

    public final void m1314b(String str, @Nullable INFO info) {
    }

    public final void m1313a(String str, Throwable th) {
    }

    public final void m1315b(String str, Throwable th) {
    }

    public final void m1310a(String str) {
    }
}
