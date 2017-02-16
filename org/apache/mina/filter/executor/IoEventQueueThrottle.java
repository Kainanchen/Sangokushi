package org.apache.mina.filter.executor;

import java.util.concurrent.atomic.AtomicInteger;
import org.apache.mina.core.session.IoEvent;
import org.apache.mina.proxy.handlers.http.ntlm.NTLMConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IoEventQueueThrottle implements IoEventQueueHandler {
    private static final Logger LOGGER;
    private final AtomicInteger counter;
    private final IoEventSizeEstimator eventSizeEstimator;
    private final Object lock;
    private volatile int threshold;
    private int waiters;

    static {
        LOGGER = LoggerFactory.getLogger(IoEventQueueThrottle.class);
    }

    public IoEventQueueThrottle() {
        this(new DefaultIoEventSizeEstimator(), NTLMConstants.FLAG_TARGET_TYPE_DOMAIN);
    }

    public IoEventQueueThrottle(int i) {
        this(new DefaultIoEventSizeEstimator(), i);
    }

    public IoEventQueueThrottle(IoEventSizeEstimator ioEventSizeEstimator, int i) {
        this.lock = new Object();
        this.counter = new AtomicInteger();
        if (ioEventSizeEstimator == null) {
            throw new IllegalArgumentException("eventSizeEstimator");
        }
        this.eventSizeEstimator = ioEventSizeEstimator;
        setThreshold(i);
    }

    public IoEventSizeEstimator getEventSizeEstimator() {
        return this.eventSizeEstimator;
    }

    public int getThreshold() {
        return this.threshold;
    }

    public int getCounter() {
        return this.counter.get();
    }

    public void setThreshold(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("threshold: " + i);
        }
        this.threshold = i;
    }

    public boolean accept(Object obj, IoEvent ioEvent) {
        return true;
    }

    public void offered(Object obj, IoEvent ioEvent) {
        int addAndGet = this.counter.addAndGet(estimateSize(ioEvent));
        logState();
        if (addAndGet >= this.threshold) {
            block();
        }
    }

    public void polled(Object obj, IoEvent ioEvent) {
        int addAndGet = this.counter.addAndGet(-estimateSize(ioEvent));
        logState();
        if (addAndGet < this.threshold) {
            unblock();
        }
    }

    private int estimateSize(IoEvent ioEvent) {
        int estimateSize = getEventSizeEstimator().estimateSize(ioEvent);
        if (estimateSize >= 0) {
            return estimateSize;
        }
        throw new IllegalStateException(IoEventSizeEstimator.class.getSimpleName() + " returned a negative value (" + estimateSize + "): " + ioEvent);
    }

    private void logState() {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug(Thread.currentThread().getName() + " state: " + this.counter.get() + " / " + getThreshold());
        }
    }

    protected void block() {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug(Thread.currentThread().getName() + " blocked: " + this.counter.get() + " >= " + this.threshold);
        }
        synchronized (this.lock) {
            loop0:
            while (true) {
                if (this.counter.get() < this.threshold) {
                    break loop0;
                }
                this.waiters++;
                try {
                    this.lock.wait();
                } catch (InterruptedException e) {
                } finally {
                    this.waiters--;
                    break;
                }
            }
        }
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug(Thread.currentThread().getName() + " unblocked: " + this.counter.get() + " < " + this.threshold);
        }
    }

    protected void unblock() {
        synchronized (this.lock) {
            if (this.waiters > 0) {
                this.lock.notifyAll();
            }
        }
    }
}
