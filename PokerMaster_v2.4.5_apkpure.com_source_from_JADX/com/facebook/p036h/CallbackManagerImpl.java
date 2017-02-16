package com.facebook.p036h;

import android.content.Intent;
import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.h.f */
public final class CallbackManagerImpl implements CallbackManager {
    private static Map<Integer, CallbackManagerImpl> f1647a;
    private Map<Integer, CallbackManagerImpl> f1648b;

    /* renamed from: com.facebook.h.f.a */
    public interface CallbackManagerImpl {
        boolean m1609a(int i, Intent intent);
    }

    /* renamed from: com.facebook.h.f.b */
    public enum CallbackManagerImpl {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8);
        
        private final int f1646j;

        private CallbackManagerImpl(int i) {
            this.f1646j = i;
        }

        public final int m1610a() {
            return FacebookSdk.m2595o() + this.f1646j;
        }
    }

    public CallbackManagerImpl() {
        this.f1648b = new HashMap();
    }

    static {
        f1647a = new HashMap();
    }

    public static synchronized void m1612a(int i, CallbackManagerImpl callbackManagerImpl) {
        synchronized (CallbackManagerImpl.class) {
            ag.m1544a((Object) callbackManagerImpl, "callback");
            if (!f1647a.containsKey(Integer.valueOf(i))) {
                f1647a.put(Integer.valueOf(i), callbackManagerImpl);
            }
        }
    }

    private static synchronized CallbackManagerImpl m1611a(Integer num) {
        CallbackManagerImpl callbackManagerImpl;
        synchronized (CallbackManagerImpl.class) {
            callbackManagerImpl = (CallbackManagerImpl) f1647a.get(num);
        }
        return callbackManagerImpl;
    }

    public final void m1614b(int i, CallbackManagerImpl callbackManagerImpl) {
        ag.m1544a((Object) callbackManagerImpl, "callback");
        this.f1648b.put(Integer.valueOf(i), callbackManagerImpl);
    }

    public final boolean m1613a(int i, int i2, Intent intent) {
        CallbackManagerImpl callbackManagerImpl = (CallbackManagerImpl) this.f1648b.get(Integer.valueOf(i));
        if (callbackManagerImpl != null) {
            return callbackManagerImpl.m1609a(i2, intent);
        }
        callbackManagerImpl = CallbackManagerImpl.m1611a(Integer.valueOf(i));
        if (callbackManagerImpl != null) {
            return callbackManagerImpl.m1609a(i2, intent);
        }
        return false;
    }
}
