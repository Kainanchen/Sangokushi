package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPoker.ChatRoomInfo;
import com.texaspoker.moment.TexasPoker.ChatRoomInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;

public interface TexasPoker$SCSetChatRoomUserRspOrBuilder extends MessageOrBuilder {
    ERROR_CODE_TYPE getEErrCode();

    ChatRoomInfo getStChatRoomInfo();

    ChatRoomInfoOrBuilder getStChatRoomInfoOrBuilder();

    boolean hasEErrCode();

    boolean hasStChatRoomInfo();
}
