package com.igexin.p022a.p023a.p027b.p028a.p029a;

import com.igexin.p022a.p023a.p025d.C0243e;
import com.igexin.p022a.p023a.p027b.C0234f;
import com.igexin.p022a.p023a.p027b.C0242c;
import com.igexin.p022a.p023a.p027b.C0244d;
import com.igexin.p022a.p023a.p027b.C0245e;
import com.igexin.p022a.p023a.p030c.C0247a;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.igexin.a.a.b.a.a.e */
public final class C0238e extends C0234f {
    static volatile C0238e f583k;
    Selector f584e;
    AtomicBoolean f585f;
    AtomicBoolean f586g;
    volatile boolean f587h;
    final long f588i;
    int f589j;
    volatile long f590l;
    volatile long f591m;
    volatile long f592n;
    ConcurrentLinkedQueue f593o;
    List f594p;
    C0237d f595q;
    ByteBuffer f596r;
    boolean f597s;
    int f598t;
    final Comparator f599u;

    public C0238e(int i, String str, C0242c c0242c) {
        super(i, str, c0242c);
        this.f588i = 15000;
        this.f589j = 0;
        this.f590l = 0;
        this.f591m = 0;
        this.f592n = 0;
        this.f597s = false;
        this.f599u = new C0239f(this);
        this.f585f = new AtomicBoolean(false);
        this.f586g = new AtomicBoolean(true);
        this.f593o = new ConcurrentLinkedQueue();
        this.f594p = new ArrayList(16);
        this.f596r = ByteBuffer.allocate(61440);
    }

    public static C0238e m768a(String str, C0242c c0242c) {
        if (f583k == null || f583k.E || f583k.w) {
            C0247a.m838b("NioSocketTask|getInstance, new niosocket url = " + str);
            C0238e c0238e = new C0238e(-2047, str, c0242c);
            f583k = c0238e;
            return c0238e;
        } else if (f583k.a.equals(str)) {
            return f583k;
        } else {
            C0247a.m838b("NioSocketTask|IllegalArgumentException socket.url" + f583k.a + " != " + str);
            throw new IllegalArgumentException();
        }
    }

    public static C0238e m769h() {
        return f583k;
    }

    final void m770a(SocketChannel socketChannel) {
        C0247a.m836a("niosockettask|toRead");
        int read;
        do {
            try {
                read = socketChannel.read(this.f596r);
                if (read < 0) {
                    C0247a.m836a("niosockettask|socketread|-1|");
                    this.f598t++;
                    if (this.f598t > 20) {
                        this.f598t = 0;
                        throw new EOFException("NioConnection Read EOF!");
                    }
                    return;
                } else if (read == 0) {
                    C0247a.m836a("niosockettask|socketread|0|");
                    return;
                } else {
                    this.f589j = 0;
                    this.f594p.clear();
                    this.f590l = 0;
                    this.f596r.flip();
                    int remaining = this.f596r.remaining();
                    C0244d c;
                    if (C0244d.f631f) {
                        c = C0244d.m802c();
                        c.f634d += (long) remaining;
                    } else {
                        c = C0244d.m802c();
                        c.f632b += (long) remaining;
                    }
                    if (this.b != null) {
                        this.b.m787c(this, this.d, this.f596r);
                    }
                    this.f596r.clear();
                }
            } catch (EOFException e) {
                C0247a.m838b("niosockettask|read exception|" + e.getMessage());
                throw e;
            } catch (Exception e2) {
                C0247a.m838b("niosockettask|read exception|" + e2.getMessage());
                throw new ClosedChannelException();
            }
        } while (read > 0);
    }

    public void a_() {
        super.a_();
        C0247a.m836a("niosockettask|run");
        if (this.d == null) {
            try {
                if (m745l() != null) {
                    C0247a.m836a("niosockettask|wakelock|connect|off");
                    m745l().release();
                }
                m776g();
                if (m745l() != null) {
                    m745l().acquire();
                    C0247a.m836a("niosockettask|wakelock|connect|on");
                }
            } catch (Throwable th) {
                if (m745l() != null) {
                    m745l().acquire();
                    C0247a.m836a("niosockettask|wakelock|connect|on");
                }
            }
        } else if (this.f585f.get() || this.f595q.f578b) {
            C0247a.m836a("niosockettask|close|" + this.f585f.get() + "|" + this.f595q.f578b);
            if (this.f585f.get()) {
                C0232b c0232b = new C0232b();
                c0232b.f543a = 1;
                C0244d.m802c().m797a((Object) c0232b);
                C0247a.m838b("NioSocketTask|DisConnectResult responseTask");
            }
            C0247a.m838b("NioSocketTask|ClosedChannelException");
            throw new ClosedChannelException();
        } else {
            if (!this.f593o.isEmpty()) {
                this.f595q.m765b(true);
            }
            if (this.f590l < 0) {
                this.f590l = 0;
            }
            this.f591m = System.currentTimeMillis();
            try {
                int select;
                if (m745l() != null) {
                    C0247a.m836a("niosockettask|wakelock|select|off");
                    m745l().release();
                }
                if (this.f590l > 0) {
                    P.m798b((this.f591m + this.f590l) + C0243e.f613x);
                    this.f586g.set(false);
                    select = this.f584e.select(this.f590l);
                    P.m799f();
                } else {
                    this.f586g.set(false);
                    select = this.f584e.select();
                }
                if (m745l() != null) {
                    m745l().acquire();
                    C0247a.m836a("niosockettask|wakelock|select|on");
                }
                this.f592n = System.currentTimeMillis() - this.f591m;
                this.f589j++;
                if (this.f589j > 30) {
                    C0247a.m838b("niosockettask|selectorexception");
                    throw new ClosedChannelException();
                }
                C0247a.m836a("niosockettask|selectedCount|" + select);
                if (select > 0) {
                    Set<SelectionKey> selectedKeys = this.f584e.selectedKeys();
                    for (SelectionKey selectionKey : selectedKeys) {
                        if (selectionKey.isValid() && selectionKey.isWritable()) {
                            this.f590l = m772b((SocketChannel) selectionKey.channel());
                        }
                        if (selectionKey.isValid() && selectionKey.isReadable()) {
                            m770a((SocketChannel) selectionKey.channel());
                        }
                    }
                    for (SelectionKey selectionKey2 : selectedKeys) {
                        selectedKeys.remove(selectionKey2);
                    }
                }
                if (!this.f594p.isEmpty()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    C0240g c0240g = (C0240g) this.f594p.get(0);
                    if (c0240g.O == null || !c0240g.O.m851b()) {
                        c0240g.m748o();
                    } else if (c0240g.O.m849a(currentTimeMillis, c0240g)) {
                        C0247a.m838b("niosockettask|timerTasks timeout");
                        c0240g.m748o();
                        c0240g.O.m848a(c0240g);
                        throw new SocketTimeoutException("SocketTask do timeOut!");
                    } else {
                        this.f590l = c0240g.O.m850b(currentTimeMillis, c0240g);
                        if (this.f590l < 0) {
                            this.f590l = 0;
                        }
                    }
                }
            } catch (Throwable th2) {
                if (m745l() != null) {
                    m745l().acquire();
                    C0247a.m836a("niosockettask|wakelock|select|on");
                }
            }
        }
    }

    public final int m771b() {
        return -2047;
    }

    final long m772b(SocketChannel socketChannel) {
        int i = 0;
        C0247a.m836a("niosockettask|toWrite");
        if (this.f593o.isEmpty()) {
            return -1;
        }
        long currentTimeMillis = System.currentTimeMillis();
        do {
            int i2;
            ByteBuffer byteBuffer;
            C0240g c0240g = (C0240g) this.f593o.peek();
            C0247a.m836a("niosockettask|toWrite|" + c0240g.getClass().getName() + "|" + c0240g.hashCode());
            c0240g.d = this.d;
            if (c0240g.f602f != null) {
                i2 = i;
                byteBuffer = c0240g.f602f;
            } else {
                ByteBuffer wrap = ByteBuffer.wrap((byte[]) this.b.m788d(c0240g, this.d, c0240g.c));
                c0240g.f602f = wrap;
                i2 = i;
                byteBuffer = wrap;
            }
            while (byteBuffer.hasRemaining()) {
                try {
                    int write = socketChannel.write(byteBuffer);
                    this.f589j = 0;
                } catch (IOException e) {
                    C0247a.m838b("niosockettask|write exception|" + e.getMessage());
                    write = -1;
                } catch (Exception e2) {
                    C0247a.m838b("niosockettask|write exception|" + e2.getMessage());
                    write = -1;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    this.f595q.m765b(!this.f593o.isEmpty());
                }
                if (write > 0) {
                    C0244d c;
                    if (C0244d.f631f) {
                        c = C0244d.m802c();
                        c.f635e += (long) write;
                    } else {
                        c = C0244d.m802c();
                        c.f633c += (long) write;
                    }
                } else if (write < 0) {
                    C0247a.m838b("niosockettask|socketwrite|-1|" + byteBuffer.toString());
                    throw new ClosedChannelException();
                } else {
                    if (write == 0) {
                        write = i2 + 1;
                        if (i2 < 140) {
                            wait(200);
                            C0247a.m836a("niosockettask|socketwrite|0|" + byteBuffer.toString());
                            i2 = write;
                        }
                    }
                    C0247a.m836a("niosockettask|socketwrite|-2|" + byteBuffer.toString());
                    throw new SocketTimeoutException("write data error!");
                }
            }
            c0240g = (C0240g) this.f593o.poll();
            if (c0240g.J <= 0 || c0240g.O == null) {
                c0240g.m748o();
            } else {
                c0240g.m738a(currentTimeMillis);
                if (this.f594p.isEmpty()) {
                    this.f594p.add(c0240g);
                } else {
                    c0240g.m748o();
                }
            }
            i = 0;
        } while (!this.f593o.isEmpty());
        long toMillis = this.f594p.isEmpty() ? -1 : TimeUnit.SECONDS.toMillis((long) ((C0240g) this.f594p.get(0)).J);
        this.f595q.m765b(!this.f593o.isEmpty());
        return toMillis;
    }

    public final void m773d() {
        C0247a.m836a("niosockettask|initTask");
        C0247a.m838b("niosockettask|initTask");
        super.m742d();
        this.y = true;
        this.z = true;
        this.T = true;
        this.f585f.set(false);
    }

    protected void m774e() {
    }

    public void m775f() {
        Iterator it;
        if (f583k != null) {
            C0247a.m838b("NioSocketTask|dispose url = " + f583k.a);
        }
        try {
            this.f595q.m761a();
        } catch (Exception e) {
        }
        if (this.f584e != null) {
            try {
                this.f584e.selectNow();
                this.f584e.close();
            } catch (Exception e2) {
            }
        }
        this.f584e = null;
        this.f585f = null;
        if (!this.f593o.isEmpty()) {
            it = this.f593o.iterator();
            while (it.hasNext()) {
                ((C0240g) it.next()).m748o();
            }
            this.f593o.clear();
        }
        this.f593o = null;
        if (!this.f594p.isEmpty()) {
            for (C0240g o : this.f594p) {
                o.m748o();
            }
            this.f594p.clear();
        }
        this.f596r.clear();
        this.f596r = null;
        this.f586g = null;
        this.f585f = null;
        if (f583k == this) {
            f583k = null;
            C0247a.m838b("NioSocketTask|dispose singleInstanece = this, singleInstanece = null");
        } else {
            C0247a.m838b("NioSocketTask|dispose singleInstanece != this");
        }
        super.m757f();
    }

    final void m776g() {
        if (this.f584e == null) {
            this.f584e = Selector.open();
        }
        if (this.f595q == null) {
            this.f595q = new C0237d(this.f584e);
        }
        if (!this.f595q.m766b()) {
            this.f595q.m764a(this.a);
        }
        this.f586g.set(false);
        if (this.f584e.select(15000) > 0) {
            Set<SelectionKey> selectedKeys = this.f584e.selectedKeys();
            for (SelectionKey selectionKey : selectedKeys) {
                selectedKeys.remove(selectionKey);
                if (selectionKey.isValid() && selectionKey.isConnectable()) {
                    SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
                    if (socketChannel.finishConnect()) {
                        this.f587h = true;
                        this.d = new C0245e();
                        this.d.m816a(this.f595q);
                        Socket socket = socketChannel.socket();
                        C0247a.m838b("niosockettask|connected|" + (socket.getInetAddress() != null ? socketChannel.socket().getInetAddress().getHostAddress() : "0.0.0.0") + ":" + socketChannel.socket().getPort() + "|" + (socket.getLocalAddress() != null ? socketChannel.socket().getLocalAddress().getHostAddress() : "0.0.0.0") + ":" + socketChannel.socket().getLocalPort());
                    }
                }
            }
            if (this.d != null) {
                this.f584e.selectNow();
                this.f584e.close();
                this.f584e = null;
                this.f584e = Selector.open();
                this.f595q.m762a(this.f584e);
                this.f595q.f581e = this.f595q.m767c().register(this.f584e, 1);
            }
        } else if (this.f585f.get()) {
            C0247a.m836a("niosockettask|disConnect event");
            C0232b c0232b = new C0232b();
            c0232b.f543a = 2;
            C0244d.m802c().m797a((Object) c0232b);
            throw new ClosedChannelException();
        } else {
            C0247a.m838b("niosockettask|connect timeout");
            throw new SocketTimeoutException();
        }
    }

    public void m777i() {
        if (this.f584e == null) {
            C0247a.m838b("NioSocketTask|wakeUp, selector = null");
            throw new NullPointerException();
        } else if (!this.f584e.isOpen()) {
            C0247a.m838b("NioSocketTask|wakeUp, wakeUp, selector.isOpen = false");
            throw new IllegalStateException();
        } else if (this.f586g.compareAndSet(false, true)) {
            C0247a.m838b("NioSocketTask|wakeUp +++++");
            this.f584e.wakeup();
        }
    }
}
