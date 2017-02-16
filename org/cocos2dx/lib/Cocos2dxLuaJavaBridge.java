package org.cocos2dx.lib;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;

public class Cocos2dxLuaJavaBridge {
    static {
        fixHelper.fixfunc(new int[]{16328, 1});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public static native int callLuaFunctionWithString(int i, String str);

    public static native int callLuaGlobalFunctionWithString(String str, String str2);

    public static native int releaseLuaFunction(int i);

    public static native int retainLuaFunction(int i);
}
