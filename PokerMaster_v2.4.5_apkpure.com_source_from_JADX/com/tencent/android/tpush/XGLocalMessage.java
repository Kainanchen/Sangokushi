package com.tencent.android.tpush;

import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.service.p077d.ProGuard;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: ProGuard */
public class XGLocalMessage {
    private static final String f7220a;
    private int f7221b;
    private String f7222c;
    private String f7223d;
    private String f7224e;
    private String f7225f;
    private String f7226g;
    private int f7227h;
    private int f7228i;
    private int f7229j;
    private int f7230k;
    private int f7231l;
    private String f7232m;
    private String f7233n;
    private String f7234o;
    private int f7235p;
    private String f7236q;
    private String f7237r;
    private String f7238s;
    private String f7239t;
    private String f7240u;
    private String f7241v;
    private long f7242w;
    private int f7243x;
    private int f7244y;
    private long f7245z;

    public XGLocalMessage() {
        this.f7221b = 1;
        this.f7222c = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f7223d = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f7224e = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f7225f = "00";
        this.f7226g = "00";
        this.f7227h = 1;
        this.f7228i = 1;
        this.f7229j = 1;
        this.f7230k = 0;
        this.f7231l = 1;
        this.f7232m = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f7233n = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f7234o = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f7235p = 1;
        this.f7236q = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f7237r = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f7238s = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f7239t = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f7240u = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f7241v = "{}";
        this.f7243x = 0;
        this.f7244y = 2592000;
        this.f7245z = System.currentTimeMillis() + (((long) this.f7244y) * 1000);
    }

    static {
        f7220a = XGLocalMessage.class.getSimpleName();
    }

    public long getExpirationTimeMs() {
        return this.f7245z;
    }

    public void setExpirationTimeMs(long j) {
        if (j > System.currentTimeMillis()) {
            this.f7244y = (int) ((j - System.currentTimeMillis()) / 1000);
            if (this.f7244y < 0) {
                this.f7244y = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            }
            this.f7245z = j;
        }
    }

    public int getTtl() {
        return this.f7244y;
    }

    public int getType() {
        return this.f7221b;
    }

    public void setType(int i) {
        this.f7221b = i;
    }

    public String getTitle() {
        return this.f7222c;
    }

    public void setTitle(String str) {
        this.f7222c = str;
    }

    public String getContent() {
        return this.f7223d;
    }

    public void setContent(String str) {
        this.f7223d = str;
    }

    public void setCustomContent(HashMap hashMap) {
        this.f7241v = new JSONObject(hashMap).toString();
    }

    public String getCustom_content() {
        return this.f7241v;
    }

    public String getHour() {
        if (this.f7225f.length() <= 0) {
            return "00";
        }
        if (this.f7225f.length() <= 0 || this.f7225f.length() >= 2) {
            return this.f7225f;
        }
        return "0" + this.f7225f;
    }

    public void setHour(String str) {
        this.f7225f = str;
    }

    public String getMin() {
        if (this.f7226g.length() <= 0) {
            return "00";
        }
        if (this.f7226g.length() <= 0 || this.f7226g.length() >= 2) {
            return this.f7226g;
        }
        return "0" + this.f7226g;
    }

    public void setMin(String str) {
        this.f7226g = str;
    }

    public long getBuilderId() {
        return this.f7242w;
    }

    public void setBuilderId(long j) {
        this.f7242w = j;
    }

    public String getDate() {
        if (!ProGuard.m5317a(this.f7224e)) {
            try {
                this.f7224e = this.f7224e.substring(0, 8);
                Long.parseLong(this.f7224e);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
                simpleDateFormat.setLenient(false);
                simpleDateFormat.parse(this.f7224e);
            } catch (Throwable e) {
                com.tencent.android.tpush.p067a.ProGuard.m4716c(f7220a, "XGLocalMessage.getDate()", e);
                return new SimpleDateFormat("yyyyMMdd").format(new Date());
            } catch (Throwable e2) {
                com.tencent.android.tpush.p067a.ProGuard.m4716c(f7220a, "XGLocalMessage.getDate()", e2);
                return new SimpleDateFormat("yyyyMMdd").format(new Date());
            }
        }
        return this.f7224e;
    }

    public void setDate(String str) {
        this.f7224e = str;
    }

    public void setRing(int i) {
        this.f7227h = i;
    }

    public int getRing() {
        return this.f7227h;
    }

    public void setVibrate(int i) {
        this.f7228i = i;
    }

    public int getVibrate() {
        return this.f7228i;
    }

    public void setLights(int i) {
        this.f7229j = i;
    }

    public int getLights() {
        return this.f7229j;
    }

    public void setIcon_type(int i) {
        this.f7230k = i;
    }

    public int getIcon_type() {
        return this.f7230k;
    }

    public void setStyle_id(int i) {
        this.f7231l = i;
    }

    public int getStyle_id() {
        return this.f7231l;
    }

    public void setRing_raw(String str) {
        this.f7232m = str;
    }

    public String getRing_raw() {
        return this.f7232m;
    }

    public void setIcon_res(String str) {
        this.f7233n = str;
    }

    public String getIcon_res() {
        return this.f7233n;
    }

    public void setSmall_icon(String str) {
        this.f7234o = str;
    }

    public String getSmall_icon() {
        return this.f7234o;
    }

    public void setAction_type(int i) {
        this.f7235p = i;
    }

    public int getAction_type() {
        return this.f7235p;
    }

    public void setActivity(String str) {
        this.f7236q = str;
    }

    public String getActivity() {
        return this.f7236q;
    }

    public void setUrl(String str) {
        this.f7237r = str;
    }

    public String getUrl() {
        return this.f7237r;
    }

    public void setIntent(String str) {
        this.f7238s = str;
    }

    public String getIntent() {
        return this.f7238s;
    }

    public void setPackageDownloadUrl(String str) {
        this.f7239t = str;
    }

    public String getPackageDownloadUrl() {
        return this.f7239t;
    }

    public void setPackageName(String str) {
        this.f7240u = str;
    }

    public String getPackageName() {
        return this.f7240u;
    }

    public int getNotificationId() {
        return this.f7243x;
    }

    public void setNotificationId(int i) {
        this.f7243x = i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("XGLocalMessage [type=").append(this.f7221b).append(", title=").append(this.f7222c).append(", content=").append(this.f7223d).append(", date=").append(this.f7224e).append(", hour=").append(this.f7225f).append(", min=").append(this.f7226g).append(", builderId=").append(this.f7242w).append("]");
        return stringBuilder.toString();
    }
}
