package com.jg;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;

public class Level {
    public static final int LEVEL_HIGH = 2;
    public static final int LEVEL_LOW = 0;
    public static final int LEVEL_NORMAL = 1;

    static {
        fixHelper.fixfunc(new int[]{2003, LEVEL_NORMAL});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }
}
