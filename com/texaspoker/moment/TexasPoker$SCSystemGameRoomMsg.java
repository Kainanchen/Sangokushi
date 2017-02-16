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
import com.texaspoker.moment.TexasPoker.GameRoomPushMsg;
import com.texaspoker.moment.TexasPoker.GameRoomPushMsgOrBuilder;
import java.io.InputStream;
import java.util.List;

public final class TexasPoker$SCSystemGameRoomMsg extends GeneratedMessage implements TexasPoker$SCSystemGameRoomMsgOrBuilder {
    public static Parser<TexasPoker$SCSystemGameRoomMsg> PARSER = null;
    public static final int VMSGS_FIELD_NUMBER = 1;
    private static final TexasPoker$SCSystemGameRoomMsg defaultInstance = null;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;
    private List<GameRoomPushMsg> vMsgs_;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCSystemGameRoomMsg.1 */
    class C00591 extends AbstractParser<TexasPoker$SCSystemGameRoomMsg> {
        static {
            fixHelper.fixfunc(new int[]{23417, 23418});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00591();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCSystemGameRoomMsg.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCSystemGameRoomMsgOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilder<GameRoomPushMsg, com.texaspoker.moment.TexasPoker.GameRoomPushMsg.Builder, GameRoomPushMsgOrBuilder> vMsgsBuilder_;
        private List<GameRoomPushMsg> vMsgs_;

        static {
            fixHelper.fixfunc(new int[]{7836, 7837, 7838, 7839, 7840, 7841, 7842, 7843, 7844, 7845, 7846, 7847, 7848, 7849, 7850, 7851, 7852, 7853, 7854, 7855, 7856, 7857, 7858, 7859, 7860, 7861, 7862, 7863, 7864, 7865, 7866, 7867, 7868, 7869, 7870, 7871, 7872, 7873, 7874, 7875, 7876, 7877, 7878, 7879, 7880, 7881, 7882, 7883, 7884, 7885, 7886, 7887});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void ensureVMsgsIsMutable();

        private native RepeatedFieldBuilder<GameRoomPushMsg, com.texaspoker.moment.TexasPoker.GameRoomPushMsg.Builder, GameRoomPushMsgOrBuilder> getVMsgsFieldBuilder();

        private native void maybeForceBuilderInitialization();

        public final native Builder addAllVMsgs(Iterable<? extends GameRoomPushMsg> iterable);

        public final native Builder addVMsgs(int i, com.texaspoker.moment.TexasPoker.GameRoomPushMsg.Builder builder);

        public final native Builder addVMsgs(int i, GameRoomPushMsg gameRoomPushMsg);

        public final native Builder addVMsgs(com.texaspoker.moment.TexasPoker.GameRoomPushMsg.Builder builder);

        public final native Builder addVMsgs(GameRoomPushMsg gameRoomPushMsg);

        public final native com.texaspoker.moment.TexasPoker.GameRoomPushMsg.Builder addVMsgsBuilder();

        public final native com.texaspoker.moment.TexasPoker.GameRoomPushMsg.Builder addVMsgsBuilder(int i);

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m2397build();

        public final native TexasPoker$SCSystemGameRoomMsg m2398build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m2399buildPartial();

        public final native TexasPoker$SCSystemGameRoomMsg m2400buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2401clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2402clear();

        public final native Builder m2403clear();

        public final native Builder clearVMsgs();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2404clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2405clone();

        public final native Builder m2406clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2407getDefaultInstanceForType();

        public final native TexasPoker$SCSystemGameRoomMsg m2408getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native GameRoomPushMsg getVMsgs(int i);

        public final native com.texaspoker.moment.TexasPoker.GameRoomPushMsg.Builder getVMsgsBuilder(int i);

        public final native List<com.texaspoker.moment.TexasPoker.GameRoomPushMsg.Builder> getVMsgsBuilderList();

        public final native int getVMsgsCount();

        public final native List<GameRoomPushMsg> getVMsgsList();

        public final native GameRoomPushMsgOrBuilder getVMsgsOrBuilder(int i);

        public final native List<? extends GameRoomPushMsgOrBuilder> getVMsgsOrBuilderList();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2409mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2410mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2411mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2412mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2413mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCSystemGameRoomMsg texasPoker$SCSystemGameRoomMsg);

        public final native Builder removeVMsgs(int i);

        public final native Builder setVMsgs(int i, com.texaspoker.moment.TexasPoker.GameRoomPushMsg.Builder builder);

        public final native Builder setVMsgs(int i, GameRoomPushMsg gameRoomPushMsg);

        public static final Descriptor getDescriptor() {
            return TexasPoker.fh();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{23559, 23560, 23561, 23562, 23563, 23564, 23565, 23566, 23567, 23568, 23569, 23570, 23571, 23572, 23573, 23574, 23575, 23576, 23577, 23578, 23579, 23580, 23581, 23582, 23583, 23584, 23585, 23586, 23587});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCSystemGameRoomMsg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCSystemGameRoomMsg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCSystemGameRoomMsg texasPoker$SCSystemGameRoomMsg);

    private native TexasPoker$SCSystemGameRoomMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCSystemGameRoomMsg(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCSystemGameRoomMsg texasPoker$SCSystemGameRoomMsg);

    private native TexasPoker$SCSystemGameRoomMsg(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m2390getDefaultInstanceForType();

    public final native TexasPoker$SCSystemGameRoomMsg m2391getDefaultInstanceForType();

    public final native Parser<TexasPoker$SCSystemGameRoomMsg> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native GameRoomPushMsg getVMsgs(int i);

    public final native int getVMsgsCount();

    public final native List<GameRoomPushMsg> getVMsgsList();

    public final native GameRoomPushMsgOrBuilder getVMsgsOrBuilder(int i);

    public final native List<? extends GameRoomPushMsgOrBuilder> getVMsgsOrBuilderList();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2392newBuilderForType();

    public final native Builder m2393newBuilderForType();

    protected final native Builder m2394newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2395toBuilder();

    public final native Builder m2396toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCSystemGameRoomMsg getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.fh();
    }

    static void __clinit__() {
        PARSER = new C00591();
        TexasPoker$SCSystemGameRoomMsg texasPoker$SCSystemGameRoomMsg = new TexasPoker$SCSystemGameRoomMsg(true);
        defaultInstance = texasPoker$SCSystemGameRoomMsg;
        texasPoker$SCSystemGameRoomMsg.initFields();
    }

    public static TexasPoker$SCSystemGameRoomMsg parseFrom(ByteString byteString) {
        return (TexasPoker$SCSystemGameRoomMsg) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCSystemGameRoomMsg parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSystemGameRoomMsg) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCSystemGameRoomMsg parseFrom(byte[] bArr) {
        return (TexasPoker$SCSystemGameRoomMsg) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCSystemGameRoomMsg parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSystemGameRoomMsg) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCSystemGameRoomMsg parseFrom(InputStream inputStream) {
        return (TexasPoker$SCSystemGameRoomMsg) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCSystemGameRoomMsg parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSystemGameRoomMsg) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCSystemGameRoomMsg parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCSystemGameRoomMsg) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCSystemGameRoomMsg parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSystemGameRoomMsg) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCSystemGameRoomMsg parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCSystemGameRoomMsg) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCSystemGameRoomMsg parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSystemGameRoomMsg) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCSystemGameRoomMsg texasPoker$SCSystemGameRoomMsg) {
        return newBuilder().mergeFrom(texasPoker$SCSystemGameRoomMsg);
    }
}
