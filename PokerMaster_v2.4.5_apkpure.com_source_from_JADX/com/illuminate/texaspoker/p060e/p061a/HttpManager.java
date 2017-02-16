package com.illuminate.texaspoker.p060e.p061a;

import android.util.Log;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.illuminate.texaspoker.application.BaseApplication;
import com.illuminate.texaspoker.p060e.p062b.ResponseHandler;
import com.illuminate.texaspoker.utils.Config;
import com.illuminate.texaspoker.utils.Utility;
import com.tencent.android.tpush.common.Constants;
import com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD;
import com.texaspoker.moment.TexasPokerCommon.Package;

/* renamed from: com.illuminate.texaspoker.e.a.a */
public final class HttpManager {
    public static HttpManager f6479a;
    public static String f6480b;
    public static Listener<byte[]> f6481c;
    private RequestQueue f6482d;

    /* renamed from: com.illuminate.texaspoker.e.a.a.1 */
    static class HttpManager implements Listener<byte[]> {
        HttpManager() {
        }

        public final /* synthetic */ void onResponse(Object obj) {
            ResponseHandler.m3963a().m4009a((byte[]) obj);
        }
    }

    /* renamed from: com.illuminate.texaspoker.e.a.a.2 */
    class HttpManager implements ErrorListener {
        final /* synthetic */ HttpManager f6470a;

        public HttpManager(HttpManager httpManager) {
            this.f6470a = httpManager;
        }

        public final void onErrorResponse(VolleyError volleyError) {
            Log.e("HttpManager", volleyError.toString(), volleyError);
        }
    }

    /* renamed from: com.illuminate.texaspoker.e.a.a.3 */
    class HttpManager implements ErrorListener {
        final /* synthetic */ DefaultRetryPolicy f6471a;
        final /* synthetic */ TEXAS_CMD f6472b;
        final /* synthetic */ HttpManager f6473c;

        public HttpManager(HttpManager httpManager, DefaultRetryPolicy defaultRetryPolicy, TEXAS_CMD texas_cmd) {
            this.f6473c = httpManager;
            this.f6471a = defaultRetryPolicy;
            this.f6472b = texas_cmd;
        }

        public final void onErrorResponse(VolleyError volleyError) {
            Log.e("HttpManager", volleyError.toString(), volleyError);
            new StringBuilder("retryPolicy.getCurrentRetryCount()==").append(this.f6471a.getCurrentRetryCount());
            Utility.m4478a("NOTIFY_MINI_GAME_ERROR", Integer.valueOf(this.f6472b.getNumber()));
        }
    }

    /* renamed from: com.illuminate.texaspoker.e.a.a.4 */
    class HttpManager implements ErrorListener {
        final /* synthetic */ HttpManager f6474a;

        public HttpManager(HttpManager httpManager) {
            this.f6474a = httpManager;
        }

        public final void onErrorResponse(VolleyError volleyError) {
            Log.e("HttpManager", volleyError.toString(), volleyError);
        }
    }

    /* renamed from: com.illuminate.texaspoker.e.a.a.5 */
    class HttpManager implements ErrorListener {
        final /* synthetic */ TEXAS_CMD f6475a;
        final /* synthetic */ HttpManager f6476b;

        HttpManager(HttpManager httpManager, TEXAS_CMD texas_cmd) {
            this.f6476b = httpManager;
            this.f6475a = texas_cmd;
        }

        public final void onErrorResponse(VolleyError volleyError) {
            Log.e("HttpManager", "req cmd = " + this.f6475a + " " + volleyError.toString(), volleyError);
        }
    }

    /* renamed from: com.illuminate.texaspoker.e.a.a.6 */
    class HttpManager implements ErrorListener {
        final /* synthetic */ TEXAS_CMD f6477a;
        final /* synthetic */ HttpManager f6478b;

        public HttpManager(HttpManager httpManager, TEXAS_CMD texas_cmd) {
            this.f6478b = httpManager;
            this.f6477a = texas_cmd;
        }

        public final void onErrorResponse(VolleyError volleyError) {
            Log.e("HttpManager", "req cmd = " + this.f6477a + " " + volleyError.toString(), volleyError);
        }
    }

    static {
        f6480b = "https://" + Config.f6660e[0] + ":8443/texaspokermoment/appprotocol";
    }

    public static HttpManager m3919a() {
        if (f6479a == null) {
            f6479a = new HttpManager();
            f6481c = new HttpManager();
        }
        return f6479a;
    }

    public final void m3921a(Package packageR) {
        if (packageR != null) {
            TEXAS_CMD eCmd = packageR.getECmd();
            new StringBuilder("req cmd = ").append(eCmd);
            Request protoBufHttpRequest = new ProtoBufHttpRequest(packageR.toByteArray(), f6481c, new HttpManager(this, eCmd), f6480b, (byte) 0);
            protoBufHttpRequest.setRetryPolicy(new DefaultRetryPolicy(Constants.ERRORCODE_UNKNOWN, 3, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
            protoBufHttpRequest.toString();
            f6479a.m3920a(protoBufHttpRequest);
        }
    }

    public final <T> void m3920a(Request<T> request) {
        if (this.f6482d == null) {
            this.f6482d = Volley.newRequestQueue(BaseApplication.m3548a());
        }
        this.f6482d.add(request);
    }
}
