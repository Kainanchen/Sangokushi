package com.facebook.imagepipeline.p044k;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import com.facebook.imagepipeline.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.p047h.EncodedImage;
import com.facebook.imagepipeline.p050l.ImageRequest;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.k.t */
public final class LocalAssetFetchProducer extends LocalFetchProducer {
    private final AssetManager f2368a;

    public LocalAssetFetchProducer(Executor executor, PooledByteBufferFactory pooledByteBufferFactory, AssetManager assetManager, boolean z) {
        super(executor, pooledByteBufferFactory, z);
        this.f2368a = assetManager;
    }

    protected final EncodedImage m2297a(ImageRequest imageRequest) {
        return m2247b(this.f2368a.open(LocalAssetFetchProducer.m2296c(imageRequest), 2), m2295b(imageRequest));
    }

    private int m2295b(ImageRequest imageRequest) {
        AssetFileDescriptor openFd;
        Throwable th;
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            openFd = this.f2368a.openFd(LocalAssetFetchProducer.m2296c(imageRequest));
            try {
                int length = (int) openFd.getLength();
                if (openFd == null) {
                    return length;
                }
                try {
                    openFd.close();
                    return length;
                } catch (IOException e) {
                    return length;
                }
            } catch (IOException e2) {
                assetFileDescriptor = openFd;
                if (assetFileDescriptor != null) {
                    try {
                        assetFileDescriptor.close();
                    } catch (IOException e3) {
                    }
                }
                return -1;
            } catch (Throwable th2) {
                th = th2;
                if (openFd != null) {
                    try {
                        openFd.close();
                    } catch (IOException e4) {
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
            if (assetFileDescriptor != null) {
                assetFileDescriptor.close();
            }
            return -1;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            openFd = null;
            th = th4;
            if (openFd != null) {
                openFd.close();
            }
            throw th;
        }
    }

    protected final String m2298a() {
        return "LocalAssetFetchProducer";
    }

    private static String m2296c(ImageRequest imageRequest) {
        return imageRequest.f2401b.getPath().substring(1);
    }
}
