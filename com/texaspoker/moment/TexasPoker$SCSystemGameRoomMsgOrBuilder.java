package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPoker.GameRoomPushMsg;
import com.texaspoker.moment.TexasPoker.GameRoomPushMsgOrBuilder;
import java.util.List;

public interface TexasPoker$SCSystemGameRoomMsgOrBuilder extends MessageOrBuilder {
    GameRoomPushMsg getVMsgs(int i);

    int getVMsgsCount();

    List<GameRoomPushMsg> getVMsgsList();

    GameRoomPushMsgOrBuilder getVMsgsOrBuilder(int i);

    List<? extends GameRoomPushMsgOrBuilder> getVMsgsOrBuilderList();
}
