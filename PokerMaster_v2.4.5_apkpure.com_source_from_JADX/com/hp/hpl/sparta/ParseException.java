package com.hp.hpl.sparta;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;

public class ParseException extends Exception {
    private Throwable cause_;
    private int lineNumber_;

    static {
        fixHelper.fixfunc(new int[]{2840, 2841, 2842, 2843, 2844, 2845, 2846, 2847, 2848, 2849, 2850, 2851});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native ParseException(ParseCharStream parseCharStream, char c, char c2);

    public native ParseException(ParseCharStream parseCharStream, char c, String str);

    public native ParseException(ParseCharStream parseCharStream, char c, char[] cArr);

    public native ParseException(ParseCharStream parseCharStream, String str);

    public native ParseException(ParseCharStream parseCharStream, String str, String str2);

    public native ParseException(ParseCharStream parseCharStream, String str, char[] cArr);

    public native ParseException(ParseLog parseLog, String str, int i, int i2, String str2, String str3);

    public native ParseException(String str);

    public native ParseException(String str, int i, int i2, String str2, String str3);

    public native ParseException(String str, Throwable th);

    static String charRepr(int i) {
        return i == -1 ? "EOF" : new StringBuffer().append((char) i).toString();
    }

    private static String toMessage(String str, int i, int i2, String str2, String str3) {
        return new StringBuffer().append(str).append("(").append(i).append("): \n").append(str2).append("\nLast character read was '").append(charRepr(i2)).append("'\n").append(str3).toString();
    }

    private static String toString(char[] cArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(cArr[0]);
        for (int i = 1; i < cArr.length; i++) {
            stringBuffer.append(new StringBuffer("or ").append(cArr[i]).toString());
        }
        return stringBuffer.toString();
    }

    public native Throwable getCause();

    public native int getLineNumber();
}
