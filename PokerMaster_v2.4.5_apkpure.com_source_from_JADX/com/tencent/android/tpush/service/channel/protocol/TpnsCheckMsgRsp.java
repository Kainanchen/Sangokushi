package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: ProGuard */
public final class TpnsCheckMsgRsp extends JceStruct {
    public short result;

    public TpnsCheckMsgRsp() {
        this.result = (short) 0;
    }

    public TpnsCheckMsgRsp(short s) {
        this.result = (short) 0;
        this.result = s;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.result, 0);
    }

    public final void readFrom(JceInputStream jceInputStream) {
        this.result = jceInputStream.read(this.result, 0, true);
    }
}
