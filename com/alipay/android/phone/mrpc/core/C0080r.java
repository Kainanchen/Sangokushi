package com.alipay.android.phone.mrpc.core;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.alipay.android.phone.mrpc.core.r */
public final class C0080r {
    public static void m123a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }
}
