package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: ProGuard */
public final class TpnsConfigReq extends JceStruct {
    public long confVersion;

    public TpnsConfigReq() {
        this.confVersion = 0;
    }

    public TpnsConfigReq(long j) {
        this.confVersion = 0;
        this.confVersion = j;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.confVersion, 0);
    }

    public final void readFrom(JceInputStream jceInputStream) {
        this.confVersion = jceInputStream.read(this.confVersion, 0, true);
    }
}
