package com.tencent.android.tpush.service.channel.p075b;

import com.tencent.android.tpush.service.channel.exception.IORefusedException;
import com.tencent.android.tpush.service.channel.exception.InnerException;
import com.tencent.android.tpush.service.channel.exception.UnexpectedDataException;
import com.tencent.mm.sdk.modelbase.BaseResp.ErrCode;
import com.tencent.mm.sdk.modelpay.PayReq.Options;
import com.texaspoker.moment.TexasPoker.PushMsg;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: com.tencent.android.tpush.service.channel.b.h */
public class ProGuard extends ProGuard implements ProGuard {
    protected HashMap f7640a;
    protected int f7641b;
    protected int f7642c;

    public ProGuard(int i) {
        this.f7640a = new HashMap(4);
        this.f7641b = 0;
        this.f7642c = -1;
        this.d = (short) 80;
        this.e = i;
    }

    public synchronized void m5195d() {
        super.m5152d();
        this.f7640a.clear();
    }

    public int m5190a(OutputStream outputStream) {
        int i;
        Throwable e;
        m5151c();
        try {
            this.f7641b = 0;
            i = 0;
            while (!m5150b()) {
                try {
                    int i2 = this.f7641b;
                    this.f7641b = i2 + 1;
                    if (i2 > 2) {
                        throw new InnerException("the duration of the current step is too long!");
                    }
                    switch (this.f7642c) {
                        case ErrCode.ERR_UNSUPPORT /*-5*/:
                            i += m5197f(outputStream);
                            break;
                        case ErrCode.ERR_AUTH_DENIED /*-4*/:
                            i += m5196e(outputStream);
                            break;
                        case ErrCode.ERR_SENT_FAILED /*-3*/:
                            i += m5194d(outputStream);
                            break;
                        case ErrCode.ERR_USER_CANCEL /*-2*/:
                            i += m5193c(outputStream);
                            break;
                        case Options.INVALID_FLAGS /*-1*/:
                            i += m5192b(outputStream);
                            break;
                        case SQLiteDatabase.OPEN_READWRITE /*0*/:
                            m5195d();
                            break;
                        default:
                            throw new InnerException("illegal step value!");
                    }
                } catch (IORefusedException e2) {
                    e = e2;
                }
            }
        } catch (Throwable e3) {
            Throwable th = e3;
            i = 0;
            e = th;
            com.tencent.android.tpush.p067a.ProGuard.m4716c("Channel.SendPacket", "write >>> IORefusedException thrown", e);
            return i;
        }
        return i;
    }

    void m5191a(int i) {
        if (this.f7642c != i) {
            this.f7641b = 0;
        }
        this.f7642c = i;
    }

    protected int m5192b(OutputStream outputStream) {
        com.tencent.android.tpush.service.channel.p076c.ProGuard.m5247a(outputStream, this.d);
        m5191a(-2);
        return 1;
    }

    protected int m5193c(OutputStream outputStream) {
        com.tencent.android.tpush.service.channel.p076c.ProGuard.m5247a(outputStream, this.k);
        switch (this.k) {
            case SQLiteDatabase.OPEN_READONLY /*1*/:
            case PushMsg.SMSG_FIELD_NUMBER /*10*/:
                m5191a(-3);
                break;
            case PushMsg.STSHAREPOKERHISTORYINFO_FIELD_NUMBER /*20*/:
                m5191a(0);
                break;
            default:
                throw new UnexpectedDataException("protocol: " + this.k);
        }
        return 1;
    }

    protected int m5194d(OutputStream outputStream) {
        com.tencent.android.tpush.service.channel.p076c.ProGuard.m5252b(outputStream, this.e);
        m5191a(-5);
        return 4;
    }

    protected int m5196e(OutputStream outputStream) {
        com.tencent.android.tpush.service.channel.p076c.ProGuard.m5248a(outputStream, this.f);
        m5191a(-5);
        return 4;
    }

    protected int m5197f(OutputStream outputStream) {
        byte[] bArr = (byte[]) this.f7640a.get("packetData");
        if (bArr == null) {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                if (this.k == (short) 10) {
                    m5189h(byteArrayOutputStream);
                } else {
                    m5188g(byteArrayOutputStream);
                }
                Object toByteArray = byteArrayOutputStream.toByteArray();
                this.f = (long) (toByteArray.length + 10);
                this.f7640a.put("packetData", toByteArray);
                this.f7640a.put("packetDataLeftLength", Integer.valueOf(toByteArray.length));
                m5191a(-4);
                return 0;
            } catch (Throwable e) {
                throw new UnexpectedDataException("packetData can not be write correctly!", e);
            }
        }
        int intValue = ((Integer) this.f7640a.get("packetDataLeftLength")).intValue();
        if (intValue == 0) {
            m5191a(0);
            return 0;
        }
        int a = com.tencent.android.tpush.service.channel.p076c.ProGuard.m5249a(outputStream, bArr);
        this.f7640a.put("packetDataLeftLength", Integer.valueOf(intValue - a));
        return a;
    }

    private void m5188g(OutputStream outputStream) {
        this.i = (short) 0;
        if (this.j.needsUpdate()) {
            this.i = (short) 1;
            this.j.update();
        }
        com.tencent.android.tpush.service.channel.p076c.ProGuard.m5247a(outputStream, this.i);
        this.g = this.j.getRandom();
        com.tencent.android.tpush.service.channel.p076c.ProGuard.m5248a(outputStream, this.g);
        if (this.i != (short) 0) {
            com.tencent.android.tpush.service.channel.p076c.ProGuard.m5249a(outputStream, this.j.getEncKey());
        }
        m5189h(outputStream);
    }

    private void m5189h(OutputStream outputStream) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        com.tencent.android.tpush.service.channel.p076c.ProGuard.m5248a(byteArrayOutputStream, this.k != (short) 1 ? 0 : this.j.getInc());
        com.tencent.android.tpush.service.channel.p076c.ProGuard.m5247a(byteArrayOutputStream, this.l);
        com.tencent.android.tpush.service.channel.p076c.ProGuard.m5247a(byteArrayOutputStream, this.h);
        com.tencent.android.tpush.service.channel.p076c.ProGuard.m5247a(byteArrayOutputStream, this.m);
        byteArrayOutputStream.write(this.n);
        byte[] toByteArray = byteArrayOutputStream.toByteArray();
        if (this.k == (short) 1) {
            toByteArray = this.j.encryptData(toByteArray);
        }
        com.tencent.android.tpush.service.channel.p076c.ProGuard.m5249a(outputStream, toByteArray);
    }
}
