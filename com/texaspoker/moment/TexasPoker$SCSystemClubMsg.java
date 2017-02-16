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
import com.texaspoker.moment.TexasPoker.ClubPushMsg;
import com.texaspoker.moment.TexasPoker.ClubPushMsgOrBuilder;
import java.io.InputStream;
import java.util.List;

public final class TexasPoker$SCSystemClubMsg extends GeneratedMessage implements TexasPoker$SCSystemClubMsgOrBuilder {
    public static Parser<TexasPoker$SCSystemClubMsg> PARSER = null;
    public static final int VMSGS_FIELD_NUMBER = 1;
    private static final TexasPoker$SCSystemClubMsg defaultInstance = null;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;
    private List<ClubPushMsg> vMsgs_;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCSystemClubMsg.1 */
    class C00581 extends AbstractParser<TexasPoker$SCSystemClubMsg> {
        static {
            fixHelper.fixfunc(new int[]{6973, 6974});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00581();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCSystemClubMsg.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCSystemClubMsgOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilder<ClubPushMsg, com.texaspoker.moment.TexasPoker.ClubPushMsg.Builder, ClubPushMsgOrBuilder> vMsgsBuilder_;
        private List<ClubPushMsg> vMsgs_;

        static {
            fixHelper.fixfunc(new int[]{13999, 14000, 14001, 14002, 14003, 14004, 14005, 14006, 14007, 14008, 14009, 14010, 14011, 14012, 14013, 14014, 14015, 14016, 14017, 14018, 14019, 14020, 14021, 14022, 14023, 14024, 14025, 14026, 14027, 14028, 14029, 14030, 14031, 14032, 14033, 14034, 14035, 14036, 14037, 14038, 14039, 14040, 14041, 14042, 14043, 14044, 14045, 14046, 14047, 14048, 14049, 14050});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void ensureVMsgsIsMutable();

        private native RepeatedFieldBuilder<ClubPushMsg, com.texaspoker.moment.TexasPoker.ClubPushMsg.Builder, ClubPushMsgOrBuilder> getVMsgsFieldBuilder();

        private native void maybeForceBuilderInitialization();

        public final native Builder addAllVMsgs(Iterable<? extends ClubPushMsg> iterable);

        public final native Builder addVMsgs(int i, com.texaspoker.moment.TexasPoker.ClubPushMsg.Builder builder);

        public final native Builder addVMsgs(int i, ClubPushMsg clubPushMsg);

        public final native Builder addVMsgs(com.texaspoker.moment.TexasPoker.ClubPushMsg.Builder builder);

        public final native Builder addVMsgs(ClubPushMsg clubPushMsg);

        public final native com.texaspoker.moment.TexasPoker.ClubPushMsg.Builder addVMsgsBuilder();

        public final native com.texaspoker.moment.TexasPoker.ClubPushMsg.Builder addVMsgsBuilder(int i);

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m2349build();

        public final native TexasPoker$SCSystemClubMsg m2350build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m2351buildPartial();

        public final native TexasPoker$SCSystemClubMsg m2352buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2353clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2354clear();

        public final native Builder m2355clear();

        public final native Builder clearVMsgs();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2356clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2357clone();

        public final native Builder m2358clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2359getDefaultInstanceForType();

        public final native TexasPoker$SCSystemClubMsg m2360getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ClubPushMsg getVMsgs(int i);

        public final native com.texaspoker.moment.TexasPoker.ClubPushMsg.Builder getVMsgsBuilder(int i);

        public final native List<com.texaspoker.moment.TexasPoker.ClubPushMsg.Builder> getVMsgsBuilderList();

        public final native int getVMsgsCount();

        public final native List<ClubPushMsg> getVMsgsList();

        public final native ClubPushMsgOrBuilder getVMsgsOrBuilder(int i);

        public final native List<? extends ClubPushMsgOrBuilder> getVMsgsOrBuilderList();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2361mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2362mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2363mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2364mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2365mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCSystemClubMsg texasPoker$SCSystemClubMsg);

        public final native Builder removeVMsgs(int i);

        public final native Builder setVMsgs(int i, com.texaspoker.moment.TexasPoker.ClubPushMsg.Builder builder);

        public final native Builder setVMsgs(int i, ClubPushMsg clubPushMsg);

        public static final Descriptor getDescriptor() {
            return TexasPoker.fx();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{27499, 27500, 27501, 27502, 27503, 27504, 27505, 27506, 27507, 27508, 27509, 27510, 27511, 27512, 27513, 27514, 27515, 27516, 27517, 27518, 27519, 27520, 27521, 27522, 27523, 27524, 27525, 27526, 27527});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCSystemClubMsg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCSystemClubMsg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCSystemClubMsg texasPoker$SCSystemClubMsg);

    private native TexasPoker$SCSystemClubMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCSystemClubMsg(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCSystemClubMsg texasPoker$SCSystemClubMsg);

    private native TexasPoker$SCSystemClubMsg(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m2342getDefaultInstanceForType();

    public final native TexasPoker$SCSystemClubMsg m2343getDefaultInstanceForType();

    public final native Parser<TexasPoker$SCSystemClubMsg> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native ClubPushMsg getVMsgs(int i);

    public final native int getVMsgsCount();

    public final native List<ClubPushMsg> getVMsgsList();

    public final native ClubPushMsgOrBuilder getVMsgsOrBuilder(int i);

    public final native List<? extends ClubPushMsgOrBuilder> getVMsgsOrBuilderList();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2344newBuilderForType();

    public final native Builder m2345newBuilderForType();

    protected final native Builder m2346newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2347toBuilder();

    public final native Builder m2348toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCSystemClubMsg getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.fx();
    }

    static void __clinit__() {
        PARSER = new C00581();
        TexasPoker$SCSystemClubMsg texasPoker$SCSystemClubMsg = new TexasPoker$SCSystemClubMsg(true);
        defaultInstance = texasPoker$SCSystemClubMsg;
        texasPoker$SCSystemClubMsg.initFields();
    }

    public static TexasPoker$SCSystemClubMsg parseFrom(ByteString byteString) {
        return (TexasPoker$SCSystemClubMsg) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCSystemClubMsg parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSystemClubMsg) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCSystemClubMsg parseFrom(byte[] bArr) {
        return (TexasPoker$SCSystemClubMsg) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCSystemClubMsg parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSystemClubMsg) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCSystemClubMsg parseFrom(InputStream inputStream) {
        return (TexasPoker$SCSystemClubMsg) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCSystemClubMsg parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSystemClubMsg) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCSystemClubMsg parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCSystemClubMsg) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCSystemClubMsg parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSystemClubMsg) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCSystemClubMsg parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCSystemClubMsg) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCSystemClubMsg parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSystemClubMsg) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCSystemClubMsg texasPoker$SCSystemClubMsg) {
        return newBuilder().mergeFrom(texasPoker$SCSystemClubMsg);
    }
}
