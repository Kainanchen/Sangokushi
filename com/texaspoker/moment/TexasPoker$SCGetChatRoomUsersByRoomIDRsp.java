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
import com.google.protobuf.SingleFieldBuilder;
import com.google.protobuf.UnknownFieldSet;
import com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo;
import com.texaspoker.moment.TexasPoker.ChatRoomBaseInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNetOrBuilder;
import java.io.InputStream;
import java.util.List;

public final class TexasPoker$SCGetChatRoomUsersByRoomIDRsp extends GeneratedMessage implements TexasPoker$SCGetChatRoomUsersByRoomIDRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static Parser<TexasPoker$SCGetChatRoomUsersByRoomIDRsp> PARSER = null;
    public static final int STCHATROOMBASEINFO_FIELD_NUMBER = 2;
    public static final int VUSERBASEINFOS_FIELD_NUMBER = 3;
    private static final TexasPoker$SCGetChatRoomUsersByRoomIDRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private ChatRoomBaseInfo stChatRoomBaseInfo_;
    private final UnknownFieldSet unknownFields;
    private List<UserBaseInfoNet> vUserBaseInfos_;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCGetChatRoomUsersByRoomIDRsp.1 */
    class C00021 extends AbstractParser<TexasPoker$SCGetChatRoomUsersByRoomIDRsp> {
        static {
            fixHelper.fixfunc(new int[]{23258, 23259});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00021();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCGetChatRoomUsersByRoomIDRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCGetChatRoomUsersByRoomIDRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private SingleFieldBuilder<ChatRoomBaseInfo, com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo.Builder, ChatRoomBaseInfoOrBuilder> stChatRoomBaseInfoBuilder_;
        private ChatRoomBaseInfo stChatRoomBaseInfo_;
        private RepeatedFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> vUserBaseInfosBuilder_;
        private List<UserBaseInfoNet> vUserBaseInfos_;

        static {
            fixHelper.fixfunc(new int[]{27694, 27695, 27696, 27697, 27698, 27699, 27700, 27701, 27702, 27703, 27704, 27705, 27706, 27707, 27708, 27709, 27710, 27711, 27712, 27713, 27714, 27715, 27716, 27717, 27718, 27719, 27720, 27721, 27722, 27723, 27724, 27725, 27726, 27727, 27728, 27729, 27730, 27731, 27732, 27733, 27734, 27735, 27736, 27737, 27738, 27739, 27740, 27741, 27742, 27743, 27744, 27745, 27746, 27747, 27748, 27749, 27750, 27751, 27752, 27753, 27754, 27755, 27756, 27757, 27758});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void ensureVUserBaseInfosIsMutable();

        private native SingleFieldBuilder<ChatRoomBaseInfo, com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo.Builder, ChatRoomBaseInfoOrBuilder> getStChatRoomBaseInfoFieldBuilder();

        private native RepeatedFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> getVUserBaseInfosFieldBuilder();

        private native void maybeForceBuilderInitialization();

        public final native Builder addAllVUserBaseInfos(Iterable<? extends UserBaseInfoNet> iterable);

        public final native Builder addVUserBaseInfos(int i, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

        public final native Builder addVUserBaseInfos(int i, UserBaseInfoNet userBaseInfoNet);

        public final native Builder addVUserBaseInfos(com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

        public final native Builder addVUserBaseInfos(UserBaseInfoNet userBaseInfoNet);

        public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder addVUserBaseInfosBuilder();

        public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder addVUserBaseInfosBuilder(int i);

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m717build();

        public final native TexasPoker$SCGetChatRoomUsersByRoomIDRsp m718build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m719buildPartial();

        public final native TexasPoker$SCGetChatRoomUsersByRoomIDRsp m720buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m721clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m722clear();

        public final native Builder m723clear();

        public final native Builder clearEErrCode();

        public final native Builder clearStChatRoomBaseInfo();

        public final native Builder clearVUserBaseInfos();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m724clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m725clone();

        public final native Builder m726clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m727getDefaultInstanceForType();

        public final native TexasPoker$SCGetChatRoomUsersByRoomIDRsp m728getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native ChatRoomBaseInfo getStChatRoomBaseInfo();

        public final native com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo.Builder getStChatRoomBaseInfoBuilder();

        public final native ChatRoomBaseInfoOrBuilder getStChatRoomBaseInfoOrBuilder();

        public final native UserBaseInfoNet getVUserBaseInfos(int i);

        public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder getVUserBaseInfosBuilder(int i);

        public final native List<com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder> getVUserBaseInfosBuilderList();

        public final native int getVUserBaseInfosCount();

        public final native List<UserBaseInfoNet> getVUserBaseInfosList();

        public final native UserBaseInfoNetOrBuilder getVUserBaseInfosOrBuilder(int i);

        public final native List<? extends UserBaseInfoNetOrBuilder> getVUserBaseInfosOrBuilderList();

        public final native boolean hasEErrCode();

        public final native boolean hasStChatRoomBaseInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m729mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m730mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m731mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m732mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m733mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCGetChatRoomUsersByRoomIDRsp texasPoker$SCGetChatRoomUsersByRoomIDRsp);

        public final native Builder mergeStChatRoomBaseInfo(ChatRoomBaseInfo chatRoomBaseInfo);

        public final native Builder removeVUserBaseInfos(int i);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setStChatRoomBaseInfo(com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo.Builder builder);

        public final native Builder setStChatRoomBaseInfo(ChatRoomBaseInfo chatRoomBaseInfo);

        public final native Builder setVUserBaseInfos(int i, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

        public final native Builder setVUserBaseInfos(int i, UserBaseInfoNet userBaseInfoNet);

        public static final Descriptor getDescriptor() {
            return TexasPoker.bj();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{13709, 13710, 13711, 13712, 13713, 13714, 13715, 13716, 13717, 13718, 13719, 13720, 13721, 13722, 13723, 13724, 13725, 13726, 13727, 13728, 13729, 13730, 13731, 13732, 13733, 13734, 13735, 13736, 13737, 13738, 13739, 13740, 13741, 13742});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCGetChatRoomUsersByRoomIDRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCGetChatRoomUsersByRoomIDRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCGetChatRoomUsersByRoomIDRsp texasPoker$SCGetChatRoomUsersByRoomIDRsp);

    private native TexasPoker$SCGetChatRoomUsersByRoomIDRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCGetChatRoomUsersByRoomIDRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCGetChatRoomUsersByRoomIDRsp texasPoker$SCGetChatRoomUsersByRoomIDRsp);

    private native TexasPoker$SCGetChatRoomUsersByRoomIDRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m710getDefaultInstanceForType();

    public final native TexasPoker$SCGetChatRoomUsersByRoomIDRsp m711getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native Parser<TexasPoker$SCGetChatRoomUsersByRoomIDRsp> getParserForType();

    public final native int getSerializedSize();

    public final native ChatRoomBaseInfo getStChatRoomBaseInfo();

    public final native ChatRoomBaseInfoOrBuilder getStChatRoomBaseInfoOrBuilder();

    public final native UnknownFieldSet getUnknownFields();

    public final native UserBaseInfoNet getVUserBaseInfos(int i);

    public final native int getVUserBaseInfosCount();

    public final native List<UserBaseInfoNet> getVUserBaseInfosList();

    public final native UserBaseInfoNetOrBuilder getVUserBaseInfosOrBuilder(int i);

    public final native List<? extends UserBaseInfoNetOrBuilder> getVUserBaseInfosOrBuilderList();

    public final native boolean hasEErrCode();

    public final native boolean hasStChatRoomBaseInfo();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m712newBuilderForType();

    public final native Builder m713newBuilderForType();

    protected final native Builder m714newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m715toBuilder();

    public final native Builder m716toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCGetChatRoomUsersByRoomIDRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.bj();
    }

    static void __clinit__() {
        PARSER = new C00021();
        TexasPoker$SCGetChatRoomUsersByRoomIDRsp texasPoker$SCGetChatRoomUsersByRoomIDRsp = new TexasPoker$SCGetChatRoomUsersByRoomIDRsp(true);
        defaultInstance = texasPoker$SCGetChatRoomUsersByRoomIDRsp;
        texasPoker$SCGetChatRoomUsersByRoomIDRsp.initFields();
    }

    public static TexasPoker$SCGetChatRoomUsersByRoomIDRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCGetChatRoomUsersByRoomIDRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCGetChatRoomUsersByRoomIDRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetChatRoomUsersByRoomIDRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCGetChatRoomUsersByRoomIDRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCGetChatRoomUsersByRoomIDRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCGetChatRoomUsersByRoomIDRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetChatRoomUsersByRoomIDRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCGetChatRoomUsersByRoomIDRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCGetChatRoomUsersByRoomIDRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCGetChatRoomUsersByRoomIDRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetChatRoomUsersByRoomIDRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCGetChatRoomUsersByRoomIDRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCGetChatRoomUsersByRoomIDRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCGetChatRoomUsersByRoomIDRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetChatRoomUsersByRoomIDRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCGetChatRoomUsersByRoomIDRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCGetChatRoomUsersByRoomIDRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCGetChatRoomUsersByRoomIDRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetChatRoomUsersByRoomIDRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCGetChatRoomUsersByRoomIDRsp texasPoker$SCGetChatRoomUsersByRoomIDRsp) {
        return newBuilder().mergeFrom(texasPoker$SCGetChatRoomUsersByRoomIDRsp);
    }
}
