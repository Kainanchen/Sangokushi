package org.apache.mina.proxy.handlers.http.basic;

import java.util.HashMap;
import java.util.Map;
import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.proxy.ProxyAuthException;
import org.apache.mina.proxy.handlers.http.AbstractAuthLogicHandler;
import org.apache.mina.proxy.handlers.http.HttpProxyConstants;
import org.apache.mina.proxy.handlers.http.HttpProxyRequest;
import org.apache.mina.proxy.handlers.http.HttpProxyResponse;
import org.apache.mina.proxy.session.ProxyIoSession;
import org.apache.mina.proxy.utils.StringUtilities;
import org.apache.mina.util.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpBasicAuthLogicHandler extends AbstractAuthLogicHandler {
    private static final Logger logger;

    static {
        logger = LoggerFactory.getLogger(HttpBasicAuthLogicHandler.class);
    }

    public HttpBasicAuthLogicHandler(ProxyIoSession proxyIoSession) {
        super(proxyIoSession);
        ((HttpProxyRequest) this.request).checkRequiredProperties(HttpProxyConstants.USER_PROPERTY, HttpProxyConstants.PWD_PROPERTY);
    }

    public void doHandshake(NextFilter nextFilter) {
        logger.debug(" doHandshake()");
        if (this.step > 0) {
            throw new ProxyAuthException("Authentication request already sent");
        }
        Map headers;
        HttpProxyRequest httpProxyRequest = (HttpProxyRequest) this.request;
        if (httpProxyRequest.getHeaders() != null) {
            headers = httpProxyRequest.getHeaders();
        } else {
            Object hashMap = new HashMap();
        }
        StringUtilities.addValueToHeader(headers, "Proxy-Authorization", "Basic " + createAuthorization((String) httpProxyRequest.getProperties().get(HttpProxyConstants.USER_PROPERTY), (String) httpProxyRequest.getProperties().get(HttpProxyConstants.PWD_PROPERTY)), true);
        AbstractAuthLogicHandler.addKeepAliveHeaders(headers);
        httpProxyRequest.setHeaders(headers);
        writeRequest(nextFilter, httpProxyRequest);
        this.step++;
    }

    public static String createAuthorization(String str, String str2) {
        return new String(Base64.encodeBase64((str + ":" + str2).getBytes()));
    }

    public void handleResponse(HttpProxyResponse httpProxyResponse) {
        if (httpProxyResponse.getStatusCode() != 407) {
            throw new ProxyAuthException("Received error response code (" + httpProxyResponse.getStatusLine() + ").");
        }
    }
}
