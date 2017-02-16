package com.facebook.p023d;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* renamed from: com.facebook.d.c */
public interface DataSource<T> {
    void m1144a(DataSubscriber<T> dataSubscriber, Executor executor);

    boolean m1145b();

    boolean m1146c();

    @Nullable
    T m1147d();

    @Nullable
    Throwable m1148e();

    float m1149f();

    boolean m1150g();
}
