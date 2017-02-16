package com.facebook.p036h;

import android.graphics.Bitmap;

/* renamed from: com.facebook.h.t */
public final class ImageResponse {
    public Bitmap f1746a;
    private ImageRequest f1747b;
    private Exception f1748c;
    private boolean f1749d;

    ImageResponse(ImageRequest imageRequest, Exception exception, boolean z, Bitmap bitmap) {
        this.f1747b = imageRequest;
        this.f1748c = exception;
        this.f1746a = bitmap;
        this.f1749d = z;
    }
}
