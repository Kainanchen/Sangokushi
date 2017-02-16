package org.apache.mina.filter.logging;

import net.sqlcipher.IBulkCursor;
import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.core.filterchain.IoFilterAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.write.WriteRequest;
import org.apache.mina.proxy.handlers.http.ntlm.NTLMConstants;
import org.apache.mina.proxy.handlers.socks.SocksProxyConstants;
import org.cocos2dx.lib.Cocos2dxHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingFilter extends IoFilterAdapter {
    private LogLevel exceptionCaughtLevel;
    private final Logger logger;
    private LogLevel messageReceivedLevel;
    private LogLevel messageSentLevel;
    private final String name;
    private LogLevel sessionClosedLevel;
    private LogLevel sessionCreatedLevel;
    private LogLevel sessionIdleLevel;
    private LogLevel sessionOpenedLevel;

    /* renamed from: org.apache.mina.filter.logging.LoggingFilter.1 */
    static /* synthetic */ class C04451 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$mina$filter$logging$LogLevel;

        static {
            $SwitchMap$org$apache$mina$filter$logging$LogLevel = new int[LogLevel.values().length];
            try {
                $SwitchMap$org$apache$mina$filter$logging$LogLevel[LogLevel.TRACE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$org$apache$mina$filter$logging$LogLevel[LogLevel.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$org$apache$mina$filter$logging$LogLevel[LogLevel.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$org$apache$mina$filter$logging$LogLevel[LogLevel.WARN.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$org$apache$mina$filter$logging$LogLevel[LogLevel.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
        }
    }

    public LoggingFilter() {
        this(LoggingFilter.class.getName());
    }

    public LoggingFilter(Class<?> cls) {
        this(cls.getName());
    }

    public LoggingFilter(String str) {
        this.exceptionCaughtLevel = LogLevel.WARN;
        this.messageSentLevel = LogLevel.INFO;
        this.messageReceivedLevel = LogLevel.INFO;
        this.sessionCreatedLevel = LogLevel.INFO;
        this.sessionOpenedLevel = LogLevel.INFO;
        this.sessionIdleLevel = LogLevel.INFO;
        this.sessionClosedLevel = LogLevel.INFO;
        if (str == null) {
            this.name = LoggingFilter.class.getName();
        } else {
            this.name = str;
        }
        this.logger = LoggerFactory.getLogger(this.name);
    }

    public String getName() {
        return this.name;
    }

    private void log(LogLevel logLevel, String str, Throwable th) {
        switch (C04451.$SwitchMap$org$apache$mina$filter$logging$LogLevel[logLevel.ordinal()]) {
            case Cocos2dxHandler.HANDLER_SHOW_DIALOG /*1*/:
                this.logger.trace(str, th);
            case SocksProxyConstants.SOCKS5_REQUEST_STEP /*2*/:
                this.logger.debug(str, th);
            case NTLMConstants.MESSAGE_TYPE_3 /*3*/:
                this.logger.info(str, th);
            case NTLMConstants.FLAG_REQUEST_SERVER_AUTH_REALM /*4*/:
                this.logger.warn(str, th);
            case IBulkCursor.DELETE_ROW_TRANSACTION /*5*/:
                this.logger.error(str, th);
            default:
        }
    }

    private void log(LogLevel logLevel, String str, Object obj) {
        switch (C04451.$SwitchMap$org$apache$mina$filter$logging$LogLevel[logLevel.ordinal()]) {
            case Cocos2dxHandler.HANDLER_SHOW_DIALOG /*1*/:
                this.logger.trace(str, obj);
            case SocksProxyConstants.SOCKS5_REQUEST_STEP /*2*/:
                this.logger.debug(str, obj);
            case NTLMConstants.MESSAGE_TYPE_3 /*3*/:
                this.logger.info(str, obj);
            case NTLMConstants.FLAG_REQUEST_SERVER_AUTH_REALM /*4*/:
                this.logger.warn(str, obj);
            case IBulkCursor.DELETE_ROW_TRANSACTION /*5*/:
                this.logger.error(str, obj);
            default:
        }
    }

    private void log(LogLevel logLevel, String str) {
        switch (C04451.$SwitchMap$org$apache$mina$filter$logging$LogLevel[logLevel.ordinal()]) {
            case Cocos2dxHandler.HANDLER_SHOW_DIALOG /*1*/:
                this.logger.trace(str);
            case SocksProxyConstants.SOCKS5_REQUEST_STEP /*2*/:
                this.logger.debug(str);
            case NTLMConstants.MESSAGE_TYPE_3 /*3*/:
                this.logger.info(str);
            case NTLMConstants.FLAG_REQUEST_SERVER_AUTH_REALM /*4*/:
                this.logger.warn(str);
            case IBulkCursor.DELETE_ROW_TRANSACTION /*5*/:
                this.logger.error(str);
            default:
        }
    }

    public void exceptionCaught(NextFilter nextFilter, IoSession ioSession, Throwable th) {
        log(this.exceptionCaughtLevel, "EXCEPTION :", th);
        nextFilter.exceptionCaught(ioSession, th);
    }

    public void messageReceived(NextFilter nextFilter, IoSession ioSession, Object obj) {
        log(this.messageReceivedLevel, "RECEIVED: {}", obj);
        nextFilter.messageReceived(ioSession, obj);
    }

    public void messageSent(NextFilter nextFilter, IoSession ioSession, WriteRequest writeRequest) {
        log(this.messageSentLevel, "SENT: {}", writeRequest.getOriginalRequest().getMessage());
        nextFilter.messageSent(ioSession, writeRequest);
    }

    public void sessionCreated(NextFilter nextFilter, IoSession ioSession) {
        log(this.sessionCreatedLevel, "CREATED");
        nextFilter.sessionCreated(ioSession);
    }

    public void sessionOpened(NextFilter nextFilter, IoSession ioSession) {
        log(this.sessionOpenedLevel, "OPENED");
        nextFilter.sessionOpened(ioSession);
    }

    public void sessionIdle(NextFilter nextFilter, IoSession ioSession, IdleStatus idleStatus) {
        log(this.sessionIdleLevel, "IDLE");
        nextFilter.sessionIdle(ioSession, idleStatus);
    }

    public void sessionClosed(NextFilter nextFilter, IoSession ioSession) {
        log(this.sessionClosedLevel, "CLOSED");
        nextFilter.sessionClosed(ioSession);
    }

    public void setExceptionCaughtLogLevel(LogLevel logLevel) {
        this.exceptionCaughtLevel = logLevel;
    }

    public LogLevel getExceptionCaughtLogLevel() {
        return this.exceptionCaughtLevel;
    }

    public void setMessageReceivedLogLevel(LogLevel logLevel) {
        this.messageReceivedLevel = logLevel;
    }

    public LogLevel getMessageReceivedLogLevel() {
        return this.messageReceivedLevel;
    }

    public void setMessageSentLogLevel(LogLevel logLevel) {
        this.messageSentLevel = logLevel;
    }

    public LogLevel getMessageSentLogLevel() {
        return this.messageSentLevel;
    }

    public void setSessionCreatedLogLevel(LogLevel logLevel) {
        this.sessionCreatedLevel = logLevel;
    }

    public LogLevel getSessionCreatedLogLevel() {
        return this.sessionCreatedLevel;
    }

    public void setSessionOpenedLogLevel(LogLevel logLevel) {
        this.sessionOpenedLevel = logLevel;
    }

    public LogLevel getSessionOpenedLogLevel() {
        return this.sessionOpenedLevel;
    }

    public void setSessionIdleLogLevel(LogLevel logLevel) {
        this.sessionIdleLevel = logLevel;
    }

    public LogLevel getSessionIdleLogLevel() {
        return this.sessionIdleLevel;
    }

    public void setSessionClosedLogLevel(LogLevel logLevel) {
        this.sessionClosedLevel = logLevel;
    }

    public LogLevel getSessionClosedLogLevel() {
        return this.sessionClosedLevel;
    }
}
