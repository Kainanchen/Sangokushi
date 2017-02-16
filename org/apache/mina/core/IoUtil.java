package org.apache.mina.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.future.IoFuture;
import org.apache.mina.core.future.WriteFuture;
import org.apache.mina.core.session.IoSession;

public final class IoUtil {
    private static final IoSession[] EMPTY_SESSIONS;

    static {
        EMPTY_SESSIONS = new IoSession[0];
    }

    public static List<WriteFuture> broadcast(Object obj, Collection<IoSession> collection) {
        Object arrayList = new ArrayList(collection.size());
        broadcast(obj, collection.iterator(), arrayList);
        return arrayList;
    }

    public static List<WriteFuture> broadcast(Object obj, Iterable<IoSession> iterable) {
        Object arrayList = new ArrayList();
        broadcast(obj, iterable.iterator(), arrayList);
        return arrayList;
    }

    public static List<WriteFuture> broadcast(Object obj, Iterator<IoSession> it) {
        Object arrayList = new ArrayList();
        broadcast(obj, it, arrayList);
        return arrayList;
    }

    public static List<WriteFuture> broadcast(Object obj, IoSession... ioSessionArr) {
        int i = 0;
        if (ioSessionArr == null) {
            ioSessionArr = EMPTY_SESSIONS;
        }
        List<WriteFuture> arrayList = new ArrayList(ioSessionArr.length);
        int length;
        if (obj instanceof IoBuffer) {
            for (IoSession write : ioSessionArr) {
                arrayList.add(write.write(((IoBuffer) obj).duplicate()));
            }
        } else {
            length = ioSessionArr.length;
            while (i < length) {
                arrayList.add(ioSessionArr[i].write(obj));
                i++;
            }
        }
        return arrayList;
    }

    private static void broadcast(Object obj, Iterator<IoSession> it, Collection<WriteFuture> collection) {
        if (obj instanceof IoBuffer) {
            while (it.hasNext()) {
                collection.add(((IoSession) it.next()).write(((IoBuffer) obj).duplicate()));
            }
            return;
        }
        while (it.hasNext()) {
            collection.add(((IoSession) it.next()).write(obj));
        }
    }

    public static void await(Iterable<? extends IoFuture> iterable) {
        for (IoFuture await : iterable) {
            await.await();
        }
    }

    public static void awaitUninterruptably(Iterable<? extends IoFuture> iterable) {
        for (IoFuture awaitUninterruptibly : iterable) {
            awaitUninterruptibly.awaitUninterruptibly();
        }
    }

    public static boolean await(Iterable<? extends IoFuture> iterable, long j, TimeUnit timeUnit) {
        return await(iterable, timeUnit.toMillis(j));
    }

    public static boolean await(Iterable<? extends IoFuture> iterable, long j) {
        return await0(iterable, j, true);
    }

    public static boolean awaitUninterruptibly(Iterable<? extends IoFuture> iterable, long j, TimeUnit timeUnit) {
        return awaitUninterruptibly(iterable, timeUnit.toMillis(j));
    }

    public static boolean awaitUninterruptibly(Iterable<? extends IoFuture> iterable, long j) {
        try {
            return await0(iterable, j, false);
        } catch (InterruptedException e) {
            throw new InternalError();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean await0(java.lang.Iterable<? extends org.apache.mina.core.future.IoFuture> r11, long r12, boolean r14) {
        /*
        r6 = 1;
        r4 = 0;
        r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1));
        if (r0 > 0) goto L_0x003c;
    L_0x0007:
        r2 = r4;
    L_0x0008:
        r7 = r11.iterator();
        r0 = r6;
        r8 = r12;
    L_0x000e:
        r1 = r7.hasNext();
        if (r1 == 0) goto L_0x004b;
    L_0x0014:
        r0 = r7.next();
        r0 = (org.apache.mina.core.future.IoFuture) r0;
    L_0x001a:
        if (r14 == 0) goto L_0x0042;
    L_0x001c:
        r1 = r0.await(r8);
    L_0x0020:
        r8 = java.lang.System.currentTimeMillis();
        r8 = r8 - r2;
        r8 = r12 - r8;
        if (r1 != 0) goto L_0x002f;
    L_0x0029:
        r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
        if (r10 <= 0) goto L_0x002f;
    L_0x002d:
        if (r1 == 0) goto L_0x001a;
    L_0x002f:
        r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
        if (r0 > 0) goto L_0x0049;
    L_0x0033:
        if (r1 == 0) goto L_0x0047;
    L_0x0035:
        r0 = r7.hasNext();
        if (r0 != 0) goto L_0x0047;
    L_0x003b:
        return r6;
    L_0x003c:
        r0 = java.lang.System.currentTimeMillis();
        r2 = r0;
        goto L_0x0008;
    L_0x0042:
        r1 = r0.awaitUninterruptibly(r8);
        goto L_0x0020;
    L_0x0047:
        r6 = 0;
        goto L_0x003b;
    L_0x0049:
        r0 = r1;
        goto L_0x000e;
    L_0x004b:
        r1 = r0;
        goto L_0x0033;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.mina.core.IoUtil.await0(java.lang.Iterable, long, boolean):boolean");
    }

    private IoUtil() {
    }
}
