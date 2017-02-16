package org.apache.mina.filter.executor;

import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.core.filterchain.IoFilterAdapter;
import org.apache.mina.core.future.IoFutureListener;
import org.apache.mina.core.future.WriteFuture;
import org.apache.mina.core.session.IoEvent;
import org.apache.mina.core.session.IoEventType;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.write.WriteRequest;

public class WriteRequestFilter extends IoFilterAdapter {
    private final IoEventQueueHandler queueHandler;

    /* renamed from: org.apache.mina.filter.executor.WriteRequestFilter.1 */
    class C04381 implements IoFutureListener<WriteFuture> {
        final /* synthetic */ IoEvent val$e;

        C04381(IoEvent ioEvent) {
            this.val$e = ioEvent;
        }

        public void operationComplete(WriteFuture writeFuture) {
            WriteRequestFilter.this.queueHandler.polled(WriteRequestFilter.this, this.val$e);
        }
    }

    public WriteRequestFilter() {
        this(new IoEventQueueThrottle());
    }

    public WriteRequestFilter(IoEventQueueHandler ioEventQueueHandler) {
        if (ioEventQueueHandler == null) {
            throw new IllegalArgumentException("queueHandler");
        }
        this.queueHandler = ioEventQueueHandler;
    }

    public IoEventQueueHandler getQueueHandler() {
        return this.queueHandler;
    }

    public void filterWrite(NextFilter nextFilter, IoSession ioSession, WriteRequest writeRequest) {
        IoEvent ioEvent = new IoEvent(IoEventType.WRITE, ioSession, writeRequest);
        if (this.queueHandler.accept(this, ioEvent)) {
            nextFilter.filterWrite(ioSession, writeRequest);
            WriteFuture future = writeRequest.getFuture();
            if (future != null) {
                this.queueHandler.offered(this, ioEvent);
                future.addListener(new C04381(ioEvent));
            }
        }
    }
}
