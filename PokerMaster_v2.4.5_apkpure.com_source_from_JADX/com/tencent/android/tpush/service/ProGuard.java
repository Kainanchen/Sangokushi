package com.tencent.android.tpush.service;

import com.qq.taf.jce.JceStruct;
import com.tencent.android.tpush.XGPushConfig;
import com.tencent.android.tpush.service.cache.CacheManager;
import com.tencent.android.tpush.service.channel.exception.ChannelException;
import com.tencent.android.tpush.service.channel.protocol.TpnsUnregisterReq;

/* renamed from: com.tencent.android.tpush.service.s */
class ProGuard implements com.tencent.android.tpush.service.channel.ProGuard {
    final /* synthetic */ String f7787a;
    final /* synthetic */ ProGuard f7788b;

    ProGuard(ProGuard proGuard, String str) {
        this.f7788b = proGuard;
        this.f7787a = str;
    }

    public void m5412a(JceStruct jceStruct, int i, JceStruct jceStruct2, com.tencent.android.tpush.service.channel.ProGuard proGuard) {
        if (XGPushConfig.enableDebug) {
            com.tencent.android.tpush.p067a.ProGuard.m4715c("PushServiceNetworkHandler", "Report uninstall with pkgName = " + this.f7787a + ", reponseCode = " + i);
        }
        if (i == 0) {
            CacheManager.UninstallInfoSuccessByPkgName(this.f7787a);
            com.tencent.android.tpush.service.p072b.ProGuard.m5094a().m5100a(ProGuard.m5376e(), this.f7787a);
            com.tencent.android.tpush.service.p072b.ProGuard.m5021a().m5074d(ProGuard.m5376e(), this.f7787a);
            return;
        }
        com.tencent.android.tpush.p067a.ProGuard.m4723h("PushServiceNetworkHandler", " uninstall report fail responseCode=" + i);
        this.f7788b.m5391a(i, "\u670d\u52a1\u5668\u5904\u7406\u5931\u8d25\uff0c\u8fd4\u56de\u9519\u8bef", this.f7787a, (TpnsUnregisterReq) jceStruct, proGuard);
    }

    public void m5414a(JceStruct jceStruct, ChannelException channelException, com.tencent.android.tpush.service.channel.ProGuard proGuard) {
        this.f7788b.m5391a(channelException.errorCode, channelException.getMessage(), this.f7787a, (TpnsUnregisterReq) jceStruct, proGuard);
    }

    public void m5413a(JceStruct jceStruct, com.tencent.android.tpush.service.channel.ProGuard proGuard) {
    }
}
