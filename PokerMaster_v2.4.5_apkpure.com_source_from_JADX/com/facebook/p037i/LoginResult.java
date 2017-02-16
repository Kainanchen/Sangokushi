package com.facebook.p037i;

import com.facebook.AccessToken;
import java.util.Set;

/* renamed from: com.facebook.i.o */
public final class LoginResult {
    final Set<String> f1886a;
    private final AccessToken f1887b;
    private final Set<String> f1888c;

    public LoginResult(AccessToken accessToken, Set<String> set, Set<String> set2) {
        this.f1887b = accessToken;
        this.f1886a = set;
        this.f1888c = set2;
    }
}
