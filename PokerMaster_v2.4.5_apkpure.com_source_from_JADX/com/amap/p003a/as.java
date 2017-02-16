package com.amap.p003a;

import com.amap.p003a.ad.DiskLruCache;
import java.io.InputStream;

/* compiled from: Utils */
/* renamed from: com.amap.a.as */
public final class as {
    static byte[] m197a(ad adVar, String str) {
        Throwable th;
        Throwable th2;
        InputStream inputStream = null;
        InputStream inputStream2 = null;
        byte[] bArr = new byte[0];
        DiskLruCache a;
        try {
            a = adVar.m138a(str);
            if (a == null) {
                if (inputStream != null) {
                    try {
                        inputStream2.close();
                    } catch (Throwable th3) {
                        th3.printStackTrace();
                    }
                }
                if (a != null) {
                    try {
                        a.close();
                    } catch (Throwable th4) {
                        th3 = th4;
                        th3.printStackTrace();
                        return bArr;
                    }
                }
                return bArr;
            }
            try {
                inputStream = a.f140a[0];
                if (inputStream == null) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th32) {
                            th32.printStackTrace();
                        }
                    }
                    if (a != null) {
                        try {
                            a.close();
                        } catch (Throwable th5) {
                            th32 = th5;
                            th32.printStackTrace();
                            return bArr;
                        }
                    }
                    return bArr;
                }
                bArr = new byte[inputStream.available()];
                inputStream.read(bArr);
                adVar.m142c(str);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th322) {
                        th322.printStackTrace();
                    }
                }
                if (a != null) {
                    try {
                        a.close();
                    } catch (Throwable th6) {
                        th322 = th6;
                        th322.printStackTrace();
                        return bArr;
                    }
                }
                return bArr;
            } catch (Throwable th7) {
                th322 = th7;
                try {
                    cm.m637a(th322, "Utils", "readSingleLog");
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th3222) {
                            th3222.printStackTrace();
                        }
                    }
                    if (a != null) {
                        try {
                            a.close();
                        } catch (Throwable th8) {
                            th3222 = th8;
                            th3222.printStackTrace();
                            return bArr;
                        }
                    }
                    return bArr;
                } catch (Throwable th9) {
                    th2 = th9;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th32222) {
                            th32222.printStackTrace();
                        }
                    }
                    if (a != null) {
                        try {
                            a.close();
                        } catch (Throwable th322222) {
                            th322222.printStackTrace();
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th10) {
            th2 = th10;
            a = inputStream;
            if (inputStream != null) {
                inputStream.close();
            }
            if (a != null) {
                a.close();
            }
            throw th2;
        }
    }
}
