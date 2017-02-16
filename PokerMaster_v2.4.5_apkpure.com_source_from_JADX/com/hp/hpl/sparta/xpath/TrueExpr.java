package com.hp.hpl.sparta.xpath;

import com.sina.weibo.sdk.register.mobile.LetterIndexBar;

public class TrueExpr extends BooleanExpr {
    static final TrueExpr INSTANCE;

    static {
        INSTANCE = new TrueExpr();
    }

    private TrueExpr() {
    }

    public void accept(BooleanExprVisitor booleanExprVisitor) {
        booleanExprVisitor.visit(this);
    }

    public String toString() {
        return LetterIndexBar.SEARCH_ICON_LETTER;
    }
}
