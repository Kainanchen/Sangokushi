package com.ta.utdid2.android.utils;

import android.annotation.TargetApi;
import android.util.Base64;

public class Base64Helper {
    @TargetApi(8)
    public static String encodeToString(byte[] input, int flags) {
        return Base64.encodeToString(input, flags);
    }
}
