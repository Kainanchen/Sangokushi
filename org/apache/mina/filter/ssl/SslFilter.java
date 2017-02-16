package org.apache.mina.filter.ssl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLSession;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.core.filterchain.IoFilterAdapter;
import org.apache.mina.core.filterchain.IoFilterChain;
import org.apache.mina.core.future.DefaultWriteFuture;
import org.apache.mina.core.future.IoFuture;
import org.apache.mina.core.future.IoFutureListener;
import org.apache.mina.core.future.WriteFuture;
import org.apache.mina.core.service.IoAcceptor;
import org.apache.mina.core.session.AttributeKey;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.write.WriteRequest;
import org.apache.mina.core.write.WriteRequestWrapper;
import org.apache.mina.core.write.WriteToClosedSessionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SslFilter extends IoFilterAdapter {
    public static final AttributeKey DISABLE_ENCRYPTION_ONCE;
    private static final Logger LOGGER;
    private static final AttributeKey NEXT_FILTER;
    public static final AttributeKey PEER_ADDRESS;
    public static final SslFilterMessage SESSION_SECURED;
    public static final SslFilterMessage SESSION_UNSECURED;
    private static final AttributeKey SSL_HANDLER;
    public static final AttributeKey SSL_SESSION;
    private static final boolean START_HANDSHAKE = true;
    public static final AttributeKey USE_NOTIFICATION;
    private final boolean autoStart;
    private boolean client;
    private String[] enabledCipherSuites;
    private String[] enabledProtocols;
    private boolean needClientAuth;
    final SSLContext sslContext;
    private boolean wantClientAuth;

    /* renamed from: org.apache.mina.filter.ssl.SslFilter.1 */
    class C04491 implements IoFutureListener<IoFuture> {
        final /* synthetic */ NextFilter val$nextFilter;
        final /* synthetic */ IoSession val$session;

        C04491(NextFilter nextFilter, IoSession ioSession) {
            this.val$nextFilter = nextFilter;
            this.val$session = ioSession;
        }

        public void operationComplete(IoFuture ioFuture) {
            this.val$nextFilter.filterClose(this.val$session);
        }
    }

    private static class EncryptedWriteRequest extends WriteRequestWrapper {
        private final IoBuffer encryptedMessage;

        private EncryptedWriteRequest(WriteRequest writeRequest, IoBuffer ioBuffer) {
            super(writeRequest);
            this.encryptedMessage = ioBuffer;
        }

        public Object getMessage() {
            return this.encryptedMessage;
        }
    }

    public static class SslFilterMessage {
        private final String name;

        private SslFilterMessage(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    static {
        LOGGER = LoggerFactory.getLogger(SslFilter.class);
        SSL_SESSION = new AttributeKey(SslFilter.class, "session");
        DISABLE_ENCRYPTION_ONCE = new AttributeKey(SslFilter.class, "disableOnce");
        USE_NOTIFICATION = new AttributeKey(SslFilter.class, "useNotification");
        PEER_ADDRESS = new AttributeKey(SslFilter.class, "peerAddress");
        SESSION_SECURED = new SslFilterMessage(null);
        SESSION_UNSECURED = new SslFilterMessage(null);
        NEXT_FILTER = new AttributeKey(SslFilter.class, "nextFilter");
        SSL_HANDLER = new AttributeKey(SslFilter.class, "handler");
    }

    public SslFilter(SSLContext sSLContext) {
        this(sSLContext, START_HANDSHAKE);
    }

    public SslFilter(SSLContext sSLContext, boolean z) {
        if (sSLContext == null) {
            throw new IllegalArgumentException("sslContext");
        }
        this.sslContext = sSLContext;
        this.autoStart = z;
    }

    public SSLSession getSslSession(IoSession ioSession) {
        return (SSLSession) ioSession.getAttribute(SSL_SESSION);
    }

    public boolean startSsl(IoSession ioSession) {
        SslHandler sslSessionHandler = getSslSessionHandler(ioSession);
        try {
            boolean z;
            synchronized (sslSessionHandler) {
                if (sslSessionHandler.isOutboundDone()) {
                    NextFilter nextFilter = (NextFilter) ioSession.getAttribute(NEXT_FILTER);
                    sslSessionHandler.destroy();
                    sslSessionHandler.init();
                    sslSessionHandler.handshake(nextFilter);
                    z = START_HANDSHAKE;
                } else {
                    z = false;
                }
            }
            sslSessionHandler.flushScheduledEvents();
            return z;
        } catch (SSLException e) {
            sslSessionHandler.release();
            throw e;
        }
    }

    String getSessionInfo(IoSession ioSession) {
        StringBuilder stringBuilder = new StringBuilder();
        if (ioSession.getService() instanceof IoAcceptor) {
            stringBuilder.append("Session Server");
        } else {
            stringBuilder.append("Session Client");
        }
        stringBuilder.append('[').append(ioSession.getId()).append(']');
        SslHandler sslHandler = (SslHandler) ioSession.getAttribute(SSL_HANDLER);
        if (sslHandler == null) {
            stringBuilder.append("(no sslEngine)");
        } else if (isSslStarted(ioSession)) {
            if (sslHandler.isHandshakeComplete()) {
                stringBuilder.append("(SSL)");
            } else {
                stringBuilder.append("(ssl...)");
            }
        }
        return stringBuilder.toString();
    }

    public boolean isSslStarted(IoSession ioSession) {
        boolean z = false;
        SslHandler sslHandler = (SslHandler) ioSession.getAttribute(SSL_HANDLER);
        if (sslHandler == null) {
            return false;
        }
        synchronized (sslHandler) {
            if (!sslHandler.isOutboundDone()) {
                z = START_HANDSHAKE;
            }
        }
        return z;
    }

    public WriteFuture stopSsl(IoSession ioSession) {
        SslHandler sslSessionHandler = getSslSessionHandler(ioSession);
        NextFilter nextFilter = (NextFilter) ioSession.getAttribute(NEXT_FILTER);
        try {
            WriteFuture initiateClosure;
            synchronized (sslSessionHandler) {
                initiateClosure = initiateClosure(nextFilter, ioSession);
            }
            sslSessionHandler.flushScheduledEvents();
            return initiateClosure;
        } catch (SSLException e) {
            sslSessionHandler.release();
            throw e;
        }
    }

    public boolean isUseClientMode() {
        return this.client;
    }

    public void setUseClientMode(boolean z) {
        this.client = z;
    }

    public boolean isNeedClientAuth() {
        return this.needClientAuth;
    }

    public void setNeedClientAuth(boolean z) {
        this.needClientAuth = z;
    }

    public boolean isWantClientAuth() {
        return this.wantClientAuth;
    }

    public void setWantClientAuth(boolean z) {
        this.wantClientAuth = z;
    }

    public String[] getEnabledCipherSuites() {
        return this.enabledCipherSuites;
    }

    public void setEnabledCipherSuites(String[] strArr) {
        this.enabledCipherSuites = strArr;
    }

    public String[] getEnabledProtocols() {
        return this.enabledProtocols;
    }

    public void setEnabledProtocols(String[] strArr) {
        this.enabledProtocols = strArr;
    }

    public void onPreAdd(IoFilterChain ioFilterChain, String str, NextFilter nextFilter) {
        if (ioFilterChain.contains(SslFilter.class)) {
            String str2 = "Only one SSL filter is permitted in a chain.";
            LOGGER.error(str2);
            throw new IllegalStateException(str2);
        }
        LOGGER.debug("Adding the SSL Filter {} to the chain", (Object) str);
        IoSession session = ioFilterChain.getSession();
        session.setAttribute(NEXT_FILTER, nextFilter);
        SslHandler sslHandler = new SslHandler(this, session);
        if (this.enabledCipherSuites == null || this.enabledCipherSuites.length == 0) {
            this.enabledCipherSuites = this.sslContext.getServerSocketFactory().getSupportedCipherSuites();
        }
        sslHandler.init();
        session.setAttribute(SSL_HANDLER, sslHandler);
    }

    public void onPostAdd(IoFilterChain ioFilterChain, String str, NextFilter nextFilter) {
        if (this.autoStart == START_HANDSHAKE) {
            initiateHandshake(nextFilter, ioFilterChain.getSession());
        }
    }

    public void onPreRemove(IoFilterChain ioFilterChain, String str, NextFilter nextFilter) {
        IoSession session = ioFilterChain.getSession();
        stopSsl(session);
        session.removeAttribute(NEXT_FILTER);
        session.removeAttribute(SSL_HANDLER);
    }

    public void sessionClosed(NextFilter nextFilter, IoSession ioSession) {
        SslHandler sslSessionHandler = getSslSessionHandler(ioSession);
        try {
            synchronized (sslSessionHandler) {
                sslSessionHandler.destroy();
            }
            nextFilter.sessionClosed(ioSession);
        } catch (Throwable th) {
            nextFilter.sessionClosed(ioSession);
        }
    }

    public void messageReceived(NextFilter nextFilter, IoSession ioSession, Object obj) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("{}: Message received : {}", getSessionInfo(ioSession), obj);
        }
        SslHandler sslSessionHandler = getSslSessionHandler(ioSession);
        synchronized (sslSessionHandler) {
            if (isSslStarted(ioSession) || !sslSessionHandler.isInboundDone()) {
                IoBuffer ioBuffer = (IoBuffer) obj;
                try {
                    sslSessionHandler.messageReceived(nextFilter, ioBuffer.buf());
                    handleSslData(nextFilter, sslSessionHandler);
                    if (sslSessionHandler.isInboundDone()) {
                        if (sslSessionHandler.isOutboundDone()) {
                            sslSessionHandler.destroy();
                        } else {
                            initiateClosure(nextFilter, ioSession);
                        }
                        if (ioBuffer.hasRemaining()) {
                            sslSessionHandler.scheduleMessageReceived(nextFilter, ioBuffer);
                        }
                    }
                } catch (Throwable e) {
                    if (sslSessionHandler.isHandshakeComplete()) {
                        sslSessionHandler.release();
                        Throwable th = e;
                    } else {
                        SSLException sSLHandshakeException = new SSLHandshakeException("SSL handshake failed.");
                        sSLHandshakeException.initCause(e);
                        ioSession.closeNow();
                    }
                    throw sSLHandshakeException;
                }
            }
            sslSessionHandler.scheduleMessageReceived(nextFilter, obj);
        }
        sslSessionHandler.flushScheduledEvents();
    }

    public void messageSent(NextFilter nextFilter, IoSession ioSession, WriteRequest writeRequest) {
        if (writeRequest instanceof EncryptedWriteRequest) {
            nextFilter.messageSent(ioSession, ((EncryptedWriteRequest) writeRequest).getParentRequest());
        }
    }

    public void exceptionCaught(NextFilter nextFilter, IoSession ioSession, Throwable th) {
        if (th instanceof WriteToClosedSessionException) {
            Object obj;
            List<WriteRequest> requests = ((WriteToClosedSessionException) th).getRequests();
            for (WriteRequest message : requests) {
                if (isCloseNotify(message.getMessage())) {
                    obj = 1;
                    break;
                }
            }
            obj = null;
            if (obj != null) {
                if (requests.size() != 1) {
                    Collection arrayList = new ArrayList(requests.size() - 1);
                    for (WriteRequest message2 : requests) {
                        if (!isCloseNotify(message2.getMessage())) {
                            arrayList.add(message2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        th = new WriteToClosedSessionException(arrayList, th.getMessage(), th.getCause());
                    } else {
                        return;
                    }
                }
                return;
            }
        }
        nextFilter.exceptionCaught(ioSession, th);
    }

    private boolean isCloseNotify(Object obj) {
        if (!(obj instanceof IoBuffer)) {
            return false;
        }
        IoBuffer ioBuffer = (IoBuffer) obj;
        int position = ioBuffer.position();
        if (ioBuffer.get(position + 0) != 21 || ioBuffer.get(position + 1) != (byte) 3) {
            return false;
        }
        if ((ioBuffer.get(position + 2) == null || ioBuffer.get(position + 2) == (byte) 1 || ioBuffer.get(position + 2) == 2 || ioBuffer.get(position + 2) == (byte) 3) && ioBuffer.get(position + 3) == null) {
            return START_HANDSHAKE;
        }
        return false;
    }

    public void filterWrite(NextFilter nextFilter, IoSession ioSession, WriteRequest writeRequest) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("{}: Writing Message : {}", getSessionInfo(ioSession), (Object) writeRequest);
        }
        SslHandler sslSessionHandler = getSslSessionHandler(ioSession);
        try {
            Object obj;
            synchronized (sslSessionHandler) {
                if (!isSslStarted(ioSession)) {
                    sslSessionHandler.scheduleFilterWrite(nextFilter, writeRequest);
                    obj = 1;
                } else if (ioSession.containsAttribute(DISABLE_ENCRYPTION_ONCE)) {
                    ioSession.removeAttribute(DISABLE_ENCRYPTION_ONCE);
                    sslSessionHandler.scheduleFilterWrite(nextFilter, writeRequest);
                    r0 = 1;
                } else {
                    IoBuffer ioBuffer = (IoBuffer) writeRequest.getMessage();
                    if (sslSessionHandler.isWritingEncryptedData()) {
                        sslSessionHandler.scheduleFilterWrite(nextFilter, writeRequest);
                        r0 = 1;
                    } else if (sslSessionHandler.isHandshakeComplete()) {
                        ioBuffer.mark();
                        sslSessionHandler.encrypt(ioBuffer.buf());
                        sslSessionHandler.scheduleFilterWrite(nextFilter, new EncryptedWriteRequest(sslSessionHandler.fetchOutNetBuffer(), null));
                        r0 = 1;
                    } else {
                        if (ioSession.isConnected()) {
                            sslSessionHandler.schedulePreHandshakeWriteRequest(nextFilter, writeRequest);
                        }
                        obj = null;
                    }
                }
            }
            if (obj != null) {
                sslSessionHandler.flushScheduledEvents();
            }
        } catch (SSLException e) {
            sslSessionHandler.release();
            throw e;
        }
    }

    public void filterClose(NextFilter nextFilter, IoSession ioSession) {
        SslHandler sslHandler = (SslHandler) ioSession.getAttribute(SSL_HANDLER);
        if (sslHandler == null) {
            nextFilter.filterClose(ioSession);
            return;
        }
        WriteFuture writeFuture = null;
        try {
            synchronized (sslHandler) {
                if (isSslStarted(ioSession)) {
                    writeFuture = initiateClosure(nextFilter, ioSession);
                    writeFuture.addListener(new C04491(nextFilter, ioSession));
                }
            }
            sslHandler.flushScheduledEvents();
            if (writeFuture == null) {
                nextFilter.filterClose(ioSession);
            }
        } catch (SSLException e) {
            try {
                sslHandler.release();
                throw e;
            } catch (Throwable th) {
                if (writeFuture == null) {
                    nextFilter.filterClose(ioSession);
                }
            }
        }
    }

    public void initiateHandshake(IoSession ioSession) {
        IoFilterChain filterChain = ioSession.getFilterChain();
        if (filterChain == null) {
            throw new SSLException("No filter chain");
        }
        NextFilter nextFilter = filterChain.getNextFilter(SslFilter.class);
        if (nextFilter == null) {
            throw new SSLException("No SSL next filter in the chain");
        }
        initiateHandshake(nextFilter, ioSession);
    }

    private void initiateHandshake(NextFilter nextFilter, IoSession ioSession) {
        LOGGER.debug("{} : Starting the first handshake", getSessionInfo(ioSession));
        SslHandler sslSessionHandler = getSslSessionHandler(ioSession);
        try {
            synchronized (sslSessionHandler) {
                sslSessionHandler.handshake(nextFilter);
            }
            sslSessionHandler.flushScheduledEvents();
        } catch (SSLException e) {
            sslSessionHandler.release();
            throw e;
        }
    }

    private WriteFuture initiateClosure(NextFilter nextFilter, IoSession ioSession) {
        SslHandler sslSessionHandler = getSslSessionHandler(ioSession);
        try {
            if (!sslSessionHandler.closeOutbound()) {
                return DefaultWriteFuture.newNotWrittenFuture(ioSession, new IllegalStateException("SSL session is shut down already."));
            }
            WriteFuture writeNetBuffer = sslSessionHandler.writeNetBuffer(nextFilter);
            if (writeNetBuffer == null) {
                writeNetBuffer = DefaultWriteFuture.newWrittenFuture(ioSession);
            }
            if (sslSessionHandler.isInboundDone()) {
                sslSessionHandler.destroy();
            }
            if (!ioSession.containsAttribute(USE_NOTIFICATION)) {
                return writeNetBuffer;
            }
            sslSessionHandler.scheduleMessageReceived(nextFilter, SESSION_UNSECURED);
            return writeNetBuffer;
        } catch (SSLException e) {
            sslSessionHandler.release();
            throw e;
        }
    }

    private void handleSslData(NextFilter nextFilter, SslHandler sslHandler) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("{}: Processing the SSL Data ", getSessionInfo(sslHandler.getSession()));
        }
        if (sslHandler.isHandshakeComplete()) {
            sslHandler.flushPreHandshakeEvents();
        }
        sslHandler.writeNetBuffer(nextFilter);
        handleAppDataRead(nextFilter, sslHandler);
    }

    private void handleAppDataRead(NextFilter nextFilter, SslHandler sslHandler) {
        IoBuffer fetchAppBuffer = sslHandler.fetchAppBuffer();
        if (fetchAppBuffer.hasRemaining()) {
            sslHandler.scheduleMessageReceived(nextFilter, fetchAppBuffer);
        }
    }

    private SslHandler getSslSessionHandler(IoSession ioSession) {
        SslHandler sslHandler = (SslHandler) ioSession.getAttribute(SSL_HANDLER);
        if (sslHandler == null) {
            throw new IllegalStateException();
        } else if (sslHandler.getSslFilter() == this) {
            return sslHandler;
        } else {
            throw new IllegalArgumentException("Not managed by this filter.");
        }
    }
}
