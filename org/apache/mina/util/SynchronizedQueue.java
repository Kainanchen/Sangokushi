package org.apache.mina.util;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class SynchronizedQueue<E> implements Serializable, Queue<E> {
    private static final long serialVersionUID = -1439242290701194806L;
    private final Queue<E> f485q;

    public SynchronizedQueue(Queue<E> queue) {
        this.f485q = queue;
    }

    public synchronized boolean add(E e) {
        return this.f485q.add(e);
    }

    public synchronized E element() {
        return this.f485q.element();
    }

    public synchronized boolean offer(E e) {
        return this.f485q.offer(e);
    }

    public synchronized E peek() {
        return this.f485q.peek();
    }

    public synchronized E poll() {
        return this.f485q.poll();
    }

    public synchronized E remove() {
        return this.f485q.remove();
    }

    public synchronized boolean addAll(Collection<? extends E> collection) {
        return this.f485q.addAll(collection);
    }

    public synchronized void clear() {
        this.f485q.clear();
    }

    public synchronized boolean contains(Object obj) {
        return this.f485q.contains(obj);
    }

    public synchronized boolean containsAll(Collection<?> collection) {
        return this.f485q.containsAll(collection);
    }

    public synchronized boolean isEmpty() {
        return this.f485q.isEmpty();
    }

    public synchronized Iterator<E> iterator() {
        return this.f485q.iterator();
    }

    public synchronized boolean remove(Object obj) {
        return this.f485q.remove(obj);
    }

    public synchronized boolean removeAll(Collection<?> collection) {
        return this.f485q.removeAll(collection);
    }

    public synchronized boolean retainAll(Collection<?> collection) {
        return this.f485q.retainAll(collection);
    }

    public synchronized int size() {
        return this.f485q.size();
    }

    public synchronized Object[] toArray() {
        return this.f485q.toArray();
    }

    public synchronized <T> T[] toArray(T[] tArr) {
        return this.f485q.toArray(tArr);
    }

    public synchronized boolean equals(Object obj) {
        return this.f485q.equals(obj);
    }

    public synchronized int hashCode() {
        return this.f485q.hashCode();
    }

    public synchronized String toString() {
        return this.f485q.toString();
    }
}
