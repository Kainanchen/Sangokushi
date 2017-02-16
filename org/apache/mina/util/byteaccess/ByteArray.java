package org.apache.mina.util.byteaccess;

import java.nio.ByteOrder;
import org.apache.mina.core.buffer.IoBuffer;

public interface ByteArray extends IoAbsoluteReader {

    public interface Cursor extends IoRelativeReader, IoRelativeWriter {
        byte get();

        void get(IoBuffer ioBuffer);

        int getIndex();

        int getInt();

        int getRemaining();

        boolean hasRemaining();

        void setIndex(int i);
    }

    Cursor cursor();

    Cursor cursor(int i);

    int first();

    void free();

    Iterable<IoBuffer> getIoBuffers();

    IoBuffer getSingleIoBuffer();

    int last();

    ByteOrder order();

    void order(ByteOrder byteOrder);
}
