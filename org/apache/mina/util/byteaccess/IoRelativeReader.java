package org.apache.mina.util.byteaccess;

public interface IoRelativeReader {
    char getChar();

    double getDouble();

    float getFloat();

    long getLong();

    short getShort();

    void skip(int i);

    ByteArray slice(int i);
}
