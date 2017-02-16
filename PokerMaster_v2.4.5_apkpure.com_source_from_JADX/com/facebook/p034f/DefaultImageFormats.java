package com.facebook.p034f;

/* renamed from: com.facebook.f.a */
public final class DefaultImageFormats {
    public static final ImageFormat f1506a;
    public static final ImageFormat f1507b;
    public static final ImageFormat f1508c;
    public static final ImageFormat f1509d;
    public static final ImageFormat f1510e;
    public static final ImageFormat f1511f;
    public static final ImageFormat f1512g;
    public static final ImageFormat f1513h;
    public static final ImageFormat f1514i;

    static {
        f1506a = new ImageFormat("JPEG", "jpeg");
        f1507b = new ImageFormat("PNG", "png");
        f1508c = new ImageFormat("GIF", "gif");
        f1509d = new ImageFormat("BMP", "bmp");
        f1510e = new ImageFormat("WEBP_SIMPLE", "webp");
        f1511f = new ImageFormat("WEBP_LOSSLESS", "webp");
        f1512g = new ImageFormat("WEBP_EXTENDED", "webp");
        f1513h = new ImageFormat("WEBP_EXTENDED_WITH_ALPHA", "webp");
        f1514i = new ImageFormat("WEBP_ANIMATED", "webp");
    }

    public static boolean m1447a(ImageFormat imageFormat) {
        return DefaultImageFormats.m1448b(imageFormat) || imageFormat == f1514i;
    }

    public static boolean m1448b(ImageFormat imageFormat) {
        return imageFormat == f1510e || imageFormat == f1511f || imageFormat == f1512g || imageFormat == f1513h;
    }
}
