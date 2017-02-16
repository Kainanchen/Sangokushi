package com.facebook.p004a;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.PointerIconCompat;
import com.facebook.GraphRequest;
import com.facebook.p036h.AppEventsLoggerUtility;
import com.facebook.p036h.AttributionIdentifiers;
import com.facebook.p036h.af;
import com.sina.weibo.sdk.component.GameManager;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a.l */
final class SessionEventsState {
    private List<AppEvent> f909a;
    private List<AppEvent> f910b;
    private int f911c;
    private AttributionIdentifiers f912d;
    private String f913e;
    private final int f914f;

    public SessionEventsState(AttributionIdentifiers attributionIdentifiers, String str) {
        this.f909a = new ArrayList();
        this.f910b = new ArrayList();
        this.f914f = PointerIconCompat.TYPE_DEFAULT;
        this.f912d = attributionIdentifiers;
        this.f913e = str;
    }

    public final synchronized void m880a(AppEvent appEvent) {
        if (this.f909a.size() + this.f910b.size() >= PointerIconCompat.TYPE_DEFAULT) {
            this.f911c++;
        } else {
            this.f909a.add(appEvent);
        }
    }

    public final synchronized int m878a() {
        return this.f909a.size();
    }

    public final synchronized void m881a(boolean z) {
        if (z) {
            this.f909a.addAll(this.f910b);
        }
        this.f910b.clear();
        this.f911c = 0;
    }

    public final int m879a(GraphRequest graphRequest, Context context, boolean z, boolean z2) {
        synchronized (this) {
            int i = this.f911c;
            this.f910b.addAll(this.f909a);
            this.f909a.clear();
            JSONArray jSONArray = new JSONArray();
            for (AppEvent appEvent : this.f910b) {
                boolean z3;
                if (appEvent.f873d == null) {
                    z3 = true;
                } else {
                    z3 = appEvent.m850a().equals(appEvent.f873d);
                }
                if (!z3) {
                    appEvent.toString();
                    af.m1508a();
                } else if (z || !appEvent.f871b) {
                    jSONArray.put(appEvent.f870a);
                }
            }
            if (jSONArray.length() == 0) {
                return 0;
            }
            JSONObject a;
            try {
                a = AppEventsLoggerUtility.m1583a(AppEventsLoggerUtility.AppEventsLoggerUtility.CUSTOM_APP_EVENTS, this.f912d, this.f913e, z2, context);
                if (this.f911c > 0) {
                    a.put("num_skipped_events", i);
                }
            } catch (JSONException e) {
                a = new JSONObject();
            }
            graphRequest.f2712c = a;
            Bundle bundle = graphRequest.f2713d;
            if (bundle == null) {
                bundle = new Bundle();
            }
            String jSONArray2 = jSONArray.toString();
            if (jSONArray2 != null) {
                bundle.putByteArray("custom_events_file", SessionEventsState.m877a(jSONArray2));
                graphRequest.f2715f = jSONArray2;
            }
            graphRequest.f2713d = bundle;
            return jSONArray.length();
        }
    }

    public final synchronized List<AppEvent> m882b() {
        List<AppEvent> list;
        list = this.f909a;
        this.f909a = new ArrayList();
        return list;
    }

    private static byte[] m877a(String str) {
        byte[] bArr = null;
        try {
            bArr = str.getBytes(GameManager.DEFAULT_CHARSET);
        } catch (Exception e) {
            af.m1515a(e);
        }
        return bArr;
    }
}
