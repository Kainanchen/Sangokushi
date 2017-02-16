package com.google.protobuf;

import android.support.v4.media.TransportMediator;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.sina.weibo.sdk.component.GameManager;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public final class CodedOutputStream {
    public static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    public static final int LITTLE_ENDIAN_64_SIZE = 8;
    private final byte[] buffer;
    private final int limit;
    private final OutputStream output;
    private int position;
    private int totalBytesWritten;

    private static class ByteBufferOutputStream extends OutputStream {
        private final ByteBuffer byteBuffer;

        public ByteBufferOutputStream(ByteBuffer byteBuffer) {
            this.byteBuffer = byteBuffer;
        }

        public void write(int i) {
            this.byteBuffer.put((byte) i);
        }

        public void write(byte[] bArr, int i, int i2) {
            this.byteBuffer.put(bArr, i, i2);
        }
    }

    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    static int computePreferredBufferSize(int i) {
        if (i > DEFAULT_BUFFER_SIZE) {
            return DEFAULT_BUFFER_SIZE;
        }
        return i;
    }

    private CodedOutputStream(byte[] bArr, int i, int i2) {
        this.totalBytesWritten = 0;
        this.output = null;
        this.buffer = bArr;
        this.position = i;
        this.limit = i + i2;
    }

    private CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.totalBytesWritten = 0;
        this.output = outputStream;
        this.buffer = bArr;
        this.position = 0;
        this.limit = bArr.length;
    }

    public static CodedOutputStream newInstance(OutputStream outputStream) {
        return newInstance(outputStream, (int) DEFAULT_BUFFER_SIZE);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i) {
        return new CodedOutputStream(outputStream, new byte[i]);
    }

    public static CodedOutputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static CodedOutputStream newInstance(byte[] bArr, int i, int i2) {
        return new CodedOutputStream(bArr, i, i2);
    }

    public static CodedOutputStream newInstance(ByteBuffer byteBuffer) {
        return newInstance(byteBuffer, (int) DEFAULT_BUFFER_SIZE);
    }

    public static CodedOutputStream newInstance(ByteBuffer byteBuffer, int i) {
        return newInstance(new ByteBufferOutputStream(byteBuffer), i);
    }

    public final void writeDouble(int i, double d) {
        writeTag(i, 1);
        writeDoubleNoTag(d);
    }

    public final void writeFloat(int i, float f) {
        writeTag(i, 5);
        writeFloatNoTag(f);
    }

    public final void writeUInt64(int i, long j) {
        writeTag(i, 0);
        writeUInt64NoTag(j);
    }

    public final void writeInt64(int i, long j) {
        writeTag(i, 0);
        writeInt64NoTag(j);
    }

    public final void writeInt32(int i, int i2) {
        writeTag(i, 0);
        writeInt32NoTag(i2);
    }

    public final void writeFixed64(int i, long j) {
        writeTag(i, 1);
        writeFixed64NoTag(j);
    }

    public final void writeFixed32(int i, int i2) {
        writeTag(i, 5);
        writeFixed32NoTag(i2);
    }

    public final void writeBool(int i, boolean z) {
        writeTag(i, 0);
        writeBoolNoTag(z);
    }

    public final void writeString(int i, String str) {
        writeTag(i, 2);
        writeStringNoTag(str);
    }

    public final void writeGroup(int i, MessageLite messageLite) {
        writeTag(i, 3);
        writeGroupNoTag(messageLite);
        writeTag(i, LITTLE_ENDIAN_32_SIZE);
    }

    @Deprecated
    public final void writeUnknownGroup(int i, MessageLite messageLite) {
        writeGroup(i, messageLite);
    }

    public final void writeMessage(int i, MessageLite messageLite) {
        writeTag(i, 2);
        writeMessageNoTag(messageLite);
    }

    public final void writeBytes(int i, ByteString byteString) {
        writeTag(i, 2);
        writeBytesNoTag(byteString);
    }

    public final void writeByteArray(int i, byte[] bArr) {
        writeTag(i, 2);
        writeByteArrayNoTag(bArr);
    }

    public final void writeByteArray(int i, byte[] bArr, int i2, int i3) {
        writeTag(i, 2);
        writeByteArrayNoTag(bArr, i2, i3);
    }

    public final void writeByteBuffer(int i, ByteBuffer byteBuffer) {
        writeTag(i, 2);
        writeByteBufferNoTag(byteBuffer);
    }

    public final void writeUInt32(int i, int i2) {
        writeTag(i, 0);
        writeUInt32NoTag(i2);
    }

    public final void writeEnum(int i, int i2) {
        writeTag(i, 0);
        writeEnumNoTag(i2);
    }

    public final void writeSFixed32(int i, int i2) {
        writeTag(i, 5);
        writeSFixed32NoTag(i2);
    }

    public final void writeSFixed64(int i, long j) {
        writeTag(i, 1);
        writeSFixed64NoTag(j);
    }

    public final void writeSInt32(int i, int i2) {
        writeTag(i, 0);
        writeSInt32NoTag(i2);
    }

    public final void writeSInt64(int i, long j) {
        writeTag(i, 0);
        writeSInt64NoTag(j);
    }

    public final void writeMessageSetExtension(int i, MessageLite messageLite) {
        writeTag(1, 3);
        writeUInt32(2, i);
        writeMessage(3, messageLite);
        writeTag(1, LITTLE_ENDIAN_32_SIZE);
    }

    public final void writeRawMessageSetExtension(int i, ByteString byteString) {
        writeTag(1, 3);
        writeUInt32(2, i);
        writeBytes(3, byteString);
        writeTag(1, LITTLE_ENDIAN_32_SIZE);
    }

    public final void writeDoubleNoTag(double d) {
        writeRawLittleEndian64(Double.doubleToRawLongBits(d));
    }

    public final void writeFloatNoTag(float f) {
        writeRawLittleEndian32(Float.floatToRawIntBits(f));
    }

    public final void writeUInt64NoTag(long j) {
        writeRawVarint64(j);
    }

    public final void writeInt64NoTag(long j) {
        writeRawVarint64(j);
    }

    public final void writeInt32NoTag(int i) {
        if (i >= 0) {
            writeRawVarint32(i);
        } else {
            writeRawVarint64((long) i);
        }
    }

    public final void writeFixed64NoTag(long j) {
        writeRawLittleEndian64(j);
    }

    public final void writeFixed32NoTag(int i) {
        writeRawLittleEndian32(i);
    }

    public final void writeBoolNoTag(boolean z) {
        writeRawByte(z ? 1 : 0);
    }

    public final void writeStringNoTag(String str) {
        byte[] bytes = str.getBytes(GameManager.DEFAULT_CHARSET);
        writeRawVarint32(bytes.length);
        writeRawBytes(bytes);
    }

    public final void writeGroupNoTag(MessageLite messageLite) {
        messageLite.writeTo(this);
    }

    @Deprecated
    public final void writeUnknownGroupNoTag(MessageLite messageLite) {
        writeGroupNoTag(messageLite);
    }

    public final void writeMessageNoTag(MessageLite messageLite) {
        writeRawVarint32(messageLite.getSerializedSize());
        messageLite.writeTo(this);
    }

    public final void writeBytesNoTag(ByteString byteString) {
        writeRawVarint32(byteString.size());
        writeRawBytes(byteString);
    }

    public final void writeByteArrayNoTag(byte[] bArr) {
        writeRawVarint32(bArr.length);
        writeRawBytes(bArr);
    }

    public final void writeByteArrayNoTag(byte[] bArr, int i, int i2) {
        writeRawVarint32(i2);
        writeRawBytes(bArr, i, i2);
    }

    public final void writeByteBufferNoTag(ByteBuffer byteBuffer) {
        writeRawVarint32(byteBuffer.capacity());
        writeRawBytes(byteBuffer);
    }

    public final void writeUInt32NoTag(int i) {
        writeRawVarint32(i);
    }

    public final void writeEnumNoTag(int i) {
        writeInt32NoTag(i);
    }

    public final void writeSFixed32NoTag(int i) {
        writeRawLittleEndian32(i);
    }

    public final void writeSFixed64NoTag(long j) {
        writeRawLittleEndian64(j);
    }

    public final void writeSInt32NoTag(int i) {
        writeRawVarint32(encodeZigZag32(i));
    }

    public final void writeSInt64NoTag(long j) {
        writeRawVarint64(encodeZigZag64(j));
    }

    public static int computeDoubleSize(int i, double d) {
        return computeTagSize(i) + computeDoubleSizeNoTag(d);
    }

    public static int computeFloatSize(int i, float f) {
        return computeTagSize(i) + computeFloatSizeNoTag(f);
    }

    public static int computeUInt64Size(int i, long j) {
        return computeTagSize(i) + computeUInt64SizeNoTag(j);
    }

    public static int computeInt64Size(int i, long j) {
        return computeTagSize(i) + computeInt64SizeNoTag(j);
    }

    public static int computeInt32Size(int i, int i2) {
        return computeTagSize(i) + computeInt32SizeNoTag(i2);
    }

    public static int computeFixed64Size(int i, long j) {
        return computeTagSize(i) + computeFixed64SizeNoTag(j);
    }

    public static int computeFixed32Size(int i, int i2) {
        return computeTagSize(i) + computeFixed32SizeNoTag(i2);
    }

    public static int computeBoolSize(int i, boolean z) {
        return computeTagSize(i) + computeBoolSizeNoTag(z);
    }

    public static int computeStringSize(int i, String str) {
        return computeTagSize(i) + computeStringSizeNoTag(str);
    }

    public static int computeGroupSize(int i, MessageLite messageLite) {
        return (computeTagSize(i) * 2) + computeGroupSizeNoTag(messageLite);
    }

    @Deprecated
    public static int computeUnknownGroupSize(int i, MessageLite messageLite) {
        return computeGroupSize(i, messageLite);
    }

    public static int computeMessageSize(int i, MessageLite messageLite) {
        return computeTagSize(i) + computeMessageSizeNoTag(messageLite);
    }

    public static int computeBytesSize(int i, ByteString byteString) {
        return computeTagSize(i) + computeBytesSizeNoTag(byteString);
    }

    public static int computeByteArraySize(int i, byte[] bArr) {
        return computeTagSize(i) + computeByteArraySizeNoTag(bArr);
    }

    public static int computeByteBufferSize(int i, ByteBuffer byteBuffer) {
        return computeTagSize(i) + computeByteBufferSizeNoTag(byteBuffer);
    }

    public static int computeLazyFieldSize(int i, LazyFieldLite lazyFieldLite) {
        return computeTagSize(i) + computeLazyFieldSizeNoTag(lazyFieldLite);
    }

    public static int computeUInt32Size(int i, int i2) {
        return computeTagSize(i) + computeUInt32SizeNoTag(i2);
    }

    public static int computeEnumSize(int i, int i2) {
        return computeTagSize(i) + computeEnumSizeNoTag(i2);
    }

    public static int computeSFixed32Size(int i, int i2) {
        return computeTagSize(i) + computeSFixed32SizeNoTag(i2);
    }

    public static int computeSFixed64Size(int i, long j) {
        return computeTagSize(i) + computeSFixed64SizeNoTag(j);
    }

    public static int computeSInt32Size(int i, int i2) {
        return computeTagSize(i) + computeSInt32SizeNoTag(i2);
    }

    public static int computeSInt64Size(int i, long j) {
        return computeTagSize(i) + computeSInt64SizeNoTag(j);
    }

    public static int computeMessageSetExtensionSize(int i, MessageLite messageLite) {
        return ((computeTagSize(1) * 2) + computeUInt32Size(2, i)) + computeMessageSize(3, messageLite);
    }

    public static int computeRawMessageSetExtensionSize(int i, ByteString byteString) {
        return ((computeTagSize(1) * 2) + computeUInt32Size(2, i)) + computeBytesSize(3, byteString);
    }

    public static int computeLazyFieldMessageSetExtensionSize(int i, LazyFieldLite lazyFieldLite) {
        return ((computeTagSize(1) * 2) + computeUInt32Size(2, i)) + computeLazyFieldSize(3, lazyFieldLite);
    }

    public static int computeDoubleSizeNoTag(double d) {
        return LITTLE_ENDIAN_64_SIZE;
    }

    public static int computeFloatSizeNoTag(float f) {
        return LITTLE_ENDIAN_32_SIZE;
    }

    public static int computeUInt64SizeNoTag(long j) {
        return computeRawVarint64Size(j);
    }

    public static int computeInt64SizeNoTag(long j) {
        return computeRawVarint64Size(j);
    }

    public static int computeInt32SizeNoTag(int i) {
        if (i >= 0) {
            return computeRawVarint32Size(i);
        }
        return 10;
    }

    public static int computeFixed64SizeNoTag(long j) {
        return LITTLE_ENDIAN_64_SIZE;
    }

    public static int computeFixed32SizeNoTag(int i) {
        return LITTLE_ENDIAN_32_SIZE;
    }

    public static int computeBoolSizeNoTag(boolean z) {
        return 1;
    }

    public static int computeStringSizeNoTag(String str) {
        try {
            byte[] bytes = str.getBytes(GameManager.DEFAULT_CHARSET);
            return bytes.length + computeRawVarint32Size(bytes.length);
        } catch (Throwable e) {
            throw new RuntimeException("UTF-8 not supported.", e);
        }
    }

    public static int computeGroupSizeNoTag(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    @Deprecated
    public static int computeUnknownGroupSizeNoTag(MessageLite messageLite) {
        return computeGroupSizeNoTag(messageLite);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
        int serializedSize = messageLite.getSerializedSize();
        return serializedSize + computeRawVarint32Size(serializedSize);
    }

    public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyFieldLite) {
        int serializedSize = lazyFieldLite.getSerializedSize();
        return serializedSize + computeRawVarint32Size(serializedSize);
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        return computeRawVarint32Size(byteString.size()) + byteString.size();
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeRawVarint32Size(bArr.length) + bArr.length;
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        return computeRawVarint32Size(byteBuffer.capacity()) + byteBuffer.capacity();
    }

    public static int computeUInt32SizeNoTag(int i) {
        return computeRawVarint32Size(i);
    }

    public static int computeEnumSizeNoTag(int i) {
        return computeInt32SizeNoTag(i);
    }

    public static int computeSFixed32SizeNoTag(int i) {
        return LITTLE_ENDIAN_32_SIZE;
    }

    public static int computeSFixed64SizeNoTag(long j) {
        return LITTLE_ENDIAN_64_SIZE;
    }

    public static int computeSInt32SizeNoTag(int i) {
        return computeRawVarint32Size(encodeZigZag32(i));
    }

    public static int computeSInt64SizeNoTag(long j) {
        return computeRawVarint64Size(encodeZigZag64(j));
    }

    private void refreshBuffer() {
        if (this.output == null) {
            throw new OutOfSpaceException();
        }
        this.output.write(this.buffer, 0, this.position);
        this.position = 0;
    }

    public final void flush() {
        if (this.output != null) {
            refreshBuffer();
        }
    }

    public final int spaceLeft() {
        if (this.output == null) {
            return this.limit - this.position;
        }
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final int getTotalBytesWritten() {
        return this.totalBytesWritten;
    }

    public final void writeRawByte(byte b) {
        if (this.position == this.limit) {
            refreshBuffer();
        }
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        bArr[i] = b;
        this.totalBytesWritten++;
    }

    public final void writeRawByte(int i) {
        writeRawByte((byte) i);
    }

    public final void writeRawBytes(ByteString byteString) {
        writeRawBytes(byteString, 0, byteString.size());
    }

    public final void writeRawBytes(byte[] bArr) {
        writeRawBytes(bArr, 0, bArr.length);
    }

    public final void writeRawBytes(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            writeRawBytes(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            return;
        }
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.clear();
        writeRawBytesInternal(duplicate);
    }

    private void writeRawBytesInternal(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (this.limit - this.position >= remaining) {
            byteBuffer.get(this.buffer, this.position, remaining);
            this.position += remaining;
            this.totalBytesWritten = remaining + this.totalBytesWritten;
            return;
        }
        int i = this.limit - this.position;
        byteBuffer.get(this.buffer, this.position, i);
        remaining -= i;
        this.position = this.limit;
        this.totalBytesWritten = i + this.totalBytesWritten;
        refreshBuffer();
        while (remaining > this.limit) {
            byteBuffer.get(this.buffer, 0, this.limit);
            this.output.write(this.buffer, 0, this.limit);
            remaining -= this.limit;
            this.totalBytesWritten += this.limit;
        }
        byteBuffer.get(this.buffer, 0, remaining);
        this.position = remaining;
        this.totalBytesWritten = remaining + this.totalBytesWritten;
    }

    public final void writeRawBytes(byte[] bArr, int i, int i2) {
        if (this.limit - this.position >= i2) {
            System.arraycopy(bArr, i, this.buffer, this.position, i2);
            this.position += i2;
        } else {
            int i3 = this.limit - this.position;
            System.arraycopy(bArr, i, this.buffer, this.position, i3);
            int i4 = i + i3;
            i2 -= i3;
            this.position = this.limit;
            this.totalBytesWritten = i3 + this.totalBytesWritten;
            refreshBuffer();
            if (i2 <= this.limit) {
                System.arraycopy(bArr, i4, this.buffer, 0, i2);
                this.position = i2;
            } else {
                this.output.write(bArr, i4, i2);
            }
        }
        this.totalBytesWritten += i2;
    }

    public final void writeRawBytes(ByteString byteString, int i, int i2) {
        if (this.limit - this.position >= i2) {
            byteString.copyTo(this.buffer, i, this.position, i2);
            this.position += i2;
        } else {
            int i3 = this.limit - this.position;
            byteString.copyTo(this.buffer, i, this.position, i3);
            int i4 = i + i3;
            i2 -= i3;
            this.position = this.limit;
            this.totalBytesWritten = i3 + this.totalBytesWritten;
            refreshBuffer();
            if (i2 <= this.limit) {
                byteString.copyTo(this.buffer, i4, 0, i2);
                this.position = i2;
            } else {
                byteString.writeTo(this.output, i4, i2);
            }
        }
        this.totalBytesWritten += i2;
    }

    public final void writeTag(int i, int i2) {
        writeRawVarint32(WireFormat.makeTag(i, i2));
    }

    public static int computeTagSize(int i) {
        return computeRawVarint32Size(WireFormat.makeTag(i, 0));
    }

    public final void writeRawVarint32(int i) {
        while ((i & -128) != 0) {
            writeRawByte((i & TransportMediator.KEYCODE_MEDIA_PAUSE) | AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
            i >>>= 7;
        }
        writeRawByte(i);
    }

    public static int computeRawVarint32Size(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        if ((-268435456 & i) == 0) {
            return LITTLE_ENDIAN_32_SIZE;
        }
        return 5;
    }

    public final void writeRawVarint64(long j) {
        while ((-128 & j) != 0) {
            writeRawByte((((int) j) & TransportMediator.KEYCODE_MEDIA_PAUSE) | AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
            j >>>= 7;
        }
        writeRawByte((int) j);
    }

    public static int computeRawVarint64Size(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return LITTLE_ENDIAN_32_SIZE;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return LITTLE_ENDIAN_64_SIZE;
        }
        if ((Long.MIN_VALUE & j) == 0) {
            return 9;
        }
        return 10;
    }

    public final void writeRawLittleEndian32(int i) {
        writeRawByte(i & MotionEventCompat.ACTION_MASK);
        writeRawByte((i >> LITTLE_ENDIAN_64_SIZE) & MotionEventCompat.ACTION_MASK);
        writeRawByte((i >> 16) & MotionEventCompat.ACTION_MASK);
        writeRawByte((i >> 24) & MotionEventCompat.ACTION_MASK);
    }

    public final void writeRawLittleEndian64(long j) {
        writeRawByte(((int) j) & MotionEventCompat.ACTION_MASK);
        writeRawByte(((int) (j >> LITTLE_ENDIAN_64_SIZE)) & MotionEventCompat.ACTION_MASK);
        writeRawByte(((int) (j >> 16)) & MotionEventCompat.ACTION_MASK);
        writeRawByte(((int) (j >> 24)) & MotionEventCompat.ACTION_MASK);
        writeRawByte(((int) (j >> 32)) & MotionEventCompat.ACTION_MASK);
        writeRawByte(((int) (j >> 40)) & MotionEventCompat.ACTION_MASK);
        writeRawByte(((int) (j >> 48)) & MotionEventCompat.ACTION_MASK);
        writeRawByte(((int) (j >> 56)) & MotionEventCompat.ACTION_MASK);
    }

    public static int encodeZigZag32(int i) {
        return (i << 1) ^ (i >> 31);
    }

    public static long encodeZigZag64(long j) {
        return (j << 1) ^ (j >> 63);
    }
}
