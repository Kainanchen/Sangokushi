package com.illuminate.texaspoker.receiver;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v4.app.NotificationCompat.BigTextStyle;
import android.support.v4.view.PointerIconCompat;
import android.support.v7.app.NotificationCompat.Builder;
import com.illuminate.texaspoker.activity.EmptyActivity;
import com.illuminate.texaspoker.application.BaseApplication;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import com.tencent.android.tpush.XGPushBaseReceiver;
import com.tencent.android.tpush.XGPushClickedResult;
import com.tencent.android.tpush.XGPushRegisterResult;
import com.tencent.android.tpush.XGPushShowedResult;
import com.tencent.android.tpush.XGPushTextMessage;
import java.util.Calendar;
import net.sqlcipher.database.SQLiteDatabase;

public class TransXgPushReceiver extends XGPushBaseReceiver {
    public void onRegisterResult(Context context, int i, XGPushRegisterResult xGPushRegisterResult) {
    }

    public void onUnregisterResult(Context context, int i) {
    }

    public void onSetTagResult(Context context, int i, String str) {
    }

    public void onDeleteTagResult(Context context, int i, String str) {
    }

    public void onTextMessage(Context context, XGPushTextMessage xGPushTextMessage) {
        if (!Utility.m4500f()) {
            NotificationManager notificationManager = (NotificationManager) BaseApplication.m3548a().getSystemService("notification");
            Builder builder = new Builder(BaseApplication.m3548a());
            builder.setLargeIcon(BitmapFactory.decodeResource(BaseApplication.m3548a().getResources(), 2130903382)).setSmallIcon(2130903438).setContentTitle(StringUtils.m4461a(2131165230)).setContentText(xGPushTextMessage.getContent()).setAutoCancel(true).setPriority(1).setDefaults(-1).setStyle(new BigTextStyle().bigText(xGPushTextMessage.getContent())).setDefaults(2).setSound(Uri.parse("android.resource://" + BaseApplication.m3548a().getPackageName() + "/2131099649"));
            Intent intent = new Intent(BaseApplication.m3548a(), EmptyActivity.class);
            intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            builder.setContentIntent(PendingIntent.getActivity(BaseApplication.m3548a(), 0, intent, 0));
            Notification build = builder.build();
            long currentTimeMillis = System.currentTimeMillis();
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(currentTimeMillis);
            notificationManager.notify((((instance.get(14) + (instance.get(13) * PointerIconCompat.TYPE_DEFAULT)) + ((instance.get(12) * PointerIconCompat.TYPE_DEFAULT) * 60)) + (((instance.get(11) * PointerIconCompat.TYPE_DEFAULT) * 60) * 60)) + ((((instance.get(5) * PointerIconCompat.TYPE_DEFAULT) * 60) * 60) * 24), build);
        }
    }

    public void onNotifactionClickedResult(Context context, XGPushClickedResult xGPushClickedResult) {
    }

    public void onNotifactionShowedResult(Context context, XGPushShowedResult xGPushShowedResult) {
    }
}
