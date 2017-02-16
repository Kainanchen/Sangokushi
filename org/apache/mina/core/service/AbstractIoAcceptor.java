package org.apache.mina.core.service;

import java.io.IOException;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.apache.mina.core.RuntimeIoException;
import org.apache.mina.core.session.IoSessionConfig;

public abstract class AbstractIoAcceptor extends AbstractIoService implements IoAcceptor {
    public final Object bindLock;
    private final Set<SocketAddress> boundAddresses;
    private final List<SocketAddress> defaultLocalAddresses;
    private boolean disconnectOnUnbind;
    private final List<SocketAddress> unmodifiableDefaultLocalAddresses;

    public static class AcceptorOperationFuture extends ServiceOperationFuture {
        private final List<SocketAddress> localAddresses;

        public AcceptorOperationFuture(List<? extends SocketAddress> list) {
            this.localAddresses = new ArrayList(list);
        }

        public final List<SocketAddress> getLocalAddresses() {
            return Collections.unmodifiableList(this.localAddresses);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Acceptor operation : ");
            if (this.localAddresses != null) {
                Object obj = 1;
                for (SocketAddress socketAddress : this.localAddresses) {
                    if (obj != null) {
                        obj = null;
                    } else {
                        stringBuilder.append(", ");
                    }
                    stringBuilder.append(socketAddress);
                }
            }
            return stringBuilder.toString();
        }
    }

    public abstract Set<SocketAddress> bindInternal(List<? extends SocketAddress> list);

    public abstract void unbind0(List<? extends SocketAddress> list);

    public AbstractIoAcceptor(IoSessionConfig ioSessionConfig, Executor executor) {
        super(ioSessionConfig, executor);
        this.defaultLocalAddresses = new ArrayList();
        this.unmodifiableDefaultLocalAddresses = Collections.unmodifiableList(this.defaultLocalAddresses);
        this.boundAddresses = new HashSet();
        this.disconnectOnUnbind = true;
        this.bindLock = new Object();
        this.defaultLocalAddresses.add(null);
    }

    public SocketAddress getLocalAddress() {
        Set localAddresses = getLocalAddresses();
        if (localAddresses.isEmpty()) {
            return null;
        }
        return (SocketAddress) localAddresses.iterator().next();
    }

    public final Set<SocketAddress> getLocalAddresses() {
        Set<SocketAddress> hashSet = new HashSet();
        synchronized (this.boundAddresses) {
            hashSet.addAll(this.boundAddresses);
        }
        return hashSet;
    }

    public SocketAddress getDefaultLocalAddress() {
        if (this.defaultLocalAddresses.isEmpty()) {
            return null;
        }
        return (SocketAddress) this.defaultLocalAddresses.iterator().next();
    }

    public final void setDefaultLocalAddress(SocketAddress socketAddress) {
        setDefaultLocalAddresses(socketAddress, new SocketAddress[0]);
    }

    public final List<SocketAddress> getDefaultLocalAddresses() {
        return this.unmodifiableDefaultLocalAddresses;
    }

    public final void setDefaultLocalAddresses(List<? extends SocketAddress> list) {
        if (list == null) {
            throw new IllegalArgumentException("localAddresses");
        }
        setDefaultLocalAddresses((Iterable) list);
    }

    public final void setDefaultLocalAddresses(Iterable<? extends SocketAddress> iterable) {
        if (iterable == null) {
            throw new IllegalArgumentException("localAddresses");
        }
        synchronized (this.bindLock) {
            synchronized (this.boundAddresses) {
                if (this.boundAddresses.isEmpty()) {
                    Collection arrayList = new ArrayList();
                    for (SocketAddress socketAddress : iterable) {
                        checkAddressType(socketAddress);
                        arrayList.add(socketAddress);
                    }
                    if (arrayList.isEmpty()) {
                        throw new IllegalArgumentException("empty localAddresses");
                    }
                    this.defaultLocalAddresses.clear();
                    this.defaultLocalAddresses.addAll(arrayList);
                } else {
                    throw new IllegalStateException("localAddress can't be set while the acceptor is bound.");
                }
            }
        }
    }

    public final void setDefaultLocalAddresses(SocketAddress socketAddress, SocketAddress... socketAddressArr) {
        int i = 0;
        if (socketAddressArr == null) {
            socketAddressArr = new SocketAddress[0];
        }
        Iterable arrayList = new ArrayList(socketAddressArr.length + 1);
        arrayList.add(socketAddress);
        int length = socketAddressArr.length;
        while (i < length) {
            arrayList.add(socketAddressArr[i]);
            i++;
        }
        setDefaultLocalAddresses(arrayList);
    }

    public final boolean isCloseOnDeactivation() {
        return this.disconnectOnUnbind;
    }

    public final void setCloseOnDeactivation(boolean z) {
        this.disconnectOnUnbind = z;
    }

    public final void bind() {
        bind(getDefaultLocalAddresses());
    }

    public final void bind(SocketAddress socketAddress) {
        if (socketAddress == null) {
            throw new IllegalArgumentException("localAddress");
        }
        Iterable arrayList = new ArrayList(1);
        arrayList.add(socketAddress);
        bind(arrayList);
    }

    public final void bind(SocketAddress... socketAddressArr) {
        if (socketAddressArr == null || socketAddressArr.length == 0) {
            bind(getDefaultLocalAddresses());
            return;
        }
        Iterable arrayList = new ArrayList(2);
        for (Object add : socketAddressArr) {
            arrayList.add(add);
        }
        bind(arrayList);
    }

    public final void bind(SocketAddress socketAddress, SocketAddress... socketAddressArr) {
        if (socketAddress == null) {
            bind(getDefaultLocalAddresses());
        }
        if (socketAddressArr == null || socketAddressArr.length == 0) {
            bind(getDefaultLocalAddresses());
            return;
        }
        Iterable arrayList = new ArrayList(2);
        arrayList.add(socketAddress);
        for (Object add : socketAddressArr) {
            arrayList.add(add);
        }
        bind(arrayList);
    }

    public final void bind(Iterable<? extends SocketAddress> iterable) {
        if (isDisposing()) {
            throw new IllegalStateException("The Accpetor disposed is being disposed.");
        } else if (iterable == null) {
            throw new IllegalArgumentException("localAddresses");
        } else {
            List arrayList = new ArrayList();
            for (SocketAddress socketAddress : iterable) {
                checkAddressType(socketAddress);
                arrayList.add(socketAddress);
            }
            if (arrayList.isEmpty()) {
                throw new IllegalArgumentException("localAddresses is empty.");
            }
            Object obj = null;
            synchronized (this.bindLock) {
                synchronized (this.boundAddresses) {
                    if (this.boundAddresses.isEmpty()) {
                        obj = 1;
                    }
                }
                if (getHandler() == null) {
                    throw new IllegalStateException("handler is not set.");
                }
                try {
                    Collection bindInternal = bindInternal(arrayList);
                    synchronized (this.boundAddresses) {
                        this.boundAddresses.addAll(bindInternal);
                    }
                } catch (IOException e) {
                    throw e;
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Throwable e3) {
                    throw new RuntimeIoException("Failed to bind to: " + getLocalAddresses(), e3);
                }
            }
            if (obj != null) {
                getListeners().fireServiceActivated();
            }
        }
    }

    public final void unbind() {
        unbind(getLocalAddresses());
    }

    public final void unbind(SocketAddress socketAddress) {
        if (socketAddress == null) {
            throw new IllegalArgumentException("localAddress");
        }
        Iterable arrayList = new ArrayList(1);
        arrayList.add(socketAddress);
        unbind(arrayList);
    }

    public final void unbind(SocketAddress socketAddress, SocketAddress... socketAddressArr) {
        if (socketAddress == null) {
            throw new IllegalArgumentException("firstLocalAddress");
        } else if (socketAddressArr == null) {
            throw new IllegalArgumentException("otherLocalAddresses");
        } else {
            Iterable arrayList = new ArrayList();
            arrayList.add(socketAddress);
            Collections.addAll(arrayList, socketAddressArr);
            unbind(arrayList);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void unbind(java.lang.Iterable<? extends java.net.SocketAddress> r9) {
        /*
        r8 = this;
        r1 = 0;
        if (r9 != 0) goto L_0x000b;
    L_0x0003:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "localAddresses";
        r0.<init>(r1);
        throw r0;
    L_0x000b:
        r3 = r8.bindLock;
        monitor-enter(r3);
        r4 = r8.boundAddresses;	 Catch:{ all -> 0x0045 }
        monitor-enter(r4);	 Catch:{ all -> 0x0045 }
        r0 = r8.boundAddresses;	 Catch:{ all -> 0x0042 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0042 }
        if (r0 == 0) goto L_0x001c;
    L_0x0019:
        monitor-exit(r4);	 Catch:{ all -> 0x0042 }
        monitor-exit(r3);	 Catch:{ all -> 0x0045 }
    L_0x001b:
        return;
    L_0x001c:
        r5 = new java.util.ArrayList;	 Catch:{ all -> 0x0042 }
        r5.<init>();	 Catch:{ all -> 0x0042 }
        r6 = r9.iterator();	 Catch:{ all -> 0x0042 }
        r2 = r1;
    L_0x0026:
        r0 = r6.hasNext();	 Catch:{ all -> 0x0042 }
        if (r0 == 0) goto L_0x0048;
    L_0x002c:
        r0 = r6.next();	 Catch:{ all -> 0x0042 }
        r0 = (java.net.SocketAddress) r0;	 Catch:{ all -> 0x0042 }
        r2 = r2 + 1;
        if (r0 == 0) goto L_0x0026;
    L_0x0036:
        r7 = r8.boundAddresses;	 Catch:{ all -> 0x0042 }
        r7 = r7.contains(r0);	 Catch:{ all -> 0x0042 }
        if (r7 == 0) goto L_0x0026;
    L_0x003e:
        r5.add(r0);	 Catch:{ all -> 0x0042 }
        goto L_0x0026;
    L_0x0042:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0042 }
        throw r0;	 Catch:{ all -> 0x0045 }
    L_0x0045:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0045 }
        throw r0;
    L_0x0048:
        if (r2 != 0) goto L_0x0052;
    L_0x004a:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x0042 }
        r1 = "localAddresses is empty.";
        r0.<init>(r1);	 Catch:{ all -> 0x0042 }
        throw r0;	 Catch:{ all -> 0x0042 }
    L_0x0052:
        r0 = r5.isEmpty();	 Catch:{ all -> 0x0042 }
        if (r0 != 0) goto L_0x0091;
    L_0x0058:
        r8.unbind0(r5);	 Catch:{ RuntimeException -> 0x0075, Exception -> 0x0077 }
        r0 = r8.boundAddresses;	 Catch:{ all -> 0x0042 }
        r0.removeAll(r5);	 Catch:{ all -> 0x0042 }
        r0 = r8.boundAddresses;	 Catch:{ all -> 0x0042 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0042 }
        if (r0 == 0) goto L_0x0091;
    L_0x0068:
        r0 = 1;
    L_0x0069:
        monitor-exit(r4);	 Catch:{ all -> 0x0042 }
        monitor-exit(r3);	 Catch:{ all -> 0x0045 }
        if (r0 == 0) goto L_0x001b;
    L_0x006d:
        r0 = r8.getListeners();
        r0.fireServiceDeactivated();
        goto L_0x001b;
    L_0x0075:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0042 }
    L_0x0077:
        r0 = move-exception;
        r1 = new org.apache.mina.core.RuntimeIoException;	 Catch:{ all -> 0x0042 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0042 }
        r5 = "Failed to unbind from: ";
        r2.<init>(r5);	 Catch:{ all -> 0x0042 }
        r5 = r8.getLocalAddresses();	 Catch:{ all -> 0x0042 }
        r2 = r2.append(r5);	 Catch:{ all -> 0x0042 }
        r2 = r2.toString();	 Catch:{ all -> 0x0042 }
        r1.<init>(r2, r0);	 Catch:{ all -> 0x0042 }
        throw r1;	 Catch:{ all -> 0x0042 }
    L_0x0091:
        r0 = r1;
        goto L_0x0069;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.mina.core.service.AbstractIoAcceptor.unbind(java.lang.Iterable):void");
    }

    public String toString() {
        TransportMetadata transportMetadata = getTransportMetadata();
        return "(" + transportMetadata.getProviderName() + ' ' + transportMetadata.getName() + " acceptor: " + (isActive() ? "localAddress(es): " + getLocalAddresses() + ", managedSessionCount: " + getManagedSessionCount() : "not bound") + ')';
    }

    private void checkAddressType(SocketAddress socketAddress) {
        if (socketAddress != null && !getTransportMetadata().getAddressType().isAssignableFrom(socketAddress.getClass())) {
            throw new IllegalArgumentException("localAddress type: " + socketAddress.getClass().getSimpleName() + " (expected: " + getTransportMetadata().getAddressType().getSimpleName() + ")");
        }
    }
}
