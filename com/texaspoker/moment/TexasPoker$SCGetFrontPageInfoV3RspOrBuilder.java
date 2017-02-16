package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPoker.GameRoomBaseInfo;
import com.texaspoker.moment.TexasPoker.GameRoomBaseInfoOrBuilder;
import com.texaspoker.moment.TexasPoker.QuickGameRoomInfo;
import com.texaspoker.moment.TexasPoker.QuickGameRoomInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import java.util.List;

public interface TexasPoker$SCGetFrontPageInfoV3RspOrBuilder extends MessageOrBuilder {
    ERROR_CODE_TYPE getEErrCode();

    int getIOffset();

    GameRoomBaseInfo getVGameRoomBaseInfos(int i);

    int getVGameRoomBaseInfosCount();

    List<GameRoomBaseInfo> getVGameRoomBaseInfosList();

    GameRoomBaseInfoOrBuilder getVGameRoomBaseInfosOrBuilder(int i);

    List<? extends GameRoomBaseInfoOrBuilder> getVGameRoomBaseInfosOrBuilderList();

    QuickGameRoomInfo getVQuickGameRoomInfos(int i);

    int getVQuickGameRoomInfosCount();

    List<QuickGameRoomInfo> getVQuickGameRoomInfosList();

    QuickGameRoomInfoOrBuilder getVQuickGameRoomInfosOrBuilder(int i);

    List<? extends QuickGameRoomInfoOrBuilder> getVQuickGameRoomInfosOrBuilderList();

    TexasPoker$SNGGameRoomBaseInfo getVSNGGameRoomBaseInfos(int i);

    int getVSNGGameRoomBaseInfosCount();

    List<TexasPoker$SNGGameRoomBaseInfo> getVSNGGameRoomBaseInfosList();

    TexasPoker$SNGGameRoomBaseInfoOrBuilder getVSNGGameRoomBaseInfosOrBuilder(int i);

    List<? extends TexasPoker$SNGGameRoomBaseInfoOrBuilder> getVSNGGameRoomBaseInfosOrBuilderList();

    boolean hasEErrCode();

    boolean hasIOffset();
}
