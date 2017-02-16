package com.facebook.drawee.p024a.p025a;

import android.content.Context;
import com.facebook.common.p011d.Supplier;
import com.facebook.common.p014e.FLog;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.p043e.ImagePipeline;
import com.facebook.imagepipeline.p043e.ImagePipelineFactory;

/* renamed from: com.facebook.drawee.a.a.b */
public class Fresco {
    private static final Class<?> f1210a;
    private static PipelineDraweeControllerBuilderSupplier f1211b;
    private static volatile boolean f1212c;

    static {
        f1210a = Fresco.class;
        f1212c = false;
    }

    private Fresco() {
    }

    public static PipelineDraweeControllerBuilder m1211a() {
        return f1211b.m1282b();
    }

    public static void m1212a(Context context) {
        if (f1212c) {
            FLog.m1058c(f1210a, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
        } else {
            f1212c = true;
        }
        Context applicationContext = context.getApplicationContext();
        ImagePipelineFactory.m1950a(applicationContext);
        Supplier pipelineDraweeControllerBuilderSupplier = new PipelineDraweeControllerBuilderSupplier(applicationContext);
        f1211b = pipelineDraweeControllerBuilderSupplier;
        SimpleDraweeView.m1432a(pipelineDraweeControllerBuilderSupplier);
    }

    public static ImagePipeline m1213b() {
        return ImagePipelineFactory.m1949a().m1959d();
    }
}
