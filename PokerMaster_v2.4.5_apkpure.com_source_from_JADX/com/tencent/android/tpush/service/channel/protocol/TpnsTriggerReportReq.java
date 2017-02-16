package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: ProGuard */
public final class TpnsTriggerReportReq extends JceStruct {
    public long timeEnd;
    public long timeStart;

    public TpnsTriggerReportReq() {
        this.timeStart = 0;
        this.timeEnd = 0;
    }

    public TpnsTriggerReportReq(long j, long j2) {
        this.timeStart = 0;
        this.timeEnd = 0;
        this.timeStart = j;
        this.timeEnd = j2;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.timeStart, 0);
        jceOutputStream.write(this.timeEnd, 1);
    }

    public final void readFrom(JceInputStream jceInputStream) {
        this.timeStart = jceInputStream.read(this.timeStart, 0, true);
        this.timeEnd = jceInputStream.read(this.timeEnd, 1, true);
    }
}
