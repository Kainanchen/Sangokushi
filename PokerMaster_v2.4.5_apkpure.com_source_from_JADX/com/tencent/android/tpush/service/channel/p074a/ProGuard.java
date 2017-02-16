package com.tencent.android.tpush.service.channel.p074a;

import android.support.v4.media.TransportMediator;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.service.channel.security.TpnsSecurity;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;

/* renamed from: com.tencent.android.tpush.service.channel.a.a */
public class ProGuard extends Thread {
    protected ProGuard f7586a;
    public SocketChannel f7587b;
    protected Selector f7588c;
    protected TpnsSecurity f7589d;
    protected com.tencent.android.tpush.service.channel.p075b.ProGuard f7590e;
    protected com.tencent.android.tpush.service.channel.p075b.ProGuard f7591f;
    protected String f7592g;
    protected int f7593h;
    protected int f7594i;
    protected long f7595j;
    protected com.tencent.android.tpush.service.channel.ProGuard f7596k;
    private volatile boolean f7597l;

    public ProGuard(SocketChannel socketChannel, ProGuard proGuard) {
        super("TpnsClient");
        this.f7587b = null;
        this.f7588c = null;
        this.f7589d = new TpnsSecurity();
        this.f7590e = null;
        this.f7591f = null;
        this.f7592g = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f7593h = 0;
        this.f7594i = 0;
        this.f7597l = false;
        this.f7595j = Long.MAX_VALUE;
        this.f7596k = null;
        if (socketChannel.socket().isConnected()) {
            this.f7592g = socketChannel.socket().getInetAddress() == null ? LetterIndexBar.SEARCH_ICON_LETTER : socketChannel.socket().getInetAddress().getHostAddress();
            this.f7593h = socketChannel.socket().getPort();
            this.f7594i = 0;
            com.tencent.android.tpush.p067a.ProGuard.m4720e("TpnsClient", "Connect to Xinge Server succeed!");
        } else {
            com.tencent.android.tpush.p067a.ProGuard.m4723h("TpnsClient", "TpnsClient -> the socketChannel is not connected");
        }
        this.f7587b = socketChannel;
        this.f7586a = proGuard;
    }

    protected boolean m5119a() {
        if (this.f7590e == null) {
            this.f7590e = new com.tencent.android.tpush.service.channel.p075b.ProGuard();
            ((com.tencent.android.tpush.service.channel.p075b.ProGuard) this.f7590e).m5149a(this.f7589d);
        }
        return true;
    }

    protected boolean m5120b() {
        if (this.f7591f == null) {
            ArrayList a = this.f7586a.m5127a(this, 1);
            if (!a.isEmpty()) {
                this.f7591f = (com.tencent.android.tpush.service.channel.p075b.ProGuard) a.get(0);
            }
            if (this.f7591f != null) {
                ((com.tencent.android.tpush.service.channel.p075b.ProGuard) this.f7591f).m5149a(this.f7589d);
            }
        }
        return this.f7591f != null;
    }

    public void m5117a(ProGuard proGuard, com.tencent.android.tpush.service.channel.p075b.ProGuard proGuard2) {
        this.f7586a.m5132b(proGuard, (com.tencent.android.tpush.service.channel.p075b.ProGuard) proGuard2);
    }

    public void m5118a(ProGuard proGuard, com.tencent.android.tpush.service.channel.p075b.ProGuard proGuard2) {
        if ((((com.tencent.android.tpush.service.channel.p075b.ProGuard) proGuard2).m5172h() & TransportMediator.KEYCODE_MEDIA_PAUSE) != 7) {
            this.f7586a.m5129a(proGuard, (com.tencent.android.tpush.service.channel.p075b.ProGuard) proGuard2);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r13 = this;
        r0 = com.tencent.android.tpush.XGPushConfig.enableDebug;
        if (r0 == 0) goto L_0x000b;
    L_0x0004:
        r0 = "TpnsClient";
        r1 = "TpnsClient is running and ready for send and recevie msg.";
        com.tencent.android.tpush.p067a.ProGuard.m4718d(r0, r1);
    L_0x000b:
        r0 = java.nio.channels.Selector.open();	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r13.f7588c = r0;	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r0 = r13.f7587b;	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r1 = 0;
        r0.configureBlocking(r1);	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r0 = 24576; // 0x6000 float:3.4438E-41 double:1.2142E-319;
        r4 = java.nio.ByteBuffer.allocateDirect(r0);	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r5 = new com.tencent.android.tpush.service.channel.c.a;	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r0 = 24576; // 0x6000 float:3.4438E-41 double:1.2142E-319;
        r1 = 0;
        r5.<init>(r0, r1);	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r0 = 24576; // 0x6000 float:3.4438E-41 double:1.2142E-319;
        r6 = new byte[r0];	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r0 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r7 = java.nio.ByteBuffer.allocateDirect(r0);	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r8 = new com.tencent.android.tpush.service.channel.c.a;	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r0 = -1;
        r1 = 0;
        r8.<init>(r0, r1);	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r0 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r9 = new byte[r0];	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r7.flip();	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r2 = 0;
    L_0x003f:
        r0 = r13.f7597l;	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        if (r0 != 0) goto L_0x007a;
    L_0x0043:
        r0 = r13.f7587b;	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r1 = r13.f7588c;	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r10 = 1;
        r0.register(r1, r10);	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r0 = r13.m5120b();	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        if (r0 != 0) goto L_0x005d;
    L_0x0051:
        r0 = r7.remaining();	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        if (r0 > 0) goto L_0x005d;
    L_0x0057:
        r0 = r8.m5240c();	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        if (r0 <= 0) goto L_0x0065;
    L_0x005d:
        r0 = r13.f7587b;	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r1 = r13.f7588c;	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r10 = 4;
        r0.register(r1, r10);	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
    L_0x0065:
        r0 = r13.m5125g();	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        if (r0 == 0) goto L_0x0097;
    L_0x006b:
        r0 = r13.f7590e;	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        if (r0 != 0) goto L_0x0097;
    L_0x006f:
        r0 = r13.f7591f;	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        if (r0 != 0) goto L_0x0097;
    L_0x0073:
        r0 = "TpnsClient";
        r1 = ">> retired!!!";
        com.tencent.android.tpush.p067a.ProGuard.m4723h(r0, r1);	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
    L_0x007a:
        monitor-enter(r13);
        r0 = r13.f7588c;	 Catch:{ Exception -> 0x024f }
        r0.close();	 Catch:{ Exception -> 0x024f }
    L_0x0080:
        r0 = r13.f7587b;	 Catch:{ Exception -> 0x0269 }
        r0.close();	 Catch:{ Exception -> 0x0269 }
    L_0x0085:
        monitor-exit(r13);	 Catch:{ all -> 0x0266 }
        r0 = r13.f7597l;
        if (r0 == 0) goto L_0x0280;
    L_0x008a:
        r0 = "TpnsClient";
        r1 = "<<< Run <<< exit!!! cancelled! ";
        com.tencent.android.tpush.p067a.ProGuard.m4723h(r0, r1);
        r0 = r13.f7586a;
        r0.m5128a(r13);
    L_0x0096:
        return;
    L_0x0097:
        r0 = r13.f7588c;	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r0.select(r2);	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r2 = 0;
        r0 = r13.f7591f;	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        if (r0 == 0) goto L_0x00f4;
    L_0x00a2:
        r0 = r13.f7591f;	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r0 = r0.m5145a();	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r2 = 0;
        r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r2 > 0) goto L_0x00ed;
    L_0x00ae:
        r0 = new java.util.concurrent.TimeoutException;	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r1 = "\u53d1\u9001\u8d85\u65f6";
        r0.<init>(r1);	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        throw r0;	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
    L_0x00b6:
        r0 = move-exception;
        r1 = "TpnsClient";
        r2 = "<<< Run <<< socketChannel IOException";
        com.tencent.android.tpush.p067a.ProGuard.m4716c(r1, r2, r0);	 Catch:{ all -> 0x03b9 }
        r1 = new com.tencent.android.tpush.service.channel.exception.ChannelException;	 Catch:{ all -> 0x03b9 }
        r2 = 10103; // 0x2777 float:1.4157E-41 double:4.9915E-320;
        r3 = "TpnsClient\u53d1\u751fIO\u5f02\u5e38\uff0c\u94fe\u8def\u53ef\u80fd\u88ab\u5173\u95ed";
        r1.<init>(r2, r3, r0);	 Catch:{ all -> 0x03b9 }
        monitor-enter(r13);
        r0 = r13.f7588c;	 Catch:{ Exception -> 0x028e }
        r0.close();	 Catch:{ Exception -> 0x028e }
    L_0x00cd:
        r0 = r13.f7587b;	 Catch:{ Exception -> 0x02a8 }
        r0.close();	 Catch:{ Exception -> 0x02a8 }
    L_0x00d2:
        monitor-exit(r13);	 Catch:{ all -> 0x02a5 }
        r0 = "TpnsClient";
        r2 = new java.lang.StringBuilder;
        r3 = "<<< Run <<< exit!!! cause: ";
        r2.<init>(r3);
        r2 = r2.append(r1);
        r2 = r2.toString();
        com.tencent.android.tpush.p067a.ProGuard.m4723h(r0, r2);
        r0 = r13.f7586a;
        r0.m5130a(r13, r1);
        goto L_0x0096;
    L_0x00ed:
        r2 = 0;
        r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x0144;
    L_0x00f3:
        r2 = r0;
    L_0x00f4:
        r0 = r13.f7590e;	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        if (r0 == 0) goto L_0x014c;
    L_0x00f8:
        r0 = r13.f7590e;	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r0 = r0.m5145a();	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r10 = 0;
        r10 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1));
        if (r10 > 0) goto L_0x0147;
    L_0x0104:
        r0 = new java.util.concurrent.TimeoutException;	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r1 = "\u63a5\u6536\u8d85\u65f6";
        r0.<init>(r1);	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        throw r0;	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
    L_0x010c:
        r0 = move-exception;
        r1 = "TpnsClient";
        r2 = "<<< Run <<< socketChannel InnerException";
        com.tencent.android.tpush.p067a.ProGuard.m4716c(r1, r2, r0);	 Catch:{ all -> 0x03b9 }
        r1 = new com.tencent.android.tpush.service.channel.exception.ChannelException;	 Catch:{ all -> 0x03b9 }
        r2 = 10104; // 0x2778 float:1.4159E-41 double:4.992E-320;
        r3 = "TpnsClient\u53d1\u751f\u5185\u90e8\u5f02\u5e38";
        r1.<init>(r2, r3, r0);	 Catch:{ all -> 0x03b9 }
        monitor-enter(r13);
        r0 = r13.f7588c;	 Catch:{ Exception -> 0x02bf }
        r0.close();	 Catch:{ Exception -> 0x02bf }
    L_0x0123:
        r0 = r13.f7587b;	 Catch:{ Exception -> 0x02d9 }
        r0.close();	 Catch:{ Exception -> 0x02d9 }
    L_0x0128:
        monitor-exit(r13);	 Catch:{ all -> 0x02d6 }
        r0 = "TpnsClient";
        r2 = new java.lang.StringBuilder;
        r3 = "<<< Run <<< exit!!! cause: ";
        r2.<init>(r3);
        r2 = r2.append(r1);
        r2 = r2.toString();
        com.tencent.android.tpush.p067a.ProGuard.m4723h(r0, r2);
        r0 = r13.f7586a;
        r0.m5130a(r13, r1);
        goto L_0x0096;
    L_0x0144:
        r0 = 0;
        goto L_0x00f3;
    L_0x0147:
        r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r10 >= 0) goto L_0x01bf;
    L_0x014b:
        r2 = r0;
    L_0x014c:
        r0 = r13.f7588c;	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r0 = r0.selectedKeys();	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r1 = r0.iterator();	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
    L_0x0156:
        r0 = r1.hasNext();	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        if (r0 == 0) goto L_0x003f;
    L_0x015c:
        r0 = r1.next();	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r0 = (java.nio.channels.SelectionKey) r0;	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r10 = r0.isReadable();	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        if (r10 == 0) goto L_0x01d4;
    L_0x0168:
        r4.clear();	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r10 = r5.m5241d();	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r4.limit(r10);	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r10 = r13.f7587b;	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r11 = r4.slice();	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r10 = r10.read(r11);	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r11 = -1;
        if (r10 != r11) goto L_0x01c1;
    L_0x017f:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r1 = "socket channel read return -1";
        r0.<init>(r1);	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        throw r0;	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
    L_0x0187:
        r0 = move-exception;
        r1 = "TpnsClient";
        r2 = "<<< Run <<< socketChannel UnexpectedDataException";
        com.tencent.android.tpush.p067a.ProGuard.m4716c(r1, r2, r0);	 Catch:{ all -> 0x03b9 }
        r1 = new com.tencent.android.tpush.service.channel.exception.ChannelException;	 Catch:{ all -> 0x03b9 }
        r2 = 10108; // 0x277c float:1.4164E-41 double:4.994E-320;
        r3 = "TpnsClient\u53d1\u751f\u975e\u9884\u671f\u6570\u636e\u5f02\u5e38";
        r1.<init>(r2, r3, r0);	 Catch:{ all -> 0x03b9 }
        monitor-enter(r13);
        r0 = r13.f7588c;	 Catch:{ Exception -> 0x02f0 }
        r0.close();	 Catch:{ Exception -> 0x02f0 }
    L_0x019e:
        r0 = r13.f7587b;	 Catch:{ Exception -> 0x030a }
        r0.close();	 Catch:{ Exception -> 0x030a }
    L_0x01a3:
        monitor-exit(r13);	 Catch:{ all -> 0x0307 }
        r0 = "TpnsClient";
        r2 = new java.lang.StringBuilder;
        r3 = "<<< Run <<< exit!!! cause: ";
        r2.<init>(r3);
        r2 = r2.append(r1);
        r2 = r2.toString();
        com.tencent.android.tpush.p067a.ProGuard.m4723h(r0, r2);
        r0 = r13.f7586a;
        r0.m5130a(r13, r1);
        goto L_0x0096;
    L_0x01bf:
        r0 = r2;
        goto L_0x014b;
    L_0x01c1:
        r11 = 0;
        r4.get(r6, r11, r10);	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r11 = r5.m5238a();	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r12 = 0;
        r11.write(r6, r12, r10);	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r10 = r5.m5239b();	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r13.m5115a(r10);	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
    L_0x01d4:
        r0 = r0.isWritable();	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        if (r0 == 0) goto L_0x020d;
    L_0x01da:
        r0 = r8.m5238a();	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r13.m5116a(r0);	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r0 = r8.m5240c();	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        if (r0 <= 0) goto L_0x020d;
    L_0x01e7:
        r7.compact();	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r0 = r7.remaining();	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r10 = r8.m5240c();	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        if (r0 >= r10) goto L_0x024a;
    L_0x01f4:
        r0 = r7.remaining();	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
    L_0x01f8:
        r10 = r8.m5239b();	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r11 = 0;
        r0 = r10.read(r9, r11, r0);	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r10 = 0;
        r7.put(r9, r10, r0);	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r7.flip();	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r0 = r13.f7587b;	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        r0.write(r7);	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
    L_0x020d:
        r1.remove();	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        goto L_0x0156;
    L_0x0212:
        r0 = move-exception;
        r1 = "TpnsClient";
        r2 = "<<< Run <<< socketChannel TimeoutException";
        com.tencent.android.tpush.p067a.ProGuard.m4716c(r1, r2, r0);	 Catch:{ all -> 0x03b9 }
        r1 = new com.tencent.android.tpush.service.channel.exception.ChannelException;	 Catch:{ all -> 0x03b9 }
        r2 = 10105; // 0x2779 float:1.416E-41 double:4.9925E-320;
        r3 = "TpnsClient\u53d1\u751f\u8d85\u65f6\u5f02\u5e38";
        r1.<init>(r2, r3, r0);	 Catch:{ all -> 0x03b9 }
        monitor-enter(r13);
        r0 = r13.f7588c;	 Catch:{ Exception -> 0x0321 }
        r0.close();	 Catch:{ Exception -> 0x0321 }
    L_0x0229:
        r0 = r13.f7587b;	 Catch:{ Exception -> 0x033b }
        r0.close();	 Catch:{ Exception -> 0x033b }
    L_0x022e:
        monitor-exit(r13);	 Catch:{ all -> 0x0338 }
        r0 = "TpnsClient";
        r2 = new java.lang.StringBuilder;
        r3 = "<<< Run <<< exit!!! cause: ";
        r2.<init>(r3);
        r2 = r2.append(r1);
        r2 = r2.toString();
        com.tencent.android.tpush.p067a.ProGuard.m4723h(r0, r2);
        r0 = r13.f7586a;
        r0.m5130a(r13, r1);
        goto L_0x0096;
    L_0x024a:
        r0 = r8.m5240c();	 Catch:{ IOException -> 0x00b6, InnerException -> 0x010c, UnexpectedDataException -> 0x0187, TimeoutException -> 0x0212, Exception -> 0x0352 }
        goto L_0x01f8;
    L_0x024f:
        r0 = move-exception;
        r1 = "TpnsClient";
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0266 }
        r3 = ">>> Run >>> selector.close() ";
        r2.<init>(r3);	 Catch:{ all -> 0x0266 }
        r0 = r2.append(r0);	 Catch:{ all -> 0x0266 }
        r0 = r0.toString();	 Catch:{ all -> 0x0266 }
        com.tencent.android.tpush.p067a.ProGuard.m4723h(r1, r0);	 Catch:{ all -> 0x0266 }
        goto L_0x0080;
    L_0x0266:
        r0 = move-exception;
        monitor-exit(r13);	 Catch:{ all -> 0x0266 }
        throw r0;
    L_0x0269:
        r0 = move-exception;
        r1 = "TpnsClient";
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0266 }
        r3 = ">>> Run >>> socketChannel.close(): ";
        r2.<init>(r3);	 Catch:{ all -> 0x0266 }
        r0 = r2.append(r0);	 Catch:{ all -> 0x0266 }
        r0 = r0.toString();	 Catch:{ all -> 0x0266 }
        com.tencent.android.tpush.p067a.ProGuard.m4723h(r1, r0);	 Catch:{ all -> 0x0266 }
        goto L_0x0085;
    L_0x0280:
        r0 = "TpnsClient";
        r1 = "<<< Run <<< exit!!! Retired! ";
        com.tencent.android.tpush.p067a.ProGuard.m4723h(r0, r1);
        r0 = r13.f7586a;
        r0.m5131b(r13);
        goto L_0x0096;
    L_0x028e:
        r0 = move-exception;
        r2 = "TpnsClient";
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x02a5 }
        r4 = ">>> Run >>> selector.close() ";
        r3.<init>(r4);	 Catch:{ all -> 0x02a5 }
        r0 = r3.append(r0);	 Catch:{ all -> 0x02a5 }
        r0 = r0.toString();	 Catch:{ all -> 0x02a5 }
        com.tencent.android.tpush.p067a.ProGuard.m4723h(r2, r0);	 Catch:{ all -> 0x02a5 }
        goto L_0x00cd;
    L_0x02a5:
        r0 = move-exception;
        monitor-exit(r13);	 Catch:{ all -> 0x02a5 }
        throw r0;
    L_0x02a8:
        r0 = move-exception;
        r2 = "TpnsClient";
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x02a5 }
        r4 = ">>> Run >>> socketChannel.close(): ";
        r3.<init>(r4);	 Catch:{ all -> 0x02a5 }
        r0 = r3.append(r0);	 Catch:{ all -> 0x02a5 }
        r0 = r0.toString();	 Catch:{ all -> 0x02a5 }
        com.tencent.android.tpush.p067a.ProGuard.m4723h(r2, r0);	 Catch:{ all -> 0x02a5 }
        goto L_0x00d2;
    L_0x02bf:
        r0 = move-exception;
        r2 = "TpnsClient";
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x02d6 }
        r4 = ">>> Run >>> selector.close() ";
        r3.<init>(r4);	 Catch:{ all -> 0x02d6 }
        r0 = r3.append(r0);	 Catch:{ all -> 0x02d6 }
        r0 = r0.toString();	 Catch:{ all -> 0x02d6 }
        com.tencent.android.tpush.p067a.ProGuard.m4723h(r2, r0);	 Catch:{ all -> 0x02d6 }
        goto L_0x0123;
    L_0x02d6:
        r0 = move-exception;
        monitor-exit(r13);	 Catch:{ all -> 0x02d6 }
        throw r0;
    L_0x02d9:
        r0 = move-exception;
        r2 = "TpnsClient";
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x02d6 }
        r4 = ">>> Run >>> socketChannel.close(): ";
        r3.<init>(r4);	 Catch:{ all -> 0x02d6 }
        r0 = r3.append(r0);	 Catch:{ all -> 0x02d6 }
        r0 = r0.toString();	 Catch:{ all -> 0x02d6 }
        com.tencent.android.tpush.p067a.ProGuard.m4723h(r2, r0);	 Catch:{ all -> 0x02d6 }
        goto L_0x0128;
    L_0x02f0:
        r0 = move-exception;
        r2 = "TpnsClient";
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0307 }
        r4 = ">>> Run >>> selector.close() ";
        r3.<init>(r4);	 Catch:{ all -> 0x0307 }
        r0 = r3.append(r0);	 Catch:{ all -> 0x0307 }
        r0 = r0.toString();	 Catch:{ all -> 0x0307 }
        com.tencent.android.tpush.p067a.ProGuard.m4723h(r2, r0);	 Catch:{ all -> 0x0307 }
        goto L_0x019e;
    L_0x0307:
        r0 = move-exception;
        monitor-exit(r13);	 Catch:{ all -> 0x0307 }
        throw r0;
    L_0x030a:
        r0 = move-exception;
        r2 = "TpnsClient";
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0307 }
        r4 = ">>> Run >>> socketChannel.close(): ";
        r3.<init>(r4);	 Catch:{ all -> 0x0307 }
        r0 = r3.append(r0);	 Catch:{ all -> 0x0307 }
        r0 = r0.toString();	 Catch:{ all -> 0x0307 }
        com.tencent.android.tpush.p067a.ProGuard.m4723h(r2, r0);	 Catch:{ all -> 0x0307 }
        goto L_0x01a3;
    L_0x0321:
        r0 = move-exception;
        r2 = "TpnsClient";
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0338 }
        r4 = ">>> Run >>> selector.close() ";
        r3.<init>(r4);	 Catch:{ all -> 0x0338 }
        r0 = r3.append(r0);	 Catch:{ all -> 0x0338 }
        r0 = r0.toString();	 Catch:{ all -> 0x0338 }
        com.tencent.android.tpush.p067a.ProGuard.m4723h(r2, r0);	 Catch:{ all -> 0x0338 }
        goto L_0x0229;
    L_0x0338:
        r0 = move-exception;
        monitor-exit(r13);	 Catch:{ all -> 0x0338 }
        throw r0;
    L_0x033b:
        r0 = move-exception;
        r2 = "TpnsClient";
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0338 }
        r4 = ">>> Run >>> socketChannel.close(): ";
        r3.<init>(r4);	 Catch:{ all -> 0x0338 }
        r0 = r3.append(r0);	 Catch:{ all -> 0x0338 }
        r0 = r0.toString();	 Catch:{ all -> 0x0338 }
        com.tencent.android.tpush.p067a.ProGuard.m4723h(r2, r0);	 Catch:{ all -> 0x0338 }
        goto L_0x022e;
    L_0x0352:
        r0 = move-exception;
        r1 = "TpnsClient";
        r2 = "<<< Run <<< socketChannel Exception";
        com.tencent.android.tpush.p067a.ProGuard.m4716c(r1, r2, r0);	 Catch:{ all -> 0x03b9 }
        r1 = new com.tencent.android.tpush.service.channel.exception.ChannelException;	 Catch:{ all -> 0x03b9 }
        r2 = 10109; // 0x277d float:1.4166E-41 double:4.9945E-320;
        r3 = "TpnsClient\u53d1\u751f\u672a\u77e5\u5f02\u5e38";
        r1.<init>(r2, r3, r0);	 Catch:{ all -> 0x03b9 }
        monitor-enter(r13);
        r0 = r13.f7588c;	 Catch:{ Exception -> 0x038a }
        r0.close();	 Catch:{ Exception -> 0x038a }
    L_0x0369:
        r0 = r13.f7587b;	 Catch:{ Exception -> 0x03a3 }
        r0.close();	 Catch:{ Exception -> 0x03a3 }
    L_0x036e:
        monitor-exit(r13);	 Catch:{ all -> 0x03a0 }
        r0 = "TpnsClient";
        r2 = new java.lang.StringBuilder;
        r3 = "<<< Run <<< exit!!! cause: ";
        r2.<init>(r3);
        r2 = r2.append(r1);
        r2 = r2.toString();
        com.tencent.android.tpush.p067a.ProGuard.m4723h(r0, r2);
        r0 = r13.f7586a;
        r0.m5130a(r13, r1);
        goto L_0x0096;
    L_0x038a:
        r0 = move-exception;
        r2 = "TpnsClient";
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03a0 }
        r4 = ">>> Run >>> selector.close() ";
        r3.<init>(r4);	 Catch:{ all -> 0x03a0 }
        r0 = r3.append(r0);	 Catch:{ all -> 0x03a0 }
        r0 = r0.toString();	 Catch:{ all -> 0x03a0 }
        com.tencent.android.tpush.p067a.ProGuard.m4723h(r2, r0);	 Catch:{ all -> 0x03a0 }
        goto L_0x0369;
    L_0x03a0:
        r0 = move-exception;
        monitor-exit(r13);	 Catch:{ all -> 0x03a0 }
        throw r0;
    L_0x03a3:
        r0 = move-exception;
        r2 = "TpnsClient";
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03a0 }
        r4 = ">>> Run >>> socketChannel.close(): ";
        r3.<init>(r4);	 Catch:{ all -> 0x03a0 }
        r0 = r3.append(r0);	 Catch:{ all -> 0x03a0 }
        r0 = r0.toString();	 Catch:{ all -> 0x03a0 }
        com.tencent.android.tpush.p067a.ProGuard.m4723h(r2, r0);	 Catch:{ all -> 0x03a0 }
        goto L_0x036e;
    L_0x03b9:
        r0 = move-exception;
        monitor-enter(r13);
        r1 = r13.f7588c;	 Catch:{ Exception -> 0x03d7 }
        r1.close();	 Catch:{ Exception -> 0x03d7 }
    L_0x03c0:
        r1 = r13.f7587b;	 Catch:{ Exception -> 0x03f0 }
        r1.close();	 Catch:{ Exception -> 0x03f0 }
    L_0x03c5:
        monitor-exit(r13);	 Catch:{ all -> 0x03ed }
        r1 = r13.f7597l;
        if (r1 == 0) goto L_0x0406;
    L_0x03ca:
        r1 = "TpnsClient";
        r2 = "<<< Run <<< exit!!! cancelled! ";
        com.tencent.android.tpush.p067a.ProGuard.m4723h(r1, r2);
        r1 = r13.f7586a;
        r1.m5128a(r13);
    L_0x03d6:
        throw r0;
    L_0x03d7:
        r1 = move-exception;
        r2 = "TpnsClient";
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03ed }
        r4 = ">>> Run >>> selector.close() ";
        r3.<init>(r4);	 Catch:{ all -> 0x03ed }
        r1 = r3.append(r1);	 Catch:{ all -> 0x03ed }
        r1 = r1.toString();	 Catch:{ all -> 0x03ed }
        com.tencent.android.tpush.p067a.ProGuard.m4723h(r2, r1);	 Catch:{ all -> 0x03ed }
        goto L_0x03c0;
    L_0x03ed:
        r0 = move-exception;
        monitor-exit(r13);	 Catch:{ all -> 0x03ed }
        throw r0;
    L_0x03f0:
        r1 = move-exception;
        r2 = "TpnsClient";
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03ed }
        r4 = ">>> Run >>> socketChannel.close(): ";
        r3.<init>(r4);	 Catch:{ all -> 0x03ed }
        r1 = r3.append(r1);	 Catch:{ all -> 0x03ed }
        r1 = r1.toString();	 Catch:{ all -> 0x03ed }
        com.tencent.android.tpush.p067a.ProGuard.m4723h(r2, r1);	 Catch:{ all -> 0x03ed }
        goto L_0x03c5;
    L_0x0406:
        r1 = "TpnsClient";
        r2 = "<<< Run <<< exit!!! Retired! ";
        com.tencent.android.tpush.p067a.ProGuard.m4723h(r1, r2);
        r1 = r13.f7586a;
        r1.m5131b(r13);
        goto L_0x03d6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.android.tpush.service.channel.a.a.run():void");
    }

    protected int m5115a(InputStream inputStream) {
        int i = 0;
        while (inputStream.available() > 0) {
            m5119a();
            if (this.f7590e != null) {
                i += this.f7590e.m5153a(inputStream);
                if (!this.f7590e.m5147b()) {
                    com.tencent.android.tpush.p067a.ProGuard.m4723h(Constants.TcpRecvPackLogTag, ">> recvHandle not success");
                    break;
                }
                m5117a(this, this.f7590e);
                this.f7590e = null;
            }
        }
        return i;
    }

    protected int m5116a(OutputStream outputStream) {
        int i = 0;
        if (!m5125g()) {
            m5120b();
        }
        if (this.f7591f != null) {
            i = this.f7591f.m5159a(outputStream);
            if (this.f7591f.m5147b()) {
                m5118a(this, this.f7591f);
                this.f7591f = null;
            }
            if (m5120b()) {
                m5126h();
            }
        }
        return i;
    }

    public synchronized void start() {
        super.start();
    }

    public synchronized void m5121c() {
        this.f7597l = true;
        m5126h();
    }

    public synchronized boolean m5122d() {
        boolean isConnected;
        if (this.f7587b != null) {
            isConnected = this.f7587b.isConnected();
        } else {
            isConnected = false;
        }
        return isConnected;
    }

    public boolean m5123e() {
        return this.f7594i == 1;
    }

    public com.tencent.android.tpush.service.channel.ProGuard m5124f() {
        boolean z = true;
        if (this.f7596k == null) {
            Object[] objArr = new Object[6];
            objArr[0] = Integer.valueOf(0);
            objArr[1] = this.f7592g;
            objArr[2] = Integer.valueOf(1);
            objArr[3] = Integer.valueOf(this.f7593h);
            objArr[4] = Integer.valueOf(2);
            if (this.f7594i != 1) {
                z = false;
            }
            objArr[5] = Boolean.valueOf(z);
            this.f7596k = new com.tencent.android.tpush.service.channel.ProGuard(objArr);
        }
        return this.f7596k;
    }

    protected boolean m5125g() {
        return System.currentTimeMillis() > this.f7595j;
    }

    public void m5126h() {
        try {
            if (this.f7588c != null && this.f7588c.isOpen()) {
                this.f7588c.wakeup();
            }
        } catch (Throwable th) {
            com.tencent.android.tpush.p067a.ProGuard.m4716c("TpnsClient", ">>selector wakeup err", th);
        }
    }

    public String toString() {
        return new StringBuffer(getClass().getSimpleName()).append("(ip:").append(this.f7592g).append(",port:").append(this.f7593h).append(",protocol:").append(this.f7594i == 1 ? "http" : "tcp").append(")").toString();
    }
}
