package com.alipay.sdk.auth;

import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;

/* renamed from: com.alipay.sdk.auth.a */
final class C0149a implements DownloadListener {
    final /* synthetic */ AuthActivity f292a;

    C0149a(AuthActivity authActivity) {
        this.f292a = authActivity;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            this.f292a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Throwable th) {
        }
    }
}
