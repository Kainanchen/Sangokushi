package com.facebook.p036h;

import android.content.Context;
import android.net.Uri;

/* renamed from: com.facebook.h.s */
public final class ImageRequest {
    Context f1741a;
    Uri f1742b;
    ImageRequest f1743c;
    boolean f1744d;
    Object f1745e;

    /* renamed from: com.facebook.h.s.a */
    public static class ImageRequest {
        Context f1736a;
        Uri f1737b;
        public ImageRequest f1738c;
        boolean f1739d;
        Object f1740e;

        public ImageRequest(Context context, Uri uri) {
            ag.m1544a((Object) uri, "imageUri");
            this.f1736a = context;
            this.f1737b = uri;
        }
    }

    /* renamed from: com.facebook.h.s.b */
    public interface ImageRequest {
        void m1675a(ImageResponse imageResponse);
    }

    private ImageRequest(ImageRequest imageRequest) {
        Object obj;
        this.f1741a = imageRequest.f1736a;
        this.f1742b = imageRequest.f1737b;
        this.f1743c = imageRequest.f1738c;
        this.f1744d = imageRequest.f1739d;
        if (imageRequest.f1740e == null) {
            obj = new Object();
        } else {
            obj = imageRequest.f1740e;
        }
        this.f1745e = obj;
    }
}
