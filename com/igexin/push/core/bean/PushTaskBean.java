package com.igexin.push.core.bean;

import java.util.List;
import java.util.Map;

public class PushTaskBean {
    private String f1116a;
    private String f1117b;
    private String f1118c;
    private String f1119d;
    private String f1120e;
    private List f1121f;
    private byte[] f1122g;
    private String f1123h;
    private String f1124i;
    private int f1125j;
    private int f1126k;
    private boolean f1127l;
    private boolean f1128m;
    private boolean f1129n;
    private Map f1130o;
    private int f1131p;

    public PushTaskBean() {
        this.f1127l = false;
        this.f1128m = false;
        this.f1129n = false;
    }

    public String getAction() {
        return this.f1116a;
    }

    public List getActionChains() {
        return this.f1121f;
    }

    public String getAppKey() {
        return this.f1124i;
    }

    public String getAppid() {
        return this.f1117b;
    }

    public BaseAction getBaseAction(String str) {
        for (BaseAction baseAction : getActionChains()) {
            if (baseAction.getActionId().equals(str)) {
                return baseAction;
            }
        }
        return null;
    }

    public Map getConditionMap() {
        return this.f1130o;
    }

    public int getCurrentActionid() {
        return this.f1125j;
    }

    public String getId() {
        return this.f1118c;
    }

    public String getMessageId() {
        return this.f1119d;
    }

    public String getMsgAddress() {
        return this.f1123h;
    }

    public byte[] getMsgExtra() {
        return this.f1122g;
    }

    public int getPerActionid() {
        return this.f1126k;
    }

    public int getStatus() {
        return this.f1131p;
    }

    public String getTaskId() {
        return this.f1120e;
    }

    public boolean isCDNType() {
        return this.f1129n;
    }

    public boolean isHttpImg() {
        return this.f1127l;
    }

    public boolean isStop() {
        return this.f1128m;
    }

    public void setAction(String str) {
        this.f1116a = str;
    }

    public void setActionChains(List list) {
        this.f1121f = list;
    }

    public void setAppKey(String str) {
        this.f1124i = str;
    }

    public void setAppid(String str) {
        this.f1117b = str;
    }

    public void setCDNType(boolean z) {
        this.f1129n = z;
    }

    public void setConditionMap(Map map) {
        this.f1130o = map;
    }

    public void setCurrentActionid(int i) {
        this.f1125j = i;
    }

    public void setHttpImg(boolean z) {
        this.f1127l = z;
    }

    public void setId(String str) {
        this.f1118c = str;
    }

    public void setMessageId(String str) {
        this.f1119d = str;
    }

    public void setMsgAddress(String str) {
        this.f1123h = str;
    }

    public void setMsgExtra(byte[] bArr) {
        this.f1122g = bArr;
    }

    public void setPerActionid(int i) {
        this.f1126k = i;
    }

    public void setStatus(int i) {
        this.f1131p = i;
    }

    public void setStop(boolean z) {
        this.f1128m = z;
    }

    public void setTaskId(String str) {
        this.f1120e = str;
    }
}
