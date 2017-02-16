package com.tencent.p080b.p081a;

import org.apache.http.HttpResponse;
import org.apache.http.impl.client.DefaultConnectionKeepAliveStrategy;
import org.apache.http.protocol.HttpContext;

/* renamed from: com.tencent.b.a.aj */
final class aj extends DefaultConnectionKeepAliveStrategy {
    final /* synthetic */ ai f8010a;

    aj(ai aiVar) {
        this.f8010a = aiVar;
    }

    public final long getKeepAliveDuration(HttpResponse httpResponse, HttpContext httpContext) {
        long keepAliveDuration = super.getKeepAliveDuration(httpResponse, httpContext);
        return keepAliveDuration == -1 ? StatisticConfig.MIN_UPLOAD_INTERVAL : keepAliveDuration;
    }
}
