package com.android.volley.toolbox;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.android.volley.Request;
import com.tencent.mm.sdk.modelpay.PayReq.Options;
import com.texaspoker.moment.TexasPoker.QuickGameRoomPushMsg;
import com.texaspoker.moment.TexasPoker.SCGameActionRsp;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.sqlcipher.database.SQLiteDatabase;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.message.BasicNameValuePair;

public class HttpClientStack implements HttpStack {
    private static final String HEADER_CONTENT_TYPE = "Content-Type";
    protected final HttpClient mClient;

    public static final class HttpPatch extends HttpEntityEnclosingRequestBase {
        public static final String METHOD_NAME = "PATCH";

        public HttpPatch(URI uri) {
            setURI(uri);
        }

        public HttpPatch(String str) {
            setURI(URI.create(str));
        }

        public final String getMethod() {
            return METHOD_NAME;
        }
    }

    static {
        fixHelper.fixfunc(new int[]{7, 8, 9});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native HttpClientStack(HttpClient httpClient);

    protected native void onPrepareRequest(HttpUriRequest httpUriRequest);

    public native HttpResponse performRequest(Request<?> request, Map<String, String> map);

    private static void addHeaders(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String str : map.keySet()) {
            httpUriRequest.setHeader(str, (String) map.get(str));
        }
    }

    private static List<NameValuePair> getPostParameterPairs(Map<String, String> map) {
        List<NameValuePair> arrayList = new ArrayList(map.size());
        for (String str : map.keySet()) {
            arrayList.add(new BasicNameValuePair(str, (String) map.get(str)));
        }
        return arrayList;
    }

    static HttpUriRequest createHttpRequest(Request<?> request, Map<String, String> map) {
        HttpUriRequest httpPost;
        switch (request.getMethod()) {
            case Options.INVALID_FLAGS /*-1*/:
                byte[] postBody = request.getPostBody();
                if (postBody == null) {
                    return new HttpGet(request.getUrl());
                }
                httpPost = new HttpPost(request.getUrl());
                httpPost.addHeader(HEADER_CONTENT_TYPE, request.getPostBodyContentType());
                httpPost.setEntity(new ByteArrayEntity(postBody));
                return httpPost;
            case SQLiteDatabase.OPEN_READWRITE /*0*/:
                return new HttpGet(request.getUrl());
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                httpPost = new HttpPost(request.getUrl());
                httpPost.addHeader(HEADER_CONTENT_TYPE, request.getBodyContentType());
                setEntityIfNonEmptyBody(httpPost, request);
                return httpPost;
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                httpPost = new HttpPut(request.getUrl());
                httpPost.addHeader(HEADER_CONTENT_TYPE, request.getBodyContentType());
                setEntityIfNonEmptyBody(httpPost, request);
                return httpPost;
            case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                return new HttpDelete(request.getUrl());
            case SQLiteDatabase.CONFLICT_IGNORE /*4*/:
                return new HttpHead(request.getUrl());
            case SQLiteDatabase.CONFLICT_REPLACE /*5*/:
                return new HttpOptions(request.getUrl());
            case SCGameActionRsp.LBETTINGID_FIELD_NUMBER /*6*/:
                return new HttpTrace(request.getUrl());
            case QuickGameRoomPushMsg.STFROMUSER_FIELD_NUMBER /*7*/:
                httpPost = new HttpPatch(request.getUrl());
                httpPost.addHeader(HEADER_CONTENT_TYPE, request.getBodyContentType());
                setEntityIfNonEmptyBody(httpPost, request);
                return httpPost;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
    }

    private static void setEntityIfNonEmptyBody(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, Request<?> request) {
        byte[] body = request.getBody();
        if (body != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(body));
        }
    }
}
