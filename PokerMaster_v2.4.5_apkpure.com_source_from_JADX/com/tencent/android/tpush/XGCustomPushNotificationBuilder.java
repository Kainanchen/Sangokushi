package com.tencent.android.tpush;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.tencent.android.tpush.common.ProGuard;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONObject;

/* compiled from: ProGuard */
public class XGCustomPushNotificationBuilder extends XGPushNotificationBuilder {
    private Integer f7202A;
    private Integer f7203B;
    private Bitmap f7204C;
    private Integer f7205v;
    private Integer f7206w;
    private Integer f7207x;
    private Integer f7208y;
    private Integer f7209z;

    public XGCustomPushNotificationBuilder() {
        this.f7205v = null;
        this.f7206w = null;
        this.f7207x = null;
        this.f7208y = null;
        this.f7209z = null;
        this.f7202A = null;
        this.f7203B = null;
        this.f7204C = null;
    }

    protected void m4662a(JSONObject jSONObject) {
        ProGuard.m4792a(jSONObject, "layoutId", this.f7205v);
        ProGuard.m4792a(jSONObject, "layoutIconId", this.f7206w);
        ProGuard.m4792a(jSONObject, "layoutTitleId", this.f7207x);
        ProGuard.m4792a(jSONObject, "layoutTextId", this.f7208y);
        ProGuard.m4792a(jSONObject, "layoutIconDrawableId", this.f7209z);
        ProGuard.m4792a(jSONObject, "statusBarIconDrawableId", this.f7202A);
        ProGuard.m4792a(jSONObject, "layoutTimeId", this.f7203B);
    }

    protected void m4663b(JSONObject jSONObject) {
        this.f7205v = (Integer) ProGuard.m4793b(jSONObject, "layoutId", null);
        this.f7206w = (Integer) ProGuard.m4793b(jSONObject, "layoutIconId", null);
        this.f7207x = (Integer) ProGuard.m4793b(jSONObject, "layoutTitleId", null);
        this.f7208y = (Integer) ProGuard.m4793b(jSONObject, "layoutTextId", null);
        this.f7209z = (Integer) ProGuard.m4793b(jSONObject, "layoutIconDrawableId", null);
        this.f7202A = (Integer) ProGuard.m4793b(jSONObject, "statusBarIconDrawableId", null);
        this.f7203B = (Integer) ProGuard.m4793b(jSONObject, "layoutTimeId", null);
    }

    public Notification buildNotification(Context context) {
        if (this.f7205v == null) {
            return m4657a(context);
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), this.f7205v.intValue());
        if (this.f7207x != null) {
            remoteViews.setTextViewText(this.f7207x.intValue(), getTitle(context));
        }
        if (this.f7208y != null) {
            remoteViews.setTextViewText(this.f7208y.intValue(), this.n);
        }
        if (this.f7206w != null) {
            remoteViews.setImageViewResource(this.f7206w.intValue(), this.f7209z.intValue());
        }
        if (this.f7204C != null) {
            remoteViews.setImageViewBitmap(this.f7206w.intValue(), this.f7204C);
        }
        if (this.f7202A != null) {
            remoteViews.setTextViewText(this.f7202A.intValue(), getTitle(context));
        }
        if (this.f7203B != null) {
            remoteViews.setTextViewText(this.f7203B.intValue(), String.valueOf(new SimpleDateFormat("HH:mm").format(new Date(System.currentTimeMillis()))));
        }
        this.c = remoteViews;
        return m4657a(context);
    }

    public int getLayoutId() {
        return this.f7205v.intValue();
    }

    public XGCustomPushNotificationBuilder setLayoutId(int i) {
        this.f7205v = Integer.valueOf(i);
        return this;
    }

    public Integer getLayoutIconId() {
        return this.f7206w;
    }

    public XGCustomPushNotificationBuilder setLayoutIconId(int i) {
        this.f7206w = Integer.valueOf(i);
        return this;
    }

    public int getLayoutTitleId() {
        return this.f7207x.intValue();
    }

    public XGCustomPushNotificationBuilder setLayoutTitleId(int i) {
        this.f7207x = Integer.valueOf(i);
        return this;
    }

    public int getLayoutTextId() {
        return this.f7208y.intValue();
    }

    public int getLayoutTimeId() {
        return this.f7203B.intValue();
    }

    public XGCustomPushNotificationBuilder setLayoutTextId(int i) {
        this.f7208y = Integer.valueOf(i);
        return this;
    }

    public XGCustomPushNotificationBuilder setLayoutTimeId(int i) {
        this.f7203B = Integer.valueOf(i);
        return this;
    }

    public int getLayoutIconDrawableId() {
        return this.f7209z.intValue();
    }

    public XGCustomPushNotificationBuilder setLayoutIconDrawableId(int i) {
        this.f7209z = Integer.valueOf(i);
        return this;
    }

    public XGCustomPushNotificationBuilder setLayoutIconDrawableBmp(Bitmap bitmap) {
        this.f7204C = bitmap;
        return this;
    }

    public String getType() {
        return XGPushNotificationBuilder.CUSTOM_NOTIFICATION_BUILDER_TYPE;
    }
}
