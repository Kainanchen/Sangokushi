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
import com.texaspoker.moment.TexasPoker.DefaultSettingInfoNet;
import com.texaspoker.moment.TexasPoker.DefaultSettingInfoNetOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import java.io.InputStream;

public final class TexasPoker$SCGetDefaultSettingRsp extends GeneratedMessage implements TexasPoker$SCGetDefaultSettingRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static Parser<TexasPoker$SCGetDefaultSettingRsp> PARSER = null;
    public static final int STDEFAULTSETTINGINFO_FIELD_NUMBER = 2;
    private static final TexasPoker$SCGetDefaultSettingRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private DefaultSettingInfoNet stDefaultSettingInfo_;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCGetDefaultSettingRsp.1 */
    class C00031 extends AbstractParser<TexasPoker$SCGetDefaultSettingRsp> {
        static {
            fixHelper.fixfunc(new int[]{19931, 19932});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00031();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCGetDefaultSettingRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCGetDefaultSettingRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private SingleFieldBuilder<DefaultSettingInfoNet, com.texaspoker.moment.TexasPoker.DefaultSettingInfoNet.Builder, DefaultSettingInfoNetOrBuilder> stDefaultSettingInfoBuilder_;
        private DefaultSettingInfoNet stDefaultSettingInfo_;

        static {
            fixHelper.fixfunc(new int[]{32132, 32133, 32134, 32135, 32136, 32137, 32138, 32139, 32140, 32141, 32142, 32143, 32144, 32145, 32146, 32147, 32148, 32149, 32150, 32151, 32152, 32153, 32154, 32155, 32156, 32157, 32158, 32159, 32160, 32161, 32162, 32163, 32164, 32165, 32166, 32167, 32168, 32169, 32170, 32171, 32172, 32173, 32174, 32175, 32176});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native SingleFieldBuilder<DefaultSettingInfoNet, com.texaspoker.moment.TexasPoker.DefaultSettingInfoNet.Builder, DefaultSettingInfoNetOrBuilder> getStDefaultSettingInfoFieldBuilder();

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m693build();

        public final native TexasPoker$SCGetDefaultSettingRsp m694build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m695buildPartial();

        public final native TexasPoker$SCGetDefaultSettingRsp m696buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m697clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m698clear();

        public final native Builder m699clear();

        public final native Builder clearEErrCode();

        public final native Builder clearStDefaultSettingInfo();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m700clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m701clone();

        public final native Builder m702clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m703getDefaultInstanceForType();

        public final native TexasPoker$SCGetDefaultSettingRsp m704getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native DefaultSettingInfoNet getStDefaultSettingInfo();

        public final native com.texaspoker.moment.TexasPoker.DefaultSettingInfoNet.Builder getStDefaultSettingInfoBuilder();

        public final native DefaultSettingInfoNetOrBuilder getStDefaultSettingInfoOrBuilder();

        public final native boolean hasEErrCode();

        public final native boolean hasStDefaultSettingInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m705mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m706mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m707mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m708mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m709mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCGetDefaultSettingRsp texasPoker$SCGetDefaultSettingRsp);

        public final native Builder mergeStDefaultSettingInfo(DefaultSettingInfoNet defaultSettingInfoNet);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setStDefaultSettingInfo(com.texaspoker.moment.TexasPoker.DefaultSettingInfoNet.Builder builder);

        public final native Builder setStDefaultSettingInfo(DefaultSettingInfoNet defaultSettingInfoNet);

        public static final Descriptor getDescriptor() {
            return TexasPoker.al();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{24491, 24492, 24493, 24494, 24495, 24496, 24497, 24498, 24499, 24500, 24501, 24502, 24503, 24504, 24505, 24506, 24507, 24508, 24509, 24510, 24511, 24512, 24513, 24514, 24515, 24516, 24517, 24518, 24519});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCGetDefaultSettingRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCGetDefaultSettingRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCGetDefaultSettingRsp texasPoker$SCGetDefaultSettingRsp);

    private native TexasPoker$SCGetDefaultSettingRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCGetDefaultSettingRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCGetDefaultSettingRsp texasPoker$SCGetDefaultSettingRsp);

    private native TexasPoker$SCGetDefaultSettingRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m686getDefaultInstanceForType();

    public final native TexasPoker$SCGetDefaultSettingRsp m687getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native Parser<TexasPoker$SCGetDefaultSettingRsp> getParserForType();

    public final native int getSerializedSize();

    public final native DefaultSettingInfoNet getStDefaultSettingInfo();

    public final native DefaultSettingInfoNetOrBuilder getStDefaultSettingInfoOrBuilder();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    public final native boolean hasStDefaultSettingInfo();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m688newBuilderForType();

    public final native Builder m689newBuilderForType();

    protected final native Builder m690newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m691toBuilder();

    public final native Builder m692toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCGetDefaultSettingRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.al();
    }

    static void __clinit__() {
        PARSER = new C00031();
        TexasPoker$SCGetDefaultSettingRsp texasPoker$SCGetDefaultSettingRsp = new TexasPoker$SCGetDefaultSettingRsp(true);
        defaultInstance = texasPoker$SCGetDefaultSettingRsp;
        texasPoker$SCGetDefaultSettingRsp.initFields();
    }

    public static TexasPoker$SCGetDefaultSettingRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCGetDefaultSettingRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCGetDefaultSettingRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetDefaultSettingRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCGetDefaultSettingRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCGetDefaultSettingRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCGetDefaultSettingRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetDefaultSettingRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCGetDefaultSettingRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCGetDefaultSettingRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCGetDefaultSettingRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetDefaultSettingRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCGetDefaultSettingRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCGetDefaultSettingRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCGetDefaultSettingRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetDefaultSettingRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCGetDefaultSettingRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCGetDefaultSettingRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCGetDefaultSettingRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetDefaultSettingRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCGetDefaultSettingRsp texasPoker$SCGetDefaultSettingRsp) {
        return newBuilder().mergeFrom(texasPoker$SCGetDefaultSettingRsp);
    }
}
