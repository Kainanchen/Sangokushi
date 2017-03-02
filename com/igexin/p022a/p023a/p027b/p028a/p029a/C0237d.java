package com.igexin.p022a.p023a.p027b.p028a.p029a;

import com.igexin.p022a.p023a.p025d.p026a.C0228a;
import com.igexin.p022a.p023a.p027b.C0236b;
import com.igexin.p022a.p023a.p027b.C0246g;
import com.igexin.p022a.p023a.p030c.C0247a;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;

/* renamed from: com.igexin.a.a.b.a.a.d */
public final class C0237d implements C0236b, C0228a {
    SocketChannel f577a;
    boolean f578b;
    long f579c;
    SelectionKey f580d;
    SelectionKey f581e;
    Selector f582f;

    public C0237d(Selector selector) {
        this.f582f = selector;
        System.setProperty("java.net.preferIPv6Addresses", "false");
    }

    public void m761a() {
        try {
            m763a(false);
        } catch (Exception e) {
        }
        this.f577a = null;
        this.f582f = null;
    }

    final void m762a(Selector selector) {
        this.f582f = selector;
    }

    public final void m763a(boolean z) {
        if (z) {
            this.f578b = true;
            return;
        }
        try {
            if (this.f577a != null) {
                this.f577a.close();
            }
            if (this.f580d != null) {
                this.f580d.cancel();
                this.f580d.attach(null);
            }
            this.f580d = null;
            if (this.f581e != null) {
                this.f581e.cancel();
                this.f581e.attach(null);
            }
            this.f581e = null;
        } catch (Throwable th) {
            if (this.f580d != null) {
                this.f580d.cancel();
                this.f580d.attach(null);
            }
            this.f580d = null;
            if (this.f581e != null) {
                this.f581e.cancel();
                this.f581e.attach(null);
            }
            this.f581e = null;
        }
    }

    public final boolean m764a(String str) {
        if (this.f578b) {
            throw new IllegalStateException();
        }
        SocketChannel c = m767c();
        String[] a = C0246g.m828a(str);
        SocketAddress inetSocketAddress = new InetSocketAddress(a[1], Integer.parseInt(a[2]));
        this.f580d = c.register(this.f582f, 8);
        this.f579c = System.currentTimeMillis();
        c.connect(inetSocketAddress);
        Socket socket = c.socket();
        InetAddress localAddress = socket.getLocalAddress();
        C0247a.m838b("niosockettask|connecting|" + inetSocketAddress.getAddress().getHostAddress() + ":" + inetSocketAddress.getPort() + "|" + (localAddress != null ? localAddress.getHostAddress() : "0.0.0.0") + ":" + socket.getLocalPort());
        this.f577a = c;
        return true;
    }

    final void m765b(boolean z) {
        if (this.f581e != null && this.f581e.isValid()) {
            int interestOps = this.f581e.interestOps();
            this.f581e.interestOps(z ? interestOps | 4 : interestOps & -5);
        }
    }

    public final boolean m766b() {
        return (this.f577a == null || this.f578b || !this.f577a.isOpen()) ? false : this.f577a.isConnected() || this.f577a.isConnectionPending();
    }

    SocketChannel m767c() {
        if (this.f577a != null && this.f577a.isOpen()) {
            return this.f577a;
        }
        SocketChannel open = SocketChannel.open();
        open.configureBlocking(false);
        Socket socket = open.socket();
        socket.setTcpNoDelay(true);
        socket.setSoLinger(true, 0);
        socket.setSoTimeout(15000);
        return open;
    }
}
