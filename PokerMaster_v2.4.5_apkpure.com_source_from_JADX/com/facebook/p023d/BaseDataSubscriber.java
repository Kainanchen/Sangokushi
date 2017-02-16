package com.facebook.p023d;

/* renamed from: com.facebook.d.b */
public abstract class BaseDataSubscriber<T> implements DataSubscriber<T> {
    public abstract void m1176d(DataSource<T> dataSource);

    public abstract void m1177e(DataSource<T> dataSource);

    public final void m1173a(DataSource<T> dataSource) {
        boolean b = dataSource.m1145b();
        try {
            m1176d(dataSource);
            if (b) {
                dataSource.m1150g();
            }
        } catch (Throwable th) {
            if (b) {
                dataSource.m1150g();
            }
        }
    }

    public final void m1174b(DataSource<T> dataSource) {
        try {
            m1177e(dataSource);
        } finally {
            dataSource.m1150g();
        }
    }

    public void m1175c(DataSource<T> dataSource) {
    }
}
