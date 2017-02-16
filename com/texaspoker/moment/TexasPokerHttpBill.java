package com.texaspoker.moment;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessage.BuilderParent;
import com.google.protobuf.GeneratedMessage.FieldAccessorTable;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilder;
import com.google.protobuf.SingleFieldBuilder;
import com.google.protobuf.UnknownFieldSet;
import com.texaspoker.moment.TexasPokerCommon.CREATE_ROOM_TYPE;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import com.texaspoker.moment.TexasPokerCommon.GAME_ROOM_TYPE;
import com.texaspoker.moment.TexasPokerCommon.SNG_ROOM_TYPE;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNetOrBuilder;
import com.texaspoker.moment.TexasPokerMiniGame.PATTERNS_TYPE;
import java.io.InputStream;
import java.util.List;

public final class TexasPokerHttpBill {
    private static final Descriptor f93A;
    private static FieldAccessorTable f94B;
    private static FileDescriptor f95C;
    private static final Descriptor f96a;
    private static FieldAccessorTable f97b;
    private static final Descriptor f98c;
    private static FieldAccessorTable f99d;
    private static final Descriptor f100e;
    private static FieldAccessorTable f101f;
    private static final Descriptor f102g;
    private static FieldAccessorTable f103h;
    private static final Descriptor f104i;
    private static FieldAccessorTable f105j;
    private static final Descriptor f106k;
    private static FieldAccessorTable f107l;
    private static final Descriptor f108m;
    private static FieldAccessorTable f109n;
    private static final Descriptor f110o;
    private static FieldAccessorTable f111p;
    private static final Descriptor f112q;
    private static FieldAccessorTable f113r;
    private static final Descriptor f114s;
    private static FieldAccessorTable f115t;
    private static final Descriptor f116u;
    private static FieldAccessorTable f117v;
    private static final Descriptor f118w;
    private static FieldAccessorTable f119x;
    private static final Descriptor f120y;
    private static FieldAccessorTable f121z;

    /* renamed from: com.texaspoker.moment.TexasPokerHttpBill.1 */
    class C01631 implements InternalDescriptorAssigner {
        static {
            fixHelper.fixfunc(new int[]{15139, 15140});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C01631();

        public final native ExtensionRegistry assignDescriptors(FileDescriptor fileDescriptor);
    }

    public interface BillInfoNetOrBuilder extends MessageOrBuilder {
        int getBClubManager();

        GAME_ROOM_TYPE getEGameRoomType();

        String getSFromClubCreatorName();

        ByteString getSFromClubCreatorNameBytes();

        String getSFromClubName();

        ByteString getSFromClubNameBytes();

        String getSFromClubUrl();

        ByteString getSFromClubUrlBytes();

        NormalBillInfoNet getStNormalBillInfoNet();

        NormalBillInfoNetOrBuilder getStNormalBillInfoNetOrBuilder();

        SNGBillInfoNet getStSNGBillInfoNet();

        SNGBillInfoNetOrBuilder getStSNGBillInfoNetOrBuilder();

        boolean hasBClubManager();

        boolean hasEGameRoomType();

        boolean hasSFromClubCreatorName();

        boolean hasSFromClubName();

        boolean hasSFromClubUrl();

        boolean hasStNormalBillInfoNet();

        boolean hasStSNGBillInfoNet();
    }

    public static final class BillInfoNet extends GeneratedMessage implements BillInfoNetOrBuilder {
        public static final int BCLUBMANAGER_FIELD_NUMBER = 4;
        public static final int EGAMEROOMTYPE_FIELD_NUMBER = 1;
        public static Parser<BillInfoNet> PARSER = null;
        public static final int SFROMCLUBCREATORNAME_FIELD_NUMBER = 7;
        public static final int SFROMCLUBNAME_FIELD_NUMBER = 5;
        public static final int SFROMCLUBURL_FIELD_NUMBER = 6;
        public static final int STNORMALBILLINFONET_FIELD_NUMBER = 2;
        public static final int STSNGBILLINFONET_FIELD_NUMBER = 3;
        private static final BillInfoNet defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bClubManager_;
        private int bitField0_;
        private GAME_ROOM_TYPE eGameRoomType_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sFromClubCreatorName_;
        private Object sFromClubName_;
        private Object sFromClubUrl_;
        private NormalBillInfoNet stNormalBillInfoNet_;
        private SNGBillInfoNet stSNGBillInfoNet_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpBill.BillInfoNet.1 */
        class C01641 extends AbstractParser<BillInfoNet> {
            static {
                fixHelper.fixfunc(new int[]{12915, 12916});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01641();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements BillInfoNetOrBuilder {
            private int bClubManager_;
            private int bitField0_;
            private GAME_ROOM_TYPE eGameRoomType_;
            private Object sFromClubCreatorName_;
            private Object sFromClubName_;
            private Object sFromClubUrl_;
            private SingleFieldBuilder<NormalBillInfoNet, Builder, NormalBillInfoNetOrBuilder> stNormalBillInfoNetBuilder_;
            private NormalBillInfoNet stNormalBillInfoNet_;
            private SingleFieldBuilder<SNGBillInfoNet, Builder, SNGBillInfoNetOrBuilder> stSNGBillInfoNetBuilder_;
            private SNGBillInfoNet stSNGBillInfoNet_;

            static {
                fixHelper.fixfunc(new int[]{6433, 6434, 6435, 6436, 6437, 6438, 6439, 6440, 6441, 6442, 6443, 6444, 6445, 6446, 6447, 6448, 6449, 6450, 6451, 6452, 6453, 6454, 6455, 6456, 6457, 6458, 6459, 6460, 6461, 6462, 6463, 6464, 6465, 6466, 6467, 6468, 6469, 6470, 6471, 6472, 6473, 6474, 6475, 6476, 6477, 6478, 6479, 6480, 6481, 6482, 6483, 6484, 6485, 6486, 6487, 6488, 6489, 6490, 6491, 6492, 6493, 6494, 6495, 6496, 6497, 6498, 6499, 6500, 6501, 6502, 6503, 6504, 6505, 6506, 6507, 6508});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<NormalBillInfoNet, Builder, NormalBillInfoNetOrBuilder> getStNormalBillInfoNetFieldBuilder();

            private native SingleFieldBuilder<SNGBillInfoNet, Builder, SNGBillInfoNetOrBuilder> getStSNGBillInfoNetFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m2877build();

            public final native BillInfoNet m2878build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m2879buildPartial();

            public final native BillInfoNet m2880buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2881clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2882clear();

            public final native Builder m2883clear();

            public final native Builder clearBClubManager();

            public final native Builder clearEGameRoomType();

            public final native Builder clearSFromClubCreatorName();

            public final native Builder clearSFromClubName();

            public final native Builder clearSFromClubUrl();

            public final native Builder clearStNormalBillInfoNet();

            public final native Builder clearStSNGBillInfoNet();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2884clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2885clone();

            public final native Builder m2886clone();

            public final native int getBClubManager();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m2887getDefaultInstanceForType();

            public final native BillInfoNet m2888getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native GAME_ROOM_TYPE getEGameRoomType();

            public final native String getSFromClubCreatorName();

            public final native ByteString getSFromClubCreatorNameBytes();

            public final native String getSFromClubName();

            public final native ByteString getSFromClubNameBytes();

            public final native String getSFromClubUrl();

            public final native ByteString getSFromClubUrlBytes();

            public final native NormalBillInfoNet getStNormalBillInfoNet();

            public final native Builder getStNormalBillInfoNetBuilder();

            public final native NormalBillInfoNetOrBuilder getStNormalBillInfoNetOrBuilder();

            public final native SNGBillInfoNet getStSNGBillInfoNet();

            public final native Builder getStSNGBillInfoNetBuilder();

            public final native SNGBillInfoNetOrBuilder getStSNGBillInfoNetOrBuilder();

            public final native boolean hasBClubManager();

            public final native boolean hasEGameRoomType();

            public final native boolean hasSFromClubCreatorName();

            public final native boolean hasSFromClubName();

            public final native boolean hasSFromClubUrl();

            public final native boolean hasStNormalBillInfoNet();

            public final native boolean hasStSNGBillInfoNet();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2889mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2890mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2891mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m2892mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m2893mergeFrom(Message message);

            public final native Builder mergeFrom(BillInfoNet billInfoNet);

            public final native Builder mergeStNormalBillInfoNet(NormalBillInfoNet normalBillInfoNet);

            public final native Builder mergeStSNGBillInfoNet(SNGBillInfoNet sNGBillInfoNet);

            public final native Builder setBClubManager(int i);

            public final native Builder setEGameRoomType(GAME_ROOM_TYPE game_room_type);

            public final native Builder setSFromClubCreatorName(String str);

            public final native Builder setSFromClubCreatorNameBytes(ByteString byteString);

            public final native Builder setSFromClubName(String str);

            public final native Builder setSFromClubNameBytes(ByteString byteString);

            public final native Builder setSFromClubUrl(String str);

            public final native Builder setSFromClubUrlBytes(ByteString byteString);

            public final native Builder setStNormalBillInfoNet(Builder builder);

            public final native Builder setStNormalBillInfoNet(NormalBillInfoNet normalBillInfoNet);

            public final native Builder setStSNGBillInfoNet(Builder builder);

            public final native Builder setStSNGBillInfoNet(SNGBillInfoNet sNGBillInfoNet);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpBill.f106k;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{4491, 4492, 4493, 4494, 4495, 4496, 4497, 4498, 4499, 4500, 4501, 4502, 4503, 4504, 4505, 4506, 4507, 4508, 4509, 4510, 4511, 4512, 4513, 4514, 4515, 4516, 4517, 4518, 4519, 4520, 4521, 4522, 4523, 4524, 4525, 4526, 4527, 4528, 4529, 4530, 4531, 4532, 4533});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native BillInfoNet(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ BillInfoNet(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, BillInfoNet billInfoNet);

        private native BillInfoNet(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ BillInfoNet(com.google.protobuf.GeneratedMessage.Builder builder, BillInfoNet billInfoNet);

        private native BillInfoNet(boolean z);

        private native void initFields();

        public final native int getBClubManager();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2870getDefaultInstanceForType();

        public final native BillInfoNet m2871getDefaultInstanceForType();

        public final native GAME_ROOM_TYPE getEGameRoomType();

        public final native Parser<BillInfoNet> getParserForType();

        public final native String getSFromClubCreatorName();

        public final native ByteString getSFromClubCreatorNameBytes();

        public final native String getSFromClubName();

        public final native ByteString getSFromClubNameBytes();

        public final native String getSFromClubUrl();

        public final native ByteString getSFromClubUrlBytes();

        public final native int getSerializedSize();

        public final native NormalBillInfoNet getStNormalBillInfoNet();

        public final native NormalBillInfoNetOrBuilder getStNormalBillInfoNetOrBuilder();

        public final native SNGBillInfoNet getStSNGBillInfoNet();

        public final native SNGBillInfoNetOrBuilder getStSNGBillInfoNetOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasBClubManager();

        public final native boolean hasEGameRoomType();

        public final native boolean hasSFromClubCreatorName();

        public final native boolean hasSFromClubName();

        public final native boolean hasSFromClubUrl();

        public final native boolean hasStNormalBillInfoNet();

        public final native boolean hasStSNGBillInfoNet();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2872newBuilderForType();

        public final native Builder m2873newBuilderForType();

        protected final native Builder m2874newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2875toBuilder();

        public final native Builder m2876toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static BillInfoNet getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpBill.f106k;
        }

        static void __clinit__() {
            PARSER = new C01641();
            BillInfoNet billInfoNet = new BillInfoNet(true);
            defaultInstance = billInfoNet;
            billInfoNet.initFields();
        }

        public static BillInfoNet parseFrom(ByteString byteString) {
            return (BillInfoNet) PARSER.parseFrom(byteString);
        }

        public static BillInfoNet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (BillInfoNet) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static BillInfoNet parseFrom(byte[] bArr) {
            return (BillInfoNet) PARSER.parseFrom(bArr);
        }

        public static BillInfoNet parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (BillInfoNet) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static BillInfoNet parseFrom(InputStream inputStream) {
            return (BillInfoNet) PARSER.parseFrom(inputStream);
        }

        public static BillInfoNet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BillInfoNet) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static BillInfoNet parseDelimitedFrom(InputStream inputStream) {
            return (BillInfoNet) PARSER.parseDelimitedFrom(inputStream);
        }

        public static BillInfoNet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BillInfoNet) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static BillInfoNet parseFrom(CodedInputStream codedInputStream) {
            return (BillInfoNet) PARSER.parseFrom(codedInputStream);
        }

        public static BillInfoNet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BillInfoNet) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(BillInfoNet billInfoNet) {
            return newBuilder().mergeFrom(billInfoNet);
        }
    }

    public interface CSGetBillInfoByRoomIDOrBuilder extends MessageOrBuilder {
        long getLRoomID();

        long getUuid();

        boolean hasLRoomID();

        boolean hasUuid();
    }

    public static final class CSGetBillInfoByRoomID extends GeneratedMessage implements CSGetBillInfoByRoomIDOrBuilder {
        public static final int LROOMID_FIELD_NUMBER = 2;
        public static Parser<CSGetBillInfoByRoomID> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetBillInfoByRoomID defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lRoomID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpBill.CSGetBillInfoByRoomID.1 */
        class C01651 extends AbstractParser<CSGetBillInfoByRoomID> {
            static {
                fixHelper.fixfunc(new int[]{16329, 16330});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01651();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetBillInfoByRoomIDOrBuilder {
            private int bitField0_;
            private long lRoomID_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{33062, 33063, 33064, 33065, 33066, 33067, 33068, 33069, 33070, 33071, 33072, 33073, 33074, 33075, 33076, 33077, 33078, 33079, 33080, 33081, 33082, 33083, 33084, 33085, 33086, 33087, 33088, 33089, 33090, 33091, 33092, 33093, 33094, 33095, 33096, 33097, 33098, 33099, 33100, 33101});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m2901build();

            public final native CSGetBillInfoByRoomID m2902build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m2903buildPartial();

            public final native CSGetBillInfoByRoomID m2904buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2905clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2906clear();

            public final native Builder m2907clear();

            public final native Builder clearLRoomID();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2908clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2909clone();

            public final native Builder m2910clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m2911getDefaultInstanceForType();

            public final native CSGetBillInfoByRoomID m2912getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLRoomID();

            public final native long getUuid();

            public final native boolean hasLRoomID();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2913mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2914mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2915mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m2916mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m2917mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetBillInfoByRoomID cSGetBillInfoByRoomID);

            public final native Builder setLRoomID(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpBill.f108m;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{28342, 28343, 28344, 28345, 28346, 28347, 28348, 28349, 28350, 28351, 28352, 28353, 28354, 28355, 28356, 28357, 28358, 28359, 28360, 28361, 28362, 28363, 28364, 28365, 28366, 28367, 28368, 28369});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetBillInfoByRoomID(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetBillInfoByRoomID(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetBillInfoByRoomID cSGetBillInfoByRoomID);

        private native CSGetBillInfoByRoomID(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetBillInfoByRoomID(com.google.protobuf.GeneratedMessage.Builder builder, CSGetBillInfoByRoomID cSGetBillInfoByRoomID);

        private native CSGetBillInfoByRoomID(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2894getDefaultInstanceForType();

        public final native CSGetBillInfoByRoomID m2895getDefaultInstanceForType();

        public final native long getLRoomID();

        public final native Parser<CSGetBillInfoByRoomID> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasLRoomID();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2896newBuilderForType();

        public final native Builder m2897newBuilderForType();

        protected final native Builder m2898newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2899toBuilder();

        public final native Builder m2900toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetBillInfoByRoomID getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpBill.f108m;
        }

        static void __clinit__() {
            PARSER = new C01651();
            CSGetBillInfoByRoomID cSGetBillInfoByRoomID = new CSGetBillInfoByRoomID(true);
            defaultInstance = cSGetBillInfoByRoomID;
            cSGetBillInfoByRoomID.initFields();
        }

        public static CSGetBillInfoByRoomID parseFrom(ByteString byteString) {
            return (CSGetBillInfoByRoomID) PARSER.parseFrom(byteString);
        }

        public static CSGetBillInfoByRoomID parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetBillInfoByRoomID) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetBillInfoByRoomID parseFrom(byte[] bArr) {
            return (CSGetBillInfoByRoomID) PARSER.parseFrom(bArr);
        }

        public static CSGetBillInfoByRoomID parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetBillInfoByRoomID) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetBillInfoByRoomID parseFrom(InputStream inputStream) {
            return (CSGetBillInfoByRoomID) PARSER.parseFrom(inputStream);
        }

        public static CSGetBillInfoByRoomID parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetBillInfoByRoomID) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetBillInfoByRoomID parseDelimitedFrom(InputStream inputStream) {
            return (CSGetBillInfoByRoomID) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetBillInfoByRoomID parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetBillInfoByRoomID) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetBillInfoByRoomID parseFrom(CodedInputStream codedInputStream) {
            return (CSGetBillInfoByRoomID) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetBillInfoByRoomID parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetBillInfoByRoomID) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetBillInfoByRoomID cSGetBillInfoByRoomID) {
            return newBuilder().mergeFrom(cSGetBillInfoByRoomID);
        }
    }

    public interface CSGetBillInfosOrBuilder extends MessageOrBuilder {
        int getINum();

        long getLClubID();

        long getLNewestTime();

        long getUuid();

        boolean hasINum();

        boolean hasLClubID();

        boolean hasLNewestTime();

        boolean hasUuid();
    }

    public static final class CSGetBillInfos extends GeneratedMessage implements CSGetBillInfosOrBuilder {
        public static final int INUM_FIELD_NUMBER = 3;
        public static final int LCLUBID_FIELD_NUMBER = 4;
        public static final int LNEWESTTIME_FIELD_NUMBER = 2;
        public static Parser<CSGetBillInfos> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetBillInfos defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int iNum_;
        private long lClubID_;
        private long lNewestTime_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpBill.CSGetBillInfos.1 */
        class C01661 extends AbstractParser<CSGetBillInfos> {
            static {
                fixHelper.fixfunc(new int[]{20830, 20831});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01661();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetBillInfosOrBuilder {
            private int bitField0_;
            private int iNum_;
            private long lClubID_;
            private long lNewestTime_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{26384, 26385, 26386, 26387, 26388, 26389, 26390, 26391, 26392, 26393, 26394, 26395, 26396, 26397, 26398, 26399, 26400, 26401, 26402, 26403, 26404, 26405, 26406, 26407, 26408, 26409, 26410, 26411, 26412, 26413, 26414, 26415, 26416, 26417, 26418, 26419, 26420, 26421, 26422, 26423, 26424, 26425, 26426, 26427, 26428, 26429, 26430, 26431});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m2925build();

            public final native CSGetBillInfos m2926build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m2927buildPartial();

            public final native CSGetBillInfos m2928buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2929clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2930clear();

            public final native Builder m2931clear();

            public final native Builder clearINum();

            public final native Builder clearLClubID();

            public final native Builder clearLNewestTime();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2932clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2933clone();

            public final native Builder m2934clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m2935getDefaultInstanceForType();

            public final native CSGetBillInfos m2936getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getINum();

            public final native long getLClubID();

            public final native long getLNewestTime();

            public final native long getUuid();

            public final native boolean hasINum();

            public final native boolean hasLClubID();

            public final native boolean hasLNewestTime();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2937mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2938mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2939mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m2940mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m2941mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetBillInfos cSGetBillInfos);

            public final native Builder setINum(int i);

            public final native Builder setLClubID(long j);

            public final native Builder setLNewestTime(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpBill.f116u;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{12792, 12793, 12794, 12795, 12796, 12797, 12798, 12799, 12800, 12801, 12802, 12803, 12804, 12805, 12806, 12807, 12808, 12809, 12810, 12811, 12812, 12813, 12814, 12815, 12816, 12817, 12818, 12819, 12820, 12821, 12822, 12823});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetBillInfos(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetBillInfos(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetBillInfos cSGetBillInfos);

        private native CSGetBillInfos(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetBillInfos(com.google.protobuf.GeneratedMessage.Builder builder, CSGetBillInfos cSGetBillInfos);

        private native CSGetBillInfos(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2918getDefaultInstanceForType();

        public final native CSGetBillInfos m2919getDefaultInstanceForType();

        public final native int getINum();

        public final native long getLClubID();

        public final native long getLNewestTime();

        public final native Parser<CSGetBillInfos> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasINum();

        public final native boolean hasLClubID();

        public final native boolean hasLNewestTime();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2920newBuilderForType();

        public final native Builder m2921newBuilderForType();

        protected final native Builder m2922newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2923toBuilder();

        public final native Builder m2924toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetBillInfos getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpBill.f116u;
        }

        static void __clinit__() {
            PARSER = new C01661();
            CSGetBillInfos cSGetBillInfos = new CSGetBillInfos(true);
            defaultInstance = cSGetBillInfos;
            cSGetBillInfos.initFields();
        }

        public static CSGetBillInfos parseFrom(ByteString byteString) {
            return (CSGetBillInfos) PARSER.parseFrom(byteString);
        }

        public static CSGetBillInfos parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetBillInfos) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetBillInfos parseFrom(byte[] bArr) {
            return (CSGetBillInfos) PARSER.parseFrom(bArr);
        }

        public static CSGetBillInfos parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetBillInfos) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetBillInfos parseFrom(InputStream inputStream) {
            return (CSGetBillInfos) PARSER.parseFrom(inputStream);
        }

        public static CSGetBillInfos parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetBillInfos) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetBillInfos parseDelimitedFrom(InputStream inputStream) {
            return (CSGetBillInfos) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetBillInfos parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetBillInfos) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetBillInfos parseFrom(CodedInputStream codedInputStream) {
            return (CSGetBillInfos) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetBillInfos parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetBillInfos) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetBillInfos cSGetBillInfos) {
            return newBuilder().mergeFrom(cSGetBillInfos);
        }
    }

    public interface CSGetBillInfosV2OrBuilder extends MessageOrBuilder {
        int getINum();

        long getLClubID();

        long getLNewestTime();

        long getUuid();

        boolean hasINum();

        boolean hasLClubID();

        boolean hasLNewestTime();

        boolean hasUuid();
    }

    public static final class CSGetBillInfosV2 extends GeneratedMessage implements CSGetBillInfosV2OrBuilder {
        public static final int INUM_FIELD_NUMBER = 3;
        public static final int LCLUBID_FIELD_NUMBER = 4;
        public static final int LNEWESTTIME_FIELD_NUMBER = 2;
        public static Parser<CSGetBillInfosV2> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetBillInfosV2 defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int iNum_;
        private long lClubID_;
        private long lNewestTime_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpBill.CSGetBillInfosV2.1 */
        class C01671 extends AbstractParser<CSGetBillInfosV2> {
            static {
                fixHelper.fixfunc(new int[]{27304, 27305});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01671();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetBillInfosV2OrBuilder {
            private int bitField0_;
            private int iNum_;
            private long lClubID_;
            private long lNewestTime_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{6691, 6692, 6693, 6694, 6695, 6696, 6697, 6698, 6699, 6700, 6701, 6702, 6703, 6704, 6705, 6706, 6707, 6708, 6709, 6710, 6711, 6712, 6713, 6714, 6715, 6716, 6717, 6718, 6719, 6720, 6721, 6722, 6723, 6724, 6725, 6726, 6727, 6728, 6729, 6730, 6731, 6732, 6733, 6734, 6735, 6736, 6737, 6738});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m2949build();

            public final native CSGetBillInfosV2 m2950build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m2951buildPartial();

            public final native CSGetBillInfosV2 m2952buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2953clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2954clear();

            public final native Builder m2955clear();

            public final native Builder clearINum();

            public final native Builder clearLClubID();

            public final native Builder clearLNewestTime();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2956clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2957clone();

            public final native Builder m2958clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m2959getDefaultInstanceForType();

            public final native CSGetBillInfosV2 m2960getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getINum();

            public final native long getLClubID();

            public final native long getLNewestTime();

            public final native long getUuid();

            public final native boolean hasINum();

            public final native boolean hasLClubID();

            public final native boolean hasLNewestTime();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2961mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2962mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2963mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m2964mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m2965mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetBillInfosV2 cSGetBillInfosV2);

            public final native Builder setINum(int i);

            public final native Builder setLClubID(long j);

            public final native Builder setLNewestTime(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpBill.f120y;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{28310, 28311, 28312, 28313, 28314, 28315, 28316, 28317, 28318, 28319, 28320, 28321, 28322, 28323, 28324, 28325, 28326, 28327, 28328, 28329, 28330, 28331, 28332, 28333, 28334, 28335, 28336, 28337, 28338, 28339, 28340, 28341});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetBillInfosV2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetBillInfosV2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetBillInfosV2 cSGetBillInfosV2);

        private native CSGetBillInfosV2(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetBillInfosV2(com.google.protobuf.GeneratedMessage.Builder builder, CSGetBillInfosV2 cSGetBillInfosV2);

        private native CSGetBillInfosV2(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2942getDefaultInstanceForType();

        public final native CSGetBillInfosV2 m2943getDefaultInstanceForType();

        public final native int getINum();

        public final native long getLClubID();

        public final native long getLNewestTime();

        public final native Parser<CSGetBillInfosV2> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasINum();

        public final native boolean hasLClubID();

        public final native boolean hasLNewestTime();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2944newBuilderForType();

        public final native Builder m2945newBuilderForType();

        protected final native Builder m2946newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2947toBuilder();

        public final native Builder m2948toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetBillInfosV2 getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpBill.f120y;
        }

        static void __clinit__() {
            PARSER = new C01671();
            CSGetBillInfosV2 cSGetBillInfosV2 = new CSGetBillInfosV2(true);
            defaultInstance = cSGetBillInfosV2;
            cSGetBillInfosV2.initFields();
        }

        public static CSGetBillInfosV2 parseFrom(ByteString byteString) {
            return (CSGetBillInfosV2) PARSER.parseFrom(byteString);
        }

        public static CSGetBillInfosV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetBillInfosV2) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetBillInfosV2 parseFrom(byte[] bArr) {
            return (CSGetBillInfosV2) PARSER.parseFrom(bArr);
        }

        public static CSGetBillInfosV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetBillInfosV2) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetBillInfosV2 parseFrom(InputStream inputStream) {
            return (CSGetBillInfosV2) PARSER.parseFrom(inputStream);
        }

        public static CSGetBillInfosV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetBillInfosV2) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetBillInfosV2 parseDelimitedFrom(InputStream inputStream) {
            return (CSGetBillInfosV2) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetBillInfosV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetBillInfosV2) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetBillInfosV2 parseFrom(CodedInputStream codedInputStream) {
            return (CSGetBillInfosV2) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetBillInfosV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetBillInfosV2) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetBillInfosV2 cSGetBillInfosV2) {
            return newBuilder().mergeFrom(cSGetBillInfosV2);
        }
    }

    public interface CSRemoveBillOrBuilder extends MessageOrBuilder {
        long getLBillID();

        long getUuid();

        boolean hasLBillID();

        boolean hasUuid();
    }

    public static final class CSRemoveBill extends GeneratedMessage implements CSRemoveBillOrBuilder {
        public static final int LBILLID_FIELD_NUMBER = 1;
        public static Parser<CSRemoveBill> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 2;
        private static final CSRemoveBill defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lBillID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpBill.CSRemoveBill.1 */
        class C01681 extends AbstractParser<CSRemoveBill> {
            static {
                fixHelper.fixfunc(new int[]{16648, 16649});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01681();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSRemoveBillOrBuilder {
            private int bitField0_;
            private long lBillID_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{16527, 16528, 16529, 16530, 16531, 16532, 16533, 16534, 16535, 16536, 16537, 16538, 16539, 16540, 16541, 16542, 16543, 16544, 16545, 16546, 16547, 16548, 16549, 16550, 16551, 16552, 16553, 16554, 16555, 16556, 16557, 16558, 16559, 16560, 16561, 16562, 16563, 16564, 16565, 16566});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m2973build();

            public final native CSRemoveBill m2974build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m2975buildPartial();

            public final native CSRemoveBill m2976buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2977clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2978clear();

            public final native Builder m2979clear();

            public final native Builder clearLBillID();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2980clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2981clone();

            public final native Builder m2982clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m2983getDefaultInstanceForType();

            public final native CSRemoveBill m2984getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLBillID();

            public final native long getUuid();

            public final native boolean hasLBillID();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2985mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2986mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2987mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m2988mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m2989mergeFrom(Message message);

            public final native Builder mergeFrom(CSRemoveBill cSRemoveBill);

            public final native Builder setLBillID(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpBill.f112q;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{29762, 29763, 29764, 29765, 29766, 29767, 29768, 29769, 29770, 29771, 29772, 29773, 29774, 29775, 29776, 29777, 29778, 29779, 29780, 29781, 29782, 29783, 29784, 29785, 29786, 29787, 29788, 29789});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSRemoveBill(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSRemoveBill(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSRemoveBill cSRemoveBill);

        private native CSRemoveBill(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSRemoveBill(com.google.protobuf.GeneratedMessage.Builder builder, CSRemoveBill cSRemoveBill);

        private native CSRemoveBill(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2966getDefaultInstanceForType();

        public final native CSRemoveBill m2967getDefaultInstanceForType();

        public final native long getLBillID();

        public final native Parser<CSRemoveBill> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasLBillID();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2968newBuilderForType();

        public final native Builder m2969newBuilderForType();

        protected final native Builder m2970newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2971toBuilder();

        public final native Builder m2972toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSRemoveBill getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpBill.f112q;
        }

        static void __clinit__() {
            PARSER = new C01681();
            CSRemoveBill cSRemoveBill = new CSRemoveBill(true);
            defaultInstance = cSRemoveBill;
            cSRemoveBill.initFields();
        }

        public static CSRemoveBill parseFrom(ByteString byteString) {
            return (CSRemoveBill) PARSER.parseFrom(byteString);
        }

        public static CSRemoveBill parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSRemoveBill) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSRemoveBill parseFrom(byte[] bArr) {
            return (CSRemoveBill) PARSER.parseFrom(bArr);
        }

        public static CSRemoveBill parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSRemoveBill) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSRemoveBill parseFrom(InputStream inputStream) {
            return (CSRemoveBill) PARSER.parseFrom(inputStream);
        }

        public static CSRemoveBill parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSRemoveBill) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSRemoveBill parseDelimitedFrom(InputStream inputStream) {
            return (CSRemoveBill) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSRemoveBill parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSRemoveBill) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSRemoveBill parseFrom(CodedInputStream codedInputStream) {
            return (CSRemoveBill) PARSER.parseFrom(codedInputStream);
        }

        public static CSRemoveBill parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSRemoveBill) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSRemoveBill cSRemoveBill) {
            return newBuilder().mergeFrom(cSRemoveBill);
        }
    }

    public interface GameUserStatisticsInfoNetOrBuilder extends MessageOrBuilder {
        long getLCountJoinFlop();

        long getLCountJoinRiver();

        long getLCountJoinTurn();

        long getLCountShowdownFlopWin();

        long getLCountShowdownRiverWin();

        long getLCountShowdownShow();

        long getLCountShowdownTurnWin();

        long getLCountShowdownWinShow();

        long getLGameGain();

        long getLTotalHand();

        long getLTotalJoinHand();

        long getLTotalWin();

        boolean hasLCountJoinFlop();

        boolean hasLCountJoinRiver();

        boolean hasLCountJoinTurn();

        boolean hasLCountShowdownFlopWin();

        boolean hasLCountShowdownRiverWin();

        boolean hasLCountShowdownShow();

        boolean hasLCountShowdownTurnWin();

        boolean hasLCountShowdownWinShow();

        boolean hasLGameGain();

        boolean hasLTotalHand();

        boolean hasLTotalJoinHand();

        boolean hasLTotalWin();
    }

    public static final class GameUserStatisticsInfoNet extends GeneratedMessage implements GameUserStatisticsInfoNetOrBuilder {
        public static final int LCOUNTJOINFLOP_FIELD_NUMBER = 4;
        public static final int LCOUNTJOINRIVER_FIELD_NUMBER = 6;
        public static final int LCOUNTJOINTURN_FIELD_NUMBER = 5;
        public static final int LCOUNTSHOWDOWNFLOPWIN_FIELD_NUMBER = 7;
        public static final int LCOUNTSHOWDOWNRIVERWIN_FIELD_NUMBER = 9;
        public static final int LCOUNTSHOWDOWNSHOW_FIELD_NUMBER = 11;
        public static final int LCOUNTSHOWDOWNTURNWIN_FIELD_NUMBER = 8;
        public static final int LCOUNTSHOWDOWNWINSHOW_FIELD_NUMBER = 10;
        public static final int LGAMEGAIN_FIELD_NUMBER = 12;
        public static final int LTOTALHAND_FIELD_NUMBER = 1;
        public static final int LTOTALJOINHAND_FIELD_NUMBER = 2;
        public static final int LTOTALWIN_FIELD_NUMBER = 3;
        public static Parser<GameUserStatisticsInfoNet> PARSER;
        private static final GameUserStatisticsInfoNet defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lCountJoinFlop_;
        private long lCountJoinRiver_;
        private long lCountJoinTurn_;
        private long lCountShowdownFlopWin_;
        private long lCountShowdownRiverWin_;
        private long lCountShowdownShow_;
        private long lCountShowdownTurnWin_;
        private long lCountShowdownWinShow_;
        private long lGameGain_;
        private long lTotalHand_;
        private long lTotalJoinHand_;
        private long lTotalWin_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpBill.GameUserStatisticsInfoNet.1 */
        class C01691 extends AbstractParser<GameUserStatisticsInfoNet> {
            static {
                fixHelper.fixfunc(new int[]{24578, 24579});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01691();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements GameUserStatisticsInfoNetOrBuilder {
            private int bitField0_;
            private long lCountJoinFlop_;
            private long lCountJoinRiver_;
            private long lCountJoinTurn_;
            private long lCountShowdownFlopWin_;
            private long lCountShowdownRiverWin_;
            private long lCountShowdownShow_;
            private long lCountShowdownTurnWin_;
            private long lCountShowdownWinShow_;
            private long lGameGain_;
            private long lTotalHand_;
            private long lTotalJoinHand_;
            private long lTotalWin_;

            static {
                fixHelper.fixfunc(new int[]{8642, 8643, 8644, 8645, 8646, 8647, 8648, 8649, 8650, 8651, 8652, 8653, 8654, 8655, 8656, 8657, 8658, 8659, 8660, 8661, 8662, 8663, 8664, 8665, 8666, 8667, 8668, 8669, 8670, 8671, 8672, 8673, 8674, 8675, 8676, 8677, 8678, 8679, 8680, 8681, 8682, 8683, 8684, 8685, 8686, 8687, 8688, 8689, 8690, 8691, 8692, 8693, 8694, 8695, 8696, 8697, 8698, 8699, 8700, 8701, 8702, 8703, 8704, 8705, 8706, 8707, 8708, 8709, 8710, 8711, 8712, 8713, 8714, 8715, 8716, 8717, 8718, 8719, 8720, 8721});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m2997build();

            public final native GameUserStatisticsInfoNet m2998build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m2999buildPartial();

            public final native GameUserStatisticsInfoNet m3000buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3001clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3002clear();

            public final native Builder m3003clear();

            public final native Builder clearLCountJoinFlop();

            public final native Builder clearLCountJoinRiver();

            public final native Builder clearLCountJoinTurn();

            public final native Builder clearLCountShowdownFlopWin();

            public final native Builder clearLCountShowdownRiverWin();

            public final native Builder clearLCountShowdownShow();

            public final native Builder clearLCountShowdownTurnWin();

            public final native Builder clearLCountShowdownWinShow();

            public final native Builder clearLGameGain();

            public final native Builder clearLTotalHand();

            public final native Builder clearLTotalJoinHand();

            public final native Builder clearLTotalWin();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3004clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3005clone();

            public final native Builder m3006clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3007getDefaultInstanceForType();

            public final native GameUserStatisticsInfoNet m3008getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLCountJoinFlop();

            public final native long getLCountJoinRiver();

            public final native long getLCountJoinTurn();

            public final native long getLCountShowdownFlopWin();

            public final native long getLCountShowdownRiverWin();

            public final native long getLCountShowdownShow();

            public final native long getLCountShowdownTurnWin();

            public final native long getLCountShowdownWinShow();

            public final native long getLGameGain();

            public final native long getLTotalHand();

            public final native long getLTotalJoinHand();

            public final native long getLTotalWin();

            public final native boolean hasLCountJoinFlop();

            public final native boolean hasLCountJoinRiver();

            public final native boolean hasLCountJoinTurn();

            public final native boolean hasLCountShowdownFlopWin();

            public final native boolean hasLCountShowdownRiverWin();

            public final native boolean hasLCountShowdownShow();

            public final native boolean hasLCountShowdownTurnWin();

            public final native boolean hasLCountShowdownWinShow();

            public final native boolean hasLGameGain();

            public final native boolean hasLTotalHand();

            public final native boolean hasLTotalJoinHand();

            public final native boolean hasLTotalWin();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3009mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3010mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3011mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3012mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3013mergeFrom(Message message);

            public final native Builder mergeFrom(GameUserStatisticsInfoNet gameUserStatisticsInfoNet);

            public final native Builder setLCountJoinFlop(long j);

            public final native Builder setLCountJoinRiver(long j);

            public final native Builder setLCountJoinTurn(long j);

            public final native Builder setLCountShowdownFlopWin(long j);

            public final native Builder setLCountShowdownRiverWin(long j);

            public final native Builder setLCountShowdownShow(long j);

            public final native Builder setLCountShowdownTurnWin(long j);

            public final native Builder setLCountShowdownWinShow(long j);

            public final native Builder setLGameGain(long j);

            public final native Builder setLTotalHand(long j);

            public final native Builder setLTotalJoinHand(long j);

            public final native Builder setLTotalWin(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpBill.f96a;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{14399, 14400, 14401, 14402, 14403, 14404, 14405, 14406, 14407, 14408, 14409, 14410, 14411, 14412, 14413, 14414, 14415, 14416, 14417, 14418, 14419, 14420, 14421, 14422, 14423, 14424, 14425, 14426, 14427, 14428, 14429, 14430, 14431, 14432, 14433, 14434, 14435, 14436, 14437, 14438, 14439, 14440, 14441, 14442, 14443, 14444, 14445, 14446});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native GameUserStatisticsInfoNet(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ GameUserStatisticsInfoNet(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, GameUserStatisticsInfoNet gameUserStatisticsInfoNet);

        private native GameUserStatisticsInfoNet(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ GameUserStatisticsInfoNet(com.google.protobuf.GeneratedMessage.Builder builder, GameUserStatisticsInfoNet gameUserStatisticsInfoNet);

        private native GameUserStatisticsInfoNet(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2990getDefaultInstanceForType();

        public final native GameUserStatisticsInfoNet m2991getDefaultInstanceForType();

        public final native long getLCountJoinFlop();

        public final native long getLCountJoinRiver();

        public final native long getLCountJoinTurn();

        public final native long getLCountShowdownFlopWin();

        public final native long getLCountShowdownRiverWin();

        public final native long getLCountShowdownShow();

        public final native long getLCountShowdownTurnWin();

        public final native long getLCountShowdownWinShow();

        public final native long getLGameGain();

        public final native long getLTotalHand();

        public final native long getLTotalJoinHand();

        public final native long getLTotalWin();

        public final native Parser<GameUserStatisticsInfoNet> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasLCountJoinFlop();

        public final native boolean hasLCountJoinRiver();

        public final native boolean hasLCountJoinTurn();

        public final native boolean hasLCountShowdownFlopWin();

        public final native boolean hasLCountShowdownRiverWin();

        public final native boolean hasLCountShowdownShow();

        public final native boolean hasLCountShowdownTurnWin();

        public final native boolean hasLCountShowdownWinShow();

        public final native boolean hasLGameGain();

        public final native boolean hasLTotalHand();

        public final native boolean hasLTotalJoinHand();

        public final native boolean hasLTotalWin();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2992newBuilderForType();

        public final native Builder m2993newBuilderForType();

        protected final native Builder m2994newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2995toBuilder();

        public final native Builder m2996toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static GameUserStatisticsInfoNet getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpBill.f96a;
        }

        static void __clinit__() {
            PARSER = new C01691();
            GameUserStatisticsInfoNet gameUserStatisticsInfoNet = new GameUserStatisticsInfoNet(true);
            defaultInstance = gameUserStatisticsInfoNet;
            gameUserStatisticsInfoNet.initFields();
        }

        public static GameUserStatisticsInfoNet parseFrom(ByteString byteString) {
            return (GameUserStatisticsInfoNet) PARSER.parseFrom(byteString);
        }

        public static GameUserStatisticsInfoNet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (GameUserStatisticsInfoNet) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GameUserStatisticsInfoNet parseFrom(byte[] bArr) {
            return (GameUserStatisticsInfoNet) PARSER.parseFrom(bArr);
        }

        public static GameUserStatisticsInfoNet parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (GameUserStatisticsInfoNet) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GameUserStatisticsInfoNet parseFrom(InputStream inputStream) {
            return (GameUserStatisticsInfoNet) PARSER.parseFrom(inputStream);
        }

        public static GameUserStatisticsInfoNet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GameUserStatisticsInfoNet) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static GameUserStatisticsInfoNet parseDelimitedFrom(InputStream inputStream) {
            return (GameUserStatisticsInfoNet) PARSER.parseDelimitedFrom(inputStream);
        }

        public static GameUserStatisticsInfoNet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GameUserStatisticsInfoNet) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static GameUserStatisticsInfoNet parseFrom(CodedInputStream codedInputStream) {
            return (GameUserStatisticsInfoNet) PARSER.parseFrom(codedInputStream);
        }

        public static GameUserStatisticsInfoNet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GameUserStatisticsInfoNet) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(GameUserStatisticsInfoNet gameUserStatisticsInfoNet) {
            return newBuilder().mergeFrom(gameUserStatisticsInfoNet);
        }
    }

    public interface NormalBillInfoNetOrBuilder extends MessageOrBuilder {
        int getBInsurance();

        int getBOwnerDeleted();

        CREATE_ROOM_TYPE getECreateRoomType();

        int getIAnte();

        int getIGameRoomUserMaxNums();

        long getLBigBlind();

        long getLBillID();

        long getLBuyin();

        long getLCreateTime();

        long getLDuration();

        long getLFromRoomID();

        long getLLeagueID();

        long getLMaxPot();

        long getLSmallBlind();

        long getLTotalBuyin();

        long getLTotalGameNum();

        String getSFromText();

        ByteString getSFromTextBytes();

        String getSLeagueName();

        ByteString getSLeagueNameBytes();

        String getSPlayName();

        ByteString getSPlayNameBytes();

        UserBaseInfoNet getStCreateUserBaseInfo();

        UserBaseInfoNetOrBuilder getStCreateUserBaseInfoOrBuilder();

        GameUserStatisticsInfoNet getStGameUserStatisticsInfoNet();

        GameUserStatisticsInfoNetOrBuilder getStGameUserStatisticsInfoNetOrBuilder();

        UserBillInfoNet getVUserBillInfos(int i);

        int getVUserBillInfosCount();

        List<UserBillInfoNet> getVUserBillInfosList();

        UserBillInfoNetOrBuilder getVUserBillInfosOrBuilder(int i);

        List<? extends UserBillInfoNetOrBuilder> getVUserBillInfosOrBuilderList();

        boolean hasBInsurance();

        boolean hasBOwnerDeleted();

        boolean hasECreateRoomType();

        boolean hasIAnte();

        boolean hasIGameRoomUserMaxNums();

        boolean hasLBigBlind();

        boolean hasLBillID();

        boolean hasLBuyin();

        boolean hasLCreateTime();

        boolean hasLDuration();

        boolean hasLFromRoomID();

        boolean hasLLeagueID();

        boolean hasLMaxPot();

        boolean hasLSmallBlind();

        boolean hasLTotalBuyin();

        boolean hasLTotalGameNum();

        boolean hasSFromText();

        boolean hasSLeagueName();

        boolean hasSPlayName();

        boolean hasStCreateUserBaseInfo();

        boolean hasStGameUserStatisticsInfoNet();
    }

    public static final class NormalBillInfoNet extends GeneratedMessage implements NormalBillInfoNetOrBuilder {
        public static final int BINSURANCE_FIELD_NUMBER = 20;
        public static final int BOWNERDELETED_FIELD_NUMBER = 2;
        public static final int ECREATEROOMTYPE_FIELD_NUMBER = 15;
        public static final int IANTE_FIELD_NUMBER = 19;
        public static final int IGAMEROOMUSERMAXNUMS_FIELD_NUMBER = 17;
        public static final int LBIGBLIND_FIELD_NUMBER = 8;
        public static final int LBILLID_FIELD_NUMBER = 1;
        public static final int LBUYIN_FIELD_NUMBER = 9;
        public static final int LCREATETIME_FIELD_NUMBER = 5;
        public static final int LDURATION_FIELD_NUMBER = 6;
        public static final int LFROMROOMID_FIELD_NUMBER = 16;
        public static final int LLEAGUEID_FIELD_NUMBER = 21;
        public static final int LMAXPOT_FIELD_NUMBER = 12;
        public static final int LSMALLBLIND_FIELD_NUMBER = 7;
        public static final int LTOTALBUYIN_FIELD_NUMBER = 10;
        public static final int LTOTALGAMENUM_FIELD_NUMBER = 11;
        public static Parser<NormalBillInfoNet> PARSER = null;
        public static final int SFROMTEXT_FIELD_NUMBER = 14;
        public static final int SLEAGUENAME_FIELD_NUMBER = 22;
        public static final int SPLAYNAME_FIELD_NUMBER = 3;
        public static final int STCREATEUSERBASEINFO_FIELD_NUMBER = 4;
        public static final int STGAMEUSERSTATISTICSINFONET_FIELD_NUMBER = 18;
        public static final int VUSERBILLINFOS_FIELD_NUMBER = 13;
        private static final NormalBillInfoNet defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bInsurance_;
        private int bOwnerDeleted_;
        private int bitField0_;
        private CREATE_ROOM_TYPE eCreateRoomType_;
        private int iAnte_;
        private int iGameRoomUserMaxNums_;
        private long lBigBlind_;
        private long lBillID_;
        private long lBuyin_;
        private long lCreateTime_;
        private long lDuration_;
        private long lFromRoomID_;
        private long lLeagueID_;
        private long lMaxPot_;
        private long lSmallBlind_;
        private long lTotalBuyin_;
        private long lTotalGameNum_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sFromText_;
        private Object sLeagueName_;
        private Object sPlayName_;
        private UserBaseInfoNet stCreateUserBaseInfo_;
        private GameUserStatisticsInfoNet stGameUserStatisticsInfoNet_;
        private final UnknownFieldSet unknownFields;
        private List<UserBillInfoNet> vUserBillInfos_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpBill.NormalBillInfoNet.1 */
        class C01701 extends AbstractParser<NormalBillInfoNet> {
            static {
                fixHelper.fixfunc(new int[]{9017, 9018});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01701();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements NormalBillInfoNetOrBuilder {
            private int bInsurance_;
            private int bOwnerDeleted_;
            private int bitField0_;
            private CREATE_ROOM_TYPE eCreateRoomType_;
            private int iAnte_;
            private int iGameRoomUserMaxNums_;
            private long lBigBlind_;
            private long lBillID_;
            private long lBuyin_;
            private long lCreateTime_;
            private long lDuration_;
            private long lFromRoomID_;
            private long lLeagueID_;
            private long lMaxPot_;
            private long lSmallBlind_;
            private long lTotalBuyin_;
            private long lTotalGameNum_;
            private Object sFromText_;
            private Object sLeagueName_;
            private Object sPlayName_;
            private SingleFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> stCreateUserBaseInfoBuilder_;
            private UserBaseInfoNet stCreateUserBaseInfo_;
            private SingleFieldBuilder<GameUserStatisticsInfoNet, Builder, GameUserStatisticsInfoNetOrBuilder> stGameUserStatisticsInfoNetBuilder_;
            private GameUserStatisticsInfoNet stGameUserStatisticsInfoNet_;
            private RepeatedFieldBuilder<UserBillInfoNet, Builder, UserBillInfoNetOrBuilder> vUserBillInfosBuilder_;
            private List<UserBillInfoNet> vUserBillInfos_;

            static {
                fixHelper.fixfunc(new int[]{26199, 26200, 26201, 26202, 26203, 26204, 26205, 26206, 26207, 26208, 26209, 26210, 26211, 26212, 26213, 26214, 26215, 26216, 26217, 26218, 26219, 26220, 26221, 26222, 26223, 26224, 26225, 26226, 26227, 26228, 26229, 26230, 26231, 26232, 26233, 26234, 26235, 26236, 26237, 26238, 26239, 26240, 26241, 26242, 26243, 26244, 26245, 26246, 26247, 26248, 26249, 26250, 26251, 26252, 26253, 26254, 26255, 26256, 26257, 26258, 26259, 26260, 26261, 26262, 26263, 26264, 26265, 26266, 26267, 26268, 26269, 26270, 26271, 26272, 26273, 26274, 26275, 26276, 26277, 26278, 26279, 26280, 26281, 26282, 26283, 26284, 26285, 26286, 26287, 26288, 26289, 26290, 26291, 26292, 26293, 26294, 26295, 26296, 26297, 26298, 26299, 26300, 26301, 26302, 26303, 26304, 26305, 26306, 26307, 26308, 26309, 26310, 26311, 26312, 26313, 26314, 26315, 26316, 26317, 26318, 26319, 26320, 26321, 26322, 26323, 26324, 26325, 26326, 26327, 26328, 26329, 26330, 26331, 26332, 26333, 26334, 26335, 26336, 26337, 26338, 26339, 26340, 26341, 26342, 26343, 26344, 26345, 26346, 26347, 26348, 26349, 26350});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVUserBillInfosIsMutable();

            private native SingleFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> getStCreateUserBaseInfoFieldBuilder();

            private native SingleFieldBuilder<GameUserStatisticsInfoNet, Builder, GameUserStatisticsInfoNetOrBuilder> getStGameUserStatisticsInfoNetFieldBuilder();

            private native RepeatedFieldBuilder<UserBillInfoNet, Builder, UserBillInfoNetOrBuilder> getVUserBillInfosFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVUserBillInfos(Iterable<? extends UserBillInfoNet> iterable);

            public final native Builder addVUserBillInfos(int i, Builder builder);

            public final native Builder addVUserBillInfos(int i, UserBillInfoNet userBillInfoNet);

            public final native Builder addVUserBillInfos(Builder builder);

            public final native Builder addVUserBillInfos(UserBillInfoNet userBillInfoNet);

            public final native Builder addVUserBillInfosBuilder();

            public final native Builder addVUserBillInfosBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3021build();

            public final native NormalBillInfoNet m3022build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3023buildPartial();

            public final native NormalBillInfoNet m3024buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3025clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3026clear();

            public final native Builder m3027clear();

            public final native Builder clearBInsurance();

            public final native Builder clearBOwnerDeleted();

            public final native Builder clearECreateRoomType();

            public final native Builder clearIAnte();

            public final native Builder clearIGameRoomUserMaxNums();

            public final native Builder clearLBigBlind();

            public final native Builder clearLBillID();

            public final native Builder clearLBuyin();

            public final native Builder clearLCreateTime();

            public final native Builder clearLDuration();

            public final native Builder clearLFromRoomID();

            public final native Builder clearLLeagueID();

            public final native Builder clearLMaxPot();

            public final native Builder clearLSmallBlind();

            public final native Builder clearLTotalBuyin();

            public final native Builder clearLTotalGameNum();

            public final native Builder clearSFromText();

            public final native Builder clearSLeagueName();

            public final native Builder clearSPlayName();

            public final native Builder clearStCreateUserBaseInfo();

            public final native Builder clearStGameUserStatisticsInfoNet();

            public final native Builder clearVUserBillInfos();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3028clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3029clone();

            public final native Builder m3030clone();

            public final native int getBInsurance();

            public final native int getBOwnerDeleted();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3031getDefaultInstanceForType();

            public final native NormalBillInfoNet m3032getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native CREATE_ROOM_TYPE getECreateRoomType();

            public final native int getIAnte();

            public final native int getIGameRoomUserMaxNums();

            public final native long getLBigBlind();

            public final native long getLBillID();

            public final native long getLBuyin();

            public final native long getLCreateTime();

            public final native long getLDuration();

            public final native long getLFromRoomID();

            public final native long getLLeagueID();

            public final native long getLMaxPot();

            public final native long getLSmallBlind();

            public final native long getLTotalBuyin();

            public final native long getLTotalGameNum();

            public final native String getSFromText();

            public final native ByteString getSFromTextBytes();

            public final native String getSLeagueName();

            public final native ByteString getSLeagueNameBytes();

            public final native String getSPlayName();

            public final native ByteString getSPlayNameBytes();

            public final native UserBaseInfoNet getStCreateUserBaseInfo();

            public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder getStCreateUserBaseInfoBuilder();

            public final native UserBaseInfoNetOrBuilder getStCreateUserBaseInfoOrBuilder();

            public final native GameUserStatisticsInfoNet getStGameUserStatisticsInfoNet();

            public final native Builder getStGameUserStatisticsInfoNetBuilder();

            public final native GameUserStatisticsInfoNetOrBuilder getStGameUserStatisticsInfoNetOrBuilder();

            public final native UserBillInfoNet getVUserBillInfos(int i);

            public final native Builder getVUserBillInfosBuilder(int i);

            public final native List<Builder> getVUserBillInfosBuilderList();

            public final native int getVUserBillInfosCount();

            public final native List<UserBillInfoNet> getVUserBillInfosList();

            public final native UserBillInfoNetOrBuilder getVUserBillInfosOrBuilder(int i);

            public final native List<? extends UserBillInfoNetOrBuilder> getVUserBillInfosOrBuilderList();

            public final native boolean hasBInsurance();

            public final native boolean hasBOwnerDeleted();

            public final native boolean hasECreateRoomType();

            public final native boolean hasIAnte();

            public final native boolean hasIGameRoomUserMaxNums();

            public final native boolean hasLBigBlind();

            public final native boolean hasLBillID();

            public final native boolean hasLBuyin();

            public final native boolean hasLCreateTime();

            public final native boolean hasLDuration();

            public final native boolean hasLFromRoomID();

            public final native boolean hasLLeagueID();

            public final native boolean hasLMaxPot();

            public final native boolean hasLSmallBlind();

            public final native boolean hasLTotalBuyin();

            public final native boolean hasLTotalGameNum();

            public final native boolean hasSFromText();

            public final native boolean hasSLeagueName();

            public final native boolean hasSPlayName();

            public final native boolean hasStCreateUserBaseInfo();

            public final native boolean hasStGameUserStatisticsInfoNet();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3033mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3034mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3035mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3036mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3037mergeFrom(Message message);

            public final native Builder mergeFrom(NormalBillInfoNet normalBillInfoNet);

            public final native Builder mergeStCreateUserBaseInfo(UserBaseInfoNet userBaseInfoNet);

            public final native Builder mergeStGameUserStatisticsInfoNet(GameUserStatisticsInfoNet gameUserStatisticsInfoNet);

            public final native Builder removeVUserBillInfos(int i);

            public final native Builder setBInsurance(int i);

            public final native Builder setBOwnerDeleted(int i);

            public final native Builder setECreateRoomType(CREATE_ROOM_TYPE create_room_type);

            public final native Builder setIAnte(int i);

            public final native Builder setIGameRoomUserMaxNums(int i);

            public final native Builder setLBigBlind(long j);

            public final native Builder setLBillID(long j);

            public final native Builder setLBuyin(long j);

            public final native Builder setLCreateTime(long j);

            public final native Builder setLDuration(long j);

            public final native Builder setLFromRoomID(long j);

            public final native Builder setLLeagueID(long j);

            public final native Builder setLMaxPot(long j);

            public final native Builder setLSmallBlind(long j);

            public final native Builder setLTotalBuyin(long j);

            public final native Builder setLTotalGameNum(long j);

            public final native Builder setSFromText(String str);

            public final native Builder setSFromTextBytes(ByteString byteString);

            public final native Builder setSLeagueName(String str);

            public final native Builder setSLeagueNameBytes(ByteString byteString);

            public final native Builder setSPlayName(String str);

            public final native Builder setSPlayNameBytes(ByteString byteString);

            public final native Builder setStCreateUserBaseInfo(com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

            public final native Builder setStCreateUserBaseInfo(UserBaseInfoNet userBaseInfoNet);

            public final native Builder setStGameUserStatisticsInfoNet(Builder builder);

            public final native Builder setStGameUserStatisticsInfoNet(GameUserStatisticsInfoNet gameUserStatisticsInfoNet);

            public final native Builder setVUserBillInfos(int i, Builder builder);

            public final native Builder setVUserBillInfos(int i, UserBillInfoNet userBillInfoNet);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpBill.f100e;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{16776, 16777, 16778, 16779, 16780, 16781, 16782, 16783, 16784, 16785, 16786, 16787, 16788, 16789, 16790, 16791, 16792, 16793, 16794, 16795, 16796, 16797, 16798, 16799, 16800, 16801, 16802, 16803, 16804, 16805, 16806, 16807, 16808, 16809, 16810, 16811, 16812, 16813, 16814, 16815, 16816, 16817, 16818, 16819, 16820, 16821, 16822, 16823, 16824, 16825, 16826, 16827, 16828, 16829, 16830, 16831, 16832, 16833, 16834, 16835, 16836, 16837, 16838, 16839, 16840, 16841, 16842, 16843, 16844, 16845, 16846, 16847, 16848, 16849, 16850, 16851});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native NormalBillInfoNet(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ NormalBillInfoNet(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, NormalBillInfoNet normalBillInfoNet);

        private native NormalBillInfoNet(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ NormalBillInfoNet(com.google.protobuf.GeneratedMessage.Builder builder, NormalBillInfoNet normalBillInfoNet);

        private native NormalBillInfoNet(boolean z);

        private native void initFields();

        public final native int getBInsurance();

        public final native int getBOwnerDeleted();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3014getDefaultInstanceForType();

        public final native NormalBillInfoNet m3015getDefaultInstanceForType();

        public final native CREATE_ROOM_TYPE getECreateRoomType();

        public final native int getIAnte();

        public final native int getIGameRoomUserMaxNums();

        public final native long getLBigBlind();

        public final native long getLBillID();

        public final native long getLBuyin();

        public final native long getLCreateTime();

        public final native long getLDuration();

        public final native long getLFromRoomID();

        public final native long getLLeagueID();

        public final native long getLMaxPot();

        public final native long getLSmallBlind();

        public final native long getLTotalBuyin();

        public final native long getLTotalGameNum();

        public final native Parser<NormalBillInfoNet> getParserForType();

        public final native String getSFromText();

        public final native ByteString getSFromTextBytes();

        public final native String getSLeagueName();

        public final native ByteString getSLeagueNameBytes();

        public final native String getSPlayName();

        public final native ByteString getSPlayNameBytes();

        public final native int getSerializedSize();

        public final native UserBaseInfoNet getStCreateUserBaseInfo();

        public final native UserBaseInfoNetOrBuilder getStCreateUserBaseInfoOrBuilder();

        public final native GameUserStatisticsInfoNet getStGameUserStatisticsInfoNet();

        public final native GameUserStatisticsInfoNetOrBuilder getStGameUserStatisticsInfoNetOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native UserBillInfoNet getVUserBillInfos(int i);

        public final native int getVUserBillInfosCount();

        public final native List<UserBillInfoNet> getVUserBillInfosList();

        public final native UserBillInfoNetOrBuilder getVUserBillInfosOrBuilder(int i);

        public final native List<? extends UserBillInfoNetOrBuilder> getVUserBillInfosOrBuilderList();

        public final native boolean hasBInsurance();

        public final native boolean hasBOwnerDeleted();

        public final native boolean hasECreateRoomType();

        public final native boolean hasIAnte();

        public final native boolean hasIGameRoomUserMaxNums();

        public final native boolean hasLBigBlind();

        public final native boolean hasLBillID();

        public final native boolean hasLBuyin();

        public final native boolean hasLCreateTime();

        public final native boolean hasLDuration();

        public final native boolean hasLFromRoomID();

        public final native boolean hasLLeagueID();

        public final native boolean hasLMaxPot();

        public final native boolean hasLSmallBlind();

        public final native boolean hasLTotalBuyin();

        public final native boolean hasLTotalGameNum();

        public final native boolean hasSFromText();

        public final native boolean hasSLeagueName();

        public final native boolean hasSPlayName();

        public final native boolean hasStCreateUserBaseInfo();

        public final native boolean hasStGameUserStatisticsInfoNet();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3016newBuilderForType();

        public final native Builder m3017newBuilderForType();

        protected final native Builder m3018newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3019toBuilder();

        public final native Builder m3020toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static NormalBillInfoNet getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpBill.f100e;
        }

        static void __clinit__() {
            PARSER = new C01701();
            NormalBillInfoNet normalBillInfoNet = new NormalBillInfoNet(true);
            defaultInstance = normalBillInfoNet;
            normalBillInfoNet.initFields();
        }

        public static NormalBillInfoNet parseFrom(ByteString byteString) {
            return (NormalBillInfoNet) PARSER.parseFrom(byteString);
        }

        public static NormalBillInfoNet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (NormalBillInfoNet) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static NormalBillInfoNet parseFrom(byte[] bArr) {
            return (NormalBillInfoNet) PARSER.parseFrom(bArr);
        }

        public static NormalBillInfoNet parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (NormalBillInfoNet) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static NormalBillInfoNet parseFrom(InputStream inputStream) {
            return (NormalBillInfoNet) PARSER.parseFrom(inputStream);
        }

        public static NormalBillInfoNet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NormalBillInfoNet) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static NormalBillInfoNet parseDelimitedFrom(InputStream inputStream) {
            return (NormalBillInfoNet) PARSER.parseDelimitedFrom(inputStream);
        }

        public static NormalBillInfoNet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NormalBillInfoNet) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static NormalBillInfoNet parseFrom(CodedInputStream codedInputStream) {
            return (NormalBillInfoNet) PARSER.parseFrom(codedInputStream);
        }

        public static NormalBillInfoNet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NormalBillInfoNet) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(NormalBillInfoNet normalBillInfoNet) {
            return newBuilder().mergeFrom(normalBillInfoNet);
        }
    }

    public interface SCGetBillInfoByRoomIDRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        BillInfoNet getStBillInfoNet();

        BillInfoNetOrBuilder getStBillInfoNetOrBuilder();

        UserBaseInfoNet getVPlays(int i);

        int getVPlaysCount();

        List<UserBaseInfoNet> getVPlaysList();

        UserBaseInfoNetOrBuilder getVPlaysOrBuilder(int i);

        List<? extends UserBaseInfoNetOrBuilder> getVPlaysOrBuilderList();

        UserBaseInfoNet getVStandBysOffline(int i);

        int getVStandBysOfflineCount();

        List<UserBaseInfoNet> getVStandBysOfflineList();

        UserBaseInfoNetOrBuilder getVStandBysOfflineOrBuilder(int i);

        List<? extends UserBaseInfoNetOrBuilder> getVStandBysOfflineOrBuilderList();

        UserBaseInfoNet getVStandBysOnline(int i);

        int getVStandBysOnlineCount();

        List<UserBaseInfoNet> getVStandBysOnlineList();

        UserBaseInfoNetOrBuilder getVStandBysOnlineOrBuilder(int i);

        List<? extends UserBaseInfoNetOrBuilder> getVStandBysOnlineOrBuilderList();

        boolean hasEErrCode();

        boolean hasStBillInfoNet();
    }

    public static final class SCGetBillInfoByRoomIDRsp extends GeneratedMessage implements SCGetBillInfoByRoomIDRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCGetBillInfoByRoomIDRsp> PARSER = null;
        public static final int STBILLINFONET_FIELD_NUMBER = 2;
        public static final int VPLAYS_FIELD_NUMBER = 3;
        public static final int VSTANDBYSOFFLINE_FIELD_NUMBER = 5;
        public static final int VSTANDBYSONLINE_FIELD_NUMBER = 4;
        private static final SCGetBillInfoByRoomIDRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private BillInfoNet stBillInfoNet_;
        private final UnknownFieldSet unknownFields;
        private List<UserBaseInfoNet> vPlays_;
        private List<UserBaseInfoNet> vStandBysOffline_;
        private List<UserBaseInfoNet> vStandBysOnline_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpBill.SCGetBillInfoByRoomIDRsp.1 */
        class C01711 extends AbstractParser<SCGetBillInfoByRoomIDRsp> {
            static {
                fixHelper.fixfunc(new int[]{18323, 18324});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01711();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetBillInfoByRoomIDRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private SingleFieldBuilder<BillInfoNet, Builder, BillInfoNetOrBuilder> stBillInfoNetBuilder_;
            private BillInfoNet stBillInfoNet_;
            private RepeatedFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> vPlaysBuilder_;
            private List<UserBaseInfoNet> vPlays_;
            private RepeatedFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> vStandBysOfflineBuilder_;
            private List<UserBaseInfoNet> vStandBysOffline_;
            private RepeatedFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> vStandBysOnlineBuilder_;
            private List<UserBaseInfoNet> vStandBysOnline_;

            static {
                fixHelper.fixfunc(new int[]{26094, 26095, 26096, 26097, 26098, 26099, 26100, 26101, 26102, 26103, 26104, 26105, 26106, 26107, 26108, 26109, 26110, 26111, 26112, 26113, 26114, 26115, 26116, 26117, 26118, 26119, 26120, 26121, 26122, 26123, 26124, 26125, 26126, 26127, 26128, 26129, 26130, 26131, 26132, 26133, 26134, 26135, 26136, 26137, 26138, 26139, 26140, 26141, 26142, 26143, 26144, 26145, 26146, 26147, 26148, 26149, 26150, 26151, 26152, 26153, 26154, 26155, 26156, 26157, 26158, 26159, 26160, 26161, 26162, 26163, 26164, 26165, 26166, 26167, 26168, 26169, 26170, 26171, 26172, 26173, 26174, 26175, 26176, 26177, 26178, 26179, 26180, 26181, 26182, 26183, 26184, 26185, 26186, 26187, 26188, 26189, 26190, 26191, 26192, 26193, 26194, 26195, 26196, 26197, 26198});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVPlaysIsMutable();

            private native void ensureVStandBysOfflineIsMutable();

            private native void ensureVStandBysOnlineIsMutable();

            private native SingleFieldBuilder<BillInfoNet, Builder, BillInfoNetOrBuilder> getStBillInfoNetFieldBuilder();

            private native RepeatedFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> getVPlaysFieldBuilder();

            private native RepeatedFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> getVStandBysOfflineFieldBuilder();

            private native RepeatedFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> getVStandBysOnlineFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVPlays(Iterable<? extends UserBaseInfoNet> iterable);

            public final native Builder addAllVStandBysOffline(Iterable<? extends UserBaseInfoNet> iterable);

            public final native Builder addAllVStandBysOnline(Iterable<? extends UserBaseInfoNet> iterable);

            public final native Builder addVPlays(int i, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

            public final native Builder addVPlays(int i, UserBaseInfoNet userBaseInfoNet);

            public final native Builder addVPlays(com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

            public final native Builder addVPlays(UserBaseInfoNet userBaseInfoNet);

            public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder addVPlaysBuilder();

            public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder addVPlaysBuilder(int i);

            public final native Builder addVStandBysOffline(int i, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

            public final native Builder addVStandBysOffline(int i, UserBaseInfoNet userBaseInfoNet);

            public final native Builder addVStandBysOffline(com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

            public final native Builder addVStandBysOffline(UserBaseInfoNet userBaseInfoNet);

            public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder addVStandBysOfflineBuilder();

            public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder addVStandBysOfflineBuilder(int i);

            public final native Builder addVStandBysOnline(int i, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

            public final native Builder addVStandBysOnline(int i, UserBaseInfoNet userBaseInfoNet);

            public final native Builder addVStandBysOnline(com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

            public final native Builder addVStandBysOnline(UserBaseInfoNet userBaseInfoNet);

            public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder addVStandBysOnlineBuilder();

            public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder addVStandBysOnlineBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3045build();

            public final native SCGetBillInfoByRoomIDRsp m3046build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3047buildPartial();

            public final native SCGetBillInfoByRoomIDRsp m3048buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3049clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3050clear();

            public final native Builder m3051clear();

            public final native Builder clearEErrCode();

            public final native Builder clearStBillInfoNet();

            public final native Builder clearVPlays();

            public final native Builder clearVStandBysOffline();

            public final native Builder clearVStandBysOnline();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3052clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3053clone();

            public final native Builder m3054clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3055getDefaultInstanceForType();

            public final native SCGetBillInfoByRoomIDRsp m3056getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native BillInfoNet getStBillInfoNet();

            public final native Builder getStBillInfoNetBuilder();

            public final native BillInfoNetOrBuilder getStBillInfoNetOrBuilder();

            public final native UserBaseInfoNet getVPlays(int i);

            public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder getVPlaysBuilder(int i);

            public final native List<com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder> getVPlaysBuilderList();

            public final native int getVPlaysCount();

            public final native List<UserBaseInfoNet> getVPlaysList();

            public final native UserBaseInfoNetOrBuilder getVPlaysOrBuilder(int i);

            public final native List<? extends UserBaseInfoNetOrBuilder> getVPlaysOrBuilderList();

            public final native UserBaseInfoNet getVStandBysOffline(int i);

            public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder getVStandBysOfflineBuilder(int i);

            public final native List<com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder> getVStandBysOfflineBuilderList();

            public final native int getVStandBysOfflineCount();

            public final native List<UserBaseInfoNet> getVStandBysOfflineList();

            public final native UserBaseInfoNetOrBuilder getVStandBysOfflineOrBuilder(int i);

            public final native List<? extends UserBaseInfoNetOrBuilder> getVStandBysOfflineOrBuilderList();

            public final native UserBaseInfoNet getVStandBysOnline(int i);

            public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder getVStandBysOnlineBuilder(int i);

            public final native List<com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder> getVStandBysOnlineBuilderList();

            public final native int getVStandBysOnlineCount();

            public final native List<UserBaseInfoNet> getVStandBysOnlineList();

            public final native UserBaseInfoNetOrBuilder getVStandBysOnlineOrBuilder(int i);

            public final native List<? extends UserBaseInfoNetOrBuilder> getVStandBysOnlineOrBuilderList();

            public final native boolean hasEErrCode();

            public final native boolean hasStBillInfoNet();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3057mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3058mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3059mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3060mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3061mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetBillInfoByRoomIDRsp sCGetBillInfoByRoomIDRsp);

            public final native Builder mergeStBillInfoNet(BillInfoNet billInfoNet);

            public final native Builder removeVPlays(int i);

            public final native Builder removeVStandBysOffline(int i);

            public final native Builder removeVStandBysOnline(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setStBillInfoNet(Builder builder);

            public final native Builder setStBillInfoNet(BillInfoNet billInfoNet);

            public final native Builder setVPlays(int i, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

            public final native Builder setVPlays(int i, UserBaseInfoNet userBaseInfoNet);

            public final native Builder setVStandBysOffline(int i, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

            public final native Builder setVStandBysOffline(int i, UserBaseInfoNet userBaseInfoNet);

            public final native Builder setVStandBysOnline(int i, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

            public final native Builder setVStandBysOnline(int i, UserBaseInfoNet userBaseInfoNet);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpBill.f110o;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{16483, 16484, 16485, 16486, 16487, 16488, 16489, 16490, 16491, 16492, 16493, 16494, 16495, 16496, 16497, 16498, 16499, 16500, 16501, 16502, 16503, 16504, 16505, 16506, 16507, 16508, 16509, 16510, 16511, 16512, 16513, 16514, 16515, 16516, 16517, 16518, 16519, 16520, 16521, 16522, 16523, 16524, 16525, 16526});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetBillInfoByRoomIDRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetBillInfoByRoomIDRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetBillInfoByRoomIDRsp sCGetBillInfoByRoomIDRsp);

        private native SCGetBillInfoByRoomIDRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetBillInfoByRoomIDRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetBillInfoByRoomIDRsp sCGetBillInfoByRoomIDRsp);

        private native SCGetBillInfoByRoomIDRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3038getDefaultInstanceForType();

        public final native SCGetBillInfoByRoomIDRsp m3039getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCGetBillInfoByRoomIDRsp> getParserForType();

        public final native int getSerializedSize();

        public final native BillInfoNet getStBillInfoNet();

        public final native BillInfoNetOrBuilder getStBillInfoNetOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native UserBaseInfoNet getVPlays(int i);

        public final native int getVPlaysCount();

        public final native List<UserBaseInfoNet> getVPlaysList();

        public final native UserBaseInfoNetOrBuilder getVPlaysOrBuilder(int i);

        public final native List<? extends UserBaseInfoNetOrBuilder> getVPlaysOrBuilderList();

        public final native UserBaseInfoNet getVStandBysOffline(int i);

        public final native int getVStandBysOfflineCount();

        public final native List<UserBaseInfoNet> getVStandBysOfflineList();

        public final native UserBaseInfoNetOrBuilder getVStandBysOfflineOrBuilder(int i);

        public final native List<? extends UserBaseInfoNetOrBuilder> getVStandBysOfflineOrBuilderList();

        public final native UserBaseInfoNet getVStandBysOnline(int i);

        public final native int getVStandBysOnlineCount();

        public final native List<UserBaseInfoNet> getVStandBysOnlineList();

        public final native UserBaseInfoNetOrBuilder getVStandBysOnlineOrBuilder(int i);

        public final native List<? extends UserBaseInfoNetOrBuilder> getVStandBysOnlineOrBuilderList();

        public final native boolean hasEErrCode();

        public final native boolean hasStBillInfoNet();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3040newBuilderForType();

        public final native Builder m3041newBuilderForType();

        protected final native Builder m3042newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3043toBuilder();

        public final native Builder m3044toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetBillInfoByRoomIDRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpBill.f110o;
        }

        static void __clinit__() {
            PARSER = new C01711();
            SCGetBillInfoByRoomIDRsp sCGetBillInfoByRoomIDRsp = new SCGetBillInfoByRoomIDRsp(true);
            defaultInstance = sCGetBillInfoByRoomIDRsp;
            sCGetBillInfoByRoomIDRsp.initFields();
        }

        public static SCGetBillInfoByRoomIDRsp parseFrom(ByteString byteString) {
            return (SCGetBillInfoByRoomIDRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetBillInfoByRoomIDRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetBillInfoByRoomIDRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetBillInfoByRoomIDRsp parseFrom(byte[] bArr) {
            return (SCGetBillInfoByRoomIDRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetBillInfoByRoomIDRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetBillInfoByRoomIDRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetBillInfoByRoomIDRsp parseFrom(InputStream inputStream) {
            return (SCGetBillInfoByRoomIDRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetBillInfoByRoomIDRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetBillInfoByRoomIDRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetBillInfoByRoomIDRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetBillInfoByRoomIDRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetBillInfoByRoomIDRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetBillInfoByRoomIDRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetBillInfoByRoomIDRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetBillInfoByRoomIDRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetBillInfoByRoomIDRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetBillInfoByRoomIDRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetBillInfoByRoomIDRsp sCGetBillInfoByRoomIDRsp) {
            return newBuilder().mergeFrom(sCGetBillInfoByRoomIDRsp);
        }
    }

    public interface SCGetBillInfosRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        int getIUnReadNum();

        long getLClubID();

        long getLNewestTime();

        long getLTotalWinStacks();

        BillInfoNet getStBillInfoNet(int i);

        int getStBillInfoNetCount();

        List<BillInfoNet> getStBillInfoNetList();

        BillInfoNetOrBuilder getStBillInfoNetOrBuilder(int i);

        List<? extends BillInfoNetOrBuilder> getStBillInfoNetOrBuilderList();

        boolean hasEErrCode();

        boolean hasIUnReadNum();

        boolean hasLClubID();

        boolean hasLNewestTime();

        boolean hasLTotalWinStacks();
    }

    public static final class SCGetBillInfosRsp extends GeneratedMessage implements SCGetBillInfosRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int IUNREADNUM_FIELD_NUMBER = 4;
        public static final int LCLUBID_FIELD_NUMBER = 6;
        public static final int LNEWESTTIME_FIELD_NUMBER = 5;
        public static final int LTOTALWINSTACKS_FIELD_NUMBER = 2;
        public static Parser<SCGetBillInfosRsp> PARSER = null;
        public static final int STBILLINFONET_FIELD_NUMBER = 3;
        private static final SCGetBillInfosRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private int iUnReadNum_;
        private long lClubID_;
        private long lNewestTime_;
        private long lTotalWinStacks_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<BillInfoNet> stBillInfoNet_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpBill.SCGetBillInfosRsp.1 */
        class C01721 extends AbstractParser<SCGetBillInfosRsp> {
            static {
                fixHelper.fixfunc(new int[]{7238, 7239});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01721();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetBillInfosRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private int iUnReadNum_;
            private long lClubID_;
            private long lNewestTime_;
            private long lTotalWinStacks_;
            private RepeatedFieldBuilder<BillInfoNet, Builder, BillInfoNetOrBuilder> stBillInfoNetBuilder_;
            private List<BillInfoNet> stBillInfoNet_;

            static {
                fixHelper.fixfunc(new int[]{21374, 21375, 21376, 21377, 21378, 21379, 21380, 21381, 21382, 21383, 21384, 21385, 21386, 21387, 21388, 21389, 21390, 21391, 21392, 21393, 21394, 21395, 21396, 21397, 21398, 21399, 21400, 21401, 21402, 21403, 21404, 21405, 21406, 21407, 21408, 21409, 21410, 21411, 21412, 21413, 21414, 21415, 21416, 21417, 21418, 21419, 21420, 21421, 21422, 21423, 21424, 21425, 21426, 21427, 21428, 21429, 21430, 21431, 21432, 21433, 21434, 21435, 21436, 21437, 21438, 21439, 21440, 21441, 21442, 21443, 21444, 21445});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureStBillInfoNetIsMutable();

            private native RepeatedFieldBuilder<BillInfoNet, Builder, BillInfoNetOrBuilder> getStBillInfoNetFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllStBillInfoNet(Iterable<? extends BillInfoNet> iterable);

            public final native Builder addStBillInfoNet(int i, Builder builder);

            public final native Builder addStBillInfoNet(int i, BillInfoNet billInfoNet);

            public final native Builder addStBillInfoNet(Builder builder);

            public final native Builder addStBillInfoNet(BillInfoNet billInfoNet);

            public final native Builder addStBillInfoNetBuilder();

            public final native Builder addStBillInfoNetBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3069build();

            public final native SCGetBillInfosRsp m3070build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3071buildPartial();

            public final native SCGetBillInfosRsp m3072buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3073clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3074clear();

            public final native Builder m3075clear();

            public final native Builder clearEErrCode();

            public final native Builder clearIUnReadNum();

            public final native Builder clearLClubID();

            public final native Builder clearLNewestTime();

            public final native Builder clearLTotalWinStacks();

            public final native Builder clearStBillInfoNet();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3076clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3077clone();

            public final native Builder m3078clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3079getDefaultInstanceForType();

            public final native SCGetBillInfosRsp m3080getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native int getIUnReadNum();

            public final native long getLClubID();

            public final native long getLNewestTime();

            public final native long getLTotalWinStacks();

            public final native BillInfoNet getStBillInfoNet(int i);

            public final native Builder getStBillInfoNetBuilder(int i);

            public final native List<Builder> getStBillInfoNetBuilderList();

            public final native int getStBillInfoNetCount();

            public final native List<BillInfoNet> getStBillInfoNetList();

            public final native BillInfoNetOrBuilder getStBillInfoNetOrBuilder(int i);

            public final native List<? extends BillInfoNetOrBuilder> getStBillInfoNetOrBuilderList();

            public final native boolean hasEErrCode();

            public final native boolean hasIUnReadNum();

            public final native boolean hasLClubID();

            public final native boolean hasLNewestTime();

            public final native boolean hasLTotalWinStacks();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3081mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3082mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3083mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3084mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3085mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetBillInfosRsp sCGetBillInfosRsp);

            public final native Builder removeStBillInfoNet(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setIUnReadNum(int i);

            public final native Builder setLClubID(long j);

            public final native Builder setLNewestTime(long j);

            public final native Builder setLTotalWinStacks(long j);

            public final native Builder setStBillInfoNet(int i, Builder builder);

            public final native Builder setStBillInfoNet(int i, BillInfoNet billInfoNet);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpBill.f118w;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{14619, 14620, 14621, 14622, 14623, 14624, 14625, 14626, 14627, 14628, 14629, 14630, 14631, 14632, 14633, 14634, 14635, 14636, 14637, 14638, 14639, 14640, 14641, 14642, 14643, 14644, 14645, 14646, 14647, 14648, 14649, 14650, 14651, 14652, 14653, 14654, 14655, 14656, 14657});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetBillInfosRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetBillInfosRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetBillInfosRsp sCGetBillInfosRsp);

        private native SCGetBillInfosRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetBillInfosRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetBillInfosRsp sCGetBillInfosRsp);

        private native SCGetBillInfosRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3062getDefaultInstanceForType();

        public final native SCGetBillInfosRsp m3063getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native int getIUnReadNum();

        public final native long getLClubID();

        public final native long getLNewestTime();

        public final native long getLTotalWinStacks();

        public final native Parser<SCGetBillInfosRsp> getParserForType();

        public final native int getSerializedSize();

        public final native BillInfoNet getStBillInfoNet(int i);

        public final native int getStBillInfoNetCount();

        public final native List<BillInfoNet> getStBillInfoNetList();

        public final native BillInfoNetOrBuilder getStBillInfoNetOrBuilder(int i);

        public final native List<? extends BillInfoNetOrBuilder> getStBillInfoNetOrBuilderList();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasIUnReadNum();

        public final native boolean hasLClubID();

        public final native boolean hasLNewestTime();

        public final native boolean hasLTotalWinStacks();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3064newBuilderForType();

        public final native Builder m3065newBuilderForType();

        protected final native Builder m3066newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3067toBuilder();

        public final native Builder m3068toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetBillInfosRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpBill.f118w;
        }

        static void __clinit__() {
            PARSER = new C01721();
            SCGetBillInfosRsp sCGetBillInfosRsp = new SCGetBillInfosRsp(true);
            defaultInstance = sCGetBillInfosRsp;
            sCGetBillInfosRsp.initFields();
        }

        public static SCGetBillInfosRsp parseFrom(ByteString byteString) {
            return (SCGetBillInfosRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetBillInfosRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetBillInfosRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetBillInfosRsp parseFrom(byte[] bArr) {
            return (SCGetBillInfosRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetBillInfosRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetBillInfosRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetBillInfosRsp parseFrom(InputStream inputStream) {
            return (SCGetBillInfosRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetBillInfosRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetBillInfosRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetBillInfosRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetBillInfosRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetBillInfosRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetBillInfosRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetBillInfosRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetBillInfosRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetBillInfosRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetBillInfosRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetBillInfosRsp sCGetBillInfosRsp) {
            return newBuilder().mergeFrom(sCGetBillInfosRsp);
        }
    }

    public interface SCGetBillInfosV2RspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        int getIUnReadNum();

        long getLClubID();

        long getLNewestTime();

        long getLTotalWinStacks();

        BillInfoNet getStBillInfoNet(int i);

        int getStBillInfoNetCount();

        List<BillInfoNet> getStBillInfoNetList();

        BillInfoNetOrBuilder getStBillInfoNetOrBuilder(int i);

        List<? extends BillInfoNetOrBuilder> getStBillInfoNetOrBuilderList();

        boolean hasEErrCode();

        boolean hasIUnReadNum();

        boolean hasLClubID();

        boolean hasLNewestTime();

        boolean hasLTotalWinStacks();
    }

    public static final class SCGetBillInfosV2Rsp extends GeneratedMessage implements SCGetBillInfosV2RspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int IUNREADNUM_FIELD_NUMBER = 4;
        public static final int LCLUBID_FIELD_NUMBER = 6;
        public static final int LNEWESTTIME_FIELD_NUMBER = 5;
        public static final int LTOTALWINSTACKS_FIELD_NUMBER = 2;
        public static Parser<SCGetBillInfosV2Rsp> PARSER = null;
        public static final int STBILLINFONET_FIELD_NUMBER = 3;
        private static final SCGetBillInfosV2Rsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private int iUnReadNum_;
        private long lClubID_;
        private long lNewestTime_;
        private long lTotalWinStacks_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<BillInfoNet> stBillInfoNet_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpBill.SCGetBillInfosV2Rsp.1 */
        class C01731 extends AbstractParser<SCGetBillInfosV2Rsp> {
            static {
                fixHelper.fixfunc(new int[]{29218, 29219});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01731();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetBillInfosV2RspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private int iUnReadNum_;
            private long lClubID_;
            private long lNewestTime_;
            private long lTotalWinStacks_;
            private RepeatedFieldBuilder<BillInfoNet, Builder, BillInfoNetOrBuilder> stBillInfoNetBuilder_;
            private List<BillInfoNet> stBillInfoNet_;

            static {
                fixHelper.fixfunc(new int[]{12640, 12641, 12642, 12643, 12644, 12645, 12646, 12647, 12648, 12649, 12650, 12651, 12652, 12653, 12654, 12655, 12656, 12657, 12658, 12659, 12660, 12661, 12662, 12663, 12664, 12665, 12666, 12667, 12668, 12669, 12670, 12671, 12672, 12673, 12674, 12675, 12676, 12677, 12678, 12679, 12680, 12681, 12682, 12683, 12684, 12685, 12686, 12687, 12688, 12689, 12690, 12691, 12692, 12693, 12694, 12695, 12696, 12697, 12698, 12699, 12700, 12701, 12702, 12703, 12704, 12705, 12706, 12707, 12708, 12709, 12710, 12711});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureStBillInfoNetIsMutable();

            private native RepeatedFieldBuilder<BillInfoNet, Builder, BillInfoNetOrBuilder> getStBillInfoNetFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllStBillInfoNet(Iterable<? extends BillInfoNet> iterable);

            public final native Builder addStBillInfoNet(int i, Builder builder);

            public final native Builder addStBillInfoNet(int i, BillInfoNet billInfoNet);

            public final native Builder addStBillInfoNet(Builder builder);

            public final native Builder addStBillInfoNet(BillInfoNet billInfoNet);

            public final native Builder addStBillInfoNetBuilder();

            public final native Builder addStBillInfoNetBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3093build();

            public final native SCGetBillInfosV2Rsp m3094build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3095buildPartial();

            public final native SCGetBillInfosV2Rsp m3096buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3097clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3098clear();

            public final native Builder m3099clear();

            public final native Builder clearEErrCode();

            public final native Builder clearIUnReadNum();

            public final native Builder clearLClubID();

            public final native Builder clearLNewestTime();

            public final native Builder clearLTotalWinStacks();

            public final native Builder clearStBillInfoNet();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3100clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3101clone();

            public final native Builder m3102clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3103getDefaultInstanceForType();

            public final native SCGetBillInfosV2Rsp m3104getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native int getIUnReadNum();

            public final native long getLClubID();

            public final native long getLNewestTime();

            public final native long getLTotalWinStacks();

            public final native BillInfoNet getStBillInfoNet(int i);

            public final native Builder getStBillInfoNetBuilder(int i);

            public final native List<Builder> getStBillInfoNetBuilderList();

            public final native int getStBillInfoNetCount();

            public final native List<BillInfoNet> getStBillInfoNetList();

            public final native BillInfoNetOrBuilder getStBillInfoNetOrBuilder(int i);

            public final native List<? extends BillInfoNetOrBuilder> getStBillInfoNetOrBuilderList();

            public final native boolean hasEErrCode();

            public final native boolean hasIUnReadNum();

            public final native boolean hasLClubID();

            public final native boolean hasLNewestTime();

            public final native boolean hasLTotalWinStacks();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3105mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3106mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3107mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3108mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3109mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetBillInfosV2Rsp sCGetBillInfosV2Rsp);

            public final native Builder removeStBillInfoNet(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setIUnReadNum(int i);

            public final native Builder setLClubID(long j);

            public final native Builder setLNewestTime(long j);

            public final native Builder setLTotalWinStacks(long j);

            public final native Builder setStBillInfoNet(int i, Builder builder);

            public final native Builder setStBillInfoNet(int i, BillInfoNet billInfoNet);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpBill.f93A;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{16270, 16271, 16272, 16273, 16274, 16275, 16276, 16277, 16278, 16279, 16280, 16281, 16282, 16283, 16284, 16285, 16286, 16287, 16288, 16289, 16290, 16291, 16292, 16293, 16294, 16295, 16296, 16297, 16298, 16299, 16300, 16301, 16302, 16303, 16304, 16305, 16306, 16307, 16308});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetBillInfosV2Rsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetBillInfosV2Rsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetBillInfosV2Rsp sCGetBillInfosV2Rsp);

        private native SCGetBillInfosV2Rsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetBillInfosV2Rsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetBillInfosV2Rsp sCGetBillInfosV2Rsp);

        private native SCGetBillInfosV2Rsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3086getDefaultInstanceForType();

        public final native SCGetBillInfosV2Rsp m3087getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native int getIUnReadNum();

        public final native long getLClubID();

        public final native long getLNewestTime();

        public final native long getLTotalWinStacks();

        public final native Parser<SCGetBillInfosV2Rsp> getParserForType();

        public final native int getSerializedSize();

        public final native BillInfoNet getStBillInfoNet(int i);

        public final native int getStBillInfoNetCount();

        public final native List<BillInfoNet> getStBillInfoNetList();

        public final native BillInfoNetOrBuilder getStBillInfoNetOrBuilder(int i);

        public final native List<? extends BillInfoNetOrBuilder> getStBillInfoNetOrBuilderList();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasIUnReadNum();

        public final native boolean hasLClubID();

        public final native boolean hasLNewestTime();

        public final native boolean hasLTotalWinStacks();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3088newBuilderForType();

        public final native Builder m3089newBuilderForType();

        protected final native Builder m3090newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3091toBuilder();

        public final native Builder m3092toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetBillInfosV2Rsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpBill.f93A;
        }

        static void __clinit__() {
            PARSER = new C01731();
            SCGetBillInfosV2Rsp sCGetBillInfosV2Rsp = new SCGetBillInfosV2Rsp(true);
            defaultInstance = sCGetBillInfosV2Rsp;
            sCGetBillInfosV2Rsp.initFields();
        }

        public static SCGetBillInfosV2Rsp parseFrom(ByteString byteString) {
            return (SCGetBillInfosV2Rsp) PARSER.parseFrom(byteString);
        }

        public static SCGetBillInfosV2Rsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetBillInfosV2Rsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetBillInfosV2Rsp parseFrom(byte[] bArr) {
            return (SCGetBillInfosV2Rsp) PARSER.parseFrom(bArr);
        }

        public static SCGetBillInfosV2Rsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetBillInfosV2Rsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetBillInfosV2Rsp parseFrom(InputStream inputStream) {
            return (SCGetBillInfosV2Rsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetBillInfosV2Rsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetBillInfosV2Rsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetBillInfosV2Rsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetBillInfosV2Rsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetBillInfosV2Rsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetBillInfosV2Rsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetBillInfosV2Rsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetBillInfosV2Rsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetBillInfosV2Rsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetBillInfosV2Rsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetBillInfosV2Rsp sCGetBillInfosV2Rsp) {
            return newBuilder().mergeFrom(sCGetBillInfosV2Rsp);
        }
    }

    public interface SCRemoveBillRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        long getLBillID();

        boolean hasEErrCode();

        boolean hasLBillID();
    }

    public static final class SCRemoveBillRsp extends GeneratedMessage implements SCRemoveBillRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int LBILLID_FIELD_NUMBER = 2;
        public static Parser<SCRemoveBillRsp> PARSER;
        private static final SCRemoveBillRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lBillID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpBill.SCRemoveBillRsp.1 */
        class C01741 extends AbstractParser<SCRemoveBillRsp> {
            static {
                fixHelper.fixfunc(new int[]{20388, 20389});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01741();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCRemoveBillRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private long lBillID_;

            static {
                fixHelper.fixfunc(new int[]{13291, 13292, 13293, 13294, 13295, 13296, 13297, 13298, 13299, 13300, 13301, 13302, 13303, 13304, 13305, 13306, 13307, 13308, 13309, 13310, 13311, 13312, 13313, 13314, 13315, 13316, 13317, 13318, 13319, 13320, 13321, 13322, 13323, 13324, 13325, 13326, 13327, 13328, 13329, 13330});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3117build();

            public final native SCRemoveBillRsp m3118build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3119buildPartial();

            public final native SCRemoveBillRsp m3120buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3121clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3122clear();

            public final native Builder m3123clear();

            public final native Builder clearEErrCode();

            public final native Builder clearLBillID();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3124clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3125clone();

            public final native Builder m3126clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3127getDefaultInstanceForType();

            public final native SCRemoveBillRsp m3128getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native long getLBillID();

            public final native boolean hasEErrCode();

            public final native boolean hasLBillID();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3129mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3130mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3131mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3132mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3133mergeFrom(Message message);

            public final native Builder mergeFrom(SCRemoveBillRsp sCRemoveBillRsp);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setLBillID(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpBill.f114s;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{8989, 8990, 8991, 8992, 8993, 8994, 8995, 8996, 8997, 8998, 8999, PATTERNS_TYPE.NONE_VALUE, PATTERNS_TYPE.ONE_PAIR_JJ_VALUE, PATTERNS_TYPE.TWO_PAIR_VALUE, PATTERNS_TYPE.THREE_OF_A_KIND_VALUE, PATTERNS_TYPE.STRAIGHT_VALUE, PATTERNS_TYPE.FLUSH_VALUE, PATTERNS_TYPE.FULL_HOUSE_VALUE, PATTERNS_TYPE.FOUR_OF_A_KIND_VALUE, PATTERNS_TYPE.STRAIGHT_FLUSH_VALUE, PATTERNS_TYPE.ROYAL_FLUSH_VALUE, 9010, 9011, 9012, 9013, 9014, 9015, 9016});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCRemoveBillRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCRemoveBillRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCRemoveBillRsp sCRemoveBillRsp);

        private native SCRemoveBillRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCRemoveBillRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCRemoveBillRsp sCRemoveBillRsp);

        private native SCRemoveBillRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3110getDefaultInstanceForType();

        public final native SCRemoveBillRsp m3111getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLBillID();

        public final native Parser<SCRemoveBillRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasLBillID();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3112newBuilderForType();

        public final native Builder m3113newBuilderForType();

        protected final native Builder m3114newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3115toBuilder();

        public final native Builder m3116toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCRemoveBillRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpBill.f114s;
        }

        static void __clinit__() {
            PARSER = new C01741();
            SCRemoveBillRsp sCRemoveBillRsp = new SCRemoveBillRsp(true);
            defaultInstance = sCRemoveBillRsp;
            sCRemoveBillRsp.initFields();
        }

        public static SCRemoveBillRsp parseFrom(ByteString byteString) {
            return (SCRemoveBillRsp) PARSER.parseFrom(byteString);
        }

        public static SCRemoveBillRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCRemoveBillRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCRemoveBillRsp parseFrom(byte[] bArr) {
            return (SCRemoveBillRsp) PARSER.parseFrom(bArr);
        }

        public static SCRemoveBillRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCRemoveBillRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCRemoveBillRsp parseFrom(InputStream inputStream) {
            return (SCRemoveBillRsp) PARSER.parseFrom(inputStream);
        }

        public static SCRemoveBillRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCRemoveBillRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCRemoveBillRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCRemoveBillRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCRemoveBillRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCRemoveBillRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCRemoveBillRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCRemoveBillRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCRemoveBillRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCRemoveBillRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCRemoveBillRsp sCRemoveBillRsp) {
            return newBuilder().mergeFrom(sCRemoveBillRsp);
        }
    }

    public interface SNGBillInfoNetOrBuilder extends MessageOrBuilder {
        int getBOwnerDeleted();

        int getBPrivateRoom();

        CREATE_ROOM_TYPE getECreateRoomType();

        SNG_ROOM_TYPE getESNGRoomType();

        int getIBlindInterval();

        int getIGameRoomUserMaxNums();

        long getLBillID();

        long getLCreateTime();

        long getLFromRoomID();

        long getLLeagueID();

        long getLMaxPot();

        long getLOriginalStacks();

        long getLTotalGameNum();

        String getSFromText();

        ByteString getSFromTextBytes();

        String getSLeagueName();

        ByteString getSLeagueNameBytes();

        String getSPlayName();

        ByteString getSPlayNameBytes();

        UserBaseInfoNet getStCreateUserBaseInfo();

        UserBaseInfoNetOrBuilder getStCreateUserBaseInfoOrBuilder();

        UserBillInfoNet getVUserBillInfos(int i);

        int getVUserBillInfosCount();

        List<UserBillInfoNet> getVUserBillInfosList();

        UserBillInfoNetOrBuilder getVUserBillInfosOrBuilder(int i);

        List<? extends UserBillInfoNetOrBuilder> getVUserBillInfosOrBuilderList();

        boolean hasBOwnerDeleted();

        boolean hasBPrivateRoom();

        boolean hasECreateRoomType();

        boolean hasESNGRoomType();

        boolean hasIBlindInterval();

        boolean hasIGameRoomUserMaxNums();

        boolean hasLBillID();

        boolean hasLCreateTime();

        boolean hasLFromRoomID();

        boolean hasLLeagueID();

        boolean hasLMaxPot();

        boolean hasLOriginalStacks();

        boolean hasLTotalGameNum();

        boolean hasSFromText();

        boolean hasSLeagueName();

        boolean hasSPlayName();

        boolean hasStCreateUserBaseInfo();
    }

    public static final class SNGBillInfoNet extends GeneratedMessage implements SNGBillInfoNetOrBuilder {
        public static final int BOWNERDELETED_FIELD_NUMBER = 2;
        public static final int BPRIVATEROOM_FIELD_NUMBER = 10;
        public static final int ECREATEROOMTYPE_FIELD_NUMBER = 7;
        public static final int ESNGROOMTYPE_FIELD_NUMBER = 14;
        public static final int IBLINDINTERVAL_FIELD_NUMBER = 12;
        public static final int IGAMEROOMUSERMAXNUMS_FIELD_NUMBER = 13;
        public static final int LBILLID_FIELD_NUMBER = 1;
        public static final int LCREATETIME_FIELD_NUMBER = 5;
        public static final int LFROMROOMID_FIELD_NUMBER = 8;
        public static final int LLEAGUEID_FIELD_NUMBER = 17;
        public static final int LMAXPOT_FIELD_NUMBER = 15;
        public static final int LORIGINALSTACKS_FIELD_NUMBER = 11;
        public static final int LTOTALGAMENUM_FIELD_NUMBER = 16;
        public static Parser<SNGBillInfoNet> PARSER = null;
        public static final int SFROMTEXT_FIELD_NUMBER = 6;
        public static final int SLEAGUENAME_FIELD_NUMBER = 18;
        public static final int SPLAYNAME_FIELD_NUMBER = 3;
        public static final int STCREATEUSERBASEINFO_FIELD_NUMBER = 4;
        public static final int VUSERBILLINFOS_FIELD_NUMBER = 9;
        private static final SNGBillInfoNet defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bOwnerDeleted_;
        private int bPrivateRoom_;
        private int bitField0_;
        private CREATE_ROOM_TYPE eCreateRoomType_;
        private SNG_ROOM_TYPE eSNGRoomType_;
        private int iBlindInterval_;
        private int iGameRoomUserMaxNums_;
        private long lBillID_;
        private long lCreateTime_;
        private long lFromRoomID_;
        private long lLeagueID_;
        private long lMaxPot_;
        private long lOriginalStacks_;
        private long lTotalGameNum_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sFromText_;
        private Object sLeagueName_;
        private Object sPlayName_;
        private UserBaseInfoNet stCreateUserBaseInfo_;
        private final UnknownFieldSet unknownFields;
        private List<UserBillInfoNet> vUserBillInfos_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpBill.SNGBillInfoNet.1 */
        class C01751 extends AbstractParser<SNGBillInfoNet> {
            static {
                fixHelper.fixfunc(new int[]{23977, 23978});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01751();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SNGBillInfoNetOrBuilder {
            private int bOwnerDeleted_;
            private int bPrivateRoom_;
            private int bitField0_;
            private CREATE_ROOM_TYPE eCreateRoomType_;
            private SNG_ROOM_TYPE eSNGRoomType_;
            private int iBlindInterval_;
            private int iGameRoomUserMaxNums_;
            private long lBillID_;
            private long lCreateTime_;
            private long lFromRoomID_;
            private long lLeagueID_;
            private long lMaxPot_;
            private long lOriginalStacks_;
            private long lTotalGameNum_;
            private Object sFromText_;
            private Object sLeagueName_;
            private Object sPlayName_;
            private SingleFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> stCreateUserBaseInfoBuilder_;
            private UserBaseInfoNet stCreateUserBaseInfo_;
            private RepeatedFieldBuilder<UserBillInfoNet, Builder, UserBillInfoNetOrBuilder> vUserBillInfosBuilder_;
            private List<UserBillInfoNet> vUserBillInfos_;

            static {
                fixHelper.fixfunc(new int[]{27761, 27762, 27763, 27764, 27765, 27766, 27767, 27768, 27769, 27770, 27771, 27772, 27773, 27774, 27775, 27776, 27777, 27778, 27779, 27780, 27781, 27782, 27783, 27784, 27785, 27786, 27787, 27788, 27789, 27790, 27791, 27792, 27793, 27794, 27795, 27796, 27797, 27798, 27799, 27800, 27801, 27802, 27803, 27804, 27805, 27806, 27807, 27808, 27809, 27810, 27811, 27812, 27813, 27814, 27815, 27816, 27817, 27818, 27819, 27820, 27821, 27822, 27823, 27824, 27825, 27826, 27827, 27828, 27829, 27830, 27831, 27832, 27833, 27834, 27835, 27836, 27837, 27838, 27839, 27840, 27841, 27842, 27843, 27844, 27845, 27846, 27847, 27848, 27849, 27850, 27851, 27852, 27853, 27854, 27855, 27856, 27857, 27858, 27859, 27860, 27861, 27862, 27863, 27864, 27865, 27866, 27867, 27868, 27869, 27870, 27871, 27872, 27873, 27874, 27875, 27876, 27877, 27878, 27879, 27880, 27881, 27882, 27883, 27884, 27885, 27886, 27887, 27888, 27889, 27890, 27891});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVUserBillInfosIsMutable();

            private native SingleFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> getStCreateUserBaseInfoFieldBuilder();

            private native RepeatedFieldBuilder<UserBillInfoNet, Builder, UserBillInfoNetOrBuilder> getVUserBillInfosFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVUserBillInfos(Iterable<? extends UserBillInfoNet> iterable);

            public final native Builder addVUserBillInfos(int i, Builder builder);

            public final native Builder addVUserBillInfos(int i, UserBillInfoNet userBillInfoNet);

            public final native Builder addVUserBillInfos(Builder builder);

            public final native Builder addVUserBillInfos(UserBillInfoNet userBillInfoNet);

            public final native Builder addVUserBillInfosBuilder();

            public final native Builder addVUserBillInfosBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3141build();

            public final native SNGBillInfoNet m3142build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3143buildPartial();

            public final native SNGBillInfoNet m3144buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3145clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3146clear();

            public final native Builder m3147clear();

            public final native Builder clearBOwnerDeleted();

            public final native Builder clearBPrivateRoom();

            public final native Builder clearECreateRoomType();

            public final native Builder clearESNGRoomType();

            public final native Builder clearIBlindInterval();

            public final native Builder clearIGameRoomUserMaxNums();

            public final native Builder clearLBillID();

            public final native Builder clearLCreateTime();

            public final native Builder clearLFromRoomID();

            public final native Builder clearLLeagueID();

            public final native Builder clearLMaxPot();

            public final native Builder clearLOriginalStacks();

            public final native Builder clearLTotalGameNum();

            public final native Builder clearSFromText();

            public final native Builder clearSLeagueName();

            public final native Builder clearSPlayName();

            public final native Builder clearStCreateUserBaseInfo();

            public final native Builder clearVUserBillInfos();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3148clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3149clone();

            public final native Builder m3150clone();

            public final native int getBOwnerDeleted();

            public final native int getBPrivateRoom();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3151getDefaultInstanceForType();

            public final native SNGBillInfoNet m3152getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native CREATE_ROOM_TYPE getECreateRoomType();

            public final native SNG_ROOM_TYPE getESNGRoomType();

            public final native int getIBlindInterval();

            public final native int getIGameRoomUserMaxNums();

            public final native long getLBillID();

            public final native long getLCreateTime();

            public final native long getLFromRoomID();

            public final native long getLLeagueID();

            public final native long getLMaxPot();

            public final native long getLOriginalStacks();

            public final native long getLTotalGameNum();

            public final native String getSFromText();

            public final native ByteString getSFromTextBytes();

            public final native String getSLeagueName();

            public final native ByteString getSLeagueNameBytes();

            public final native String getSPlayName();

            public final native ByteString getSPlayNameBytes();

            public final native UserBaseInfoNet getStCreateUserBaseInfo();

            public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder getStCreateUserBaseInfoBuilder();

            public final native UserBaseInfoNetOrBuilder getStCreateUserBaseInfoOrBuilder();

            public final native UserBillInfoNet getVUserBillInfos(int i);

            public final native Builder getVUserBillInfosBuilder(int i);

            public final native List<Builder> getVUserBillInfosBuilderList();

            public final native int getVUserBillInfosCount();

            public final native List<UserBillInfoNet> getVUserBillInfosList();

            public final native UserBillInfoNetOrBuilder getVUserBillInfosOrBuilder(int i);

            public final native List<? extends UserBillInfoNetOrBuilder> getVUserBillInfosOrBuilderList();

            public final native boolean hasBOwnerDeleted();

            public final native boolean hasBPrivateRoom();

            public final native boolean hasECreateRoomType();

            public final native boolean hasESNGRoomType();

            public final native boolean hasIBlindInterval();

            public final native boolean hasIGameRoomUserMaxNums();

            public final native boolean hasLBillID();

            public final native boolean hasLCreateTime();

            public final native boolean hasLFromRoomID();

            public final native boolean hasLLeagueID();

            public final native boolean hasLMaxPot();

            public final native boolean hasLOriginalStacks();

            public final native boolean hasLTotalGameNum();

            public final native boolean hasSFromText();

            public final native boolean hasSLeagueName();

            public final native boolean hasSPlayName();

            public final native boolean hasStCreateUserBaseInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3153mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3154mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3155mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3156mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3157mergeFrom(Message message);

            public final native Builder mergeFrom(SNGBillInfoNet sNGBillInfoNet);

            public final native Builder mergeStCreateUserBaseInfo(UserBaseInfoNet userBaseInfoNet);

            public final native Builder removeVUserBillInfos(int i);

            public final native Builder setBOwnerDeleted(int i);

            public final native Builder setBPrivateRoom(int i);

            public final native Builder setECreateRoomType(CREATE_ROOM_TYPE create_room_type);

            public final native Builder setESNGRoomType(SNG_ROOM_TYPE sng_room_type);

            public final native Builder setIBlindInterval(int i);

            public final native Builder setIGameRoomUserMaxNums(int i);

            public final native Builder setLBillID(long j);

            public final native Builder setLCreateTime(long j);

            public final native Builder setLFromRoomID(long j);

            public final native Builder setLLeagueID(long j);

            public final native Builder setLMaxPot(long j);

            public final native Builder setLOriginalStacks(long j);

            public final native Builder setLTotalGameNum(long j);

            public final native Builder setSFromText(String str);

            public final native Builder setSFromTextBytes(ByteString byteString);

            public final native Builder setSLeagueName(String str);

            public final native Builder setSLeagueNameBytes(ByteString byteString);

            public final native Builder setSPlayName(String str);

            public final native Builder setSPlayNameBytes(ByteString byteString);

            public final native Builder setStCreateUserBaseInfo(com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

            public final native Builder setStCreateUserBaseInfo(UserBaseInfoNet userBaseInfoNet);

            public final native Builder setVUserBillInfos(int i, Builder builder);

            public final native Builder setVUserBillInfos(int i, UserBillInfoNet userBillInfoNet);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpBill.f102g;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{25105, 25106, 25107, 25108, 25109, 25110, 25111, 25112, 25113, 25114, 25115, 25116, 25117, 25118, 25119, 25120, 25121, 25122, 25123, 25124, 25125, 25126, 25127, 25128, 25129, 25130, 25131, 25132, 25133, 25134, 25135, 25136, 25137, 25138, 25139, 25140, 25141, 25142, 25143, 25144, 25145, 25146, 25147, 25148, 25149, 25150, 25151, 25152, 25153, 25154, 25155, 25156, 25157, 25158, 25159, 25160, 25161, 25162, 25163, 25164, 25165, 25166, 25167, 25168, 25169, 25170, 25171});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SNGBillInfoNet(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SNGBillInfoNet(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SNGBillInfoNet sNGBillInfoNet);

        private native SNGBillInfoNet(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SNGBillInfoNet(com.google.protobuf.GeneratedMessage.Builder builder, SNGBillInfoNet sNGBillInfoNet);

        private native SNGBillInfoNet(boolean z);

        private native void initFields();

        public final native int getBOwnerDeleted();

        public final native int getBPrivateRoom();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3134getDefaultInstanceForType();

        public final native SNGBillInfoNet m3135getDefaultInstanceForType();

        public final native CREATE_ROOM_TYPE getECreateRoomType();

        public final native SNG_ROOM_TYPE getESNGRoomType();

        public final native int getIBlindInterval();

        public final native int getIGameRoomUserMaxNums();

        public final native long getLBillID();

        public final native long getLCreateTime();

        public final native long getLFromRoomID();

        public final native long getLLeagueID();

        public final native long getLMaxPot();

        public final native long getLOriginalStacks();

        public final native long getLTotalGameNum();

        public final native Parser<SNGBillInfoNet> getParserForType();

        public final native String getSFromText();

        public final native ByteString getSFromTextBytes();

        public final native String getSLeagueName();

        public final native ByteString getSLeagueNameBytes();

        public final native String getSPlayName();

        public final native ByteString getSPlayNameBytes();

        public final native int getSerializedSize();

        public final native UserBaseInfoNet getStCreateUserBaseInfo();

        public final native UserBaseInfoNetOrBuilder getStCreateUserBaseInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native UserBillInfoNet getVUserBillInfos(int i);

        public final native int getVUserBillInfosCount();

        public final native List<UserBillInfoNet> getVUserBillInfosList();

        public final native UserBillInfoNetOrBuilder getVUserBillInfosOrBuilder(int i);

        public final native List<? extends UserBillInfoNetOrBuilder> getVUserBillInfosOrBuilderList();

        public final native boolean hasBOwnerDeleted();

        public final native boolean hasBPrivateRoom();

        public final native boolean hasECreateRoomType();

        public final native boolean hasESNGRoomType();

        public final native boolean hasIBlindInterval();

        public final native boolean hasIGameRoomUserMaxNums();

        public final native boolean hasLBillID();

        public final native boolean hasLCreateTime();

        public final native boolean hasLFromRoomID();

        public final native boolean hasLLeagueID();

        public final native boolean hasLMaxPot();

        public final native boolean hasLOriginalStacks();

        public final native boolean hasLTotalGameNum();

        public final native boolean hasSFromText();

        public final native boolean hasSLeagueName();

        public final native boolean hasSPlayName();

        public final native boolean hasStCreateUserBaseInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3136newBuilderForType();

        public final native Builder m3137newBuilderForType();

        protected final native Builder m3138newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3139toBuilder();

        public final native Builder m3140toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SNGBillInfoNet getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpBill.f102g;
        }

        static void __clinit__() {
            PARSER = new C01751();
            SNGBillInfoNet sNGBillInfoNet = new SNGBillInfoNet(true);
            defaultInstance = sNGBillInfoNet;
            sNGBillInfoNet.initFields();
        }

        public static SNGBillInfoNet parseFrom(ByteString byteString) {
            return (SNGBillInfoNet) PARSER.parseFrom(byteString);
        }

        public static SNGBillInfoNet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SNGBillInfoNet) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SNGBillInfoNet parseFrom(byte[] bArr) {
            return (SNGBillInfoNet) PARSER.parseFrom(bArr);
        }

        public static SNGBillInfoNet parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SNGBillInfoNet) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SNGBillInfoNet parseFrom(InputStream inputStream) {
            return (SNGBillInfoNet) PARSER.parseFrom(inputStream);
        }

        public static SNGBillInfoNet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SNGBillInfoNet) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SNGBillInfoNet parseDelimitedFrom(InputStream inputStream) {
            return (SNGBillInfoNet) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SNGBillInfoNet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SNGBillInfoNet) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SNGBillInfoNet parseFrom(CodedInputStream codedInputStream) {
            return (SNGBillInfoNet) PARSER.parseFrom(codedInputStream);
        }

        public static SNGBillInfoNet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SNGBillInfoNet) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SNGBillInfoNet sNGBillInfoNet) {
            return newBuilder().mergeFrom(sNGBillInfoNet);
        }
    }

    public interface ShareBillInfoNetOrBuilder extends MessageOrBuilder {
        long getLShareUuid();

        BillInfoNet getStBillInfo();

        BillInfoNetOrBuilder getStBillInfoOrBuilder();

        boolean hasLShareUuid();

        boolean hasStBillInfo();
    }

    public static final class ShareBillInfoNet extends GeneratedMessage implements ShareBillInfoNetOrBuilder {
        public static final int LSHAREUUID_FIELD_NUMBER = 2;
        public static Parser<ShareBillInfoNet> PARSER = null;
        public static final int STBILLINFO_FIELD_NUMBER = 1;
        private static final ShareBillInfoNet defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lShareUuid_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private BillInfoNet stBillInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpBill.ShareBillInfoNet.1 */
        class C01761 extends AbstractParser<ShareBillInfoNet> {
            static {
                fixHelper.fixfunc(new int[]{4903, 4904});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01761();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements ShareBillInfoNetOrBuilder {
            private int bitField0_;
            private long lShareUuid_;
            private SingleFieldBuilder<BillInfoNet, Builder, BillInfoNetOrBuilder> stBillInfoBuilder_;
            private BillInfoNet stBillInfo_;

            static {
                fixHelper.fixfunc(new int[]{28631, 28632, 28633, 28634, 28635, 28636, 28637, 28638, 28639, 28640, 28641, 28642, 28643, 28644, 28645, 28646, 28647, 28648, 28649, 28650, 28651, 28652, 28653, 28654, 28655, 28656, 28657, 28658, 28659, 28660, 28661, 28662, 28663, 28664, 28665, 28666, 28667, 28668, 28669, 28670, 28671, 28672, 28673, 28674, 28675});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<BillInfoNet, Builder, BillInfoNetOrBuilder> getStBillInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3165build();

            public final native ShareBillInfoNet m3166build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3167buildPartial();

            public final native ShareBillInfoNet m3168buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3169clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3170clear();

            public final native Builder m3171clear();

            public final native Builder clearLShareUuid();

            public final native Builder clearStBillInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3172clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3173clone();

            public final native Builder m3174clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3175getDefaultInstanceForType();

            public final native ShareBillInfoNet m3176getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLShareUuid();

            public final native BillInfoNet getStBillInfo();

            public final native Builder getStBillInfoBuilder();

            public final native BillInfoNetOrBuilder getStBillInfoOrBuilder();

            public final native boolean hasLShareUuid();

            public final native boolean hasStBillInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3177mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3178mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3179mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3180mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3181mergeFrom(Message message);

            public final native Builder mergeFrom(ShareBillInfoNet shareBillInfoNet);

            public final native Builder mergeStBillInfo(BillInfoNet billInfoNet);

            public final native Builder setLShareUuid(long j);

            public final native Builder setStBillInfo(Builder builder);

            public final native Builder setStBillInfo(BillInfoNet billInfoNet);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpBill.f104i;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{12132, 12133, 12134, 12135, 12136, 12137, 12138, 12139, 12140, 12141, 12142, 12143, 12144, 12145, 12146, 12147, 12148, 12149, 12150, 12151, 12152, 12153, 12154, 12155, 12156, 12157, 12158, 12159, 12160});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native ShareBillInfoNet(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ ShareBillInfoNet(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, ShareBillInfoNet shareBillInfoNet);

        private native ShareBillInfoNet(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ ShareBillInfoNet(com.google.protobuf.GeneratedMessage.Builder builder, ShareBillInfoNet shareBillInfoNet);

        private native ShareBillInfoNet(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3158getDefaultInstanceForType();

        public final native ShareBillInfoNet m3159getDefaultInstanceForType();

        public final native long getLShareUuid();

        public final native Parser<ShareBillInfoNet> getParserForType();

        public final native int getSerializedSize();

        public final native BillInfoNet getStBillInfo();

        public final native BillInfoNetOrBuilder getStBillInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasLShareUuid();

        public final native boolean hasStBillInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3160newBuilderForType();

        public final native Builder m3161newBuilderForType();

        protected final native Builder m3162newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3163toBuilder();

        public final native Builder m3164toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static ShareBillInfoNet getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpBill.f104i;
        }

        static void __clinit__() {
            PARSER = new C01761();
            ShareBillInfoNet shareBillInfoNet = new ShareBillInfoNet(true);
            defaultInstance = shareBillInfoNet;
            shareBillInfoNet.initFields();
        }

        public static ShareBillInfoNet parseFrom(ByteString byteString) {
            return (ShareBillInfoNet) PARSER.parseFrom(byteString);
        }

        public static ShareBillInfoNet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareBillInfoNet) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ShareBillInfoNet parseFrom(byte[] bArr) {
            return (ShareBillInfoNet) PARSER.parseFrom(bArr);
        }

        public static ShareBillInfoNet parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareBillInfoNet) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ShareBillInfoNet parseFrom(InputStream inputStream) {
            return (ShareBillInfoNet) PARSER.parseFrom(inputStream);
        }

        public static ShareBillInfoNet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareBillInfoNet) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static ShareBillInfoNet parseDelimitedFrom(InputStream inputStream) {
            return (ShareBillInfoNet) PARSER.parseDelimitedFrom(inputStream);
        }

        public static ShareBillInfoNet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareBillInfoNet) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static ShareBillInfoNet parseFrom(CodedInputStream codedInputStream) {
            return (ShareBillInfoNet) PARSER.parseFrom(codedInputStream);
        }

        public static ShareBillInfoNet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareBillInfoNet) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(ShareBillInfoNet shareBillInfoNet) {
            return newBuilder().mergeFrom(shareBillInfoNet);
        }
    }

    public interface UserBillInfoNetOrBuilder extends MessageOrBuilder {
        long getISngRank();

        long getLClubID();

        long getLInsuranceBuyin();

        long getLInsuranceGetStacks();

        long getLRemainBuyStacks();

        long getLTotalBuyStacks();

        String getSClubName();

        ByteString getSClubNameBytes();

        long getUuid();

        boolean hasISngRank();

        boolean hasLClubID();

        boolean hasLInsuranceBuyin();

        boolean hasLInsuranceGetStacks();

        boolean hasLRemainBuyStacks();

        boolean hasLTotalBuyStacks();

        boolean hasSClubName();

        boolean hasUuid();
    }

    public static final class UserBillInfoNet extends GeneratedMessage implements UserBillInfoNetOrBuilder {
        public static final int ISNGRANK_FIELD_NUMBER = 4;
        public static final int LCLUBID_FIELD_NUMBER = 7;
        public static final int LINSURANCEBUYIN_FIELD_NUMBER = 5;
        public static final int LINSURANCEGETSTACKS_FIELD_NUMBER = 6;
        public static final int LREMAINBUYSTACKS_FIELD_NUMBER = 3;
        public static final int LTOTALBUYSTACKS_FIELD_NUMBER = 2;
        public static Parser<UserBillInfoNet> PARSER = null;
        public static final int SCLUBNAME_FIELD_NUMBER = 8;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final UserBillInfoNet defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long iSngRank_;
        private long lClubID_;
        private long lInsuranceBuyin_;
        private long lInsuranceGetStacks_;
        private long lRemainBuyStacks_;
        private long lTotalBuyStacks_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sClubName_;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpBill.UserBillInfoNet.1 */
        class C01771 extends AbstractParser<UserBillInfoNet> {
            static {
                fixHelper.fixfunc(new int[]{29118, 29119});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01771();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements UserBillInfoNetOrBuilder {
            private int bitField0_;
            private long iSngRank_;
            private long lClubID_;
            private long lInsuranceBuyin_;
            private long lInsuranceGetStacks_;
            private long lRemainBuyStacks_;
            private long lTotalBuyStacks_;
            private Object sClubName_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{6132, 6133, 6134, 6135, 6136, 6137, 6138, 6139, 6140, 6141, 6142, 6143, 6144, 6145, 6146, 6147, 6148, 6149, 6150, 6151, 6152, 6153, 6154, 6155, 6156, 6157, 6158, 6159, 6160, 6161, 6162, 6163, 6164, 6165, 6166, 6167, 6168, 6169, 6170, 6171, 6172, 6173, 6174, 6175, 6176, 6177, 6178, 6179, 6180, 6181, 6182, 6183, 6184, 6185, 6186, 6187, 6188, 6189, 6190, 6191, 6192, 6193, 6194, 6195, 6196, 6197});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3189build();

            public final native UserBillInfoNet m3190build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3191buildPartial();

            public final native UserBillInfoNet m3192buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3193clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3194clear();

            public final native Builder m3195clear();

            public final native Builder clearISngRank();

            public final native Builder clearLClubID();

            public final native Builder clearLInsuranceBuyin();

            public final native Builder clearLInsuranceGetStacks();

            public final native Builder clearLRemainBuyStacks();

            public final native Builder clearLTotalBuyStacks();

            public final native Builder clearSClubName();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3196clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3197clone();

            public final native Builder m3198clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3199getDefaultInstanceForType();

            public final native UserBillInfoNet m3200getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getISngRank();

            public final native long getLClubID();

            public final native long getLInsuranceBuyin();

            public final native long getLInsuranceGetStacks();

            public final native long getLRemainBuyStacks();

            public final native long getLTotalBuyStacks();

            public final native String getSClubName();

            public final native ByteString getSClubNameBytes();

            public final native long getUuid();

            public final native boolean hasISngRank();

            public final native boolean hasLClubID();

            public final native boolean hasLInsuranceBuyin();

            public final native boolean hasLInsuranceGetStacks();

            public final native boolean hasLRemainBuyStacks();

            public final native boolean hasLTotalBuyStacks();

            public final native boolean hasSClubName();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3201mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3202mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3203mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3204mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3205mergeFrom(Message message);

            public final native Builder mergeFrom(UserBillInfoNet userBillInfoNet);

            public final native Builder setISngRank(long j);

            public final native Builder setLClubID(long j);

            public final native Builder setLInsuranceBuyin(long j);

            public final native Builder setLInsuranceGetStacks(long j);

            public final native Builder setLRemainBuyStacks(long j);

            public final native Builder setLTotalBuyStacks(long j);

            public final native Builder setSClubName(String str);

            public final native Builder setSClubNameBytes(ByteString byteString);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpBill.f98c;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{27127, 27128, 27129, 27130, 27131, 27132, 27133, 27134, 27135, 27136, 27137, 27138, 27139, 27140, 27141, 27142, 27143, 27144, 27145, 27146, 27147, 27148, 27149, 27150, 27151, 27152, 27153, 27154, 27155, 27156, 27157, 27158, 27159, 27160, 27161, 27162, 27163, 27164, 27165, 27166, 27167});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native UserBillInfoNet(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ UserBillInfoNet(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, UserBillInfoNet userBillInfoNet);

        private native UserBillInfoNet(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ UserBillInfoNet(com.google.protobuf.GeneratedMessage.Builder builder, UserBillInfoNet userBillInfoNet);

        private native UserBillInfoNet(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3182getDefaultInstanceForType();

        public final native UserBillInfoNet m3183getDefaultInstanceForType();

        public final native long getISngRank();

        public final native long getLClubID();

        public final native long getLInsuranceBuyin();

        public final native long getLInsuranceGetStacks();

        public final native long getLRemainBuyStacks();

        public final native long getLTotalBuyStacks();

        public final native Parser<UserBillInfoNet> getParserForType();

        public final native String getSClubName();

        public final native ByteString getSClubNameBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasISngRank();

        public final native boolean hasLClubID();

        public final native boolean hasLInsuranceBuyin();

        public final native boolean hasLInsuranceGetStacks();

        public final native boolean hasLRemainBuyStacks();

        public final native boolean hasLTotalBuyStacks();

        public final native boolean hasSClubName();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3184newBuilderForType();

        public final native Builder m3185newBuilderForType();

        protected final native Builder m3186newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3187toBuilder();

        public final native Builder m3188toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static UserBillInfoNet getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpBill.f98c;
        }

        static void __clinit__() {
            PARSER = new C01771();
            UserBillInfoNet userBillInfoNet = new UserBillInfoNet(true);
            defaultInstance = userBillInfoNet;
            userBillInfoNet.initFields();
        }

        public static UserBillInfoNet parseFrom(ByteString byteString) {
            return (UserBillInfoNet) PARSER.parseFrom(byteString);
        }

        public static UserBillInfoNet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (UserBillInfoNet) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UserBillInfoNet parseFrom(byte[] bArr) {
            return (UserBillInfoNet) PARSER.parseFrom(bArr);
        }

        public static UserBillInfoNet parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (UserBillInfoNet) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UserBillInfoNet parseFrom(InputStream inputStream) {
            return (UserBillInfoNet) PARSER.parseFrom(inputStream);
        }

        public static UserBillInfoNet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserBillInfoNet) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static UserBillInfoNet parseDelimitedFrom(InputStream inputStream) {
            return (UserBillInfoNet) PARSER.parseDelimitedFrom(inputStream);
        }

        public static UserBillInfoNet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserBillInfoNet) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static UserBillInfoNet parseFrom(CodedInputStream codedInputStream) {
            return (UserBillInfoNet) PARSER.parseFrom(codedInputStream);
        }

        public static UserBillInfoNet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserBillInfoNet) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(UserBillInfoNet userBillInfoNet) {
            return newBuilder().mergeFrom(userBillInfoNet);
        }
    }

    public static FileDescriptor m99a() {
        return f95C;
    }

    static {
        FileDescriptor[] fileDescriptorArr = new FileDescriptor[]{TexasPokerCommon.m11a()};
        FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0018TexasPokerHttpBill.proto\u0012\ntexaspoker\u001a\u0016TexasPokerCommon.proto\"\u00cf\u0002\n\u0019GameUserStatisticsInfoNet\u0012\u0012\n\nlTotalHand\u0018\u0001 \u0002(\u0003\u0012\u0016\n\u000elTotalJoinHand\u0018\u0002 \u0002(\u0003\u0012\u0011\n\tlTotalWin\u0018\u0003 \u0002(\u0003\u0012\u0016\n\u000elCountJoinFlop\u0018\u0004 \u0002(\u0003\u0012\u0016\n\u000elCountJoinTurn\u0018\u0005 \u0002(\u0003\u0012\u0017\n\u000flCountJoinRiver\u0018\u0006 \u0002(\u0003\u0012\u001d\n\u0015lCountShowdownFlopWin\u0018\u0007 \u0002(\u0003\u0012\u001d\n\u0015lCountShowdownTurnWin\u0018\b \u0002(\u0003\u0012\u001e\n\u0016lCountShowdownRiverWin\u0018\t \u0002(\u0003\u0012\u001d\n\u0015lCountShowdownWinShow\u0018\n \u0002(\u0003\u0012\u001a\n\u0012lCountShowdownShow\u0018\u000b \u0002(\u0003\u0012\u0011\n\tlGameGain\u0018\f \u0002(\u0003", "\"\u00be\u0001\n\u000fUserBillInfoNet\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0017\n\u000flTotalBuyStacks\u0018\u0002 \u0001(\u0003\u0012\u0018\n\u0010lRemainBuyStacks\u0018\u0003 \u0001(\u0003\u0012\u0010\n\biSngRank\u0018\u0004 \u0001(\u0003\u0012\u0017\n\u000flInsuranceBuyin\u0018\u0005 \u0001(\u0003\u0012\u001b\n\u0013lInsuranceGetStacks\u0018\u0006 \u0001(\u0003\u0012\u000f\n\u0007lClubID\u0018\u0007 \u0001(\u0003\u0012\u0011\n\tsClubName\u0018\b \u0001(\t\"\u00ef\u0004\n\u0011NormalBillInfoNet\u0012\u000f\n\u0007lBillID\u0018\u0001 \u0002(\u0003\u0012\u0015\n\rbOwnerDeleted\u0018\u0002 \u0001(\u0005\u0012\u0011\n\tsPlayName\u0018\u0003 \u0001(\t\u00129\n\u0014stCreateUserBaseInfo\u0018\u0004 \u0001(\u000b2\u001b.texaspoker.UserBaseInfoNet\u0012\u0013\n\u000blCreateTime\u0018\u0005 \u0001(\u0003\u0012\u0011\n\tlDuration\u0018\u0006 \u0001(\u0003\u0012\u0013\n\u000blSmallBlind\u0018\u0007 \u0001(\u0003\u0012\u0011\n\tlB", "igBlind\u0018\b \u0001(\u0003\u0012\u000e\n\u0006lBuyin\u0018\t \u0001(\u0003\u0012\u0013\n\u000blTotalBuyin\u0018\n \u0001(\u0003\u0012\u0015\n\rlTotalGameNum\u0018\u000b \u0001(\u0003\u0012\u000f\n\u0007lMaxPot\u0018\f \u0001(\u0003\u00123\n\u000evUserBillInfos\u0018\r \u0003(\u000b2\u001b.texaspoker.UserBillInfoNet\u0012\u0011\n\tsFromText\u0018\u000e \u0001(\t\u00125\n\u000feCreateRoomType\u0018\u000f \u0001(\u000e2\u001c.texaspoker.CREATE_ROOM_TYPE\u0012\u0013\n\u000blFromRoomID\u0018\u0010 \u0001(\u0003\u0012\u001c\n\u0014iGameRoomUserMaxNums\u0018\u0011 \u0001(\u0005\u0012J\n\u001bstGameUserStatisticsInfoNet\u0018\u0012 \u0001(\u000b2%.texaspoker.GameUserStatisticsInfoNet\u0012\r\n\u0005iAnte\u0018\u0013 \u0001(\u0005\u0012\u0012\n\nbInsurance\u0018\u0014 \u0001(\u0005\u0012\u0011\n\tlLeagueID\u0018\u0015 \u0001(\u0003\u0012\u0013", "\n\u000bsLeagueName\u0018\u0016 \u0001(\t\"\u0095\u0004\n\u000eSNGBillInfoNet\u0012\u000f\n\u0007lBillID\u0018\u0001 \u0002(\u0003\u0012\u0015\n\rbOwnerDeleted\u0018\u0002 \u0001(\u0005\u0012\u0011\n\tsPlayName\u0018\u0003 \u0001(\t\u00129\n\u0014stCreateUserBaseInfo\u0018\u0004 \u0001(\u000b2\u001b.texaspoker.UserBaseInfoNet\u0012\u0013\n\u000blCreateTime\u0018\u0005 \u0001(\u0003\u0012\u0011\n\tsFromText\u0018\u0006 \u0001(\t\u00125\n\u000feCreateRoomType\u0018\u0007 \u0001(\u000e2\u001c.texaspoker.CREATE_ROOM_TYPE\u0012\u0013\n\u000blFromRoomID\u0018\b \u0001(\u0003\u00123\n\u000evUserBillInfos\u0018\t \u0003(\u000b2\u001b.texaspoker.UserBillInfoNet\u0012\u0014\n\fbPrivateRoom\u0018\n \u0001(\u0005\u0012\u0017\n\u000flOriginalStacks\u0018\u000b \u0001(\u0003\u0012\u0016\n\u000eiBlindInterval\u0018\f \u0001(\u0005\u0012\u001c\n\u0014", "iGameRoomUserMaxNums\u0018\r \u0001(\u0005\u0012/\n\feSNGRoomType\u0018\u000e \u0001(\u000e2\u0019.texaspoker.SNG_ROOM_TYPE\u0012\u000f\n\u0007lMaxPot\u0018\u000f \u0001(\u0003\u0012\u0015\n\rlTotalGameNum\u0018\u0010 \u0001(\u0003\u0012\u0011\n\tlLeagueID\u0018\u0011 \u0001(\u0003\u0012\u0013\n\u000bsLeagueName\u0018\u0012 \u0001(\t\"S\n\u0010ShareBillInfoNet\u0012+\n\nstBillInfo\u0018\u0001 \u0002(\u000b2\u0017.texaspoker.BillInfoNet\u0012\u0012\n\nlShareUuid\u0018\u0002 \u0001(\u0003\"\u0093\u0002\n\u000bBillInfoNet\u00121\n\reGameRoomType\u0018\u0001 \u0002(\u000e2\u001a.texaspoker.GAME_ROOM_TYPE\u0012:\n\u0013stNormalBillInfoNet\u0018\u0002 \u0001(\u000b2\u001d.texaspoker.NormalBillInfoNet\u00124\n\u0010stSNGBillInfoNet\u0018\u0003 \u0001(\u000b2\u001a.texa", "spoker.SNGBillInfoNet\u0012\u0014\n\fbClubManager\u0018\u0004 \u0001(\u0005\u0012\u0015\n\rsFromClubName\u0018\u0005 \u0001(\t\u0012\u0014\n\fsFromClubUrl\u0018\u0006 \u0001(\t\u0012\u001c\n\u0014sFromClubCreatorName\u0018\u0007 \u0001(\t\"6\n\u0015CSGetBillInfoByRoomID\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007lRoomID\u0018\u0002 \u0001(\u0003\"\u0093\u0002\n\u0018SCGetBillInfoByRoomIDRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012.\n\rstBillInfoNet\u0018\u0002 \u0001(\u000b2\u0017.texaspoker.BillInfoNet\u0012+\n\u0006vPlays\u0018\u0003 \u0003(\u000b2\u001b.texaspoker.UserBaseInfoNet\u00124\n\u000fvStandBysOnline\u0018\u0004 \u0003(\u000b2\u001b.texaspoker.UserBaseInfoNet\u00125\n", "\u0010vStandBysOffline\u0018\u0005 \u0003(\u000b2\u001b.texaspoker.UserBaseInfoNet\"-\n\fCSRemoveBill\u0012\u000f\n\u0007lBillID\u0018\u0001 \u0002(\u0003\u0012\f\n\u0004uuid\u0018\u0002 \u0002(\u0003\"Q\n\u000fSCRemoveBillRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\u000f\n\u0007lBillID\u0018\u0002 \u0001(\u0003\"R\n\u000eCSGetBillInfos\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0013\n\u000blNewestTime\u0018\u0002 \u0001(\u0003\u0012\f\n\u0004iNum\u0018\u0003 \u0001(\u0005\u0012\u000f\n\u0007lClubID\u0018\u0004 \u0001(\u0003\"\u00c5\u0001\n\u0011SCGetBillInfosRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\u0017\n\u000flTotalWinStacks\u0018\u0002 \u0001(\u0003\u0012.\n\rstBillInfoNet\u0018\u0003 \u0003(\u000b2\u0017.texaspoker.Bil", "lInfoNet\u0012\u0012\n\niUnReadNum\u0018\u0004 \u0001(\u0005\u0012\u0013\n\u000blNewestTime\u0018\u0005 \u0001(\u0003\u0012\u000f\n\u0007lClubID\u0018\u0006 \u0001(\u0003\"T\n\u0010CSGetBillInfosV2\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0013\n\u000blNewestTime\u0018\u0002 \u0001(\u0003\u0012\f\n\u0004iNum\u0018\u0003 \u0001(\u0005\u0012\u000f\n\u0007lClubID\u0018\u0004 \u0001(\u0003\"\u00c7\u0001\n\u0013SCGetBillInfosV2Rsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\u0017\n\u000flTotalWinStacks\u0018\u0002 \u0001(\u0003\u0012.\n\rstBillInfoNet\u0018\u0003 \u0003(\u000b2\u0017.texaspoker.BillInfoNet\u0012\u0012\n\niUnReadNum\u0018\u0004 \u0001(\u0005\u0012\u0013\n\u000blNewestTime\u0018\u0005 \u0001(\u0003\u0012\u000f\n\u0007lClubID\u0018\u0006 \u0001(\u0003B+\n\u0015com.texaspoker.momentB\u0012TexasPokerHttpBill"}, fileDescriptorArr, new C01631());
        f96a = (Descriptor) f95C.getMessageTypes().get(0);
        f97b = new FieldAccessorTable(f96a, new String[]{"LTotalHand", "LTotalJoinHand", "LTotalWin", "LCountJoinFlop", "LCountJoinTurn", "LCountJoinRiver", "LCountShowdownFlopWin", "LCountShowdownTurnWin", "LCountShowdownRiverWin", "LCountShowdownWinShow", "LCountShowdownShow", "LGameGain"});
        f98c = (Descriptor) f95C.getMessageTypes().get(1);
        f99d = new FieldAccessorTable(f98c, new String[]{"Uuid", "LTotalBuyStacks", "LRemainBuyStacks", "ISngRank", "LInsuranceBuyin", "LInsuranceGetStacks", "LClubID", "SClubName"});
        f100e = (Descriptor) f95C.getMessageTypes().get(2);
        f101f = new FieldAccessorTable(f100e, new String[]{"LBillID", "BOwnerDeleted", "SPlayName", "StCreateUserBaseInfo", "LCreateTime", "LDuration", "LSmallBlind", "LBigBlind", "LBuyin", "LTotalBuyin", "LTotalGameNum", "LMaxPot", "VUserBillInfos", "SFromText", "ECreateRoomType", "LFromRoomID", "IGameRoomUserMaxNums", "StGameUserStatisticsInfoNet", "IAnte", "BInsurance", "LLeagueID", "SLeagueName"});
        f102g = (Descriptor) f95C.getMessageTypes().get(3);
        f103h = new FieldAccessorTable(f102g, new String[]{"LBillID", "BOwnerDeleted", "SPlayName", "StCreateUserBaseInfo", "LCreateTime", "SFromText", "ECreateRoomType", "LFromRoomID", "VUserBillInfos", "BPrivateRoom", "LOriginalStacks", "IBlindInterval", "IGameRoomUserMaxNums", "ESNGRoomType", "LMaxPot", "LTotalGameNum", "LLeagueID", "SLeagueName"});
        f104i = (Descriptor) f95C.getMessageTypes().get(4);
        f105j = new FieldAccessorTable(f104i, new String[]{"StBillInfo", "LShareUuid"});
        f106k = (Descriptor) f95C.getMessageTypes().get(5);
        f107l = new FieldAccessorTable(f106k, new String[]{"EGameRoomType", "StNormalBillInfoNet", "StSNGBillInfoNet", "BClubManager", "SFromClubName", "SFromClubUrl", "SFromClubCreatorName"});
        f108m = (Descriptor) f95C.getMessageTypes().get(6);
        f109n = new FieldAccessorTable(f108m, new String[]{"Uuid", "LRoomID"});
        f110o = (Descriptor) f95C.getMessageTypes().get(7);
        f111p = new FieldAccessorTable(f110o, new String[]{"EErrCode", "StBillInfoNet", "VPlays", "VStandBysOnline", "VStandBysOffline"});
        f112q = (Descriptor) f95C.getMessageTypes().get(8);
        f113r = new FieldAccessorTable(f112q, new String[]{"LBillID", "Uuid"});
        f114s = (Descriptor) f95C.getMessageTypes().get(9);
        f115t = new FieldAccessorTable(f114s, new String[]{"EErrCode", "LBillID"});
        f116u = (Descriptor) f95C.getMessageTypes().get(10);
        f117v = new FieldAccessorTable(f116u, new String[]{"Uuid", "LNewestTime", "INum", "LClubID"});
        f118w = (Descriptor) f95C.getMessageTypes().get(11);
        f119x = new FieldAccessorTable(f118w, new String[]{"EErrCode", "LTotalWinStacks", "StBillInfoNet", "IUnReadNum", "LNewestTime", "LClubID"});
        f120y = (Descriptor) f95C.getMessageTypes().get(12);
        f121z = new FieldAccessorTable(f120y, new String[]{"Uuid", "LNewestTime", "INum", "LClubID"});
        f93A = (Descriptor) f95C.getMessageTypes().get(13);
        f94B = new FieldAccessorTable(f93A, new String[]{"EErrCode", "LTotalWinStacks", "StBillInfoNet", "IUnReadNum", "LNewestTime", "LClubID"});
        TexasPokerCommon.m11a();
    }
}
