package com.alipay.p011b.p012a.p013a.p016b;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/* renamed from: com.alipay.b.a.a.b.c */
final class C0114c implements FileFilter {
    final /* synthetic */ C0113b f146a;

    C0114c(C0113b c0113b) {
        this.f146a = c0113b;
    }

    public final boolean accept(File file) {
        return Pattern.matches("cpu[0-9]+", file.getName());
    }
}
