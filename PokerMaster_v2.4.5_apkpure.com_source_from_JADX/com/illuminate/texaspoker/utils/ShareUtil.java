package com.illuminate.texaspoker.utils;

import a.does.not.Exists2;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.RelativeLayout;
import com.ali.fixHelper;
import com.illuminate.texaspoker.application.BaseApplication;
import com.illuminate.texaspoker.p058c.PokerHistory;
import com.sina.weibo.sdk.api.share.IWeiboShareAPI;
import com.sina.weibo.sdk.api.share.WeiboShareSDK;
import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.WXAPIFactory;
import com.texaspoker.moment.TexasPokerHttpBill.UserBillInfoNet;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.illuminate.texaspoker.utils.h */
public final class ShareUtil {
    private static ShareUtil f6695c;
    public IWXAPI f6696a;
    public IWeiboShareAPI f6697b;
    private RelativeLayout f6698d;

    /* renamed from: com.illuminate.texaspoker.utils.h.1 */
    class ShareUtil implements Comparator<Object> {
        final /* synthetic */ ShareUtil f6694a;

        ShareUtil(ShareUtil shareUtil) {
            this.f6694a = shareUtil;
        }

        public final int compare(Object obj, Object obj2) {
            if (((UserBillInfoNet) obj).getISngRank() > ((UserBillInfoNet) obj2).getISngRank()) {
                return 1;
            }
            return -1;
        }
    }

    static {
        fixHelper.fixfunc(new int[]{3639, 3640, 3641, 3642, 3643, 3644, 3645, 3646, 3647, 3648, 3649, 3650, 3651, 3652, 3653});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    private native void m4249a(Bitmap bitmap);

    private native void m4250a(String str, String str2, String str3, int i, byte[] bArr);

    private native void m4251a(byte[] bArr, byte[] bArr2, int i);

    private native void m4252b(int i);

    public final native void m4254a(int i);

    public final native void m4255a(Activity activity, String str);

    public final native void m4256a(View view, View view2, List<Object> list, long j, int i, int i2, int i3);

    public final native void m4257a(PokerHistory pokerHistory, int i, boolean z);

    public final native void m4258a(String str, String str2, int i, int i2, String str3, int i3, int i4);

    public final native void m4259a(String str, String str2, long j, String str3, String str4, String str5, int i, int i2, int i3);

    public final native void m4260a(String str, String str2, String str3, int i, Bitmap bitmap);

    public final native void m4261a(String str, String str2, String str3, Bitmap bitmap);

    public final native void m4262a(String str, String str2, String str3, Integer num, Integer num2, int i);

    public final native void m4263a(String str, String str2, String str3, Integer num, Integer num2, Integer num3, Integer num4, int i);

    public static ShareUtil m4248a() {
        if (f6695c == null) {
            f6695c = new ShareUtil();
        }
        f6695c.f6696a = WXAPIFactory.createWXAPI(BaseApplication.m3548a(), "wxc373d29b97145fd3", true);
        f6695c.f6697b = WeiboShareSDK.createWeiboAPI(BaseApplication.m3548a(), "4099207092");
        return f6695c;
    }

    private static byte[] m4253b(Bitmap bitmap) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
        bitmap.recycle();
        byte[] toByteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return toByteArray;
    }
}
