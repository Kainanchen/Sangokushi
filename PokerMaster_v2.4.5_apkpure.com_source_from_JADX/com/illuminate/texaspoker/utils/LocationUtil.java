package com.illuminate.texaspoker.utils;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import android.util.Log;
import com.ali.fixHelper;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationListener;

/* renamed from: com.illuminate.texaspoker.utils.d */
public final class LocationUtil {
    private static LocationUtil f6663b;
    public AMapLocationClient f6664a;

    /* renamed from: com.illuminate.texaspoker.utils.d.1 */
    class LocationUtil implements AMapLocationListener {
        final /* synthetic */ LocationUtil f6662a;

        LocationUtil(LocationUtil locationUtil) {
            this.f6662a = locationUtil;
        }

        public final void onLocationChanged(AMapLocation aMapLocation) {
            if (aMapLocation == null) {
                return;
            }
            if (aMapLocation.getErrorCode() == 0) {
                double latitude = aMapLocation.getLatitude();
                double longitude = aMapLocation.getLongitude();
                long j = (long) (latitude * 1000000.0d);
                long j2 = (long) (1000000.0d * longitude);
                new StringBuilder("latDouble:").append(latitude).append(" lonDouble:").append(longitude);
                new StringBuilder("aMapLocation.getAccuracy():").append(aMapLocation.getAccuracy());
                new StringBuilder("aMapLocation.getTime():+").append(aMapLocation.getTime()).append(" td:").append(System.currentTimeMillis() - aMapLocation.getTime());
                NetworkUtil.m4073a();
                NetworkUtil.m4148c(j, j2);
                return;
            }
            Log.e("AmapError", "location Error, ErrCode:" + aMapLocation.getErrorCode() + ", errInfo:" + aMapLocation.getErrorInfo());
            NetworkUtil.m4073a();
            NetworkUtil.m4148c(181000000, 181000000);
        }
    }

    static {
        fixHelper.fixfunc(new int[]{1238, 1});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    private native LocationUtil();

    public static LocationUtil m4237a() {
        if (f6663b == null) {
            f6663b = new LocationUtil();
        }
        return f6663b;
    }
}
