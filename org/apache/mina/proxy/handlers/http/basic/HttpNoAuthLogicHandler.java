package org.apache.mina.proxy.handlers.http.basic;

import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.proxy.ProxyAuthException;
import org.apache.mina.proxy.handlers.http.AbstractAuthLogicHandler;
import org.apache.mina.proxy.handlers.http.HttpProxyRequest;
import org.apache.mina.proxy.handlers.http.HttpProxyResponse;
import org.apache.mina.proxy.session.ProxyIoSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpNoAuthLogicHandler extends AbstractAuthLogicHandler {
    private static final Logger logger;

    static {
        logger = LoggerFactory.getLogger(HttpNoAuthLogicHandler.class);
    }

    public HttpNoAuthLogicHandler(ProxyIoSession proxyIoSession) {
        super(proxyIoSession);
    }

    public void doHandshake(NextFilter nextFilter) {
        logger.debug(" doHandshake()");
        writeRequest(nextFilter, (HttpProxyRequest) this.request);
        this.step++;
    }

    public void handleResponse(HttpProxyResponse httpProxyResponse) {
        throw new ProxyAuthException("Received error response code (" + httpProxyResponse.getStatusLine() + ").");
    }
}
