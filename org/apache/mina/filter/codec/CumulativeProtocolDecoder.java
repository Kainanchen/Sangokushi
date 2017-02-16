package org.apache.mina.filter.codec;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.AttributeKey;
import org.apache.mina.core.session.IoSession;

public abstract class CumulativeProtocolDecoder extends ProtocolDecoderAdapter {
    private final AttributeKey BUFFER;
    private boolean transportMetadataFragmentation;

    public abstract boolean doDecode(IoSession ioSession, IoBuffer ioBuffer, ProtocolDecoderOutput protocolDecoderOutput);

    public CumulativeProtocolDecoder() {
        this.BUFFER = new AttributeKey(getClass(), "buffer");
        this.transportMetadataFragmentation = true;
    }

    public void decode(IoSession ioSession, IoBuffer ioBuffer, ProtocolDecoderOutput protocolDecoderOutput) {
        boolean z = false;
        if (!this.transportMetadataFragmentation || ioSession.getTransportMetadata().hasFragmentation()) {
            IoBuffer ioBuffer2 = (IoBuffer) ioSession.getAttribute(this.BUFFER);
            if (ioBuffer2 != null) {
                if (ioBuffer2.isAutoExpand()) {
                    try {
                        ioBuffer2.put(ioBuffer);
                        z = true;
                    } catch (IllegalStateException e) {
                    } catch (IndexOutOfBoundsException e2) {
                    }
                }
                if (z) {
                    ioBuffer2.flip();
                    z = true;
                } else {
                    ioBuffer2.flip();
                    IoBuffer autoExpand = IoBuffer.allocate(ioBuffer2.remaining() + ioBuffer.remaining()).setAutoExpand(true);
                    autoExpand.order(ioBuffer2.order());
                    autoExpand.put(ioBuffer2);
                    autoExpand.put(ioBuffer);
                    autoExpand.flip();
                    ioSession.setAttribute(this.BUFFER, autoExpand);
                    ioBuffer2 = autoExpand;
                    z = true;
                }
            } else {
                ioBuffer2 = ioBuffer;
            }
            do {
                int position = ioBuffer2.position();
                if (!doDecode(ioSession, ioBuffer2, protocolDecoderOutput)) {
                    break;
                } else if (ioBuffer2.position() == position) {
                    throw new IllegalStateException("doDecode() can't return true when buffer is not consumed.");
                }
            } while (ioBuffer2.hasRemaining());
            if (ioBuffer2.hasRemaining()) {
                if (z && ioBuffer2.isAutoExpand()) {
                    ioBuffer2.compact();
                    return;
                } else {
                    storeRemainingInSession(ioBuffer2, ioSession);
                    return;
                }
            } else if (z) {
                removeSessionBuffer(ioSession);
                return;
            } else {
                return;
            }
        }
        while (ioBuffer.hasRemaining()) {
            if (!doDecode(ioSession, ioBuffer, protocolDecoderOutput)) {
                return;
            }
        }
    }

    public void dispose(IoSession ioSession) {
        removeSessionBuffer(ioSession);
    }

    private void removeSessionBuffer(IoSession ioSession) {
        ioSession.removeAttribute(this.BUFFER);
    }

    private void storeRemainingInSession(IoBuffer ioBuffer, IoSession ioSession) {
        IoBuffer autoExpand = IoBuffer.allocate(ioBuffer.capacity()).setAutoExpand(true);
        autoExpand.order(ioBuffer.order());
        autoExpand.put(ioBuffer);
        ioSession.setAttribute(this.BUFFER, autoExpand);
    }

    public void setTransportMetadataFragmentation(boolean z) {
        this.transportMetadataFragmentation = z;
    }
}
