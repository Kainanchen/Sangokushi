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
import com.texaspoker.moment.TexasPoker.GiveMoneyPushMsg;
import com.texaspoker.moment.TexasPoker.GiveMoneyPushMsgOrBuilder;
import java.io.InputStream;
import java.util.List;

public final class TexasPoker$SCGiveMoneyPushMsg extends GeneratedMessage implements TexasPoker$SCGiveMoneyPushMsgOrBuilder {
    public static Parser<TexasPoker$SCGiveMoneyPushMsg> PARSER = null;
    public static final int VMSGS_FIELD_NUMBER = 1;
    private static final TexasPoker$SCGiveMoneyPushMsg defaultInstance = null;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;
    private List<GiveMoneyPushMsg> vMsgs_;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCGiveMoneyPushMsg.1 */
    class C00141 extends AbstractParser<TexasPoker$SCGiveMoneyPushMsg> {
        static {
            fixHelper.fixfunc(new int[]{23897, 23898});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00141();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCGiveMoneyPushMsg.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCGiveMoneyPushMsgOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilder<GiveMoneyPushMsg, com.texaspoker.moment.TexasPoker.GiveMoneyPushMsg.Builder, GiveMoneyPushMsgOrBuilder> vMsgsBuilder_;
        private List<GiveMoneyPushMsg> vMsgs_;

        static {
            fixHelper.fixfunc(new int[]{23648, 23649, 23650, 23651, 23652, 23653, 23654, 23655, 23656, 23657, 23658, 23659, 23660, 23661, 23662, 23663, 23664, 23665, 23666, 23667, 23668, 23669, 23670, 23671, 23672, 23673, 23674, 23675, 23676, 23677, 23678, 23679, 23680, 23681, 23682, 23683, 23684, 23685, 23686, 23687, 23688, 23689, 23690, 23691, 23692, 23693, 23694, 23695, 23696, 23697, 23698, 23699});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void ensureVMsgsIsMutable();

        private native RepeatedFieldBuilder<GiveMoneyPushMsg, com.texaspoker.moment.TexasPoker.GiveMoneyPushMsg.Builder, GiveMoneyPushMsgOrBuilder> getVMsgsFieldBuilder();

        private native void maybeForceBuilderInitialization();

        public final native Builder addAllVMsgs(Iterable<? extends GiveMoneyPushMsg> iterable);

        public final native Builder addVMsgs(int i, com.texaspoker.moment.TexasPoker.GiveMoneyPushMsg.Builder builder);

        public final native Builder addVMsgs(int i, GiveMoneyPushMsg giveMoneyPushMsg);

        public final native Builder addVMsgs(com.texaspoker.moment.TexasPoker.GiveMoneyPushMsg.Builder builder);

        public final native Builder addVMsgs(GiveMoneyPushMsg giveMoneyPushMsg);

        public final native com.texaspoker.moment.TexasPoker.GiveMoneyPushMsg.Builder addVMsgsBuilder();

        public final native com.texaspoker.moment.TexasPoker.GiveMoneyPushMsg.Builder addVMsgsBuilder(int i);

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m1317build();

        public final native TexasPoker$SCGiveMoneyPushMsg m1318build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m1319buildPartial();

        public final native TexasPoker$SCGiveMoneyPushMsg m1320buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1321clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1322clear();

        public final native Builder m1323clear();

        public final native Builder clearVMsgs();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1324clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1325clone();

        public final native Builder m1326clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1327getDefaultInstanceForType();

        public final native TexasPoker$SCGiveMoneyPushMsg m1328getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native GiveMoneyPushMsg getVMsgs(int i);

        public final native com.texaspoker.moment.TexasPoker.GiveMoneyPushMsg.Builder getVMsgsBuilder(int i);

        public final native List<com.texaspoker.moment.TexasPoker.GiveMoneyPushMsg.Builder> getVMsgsBuilderList();

        public final native int getVMsgsCount();

        public final native List<GiveMoneyPushMsg> getVMsgsList();

        public final native GiveMoneyPushMsgOrBuilder getVMsgsOrBuilder(int i);

        public final native List<? extends GiveMoneyPushMsgOrBuilder> getVMsgsOrBuilderList();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1329mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1330mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1331mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1332mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1333mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCGiveMoneyPushMsg texasPoker$SCGiveMoneyPushMsg);

        public final native Builder removeVMsgs(int i);

        public final native Builder setVMsgs(int i, com.texaspoker.moment.TexasPoker.GiveMoneyPushMsg.Builder builder);

        public final native Builder setVMsgs(int i, GiveMoneyPushMsg giveMoneyPushMsg);

        public static final Descriptor getDescriptor() {
            return TexasPoker.cv();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{12103, 12104, 12105, 12106, 12107, 12108, 12109, 12110, 12111, 12112, 12113, 12114, 12115, 12116, 12117, 12118, 12119, 12120, 12121, 12122, 12123, 12124, 12125, 12126, 12127, 12128, 12129, 12130, 12131});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCGiveMoneyPushMsg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCGiveMoneyPushMsg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCGiveMoneyPushMsg texasPoker$SCGiveMoneyPushMsg);

    private native TexasPoker$SCGiveMoneyPushMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCGiveMoneyPushMsg(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCGiveMoneyPushMsg texasPoker$SCGiveMoneyPushMsg);

    private native TexasPoker$SCGiveMoneyPushMsg(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m1310getDefaultInstanceForType();

    public final native TexasPoker$SCGiveMoneyPushMsg m1311getDefaultInstanceForType();

    public final native Parser<TexasPoker$SCGiveMoneyPushMsg> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native GiveMoneyPushMsg getVMsgs(int i);

    public final native int getVMsgsCount();

    public final native List<GiveMoneyPushMsg> getVMsgsList();

    public final native GiveMoneyPushMsgOrBuilder getVMsgsOrBuilder(int i);

    public final native List<? extends GiveMoneyPushMsgOrBuilder> getVMsgsOrBuilderList();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1312newBuilderForType();

    public final native Builder m1313newBuilderForType();

    protected final native Builder m1314newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1315toBuilder();

    public final native Builder m1316toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCGiveMoneyPushMsg getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.cv();
    }

    static void __clinit__() {
        PARSER = new C00141();
        TexasPoker$SCGiveMoneyPushMsg texasPoker$SCGiveMoneyPushMsg = new TexasPoker$SCGiveMoneyPushMsg(true);
        defaultInstance = texasPoker$SCGiveMoneyPushMsg;
        texasPoker$SCGiveMoneyPushMsg.initFields();
    }

    public static TexasPoker$SCGiveMoneyPushMsg parseFrom(ByteString byteString) {
        return (TexasPoker$SCGiveMoneyPushMsg) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCGiveMoneyPushMsg parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGiveMoneyPushMsg) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCGiveMoneyPushMsg parseFrom(byte[] bArr) {
        return (TexasPoker$SCGiveMoneyPushMsg) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCGiveMoneyPushMsg parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGiveMoneyPushMsg) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCGiveMoneyPushMsg parseFrom(InputStream inputStream) {
        return (TexasPoker$SCGiveMoneyPushMsg) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCGiveMoneyPushMsg parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGiveMoneyPushMsg) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCGiveMoneyPushMsg parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCGiveMoneyPushMsg) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCGiveMoneyPushMsg parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGiveMoneyPushMsg) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCGiveMoneyPushMsg parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCGiveMoneyPushMsg) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCGiveMoneyPushMsg parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGiveMoneyPushMsg) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCGiveMoneyPushMsg texasPoker$SCGiveMoneyPushMsg) {
        return newBuilder().mergeFrom(texasPoker$SCGiveMoneyPushMsg);
    }
}
