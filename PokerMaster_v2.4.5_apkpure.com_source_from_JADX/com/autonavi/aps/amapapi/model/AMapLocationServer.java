package com.autonavi.aps.amapapi.model;

import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import com.amap.p003a.bc;
import com.amap.p003a.bu;
import com.sina.weibo.sdk.constant.WBPageConstants.ParamKey;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.common.MessageKey;
import net.sqlcipher.database.SQLiteDatabase;
import org.json.JSONObject;

public class AMapLocationServer extends AMapLocation {
    boolean f794b;
    private String f795c;
    private int f796d;
    private String f797e;
    private String f798f;
    private String f799g;
    private String f800h;
    private JSONObject f801i;
    private String f802j;
    private String f803k;
    private long f804l;

    public AMapLocationServer(String str) {
        super(str);
        this.f795c = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f797e = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f798f = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f799g = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f800h = "new";
        this.f801i = null;
        this.f802j = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f794b = true;
        this.f803k = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f804l = 0;
    }

    public String m781a() {
        return this.f795c;
    }

    public JSONObject m782a(int i) {
        try {
            JSONObject a = super.m760a(i);
            switch (i) {
                case SQLiteDatabase.OPEN_READONLY /*1*/:
                    a.put("retype", this.f797e);
                    a.put("cens", this.f803k);
                    a.put(ParamKey.POIID, this.f798f);
                    a.put("floor", this.f799g);
                    a.put("coord", this.f796d);
                    a.put("mcell", this.f802j);
                    a.put("desc", this.a);
                    a.put("address", getAddress());
                    if (this.f801i != null && bu.m473a(a, "offpct")) {
                        a.put("offpct", this.f801i.getString("offpct"));
                        break;
                    }
                case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                    break;
                default:
                    return a;
            }
            a.put(MessageKey.MSG_TYPE, this.f800h);
            a.put("isReversegeo", this.f794b);
            return a;
        } catch (Throwable th) {
            bc.m330a(th, "AmapLoc", "toStr");
            return null;
        }
    }

    public void m783a(long j) {
        this.f804l = j;
    }

    public void m784a(String str) {
        this.f795c = str;
    }

    public void m785a(JSONObject jSONObject) {
        this.f801i = jSONObject;
    }

    public void m786a(boolean z) {
        this.f794b = z;
    }

    public int m787b() {
        return this.f796d;
    }

    public void m788b(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (getProvider().equals("gps")) {
                this.f796d = 0;
                return;
            } else if (str.equals("0")) {
                this.f796d = 0;
                return;
            } else if (str.equals("1")) {
                this.f796d = 1;
                return;
            }
        }
        this.f796d = -1;
    }

    public void m789b(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                bc.m329a((AMapLocation) this, jSONObject);
                if (bu.m473a(jSONObject, MessageKey.MSG_TYPE)) {
                    m797f(jSONObject.getString(MessageKey.MSG_TYPE));
                }
                if (bu.m473a(jSONObject, "retype")) {
                    m791c(jSONObject.getString("retype"));
                }
                if (bu.m473a(jSONObject, "cens")) {
                    m801h(jSONObject.getString("cens"));
                }
                if (bu.m473a(jSONObject, "desc")) {
                    m802i(jSONObject.getString("desc"));
                }
                if (bu.m473a(jSONObject, ParamKey.POIID)) {
                    m793d(jSONObject.getString(ParamKey.POIID));
                }
                if (bu.m473a(jSONObject, "pid")) {
                    m793d(jSONObject.getString("pid"));
                }
                if (bu.m473a(jSONObject, "floor")) {
                    m795e(jSONObject.getString("floor"));
                }
                if (bu.m473a(jSONObject, "flr")) {
                    m795e(jSONObject.getString("flr"));
                }
                if (bu.m473a(jSONObject, "coord")) {
                    m788b(jSONObject.getString("coord"));
                }
                if (bu.m473a(jSONObject, "mcell")) {
                    m799g(jSONObject.getString("mcell"));
                }
                if (bu.m473a(jSONObject, "isReversegeo")) {
                    m786a(jSONObject.getBoolean("isReversegeo"));
                }
            } catch (Throwable th) {
                bc.m330a(th, "AmapLoc", "AmapLoc");
            }
        }
    }

    public String m790c() {
        return this.f797e;
    }

    public void m791c(String str) {
        this.f797e = str;
    }

    public String m792d() {
        return this.f798f;
    }

    public void m793d(String str) {
        this.f798f = str;
    }

    public String m794e() {
        return this.f800h;
    }

    public void m795e(String str) {
        if (!TextUtils.isEmpty(str)) {
            str = str.replace("F", LetterIndexBar.SEARCH_ICON_LETTER);
            try {
                Integer.parseInt(str);
            } catch (Throwable th) {
                str = null;
                bc.m330a(th, "AmapLoc", "setFloor");
            }
        }
        this.f799g = str;
    }

    public JSONObject m796f() {
        return this.f801i;
    }

    public void m797f(String str) {
        this.f800h = str;
    }

    public String m798g() {
        return this.f802j;
    }

    public void m799g(String str) {
        this.f802j = str;
    }

    public AMapLocationServer m800h() {
        Object g = m798g();
        if (TextUtils.isEmpty(g)) {
            return null;
        }
        String[] split = g.split(",");
        if (split.length != 3) {
            return null;
        }
        AMapLocationServer aMapLocationServer = new AMapLocationServer(LetterIndexBar.SEARCH_ICON_LETTER);
        aMapLocationServer.setProvider(getProvider());
        aMapLocationServer.setLongitude(Double.parseDouble(split[0]));
        aMapLocationServer.setLatitude(Double.parseDouble(split[1]));
        aMapLocationServer.setAccuracy(Float.parseFloat(split[2]));
        aMapLocationServer.setCityCode(getCityCode());
        aMapLocationServer.setAdCode(getAdCode());
        aMapLocationServer.setCountry(getCountry());
        aMapLocationServer.setProvince(getProvince());
        aMapLocationServer.setCity(getCity());
        aMapLocationServer.setTime(getTime());
        aMapLocationServer.m797f(m794e());
        aMapLocationServer.m788b(String.valueOf(m787b()));
        return bu.m471a(aMapLocationServer) ? aMapLocationServer : null;
    }

    public void m801h(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (Object obj : str.split("\\*")) {
                if (!TextUtils.isEmpty(obj)) {
                    String[] split = obj.split(",");
                    setLongitude(Double.parseDouble(split[0]));
                    setLatitude(Double.parseDouble(split[1]));
                    setAccuracy((float) Integer.parseInt(split[2]));
                    break;
                }
            }
            this.f803k = str;
        }
    }

    public void m802i(String str) {
        this.a = str;
    }

    public boolean m803i() {
        return this.f794b;
    }

    public long m804j() {
        return this.f804l;
    }
}
