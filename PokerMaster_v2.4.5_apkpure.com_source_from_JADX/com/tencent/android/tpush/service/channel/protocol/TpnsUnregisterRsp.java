package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: ProGuard */
public final class TpnsUnregisterRsp extends JceStruct {
    public byte unregResult;

    public TpnsUnregisterRsp() {
        this.unregResult = (byte) 0;
    }

    public TpnsUnregisterRsp(byte b) {
        this.unregResult = (byte) 0;
        this.unregResult = b;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.unregResult, 0);
    }

    public final void readFrom(JceInputStream jceInputStream) {
        this.unregResult = jceInputStream.read(this.unregResult, 0, true);
    }
}
