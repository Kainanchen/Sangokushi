package com.facebook.common.p011d;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* renamed from: com.facebook.common.d.b */
public final class Closeables {
    static final Logger f1107a;

    static {
        f1107a = Logger.getLogger(Closeables.class.getName());
    }

    private Closeables() {
    }

    public static void m1021a(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable e) {
                f1107a.log(Level.WARNING, "IOException thrown while closing Closeable.", e);
            }
        }
    }

    public static void m1022a(@Nullable InputStream inputStream) {
        try {
            Closeables.m1021a((Closeable) inputStream);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
