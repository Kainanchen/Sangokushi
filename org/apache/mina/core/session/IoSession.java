package org.apache.mina.core.session;

import java.net.SocketAddress;
import org.apache.mina.core.filterchain.IoFilterChain;
import org.apache.mina.core.future.CloseFuture;
import org.apache.mina.core.future.WriteFuture;
import org.apache.mina.core.service.IoHandler;
import org.apache.mina.core.service.IoService;
import org.apache.mina.core.service.TransportMetadata;
import org.apache.mina.core.write.WriteRequest;
import org.apache.mina.core.write.WriteRequestQueue;

public interface IoSession {
    CloseFuture close(boolean z);

    CloseFuture closeNow();

    boolean containsAttribute(Object obj);

    Object getAttribute(Object obj);

    CloseFuture getCloseFuture();

    IoSessionConfig getConfig();

    WriteRequest getCurrentWriteRequest();

    IoFilterChain getFilterChain();

    IoHandler getHandler();

    long getId();

    long getLastIdleTime(IdleStatus idleStatus);

    long getLastIoTime();

    long getLastReadTime();

    long getLastWriteTime();

    SocketAddress getLocalAddress();

    SocketAddress getRemoteAddress();

    IoService getService();

    TransportMetadata getTransportMetadata();

    WriteRequestQueue getWriteRequestQueue();

    boolean isActive();

    boolean isClosing();

    boolean isConnected();

    boolean isWriteSuspended();

    Object removeAttribute(Object obj);

    Object setAttribute(Object obj);

    Object setAttribute(Object obj, Object obj2);

    Object setAttributeIfAbsent(Object obj, Object obj2);

    void setCurrentWriteRequest(WriteRequest writeRequest);

    WriteFuture write(Object obj);
}
