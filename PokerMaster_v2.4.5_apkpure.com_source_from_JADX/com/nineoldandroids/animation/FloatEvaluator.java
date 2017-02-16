package com.nineoldandroids.animation;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;

public class FloatEvaluator implements TypeEvaluator<Number> {
    static {
        fixHelper.fixfunc(new int[]{2916, 2917, 2918});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native Float evaluate(float f, Number number, Number number2);

    public native /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2);
}
