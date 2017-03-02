package com.loopj.android.http;

import com.alipay.sdk.util.C0201h;
import org.apache.http.Header;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonHttpResponseHandler extends TextHttpResponseHandler {
    private static final String LOG_TAG = "JsonHttpRH";
    private boolean useRFC5179CompatibilityMode;

    /* renamed from: com.loopj.android.http.JsonHttpResponseHandler.1 */
    class C05381 implements Runnable {
        final /* synthetic */ Header[] val$headers;
        final /* synthetic */ byte[] val$responseBytes;
        final /* synthetic */ int val$statusCode;

        /* renamed from: com.loopj.android.http.JsonHttpResponseHandler.1.1 */
        class C05361 implements Runnable {
            final /* synthetic */ Object val$jsonResponse;

            C05361(Object obj) {
                this.val$jsonResponse = obj;
            }

            public void run() {
                if (!JsonHttpResponseHandler.this.useRFC5179CompatibilityMode && this.val$jsonResponse == null) {
                    JsonHttpResponseHandler.this.onSuccess(C05381.this.val$statusCode, C05381.this.val$headers, (String) null);
                } else if (this.val$jsonResponse instanceof JSONObject) {
                    JsonHttpResponseHandler.this.onSuccess(C05381.this.val$statusCode, C05381.this.val$headers, (JSONObject) this.val$jsonResponse);
                } else if (this.val$jsonResponse instanceof JSONArray) {
                    JsonHttpResponseHandler.this.onSuccess(C05381.this.val$statusCode, C05381.this.val$headers, (JSONArray) this.val$jsonResponse);
                } else if (!(this.val$jsonResponse instanceof String)) {
                    JsonHttpResponseHandler.this.onFailure(C05381.this.val$statusCode, C05381.this.val$headers, new JSONException("Unexpected response type " + this.val$jsonResponse.getClass().getName()), (JSONObject) null);
                } else if (JsonHttpResponseHandler.this.useRFC5179CompatibilityMode) {
                    JsonHttpResponseHandler.this.onFailure(C05381.this.val$statusCode, C05381.this.val$headers, (String) this.val$jsonResponse, new JSONException("Response cannot be parsed as JSON data"));
                } else {
                    JsonHttpResponseHandler.this.onSuccess(C05381.this.val$statusCode, C05381.this.val$headers, (String) this.val$jsonResponse);
                }
            }
        }

        /* renamed from: com.loopj.android.http.JsonHttpResponseHandler.1.2 */
        class C05372 implements Runnable {
            final /* synthetic */ JSONException val$ex;

            C05372(JSONException jSONException) {
                this.val$ex = jSONException;
            }

            public void run() {
                JsonHttpResponseHandler.this.onFailure(C05381.this.val$statusCode, C05381.this.val$headers, this.val$ex, (JSONObject) null);
            }
        }

        C05381(byte[] bArr, int i, Header[] headerArr) {
            this.val$responseBytes = bArr;
            this.val$statusCode = i;
            this.val$headers = headerArr;
        }

        public void run() {
            try {
                JsonHttpResponseHandler.this.postRunnable(new C05361(JsonHttpResponseHandler.this.parseResponse(this.val$responseBytes)));
            } catch (JSONException ex) {
                JsonHttpResponseHandler.this.postRunnable(new C05372(ex));
            }
        }
    }

    /* renamed from: com.loopj.android.http.JsonHttpResponseHandler.2 */
    class C05412 implements Runnable {
        final /* synthetic */ Header[] val$headers;
        final /* synthetic */ byte[] val$responseBytes;
        final /* synthetic */ int val$statusCode;
        final /* synthetic */ Throwable val$throwable;

        /* renamed from: com.loopj.android.http.JsonHttpResponseHandler.2.1 */
        class C05391 implements Runnable {
            final /* synthetic */ Object val$jsonResponse;

            C05391(Object obj) {
                this.val$jsonResponse = obj;
            }

            public void run() {
                if (!JsonHttpResponseHandler.this.useRFC5179CompatibilityMode && this.val$jsonResponse == null) {
                    JsonHttpResponseHandler.this.onFailure(C05412.this.val$statusCode, C05412.this.val$headers, (String) null, C05412.this.val$throwable);
                } else if (this.val$jsonResponse instanceof JSONObject) {
                    JsonHttpResponseHandler.this.onFailure(C05412.this.val$statusCode, C05412.this.val$headers, C05412.this.val$throwable, (JSONObject) this.val$jsonResponse);
                } else if (this.val$jsonResponse instanceof JSONArray) {
                    JsonHttpResponseHandler.this.onFailure(C05412.this.val$statusCode, C05412.this.val$headers, C05412.this.val$throwable, (JSONArray) this.val$jsonResponse);
                } else if (this.val$jsonResponse instanceof String) {
                    JsonHttpResponseHandler.this.onFailure(C05412.this.val$statusCode, C05412.this.val$headers, (String) this.val$jsonResponse, C05412.this.val$throwable);
                } else {
                    JsonHttpResponseHandler.this.onFailure(C05412.this.val$statusCode, C05412.this.val$headers, new JSONException("Unexpected response type " + this.val$jsonResponse.getClass().getName()), (JSONObject) null);
                }
            }
        }

        /* renamed from: com.loopj.android.http.JsonHttpResponseHandler.2.2 */
        class C05402 implements Runnable {
            final /* synthetic */ JSONException val$ex;

            C05402(JSONException jSONException) {
                this.val$ex = jSONException;
            }

            public void run() {
                JsonHttpResponseHandler.this.onFailure(C05412.this.val$statusCode, C05412.this.val$headers, this.val$ex, (JSONObject) null);
            }
        }

        C05412(byte[] bArr, int i, Header[] headerArr, Throwable th) {
            this.val$responseBytes = bArr;
            this.val$statusCode = i;
            this.val$headers = headerArr;
            this.val$throwable = th;
        }

        public void run() {
            try {
                JsonHttpResponseHandler.this.postRunnable(new C05391(JsonHttpResponseHandler.this.parseResponse(this.val$responseBytes)));
            } catch (JSONException ex) {
                JsonHttpResponseHandler.this.postRunnable(new C05402(ex));
            }
        }
    }

    public JsonHttpResponseHandler() {
        super(AsyncHttpResponseHandler.DEFAULT_CHARSET);
        this.useRFC5179CompatibilityMode = true;
    }

    public JsonHttpResponseHandler(String encoding) {
        super(encoding);
        this.useRFC5179CompatibilityMode = true;
    }

    public JsonHttpResponseHandler(boolean useRFC5179CompatibilityMode) {
        super(AsyncHttpResponseHandler.DEFAULT_CHARSET);
        this.useRFC5179CompatibilityMode = true;
        this.useRFC5179CompatibilityMode = useRFC5179CompatibilityMode;
    }

    public JsonHttpResponseHandler(String encoding, boolean useRFC5179CompatibilityMode) {
        super(encoding);
        this.useRFC5179CompatibilityMode = true;
        this.useRFC5179CompatibilityMode = useRFC5179CompatibilityMode;
    }

    public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
        AsyncHttpClient.log.m1890w(LOG_TAG, "onSuccess(int, Header[], JSONObject) was not overriden, but callback was received");
    }

    public void onSuccess(int statusCode, Header[] headers, JSONArray response) {
        AsyncHttpClient.log.m1890w(LOG_TAG, "onSuccess(int, Header[], JSONArray) was not overriden, but callback was received");
    }

    public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
        AsyncHttpClient.log.m1891w(LOG_TAG, "onFailure(int, Header[], Throwable, JSONObject) was not overriden, but callback was received", throwable);
    }

    public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONArray errorResponse) {
        AsyncHttpClient.log.m1891w(LOG_TAG, "onFailure(int, Header[], Throwable, JSONArray) was not overriden, but callback was received", throwable);
    }

    public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
        AsyncHttpClient.log.m1891w(LOG_TAG, "onFailure(int, Header[], String, Throwable) was not overriden, but callback was received", throwable);
    }

    public void onSuccess(int statusCode, Header[] headers, String responseString) {
        AsyncHttpClient.log.m1890w(LOG_TAG, "onSuccess(int, Header[], String) was not overriden, but callback was received");
    }

    public final void onSuccess(int statusCode, Header[] headers, byte[] responseBytes) {
        if (statusCode != 204) {
            Runnable parser = new C05381(responseBytes, statusCode, headers);
            if (getUseSynchronousMode() || getUsePoolThread()) {
                parser.run();
                return;
            } else {
                new Thread(parser).start();
                return;
            }
        }
        onSuccess(statusCode, headers, new JSONObject());
    }

    public final void onFailure(int statusCode, Header[] headers, byte[] responseBytes, Throwable throwable) {
        if (responseBytes != null) {
            Runnable parser = new C05412(responseBytes, statusCode, headers, throwable);
            if (getUseSynchronousMode() || getUsePoolThread()) {
                parser.run();
                return;
            } else {
                new Thread(parser).start();
                return;
            }
        }
        AsyncHttpClient.log.m1888v(LOG_TAG, "response body is null, calling onFailure(Throwable, JSONObject)");
        onFailure(statusCode, headers, throwable, (JSONObject) null);
    }

    protected Object parseResponse(byte[] responseBody) throws JSONException {
        if (responseBody == null) {
            return null;
        }
        Object result = null;
        String jsonString = TextHttpResponseHandler.getResponseString(responseBody, getCharset());
        if (jsonString != null) {
            jsonString = jsonString.trim();
            if (this.useRFC5179CompatibilityMode) {
                if (jsonString.startsWith("{") || jsonString.startsWith("[")) {
                    result = new JSONTokener(jsonString).nextValue();
                }
            } else if ((jsonString.startsWith("{") && jsonString.endsWith(C0201h.f512d)) || (jsonString.startsWith("[") && jsonString.endsWith("]"))) {
                result = new JSONTokener(jsonString).nextValue();
            } else if (jsonString.startsWith(C0201h.f514f) && jsonString.endsWith(C0201h.f514f)) {
                result = jsonString.substring(1, jsonString.length() - 1);
            }
        }
        if (result == null) {
            return jsonString;
        }
        return result;
    }

    public boolean isUseRFC5179CompatibilityMode() {
        return this.useRFC5179CompatibilityMode;
    }

    public void setUseRFC5179CompatibilityMode(boolean useRFC5179CompatibilityMode) {
        this.useRFC5179CompatibilityMode = useRFC5179CompatibilityMode;
    }
}
