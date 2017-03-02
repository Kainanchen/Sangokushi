package com.igexin.getuiext.ui;

import android.content.Context;
import android.os.AsyncTask;
import com.igexin.getuiext.data.Consts;
import com.igexin.getuiext.data.p034a.C0291d;
import com.igexin.getuiext.service.C0295a;
import com.igexin.getuiext.util.C0329c;

/* renamed from: com.igexin.getuiext.ui.c */
final class C0307c extends AsyncTask {
    final /* synthetic */ C0291d f823a;
    final /* synthetic */ Context f824b;

    C0307c(C0291d c0291d, Context context) {
        this.f823a = c0291d;
        this.f824b = context;
    }

    protected String m1048a(Void... voidArr) {
        String str = this.f823a.f775h;
        if (str != null && str.startsWith("http")) {
            str = C0329c.m1095a(str, Consts.DEFAULT_RETRY_TIMES);
            if (!(str == null || str.contains("data_error"))) {
                return str;
            }
        }
        return null;
    }

    protected void m1049a(String str) {
        super.onPostExecute(str);
        if (str != null) {
            C0295a.m1016a(this.f824b, this.f823a, 13);
        }
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m1048a((Void[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m1049a((String) obj);
    }
}
