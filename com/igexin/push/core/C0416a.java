package com.igexin.push.core;

import android.os.Environment;

/* renamed from: com.igexin.push.core.a */
public class C0416a {
    public static final String f1070a;
    public static final String f1071b;
    public static int f1072c;
    public static int f1073d;
    public static int f1074e;
    public static int f1075f;
    public static int f1076g;
    public static int f1077h;
    public static int f1078i;
    public static int f1079j;
    public static int f1080k;
    public static int f1081l;
    public static int f1082m;
    public static String f1083n;
    public static String f1084o;
    public static String f1085p;

    static {
        f1070a = Environment.getExternalStorageDirectory() + "/Sdk/ImgCache/";
        f1071b = Environment.getExternalStorageDirectory() + "/Sdk/WebCache/";
        f1072c = 0;
        f1073d = 1;
        f1074e = 2;
        f1075f = 3;
        f1076g = 4;
        f1077h = 5;
        f1078i = 6;
        f1079j = 7;
        f1080k = 0;
        f1081l = 1;
        f1082m = 2;
        f1083n = "com.igexin.sdk.PushService";
        f1084o = "com.igexin.sdk.coordinator.SdkMsgService";
        f1085p = "com.igexin.sdk.coordinator.GexinMsgService";
    }
}
