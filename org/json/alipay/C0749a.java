package org.json.alipay;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: org.json.alipay.a */
public class C0749a {
    private ArrayList f2376a;

    public C0749a() {
        this.f2376a = new ArrayList();
    }

    public C0749a(Object obj) {
        this();
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                this.f2376a.add(Array.get(obj, i));
            }
            return;
        }
        throw new JSONException("JSONArray initial value should be a string or collection or array.");
    }

    public C0749a(String str) {
        this(new C0752c(str));
    }

    public C0749a(Collection collection) {
        this.f2376a = collection == null ? new ArrayList() : new ArrayList(collection);
    }

    public C0749a(C0752c c0752c) {
        this();
        char c = c0752c.m2659c();
        if (c == '[') {
            c = ']';
        } else if (c == '(') {
            c = ')';
        } else {
            throw c0752c.m2656a("A JSONArray text must start with '['");
        }
        if (c0752c.m2659c() != ']') {
            c0752c.m2657a();
            while (true) {
                if (c0752c.m2659c() == ',') {
                    c0752c.m2657a();
                    this.f2376a.add(null);
                } else {
                    c0752c.m2657a();
                    this.f2376a.add(c0752c.m2660d());
                }
                char c2 = c0752c.m2659c();
                switch (c2) {
                    case ')':
                    case ']':
                        if (c != c2) {
                            throw c0752c.m2656a("Expected a '" + new Character(c) + "'");
                        }
                        return;
                    case ',':
                    case ';':
                        if (c0752c.m2659c() != ']') {
                            c0752c.m2657a();
                        } else {
                            return;
                        }
                    default:
                        throw c0752c.m2656a("Expected a ',' or ']'");
                }
            }
        }
    }

    private String m2646a(String str) {
        int size = this.f2376a.size();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                stringBuffer.append(str);
            }
            stringBuffer.append(C0751b.m2649a(this.f2376a.get(i)));
        }
        return stringBuffer.toString();
    }

    public final int m2647a() {
        return this.f2376a.size();
    }

    public final Object m2648a(int i) {
        Object obj = (i < 0 || i >= this.f2376a.size()) ? null : this.f2376a.get(i);
        if (obj != null) {
            return obj;
        }
        throw new JSONException("JSONArray[" + i + "] not found.");
    }

    public String toString() {
        try {
            return "[" + m2646a(",") + ']';
        } catch (Exception e) {
            return null;
        }
    }
}
