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
import com.google.protobuf.UnknownFieldSet;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import java.io.InputStream;

public final class TexasPoker$SCUploadPhoneNumberRsp extends GeneratedMessage implements TexasPoker$SCUploadPhoneNumberRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static Parser<TexasPoker$SCUploadPhoneNumberRsp> PARSER;
    private static final TexasPoker$SCUploadPhoneNumberRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCUploadPhoneNumberRsp.1 */
    class C00641 extends AbstractParser<TexasPoker$SCUploadPhoneNumberRsp> {
        static {
            fixHelper.fixfunc(new int[]{31198, 31199});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00641();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCUploadPhoneNumberRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCUploadPhoneNumberRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;

        static {
            fixHelper.fixfunc(new int[]{6094, 6095, 6096, 6097, 6098, 6099, 6100, 6101, 6102, 6103, 6104, 6105, 6106, 6107, 6108, 6109, 6110, 6111, 6112, 6113, 6114, 6115, 6116, 6117, 6118, 6119, 6120, 6121, 6122, 6123, 6124, 6125, 6126, 6127, 6128, 6129});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m2565build();

        public final native TexasPoker$SCUploadPhoneNumberRsp m2566build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m2567buildPartial();

        public final native TexasPoker$SCUploadPhoneNumberRsp m2568buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2569clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2570clear();

        public final native Builder m2571clear();

        public final native Builder clearEErrCode();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2572clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2573clone();

        public final native Builder m2574clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2575getDefaultInstanceForType();

        public final native TexasPoker$SCUploadPhoneNumberRsp m2576getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native boolean hasEErrCode();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2577mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2578mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2579mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2580mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2581mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCUploadPhoneNumberRsp texasPoker$SCUploadPhoneNumberRsp);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public static final Descriptor getDescriptor() {
            return TexasPoker.t();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{28791, 28792, 28793, 28794, 28795, 28796, 28797, 28798, 28799, 28800, 28801, 28802, 28803, 28804, 28805, 28806, 28807, 28808, 28809, 28810, 28811, 28812, 28813, 28814, 28815, 28816});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCUploadPhoneNumberRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCUploadPhoneNumberRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCUploadPhoneNumberRsp texasPoker$SCUploadPhoneNumberRsp);

    private native TexasPoker$SCUploadPhoneNumberRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCUploadPhoneNumberRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCUploadPhoneNumberRsp texasPoker$SCUploadPhoneNumberRsp);

    private native TexasPoker$SCUploadPhoneNumberRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m2558getDefaultInstanceForType();

    public final native TexasPoker$SCUploadPhoneNumberRsp m2559getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native Parser<TexasPoker$SCUploadPhoneNumberRsp> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2560newBuilderForType();

    public final native Builder m2561newBuilderForType();

    protected final native Builder m2562newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2563toBuilder();

    public final native Builder m2564toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCUploadPhoneNumberRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.t();
    }

    static void __clinit__() {
        PARSER = new C00641();
        TexasPoker$SCUploadPhoneNumberRsp texasPoker$SCUploadPhoneNumberRsp = new TexasPoker$SCUploadPhoneNumberRsp(true);
        defaultInstance = texasPoker$SCUploadPhoneNumberRsp;
        texasPoker$SCUploadPhoneNumberRsp.initFields();
    }

    public static TexasPoker$SCUploadPhoneNumberRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCUploadPhoneNumberRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCUploadPhoneNumberRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUploadPhoneNumberRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCUploadPhoneNumberRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCUploadPhoneNumberRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCUploadPhoneNumberRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUploadPhoneNumberRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCUploadPhoneNumberRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCUploadPhoneNumberRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCUploadPhoneNumberRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUploadPhoneNumberRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCUploadPhoneNumberRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCUploadPhoneNumberRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCUploadPhoneNumberRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUploadPhoneNumberRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCUploadPhoneNumberRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCUploadPhoneNumberRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCUploadPhoneNumberRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUploadPhoneNumberRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCUploadPhoneNumberRsp texasPoker$SCUploadPhoneNumberRsp) {
        return newBuilder().mergeFrom(texasPoker$SCUploadPhoneNumberRsp);
    }
}
