package com.illuminate.texaspoker.utils.p056a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.illuminate.texaspoker.utils.a.f */
public final class Inventory {
    Map<String, SkuDetails> f6637a;
    Map<String, Purchase> f6638b;

    Inventory() {
        this.f6637a = new HashMap();
        this.f6638b = new HashMap();
    }

    public final SkuDetails m4228a(String str) {
        return (SkuDetails) this.f6637a.get(str);
    }

    public final Purchase m4229b(String str) {
        return (Purchase) this.f6638b.get(str);
    }

    final List<String> m4230c(String str) {
        List<String> arrayList = new ArrayList();
        for (Purchase purchase : this.f6638b.values()) {
            if (purchase.f6639a.equals(str)) {
                arrayList.add(purchase.f6642d);
            }
        }
        return arrayList;
    }
}
