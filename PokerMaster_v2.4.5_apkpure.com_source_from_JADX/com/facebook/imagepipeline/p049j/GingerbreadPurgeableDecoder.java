package com.facebook.imagepipeline.p049j;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.MemoryFile;
import com.facebook.common.p011d.ByteStreams;
import com.facebook.common.p011d.Closeables;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p011d.Throwables;
import com.facebook.common.p017h.CloseableReference;
import com.facebook.common.p020k.LimitedInputStream;
import com.facebook.common.p022m.WebpBitmapFactory;
import com.facebook.common.p022m.WebpSupportStatus;
import com.facebook.imagepipeline.memory.PooledByteBuffer;
import com.facebook.imagepipeline.memory.PooledByteBufferInputStream;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.lang.reflect.Method;
import javax.annotation.Nullable;

/* renamed from: com.facebook.imagepipeline.j.c */
public final class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {
    private static Method f2160b;
    private final boolean f2161c;

    public GingerbreadPurgeableDecoder(boolean z) {
        if (WebpSupportStatus.f1161d != null) {
            WebpBitmapFactory webpBitmapFactory = WebpSupportStatus.f1161d;
        }
        this.f2161c = z;
    }

    protected final Bitmap m2081a(CloseableReference<PooledByteBuffer> closeableReference, Options options) {
        return m2076a(closeableReference, ((PooledByteBuffer) closeableReference.m1099a()).m2395a(), null, options);
    }

    protected final Bitmap m2080a(CloseableReference<PooledByteBuffer> closeableReference, int i, Options options) {
        return m2076a(closeableReference, i, DalvikPurgeableDecoder.m2070a((CloseableReference) closeableReference, i) ? null : a, options);
    }

    private static MemoryFile m2077a(CloseableReference<PooledByteBuffer> closeableReference, int i, @Nullable byte[] bArr) {
        InputStream limitedInputStream;
        Closeable outputStream;
        Throwable th;
        InputStream inputStream = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i);
        memoryFile.allowPurging(false);
        try {
            InputStream pooledByteBufferInputStream = new PooledByteBufferInputStream((PooledByteBuffer) closeableReference.m1099a());
            try {
                limitedInputStream = new LimitedInputStream(pooledByteBufferInputStream, i);
                try {
                    outputStream = memoryFile.getOutputStream();
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = null;
                    inputStream = limitedInputStream;
                    limitedInputStream = pooledByteBufferInputStream;
                    CloseableReference.m1097c(closeableReference);
                    Closeables.m1022a(limitedInputStream);
                    Closeables.m1022a(inputStream);
                    Closeables.m1021a(outputStream);
                    throw th;
                }
                try {
                    ByteStreams.m1020a(limitedInputStream, outputStream);
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i, bArr.length);
                    }
                    CloseableReference.m1097c(closeableReference);
                    Closeables.m1022a(pooledByteBufferInputStream);
                    Closeables.m1022a(limitedInputStream);
                    Closeables.m1021a(outputStream);
                    return memoryFile;
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = limitedInputStream;
                    limitedInputStream = pooledByteBufferInputStream;
                    CloseableReference.m1097c(closeableReference);
                    Closeables.m1022a(limitedInputStream);
                    Closeables.m1022a(inputStream);
                    Closeables.m1021a(outputStream);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                outputStream = null;
                limitedInputStream = pooledByteBufferInputStream;
                CloseableReference.m1097c(closeableReference);
                Closeables.m1022a(limitedInputStream);
                Closeables.m1022a(inputStream);
                Closeables.m1021a(outputStream);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            outputStream = null;
            limitedInputStream = null;
            CloseableReference.m1097c(closeableReference);
            Closeables.m1022a(limitedInputStream);
            Closeables.m1022a(inputStream);
            Closeables.m1021a(outputStream);
            throw th;
        }
    }

    private synchronized Method m2079a() {
        if (f2160b == null) {
            try {
                f2160b = MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]);
            } catch (Throwable e) {
                throw Throwables.m1039b(e);
            }
        }
        return f2160b;
    }

    private FileDescriptor m2078a(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) m2079a().invoke(memoryFile, new Object[0]);
        } catch (Throwable e) {
            throw Throwables.m1039b(e);
        }
    }

    private Bitmap m2076a(CloseableReference<PooledByteBuffer> closeableReference, int i, byte[] bArr, Options options) {
        MemoryFile memoryFile = null;
        try {
            Object a;
            memoryFile = GingerbreadPurgeableDecoder.m2077a((CloseableReference) closeableReference, i, bArr);
            FileDescriptor a2 = m2078a(memoryFile);
            if (this.f2161c) {
                a = WebpSupportStatus.f1161d.m1131a();
            } else {
                a = BitmapFactory.decodeFileDescriptor(a2, null, options);
            }
            Bitmap bitmap = (Bitmap) Preconditions.m1031a(a, (Object) "BitmapFactory returned null");
            memoryFile.close();
            return bitmap;
        } catch (Throwable e) {
            throw Throwables.m1039b(e);
        } catch (Throwable th) {
            if (memoryFile != null) {
                memoryFile.close();
            }
        }
    }
}
