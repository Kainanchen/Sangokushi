package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: ProGuard */
public final class TpnsRedirectRsp extends JceStruct {
    public long ip;
    public int port;

    public TpnsRedirectRsp() {
        this.ip = 0;
        this.port = 0;
    }

    public TpnsRedirectRsp(long j, int i) {
        this.ip = 0;
        this.port = 0;
        this.ip = j;
        this.port = i;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.ip, 0);
        jceOutputStream.write(this.port, 1);
    }

    public final void readFrom(JceInputStream jceInputStream) {
        this.ip = jceInputStream.read(this.ip, 0, false);
        this.port = jceInputStream.read(this.port, 1, false);
    }
}
