package com.tencent.android.tpush.data;

import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.io.Serializable;

/* compiled from: ProGuard */
public class MessageId implements Serializable {
    public static final short FLAG_ACK = (short) 1;
    public static final short FLAG_UNACK = (short) 0;
    private static final long serialVersionUID = 8708157897391765794L;
    public long accessId;
    public byte apn;
    public long busiMsgId;
    public String date;
    public long host;
    public long id;
    public short isAck;
    public byte isp;
    public long msgType;
    public long multiPkg;
    public byte pact;
    public String pkgName;
    public int port;
    public long pushTime;
    public long receivedTime;
    public long serverTime;
    public String serviceHost;
    public long timestamp;
    public long ttl;

    public MessageId() {
        this.busiMsgId = 0;
        this.timestamp = 0;
        this.msgType = -1;
        this.multiPkg = 0;
        this.date = LetterIndexBar.SEARCH_ICON_LETTER;
    }

    public boolean m4845a() {
        return this.isAck == FLAG_ACK;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MessageId [id=").append(this.id).append(", isAck=").append(this.isAck).append(", isp=").append(this.isp).append(", apn=").append(this.apn).append(", accessId=").append(this.accessId).append(", pushTime=").append(this.pushTime).append(", receivedTime=").append(this.receivedTime).append(", pact=").append(this.pact).append(", host=").append(this.host).append(", port=").append(this.port).append(", serviceHost=").append(this.serviceHost).append(", pkgName=").append(this.pkgName).append(", busiMsgId=").append(this.busiMsgId).append(", timestamp=").append(this.timestamp).append(", msgType=").append(this.msgType).append(", multiPkg=").append(this.multiPkg).append(", date=").append(this.date).append(", serverTime=").append(this.serverTime).append(", ttl=").append(this.ttl).append("]");
        return stringBuilder.toString();
    }
}
