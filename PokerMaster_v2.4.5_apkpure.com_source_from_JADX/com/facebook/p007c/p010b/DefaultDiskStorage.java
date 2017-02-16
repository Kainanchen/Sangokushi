package com.facebook.p007c.p010b;

import android.os.Environment;
import com.facebook.common.p009c.FileTree;
import com.facebook.common.p009c.FileTreeVisitor;
import com.facebook.common.p009c.FileUtils.FileUtils;
import com.facebook.common.p011d.CountingOutputStream;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.time.Clock;
import com.facebook.common.time.SystemClock;
import com.facebook.p006b.BinaryResource;
import com.facebook.p006b.FileBinaryResource;
import com.facebook.p007c.p008a.CacheErrorLogger;
import com.facebook.p007c.p008a.WriterCallback;
import com.facebook.p007c.p010b.DiskStorage.DiskStorage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.c.b.a */
public class DefaultDiskStorage implements DiskStorage {
    static final long f1013a;
    private static final Class<?> f1014b;
    private final File f1015c;
    private final boolean f1016d;
    private final File f1017e;
    private final CacheErrorLogger f1018f;
    private final Clock f1019g;

    /* renamed from: com.facebook.c.b.a.a */
    private class DefaultDiskStorage implements FileTreeVisitor {
        final List<DiskStorage> f994a;
        final /* synthetic */ DefaultDiskStorage f995b;

        private DefaultDiskStorage(DefaultDiskStorage defaultDiskStorage) {
            this.f995b = defaultDiskStorage;
            this.f994a = new ArrayList();
        }

        public final void m916a(File file) {
        }

        public final void m917b(File file) {
            DefaultDiskStorage a = DefaultDiskStorage.m943a(this.f995b, file);
            if (a != null && a.f1000a == DefaultDiskStorage.CONTENT) {
                this.f994a.add(new DefaultDiskStorage(file, (byte) 0));
            }
        }

        public final void m918c(File file) {
        }
    }

    /* renamed from: com.facebook.c.b.a.b */
    static class DefaultDiskStorage implements DiskStorage {
        final FileBinaryResource f996a;
        private final String f997b;
        private long f998c;
        private long f999d;

        private DefaultDiskStorage(String str, File file) {
            Preconditions.m1030a((Object) file);
            this.f997b = (String) Preconditions.m1030a((Object) str);
            this.f996a = FileBinaryResource.m896a(file);
            this.f998c = -1;
            this.f999d = -1;
        }

        public final String m922a() {
            return this.f997b;
        }

        public final long m923b() {
            if (this.f999d < 0) {
                this.f999d = this.f996a.f946a.lastModified();
            }
            return this.f999d;
        }

        public final long m924c() {
            if (this.f998c < 0) {
                this.f998c = this.f996a.f946a.length();
            }
            return this.f998c;
        }
    }

    /* renamed from: com.facebook.c.b.a.c */
    private static class DefaultDiskStorage {
        public final DefaultDiskStorage f1000a;
        public final String f1001b;

        DefaultDiskStorage(DefaultDiskStorage defaultDiskStorage, String str) {
            this.f1000a = defaultDiskStorage;
            this.f1001b = str;
        }

        public final String toString() {
            return this.f1000a + "(" + this.f1001b + ")";
        }
    }

    /* renamed from: com.facebook.c.b.a.d */
    private enum DefaultDiskStorage {
        CONTENT(".cnt"),
        TEMP(".tmp");
        
        public final String f1005c;

        private DefaultDiskStorage(String str) {
            this.f1005c = str;
        }

        public static DefaultDiskStorage m925a(String str) {
            if (".cnt".equals(str)) {
                return CONTENT;
            }
            if (".tmp".equals(str)) {
                return TEMP;
            }
            return null;
        }
    }

    /* renamed from: com.facebook.c.b.a.e */
    private static class DefaultDiskStorage extends IOException {
        public final long f1006a;
        public final long f1007b;

        public DefaultDiskStorage(long j, long j2) {
            super("File was not written completely. Expected: " + j + ", found: " + j2);
            this.f1006a = j;
            this.f1007b = j2;
        }
    }

    /* renamed from: com.facebook.c.b.a.f */
    class DefaultDiskStorage implements DiskStorage {
        final File f1008a;
        final /* synthetic */ DefaultDiskStorage f1009b;
        private final String f1010c;

        public DefaultDiskStorage(DefaultDiskStorage defaultDiskStorage, String str, File file) {
            this.f1009b = defaultDiskStorage;
            this.f1010c = str;
            this.f1008a = file;
        }

        public final void m930a(WriterCallback writerCallback) {
            try {
                OutputStream fileOutputStream = new FileOutputStream(this.f1008a);
                try {
                    OutputStream countingOutputStream = new CountingOutputStream(fileOutputStream);
                    writerCallback.m912a(countingOutputStream);
                    countingOutputStream.flush();
                    long j = countingOutputStream.f1108a;
                    if (this.f1008a.length() != j) {
                        throw new DefaultDiskStorage(j, this.f1008a.length());
                    }
                } finally {
                    fileOutputStream.close();
                }
            } catch (FileNotFoundException e) {
                this.f1009b.f1018f;
                int i = CacheErrorLogger.CacheErrorLogger.f973g;
                DefaultDiskStorage.f1014b;
                throw e;
            }
        }

        public final BinaryResource m929a() {
            Object a = this.f1009b.m954a(this.f1010c);
            try {
                Object obj = this.f1008a;
                Preconditions.m1030a(obj);
                Preconditions.m1030a(a);
                a.delete();
                if (obj.renameTo(a)) {
                    if (a.exists()) {
                        a.setLastModified(this.f1009b.f1019g.m1141a());
                    }
                    return FileBinaryResource.m896a(a);
                }
                Throwable th = null;
                if (a.exists()) {
                    th = new FileUtils(a.getAbsolutePath());
                } else if (!obj.getParentFile().exists()) {
                    th = new FileUtils(obj.getAbsolutePath());
                } else if (!obj.exists()) {
                    th = new FileNotFoundException(obj.getAbsolutePath());
                }
                throw new FileUtils("Unknown error renaming " + obj.getAbsolutePath() + " to " + a.getAbsolutePath(), th);
            } catch (FileUtils e) {
                Throwable cause = e.getCause();
                int i;
                if (cause == null) {
                    i = CacheErrorLogger.CacheErrorLogger.f976j;
                } else if (cause instanceof FileUtils) {
                    i = CacheErrorLogger.CacheErrorLogger.f975i;
                } else if (cause instanceof FileNotFoundException) {
                    i = CacheErrorLogger.CacheErrorLogger.f974h;
                } else {
                    i = CacheErrorLogger.CacheErrorLogger.f976j;
                }
                this.f1009b.f1018f;
                DefaultDiskStorage.f1014b;
                throw e;
            }
        }

        public final boolean m931b() {
            return !this.f1008a.exists() || this.f1008a.delete();
        }
    }

    /* renamed from: com.facebook.c.b.a.g */
    private class DefaultDiskStorage implements FileTreeVisitor {
        final /* synthetic */ DefaultDiskStorage f1011a;
        private boolean f1012b;

        private DefaultDiskStorage(DefaultDiskStorage defaultDiskStorage) {
            this.f1011a = defaultDiskStorage;
        }

        public final void m932a(File file) {
            if (!this.f1012b && file.equals(this.f1011a.f1017e)) {
                this.f1012b = true;
            }
        }

        public final void m933b(File file) {
            boolean z = false;
            if (this.f1012b) {
                DefaultDiskStorage a = DefaultDiskStorage.m943a(this.f1011a, file);
                if (a != null) {
                    if (a.f1000a != DefaultDiskStorage.TEMP) {
                        if (a.f1000a == DefaultDiskStorage.CONTENT) {
                            z = true;
                        }
                        Preconditions.m1035b(z);
                        z = true;
                    } else if (file.lastModified() > this.f1011a.f1019g.m1141a() - DefaultDiskStorage.f1013a) {
                        z = true;
                    }
                }
                if (z) {
                    return;
                }
            }
            file.delete();
        }

        public final void m934c(File file) {
            if (!(this.f1011a.f1015c.equals(file) || this.f1012b)) {
                file.delete();
            }
            if (this.f1012b && file.equals(this.f1011a.f1017e)) {
                this.f1012b = false;
            }
        }
    }

    static {
        f1014b = DefaultDiskStorage.class;
        f1013a = TimeUnit.MINUTES.toMillis(30);
    }

    public DefaultDiskStorage(File file, int i, CacheErrorLogger cacheErrorLogger) {
        int i2 = 1;
        Preconditions.m1030a((Object) file);
        this.f1015c = file;
        this.f1016d = DefaultDiskStorage.m945a(file);
        this.f1017e = new File(this.f1015c, String.format(null, "%s.ols%d.%d", new Object[]{"v2", Integer.valueOf(100), Integer.valueOf(i)}));
        this.f1018f = cacheErrorLogger;
        if (this.f1015c.exists()) {
            if (this.f1017e.exists()) {
                i2 = 0;
            } else {
                FileTree.m1017a(this.f1015c);
            }
        }
        if (i2 != 0) {
            try {
                com.facebook.common.p009c.FileUtils.m1018a(this.f1017e);
            } catch (FileUtils e) {
                i2 = CacheErrorLogger.CacheErrorLogger.f977k;
                new StringBuilder("version directory could not be created: ").append(this.f1017e);
            }
        }
        this.f1019g = SystemClock.m1142b();
    }

    private static boolean m945a(File file) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return false;
        }
        try {
            if (file.getCanonicalPath().contains(externalStorageDirectory.toString())) {
                return true;
            }
            return false;
        } catch (IOException e) {
            int i = CacheErrorLogger.CacheErrorLogger.f983q;
            return false;
        }
    }

    public final boolean m955a() {
        return this.f1016d;
    }

    public final String m957b() {
        String absolutePath = this.f1015c.getAbsolutePath();
        return "_" + absolutePath.substring(absolutePath.lastIndexOf(47) + 1, absolutePath.length()) + "_" + absolutePath.hashCode();
    }

    final File m954a(String str) {
        DefaultDiskStorage defaultDiskStorage = new DefaultDiskStorage(str, (byte) 0);
        return new File(m947b(defaultDiskStorage.f1001b) + File.separator + defaultDiskStorage.f1001b + defaultDiskStorage.f1000a.f1005c);
    }

    private String m947b(String str) {
        return this.f1017e + File.separator + String.valueOf(Math.abs(str.hashCode() % 100));
    }

    private File m949c(String str) {
        return new File(m947b(str));
    }

    public final void m958c() {
        FileTree.m1016a(this.f1015c, new DefaultDiskStorage());
    }

    public final DiskStorage m953a(String str, Object obj) {
        DefaultDiskStorage defaultDiskStorage = new DefaultDiskStorage(str, (byte) 0);
        File c = m949c(defaultDiskStorage.f1001b);
        if (!c.exists()) {
            try {
                com.facebook.common.p009c.FileUtils.m1018a(c);
            } catch (FileUtils e) {
                int i = CacheErrorLogger.CacheErrorLogger.f977k;
                throw e;
            }
        }
        try {
            return new DefaultDiskStorage(this, str, File.createTempFile(defaultDiskStorage.f1001b + ".", ".tmp", c));
        } catch (IOException e2) {
            i = CacheErrorLogger.CacheErrorLogger.f972f;
            throw e2;
        }
    }

    public final BinaryResource m956b(String str, Object obj) {
        File a = m954a(str);
        if (!a.exists()) {
            return null;
        }
        a.setLastModified(this.f1019g.m1141a());
        return FileBinaryResource.m896a(a);
    }

    public final long m952a(DiskStorage diskStorage) {
        File file = ((DefaultDiskStorage) diskStorage).f996a.f946a;
        if (!file.exists()) {
            return 0;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1;
    }

    public final boolean m959c(String str, Object obj) {
        return m954a(str).exists();
    }

    public final /* synthetic */ Collection m960d() {
        Object defaultDiskStorage = new DefaultDiskStorage();
        FileTree.m1016a(this.f1017e, defaultDiskStorage);
        return Collections.unmodifiableList(defaultDiskStorage.f994a);
    }

    static /* synthetic */ DefaultDiskStorage m943a(DefaultDiskStorage defaultDiskStorage, File file) {
        DefaultDiskStorage defaultDiskStorage2;
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf <= 0) {
            defaultDiskStorage2 = null;
        } else {
            DefaultDiskStorage a = DefaultDiskStorage.m925a(name.substring(lastIndexOf));
            if (a == null) {
                defaultDiskStorage2 = null;
            } else {
                name = name.substring(0, lastIndexOf);
                if (a.equals(DefaultDiskStorage.TEMP)) {
                    lastIndexOf = name.lastIndexOf(46);
                    if (lastIndexOf <= 0) {
                        defaultDiskStorage2 = null;
                    } else {
                        name = name.substring(0, lastIndexOf);
                    }
                }
                defaultDiskStorage2 = new DefaultDiskStorage(a, name);
            }
        }
        if (defaultDiskStorage2 == null || !defaultDiskStorage.m949c(defaultDiskStorage2.f1001b).equals(file.getParentFile())) {
            return null;
        }
        return defaultDiskStorage2;
    }
}
