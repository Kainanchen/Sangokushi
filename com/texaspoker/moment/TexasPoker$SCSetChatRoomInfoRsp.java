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
import com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo;
import com.texaspoker.moment.TexasPoker.ChatRoomBaseInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import java.io.InputStream;

public final class TexasPoker$SCSetChatRoomInfoRsp extends GeneratedMessage implements TexasPoker$SCSetChatRoomInfoRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static Parser<TexasPoker$SCSetChatRoomInfoRsp> PARSER = null;
    public static final int STCHATROOMBASEINFO_FIELD_NUMBER = 2;
    private static final TexasPoker$SCSetChatRoomInfoRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private ChatRoomBaseInfo stChatRoomBaseInfo_;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCSetChatRoomInfoRsp.1 */
    class C00441 extends AbstractParser<TexasPoker$SCSetChatRoomInfoRsp> {
        static {
            fixHelper.fixfunc(new int[]{20336, 20337});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00441();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCSetChatRoomInfoRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCSetChatRoomInfoRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private SingleFieldBuilder<ChatRoomBaseInfo, com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo.Builder, ChatRoomBaseInfoOrBuilder> stChatRoomBaseInfoBuilder_;
        private ChatRoomBaseInfo stChatRoomBaseInfo_;

        static {
            fixHelper.fixfunc(new int[]{5797, 5798, 5799, 5800, 5801, 5802, 5803, 5804, 5805, 5806, 5807, 5808, 5809, 5810, 5811, 5812, 5813, 5814, 5815, 5816, 5817, 5818, 5819, 5820, 5821, 5822, 5823, 5824, 5825, 5826, 5827, 5828, 5829, 5830, 5831, 5832, 5833, 5834, 5835, 5836, 5837, 5838, 5839, 5840, 5841});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native SingleFieldBuilder<ChatRoomBaseInfo, com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo.Builder, ChatRoomBaseInfoOrBuilder> getStChatRoomBaseInfoFieldBuilder();

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m2085build();

        public final native TexasPoker$SCSetChatRoomInfoRsp m2086build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m2087buildPartial();

        public final native TexasPoker$SCSetChatRoomInfoRsp m2088buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2089clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2090clear();

        public final native Builder m2091clear();

        public final native Builder clearEErrCode();

        public final native Builder clearStChatRoomBaseInfo();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2092clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2093clone();

        public final native Builder m2094clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2095getDefaultInstanceForType();

        public final native TexasPoker$SCSetChatRoomInfoRsp m2096getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native ChatRoomBaseInfo getStChatRoomBaseInfo();

        public final native com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo.Builder getStChatRoomBaseInfoBuilder();

        public final native ChatRoomBaseInfoOrBuilder getStChatRoomBaseInfoOrBuilder();

        public final native boolean hasEErrCode();

        public final native boolean hasStChatRoomBaseInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2097mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2098mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2099mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2100mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2101mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCSetChatRoomInfoRsp texasPoker$SCSetChatRoomInfoRsp);

        public final native Builder mergeStChatRoomBaseInfo(ChatRoomBaseInfo chatRoomBaseInfo);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setStChatRoomBaseInfo(com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo.Builder builder);

        public final native Builder setStChatRoomBaseInfo(ChatRoomBaseInfo chatRoomBaseInfo);

        public static final Descriptor getDescriptor() {
            return TexasPoker.aX();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{13381, 13382, 13383, 13384, 13385, 13386, 13387, 13388, 13389, 13390, 13391, 13392, 13393, 13394, 13395, 13396, 13397, 13398, 13399, 13400, 13401, 13402, 13403, 13404, 13405, 13406, 13407, 13408, 13409});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCSetChatRoomInfoRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCSetChatRoomInfoRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCSetChatRoomInfoRsp texasPoker$SCSetChatRoomInfoRsp);

    private native TexasPoker$SCSetChatRoomInfoRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCSetChatRoomInfoRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCSetChatRoomInfoRsp texasPoker$SCSetChatRoomInfoRsp);

    private native TexasPoker$SCSetChatRoomInfoRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m2069getDefaultInstanceForType();

    public final native TexasPoker$SCSetChatRoomInfoRsp m2072getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native Parser<TexasPoker$SCSetChatRoomInfoRsp> getParserForType();

    public final native int getSerializedSize();

    public final native ChatRoomBaseInfo getStChatRoomBaseInfo();

    public final native ChatRoomBaseInfoOrBuilder getStChatRoomBaseInfoOrBuilder();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    public final native boolean hasStChatRoomBaseInfo();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2075newBuilderForType();

    public final native Builder m2076newBuilderForType();

    protected final native Builder m2077newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2078toBuilder();

    public final native Builder m2080toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCSetChatRoomInfoRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.aX();
    }

    static void __clinit__() {
        PARSER = new C00441();
        TexasPoker$SCSetChatRoomInfoRsp texasPoker$SCSetChatRoomInfoRsp = new TexasPoker$SCSetChatRoomInfoRsp(true);
        defaultInstance = texasPoker$SCSetChatRoomInfoRsp;
        texasPoker$SCSetChatRoomInfoRsp.initFields();
    }

    public static TexasPoker$SCSetChatRoomInfoRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCSetChatRoomInfoRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCSetChatRoomInfoRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSetChatRoomInfoRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCSetChatRoomInfoRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCSetChatRoomInfoRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCSetChatRoomInfoRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSetChatRoomInfoRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCSetChatRoomInfoRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCSetChatRoomInfoRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCSetChatRoomInfoRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSetChatRoomInfoRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCSetChatRoomInfoRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCSetChatRoomInfoRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCSetChatRoomInfoRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSetChatRoomInfoRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCSetChatRoomInfoRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCSetChatRoomInfoRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCSetChatRoomInfoRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSetChatRoomInfoRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCSetChatRoomInfoRsp texasPoker$SCSetChatRoomInfoRsp) {
        return newBuilder().mergeFrom(texasPoker$SCSetChatRoomInfoRsp);
    }
}
