package com.tencent.android.tpush;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import com.jg.EType;
import com.jg.JgClassChecked;
import com.tencent.android.tpush.p068b.ProGuard;

@JgClassChecked(author = 1, fComment = "\u786e\u8ba4\u5df2\u8fdb\u884c\u5b89\u5168\u6821\u9a8c", lastDate = "20150316", reviewer = 3, vComment = {EType.RECEIVERCHECK, EType.INTENTCHECK})
/* compiled from: ProGuard */
public class XGNotifaction {
    private int f7246a;
    private Notification f7247b;
    private String f7248c;
    private String f7249d;
    private String f7250e;
    private Context f7251f;

    public XGNotifaction(Context context, int i, Notification notification, ProGuard proGuard) {
        this.f7246a = 0;
        this.f7247b = null;
        this.f7248c = null;
        this.f7249d = null;
        this.f7250e = null;
        this.f7251f = null;
        this.f7251f = context.getApplicationContext();
        this.f7246a = i;
        this.f7247b = notification;
        this.f7248c = proGuard.m4729e();
        this.f7249d = proGuard.m4730f();
        this.f7250e = proGuard.m4731g();
    }

    public void setNotifyId(int i) {
        this.f7246a = i;
    }

    public String toString() {
        return "XGNotifaction [notifyId=" + this.f7246a + ", title=" + this.f7248c + ", content=" + this.f7249d + ", customContent=" + this.f7250e + "]";
    }

    public boolean doNotify() {
        if (!(this.f7247b == null || this.f7251f == null)) {
            NotificationManager notificationManager = (NotificationManager) this.f7251f.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.notify(this.f7246a, this.f7247b);
                return true;
            }
        }
        return false;
    }

    public int getNotifyId() {
        return this.f7246a;
    }

    public Notification getNotifaction() {
        return this.f7247b;
    }

    public String getTitle() {
        return this.f7248c;
    }

    public String getContent() {
        return this.f7249d;
    }

    public String getCustomContent() {
        return this.f7250e;
    }
}
