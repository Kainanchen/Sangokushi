package com.alipay.p011b.p012a.p013a.p020d;

import com.alipay.p011b.p012a.p013a.p014a.C0110a;
import com.tencent.connect.common.Constants;
import java.io.File;

/* renamed from: com.alipay.b.a.a.d.a */
public final class C0125a {
    public static String m340a(String str) {
        String str2 = Constants.STR_EMPTY;
        try {
            str2 = System.getProperty(str);
        } catch (Throwable th) {
        }
        return C0110a.m234a(str2) ? C0126b.m341a(".SystemConfig" + File.separator + str) : str2;
    }
}
