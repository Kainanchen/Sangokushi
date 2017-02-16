package com.tencent.android.tpush.rpc;

import android.content.Intent;
import com.jg.EType;
import com.jg.JgMethodChecked;
import com.tencent.android.tpush.common.Constants;

/* renamed from: com.tencent.android.tpush.rpc.h */
public class ProGuard extends ProGuard {
    @JgMethodChecked(author = 1, fComment = "\u786e\u8ba4\u5df2\u8fdb\u884c\u5b89\u5168\u6821\u9a8c", lastDate = "20150316", reviewer = 3, vComment = {EType.INTENTSCHEMECHECK, EType.INTENTCHECK})
    public void m4968a(String str, ProGuard proGuard) {
        try {
            com.tencent.android.tpush.p068b.ProGuard.m4761a(com.tencent.android.tpush.service.ProGuard.m5376e()).m4763a(Intent.parseUri(str, 0));
            proGuard.m4962a();
        } catch (Throwable th) {
            com.tencent.android.tpush.p067a.ProGuard.m4716c(Constants.ServiceLogTag, "Show", th);
        }
    }

    public void m4967a() {
        try {
            com.tencent.android.tpush.service.ProGuard.m5369a(com.tencent.android.tpush.service.ProGuard.m5376e());
        } catch (Throwable th) {
            com.tencent.android.tpush.p067a.ProGuard.m4716c(Constants.ServiceLogTag, "startService", th);
        }
    }

    public void m4969b() {
    }
}
