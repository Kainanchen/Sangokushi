package com.hp.hpl.sparta.xpath;

public class ParentNodeTest extends NodeTest {
    static final ParentNodeTest INSTANCE;

    static {
        INSTANCE = new ParentNodeTest();
    }

    private ParentNodeTest() {
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public boolean isStringValue() {
        return false;
    }

    public String toString() {
        return "..";
    }
}
