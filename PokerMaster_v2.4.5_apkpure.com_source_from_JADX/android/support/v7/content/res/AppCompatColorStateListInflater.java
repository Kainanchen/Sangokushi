package android.support.v7.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.graphics.ColorUtils;
import android.support.v7.appcompat.C0184R;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.android.volley.DefaultRetryPolicy;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

final class AppCompatColorStateListInflater {
    private static final int DEFAULT_COLOR = -65536;

    private AppCompatColorStateListInflater() {
    }

    @NonNull
    public static ColorStateList createFromXml(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @Nullable Theme theme) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return createFromXmlInner(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @NonNull
    private static ColorStateList createFromXmlInner(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return inflate(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    private static ColorStateList inflate(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Theme theme) {
        Object trimStateSet;
        Object append;
        int depth = xmlPullParser.getDepth() + 1;
        Object obj = new int[20][];
        int i = 0;
        Object obj2 = new int[20];
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                break;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                break;
            } else if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray obtainAttributes = obtainAttributes(resources, theme, attributeSet, C0184R.styleable.ColorStateListItem);
                int color = obtainAttributes.getColor(C0184R.styleable.ColorStateListItem_android_color, -65281);
                float f = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
                if (obtainAttributes.hasValue(C0184R.styleable.ColorStateListItem_android_alpha)) {
                    f = obtainAttributes.getFloat(C0184R.styleable.ColorStateListItem_android_alpha, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
                } else if (obtainAttributes.hasValue(C0184R.styleable.ColorStateListItem_alpha)) {
                    f = obtainAttributes.getFloat(C0184R.styleable.ColorStateListItem_alpha, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
                }
                obtainAttributes.recycle();
                int i2 = 0;
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i3 = 0;
                while (i3 < attributeCount) {
                    depth2 = attributeSet.getAttributeNameResource(i3);
                    if (depth2 == 16843173 || depth2 == 16843551 || depth2 == C0184R.attr.alpha) {
                        depth2 = i2;
                    } else {
                        int i4 = i2 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i3, false)) {
                            depth2 = -depth2;
                        }
                        iArr[i2] = depth2;
                        depth2 = i4;
                    }
                    i3++;
                    i2 = depth2;
                }
                trimStateSet = StateSet.trimStateSet(iArr, i2);
                append = GrowingArrayUtils.append((int[]) obj2, i, modulateColorAlpha(color, f));
                i++;
                obj = (int[][]) GrowingArrayUtils.append((Object[]) obj, i, trimStateSet);
                obj2 = append;
            }
        }
        append = new int[i];
        trimStateSet = new int[i][];
        System.arraycopy(obj2, 0, append, 0, i);
        System.arraycopy(obj, 0, trimStateSet, 0, i);
        return new ColorStateList(trimStateSet, append);
    }

    private static TypedArray obtainAttributes(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    private static int modulateColorAlpha(int i, float f) {
        return ColorUtils.setAlphaComponent(i, Math.round(((float) Color.alpha(i)) * f));
    }
}
