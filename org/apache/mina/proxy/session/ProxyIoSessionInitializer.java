package org.apache.mina.proxy.session;

import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.session.IoSessionInitializer;

public class ProxyIoSessionInitializer<T extends ConnectFuture> implements IoSessionInitializer<T> {
    private final ProxyIoSession proxyIoSession;
    private final IoSessionInitializer<T> wrappedSessionInitializer;

    public ProxyIoSessionInitializer(IoSessionInitializer<T> ioSessionInitializer, ProxyIoSession proxyIoSession) {
        this.wrappedSessionInitializer = ioSessionInitializer;
        this.proxyIoSession = proxyIoSession;
    }

    public ProxyIoSession getProxySession() {
        return this.proxyIoSession;
    }

    public void initializeSession(IoSession ioSession, T t) {
        if (this.wrappedSessionInitializer != null) {
            this.wrappedSessionInitializer.initializeSession(ioSession, t);
        }
        if (this.proxyIoSession != null) {
            this.proxyIoSession.setSession(ioSession);
            ioSession.setAttribute(ProxyIoSession.PROXY_SESSION, this.proxyIoSession);
        }
    }
}
