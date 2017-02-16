package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo;
import com.texaspoker.moment.TexasPoker.ChatRoomBaseInfoOrBuilder;
import com.texaspoker.moment.TexasPoker.GameRoomBaseInfo;
import com.texaspoker.moment.TexasPoker.GameRoomBaseInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import java.util.List;

public interface TexasPoker$SCGetChatRoomGamesByRoomIDRspOrBuilder extends MessageOrBuilder {
    ERROR_CODE_TYPE getEErrCode();

    ChatRoomBaseInfo getStChatRoomBaseInfo();

    ChatRoomBaseInfoOrBuilder getStChatRoomBaseInfoOrBuilder();

    GameRoomBaseInfo getVGameRoomBaseInfos(int i);

    int getVGameRoomBaseInfosCount();

    List<GameRoomBaseInfo> getVGameRoomBaseInfosList();

    GameRoomBaseInfoOrBuilder getVGameRoomBaseInfosOrBuilder(int i);

    List<? extends GameRoomBaseInfoOrBuilder> getVGameRoomBaseInfosOrBuilderList();

    TexasPoker$SNGGameRoomBaseInfo getVSNGGameRoomBaseInfos(int i);

    int getVSNGGameRoomBaseInfosCount();

    List<TexasPoker$SNGGameRoomBaseInfo> getVSNGGameRoomBaseInfosList();

    TexasPoker$SNGGameRoomBaseInfoOrBuilder getVSNGGameRoomBaseInfosOrBuilder(int i);

    List<? extends TexasPoker$SNGGameRoomBaseInfoOrBuilder> getVSNGGameRoomBaseInfosOrBuilderList();

    boolean hasEErrCode();

    boolean hasStChatRoomBaseInfo();
}
