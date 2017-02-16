package com.amap.p003a;

import a.does.not.Exists2;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import com.ali.fixHelper;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.CoordinateConverter;
import com.amap.p003a.AMapLocationManager.AMapLocationManager;

/* compiled from: GPSLocation */
/* renamed from: com.amap.a.bx */
public final class bx {
    Handler f520a;
    Context f521b;
    LocationManager f522c;
    AMapLocationClientOption f523d;
    bq f524e;
    CoordinateConverter f525f;
    long f526g;
    long f527h;
    boolean f528i;
    long f529j;
    LocationListener f530k;

    /* renamed from: com.amap.a.bx.1 */
    class GPSLocation implements LocationListener {
        final /* synthetic */ bx f519a;

        static {
            fixHelper.fixfunc(new int[]{2718, 2719, 2720, 2721, 2722});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native GPSLocation(bx bxVar);

        public final native void onLocationChanged(Location location);

        public final native void onProviderDisabled(String str);

        public final native void onProviderEnabled(String str);

        public final native void onStatusChanged(String str, int i, Bundle bundle);
    }

    public bx(Context context, AMapLocationManager aMapLocationManager) {
        this.f524e = null;
        this.f525f = null;
        this.f526g = 1000;
        this.f527h = 0;
        this.f528i = false;
        this.f529j = 0;
        this.f530k = new GPSLocation(this);
        this.f521b = context;
        this.f525f = new CoordinateConverter(this.f521b.getApplicationContext());
        this.f520a = aMapLocationManager;
        this.f522c = (LocationManager) this.f521b.getSystemService("location");
        this.f524e = new bq();
    }
}
