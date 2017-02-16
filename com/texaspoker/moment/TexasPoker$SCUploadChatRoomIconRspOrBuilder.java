package com.texaspoker.moment;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;

public interface TexasPoker$SCUploadChatRoomIconRspOrBuilder extends MessageOrBuilder {
    ERROR_CODE_TYPE getEErrCode();

    long getLRoomID();

    String getSIconUrl();

    ByteString getSIconUrlBytes();

    String getSSmallIconUrl();

    ByteString getSSmallIconUrlBytes();

    boolean hasEErrCode();

    boolean hasLRoomID();

    boolean hasSIconUrl();

    boolean hasSSmallIconUrl();
}
