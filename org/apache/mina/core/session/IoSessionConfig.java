package org.apache.mina.core.session;

public interface IoSessionConfig {
    int getIdleTime(IdleStatus idleStatus);

    long getIdleTimeInMillis(IdleStatus idleStatus);

    int getMaxReadBufferSize();

    int getMinReadBufferSize();

    int getReadBufferSize();

    int getThroughputCalculationInterval();

    long getThroughputCalculationIntervalInMillis();

    int getWriteTimeout();

    long getWriteTimeoutInMillis();

    boolean isUseReadOperation();

    void setAll(IoSessionConfig ioSessionConfig);

    void setIdleTime(IdleStatus idleStatus, int i);

    void setReadBufferSize(int i);

    void setReaderIdleTime(int i);

    void setWriteTimeout(int i);

    void setWriterIdleTime(int i);
}
