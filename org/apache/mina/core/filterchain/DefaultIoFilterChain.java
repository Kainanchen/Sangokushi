package org.apache.mina.core.filterchain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.core.filterchain.IoFilterChain.Entry;
import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.service.AbstractIoService;
import org.apache.mina.core.session.AbstractIoSession;
import org.apache.mina.core.session.AttributeKey;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.write.WriteRequest;
import org.apache.mina.core.write.WriteRequestQueue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultIoFilterChain implements IoFilterChain {
    private static final Logger LOGGER;
    public static final AttributeKey SESSION_CREATED_FUTURE;
    private final EntryImpl head;
    private final Map<String, Entry> name2entry;
    private final AbstractIoSession session;
    private final EntryImpl tail;

    private final class EntryImpl implements Entry {
        private IoFilter filter;
        private final String name;
        private EntryImpl nextEntry;
        private final NextFilter nextFilter;
        private EntryImpl prevEntry;

        /* renamed from: org.apache.mina.core.filterchain.DefaultIoFilterChain.EntryImpl.1 */
        class C04021 implements NextFilter {
            final /* synthetic */ DefaultIoFilterChain val$this$0;

            C04021(DefaultIoFilterChain defaultIoFilterChain) {
                this.val$this$0 = defaultIoFilterChain;
            }

            public void sessionCreated(IoSession ioSession) {
                DefaultIoFilterChain.this.callNextSessionCreated(EntryImpl.this.nextEntry, ioSession);
            }

            public void sessionOpened(IoSession ioSession) {
                DefaultIoFilterChain.this.callNextSessionOpened(EntryImpl.this.nextEntry, ioSession);
            }

            public void sessionClosed(IoSession ioSession) {
                DefaultIoFilterChain.this.callNextSessionClosed(EntryImpl.this.nextEntry, ioSession);
            }

            public void sessionIdle(IoSession ioSession, IdleStatus idleStatus) {
                DefaultIoFilterChain.this.callNextSessionIdle(EntryImpl.this.nextEntry, ioSession, idleStatus);
            }

            public void exceptionCaught(IoSession ioSession, Throwable th) {
                DefaultIoFilterChain.this.callNextExceptionCaught(EntryImpl.this.nextEntry, ioSession, th);
            }

            public void inputClosed(IoSession ioSession) {
                DefaultIoFilterChain.this.callNextInputClosed(EntryImpl.this.nextEntry, ioSession);
            }

            public void messageReceived(IoSession ioSession, Object obj) {
                DefaultIoFilterChain.this.callNextMessageReceived(EntryImpl.this.nextEntry, ioSession, obj);
            }

            public void messageSent(IoSession ioSession, WriteRequest writeRequest) {
                DefaultIoFilterChain.this.callNextMessageSent(EntryImpl.this.nextEntry, ioSession, writeRequest);
            }

            public void filterWrite(IoSession ioSession, WriteRequest writeRequest) {
                DefaultIoFilterChain.this.callPreviousFilterWrite(EntryImpl.this.prevEntry, ioSession, writeRequest);
            }

            public void filterClose(IoSession ioSession) {
                DefaultIoFilterChain.this.callPreviousFilterClose(EntryImpl.this.prevEntry, ioSession);
            }

            public String toString() {
                return EntryImpl.this.nextEntry.name;
            }
        }

        private EntryImpl(EntryImpl entryImpl, EntryImpl entryImpl2, String str, IoFilter ioFilter) {
            if (ioFilter == null) {
                throw new IllegalArgumentException("filter");
            } else if (str == null) {
                throw new IllegalArgumentException("name");
            } else {
                this.prevEntry = entryImpl;
                this.nextEntry = entryImpl2;
                this.name = str;
                this.filter = ioFilter;
                this.nextFilter = new C04021(DefaultIoFilterChain.this);
            }
        }

        public final String getName() {
            return this.name;
        }

        public final IoFilter getFilter() {
            return this.filter;
        }

        private void setFilter(IoFilter ioFilter) {
            if (ioFilter == null) {
                throw new IllegalArgumentException("filter");
            }
            this.filter = ioFilter;
        }

        public final NextFilter getNextFilter() {
            return this.nextFilter;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("('").append(getName()).append('\'');
            stringBuilder.append(", prev: '");
            if (this.prevEntry != null) {
                stringBuilder.append(this.prevEntry.name);
                stringBuilder.append(':');
                stringBuilder.append(this.prevEntry.getFilter().getClass().getSimpleName());
            } else {
                stringBuilder.append("null");
            }
            stringBuilder.append("', next: '");
            if (this.nextEntry != null) {
                stringBuilder.append(this.nextEntry.name);
                stringBuilder.append(':');
                stringBuilder.append(this.nextEntry.getFilter().getClass().getSimpleName());
            } else {
                stringBuilder.append("null");
            }
            stringBuilder.append("')");
            return stringBuilder.toString();
        }

        public final void addAfter(String str, IoFilter ioFilter) {
            DefaultIoFilterChain.this.addAfter(getName(), str, ioFilter);
        }

        public final void addBefore(String str, IoFilter ioFilter) {
            DefaultIoFilterChain.this.addBefore(getName(), str, ioFilter);
        }

        public final void remove() {
            DefaultIoFilterChain.this.remove(getName());
        }

        public final void replace(IoFilter ioFilter) {
            DefaultIoFilterChain.this.replace(getName(), ioFilter);
        }
    }

    private class HeadFilter extends IoFilterAdapter {
        private HeadFilter() {
        }

        public void filterWrite(NextFilter nextFilter, IoSession ioSession, WriteRequest writeRequest) {
            AbstractIoSession abstractIoSession = (AbstractIoSession) ioSession;
            if (writeRequest.getMessage() instanceof IoBuffer) {
                IoBuffer ioBuffer = (IoBuffer) writeRequest.getMessage();
                ioBuffer.mark();
                int remaining = ioBuffer.remaining();
                if (remaining > 0) {
                    abstractIoSession.increaseScheduledWriteBytes(remaining);
                }
            } else {
                abstractIoSession.increaseScheduledWriteMessages();
            }
            WriteRequestQueue writeRequestQueue = abstractIoSession.getWriteRequestQueue();
            if (abstractIoSession.isWriteSuspended()) {
                abstractIoSession.getWriteRequestQueue().offer(abstractIoSession, writeRequest);
            } else if (writeRequestQueue.isEmpty(ioSession)) {
                abstractIoSession.getProcessor().write(abstractIoSession, writeRequest);
            } else {
                abstractIoSession.getWriteRequestQueue().offer(abstractIoSession, writeRequest);
                abstractIoSession.getProcessor().flush(abstractIoSession);
            }
        }

        public void filterClose(NextFilter nextFilter, IoSession ioSession) {
            ((AbstractIoSession) ioSession).getProcessor().remove(ioSession);
        }
    }

    private static class TailFilter extends IoFilterAdapter {
        private TailFilter() {
        }

        public void sessionCreated(NextFilter nextFilter, IoSession ioSession) {
            ConnectFuture connectFuture;
            try {
                ioSession.getHandler().sessionCreated(ioSession);
                connectFuture = (ConnectFuture) ioSession.removeAttribute(DefaultIoFilterChain.SESSION_CREATED_FUTURE);
                if (connectFuture != null) {
                    connectFuture.setSession(ioSession);
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                connectFuture = (ConnectFuture) ioSession.removeAttribute(DefaultIoFilterChain.SESSION_CREATED_FUTURE);
                if (connectFuture != null) {
                    connectFuture.setSession(ioSession);
                }
            }
        }

        public void sessionOpened(NextFilter nextFilter, IoSession ioSession) {
            ioSession.getHandler().sessionOpened(ioSession);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void sessionClosed(org.apache.mina.core.filterchain.IoFilter.NextFilter r4, org.apache.mina.core.session.IoSession r5) {
            /*
            r3 = this;
            r0 = r5;
            r0 = (org.apache.mina.core.session.AbstractIoSession) r0;
            r1 = r0.getHandler();	 Catch:{ all -> 0x00b2 }
            r1.sessionClosed(r5);	 Catch:{ all -> 0x00b2 }
            r1 = r0.getWriteRequestQueue();	 Catch:{ all -> 0x0061 }
            r1.dispose(r5);	 Catch:{ all -> 0x0061 }
            r1 = r0.getAttributeMap();	 Catch:{ all -> 0x003c }
            r1.dispose(r5);	 Catch:{ all -> 0x003c }
            r1 = r5.getFilterChain();	 Catch:{ all -> 0x002d }
            r1.clear();	 Catch:{ all -> 0x002d }
            r1 = r0.getConfig();
            r1 = r1.isUseReadOperation();
            if (r1 == 0) goto L_0x002c;
        L_0x0029:
            r0.offerClosedReadFuture();
        L_0x002c:
            return;
        L_0x002d:
            r1 = move-exception;
            r2 = r0.getConfig();
            r2 = r2.isUseReadOperation();
            if (r2 == 0) goto L_0x003b;
        L_0x0038:
            r0.offerClosedReadFuture();
        L_0x003b:
            throw r1;
        L_0x003c:
            r1 = move-exception;
            r2 = r5.getFilterChain();	 Catch:{ all -> 0x0052 }
            r2.clear();	 Catch:{ all -> 0x0052 }
            r2 = r0.getConfig();
            r2 = r2.isUseReadOperation();
            if (r2 == 0) goto L_0x0051;
        L_0x004e:
            r0.offerClosedReadFuture();
        L_0x0051:
            throw r1;
        L_0x0052:
            r1 = move-exception;
            r2 = r0.getConfig();
            r2 = r2.isUseReadOperation();
            if (r2 == 0) goto L_0x0060;
        L_0x005d:
            r0.offerClosedReadFuture();
        L_0x0060:
            throw r1;
        L_0x0061:
            r1 = move-exception;
            r2 = r0.getAttributeMap();	 Catch:{ all -> 0x008d }
            r2.dispose(r5);	 Catch:{ all -> 0x008d }
            r2 = r5.getFilterChain();	 Catch:{ all -> 0x007e }
            r2.clear();	 Catch:{ all -> 0x007e }
            r2 = r0.getConfig();
            r2 = r2.isUseReadOperation();
            if (r2 == 0) goto L_0x007d;
        L_0x007a:
            r0.offerClosedReadFuture();
        L_0x007d:
            throw r1;
        L_0x007e:
            r1 = move-exception;
            r2 = r0.getConfig();
            r2 = r2.isUseReadOperation();
            if (r2 == 0) goto L_0x008c;
        L_0x0089:
            r0.offerClosedReadFuture();
        L_0x008c:
            throw r1;
        L_0x008d:
            r1 = move-exception;
            r2 = r5.getFilterChain();	 Catch:{ all -> 0x00a3 }
            r2.clear();	 Catch:{ all -> 0x00a3 }
            r2 = r0.getConfig();
            r2 = r2.isUseReadOperation();
            if (r2 == 0) goto L_0x00a2;
        L_0x009f:
            r0.offerClosedReadFuture();
        L_0x00a2:
            throw r1;
        L_0x00a3:
            r1 = move-exception;
            r2 = r0.getConfig();
            r2 = r2.isUseReadOperation();
            if (r2 == 0) goto L_0x00b1;
        L_0x00ae:
            r0.offerClosedReadFuture();
        L_0x00b1:
            throw r1;
        L_0x00b2:
            r1 = move-exception;
            r2 = r0.getWriteRequestQueue();	 Catch:{ all -> 0x010a }
            r2.dispose(r5);	 Catch:{ all -> 0x010a }
            r2 = r0.getAttributeMap();	 Catch:{ all -> 0x00e5 }
            r2.dispose(r5);	 Catch:{ all -> 0x00e5 }
            r2 = r5.getFilterChain();	 Catch:{ all -> 0x00d6 }
            r2.clear();	 Catch:{ all -> 0x00d6 }
            r2 = r0.getConfig();
            r2 = r2.isUseReadOperation();
            if (r2 == 0) goto L_0x00d5;
        L_0x00d2:
            r0.offerClosedReadFuture();
        L_0x00d5:
            throw r1;
        L_0x00d6:
            r1 = move-exception;
            r2 = r0.getConfig();
            r2 = r2.isUseReadOperation();
            if (r2 == 0) goto L_0x00e4;
        L_0x00e1:
            r0.offerClosedReadFuture();
        L_0x00e4:
            throw r1;
        L_0x00e5:
            r1 = move-exception;
            r2 = r5.getFilterChain();	 Catch:{ all -> 0x00fb }
            r2.clear();	 Catch:{ all -> 0x00fb }
            r2 = r0.getConfig();
            r2 = r2.isUseReadOperation();
            if (r2 == 0) goto L_0x00fa;
        L_0x00f7:
            r0.offerClosedReadFuture();
        L_0x00fa:
            throw r1;
        L_0x00fb:
            r1 = move-exception;
            r2 = r0.getConfig();
            r2 = r2.isUseReadOperation();
            if (r2 == 0) goto L_0x0109;
        L_0x0106:
            r0.offerClosedReadFuture();
        L_0x0109:
            throw r1;
        L_0x010a:
            r1 = move-exception;
            r2 = r0.getAttributeMap();	 Catch:{ all -> 0x0136 }
            r2.dispose(r5);	 Catch:{ all -> 0x0136 }
            r2 = r5.getFilterChain();	 Catch:{ all -> 0x0127 }
            r2.clear();	 Catch:{ all -> 0x0127 }
            r2 = r0.getConfig();
            r2 = r2.isUseReadOperation();
            if (r2 == 0) goto L_0x0126;
        L_0x0123:
            r0.offerClosedReadFuture();
        L_0x0126:
            throw r1;
        L_0x0127:
            r1 = move-exception;
            r2 = r0.getConfig();
            r2 = r2.isUseReadOperation();
            if (r2 == 0) goto L_0x0135;
        L_0x0132:
            r0.offerClosedReadFuture();
        L_0x0135:
            throw r1;
        L_0x0136:
            r1 = move-exception;
            r2 = r5.getFilterChain();	 Catch:{ all -> 0x014c }
            r2.clear();	 Catch:{ all -> 0x014c }
            r2 = r0.getConfig();
            r2 = r2.isUseReadOperation();
            if (r2 == 0) goto L_0x014b;
        L_0x0148:
            r0.offerClosedReadFuture();
        L_0x014b:
            throw r1;
        L_0x014c:
            r1 = move-exception;
            r2 = r0.getConfig();
            r2 = r2.isUseReadOperation();
            if (r2 == 0) goto L_0x015a;
        L_0x0157:
            r0.offerClosedReadFuture();
        L_0x015a:
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.mina.core.filterchain.DefaultIoFilterChain.TailFilter.sessionClosed(org.apache.mina.core.filterchain.IoFilter$NextFilter, org.apache.mina.core.session.IoSession):void");
        }

        public void sessionIdle(NextFilter nextFilter, IoSession ioSession, IdleStatus idleStatus) {
            ioSession.getHandler().sessionIdle(ioSession, idleStatus);
        }

        public void exceptionCaught(NextFilter nextFilter, IoSession ioSession, Throwable th) {
            AbstractIoSession abstractIoSession = (AbstractIoSession) ioSession;
            try {
                abstractIoSession.getHandler().exceptionCaught(abstractIoSession, th);
                if (abstractIoSession.getConfig().isUseReadOperation()) {
                    abstractIoSession.offerFailedReadFuture(th);
                }
            } catch (Throwable th2) {
                if (abstractIoSession.getConfig().isUseReadOperation()) {
                    abstractIoSession.offerFailedReadFuture(th);
                }
            }
        }

        public void inputClosed(NextFilter nextFilter, IoSession ioSession) {
            ioSession.getHandler().inputClosed(ioSession);
        }

        public void messageReceived(NextFilter nextFilter, IoSession ioSession, Object obj) {
            AbstractIoSession abstractIoSession = (AbstractIoSession) ioSession;
            if (!(obj instanceof IoBuffer)) {
                abstractIoSession.increaseReadMessages(System.currentTimeMillis());
            } else if (!((IoBuffer) obj).hasRemaining()) {
                abstractIoSession.increaseReadMessages(System.currentTimeMillis());
            }
            if (ioSession.getService() instanceof AbstractIoService) {
                ((AbstractIoService) ioSession.getService()).getStatistics().updateThroughput(System.currentTimeMillis());
            }
            try {
                ioSession.getHandler().messageReceived(abstractIoSession, obj);
                if (abstractIoSession.getConfig().isUseReadOperation()) {
                    abstractIoSession.offerReadFuture(obj);
                }
            } catch (Throwable th) {
                if (abstractIoSession.getConfig().isUseReadOperation()) {
                    abstractIoSession.offerReadFuture(obj);
                }
            }
        }

        public void messageSent(NextFilter nextFilter, IoSession ioSession, WriteRequest writeRequest) {
            ((AbstractIoSession) ioSession).increaseWrittenMessages(writeRequest, System.currentTimeMillis());
            if (ioSession.getService() instanceof AbstractIoService) {
                ((AbstractIoService) ioSession.getService()).getStatistics().updateThroughput(System.currentTimeMillis());
            }
            ioSession.getHandler().messageSent(ioSession, writeRequest.getMessage());
        }

        public void filterWrite(NextFilter nextFilter, IoSession ioSession, WriteRequest writeRequest) {
            nextFilter.filterWrite(ioSession, writeRequest);
        }

        public void filterClose(NextFilter nextFilter, IoSession ioSession) {
            nextFilter.filterClose(ioSession);
        }
    }

    static {
        SESSION_CREATED_FUTURE = new AttributeKey(DefaultIoFilterChain.class, "connectFuture");
        LOGGER = LoggerFactory.getLogger(DefaultIoFilterChain.class);
    }

    public DefaultIoFilterChain(AbstractIoSession abstractIoSession) {
        this.name2entry = new ConcurrentHashMap();
        if (abstractIoSession == null) {
            throw new IllegalArgumentException("session");
        }
        this.session = abstractIoSession;
        this.head = new EntryImpl(null, null, "head", new HeadFilter(), null);
        this.tail = new EntryImpl(this.head, null, "tail", new TailFilter(), null);
        this.head.nextEntry = this.tail;
    }

    public IoSession getSession() {
        return this.session;
    }

    public Entry getEntry(String str) {
        Entry entry = (Entry) this.name2entry.get(str);
        if (entry == null) {
            return null;
        }
        return entry;
    }

    public Entry getEntry(IoFilter ioFilter) {
        for (Entry access$300 = this.head.nextEntry; access$300 != this.tail; access$300 = access$300.nextEntry) {
            if (access$300.getFilter() == ioFilter) {
                return access$300;
            }
        }
        return null;
    }

    public Entry getEntry(Class<? extends IoFilter> cls) {
        for (Entry access$300 = this.head.nextEntry; access$300 != this.tail; access$300 = access$300.nextEntry) {
            if (cls.isAssignableFrom(access$300.getFilter().getClass())) {
                return access$300;
            }
        }
        return null;
    }

    public IoFilter get(String str) {
        Entry entry = getEntry(str);
        if (entry == null) {
            return null;
        }
        return entry.getFilter();
    }

    public IoFilter get(Class<? extends IoFilter> cls) {
        Entry entry = getEntry((Class) cls);
        if (entry == null) {
            return null;
        }
        return entry.getFilter();
    }

    public NextFilter getNextFilter(String str) {
        Entry entry = getEntry(str);
        if (entry == null) {
            return null;
        }
        return entry.getNextFilter();
    }

    public NextFilter getNextFilter(IoFilter ioFilter) {
        Entry entry = getEntry(ioFilter);
        if (entry == null) {
            return null;
        }
        return entry.getNextFilter();
    }

    public NextFilter getNextFilter(Class<? extends IoFilter> cls) {
        Entry entry = getEntry((Class) cls);
        if (entry == null) {
            return null;
        }
        return entry.getNextFilter();
    }

    public synchronized void addFirst(String str, IoFilter ioFilter) {
        checkAddable(str);
        register(this.head, str, ioFilter);
    }

    public synchronized void addLast(String str, IoFilter ioFilter) {
        checkAddable(str);
        register(this.tail.prevEntry, str, ioFilter);
    }

    public synchronized void addBefore(String str, String str2, IoFilter ioFilter) {
        EntryImpl checkOldName = checkOldName(str);
        checkAddable(str2);
        register(checkOldName.prevEntry, str2, ioFilter);
    }

    public synchronized void addAfter(String str, String str2, IoFilter ioFilter) {
        EntryImpl checkOldName = checkOldName(str);
        checkAddable(str2);
        register(checkOldName, str2, ioFilter);
    }

    public synchronized IoFilter remove(String str) {
        EntryImpl checkOldName;
        checkOldName = checkOldName(str);
        deregister(checkOldName);
        return checkOldName.getFilter();
    }

    public synchronized void remove(IoFilter ioFilter) {
        EntryImpl access$300 = this.head.nextEntry;
        while (access$300 != this.tail) {
            if (access$300.getFilter() == ioFilter) {
                deregister(access$300);
            } else {
                access$300 = access$300.nextEntry;
            }
        }
        throw new IllegalArgumentException("Filter not found: " + ioFilter.getClass().getName());
    }

    public synchronized IoFilter remove(Class<? extends IoFilter> cls) {
        IoFilter filter;
        EntryImpl access$300 = this.head.nextEntry;
        while (access$300 != this.tail) {
            if (cls.isAssignableFrom(access$300.getFilter().getClass())) {
                filter = access$300.getFilter();
                deregister(access$300);
            } else {
                access$300 = access$300.nextEntry;
            }
        }
        throw new IllegalArgumentException("Filter not found: " + cls.getName());
        return filter;
    }

    public synchronized IoFilter replace(String str, IoFilter ioFilter) {
        IoFilter filter;
        EntryImpl checkOldName = checkOldName(str);
        filter = checkOldName.getFilter();
        try {
            ioFilter.onPreAdd(this, str, checkOldName.getNextFilter());
            checkOldName.setFilter(ioFilter);
            ioFilter.onPostAdd(this, str, checkOldName.getNextFilter());
        } catch (Throwable e) {
            checkOldName.setFilter(filter);
            throw new IoFilterLifeCycleException("onPostAdd(): " + str + ':' + ioFilter + " in " + getSession(), e);
        } catch (Throwable e2) {
            throw new IoFilterLifeCycleException("onPreAdd(): " + str + ':' + ioFilter + " in " + getSession(), e2);
        }
        return filter;
    }

    public synchronized void replace(IoFilter ioFilter, IoFilter ioFilter2) {
        for (EntryImpl access$300 = this.head.nextEntry; access$300 != this.tail; access$300 = access$300.nextEntry) {
            if (access$300.getFilter() == ioFilter) {
                String str = null;
                for (Map.Entry entry : this.name2entry.entrySet()) {
                    if (access$300 == entry.getValue()) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                try {
                    ioFilter2.onPreAdd(this, str, access$300.getNextFilter());
                    access$300.setFilter(ioFilter2);
                    ioFilter2.onPostAdd(this, str, access$300.getNextFilter());
                } catch (Throwable e) {
                    access$300.setFilter(ioFilter);
                    throw new IoFilterLifeCycleException("onPostAdd(): " + str + ':' + ioFilter2 + " in " + getSession(), e);
                } catch (Throwable e2) {
                    throw new IoFilterLifeCycleException("onPreAdd(): " + str + ':' + ioFilter2 + " in " + getSession(), e2);
                }
            }
        }
        throw new IllegalArgumentException("Filter not found: " + ioFilter.getClass().getName());
    }

    public synchronized IoFilter replace(Class<? extends IoFilter> cls, IoFilter ioFilter) {
        IoFilter filter;
        for (EntryImpl access$300 = this.head.nextEntry; access$300 != this.tail; access$300 = access$300.nextEntry) {
            if (cls.isAssignableFrom(access$300.getFilter().getClass())) {
                filter = access$300.getFilter();
                String str = null;
                for (Map.Entry entry : this.name2entry.entrySet()) {
                    if (access$300 == entry.getValue()) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                try {
                    ioFilter.onPreAdd(this, str, access$300.getNextFilter());
                    access$300.setFilter(ioFilter);
                    ioFilter.onPostAdd(this, str, access$300.getNextFilter());
                } catch (Throwable e) {
                    access$300.setFilter(filter);
                    throw new IoFilterLifeCycleException("onPostAdd(): " + str + ':' + ioFilter + " in " + getSession(), e);
                } catch (Throwable e2) {
                    throw new IoFilterLifeCycleException("onPreAdd(): " + str + ':' + ioFilter + " in " + getSession(), e2);
                }
            }
        }
        throw new IllegalArgumentException("Filter not found: " + cls.getName());
        return filter;
    }

    public synchronized void clear() {
        for (Entry entry : new ArrayList(this.name2entry.values())) {
            try {
                deregister((EntryImpl) entry);
            } catch (Throwable e) {
                throw new IoFilterLifeCycleException("clear(): " + entry.getName() + " in " + getSession(), e);
            }
        }
    }

    private void register(EntryImpl entryImpl, String str, IoFilter ioFilter) {
        EntryImpl entryImpl2 = new EntryImpl(entryImpl, entryImpl.nextEntry, str, ioFilter, null);
        try {
            ioFilter.onPreAdd(this, str, entryImpl2.getNextFilter());
            entryImpl.nextEntry.prevEntry = entryImpl2;
            entryImpl.nextEntry = entryImpl2;
            this.name2entry.put(str, entryImpl2);
            try {
                ioFilter.onPostAdd(this, str, entryImpl2.getNextFilter());
            } catch (Throwable e) {
                deregister0(entryImpl2);
                throw new IoFilterLifeCycleException("onPostAdd(): " + str + ':' + ioFilter + " in " + getSession(), e);
            }
        } catch (Throwable e2) {
            throw new IoFilterLifeCycleException("onPreAdd(): " + str + ':' + ioFilter + " in " + getSession(), e2);
        }
    }

    private void deregister(EntryImpl entryImpl) {
        IoFilter filter = entryImpl.getFilter();
        try {
            filter.onPreRemove(this, entryImpl.getName(), entryImpl.getNextFilter());
            deregister0(entryImpl);
            try {
                filter.onPostRemove(this, entryImpl.getName(), entryImpl.getNextFilter());
            } catch (Throwable e) {
                throw new IoFilterLifeCycleException("onPostRemove(): " + entryImpl.getName() + ':' + filter + " in " + getSession(), e);
            }
        } catch (Throwable e2) {
            throw new IoFilterLifeCycleException("onPreRemove(): " + entryImpl.getName() + ':' + filter + " in " + getSession(), e2);
        }
    }

    private void deregister0(EntryImpl entryImpl) {
        EntryImpl access$400 = entryImpl.prevEntry;
        EntryImpl access$300 = entryImpl.nextEntry;
        access$400.nextEntry = access$300;
        access$300.prevEntry = access$400;
        this.name2entry.remove(entryImpl.name);
    }

    private EntryImpl checkOldName(String str) {
        EntryImpl entryImpl = (EntryImpl) this.name2entry.get(str);
        if (entryImpl != null) {
            return entryImpl;
        }
        throw new IllegalArgumentException("Filter not found:" + str);
    }

    private void checkAddable(String str) {
        if (this.name2entry.containsKey(str)) {
            throw new IllegalArgumentException("Other filter is using the same name '" + str + "'");
        }
    }

    public void fireSessionCreated() {
        callNextSessionCreated(this.head, this.session);
    }

    private void callNextSessionCreated(Entry entry, IoSession ioSession) {
        try {
            entry.getFilter().sessionCreated(entry.getNextFilter(), ioSession);
        } catch (Throwable e) {
            fireExceptionCaught(e);
        } catch (Throwable e2) {
            fireExceptionCaught(e2);
            throw e2;
        }
    }

    public void fireSessionOpened() {
        callNextSessionOpened(this.head, this.session);
    }

    private void callNextSessionOpened(Entry entry, IoSession ioSession) {
        try {
            entry.getFilter().sessionOpened(entry.getNextFilter(), ioSession);
        } catch (Throwable e) {
            fireExceptionCaught(e);
        } catch (Throwable e2) {
            fireExceptionCaught(e2);
            throw e2;
        }
    }

    public void fireSessionClosed() {
        try {
            this.session.getCloseFuture().setClosed();
        } catch (Throwable e) {
            fireExceptionCaught(e);
        } catch (Throwable e2) {
            fireExceptionCaught(e2);
            throw e2;
        }
        callNextSessionClosed(this.head, this.session);
    }

    private void callNextSessionClosed(Entry entry, IoSession ioSession) {
        try {
            entry.getFilter().sessionClosed(entry.getNextFilter(), ioSession);
        } catch (Throwable e) {
            fireExceptionCaught(e);
        } catch (Throwable e2) {
            fireExceptionCaught(e2);
        }
    }

    public void fireSessionIdle(IdleStatus idleStatus) {
        this.session.increaseIdleCount(idleStatus, System.currentTimeMillis());
        callNextSessionIdle(this.head, this.session, idleStatus);
    }

    private void callNextSessionIdle(Entry entry, IoSession ioSession, IdleStatus idleStatus) {
        try {
            entry.getFilter().sessionIdle(entry.getNextFilter(), ioSession, idleStatus);
        } catch (Throwable e) {
            fireExceptionCaught(e);
        } catch (Throwable e2) {
            fireExceptionCaught(e2);
            throw e2;
        }
    }

    public void fireMessageReceived(Object obj) {
        if (obj instanceof IoBuffer) {
            this.session.increaseReadBytes((long) ((IoBuffer) obj).remaining(), System.currentTimeMillis());
        }
        callNextMessageReceived(this.head, this.session, obj);
    }

    private void callNextMessageReceived(Entry entry, IoSession ioSession, Object obj) {
        try {
            entry.getFilter().messageReceived(entry.getNextFilter(), ioSession, obj);
        } catch (Throwable e) {
            fireExceptionCaught(e);
        } catch (Throwable e2) {
            fireExceptionCaught(e2);
            throw e2;
        }
    }

    public void fireMessageSent(WriteRequest writeRequest) {
        try {
            writeRequest.getFuture().setWritten();
        } catch (Throwable e) {
            fireExceptionCaught(e);
        } catch (Throwable e2) {
            fireExceptionCaught(e2);
            throw e2;
        }
        if (!writeRequest.isEncoded()) {
            callNextMessageSent(this.head, this.session, writeRequest);
        }
    }

    private void callNextMessageSent(Entry entry, IoSession ioSession, WriteRequest writeRequest) {
        try {
            entry.getFilter().messageSent(entry.getNextFilter(), ioSession, writeRequest);
        } catch (Throwable e) {
            fireExceptionCaught(e);
        } catch (Throwable e2) {
            fireExceptionCaught(e2);
            throw e2;
        }
    }

    public void fireExceptionCaught(Throwable th) {
        callNextExceptionCaught(this.head, this.session, th);
    }

    private void callNextExceptionCaught(Entry entry, IoSession ioSession, Throwable th) {
        ConnectFuture connectFuture = (ConnectFuture) ioSession.removeAttribute(SESSION_CREATED_FUTURE);
        if (connectFuture == null) {
            try {
                entry.getFilter().exceptionCaught(entry.getNextFilter(), ioSession, th);
                return;
            } catch (Throwable th2) {
                LOGGER.warn("Unexpected exception from exceptionCaught handler.", th2);
                return;
            }
        }
        if (!ioSession.isClosing()) {
            ioSession.closeNow();
        }
        connectFuture.setException(th);
    }

    public void fireInputClosed() {
        callNextInputClosed(this.head, this.session);
    }

    private void callNextInputClosed(Entry entry, IoSession ioSession) {
        try {
            entry.getFilter().inputClosed(entry.getNextFilter(), ioSession);
        } catch (Throwable th) {
            fireExceptionCaught(th);
        }
    }

    public void fireFilterWrite(WriteRequest writeRequest) {
        callPreviousFilterWrite(this.tail, this.session, writeRequest);
    }

    private void callPreviousFilterWrite(Entry entry, IoSession ioSession, WriteRequest writeRequest) {
        try {
            entry.getFilter().filterWrite(entry.getNextFilter(), ioSession, writeRequest);
        } catch (Throwable e) {
            writeRequest.getFuture().setException(e);
            fireExceptionCaught(e);
        } catch (Throwable e2) {
            writeRequest.getFuture().setException(e2);
            fireExceptionCaught(e2);
            throw e2;
        }
    }

    public void fireFilterClose() {
        callPreviousFilterClose(this.tail, this.session);
    }

    private void callPreviousFilterClose(Entry entry, IoSession ioSession) {
        try {
            entry.getFilter().filterClose(entry.getNextFilter(), ioSession);
        } catch (Throwable e) {
            fireExceptionCaught(e);
        } catch (Throwable e2) {
            fireExceptionCaught(e2);
            throw e2;
        }
    }

    public List<Entry> getAll() {
        List<Entry> arrayList = new ArrayList();
        for (EntryImpl access$300 = this.head.nextEntry; access$300 != this.tail; access$300 = access$300.nextEntry) {
            arrayList.add(access$300);
        }
        return arrayList;
    }

    public List<Entry> getAllReversed() {
        List<Entry> arrayList = new ArrayList();
        for (EntryImpl access$400 = this.tail.prevEntry; access$400 != this.head; access$400 = access$400.prevEntry) {
            arrayList.add(access$400);
        }
        return arrayList;
    }

    public boolean contains(String str) {
        return getEntry(str) != null;
    }

    public boolean contains(IoFilter ioFilter) {
        return getEntry(ioFilter) != null;
    }

    public boolean contains(Class<? extends IoFilter> cls) {
        return getEntry((Class) cls) != null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{ ");
        Object obj = 1;
        for (EntryImpl access$300 = this.head.nextEntry; access$300 != this.tail; access$300 = access$300.nextEntry) {
            if (obj == null) {
                stringBuilder.append(", ");
            } else {
                obj = null;
            }
            stringBuilder.append('(');
            stringBuilder.append(access$300.getName());
            stringBuilder.append(':');
            stringBuilder.append(access$300.getFilter());
            stringBuilder.append(')');
        }
        if (obj != null) {
            stringBuilder.append("empty");
        }
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}
