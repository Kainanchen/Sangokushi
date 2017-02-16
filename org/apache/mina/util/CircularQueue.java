package org.apache.mina.util;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Queue;
import org.apache.mina.proxy.handlers.http.ntlm.NTLMConstants;

public class CircularQueue<E> extends AbstractList<E> implements Serializable, Queue<E> {
    private static final int DEFAULT_CAPACITY = 4;
    private static final long serialVersionUID = 3993421269224511264L;
    private int first;
    private boolean full;
    private final int initialCapacity;
    private volatile Object[] items;
    private int last;
    private int mask;
    private int shrinkThreshold;

    public CircularQueue() {
        this(DEFAULT_CAPACITY);
    }

    public CircularQueue(int i) {
        this.first = 0;
        this.last = 0;
        int normalizeCapacity = normalizeCapacity(i);
        this.items = new Object[normalizeCapacity];
        this.mask = normalizeCapacity - 1;
        this.initialCapacity = normalizeCapacity;
        this.shrinkThreshold = 0;
    }

    private static int normalizeCapacity(int i) {
        int i2 = 1;
        while (i2 < i) {
            i2 <<= 1;
            if (i2 < 0) {
                return NTLMConstants.FLAG_NEGOTIATE_KEY_EXCHANGE;
            }
        }
        return i2;
    }

    public int capacity() {
        return this.items.length;
    }

    public void clear() {
        if (!isEmpty()) {
            Arrays.fill(this.items, null);
            this.first = 0;
            this.last = 0;
            this.full = false;
            shrinkIfNeeded();
        }
    }

    public E poll() {
        if (isEmpty()) {
            return null;
        }
        E e = this.items[this.first];
        this.items[this.first] = null;
        decreaseSize();
        if (this.first == this.last) {
            this.last = 0;
            this.first = 0;
        }
        shrinkIfNeeded();
        return e;
    }

    public boolean offer(E e) {
        if (e == null) {
            throw new IllegalArgumentException("item");
        }
        expandIfNeeded();
        this.items[this.last] = e;
        increaseSize();
        return true;
    }

    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return this.items[this.first];
    }

    public E get(int i) {
        checkIndex(i);
        return this.items[getRealIndex(i)];
    }

    public boolean isEmpty() {
        return this.first == this.last && !this.full;
    }

    public int size() {
        if (this.full) {
            return capacity();
        }
        if (this.last >= this.first) {
            return this.last - this.first;
        }
        return (this.last - this.first) + capacity();
    }

    public String toString() {
        return "first=" + this.first + ", last=" + this.last + ", size=" + size() + ", mask = " + this.mask;
    }

    private void checkIndex(int i) {
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException(String.valueOf(i));
        }
    }

    private int getRealIndex(int i) {
        return (this.first + i) & this.mask;
    }

    private void increaseSize() {
        this.last = (this.last + 1) & this.mask;
        this.full = this.first == this.last;
    }

    private void decreaseSize() {
        this.first = (this.first + 1) & this.mask;
        this.full = false;
    }

    private void expandIfNeeded() {
        if (this.full) {
            int length = this.items.length;
            int i = length << 1;
            Object obj = new Object[i];
            if (this.first < this.last) {
                System.arraycopy(this.items, this.first, obj, 0, this.last - this.first);
            } else {
                System.arraycopy(this.items, this.first, obj, 0, length - this.first);
                System.arraycopy(this.items, 0, obj, length - this.first, this.last);
            }
            this.first = 0;
            this.last = length;
            this.items = obj;
            this.mask = i - 1;
            if ((i >>> 3) > this.initialCapacity) {
                this.shrinkThreshold = i >>> 3;
            }
        }
    }

    private void shrinkIfNeeded() {
        int size = size();
        if (size <= this.shrinkThreshold) {
            int length = this.items.length;
            int normalizeCapacity = normalizeCapacity(size);
            if (size == normalizeCapacity) {
                normalizeCapacity <<= 1;
            }
            if (normalizeCapacity < length) {
                if (normalizeCapacity < this.initialCapacity) {
                    if (length != this.initialCapacity) {
                        normalizeCapacity = this.initialCapacity;
                    } else {
                        return;
                    }
                }
                Object obj = new Object[normalizeCapacity];
                if (size > 0) {
                    if (this.first < this.last) {
                        System.arraycopy(this.items, this.first, obj, 0, this.last - this.first);
                    } else {
                        System.arraycopy(this.items, this.first, obj, 0, length - this.first);
                        System.arraycopy(this.items, 0, obj, length - this.first, this.last);
                    }
                }
                this.first = 0;
                this.last = size;
                this.items = obj;
                this.mask = obj.length - 1;
                this.shrinkThreshold = 0;
            }
        }
    }

    public boolean add(E e) {
        return offer(e);
    }

    public E set(int i, E e) {
        checkIndex(i);
        int realIndex = getRealIndex(i);
        E e2 = this.items[realIndex];
        this.items[realIndex] = e;
        return e2;
    }

    public void add(int i, E e) {
        if (i == size()) {
            offer(e);
            return;
        }
        checkIndex(i);
        expandIfNeeded();
        int realIndex = getRealIndex(i);
        if (this.first < this.last || realIndex < this.first) {
            System.arraycopy(this.items, realIndex, this.items, realIndex + 1, this.last - realIndex);
        } else {
            System.arraycopy(this.items, 0, this.items, 1, this.last);
            this.items[0] = this.items[this.items.length - 1];
            System.arraycopy(this.items, realIndex, this.items, realIndex + 1, (this.items.length - realIndex) - 1);
        }
        this.items[realIndex] = e;
        increaseSize();
    }

    public E remove(int i) {
        if (i == 0) {
            return poll();
        }
        checkIndex(i);
        int realIndex = getRealIndex(i);
        E e = this.items[realIndex];
        if (this.first < this.last) {
            System.arraycopy(this.items, this.first, this.items, this.first + 1, realIndex - this.first);
        } else if (realIndex >= this.first) {
            System.arraycopy(this.items, this.first, this.items, this.first + 1, realIndex - this.first);
        } else {
            System.arraycopy(this.items, 0, this.items, 1, realIndex);
            this.items[0] = this.items[this.items.length - 1];
            System.arraycopy(this.items, this.first, this.items, this.first + 1, (this.items.length - this.first) - 1);
        }
        this.items[this.first] = null;
        decreaseSize();
        shrinkIfNeeded();
        return e;
    }

    public E remove() {
        if (!isEmpty()) {
            return poll();
        }
        throw new NoSuchElementException();
    }

    public E element() {
        if (!isEmpty()) {
            return peek();
        }
        throw new NoSuchElementException();
    }
}
