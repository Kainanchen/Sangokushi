package com.facebook.common.p011d;

import com.google.protobuf.CodedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.facebook.common.d.a */
public final class ByteStreams {
    public static long m1020a(InputStream inputStream, OutputStream outputStream) {
        Preconditions.m1030a((Object) inputStream);
        Preconditions.m1030a((Object) outputStream);
        byte[] bArr = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    public static int m1019a(InputStream inputStream, byte[] bArr, int i) {
        Preconditions.m1030a((Object) inputStream);
        Preconditions.m1030a((Object) bArr);
        if (i < 0) {
            throw new IndexOutOfBoundsException("len is negative");
        }
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2 + 0, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        return i2;
    }
}
