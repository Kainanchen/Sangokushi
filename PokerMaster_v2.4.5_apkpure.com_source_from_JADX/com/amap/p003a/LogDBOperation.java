package com.amap.p003a;

import android.content.Context;
import java.util.List;

/* renamed from: com.amap.a.l */
public final class LogDBOperation {
    DBOperation f687a;

    public LogDBOperation(Context context) {
        try {
            this.f687a = new DBOperation(context, DBOperation.m675a(LogDBCreator.class));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final List<? extends LogInfo> m700a(int i, Class<? extends LogInfo> cls) {
        List<? extends LogInfo> list = null;
        try {
            list = this.f687a.m681a(LogInfo.m691c(i), (Class) cls, false);
        } catch (Throwable th) {
            cm.m637a(th, "LogDB", "ByState");
        }
        return list;
    }

    final void m701a(String str, Class<? extends LogInfo> cls) {
        this.f687a.m684a(LogInfo.m690b(str), (Class) cls);
    }
}
