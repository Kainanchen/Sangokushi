package org.apache.mina.proxy;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.proxy.handlers.socks.SocksProxyRequest;
import org.apache.mina.proxy.session.ProxyIoSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractProxyIoHandler extends IoHandlerAdapter {
    private static final Logger logger;

    public abstract void proxySessionOpened(IoSession ioSession);

    static {
        logger = LoggerFactory.getLogger(AbstractProxyIoHandler.class);
    }

    public final void sessionOpened(IoSession ioSession) {
        ProxyIoSession proxyIoSession = (ProxyIoSession) ioSession.getAttribute(ProxyIoSession.PROXY_SESSION);
        if ((proxyIoSession.getRequest() instanceof SocksProxyRequest) || proxyIoSession.isAuthenticationFailed() || proxyIoSession.getHandler().isHandshakeComplete()) {
            proxySessionOpened(ioSession);
        } else {
            logger.debug("Filtered session opened event !");
        }
    }
}
