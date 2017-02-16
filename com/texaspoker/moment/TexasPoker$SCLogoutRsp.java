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

public final class TexasPoker$SCLogoutRsp extends GeneratedMessage implements TexasPoker$SCLogoutRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static Parser<TexasPoker$SCLogoutRsp> PARSER;
    private static final TexasPoker$SCLogoutRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCLogoutRsp.1 */
    class C00251 extends AbstractParser<TexasPoker$SCLogoutRsp> {
        static {
            fixHelper.fixfunc(new int[]{16366, 16367});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00251();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCLogoutRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCLogoutRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;

        static {
            fixHelper.fixfunc(new int[]{25653, 25654, 25655, 25656, 25657, 25658, 25659, 25660, 25661, 25662, 25663, 25664, 25665, 25666, 25667, 25668, 25669, 25670, 25671, 25672, 25673, 25674, 25675, 25676, 25677, 25678, 25679, 25680, 25681, 25682, 25683, 25684, 25685, 25686, 25687, 25688});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m1581build();

        public final native TexasPoker$SCLogoutRsp m1582build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m1583buildPartial();

        public final native TexasPoker$SCLogoutRsp m1584buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1585clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1586clear();

        public final native Builder m1587clear();

        public final native Builder clearEErrCode();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1588clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1589clone();

        public final native Builder m1590clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1591getDefaultInstanceForType();

        public final native TexasPoker$SCLogoutRsp m1592getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native boolean hasEErrCode();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1593mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1594mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1595mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1596mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1597mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCLogoutRsp texasPoker$SCLogoutRsp);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public static final Descriptor getDescriptor() {
            return TexasPoker.av();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{29220, 29221, 29222, 29223, 29224, 29225, 29226, 29227, 29228, 29229, 29230, 29231, 29232, 29233, 29234, 29235, 29236, 29237, 29238, 29239, 29240, 29241, 29242, 29243, 29244, 29245});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCLogoutRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCLogoutRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCLogoutRsp texasPoker$SCLogoutRsp);

    private native TexasPoker$SCLogoutRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCLogoutRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCLogoutRsp texasPoker$SCLogoutRsp);

    private native TexasPoker$SCLogoutRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m1574getDefaultInstanceForType();

    public final native TexasPoker$SCLogoutRsp m1575getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native Parser<TexasPoker$SCLogoutRsp> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1576newBuilderForType();

    public final native Builder m1577newBuilderForType();

    protected final native Builder m1578newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1579toBuilder();

    public final native Builder m1580toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCLogoutRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.av();
    }

    static void __clinit__() {
        PARSER = new C00251();
        TexasPoker$SCLogoutRsp texasPoker$SCLogoutRsp = new TexasPoker$SCLogoutRsp(true);
        defaultInstance = texasPoker$SCLogoutRsp;
        texasPoker$SCLogoutRsp.initFields();
    }

    public static TexasPoker$SCLogoutRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCLogoutRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCLogoutRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCLogoutRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCLogoutRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCLogoutRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCLogoutRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCLogoutRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCLogoutRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCLogoutRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCLogoutRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCLogoutRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCLogoutRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCLogoutRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCLogoutRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCLogoutRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCLogoutRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCLogoutRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCLogoutRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCLogoutRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCLogoutRsp texasPoker$SCLogoutRsp) {
        return newBuilder().mergeFrom(texasPoker$SCLogoutRsp);
    }
}
