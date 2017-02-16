package org.apache.mina.transport.vmpipe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.filterchain.DefaultIoFilterChain;
import org.apache.mina.core.service.IoProcessor;
import org.apache.mina.core.session.AbstractIoSession;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoEvent;
import org.apache.mina.core.session.IoEventType;
import org.apache.mina.core.write.WriteRequest;
import org.apache.mina.core.write.WriteRequestQueue;
import org.apache.mina.core.write.WriteToClosedSessionException;

class VmPipeFilterChain extends DefaultIoFilterChain {
    private final Queue<IoEvent> eventQueue;
    private volatile boolean flushEnabled;
    private final IoProcessor<VmPipeSession> processor;
    private volatile boolean sessionOpened;

    private class VmPipeIoProcessor implements IoProcessor<VmPipeSession> {
        private VmPipeIoProcessor() {
        }

        public void flush(VmPipeSession vmPipeSession) {
            WriteRequestQueue writeRequestQueue0 = vmPipeSession.getWriteRequestQueue0();
            if (vmPipeSession.isClosing()) {
                Collection<WriteRequest> arrayList = new ArrayList();
                while (true) {
                    WriteRequest poll = writeRequestQueue0.poll(vmPipeSession);
                    if (poll == null) {
                        break;
                    }
                    arrayList.add(poll);
                }
                if (!arrayList.isEmpty()) {
                    Throwable writeToClosedSessionException = new WriteToClosedSessionException((Collection) arrayList);
                    for (WriteRequest future : arrayList) {
                        future.getFuture().setException(writeToClosedSessionException);
                    }
                    vmPipeSession.getFilterChain().fireExceptionCaught(writeToClosedSessionException);
                    return;
                }
                return;
            }
            vmPipeSession.getLock().lock();
            try {
                if (!writeRequestQueue0.isEmpty(vmPipeSession)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    while (true) {
                        WriteRequest poll2 = writeRequestQueue0.poll(vmPipeSession);
                        if (poll2 == null) {
                            break;
                        }
                        Object message = poll2.getMessage();
                        VmPipeFilterChain.this.pushEvent(new IoEvent(IoEventType.MESSAGE_SENT, vmPipeSession, poll2), false);
                        vmPipeSession.getRemoteSession().getFilterChain().fireMessageReceived(getMessageCopy(message));
                        if (message instanceof IoBuffer) {
                            vmPipeSession.increaseWrittenBytes0(((IoBuffer) message).remaining(), currentTimeMillis);
                        }
                    }
                    if (VmPipeFilterChain.this.flushEnabled) {
                        VmPipeFilterChain.this.flushEvents();
                    }
                    vmPipeSession.getLock().unlock();
                    VmPipeFilterChain.flushPendingDataQueues(vmPipeSession);
                }
            } finally {
                if (VmPipeFilterChain.this.flushEnabled) {
                    VmPipeFilterChain.this.flushEvents();
                }
                vmPipeSession.getLock().unlock();
            }
        }

        public void write(VmPipeSession vmPipeSession, WriteRequest writeRequest) {
            vmPipeSession.getWriteRequestQueue().offer(vmPipeSession, writeRequest);
            if (!vmPipeSession.isWriteSuspended()) {
                flush(vmPipeSession);
            }
        }

        private Object getMessageCopy(Object obj) {
            if (!(obj instanceof IoBuffer)) {
                return obj;
            }
            IoBuffer ioBuffer = (IoBuffer) obj;
            ioBuffer.mark();
            IoBuffer allocate = IoBuffer.allocate(ioBuffer.remaining());
            allocate.put(ioBuffer);
            allocate.flip();
            ioBuffer.reset();
            return allocate;
        }

        public void remove(VmPipeSession vmPipeSession) {
            try {
                vmPipeSession.getLock().lock();
                if (!vmPipeSession.getCloseFuture().isClosed()) {
                    vmPipeSession.getServiceListeners().fireSessionDestroyed(vmPipeSession);
                    vmPipeSession.getRemoteSession().closeNow();
                }
                vmPipeSession.getLock().unlock();
            } catch (Throwable th) {
                vmPipeSession.getLock().unlock();
            }
        }

        public void add(VmPipeSession vmPipeSession) {
        }

        public void updateTrafficControl(VmPipeSession vmPipeSession) {
            if (!vmPipeSession.isReadSuspended()) {
                Object<Object> arrayList = new ArrayList();
                vmPipeSession.receivedMessageQueue.drainTo(arrayList);
                for (Object fireMessageReceived : arrayList) {
                    VmPipeFilterChain.this.fireMessageReceived(fireMessageReceived);
                }
            }
            if (!vmPipeSession.isWriteSuspended()) {
                flush(vmPipeSession);
            }
        }

        public void dispose() {
        }

        public boolean isDisposed() {
            return false;
        }

        public boolean isDisposing() {
            return false;
        }
    }

    VmPipeFilterChain(AbstractIoSession abstractIoSession) {
        super(abstractIoSession);
        this.eventQueue = new ConcurrentLinkedQueue();
        this.processor = new VmPipeIoProcessor();
    }

    IoProcessor<VmPipeSession> getProcessor() {
        return this.processor;
    }

    public void start() {
        this.flushEnabled = true;
        flushEvents();
        flushPendingDataQueues((VmPipeSession) getSession());
    }

    private void pushEvent(IoEvent ioEvent) {
        pushEvent(ioEvent, this.flushEnabled);
    }

    private void pushEvent(IoEvent ioEvent, boolean z) {
        this.eventQueue.add(ioEvent);
        if (z) {
            flushEvents();
        }
    }

    private void flushEvents() {
        while (true) {
            IoEvent ioEvent = (IoEvent) this.eventQueue.poll();
            if (ioEvent != null) {
                fireEvent(ioEvent);
            } else {
                return;
            }
        }
    }

    private void fireEvent(IoEvent ioEvent) {
        VmPipeSession vmPipeSession = (VmPipeSession) getSession();
        IoEventType type = ioEvent.getType();
        Object parameter = ioEvent.getParameter();
        if (type == IoEventType.MESSAGE_RECEIVED) {
            if (this.sessionOpened && !vmPipeSession.isReadSuspended() && vmPipeSession.getLock().tryLock()) {
                try {
                    if (vmPipeSession.isReadSuspended()) {
                        vmPipeSession.receivedMessageQueue.add(parameter);
                    } else {
                        super.fireMessageReceived(parameter);
                    }
                    vmPipeSession.getLock().unlock();
                } catch (Throwable th) {
                    vmPipeSession.getLock().unlock();
                }
            } else {
                vmPipeSession.receivedMessageQueue.add(parameter);
            }
        } else if (type == IoEventType.WRITE) {
            super.fireFilterWrite((WriteRequest) parameter);
        } else if (type == IoEventType.MESSAGE_SENT) {
            super.fireMessageSent((WriteRequest) parameter);
        } else if (type == IoEventType.EXCEPTION_CAUGHT) {
            super.fireExceptionCaught((Throwable) parameter);
        } else if (type == IoEventType.SESSION_IDLE) {
            super.fireSessionIdle((IdleStatus) parameter);
        } else if (type == IoEventType.SESSION_OPENED) {
            super.fireSessionOpened();
            this.sessionOpened = true;
        } else if (type == IoEventType.SESSION_CREATED) {
            vmPipeSession.getLock().lock();
            try {
                super.fireSessionCreated();
            } finally {
                vmPipeSession.getLock().unlock();
            }
        } else if (type == IoEventType.SESSION_CLOSED) {
            flushPendingDataQueues(vmPipeSession);
            super.fireSessionClosed();
        } else if (type == IoEventType.CLOSE) {
            super.fireFilterClose();
        }
    }

    private static void flushPendingDataQueues(VmPipeSession vmPipeSession) {
        vmPipeSession.getProcessor().updateTrafficControl(vmPipeSession);
        vmPipeSession.getRemoteSession().getProcessor().updateTrafficControl(vmPipeSession);
    }

    public void fireFilterClose() {
        pushEvent(new IoEvent(IoEventType.CLOSE, getSession(), null));
    }

    public void fireFilterWrite(WriteRequest writeRequest) {
        pushEvent(new IoEvent(IoEventType.WRITE, getSession(), writeRequest));
    }

    public void fireExceptionCaught(Throwable th) {
        pushEvent(new IoEvent(IoEventType.EXCEPTION_CAUGHT, getSession(), th));
    }

    public void fireMessageSent(WriteRequest writeRequest) {
        pushEvent(new IoEvent(IoEventType.MESSAGE_SENT, getSession(), writeRequest));
    }

    public void fireSessionClosed() {
        pushEvent(new IoEvent(IoEventType.SESSION_CLOSED, getSession(), null));
    }

    public void fireSessionCreated() {
        pushEvent(new IoEvent(IoEventType.SESSION_CREATED, getSession(), null));
    }

    public void fireSessionIdle(IdleStatus idleStatus) {
        pushEvent(new IoEvent(IoEventType.SESSION_IDLE, getSession(), idleStatus));
    }

    public void fireSessionOpened() {
        pushEvent(new IoEvent(IoEventType.SESSION_OPENED, getSession(), null));
    }

    public void fireMessageReceived(Object obj) {
        pushEvent(new IoEvent(IoEventType.MESSAGE_RECEIVED, getSession(), obj));
    }
}
