package com.facebook.imagepipeline.p047h;

import com.facebook.common.p014e.FLog;
import java.io.Closeable;

/* renamed from: com.facebook.imagepipeline.h.b */
public abstract class CloseableImage implements ImageInfo, Closeable {
    public abstract int m2017b();

    public abstract boolean m2018c();

    public abstract void close();

    public QualityInfo m2019d() {
        return ImmutableQualityInfo.f2150a;
    }

    protected void finalize() {
        if (!m2018c()) {
            FLog.m1057b("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }
}
