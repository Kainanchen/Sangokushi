package org.apache.mina.core.buffer;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.EnumSet;
import java.util.Set;
import org.apache.mina.proxy.handlers.http.ntlm.NTLMConstants;
import org.apache.mina.proxy.handlers.socks.SocksProxyConstants;
import org.cocos2dx.lib.BuildConfig;
import org.cocos2dx.lib.Cocos2dxHandler;
import org.slf4j.spi.LocationAwareLogger;

public abstract class AbstractIoBuffer extends IoBuffer {
    private static final long BYTE_MASK = 255;
    private static final long INT_MASK = 4294967295L;
    private static final long SHORT_MASK = 65535;
    private boolean autoExpand;
    private boolean autoShrink;
    private final boolean derived;
    private int mark;
    private int minimumCapacity;
    private boolean recapacityAllowed;

    /* renamed from: org.apache.mina.core.buffer.AbstractIoBuffer.1 */
    class C03951 extends InputStream {
        C03951() {
        }

        public int available() {
            return AbstractIoBuffer.this.remaining();
        }

        public synchronized void mark(int i) {
            AbstractIoBuffer.this.mark();
        }

        public boolean markSupported() {
            return true;
        }

        public int read() {
            if (AbstractIoBuffer.this.hasRemaining()) {
                return AbstractIoBuffer.this.get() & 255;
            }
            return -1;
        }

        public int read(byte[] bArr, int i, int i2) {
            int remaining = AbstractIoBuffer.this.remaining();
            if (remaining <= 0) {
                return -1;
            }
            remaining = Math.min(remaining, i2);
            AbstractIoBuffer.this.get(bArr, i, remaining);
            return remaining;
        }

        public synchronized void reset() {
            AbstractIoBuffer.this.reset();
        }

        public long skip(long j) {
            int remaining;
            if (j > 2147483647L) {
                remaining = AbstractIoBuffer.this.remaining();
            } else {
                remaining = Math.min(AbstractIoBuffer.this.remaining(), (int) j);
            }
            AbstractIoBuffer.this.skip(remaining);
            return (long) remaining;
        }
    }

    /* renamed from: org.apache.mina.core.buffer.AbstractIoBuffer.2 */
    class C03962 extends OutputStream {
        C03962() {
        }

        public void write(byte[] bArr, int i, int i2) {
            AbstractIoBuffer.this.put(bArr, i, i2);
        }

        public void write(int i) {
            AbstractIoBuffer.this.put((byte) i);
        }
    }

    /* renamed from: org.apache.mina.core.buffer.AbstractIoBuffer.3 */
    class C03973 extends ObjectInputStream {
        final /* synthetic */ ClassLoader val$classLoader;

        C03973(InputStream inputStream, ClassLoader classLoader) {
            this.val$classLoader = classLoader;
            super(inputStream);
        }

        protected ObjectStreamClass readClassDescriptor() {
            int read = read();
            if (read < 0) {
                throw new EOFException();
            }
            switch (read) {
                case LocationAwareLogger.TRACE_INT /*0*/:
                    return super.readClassDescriptor();
                case Cocos2dxHandler.HANDLER_SHOW_DIALOG /*1*/:
                    return ObjectStreamClass.lookup(Class.forName(readUTF(), true, this.val$classLoader));
                default:
                    throw new StreamCorruptedException("Unexpected class descriptor type: " + read);
            }
        }

        protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) {
            Class<?> forClass = objectStreamClass.forClass();
            if (forClass != null) {
                return forClass;
            }
            try {
                return Class.forName(objectStreamClass.getName(), false, this.val$classLoader);
            } catch (ClassNotFoundException e) {
                return super.resolveClass(objectStreamClass);
            }
        }
    }

    /* renamed from: org.apache.mina.core.buffer.AbstractIoBuffer.4 */
    class C03984 extends ObjectOutputStream {
        C03984(OutputStream outputStream) {
            super(outputStream);
        }

        protected void writeClassDescriptor(ObjectStreamClass objectStreamClass) {
            Class forClass = objectStreamClass.forClass();
            if (forClass.isArray() || forClass.isPrimitive() || !Serializable.class.isAssignableFrom(forClass)) {
                write(0);
                super.writeClassDescriptor(objectStreamClass);
                return;
            }
            write(1);
            writeUTF(objectStreamClass.getName());
        }
    }

    protected abstract IoBuffer asReadOnlyBuffer0();

    protected abstract void buf(ByteBuffer byteBuffer);

    protected abstract IoBuffer duplicate0();

    protected abstract IoBuffer slice0();

    protected AbstractIoBuffer(IoBufferAllocator ioBufferAllocator, int i) {
        this.recapacityAllowed = true;
        this.mark = -1;
        IoBuffer.setAllocator(ioBufferAllocator);
        this.recapacityAllowed = true;
        this.derived = false;
        this.minimumCapacity = i;
    }

    protected AbstractIoBuffer(AbstractIoBuffer abstractIoBuffer) {
        this.recapacityAllowed = true;
        this.mark = -1;
        IoBuffer.setAllocator(IoBuffer.getAllocator());
        this.recapacityAllowed = false;
        this.derived = true;
        this.minimumCapacity = abstractIoBuffer.minimumCapacity;
    }

    public final boolean isDirect() {
        return buf().isDirect();
    }

    public final boolean isReadOnly() {
        return buf().isReadOnly();
    }

    public final int minimumCapacity() {
        return this.minimumCapacity;
    }

    public final IoBuffer minimumCapacity(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("minimumCapacity: " + i);
        }
        this.minimumCapacity = i;
        return this;
    }

    public final int capacity() {
        return buf().capacity();
    }

    public final IoBuffer capacity(int i) {
        if (this.recapacityAllowed) {
            if (i > capacity()) {
                int position = position();
                int limit = limit();
                ByteOrder order = order();
                ByteBuffer buf = buf();
                ByteBuffer allocateNioBuffer = IoBuffer.getAllocator().allocateNioBuffer(i, isDirect());
                buf.clear();
                allocateNioBuffer.put(buf);
                buf(allocateNioBuffer);
                buf().limit(limit);
                if (this.mark >= 0) {
                    buf().position(this.mark);
                    buf().mark();
                }
                buf().position(position);
                buf().order(order);
            }
            return this;
        }
        throw new IllegalStateException("Derived buffers and their parent can't be expanded.");
    }

    public final boolean isAutoExpand() {
        return this.autoExpand && this.recapacityAllowed;
    }

    public final boolean isAutoShrink() {
        return this.autoShrink && this.recapacityAllowed;
    }

    public final boolean isDerived() {
        return this.derived;
    }

    public final IoBuffer setAutoExpand(boolean z) {
        if (this.recapacityAllowed) {
            this.autoExpand = z;
            return this;
        }
        throw new IllegalStateException("Derived buffers and their parent can't be expanded.");
    }

    public final IoBuffer setAutoShrink(boolean z) {
        if (this.recapacityAllowed) {
            this.autoShrink = z;
            return this;
        }
        throw new IllegalStateException("Derived buffers and their parent can't be shrinked.");
    }

    public final IoBuffer expand(int i) {
        return expand(position(), i, false);
    }

    private IoBuffer expand(int i, boolean z) {
        return expand(position(), i, z);
    }

    public final IoBuffer expand(int i, int i2) {
        return expand(i, i2, false);
    }

    private IoBuffer expand(int i, int i2, boolean z) {
        if (this.recapacityAllowed) {
            int normalizeCapacity;
            int i3 = i + i2;
            if (z) {
                normalizeCapacity = IoBuffer.normalizeCapacity(i3);
            } else {
                normalizeCapacity = i3;
            }
            if (normalizeCapacity > capacity()) {
                capacity(normalizeCapacity);
            }
            if (i3 > limit()) {
                buf().limit(i3);
            }
            return this;
        }
        throw new IllegalStateException("Derived buffers and their parent can't be expanded.");
    }

    public final IoBuffer shrink() {
        if (this.recapacityAllowed) {
            int position = position();
            int capacity = capacity();
            int limit = limit();
            if (capacity != limit) {
                int max = Math.max(this.minimumCapacity, limit);
                int i = capacity;
                while ((i >>> 1) >= max) {
                    i >>>= 1;
                    if (max == 0) {
                        break;
                    }
                }
                i = Math.max(max, i);
                if (i != capacity) {
                    ByteOrder order = order();
                    ByteBuffer buf = buf();
                    ByteBuffer allocateNioBuffer = IoBuffer.getAllocator().allocateNioBuffer(i, isDirect());
                    buf.position(0);
                    buf.limit(limit);
                    allocateNioBuffer.put(buf);
                    buf(allocateNioBuffer);
                    buf().position(position);
                    buf().limit(limit);
                    buf().order(order);
                    this.mark = -1;
                }
            }
            return this;
        }
        throw new IllegalStateException("Derived buffers and their parent can't be expanded.");
    }

    public final int position() {
        return buf().position();
    }

    public final IoBuffer position(int i) {
        autoExpand(i, 0);
        buf().position(i);
        if (this.mark > i) {
            this.mark = -1;
        }
        return this;
    }

    public final int limit() {
        return buf().limit();
    }

    public final IoBuffer limit(int i) {
        autoExpand(i, 0);
        buf().limit(i);
        if (this.mark > i) {
            this.mark = -1;
        }
        return this;
    }

    public final IoBuffer mark() {
        ByteBuffer buf = buf();
        buf.mark();
        this.mark = buf.position();
        return this;
    }

    public final int markValue() {
        return this.mark;
    }

    public final IoBuffer reset() {
        buf().reset();
        return this;
    }

    public final IoBuffer clear() {
        buf().clear();
        this.mark = -1;
        return this;
    }

    public final IoBuffer sweep() {
        clear();
        return fillAndReset(remaining());
    }

    public final IoBuffer sweep(byte b) {
        clear();
        return fillAndReset(b, remaining());
    }

    public final IoBuffer flip() {
        buf().flip();
        this.mark = -1;
        return this;
    }

    public final IoBuffer rewind() {
        buf().rewind();
        this.mark = -1;
        return this;
    }

    public final int remaining() {
        ByteBuffer buf = buf();
        return buf.limit() - buf.position();
    }

    public final boolean hasRemaining() {
        ByteBuffer buf = buf();
        return buf.limit() > buf.position();
    }

    public final byte get() {
        return buf().get();
    }

    public final short getUnsigned() {
        return (short) (get() & 255);
    }

    public final IoBuffer put(byte b) {
        autoExpand(1);
        buf().put(b);
        return this;
    }

    public IoBuffer putUnsigned(byte b) {
        autoExpand(1);
        buf().put((byte) (b & 255));
        return this;
    }

    public IoBuffer putUnsigned(int i, byte b) {
        autoExpand(i, 1);
        buf().put(i, (byte) (b & 255));
        return this;
    }

    public IoBuffer putUnsigned(short s) {
        autoExpand(1);
        buf().put((byte) (s & 255));
        return this;
    }

    public IoBuffer putUnsigned(int i, short s) {
        autoExpand(i, 1);
        buf().put(i, (byte) (s & 255));
        return this;
    }

    public IoBuffer putUnsigned(int i) {
        autoExpand(1);
        buf().put((byte) (i & 255));
        return this;
    }

    public IoBuffer putUnsigned(int i, int i2) {
        autoExpand(i, 1);
        buf().put(i, (byte) (i2 & 255));
        return this;
    }

    public IoBuffer putUnsigned(long j) {
        autoExpand(1);
        buf().put((byte) ((int) (BYTE_MASK & j)));
        return this;
    }

    public IoBuffer putUnsigned(int i, long j) {
        autoExpand(i, 1);
        buf().put(i, (byte) ((int) (BYTE_MASK & j)));
        return this;
    }

    public final byte get(int i) {
        return buf().get(i);
    }

    public final short getUnsigned(int i) {
        return (short) (get(i) & 255);
    }

    public final IoBuffer put(int i, byte b) {
        autoExpand(i, 1);
        buf().put(i, b);
        return this;
    }

    public final IoBuffer get(byte[] bArr, int i, int i2) {
        buf().get(bArr, i, i2);
        return this;
    }

    public final IoBuffer put(ByteBuffer byteBuffer) {
        autoExpand(byteBuffer.remaining());
        buf().put(byteBuffer);
        return this;
    }

    public final IoBuffer put(byte[] bArr, int i, int i2) {
        autoExpand(i2);
        buf().put(bArr, i, i2);
        return this;
    }

    public final IoBuffer compact() {
        int remaining = remaining();
        int capacity = capacity();
        if (capacity != 0) {
            if (!isAutoShrink() || remaining > (capacity >>> 2) || capacity <= this.minimumCapacity) {
                buf().compact();
            } else {
                int max = Math.max(this.minimumCapacity, remaining << 1);
                int i = capacity;
                while ((i >>> 1) >= max) {
                    i >>>= 1;
                }
                i = Math.max(max, i);
                if (i != capacity) {
                    ByteOrder order = order();
                    if (remaining > i) {
                        throw new IllegalStateException("The amount of the remaining bytes is greater than the new capacity.");
                    }
                    ByteBuffer buf = buf();
                    ByteBuffer allocateNioBuffer = IoBuffer.getAllocator().allocateNioBuffer(i, isDirect());
                    allocateNioBuffer.put(buf);
                    buf(allocateNioBuffer);
                    buf().order(order);
                }
            }
            this.mark = -1;
        }
        return this;
    }

    public final ByteOrder order() {
        return buf().order();
    }

    public final IoBuffer order(ByteOrder byteOrder) {
        buf().order(byteOrder);
        return this;
    }

    public final char getChar() {
        return buf().getChar();
    }

    public final IoBuffer putChar(char c) {
        autoExpand(2);
        buf().putChar(c);
        return this;
    }

    public final char getChar(int i) {
        return buf().getChar(i);
    }

    public final IoBuffer putChar(int i, char c) {
        autoExpand(i, 2);
        buf().putChar(i, c);
        return this;
    }

    public final CharBuffer asCharBuffer() {
        return buf().asCharBuffer();
    }

    public final short getShort() {
        return buf().getShort();
    }

    public final IoBuffer putShort(short s) {
        autoExpand(2);
        buf().putShort(s);
        return this;
    }

    public final short getShort(int i) {
        return buf().getShort(i);
    }

    public final IoBuffer putShort(int i, short s) {
        autoExpand(i, 2);
        buf().putShort(i, s);
        return this;
    }

    public final ShortBuffer asShortBuffer() {
        return buf().asShortBuffer();
    }

    public final int getInt() {
        return buf().getInt();
    }

    public final IoBuffer putInt(int i) {
        autoExpand(4);
        buf().putInt(i);
        return this;
    }

    public final IoBuffer putUnsignedInt(byte b) {
        autoExpand(4);
        buf().putInt(b & 255);
        return this;
    }

    public final IoBuffer putUnsignedInt(int i, byte b) {
        autoExpand(i, 4);
        buf().putInt(i, b & 255);
        return this;
    }

    public final IoBuffer putUnsignedInt(short s) {
        autoExpand(4);
        buf().putInt(65535 & s);
        return this;
    }

    public final IoBuffer putUnsignedInt(int i, short s) {
        autoExpand(i, 4);
        buf().putInt(i, 65535 & s);
        return this;
    }

    public final IoBuffer putUnsignedInt(int i) {
        autoExpand(4);
        buf().putInt(i);
        return this;
    }

    public final IoBuffer putUnsignedInt(int i, int i2) {
        autoExpand(i, 4);
        buf().putInt(i, i2);
        return this;
    }

    public final IoBuffer putUnsignedInt(long j) {
        autoExpand(4);
        buf().putInt((int) (-1 & j));
        return this;
    }

    public final IoBuffer putUnsignedInt(int i, long j) {
        autoExpand(i, 4);
        buf().putInt(i, (int) (INT_MASK & j));
        return this;
    }

    public final IoBuffer putUnsignedShort(byte b) {
        autoExpand(2);
        buf().putShort((short) (b & 255));
        return this;
    }

    public final IoBuffer putUnsignedShort(int i, byte b) {
        autoExpand(i, 2);
        buf().putShort(i, (short) (b & 255));
        return this;
    }

    public final IoBuffer putUnsignedShort(short s) {
        autoExpand(2);
        buf().putShort(s);
        return this;
    }

    public final IoBuffer putUnsignedShort(int i, short s) {
        autoExpand(i, 2);
        buf().putShort(i, s);
        return this;
    }

    public final IoBuffer putUnsignedShort(int i) {
        autoExpand(2);
        buf().putShort((short) i);
        return this;
    }

    public final IoBuffer putUnsignedShort(int i, int i2) {
        autoExpand(i, 2);
        buf().putShort(i, (short) i2);
        return this;
    }

    public final IoBuffer putUnsignedShort(long j) {
        autoExpand(2);
        buf().putShort((short) ((int) j));
        return this;
    }

    public final IoBuffer putUnsignedShort(int i, long j) {
        autoExpand(i, 2);
        buf().putShort(i, (short) ((int) j));
        return this;
    }

    public final int getInt(int i) {
        return buf().getInt(i);
    }

    public final IoBuffer putInt(int i, int i2) {
        autoExpand(i, 4);
        buf().putInt(i, i2);
        return this;
    }

    public final IntBuffer asIntBuffer() {
        return buf().asIntBuffer();
    }

    public final long getLong() {
        return buf().getLong();
    }

    public final IoBuffer putLong(long j) {
        autoExpand(8);
        buf().putLong(j);
        return this;
    }

    public final long getLong(int i) {
        return buf().getLong(i);
    }

    public final IoBuffer putLong(int i, long j) {
        autoExpand(i, 8);
        buf().putLong(i, j);
        return this;
    }

    public final LongBuffer asLongBuffer() {
        return buf().asLongBuffer();
    }

    public final float getFloat() {
        return buf().getFloat();
    }

    public final IoBuffer putFloat(float f) {
        autoExpand(4);
        buf().putFloat(f);
        return this;
    }

    public final float getFloat(int i) {
        return buf().getFloat(i);
    }

    public final IoBuffer putFloat(int i, float f) {
        autoExpand(i, 4);
        buf().putFloat(i, f);
        return this;
    }

    public final FloatBuffer asFloatBuffer() {
        return buf().asFloatBuffer();
    }

    public final double getDouble() {
        return buf().getDouble();
    }

    public final IoBuffer putDouble(double d) {
        autoExpand(8);
        buf().putDouble(d);
        return this;
    }

    public final double getDouble(int i) {
        return buf().getDouble(i);
    }

    public final IoBuffer putDouble(int i, double d) {
        autoExpand(i, 8);
        buf().putDouble(i, d);
        return this;
    }

    public final DoubleBuffer asDoubleBuffer() {
        return buf().asDoubleBuffer();
    }

    public final IoBuffer asReadOnlyBuffer() {
        this.recapacityAllowed = false;
        return asReadOnlyBuffer0();
    }

    public final IoBuffer duplicate() {
        this.recapacityAllowed = false;
        return duplicate0();
    }

    public final IoBuffer slice() {
        this.recapacityAllowed = false;
        return slice0();
    }

    public final IoBuffer getSlice(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("length: " + i2);
        }
        int position = position();
        int limit = limit();
        if (i > limit) {
            throw new IllegalArgumentException("index: " + i);
        }
        int i3 = i + i2;
        if (i3 > limit) {
            throw new IndexOutOfBoundsException("index + length (" + i3 + ") is greater than limit (" + limit + ").");
        }
        clear();
        limit(i3);
        position(i);
        IoBuffer slice = slice();
        limit(limit);
        position(position);
        return slice;
    }

    public final IoBuffer getSlice(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("length: " + i);
        }
        int position = position();
        int limit = limit();
        position += i;
        if (limit < position) {
            throw new IndexOutOfBoundsException("position + length (" + position + ") is greater than limit (" + limit + ").");
        }
        limit(position);
        IoBuffer slice = slice();
        position(position);
        limit(limit);
        return slice;
    }

    public int hashCode() {
        int i = 1;
        for (int limit = limit() - 1; limit >= position(); limit--) {
            i = (i * 31) + get(limit);
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IoBuffer)) {
            return false;
        }
        IoBuffer ioBuffer = (IoBuffer) obj;
        if (remaining() != ioBuffer.remaining()) {
            return false;
        }
        int position = position();
        int limit = limit() - 1;
        int limit2 = ioBuffer.limit() - 1;
        while (limit >= position) {
            if (get(limit) != ioBuffer.get(limit2)) {
                return false;
            }
            limit--;
            limit2--;
        }
        return true;
    }

    public int compareTo(IoBuffer ioBuffer) {
        int position = position() + Math.min(remaining(), ioBuffer.remaining());
        int position2 = position();
        int position3 = ioBuffer.position();
        while (position2 < position) {
            byte b = get(position2);
            byte b2 = ioBuffer.get(position3);
            if (b == b2) {
                position2++;
                position3++;
            } else if (b < b2) {
                return -1;
            } else {
                return 1;
            }
        }
        return remaining() - ioBuffer.remaining();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (isDirect()) {
            stringBuilder.append("DirectBuffer");
        } else {
            stringBuilder.append("HeapBuffer");
        }
        stringBuilder.append("[pos=");
        stringBuilder.append(position());
        stringBuilder.append(" lim=");
        stringBuilder.append(limit());
        stringBuilder.append(" cap=");
        stringBuilder.append(capacity());
        stringBuilder.append(": ");
        stringBuilder.append(getHexDump(16));
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public IoBuffer get(byte[] bArr) {
        return get(bArr, 0, bArr.length);
    }

    public IoBuffer put(IoBuffer ioBuffer) {
        return put(ioBuffer.buf());
    }

    public IoBuffer put(byte[] bArr) {
        return put(bArr, 0, bArr.length);
    }

    public int getUnsignedShort() {
        return getShort() & 65535;
    }

    public int getUnsignedShort(int i) {
        return getShort(i) & 65535;
    }

    public long getUnsignedInt() {
        return ((long) getInt()) & INT_MASK;
    }

    public int getMediumInt() {
        byte b = get();
        byte b2 = get();
        byte b3 = get();
        if (ByteOrder.BIG_ENDIAN.equals(order())) {
            return getMediumInt(b, b2, b3);
        }
        return getMediumInt(b3, b2, b);
    }

    public int getUnsignedMediumInt() {
        short unsigned = getUnsigned();
        short unsigned2 = getUnsigned();
        short unsigned3 = getUnsigned();
        if (ByteOrder.BIG_ENDIAN.equals(order())) {
            return ((unsigned << 16) | (unsigned2 << 8)) | unsigned3;
        }
        return unsigned | ((unsigned2 << 8) | (unsigned3 << 16));
    }

    public int getMediumInt(int i) {
        byte b = get(i);
        byte b2 = get(i + 1);
        byte b3 = get(i + 2);
        if (ByteOrder.BIG_ENDIAN.equals(order())) {
            return getMediumInt(b, b2, b3);
        }
        return getMediumInt(b3, b2, b);
    }

    public int getUnsignedMediumInt(int i) {
        short unsigned = getUnsigned(i);
        short unsigned2 = getUnsigned(i + 1);
        short unsigned3 = getUnsigned(i + 2);
        if (ByteOrder.BIG_ENDIAN.equals(order())) {
            return ((unsigned << 16) | (unsigned2 << 8)) | unsigned3;
        }
        return unsigned | ((unsigned2 << 8) | (unsigned3 << 16));
    }

    private int getMediumInt(byte b, byte b2, byte b3) {
        int i = (((b << 16) & 16711680) | ((b2 << 8) & 65280)) | (b3 & 255);
        if ((b & NTLMConstants.FLAG_NEGOTIATE_LAN_MANAGER_KEY) == NTLMConstants.FLAG_NEGOTIATE_LAN_MANAGER_KEY) {
            return i | -16777216;
        }
        return i;
    }

    public IoBuffer putMediumInt(int i) {
        byte b = (byte) (i >> 16);
        byte b2 = (byte) (i >> 8);
        byte b3 = (byte) i;
        if (ByteOrder.BIG_ENDIAN.equals(order())) {
            put(b).put(b2).put(b3);
        } else {
            put(b3).put(b2).put(b);
        }
        return this;
    }

    public IoBuffer putMediumInt(int i, int i2) {
        byte b = (byte) (i2 >> 16);
        byte b2 = (byte) (i2 >> 8);
        byte b3 = (byte) i2;
        if (ByteOrder.BIG_ENDIAN.equals(order())) {
            put(i, b).put(i + 1, b2).put(i + 2, b3);
        } else {
            put(i, b3).put(i + 1, b2).put(i + 2, b);
        }
        return this;
    }

    public long getUnsignedInt(int i) {
        return ((long) getInt(i)) & INT_MASK;
    }

    public InputStream asInputStream() {
        return new C03951();
    }

    public OutputStream asOutputStream() {
        return new C03962();
    }

    public String getHexDump() {
        return getHexDump(Integer.MAX_VALUE);
    }

    public String getHexDump(int i) {
        return IoBufferHexDumper.getHexdump(this, i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getString(java.nio.charset.CharsetDecoder r9) {
        /*
        r8 = this;
        r5 = 1;
        r6 = 0;
        r0 = r8.hasRemaining();
        if (r0 != 0) goto L_0x000b;
    L_0x0008:
        r0 = "";
    L_0x000a:
        return r0;
    L_0x000b:
        r0 = r9.charset();
        r0 = r0.name();
        r1 = "UTF-16";
        r0 = r0.startsWith(r1);
        r1 = r8.position();
        r3 = r8.limit();
        r2 = -1;
        if (r0 != 0) goto L_0x0038;
    L_0x0024:
        r0 = r8.indexOf(r6);
        if (r0 >= 0) goto L_0x0034;
    L_0x002a:
        r0 = r3;
        r4 = r3;
    L_0x002c:
        if (r1 != r0) goto L_0x0069;
    L_0x002e:
        r8.position(r4);
        r0 = "";
        goto L_0x000a;
    L_0x0034:
        r2 = r0 + 1;
        r4 = r2;
        goto L_0x002c;
    L_0x0038:
        r0 = r1;
    L_0x0039:
        r4 = r8.get(r0);
        if (r4 != 0) goto L_0x0058;
    L_0x003f:
        r4 = r5;
    L_0x0040:
        r0 = r0 + 1;
        if (r0 >= r3) goto L_0x00d1;
    L_0x0044:
        r7 = r8.get(r0);
        if (r7 == 0) goto L_0x005a;
    L_0x004a:
        r0 = r0 + 1;
        if (r0 < r3) goto L_0x0039;
    L_0x004e:
        r0 = r2;
    L_0x004f:
        if (r0 >= 0) goto L_0x005f;
    L_0x0051:
        r0 = r3 - r1;
        r0 = r0 & -2;
        r0 = r0 + r1;
        r4 = r0;
        goto L_0x002c;
    L_0x0058:
        r4 = r6;
        goto L_0x0040;
    L_0x005a:
        if (r4 == 0) goto L_0x0039;
    L_0x005c:
        r0 = r0 + -1;
        goto L_0x004f;
    L_0x005f:
        r2 = r0 + 2;
        if (r2 > r3) goto L_0x0067;
    L_0x0063:
        r2 = r0 + 2;
        r4 = r2;
        goto L_0x002c;
    L_0x0067:
        r4 = r0;
        goto L_0x002c;
    L_0x0069:
        r8.limit(r0);
        r9.reset();
        r0 = r8.remaining();
        r0 = (float) r0;
        r2 = r9.averageCharsPerByte();
        r0 = r0 * r2;
        r0 = (int) r0;
        r6 = r0 + 1;
        r0 = java.nio.CharBuffer.allocate(r6);
        r2 = r0;
    L_0x0081:
        r0 = r8.hasRemaining();
        if (r0 == 0) goto L_0x00ac;
    L_0x0087:
        r0 = r8.buf();
        r0 = r9.decode(r0, r2, r5);
    L_0x008f:
        r7 = r0.isUnderflow();
        if (r7 != 0) goto L_0x00c1;
    L_0x0095:
        r7 = r0.isOverflow();
        if (r7 == 0) goto L_0x00b1;
    L_0x009b:
        r0 = r2.capacity();
        r0 = r0 + r6;
        r0 = java.nio.CharBuffer.allocate(r0);
        r2.flip();
        r0.put(r2);
        r2 = r0;
        goto L_0x0081;
    L_0x00ac:
        r0 = r9.flush(r2);
        goto L_0x008f;
    L_0x00b1:
        r7 = r0.isError();
        if (r7 == 0) goto L_0x0081;
    L_0x00b7:
        r8.limit(r3);
        r8.position(r1);
        r0.throwException();
        goto L_0x0081;
    L_0x00c1:
        r8.limit(r3);
        r8.position(r4);
        r0 = r2.flip();
        r0 = r0.toString();
        goto L_0x000a;
    L_0x00d1:
        r0 = r2;
        goto L_0x004f;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.mina.core.buffer.AbstractIoBuffer.getString(java.nio.charset.CharsetDecoder):java.lang.String");
    }

    public String getString(int i, CharsetDecoder charsetDecoder) {
        checkFieldSize(i);
        if (i == 0) {
            return BuildConfig.FLAVOR;
        }
        if (!hasRemaining()) {
            return BuildConfig.FLAVOR;
        }
        boolean startsWith = charsetDecoder.charset().name().startsWith("UTF-16");
        if (!startsWith || (i & 1) == 0) {
            int position = position();
            int limit = limit();
            int i2 = position + i;
            if (limit < i2) {
                throw new BufferUnderflowException();
            }
            int i3;
            if (startsWith) {
                i3 = position;
                while (i3 < i2 && (get(i3) != null || get(i3 + 1) != null)) {
                    i3 += 2;
                }
                if (i3 == i2) {
                    limit(i2);
                } else {
                    limit(i3);
                }
            } else {
                i3 = position;
                while (i3 < i2 && get(i3) != null) {
                    i3++;
                }
                if (i3 == i2) {
                    limit(i2);
                } else {
                    limit(i3);
                }
            }
            if (hasRemaining()) {
                charsetDecoder.reset();
                int remaining = ((int) (((float) remaining()) * charsetDecoder.averageCharsPerByte())) + 1;
                CharBuffer allocate = CharBuffer.allocate(remaining);
                while (true) {
                    CoderResult decode;
                    if (hasRemaining()) {
                        decode = charsetDecoder.decode(buf(), allocate, true);
                    } else {
                        decode = charsetDecoder.flush(allocate);
                    }
                    if (decode.isUnderflow()) {
                        limit(limit);
                        position(i2);
                        return allocate.flip().toString();
                    } else if (decode.isOverflow()) {
                        CharBuffer allocate2 = CharBuffer.allocate(allocate.capacity() + remaining);
                        allocate.flip();
                        allocate2.put(allocate);
                        allocate = allocate2;
                    } else if (decode.isError()) {
                        limit(limit);
                        position(position);
                        decode.throwException();
                    }
                }
            } else {
                limit(limit);
                position(i2);
                return BuildConfig.FLAVOR;
            }
        }
        throw new IllegalArgumentException("fieldSize is not even.");
    }

    public IoBuffer putString(CharSequence charSequence, CharsetEncoder charsetEncoder) {
        if (charSequence.length() != 0) {
            CharBuffer wrap = CharBuffer.wrap(charSequence);
            charsetEncoder.reset();
            int i = 0;
            while (true) {
                CoderResult encode;
                if (wrap.hasRemaining()) {
                    encode = charsetEncoder.encode(wrap, buf(), true);
                } else {
                    encode = charsetEncoder.flush(buf());
                }
                if (!encode.isUnderflow()) {
                    if (!encode.isOverflow()) {
                        i = 0;
                    } else if (isAutoExpand()) {
                        switch (i) {
                            case LocationAwareLogger.TRACE_INT /*0*/:
                                autoExpand((int) Math.ceil((double) (((float) wrap.remaining()) * charsetEncoder.averageBytesPerChar())));
                                i++;
                                break;
                            case Cocos2dxHandler.HANDLER_SHOW_DIALOG /*1*/:
                                autoExpand((int) Math.ceil((double) (((float) wrap.remaining()) * charsetEncoder.maxBytesPerChar())));
                                i++;
                                break;
                            default:
                                throw new RuntimeException("Expanded by " + ((int) Math.ceil((double) (((float) wrap.remaining()) * charsetEncoder.maxBytesPerChar()))) + " but that wasn't enough for '" + charSequence + "'");
                        }
                    }
                    encode.throwException();
                }
            }
        }
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.apache.mina.core.buffer.IoBuffer putString(java.lang.CharSequence r8, int r9, java.nio.charset.CharsetEncoder r10) {
        /*
        r7 = this;
        r6 = 0;
        checkFieldSize(r9);
        if (r9 != 0) goto L_0x0007;
    L_0x0006:
        return r7;
    L_0x0007:
        r7.autoExpand(r9);
        r0 = r10.charset();
        r0 = r0.name();
        r1 = "UTF-16";
        r1 = r0.startsWith(r1);
        if (r1 == 0) goto L_0x0026;
    L_0x001a:
        r0 = r9 & 1;
        if (r0 == 0) goto L_0x0026;
    L_0x001e:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "fieldSize is not even.";
        r0.<init>(r1);
        throw r0;
    L_0x0026:
        r2 = r7.limit();
        r0 = r7.position();
        r3 = r0 + r9;
        if (r2 >= r3) goto L_0x0038;
    L_0x0032:
        r0 = new java.nio.BufferOverflowException;
        r0.<init>();
        throw r0;
    L_0x0038:
        r0 = r8.length();
        if (r0 != 0) goto L_0x004e;
    L_0x003e:
        if (r1 != 0) goto L_0x0047;
    L_0x0040:
        r7.put(r6);
    L_0x0043:
        r7.position(r3);
        goto L_0x0006;
    L_0x0047:
        r7.put(r6);
        r7.put(r6);
        goto L_0x0043;
    L_0x004e:
        r4 = java.nio.CharBuffer.wrap(r8);
        r7.limit(r3);
        r10.reset();
    L_0x0058:
        r0 = r4.hasRemaining();
        if (r0 == 0) goto L_0x0077;
    L_0x005e:
        r0 = r7.buf();
        r5 = 1;
        r0 = r10.encode(r4, r0, r5);
    L_0x0067:
        r5 = r0.isUnderflow();
        if (r5 != 0) goto L_0x0080;
    L_0x006d:
        r5 = r0.isOverflow();
        if (r5 != 0) goto L_0x0080;
    L_0x0073:
        r0.throwException();
        goto L_0x0058;
    L_0x0077:
        r0 = r7.buf();
        r0 = r10.flush(r0);
        goto L_0x0067;
    L_0x0080:
        r7.limit(r2);
        r0 = r7.position();
        if (r0 >= r3) goto L_0x008e;
    L_0x0089:
        if (r1 != 0) goto L_0x0093;
    L_0x008b:
        r7.put(r6);
    L_0x008e:
        r7.position(r3);
        goto L_0x0006;
    L_0x0093:
        r7.put(r6);
        r7.put(r6);
        goto L_0x008e;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.mina.core.buffer.AbstractIoBuffer.putString(java.lang.CharSequence, int, java.nio.charset.CharsetEncoder):org.apache.mina.core.buffer.IoBuffer");
    }

    public String getPrefixedString(CharsetDecoder charsetDecoder) {
        return getPrefixedString(2, charsetDecoder);
    }

    public String getPrefixedString(int i, CharsetDecoder charsetDecoder) {
        if (prefixedDataAvailable(i)) {
            int i2 = 0;
            switch (i) {
                case Cocos2dxHandler.HANDLER_SHOW_DIALOG /*1*/:
                    i2 = getUnsigned();
                    break;
                case SocksProxyConstants.SOCKS5_REQUEST_STEP /*2*/:
                    i2 = getUnsignedShort();
                    break;
                case NTLMConstants.FLAG_REQUEST_SERVER_AUTH_REALM /*4*/:
                    i2 = getInt();
                    break;
            }
            if (i2 == 0) {
                return BuildConfig.FLAVOR;
            }
            if (!charsetDecoder.charset().name().startsWith("UTF-16") || (i2 & 1) == 0) {
                int limit = limit();
                int position = position() + i2;
                if (limit < position) {
                    throw new BufferUnderflowException();
                }
                limit(position);
                charsetDecoder.reset();
                int remaining = ((int) (((float) remaining()) * charsetDecoder.averageCharsPerByte())) + 1;
                CharBuffer allocate = CharBuffer.allocate(remaining);
                while (true) {
                    CoderResult decode;
                    if (hasRemaining()) {
                        decode = charsetDecoder.decode(buf(), allocate, true);
                    } else {
                        decode = charsetDecoder.flush(allocate);
                    }
                    if (decode.isUnderflow()) {
                        limit(limit);
                        position(position);
                        return allocate.flip().toString();
                    } else if (decode.isOverflow()) {
                        CharBuffer allocate2 = CharBuffer.allocate(allocate.capacity() + remaining);
                        allocate.flip();
                        allocate2.put(allocate);
                        allocate = allocate2;
                    } else {
                        decode.throwException();
                    }
                }
            } else {
                throw new BufferDataException("fieldSize is not even for a UTF-16 string.");
            }
        }
        throw new BufferUnderflowException();
    }

    public IoBuffer putPrefixedString(CharSequence charSequence, CharsetEncoder charsetEncoder) {
        return putPrefixedString(charSequence, 2, 0, charsetEncoder);
    }

    public IoBuffer putPrefixedString(CharSequence charSequence, int i, CharsetEncoder charsetEncoder) {
        return putPrefixedString(charSequence, i, 0, charsetEncoder);
    }

    public IoBuffer putPrefixedString(CharSequence charSequence, int i, int i2, CharsetEncoder charsetEncoder) {
        return putPrefixedString(charSequence, i, i2, (byte) 0, charsetEncoder);
    }

    public IoBuffer putPrefixedString(CharSequence charSequence, int i, int i2, byte b, CharsetEncoder charsetEncoder) {
        int i3;
        switch (i) {
            case Cocos2dxHandler.HANDLER_SHOW_DIALOG /*1*/:
                i3 = 255;
                break;
            case SocksProxyConstants.SOCKS5_REQUEST_STEP /*2*/:
                i3 = 65535;
                break;
            case NTLMConstants.FLAG_REQUEST_SERVER_AUTH_REALM /*4*/:
                i3 = Integer.MAX_VALUE;
                break;
            default:
                throw new IllegalArgumentException("prefixLength: " + i);
        }
        if (charSequence.length() > i3) {
            throw new IllegalArgumentException("The specified string is too long.");
        }
        if (charSequence.length() != 0) {
            int i4;
            switch (i2) {
                case LocationAwareLogger.TRACE_INT /*0*/:
                case Cocos2dxHandler.HANDLER_SHOW_DIALOG /*1*/:
                    i4 = 0;
                    break;
                case SocksProxyConstants.SOCKS5_REQUEST_STEP /*2*/:
                    i4 = 1;
                    break;
                case NTLMConstants.FLAG_REQUEST_SERVER_AUTH_REALM /*4*/:
                    i4 = 3;
                    break;
                default:
                    throw new IllegalArgumentException("padding: " + i2);
            }
            CharBuffer wrap = CharBuffer.wrap(charSequence);
            skip(i);
            int position = position();
            charsetEncoder.reset();
            int i5 = 0;
            while (true) {
                CoderResult encode;
                if (wrap.hasRemaining()) {
                    encode = charsetEncoder.encode(wrap, buf(), true);
                } else {
                    encode = charsetEncoder.flush(buf());
                }
                if (position() - position <= i3) {
                    if (encode.isUnderflow()) {
                        fill(b, i2 - ((position() - position) & i4));
                        i3 = position() - position;
                        switch (i) {
                            case Cocos2dxHandler.HANDLER_SHOW_DIALOG /*1*/:
                                put(position - 1, (byte) i3);
                                break;
                            case SocksProxyConstants.SOCKS5_REQUEST_STEP /*2*/:
                                putShort(position - 2, (short) i3);
                                break;
                            case NTLMConstants.FLAG_REQUEST_SERVER_AUTH_REALM /*4*/:
                                putInt(position - 4, i3);
                                break;
                            default:
                                break;
                        }
                    }
                    if (!encode.isOverflow()) {
                        i5 = 0;
                    } else if (isAutoExpand()) {
                        switch (i5) {
                            case LocationAwareLogger.TRACE_INT /*0*/:
                                autoExpand((int) Math.ceil((double) (((float) wrap.remaining()) * charsetEncoder.averageBytesPerChar())));
                                i5++;
                                break;
                            case Cocos2dxHandler.HANDLER_SHOW_DIALOG /*1*/:
                                autoExpand((int) Math.ceil((double) (((float) wrap.remaining()) * charsetEncoder.maxBytesPerChar())));
                                i5++;
                                break;
                            default:
                                throw new RuntimeException("Expanded by " + ((int) Math.ceil((double) (((float) wrap.remaining()) * charsetEncoder.maxBytesPerChar()))) + " but that wasn't enough for '" + charSequence + "'");
                        }
                    }
                    encode.throwException();
                } else {
                    throw new IllegalArgumentException("The specified string is too long.");
                }
            }
        }
        switch (i) {
            case Cocos2dxHandler.HANDLER_SHOW_DIALOG /*1*/:
                put((byte) 0);
                break;
            case SocksProxyConstants.SOCKS5_REQUEST_STEP /*2*/:
                putShort((short) 0);
                break;
            case NTLMConstants.FLAG_REQUEST_SERVER_AUTH_REALM /*4*/:
                putInt(0);
                break;
        }
        return this;
    }

    public Object getObject() {
        return getObject(Thread.currentThread().getContextClassLoader());
    }

    public Object getObject(ClassLoader classLoader) {
        Throwable e;
        if (prefixedDataAvailable(4)) {
            int i = getInt();
            if (i <= 4) {
                throw new BufferDataException("Object length should be greater than 4: " + i);
            }
            int limit = limit();
            limit(i + position());
            ObjectInputStream c03973;
            try {
                c03973 = new C03973(asInputStream(), classLoader);
                try {
                    Object readObject = c03973.readObject();
                    try {
                        c03973.close();
                    } catch (IOException e2) {
                    }
                    limit(limit);
                    return readObject;
                } catch (IOException e3) {
                    e = e3;
                    try {
                        throw new BufferDataException(e);
                    } catch (Throwable th) {
                        e = th;
                        if (c03973 != null) {
                            try {
                                c03973.close();
                            } catch (IOException e4) {
                            }
                        }
                        limit(limit);
                        throw e;
                    }
                }
            } catch (IOException e5) {
                e = e5;
                c03973 = null;
                throw new BufferDataException(e);
            } catch (Throwable th2) {
                e = th2;
                c03973 = null;
                if (c03973 != null) {
                    c03973.close();
                }
                limit(limit);
                throw e;
            }
        }
        throw new BufferUnderflowException();
    }

    public IoBuffer putObject(Object obj) {
        Throwable e;
        int position = position();
        skip(4);
        ObjectOutputStream c03984;
        try {
            c03984 = new C03984(asOutputStream());
            try {
                c03984.writeObject(obj);
                c03984.flush();
                try {
                    c03984.close();
                } catch (IOException e2) {
                }
                int position2 = position();
                position(position);
                putInt((position2 - position) - 4);
                position(position2);
                return this;
            } catch (IOException e3) {
                e = e3;
                try {
                    throw new BufferDataException(e);
                } catch (Throwable th) {
                    e = th;
                    if (c03984 != null) {
                        try {
                            c03984.close();
                        } catch (IOException e4) {
                        }
                    }
                    throw e;
                }
            }
        } catch (IOException e5) {
            e = e5;
            c03984 = null;
            throw new BufferDataException(e);
        } catch (Throwable th2) {
            e = th2;
            c03984 = null;
            if (c03984 != null) {
                c03984.close();
            }
            throw e;
        }
    }

    public boolean prefixedDataAvailable(int i) {
        return prefixedDataAvailable(i, Integer.MAX_VALUE);
    }

    public boolean prefixedDataAvailable(int i, int i2) {
        if (remaining() < i) {
            return false;
        }
        int unsigned;
        switch (i) {
            case Cocos2dxHandler.HANDLER_SHOW_DIALOG /*1*/:
                unsigned = getUnsigned(position());
                break;
            case SocksProxyConstants.SOCKS5_REQUEST_STEP /*2*/:
                unsigned = getUnsignedShort(position());
                break;
            case NTLMConstants.FLAG_REQUEST_SERVER_AUTH_REALM /*4*/:
                unsigned = getInt(position());
                break;
            default:
                throw new IllegalArgumentException("prefixLength: " + i);
        }
        if (unsigned < 0 || unsigned > i2) {
            throw new BufferDataException("dataLength: " + unsigned);
        } else if (remaining() - i >= unsigned) {
            return true;
        } else {
            return false;
        }
    }

    public int indexOf(byte b) {
        int arrayOffset;
        int position;
        if (hasArray()) {
            arrayOffset = arrayOffset();
            int limit = limit() + arrayOffset;
            byte[] array = array();
            for (position = position() + arrayOffset; position < limit; position++) {
                if (array[position] == b) {
                    return position - arrayOffset;
                }
            }
        } else {
            arrayOffset = limit();
            for (position = position(); position < arrayOffset; position++) {
                if (get(position) == b) {
                    return position;
                }
            }
        }
        return -1;
    }

    public IoBuffer skip(int i) {
        autoExpand(i);
        return position(position() + i);
    }

    public IoBuffer fill(byte b, int i) {
        autoExpand(i);
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i2 > 0) {
            int i4 = (((b & 255) | ((b << 8) & 65280)) | ((b << 16) & 16711680)) | (b << 24);
            long j = (((long) i4) << 32) | (((long) i4) & INT_MASK);
            while (i2 > 0) {
                putLong(j);
                i2--;
            }
        }
        i2 = i3 >>> 2;
        i3 &= 3;
        if (i2 > 0) {
            putInt((((b & 255) | ((b << 8) & 65280)) | ((b << 16) & 16711680)) | (b << 24));
        }
        i2 = i3 >> 1;
        i3 &= 1;
        if (i2 > 0) {
            putShort((short) ((b & 255) | (b << 8)));
        }
        if (i3 > 0) {
            put(b);
        }
        return this;
    }

    public IoBuffer fillAndReset(byte b, int i) {
        autoExpand(i);
        int position = position();
        try {
            fill(b, i);
            return this;
        } finally {
            position(position);
        }
    }

    public IoBuffer fill(int i) {
        int i2;
        autoExpand(i);
        int i3 = i & 7;
        for (i2 = i >>> 3; i2 > 0; i2--) {
            putLong(0);
        }
        i2 = i3 >>> 2;
        i3 &= 3;
        if (i2 > 0) {
            putInt(0);
        }
        i2 = i3 >> 1;
        i3 &= 1;
        if (i2 > 0) {
            putShort((short) 0);
        }
        if (i3 > 0) {
            put((byte) 0);
        }
        return this;
    }

    public IoBuffer fillAndReset(int i) {
        autoExpand(i);
        int position = position();
        try {
            fill(i);
            return this;
        } finally {
            position(position);
        }
    }

    public <E extends Enum<E>> E getEnum(Class<E> cls) {
        return (Enum) toEnum(cls, getUnsigned());
    }

    public <E extends Enum<E>> E getEnum(int i, Class<E> cls) {
        return (Enum) toEnum(cls, getUnsigned(i));
    }

    public <E extends Enum<E>> E getEnumShort(Class<E> cls) {
        return (Enum) toEnum(cls, getUnsignedShort());
    }

    public <E extends Enum<E>> E getEnumShort(int i, Class<E> cls) {
        return (Enum) toEnum(cls, getUnsignedShort(i));
    }

    public <E extends Enum<E>> E getEnumInt(Class<E> cls) {
        return (Enum) toEnum(cls, getInt());
    }

    public <E extends Enum<E>> E getEnumInt(int i, Class<E> cls) {
        return (Enum) toEnum(cls, getInt(i));
    }

    public IoBuffer putEnum(Enum<?> enumR) {
        if (((long) enumR.ordinal()) <= BYTE_MASK) {
            return put((byte) enumR.ordinal());
        }
        throw new IllegalArgumentException(enumConversionErrorMessage(enumR, "byte"));
    }

    public IoBuffer putEnum(int i, Enum<?> enumR) {
        if (((long) enumR.ordinal()) <= BYTE_MASK) {
            return put(i, (byte) enumR.ordinal());
        }
        throw new IllegalArgumentException(enumConversionErrorMessage(enumR, "byte"));
    }

    public IoBuffer putEnumShort(Enum<?> enumR) {
        if (((long) enumR.ordinal()) <= SHORT_MASK) {
            return putShort((short) enumR.ordinal());
        }
        throw new IllegalArgumentException(enumConversionErrorMessage(enumR, "short"));
    }

    public IoBuffer putEnumShort(int i, Enum<?> enumR) {
        if (((long) enumR.ordinal()) <= SHORT_MASK) {
            return putShort(i, (short) enumR.ordinal());
        }
        throw new IllegalArgumentException(enumConversionErrorMessage(enumR, "short"));
    }

    public IoBuffer putEnumInt(Enum<?> enumR) {
        return putInt(enumR.ordinal());
    }

    public IoBuffer putEnumInt(int i, Enum<?> enumR) {
        return putInt(i, enumR.ordinal());
    }

    private <E> E toEnum(Class<E> cls, int i) {
        Object[] enumConstants = cls.getEnumConstants();
        if (i <= enumConstants.length) {
            return enumConstants[i];
        }
        throw new IndexOutOfBoundsException(String.format("%d is too large of an ordinal to convert to the enum %s", new Object[]{Integer.valueOf(i), cls.getName()}));
    }

    private String enumConversionErrorMessage(Enum<?> enumR, String str) {
        return String.format("%s.%s has an ordinal value too large for a %s", new Object[]{enumR.getClass().getName(), enumR.name(), str});
    }

    public <E extends Enum<E>> EnumSet<E> getEnumSet(Class<E> cls) {
        return toEnumSet(cls, ((long) get()) & BYTE_MASK);
    }

    public <E extends Enum<E>> EnumSet<E> getEnumSet(int i, Class<E> cls) {
        return toEnumSet(cls, ((long) get(i)) & BYTE_MASK);
    }

    public <E extends Enum<E>> EnumSet<E> getEnumSetShort(Class<E> cls) {
        return toEnumSet(cls, ((long) getShort()) & SHORT_MASK);
    }

    public <E extends Enum<E>> EnumSet<E> getEnumSetShort(int i, Class<E> cls) {
        return toEnumSet(cls, ((long) getShort(i)) & SHORT_MASK);
    }

    public <E extends Enum<E>> EnumSet<E> getEnumSetInt(Class<E> cls) {
        return toEnumSet(cls, ((long) getInt()) & INT_MASK);
    }

    public <E extends Enum<E>> EnumSet<E> getEnumSetInt(int i, Class<E> cls) {
        return toEnumSet(cls, ((long) getInt(i)) & INT_MASK);
    }

    public <E extends Enum<E>> EnumSet<E> getEnumSetLong(Class<E> cls) {
        return toEnumSet(cls, getLong());
    }

    public <E extends Enum<E>> EnumSet<E> getEnumSetLong(int i, Class<E> cls) {
        return toEnumSet(cls, getLong(i));
    }

    private <E extends Enum<E>> EnumSet<E> toEnumSet(Class<E> cls, long j) {
        EnumSet<E> noneOf = EnumSet.noneOf(cls);
        long j2 = 1;
        for (Object obj : (Enum[]) cls.getEnumConstants()) {
            if ((j2 & j) == j2) {
                noneOf.add(obj);
            }
            j2 <<= 1;
        }
        return noneOf;
    }

    public <E extends Enum<E>> IoBuffer putEnumSet(Set<E> set) {
        long toLong = toLong(set);
        if ((-256 & toLong) == 0) {
            return put((byte) ((int) toLong));
        }
        throw new IllegalArgumentException("The enum set is too large to fit in a byte: " + set);
    }

    public <E extends Enum<E>> IoBuffer putEnumSet(int i, Set<E> set) {
        long toLong = toLong(set);
        if ((-256 & toLong) == 0) {
            return put(i, (byte) ((int) toLong));
        }
        throw new IllegalArgumentException("The enum set is too large to fit in a byte: " + set);
    }

    public <E extends Enum<E>> IoBuffer putEnumSetShort(Set<E> set) {
        long toLong = toLong(set);
        if ((-65536 & toLong) == 0) {
            return putShort((short) ((int) toLong));
        }
        throw new IllegalArgumentException("The enum set is too large to fit in a short: " + set);
    }

    public <E extends Enum<E>> IoBuffer putEnumSetShort(int i, Set<E> set) {
        long toLong = toLong(set);
        if ((-65536 & toLong) == 0) {
            return putShort(i, (short) ((int) toLong));
        }
        throw new IllegalArgumentException("The enum set is too large to fit in a short: " + set);
    }

    public <E extends Enum<E>> IoBuffer putEnumSetInt(Set<E> set) {
        long toLong = toLong(set);
        if ((-4294967296L & toLong) == 0) {
            return putInt((int) toLong);
        }
        throw new IllegalArgumentException("The enum set is too large to fit in an int: " + set);
    }

    public <E extends Enum<E>> IoBuffer putEnumSetInt(int i, Set<E> set) {
        long toLong = toLong(set);
        if ((-4294967296L & toLong) == 0) {
            return putInt(i, (int) toLong);
        }
        throw new IllegalArgumentException("The enum set is too large to fit in an int: " + set);
    }

    public <E extends Enum<E>> IoBuffer putEnumSetLong(Set<E> set) {
        return putLong(toLong(set));
    }

    public <E extends Enum<E>> IoBuffer putEnumSetLong(int i, Set<E> set) {
        return putLong(i, toLong(set));
    }

    private <E extends Enum<E>> long toLong(Set<E> set) {
        long j = 0;
        for (E e : set) {
            if (e.ordinal() >= 64) {
                throw new IllegalArgumentException("The enum set is too large to fit in a bit vector: " + set);
            }
            j = (1 << e.ordinal()) | j;
        }
        return j;
    }

    private IoBuffer autoExpand(int i) {
        if (isAutoExpand()) {
            expand(i, true);
        }
        return this;
    }

    private IoBuffer autoExpand(int i, int i2) {
        if (isAutoExpand()) {
            expand(i, i2, true);
        }
        return this;
    }

    private static void checkFieldSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("fieldSize cannot be negative: " + i);
        }
    }
}
