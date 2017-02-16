package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: ProGuard */
public final class UnregInfo extends JceStruct {
    static AppInfo cache_appInfo;
    public AppInfo appInfo;
    public byte isUninstall;
    public long timestamp;

    public UnregInfo() {
        this.appInfo = null;
        this.isUninstall = (byte) 0;
        this.timestamp = 0;
    }

    public UnregInfo(AppInfo appInfo, byte b, long j) {
        this.appInfo = null;
        this.isUninstall = (byte) 0;
        this.timestamp = 0;
        this.appInfo = appInfo;
        this.isUninstall = b;
        this.timestamp = j;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.appInfo, 0);
        jceOutputStream.write(this.isUninstall, 1);
        jceOutputStream.write(this.timestamp, 2);
    }

    public final void readFrom(JceInputStream jceInputStream) {
        if (cache_appInfo == null) {
            cache_appInfo = new AppInfo();
        }
        this.appInfo = (AppInfo) jceInputStream.read(cache_appInfo, 0, true);
        this.isUninstall = jceInputStream.read(this.isUninstall, 1, true);
        this.timestamp = jceInputStream.read(this.timestamp, 2, false);
    }
}
