package com.amap.p003a;

import android.content.Context;
import java.util.List;

/* renamed from: com.amap.a.o */
public final class UpdateLogDBOperation {
    private DBOperation f690a;
    private Context f691b;

    public UpdateLogDBOperation(Context context) {
        this.f691b = context;
        this.f690a = UpdateLogDBOperation.m704a(this.f691b);
    }

    private static DBOperation m704a(Context context) {
        try {
            return new DBOperation(context, DBOperation.m675a(LogDBCreator.class));
        } catch (Throwable th) {
            cm.m637a(th, "UpdateLogDB", "getDB");
            return null;
        }
    }

    public final UpdateLogInfo m705a() {
        try {
            if (this.f690a == null) {
                this.f690a = UpdateLogDBOperation.m704a(this.f691b);
            }
            List a = this.f690a.m681a("1=1", UpdateLogInfo.class, false);
            if (a.size() > 0) {
                return (UpdateLogInfo) a.get(0);
            }
        } catch (Throwable th) {
            cm.m637a(th, "UpdateLogDB", "getUpdateLog");
        }
        return null;
    }

    public final void m706a(UpdateLogInfo updateLogInfo) {
        if (updateLogInfo != null) {
            try {
                if (this.f690a == null) {
                    this.f690a = UpdateLogDBOperation.m704a(this.f691b);
                }
                String str = "1=1";
                if (this.f690a.m681a(str, UpdateLogInfo.class, false).size() == 0) {
                    this.f690a.m682a((Object) updateLogInfo);
                } else {
                    this.f690a.m685a(str, (Object) updateLogInfo, false);
                }
            } catch (Throwable th) {
                cm.m637a(th, "UpdateLogDB", "updateLog");
            }
        }
    }
}
