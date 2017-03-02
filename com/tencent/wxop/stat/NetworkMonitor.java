package com.tencent.wxop.stat;

import com.tencent.connect.common.Constants;
import org.json.JSONException;
import org.json.JSONObject;

public class NetworkMonitor {
    private long f1757a;
    private int f1758b;
    private String f1759c;
    private int f1760d;
    private String f1761e;

    public NetworkMonitor() {
        this.f1757a = 0;
        this.f1758b = 0;
        this.f1759c = Constants.STR_EMPTY;
        this.f1760d = 0;
        this.f1761e = Constants.STR_EMPTY;
    }

    public String getDomain() {
        return this.f1759c;
    }

    public long getMillisecondsConsume() {
        return this.f1757a;
    }

    public int getPort() {
        return this.f1760d;
    }

    public String getRemoteIp() {
        return this.f1761e;
    }

    public int getStatusCode() {
        return this.f1758b;
    }

    public void setDomain(String str) {
        this.f1759c = str;
    }

    public void setMillisecondsConsume(long j) {
        this.f1757a = j;
    }

    public void setPort(int i) {
        this.f1760d = i;
    }

    public void setRemoteIp(String str) {
        this.f1761e = str;
    }

    public void setStatusCode(int i) {
        this.f1758b = i;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tm", this.f1757a);
            jSONObject.put("st", this.f1758b);
            if (this.f1759c != null) {
                jSONObject.put("dm", this.f1759c);
            }
            jSONObject.put("pt", this.f1760d);
            if (this.f1761e != null) {
                jSONObject.put("rip", this.f1761e);
            }
            jSONObject.put("ts", System.currentTimeMillis() / 1000);
        } catch (JSONException e) {
        }
        return jSONObject;
    }
}
