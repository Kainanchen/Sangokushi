package com.tencent.open.p066c;

import android.content.Context;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.tencent.open.web.security.SecureJsInterface;
import com.tencent.wxop.stat.StatAccount;

/* renamed from: com.tencent.open.c.c */
public class ProGuard extends ProGuard {
    public static boolean f1694a;
    private KeyEvent f1695b;
    private com.tencent.open.web.security.ProGuard f1696c;

    public ProGuard(Context context) {
        super(context);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        com.tencent.open.p067a.ProGuard.m2117b("openSDK_LOG.SecureWebView", "-->dispatchKeyEvent, is device support: " + f1694a);
        if (!f1694a) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        switch (keyEvent.getKeyCode()) {
            case StatAccount.WECHAT_OPENID_TYPE /*4*/:
                return super.dispatchKeyEvent(keyEvent);
            case 66:
                return super.dispatchKeyEvent(keyEvent);
            case 67:
                com.tencent.open.web.security.ProGuard.f1754b = true;
                return super.dispatchKeyEvent(keyEvent);
            default:
                if (keyEvent.getUnicodeChar() == 0) {
                    return super.dispatchKeyEvent(keyEvent);
                }
                if (SecureJsInterface.isPWDEdit) {
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((unicodeChar >= 33 && unicodeChar <= 95) || (unicodeChar >= 97 && unicodeChar <= 125)) {
                        this.f1695b = new KeyEvent(0, 17);
                        return super.dispatchKeyEvent(this.f1695b);
                    }
                }
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        com.tencent.open.p067a.ProGuard.m2117b("openSDK_LOG.SecureWebView", "-->onKeyDown, is device support: " + f1694a);
        if (!f1694a) {
            return super.onKeyDown(i, keyEvent);
        }
        if (keyEvent.getAction() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        switch (keyEvent.getKeyCode()) {
            case StatAccount.WECHAT_OPENID_TYPE /*4*/:
                return super.onKeyDown(i, keyEvent);
            case 66:
                return super.onKeyDown(i, keyEvent);
            case 67:
                com.tencent.open.web.security.ProGuard.f1754b = true;
                return super.onKeyDown(i, keyEvent);
            default:
                if (keyEvent.getUnicodeChar() == 0) {
                    return super.onKeyDown(i, keyEvent);
                }
                if (SecureJsInterface.isPWDEdit) {
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((unicodeChar >= 33 && unicodeChar <= 95) || (unicodeChar >= 97 && unicodeChar <= 125)) {
                        this.f1695b = new KeyEvent(0, 17);
                        return super.onKeyDown(this.f1695b.getKeyCode(), this.f1695b);
                    }
                }
                return super.onKeyDown(i, keyEvent);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.SecureWebView", "-->create input connection, is edit: " + SecureJsInterface.isPWDEdit);
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        com.tencent.open.p067a.ProGuard.m2114a("openSDK_LOG.SecureWebView", "-->onCreateInputConnection, inputConn is " + onCreateInputConnection);
        if (onCreateInputConnection != null) {
            f1694a = true;
            this.f1696c = new com.tencent.open.web.security.ProGuard(super.onCreateInputConnection(editorInfo), false);
            return this.f1696c;
        }
        f1694a = false;
        return onCreateInputConnection;
    }
}
