package com.facebook;

/* renamed from: com.facebook.h */
public final class FacebookDialogException extends FacebookException {
    private int f1779a;
    private String f1780b;

    public FacebookDialogException(String str, int i, String str2) {
        super(str);
        this.f1779a = i;
        this.f1780b = str2;
    }

    public final String toString() {
        return "{FacebookDialogException: errorCode: " + this.f1779a + ", message: " + getMessage() + ", url: " + this.f1780b + "}";
    }
}
