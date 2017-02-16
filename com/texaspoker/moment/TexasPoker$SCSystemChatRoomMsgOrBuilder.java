package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPoker.ChatRoomPushMsg;
import com.texaspoker.moment.TexasPoker.ChatRoomPushMsgOrBuilder;
import java.util.List;

public interface TexasPoker$SCSystemChatRoomMsgOrBuilder extends MessageOrBuilder {
    ChatRoomPushMsg getVMsgs(int i);

    int getVMsgsCount();

    List<ChatRoomPushMsg> getVMsgsList();

    ChatRoomPushMsgOrBuilder getVMsgsOrBuilder(int i);

    List<? extends ChatRoomPushMsgOrBuilder> getVMsgsOrBuilderList();
}
