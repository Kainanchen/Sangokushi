package com.facebook.p006b;

import com.facebook.common.p011d.Preconditions;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: com.facebook.b.b */
public final class FileBinaryResource implements BinaryResource {
    public final File f946a;

    private FileBinaryResource(File file) {
        this.f946a = (File) Preconditions.m1030a((Object) file);
    }

    public final InputStream m897a() {
        return new FileInputStream(this.f946a);
    }

    public final long m898b() {
        return this.f946a.length();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof FileBinaryResource)) {
            return false;
        }
        return this.f946a.equals(((FileBinaryResource) obj).f946a);
    }

    public final int hashCode() {
        return this.f946a.hashCode();
    }

    public static FileBinaryResource m896a(File file) {
        return file != null ? new FileBinaryResource(file) : null;
    }
}
