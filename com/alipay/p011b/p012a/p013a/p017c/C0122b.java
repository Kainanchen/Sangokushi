package com.alipay.p011b.p012a.p013a.p017c;

import android.content.Context;
import com.alipay.android.phone.mrpc.core.C0066w;
import com.alipay.android.phone.mrpc.core.C0067h;
import com.alipay.android.phone.mrpc.core.aa;
import com.alipay.p011b.p012a.p013a.p014a.C0110a;
import com.alipay.tscenter.biz.rpc.deviceFp.BugTrackMessageService;
import com.alipay.tscenter.biz.rpc.vkeydfp.DeviceDataReportService;
import com.alipay.tscenter.biz.rpc.vkeydfp.request.DeviceDataReportRequest;
import com.alipay.tscenter.biz.rpc.vkeydfp.result.DeviceDataReportResult;
import org.json.JSONObject;

/* renamed from: com.alipay.b.a.a.c.b */
public final class C0122b implements C0119a {
    private static C0122b f169d;
    private static DeviceDataReportResult f170e;
    private C0066w f171a;
    private BugTrackMessageService f172b;
    private DeviceDataReportService f173c;

    static {
        f169d = null;
    }

    private C0122b(Context context, String str) {
        this.f171a = null;
        this.f172b = null;
        this.f173c = null;
        aa aaVar = new aa();
        aaVar.m47a(str);
        this.f171a = new C0067h(context);
        this.f172b = (BugTrackMessageService) this.f171a.m68a(BugTrackMessageService.class, aaVar);
        this.f173c = (DeviceDataReportService) this.f171a.m68a(DeviceDataReportService.class, aaVar);
    }

    public static synchronized C0122b m333a(Context context, String str) {
        C0122b c0122b;
        synchronized (C0122b.class) {
            if (f169d == null) {
                f169d = new C0122b(context, str);
            }
            c0122b = f169d;
        }
        return c0122b;
    }

    public final DeviceDataReportResult m337a(DeviceDataReportRequest deviceDataReportRequest) {
        if (this.f173c != null) {
            f170e = null;
            new Thread(new C0123c(this, deviceDataReportRequest)).start();
            int i = 300000;
            while (f170e == null && i >= 0) {
                Thread.sleep(50);
                i -= 50;
            }
        }
        return f170e;
    }

    public final boolean m338a(String str) {
        if (C0110a.m234a(str)) {
            return false;
        }
        boolean booleanValue;
        if (this.f172b != null) {
            String str2 = null;
            try {
                str2 = this.f172b.logCollect(C0110a.m240e(str));
            } catch (Exception e) {
            }
            if (!C0110a.m234a(str2)) {
                booleanValue = ((Boolean) new JSONObject(str2).get("success")).booleanValue();
                return booleanValue;
            }
        }
        booleanValue = false;
        return booleanValue;
    }
}
