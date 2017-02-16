package com.facebook.p004a;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.p036h.Logger;
import com.facebook.p036h.af;
import com.sina.weibo.sdk.component.GameManager;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.facebook.a.c */
final class AppEvent implements Serializable {
    private static final HashSet<String> f869e;
    final JSONObject f870a;
    final boolean f871b;
    final String f872c;
    final String f873d;

    /* renamed from: com.facebook.a.c.a */
    static class AppEvent implements Serializable {
        private final String f864a;
        private final boolean f865b;

        private Object readResolve() {
            return new AppEvent(this.f865b, null, (byte) 0);
        }
    }

    /* renamed from: com.facebook.a.c.b */
    static class AppEvent implements Serializable {
        private final String f866a;
        private final boolean f867b;
        private final String f868c;

        private AppEvent(String str, boolean z, String str2) {
            this.f866a = str;
            this.f867b = z;
            this.f868c = str2;
        }

        private Object readResolve() {
            return new AppEvent(this.f867b, this.f868c, (byte) 0);
        }
    }

    static {
        f869e = new HashSet();
    }

    public AppEvent(String str, String str2, Double d, Bundle bundle, boolean z, @Nullable UUID uuid) {
        this.f870a = AppEvent.m847a(str, str2, d, bundle, z, uuid);
        this.f871b = z;
        this.f872c = str2;
        this.f873d = m850a();
    }

    private AppEvent(String str, boolean z, String str2) {
        this.f870a = new JSONObject(str);
        this.f871b = z;
        this.f872c = this.f870a.optString("_eventName");
        this.f873d = str2;
    }

    private static void m848a(String str) {
        if (str == null || str.length() == 0 || str.length() > 40) {
            if (str == null) {
                str = "<None Provided>";
            }
            throw new FacebookException(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", new Object[]{str, Integer.valueOf(40)}));
        }
        synchronized (f869e) {
            boolean contains = f869e.contains(str);
        }
        if (!contains) {
            if (str.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$")) {
                synchronized (f869e) {
                    f869e.add(str);
                }
                return;
            }
            throw new FacebookException(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", new Object[]{str}));
        }
    }

    private static JSONObject m847a(String str, String str2, Double d, Bundle bundle, boolean z, @Nullable UUID uuid) {
        AppEvent.m848a(str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("_eventName", str2);
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (d != null) {
            jSONObject.put("_valueToSum", d.doubleValue());
        }
        if (z) {
            jSONObject.put("_implicitlyLogged", "1");
        }
        String e = AppEventsLogger.m832e();
        if (e != null) {
            jSONObject.put("_app_user_id", e);
        }
        if (bundle != null) {
            for (String e2 : bundle.keySet()) {
                AppEvent.m848a(e2);
                Object obj = bundle.get(e2);
                if ((obj instanceof String) || (obj instanceof Number)) {
                    jSONObject.put(e2, obj.toString());
                } else {
                    throw new FacebookException(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", new Object[]{obj, e2}));
                }
            }
        }
        if (!z) {
            Logger.m1683a(LoggingBehavior.APP_EVENTS, "AppEvents", "Created app event '%s'", jSONObject.toString());
        }
        return jSONObject;
    }

    private Object writeReplace() {
        return new AppEvent(this.f871b, this.f873d, (byte) 0);
    }

    public final String toString() {
        return String.format("\"%s\", implicit: %b, json: %s", new Object[]{this.f870a.optString("_eventName"), Boolean.valueOf(this.f871b), this.f870a.toString()});
    }

    final String m850a() {
        return AppEvent.m849b(this.f870a.toString());
    }

    private static String m849b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes(GameManager.DEFAULT_CHARSET);
            instance.update(bytes, 0, bytes.length);
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            int length = digest.length;
            for (int i = 0; i < length; i++) {
                stringBuffer.append(String.format("%02x", new Object[]{Byte.valueOf(digest[i])}));
            }
            return stringBuffer.toString();
        } catch (Exception e) {
            af.m1515a(e);
            return "0";
        } catch (Exception e2) {
            af.m1515a(e2);
            return "1";
        }
    }
}
