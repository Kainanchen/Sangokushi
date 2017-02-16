package org.apache.mina.core.buffer;

import org.apache.mina.proxy.handlers.http.ntlm.NTLMConstants;

class IoBufferHexDumper {
    private static final byte[] highDigits;
    private static final byte[] lowDigits;

    IoBufferHexDumper() {
    }

    static {
        byte[] bArr = new byte[]{(byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70};
        byte[] bArr2 = new byte[NTLMConstants.FLAG_UNIDENTIFIED_2];
        byte[] bArr3 = new byte[NTLMConstants.FLAG_UNIDENTIFIED_2];
        for (int i = 0; i < NTLMConstants.FLAG_UNIDENTIFIED_2; i++) {
            bArr2[i] = bArr[i >>> 4];
            bArr3[i] = bArr[i & 15];
        }
        highDigits = bArr2;
        lowDigits = bArr3;
    }

    public static String getHexdump(IoBuffer ioBuffer, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("lengthLimit: " + i + " (expected: 1+)");
        }
        Object obj;
        if (ioBuffer.remaining() > i) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj == null) {
            i = ioBuffer.remaining();
        }
        if (i == 0) {
            return "empty";
        }
        StringBuilder stringBuilder = new StringBuilder((i * 3) + 3);
        int position = ioBuffer.position();
        int i2 = ioBuffer.get() & 255;
        stringBuilder.append((char) highDigits[i2]);
        stringBuilder.append((char) lowDigits[i2]);
        for (i2 = i - 1; i2 > 0; i2--) {
            stringBuilder.append(' ');
            int i3 = ioBuffer.get() & 255;
            stringBuilder.append((char) highDigits[i3]);
            stringBuilder.append((char) lowDigits[i3]);
        }
        ioBuffer.position(position);
        if (obj != null) {
            stringBuilder.append("...");
        }
        return stringBuilder.toString();
    }
}
