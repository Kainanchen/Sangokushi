package com.hp.hpl.sparta;

public interface ParseHandler {
    void characters(char[] cArr, int i, int i2);

    void endDocument();

    void endElement(Element element);

    ParseSource getParseSource();

    void setParseSource(ParseSource parseSource);

    void startDocument();

    void startElement(Element element);
}
