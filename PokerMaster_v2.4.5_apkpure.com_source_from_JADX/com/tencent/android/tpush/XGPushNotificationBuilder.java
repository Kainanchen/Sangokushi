package com.tencent.android.tpush;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v4.app.NotificationCompat.BigTextStyle;
import android.support.v4.app.NotificationCompat.Builder;
import android.support.v4.app.NotificationCompat.Style;
import android.widget.RemoteViews;
import com.tencent.android.tpush.common.MessageKey;
import com.tencent.android.tpush.common.ProGuard;
import org.json.JSONObject;

/* compiled from: ProGuard */
public abstract class XGPushNotificationBuilder {
    public static final String BASIC_NOTIFICATION_BUILDER_TYPE = "basic";
    public static final String CUSTOM_NOTIFICATION_BUILDER_TYPE = "custom";
    protected Integer f7181a;
    protected PendingIntent f7182b;
    protected RemoteViews f7183c;
    protected Integer f7184d;
    protected PendingIntent f7185e;
    protected Integer f7186f;
    protected Integer f7187g;
    protected Integer f7188h;
    protected Integer f7189i;
    protected Integer f7190j;
    protected Integer f7191k;
    protected Integer f7192l;
    protected Uri f7193m;
    protected CharSequence f7194n;
    protected long[] f7195o;
    protected Long f7196p;
    protected Integer f7197q;
    protected Bitmap f7198r;
    protected Integer f7199s;
    protected String f7200t;
    protected Integer f7201u;

    protected abstract void m4658a(JSONObject jSONObject);

    protected abstract void m4659b(JSONObject jSONObject);

    public abstract Notification buildNotification(Context context);

    public abstract String getType();

    public XGPushNotificationBuilder() {
        this.f7181a = null;
        this.f7182b = null;
        this.f7183c = null;
        this.f7184d = null;
        this.f7185e = null;
        this.f7186f = null;
        this.f7187g = null;
        this.f7188h = null;
        this.f7189i = Integer.valueOf(-16711936);
        this.f7190j = Integer.valueOf(100);
        this.f7191k = Integer.valueOf(100);
        this.f7192l = null;
        this.f7193m = null;
        this.f7194n = null;
        this.f7195o = null;
        this.f7196p = null;
        this.f7197q = null;
        this.f7198r = null;
        this.f7199s = null;
        this.f7201u = null;
    }

    public void encode(JSONObject jSONObject) {
        m4658a(jSONObject);
        ProGuard.m4792a(jSONObject, "audioStringType", this.f7181a);
        ProGuard.m4792a(jSONObject, "defaults", this.f7184d);
        ProGuard.m4792a(jSONObject, "flags", this.f7186f);
        ProGuard.m4792a(jSONObject, MessageKey.MSG_ICON, this.f7187g);
        ProGuard.m4792a(jSONObject, "iconLevel", this.f7188h);
        ProGuard.m4792a(jSONObject, "ledARGB", this.f7189i);
        ProGuard.m4792a(jSONObject, "ledOffMS", this.f7190j);
        ProGuard.m4792a(jSONObject, "ledOnMS", this.f7191k);
        ProGuard.m4792a(jSONObject, "number", this.f7192l);
        ProGuard.m4792a(jSONObject, "sound", this.f7193m);
        ProGuard.m4792a(jSONObject, "smallIcon", this.f7197q);
        ProGuard.m4792a(jSONObject, "notificationLargeIcon", this.f7199s);
        if (this.f7195o != null) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < this.f7195o.length; i++) {
                stringBuilder.append(String.valueOf(this.f7195o[i]));
                if (i != this.f7195o.length - 1) {
                    stringBuilder.append(",");
                }
            }
            ProGuard.m4792a(jSONObject, MessageKey.MSG_VIBRATE, stringBuilder.toString());
        }
        ProGuard.m4792a(jSONObject, "notificationId", this.f7201u);
    }

    public void decode(String str) {
        JSONObject jSONObject = new JSONObject(str);
        m4659b(jSONObject);
        this.f7181a = (Integer) ProGuard.m4793b(jSONObject, "audioStringType", null);
        this.f7184d = (Integer) ProGuard.m4793b(jSONObject, "defaults", null);
        this.f7186f = (Integer) ProGuard.m4793b(jSONObject, "flags", null);
        this.f7187g = (Integer) ProGuard.m4793b(jSONObject, MessageKey.MSG_ICON, null);
        this.f7188h = (Integer) ProGuard.m4793b(jSONObject, "iconLevel", null);
        this.f7189i = (Integer) ProGuard.m4793b(jSONObject, "ledARGB", null);
        this.f7190j = (Integer) ProGuard.m4793b(jSONObject, "ledOffMS", null);
        this.f7191k = (Integer) ProGuard.m4793b(jSONObject, "ledOnMS", null);
        this.f7192l = (Integer) ProGuard.m4793b(jSONObject, "number", null);
        String str2 = (String) ProGuard.m4793b(jSONObject, "sound", null);
        this.f7197q = (Integer) ProGuard.m4793b(jSONObject, "smallIcon", null);
        this.f7199s = (Integer) ProGuard.m4793b(jSONObject, "notificationLargeIcon", null);
        if (str2 != null) {
            this.f7193m = Uri.parse(str2);
        }
        str2 = (String) ProGuard.m4793b(jSONObject, MessageKey.MSG_VIBRATE, null);
        if (str2 != null) {
            String[] split = str2.split(",");
            int length = split.length;
            this.f7195o = new long[length];
            for (int i = 0; i < length; i++) {
                try {
                    this.f7195o[i] = Long.valueOf(split[i]).longValue();
                } catch (NumberFormatException e) {
                }
            }
        }
        this.f7201u = (Integer) ProGuard.m4793b(jSONObject, "notificationId", null);
    }

    public String getTitle(Context context) {
        if (this.f7200t == null) {
            this.f7200t = (String) context.getApplicationContext().getPackageManager().getApplicationLabel(context.getApplicationInfo());
        }
        return this.f7200t;
    }

    public void setTitle(String str) {
        this.f7200t = str;
    }

    public int getApplicationIcon(Context context) {
        return context.getApplicationInfo().icon;
    }

    protected Notification m4657a(Context context) {
        Notification notification = new Notification();
        if (this.f7201u == null) {
            this.f7201u = Integer.valueOf(0);
        }
        Builder builder = new Builder(context);
        Style bigTextStyle = new BigTextStyle();
        if (this.f7197q != null) {
            builder.setSmallIcon(this.f7197q.intValue());
        }
        if (this.f7199s != null) {
            builder.setLargeIcon(BitmapFactory.decodeResource(context.getResources(), this.f7199s.intValue()));
        }
        if (this.f7198r != null) {
            builder.setLargeIcon(this.f7198r);
        }
        if (this.f7200t == null) {
            this.f7200t = getTitle(context);
        } else {
            builder.setContentTitle(this.f7200t);
        }
        if (this.f7194n == null || this.f7183c != null) {
            builder.setContentText(this.f7194n);
            builder.setTicker(this.f7194n);
        } else {
            bigTextStyle.bigText(this.f7194n);
            builder.setStyle(bigTextStyle);
            builder.setContentText(this.f7194n);
            builder.setTicker(this.f7194n);
        }
        notification = builder.build();
        if (this.f7181a != null) {
            notification.audioStreamType = this.f7181a.intValue();
        }
        if (this.f7182b != null) {
            notification.contentIntent = this.f7182b;
        }
        if (this.f7183c != null) {
            notification.contentView = this.f7183c;
        }
        if (this.f7184d != null) {
            notification.defaults = this.f7184d.intValue();
        }
        if (this.f7187g != null) {
            notification.icon = this.f7187g.intValue();
        }
        if (this.f7185e != null) {
            notification.deleteIntent = this.f7185e;
        }
        if (this.f7186f != null) {
            notification.flags = this.f7186f.intValue();
        } else {
            notification.flags = 16;
        }
        if (this.f7188h != null) {
            notification.iconLevel = this.f7188h.intValue();
        }
        if (this.f7189i != null) {
            notification.ledARGB = this.f7189i.intValue();
        }
        if (this.f7190j != null) {
            notification.ledOffMS = this.f7190j.intValue();
        }
        if (this.f7191k != null) {
            notification.ledOnMS = this.f7191k.intValue();
        }
        if (this.f7192l != null) {
            notification.number = this.f7192l.intValue();
        }
        if (this.f7193m != null) {
            notification.sound = this.f7193m;
        }
        if (this.f7195o != null) {
            notification.vibrate = this.f7195o;
        }
        if (this.f7196p != null) {
            notification.when = this.f7196p.longValue();
        } else {
            notification.when = System.currentTimeMillis();
        }
        return notification;
    }

    public int getAudioStringType() {
        return this.f7181a.intValue();
    }

    public XGPushNotificationBuilder setAudioStringType(int i) {
        this.f7181a = Integer.valueOf(i);
        return this;
    }

    public PendingIntent getContentIntent() {
        return this.f7182b;
    }

    public XGPushNotificationBuilder setContentIntent(PendingIntent pendingIntent) {
        this.f7182b = pendingIntent;
        return this;
    }

    public XGPushNotificationBuilder setContentView(RemoteViews remoteViews) {
        this.f7183c = remoteViews;
        return this;
    }

    public int getDefaults() {
        return this.f7184d.intValue();
    }

    public XGPushNotificationBuilder setDefaults(int i) {
        if (this.f7184d == null) {
            this.f7184d = Integer.valueOf(i);
        } else {
            this.f7184d = Integer.valueOf(this.f7184d.intValue() | i);
        }
        return this;
    }

    public int getFlags() {
        return this.f7186f.intValue();
    }

    public XGPushNotificationBuilder setFlags(int i) {
        if (this.f7186f == null) {
            this.f7186f = Integer.valueOf(i);
        } else {
            this.f7186f = Integer.valueOf(this.f7186f.intValue() | i);
        }
        return this;
    }

    public Integer getIcon() {
        return this.f7187g;
    }

    public XGPushNotificationBuilder setIcon(Integer num) {
        this.f7187g = num;
        return this;
    }

    public Integer getSmallIcon() {
        return this.f7197q;
    }

    public XGPushNotificationBuilder setSmallIcon(Integer num) {
        this.f7197q = num;
        return this;
    }

    public Bitmap getLargeIcon() {
        return this.f7198r;
    }

    public XGPushNotificationBuilder setLargeIcon(Bitmap bitmap) {
        this.f7198r = bitmap;
        return this;
    }

    public XGPushNotificationBuilder setNotificationLargeIcon(int i) {
        this.f7199s = Integer.valueOf(i);
        return this;
    }

    public Integer getNotificationLargeIcon() {
        return this.f7199s;
    }

    public int getIconLevel() {
        return this.f7188h.intValue();
    }

    public XGPushNotificationBuilder setIconLevel(int i) {
        this.f7188h = Integer.valueOf(i);
        return this;
    }

    public int getLedARGB() {
        return this.f7189i.intValue();
    }

    public XGPushNotificationBuilder setLedARGB(int i) {
        this.f7189i = Integer.valueOf(i);
        return this;
    }

    public int getLedOffMS() {
        return this.f7190j.intValue();
    }

    public XGPushNotificationBuilder setLedOffMS(int i) {
        this.f7190j = Integer.valueOf(i);
        return this;
    }

    public int getLedOnMS() {
        return this.f7191k.intValue();
    }

    public XGPushNotificationBuilder setLedOnMS(int i) {
        this.f7191k = Integer.valueOf(i);
        return this;
    }

    public int getNumber() {
        return this.f7192l.intValue();
    }

    public XGPushNotificationBuilder setNumber(int i) {
        this.f7192l = Integer.valueOf(i);
        return this;
    }

    public Uri getSound() {
        return this.f7193m;
    }

    public XGPushNotificationBuilder setSound(Uri uri) {
        this.f7193m = uri;
        return this;
    }

    public CharSequence getTickerText() {
        return this.f7194n;
    }

    public XGPushNotificationBuilder setTickerText(CharSequence charSequence) {
        this.f7194n = charSequence;
        return this;
    }

    public long[] getVibrate() {
        return this.f7195o;
    }

    public XGPushNotificationBuilder setVibrate(long[] jArr) {
        this.f7195o = jArr;
        return this;
    }

    public long getWhen() {
        return this.f7196p.longValue();
    }

    public XGPushNotificationBuilder setWhen(long j) {
        this.f7196p = Long.valueOf(j);
        return this;
    }
}
