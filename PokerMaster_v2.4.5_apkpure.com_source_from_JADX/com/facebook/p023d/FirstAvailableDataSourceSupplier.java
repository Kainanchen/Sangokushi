package com.facebook.p023d;

import com.facebook.common.p011d.Objects;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p011d.Supplier;
import com.facebook.common.p013b.CallerThreadExecutor;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* renamed from: com.facebook.d.f */
public final class FirstAvailableDataSourceSupplier<T> implements Supplier<DataSource<T>> {
    final List<Supplier<DataSource<T>>> f1192a;

    @ThreadSafe
    /* renamed from: com.facebook.d.f.a */
    private class FirstAvailableDataSourceSupplier extends AbstractDataSource<T> {
        DataSource<T> f1188a;
        DataSource<T> f1189b;
        final /* synthetic */ FirstAvailableDataSourceSupplier f1190c;
        private int f1191d;

        /* renamed from: com.facebook.d.f.a.a */
        private class FirstAvailableDataSourceSupplier implements DataSubscriber<T> {
            final /* synthetic */ FirstAvailableDataSourceSupplier f1187a;

            private FirstAvailableDataSourceSupplier(FirstAvailableDataSourceSupplier firstAvailableDataSourceSupplier) {
                this.f1187a = firstAvailableDataSourceSupplier;
            }

            public final void m1181b(DataSource<T> dataSource) {
                FirstAvailableDataSourceSupplier.m1184a(this.f1187a, dataSource);
            }

            public final void m1180a(DataSource<T> dataSource) {
                if (dataSource.m1146c()) {
                    FirstAvailableDataSourceSupplier firstAvailableDataSourceSupplier = this.f1187a;
                    boolean b = dataSource.m1145b();
                    synchronized (firstAvailableDataSourceSupplier) {
                        if (dataSource != firstAvailableDataSourceSupplier.f1188a || dataSource == firstAvailableDataSourceSupplier.f1189b) {
                        } else {
                            DataSource dataSource2;
                            if (firstAvailableDataSourceSupplier.f1189b == null || b) {
                                dataSource2 = firstAvailableDataSourceSupplier.f1189b;
                                firstAvailableDataSourceSupplier.f1189b = dataSource;
                            } else {
                                dataSource2 = null;
                            }
                            FirstAvailableDataSourceSupplier.m1183a(dataSource2);
                        }
                    }
                    if (dataSource == firstAvailableDataSourceSupplier.m1192h()) {
                        firstAvailableDataSourceSupplier.m1162a(null, dataSource.m1145b());
                    }
                } else if (dataSource.m1145b()) {
                    FirstAvailableDataSourceSupplier.m1184a(this.f1187a, dataSource);
                }
            }

            public final void m1182c(DataSource<T> dataSource) {
                this.f1187a.m1161a(Math.max(this.f1187a.m1168f(), dataSource.m1149f()));
            }
        }

        public FirstAvailableDataSourceSupplier(FirstAvailableDataSourceSupplier firstAvailableDataSourceSupplier) {
            this.f1190c = firstAvailableDataSourceSupplier;
            this.f1191d = 0;
            this.f1188a = null;
            this.f1189b = null;
            if (!m1187i()) {
                m1163a(new RuntimeException("No data source supplier or supplier returned null."));
            }
        }

        @Nullable
        public final synchronized T m1190d() {
            DataSource h;
            h = m1192h();
            return h != null ? h.m1147d() : null;
        }

        public final synchronized boolean m1189c() {
            boolean z;
            DataSource h = m1192h();
            z = h != null && h.m1146c();
            return z;
        }

        public final boolean m1191g() {
            synchronized (this) {
                if (super.m1169g()) {
                    DataSource dataSource = this.f1188a;
                    this.f1188a = null;
                    DataSource dataSource2 = this.f1189b;
                    this.f1189b = null;
                    FirstAvailableDataSourceSupplier.m1183a(dataSource2);
                    FirstAvailableDataSourceSupplier.m1183a(dataSource);
                    return true;
                }
                return false;
            }
        }

        private boolean m1187i() {
            Supplier j = m1188j();
            DataSource dataSource = j != null ? (DataSource) j.m963a() : null;
            if (!m1185b(dataSource) || dataSource == null) {
                FirstAvailableDataSourceSupplier.m1183a(dataSource);
                return false;
            }
            dataSource.m1144a(new FirstAvailableDataSourceSupplier(), CallerThreadExecutor.m1005a());
            return true;
        }

        @Nullable
        private synchronized Supplier<DataSource<T>> m1188j() {
            Supplier<DataSource<T>> supplier;
            if (m1160a() || this.f1191d >= this.f1190c.f1192a.size()) {
                supplier = null;
            } else {
                List list = this.f1190c.f1192a;
                int i = this.f1191d;
                this.f1191d = i + 1;
                supplier = (Supplier) list.get(i);
            }
            return supplier;
        }

        private synchronized boolean m1185b(DataSource<T> dataSource) {
            boolean z;
            if (m1160a()) {
                z = false;
            } else {
                this.f1188a = dataSource;
                z = true;
            }
            return z;
        }

        private synchronized boolean m1186c(DataSource<T> dataSource) {
            boolean z;
            if (m1160a() || dataSource != this.f1188a) {
                z = false;
            } else {
                this.f1188a = null;
                z = true;
            }
            return z;
        }

        @Nullable
        final synchronized DataSource<T> m1192h() {
            return this.f1189b;
        }

        static void m1183a(DataSource<T> dataSource) {
            if (dataSource != null) {
                dataSource.m1150g();
            }
        }

        static /* synthetic */ void m1184a(FirstAvailableDataSourceSupplier firstAvailableDataSourceSupplier, DataSource dataSource) {
            if (firstAvailableDataSourceSupplier.m1186c(dataSource)) {
                if (dataSource != firstAvailableDataSourceSupplier.m1192h()) {
                    FirstAvailableDataSourceSupplier.m1183a(dataSource);
                }
                if (!firstAvailableDataSourceSupplier.m1187i()) {
                    firstAvailableDataSourceSupplier.m1163a(dataSource.m1148e());
                }
            }
        }
    }

    public FirstAvailableDataSourceSupplier(List<Supplier<DataSource<T>>> list) {
        Preconditions.m1034a(!list.isEmpty(), (Object) "List of suppliers is empty!");
        this.f1192a = list;
    }

    public final int hashCode() {
        return this.f1192a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirstAvailableDataSourceSupplier)) {
            return false;
        }
        return Objects.m1029a(this.f1192a, ((FirstAvailableDataSourceSupplier) obj).f1192a);
    }

    public final String toString() {
        return Objects.m1028a(this).m1026a("list", this.f1192a).toString();
    }

    public final /* synthetic */ Object m1193a() {
        return new FirstAvailableDataSourceSupplier(this);
    }
}
