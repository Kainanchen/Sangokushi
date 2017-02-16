package com.facebook.p004a.p005a;

/* renamed from: com.facebook.a.a.e */
final class SourceApplicationInfo {
    String f856a;
    boolean f857b;

    SourceApplicationInfo(String str, boolean z) {
        this.f856a = str;
        this.f857b = z;
    }

    public final String toString() {
        String str = "Unclassified";
        if (this.f857b) {
            str = "Applink";
        }
        if (this.f856a != null) {
            return str + "(" + this.f856a + ")";
        }
        return str;
    }
}
