package com.android.volley;

public class ClientError extends VolleyError {
    public ClientError(NetworkResponse networkResponse) {
        super(networkResponse);
    }
}
