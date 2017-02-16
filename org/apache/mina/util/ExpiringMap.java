package org.apache.mina.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.cocos2dx.lib.GameControllerDelegate;

public class ExpiringMap<K, V> implements Map<K, V> {
    public static final int DEFAULT_EXPIRATION_INTERVAL = 1;
    public static final int DEFAULT_TIME_TO_LIVE = 60;
    private static volatile int expirerCount;
    private final ConcurrentHashMap<K, ExpiringObject> delegate;
    private final CopyOnWriteArrayList<ExpirationListener<V>> expirationListeners;
    private final Expirer expirer;

    public class Expirer implements Runnable {
        private long expirationIntervalMillis;
        private final Thread expirerThread;
        private boolean running;
        private final ReadWriteLock stateLock;
        private long timeToLiveMillis;

        public Expirer() {
            this.stateLock = new ReentrantReadWriteLock();
            this.running = false;
            this.expirerThread = new Thread(this, "ExpiringMapExpirer-" + ExpiringMap.access$008());
            this.expirerThread.setDaemon(true);
        }

        public void run() {
            while (this.running) {
                processExpires();
                try {
                    Thread.sleep(this.expirationIntervalMillis);
                } catch (InterruptedException e) {
                }
            }
        }

        private void processExpires() {
            long currentTimeMillis = System.currentTimeMillis();
            for (ExpiringObject expiringObject : ExpiringMap.this.delegate.values()) {
                if (this.timeToLiveMillis > 0 && currentTimeMillis - expiringObject.getLastAccessTime() >= this.timeToLiveMillis) {
                    ExpiringMap.this.delegate.remove(expiringObject.getKey());
                    Iterator it = ExpiringMap.this.expirationListeners.iterator();
                    while (it.hasNext()) {
                        ((ExpirationListener) it.next()).expired(expiringObject.getValue());
                    }
                }
            }
        }

        public void startExpiring() {
            this.stateLock.writeLock().lock();
            try {
                if (!this.running) {
                    this.running = true;
                    this.expirerThread.start();
                }
                this.stateLock.writeLock().unlock();
            } catch (Throwable th) {
                this.stateLock.writeLock().unlock();
            }
        }

        public void startExpiringIfNotStarted() {
            this.stateLock.readLock().lock();
            try {
                if (!this.running) {
                    this.stateLock.readLock().unlock();
                    this.stateLock.writeLock().lock();
                    try {
                        if (!this.running) {
                            this.running = true;
                            this.expirerThread.start();
                        }
                        this.stateLock.writeLock().unlock();
                    } catch (Throwable th) {
                        this.stateLock.writeLock().unlock();
                    }
                }
            } finally {
                this.stateLock.readLock().unlock();
            }
        }

        public void stopExpiring() {
            this.stateLock.writeLock().lock();
            try {
                if (this.running) {
                    this.running = false;
                    this.expirerThread.interrupt();
                }
                this.stateLock.writeLock().unlock();
            } catch (Throwable th) {
                this.stateLock.writeLock().unlock();
            }
        }

        public boolean isRunning() {
            this.stateLock.readLock().lock();
            try {
                boolean z = this.running;
                return z;
            } finally {
                this.stateLock.readLock().unlock();
            }
        }

        public int getTimeToLive() {
            this.stateLock.readLock().lock();
            try {
                int i = ((int) this.timeToLiveMillis) / GameControllerDelegate.THUMBSTICK_LEFT_X;
                return i;
            } finally {
                this.stateLock.readLock().unlock();
            }
        }

        public void setTimeToLive(long j) {
            this.stateLock.writeLock().lock();
            try {
                this.timeToLiveMillis = 1000 * j;
            } finally {
                this.stateLock.writeLock().unlock();
            }
        }

        public int getExpirationInterval() {
            this.stateLock.readLock().lock();
            try {
                int i = ((int) this.expirationIntervalMillis) / GameControllerDelegate.THUMBSTICK_LEFT_X;
                return i;
            } finally {
                this.stateLock.readLock().unlock();
            }
        }

        public void setExpirationInterval(long j) {
            this.stateLock.writeLock().lock();
            try {
                this.expirationIntervalMillis = 1000 * j;
            } finally {
                this.stateLock.writeLock().unlock();
            }
        }
    }

    private class ExpiringObject {
        private K key;
        private long lastAccessTime;
        private final ReadWriteLock lastAccessTimeLock;
        private V value;

        ExpiringObject(K k, V v, long j) {
            this.lastAccessTimeLock = new ReentrantReadWriteLock();
            if (v == null) {
                throw new IllegalArgumentException("An expiring object cannot be null.");
            }
            this.key = k;
            this.value = v;
            this.lastAccessTime = j;
        }

        public long getLastAccessTime() {
            this.lastAccessTimeLock.readLock().lock();
            try {
                long j = this.lastAccessTime;
                return j;
            } finally {
                this.lastAccessTimeLock.readLock().unlock();
            }
        }

        public void setLastAccessTime(long j) {
            this.lastAccessTimeLock.writeLock().lock();
            try {
                this.lastAccessTime = j;
            } finally {
                this.lastAccessTimeLock.writeLock().unlock();
            }
        }

        public K getKey() {
            return this.key;
        }

        public V getValue() {
            return this.value;
        }

        public boolean equals(Object obj) {
            return this.value.equals(obj);
        }

        public int hashCode() {
            return this.value.hashCode();
        }
    }

    static /* synthetic */ int access$008() {
        int i = expirerCount;
        expirerCount = i + DEFAULT_EXPIRATION_INTERVAL;
        return i;
    }

    static {
        expirerCount = DEFAULT_EXPIRATION_INTERVAL;
    }

    public ExpiringMap() {
        this(DEFAULT_TIME_TO_LIVE, DEFAULT_EXPIRATION_INTERVAL);
    }

    public ExpiringMap(int i) {
        this(i, DEFAULT_EXPIRATION_INTERVAL);
    }

    public ExpiringMap(int i, int i2) {
        this(new ConcurrentHashMap(), new CopyOnWriteArrayList(), i, i2);
    }

    private ExpiringMap(ConcurrentHashMap<K, ExpiringObject> concurrentHashMap, CopyOnWriteArrayList<ExpirationListener<V>> copyOnWriteArrayList, int i, int i2) {
        this.delegate = concurrentHashMap;
        this.expirationListeners = copyOnWriteArrayList;
        this.expirer = new Expirer();
        this.expirer.setTimeToLive((long) i);
        this.expirer.setExpirationInterval((long) i2);
    }

    public V put(K k, V v) {
        ExpiringObject expiringObject = (ExpiringObject) this.delegate.put(k, new ExpiringObject(k, v, System.currentTimeMillis()));
        if (expiringObject == null) {
            return null;
        }
        return expiringObject.getValue();
    }

    public V get(Object obj) {
        ExpiringObject expiringObject = (ExpiringObject) this.delegate.get(obj);
        if (expiringObject == null) {
            return null;
        }
        expiringObject.setLastAccessTime(System.currentTimeMillis());
        return expiringObject.getValue();
    }

    public V remove(Object obj) {
        ExpiringObject expiringObject = (ExpiringObject) this.delegate.remove(obj);
        if (expiringObject == null) {
            return null;
        }
        return expiringObject.getValue();
    }

    public boolean containsKey(Object obj) {
        return this.delegate.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.delegate.containsValue(obj);
    }

    public int size() {
        return this.delegate.size();
    }

    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    public void clear() {
        this.delegate.clear();
    }

    public int hashCode() {
        return this.delegate.hashCode();
    }

    public Set<K> keySet() {
        return this.delegate.keySet();
    }

    public boolean equals(Object obj) {
        return this.delegate.equals(obj);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Collection<V> values() {
        throw new UnsupportedOperationException();
    }

    public Set<Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException();
    }

    public void addExpirationListener(ExpirationListener<V> expirationListener) {
        this.expirationListeners.add(expirationListener);
    }

    public void removeExpirationListener(ExpirationListener<V> expirationListener) {
        this.expirationListeners.remove(expirationListener);
    }

    public Expirer getExpirer() {
        return this.expirer;
    }

    public int getExpirationInterval() {
        return this.expirer.getExpirationInterval();
    }

    public int getTimeToLive() {
        return this.expirer.getTimeToLive();
    }

    public void setExpirationInterval(int i) {
        this.expirer.setExpirationInterval((long) i);
    }

    public void setTimeToLive(int i) {
        this.expirer.setTimeToLive((long) i);
    }
}
