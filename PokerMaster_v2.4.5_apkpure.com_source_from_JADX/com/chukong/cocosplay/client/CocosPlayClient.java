package com.chukong.cocosplay.client;

import android.app.Activity;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;

public class CocosPlayClient {
    public static native String[] getSearchPaths();

    public static boolean init(Activity activity, boolean z) {
        return false;
    }

    public static boolean isEnabled() {
        return false;
    }

    public static boolean isDemo() {
        return false;
    }

    public static boolean isNotifyFileLoadedEnabled() {
        return false;
    }

    public static void notifyFileLoaded(String str) {
    }

    public static void updateAssets(String str) {
    }

    public static String getGameRoot() {
        return LetterIndexBar.SEARCH_ICON_LETTER;
    }
}
