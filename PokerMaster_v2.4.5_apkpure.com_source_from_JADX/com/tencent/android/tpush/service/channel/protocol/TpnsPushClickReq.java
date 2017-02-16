package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;

/* compiled from: ProGuard */
public final class TpnsPushClickReq extends JceStruct {
    static ArrayList cache_msgClickList;
    public ArrayList msgClickList;

    public TpnsPushClickReq() {
        this.msgClickList = null;
    }

    public TpnsPushClickReq(ArrayList arrayList) {
        this.msgClickList = null;
        this.msgClickList = arrayList;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.msgClickList, 1);
    }

    public final void readFrom(JceInputStream jceInputStream) {
        if (cache_msgClickList == null) {
            cache_msgClickList = new ArrayList();
            cache_msgClickList.add(new TpnsClickClientReport());
        }
        this.msgClickList = (ArrayList) jceInputStream.read(cache_msgClickList, 1, true);
    }
}
