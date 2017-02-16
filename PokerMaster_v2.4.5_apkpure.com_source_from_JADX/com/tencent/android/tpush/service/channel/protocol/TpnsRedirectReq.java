package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: ProGuard */
public final class TpnsRedirectReq extends JceStruct {
    public byte network;
    public byte op;

    public TpnsRedirectReq() {
        this.network = (byte) 0;
        this.op = (byte) 0;
    }

    public TpnsRedirectReq(byte b, byte b2) {
        this.network = (byte) 0;
        this.op = (byte) 0;
        this.network = b;
        this.op = b2;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.network, 0);
        jceOutputStream.write(this.op, 1);
    }

    public final void readFrom(JceInputStream jceInputStream) {
        this.network = jceInputStream.read(this.network, 0, false);
        this.op = jceInputStream.read(this.op, 1, false);
    }
}
