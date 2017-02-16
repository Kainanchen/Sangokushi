package com.facebook.p036h;

import android.net.Uri;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.LoggingBehavior;
import com.facebook.p036h.FileLruCache.FileLruCache;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* renamed from: com.facebook.h.u */
class ImageResponseCache {
    static final String f1751a;
    private static volatile FileLruCache f1752b;

    /* renamed from: com.facebook.h.u.a */
    private static class ImageResponseCache extends BufferedInputStream {
        HttpURLConnection f1750a;

        ImageResponseCache(InputStream inputStream, HttpURLConnection httpURLConnection) {
            super(inputStream, AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD);
            this.f1750a = httpURLConnection;
        }

        public final void close() {
            super.close();
            af.m1517a(this.f1750a);
        }
    }

    ImageResponseCache() {
    }

    static {
        f1751a = ImageResponseCache.class.getSimpleName();
    }

    private static synchronized FileLruCache m1676a() {
        FileLruCache fileLruCache;
        synchronized (ImageResponseCache.class) {
            if (f1752b == null) {
                f1752b = new FileLruCache(f1751a, new FileLruCache());
            }
            fileLruCache = f1752b;
        }
        return fileLruCache;
    }

    static InputStream m1677a(Uri uri) {
        InputStream inputStream = null;
        if (uri != null && ImageResponseCache.m1679b(uri)) {
            try {
                inputStream = ImageResponseCache.m1676a().m1665a(uri.toString(), null);
            } catch (IOException e) {
                Logger.m1681a(LoggingBehavior.CACHE, 5, f1751a, e.toString());
            }
        }
        return inputStream;
    }

    static InputStream m1678a(HttpURLConnection httpURLConnection) {
        if (httpURLConnection.getResponseCode() != 200) {
            return null;
        }
        Uri parse = Uri.parse(httpURLConnection.getURL().toString());
        InputStream inputStream = httpURLConnection.getInputStream();
        try {
            if (ImageResponseCache.m1679b(parse)) {
                return new FileLruCache(new ImageResponseCache(inputStream, httpURLConnection), ImageResponseCache.m1676a().m1666b(parse.toString(), null));
            }
        } catch (IOException e) {
        }
        return inputStream;
    }

    private static boolean m1679b(Uri uri) {
        if (uri != null) {
            String host = uri.getHost();
            if (host.endsWith("fbcdn.net")) {
                return true;
            }
            if (host.startsWith("fbcdn") && host.endsWith("akamaihd.net")) {
                return true;
            }
        }
        return false;
    }
}
