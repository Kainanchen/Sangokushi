package com.loopj.android.http;

public interface LogInterface {
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    public static final int WTF = 8;

    void m1882d(String str, String str2);

    void m1883d(String str, String str2, Throwable th);

    void m1884e(String str, String str2);

    void m1885e(String str, String str2, Throwable th);

    int getLoggingLevel();

    void m1886i(String str, String str2);

    void m1887i(String str, String str2, Throwable th);

    boolean isLoggingEnabled();

    void setLoggingEnabled(boolean z);

    void setLoggingLevel(int i);

    boolean shouldLog(int i);

    void m1888v(String str, String str2);

    void m1889v(String str, String str2, Throwable th);

    void m1890w(String str, String str2);

    void m1891w(String str, String str2, Throwable th);

    void wtf(String str, String str2);

    void wtf(String str, String str2, Throwable th);
}
