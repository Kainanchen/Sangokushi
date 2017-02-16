package org.apache.mina.filter.statistic;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import net.sqlcipher.IBulkCursor;
import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.core.filterchain.IoFilterAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoEventType;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.write.WriteRequest;
import org.apache.mina.proxy.handlers.http.ntlm.NTLMConstants;
import org.apache.mina.proxy.handlers.socks.SocksProxyConstants;
import org.cocos2dx.lib.Cocos2dxHandler;

public class ProfilerTimerFilter extends IoFilterAdapter {
    private TimerWorker messageReceivedTimerWorker;
    private TimerWorker messageSentTimerWorker;
    private boolean profileMessageReceived;
    private boolean profileMessageSent;
    private boolean profileSessionClosed;
    private boolean profileSessionCreated;
    private boolean profileSessionIdle;
    private boolean profileSessionOpened;
    private TimerWorker sessionClosedTimerWorker;
    private TimerWorker sessionCreatedTimerWorker;
    private TimerWorker sessionIdleTimerWorker;
    private TimerWorker sessionOpenedTimerWorker;
    private volatile TimeUnit timeUnit;

    /* renamed from: org.apache.mina.filter.statistic.ProfilerTimerFilter.1 */
    static /* synthetic */ class C04511 {
        static final /* synthetic */ int[] $SwitchMap$java$util$concurrent$TimeUnit;
        static final /* synthetic */ int[] $SwitchMap$org$apache$mina$core$session$IoEventType;

        static {
            $SwitchMap$java$util$concurrent$TimeUnit = new int[TimeUnit.values().length];
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.NANOSECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $SwitchMap$org$apache$mina$core$session$IoEventType = new int[IoEventType.values().length];
            try {
                $SwitchMap$org$apache$mina$core$session$IoEventType[IoEventType.MESSAGE_RECEIVED.ordinal()] = 1;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$org$apache$mina$core$session$IoEventType[IoEventType.MESSAGE_SENT.ordinal()] = 2;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$org$apache$mina$core$session$IoEventType[IoEventType.SESSION_CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError e6) {
            }
            try {
                $SwitchMap$org$apache$mina$core$session$IoEventType[IoEventType.SESSION_OPENED.ordinal()] = 4;
            } catch (NoSuchFieldError e7) {
            }
            try {
                $SwitchMap$org$apache$mina$core$session$IoEventType[IoEventType.SESSION_IDLE.ordinal()] = 5;
            } catch (NoSuchFieldError e8) {
            }
            try {
                $SwitchMap$org$apache$mina$core$session$IoEventType[IoEventType.SESSION_CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError e9) {
            }
        }
    }

    private class TimerWorker {
        private final AtomicLong callsNumber;
        private final Object lock;
        private final AtomicLong maximum;
        private final AtomicLong minimum;
        private final AtomicLong total;

        public TimerWorker() {
            this.lock = new Object();
            this.total = new AtomicLong();
            this.callsNumber = new AtomicLong();
            this.minimum = new AtomicLong();
            this.maximum = new AtomicLong();
        }

        public void addNewDuration(long j) {
            this.callsNumber.incrementAndGet();
            this.total.addAndGet(j);
            synchronized (this.lock) {
                if (j < this.minimum.longValue()) {
                    this.minimum.set(j);
                }
                if (j > this.maximum.longValue()) {
                    this.maximum.set(j);
                }
            }
        }

        public double getAverage() {
            double longValue;
            synchronized (this.lock) {
                longValue = (double) (this.total.longValue() / this.callsNumber.longValue());
            }
            return longValue;
        }

        public long getCallsNumber() {
            return this.callsNumber.longValue();
        }

        public long getTotal() {
            return this.total.longValue();
        }

        public long getMinimum() {
            return this.minimum.longValue();
        }

        public long getMaximum() {
            return this.maximum.longValue();
        }
    }

    public ProfilerTimerFilter() {
        this(TimeUnit.MILLISECONDS, IoEventType.MESSAGE_RECEIVED, IoEventType.MESSAGE_SENT);
    }

    public ProfilerTimerFilter(TimeUnit timeUnit) {
        this(timeUnit, IoEventType.MESSAGE_RECEIVED, IoEventType.MESSAGE_SENT);
    }

    public ProfilerTimerFilter(TimeUnit timeUnit, IoEventType... ioEventTypeArr) {
        this.profileMessageReceived = false;
        this.profileMessageSent = false;
        this.profileSessionCreated = false;
        this.profileSessionOpened = false;
        this.profileSessionIdle = false;
        this.profileSessionClosed = false;
        this.timeUnit = timeUnit;
        setProfilers(ioEventTypeArr);
    }

    private void setProfilers(IoEventType... ioEventTypeArr) {
        for (IoEventType ordinal : ioEventTypeArr) {
            switch (C04511.$SwitchMap$org$apache$mina$core$session$IoEventType[ordinal.ordinal()]) {
                case Cocos2dxHandler.HANDLER_SHOW_DIALOG /*1*/:
                    this.messageReceivedTimerWorker = new TimerWorker();
                    this.profileMessageReceived = true;
                    break;
                case SocksProxyConstants.SOCKS5_REQUEST_STEP /*2*/:
                    this.messageSentTimerWorker = new TimerWorker();
                    this.profileMessageSent = true;
                    break;
                case NTLMConstants.MESSAGE_TYPE_3 /*3*/:
                    this.sessionCreatedTimerWorker = new TimerWorker();
                    this.profileSessionCreated = true;
                    break;
                case NTLMConstants.FLAG_REQUEST_SERVER_AUTH_REALM /*4*/:
                    this.sessionOpenedTimerWorker = new TimerWorker();
                    this.profileSessionOpened = true;
                    break;
                case IBulkCursor.DELETE_ROW_TRANSACTION /*5*/:
                    this.sessionIdleTimerWorker = new TimerWorker();
                    this.profileSessionIdle = true;
                    break;
                case IBulkCursor.DEACTIVATE_TRANSACTION /*6*/:
                    this.sessionClosedTimerWorker = new TimerWorker();
                    this.profileSessionClosed = true;
                    break;
                default:
                    break;
            }
        }
    }

    public void setTimeUnit(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public void profile(IoEventType ioEventType) {
        switch (C04511.$SwitchMap$org$apache$mina$core$session$IoEventType[ioEventType.ordinal()]) {
            case Cocos2dxHandler.HANDLER_SHOW_DIALOG /*1*/:
                this.profileMessageReceived = true;
                if (this.messageReceivedTimerWorker == null) {
                    this.messageReceivedTimerWorker = new TimerWorker();
                }
            case SocksProxyConstants.SOCKS5_REQUEST_STEP /*2*/:
                this.profileMessageSent = true;
                if (this.messageSentTimerWorker == null) {
                    this.messageSentTimerWorker = new TimerWorker();
                }
            case NTLMConstants.MESSAGE_TYPE_3 /*3*/:
                this.profileSessionCreated = true;
                if (this.sessionCreatedTimerWorker == null) {
                    this.sessionCreatedTimerWorker = new TimerWorker();
                }
            case NTLMConstants.FLAG_REQUEST_SERVER_AUTH_REALM /*4*/:
                this.profileSessionOpened = true;
                if (this.sessionOpenedTimerWorker == null) {
                    this.sessionOpenedTimerWorker = new TimerWorker();
                }
            case IBulkCursor.DELETE_ROW_TRANSACTION /*5*/:
                this.profileSessionIdle = true;
                if (this.sessionIdleTimerWorker == null) {
                    this.sessionIdleTimerWorker = new TimerWorker();
                }
            case IBulkCursor.DEACTIVATE_TRANSACTION /*6*/:
                this.profileSessionClosed = true;
                if (this.sessionClosedTimerWorker == null) {
                    this.sessionClosedTimerWorker = new TimerWorker();
                }
            default:
        }
    }

    public void stopProfile(IoEventType ioEventType) {
        switch (C04511.$SwitchMap$org$apache$mina$core$session$IoEventType[ioEventType.ordinal()]) {
            case Cocos2dxHandler.HANDLER_SHOW_DIALOG /*1*/:
                this.profileMessageReceived = false;
            case SocksProxyConstants.SOCKS5_REQUEST_STEP /*2*/:
                this.profileMessageSent = false;
            case NTLMConstants.MESSAGE_TYPE_3 /*3*/:
                this.profileSessionCreated = false;
            case NTLMConstants.FLAG_REQUEST_SERVER_AUTH_REALM /*4*/:
                this.profileSessionOpened = false;
            case IBulkCursor.DELETE_ROW_TRANSACTION /*5*/:
                this.profileSessionIdle = false;
            case IBulkCursor.DEACTIVATE_TRANSACTION /*6*/:
                this.profileSessionClosed = false;
            default:
        }
    }

    public Set<IoEventType> getEventsToProfile() {
        Set<IoEventType> hashSet = new HashSet();
        if (this.profileMessageReceived) {
            hashSet.add(IoEventType.MESSAGE_RECEIVED);
        }
        if (this.profileMessageSent) {
            hashSet.add(IoEventType.MESSAGE_SENT);
        }
        if (this.profileSessionCreated) {
            hashSet.add(IoEventType.SESSION_CREATED);
        }
        if (this.profileSessionOpened) {
            hashSet.add(IoEventType.SESSION_OPENED);
        }
        if (this.profileSessionIdle) {
            hashSet.add(IoEventType.SESSION_IDLE);
        }
        if (this.profileSessionClosed) {
            hashSet.add(IoEventType.SESSION_CLOSED);
        }
        return hashSet;
    }

    public void setEventsToProfile(IoEventType... ioEventTypeArr) {
        setProfilers(ioEventTypeArr);
    }

    public void messageReceived(NextFilter nextFilter, IoSession ioSession, Object obj) {
        if (this.profileMessageReceived) {
            long timeNow = timeNow();
            nextFilter.messageReceived(ioSession, obj);
            this.messageReceivedTimerWorker.addNewDuration(timeNow() - timeNow);
            return;
        }
        nextFilter.messageReceived(ioSession, obj);
    }

    public void messageSent(NextFilter nextFilter, IoSession ioSession, WriteRequest writeRequest) {
        if (this.profileMessageSent) {
            long timeNow = timeNow();
            nextFilter.messageSent(ioSession, writeRequest);
            this.messageSentTimerWorker.addNewDuration(timeNow() - timeNow);
            return;
        }
        nextFilter.messageSent(ioSession, writeRequest);
    }

    public void sessionCreated(NextFilter nextFilter, IoSession ioSession) {
        if (this.profileSessionCreated) {
            long timeNow = timeNow();
            nextFilter.sessionCreated(ioSession);
            this.sessionCreatedTimerWorker.addNewDuration(timeNow() - timeNow);
            return;
        }
        nextFilter.sessionCreated(ioSession);
    }

    public void sessionOpened(NextFilter nextFilter, IoSession ioSession) {
        if (this.profileSessionOpened) {
            long timeNow = timeNow();
            nextFilter.sessionOpened(ioSession);
            this.sessionOpenedTimerWorker.addNewDuration(timeNow() - timeNow);
            return;
        }
        nextFilter.sessionOpened(ioSession);
    }

    public void sessionIdle(NextFilter nextFilter, IoSession ioSession, IdleStatus idleStatus) {
        if (this.profileSessionIdle) {
            long timeNow = timeNow();
            nextFilter.sessionIdle(ioSession, idleStatus);
            this.sessionIdleTimerWorker.addNewDuration(timeNow() - timeNow);
            return;
        }
        nextFilter.sessionIdle(ioSession, idleStatus);
    }

    public void sessionClosed(NextFilter nextFilter, IoSession ioSession) {
        if (this.profileSessionClosed) {
            long timeNow = timeNow();
            nextFilter.sessionClosed(ioSession);
            this.sessionClosedTimerWorker.addNewDuration(timeNow() - timeNow);
            return;
        }
        nextFilter.sessionClosed(ioSession);
    }

    public double getAverageTime(IoEventType ioEventType) {
        switch (C04511.$SwitchMap$org$apache$mina$core$session$IoEventType[ioEventType.ordinal()]) {
            case Cocos2dxHandler.HANDLER_SHOW_DIALOG /*1*/:
                if (this.profileMessageReceived) {
                    return this.messageReceivedTimerWorker.getAverage();
                }
                break;
            case SocksProxyConstants.SOCKS5_REQUEST_STEP /*2*/:
                if (this.profileMessageSent) {
                    return this.messageSentTimerWorker.getAverage();
                }
                break;
            case NTLMConstants.MESSAGE_TYPE_3 /*3*/:
                if (this.profileSessionCreated) {
                    return this.sessionCreatedTimerWorker.getAverage();
                }
                break;
            case NTLMConstants.FLAG_REQUEST_SERVER_AUTH_REALM /*4*/:
                if (this.profileSessionOpened) {
                    return this.sessionOpenedTimerWorker.getAverage();
                }
                break;
            case IBulkCursor.DELETE_ROW_TRANSACTION /*5*/:
                if (this.profileSessionIdle) {
                    return this.sessionIdleTimerWorker.getAverage();
                }
                break;
            case IBulkCursor.DEACTIVATE_TRANSACTION /*6*/:
                if (this.profileSessionClosed) {
                    return this.sessionClosedTimerWorker.getAverage();
                }
                break;
        }
        throw new IllegalArgumentException("You are not monitoring this event.  Please add this event first.");
    }

    public long getTotalCalls(IoEventType ioEventType) {
        switch (C04511.$SwitchMap$org$apache$mina$core$session$IoEventType[ioEventType.ordinal()]) {
            case Cocos2dxHandler.HANDLER_SHOW_DIALOG /*1*/:
                if (this.profileMessageReceived) {
                    return this.messageReceivedTimerWorker.getCallsNumber();
                }
                break;
            case SocksProxyConstants.SOCKS5_REQUEST_STEP /*2*/:
                if (this.profileMessageSent) {
                    return this.messageSentTimerWorker.getCallsNumber();
                }
                break;
            case NTLMConstants.MESSAGE_TYPE_3 /*3*/:
                if (this.profileSessionCreated) {
                    return this.sessionCreatedTimerWorker.getCallsNumber();
                }
                break;
            case NTLMConstants.FLAG_REQUEST_SERVER_AUTH_REALM /*4*/:
                if (this.profileSessionOpened) {
                    return this.sessionOpenedTimerWorker.getCallsNumber();
                }
                break;
            case IBulkCursor.DELETE_ROW_TRANSACTION /*5*/:
                if (this.profileSessionIdle) {
                    return this.sessionIdleTimerWorker.getCallsNumber();
                }
                break;
            case IBulkCursor.DEACTIVATE_TRANSACTION /*6*/:
                if (this.profileSessionClosed) {
                    return this.sessionClosedTimerWorker.getCallsNumber();
                }
                break;
        }
        throw new IllegalArgumentException("You are not monitoring this event.  Please add this event first.");
    }

    public long getTotalTime(IoEventType ioEventType) {
        switch (C04511.$SwitchMap$org$apache$mina$core$session$IoEventType[ioEventType.ordinal()]) {
            case Cocos2dxHandler.HANDLER_SHOW_DIALOG /*1*/:
                if (this.profileMessageReceived) {
                    return this.messageReceivedTimerWorker.getTotal();
                }
                break;
            case SocksProxyConstants.SOCKS5_REQUEST_STEP /*2*/:
                if (this.profileMessageSent) {
                    return this.messageSentTimerWorker.getTotal();
                }
                break;
            case NTLMConstants.MESSAGE_TYPE_3 /*3*/:
                if (this.profileSessionCreated) {
                    return this.sessionCreatedTimerWorker.getTotal();
                }
                break;
            case NTLMConstants.FLAG_REQUEST_SERVER_AUTH_REALM /*4*/:
                if (this.profileSessionOpened) {
                    return this.sessionOpenedTimerWorker.getTotal();
                }
                break;
            case IBulkCursor.DELETE_ROW_TRANSACTION /*5*/:
                if (this.profileSessionIdle) {
                    return this.sessionIdleTimerWorker.getTotal();
                }
                break;
            case IBulkCursor.DEACTIVATE_TRANSACTION /*6*/:
                if (this.profileSessionClosed) {
                    return this.sessionClosedTimerWorker.getTotal();
                }
                break;
        }
        throw new IllegalArgumentException("You are not monitoring this event.  Please add this event first.");
    }

    public long getMinimumTime(IoEventType ioEventType) {
        switch (C04511.$SwitchMap$org$apache$mina$core$session$IoEventType[ioEventType.ordinal()]) {
            case Cocos2dxHandler.HANDLER_SHOW_DIALOG /*1*/:
                if (this.profileMessageReceived) {
                    return this.messageReceivedTimerWorker.getMinimum();
                }
                break;
            case SocksProxyConstants.SOCKS5_REQUEST_STEP /*2*/:
                if (this.profileMessageSent) {
                    return this.messageSentTimerWorker.getMinimum();
                }
                break;
            case NTLMConstants.MESSAGE_TYPE_3 /*3*/:
                if (this.profileSessionCreated) {
                    return this.sessionCreatedTimerWorker.getMinimum();
                }
                break;
            case NTLMConstants.FLAG_REQUEST_SERVER_AUTH_REALM /*4*/:
                if (this.profileSessionOpened) {
                    return this.sessionOpenedTimerWorker.getMinimum();
                }
                break;
            case IBulkCursor.DELETE_ROW_TRANSACTION /*5*/:
                if (this.profileSessionIdle) {
                    return this.sessionIdleTimerWorker.getMinimum();
                }
                break;
            case IBulkCursor.DEACTIVATE_TRANSACTION /*6*/:
                if (this.profileSessionClosed) {
                    return this.sessionClosedTimerWorker.getMinimum();
                }
                break;
        }
        throw new IllegalArgumentException("You are not monitoring this event.  Please add this event first.");
    }

    public long getMaximumTime(IoEventType ioEventType) {
        switch (C04511.$SwitchMap$org$apache$mina$core$session$IoEventType[ioEventType.ordinal()]) {
            case Cocos2dxHandler.HANDLER_SHOW_DIALOG /*1*/:
                if (this.profileMessageReceived) {
                    return this.messageReceivedTimerWorker.getMaximum();
                }
                break;
            case SocksProxyConstants.SOCKS5_REQUEST_STEP /*2*/:
                if (this.profileMessageSent) {
                    return this.messageSentTimerWorker.getMaximum();
                }
                break;
            case NTLMConstants.MESSAGE_TYPE_3 /*3*/:
                if (this.profileSessionCreated) {
                    return this.sessionCreatedTimerWorker.getMaximum();
                }
                break;
            case NTLMConstants.FLAG_REQUEST_SERVER_AUTH_REALM /*4*/:
                if (this.profileSessionOpened) {
                    return this.sessionOpenedTimerWorker.getMaximum();
                }
                break;
            case IBulkCursor.DELETE_ROW_TRANSACTION /*5*/:
                if (this.profileSessionIdle) {
                    return this.sessionIdleTimerWorker.getMaximum();
                }
                break;
            case IBulkCursor.DEACTIVATE_TRANSACTION /*6*/:
                if (this.profileSessionClosed) {
                    return this.sessionClosedTimerWorker.getMaximum();
                }
                break;
        }
        throw new IllegalArgumentException("You are not monitoring this event.  Please add this event first.");
    }

    private long timeNow() {
        switch (C04511.$SwitchMap$java$util$concurrent$TimeUnit[this.timeUnit.ordinal()]) {
            case Cocos2dxHandler.HANDLER_SHOW_DIALOG /*1*/:
                return System.currentTimeMillis() / 1000;
            case SocksProxyConstants.SOCKS5_REQUEST_STEP /*2*/:
                return System.nanoTime() / 1000;
            case NTLMConstants.MESSAGE_TYPE_3 /*3*/:
                return System.nanoTime();
            default:
                return System.currentTimeMillis();
        }
    }
}
