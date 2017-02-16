package org.p005a.p006a.p009c;

import org.p005a.p006a.DaoException;
import org.p005a.p006a.Property;

/* renamed from: org.a.a.c.d */
public final class SqlUtils {
    private static final char[] f425a;

    static {
        f425a = "0123456789ABCDEF".toCharArray();
    }

    public static StringBuilder m488a(StringBuilder stringBuilder, String str, Property property) {
        if (str != null) {
            stringBuilder.append(str).append('.');
        }
        stringBuilder.append('\"').append(property.f482e).append('\"');
        return stringBuilder;
    }

    private static StringBuilder m487a(StringBuilder stringBuilder, String str, String str2) {
        stringBuilder.append(str).append(".\"").append(str2).append('\"');
        return stringBuilder;
    }

    public static StringBuilder m489a(StringBuilder stringBuilder, String str, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            SqlUtils.m487a(stringBuilder, str, strArr[i]);
            if (i < length - 1) {
                stringBuilder.append(',');
            }
        }
        return stringBuilder;
    }

    private static StringBuilder m490a(StringBuilder stringBuilder, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            stringBuilder.append('\"').append(strArr[i]).append('\"');
            if (i < length - 1) {
                stringBuilder.append(',');
            }
        }
        return stringBuilder;
    }

    private static StringBuilder m486a(StringBuilder stringBuilder, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < i - 1) {
                stringBuilder.append("?,");
            } else {
                stringBuilder.append('?');
            }
        }
        return stringBuilder;
    }

    public static StringBuilder m491b(StringBuilder stringBuilder, String str, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            SqlUtils.m487a(stringBuilder, str, strArr[i]).append("=?");
            if (i < strArr.length - 1) {
                stringBuilder.append(',');
            }
        }
        return stringBuilder;
    }

    public static String m483a(String str, String str2, String[] strArr) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.append('\"').append(str2).append('\"').append(" (");
        SqlUtils.m490a(stringBuilder, strArr);
        stringBuilder.append(") VALUES (");
        SqlUtils.m486a(stringBuilder, strArr.length);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public static String m484a(String str, String str2, String[] strArr, boolean z) {
        if (str2 == null || str2.length() < 0) {
            throw new DaoException("Table alias required");
        }
        StringBuilder stringBuilder = new StringBuilder(z ? "SELECT DISTINCT " : "SELECT ");
        SqlUtils.m489a(stringBuilder, str2, strArr).append(" FROM ");
        stringBuilder.append('\"').append(str).append('\"').append(' ').append(str2).append(' ');
        return stringBuilder.toString();
    }

    public static String m482a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder("SELECT COUNT(*) FROM ");
        stringBuilder.append('\"').append(str).append('\"').append(' ');
        if (str2 != null) {
            stringBuilder.append(str2).append(' ');
        }
        return stringBuilder.toString();
    }

    public static String m485a(String str, String[] strArr) {
        String str2 = "\"" + str + '\"';
        StringBuilder stringBuilder = new StringBuilder("DELETE FROM ");
        stringBuilder.append(str2);
        if (strArr != null && strArr.length > 0) {
            stringBuilder.append(" WHERE ");
            SqlUtils.m491b(stringBuilder, str2, strArr);
        }
        return stringBuilder.toString();
    }
}
