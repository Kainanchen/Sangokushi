package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;

/* compiled from: ProGuard */
public final class TpnsPushClientReq extends JceStruct {
    static ArrayList cache_msgList;
    public ArrayList msgList;
    public long timeUs;

    public TpnsPushClientReq() {
        this.msgList = null;
        this.timeUs = 0;
    }

    public TpnsPushClientReq(ArrayList arrayList, long j) {
        this.msgList = null;
        this.timeUs = 0;
        this.msgList = arrayList;
        this.timeUs = j;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.msgList, 0);
        jceOutputStream.write(this.timeUs, 1);
    }

    public final void readFrom(JceInputStream jceInputStream) {
        if (cache_msgList == null) {
            cache_msgList = new ArrayList();
            cache_msgList.add(new TpnsPushMsg());
        }
        this.msgList = (ArrayList) jceInputStream.read(cache_msgList, 0, true);
        this.timeUs = jceInputStream.read(this.timeUs, 1, true);
    }
}
