package com.illuminate.texaspoker.utils.p056a;

/* renamed from: com.illuminate.texaspoker.utils.a.e */
public final class IabResult {
    public int f6635a;
    public String f6636b;

    public IabResult(int i, String str) {
        this.f6635a = i;
        if (str == null || str.trim().length() == 0) {
            this.f6636b = IabHelper.m4215a(i);
        } else {
            this.f6636b = str + " (response: " + IabHelper.m4215a(i) + ")";
        }
    }

    public final boolean m4226a() {
        return this.f6635a == 0;
    }

    public final boolean m4227b() {
        return !m4226a();
    }

    public final String toString() {
        return "IabResult: " + this.f6636b;
    }
}
