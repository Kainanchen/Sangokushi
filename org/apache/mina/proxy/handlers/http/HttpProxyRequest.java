package org.apache.mina.proxy.handlers.http;

import java.net.InetSocketAddress;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.mina.proxy.ProxyAuthException;
import org.apache.mina.proxy.handlers.ProxyRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpProxyRequest extends ProxyRequest {
    private static final Logger logger;
    private Map<String, List<String>> headers;
    private String host;
    private final String httpURI;
    private final String httpVerb;
    private String httpVersion;
    private transient Map<String, String> properties;

    static {
        logger = LoggerFactory.getLogger(HttpProxyRequest.class);
    }

    public HttpProxyRequest(InetSocketAddress inetSocketAddress) {
        this(inetSocketAddress, HttpProxyConstants.HTTP_1_0, null);
    }

    public HttpProxyRequest(InetSocketAddress inetSocketAddress, String str) {
        this(inetSocketAddress, str, null);
    }

    public HttpProxyRequest(InetSocketAddress inetSocketAddress, String str, Map<String, List<String>> map) {
        this.httpVerb = HttpProxyConstants.CONNECT;
        if (inetSocketAddress.isUnresolved()) {
            this.httpURI = inetSocketAddress.getAddress().getHostAddress() + ":" + inetSocketAddress.getPort();
        } else {
            this.httpURI = inetSocketAddress.getHostName() + ":" + inetSocketAddress.getPort();
        }
        this.httpVersion = str;
        this.headers = map;
    }

    public HttpProxyRequest(String str) {
        this(HttpProxyConstants.GET, str, HttpProxyConstants.HTTP_1_0, null);
    }

    public HttpProxyRequest(String str, String str2) {
        this(HttpProxyConstants.GET, str, str2, null);
    }

    public HttpProxyRequest(String str, String str2, String str3) {
        this(str, str2, str3, null);
    }

    public HttpProxyRequest(String str, String str2, String str3, Map<String, List<String>> map) {
        this.httpVerb = str;
        this.httpURI = str2;
        this.httpVersion = str3;
        this.headers = map;
    }

    public final String getHttpVerb() {
        return this.httpVerb;
    }

    public String getHttpVersion() {
        return this.httpVersion;
    }

    public void setHttpVersion(String str) {
        this.httpVersion = str;
    }

    public final synchronized String getHost() {
        if (this.host == null) {
            if (!(getEndpointAddress() == null || getEndpointAddress().isUnresolved())) {
                this.host = getEndpointAddress().getHostName();
            }
            if (this.host == null && this.httpURI != null) {
                try {
                    this.host = new URL(this.httpURI).getHost();
                } catch (Throwable e) {
                    logger.debug("Malformed URL", e);
                }
            }
        }
        return this.host;
    }

    public final String getHttpURI() {
        return this.httpURI;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final void setHeaders(Map<String, List<String>> map) {
        this.headers = map;
    }

    public Map<String, String> getProperties() {
        return this.properties;
    }

    public void setProperties(Map<String, String> map) {
        this.properties = map;
    }

    public void checkRequiredProperties(String... strArr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strArr) {
            if (this.properties.get(str) == null) {
                stringBuilder.append(str).append(' ');
            }
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.append("property(ies) missing in request");
            throw new ProxyAuthException(stringBuilder.toString());
        }
    }

    public String toHttpString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getHttpVerb()).append(' ').append(getHttpURI()).append(' ').append(getHttpVersion()).append(HttpProxyConstants.CRLF);
        if (getHeaders() != null) {
            boolean z = false;
            for (Entry entry : getHeaders().entrySet()) {
                boolean z2;
                if (z) {
                    z2 = z;
                } else {
                    z2 = ((String) entry.getKey()).equalsIgnoreCase("host");
                }
                for (String append : (List) entry.getValue()) {
                    stringBuilder.append((String) entry.getKey()).append(": ").append(append).append(HttpProxyConstants.CRLF);
                }
                z = z2;
            }
            if (!z && getHttpVersion() == HttpProxyConstants.HTTP_1_1) {
                stringBuilder.append("Host: ").append(getHost()).append(HttpProxyConstants.CRLF);
            }
        }
        stringBuilder.append(HttpProxyConstants.CRLF);
        return stringBuilder.toString();
    }
}
