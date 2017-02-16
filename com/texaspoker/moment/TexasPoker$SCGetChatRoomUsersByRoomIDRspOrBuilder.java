package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo;
import com.texaspoker.moment.TexasPoker.ChatRoomBaseInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNetOrBuilder;
import java.util.List;

public interface TexasPoker$SCGetChatRoomUsersByRoomIDRspOrBuilder extends MessageOrBuilder {
    ERROR_CODE_TYPE getEErrCode();

    ChatRoomBaseInfo getStChatRoomBaseInfo();

    ChatRoomBaseInfoOrBuilder getStChatRoomBaseInfoOrBuilder();

    UserBaseInfoNet getVUserBaseInfos(int i);

    int getVUserBaseInfosCount();

    List<UserBaseInfoNet> getVUserBaseInfosList();

    UserBaseInfoNetOrBuilder getVUserBaseInfosOrBuilder(int i);

    List<? extends UserBaseInfoNetOrBuilder> getVUserBaseInfosOrBuilderList();

    boolean hasEErrCode();

    boolean hasStChatRoomBaseInfo();
}
