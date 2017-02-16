package com.tencent.android.tpush.horse;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.sina.weibo.sdk.component.GameManager;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.XGPush4Msdk;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.horse.data.StrategyItem;
import com.tencent.android.tpush.service.channel.exception.HorseIgnoreException;
import com.tencent.android.tpush.service.channel.exception.InnerException;
import com.tencent.android.tpush.service.channel.exception.UnexpectedDataException;
import com.tencent.android.tpush.service.channel.protocol.TpnsRedirectRsp;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: com.tencent.android.tpush.horse.n */
public class ProGuard {
    private SocketChannel f7471a;
    private ArrayBlockingQueue f7472b;
    private StrategyItem f7473c;
    private long f7474d;
    private long f7475e;

    public ProGuard() {
        this.f7472b = new ArrayBlockingQueue(1);
    }

    public void m4944a(StrategyItem strategyItem) {
        Throwable th;
        this.f7474d = System.currentTimeMillis();
        this.f7473c = strategyItem;
        try {
            String debugServerInfo = XGPush4Msdk.getDebugServerInfo(com.tencent.android.tpush.service.ProGuard.m5376e());
            if (!com.tencent.android.tpush.service.p077d.ProGuard.m5317a(debugServerInfo)) {
                String[] split = debugServerInfo.split(",");
                if (split.length == 2 && split[0].length() > 4) {
                    this.f7473c = new StrategyItem(split[0], Integer.valueOf(split[1]).intValue(), strategyItem.m4901c(), strategyItem.m4903e(), strategyItem.m4902d(), 0);
                }
            }
        } catch (Throwable e) {
            com.tencent.android.tpush.p067a.ProGuard.m4716c("SocketClient", " XGPush4Msdk.getDebugServerInfo", e);
        }
        try {
            com.tencent.android.tpush.p067a.ProGuard.m4715c("SocketClient", "connect to " + this.f7473c.m4897a() + ":" + this.f7473c.m4900b());
            this.f7471a = SocketChannel.open();
            this.f7471a.configureBlocking(true);
            this.f7471a.socket().connect(m4940b(this.f7473c), ProGuard.m4911b());
            this.f7471a.socket().setSoTimeout(ProGuard.m4912c());
        } catch (Throwable e2) {
            th = e2;
            com.tencent.android.tpush.p067a.ProGuard.m4716c("SocketClient", LetterIndexBar.SEARCH_ICON_LETTER, th);
            m4941d();
            throw new HorseIgnoreException(strategyItem == null ? "null" : strategyItem.toString(), th);
        } catch (Throwable e22) {
            th = e22;
            com.tencent.android.tpush.p067a.ProGuard.m4716c("SocketClient", "socket connect error", th);
            m4941d();
            throw new HorseIgnoreException(strategyItem == null ? "null" : strategyItem.toString(), th);
        }
    }

    private InetSocketAddress m4940b(StrategyItem strategyItem) {
        if (strategyItem.m4902d() == 1 && strategyItem.m4906h()) {
            return new InetSocketAddress(strategyItem.m4901c(), strategyItem.m4903e());
        }
        return new InetSocketAddress(strategyItem.m4897a(), strategyItem.m4900b());
    }

    public SocketChannel m4942a() {
        return this.f7471a;
    }

    public void m4943a(JceStruct jceStruct) {
        Exception e;
        Throwable e2;
        JceOutputStream jceOutputStream = new JceOutputStream();
        jceOutputStream.setServerEncoding(GameManager.DEFAULT_CHARSET);
        jceStruct.writeTo(jceOutputStream);
        Closeable closeable = true;
        com.tencent.android.tpush.service.channel.p075b.ProGuard proGuard = new com.tencent.android.tpush.service.channel.p075b.ProGuard(1);
        proGuard.m5168b((short) 10);
        proGuard.m5166a((short) 10);
        proGuard.m5167a(jceOutputStream.getByteBuffer().array());
        try {
            closeable = new ByteArrayOutputStream();
            try {
                if (this.f7473c.m4902d() == 0) {
                    while (!proGuard.m5150b()) {
                        proGuard.m5190a((OutputStream) closeable);
                    }
                } else {
                    com.tencent.android.tpush.service.channel.p075b.ProGuard proGuard2 = new com.tencent.android.tpush.service.channel.p075b.ProGuard(this.f7473c.m4897a(), "http://" + this.f7473c.m4897a() + ":" + this.f7473c.m4900b() + "/");
                    if (this.f7473c.m4906h()) {
                        proGuard2.m5163a("X-Online-Host", this.f7473c.m4897a() + ":" + this.f7473c.m4900b());
                    }
                    proGuard2.m5162a(proGuard);
                    while (!proGuard2.m5150b()) {
                        proGuard2.m5160a((OutputStream) closeable);
                    }
                }
                closeable.writeTo(this.f7471a.socket().getOutputStream());
                closeable.flush();
                com.tencent.android.tpush.common.ProGuard.m4791a(closeable);
            } catch (InnerException e3) {
                e = e3;
                com.tencent.android.tpush.p067a.ProGuard.m4716c("SocketClient", "SocketClient -> send ", e);
                m4941d();
                throw new HorseIgnoreException(e);
            } catch (IOException e4) {
                e = e4;
                com.tencent.android.tpush.p067a.ProGuard.m4716c("SocketClient", "SocketClient -> send ", e);
                m4941d();
                throw new HorseIgnoreException(e);
            } catch (UnexpectedDataException e5) {
                e = e5;
                com.tencent.android.tpush.p067a.ProGuard.m4716c("SocketClient", "SocketClient -> send ", e);
                m4941d();
                throw new HorseIgnoreException(e);
            } catch (Exception e6) {
                e2 = e6;
                com.tencent.android.tpush.p067a.ProGuard.m4716c("SocketClient", "SocketClient -> send ", e2);
                m4941d();
                com.tencent.android.tpush.common.ProGuard.m4791a(closeable);
            }
        } catch (InnerException e7) {
            e = e7;
            closeable = null;
            com.tencent.android.tpush.p067a.ProGuard.m4716c("SocketClient", "SocketClient -> send ", e);
            m4941d();
            throw new HorseIgnoreException(e);
        } catch (IOException e8) {
            e = e8;
            closeable = null;
            com.tencent.android.tpush.p067a.ProGuard.m4716c("SocketClient", "SocketClient -> send ", e);
            m4941d();
            throw new HorseIgnoreException(e);
        } catch (UnexpectedDataException e9) {
            e = e9;
            closeable = null;
            com.tencent.android.tpush.p067a.ProGuard.m4716c("SocketClient", "SocketClient -> send ", e);
            m4941d();
            throw new HorseIgnoreException(e);
        } catch (Exception e10) {
            e2 = e10;
            closeable = null;
            com.tencent.android.tpush.p067a.ProGuard.m4716c("SocketClient", "SocketClient -> send ", e2);
            m4941d();
            com.tencent.android.tpush.common.ProGuard.m4791a(closeable);
        } catch (Throwable th) {
            e2 = th;
            com.tencent.android.tpush.common.ProGuard.m4791a(closeable);
            throw e2;
        }
    }

    private void m4941d() {
        try {
            ProGuard proGuard = (ProGuard) this.f7472b.remove();
            if (proGuard != null) {
                proGuard.m4876b(this.f7473c);
            }
        } catch (Throwable e) {
            com.tencent.android.tpush.p067a.ProGuard.m4716c("SocketClient", "notifyFail", e);
        }
        this.f7475e = System.currentTimeMillis();
    }

    public void m4946b() {
        int i = 0;
        if (this.f7473c == null) {
            m4941d();
            throw new HorseIgnoreException("Recv() fail,because mStrategyItem is null");
        }
        byte[] k;
        InputStream inputStream;
        byte[] bArr;
        InputStream byteArrayInputStream;
        if (this.f7473c == null || this.f7473c.m4902d() != 0) {
            com.tencent.android.tpush.service.channel.p075b.ProGuard proGuard = new com.tencent.android.tpush.service.channel.p075b.ProGuard();
            try {
                inputStream = this.f7471a.socket().getInputStream();
                bArr = new byte[AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT];
                byteArrayInputStream = new ByteArrayInputStream(bArr);
                while (!proGuard.m5150b()) {
                    i += inputStream.read(bArr, i, 1024 - i);
                    proGuard.m5154a(byteArrayInputStream);
                }
                if (proGuard.f7616i == null || proGuard.f7616i.size() <= 0) {
                    com.tencent.android.tpush.p067a.ProGuard.m4723h(Constants.ServiceLogTag, ">> packet is null or packet.recvPackets is null");
                    m4941d();
                    return;
                }
                k = ((com.tencent.android.tpush.service.channel.p075b.ProGuard) proGuard.f7616i.get(0)).m5175k();
            } catch (Exception e) {
                com.tencent.android.tpush.p067a.ProGuard.m4716c(Constants.ServiceLogTag, LetterIndexBar.SEARCH_ICON_LETTER, e);
                m4941d();
                throw new HorseIgnoreException(e);
            } catch (Exception e2) {
                com.tencent.android.tpush.p067a.ProGuard.m4716c(Constants.ServiceLogTag, LetterIndexBar.SEARCH_ICON_LETTER, e2);
                m4941d();
                throw new HorseIgnoreException(e2);
            } catch (Exception e22) {
                com.tencent.android.tpush.p067a.ProGuard.m4716c(Constants.ServiceLogTag, LetterIndexBar.SEARCH_ICON_LETTER, e22);
                m4941d();
                throw new HorseIgnoreException(e22);
            } catch (Exception e222) {
                com.tencent.android.tpush.p067a.ProGuard.m4716c(Constants.ServiceLogTag, LetterIndexBar.SEARCH_ICON_LETTER, e222);
                m4941d();
                throw new HorseIgnoreException(e222);
            } catch (Throwable e3) {
                com.tencent.android.tpush.p067a.ProGuard.m4716c(Constants.ServiceLogTag, LetterIndexBar.SEARCH_ICON_LETTER, e3);
                m4941d();
                k = null;
            }
        } else {
            com.tencent.android.tpush.service.channel.p075b.ProGuard proGuard2 = new com.tencent.android.tpush.service.channel.p075b.ProGuard();
            try {
                inputStream = this.f7471a.socket().getInputStream();
                bArr = new byte[AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT];
                byteArrayInputStream = new ByteArrayInputStream(bArr);
                while (!proGuard2.m5150b()) {
                    i = inputStream.read(bArr, i, 1024 - i);
                    proGuard2.m5178a(byteArrayInputStream);
                }
                k = proGuard2.m5175k();
            } catch (Exception e2222) {
                com.tencent.android.tpush.p067a.ProGuard.m4716c("SocketClient", "SocketClient -> recv ", e2222);
                m4941d();
                throw new HorseIgnoreException(e2222);
            } catch (Exception e22222) {
                com.tencent.android.tpush.p067a.ProGuard.m4716c("SocketClient", "SocketClient -> recv ", e22222);
                m4941d();
                throw new HorseIgnoreException(e22222);
            } catch (Exception e222222) {
                com.tencent.android.tpush.p067a.ProGuard.m4716c("SocketClient", "SocketClient -> recv ", e222222);
                m4941d();
                throw new HorseIgnoreException(e222222);
            } catch (Exception e2222222) {
                com.tencent.android.tpush.p067a.ProGuard.m4716c("SocketClient", "SocketClient -> recv ", e2222222);
                m4941d();
                throw new HorseIgnoreException(e2222222);
            } catch (Throwable e32) {
                com.tencent.android.tpush.p067a.ProGuard.m4716c("SocketClient", "SocketClient -> recv ", e32);
                m4941d();
                k = null;
            }
        }
        if (k == null) {
            com.tencent.android.tpush.p067a.ProGuard.m4723h(Constants.ServiceLogTag, ">> dataBuffer is null");
            m4941d();
            return;
        }
        ProGuard proGuard3;
        JceInputStream jceInputStream = new JceInputStream(k);
        jceInputStream.setServerEncoding(GameManager.DEFAULT_CHARSET);
        TpnsRedirectRsp tpnsRedirectRsp = new TpnsRedirectRsp();
        tpnsRedirectRsp.readFrom(jceInputStream);
        try {
            proGuard3 = (ProGuard) this.f7472b.remove();
        } catch (Throwable e322) {
            com.tencent.android.tpush.p067a.ProGuard.m4716c(Constants.ServiceLogTag, "callBacks.remove()", e322);
            proGuard3 = null;
        }
        if (proGuard3 != null) {
            CharSequence a = com.tencent.android.tpush.service.p077d.ProGuard.m5305a(tpnsRedirectRsp.ip);
            int i2 = tpnsRedirectRsp.port;
            StrategyItem strategyItem = new StrategyItem(a, i2, this.f7473c.m4901c(), this.f7473c.m4903e(), this.f7473c.m4902d(), this.f7473c.m4904f());
            if (!TextUtils.isEmpty(a) && i2 != 0) {
                strategyItem.m4898a(1);
                if (proGuard3 != null) {
                    proGuard3.m4875a(this.f7473c, strategyItem);
                }
            } else if (proGuard3 != null) {
                proGuard3.m4874a(this.f7473c);
            }
        }
        this.f7475e = System.currentTimeMillis();
    }

    public void m4947c() {
        try {
            this.f7471a.close();
            this.f7472b.clear();
        } catch (Throwable e) {
            com.tencent.android.tpush.p067a.ProGuard.m4716c("SocketClient", "mSocketChannel.close()", e);
        }
    }

    public void m4945a(ProGuard proGuard) {
        try {
            this.f7472b.add(proGuard);
        } catch (Throwable e) {
            com.tencent.android.tpush.p067a.ProGuard.m4716c("SocketClient", "register", e);
        }
    }
}
