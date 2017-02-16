package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.facebook.common.p011d.Objects;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p016g.MemoryUiTrimmableRegistry;
import com.facebook.drawee.p026b.DraweeEventTracker.DraweeEventTracker;
import com.facebook.drawee.p028g.DraweeController;
import com.facebook.drawee.p028g.DraweeHierarchy;
import com.facebook.drawee.p030d.VisibilityCallback;
import com.facebook.drawee.view.AspectRatioMeasure.AspectRatioMeasure;
import javax.annotation.Nullable;

/* renamed from: com.facebook.drawee.view.c */
public class DraweeView<DH extends DraweeHierarchy> extends ImageView {
    private final AspectRatioMeasure f1488a;
    private float f1489b;
    private DraweeHolder<DH> f1490c;
    private boolean f1491d;

    public DraweeView(Context context) {
        super(context);
        this.f1488a = new AspectRatioMeasure();
        this.f1489b = 0.0f;
        this.f1491d = false;
        m1427a();
    }

    public DraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1488a = new AspectRatioMeasure();
        this.f1489b = 0.0f;
        this.f1491d = false;
        m1427a();
    }

    public DraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1488a = new AspectRatioMeasure();
        this.f1489b = 0.0f;
        this.f1491d = false;
        m1427a();
    }

    @TargetApi(21)
    public DraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1488a = new AspectRatioMeasure();
        this.f1489b = 0.0f;
        this.f1491d = false;
        m1427a();
    }

    private void m1427a() {
        if (!this.f1491d) {
            this.f1491d = true;
            Object draweeHolder = new DraweeHolder();
            MemoryUiTrimmableRegistry.m1089a(draweeHolder);
            this.f1490c = draweeHolder;
            if (VERSION.SDK_INT >= 21) {
                ColorStateList imageTintList = getImageTintList();
                if (imageTintList != null) {
                    setColorFilter(imageTintList.getDefaultColor());
                }
            }
        }
    }

    public void setHierarchy(DH dh) {
        VisibilityCallback visibilityCallback = this.f1490c;
        visibilityCallback.f1499d.m1289a(DraweeEventTracker.ON_SET_HIERARCHY);
        visibilityCallback.m1437a(null);
        visibilityCallback.f1497b = (DraweeHierarchy) Preconditions.m1030a((Object) dh);
        Drawable a = visibilityCallback.f1497b.m1392a();
        boolean z = a == null || a.isVisible();
        visibilityCallback.m1439a(z);
        visibilityCallback.m1437a(visibilityCallback);
        if (visibilityCallback.f1498c != null) {
            visibilityCallback.f1498c.m1217a((DraweeHierarchy) dh);
        }
        super.setImageDrawable(this.f1490c.m1440b());
    }

    public DH getHierarchy() {
        return (DraweeHierarchy) Preconditions.m1030a(this.f1490c.f1497b);
    }

    @Nullable
    public Drawable getTopLevelDrawable() {
        return this.f1490c.m1440b();
    }

    public void setController(@Nullable DraweeController draweeController) {
        this.f1490c.m1438a(draweeController);
        super.setImageDrawable(this.f1490c.m1440b());
    }

    @Nullable
    public DraweeController getController() {
        return this.f1490c.f1498c;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1428b();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1429c();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        m1429c();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        m1428b();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        DraweeHolder draweeHolder = this.f1490c;
        if (draweeHolder.f1498c == null) {
            z = false;
        } else {
            z = draweeHolder.f1498c.m1218a(motionEvent);
        }
        if (z) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        getContext();
        m1427a();
        this.f1490c.m1438a(null);
        super.setImageDrawable(drawable);
    }

    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        getContext();
        m1427a();
        this.f1490c.m1438a(null);
        super.setImageBitmap(bitmap);
    }

    @Deprecated
    public void setImageResource(int i) {
        getContext();
        m1427a();
        this.f1490c.m1438a(null);
        super.setImageResource(i);
    }

    @Deprecated
    public void setImageURI(Uri uri) {
        getContext();
        m1427a();
        this.f1490c.m1438a(null);
        super.setImageURI(uri);
    }

    public void setAspectRatio(float f) {
        if (f != this.f1489b) {
            this.f1489b = f;
            requestLayout();
        }
    }

    public float getAspectRatio() {
        return this.f1489b;
    }

    protected void onMeasure(int i, int i2) {
        this.f1488a.f1494a = i;
        this.f1488a.f1495b = i2;
        AspectRatioMeasure aspectRatioMeasure = this.f1488a;
        float f = this.f1489b;
        LayoutParams layoutParams = getLayoutParams();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (f > 0.0f && layoutParams != null) {
            if (AspectRatioMeasure.m1433a(layoutParams.height)) {
                aspectRatioMeasure.f1495b = MeasureSpec.makeMeasureSpec(View.resolveSize((int) ((((float) (MeasureSpec.getSize(aspectRatioMeasure.f1494a) - paddingLeft)) / f) + ((float) paddingTop)), aspectRatioMeasure.f1495b), 1073741824);
            } else if (AspectRatioMeasure.m1433a(layoutParams.width)) {
                aspectRatioMeasure.f1494a = MeasureSpec.makeMeasureSpec(View.resolveSize((int) ((f * ((float) (MeasureSpec.getSize(aspectRatioMeasure.f1495b) - paddingTop))) + ((float) paddingLeft)), aspectRatioMeasure.f1494a), 1073741824);
            }
        }
        super.onMeasure(this.f1488a.f1494a, this.f1488a.f1495b);
    }

    public String toString() {
        return Objects.m1028a(this).m1026a("holder", this.f1490c != null ? this.f1490c.toString() : "<no holder set>").toString();
    }

    private void m1428b() {
        DraweeHolder draweeHolder = this.f1490c;
        draweeHolder.f1499d.m1289a(DraweeEventTracker.ON_HOLDER_ATTACH);
        draweeHolder.f1496a = true;
        draweeHolder.m1441c();
    }

    private void m1429c() {
        DraweeHolder draweeHolder = this.f1490c;
        draweeHolder.f1499d.m1289a(DraweeEventTracker.ON_HOLDER_DETACH);
        draweeHolder.f1496a = false;
        draweeHolder.m1441c();
    }
}
