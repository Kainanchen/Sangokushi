package com.loopj.android.http;

import java.io.File;
import java.io.IOException;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.methods.HttpUriRequest;

public abstract class RangeFileAsyncHttpResponseHandler extends FileAsyncHttpResponseHandler {
    private static final String LOG_TAG = "RangeFileAsyncHttpRH";
    private boolean append;
    private long current;

    public RangeFileAsyncHttpResponseHandler(File file) {
        super(file);
        this.current = 0;
        this.append = false;
    }

    public void sendResponseMessage(HttpResponse response) throws IOException {
        if (!Thread.currentThread().isInterrupted()) {
            StatusLine status = response.getStatusLine();
            if (status.getStatusCode() == 416) {
                if (!Thread.currentThread().isInterrupted()) {
                    sendSuccessMessage(status.getStatusCode(), response.getAllHeaders(), null);
                }
            } else if (status.getStatusCode() >= 300) {
                if (!Thread.currentThread().isInterrupted()) {
                    sendFailureMessage(status.getStatusCode(), response.getAllHeaders(), null, new HttpResponseException(status.getStatusCode(), status.getReasonPhrase()));
                }
            } else if (!Thread.currentThread().isInterrupted()) {
                Header header = response.getFirstHeader(AsyncHttpClient.HEADER_CONTENT_RANGE);
                if (header == null) {
                    this.append = false;
                    this.current = 0;
                } else {
                    AsyncHttpClient.log.m1888v(LOG_TAG, "Content-Range: " + header.getValue());
                }
                sendSuccessMessage(status.getStatusCode(), response.getAllHeaders(), getResponseData(response.getEntity()));
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected byte[] getResponseData(org.apache.http.HttpEntity r11) throws java.io.IOException {
        /*
        r10 = this;
        if (r11 == 0) goto L_0x005a;
    L_0x0002:
        r1 = r11.getContent();
        r6 = r11.getContentLength();
        r8 = r10.current;
        r2 = r6 + r8;
        r0 = new java.io.FileOutputStream;
        r6 = r10.getTargetFile();
        r7 = r10.append;
        r0.<init>(r6, r7);
        if (r1 == 0) goto L_0x005a;
    L_0x001b:
        r6 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r5 = new byte[r6];	 Catch:{ all -> 0x0046 }
    L_0x001f:
        r6 = r10.current;	 Catch:{ all -> 0x0046 }
        r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r6 >= 0) goto L_0x0051;
    L_0x0025:
        r4 = r1.read(r5);	 Catch:{ all -> 0x0046 }
        r6 = -1;
        if (r4 == r6) goto L_0x0051;
    L_0x002c:
        r6 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0046 }
        r6 = r6.isInterrupted();	 Catch:{ all -> 0x0046 }
        if (r6 != 0) goto L_0x0051;
    L_0x0036:
        r6 = r10.current;	 Catch:{ all -> 0x0046 }
        r8 = (long) r4;	 Catch:{ all -> 0x0046 }
        r6 = r6 + r8;
        r10.current = r6;	 Catch:{ all -> 0x0046 }
        r6 = 0;
        r0.write(r5, r6, r4);	 Catch:{ all -> 0x0046 }
        r6 = r10.current;	 Catch:{ all -> 0x0046 }
        r10.sendProgressMessage(r6, r2);	 Catch:{ all -> 0x0046 }
        goto L_0x001f;
    L_0x0046:
        r6 = move-exception;
        r1.close();
        r0.flush();
        r0.close();
        throw r6;
    L_0x0051:
        r1.close();
        r0.flush();
        r0.close();
    L_0x005a:
        r6 = 0;
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loopj.android.http.RangeFileAsyncHttpResponseHandler.getResponseData(org.apache.http.HttpEntity):byte[]");
    }

    public void updateRequestHeaders(HttpUriRequest uriRequest) {
        if (this.file.exists() && this.file.canWrite()) {
            this.current = this.file.length();
        }
        if (this.current > 0) {
            this.append = true;
            uriRequest.setHeader("Range", "bytes=" + this.current + "-");
        }
    }
}
