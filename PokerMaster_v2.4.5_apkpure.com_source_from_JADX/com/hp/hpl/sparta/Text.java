package com.hp.hpl.sparta;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.io.Writer;
import java.util.Enumeration;

public class Text extends Node {
    private StringBuffer text_;

    static {
        fixHelper.fixfunc(new int[]{3043, 3044, 3045, 3046, 3047, 3048, 3049, 3050, 3051, 3052, 3053, 3054, 3055, 3056, 3057, 3058});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native Text(char c);

    public native Text(String str);

    public native void appendData(char c);

    public native void appendData(String str);

    public native void appendData(char[] cArr, int i, int i2);

    public native Object clone();

    protected native int computeHashCode();

    public native boolean equals(Object obj);

    public native String getData();

    public native void setData(String str);

    native void toString(Writer writer);

    native void toXml(Writer writer);

    public native Element xpathSelectElement(String str);

    public native Enumeration xpathSelectElements(String str);

    public native String xpathSelectString(String str);

    public native Enumeration xpathSelectStrings(String str);
}
