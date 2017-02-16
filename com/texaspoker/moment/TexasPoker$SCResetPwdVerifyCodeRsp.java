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

public final class TexasPoker$SCResetPwdVerifyCodeRsp extends GeneratedMessage implements TexasPoker$SCResetPwdVerifyCodeRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static Parser<TexasPoker$SCResetPwdVerifyCodeRsp> PARSER = null;
    public static final int SNEWPASSWORD_FIELD_NUMBER = 2;
    private static final TexasPoker$SCResetPwdVerifyCodeRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private Object sNewPassword_;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCResetPwdVerifyCodeRsp.1 */
    class C00381 extends AbstractParser<TexasPoker$SCResetPwdVerifyCodeRsp> {
        static {
            fixHelper.fixfunc(new int[]{4780, 4781});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00381();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCResetPwdVerifyCodeRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCResetPwdVerifyCodeRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private Object sNewPassword_;

        static {
            fixHelper.fixfunc(new int[]{6511, 6512, 6513, 6514, 6515, 6516, 6517, 6518, 6519, 6520, 6521, 6522, 6523, 6524, 6525, 6526, 6527, 6528, 6529, 6530, 6531, 6532, 6533, 6534, 6535, 6536, 6537, 6538, 6539, 6540, 6541, 6542, 6543, 6544, 6545, 6546, 6547, 6548, 6549, 6550, 6551, 6552});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m2229build();

        public final native TexasPoker$SCResetPwdVerifyCodeRsp m2230build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m2231buildPartial();

        public final native TexasPoker$SCResetPwdVerifyCodeRsp m2232buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2233clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2234clear();

        public final native Builder m2235clear();

        public final native Builder clearEErrCode();

        public final native Builder clearSNewPassword();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2236clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2237clone();

        public final native Builder m2238clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2239getDefaultInstanceForType();

        public final native TexasPoker$SCResetPwdVerifyCodeRsp m2240getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native String getSNewPassword();

        public final native ByteString getSNewPasswordBytes();

        public final native boolean hasEErrCode();

        public final native boolean hasSNewPassword();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2241mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2242mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2243mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2244mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2245mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCResetPwdVerifyCodeRsp texasPoker$SCResetPwdVerifyCodeRsp);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setSNewPassword(String str);

        public final native Builder setSNewPasswordBytes(ByteString byteString);

        public static final Descriptor getDescriptor() {
            return TexasPoker.Z();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{4834, 4835, 4836, 4837, 4838, 4839, 4840, 4841, 4842, 4843, 4844, 4845, 4846, 4847, 4848, 4849, 4850, 4851, 4852, 4853, 4854, 4855, 4856, 4857, 4858, 4859, 4860, 4861, 4862});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCResetPwdVerifyCodeRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCResetPwdVerifyCodeRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCResetPwdVerifyCodeRsp texasPoker$SCResetPwdVerifyCodeRsp);

    private native TexasPoker$SCResetPwdVerifyCodeRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCResetPwdVerifyCodeRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCResetPwdVerifyCodeRsp texasPoker$SCResetPwdVerifyCodeRsp);

    private native TexasPoker$SCResetPwdVerifyCodeRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m2222getDefaultInstanceForType();

    public final native TexasPoker$SCResetPwdVerifyCodeRsp m2223getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native Parser<TexasPoker$SCResetPwdVerifyCodeRsp> getParserForType();

    public final native String getSNewPassword();

    public final native ByteString getSNewPasswordBytes();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    public final native boolean hasSNewPassword();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2224newBuilderForType();

    public final native Builder m2225newBuilderForType();

    protected final native Builder m2226newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2227toBuilder();

    public final native Builder m2228toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCResetPwdVerifyCodeRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.Z();
    }

    static void __clinit__() {
        PARSER = new C00381();
        TexasPoker$SCResetPwdVerifyCodeRsp texasPoker$SCResetPwdVerifyCodeRsp = new TexasPoker$SCResetPwdVerifyCodeRsp(true);
        defaultInstance = texasPoker$SCResetPwdVerifyCodeRsp;
        texasPoker$SCResetPwdVerifyCodeRsp.initFields();
    }

    public static TexasPoker$SCResetPwdVerifyCodeRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCResetPwdVerifyCodeRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCResetPwdVerifyCodeRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCResetPwdVerifyCodeRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCResetPwdVerifyCodeRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCResetPwdVerifyCodeRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCResetPwdVerifyCodeRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCResetPwdVerifyCodeRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCResetPwdVerifyCodeRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCResetPwdVerifyCodeRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCResetPwdVerifyCodeRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCResetPwdVerifyCodeRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCResetPwdVerifyCodeRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCResetPwdVerifyCodeRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCResetPwdVerifyCodeRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCResetPwdVerifyCodeRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCResetPwdVerifyCodeRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCResetPwdVerifyCodeRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCResetPwdVerifyCodeRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCResetPwdVerifyCodeRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCResetPwdVerifyCodeRsp texasPoker$SCResetPwdVerifyCodeRsp) {
        return newBuilder().mergeFrom(texasPoker$SCResetPwdVerifyCodeRsp);
    }
}
