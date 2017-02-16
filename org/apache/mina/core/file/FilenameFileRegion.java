package org.apache.mina.core.file;

import java.io.File;
import java.nio.channels.FileChannel;

public class FilenameFileRegion extends DefaultFileRegion {
    private final File file;

    public FilenameFileRegion(File file, FileChannel fileChannel) {
        this(file, fileChannel, 0, file.length());
    }

    public FilenameFileRegion(File file, FileChannel fileChannel, long j, long j2) {
        super(fileChannel, j, j2);
        if (file == null) {
            throw new IllegalArgumentException("file can not be null");
        }
        this.file = file;
    }

    public String getFilename() {
        return this.file.getAbsolutePath();
    }
}
