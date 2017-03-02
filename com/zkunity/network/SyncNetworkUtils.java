package com.zkunity.network;

import android.support.v4.view.MotionEventCompat;
import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.igexin.download.Downloads;
import com.zkunity.app.AppManager;
import com.zkunity.model.MJSONObject;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.apache.http.entity.mime.MIME;

public class SyncNetworkUtils {
    private static RequestQueue rq;

    /* renamed from: com.zkunity.network.SyncNetworkUtils.1 */
    class C07441 implements Listener<String> {
        private final /* synthetic */ SyncNetworkCall val$call;

        C07441(SyncNetworkCall syncNetworkCall) {
            this.val$call = syncNetworkCall;
        }

        public void onResponse(String response) {
            MJSONObject mjObj = new MJSONObject();
            mjObj.invokeData(response);
            int ek = mjObj.getInt("k");
            if (ek != -1) {
                String str = SyncNetworkUtils.getEncryptString(SyncNetworkUtils.calcEncryptKey(ek), mjObj.getString("d"));
                MJSONObject mobj1 = new MJSONObject();
                mobj1.invokeData(str);
                if (mobj1.getString(Downloads.COLUMN_STATUS).equals("200")) {
                    this.val$call.onSuccess(Downloads.STATUS_SUCCESS, mobj1.getString("rs"));
                } else {
                    this.val$call.onFailure(501, null);
                }
            }
        }
    }

    /* renamed from: com.zkunity.network.SyncNetworkUtils.2 */
    class C07452 implements ErrorListener {
        private final /* synthetic */ SyncNetworkCall val$call;

        C07452(SyncNetworkCall syncNetworkCall) {
            this.val$call = syncNetworkCall;
        }

        public void onErrorResponse(VolleyError e) {
            this.val$call.onFailure(500, e);
        }
    }

    private static class UTFStringRequest extends StringRequest {
        public UTFStringRequest(int method, String url, Listener<String> listener, ErrorListener errorListener) {
            super(method, url, listener, errorListener);
        }

        protected Response<String> parseNetworkResponse(NetworkResponse response) {
            String str = null;
            try {
                str = new String(response.data, "utf-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            return Response.success(str, HttpHeaderParser.parseCacheHeaders(response));
        }
    }

    /* renamed from: com.zkunity.network.SyncNetworkUtils.3 */
    class C07463 extends UTFStringRequest {
        private final /* synthetic */ String val$jsonStr;

        C07463(int $anonymous0, String $anonymous1, Listener $anonymous2, ErrorListener $anonymous3, String str) {
            this.val$jsonStr = str;
            super($anonymous0, $anonymous1, $anonymous2, $anonymous3);
        }

        protected Map<String, String> getParams() {
            Map<String, String> params = new HashMap();
            if (this.val$jsonStr != null) {
                int ek = SyncNetworkUtils.getKey();
                if (ek != -1) {
                    params.put("k", String.valueOf(SyncNetworkUtils.calcEncryptKey(ek)));
                    params.put("d", SyncNetworkUtils.getEncryptString(ek, this.val$jsonStr));
                }
            }
            return params;
        }

        public Map<String, String> getHeaders() throws AuthFailureError {
            Map<String, String> params = new HashMap();
            params.put(MIME.CONTENT_TYPE, "application/x-www-form-urlencoded");
            return params;
        }
    }

    public static void checkTools() {
        if (rq == null) {
            rq = Volley.newRequestQueue(AppManager.getManager().getAppActivity());
        }
    }

    public static void postByHttp(String url, String jsonStr, SyncNetworkCall call) {
        checkTools();
        UTFStringRequest req = new C07463(1, url, new C07441(call), new C07452(call), jsonStr);
        req.setRetryPolicy(new DefaultRetryPolicy(5000, 1, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        rq.add(req);
    }

    private static String getEncryptString(int ek, String resStr) {
        StringBuffer sBuffer = new StringBuffer();
        ek = ((ek % 10485760) * 10485760) + 10485760;
        int n = resStr.length();
        for (int i = 0; i < n; i++) {
            ek = ((ek % 10485760) * 10485760) + 10485760;
            sBuffer.append((char) (resStr.charAt(i) ^ ((ek >> 20) & MotionEventCompat.ACTION_MASK)));
        }
        return sBuffer.toString();
    }

    private static int calcEncryptKey(int key) {
        return (key % 631) ^ 15;
    }

    private static int getKey() {
        return new Random().nextInt(100) + 300;
    }
}
