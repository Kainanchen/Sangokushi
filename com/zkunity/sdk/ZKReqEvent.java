package com.zkunity.sdk;

import com.zkunity.model.MJSONArray;
import com.zkunity.model.MJSONObject;

public class ZKReqEvent {
    private MJSONObject jObject;

    public void invokeData(String data) {
        if (this.jObject != null) {
            this.jObject = null;
        }
        this.jObject = new MJSONObject();
        this.jObject.invokeData(data);
    }

    public void replaceData(MJSONObject jObject) {
        this.jObject = jObject;
    }

    public String getString(String pName) {
        return this.jObject != null ? this.jObject.getString(pName) : null;
    }

    public int getInt(String pName) {
        return this.jObject != null ? this.jObject.getInt(pName) : -1;
    }

    public boolean getBoolean(String pName) {
        return this.jObject != null ? this.jObject.getBoolean(pName) : false;
    }

    public long getLong(String pName) {
        return this.jObject != null ? this.jObject.getLong(pName) : -1;
    }

    public double getDouble(String pName) {
        return this.jObject != null ? this.jObject.getDouble(pName) : -1.0d;
    }

    public MJSONArray getMJSONArray(String name) {
        return this.jObject != null ? this.jObject.getMJSONArray(name) : null;
    }

    public MJSONObject getMObjs() {
        return this.jObject;
    }

    public String toString() {
        if (this.jObject != null) {
            return this.jObject.toString();
        }
        return "ZKReqEvent json null...";
    }
}
