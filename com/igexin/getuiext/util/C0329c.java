package com.igexin.getuiext.util;

import com.igexin.download.Downloads;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.tencent.connect.common.Constants;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Locale;
import org.apache.http.HttpResponse;
import org.apache.http.MethodNotSupportedException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

/* renamed from: com.igexin.getuiext.util.c */
public class C0329c {
    public static InputStream m1093a(String str, String str2, HashMap hashMap) {
        if (str == null) {
            str = Constants.HTTP_POST;
        }
        if (Constants.HTTP_POST.equals(str.toUpperCase(Locale.US))) {
            return C0329c.m1100b(str2, hashMap);
        }
        if (Constants.HTTP_GET.equalsIgnoreCase(str)) {
            return C0329c.m1094a(str2, hashMap);
        }
        throw new MethodNotSupportedException("Method you passed in httpMethod current can't be supported. Please contact Devin");
    }

    private static InputStream m1094a(String str, HashMap hashMap) {
        HttpClient defaultHttpClient = new DefaultHttpClient(C0329c.m1099a());
        if (hashMap != null) {
            str = str + "?" + C0328b.m1091a(hashMap);
        }
        try {
            HttpResponse execute = defaultHttpClient.execute(new HttpGet(str));
            if (execute.getStatusLine().getStatusCode() == Downloads.STATUS_SUCCESS) {
                return execute.getEntity().getContent();
            }
        } catch (Exception e) {
        }
        return null;
    }

    public static String m1095a(String str, int i) {
        return C0329c.m1096a(str, null, i);
    }

    public static String m1096a(String str, String str2, int i) {
        String str3 = null;
        if (str != null) {
            byte[] bytes;
            HttpUriRequest httpPost = new HttpPost(str);
            if (str2 != null) {
                try {
                    bytes = str2.getBytes(AsyncHttpResponseHandler.DEFAULT_CHARSET);
                } catch (UnsupportedEncodingException e) {
                    bytes = str3;
                }
            } else {
                bytes = str3;
            }
            if (bytes != null) {
                httpPost.setEntity(new InputStreamEntity(new ByteArrayInputStream(bytes), (long) bytes.length));
            }
            HttpClient defaultHttpClient = new DefaultHttpClient(C0329c.m1099a());
            HttpResponse httpResponse = str3;
            while (i > 0) {
                try {
                    httpResponse = defaultHttpClient.execute(httpPost);
                } catch (Exception e2) {
                }
                if (httpResponse == null) {
                    break;
                } else if (httpResponse.getStatusLine().getStatusCode() == Downloads.STATUS_SUCCESS) {
                    try {
                        str3 = EntityUtils.toString(httpResponse.getEntity(), AsyncHttpResponseHandler.DEFAULT_CHARSET);
                        break;
                    } catch (Exception e3) {
                    }
                } else {
                    i--;
                }
            }
        }
        return str3;
    }

    public static String m1097a(String str, JSONObject jSONObject, int i) {
        return C0329c.m1096a(str, jSONObject != null ? jSONObject.toString() : null, i);
    }

    public static String m1098a(String str, byte[] bArr, int i) {
        String str2 = null;
        if (str != null) {
            HttpUriRequest httpPost = new HttpPost(str);
            if (bArr != null) {
                httpPost.setEntity(new InputStreamEntity(new ByteArrayInputStream(bArr), (long) bArr.length));
            }
            HttpClient defaultHttpClient = new DefaultHttpClient(C0329c.m1099a());
            HttpResponse httpResponse = str2;
            while (i > 0) {
                try {
                    httpResponse = defaultHttpClient.execute(httpPost);
                } catch (Exception e) {
                }
                if (httpResponse == null) {
                    break;
                } else if (httpResponse.getStatusLine().getStatusCode() == Downloads.STATUS_SUCCESS) {
                    try {
                        str2 = EntityUtils.toString(httpResponse.getEntity(), AsyncHttpResponseHandler.DEFAULT_CHARSET);
                        break;
                    } catch (Exception e2) {
                    }
                } else {
                    i--;
                }
            }
        }
        return str2;
    }

    private static HttpParams m1099a() {
        HttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 120000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 120000);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, 10240);
        return basicHttpParams;
    }

    private static InputStream m1100b(String str, HashMap hashMap) {
        HttpClient defaultHttpClient = new DefaultHttpClient(C0329c.m1099a());
        HttpUriRequest httpPost = new HttpPost(str);
        try {
            httpPost.setEntity(new UrlEncodedFormEntity(C0328b.m1092b(hashMap)));
            HttpResponse execute = defaultHttpClient.execute(httpPost);
            if (execute.getStatusLine().getStatusCode() == Downloads.STATUS_SUCCESS) {
                return execute.getEntity().getContent();
            }
        } catch (Exception e) {
        }
        return null;
    }
}
