package org.apache.mina.core.service;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class IoServiceStatistics {
    private double largestReadBytesThroughput;
    private double largestReadMessagesThroughput;
    private double largestWrittenBytesThroughput;
    private double largestWrittenMessagesThroughput;
    private long lastReadBytes;
    private long lastReadMessages;
    private long lastReadTime;
    private long lastThroughputCalculationTime;
    private long lastWriteTime;
    private long lastWrittenBytes;
    private long lastWrittenMessages;
    private long readBytes;
    private double readBytesThroughput;
    private long readMessages;
    private double readMessagesThroughput;
    private int scheduledWriteBytes;
    private int scheduledWriteMessages;
    private AbstractIoService service;
    private final AtomicInteger throughputCalculationInterval;
    private final Lock throughputCalculationLock;
    private long writtenBytes;
    private double writtenBytesThroughput;
    private long writtenMessages;
    private double writtenMessagesThroughput;

    public IoServiceStatistics(AbstractIoService abstractIoService) {
        this.throughputCalculationInterval = new AtomicInteger(3);
        this.throughputCalculationLock = new ReentrantLock();
        this.service = abstractIoService;
    }

    public final int getLargestManagedSessionCount() {
        return this.service.getListeners().getLargestManagedSessionCount();
    }

    public final long getCumulativeManagedSessionCount() {
        return this.service.getListeners().getCumulativeManagedSessionCount();
    }

    public final long getLastIoTime() {
        this.throughputCalculationLock.lock();
        try {
            long max = Math.max(this.lastReadTime, this.lastWriteTime);
            return max;
        } finally {
            this.throughputCalculationLock.unlock();
        }
    }

    public final long getLastReadTime() {
        this.throughputCalculationLock.lock();
        try {
            long j = this.lastReadTime;
            return j;
        } finally {
            this.throughputCalculationLock.unlock();
        }
    }

    public final long getLastWriteTime() {
        this.throughputCalculationLock.lock();
        try {
            long j = this.lastWriteTime;
            return j;
        } finally {
            this.throughputCalculationLock.unlock();
        }
    }

    public final long getReadBytes() {
        this.throughputCalculationLock.lock();
        try {
            long j = this.readBytes;
            return j;
        } finally {
            this.throughputCalculationLock.unlock();
        }
    }

    public final long getWrittenBytes() {
        this.throughputCalculationLock.lock();
        try {
            long j = this.writtenBytes;
            return j;
        } finally {
            this.throughputCalculationLock.unlock();
        }
    }

    public final long getReadMessages() {
        this.throughputCalculationLock.lock();
        try {
            long j = this.readMessages;
            return j;
        } finally {
            this.throughputCalculationLock.unlock();
        }
    }

    public final long getWrittenMessages() {
        this.throughputCalculationLock.lock();
        try {
            long j = this.writtenMessages;
            return j;
        } finally {
            this.throughputCalculationLock.unlock();
        }
    }

    public final double getReadBytesThroughput() {
        this.throughputCalculationLock.lock();
        try {
            resetThroughput();
            double d = this.readBytesThroughput;
            return d;
        } finally {
            this.throughputCalculationLock.unlock();
        }
    }

    public final double getWrittenBytesThroughput() {
        this.throughputCalculationLock.lock();
        try {
            resetThroughput();
            double d = this.writtenBytesThroughput;
            return d;
        } finally {
            this.throughputCalculationLock.unlock();
        }
    }

    public final double getReadMessagesThroughput() {
        this.throughputCalculationLock.lock();
        try {
            resetThroughput();
            double d = this.readMessagesThroughput;
            return d;
        } finally {
            this.throughputCalculationLock.unlock();
        }
    }

    public final double getWrittenMessagesThroughput() {
        this.throughputCalculationLock.lock();
        try {
            resetThroughput();
            double d = this.writtenMessagesThroughput;
            return d;
        } finally {
            this.throughputCalculationLock.unlock();
        }
    }

    public final double getLargestReadBytesThroughput() {
        this.throughputCalculationLock.lock();
        try {
            double d = this.largestReadBytesThroughput;
            return d;
        } finally {
            this.throughputCalculationLock.unlock();
        }
    }

    public final double getLargestWrittenBytesThroughput() {
        this.throughputCalculationLock.lock();
        try {
            double d = this.largestWrittenBytesThroughput;
            return d;
        } finally {
            this.throughputCalculationLock.unlock();
        }
    }

    public final double getLargestReadMessagesThroughput() {
        this.throughputCalculationLock.lock();
        try {
            double d = this.largestReadMessagesThroughput;
            return d;
        } finally {
            this.throughputCalculationLock.unlock();
        }
    }

    public final double getLargestWrittenMessagesThroughput() {
        this.throughputCalculationLock.lock();
        try {
            double d = this.largestWrittenMessagesThroughput;
            return d;
        } finally {
            this.throughputCalculationLock.unlock();
        }
    }

    public final int getThroughputCalculationInterval() {
        return this.throughputCalculationInterval.get();
    }

    public final long getThroughputCalculationIntervalInMillis() {
        return ((long) this.throughputCalculationInterval.get()) * 1000;
    }

    public final void setThroughputCalculationInterval(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("throughputCalculationInterval: " + i);
        }
        this.throughputCalculationInterval.set(i);
    }

    protected final void setLastReadTime(long j) {
        this.throughputCalculationLock.lock();
        try {
            this.lastReadTime = j;
        } finally {
            this.throughputCalculationLock.unlock();
        }
    }

    protected final void setLastWriteTime(long j) {
        this.throughputCalculationLock.lock();
        try {
            this.lastWriteTime = j;
        } finally {
            this.throughputCalculationLock.unlock();
        }
    }

    private void resetThroughput() {
        if (this.service.getManagedSessionCount() == 0) {
            this.readBytesThroughput = 0.0d;
            this.writtenBytesThroughput = 0.0d;
            this.readMessagesThroughput = 0.0d;
            this.writtenMessagesThroughput = 0.0d;
        }
    }

    public void updateThroughput(long j) {
        this.throughputCalculationLock.lock();
        try {
            int i = (int) (j - this.lastThroughputCalculationTime);
            long throughputCalculationIntervalInMillis = getThroughputCalculationIntervalInMillis();
            if (throughputCalculationIntervalInMillis == 0 || ((long) i) < throughputCalculationIntervalInMillis) {
                this.throughputCalculationLock.unlock();
                return;
            }
            throughputCalculationIntervalInMillis = this.readBytes;
            long j2 = this.writtenBytes;
            long j3 = this.readMessages;
            long j4 = this.writtenMessages;
            this.readBytesThroughput = (((double) (throughputCalculationIntervalInMillis - this.lastReadBytes)) * 1000.0d) / ((double) i);
            this.writtenBytesThroughput = (((double) (j2 - this.lastWrittenBytes)) * 1000.0d) / ((double) i);
            this.readMessagesThroughput = (((double) (j3 - this.lastReadMessages)) * 1000.0d) / ((double) i);
            this.writtenMessagesThroughput = (((double) (j4 - this.lastWrittenMessages)) * 1000.0d) / ((double) i);
            if (this.readBytesThroughput > this.largestReadBytesThroughput) {
                this.largestReadBytesThroughput = this.readBytesThroughput;
            }
            if (this.writtenBytesThroughput > this.largestWrittenBytesThroughput) {
                this.largestWrittenBytesThroughput = this.writtenBytesThroughput;
            }
            if (this.readMessagesThroughput > this.largestReadMessagesThroughput) {
                this.largestReadMessagesThroughput = this.readMessagesThroughput;
            }
            if (this.writtenMessagesThroughput > this.largestWrittenMessagesThroughput) {
                this.largestWrittenMessagesThroughput = this.writtenMessagesThroughput;
            }
            this.lastReadBytes = throughputCalculationIntervalInMillis;
            this.lastWrittenBytes = j2;
            this.lastReadMessages = j3;
            this.lastWrittenMessages = j4;
            this.lastThroughputCalculationTime = j;
            this.throughputCalculationLock.unlock();
        } catch (Throwable th) {
            this.throughputCalculationLock.unlock();
        }
    }

    public final void increaseReadBytes(long j, long j2) {
        this.throughputCalculationLock.lock();
        try {
            this.readBytes += j;
            this.lastReadTime = j2;
        } finally {
            this.throughputCalculationLock.unlock();
        }
    }

    public final void increaseReadMessages(long j) {
        this.throughputCalculationLock.lock();
        try {
            this.readMessages++;
            this.lastReadTime = j;
        } finally {
            this.throughputCalculationLock.unlock();
        }
    }

    public final void increaseWrittenBytes(int i, long j) {
        this.throughputCalculationLock.lock();
        try {
            this.writtenBytes += (long) i;
            this.lastWriteTime = j;
        } finally {
            this.throughputCalculationLock.unlock();
        }
    }

    public final void increaseWrittenMessages(long j) {
        this.throughputCalculationLock.lock();
        try {
            this.writtenMessages++;
            this.lastWriteTime = j;
        } finally {
            this.throughputCalculationLock.unlock();
        }
    }

    public final int getScheduledWriteBytes() {
        this.throughputCalculationLock.lock();
        try {
            int i = this.scheduledWriteBytes;
            return i;
        } finally {
            this.throughputCalculationLock.unlock();
        }
    }

    public final void increaseScheduledWriteBytes(int i) {
        this.throughputCalculationLock.lock();
        try {
            this.scheduledWriteBytes += i;
        } finally {
            this.throughputCalculationLock.unlock();
        }
    }

    public final int getScheduledWriteMessages() {
        this.throughputCalculationLock.lock();
        try {
            int i = this.scheduledWriteMessages;
            return i;
        } finally {
            this.throughputCalculationLock.unlock();
        }
    }

    public final void increaseScheduledWriteMessages() {
        this.throughputCalculationLock.lock();
        try {
            this.scheduledWriteMessages++;
        } finally {
            this.throughputCalculationLock.unlock();
        }
    }

    public final void decreaseScheduledWriteMessages() {
        this.throughputCalculationLock.lock();
        try {
            this.scheduledWriteMessages--;
        } finally {
            this.throughputCalculationLock.unlock();
        }
    }

    protected void setLastThroughputCalculationTime(long j) {
        this.throughputCalculationLock.lock();
        try {
            this.lastThroughputCalculationTime = j;
        } finally {
            this.throughputCalculationLock.unlock();
        }
    }
}
