package org.apache.mina.proxy.event;

import java.util.LinkedList;
import java.util.Queue;
import org.apache.mina.proxy.handlers.socks.SocksProxyRequest;
import org.apache.mina.proxy.session.ProxyIoSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IoSessionEventQueue {
    private static final Logger logger;
    private ProxyIoSession proxyIoSession;
    private Queue<IoSessionEvent> sessionEventsQueue;

    static {
        logger = LoggerFactory.getLogger(IoSessionEventQueue.class);
    }

    public IoSessionEventQueue(ProxyIoSession proxyIoSession) {
        this.sessionEventsQueue = new LinkedList();
        this.proxyIoSession = proxyIoSession;
    }

    private void discardSessionQueueEvents() {
        synchronized (this.sessionEventsQueue) {
            this.sessionEventsQueue.clear();
            logger.debug("Event queue CLEARED");
        }
    }

    public void enqueueEventIfNecessary(IoSessionEvent ioSessionEvent) {
        logger.debug("??? >> Enqueue {}", (Object) ioSessionEvent);
        if (this.proxyIoSession.getRequest() instanceof SocksProxyRequest) {
            ioSessionEvent.deliverEvent();
        } else if (this.proxyIoSession.getHandler().isHandshakeComplete()) {
            ioSessionEvent.deliverEvent();
        } else if (ioSessionEvent.getType() == IoSessionEventType.CLOSED) {
            if (this.proxyIoSession.isAuthenticationFailed()) {
                this.proxyIoSession.getConnector().cancelConnectFuture();
                discardSessionQueueEvents();
                ioSessionEvent.deliverEvent();
                return;
            }
            discardSessionQueueEvents();
        } else if (ioSessionEvent.getType() == IoSessionEventType.OPENED) {
            enqueueSessionEvent(ioSessionEvent);
            ioSessionEvent.deliverEvent();
        } else {
            enqueueSessionEvent(ioSessionEvent);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void flushPendingSessionEvents() {
        /*
        r4 = this;
        r1 = r4.sessionEventsQueue;
        monitor-enter(r1);
    L_0x0003:
        r0 = r4.sessionEventsQueue;	 Catch:{ all -> 0x0018 }
        r0 = r0.poll();	 Catch:{ all -> 0x0018 }
        r0 = (org.apache.mina.proxy.event.IoSessionEvent) r0;	 Catch:{ all -> 0x0018 }
        if (r0 == 0) goto L_0x001b;
    L_0x000d:
        r2 = logger;	 Catch:{ all -> 0x0018 }
        r3 = " Flushing buffered event: {}";
        r2.debug(r3, r0);	 Catch:{ all -> 0x0018 }
        r0.deliverEvent();	 Catch:{ all -> 0x0018 }
        goto L_0x0003;
    L_0x0018:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
        throw r0;
    L_0x001b:
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.mina.proxy.event.IoSessionEventQueue.flushPendingSessionEvents():void");
    }

    private void enqueueSessionEvent(IoSessionEvent ioSessionEvent) {
        synchronized (this.sessionEventsQueue) {
            logger.debug("Enqueuing event: {}", (Object) ioSessionEvent);
            this.sessionEventsQueue.offer(ioSessionEvent);
        }
    }
}
