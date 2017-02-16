package org.apache.mina.proxy.handlers.http.ntlm;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.apache.mina.proxy.utils.ByteUtilities;

public class NTLMUtilities implements NTLMConstants {
    public static final byte[] writeSecurityBuffer(short s, int i) {
        byte[] bArr = new byte[8];
        writeSecurityBuffer(s, s, i, bArr, 0);
        return bArr;
    }

    public static final void writeSecurityBuffer(short s, short s2, int i, byte[] bArr, int i2) {
        ByteUtilities.writeShort(s, bArr, i2);
        ByteUtilities.writeShort(s2, bArr, i2 + 2);
        ByteUtilities.writeInt(i, bArr, i2 + 4);
    }

    public static final byte[] createType1Message(String str, String str2, Integer num, byte[] bArr) {
        if (bArr != null && bArr.length != 8) {
            throw new IllegalArgumentException("osVersion parameter should be a 8 byte wide array");
        } else if (str == null || str2 == null) {
            throw new IllegalArgumentException("workStation and domain must be non null");
        } else {
            int intValue = num != null ? (num.intValue() | NTLMConstants.FLAG_NEGOTIATE_WORKSTATION_SUPPLIED) | NTLMConstants.FLAG_NEGOTIATE_DOMAIN_SUPPLIED : NTLMConstants.DEFAULT_FLAGS;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(NTLM_SIGNATURE);
                byteArrayOutputStream.write(ByteUtilities.writeInt(1));
                byteArrayOutputStream.write(ByteUtilities.writeInt(intValue));
                byte[] oEMStringAsByteArray = ByteUtilities.getOEMStringAsByteArray(str2);
                byte[] oEMStringAsByteArray2 = ByteUtilities.getOEMStringAsByteArray(str);
                intValue = bArr != null ? 40 : 32;
                byteArrayOutputStream.write(writeSecurityBuffer((short) oEMStringAsByteArray.length, oEMStringAsByteArray2.length + intValue));
                byteArrayOutputStream.write(writeSecurityBuffer((short) oEMStringAsByteArray2.length, intValue));
                if (bArr != null) {
                    byteArrayOutputStream.write(bArr);
                }
                byteArrayOutputStream.write(oEMStringAsByteArray2);
                byteArrayOutputStream.write(oEMStringAsByteArray);
                byte[] toByteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return toByteArray;
            } catch (IOException e) {
                return null;
            }
        }
    }

    public static final int writeSecurityBufferAndUpdatePointer(ByteArrayOutputStream byteArrayOutputStream, short s, int i) {
        byteArrayOutputStream.write(writeSecurityBuffer(s, i));
        return i + s;
    }

    public static final byte[] extractChallengeFromType2Message(byte[] bArr) {
        Object obj = new byte[8];
        System.arraycopy(bArr, 24, obj, 0, 8);
        return obj;
    }

    public static final int extractFlagsFromType2Message(byte[] bArr) {
        Object obj = new byte[4];
        System.arraycopy(bArr, 20, obj, 0, 4);
        ByteUtilities.changeWordEndianess(obj, 0, 4);
        return ByteUtilities.makeIntFromByte4(obj);
    }

    public static final byte[] createType3Message(String str, String str2, byte[] bArr, String str3, String str4, Integer num, byte[] bArr2) {
        if (bArr == null || bArr.length != 8) {
            throw new IllegalArgumentException("challenge[] should be a 8 byte wide array");
        } else if (bArr2 == null || bArr2.length == 8) {
            int intValue = num != null ? num.intValue() : NTLMConstants.DEFAULT_FLAGS;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(NTLM_SIGNATURE);
                byteArrayOutputStream.write(ByteUtilities.writeInt(3));
                byte[] lMResponse = NTLMResponses.getLMResponse(str2, bArr);
                byte[] nTLMResponse = NTLMResponses.getNTLMResponse(str2, bArr);
                boolean isFlagSet = ByteUtilities.isFlagSet(intValue, 1);
                byte[] encodeString = ByteUtilities.encodeString(str3, isFlagSet);
                byte[] encodeString2 = ByteUtilities.encodeString(str, isFlagSet);
                byte[] encodeString3 = ByteUtilities.encodeString(str4, isFlagSet);
                int i = bArr2 != null ? 72 : 64;
                writeSecurityBufferAndUpdatePointer(byteArrayOutputStream, (short) nTLMResponse.length, writeSecurityBufferAndUpdatePointer(byteArrayOutputStream, (short) lMResponse.length, ((encodeString.length + i) + encodeString2.length) + encodeString3.length));
                writeSecurityBufferAndUpdatePointer(byteArrayOutputStream, (short) encodeString3.length, writeSecurityBufferAndUpdatePointer(byteArrayOutputStream, (short) encodeString2.length, writeSecurityBufferAndUpdatePointer(byteArrayOutputStream, (short) encodeString.length, i)));
                byteArrayOutputStream.write(new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) -102, (byte) 0, (byte) 0, (byte) 0});
                byteArrayOutputStream.write(ByteUtilities.writeInt(intValue));
                if (bArr2 != null) {
                    byteArrayOutputStream.write(bArr2);
                }
                byteArrayOutputStream.write(encodeString);
                byteArrayOutputStream.write(encodeString2);
                byteArrayOutputStream.write(encodeString3);
                byteArrayOutputStream.write(lMResponse);
                byteArrayOutputStream.write(nTLMResponse);
                byte[] toByteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return toByteArray;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } else {
            throw new IllegalArgumentException("osVersion should be a 8 byte wide array");
        }
    }
}
