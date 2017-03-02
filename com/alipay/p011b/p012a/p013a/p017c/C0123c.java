package com.alipay.p011b.p012a.p013a.p017c;

import com.alipay.p011b.p012a.p013a.p014a.C0110a;
import com.alipay.tscenter.biz.rpc.vkeydfp.request.DeviceDataReportRequest;
import com.alipay.tscenter.biz.rpc.vkeydfp.result.DeviceDataReportResult;

/* renamed from: com.alipay.b.a.a.c.c */
final class C0123c implements Runnable {
    final /* synthetic */ DeviceDataReportRequest f174a;
    final /* synthetic */ C0122b f175b;

    C0123c(C0122b c0122b, DeviceDataReportRequest deviceDataReportRequest) {
        this.f175b = c0122b;
        this.f174a = deviceDataReportRequest;
    }

    public final void run() {
        try {
            C0122b.f170e = this.f175b.f173c.reportStaticData(this.f174a);
        } catch (Throwable th) {
            C0122b.f170e = new DeviceDataReportResult();
            C0122b.f170e.success = false;
            C0122b.f170e.resultCode = "static data rpc upload error, " + C0110a.m232a(th);
            C0110a.m232a(th);
        }
    }
}
