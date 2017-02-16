package com.facebook.common.p015f;

import android.webkit.MimeTypeMap;
import com.facebook.common.p011d.ImmutableMap;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.facebook.common.f.a */
public final class MediaUtils {
    public static final Map<String, String> f1120a;

    static {
        f1120a = ImmutableMap.m1023a("mkv", "video/x-matroska");
    }

    public static boolean m1087a(@Nullable String str) {
        return str != null && str.startsWith("video/");
    }

    @Nullable
    public static String m1088b(String str) {
        String str2;
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0 || lastIndexOf == str.length() - 1) {
            str2 = null;
        } else {
            str2 = str.substring(lastIndexOf + 1);
        }
        if (str2 == null) {
            return null;
        }
        str2 = str2.toLowerCase(Locale.US);
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str2);
        if (mimeTypeFromExtension == null) {
            return (String) f1120a.get(str2);
        }
        return mimeTypeFromExtension;
    }
}
