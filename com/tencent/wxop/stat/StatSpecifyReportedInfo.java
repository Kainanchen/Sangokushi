package com.tencent.wxop.stat;

public class StatSpecifyReportedInfo {
    private String f1843a;
    private String f1844b;
    private String f1845c;
    private boolean f1846d;
    private boolean f1847e;

    public StatSpecifyReportedInfo() {
        this.f1843a = null;
        this.f1844b = null;
        this.f1845c = null;
        this.f1846d = false;
        this.f1847e = false;
    }

    public String getAppKey() {
        return this.f1843a;
    }

    public String getInstallChannel() {
        return this.f1844b;
    }

    public String getVersion() {
        return this.f1845c;
    }

    public boolean isImportant() {
        return this.f1847e;
    }

    public boolean isSendImmediately() {
        return this.f1846d;
    }

    public void setAppKey(String str) {
        this.f1843a = str;
    }

    public void setImportant(boolean z) {
        this.f1847e = z;
    }

    public void setInstallChannel(String str) {
        this.f1844b = str;
    }

    public void setSendImmediately(boolean z) {
        this.f1846d = z;
    }

    public void setVersion(String str) {
        this.f1845c = str;
    }

    public String toString() {
        return "StatSpecifyReportedInfo [appKey=" + this.f1843a + ", installChannel=" + this.f1844b + ", version=" + this.f1845c + ", sendImmediately=" + this.f1846d + ", isImportant=" + this.f1847e + "]";
    }
}
