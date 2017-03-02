package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.p004a.C0085a;
import com.alipay.apmobilesecuritysdk.p005b.C0086a;
import com.alipay.apmobilesecuritysdk.p008e.C0093a;
import com.alipay.apmobilesecuritysdk.p009f.C0094a;
import com.alipay.apmobilesecuritysdk.p009f.C0097d;
import com.alipay.apmobilesecuritysdk.p009f.C0100g;
import com.alipay.apmobilesecuritysdk.p009f.C0101h;
import com.alipay.apmobilesecuritysdk.p009f.C0102i;
import com.alipay.apmobilesecuritysdk.p010g.C0105b;
import com.alipay.p011b.p012a.p013a.p014a.C0110a;
import com.alipay.sdk.cons.C0166b;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import java.util.HashMap;
import java.util.Map;

public class APSecuritySdk {
    private static APSecuritySdk f134a;
    private static Object f135c;
    private Context f136b;

    /* renamed from: com.alipay.apmobilesecuritysdk.face.APSecuritySdk.1 */
    class C01031 implements Runnable {
        final /* synthetic */ Map f130a;
        final /* synthetic */ InitResultListener f131b;
        final /* synthetic */ APSecuritySdk f132c;

        C01031(APSecuritySdk aPSecuritySdk, Map map, InitResultListener initResultListener) {
            this.f132c = aPSecuritySdk;
            this.f130a = map;
            this.f131b = initResultListener;
        }

        public void run() {
            new C0085a(this.f132c.f136b).m133a(this.f130a);
            if (this.f131b != null) {
                this.f131b.onResult(this.f132c.getTokenResult());
            }
        }
    }

    public interface InitResultListener {
        void onResult(TokenResult tokenResult);
    }

    public class TokenResult {
        final /* synthetic */ APSecuritySdk f133a;
        public String apdid;
        public String apdidToken;
        public String clientKey;
        public String umidToken;

        public TokenResult(APSecuritySdk aPSecuritySdk) {
            this.f133a = aPSecuritySdk;
        }
    }

    static {
        f135c = new Object();
    }

    private APSecuritySdk(Context context) {
        this.f136b = context;
    }

    public static APSecuritySdk getInstance(Context context) {
        if (f134a == null) {
            synchronized (f135c) {
                if (f134a == null) {
                    f134a = new APSecuritySdk(context);
                }
            }
        }
        return f134a;
    }

    public static String getUtdid(Context context) {
        return Constants.STR_EMPTY;
    }

    public String getApdidToken() {
        return C0085a.m129a(this.f136b, Constants.STR_EMPTY);
    }

    public String getSdkName() {
        return "security-sdk-token";
    }

    public String getSdkVersion() {
        return "3.2.0-20160621";
    }

    public synchronized TokenResult getTokenResult() {
        TokenResult tokenResult;
        tokenResult = new TokenResult(this);
        try {
            tokenResult.apdidToken = C0085a.m129a(this.f136b, Constants.STR_EMPTY);
            tokenResult.clientKey = C0101h.m196c(this.f136b);
            tokenResult.apdid = C0085a.m128a(this.f136b);
            Context context = this.f136b;
            tokenResult.umidToken = C0093a.m150a();
        } catch (Throwable th) {
        }
        return tokenResult;
    }

    public void initToken(int i, Map<String, String> map, InitResultListener initResultListener) {
        C0086a.m134a().m135a(i);
        String a = C0101h.m189a(this.f136b);
        String c = C0086a.m134a().m137c();
        if (C0110a.m237b(a) && !C0110a.m235a(a, c)) {
            C0094a.m154a(this.f136b);
            C0097d.m169a(this.f136b);
            C0100g.m187a(this.f136b);
            C0102i.m214h();
        }
        if (!C0110a.m235a(a, c)) {
            C0101h.m190a(this.f136b, c);
        }
        Object a2 = C0110a.m233a(map, C0166b.f356g, Constants.STR_EMPTY);
        c = C0110a.m233a(map, C0166b.f352c, Constants.STR_EMPTY);
        String a3 = C0110a.m233a(map, "userId", Constants.STR_EMPTY);
        if (C0110a.m234a((String) a2)) {
            Context context = this.f136b;
            a2 = Constants.STR_EMPTY;
        }
        Map hashMap = new HashMap();
        hashMap.put(C0166b.f356g, a2);
        hashMap.put(C0166b.f352c, c);
        hashMap.put("userId", a3);
        hashMap.put(SocialConstants.PARAM_APPNAME, Constants.STR_EMPTY);
        hashMap.put("appKeyClient", Constants.STR_EMPTY);
        hashMap.put("appchannel", Constants.STR_EMPTY);
        hashMap.put("rpcVersion", Constants.VIA_TO_TYPE_QQ_DISCUSS_GROUP);
        C0105b.m220a().m223a(new C01031(this, hashMap, initResultListener));
    }
}
