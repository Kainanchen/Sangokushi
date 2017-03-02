package com.alipay.sdk.app;

/* renamed from: com.alipay.sdk.app.i */
public enum C0143i {
    SUCCEEDED(9000, "\u5904\u7406\u6210\u529f"),
    FAILED(4000, "\u7cfb\u7edf\u7e41\u5fd9\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5"),
    CANCELED(6001, "\u7528\u6237\u53d6\u6d88"),
    NETWORK_ERROR(6002, "\u7f51\u7edc\u8fde\u63a5\u5f02\u5e38"),
    PARAMS_ERROR(4001, "\u53c2\u6570\u9519\u8bef"),
    DOUBLE_REQUEST(5000, "\u91cd\u590d\u8bf7\u6c42"),
    PAY_WAITTING(8000, "\u652f\u4ed8\u7ed3\u679c\u786e\u8ba4\u4e2d");
    
    public int f228h;
    public String f229i;

    private C0143i(int i, String str) {
        this.f228h = i;
        this.f229i = str;
    }

    private void m395b(int i) {
        this.f228h = i;
    }

    private int m391a() {
        return this.f228h;
    }

    private void m393a(String str) {
        this.f229i = str;
    }

    private String m394b() {
        return this.f229i;
    }

    public static C0143i m392a(int i) {
        switch (i) {
            case 4001:
                return PARAMS_ERROR;
            case 5000:
                return DOUBLE_REQUEST;
            case 6001:
                return CANCELED;
            case 6002:
                return NETWORK_ERROR;
            case 8000:
                return PAY_WAITTING;
            case 9000:
                return SUCCEEDED;
            default:
                return FAILED;
        }
    }
}
