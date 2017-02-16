package com.facebook.imagepipeline.p041c;

import bolts.Task;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p014e.FLog;
import com.facebook.common.p017h.CloseableReference;
import com.facebook.imagepipeline.memory.PooledByteBuffer;
import com.facebook.imagepipeline.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.memory.aa;
import com.facebook.imagepipeline.p047h.EncodedImage;
import com.facebook.p006b.BinaryResource;
import com.facebook.p007c.p008a.CacheKey;
import com.facebook.p007c.p008a.WriterCallback;
import com.facebook.p007c.p010b.FileCache;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.imagepipeline.c.e */
public class BufferedDiskCache {
    private static final Class<?> f1923a;
    private final FileCache f1924b;
    private final PooledByteBufferFactory f1925c;
    private final aa f1926d;
    private final Executor f1927e;
    private final Executor f1928f;
    private final StagingArea f1929g;
    private final ImageCacheStatsTracker f1930h;

    /* renamed from: com.facebook.imagepipeline.c.e.1 */
    class BufferedDiskCache implements Callable<EncodedImage> {
        final /* synthetic */ AtomicBoolean f1915a;
        final /* synthetic */ CacheKey f1916b;
        final /* synthetic */ BufferedDiskCache f1917c;

        BufferedDiskCache(BufferedDiskCache bufferedDiskCache, AtomicBoolean atomicBoolean, CacheKey cacheKey) {
            this.f1917c = bufferedDiskCache;
            this.f1915a = atomicBoolean;
            this.f1916b = cacheKey;
        }

        public final /* synthetic */ Object call() {
            return m1867a();
        }

        private EncodedImage m1867a() {
            CloseableReference a;
            if (this.f1915a.get()) {
                throw new CancellationException();
            }
            EncodedImage a2 = this.f1917c.f1929g.m1923a(this.f1916b);
            if (a2 != null) {
                FLog.m1041a(BufferedDiskCache.f1923a, "Found image for %s in staging area", this.f1916b.toString());
            } else {
                FLog.m1041a(BufferedDiskCache.f1923a, "Did not find image for %s in staging area", this.f1916b.toString());
                try {
                    a = CloseableReference.m1093a(this.f1917c.m1875b(this.f1916b));
                    a2 = new EncodedImage(a);
                    CloseableReference.m1097c(a);
                } catch (Exception e) {
                    return null;
                } catch (Throwable th) {
                    CloseableReference.m1097c(a);
                }
            }
            if (!Thread.interrupted()) {
                return a2;
            }
            FLog.m1040a(BufferedDiskCache.f1923a, "Host thread was interrupted, decreasing reference count");
            if (a2 != null) {
                a2.close();
            }
            throw new InterruptedException();
        }
    }

    /* renamed from: com.facebook.imagepipeline.c.e.2 */
    class BufferedDiskCache implements Runnable {
        final /* synthetic */ CacheKey f1918a;
        final /* synthetic */ EncodedImage f1919b;
        final /* synthetic */ BufferedDiskCache f1920c;

        BufferedDiskCache(BufferedDiskCache bufferedDiskCache, CacheKey cacheKey, EncodedImage encodedImage) {
            this.f1920c = bufferedDiskCache;
            this.f1918a = cacheKey;
            this.f1919b = encodedImage;
        }

        public final void run() {
            try {
                BufferedDiskCache.m1872a(this.f1920c, this.f1918a, this.f1919b);
            } finally {
                this.f1920c.f1929g.m1926b(this.f1918a, this.f1919b);
                EncodedImage.m2029d(this.f1919b);
            }
        }
    }

    /* renamed from: com.facebook.imagepipeline.c.e.3 */
    class BufferedDiskCache implements WriterCallback {
        final /* synthetic */ EncodedImage f1921a;
        final /* synthetic */ BufferedDiskCache f1922b;

        BufferedDiskCache(BufferedDiskCache bufferedDiskCache, EncodedImage encodedImage) {
            this.f1922b = bufferedDiskCache;
            this.f1921a = encodedImage;
        }

        public final void m1868a(OutputStream outputStream) {
            this.f1922b.f1926d.m2363a(this.f1921a.m2032a(), outputStream);
        }
    }

    static {
        f1923a = BufferedDiskCache.class;
    }

    public BufferedDiskCache(FileCache fileCache, PooledByteBufferFactory pooledByteBufferFactory, aa aaVar, Executor executor, Executor executor2, ImageCacheStatsTracker imageCacheStatsTracker) {
        this.f1924b = fileCache;
        this.f1925c = pooledByteBufferFactory;
        this.f1926d = aaVar;
        this.f1927e = executor;
        this.f1928f = executor2;
        this.f1930h = imageCacheStatsTracker;
        this.f1929g = StagingArea.m1921a();
    }

    public final boolean m1878a(CacheKey cacheKey) {
        return this.f1929g.m1925b(cacheKey) || this.f1924b.m973b(cacheKey);
    }

    public final Task<EncodedImage> m1876a(CacheKey cacheKey, AtomicBoolean atomicBoolean) {
        EncodedImage a = this.f1929g.m1923a(cacheKey);
        if (a == null) {
            return m1873b(cacheKey, atomicBoolean);
        }
        FLog.m1041a(f1923a, "Found image for %s in staging area", cacheKey.toString());
        return Task.forResult(a);
    }

    private Task<EncodedImage> m1873b(CacheKey cacheKey, AtomicBoolean atomicBoolean) {
        try {
            return Task.call(new BufferedDiskCache(this, atomicBoolean, cacheKey), this.f1927e);
        } catch (Throwable e) {
            FLog.m1047a(f1923a, e, "Failed to schedule disk-cache read for %s", cacheKey.toString());
            return Task.forError(e);
        }
    }

    public final void m1877a(CacheKey cacheKey, EncodedImage encodedImage) {
        Preconditions.m1030a((Object) cacheKey);
        Preconditions.m1033a(EncodedImage.m2031e(encodedImage));
        this.f1929g.m1924a(cacheKey, encodedImage);
        EncodedImage a = EncodedImage.m2026a(encodedImage);
        try {
            this.f1928f.execute(new BufferedDiskCache(this, cacheKey, a));
        } catch (Throwable e) {
            FLog.m1047a(f1923a, e, "Failed to schedule disk-cache write for %s", cacheKey.toString());
            this.f1929g.m1926b(cacheKey, encodedImage);
            EncodedImage.m2029d(a);
        }
    }

    private PooledByteBuffer m1875b(CacheKey cacheKey) {
        InputStream a;
        try {
            FLog.m1041a(f1923a, "Disk cache read for %s", cacheKey.toString());
            BinaryResource a2 = this.f1924b.m971a(cacheKey);
            if (a2 == null) {
                FLog.m1041a(f1923a, "Disk cache miss for %s", cacheKey.toString());
                return null;
            }
            FLog.m1041a(f1923a, "Found entry in disk cache for %s", cacheKey.toString());
            a = a2.m894a();
            PooledByteBuffer a3 = this.f1925c.m2404a(a, (int) a2.m895b());
            a.close();
            FLog.m1041a(f1923a, "Successful read from disk cache for %s", cacheKey.toString());
            return a3;
        } catch (Throwable e) {
            FLog.m1047a(f1923a, e, "Exception reading from cache for %s", cacheKey.toString());
            throw e;
        } catch (Throwable th) {
            a.close();
        }
    }

    static /* synthetic */ void m1872a(BufferedDiskCache bufferedDiskCache, CacheKey cacheKey, EncodedImage encodedImage) {
        FLog.m1041a(f1923a, "About to write to disk-cache for key %s", cacheKey.toString());
        try {
            bufferedDiskCache.f1924b.m972a(cacheKey, new BufferedDiskCache(bufferedDiskCache, encodedImage));
            FLog.m1041a(f1923a, "Successful disk-cache write for key %s", cacheKey.toString());
        } catch (Throwable e) {
            FLog.m1047a(f1923a, e, "Failed to write to disk-cache for key %s", cacheKey.toString());
        }
    }
}
