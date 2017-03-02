package com.tencent.open;

import android.net.Uri;
import android.webkit.WebView;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.tencent.wxop.stat.StatAccount;
import com.tencent.wxop.stat.common.StatConstants;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.tencent.open.a */
public class ProGuard {
    protected HashMap<String, ProGuard> f1651a;

    /* renamed from: com.tencent.open.a.b */
    public static class ProGuard {
        public void call(String str, List<String> list, ProGuard proGuard) {
            Method method = null;
            for (Method method2 : getClass().getDeclaredMethods()) {
                if (method2.getName().equals(str) && method2.getParameterTypes().length == list.size()) {
                    method = method2;
                    break;
                }
            }
            if (method != null) {
                try {
                    Object invoke;
                    switch (list.size()) {
                        case StatAccount.DEFAULT_TYPE /*0*/:
                            invoke = method.invoke(this, new Object[0]);
                            break;
                        case StatConstants.XG_PRO_VERSION /*1*/:
                            invoke = method.invoke(this, new Object[]{list.get(0)});
                            break;
                        case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                            invoke = method.invoke(this, new Object[]{list.get(0), list.get(1)});
                            break;
                        case StatConstants.STAT_DB_VERSION /*3*/:
                            invoke = method.invoke(this, new Object[]{list.get(0), list.get(1), list.get(2)});
                            break;
                        case StatAccount.WECHAT_OPENID_TYPE /*4*/:
                            invoke = method.invoke(this, new Object[]{list.get(0), list.get(1), list.get(2), list.get(3)});
                            break;
                        case StatAccount.PHONE_NUM_TYPE /*5*/:
                            invoke = method.invoke(this, new Object[]{list.get(0), list.get(1), list.get(2), list.get(3), list.get(4)});
                            break;
                        default:
                            invoke = method.invoke(this, new Object[]{list.get(0), list.get(1), list.get(2), list.get(3), list.get(4), list.get(5)});
                            break;
                    }
                    Class returnType = method.getReturnType();
                    com.tencent.open.p067a.ProGuard.m2117b("openSDK_LOG.JsBridge", "-->call, result: " + invoke + " | ReturnType: " + returnType.getName());
                    if ("void".equals(returnType.getName()) || returnType == Void.class) {
                        if (proGuard != null) {
                            proGuard.m2064a(null);
                        }
                    } else if (proGuard != null && customCallback()) {
                        proGuard.m2065a(invoke != null ? invoke.toString() : null);
                    }
                } catch (Throwable e) {
                    com.tencent.open.p067a.ProGuard.m2118b("openSDK_LOG.JsBridge", "-->handler call mehtod ex. targetMethod: " + method, e);
                    if (proGuard != null) {
                        proGuard.m2063a();
                    }
                }
            } else if (proGuard != null) {
                proGuard.m2063a();
            }
        }

        public boolean customCallback() {
            return false;
        }
    }

    /* renamed from: com.tencent.open.a.a */
    public static class ProGuard {
        protected WeakReference<WebView> f1599a;
        protected long f1600b;
        protected String f1601c;

        public ProGuard(WebView webView, long j, String str) {
            this.f1599a = new WeakReference(webView);
            this.f1600b = j;
            this.f1601c = str;
        }

        public void m2064a(Object obj) {
            WebView webView = (WebView) this.f1599a.get();
            if (webView != null) {
                String str = "'undefined'";
                if (obj instanceof String) {
                    str = "'" + ((String) obj).replace("\\", "\\\\").replace("'", "\\'") + "'";
                } else if ((obj instanceof Number) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Double) || (obj instanceof Float)) {
                    str = obj.toString();
                } else if (obj instanceof Boolean) {
                    str = obj.toString();
                }
                webView.loadUrl("javascript:window.JsBridge&&JsBridge.callback(" + this.f1600b + ",{'r':0,'result':" + str + "});");
            }
        }

        public void m2063a() {
            WebView webView = (WebView) this.f1599a.get();
            if (webView != null) {
                webView.loadUrl("javascript:window.JsBridge&&JsBridge.callback(" + this.f1600b + ",{'r':1,'result':'no such method'})");
            }
        }

        public void m2065a(String str) {
            WebView webView = (WebView) this.f1599a.get();
            if (webView != null) {
                webView.loadUrl("javascript:" + str);
            }
        }
    }

    public ProGuard() {
        this.f1651a = new HashMap();
    }

    public void m2131a(ProGuard proGuard, String str) {
        this.f1651a.put(str, proGuard);
    }

    public void m2132a(String str, String str2, List<String> list, ProGuard proGuard) {
        com.tencent.open.p067a.ProGuard.m2114a("openSDK_LOG.JsBridge", "getResult---objName = " + str + " methodName = " + str2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                list.set(i, URLDecoder.decode((String) list.get(i), AsyncHttpResponseHandler.DEFAULT_CHARSET));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        ProGuard proGuard2 = (ProGuard) this.f1651a.get(str);
        if (proGuard2 != null) {
            com.tencent.open.p067a.ProGuard.m2117b("openSDK_LOG.JsBridge", "call----");
            proGuard2.call(str2, list, proGuard);
            return;
        }
        com.tencent.open.p067a.ProGuard.m2117b("openSDK_LOG.JsBridge", "not call----objName NOT FIND");
        if (proGuard != null) {
            proGuard.m2063a();
        }
    }

    public boolean m2133a(WebView webView, String str) {
        com.tencent.open.p067a.ProGuard.m2114a("openSDK_LOG.JsBridge", "-->canHandleUrl---url = " + str);
        if (str == null || !Uri.parse(str).getScheme().equals("jsbridge")) {
            return false;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList((str + "/#").split("/")));
        if (arrayList.size() < 6) {
            return false;
        }
        String str2 = (String) arrayList.get(2);
        String str3 = (String) arrayList.get(3);
        List subList = arrayList.subList(4, arrayList.size() - 1);
        ProGuard proGuard = new ProGuard(webView, 4, str);
        webView.getUrl();
        m2132a(str2, str3, subList, proGuard);
        return true;
    }
}
