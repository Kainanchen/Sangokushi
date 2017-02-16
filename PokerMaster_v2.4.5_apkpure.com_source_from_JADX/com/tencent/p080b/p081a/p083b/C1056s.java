package com.tencent.p080b.p081a.p083b;

import android.net.wifi.ScanResult;
import java.util.Comparator;

/* renamed from: com.tencent.b.a.b.s */
final class C1056s implements Comparator<ScanResult> {
    C1056s() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        ScanResult scanResult = (ScanResult) obj2;
        int abs = Math.abs(((ScanResult) obj).level);
        int abs2 = Math.abs(scanResult.level);
        return abs > abs2 ? 1 : abs == abs2 ? 0 : -1;
    }
}
