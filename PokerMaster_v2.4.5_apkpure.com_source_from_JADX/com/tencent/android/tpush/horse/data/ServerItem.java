package com.tencent.android.tpush.horse.data;

import com.tencent.android.tpush.service.p077d.ProGuard;
import java.io.Serializable;

/* compiled from: ProGuard */
public class ServerItem implements Serializable {
    private static final long serialVersionUID = -6609283086276910655L;
    private long serverIpLong;
    private String serverIpStr;
    private int serverPort;
    private int spType;

    public ServerItem(String str, int i, int i2) {
        this.serverIpStr = str;
        this.serverIpLong = ProGuard.m5320b(this.serverIpStr);
        this.serverPort = i;
        this.spType = i2;
    }

    public ServerItem(long j, int i, int i2) {
        this.serverIpLong = j;
        this.serverIpStr = ProGuard.m5305a(j);
        this.serverPort = i;
        this.spType = i2;
    }

    public String m4894a() {
        return this.serverIpStr;
    }

    public int m4895b() {
        return this.serverPort;
    }

    private boolean m4893a(ServerItem serverItem) {
        return serverItem != null && serverItem.m4894a().equals(this.serverIpStr) && serverItem.m4895b() == this.serverPort && serverItem.m4896c() == this.spType;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ServerItem) {
            return m4893a((ServerItem) obj);
        }
        return super.equals(obj);
    }

    public int hashCode() {
        return ((((((this.serverIpStr != null ? this.serverIpStr.hashCode() : 0) + 31) * 31) + this.serverPort) * 31) + this.spType) & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    public String toString() {
        return this.serverIpStr + ":" + this.serverPort;
    }

    public int m4896c() {
        return this.spType;
    }
}
