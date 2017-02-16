package com.android.volley;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.util.Map;

public class NetworkResponse {
    public final byte[] data;
    public final Map<String, String> headers;
    public final long networkTimeMs;
    public final boolean notModified;
    public final int statusCode;

    static {
        fixHelper.fixfunc(new int[]{1730, 1731, 1732, 1733});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native NetworkResponse(int i, byte[] bArr, Map<String, String> map, boolean z);

    public native NetworkResponse(int i, byte[] bArr, Map<String, String> map, boolean z, long j);

    public native NetworkResponse(byte[] bArr);

    public native NetworkResponse(byte[] bArr, Map<String, String> map);
}
