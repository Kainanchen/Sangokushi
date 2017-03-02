package com.zkunity.model;

import org.json.JSONArray;
import org.json.JSONException;

public class MJSONArray {
    private JSONArray jsonArray;

    public void invokeData(String data) {
        try {
            if (this.jsonArray != null) {
                this.jsonArray = null;
            }
            this.jsonArray = new JSONArray(data);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void bindData(JSONArray jsonArray) {
        if (jsonArray != null) {
            jsonArray = null;
        }
        this.jsonArray = jsonArray;
    }

    public void createNewFromNull() {
        if (this.jsonArray != null) {
            this.jsonArray = null;
        }
        this.jsonArray = new JSONArray();
    }

    public MJSONObject getMJSONObject(int index) {
        MJSONObject mjsonObject = new MJSONObject();
        try {
            mjsonObject.bindData(this.jsonArray.getJSONObject(index));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return mjsonObject;
    }
}
