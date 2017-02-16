package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.sina.weibo.sdk.utils.LogUtil;

public class TextObject extends BaseMediaObject {
    public static final Creator<TextObject> CREATOR;
    public String text;

    /* renamed from: com.sina.weibo.sdk.api.TextObject.1 */
    class C09861 implements Creator<TextObject> {
        C09861() {
        }

        public TextObject createFromParcel(Parcel parcel) {
            return new TextObject(parcel);
        }

        public TextObject[] newArray(int i) {
            return new TextObject[i];
        }
    }

    public TextObject(Parcel parcel) {
        this.text = parcel.readString();
    }

    static {
        CREATOR = new C09861();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
    }

    public boolean checkArgs() {
        if (this.text != null && this.text.length() != 0 && this.text.length() <= AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT) {
            return true;
        }
        LogUtil.m4622e("Weibo.TextObject", "checkArgs fail, text is invalid");
        return false;
    }

    public int getObjType() {
        return 1;
    }

    protected BaseMediaObject toExtraMediaObject(String str) {
        return this;
    }

    protected String toExtraMediaString() {
        return LetterIndexBar.SEARCH_ICON_LETTER;
    }
}
