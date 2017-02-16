package com.hp.hpl.sparta.xpath;

public class AttrExistsExpr extends AttrExpr {
    AttrExistsExpr(String str) {
        super(str);
    }

    public void accept(BooleanExprVisitor booleanExprVisitor) {
        booleanExprVisitor.visit(this);
    }

    public String toString() {
        return new StringBuffer("[").append(super.toString()).append("]").toString();
    }
}
