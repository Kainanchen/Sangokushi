package com.facebook.imagepipeline.p042d;

import javax.annotation.concurrent.Immutable;

@Immutable
/* renamed from: com.facebook.imagepipeline.d.a */
public final class ImageDecodeOptions {
    private static final ImageDecodeOptions f1966f;
    public final int f1967a;
    public final boolean f1968b;
    public final boolean f1969c;
    public final boolean f1970d;
    public final boolean f1971e;

    private ImageDecodeOptions(ImageDecodeOptionsBuilder imageDecodeOptionsBuilder) {
        this.f1967a = imageDecodeOptionsBuilder.f1972a;
        this.f1968b = imageDecodeOptionsBuilder.f1973b;
        this.f1969c = imageDecodeOptionsBuilder.f1974c;
        this.f1970d = imageDecodeOptionsBuilder.f1975d;
        this.f1971e = imageDecodeOptionsBuilder.f1976e;
    }

    public static ImageDecodeOptions m1927a() {
        return f1966f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageDecodeOptions imageDecodeOptions = (ImageDecodeOptions) obj;
        if (this.f1968b != imageDecodeOptions.f1968b) {
            return false;
        }
        if (this.f1969c != imageDecodeOptions.f1969c) {
            return false;
        }
        if (this.f1970d != imageDecodeOptions.f1970d) {
            return false;
        }
        if (this.f1971e != imageDecodeOptions.f1971e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2 = 1;
        int i3 = this.f1967a * 31;
        if (this.f1968b) {
            i = 1;
        } else {
            i = 0;
        }
        i3 = (i + i3) * 31;
        if (this.f1969c) {
            i = 1;
        } else {
            i = 0;
        }
        i3 = (i + i3) * 31;
        if (this.f1970d) {
            i = 1;
        } else {
            i = 0;
        }
        i = (i + i3) * 31;
        if (!this.f1971e) {
            i2 = 0;
        }
        return i + i2;
    }

    public final String toString() {
        return String.format(null, "%d-%b-%b-%b-%b", new Object[]{Integer.valueOf(this.f1967a), Boolean.valueOf(this.f1968b), Boolean.valueOf(this.f1969c), Boolean.valueOf(this.f1970d), Boolean.valueOf(this.f1971e)});
    }

    static {
        f1966f = new ImageDecodeOptions(new ImageDecodeOptionsBuilder());
    }
}
