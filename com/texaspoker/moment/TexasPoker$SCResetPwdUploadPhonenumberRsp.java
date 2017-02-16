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

public final class TexasPoker$SCResetPwdUploadPhonenumberRsp extends GeneratedMessage implements TexasPoker$SCResetPwdUploadPhonenumberRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static Parser<TexasPoker$SCResetPwdUploadPhonenumberRsp> PARSER;
    private static final TexasPoker$SCResetPwdUploadPhonenumberRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCResetPwdUploadPhonenumberRsp.1 */
    class C00371 extends AbstractParser<TexasPoker$SCResetPwdUploadPhonenumberRsp> {
        static {
            fixHelper.fixfunc(new int[]{13842, 13843});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00371();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCResetPwdUploadPhonenumberRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCResetPwdUploadPhonenumberRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;

        static {
            fixHelper.fixfunc(new int[]{33728, 33729, 33730, 33731, 33732, 33733, 33734, 33735, 33736, 33737, 33738, 33739, 33740, 33741, 33742, 33743, 33744, 33745, 33746, 33747, 33748, 33749, 33750, 33751, 33752, 33753, 33754, 33755, 33756, 33757, 33758, 33759, 33760, 33761, 33762, 33763});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m1869build();

        public final native TexasPoker$SCResetPwdUploadPhonenumberRsp m1870build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m1871buildPartial();

        public final native TexasPoker$SCResetPwdUploadPhonenumberRsp m1872buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1873clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1874clear();

        public final native Builder m1875clear();

        public final native Builder clearEErrCode();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1876clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1877clone();

        public final native Builder m1878clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1879getDefaultInstanceForType();

        public final native TexasPoker$SCResetPwdUploadPhonenumberRsp m1880getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native boolean hasEErrCode();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1881mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1882mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1883mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1884mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1885mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCResetPwdUploadPhonenumberRsp texasPoker$SCResetPwdUploadPhonenumberRsp);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public static final Descriptor getDescriptor() {
            return TexasPoker.V();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{5545, 5546, 5547, 5548, 5549, 5550, 5551, 5552, 5553, 5554, 5555, 5556, 5557, 5558, 5559, 5560, 5561, 5562, 5563, 5564, 5565, 5566, 5567, 5568, 5569, 5570});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCResetPwdUploadPhonenumberRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCResetPwdUploadPhonenumberRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCResetPwdUploadPhonenumberRsp texasPoker$SCResetPwdUploadPhonenumberRsp);

    private native TexasPoker$SCResetPwdUploadPhonenumberRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCResetPwdUploadPhonenumberRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCResetPwdUploadPhonenumberRsp texasPoker$SCResetPwdUploadPhonenumberRsp);

    private native TexasPoker$SCResetPwdUploadPhonenumberRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m1862getDefaultInstanceForType();

    public final native TexasPoker$SCResetPwdUploadPhonenumberRsp m1863getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native Parser<TexasPoker$SCResetPwdUploadPhonenumberRsp> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1864newBuilderForType();

    public final native Builder m1865newBuilderForType();

    protected final native Builder m1866newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1867toBuilder();

    public final native Builder m1868toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCResetPwdUploadPhonenumberRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.V();
    }

    static void __clinit__() {
        PARSER = new C00371();
        TexasPoker$SCResetPwdUploadPhonenumberRsp texasPoker$SCResetPwdUploadPhonenumberRsp = new TexasPoker$SCResetPwdUploadPhonenumberRsp(true);
        defaultInstance = texasPoker$SCResetPwdUploadPhonenumberRsp;
        texasPoker$SCResetPwdUploadPhonenumberRsp.initFields();
    }

    public static TexasPoker$SCResetPwdUploadPhonenumberRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCResetPwdUploadPhonenumberRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCResetPwdUploadPhonenumberRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCResetPwdUploadPhonenumberRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCResetPwdUploadPhonenumberRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCResetPwdUploadPhonenumberRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCResetPwdUploadPhonenumberRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCResetPwdUploadPhonenumberRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCResetPwdUploadPhonenumberRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCResetPwdUploadPhonenumberRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCResetPwdUploadPhonenumberRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCResetPwdUploadPhonenumberRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCResetPwdUploadPhonenumberRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCResetPwdUploadPhonenumberRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCResetPwdUploadPhonenumberRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCResetPwdUploadPhonenumberRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCResetPwdUploadPhonenumberRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCResetPwdUploadPhonenumberRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCResetPwdUploadPhonenumberRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCResetPwdUploadPhonenumberRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCResetPwdUploadPhonenumberRsp texasPoker$SCResetPwdUploadPhonenumberRsp) {
        return newBuilder().mergeFrom(texasPoker$SCResetPwdUploadPhonenumberRsp);
    }
}
