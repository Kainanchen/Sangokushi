package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.tencent.mm.sdk.modelpay.PayReq.Options;
import com.tencent.wxop.stat.StatAccount;
import com.tencent.wxop.stat.common.StatConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public class HttpClientStack implements HttpStack {
    private static final String HEADER_CONTENT_TYPE = "Content-Type";
    protected final HttpClient mClient;

    public HttpClientStack(HttpClient client) {
        this.mClient = client;
    }

    private static void addHeaders(HttpUriRequest httpRequest, Map<String, String> headers) {
        for (String key : headers.keySet()) {
            httpRequest.setHeader(key, (String) headers.get(key));
        }
    }

    private static List<NameValuePair> getPostParameterPairs(Map<String, String> postParams) {
        List<NameValuePair> result = new ArrayList(postParams.size());
        for (String key : postParams.keySet()) {
            result.add(new BasicNameValuePair(key, (String) postParams.get(key)));
        }
        return result;
    }

    public HttpResponse performRequest(Request<?> request, Map<String, String> additionalHeaders) throws IOException, AuthFailureError {
        HttpUriRequest httpRequest = createHttpRequest(request, additionalHeaders);
        addHeaders(httpRequest, additionalHeaders);
        addHeaders(httpRequest, request.getHeaders());
        onPrepareRequest(httpRequest);
        HttpParams httpParams = httpRequest.getParams();
        int timeoutMs = request.getTimeoutMs();
        HttpConnectionParams.setConnectionTimeout(httpParams, 5000);
        HttpConnectionParams.setSoTimeout(httpParams, timeoutMs);
        return this.mClient.execute(httpRequest);
    }

    static HttpUriRequest createHttpRequest(Request<?> request, Map<String, String> map) throws AuthFailureError {
        HttpPost postRequest;
        switch (request.getMethod()) {
            case Options.INVALID_FLAGS /*-1*/:
                byte[] postBody = request.getPostBody();
                if (postBody == null) {
                    return new HttpGet(request.getUrl());
                }
                postRequest = new HttpPost(request.getUrl());
                postRequest.addHeader(HEADER_CONTENT_TYPE, request.getPostBodyContentType());
                postRequest.setEntity(new ByteArrayEntity(postBody));
                return postRequest;
            case StatAccount.DEFAULT_TYPE /*0*/:
                return new HttpGet(request.getUrl());
            case StatConstants.XG_PRO_VERSION /*1*/:
                postRequest = new HttpPost(request.getUrl());
                postRequest.addHeader(HEADER_CONTENT_TYPE, request.getBodyContentType());
                setEntityIfNonEmptyBody(postRequest, request);
                return postRequest;
            case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                HttpEntityEnclosingRequestBase putRequest = new HttpPut(request.getUrl());
                putRequest.addHeader(HEADER_CONTENT_TYPE, request.getBodyContentType());
                setEntityIfNonEmptyBody(putRequest, request);
                return putRequest;
            case StatConstants.STAT_DB_VERSION /*3*/:
                return new HttpDelete(request.getUrl());
            default:
                throw new IllegalStateException("Unknown request method.");
        }
    }

    private static void setEntityIfNonEmptyBody(HttpEntityEnclosingRequestBase httpRequest, Request<?> request) throws AuthFailureError {
        byte[] body = request.getBody();
        if (body != null) {
            httpRequest.setEntity(new ByteArrayEntity(body));
        }
    }

    protected void onPrepareRequest(HttpUriRequest request) throws IOException {
    }
}
