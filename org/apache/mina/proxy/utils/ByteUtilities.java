package org.apache.mina.proxy.utils;

public class ByteUtilities {
    public static byte[] intToNetworkByteOrder(int i, int i2) {
        byte[] bArr = new byte[i2];
        intToNetworkByteOrder(i, bArr, 0, i2);
        return bArr;
    }

    public static void intToNetworkByteOrder(int i, byte[] bArr, int i2, int i3) {
        if (i3 > 4) {
            throw new IllegalArgumentException("Cannot handle more than 4 bytes");
        }
        for (int i4 = i3 - 1; i4 >= 0; i4--) {
            bArr[i2 + i4] = (byte) (i & 255);
            i >>>= 8;
        }
    }

    public static final byte[] writeShort(short s, byte[] bArr, int i) {
        bArr[i] = (byte) s;
        bArr[i + 1] = (byte) (s >> 8);
        return bArr;
    }

    public static final byte[] writeInt(int i) {
        return writeInt(i, new byte[4], 0);
    }

    public static final byte[] writeInt(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        return bArr;
    }

    public static final void changeWordEndianess(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3 += 4) {
            byte b = bArr[i3];
            bArr[i3] = bArr[i3 + 3];
            bArr[i3 + 3] = b;
            b = bArr[i3 + 1];
            bArr[i3 + 1] = bArr[i3 + 2];
            bArr[i3 + 2] = b;
        }
    }

    public static final byte[] getOEMStringAsByteArray(String str) {
        return str.getBytes("ASCII");
    }

    public static final byte[] getUTFStringAsByteArray(String str) {
        return str.getBytes("UTF-16LE");
    }

    public static final byte[] encodeString(String str, boolean z) {
        if (z) {
            return getUTFStringAsByteArray(str);
        }
        return getOEMStringAsByteArray(str);
    }

    public static String asHex(byte[] bArr) {
        return asHex(bArr, null);
    }

    public static String asHex(byte[] bArr, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < bArr.length) {
            String toHexString = Integer.toHexString(bArr[i] & 255);
            if ((bArr[i] & 255) < 16) {
                stringBuilder.append('0');
            }
            stringBuilder.append(toHexString);
            if (str != null && i < bArr.length - 1) {
                stringBuilder.append(str);
            }
            i++;
        }
        return stringBuilder.toString();
    }

    public static final int makeIntFromByte4(byte[] bArr) {
        return makeIntFromByte4(bArr, 0);
    }

    public static final int makeIntFromByte4(byte[] bArr, int i) {
        return (((bArr[i] << 24) | ((bArr[i + 1] & 255) << 16)) | ((bArr[i + 2] & 255) << 8)) | (bArr[i + 3] & 255);
    }

    public static final int makeIntFromByte2(byte[] bArr) {
        return makeIntFromByte2(bArr, 0);
    }

    public static final int makeIntFromByte2(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 8) | (bArr[i + 1] & 255);
    }

    public static final boolean isFlagSet(int i, int i2) {
        return (i & i2) > 0;
    }
}
