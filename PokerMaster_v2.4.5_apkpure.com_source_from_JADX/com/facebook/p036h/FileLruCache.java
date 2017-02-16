package com.facebook.p036h;

import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.facebook.h.p */
public final class FileLruCache {
    static final String f1706a;
    private static final AtomicLong f1707b;
    private final String f1708c;
    private final FileLruCache f1709d;
    private final File f1710e;
    private boolean f1711f;
    private boolean f1712g;
    private final Object f1713h;
    private AtomicLong f1714i;

    /* renamed from: com.facebook.h.p.f */
    private interface FileLruCache {
        void m1654a();
    }

    /* renamed from: com.facebook.h.p.1 */
    class FileLruCache implements FileLruCache {
        final /* synthetic */ long f1691a;
        final /* synthetic */ File f1692b;
        final /* synthetic */ String f1693c;
        final /* synthetic */ FileLruCache f1694d;

        FileLruCache(FileLruCache fileLruCache, long j, File file, String str) {
            this.f1694d = fileLruCache;
            this.f1691a = j;
            this.f1692b = file;
            this.f1693c = str;
        }

        public final void m1655a() {
            if (this.f1691a < this.f1694d.f1714i.get()) {
                this.f1692b.delete();
            } else {
                FileLruCache.m1663a(this.f1694d, this.f1693c, this.f1692b);
            }
        }
    }

    /* renamed from: com.facebook.h.p.2 */
    class FileLruCache implements Runnable {
        final /* synthetic */ FileLruCache f1695a;

        FileLruCache(FileLruCache fileLruCache) {
            this.f1695a = fileLruCache;
        }

        public final void run() {
            FileLruCache.m1664b(this.f1695a);
        }
    }

    /* renamed from: com.facebook.h.p.a */
    private static class FileLruCache {
        private static final FilenameFilter f1696a;
        private static final FilenameFilter f1697b;

        /* renamed from: com.facebook.h.p.a.1 */
        static class FileLruCache implements FilenameFilter {
            FileLruCache() {
            }

            public final boolean accept(File file, String str) {
                return !str.startsWith("buffer");
            }
        }

        /* renamed from: com.facebook.h.p.a.2 */
        static class FileLruCache implements FilenameFilter {
            FileLruCache() {
            }

            public final boolean accept(File file, String str) {
                return str.startsWith("buffer");
            }
        }

        static {
            f1696a = new FileLruCache();
            f1697b = new FileLruCache();
        }

        static FilenameFilter m1656a() {
            return f1696a;
        }

        static File m1658b(File file) {
            return new File(file, "buffer" + Long.valueOf(FileLruCache.f1707b.incrementAndGet()).toString());
        }

        static void m1657a(File file) {
            File[] listFiles = file.listFiles(f1697b);
            if (listFiles != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
        }
    }

    /* renamed from: com.facebook.h.p.b */
    private static class FileLruCache extends OutputStream {
        final OutputStream f1698a;
        final FileLruCache f1699b;

        FileLruCache(OutputStream outputStream, FileLruCache fileLruCache) {
            this.f1698a = outputStream;
            this.f1699b = fileLruCache;
        }

        public final void close() {
            try {
                this.f1698a.close();
            } finally {
                this.f1699b.m1654a();
            }
        }

        public final void flush() {
            this.f1698a.flush();
        }

        public final void write(byte[] bArr, int i, int i2) {
            this.f1698a.write(bArr, i, i2);
        }

        public final void write(byte[] bArr) {
            this.f1698a.write(bArr);
        }

        public final void write(int i) {
            this.f1698a.write(i);
        }
    }

    /* renamed from: com.facebook.h.p.c */
    private static final class FileLruCache extends InputStream {
        final InputStream f1700a;
        final OutputStream f1701b;

        FileLruCache(InputStream inputStream, OutputStream outputStream) {
            this.f1700a = inputStream;
            this.f1701b = outputStream;
        }

        public final int available() {
            return this.f1700a.available();
        }

        public final void close() {
            try {
                this.f1700a.close();
            } finally {
                this.f1701b.close();
            }
        }

        public final void mark(int i) {
            throw new UnsupportedOperationException();
        }

        public final boolean markSupported() {
            return false;
        }

        public final int read(byte[] bArr) {
            int read = this.f1700a.read(bArr);
            if (read > 0) {
                this.f1701b.write(bArr, 0, read);
            }
            return read;
        }

        public final int read() {
            int read = this.f1700a.read();
            if (read >= 0) {
                this.f1701b.write(read);
            }
            return read;
        }

        public final int read(byte[] bArr, int i, int i2) {
            int read = this.f1700a.read(bArr, i, i2);
            if (read > 0) {
                this.f1701b.write(bArr, i, read);
            }
            return read;
        }

        public final synchronized void reset() {
            throw new UnsupportedOperationException();
        }

        public final long skip(long j) {
            byte[] bArr = new byte[AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT];
            long j2 = 0;
            while (j2 < j) {
                int read = read(bArr, 0, (int) Math.min(j - j2, PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID));
                if (read < 0) {
                    break;
                }
                j2 += (long) read;
            }
            return j2;
        }
    }

    /* renamed from: com.facebook.h.p.d */
    public static final class FileLruCache {
        int f1702a;
        int f1703b;

        public FileLruCache() {
            this.f1703b = AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT;
            this.f1702a = AccessibilityNodeInfoCompat.ACTION_DISMISS;
        }
    }

    /* renamed from: com.facebook.h.p.e */
    private static final class FileLruCache implements Comparable<FileLruCache> {
        final File f1704a;
        final long f1705b;

        public final /* synthetic */ int compareTo(Object obj) {
            return m1659a((FileLruCache) obj);
        }

        FileLruCache(File file) {
            this.f1704a = file;
            this.f1705b = file.lastModified();
        }

        public final boolean equals(Object obj) {
            return (obj instanceof FileLruCache) && m1659a((FileLruCache) obj) == 0;
        }

        public final int hashCode() {
            return ((this.f1704a.hashCode() + 1073) * 37) + ((int) (this.f1705b % 2147483647L));
        }

        private int m1659a(FileLruCache fileLruCache) {
            if (this.f1705b < fileLruCache.f1705b) {
                return -1;
            }
            if (this.f1705b > fileLruCache.f1705b) {
                return 1;
            }
            return this.f1704a.compareTo(fileLruCache.f1704a);
        }
    }

    /* renamed from: com.facebook.h.p.g */
    private static final class FileLruCache {
        static JSONObject m1660a(InputStream inputStream) {
            int i = 0;
            if (inputStream.read() != 0) {
                return null;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < 3; i3++) {
                int read = inputStream.read();
                if (read == -1) {
                    Logger.m1682a(LoggingBehavior.CACHE, FileLruCache.f1706a, "readHeader: stream.read returned -1 while reading header size");
                    return null;
                }
                i2 = (i2 << 8) + (read & MotionEventCompat.ACTION_MASK);
            }
            byte[] bArr = new byte[i2];
            while (i < i2) {
                read = inputStream.read(bArr, i, i2 - i);
                if (read <= 0) {
                    Logger.m1682a(LoggingBehavior.CACHE, FileLruCache.f1706a, "readHeader: stream.read stopped at " + Integer.valueOf(i) + " when expected " + i2);
                    return null;
                }
                i += read;
            }
            try {
                Object nextValue = new JSONTokener(new String(bArr)).nextValue();
                if (nextValue instanceof JSONObject) {
                    return (JSONObject) nextValue;
                }
                Logger.m1682a(LoggingBehavior.CACHE, FileLruCache.f1706a, "readHeader: expected JSONObject, got " + nextValue.getClass().getCanonicalName());
                return null;
            } catch (JSONException e) {
                throw new IOException(e.getMessage());
            }
        }
    }

    static {
        f1706a = FileLruCache.class.getSimpleName();
        f1707b = new AtomicLong();
    }

    public FileLruCache(String str, FileLruCache fileLruCache) {
        this.f1714i = new AtomicLong(0);
        this.f1708c = str;
        this.f1709d = fileLruCache;
        this.f1710e = new File(FacebookSdk.m2594n(), str);
        this.f1713h = new Object();
        if (this.f1710e.mkdirs() || this.f1710e.isDirectory()) {
            FileLruCache.m1657a(this.f1710e);
        }
    }

    public final InputStream m1665a(String str, String str2) {
        File file = new File(this.f1710e, af.m1526b(str));
        try {
            InputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD);
            try {
                JSONObject a = FileLruCache.m1660a(bufferedInputStream);
                if (a == null) {
                    return null;
                }
                String optString = a.optString("key");
                if (optString == null || !optString.equals(str)) {
                    bufferedInputStream.close();
                    return null;
                }
                String optString2 = a.optString("tag", null);
                if ((str2 != null || optString2 == null) && (str2 == null || str2.equals(optString2))) {
                    long time = new Date().getTime();
                    Logger.m1682a(LoggingBehavior.CACHE, f1706a, "Setting lastModified to " + Long.valueOf(time) + " for " + file.getName());
                    file.setLastModified(time);
                    return bufferedInputStream;
                }
                bufferedInputStream.close();
                return null;
            } finally {
                bufferedInputStream.close();
            }
        } catch (IOException e) {
            return null;
        }
    }

    public final OutputStream m1666b(String str, String str2) {
        File b = FileLruCache.m1658b(this.f1710e);
        b.delete();
        if (b.createNewFile()) {
            try {
                OutputStream bufferedOutputStream = new BufferedOutputStream(new FileLruCache(new FileOutputStream(b), new FileLruCache(this, System.currentTimeMillis(), b, str)), AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("key", str);
                    if (!af.m1523a(str2)) {
                        jSONObject.put("tag", str2);
                    }
                    byte[] bytes = jSONObject.toString().getBytes();
                    bufferedOutputStream.write(0);
                    bufferedOutputStream.write((bytes.length >> 16) & MotionEventCompat.ACTION_MASK);
                    bufferedOutputStream.write((bytes.length >> 8) & MotionEventCompat.ACTION_MASK);
                    bufferedOutputStream.write((bytes.length >> 0) & MotionEventCompat.ACTION_MASK);
                    bufferedOutputStream.write(bytes);
                    return bufferedOutputStream;
                } catch (JSONException e) {
                    Logger.m1681a(LoggingBehavior.CACHE, 5, f1706a, "Error creating JSON header for cache file: " + e);
                    throw new IOException(e.getMessage());
                } catch (Throwable th) {
                    bufferedOutputStream.close();
                }
            } catch (FileNotFoundException e2) {
                Logger.m1681a(LoggingBehavior.CACHE, 5, f1706a, "Error creating buffer output stream: " + e2);
                throw new IOException(e2.getMessage());
            }
        }
        throw new IOException("Could not create file at " + b.getAbsolutePath());
    }

    public final String toString() {
        return "{FileLruCache: tag:" + this.f1708c + " file:" + this.f1710e.getName() + "}";
    }

    static /* synthetic */ void m1663a(FileLruCache fileLruCache, String str, File file) {
        if (!file.renameTo(new File(fileLruCache.f1710e, af.m1526b(str)))) {
            file.delete();
        }
        synchronized (fileLruCache.f1713h) {
            if (!fileLruCache.f1711f) {
                fileLruCache.f1711f = true;
                FacebookSdk.m2583d().execute(new FileLruCache(fileLruCache));
            }
        }
    }

    static /* synthetic */ void m1664b(FileLruCache fileLruCache) {
        synchronized (fileLruCache.f1713h) {
            fileLruCache.f1711f = false;
            fileLruCache.f1712g = true;
        }
        try {
            File file;
            Logger.m1682a(LoggingBehavior.CACHE, f1706a, "trim started");
            PriorityQueue priorityQueue = new PriorityQueue();
            long j = 0;
            long j2 = 0;
            File[] listFiles = fileLruCache.f1710e.listFiles(FileLruCache.m1656a());
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    file = listFiles[i];
                    FileLruCache fileLruCache2 = new FileLruCache(file);
                    priorityQueue.add(fileLruCache2);
                    Logger.m1682a(LoggingBehavior.CACHE, f1706a, "  trim considering time=" + Long.valueOf(fileLruCache2.f1705b) + " name=" + fileLruCache2.f1704a.getName());
                    long length2 = file.length() + j;
                    i++;
                    j2 = 1 + j2;
                    j = length2;
                }
            }
            long j3 = j;
            j = j2;
            while (true) {
                if (j3 <= ((long) fileLruCache.f1709d.f1702a) && j <= ((long) fileLruCache.f1709d.f1703b)) {
                    break;
                }
                file = ((FileLruCache) priorityQueue.remove()).f1704a;
                Logger.m1682a(LoggingBehavior.CACHE, f1706a, "  trim removing " + file.getName());
                j3 -= file.length();
                j2 = j - 1;
                file.delete();
                j = j2;
            }
            synchronized (fileLruCache.f1713h) {
                fileLruCache.f1712g = false;
                fileLruCache.f1713h.notifyAll();
            }
        } catch (Throwable th) {
            synchronized (fileLruCache.f1713h) {
            }
            fileLruCache.f1712g = false;
            fileLruCache.f1713h.notifyAll();
        }
    }
}
