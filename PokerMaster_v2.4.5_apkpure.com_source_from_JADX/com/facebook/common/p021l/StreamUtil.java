package com.facebook.common.p021l;

import com.facebook.common.p011d.Preconditions;
import java.io.InputStream;

/* renamed from: com.facebook.common.l.c */
public final class StreamUtil {
    public static long m1119a(InputStream inputStream, long j) {
        Preconditions.m1030a((Object) inputStream);
        Preconditions.m1033a(j >= 0);
        long j2 = j;
        while (j2 > 0) {
            long skip = inputStream.skip(j2);
            if (skip > 0) {
                j2 -= skip;
            } else if (inputStream.read() == -1) {
                return j - j2;
            } else {
                j2--;
            }
        }
        return j;
    }
}
