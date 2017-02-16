package org.p005a.p006a.p008b;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.lang.ref.Reference;
import java.util.concurrent.locks.ReentrantLock;
import org.p005a.p006a.p009c.LongHashMap;

/* renamed from: org.a.a.b.b */
public final class IdentityScopeLong<T> implements IdentityScope<Long, T> {
    private final LongHashMap<Reference<T>> f395a;
    private final ReentrantLock f396b;

    static {
        fixHelper.fixfunc(new int[]{12169, 12170, 12171, 12172, 12173, 12174, 12175, 12176, 12177, 12178, 12179, 12180, 12181, 12182});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public final native T m452a(long j);

    public final native /* synthetic */ Object m453a(Object obj);

    public final native void m454a();

    public final native void m455a(int i);

    public final native void m456a(long j, T t);

    public final native /* synthetic */ void m457a(Object obj, Object obj2);

    public final native T m458b(long j);

    public final native /* synthetic */ Object m459b(Object obj);

    public final native void m460b();

    public final native void m461b(long j, T t);

    public final native /* synthetic */ void m462b(Object obj, Object obj2);

    public final native void m463c();

    public final native /* synthetic */ void m464c(Object obj);
}
