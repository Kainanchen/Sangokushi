package com.igexin.push.p040c.p043c;

import com.igexin.p022a.p023a.p025d.C0230a;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.wxop.stat.common.StatConstants;

/* renamed from: com.igexin.push.c.c.e */
public abstract class C0351e extends C0230a {
    public int f928i;
    public byte f929j;

    protected int m1172a(String str) {
        return str.equals(AsyncHttpResponseHandler.DEFAULT_CHARSET) ? 1 : str.equals("UTF-16") ? 2 : str.equals("UTF-16BE") ? 16 : str.equals("UTF-16LE") ? 17 : str.equals("GBK") ? 25 : str.equals("GB2312") ? 26 : str.equals("GB18030") ? 27 : str.equals("ISO-8859-1") ? 33 : 1;
    }

    protected String m1173a(byte b) {
        switch (b & 63) {
            case StatConstants.XG_PRO_VERSION /*1*/:
                return AsyncHttpResponseHandler.DEFAULT_CHARSET;
            case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                return "UTF-16";
            case IMediaObject.TYPE_CARD_SHARE /*16*/:
                return "UTF-16BE";
            case IMediaObject.TYPE_LOCATION_SHARE /*17*/:
                return "UTF-16LE";
            case IMediaObject.TYPE_DESIGNER_SHARED /*25*/:
                return "GBK";
            case 26:
                return "GB2312";
            case 27:
                return "GB18030";
            case 33:
                return "ISO-8859-1";
            default:
                return AsyncHttpResponseHandler.DEFAULT_CHARSET;
        }
    }

    public abstract void m1174a(byte[] bArr);

    public int m1175b() {
        return this.f928i;
    }

    public abstract byte[] m1176d();
}
