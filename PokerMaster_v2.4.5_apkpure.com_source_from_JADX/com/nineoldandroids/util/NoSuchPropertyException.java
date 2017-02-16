package com.nineoldandroids.util;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;

public class NoSuchPropertyException extends RuntimeException {
    static {
        fixHelper.fixfunc(new int[]{48, 1});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native NoSuchPropertyException(String str);
}
