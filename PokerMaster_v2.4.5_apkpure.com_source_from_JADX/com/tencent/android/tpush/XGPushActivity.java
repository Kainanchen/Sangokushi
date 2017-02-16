package com.tencent.android.tpush;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ResolveInfo.DisplayNameComparator;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.jg.EType;
import com.jg.JgClassChecked;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.common.MessageKey;
import com.tencent.android.tpush.common.ProGuard;
import com.tencent.android.tpush.encrypt.Rijndael;
import java.util.Collections;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;

@JgClassChecked(author = 1, fComment = "\u786e\u8ba4\u5df2\u8fdb\u884c\u5b89\u5168\u6821\u9a8c", lastDate = "20150316", reviewer = 3, vComment = {EType.ACTIVITYCHECK, EType.INTENTCHECK, EType.INTENTSCHEMECHECK})
/* compiled from: ProGuard */
public class XGPushActivity extends Activity {
    private Context mContext;

    private boolean checkIntent(Intent intent) {
        if (intent == null || !intent.hasExtra(MessageKey.MSG_PORTECT_TAG)) {
            return false;
        }
        String stringExtra = intent.getStringExtra(MessageKey.MSG_PORTECT_TAG);
        if (ProGuard.m4834b(stringExtra)) {
            return false;
        }
        try {
            Long valueOf = Long.valueOf(Rijndael.decrypt(stringExtra));
            if (valueOf.longValue() <= 0 || System.currentTimeMillis() < valueOf.longValue()) {
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mContext = this;
        try {
            Intent intent = getIntent();
            if (XGPushConfig.enableDebug) {
                com.tencent.android.tpush.p067a.ProGuard.m4718d(Constants.LogTag, "XGPushActivity receiver intent:" + intent);
            }
            if (checkIntent(intent)) {
                int intExtra = intent.getIntExtra(Constants.FLAG_ACTION_TYPE, 1);
                if (intExtra == 1) {
                    pushClickedResult(intent);
                    return;
                } else if (intExtra == 4) {
                    pushClickedPackageResult(intent);
                    return;
                } else if (intExtra == 2) {
                    showAlertDialog(0, intent);
                    return;
                } else if (intExtra == 3) {
                    showAlertDialog(1, intent);
                    return;
                } else {
                    finish();
                    return;
                }
            }
            finish();
        } catch (Throwable th) {
        }
    }

    private void pushClickedResult(Intent intent) {
        String stringExtra = intent.getStringExtra(Constants.FLAG_ACTIVITY_NAME) != null ? intent.getStringExtra(Constants.FLAG_ACTIVITY_NAME) : LetterIndexBar.SEARCH_ICON_LETTER;
        if (XGPushConfig.enableDebug) {
            com.tencent.android.tpush.p067a.ProGuard.m4718d(Constants.PushMessageLogTag, "activity intent =" + intent + "activity = " + stringExtra + "intent.getFlags()" + intent.getFlags());
        }
        Intent intent2 = new Intent();
        intent2.addFlags(intent.getFlags());
        intent2.setClassName(getApplicationContext(), stringExtra);
        intent.putExtra(Constants.TAG_TPUSH_MESSAGE, "true");
        intent2.putExtras(intent);
        intent2.putExtra(Constants.TAG_TPUSH_NOTIFICATION, XGPushManager.m4678a((Activity) this));
        try {
            startActivity(intent2);
        } catch (ActivityNotFoundException e) {
        }
        finish();
    }

    private void pushClickedPackageResult(Intent intent) {
        broadcastToTPushService(intent);
        ResolveInfo appMainActivity = getAppMainActivity(intent.getStringExtra(Constants.FLAG_PACKAGE_NAME));
        if (appMainActivity != null) {
            String str = appMainActivity.activityInfo.name;
            String str2 = appMainActivity.activityInfo.packageName;
            Intent intent2 = new Intent();
            intent2.putExtras(intent);
            intent2.setComponent(new ComponentName(str2, str));
            creatDialog(0, intent2);
            return;
        }
        creatDialog(1, intent);
    }

    private ResolveInfo getAppMainActivity(String str) {
        try {
            PackageManager packageManager = getPackageManager();
            Intent intent = new Intent("android.intent.action.MAIN", null);
            intent.addCategory("android.intent.category.LAUNCHER");
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            Collections.sort(queryIntentActivities, new DisplayNameComparator(packageManager));
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                String str2 = resolveInfo.activityInfo.name;
                String str3 = resolveInfo.activityInfo.packageName;
                System.out.println(" activityName---" + str2 + " pkgName---" + str3);
                if (str3.equals(str)) {
                    return resolveInfo;
                }
            }
        } catch (Throwable th) {
            com.tencent.android.tpush.p067a.ProGuard.m4716c(Constants.LogTag, "\u67e5\u627e\u4e3bActivity\u51fa\u9519", th);
        }
        return null;
    }

    private void creatDialog(int i, Intent intent) {
        Builder builder;
        if (i == 0) {
            builder = new Builder(this);
            builder.setOnCancelListener(new ProGuard(this, intent)).setTitle("\u63d0\u793a").setMessage("\u662f\u5426\u786e\u5b9a\u6253\u5f00\u6b64\u5e94\u7528\uff1f").setPositiveButton("\u6253\u5f00", new ProGuard(this, intent)).setNegativeButton("\u53d6\u6d88", new ProGuard(this, intent));
            builder.create().show();
        } else if (i == 1) {
            builder = new Builder(this);
            builder.setOnCancelListener(new ProGuard(this, intent)).setTitle("\u63d0\u793a").setMessage("\u672c\u5730\u672a\u53d1\u73b0\u6b64\u5e94\u7528\uff0c\u5efa\u8bae\u53bb\u4e0b\u8f7d\uff01").setPositiveButton("\u4e0b\u8f7d", new ProGuard(this, intent)).setNegativeButton("\u53d6\u6d88", new ProGuard(this, intent));
            builder.create().show();
        }
    }

    private void showAlertDialog(int i, Intent intent) {
        if (i == 0) {
            String stringExtra = intent.getStringExtra(Constants.FLAG_ACTIVITY_NAME);
            if (intent.getIntExtra(Constants.FLAG_ACTION_CONFIRM, 0) == 1) {
                new Builder(this).setTitle("\u63d0\u793a").setCancelable(false).setMessage("\u662f\u5426\u6253\u5f00\u7f51\u7ad9:" + stringExtra + "?").setPositiveButton("\u786e\u8ba4", new ProGuard(this, stringExtra, intent)).setNegativeButton("\u53d6\u6d88", new ProGuard(this, intent)).show();
            } else {
                openUrl(stringExtra, intent);
            }
        } else if (i != 1) {
        } else {
            if (intent.getIntExtra(Constants.FLAG_ACTION_CONFIRM, 0) == 1) {
                new Builder(this).setTitle("\u63d0\u793a").setCancelable(false).setMessage("\u7ee7\u7eed\u6253\u5f00Intent?").setPositiveButton("\u786e\u8ba4", new ProGuard(this, intent)).setNegativeButton("\u53d6\u6d88", new ProGuard(this, intent)).show();
            } else {
                openIntent(intent);
            }
        }
    }

    private void openIntent(Intent intent) {
        Intent parseUri;
        try {
            parseUri = Intent.parseUri(intent.getStringExtra(Constants.FLAG_ACTIVITY_NAME), 1);
            parseUri.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            parseUri.addCategory("android.intent.category.BROWSABLE");
            parseUri.setComponent(null);
            if (VERSION.SDK_INT >= 15) {
                parseUri.getClass().getMethod("setSelector", new Class[]{Intent.class}).invoke(parseUri, new Object[]{null});
            }
        } catch (Throwable e) {
            com.tencent.android.tpush.p067a.ProGuard.m4711b(Constants.LogTag, "invoke intent.setComponent error.", e);
        } catch (Throwable e2) {
            com.tencent.android.tpush.p067a.ProGuard.m4716c(Constants.LogTag, "openIntent error.", e2);
            return;
        }
        broadcastToTPushService(intent);
        startActivity(parseUri);
        finish();
    }

    private void openUrl(String str, Intent intent) {
        try {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent2.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            broadcastToTPushService(intent);
            startActivity(intent2);
        } catch (Throwable th) {
            com.tencent.android.tpush.p067a.ProGuard.m4716c(Constants.LogTag, "openUrl error.", th);
        }
        finish();
    }

    private void broadcastToTPushService(Intent intent) {
        Intent intent2 = new Intent("com.tencent.android.tpush.action.PUSH_CLICK.RESULT");
        intent2.putExtras(intent);
        intent2.putExtra(Constants.FLAG_PACK_NAME, this.mContext.getPackageName());
        intent2.putExtra(Constants.FLAG_CLICK_TIME, System.currentTimeMillis() / 1000);
        sendBroadcast(intent2);
    }

    protected void onStart() {
        super.onStart();
    }

    protected void onResume() {
        super.onResume();
    }

    protected void onPause() {
        super.onPause();
    }

    protected void onStop() {
        super.onStop();
    }
}
