package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: ProGuard */
public final class TpnsUnregisterReq extends JceStruct {
    static UnregInfo cache_unregInfo;
    public short deviceType;
    public UnregInfo unregInfo;

    public TpnsUnregisterReq() {
        this.unregInfo = null;
        this.deviceType = (short) 0;
    }

    public TpnsUnregisterReq(UnregInfo unregInfo, short s) {
        this.unregInfo = null;
        this.deviceType = (short) 0;
        this.unregInfo = unregInfo;
        this.deviceType = s;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.unregInfo, 0);
        jceOutputStream.write(this.deviceType, 1);
    }

    public final void readFrom(JceInputStream jceInputStream) {
        if (cache_unregInfo == null) {
            cache_unregInfo = new UnregInfo();
        }
        this.unregInfo = (UnregInfo) jceInputStream.read(cache_unregInfo, 0, true);
        this.deviceType = jceInputStream.read(this.deviceType, 1, false);
    }
}
