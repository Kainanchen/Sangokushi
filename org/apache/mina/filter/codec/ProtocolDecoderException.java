package org.apache.mina.filter.codec;

import org.cocos2dx.lib.BuildConfig;

public class ProtocolDecoderException extends ProtocolCodecException {
    private static final long serialVersionUID = 3545799879533408565L;
    private String hexdump;

    public ProtocolDecoderException(String str) {
        super(str);
    }

    public ProtocolDecoderException(Throwable th) {
        super(th);
    }

    public ProtocolDecoderException(String str, Throwable th) {
        super(str, th);
    }

    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = BuildConfig.FLAVOR;
        }
        if (this.hexdump == null) {
            return message;
        }
        return message + (message.length() > 0 ? " " : BuildConfig.FLAVOR) + "(Hexdump: " + this.hexdump + ')';
    }

    public String getHexdump() {
        return this.hexdump;
    }

    public void setHexdump(String str) {
        if (this.hexdump != null) {
            throw new IllegalStateException("Hexdump cannot be set more than once.");
        }
        this.hexdump = str;
    }
}
