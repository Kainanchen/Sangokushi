package com.facebook.drawee.p029c;

import android.content.Context;
import android.graphics.drawable.Animatable;
import com.facebook.common.p011d.Objects;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p011d.Supplier;
import com.facebook.drawee.p026b.RetryManager;
import com.facebook.drawee.p027f.GestureDetector;
import com.facebook.drawee.p028g.DraweeController;
import com.facebook.drawee.p028g.SimpleDraweeControllerBuilder;
import com.facebook.p023d.DataSource;
import com.facebook.p023d.DataSources.DataSources;
import com.facebook.p023d.FirstAvailableDataSourceSupplier;
import com.facebook.p023d.IncreasingQualityDataSourceSupplier;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nullable;

/* renamed from: com.facebook.drawee.c.b */
public abstract class AbstractDraweeControllerBuilder<BUILDER extends AbstractDraweeControllerBuilder<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> implements SimpleDraweeControllerBuilder {
    private static final ControllerListener<Object> f1244d;
    private static final NullPointerException f1245e;
    private static final AtomicLong f1246r;
    @Nullable
    public Object f1247a;
    @Nullable
    public REQUEST f1248b;
    @Nullable
    public DraweeController f1249c;
    private final Context f1250f;
    private final Set<ControllerListener> f1251g;
    @Nullable
    private REQUEST f1252h;
    @Nullable
    private REQUEST[] f1253i;
    private boolean f1254j;
    @Nullable
    private Supplier<DataSource<IMAGE>> f1255k;
    @Nullable
    private ControllerListener<? super INFO> f1256l;
    @Nullable
    private ControllerViewportVisibilityListener f1257m;
    private boolean f1258n;
    private boolean f1259o;
    private boolean f1260p;
    private String f1261q;

    /* renamed from: com.facebook.drawee.c.b.1 */
    static class AbstractDraweeControllerBuilder extends BaseControllerListener<Object> {
        AbstractDraweeControllerBuilder() {
        }

        public final void m1316a(String str, @Nullable Object obj, @Nullable Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    /* renamed from: com.facebook.drawee.c.b.2 */
    class AbstractDraweeControllerBuilder implements Supplier<DataSource<IMAGE>> {
        final /* synthetic */ Object f1317a;
        final /* synthetic */ Object f1318b;
        final /* synthetic */ AbstractDraweeControllerBuilder f1319c;
        final /* synthetic */ AbstractDraweeControllerBuilder f1320d;

        AbstractDraweeControllerBuilder(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, Object obj, Object obj2, AbstractDraweeControllerBuilder abstractDraweeControllerBuilder2) {
            this.f1320d = abstractDraweeControllerBuilder;
            this.f1317a = obj;
            this.f1318b = obj2;
            this.f1319c = abstractDraweeControllerBuilder2;
        }

        public final String toString() {
            return Objects.m1028a(this).m1026a("request", this.f1317a.toString()).toString();
        }

        public final /* bridge */ /* synthetic */ Object m1317a() {
            return this.f1320d.m1265a(this.f1317a, this.f1318b, this.f1319c);
        }
    }

    /* renamed from: com.facebook.drawee.c.b.a */
    public enum AbstractDraweeControllerBuilder {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    public abstract DataSource<IMAGE> m1265a(REQUEST request, Object obj, AbstractDraweeControllerBuilder abstractDraweeControllerBuilder);

    public abstract BUILDER m1266a();

    public abstract AbstractDraweeController m1269b();

    public final /* synthetic */ SimpleDraweeControllerBuilder m1271b(@Nullable DraweeController draweeController) {
        return m1267a(draweeController);
    }

    public final /* synthetic */ DraweeController m1274f() {
        return m1272c();
    }

    static {
        f1244d = new AbstractDraweeControllerBuilder();
        f1245e = new NullPointerException("No image request was specified!");
        f1246r = new AtomicLong();
    }

    public AbstractDraweeControllerBuilder(Context context, Set<ControllerListener> set) {
        this.f1250f = context;
        this.f1251g = set;
        this.f1247a = null;
        this.f1248b = null;
        this.f1252h = null;
        this.f1253i = null;
        this.f1254j = true;
        this.f1256l = null;
        this.f1257m = null;
        this.f1258n = false;
        this.f1259o = false;
        this.f1249c = null;
        this.f1261q = null;
    }

    public final BUILDER m1268a(REQUEST request) {
        this.f1248b = request;
        return m1266a();
    }

    public final BUILDER m1270b(REQUEST request) {
        this.f1252h = request;
        return m1266a();
    }

    public final BUILDER m1267a(@Nullable DraweeController draweeController) {
        this.f1249c = draweeController;
        return m1266a();
    }

    public final AbstractDraweeController m1272c() {
        boolean z = false;
        boolean z2 = this.f1253i == null || this.f1248b == null;
        Preconditions.m1036b(z2, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (this.f1255k == null || (this.f1253i == null && this.f1248b == null && this.f1252h == null)) {
            z = true;
        }
        Preconditions.m1036b(z, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
        if (this.f1248b == null && this.f1253i == null && this.f1252h != null) {
            this.f1248b = this.f1252h;
            this.f1252h = null;
        }
        AbstractDraweeController b = m1269b();
        b.f1218d = this.f1260p;
        b.f1219e = this.f1261q;
        b.f1217c = this.f1257m;
        if (this.f1258n) {
            RetryManager retryManager = b.f1215a;
            if (retryManager == null) {
                retryManager = new RetryManager();
                b.f1215a = retryManager;
            }
            retryManager.f1309a = this.f1258n;
            if (b.f1216b == null) {
                b.f1216b = new GestureDetector(this.f1250f);
                if (b.f1216b != null) {
                    b.f1216b.f1481a = b;
                }
            }
        }
        if (this.f1251g != null) {
            for (ControllerListener a : this.f1251g) {
                b.m1235a(a);
            }
        }
        if (this.f1256l != null) {
            b.m1235a(this.f1256l);
        }
        if (this.f1259o) {
            b.m1235a(f1244d);
        }
        return b;
    }

    public static String m1264d() {
        return String.valueOf(f1246r.getAndIncrement());
    }

    public final Supplier<DataSource<IMAGE>> m1273e() {
        int i = 0;
        if (this.f1255k != null) {
            return this.f1255k;
        }
        Supplier<DataSource<IMAGE>> supplier = null;
        if (this.f1248b != null) {
            supplier = m1263c(this.f1248b);
        } else if (this.f1253i != null) {
            Object[] objArr = this.f1253i;
            boolean z = this.f1254j;
            List arrayList = new ArrayList(objArr.length * 2);
            if (z) {
                for (Object a : objArr) {
                    arrayList.add(m1262a(a, AbstractDraweeControllerBuilder.BITMAP_MEMORY_CACHE));
                }
            }
            while (i < objArr.length) {
                arrayList.add(m1263c(objArr[i]));
                i++;
            }
            supplier = new FirstAvailableDataSourceSupplier(arrayList);
        }
        if (!(supplier == null || this.f1252h == null)) {
            List arrayList2 = new ArrayList(2);
            arrayList2.add(supplier);
            arrayList2.add(m1263c(this.f1252h));
            supplier = new IncreasingQualityDataSourceSupplier(arrayList2);
        }
        if (supplier == null) {
            return new DataSources(f1245e);
        }
        return supplier;
    }

    private Supplier<DataSource<IMAGE>> m1263c(REQUEST request) {
        return m1262a(request, AbstractDraweeControllerBuilder.FULL_FETCH);
    }

    private Supplier<DataSource<IMAGE>> m1262a(REQUEST request, AbstractDraweeControllerBuilder abstractDraweeControllerBuilder) {
        return new AbstractDraweeControllerBuilder(this, request, this.f1247a, abstractDraweeControllerBuilder);
    }

    public final /* synthetic */ SimpleDraweeControllerBuilder m1275g() {
        this.f1247a = null;
        return m1266a();
    }
}
