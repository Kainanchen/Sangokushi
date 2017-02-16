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
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import java.io.InputStream;

public final class TexasPoker$SCUseDelayItemRsp extends GeneratedMessage implements TexasPoker$SCUseDelayItemRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static final int LBETTINGID_FIELD_NUMBER = 3;
    public static Parser<TexasPoker$SCUseDelayItemRsp> PARSER = null;
    public static final int STUSERGAMEINFONET_FIELD_NUMBER = 2;
    private static final TexasPoker$SCUseDelayItemRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private long lBettingID_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private TexasPoker$UserGameInfoNet stUserGameInfoNet_;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCUseDelayItemRsp.1 */
    class C00661 extends AbstractParser<TexasPoker$SCUseDelayItemRsp> {
        static {
            fixHelper.fixfunc(new int[]{17351, 17352});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00661();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCUseDelayItemRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCUseDelayItemRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lBettingID_;
        private SingleFieldBuilder<TexasPoker$UserGameInfoNet, com.texaspoker.moment.TexasPoker$UserGameInfoNet.Builder, TexasPoker$UserGameInfoNetOrBuilder> stUserGameInfoNetBuilder_;
        private TexasPoker$UserGameInfoNet stUserGameInfoNet_;

        static {
            fixHelper.fixfunc(new int[]{29167, 29168, 29169, 29170, 29171, 29172, 29173, 29174, 29175, 29176, 29177, 29178, 29179, 29180, 29181, 29182, 29183, 29184, 29185, 29186, 29187, 29188, 29189, 29190, 29191, 29192, 29193, 29194, 29195, 29196, 29197, 29198, 29199, 29200, 29201, 29202, 29203, 29204, 29205, 29206, 29207, 29208, 29209, 29210, 29211, 29212, 29213, 29214, 29215});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native SingleFieldBuilder<TexasPoker$UserGameInfoNet, com.texaspoker.moment.TexasPoker$UserGameInfoNet.Builder, TexasPoker$UserGameInfoNetOrBuilder> getStUserGameInfoNetFieldBuilder();

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m2589build();

        public final native TexasPoker$SCUseDelayItemRsp m2590build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m2591buildPartial();

        public final native TexasPoker$SCUseDelayItemRsp m2592buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2593clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2594clear();

        public final native Builder m2595clear();

        public final native Builder clearEErrCode();

        public final native Builder clearLBettingID();

        public final native Builder clearStUserGameInfoNet();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2596clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2597clone();

        public final native Builder m2598clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2599getDefaultInstanceForType();

        public final native TexasPoker$SCUseDelayItemRsp m2600getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLBettingID();

        public final native TexasPoker$UserGameInfoNet getStUserGameInfoNet();

        public final native com.texaspoker.moment.TexasPoker$UserGameInfoNet.Builder getStUserGameInfoNetBuilder();

        public final native TexasPoker$UserGameInfoNetOrBuilder getStUserGameInfoNetOrBuilder();

        public final native boolean hasEErrCode();

        public final native boolean hasLBettingID();

        public final native boolean hasStUserGameInfoNet();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2601mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2602mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2603mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2604mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2605mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCUseDelayItemRsp texasPoker$SCUseDelayItemRsp);

        public final native Builder mergeStUserGameInfoNet(TexasPoker$UserGameInfoNet texasPoker$UserGameInfoNet);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setLBettingID(long j);

        public final native Builder setStUserGameInfoNet(com.texaspoker.moment.TexasPoker$UserGameInfoNet.Builder builder);

        public final native Builder setStUserGameInfoNet(TexasPoker$UserGameInfoNet texasPoker$UserGameInfoNet);

        public static final Descriptor getDescriptor() {
            return TexasPoker.eF();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{23126, 23127, 23128, 23129, 23130, 23131, 23132, 23133, 23134, 23135, 23136, 23137, 23138, 23139, 23140, 23141, 23142, 23143, 23144, 23145, 23146, 23147, 23148, 23149, 23150, 23151, 23152, 23153, 23154, 23155, 23156});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCUseDelayItemRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCUseDelayItemRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCUseDelayItemRsp texasPoker$SCUseDelayItemRsp);

    private native TexasPoker$SCUseDelayItemRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCUseDelayItemRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCUseDelayItemRsp texasPoker$SCUseDelayItemRsp);

    private native TexasPoker$SCUseDelayItemRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m2582getDefaultInstanceForType();

    public final native TexasPoker$SCUseDelayItemRsp m2583getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native long getLBettingID();

    public final native Parser<TexasPoker$SCUseDelayItemRsp> getParserForType();

    public final native int getSerializedSize();

    public final native TexasPoker$UserGameInfoNet getStUserGameInfoNet();

    public final native TexasPoker$UserGameInfoNetOrBuilder getStUserGameInfoNetOrBuilder();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    public final native boolean hasLBettingID();

    public final native boolean hasStUserGameInfoNet();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2584newBuilderForType();

    public final native Builder m2585newBuilderForType();

    protected final native Builder m2586newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2587toBuilder();

    public final native Builder m2588toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCUseDelayItemRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.eF();
    }

    static void __clinit__() {
        PARSER = new C00661();
        TexasPoker$SCUseDelayItemRsp texasPoker$SCUseDelayItemRsp = new TexasPoker$SCUseDelayItemRsp(true);
        defaultInstance = texasPoker$SCUseDelayItemRsp;
        texasPoker$SCUseDelayItemRsp.initFields();
    }

    public static TexasPoker$SCUseDelayItemRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCUseDelayItemRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCUseDelayItemRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUseDelayItemRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCUseDelayItemRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCUseDelayItemRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCUseDelayItemRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUseDelayItemRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCUseDelayItemRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCUseDelayItemRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCUseDelayItemRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUseDelayItemRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCUseDelayItemRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCUseDelayItemRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCUseDelayItemRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUseDelayItemRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCUseDelayItemRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCUseDelayItemRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCUseDelayItemRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUseDelayItemRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCUseDelayItemRsp texasPoker$SCUseDelayItemRsp) {
        return newBuilder().mergeFrom(texasPoker$SCUseDelayItemRsp);
    }
}
