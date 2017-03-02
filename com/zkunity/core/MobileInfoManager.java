package com.zkunity.core;

import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Build.VERSION;
import com.android.volley.VolleyError;
import com.igexin.download.Downloads;
import com.igexin.sdk.PushConsts;
import com.tencent.connect.common.Constants;
import com.zkunity.app.AppManager;
import com.zkunity.config.MConfig;
import com.zkunity.info.MobileInfoUtil;
import com.zkunity.model.MJSONObject;
import com.zkunity.network.SyncNetworkCall;
import com.zkunity.network.SyncNetworkUtils;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MobileInfoManager {
    private static MobileInfoManager instance;

    private class MobileInfoListener implements SyncNetworkCall {
        private MobileInfoListener() {
        }

        public void onSuccess(int statusCode, String rs) {
            MJSONObject mObj = new MJSONObject();
            mObj.invokeData(rs);
            if (mObj.getInt("rs") == PushConsts.SETTAG_ERROR_COUNT) {
                Editor editor = AppManager.getManager().getAppActivity().getSharedPreferences("mbinfo", 0).edit();
                editor.putString("mi", mObj.getString("mi"));
                editor.commit();
            } else if (mObj.getInt("rs") == -11004) {
                MobileInfoManager.this.pushMobileInfos();
            }
        }

        public void onFailure(int statusCode, VolleyError error) {
        }
    }

    static {
        instance = new MobileInfoManager();
    }

    private MobileInfoManager() {
    }

    public static MobileInfoManager getManager() {
        return instance;
    }

    public void pushMobileInfo() {
        String mi = AppManager.getManager().getAppActivity().getSharedPreferences("mbinfo", 0).getString("mi", null);
        if (mi == null) {
            pushMobileInfos();
            return;
        }
        MJSONObject mObj = new MJSONObject();
        mObj.createNewFromNull();
        mObj.putString(Downloads.COLUMN_URI, "loginInfos");
        mObj.putString("uid", SDKManager.getManager().getUid());
        mObj.putString("mi", mi);
        mObj.putString("deviceId", MobileInfoUtil.getDeviceId());
        SyncNetworkUtils.postByHttp(new StringBuilder(String.valueOf(MConfig.getString("baseUrl"))).append("plat").toString(), mObj.toString(), new MobileInfoListener());
    }

    public void pushMobileInfos() {
        MJSONObject mObj = new MJSONObject();
        mObj.createNewFromNull();
        mObj.putString(Downloads.COLUMN_URI, "loginInfos");
        mObj.putString("uid", SDKManager.getManager().getUid());
        mObj.putString("mi", "n");
        mObj.putString("miBrands", Build.MANUFACTURER);
        mObj.putString("miModel", Build.MODEL);
        mObj.putString("miCpu", getCpuName());
        mObj.putString("miMemory", getTotalMemory());
        mObj.putString("miOs", "Android");
        mObj.putString("miOsVersion", VERSION.RELEASE);
        mObj.putString("deviceId", MobileInfoUtil.getDeviceId());
        SyncNetworkUtils.postByHttp(new StringBuilder(String.valueOf(MConfig.getString("baseUrl"))).append("plat").toString(), mObj.toString(), new MobileInfoListener());
    }

    private String getCpuName() {
        try {
            String[] array = new BufferedReader(new FileReader("/proc/cpuinfo")).readLine().split(":\\s+", 2);
            for (int i = 0; i < array.length; i++) {
            }
            return array[1];
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return Constants.STR_EMPTY;
        } catch (IOException e2) {
            e2.printStackTrace();
            return Constants.STR_EMPTY;
        }
    }

    private String getTotalMemory() {
        BufferedReader br;
        FileNotFoundException e;
        IOException e2;
        Throwable th;
        FileReader fr = null;
        BufferedReader br2 = null;
        try {
            FileReader fr2 = new FileReader("/proc/meminfo");
            try {
                br = new BufferedReader(fr2, 8);
            } catch (FileNotFoundException e3) {
                e = e3;
                fr = fr2;
                try {
                    e.printStackTrace();
                    try {
                        fr.close();
                        br2.close();
                    } catch (IOException e22) {
                        e22.printStackTrace();
                    }
                    return Constants.STR_EMPTY;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        fr.close();
                        br2.close();
                    } catch (IOException e222) {
                        e222.printStackTrace();
                    }
                    throw th;
                }
            } catch (IOException e4) {
                e222 = e4;
                fr = fr2;
                e222.printStackTrace();
                try {
                    fr.close();
                    br2.close();
                } catch (IOException e2222) {
                    e2222.printStackTrace();
                }
                return Constants.STR_EMPTY;
            } catch (Throwable th3) {
                th = th3;
                fr = fr2;
                fr.close();
                br2.close();
                throw th;
            }
            try {
                String str = br.readLine().split("\\s+")[1];
                try {
                    fr2.close();
                    br.close();
                } catch (IOException e22222) {
                    e22222.printStackTrace();
                }
                br2 = br;
                fr = fr2;
                return str;
            } catch (FileNotFoundException e5) {
                e = e5;
                br2 = br;
                fr = fr2;
                e.printStackTrace();
                fr.close();
                br2.close();
                return Constants.STR_EMPTY;
            } catch (IOException e6) {
                e22222 = e6;
                br2 = br;
                fr = fr2;
                e22222.printStackTrace();
                fr.close();
                br2.close();
                return Constants.STR_EMPTY;
            } catch (Throwable th4) {
                th = th4;
                br2 = br;
                fr = fr2;
                fr.close();
                br2.close();
                throw th;
            }
        } catch (FileNotFoundException e7) {
            e = e7;
            e.printStackTrace();
            fr.close();
            br2.close();
            return Constants.STR_EMPTY;
        } catch (IOException e8) {
            e22222 = e8;
            e22222.printStackTrace();
            fr.close();
            br2.close();
            return Constants.STR_EMPTY;
        }
    }
}
