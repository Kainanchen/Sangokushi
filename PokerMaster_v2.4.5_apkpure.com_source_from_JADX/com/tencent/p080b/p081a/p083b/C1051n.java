package com.tencent.p080b.p081a.p083b;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/* renamed from: com.tencent.b.a.b.n */
final class C1051n implements FileFilter {
    C1051n() {
    }

    public final boolean accept(File file) {
        return Pattern.matches("cpu[0-9]", file.getName());
    }
}
