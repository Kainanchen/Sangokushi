package com.facebook.p023d;

import com.facebook.common.p011d.Objects;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p011d.Supplier;
import com.facebook.common.p013b.CallerThreadExecutor;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* renamed from: com.facebook.d.g */
public final class IncreasingQualityDataSourceSupplier<T> implements Supplier<DataSource<T>> {
    final List<Supplier<DataSource<T>>> f1198a;

    @ThreadSafe
    /* renamed from: com.facebook.d.g.a */
    private class IncreasingQualityDataSourceSupplier extends AbstractDataSource<T> {
        @GuardedBy("IncreasingQualityDataSource.this")
        int f1195a;
        final /* synthetic */ IncreasingQualityDataSourceSupplier f1196b;
        @GuardedBy("IncreasingQualityDataSource.this")
        @Nullable
        private ArrayList<DataSource<T>> f1197c;

        /* renamed from: com.facebook.d.g.a.a */
        private class IncreasingQualityDataSourceSupplier implements DataSubscriber<T> {
            final /* synthetic */ IncreasingQualityDataSourceSupplier f1193a;
            private int f1194b;

            public IncreasingQualityDataSourceSupplier(IncreasingQualityDataSourceSupplier increasingQualityDataSourceSupplier, int i) {
                this.f1193a = increasingQualityDataSourceSupplier;
                this.f1194b = i;
            }

            public final void m1194a(DataSource<T> dataSource) {
                if (dataSource.m1146c()) {
                    IncreasingQualityDataSourceSupplier increasingQualityDataSourceSupplier = this.f1193a;
                    int i = this.f1194b;
                    boolean b = dataSource.m1145b();
                    synchronized (increasingQualityDataSourceSupplier) {
                        int i2 = increasingQualityDataSourceSupplier.f1195a;
                        if (dataSource != increasingQualityDataSourceSupplier.m1200a(i) || i == increasingQualityDataSourceSupplier.f1195a) {
                        } else {
                            if (increasingQualityDataSourceSupplier.m1205h() == null || (b && i < increasingQualityDataSourceSupplier.f1195a)) {
                                increasingQualityDataSourceSupplier.f1195a = i;
                                i2 = i;
                            }
                            for (int i3 = increasingQualityDataSourceSupplier.f1195a; i3 > i2; i3--) {
                                IncreasingQualityDataSourceSupplier.m1198a(increasingQualityDataSourceSupplier.m1201b(i3));
                            }
                        }
                    }
                    if (dataSource == increasingQualityDataSourceSupplier.m1205h()) {
                        boolean z;
                        if (i == 0 && dataSource.m1145b()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        increasingQualityDataSourceSupplier.m1162a(null, z);
                    }
                } else if (dataSource.m1145b()) {
                    IncreasingQualityDataSourceSupplier.m1199a(this.f1193a, this.f1194b, dataSource);
                }
            }

            public final void m1195b(DataSource<T> dataSource) {
                IncreasingQualityDataSourceSupplier.m1199a(this.f1193a, this.f1194b, dataSource);
            }

            public final void m1196c(DataSource<T> dataSource) {
                if (this.f1194b == 0) {
                    this.f1193a.m1161a(dataSource.m1149f());
                }
            }
        }

        public IncreasingQualityDataSourceSupplier(IncreasingQualityDataSourceSupplier increasingQualityDataSourceSupplier) {
            this.f1196b = increasingQualityDataSourceSupplier;
            int size = increasingQualityDataSourceSupplier.f1198a.size();
            this.f1195a = size;
            this.f1197c = new ArrayList(size);
            int i = 0;
            while (i < size) {
                DataSource dataSource = (DataSource) ((Supplier) increasingQualityDataSourceSupplier.f1198a.get(i)).m963a();
                this.f1197c.add(dataSource);
                dataSource.m1144a(new IncreasingQualityDataSourceSupplier(this, i), CallerThreadExecutor.m1005a());
                if (!dataSource.m1146c()) {
                    i++;
                } else {
                    return;
                }
            }
        }

        @Nullable
        final synchronized DataSource<T> m1200a(int i) {
            DataSource<T> dataSource;
            dataSource = (this.f1197c == null || i >= this.f1197c.size()) ? null : (DataSource) this.f1197c.get(i);
            return dataSource;
        }

        @Nullable
        final synchronized DataSource<T> m1201b(int i) {
            DataSource<T> dataSource = null;
            synchronized (this) {
                if (this.f1197c != null && i < this.f1197c.size()) {
                    dataSource = (DataSource) this.f1197c.set(i, null);
                }
            }
            return dataSource;
        }

        @Nullable
        final synchronized DataSource<T> m1205h() {
            return m1200a(this.f1195a);
        }

        @Nullable
        public final synchronized T m1203d() {
            DataSource h;
            h = m1205h();
            return h != null ? h.m1147d() : null;
        }

        public final synchronized boolean m1202c() {
            boolean z;
            DataSource h = m1205h();
            z = h != null && h.m1146c();
            return z;
        }

        public final boolean m1204g() {
            synchronized (this) {
                if (super.m1169g()) {
                    ArrayList arrayList = this.f1197c;
                    this.f1197c = null;
                    if (arrayList != null) {
                        for (int i = 0; i < arrayList.size(); i++) {
                            IncreasingQualityDataSourceSupplier.m1198a((DataSource) arrayList.get(i));
                        }
                    }
                    return true;
                }
                return false;
            }
        }

        @Nullable
        private synchronized DataSource<T> m1197a(int i, DataSource<T> dataSource) {
            if (dataSource == m1205h()) {
                dataSource = null;
            } else if (dataSource == m1200a(i)) {
                dataSource = m1201b(i);
            }
            return dataSource;
        }

        static void m1198a(DataSource<T> dataSource) {
            if (dataSource != null) {
                dataSource.m1150g();
            }
        }

        static /* synthetic */ void m1199a(IncreasingQualityDataSourceSupplier increasingQualityDataSourceSupplier, int i, DataSource dataSource) {
            IncreasingQualityDataSourceSupplier.m1198a(increasingQualityDataSourceSupplier.m1197a(i, dataSource));
            if (i == 0) {
                increasingQualityDataSourceSupplier.m1163a(dataSource.m1148e());
            }
        }
    }

    public IncreasingQualityDataSourceSupplier(List<Supplier<DataSource<T>>> list) {
        Preconditions.m1034a(!list.isEmpty(), (Object) "List of suppliers is empty!");
        this.f1198a = list;
    }

    public final int hashCode() {
        return this.f1198a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IncreasingQualityDataSourceSupplier)) {
            return false;
        }
        return Objects.m1029a(this.f1198a, ((IncreasingQualityDataSourceSupplier) obj).f1198a);
    }

    public final String toString() {
        return Objects.m1028a(this).m1026a("list", this.f1198a).toString();
    }

    public final /* synthetic */ Object m1206a() {
        return new IncreasingQualityDataSourceSupplier(this);
    }
}
