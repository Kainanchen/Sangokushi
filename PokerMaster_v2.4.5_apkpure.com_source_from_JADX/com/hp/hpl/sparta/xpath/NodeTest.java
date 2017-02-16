package com.hp.hpl.sparta.xpath;

public abstract class NodeTest {
    public abstract void accept(Visitor visitor);

    public abstract boolean isStringValue();
}
