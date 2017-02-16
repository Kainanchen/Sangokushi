package org.apache.mina.core.filterchain;

import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.write.WriteRequest;

public interface IoFilterChain {

    public interface Entry {
        IoFilter getFilter();

        String getName();

        NextFilter getNextFilter();
    }

    void addLast(String str, IoFilter ioFilter);

    void clear();

    boolean contains(Class<? extends IoFilter> cls);

    boolean contains(IoFilter ioFilter);

    void fireExceptionCaught(Throwable th);

    void fireFilterClose();

    void fireFilterWrite(WriteRequest writeRequest);

    void fireInputClosed();

    void fireMessageReceived(Object obj);

    void fireMessageSent(WriteRequest writeRequest);

    void fireSessionClosed();

    void fireSessionCreated();

    void fireSessionIdle(IdleStatus idleStatus);

    void fireSessionOpened();

    IoFilter get(Class<? extends IoFilter> cls);

    NextFilter getNextFilter(Class<? extends IoFilter> cls);

    NextFilter getNextFilter(IoFilter ioFilter);

    IoSession getSession();
}
