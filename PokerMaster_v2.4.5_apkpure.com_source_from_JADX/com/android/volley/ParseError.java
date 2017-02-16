package com.android.volley;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;

public class ParseError extends VolleyError {
    static {
        fixHelper.fixfunc(new int[]{2663, 2664, 2665});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native ParseError(NetworkResponse networkResponse);

    public native ParseError(Throwable th);
}
