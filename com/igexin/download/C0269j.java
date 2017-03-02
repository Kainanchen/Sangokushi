package com.igexin.download;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.wxop.stat.common.StatConstants;

/* renamed from: com.igexin.download.j */
class C0269j extends Handler {
    final /* synthetic */ SdkDownLoader f723a;

    C0269j(SdkDownLoader sdkDownLoader, Looper looper) {
        this.f723a = sdkDownLoader;
        super(looper);
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                synchronized (this.f723a.f704h) {
                    if (this.f723a.f703g.size() > 0 && this.f723a.updateData.size() > 0) {
                        for (DownloadInfo downloadInfo : this.f723a.updateData.values()) {
                            IDownloadCallback a = this.f723a.m929a(downloadInfo.mData8);
                            if (a != null) {
                                a.update(downloadInfo);
                            }
                        }
                    }
                    break;
                }
            default:
        }
    }
}
