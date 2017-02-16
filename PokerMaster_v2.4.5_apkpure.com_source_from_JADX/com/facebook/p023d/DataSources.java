package com.facebook.p023d;

import com.facebook.common.p011d.Supplier;

/* renamed from: com.facebook.d.d */
public final class DataSources {

    /* renamed from: com.facebook.d.d.1 */
    static class DataSources implements Supplier<DataSource<T>> {
        final /* synthetic */ Throwable f1186a;

        public DataSources(Throwable th) {
            this.f1186a = th;
        }

        public final /* bridge */ /* synthetic */ Object m1178a() {
            return DataSources.m1179a(this.f1186a);
        }
    }

    public static <T> DataSource<T> m1179a(Throwable th) {
        DataSource simpleDataSource = new SimpleDataSource();
        simpleDataSource.m1209a(th);
        return simpleDataSource;
    }
}
