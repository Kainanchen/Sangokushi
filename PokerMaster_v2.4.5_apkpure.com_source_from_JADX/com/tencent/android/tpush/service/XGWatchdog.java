package com.tencent.android.tpush.service;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.v4.view.PointerIconCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.android.volley.DefaultRetryPolicy;
import com.jg.EType;
import com.jg.JgClassChecked;
import com.sina.weibo.sdk.component.ShareRequestParam;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.XGPush4Msdk;
import com.tencent.android.tpush.XGPushConfig;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.encrypt.ProGuard;
import com.tencent.android.tpush.service.cache.CacheManager;
import com.tencent.android.tpush.service.channel.security.TpnsSecurity;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@JgClassChecked(author = 1, fComment = "\u786e\u8ba4\u5df2\u8fdb\u884c\u5b89\u5168\u6821\u9a8c", lastDate = "20150316", reviewer = 3, vComment = {EType.SERVICESCHECK})
/* compiled from: ProGuard */
public class XGWatchdog {
    public static Integer CURRENT_WD_VERSION = null;
    private static final String LIB_FULL_NAME = "libxguardian.so";
    private static final String LIB_NAME = "xguardian";
    public static final String TAG = "xguardian";
    private static String WatchdogPath;
    private static int defaultWatchdogPort;
    private static Handler handler;
    private static volatile XGWatchdog instance;
    private static Random random;
    private static final String watchdogPortName;
    private Context context;
    volatile boolean isStarted;

    static {
        WatchdogPath = LetterIndexBar.SEARCH_ICON_LETTER;
        CURRENT_WD_VERSION = Integer.valueOf(2);
        random = new Random();
        handler = null;
        instance = null;
        defaultWatchdogPort = 55550;
        watchdogPortName = ProGuard.m4849a("com.tencent.tpnsWatchdogPort");
    }

    private XGWatchdog(Context context) {
        this.context = null;
        this.isStarted = false;
        try {
            this.context = context.getApplicationContext();
            ProGuard.m5375c(this.context);
            HandlerThread handlerThread = new HandlerThread("XGWatchdog.thread");
            handlerThread.start();
            handler = new Handler(handlerThread.getLooper());
        } catch (Throwable th) {
            com.tencent.android.tpush.p067a.ProGuard.m4716c(TAG, "init XGWatchdog error", th);
        }
    }

    public static XGWatchdog getInstance(Context context) {
        if (instance == null) {
            synchronized (XGWatchdog.class) {
                if (instance == null) {
                    instance = new XGWatchdog(context);
                }
            }
        }
        return instance;
    }

    public static int getRandomInt(int i) {
        return random.nextInt(i);
    }

    public static int getRandomPort() {
        return getRandomInt(PointerIconCompat.TYPE_DEFAULT) + 55000;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getWatchdogPort() {
        /*
        r5 = this;
        r1 = 0;
        r0 = r5.context;	 Catch:{ Throwable -> 0x000e }
        r0 = r0.getContentResolver();	 Catch:{ Throwable -> 0x000e }
        r2 = watchdogPortName;	 Catch:{ Throwable -> 0x000e }
        r0 = android.provider.Settings.System.getInt(r0, r2);	 Catch:{ Throwable -> 0x000e }
    L_0x000d:
        return r0;
    L_0x000e:
        r0 = move-exception;
        r0 = r0 instanceof android.provider.Settings.SettingNotFoundException;
        if (r0 == 0) goto L_0x005e;
    L_0x0013:
        r0 = r5.context;
        r2 = "tpush_watchdog_port";
        r0 = com.tencent.android.tpush.service.p077d.ProGuard.m5300a(r0, r2, r1);
        if (r0 > 0) goto L_0x000d;
    L_0x001d:
        r3 = r1;
    L_0x001e:
        r0 = 10;
        if (r3 >= r0) goto L_0x005e;
    L_0x0022:
        r2 = 0;
        r0 = getRandomPort();	 Catch:{ Throwable -> 0x0044, all -> 0x0056 }
        r1 = new java.net.ServerSocket;	 Catch:{ Throwable -> 0x0044, all -> 0x0056 }
        r1.<init>(r0);	 Catch:{ Throwable -> 0x0044, all -> 0x0056 }
        r2 = r5.context;	 Catch:{ Throwable -> 0x0067 }
        r2 = com.tencent.android.tpush.service.channel.p076c.ProGuard.m5255a(r2);	 Catch:{ Throwable -> 0x0067 }
        r4 = watchdogPortName;	 Catch:{ Throwable -> 0x0067 }
        r2.m5258a(r4, r0);	 Catch:{ Throwable -> 0x0067 }
        r2 = r5.context;	 Catch:{ Throwable -> 0x0067 }
        r4 = "tpush_watchdog_port";
        com.tencent.android.tpush.service.p077d.ProGuard.m5302b(r2, r4, r0);	 Catch:{ Throwable -> 0x0067 }
        r1.close();	 Catch:{ Exception -> 0x0042 }
        goto L_0x000d;
    L_0x0042:
        r1 = move-exception;
        goto L_0x000d;
    L_0x0044:
        r0 = move-exception;
        r1 = r2;
    L_0x0046:
        r2 = "xguardian";
        r4 = "create ServerSocket error";
        com.tencent.android.tpush.p067a.ProGuard.m4716c(r2, r4, r0);	 Catch:{ all -> 0x0065 }
        if (r1 == 0) goto L_0x0052;
    L_0x004f:
        r1.close();	 Catch:{ Exception -> 0x0061 }
    L_0x0052:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x001e;
    L_0x0056:
        r0 = move-exception;
        r1 = r2;
    L_0x0058:
        if (r1 == 0) goto L_0x005d;
    L_0x005a:
        r1.close();	 Catch:{ Exception -> 0x0063 }
    L_0x005d:
        throw r0;
    L_0x005e:
        r0 = defaultWatchdogPort;
        goto L_0x000d;
    L_0x0061:
        r0 = move-exception;
        goto L_0x0052;
    L_0x0063:
        r1 = move-exception;
        goto L_0x005d;
    L_0x0065:
        r0 = move-exception;
        goto L_0x0058;
    L_0x0067:
        r0 = move-exception;
        goto L_0x0046;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.android.tpush.service.XGWatchdog.getWatchdogPort():int");
    }

    public void sendHeartbeat2Watchdog(String str) {
        sendHeartbeat2Watchdog(str, null);
    }

    private String directSendContent(String str) {
        Socket socket;
        DataOutputStream dataOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        Throwable th2;
        String str2 = null;
        if (com.tencent.android.tpush.service.p071a.ProGuard.m4972a(ProGuard.m5376e()).f7532y == 0 || !com.tencent.android.tpush.common.ProGuard.m4840h(this.context)) {
            return null;
        }
        try {
            socket = new Socket("127.0.0.1", getWatchdogPort());
            try {
                socket.setSoTimeout(2000);
                DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
                dataOutputStream = new DataOutputStream(socket.getOutputStream());
                if (str == null) {
                    try {
                        str = "xgapplist:" + getLocalXGApps();
                    } catch (Throwable th3) {
                        th = th3;
                        byteArrayOutputStream = null;
                        th2 = th;
                        if (socket != null) {
                            try {
                                socket.close();
                            } catch (Exception e) {
                                com.tencent.android.tpush.p067a.ProGuard.m4723h(TAG, "close socket failed " + e.getMessage());
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e2) {
                            }
                        }
                        if (dataOutputStream != null) {
                            try {
                                dataOutputStream.close();
                            } catch (Exception e3) {
                            }
                        }
                        throw th2;
                    }
                }
                dataOutputStream.write(TpnsSecurity.oiSymmetryEncrypt2Byte(str));
                dataOutputStream.flush();
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT];
                    while (true) {
                        int read = socket.getInputStream().read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    if (byteArrayOutputStream.toByteArray().length > 0) {
                        str2 = new String(TpnsSecurity.oiSymmetryDecrypt2Byte(byteArrayOutputStream.toByteArray()));
                    }
                    try {
                        socket.close();
                    } catch (Exception e4) {
                        com.tencent.android.tpush.p067a.ProGuard.m4723h(TAG, "close socket failed " + e4.getMessage());
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e5) {
                    }
                    try {
                        dataOutputStream.close();
                    } catch (Exception e6) {
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    if (socket != null) {
                        socket.close();
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    if (dataOutputStream != null) {
                        dataOutputStream.close();
                    }
                    throw th2;
                }
            } catch (Throwable th32) {
                dataOutputStream = null;
                th2 = th32;
                Object obj = null;
                if (socket != null) {
                    socket.close();
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                if (dataOutputStream != null) {
                    dataOutputStream.close();
                }
                throw th2;
            }
        } catch (Throwable th322) {
            dataOutputStream = null;
            socket = null;
            th = th322;
            byteArrayOutputStream = null;
            th2 = th;
            if (socket != null) {
                socket.close();
            }
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            if (dataOutputStream != null) {
                dataOutputStream.close();
            }
            throw th2;
        }
        if (str2 == null) {
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
        return str2.replace("|", LetterIndexBar.SEARCH_ICON_LETTER).replace("/", LetterIndexBar.SEARCH_ICON_LETTER).replace("&", LetterIndexBar.SEARCH_ICON_LETTER).replace(" ", LetterIndexBar.SEARCH_ICON_LETTER);
    }

    public void sendHeartbeat2Watchdog(String str, ab abVar) {
        if (handler != null) {
            handler.post(new ProGuard(this, str, abVar));
        }
    }

    public void sendXGApp(String str, long j) {
        sendHeartbeat2Watchdog(str + "," + j + ";");
    }

    public void sendAllLocalXGAppList() {
        sendHeartbeat2Watchdog(null);
    }

    public void sendDebugMode(boolean z) {
        sendHeartbeat2Watchdog("debug:" + (z ? "1" : "0"));
    }

    public String getLocalXGApps() {
        if (ProGuard.m5376e() == null) {
            ProGuard.m5375c(this.context);
        }
        List<ResolveInfo> a = com.tencent.android.tpush.service.p077d.ProGuard.m5309a(this.context);
        List<ac> arrayList = new ArrayList(10);
        if (a != null) {
            for (ResolveInfo resolveInfo : a) {
                String str = resolveInfo.activityInfo.packageName;
                if (!com.tencent.android.tpush.service.p077d.ProGuard.m5317a(str)) {
                    com.tencent.android.tpush.data.ProGuard registerInfoByPkgName = CacheManager.getRegisterInfoByPkgName(str);
                    if (registerInfoByPkgName != null) {
                        com.tencent.android.tpush.service.p071a.ProGuard a2 = com.tencent.android.tpush.service.p071a.ProGuard.m4986a(this.context, str);
                        float f = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
                        if (a2 != null) {
                            f = a2.f7534a;
                        }
                        ac acVar = new ac();
                        acVar.f7541a = str;
                        acVar.f7543c = registerInfoByPkgName.f7419a;
                        acVar.f7542b = f;
                        arrayList.add(acVar);
                    }
                }
            }
        }
        Collections.sort(arrayList);
        long accessId = XGPushConfig.getAccessId(this.context);
        if (accessId <= 0) {
            accessId = XGPush4Msdk.getQQAccessId(this.context);
        }
        ac acVar2 = new ac();
        acVar2.f7541a = this.context.getPackageName();
        acVar2.f7543c = accessId;
        acVar2.f7542b = Constants.PUSH_SDK_VERSION;
        arrayList.add(0, acVar2);
        StringBuilder stringBuilder = new StringBuilder(AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT);
        for (ac acVar3 : arrayList) {
            stringBuilder.append(acVar3.f7541a).append(",").append(acVar3.f7543c).append(";");
        }
        return stringBuilder.toString();
    }

    private String domainToIp() {
        try {
            return InetAddress.getByName(Constants.UNSTALL_DOMAIN).getHostAddress();
        } catch (Exception e) {
            e.printStackTrace();
            return "14.18.245.161";
        }
    }

    private boolean oldloadWatchdog(String str) {
        if (!com.tencent.android.tpush.service.p077d.ProGuard.m5317a(WatchdogPath)) {
            return true;
        }
        WatchdogPath = LetterIndexBar.SEARCH_ICON_LETTER;
        try {
            File file = new File(new StringBuffer(this.context.getFilesDir().getParentFile().getAbsolutePath()).append(File.separator).append("lib").append(File.separator).append(LIB_FULL_NAME).toString());
            boolean exists = file.exists();
            if (!exists) {
                return exists;
            }
            WatchdogPath = file.getAbsolutePath();
            return exists;
        } catch (Exception e) {
            com.tencent.android.tpush.p067a.ProGuard.m4723h(TAG, "jniStartWatchdog loadWatchdog error:" + e.getMessage());
            return false;
        }
    }

    private void directStartWatchdog() {
        if (com.tencent.android.tpush.service.p071a.ProGuard.m4972a(ProGuard.m5376e()).f7532y != 0 && com.tencent.android.tpush.common.ProGuard.m4840h(this.context)) {
            try {
                if (!loadWatchdog(this.context.getPackageName())) {
                    return;
                }
                if (com.tencent.android.tpush.common.ProGuard.m4840h(this.context)) {
                    int watchdogPort = getWatchdogPort();
                    List<com.tencent.android.tpush.data.ProGuard> registerInfo = CacheManager.getRegisterInfo(this.context);
                    StringBuffer stringBuffer = new StringBuffer();
                    StringBuffer stringBuffer2 = new StringBuffer();
                    StringBuffer stringBuffer3 = new StringBuffer();
                    for (com.tencent.android.tpush.data.ProGuard proGuard : registerInfo) {
                        stringBuffer.append(proGuard.f7419a).append(",");
                        stringBuffer2.append(proGuard.f7420b).append(",");
                        stringBuffer3.append(proGuard.f7422d).append(",");
                    }
                    Object obj = new String[7];
                    obj[0] = WatchdogPath;
                    obj[1] = getLocalXGApps();
                    obj[2] = String.valueOf(watchdogPort);
                    obj[3] = domainToIp();
                    obj[4] = new com.tencent.android.tpush.p070d.ProGuard(this.context).m4844a();
                    obj[5] = (XGPushConfig.isEnableDebug(this.context) ? "1" : "0");
                    obj[6] = VERSION.SDK_INT;
                    com.tencent.android.tpush.p067a.ProGuard.m4715c(TAG, "exec " + obj);
                    Process exec = Runtime.getRuntime().exec(obj);
                    ad adVar = new ad(this, exec.getErrorStream(), "Error");
                    ad adVar2 = new ad(this, exec.getInputStream(), "Output");
                    adVar.start();
                    adVar2.start();
                    com.tencent.android.tpush.p067a.ProGuard.m4715c(TAG, "proc.exitValue = " + exec.waitFor());
                    return;
                }
                com.tencent.android.tpush.p067a.ProGuard.m4723h(TAG, "xg is disable.");
            } catch (Throwable th) {
                com.tencent.android.tpush.p067a.ProGuard.m4716c(TAG, "directStartWatchdog", th);
            }
        }
    }

    public void startWatchdog() {
        if (handler != null) {
            handler.post(new aa(this));
        }
    }

    private boolean loadWatchdog(String str) {
        if (!com.tencent.android.tpush.service.p077d.ProGuard.m5317a(WatchdogPath)) {
            return true;
        }
        boolean exists;
        WatchdogPath = LetterIndexBar.SEARCH_ICON_LETTER;
        try {
            File file = new File(new StringBuffer(File.separator).append(ShareRequestParam.RESP_UPLOAD_PIC_PARAM_DATA).append(File.separator).append(ShareRequestParam.RESP_UPLOAD_PIC_PARAM_DATA).append(File.separator).append(str).append(File.separator).append("lib").append(File.separator).append(LIB_FULL_NAME).toString());
            exists = file.exists();
            if (exists) {
                WatchdogPath = file.getAbsolutePath();
                boolean isInstalledOnSdCard = isInstalledOnSdCard(this.context);
                com.tencent.android.tpush.p067a.ProGuard.m4718d(TAG, "Application is install in SD Card: " + isInstalledOnSdCard);
                if (isInstalledOnSdCard) {
                    String stringBuffer = new StringBuffer(this.context.getDir("watchdog", 0).getAbsolutePath()).append(File.separator).append(LIB_FULL_NAME).toString();
                    File file2 = new File(stringBuffer);
                    if (file2.exists()) {
                        com.tencent.android.tpush.p067a.ProGuard.m4718d(TAG, "exeWatchDog exists!");
                    } else {
                        try {
                            file2.createNewFile();
                            if (!com.tencent.android.tpush.common.ProGuard.m4832a(file, file2)) {
                                file2.delete();
                                return false;
                            } else if (VERSION.SDK_INT >= 9) {
                                file2.getClass().getMethod("setExecutable", new Class[]{Boolean.TYPE}).invoke(file2, new Object[]{Boolean.valueOf(true)});
                            } else {
                                String str2 = "chmod 700 " + stringBuffer;
                                com.tencent.android.tpush.p067a.ProGuard.m4718d(TAG, " exec command: " + str2 + ",  exit:" + Runtime.getRuntime().exec(str2).waitFor());
                            }
                        } catch (IOException e) {
                            file2.delete();
                            com.tencent.android.tpush.p067a.ProGuard.m4723h(TAG, "exeWatchDog create error!");
                            return false;
                        }
                    }
                    WatchdogPath = stringBuffer;
                }
            }
        } catch (Exception e2) {
            com.tencent.android.tpush.p067a.ProGuard.m4723h(TAG, "jniStartWatchdog loadWatchdog error:" + e2.getMessage());
            exists = false;
        }
        return exists;
    }

    private static boolean isInstalledOnSdCard(Context context) {
        if (VERSION.SDK_INT >= 8) {
            try {
                if ((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & AccessibilityNodeInfoCompat.ACTION_EXPAND) == AccessibilityNodeInfoCompat.ACTION_EXPAND) {
                    return true;
                }
                return false;
            } catch (NameNotFoundException e) {
                com.tencent.android.tpush.p067a.ProGuard.m4723h(TAG, "check install location err, maybe api level < 8");
            }
        }
        try {
            String absolutePath = context.getFilesDir().getAbsolutePath();
            if (absolutePath.startsWith("/data/")) {
                return false;
            }
            if (absolutePath.contains("/mnt/") || absolutePath.contains("/sdcard/")) {
                return true;
            }
            return false;
        } catch (Throwable th) {
        }
    }
}
