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
import com.texaspoker.moment.TexasPoker.PushMsg;
import com.texaspoker.moment.TexasPoker.PushMsgOrBuilder;
import java.io.InputStream;
import java.util.List;

public final class TexasPoker$SCPushMsg extends GeneratedMessage implements TexasPoker$SCPushMsgOrBuilder {
    public static Parser<TexasPoker$SCPushMsg> PARSER = null;
    public static final int VMSGS_FIELD_NUMBER = 1;
    private static final TexasPoker$SCPushMsg defaultInstance = null;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;
    private List<PushMsg> vMsgs_;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCPushMsg.1 */
    class C00281 extends AbstractParser<TexasPoker$SCPushMsg> {
        static {
            fixHelper.fixfunc(new int[]{24775, 24776});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00281();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCPushMsg.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCPushMsgOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilder<PushMsg, com.texaspoker.moment.TexasPoker.PushMsg.Builder, PushMsgOrBuilder> vMsgsBuilder_;
        private List<PushMsg> vMsgs_;

        static {
            fixHelper.fixfunc(new int[]{19370, 19371, 19372, 19373, 19374, 19375, 19376, 19377, 19378, 19379, 19380, 19381, 19382, 19383, 19384, 19385, 19386, 19387, 19388, 19389, 19390, 19391, 19392, 19393, 19394, 19395, 19396, 19397, 19398, 19399, 19400, 19401, 19402, 19403, 19404, 19405, 19406, 19407, 19408, 19409, 19410, 19411, 19412, 19413, 19414, 19415, 19416, 19417, 19418, 19419, 19420, 19421});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void ensureVMsgsIsMutable();

        private native RepeatedFieldBuilder<PushMsg, com.texaspoker.moment.TexasPoker.PushMsg.Builder, PushMsgOrBuilder> getVMsgsFieldBuilder();

        private native void maybeForceBuilderInitialization();

        public final native Builder addAllVMsgs(Iterable<? extends PushMsg> iterable);

        public final native Builder addVMsgs(int i, com.texaspoker.moment.TexasPoker.PushMsg.Builder builder);

        public final native Builder addVMsgs(int i, PushMsg pushMsg);

        public final native Builder addVMsgs(com.texaspoker.moment.TexasPoker.PushMsg.Builder builder);

        public final native Builder addVMsgs(PushMsg pushMsg);

        public final native com.texaspoker.moment.TexasPoker.PushMsg.Builder addVMsgsBuilder();

        public final native com.texaspoker.moment.TexasPoker.PushMsg.Builder addVMsgsBuilder(int i);

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m1677build();

        public final native TexasPoker$SCPushMsg m1678build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m1679buildPartial();

        public final native TexasPoker$SCPushMsg m1680buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1681clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1682clear();

        public final native Builder m1683clear();

        public final native Builder clearVMsgs();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1684clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1685clone();

        public final native Builder m1686clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1687getDefaultInstanceForType();

        public final native TexasPoker$SCPushMsg m1688getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native PushMsg getVMsgs(int i);

        public final native com.texaspoker.moment.TexasPoker.PushMsg.Builder getVMsgsBuilder(int i);

        public final native List<com.texaspoker.moment.TexasPoker.PushMsg.Builder> getVMsgsBuilderList();

        public final native int getVMsgsCount();

        public final native List<PushMsg> getVMsgsList();

        public final native PushMsgOrBuilder getVMsgsOrBuilder(int i);

        public final native List<? extends PushMsgOrBuilder> getVMsgsOrBuilderList();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1689mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1690mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1691mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1692mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1693mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCPushMsg texasPoker$SCPushMsg);

        public final native Builder removeVMsgs(int i);

        public final native Builder setVMsgs(int i, com.texaspoker.moment.TexasPoker.PushMsg.Builder builder);

        public final native Builder setVMsgs(int i, PushMsg pushMsg);

        public static final Descriptor getDescriptor() {
            return TexasPoker.eV();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{26065, 26066, 26067, 26068, 26069, 26070, 26071, 26072, 26073, 26074, 26075, 26076, 26077, 26078, 26079, 26080, 26081, 26082, 26083, 26084, 26085, 26086, 26087, 26088, 26089, 26090, 26091, 26092, 26093});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCPushMsg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCPushMsg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCPushMsg texasPoker$SCPushMsg);

    private native TexasPoker$SCPushMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCPushMsg(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCPushMsg texasPoker$SCPushMsg);

    private native TexasPoker$SCPushMsg(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m1670getDefaultInstanceForType();

    public final native TexasPoker$SCPushMsg m1671getDefaultInstanceForType();

    public final native Parser<TexasPoker$SCPushMsg> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native PushMsg getVMsgs(int i);

    public final native int getVMsgsCount();

    public final native List<PushMsg> getVMsgsList();

    public final native PushMsgOrBuilder getVMsgsOrBuilder(int i);

    public final native List<? extends PushMsgOrBuilder> getVMsgsOrBuilderList();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1672newBuilderForType();

    public final native Builder m1673newBuilderForType();

    protected final native Builder m1674newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1675toBuilder();

    public final native Builder m1676toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCPushMsg getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.eV();
    }

    static void __clinit__() {
        PARSER = new C00281();
        TexasPoker$SCPushMsg texasPoker$SCPushMsg = new TexasPoker$SCPushMsg(true);
        defaultInstance = texasPoker$SCPushMsg;
        texasPoker$SCPushMsg.initFields();
    }

    public static TexasPoker$SCPushMsg parseFrom(ByteString byteString) {
        return (TexasPoker$SCPushMsg) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCPushMsg parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCPushMsg) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCPushMsg parseFrom(byte[] bArr) {
        return (TexasPoker$SCPushMsg) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCPushMsg parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCPushMsg) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCPushMsg parseFrom(InputStream inputStream) {
        return (TexasPoker$SCPushMsg) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCPushMsg parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCPushMsg) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCPushMsg parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCPushMsg) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCPushMsg parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCPushMsg) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCPushMsg parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCPushMsg) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCPushMsg parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCPushMsg) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCPushMsg texasPoker$SCPushMsg) {
        return newBuilder().mergeFrom(texasPoker$SCPushMsg);
    }
}
