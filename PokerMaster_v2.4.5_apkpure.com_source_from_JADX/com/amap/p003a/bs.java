package com.amap.p003a;

import android.content.Context;

/* compiled from: RollBackDynamic */
/* renamed from: com.amap.a.bs */
public final class bs {
    static boolean f500a;
    static boolean f501b;
    static boolean f502c;
    static boolean f503d;
    static int f504e;
    static int f505f;
    static boolean f506g;
    static boolean f507h;

    static {
        f500a = false;
        f501b = false;
        f502c = false;
        f503d = false;
        f504e = 0;
        f505f = 0;
        f506g = true;
        f507h = false;
    }

    public static void m441a(Context context) {
        try {
            if (f502c && !f500a) {
                bt.m451a(context, "loc", "startMark", bt.m455b(context, "loc", "startMark") + 1);
                f500a = true;
            }
        } catch (Throwable th) {
            bc.m330a(th, "RollBackDynamic", "AddStartMark");
        }
    }

    private static void m442a(Context context, int i) {
        try {
            if (f502c) {
                bt.m451a(context, "loc", "endMark", i);
                bt.m451a(context, "loc", "startMark", i);
            }
        } catch (Throwable th) {
            bc.m330a(th, "RollBackDynamic", "resetMark");
        }
    }

    public static void m443a(Context context, cj cjVar) {
        if (!f503d) {
            f502c = InstanceFactory.m722a(context, cjVar);
            f503d = true;
            if (!f502c && bc.m336c()) {
                InstanceFactory.m721a(context, "loc");
                br.m437a("dexrollbackstatistics", "RollBack because of version error");
            }
        }
    }

    public static void m444a(Context context, String str, String str2) {
        try {
            InstanceFactory.m721a(context, str);
            br.m437a("dexrollbackstatistics", "RollBack because of " + str2);
        } catch (Throwable th) {
            bc.m330a(th, "RollBackDynamic", "rollBackDynamicFile");
        }
    }

    public static void m445b(Context context) {
        try {
            if (!f503d) {
                bs.m443a(context, bc.m324a("loc", "3.0.0"));
                f503d = true;
            }
            if (f502c && !f501b) {
                bt.m451a(context, "loc", "endMark", bt.m455b(context, "loc", "endMark") + 1);
                f501b = true;
            }
        } catch (Throwable th) {
            bc.m330a(th, "RollBackDynamic", "AddEndMark");
        }
    }

    public static synchronized boolean m446c(Context context) {
        boolean z = false;
        synchronized (bs.class) {
            try {
                if (f502c) {
                    if (f507h) {
                        z = f506g;
                    } else {
                        if (f504e == 0) {
                            f504e = bt.m455b(context, "loc", "startMark");
                        }
                        if (f505f == 0) {
                            f505f = bt.m455b(context, "loc", "endMark");
                        }
                        if (!(f500a || f501b)) {
                            if (f504e < f505f) {
                                bs.m442a(context, 0);
                                f506g = true;
                            }
                            if (f504e - f505f > 0 && f504e > 99) {
                                bs.m442a(context, 0);
                                f506g = true;
                            }
                            if (f504e - f505f > 0 && f504e < 99) {
                                bs.m442a(context, -2);
                                f506g = false;
                            }
                            if (f504e - f505f > 0 && f505f < 0) {
                                bs.m444a(context, "loc", "checkMark");
                                f506g = false;
                            }
                        }
                        bt.m453a(context, "loc", "isload", f506g);
                        f507h = true;
                        z = f506g;
                    }
                }
            } catch (Throwable th) {
                bc.m330a(th, "RollBackDynamic", "checkMark");
            }
        }
        return z;
    }

    public static boolean m447d(Context context) {
        try {
            return !f502c ? false : bt.m456b(context, "loc", "isload", true);
        } catch (Throwable th) {
            bc.m330a(th, "RollBackDynamic", "isLoad");
            return true;
        }
    }
}
