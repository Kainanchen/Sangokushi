package org.cocos2dx.lib;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;

public class Cocos2dxJavascriptJavaBridge {
    static {
        fixHelper.fixfunc(new int[]{22786, 1});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public static native int evalString(String str);
}
