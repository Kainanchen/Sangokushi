package com.zkunity.network;

import com.android.volley.VolleyError;

public interface SyncNetworkCall {
    void onFailure(int i, VolleyError volleyError);

    void onSuccess(int i, String str);
}
