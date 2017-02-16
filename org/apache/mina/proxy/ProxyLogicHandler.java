package org.apache.mina.proxy;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.core.write.WriteRequest;
import org.apache.mina.proxy.session.ProxyIoSession;

public interface ProxyLogicHandler {
    void doHandshake(NextFilter nextFilter);

    void enqueueWriteRequest(NextFilter nextFilter, WriteRequest writeRequest);

    ProxyIoSession getProxyIoSession();

    boolean isHandshakeComplete();

    void messageReceived(NextFilter nextFilter, IoBuffer ioBuffer);
}
