package com.loopj.android.http;

import org.apache.http.Header;

public abstract class BaseJsonHttpResponseHandler<JSON_TYPE> extends TextHttpResponseHandler {
    private static final String LOG_TAG = "BaseJsonHttpRH";

    /* renamed from: com.loopj.android.http.BaseJsonHttpResponseHandler.1 */
    class C05321 implements Runnable {
        final /* synthetic */ Header[] val$headers;
        final /* synthetic */ String val$responseString;
        final /* synthetic */ int val$statusCode;

        /* renamed from: com.loopj.android.http.BaseJsonHttpResponseHandler.1.1 */
        class C05301 implements Runnable {
            final /* synthetic */ Object val$jsonResponse;

            C05301(Object obj) {
                this.val$jsonResponse = obj;
            }

            public void run() {
                BaseJsonHttpResponseHandler.this.onSuccess(C05321.this.val$statusCode, C05321.this.val$headers, C05321.this.val$responseString, this.val$jsonResponse);
            }
        }

        /* renamed from: com.loopj.android.http.BaseJsonHttpResponseHandler.1.2 */
        class C05312 implements Runnable {
            final /* synthetic */ Throwable val$t;

            C05312(Throwable th) {
                this.val$t = th;
            }

            public void run() {
                BaseJsonHttpResponseHandler.this.onFailure(C05321.this.val$statusCode, C05321.this.val$headers, this.val$t, C05321.this.val$responseString, null);
            }
        }

        C05321(String str, int i, Header[] headerArr) {
            this.val$responseString = str;
            this.val$statusCode = i;
            this.val$headers = headerArr;
        }

        public void run() {
            try {
                BaseJsonHttpResponseHandler.this.postRunnable(new C05301(BaseJsonHttpResponseHandler.this.parseResponse(this.val$responseString, false)));
            } catch (Throwable t) {
                AsyncHttpClient.log.m1883d(BaseJsonHttpResponseHandler.LOG_TAG, "parseResponse thrown an problem", t);
                BaseJsonHttpResponseHandler.this.postRunnable(new C05312(t));
            }
        }
    }

    /* renamed from: com.loopj.android.http.BaseJsonHttpResponseHandler.2 */
    class C05352 implements Runnable {
        final /* synthetic */ Header[] val$headers;
        final /* synthetic */ String val$responseString;
        final /* synthetic */ int val$statusCode;
        final /* synthetic */ Throwable val$throwable;

        /* renamed from: com.loopj.android.http.BaseJsonHttpResponseHandler.2.1 */
        class C05331 implements Runnable {
            final /* synthetic */ Object val$jsonResponse;

            C05331(Object obj) {
                this.val$jsonResponse = obj;
            }

            public void run() {
                BaseJsonHttpResponseHandler.this.onFailure(C05352.this.val$statusCode, C05352.this.val$headers, C05352.this.val$throwable, C05352.this.val$responseString, this.val$jsonResponse);
            }
        }

        /* renamed from: com.loopj.android.http.BaseJsonHttpResponseHandler.2.2 */
        class C05342 implements Runnable {
            C05342() {
            }

            public void run() {
                BaseJsonHttpResponseHandler.this.onFailure(C05352.this.val$statusCode, C05352.this.val$headers, C05352.this.val$throwable, C05352.this.val$responseString, null);
            }
        }

        C05352(String str, int i, Header[] headerArr, Throwable th) {
            this.val$responseString = str;
            this.val$statusCode = i;
            this.val$headers = headerArr;
            this.val$throwable = th;
        }

        public void run() {
            try {
                BaseJsonHttpResponseHandler.this.postRunnable(new C05331(BaseJsonHttpResponseHandler.this.parseResponse(this.val$responseString, true)));
            } catch (Throwable t) {
                AsyncHttpClient.log.m1883d(BaseJsonHttpResponseHandler.LOG_TAG, "parseResponse thrown an problem", t);
                BaseJsonHttpResponseHandler.this.postRunnable(new C05342());
            }
        }
    }

    public abstract void onFailure(int i, Header[] headerArr, Throwable th, String str, JSON_TYPE json_type);

    public abstract void onSuccess(int i, Header[] headerArr, String str, JSON_TYPE json_type);

    protected abstract JSON_TYPE parseResponse(String str, boolean z) throws Throwable;

    public BaseJsonHttpResponseHandler() {
        this(AsyncHttpResponseHandler.DEFAULT_CHARSET);
    }

    public BaseJsonHttpResponseHandler(String encoding) {
        super(encoding);
    }

    public final void onSuccess(int statusCode, Header[] headers, String responseString) {
        if (statusCode != 204) {
            Runnable parser = new C05321(responseString, statusCode, headers);
            if (getUseSynchronousMode() || getUsePoolThread()) {
                parser.run();
                return;
            } else {
                new Thread(parser).start();
                return;
            }
        }
        onSuccess(statusCode, headers, null, null);
    }

    public final void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
        if (responseString != null) {
            Runnable parser = new C05352(responseString, statusCode, headers, throwable);
            if (getUseSynchronousMode() || getUsePoolThread()) {
                parser.run();
                return;
            } else {
                new Thread(parser).start();
                return;
            }
        }
        onFailure(statusCode, headers, throwable, null, null);
    }
}
