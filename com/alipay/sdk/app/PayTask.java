package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.sdk.app.statistic.C0144a;
import com.alipay.sdk.app.statistic.C0146c;
import com.alipay.sdk.cons.C0165a;
import com.alipay.sdk.cons.C0166b;
import com.alipay.sdk.cons.C0167c;
import com.alipay.sdk.data.C0168a;
import com.alipay.sdk.data.C0170c;
import com.alipay.sdk.packet.impl.C0187d;
import com.alipay.sdk.protocol.C0188a;
import com.alipay.sdk.protocol.C0189b;
import com.alipay.sdk.sys.C0190a;
import com.alipay.sdk.sys.C0191b;
import com.alipay.sdk.tid.C0192a;
import com.alipay.sdk.tid.C0193b;
import com.alipay.sdk.util.C0194a;
import com.alipay.sdk.util.C0198e;
import com.alipay.sdk.util.C0198e.C0134a;
import com.alipay.sdk.util.C0201h;
import com.alipay.sdk.util.C0202i;
import com.alipay.sdk.util.C0203j;
import com.alipay.sdk.util.C0206l;
import com.alipay.sdk.util.H5PayResultModel;
import com.alipay.sdk.widget.C0210a;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class PayTask {
    static final Object f199a;
    private Activity f200b;
    private C0210a f201c;
    private String f202d;
    private String f203e;
    private String f204f;
    private Map<String, C0133a> f205g;

    /* renamed from: com.alipay.sdk.app.PayTask.a */
    private class C0133a {
        String f196a;
        String f197b;
        final /* synthetic */ PayTask f198c;

        private C0133a(PayTask payTask) {
            this.f198c = payTask;
            this.f196a = Constants.STR_EMPTY;
            this.f197b = Constants.STR_EMPTY;
        }

        private String m363a() {
            return this.f196a;
        }

        private void m364a(String str) {
            this.f196a = str;
        }

        private String m365b() {
            return this.f197b;
        }

        private void m366b(String str) {
            this.f197b = str;
        }
    }

    static {
        f199a = C0198e.class;
    }

    public PayTask(Activity activity) {
        this.f202d = "wappaygw.alipay.com/service/rest.htm";
        this.f203e = "mclient.alipay.com/service/rest.htm";
        this.f204f = "mclient.alipay.com/home/exterfaceAssign.htm";
        this.f205g = new HashMap();
        this.f200b = activity;
        C0191b a = C0191b.m600a();
        Context context = this.f200b;
        C0170c.m479a();
        a.m605a(context);
        C0144a.m396a(activity);
        this.f201c = new C0210a(activity, C0210a.f531b);
    }

    public synchronized String pay(String str, boolean z) {
        String str2;
        Object obj = null;
        synchronized (this) {
            String a;
            if (z) {
                m374b();
            }
            try {
                Context context;
                String[] split;
                int i;
                String[] split2;
                int i2;
                String a2 = new C0190a(this.f200b).m598a(str);
                if (!a2.contains("paymethod=\"expressGateway\"") && C0206l.m686b(this.f200b)) {
                    C0198e c0198e = new C0198e(this.f200b, new C0141g(this));
                    a = c0198e.m658a(a2);
                    c0198e.f500a = null;
                    if (!TextUtils.equals(a, C0198e.f499b)) {
                        if (TextUtils.isEmpty(a)) {
                            a = C0142h.m385a();
                        }
                        context = this.f200b;
                        if (!TextUtils.isEmpty(a)) {
                            split = a.split(C0201h.f510b);
                            i = 0;
                            while (i < split.length) {
                                if (split[i].startsWith(C0201h.f511c) && split[i].endsWith(C0201h.f512d)) {
                                    split2 = split[i].substring(8, split[i].length() - 1).split(C0190a.f451b);
                                    i2 = 0;
                                    while (i2 < split2.length) {
                                        if (!split2[i2].startsWith(C0201h.f513e) && split2[i2].endsWith(C0201h.f514f)) {
                                            obj = split2[i2].substring(13, split2[i2].length() - 1);
                                            break;
                                        } else if (split2[i2].startsWith(C0201h.f515g)) {
                                            obj = split2[i2].substring(12);
                                            break;
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                                i++;
                            }
                        }
                        if (!TextUtils.isEmpty(obj)) {
                            C0202i.m664a(context, C0201h.f509a, obj);
                        }
                        C0168a.m472b().m478a(this.f200b);
                        m375c();
                        C0144a.m397a(this.f200b, str);
                        str2 = a;
                    }
                }
                a = m373b(a2);
                context = this.f200b;
                if (TextUtils.isEmpty(a)) {
                    split = a.split(C0201h.f510b);
                    i = 0;
                    while (i < split.length) {
                        split2 = split[i].substring(8, split[i].length() - 1).split(C0190a.f451b);
                        i2 = 0;
                        while (i2 < split2.length) {
                            if (!split2[i2].startsWith(C0201h.f513e)) {
                            }
                            if (split2[i2].startsWith(C0201h.f515g)) {
                                obj = split2[i2].substring(12);
                                break;
                                i++;
                            } else {
                                i2++;
                            }
                        }
                        i++;
                    }
                }
                if (TextUtils.isEmpty(obj)) {
                    C0202i.m664a(context, C0201h.f509a, obj);
                }
            } catch (Throwable th) {
                try {
                    str2 = C0142h.m385a();
                    C0168a.m472b().m478a(this.f200b);
                    m375c();
                    C0144a.m397a(this.f200b, str);
                } catch (Throwable th2) {
                    C0168a.m472b().m478a(this.f200b);
                    m375c();
                    C0144a.m397a(this.f200b, str);
                }
            }
            C0168a.m472b().m478a(this.f200b);
            m375c();
            C0144a.m397a(this.f200b, str);
            str2 = a;
        }
        return str2;
    }

    public synchronized Map<String, String> payV2(String str, boolean z) {
        return C0203j.m669a(pay(str, z));
    }

    public synchronized String fetchTradeToken() {
        return C0202i.m665b(this.f200b, C0201h.f509a, Constants.STR_EMPTY);
    }

    public synchronized String fetchOrderInfoFromH5PayUrl(String str) {
        String trim;
        if (!TextUtils.isEmpty(str)) {
            String trim2;
            trim = str.trim();
            if (trim.startsWith("https://" + this.f202d) || trim.startsWith("http://" + this.f202d)) {
                trim2 = trim.replaceFirst("(http|https)://" + this.f202d + "\\?", Constants.STR_EMPTY).trim();
                if (!TextUtils.isEmpty(trim2)) {
                    trim = "_input_charset=\"utf-8\"&ordertoken=\"" + C0206l.m677a("<request_token>", "</request_token>", (String) C0206l.m679a(trim2).get("req_data")) + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + new C0190a(this.f200b).m599a("sc", "h5tonative") + C0201h.f514f;
                }
            }
            try {
                if (trim.startsWith("https://" + this.f203e) || trim.startsWith("http://" + this.f203e)) {
                    trim2 = trim.replaceFirst("(http|https)://" + this.f203e + "\\?", Constants.STR_EMPTY).trim();
                    if (!TextUtils.isEmpty(trim2)) {
                        trim = "_input_charset=\"utf-8\"&ordertoken=\"" + C0206l.m677a("<request_token>", "</request_token>", (String) C0206l.m679a(trim2).get("req_data")) + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + new C0190a(this.f200b).m599a("sc", "h5tonative") + C0201h.f514f;
                    }
                }
                if ((trim.startsWith("https://" + this.f204f) || trim.startsWith("http://" + this.f204f)) && trim.contains("alipay.wap.create.direct.pay.by.user") && !TextUtils.isEmpty(trim.replaceFirst("(http|https)://" + this.f204f + "\\?", Constants.STR_EMPTY).trim())) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(SocialConstants.PARAM_URL, str);
                        jSONObject.put("bizcontext", new C0190a(this.f200b).m599a("sc", "h5tonative"));
                        trim = "new_external_info==" + jSONObject.toString();
                    } catch (Throwable th) {
                    }
                }
                if (Pattern.compile("^(http|https)://(maliprod\\.alipay\\.com\\/w\\/trade_pay\\.do.?|mali\\.alipay\\.com\\/w\\/trade_pay\\.do.?|mclient\\.alipay\\.com\\/w\\/trade_pay\\.do.?)").matcher(str).find()) {
                    trim = C0206l.m677a("?", Constants.STR_EMPTY, str);
                    if (!TextUtils.isEmpty(trim)) {
                        Map a = C0206l.m679a(trim);
                        StringBuilder stringBuilder = new StringBuilder();
                        if (m372a(false, true, C0146c.f240G, stringBuilder, a, C0146c.f240G, "alipay_trade_no")) {
                            m372a(true, false, "pay_phase_id", stringBuilder, a, "payPhaseId", "pay_phase_id", "out_relation_id");
                            stringBuilder.append("&biz_sub_type=\"TRADE\"");
                            stringBuilder.append("&biz_type=\"trade\"");
                            trim = (String) a.get("app_name");
                            if (TextUtils.isEmpty(trim) && !TextUtils.isEmpty((CharSequence) a.get("cid"))) {
                                trim = "ali1688";
                            } else if (TextUtils.isEmpty(trim) && !(TextUtils.isEmpty((CharSequence) a.get("sid")) && TextUtils.isEmpty((CharSequence) a.get("s_id")))) {
                                trim = "tb";
                            }
                            stringBuilder.append("&app_name=\"" + trim + C0201h.f514f);
                            if (m372a(true, true, "extern_token", stringBuilder, a, "extern_token", "cid", "sid", "s_id")) {
                                m372a(true, false, "appenv", stringBuilder, a, "appenv");
                                stringBuilder.append("&pay_channel_id=\"alipay_sdk\"");
                                C0133a c0133a = new C0133a();
                                c0133a.f196a = (String) a.get("return_url");
                                c0133a.f197b = (String) a.get("pay_order_id");
                                trim = stringBuilder.toString() + "&bizcontext=\"" + new C0190a(this.f200b).m599a("sc", "h5tonative") + C0201h.f514f;
                                this.f205g.put(trim, c0133a);
                            } else {
                                trim = Constants.STR_EMPTY;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
            }
        }
        trim = Constants.STR_EMPTY;
        return trim;
    }

    private static boolean m372a(boolean z, boolean z2, String str, StringBuilder stringBuilder, Map<String, String> map, String... strArr) {
        String str2;
        String str3 = Constants.STR_EMPTY;
        for (Object obj : strArr) {
            if (!TextUtils.isEmpty((CharSequence) map.get(obj))) {
                str2 = (String) map.get(obj);
                break;
            }
        }
        str2 = str3;
        if (TextUtils.isEmpty(str2)) {
            if (z2) {
                return false;
            }
        } else if (z) {
            stringBuilder.append(C0190a.f451b).append(str).append("=\"").append(str2).append(C0201h.f514f);
        } else {
            stringBuilder.append(str).append("=\"").append(str2).append(C0201h.f514f);
        }
        return true;
    }

    public synchronized H5PayResultModel h5Pay(String str, boolean z) {
        H5PayResultModel h5PayResultModel;
        synchronized (this) {
            H5PayResultModel h5PayResultModel2 = new H5PayResultModel();
            try {
                str.trim();
                String[] split = pay(str, z).split(C0201h.f510b);
                Map hashMap = new HashMap();
                for (String str2 : split) {
                    String substring = str2.substring(0, str2.indexOf("={"));
                    String str3 = substring + "={";
                    hashMap.put(substring, str2.substring(str3.length() + str2.indexOf(str3), str2.lastIndexOf(C0201h.f512d)));
                }
                if (hashMap.containsKey(C0203j.f517a)) {
                    h5PayResultModel2.setResultCode((String) hashMap.get(C0203j.f517a));
                }
                if (hashMap.containsKey("callBackUrl")) {
                    h5PayResultModel2.setReturnUrl((String) hashMap.get("callBackUrl"));
                } else if (hashMap.containsKey(C0203j.f519c)) {
                    try {
                        String str4 = (String) hashMap.get(C0203j.f519c);
                        if (str4.length() > 15) {
                            C0133a c0133a = (C0133a) this.f205g.get(str);
                            if (c0133a != null) {
                                if (TextUtils.isEmpty(c0133a.f197b)) {
                                    h5PayResultModel2.setReturnUrl(c0133a.f196a);
                                } else {
                                    h5PayResultModel2.setReturnUrl(C0168a.m472b().f384j.replace("$OrderId$", c0133a.f197b));
                                }
                                this.f205g.remove(str);
                                h5PayResultModel = h5PayResultModel2;
                            } else {
                                CharSequence a = C0206l.m677a("&callBackUrl=\"", C0201h.f514f, str4);
                                if (TextUtils.isEmpty(a)) {
                                    a = C0206l.m677a("&call_back_url=\"", C0201h.f514f, str4);
                                    if (TextUtils.isEmpty(a)) {
                                        a = C0206l.m677a(C0165a.f348n, C0201h.f514f, str4);
                                        if (TextUtils.isEmpty(a)) {
                                            a = URLDecoder.decode(C0206l.m677a(C0165a.f349o, C0190a.f451b, str4), "utf-8");
                                            if (TextUtils.isEmpty(a)) {
                                                str4 = URLDecoder.decode(C0206l.m677a("&callBackUrl=", C0190a.f451b, str4), "utf-8");
                                                if (TextUtils.isEmpty(str4)) {
                                                    str4 = C0168a.m472b().f384j;
                                                }
                                                h5PayResultModel2.setReturnUrl(URLDecoder.decode(str4, "utf-8"));
                                            }
                                        }
                                    }
                                }
                                CharSequence charSequence = a;
                                if (TextUtils.isEmpty(str4)) {
                                    str4 = C0168a.m472b().f384j;
                                }
                                h5PayResultModel2.setReturnUrl(URLDecoder.decode(str4, "utf-8"));
                            }
                        } else {
                            C0133a c0133a2 = (C0133a) this.f205g.get(str);
                            if (c0133a2 != null) {
                                h5PayResultModel2.setReturnUrl(c0133a2.f196a);
                                this.f205g.remove(str);
                                h5PayResultModel = h5PayResultModel2;
                            }
                        }
                    } catch (Throwable th) {
                    }
                }
            } catch (Throwable th2) {
            }
            h5PayResultModel = h5PayResultModel2;
        }
        return h5PayResultModel;
    }

    private static String m370a(String str, String str2) {
        String str3 = str2 + "={";
        return str.substring(str3.length() + str.indexOf(str3), str.lastIndexOf(C0201h.f512d));
    }

    private C0134a m367a() {
        return new C0141g(this);
    }

    private void m374b() {
        if (this.f201c != null) {
            this.f201c.m712a();
        }
    }

    private void m375c() {
        if (this.f201c != null) {
            this.f201c.m713b();
        }
    }

    private String m369a(String str) {
        String a = new C0190a(this.f200b).m598a(str);
        if (a.contains("paymethod=\"expressGateway\"")) {
            return m373b(a);
        }
        if (!C0206l.m686b(this.f200b)) {
            return m373b(a);
        }
        C0198e c0198e = new C0198e(this.f200b, new C0141g(this));
        String a2 = c0198e.m658a(a);
        c0198e.f500a = null;
        if (TextUtils.equals(a2, C0198e.f499b)) {
            return m373b(a);
        }
        if (TextUtils.isEmpty(a2)) {
            return C0142h.m385a();
        }
        return a2;
    }

    public String getVersion() {
        return C0165a.f339e;
    }

    private String m373b(String str) {
        C0143i c0143i;
        int i = 0;
        m374b();
        C0192a c0192a;
        try {
            List a = C0189b.m586a(new C0187d().m560a(this.f200b, str).m546a().optJSONObject(C0167c.f362c).optJSONObject(C0167c.f363d));
            for (int i2 = 0; i2 < a.size(); i2++) {
                if (((C0189b) a.get(i2)).f447a == C0188a.Update) {
                    String[] strArr = ((C0189b) a.get(i2)).f448b;
                    if (strArr.length == 3 && TextUtils.equals(C0166b.f352c, strArr[0])) {
                        Context context = C0191b.m600a().f467a;
                        C0193b a2 = C0193b.m619a();
                        if (!(TextUtils.isEmpty(strArr[1]) || TextUtils.isEmpty(strArr[2]))) {
                            a2.f472a = strArr[1];
                            a2.f473b = strArr[2];
                            c0192a = new C0192a(context);
                            c0192a.m617a(C0194a.m628a(context).m636a(), C0194a.m628a(context).m637b(), a2.f472a, a2.f473b);
                            c0192a.close();
                        }
                    }
                }
            }
            m375c();
            while (i < a.size()) {
                if (((C0189b) a.get(i)).f447a == C0188a.WapPay) {
                    String a3 = m368a((C0189b) a.get(i));
                    m375c();
                    return a3;
                }
                i++;
            }
            m375c();
            c0143i = null;
        } catch (Exception e) {
            c0192a.close();
        } catch (Throwable e2) {
            C0143i a4 = C0143i.m392a(C0143i.NETWORK_ERROR.f228h);
            C0144a.m401a(C0146c.f241a, e2);
            m375c();
            c0143i = a4;
        } catch (Throwable th) {
            m375c();
        }
        if (c0143i == null) {
            c0143i = C0143i.m392a(C0143i.FAILED.f228h);
        }
        return C0142h.m386a(c0143i.f228h, c0143i.f229i, Constants.STR_EMPTY);
    }

    private String m368a(C0189b c0189b) {
        String[] strArr = c0189b.f448b;
        Intent intent = new Intent(this.f200b, H5PayActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(SocialConstants.PARAM_URL, strArr[0]);
        if (strArr.length == 2) {
            bundle.putString("cookie", strArr[1]);
        }
        intent.putExtras(bundle);
        this.f200b.startActivity(intent);
        synchronized (f199a) {
            try {
                f199a.wait();
            } catch (InterruptedException e) {
                return C0142h.m385a();
            }
        }
        String str = C0142h.f219a;
        if (TextUtils.isEmpty(str)) {
            return C0142h.m385a();
        }
        return str;
    }
}
