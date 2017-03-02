package com.tencent.wxop.stat;

import org.apache.http.HttpResponse;
import org.apache.http.impl.client.DefaultConnectionKeepAliveStrategy;
import org.apache.http.protocol.HttpContext;

/* renamed from: com.tencent.wxop.stat.j */
class C0652j extends DefaultConnectionKeepAliveStrategy {
    final /* synthetic */ C0651i f2086a;

    C0652j(C0651i c0651i) {
        this.f2086a = c0651i;
    }

    public long getKeepAliveDuration(HttpResponse httpResponse, HttpContext httpContext) {
        long keepAliveDuration = super.getKeepAliveDuration(httpResponse, httpContext);
        return keepAliveDuration == -1 ? 30000 : keepAliveDuration;
    }
}
