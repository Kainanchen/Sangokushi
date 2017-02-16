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
import com.google.protobuf.SingleFieldBuilder;
import com.google.protobuf.UnknownFieldSet;
import com.texaspoker.moment.TexasPoker.ChatRoomInfo;
import com.texaspoker.moment.TexasPoker.ChatRoomInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import java.io.InputStream;

public final class TexasPoker$SCGetChatRoomInfoByRoomIDRsp extends GeneratedMessage implements TexasPoker$SCGetChatRoomInfoByRoomIDRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static Parser<TexasPoker$SCGetChatRoomInfoByRoomIDRsp> PARSER = null;
    public static final int STCHATROOMINFO_FIELD_NUMBER = 2;
    private static final TexasPoker$SCGetChatRoomInfoByRoomIDRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private ChatRoomInfo stChatRoomInfo_;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCGetChatRoomInfoByRoomIDRsp.1 */
    class C00001 extends AbstractParser<TexasPoker$SCGetChatRoomInfoByRoomIDRsp> {
        static {
            fixHelper.fixfunc(new int[]{5104, 5105});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00001();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCGetChatRoomInfoByRoomIDRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCGetChatRoomInfoByRoomIDRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private SingleFieldBuilder<ChatRoomInfo, com.texaspoker.moment.TexasPoker.ChatRoomInfo.Builder, ChatRoomInfoOrBuilder> stChatRoomInfoBuilder_;
        private ChatRoomInfo stChatRoomInfo_;

        static {
            fixHelper.fixfunc(new int[]{11146, 11147, 11148, 11149, 11150, 11151, 11152, 11153, 11154, 11155, 11156, 11157, 11158, 11159, 11160, 11161, 11162, 11163, 11164, 11165, 11166, 11167, 11168, 11169, 11170, 11171, 11172, 11173, 11174, 11175, 11176, 11177, 11178, 11179, 11180, 11181, 11182, 11183, 11184, 11185, 11186, 11187, 11188, 11189, 11190});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native SingleFieldBuilder<ChatRoomInfo, com.texaspoker.moment.TexasPoker.ChatRoomInfo.Builder, ChatRoomInfoOrBuilder> getStChatRoomInfoFieldBuilder();

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m621build();

        public final native TexasPoker$SCGetChatRoomInfoByRoomIDRsp m622build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m623buildPartial();

        public final native TexasPoker$SCGetChatRoomInfoByRoomIDRsp m624buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m625clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m626clear();

        public final native Builder m627clear();

        public final native Builder clearEErrCode();

        public final native Builder clearStChatRoomInfo();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m628clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m629clone();

        public final native Builder m630clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m631getDefaultInstanceForType();

        public final native TexasPoker$SCGetChatRoomInfoByRoomIDRsp m632getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native ChatRoomInfo getStChatRoomInfo();

        public final native com.texaspoker.moment.TexasPoker.ChatRoomInfo.Builder getStChatRoomInfoBuilder();

        public final native ChatRoomInfoOrBuilder getStChatRoomInfoOrBuilder();

        public final native boolean hasEErrCode();

        public final native boolean hasStChatRoomInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m633mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m634mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m635mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m636mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m637mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCGetChatRoomInfoByRoomIDRsp texasPoker$SCGetChatRoomInfoByRoomIDRsp);

        public final native Builder mergeStChatRoomInfo(ChatRoomInfo chatRoomInfo);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setStChatRoomInfo(com.texaspoker.moment.TexasPoker.ChatRoomInfo.Builder builder);

        public final native Builder setStChatRoomInfo(ChatRoomInfo chatRoomInfo);

        public static final Descriptor getDescriptor() {
            return TexasPoker.bf();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{20231, 20232, 20233, 20234, 20235, 20236, 20237, 20238, 20239, 20240, 20241, 20242, 20243, 20244, 20245, 20246, 20247, 20248, 20249, 20250, 20251, 20252, 20253, 20254, 20255, 20256, 20257, 20258, 20259});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCGetChatRoomInfoByRoomIDRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCGetChatRoomInfoByRoomIDRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCGetChatRoomInfoByRoomIDRsp texasPoker$SCGetChatRoomInfoByRoomIDRsp);

    private native TexasPoker$SCGetChatRoomInfoByRoomIDRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCGetChatRoomInfoByRoomIDRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCGetChatRoomInfoByRoomIDRsp texasPoker$SCGetChatRoomInfoByRoomIDRsp);

    private native TexasPoker$SCGetChatRoomInfoByRoomIDRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m614getDefaultInstanceForType();

    public final native TexasPoker$SCGetChatRoomInfoByRoomIDRsp m615getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native Parser<TexasPoker$SCGetChatRoomInfoByRoomIDRsp> getParserForType();

    public final native int getSerializedSize();

    public final native ChatRoomInfo getStChatRoomInfo();

    public final native ChatRoomInfoOrBuilder getStChatRoomInfoOrBuilder();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    public final native boolean hasStChatRoomInfo();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m616newBuilderForType();

    public final native Builder m617newBuilderForType();

    protected final native Builder m618newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m619toBuilder();

    public final native Builder m620toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCGetChatRoomInfoByRoomIDRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.bf();
    }

    static void __clinit__() {
        PARSER = new C00001();
        TexasPoker$SCGetChatRoomInfoByRoomIDRsp texasPoker$SCGetChatRoomInfoByRoomIDRsp = new TexasPoker$SCGetChatRoomInfoByRoomIDRsp(true);
        defaultInstance = texasPoker$SCGetChatRoomInfoByRoomIDRsp;
        texasPoker$SCGetChatRoomInfoByRoomIDRsp.initFields();
    }

    public static TexasPoker$SCGetChatRoomInfoByRoomIDRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCGetChatRoomInfoByRoomIDRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCGetChatRoomInfoByRoomIDRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetChatRoomInfoByRoomIDRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCGetChatRoomInfoByRoomIDRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCGetChatRoomInfoByRoomIDRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCGetChatRoomInfoByRoomIDRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetChatRoomInfoByRoomIDRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCGetChatRoomInfoByRoomIDRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCGetChatRoomInfoByRoomIDRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCGetChatRoomInfoByRoomIDRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetChatRoomInfoByRoomIDRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCGetChatRoomInfoByRoomIDRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCGetChatRoomInfoByRoomIDRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCGetChatRoomInfoByRoomIDRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetChatRoomInfoByRoomIDRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCGetChatRoomInfoByRoomIDRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCGetChatRoomInfoByRoomIDRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCGetChatRoomInfoByRoomIDRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetChatRoomInfoByRoomIDRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCGetChatRoomInfoByRoomIDRsp texasPoker$SCGetChatRoomInfoByRoomIDRsp) {
        return newBuilder().mergeFrom(texasPoker$SCGetChatRoomInfoByRoomIDRsp);
    }
}
