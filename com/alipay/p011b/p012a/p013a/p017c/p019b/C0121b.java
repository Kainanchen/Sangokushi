package com.alipay.p011b.p012a.p013a.p017c.p019b;

import android.content.Context;
import com.alipay.p011b.p012a.p013a.p014a.C0110a;
import com.alipay.p011b.p012a.p013a.p017c.C0119a;
import com.alipay.p011b.p012a.p013a.p017c.C0122b;
import com.alipay.p011b.p012a.p013a.p017c.p018a.C0117b;
import com.alipay.p011b.p012a.p013a.p017c.p018a.C0118c;
import com.alipay.tscenter.biz.rpc.vkeydfp.request.DeviceDataReportRequest;
import com.alipay.tscenter.biz.rpc.vkeydfp.result.DeviceDataReportResult;
import com.tencent.connect.common.Constants;

/* renamed from: com.alipay.b.a.a.c.b.b */
public final class C0121b implements C0120a {
    private static C0120a f167a;
    private static C0119a f168b;

    static {
        f167a = null;
        f168b = null;
    }

    public static C0120a m330a(Context context, String str) {
        C0119a c0119a = null;
        if (context == null) {
            return null;
        }
        if (f167a == null) {
            if (context != null) {
                c0119a = C0122b.m333a(context, str);
            }
            f168b = c0119a;
            f167a = new C0121b();
        }
        return f167a;
    }

    public final C0117b m331a(C0118c c0118c) {
        DeviceDataReportRequest deviceDataReportRequest = new DeviceDataReportRequest();
        deviceDataReportRequest.os = c0118c.m309a();
        deviceDataReportRequest.apdid = c0118c.m312b();
        deviceDataReportRequest.pubApdid = c0118c.m314c();
        deviceDataReportRequest.priApdid = c0118c.m316d();
        deviceDataReportRequest.token = c0118c.m318e();
        deviceDataReportRequest.umidToken = c0118c.m320f();
        deviceDataReportRequest.version = c0118c.m322g();
        deviceDataReportRequest.lastTime = c0118c.m324h();
        deviceDataReportRequest.dataMap = c0118c.m325i();
        DeviceDataReportResult a = f168b.m326a(deviceDataReportRequest);
        C0117b c0117b = new C0117b();
        if (a == null) {
            return null;
        }
        c0117b.a = a.success;
        c0117b.b = a.resultCode;
        c0117b.f150c = a.apdid;
        c0117b.f151d = a.token;
        c0117b.f152e = a.currentTime;
        c0117b.f153f = a.version;
        c0117b.f154g = a.vkeySwitch;
        c0117b.f156i = a.appListVer;
        String str = a.bugTrackSwitch;
        c0117b.f155h = Constants.VIA_RESULT_SUCCESS;
        c0117b.f157j = Constants.VIA_RESULT_SUCCESS;
        if (!C0110a.m237b(str) || str.length() <= 0) {
            return c0117b;
        }
        c0117b.f155h = str.charAt(0);
        return c0117b;
    }

    public final boolean m332a(String str) {
        return f168b.m327a(str);
    }
}
