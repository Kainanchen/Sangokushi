package org.apache.mina.filter.codec;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.mina.core.buffer.IoBuffer;

public abstract class AbstractProtocolEncoderOutput implements ProtocolEncoderOutput {
    private boolean buffersOnly;
    private final Queue<Object> messageQueue;

    public AbstractProtocolEncoderOutput() {
        this.messageQueue = new ConcurrentLinkedQueue();
        this.buffersOnly = true;
    }

    public Queue<Object> getMessageQueue() {
        return this.messageQueue;
    }

    public void write(Object obj) {
        if (obj instanceof IoBuffer) {
            IoBuffer ioBuffer = (IoBuffer) obj;
            if (ioBuffer.hasRemaining()) {
                this.messageQueue.offer(ioBuffer);
                return;
            }
            throw new IllegalArgumentException("buf is empty. Forgot to call flip()?");
        }
        this.messageQueue.offer(obj);
        this.buffersOnly = false;
    }

    public void mergeAll() {
        if (!this.buffersOnly) {
            throw new IllegalStateException("the encoded message list contains a non-buffer.");
        } else if (this.messageQueue.size() >= 2) {
            IoBuffer ioBuffer;
            int i = 0;
            for (IoBuffer ioBuffer2 : this.messageQueue) {
                i = ioBuffer2.remaining() + i;
            }
            IoBuffer allocate = IoBuffer.allocate(i);
            while (true) {
                ioBuffer2 = (IoBuffer) this.messageQueue.poll();
                if (ioBuffer2 != null) {
                    allocate.put(ioBuffer2);
                } else {
                    allocate.flip();
                    this.messageQueue.add(allocate);
                    return;
                }
            }
        }
    }
}
