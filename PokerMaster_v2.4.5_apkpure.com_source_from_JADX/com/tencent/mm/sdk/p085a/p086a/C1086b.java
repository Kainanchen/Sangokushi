package com.tencent.mm.sdk.p085a.p086a;

import com.tencent.mm.p084a.C1082a;

/* renamed from: com.tencent.mm.sdk.a.a.b */
public final class C1086b {
    public static byte[] m5865a(String str, int i, String str2) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str != null) {
            stringBuffer.append(str);
        }
        stringBuffer.append(i);
        stringBuffer.append(str2);
        stringBuffer.append("mMcShCsTr");
        return C1082a.m5863a(stringBuffer.toString().substring(1, 9).getBytes()).getBytes();
    }
}
