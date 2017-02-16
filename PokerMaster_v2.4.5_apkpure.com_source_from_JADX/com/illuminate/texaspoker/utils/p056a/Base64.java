package com.illuminate.texaspoker.utils.p056a;

import android.support.v4.media.TransportMediator;
import com.qq.taf.jce.JceStruct;

/* renamed from: com.illuminate.texaspoker.utils.a.a */
public class Base64 {
    static final /* synthetic */ boolean f6596a;
    private static final byte[] f6597b;
    private static final byte[] f6598c;
    private static final byte[] f6599d;
    private static final byte[] f6600e;

    static {
        boolean z;
        if (Base64.class.desiredAssertionStatus()) {
            z = false;
        } else {
            z = true;
        }
        f6596a = z;
        f6597b = new byte[]{(byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73, (byte) 74, (byte) 75, (byte) 76, (byte) 77, (byte) 78, (byte) 79, (byte) 80, (byte) 81, (byte) 82, (byte) 83, (byte) 84, (byte) 85, (byte) 86, (byte) 87, (byte) 88, (byte) 89, (byte) 90, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102, (byte) 103, (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108, (byte) 109, (byte) 110, (byte) 111, (byte) 112, (byte) 113, (byte) 114, (byte) 115, (byte) 116, (byte) 117, (byte) 118, (byte) 119, (byte) 120, (byte) 121, (byte) 122, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 43, (byte) 47};
        f6598c = new byte[]{(byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73, (byte) 74, (byte) 75, (byte) 76, (byte) 77, (byte) 78, (byte) 79, (byte) 80, (byte) 81, (byte) 82, (byte) 83, (byte) 84, (byte) 85, (byte) 86, (byte) 87, (byte) 88, (byte) 89, (byte) 90, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102, (byte) 103, (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108, (byte) 109, (byte) 110, (byte) 111, (byte) 112, (byte) 113, (byte) 114, (byte) 115, (byte) 116, (byte) 117, (byte) 118, (byte) 119, (byte) 120, (byte) 121, (byte) 122, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 45, (byte) 95};
        f6599d = new byte[]{(byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -5, (byte) -5, (byte) -9, (byte) -9, (byte) -5, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -5, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) 62, (byte) -9, (byte) -9, (byte) -9, (byte) 63, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 58, (byte) 59, (byte) 60, (byte) 61, (byte) -9, (byte) -9, (byte) -9, (byte) -1, (byte) -9, (byte) -9, (byte) -9, (byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, JceStruct.STRUCT_END, JceStruct.ZERO_TAG, JceStruct.SIMPLE_LIST, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 43, (byte) 44, (byte) 45, (byte) 46, (byte) 47, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9};
        f6600e = new byte[]{(byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -5, (byte) -5, (byte) -9, (byte) -9, (byte) -5, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -5, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) 62, (byte) -9, (byte) -9, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 58, (byte) 59, (byte) 60, (byte) 61, (byte) -9, (byte) -9, (byte) -9, (byte) -1, (byte) -9, (byte) -9, (byte) -9, (byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, JceStruct.STRUCT_END, JceStruct.ZERO_TAG, JceStruct.SIMPLE_LIST, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) 63, (byte) -9, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 43, (byte) 44, (byte) 45, (byte) 46, (byte) 47, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9};
    }

    private Base64() {
    }

    private static int m4211a(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        if (bArr[2] == (byte) 61) {
            bArr2[i] = (byte) ((((bArr3[bArr[0]] << 24) >>> 6) | ((bArr3[bArr[1]] << 24) >>> 12)) >>> 16);
            return 1;
        } else if (bArr[3] == (byte) 61) {
            r0 = (((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6)) | ((bArr3[bArr[2]] << 24) >>> 18);
            bArr2[i] = (byte) (r0 >>> 16);
            bArr2[i + 1] = (byte) (r0 >>> 8);
            return 2;
        } else {
            r0 = ((((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6)) | ((bArr3[bArr[2]] << 24) >>> 18)) | ((bArr3[bArr[3]] << 24) >>> 24);
            bArr2[i] = (byte) (r0 >> 16);
            bArr2[i + 1] = (byte) (r0 >> 8);
            bArr2[i + 2] = (byte) r0;
            return 3;
        }
    }

    public static byte[] m4212a(String str) {
        Object obj;
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        byte[] bArr = f6599d;
        Object obj2 = new byte[(((length * 3) / 4) + 2)];
        byte[] bArr2 = new byte[4];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            byte b = (byte) (bytes[i + 0] & TransportMediator.KEYCODE_MEDIA_PAUSE);
            byte b2 = bArr[b];
            if (b2 >= -5) {
                int i4;
                if (b2 < -1) {
                    i4 = i2;
                    i2 = i3;
                } else if (b == (byte) 61) {
                    i4 = length - i;
                    byte b3 = (byte) (bytes[(length - 1) + 0] & TransportMediator.KEYCODE_MEDIA_PAUSE);
                    if (i2 == 0 || i2 == 1) {
                        throw new Base64DecoderException("invalid padding byte '=' at byte offset " + i);
                    } else if ((i2 != 3 || i4 <= 2) && (i2 != 4 || i4 <= 1)) {
                        if (!(b3 == (byte) 61 || b3 == 10)) {
                            throw new Base64DecoderException("encoded value has invalid trailing byte");
                        }
                        if (i2 != 0) {
                            if (i2 != 1) {
                                throw new Base64DecoderException("single trailing character at offset " + (length - 1));
                            }
                            bArr2[i2] = (byte) 61;
                            i3 += Base64.m4211a(bArr2, obj2, i3, bArr);
                        }
                        obj = new byte[i3];
                        System.arraycopy(obj2, 0, obj, 0, i3);
                        return obj;
                    } else {
                        throw new Base64DecoderException("padding byte '=' falsely signals end of encoded value at offset " + i);
                    }
                } else {
                    i4 = i2 + 1;
                    bArr2[i2] = b;
                    if (i4 == 4) {
                        i2 = Base64.m4211a(bArr2, obj2, i3, bArr) + i3;
                        i4 = 0;
                    } else {
                        i2 = i3;
                    }
                }
                i++;
                i3 = i2;
                i2 = i4;
            } else {
                throw new Base64DecoderException("Bad Base64 input character at " + i + ": " + bytes[i + 0] + "(decimal)");
            }
        }
        if (i2 != 0) {
            if (i2 != 1) {
                bArr2[i2] = (byte) 61;
                i3 += Base64.m4211a(bArr2, obj2, i3, bArr);
            } else {
                throw new Base64DecoderException("single trailing character at offset " + (length - 1));
            }
        }
        obj = new byte[i3];
        System.arraycopy(obj2, 0, obj, 0, i3);
        return obj;
    }
}
