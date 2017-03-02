package com.igexin.push.core.bean;

public class BaseAction {
    private String f1112a;
    private String f1113b;
    private String f1114c;
    private boolean f1115d;

    public BaseAction() {
        this.f1115d = true;
    }

    public String getActionId() {
        return this.f1112a;
    }

    public String getDoActionId() {
        return this.f1114c;
    }

    public String getType() {
        return this.f1113b;
    }

    public boolean isSupportExt() {
        return this.f1115d;
    }

    public void setActionId(String str) {
        this.f1112a = str;
    }

    public void setDoActionId(String str) {
        this.f1114c = str;
    }

    public void setSupportExt(boolean z) {
        this.f1115d = z;
    }

    public void setType(String str) {
        this.f1113b = str;
    }
}
