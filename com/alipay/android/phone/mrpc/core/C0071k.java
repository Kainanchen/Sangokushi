package com.alipay.android.phone.mrpc.core;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.format.Time;
import com.p054p.ImageActivity;
import com.tencent.mm.sdk.constants.ConstantsAPI;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage.IMediaObject;
import com.ut.device.AidConstants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.alipay.android.phone.mrpc.core.k */
public final class C0071k {
    private static final Pattern f43a;
    private static final Pattern f44b;

    /* renamed from: com.alipay.android.phone.mrpc.core.k.a */
    private static class C0070a {
        int f40a;
        int f41b;
        int f42c;

        C0070a(int i, int i2, int i3) {
            this.f40a = i;
            this.f41b = i2;
            this.f42c = i3;
        }
    }

    static {
        f43a = Pattern.compile("([0-9]{1,2})[- ]([A-Za-z]{3,9})[- ]([0-9]{2,4})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])");
        f44b = Pattern.compile("[ ]([A-Za-z]{3,9})[ ]+([0-9]{1,2})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])[ ]([0-9]{2,4})");
    }

    public static long m76a(String str) {
        int c;
        int d;
        C0070a e;
        int i;
        int i2 = 1;
        Matcher matcher = f43a.matcher(str);
        int b;
        if (matcher.find()) {
            b = C0071k.m77b(matcher.group(1));
            c = C0071k.m78c(matcher.group(2));
            d = C0071k.m79d(matcher.group(3));
            e = C0071k.m80e(matcher.group(4));
            i = b;
        } else {
            Matcher matcher2 = f44b.matcher(str);
            if (matcher2.find()) {
                c = C0071k.m78c(matcher2.group(1));
                b = C0071k.m77b(matcher2.group(2));
                C0070a e2 = C0071k.m80e(matcher2.group(3));
                d = C0071k.m79d(matcher2.group(4));
                e = e2;
                i = b;
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (d >= 2038) {
            d = 2038;
            c = 0;
        } else {
            i2 = i;
        }
        Time time = new Time("UTC");
        time.set(e.f42c, e.f41b, e.f40a, i2, c, d);
        return time.toMillis(false);
    }

    private static int m77b(String str) {
        return str.length() == 2 ? ((str.charAt(0) - 48) * 10) + (str.charAt(1) - 48) : str.charAt(0) - 48;
    }

    private static int m78c(String str) {
        switch (((Character.toLowerCase(str.charAt(0)) + Character.toLowerCase(str.charAt(1))) + Character.toLowerCase(str.charAt(2))) - 291) {
            case ConstantsAPI.COMMAND_ADD_CARD_TO_EX_CARD_PACKAGE /*9*/:
                return 11;
            case IMediaObject.TYPE_PRODUCT /*10*/:
                return 1;
            case 22:
                return 0;
            case 26:
                return 7;
            case 29:
                return 2;
            case AccessibilityNodeInfoCompat.ACTION_LONG_CLICK /*32*/:
                return 3;
            case 35:
                return 9;
            case 36:
                return 4;
            case 37:
                return 8;
            case ImageActivity.SET_ALBUM_PICTURE_KITKAT /*40*/:
                return 6;
            case 42:
                return 5;
            case 48:
                return 10;
            default:
                throw new IllegalArgumentException();
        }
    }

    private static int m79d(String str) {
        if (str.length() != 2) {
            return str.length() == 3 ? ((((str.charAt(0) - 48) * 100) + ((str.charAt(1) - 48) * 10)) + (str.charAt(2) - 48)) + 1900 : str.length() == 4 ? ((((str.charAt(0) - 48) * AidConstants.EVENT_REQUEST_STARTED) + ((str.charAt(1) - 48) * 100)) + ((str.charAt(2) - 48) * 10)) + (str.charAt(3) - 48) : 1970;
        } else {
            int charAt = ((str.charAt(0) - 48) * 10) + (str.charAt(1) - 48);
            return charAt >= 70 ? charAt + 1900 : charAt + 2000;
        }
    }

    private static C0070a m80e(String str) {
        int i;
        int charAt = str.charAt(0) - 48;
        if (str.charAt(1) != ':') {
            i = 2;
            charAt = (charAt * 10) + (str.charAt(1) - 48);
        } else {
            i = 1;
        }
        i++;
        int i2 = i + 1;
        i = ((str.charAt(i) - 48) * 10) + (str.charAt(i2) - 48);
        i2 = (i2 + 1) + 1;
        return new C0070a(charAt, i, ((str.charAt(i2) - 48) * 10) + (str.charAt(i2 + 1) - 48));
    }
}
