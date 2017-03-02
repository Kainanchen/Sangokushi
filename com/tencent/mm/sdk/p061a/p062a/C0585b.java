package com.tencent.mm.sdk.p061a.p062a;

import com.tencent.mm.p060a.C0581a;

/* renamed from: com.tencent.mm.sdk.a.a.b */
public final class C0585b {
    public static byte[] m2009a(String str, int i, String str2) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str != null) {
            stringBuffer.append(str);
        }
        stringBuffer.append(i);
        stringBuffer.append(str2);
        stringBuffer.append("mMcShCsTr");
        return C0581a.m2007c(stringBuffer.toString().substring(1, 9).getBytes()).getBytes();
    }
}
