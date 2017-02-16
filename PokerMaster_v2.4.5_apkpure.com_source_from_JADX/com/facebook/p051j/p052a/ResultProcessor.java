package com.facebook.p051j.p052a;

import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;

/* renamed from: com.facebook.j.a.g */
public abstract class ResultProcessor {
    private FacebookCallback f2529a;

    public abstract void m2457a(Bundle bundle);

    public ResultProcessor(FacebookCallback facebookCallback) {
        this.f2529a = facebookCallback;
    }

    public void m2456a() {
    }

    public void m2458a(FacebookException facebookException) {
        if (this.f2529a != null) {
            this.f2529a.m1470a(facebookException);
        }
    }
}
