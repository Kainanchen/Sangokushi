package com.facebook.drawee.p024a.p025a;

import android.content.Context;
import com.facebook.common.p011d.Supplier;
import com.facebook.common.p013b.UiThreadImmediateExecutorService;
import com.facebook.drawee.p026b.DeferredReleaser;
import com.facebook.drawee.p029c.ControllerListener;
import com.facebook.imagepipeline.p038a.p039a.AnimatedDrawableFactory;
import com.facebook.imagepipeline.p038a.p039a.AnimatedFactory;
import com.facebook.imagepipeline.p043e.ImagePipeline;
import com.facebook.imagepipeline.p043e.ImagePipelineFactory;
import java.util.Set;

/* renamed from: com.facebook.drawee.a.a.e */
public final class PipelineDraweeControllerBuilderSupplier implements Supplier<PipelineDraweeControllerBuilder> {
    private final Context f1264a;
    private final ImagePipeline f1265b;
    private final PipelineDraweeControllerFactory f1266c;
    private final Set<ControllerListener> f1267d;

    public final /* synthetic */ Object m1281a() {
        return m1282b();
    }

    public PipelineDraweeControllerBuilderSupplier(Context context) {
        this(context, ImagePipelineFactory.m1949a());
    }

    private PipelineDraweeControllerBuilderSupplier(Context context, ImagePipelineFactory imagePipelineFactory) {
        this(context, imagePipelineFactory, (byte) 0);
    }

    private PipelineDraweeControllerBuilderSupplier(Context context, ImagePipelineFactory imagePipelineFactory, byte b) {
        AnimatedDrawableFactory a;
        this.f1264a = context;
        this.f1265b = imagePipelineFactory.m1959d();
        AnimatedFactory b2 = imagePipelineFactory.m1957b();
        if (b2 != null) {
            a = b2.m1858a();
        } else {
            a = null;
        }
        this.f1266c = new PipelineDraweeControllerFactory(context.getResources(), DeferredReleaser.m1283a(), a, UiThreadImmediateExecutorService.m1015a(), this.f1265b.f1993a, null);
        this.f1267d = null;
    }

    public final PipelineDraweeControllerBuilder m1282b() {
        return new PipelineDraweeControllerBuilder(this.f1264a, this.f1266c, this.f1265b, this.f1267d);
    }
}
