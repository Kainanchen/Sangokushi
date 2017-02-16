package org.apache.mina.filter.util;

import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.core.filterchain.IoFilterAdapter;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.write.WriteRequest;
import org.apache.mina.core.write.WriteRequestWrapper;

public abstract class WriteRequestFilter extends IoFilterAdapter {

    private class FilteredWriteRequest extends WriteRequestWrapper {
        private final Object filteredMessage;

        public FilteredWriteRequest(Object obj, WriteRequest writeRequest) {
            super(writeRequest);
            if (obj == null) {
                throw new IllegalArgumentException("filteredMessage");
            }
            this.filteredMessage = obj;
        }

        public WriteRequestFilter getParent() {
            return WriteRequestFilter.this;
        }

        public Object getMessage() {
            return this.filteredMessage;
        }
    }

    protected abstract Object doFilterWrite(NextFilter nextFilter, IoSession ioSession, WriteRequest writeRequest);

    public void filterWrite(NextFilter nextFilter, IoSession ioSession, WriteRequest writeRequest) {
        Object doFilterWrite = doFilterWrite(nextFilter, ioSession, writeRequest);
        if (doFilterWrite == null || doFilterWrite == writeRequest.getMessage()) {
            nextFilter.filterWrite(ioSession, writeRequest);
        } else {
            nextFilter.filterWrite(ioSession, new FilteredWriteRequest(doFilterWrite, writeRequest));
        }
    }

    public void messageSent(NextFilter nextFilter, IoSession ioSession, WriteRequest writeRequest) {
        if (writeRequest instanceof FilteredWriteRequest) {
            FilteredWriteRequest filteredWriteRequest = (FilteredWriteRequest) writeRequest;
            if (filteredWriteRequest.getParent() == this) {
                nextFilter.messageSent(ioSession, filteredWriteRequest.getParentRequest());
                return;
            }
        }
        nextFilter.messageSent(ioSession, writeRequest);
    }
}
