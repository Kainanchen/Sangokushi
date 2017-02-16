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

public final class TexasPoker$SCUseItemRsp extends GeneratedMessage implements TexasPoker$SCUseItemRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static final int LCOIN_FIELD_NUMBER = 6;
    public static final int LITEMID_FIELD_NUMBER = 2;
    public static final int LMSGID_FIELD_NUMBER = 7;
    public static final int LPOPULARITY_FIELD_NUMBER = 5;
    public static final int LROOMID_FIELD_NUMBER = 4;
    public static Parser<TexasPoker$SCUseItemRsp> PARSER = null;
    public static final int SEXTRA_FIELD_NUMBER = 8;
    public static final int TOUUID_FIELD_NUMBER = 3;
    private static final TexasPoker$SCUseItemRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private long lCoin_;
    private int lItemID_;
    private long lMsgID_;
    private long lPopularity_;
    private long lRoomID_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private Object sExtra_;
    private long touuid_;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCUseItemRsp.1 */
    class C00681 extends AbstractParser<TexasPoker$SCUseItemRsp> {
        static {
            fixHelper.fixfunc(new int[]{7968, 7969});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00681();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCUseItemRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCUseItemRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lCoin_;
        private int lItemID_;
        private long lMsgID_;
        private long lPopularity_;
        private long lRoomID_;
        private Object sExtra_;
        private long touuid_;

        static {
            fixHelper.fixfunc(new int[]{8778, 8779, 8780, 8781, 8782, 8783, 8784, 8785, 8786, 8787, 8788, 8789, 8790, 8791, 8792, 8793, 8794, 8795, 8796, 8797, 8798, 8799, 8800, 8801, 8802, 8803, 8804, 8805, 8806, 8807, 8808, 8809, 8810, 8811, 8812, 8813, 8814, 8815, 8816, 8817, 8818, 8819, 8820, 8821, 8822, 8823, 8824, 8825, 8826, 8827, 8828, 8829, 8830, 8831, 8832, 8833, 8834, 8835, 8836, 8837, 8838, 8839, 8840, 8841, 8842, 8843});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m2661build();

        public final native TexasPoker$SCUseItemRsp m2662build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m2663buildPartial();

        public final native TexasPoker$SCUseItemRsp m2664buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2665clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2666clear();

        public final native Builder m2667clear();

        public final native Builder clearEErrCode();

        public final native Builder clearLCoin();

        public final native Builder clearLItemID();

        public final native Builder clearLMsgID();

        public final native Builder clearLPopularity();

        public final native Builder clearLRoomID();

        public final native Builder clearSExtra();

        public final native Builder clearTouuid();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2668clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2669clone();

        public final native Builder m2670clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2671getDefaultInstanceForType();

        public final native TexasPoker$SCUseItemRsp m2672getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLCoin();

        public final native int getLItemID();

        public final native long getLMsgID();

        public final native long getLPopularity();

        public final native long getLRoomID();

        public final native String getSExtra();

        public final native ByteString getSExtraBytes();

        public final native long getTouuid();

        public final native boolean hasEErrCode();

        public final native boolean hasLCoin();

        public final native boolean hasLItemID();

        public final native boolean hasLMsgID();

        public final native boolean hasLPopularity();

        public final native boolean hasLRoomID();

        public final native boolean hasSExtra();

        public final native boolean hasTouuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2673mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2674mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2675mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2676mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2677mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCUseItemRsp texasPoker$SCUseItemRsp);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setLCoin(long j);

        public final native Builder setLItemID(int i);

        public final native Builder setLMsgID(long j);

        public final native Builder setLPopularity(long j);

        public final native Builder setLRoomID(long j);

        public final native Builder setSExtra(String str);

        public final native Builder setSExtraBytes(ByteString byteString);

        public final native Builder setTouuid(long j);

        public static final Descriptor getDescriptor() {
            return TexasPoker.cZ();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{5571, 5572, 5573, 5574, 5575, 5576, 5577, 5578, 5579, 5580, 5581, 5582, 5583, 5584, 5585, 5586, 5587, 5588, 5589, 5590, 5591, 5592, 5593, 5594, 5595, 5596, 5597, 5598, 5599, 5600, 5601, 5602, 5603, 5604, 5605, 5606, 5607, 5608, 5609, 5610, 5611});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCUseItemRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCUseItemRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCUseItemRsp texasPoker$SCUseItemRsp);

    private native TexasPoker$SCUseItemRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCUseItemRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCUseItemRsp texasPoker$SCUseItemRsp);

    private native TexasPoker$SCUseItemRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m2654getDefaultInstanceForType();

    public final native TexasPoker$SCUseItemRsp m2655getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native long getLCoin();

    public final native int getLItemID();

    public final native long getLMsgID();

    public final native long getLPopularity();

    public final native long getLRoomID();

    public final native Parser<TexasPoker$SCUseItemRsp> getParserForType();

    public final native String getSExtra();

    public final native ByteString getSExtraBytes();

    public final native int getSerializedSize();

    public final native long getTouuid();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    public final native boolean hasLCoin();

    public final native boolean hasLItemID();

    public final native boolean hasLMsgID();

    public final native boolean hasLPopularity();

    public final native boolean hasLRoomID();

    public final native boolean hasSExtra();

    public final native boolean hasTouuid();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2656newBuilderForType();

    public final native Builder m2657newBuilderForType();

    protected final native Builder m2658newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2659toBuilder();

    public final native Builder m2660toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCUseItemRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.cZ();
    }

    static void __clinit__() {
        PARSER = new C00681();
        TexasPoker$SCUseItemRsp texasPoker$SCUseItemRsp = new TexasPoker$SCUseItemRsp(true);
        defaultInstance = texasPoker$SCUseItemRsp;
        texasPoker$SCUseItemRsp.initFields();
    }

    public static TexasPoker$SCUseItemRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCUseItemRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCUseItemRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUseItemRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCUseItemRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCUseItemRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCUseItemRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUseItemRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCUseItemRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCUseItemRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCUseItemRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUseItemRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCUseItemRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCUseItemRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCUseItemRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUseItemRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCUseItemRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCUseItemRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCUseItemRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUseItemRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCUseItemRsp texasPoker$SCUseItemRsp) {
        return newBuilder().mergeFrom(texasPoker$SCUseItemRsp);
    }
}
