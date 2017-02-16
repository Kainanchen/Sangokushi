package com.facebook.drawee.p024a.p025a;

import android.content.Context;
import android.net.Uri;
import com.facebook.common.p017h.CloseableReference;
import com.facebook.drawee.p028g.DraweeController;
import com.facebook.drawee.p028g.SimpleDraweeControllerBuilder;
import com.facebook.drawee.p029c.AbstractDraweeController;
import com.facebook.drawee.p029c.AbstractDraweeControllerBuilder;
import com.facebook.drawee.p029c.ControllerListener;
import com.facebook.imagepipeline.p041c.CacheKeyFactory;
import com.facebook.imagepipeline.p042d.RotationOptions;
import com.facebook.imagepipeline.p043e.ImagePipeline;
import com.facebook.imagepipeline.p047h.CloseableImage;
import com.facebook.imagepipeline.p047h.ImageInfo;
import com.facebook.imagepipeline.p050l.ImageRequest;
import com.facebook.imagepipeline.p050l.ImageRequestBuilder;
import com.facebook.p007c.p008a.CacheKey;
import com.facebook.p023d.DataSource;
import java.util.Set;
import javax.annotation.Nullable;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: com.facebook.drawee.a.a.d */
public final class PipelineDraweeControllerBuilder extends AbstractDraweeControllerBuilder<PipelineDraweeControllerBuilder, ImageRequest, CloseableReference<CloseableImage>, ImageInfo> {
    private final ImagePipeline f1262d;
    private final PipelineDraweeControllerFactory f1263e;

    /* renamed from: com.facebook.drawee.a.a.d.1 */
    static /* synthetic */ class PipelineDraweeControllerBuilder {
        static final /* synthetic */ int[] f1243a;

        static {
            f1243a = new int[AbstractDraweeControllerBuilder.AbstractDraweeControllerBuilder.values().length];
            try {
                f1243a[AbstractDraweeControllerBuilder.AbstractDraweeControllerBuilder.FULL_FETCH.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f1243a[AbstractDraweeControllerBuilder.AbstractDraweeControllerBuilder.DISK_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f1243a[AbstractDraweeControllerBuilder.AbstractDraweeControllerBuilder.BITMAP_MEMORY_CACHE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    protected final /* synthetic */ DataSource m1277a(Object obj, Object obj2, AbstractDraweeControllerBuilder.AbstractDraweeControllerBuilder abstractDraweeControllerBuilder) {
        ImageRequest.ImageRequest imageRequest;
        ImageRequest imageRequest2 = (ImageRequest) obj;
        ImagePipeline imagePipeline = this.f1262d;
        switch (PipelineDraweeControllerBuilder.f1243a[abstractDraweeControllerBuilder.ordinal()]) {
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                imageRequest = ImageRequest.ImageRequest.FULL_FETCH;
                break;
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                imageRequest = ImageRequest.ImageRequest.DISK_CACHE;
                break;
            case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                imageRequest = ImageRequest.ImageRequest.BITMAP_MEMORY_CACHE;
                break;
            default:
                throw new RuntimeException("Cache level" + abstractDraweeControllerBuilder + "is not supported. ");
        }
        return imagePipeline.m1945a(imageRequest2, obj2, imageRequest);
    }

    protected final /* bridge */ /* synthetic */ AbstractDraweeControllerBuilder m1278a() {
        return this;
    }

    public PipelineDraweeControllerBuilder(Context context, PipelineDraweeControllerFactory pipelineDraweeControllerFactory, ImagePipeline imagePipeline, Set<ControllerListener> set) {
        super(context, set);
        this.f1262d = imagePipeline;
        this.f1263e = pipelineDraweeControllerFactory;
    }

    private CacheKey m1276h() {
        ImageRequest imageRequest = (ImageRequest) this.f1248b;
        CacheKeyFactory cacheKeyFactory = this.f1262d.f1994b;
        if (cacheKeyFactory == null || imageRequest == null) {
            return null;
        }
        if (imageRequest.f2410k != null) {
            return cacheKeyFactory.m1881b(imageRequest, this.f1247a);
        }
        return cacheKeyFactory.m1880a(imageRequest, this.f1247a);
    }

    protected final /* synthetic */ AbstractDraweeController m1280b() {
        DraweeController draweeController = this.f1249c;
        if (draweeController instanceof PipelineDraweeController) {
            PipelineDraweeController pipelineDraweeController = (PipelineDraweeController) draweeController;
            pipelineDraweeController.m1252a(m1273e(), AbstractDraweeControllerBuilder.m1264d(), m1276h(), this.f1247a);
            return pipelineDraweeController;
        }
        PipelineDraweeControllerFactory pipelineDraweeControllerFactory = this.f1263e;
        return new PipelineDraweeController(pipelineDraweeControllerFactory.f1268a, pipelineDraweeControllerFactory.f1269b, pipelineDraweeControllerFactory.f1270c, pipelineDraweeControllerFactory.f1271d, pipelineDraweeControllerFactory.f1272e, m1273e(), AbstractDraweeControllerBuilder.m1264d(), m1276h(), this.f1247a, pipelineDraweeControllerFactory.f1273f);
    }

    public final /* synthetic */ SimpleDraweeControllerBuilder m1279a(@Nullable Uri uri) {
        if (uri == null) {
            return (PipelineDraweeControllerBuilder) super.m1268a(null);
        }
        ImageRequestBuilder a = ImageRequestBuilder.m2330a(uri);
        a.f2416d = new RotationOptions(true);
        return (PipelineDraweeControllerBuilder) super.m1268a(a.m2331a());
    }
}
