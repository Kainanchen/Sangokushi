package com.texaspoker.moment;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface TexasPoker$SystemPushMsgOrBuilder extends MessageOrBuilder {
    TexasPoker$SYSTEM_MESSAGE_TYPE getESystemMessageType();

    long getLMsgID();

    long getLTimeoutTime();

    String getSContent();

    ByteString getSContentBytes();

    String getSTitle();

    ByteString getSTitleBytes();

    String getSUrl();

    ByteString getSUrlBytes();

    boolean hasESystemMessageType();

    boolean hasLMsgID();

    boolean hasLTimeoutTime();

    boolean hasSContent();

    boolean hasSTitle();

    boolean hasSUrl();
}
