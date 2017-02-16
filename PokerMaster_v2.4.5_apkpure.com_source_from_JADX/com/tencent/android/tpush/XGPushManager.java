package com.tencent.android.tpush;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.google.protobuf.CodedOutputStream;
import com.illuminate.texaspoker.R.R;
import com.jg.EType;
import com.jg.JgClassChecked;
import com.sina.weibo.sdk.constant.WBPageConstants.ParamKey;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.common.MessageKey;
import com.tencent.android.tpush.encrypt.Rijndael;
import com.tencent.android.tpush.p067a.ProGuard;
import com.tencent.android.tpush.service.XGPushService;
import com.tencent.android.tpush.service.channel.security.TpnsSecurity;
import com.texaspoker.moment.TexasPoker.GameRoomBaseInfo;
import com.texaspoker.moment.TexasPoker.PushMsg;
import com.texaspoker.moment.TexasPoker.QuickGameRoomPushMsg;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

@JgClassChecked(author = 1, fComment = "\u786e\u8ba4\u5df2\u8fdb\u884c\u5b89\u5168\u6821\u9a8c", lastDate = "20150316", reviewer = 3, vComment = {EType.RECEIVERCHECK, EType.INTENTCHECK})
/* compiled from: ProGuard */
public class XGPushManager {
    public static final String ENABLE_SERVICE_SUFFIX = ".enableService";
    public static final int OPERATION_FAIL = 1;
    public static final int OPERATION_REQ_REGISTER = 100;
    public static final int OPERATION_REQ_UNREGISTER = 101;
    public static final int OPERATION_SUCCESS = 0;
    private static final String f7261a;
    private static Context f7262b;
    private static XGPushNotifactionCallback f7263c;
    private static Map f7264d;
    public static int enableService;

    static {
        f7261a = XGPushManager.class.getSimpleName();
        f7262b = null;
        f7263c = null;
        enableService = -1;
        f7264d = new ConcurrentHashMap();
    }

    private XGPushManager() {
    }

    public static Context getContext() {
        return f7262b;
    }

    public static void setContext(Context context) {
        if (f7262b == null && context != null) {
            f7262b = context.getApplicationContext();
        }
    }

    public static void startPushService(Context context) {
        if (context != null) {
            setContext(context);
            if (XGPushConfig.enableDebug) {
                ProGuard.m4720e(f7261a, context.getPackageName() + "call start Push Service");
            }
            com.tencent.android.tpush.common.ProGuard.m4839g(context);
            if (com.tencent.android.tpush.common.ProGuard.m4836d(context) == 0) {
                com.tencent.android.tpush.common.ProGuard.m4837e(context);
            }
        }
    }

    static void m4681a(Context context) {
        if (context != null) {
            if (XGPushConfig.enableDebug) {
                ProGuard.m4720e(f7261a, context.getPackageName() + " call stop Push Service");
            }
            Intent intent = new Intent();
            intent.setClass(context.getApplicationContext(), XGPushService.class);
            context.stopService(intent);
        }
    }

    public static int getServiceStatus(Context context) {
        if (context != null) {
            return com.tencent.android.tpush.common.ProGuard.m4836d(context);
        }
        return 0;
    }

    public static void registerPush(Context context) {
        registerPush(context, new ProGuard());
    }

    public static void registerPush(Context context, XGIOperateCallback xGIOperateCallback) {
        if (xGIOperateCallback == null) {
            throw new IllegalArgumentException("The callback parameter can not be null!");
        }
        m4688a(context, null, null, -1, null, xGIOperateCallback, -1, null);
    }

    public static void registerPush(Context context, String str, XGIOperateCallback xGIOperateCallback) {
        if (xGIOperateCallback == null) {
            throw new IllegalArgumentException("The callback parameter can not be null!");
        }
        registerPush(context, str, "0", 0, null, xGIOperateCallback);
    }

    public static void registerPush(Context context, String str) {
        if (context == null || str == null) {
            ProGuard.m4724i(Constants.LogTag, "the parameter context or account of registerPush is invalid.");
        } else {
            registerPush(context, str, new ProGuard());
        }
    }

    public static void registerPush(Context context, String str, String str2, int i, String str3, XGIOperateCallback xGIOperateCallback) {
        if (xGIOperateCallback == null) {
            throw new IllegalArgumentException("The callback parameter can not be null!");
        } else if (context == null || com.tencent.android.tpush.common.ProGuard.m4834b(str) || com.tencent.android.tpush.common.ProGuard.m4834b(str2) || i < 0) {
            xGIOperateCallback.onFail(null, Constants.CODE_LOGIC_ILLEGAL_ARGUMENT, "The context, account, ticket or ticketType is(are) invalid!");
        } else {
            m4688a(context, str, str2, i, str3, xGIOperateCallback, -1, null);
        }
    }

    public static void unregisterPush(Context context) {
        if (context == null) {
            ProGuard.m4723h(Constants.LogTag, "the context of unregisterPush is null");
        } else {
            unregisterPush(context, new ProGuard());
        }
    }

    public static void unregisterPush(Context context, XGIOperateCallback xGIOperateCallback) {
        m4686a(context, xGIOperateCallback, XGPushConfig.getAccessId(context), XGPushConfig.getAccessKey(context));
    }

    static void m4686a(Context context, XGIOperateCallback xGIOperateCallback, long j, String str) {
        if (context == null) {
            setContext(context);
            if (xGIOperateCallback != null) {
                xGIOperateCallback.onFail(null, Constants.CODE_LOGIC_ILLEGAL_ARGUMENT, "The context parameter can not be null!");
                return;
            }
            throw new IllegalArgumentException("The context parameter can not be null!");
        }
        com.tencent.android.tpush.common.ProGuard.m4795a().m4798a(new ProGuard(context.getApplicationContext(), xGIOperateCallback, j, str));
    }

    public static void setTag(Context context, String str) {
        if (XGPushConfig.enableDebug) {
            ProGuard.m4720e(f7261a, "Action -> setTag with tag = " + str);
        }
        m4687a(context, str, (int) OPERATION_FAIL, -1);
    }

    public static void setKeyValueTag(Context context, String str, String str2) {
        if (context == null || str == null || str.trim().length() == 0 || str2 == null || str2.trim().length() == 0) {
            ProGuard.m4724i(f7261a, "setKeyValueTag context or tagKey or tagValue invalid.");
            return;
        }
        String str3 = str + "::::" + str2;
        ProGuard.m4720e(f7261a, "Action -> setKeyValueTag with tag = " + str3);
        m4687a(context, str3, 3, -1);
    }

    public static void deleteKeyValueTag(Context context, String str, String str2) {
        if (context == null || str == null || str.trim().length() == 0) {
            ProGuard.m4724i(f7261a, "deleteKeyValueTag context or tagKey invalid.");
            return;
        }
        String str3 = str + "::::" + str2;
        ProGuard.m4720e(f7261a, "Action -> deleteKeyValueTag with tag = " + str3);
        m4687a(context, str3, 4, -1);
    }

    public static void deleteTag(Context context, String str) {
        if (XGPushConfig.enableDebug) {
            ProGuard.m4720e(f7261a, "Action -> deleteTag with tag = " + str);
        }
        m4687a(context, str, 2, -1);
    }

    static void m4687a(Context context, String str, int i, long j) {
        if (context == null) {
            throw new IllegalArgumentException("The context parameter can not be null!");
        } else if (com.tencent.android.tpush.common.ProGuard.m4826a(context) <= 0) {
            if (str == null) {
                throw new IllegalArgumentException("The tagName parameter can not be null!");
            }
            if (j <= 0) {
                j = XGPushConfig.getAccessId(context);
            }
            if (j < 0) {
                throw new IllegalArgumentException("The accessId not set!");
            }
            Intent intent = new Intent("com.tencent.android.tpush.action.TAG");
            intent.putExtra(MessageKey.MSG_ACCESS_ID, j);
            intent.putExtra(Constants.FLAG_PACK_NAME, Rijndael.encrypt(context.getPackageName()));
            intent.putExtra(Constants.FLAG_TAG_TYPE, i);
            intent.putExtra(Constants.FLAG_TAG_NAME, Rijndael.encrypt(str));
            context.sendBroadcast(intent);
        }
    }

    static XGPushClickedResult m4678a(Activity activity) {
        if (XGPushConfig.enableDebug) {
            ProGuard.m4720e(Constants.LogTag, ">>> onActivityStarted activity=" + activity);
        }
        if (activity == null || activity.getIntent() == null) {
            return null;
        }
        Intent intent = activity.getIntent();
        String stringExtra = intent.getStringExtra(Constants.TAG_TPUSH_MESSAGE);
        if (stringExtra == null || !stringExtra.equalsIgnoreCase("true") || com.tencent.android.tpush.common.ProGuard.m4826a(activity.getApplicationContext()) > 0) {
            return null;
        }
        XGPushClickedResult xGPushClickedResult = new XGPushClickedResult();
        xGPushClickedResult.parseIntent(intent);
        intent.removeExtra(Constants.TAG_TPUSH_MESSAGE);
        com.tencent.android.tpush.common.ProGuard.m4795a().m4798a(new ProGuard(activity, intent));
        return xGPushClickedResult;
    }

    public static XGPushClickedResult onActivityStarted(Activity activity) {
        if (XGPushConfig.enableDebug) {
            ProGuard.m4720e(Constants.PushMessageLogTag, ">>> onActivityStarted " + activity);
        }
        if (activity == null || activity.getIntent() == null || !com.tencent.android.tpush.common.ProGuard.m4840h(activity)) {
            return null;
        }
        Intent intent = activity.getIntent();
        if (intent != null) {
            try {
                if (intent.hasExtra(Constants.TAG_TPUSH_NOTIFICATION)) {
                    Serializable serializableExtra = intent.getSerializableExtra(Constants.TAG_TPUSH_NOTIFICATION);
                    intent.removeExtra(Constants.TAG_TPUSH_NOTIFICATION);
                    if (serializableExtra != null && (serializableExtra instanceof XGPushClickedResult)) {
                        XGPushClickedResult xGPushClickedResult = (XGPushClickedResult) serializableExtra;
                        xGPushClickedResult.parseIntent(intent);
                        return xGPushClickedResult;
                    }
                }
            } catch (Throwable e) {
                ProGuard.m4716c(f7261a, "onActivityStarted", e);
            }
        }
        return null;
    }

    public static long addLocalNotification(Context context, XGLocalMessage xGLocalMessage) {
        return m4677a(context, xGLocalMessage, -1);
    }

    static long m4677a(Context context, XGLocalMessage xGLocalMessage, long j) {
        if (context == null || xGLocalMessage == null) {
            try {
                ProGuard.m4723h(f7261a, "addLocalNotification context == null or msg == null");
                return -1;
            } catch (Throwable th) {
                ProGuard.m4716c(Constants.LogTag, "addLocalNotification ", th);
                return 0;
            }
        } else if (!TpnsSecurity.checkTpnsSecurityLibSo(context)) {
            return -1;
        } else {
            Intent intent = new Intent("com.tencent.android.tpush.action.CUSTOM_NOTIFICATION");
            intent.putExtra("appPkgName", context.getPackageName());
            if (j <= 0) {
                j = XGPushConfig.getAccessId(context);
            }
            intent.putExtra("accessId", j);
            intent.putExtra(MessageKey.MSG_TYPE, xGLocalMessage.getType());
            intent.putExtra(MessageKey.MSG_TITLE, xGLocalMessage.getTitle());
            intent.putExtra(MessageKey.MSG_CONTENT, m4680a(xGLocalMessage.getContent()));
            intent.putExtra(MessageKey.MSG_CUSTOM_CONTENT, xGLocalMessage.getCustom_content());
            intent.putExtra(MessageKey.MSG_DATE, xGLocalMessage.getDate());
            intent.putExtra(MessageKey.MSG_ACCEPT_TIME_HOUR, xGLocalMessage.getHour());
            intent.putExtra(MessageKey.MSG_ACCEPT_TIME_MIN, xGLocalMessage.getMin());
            intent.putExtra("builderId", xGLocalMessage.getBuilderId());
            intent.putExtra(MessageKey.MSG_RING, xGLocalMessage.getRing());
            intent.putExtra(MessageKey.MSG_VIBRATE, xGLocalMessage.getVibrate());
            intent.putExtra(MessageKey.MSG_LIGHTS, xGLocalMessage.getLights());
            intent.putExtra(MessageKey.MSG_RING_RAW, xGLocalMessage.getRing_raw());
            intent.putExtra(MessageKey.MSG_ICON_TYPE, xGLocalMessage.getIcon_type());
            intent.putExtra(MessageKey.MSG_ICON_RES, xGLocalMessage.getIcon_res());
            intent.putExtra(MessageKey.MSG_STYLE_ID, xGLocalMessage.getStyle_id());
            intent.putExtra(MessageKey.MSG_SMALL_ICON, xGLocalMessage.getSmall_icon());
            intent.putExtra(Constants.FLAG_ACTION_TYPE, xGLocalMessage.getAction_type());
            intent.putExtra(Constants.FLAG_ACTIVITY_NAME, xGLocalMessage.getActivity());
            intent.putExtra(ParamKey.URL, xGLocalMessage.getUrl());
            intent.putExtra("intent", xGLocalMessage.getIntent());
            intent.putExtra(Constants.FLAG_PACKAGE_DOWNLOAD_URL, xGLocalMessage.getPackageDownloadUrl());
            intent.putExtra(Constants.FLAG_PACKAGE_NAME, xGLocalMessage.getPackageName());
            long currentTimeMillis = System.currentTimeMillis();
            intent.putExtra(MessageKey.MSG_ID, -currentTimeMillis);
            intent.putExtra("timeUs", currentTimeMillis);
            intent.putExtra(MessageKey.MSG_NOTIFY_ID, xGLocalMessage.getNotificationId());
            intent.putExtra(MessageKey.MSG_TTL, xGLocalMessage.getTtl());
            context.sendBroadcast(intent);
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append(j).append(-currentTimeMillis).append(context.getPackageName()).append(TextUtils.isEmpty(xGLocalMessage.getTitle()) ? LetterIndexBar.SEARCH_ICON_LETTER : xGLocalMessage.getTitle()).append(TextUtils.isEmpty(xGLocalMessage.getContent()) ? LetterIndexBar.SEARCH_ICON_LETTER : xGLocalMessage.getContent());
            String custom_content = xGLocalMessage.getCustom_content();
            if (TextUtils.isEmpty(custom_content) || new JSONObject(custom_content).length() == 0) {
                custom_content = LetterIndexBar.SEARCH_ICON_LETTER;
            }
            stringBuilder.append(custom_content);
            if (xGLocalMessage.getType() == OPERATION_FAIL) {
                StringBuilder append = stringBuilder.append(TextUtils.isEmpty(xGLocalMessage.getUrl()) ? LetterIndexBar.SEARCH_ICON_LETTER : xGLocalMessage.getUrl());
                if (TextUtils.isEmpty(xGLocalMessage.getIntent())) {
                    custom_content = LetterIndexBar.SEARCH_ICON_LETTER;
                } else {
                    custom_content = xGLocalMessage.getIntent();
                }
                append = append.append(custom_content);
                if (TextUtils.isEmpty(xGLocalMessage.getActivity())) {
                    custom_content = LetterIndexBar.SEARCH_ICON_LETTER;
                } else {
                    custom_content = xGLocalMessage.getActivity();
                }
                append.append(custom_content);
            }
            custom_content = stringBuilder.toString();
            String stringBuilder2 = new StringBuilder(Constants.LOCAL_MESSAGE_FLAG).append(com.tencent.android.tpush.encrypt.ProGuard.m4849a(custom_content)).toString();
            long expirationTimeMs = xGLocalMessage.getExpirationTimeMs();
            com.tencent.android.tpush.common.ProGuard.m4819b(context, stringBuilder2, expirationTimeMs);
            ProGuard.m4718d(Constants.LogTag, custom_content + ",tag:" + stringBuilder2 + ",exp:" + expirationTimeMs);
            return -currentTimeMillis;
        }
    }

    public static XGPushNotifactionCallback getNotifactionCallback() {
        return f7263c;
    }

    public static void setNotifactionCallback(XGPushNotifactionCallback xGPushNotifactionCallback) {
        f7263c = xGPushNotifactionCallback;
    }

    public static void clearLocalNotifications(Context context) {
        if (context == null) {
            ProGuard.m4723h(f7261a, "clearLocalNotifications  context==null.");
        } else if (com.tencent.android.tpush.common.ProGuard.m4826a(context) <= 0) {
            com.tencent.android.tpush.service.p072b.ProGuard.m5021a().m5061b(context, context.getPackageName());
            Intent intent = new Intent("com.tencent.android.tpush.action.CLEAR_CUSTOM_NOTIFICATION");
            intent.putExtra("appPkgName", context.getPackageName());
            context.sendBroadcast(intent);
        }
    }

    private static void m4692c(Context context, Intent intent) {
        if (intent.getLongExtra(MessageKey.MSG_ID, -1) > 0) {
            Intent intent2 = new Intent("com.tencent.android.tpush.action.PUSH_CLICK.RESULT");
            intent2.putExtras(intent);
            intent2.putExtra(Constants.FLAG_PACK_NAME, context.getPackageName());
            intent2.putExtra(Constants.FLAG_CLICK_TIME, System.currentTimeMillis() / 1000);
            context.sendBroadcast(intent2);
        }
    }

    public static void onMessageClicked(Context context, XGPushTextMessage xGPushTextMessage) {
        m4685a(context, xGPushTextMessage.m4696a(), "com.tencent.android.tpush.action.PUSH_CLICK.RESULT");
    }

    public static void onMessageCleared(Context context, XGPushTextMessage xGPushTextMessage) {
        m4685a(context, xGPushTextMessage.m4696a(), "com.tencent.android.tpush.action.PUSH_CANCELLED.RESULT");
    }

    private static void m4685a(Context context, Intent intent, String str) {
        if (context != null && intent != null && str != null) {
            Intent intent2 = new Intent(str);
            intent2.putExtras(intent);
            if ("com.tencent.android.tpush.action.PUSH_CANCELLED.RESULT".equals(str)) {
                intent2.putExtra(MessageKey.MSG_ACTION, 2);
            }
            intent2.putExtra(Constants.FLAG_PACK_NAME, context.getPackageName());
            intent2.putExtra(Constants.FLAG_CLICK_TIME, System.currentTimeMillis() / 1000);
            context.sendBroadcast(intent2);
        }
    }

    private static void m4694d(Context context, Intent intent) {
        if (intent != null) {
            Intent intent2 = new Intent(Constants.ACTION_FEEDBACK);
            intent2.setPackage(context.getPackageName());
            intent2.putExtra(Constants.FEEDBACK_TAG, 4);
            intent2.putExtra(Constants.FEEDBACK_ERROR_CODE, 0);
            intent2.putExtras(intent);
            context.sendBroadcast(intent2);
        }
    }

    public static void onActivityStoped(Activity activity) {
        if (activity != null) {
        }
    }

    public static void setPushNotificationBuilder(Context context, int i, XGPushNotificationBuilder xGPushNotificationBuilder) {
        if (context == null) {
            throw new IllegalArgumentException("context is null.");
        } else if (i <= 0 || i > CodedOutputStream.DEFAULT_BUFFER_SIZE) {
            throw new IllegalArgumentException("notificationBulderId\u4e0d\u5728\u8303\u56f4[1, 4096].");
        } else if (xGPushNotificationBuilder != null) {
            com.tencent.android.tpush.p068b.ProGuard.m4736a(context, i, xGPushNotificationBuilder);
        }
    }

    public static void setDefaultNotificationBuilder(Context context, XGPushNotificationBuilder xGPushNotificationBuilder) {
        if (context != null && xGPushNotificationBuilder != null) {
            com.tencent.android.tpush.p068b.ProGuard.m4736a(context, 0, xGPushNotificationBuilder);
        }
    }

    public static XGPushNotificationBuilder getDefaultNotificationBuilder(Context context) {
        XGPushNotificationBuilder notificationBuilder = getNotificationBuilder(context, 0);
        if (notificationBuilder == null) {
            return com.tencent.android.tpush.p068b.ProGuard.m4733a(context);
        }
        return notificationBuilder;
    }

    public static XGPushNotificationBuilder getNotificationBuilder(Context context, int i) {
        if (context != null) {
            return com.tencent.android.tpush.p068b.ProGuard.m4734a(context, i);
        }
        Log.e(Constants.LogTag, "getNotificationBuilder  context == null");
        return null;
    }

    public static void cancelNotifaction(Context context, int i) {
        try {
            ((NotificationManager) context.getSystemService("notification")).cancel(i);
        } catch (Exception e) {
        }
    }

    public static void cancelAllNotifaction(Context context) {
        try {
            ((NotificationManager) context.getSystemService("notification")).cancelAll();
        } catch (Exception e) {
        }
    }

    public static void msgAck(Context context, com.tencent.android.tpush.p068b.ProGuard proGuard) {
        if (context != null && proGuard != null) {
            if (XGPushConfig.enableDebug) {
                ProGuard.m4703a(f7261a, "Action -> msgAck(" + context.getPackageName() + "," + proGuard.m4767b() + ")");
            }
            ProGuard.m4700a(3, proGuard.m4767b());
            com.tencent.android.tpush.service.p072b.ProGuard.m5021a().m5062b(context, context.getPackageName(), proGuard.m4767b());
            if (proGuard.m4767b() > 0) {
                Intent intent = new Intent("com.tencent.android.tpush.action.MSG_ACK");
                intent.putExtra(MessageKey.MSG_ID, proGuard.m4767b());
                intent.putExtra(Constants.FLAG_PACK_NAME, context.getPackageName());
                context.sendBroadcast(intent);
            }
        }
    }

    public static String getServiceTag(Context context) {
        if (TpnsSecurity.checkTpnsSecurityLibSo(context)) {
            return Rijndael.encrypt(XGPushConfig.getAccessId(context) + ",xg_service_enable");
        }
        return "xg_service_enable";
    }

    public static void enableService(Context context, boolean z) {
        if (context != null) {
            if (!z) {
                ProGuard.m4723h(Constants.LogTag, "XG is disable.");
                unregisterPush(context, new ProGuard(context));
            }
            enableService = z ? OPERATION_FAIL : 0;
            if (XGPushConfig.enableDebug) {
                ProGuard.m4720e(f7261a, "enableService=" + enableService);
            }
            com.tencent.android.tpush.service.p077d.ProGuard.m5312a(context, context.getPackageName() + ENABLE_SERVICE_SUFFIX, enableService);
        }
    }

    static void m4688a(Context context, String str, String str2, int i, String str3, XGIOperateCallback xGIOperateCallback, long j, String str4) {
        setContext(context);
        if (context == null) {
            xGIOperateCallback.onFail(null, Constants.CODE_LOGIC_ILLEGAL_ARGUMENT, "The context parameter can not be null!");
            return;
        }
        com.tencent.android.tpush.common.ProGuard.m4795a().m4798a(new ProGuard(context, xGIOperateCallback, j, str4, str, str2, str3, i));
    }

    static void m4684a(Context context, Intent intent, XGIOperateCallback xGIOperateCallback, boolean z) {
        com.tencent.android.tpush.common.ProGuard.m4837e(context);
        BroadcastReceiver acVar = new ac(context, intent, xGIOperateCallback);
        context.registerReceiver(acVar, new IntentFilter("com.tencent.android.tpush.action.SERVICE_START"));
        Runnable adVar = new ad(context, intent, xGIOperateCallback);
        try {
            f7264d.put(acVar, adVar);
            com.tencent.android.tpush.common.ProGuard.m4795a().m4800a(adVar, 10000);
        } catch (Throwable e) {
            ProGuard.m4716c(Constants.LogTag, "mapTimeRunnableOfMessage error", e);
        }
    }

    private static synchronized void m4693c(Context context, Intent intent, XGIOperateCallback xGIOperateCallback) {
        synchronized (XGPushManager.class) {
            String c = com.tencent.android.tpush.common.ProGuard.m4835c(context);
            if (XGPushConfig.enableDebug) {
                ProGuard.m4720e(f7261a, "Action -> Register to xinge server, svcPackName:" + c);
            }
            if (!com.tencent.android.tpush.common.ProGuard.m4834b(c)) {
                intent.setPackage(c);
            }
            if (xGIOperateCallback != null) {
                context.registerReceiver(new ProGuard(xGIOperateCallback), new IntentFilter("com.tencent.android.tpush.action.REGISTER.RESULT"));
            }
            context.sendBroadcast(intent);
        }
    }

    private static void m4695d(Context context, Intent intent, XGIOperateCallback xGIOperateCallback) {
        if (XGPushConfig.enableDebug) {
            ProGuard.m4720e(f7261a, "Action ->UnRegister to xinge server");
        }
        String c = com.tencent.android.tpush.common.ProGuard.m4835c(context);
        if (!com.tencent.android.tpush.common.ProGuard.m4834b(c)) {
            intent.setPackage(c);
        }
        if (xGIOperateCallback != null) {
            context.registerReceiver(new aa(xGIOperateCallback), new IntentFilter("com.tencent.android.tpush.action.UNREGISTER.RESULT"));
        }
        context.sendBroadcast(intent);
    }

    private static String m4680a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i += OPERATION_FAIL) {
            char charAt = str.charAt(i);
            switch (charAt) {
                case QuickGameRoomPushMsg.VUSERS_FIELD_NUMBER /*8*/:
                    stringBuilder.append("\\b");
                    break;
                case PushMsg.STCLUBASEBINFO_FIELD_NUMBER /*9*/:
                    stringBuilder.append("\\t");
                    break;
                case PushMsg.SMSG_FIELD_NUMBER /*10*/:
                    stringBuilder.append("\\n");
                    break;
                case PushMsg.STSHAREBILLINFO_FIELD_NUMBER /*12*/:
                    stringBuilder.append("\\f");
                    break;
                case PushMsg.STPOKERPROCESSBASEINFO_FIELD_NUMBER /*13*/:
                    stringBuilder.append("\\r");
                    break;
                case GameRoomBaseInfo.ITHINKINGINTERVAL_FIELD_NUMBER /*34*/:
                case R.AppCompatTheme_dropdownListPreferredItemHeight /*47*/:
                case R.AppCompatTheme_colorBackgroundFloating /*92*/:
                    stringBuilder.append('\\').append(charAt);
                    break;
                default:
                    if (charAt > '\u001f') {
                        stringBuilder.append(charAt);
                        break;
                    }
                    Object[] objArr = new Object[OPERATION_FAIL];
                    objArr[0] = Integer.valueOf(charAt);
                    stringBuilder.append(String.format("\\u%04x", objArr));
                    break;
            }
        }
        return stringBuilder.toString();
    }
}
