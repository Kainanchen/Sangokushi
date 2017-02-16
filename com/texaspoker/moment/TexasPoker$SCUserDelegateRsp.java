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

public final class TexasPoker$SCUserDelegateRsp extends GeneratedMessage implements TexasPoker$SCUserDelegateRspOrBuilder {
    public static final int BDELEGATE_FIELD_NUMBER = 3;
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static final int LGAMEROOMID_FIELD_NUMBER = 2;
    public static Parser<TexasPoker$SCUserDelegateRsp> PARSER;
    private static final TexasPoker$SCUserDelegateRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bDelegate_;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private long lGameRoomID_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCUserDelegateRsp.1 */
    class C00691 extends AbstractParser<TexasPoker$SCUserDelegateRsp> {
        static {
            fixHelper.fixfunc(new int[]{33132, 33133});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00691();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCUserDelegateRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCUserDelegateRspOrBuilder {
        private int bDelegate_;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lGameRoomID_;

        static {
            fixHelper.fixfunc(new int[]{3965, 3966, 3967, 3968, 3969, 3970, 3971, 3972, 3973, 3974, 3975, 3976, 3977, 3978, 3979, 3980, 3981, 3982, 3983, 3984, 3985, 3986, 3987, 3988, 3989, 3990, 3991, 3992, 3993, 3994, 3995, 3996, 3997, 3998, 3999, 4000, 4001, 4002, 4003, 4004, 4005, 4006, 4007, 4008});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m2709build();

        public final native TexasPoker$SCUserDelegateRsp m2710build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m2711buildPartial();

        public final native TexasPoker$SCUserDelegateRsp m2712buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2713clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2714clear();

        public final native Builder m2715clear();

        public final native Builder clearBDelegate();

        public final native Builder clearEErrCode();

        public final native Builder clearLGameRoomID();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2716clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2717clone();

        public final native Builder m2718clone();

        public final native int getBDelegate();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2719getDefaultInstanceForType();

        public final native TexasPoker$SCUserDelegateRsp m2720getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLGameRoomID();

        public final native boolean hasBDelegate();

        public final native boolean hasEErrCode();

        public final native boolean hasLGameRoomID();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2721mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2722mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2723mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2724mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2725mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCUserDelegateRsp texasPoker$SCUserDelegateRsp);

        public final native Builder setBDelegate(int i);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setLGameRoomID(long j);

        public static final Descriptor getDescriptor() {
            return TexasPoker.gN();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{24084, 24085, 24086, 24087, 24088, 24089, 24090, 24091, 24092, 24093, 24094, 24095, 24096, 24097, 24098, 24099, 24100, 24101, 24102, 24103, 24104, 24105, 24106, 24107, 24108, 24109, 24110, 24111, 24112, 24113});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCUserDelegateRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCUserDelegateRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCUserDelegateRsp texasPoker$SCUserDelegateRsp);

    private native TexasPoker$SCUserDelegateRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCUserDelegateRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCUserDelegateRsp texasPoker$SCUserDelegateRsp);

    private native TexasPoker$SCUserDelegateRsp(boolean z);

    private native void initFields();

    public final native int getBDelegate();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m2702getDefaultInstanceForType();

    public final native TexasPoker$SCUserDelegateRsp m2703getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native long getLGameRoomID();

    public final native Parser<TexasPoker$SCUserDelegateRsp> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasBDelegate();

    public final native boolean hasEErrCode();

    public final native boolean hasLGameRoomID();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2704newBuilderForType();

    public final native Builder m2705newBuilderForType();

    protected final native Builder m2706newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2707toBuilder();

    public final native Builder m2708toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCUserDelegateRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.gN();
    }

    static void __clinit__() {
        PARSER = new C00691();
        TexasPoker$SCUserDelegateRsp texasPoker$SCUserDelegateRsp = new TexasPoker$SCUserDelegateRsp(true);
        defaultInstance = texasPoker$SCUserDelegateRsp;
        texasPoker$SCUserDelegateRsp.initFields();
    }

    public static TexasPoker$SCUserDelegateRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCUserDelegateRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCUserDelegateRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUserDelegateRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCUserDelegateRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCUserDelegateRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCUserDelegateRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUserDelegateRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCUserDelegateRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCUserDelegateRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCUserDelegateRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUserDelegateRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCUserDelegateRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCUserDelegateRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCUserDelegateRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUserDelegateRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCUserDelegateRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCUserDelegateRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCUserDelegateRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUserDelegateRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCUserDelegateRsp texasPoker$SCUserDelegateRsp) {
        return newBuilder().mergeFrom(texasPoker$SCUserDelegateRsp);
    }
}
