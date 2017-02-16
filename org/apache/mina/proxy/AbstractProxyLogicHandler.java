package org.apache.mina.proxy;

import java.util.LinkedList;
import java.util.Queue;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.core.future.DefaultWriteFuture;
import org.apache.mina.core.future.WriteFuture;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.write.DefaultWriteRequest;
import org.apache.mina.core.write.WriteRequest;
import org.apache.mina.proxy.filter.ProxyFilter;
import org.apache.mina.proxy.filter.ProxyHandshakeIoBuffer;
import org.apache.mina.proxy.session.ProxyIoSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractProxyLogicHandler implements ProxyLogicHandler {
    private static final Logger LOGGER;
    private boolean handshakeComplete;
    private ProxyIoSession proxyIoSession;
    private Queue<Event> writeRequestQueue;

    private static final class Event {
        private final Object data;
        private final NextFilter nextFilter;

        Event(NextFilter nextFilter, Object obj) {
            this.nextFilter = nextFilter;
            this.data = obj;
        }
    }

    static {
        LOGGER = LoggerFactory.getLogger(AbstractProxyLogicHandler.class);
    }

    public AbstractProxyLogicHandler(ProxyIoSession proxyIoSession) {
        this.writeRequestQueue = null;
        this.handshakeComplete = false;
        this.proxyIoSession = proxyIoSession;
    }

    protected ProxyFilter getProxyFilter() {
        return this.proxyIoSession.getProxyFilter();
    }

    public IoSession getSession() {
        return this.proxyIoSession.getSession();
    }

    public ProxyIoSession getProxyIoSession() {
        return this.proxyIoSession;
    }

    public WriteFuture writeData(NextFilter nextFilter, IoBuffer ioBuffer) {
        Object proxyHandshakeIoBuffer = new ProxyHandshakeIoBuffer(ioBuffer);
        LOGGER.debug("   session write: {}", proxyHandshakeIoBuffer);
        WriteFuture defaultWriteFuture = new DefaultWriteFuture(getSession());
        getProxyFilter().writeData(nextFilter, getSession(), new DefaultWriteRequest(proxyHandshakeIoBuffer, defaultWriteFuture), true);
        return defaultWriteFuture;
    }

    public boolean isHandshakeComplete() {
        boolean z;
        synchronized (this) {
            z = this.handshakeComplete;
        }
        return z;
    }

    public final void setHandshakeComplete() {
        synchronized (this) {
            this.handshakeComplete = true;
        }
        ProxyIoSession proxyIoSession = getProxyIoSession();
        proxyIoSession.getConnector().fireConnected(proxyIoSession.getSession()).awaitUninterruptibly();
        LOGGER.debug("  handshake completed");
        try {
            proxyIoSession.getEventQueue().flushPendingSessionEvents();
            flushPendingWriteRequests();
        } catch (Throwable e) {
            LOGGER.error("Unable to flush pending write requests", e);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected synchronized void flushPendingWriteRequests() {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = LOGGER;	 Catch:{ all -> 0x0039 }
        r1 = " flushPendingWriteRequests()";
        r0.debug(r1);	 Catch:{ all -> 0x0039 }
        r0 = r4.writeRequestQueue;	 Catch:{ all -> 0x0039 }
        if (r0 != 0) goto L_0x000e;
    L_0x000c:
        monitor-exit(r4);
        return;
    L_0x000e:
        r0 = r4.writeRequestQueue;	 Catch:{ all -> 0x0039 }
        r0 = r0.poll();	 Catch:{ all -> 0x0039 }
        r0 = (org.apache.mina.proxy.AbstractProxyLogicHandler.Event) r0;	 Catch:{ all -> 0x0039 }
        if (r0 == 0) goto L_0x003c;
    L_0x0018:
        r1 = LOGGER;	 Catch:{ all -> 0x0039 }
        r2 = " Flushing buffered write request: {}";
        r3 = r0.data;	 Catch:{ all -> 0x0039 }
        r1.debug(r2, r3);	 Catch:{ all -> 0x0039 }
        r1 = r4.getProxyFilter();	 Catch:{ all -> 0x0039 }
        r2 = r0.nextFilter;	 Catch:{ all -> 0x0039 }
        r3 = r4.getSession();	 Catch:{ all -> 0x0039 }
        r0 = r0.data;	 Catch:{ all -> 0x0039 }
        r0 = (org.apache.mina.core.write.WriteRequest) r0;	 Catch:{ all -> 0x0039 }
        r1.filterWrite(r2, r3, r0);	 Catch:{ all -> 0x0039 }
        goto L_0x000e;
    L_0x0039:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
    L_0x003c:
        r0 = 0;
        r4.writeRequestQueue = r0;	 Catch:{ all -> 0x0039 }
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.mina.proxy.AbstractProxyLogicHandler.flushPendingWriteRequests():void");
    }

    public synchronized void enqueueWriteRequest(NextFilter nextFilter, WriteRequest writeRequest) {
        if (this.writeRequestQueue == null) {
            this.writeRequestQueue = new LinkedList();
        }
        this.writeRequestQueue.offer(new Event(nextFilter, writeRequest));
    }

    public void closeSession(String str, Throwable th) {
        if (th != null) {
            LOGGER.error(str, th);
            this.proxyIoSession.setAuthenticationFailed(true);
        } else {
            LOGGER.error(str);
        }
        getSession().closeNow();
    }

    public void closeSession(String str) {
        closeSession(str, null);
    }
}
