package com.facebook.imagepipeline.p050l;

import android.net.Uri;
import com.facebook.common.p011d.Objects;
import com.facebook.common.p021l.UriUtil;
import com.facebook.imagepipeline.p042d.ImageDecodeOptions;
import com.facebook.imagepipeline.p042d.ResizeOptions;
import com.facebook.imagepipeline.p042d.RotationOptions;
import com.facebook.imagepipeline.p048i.RequestListener;
import java.io.File;
import java.util.Arrays;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
/* renamed from: com.facebook.imagepipeline.l.a */
public final class ImageRequest {
    public final ImageRequest f2400a;
    public final Uri f2401b;
    public final boolean f2402c;
    public final boolean f2403d;
    public final ImageDecodeOptions f2404e;
    @Nullable
    public final ResizeOptions f2405f;
    public final RotationOptions f2406g;
    public final int f2407h;
    public final ImageRequest f2408i;
    public final boolean f2409j;
    public final Postprocessor f2410k;
    @Nullable
    public final RequestListener f2411l;
    private File f2412m;

    /* renamed from: com.facebook.imagepipeline.l.a.a */
    public enum ImageRequest {
        SMALL,
        DEFAULT
    }

    /* renamed from: com.facebook.imagepipeline.l.a.b */
    public enum ImageRequest {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);
        
        public int f2399e;

        private ImageRequest(int i) {
            this.f2399e = i;
        }

        public static ImageRequest m2326a(ImageRequest imageRequest, ImageRequest imageRequest2) {
            return imageRequest.f2399e > imageRequest2.f2399e ? imageRequest : imageRequest2;
        }
    }

    public static ImageRequest m2327a(@Nullable Uri uri) {
        return uri == null ? null : ImageRequestBuilder.m2330a(uri).m2331a();
    }

    public static ImageRequest m2328a(@Nullable String str) {
        return (str == null || str.length() == 0) ? null : ImageRequest.m2327a(Uri.parse(str));
    }

    protected ImageRequest(ImageRequestBuilder imageRequestBuilder) {
        RotationOptions rotationOptions;
        boolean z;
        this.f2400a = imageRequestBuilder.f2418f;
        this.f2401b = imageRequestBuilder.f2413a;
        this.f2402c = imageRequestBuilder.f2419g;
        this.f2403d = imageRequestBuilder.f2420h;
        this.f2404e = imageRequestBuilder.f2417e;
        this.f2405f = imageRequestBuilder.f2415c;
        if (imageRequestBuilder.f2416d == null) {
            rotationOptions = new RotationOptions(false);
        } else {
            rotationOptions = imageRequestBuilder.f2416d;
        }
        this.f2406g = rotationOptions;
        this.f2407h = imageRequestBuilder.f2421i;
        this.f2408i = imageRequestBuilder.f2414b;
        if (imageRequestBuilder.f2423k && UriUtil.m1122a(imageRequestBuilder.f2413a)) {
            z = true;
        } else {
            z = false;
        }
        this.f2409j = z;
        this.f2410k = imageRequestBuilder.f2422j;
        this.f2411l = imageRequestBuilder.f2424l;
    }

    public final synchronized File m2329a() {
        if (this.f2412m == null) {
            this.f2412m = new File(this.f2401b.getPath());
        }
        return this.f2412m;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ImageRequest)) {
            return false;
        }
        ImageRequest imageRequest = (ImageRequest) obj;
        if (Objects.m1029a(this.f2401b, imageRequest.f2401b) && Objects.m1029a(this.f2400a, imageRequest.f2400a) && Objects.m1029a(this.f2412m, imageRequest.f2412m)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2400a, this.f2401b, this.f2412m});
    }
}
