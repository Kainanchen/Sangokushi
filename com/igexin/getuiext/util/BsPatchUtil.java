package com.igexin.getuiext.util;

public class BsPatchUtil {
    static {
        try {
            System.loadLibrary("getuiext");
        } catch (Exception e) {
        }
    }

    private native int bsPatch(String str, String str2, String str3);

    public int m1089a(String str, String str2, String str3) {
        try {
            return bsPatch(str, str2, str3);
        } catch (Exception e) {
            return -1;
        }
    }
}
