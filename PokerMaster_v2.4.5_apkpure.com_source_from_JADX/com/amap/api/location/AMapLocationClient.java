package com.amap.api.location;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.amap.p003a.AMapLocationManager;
import com.amap.p003a.InstanceFactory;
import com.amap.p003a.bc;
import com.amap.p003a.bs;
import com.amap.p003a.cj;

public class AMapLocationClient {
    Context f764a;
    LocationManagerBase f765b;

    public AMapLocationClient(Context context) {
        if (context == null) {
            try {
                throw new IllegalArgumentException("Context\u53c2\u6570\u4e0d\u80fd\u4e3anull");
            } catch (Throwable th) {
                bc.m330a(th, "AMapLocationClient", "AMapLocationClient 1");
                return;
            }
        }
        this.f764a = context.getApplicationContext();
        this.f765b = m761a(this.f764a, null);
    }

    public AMapLocationClient(Context context, Intent intent) {
        if (context == null) {
            try {
                throw new IllegalArgumentException("Context\u53c2\u6570\u4e0d\u80fd\u4e3anull");
            } catch (Throwable th) {
                bc.m330a(th, "AMapLocationClient", "AMapLocationClient 2");
                return;
            }
        }
        this.f764a = context.getApplicationContext();
        this.f765b = m761a(this.f764a, intent);
    }

    private LocationManagerBase m761a(Context context, Intent intent) {
        LocationManagerBase locationManagerBase;
        try {
            cj a = bc.m324a("loc", "3.0.0");
            bs.m443a(context, a);
            boolean c = bs.m446c(context);
            bs.m441a(context);
            if (c) {
                locationManagerBase = (LocationManagerBase) InstanceFactory.m717a(context, a, "com.amap.api.location.LocationManagerWrapper", AMapLocationManager.class, new Class[]{Context.class, Intent.class}, new Object[]{context, intent});
            } else {
                locationManagerBase = new AMapLocationManager(context, intent);
            }
        } catch (Throwable th) {
            locationManagerBase = new AMapLocationManager(context, intent);
        }
        return locationManagerBase == null ? new AMapLocationManager(context, intent) : locationManagerBase;
    }

    public static void setApiKey(String str) {
        try {
            AMapLocationClientOption.f769a = str;
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationClient", "setApiKey");
        }
    }

    public void addGeoFenceAlert(String str, double d, double d2, float f, long j, PendingIntent pendingIntent) {
        try {
            this.f765b.addGeoFenceAlert(str, d, d2, f, j, pendingIntent);
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationClient", "addGeoFenceAlert");
        }
    }

    public AMapLocation getLastKnownLocation() {
        try {
            if (this.f765b != null) {
                return this.f765b.getLastKnownLocation();
            }
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationClient", "getLastKnownLocation");
        }
        return null;
    }

    public String getVersion() {
        return "3.0.0";
    }

    public boolean isStarted() {
        try {
            if (this.f765b != null) {
                return this.f765b.isStarted();
            }
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationClient", "isStarted");
        }
        return false;
    }

    public void onDestroy() {
        try {
            this.f765b.onDestroy();
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationClient", "onDestroy");
        }
    }

    public void removeGeoFenceAlert(PendingIntent pendingIntent) {
        try {
            this.f765b.removeGeoFenceAlert(pendingIntent);
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationClient", "removeGeoFenceAlert 2");
        }
    }

    public void removeGeoFenceAlert(PendingIntent pendingIntent, String str) {
        try {
            this.f765b.removeGeoFenceAlert(pendingIntent, str);
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationClient", "removeGeoFenceAlert 1");
        }
    }

    public void setLocationListener(AMapLocationListener aMapLocationListener) {
        if (aMapLocationListener == null) {
            try {
                throw new IllegalArgumentException("listener\u53c2\u6570\u4e0d\u80fd\u4e3anull");
            } catch (Throwable th) {
                bc.m330a(th, "AMapLocationClient", "setLocationListener");
                return;
            }
        }
        this.f765b.setLocationListener(aMapLocationListener);
    }

    public void setLocationOption(AMapLocationClientOption aMapLocationClientOption) {
        if (aMapLocationClientOption == null) {
            try {
                throw new IllegalArgumentException("LocationManagerOption\u53c2\u6570\u4e0d\u80fd\u4e3anull");
            } catch (Throwable th) {
                bc.m330a(th, "AMapLocationClient", "setLocationOption");
                return;
            }
        }
        this.f765b.setLocationOption(aMapLocationClientOption);
    }

    public void startAssistantLocation() {
        try {
            this.f765b.startAssistantLocation();
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationClient", "startAssistantLocation");
        }
    }

    public void startLocation() {
        try {
            this.f765b.startLocation();
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationClient", "startLocation");
        }
    }

    public void stopAssistantLocation() {
        try {
            this.f765b.startAssistantLocation();
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationClient", "stopAssistantLocation");
        }
    }

    public void stopLocation() {
        try {
            this.f765b.stopLocation();
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationClient", "stopLocation");
        }
    }

    public void unRegisterLocationListener(AMapLocationListener aMapLocationListener) {
        try {
            this.f765b.unRegisterLocationListener(aMapLocationListener);
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationClient", "unRegisterLocationListener");
        }
    }
}
