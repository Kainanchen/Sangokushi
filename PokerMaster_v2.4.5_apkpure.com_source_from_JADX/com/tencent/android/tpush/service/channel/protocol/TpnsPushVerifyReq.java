package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;

/* compiled from: ProGuard */
public final class TpnsPushVerifyReq extends JceStruct {
    static ArrayList cache_msgReportList;
    public ArrayList msgReportList;

    public TpnsPushVerifyReq() {
        this.msgReportList = null;
    }

    public TpnsPushVerifyReq(ArrayList arrayList) {
        this.msgReportList = null;
        this.msgReportList = arrayList;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.msgReportList, 1);
    }

    public final void readFrom(JceInputStream jceInputStream) {
        if (cache_msgReportList == null) {
            cache_msgReportList = new ArrayList();
            cache_msgReportList.add(new TpnsPushClientReport());
        }
        this.msgReportList = (ArrayList) jceInputStream.read(cache_msgReportList, 1, true);
    }
}
