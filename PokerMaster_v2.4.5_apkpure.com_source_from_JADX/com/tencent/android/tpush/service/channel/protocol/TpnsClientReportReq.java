package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;

/* compiled from: ProGuard */
public final class TpnsClientReportReq extends JceStruct {
    static ArrayList cache_reportMsgs;
    public ArrayList reportMsgs;

    public TpnsClientReportReq() {
        this.reportMsgs = null;
    }

    public TpnsClientReportReq(ArrayList arrayList) {
        this.reportMsgs = null;
        this.reportMsgs = arrayList;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        if (this.reportMsgs != null) {
            jceOutputStream.write(this.reportMsgs, 1);
        }
    }

    public final void readFrom(JceInputStream jceInputStream) {
        if (cache_reportMsgs == null) {
            cache_reportMsgs = new ArrayList();
            cache_reportMsgs.add(new TpnsClientReport());
        }
        this.reportMsgs = (ArrayList) jceInputStream.read(cache_reportMsgs, 1, false);
    }
}
