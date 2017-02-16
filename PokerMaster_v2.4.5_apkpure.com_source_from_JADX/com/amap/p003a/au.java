package com.amap.p003a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.amap.api.location.DPoint;
import com.amap.api.location.OffsetUtil;
import com.amap.p003a.bz.ILocationProviderService;
import com.autonavi.aps.amapapi.model.AMapLocationServer;
import com.sina.weibo.sdk.component.GameManager;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.common.MessageKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* compiled from: ConnectionServiceManager */
/* renamed from: com.amap.a.au */
public class au {
    Context f273a;
    boolean f274b;
    bz f275c;
    ServiceConnection f276d;
    ServiceConnection f277e;
    ServiceConnection f278f;
    boolean f279g;
    boolean f280h;
    boolean f281i;
    ConnectionServiceManager f282j;
    private String f283k;
    private Intent f284l;
    private String f285m;
    private String f286n;
    private String f287o;
    private String f288p;
    private String f289q;
    private String f290r;
    private String f291s;

    /* renamed from: com.amap.a.au.a */
    public interface ConnectionServiceManager {
        void m198a(int i);
    }

    /* renamed from: com.amap.a.au.1 */
    class ConnectionServiceManager implements ServiceConnection {
        final /* synthetic */ ConnectionServiceManager f269a;
        final /* synthetic */ au f270b;

        ConnectionServiceManager(au auVar, ConnectionServiceManager connectionServiceManager) {
            this.f270b = auVar;
            this.f269a = connectionServiceManager;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.f270b.f275c = ILocationProviderService.m515a(iBinder);
            this.f269a.m198a(0);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            this.f270b.f275c = null;
        }
    }

    /* renamed from: com.amap.a.au.2 */
    class ConnectionServiceManager implements ServiceConnection {
        final /* synthetic */ au f271a;

        ConnectionServiceManager(au auVar) {
            this.f271a = auVar;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: com.amap.a.au.3 */
    class ConnectionServiceManager implements ServiceConnection {
        final /* synthetic */ au f272a;

        ConnectionServiceManager(au auVar) {
            this.f272a = auVar;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    au(Context context) {
        this.f283k = null;
        this.f273a = null;
        this.f274b = true;
        this.f275c = null;
        this.f276d = null;
        this.f277e = null;
        this.f278f = null;
        this.f284l = new Intent();
        this.f285m = "com.autonavi.minimap";
        this.f286n = "com.amap.api.service.AMapService";
        this.f287o = "com.autonavi.minimap.LBSConnectionService";
        this.f279g = false;
        this.f280h = false;
        this.f281i = false;
        this.f282j = null;
        this.f288p = "invaid type";
        this.f289q = "empty appkey";
        this.f290r = "refused";
        this.f291s = "failed";
        this.f273a = context;
        try {
            this.f283k = cf.m577a(bb.m318a(cb.m523f(context).getBytes(GameManager.DEFAULT_CHARSET), "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDCEYwdO3V2ANrhApjqyk7X8FH5AEaWly58kP9IDAhMqwtIbmcJrUK9oO9Afh3KZnOlDtjiowy733YqpLRO7WBvdbW/c4Dz/d3dy/m+6HMqxaak+GQQRHw/VPdKciaZ3eIZp4MWOyIQwiFSQvPTAo/Na8hV4SgBZHB3lGFw0yu+BmG+h32eIE6p4Y8EDCn+G+yzekX+taMrWTQIysledrygZSGPv1ukbdFDnH/xZEI0dCr9pZT+AZQl3o9a2aMyuRrHM0oupXKKiYl69Y8fKh1Tyd752rF6LrR5uOb9aOfXt18hb+3YL5P9rQ+ZRYbyHYFaxzBPA2jLq0KUQ+Dmg7YhAgMBAAECggEAL9pj0lF3BUHwtssNKdf42QZJMD0BKuDcdZrLV9ifs0f54EJY5enzKw8j76MpdV8N5QVkNX4/BZR0bs9uJogh31oHFs5EXeWbb7V8P7bRrxpNnSAijGBWwscQsyqymf48YlcL28949ujnjoEz3jQjgWOyYnrCgpVhphrQbCGmB5TcZnTFvHfozt/0tzuMj5na5lRnkD0kYXgr0x/SRZcPoCybSpc3t/B/9MAAboGaV/QQkTotr7VOuJfaPRjvg8rzyPzavo3evxsjXj7vDXbN4w0cbk/Uqn2JtvPQ8HoysmF2HdYvILZibvJmWH1hA58b4sn5s6AqFRjMOL7rHdD+gQKBgQD+IzoofmZK5tTxgO9sWsG71IUeshQP9fe159jKCehk1RfuIqqbRP0UcxJiw4eNjHs4zU0HeRL3iF5XfUs0FQanO/pp6YL1xgVdfQlDdTdk6KFHJ0sUJapnJn1S2k7IKfRKE1+rkofSXMYUTsgHF1fDp+gxy4yUMY+h9O+JlKVKOwKBgQDDfaDIblaSm+B0lyG//wFPynAeGd0Q8wcMZbQQ/LWMJZhMZ7fyUZ+A6eL/jB53a2tgnaw2rXBpMe1qu8uSpym2plU0fkgLAnVugS5+KRhOkUHyorcbpVZbs5azf7GlTydR5dI1PHF3Bncemoa6IsEvumHWgQbVyTTz/O9mlFafUwKBgQCvDebms8KUf5JY1F6XfaCLWGVl8nZdVCmQFKbA7Lg2lI5KS3jHQWsupeEZRORffU/3nXsc1apZ9YY+r6CYvI77rRXd1KqPzxos/o7d96TzjkZhc9CEjTlmmh2jb5rqx/Ns/xFcZq/GGH+cx3ODZvHeZQ9NFY+9GLJ+dfB2DX0ZtwKBgQC+9/lZ8telbpqMqpqwqRaJ8LMn5JIdHZu0E6IcuhFLr+ogMW3zTKMpVtGGXEXi2M/TWRPDchiO2tQX4Q5T2/KW19QCbJ5KCwPWiGF3owN4tNOciDGh0xkSidRc0xAh8bnyejSoBry8zlcNUVztdkgMLOGonvCjZWPSOTNQnPYluwKBgCV+WVftpTk3l+OfAJTaXEPNYdh7+WQjzxZKjUaDzx80Ts7hRo2U+EQT7FBjQQNqmmDnWtujo5p1YmJC0FT3n1CVa7g901pb3b0RcOziYWAoJi0/+kLyeo6XBhuLeZ7h90S70GGh1o0V/j/9N1jb5DCL4xKkvdYePPTSTku0BM+n"));
        } catch (Throwable th) {
            bc.m330a(th, "ConnectionServiceManager", "ConnectionServiceManager");
        }
    }

    private AMapLocationServer m258a(Bundle bundle) {
        byte[] b;
        JSONObject jSONObject;
        if (bundle.containsKey("key")) {
            try {
                b = bb.m321b(cf.m581b(bundle.getString("key")), "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDCEYwdO3V2ANrhApjqyk7X8FH5AEaWly58kP9IDAhMqwtIbmcJrUK9oO9Afh3KZnOlDtjiowy733YqpLRO7WBvdbW/c4Dz/d3dy/m+6HMqxaak+GQQRHw/VPdKciaZ3eIZp4MWOyIQwiFSQvPTAo/Na8hV4SgBZHB3lGFw0yu+BmG+h32eIE6p4Y8EDCn+G+yzekX+taMrWTQIysledrygZSGPv1ukbdFDnH/xZEI0dCr9pZT+AZQl3o9a2aMyuRrHM0oupXKKiYl69Y8fKh1Tyd752rF6LrR5uOb9aOfXt18hb+3YL5P9rQ+ZRYbyHYFaxzBPA2jLq0KUQ+Dmg7YhAgMBAAECggEAL9pj0lF3BUHwtssNKdf42QZJMD0BKuDcdZrLV9ifs0f54EJY5enzKw8j76MpdV8N5QVkNX4/BZR0bs9uJogh31oHFs5EXeWbb7V8P7bRrxpNnSAijGBWwscQsyqymf48YlcL28949ujnjoEz3jQjgWOyYnrCgpVhphrQbCGmB5TcZnTFvHfozt/0tzuMj5na5lRnkD0kYXgr0x/SRZcPoCybSpc3t/B/9MAAboGaV/QQkTotr7VOuJfaPRjvg8rzyPzavo3evxsjXj7vDXbN4w0cbk/Uqn2JtvPQ8HoysmF2HdYvILZibvJmWH1hA58b4sn5s6AqFRjMOL7rHdD+gQKBgQD+IzoofmZK5tTxgO9sWsG71IUeshQP9fe159jKCehk1RfuIqqbRP0UcxJiw4eNjHs4zU0HeRL3iF5XfUs0FQanO/pp6YL1xgVdfQlDdTdk6KFHJ0sUJapnJn1S2k7IKfRKE1+rkofSXMYUTsgHF1fDp+gxy4yUMY+h9O+JlKVKOwKBgQDDfaDIblaSm+B0lyG//wFPynAeGd0Q8wcMZbQQ/LWMJZhMZ7fyUZ+A6eL/jB53a2tgnaw2rXBpMe1qu8uSpym2plU0fkgLAnVugS5+KRhOkUHyorcbpVZbs5azf7GlTydR5dI1PHF3Bncemoa6IsEvumHWgQbVyTTz/O9mlFafUwKBgQCvDebms8KUf5JY1F6XfaCLWGVl8nZdVCmQFKbA7Lg2lI5KS3jHQWsupeEZRORffU/3nXsc1apZ9YY+r6CYvI77rRXd1KqPzxos/o7d96TzjkZhc9CEjTlmmh2jb5rqx/Ns/xFcZq/GGH+cx3ODZvHeZQ9NFY+9GLJ+dfB2DX0ZtwKBgQC+9/lZ8telbpqMqpqwqRaJ8LMn5JIdHZu0E6IcuhFLr+ogMW3zTKMpVtGGXEXi2M/TWRPDchiO2tQX4Q5T2/KW19QCbJ5KCwPWiGF3owN4tNOciDGh0xkSidRc0xAh8bnyejSoBry8zlcNUVztdkgMLOGonvCjZWPSOTNQnPYluwKBgCV+WVftpTk3l+OfAJTaXEPNYdh7+WQjzxZKjUaDzx80Ts7hRo2U+EQT7FBjQQNqmmDnWtujo5p1YmJC0FT3n1CVa7g901pb3b0RcOziYWAoJi0/+kLyeo6XBhuLeZ7h90S70GGh1o0V/j/9N1jb5DCL4xKkvdYePPTSTku0BM+n");
            } catch (Throwable th) {
                bc.m330a(th, "ConnectionServiceManager", "parseData part");
            }
            if (bundle.containsKey("result")) {
                return null;
            }
            try {
                jSONObject = new JSONObject(new String(bb.m319a(b, cf.m581b(bundle.getString("result"))), "utf-8"));
                if (jSONObject.has("error")) {
                    AMapLocationServer aMapLocationServer;
                    aMapLocationServer = new AMapLocationServer(LetterIndexBar.SEARCH_ICON_LETTER);
                    aMapLocationServer.m789b(jSONObject);
                    aMapLocationServer.setProvider("lbs");
                    aMapLocationServer.setLocationType(7);
                    if ("WGS84".equals(aMapLocationServer.m794e()) && bc.m331a(aMapLocationServer.getLatitude(), aMapLocationServer.getLongitude())) {
                        DPoint a = OffsetUtil.m767a(this.f273a, aMapLocationServer.getLongitude(), aMapLocationServer.getLatitude());
                        aMapLocationServer.setLatitude(a.getLatitude());
                        aMapLocationServer.setLongitude(a.getLongitude());
                    }
                    return aMapLocationServer;
                }
                String string;
                string = jSONObject.getString("error");
                if (this.f288p.equals(string)) {
                    this.f274b = false;
                }
                if (this.f289q.equals(string)) {
                    this.f274b = false;
                }
                if (this.f290r.equals(string)) {
                    this.f274b = false;
                }
                this.f291s.equals(string);
                return null;
            } catch (Throwable th2) {
                bc.m330a(th2, au.class.getName(), "parseData");
                return null;
            }
        }
        b = null;
        if (bundle.containsKey("result")) {
            return null;
        }
        jSONObject = new JSONObject(new String(bb.m319a(b, cf.m581b(bundle.getString("result"))), "utf-8"));
        if (jSONObject.has("error")) {
            aMapLocationServer = new AMapLocationServer(LetterIndexBar.SEARCH_ICON_LETTER);
            aMapLocationServer.m789b(jSONObject);
            aMapLocationServer.setProvider("lbs");
            aMapLocationServer.setLocationType(7);
            DPoint a2 = OffsetUtil.m767a(this.f273a, aMapLocationServer.getLongitude(), aMapLocationServer.getLatitude());
            aMapLocationServer.setLatitude(a2.getLatitude());
            aMapLocationServer.setLongitude(a2.getLongitude());
            return aMapLocationServer;
        }
        string = jSONObject.getString("error");
        if (this.f288p.equals(string)) {
            this.f274b = false;
        }
        if (this.f289q.equals(string)) {
            this.f274b = false;
        }
        if (this.f290r.equals(string)) {
            this.f274b = false;
        }
        this.f291s.equals(string);
        return null;
    }

    final boolean m259a() {
        ArrayList m;
        String str;
        if (bn.m395b(this.f273a)) {
            this.f284l.putExtra(LogBuilder.KEY_APPKEY, this.f283k);
            this.f284l.setComponent(new ComponentName(this.f285m, this.f286n));
            try {
                this.f279g = this.f273a.bindService(this.f284l, this.f276d, 1);
            } catch (Throwable th) {
            }
            try {
                if (!this.f279g) {
                    m = bn.m413m();
                    if (m != null) {
                        Iterator it = m.iterator();
                        while (it.hasNext()) {
                            str = (String) it.next();
                            if (!str.equals(this.f286n)) {
                                this.f284l.setComponent(new ComponentName(this.f285m, str));
                                try {
                                    this.f279g = this.f273a.bindService(this.f284l, this.f276d, 1);
                                } catch (Throwable th2) {
                                }
                                if (this.f279g) {
                                    break;
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                return false;
            }
        }
        if (bn.m397c(this.f273a)) {
            Intent intent = new Intent();
            intent.putExtra(LogBuilder.KEY_APPKEY, this.f283k);
            intent.setComponent(new ComponentName(this.f285m, this.f287o));
            try {
                this.f280h = this.f273a.bindService(intent, this.f277e, 1);
            } catch (Throwable th4) {
            }
            if (!this.f280h) {
                m = bn.m414n();
                if (m != null) {
                    Iterator it2 = m.iterator();
                    while (it2.hasNext()) {
                        str = (String) it2.next();
                        if (!str.equals(this.f287o)) {
                            intent.setComponent(new ComponentName(this.f285m, str));
                            try {
                                this.f280h = this.f273a.bindService(intent, this.f277e, 1);
                            } catch (Throwable th5) {
                            }
                            if (this.f279g) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        m260b();
        return this.f279g && this.f280h;
    }

    public final void m260b() {
        try {
            if (bn.m405g(this.f273a)) {
                List<bo> w = bn.m423w();
                if (w != null && w.size() > 0) {
                    for (bo boVar : w) {
                        if (boVar != null) {
                            if (boVar.f491a) {
                                Intent intent = new Intent();
                                intent.setComponent(new ComponentName(boVar.f492b, boVar.f493c));
                                if (!TextUtils.isEmpty(boVar.f495e)) {
                                    intent.setAction(boVar.f495e);
                                }
                                List list = boVar.f494d;
                                if (list != null && list.size() > 0) {
                                    for (int i = 0; i < list.size(); i++) {
                                        Iterator it = ((Map) list.get(i)).entrySet().iterator();
                                        if (it.hasNext()) {
                                            Entry entry = (Entry) it.next();
                                            intent.putExtra(((String) entry.getKey()).toString(), ((String) entry.getValue()).toString());
                                        }
                                    }
                                }
                                if (boVar.f496f) {
                                    this.f273a.startService(intent);
                                }
                                boolean bindService = this.f273a.bindService(intent, this.f278f, 1);
                                if (bindService) {
                                    this.f281i = bindService;
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            bc.m330a(th, "ConnectionServiceManager", "bindOtherService");
        }
    }

    final AMapLocationServer m261c() {
        AMapLocationServer aMapLocationServer = null;
        try {
            if (this.f274b && this.f279g) {
                Bundle bundle = new Bundle();
                bundle.putString(MessageKey.MSG_TYPE, "corse");
                bundle.putString(LogBuilder.KEY_APPKEY, this.f283k);
                if (this.f275c != null) {
                    this.f275c.m513a(bundle);
                    if (bundle.size() > 0) {
                        aMapLocationServer = m258a(bundle);
                    }
                }
            }
        } catch (Throwable th) {
            bc.m330a(th, "ConnectionServiceManager", "sendCommand");
        }
        return aMapLocationServer;
    }
}
