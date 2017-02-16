package com.nineoldandroids.animation;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;

public class ArgbEvaluator implements TypeEvaluator {
    static {
        fixHelper.fixfunc(new int[]{2714, 2715});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native Object evaluate(float f, Object obj, Object obj2);
}
