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

public final class TexasPoker$SCUseItemPushMsg extends GeneratedMessage implements TexasPoker$SCUseItemPushMsgOrBuilder {
    public static Parser<TexasPoker$SCUseItemPushMsg> PARSER = null;
    public static final int VMSGS_FIELD_NUMBER = 1;
    private static final TexasPoker$SCUseItemPushMsg defaultInstance = null;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;
    private List<TexasPoker$UseItemPushMsg> vMsgs_;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCUseItemPushMsg.1 */
    class C00671 extends AbstractParser<TexasPoker$SCUseItemPushMsg> {
        static {
            fixHelper.fixfunc(new int[]{32179, 32180});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00671();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCUseItemPushMsg.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCUseItemPushMsgOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilder<TexasPoker$UseItemPushMsg, com.texaspoker.moment.TexasPoker$UseItemPushMsg.Builder, TexasPoker$UseItemPushMsgOrBuilder> vMsgsBuilder_;
        private List<TexasPoker$UseItemPushMsg> vMsgs_;

        static {
            fixHelper.fixfunc(new int[]{29628, 29629, 29630, 29631, 29632, 29633, 29634, 29635, 29636, 29637, 29638, 29639, 29640, 29641, 29642, 29643, 29644, 29645, 29646, 29647, 29648, 29649, 29650, 29651, 29652, 29653, 29654, 29655, 29656, 29657, 29658, 29659, 29660, 29661, 29662, 29663, 29664, 29665, 29666, 29667, 29668, 29669, 29670, 29671, 29672, 29673, 29674, 29675, 29676, 29677, 29678, 29679});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void ensureVMsgsIsMutable();

        private native RepeatedFieldBuilder<TexasPoker$UseItemPushMsg, com.texaspoker.moment.TexasPoker$UseItemPushMsg.Builder, TexasPoker$UseItemPushMsgOrBuilder> getVMsgsFieldBuilder();

        private native void maybeForceBuilderInitialization();

        public final native Builder addAllVMsgs(Iterable<? extends TexasPoker$UseItemPushMsg> iterable);

        public final native Builder addVMsgs(int i, com.texaspoker.moment.TexasPoker$UseItemPushMsg.Builder builder);

        public final native Builder addVMsgs(int i, TexasPoker$UseItemPushMsg texasPoker$UseItemPushMsg);

        public final native Builder addVMsgs(com.texaspoker.moment.TexasPoker$UseItemPushMsg.Builder builder);

        public final native Builder addVMsgs(TexasPoker$UseItemPushMsg texasPoker$UseItemPushMsg);

        public final native com.texaspoker.moment.TexasPoker$UseItemPushMsg.Builder addVMsgsBuilder();

        public final native com.texaspoker.moment.TexasPoker$UseItemPushMsg.Builder addVMsgsBuilder(int i);

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m2613build();

        public final native TexasPoker$SCUseItemPushMsg m2614build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m2615buildPartial();

        public final native TexasPoker$SCUseItemPushMsg m2616buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2617clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2618clear();

        public final native Builder m2619clear();

        public final native Builder clearVMsgs();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2620clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2621clone();

        public final native Builder m2622clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2623getDefaultInstanceForType();

        public final native TexasPoker$SCUseItemPushMsg m2624getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native TexasPoker$UseItemPushMsg getVMsgs(int i);

        public final native com.texaspoker.moment.TexasPoker$UseItemPushMsg.Builder getVMsgsBuilder(int i);

        public final native List<com.texaspoker.moment.TexasPoker$UseItemPushMsg.Builder> getVMsgsBuilderList();

        public final native int getVMsgsCount();

        public final native List<TexasPoker$UseItemPushMsg> getVMsgsList();

        public final native TexasPoker$UseItemPushMsgOrBuilder getVMsgsOrBuilder(int i);

        public final native List<? extends TexasPoker$UseItemPushMsgOrBuilder> getVMsgsOrBuilderList();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2625mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2626mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2627mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2628mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2629mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCUseItemPushMsg texasPoker$SCUseItemPushMsg);

        public final native Builder removeVMsgs(int i);

        public final native Builder setVMsgs(int i, com.texaspoker.moment.TexasPoker$UseItemPushMsg.Builder builder);

        public final native Builder setVMsgs(int i, TexasPoker$UseItemPushMsg texasPoker$UseItemPushMsg);

        public static final Descriptor getDescriptor() {
            return TexasPoker.dd();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{12730, 12731, 12732, 12733, 12734, 12735, 12736, 12737, 12738, 12739, 12740, 12741, 12742, 12743, 12744, 12745, 12746, 12747, 12748, 12749, 12750, 12751, 12752, 12753, 12754, 12755, 12756, 12757, 12758});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCUseItemPushMsg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCUseItemPushMsg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCUseItemPushMsg texasPoker$SCUseItemPushMsg);

    private native TexasPoker$SCUseItemPushMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCUseItemPushMsg(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCUseItemPushMsg texasPoker$SCUseItemPushMsg);

    private native TexasPoker$SCUseItemPushMsg(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m2606getDefaultInstanceForType();

    public final native TexasPoker$SCUseItemPushMsg m2607getDefaultInstanceForType();

    public final native Parser<TexasPoker$SCUseItemPushMsg> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native TexasPoker$UseItemPushMsg getVMsgs(int i);

    public final native int getVMsgsCount();

    public final native List<TexasPoker$UseItemPushMsg> getVMsgsList();

    public final native TexasPoker$UseItemPushMsgOrBuilder getVMsgsOrBuilder(int i);

    public final native List<? extends TexasPoker$UseItemPushMsgOrBuilder> getVMsgsOrBuilderList();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2608newBuilderForType();

    public final native Builder m2609newBuilderForType();

    protected final native Builder m2610newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2611toBuilder();

    public final native Builder m2612toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCUseItemPushMsg getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.dd();
    }

    static void __clinit__() {
        PARSER = new C00671();
        TexasPoker$SCUseItemPushMsg texasPoker$SCUseItemPushMsg = new TexasPoker$SCUseItemPushMsg(true);
        defaultInstance = texasPoker$SCUseItemPushMsg;
        texasPoker$SCUseItemPushMsg.initFields();
    }

    public static TexasPoker$SCUseItemPushMsg parseFrom(ByteString byteString) {
        return (TexasPoker$SCUseItemPushMsg) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCUseItemPushMsg parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUseItemPushMsg) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCUseItemPushMsg parseFrom(byte[] bArr) {
        return (TexasPoker$SCUseItemPushMsg) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCUseItemPushMsg parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUseItemPushMsg) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCUseItemPushMsg parseFrom(InputStream inputStream) {
        return (TexasPoker$SCUseItemPushMsg) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCUseItemPushMsg parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUseItemPushMsg) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCUseItemPushMsg parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCUseItemPushMsg) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCUseItemPushMsg parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUseItemPushMsg) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCUseItemPushMsg parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCUseItemPushMsg) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCUseItemPushMsg parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUseItemPushMsg) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCUseItemPushMsg texasPoker$SCUseItemPushMsg) {
        return newBuilder().mergeFrom(texasPoker$SCUseItemPushMsg);
    }
}
