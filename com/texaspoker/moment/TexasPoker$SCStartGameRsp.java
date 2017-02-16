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

public final class TexasPoker$SCStartGameRsp extends GeneratedMessage implements TexasPoker$SCStartGameRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static final int LROOMID_FIELD_NUMBER = 2;
    public static final int LSTARTTIME_FIELD_NUMBER = 3;
    public static Parser<TexasPoker$SCStartGameRsp> PARSER;
    private static final TexasPoker$SCStartGameRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private long lRoomID_;
    private long lStartTime_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCStartGameRsp.1 */
    class C00541 extends AbstractParser<TexasPoker$SCStartGameRsp> {
        static {
            fixHelper.fixfunc(new int[]{5031, 5032});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00541();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCStartGameRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCStartGameRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lRoomID_;
        private long lStartTime_;

        static {
            fixHelper.fixfunc(new int[]{5315, 5316, 5317, 5318, 5319, 5320, 5321, 5322, 5323, 5324, 5325, 5326, 5327, 5328, 5329, 5330, 5331, 5332, 5333, 5334, 5335, 5336, 5337, 5338, 5339, 5340, 5341, 5342, 5343, 5344, 5345, 5346, 5347, 5348, 5349, 5350, 5351, 5352, 5353, 5354, 5355, 5356, 5357, 5358});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m2253build();

        public final native TexasPoker$SCStartGameRsp m2254build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m2255buildPartial();

        public final native TexasPoker$SCStartGameRsp m2256buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2257clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2258clear();

        public final native Builder m2259clear();

        public final native Builder clearEErrCode();

        public final native Builder clearLRoomID();

        public final native Builder clearLStartTime();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2260clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2261clone();

        public final native Builder m2262clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2263getDefaultInstanceForType();

        public final native TexasPoker$SCStartGameRsp m2264getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLRoomID();

        public final native long getLStartTime();

        public final native boolean hasEErrCode();

        public final native boolean hasLRoomID();

        public final native boolean hasLStartTime();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2265mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2266mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2267mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2268mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2269mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCStartGameRsp texasPoker$SCStartGameRsp);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setLRoomID(long j);

        public final native Builder setLStartTime(long j);

        public static final Descriptor getDescriptor() {
            return TexasPoker.ex();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{14835, 14836, 14837, 14838, 14839, 14840, 14841, 14842, 14843, 14844, 14845, 14846, 14847, 14848, 14849, 14850, 14851, 14852, 14853, 14854, 14855, 14856, 14857, 14858, 14859, 14860, 14861, 14862, 14863, 14864});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCStartGameRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCStartGameRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCStartGameRsp texasPoker$SCStartGameRsp);

    private native TexasPoker$SCStartGameRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCStartGameRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCStartGameRsp texasPoker$SCStartGameRsp);

    private native TexasPoker$SCStartGameRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m2246getDefaultInstanceForType();

    public final native TexasPoker$SCStartGameRsp m2247getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native long getLRoomID();

    public final native long getLStartTime();

    public final native Parser<TexasPoker$SCStartGameRsp> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    public final native boolean hasLRoomID();

    public final native boolean hasLStartTime();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2248newBuilderForType();

    public final native Builder m2249newBuilderForType();

    protected final native Builder m2250newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2251toBuilder();

    public final native Builder m2252toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCStartGameRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.ex();
    }

    static void __clinit__() {
        PARSER = new C00541();
        TexasPoker$SCStartGameRsp texasPoker$SCStartGameRsp = new TexasPoker$SCStartGameRsp(true);
        defaultInstance = texasPoker$SCStartGameRsp;
        texasPoker$SCStartGameRsp.initFields();
    }

    public static TexasPoker$SCStartGameRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCStartGameRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCStartGameRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCStartGameRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCStartGameRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCStartGameRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCStartGameRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCStartGameRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCStartGameRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCStartGameRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCStartGameRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCStartGameRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCStartGameRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCStartGameRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCStartGameRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCStartGameRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCStartGameRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCStartGameRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCStartGameRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCStartGameRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCStartGameRsp texasPoker$SCStartGameRsp) {
        return newBuilder().mergeFrom(texasPoker$SCStartGameRsp);
    }
}
