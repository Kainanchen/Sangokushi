package org.apache.mina.util.byteaccess;

import java.nio.ByteOrder;
import org.apache.mina.core.buffer.IoBuffer;

public class CompositeByteArrayRelativeWriter extends CompositeByteArrayRelativeBase implements IoRelativeWriter {
    private final boolean autoFlush;
    private final Expander expander;
    private final Flusher flusher;

    public interface Expander {
        void expand(CompositeByteArray compositeByteArray, int i);
    }

    public static class ChunkedExpander implements Expander {
        private final ByteArrayFactory baf;
        private final int newComponentSize;

        public ChunkedExpander(ByteArrayFactory byteArrayFactory, int i) {
            this.baf = byteArrayFactory;
            this.newComponentSize = i;
        }

        public void expand(CompositeByteArray compositeByteArray, int i) {
            while (i > 0) {
                compositeByteArray.addLast(this.baf.create(this.newComponentSize));
                i -= this.newComponentSize;
            }
        }
    }

    public interface Flusher {
        void flush(ByteArray byteArray);
    }

    public /* bridge */ /* synthetic */ ByteOrder order() {
        return super.order();
    }

    public CompositeByteArrayRelativeWriter(CompositeByteArray compositeByteArray, Expander expander, Flusher flusher, boolean z) {
        super(compositeByteArray);
        this.expander = expander;
        this.flusher = flusher;
        this.autoFlush = z;
    }

    private void prepareForAccess(int i) {
        int index = (this.cursor.getIndex() + i) - last();
        if (index > 0) {
            this.expander.expand(this.cba, index);
        }
    }

    public void flush() {
        flushTo(this.cursor.getIndex());
    }

    public void flushTo(int i) {
        this.flusher.flush(this.cba.removeTo(i));
    }

    public void skip(int i) {
        this.cursor.skip(i);
    }

    protected void cursorPassedFirstComponent() {
        if (this.autoFlush) {
            flushTo(this.cba.first() + this.cba.getFirst().length());
        }
    }

    public void put(byte b) {
        prepareForAccess(1);
        this.cursor.put(b);
    }

    public void put(IoBuffer ioBuffer) {
        prepareForAccess(ioBuffer.remaining());
        this.cursor.put(ioBuffer);
    }

    public void putShort(short s) {
        prepareForAccess(2);
        this.cursor.putShort(s);
    }

    public void putInt(int i) {
        prepareForAccess(4);
        this.cursor.putInt(i);
    }

    public void putLong(long j) {
        prepareForAccess(8);
        this.cursor.putLong(j);
    }

    public void putFloat(float f) {
        prepareForAccess(4);
        this.cursor.putFloat(f);
    }

    public void putDouble(double d) {
        prepareForAccess(8);
        this.cursor.putDouble(d);
    }

    public void putChar(char c) {
        prepareForAccess(2);
        this.cursor.putChar(c);
    }
}
