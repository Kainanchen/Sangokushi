package com.zkunity.core;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.Notification;
import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import com.igexin.download.Downloads;
import com.igexin.sdk.PushConsts;
import com.igexin.sdk.PushManager;
import com.tencent.open.SocialConstants;
import com.tencent.tauth.AuthActivity;
import com.tencent.tauth.Tencent;
import com.zkunity.app.ResourceIDs;
import com.zkunity.sdk.MUnityPlayerProxy;
import com.zkunity.sdk.ZKResEvent;
import java.util.List;

public class PushReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getExtras();
        switch (bundle.getInt(AuthActivity.ACTION_KEY)) {
            case Tencent.REQUEST_LOGIN /*10001*/:
                byte[] payload = bundle.getByteArray("payload");
                PushManager.getInstance().sendFeedbackMessage(context, bundle.getString("taskid"), bundle.getString("messageid"), PushConsts.MIN_FEEDBACK_ACTION);
                if (payload != null) {
                    String data = new String(payload);
                    Log.d("GetuiSdkDemo", "receiver payload : " + data);
                    if (isApplicationBroughtToBackground(context)) {
                        openNativeNotification(context, data);
                        return;
                    }
                    ZKResEvent rEvent = new ZKResEvent();
                    rEvent.createNewFromNull();
                    rEvent.putString(Downloads.COLUMN_URI, "sShowNotMessage");
                    rEvent.putString(SocialConstants.PARAM_SEND_MSG, String.valueOf(data));
                    MUnityPlayerProxy.getManager().sendMessage(rEvent);
                }
            default:
        }
    }

    public boolean isApplicationBroughtToBackground(Context context) {
        List<RunningTaskInfo> tasks = ((ActivityManager) context.getSystemService("activity")).getRunningTasks(1);
        if (tasks.isEmpty() || ((RunningTaskInfo) tasks.get(0)).topActivity.getPackageName().equals(context.getPackageName())) {
            return false;
        }
        return true;
    }

    public void openNativeNotification(Context context, String text) {
        Notification note;
        NotificationManager noteMng = (NotificationManager) context.getSystemService("notification");
        int notificationIcon = ResourceIDs.getResourseId(context, "app_icon", ResourceIDs.DRAWABLE_ID);
        Intent intent = new Intent(context, BaseActivity.class);
        intent.setFlags(536870912);
        PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);
        pendingIntent = PendingIntent.getActivity(context, 0, intent, 134217728);
        if (VERSION.SDK_INT >= 11) {
            note = new Builder(context).setTicker(text).setSmallIcon(notificationIcon).setContentIntent(pendingIntent).setContentTitle(getApplicationName(context)).setContentText(text).build();
        } else {
            note = new Notification(notificationIcon, text, System.currentTimeMillis());
            note.setLatestEventInfo(context, getApplicationName(context), text, pendingIntent);
        }
        note.defaults = -1;
        note.flags = 16;
        noteMng.notify((int) (System.currentTimeMillis() / 1000), note);
    }

    public String getApplicationName(Context context) {
        ApplicationInfo applicationInfo;
        PackageManager packageManager = null;
        try {
            packageManager = context.getPackageManager();
            applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
        } catch (NameNotFoundException e) {
            applicationInfo = null;
        }
        return (String) packageManager.getApplicationLabel(applicationInfo);
    }
}
