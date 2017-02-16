package com.facebook.drawee.p024a.p025a;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.common.p011d.ImmutableList;
import com.facebook.common.p011d.Objects;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p011d.Supplier;
import com.facebook.common.p014e.FLog;
import com.facebook.common.p017h.CloseableReference;
import com.facebook.drawee.p026b.DeferredReleaser;
import com.facebook.drawee.p029c.AbstractDraweeController;
import com.facebook.drawee.p030d.OrientedDrawable;
import com.facebook.imagepipeline.p038a.p039a.AnimatedDrawableFactory;
import com.facebook.imagepipeline.p041c.MemoryCache;
import com.facebook.imagepipeline.p047h.CloseableImage;
import com.facebook.imagepipeline.p047h.CloseableStaticBitmap;
import com.facebook.imagepipeline.p047h.ImageInfo;
import com.facebook.p007c.p008a.CacheKey;
import com.facebook.p023d.DataSource;
import java.util.Iterator;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* renamed from: com.facebook.drawee.a.a.c */
public class PipelineDraweeController extends AbstractDraweeController<CloseableReference<CloseableImage>, ImageInfo> {
    private static final Class<?> f1235f;
    private final Resources f1236g;
    private final AnimatedDrawableFactory f1237h;
    @Nullable
    private final ImmutableList<DrawableFactory> f1238i;
    @Nullable
    private MemoryCache<CacheKey, CloseableImage> f1239j;
    private CacheKey f1240k;
    private Supplier<DataSource<CloseableReference<CloseableImage>>> f1241l;
    private final DrawableFactory f1242m;

    /* renamed from: com.facebook.drawee.a.a.c.1 */
    class PipelineDraweeController implements DrawableFactory {
        final /* synthetic */ PipelineDraweeController f1213a;

        PipelineDraweeController(PipelineDraweeController pipelineDraweeController) {
            this.f1213a = pipelineDraweeController;
        }

        public final Drawable m1214a(CloseableImage closeableImage) {
            if (closeableImage instanceof CloseableStaticBitmap) {
                CloseableStaticBitmap closeableStaticBitmap = (CloseableStaticBitmap) closeableImage;
                Drawable bitmapDrawable = new BitmapDrawable(this.f1213a.f1236g, closeableStaticBitmap.f2138a);
                if (closeableStaticBitmap.f2139b == 0 || closeableStaticBitmap.f2139b == -1) {
                    return bitmapDrawable;
                }
                return new OrientedDrawable(bitmapDrawable, closeableStaticBitmap.f2139b);
            } else if (this.f1213a.f1237h != null) {
                return this.f1213a.f1237h.m1857a();
            } else {
                return null;
            }
        }
    }

    protected final /* synthetic */ void m1253a(@Nullable Object obj) {
        CloseableReference.m1097c((CloseableReference) obj);
    }

    protected final /* synthetic */ int m1254b(@Nullable Object obj) {
        CloseableReference closeableReference = (CloseableReference) obj;
        return closeableReference != null ? closeableReference.m1102d() : 0;
    }

    protected final /* synthetic */ Object m1255b() {
        if (this.f1239j == null || this.f1240k == null) {
            return null;
        }
        CloseableReference a = this.f1239j.m1891a(this.f1240k);
        if (a == null || ((CloseableImage) a.m1099a()).m2019d().m2038c()) {
            return a;
        }
        a.close();
        return null;
    }

    protected final /* synthetic */ Object m1256c(Object obj) {
        CloseableReference closeableReference = (CloseableReference) obj;
        Preconditions.m1035b(CloseableReference.m1095a(closeableReference));
        return (ImageInfo) closeableReference.m1099a();
    }

    protected final /* synthetic */ Drawable m1257d(Object obj) {
        Drawable a;
        CloseableReference closeableReference = (CloseableReference) obj;
        Preconditions.m1035b(CloseableReference.m1095a(closeableReference));
        CloseableImage closeableImage = (CloseableImage) closeableReference.m1099a();
        if (this.f1238i != null) {
            Iterator it = this.f1238i.iterator();
            while (it.hasNext()) {
                a = ((DrawableFactory) it.next()).m1210a(closeableImage);
                if (a != null) {
                    return a;
                }
            }
        }
        a = this.f1242m.m1210a(closeableImage);
        if (a != null) {
            return a;
        }
        throw new UnsupportedOperationException("Unrecognized image class: " + closeableImage);
    }

    static {
        f1235f = PipelineDraweeController.class;
    }

    public PipelineDraweeController(Resources resources, DeferredReleaser deferredReleaser, AnimatedDrawableFactory animatedDrawableFactory, Executor executor, MemoryCache<CacheKey, CloseableImage> memoryCache, Supplier<DataSource<CloseableReference<CloseableImage>>> supplier, String str, CacheKey cacheKey, Object obj, @Nullable ImmutableList<DrawableFactory> immutableList) {
        super(deferredReleaser, executor, str, obj);
        this.f1242m = new PipelineDraweeController(this);
        this.f1236g = resources;
        this.f1237h = animatedDrawableFactory;
        this.f1239j = memoryCache;
        this.f1240k = cacheKey;
        this.f1238i = immutableList;
        this.f1241l = supplier;
    }

    protected final DataSource<CloseableReference<CloseableImage>> m1251a() {
        if (FLog.m1051a(2)) {
            FLog.m1041a(f1235f, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
        }
        return (DataSource) this.f1241l.m963a();
    }

    public String toString() {
        return Objects.m1028a(this).m1026a("super", super.toString()).m1026a("dataSourceSupplier", this.f1241l).toString();
    }

    public final void m1252a(Supplier<DataSource<CloseableReference<CloseableImage>>> supplier, String str, CacheKey cacheKey, Object obj) {
        super.m1238a(str, obj, false);
        this.f1241l = supplier;
        this.f1240k = cacheKey;
    }
}
