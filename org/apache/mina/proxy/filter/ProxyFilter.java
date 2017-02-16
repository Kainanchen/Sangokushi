package org.apache.mina.proxy.filter;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.core.filterchain.IoFilterAdapter;
import org.apache.mina.core.filterchain.IoFilterChain;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.write.WriteRequest;
import org.apache.mina.proxy.ProxyLogicHandler;
import org.apache.mina.proxy.event.IoSessionEvent;
import org.apache.mina.proxy.event.IoSessionEventType;
import org.apache.mina.proxy.handlers.ProxyRequest;
import org.apache.mina.proxy.handlers.http.HttpSmartProxyHandler;
import org.apache.mina.proxy.handlers.socks.Socks4LogicHandler;
import org.apache.mina.proxy.handlers.socks.Socks5LogicHandler;
import org.apache.mina.proxy.handlers.socks.SocksProxyRequest;
import org.apache.mina.proxy.session.ProxyIoSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProxyFilter extends IoFilterAdapter {
    private static final Logger LOGGER;

    static {
        LOGGER = LoggerFactory.getLogger(ProxyFilter.class);
    }

    public void onPreAdd(IoFilterChain ioFilterChain, String str, NextFilter nextFilter) {
        if (ioFilterChain.contains(ProxyFilter.class)) {
            throw new IllegalStateException("A filter chain cannot contain more than one ProxyFilter.");
        }
    }

    public void onPreRemove(IoFilterChain ioFilterChain, String str, NextFilter nextFilter) {
        ioFilterChain.getSession().removeAttribute(ProxyIoSession.PROXY_SESSION);
    }

    public void exceptionCaught(NextFilter nextFilter, IoSession ioSession, Throwable th) {
        ((ProxyIoSession) ioSession.getAttribute(ProxyIoSession.PROXY_SESSION)).setAuthenticationFailed(true);
        super.exceptionCaught(nextFilter, ioSession, th);
    }

    private ProxyLogicHandler getProxyHandler(IoSession ioSession) {
        ProxyLogicHandler handler = ((ProxyIoSession) ioSession.getAttribute(ProxyIoSession.PROXY_SESSION)).getHandler();
        if (handler == null) {
            throw new IllegalStateException();
        } else if (handler.getProxyIoSession().getProxyFilter() == this) {
            return handler;
        } else {
            throw new IllegalArgumentException("Not managed by this filter.");
        }
    }

    public void messageReceived(NextFilter nextFilter, IoSession ioSession, Object obj) {
        Object proxyHandler = getProxyHandler(ioSession);
        synchronized (proxyHandler) {
            obj = (IoBuffer) obj;
            if (proxyHandler.isHandshakeComplete()) {
                nextFilter.messageReceived(ioSession, obj);
            } else {
                LOGGER.debug(" Data Read: {} ({})", proxyHandler, obj);
                while (obj.hasRemaining() && !proxyHandler.isHandshakeComplete()) {
                    LOGGER.debug(" Pre-handshake - passing to handler");
                    int position = obj.position();
                    proxyHandler.messageReceived(nextFilter, obj);
                    if (obj.position() != position) {
                        if (ioSession.isClosing()) {
                        }
                    }
                    return;
                }
                if (obj.hasRemaining()) {
                    LOGGER.debug(" Passing remaining data to next filter");
                    nextFilter.messageReceived(ioSession, obj);
                }
            }
        }
    }

    public void filterWrite(NextFilter nextFilter, IoSession ioSession, WriteRequest writeRequest) {
        writeData(nextFilter, ioSession, writeRequest, false);
    }

    public void writeData(NextFilter nextFilter, IoSession ioSession, WriteRequest writeRequest, boolean z) {
        ProxyLogicHandler proxyHandler = getProxyHandler(ioSession);
        synchronized (proxyHandler) {
            if (proxyHandler.isHandshakeComplete()) {
                nextFilter.filterWrite(ioSession, writeRequest);
            } else if (z) {
                LOGGER.debug("   handshake data: {}", writeRequest.getMessage());
                nextFilter.filterWrite(ioSession, writeRequest);
            } else if (ioSession.isConnected()) {
                LOGGER.debug(" Handshaking is not complete yet. Buffering write request.");
                proxyHandler.enqueueWriteRequest(nextFilter, writeRequest);
            } else {
                LOGGER.debug(" Write request on closed session. Request ignored.");
            }
        }
    }

    public void messageSent(NextFilter nextFilter, IoSession ioSession, WriteRequest writeRequest) {
        if (writeRequest.getMessage() == null || !(writeRequest.getMessage() instanceof ProxyHandshakeIoBuffer)) {
            nextFilter.messageSent(ioSession, writeRequest);
        }
    }

    public void sessionCreated(NextFilter nextFilter, IoSession ioSession) {
        LOGGER.debug("Session created: " + ioSession);
        ProxyIoSession proxyIoSession = (ProxyIoSession) ioSession.getAttribute(ProxyIoSession.PROXY_SESSION);
        LOGGER.debug("  get proxyIoSession: " + proxyIoSession);
        proxyIoSession.setProxyFilter(this);
        if (proxyIoSession.getHandler() == null) {
            ProxyLogicHandler httpSmartProxyHandler;
            ProxyRequest request = proxyIoSession.getRequest();
            if (!(request instanceof SocksProxyRequest)) {
                httpSmartProxyHandler = new HttpSmartProxyHandler(proxyIoSession);
            } else if (((SocksProxyRequest) request).getProtocolVersion() == 4) {
                httpSmartProxyHandler = new Socks4LogicHandler(proxyIoSession);
            } else {
                httpSmartProxyHandler = new Socks5LogicHandler(proxyIoSession);
            }
            proxyIoSession.setHandler(httpSmartProxyHandler);
            httpSmartProxyHandler.doHandshake(nextFilter);
        }
        proxyIoSession.getEventQueue().enqueueEventIfNecessary(new IoSessionEvent(nextFilter, ioSession, IoSessionEventType.CREATED));
    }

    public void sessionOpened(NextFilter nextFilter, IoSession ioSession) {
        ((ProxyIoSession) ioSession.getAttribute(ProxyIoSession.PROXY_SESSION)).getEventQueue().enqueueEventIfNecessary(new IoSessionEvent(nextFilter, ioSession, IoSessionEventType.OPENED));
    }

    public void sessionIdle(NextFilter nextFilter, IoSession ioSession, IdleStatus idleStatus) {
        ((ProxyIoSession) ioSession.getAttribute(ProxyIoSession.PROXY_SESSION)).getEventQueue().enqueueEventIfNecessary(new IoSessionEvent(nextFilter, ioSession, idleStatus));
    }

    public void sessionClosed(NextFilter nextFilter, IoSession ioSession) {
        ((ProxyIoSession) ioSession.getAttribute(ProxyIoSession.PROXY_SESSION)).getEventQueue().enqueueEventIfNecessary(new IoSessionEvent(nextFilter, ioSession, IoSessionEventType.CLOSED));
    }
}
