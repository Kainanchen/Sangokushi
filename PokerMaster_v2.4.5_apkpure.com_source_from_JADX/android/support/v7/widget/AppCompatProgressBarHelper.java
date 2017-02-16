package android.support.v7.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.support.v4.graphics.drawable.DrawableWrapper;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.tencent.android.tpush.common.Constants;

class AppCompatProgressBarHelper {
    private static final int[] TINT_ATTRS;
    private Bitmap mSampleTile;
    private final ProgressBar mView;

    static {
        TINT_ATTRS = new int[]{16843067, 16843068};
    }

    AppCompatProgressBarHelper(ProgressBar progressBar) {
        this.mView = progressBar;
    }

    void loadFromAttributes(AttributeSet attributeSet, int i) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.mView.getContext(), attributeSet, TINT_ATTRS, i, 0);
        Drawable drawableIfKnown = obtainStyledAttributes.getDrawableIfKnown(0);
        if (drawableIfKnown != null) {
            this.mView.setIndeterminateDrawable(tileifyIndeterminate(drawableIfKnown));
        }
        drawableIfKnown = obtainStyledAttributes.getDrawableIfKnown(1);
        if (drawableIfKnown != null) {
            this.mView.setProgressDrawable(tileify(drawableIfKnown, false));
        }
        obtainStyledAttributes.recycle();
    }

    private Drawable tileify(Drawable drawable, boolean z) {
        int i = 0;
        Drawable wrappedDrawable;
        if (drawable instanceof DrawableWrapper) {
            wrappedDrawable = ((DrawableWrapper) drawable).getWrappedDrawable();
            if (wrappedDrawable == null) {
                return drawable;
            }
            ((DrawableWrapper) drawable).setWrappedDrawable(tileify(wrappedDrawable, z));
            return drawable;
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                boolean z2;
                int id = layerDrawable.getId(i2);
                Drawable drawable2 = layerDrawable.getDrawable(i2);
                if (id == 16908301 || id == 16908303) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                drawableArr[i2] = tileify(drawable2, z2);
            }
            wrappedDrawable = new LayerDrawable(drawableArr);
            while (i < numberOfLayers) {
                wrappedDrawable.setId(i, layerDrawable.getId(i));
                i++;
            }
            return wrappedDrawable;
        } else if (!(drawable instanceof BitmapDrawable)) {
            return drawable;
        } else {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.mSampleTile == null) {
                this.mSampleTile = bitmap;
            }
            wrappedDrawable = new ShapeDrawable(getDrawableShape());
            wrappedDrawable.getPaint().setShader(new BitmapShader(bitmap, TileMode.REPEAT, TileMode.CLAMP));
            wrappedDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(wrappedDrawable, 3, 1) : wrappedDrawable;
        }
    }

    private Drawable tileifyIndeterminate(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        Drawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable tileify = tileify(animationDrawable.getFrame(i), true);
            tileify.setLevel(Constants.ERRORCODE_UNKNOWN);
            animationDrawable2.addFrame(tileify, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(Constants.ERRORCODE_UNKNOWN);
        return animationDrawable2;
    }

    private Shape getDrawableShape() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    Bitmap getSampleTime() {
        return this.mSampleTile;
    }
}
