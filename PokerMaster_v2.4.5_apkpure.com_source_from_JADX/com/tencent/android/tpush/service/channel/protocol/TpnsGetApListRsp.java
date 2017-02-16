package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: ProGuard */
public final class TpnsGetApListRsp extends JceStruct {
    static ApList cache_apList;
    public ApList apList;

    public TpnsGetApListRsp() {
        this.apList = null;
    }

    public TpnsGetApListRsp(ApList apList) {
        this.apList = null;
        this.apList = apList;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.apList, 0);
    }

    public final void readFrom(JceInputStream jceInputStream) {
        if (cache_apList == null) {
            cache_apList = new ApList();
        }
        this.apList = (ApList) jceInputStream.read(cache_apList, 0, true);
    }
}
