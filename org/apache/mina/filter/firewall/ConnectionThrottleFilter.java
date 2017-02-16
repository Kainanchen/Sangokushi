package org.apache.mina.filter.firewall;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.core.filterchain.IoFilterAdapter;
import org.apache.mina.core.session.IoSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConnectionThrottleFilter extends IoFilterAdapter {
    private static final long DEFAULT_TIME = 1000;
    private static final Logger LOGGER;
    private long allowedInterval;
    private final Map<String, Long> clients;
    private Lock lock;

    private class ExpiredSessionThread extends Thread {
        private ExpiredSessionThread() {
        }

        public void run() {
            try {
                Thread.sleep(ConnectionThrottleFilter.this.allowedInterval);
                long currentTimeMillis = System.currentTimeMillis();
                ConnectionThrottleFilter.this.lock.lock();
                try {
                    for (String str : ConnectionThrottleFilter.this.clients.keySet()) {
                        if (((Long) ConnectionThrottleFilter.this.clients.get(str)).longValue() + ConnectionThrottleFilter.this.allowedInterval < currentTimeMillis) {
                            ConnectionThrottleFilter.this.clients.remove(str);
                        }
                    }
                } finally {
                    ConnectionThrottleFilter.this.lock.unlock();
                }
            } catch (InterruptedException e) {
            }
        }
    }

    static {
        LOGGER = LoggerFactory.getLogger(ConnectionThrottleFilter.class);
    }

    public ConnectionThrottleFilter() {
        this(DEFAULT_TIME);
    }

    public ConnectionThrottleFilter(long j) {
        this.lock = new ReentrantLock();
        this.allowedInterval = j;
        this.clients = new ConcurrentHashMap();
        ExpiredSessionThread expiredSessionThread = new ExpiredSessionThread();
        expiredSessionThread.setDaemon(true);
        expiredSessionThread.start();
    }

    public void setAllowedInterval(long j) {
        this.lock.lock();
        try {
            this.allowedInterval = j;
        } finally {
            this.lock.unlock();
        }
    }

    protected boolean isConnectionOk(IoSession ioSession) {
        Long l = null;
        SocketAddress remoteAddress = ioSession.getRemoteAddress();
        if (!(remoteAddress instanceof InetSocketAddress)) {
            return false;
        }
        InetSocketAddress inetSocketAddress = (InetSocketAddress) remoteAddress;
        long currentTimeMillis = System.currentTimeMillis();
        this.lock.lock();
        try {
            if (this.clients.containsKey(inetSocketAddress.getAddress().getHostAddress())) {
                LOGGER.debug("This is not a new client");
                Long l2 = (Long) this.clients.get(inetSocketAddress.getAddress().getHostAddress());
                this.clients.put(inetSocketAddress.getAddress().getHostAddress(), Long.valueOf(currentTimeMillis));
                if (currentTimeMillis - l2.longValue() < this.allowedInterval) {
                    LOGGER.warn("Session connection interval too short");
                    return l;
                }
                this.lock.unlock();
                return true;
            }
            Map map = this.clients;
            String hostAddress = inetSocketAddress.getAddress().getHostAddress();
            l = Long.valueOf(currentTimeMillis);
            map.put(hostAddress, l);
            this.lock.unlock();
            return true;
        } finally {
            this.lock.unlock();
        }
    }

    public void sessionCreated(NextFilter nextFilter, IoSession ioSession) {
        if (!isConnectionOk(ioSession)) {
            LOGGER.warn("Connections coming in too fast; closing.");
            ioSession.closeNow();
        }
        nextFilter.sessionCreated(ioSession);
    }
}
