package com.alipay.sdk.util;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;

/* renamed from: com.alipay.sdk.util.m */
final class C0207m implements DownloadListener {
    final /* synthetic */ Activity f527a;

    C0207m(Activity activity) {
        this.f527a = activity;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            this.f527a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Throwable th) {
        }
    }
}
