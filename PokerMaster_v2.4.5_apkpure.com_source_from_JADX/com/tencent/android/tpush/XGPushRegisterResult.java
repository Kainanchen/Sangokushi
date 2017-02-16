package com.tencent.android.tpush;

import android.content.Intent;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.common.MessageKey;

/* compiled from: ProGuard */
public class XGPushRegisterResult implements XGIResult {
    long f7266a;
    String f7267b;
    String f7268c;
    String f7269d;
    short f7270e;
    String f7271f;

    public long getAccessId() {
        return this.f7266a;
    }

    public String getDeviceId() {
        return this.f7267b;
    }

    public String getAccount() {
        return this.f7268c;
    }

    public String getTicket() {
        return this.f7269d;
    }

    public short getTicketType() {
        return this.f7270e;
    }

    public String getToken() {
        return this.f7271f;
    }

    XGPushRegisterResult() {
        this.f7266a = 0;
        this.f7267b = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f7268c = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f7269d = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f7270e = (short) 0;
        this.f7271f = LetterIndexBar.SEARCH_ICON_LETTER;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TPushRegisterMessage [accessId=").append(this.f7266a).append(", deviceId=").append(this.f7267b).append(", account=").append(this.f7268c).append(", ticket=").append(this.f7269d).append(", ticketType=").append(this.f7270e).append(", token=").append(this.f7271f).append("]");
        return stringBuilder.toString();
    }

    public void parseIntent(Intent intent) {
        this.f7266a = intent.getLongExtra(MessageKey.MSG_ACCESS_ID, -1);
        this.f7267b = intent.getStringExtra(Constants.FLAG_DEVICE_ID);
        this.f7268c = intent.getStringExtra(Constants.FLAG_ACCOUNT);
        this.f7269d = intent.getStringExtra(Constants.FLAG_TICKET);
        this.f7270e = intent.getShortExtra(Constants.FLAG_TICKET_TYPE, (short) 0);
        this.f7271f = intent.getStringExtra(Constants.FLAG_TOKEN);
    }
}
