package org.apache.mina.core.session;

import org.apache.mina.proxy.handlers.http.ntlm.NTLMConstants;

public abstract class AbstractIoSessionConfig implements IoSessionConfig {
    private int idleTimeForBoth;
    private int idleTimeForRead;
    private int idleTimeForWrite;
    private int maxReadBufferSize;
    private int minReadBufferSize;
    private int readBufferSize;
    private int throughputCalculationInterval;
    private boolean useReadOperation;
    private int writeTimeout;

    public AbstractIoSessionConfig() {
        this.minReadBufferSize = 64;
        this.readBufferSize = NTLMConstants.FLAG_NEGOTIATE_ANONYMOUS;
        this.maxReadBufferSize = NTLMConstants.FLAG_TARGET_TYPE_DOMAIN;
        this.writeTimeout = 60;
        this.throughputCalculationInterval = 3;
    }

    public void setAll(IoSessionConfig ioSessionConfig) {
        if (ioSessionConfig == null) {
            throw new IllegalArgumentException("config");
        }
        setReadBufferSize(ioSessionConfig.getReadBufferSize());
        setMinReadBufferSize(ioSessionConfig.getMinReadBufferSize());
        setMaxReadBufferSize(ioSessionConfig.getMaxReadBufferSize());
        setIdleTime(IdleStatus.BOTH_IDLE, ioSessionConfig.getIdleTime(IdleStatus.BOTH_IDLE));
        setIdleTime(IdleStatus.READER_IDLE, ioSessionConfig.getIdleTime(IdleStatus.READER_IDLE));
        setIdleTime(IdleStatus.WRITER_IDLE, ioSessionConfig.getIdleTime(IdleStatus.WRITER_IDLE));
        setWriteTimeout(ioSessionConfig.getWriteTimeout());
        setUseReadOperation(ioSessionConfig.isUseReadOperation());
        setThroughputCalculationInterval(ioSessionConfig.getThroughputCalculationInterval());
    }

    public int getReadBufferSize() {
        return this.readBufferSize;
    }

    public void setReadBufferSize(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("readBufferSize: " + i + " (expected: 1+)");
        }
        this.readBufferSize = i;
    }

    public int getMinReadBufferSize() {
        return this.minReadBufferSize;
    }

    public void setMinReadBufferSize(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("minReadBufferSize: " + i + " (expected: 1+)");
        } else if (i > this.maxReadBufferSize) {
            throw new IllegalArgumentException("minReadBufferSize: " + i + " (expected: smaller than " + this.maxReadBufferSize + ')');
        } else {
            this.minReadBufferSize = i;
        }
    }

    public int getMaxReadBufferSize() {
        return this.maxReadBufferSize;
    }

    public void setMaxReadBufferSize(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxReadBufferSize: " + i + " (expected: 1+)");
        } else if (i < this.minReadBufferSize) {
            throw new IllegalArgumentException("maxReadBufferSize: " + i + " (expected: greater than " + this.minReadBufferSize + ')');
        } else {
            this.maxReadBufferSize = i;
        }
    }

    public int getIdleTime(IdleStatus idleStatus) {
        if (idleStatus == IdleStatus.BOTH_IDLE) {
            return this.idleTimeForBoth;
        }
        if (idleStatus == IdleStatus.READER_IDLE) {
            return this.idleTimeForRead;
        }
        if (idleStatus == IdleStatus.WRITER_IDLE) {
            return this.idleTimeForWrite;
        }
        throw new IllegalArgumentException("Unknown idle status: " + idleStatus);
    }

    public long getIdleTimeInMillis(IdleStatus idleStatus) {
        return ((long) getIdleTime(idleStatus)) * 1000;
    }

    public void setIdleTime(IdleStatus idleStatus, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Illegal idle time: " + i);
        } else if (idleStatus == IdleStatus.BOTH_IDLE) {
            this.idleTimeForBoth = i;
        } else if (idleStatus == IdleStatus.READER_IDLE) {
            this.idleTimeForRead = i;
        } else if (idleStatus == IdleStatus.WRITER_IDLE) {
            this.idleTimeForWrite = i;
        } else {
            throw new IllegalArgumentException("Unknown idle status: " + idleStatus);
        }
    }

    public final int getBothIdleTime() {
        return getIdleTime(IdleStatus.BOTH_IDLE);
    }

    public final long getBothIdleTimeInMillis() {
        return getIdleTimeInMillis(IdleStatus.BOTH_IDLE);
    }

    public final int getReaderIdleTime() {
        return getIdleTime(IdleStatus.READER_IDLE);
    }

    public final long getReaderIdleTimeInMillis() {
        return getIdleTimeInMillis(IdleStatus.READER_IDLE);
    }

    public final int getWriterIdleTime() {
        return getIdleTime(IdleStatus.WRITER_IDLE);
    }

    public final long getWriterIdleTimeInMillis() {
        return getIdleTimeInMillis(IdleStatus.WRITER_IDLE);
    }

    public void setBothIdleTime(int i) {
        setIdleTime(IdleStatus.BOTH_IDLE, i);
    }

    public void setReaderIdleTime(int i) {
        setIdleTime(IdleStatus.READER_IDLE, i);
    }

    public void setWriterIdleTime(int i) {
        setIdleTime(IdleStatus.WRITER_IDLE, i);
    }

    public int getWriteTimeout() {
        return this.writeTimeout;
    }

    public long getWriteTimeoutInMillis() {
        return ((long) this.writeTimeout) * 1000;
    }

    public void setWriteTimeout(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Illegal write timeout: " + i);
        }
        this.writeTimeout = i;
    }

    public boolean isUseReadOperation() {
        return this.useReadOperation;
    }

    public void setUseReadOperation(boolean z) {
        this.useReadOperation = z;
    }

    public int getThroughputCalculationInterval() {
        return this.throughputCalculationInterval;
    }

    public void setThroughputCalculationInterval(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("throughputCalculationInterval: " + i);
        }
        this.throughputCalculationInterval = i;
    }

    public long getThroughputCalculationIntervalInMillis() {
        return ((long) this.throughputCalculationInterval) * 1000;
    }
}
