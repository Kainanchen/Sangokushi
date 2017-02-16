package org.apache.mina.proxy.handlers.http;

import java.util.List;
import java.util.Map;
import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.proxy.handlers.ProxyRequest;
import org.apache.mina.proxy.session.ProxyIoSession;
import org.apache.mina.proxy.utils.StringUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractAuthLogicHandler {
    private static final Logger logger;
    public ProxyIoSession proxyIoSession;
    public ProxyRequest request;
    public int step;

    public abstract void doHandshake(NextFilter nextFilter);

    public abstract void handleResponse(HttpProxyResponse httpProxyResponse);

    static {
        logger = LoggerFactory.getLogger(AbstractAuthLogicHandler.class);
    }

    public AbstractAuthLogicHandler(ProxyIoSession proxyIoSession) {
        this.step = 0;
        this.proxyIoSession = proxyIoSession;
        this.request = proxyIoSession.getRequest();
        if (this.request == null || !(this.request instanceof HttpProxyRequest)) {
            throw new IllegalArgumentException("request parameter should be a non null HttpProxyRequest instance");
        }
    }

    public void writeRequest(NextFilter nextFilter, HttpProxyRequest httpProxyRequest) {
        logger.debug("  sending HTTP request");
        ((AbstractHttpLogicHandler) this.proxyIoSession.getHandler()).writeRequest(nextFilter, httpProxyRequest);
    }

    public static void addKeepAliveHeaders(Map<String, List<String>> map) {
        StringUtilities.addValueToHeader(map, "Keep-Alive", HttpProxyConstants.DEFAULT_KEEP_ALIVE_TIME, true);
        StringUtilities.addValueToHeader(map, "Proxy-Connection", "keep-Alive", true);
    }
}
