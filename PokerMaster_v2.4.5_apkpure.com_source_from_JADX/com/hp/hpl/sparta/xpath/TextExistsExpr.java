package com.hp.hpl.sparta.xpath;

public class TextExistsExpr extends BooleanExpr {
    static final TextExistsExpr INSTANCE;

    static {
        INSTANCE = new TextExistsExpr();
    }

    private TextExistsExpr() {
    }

    public void accept(BooleanExprVisitor booleanExprVisitor) {
        booleanExprVisitor.visit(this);
    }

    public String toString() {
        return "[text()]";
    }
}
