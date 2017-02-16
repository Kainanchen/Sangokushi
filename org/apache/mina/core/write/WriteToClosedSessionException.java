package org.apache.mina.core.write;

import java.util.Collection;

public class WriteToClosedSessionException extends WriteException {
    private static final long serialVersionUID = 5550204573739301393L;

    public WriteToClosedSessionException(Collection<WriteRequest> collection, String str, Throwable th) {
        super((Collection) collection, str, th);
    }

    public WriteToClosedSessionException(Collection<WriteRequest> collection, String str) {
        super((Collection) collection, str);
    }

    public WriteToClosedSessionException(Collection<WriteRequest> collection, Throwable th) {
        super((Collection) collection, th);
    }

    public WriteToClosedSessionException(Collection<WriteRequest> collection) {
        super((Collection) collection);
    }

    public WriteToClosedSessionException(WriteRequest writeRequest, String str, Throwable th) {
        super(writeRequest, str, th);
    }

    public WriteToClosedSessionException(WriteRequest writeRequest, String str) {
        super(writeRequest, str);
    }

    public WriteToClosedSessionException(WriteRequest writeRequest, Throwable th) {
        super(writeRequest, th);
    }

    public WriteToClosedSessionException(WriteRequest writeRequest) {
        super(writeRequest);
    }
}
