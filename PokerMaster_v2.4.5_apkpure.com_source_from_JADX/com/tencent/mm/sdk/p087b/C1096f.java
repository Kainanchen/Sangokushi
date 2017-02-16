package com.tencent.mm.sdk.p087b;

import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.mm.sdk.constants.ConstantsAPI.WXApp;

/* renamed from: com.tencent.mm.sdk.b.f */
public final class C1096f {
    public final String toString() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        if (stackTrace == null || stackTrace.length < 4) {
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int i = 3;
        while (i < stackTrace.length) {
            if (stackTrace[i].getClassName().contains(WXApp.WXAPP_PACKAGE_NAME) && !stackTrace[i].getClassName().contains("sdk.platformtools.Log")) {
                stringBuilder.append("[");
                stringBuilder.append(stackTrace[i].getClassName().substring(15));
                stringBuilder.append(":");
                stringBuilder.append(stackTrace[i].getMethodName());
                stringBuilder.append("(" + stackTrace[i].getLineNumber() + ")]");
            }
            i++;
        }
        return stringBuilder.toString();
    }
}
