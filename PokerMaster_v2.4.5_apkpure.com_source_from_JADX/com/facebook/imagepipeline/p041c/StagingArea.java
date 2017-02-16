package com.facebook.imagepipeline.p041c;

import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p014e.FLog;
import com.facebook.common.p017h.CloseableReference;
import com.facebook.imagepipeline.p047h.EncodedImage;
import com.facebook.p007c.p008a.CacheKey;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.facebook.imagepipeline.c.u */
public class StagingArea {
    private static final Class<?> f1964a;
    @GuardedBy("this")
    private Map<CacheKey, EncodedImage> f1965b;

    static {
        f1964a = StagingArea.class;
    }

    private StagingArea() {
        this.f1965b = new HashMap();
    }

    public static StagingArea m1921a() {
        return new StagingArea();
    }

    public final synchronized void m1924a(CacheKey cacheKey, EncodedImage encodedImage) {
        Preconditions.m1030a((Object) cacheKey);
        Preconditions.m1033a(EncodedImage.m2031e(encodedImage));
        EncodedImage.m2029d((EncodedImage) this.f1965b.put(cacheKey, EncodedImage.m2026a(encodedImage)));
        m1922b();
    }

    public final synchronized boolean m1926b(CacheKey cacheKey, EncodedImage encodedImage) {
        boolean z;
        Preconditions.m1030a((Object) cacheKey);
        Preconditions.m1030a((Object) encodedImage);
        Preconditions.m1033a(EncodedImage.m2031e(encodedImage));
        EncodedImage encodedImage2 = (EncodedImage) this.f1965b.get(cacheKey);
        if (encodedImage2 == null) {
            z = false;
        } else {
            CloseableReference b = CloseableReference.m1096b(encodedImage2.f2142a);
            CloseableReference b2 = CloseableReference.m1096b(encodedImage.f2142a);
            if (!(b == null || b2 == null)) {
                try {
                    if (b.m1099a() == b2.m1099a()) {
                        this.f1965b.remove(cacheKey);
                        m1922b();
                        z = true;
                    }
                } finally {
                    CloseableReference.m1097c(b2);
                    CloseableReference.m1097c(b);
                    EncodedImage.m2029d(encodedImage2);
                }
            }
            CloseableReference.m1097c(b2);
            CloseableReference.m1097c(b);
            EncodedImage.m2029d(encodedImage2);
            z = false;
        }
        return z;
    }

    public final synchronized EncodedImage m1923a(CacheKey cacheKey) {
        EncodedImage encodedImage;
        Preconditions.m1030a((Object) cacheKey);
        encodedImage = (EncodedImage) this.f1965b.get(cacheKey);
        if (encodedImage != null) {
            synchronized (encodedImage) {
                if (EncodedImage.m2031e(encodedImage)) {
                    EncodedImage a = EncodedImage.m2026a(encodedImage);
                    encodedImage = a;
                } else {
                    this.f1965b.remove(cacheKey);
                    FLog.m1055b(f1964a, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(encodedImage)), cacheKey.toString(), Integer.valueOf(System.identityHashCode(cacheKey)));
                    encodedImage = null;
                }
            }
        }
        return encodedImage;
    }

    public final synchronized boolean m1925b(CacheKey cacheKey) {
        boolean z;
        Preconditions.m1030a((Object) cacheKey);
        if (this.f1965b.containsKey(cacheKey)) {
            EncodedImage encodedImage = (EncodedImage) this.f1965b.get(cacheKey);
            synchronized (encodedImage) {
                if (EncodedImage.m2031e(encodedImage)) {
                    z = true;
                } else {
                    this.f1965b.remove(cacheKey);
                    FLog.m1055b(f1964a, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(encodedImage)), cacheKey.toString(), Integer.valueOf(System.identityHashCode(cacheKey)));
                    z = false;
                }
            }
        } else {
            z = false;
        }
        return z;
    }

    private synchronized void m1922b() {
        FLog.m1041a(f1964a, "Count = %d", Integer.valueOf(this.f1965b.size()));
    }
}
