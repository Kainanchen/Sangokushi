package com.facebook.imagepipeline.p044k;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import com.facebook.imagepipeline.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.p047h.EncodedImage;
import com.facebook.imagepipeline.p050l.ImageRequest;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.k.z */
public final class LocalResourceFetchProducer extends LocalFetchProducer {
    private final Resources f2390a;

    public LocalResourceFetchProducer(Executor executor, PooledByteBufferFactory pooledByteBufferFactory, Resources resources, boolean z) {
        super(executor, pooledByteBufferFactory, z);
        this.f2390a = resources;
    }

    protected final EncodedImage m2324a(ImageRequest imageRequest) {
        return m2247b(this.f2390a.openRawResource(LocalResourceFetchProducer.m2323c(imageRequest)), m2322b(imageRequest));
    }

    private int m2322b(ImageRequest imageRequest) {
        Throwable th;
        AssetFileDescriptor assetFileDescriptor = null;
        AssetFileDescriptor openRawResourceFd;
        try {
            openRawResourceFd = this.f2390a.openRawResourceFd(LocalResourceFetchProducer.m2323c(imageRequest));
            try {
                int length = (int) openRawResourceFd.getLength();
                if (openRawResourceFd == null) {
                    return length;
                }
                try {
                    openRawResourceFd.close();
                    return length;
                } catch (IOException e) {
                    return length;
                }
            } catch (NotFoundException e2) {
                assetFileDescriptor = openRawResourceFd;
                if (assetFileDescriptor != null) {
                    try {
                        assetFileDescriptor.close();
                    } catch (IOException e3) {
                    }
                }
                return -1;
            } catch (Throwable th2) {
                th = th2;
                if (openRawResourceFd != null) {
                    try {
                        openRawResourceFd.close();
                    } catch (IOException e4) {
                    }
                }
                throw th;
            }
        } catch (NotFoundException e5) {
            if (assetFileDescriptor != null) {
                assetFileDescriptor.close();
            }
            return -1;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            openRawResourceFd = null;
            th = th4;
            if (openRawResourceFd != null) {
                openRawResourceFd.close();
            }
            throw th;
        }
    }

    protected final String m2325a() {
        return "LocalResourceFetchProducer";
    }

    private static int m2323c(ImageRequest imageRequest) {
        return Integer.parseInt(imageRequest.f2401b.getPath().substring(1));
    }
}
