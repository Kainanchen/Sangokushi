package com.tencent.open.utils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Properties;
import java.util.zip.ZipException;

/* compiled from: ProGuard */
public final class ApkExternalInfoTool {
    public static final String CHANNELID = "channelNo";
    private static final ZipLong f1699a;
    private static final ZipShort f1700b;

    /* compiled from: ProGuard */
    private static class ApkExternalInfo {
        Properties f1697a;
        byte[] f1698b;

        private ApkExternalInfo() {
            this.f1697a = new Properties();
        }

        void m2169a(byte[] bArr) throws IOException {
            if (bArr != null) {
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                int length = ApkExternalInfoTool.f1700b.getBytes().length;
                byte[] bArr2 = new byte[length];
                wrap.get(bArr2);
                if (!ApkExternalInfoTool.f1700b.equals(new ZipShort(bArr2))) {
                    throw new ProtocolException("unknow protocl [" + Arrays.toString(bArr) + "]");
                } else if (bArr.length - length > 2) {
                    bArr2 = new byte[2];
                    wrap.get(bArr2);
                    int value = new ZipShort(bArr2).getValue();
                    if ((bArr.length - length) - 2 >= value) {
                        byte[] bArr3 = new byte[value];
                        wrap.get(bArr3);
                        this.f1697a.load(new ByteArrayInputStream(bArr3));
                        length = ((bArr.length - length) - value) - 2;
                        if (length > 0) {
                            this.f1698b = new byte[length];
                            wrap.get(this.f1698b);
                        }
                    }
                }
            }
        }

        public String toString() {
            return "ApkExternalInfo [p=" + this.f1697a + ", otherData=" + Arrays.toString(this.f1698b) + "]";
        }
    }

    static {
        f1699a = new ZipLong(101010256);
        f1700b = new ZipShort(38651);
    }

    public static String read(File file, String str) throws IOException {
        RandomAccessFile randomAccessFile;
        Throwable th;
        String str2 = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                byte[] a = m2171a(randomAccessFile);
                if (a != null) {
                    ApkExternalInfo apkExternalInfo = new ApkExternalInfo();
                    apkExternalInfo.m2169a(a);
                    str2 = apkExternalInfo.f1697a.getProperty(str);
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                } else if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                return str2;
            } catch (Throwable th2) {
                th = th2;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            Throwable th4 = th3;
            randomAccessFile = null;
            th = th4;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            throw th;
        }
    }

    public static String readChannelId(File file) throws IOException {
        return read(file, CHANNELID);
    }

    private static byte[] m2171a(RandomAccessFile randomAccessFile) throws IOException {
        int i = 1;
        long length = randomAccessFile.length() - 22;
        randomAccessFile.seek(length);
        byte[] bytes = f1699a.getBytes();
        byte read = randomAccessFile.read();
        while (read != (byte) -1) {
            if (read == bytes[0] && randomAccessFile.read() == bytes[1] && randomAccessFile.read() == bytes[2] && randomAccessFile.read() == bytes[3]) {
                break;
            }
            length--;
            randomAccessFile.seek(length);
            read = randomAccessFile.read();
        }
        i = 0;
        if (i == 0) {
            throw new ZipException("archive is not a ZIP archive");
        }
        randomAccessFile.seek((16 + length) + 4);
        byte[] bArr = new byte[2];
        randomAccessFile.readFully(bArr);
        i = new ZipShort(bArr).getValue();
        if (i == 0) {
            return null;
        }
        bArr = new byte[i];
        randomAccessFile.read(bArr);
        return bArr;
    }
}
