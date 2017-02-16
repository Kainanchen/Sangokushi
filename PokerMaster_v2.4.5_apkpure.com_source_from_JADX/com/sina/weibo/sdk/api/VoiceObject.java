package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.sina.weibo.sdk.utils.LogUtil;
import org.json.JSONException;
import org.json.JSONObject;

public class VoiceObject extends BaseMediaObject {
    public static final Creator<VoiceObject> CREATOR;
    public static final String EXTRA_KEY_DEFAULTTEXT = "extra_key_defaulttext";
    public String dataHdUrl;
    public String dataUrl;
    public String defaultText;
    public int duration;
    public String h5Url;

    /* renamed from: com.sina.weibo.sdk.api.VoiceObject.1 */
    class C09881 implements Creator<VoiceObject> {
        C09881() {
        }

        public VoiceObject createFromParcel(Parcel parcel) {
            return new VoiceObject(parcel);
        }

        public VoiceObject[] newArray(int i) {
            return new VoiceObject[i];
        }
    }

    static {
        CREATOR = new C09881();
    }

    public VoiceObject(Parcel parcel) {
        super(parcel);
        this.h5Url = parcel.readString();
        this.dataUrl = parcel.readString();
        this.dataHdUrl = parcel.readString();
        this.duration = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.h5Url);
        parcel.writeString(this.dataUrl);
        parcel.writeString(this.dataHdUrl);
        parcel.writeInt(this.duration);
    }

    public boolean checkArgs() {
        if (!super.checkArgs()) {
            return false;
        }
        if (this.dataUrl != null && this.dataUrl.length() > AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY) {
            LogUtil.m4622e("Weibo.VoiceObject", "checkArgs fail, dataUrl is invalid");
            return false;
        } else if (this.dataHdUrl != null && this.dataHdUrl.length() > AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY) {
            LogUtil.m4622e("Weibo.VoiceObject", "checkArgs fail, dataHdUrl is invalid");
            return false;
        } else if (this.duration > 0) {
            return true;
        } else {
            LogUtil.m4622e("Weibo.VoiceObject", "checkArgs fail, duration is invalid");
            return false;
        }
    }

    public int getObjType() {
        return 6;
    }

    protected BaseMediaObject toExtraMediaObject(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                this.defaultText = new JSONObject(str).optString(EXTRA_KEY_DEFAULTTEXT);
            } catch (JSONException e) {
            }
        }
        return this;
    }

    protected String toExtraMediaString() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(this.defaultText)) {
                jSONObject.put(EXTRA_KEY_DEFAULTTEXT, this.defaultText);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
    }
}
