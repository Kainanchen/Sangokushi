package com.amap.p003a;

import com.tencent.android.tpush.XGPushManager;

/* compiled from: AMapCoreException */
/* renamed from: com.amap.a.ca */
public final class ca extends Exception {
    String f540a;
    int f541b;

    public ca(String str) {
        super(str);
        this.f540a = "\u672a\u77e5\u7684\u9519\u8bef";
        this.f541b = -1;
        this.f540a = str;
        if ("IO \u64cd\u4f5c\u5f02\u5e38 - IOException".equals(str)) {
            this.f541b = 21;
        } else if ("socket \u8fde\u63a5\u5f02\u5e38 - SocketException".equals(str)) {
            this.f541b = 22;
        } else if ("socket \u8fde\u63a5\u8d85\u65f6 - SocketTimeoutException".equals(str)) {
            this.f541b = 23;
        } else if ("\u65e0\u6548\u7684\u53c2\u6570 - IllegalArgumentException".equals(str)) {
            this.f541b = 24;
        } else if ("\u7a7a\u6307\u9488\u5f02\u5e38 - NullPointException".equals(str)) {
            this.f541b = 25;
        } else if ("url\u5f02\u5e38 - MalformedURLException".equals(str)) {
            this.f541b = 26;
        } else if ("\u672a\u77e5\u4e3b\u673a - UnKnowHostException".equals(str)) {
            this.f541b = 27;
        } else if ("\u670d\u52a1\u5668\u8fde\u63a5\u5931\u8d25 - UnknownServiceException".equals(str)) {
            this.f541b = 28;
        } else if ("\u534f\u8bae\u89e3\u6790\u9519\u8bef - ProtocolException".equals(str)) {
            this.f541b = 29;
        } else if ("http\u8fde\u63a5\u5931\u8d25 - ConnectionException".equals(str)) {
            this.f541b = 30;
        } else if ("\u672a\u77e5\u7684\u9519\u8bef".equals(str)) {
            this.f541b = 31;
        } else if ("key\u9274\u6743\u5931\u8d25".equals(str)) {
            this.f541b = 32;
        } else if ("requeust is null".equals(str)) {
            this.f541b = 1;
        } else if ("request url is empty".equals(str)) {
            this.f541b = 2;
        } else if ("response is null".equals(str)) {
            this.f541b = 3;
        } else if ("thread pool has exception".equals(str)) {
            this.f541b = 4;
        } else if ("sdk name is invalid".equals(str)) {
            this.f541b = 5;
        } else if ("sdk info is null".equals(str)) {
            this.f541b = 6;
        } else if ("sdk packages is null".equals(str)) {
            this.f541b = 7;
        } else if ("\u7ebf\u7a0b\u6c60\u4e3a\u7a7a".equals(str)) {
            this.f541b = 8;
        } else if ("\u83b7\u53d6\u5bf9\u8c61\u9519\u8bef".equals(str)) {
            this.f541b = XGPushManager.OPERATION_REQ_UNREGISTER;
        } else {
            this.f541b = -1;
        }
    }
}
