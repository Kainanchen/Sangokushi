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
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import java.io.InputStream;

public final class TexasPoker$SCGetUserGameInfoInRoomRsp extends GeneratedMessage implements TexasPoker$SCGetUserGameInfoInRoomRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static Parser<TexasPoker$SCGetUserGameInfoInRoomRsp> PARSER = null;
    public static final int STUSERGAMEINFONET_FIELD_NUMBER = 2;
    private static final TexasPoker$SCGetUserGameInfoInRoomRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private TexasPoker$UserGameInfoNet stUserGameInfoNet_;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCGetUserGameInfoInRoomRsp.1 */
    class C00131 extends AbstractParser<TexasPoker$SCGetUserGameInfoInRoomRsp> {
        static {
            fixHelper.fixfunc(new int[]{31897, 31898});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00131();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCGetUserGameInfoInRoomRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCGetUserGameInfoInRoomRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private SingleFieldBuilder<TexasPoker$UserGameInfoNet, com.texaspoker.moment.TexasPoker$UserGameInfoNet.Builder, TexasPoker$UserGameInfoNetOrBuilder> stUserGameInfoNetBuilder_;
        private TexasPoker$UserGameInfoNet stUserGameInfoNet_;

        static {
            fixHelper.fixfunc(new int[]{16046, 16047, 16048, 16049, 16050, 16051, 16052, 16053, 16054, 16055, 16056, 16057, 16058, 16059, 16060, 16061, 16062, 16063, 16064, 16065, 16066, 16067, 16068, 16069, 16070, 16071, 16072, 16073, 16074, 16075, 16076, 16077, 16078, 16079, 16080, 16081, 16082, 16083, 16084, 16085, 16086, 16087, 16088, 16089, 16090});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native SingleFieldBuilder<TexasPoker$UserGameInfoNet, com.texaspoker.moment.TexasPoker$UserGameInfoNet.Builder, TexasPoker$UserGameInfoNetOrBuilder> getStUserGameInfoNetFieldBuilder();

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m1341build();

        public final native TexasPoker$SCGetUserGameInfoInRoomRsp m1342build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m1343buildPartial();

        public final native TexasPoker$SCGetUserGameInfoInRoomRsp m1344buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1345clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1346clear();

        public final native Builder m1347clear();

        public final native Builder clearEErrCode();

        public final native Builder clearStUserGameInfoNet();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1348clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1349clone();

        public final native Builder m1350clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1351getDefaultInstanceForType();

        public final native TexasPoker$SCGetUserGameInfoInRoomRsp m1352getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native TexasPoker$UserGameInfoNet getStUserGameInfoNet();

        public final native com.texaspoker.moment.TexasPoker$UserGameInfoNet.Builder getStUserGameInfoNetBuilder();

        public final native TexasPoker$UserGameInfoNetOrBuilder getStUserGameInfoNetOrBuilder();

        public final native boolean hasEErrCode();

        public final native boolean hasStUserGameInfoNet();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1353mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1354mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1355mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1356mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1357mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCGetUserGameInfoInRoomRsp texasPoker$SCGetUserGameInfoInRoomRsp);

        public final native Builder mergeStUserGameInfoNet(TexasPoker$UserGameInfoNet texasPoker$UserGameInfoNet);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setStUserGameInfoNet(com.texaspoker.moment.TexasPoker$UserGameInfoNet.Builder builder);

        public final native Builder setStUserGameInfoNet(TexasPoker$UserGameInfoNet texasPoker$UserGameInfoNet);

        public static final Descriptor getDescriptor() {
            return TexasPoker.fT();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{23388, 23389, 23390, 23391, 23392, 23393, 23394, 23395, 23396, 23397, 23398, 23399, 23400, 23401, 23402, 23403, 23404, 23405, 23406, 23407, 23408, 23409, 23410, 23411, 23412, 23413, 23414, 23415, 23416});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCGetUserGameInfoInRoomRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCGetUserGameInfoInRoomRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCGetUserGameInfoInRoomRsp texasPoker$SCGetUserGameInfoInRoomRsp);

    private native TexasPoker$SCGetUserGameInfoInRoomRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCGetUserGameInfoInRoomRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCGetUserGameInfoInRoomRsp texasPoker$SCGetUserGameInfoInRoomRsp);

    private native TexasPoker$SCGetUserGameInfoInRoomRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m1334getDefaultInstanceForType();

    public final native TexasPoker$SCGetUserGameInfoInRoomRsp m1335getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native Parser<TexasPoker$SCGetUserGameInfoInRoomRsp> getParserForType();

    public final native int getSerializedSize();

    public final native TexasPoker$UserGameInfoNet getStUserGameInfoNet();

    public final native TexasPoker$UserGameInfoNetOrBuilder getStUserGameInfoNetOrBuilder();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    public final native boolean hasStUserGameInfoNet();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1336newBuilderForType();

    public final native Builder m1337newBuilderForType();

    protected final native Builder m1338newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1339toBuilder();

    public final native Builder m1340toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCGetUserGameInfoInRoomRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.fT();
    }

    static void __clinit__() {
        PARSER = new C00131();
        TexasPoker$SCGetUserGameInfoInRoomRsp texasPoker$SCGetUserGameInfoInRoomRsp = new TexasPoker$SCGetUserGameInfoInRoomRsp(true);
        defaultInstance = texasPoker$SCGetUserGameInfoInRoomRsp;
        texasPoker$SCGetUserGameInfoInRoomRsp.initFields();
    }

    public static TexasPoker$SCGetUserGameInfoInRoomRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCGetUserGameInfoInRoomRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCGetUserGameInfoInRoomRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetUserGameInfoInRoomRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCGetUserGameInfoInRoomRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCGetUserGameInfoInRoomRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCGetUserGameInfoInRoomRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetUserGameInfoInRoomRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCGetUserGameInfoInRoomRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCGetUserGameInfoInRoomRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCGetUserGameInfoInRoomRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetUserGameInfoInRoomRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCGetUserGameInfoInRoomRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCGetUserGameInfoInRoomRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCGetUserGameInfoInRoomRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetUserGameInfoInRoomRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCGetUserGameInfoInRoomRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCGetUserGameInfoInRoomRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCGetUserGameInfoInRoomRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetUserGameInfoInRoomRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCGetUserGameInfoInRoomRsp texasPoker$SCGetUserGameInfoInRoomRsp) {
        return newBuilder().mergeFrom(texasPoker$SCGetUserGameInfoInRoomRsp);
    }
}
