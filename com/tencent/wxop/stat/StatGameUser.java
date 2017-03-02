package com.tencent.wxop.stat;

import com.tencent.connect.common.Constants;

public class StatGameUser implements Cloneable {
    private String f1818a;
    private String f1819b;
    private String f1820c;

    public StatGameUser() {
        this.f1818a = Constants.STR_EMPTY;
        this.f1819b = Constants.STR_EMPTY;
        this.f1820c = Constants.STR_EMPTY;
    }

    public StatGameUser(String str, String str2, String str3) {
        this.f1818a = Constants.STR_EMPTY;
        this.f1819b = Constants.STR_EMPTY;
        this.f1820c = Constants.STR_EMPTY;
        this.f1819b = str;
        this.f1818a = str2;
        this.f1820c = str3;
    }

    public StatGameUser clone() {
        try {
            return (StatGameUser) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public String getAccount() {
        return this.f1819b;
    }

    public String getLevel() {
        return this.f1820c;
    }

    public String getWorldName() {
        return this.f1818a;
    }

    public void setAccount(String str) {
        this.f1819b = str;
    }

    public void setLevel(String str) {
        this.f1820c = str;
    }

    public void setWorldName(String str) {
        this.f1818a = str;
    }

    public String toString() {
        return "StatGameUser [worldName=" + this.f1818a + ", account=" + this.f1819b + ", level=" + this.f1820c + "]";
    }
}
