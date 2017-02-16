package com.facebook;

/* renamed from: com.facebook.o */
public final class FacebookServiceException extends FacebookException {
    public final FacebookRequestError f2690a;

    public FacebookServiceException(FacebookRequestError facebookRequestError, String str) {
        super(str);
        this.f2690a = facebookRequestError;
    }

    public final String toString() {
        return "{FacebookServiceException: httpResponseCode: " + this.f2690a.f2651b + ", facebookErrorCode: " + this.f2690a.f2652c + ", facebookErrorType: " + this.f2690a.f2654e + ", message: " + this.f2690a.m2573a() + "}";
    }
}
