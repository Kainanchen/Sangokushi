package com.tencent.android.tpush.p068b;

import android.content.Context;
import android.content.Intent;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.XGPushManager;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.common.MessageKey;
import com.tencent.android.tpush.encrypt.Rijndael;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: com.tencent.android.tpush.b.i */
public class ProGuard {
    private long f7363a;
    private long f7364b;
    private long f7365c;
    private String f7366d;
    private long f7367e;
    private long f7368f;
    private Context f7369g;
    private Intent f7370h;
    private ProGuard f7371i;

    private ProGuard(Context context, Intent intent) {
        this.f7363a = -1;
        this.f7364b = -1;
        this.f7365c = -1;
        this.f7366d = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f7367e = -1;
        this.f7368f = -1;
        this.f7369g = null;
        this.f7370h = null;
        this.f7371i = null;
        this.f7369g = context;
        this.f7370h = intent;
    }

    public static ProGuard m4765a(Context context, Intent intent) {
        ProGuard proGuard = new ProGuard(context, intent);
        String decrypt = Rijndael.decrypt(intent.getStringExtra(MessageKey.MSG_CONTENT));
        proGuard.f7366d = decrypt;
        proGuard.f7363a = intent.getLongExtra(MessageKey.MSG_ID, -1);
        proGuard.f7364b = intent.getLongExtra(MessageKey.MSG_ACCESS_ID, -1);
        proGuard.f7365c = intent.getLongExtra(MessageKey.MSG_BUSI_MSG_ID, -1);
        proGuard.f7367e = intent.getLongExtra(MessageKey.MSG_CREATE_TIMESTAMPS, -1);
        proGuard.f7368f = intent.getLongExtra(MessageKey.MSG_TYPE, -1);
        ProGuard proGuard2 = null;
        switch ((int) proGuard.f7368f) {
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                proGuard2 = new ProGuard(decrypt);
                break;
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                proGuard2 = new ProGuard(decrypt);
                break;
            case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                com.tencent.android.tpush.service.p072b.ProGuard.m5021a().m5050a(context, context.getPackageName(), decrypt);
                XGPushManager.msgAck(context, proGuard);
                break;
            default:
                com.tencent.android.tpush.p067a.ProGuard.m4723h(Constants.LogTag, "error type for message, drop it, type:" + proGuard.f7368f + ",intent:" + intent);
                XGPushManager.msgAck(context, proGuard);
                break;
        }
        if (proGuard2 != null) {
            proGuard.f7371i = proGuard2;
            proGuard.f7371i.m4726b();
        }
        return proGuard;
    }

    public void m4766a() {
        if (this.f7371i.m4727c() == 1) {
            ProGuard.m4741b(this.f7369g, this);
        }
    }

    public long m4767b() {
        return this.f7363a;
    }

    public long m4768c() {
        return this.f7364b;
    }

    public long m4769d() {
        return this.f7365c;
    }

    public long m4770e() {
        return this.f7367e;
    }

    public String m4771f() {
        return this.f7366d;
    }

    public ProGuard m4772g() {
        return this.f7371i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PushMessageManager [msgId=").append(this.f7363a).append(", accessId=").append(this.f7364b).append(", busiMsgId=").append(this.f7365c).append(", content=").append(this.f7366d).append(", timestamps=").append(this.f7367e).append(", type=").append(this.f7368f).append(", intent=").append(this.f7370h).append(", messageHolder=").append(this.f7371i).append("]");
        return stringBuilder.toString();
    }
}
