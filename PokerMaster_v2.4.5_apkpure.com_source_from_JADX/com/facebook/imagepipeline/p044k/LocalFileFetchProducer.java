package com.facebook.imagepipeline.p044k;

import com.facebook.imagepipeline.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.p047h.EncodedImage;
import com.facebook.imagepipeline.p050l.ImageRequest;
import java.io.FileInputStream;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.k.y */
public final class LocalFileFetchProducer extends LocalFetchProducer {
    public LocalFileFetchProducer(Executor executor, PooledByteBufferFactory pooledByteBufferFactory, boolean z) {
        super(executor, pooledByteBufferFactory, z);
    }

    protected final EncodedImage m2320a(ImageRequest imageRequest) {
        return m2247b(new FileInputStream(imageRequest.m2329a().toString()), (int) imageRequest.m2329a().length());
    }

    protected final String m2321a() {
        return "LocalFileFetchProducer";
    }
}
