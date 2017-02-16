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

public final class TexasPoker$SCLeaveSNGGameRoomRsp extends GeneratedMessage implements TexasPoker$SCLeaveSNGGameRoomRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static final int LGAMEROOMID_FIELD_NUMBER = 2;
    public static Parser<TexasPoker$SCLeaveSNGGameRoomRsp> PARSER;
    private static final TexasPoker$SCLeaveSNGGameRoomRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private long lGameRoomID_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCLeaveSNGGameRoomRsp.1 */
    class C00221 extends AbstractParser<TexasPoker$SCLeaveSNGGameRoomRsp> {
        static {
            fixHelper.fixfunc(new int[]{31196, 31197});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00221();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCLeaveSNGGameRoomRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCLeaveSNGGameRoomRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lGameRoomID_;

        static {
            fixHelper.fixfunc(new int[]{29559, 29560, 29561, 29562, 29563, 29564, 29565, 29566, 29567, 29568, 29569, 29570, 29571, 29572, 29573, 29574, 29575, 29576, 29577, 29578, 29579, 29580, 29581, 29582, 29583, 29584, 29585, 29586, 29587, 29588, 29589, 29590, 29591, 29592, 29593, 29594, 29595, 29596, 29597, 29598});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m1533build();

        public final native TexasPoker$SCLeaveSNGGameRoomRsp m1534build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m1535buildPartial();

        public final native TexasPoker$SCLeaveSNGGameRoomRsp m1536buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1537clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1538clear();

        public final native Builder m1539clear();

        public final native Builder clearEErrCode();

        public final native Builder clearLGameRoomID();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1540clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1541clone();

        public final native Builder m1542clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1543getDefaultInstanceForType();

        public final native TexasPoker$SCLeaveSNGGameRoomRsp m1544getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLGameRoomID();

        public final native boolean hasEErrCode();

        public final native boolean hasLGameRoomID();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1545mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1546mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1547mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1548mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1549mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCLeaveSNGGameRoomRsp texasPoker$SCLeaveSNGGameRoomRsp);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setLGameRoomID(long j);

        public static final Descriptor getDescriptor() {
            return TexasPoker.cj();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{11967, 11968, 11969, 11970, 11971, 11972, 11973, 11974, 11975, 11976, 11977, 11978, 11979, 11980, 11981, 11982, 11983, 11984, 11985, 11986, 11987, 11988, 11989, 11990, 11991, 11992, 11993, 11994});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCLeaveSNGGameRoomRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCLeaveSNGGameRoomRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCLeaveSNGGameRoomRsp texasPoker$SCLeaveSNGGameRoomRsp);

    private native TexasPoker$SCLeaveSNGGameRoomRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCLeaveSNGGameRoomRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCLeaveSNGGameRoomRsp texasPoker$SCLeaveSNGGameRoomRsp);

    private native TexasPoker$SCLeaveSNGGameRoomRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m1526getDefaultInstanceForType();

    public final native TexasPoker$SCLeaveSNGGameRoomRsp m1527getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native long getLGameRoomID();

    public final native Parser<TexasPoker$SCLeaveSNGGameRoomRsp> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    public final native boolean hasLGameRoomID();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1528newBuilderForType();

    public final native Builder m1529newBuilderForType();

    protected final native Builder m1530newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1531toBuilder();

    public final native Builder m1532toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCLeaveSNGGameRoomRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.cj();
    }

    static void __clinit__() {
        PARSER = new C00221();
        TexasPoker$SCLeaveSNGGameRoomRsp texasPoker$SCLeaveSNGGameRoomRsp = new TexasPoker$SCLeaveSNGGameRoomRsp(true);
        defaultInstance = texasPoker$SCLeaveSNGGameRoomRsp;
        texasPoker$SCLeaveSNGGameRoomRsp.initFields();
    }

    public static TexasPoker$SCLeaveSNGGameRoomRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCLeaveSNGGameRoomRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCLeaveSNGGameRoomRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCLeaveSNGGameRoomRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCLeaveSNGGameRoomRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCLeaveSNGGameRoomRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCLeaveSNGGameRoomRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCLeaveSNGGameRoomRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCLeaveSNGGameRoomRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCLeaveSNGGameRoomRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCLeaveSNGGameRoomRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCLeaveSNGGameRoomRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCLeaveSNGGameRoomRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCLeaveSNGGameRoomRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCLeaveSNGGameRoomRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCLeaveSNGGameRoomRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCLeaveSNGGameRoomRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCLeaveSNGGameRoomRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCLeaveSNGGameRoomRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCLeaveSNGGameRoomRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCLeaveSNGGameRoomRsp texasPoker$SCLeaveSNGGameRoomRsp) {
        return newBuilder().mergeFrom(texasPoker$SCLeaveSNGGameRoomRsp);
    }
}
