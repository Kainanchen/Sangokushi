package com.facebook.common.p009c;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.facebook.common.c.c */
public final class FileUtils {

    /* renamed from: com.facebook.common.c.c.a */
    public static class FileUtils extends IOException {
        public FileUtils(String str) {
            super(str);
        }

        public FileUtils(String str, Throwable th) {
            super(str);
            initCause(th);
        }
    }

    /* renamed from: com.facebook.common.c.c.b */
    public static class FileUtils extends IOException {
        public FileUtils(String str) {
            super(str);
        }
    }

    /* renamed from: com.facebook.common.c.c.c */
    public static class FileUtils extends FileNotFoundException {
        public FileUtils(String str) {
            super(str);
        }
    }

    /* renamed from: com.facebook.common.c.c.d */
    public static class FileUtils extends IOException {
        public FileUtils(String str, Throwable th) {
            super(str);
            initCause(th);
        }
    }

    public static void m1018a(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                if (!file.delete()) {
                    throw new FileUtils(file.getAbsolutePath(), new FileUtils(file.getAbsolutePath()));
                }
            }
            return;
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new FileUtils(file.getAbsolutePath());
        }
    }
}
