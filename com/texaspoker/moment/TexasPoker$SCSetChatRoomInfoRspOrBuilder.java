package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo;
import com.texaspoker.moment.TexasPoker.ChatRoomBaseInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;

public interface TexasPoker$SCSetChatRoomInfoRspOrBuilder extends MessageOrBuilder {
    ERROR_CODE_TYPE getEErrCode();

    ChatRoomBaseInfo getStChatRoomBaseInfo();

    ChatRoomBaseInfoOrBuilder getStChatRoomBaseInfoOrBuilder();

    boolean hasEErrCode();

    boolean hasStChatRoomBaseInfo();
}
