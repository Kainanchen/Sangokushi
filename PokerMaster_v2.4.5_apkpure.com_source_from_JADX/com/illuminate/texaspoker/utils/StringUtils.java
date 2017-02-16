package com.illuminate.texaspoker.utils;

import com.illuminate.texaspoker.application.BaseApplication;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.io.UnsupportedEncodingException;
import net.a.a.a.a;
import net.a.a.a.b;
import net.a.a.a.c;
import net.a.a.d;

/* renamed from: com.illuminate.texaspoker.utils.k */
public final class StringUtils {
    public static boolean m4462a(CharSequence charSequence) {
        if (charSequence != null) {
            int length = charSequence.length();
            if (length != 0) {
                for (int i = 0; i < length; i++) {
                    if (!Character.isWhitespace(charSequence.charAt(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return true;
    }

    public static String m4461a(int i) {
        return BaseApplication.m3548a().getResources().getString(i);
    }

    public static int m4460a(String str) {
        int i = 0;
        try {
            i = new String(str.getBytes("GBK"), "iso-8859-1").length();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return i;
    }

    public static String m4463b(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        char[] toCharArray = str.toCharArray();
        b bVar = new b();
        bVar.b = a.b;
        bVar.c = c.b;
        for (int i = 0; i < toCharArray.length; i++) {
            if (toCharArray[i] > '\u0080') {
                try {
                    String[] a = d.a(toCharArray[i], bVar);
                    if (a != null) {
                        stringBuffer.append(a[0].charAt(0));
                    }
                } catch (net.a.a.a.a.a e) {
                    e.printStackTrace();
                }
            } else {
                stringBuffer.append(toCharArray[i]);
            }
        }
        CharSequence trim = stringBuffer.toString().replaceAll("\\W", LetterIndexBar.SEARCH_ICON_LETTER).trim();
        if (StringUtils.m4462a(trim) || trim.length() <= 0) {
            return "#";
        }
        return trim.substring(0, 1);
    }
}
