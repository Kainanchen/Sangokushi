package com.zkunity.sdk;

import com.zkunity.model.MJSONArray;
import com.zkunity.model.MJSONObject;

public class ZKResEvent {
    private MJSONObject jObject;

    public void invokeData(String data) {
        if (this.jObject != null) {
            this.jObject = null;
        }
        this.jObject = new MJSONObject();
        this.jObject.invokeData(data);
    }

    public void createNewFromNull() {
        if (this.jObject != null) {
            this.jObject = null;
        }
        this.jObject = new MJSONObject();
        this.jObject.createNewFromNull();
    }

    public void putString(String pName, String pValue) {
        this.jObject.putString(pName, pValue);
    }

    public void putInt(String pName, int pValue) {
        this.jObject.putInt(pName, pValue);
    }

    public void putBoolean(String pName, boolean pValue) {
        this.jObject.putBoolean(pName, pValue);
    }

    public void putLong(String pName, long pValue) {
        this.jObject.putLong(pName, pValue);
    }

    public void putDouble(String pName, double pValue) {
        this.jObject.putDouble(pName, pValue);
    }

    public void putMJSONArray(String name, MJSONArray array) {
        this.jObject.putMJSONArray(name, array);
    }

    public String toString() {
        if (this.jObject != null) {
            return this.jObject.toString();
        }
        return "ZKResEvent json null...";
    }
}
