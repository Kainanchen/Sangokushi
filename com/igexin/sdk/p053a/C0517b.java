package com.igexin.sdk.p053a;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* renamed from: com.igexin.sdk.a.b */
public class C0517b {
    private String f1440a;

    public C0517b(Context context) {
        if (context != null) {
            context.getFilesDir();
            this.f1440a = "/data/data/" + context.getPackageName() + "/files/" + "init.pid";
        }
    }

    public void m1873a() {
        if (!m1874b() && this.f1440a != null) {
            try {
                new File(this.f1440a).createNewFile();
            } catch (IOException e) {
            }
        }
    }

    public boolean m1874b() {
        return this.f1440a != null ? new File(this.f1440a).exists() : false;
    }
}
