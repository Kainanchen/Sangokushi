package android.support.graphics.drawable;

import android.graphics.Path;
import android.util.Log;
import com.android.volley.DefaultRetryPolicy;
import com.illuminate.texaspoker.R.R;
import java.util.ArrayList;

class PathParser {
    private static final String LOGTAG = "PathParser";

    private static class ExtractFloatResult {
        int mEndPosition;
        boolean mEndWithNegOrDot;

        ExtractFloatResult() {
        }
    }

    public static class PathDataNode {
        float[] params;
        char type;

        PathDataNode(char c, float[] fArr) {
            this.type = c;
            this.params = fArr;
        }

        PathDataNode(PathDataNode pathDataNode) {
            this.type = pathDataNode.type;
            this.params = PathParser.copyOfRange(pathDataNode.params, 0, pathDataNode.params.length);
        }

        public static void nodesToPath(PathDataNode[] pathDataNodeArr, Path path) {
            float[] fArr = new float[6];
            char c = 'm';
            for (int i = 0; i < pathDataNodeArr.length; i++) {
                addCommand(path, fArr, c, pathDataNodeArr[i].type, pathDataNodeArr[i].params);
                c = pathDataNodeArr[i].type;
            }
        }

        public void interpolatePathDataNode(PathDataNode pathDataNode, PathDataNode pathDataNode2, float f) {
            for (int i = 0; i < pathDataNode.params.length; i++) {
                this.params[i] = (pathDataNode.params[i] * (DefaultRetryPolicy.DEFAULT_BACKOFF_MULT - f)) + (pathDataNode2.params[i] * f);
            }
        }

        private static void addCommand(Path path, float[] fArr, char c, char c2, float[] fArr2) {
            int i;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            switch (c2) {
                case R.AppCompatTheme_imageButtonStyle /*65*/:
                case R.AppCompatTheme_textColorAlertDialogListItem /*97*/:
                    i = 7;
                    break;
                case R.AppCompatTheme_textAppearanceSearchResultSubtitle /*67*/:
                case R.AppCompatTheme_buttonBarNegativeButtonStyle /*99*/:
                    i = 6;
                    break;
                case R.AppCompatTheme_listPreferredItemHeightLarge /*72*/:
                case R.AppCompatTheme_colorControlNormal /*86*/:
                case R.AppCompatTheme_checkboxStyle /*104*/:
                case 'v':
                    i = 1;
                    break;
                case R.AppCompatTheme_listPopupWindowStyle /*76*/:
                case R.AppCompatTheme_textAppearanceListItem /*77*/:
                case R.AppCompatTheme_colorPrimaryDark /*84*/:
                case R.AppCompatTheme_ratingBarStyle /*108*/:
                case R.AppCompatTheme_ratingBarStyleIndicator /*109*/:
                case 't':
                    i = 2;
                    break;
                case R.AppCompatTheme_panelMenuListTheme /*81*/:
                case R.AppCompatTheme_colorPrimary /*83*/:
                case R.AppCompatTheme_switchStyle /*113*/:
                case 's':
                    i = 4;
                    break;
                case R.AppCompatTheme_colorSwitchThumbNormal /*90*/:
                case 'z':
                    path.close();
                    path.moveTo(f5, f6);
                    f4 = f6;
                    f3 = f5;
                    f2 = f6;
                    f = f5;
                    i = 2;
                    break;
                default:
                    i = 2;
                    break;
            }
            int i2 = 0;
            float f7 = f6;
            float f8 = f5;
            float f9 = f2;
            float f10 = f;
            while (i2 < fArr2.length) {
                float f11;
                float f12;
                boolean z;
                boolean z2;
                switch (c2) {
                    case R.AppCompatTheme_imageButtonStyle /*65*/:
                        f5 = fArr2[i2 + 5];
                        f2 = fArr2[i2 + 6];
                        f = fArr2[i2 + 0];
                        f11 = fArr2[i2 + 1];
                        f12 = fArr2[i2 + 2];
                        z = fArr2[i2 + 3] != 0.0f;
                        if (fArr2[i2 + 4] != 0.0f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        drawArc(path, f10, f9, f5, f2, f, f11, f12, z, z2);
                        f3 = fArr2[i2 + 5];
                        f4 = fArr2[i2 + 6];
                        f6 = f7;
                        f5 = f8;
                        f2 = f3;
                        f = f4;
                        f11 = f3;
                        f3 = f4;
                        break;
                    case R.AppCompatTheme_textAppearanceSearchResultSubtitle /*67*/:
                        path.cubicTo(fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3], fArr2[i2 + 4], fArr2[i2 + 5]);
                        f5 = fArr2[i2 + 4];
                        f6 = fArr2[i2 + 5];
                        f2 = fArr2[i2 + 2];
                        f = f6;
                        f11 = f5;
                        f6 = f7;
                        f5 = f8;
                        f3 = fArr2[i2 + 3];
                        break;
                    case R.AppCompatTheme_listPreferredItemHeightLarge /*72*/:
                        path.lineTo(fArr2[i2 + 0], f9);
                        f6 = f7;
                        f2 = f3;
                        f = f9;
                        f11 = fArr2[i2 + 0];
                        f3 = f4;
                        f5 = f8;
                        break;
                    case R.AppCompatTheme_listPopupWindowStyle /*76*/:
                        path.lineTo(fArr2[i2 + 0], fArr2[i2 + 1]);
                        f5 = fArr2[i2 + 0];
                        f2 = f3;
                        f = fArr2[i2 + 1];
                        f11 = f5;
                        f6 = f7;
                        f5 = f8;
                        f3 = f4;
                        break;
                    case R.AppCompatTheme_textAppearanceListItem /*77*/:
                        f5 = fArr2[i2 + 0];
                        f6 = fArr2[i2 + 1];
                        if (i2 <= 0) {
                            path.moveTo(fArr2[i2 + 0], fArr2[i2 + 1]);
                            f2 = f3;
                            f = f6;
                            f11 = f5;
                            f3 = f4;
                            break;
                        }
                        path.lineTo(fArr2[i2 + 0], fArr2[i2 + 1]);
                        f2 = f3;
                        f = f6;
                        f11 = f5;
                        f6 = f7;
                        f5 = f8;
                        f3 = f4;
                        break;
                    case R.AppCompatTheme_panelMenuListTheme /*81*/:
                        path.quadTo(fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3]);
                        f3 = fArr2[i2 + 0];
                        f4 = fArr2[i2 + 1];
                        f5 = fArr2[i2 + 2];
                        f2 = f3;
                        f = fArr2[i2 + 3];
                        f11 = f5;
                        f6 = f7;
                        f5 = f8;
                        f3 = f4;
                        break;
                    case R.AppCompatTheme_colorPrimary /*83*/:
                        if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                            f6 = (2.0f * f10) - f3;
                            f3 = (2.0f * f9) - f4;
                        } else {
                            f3 = f9;
                            f6 = f10;
                        }
                        path.cubicTo(f6, f3, fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3]);
                        f3 = fArr2[i2 + 0];
                        f4 = fArr2[i2 + 1];
                        f5 = fArr2[i2 + 2];
                        f2 = f3;
                        f = fArr2[i2 + 3];
                        f11 = f5;
                        f6 = f7;
                        f5 = f8;
                        f3 = f4;
                        break;
                    case R.AppCompatTheme_colorPrimaryDark /*84*/:
                        if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                            f10 = (2.0f * f10) - f3;
                            f9 = (2.0f * f9) - f4;
                        }
                        path.quadTo(f10, f9, fArr2[i2 + 0], fArr2[i2 + 1]);
                        f5 = fArr2[i2 + 0];
                        f3 = f9;
                        f2 = f10;
                        f = fArr2[i2 + 1];
                        f11 = f5;
                        f6 = f7;
                        f5 = f8;
                        break;
                    case R.AppCompatTheme_colorControlNormal /*86*/:
                        path.lineTo(f10, fArr2[i2 + 0]);
                        f5 = f8;
                        f2 = f3;
                        f = fArr2[i2 + 0];
                        f11 = f10;
                        f3 = f4;
                        f6 = f7;
                        break;
                    case R.AppCompatTheme_textColorAlertDialogListItem /*97*/:
                        f5 = fArr2[i2 + 5] + f10;
                        f2 = fArr2[i2 + 6] + f9;
                        f = fArr2[i2 + 0];
                        f11 = fArr2[i2 + 1];
                        f12 = fArr2[i2 + 2];
                        z = fArr2[i2 + 3] != 0.0f;
                        if (fArr2[i2 + 4] != 0.0f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        drawArc(path, f10, f9, f5, f2, f, f11, f12, z, z2);
                        f3 = f10 + fArr2[i2 + 5];
                        f4 = fArr2[i2 + 6] + f9;
                        f6 = f7;
                        f5 = f8;
                        f2 = f3;
                        f = f4;
                        f11 = f3;
                        f3 = f4;
                        break;
                    case R.AppCompatTheme_buttonBarNegativeButtonStyle /*99*/:
                        path.rCubicTo(fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3], fArr2[i2 + 4], fArr2[i2 + 5]);
                        f2 = f10 + fArr2[i2 + 2];
                        f = fArr2[i2 + 5] + f9;
                        f11 = f10 + fArr2[i2 + 4];
                        f6 = f7;
                        f5 = f8;
                        f3 = fArr2[i2 + 3] + f9;
                        break;
                    case R.AppCompatTheme_checkboxStyle /*104*/:
                        path.rLineTo(fArr2[i2 + 0], 0.0f);
                        f6 = f7;
                        f2 = f3;
                        f = f9;
                        f11 = f10 + fArr2[i2 + 0];
                        f3 = f4;
                        f5 = f8;
                        break;
                    case R.AppCompatTheme_ratingBarStyle /*108*/:
                        path.rLineTo(fArr2[i2 + 0], fArr2[i2 + 1]);
                        f2 = f3;
                        f = fArr2[i2 + 1] + f9;
                        f11 = f10 + fArr2[i2 + 0];
                        f6 = f7;
                        f5 = f8;
                        f3 = f4;
                        break;
                    case R.AppCompatTheme_ratingBarStyleIndicator /*109*/:
                        f5 = f10 + fArr2[i2 + 0];
                        f6 = fArr2[i2 + 1] + f9;
                        if (i2 <= 0) {
                            path.rMoveTo(fArr2[i2 + 0], fArr2[i2 + 1]);
                            f2 = f3;
                            f = f6;
                            f11 = f5;
                            f3 = f4;
                            break;
                        }
                        path.rLineTo(fArr2[i2 + 0], fArr2[i2 + 1]);
                        f2 = f3;
                        f = f6;
                        f11 = f5;
                        f6 = f7;
                        f5 = f8;
                        f3 = f4;
                        break;
                    case R.AppCompatTheme_switchStyle /*113*/:
                        path.rQuadTo(fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3]);
                        f2 = f10 + fArr2[i2 + 0];
                        f = fArr2[i2 + 3] + f9;
                        f11 = f10 + fArr2[i2 + 2];
                        f6 = f7;
                        f5 = f8;
                        f3 = fArr2[i2 + 1] + f9;
                        break;
                    case 's':
                        if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                            f6 = f10 - f3;
                            f3 = f9 - f4;
                        } else {
                            f3 = 0.0f;
                            f6 = 0.0f;
                        }
                        path.rCubicTo(f6, f3, fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3]);
                        f2 = f10 + fArr2[i2 + 0];
                        f = fArr2[i2 + 3] + f9;
                        f11 = f10 + fArr2[i2 + 2];
                        f6 = f7;
                        f5 = f8;
                        f3 = fArr2[i2 + 1] + f9;
                        break;
                    case 't':
                        if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                            f6 = f10 - f3;
                            f4 = f9 - f4;
                        } else {
                            f4 = 0.0f;
                            f6 = 0.0f;
                        }
                        path.rQuadTo(f6, f4, fArr2[i2 + 0], fArr2[i2 + 1]);
                        f2 = f10 + f6;
                        f = fArr2[i2 + 1] + f9;
                        f11 = f10 + fArr2[i2 + 0];
                        f6 = f7;
                        f5 = f8;
                        f3 = f4 + f9;
                        break;
                    case 'v':
                        path.rLineTo(0.0f, fArr2[i2 + 0]);
                        f5 = f8;
                        f2 = f3;
                        f = fArr2[i2 + 0] + f9;
                        f11 = f10;
                        f3 = f4;
                        f6 = f7;
                        break;
                    default:
                        f6 = f7;
                        f5 = f8;
                        f2 = f3;
                        f = f9;
                        f11 = f10;
                        f3 = f4;
                        break;
                }
                i2 += i;
                f7 = f6;
                f8 = f5;
                f9 = f;
                f10 = f11;
                c = c2;
                f4 = f3;
                f3 = f2;
            }
            fArr[0] = f10;
            fArr[1] = f9;
            fArr[2] = f3;
            fArr[3] = f4;
            fArr[4] = f8;
            fArr[5] = f7;
        }

        private static void drawArc(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double toRadians;
            double cos;
            double sin;
            double d;
            double d2;
            double d3;
            double d4;
            double d5;
            double d6;
            double d7;
            double d8;
            double d9;
            Path path2 = path;
            while (true) {
                toRadians = Math.toRadians((double) f7);
                cos = Math.cos(toRadians);
                sin = Math.sin(toRadians);
                d = ((((double) f) * cos) + (((double) f2) * sin)) / ((double) f5);
                d2 = ((((double) (-f)) * sin) + (((double) f2) * cos)) / ((double) f6);
                d3 = ((((double) f3) * cos) + (((double) f4) * sin)) / ((double) f5);
                d4 = ((((double) (-f3)) * sin) + (((double) f4) * cos)) / ((double) f6);
                d5 = d - d3;
                d6 = d2 - d4;
                d7 = (d + d3) / 2.0d;
                double d10 = (d2 + d4) / 2.0d;
                d8 = (d5 * d5) + (d6 * d6);
                if (d8 != 0.0d) {
                    d9 = (1.0d / d8) - 0.25d;
                    if (d9 >= 0.0d) {
                        break;
                    }
                    Log.w(PathParser.LOGTAG, "Points are too far apart " + d8);
                    float sqrt = (float) (Math.sqrt(d8) / 1.99999d);
                    f5 *= sqrt;
                    f6 *= sqrt;
                } else {
                    Log.w(PathParser.LOGTAG, " Points are coincident");
                    return;
                }
            }
            d8 = Math.sqrt(d9);
            d5 *= d8;
            d6 *= d8;
            if (z == z2) {
                d6 = d7 - d6;
                d5 += d10;
            } else {
                d6 += d7;
                d5 = d10 - d5;
            }
            d7 = Math.atan2(d2 - d5, d - d6);
            d3 = Math.atan2(d4 - d5, d3 - d6) - d7;
            if (z2 != (d3 >= 0.0d)) {
                if (d3 > 0.0d) {
                    d3 -= 6.283185307179586d;
                } else {
                    d3 += 6.283185307179586d;
                }
            }
            d6 *= (double) f5;
            d = ((double) f6) * d5;
            arcToBezier(path2, (d6 * cos) - (d * sin), (d6 * sin) + (cos * d), (double) f5, (double) f6, (double) f, (double) f2, toRadians, d7, d3);
        }

        private static void arcToBezier(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            int ceil = (int) Math.ceil(Math.abs((4.0d * d9) / 3.141592653589793d));
            double cos = Math.cos(d7);
            double sin = Math.sin(d7);
            double cos2 = Math.cos(d8);
            double sin2 = Math.sin(d8);
            double d10 = (((-d3) * cos) * sin2) - ((d4 * sin) * cos2);
            cos2 = (cos2 * (d4 * cos)) + (sin2 * ((-d3) * sin));
            double d11 = d9 / ((double) ceil);
            int i = 0;
            while (i < ceil) {
                double d12 = d8 + d11;
                sin2 = Math.sin(d12);
                double cos3 = Math.cos(d12);
                double d13 = (((d3 * cos) * cos3) + d) - ((d4 * sin) * sin2);
                double d14 = ((d4 * cos) * sin2) + (((d3 * sin) * cos3) + d2);
                double d15 = (((-d3) * cos) * sin2) - ((d4 * sin) * cos3);
                cos3 = (cos3 * (d4 * cos)) + (sin2 * ((-d3) * sin));
                sin2 = Math.tan((d12 - d8) / 2.0d);
                sin2 = ((Math.sqrt((sin2 * (3.0d * sin2)) + 4.0d) - 1.0d) * Math.sin(d12 - d8)) / 3.0d;
                double d16 = d6 + (cos2 * sin2);
                double d17 = d13 - (sin2 * d15);
                path.rCubicTo(((float) ((d10 * sin2) + d5)) - ((float) d5), ((float) d16) - ((float) d6), ((float) d17) - ((float) d5), ((float) (d14 - (sin2 * cos3))) - ((float) d6), ((float) d13) - ((float) d5), ((float) d14) - ((float) d6));
                d10 = d15;
                d8 = d12;
                i++;
                d6 = d14;
                d5 = d13;
                cos2 = cos3;
            }
        }
    }

    PathParser() {
    }

    static float[] copyOfRange(float[] fArr, int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i < 0 || i > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = i2 - i;
        length = Math.min(i3, length - i);
        Object obj = new float[i3];
        System.arraycopy(fArr, i, obj, 0, length);
        return obj;
    }

    public static Path createPathFromPathData(String str) {
        Path path = new Path();
        PathDataNode[] createNodesFromPathData = createNodesFromPathData(str);
        if (createNodesFromPathData == null) {
            return null;
        }
        try {
            PathDataNode.nodesToPath(createNodesFromPathData, path);
            return path;
        } catch (Throwable e) {
            throw new RuntimeException("Error in parsing " + str, e);
        }
    }

    public static PathDataNode[] createNodesFromPathData(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int nextStart = nextStart(str, i);
            String trim = str.substring(i2, nextStart).trim();
            if (trim.length() > 0) {
                addNode(arrayList, trim.charAt(0), getFloats(trim));
            }
            i = nextStart + 1;
            i2 = nextStart;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            addNode(arrayList, str.charAt(i2), new float[0]);
        }
        return (PathDataNode[]) arrayList.toArray(new PathDataNode[arrayList.size()]);
    }

    public static PathDataNode[] deepCopyNodes(PathDataNode[] pathDataNodeArr) {
        if (pathDataNodeArr == null) {
            return null;
        }
        PathDataNode[] pathDataNodeArr2 = new PathDataNode[pathDataNodeArr.length];
        for (int i = 0; i < pathDataNodeArr.length; i++) {
            pathDataNodeArr2[i] = new PathDataNode(pathDataNodeArr[i]);
        }
        return pathDataNodeArr2;
    }

    public static boolean canMorph(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr.length != pathDataNodeArr2.length) {
            return false;
        }
        int i = 0;
        while (i < pathDataNodeArr.length) {
            if (pathDataNodeArr[i].type != pathDataNodeArr2[i].type || pathDataNodeArr[i].params.length != pathDataNodeArr2[i].params.length) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void updateNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        for (int i = 0; i < pathDataNodeArr2.length; i++) {
            pathDataNodeArr[i].type = pathDataNodeArr2[i].type;
            for (int i2 = 0; i2 < pathDataNodeArr2[i].params.length; i2++) {
                pathDataNodeArr[i].params[i2] = pathDataNodeArr2[i].params[i2];
            }
        }
    }

    private static int nextStart(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 65) * (charAt - 90) <= 0 || (charAt - 97) * (charAt - 122) <= 0) && charAt != 'e' && charAt != 'E') {
                break;
            }
            i++;
        }
        return i;
    }

    private static void addNode(ArrayList<PathDataNode> arrayList, char c, float[] fArr) {
        arrayList.add(new PathDataNode(c, fArr));
    }

    private static float[] getFloats(String str) {
        if (((str.charAt(0) == 'z' ? 1 : 0) | (str.charAt(0) == 'Z' ? 1 : 0)) != 0) {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            ExtractFloatResult extractFloatResult = new ExtractFloatResult();
            int length = str.length();
            int i = 0;
            int i2 = 1;
            while (i2 < length) {
                int i3;
                extract(str, i2, extractFloatResult);
                int i4 = extractFloatResult.mEndPosition;
                if (i2 < i4) {
                    i3 = i + 1;
                    fArr[i] = Float.parseFloat(str.substring(i2, i4));
                } else {
                    i3 = i;
                }
                if (extractFloatResult.mEndWithNegOrDot) {
                    i2 = i4;
                    i = i3;
                } else {
                    i2 = i4 + 1;
                    i = i3;
                }
            }
            return copyOfRange(fArr, 0, i);
        } catch (Throwable e) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void extract(java.lang.String r7, int r8, android.support.graphics.drawable.PathParser.ExtractFloatResult r9) {
        /*
        r1 = 0;
        r5 = 1;
        r9.mEndWithNegOrDot = r1;
        r0 = r1;
        r2 = r1;
        r3 = r1;
        r4 = r8;
    L_0x0008:
        r6 = r7.length();
        if (r4 >= r6) goto L_0x0033;
    L_0x000e:
        r6 = r7.charAt(r4);
        switch(r6) {
            case 32: goto L_0x001b;
            case 44: goto L_0x001b;
            case 45: goto L_0x001e;
            case 46: goto L_0x0027;
            case 69: goto L_0x0031;
            case 101: goto L_0x0031;
            default: goto L_0x0015;
        };
    L_0x0015:
        r0 = r1;
    L_0x0016:
        if (r3 != 0) goto L_0x0033;
    L_0x0018:
        r4 = r4 + 1;
        goto L_0x0008;
    L_0x001b:
        r0 = r1;
        r3 = r5;
        goto L_0x0016;
    L_0x001e:
        if (r4 == r8) goto L_0x0015;
    L_0x0020:
        if (r0 != 0) goto L_0x0015;
    L_0x0022:
        r9.mEndWithNegOrDot = r5;
        r0 = r1;
        r3 = r5;
        goto L_0x0016;
    L_0x0027:
        if (r2 != 0) goto L_0x002c;
    L_0x0029:
        r0 = r1;
        r2 = r5;
        goto L_0x0016;
    L_0x002c:
        r9.mEndWithNegOrDot = r5;
        r0 = r1;
        r3 = r5;
        goto L_0x0016;
    L_0x0031:
        r0 = r5;
        goto L_0x0016;
    L_0x0033:
        r9.mEndPosition = r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.graphics.drawable.PathParser.extract(java.lang.String, int, android.support.graphics.drawable.PathParser$ExtractFloatResult):void");
    }
}
