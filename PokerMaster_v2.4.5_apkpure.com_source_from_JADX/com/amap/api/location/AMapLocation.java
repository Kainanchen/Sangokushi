package com.amap.api.location;

import android.location.Location;
import com.amap.p003a.bc;
import com.amap.p003a.bu;
import com.sina.weibo.sdk.constant.WBPageConstants.ParamKey;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import org.json.JSONObject;

public class AMapLocation extends Location {
    public static final int ERROR_CODE_FAILURE_AUTH = 7;
    public static final int ERROR_CODE_FAILURE_CELL = 11;
    public static final int ERROR_CODE_FAILURE_CONNECTION = 4;
    public static final int ERROR_CODE_FAILURE_INIT = 9;
    public static final int ERROR_CODE_FAILURE_LOCATION = 6;
    public static final int ERROR_CODE_FAILURE_LOCATION_PARAMETER = 3;
    public static final int ERROR_CODE_FAILURE_LOCATION_PERMISSION = 12;
    public static final int ERROR_CODE_FAILURE_NOWIFIANDAP = 13;
    public static final int ERROR_CODE_FAILURE_PARSER = 5;
    public static final int ERROR_CODE_FAILURE_WIFI_INFO = 2;
    public static final int ERROR_CODE_INVALID_PARAMETER = 1;
    public static final int ERROR_CODE_SERVICE_FAIL = 10;
    public static final int ERROR_CODE_UNKNOWN = 8;
    public static final int LOCATION_SUCCESS = 0;
    public static final int LOCATION_TYPE_AMAP = 7;
    public static final int LOCATION_TYPE_CELL = 6;
    public static final int LOCATION_TYPE_FAST = 3;
    public static final int LOCATION_TYPE_FIX_CACHE = 4;
    public static final int LOCATION_TYPE_GPS = 1;
    public static final int LOCATION_TYPE_OFFLINE = 8;
    public static final int LOCATION_TYPE_SAME_REQ = 2;
    public static final int LOCATION_TYPE_WIFI = 5;
    public String f743a;
    private String f744b;
    private String f745c;
    private String f746d;
    private String f747e;
    private String f748f;
    private String f749g;
    private String f750h;
    private String f751i;
    private String f752j;
    private String f753k;
    private String f754l;
    private boolean f755m;
    private int f756n;
    private String f757o;
    private String f758p;
    private int f759q;
    private double f760r;
    private double f761s;
    private int f762t;
    private String f763u;

    public AMapLocation(Location location) {
        super(location);
        this.f744b = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f745c = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f746d = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f747e = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f748f = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f749g = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f750h = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f751i = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f752j = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f753k = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f754l = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f755m = true;
        this.f756n = LOCATION_SUCCESS;
        this.f757o = "success";
        this.f758p = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f759q = LOCATION_SUCCESS;
        this.f760r = 0.0d;
        this.f761s = 0.0d;
        this.f762t = LOCATION_SUCCESS;
        this.f763u = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f743a = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f760r = location.getLatitude();
        this.f761s = location.getLongitude();
    }

    public AMapLocation(String str) {
        super(str);
        this.f744b = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f745c = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f746d = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f747e = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f748f = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f749g = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f750h = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f751i = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f752j = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f753k = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f754l = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f755m = true;
        this.f756n = LOCATION_SUCCESS;
        this.f757o = "success";
        this.f758p = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f759q = LOCATION_SUCCESS;
        this.f760r = 0.0d;
        this.f761s = 0.0d;
        this.f762t = LOCATION_SUCCESS;
        this.f763u = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f743a = LetterIndexBar.SEARCH_ICON_LETTER;
    }

    public JSONObject m760a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            switch (i) {
                case LOCATION_TYPE_GPS /*1*/:
                    jSONObject.put("altitude", getAltitude());
                    jSONObject.put("speed", (double) getSpeed());
                    jSONObject.put("bearing", (double) getBearing());
                    jSONObject.put("citycode", this.f747e);
                    jSONObject.put("desc", this.f743a);
                    jSONObject.put("adcode", this.f748f);
                    jSONObject.put("country", this.f751i);
                    jSONObject.put("province", this.f744b);
                    jSONObject.put("city", this.f745c);
                    jSONObject.put("district", this.f746d);
                    jSONObject.put("road", this.f752j);
                    jSONObject.put("street", this.f753k);
                    jSONObject.put("number", this.f754l);
                    jSONObject.put(ParamKey.POINAME, this.f750h);
                    jSONObject.put("errorCode", this.f756n);
                    jSONObject.put("errorInfo", this.f757o);
                    jSONObject.put("locationType", this.f759q);
                    jSONObject.put("locationDetail", this.f758p);
                    jSONObject.put("aoiname", this.f763u);
                    jSONObject.put("address", this.f749g);
                    break;
                case LOCATION_TYPE_SAME_REQ /*2*/:
                    break;
                case LOCATION_TYPE_FAST /*3*/:
                    break;
                default:
                    return jSONObject;
            }
            jSONObject.put("time", getTime());
            jSONObject.put("provider", getProvider());
            jSONObject.put("lon", getLongitude());
            jSONObject.put("lat", getLatitude());
            jSONObject.put("accuracy", (double) getAccuracy());
            jSONObject.put("isOffset", this.f755m);
            return jSONObject;
        } catch (Throwable th) {
            bc.m330a(th, "AmapLoc", "toStr");
            return null;
        }
    }

    public float getAccuracy() {
        return super.getAccuracy();
    }

    public String getAdCode() {
        return this.f748f;
    }

    public String getAddress() {
        return this.f749g;
    }

    public double getAltitude() {
        return super.getAltitude();
    }

    public String getAoiName() {
        return this.f763u;
    }

    public float getBearing() {
        return super.getBearing();
    }

    public String getCity() {
        return this.f745c;
    }

    public String getCityCode() {
        return this.f747e;
    }

    public String getCountry() {
        return this.f751i;
    }

    public String getDistrict() {
        return this.f746d;
    }

    public int getErrorCode() {
        return this.f756n;
    }

    public String getErrorInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f757o);
        if (this.f756n != 0) {
            stringBuilder.append(" \u8bf7\u5230http://lbs.amap.com/api/android-location-sdk/abouterrorcode/\u67e5\u770b\u9519\u8bef\u7801\u8bf4\u660e.");
        }
        this.f757o = stringBuilder.toString();
        return this.f757o;
    }

    public double getLatitude() {
        return this.f760r;
    }

    public String getLocationDetail() {
        return this.f758p;
    }

    public int getLocationType() {
        return this.f759q;
    }

    public double getLongitude() {
        return this.f761s;
    }

    public String getPoiName() {
        return this.f750h;
    }

    public String getProvider() {
        return super.getProvider();
    }

    public String getProvince() {
        return this.f744b;
    }

    public String getRoad() {
        return this.f752j;
    }

    public int getSatellites() {
        return this.f762t;
    }

    public float getSpeed() {
        return super.getSpeed();
    }

    public String getStreet() {
        return this.f753k;
    }

    public String getStreetNum() {
        return this.f754l;
    }

    public boolean isOffset() {
        return this.f755m;
    }

    public void setAdCode(String str) {
        this.f748f = str;
    }

    public void setAddress(String str) {
        this.f749g = str;
    }

    public void setAoiName(String str) {
        this.f763u = str;
    }

    public void setCity(String str) {
        this.f745c = str;
    }

    public void setCityCode(String str) {
        this.f747e = str;
    }

    public void setCountry(String str) {
        this.f751i = str;
    }

    public void setDistrict(String str) {
        this.f746d = str;
    }

    public void setErrorCode(int i) {
        if (this.f756n == 0) {
            this.f757o = bu.m487c(i);
            this.f756n = i;
        }
    }

    public void setErrorInfo(String str) {
        this.f757o = str;
    }

    public void setLatitude(double d) {
        this.f760r = d;
    }

    public void setLocationDetail(String str) {
        this.f758p = str;
    }

    public void setLocationType(int i) {
        this.f759q = i;
    }

    public void setLongitude(double d) {
        this.f761s = d;
    }

    public void setNumber(String str) {
        this.f754l = str;
    }

    public void setOffset(boolean z) {
        this.f755m = z;
    }

    public void setPoiName(String str) {
        this.f750h = str;
    }

    public void setProvince(String str) {
        this.f744b = str;
    }

    public void setRoad(String str) {
        this.f752j = str;
    }

    public void setSatellites(int i) {
        this.f762t = i;
    }

    public void setStreet(String str) {
        this.f753k = str;
    }

    public String toStr() {
        return toStr(LOCATION_TYPE_GPS);
    }

    public String toStr(int i) {
        JSONObject a;
        try {
            a = m760a(i);
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocation", "toStr part2");
            a = null;
        }
        return a == null ? null : a.toString();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            stringBuffer.append("latitude=" + this.f760r);
            stringBuffer.append("longitude=" + this.f761s);
            stringBuffer.append("province=" + this.f744b + "#");
            stringBuffer.append("city=" + this.f745c + "#");
            stringBuffer.append("district=" + this.f746d + "#");
            stringBuffer.append("cityCode=" + this.f747e + "#");
            stringBuffer.append("adCode=" + this.f748f + "#");
            stringBuffer.append("address=" + this.f749g + "#");
            stringBuffer.append("country=" + this.f751i + "#");
            stringBuffer.append("road=" + this.f752j + "#");
            stringBuffer.append("poiName=" + this.f750h + "#");
            stringBuffer.append("street=" + this.f753k + "#");
            stringBuffer.append("streetNum=" + this.f754l + "#");
            stringBuffer.append("aoiName=" + this.f763u + "#");
            stringBuffer.append("errorCode=" + this.f756n + "#");
            stringBuffer.append("errorInfo=" + this.f757o + "#");
            stringBuffer.append("locationDetail=" + this.f758p + "#");
            stringBuffer.append("locationType=" + this.f759q);
        } catch (Throwable th) {
        }
        return stringBuffer.toString();
    }
}
