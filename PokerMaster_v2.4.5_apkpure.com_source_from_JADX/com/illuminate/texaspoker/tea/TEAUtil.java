package com.illuminate.texaspoker.tea;

public class TEAUtil {
    private static TEAUtil f6564a;

    public native byte[] decode(String str, byte[] bArr, Object obj);

    public native byte[] encode(String str, byte[] bArr, Object obj);

    public native String getDbKey();

    public static TEAUtil m4068a() {
        if (f6564a == null) {
            f6564a = new TEAUtil();
        }
        return f6564a;
    }
}
