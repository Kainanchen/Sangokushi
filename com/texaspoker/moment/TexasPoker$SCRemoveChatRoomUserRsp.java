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

public final class TexasPoker$SCRemoveChatRoomUserRsp extends GeneratedMessage implements TexasPoker$SCRemoveChatRoomUserRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static Parser<TexasPoker$SCRemoveChatRoomUserRsp> PARSER = null;
    public static final int STCHATROOMINFO_FIELD_NUMBER = 2;
    private static final TexasPoker$SCRemoveChatRoomUserRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private ChatRoomInfo stChatRoomInfo_;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCRemoveChatRoomUserRsp.1 */
    class C00351 extends AbstractParser<TexasPoker$SCRemoveChatRoomUserRsp> {
        static {
            fixHelper.fixfunc(new int[]{8357, 8358});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00351();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCRemoveChatRoomUserRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCRemoveChatRoomUserRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private SingleFieldBuilder<ChatRoomInfo, com.texaspoker.moment.TexasPoker.ChatRoomInfo.Builder, ChatRoomInfoOrBuilder> stChatRoomInfoBuilder_;
        private ChatRoomInfo stChatRoomInfo_;

        static {
            fixHelper.fixfunc(new int[]{12527, 12528, 12529, 12530, 12531, 12532, 12533, 12534, 12535, 12536, 12537, 12538, 12539, 12540, 12541, 12542, 12543, 12544, 12545, 12546, 12547, 12548, 12549, 12550, 12551, 12552, 12553, 12554, 12555, 12556, 12557, 12558, 12559, 12560, 12561, 12562, 12563, 12564, 12565, 12566, 12567, 12568, 12569, 12570, 12571});
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

        public final native /* bridge */ /* synthetic */ MessageLite m1821build();

        public final native TexasPoker$SCRemoveChatRoomUserRsp m1822build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m1823buildPartial();

        public final native TexasPoker$SCRemoveChatRoomUserRsp m1824buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1825clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1826clear();

        public final native Builder m1827clear();

        public final native Builder clearEErrCode();

        public final native Builder clearStChatRoomInfo();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1828clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1829clone();

        public final native Builder m1830clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1831getDefaultInstanceForType();

        public final native TexasPoker$SCRemoveChatRoomUserRsp m1832getDefaultInstanceForType();

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

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1833mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1834mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1835mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1836mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1837mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCRemoveChatRoomUserRsp texasPoker$SCRemoveChatRoomUserRsp);

        public final native Builder mergeStChatRoomInfo(ChatRoomInfo chatRoomInfo);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setStChatRoomInfo(com.texaspoker.moment.TexasPoker.ChatRoomInfo.Builder builder);

        public final native Builder setStChatRoomInfo(ChatRoomInfo chatRoomInfo);

        public static final Descriptor getDescriptor() {
            return TexasPoker.aT();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{16331, 16332, 16333, 16334, 16335, 16336, 16337, 16338, 16339, 16340, 16341, 16342, 16343, 16344, 16345, 16346, 16347, 16348, 16349, 16350, 16351, 16352, 16353, 16354, 16355, 16356, 16357, 16358, 16359});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCRemoveChatRoomUserRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCRemoveChatRoomUserRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCRemoveChatRoomUserRsp texasPoker$SCRemoveChatRoomUserRsp);

    private native TexasPoker$SCRemoveChatRoomUserRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCRemoveChatRoomUserRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCRemoveChatRoomUserRsp texasPoker$SCRemoveChatRoomUserRsp);

    private native TexasPoker$SCRemoveChatRoomUserRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m1810getDefaultInstanceForType();

    public final native TexasPoker$SCRemoveChatRoomUserRsp m1812getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native Parser<TexasPoker$SCRemoveChatRoomUserRsp> getParserForType();

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

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1816newBuilderForType();

    public final native Builder m1817newBuilderForType();

    protected final native Builder m1818newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1819toBuilder();

    public final native Builder m1820toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCRemoveChatRoomUserRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.aT();
    }

    static void __clinit__() {
        PARSER = new C00351();
        TexasPoker$SCRemoveChatRoomUserRsp texasPoker$SCRemoveChatRoomUserRsp = new TexasPoker$SCRemoveChatRoomUserRsp(true);
        defaultInstance = texasPoker$SCRemoveChatRoomUserRsp;
        texasPoker$SCRemoveChatRoomUserRsp.initFields();
    }

    public static TexasPoker$SCRemoveChatRoomUserRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCRemoveChatRoomUserRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCRemoveChatRoomUserRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCRemoveChatRoomUserRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCRemoveChatRoomUserRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCRemoveChatRoomUserRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCRemoveChatRoomUserRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCRemoveChatRoomUserRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCRemoveChatRoomUserRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCRemoveChatRoomUserRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCRemoveChatRoomUserRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCRemoveChatRoomUserRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCRemoveChatRoomUserRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCRemoveChatRoomUserRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCRemoveChatRoomUserRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCRemoveChatRoomUserRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCRemoveChatRoomUserRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCRemoveChatRoomUserRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCRemoveChatRoomUserRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCRemoveChatRoomUserRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCRemoveChatRoomUserRsp texasPoker$SCRemoveChatRoomUserRsp) {
        return newBuilder().mergeFrom(texasPoker$SCRemoveChatRoomUserRsp);
    }
}
