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

public final class TexasPoker$SCSetChatRoomUserRsp extends GeneratedMessage implements TexasPoker$SCSetChatRoomUserRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static Parser<TexasPoker$SCSetChatRoomUserRsp> PARSER = null;
    public static final int STCHATROOMINFO_FIELD_NUMBER = 2;
    private static final TexasPoker$SCSetChatRoomUserRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private ChatRoomInfo stChatRoomInfo_;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCSetChatRoomUserRsp.1 */
    class C00451 extends AbstractParser<TexasPoker$SCSetChatRoomUserRsp> {
        static {
            fixHelper.fixfunc(new int[]{14252, 14253});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00451();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCSetChatRoomUserRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCSetChatRoomUserRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private SingleFieldBuilder<ChatRoomInfo, com.texaspoker.moment.TexasPoker.ChatRoomInfo.Builder, ChatRoomInfoOrBuilder> stChatRoomInfoBuilder_;
        private ChatRoomInfo stChatRoomInfo_;

        static {
            fixHelper.fixfunc(new int[]{27045, 27046, 27047, 27048, 27049, 27050, 27051, 27052, 27053, 27054, 27055, 27056, 27057, 27058, 27059, 27060, 27061, 27062, 27063, 27064, 27065, 27066, 27067, 27068, 27069, 27070, 27071, 27072, 27073, 27074, 27075, 27076, 27077, 27078, 27079, 27080, 27081, 27082, 27083, 27084, 27085, 27086, 27087, 27088, 27089});
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

        public final native /* bridge */ /* synthetic */ MessageLite m2061build();

        public final native TexasPoker$SCSetChatRoomUserRsp m2062build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m2063buildPartial();

        public final native TexasPoker$SCSetChatRoomUserRsp m2064buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2065clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2066clear();

        public final native Builder m2067clear();

        public final native Builder clearEErrCode();

        public final native Builder clearStChatRoomInfo();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2068clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2070clone();

        public final native Builder m2071clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2073getDefaultInstanceForType();

        public final native TexasPoker$SCSetChatRoomUserRsp m2074getDefaultInstanceForType();

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

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2079mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2081mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2082mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2083mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2084mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCSetChatRoomUserRsp texasPoker$SCSetChatRoomUserRsp);

        public final native Builder mergeStChatRoomInfo(ChatRoomInfo chatRoomInfo);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setStChatRoomInfo(com.texaspoker.moment.TexasPoker.ChatRoomInfo.Builder builder);

        public final native Builder setStChatRoomInfo(ChatRoomInfo chatRoomInfo);

        public static final Descriptor getDescriptor() {
            return TexasPoker.aL();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{31369, 31370, 31371, 31372, 31373, 31374, 31375, 31376, 31377, 31378, 31379, 31380, 31381, 31382, 31383, 31384, 31385, 31386, 31387, 31388, 31389, 31390, 31391, 31392, 31393, 31394, 31395, 31396, 31397});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCSetChatRoomUserRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCSetChatRoomUserRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCSetChatRoomUserRsp texasPoker$SCSetChatRoomUserRsp);

    private native TexasPoker$SCSetChatRoomUserRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCSetChatRoomUserRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCSetChatRoomUserRsp texasPoker$SCSetChatRoomUserRsp);

    private native TexasPoker$SCSetChatRoomUserRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m2054getDefaultInstanceForType();

    public final native TexasPoker$SCSetChatRoomUserRsp m2055getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native Parser<TexasPoker$SCSetChatRoomUserRsp> getParserForType();

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

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2056newBuilderForType();

    public final native Builder m2057newBuilderForType();

    protected final native Builder m2058newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2059toBuilder();

    public final native Builder m2060toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCSetChatRoomUserRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.aL();
    }

    static void __clinit__() {
        PARSER = new C00451();
        TexasPoker$SCSetChatRoomUserRsp texasPoker$SCSetChatRoomUserRsp = new TexasPoker$SCSetChatRoomUserRsp(true);
        defaultInstance = texasPoker$SCSetChatRoomUserRsp;
        texasPoker$SCSetChatRoomUserRsp.initFields();
    }

    public static TexasPoker$SCSetChatRoomUserRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCSetChatRoomUserRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCSetChatRoomUserRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSetChatRoomUserRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCSetChatRoomUserRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCSetChatRoomUserRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCSetChatRoomUserRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSetChatRoomUserRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCSetChatRoomUserRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCSetChatRoomUserRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCSetChatRoomUserRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSetChatRoomUserRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCSetChatRoomUserRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCSetChatRoomUserRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCSetChatRoomUserRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSetChatRoomUserRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCSetChatRoomUserRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCSetChatRoomUserRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCSetChatRoomUserRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSetChatRoomUserRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCSetChatRoomUserRsp texasPoker$SCSetChatRoomUserRsp) {
        return newBuilder().mergeFrom(texasPoker$SCSetChatRoomUserRsp);
    }
}
