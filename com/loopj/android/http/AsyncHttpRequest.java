package com.loopj.android.http;

import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.protocol.HttpContext;

public class AsyncHttpRequest implements Runnable {
    private boolean cancelIsNotified;
    private final AbstractHttpClient client;
    private final HttpContext context;
    private int executionCount;
    private final AtomicBoolean isCancelled;
    private volatile boolean isFinished;
    private boolean isRequestPreProcessed;
    private final HttpUriRequest request;
    private final ResponseHandlerInterface responseHandler;

    public AsyncHttpRequest(AbstractHttpClient client, HttpContext context, HttpUriRequest request, ResponseHandlerInterface responseHandler) {
        this.isCancelled = new AtomicBoolean();
        this.client = (AbstractHttpClient) Utils.notNull(client, "client");
        this.context = (HttpContext) Utils.notNull(context, "context");
        this.request = (HttpUriRequest) Utils.notNull(request, SocialConstants.TYPE_REQUEST);
        this.responseHandler = (ResponseHandlerInterface) Utils.notNull(responseHandler, "responseHandler");
    }

    public void onPreProcessRequest(AsyncHttpRequest request) {
    }

    public void onPostProcessRequest(AsyncHttpRequest request) {
    }

    public void run() {
        if (!isCancelled()) {
            if (!this.isRequestPreProcessed) {
                this.isRequestPreProcessed = true;
                onPreProcessRequest(this);
            }
            if (!isCancelled()) {
                this.responseHandler.sendStartMessage();
                if (!isCancelled()) {
                    try {
                        makeRequestWithRetries();
                    } catch (IOException e) {
                        if (isCancelled()) {
                            AsyncHttpClient.log.m1885e("AsyncHttpRequest", "makeRequestWithRetries returned error", e);
                        } else {
                            this.responseHandler.sendFailureMessage(0, null, null, e);
                        }
                    }
                    if (!isCancelled()) {
                        this.responseHandler.sendFinishMessage();
                        if (!isCancelled()) {
                            onPostProcessRequest(this);
                            this.isFinished = true;
                        }
                    }
                }
            }
        }
    }

    private void makeRequest() throws IOException {
        if (!isCancelled()) {
            if (this.request.getURI().getScheme() == null) {
                throw new MalformedURLException("No valid URI scheme was provided");
            }
            if (this.responseHandler instanceof RangeFileAsyncHttpResponseHandler) {
                ((RangeFileAsyncHttpResponseHandler) this.responseHandler).updateRequestHeaders(this.request);
            }
            HttpResponse response = this.client.execute(this.request, this.context);
            if (!isCancelled()) {
                this.responseHandler.onPreProcessResponse(this.responseHandler, response);
                if (!isCancelled()) {
                    this.responseHandler.sendResponseMessage(response);
                    if (!isCancelled()) {
                        this.responseHandler.onPostProcessResponse(this.responseHandler, response);
                    }
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void makeRequestWithRetries() throws java.io.IOException {
        /*
        r8 = this;
        r3 = 1;
        r0 = 0;
        r5 = r8.client;
        r4 = r5.getHttpRequestRetryHandler();
        r1 = r0;
    L_0x0009:
        if (r3 == 0) goto L_0x008b;
    L_0x000b:
        r8.makeRequest();	 Catch:{ UnknownHostException -> 0x000f, NullPointerException -> 0x004c, IOException -> 0x0076 }
    L_0x000e:
        return;
    L_0x000f:
        r2 = move-exception;
        r0 = new java.io.IOException;	 Catch:{ Exception -> 0x008d }
        r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x008d }
        r5.<init>();	 Catch:{ Exception -> 0x008d }
        r6 = "UnknownHostException exception: ";
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x008d }
        r6 = r2.getMessage();	 Catch:{ Exception -> 0x008d }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x008d }
        r5 = r5.toString();	 Catch:{ Exception -> 0x008d }
        r0.<init>(r5);	 Catch:{ Exception -> 0x008d }
        r5 = r8.executionCount;	 Catch:{ Exception -> 0x00b5 }
        if (r5 <= 0) goto L_0x004a;
    L_0x0030:
        r5 = r8.executionCount;	 Catch:{ Exception -> 0x00b5 }
        r5 = r5 + 1;
        r8.executionCount = r5;	 Catch:{ Exception -> 0x00b5 }
        r6 = r8.context;	 Catch:{ Exception -> 0x00b5 }
        r5 = r4.retryRequest(r2, r5, r6);	 Catch:{ Exception -> 0x00b5 }
        if (r5 == 0) goto L_0x004a;
    L_0x003e:
        r3 = 1;
    L_0x003f:
        if (r3 == 0) goto L_0x00b7;
    L_0x0041:
        r5 = r8.responseHandler;	 Catch:{ Exception -> 0x00b5 }
        r6 = r8.executionCount;	 Catch:{ Exception -> 0x00b5 }
        r5.sendRetryMessage(r6);	 Catch:{ Exception -> 0x00b5 }
        r1 = r0;
        goto L_0x0009;
    L_0x004a:
        r3 = 0;
        goto L_0x003f;
    L_0x004c:
        r2 = move-exception;
        r0 = new java.io.IOException;	 Catch:{ Exception -> 0x008d }
        r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x008d }
        r5.<init>();	 Catch:{ Exception -> 0x008d }
        r6 = "NPE in HttpClient: ";
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x008d }
        r6 = r2.getMessage();	 Catch:{ Exception -> 0x008d }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x008d }
        r5 = r5.toString();	 Catch:{ Exception -> 0x008d }
        r0.<init>(r5);	 Catch:{ Exception -> 0x008d }
        r5 = r8.executionCount;	 Catch:{ Exception -> 0x00b5 }
        r5 = r5 + 1;
        r8.executionCount = r5;	 Catch:{ Exception -> 0x00b5 }
        r6 = r8.context;	 Catch:{ Exception -> 0x00b5 }
        r3 = r4.retryRequest(r0, r5, r6);	 Catch:{ Exception -> 0x00b5 }
        goto L_0x003f;
    L_0x0076:
        r2 = move-exception;
        r5 = r8.isCancelled();	 Catch:{ Exception -> 0x008d }
        if (r5 != 0) goto L_0x000e;
    L_0x007d:
        r0 = r2;
        r5 = r8.executionCount;	 Catch:{ Exception -> 0x00b5 }
        r5 = r5 + 1;
        r8.executionCount = r5;	 Catch:{ Exception -> 0x00b5 }
        r6 = r8.context;	 Catch:{ Exception -> 0x00b5 }
        r3 = r4.retryRequest(r0, r5, r6);	 Catch:{ Exception -> 0x00b5 }
        goto L_0x003f;
    L_0x008b:
        r0 = r1;
    L_0x008c:
        throw r0;
    L_0x008d:
        r2 = move-exception;
        r0 = r1;
    L_0x008f:
        r5 = com.loopj.android.http.AsyncHttpClient.log;
        r6 = "AsyncHttpRequest";
        r7 = "Unhandled exception origin cause";
        r5.m1885e(r6, r7, r2);
        r0 = new java.io.IOException;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = "Unhandled exception: ";
        r5 = r5.append(r6);
        r6 = r2.getMessage();
        r5 = r5.append(r6);
        r5 = r5.toString();
        r0.<init>(r5);
        goto L_0x008c;
    L_0x00b5:
        r2 = move-exception;
        goto L_0x008f;
    L_0x00b7:
        r1 = r0;
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loopj.android.http.AsyncHttpRequest.makeRequestWithRetries():void");
    }

    public boolean isCancelled() {
        boolean cancelled = this.isCancelled.get();
        if (cancelled) {
            sendCancelNotification();
        }
        return cancelled;
    }

    private synchronized void sendCancelNotification() {
        if (!(this.isFinished || !this.isCancelled.get() || this.cancelIsNotified)) {
            this.cancelIsNotified = true;
            this.responseHandler.sendCancelMessage();
        }
    }

    public boolean isDone() {
        return isCancelled() || this.isFinished;
    }

    public boolean cancel(boolean mayInterruptIfRunning) {
        this.isCancelled.set(true);
        this.request.abort();
        return isCancelled();
    }

    public AsyncHttpRequest setRequestTag(Object TAG) {
        this.responseHandler.setTag(TAG);
        return this;
    }

    public Object getTag() {
        return this.responseHandler.getTag();
    }
}
