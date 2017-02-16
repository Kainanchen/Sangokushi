package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: ProGuard */
public final class NetworkInfo extends JceStruct {
    public int ip;
    public byte network;
    public byte op;

    public NetworkInfo() {
        this.ip = 0;
        this.network = (byte) 0;
        this.op = (byte) 0;
    }

    public NetworkInfo(int i, byte b, byte b2) {
        this.ip = 0;
        this.network = (byte) 0;
        this.op = (byte) 0;
        this.ip = i;
        this.network = b;
        this.op = b2;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.ip, 0);
        jceOutputStream.write(this.network, 1);
        jceOutputStream.write(this.op, 2);
    }

    public final void readFrom(JceInputStream jceInputStream) {
        this.ip = jceInputStream.read(this.ip, 0, true);
        this.network = jceInputStream.read(this.network, 1, true);
        this.op = jceInputStream.read(this.op, 2, false);
    }
}
