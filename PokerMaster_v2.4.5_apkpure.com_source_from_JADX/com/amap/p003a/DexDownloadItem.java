package com.amap.p003a;

/* renamed from: com.amap.a.r */
public final class DexDownloadItem {
    String f701a;
    String f702b;
    String f703c;
    String f704d;
    String f705e;
    String f706f;
    int f707g;
    int f708h;

    public DexDownloadItem(String str, String str2) {
        this.f701a = str;
        this.f702b = str2;
        try {
            String[] split = str.split("/");
            int length = split.length;
            if (length > 1) {
                this.f703c = split[length - 1];
                split = this.f703c.split("_");
                this.f704d = split[0];
                this.f705e = split[2];
                this.f706f = split[1];
                this.f707g = Integer.parseInt(split[3]);
                this.f708h = Integer.parseInt(split[4].split("\\.")[0]);
            }
        } catch (Throwable th) {
            cm.m637a(th, "DexDownloadItem", "DexDownloadItem");
        }
    }
}
