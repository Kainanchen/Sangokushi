package org.apache.mina.core.session;

import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.mina.core.write.WriteRequest;
import org.apache.mina.core.write.WriteRequestQueue;

public class DefaultIoSessionDataStructureFactory implements IoSessionDataStructureFactory {

    private static class DefaultIoSessionAttributeMap implements IoSessionAttributeMap {
        private final ConcurrentHashMap<Object, Object> attributes;

        public DefaultIoSessionAttributeMap() {
            this.attributes = new ConcurrentHashMap(4);
        }

        public Object getAttribute(IoSession ioSession, Object obj, Object obj2) {
            if (obj == null) {
                throw new IllegalArgumentException("key");
            } else if (obj2 == null) {
                return this.attributes.get(obj);
            } else {
                Object putIfAbsent = this.attributes.putIfAbsent(obj, obj2);
                if (putIfAbsent != null) {
                    return putIfAbsent;
                }
                return obj2;
            }
        }

        public Object setAttribute(IoSession ioSession, Object obj, Object obj2) {
            if (obj == null) {
                throw new IllegalArgumentException("key");
            } else if (obj2 == null) {
                return this.attributes.remove(obj);
            } else {
                return this.attributes.put(obj, obj2);
            }
        }

        public Object setAttributeIfAbsent(IoSession ioSession, Object obj, Object obj2) {
            if (obj == null) {
                throw new IllegalArgumentException("key");
            } else if (obj2 == null) {
                return null;
            } else {
                return this.attributes.putIfAbsent(obj, obj2);
            }
        }

        public Object removeAttribute(IoSession ioSession, Object obj) {
            if (obj != null) {
                return this.attributes.remove(obj);
            }
            throw new IllegalArgumentException("key");
        }

        public boolean removeAttribute(IoSession ioSession, Object obj, Object obj2) {
            boolean z = false;
            if (obj == null) {
                throw new IllegalArgumentException("key");
            }
            if (obj2 != null) {
                try {
                    z = this.attributes.remove(obj, obj2);
                } catch (NullPointerException e) {
                }
            }
            return z;
        }

        public boolean replaceAttribute(IoSession ioSession, Object obj, Object obj2, Object obj3) {
            try {
                return this.attributes.replace(obj, obj2, obj3);
            } catch (NullPointerException e) {
                return false;
            }
        }

        public boolean containsAttribute(IoSession ioSession, Object obj) {
            return this.attributes.containsKey(obj);
        }

        public Set<Object> getAttributeKeys(IoSession ioSession) {
            Set hashSet;
            synchronized (this.attributes) {
                hashSet = new HashSet(this.attributes.keySet());
            }
            return hashSet;
        }

        public void dispose(IoSession ioSession) {
        }
    }

    private static class DefaultWriteRequestQueue implements WriteRequestQueue {
        private final Queue<WriteRequest> f483q;

        public DefaultWriteRequestQueue() {
            this.f483q = new ConcurrentLinkedQueue();
        }

        public void dispose(IoSession ioSession) {
        }

        public void clear(IoSession ioSession) {
            this.f483q.clear();
        }

        public boolean isEmpty(IoSession ioSession) {
            return this.f483q.isEmpty();
        }

        public void offer(IoSession ioSession, WriteRequest writeRequest) {
            this.f483q.offer(writeRequest);
        }

        public WriteRequest poll(IoSession ioSession) {
            WriteRequest writeRequest = (WriteRequest) this.f483q.poll();
            if (writeRequest != AbstractIoSession.CLOSE_REQUEST) {
                return writeRequest;
            }
            ioSession.closeNow();
            dispose(ioSession);
            return null;
        }

        public String toString() {
            return this.f483q.toString();
        }

        public int size() {
            return this.f483q.size();
        }
    }

    public IoSessionAttributeMap getAttributeMap(IoSession ioSession) {
        return new DefaultIoSessionAttributeMap();
    }

    public WriteRequestQueue getWriteRequestQueue(IoSession ioSession) {
        return new DefaultWriteRequestQueue();
    }
}
