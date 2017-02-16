package com.facebook.imagepipeline.nativecode;

/* renamed from: com.facebook.imagepipeline.nativecode.c */
public final class WebpTranscoderFactory {
    public static boolean f2508a;
    private static WebpTranscoder f2509b;

    static {
        f2508a = false;
        try {
            f2509b = (WebpTranscoder) Class.forName("com.facebook.imagepipeline.nativecode.WebpTranscoderImpl").newInstance();
            f2508a = true;
        } catch (Throwable th) {
            f2508a = false;
        }
    }

    public static WebpTranscoder m2435a() {
        return f2509b;
    }
}
