package com.facebook.imagepipeline.p043e;

import com.facebook.common.p022m.WebpBitmapFactory.WebpBitmapFactory;
import com.facebook.common.p022m.WebpSupportStatus;
import com.facebook.imagepipeline.p043e.ImagePipelineConfig.ImagePipelineConfig;

/* renamed from: com.facebook.imagepipeline.e.i */
public final class ImagePipelineExperiments {
    final int f2060a;
    final boolean f2061b;
    final int f2062c;
    boolean f2063d;
    final int f2064e;
    final boolean f2065f;
    final WebpBitmapFactory f2066g;

    /* renamed from: com.facebook.imagepipeline.e.i.a */
    public static class ImagePipelineExperiments {
        final ImagePipelineConfig f2052a;
        int f2053b;
        boolean f2054c;
        int f2055d;
        boolean f2056e;
        boolean f2057f;
        int f2058g;
        WebpBitmapFactory f2059h;

        public ImagePipelineExperiments(ImagePipelineConfig imagePipelineConfig) {
            this.f2053b = 0;
            this.f2054c = false;
            this.f2056e = false;
            this.f2057f = false;
            this.f2058g = 5;
            this.f2052a = imagePipelineConfig;
        }
    }

    private ImagePipelineExperiments(ImagePipelineExperiments imagePipelineExperiments, ImagePipelineConfig imagePipelineConfig) {
        boolean z;
        boolean z2 = true;
        this.f2060a = imagePipelineExperiments.f2053b;
        if (imagePipelineExperiments.f2054c && WebpSupportStatus.f1162e) {
            z = true;
        } else {
            z = false;
        }
        this.f2061b = z;
        if (!(imagePipelineConfig.f2009f && imagePipelineExperiments.f2056e)) {
            z2 = false;
        }
        this.f2063d = z2;
        this.f2064e = imagePipelineExperiments.f2058g;
        this.f2065f = imagePipelineExperiments.f2057f;
        this.f2066g = imagePipelineExperiments.f2059h;
        this.f2062c = imagePipelineExperiments.f2055d;
    }
}
