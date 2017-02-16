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

public final class TexasPoker$SCRegetVerifyCodeRsp extends GeneratedMessage implements TexasPoker$SCRegetVerifyCodeRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static Parser<TexasPoker$SCRegetVerifyCodeRsp> PARSER;
    private static final TexasPoker$SCRegetVerifyCodeRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCRegetVerifyCodeRsp.1 */
    class C00321 extends AbstractParser<TexasPoker$SCRegetVerifyCodeRsp> {
        static {
            fixHelper.fixfunc(new int[]{22357, 22358});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00321();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCRegetVerifyCodeRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCRegetVerifyCodeRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;

        static {
            fixHelper.fixfunc(new int[]{25584, 25585, 25586, 25587, 25588, 25589, 25590, 25591, 25592, 25593, 25594, 25595, 25596, 25597, 25598, 25599, 25600, 25601, 25602, 25603, 25604, 25605, 25606, 25607, 25608, 25609, 25610, 25611, 25612, 25613, 25614, 25615, 25616, 25617, 25618, 25619});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m1749build();

        public final native TexasPoker$SCRegetVerifyCodeRsp m1750build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m1751buildPartial();

        public final native TexasPoker$SCRegetVerifyCodeRsp m1752buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1753clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1754clear();

        public final native Builder m1755clear();

        public final native Builder clearEErrCode();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1756clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1757clone();

        public final native Builder m1758clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1759getDefaultInstanceForType();

        public final native TexasPoker$SCRegetVerifyCodeRsp m1760getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native boolean hasEErrCode();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1761mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1762mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1763mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1764mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1765mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCRegetVerifyCodeRsp texasPoker$SCRegetVerifyCodeRsp);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public static final Descriptor getDescriptor() {
            return TexasPoker.B();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{29680, 29681, 29682, 29683, 29684, 29685, 29686, 29687, 29688, 29689, 29690, 29691, 29692, 29693, 29694, 29695, 29696, 29697, 29698, 29699, 29700, 29701, 29702, 29703, 29704, 29705});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCRegetVerifyCodeRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCRegetVerifyCodeRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCRegetVerifyCodeRsp texasPoker$SCRegetVerifyCodeRsp);

    private native TexasPoker$SCRegetVerifyCodeRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCRegetVerifyCodeRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCRegetVerifyCodeRsp texasPoker$SCRegetVerifyCodeRsp);

    private native TexasPoker$SCRegetVerifyCodeRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m1742getDefaultInstanceForType();

    public final native TexasPoker$SCRegetVerifyCodeRsp m1743getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native Parser<TexasPoker$SCRegetVerifyCodeRsp> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1744newBuilderForType();

    public final native Builder m1745newBuilderForType();

    protected final native Builder m1746newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1747toBuilder();

    public final native Builder m1748toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCRegetVerifyCodeRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.B();
    }

    static void __clinit__() {
        PARSER = new C00321();
        TexasPoker$SCRegetVerifyCodeRsp texasPoker$SCRegetVerifyCodeRsp = new TexasPoker$SCRegetVerifyCodeRsp(true);
        defaultInstance = texasPoker$SCRegetVerifyCodeRsp;
        texasPoker$SCRegetVerifyCodeRsp.initFields();
    }

    public static TexasPoker$SCRegetVerifyCodeRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCRegetVerifyCodeRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCRegetVerifyCodeRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCRegetVerifyCodeRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCRegetVerifyCodeRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCRegetVerifyCodeRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCRegetVerifyCodeRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCRegetVerifyCodeRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCRegetVerifyCodeRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCRegetVerifyCodeRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCRegetVerifyCodeRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCRegetVerifyCodeRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCRegetVerifyCodeRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCRegetVerifyCodeRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCRegetVerifyCodeRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCRegetVerifyCodeRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCRegetVerifyCodeRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCRegetVerifyCodeRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCRegetVerifyCodeRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCRegetVerifyCodeRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCRegetVerifyCodeRsp texasPoker$SCRegetVerifyCodeRsp) {
        return newBuilder().mergeFrom(texasPoker$SCRegetVerifyCodeRsp);
    }
}
