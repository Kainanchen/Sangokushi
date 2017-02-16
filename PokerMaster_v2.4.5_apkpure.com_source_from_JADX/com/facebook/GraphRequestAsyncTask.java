package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.net.HttpURLConnection;
import java.util.List;

/* renamed from: com.facebook.q */
public class GraphRequestAsyncTask extends AsyncTask<Void, Void, List<GraphResponse>> {
    private static final String f2724a;
    private final HttpURLConnection f2725b;
    private final GraphRequestBatch f2726c;
    private Exception f2727d;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m2645a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        super.onPostExecute((List) obj);
        if (this.f2727d != null) {
            String.format("onPostExecute: exception encountered during request: %s", new Object[]{this.f2727d.getMessage()});
        }
    }

    static {
        f2724a = GraphRequestAsyncTask.class.getCanonicalName();
    }

    public GraphRequestAsyncTask(GraphRequestBatch graphRequestBatch) {
        this(graphRequestBatch, (byte) 0);
    }

    private GraphRequestAsyncTask(GraphRequestBatch graphRequestBatch, byte b) {
        this.f2726c = graphRequestBatch;
        this.f2725b = null;
    }

    public String toString() {
        return "{RequestAsyncTask:  connection: " + this.f2725b + ", requests: " + this.f2726c + "}";
    }

    protected void onPreExecute() {
        super.onPreExecute();
        if (FacebookSdk.m2579b()) {
            String.format("execute async task: %s", new Object[]{this});
        }
        if (this.f2726c.f2729a == null) {
            Handler handler;
            if (Thread.currentThread() instanceof HandlerThread) {
                handler = new Handler();
            } else {
                handler = new Handler(Looper.getMainLooper());
            }
            this.f2726c.f2729a = handler;
        }
    }

    private List<GraphResponse> m2645a() {
        try {
            if (this.f2725b == null) {
                return GraphRequest.m2618a(this.f2726c);
            }
            return GraphRequest.m2619a(this.f2725b, this.f2726c);
        } catch (Exception e) {
            this.f2727d = e;
            return null;
        }
    }
}
