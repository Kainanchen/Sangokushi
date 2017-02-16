package com.facebook.imagepipeline.p050l;

import android.net.Uri;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p021l.UriUtil;
import com.facebook.imagepipeline.p042d.ImageDecodeOptions;
import com.facebook.imagepipeline.p042d.Priority;
import com.facebook.imagepipeline.p042d.ResizeOptions;
import com.facebook.imagepipeline.p042d.RotationOptions;
import com.facebook.imagepipeline.p043e.ImagePipelineConfig;
import com.facebook.imagepipeline.p048i.RequestListener;
import com.facebook.imagepipeline.p050l.ImageRequest.ImageRequest;
import javax.annotation.Nullable;

/* renamed from: com.facebook.imagepipeline.l.b */
public final class ImageRequestBuilder {
    Uri f2413a;
    ImageRequest f2414b;
    @Nullable
    ResizeOptions f2415c;
    @Nullable
    public RotationOptions f2416d;
    ImageDecodeOptions f2417e;
    ImageRequest f2418f;
    boolean f2419g;
    boolean f2420h;
    int f2421i;
    @Nullable
    Postprocessor f2422j;
    boolean f2423k;
    @Nullable
    RequestListener f2424l;

    /* renamed from: com.facebook.imagepipeline.l.b.a */
    public static class ImageRequestBuilder extends RuntimeException {
        public ImageRequestBuilder(String str) {
            super("Invalid request builder: " + str);
        }
    }

    public static ImageRequestBuilder m2330a(Uri uri) {
        ImageRequestBuilder imageRequestBuilder = new ImageRequestBuilder();
        Preconditions.m1030a((Object) uri);
        imageRequestBuilder.f2413a = uri;
        return imageRequestBuilder;
    }

    private ImageRequestBuilder() {
        this.f2413a = null;
        this.f2414b = ImageRequest.FULL_FETCH;
        this.f2415c = null;
        this.f2416d = null;
        this.f2417e = ImageDecodeOptions.m1927a();
        this.f2418f = ImageRequest.DEFAULT;
        this.f2419g = ImagePipelineConfig.m1948a().f2027a;
        this.f2420h = false;
        this.f2421i = Priority.f1979c;
        this.f2422j = null;
        this.f2423k = true;
    }

    public final ImageRequest m2331a() {
        if (this.f2413a == null) {
            throw new ImageRequestBuilder("Source must be set!");
        }
        if (UriUtil.m1128g(this.f2413a)) {
            if (!this.f2413a.isAbsolute()) {
                throw new ImageRequestBuilder("Resource URI path must be absolute.");
            } else if (this.f2413a.getPath().isEmpty()) {
                throw new ImageRequestBuilder("Resource URI must not be empty");
            } else {
                try {
                    Integer.parseInt(this.f2413a.getPath().substring(1));
                } catch (NumberFormatException e) {
                    throw new ImageRequestBuilder("Resource URI path must be a resource id.");
                }
            }
        }
        if (!UriUtil.m1127f(this.f2413a) || this.f2413a.isAbsolute()) {
            return new ImageRequest(this);
        }
        throw new ImageRequestBuilder("Asset URI path must be absolute.");
    }
}
