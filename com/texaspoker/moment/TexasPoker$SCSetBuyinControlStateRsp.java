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

public final class TexasPoker$SCSetBuyinControlStateRsp extends GeneratedMessage implements TexasPoker$SCSetBuyinControlStateRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static Parser<TexasPoker$SCSetBuyinControlStateRsp> PARSER = null;
    public static final int STGAMEROOMBASEINFO_FIELD_NUMBER = 2;
    private static final TexasPoker$SCSetBuyinControlStateRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private GameRoomBaseInfo stGameRoomBaseInfo_;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCSetBuyinControlStateRsp.1 */
    class C00421 extends AbstractParser<TexasPoker$SCSetBuyinControlStateRsp> {
        static {
            fixHelper.fixfunc(new int[]{8030, 8031});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00421();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCSetBuyinControlStateRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCSetBuyinControlStateRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private SingleFieldBuilder<GameRoomBaseInfo, com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder, GameRoomBaseInfoOrBuilder> stGameRoomBaseInfoBuilder_;
        private GameRoomBaseInfo stGameRoomBaseInfo_;

        static {
            fixHelper.fixfunc(new int[]{33958, 33959, 33960, 33961, 33962, 33963, 33964, 33965, 33966, 33967, 33968, 33969, 33970, 33971, 33972, 33973, 33974, 33975, 33976, 33977, 33978, 33979, 33980, 33981, 33982, 33983, 33984, 33985, 33986, 33987, 33988, 33989, 33990, 33991, 33992, 33993, 33994, 33995, 33996, 33997, 33998, 33999, 34000, 34001, 34002});
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

        public final native /* bridge */ /* synthetic */ MessageLite m1965build();

        public final native TexasPoker$SCSetBuyinControlStateRsp m1966build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m1967buildPartial();

        public final native TexasPoker$SCSetBuyinControlStateRsp m1968buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1969clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1970clear();

        public final native Builder m1971clear();

        public final native Builder clearEErrCode();

        public final native Builder clearStGameRoomBaseInfo();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1972clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1973clone();

        public final native Builder m1974clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1975getDefaultInstanceForType();

        public final native TexasPoker$SCSetBuyinControlStateRsp m1976getDefaultInstanceForType();

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

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1977mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1978mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1979mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1980mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1981mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCSetBuyinControlStateRsp texasPoker$SCSetBuyinControlStateRsp);

        public final native Builder mergeStGameRoomBaseInfo(GameRoomBaseInfo gameRoomBaseInfo);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setStGameRoomBaseInfo(com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder builder);

        public final native Builder setStGameRoomBaseInfo(GameRoomBaseInfo gameRoomBaseInfo);

        public static final Descriptor getDescriptor() {
            return TexasPoker.cL();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{7560, 7561, 7562, 7563, 7564, 7565, 7566, 7567, 7568, 7569, 7570, 7571, 7572, 7573, 7574, 7575, 7576, 7577, 7578, 7579, 7580, 7581, 7582, 7583, 7584, 7585, 7586, 7587, 7588});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCSetBuyinControlStateRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCSetBuyinControlStateRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCSetBuyinControlStateRsp texasPoker$SCSetBuyinControlStateRsp);

    private native TexasPoker$SCSetBuyinControlStateRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCSetBuyinControlStateRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCSetBuyinControlStateRsp texasPoker$SCSetBuyinControlStateRsp);

    private native TexasPoker$SCSetBuyinControlStateRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m1958getDefaultInstanceForType();

    public final native TexasPoker$SCSetBuyinControlStateRsp m1959getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native Parser<TexasPoker$SCSetBuyinControlStateRsp> getParserForType();

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

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1960newBuilderForType();

    public final native Builder m1961newBuilderForType();

    protected final native Builder m1962newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1963toBuilder();

    public final native Builder m1964toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCSetBuyinControlStateRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.cL();
    }

    static void __clinit__() {
        PARSER = new C00421();
        TexasPoker$SCSetBuyinControlStateRsp texasPoker$SCSetBuyinControlStateRsp = new TexasPoker$SCSetBuyinControlStateRsp(true);
        defaultInstance = texasPoker$SCSetBuyinControlStateRsp;
        texasPoker$SCSetBuyinControlStateRsp.initFields();
    }

    public static TexasPoker$SCSetBuyinControlStateRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCSetBuyinControlStateRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCSetBuyinControlStateRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSetBuyinControlStateRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCSetBuyinControlStateRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCSetBuyinControlStateRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCSetBuyinControlStateRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSetBuyinControlStateRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCSetBuyinControlStateRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCSetBuyinControlStateRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCSetBuyinControlStateRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSetBuyinControlStateRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCSetBuyinControlStateRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCSetBuyinControlStateRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCSetBuyinControlStateRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSetBuyinControlStateRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCSetBuyinControlStateRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCSetBuyinControlStateRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCSetBuyinControlStateRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSetBuyinControlStateRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCSetBuyinControlStateRsp texasPoker$SCSetBuyinControlStateRsp) {
        return newBuilder().mergeFrom(texasPoker$SCSetBuyinControlStateRsp);
    }
}
