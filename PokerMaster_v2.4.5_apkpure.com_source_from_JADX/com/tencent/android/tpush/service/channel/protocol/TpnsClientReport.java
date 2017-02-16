package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;

/* compiled from: ProGuard */
public final class TpnsClientReport extends JceStruct {
    static int cache_commandId;
    public long acceptTime;
    public long accip;
    public byte apn;
    public byte available;
    public int commandId;
    public long connectTime;
    public String domain;
    public long downstreamTime;
    public byte isp;
    public String lbs;
    public byte pack;
    public int port;
    public String qua;
    public byte result;
    public long resultCode;
    public String signal;
    public long tmcost;
    public long upstreamTime;

    public TpnsClientReport() {
        this.commandId = 0;
        this.isp = (byte) 0;
        this.port = 0;
        this.accip = 0;
        this.apn = (byte) 0;
        this.pack = (byte) 0;
        this.available = (byte) 0;
        this.tmcost = 0;
        this.result = (byte) 0;
        this.resultCode = 0;
        this.domain = LetterIndexBar.SEARCH_ICON_LETTER;
        this.qua = LetterIndexBar.SEARCH_ICON_LETTER;
        this.connectTime = 0;
        this.upstreamTime = 0;
        this.downstreamTime = 0;
        this.acceptTime = 0;
        this.signal = LetterIndexBar.SEARCH_ICON_LETTER;
        this.lbs = LetterIndexBar.SEARCH_ICON_LETTER;
    }

    public TpnsClientReport(int i, byte b, int i2, long j, byte b2, byte b3, byte b4, long j2, byte b5, long j3, String str, String str2, long j4, long j5, long j6, long j7, String str3, String str4) {
        this.commandId = 0;
        this.isp = (byte) 0;
        this.port = 0;
        this.accip = 0;
        this.apn = (byte) 0;
        this.pack = (byte) 0;
        this.available = (byte) 0;
        this.tmcost = 0;
        this.result = (byte) 0;
        this.resultCode = 0;
        this.domain = LetterIndexBar.SEARCH_ICON_LETTER;
        this.qua = LetterIndexBar.SEARCH_ICON_LETTER;
        this.connectTime = 0;
        this.upstreamTime = 0;
        this.downstreamTime = 0;
        this.acceptTime = 0;
        this.signal = LetterIndexBar.SEARCH_ICON_LETTER;
        this.lbs = LetterIndexBar.SEARCH_ICON_LETTER;
        this.commandId = i;
        this.isp = b;
        this.port = i2;
        this.accip = j;
        this.apn = b2;
        this.pack = b3;
        this.available = b4;
        this.tmcost = j2;
        this.result = b5;
        this.resultCode = j3;
        this.domain = str;
        this.qua = str2;
        this.connectTime = j4;
        this.upstreamTime = j5;
        this.downstreamTime = j6;
        this.acceptTime = j7;
        this.signal = str3;
        this.lbs = str4;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.commandId, 0);
        jceOutputStream.write(this.isp, 1);
        jceOutputStream.write(this.port, 2);
        jceOutputStream.write(this.accip, 3);
        jceOutputStream.write(this.apn, 4);
        jceOutputStream.write(this.pack, 5);
        jceOutputStream.write(this.available, 6);
        jceOutputStream.write(this.tmcost, 7);
        jceOutputStream.write(this.result, 8);
        jceOutputStream.write(this.resultCode, 9);
        if (this.domain != null) {
            jceOutputStream.write(this.domain, 10);
        }
        if (this.qua != null) {
            jceOutputStream.write(this.qua, 11);
        }
        jceOutputStream.write(this.connectTime, 12);
        jceOutputStream.write(this.upstreamTime, 13);
        jceOutputStream.write(this.downstreamTime, 14);
        jceOutputStream.write(this.acceptTime, 15);
        if (this.signal != null) {
            jceOutputStream.write(this.signal, 16);
        }
        if (this.lbs != null) {
            jceOutputStream.write(this.lbs, 17);
        }
    }

    public final void readFrom(JceInputStream jceInputStream) {
        this.commandId = jceInputStream.read(this.commandId, 0, false);
        this.isp = jceInputStream.read(this.isp, 1, false);
        this.port = jceInputStream.read(this.port, 2, false);
        this.accip = jceInputStream.read(this.accip, 3, false);
        this.apn = jceInputStream.read(this.apn, 4, false);
        this.pack = jceInputStream.read(this.pack, 5, false);
        this.available = jceInputStream.read(this.available, 6, false);
        this.tmcost = jceInputStream.read(this.tmcost, 7, false);
        this.result = jceInputStream.read(this.result, 8, false);
        this.resultCode = jceInputStream.read(this.resultCode, 9, false);
        this.domain = jceInputStream.readString(10, false);
        this.qua = jceInputStream.readString(11, false);
        this.connectTime = jceInputStream.read(this.connectTime, 12, false);
        this.upstreamTime = jceInputStream.read(this.upstreamTime, 13, false);
        this.downstreamTime = jceInputStream.read(this.downstreamTime, 14, false);
        this.acceptTime = jceInputStream.read(this.acceptTime, 15, false);
        this.signal = jceInputStream.readString(16, false);
        this.lbs = jceInputStream.readString(17, false);
    }
}
