package com.igexin.getuiext.service;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import com.igexin.getuiext.util.C0329c;
import com.tencent.connect.common.Constants;
import org.apache.http.MethodNotSupportedException;

/* renamed from: com.igexin.getuiext.service.e */
class C0299e extends AsyncTask {
    final /* synthetic */ C0298d f817a;

    C0299e(C0298d c0298d) {
        this.f817a = c0298d;
    }

    protected Void m1036a(String... strArr) {
        String str = strArr[0];
        String str2 = strArr[1];
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(C0329c.m1093a(Constants.HTTP_GET, str, null));
            if (decodeStream != null) {
                C0297c.m1021a().m1023a(str2, decodeStream);
            }
        } catch (MethodNotSupportedException e) {
        }
        return null;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m1036a((String[]) objArr);
    }
}
