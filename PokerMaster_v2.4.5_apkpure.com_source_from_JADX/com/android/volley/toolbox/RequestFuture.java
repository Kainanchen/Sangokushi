package com.android.volley.toolbox;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.android.volley.Request;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class RequestFuture<T> implements ErrorListener, Listener<T>, Future<T> {
    private VolleyError mException;
    private Request<?> mRequest;
    private T mResult;
    private boolean mResultReceived;

    static {
        fixHelper.fixfunc(new int[]{1847, 1848, 1849, 1850, 1851, 1852, 1853, 1854, 1855, 1856});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    private native RequestFuture();

    private native synchronized T doGet(Long l);

    public native synchronized boolean cancel(boolean z);

    public native T get();

    public native T get(long j, TimeUnit timeUnit);

    public native boolean isCancelled();

    public native synchronized boolean isDone();

    public native synchronized void onErrorResponse(VolleyError volleyError);

    public native synchronized void onResponse(T t);

    public native void setRequest(Request<?> request);

    public static <E> RequestFuture<E> newFuture() {
        return new RequestFuture();
    }
}
