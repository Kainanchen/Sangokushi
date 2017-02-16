package com.amap.api.location;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;

public class AMapLocationClientOption implements Cloneable {
    static String f769a;
    private static AMapLocationProtocol f770i;
    private long f771b;
    private long f772c;
    private boolean f773d;
    private boolean f774e;
    private boolean f775f;
    private boolean f776g;
    private AMapLocationMode f777h;
    private boolean f778j;
    private boolean f779k;
    private boolean f780l;
    private boolean f781m;
    private boolean f782n;

    public enum AMapLocationMode {
        Battery_Saving,
        Device_Sensors,
        Hight_Accuracy
    }

    public enum AMapLocationProtocol {
        HTTP(0),
        HTTPS(1);
        
        private int f768a;

        private AMapLocationProtocol(int i) {
            this.f768a = i;
        }

        public final int getValue() {
            return this.f768a;
        }
    }

    static {
        fixHelper.fixfunc(new int[]{61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    static void __clinit__() {
        f770i = AMapLocationProtocol.HTTP;
        f769a = LetterIndexBar.SEARCH_ICON_LETTER;
    }

    private native AMapLocationClientOption m762a(AMapLocationClientOption aMapLocationClientOption);

    public static String getAPIKEY() {
        return f769a;
    }

    public static void setLocationProtocol(AMapLocationProtocol aMapLocationProtocol) {
        f770i = aMapLocationProtocol;
    }

    public native AMapLocationClientOption clone();

    public native /* bridge */ /* synthetic */ Object m5957clone();

    public native long getHttpTimeOut();

    public native long getInterval();

    public native AMapLocationMode getLocationMode();

    public native AMapLocationProtocol getLocationProtocol();

    public native boolean isGpsFirst();

    public native boolean isKillProcess();

    public native boolean isLocationCacheEnable();

    public native boolean isMockEnable();

    public native boolean isNeedAddress();

    public native boolean isOffset();

    public native boolean isOnceLocation();

    public native boolean isOnceLocationLatest();

    public native boolean isWifiActiveScan();

    public native AMapLocationClientOption setGpsFirst(boolean z);

    public native void setHttpTimeOut(long j);

    public native AMapLocationClientOption setInterval(long j);

    public native AMapLocationClientOption setKillProcess(boolean z);

    public native void setLocationCacheEnable(boolean z);

    public native AMapLocationClientOption setLocationMode(AMapLocationMode aMapLocationMode);

    public native void setMockEnable(boolean z);

    public native AMapLocationClientOption setNeedAddress(boolean z);

    public native AMapLocationClientOption setOffset(boolean z);

    public native AMapLocationClientOption setOnceLocation(boolean z);

    public native void setOnceLocationLatest(boolean z);

    public native void setWifiActiveScan(boolean z);

    public native String toString();
}
