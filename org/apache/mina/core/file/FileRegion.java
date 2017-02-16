package org.apache.mina.core.file;

import java.nio.channels.FileChannel;

public interface FileRegion {
    FileChannel getFileChannel();

    long getPosition();

    long getRemainingBytes();

    void update(long j);
}
