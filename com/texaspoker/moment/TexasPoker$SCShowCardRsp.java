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

public final class TexasPoker$SCShowCardRsp extends GeneratedMessage implements TexasPoker$SCShowCardRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static final int LGAMEID_FIELD_NUMBER = 3;
    public static Parser<TexasPoker$SCShowCardRsp> PARSER = null;
    public static final int STGAMEROOMINFO_FIELD_NUMBER = 2;
    private static final TexasPoker$SCShowCardRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private long lGameID_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private GameRoomInfo stGameRoomInfo_;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCShowCardRsp.1 */
    class C00491 extends AbstractParser<TexasPoker$SCShowCardRsp> {
        static {
            fixHelper.fixfunc(new int[]{6640, 6641});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00491();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCShowCardRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCShowCardRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lGameID_;
        private SingleFieldBuilder<GameRoomInfo, com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder, GameRoomInfoOrBuilder> stGameRoomInfoBuilder_;
        private GameRoomInfo stGameRoomInfo_;

        static {
            fixHelper.fixfunc(new int[]{25535, 25536, 25537, 25538, 25539, 25540, 25541, 25542, 25543, 25544, 25545, 25546, 25547, 25548, 25549, 25550, 25551, 25552, 25553, 25554, 25555, 25556, 25557, 25558, 25559, 25560, 25561, 25562, 25563, 25564, 25565, 25566, 25567, 25568, 25569, 25570, 25571, 25572, 25573, 25574, 25575, 25576, 25577, 25578, 25579, 25580, 25581, 25582, 25583});
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

        public final native /* bridge */ /* synthetic */ MessageLite m2157build();

        public final native TexasPoker$SCShowCardRsp m2158build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m2159buildPartial();

        public final native TexasPoker$SCShowCardRsp m2160buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2161clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2162clear();

        public final native Builder m2163clear();

        public final native Builder clearEErrCode();

        public final native Builder clearLGameID();

        public final native Builder clearStGameRoomInfo();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2164clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2165clone();

        public final native Builder m2166clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2167getDefaultInstanceForType();

        public final native TexasPoker$SCShowCardRsp m2168getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLGameID();

        public final native GameRoomInfo getStGameRoomInfo();

        public final native com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder getStGameRoomInfoBuilder();

        public final native GameRoomInfoOrBuilder getStGameRoomInfoOrBuilder();

        public final native boolean hasEErrCode();

        public final native boolean hasLGameID();

        public final native boolean hasStGameRoomInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2169mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2170mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2171mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2172mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2173mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCShowCardRsp texasPoker$SCShowCardRsp);

        public final native Builder mergeStGameRoomInfo(GameRoomInfo gameRoomInfo);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setLGameID(long j);

        public final native Builder setStGameRoomInfo(com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder builder);

        public final native Builder setStGameRoomInfo(GameRoomInfo gameRoomInfo);

        public static final Descriptor getDescriptor() {
            return TexasPoker.dN();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{10772, 10773, 10774, 10775, 10776, 10777, 10778, 10779, 10780, 10781, 10782, 10783, 10784, 10785, 10786, 10787, 10788, 10789, 10790, 10791, 10792, 10793, 10794, 10795, 10796, 10797, 10798, 10799, 10800, 10801, 10802});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCShowCardRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCShowCardRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCShowCardRsp texasPoker$SCShowCardRsp);

    private native TexasPoker$SCShowCardRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCShowCardRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCShowCardRsp texasPoker$SCShowCardRsp);

    private native TexasPoker$SCShowCardRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m2150getDefaultInstanceForType();

    public final native TexasPoker$SCShowCardRsp m2151getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native long getLGameID();

    public final native Parser<TexasPoker$SCShowCardRsp> getParserForType();

    public final native int getSerializedSize();

    public final native GameRoomInfo getStGameRoomInfo();

    public final native GameRoomInfoOrBuilder getStGameRoomInfoOrBuilder();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    public final native boolean hasLGameID();

    public final native boolean hasStGameRoomInfo();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2152newBuilderForType();

    public final native Builder m2153newBuilderForType();

    protected final native Builder m2154newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2155toBuilder();

    public final native Builder m2156toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCShowCardRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.dN();
    }

    static void __clinit__() {
        PARSER = new C00491();
        TexasPoker$SCShowCardRsp texasPoker$SCShowCardRsp = new TexasPoker$SCShowCardRsp(true);
        defaultInstance = texasPoker$SCShowCardRsp;
        texasPoker$SCShowCardRsp.initFields();
    }

    public static TexasPoker$SCShowCardRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCShowCardRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCShowCardRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCShowCardRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCShowCardRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCShowCardRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCShowCardRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCShowCardRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCShowCardRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCShowCardRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCShowCardRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCShowCardRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCShowCardRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCShowCardRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCShowCardRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCShowCardRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCShowCardRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCShowCardRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCShowCardRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCShowCardRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCShowCardRsp texasPoker$SCShowCardRsp) {
        return newBuilder().mergeFrom(texasPoker$SCShowCardRsp);
    }
}
