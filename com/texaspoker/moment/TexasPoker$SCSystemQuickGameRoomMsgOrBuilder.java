package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPoker.QuickGameRoomPushMsg;
import com.texaspoker.moment.TexasPoker.QuickGameRoomPushMsgOrBuilder;
import java.util.List;

public interface TexasPoker$SCSystemQuickGameRoomMsgOrBuilder extends MessageOrBuilder {
    QuickGameRoomPushMsg getVMsgs(int i);

    int getVMsgsCount();

    List<QuickGameRoomPushMsg> getVMsgsList();

    QuickGameRoomPushMsgOrBuilder getVMsgsOrBuilder(int i);

    List<? extends QuickGameRoomPushMsgOrBuilder> getVMsgsOrBuilderList();
}
