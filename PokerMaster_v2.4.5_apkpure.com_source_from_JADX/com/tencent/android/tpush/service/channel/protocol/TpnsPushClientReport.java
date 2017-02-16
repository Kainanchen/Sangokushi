package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;

/* compiled from: ProGuard */
public final class TpnsPushClientReport extends JceStruct {
    public long accessId;
    public byte ackType;
    public byte apn;
    public long broadcastId;
    public long confirmMs;
    public byte isp;
    public long locip;
    public int locport;
    public long msgId;
    public byte pack;
    public String qua;
    public long receiveTime;
    public String serviceHost;
    public long timeUs;
    public long timestamp;
    public long type;

    public TpnsPushClientReport() {
        this.msgId = 0;
        this.accessId = 0;
        this.isp = (byte) 0;
        this.apn = (byte) 0;
        this.pack = (byte) 0;
        this.qua = LetterIndexBar.SEARCH_ICON_LETTER;
        this.locip = 0;
        this.locport = 0;
        this.serviceHost = LetterIndexBar.SEARCH_ICON_LETTER;
        this.timeUs = 0;
        this.confirmMs = 0;
        this.broadcastId = 0;
        this.timestamp = 0;
        this.type = 0;
        this.receiveTime = 0;
        this.ackType = (byte) 0;
    }

    public TpnsPushClientReport(long j, long j2, byte b, byte b2, byte b3, String str, long j3, int i, String str2, long j4, long j5, long j6, long j7, long j8, long j9, byte b4) {
        this.msgId = 0;
        this.accessId = 0;
        this.isp = (byte) 0;
        this.apn = (byte) 0;
        this.pack = (byte) 0;
        this.qua = LetterIndexBar.SEARCH_ICON_LETTER;
        this.locip = 0;
        this.locport = 0;
        this.serviceHost = LetterIndexBar.SEARCH_ICON_LETTER;
        this.timeUs = 0;
        this.confirmMs = 0;
        this.broadcastId = 0;
        this.timestamp = 0;
        this.type = 0;
        this.receiveTime = 0;
        this.ackType = (byte) 0;
        this.msgId = j;
        this.accessId = j2;
        this.isp = b;
        this.apn = b2;
        this.pack = b3;
        this.qua = str;
        this.locip = j3;
        this.locport = i;
        this.serviceHost = str2;
        this.timeUs = j4;
        this.confirmMs = j5;
        this.broadcastId = j6;
        this.timestamp = j7;
        this.type = j8;
        this.receiveTime = j9;
        this.ackType = b4;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.msgId, 0);
        jceOutputStream.write(this.accessId, 1);
        jceOutputStream.write(this.isp, 2);
        jceOutputStream.write(this.apn, 3);
        jceOutputStream.write(this.pack, 4);
        if (this.qua != null) {
            jceOutputStream.write(this.qua, 5);
        }
        jceOutputStream.write(this.locip, 6);
        jceOutputStream.write(this.locport, 7);
        if (this.serviceHost != null) {
            jceOutputStream.write(this.serviceHost, 8);
        }
        jceOutputStream.write(this.timeUs, 9);
        jceOutputStream.write(this.confirmMs, 10);
        jceOutputStream.write(this.broadcastId, 11);
        jceOutputStream.write(this.timestamp, 12);
        jceOutputStream.write(this.type, 13);
        jceOutputStream.write(this.receiveTime, 14);
        jceOutputStream.write(this.ackType, 15);
    }

    public final void readFrom(JceInputStream jceInputStream) {
        this.msgId = jceInputStream.read(this.msgId, 0, true);
        this.accessId = jceInputStream.read(this.accessId, 1, true);
        this.isp = jceInputStream.read(this.isp, 2, false);
        this.apn = jceInputStream.read(this.apn, 3, false);
        this.pack = jceInputStream.read(this.pack, 4, false);
        this.qua = jceInputStream.readString(5, false);
        this.locip = jceInputStream.read(this.locip, 6, false);
        this.locport = jceInputStream.read(this.locport, 7, false);
        this.serviceHost = jceInputStream.readString(8, false);
        this.timeUs = jceInputStream.read(this.timeUs, 9, false);
        this.confirmMs = jceInputStream.read(this.confirmMs, 10, false);
        this.broadcastId = jceInputStream.read(this.broadcastId, 11, false);
        this.timestamp = jceInputStream.read(this.timestamp, 12, false);
        this.type = jceInputStream.read(this.type, 13, false);
        this.receiveTime = jceInputStream.read(this.receiveTime, 14, false);
        this.ackType = jceInputStream.read(this.ackType, 15, false);
    }
}
