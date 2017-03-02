package com.android.volley.toolbox;

import android.os.SystemClock;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.alipay.sdk.app.statistic.C0146c;
import com.android.volley.AuthFailureError;
import com.android.volley.Cache.Entry;
import com.android.volley.ClientError;
import com.android.volley.Network;
import com.android.volley.NetworkError;
import com.android.volley.NetworkResponse;
import com.android.volley.NoConnectionError;
import com.android.volley.Request;
import com.android.volley.RetryPolicy;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.igexin.download.Downloads;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.cookie.DateUtils;

public class BasicNetwork implements Network {
    protected static final boolean DEBUG;
    private static int DEFAULT_POOL_SIZE;
    private static int SLOW_REQUEST_THRESHOLD_MS;
    protected final HttpStack mHttpStack;
    protected final ByteArrayPool mPool;

    static {
        DEBUG = VolleyLog.DEBUG;
        SLOW_REQUEST_THRESHOLD_MS = 3000;
        DEFAULT_POOL_SIZE = AccessibilityNodeInfoCompat.ACTION_SCROLL_FORWARD;
    }

    public BasicNetwork(HttpStack httpStack) {
        this(httpStack, new ByteArrayPool(DEFAULT_POOL_SIZE));
    }

    public BasicNetwork(HttpStack httpStack, ByteArrayPool pool) {
        this.mHttpStack = httpStack;
        this.mPool = pool;
    }

    public NetworkResponse performRequest(Request<?> request) throws VolleyError {
        int statusCode;
        long requestStart = SystemClock.elapsedRealtime();
        while (true) {
            HttpResponse httpResponse = null;
            byte[] responseContents = null;
            Map<String, String> responseHeaders = new HashMap();
            try {
                Map<String, String> headers = new HashMap();
                addCacheHeaders(headers, request.getCacheEntry());
                httpResponse = this.mHttpStack.performRequest(request, headers);
                StatusLine statusLine = httpResponse.getStatusLine();
                statusCode = statusLine.getStatusCode();
                responseHeaders = convertHeaders(httpResponse.getAllHeaders());
                if (statusCode != 304) {
                    responseContents = entityToBytes(httpResponse.getEntity());
                    logSlowRequests(SystemClock.elapsedRealtime() - requestStart, request, responseContents, statusLine);
                    if (statusCode != Downloads.STATUS_SUCCESS && statusCode != 201 && statusCode != 202 && statusCode != 204) {
                        break;
                    }
                    return new NetworkResponse(statusCode, responseContents, responseHeaders, false);
                }
                return new NetworkResponse(304, request.getCacheEntry().data, responseHeaders, true);
            } catch (SocketTimeoutException e) {
                attemptRetryOnException("socket", request, new TimeoutError());
            } catch (ConnectTimeoutException e2) {
                attemptRetryOnException("connection", request, new TimeoutError());
            } catch (MalformedURLException e3) {
                String str = "Bad URL ";
                throw new RuntimeException(request.getUrl(), e3);
            } catch (IOException e4) {
                if (httpResponse != null) {
                    statusCode = httpResponse.getStatusLine().getStatusCode();
                    VolleyLog.m717e("Unexpected response code %d for %s", Integer.valueOf(statusCode), request.getUrl());
                    if (responseContents != null) {
                        NetworkResponse networkResponse = new NetworkResponse(statusCode, responseContents, responseHeaders, false);
                        if (statusCode == 401 || statusCode == 403) {
                            attemptRetryOnException(C0146c.f244d, request, new AuthFailureError(networkResponse));
                        } else {
                            break;
                            if (statusCode == Downloads.STATUS_BAD_REQUEST || statusCode == 404 || statusCode == Downloads.STATUS_NOT_ACCEPTABLE || statusCode == 501) {
                                throw new ClientError(networkResponse);
                            }
                            throw new ServerError(networkResponse);
                        }
                    }
                    break;
                    throw new NetworkError(null);
                }
                break;
                throw new NoConnectionError(e4);
            }
        }
        throw new IOException();
    }

    private void logSlowRequests(long requestLifetime, Request<?> request, byte[] responseContents, StatusLine statusLine) {
        if (DEBUG || requestLifetime > ((long) SLOW_REQUEST_THRESHOLD_MS)) {
            String str = "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]";
            Object[] objArr = new Object[5];
            objArr[0] = request;
            objArr[1] = Long.valueOf(requestLifetime);
            objArr[2] = responseContents != null ? Integer.valueOf(responseContents.length) : "null";
            objArr[3] = Integer.valueOf(statusLine.getStatusCode());
            objArr[4] = Integer.valueOf(request.getRetryPolicy().getCurrentRetryCount());
            VolleyLog.m716d(str, objArr);
        }
    }

    private static void attemptRetryOnException(String logPrefix, Request<?> request, VolleyError exception) throws VolleyError {
        RetryPolicy retryPolicy = request.getRetryPolicy();
        int oldTimeout = request.getTimeoutMs();
        try {
            retryPolicy.retry(exception);
            request.addMarker(String.format("%s-retry [timeout=%s]", new Object[]{logPrefix, Integer.valueOf(oldTimeout)}));
        } catch (VolleyError e) {
            request.addMarker(String.format("%s-timeout-giveup [timeout=%s]", new Object[]{logPrefix, Integer.valueOf(oldTimeout)}));
            throw e;
        }
    }

    private void addCacheHeaders(Map<String, String> headers, Entry entry) {
        if (entry != null) {
            if (entry.etag != null) {
                headers.put("If-None-Match", entry.etag);
            }
            if (entry.serverDate > 0) {
                headers.put("If-Modified-Since", DateUtils.formatDate(new Date(entry.serverDate)));
            }
        }
    }

    protected void logError(String what, String url, long start) {
        long now = SystemClock.elapsedRealtime();
        VolleyLog.m719v("HTTP ERROR(%s) %d ms to fetch %s", what, Long.valueOf(now - start), url);
    }

    private byte[] entityToBytes(HttpEntity entity) throws IOException, ServerError {
        PoolingByteArrayOutputStream bytes = new PoolingByteArrayOutputStream(this.mPool, (int) entity.getContentLength());
        byte[] buffer = null;
        try {
            InputStream in = entity.getContent();
            if (in == null) {
                throw new ServerError();
            }
            buffer = this.mPool.getBuf(AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT);
            while (true) {
                int count = in.read(buffer);
                if (count == -1) {
                    break;
                }
                bytes.write(buffer, 0, count);
            }
            byte[] toByteArray = bytes.toByteArray();
            return toByteArray;
        } finally {
            try {
                entity.consumeContent();
            } catch (IOException e) {
                VolleyLog.m719v("Error occured when calling consumingContent", new Object[0]);
            }
            this.mPool.returnBuf(buffer);
            bytes.close();
        }
    }

    private static Map<String, String> convertHeaders(Header[] headers) {
        Map<String, String> result = new HashMap();
        for (int i = 0; i < headers.length; i++) {
            result.put(headers[i].getName(), headers[i].getValue());
        }
        return result;
    }
}
