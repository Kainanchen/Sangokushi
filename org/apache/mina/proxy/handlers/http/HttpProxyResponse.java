package org.apache.mina.proxy.handlers.http;

import java.util.List;
import java.util.Map;

public class HttpProxyResponse {
    private String body;
    private final Map<String, List<String>> headers;
    private final String httpVersion;
    private final int statusCode;
    private final String statusLine;

    protected HttpProxyResponse(String str, String str2, Map<String, List<String>> map) {
        int parseInt;
        this.httpVersion = str;
        this.statusLine = str2;
        if (str2.charAt(0) == ' ') {
            parseInt = Integer.parseInt(str2.substring(1, 4));
        } else {
            parseInt = Integer.parseInt(str2.substring(0, 3));
        }
        this.statusCode = parseInt;
        this.headers = map;
    }

    public final String getHttpVersion() {
        return this.httpVersion;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusLine() {
        return this.statusLine;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }
}
