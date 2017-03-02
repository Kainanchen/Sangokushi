package com.zkunity.info;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.zkunity.app.AppManager;
import java.util.UUID;

public class MobileInfoUtil {
    private static String deviceId1;

    static {
        deviceId1 = null;
    }

    public static String getDeviceId() {
        if (deviceId1 == null) {
            SharedPreferences sp = AppManager.getManager().getAppActivity().getSharedPreferences("DeviceId", 0);
            deviceId1 = sp.getString("DeviceId", null);
            if (deviceId1 == null) {
                deviceId1 = calcDeviceId();
                Editor editor = sp.edit();
                editor.putString("DeviceId", deviceId1);
                editor.commit();
            }
        }
        return deviceId1;
    }

    public static String calcDeviceId() {
        return "Android_" + UUID.randomUUID().toString();
    }
}
