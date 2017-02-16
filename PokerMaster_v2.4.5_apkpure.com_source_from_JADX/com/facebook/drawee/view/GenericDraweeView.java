package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.common.p011d.Preconditions;
import com.facebook.drawee.p031e.GenericDraweeHierarchy;
import com.facebook.drawee.p031e.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.p031e.GenericDraweeHierarchyInflater;
import javax.annotation.Nullable;

/* renamed from: com.facebook.drawee.view.d */
public class GenericDraweeView extends DraweeView<GenericDraweeHierarchy> {
    public GenericDraweeView(Context context, GenericDraweeHierarchy genericDraweeHierarchy) {
        super(context);
        setHierarchy(genericDraweeHierarchy);
    }

    public GenericDraweeView(Context context) {
        super(context);
        m1430a(context, null);
    }

    public GenericDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1430a(context, attributeSet);
    }

    public GenericDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1430a(context, attributeSet);
    }

    @TargetApi(21)
    public GenericDraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m1430a(context, attributeSet);
    }

    private void m1430a(Context context, @Nullable AttributeSet attributeSet) {
        GenericDraweeHierarchyBuilder a = GenericDraweeHierarchyInflater.m1415a(new GenericDraweeHierarchyBuilder(context.getResources()), context, attributeSet);
        setAspectRatio(a.f1451e);
        if (a.f1465s != null) {
            for (Object a2 : a.f1465s) {
                Preconditions.m1030a(a2);
            }
        }
        setHierarchy(new GenericDraweeHierarchy(a));
    }
}
