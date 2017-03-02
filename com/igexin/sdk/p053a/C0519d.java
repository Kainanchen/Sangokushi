package com.igexin.sdk.p053a;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* renamed from: com.igexin.sdk.a.d */
public class C0519d {
    private String f1442a;
    private String f1443b;
    private Context f1444c;

    public C0519d(Context context) {
        if (context != null) {
            this.f1444c = context;
            context.getFilesDir();
            this.f1442a = "/data/data/" + context.getPackageName() + "/files/" + "run.pid";
            this.f1443b = "/data/data/" + context.getPackageName() + "/files/" + "stop.lock";
        }
    }

    public void m1878a() {
        if (!m1880c() && this.f1442a != null) {
            try {
                new File(this.f1442a).createNewFile();
            } catch (IOException e) {
            }
        }
    }

    public void m1879b() {
        if (m1880c() && this.f1442a != null) {
            new File(this.f1442a).delete();
        }
    }

    public boolean m1880c() {
        File file = null;
        File file2 = this.f1442a != null ? new File(this.f1442a) : null;
        if (this.f1443b != null) {
            file = new File(this.f1443b);
        }
        if (file2 != null && file2.exists()) {
            if (file != null && file.exists()) {
                file.delete();
            }
            return true;
        } else if (file == null || !file.exists() || !file.renameTo(new File(this.f1442a))) {
            return false;
        } else {
            new C0518c(this.f1444c).m1875a();
            return true;
        }
    }
}
