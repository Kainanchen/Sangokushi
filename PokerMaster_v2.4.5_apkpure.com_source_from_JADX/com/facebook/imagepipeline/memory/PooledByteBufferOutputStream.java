package com.facebook.imagepipeline.memory;

import com.facebook.common.p011d.Throwables;
import java.io.OutputStream;

/* renamed from: com.facebook.imagepipeline.memory.z */
public abstract class PooledByteBufferOutputStream extends OutputStream {
    public abstract int m2415b();

    public abstract PooledByteBuffer m2416c();

    public void close() {
        try {
            super.close();
        } catch (Throwable e) {
            Throwables.m1039b(e);
        }
    }
}
