package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo;
import com.texaspoker.moment.TexasPoker.ChatRoomBaseInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import java.util.List;

public interface TexasPoker$SCGetChatRoomInfoByUuidRspOrBuilder extends MessageOrBuilder {
    ERROR_CODE_TYPE getEErrCode();

    ChatRoomBaseInfo getVChatRoomBaseInfos(int i);

    int getVChatRoomBaseInfosCount();

    List<ChatRoomBaseInfo> getVChatRoomBaseInfosList();

    ChatRoomBaseInfoOrBuilder getVChatRoomBaseInfosOrBuilder(int i);

    List<? extends ChatRoomBaseInfoOrBuilder> getVChatRoomBaseInfosOrBuilderList();

    boolean hasEErrCode();
}
