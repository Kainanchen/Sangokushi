package com.google.protobuf;

import com.sina.weibo.sdk.component.GameManager;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class ByteString implements Iterable<Byte> {
    static final /* synthetic */ boolean $assertionsDisabled;
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final ByteString EMPTY;
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;

    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    static final class CodedBuilder {
        private final byte[] buffer;
        private final CodedOutputStream output;

        private CodedBuilder(int i) {
            this.buffer = new byte[i];
            this.output = CodedOutputStream.newInstance(this.buffer);
        }

        public final ByteString build() {
            this.output.checkNoSpaceLeft();
            return new LiteralByteString(this.buffer);
        }

        public final CodedOutputStream getCodedOutput() {
            return this.output;
        }
    }

    public static final class Output extends OutputStream {
        private static final byte[] EMPTY_BYTE_ARRAY;
        private byte[] buffer;
        private int bufferPos;
        private final ArrayList<ByteString> flushedBuffers;
        private int flushedBuffersTotalBytes;
        private final int initialCapacity;

        static {
            EMPTY_BYTE_ARRAY = new byte[0];
        }

        Output(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.initialCapacity = i;
            this.flushedBuffers = new ArrayList();
            this.buffer = new byte[i];
        }

        public final synchronized void write(int i) {
            if (this.bufferPos == this.buffer.length) {
                flushFullBuffer(1);
            }
            byte[] bArr = this.buffer;
            int i2 = this.bufferPos;
            this.bufferPos = i2 + 1;
            bArr[i2] = (byte) i;
        }

        public final synchronized void write(byte[] bArr, int i, int i2) {
            if (i2 <= this.buffer.length - this.bufferPos) {
                System.arraycopy(bArr, i, this.buffer, this.bufferPos, i2);
                this.bufferPos += i2;
            } else {
                int length = this.buffer.length - this.bufferPos;
                System.arraycopy(bArr, i, this.buffer, this.bufferPos, length);
                int i3 = i + length;
                length = i2 - length;
                flushFullBuffer(length);
                System.arraycopy(bArr, i3, this.buffer, 0, length);
                this.bufferPos = length;
            }
        }

        public final synchronized ByteString toByteString() {
            flushLastBuffer();
            return ByteString.copyFrom(this.flushedBuffers);
        }

        private byte[] copyArray(byte[] bArr, int i) {
            Object obj = new byte[i];
            System.arraycopy(bArr, 0, obj, 0, Math.min(bArr.length, i));
            return obj;
        }

        public final void writeTo(OutputStream outputStream) {
            byte[] bArr;
            int i;
            synchronized (this) {
                ByteString[] byteStringArr = (ByteString[]) this.flushedBuffers.toArray(new ByteString[this.flushedBuffers.size()]);
                bArr = this.buffer;
                i = this.bufferPos;
            }
            for (ByteString writeTo : byteStringArr) {
                writeTo.writeTo(outputStream);
            }
            outputStream.write(copyArray(bArr, i));
        }

        public final synchronized int size() {
            return this.flushedBuffersTotalBytes + this.bufferPos;
        }

        public final synchronized void reset() {
            this.flushedBuffers.clear();
            this.flushedBuffersTotalBytes = 0;
            this.bufferPos = 0;
        }

        public final String toString() {
            return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
        }

        private void flushFullBuffer(int i) {
            this.flushedBuffers.add(new LiteralByteString(this.buffer));
            this.flushedBuffersTotalBytes += this.buffer.length;
            this.buffer = new byte[Math.max(this.initialCapacity, Math.max(i, this.flushedBuffersTotalBytes >>> 1))];
            this.bufferPos = 0;
        }

        private void flushLastBuffer() {
            if (this.bufferPos >= this.buffer.length) {
                this.flushedBuffers.add(new LiteralByteString(this.buffer));
                this.buffer = EMPTY_BYTE_ARRAY;
            } else if (this.bufferPos > 0) {
                this.flushedBuffers.add(new LiteralByteString(copyArray(this.buffer, this.bufferPos)));
            }
            this.flushedBuffersTotalBytes += this.bufferPos;
            this.bufferPos = 0;
        }
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i);

    public abstract void copyTo(ByteBuffer byteBuffer);

    protected abstract void copyToInternal(byte[] bArr, int i, int i2, int i3);

    public abstract boolean equals(Object obj);

    protected abstract int getTreeDepth();

    public abstract int hashCode();

    protected abstract boolean isBalanced();

    public abstract boolean isValidUtf8();

    public abstract ByteIterator iterator();

    public abstract CodedInputStream newCodedInput();

    public abstract InputStream newInput();

    protected abstract int partialHash(int i, int i2, int i3);

    protected abstract int partialIsValidUtf8(int i, int i2, int i3);

    protected abstract int peekCachedHashCode();

    public abstract int size();

    public abstract ByteString substring(int i, int i2);

    public abstract String toString(String str);

    public abstract void writeTo(OutputStream outputStream);

    abstract void writeToInternal(OutputStream outputStream, int i, int i2);

    static {
        boolean z;
        if (ByteString.class.desiredAssertionStatus()) {
            z = $assertionsDisabled;
        } else {
            z = true;
        }
        $assertionsDisabled = z;
        EMPTY = new LiteralByteString(new byte[0]);
    }

    ByteString() {
    }

    public boolean isEmpty() {
        return size() == 0 ? true : $assertionsDisabled;
    }

    public ByteString substring(int i) {
        return substring(i, size());
    }

    public boolean startsWith(ByteString byteString) {
        return (size() < byteString.size() || !substring(0, byteString.size()).equals(byteString)) ? $assertionsDisabled : true;
    }

    public boolean endsWith(ByteString byteString) {
        return (size() < byteString.size() || !substring(size() - byteString.size()).equals(byteString)) ? $assertionsDisabled : true;
    }

    public static ByteString copyFrom(byte[] bArr, int i, int i2) {
        Object obj = new byte[i2];
        System.arraycopy(bArr, i, obj, 0, i2);
        return new LiteralByteString(obj);
    }

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer, int i) {
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return new LiteralByteString(bArr);
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    public static ByteString copyFrom(String str, String str2) {
        return new LiteralByteString(str.getBytes(str2));
    }

    public static ByteString copyFromUtf8(String str) {
        try {
            return new LiteralByteString(str.getBytes(GameManager.DEFAULT_CHARSET));
        } catch (Throwable e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    public static ByteString readFrom(InputStream inputStream) {
        return readFrom(inputStream, MIN_READ_FROM_CHUNK_SIZE, MAX_READ_FROM_CHUNK_SIZE);
    }

    public static ByteString readFrom(InputStream inputStream, int i) {
        return readFrom(inputStream, i, i);
    }

    public static ByteString readFrom(InputStream inputStream, int i, int i2) {
        Iterable arrayList = new ArrayList();
        while (true) {
            ByteString readChunk = readChunk(inputStream, i);
            if (readChunk == null) {
                return copyFrom(arrayList);
            }
            arrayList.add(readChunk);
            i = Math.min(i * 2, i2);
        }
    }

    private static ByteString readChunk(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        if (i2 == 0) {
            return null;
        }
        return copyFrom(bArr, 0, i2);
    }

    public ByteString concat(ByteString byteString) {
        int size = size();
        int size2 = byteString.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            return RopeByteString.concatenate(this, byteString);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size + "+" + size2);
    }

    public static ByteString copyFrom(Iterable<ByteString> iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
        } else {
            Collection arrayList = new ArrayList();
            for (ByteString add : iterable) {
                arrayList.add(add);
            }
            iterable = arrayList;
        }
        if (iterable.isEmpty()) {
            return EMPTY;
        }
        return balancedConcat(iterable.iterator(), iterable.size());
    }

    private static ByteString balancedConcat(Iterator<ByteString> it, int i) {
        if (!$assertionsDisabled && i <= 0) {
            throw new AssertionError();
        } else if (i == 1) {
            return (ByteString) it.next();
        } else {
            int i2 = i >>> 1;
            return balancedConcat(it, i2).concat(balancedConcat(it, i - i2));
        }
    }

    public void copyTo(byte[] bArr, int i) {
        copyTo(bArr, 0, i, size());
    }

    public void copyTo(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Source offset < 0: " + i);
        } else if (i2 < 0) {
            throw new IndexOutOfBoundsException("Target offset < 0: " + i2);
        } else if (i3 < 0) {
            throw new IndexOutOfBoundsException("Length < 0: " + i3);
        } else if (i + i3 > size()) {
            throw new IndexOutOfBoundsException("Source end offset < 0: " + (i + i3));
        } else if (i2 + i3 > bArr.length) {
            throw new IndexOutOfBoundsException("Target end offset < 0: " + (i2 + i3));
        } else if (i3 > 0) {
            copyToInternal(bArr, i, i2, i3);
        }
    }

    public byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    void writeTo(OutputStream outputStream, int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Source offset < 0: " + i);
        } else if (i2 < 0) {
            throw new IndexOutOfBoundsException("Length < 0: " + i2);
        } else if (i + i2 > size()) {
            throw new IndexOutOfBoundsException("Source end offset exceeded: " + (i + i2));
        } else if (i2 > 0) {
            writeToInternal(outputStream, i, i2);
        }
    }

    public String toStringUtf8() {
        try {
            return toString(GameManager.DEFAULT_CHARSET);
        } catch (Throwable e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    public static Output newOutput(int i) {
        return new Output(i);
    }

    public static Output newOutput() {
        return new Output(CONCATENATE_BY_COPY_SIZE);
    }

    static CodedBuilder newCodedBuilder(int i) {
        return new CodedBuilder(null);
    }

    public String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }
}
