package com.hp.hpl.sparta;

public class DefaultParseHandler implements ParseHandler {
    private ParseSource parseSource_;

    public DefaultParseHandler() {
        this.parseSource_ = null;
    }

    public void characters(char[] cArr, int i, int i2) {
    }

    public void endDocument() {
    }

    public void endElement(Element element) {
    }

    public ParseSource getParseSource() {
        return this.parseSource_;
    }

    public void setParseSource(ParseSource parseSource) {
        this.parseSource_ = parseSource;
    }

    public void startDocument() {
    }

    public void startElement(Element element) {
    }
}
