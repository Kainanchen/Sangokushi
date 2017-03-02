package com.alarm.tool;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import com.tencent.open.SocialConstants;
import com.unity3d.player.UnityPlayer;
import com.ut.device.AidConstants;
import com.zkunity.app.ResourceIDs;
import java.util.Calendar;

public class LocalNotificationControler {
    private static LocalNotificationControler instance;

    static {
        instance = null;
    }

    private LocalNotificationControler() {
    }

    public static LocalNotificationControler getInstance() {
        if (instance == null) {
            return new LocalNotificationControler();
        }
        return instance;
    }

    public void ScheduleNotificaiton(String title, String message, int id, int second, int spaceSecond) {
        Calendar cal = Calendar.getInstance();
        cal.add(13, second);
        Intent intent = new Intent(UnityPlayer.currentActivity, LocalNotificationReciever.class);
        intent.putExtra(SocialConstants.PARAM_TITLE, title);
        intent.putExtra("message", message);
        intent.putExtra(ResourceIDs.ID, id);
        ((AlarmManager) UnityPlayer.currentActivity.getSystemService("alarm")).setRepeating(0, cal.getTimeInMillis(), (long) (spaceSecond * AidConstants.EVENT_REQUEST_STARTED), PendingIntent.getBroadcast(UnityPlayer.currentActivity, id, intent, 0));
    }

    public void OnceScheduleNotificaiton(String title, String message, int id, int second) {
        Calendar cal = Calendar.getInstance();
        cal.add(13, second);
        Intent intent = new Intent(UnityPlayer.currentActivity, LocalNotificationReciever.class);
        intent.putExtra(SocialConstants.PARAM_TITLE, title);
        intent.putExtra("message", message);
        intent.putExtra(ResourceIDs.ID, id);
        ((AlarmManager) UnityPlayer.currentActivity.getSystemService("alarm")).set(0, cal.getTimeInMillis(), PendingIntent.getBroadcast(UnityPlayer.currentActivity, id, intent, 0));
    }
}
