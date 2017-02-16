package com.texaspoker.moment;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessage.BuilderParent;
import com.google.protobuf.GeneratedMessage.FieldAccessorTable;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilder;
import com.google.protobuf.UnknownFieldSet;
import com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo;
import com.texaspoker.moment.TexasPoker.ChatRoomBaseInfoOrBuilder;
import com.texaspoker.moment.TexasPoker.GameRoomInfo;
import com.texaspoker.moment.TexasPoker.GameRoomInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo;
import com.texaspoker.moment.TexasPokerCommon.ClubBaseInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import java.io.InputStream;
import java.util.List;

public final class TexasPoker$SCGetFrontPageInfoRsp extends GeneratedMessage implements TexasPoker$SCGetFrontPageInfoRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static Parser<TexasPoker$SCGetFrontPageInfoRsp> PARSER = null;
    public static final int STCHATROOMBASEINFO_FIELD_NUMBER = 2;
    public static final int STGAMEROOMINFO_FIELD_NUMBER = 3;
    public static final int VCLUBBASEINFOS_FIELD_NUMBER = 4;
    private static final TexasPoker$SCGetFrontPageInfoRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<ChatRoomBaseInfo> stChatRoomBaseInfo_;
    private List<GameRoomInfo> stGameRoomInfo_;
    private final UnknownFieldSet unknownFields;
    private List<ClubBaseInfo> vClubBaseInfos_;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCGetFrontPageInfoRsp.1 */
    class C00041 extends AbstractParser<TexasPoker$SCGetFrontPageInfoRsp> {
        static {
            fixHelper.fixfunc(new int[]{29861, 29862});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00041();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCGetFrontPageInfoRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCGetFrontPageInfoRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private RepeatedFieldBuilder<ChatRoomBaseInfo, com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo.Builder, ChatRoomBaseInfoOrBuilder> stChatRoomBaseInfoBuilder_;
        private List<ChatRoomBaseInfo> stChatRoomBaseInfo_;
        private RepeatedFieldBuilder<GameRoomInfo, com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder, GameRoomInfoOrBuilder> stGameRoomInfoBuilder_;
        private List<GameRoomInfo> stGameRoomInfo_;
        private RepeatedFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> vClubBaseInfosBuilder_;
        private List<ClubBaseInfo> vClubBaseInfos_;

        static {
            fixHelper.fixfunc(new int[]{28106, 28107, 28108, 28109, 28110, 28111, 28112, 28113, 28114, 28115, 28116, 28117, 28118, 28119, 28120, 28121, 28122, 28123, 28124, 28125, 28126, 28127, 28128, 28129, 28130, 28131, 28132, 28133, 28134, 28135, 28136, 28137, 28138, 28139, 28140, 28141, 28142, 28143, 28144, 28145, 28146, 28147, 28148, 28149, 28150, 28151, 28152, 28153, 28154, 28155, 28156, 28157, 28158, 28159, 28160, 28161, 28162, 28163, 28164, 28165, 28166, 28167, 28168, 28169, 28170, 28171, 28172, 28173, 28174, 28175, 28176, 28177, 28178, 28179, 28180, 28181, 28182, 28183, 28184, 28185, 28186, 28187, 28188, 28189, 28190, 28191, 28192, 28193, 28194, 28195, 28196, 28197, 28198, 28199, 28200, 28201});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void ensureStChatRoomBaseInfoIsMutable();

        private native void ensureStGameRoomInfoIsMutable();

        private native void ensureVClubBaseInfosIsMutable();

        private native RepeatedFieldBuilder<ChatRoomBaseInfo, com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo.Builder, ChatRoomBaseInfoOrBuilder> getStChatRoomBaseInfoFieldBuilder();

        private native RepeatedFieldBuilder<GameRoomInfo, com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder, GameRoomInfoOrBuilder> getStGameRoomInfoFieldBuilder();

        private native RepeatedFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> getVClubBaseInfosFieldBuilder();

        private native void maybeForceBuilderInitialization();

        public final native Builder addAllStChatRoomBaseInfo(Iterable<? extends ChatRoomBaseInfo> iterable);

        public final native Builder addAllStGameRoomInfo(Iterable<? extends GameRoomInfo> iterable);

        public final native Builder addAllVClubBaseInfos(Iterable<? extends ClubBaseInfo> iterable);

        public final native Builder addStChatRoomBaseInfo(int i, com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo.Builder builder);

        public final native Builder addStChatRoomBaseInfo(int i, ChatRoomBaseInfo chatRoomBaseInfo);

        public final native Builder addStChatRoomBaseInfo(com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo.Builder builder);

        public final native Builder addStChatRoomBaseInfo(ChatRoomBaseInfo chatRoomBaseInfo);

        public final native com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo.Builder addStChatRoomBaseInfoBuilder();

        public final native com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo.Builder addStChatRoomBaseInfoBuilder(int i);

        public final native Builder addStGameRoomInfo(int i, com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder builder);

        public final native Builder addStGameRoomInfo(int i, GameRoomInfo gameRoomInfo);

        public final native Builder addStGameRoomInfo(com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder builder);

        public final native Builder addStGameRoomInfo(GameRoomInfo gameRoomInfo);

        public final native com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder addStGameRoomInfoBuilder();

        public final native com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder addStGameRoomInfoBuilder(int i);

        public final native Builder addVClubBaseInfos(int i, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

        public final native Builder addVClubBaseInfos(int i, ClubBaseInfo clubBaseInfo);

        public final native Builder addVClubBaseInfos(com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

        public final native Builder addVClubBaseInfos(ClubBaseInfo clubBaseInfo);

        public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder addVClubBaseInfosBuilder();

        public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder addVClubBaseInfosBuilder(int i);

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m669build();

        public final native TexasPoker$SCGetFrontPageInfoRsp m670build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m671buildPartial();

        public final native TexasPoker$SCGetFrontPageInfoRsp m672buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m673clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m674clear();

        public final native Builder m675clear();

        public final native Builder clearEErrCode();

        public final native Builder clearStChatRoomBaseInfo();

        public final native Builder clearStGameRoomInfo();

        public final native Builder clearVClubBaseInfos();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m676clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m677clone();

        public final native Builder m678clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m679getDefaultInstanceForType();

        public final native TexasPoker$SCGetFrontPageInfoRsp m680getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native ChatRoomBaseInfo getStChatRoomBaseInfo(int i);

        public final native com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo.Builder getStChatRoomBaseInfoBuilder(int i);

        public final native List<com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo.Builder> getStChatRoomBaseInfoBuilderList();

        public final native int getStChatRoomBaseInfoCount();

        public final native List<ChatRoomBaseInfo> getStChatRoomBaseInfoList();

        public final native ChatRoomBaseInfoOrBuilder getStChatRoomBaseInfoOrBuilder(int i);

        public final native List<? extends ChatRoomBaseInfoOrBuilder> getStChatRoomBaseInfoOrBuilderList();

        public final native GameRoomInfo getStGameRoomInfo(int i);

        public final native com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder getStGameRoomInfoBuilder(int i);

        public final native List<com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder> getStGameRoomInfoBuilderList();

        public final native int getStGameRoomInfoCount();

        public final native List<GameRoomInfo> getStGameRoomInfoList();

        public final native GameRoomInfoOrBuilder getStGameRoomInfoOrBuilder(int i);

        public final native List<? extends GameRoomInfoOrBuilder> getStGameRoomInfoOrBuilderList();

        public final native ClubBaseInfo getVClubBaseInfos(int i);

        public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder getVClubBaseInfosBuilder(int i);

        public final native List<com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder> getVClubBaseInfosBuilderList();

        public final native int getVClubBaseInfosCount();

        public final native List<ClubBaseInfo> getVClubBaseInfosList();

        public final native ClubBaseInfoOrBuilder getVClubBaseInfosOrBuilder(int i);

        public final native List<? extends ClubBaseInfoOrBuilder> getVClubBaseInfosOrBuilderList();

        public final native boolean hasEErrCode();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m681mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m682mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m683mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m684mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m685mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCGetFrontPageInfoRsp texasPoker$SCGetFrontPageInfoRsp);

        public final native Builder removeStChatRoomBaseInfo(int i);

        public final native Builder removeStGameRoomInfo(int i);

        public final native Builder removeVClubBaseInfos(int i);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setStChatRoomBaseInfo(int i, com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo.Builder builder);

        public final native Builder setStChatRoomBaseInfo(int i, ChatRoomBaseInfo chatRoomBaseInfo);

        public final native Builder setStGameRoomInfo(int i, com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder builder);

        public final native Builder setStGameRoomInfo(int i, GameRoomInfo gameRoomInfo);

        public final native Builder setVClubBaseInfos(int i, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

        public final native Builder setVClubBaseInfos(int i, ClubBaseInfo clubBaseInfo);

        public static final Descriptor getDescriptor() {
            return TexasPoker.fD();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{30718, 30719, 30720, 30721, 30722, 30723, 30724, 30725, 30726, 30727, 30728, 30729, 30730, 30731, 30732, 30733, 30734, 30735, 30736, 30737, 30738, 30739, 30740, 30741, 30742, 30743, 30744, 30745, 30746, 30747, 30748, 30749, 30750, 30751, 30752, 30753, 30754, 30755, 30756, 30757, 30758});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCGetFrontPageInfoRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCGetFrontPageInfoRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCGetFrontPageInfoRsp texasPoker$SCGetFrontPageInfoRsp);

    private native TexasPoker$SCGetFrontPageInfoRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCGetFrontPageInfoRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCGetFrontPageInfoRsp texasPoker$SCGetFrontPageInfoRsp);

    private native TexasPoker$SCGetFrontPageInfoRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m662getDefaultInstanceForType();

    public final native TexasPoker$SCGetFrontPageInfoRsp m663getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native Parser<TexasPoker$SCGetFrontPageInfoRsp> getParserForType();

    public final native int getSerializedSize();

    public final native ChatRoomBaseInfo getStChatRoomBaseInfo(int i);

    public final native int getStChatRoomBaseInfoCount();

    public final native List<ChatRoomBaseInfo> getStChatRoomBaseInfoList();

    public final native ChatRoomBaseInfoOrBuilder getStChatRoomBaseInfoOrBuilder(int i);

    public final native List<? extends ChatRoomBaseInfoOrBuilder> getStChatRoomBaseInfoOrBuilderList();

    public final native GameRoomInfo getStGameRoomInfo(int i);

    public final native int getStGameRoomInfoCount();

    public final native List<GameRoomInfo> getStGameRoomInfoList();

    public final native GameRoomInfoOrBuilder getStGameRoomInfoOrBuilder(int i);

    public final native List<? extends GameRoomInfoOrBuilder> getStGameRoomInfoOrBuilderList();

    public final native UnknownFieldSet getUnknownFields();

    public final native ClubBaseInfo getVClubBaseInfos(int i);

    public final native int getVClubBaseInfosCount();

    public final native List<ClubBaseInfo> getVClubBaseInfosList();

    public final native ClubBaseInfoOrBuilder getVClubBaseInfosOrBuilder(int i);

    public final native List<? extends ClubBaseInfoOrBuilder> getVClubBaseInfosOrBuilderList();

    public final native boolean hasEErrCode();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m664newBuilderForType();

    public final native Builder m665newBuilderForType();

    protected final native Builder m666newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m667toBuilder();

    public final native Builder m668toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCGetFrontPageInfoRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.fD();
    }

    static void __clinit__() {
        PARSER = new C00041();
        TexasPoker$SCGetFrontPageInfoRsp texasPoker$SCGetFrontPageInfoRsp = new TexasPoker$SCGetFrontPageInfoRsp(true);
        defaultInstance = texasPoker$SCGetFrontPageInfoRsp;
        texasPoker$SCGetFrontPageInfoRsp.initFields();
    }

    public static TexasPoker$SCGetFrontPageInfoRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCGetFrontPageInfoRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCGetFrontPageInfoRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetFrontPageInfoRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCGetFrontPageInfoRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCGetFrontPageInfoRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCGetFrontPageInfoRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetFrontPageInfoRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCGetFrontPageInfoRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCGetFrontPageInfoRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCGetFrontPageInfoRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetFrontPageInfoRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCGetFrontPageInfoRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCGetFrontPageInfoRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCGetFrontPageInfoRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetFrontPageInfoRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCGetFrontPageInfoRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCGetFrontPageInfoRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCGetFrontPageInfoRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetFrontPageInfoRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCGetFrontPageInfoRsp texasPoker$SCGetFrontPageInfoRsp) {
        return newBuilder().mergeFrom(texasPoker$SCGetFrontPageInfoRsp);
    }
}
