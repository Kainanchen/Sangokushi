package com.facebook.p004a;

import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.p036h.af;
import java.io.Serializable;

/* renamed from: com.facebook.a.a */
final class AccessTokenAppIdPair implements Serializable {
    final String f858a;
    final String f859b;

    /* renamed from: com.facebook.a.a.a */
    static class AccessTokenAppIdPair implements Serializable {
        private final String f821a;
        private final String f822b;

        private AccessTokenAppIdPair(String str, String str2) {
            this.f821a = str;
            this.f822b = str2;
        }

        private Object readResolve() {
            return new AccessTokenAppIdPair(this.f821a, this.f822b);
        }
    }

    public AccessTokenAppIdPair(String str, String str2) {
        if (af.m1523a(str)) {
            str = null;
        }
        this.f858a = str;
        this.f859b = str2;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = this.f858a == null ? 0 : this.f858a.hashCode();
        if (this.f859b != null) {
            i = this.f859b.hashCode();
        }
        return hashCode ^ i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AccessTokenAppIdPair)) {
            return false;
        }
        AccessTokenAppIdPair accessTokenAppIdPair = (AccessTokenAppIdPair) obj;
        if (af.m1522a(accessTokenAppIdPair.f858a, this.f858a) && af.m1522a(accessTokenAppIdPair.f859b, this.f859b)) {
            return true;
        }
        return false;
    }

    private Object writeReplace() {
        return new AccessTokenAppIdPair(this.f859b, (byte) 0);
    }

    public AccessTokenAppIdPair(AccessToken accessToken) {
        this(accessToken.f922d, FacebookSdk.m2590j());
    }
}
