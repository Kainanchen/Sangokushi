package org.apache.mina.core.future;

import java.util.concurrent.atomic.AtomicInteger;

public class CompositeIoFuture<E extends IoFuture> extends DefaultIoFuture {
    private volatile boolean constructionFinished;
    private final NotifyingListener listener;
    private final AtomicInteger unnotified;

    private class NotifyingListener implements IoFutureListener<IoFuture> {
        private NotifyingListener() {
        }

        public void operationComplete(IoFuture ioFuture) {
            if (CompositeIoFuture.this.unnotified.decrementAndGet() == 0 && CompositeIoFuture.this.constructionFinished) {
                CompositeIoFuture.this.setValue(Boolean.valueOf(true));
            }
        }
    }

    public CompositeIoFuture(Iterable<E> iterable) {
        super(null);
        this.listener = new NotifyingListener();
        this.unnotified = new AtomicInteger();
        for (E addListener : iterable) {
            addListener.addListener(this.listener);
            this.unnotified.incrementAndGet();
        }
        this.constructionFinished = true;
        if (this.unnotified.get() == 0) {
            setValue(Boolean.valueOf(true));
        }
    }
}
