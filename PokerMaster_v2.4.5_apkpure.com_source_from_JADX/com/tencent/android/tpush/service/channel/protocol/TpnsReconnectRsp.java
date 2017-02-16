package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;

/* compiled from: ProGuard */
public final class TpnsReconnectRsp extends JceStruct {
    static ArrayList cache_appOfflinePushMsgList;
    public ArrayList appOfflinePushMsgList;
    public long confVersion;
    public long timeUs;

    public TpnsReconnectRsp() {
        this.confVersion = 0;
        this.appOfflinePushMsgList = null;
        this.timeUs = 0;
    }

    public TpnsReconnectRsp(long j, ArrayList arrayList, long j2) {
        this.confVersion = 0;
        this.appOfflinePushMsgList = null;
        this.timeUs = 0;
        this.confVersion = j;
        this.appOfflinePushMsgList = arrayList;
        this.timeUs = j2;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.confVersion, 0);
        if (this.appOfflinePushMsgList != null) {
            jceOutputStream.write(this.appOfflinePushMsgList, 1);
        }
        jceOutputStream.write(this.timeUs, 2);
    }

    public final void readFrom(JceInputStream jceInputStream) {
        this.confVersion = jceInputStream.read(this.confVersion, 0, true);
        if (cache_appOfflinePushMsgList == null) {
            cache_appOfflinePushMsgList = new ArrayList();
            cache_appOfflinePushMsgList.add(new TpnsPushMsg());
        }
        this.appOfflinePushMsgList = (ArrayList) jceInputStream.read(cache_appOfflinePushMsgList, 1, false);
        this.timeUs = jceInputStream.read(this.timeUs, 2, false);
    }
}
