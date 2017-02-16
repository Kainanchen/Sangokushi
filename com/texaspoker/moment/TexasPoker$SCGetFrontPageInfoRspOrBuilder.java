package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo;
import com.texaspoker.moment.TexasPoker.ChatRoomBaseInfoOrBuilder;
import com.texaspoker.moment.TexasPoker.GameRoomInfo;
import com.texaspoker.moment.TexasPoker.GameRoomInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo;
import com.texaspoker.moment.TexasPokerCommon.ClubBaseInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import java.util.List;

public interface TexasPoker$SCGetFrontPageInfoRspOrBuilder extends MessageOrBuilder {
    ERROR_CODE_TYPE getEErrCode();

    ChatRoomBaseInfo getStChatRoomBaseInfo(int i);

    int getStChatRoomBaseInfoCount();

    List<ChatRoomBaseInfo> getStChatRoomBaseInfoList();

    ChatRoomBaseInfoOrBuilder getStChatRoomBaseInfoOrBuilder(int i);

    List<? extends ChatRoomBaseInfoOrBuilder> getStChatRoomBaseInfoOrBuilderList();

    GameRoomInfo getStGameRoomInfo(int i);

    int getStGameRoomInfoCount();

    List<GameRoomInfo> getStGameRoomInfoList();

    GameRoomInfoOrBuilder getStGameRoomInfoOrBuilder(int i);

    List<? extends GameRoomInfoOrBuilder> getStGameRoomInfoOrBuilderList();

    ClubBaseInfo getVClubBaseInfos(int i);

    int getVClubBaseInfosCount();

    List<ClubBaseInfo> getVClubBaseInfosList();

    ClubBaseInfoOrBuilder getVClubBaseInfosOrBuilder(int i);

    List<? extends ClubBaseInfoOrBuilder> getVClubBaseInfosOrBuilderList();

    boolean hasEErrCode();
}
