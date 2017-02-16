package com.tencent.android.tpush.data;

import java.io.Serializable;

/* compiled from: ProGuard */
public class UnregisterInfo implements Serializable {
    public static final byte TYPE_UNINSTALL = (byte) 1;
    public static final byte TYPE_UNREGISTER = (byte) 0;
    private static final long serialVersionUID = -2293449011577410421L;
    public long accessId;
    public String accessKey;
    public String appCert;
    public byte isUninstall;
    public String option;
    public String packName;
    public long timestamp;
    public String token;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("------------UnregisterInfo----------------\naccessId=").append(this.accessId).append("\naccesskey=").append(this.accessKey).append("\ntoken=").append(this.token).append("\nisUninstall=").append(this.isUninstall).append("\npackName=").append(this.packName).append("\n--------------UnregisterInfo End------------");
        return stringBuilder.toString();
    }
}
