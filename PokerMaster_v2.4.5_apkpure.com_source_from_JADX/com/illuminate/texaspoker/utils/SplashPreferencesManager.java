package com.illuminate.texaspoker.utils;

import android.content.SharedPreferences.Editor;
import com.illuminate.texaspoker.application.BaseApplication;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;

/* renamed from: com.illuminate.texaspoker.utils.j */
public final class SplashPreferencesManager {
    private static String f6751a;
    private static String f6752b;
    private static String f6753c;
    private static String f6754d;
    private static String f6755e;
    private static String f6756f;
    private static String f6757g;
    private static String f6758h;
    private static String f6759i;
    private static String f6760j;
    private static String f6761k;

    static {
        f6751a = "SPLASH_DATA";
        f6752b = "SPLASH_PAGE_ID";
        f6753c = "SPLASH_URL";
        f6754d = "SPLASH_BEGIN_TIME";
        f6755e = "SPLASH_END_TIME";
        f6756f = "SPLASH_DURATION";
        f6757g = "SPLASH_ACT_TYPE";
        f6758h = "SPLASH_JUMP_URL";
        f6759i = "SPLASH_NATIVE_EXTRA";
        f6760j = "SPLASH_LAST_SHOW_DATE";
        f6761k = "FESTIVAL_MODE";
    }

    private static long m4456d(String str) {
        return BaseApplication.m3548a().getSharedPreferences(f6751a, 0).getLong(str, 0);
    }

    private static void m4445a(String str, long j) {
        Editor edit = BaseApplication.m3548a().getSharedPreferences(f6751a, 0).edit();
        edit.putLong(str, j);
        edit.apply();
    }

    private static void m4444a(String str, int i) {
        Editor edit = BaseApplication.m3548a().getSharedPreferences(f6751a, 0).edit();
        edit.putInt(str, i);
        edit.apply();
    }

    private static void m4446a(String str, String str2) {
        Editor edit = BaseApplication.m3548a().getSharedPreferences(f6751a, 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static void m4442a(long j) {
        SplashPreferencesManager.m4445a(f6752b, j);
    }

    public static String m4440a() {
        return BaseApplication.m3548a().getSharedPreferences(f6751a, 0).getString(f6753c, LetterIndexBar.SEARCH_ICON_LETTER);
    }

    public static void m4443a(String str) {
        SplashPreferencesManager.m4446a(f6753c, str);
    }

    public static long m4448b() {
        return SplashPreferencesManager.m4456d(f6754d);
    }

    public static void m4450b(long j) {
        SplashPreferencesManager.m4445a(f6754d, j);
    }

    public static long m4452c() {
        return SplashPreferencesManager.m4456d(f6755e);
    }

    public static void m4453c(long j) {
        SplashPreferencesManager.m4445a(f6755e, j);
    }

    public static int m4455d() {
        return BaseApplication.m3548a().getSharedPreferences(f6751a, 0).getInt(f6756f, 0);
    }

    public static void m4441a(int i) {
        SplashPreferencesManager.m4444a(f6756f, i);
    }

    public static void m4449b(int i) {
        SplashPreferencesManager.m4444a(f6757g, i);
    }

    public static void m4451b(String str) {
        SplashPreferencesManager.m4446a(f6758h, str);
    }

    public static void m4454c(String str) {
        SplashPreferencesManager.m4446a(f6759i, str);
    }

    public static long m4458e() {
        return SplashPreferencesManager.m4456d(f6760j);
    }

    public static void m4457d(long j) {
        SplashPreferencesManager.m4445a(f6760j, j);
    }

    public static boolean m4459f() {
        return BaseApplication.m3548a().getSharedPreferences(f6751a, 0).getBoolean(f6761k, false);
    }

    public static void m4447a(boolean z) {
        String str = f6761k;
        Editor edit = BaseApplication.m3548a().getSharedPreferences(f6751a, 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }
}
