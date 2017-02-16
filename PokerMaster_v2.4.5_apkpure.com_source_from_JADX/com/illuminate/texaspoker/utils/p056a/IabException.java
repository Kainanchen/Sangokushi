package com.illuminate.texaspoker.utils.p056a;

/* renamed from: com.illuminate.texaspoker.utils.a.c */
public final class IabException extends Exception {
    IabResult f6601a;

    private IabException(IabResult iabResult) {
        this(iabResult, null);
    }

    public IabException(int i, String str) {
        this(new IabResult(i, str));
    }

    public IabException(int i, String str, Exception exception) {
        this(new IabResult(i, str), exception);
    }

    private IabException(IabResult iabResult, Exception exception) {
        super(iabResult.f6636b, exception);
        this.f6601a = iabResult;
    }
}
