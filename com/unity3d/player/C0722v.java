package com.unity3d.player;

/* renamed from: com.unity3d.player.v */
final class C0722v {
    private static boolean f2325a;
    private boolean f2326b;
    private boolean f2327c;
    private boolean f2328d;
    private boolean f2329e;

    static {
        f2325a = false;
    }

    C0722v() {
        this.f2326b = !C0714q.f2298h;
        this.f2327c = false;
        this.f2328d = false;
        this.f2329e = true;
    }

    static void m2628a() {
        f2325a = true;
    }

    static void m2629b() {
        f2325a = false;
    }

    static boolean m2630c() {
        return f2325a;
    }

    final void m2631a(boolean z) {
        this.f2327c = z;
    }

    final void m2632b(boolean z) {
        this.f2329e = z;
    }

    final void m2633c(boolean z) {
        this.f2328d = z;
    }

    final void m2634d() {
        this.f2326b = true;
    }

    final boolean m2635e() {
        return this.f2329e;
    }

    final boolean m2636f() {
        return f2325a && this.f2327c && this.f2326b && !this.f2329e && !this.f2328d;
    }

    final boolean m2637g() {
        return this.f2328d;
    }

    public final String toString() {
        return super.toString();
    }
}
