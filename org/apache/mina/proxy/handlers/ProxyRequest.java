package org.apache.mina.proxy.handlers;

import java.net.InetSocketAddress;

public abstract class ProxyRequest {
    private InetSocketAddress endpointAddress;

    public ProxyRequest() {
        this.endpointAddress = null;
    }

    public ProxyRequest(InetSocketAddress inetSocketAddress) {
        this.endpointAddress = null;
        this.endpointAddress = inetSocketAddress;
    }

    public InetSocketAddress getEndpointAddress() {
        return this.endpointAddress;
    }
}
