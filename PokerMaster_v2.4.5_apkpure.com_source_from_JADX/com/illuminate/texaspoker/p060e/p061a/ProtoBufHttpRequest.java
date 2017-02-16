package com.illuminate.texaspoker.p060e.p061a;

import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.util.Log;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.RetryPolicy;
import com.sina.weibo.sdk.component.GameManager;
import com.tencent.android.tpush.common.Constants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.illuminate.texaspoker.e.a.b */
public final class ProtoBufHttpRequest extends Request<byte[]> {
    private static int f6483a;
    private static int f6484b;
    private final Listener<byte[]> f6485c;
    private byte[] f6486d;
    private int f6487e;

    protected final /* synthetic */ void deliverResponse(Object obj) {
        try {
            this.f6485c.onResponse((byte[]) obj);
        } catch (Throwable e) {
            e.printStackTrace();
            Log.e("ProtoBufHttpRequest", e.getMessage(), e);
        }
    }

    static {
        f6483a = Constants.ERRORCODE_UNKNOWN;
        f6484b = 1;
    }

    public ProtoBufHttpRequest(byte[] bArr, Listener<byte[]> listener, ErrorListener errorListener, String str) {
        this(bArr, listener, errorListener, str, (byte) 0);
        this.f6487e = 60000;
    }

    public ProtoBufHttpRequest(byte[] bArr, Listener<byte[]> listener, ErrorListener errorListener, String str, byte b) {
        super(f6484b, str, errorListener);
        this.f6487e = 0;
        r0 = new byte[5];
        int length = bArr.length + 5;
        r0[0] = (byte) -2;
        r0[1] = (byte) ((ViewCompat.MEASURED_STATE_MASK & length) >> 24);
        r0[2] = (byte) ((16711680 & length) >> 16);
        r0[3] = (byte) ((MotionEventCompat.ACTION_POINTER_INDEX_MASK & length) >> 8);
        r0[4] = (byte) (length & MotionEventCompat.ACTION_MASK);
        Object obj = new byte[length];
        System.arraycopy(r0, 0, obj, 0, 5);
        System.arraycopy(bArr, 0, obj, 5, length - 5);
        this.f6486d = obj;
        this.f6485c = listener;
        this.f6487e = f6483a;
    }

    public final byte[] getBody() {
        if (this.f6486d == null) {
            return super.getBody();
        }
        return this.f6486d;
    }

    public final Map<String, String> getHeaders() {
        Map<String, String> hashMap = new HashMap();
        hashMap.put("Charset", GameManager.DEFAULT_CHARSET);
        hashMap.put("Content-Type", "multipart/form-data; boundary=*****");
        return hashMap;
    }

    public final RetryPolicy getRetryPolicy() {
        return new DefaultRetryPolicy(this.f6487e, 3, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
    }

    protected final Response<byte[]> parseNetworkResponse(NetworkResponse networkResponse) {
        try {
            return Response.success(networkResponse.data, null);
        } catch (Throwable e) {
            e.printStackTrace();
            Log.e("ProtoBufHttpRequest", e.getMessage(), e);
            return Response.error(new ParseError(e));
        }
    }
}
