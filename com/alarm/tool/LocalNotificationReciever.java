package com.alarm.tool;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat.Builder;
import com.speedfish.pokerfishs.C0572R;
import com.tencent.open.SocialConstants;
import com.unity3d.player.UnityPlayerActivity;
import com.zkunity.app.ResourceIDs;

public class LocalNotificationReciever extends BroadcastReceiver {
    private int NOTIFICATION_ID;

    public void onReceive(Context context, Intent data) {
        Bundle extras = data.getExtras();
        String title = extras.getString(SocialConstants.PARAM_TITLE);
        String message = extras.getString("message");
        int id = extras.getInt(ResourceIDs.ID);
        NotificationManager manager = (NotificationManager) context.getSystemService("notification");
        Intent mIntent = new Intent(context, UnityPlayerActivity.class);
        mIntent.addFlags(805306368);
        mIntent.setAction("android.intent.action.MAIN");
        mIntent.addCategory("android.intent.category.LAUNCHER");
        PendingIntent intent = PendingIntent.getActivity(context, id, mIntent, 0);
        Builder mBuilder = new Builder(context);
        mBuilder.setSmallIcon(C0572R.drawable.app_banner);
        mBuilder.setDefaults(-1);
        mBuilder.setContentTitle(title);
        mBuilder.setContentText(message);
        mBuilder.setContentIntent(intent).setAutoCancel(true);
        manager.notify(this.NOTIFICATION_ID, mBuilder.build());
    }
}
