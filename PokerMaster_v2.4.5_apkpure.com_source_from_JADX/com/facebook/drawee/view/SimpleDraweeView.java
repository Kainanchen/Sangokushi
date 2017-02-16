package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p011d.Supplier;
import com.facebook.drawee.R.R;
import com.facebook.drawee.p028g.SimpleDraweeControllerBuilder;
import com.facebook.drawee.p031e.GenericDraweeHierarchy;
import javax.annotation.Nullable;

public class SimpleDraweeView extends GenericDraweeView {
    private static Supplier<? extends SimpleDraweeControllerBuilder> f1492a;
    private SimpleDraweeControllerBuilder f1493b;

    public static void m1432a(Supplier<? extends SimpleDraweeControllerBuilder> supplier) {
        f1492a = supplier;
    }

    public SimpleDraweeView(Context context, GenericDraweeHierarchy genericDraweeHierarchy) {
        super(context, genericDraweeHierarchy);
        m1431a(context, null);
    }

    public SimpleDraweeView(Context context) {
        super(context);
        m1431a(context, null);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1431a(context, attributeSet);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1431a(context, attributeSet);
    }

    @TargetApi(21)
    public SimpleDraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m1431a(context, attributeSet);
    }

    private void m1431a(Context context, @Nullable AttributeSet attributeSet) {
        if (!isInEditMode()) {
            Preconditions.m1031a(f1492a, (Object) "SimpleDraweeView was not initialized!");
            this.f1493b = (SimpleDraweeControllerBuilder) f1492a.m963a();
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.SimpleDraweeView);
                try {
                    if (obtainStyledAttributes.hasValue(R.SimpleDraweeView_actualImageUri)) {
                        setImageURI$e15a9ce(Uri.parse(obtainStyledAttributes.getString(R.SimpleDraweeView_actualImageUri)));
                    }
                    obtainStyledAttributes.recycle();
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                }
            }
        }
    }

    protected SimpleDraweeControllerBuilder getControllerBuilder() {
        return this.f1493b;
    }

    public void setImageURI(Uri uri) {
        setImageURI$e15a9ce(uri);
    }

    private void setImageURI$e15a9ce(Uri uri) {
        setController(this.f1493b.m1261g().m1258a(uri).m1259b(getController()).m1260f());
    }

    public void setImageURI(@Nullable String str) {
        setImageURI$e15a9ce(str != null ? Uri.parse(str) : null);
    }
}
