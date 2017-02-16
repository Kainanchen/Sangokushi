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
import com.texaspoker.moment.TexasPoker.ChatRoomPushMsg;
import com.texaspoker.moment.TexasPoker.ChatRoomPushMsgOrBuilder;
import java.io.InputStream;
import java.util.List;

public final class TexasPoker$SCSystemChatRoomMsg extends GeneratedMessage implements TexasPoker$SCSystemChatRoomMsgOrBuilder {
    public static Parser<TexasPoker$SCSystemChatRoomMsg> PARSER = null;
    public static final int VMSGS_FIELD_NUMBER = 1;
    private static final TexasPoker$SCSystemChatRoomMsg defaultInstance = null;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;
    private List<ChatRoomPushMsg> vMsgs_;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCSystemChatRoomMsg.1 */
    class C00571 extends AbstractParser<TexasPoker$SCSystemChatRoomMsg> {
        static {
            fixHelper.fixfunc(new int[]{27389, 27390});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00571();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCSystemChatRoomMsg.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCSystemChatRoomMsgOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilder<ChatRoomPushMsg, com.texaspoker.moment.TexasPoker.ChatRoomPushMsg.Builder, ChatRoomPushMsgOrBuilder> vMsgsBuilder_;
        private List<ChatRoomPushMsg> vMsgs_;

        static {
            fixHelper.fixfunc(new int[]{33337, 33338, 33339, 33340, 33341, 33342, 33343, 33344, 33345, 33346, 33347, 33348, 33349, 33350, 33351, 33352, 33353, 33354, 33355, 33356, 33357, 33358, 33359, 33360, 33361, 33362, 33363, 33364, 33365, 33366, 33367, 33368, 33369, 33370, 33371, 33372, 33373, 33374, 33375, 33376, 33377, 33378, 33379, 33380, 33381, 33382, 33383, 33384, 33385, 33386, 33387, 33388});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void ensureVMsgsIsMutable();

        private native RepeatedFieldBuilder<ChatRoomPushMsg, com.texaspoker.moment.TexasPoker.ChatRoomPushMsg.Builder, ChatRoomPushMsgOrBuilder> getVMsgsFieldBuilder();

        private native void maybeForceBuilderInitialization();

        public final native Builder addAllVMsgs(Iterable<? extends ChatRoomPushMsg> iterable);

        public final native Builder addVMsgs(int i, com.texaspoker.moment.TexasPoker.ChatRoomPushMsg.Builder builder);

        public final native Builder addVMsgs(int i, ChatRoomPushMsg chatRoomPushMsg);

        public final native Builder addVMsgs(com.texaspoker.moment.TexasPoker.ChatRoomPushMsg.Builder builder);

        public final native Builder addVMsgs(ChatRoomPushMsg chatRoomPushMsg);

        public final native com.texaspoker.moment.TexasPoker.ChatRoomPushMsg.Builder addVMsgsBuilder();

        public final native com.texaspoker.moment.TexasPoker.ChatRoomPushMsg.Builder addVMsgsBuilder(int i);

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m2325build();

        public final native TexasPoker$SCSystemChatRoomMsg m2326build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m2327buildPartial();

        public final native TexasPoker$SCSystemChatRoomMsg m2328buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2329clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2330clear();

        public final native Builder m2331clear();

        public final native Builder clearVMsgs();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2332clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2333clone();

        public final native Builder m2334clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2335getDefaultInstanceForType();

        public final native TexasPoker$SCSystemChatRoomMsg m2336getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ChatRoomPushMsg getVMsgs(int i);

        public final native com.texaspoker.moment.TexasPoker.ChatRoomPushMsg.Builder getVMsgsBuilder(int i);

        public final native List<com.texaspoker.moment.TexasPoker.ChatRoomPushMsg.Builder> getVMsgsBuilderList();

        public final native int getVMsgsCount();

        public final native List<ChatRoomPushMsg> getVMsgsList();

        public final native ChatRoomPushMsgOrBuilder getVMsgsOrBuilder(int i);

        public final native List<? extends ChatRoomPushMsgOrBuilder> getVMsgsOrBuilderList();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2337mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2338mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2339mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2340mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2341mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCSystemChatRoomMsg texasPoker$SCSystemChatRoomMsg);

        public final native Builder removeVMsgs(int i);

        public final native Builder setVMsgs(int i, com.texaspoker.moment.TexasPoker.ChatRoomPushMsg.Builder builder);

        public final native Builder setVMsgs(int i, ChatRoomPushMsg chatRoomPushMsg);

        public static final Descriptor getDescriptor() {
            return TexasPoker.fb();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{18746, 18747, 18748, 18749, 18750, 18751, 18752, 18753, 18754, 18755, 18756, 18757, 18758, 18759, 18760, 18761, 18762, 18763, 18764, 18765, 18766, 18767, 18768, 18769, 18770, 18771, 18772, 18773, 18774});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCSystemChatRoomMsg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCSystemChatRoomMsg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCSystemChatRoomMsg texasPoker$SCSystemChatRoomMsg);

    private native TexasPoker$SCSystemChatRoomMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCSystemChatRoomMsg(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCSystemChatRoomMsg texasPoker$SCSystemChatRoomMsg);

    private native TexasPoker$SCSystemChatRoomMsg(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m2318getDefaultInstanceForType();

    public final native TexasPoker$SCSystemChatRoomMsg m2319getDefaultInstanceForType();

    public final native Parser<TexasPoker$SCSystemChatRoomMsg> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native ChatRoomPushMsg getVMsgs(int i);

    public final native int getVMsgsCount();

    public final native List<ChatRoomPushMsg> getVMsgsList();

    public final native ChatRoomPushMsgOrBuilder getVMsgsOrBuilder(int i);

    public final native List<? extends ChatRoomPushMsgOrBuilder> getVMsgsOrBuilderList();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2320newBuilderForType();

    public final native Builder m2321newBuilderForType();

    protected final native Builder m2322newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2323toBuilder();

    public final native Builder m2324toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCSystemChatRoomMsg getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.fb();
    }

    static void __clinit__() {
        PARSER = new C00571();
        TexasPoker$SCSystemChatRoomMsg texasPoker$SCSystemChatRoomMsg = new TexasPoker$SCSystemChatRoomMsg(true);
        defaultInstance = texasPoker$SCSystemChatRoomMsg;
        texasPoker$SCSystemChatRoomMsg.initFields();
    }

    public static TexasPoker$SCSystemChatRoomMsg parseFrom(ByteString byteString) {
        return (TexasPoker$SCSystemChatRoomMsg) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCSystemChatRoomMsg parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSystemChatRoomMsg) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCSystemChatRoomMsg parseFrom(byte[] bArr) {
        return (TexasPoker$SCSystemChatRoomMsg) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCSystemChatRoomMsg parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSystemChatRoomMsg) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCSystemChatRoomMsg parseFrom(InputStream inputStream) {
        return (TexasPoker$SCSystemChatRoomMsg) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCSystemChatRoomMsg parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSystemChatRoomMsg) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCSystemChatRoomMsg parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCSystemChatRoomMsg) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCSystemChatRoomMsg parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSystemChatRoomMsg) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCSystemChatRoomMsg parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCSystemChatRoomMsg) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCSystemChatRoomMsg parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSystemChatRoomMsg) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCSystemChatRoomMsg texasPoker$SCSystemChatRoomMsg) {
        return newBuilder().mergeFrom(texasPoker$SCSystemChatRoomMsg);
    }
}
