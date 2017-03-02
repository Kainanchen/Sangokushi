package com.tencent.wxop.stat;

public class StatAppMonitor implements Cloneable {
    public static final int FAILURE_RESULT_TYPE = 1;
    public static final int LOGIC_FAILURE_RESULT_TYPE = 2;
    public static final int SUCCESS_RESULT_TYPE = 0;
    private String f1766a;
    private long f1767b;
    private long f1768c;
    private int f1769d;
    private long f1770e;
    private int f1771f;
    private int f1772g;

    public StatAppMonitor(String str) {
        this.f1766a = null;
        this.f1767b = 0;
        this.f1768c = 0;
        this.f1769d = 0;
        this.f1770e = 0;
        this.f1771f = 0;
        this.f1772g = FAILURE_RESULT_TYPE;
        this.f1766a = str;
    }

    public StatAppMonitor(String str, int i, int i2, long j, long j2, long j3, int i3) {
        this.f1766a = null;
        this.f1767b = 0;
        this.f1768c = 0;
        this.f1769d = 0;
        this.f1770e = 0;
        this.f1771f = 0;
        this.f1772g = FAILURE_RESULT_TYPE;
        this.f1766a = str;
        this.f1767b = j;
        this.f1768c = j2;
        this.f1769d = i;
        this.f1770e = j3;
        this.f1771f = i2;
        this.f1772g = i3;
    }

    public StatAppMonitor clone() {
        try {
            return (StatAppMonitor) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public String getInterfaceName() {
        return this.f1766a;
    }

    public long getMillisecondsConsume() {
        return this.f1770e;
    }

    public long getReqSize() {
        return this.f1767b;
    }

    public long getRespSize() {
        return this.f1768c;
    }

    public int getResultType() {
        return this.f1769d;
    }

    public int getReturnCode() {
        return this.f1771f;
    }

    public int getSampling() {
        return this.f1772g;
    }

    public void setInterfaceName(String str) {
        this.f1766a = str;
    }

    public void setMillisecondsConsume(long j) {
        this.f1770e = j;
    }

    public void setReqSize(long j) {
        this.f1767b = j;
    }

    public void setRespSize(long j) {
        this.f1768c = j;
    }

    public void setResultType(int i) {
        this.f1769d = i;
    }

    public void setReturnCode(int i) {
        this.f1771f = i;
    }

    public void setSampling(int i) {
        if (i <= 0) {
            i = FAILURE_RESULT_TYPE;
        }
        this.f1772g = i;
    }
}
