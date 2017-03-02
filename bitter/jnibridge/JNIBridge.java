package bitter.jnibridge;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JNIBridge {

    /* renamed from: bitter.jnibridge.JNIBridge.a */
    private static class C0033a implements InvocationHandler {
        private Object f1a;
        private long f2b;

        public C0033a(long j) {
            this.f1a = new Object[0];
            this.f2b = j;
        }

        public final void m0a() {
            synchronized (this.f1a) {
                this.f2b = 0;
            }
        }

        public final void finalize() {
            synchronized (this.f1a) {
                if (this.f2b == 0) {
                    return;
                }
                JNIBridge.delete(this.f2b);
            }
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            synchronized (this.f1a) {
                if (this.f2b == 0) {
                    obj2 = null;
                } else {
                    obj2 = JNIBridge.invoke(this.f2b, method.getDeclaringClass(), method, objArr);
                }
            }
            return obj2;
        }
    }

    static native void delete(long j);

    static void disableInterfaceProxy(Object obj) {
        ((C0033a) Proxy.getInvocationHandler(obj)).m0a();
    }

    static native Object invoke(long j, Class cls, Method method, Object[] objArr);

    static Object newInterfaceProxy(long j, Class[] clsArr) {
        return Proxy.newProxyInstance(JNIBridge.class.getClassLoader(), clsArr, new C0033a(j));
    }
}
