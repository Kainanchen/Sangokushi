package org.apache.mina.filter.codec.textline;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import org.apache.mina.proxy.handlers.http.HttpProxyConstants;
import org.cocos2dx.lib.BuildConfig;

public class LineDelimiter {
    public static final LineDelimiter AUTO;
    public static final LineDelimiter CRLF;
    public static final LineDelimiter DEFAULT;
    public static final LineDelimiter MAC;
    public static final LineDelimiter NUL;
    public static final LineDelimiter UNIX;
    public static final LineDelimiter WINDOWS;
    private final String value;

    static {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new PrintWriter(byteArrayOutputStream, true).println();
        DEFAULT = new LineDelimiter(new String(byteArrayOutputStream.toByteArray()));
        AUTO = new LineDelimiter(BuildConfig.FLAVOR);
        CRLF = new LineDelimiter(HttpProxyConstants.CRLF);
        UNIX = new LineDelimiter("\n");
        WINDOWS = CRLF;
        MAC = new LineDelimiter("\r");
        NUL = new LineDelimiter("\u0000");
    }

    public LineDelimiter(String str) {
        if (str == null) {
            throw new IllegalArgumentException("delimiter");
        }
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineDelimiter)) {
            return false;
        }
        return this.value.equals(((LineDelimiter) obj).value);
    }

    public String toString() {
        if (this.value.length() == 0) {
            return "delimiter: auto";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("delimiter:");
        for (int i = 0; i < this.value.length(); i++) {
            stringBuilder.append(" 0x");
            stringBuilder.append(Integer.toHexString(this.value.charAt(i)));
        }
        return stringBuilder.toString();
    }
}
