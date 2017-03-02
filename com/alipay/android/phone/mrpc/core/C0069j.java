package com.alipay.android.phone.mrpc.core;

import com.loopj.android.http.AsyncHttpClient;
import com.tencent.connect.common.Constants;
import com.tencent.mm.sdk.constants.ConstantsAPI;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.wxop.stat.StatAccount;
import com.tencent.wxop.stat.common.StatConstants;
import com.zkunity.app.ResourceIDs;
import java.lang.reflect.Method;
import java.util.List;
import java.util.UUID;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

/* renamed from: com.alipay.android.phone.mrpc.core.j */
public final class C0069j extends C0057a {
    private C0065g f39g;

    public C0069j(C0065g c0065g, Method method, int i, String str, byte[] bArr, boolean z) {
        super(method, i, str, bArr, "application/x-www-form-urlencoded", z);
        this.f39g = c0065g;
    }

    public final Object m75a() {
        Throwable e;
        C0075t c0076o = new C0076o(this.f39g.m64a());
        c0076o.m96a(this.b);
        c0076o.m92a(this.e);
        c0076o.m95a(this.f);
        c0076o.m93a(ResourceIDs.ID, String.valueOf(this.d));
        c0076o.m93a("operationType", this.c);
        c0076o.m93a(AsyncHttpClient.ENCODING_GZIP, String.valueOf(this.f39g.m67d()));
        c0076o.m94a(new BasicHeader("uuid", UUID.randomUUID().toString()));
        List<Header> b = this.f39g.m66c().m48b();
        if (!(b == null || b.isEmpty())) {
            for (Header a : b) {
                c0076o.m94a(a);
            }
        }
        new StringBuilder("threadid = ").append(Thread.currentThread().getId()).append("; ").append(c0076o.toString());
        try {
            C0077u c0077u = (C0077u) this.f39g.m65b().m50a(c0076o).get();
            if (c0077u != null) {
                return c0077u.m103b();
            }
            throw new RpcException(Integer.valueOf(9), "response is null");
        } catch (Throwable e2) {
            throw new RpcException(Integer.valueOf(13), Constants.STR_EMPTY, e2);
        } catch (Throwable e22) {
            Throwable th = e22;
            e22 = th.getCause();
            if (e22 == null || !(e22 instanceof HttpException)) {
                throw new RpcException(Integer.valueOf(9), Constants.STR_EMPTY, th);
            }
            HttpException httpException = (HttpException) e22;
            int code = httpException.getCode();
            switch (code) {
                case StatConstants.XG_PRO_VERSION /*1*/:
                    code = 2;
                    break;
                case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                    code = 3;
                    break;
                case StatConstants.STAT_DB_VERSION /*3*/:
                    code = 4;
                    break;
                case StatAccount.WECHAT_OPENID_TYPE /*4*/:
                    code = 5;
                    break;
                case StatAccount.PHONE_NUM_TYPE /*5*/:
                    code = 6;
                    break;
                case StatAccount.EMAIL_TYPE /*6*/:
                    code = 7;
                    break;
                case StatAccount.CUSTOM_TYPE /*7*/:
                    code = 8;
                    break;
                case IMediaObject.TYPE_EMOJI /*8*/:
                    code = 15;
                    break;
                case ConstantsAPI.COMMAND_ADD_CARD_TO_EX_CARD_PACKAGE /*9*/:
                    code = 16;
                    break;
            }
            throw new RpcException(Integer.valueOf(code), httpException.getMsg());
        } catch (Throwable e222) {
            throw new RpcException(Integer.valueOf(13), Constants.STR_EMPTY, e222);
        }
    }
}
