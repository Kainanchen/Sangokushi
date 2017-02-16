package com.facebook.imagepipeline.nativecode;

import com.facebook.common.p018i.SoLoaderShim;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.imagepipeline.nativecode.a */
public final class ImagePipelineNativeLoader {
    public static final List<String> f2507a;

    static {
        f2507a = Collections.unmodifiableList(new ArrayList());
    }

    public static void m2433a() {
        SoLoaderShim.m1111a("imagepipeline");
    }
}
