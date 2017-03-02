package com.ta.utdid2.android.utils;

import java.lang.reflect.Method;

public class DebugUtils {
    public static boolean DBG = false;
    private static final String PROPERTY_DEBUG = "alidebug";
    private static Class<?> mClassType;
    private static Method mGetIntMethod;
    private static Method mGetMethod;

    public static String get(String key) {
        init();
        String value = null;
        try {
            return (String) mGetMethod.invoke(mClassType, new Object[]{key});
        } catch (Exception e) {
            e.printStackTrace();
            return value;
        }
    }

    public static int getInt(String key, int def) {
        init();
        int value = def;
        try {
            value = ((Integer) mGetIntMethod.invoke(mClassType, new Object[]{key, Integer.valueOf(def)})).intValue();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }

    static {
        boolean z = true;
        if (getInt(PROPERTY_DEBUG, 0) != 1) {
            z = false;
        }
        DBG = z;
        mClassType = null;
        mGetMethod = null;
        mGetIntMethod = null;
    }

    private static void init() {
        try {
            if (mClassType == null) {
                mClassType = Class.forName("android.os.SystemProperties");
                mGetMethod = mClassType.getDeclaredMethod("get", new Class[]{String.class});
                mGetIntMethod = mClassType.getDeclaredMethod("getInt", new Class[]{String.class, Integer.TYPE});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
