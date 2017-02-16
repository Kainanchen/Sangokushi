package com.facebook.common.p014e;

import android.support.v4.os.EnvironmentCompat;
import android.util.Log;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: com.facebook.common.e.b */
public final class FLogDefaultLoggingDelegate implements LoggingDelegate {
    public static final FLogDefaultLoggingDelegate f1117a;
    private String f1118b;
    private int f1119c;

    static {
        f1117a = new FLogDefaultLoggingDelegate();
    }

    public static FLogDefaultLoggingDelegate m1073a() {
        return f1117a;
    }

    private FLogDefaultLoggingDelegate() {
        this.f1118b = EnvironmentCompat.MEDIA_UNKNOWN;
        this.f1119c = 5;
    }

    public final boolean m1079a(int i) {
        return this.f1119c <= i;
    }

    public final void m1077a(String str, String str2) {
        m1075a(2, str, str2);
    }

    public final void m1080b(String str, String str2) {
        m1075a(3, str, str2);
    }

    public final void m1082c(String str, String str2) {
        m1075a(4, str, str2);
    }

    public final void m1084d(String str, String str2) {
        m1075a(5, str, str2);
    }

    public final void m1078a(String str, String str2, Throwable th) {
        m1076a(5, str, str2, th);
    }

    public final void m1085e(String str, String str2) {
        m1075a(6, str, str2);
    }

    public final void m1081b(String str, String str2, Throwable th) {
        m1076a(6, str, str2, th);
    }

    public final void m1086f(String str, String str2) {
        m1075a(6, str, str2);
    }

    public final void m1083c(String str, String str2, Throwable th) {
        m1076a(6, str, str2, th);
    }

    private void m1075a(int i, String str, String str2) {
        Log.println(i, m1074a(str), str2);
    }

    private void m1076a(int i, String str, String str2, Throwable th) {
        String str3;
        String a = m1074a(str);
        StringBuilder append = new StringBuilder().append(str2).append('\n');
        if (th == null) {
            str3 = LetterIndexBar.SEARCH_ICON_LETTER;
        } else {
            Writer stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            str3 = stringWriter.toString();
        }
        Log.println(i, a, append.append(str3).toString());
    }

    private String m1074a(String str) {
        if (this.f1118b != null) {
            return this.f1118b + ":" + str;
        }
        return str;
    }
}
