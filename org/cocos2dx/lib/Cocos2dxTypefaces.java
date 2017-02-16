package org.cocos2dx.lib;

import a.does.not.Exists0;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.util.HashMap;

public class Cocos2dxTypefaces {
    private static final HashMap<String, Typeface> sTypefaceCache = null;

    static {
        fixHelper.fixfunc(new int[]{31459, 1});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    static void __clinit__() {
        sTypefaceCache = new HashMap();
    }

    public static synchronized Typeface get(Context context, String str) {
        Typeface typeface;
        synchronized (Cocos2dxTypefaces.class) {
            if (!sTypefaceCache.containsKey(str)) {
                Object createFromFile;
                if (str.startsWith("/")) {
                    createFromFile = Typeface.createFromFile(str);
                } else {
                    createFromFile = Typeface.createFromAsset(context.getAssets(), str);
                }
                sTypefaceCache.put(str, createFromFile);
            }
            typeface = (Typeface) sTypefaceCache.get(str);
        }
        return typeface;
    }
}
