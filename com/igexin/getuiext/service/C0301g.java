package com.igexin.getuiext.service;

import com.igexin.download.DownloadInfo;
import com.igexin.download.Downloads;
import java.util.TimerTask;

/* renamed from: com.igexin.getuiext.service.g */
class C0301g extends TimerTask {
    final /* synthetic */ C0298d f819a;

    private C0301g(C0298d c0298d) {
        this.f819a = c0298d;
    }

    public void run() {
        if (this.f819a.f810e.size() == 0) {
            this.f819a.f813h.cancel();
            this.f819a.f813h = null;
            return;
        }
        int size = this.f819a.f810e.size();
        for (int i = 0; i < size; i++) {
            int keyAt = this.f819a.f810e.keyAt(i);
            if (System.currentTimeMillis() - ((Long) this.f819a.f810e.valueAt(i)).longValue() > 300000) {
                this.f819a.f810e.remove(keyAt);
                DownloadInfo downloadInfo = (DownloadInfo) this.f819a.f811f.get(keyAt);
                if (downloadInfo != null) {
                    downloadInfo.mStatus = Downloads.STATUS_HTTP_DATA_ERROR;
                    this.f819a.update(downloadInfo);
                }
            }
        }
    }
}
