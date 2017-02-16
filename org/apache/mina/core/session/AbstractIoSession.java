package org.apache.mina.core.session;

import java.io.File;
import java.io.FileInputStream;
import java.net.SocketAddress;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.file.DefaultFileRegion;
import org.apache.mina.core.file.FilenameFileRegion;
import org.apache.mina.core.future.CloseFuture;
import org.apache.mina.core.future.DefaultCloseFuture;
import org.apache.mina.core.future.DefaultReadFuture;
import org.apache.mina.core.future.DefaultWriteFuture;
import org.apache.mina.core.future.IoFutureListener;
import org.apache.mina.core.future.ReadFuture;
import org.apache.mina.core.future.WriteFuture;
import org.apache.mina.core.service.AbstractIoService;
import org.apache.mina.core.service.IoAcceptor;
import org.apache.mina.core.service.IoHandler;
import org.apache.mina.core.service.IoProcessor;
import org.apache.mina.core.service.IoService;
import org.apache.mina.core.service.TransportMetadata;
import org.apache.mina.core.write.DefaultWriteRequest;
import org.apache.mina.core.write.WriteRequest;
import org.apache.mina.core.write.WriteRequestQueue;
import org.apache.mina.core.write.WriteTimeoutException;
import org.apache.mina.core.write.WriteToClosedSessionException;
import org.apache.mina.util.ExceptionMonitor;
import org.cocos2dx.lib.BuildConfig;

public abstract class AbstractIoSession implements IoSession {
    public static final WriteRequest CLOSE_REQUEST;
    public static final WriteRequest MESSAGE_SENT_REQUEST;
    private static final AttributeKey READY_READ_FUTURES_KEY;
    private static final IoFutureListener<CloseFuture> SCHEDULED_COUNTER_RESETTER;
    private static final AttributeKey WAITING_READ_FUTURES_KEY;
    private static AtomicLong idGenerator;
    private IoSessionAttributeMap attributes;
    private final CloseFuture closeFuture;
    private volatile boolean closing;
    public IoSessionConfig config;
    private final long creationTime;
    private WriteRequest currentWriteRequest;
    private boolean deferDecreaseReadBuffer;
    private final IoHandler handler;
    private AtomicInteger idleCountForBoth;
    private AtomicInteger idleCountForRead;
    private AtomicInteger idleCountForWrite;
    private long lastIdleTimeForBoth;
    private long lastIdleTimeForRead;
    private long lastIdleTimeForWrite;
    private long lastReadBytes;
    private long lastReadMessages;
    private long lastReadTime;
    private long lastThroughputCalculationTime;
    private long lastWriteTime;
    private long lastWrittenBytes;
    private long lastWrittenMessages;
    private final Object lock;
    private long readBytes;
    private double readBytesThroughput;
    private long readMessages;
    private double readMessagesThroughput;
    private boolean readSuspended;
    private final AtomicBoolean scheduledForFlush;
    private final AtomicInteger scheduledWriteBytes;
    private final AtomicInteger scheduledWriteMessages;
    private final IoService service;
    private long sessionId;
    private WriteRequestQueue writeRequestQueue;
    private boolean writeSuspended;
    private long writtenBytes;
    private double writtenBytesThroughput;
    private long writtenMessages;
    private double writtenMessagesThroughput;

    /* renamed from: org.apache.mina.core.session.AbstractIoSession.1 */
    static class C04151 implements IoFutureListener<CloseFuture> {
        C04151() {
        }

        public final void operationComplete(CloseFuture closeFuture) {
            AbstractIoSession abstractIoSession = (AbstractIoSession) closeFuture.getSession();
            abstractIoSession.scheduledWriteBytes.set(0);
            abstractIoSession.scheduledWriteMessages.set(0);
            abstractIoSession.readBytesThroughput = 0.0d;
            abstractIoSession.readMessagesThroughput = 0.0d;
            abstractIoSession.writtenBytesThroughput = 0.0d;
            abstractIoSession.writtenMessagesThroughput = 0.0d;
        }
    }

    /* renamed from: org.apache.mina.core.session.AbstractIoSession.2 */
    class C04162 implements IoFutureListener<WriteFuture> {
        final /* synthetic */ FileChannel val$finalChannel;

        C04162(FileChannel fileChannel) {
            this.val$finalChannel = fileChannel;
        }

        public void operationComplete(WriteFuture writeFuture) {
            try {
                this.val$finalChannel.close();
            } catch (Throwable e) {
                ExceptionMonitor.getInstance().exceptionCaught(e);
            }
        }
    }

    public abstract IoProcessor getProcessor();

    static {
        READY_READ_FUTURES_KEY = new AttributeKey(AbstractIoSession.class, "readyReadFutures");
        WAITING_READ_FUTURES_KEY = new AttributeKey(AbstractIoSession.class, "waitingReadFutures");
        SCHEDULED_COUNTER_RESETTER = new C04151();
        CLOSE_REQUEST = new DefaultWriteRequest(new Object());
        MESSAGE_SENT_REQUEST = new DefaultWriteRequest(DefaultWriteRequest.EMPTY_MESSAGE);
        idGenerator = new AtomicLong(0);
    }

    public AbstractIoSession(IoService ioService) {
        this.lock = new Object();
        this.closeFuture = new DefaultCloseFuture(this);
        this.readSuspended = false;
        this.writeSuspended = false;
        this.scheduledForFlush = new AtomicBoolean();
        this.scheduledWriteBytes = new AtomicInteger();
        this.scheduledWriteMessages = new AtomicInteger();
        this.idleCountForBoth = new AtomicInteger();
        this.idleCountForRead = new AtomicInteger();
        this.idleCountForWrite = new AtomicInteger();
        this.deferDecreaseReadBuffer = true;
        this.service = ioService;
        this.handler = ioService.getHandler();
        long currentTimeMillis = System.currentTimeMillis();
        this.creationTime = currentTimeMillis;
        this.lastThroughputCalculationTime = currentTimeMillis;
        this.lastReadTime = currentTimeMillis;
        this.lastWriteTime = currentTimeMillis;
        this.lastIdleTimeForBoth = currentTimeMillis;
        this.lastIdleTimeForRead = currentTimeMillis;
        this.lastIdleTimeForWrite = currentTimeMillis;
        this.closeFuture.addListener(SCHEDULED_COUNTER_RESETTER);
        this.sessionId = idGenerator.incrementAndGet();
    }

    public final long getId() {
        return this.sessionId;
    }

    public final boolean isConnected() {
        return !this.closeFuture.isClosed();
    }

    public boolean isActive() {
        return true;
    }

    public final boolean isClosing() {
        return this.closing || this.closeFuture.isClosed();
    }

    public boolean isSecured() {
        return false;
    }

    public final CloseFuture getCloseFuture() {
        return this.closeFuture;
    }

    public final boolean isScheduledForFlush() {
        return this.scheduledForFlush.get();
    }

    public final void scheduledForFlush() {
        this.scheduledForFlush.set(true);
    }

    public final void unscheduledForFlush() {
        this.scheduledForFlush.set(false);
    }

    public final boolean setScheduledForFlush(boolean z) {
        if (z) {
            return this.scheduledForFlush.compareAndSet(false, z);
        }
        this.scheduledForFlush.set(z);
        return true;
    }

    public final CloseFuture close(boolean z) {
        if (z) {
            return closeNow();
        }
        return closeOnFlush();
    }

    public final CloseFuture close() {
        return closeNow();
    }

    public final CloseFuture closeOnFlush() {
        if (!isClosing()) {
            getWriteRequestQueue().offer(this, CLOSE_REQUEST);
            getProcessor().flush(this);
        }
        return this.closeFuture;
    }

    public final CloseFuture closeNow() {
        synchronized (this.lock) {
            if (isClosing()) {
                CloseFuture closeFuture = this.closeFuture;
                return closeFuture;
            }
            this.closing = true;
            try {
                destroy();
            } catch (Throwable e) {
                getFilterChain().fireExceptionCaught(e);
            }
            getFilterChain().fireFilterClose();
            return this.closeFuture;
        }
    }

    protected void destroy() {
        if (this.writeRequestQueue != null) {
            while (!this.writeRequestQueue.isEmpty(this)) {
                WriteRequest poll = this.writeRequestQueue.poll(this);
                if (poll != null) {
                    WriteFuture future = poll.getFuture();
                    if (future != null) {
                        future.setWritten();
                    }
                }
            }
        }
    }

    public IoHandler getHandler() {
        return this.handler;
    }

    public IoSessionConfig getConfig() {
        return this.config;
    }

    public final ReadFuture read() {
        if (getConfig().isUseReadOperation()) {
            ReadFuture readFuture;
            Queue readyReadFutures = getReadyReadFutures();
            synchronized (readyReadFutures) {
                readFuture = (ReadFuture) readyReadFutures.poll();
                if (readFuture == null) {
                    readFuture = new DefaultReadFuture(this);
                    getWaitingReadFutures().offer(readFuture);
                } else if (readFuture.isClosed()) {
                    readyReadFutures.offer(readFuture);
                }
            }
            return readFuture;
        }
        throw new IllegalStateException("useReadOperation is not enabled.");
    }

    public final void offerReadFuture(Object obj) {
        newReadFuture().setRead(obj);
    }

    public final void offerFailedReadFuture(Throwable th) {
        newReadFuture().setException(th);
    }

    public final void offerClosedReadFuture() {
        synchronized (getReadyReadFutures()) {
            newReadFuture().setClosed();
        }
    }

    private ReadFuture newReadFuture() {
        ReadFuture readFuture;
        Queue readyReadFutures = getReadyReadFutures();
        Queue waitingReadFutures = getWaitingReadFutures();
        synchronized (readyReadFutures) {
            readFuture = (ReadFuture) waitingReadFutures.poll();
            if (readFuture == null) {
                readFuture = new DefaultReadFuture(this);
                readyReadFutures.offer(readFuture);
            }
        }
        return readFuture;
    }

    private Queue<ReadFuture> getReadyReadFutures() {
        Queue<ReadFuture> queue = (Queue) getAttribute(READY_READ_FUTURES_KEY);
        if (queue != null) {
            return queue;
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        queue = (Queue) setAttributeIfAbsent(READY_READ_FUTURES_KEY, concurrentLinkedQueue);
        return queue != null ? queue : concurrentLinkedQueue;
    }

    private Queue<ReadFuture> getWaitingReadFutures() {
        Queue<ReadFuture> queue = (Queue) getAttribute(WAITING_READ_FUTURES_KEY);
        if (queue != null) {
            return queue;
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        queue = (Queue) setAttributeIfAbsent(WAITING_READ_FUTURES_KEY, concurrentLinkedQueue);
        return queue != null ? queue : concurrentLinkedQueue;
    }

    public WriteFuture write(Object obj) {
        return write(obj, null);
    }

    public WriteFuture write(Object obj, SocketAddress socketAddress) {
        if (obj == null) {
            throw new IllegalArgumentException("Trying to write a null message : not allowed");
        } else if (!getTransportMetadata().isConnectionless() && socketAddress != null) {
            throw new UnsupportedOperationException();
        } else if (isClosing() || !isConnected()) {
            WriteFuture defaultWriteFuture = new DefaultWriteFuture(this);
            defaultWriteFuture.setException(new WriteToClosedSessionException(new DefaultWriteRequest(obj, defaultWriteFuture, socketAddress)));
            return defaultWriteFuture;
        } else {
            FileChannel fileChannel = null;
            try {
                Object defaultFileRegion;
                if (obj instanceof IoBuffer) {
                    if (!((IoBuffer) obj).hasRemaining()) {
                        throw new IllegalArgumentException("message is empty. Forgot to call flip()?");
                    }
                }
                if (obj instanceof FileChannel) {
                    FileChannel fileChannel2 = (FileChannel) obj;
                    defaultFileRegion = new DefaultFileRegion(fileChannel2, 0, fileChannel2.size());
                } else {
                    FileChannel channel;
                    FilenameFileRegion filenameFileRegion;
                    if (obj instanceof File) {
                        File file = (File) obj;
                        channel = new FileInputStream(file).getChannel();
                        filenameFileRegion = new FilenameFileRegion(file, channel, 0, channel.size());
                    } else {
                        channel = null;
                        filenameFileRegion = obj;
                    }
                    fileChannel = channel;
                    FilenameFileRegion filenameFileRegion2 = filenameFileRegion;
                }
                WriteFuture defaultWriteFuture2 = new DefaultWriteFuture(this);
                getFilterChain().fireFilterWrite(new DefaultWriteRequest(defaultFileRegion, defaultWriteFuture2, socketAddress));
                if (fileChannel != null) {
                    defaultWriteFuture2.addListener(new C04162(fileChannel));
                }
                return defaultWriteFuture2;
            } catch (Throwable e) {
                ExceptionMonitor.getInstance().exceptionCaught(e);
                return DefaultWriteFuture.newNotWrittenFuture(this, e);
            }
        }
    }

    public final Object getAttachment() {
        return getAttribute(BuildConfig.FLAVOR);
    }

    public final Object setAttachment(Object obj) {
        return setAttribute(BuildConfig.FLAVOR, obj);
    }

    public final Object getAttribute(Object obj) {
        return getAttribute(obj, null);
    }

    public final Object getAttribute(Object obj, Object obj2) {
        return this.attributes.getAttribute(this, obj, obj2);
    }

    public final Object setAttribute(Object obj, Object obj2) {
        return this.attributes.setAttribute(this, obj, obj2);
    }

    public final Object setAttribute(Object obj) {
        return setAttribute(obj, Boolean.TRUE);
    }

    public final Object setAttributeIfAbsent(Object obj, Object obj2) {
        return this.attributes.setAttributeIfAbsent(this, obj, obj2);
    }

    public final Object setAttributeIfAbsent(Object obj) {
        return setAttributeIfAbsent(obj, Boolean.TRUE);
    }

    public final Object removeAttribute(Object obj) {
        return this.attributes.removeAttribute(this, obj);
    }

    public final boolean removeAttribute(Object obj, Object obj2) {
        return this.attributes.removeAttribute(this, obj, obj2);
    }

    public final boolean replaceAttribute(Object obj, Object obj2, Object obj3) {
        return this.attributes.replaceAttribute(this, obj, obj2, obj3);
    }

    public final boolean containsAttribute(Object obj) {
        return this.attributes.containsAttribute(this, obj);
    }

    public final Set<Object> getAttributeKeys() {
        return this.attributes.getAttributeKeys(this);
    }

    public final IoSessionAttributeMap getAttributeMap() {
        return this.attributes;
    }

    public final void setAttributeMap(IoSessionAttributeMap ioSessionAttributeMap) {
        this.attributes = ioSessionAttributeMap;
    }

    public final void setWriteRequestQueue(WriteRequestQueue writeRequestQueue) {
        this.writeRequestQueue = writeRequestQueue;
    }

    public final void suspendRead() {
        this.readSuspended = true;
        if (!isClosing() && isConnected()) {
            getProcessor().updateTrafficControl(this);
        }
    }

    public final void suspendWrite() {
        this.writeSuspended = true;
        if (!isClosing() && isConnected()) {
            getProcessor().updateTrafficControl(this);
        }
    }

    public final void resumeRead() {
        this.readSuspended = false;
        if (!isClosing() && isConnected()) {
            getProcessor().updateTrafficControl(this);
        }
    }

    public final void resumeWrite() {
        this.writeSuspended = false;
        if (!isClosing() && isConnected()) {
            getProcessor().updateTrafficControl(this);
        }
    }

    public boolean isReadSuspended() {
        return this.readSuspended;
    }

    public boolean isWriteSuspended() {
        return this.writeSuspended;
    }

    public final long getReadBytes() {
        return this.readBytes;
    }

    public final long getWrittenBytes() {
        return this.writtenBytes;
    }

    public final long getReadMessages() {
        return this.readMessages;
    }

    public final long getWrittenMessages() {
        return this.writtenMessages;
    }

    public final double getReadBytesThroughput() {
        return this.readBytesThroughput;
    }

    public final double getWrittenBytesThroughput() {
        return this.writtenBytesThroughput;
    }

    public final double getReadMessagesThroughput() {
        return this.readMessagesThroughput;
    }

    public final double getWrittenMessagesThroughput() {
        return this.writtenMessagesThroughput;
    }

    public final void updateThroughput(long j, boolean z) {
        int i = (int) (j - this.lastThroughputCalculationTime);
        long throughputCalculationIntervalInMillis = getConfig().getThroughputCalculationIntervalInMillis();
        if ((throughputCalculationIntervalInMillis != 0 && ((long) i) >= throughputCalculationIntervalInMillis) || z) {
            this.readBytesThroughput = (((double) (this.readBytes - this.lastReadBytes)) * 1000.0d) / ((double) i);
            this.writtenBytesThroughput = (((double) (this.writtenBytes - this.lastWrittenBytes)) * 1000.0d) / ((double) i);
            this.readMessagesThroughput = (((double) (this.readMessages - this.lastReadMessages)) * 1000.0d) / ((double) i);
            this.writtenMessagesThroughput = (((double) (this.writtenMessages - this.lastWrittenMessages)) * 1000.0d) / ((double) i);
            this.lastReadBytes = this.readBytes;
            this.lastWrittenBytes = this.writtenBytes;
            this.lastReadMessages = this.readMessages;
            this.lastWrittenMessages = this.writtenMessages;
            this.lastThroughputCalculationTime = j;
        }
    }

    public final long getScheduledWriteBytes() {
        return (long) this.scheduledWriteBytes.get();
    }

    public final int getScheduledWriteMessages() {
        return this.scheduledWriteMessages.get();
    }

    protected void setScheduledWriteBytes(int i) {
        this.scheduledWriteBytes.set(i);
    }

    protected void setScheduledWriteMessages(int i) {
        this.scheduledWriteMessages.set(i);
    }

    public final void increaseReadBytes(long j, long j2) {
        if (j > 0) {
            this.readBytes += j;
            this.lastReadTime = j2;
            this.idleCountForBoth.set(0);
            this.idleCountForRead.set(0);
            if (getService() instanceof AbstractIoService) {
                ((AbstractIoService) getService()).getStatistics().increaseReadBytes(j, j2);
            }
        }
    }

    public final void increaseReadMessages(long j) {
        this.readMessages++;
        this.lastReadTime = j;
        this.idleCountForBoth.set(0);
        this.idleCountForRead.set(0);
        if (getService() instanceof AbstractIoService) {
            ((AbstractIoService) getService()).getStatistics().increaseReadMessages(j);
        }
    }

    public final void increaseWrittenBytes(int i, long j) {
        if (i > 0) {
            this.writtenBytes += (long) i;
            this.lastWriteTime = j;
            this.idleCountForBoth.set(0);
            this.idleCountForWrite.set(0);
            if (getService() instanceof AbstractIoService) {
                ((AbstractIoService) getService()).getStatistics().increaseWrittenBytes(i, j);
            }
            increaseScheduledWriteBytes(-i);
        }
    }

    public final void increaseWrittenMessages(WriteRequest writeRequest, long j) {
        Object message = writeRequest.getMessage();
        if (!(message instanceof IoBuffer) || !((IoBuffer) message).hasRemaining()) {
            this.writtenMessages++;
            this.lastWriteTime = j;
            if (getService() instanceof AbstractIoService) {
                ((AbstractIoService) getService()).getStatistics().increaseWrittenMessages(j);
            }
            decreaseScheduledWriteMessages();
        }
    }

    public final void increaseScheduledWriteBytes(int i) {
        this.scheduledWriteBytes.addAndGet(i);
        if (getService() instanceof AbstractIoService) {
            ((AbstractIoService) getService()).getStatistics().increaseScheduledWriteBytes(i);
        }
    }

    public final void increaseScheduledWriteMessages() {
        this.scheduledWriteMessages.incrementAndGet();
        if (getService() instanceof AbstractIoService) {
            ((AbstractIoService) getService()).getStatistics().increaseScheduledWriteMessages();
        }
    }

    private void decreaseScheduledWriteMessages() {
        this.scheduledWriteMessages.decrementAndGet();
        if (getService() instanceof AbstractIoService) {
            ((AbstractIoService) getService()).getStatistics().decreaseScheduledWriteMessages();
        }
    }

    public final void decreaseScheduledBytesAndMessages(WriteRequest writeRequest) {
        Object message = writeRequest.getMessage();
        if (!(message instanceof IoBuffer)) {
            decreaseScheduledWriteMessages();
        } else if (((IoBuffer) message).hasRemaining()) {
            increaseScheduledWriteBytes(-((IoBuffer) message).remaining());
        } else {
            decreaseScheduledWriteMessages();
        }
    }

    public final WriteRequestQueue getWriteRequestQueue() {
        if (this.writeRequestQueue != null) {
            return this.writeRequestQueue;
        }
        throw new IllegalStateException();
    }

    public final WriteRequest getCurrentWriteRequest() {
        return this.currentWriteRequest;
    }

    public final Object getCurrentWriteMessage() {
        WriteRequest currentWriteRequest = getCurrentWriteRequest();
        if (currentWriteRequest == null) {
            return null;
        }
        return currentWriteRequest.getMessage();
    }

    public final void setCurrentWriteRequest(WriteRequest writeRequest) {
        this.currentWriteRequest = writeRequest;
    }

    public final void increaseReadBufferSize() {
        int readBufferSize = getConfig().getReadBufferSize() << 1;
        if (readBufferSize <= getConfig().getMaxReadBufferSize()) {
            getConfig().setReadBufferSize(readBufferSize);
        } else {
            getConfig().setReadBufferSize(getConfig().getMaxReadBufferSize());
        }
        this.deferDecreaseReadBuffer = true;
    }

    public final void decreaseReadBufferSize() {
        if (this.deferDecreaseReadBuffer) {
            this.deferDecreaseReadBuffer = false;
            return;
        }
        if (getConfig().getReadBufferSize() > getConfig().getMinReadBufferSize()) {
            getConfig().setReadBufferSize(getConfig().getReadBufferSize() >>> 1);
        }
        this.deferDecreaseReadBuffer = true;
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final long getLastIoTime() {
        return Math.max(this.lastReadTime, this.lastWriteTime);
    }

    public final long getLastReadTime() {
        return this.lastReadTime;
    }

    public final long getLastWriteTime() {
        return this.lastWriteTime;
    }

    public final boolean isIdle(IdleStatus idleStatus) {
        if (idleStatus == IdleStatus.BOTH_IDLE) {
            if (this.idleCountForBoth.get() > 0) {
                return true;
            }
            return false;
        } else if (idleStatus == IdleStatus.READER_IDLE) {
            if (this.idleCountForRead.get() <= 0) {
                return false;
            }
            return true;
        } else if (idleStatus != IdleStatus.WRITER_IDLE) {
            throw new IllegalArgumentException("Unknown idle status: " + idleStatus);
        } else if (this.idleCountForWrite.get() <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean isBothIdle() {
        return isIdle(IdleStatus.BOTH_IDLE);
    }

    public final boolean isReaderIdle() {
        return isIdle(IdleStatus.READER_IDLE);
    }

    public final boolean isWriterIdle() {
        return isIdle(IdleStatus.WRITER_IDLE);
    }

    public final int getIdleCount(IdleStatus idleStatus) {
        if (getConfig().getIdleTime(idleStatus) == 0) {
            if (idleStatus == IdleStatus.BOTH_IDLE) {
                this.idleCountForBoth.set(0);
            }
            if (idleStatus == IdleStatus.READER_IDLE) {
                this.idleCountForRead.set(0);
            }
            if (idleStatus == IdleStatus.WRITER_IDLE) {
                this.idleCountForWrite.set(0);
            }
        }
        if (idleStatus == IdleStatus.BOTH_IDLE) {
            return this.idleCountForBoth.get();
        }
        if (idleStatus == IdleStatus.READER_IDLE) {
            return this.idleCountForRead.get();
        }
        if (idleStatus == IdleStatus.WRITER_IDLE) {
            return this.idleCountForWrite.get();
        }
        throw new IllegalArgumentException("Unknown idle status: " + idleStatus);
    }

    public final long getLastIdleTime(IdleStatus idleStatus) {
        if (idleStatus == IdleStatus.BOTH_IDLE) {
            return this.lastIdleTimeForBoth;
        }
        if (idleStatus == IdleStatus.READER_IDLE) {
            return this.lastIdleTimeForRead;
        }
        if (idleStatus == IdleStatus.WRITER_IDLE) {
            return this.lastIdleTimeForWrite;
        }
        throw new IllegalArgumentException("Unknown idle status: " + idleStatus);
    }

    public final void increaseIdleCount(IdleStatus idleStatus, long j) {
        if (idleStatus == IdleStatus.BOTH_IDLE) {
            this.idleCountForBoth.incrementAndGet();
            this.lastIdleTimeForBoth = j;
        } else if (idleStatus == IdleStatus.READER_IDLE) {
            this.idleCountForRead.incrementAndGet();
            this.lastIdleTimeForRead = j;
        } else if (idleStatus == IdleStatus.WRITER_IDLE) {
            this.idleCountForWrite.incrementAndGet();
            this.lastIdleTimeForWrite = j;
        } else {
            throw new IllegalArgumentException("Unknown idle status: " + idleStatus);
        }
    }

    public final int getBothIdleCount() {
        return getIdleCount(IdleStatus.BOTH_IDLE);
    }

    public final long getLastBothIdleTime() {
        return getLastIdleTime(IdleStatus.BOTH_IDLE);
    }

    public final long getLastReaderIdleTime() {
        return getLastIdleTime(IdleStatus.READER_IDLE);
    }

    public final long getLastWriterIdleTime() {
        return getLastIdleTime(IdleStatus.WRITER_IDLE);
    }

    public final int getReaderIdleCount() {
        return getIdleCount(IdleStatus.READER_IDLE);
    }

    public final int getWriterIdleCount() {
        return getIdleCount(IdleStatus.WRITER_IDLE);
    }

    public SocketAddress getServiceAddress() {
        IoService service = getService();
        if (service instanceof IoAcceptor) {
            return ((IoAcceptor) service).getLocalAddress();
        }
        return getRemoteAddress();
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String toString() {
        if (!isConnected() && !isClosing()) {
            return "(" + getIdAsString() + ") Session disconnected ...";
        }
        String valueOf;
        String str = null;
        try {
            valueOf = String.valueOf(getRemoteAddress());
        } catch (Exception e) {
            valueOf = "Cannot get the remote address informations: " + e.getMessage();
        }
        try {
            str = String.valueOf(getLocalAddress());
        } catch (Exception e2) {
        }
        if (getService() instanceof IoAcceptor) {
            return "(" + getIdAsString() + ": " + getServiceName() + ", server, " + valueOf + " => " + str + ')';
        }
        return "(" + getIdAsString() + ": " + getServiceName() + ", client, " + str + " => " + valueOf + ')';
    }

    private String getIdAsString() {
        String toUpperCase = Long.toHexString(getId()).toUpperCase();
        if (toUpperCase.length() <= 8) {
            return "0x00000000".substring(0, 10 - toUpperCase.length()) + toUpperCase;
        }
        return "0x" + toUpperCase;
    }

    private String getServiceName() {
        TransportMetadata transportMetadata = getTransportMetadata();
        if (transportMetadata == null) {
            return "null";
        }
        return transportMetadata.getProviderName() + ' ' + transportMetadata.getName();
    }

    public IoService getService() {
        return this.service;
    }

    public static void notifyIdleness(Iterator<? extends IoSession> it, long j) {
        while (it.hasNext()) {
            IoSession ioSession = (IoSession) it.next();
            if (!ioSession.getCloseFuture().isClosed()) {
                notifyIdleSession(ioSession, j);
            }
        }
    }

    public static void notifyIdleSession(IoSession ioSession, long j) {
        notifyIdleSession0(ioSession, j, ioSession.getConfig().getIdleTimeInMillis(IdleStatus.BOTH_IDLE), IdleStatus.BOTH_IDLE, Math.max(ioSession.getLastIoTime(), ioSession.getLastIdleTime(IdleStatus.BOTH_IDLE)));
        notifyIdleSession0(ioSession, j, ioSession.getConfig().getIdleTimeInMillis(IdleStatus.READER_IDLE), IdleStatus.READER_IDLE, Math.max(ioSession.getLastReadTime(), ioSession.getLastIdleTime(IdleStatus.READER_IDLE)));
        notifyIdleSession0(ioSession, j, ioSession.getConfig().getIdleTimeInMillis(IdleStatus.WRITER_IDLE), IdleStatus.WRITER_IDLE, Math.max(ioSession.getLastWriteTime(), ioSession.getLastIdleTime(IdleStatus.WRITER_IDLE)));
        notifyWriteTimeout(ioSession, j);
    }

    private static void notifyIdleSession0(IoSession ioSession, long j, long j2, IdleStatus idleStatus, long j3) {
        if (j2 > 0 && j3 != 0 && j - j3 >= j2) {
            ioSession.getFilterChain().fireSessionIdle(idleStatus);
        }
    }

    private static void notifyWriteTimeout(IoSession ioSession, long j) {
        long writeTimeoutInMillis = ioSession.getConfig().getWriteTimeoutInMillis();
        if (writeTimeoutInMillis > 0 && j - ioSession.getLastWriteTime() >= writeTimeoutInMillis && !ioSession.getWriteRequestQueue().isEmpty(ioSession)) {
            WriteRequest currentWriteRequest = ioSession.getCurrentWriteRequest();
            if (currentWriteRequest != null) {
                ioSession.setCurrentWriteRequest(null);
                Throwable writeTimeoutException = new WriteTimeoutException(currentWriteRequest);
                currentWriteRequest.getFuture().setException(writeTimeoutException);
                ioSession.getFilterChain().fireExceptionCaught(writeTimeoutException);
                ioSession.closeNow();
            }
        }
    }
}
