package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPoker.QuickGameRoomInfo;
import com.texaspoker.moment.TexasPoker.QuickGameRoomInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import java.util.List;

public interface TexasPoker$SCGetQuickGameRoomRspOrBuilder extends MessageOrBuilder {
    ERROR_CODE_TYPE getEErrCode();

    QuickGameRoomInfo getVQuickGameRoomInfos(int i);

    int getVQuickGameRoomInfosCount();

    List<QuickGameRoomInfo> getVQuickGameRoomInfosList();

    QuickGameRoomInfoOrBuilder getVQuickGameRoomInfosOrBuilder(int i);

    List<? extends QuickGameRoomInfoOrBuilder> getVQuickGameRoomInfosOrBuilderList();

    boolean hasEErrCode();
}
