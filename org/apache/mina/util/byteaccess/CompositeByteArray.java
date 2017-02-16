package org.apache.mina.util.byteaccess;

import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.util.byteaccess.ByteArray.Cursor;
import org.apache.mina.util.byteaccess.ByteArrayList.Node;

public final class CompositeByteArray extends AbstractByteArray {
    private final ByteArrayList bas;
    private final ByteArrayFactory byteArrayFactory;
    private ByteOrder order;

    /* renamed from: org.apache.mina.util.byteaccess.CompositeByteArray.1 */
    class C04711 extends BufferByteArray {
        C04711(IoBuffer ioBuffer) {
            super(ioBuffer);
        }

        public void free() {
        }
    }

    /* renamed from: org.apache.mina.util.byteaccess.CompositeByteArray.2 */
    class C04722 extends BufferByteArray {
        final /* synthetic */ ByteArray val$componentFinal;

        C04722(IoBuffer ioBuffer, ByteArray byteArray) {
            this.val$componentFinal = byteArray;
            super(ioBuffer);
        }

        public void free() {
            this.val$componentFinal.free();
        }
    }

    private class CursorImpl implements Cursor {
        private Cursor componentCursor;
        private int componentIndex;
        private Node componentNode;
        private int index;
        private final CursorListener listener;

        public CursorImpl(CompositeByteArray compositeByteArray) {
            this(0, null);
        }

        public CursorImpl(CompositeByteArray compositeByteArray, int i) {
            this(i, null);
        }

        public CursorImpl(CompositeByteArray compositeByteArray, CursorListener cursorListener) {
            this(0, cursorListener);
        }

        public CursorImpl(int i, CursorListener cursorListener) {
            this.index = i;
            this.listener = cursorListener;
        }

        public int getIndex() {
            return this.index;
        }

        public void setIndex(int i) {
            CompositeByteArray.this.checkBounds(i, 0);
            this.index = i;
        }

        public void skip(int i) {
            setIndex(this.index + i);
        }

        public ByteArray slice(int i) {
            ByteArray compositeByteArray = new CompositeByteArray(CompositeByteArray.this.byteArrayFactory);
            while (i > 0) {
                prepareForAccess(i);
                int min = Math.min(i, this.componentCursor.getRemaining());
                compositeByteArray.addLast(this.componentCursor.slice(min));
                this.index += min;
                i -= min;
            }
            return compositeByteArray;
        }

        public ByteOrder order() {
            return CompositeByteArray.this.order();
        }

        private void prepareForAccess(int i) {
            if (this.componentNode != null && this.componentNode.isRemoved()) {
                this.componentNode = null;
                this.componentCursor = null;
            }
            CompositeByteArray.this.checkBounds(this.index, i);
            Node node = this.componentNode;
            if (this.componentNode == null) {
                if (this.index <= ((CompositeByteArray.this.last() - CompositeByteArray.this.first()) / 2) + CompositeByteArray.this.first()) {
                    this.componentNode = CompositeByteArray.this.bas.getFirst();
                    this.componentIndex = CompositeByteArray.this.first();
                    if (this.listener != null) {
                        this.listener.enteredFirstComponent(this.componentIndex, this.componentNode.getByteArray());
                    }
                } else {
                    this.componentNode = CompositeByteArray.this.bas.getLast();
                    this.componentIndex = CompositeByteArray.this.last() - this.componentNode.getByteArray().last();
                    if (this.listener != null) {
                        this.listener.enteredLastComponent(this.componentIndex, this.componentNode.getByteArray());
                    }
                }
            }
            while (this.index < this.componentIndex) {
                this.componentNode = this.componentNode.getPreviousNode();
                this.componentIndex -= this.componentNode.getByteArray().last();
                if (this.listener != null) {
                    this.listener.enteredPreviousComponent(this.componentIndex, this.componentNode.getByteArray());
                }
            }
            while (this.index >= this.componentIndex + this.componentNode.getByteArray().length()) {
                this.componentIndex += this.componentNode.getByteArray().last();
                this.componentNode = this.componentNode.getNextNode();
                if (this.listener != null) {
                    this.listener.enteredNextComponent(this.componentIndex, this.componentNode.getByteArray());
                }
            }
            int i2 = this.index - this.componentIndex;
            if (this.componentNode == node) {
                this.componentCursor.setIndex(i2);
            } else {
                this.componentCursor = this.componentNode.getByteArray().cursor(i2);
            }
        }

        public int getRemaining() {
            return (CompositeByteArray.this.last() - this.index) + 1;
        }

        public boolean hasRemaining() {
            return getRemaining() > 0;
        }

        public byte get() {
            prepareForAccess(1);
            byte b = this.componentCursor.get();
            this.index++;
            return b;
        }

        public void put(byte b) {
            prepareForAccess(1);
            this.componentCursor.put(b);
            this.index++;
        }

        public void get(IoBuffer ioBuffer) {
            while (ioBuffer.hasRemaining()) {
                int remaining = ioBuffer.remaining();
                prepareForAccess(remaining);
                this.componentCursor.get(ioBuffer);
                this.index = (remaining - ioBuffer.remaining()) + this.index;
            }
        }

        public void put(IoBuffer ioBuffer) {
            while (ioBuffer.hasRemaining()) {
                int remaining = ioBuffer.remaining();
                prepareForAccess(remaining);
                this.componentCursor.put(ioBuffer);
                this.index = (remaining - ioBuffer.remaining()) + this.index;
            }
        }

        public short getShort() {
            prepareForAccess(2);
            if (this.componentCursor.getRemaining() >= 4) {
                short s = this.componentCursor.getShort();
                this.index += 2;
                return s;
            }
            byte b = get();
            byte b2 = get();
            if (CompositeByteArray.this.order.equals(ByteOrder.BIG_ENDIAN)) {
                return (short) ((b << 8) | (b2 & 255));
            }
            return (short) ((b & 255) | (b2 << 8));
        }

        public void putShort(short s) {
            prepareForAccess(2);
            if (this.componentCursor.getRemaining() >= 4) {
                this.componentCursor.putShort(s);
                this.index += 2;
                return;
            }
            byte b;
            byte b2;
            if (CompositeByteArray.this.order.equals(ByteOrder.BIG_ENDIAN)) {
                b = (byte) ((s >> 8) & 255);
                b2 = (byte) ((s >> 0) & 255);
            } else {
                b = (byte) ((s >> 0) & 255);
                b2 = (byte) ((s >> 8) & 255);
            }
            put(b);
            put(b2);
        }

        public int getInt() {
            prepareForAccess(4);
            if (this.componentCursor.getRemaining() >= 4) {
                int i = this.componentCursor.getInt();
                this.index += 4;
                return i;
            }
            byte b = get();
            byte b2 = get();
            byte b3 = get();
            byte b4 = get();
            if (CompositeByteArray.this.order.equals(ByteOrder.BIG_ENDIAN)) {
                return (((b << 24) | ((b2 & 255) << 16)) | ((b3 & 255) << 8)) | (b4 & 255);
            }
            return (b & 255) | (((b2 & 255) << 8) | (((b3 & 255) << 16) | (b4 << 24)));
        }

        public void putInt(int i) {
            prepareForAccess(4);
            if (this.componentCursor.getRemaining() >= 4) {
                this.componentCursor.putInt(i);
                this.index += 4;
                return;
            }
            byte b;
            byte b2;
            byte b3;
            byte b4;
            if (CompositeByteArray.this.order.equals(ByteOrder.BIG_ENDIAN)) {
                b = (byte) ((i >> 24) & 255);
                b2 = (byte) ((i >> 16) & 255);
                b3 = (byte) ((i >> 8) & 255);
                b4 = (byte) ((i >> 0) & 255);
            } else {
                b = (byte) ((i >> 0) & 255);
                b2 = (byte) ((i >> 8) & 255);
                b3 = (byte) ((i >> 16) & 255);
                b4 = (byte) ((i >> 24) & 255);
            }
            put(b);
            put(b2);
            put(b3);
            put(b4);
        }

        public long getLong() {
            prepareForAccess(8);
            if (this.componentCursor.getRemaining() >= 4) {
                long j = this.componentCursor.getLong();
                this.index += 8;
                return j;
            }
            byte b = get();
            byte b2 = get();
            byte b3 = get();
            byte b4 = get();
            byte b5 = get();
            byte b6 = get();
            byte b7 = get();
            byte b8 = get();
            if (CompositeByteArray.this.order.equals(ByteOrder.BIG_ENDIAN)) {
                return ((((((((((long) b2) & 255) << 48) | ((((long) b) & 255) << 56)) | ((((long) b3) & 255) << 40)) | ((((long) b4) & 255) << 32)) | ((((long) b5) & 255) << 24)) | ((((long) b6) & 255) << 16)) | ((((long) b7) & 255) << 8)) | (((long) b8) & 255);
            }
            return (((long) b) & 255) | ((((((long) b3) & 255) << 16) | ((((((long) b5) & 255) << 32) | ((((((long) b7) & 255) << 48) | ((((long) b8) & 255) << 56)) | ((((long) b6) & 255) << 40))) | ((((long) b4) & 255) << 24))) | ((((long) b2) & 255) << 8));
        }

        public void putLong(long j) {
            prepareForAccess(8);
            if (this.componentCursor.getRemaining() >= 4) {
                this.componentCursor.putLong(j);
                this.index += 8;
                return;
            }
            byte b;
            byte b2;
            byte b3;
            byte b4;
            byte b5;
            byte b6;
            byte b7;
            byte b8;
            if (CompositeByteArray.this.order.equals(ByteOrder.BIG_ENDIAN)) {
                b = (byte) ((int) ((j >> 56) & 255));
                b2 = (byte) ((int) ((j >> 48) & 255));
                b3 = (byte) ((int) ((j >> 40) & 255));
                b4 = (byte) ((int) ((j >> 32) & 255));
                b5 = (byte) ((int) ((j >> 24) & 255));
                b6 = (byte) ((int) ((j >> 16) & 255));
                b7 = (byte) ((int) ((j >> 8) & 255));
                b8 = (byte) ((int) ((j >> 0) & 255));
            } else {
                b = (byte) ((int) ((j >> 0) & 255));
                b2 = (byte) ((int) ((j >> 8) & 255));
                b3 = (byte) ((int) ((j >> 16) & 255));
                b4 = (byte) ((int) ((j >> 24) & 255));
                b5 = (byte) ((int) ((j >> 32) & 255));
                b6 = (byte) ((int) ((j >> 40) & 255));
                b7 = (byte) ((int) ((j >> 48) & 255));
                b8 = (byte) ((int) ((j >> 56) & 255));
            }
            put(b);
            put(b2);
            put(b3);
            put(b4);
            put(b5);
            put(b6);
            put(b7);
            put(b8);
        }

        public float getFloat() {
            prepareForAccess(4);
            if (this.componentCursor.getRemaining() < 4) {
                return Float.intBitsToFloat(getInt());
            }
            float f = this.componentCursor.getFloat();
            this.index += 4;
            return f;
        }

        public void putFloat(float f) {
            prepareForAccess(4);
            if (this.componentCursor.getRemaining() >= 4) {
                this.componentCursor.putFloat(f);
                this.index += 4;
                return;
            }
            putInt(Float.floatToIntBits(f));
        }

        public double getDouble() {
            prepareForAccess(8);
            if (this.componentCursor.getRemaining() < 4) {
                return Double.longBitsToDouble(getLong());
            }
            double d = this.componentCursor.getDouble();
            this.index += 8;
            return d;
        }

        public void putDouble(double d) {
            prepareForAccess(8);
            if (this.componentCursor.getRemaining() >= 4) {
                this.componentCursor.putDouble(d);
                this.index += 8;
                return;
            }
            putLong(Double.doubleToLongBits(d));
        }

        public char getChar() {
            prepareForAccess(2);
            if (this.componentCursor.getRemaining() >= 4) {
                char c = this.componentCursor.getChar();
                this.index += 2;
                return c;
            }
            byte b = get();
            byte b2 = get();
            if (CompositeByteArray.this.order.equals(ByteOrder.BIG_ENDIAN)) {
                return (char) ((b << 8) | (b2 & 255));
            }
            return (char) ((b & 255) | (b2 << 8));
        }

        public void putChar(char c) {
            prepareForAccess(2);
            if (this.componentCursor.getRemaining() >= 4) {
                this.componentCursor.putChar(c);
                this.index += 2;
                return;
            }
            byte b;
            byte b2;
            if (CompositeByteArray.this.order.equals(ByteOrder.BIG_ENDIAN)) {
                b = (byte) ((c >> 8) & 255);
                b2 = (byte) ((c >> 0) & 255);
            } else {
                b = (byte) ((c >> 0) & 255);
                b2 = (byte) ((c >> 8) & 255);
            }
            put(b);
            put(b2);
        }
    }

    public interface CursorListener {
        void enteredFirstComponent(int i, ByteArray byteArray);

        void enteredLastComponent(int i, ByteArray byteArray);

        void enteredNextComponent(int i, ByteArray byteArray);

        void enteredPreviousComponent(int i, ByteArray byteArray);
    }

    public CompositeByteArray() {
        this(null);
    }

    public CompositeByteArray(ByteArrayFactory byteArrayFactory) {
        this.bas = new ByteArrayList();
        this.byteArrayFactory = byteArrayFactory;
    }

    public final ByteArray getFirst() {
        if (this.bas.isEmpty()) {
            return null;
        }
        return this.bas.getFirst().getByteArray();
    }

    public final void addFirst(ByteArray byteArray) {
        addHook(byteArray);
        this.bas.addFirst(byteArray);
    }

    public final ByteArray removeFirst() {
        Node removeFirst = this.bas.removeFirst();
        return removeFirst == null ? null : removeFirst.getByteArray();
    }

    public final ByteArray removeTo(int i) {
        if (i < first() || i > last()) {
            throw new IndexOutOfBoundsException();
        }
        ByteArray compositeByteArray = new CompositeByteArray(this.byteArrayFactory);
        int first = i - first();
        while (first > 0) {
            ByteArray removeFirst = removeFirst();
            if (removeFirst.last() <= first) {
                compositeByteArray.addLast(removeFirst);
                first -= removeFirst.last();
            } else {
                IoBuffer singleIoBuffer = removeFirst.getSingleIoBuffer();
                int limit = singleIoBuffer.limit();
                singleIoBuffer.position(0);
                singleIoBuffer.limit(first);
                IoBuffer slice = singleIoBuffer.slice();
                singleIoBuffer.position(first);
                singleIoBuffer.limit(limit);
                singleIoBuffer = singleIoBuffer.slice();
                ByteArray c04711 = new C04711(slice);
                compositeByteArray.addLast(c04711);
                first -= c04711.last();
                addFirst(new C04722(singleIoBuffer, removeFirst));
            }
        }
        return compositeByteArray;
    }

    public final void addLast(ByteArray byteArray) {
        addHook(byteArray);
        this.bas.addLast(byteArray);
    }

    public final ByteArray removeLast() {
        Node removeLast = this.bas.removeLast();
        return removeLast == null ? null : removeLast.getByteArray();
    }

    public final void free() {
        while (!this.bas.isEmpty()) {
            this.bas.getLast().getByteArray().free();
            this.bas.removeLast();
        }
    }

    private void checkBounds(int i, int i2) {
        int i3 = i + i2;
        if (i < first()) {
            throw new IndexOutOfBoundsException("Index " + i + " less than start " + first() + ".");
        } else if (i3 > last()) {
            throw new IndexOutOfBoundsException("Index " + i3 + " greater than length " + last() + ".");
        }
    }

    public final Iterable<IoBuffer> getIoBuffers() {
        if (this.bas.isEmpty()) {
            return Collections.emptyList();
        }
        Collection arrayList = new ArrayList();
        Node first = this.bas.getFirst();
        for (IoBuffer add : first.getByteArray().getIoBuffers()) {
            arrayList.add(add);
        }
        Node node = first;
        while (node.hasNextNode()) {
            first = node.getNextNode();
            for (IoBuffer add2 : first.getByteArray().getIoBuffers()) {
                arrayList.add(add2);
            }
            node = first;
        }
        return arrayList;
    }

    public final IoBuffer getSingleIoBuffer() {
        if (this.byteArrayFactory == null) {
            throw new IllegalStateException("Can't get single buffer from CompositeByteArray unless it has a ByteArrayFactory.");
        } else if (this.bas.isEmpty()) {
            return this.byteArrayFactory.create(1).getSingleIoBuffer();
        } else {
            int last = last() - first();
            ByteArray byteArray = this.bas.getFirst().getByteArray();
            if (byteArray.last() == last) {
                return byteArray.getSingleIoBuffer();
            }
            byteArray = this.byteArrayFactory.create(last);
            IoBuffer singleIoBuffer = byteArray.getSingleIoBuffer();
            cursor().put(singleIoBuffer);
            while (!this.bas.isEmpty()) {
                ByteArray byteArray2 = this.bas.getLast().getByteArray();
                this.bas.removeLast();
                byteArray2.free();
            }
            this.bas.addLast(byteArray);
            return singleIoBuffer;
        }
    }

    public final Cursor cursor() {
        return new CursorImpl(this);
    }

    public final Cursor cursor(int i) {
        return new CursorImpl(this, i);
    }

    public final Cursor cursor(CursorListener cursorListener) {
        return new CursorImpl(this, cursorListener);
    }

    public final Cursor cursor(int i, CursorListener cursorListener) {
        return new CursorImpl(i, cursorListener);
    }

    public final ByteArray slice(int i, int i2) {
        return cursor(i).slice(i2);
    }

    public final byte get(int i) {
        return cursor(i).get();
    }

    public final void put(int i, byte b) {
        cursor(i).put(b);
    }

    public final void get(int i, IoBuffer ioBuffer) {
        cursor(i).get(ioBuffer);
    }

    public final void put(int i, IoBuffer ioBuffer) {
        cursor(i).put(ioBuffer);
    }

    public final int first() {
        return this.bas.firstByte();
    }

    public final int last() {
        return this.bas.lastByte();
    }

    private void addHook(ByteArray byteArray) {
        if (byteArray.first() != 0) {
            throw new IllegalArgumentException("Cannot add byte array that doesn't start from 0: " + byteArray.first());
        } else if (this.order == null) {
            this.order = byteArray.order();
        } else if (!this.order.equals(byteArray.order())) {
            throw new IllegalArgumentException("Cannot add byte array with different byte order: " + byteArray.order());
        }
    }

    public final ByteOrder order() {
        if (this.order != null) {
            return this.order;
        }
        throw new IllegalStateException("Byte order not yet set.");
    }

    public final void order(ByteOrder byteOrder) {
        if (byteOrder == null || !byteOrder.equals(this.order)) {
            this.order = byteOrder;
            if (!this.bas.isEmpty()) {
                for (Node first = this.bas.getFirst(); first.hasNextNode(); first = first.getNextNode()) {
                    first.getByteArray().order(byteOrder);
                }
            }
        }
    }

    public final short getShort(int i) {
        return cursor(i).getShort();
    }

    public final void putShort(int i, short s) {
        cursor(i).putShort(s);
    }

    public final int getInt(int i) {
        return cursor(i).getInt();
    }

    public final void putInt(int i, int i2) {
        cursor(i).putInt(i2);
    }

    public final long getLong(int i) {
        return cursor(i).getLong();
    }

    public final void putLong(int i, long j) {
        cursor(i).putLong(j);
    }

    public final float getFloat(int i) {
        return cursor(i).getFloat();
    }

    public final void putFloat(int i, float f) {
        cursor(i).putFloat(f);
    }

    public final double getDouble(int i) {
        return cursor(i).getDouble();
    }

    public final void putDouble(int i, double d) {
        cursor(i).putDouble(d);
    }

    public final char getChar(int i) {
        return cursor(i).getChar();
    }

    public final void putChar(int i, char c) {
        cursor(i).putChar(c);
    }
}
