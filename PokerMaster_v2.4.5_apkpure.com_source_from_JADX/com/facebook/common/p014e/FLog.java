package com.facebook.common.p014e;

/* renamed from: com.facebook.common.e.a */
public final class FLog {
    private static LoggingDelegate f1116a;

    static {
        f1116a = FLogDefaultLoggingDelegate.m1073a();
    }

    public static boolean m1051a(int i) {
        return f1116a.m1065a(i);
    }

    public static void m1040a(Class<?> cls, String str) {
        if (f1116a.m1065a(2)) {
            f1116a.m1063a(cls.getSimpleName(), str);
        }
    }

    public static void m1041a(Class<?> cls, String str, Object obj) {
        if (f1116a.m1065a(2)) {
            f1116a.m1063a(cls.getSimpleName(), String.format(null, str, new Object[]{obj}));
        }
    }

    public static void m1042a(Class<?> cls, String str, Object obj, Object obj2) {
        if (f1116a.m1065a(2)) {
            f1116a.m1063a(cls.getSimpleName(), String.format(null, str, new Object[]{obj, obj2}));
        }
    }

    public static void m1043a(Class<?> cls, String str, Object obj, Object obj2, Object obj3) {
        if (FLog.m1051a(2)) {
            FLog.m1040a((Class) cls, String.format(null, str, new Object[]{obj, obj2, obj3}));
        }
    }

    public static void m1044a(Class<?> cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (f1116a.m1065a(2)) {
            f1116a.m1063a(cls.getSimpleName(), String.format(null, str, new Object[]{obj, obj2, obj3, obj4}));
        }
    }

    public static void m1050a(String str, String str2, Object... objArr) {
        if (f1116a.m1065a(2)) {
            f1116a.m1063a(str, String.format(null, str2, objArr));
        }
    }

    public static void m1046a(Class<?> cls, String str, Object... objArr) {
        if (f1116a.m1065a(2)) {
            f1116a.m1063a(cls.getSimpleName(), String.format(null, str, objArr));
        }
    }

    public static void m1053b(Class<?> cls, String str, Object obj) {
        if (f1116a.m1065a(3)) {
            f1116a.m1066b(cls.getSimpleName(), String.format(null, str, new Object[]{obj}));
        }
    }

    public static void m1052b(Class<?> cls, String str) {
        if (f1116a.m1065a(4)) {
            f1116a.m1068c(cls.getSimpleName(), str);
        }
    }

    public static void m1058c(Class<?> cls, String str) {
        if (f1116a.m1065a(5)) {
            f1116a.m1070d(cls.getSimpleName(), str);
        }
    }

    public static void m1057b(String str, String str2, Object... objArr) {
        if (f1116a.m1065a(5)) {
            f1116a.m1070d(str, String.format(null, str2, objArr));
        }
    }

    public static void m1055b(Class<?> cls, String str, Object... objArr) {
        if (f1116a.m1065a(5)) {
            f1116a.m1070d(cls.getSimpleName(), String.format(null, str, objArr));
        }
    }

    public static void m1047a(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (FLog.m1051a(5)) {
            String format = String.format(null, str, objArr);
            if (f1116a.m1065a(5)) {
                f1116a.m1064a(cls.getSimpleName(), format, th);
            }
        }
    }

    public static void m1048a(String str, String str2) {
        if (f1116a.m1065a(6)) {
            f1116a.m1071e(str, str2);
        }
    }

    public static void m1061d(Class<?> cls, String str) {
        if (f1116a.m1065a(6)) {
            f1116a.m1071e(cls.getSimpleName(), str);
        }
    }

    public static void m1059c(Class<?> cls, String str, Object... objArr) {
        if (f1116a.m1065a(6)) {
            f1116a.m1071e(cls.getSimpleName(), String.format(null, str, objArr));
        }
    }

    public static void m1056b(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (f1116a.m1065a(6)) {
            f1116a.m1067b(cls.getSimpleName(), String.format(null, str, objArr), th);
        }
    }

    public static void m1049a(String str, String str2, Throwable th) {
        if (f1116a.m1065a(6)) {
            f1116a.m1067b(str, str2, th);
        }
    }

    public static void m1045a(Class<?> cls, String str, Throwable th) {
        if (f1116a.m1065a(6)) {
            f1116a.m1067b(cls.getSimpleName(), str, th);
        }
    }

    public static void m1060c(String str, String str2, Object... objArr) {
        if (f1116a.m1065a(6)) {
            f1116a.m1072f(str, String.format(null, str2, objArr));
        }
    }

    public static void m1062d(Class<?> cls, String str, Object... objArr) {
        if (f1116a.m1065a(6)) {
            f1116a.m1072f(cls.getSimpleName(), String.format(null, str, objArr));
        }
    }

    public static void m1054b(Class<?> cls, String str, Throwable th) {
        if (f1116a.m1065a(6)) {
            f1116a.m1069c(cls.getSimpleName(), str, th);
        }
    }
}
