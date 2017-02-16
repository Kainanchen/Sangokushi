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
import com.texaspoker.moment.TexasPoker.GameRoomBaseInfo;
import com.texaspoker.moment.TexasPoker.GameRoomBaseInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import java.io.InputStream;

public final class TexasPoker$SCPauseGameRsp extends GeneratedMessage implements TexasPoker$SCPauseGameRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static Parser<TexasPoker$SCPauseGameRsp> PARSER = null;
    public static final int STGAMEROOMBASEINFO_FIELD_NUMBER = 2;
    private static final TexasPoker$SCPauseGameRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private GameRoomBaseInfo stGameRoomBaseInfo_;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCPauseGameRsp.1 */
    class C00261 extends AbstractParser<TexasPoker$SCPauseGameRsp> {
        static {
            fixHelper.fixfunc(new int[]{15493, 15494});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00261();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCPauseGameRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCPauseGameRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private SingleFieldBuilder<GameRoomBaseInfo, com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder, GameRoomBaseInfoOrBuilder> stGameRoomBaseInfoBuilder_;
        private GameRoomBaseInfo stGameRoomBaseInfo_;

        static {
            fixHelper.fixfunc(new int[]{13662, 13663, 13664, 13665, 13666, 13667, 13668, 13669, 13670, 13671, 13672, 13673, 13674, 13675, 13676, 13677, 13678, 13679, 13680, 13681, 13682, 13683, 13684, 13685, 13686, 13687, 13688, 13689, 13690, 13691, 13692, 13693, 13694, 13695, 13696, 13697, 13698, 13699, 13700, 13701, 13702, 13703, 13704, 13705, 13706});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native SingleFieldBuilder<GameRoomBaseInfo, com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder, GameRoomBaseInfoOrBuilder> getStGameRoomBaseInfoFieldBuilder();

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m1605build();

        public final native TexasPoker$SCPauseGameRsp m1606build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m1607buildPartial();

        public final native TexasPoker$SCPauseGameRsp m1608buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1609clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1610clear();

        public final native Builder m1611clear();

        public final native Builder clearEErrCode();

        public final native Builder clearStGameRoomBaseInfo();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1612clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1613clone();

        public final native Builder m1614clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1615getDefaultInstanceForType();

        public final native TexasPoker$SCPauseGameRsp m1616getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native GameRoomBaseInfo getStGameRoomBaseInfo();

        public final native com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder getStGameRoomBaseInfoBuilder();

        public final native GameRoomBaseInfoOrBuilder getStGameRoomBaseInfoOrBuilder();

        public final native boolean hasEErrCode();

        public final native boolean hasStGameRoomBaseInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1617mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1618mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1619mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1620mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1621mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCPauseGameRsp texasPoker$SCPauseGameRsp);

        public final native Builder mergeStGameRoomBaseInfo(GameRoomBaseInfo gameRoomBaseInfo);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setStGameRoomBaseInfo(com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder builder);

        public final native Builder setStGameRoomBaseInfo(GameRoomBaseInfo gameRoomBaseInfo);

        public static final Descriptor getDescriptor() {
            return TexasPoker.cP();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{20133, 20134, 20135, 20136, 20137, 20138, 20139, 20140, 20141, 20142, 20143, 20144, 20145, 20146, 20147, 20148, 20149, 20150, 20151, 20152, 20153, 20154, 20155, 20156, 20157, 20158, 20159, 20160, 20161});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCPauseGameRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCPauseGameRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCPauseGameRsp texasPoker$SCPauseGameRsp);

    private native TexasPoker$SCPauseGameRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCPauseGameRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCPauseGameRsp texasPoker$SCPauseGameRsp);

    private native TexasPoker$SCPauseGameRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m1598getDefaultInstanceForType();

    public final native TexasPoker$SCPauseGameRsp m1599getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native Parser<TexasPoker$SCPauseGameRsp> getParserForType();

    public final native int getSerializedSize();

    public final native GameRoomBaseInfo getStGameRoomBaseInfo();

    public final native GameRoomBaseInfoOrBuilder getStGameRoomBaseInfoOrBuilder();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    public final native boolean hasStGameRoomBaseInfo();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1600newBuilderForType();

    public final native Builder m1601newBuilderForType();

    protected final native Builder m1602newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1603toBuilder();

    public final native Builder m1604toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCPauseGameRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.cP();
    }

    static void __clinit__() {
        PARSER = new C00261();
        TexasPoker$SCPauseGameRsp texasPoker$SCPauseGameRsp = new TexasPoker$SCPauseGameRsp(true);
        defaultInstance = texasPoker$SCPauseGameRsp;
        texasPoker$SCPauseGameRsp.initFields();
    }

    public static TexasPoker$SCPauseGameRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCPauseGameRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCPauseGameRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCPauseGameRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCPauseGameRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCPauseGameRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCPauseGameRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCPauseGameRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCPauseGameRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCPauseGameRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCPauseGameRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCPauseGameRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCPauseGameRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCPauseGameRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCPauseGameRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCPauseGameRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCPauseGameRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCPauseGameRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCPauseGameRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCPauseGameRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCPauseGameRsp texasPoker$SCPauseGameRsp) {
        return newBuilder().mergeFrom(texasPoker$SCPauseGameRsp);
    }
}
