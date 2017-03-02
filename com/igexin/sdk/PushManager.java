package com.igexin.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.alipay.sdk.data.C0168a;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.p022a.p031b.C0259a;
import com.igexin.sdk.p053a.C0518c;
import com.tencent.connect.common.Constants;
import com.tencent.tauth.AuthActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PushManager {
    private static PushManager f1420a;
    private long f1421b;
    private long f1422c;
    private long f1423d;
    private byte[] f1424e;
    private String f1425f;

    public PushManager() {
        this.f1421b = 0;
        this.f1422c = 0;
        this.f1423d = 0;
        this.f1424e = null;
    }

    private Intent m1858a() {
        Intent intent = new Intent(PushConsts.ACTION_BROADCAST_PUSHMANAGER);
        intent.putExtra("verifyCode", this.f1425f);
        return intent;
    }

    private String m1859a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer(Constants.STR_EMPTY);
            for (int i : digest) {
                int i2;
                if (i2 < 0) {
                    i2 += AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                }
                if (i2 < 16) {
                    stringBuffer.append(Constants.VIA_RESULT_SUCCESS);
                }
                stringBuffer.append(Integer.toHexString(i2));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    private byte[] m1860a(Context context) {
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        byte[] bArr = null;
        String str = "/data/data/" + context.getPackageName() + "/files/" + "init.pid";
        if (new File(str).exists()) {
            byte[] bArr2 = new byte[AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT];
            try {
                fileInputStream = new FileInputStream(str);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        try {
                            int read = fileInputStream.read(bArr2);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr2, 0, read);
                        } catch (Exception e) {
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    bArr = byteArrayOutputStream.toByteArray();
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception e2) {
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception e3) {
                        }
                    }
                } catch (Exception e4) {
                    byteArrayOutputStream = bArr;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception e5) {
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception e6) {
                        }
                    }
                    return bArr;
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    byteArrayOutputStream = bArr;
                    th = th4;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception e7) {
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception e8) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e9) {
                byteArrayOutputStream = bArr;
                fileInputStream = bArr;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                return bArr;
            } catch (Throwable th32) {
                fileInputStream = bArr;
                byte[] bArr3 = bArr;
                th = th32;
                byteArrayOutputStream = bArr3;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                throw th;
            }
        }
        return bArr;
    }

    public static PushManager getInstance() {
        if (f1420a == null) {
            f1420a = new PushManager();
        }
        return f1420a;
    }

    public boolean bindAlias(Context context, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f1423d <= 5000) {
            return false;
        }
        this.f1423d = currentTimeMillis;
        Intent a = m1858a();
        a.putExtra(AuthActivity.ACTION_KEY, "bindAlias");
        a.putExtra("alias", str);
        C0247a.m838b("-> call bindAlias...");
        context.sendBroadcast(a);
        return true;
    }

    public String getClientid(Context context) {
        if (this.f1424e != null) {
            byte[] a = m1860a(context);
            if (!(this.f1424e == null || a == null || this.f1424e.length != a.length)) {
                byte[] bArr = new byte[a.length];
                for (int i = 0; i < bArr.length; i++) {
                    bArr[i] = (byte) (this.f1424e[i] ^ a[i]);
                }
                return new String(bArr);
            }
        }
        return null;
    }

    public String getVerifyCode() {
        return this.f1425f;
    }

    public String getVersion(Context context) {
        return PushBuildConfig.sdk_conf_version;
    }

    public void initialize(Context context) {
        try {
            String packageName = context.getApplicationContext().getPackageName();
            Intent intent = new Intent(context.getApplicationContext(), PushService.class);
            intent.putExtra(AuthActivity.ACTION_KEY, PushConsts.ACTION_SERVICE_INITIALIZE);
            intent.putExtra("op_app", packageName);
            context.getApplicationContext().startService(intent);
            this.f1425f = C0259a.m877a(packageName + System.currentTimeMillis());
            if (this.f1425f == null) {
                this.f1425f = String.valueOf(System.currentTimeMillis());
            }
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                String string = applicationInfo.metaData.getString("PUSH_APPID");
                String string2 = applicationInfo.metaData.getString("PUSH_APPSECRET");
                packageName = applicationInfo.metaData.get("PUSH_APPKEY") != null ? applicationInfo.metaData.get("PUSH_APPKEY").toString() : null;
                if (string != null) {
                    string = string.trim();
                }
                if (string2 != null) {
                    string2 = string2.trim();
                }
                if (packageName != null) {
                    packageName = packageName.trim();
                }
                if (!string.equals(Constants.STR_EMPTY) && !string2.equals(Constants.STR_EMPTY) && !packageName.equals(Constants.STR_EMPTY)) {
                    this.f1424e = m1859a(string + string2 + packageName + context.getPackageName()).getBytes();
                }
            }
        } catch (Exception e) {
        }
    }

    public boolean isPushTurnedOn(Context context) {
        return new C0518c(context).m1877c();
    }

    public boolean sendFeedbackMessage(Context context, String str, String str2, int i) {
        if (str == null || str2 == null || i < PushConsts.MIN_FEEDBACK_ACTION || i > PushConsts.MAX_FEEDBACK_ACTION) {
            return false;
        }
        Intent a = m1858a();
        a.putExtra(AuthActivity.ACTION_KEY, "sendFeedbackMessage");
        a.putExtra("taskid", str);
        a.putExtra("messageid", str2);
        a.putExtra("actionid", String.valueOf(i));
        context.sendBroadcast(a);
        return true;
    }

    public boolean sendMessage(Context context, String str, byte[] bArr) {
        long currentTimeMillis = System.currentTimeMillis();
        if (str == null || bArr == null || ((long) bArr.length) > 4096 || currentTimeMillis - this.f1422c < 1000) {
            return false;
        }
        Intent a = m1858a();
        a.putExtra(AuthActivity.ACTION_KEY, "sendMessage");
        a.putExtra("taskid", str);
        a.putExtra("extraData", bArr);
        context.sendBroadcast(a);
        return true;
    }

    public boolean setHeartbeatInterval(Context context, int i) {
        if (i < 0) {
            return false;
        }
        Intent a = m1858a();
        a.putExtra(AuthActivity.ACTION_KEY, "setHeartbeatInterval");
        a.putExtra("interval", i);
        context.sendBroadcast(a);
        return true;
    }

    public boolean setSilentTime(Context context, int i, int i2) {
        if (i < 0 || i >= 24 || i2 < 0 || i2 > 23) {
            return false;
        }
        Intent a = m1858a();
        a.putExtra(AuthActivity.ACTION_KEY, "setSilentTime");
        a.putExtra("beginHour", i);
        a.putExtra("duration", i2);
        context.sendBroadcast(a);
        return true;
    }

    public boolean setSocketTimeout(Context context, int i) {
        if (i < 0) {
            return false;
        }
        Intent a = m1858a();
        a.putExtra(AuthActivity.ACTION_KEY, "setSocketTimeout");
        a.putExtra(C0168a.f379f, i);
        context.sendBroadcast(a);
        return true;
    }

    public int setTag(Context context, Tag[] tagArr) {
        if (tagArr == null) {
            return PushConsts.SETTAG_ERROR_NULL;
        }
        if (((long) tagArr.length) > 200) {
            return PushConsts.SETTAG_ERROR_COUNT;
        }
        if (this.f1421b > System.currentTimeMillis() - 1000) {
            return PushConsts.SETTAG_ERROR_FREQUENCY;
        }
        Intent a = m1858a();
        a.putExtra(AuthActivity.ACTION_KEY, "setTag");
        StringBuilder stringBuilder = new StringBuilder();
        for (Tag tag : tagArr) {
            if (!(tag == null || tag.getName() == null)) {
                stringBuilder.append(tag.getName());
                stringBuilder.append(",");
            }
        }
        if (stringBuilder.length() <= 0) {
            return PushConsts.SETTAG_ERROR_NULL;
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        a.putExtra("tags", stringBuilder.toString());
        context.sendBroadcast(a);
        this.f1421b = System.currentTimeMillis();
        return 0;
    }

    public void stopService(Context context) {
        Intent a = m1858a();
        a.putExtra(AuthActivity.ACTION_KEY, "stopService");
        context.sendBroadcast(a);
    }

    public void turnOffPush(Context context) {
        Intent a = m1858a();
        a.putExtra(AuthActivity.ACTION_KEY, "turnOffPush");
        context.sendBroadcast(a);
    }

    public void turnOnPush(Context context) {
        String packageName = context.getApplicationContext().getPackageName();
        try {
            Intent intent = new Intent(context.getApplicationContext(), PushService.class);
            intent.putExtra(AuthActivity.ACTION_KEY, PushConsts.ACTION_SERVICE_INITIALIZE_SLAVE);
            intent.putExtra("op_app", packageName);
            intent.putExtra("isSlave", true);
            context.getApplicationContext().startService(intent);
        } catch (Exception e) {
        }
    }

    public boolean unBindAlias(Context context, String str, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f1423d <= 5000) {
            return false;
        }
        this.f1423d = currentTimeMillis;
        Intent a = m1858a();
        a.putExtra(AuthActivity.ACTION_KEY, "unbindAlias");
        a.putExtra("alias", str);
        a.putExtra("isSeft", z);
        C0247a.m838b("-> call unbindAlias...");
        context.sendBroadcast(a);
        return true;
    }
}
