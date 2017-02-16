package com.facebook.p034f;

import javax.annotation.Nullable;

/* renamed from: com.facebook.f.c */
public final class ImageFormat {
    public static final ImageFormat f1518a;
    private final String f1519b;
    private final String f1520c;

    /* renamed from: com.facebook.f.c.a */
    public interface ImageFormat {
        @Nullable
        ImageFormat m1451a(byte[] bArr, int i);
    }

    static {
        f1518a = new ImageFormat("UNKNOWN", null);
    }

    public ImageFormat(String str, @Nullable String str2) {
        this.f1520c = str;
        this.f1519b = str2;
    }

    public final String toString() {
        return this.f1520c;
    }
}
