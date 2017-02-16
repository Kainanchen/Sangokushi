package com.facebook.p032e.p033a;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdManager.RegistrationListener;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import android.os.Build.VERSION;
import com.facebook.FacebookSdk;
import com.facebook.p036h.FetchedAppSettingsManager;
import com.facebook.p036h.ad;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.e.a.a */
public final class DeviceRequestsHelper {
    private static HashMap<String, RegistrationListener> f1505a;

    /* renamed from: com.facebook.e.a.a.1 */
    static class DeviceRequestsHelper implements RegistrationListener {
        final /* synthetic */ String f1503a;
        final /* synthetic */ String f1504b;

        DeviceRequestsHelper(String str, String str2) {
            this.f1503a = str;
            this.f1504b = str2;
        }

        public final void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
            if (!this.f1503a.equals(nsdServiceInfo.getServiceName())) {
                DeviceRequestsHelper.m1444b(this.f1504b);
            }
        }

        public final void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
        }

        public final void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
            DeviceRequestsHelper.m1444b(this.f1504b);
        }

        public final void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        }
    }

    static {
        f1505a = new HashMap();
    }

    public static String m1442a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", Build.DEVICE);
            jSONObject.put("model", Build.MODEL);
        } catch (JSONException e) {
        }
        return jSONObject.toString();
    }

    public static boolean m1443a(String str) {
        if (!DeviceRequestsHelper.m1445b()) {
            return false;
        }
        if (f1505a.containsKey(str)) {
            return true;
        }
        String replace = FacebookSdk.m2588h().replace('.', '|');
        r4 = new Object[3];
        r4[1] = String.format("%s-%s", new Object[]{"android", replace});
        r4[2] = str;
        replace = String.format("%s_%s_%s", r4);
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setServiceType("_fb._tcp.");
        nsdServiceInfo.setServiceName(replace);
        nsdServiceInfo.setPort(80);
        NsdManager nsdManager = (NsdManager) FacebookSdk.m2586f().getSystemService("servicediscovery");
        RegistrationListener deviceRequestsHelper = new DeviceRequestsHelper(replace, str);
        f1505a.put(str, deviceRequestsHelper);
        nsdManager.registerService(nsdServiceInfo, 1, deviceRequestsHelper);
        return true;
    }

    public static boolean m1445b() {
        return VERSION.SDK_INT >= 16 && FetchedAppSettingsManager.m1645a(FacebookSdk.m2590j()).f1677d.contains(ad.Enabled);
    }

    public static void m1444b(String str) {
        RegistrationListener registrationListener = (RegistrationListener) f1505a.get(str);
        if (registrationListener != null) {
            ((NsdManager) FacebookSdk.m2586f().getSystemService("servicediscovery")).unregisterService(registrationListener);
            f1505a.remove(str);
        }
    }
}
