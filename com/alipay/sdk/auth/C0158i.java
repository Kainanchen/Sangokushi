package com.alipay.sdk.auth;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.alipay.sdk.cons.C0167c;
import com.alipay.sdk.packet.C0180b;
import com.alipay.sdk.packet.C0182d;
import com.alipay.sdk.packet.impl.C0184a;
import com.alipay.sdk.protocol.C0188a;
import com.alipay.sdk.protocol.C0189b;
import java.util.List;

/* renamed from: com.alipay.sdk.auth.i */
final class C0158i implements Runnable {
    final /* synthetic */ Activity f305a;
    final /* synthetic */ StringBuilder f306b;
    final /* synthetic */ APAuthInfo f307c;

    C0158i(Activity activity, StringBuilder stringBuilder, APAuthInfo aPAuthInfo) {
        this.f305a = activity;
        this.f306b = stringBuilder;
        this.f307c = aPAuthInfo;
    }

    public final void run() {
        try {
            C0180b c0180b = null;
            try {
                c0180b = new C0184a().m560a(this.f305a, this.f306b.toString());
            } catch (Throwable th) {
            }
            if (C0157h.f303c != null) {
                C0157h.f303c.m713b();
                C0157h.f303c = null;
            }
            if (c0180b == null) {
                C0157h.f304d = this.f307c.getRedirectUri() + "?resultCode=202";
                C0157h.m439a(this.f305a, C0157h.f304d);
                if (C0157h.f303c != null) {
                    C0157h.f303c.m713b();
                    return;
                }
                return;
            }
            List a = C0189b.m586a(c0180b.m546a().optJSONObject(C0167c.f362c).optJSONObject(C0167c.f363d));
            for (int i = 0; i < a.size(); i++) {
                if (((C0189b) a.get(i)).f447a == C0188a.WapPay) {
                    C0157h.f304d = ((C0189b) a.get(i)).f448b[0];
                    break;
                }
            }
            if (TextUtils.isEmpty(C0157h.f304d)) {
                C0157h.f304d = this.f307c.getRedirectUri() + "?resultCode=202";
                C0157h.m439a(this.f305a, C0157h.f304d);
                if (C0157h.f303c != null) {
                    C0157h.f303c.m713b();
                    return;
                }
                return;
            }
            Intent intent = new Intent(this.f305a, AuthActivity.class);
            intent.putExtra(C0182d.f430l, C0157h.f304d);
            intent.putExtra("redirectUri", this.f307c.getRedirectUri());
            this.f305a.startActivity(intent);
            if (C0157h.f303c != null) {
                C0157h.f303c.m713b();
            }
        } catch (Exception e) {
            if (C0157h.f303c != null) {
                C0157h.f303c.m713b();
            }
        } catch (Throwable th2) {
            if (C0157h.f303c != null) {
                C0157h.f303c.m713b();
            }
        }
    }
}
