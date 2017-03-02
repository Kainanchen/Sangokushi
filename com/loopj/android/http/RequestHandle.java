package com.loopj.android.http;

import android.os.Looper;
import java.lang.ref.WeakReference;

public class RequestHandle {
    private final WeakReference<AsyncHttpRequest> request;

    /* renamed from: com.loopj.android.http.RequestHandle.1 */
    class C05431 implements Runnable {
        final /* synthetic */ AsyncHttpRequest val$_request;
        final /* synthetic */ boolean val$mayInterruptIfRunning;

        C05431(AsyncHttpRequest asyncHttpRequest, boolean z) {
            this.val$_request = asyncHttpRequest;
            this.val$mayInterruptIfRunning = z;
        }

        public void run() {
            this.val$_request.cancel(this.val$mayInterruptIfRunning);
        }
    }

    public RequestHandle(AsyncHttpRequest request) {
        this.request = new WeakReference(request);
    }

    public boolean cancel(boolean mayInterruptIfRunning) {
        AsyncHttpRequest _request = (AsyncHttpRequest) this.request.get();
        if (_request == null) {
            return false;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return _request.cancel(mayInterruptIfRunning);
        }
        new Thread(new C05431(_request, mayInterruptIfRunning)).start();
        return true;
    }

    public boolean isFinished() {
        AsyncHttpRequest _request = (AsyncHttpRequest) this.request.get();
        return _request == null || _request.isDone();
    }

    public boolean isCancelled() {
        AsyncHttpRequest _request = (AsyncHttpRequest) this.request.get();
        return _request == null || _request.isCancelled();
    }

    public boolean shouldBeGarbageCollected() {
        boolean should = isCancelled() || isFinished();
        if (should) {
            this.request.clear();
        }
        return should;
    }

    public RequestHandle setTag(Object tag) {
        AsyncHttpRequest _request = (AsyncHttpRequest) this.request.get();
        if (_request != null) {
            _request.setRequestTag(tag);
        }
        return this;
    }

    public Object getTag() {
        AsyncHttpRequest _request = (AsyncHttpRequest) this.request.get();
        return _request == null ? null : _request.getTag();
    }
}
