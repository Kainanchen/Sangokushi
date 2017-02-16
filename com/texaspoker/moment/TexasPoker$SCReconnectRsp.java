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

public final class TexasPoker$SCReconnectRsp extends GeneratedMessage implements TexasPoker$SCReconnectRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static final int IUPLOADLOG_FIELD_NUMBER = 5;
    public static final int LCURRENTSYSTEMTIME_FIELD_NUMBER = 4;
    public static Parser<TexasPoker$SCReconnectRsp> PARSER = null;
    public static final int SACCESSTOKEN_FIELD_NUMBER = 6;
    public static final int STGAMEROOMINFO_FIELD_NUMBER = 3;
    public static final int STUSERGAMEINFO_FIELD_NUMBER = 2;
    private static final TexasPoker$SCReconnectRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private int iUploadLog_;
    private long lCurrentSystemTime_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private Object sAccessToken_;
    private GameRoomInfo stGameRoomInfo_;
    private TexasPoker$UserGameInfoNet stUserGameInfo_;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCReconnectRsp.1 */
    class C00311 extends AbstractParser<TexasPoker$SCReconnectRsp> {
        static {
            fixHelper.fixfunc(new int[]{31248, 31249});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00311();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCReconnectRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCReconnectRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private int iUploadLog_;
        private long lCurrentSystemTime_;
        private Object sAccessToken_;
        private SingleFieldBuilder<GameRoomInfo, com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder, GameRoomInfoOrBuilder> stGameRoomInfoBuilder_;
        private GameRoomInfo stGameRoomInfo_;
        private SingleFieldBuilder<TexasPoker$UserGameInfoNet, com.texaspoker.moment.TexasPoker$UserGameInfoNet.Builder, TexasPoker$UserGameInfoNetOrBuilder> stUserGameInfoBuilder_;
        private TexasPoker$UserGameInfoNet stUserGameInfo_;

        static {
            fixHelper.fixfunc(new int[]{25026, 25027, 25028, 25029, 25030, 25031, 25032, 25033, 25034, 25035, 25036, 25037, 25038, 25039, 25040, 25041, 25042, 25043, 25044, 25045, 25046, 25047, 25048, 25049, 25050, 25051, 25052, 25053, 25054, 25055, 25056, 25057, 25058, 25059, 25060, 25061, 25062, 25063, 25064, 25065, 25066, 25067, 25068, 25069, 25070, 25071, 25072, 25073, 25074, 25075, 25076, 25077, 25078, 25079, 25080, 25081, 25082, 25083, 25084, 25085, 25086, 25087, 25088, 25089, 25090, 25091, 25092, 25093});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native SingleFieldBuilder<GameRoomInfo, com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder, GameRoomInfoOrBuilder> getStGameRoomInfoFieldBuilder();

        private native SingleFieldBuilder<TexasPoker$UserGameInfoNet, com.texaspoker.moment.TexasPoker$UserGameInfoNet.Builder, TexasPoker$UserGameInfoNetOrBuilder> getStUserGameInfoFieldBuilder();

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m1989build();

        public final native TexasPoker$SCReconnectRsp m1990build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m1991buildPartial();

        public final native TexasPoker$SCReconnectRsp m1992buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1993clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1994clear();

        public final native Builder m1995clear();

        public final native Builder clearEErrCode();

        public final native Builder clearIUploadLog();

        public final native Builder clearLCurrentSystemTime();

        public final native Builder clearSAccessToken();

        public final native Builder clearStGameRoomInfo();

        public final native Builder clearStUserGameInfo();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1996clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1997clone();

        public final native Builder m1998clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1999getDefaultInstanceForType();

        public final native TexasPoker$SCReconnectRsp m2000getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native int getIUploadLog();

        public final native long getLCurrentSystemTime();

        public final native String getSAccessToken();

        public final native ByteString getSAccessTokenBytes();

        public final native GameRoomInfo getStGameRoomInfo();

        public final native com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder getStGameRoomInfoBuilder();

        public final native GameRoomInfoOrBuilder getStGameRoomInfoOrBuilder();

        public final native TexasPoker$UserGameInfoNet getStUserGameInfo();

        public final native com.texaspoker.moment.TexasPoker$UserGameInfoNet.Builder getStUserGameInfoBuilder();

        public final native TexasPoker$UserGameInfoNetOrBuilder getStUserGameInfoOrBuilder();

        public final native boolean hasEErrCode();

        public final native boolean hasIUploadLog();

        public final native boolean hasLCurrentSystemTime();

        public final native boolean hasSAccessToken();

        public final native boolean hasStGameRoomInfo();

        public final native boolean hasStUserGameInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2001mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2002mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2003mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2004mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2005mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCReconnectRsp texasPoker$SCReconnectRsp);

        public final native Builder mergeStGameRoomInfo(GameRoomInfo gameRoomInfo);

        public final native Builder mergeStUserGameInfo(TexasPoker$UserGameInfoNet texasPoker$UserGameInfoNet);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setIUploadLog(int i);

        public final native Builder setLCurrentSystemTime(long j);

        public final native Builder setSAccessToken(String str);

        public final native Builder setSAccessTokenBytes(ByteString byteString);

        public final native Builder setStGameRoomInfo(com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder builder);

        public final native Builder setStGameRoomInfo(GameRoomInfo gameRoomInfo);

        public final native Builder setStUserGameInfo(com.texaspoker.moment.TexasPoker$UserGameInfoNet.Builder builder);

        public final native Builder setStUserGameInfo(TexasPoker$UserGameInfoNet texasPoker$UserGameInfoNet);

        public static final Descriptor getDescriptor() {
            return TexasPoker.R();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{29128, 29129, 29130, 29131, 29132, 29133, 29134, 29135, 29136, 29137, 29138, 29139, 29140, 29141, 29142, 29143, 29144, 29145, 29146, 29147, 29148, 29149, 29150, 29151, 29152, 29153, 29154, 29155, 29156, 29157, 29158, 29159, 29160, 29161, 29162, 29163, 29164, 29165, 29166});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCReconnectRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCReconnectRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCReconnectRsp texasPoker$SCReconnectRsp);

    private native TexasPoker$SCReconnectRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCReconnectRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCReconnectRsp texasPoker$SCReconnectRsp);

    private native TexasPoker$SCReconnectRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m1982getDefaultInstanceForType();

    public final native TexasPoker$SCReconnectRsp m1983getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native int getIUploadLog();

    public final native long getLCurrentSystemTime();

    public final native Parser<TexasPoker$SCReconnectRsp> getParserForType();

    public final native String getSAccessToken();

    public final native ByteString getSAccessTokenBytes();

    public final native int getSerializedSize();

    public final native GameRoomInfo getStGameRoomInfo();

    public final native GameRoomInfoOrBuilder getStGameRoomInfoOrBuilder();

    public final native TexasPoker$UserGameInfoNet getStUserGameInfo();

    public final native TexasPoker$UserGameInfoNetOrBuilder getStUserGameInfoOrBuilder();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    public final native boolean hasIUploadLog();

    public final native boolean hasLCurrentSystemTime();

    public final native boolean hasSAccessToken();

    public final native boolean hasStGameRoomInfo();

    public final native boolean hasStUserGameInfo();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1984newBuilderForType();

    public final native Builder m1985newBuilderForType();

    protected final native Builder m1986newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1987toBuilder();

    public final native Builder m1988toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCReconnectRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.R();
    }

    static void __clinit__() {
        PARSER = new C00311();
        TexasPoker$SCReconnectRsp texasPoker$SCReconnectRsp = new TexasPoker$SCReconnectRsp(true);
        defaultInstance = texasPoker$SCReconnectRsp;
        texasPoker$SCReconnectRsp.initFields();
    }

    public static TexasPoker$SCReconnectRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCReconnectRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCReconnectRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCReconnectRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCReconnectRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCReconnectRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCReconnectRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCReconnectRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCReconnectRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCReconnectRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCReconnectRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCReconnectRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCReconnectRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCReconnectRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCReconnectRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCReconnectRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCReconnectRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCReconnectRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCReconnectRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCReconnectRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCReconnectRsp texasPoker$SCReconnectRsp) {
        return newBuilder().mergeFrom(texasPoker$SCReconnectRsp);
    }
}
