package com.igexin.getuiext.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.igexin.getuiext.util.f */
public class C0332f {
    public static Bitmap m1108a(Context context, String str) {
        Bitmap bitmap = null;
        try {
            InputStream open = context.getResources().getAssets().open(str);
            bitmap = BitmapFactory.decodeStream(open);
            open.close();
            return bitmap;
        } catch (IOException e) {
            return bitmap;
        }
    }
}
