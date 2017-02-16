package com.texaspoker.moment;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface TexasPoker$UseItemPushMsgOrBuilder extends MessageOrBuilder {
    long getLFromUuid();

    int getLItemID();

    long getLMsgID();

    long getLRoomID();

    long getLToUuid();

    String getSExtra();

    ByteString getSExtraBytes();

    boolean hasLFromUuid();

    boolean hasLItemID();

    boolean hasLMsgID();

    boolean hasLRoomID();

    boolean hasLToUuid();

    boolean hasSExtra();
}
