package org.apache.mina.core.write;

import java.util.Collection;

public class WriteTimeoutException extends WriteException {
    private static final long serialVersionUID = 3906931157944579121L;

    public WriteTimeoutException(Collection<WriteRequest> collection, String str, Throwable th) {
        super((Collection) collection, str, th);
    }

    public WriteTimeoutException(Collection<WriteRequest> collection, String str) {
        super((Collection) collection, str);
    }

    public WriteTimeoutException(Collection<WriteRequest> collection, Throwable th) {
        super((Collection) collection, th);
    }

    public WriteTimeoutException(Collection<WriteRequest> collection) {
        super((Collection) collection);
    }

    public WriteTimeoutException(WriteRequest writeRequest, String str, Throwable th) {
        super(writeRequest, str, th);
    }

    public WriteTimeoutException(WriteRequest writeRequest, String str) {
        super(writeRequest, str);
    }

    public WriteTimeoutException(WriteRequest writeRequest, Throwable th) {
        super(writeRequest, th);
    }

    public WriteTimeoutException(WriteRequest writeRequest) {
        super(writeRequest);
    }
}
