package com.zkunity.model;

import com.tencent.connect.common.Constants;
import org.json.JSONException;
import org.json.JSONObject;

public class MJSONObject {
    private JSONObject jObject;

    public void invokeData(String data) {
        try {
            if (this.jObject != null) {
                this.jObject = null;
            }
            this.jObject = new JSONObject(data);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void bindData(JSONObject jObject) {
        if (jObject != null) {
            jObject = null;
        }
        this.jObject = jObject;
    }

    public void createNewFromNull() {
        if (this.jObject != null) {
            this.jObject = null;
        }
        this.jObject = new JSONObject();
    }

    public String getString(String pName) {
        try {
            return this.jObject.getString(pName);
        } catch (JSONException e) {
            e.printStackTrace();
            return Constants.STR_EMPTY;
        }
    }

    public void putString(String pName, String pValue) {
        try {
            this.jObject.put(pName, pValue);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public int getInt(String pName) {
        try {
            return this.jObject.getInt(pName);
        } catch (JSONException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public void putInt(String pName, int pValue) {
        try {
            this.jObject.put(pName, pValue);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public boolean getBoolean(String pName) {
        try {
            return this.jObject.getBoolean(pName);
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void putBoolean(String pName, boolean pValue) {
        try {
            this.jObject.put(pName, pValue);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public long getLong(String pName) {
        try {
            return this.jObject.getLong(pName);
        } catch (JSONException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public void putLong(String pName, long pValue) {
        try {
            this.jObject.put(pName, pValue);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public double getDouble(String pName) {
        try {
            return this.jObject.getDouble(pName);
        } catch (JSONException e) {
            e.printStackTrace();
            return -1.0d;
        }
    }

    public void putDouble(String pName, double pValue) {
        try {
            this.jObject.put(pName, pValue);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public MJSONArray getMJSONArray(String name) {
        MJSONArray array = new MJSONArray();
        try {
            array.bindData(this.jObject.getJSONArray(name));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return array;
    }

    public void putMJSONArray(String name, MJSONArray array) {
        try {
            this.jObject.put(name, array);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public MJSONObject getMJSONObject(String name) {
        MJSONObject object = new MJSONObject();
        try {
            object.invokeData(this.jObject.getJSONObject(name).toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return object;
    }

    public String toString() {
        return this.jObject != null ? this.jObject.toString() : null;
    }
}
