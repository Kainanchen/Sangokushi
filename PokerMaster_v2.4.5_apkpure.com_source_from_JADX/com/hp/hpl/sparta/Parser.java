package com.hp.hpl.sparta;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Reader;

public class Parser {
    public static Document parse(String str) {
        return parse(str.toCharArray());
    }

    public static Document parse(String str, InputStream inputStream) {
        Object buildDocument = new BuildDocument();
        ParseByteStream parseByteStream = new ParseByteStream(str, inputStream, null, null, buildDocument);
        return buildDocument.getDocument();
    }

    public static Document parse(String str, InputStream inputStream, ParseLog parseLog) {
        Object buildDocument = new BuildDocument();
        ParseByteStream parseByteStream = new ParseByteStream(str, inputStream, parseLog, null, buildDocument);
        return buildDocument.getDocument();
    }

    public static Document parse(String str, InputStream inputStream, ParseLog parseLog, String str2) {
        Object buildDocument = new BuildDocument();
        ParseByteStream parseByteStream = new ParseByteStream(str, inputStream, parseLog, str2, buildDocument);
        return buildDocument.getDocument();
    }

    public static Document parse(String str, Reader reader) {
        ParseHandler buildDocument = new BuildDocument();
        ParseCharStream parseCharStream = new ParseCharStream(str, reader, null, null, buildDocument);
        return buildDocument.getDocument();
    }

    public static Document parse(String str, Reader reader, ParseLog parseLog) {
        ParseHandler buildDocument = new BuildDocument();
        ParseCharStream parseCharStream = new ParseCharStream(str, reader, parseLog, null, buildDocument);
        return buildDocument.getDocument();
    }

    public static Document parse(String str, Reader reader, ParseLog parseLog, String str2) {
        ParseHandler buildDocument = new BuildDocument();
        ParseCharStream parseCharStream = new ParseCharStream(str, reader, parseLog, str2, buildDocument);
        return buildDocument.getDocument();
    }

    public static Document parse(byte[] bArr) {
        Object buildDocument = new BuildDocument();
        ParseByteStream parseByteStream = new ParseByteStream("file:anonymous-string", new ByteArrayInputStream(bArr), null, null, buildDocument);
        return buildDocument.getDocument();
    }

    public static Document parse(char[] cArr) {
        ParseHandler buildDocument = new BuildDocument();
        ParseCharStream parseCharStream = new ParseCharStream("file:anonymous-string", cArr, null, null, buildDocument);
        return buildDocument.getDocument();
    }

    public static void parse(String str, ParseHandler parseHandler) {
        parse(str.toCharArray(), parseHandler);
    }

    public static void parse(String str, InputStream inputStream, ParseHandler parseHandler) {
        ParseByteStream parseByteStream = new ParseByteStream(str, inputStream, null, null, parseHandler);
    }

    public static void parse(String str, InputStream inputStream, ParseLog parseLog, ParseHandler parseHandler) {
        ParseByteStream parseByteStream = new ParseByteStream(str, inputStream, parseLog, null, parseHandler);
    }

    public static void parse(String str, InputStream inputStream, ParseLog parseLog, String str2, ParseHandler parseHandler) {
        ParseByteStream parseByteStream = new ParseByteStream(str, inputStream, parseLog, str2, parseHandler);
    }

    public static void parse(String str, Reader reader, ParseHandler parseHandler) {
        ParseCharStream parseCharStream = new ParseCharStream(str, reader, null, null, parseHandler);
    }

    public static void parse(String str, Reader reader, ParseLog parseLog, ParseHandler parseHandler) {
        ParseCharStream parseCharStream = new ParseCharStream(str, reader, parseLog, null, parseHandler);
    }

    public static void parse(String str, Reader reader, ParseLog parseLog, String str2, ParseHandler parseHandler) {
        ParseCharStream parseCharStream = new ParseCharStream(str, reader, parseLog, str2, parseHandler);
    }

    public static void parse(byte[] bArr, ParseHandler parseHandler) {
        ParseByteStream parseByteStream = new ParseByteStream("file:anonymous-string", new ByteArrayInputStream(bArr), null, null, parseHandler);
    }

    public static void parse(char[] cArr, ParseHandler parseHandler) {
        ParseCharStream parseCharStream = new ParseCharStream("file:anonymous-string", cArr, null, null, parseHandler);
    }
}