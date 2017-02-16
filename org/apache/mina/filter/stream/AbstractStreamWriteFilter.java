package org.apache.mina.filter.stream;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.core.filterchain.IoFilterAdapter;
import org.apache.mina.core.filterchain.IoFilterChain;
import org.apache.mina.core.session.AttributeKey;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.write.DefaultWriteRequest;
import org.apache.mina.core.write.WriteRequest;

public abstract class AbstractStreamWriteFilter<T> extends IoFilterAdapter {
    public static final int DEFAULT_STREAM_BUFFER_SIZE = 4096;
    protected final AttributeKey CURRENT_STREAM;
    protected final AttributeKey CURRENT_WRITE_REQUEST;
    protected final AttributeKey WRITE_REQUEST_QUEUE;
    private int writeBufferSize;

    protected abstract Class<T> getMessageClass();

    protected abstract IoBuffer getNextBuffer(T t);

    public AbstractStreamWriteFilter() {
        this.CURRENT_STREAM = new AttributeKey(getClass(), "stream");
        this.WRITE_REQUEST_QUEUE = new AttributeKey(getClass(), "queue");
        this.CURRENT_WRITE_REQUEST = new AttributeKey(getClass(), "writeRequest");
        this.writeBufferSize = DEFAULT_STREAM_BUFFER_SIZE;
    }

    public void onPreAdd(IoFilterChain ioFilterChain, String str, NextFilter nextFilter) {
        Class cls = getClass();
        if (ioFilterChain.contains(cls)) {
            throw new IllegalStateException("Only one " + cls.getName() + " is permitted.");
        }
    }

    public void filterWrite(NextFilter nextFilter, IoSession ioSession, WriteRequest writeRequest) {
        if (ioSession.getAttribute(this.CURRENT_STREAM) != null) {
            Queue writeRequestQueue = getWriteRequestQueue(ioSession);
            if (writeRequestQueue == null) {
                writeRequestQueue = new ConcurrentLinkedQueue();
                ioSession.setAttribute(this.WRITE_REQUEST_QUEUE, writeRequestQueue);
            }
            writeRequestQueue.add(writeRequest);
            return;
        }
        Object message = writeRequest.getMessage();
        if (getMessageClass().isInstance(message)) {
            IoBuffer nextBuffer = getNextBuffer(getMessageClass().cast(message));
            if (nextBuffer == null) {
                writeRequest.getFuture().setWritten();
                nextFilter.messageSent(ioSession, writeRequest);
                return;
            }
            ioSession.setAttribute(this.CURRENT_STREAM, message);
            ioSession.setAttribute(this.CURRENT_WRITE_REQUEST, writeRequest);
            nextFilter.filterWrite(ioSession, new DefaultWriteRequest(nextBuffer));
            return;
        }
        nextFilter.filterWrite(ioSession, writeRequest);
    }

    private Queue<WriteRequest> getWriteRequestQueue(IoSession ioSession) {
        return (Queue) ioSession.getAttribute(this.WRITE_REQUEST_QUEUE);
    }

    private Queue<WriteRequest> removeWriteRequestQueue(IoSession ioSession) {
        return (Queue) ioSession.removeAttribute(this.WRITE_REQUEST_QUEUE);
    }

    public void messageSent(NextFilter nextFilter, IoSession ioSession, WriteRequest writeRequest) {
        Object cast = getMessageClass().cast(ioSession.getAttribute(this.CURRENT_STREAM));
        if (cast == null) {
            nextFilter.messageSent(ioSession, writeRequest);
            return;
        }
        IoBuffer nextBuffer = getNextBuffer(cast);
        if (nextBuffer == null) {
            ioSession.removeAttribute(this.CURRENT_STREAM);
            WriteRequest writeRequest2 = (WriteRequest) ioSession.removeAttribute(this.CURRENT_WRITE_REQUEST);
            Queue removeWriteRequestQueue = removeWriteRequestQueue(ioSession);
            if (removeWriteRequestQueue != null) {
                for (WriteRequest writeRequest3 = (WriteRequest) removeWriteRequestQueue.poll(); writeRequest3 != null; writeRequest3 = (WriteRequest) removeWriteRequestQueue.poll()) {
                    filterWrite(nextFilter, ioSession, writeRequest3);
                }
            }
            writeRequest2.getFuture().setWritten();
            nextFilter.messageSent(ioSession, writeRequest2);
            return;
        }
        nextFilter.filterWrite(ioSession, new DefaultWriteRequest(nextBuffer));
    }

    public int getWriteBufferSize() {
        return this.writeBufferSize;
    }

    public void setWriteBufferSize(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("writeBufferSize must be at least 1");
        }
        this.writeBufferSize = i;
    }
}