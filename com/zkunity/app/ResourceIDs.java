package com.zkunity.app;

import android.content.Context;

public class ResourceIDs {
    public static final String DRAWABLE_ID = "drawable";
    public static final String ID = "id";
    public static final String LAYOUT = "layout";
    public static final String STRING_ID = "string";

    public static int getResourseId(Context ctx, String pVariableName, String pResourcename) {
        if (ctx != null) {
            try {
                return ctx.getResources().getIdentifier(pVariableName, pResourcename, ctx.getPackageName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return -1;
    }
}
