package org.apache.mina.filter.codec.demux;

public class MessageDecoderResult {
    public static final MessageDecoderResult NEED_DATA;
    public static final MessageDecoderResult NOT_OK;
    public static final MessageDecoderResult OK;
    private final String name;

    static {
        OK = new MessageDecoderResult("OK");
        NEED_DATA = new MessageDecoderResult("NEED_DATA");
        NOT_OK = new MessageDecoderResult("NOT_OK");
    }

    private MessageDecoderResult(String str) {
        this.name = str;
    }

    public String toString() {
        return this.name;
    }
}
