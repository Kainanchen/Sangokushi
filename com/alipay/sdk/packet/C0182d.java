package com.alipay.sdk.packet;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import android.widget.TextView;
import com.alipay.sdk.cons.C0165a;
import com.alipay.sdk.cons.C0166b;
import com.alipay.sdk.data.C0170c;
import com.alipay.sdk.net.C0177a;
import com.alipay.sdk.sys.C0191b;
import com.alipay.sdk.tid.C0193b;
import com.alipay.sdk.util.C0194a;
import com.alipay.sdk.util.C0195b;
import com.alipay.sdk.util.C0201h;
import com.alipay.sdk.util.C0204k;
import com.alipay.sdk.util.C0206l;
import com.loopj.android.http.RequestParams;
import com.tencent.connect.common.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.message.BasicHeader;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.alipay.sdk.packet.d */
public abstract class C0182d {
    public static final String f419a = "msp-gzip";
    public static final String f420b = "Msp-Param";
    public static final String f421c = "Operation-Type";
    public static final String f422d = "content-type";
    public static final String f423e = "Version";
    public static final String f424f = "AppId";
    public static final String f425g = "des-mode";
    public static final String f426h = "namespace";
    public static final String f427i = "api_name";
    public static final String f428j = "api_version";
    public static final String f429k = "data";
    public static final String f430l = "params";
    public static final String f431m = "public_key";
    public static final String f432n = "device";
    public static final String f433o = "action";
    public static final String f434p = "type";
    public static final String f435q = "method";
    private static C0177a f436t;
    protected boolean f437r;
    protected boolean f438s;

    public abstract JSONObject m564a() throws JSONException;

    public C0182d() {
        this.f437r = true;
        this.f438s = true;
    }

    public List<Header> m563a(boolean z, String str) {
        List<Header> arrayList = new ArrayList();
        arrayList.add(new BasicHeader(f419a, String.valueOf(z)));
        arrayList.add(new BasicHeader(f421c, "alipay.msp.cashier.dispatch.bytes"));
        arrayList.add(new BasicHeader(f422d, RequestParams.APPLICATION_OCTET_STREAM));
        arrayList.add(new BasicHeader(f423e, "2.0"));
        arrayList.add(new BasicHeader(f424f, "TAOBAO"));
        arrayList.add(new BasicHeader(f420b, C0179a.m536a(str)));
        arrayList.add(new BasicHeader(f425g, "CBC"));
        return arrayList;
    }

    public String m565b() {
        return "4.9.0";
    }

    public String m566c() throws JSONException {
        HashMap hashMap = new HashMap();
        hashMap.put(f432n, Build.MODEL);
        hashMap.put(f426h, "com.alipay.mobilecashier");
        hashMap.put(f427i, "com.alipay.mcpay");
        hashMap.put(f428j, m565b());
        return C0182d.m553a(hashMap, new HashMap());
    }

    public static JSONObject m555a(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(f434p, str);
        jSONObject2.put(f435q, str2);
        jSONObject.put(f433o, jSONObject2);
        return jSONObject;
    }

    public String m562a(String str, JSONObject jSONObject) {
        C0191b a = C0191b.m600a();
        C0193b a2 = C0193b.m619a();
        JSONObject a3 = C0195b.m638a(new JSONObject(), jSONObject);
        try {
            String e;
            String a4;
            Object c;
            a3.put(C0166b.f352c, a2.f472a);
            String str2 = C0166b.f351b;
            C0170c a5 = C0170c.m479a();
            Context context = C0191b.m600a().f467a;
            C0194a a6 = C0194a.m628a(context);
            if (TextUtils.isEmpty(a5.f391a)) {
                String a7 = C0206l.m676a();
                String b = C0206l.m685b();
                e = C0206l.m695e(context);
                a4 = C0204k.m671a(context);
                a5.f391a = "Msp/15.2.2" + " (" + a7 + C0201h.f510b + b + C0201h.f510b + e + C0201h.f510b + a4.substring(0, a4.indexOf("://")) + C0201h.f510b + C0206l.m696f(context) + C0201h.f510b + Float.toString(new TextView(context).getTextSize());
            }
            e = C0194a.m630b(context).f497p;
            a4 = "-1;-1";
            String str3 = Constants.VIA_TO_TYPE_QQ_GROUP;
            String a8 = a6.m636a();
            String b2 = a6.m637b();
            Context context2 = C0191b.m600a().f467a;
            SharedPreferences sharedPreferences = context2.getSharedPreferences("virtualImeiAndImsi", 0);
            CharSequence string = sharedPreferences.getString("virtual_imsi", null);
            if (TextUtils.isEmpty(string)) {
                if (TextUtils.isEmpty(C0193b.m619a().f472a)) {
                    c = C0191b.m600a().m606c();
                    string = TextUtils.isEmpty(c) ? C0170c.m483b() : c.substring(3, 18);
                } else {
                    string = C0194a.m628a(context2).m636a();
                }
                sharedPreferences.edit().putString("virtual_imsi", string).commit();
            }
            CharSequence charSequence = string;
            context2 = C0191b.m600a().f467a;
            SharedPreferences sharedPreferences2 = context2.getSharedPreferences("virtualImeiAndImsi", 0);
            string = sharedPreferences2.getString("virtual_imei", null);
            if (TextUtils.isEmpty(string)) {
                string = TextUtils.isEmpty(C0193b.m619a().f472a) ? C0170c.m483b() : C0194a.m628a(context2).m637b();
                sharedPreferences2.edit().putString("virtual_imei", string).commit();
            }
            CharSequence charSequence2 = string;
            if (a2 != null) {
                a5.f393c = a2.f473b;
            }
            String replace = Build.MANUFACTURER.replace(C0201h.f510b, " ");
            String replace2 = Build.MODEL.replace(C0201h.f510b, " ");
            boolean b3 = C0191b.m602b();
            String str4 = a6.f476a;
            WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
            String ssid = connectionInfo != null ? connectionInfo.getSSID() : "-1";
            connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
            String bssid = connectionInfo != null ? connectionInfo.getBSSID() : "00";
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(a5.f391a).append(C0201h.f510b).append(e).append(C0201h.f510b).append(a4).append(C0201h.f510b).append(str3).append(C0201h.f510b).append(a8).append(C0201h.f510b).append(b2).append(C0201h.f510b).append(a5.f393c).append(C0201h.f510b).append(replace).append(C0201h.f510b).append(replace2).append(C0201h.f510b).append(b3).append(C0201h.f510b).append(str4).append(";-1;-1;").append(a5.f392b).append(C0201h.f510b).append(charSequence).append(C0201h.f510b).append(charSequence2).append(C0201h.f510b).append(ssid).append(C0201h.f510b).append(bssid);
            if (a2 != null) {
                HashMap hashMap = new HashMap();
                hashMap.put(C0166b.f352c, a2.f472a);
                hashMap.put(C0166b.f356g, C0191b.m600a().m606c());
                c = a5.m493b(context, hashMap);
                if (!TextUtils.isEmpty(c)) {
                    stringBuilder.append(C0201h.f510b).append(c);
                }
            }
            stringBuilder.append(")");
            a3.put(str2, stringBuilder.toString());
            a3.put(C0166b.f354e, C0206l.m686b(a.f467a));
            a3.put(C0166b.f355f, C0206l.m680a(a.f467a));
            a3.put(C0166b.f353d, str);
            a3.put(C0166b.f357h, C0165a.f337c);
            a3.put(C0166b.f356g, a.m606c());
            a3.put(C0166b.f359j, a2.f473b);
        } catch (Throwable th) {
        }
        return a3.toString();
    }

    private static boolean m557a(HttpResponse httpResponse) {
        String str = null;
        String str2 = f419a;
        if (httpResponse != null) {
            Header[] allHeaders = httpResponse.getAllHeaders();
            if (allHeaders != null && allHeaders.length > 0) {
                for (Header header : allHeaders) {
                    if (header != null) {
                        String name = header.getName();
                        if (name != null && name.equalsIgnoreCase(str2)) {
                            str = header.getValue();
                            break;
                        }
                    }
                }
            }
        }
        return Boolean.valueOf(str).booleanValue();
    }

    private static String m554a(HttpResponse httpResponse, String str) {
        if (httpResponse == null) {
            return null;
        }
        Header[] allHeaders = httpResponse.getAllHeaders();
        if (allHeaders == null || allHeaders.length <= 0) {
            return null;
        }
        for (Header header : allHeaders) {
            if (header != null) {
                String name = header.getName();
                if (name != null && name.equalsIgnoreCase(str)) {
                    return header.getValue();
                }
            }
        }
        return null;
    }

    public static String m553a(HashMap<String, String> hashMap, HashMap<String, String> hashMap2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (Entry entry : hashMap.entrySet()) {
            jSONObject2.put((String) entry.getKey(), entry.getValue());
        }
        JSONObject jSONObject3 = new JSONObject();
        for (Entry entry2 : hashMap2.entrySet()) {
            jSONObject3.put((String) entry2.getKey(), entry2.getValue());
        }
        jSONObject2.put(f430l, jSONObject3);
        jSONObject.put(f429k, jSONObject2);
        return jSONObject.toString();
    }

    private static boolean m556a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject(f429k);
            if (!jSONObject.has(f430l)) {
                return false;
            }
            String optString = jSONObject.getJSONObject(f430l).optString(f431m, null);
            if (TextUtils.isEmpty(optString)) {
                return false;
            }
            C0191b.m600a();
            C0170c.m479a().m492a(optString);
            return true;
        } catch (JSONException e) {
            return false;
        }
    }

    private static C0177a m558b(Context context, String str) {
        if (f436t == null) {
            f436t = new C0177a(context, str);
        } else if (!TextUtils.equals(str, f436t.f410b)) {
            f436t.f410b = str;
        }
        return f436t;
    }

    private C0180b m551a(Context context) throws Throwable {
        return m561a(context, Constants.STR_EMPTY, C0204k.m671a(context), true);
    }

    public C0180b m560a(Context context, String str) throws Throwable {
        return m561a(context, str, C0204k.m671a(context), true);
    }

    private C0180b m552a(Context context, String str, String str2) throws Throwable {
        return m561a(context, str, str2, true);
    }

    public final C0180b m561a(Context context, String str, String str2, boolean z) throws Throwable {
        String str3 = null;
        C0183e c0183e = new C0183e(this.f438s);
        C0181c a = c0183e.m574a(new C0180b(m566c(), m562a(str, m564a())), this.f437r);
        if (f436t == null) {
            f436t = new C0177a(context, str2);
        } else if (!TextUtils.equals(str2, f436t.f410b)) {
            f436t.f410b = str2;
        }
        HttpResponse a2 = f436t.m520a(a.f418b, m563a(a.f417a, str));
        String str4 = f419a;
        if (a2 != null) {
            Header[] allHeaders = a2.getAllHeaders();
            if (allHeaders != null && allHeaders.length > 0) {
                for (Header header : allHeaders) {
                    if (header != null) {
                        String name = header.getName();
                        if (name != null && name.equalsIgnoreCase(str4)) {
                            str3 = header.getValue();
                            break;
                        }
                    }
                }
            }
        }
        C0180b a3 = c0183e.m573a(new C0181c(Boolean.valueOf(str3).booleanValue(), C0182d.m559b(a2)));
        if (a3 != null && C0182d.m556a(a3.f415a) && z) {
            return m561a(context, str, str2, false);
        }
        return a3;
    }

    private static byte[] m559b(HttpResponse httpResponse) throws IllegalStateException, IOException {
        InputStream content;
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream = null;
        byte[] bArr = new byte[AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT];
        try {
            content = httpResponse.getEntity().getContent();
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int read = content.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream2.write(bArr, 0, read);
                    } catch (Throwable th2) {
                        th = th2;
                        byteArrayOutputStream = byteArrayOutputStream2;
                    }
                }
                bArr = byteArrayOutputStream2.toByteArray();
                if (content != null) {
                    try {
                        content.close();
                    } catch (Exception e) {
                    }
                }
                try {
                    byteArrayOutputStream2.close();
                } catch (Exception e2) {
                }
                return bArr;
            } catch (Throwable th3) {
                th = th3;
                if (content != null) {
                    try {
                        content.close();
                    } catch (Exception e3) {
                    }
                }
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception e4) {
                    }
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            content = null;
            if (content != null) {
                content.close();
            }
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            throw th;
        }
    }
}
