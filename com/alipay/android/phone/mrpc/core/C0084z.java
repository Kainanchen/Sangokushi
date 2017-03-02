package com.alipay.android.phone.mrpc.core;

import android.os.Looper;
import com.alipay.android.phone.mrpc.core.p003a.C0052f;
import com.alipay.android.phone.mrpc.core.p003a.C0054d;
import com.alipay.android.phone.mrpc.core.p003a.C0055e;
import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.ResetCookie;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.alipay.android.phone.mrpc.core.z */
public final class C0084z {
    private static final ThreadLocal<Object> f96a;
    private static final ThreadLocal<Map<String, Object>> f97b;
    private byte f98c;
    private AtomicInteger f99d;
    private C0082x f100e;

    static {
        f96a = new ThreadLocal();
        f97b = new ThreadLocal();
    }

    public C0084z(C0082x c0082x) {
        this.f98c = (byte) 0;
        this.f100e = c0082x;
        this.f99d = new AtomicInteger();
    }

    public final Object m127a(Method method, Object[] objArr) {
        boolean z = true;
        boolean z2 = Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper();
        if (z2) {
            throw new IllegalThreadStateException("can't in main thread call rpc .");
        }
        OperationType operationType = (OperationType) method.getAnnotation(OperationType.class);
        if (method.getAnnotation(ResetCookie.class) == null) {
            z = false;
        }
        Type genericReturnType = method.getGenericReturnType();
        method.getAnnotations();
        f96a.set(null);
        f97b.set(null);
        if (operationType == null) {
            throw new IllegalStateException("OperationType must be set.");
        }
        String value = operationType.value();
        int incrementAndGet = this.f99d.incrementAndGet();
        try {
            if (this.f98c == null) {
                C0052f c0055e = new C0055e(incrementAndGet, value, objArr);
                if (f97b.get() != null) {
                    c0055e.m40a(f97b.get());
                }
                byte[] bArr = (byte[]) new C0069j(this.f100e.m125a(), method, incrementAndGet, value, c0055e.m41a(), z).m45a();
                f97b.set(null);
                Object a = new C0054d(genericReturnType, bArr).m39a();
                if (genericReturnType != Void.TYPE) {
                    f96a.set(a);
                }
            }
            return f96a.get();
        } catch (RpcException e) {
            e.setOperationType(value);
            throw e;
        }
    }
}
