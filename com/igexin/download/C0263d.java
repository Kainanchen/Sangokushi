package com.igexin.download;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.igexin.download.d */
class C0263d extends ContentObserver {
    final /* synthetic */ DownloadService f711a;

    public C0263d(DownloadService downloadService) {
        this.f711a = downloadService;
        super(new Handler());
    }

    public void onChange(boolean z) {
        this.f711a.m898a();
    }
}
