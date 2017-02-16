package com.amap.api.location;

import android.content.Context;
import android.text.TextUtils;
import com.amap.p003a.bc;
import com.amap.p003a.bv;
import com.amap.p003a.ci;
import com.sina.weibo.sdk.constant.WBPageConstants.ParamKey;
import java.io.File;
import java.math.BigDecimal;

/* renamed from: com.amap.api.location.a */
public class OffsetUtil {
    static double f792a;
    private static boolean f793b;

    static {
        f793b = false;
        f792a = 3.141592653589793d;
    }

    private static double m763a(double d) {
        return Math.sin((3000.0d * d) * (f792a / 180.0d)) * 2.0E-5d;
    }

    public static double m764a(double d, double d2) {
        return (Math.cos(d2 / 100000.0d) * (d / 18000.0d)) + (Math.sin(d / 100000.0d) * (d2 / 9000.0d));
    }

    private static double m765a(double d, int i) {
        return new BigDecimal(d).setScale(i, 4).doubleValue();
    }

    private static DPoint m766a(double d, double d2, double d3, double d4) {
        DPoint dPoint = new DPoint();
        double d5 = d - d3;
        double d6 = d2 - d4;
        DPoint d7 = OffsetUtil.m776d(d5, d6);
        dPoint.setLongitude(OffsetUtil.m765a((d5 + d) - d7.getLongitude(), 8));
        dPoint.setLatitude(OffsetUtil.m765a((d2 + d6) - d7.getLatitude(), 8));
        return dPoint;
    }

    public static DPoint m767a(Context context, double d, double d2) {
        return context == null ? null : OffsetUtil.m768a(context, new DPoint(d2, d));
    }

    public static DPoint m768a(Context context, DPoint dPoint) {
        if (context == null) {
            return null;
        }
        String a = ci.m599a(context, "libwgs2gcj.so");
        if (!(TextUtils.isEmpty(a) || !new File(a).exists() || f793b)) {
            try {
                System.load(a);
                f793b = true;
            } catch (Throwable th) {
                bc.m330a(th, "OffsetUtil", ParamKey.OFFSET);
            }
        }
        return OffsetUtil.m771a(dPoint, f793b);
    }

    public static DPoint m769a(DPoint dPoint) {
        if (dPoint != null) {
            try {
                dPoint = OffsetUtil.m770a(dPoint, 2);
            } catch (Throwable th) {
                bc.m330a(th, "OffsetUtil", "B2G");
            }
        }
        return dPoint;
    }

    private static DPoint m770a(DPoint dPoint, int i) {
        double d = 0.006401062d;
        double d2 = 0.0060424805d;
        int i2 = 0;
        DPoint dPoint2 = null;
        while (i2 < i) {
            DPoint a = OffsetUtil.m766a(dPoint.getLongitude(), dPoint.getLatitude(), d, d2);
            d = dPoint.getLongitude() - a.getLongitude();
            d2 = dPoint.getLatitude() - a.getLatitude();
            i2++;
            dPoint2 = a;
        }
        return dPoint2;
    }

    private static DPoint m771a(DPoint dPoint, boolean z) {
        double[] dArr;
        try {
            if (!bc.m331a(dPoint.getLatitude(), dPoint.getLongitude())) {
                return dPoint;
            }
            double[] dArr2 = new double[2];
            if (z) {
                if (CoordUtil.convertToGcj(new double[]{dPoint.getLongitude(), dPoint.getLatitude()}, dArr2) != 0) {
                    dArr2 = bv.m504a(dPoint.getLongitude(), dPoint.getLatitude());
                }
                dArr = dArr2;
            } else {
                dArr = bv.m504a(dPoint.getLongitude(), dPoint.getLatitude());
            }
            return new DPoint(dArr[1], dArr[0]);
        } catch (Throwable th) {
            bc.m330a(th, "OffsetUtil", "cover part2");
            return dPoint;
        }
    }

    private static double m772b(double d) {
        return Math.cos((3000.0d * d) * (f792a / 180.0d)) * 3.0E-6d;
    }

    public static double m773b(double d, double d2) {
        return (Math.sin(d2 / 100000.0d) * (d / 18000.0d)) + (Math.cos(d / 100000.0d) * (d2 / 9000.0d));
    }

    public static DPoint m774b(Context context, DPoint dPoint) {
        try {
            dPoint = OffsetUtil.m768a(context, OffsetUtil.m775c(dPoint.getLongitude(), dPoint.getLatitude()));
        } catch (Throwable th) {
            bc.m330a(th, "OffsetUtil", "marbar2G");
        }
        return dPoint;
    }

    private static DPoint m775c(double d, double d2) {
        double d3 = (double) (((long) (100000.0d * d)) % 36000000);
        double d4 = (double) (((long) (100000.0d * d2)) % 36000000);
        int i = (int) ((-OffsetUtil.m773b(d3, d4)) + d4);
        int i2 = (int) (((double) (d3 > 0.0d ? 1 : -1)) + ((-OffsetUtil.m764a((double) ((int) ((-OffsetUtil.m764a(d3, d4)) + d3)), (double) i)) + d3));
        return new DPoint(((double) ((int) (((double) (d4 > 0.0d ? 1 : -1)) + ((-OffsetUtil.m773b((double) i2, (double) i)) + d4)))) / 100000.0d, ((double) i2) / 100000.0d);
    }

    private static DPoint m776d(double d, double d2) {
        DPoint dPoint = new DPoint();
        double sin = (Math.sin(OffsetUtil.m772b(d) + Math.atan2(d2, d)) * (OffsetUtil.m763a(d2) + Math.sqrt((d * d) + (d2 * d2)))) + 0.006d;
        dPoint.setLongitude(OffsetUtil.m765a((Math.cos(OffsetUtil.m772b(d) + Math.atan2(d2, d)) * (OffsetUtil.m763a(d2) + Math.sqrt((d * d) + (d2 * d2)))) + 0.0065d, 8));
        dPoint.setLatitude(OffsetUtil.m765a(sin, 8));
        return dPoint;
    }
}
