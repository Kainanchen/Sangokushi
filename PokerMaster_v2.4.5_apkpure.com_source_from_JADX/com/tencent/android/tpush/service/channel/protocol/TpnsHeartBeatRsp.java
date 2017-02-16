package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: ProGuard */
public final class TpnsHeartBeatRsp extends JceStruct {
    public byte padding;

    public TpnsHeartBeatRsp() {
        this.padding = (byte) 0;
    }

    public TpnsHeartBeatRsp(byte b) {
        this.padding = (byte) 0;
        this.padding = b;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.padding, 0);
    }

    public final void readFrom(JceInputStream jceInputStream) {
        this.padding = jceInputStream.read(this.padding, 0, true);
    }
}
