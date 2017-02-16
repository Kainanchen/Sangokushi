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
import java.io.InputStream;
import java.util.List;

public final class TexasPoker$SCSystemMsg extends GeneratedMessage implements TexasPoker$SCSystemMsgOrBuilder {
    public static Parser<TexasPoker$SCSystemMsg> PARSER = null;
    public static final int VMSGS_FIELD_NUMBER = 1;
    private static final TexasPoker$SCSystemMsg defaultInstance = null;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;
    private List<TexasPoker$SystemPushMsg> vMsgs_;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCSystemMsg.1 */
    class C00601 extends AbstractParser<TexasPoker$SCSystemMsg> {
        static {
            fixHelper.fixfunc(new int[]{34085, 34086});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00601();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCSystemMsg.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCSystemMsgOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilder<TexasPoker$SystemPushMsg, com.texaspoker.moment.TexasPoker$SystemPushMsg.Builder, TexasPoker$SystemPushMsgOrBuilder> vMsgsBuilder_;
        private List<TexasPoker$SystemPushMsg> vMsgs_;

        static {
            fixHelper.fixfunc(new int[]{28725, 28726, 28727, 28728, 28729, 28730, 28731, 28732, 28733, 28734, 28735, 28736, 28737, 28738, 28739, 28740, 28741, 28742, 28743, 28744, 28745, 28746, 28747, 28748, 28749, 28750, 28751, 28752, 28753, 28754, 28755, 28756, 28757, 28758, 28759, 28760, 28761, 28762, 28763, 28764, 28765, 28766, 28767, 28768, 28769, 28770, 28771, 28772, 28773, 28774, 28775, 28776});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void ensureVMsgsIsMutable();

        private native RepeatedFieldBuilder<TexasPoker$SystemPushMsg, com.texaspoker.moment.TexasPoker$SystemPushMsg.Builder, TexasPoker$SystemPushMsgOrBuilder> getVMsgsFieldBuilder();

        private native void maybeForceBuilderInitialization();

        public final native Builder addAllVMsgs(Iterable<? extends TexasPoker$SystemPushMsg> iterable);

        public final native Builder addVMsgs(int i, com.texaspoker.moment.TexasPoker$SystemPushMsg.Builder builder);

        public final native Builder addVMsgs(int i, TexasPoker$SystemPushMsg texasPoker$SystemPushMsg);

        public final native Builder addVMsgs(com.texaspoker.moment.TexasPoker$SystemPushMsg.Builder builder);

        public final native Builder addVMsgs(TexasPoker$SystemPushMsg texasPoker$SystemPushMsg);

        public final native com.texaspoker.moment.TexasPoker$SystemPushMsg.Builder addVMsgsBuilder();

        public final native com.texaspoker.moment.TexasPoker$SystemPushMsg.Builder addVMsgsBuilder(int i);

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m2421build();

        public final native TexasPoker$SCSystemMsg m2422build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m2423buildPartial();

        public final native TexasPoker$SCSystemMsg m2424buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2425clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2426clear();

        public final native Builder m2427clear();

        public final native Builder clearVMsgs();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2428clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2429clone();

        public final native Builder m2430clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2431getDefaultInstanceForType();

        public final native TexasPoker$SCSystemMsg m2432getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native TexasPoker$SystemPushMsg getVMsgs(int i);

        public final native com.texaspoker.moment.TexasPoker$SystemPushMsg.Builder getVMsgsBuilder(int i);

        public final native List<com.texaspoker.moment.TexasPoker$SystemPushMsg.Builder> getVMsgsBuilderList();

        public final native int getVMsgsCount();

        public final native List<TexasPoker$SystemPushMsg> getVMsgsList();

        public final native TexasPoker$SystemPushMsgOrBuilder getVMsgsOrBuilder(int i);

        public final native List<? extends TexasPoker$SystemPushMsgOrBuilder> getVMsgsOrBuilderList();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2433mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2434mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2435mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2436mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2437mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCSystemMsg texasPoker$SCSystemMsg);

        public final native Builder removeVMsgs(int i);

        public final native Builder setVMsgs(int i, com.texaspoker.moment.TexasPoker$SystemPushMsg.Builder builder);

        public final native Builder setVMsgs(int i, TexasPoker$SystemPushMsg texasPoker$SystemPushMsg);

        public static final Descriptor getDescriptor() {
            return TexasPoker.fn();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{20162, 20163, 20164, 20165, 20166, 20167, 20168, 20169, 20170, 20171, 20172, 20173, 20174, 20175, 20176, 20177, 20178, 20179, 20180, 20181, 20182, 20183, 20184, 20185, 20186, 20187, 20188, 20189, 20190});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCSystemMsg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCSystemMsg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCSystemMsg texasPoker$SCSystemMsg);

    private native TexasPoker$SCSystemMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCSystemMsg(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCSystemMsg texasPoker$SCSystemMsg);

    private native TexasPoker$SCSystemMsg(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m2414getDefaultInstanceForType();

    public final native TexasPoker$SCSystemMsg m2415getDefaultInstanceForType();

    public final native Parser<TexasPoker$SCSystemMsg> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native TexasPoker$SystemPushMsg getVMsgs(int i);

    public final native int getVMsgsCount();

    public final native List<TexasPoker$SystemPushMsg> getVMsgsList();

    public final native TexasPoker$SystemPushMsgOrBuilder getVMsgsOrBuilder(int i);

    public final native List<? extends TexasPoker$SystemPushMsgOrBuilder> getVMsgsOrBuilderList();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2416newBuilderForType();

    public final native Builder m2417newBuilderForType();

    protected final native Builder m2418newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2419toBuilder();

    public final native Builder m2420toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCSystemMsg getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.fn();
    }

    static void __clinit__() {
        PARSER = new C00601();
        TexasPoker$SCSystemMsg texasPoker$SCSystemMsg = new TexasPoker$SCSystemMsg(true);
        defaultInstance = texasPoker$SCSystemMsg;
        texasPoker$SCSystemMsg.initFields();
    }

    public static TexasPoker$SCSystemMsg parseFrom(ByteString byteString) {
        return (TexasPoker$SCSystemMsg) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCSystemMsg parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSystemMsg) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCSystemMsg parseFrom(byte[] bArr) {
        return (TexasPoker$SCSystemMsg) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCSystemMsg parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSystemMsg) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCSystemMsg parseFrom(InputStream inputStream) {
        return (TexasPoker$SCSystemMsg) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCSystemMsg parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSystemMsg) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCSystemMsg parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCSystemMsg) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCSystemMsg parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSystemMsg) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCSystemMsg parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCSystemMsg) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCSystemMsg parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSystemMsg) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCSystemMsg texasPoker$SCSystemMsg) {
        return newBuilder().mergeFrom(texasPoker$SCSystemMsg);
    }
}
