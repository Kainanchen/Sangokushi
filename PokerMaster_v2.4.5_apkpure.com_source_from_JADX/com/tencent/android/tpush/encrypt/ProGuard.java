package com.tencent.android.tpush.encrypt;

import android.support.v4.view.MotionEventCompat;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.common.Constants;
import java.security.MessageDigest;

/* renamed from: com.tencent.android.tpush.encrypt.a */
public class ProGuard {
    public static String m4849a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            return ProGuard.m4850a(instance.digest());
        } catch (Throwable e) {
            com.tencent.android.tpush.p067a.ProGuard.m4716c(Constants.LogTag, "md5 encrypt:" + str, e);
            return LetterIndexBar.SEARCH_ICON_LETTER;
        } catch (Throwable e2) {
            com.tencent.android.tpush.p067a.ProGuard.m4716c(Constants.LogTag, "md5 encrypt:" + str, e2);
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
    }

    public static String m4850a(byte[] bArr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (byte b : bArr) {
            stringBuilder.append(Integer.toHexString(b & MotionEventCompat.ACTION_MASK));
        }
        return stringBuilder.toString();
    }
}
