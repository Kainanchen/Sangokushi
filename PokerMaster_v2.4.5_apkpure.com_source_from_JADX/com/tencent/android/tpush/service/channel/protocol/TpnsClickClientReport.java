package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: ProGuard */
public final class TpnsClickClientReport extends JceStruct {
    public long accessId;
    public long action;
    public long broadcastId;
    public long clickTime;
    public long msgId;
    public long timestamp;
    public long type;

    public TpnsClickClientReport() {
        this.msgId = 0;
        this.accessId = 0;
        this.broadcastId = 0;
        this.timestamp = 0;
        this.type = 0;
        this.clickTime = 0;
        this.action = 0;
    }

    public TpnsClickClientReport(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.msgId = 0;
        this.accessId = 0;
        this.broadcastId = 0;
        this.timestamp = 0;
        this.type = 0;
        this.clickTime = 0;
        this.action = 0;
        this.msgId = j;
        this.accessId = j2;
        this.broadcastId = j3;
        this.timestamp = j4;
        this.type = j5;
        this.clickTime = j6;
        this.action = j7;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.msgId, 0);
        jceOutputStream.write(this.accessId, 1);
        jceOutputStream.write(this.broadcastId, 2);
        jceOutputStream.write(this.timestamp, 3);
        jceOutputStream.write(this.type, 4);
        jceOutputStream.write(this.clickTime, 5);
        jceOutputStream.write(this.action, 6);
    }

    public final void readFrom(JceInputStream jceInputStream) {
        this.msgId = jceInputStream.read(this.msgId, 0, true);
        this.accessId = jceInputStream.read(this.accessId, 1, true);
        this.broadcastId = jceInputStream.read(this.broadcastId, 2, false);
        this.timestamp = jceInputStream.read(this.timestamp, 3, false);
        this.type = jceInputStream.read(this.type, 4, false);
        this.clickTime = jceInputStream.read(this.clickTime, 5, false);
        this.action = jceInputStream.read(this.action, 6, false);
    }
}
