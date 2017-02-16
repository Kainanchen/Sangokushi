package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;

public class CmdObject extends BaseMediaObject {
    public static final String CMD_HOME = "home";
    public static final Creator<CmdObject> CREATOR;
    public String cmd;

    /* renamed from: com.sina.weibo.sdk.api.CmdObject.1 */
    class C09831 implements Creator<CmdObject> {
        C09831() {
        }

        public CmdObject createFromParcel(Parcel parcel) {
            return new CmdObject(parcel);
        }

        public CmdObject[] newArray(int i) {
            return new CmdObject[i];
        }
    }

    static {
        CREATOR = new C09831();
    }

    public CmdObject(Parcel parcel) {
        this.cmd = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cmd);
    }

    public boolean checkArgs() {
        if (this.cmd == null || this.cmd.length() == 0 || this.cmd.length() > AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT) {
            return false;
        }
        return true;
    }

    public int getObjType() {
        return 7;
    }

    protected BaseMediaObject toExtraMediaObject(String str) {
        return this;
    }

    protected String toExtraMediaString() {
        return LetterIndexBar.SEARCH_ICON_LETTER;
    }
}
