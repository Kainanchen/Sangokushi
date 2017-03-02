package com.ta.utdid2.device;

import com.tencent.connect.common.Constants;

public class Device {
    private String deviceId;
    private String imei;
    private String imsi;
    private long mCheckSum;
    private long mCreateTimestamp;
    private String utdid;

    public Device() {
        this.imei = Constants.STR_EMPTY;
        this.imsi = Constants.STR_EMPTY;
        this.deviceId = Constants.STR_EMPTY;
        this.utdid = Constants.STR_EMPTY;
        this.mCreateTimestamp = 0;
        this.mCheckSum = 0;
    }

    long getCheckSum() {
        return this.mCheckSum;
    }

    void setCheckSum(long mCheckSum) {
        this.mCheckSum = mCheckSum;
    }

    long getCreateTimestamp() {
        return this.mCreateTimestamp;
    }

    void setCreateTimestamp(long mCreateTimestamp) {
        this.mCreateTimestamp = mCreateTimestamp;
    }

    public String getImei() {
        return this.imei;
    }

    void setImei(String imei) {
        this.imei = imei;
    }

    public String getImsi() {
        return this.imsi;
    }

    void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getUtdid() {
        return this.utdid;
    }

    void setUtdid(String utdid) {
        this.utdid = utdid;
    }
}
