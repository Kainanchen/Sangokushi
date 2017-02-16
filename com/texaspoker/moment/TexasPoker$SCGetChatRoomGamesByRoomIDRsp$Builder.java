package com.texaspoker.moment;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage.Builder;
import com.google.protobuf.GeneratedMessage.BuilderParent;
import com.google.protobuf.GeneratedMessage.FieldAccessorTable;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.RepeatedFieldBuilder;
import com.google.protobuf.SingleFieldBuilder;
import com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo;
import com.texaspoker.moment.TexasPoker.ChatRoomBaseInfoOrBuilder;
import com.texaspoker.moment.TexasPoker.GameRoomBaseInfo;
import com.texaspoker.moment.TexasPoker.GameRoomBaseInfoOrBuilder;
import com.texaspoker.moment.TexasPoker.SCGetChatRoomGamesByRoomIDRsp;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import java.util.List;

public final class TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder extends Builder<TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder> implements TexasPoker$SCGetChatRoomGamesByRoomIDRspOrBuilder {
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private SingleFieldBuilder<ChatRoomBaseInfo, ChatRoomBaseInfo.Builder, ChatRoomBaseInfoOrBuilder> stChatRoomBaseInfoBuilder_;
    private ChatRoomBaseInfo stChatRoomBaseInfo_;
    private RepeatedFieldBuilder<GameRoomBaseInfo, GameRoomBaseInfo.Builder, GameRoomBaseInfoOrBuilder> vGameRoomBaseInfosBuilder_;
    private List<GameRoomBaseInfo> vGameRoomBaseInfos_;
    private RepeatedFieldBuilder<TexasPoker$SNGGameRoomBaseInfo, TexasPoker$SNGGameRoomBaseInfo.Builder, TexasPoker$SNGGameRoomBaseInfoOrBuilder> vSNGGameRoomBaseInfosBuilder_;
    private List<TexasPoker$SNGGameRoomBaseInfo> vSNGGameRoomBaseInfos_;

    static {
        fixHelper.fixfunc(new int[]{25759, 25760, 25761, 25762, 25763, 25764, 25765, 25766, 25767, 25768, 25769, 25770, 25771, 25772, 25773, 25774, 25775, 25776, 25777, 25778, 25779, 25780, 25781, 25782, 25783, 25784, 25785, 25786, 25787, 25788, 25789, 25790, 25791, 25792, 25793, 25794, 25795, 25796, 25797, 25798, 25799, 25800, 25801, 25802, 25803, 25804, 25805, 25806, 25807, 25808, 25809, 25810, 25811, 25812, 25813, 25814, 25815, 25816, 25817, 25818, 25819, 25820, 25821, 25822, 25823, 25824, 25825, 25826, 25827, 25828, 25829, 25830, 25831, 25832, 25833, 25834, 25835, 25836, 25837, 25838, 25839, 25840, 25841, 25842, 25843});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder();

    private native TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder(BuilderParent builderParent);

    native /* synthetic */ TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder(BuilderParent builderParent, TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder texasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder);

    private native void ensureVGameRoomBaseInfosIsMutable();

    private native void ensureVSNGGameRoomBaseInfosIsMutable();

    private native SingleFieldBuilder<ChatRoomBaseInfo, ChatRoomBaseInfo.Builder, ChatRoomBaseInfoOrBuilder> getStChatRoomBaseInfoFieldBuilder();

    private native RepeatedFieldBuilder<GameRoomBaseInfo, GameRoomBaseInfo.Builder, GameRoomBaseInfoOrBuilder> getVGameRoomBaseInfosFieldBuilder();

    private native RepeatedFieldBuilder<TexasPoker$SNGGameRoomBaseInfo, TexasPoker$SNGGameRoomBaseInfo.Builder, TexasPoker$SNGGameRoomBaseInfoOrBuilder> getVSNGGameRoomBaseInfosFieldBuilder();

    private native void maybeForceBuilderInitialization();

    public final native TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder addAllVGameRoomBaseInfos(Iterable<? extends GameRoomBaseInfo> iterable);

    public final native TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder addAllVSNGGameRoomBaseInfos(Iterable<? extends TexasPoker$SNGGameRoomBaseInfo> iterable);

    public final native TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder addVGameRoomBaseInfos(int i, GameRoomBaseInfo.Builder builder);

    public final native TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder addVGameRoomBaseInfos(int i, GameRoomBaseInfo gameRoomBaseInfo);

    public final native TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder addVGameRoomBaseInfos(GameRoomBaseInfo.Builder builder);

    public final native TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder addVGameRoomBaseInfos(GameRoomBaseInfo gameRoomBaseInfo);

    public final native GameRoomBaseInfo.Builder addVGameRoomBaseInfosBuilder();

    public final native GameRoomBaseInfo.Builder addVGameRoomBaseInfosBuilder(int i);

    public final native TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder addVSNGGameRoomBaseInfos(int i, TexasPoker$SNGGameRoomBaseInfo.Builder builder);

    public final native TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder addVSNGGameRoomBaseInfos(int i, TexasPoker$SNGGameRoomBaseInfo texasPoker$SNGGameRoomBaseInfo);

    public final native TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder addVSNGGameRoomBaseInfos(TexasPoker$SNGGameRoomBaseInfo.Builder builder);

    public final native TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder addVSNGGameRoomBaseInfos(TexasPoker$SNGGameRoomBaseInfo texasPoker$SNGGameRoomBaseInfo);

    public final native TexasPoker$SNGGameRoomBaseInfo.Builder addVSNGGameRoomBaseInfosBuilder();

    public final native TexasPoker$SNGGameRoomBaseInfo.Builder addVSNGGameRoomBaseInfosBuilder(int i);

    public final native /* bridge */ /* synthetic */ Message build();

    public final native /* bridge */ /* synthetic */ MessageLite m549build();

    public final native SCGetChatRoomGamesByRoomIDRsp m550build();

    public final native /* bridge */ /* synthetic */ Message buildPartial();

    public final native /* bridge */ /* synthetic */ MessageLite m551buildPartial();

    public final native SCGetChatRoomGamesByRoomIDRsp m552buildPartial();

    public final native /* bridge */ /* synthetic */ Builder clear();

    public final native /* bridge */ /* synthetic */ Message.Builder m553clear();

    public final native /* bridge */ /* synthetic */ MessageLite.Builder m554clear();

    public final native TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder m555clear();

    public final native TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder clearEErrCode();

    public final native TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder clearStChatRoomBaseInfo();

    public final native TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder clearVGameRoomBaseInfos();

    public final native TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder clearVSNGGameRoomBaseInfos();

    public final native /* bridge */ /* synthetic */ Builder clone();

    public final native /* bridge */ /* synthetic */ Message.Builder m556clone();

    public final native /* bridge */ /* synthetic */ MessageLite.Builder m557clone();

    public final native TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder m558clone();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m559getDefaultInstanceForType();

    public final native SCGetChatRoomGamesByRoomIDRsp m560getDefaultInstanceForType();

    public final native Descriptor getDescriptorForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native ChatRoomBaseInfo getStChatRoomBaseInfo();

    public final native ChatRoomBaseInfo.Builder getStChatRoomBaseInfoBuilder();

    public final native ChatRoomBaseInfoOrBuilder getStChatRoomBaseInfoOrBuilder();

    public final native GameRoomBaseInfo getVGameRoomBaseInfos(int i);

    public final native GameRoomBaseInfo.Builder getVGameRoomBaseInfosBuilder(int i);

    public final native List<GameRoomBaseInfo.Builder> getVGameRoomBaseInfosBuilderList();

    public final native int getVGameRoomBaseInfosCount();

    public final native List<GameRoomBaseInfo> getVGameRoomBaseInfosList();

    public final native GameRoomBaseInfoOrBuilder getVGameRoomBaseInfosOrBuilder(int i);

    public final native List<? extends GameRoomBaseInfoOrBuilder> getVGameRoomBaseInfosOrBuilderList();

    public final native TexasPoker$SNGGameRoomBaseInfo getVSNGGameRoomBaseInfos(int i);

    public final native TexasPoker$SNGGameRoomBaseInfo.Builder getVSNGGameRoomBaseInfosBuilder(int i);

    public final native List<TexasPoker$SNGGameRoomBaseInfo.Builder> getVSNGGameRoomBaseInfosBuilderList();

    public final native int getVSNGGameRoomBaseInfosCount();

    public final native List<TexasPoker$SNGGameRoomBaseInfo> getVSNGGameRoomBaseInfosList();

    public final native TexasPoker$SNGGameRoomBaseInfoOrBuilder getVSNGGameRoomBaseInfosOrBuilder(int i);

    public final native List<? extends TexasPoker$SNGGameRoomBaseInfoOrBuilder> getVSNGGameRoomBaseInfosOrBuilderList();

    public final native boolean hasEErrCode();

    public final native boolean hasStChatRoomBaseInfo();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    public final native /* bridge */ /* synthetic */ AbstractMessage.Builder mergeFrom(Message message);

    public final native /* bridge */ /* synthetic */ Message.Builder m561mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    public final native /* bridge */ /* synthetic */ Message.Builder m562mergeFrom(Message message);

    public final native /* bridge */ /* synthetic */ MessageLite.Builder m563mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    public final native TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder m564mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    public final native TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder m565mergeFrom(Message message);

    public final native TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder mergeFrom(SCGetChatRoomGamesByRoomIDRsp sCGetChatRoomGamesByRoomIDRsp);

    public final native TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder mergeStChatRoomBaseInfo(ChatRoomBaseInfo chatRoomBaseInfo);

    public final native TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder removeVGameRoomBaseInfos(int i);

    public final native TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder removeVSNGGameRoomBaseInfos(int i);

    public final native TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

    public final native TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder setStChatRoomBaseInfo(ChatRoomBaseInfo.Builder builder);

    public final native TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder setStChatRoomBaseInfo(ChatRoomBaseInfo chatRoomBaseInfo);

    public final native TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder setVGameRoomBaseInfos(int i, GameRoomBaseInfo.Builder builder);

    public final native TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder setVGameRoomBaseInfos(int i, GameRoomBaseInfo gameRoomBaseInfo);

    public final native TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder setVSNGGameRoomBaseInfos(int i, TexasPoker$SNGGameRoomBaseInfo.Builder builder);

    public final native TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder setVSNGGameRoomBaseInfos(int i, TexasPoker$SNGGameRoomBaseInfo texasPoker$SNGGameRoomBaseInfo);

    public static final Descriptor getDescriptor() {
        return TexasPoker.bn();
    }

    private static TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder create() {
        return new TexasPoker$SCGetChatRoomGamesByRoomIDRsp$Builder();
    }
}
