package org.p005a.p006a.p008b;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.lang.ref.Reference;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: org.a.a.b.c */
public final class IdentityScopeObject<K, T> implements IdentityScope<K, T> {
    private final HashMap<K, Reference<T>> f397a;
    private final ReentrantLock f398b;

    static {
        fixHelper.fixfunc(new int[]{12423, 12424, 12425, 12426, 12427, 12428, 12429, 12430, 12431, 12432});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public final native T m465a(K k);

    public final native void m466a();

    public final native void m467a(int i);

    public final native void m468a(K k, T t);

    public final native T m469b(K k);

    public final native void m470b();

    public final native void m471b(K k, T t);

    public final native void m472c();

    public final native void m473c(K k);
}
