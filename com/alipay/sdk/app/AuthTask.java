package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import com.alipay.sdk.app.statistic.C0144a;
import com.alipay.sdk.app.statistic.C0146c;
import com.alipay.sdk.cons.C0167c;
import com.alipay.sdk.data.C0168a;
import com.alipay.sdk.data.C0170c;
import com.alipay.sdk.packet.impl.C0184a;
import com.alipay.sdk.protocol.C0188a;
import com.alipay.sdk.protocol.C0189b;
import com.alipay.sdk.sys.C0190a;
import com.alipay.sdk.sys.C0191b;
import com.alipay.sdk.util.C0198e;
import com.alipay.sdk.util.C0198e.C0134a;
import com.alipay.sdk.util.C0203j;
import com.alipay.sdk.util.C0206l;
import com.alipay.sdk.widget.C0210a;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class AuthTask {
    static final Object f190a;
    private static final int f191b = 73;
    private Activity f192c;
    private C0210a f193d;

    static {
        f190a = C0198e.class;
    }

    public AuthTask(Activity activity) {
        this.f192c = activity;
        C0191b a = C0191b.m600a();
        Context context = this.f192c;
        C0170c.m479a();
        a.m605a(context);
        C0144a.m396a(activity);
        this.f193d = new C0210a(activity, C0210a.f532c);
    }

    private C0134a m353a() {
        return new C0135a(this);
    }

    private void m359b() {
        if (this.f193d != null) {
            this.f193d.m712a();
        }
    }

    private void m360c() {
        if (this.f193d != null) {
            this.f193d.m713b();
        }
    }

    public synchronized Map<String, String> authV2(String str, boolean z) {
        return C0203j.m669a(auth(str, z));
    }

    public synchronized String auth(String str, boolean z) {
        String a;
        if (z) {
            m359b();
        }
        C0191b a2 = C0191b.m600a();
        Context context = this.f192c;
        C0170c.m479a();
        a2.m605a(context);
        String a3 = C0142h.m385a();
        try {
            Context context2 = this.f192c;
            String a4 = new C0190a(this.f192c).m598a(str);
            if (m357a(context2)) {
                a = new C0198e(context2, new C0135a(this)).m658a(a4);
                if (!TextUtils.equals(a, C0198e.f499b)) {
                    if (TextUtils.isEmpty(a)) {
                        a = C0142h.m385a();
                    }
                    C0168a.m472b().m478a(this.f192c);
                    m360c();
                    C0144a.m397a(this.f192c, str);
                }
            }
            a = m358b(context2, a4);
            C0168a.m472b().m478a(this.f192c);
            m360c();
            C0144a.m397a(this.f192c, str);
        } catch (Exception e) {
            C0168a.m472b().m478a(this.f192c);
            m360c();
            C0144a.m397a(this.f192c, str);
            a = a3;
        } catch (Throwable th) {
            C0168a.m472b().m478a(this.f192c);
            m360c();
            C0144a.m397a(this.f192c, str);
        }
        return a;
    }

    private String m354a(Activity activity, String str) {
        String a = new C0190a(this.f192c).m598a(str);
        if (!m357a((Context) activity)) {
            return m358b(activity, a);
        }
        String a2 = new C0198e(activity, new C0135a(this)).m658a(a);
        if (TextUtils.equals(a2, C0198e.f499b)) {
            return m358b(activity, a);
        }
        if (TextUtils.isEmpty(a2)) {
            return C0142h.m385a();
        }
        return a2;
    }

    private String m358b(Activity activity, String str) {
        String a;
        C0143i c0143i;
        m359b();
        C0143i c0143i2 = null;
        try {
            List a2 = C0189b.m586a(new C0184a().m560a((Context) activity, str).m546a().optJSONObject(C0167c.f362c).optJSONObject(C0167c.f363d));
            m360c();
            for (int i = 0; i < a2.size(); i++) {
                if (((C0189b) a2.get(i)).f447a == C0188a.WapPay) {
                    a = m355a((C0189b) a2.get(i));
                    return a;
                }
            }
            m360c();
            c0143i = null;
        } catch (IOException e) {
            a = e;
            c0143i2 = C0143i.m392a(C0143i.NETWORK_ERROR.f228h);
            C0144a.m401a(C0146c.f241a, (Throwable) a);
            c0143i = c0143i2;
            if (c0143i == null) {
                c0143i = C0143i.m392a(C0143i.FAILED.f228h);
            }
            return C0142h.m386a(c0143i.f228h, c0143i.f229i, Constants.STR_EMPTY);
        } catch (Throwable th) {
            a = th;
            C0144a.m399a(C0146c.f242b, C0146c.f259s, (Throwable) a);
            c0143i = c0143i2;
            if (c0143i == null) {
                c0143i = C0143i.m392a(C0143i.FAILED.f228h);
            }
            return C0142h.m386a(c0143i.f228h, c0143i.f229i, Constants.STR_EMPTY);
        } finally {
            m360c();
        }
        if (c0143i == null) {
            c0143i = C0143i.m392a(C0143i.FAILED.f228h);
        }
        return C0142h.m386a(c0143i.f228h, c0143i.f229i, Constants.STR_EMPTY);
    }

    private String m355a(C0189b c0189b) {
        String[] strArr = c0189b.f448b;
        Bundle bundle = new Bundle();
        bundle.putString(SocialConstants.PARAM_URL, strArr[0]);
        Intent intent = new Intent(this.f192c, H5AuthActivity.class);
        intent.putExtras(bundle);
        this.f192c.startActivity(intent);
        synchronized (f190a) {
            try {
                f190a.wait();
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

    private static boolean m357a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(C0206l.f524b, AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
            if (packageInfo != null && packageInfo.versionCode >= f191b) {
                return true;
            }
            return false;
        } catch (NameNotFoundException e) {
            return false;
        }
    }
}
