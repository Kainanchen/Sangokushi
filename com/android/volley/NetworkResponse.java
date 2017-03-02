package com.android.volley;

import com.igexin.download.Downloads;
import java.util.Collections;
import java.util.Map;

public class NetworkResponse {
    public final byte[] data;
    public final Map<String, String> headers;
    public final boolean notModified;
    public final int statusCode;

    public NetworkResponse(int statusCode, byte[] data, Map<String, String> headers, boolean notModified) {
        this.statusCode = statusCode;
        this.data = data;
        this.headers = headers;
        this.notModified = notModified;
    }

    public NetworkResponse(byte[] data) {
        this(Downloads.STATUS_SUCCESS, data, Collections.emptyMap(), false);
    }

    public NetworkResponse(byte[] data, Map<String, String> headers) {
        this(Downloads.STATUS_SUCCESS, data, headers, false);
    }
}
