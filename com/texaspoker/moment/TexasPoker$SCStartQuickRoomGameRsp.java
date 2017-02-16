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
import com.texaspoker.moment.TexasPoker.GameRoomInfo;
import com.texaspoker.moment.TexasPoker.GameRoomInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import java.io.InputStream;

public final class TexasPoker$SCStartQuickRoomGameRsp extends GeneratedMessage implements TexasPoker$SCStartQuickRoomGameRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static final int LROOMID_FIELD_NUMBER = 3;
    public static Parser<TexasPoker$SCStartQuickRoomGameRsp> PARSER = null;
    public static final int STGAMEROOMINFO_FIELD_NUMBER = 2;
    private static final TexasPoker$SCStartQuickRoomGameRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private long lRoomID_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private GameRoomInfo stGameRoomInfo_;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCStartQuickRoomGameRsp.1 */
    class C00551 extends AbstractParser<TexasPoker$SCStartQuickRoomGameRsp> {
        static {
            fixHelper.fixfunc(new int[]{14833, 14834});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00551();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCStartQuickRoomGameRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCStartQuickRoomGameRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lRoomID_;
        private SingleFieldBuilder<GameRoomInfo, com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder, GameRoomInfoOrBuilder> stGameRoomInfoBuilder_;
        private GameRoomInfo stGameRoomInfo_;

        static {
            fixHelper.fixfunc(new int[]{30108, 30109, 30110, 30111, 30112, 30113, 30114, 30115, 30116, 30117, 30118, 30119, 30120, 30121, 30122, 30123, 30124, 30125, 30126, 30127, 30128, 30129, 30130, 30131, 30132, 30133, 30134, 30135, 30136, 30137, 30138, 30139, 30140, 30141, 30142, 30143, 30144, 30145, 30146, 30147, 30148, 30149, 30150, 30151, 30152, 30153, 30154, 30155, 30156});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native SingleFieldBuilder<GameRoomInfo, com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder, GameRoomInfoOrBuilder> getStGameRoomInfoFieldBuilder();

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m2277build();

        public final native TexasPoker$SCStartQuickRoomGameRsp m2278build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m2279buildPartial();

        public final native TexasPoker$SCStartQuickRoomGameRsp m2280buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2281clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2282clear();

        public final native Builder m2283clear();

        public final native Builder clearEErrCode();

        public final native Builder clearLRoomID();

        public final native Builder clearStGameRoomInfo();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2284clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2285clone();

        public final native Builder m2286clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2287getDefaultInstanceForType();

        public final native TexasPoker$SCStartQuickRoomGameRsp m2288getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLRoomID();

        public final native GameRoomInfo getStGameRoomInfo();

        public final native com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder getStGameRoomInfoBuilder();

        public final native GameRoomInfoOrBuilder getStGameRoomInfoOrBuilder();

        public final native boolean hasEErrCode();

        public final native boolean hasLRoomID();

        public final native boolean hasStGameRoomInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2289mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2290mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2291mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2292mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2293mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCStartQuickRoomGameRsp texasPoker$SCStartQuickRoomGameRsp);

        public final native Builder mergeStGameRoomInfo(GameRoomInfo gameRoomInfo);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setLRoomID(long j);

        public final native Builder setStGameRoomInfo(com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder builder);

        public final native Builder setStGameRoomInfo(GameRoomInfo gameRoomInfo);

        public static final Descriptor getDescriptor() {
            return TexasPoker.ef();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{23499, 23500, 23501, 23502, 23503, 23504, 23505, 23506, 23507, 23508, 23509, 23510, 23511, 23512, 23513, 23514, 23515, 23516, 23517, 23518, 23519, 23520, 23521, 23522, 23523, 23524, 23525, 23526, 23527, 23528, 23529});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCStartQuickRoomGameRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCStartQuickRoomGameRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCStartQuickRoomGameRsp texasPoker$SCStartQuickRoomGameRsp);

    private native TexasPoker$SCStartQuickRoomGameRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCStartQuickRoomGameRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCStartQuickRoomGameRsp texasPoker$SCStartQuickRoomGameRsp);

    private native TexasPoker$SCStartQuickRoomGameRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m2270getDefaultInstanceForType();

    public final native TexasPoker$SCStartQuickRoomGameRsp m2271getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native long getLRoomID();

    public final native Parser<TexasPoker$SCStartQuickRoomGameRsp> getParserForType();

    public final native int getSerializedSize();

    public final native GameRoomInfo getStGameRoomInfo();

    public final native GameRoomInfoOrBuilder getStGameRoomInfoOrBuilder();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    public final native boolean hasLRoomID();

    public final native boolean hasStGameRoomInfo();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2272newBuilderForType();

    public final native Builder m2273newBuilderForType();

    protected final native Builder m2274newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2275toBuilder();

    public final native Builder m2276toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCStartQuickRoomGameRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.ef();
    }

    static void __clinit__() {
        PARSER = new C00551();
        TexasPoker$SCStartQuickRoomGameRsp texasPoker$SCStartQuickRoomGameRsp = new TexasPoker$SCStartQuickRoomGameRsp(true);
        defaultInstance = texasPoker$SCStartQuickRoomGameRsp;
        texasPoker$SCStartQuickRoomGameRsp.initFields();
    }

    public static TexasPoker$SCStartQuickRoomGameRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCStartQuickRoomGameRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCStartQuickRoomGameRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCStartQuickRoomGameRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCStartQuickRoomGameRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCStartQuickRoomGameRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCStartQuickRoomGameRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCStartQuickRoomGameRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCStartQuickRoomGameRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCStartQuickRoomGameRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCStartQuickRoomGameRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCStartQuickRoomGameRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCStartQuickRoomGameRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCStartQuickRoomGameRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCStartQuickRoomGameRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCStartQuickRoomGameRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCStartQuickRoomGameRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCStartQuickRoomGameRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCStartQuickRoomGameRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCStartQuickRoomGameRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCStartQuickRoomGameRsp texasPoker$SCStartQuickRoomGameRsp) {
        return newBuilder().mergeFrom(texasPoker$SCStartQuickRoomGameRsp);
    }
}
