package com.igexin.sdk.p053a;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* renamed from: com.igexin.sdk.a.c */
public class C0518c {
    private String f1441a;

    public C0518c(Context context) {
        if (context != null) {
            context.getFilesDir();
            this.f1441a = "/data/data/" + context.getPackageName() + "/files/" + "push.pid";
        }
    }

    public void m1875a() {
        if (!m1877c() && this.f1441a != null) {
            try {
                new File(this.f1441a).createNewFile();
            } catch (IOException e) {
            }
        }
    }

    public void m1876b() {
        if (m1877c() && this.f1441a != null) {
            new File(this.f1441a).delete();
        }
    }

    public boolean m1877c() {
        return this.f1441a != null ? new File(this.f1441a).exists() : false;
    }
}
