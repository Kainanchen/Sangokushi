package org.apache.mina.core.future;

public interface ReadFuture extends IoFuture {
    boolean isClosed();

    void setClosed();

    void setException(Throwable th);

    void setRead(Object obj);
}
