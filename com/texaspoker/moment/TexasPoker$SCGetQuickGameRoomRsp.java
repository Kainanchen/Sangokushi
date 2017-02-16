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
import com.texaspoker.moment.TexasPoker.QuickGameRoomInfo;
import com.texaspoker.moment.TexasPoker.QuickGameRoomInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import java.io.InputStream;
import java.util.List;

public final class TexasPoker$SCGetQuickGameRoomRsp extends GeneratedMessage implements TexasPoker$SCGetQuickGameRoomRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static Parser<TexasPoker$SCGetQuickGameRoomRsp> PARSER = null;
    public static final int VQUICKGAMEROOMINFOS_FIELD_NUMBER = 2;
    private static final TexasPoker$SCGetQuickGameRoomRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;
    private List<QuickGameRoomInfo> vQuickGameRoomInfos_;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCGetQuickGameRoomRsp.1 */
    class C00121 extends AbstractParser<TexasPoker$SCGetQuickGameRoomRsp> {
        static {
            fixHelper.fixfunc(new int[]{26436, 26437});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00121();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCGetQuickGameRoomRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCGetQuickGameRoomRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private RepeatedFieldBuilder<QuickGameRoomInfo, com.texaspoker.moment.TexasPoker.QuickGameRoomInfo.Builder, QuickGameRoomInfoOrBuilder> vQuickGameRoomInfosBuilder_;
        private List<QuickGameRoomInfo> vQuickGameRoomInfos_;

        static {
            fixHelper.fixfunc(new int[]{4009, 4010, 4011, 4012, 4013, 4014, 4015, 4016, 4017, 4018, 4019, 4020, 4021, 4022, 4023, 4024, 4025, 4026, 4027, 4028, 4029, 4030, 4031, 4032, 4033, 4034, 4035, 4036, 4037, 4038, 4039, 4040, 4041, 4042, 4043, 4044, 4045, 4046, 4047, 4048, 4049, 4050, 4051, 4052, 4053, 4054, 4055, 4056, 4057, 4058, 4059, 4060, 4061, 4062, 4063, 4064});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void ensureVQuickGameRoomInfosIsMutable();

        private native RepeatedFieldBuilder<QuickGameRoomInfo, com.texaspoker.moment.TexasPoker.QuickGameRoomInfo.Builder, QuickGameRoomInfoOrBuilder> getVQuickGameRoomInfosFieldBuilder();

        private native void maybeForceBuilderInitialization();

        public final native Builder addAllVQuickGameRoomInfos(Iterable<? extends QuickGameRoomInfo> iterable);

        public final native Builder addVQuickGameRoomInfos(int i, com.texaspoker.moment.TexasPoker.QuickGameRoomInfo.Builder builder);

        public final native Builder addVQuickGameRoomInfos(int i, QuickGameRoomInfo quickGameRoomInfo);

        public final native Builder addVQuickGameRoomInfos(com.texaspoker.moment.TexasPoker.QuickGameRoomInfo.Builder builder);

        public final native Builder addVQuickGameRoomInfos(QuickGameRoomInfo quickGameRoomInfo);

        public final native com.texaspoker.moment.TexasPoker.QuickGameRoomInfo.Builder addVQuickGameRoomInfosBuilder();

        public final native com.texaspoker.moment.TexasPoker.QuickGameRoomInfo.Builder addVQuickGameRoomInfosBuilder(int i);

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m1293build();

        public final native TexasPoker$SCGetQuickGameRoomRsp m1294build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m1295buildPartial();

        public final native TexasPoker$SCGetQuickGameRoomRsp m1296buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1297clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1298clear();

        public final native Builder m1299clear();

        public final native Builder clearEErrCode();

        public final native Builder clearVQuickGameRoomInfos();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1300clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1301clone();

        public final native Builder m1302clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1303getDefaultInstanceForType();

        public final native TexasPoker$SCGetQuickGameRoomRsp m1304getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native QuickGameRoomInfo getVQuickGameRoomInfos(int i);

        public final native com.texaspoker.moment.TexasPoker.QuickGameRoomInfo.Builder getVQuickGameRoomInfosBuilder(int i);

        public final native List<com.texaspoker.moment.TexasPoker.QuickGameRoomInfo.Builder> getVQuickGameRoomInfosBuilderList();

        public final native int getVQuickGameRoomInfosCount();

        public final native List<QuickGameRoomInfo> getVQuickGameRoomInfosList();

        public final native QuickGameRoomInfoOrBuilder getVQuickGameRoomInfosOrBuilder(int i);

        public final native List<? extends QuickGameRoomInfoOrBuilder> getVQuickGameRoomInfosOrBuilderList();

        public final native boolean hasEErrCode();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1305mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1306mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1307mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1308mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1309mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCGetQuickGameRoomRsp texasPoker$SCGetQuickGameRoomRsp);

        public final native Builder removeVQuickGameRoomInfos(int i);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setVQuickGameRoomInfos(int i, com.texaspoker.moment.TexasPoker.QuickGameRoomInfo.Builder builder);

        public final native Builder setVQuickGameRoomInfos(int i, QuickGameRoomInfo quickGameRoomInfo);

        public static final Descriptor getDescriptor() {
            return TexasPoker.ej();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{20879, 20880, 20881, 20882, 20883, 20884, 20885, 20886, 20887, 20888, 20889, 20890, 20891, 20892, 20893, 20894, 20895, 20896, 20897, 20898, 20899, 20900, 20901, 20902, 20903, 20904, 20905, 20906, 20907, 20908, 20909});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCGetQuickGameRoomRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCGetQuickGameRoomRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCGetQuickGameRoomRsp texasPoker$SCGetQuickGameRoomRsp);

    private native TexasPoker$SCGetQuickGameRoomRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCGetQuickGameRoomRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCGetQuickGameRoomRsp texasPoker$SCGetQuickGameRoomRsp);

    private native TexasPoker$SCGetQuickGameRoomRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m1286getDefaultInstanceForType();

    public final native TexasPoker$SCGetQuickGameRoomRsp m1287getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native Parser<TexasPoker$SCGetQuickGameRoomRsp> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native QuickGameRoomInfo getVQuickGameRoomInfos(int i);

    public final native int getVQuickGameRoomInfosCount();

    public final native List<QuickGameRoomInfo> getVQuickGameRoomInfosList();

    public final native QuickGameRoomInfoOrBuilder getVQuickGameRoomInfosOrBuilder(int i);

    public final native List<? extends QuickGameRoomInfoOrBuilder> getVQuickGameRoomInfosOrBuilderList();

    public final native boolean hasEErrCode();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1288newBuilderForType();

    public final native Builder m1289newBuilderForType();

    protected final native Builder m1290newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1291toBuilder();

    public final native Builder m1292toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCGetQuickGameRoomRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.ej();
    }

    static void __clinit__() {
        PARSER = new C00121();
        TexasPoker$SCGetQuickGameRoomRsp texasPoker$SCGetQuickGameRoomRsp = new TexasPoker$SCGetQuickGameRoomRsp(true);
        defaultInstance = texasPoker$SCGetQuickGameRoomRsp;
        texasPoker$SCGetQuickGameRoomRsp.initFields();
    }

    public static TexasPoker$SCGetQuickGameRoomRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCGetQuickGameRoomRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCGetQuickGameRoomRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetQuickGameRoomRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCGetQuickGameRoomRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCGetQuickGameRoomRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCGetQuickGameRoomRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetQuickGameRoomRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCGetQuickGameRoomRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCGetQuickGameRoomRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCGetQuickGameRoomRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetQuickGameRoomRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCGetQuickGameRoomRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCGetQuickGameRoomRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCGetQuickGameRoomRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetQuickGameRoomRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCGetQuickGameRoomRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCGetQuickGameRoomRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCGetQuickGameRoomRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetQuickGameRoomRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCGetQuickGameRoomRsp texasPoker$SCGetQuickGameRoomRsp) {
        return newBuilder().mergeFrom(texasPoker$SCGetQuickGameRoomRsp);
    }
}
