package com.alarm.tool;

public class AlarmActivity {
    private static AlarmActivity instance;

    static {
        instance = null;
    }

    public static void ScheduleNotificaiton(String title, String message, int id, int second, int spaceSecond) {
        LocalNotificationControler.getInstance().ScheduleNotificaiton(title, message, id, second, spaceSecond);
    }

    public static void OnceScheduleNotificaiton(String title, String message, int id, int second) {
        LocalNotificationControler.getInstance().OnceScheduleNotificaiton(title, message, id, second);
    }
}
