package com.sina.weibo.sdk.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.StatFs;
import android.provider.Settings.Secure;
import android.support.v4.os.EnvironmentCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.sina.weibo.sdk.component.GameManager;
import com.sina.weibo.sdk.exception.WeiboException;
import com.sina.weibo.sdk.net.NetUtils;
import com.sina.weibo.sdk.net.WeiboParameters;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.texaspoker.moment.TexasPoker.PushMsg;
import com.texaspoker.moment.TexasPoker.QuickGameRoomPushMsg;
import com.texaspoker.moment.TexasPoker.SCGameActionRsp;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.locks.ReentrantLock;
import javax.crypto.Cipher;
import net.sqlcipher.database.SQLiteDatabase;
import org.json.JSONException;
import org.json.JSONObject;

public class AidTask {
    private static final String AID_FILE_NAME = "weibo_sdk_aid";
    private static final int MAX_RETRY_NUM = 3;
    private static final String TAG = "AidTask";
    private static final int VERSION = 1;
    public static final int WHAT_LOAD_AID_ERR = 1002;
    public static final int WHAT_LOAD_AID_SUC = 1001;
    private static AidTask sInstance;
    private AidInfo mAidInfo;
    private String mAppKey;
    private Context mContext;
    private CallbackHandler mHandler;
    private volatile ReentrantLock mTaskLock;

    /* renamed from: com.sina.weibo.sdk.utils.AidTask.1 */
    class C10181 implements Runnable {
        C10181() {
        }

        public void run() {
            for (int i = 0; i <= 0; i += AidTask.VERSION) {
                try {
                    AidTask.this.getAidInfoFile(0).delete();
                } catch (Exception e) {
                }
            }
        }
    }

    /* renamed from: com.sina.weibo.sdk.utils.AidTask.2 */
    class C10192 implements Runnable {
        C10192() {
        }

        public void run() {
            if (AidTask.this.mTaskLock.tryLock()) {
                AidInfo access$2 = AidTask.this.loadAidInfoFromCache();
                if (access$2 == null) {
                    int i = AidTask.VERSION;
                    do {
                        i += AidTask.VERSION;
                        try {
                            String access$3 = AidTask.this.loadAidFromNet();
                            AidInfo parseJson = AidInfo.parseJson(access$3);
                            AidTask.this.cacheAidInfo(access$3);
                            AidTask.this.mAidInfo = parseJson;
                            break;
                        } catch (WeiboException e) {
                            LogUtil.m4622e(AidTask.TAG, "AidTaskInit WeiboException Msg : " + e.getMessage());
                            if (i >= AidTask.MAX_RETRY_NUM) {
                            }
                        }
                    } while (i >= AidTask.MAX_RETRY_NUM);
                } else {
                    AidTask.this.mAidInfo = access$2;
                }
                AidTask.this.mTaskLock.unlock();
                return;
            }
            LogUtil.m4622e(AidTask.TAG, "tryLock : false, return");
        }
    }

    /* renamed from: com.sina.weibo.sdk.utils.AidTask.3 */
    class C10203 implements Runnable {
        private final /* synthetic */ AidResultCallBack val$callback;

        C10203(AidResultCallBack aidResultCallBack) {
            this.val$callback = aidResultCallBack;
        }

        public void run() {
            AidTask.this.mTaskLock.lock();
            Object access$2 = AidTask.this.loadAidInfoFromCache();
            Object obj = null;
            if (access$2 == null) {
                try {
                    String access$3 = AidTask.this.loadAidFromNet();
                    access$2 = AidInfo.parseJson(access$3);
                    AidTask.this.cacheAidInfo(access$3);
                    AidTask.this.mAidInfo = access$2;
                } catch (WeiboException e) {
                    obj = e;
                    LogUtil.m4622e(AidTask.TAG, "AidTaskInit WeiboException Msg : " + obj.getMessage());
                }
            }
            AidTask.this.mTaskLock.unlock();
            Message obtain = Message.obtain();
            if (access$2 != null) {
                obtain.what = AidTask.WHAT_LOAD_AID_SUC;
                obtain.obj = access$2;
            } else {
                obtain.what = AidTask.WHAT_LOAD_AID_ERR;
                obtain.obj = obj;
            }
            AidTask.this.mHandler.setCallback(this.val$callback);
            AidTask.this.mHandler.sendMessage(obtain);
        }
    }

    public static final class AidInfo {
        private String mAid;
        private String mSubCookie;

        public final String getAid() {
            return this.mAid;
        }

        public final String getSubCookie() {
            return this.mSubCookie;
        }

        public static AidInfo parseJson(String str) {
            AidInfo aidInfo = new AidInfo();
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("error") || jSONObject.has("error_code")) {
                    LogUtil.m4621d(AidTask.TAG, "loadAidFromNet has error !!!");
                    throw new WeiboException("loadAidFromNet has error !!!");
                }
                aidInfo.mAid = jSONObject.optString(LogBuilder.KEY_AID, LetterIndexBar.SEARCH_ICON_LETTER);
                aidInfo.mSubCookie = jSONObject.optString("sub", LetterIndexBar.SEARCH_ICON_LETTER);
                return aidInfo;
            } catch (JSONException e) {
                LogUtil.m4621d(AidTask.TAG, "loadAidFromNet JSONException Msg : " + e.getMessage());
                throw new WeiboException("loadAidFromNet has error !!!");
            }
        }

        final AidInfo cloneAidInfo() {
            AidInfo aidInfo = new AidInfo();
            aidInfo.mAid = this.mAid;
            aidInfo.mSubCookie = this.mSubCookie;
            return aidInfo;
        }
    }

    public interface AidResultCallBack {
        void onAidGenFailed(Exception exception);

        void onAidGenSuccessed(AidInfo aidInfo);
    }

    private static class CallbackHandler extends Handler {
        private WeakReference<AidResultCallBack> callBackReference;

        public CallbackHandler(Looper looper) {
            super(looper);
        }

        public void setCallback(AidResultCallBack aidResultCallBack) {
            if (this.callBackReference == null) {
                this.callBackReference = new WeakReference(aidResultCallBack);
            } else if (((AidResultCallBack) this.callBackReference.get()) != aidResultCallBack) {
                this.callBackReference = new WeakReference(aidResultCallBack);
            }
        }

        public void handleMessage(Message message) {
            AidResultCallBack aidResultCallBack = (AidResultCallBack) this.callBackReference.get();
            switch (message.what) {
                case AidTask.WHAT_LOAD_AID_SUC /*1001*/:
                    if (aidResultCallBack != null) {
                        aidResultCallBack.onAidGenSuccessed(((AidInfo) message.obj).cloneAidInfo());
                    }
                case AidTask.WHAT_LOAD_AID_ERR /*1002*/:
                    if (aidResultCallBack != null) {
                        aidResultCallBack.onAidGenFailed((WeiboException) message.obj);
                    }
                default:
            }
        }
    }

    private AidTask(Context context) {
        this.mTaskLock = new ReentrantLock(true);
        this.mContext = context.getApplicationContext();
        this.mHandler = new CallbackHandler(this.mContext.getMainLooper());
        new Thread(new C10181()).start();
    }

    public static synchronized AidTask getInstance(Context context) {
        AidTask aidTask;
        synchronized (AidTask.class) {
            if (sInstance == null) {
                sInstance = new AidTask(context);
            }
            aidTask = sInstance;
        }
        return aidTask;
    }

    public void aidTaskInit(String str) {
        if (!TextUtils.isEmpty(str)) {
            LogUtil.m4622e(TAG, "aidTaskInit ");
            initAidInfo(str);
        }
    }

    private void initAidInfo(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mAppKey = str;
            new Thread(new C10192()).start();
        }
    }

    public AidInfo getAidSync(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        LogUtil.m4622e(TAG, "getAidSync ");
        if (this.mAidInfo == null) {
            aidTaskInit(str);
        }
        return this.mAidInfo;
    }

    public void getAidAsync(String str, AidResultCallBack aidResultCallBack) {
        if (!TextUtils.isEmpty(str)) {
            if (this.mAidInfo == null || aidResultCallBack == null) {
                generateAid(str, aidResultCallBack);
            } else {
                aidResultCallBack.onAidGenSuccessed(this.mAidInfo.cloneAidInfo());
            }
        }
    }

    private void generateAid(String str, AidResultCallBack aidResultCallBack) {
        if (!TextUtils.isEmpty(str)) {
            this.mAppKey = str;
            new Thread(new C10203(aidResultCallBack)).start();
        }
    }

    private synchronized AidInfo loadAidInfoFromCache() {
        Throwable th;
        AidInfo aidInfo = null;
        synchronized (this) {
            FileInputStream fileInputStream;
            try {
                fileInputStream = new FileInputStream(getAidInfoFile(VERSION));
                try {
                    byte[] bArr = new byte[fileInputStream.available()];
                    fileInputStream.read(bArr);
                    aidInfo = AidInfo.parseJson(new String(bArr));
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                    }
                } catch (Exception e2) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e3) {
                        }
                    }
                    return aidInfo;
                } catch (Throwable th2) {
                    th = th2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e4) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e5) {
                fileInputStream = aidInfo;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return aidInfo;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                fileInputStream = aidInfo;
                th = th4;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        }
        return aidInfo;
    }

    private File getAidInfoFile(int i) {
        return new File(this.mContext.getFilesDir(), new StringBuilder(AID_FILE_NAME).append(i).toString());
    }

    private String loadAidFromNet() {
        String packageName = this.mContext.getPackageName();
        String sign = Utility.getSign(this.mContext, packageName);
        String mfp = getMfp(this.mContext);
        WeiboParameters weiboParameters = new WeiboParameters(this.mAppKey);
        weiboParameters.put(LogBuilder.KEY_APPKEY, this.mAppKey);
        weiboParameters.put("mfp", mfp);
        weiboParameters.put(LogBuilder.KEY_PACKAGE_NAME, packageName);
        weiboParameters.put(LogBuilder.KEY_HASH, sign);
        try {
            packageName = NetUtils.internalHttpRequest(this.mContext, "https://api.weibo.com/oauth2/getaid.json", "GET", weiboParameters);
            LogUtil.m4621d(TAG, "loadAidFromNet response : " + packageName);
            return packageName;
        } catch (WeiboException e) {
            LogUtil.m4621d(TAG, "loadAidFromNet WeiboException Msg : " + e.getMessage());
            throw e;
        }
    }

    private synchronized void cacheAidInfo(String str) {
        Throwable th;
        if (!TextUtils.isEmpty(str)) {
            FileOutputStream fileOutputStream = null;
            FileOutputStream fileOutputStream2;
            try {
                fileOutputStream2 = new FileOutputStream(getAidInfoFile(VERSION));
                try {
                    fileOutputStream2.write(str.getBytes());
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e) {
                    }
                } catch (Exception e2) {
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e3) {
                        }
                    }
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    fileOutputStream = fileOutputStream2;
                    th = th3;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e5) {
                fileOutputStream2 = null;
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
            } catch (Throwable th4) {
                th = th4;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        }
    }

    private static String getMfp(Context context) {
        String str;
        String genMfpString = genMfpString(context);
        String str2 = LetterIndexBar.SEARCH_ICON_LETTER;
        try {
            str = new String(genMfpString.getBytes(), GameManager.DEFAULT_CHARSET);
        } catch (UnsupportedEncodingException e) {
            str = str2;
        }
        LogUtil.m4621d(TAG, "genMfpString() utf-8 string : " + str);
        try {
            str = encryptRsa(str, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDHHM0Fi2Z6+QYKXqFUX2Cy6AaWq3cPi+GSn9oeAwQbPZR75JB7Netm0HtBVVbtPhzT7UO2p1JhFUKWqrqoYuAjkgMVPmA0sFrQohns5EE44Y86XQopD4ZO+dE5KjUZFE6vrPO3rWW3np2BqlgKpjnYZri6TJApmIpGcQg9/G/3zQIDAQAB");
            LogUtil.m4621d(TAG, "encryptRsa() string : " + str);
            return str;
        } catch (Exception e2) {
            LogUtil.m4622e(TAG, e2.getMessage());
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
    }

    private static String genMfpString(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            CharSequence os = getOS();
            if (!TextUtils.isEmpty(os)) {
                jSONObject.put("1", os);
            }
            os = getImei(context);
            if (!TextUtils.isEmpty(os)) {
                jSONObject.put("2", os);
            }
            os = getMeid(context);
            if (!TextUtils.isEmpty(os)) {
                jSONObject.put("3", os);
            }
            os = getImsi(context);
            if (!TextUtils.isEmpty(os)) {
                jSONObject.put("4", os);
            }
            os = getMac(context);
            if (!TextUtils.isEmpty(os)) {
                jSONObject.put("5", os);
            }
            os = getIccid(context);
            if (!TextUtils.isEmpty(os)) {
                jSONObject.put("6", os);
            }
            os = getSerialNo();
            if (!TextUtils.isEmpty(os)) {
                jSONObject.put("7", os);
            }
            os = getAndroidId(context);
            if (!TextUtils.isEmpty(os)) {
                jSONObject.put("10", os);
            }
            os = getCpu();
            if (!TextUtils.isEmpty(os)) {
                jSONObject.put("13", os);
            }
            os = getModel();
            if (!TextUtils.isEmpty(os)) {
                jSONObject.put("14", os);
            }
            os = getSdSize();
            if (!TextUtils.isEmpty(os)) {
                jSONObject.put("15", os);
            }
            os = getResolution(context);
            if (!TextUtils.isEmpty(os)) {
                jSONObject.put("16", os);
            }
            os = getSsid(context);
            if (!TextUtils.isEmpty(os)) {
                jSONObject.put("17", os);
            }
            os = getDeviceName();
            if (!TextUtils.isEmpty(os)) {
                jSONObject.put("18", os);
            }
            os = getConnectType(context);
            if (!TextUtils.isEmpty(os)) {
                jSONObject.put("19", os);
            }
            String str = LetterIndexBar.SEARCH_ICON_LETTER;
            try {
                os = Utility.generateUAAid(context);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (!TextUtils.isEmpty(os)) {
                jSONObject.put("20", os);
            }
            return jSONObject.toString();
        } catch (JSONException e2) {
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
    }

    private static String encryptRsa(String str, String str2) {
        Throwable th;
        Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        instance.init(VERSION, getPublicKey(str2));
        byte[] bytes = str.getBytes(GameManager.DEFAULT_CHARSET);
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            int i = 0;
            while (true) {
                int splite = splite(bytes, i, 117);
                if (splite == -1) {
                    break;
                }
                try {
                    byte[] doFinal = instance.doFinal(bytes, i, splite);
                    byteArrayOutputStream.write(doFinal);
                    LogUtil.m4621d(TAG, "encryptRsa offset = " + i + "     len = " + splite + "     enBytes len = " + doFinal.length);
                    i += splite;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            byteArrayOutputStream.flush();
            byte[] toByteArray = byteArrayOutputStream.toByteArray();
            LogUtil.m4621d(TAG, "encryptRsa total enBytes len = " + toByteArray.length);
            toByteArray = Base64.encodebyte(toByteArray);
            LogUtil.m4621d(TAG, "encryptRsa total base64byte len = " + toByteArray.length);
            String str3 = "01" + new String(toByteArray, GameManager.DEFAULT_CHARSET);
            LogUtil.m4621d(TAG, "encryptRsa total base64string : " + str3);
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
            }
            return str3;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e2) {
                }
            }
            throw th;
        }
    }

    private static int splite(byte[] bArr, int i, int i2) {
        if (i >= bArr.length) {
            return -1;
        }
        return Math.min(bArr.length - i, i2);
    }

    private static PublicKey getPublicKey(String str) {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str.getBytes())));
    }

    private static String getOS() {
        try {
            return "Android " + VERSION.RELEASE;
        } catch (Exception e) {
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
    }

    private static String getImei(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
        } catch (Exception e) {
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
    }

    private static String getMeid(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
        } catch (Exception e) {
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
    }

    private static String getImsi(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getSubscriberId();
        } catch (Exception e) {
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
    }

    private static String getMac(Context context) {
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager == null) {
                return LetterIndexBar.SEARCH_ICON_LETTER;
            }
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            return connectionInfo != null ? connectionInfo.getMacAddress() : LetterIndexBar.SEARCH_ICON_LETTER;
        } catch (Exception e) {
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
    }

    private static String getIccid(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getSimSerialNumber();
        } catch (Exception e) {
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
    }

    private static String getSerialNo() {
        String str = LetterIndexBar.SEARCH_ICON_LETTER;
        try {
            Class cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class, String.class}).invoke(cls, new Object[]{"ro.serialno", EnvironmentCompat.MEDIA_UNKNOWN});
        } catch (Exception e) {
            return str;
        }
    }

    private static String getAndroidId(Context context) {
        try {
            return Secure.getString(context.getContentResolver(), "android_id");
        } catch (Exception e) {
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
    }

    private static String getCpu() {
        try {
            return Build.CPU_ABI;
        } catch (Exception e) {
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
    }

    private static String getModel() {
        try {
            return Build.MODEL;
        } catch (Exception e) {
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
    }

    private static String getSdSize() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return Long.toString(((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()));
        } catch (Exception e) {
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
    }

    private static String getResolution(Context context) {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            return new StringBuilder(String.valueOf(String.valueOf(displayMetrics.widthPixels))).append("*").append(String.valueOf(displayMetrics.heightPixels)).toString();
        } catch (Exception e) {
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
    }

    private static String getSsid(Context context) {
        try {
            WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
            if (connectionInfo != null) {
                return connectionInfo.getSSID();
            }
        } catch (Exception e) {
        }
        return LetterIndexBar.SEARCH_ICON_LETTER;
    }

    private static String getDeviceName() {
        try {
            return Build.BRAND;
        } catch (Exception e) {
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
    }

    private static String getConnectType(Context context) {
        String str = "none";
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.getType() == 0) {
                    switch (activeNetworkInfo.getSubtype()) {
                        case VERSION /*1*/:
                        case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                        case SQLiteDatabase.CONFLICT_IGNORE /*4*/:
                        case QuickGameRoomPushMsg.STFROMUSER_FIELD_NUMBER /*7*/:
                        case PushMsg.VVOICEDATAS_FIELD_NUMBER /*11*/:
                            return "2G";
                        case MAX_RETRY_NUM /*3*/:
                        case SQLiteDatabase.CONFLICT_REPLACE /*5*/:
                        case SCGameActionRsp.LBETTINGID_FIELD_NUMBER /*6*/:
                        case QuickGameRoomPushMsg.VUSERS_FIELD_NUMBER /*8*/:
                        case PushMsg.STCLUBASEBINFO_FIELD_NUMBER /*9*/:
                        case PushMsg.SMSG_FIELD_NUMBER /*10*/:
                        case PushMsg.STSHAREBILLINFO_FIELD_NUMBER /*12*/:
                        case PushMsg.STRPICURL_FIELD_NUMBER /*14*/:
                        case PushMsg.LCREATETIME_FIELD_NUMBER /*15*/:
                            return "3G";
                        case PushMsg.STPOKERPROCESSBASEINFO_FIELD_NUMBER /*13*/:
                            return "4G";
                        default:
                            return "none";
                    }
                } else if (activeNetworkInfo.getType() == VERSION) {
                    return "wifi";
                }
            }
        } catch (Exception e) {
        }
        return str;
    }
}
