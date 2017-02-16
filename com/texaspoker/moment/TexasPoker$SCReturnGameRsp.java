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

public final class TexasPoker$SCReturnGameRsp extends GeneratedMessage implements TexasPoker$SCReturnGameRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static final int LGAMEROOMID_FIELD_NUMBER = 2;
    public static Parser<TexasPoker$SCReturnGameRsp> PARSER;
    private static final TexasPoker$SCReturnGameRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private long lGameRoomID_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCReturnGameRsp.1 */
    class C00391 extends AbstractParser<TexasPoker$SCReturnGameRsp> {
        static {
            fixHelper.fixfunc(new int[]{32501, 32502});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00391();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCReturnGameRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCReturnGameRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lGameRoomID_;

        static {
            fixHelper.fixfunc(new int[]{24580, 24581, 24582, 24583, 24584, 24585, 24586, 24587, 24588, 24589, 24590, 24591, 24592, 24593, 24594, 24595, 24596, 24597, 24598, 24599, 24600, 24601, 24602, 24603, 24604, 24605, 24606, 24607, 24608, 24609, 24610, 24611, 24612, 24613, 24614, 24615, 24616, 24617, 24618, 24619});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m1893build();

        public final native TexasPoker$SCReturnGameRsp m1894build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m1895buildPartial();

        public final native TexasPoker$SCReturnGameRsp m1896buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1897clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1898clear();

        public final native Builder m1899clear();

        public final native Builder clearEErrCode();

        public final native Builder clearLGameRoomID();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1900clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1901clone();

        public final native Builder m1902clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1903getDefaultInstanceForType();

        public final native TexasPoker$SCReturnGameRsp m1904getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLGameRoomID();

        public final native boolean hasEErrCode();

        public final native boolean hasLGameRoomID();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1905mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1906mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1907mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1908mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1909mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCReturnGameRsp texasPoker$SCReturnGameRsp);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setLGameRoomID(long j);

        public static final Descriptor getDescriptor() {
            return TexasPoker.eJ();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{15495, 15496, 15497, 15498, 15499, 15500, 15501, 15502, 15503, 15504, 15505, 15506, 15507, 15508, 15509, 15510, 15511, 15512, 15513, 15514, 15515, 15516, 15517, 15518, 15519, 15520, 15521, 15522});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCReturnGameRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCReturnGameRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCReturnGameRsp texasPoker$SCReturnGameRsp);

    private native TexasPoker$SCReturnGameRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCReturnGameRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCReturnGameRsp texasPoker$SCReturnGameRsp);

    private native TexasPoker$SCReturnGameRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m1886getDefaultInstanceForType();

    public final native TexasPoker$SCReturnGameRsp m1887getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native long getLGameRoomID();

    public final native Parser<TexasPoker$SCReturnGameRsp> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    public final native boolean hasLGameRoomID();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1888newBuilderForType();

    public final native Builder m1889newBuilderForType();

    protected final native Builder m1890newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1891toBuilder();

    public final native Builder m1892toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCReturnGameRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.eJ();
    }

    static void __clinit__() {
        PARSER = new C00391();
        TexasPoker$SCReturnGameRsp texasPoker$SCReturnGameRsp = new TexasPoker$SCReturnGameRsp(true);
        defaultInstance = texasPoker$SCReturnGameRsp;
        texasPoker$SCReturnGameRsp.initFields();
    }

    public static TexasPoker$SCReturnGameRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCReturnGameRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCReturnGameRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCReturnGameRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCReturnGameRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCReturnGameRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCReturnGameRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCReturnGameRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCReturnGameRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCReturnGameRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCReturnGameRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCReturnGameRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCReturnGameRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCReturnGameRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCReturnGameRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCReturnGameRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCReturnGameRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCReturnGameRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCReturnGameRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCReturnGameRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCReturnGameRsp texasPoker$SCReturnGameRsp) {
        return newBuilder().mergeFrom(texasPoker$SCReturnGameRsp);
    }
}
