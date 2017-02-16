package com.facebook;

/* renamed from: com.facebook.j */
public final class FacebookGraphResponseException extends FacebookException {
    private final GraphResponse f2643a;

    public FacebookGraphResponseException(GraphResponse graphResponse, String str) {
        super(str);
        this.f2643a = graphResponse;
    }

    public final String toString() {
        FacebookRequestError facebookRequestError;
        if (this.f2643a != null) {
            facebookRequestError = this.f2643a.f2736b;
        } else {
            facebookRequestError = null;
        }
        StringBuilder stringBuilder = new StringBuilder("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            stringBuilder.append(message);
            stringBuilder.append(" ");
        }
        if (facebookRequestError != null) {
            stringBuilder.append("httpResponseCode: ").append(facebookRequestError.f2651b).append(", facebookErrorCode: ").append(facebookRequestError.f2652c).append(", facebookErrorType: ").append(facebookRequestError.f2654e).append(", message: ").append(facebookRequestError.m2573a()).append("}");
        }
        return stringBuilder.toString();
    }
}
