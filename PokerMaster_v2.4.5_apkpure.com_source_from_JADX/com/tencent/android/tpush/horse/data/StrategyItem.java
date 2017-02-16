package com.tencent.android.tpush.horse.data;

import android.text.TextUtils;
import java.io.Serializable;

/* compiled from: ProGuard */
public class StrategyItem implements Serializable {
    private static final long serialVersionUID = 1692027785653072243L;
    private int protocolType;
    private String proxyIp;
    private int proxyPort;
    private int redirect;
    private String serverIp;
    private int serverPort;

    public StrategyItem(String str, int i, String str2, int i2, int i3, int i4) {
        this.serverIp = str;
        this.serverPort = i;
        this.proxyIp = str2;
        this.proxyPort = i2;
        this.protocolType = i3;
        this.redirect = i4;
    }

    public String m4897a() {
        return this.serverIp;
    }

    public int m4900b() {
        return this.serverPort;
    }

    public String m4901c() {
        return this.proxyIp;
    }

    public int m4902d() {
        return this.protocolType;
    }

    public int m4903e() {
        return this.proxyPort;
    }

    public int m4904f() {
        return this.redirect;
    }

    public void m4898a(int i) {
        this.redirect = i;
    }

    public boolean m4899a(StrategyItem strategyItem) {
        return strategyItem != null && this.serverIp.equals(strategyItem.serverIp) && this.serverPort == strategyItem.serverPort && this.proxyIp.equals(strategyItem.proxyIp) && this.proxyPort == strategyItem.proxyPort && this.protocolType == strategyItem.protocolType;
    }

    public boolean equals(Object obj) {
        if (obj instanceof StrategyItem) {
            return m4899a((StrategyItem) obj);
        }
        return super.equals(obj);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((this.serverIp == null ? 0 : this.serverIp.hashCode()) + 31) * 31) + this.serverPort) * 31;
        if (this.proxyIp != null) {
            i = this.proxyIp.hashCode();
        }
        return (((((((hashCode + i) * 31) + this.proxyPort) * 31) + this.protocolType) * 31) + this.redirect) & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    public String toString() {
        return new StringBuffer("serverIp=").append(this.serverIp).append(",serverPort=").append(this.serverPort).append(", proxyIp=").append(this.proxyIp).append(",proxyPort=").append(this.proxyPort).append(", protocolType=").append(this.protocolType == 1 ? "http" : "tcp").append(", redirect=").append(this.redirect).toString();
    }

    public boolean m4905g() {
        return (TextUtils.isEmpty(this.serverIp) || this.serverPort == 0) ? false : true;
    }

    public boolean m4906h() {
        return !TextUtils.isEmpty(this.proxyIp);
    }

    public boolean m4907i() {
        return this.protocolType == 1;
    }

    public boolean m4908j() {
        return this.redirect == 1;
    }
}
