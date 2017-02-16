package com.amap.p003a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.autonavi.aps.amapapi.model.AMapLocationServer;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.sina.weibo.sdk.register.mobile.SelectCountryActivity;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Parser */
/* renamed from: com.amap.a.bl */
public final class bl {
    private StringBuilder f402a;

    public bl() {
        this.f402a = new StringBuilder();
    }

    public static AMapLocationServer m377a(String str) {
        try {
            Object obj;
            Object b;
            AMapLocationServer aMapLocationServer = new AMapLocationServer(LetterIndexBar.SEARCH_ICON_LETTER);
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("regeocode");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("addressComponent");
            aMapLocationServer.setCountry(bl.m378b(optJSONObject2.optString("country")));
            String b2 = bl.m378b(optJSONObject2.optString("province"));
            aMapLocationServer.setProvince(b2);
            String b3 = bl.m378b(optJSONObject2.optString("citycode"));
            aMapLocationServer.setCityCode(b3);
            String optString = optJSONObject2.optString("city");
            if (b3.endsWith("010") || b3.endsWith("021") || b3.endsWith("022") || b3.endsWith("023")) {
                if (b2 != null && b2.length() > 0) {
                    aMapLocationServer.setCity(b2);
                    obj = b2;
                }
                b3 = optString;
            } else {
                optString = bl.m378b(optString);
                aMapLocationServer.setCity(optString);
                b3 = optString;
            }
            Object b4 = bl.m378b(optJSONObject2.optString("district"));
            aMapLocationServer.setDistrict(b4);
            Object b5 = bl.m378b(optJSONObject2.optString("adcode"));
            aMapLocationServer.setAdCode(b5);
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("streetNumber");
            Object b6 = bl.m378b(optJSONObject3.optString("street"));
            aMapLocationServer.setStreet(b6);
            aMapLocationServer.setRoad(b6);
            aMapLocationServer.setNumber(bl.m378b(optJSONObject3.optString("number")));
            JSONArray optJSONArray = optJSONObject.optJSONArray("pois");
            if (optJSONArray.length() > 0) {
                b = bl.m378b(optJSONArray.getJSONObject(0).optString(SelectCountryActivity.EXTRA_COUNTRY_NAME));
                aMapLocationServer.setPoiName(b);
            } else {
                b = null;
            }
            JSONArray optJSONArray2 = optJSONObject.optJSONArray("aois");
            if (optJSONArray2.length() > 0) {
                aMapLocationServer.setAoiName(bl.m378b(optJSONArray2.getJSONObject(0).optString(SelectCountryActivity.EXTRA_COUNTRY_NAME)));
            }
            StringBuilder stringBuilder = new StringBuilder();
            if (!TextUtils.isEmpty(b2)) {
                stringBuilder.append(b2).append(" ");
            }
            if (!(TextUtils.isEmpty(obj) || (b2.contains("\u5e02") && b2.equals(obj)))) {
                stringBuilder.append(obj).append(" ");
            }
            if (!TextUtils.isEmpty(b4)) {
                stringBuilder.append(b4).append(" ");
            }
            if (!TextUtils.isEmpty(b6)) {
                stringBuilder.append(b6).append(" ");
            }
            if (!TextUtils.isEmpty(b)) {
                if (!TextUtils.isEmpty(b5)) {
                    stringBuilder.append("\u9760\u8fd1");
                }
                stringBuilder.append(b).append(" ");
            }
            Bundle bundle = new Bundle();
            bundle.putString("citycode", aMapLocationServer.getCityCode());
            bundle.putString("desc", stringBuilder.toString());
            bundle.putString("adcode", aMapLocationServer.getAdCode());
            aMapLocationServer.setExtras(bundle);
            aMapLocationServer.m802i(stringBuilder.toString());
            if (b5 == null || b5.trim().length() <= 0) {
                aMapLocationServer.setAddress(stringBuilder.toString());
                return aMapLocationServer;
            }
            aMapLocationServer.setAddress(stringBuilder.toString().replace(" ", LetterIndexBar.SEARCH_ICON_LETTER));
            return aMapLocationServer;
        } catch (Throwable th) {
            return null;
        }
    }

    private static String m378b(String str) {
        return "[]".equals(str) ? LetterIndexBar.SEARCH_ICON_LETTER : str;
    }

    public final AMapLocationServer m379a(String str, Context context, an anVar) {
        String string;
        AMapLocationServer aMapLocationServer = new AMapLocationServer(LetterIndexBar.SEARCH_ICON_LETTER);
        aMapLocationServer.setErrorCode(7);
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!(jSONObject.has(NotificationCompatApi24.CATEGORY_STATUS) && jSONObject.has("info"))) {
                this.f402a.append("json is error " + str);
            }
            String string2 = jSONObject.getString(NotificationCompatApi24.CATEGORY_STATUS);
            string = jSONObject.getString("info");
            if (string2.equals("0")) {
                this.f402a.append("auth fail:" + string);
            }
        } catch (Throwable th) {
            this.f402a.append("json exception error:" + th.getMessage());
            bc.m330a(th, "parser", "paseAuthFailurJson");
        }
        try {
            this.f402a.append("#SHA1AndPackage#").append(cb.m522e(context));
            string = (String) ((List) anVar.f198b.get("gsid")).get(0);
            if (!TextUtils.isEmpty(string)) {
                this.f402a.append(" #gsid#").append(string);
            }
            Object obj = anVar.f199c;
            if (!TextUtils.isEmpty(obj)) {
                this.f402a.append(" #csid#" + obj);
            }
        } catch (Throwable th2) {
        }
        aMapLocationServer.setLocationDetail(this.f402a.toString());
        if (this.f402a.length() > 0) {
            this.f402a.delete(0, this.f402a.length());
        }
        return aMapLocationServer;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.autonavi.aps.amapapi.model.AMapLocationServer m380a(byte[] r14) {
        /*
        r13 = this;
        r12 = 0;
        r4 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r11 = 1;
        r1 = 0;
        r0 = new com.autonavi.aps.amapapi.model.AMapLocationServer;	 Catch:{ Throwable -> 0x030f, all -> 0x0302 }
        r2 = "";
        r0.<init>(r2);	 Catch:{ Throwable -> 0x030f, all -> 0x0302 }
        if (r14 != 0) goto L_0x0037;
    L_0x0011:
        r2 = 5;
        r0.setErrorCode(r2);	 Catch:{ Throwable -> 0x030f, all -> 0x0302 }
        r2 = r13.f402a;	 Catch:{ Throwable -> 0x030f, all -> 0x0302 }
        r3 = "byte[] is null";
        r2.append(r3);	 Catch:{ Throwable -> 0x030f, all -> 0x0302 }
        r2 = r13.f402a;	 Catch:{ Throwable -> 0x030f, all -> 0x0302 }
        r2 = r2.toString();	 Catch:{ Throwable -> 0x030f, all -> 0x0302 }
        r0.setLocationDetail(r2);	 Catch:{ Throwable -> 0x030f, all -> 0x0302 }
        r2 = r13.f402a;	 Catch:{ Throwable -> 0x030f, all -> 0x0302 }
        r3 = 0;
        r4 = r13.f402a;	 Catch:{ Throwable -> 0x030f, all -> 0x0302 }
        r4 = r4.length();	 Catch:{ Throwable -> 0x030f, all -> 0x0302 }
        r2.delete(r3, r4);	 Catch:{ Throwable -> 0x030f, all -> 0x0302 }
        if (r1 == 0) goto L_0x0036;
    L_0x0033:
        r1.clear();
    L_0x0036:
        return r0;
    L_0x0037:
        r8 = java.nio.ByteBuffer.wrap(r14);	 Catch:{ Throwable -> 0x030f, all -> 0x0302 }
        r1 = r8.get();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        if (r1 != 0) goto L_0x0055;
    L_0x0041:
        r1 = r8.getShort();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r0.m784a(r1);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r8.clear();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        if (r8 == 0) goto L_0x0036;
    L_0x0051:
        r8.clear();
        goto L_0x0036;
    L_0x0055:
        r1 = r8.getInt();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r2 = (double) r1;	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r2 = r2 / r4;
        r2 = com.amap.p003a.bu.m457a(r2);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r0.setLongitude(r2);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1 = r8.getInt();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r2 = (double) r1;	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r2 = r2 / r4;
        r2 = com.amap.p003a.bu.m457a(r2);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r0.setLatitude(r2);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1 = r8.getShort();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1 = (float) r1;	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r0.setAccuracy(r1);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1 = r8.get();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r0.m788b(r1);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1 = r8.get();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r0.m791c(r1);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1 = r8.get();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        if (r1 != r11) goto L_0x022b;
    L_0x0093:
        r2 = "";
        r3 = "";
        r4 = "";
        r5 = "";
        r6 = "";
        r7 = "";
        r1 = r8.get();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1 = r1 & 255;
        r1 = new byte[r1];	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r8.get(r1);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r9 = new java.lang.String;	 Catch:{ Throwable -> 0x0337, all -> 0x030a }
        r10 = "UTF-8";
        r9.<init>(r1, r10);	 Catch:{ Throwable -> 0x0337, all -> 0x030a }
        r0.setCountry(r9);	 Catch:{ Throwable -> 0x0337, all -> 0x030a }
    L_0x00b4:
        r1 = r8.get();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1 = r1 & 255;
        r9 = new byte[r1];	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r8.get(r9);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1 = new java.lang.String;	 Catch:{ Throwable -> 0x02ab, all -> 0x030a }
        r10 = "UTF-8";
        r1.<init>(r9, r10);	 Catch:{ Throwable -> 0x02ab, all -> 0x030a }
        r0.setProvince(r1);	 Catch:{ Throwable -> 0x0334, all -> 0x030a }
        r10 = r1;
    L_0x00ca:
        r1 = r8.get();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1 = r1 & 255;
        r2 = new byte[r1];	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r8.get(r2);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1 = new java.lang.String;	 Catch:{ Throwable -> 0x02b0, all -> 0x030a }
        r9 = "UTF-8";
        r1.<init>(r2, r9);	 Catch:{ Throwable -> 0x02b0, all -> 0x030a }
        r0.setCity(r1);	 Catch:{ Throwable -> 0x0331, all -> 0x030a }
        r9 = r1;
    L_0x00e0:
        r1 = r8.get();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1 = r1 & 255;
        r2 = new byte[r1];	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r8.get(r2);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1 = new java.lang.String;	 Catch:{ Throwable -> 0x02b5, all -> 0x030a }
        r3 = "UTF-8";
        r1.<init>(r2, r3);	 Catch:{ Throwable -> 0x02b5, all -> 0x030a }
        r0.setDistrict(r1);	 Catch:{ Throwable -> 0x032e, all -> 0x030a }
        r4 = r1;
    L_0x00f6:
        r1 = r8.get();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1 = r1 & 255;
        r2 = new byte[r1];	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r8.get(r2);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1 = new java.lang.String;	 Catch:{ Throwable -> 0x02ba, all -> 0x030a }
        r3 = "UTF-8";
        r1.<init>(r2, r3);	 Catch:{ Throwable -> 0x02ba, all -> 0x030a }
        r0.setStreet(r1);	 Catch:{ Throwable -> 0x032b, all -> 0x030a }
        r0.setRoad(r1);	 Catch:{ Throwable -> 0x032b, all -> 0x030a }
        r3 = r1;
    L_0x010f:
        r1 = r8.get();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1 = r1 & 255;
        r1 = new byte[r1];	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r8.get(r1);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r2 = new java.lang.String;	 Catch:{ Throwable -> 0x0328, all -> 0x030a }
        r5 = "UTF-8";
        r2.<init>(r1, r5);	 Catch:{ Throwable -> 0x0328, all -> 0x030a }
        r0.setNumber(r2);	 Catch:{ Throwable -> 0x0328, all -> 0x030a }
    L_0x0124:
        r1 = r8.get();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1 = r1 & 255;
        r2 = new byte[r1];	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r8.get(r2);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1 = new java.lang.String;	 Catch:{ Throwable -> 0x02bf, all -> 0x030a }
        r5 = "UTF-8";
        r1.<init>(r2, r5);	 Catch:{ Throwable -> 0x02bf, all -> 0x030a }
        r0.setPoiName(r1);	 Catch:{ Throwable -> 0x0326, all -> 0x030a }
        r2 = r1;
    L_0x013a:
        r1 = r8.get();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1 = r1 & 255;
        r1 = new byte[r1];	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r8.get(r1);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r5 = new java.lang.String;	 Catch:{ Throwable -> 0x0323, all -> 0x030a }
        r6 = "UTF-8";
        r5.<init>(r1, r6);	 Catch:{ Throwable -> 0x0323, all -> 0x030a }
        r0.setAoiName(r5);	 Catch:{ Throwable -> 0x0323, all -> 0x030a }
    L_0x014f:
        r1 = r8.get();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1 = r1 & 255;
        r5 = new byte[r1];	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r8.get(r5);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1 = new java.lang.String;	 Catch:{ Throwable -> 0x031c, all -> 0x030a }
        r6 = "UTF-8";
        r1.<init>(r5, r6);	 Catch:{ Throwable -> 0x031c, all -> 0x030a }
        r0.setAdCode(r1);	 Catch:{ Throwable -> 0x0320, all -> 0x030a }
    L_0x0164:
        r5 = r8.get();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r5 = r5 & 255;
        r5 = new byte[r5];	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r8.get(r5);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r6 = new java.lang.String;	 Catch:{ Throwable -> 0x0319, all -> 0x030a }
        r7 = "UTF-8";
        r6.<init>(r5, r7);	 Catch:{ Throwable -> 0x0319, all -> 0x030a }
        r0.setCityCode(r6);	 Catch:{ Throwable -> 0x0319, all -> 0x030a }
    L_0x0179:
        r5 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r5.<init>();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r6 = android.text.TextUtils.isEmpty(r10);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        if (r6 != 0) goto L_0x018d;
    L_0x0184:
        r6 = r5.append(r10);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r7 = " ";
        r6.append(r7);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
    L_0x018d:
        r6 = android.text.TextUtils.isEmpty(r9);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        if (r6 != 0) goto L_0x01aa;
    L_0x0193:
        r6 = "\u5e02";
        r6 = r10.contains(r6);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        if (r6 == 0) goto L_0x01a1;
    L_0x019b:
        r6 = r10.equals(r9);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        if (r6 != 0) goto L_0x01aa;
    L_0x01a1:
        r6 = r5.append(r9);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r7 = " ";
        r6.append(r7);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
    L_0x01aa:
        r6 = android.text.TextUtils.isEmpty(r4);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        if (r6 != 0) goto L_0x01b9;
    L_0x01b0:
        r4 = r5.append(r4);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r6 = " ";
        r4.append(r6);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
    L_0x01b9:
        r4 = android.text.TextUtils.isEmpty(r3);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        if (r4 != 0) goto L_0x01c8;
    L_0x01bf:
        r3 = r5.append(r3);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r4 = " ";
        r3.append(r4);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
    L_0x01c8:
        r3 = android.text.TextUtils.isEmpty(r2);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        if (r3 != 0) goto L_0x01e2;
    L_0x01ce:
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        if (r1 != 0) goto L_0x01d9;
    L_0x01d4:
        r1 = "\u9760\u8fd1";
        r5.append(r1);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
    L_0x01d9:
        r1 = r5.append(r2);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r2 = " ";
        r1.append(r2);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
    L_0x01e2:
        r1 = new android.os.Bundle;	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1.<init>();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r2 = "citycode";
        r3 = r0.getCityCode();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1.putString(r2, r3);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r2 = "desc";
        r3 = r5.toString();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1.putString(r2, r3);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r2 = "adcode";
        r3 = r0.getAdCode();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1.putString(r2, r3);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r0.setExtras(r1);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1 = r5.toString();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r0.m802i(r1);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1 = r0.getAdCode();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        if (r1 == 0) goto L_0x02c4;
    L_0x0212:
        r1 = r1.trim();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1 = r1.length();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        if (r1 <= 0) goto L_0x02c4;
    L_0x021c:
        r1 = r5.toString();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r2 = " ";
        r3 = "";
        r1 = r1.replace(r2, r3);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r0.setAddress(r1);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
    L_0x022b:
        r1 = r8.get();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1 = r1 & 255;
        r1 = new byte[r1];	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r8.get(r1);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1 = r8.get();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        if (r1 != r11) goto L_0x0245;
    L_0x023c:
        r8.getInt();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r8.getInt();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r8.getShort();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
    L_0x0245:
        r1 = r8.get();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        if (r1 != r11) goto L_0x0275;
    L_0x024b:
        r1 = r8.get();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1 = r1 & 255;
        r1 = new byte[r1];	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r8.get(r1);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r2 = new java.lang.String;	 Catch:{ Throwable -> 0x0316, all -> 0x030a }
        r3 = "UTF-8";
        r2.<init>(r1, r3);	 Catch:{ Throwable -> 0x0316, all -> 0x030a }
        r0.m793d(r2);	 Catch:{ Throwable -> 0x0316, all -> 0x030a }
    L_0x0260:
        r1 = r8.get();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r1 = r1 & 255;
        r1 = new byte[r1];	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r8.get(r1);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r2 = new java.lang.String;	 Catch:{ Throwable -> 0x0313, all -> 0x030a }
        r3 = "UTF-8";
        r2.<init>(r1, r3);	 Catch:{ Throwable -> 0x0313, all -> 0x030a }
        r0.m795e(r2);	 Catch:{ Throwable -> 0x0313, all -> 0x030a }
    L_0x0275:
        r1 = r8.get();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        if (r1 != r11) goto L_0x0284;
    L_0x027b:
        r8.get();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r8.getInt();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r8.get();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
    L_0x0284:
        r1 = r8.get();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        if (r1 != r11) goto L_0x0291;
    L_0x028a:
        r2 = r8.getLong();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r0.setTime(r2);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
    L_0x0291:
        if (r8 == 0) goto L_0x0296;
    L_0x0293:
        r8.clear();
    L_0x0296:
        r1 = r13.f402a;
        r1 = r1.length();
        if (r1 <= 0) goto L_0x0036;
    L_0x029e:
        r1 = r13.f402a;
        r2 = r13.f402a;
        r2 = r2.length();
        r1.delete(r12, r2);
        goto L_0x0036;
    L_0x02ab:
        r1 = move-exception;
        r1 = r2;
    L_0x02ad:
        r10 = r1;
        goto L_0x00ca;
    L_0x02b0:
        r1 = move-exception;
        r1 = r3;
    L_0x02b2:
        r9 = r1;
        goto L_0x00e0;
    L_0x02b5:
        r1 = move-exception;
        r1 = r4;
    L_0x02b7:
        r4 = r1;
        goto L_0x00f6;
    L_0x02ba:
        r1 = move-exception;
        r1 = r5;
    L_0x02bc:
        r3 = r1;
        goto L_0x010f;
    L_0x02bf:
        r1 = move-exception;
        r1 = r6;
    L_0x02c1:
        r2 = r1;
        goto L_0x013a;
    L_0x02c4:
        r1 = r5.toString();	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        r0.setAddress(r1);	 Catch:{ Throwable -> 0x02cd, all -> 0x030a }
        goto L_0x022b;
    L_0x02cd:
        r0 = move-exception;
        r1 = r0;
        r2 = r8;
    L_0x02d0:
        r0 = new com.autonavi.aps.amapapi.model.AMapLocationServer;	 Catch:{ all -> 0x030c }
        r3 = "";
        r0.<init>(r3);	 Catch:{ all -> 0x030c }
        r3 = 5;
        r0.setErrorCode(r3);	 Catch:{ all -> 0x030c }
        r3 = r13.f402a;	 Catch:{ all -> 0x030c }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x030c }
        r5 = "parser data error:";
        r4.<init>(r5);	 Catch:{ all -> 0x030c }
        r1 = r1.getMessage();	 Catch:{ all -> 0x030c }
        r1 = r4.append(r1);	 Catch:{ all -> 0x030c }
        r1 = r1.toString();	 Catch:{ all -> 0x030c }
        r3.append(r1);	 Catch:{ all -> 0x030c }
        r1 = r13.f402a;	 Catch:{ all -> 0x030c }
        r1 = r1.toString();	 Catch:{ all -> 0x030c }
        r0.setLocationDetail(r1);	 Catch:{ all -> 0x030c }
        if (r2 == 0) goto L_0x0296;
    L_0x02fe:
        r2.clear();
        goto L_0x0296;
    L_0x0302:
        r0 = move-exception;
        r8 = r1;
    L_0x0304:
        if (r8 == 0) goto L_0x0309;
    L_0x0306:
        r8.clear();
    L_0x0309:
        throw r0;
    L_0x030a:
        r0 = move-exception;
        goto L_0x0304;
    L_0x030c:
        r0 = move-exception;
        r8 = r2;
        goto L_0x0304;
    L_0x030f:
        r0 = move-exception;
        r2 = r1;
        r1 = r0;
        goto L_0x02d0;
    L_0x0313:
        r1 = move-exception;
        goto L_0x0275;
    L_0x0316:
        r1 = move-exception;
        goto L_0x0260;
    L_0x0319:
        r5 = move-exception;
        goto L_0x0179;
    L_0x031c:
        r1 = move-exception;
        r1 = r7;
        goto L_0x0164;
    L_0x0320:
        r5 = move-exception;
        goto L_0x0164;
    L_0x0323:
        r1 = move-exception;
        goto L_0x014f;
    L_0x0326:
        r2 = move-exception;
        goto L_0x02c1;
    L_0x0328:
        r1 = move-exception;
        goto L_0x0124;
    L_0x032b:
        r2 = move-exception;
        goto L_0x02bc;
    L_0x032e:
        r2 = move-exception;
        goto L_0x02b7;
    L_0x0331:
        r2 = move-exception;
        goto L_0x02b2;
    L_0x0334:
        r2 = move-exception;
        goto L_0x02ad;
    L_0x0337:
        r1 = move-exception;
        goto L_0x00b4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.a.bl.a(byte[]):com.autonavi.aps.amapapi.model.AMapLocationServer");
    }
}
