package com.igexin.getuiext.ui;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import java.io.IOException;

/* renamed from: com.igexin.getuiext.ui.f */
public class C0310f {
    private static C0310f f836b;
    private Context f837a;
    private AssetManager f838c;

    private C0310f(Context context) {
        this.f837a = context;
        m1055a();
    }

    public static C0310f m1054a(Context context) {
        if (f836b == null) {
            f836b = new C0310f(context);
        }
        return f836b;
    }

    private void m1055a() {
        this.f838c = this.f837a.getAssets();
    }

    public int m1056a(String str, String str2) {
        return this.f837a.getResources().getIdentifier(str, str2, this.f837a.getApplicationInfo().packageName);
    }

    public NinePatchDrawable m1057a(String str) {
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(this.f838c.open(str));
            byte[] ninePatchChunk = decodeStream.getNinePatchChunk();
            if (NinePatch.isNinePatchChunk(ninePatchChunk)) {
                return new NinePatchDrawable(this.f837a.getResources(), decodeStream, ninePatchChunk, C0309e.m1051a(ninePatchChunk).f832a, null);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Drawable m1058b(String str) {
        Drawable drawable = null;
        try {
            drawable = Drawable.createFromStream(this.f838c.open(str), null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return drawable;
    }

    public Bitmap m1059c(String str) {
        try {
            return BitmapFactory.decodeStream(this.f838c.open(str));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
