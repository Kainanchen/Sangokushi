package org.apache.mina.filter.ssl;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLEngineResult.HandshakeStatus;
import javax.net.ssl.SSLEngineResult.Status;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import net.sqlcipher.IBulkCursor;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.core.filterchain.IoFilterEvent;
import org.apache.mina.core.future.DefaultWriteFuture;
import org.apache.mina.core.future.WriteFuture;
import org.apache.mina.core.session.IoEventType;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.write.DefaultWriteRequest;
import org.apache.mina.core.write.WriteRequest;
import org.apache.mina.proxy.handlers.http.ntlm.NTLMConstants;
import org.apache.mina.proxy.handlers.socks.SocksProxyConstants;
import org.cocos2dx.lib.Cocos2dxHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class SslHandler {
    private static final Logger LOGGER;
    private IoBuffer appBuffer;
    private final IoBuffer emptyBuffer;
    private final Queue<IoFilterEvent> filterWriteEventQueue;
    private boolean firstSSLNegociation;
    private boolean handshakeComplete;
    private HandshakeStatus handshakeStatus;
    private IoBuffer inNetBuffer;
    private final Queue<IoFilterEvent> messageReceivedEventQueue;
    private IoBuffer outNetBuffer;
    private final Queue<IoFilterEvent> preHandshakeEventQueue;
    private final AtomicInteger scheduled_events;
    private final IoSession session;
    private SSLEngine sslEngine;
    private final SslFilter sslFilter;
    private ReentrantLock sslLock;
    private boolean writingEncryptedData;

    /* renamed from: org.apache.mina.filter.ssl.SslHandler.1 */
    static /* synthetic */ class C04501 {
        static final /* synthetic */ int[] $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus;

        static {
            $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus = new int[HandshakeStatus.values().length];
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[HandshakeStatus.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[HandshakeStatus.NEED_TASK.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[HandshakeStatus.NEED_UNWRAP.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[HandshakeStatus.NEED_WRAP.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
        }
    }

    static {
        LOGGER = LoggerFactory.getLogger(SslHandler.class);
    }

    SslHandler(SslFilter sslFilter, IoSession ioSession) {
        this.preHandshakeEventQueue = new ConcurrentLinkedQueue();
        this.filterWriteEventQueue = new ConcurrentLinkedQueue();
        this.messageReceivedEventQueue = new ConcurrentLinkedQueue();
        this.emptyBuffer = IoBuffer.allocate(0);
        this.sslLock = new ReentrantLock();
        this.scheduled_events = new AtomicInteger(0);
        this.sslFilter = sslFilter;
        this.session = ioSession;
    }

    void init() {
        if (this.sslEngine == null) {
            LOGGER.debug("{} Initializing the SSL Handler", this.sslFilter.getSessionInfo(this.session));
            InetSocketAddress inetSocketAddress = (InetSocketAddress) this.session.getAttribute(SslFilter.PEER_ADDRESS);
            if (inetSocketAddress == null) {
                this.sslEngine = this.sslFilter.sslContext.createSSLEngine();
            } else {
                this.sslEngine = this.sslFilter.sslContext.createSSLEngine(inetSocketAddress.getHostName(), inetSocketAddress.getPort());
            }
            this.sslEngine.setUseClientMode(this.sslFilter.isUseClientMode());
            if (!this.sslEngine.getUseClientMode()) {
                if (this.sslFilter.isWantClientAuth()) {
                    this.sslEngine.setWantClientAuth(true);
                }
                if (this.sslFilter.isNeedClientAuth()) {
                    this.sslEngine.setNeedClientAuth(true);
                }
            }
            if (this.sslFilter.getEnabledCipherSuites() != null) {
                this.sslEngine.setEnabledCipherSuites(this.sslFilter.getEnabledCipherSuites());
            }
            if (this.sslFilter.getEnabledProtocols() != null) {
                this.sslEngine.setEnabledProtocols(this.sslFilter.getEnabledProtocols());
            }
            this.sslEngine.beginHandshake();
            this.handshakeStatus = this.sslEngine.getHandshakeStatus();
            this.writingEncryptedData = false;
            this.firstSSLNegociation = true;
            this.handshakeComplete = false;
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("{} SSL Handler Initialization done.", this.sslFilter.getSessionInfo(this.session));
            }
        }
    }

    void destroy() {
        if (this.sslEngine != null) {
            try {
                this.sslEngine.closeInbound();
            } catch (Throwable e) {
                LOGGER.debug("Unexpected exception from SSLEngine.closeInbound().", e);
            }
            if (this.outNetBuffer != null) {
                this.outNetBuffer.capacity(this.sslEngine.getSession().getPacketBufferSize());
            } else {
                createOutNetBuffer(0);
            }
            while (true) {
                try {
                    this.outNetBuffer.clear();
                    if (this.sslEngine.wrap(this.emptyBuffer.buf(), this.outNetBuffer.buf()).bytesProduced() <= 0) {
                        break;
                    }
                } catch (SSLException e2) {
                } finally {
                    this.outNetBuffer.free();
                    this.outNetBuffer = null;
                }
            }
            this.sslEngine.closeOutbound();
            this.sslEngine = null;
            this.preHandshakeEventQueue.clear();
        }
    }

    SslFilter getSslFilter() {
        return this.sslFilter;
    }

    IoSession getSession() {
        return this.session;
    }

    boolean isWritingEncryptedData() {
        return this.writingEncryptedData;
    }

    boolean isHandshakeComplete() {
        return this.handshakeComplete;
    }

    boolean isInboundDone() {
        return this.sslEngine == null || this.sslEngine.isInboundDone();
    }

    boolean isOutboundDone() {
        return this.sslEngine == null || this.sslEngine.isOutboundDone();
    }

    boolean needToCompleteHandshake() {
        return this.handshakeStatus == HandshakeStatus.NEED_WRAP && !isInboundDone();
    }

    void schedulePreHandshakeWriteRequest(NextFilter nextFilter, WriteRequest writeRequest) {
        this.preHandshakeEventQueue.add(new IoFilterEvent(nextFilter, IoEventType.WRITE, this.session, writeRequest));
    }

    void flushPreHandshakeEvents() {
        while (true) {
            IoFilterEvent ioFilterEvent = (IoFilterEvent) this.preHandshakeEventQueue.poll();
            if (ioFilterEvent != null) {
                this.sslFilter.filterWrite(ioFilterEvent.getNextFilter(), this.session, (WriteRequest) ioFilterEvent.getParameter());
            } else {
                return;
            }
        }
    }

    void scheduleFilterWrite(NextFilter nextFilter, WriteRequest writeRequest) {
        this.filterWriteEventQueue.add(new IoFilterEvent(nextFilter, IoEventType.WRITE, this.session, writeRequest));
    }

    void scheduleMessageReceived(NextFilter nextFilter, Object obj) {
        this.messageReceivedEventQueue.add(new IoFilterEvent(nextFilter, IoEventType.MESSAGE_RECEIVED, this.session, obj));
    }

    void flushScheduledEvents() {
        this.scheduled_events.incrementAndGet();
        if (this.sslLock.tryLock()) {
            while (true) {
                try {
                    IoFilterEvent ioFilterEvent = (IoFilterEvent) this.filterWriteEventQueue.poll();
                    if (ioFilterEvent != null) {
                        ioFilterEvent.getNextFilter().filterWrite(this.session, (WriteRequest) ioFilterEvent.getParameter());
                    } else {
                        while (true) {
                            ioFilterEvent = (IoFilterEvent) this.messageReceivedEventQueue.poll();
                            if (ioFilterEvent == null) {
                                break;
                            }
                            ioFilterEvent.getNextFilter().messageReceived(this.session, ioFilterEvent.getParameter());
                        }
                        if (this.scheduled_events.decrementAndGet() <= 0) {
                            break;
                        }
                    }
                } finally {
                    this.sslLock.unlock();
                }
            }
        }
    }

    void messageReceived(NextFilter nextFilter, ByteBuffer byteBuffer) {
        if (LOGGER.isDebugEnabled()) {
            isOutboundDone();
            LOGGER.debug("{} Processing the received message", this.sslFilter.getSessionInfo(this.session));
        }
        if (this.inNetBuffer == null) {
            this.inNetBuffer = IoBuffer.allocate(byteBuffer.remaining()).setAutoExpand(true);
        }
        this.inNetBuffer.put(byteBuffer);
        if (this.handshakeComplete) {
            this.inNetBuffer.flip();
            if (this.inNetBuffer.hasRemaining()) {
                SSLEngineResult unwrap = unwrap();
                if (this.inNetBuffer.hasRemaining()) {
                    this.inNetBuffer.compact();
                } else {
                    this.inNetBuffer.free();
                    this.inNetBuffer = null;
                }
                checkStatus(unwrap);
                renegotiateIfNeeded(nextFilter, unwrap);
            } else {
                return;
            }
        }
        handshake(nextFilter);
        if (isInboundDone()) {
            byteBuffer.position(byteBuffer.position() - (this.inNetBuffer == null ? 0 : this.inNetBuffer.position()));
            if (this.inNetBuffer != null) {
                this.inNetBuffer.free();
                this.inNetBuffer = null;
            }
        }
    }

    IoBuffer fetchAppBuffer() {
        if (this.appBuffer == null) {
            return IoBuffer.allocate(0);
        }
        IoBuffer flip = this.appBuffer.flip();
        this.appBuffer = null;
        return flip.shrink();
    }

    IoBuffer fetchOutNetBuffer() {
        IoBuffer ioBuffer = this.outNetBuffer;
        if (ioBuffer == null) {
            return this.emptyBuffer;
        }
        this.outNetBuffer = null;
        return ioBuffer.shrink();
    }

    void encrypt(ByteBuffer byteBuffer) {
        if (!this.handshakeComplete) {
            throw new IllegalStateException();
        } else if (byteBuffer.hasRemaining()) {
            createOutNetBuffer(byteBuffer.remaining());
            while (byteBuffer.hasRemaining()) {
                SSLEngineResult wrap = this.sslEngine.wrap(byteBuffer, this.outNetBuffer.buf());
                if (wrap.getStatus() == Status.OK) {
                    if (wrap.getHandshakeStatus() == HandshakeStatus.NEED_TASK) {
                        doTasks();
                    }
                } else if (wrap.getStatus() == Status.BUFFER_OVERFLOW) {
                    this.outNetBuffer.capacity(this.outNetBuffer.capacity() << 1);
                    this.outNetBuffer.limit(this.outNetBuffer.capacity());
                } else {
                    throw new SSLException("SSLEngine error during encrypt: " + wrap.getStatus() + " src: " + byteBuffer + "outNetBuffer: " + this.outNetBuffer);
                }
            }
            this.outNetBuffer.flip();
        } else if (this.outNetBuffer == null) {
            this.outNetBuffer = this.emptyBuffer;
        }
    }

    boolean closeOutbound() {
        if (this.sslEngine == null || this.sslEngine.isOutboundDone()) {
            return false;
        }
        this.sslEngine.closeOutbound();
        createOutNetBuffer(0);
        while (true) {
            SSLEngineResult wrap = this.sslEngine.wrap(this.emptyBuffer.buf(), this.outNetBuffer.buf());
            if (wrap.getStatus() != Status.BUFFER_OVERFLOW) {
                break;
            }
            this.outNetBuffer.capacity(this.outNetBuffer.capacity() << 1);
            this.outNetBuffer.limit(this.outNetBuffer.capacity());
        }
        if (wrap.getStatus() != Status.CLOSED) {
            throw new SSLException("Improper close state: " + wrap);
        }
        this.outNetBuffer.flip();
        return true;
    }

    private void checkStatus(SSLEngineResult sSLEngineResult) {
        Status status = sSLEngineResult.getStatus();
        if (status == Status.BUFFER_OVERFLOW) {
            throw new SSLException("SSLEngine error during decrypt: " + status + " inNetBuffer: " + this.inNetBuffer + "appBuffer: " + this.appBuffer);
        }
    }

    void handshake(NextFilter nextFilter) {
        while (true) {
            switch (C04501.$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[this.handshakeStatus.ordinal()]) {
                case Cocos2dxHandler.HANDLER_SHOW_DIALOG /*1*/:
                case SocksProxyConstants.SOCKS5_REQUEST_STEP /*2*/:
                    if (LOGGER.isDebugEnabled()) {
                        LOGGER.debug("{} processing the FINISHED state", this.sslFilter.getSessionInfo(this.session));
                    }
                    this.session.setAttribute(SslFilter.SSL_SESSION, this.sslEngine.getSession());
                    this.handshakeComplete = true;
                    if (this.firstSSLNegociation && this.session.containsAttribute(SslFilter.USE_NOTIFICATION)) {
                        this.firstSSLNegociation = false;
                        scheduleMessageReceived(nextFilter, SslFilter.SESSION_SECURED);
                    }
                    if (!LOGGER.isDebugEnabled()) {
                        return;
                    }
                    if (isOutboundDone()) {
                        LOGGER.debug("{} is not secured yet", this.sslFilter.getSessionInfo(this.session));
                        return;
                    } else {
                        LOGGER.debug("{} is now secured", this.sslFilter.getSessionInfo(this.session));
                        return;
                    }
                case NTLMConstants.MESSAGE_TYPE_3 /*3*/:
                    if (LOGGER.isDebugEnabled()) {
                        LOGGER.debug("{} processing the NEED_TASK state", this.sslFilter.getSessionInfo(this.session));
                    }
                    this.handshakeStatus = doTasks();
                    break;
                case NTLMConstants.FLAG_REQUEST_SERVER_AUTH_REALM /*4*/:
                    if (LOGGER.isDebugEnabled()) {
                        LOGGER.debug("{} processing the NEED_UNWRAP state", this.sslFilter.getSessionInfo(this.session));
                    }
                    if (unwrapHandshake(nextFilter) != Status.BUFFER_UNDERFLOW || this.handshakeStatus == HandshakeStatus.FINISHED) {
                        if (!isInboundDone()) {
                            break;
                        }
                        return;
                    }
                    return;
                    break;
                case IBulkCursor.DELETE_ROW_TRANSACTION /*5*/:
                    if (LOGGER.isDebugEnabled()) {
                        LOGGER.debug("{} processing the NEED_WRAP state", this.sslFilter.getSessionInfo(this.session));
                    }
                    if (this.outNetBuffer == null || !this.outNetBuffer.hasRemaining()) {
                        createOutNetBuffer(0);
                        while (true) {
                            SSLEngineResult wrap = this.sslEngine.wrap(this.emptyBuffer.buf(), this.outNetBuffer.buf());
                            if (wrap.getStatus() != Status.BUFFER_OVERFLOW) {
                                this.outNetBuffer.flip();
                                this.handshakeStatus = wrap.getHandshakeStatus();
                                writeNetBuffer(nextFilter);
                                break;
                            }
                            this.outNetBuffer.capacity(this.outNetBuffer.capacity() << 1);
                            this.outNetBuffer.limit(this.outNetBuffer.capacity());
                        }
                    } else {
                        return;
                    }
                    break;
                default:
                    String str = "Invalid Handshaking State" + this.handshakeStatus + " while processing the Handshake for session " + this.session.getId();
                    LOGGER.error(str);
                    throw new IllegalStateException(str);
            }
        }
    }

    private void createOutNetBuffer(int i) {
        int max = Math.max(i, this.sslEngine.getSession().getPacketBufferSize());
        if (this.outNetBuffer != null) {
            this.outNetBuffer.capacity(max);
        } else {
            this.outNetBuffer = IoBuffer.allocate(max).minimumCapacity(0);
        }
    }

    WriteFuture writeNetBuffer(NextFilter nextFilter) {
        if (this.outNetBuffer == null || !this.outNetBuffer.hasRemaining()) {
            return null;
        }
        this.writingEncryptedData = true;
        try {
            IoBuffer fetchOutNetBuffer = fetchOutNetBuffer();
            WriteFuture defaultWriteFuture = new DefaultWriteFuture(this.session);
            this.sslFilter.filterWrite(nextFilter, this.session, new DefaultWriteRequest(fetchOutNetBuffer, defaultWriteFuture));
            while (needToCompleteHandshake()) {
                handshake(nextFilter);
                fetchOutNetBuffer = fetchOutNetBuffer();
                if (fetchOutNetBuffer != null && fetchOutNetBuffer.hasRemaining()) {
                    defaultWriteFuture = new DefaultWriteFuture(this.session);
                    this.sslFilter.filterWrite(nextFilter, this.session, new DefaultWriteRequest(fetchOutNetBuffer, defaultWriteFuture));
                }
            }
            this.writingEncryptedData = false;
            return defaultWriteFuture;
        } catch (Throwable e) {
            SSLException sSLHandshakeException = new SSLHandshakeException("SSL handshake failed.");
            sSLHandshakeException.initCause(e);
            throw sSLHandshakeException;
        } catch (Throwable th) {
            this.writingEncryptedData = false;
        }
    }

    private Status unwrapHandshake(NextFilter nextFilter) {
        if (this.inNetBuffer != null) {
            this.inNetBuffer.flip();
        }
        if (this.inNetBuffer == null || !this.inNetBuffer.hasRemaining()) {
            return Status.BUFFER_UNDERFLOW;
        }
        SSLEngineResult unwrap = unwrap();
        this.handshakeStatus = unwrap.getHandshakeStatus();
        checkStatus(unwrap);
        if (this.handshakeStatus == HandshakeStatus.FINISHED && unwrap.getStatus() == Status.OK && this.inNetBuffer.hasRemaining()) {
            unwrap = unwrap();
            if (this.inNetBuffer.hasRemaining()) {
                this.inNetBuffer.compact();
            } else {
                this.inNetBuffer.free();
                this.inNetBuffer = null;
            }
            renegotiateIfNeeded(nextFilter, unwrap);
        } else if (this.inNetBuffer.hasRemaining()) {
            this.inNetBuffer.compact();
        } else {
            this.inNetBuffer.free();
            this.inNetBuffer = null;
        }
        return unwrap.getStatus();
    }

    private void renegotiateIfNeeded(NextFilter nextFilter, SSLEngineResult sSLEngineResult) {
        if (sSLEngineResult.getStatus() != Status.CLOSED && sSLEngineResult.getStatus() != Status.BUFFER_UNDERFLOW && sSLEngineResult.getHandshakeStatus() != HandshakeStatus.NOT_HANDSHAKING) {
            this.handshakeComplete = false;
            this.handshakeStatus = sSLEngineResult.getHandshakeStatus();
            handshake(nextFilter);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private javax.net.ssl.SSLEngineResult unwrap() {
        /*
        r5 = this;
        r0 = r5.appBuffer;
        if (r0 != 0) goto L_0x0048;
    L_0x0004:
        r0 = r5.inNetBuffer;
        r0 = r0.remaining();
        r0 = org.apache.mina.core.buffer.IoBuffer.allocate(r0);
        r5.appBuffer = r0;
    L_0x0010:
        r0 = r5.sslEngine;
        r1 = r5.inNetBuffer;
        r1 = r1.buf();
        r2 = r5.appBuffer;
        r2 = r2.buf();
        r0 = r0.unwrap(r1, r2);
        r1 = r0.getStatus();
        r2 = r0.getHandshakeStatus();
        r3 = javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW;
        if (r1 != r3) goto L_0x0059;
    L_0x002e:
        r3 = r5.sslEngine;
        r3 = r3.getSession();
        r3 = r3.getApplicationBufferSize();
        r4 = r5.appBuffer;
        r4 = r4.remaining();
        if (r4 < r3) goto L_0x0054;
    L_0x0040:
        r0 = new javax.net.ssl.SSLException;
        r1 = "SSL buffer overflow";
        r0.<init>(r1);
        throw r0;
    L_0x0048:
        r0 = r5.appBuffer;
        r1 = r5.inNetBuffer;
        r1 = r1.remaining();
        r0.expand(r1);
        goto L_0x0010;
    L_0x0054:
        r4 = r5.appBuffer;
        r4.expand(r3);
    L_0x0059:
        r3 = javax.net.ssl.SSLEngineResult.Status.OK;
        if (r1 == r3) goto L_0x0061;
    L_0x005d:
        r3 = javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW;
        if (r1 != r3) goto L_0x0069;
    L_0x0061:
        r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
        if (r2 == r1) goto L_0x0010;
    L_0x0065:
        r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_UNWRAP;
        if (r2 == r1) goto L_0x0010;
    L_0x0069:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.mina.filter.ssl.SslHandler.unwrap():javax.net.ssl.SSLEngineResult");
    }

    private HandshakeStatus doTasks() {
        while (true) {
            Runnable delegatedTask = this.sslEngine.getDelegatedTask();
            if (delegatedTask == null) {
                return this.sslEngine.getHandshakeStatus();
            }
            delegatedTask.run();
        }
    }

    static IoBuffer copy(ByteBuffer byteBuffer) {
        IoBuffer allocate = IoBuffer.allocate(byteBuffer.remaining());
        allocate.put(byteBuffer);
        allocate.flip();
        return allocate;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SSLStatus <");
        if (this.handshakeComplete) {
            stringBuilder.append("SSL established");
        } else {
            stringBuilder.append("Processing Handshake; ");
            stringBuilder.append("Status : ").append(this.handshakeStatus).append("; ");
        }
        stringBuilder.append(", ");
        stringBuilder.append("HandshakeComplete :").append(this.handshakeComplete).append(", ");
        stringBuilder.append(">");
        return stringBuilder.toString();
    }

    void release() {
        if (this.inNetBuffer != null) {
            this.inNetBuffer.free();
            this.inNetBuffer = null;
        }
        if (this.outNetBuffer != null) {
            this.outNetBuffer.free();
            this.outNetBuffer = null;
        }
    }
}
