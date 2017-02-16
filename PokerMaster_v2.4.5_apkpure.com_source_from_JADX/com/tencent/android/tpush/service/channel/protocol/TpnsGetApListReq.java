package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: ProGuard */
public final class TpnsGetApListReq extends JceStruct {
    static NetworkInfo cache_netInfo;
    public NetworkInfo netInfo;

    public TpnsGetApListReq() {
        this.netInfo = null;
    }

    public TpnsGetApListReq(NetworkInfo networkInfo) {
        this.netInfo = null;
        this.netInfo = networkInfo;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.netInfo, 0);
    }

    public final void readFrom(JceInputStream jceInputStream) {
        if (cache_netInfo == null) {
            cache_netInfo = new NetworkInfo();
        }
        this.netInfo = (NetworkInfo) jceInputStream.read(cache_netInfo, 0, true);
    }
}
