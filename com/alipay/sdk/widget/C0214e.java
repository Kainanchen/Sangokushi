package com.alipay.sdk.widget;

import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;

/* renamed from: com.alipay.sdk.widget.e */
final class C0214e implements OnKeyListener {
    C0214e() {
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4) {
            return true;
        }
        return false;
    }
}