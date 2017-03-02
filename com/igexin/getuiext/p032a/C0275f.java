package com.igexin.getuiext.p032a;

import android.content.Context;
import android.content.Intent;
import com.igexin.download.Downloads;
import com.igexin.download.SdkDownLoader;
import com.igexin.getuiext.data.Consts;
import com.tencent.tauth.AuthActivity;
import com.zkunity.app.ResourceIDs;

/* renamed from: com.igexin.getuiext.a.f */
public class C0275f implements C0270a {
    public void m962a(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra(AuthActivity.ACTION_KEY);
        int intExtra = intent.getIntExtra(ResourceIDs.ID, -1);
        if (Consts.verifyCode == intent.getIntExtra("verifyCode", -1) && intExtra != -1) {
            try {
                if ("run".equals(stringExtra)) {
                    SdkDownLoader.getInstantiate(context).updateTask(intExtra, Downloads.COLUMN_CONTROL, String.valueOf(0));
                } else {
                    SdkDownLoader.getInstantiate(context).pauseTask(intExtra);
                }
            } catch (Exception e) {
            }
        }
    }
}
