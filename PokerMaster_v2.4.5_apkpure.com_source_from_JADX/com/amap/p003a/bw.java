package com.amap.p003a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amap.api.fence.Fence;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

/* compiled from: FenceManager */
/* renamed from: com.amap.a.bw */
public final class bw {
    Context f517a;
    Hashtable<PendingIntent, ArrayList<Fence>> f518b;

    public bw(Context context) {
        this.f518b = new Hashtable();
        this.f517a = context;
    }

    static boolean m505a(Fence fence) {
        return fence.m758b() != -1 && fence.m758b() <= bu.m477b();
    }

    final void m506a(PendingIntent pendingIntent, Fence fence, int i) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("fenceid", fence.f734b);
        bundle.putInt(NotificationCompatApi24.CATEGORY_EVENT, i);
        intent.putExtras(bundle);
        try {
            pendingIntent.send(this.f517a, 0, intent);
        } catch (Throwable th) {
            bc.m330a(th, "FenceManager", "fcIntent");
        }
    }

    final boolean m507a(PendingIntent pendingIntent, List<String> list) {
        boolean z = false;
        if (!(this.f518b.isEmpty() || list.isEmpty() || !this.f518b.containsKey(pendingIntent))) {
            Iterator it = ((ArrayList) this.f518b.get(pendingIntent)).iterator();
            while (it != null && it.hasNext()) {
                boolean z2;
                Fence fence = (Fence) it.next();
                if (list.contains(fence.f734b) || bw.m505a(fence)) {
                    it.remove();
                    z2 = true;
                } else {
                    z2 = z;
                }
                z = z2;
            }
        }
        return z;
    }
}
