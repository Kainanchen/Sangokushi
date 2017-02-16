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

public final class TexasPoker$SCResetBuyinRatioRsp extends GeneratedMessage implements TexasPoker$SCResetBuyinRatioRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static Parser<TexasPoker$SCResetBuyinRatioRsp> PARSER = null;
    public static final int STGAMEROOMBASEINFO_FIELD_NUMBER = 2;
    private static final TexasPoker$SCResetBuyinRatioRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private GameRoomBaseInfo stGameRoomBaseInfo_;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCResetBuyinRatioRsp.1 */
    class C00361 extends AbstractParser<TexasPoker$SCResetBuyinRatioRsp> {
        static {
            fixHelper.fixfunc(new int[]{23380, 23381});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00361();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCResetBuyinRatioRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCResetBuyinRatioRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private SingleFieldBuilder<GameRoomBaseInfo, com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder, GameRoomBaseInfoOrBuilder> stGameRoomBaseInfoBuilder_;
        private GameRoomBaseInfo stGameRoomBaseInfo_;

        static {
            fixHelper.fixfunc(new int[]{32384, 32385, 32386, 32387, 32388, 32389, 32390, 32391, 32392, 32393, 32394, 32395, 32396, 32397, 32398, 32399, 32400, 32401, 32402, 32403, 32404, 32405, 32406, 32407, 32408, 32409, 32410, 32411, 32412, 32413, 32414, 32415, 32416, 32417, 32418, 32419, 32420, 32421, 32422, 32423, 32424, 32425, 32426, 32427, 32428});
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

        public final native /* bridge */ /* synthetic */ MessageLite m1845build();

        public final native TexasPoker$SCResetBuyinRatioRsp m1846build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m1847buildPartial();

        public final native TexasPoker$SCResetBuyinRatioRsp m1848buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1849clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1850clear();

        public final native Builder m1851clear();

        public final native Builder clearEErrCode();

        public final native Builder clearStGameRoomBaseInfo();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1852clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1853clone();

        public final native Builder m1854clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1855getDefaultInstanceForType();

        public final native TexasPoker$SCResetBuyinRatioRsp m1856getDefaultInstanceForType();

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

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1857mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1858mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1859mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1860mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1861mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCResetBuyinRatioRsp texasPoker$SCResetBuyinRatioRsp);

        public final native Builder mergeStGameRoomBaseInfo(GameRoomBaseInfo gameRoomBaseInfo);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setStGameRoomBaseInfo(com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder builder);

        public final native Builder setStGameRoomBaseInfo(GameRoomBaseInfo gameRoomBaseInfo);

        public static final Descriptor getDescriptor() {
            return TexasPoker.eB();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{29790, 29791, 29792, 29793, 29794, 29795, 29796, 29797, 29798, 29799, 29800, 29801, 29802, 29803, 29804, 29805, 29806, 29807, 29808, 29809, 29810, 29811, 29812, 29813, 29814, 29815, 29816, 29817, 29818});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCResetBuyinRatioRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCResetBuyinRatioRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCResetBuyinRatioRsp texasPoker$SCResetBuyinRatioRsp);

    private native TexasPoker$SCResetBuyinRatioRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCResetBuyinRatioRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCResetBuyinRatioRsp texasPoker$SCResetBuyinRatioRsp);

    private native TexasPoker$SCResetBuyinRatioRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m1838getDefaultInstanceForType();

    public final native TexasPoker$SCResetBuyinRatioRsp m1839getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native Parser<TexasPoker$SCResetBuyinRatioRsp> getParserForType();

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

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1840newBuilderForType();

    public final native Builder m1841newBuilderForType();

    protected final native Builder m1842newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1843toBuilder();

    public final native Builder m1844toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCResetBuyinRatioRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.eB();
    }

    static void __clinit__() {
        PARSER = new C00361();
        TexasPoker$SCResetBuyinRatioRsp texasPoker$SCResetBuyinRatioRsp = new TexasPoker$SCResetBuyinRatioRsp(true);
        defaultInstance = texasPoker$SCResetBuyinRatioRsp;
        texasPoker$SCResetBuyinRatioRsp.initFields();
    }

    public static TexasPoker$SCResetBuyinRatioRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCResetBuyinRatioRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCResetBuyinRatioRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCResetBuyinRatioRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCResetBuyinRatioRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCResetBuyinRatioRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCResetBuyinRatioRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCResetBuyinRatioRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCResetBuyinRatioRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCResetBuyinRatioRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCResetBuyinRatioRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCResetBuyinRatioRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCResetBuyinRatioRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCResetBuyinRatioRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCResetBuyinRatioRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCResetBuyinRatioRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCResetBuyinRatioRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCResetBuyinRatioRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCResetBuyinRatioRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCResetBuyinRatioRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCResetBuyinRatioRsp texasPoker$SCResetBuyinRatioRsp) {
        return newBuilder().mergeFrom(texasPoker$SCResetBuyinRatioRsp);
    }
}
