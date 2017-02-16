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
import com.texaspoker.moment.TexasPoker.QuickGameRoomPushMsg;
import com.texaspoker.moment.TexasPoker.QuickGameRoomPushMsgOrBuilder;
import java.io.InputStream;
import java.util.List;

public final class TexasPoker$SCSystemQuickGameRoomMsg extends GeneratedMessage implements TexasPoker$SCSystemQuickGameRoomMsgOrBuilder {
    public static Parser<TexasPoker$SCSystemQuickGameRoomMsg> PARSER = null;
    public static final int VMSGS_FIELD_NUMBER = 1;
    private static final TexasPoker$SCSystemQuickGameRoomMsg defaultInstance = null;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;
    private List<QuickGameRoomPushMsg> vMsgs_;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCSystemQuickGameRoomMsg.1 */
    class C00611 extends AbstractParser<TexasPoker$SCSystemQuickGameRoomMsg> {
        static {
            fixHelper.fixfunc(new int[]{32570, 32571});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00611();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCSystemQuickGameRoomMsg.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCSystemQuickGameRoomMsgOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilder<QuickGameRoomPushMsg, com.texaspoker.moment.TexasPoker.QuickGameRoomPushMsg.Builder, QuickGameRoomPushMsgOrBuilder> vMsgsBuilder_;
        private List<QuickGameRoomPushMsg> vMsgs_;

        static {
            fixHelper.fixfunc(new int[]{24526, 24527, 24528, 24529, 24530, 24531, 24532, 24533, 24534, 24535, 24536, 24537, 24538, 24539, 24540, 24541, 24542, 24543, 24544, 24545, 24546, 24547, 24548, 24549, 24550, 24551, 24552, 24553, 24554, 24555, 24556, 24557, 24558, 24559, 24560, 24561, 24562, 24563, 24564, 24565, 24566, 24567, 24568, 24569, 24570, 24571, 24572, 24573, 24574, 24575, 24576, 24577});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void ensureVMsgsIsMutable();

        private native RepeatedFieldBuilder<QuickGameRoomPushMsg, com.texaspoker.moment.TexasPoker.QuickGameRoomPushMsg.Builder, QuickGameRoomPushMsgOrBuilder> getVMsgsFieldBuilder();

        private native void maybeForceBuilderInitialization();

        public final native Builder addAllVMsgs(Iterable<? extends QuickGameRoomPushMsg> iterable);

        public final native Builder addVMsgs(int i, com.texaspoker.moment.TexasPoker.QuickGameRoomPushMsg.Builder builder);

        public final native Builder addVMsgs(int i, QuickGameRoomPushMsg quickGameRoomPushMsg);

        public final native Builder addVMsgs(com.texaspoker.moment.TexasPoker.QuickGameRoomPushMsg.Builder builder);

        public final native Builder addVMsgs(QuickGameRoomPushMsg quickGameRoomPushMsg);

        public final native com.texaspoker.moment.TexasPoker.QuickGameRoomPushMsg.Builder addVMsgsBuilder();

        public final native com.texaspoker.moment.TexasPoker.QuickGameRoomPushMsg.Builder addVMsgsBuilder(int i);

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m2445build();

        public final native TexasPoker$SCSystemQuickGameRoomMsg m2446build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m2447buildPartial();

        public final native TexasPoker$SCSystemQuickGameRoomMsg m2448buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2449clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2450clear();

        public final native Builder m2451clear();

        public final native Builder clearVMsgs();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2452clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2453clone();

        public final native Builder m2454clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2455getDefaultInstanceForType();

        public final native TexasPoker$SCSystemQuickGameRoomMsg m2456getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native QuickGameRoomPushMsg getVMsgs(int i);

        public final native com.texaspoker.moment.TexasPoker.QuickGameRoomPushMsg.Builder getVMsgsBuilder(int i);

        public final native List<com.texaspoker.moment.TexasPoker.QuickGameRoomPushMsg.Builder> getVMsgsBuilderList();

        public final native int getVMsgsCount();

        public final native List<QuickGameRoomPushMsg> getVMsgsList();

        public final native QuickGameRoomPushMsgOrBuilder getVMsgsOrBuilder(int i);

        public final native List<? extends QuickGameRoomPushMsgOrBuilder> getVMsgsOrBuilderList();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2457mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2458mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2459mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2460mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2461mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCSystemQuickGameRoomMsg texasPoker$SCSystemQuickGameRoomMsg);

        public final native Builder removeVMsgs(int i);

        public final native Builder setVMsgs(int i, com.texaspoker.moment.TexasPoker.QuickGameRoomPushMsg.Builder builder);

        public final native Builder setVMsgs(int i, QuickGameRoomPushMsg quickGameRoomPushMsg);

        public static final Descriptor getDescriptor() {
            return TexasPoker.er();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{18929, 18930, 18931, 18932, 18933, 18934, 18935, 18936, 18937, 18938, 18939, 18940, 18941, 18942, 18943, 18944, 18945, 18946, 18947, 18948, 18949, 18950, 18951, 18952, 18953, 18954, 18955, 18956, 18957});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCSystemQuickGameRoomMsg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCSystemQuickGameRoomMsg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCSystemQuickGameRoomMsg texasPoker$SCSystemQuickGameRoomMsg);

    private native TexasPoker$SCSystemQuickGameRoomMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCSystemQuickGameRoomMsg(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCSystemQuickGameRoomMsg texasPoker$SCSystemQuickGameRoomMsg);

    private native TexasPoker$SCSystemQuickGameRoomMsg(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m2438getDefaultInstanceForType();

    public final native TexasPoker$SCSystemQuickGameRoomMsg m2439getDefaultInstanceForType();

    public final native Parser<TexasPoker$SCSystemQuickGameRoomMsg> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native QuickGameRoomPushMsg getVMsgs(int i);

    public final native int getVMsgsCount();

    public final native List<QuickGameRoomPushMsg> getVMsgsList();

    public final native QuickGameRoomPushMsgOrBuilder getVMsgsOrBuilder(int i);

    public final native List<? extends QuickGameRoomPushMsgOrBuilder> getVMsgsOrBuilderList();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2440newBuilderForType();

    public final native Builder m2441newBuilderForType();

    protected final native Builder m2442newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2443toBuilder();

    public final native Builder m2444toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCSystemQuickGameRoomMsg getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.er();
    }

    static void __clinit__() {
        PARSER = new C00611();
        TexasPoker$SCSystemQuickGameRoomMsg texasPoker$SCSystemQuickGameRoomMsg = new TexasPoker$SCSystemQuickGameRoomMsg(true);
        defaultInstance = texasPoker$SCSystemQuickGameRoomMsg;
        texasPoker$SCSystemQuickGameRoomMsg.initFields();
    }

    public static TexasPoker$SCSystemQuickGameRoomMsg parseFrom(ByteString byteString) {
        return (TexasPoker$SCSystemQuickGameRoomMsg) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCSystemQuickGameRoomMsg parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSystemQuickGameRoomMsg) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCSystemQuickGameRoomMsg parseFrom(byte[] bArr) {
        return (TexasPoker$SCSystemQuickGameRoomMsg) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCSystemQuickGameRoomMsg parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSystemQuickGameRoomMsg) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCSystemQuickGameRoomMsg parseFrom(InputStream inputStream) {
        return (TexasPoker$SCSystemQuickGameRoomMsg) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCSystemQuickGameRoomMsg parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSystemQuickGameRoomMsg) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCSystemQuickGameRoomMsg parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCSystemQuickGameRoomMsg) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCSystemQuickGameRoomMsg parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSystemQuickGameRoomMsg) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCSystemQuickGameRoomMsg parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCSystemQuickGameRoomMsg) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCSystemQuickGameRoomMsg parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSystemQuickGameRoomMsg) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCSystemQuickGameRoomMsg texasPoker$SCSystemQuickGameRoomMsg) {
        return newBuilder().mergeFrom(texasPoker$SCSystemQuickGameRoomMsg);
    }
}
