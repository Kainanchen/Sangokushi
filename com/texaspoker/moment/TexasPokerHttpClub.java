package com.texaspoker.moment;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessage.BuilderParent;
import com.google.protobuf.GeneratedMessage.FieldAccessorTable;
import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.RepeatedFieldBuilder;
import com.google.protobuf.SingleFieldBuilder;
import com.google.protobuf.UnknownFieldSet;
import com.texaspoker.moment.TexasPoker.GameRoomBaseInfo;
import com.texaspoker.moment.TexasPoker.GameRoomBaseInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD;
import com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo;
import com.texaspoker.moment.TexasPokerCommon.ClubBaseInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNetOrBuilder;
import com.texaspoker.moment.TexasPokerHttpBill.BillInfoNet;
import com.texaspoker.moment.TexasPokerHttpBill.BillInfoNetOrBuilder;
import java.io.InputStream;
import java.util.List;

public final class TexasPokerHttpClub {
    private static final Descriptor f122A;
    private static FieldAccessorTable f123B;
    private static final Descriptor f124C;
    private static FieldAccessorTable f125D;
    private static final Descriptor f126E;
    private static FieldAccessorTable f127F;
    private static final Descriptor f128G;
    private static FieldAccessorTable f129H;
    private static final Descriptor f130I;
    private static FieldAccessorTable f131J;
    private static final Descriptor f132K;
    private static FieldAccessorTable f133L;
    private static final Descriptor f134M;
    private static FieldAccessorTable f135N;
    private static final Descriptor f136O;
    private static FieldAccessorTable f137P;
    private static final Descriptor f138Q;
    private static FieldAccessorTable f139R;
    private static final Descriptor f140S;
    private static FieldAccessorTable f141T;
    private static final Descriptor f142U;
    private static FieldAccessorTable f143V;
    private static final Descriptor f144W;
    private static FieldAccessorTable f145X;
    private static final Descriptor f146Y;
    private static FieldAccessorTable f147Z;
    private static final Descriptor f148a;
    private static final Descriptor aA;
    private static FieldAccessorTable aB;
    private static final Descriptor aC;
    private static FieldAccessorTable aD;
    private static final Descriptor aE;
    private static FieldAccessorTable aF;
    private static final Descriptor aG;
    private static FieldAccessorTable aH;
    private static final Descriptor aI;
    private static FieldAccessorTable aJ;
    private static final Descriptor aK;
    private static FieldAccessorTable aL;
    private static final Descriptor aM;
    private static FieldAccessorTable aN;
    private static final Descriptor aO;
    private static FieldAccessorTable aP;
    private static final Descriptor aQ;
    private static FieldAccessorTable aR;
    private static final Descriptor aS;
    private static FieldAccessorTable aT;
    private static final Descriptor aU;
    private static FieldAccessorTable aV;
    private static final Descriptor aW;
    private static FieldAccessorTable aX;
    private static final Descriptor aY;
    private static FieldAccessorTable aZ;
    private static final Descriptor aa;
    private static FieldAccessorTable ab;
    private static final Descriptor ac;
    private static FieldAccessorTable ad;
    private static final Descriptor ae;
    private static FieldAccessorTable af;
    private static final Descriptor ag;
    private static FieldAccessorTable ah;
    private static final Descriptor ai;
    private static FieldAccessorTable aj;
    private static final Descriptor ak;
    private static FieldAccessorTable al;
    private static final Descriptor am;
    private static FieldAccessorTable an;
    private static final Descriptor ao;
    private static FieldAccessorTable ap;
    private static final Descriptor aq;
    private static FieldAccessorTable ar;
    private static final Descriptor as;
    private static FieldAccessorTable at;
    private static final Descriptor au;
    private static FieldAccessorTable av;
    private static final Descriptor aw;
    private static FieldAccessorTable ax;
    private static final Descriptor ay;
    private static FieldAccessorTable az;
    private static FieldAccessorTable f149b;
    private static final Descriptor ba;
    private static FieldAccessorTable bb;
    private static final Descriptor bc;
    private static FieldAccessorTable bd;
    private static final Descriptor be;
    private static FieldAccessorTable bf;
    private static final Descriptor bg;
    private static FieldAccessorTable bh;
    private static final Descriptor bi;
    private static FieldAccessorTable bj;
    private static final Descriptor bk;
    private static FieldAccessorTable bl;
    private static FileDescriptor bm;
    private static final Descriptor f150c;
    private static FieldAccessorTable f151d;
    private static final Descriptor f152e;
    private static FieldAccessorTable f153f;
    private static final Descriptor f154g;
    private static FieldAccessorTable f155h;
    private static final Descriptor f156i;
    private static FieldAccessorTable f157j;
    private static final Descriptor f158k;
    private static FieldAccessorTable f159l;
    private static final Descriptor f160m;
    private static FieldAccessorTable f161n;
    private static final Descriptor f162o;
    private static FieldAccessorTable f163p;
    private static final Descriptor f164q;
    private static FieldAccessorTable f165r;
    private static final Descriptor f166s;
    private static FieldAccessorTable f167t;
    private static final Descriptor f168u;
    private static FieldAccessorTable f169v;
    private static final Descriptor f170w;
    private static FieldAccessorTable f171x;
    private static final Descriptor f172y;
    private static FieldAccessorTable f173z;

    /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.1 */
    class C01781 implements InternalDescriptorAssigner {
        static {
            fixHelper.fixfunc(new int[]{24625, 24626});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C01781();

        public final native ExtensionRegistry assignDescriptors(FileDescriptor fileDescriptor);
    }

    public interface AddClubFundSellingItemOrBuilder extends MessageOrBuilder {
        int getIClubSellingItemID();

        long getLAddFund();

        long getLCoin();

        String getSClubSellingItemDetail();

        ByteString getSClubSellingItemDetailBytes();

        String getSClubSellingItemName();

        ByteString getSClubSellingItemNameBytes();

        boolean hasIClubSellingItemID();

        boolean hasLAddFund();

        boolean hasLCoin();

        boolean hasSClubSellingItemDetail();

        boolean hasSClubSellingItemName();
    }

    public static final class AddClubFundSellingItem extends GeneratedMessage implements AddClubFundSellingItemOrBuilder {
        public static final int ICLUBSELLINGITEMID_FIELD_NUMBER = 1;
        public static final int LADDFUND_FIELD_NUMBER = 5;
        public static final int LCOIN_FIELD_NUMBER = 4;
        public static Parser<AddClubFundSellingItem> PARSER = null;
        public static final int SCLUBSELLINGITEMDETAIL_FIELD_NUMBER = 3;
        public static final int SCLUBSELLINGITEMNAME_FIELD_NUMBER = 2;
        private static final AddClubFundSellingItem defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int iClubSellingItemID_;
        private long lAddFund_;
        private long lCoin_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sClubSellingItemDetail_;
        private Object sClubSellingItemName_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.AddClubFundSellingItem.1 */
        class C01791 extends AbstractParser<AddClubFundSellingItem> {
            static {
                fixHelper.fixfunc(new int[]{16364, 16365});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01791();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements AddClubFundSellingItemOrBuilder {
            private int bitField0_;
            private int iClubSellingItemID_;
            private long lAddFund_;
            private long lCoin_;
            private Object sClubSellingItemDetail_;
            private Object sClubSellingItemName_;

            static {
                fixHelper.fixfunc(new int[]{4161, 4162, 4163, 4164, 4165, 4166, 4167, 4168, 4169, 4170, 4171, 4172, 4173, 4174, 4175, 4176, 4177, 4178, 4179, 4180, 4181, 4182, 4183, 4184, 4185, 4186, 4187, 4188, 4189, 4190, 4191, 4192, 4193, 4194, 4195, 4196, 4197, 4198, 4199, 4200, 4201, 4202, 4203, 4204, 4205, 4206, 4207, 4208, 4209, 4210, 4211, 4212, 4213, 4214, 4215, 4216});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5709build();

            public final native AddClubFundSellingItem m5710build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5711buildPartial();

            public final native AddClubFundSellingItem m5712buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5713clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5714clear();

            public final native Builder m5715clear();

            public final native Builder clearIClubSellingItemID();

            public final native Builder clearLAddFund();

            public final native Builder clearLCoin();

            public final native Builder clearSClubSellingItemDetail();

            public final native Builder clearSClubSellingItemName();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5716clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5717clone();

            public final native Builder m5718clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5719getDefaultInstanceForType();

            public final native AddClubFundSellingItem m5720getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getIClubSellingItemID();

            public final native long getLAddFund();

            public final native long getLCoin();

            public final native String getSClubSellingItemDetail();

            public final native ByteString getSClubSellingItemDetailBytes();

            public final native String getSClubSellingItemName();

            public final native ByteString getSClubSellingItemNameBytes();

            public final native boolean hasIClubSellingItemID();

            public final native boolean hasLAddFund();

            public final native boolean hasLCoin();

            public final native boolean hasSClubSellingItemDetail();

            public final native boolean hasSClubSellingItemName();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5721mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5722mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5723mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5724mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5725mergeFrom(Message message);

            public final native Builder mergeFrom(AddClubFundSellingItem addClubFundSellingItem);

            public final native Builder setIClubSellingItemID(int i);

            public final native Builder setLAddFund(long j);

            public final native Builder setLCoin(long j);

            public final native Builder setSClubSellingItemDetail(String str);

            public final native Builder setSClubSellingItemDetailBytes(ByteString byteString);

            public final native Builder setSClubSellingItemName(String str);

            public final native Builder setSClubSellingItemNameBytes(ByteString byteString);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.aY;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{29332, 29333, 29334, 29335, 29336, 29337, 29338, 29339, 29340, 29341, 29342, 29343, 29344, 29345, 29346, 29347, 29348, 29349, 29350, 29351, 29352, 29353, 29354, 29355, 29356, 29357, 29358, 29359, 29360, 29361, 29362, 29363, 29364, 29365, 29366, 29367});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native AddClubFundSellingItem(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ AddClubFundSellingItem(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, AddClubFundSellingItem addClubFundSellingItem);

        private native AddClubFundSellingItem(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ AddClubFundSellingItem(com.google.protobuf.GeneratedMessage.Builder builder, AddClubFundSellingItem addClubFundSellingItem);

        private native AddClubFundSellingItem(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5702getDefaultInstanceForType();

        public final native AddClubFundSellingItem m5703getDefaultInstanceForType();

        public final native int getIClubSellingItemID();

        public final native long getLAddFund();

        public final native long getLCoin();

        public final native Parser<AddClubFundSellingItem> getParserForType();

        public final native String getSClubSellingItemDetail();

        public final native ByteString getSClubSellingItemDetailBytes();

        public final native String getSClubSellingItemName();

        public final native ByteString getSClubSellingItemNameBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasIClubSellingItemID();

        public final native boolean hasLAddFund();

        public final native boolean hasLCoin();

        public final native boolean hasSClubSellingItemDetail();

        public final native boolean hasSClubSellingItemName();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5704newBuilderForType();

        public final native Builder m5705newBuilderForType();

        protected final native Builder m5706newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5707toBuilder();

        public final native Builder m5708toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static AddClubFundSellingItem getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.aY;
        }

        static void __clinit__() {
            PARSER = new C01791();
            AddClubFundSellingItem addClubFundSellingItem = new AddClubFundSellingItem(true);
            defaultInstance = addClubFundSellingItem;
            addClubFundSellingItem.initFields();
        }

        public static AddClubFundSellingItem parseFrom(ByteString byteString) {
            return (AddClubFundSellingItem) PARSER.parseFrom(byteString);
        }

        public static AddClubFundSellingItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (AddClubFundSellingItem) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AddClubFundSellingItem parseFrom(byte[] bArr) {
            return (AddClubFundSellingItem) PARSER.parseFrom(bArr);
        }

        public static AddClubFundSellingItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (AddClubFundSellingItem) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AddClubFundSellingItem parseFrom(InputStream inputStream) {
            return (AddClubFundSellingItem) PARSER.parseFrom(inputStream);
        }

        public static AddClubFundSellingItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AddClubFundSellingItem) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static AddClubFundSellingItem parseDelimitedFrom(InputStream inputStream) {
            return (AddClubFundSellingItem) PARSER.parseDelimitedFrom(inputStream);
        }

        public static AddClubFundSellingItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AddClubFundSellingItem) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static AddClubFundSellingItem parseFrom(CodedInputStream codedInputStream) {
            return (AddClubFundSellingItem) PARSER.parseFrom(codedInputStream);
        }

        public static AddClubFundSellingItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AddClubFundSellingItem) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(AddClubFundSellingItem addClubFundSellingItem) {
            return newBuilder().mergeFrom(addClubFundSellingItem);
        }
    }

    public enum CLUB_ACT implements ProtocolMessageEnum {
        ;
        
        public static final int CLUB_ACCEPT_INVITE_VALUE = 1;
        public static final int CLUB_DENY_INVITE_VALUE = 2;
        public static final int CLUB_REMOVE_INVITE_VALUE = 3;
        private static final CLUB_ACT[] VALUES = null;
        private static EnumLiteMap<CLUB_ACT> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.CLUB_ACT.1 */
        class C01801 implements EnumLiteMap<CLUB_ACT> {
            static {
                fixHelper.fixfunc(new int[]{19574, 19575});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01801();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{31244, 31245, 31246, 31247});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CLUB_ACT(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            CLUB_ACCEPT_INVITE = new CLUB_ACT("CLUB_ACCEPT_INVITE", 0, 0, CLUB_ACCEPT_INVITE_VALUE);
            CLUB_DENY_INVITE = new CLUB_ACT("CLUB_DENY_INVITE", CLUB_ACCEPT_INVITE_VALUE, CLUB_ACCEPT_INVITE_VALUE, CLUB_DENY_INVITE_VALUE);
            CLUB_REMOVE_INVITE = new CLUB_ACT("CLUB_REMOVE_INVITE", CLUB_DENY_INVITE_VALUE, CLUB_DENY_INVITE_VALUE, CLUB_REMOVE_INVITE_VALUE);
            CLUB_ACT[] club_actArr = new CLUB_ACT[CLUB_REMOVE_INVITE_VALUE];
            club_actArr[0] = CLUB_ACCEPT_INVITE;
            club_actArr[CLUB_ACCEPT_INVITE_VALUE] = CLUB_DENY_INVITE;
            club_actArr[CLUB_DENY_INVITE_VALUE] = CLUB_REMOVE_INVITE;
            ENUM$VALUES = club_actArr;
            internalValueMap = new C01801();
            VALUES = values();
        }

        public static CLUB_ACT valueOf(int i) {
            switch (i) {
                case CLUB_ACCEPT_INVITE_VALUE:
                    return CLUB_ACCEPT_INVITE;
                case CLUB_DENY_INVITE_VALUE:
                    return CLUB_DENY_INVITE;
                case CLUB_REMOVE_INVITE_VALUE:
                    return CLUB_REMOVE_INVITE;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<CLUB_ACT> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerHttpClub.m152a().getEnumTypes().get(0);
        }

        public static CLUB_ACT valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum CLUB_SEARCH_TYPE implements ProtocolMessageEnum {
        ;
        
        public static final int CLUB_ID_SEARCH_VALUE = 1;
        public static final int CLUB_OTHER_SEARCH_VALUE = 2;
        private static final CLUB_SEARCH_TYPE[] VALUES = null;
        private static EnumLiteMap<CLUB_SEARCH_TYPE> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.CLUB_SEARCH_TYPE.1 */
        class C01811 implements EnumLiteMap<CLUB_SEARCH_TYPE> {
            static {
                fixHelper.fixfunc(new int[]{27497, 27498});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01811();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{16600, 16601, 16602, 16603});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CLUB_SEARCH_TYPE(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            CLUB_ID_SEARCH = new CLUB_SEARCH_TYPE("CLUB_ID_SEARCH", 0, 0, CLUB_ID_SEARCH_VALUE);
            CLUB_OTHER_SEARCH = new CLUB_SEARCH_TYPE("CLUB_OTHER_SEARCH", CLUB_ID_SEARCH_VALUE, CLUB_ID_SEARCH_VALUE, CLUB_OTHER_SEARCH_VALUE);
            CLUB_SEARCH_TYPE[] club_search_typeArr = new CLUB_SEARCH_TYPE[CLUB_OTHER_SEARCH_VALUE];
            club_search_typeArr[0] = CLUB_ID_SEARCH;
            club_search_typeArr[CLUB_ID_SEARCH_VALUE] = CLUB_OTHER_SEARCH;
            ENUM$VALUES = club_search_typeArr;
            internalValueMap = new C01811();
            VALUES = values();
        }

        public static CLUB_SEARCH_TYPE valueOf(int i) {
            switch (i) {
                case CLUB_ID_SEARCH_VALUE:
                    return CLUB_ID_SEARCH;
                case CLUB_OTHER_SEARCH_VALUE:
                    return CLUB_OTHER_SEARCH;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<CLUB_SEARCH_TYPE> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerHttpClub.m152a().getEnumTypes().get(CLUB_OTHER_SEARCH_VALUE);
        }

        public static CLUB_SEARCH_TYPE valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum CLUB_SELLING_ITEM_TYPE implements ProtocolMessageEnum {
        ;
        
        public static final int CLUB_SELLING_ITEM_COIN_VALUE = 1;
        public static final int CLUB_SELLING_ITEM_POPULARITY_VALUE = 2;
        private static final CLUB_SELLING_ITEM_TYPE[] VALUES = null;
        private static EnumLiteMap<CLUB_SELLING_ITEM_TYPE> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.CLUB_SELLING_ITEM_TYPE.1 */
        class C01821 implements EnumLiteMap<CLUB_SELLING_ITEM_TYPE> {
            static {
                fixHelper.fixfunc(new int[]{11657, 11658});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01821();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{27240, 27241, 27242, 27243});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CLUB_SELLING_ITEM_TYPE(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            CLUB_SELLING_ITEM_COIN = new CLUB_SELLING_ITEM_TYPE("CLUB_SELLING_ITEM_COIN", 0, 0, CLUB_SELLING_ITEM_COIN_VALUE);
            CLUB_SELLING_ITEM_POPULARITY = new CLUB_SELLING_ITEM_TYPE("CLUB_SELLING_ITEM_POPULARITY", CLUB_SELLING_ITEM_COIN_VALUE, CLUB_SELLING_ITEM_COIN_VALUE, CLUB_SELLING_ITEM_POPULARITY_VALUE);
            CLUB_SELLING_ITEM_TYPE[] club_selling_item_typeArr = new CLUB_SELLING_ITEM_TYPE[CLUB_SELLING_ITEM_POPULARITY_VALUE];
            club_selling_item_typeArr[0] = CLUB_SELLING_ITEM_COIN;
            club_selling_item_typeArr[CLUB_SELLING_ITEM_COIN_VALUE] = CLUB_SELLING_ITEM_POPULARITY;
            ENUM$VALUES = club_selling_item_typeArr;
            internalValueMap = new C01821();
            VALUES = values();
        }

        public static CLUB_SELLING_ITEM_TYPE valueOf(int i) {
            switch (i) {
                case CLUB_SELLING_ITEM_COIN_VALUE:
                    return CLUB_SELLING_ITEM_COIN;
                case CLUB_SELLING_ITEM_POPULARITY_VALUE:
                    return CLUB_SELLING_ITEM_POPULARITY;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<CLUB_SELLING_ITEM_TYPE> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerHttpClub.m152a().getEnumTypes().get(5);
        }

        public static CLUB_SELLING_ITEM_TYPE valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum CLUB_USER_LEVEL implements ProtocolMessageEnum {
        ;
        
        public static final int CLUB_USER_CREATOR_VALUE = 3;
        public static final int CLUB_USER_IUNIOR_VALUE = 2;
        public static final int CLUB_USER_NOT_VALUE = 4;
        public static final int CLUB_USER_SENIOR_VALUE = 1;
        private static final CLUB_USER_LEVEL[] VALUES = null;
        private static EnumLiteMap<CLUB_USER_LEVEL> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.CLUB_USER_LEVEL.1 */
        class C01831 implements EnumLiteMap<CLUB_USER_LEVEL> {
            static {
                fixHelper.fixfunc(new int[]{24522, 24523});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01831();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{18457, 18458, 18459, 18460});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CLUB_USER_LEVEL(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            CLUB_USER_SENIOR = new CLUB_USER_LEVEL("CLUB_USER_SENIOR", 0, 0, CLUB_USER_SENIOR_VALUE);
            CLUB_USER_IUNIOR = new CLUB_USER_LEVEL("CLUB_USER_IUNIOR", CLUB_USER_SENIOR_VALUE, CLUB_USER_SENIOR_VALUE, CLUB_USER_IUNIOR_VALUE);
            CLUB_USER_CREATOR = new CLUB_USER_LEVEL("CLUB_USER_CREATOR", CLUB_USER_IUNIOR_VALUE, CLUB_USER_IUNIOR_VALUE, CLUB_USER_CREATOR_VALUE);
            CLUB_USER_NOT = new CLUB_USER_LEVEL("CLUB_USER_NOT", CLUB_USER_CREATOR_VALUE, CLUB_USER_CREATOR_VALUE, CLUB_USER_NOT_VALUE);
            CLUB_USER_LEVEL[] club_user_levelArr = new CLUB_USER_LEVEL[CLUB_USER_NOT_VALUE];
            club_user_levelArr[0] = CLUB_USER_SENIOR;
            club_user_levelArr[CLUB_USER_SENIOR_VALUE] = CLUB_USER_IUNIOR;
            club_user_levelArr[CLUB_USER_IUNIOR_VALUE] = CLUB_USER_CREATOR;
            club_user_levelArr[CLUB_USER_CREATOR_VALUE] = CLUB_USER_NOT;
            ENUM$VALUES = club_user_levelArr;
            internalValueMap = new C01831();
            VALUES = values();
        }

        public static CLUB_USER_LEVEL valueOf(int i) {
            switch (i) {
                case CLUB_USER_SENIOR_VALUE:
                    return CLUB_USER_SENIOR;
                case CLUB_USER_IUNIOR_VALUE:
                    return CLUB_USER_IUNIOR;
                case CLUB_USER_CREATOR_VALUE:
                    return CLUB_USER_CREATOR;
                case CLUB_USER_NOT_VALUE:
                    return CLUB_USER_NOT;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<CLUB_USER_LEVEL> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerHttpClub.m152a().getEnumTypes().get(CLUB_USER_SENIOR_VALUE);
        }

        public static CLUB_USER_LEVEL valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public interface CSAddClubFundOrBuilder extends MessageOrBuilder {
        int getIItemID();

        int getIItemNum();

        long getLClubID();

        long getUuid();

        boolean hasIItemID();

        boolean hasIItemNum();

        boolean hasLClubID();

        boolean hasUuid();
    }

    public static final class CSAddClubFund extends GeneratedMessage implements CSAddClubFundOrBuilder {
        public static final int IITEMID_FIELD_NUMBER = 3;
        public static final int IITEMNUM_FIELD_NUMBER = 4;
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static Parser<CSAddClubFund> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSAddClubFund defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int iItemID_;
        private int iItemNum_;
        private long lClubID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.CSAddClubFund.1 */
        class C01841 extends AbstractParser<CSAddClubFund> {
            static {
                fixHelper.fixfunc(new int[]{19569, 19570});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01841();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSAddClubFundOrBuilder {
            private int bitField0_;
            private int iItemID_;
            private int iItemNum_;
            private long lClubID_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{15149, 15150, 15151, 15152, 15153, 15154, 15155, 15156, 15157, 15158, 15159, 15160, 15161, 15162, 15163, 15164, 15165, 15166, 15167, 15168, 15169, 15170, 15171, 15172, 15173, 15174, 15175, 15176, 15177, 15178, 15179, 15180, 15181, 15182, 15183, 15184, 15185, 15186, 15187, 15188, 15189, 15190, 15191, 15192, 15193, 15194, 15195, 15196});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5733build();

            public final native CSAddClubFund m5734build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5735buildPartial();

            public final native CSAddClubFund m5736buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5737clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5738clear();

            public final native Builder m5739clear();

            public final native Builder clearIItemID();

            public final native Builder clearIItemNum();

            public final native Builder clearLClubID();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5740clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5741clone();

            public final native Builder m5742clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5743getDefaultInstanceForType();

            public final native CSAddClubFund m5744getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getIItemID();

            public final native int getIItemNum();

            public final native long getLClubID();

            public final native long getUuid();

            public final native boolean hasIItemID();

            public final native boolean hasIItemNum();

            public final native boolean hasLClubID();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5745mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5746mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5747mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5748mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5749mergeFrom(Message message);

            public final native Builder mergeFrom(CSAddClubFund cSAddClubFund);

            public final native Builder setIItemID(int i);

            public final native Builder setIItemNum(int i);

            public final native Builder setLClubID(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.bi;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{31470, 31471, 31472, 31473, 31474, 31475, 31476, 31477, 31478, 31479, 31480, 31481, 31482, 31483, 31484, 31485, 31486, 31487, 31488, 31489, 31490, 31491, 31492, 31493, 31494, 31495, 31496, 31497, 31498, 31499, 31500, 31501});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSAddClubFund(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSAddClubFund(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSAddClubFund cSAddClubFund);

        private native CSAddClubFund(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSAddClubFund(com.google.protobuf.GeneratedMessage.Builder builder, CSAddClubFund cSAddClubFund);

        private native CSAddClubFund(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5726getDefaultInstanceForType();

        public final native CSAddClubFund m5727getDefaultInstanceForType();

        public final native int getIItemID();

        public final native int getIItemNum();

        public final native long getLClubID();

        public final native Parser<CSAddClubFund> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasIItemID();

        public final native boolean hasIItemNum();

        public final native boolean hasLClubID();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5728newBuilderForType();

        public final native Builder m5729newBuilderForType();

        protected final native Builder m5730newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5731toBuilder();

        public final native Builder m5732toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSAddClubFund getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.bi;
        }

        static void __clinit__() {
            PARSER = new C01841();
            CSAddClubFund cSAddClubFund = new CSAddClubFund(true);
            defaultInstance = cSAddClubFund;
            cSAddClubFund.initFields();
        }

        public static CSAddClubFund parseFrom(ByteString byteString) {
            return (CSAddClubFund) PARSER.parseFrom(byteString);
        }

        public static CSAddClubFund parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSAddClubFund) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSAddClubFund parseFrom(byte[] bArr) {
            return (CSAddClubFund) PARSER.parseFrom(bArr);
        }

        public static CSAddClubFund parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSAddClubFund) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSAddClubFund parseFrom(InputStream inputStream) {
            return (CSAddClubFund) PARSER.parseFrom(inputStream);
        }

        public static CSAddClubFund parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSAddClubFund) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSAddClubFund parseDelimitedFrom(InputStream inputStream) {
            return (CSAddClubFund) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSAddClubFund parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSAddClubFund) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSAddClubFund parseFrom(CodedInputStream codedInputStream) {
            return (CSAddClubFund) PARSER.parseFrom(codedInputStream);
        }

        public static CSAddClubFund parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSAddClubFund) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSAddClubFund cSAddClubFund) {
            return newBuilder().mergeFrom(cSAddClubFund);
        }
    }

    public interface CSAddClubMaxMemberOrBuilder extends MessageOrBuilder {
        int getINum();

        long getLClubID();

        long getUuid();

        boolean hasINum();

        boolean hasLClubID();

        boolean hasUuid();
    }

    public static final class CSAddClubMaxMember extends GeneratedMessage implements CSAddClubMaxMemberOrBuilder {
        public static final int INUM_FIELD_NUMBER = 3;
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static Parser<CSAddClubMaxMember> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSAddClubMaxMember defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int iNum_;
        private long lClubID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.CSAddClubMaxMember.1 */
        class C01851 extends AbstractParser<CSAddClubMaxMember> {
            static {
                fixHelper.fixfunc(new int[]{8940, 8941});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01851();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSAddClubMaxMemberOrBuilder {
            private int bitField0_;
            private int iNum_;
            private long lClubID_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{17074, 17075, 17076, 17077, 17078, 17079, 17080, 17081, 17082, 17083, 17084, 17085, 17086, 17087, 17088, 17089, 17090, 17091, 17092, 17093, 17094, 17095, 17096, 17097, 17098, 17099, 17100, 17101, 17102, 17103, 17104, 17105, 17106, 17107, 17108, 17109, 17110, 17111, 17112, 17113, 17114, 17115, 17116, 17117});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5757build();

            public final native CSAddClubMaxMember m5758build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5759buildPartial();

            public final native CSAddClubMaxMember m5760buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5761clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5762clear();

            public final native Builder m5763clear();

            public final native Builder clearINum();

            public final native Builder clearLClubID();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5764clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5765clone();

            public final native Builder m5766clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5767getDefaultInstanceForType();

            public final native CSAddClubMaxMember m5768getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getINum();

            public final native long getLClubID();

            public final native long getUuid();

            public final native boolean hasINum();

            public final native boolean hasLClubID();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5769mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5770mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5771mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5772mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5773mergeFrom(Message message);

            public final native Builder mergeFrom(CSAddClubMaxMember cSAddClubMaxMember);

            public final native Builder setINum(int i);

            public final native Builder setLClubID(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.be;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{21649, 21650, 21651, 21652, 21653, 21654, 21655, 21656, 21657, 21658, 21659, 21660, 21661, 21662, 21663, 21664, 21665, 21666, 21667, 21668, 21669, 21670, 21671, 21672, 21673, 21674, 21675, 21676, 21677, 21678});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSAddClubMaxMember(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSAddClubMaxMember(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSAddClubMaxMember cSAddClubMaxMember);

        private native CSAddClubMaxMember(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSAddClubMaxMember(com.google.protobuf.GeneratedMessage.Builder builder, CSAddClubMaxMember cSAddClubMaxMember);

        private native CSAddClubMaxMember(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5750getDefaultInstanceForType();

        public final native CSAddClubMaxMember m5751getDefaultInstanceForType();

        public final native int getINum();

        public final native long getLClubID();

        public final native Parser<CSAddClubMaxMember> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasINum();

        public final native boolean hasLClubID();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5752newBuilderForType();

        public final native Builder m5753newBuilderForType();

        protected final native Builder m5754newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5755toBuilder();

        public final native Builder m5756toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSAddClubMaxMember getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.be;
        }

        static void __clinit__() {
            PARSER = new C01851();
            CSAddClubMaxMember cSAddClubMaxMember = new CSAddClubMaxMember(true);
            defaultInstance = cSAddClubMaxMember;
            cSAddClubMaxMember.initFields();
        }

        public static CSAddClubMaxMember parseFrom(ByteString byteString) {
            return (CSAddClubMaxMember) PARSER.parseFrom(byteString);
        }

        public static CSAddClubMaxMember parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSAddClubMaxMember) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSAddClubMaxMember parseFrom(byte[] bArr) {
            return (CSAddClubMaxMember) PARSER.parseFrom(bArr);
        }

        public static CSAddClubMaxMember parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSAddClubMaxMember) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSAddClubMaxMember parseFrom(InputStream inputStream) {
            return (CSAddClubMaxMember) PARSER.parseFrom(inputStream);
        }

        public static CSAddClubMaxMember parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSAddClubMaxMember) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSAddClubMaxMember parseDelimitedFrom(InputStream inputStream) {
            return (CSAddClubMaxMember) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSAddClubMaxMember parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSAddClubMaxMember) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSAddClubMaxMember parseFrom(CodedInputStream codedInputStream) {
            return (CSAddClubMaxMember) PARSER.parseFrom(codedInputStream);
        }

        public static CSAddClubMaxMember parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSAddClubMaxMember) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSAddClubMaxMember cSAddClubMaxMember) {
            return newBuilder().mergeFrom(cSAddClubMaxMember);
        }
    }

    public interface CSClubActionOrBuilder extends MessageOrBuilder {
        CLUB_ACT getEClubAct();

        long getLActionedID();

        long getLClubID();

        String getSHint();

        ByteString getSHintBytes();

        long getUuid();

        boolean hasEClubAct();

        boolean hasLActionedID();

        boolean hasLClubID();

        boolean hasSHint();

        boolean hasUuid();
    }

    public static final class CSClubAction extends GeneratedMessage implements CSClubActionOrBuilder {
        public static final int ECLUBACT_FIELD_NUMBER = 4;
        public static final int LACTIONEDID_FIELD_NUMBER = 3;
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static Parser<CSClubAction> PARSER = null;
        public static final int SHINT_FIELD_NUMBER = 5;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSClubAction defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private CLUB_ACT eClubAct_;
        private long lActionedID_;
        private long lClubID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sHint_;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.CSClubAction.1 */
        class C01861 extends AbstractParser<CSClubAction> {
            static {
                fixHelper.fixfunc(new int[]{23384, 23385});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01861();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSClubActionOrBuilder {
            private int bitField0_;
            private CLUB_ACT eClubAct_;
            private long lActionedID_;
            private long lClubID_;
            private Object sHint_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{33237, 33238, 33239, 33240, 33241, 33242, 33243, 33244, 33245, 33246, 33247, 33248, 33249, 33250, 33251, 33252, 33253, 33254, 33255, 33256, 33257, 33258, 33259, 33260, 33261, 33262, 33263, 33264, 33265, 33266, 33267, 33268, 33269, 33270, 33271, 33272, 33273, 33274, 33275, 33276, 33277, 33278, 33279, 33280, 33281, 33282, 33283, 33284, 33285, 33286, 33287, 33288, 33289, 33290});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5781build();

            public final native CSClubAction m5782build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5783buildPartial();

            public final native CSClubAction m5784buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5785clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5786clear();

            public final native Builder m5787clear();

            public final native Builder clearEClubAct();

            public final native Builder clearLActionedID();

            public final native Builder clearLClubID();

            public final native Builder clearSHint();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5788clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5789clone();

            public final native Builder m5790clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5791getDefaultInstanceForType();

            public final native CSClubAction m5792getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native CLUB_ACT getEClubAct();

            public final native long getLActionedID();

            public final native long getLClubID();

            public final native String getSHint();

            public final native ByteString getSHintBytes();

            public final native long getUuid();

            public final native boolean hasEClubAct();

            public final native boolean hasLActionedID();

            public final native boolean hasLClubID();

            public final native boolean hasSHint();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5793mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5794mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5795mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5796mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5797mergeFrom(Message message);

            public final native Builder mergeFrom(CSClubAction cSClubAction);

            public final native Builder setEClubAct(CLUB_ACT club_act);

            public final native Builder setLActionedID(long j);

            public final native Builder setLClubID(long j);

            public final native Builder setSHint(String str);

            public final native Builder setSHintBytes(ByteString byteString);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.f160m;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{12605, 12606, 12607, 12608, 12609, 12610, 12611, 12612, 12613, 12614, 12615, 12616, 12617, 12618, 12619, 12620, 12621, 12622, 12623, 12624, 12625, 12626, 12627, 12628, 12629, 12630, 12631, 12632, 12633, 12634, 12635, 12636, 12637, 12638, 12639});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSClubAction(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSClubAction(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSClubAction cSClubAction);

        private native CSClubAction(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSClubAction(com.google.protobuf.GeneratedMessage.Builder builder, CSClubAction cSClubAction);

        private native CSClubAction(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5774getDefaultInstanceForType();

        public final native CSClubAction m5775getDefaultInstanceForType();

        public final native CLUB_ACT getEClubAct();

        public final native long getLActionedID();

        public final native long getLClubID();

        public final native Parser<CSClubAction> getParserForType();

        public final native String getSHint();

        public final native ByteString getSHintBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasEClubAct();

        public final native boolean hasLActionedID();

        public final native boolean hasLClubID();

        public final native boolean hasSHint();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5776newBuilderForType();

        public final native Builder m5777newBuilderForType();

        protected final native Builder m5778newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5779toBuilder();

        public final native Builder m5780toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSClubAction getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.f160m;
        }

        static void __clinit__() {
            PARSER = new C01861();
            CSClubAction cSClubAction = new CSClubAction(true);
            defaultInstance = cSClubAction;
            cSClubAction.initFields();
        }

        public static CSClubAction parseFrom(ByteString byteString) {
            return (CSClubAction) PARSER.parseFrom(byteString);
        }

        public static CSClubAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSClubAction) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSClubAction parseFrom(byte[] bArr) {
            return (CSClubAction) PARSER.parseFrom(bArr);
        }

        public static CSClubAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSClubAction) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSClubAction parseFrom(InputStream inputStream) {
            return (CSClubAction) PARSER.parseFrom(inputStream);
        }

        public static CSClubAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSClubAction) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSClubAction parseDelimitedFrom(InputStream inputStream) {
            return (CSClubAction) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSClubAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSClubAction) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSClubAction parseFrom(CodedInputStream codedInputStream) {
            return (CSClubAction) PARSER.parseFrom(codedInputStream);
        }

        public static CSClubAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSClubAction) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSClubAction cSClubAction) {
            return newBuilder().mergeFrom(cSClubAction);
        }
    }

    public interface CSCreateClubOrBuilder extends MessageOrBuilder {
        String getSClubLocation();

        ByteString getSClubLocationBytes();

        String getSClubName();

        ByteString getSClubNameBytes();

        long getUuid();

        boolean hasSClubLocation();

        boolean hasSClubName();

        boolean hasUuid();
    }

    public static final class CSCreateClub extends GeneratedMessage implements CSCreateClubOrBuilder {
        public static Parser<CSCreateClub> PARSER = null;
        public static final int SCLUBLOCATION_FIELD_NUMBER = 3;
        public static final int SCLUBNAME_FIELD_NUMBER = 2;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSCreateClub defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sClubLocation_;
        private Object sClubName_;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.CSCreateClub.1 */
        class C01871 extends AbstractParser<CSCreateClub> {
            static {
                fixHelper.fixfunc(new int[]{29252, 29253});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01871();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSCreateClubOrBuilder {
            private int bitField0_;
            private Object sClubLocation_;
            private Object sClubName_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{24144, 24145, 24146, 24147, 24148, 24149, 24150, 24151, 24152, 24153, 24154, 24155, 24156, 24157, 24158, 24159, 24160, 24161, 24162, 24163, 24164, 24165, 24166, 24167, 24168, 24169, 24170, 24171, 24172, 24173, 24174, 24175, 24176, 24177, 24178, 24179, 24180, 24181, 24182, 24183, 24184, 24185, 24186, 24187, 24188, 24189, 24190, 24191});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5805build();

            public final native CSCreateClub m5806build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5807buildPartial();

            public final native CSCreateClub m5808buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5809clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5810clear();

            public final native Builder m5811clear();

            public final native Builder clearSClubLocation();

            public final native Builder clearSClubName();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5812clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5813clone();

            public final native Builder m5814clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5815getDefaultInstanceForType();

            public final native CSCreateClub m5816getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native String getSClubLocation();

            public final native ByteString getSClubLocationBytes();

            public final native String getSClubName();

            public final native ByteString getSClubNameBytes();

            public final native long getUuid();

            public final native boolean hasSClubLocation();

            public final native boolean hasSClubName();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5817mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5818mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5819mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5820mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5821mergeFrom(Message message);

            public final native Builder mergeFrom(CSCreateClub cSCreateClub);

            public final native Builder setSClubLocation(String str);

            public final native Builder setSClubLocationBytes(ByteString byteString);

            public final native Builder setSClubName(String str);

            public final native Builder setSClubNameBytes(ByteString byteString);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.f152e;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{5765, 5766, 5767, 5768, 5769, 5770, 5771, 5772, 5773, 5774, 5775, 5776, 5777, 5778, 5779, 5780, 5781, 5782, 5783, 5784, 5785, 5786, 5787, 5788, 5789, 5790, 5791, 5792, 5793, 5794, 5795, 5796});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSCreateClub(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSCreateClub(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSCreateClub cSCreateClub);

        private native CSCreateClub(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSCreateClub(com.google.protobuf.GeneratedMessage.Builder builder, CSCreateClub cSCreateClub);

        private native CSCreateClub(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5798getDefaultInstanceForType();

        public final native CSCreateClub m5799getDefaultInstanceForType();

        public final native Parser<CSCreateClub> getParserForType();

        public final native String getSClubLocation();

        public final native ByteString getSClubLocationBytes();

        public final native String getSClubName();

        public final native ByteString getSClubNameBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasSClubLocation();

        public final native boolean hasSClubName();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5800newBuilderForType();

        public final native Builder m5801newBuilderForType();

        protected final native Builder m5802newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5803toBuilder();

        public final native Builder m5804toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSCreateClub getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.f152e;
        }

        static void __clinit__() {
            PARSER = new C01871();
            CSCreateClub cSCreateClub = new CSCreateClub(true);
            defaultInstance = cSCreateClub;
            cSCreateClub.initFields();
        }

        public static CSCreateClub parseFrom(ByteString byteString) {
            return (CSCreateClub) PARSER.parseFrom(byteString);
        }

        public static CSCreateClub parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSCreateClub) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSCreateClub parseFrom(byte[] bArr) {
            return (CSCreateClub) PARSER.parseFrom(bArr);
        }

        public static CSCreateClub parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSCreateClub) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSCreateClub parseFrom(InputStream inputStream) {
            return (CSCreateClub) PARSER.parseFrom(inputStream);
        }

        public static CSCreateClub parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSCreateClub) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSCreateClub parseDelimitedFrom(InputStream inputStream) {
            return (CSCreateClub) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSCreateClub parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSCreateClub) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSCreateClub parseFrom(CodedInputStream codedInputStream) {
            return (CSCreateClub) PARSER.parseFrom(codedInputStream);
        }

        public static CSCreateClub parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSCreateClub) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSCreateClub cSCreateClub) {
            return newBuilder().mergeFrom(cSCreateClub);
        }
    }

    public interface CSDeleteClubCoverOrBuilder extends MessageOrBuilder {
        int getIPos();

        long getLClubID();

        long getUuid();

        boolean hasIPos();

        boolean hasLClubID();

        boolean hasUuid();
    }

    public static final class CSDeleteClubCover extends GeneratedMessage implements CSDeleteClubCoverOrBuilder {
        public static final int IPOS_FIELD_NUMBER = 3;
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static Parser<CSDeleteClubCover> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSDeleteClubCover defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int iPos_;
        private long lClubID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.CSDeleteClubCover.1 */
        class C01881 extends AbstractParser<CSDeleteClubCover> {
            static {
                fixHelper.fixfunc(new int[]{25017, 25018});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01881();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSDeleteClubCoverOrBuilder {
            private int bitField0_;
            private int iPos_;
            private long lClubID_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{4403, 4404, 4405, 4406, 4407, 4408, 4409, 4410, 4411, 4412, 4413, 4414, 4415, 4416, 4417, 4418, 4419, 4420, 4421, 4422, 4423, 4424, 4425, 4426, 4427, 4428, 4429, 4430, 4431, 4432, 4433, 4434, 4435, 4436, 4437, 4438, 4439, 4440, 4441, 4442, 4443, 4444, 4445, 4446});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5829build();

            public final native CSDeleteClubCover m5830build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5831buildPartial();

            public final native CSDeleteClubCover m5832buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5833clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5834clear();

            public final native Builder m5835clear();

            public final native Builder clearIPos();

            public final native Builder clearLClubID();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5836clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5837clone();

            public final native Builder m5838clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5839getDefaultInstanceForType();

            public final native CSDeleteClubCover m5840getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getIPos();

            public final native long getLClubID();

            public final native long getUuid();

            public final native boolean hasIPos();

            public final native boolean hasLClubID();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5841mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5842mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5843mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5844mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5845mergeFrom(Message message);

            public final native Builder mergeFrom(CSDeleteClubCover cSDeleteClubCover);

            public final native Builder setIPos(int i);

            public final native Builder setLClubID(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.f144W;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{27013, 27014, 27015, 27016, 27017, 27018, 27019, 27020, 27021, 27022, 27023, 27024, 27025, 27026, 27027, 27028, 27029, 27030, 27031, 27032, 27033, 27034, 27035, 27036, 27037, 27038, 27039, 27040, 27041, 27042});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSDeleteClubCover(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSDeleteClubCover(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSDeleteClubCover cSDeleteClubCover);

        private native CSDeleteClubCover(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSDeleteClubCover(com.google.protobuf.GeneratedMessage.Builder builder, CSDeleteClubCover cSDeleteClubCover);

        private native CSDeleteClubCover(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5822getDefaultInstanceForType();

        public final native CSDeleteClubCover m5823getDefaultInstanceForType();

        public final native int getIPos();

        public final native long getLClubID();

        public final native Parser<CSDeleteClubCover> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasIPos();

        public final native boolean hasLClubID();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5824newBuilderForType();

        public final native Builder m5825newBuilderForType();

        protected final native Builder m5826newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5827toBuilder();

        public final native Builder m5828toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSDeleteClubCover getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.f144W;
        }

        static void __clinit__() {
            PARSER = new C01881();
            CSDeleteClubCover cSDeleteClubCover = new CSDeleteClubCover(true);
            defaultInstance = cSDeleteClubCover;
            cSDeleteClubCover.initFields();
        }

        public static CSDeleteClubCover parseFrom(ByteString byteString) {
            return (CSDeleteClubCover) PARSER.parseFrom(byteString);
        }

        public static CSDeleteClubCover parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSDeleteClubCover) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSDeleteClubCover parseFrom(byte[] bArr) {
            return (CSDeleteClubCover) PARSER.parseFrom(bArr);
        }

        public static CSDeleteClubCover parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSDeleteClubCover) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSDeleteClubCover parseFrom(InputStream inputStream) {
            return (CSDeleteClubCover) PARSER.parseFrom(inputStream);
        }

        public static CSDeleteClubCover parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSDeleteClubCover) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSDeleteClubCover parseDelimitedFrom(InputStream inputStream) {
            return (CSDeleteClubCover) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSDeleteClubCover parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSDeleteClubCover) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSDeleteClubCover parseFrom(CodedInputStream codedInputStream) {
            return (CSDeleteClubCover) PARSER.parseFrom(codedInputStream);
        }

        public static CSDeleteClubCover parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSDeleteClubCover) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSDeleteClubCover cSDeleteClubCover) {
            return newBuilder().mergeFrom(cSDeleteClubCover);
        }
    }

    public interface CSEnterClubOrBuilder extends MessageOrBuilder {
        long getLClubID();

        String getSHint();

        ByteString getSHintBytes();

        long getUuid();

        boolean hasLClubID();

        boolean hasSHint();

        boolean hasUuid();
    }

    public static final class CSEnterClub extends GeneratedMessage implements CSEnterClubOrBuilder {
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static Parser<CSEnterClub> PARSER = null;
        public static final int SHINT_FIELD_NUMBER = 3;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSEnterClub defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lClubID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sHint_;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.CSEnterClub.1 */
        class C01891 extends AbstractParser<CSEnterClub> {
            static {
                fixHelper.fixfunc(new int[]{12572, 12573});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01891();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSEnterClubOrBuilder {
            private int bitField0_;
            private long lClubID_;
            private Object sHint_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{12481, 12482, 12483, 12484, 12485, 12486, 12487, 12488, 12489, 12490, 12491, 12492, 12493, 12494, 12495, 12496, 12497, 12498, 12499, 12500, 12501, 12502, 12503, 12504, 12505, 12506, 12507, 12508, 12509, 12510, 12511, 12512, 12513, 12514, 12515, 12516, 12517, 12518, 12519, 12520, 12521, 12522, 12523, 12524, 12525, 12526});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5853build();

            public final native CSEnterClub m5854build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5855buildPartial();

            public final native CSEnterClub m5856buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5857clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5858clear();

            public final native Builder m5859clear();

            public final native Builder clearLClubID();

            public final native Builder clearSHint();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5860clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5861clone();

            public final native Builder m5862clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5863getDefaultInstanceForType();

            public final native CSEnterClub m5864getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLClubID();

            public final native String getSHint();

            public final native ByteString getSHintBytes();

            public final native long getUuid();

            public final native boolean hasLClubID();

            public final native boolean hasSHint();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5865mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5866mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5867mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5868mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5869mergeFrom(Message message);

            public final native Builder mergeFrom(CSEnterClub cSEnterClub);

            public final native Builder setLClubID(long j);

            public final native Builder setSHint(String str);

            public final native Builder setSHintBytes(ByteString byteString);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.f156i;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{14704, 14705, 14706, 14707, 14708, 14709, 14710, 14711, 14712, 14713, 14714, 14715, 14716, 14717, 14718, 14719, 14720, 14721, 14722, 14723, 14724, 14725, 14726, 14727, 14728, 14729, 14730, 14731, 14732, 14733, 14734});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSEnterClub(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSEnterClub(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSEnterClub cSEnterClub);

        private native CSEnterClub(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSEnterClub(com.google.protobuf.GeneratedMessage.Builder builder, CSEnterClub cSEnterClub);

        private native CSEnterClub(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5846getDefaultInstanceForType();

        public final native CSEnterClub m5847getDefaultInstanceForType();

        public final native long getLClubID();

        public final native Parser<CSEnterClub> getParserForType();

        public final native String getSHint();

        public final native ByteString getSHintBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasLClubID();

        public final native boolean hasSHint();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5848newBuilderForType();

        public final native Builder m5849newBuilderForType();

        protected final native Builder m5850newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5851toBuilder();

        public final native Builder m5852toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSEnterClub getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.f156i;
        }

        static void __clinit__() {
            PARSER = new C01891();
            CSEnterClub cSEnterClub = new CSEnterClub(true);
            defaultInstance = cSEnterClub;
            cSEnterClub.initFields();
        }

        public static CSEnterClub parseFrom(ByteString byteString) {
            return (CSEnterClub) PARSER.parseFrom(byteString);
        }

        public static CSEnterClub parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSEnterClub) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSEnterClub parseFrom(byte[] bArr) {
            return (CSEnterClub) PARSER.parseFrom(bArr);
        }

        public static CSEnterClub parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSEnterClub) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSEnterClub parseFrom(InputStream inputStream) {
            return (CSEnterClub) PARSER.parseFrom(inputStream);
        }

        public static CSEnterClub parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSEnterClub) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSEnterClub parseDelimitedFrom(InputStream inputStream) {
            return (CSEnterClub) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSEnterClub parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSEnterClub) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSEnterClub parseFrom(CodedInputStream codedInputStream) {
            return (CSEnterClub) PARSER.parseFrom(codedInputStream);
        }

        public static CSEnterClub parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSEnterClub) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSEnterClub cSEnterClub) {
            return newBuilder().mergeFrom(cSEnterClub);
        }
    }

    public interface CSGetClubBaseInfoByClubIDOrBuilder extends MessageOrBuilder {
        long getLClubID();

        long getUuid();

        boolean hasLClubID();

        boolean hasUuid();
    }

    public static final class CSGetClubBaseInfoByClubID extends GeneratedMessage implements CSGetClubBaseInfoByClubIDOrBuilder {
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static Parser<CSGetClubBaseInfoByClubID> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetClubBaseInfoByClubID defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lClubID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.CSGetClubBaseInfoByClubID.1 */
        class C01901 extends AbstractParser<CSGetClubBaseInfoByClubID> {
            static {
                fixHelper.fixfunc(new int[]{31542, 31543});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01901();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetClubBaseInfoByClubIDOrBuilder {
            private int bitField0_;
            private long lClubID_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{8844, 8845, 8846, 8847, 8848, 8849, 8850, 8851, 8852, 8853, 8854, 8855, 8856, 8857, 8858, 8859, 8860, 8861, 8862, 8863, 8864, 8865, 8866, 8867, 8868, 8869, 8870, 8871, 8872, 8873, 8874, 8875, 8876, 8877, 8878, 8879, 8880, 8881, 8882, 8883});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5877build();

            public final native CSGetClubBaseInfoByClubID m5878build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5879buildPartial();

            public final native CSGetClubBaseInfoByClubID m5880buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5881clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5882clear();

            public final native Builder m5883clear();

            public final native Builder clearLClubID();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5884clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5885clone();

            public final native Builder m5886clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5887getDefaultInstanceForType();

            public final native CSGetClubBaseInfoByClubID m5888getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLClubID();

            public final native long getUuid();

            public final native boolean hasLClubID();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5889mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5890mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5891mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5892mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5893mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetClubBaseInfoByClubID cSGetClubBaseInfoByClubID);

            public final native Builder setLClubID(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.au;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{29046, 29047, 29048, 29049, 29050, 29051, 29052, 29053, 29054, 29055, 29056, 29057, 29058, 29059, 29060, 29061, 29062, 29063, 29064, 29065, 29066, 29067, 29068, 29069, 29070, 29071, 29072, 29073});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetClubBaseInfoByClubID(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetClubBaseInfoByClubID(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetClubBaseInfoByClubID cSGetClubBaseInfoByClubID);

        private native CSGetClubBaseInfoByClubID(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetClubBaseInfoByClubID(com.google.protobuf.GeneratedMessage.Builder builder, CSGetClubBaseInfoByClubID cSGetClubBaseInfoByClubID);

        private native CSGetClubBaseInfoByClubID(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5870getDefaultInstanceForType();

        public final native CSGetClubBaseInfoByClubID m5871getDefaultInstanceForType();

        public final native long getLClubID();

        public final native Parser<CSGetClubBaseInfoByClubID> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasLClubID();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5872newBuilderForType();

        public final native Builder m5873newBuilderForType();

        protected final native Builder m5874newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5875toBuilder();

        public final native Builder m5876toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetClubBaseInfoByClubID getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.au;
        }

        static void __clinit__() {
            PARSER = new C01901();
            CSGetClubBaseInfoByClubID cSGetClubBaseInfoByClubID = new CSGetClubBaseInfoByClubID(true);
            defaultInstance = cSGetClubBaseInfoByClubID;
            cSGetClubBaseInfoByClubID.initFields();
        }

        public static CSGetClubBaseInfoByClubID parseFrom(ByteString byteString) {
            return (CSGetClubBaseInfoByClubID) PARSER.parseFrom(byteString);
        }

        public static CSGetClubBaseInfoByClubID parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubBaseInfoByClubID) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetClubBaseInfoByClubID parseFrom(byte[] bArr) {
            return (CSGetClubBaseInfoByClubID) PARSER.parseFrom(bArr);
        }

        public static CSGetClubBaseInfoByClubID parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubBaseInfoByClubID) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetClubBaseInfoByClubID parseFrom(InputStream inputStream) {
            return (CSGetClubBaseInfoByClubID) PARSER.parseFrom(inputStream);
        }

        public static CSGetClubBaseInfoByClubID parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubBaseInfoByClubID) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetClubBaseInfoByClubID parseDelimitedFrom(InputStream inputStream) {
            return (CSGetClubBaseInfoByClubID) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetClubBaseInfoByClubID parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubBaseInfoByClubID) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetClubBaseInfoByClubID parseFrom(CodedInputStream codedInputStream) {
            return (CSGetClubBaseInfoByClubID) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetClubBaseInfoByClubID parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubBaseInfoByClubID) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetClubBaseInfoByClubID cSGetClubBaseInfoByClubID) {
            return newBuilder().mergeFrom(cSGetClubBaseInfoByClubID);
        }
    }

    public interface CSGetClubByClubIDOrBuilder extends MessageOrBuilder {
        long getLClubID();

        long getUuid();

        boolean hasLClubID();

        boolean hasUuid();
    }

    public static final class CSGetClubByClubID extends GeneratedMessage implements CSGetClubByClubIDOrBuilder {
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static Parser<CSGetClubByClubID> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetClubByClubID defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lClubID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.CSGetClubByClubID.1 */
        class C01911 extends AbstractParser<CSGetClubByClubID> {
            static {
                fixHelper.fixfunc(new int[]{30163, 30164});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01911();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetClubByClubIDOrBuilder {
            private int bitField0_;
            private long lClubID_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{29907, 29908, 29909, 29910, 29911, 29912, 29913, 29914, 29915, 29916, 29917, 29918, 29919, 29920, 29921, 29922, 29923, 29924, 29925, 29926, 29927, 29928, 29929, 29930, 29931, 29932, 29933, 29934, 29935, 29936, 29937, 29938, 29939, 29940, 29941, 29942, 29943, 29944, 29945, 29946});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5901build();

            public final native CSGetClubByClubID m5902build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5903buildPartial();

            public final native CSGetClubByClubID m5904buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5905clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5906clear();

            public final native Builder m5907clear();

            public final native Builder clearLClubID();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5908clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5909clone();

            public final native Builder m5910clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5911getDefaultInstanceForType();

            public final native CSGetClubByClubID m5912getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLClubID();

            public final native long getUuid();

            public final native boolean hasLClubID();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5913mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5914mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5915mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5916mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5917mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetClubByClubID cSGetClubByClubID);

            public final native Builder setLClubID(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.aK;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{10706, 10707, 10708, 10709, 10710, 10711, 10712, 10713, 10714, 10715, 10716, 10717, 10718, 10719, 10720, 10721, 10722, 10723, 10724, 10725, 10726, 10727, 10728, 10729, 10730, 10731, 10732, 10733});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetClubByClubID(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetClubByClubID(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetClubByClubID cSGetClubByClubID);

        private native CSGetClubByClubID(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetClubByClubID(com.google.protobuf.GeneratedMessage.Builder builder, CSGetClubByClubID cSGetClubByClubID);

        private native CSGetClubByClubID(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5894getDefaultInstanceForType();

        public final native CSGetClubByClubID m5895getDefaultInstanceForType();

        public final native long getLClubID();

        public final native Parser<CSGetClubByClubID> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasLClubID();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5896newBuilderForType();

        public final native Builder m5897newBuilderForType();

        protected final native Builder m5898newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5899toBuilder();

        public final native Builder m5900toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetClubByClubID getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.aK;
        }

        static void __clinit__() {
            PARSER = new C01911();
            CSGetClubByClubID cSGetClubByClubID = new CSGetClubByClubID(true);
            defaultInstance = cSGetClubByClubID;
            cSGetClubByClubID.initFields();
        }

        public static CSGetClubByClubID parseFrom(ByteString byteString) {
            return (CSGetClubByClubID) PARSER.parseFrom(byteString);
        }

        public static CSGetClubByClubID parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubByClubID) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetClubByClubID parseFrom(byte[] bArr) {
            return (CSGetClubByClubID) PARSER.parseFrom(bArr);
        }

        public static CSGetClubByClubID parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubByClubID) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetClubByClubID parseFrom(InputStream inputStream) {
            return (CSGetClubByClubID) PARSER.parseFrom(inputStream);
        }

        public static CSGetClubByClubID parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubByClubID) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetClubByClubID parseDelimitedFrom(InputStream inputStream) {
            return (CSGetClubByClubID) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetClubByClubID parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubByClubID) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetClubByClubID parseFrom(CodedInputStream codedInputStream) {
            return (CSGetClubByClubID) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetClubByClubID parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubByClubID) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetClubByClubID cSGetClubByClubID) {
            return newBuilder().mergeFrom(cSGetClubByClubID);
        }
    }

    public interface CSGetClubGamesByClubIDOrBuilder extends MessageOrBuilder {
        long getLClubID();

        long getUuid();

        boolean hasLClubID();

        boolean hasUuid();
    }

    public static final class CSGetClubGamesByClubID extends GeneratedMessage implements CSGetClubGamesByClubIDOrBuilder {
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static Parser<CSGetClubGamesByClubID> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetClubGamesByClubID defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lClubID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.CSGetClubGamesByClubID.1 */
        class C01921 extends AbstractParser<CSGetClubGamesByClubID> {
            static {
                fixHelper.fixfunc(new int[]{21530, 21531});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01921();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetClubGamesByClubIDOrBuilder {
            private int bitField0_;
            private long lClubID_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{8944, 8945, 8946, 8947, 8948, 8949, 8950, 8951, 8952, 8953, 8954, 8955, 8956, 8957, 8958, 8959, 8960, 8961, 8962, 8963, 8964, 8965, 8966, 8967, 8968, 8969, 8970, 8971, 8972, 8973, 8974, 8975, 8976, 8977, 8978, 8979, 8980, 8981, 8982, 8983});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5925build();

            public final native CSGetClubGamesByClubID m5926build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5927buildPartial();

            public final native CSGetClubGamesByClubID m5928buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5929clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5930clear();

            public final native Builder m5931clear();

            public final native Builder clearLClubID();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5932clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5933clone();

            public final native Builder m5934clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5935getDefaultInstanceForType();

            public final native CSGetClubGamesByClubID m5936getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLClubID();

            public final native long getUuid();

            public final native boolean hasLClubID();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5937mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5938mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5939mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5940mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5941mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetClubGamesByClubID cSGetClubGamesByClubID);

            public final native Builder setLClubID(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.aO;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{30917, 30918, 30919, 30920, 30921, 30922, 30923, 30924, 30925, 30926, 30927, 30928, 30929, 30930, 30931, 30932, 30933, 30934, 30935, 30936, 30937, 30938, 30939, 30940, 30941, 30942, 30943, 30944});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetClubGamesByClubID(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetClubGamesByClubID(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetClubGamesByClubID cSGetClubGamesByClubID);

        private native CSGetClubGamesByClubID(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetClubGamesByClubID(com.google.protobuf.GeneratedMessage.Builder builder, CSGetClubGamesByClubID cSGetClubGamesByClubID);

        private native CSGetClubGamesByClubID(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5918getDefaultInstanceForType();

        public final native CSGetClubGamesByClubID m5919getDefaultInstanceForType();

        public final native long getLClubID();

        public final native Parser<CSGetClubGamesByClubID> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasLClubID();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5920newBuilderForType();

        public final native Builder m5921newBuilderForType();

        protected final native Builder m5922newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5923toBuilder();

        public final native Builder m5924toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetClubGamesByClubID getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.aO;
        }

        static void __clinit__() {
            PARSER = new C01921();
            CSGetClubGamesByClubID cSGetClubGamesByClubID = new CSGetClubGamesByClubID(true);
            defaultInstance = cSGetClubGamesByClubID;
            cSGetClubGamesByClubID.initFields();
        }

        public static CSGetClubGamesByClubID parseFrom(ByteString byteString) {
            return (CSGetClubGamesByClubID) PARSER.parseFrom(byteString);
        }

        public static CSGetClubGamesByClubID parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubGamesByClubID) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetClubGamesByClubID parseFrom(byte[] bArr) {
            return (CSGetClubGamesByClubID) PARSER.parseFrom(bArr);
        }

        public static CSGetClubGamesByClubID parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubGamesByClubID) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetClubGamesByClubID parseFrom(InputStream inputStream) {
            return (CSGetClubGamesByClubID) PARSER.parseFrom(inputStream);
        }

        public static CSGetClubGamesByClubID parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubGamesByClubID) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetClubGamesByClubID parseDelimitedFrom(InputStream inputStream) {
            return (CSGetClubGamesByClubID) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetClubGamesByClubID parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubGamesByClubID) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetClubGamesByClubID parseFrom(CodedInputStream codedInputStream) {
            return (CSGetClubGamesByClubID) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetClubGamesByClubID parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubGamesByClubID) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetClubGamesByClubID cSGetClubGamesByClubID) {
            return newBuilder().mergeFrom(cSGetClubGamesByClubID);
        }
    }

    public interface CSGetClubInfoByUuidOrBuilder extends MessageOrBuilder {
        long getLGetUuid();

        long getUuid();

        boolean hasLGetUuid();

        boolean hasUuid();
    }

    public static final class CSGetClubInfoByUuid extends GeneratedMessage implements CSGetClubInfoByUuidOrBuilder {
        public static final int LGETUUID_FIELD_NUMBER = 2;
        public static Parser<CSGetClubInfoByUuid> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetClubInfoByUuid defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lGetUuid_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.CSGetClubInfoByUuid.1 */
        class C01931 extends AbstractParser<CSGetClubInfoByUuid> {
            static {
                fixHelper.fixfunc(new int[]{15137, 15138});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01931();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetClubInfoByUuidOrBuilder {
            private int bitField0_;
            private long lGetUuid_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{5624, 5625, 5626, 5627, 5628, 5629, 5630, 5631, 5632, 5633, 5634, 5635, 5636, 5637, 5638, 5639, 5640, 5641, 5642, 5643, 5644, 5645, 5646, 5647, 5648, 5649, 5650, 5651, 5652, 5653, 5654, 5655, 5656, 5657, 5658, 5659, 5660, 5661, 5662, 5663});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5949build();

            public final native CSGetClubInfoByUuid m5950build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5951buildPartial();

            public final native CSGetClubInfoByUuid m5952buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5953clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5954clear();

            public final native Builder m5955clear();

            public final native Builder clearLGetUuid();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5956clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5957clone();

            public final native Builder m5958clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5959getDefaultInstanceForType();

            public final native CSGetClubInfoByUuid m5960getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLGetUuid();

            public final native long getUuid();

            public final native boolean hasLGetUuid();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5961mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5962mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5963mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5964mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5965mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetClubInfoByUuid cSGetClubInfoByUuid);

            public final native Builder setLGetUuid(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.ay;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{32637, 32638, 32639, 32640, 32641, 32642, 32643, 32644, 32645, 32646, 32647, 32648, 32649, 32650, 32651, 32652, 32653, 32654, 32655, 32656, 32657, 32658, 32659, 32660, 32661, 32662, 32663, 32664});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetClubInfoByUuid(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetClubInfoByUuid(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetClubInfoByUuid cSGetClubInfoByUuid);

        private native CSGetClubInfoByUuid(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetClubInfoByUuid(com.google.protobuf.GeneratedMessage.Builder builder, CSGetClubInfoByUuid cSGetClubInfoByUuid);

        private native CSGetClubInfoByUuid(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5942getDefaultInstanceForType();

        public final native CSGetClubInfoByUuid m5943getDefaultInstanceForType();

        public final native long getLGetUuid();

        public final native Parser<CSGetClubInfoByUuid> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasLGetUuid();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5944newBuilderForType();

        public final native Builder m5945newBuilderForType();

        protected final native Builder m5946newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5947toBuilder();

        public final native Builder m5948toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetClubInfoByUuid getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.ay;
        }

        static void __clinit__() {
            PARSER = new C01931();
            CSGetClubInfoByUuid cSGetClubInfoByUuid = new CSGetClubInfoByUuid(true);
            defaultInstance = cSGetClubInfoByUuid;
            cSGetClubInfoByUuid.initFields();
        }

        public static CSGetClubInfoByUuid parseFrom(ByteString byteString) {
            return (CSGetClubInfoByUuid) PARSER.parseFrom(byteString);
        }

        public static CSGetClubInfoByUuid parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubInfoByUuid) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetClubInfoByUuid parseFrom(byte[] bArr) {
            return (CSGetClubInfoByUuid) PARSER.parseFrom(bArr);
        }

        public static CSGetClubInfoByUuid parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubInfoByUuid) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetClubInfoByUuid parseFrom(InputStream inputStream) {
            return (CSGetClubInfoByUuid) PARSER.parseFrom(inputStream);
        }

        public static CSGetClubInfoByUuid parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubInfoByUuid) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetClubInfoByUuid parseDelimitedFrom(InputStream inputStream) {
            return (CSGetClubInfoByUuid) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetClubInfoByUuid parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubInfoByUuid) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetClubInfoByUuid parseFrom(CodedInputStream codedInputStream) {
            return (CSGetClubInfoByUuid) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetClubInfoByUuid parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubInfoByUuid) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetClubInfoByUuid cSGetClubInfoByUuid) {
            return newBuilder().mergeFrom(cSGetClubInfoByUuid);
        }
    }

    public interface CSGetClubSellingItemsOrBuilder extends MessageOrBuilder {
        long getUuid();

        boolean hasUuid();
    }

    public static final class CSGetClubSellingItems extends GeneratedMessage implements CSGetClubSellingItemsOrBuilder {
        public static Parser<CSGetClubSellingItems> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetClubSellingItems defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.CSGetClubSellingItems.1 */
        class C01941 extends AbstractParser<CSGetClubSellingItems> {
            static {
                fixHelper.fixfunc(new int[]{30798, 30799});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01941();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetClubSellingItemsOrBuilder {
            private int bitField0_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{19759, 19760, 19761, 19762, 19763, 19764, 19765, 19766, 19767, 19768, 19769, 19770, 19771, 19772, 19773, 19774, 19775, 19776, 19777, 19778, 19779, 19780, 19781, 19782, 19783, 19784, 19785, 19786, 19787, 19788, 19789, 19790, 19791, 19792, 19793, 19794});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5973build();

            public final native CSGetClubSellingItems m5974build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5975buildPartial();

            public final native CSGetClubSellingItems m5976buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5977clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5978clear();

            public final native Builder m5979clear();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5980clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5981clone();

            public final native Builder m5982clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5983getDefaultInstanceForType();

            public final native CSGetClubSellingItems m5984getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getUuid();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5985mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5986mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5987mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5988mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5989mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetClubSellingItems cSGetClubSellingItems);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.ba;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{17508, 17509, 17510, 17511, 17512, 17513, 17514, 17515, 17516, 17517, 17518, 17519, 17520, 17521, 17522, 17523, 17524, 17525, 17526, 17527, 17528, 17529, 17530, 17531, 17532, 17533});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetClubSellingItems(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetClubSellingItems(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetClubSellingItems cSGetClubSellingItems);

        private native CSGetClubSellingItems(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetClubSellingItems(com.google.protobuf.GeneratedMessage.Builder builder, CSGetClubSellingItems cSGetClubSellingItems);

        private native CSGetClubSellingItems(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5966getDefaultInstanceForType();

        public final native CSGetClubSellingItems m5967getDefaultInstanceForType();

        public final native Parser<CSGetClubSellingItems> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5968newBuilderForType();

        public final native Builder m5969newBuilderForType();

        protected final native Builder m5970newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5971toBuilder();

        public final native Builder m5972toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetClubSellingItems getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.ba;
        }

        static void __clinit__() {
            PARSER = new C01941();
            CSGetClubSellingItems cSGetClubSellingItems = new CSGetClubSellingItems(true);
            defaultInstance = cSGetClubSellingItems;
            cSGetClubSellingItems.initFields();
        }

        public static CSGetClubSellingItems parseFrom(ByteString byteString) {
            return (CSGetClubSellingItems) PARSER.parseFrom(byteString);
        }

        public static CSGetClubSellingItems parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubSellingItems) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetClubSellingItems parseFrom(byte[] bArr) {
            return (CSGetClubSellingItems) PARSER.parseFrom(bArr);
        }

        public static CSGetClubSellingItems parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubSellingItems) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetClubSellingItems parseFrom(InputStream inputStream) {
            return (CSGetClubSellingItems) PARSER.parseFrom(inputStream);
        }

        public static CSGetClubSellingItems parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubSellingItems) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetClubSellingItems parseDelimitedFrom(InputStream inputStream) {
            return (CSGetClubSellingItems) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetClubSellingItems parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubSellingItems) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetClubSellingItems parseFrom(CodedInputStream codedInputStream) {
            return (CSGetClubSellingItems) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetClubSellingItems parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubSellingItems) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetClubSellingItems cSGetClubSellingItems) {
            return newBuilder().mergeFrom(cSGetClubSellingItems);
        }
    }

    public interface CSGetClubUsersByClubIDOrBuilder extends MessageOrBuilder {
        long getLClubID();

        long getUuid();

        boolean hasLClubID();

        boolean hasUuid();
    }

    public static final class CSGetClubUsersByClubID extends GeneratedMessage implements CSGetClubUsersByClubIDOrBuilder {
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static Parser<CSGetClubUsersByClubID> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetClubUsersByClubID defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lClubID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.CSGetClubUsersByClubID.1 */
        class C01951 extends AbstractParser<CSGetClubUsersByClubID> {
            static {
                fixHelper.fixfunc(new int[]{5622, 5623});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01951();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetClubUsersByClubIDOrBuilder {
            private int bitField0_;
            private long lClubID_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{4863, 4864, 4865, 4866, 4867, 4868, 4869, 4870, 4871, 4872, 4873, 4874, 4875, 4876, 4877, 4878, 4879, 4880, 4881, 4882, 4883, 4884, 4885, 4886, 4887, 4888, 4889, 4890, 4891, 4892, 4893, 4894, 4895, 4896, 4897, 4898, 4899, 4900, 4901, 4902});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5997build();

            public final native CSGetClubUsersByClubID m5998build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5999buildPartial();

            public final native CSGetClubUsersByClubID m6000buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6001clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6002clear();

            public final native Builder m6003clear();

            public final native Builder clearLClubID();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6004clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6005clone();

            public final native Builder m6006clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6007getDefaultInstanceForType();

            public final native CSGetClubUsersByClubID m6008getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLClubID();

            public final native long getUuid();

            public final native boolean hasLClubID();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6009mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6010mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6011mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6012mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6013mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetClubUsersByClubID cSGetClubUsersByClubID);

            public final native Builder setLClubID(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.aG;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{5966, 5967, 5968, 5969, 5970, 5971, 5972, 5973, 5974, 5975, 5976, 5977, 5978, 5979, 5980, 5981, 5982, 5983, 5984, 5985, 5986, 5987, 5988, 5989, 5990, 5991, 5992, 5993});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetClubUsersByClubID(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetClubUsersByClubID(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetClubUsersByClubID cSGetClubUsersByClubID);

        private native CSGetClubUsersByClubID(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetClubUsersByClubID(com.google.protobuf.GeneratedMessage.Builder builder, CSGetClubUsersByClubID cSGetClubUsersByClubID);

        private native CSGetClubUsersByClubID(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5990getDefaultInstanceForType();

        public final native CSGetClubUsersByClubID m5991getDefaultInstanceForType();

        public final native long getLClubID();

        public final native Parser<CSGetClubUsersByClubID> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasLClubID();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5992newBuilderForType();

        public final native Builder m5993newBuilderForType();

        protected final native Builder m5994newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5995toBuilder();

        public final native Builder m5996toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetClubUsersByClubID getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.aG;
        }

        static void __clinit__() {
            PARSER = new C01951();
            CSGetClubUsersByClubID cSGetClubUsersByClubID = new CSGetClubUsersByClubID(true);
            defaultInstance = cSGetClubUsersByClubID;
            cSGetClubUsersByClubID.initFields();
        }

        public static CSGetClubUsersByClubID parseFrom(ByteString byteString) {
            return (CSGetClubUsersByClubID) PARSER.parseFrom(byteString);
        }

        public static CSGetClubUsersByClubID parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubUsersByClubID) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetClubUsersByClubID parseFrom(byte[] bArr) {
            return (CSGetClubUsersByClubID) PARSER.parseFrom(bArr);
        }

        public static CSGetClubUsersByClubID parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubUsersByClubID) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetClubUsersByClubID parseFrom(InputStream inputStream) {
            return (CSGetClubUsersByClubID) PARSER.parseFrom(inputStream);
        }

        public static CSGetClubUsersByClubID parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubUsersByClubID) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetClubUsersByClubID parseDelimitedFrom(InputStream inputStream) {
            return (CSGetClubUsersByClubID) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetClubUsersByClubID parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubUsersByClubID) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetClubUsersByClubID parseFrom(CodedInputStream codedInputStream) {
            return (CSGetClubUsersByClubID) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetClubUsersByClubID parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubUsersByClubID) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetClubUsersByClubID cSGetClubUsersByClubID) {
            return newBuilder().mergeFrom(cSGetClubUsersByClubID);
        }
    }

    public interface CSGetClubsByLocationOrBuilder extends MessageOrBuilder {
        int getINum();

        int getIOffset();

        String getSClubLocation();

        ByteString getSClubLocationBytes();

        long getUuid();

        boolean hasINum();

        boolean hasIOffset();

        boolean hasSClubLocation();

        boolean hasUuid();
    }

    public static final class CSGetClubsByLocation extends GeneratedMessage implements CSGetClubsByLocationOrBuilder {
        public static final int INUM_FIELD_NUMBER = 4;
        public static final int IOFFSET_FIELD_NUMBER = 3;
        public static Parser<CSGetClubsByLocation> PARSER = null;
        public static final int SCLUBLOCATION_FIELD_NUMBER = 2;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetClubsByLocation defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int iNum_;
        private int iOffset_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sClubLocation_;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.CSGetClubsByLocation.1 */
        class C01961 extends AbstractParser<CSGetClubsByLocation> {
            static {
                fixHelper.fixfunc(new int[]{19567, 19568});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01961();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetClubsByLocationOrBuilder {
            private int bitField0_;
            private int iNum_;
            private int iOffset_;
            private Object sClubLocation_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{14936, 14937, 14938, 14939, 14940, 14941, 14942, 14943, 14944, 14945, 14946, 14947, 14948, 14949, 14950, 14951, 14952, 14953, 14954, 14955, 14956, 14957, 14958, 14959, 14960, 14961, 14962, 14963, 14964, 14965, 14966, 14967, 14968, 14969, 14970, 14971, 14972, 14973, 14974, 14975, 14976, 14977, 14978, 14979, 14980, 14981, 14982, 14983, 14984, 14985});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6021build();

            public final native CSGetClubsByLocation m6022build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6023buildPartial();

            public final native CSGetClubsByLocation m6024buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6025clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6026clear();

            public final native Builder m6027clear();

            public final native Builder clearINum();

            public final native Builder clearIOffset();

            public final native Builder clearSClubLocation();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6028clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6029clone();

            public final native Builder m6030clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6031getDefaultInstanceForType();

            public final native CSGetClubsByLocation m6032getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getINum();

            public final native int getIOffset();

            public final native String getSClubLocation();

            public final native ByteString getSClubLocationBytes();

            public final native long getUuid();

            public final native boolean hasINum();

            public final native boolean hasIOffset();

            public final native boolean hasSClubLocation();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6033mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6034mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6035mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6036mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6037mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetClubsByLocation cSGetClubsByLocation);

            public final native Builder setINum(int i);

            public final native Builder setIOffset(int i);

            public final native Builder setSClubLocation(String str);

            public final native Builder setSClubLocationBytes(ByteString byteString);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.f168u;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{14494, 14495, 14496, 14497, 14498, 14499, 14500, 14501, 14502, 14503, 14504, 14505, 14506, 14507, 14508, 14509, 14510, 14511, 14512, 14513, 14514, 14515, 14516, 14517, 14518, 14519, 14520, 14521, 14522, 14523, 14524, 14525, 14526});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetClubsByLocation(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetClubsByLocation(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetClubsByLocation cSGetClubsByLocation);

        private native CSGetClubsByLocation(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetClubsByLocation(com.google.protobuf.GeneratedMessage.Builder builder, CSGetClubsByLocation cSGetClubsByLocation);

        private native CSGetClubsByLocation(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6014getDefaultInstanceForType();

        public final native CSGetClubsByLocation m6015getDefaultInstanceForType();

        public final native int getINum();

        public final native int getIOffset();

        public final native Parser<CSGetClubsByLocation> getParserForType();

        public final native String getSClubLocation();

        public final native ByteString getSClubLocationBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasINum();

        public final native boolean hasIOffset();

        public final native boolean hasSClubLocation();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6016newBuilderForType();

        public final native Builder m6017newBuilderForType();

        protected final native Builder m6018newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6019toBuilder();

        public final native Builder m6020toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetClubsByLocation getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.f168u;
        }

        static void __clinit__() {
            PARSER = new C01961();
            CSGetClubsByLocation cSGetClubsByLocation = new CSGetClubsByLocation(true);
            defaultInstance = cSGetClubsByLocation;
            cSGetClubsByLocation.initFields();
        }

        public static CSGetClubsByLocation parseFrom(ByteString byteString) {
            return (CSGetClubsByLocation) PARSER.parseFrom(byteString);
        }

        public static CSGetClubsByLocation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubsByLocation) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetClubsByLocation parseFrom(byte[] bArr) {
            return (CSGetClubsByLocation) PARSER.parseFrom(bArr);
        }

        public static CSGetClubsByLocation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubsByLocation) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetClubsByLocation parseFrom(InputStream inputStream) {
            return (CSGetClubsByLocation) PARSER.parseFrom(inputStream);
        }

        public static CSGetClubsByLocation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubsByLocation) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetClubsByLocation parseDelimitedFrom(InputStream inputStream) {
            return (CSGetClubsByLocation) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetClubsByLocation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubsByLocation) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetClubsByLocation parseFrom(CodedInputStream codedInputStream) {
            return (CSGetClubsByLocation) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetClubsByLocation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetClubsByLocation) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetClubsByLocation cSGetClubsByLocation) {
            return newBuilder().mergeFrom(cSGetClubsByLocation);
        }
    }

    public interface CSGetFundBillInfosOrBuilder extends MessageOrBuilder {
        long getLClubID();

        long getUuid();

        boolean hasLClubID();

        boolean hasUuid();
    }

    public static final class CSGetFundBillInfos extends GeneratedMessage implements CSGetFundBillInfosOrBuilder {
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static Parser<CSGetFundBillInfos> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetFundBillInfos defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lClubID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.CSGetFundBillInfos.1 */
        class C01971 extends AbstractParser<CSGetFundBillInfos> {
            static {
                fixHelper.fixfunc(new int[]{16091, 16092});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01971();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetFundBillInfosOrBuilder {
            private int bitField0_;
            private long lClubID_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{5501, 5502, 5503, 5504, 5505, 5506, 5507, 5508, 5509, 5510, 5511, 5512, 5513, 5514, 5515, 5516, 5517, 5518, 5519, 5520, 5521, 5522, 5523, 5524, 5525, 5526, 5527, 5528, 5529, 5530, 5531, 5532, 5533, 5534, 5535, 5536, 5537, 5538, 5539, 5540});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6045build();

            public final native CSGetFundBillInfos m6046build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6047buildPartial();

            public final native CSGetFundBillInfos m6048buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6049clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6050clear();

            public final native Builder m6051clear();

            public final native Builder clearLClubID();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6052clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6053clone();

            public final native Builder m6054clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6055getDefaultInstanceForType();

            public final native CSGetFundBillInfos m6056getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLClubID();

            public final native long getUuid();

            public final native boolean hasLClubID();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6057mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6058mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6059mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6060mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6061mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetFundBillInfos cSGetFundBillInfos);

            public final native Builder setLClubID(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.aq;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{7758, 7759, 7760, 7761, 7762, 7763, 7764, 7765, 7766, 7767, 7768, 7769, 7770, 7771, 7772, 7773, 7774, 7775, 7776, 7777, 7778, 7779, 7780, 7781, 7782, 7783, 7784, 7785});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetFundBillInfos(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetFundBillInfos(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetFundBillInfos cSGetFundBillInfos);

        private native CSGetFundBillInfos(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetFundBillInfos(com.google.protobuf.GeneratedMessage.Builder builder, CSGetFundBillInfos cSGetFundBillInfos);

        private native CSGetFundBillInfos(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6038getDefaultInstanceForType();

        public final native CSGetFundBillInfos m6039getDefaultInstanceForType();

        public final native long getLClubID();

        public final native Parser<CSGetFundBillInfos> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasLClubID();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6040newBuilderForType();

        public final native Builder m6041newBuilderForType();

        protected final native Builder m6042newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6043toBuilder();

        public final native Builder m6044toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetFundBillInfos getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.aq;
        }

        static void __clinit__() {
            PARSER = new C01971();
            CSGetFundBillInfos cSGetFundBillInfos = new CSGetFundBillInfos(true);
            defaultInstance = cSGetFundBillInfos;
            cSGetFundBillInfos.initFields();
        }

        public static CSGetFundBillInfos parseFrom(ByteString byteString) {
            return (CSGetFundBillInfos) PARSER.parseFrom(byteString);
        }

        public static CSGetFundBillInfos parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetFundBillInfos) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetFundBillInfos parseFrom(byte[] bArr) {
            return (CSGetFundBillInfos) PARSER.parseFrom(bArr);
        }

        public static CSGetFundBillInfos parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetFundBillInfos) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetFundBillInfos parseFrom(InputStream inputStream) {
            return (CSGetFundBillInfos) PARSER.parseFrom(inputStream);
        }

        public static CSGetFundBillInfos parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetFundBillInfos) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetFundBillInfos parseDelimitedFrom(InputStream inputStream) {
            return (CSGetFundBillInfos) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetFundBillInfos parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetFundBillInfos) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetFundBillInfos parseFrom(CodedInputStream codedInputStream) {
            return (CSGetFundBillInfos) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetFundBillInfos parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetFundBillInfos) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetFundBillInfos cSGetFundBillInfos) {
            return newBuilder().mergeFrom(cSGetFundBillInfos);
        }
    }

    public interface CSGetHotClubsOrBuilder extends MessageOrBuilder {
        long getUuid();

        boolean hasUuid();
    }

    public static final class CSGetHotClubs extends GeneratedMessage implements CSGetHotClubsOrBuilder {
        public static Parser<CSGetHotClubs> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetHotClubs defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.CSGetHotClubs.1 */
        class C01981 extends AbstractParser<CSGetHotClubs> {
            static {
                fixHelper.fixfunc(new int[]{7278, 7279});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01981();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetHotClubsOrBuilder {
            private int bitField0_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{4322, 4323, 4324, 4325, 4326, 4327, 4328, 4329, 4330, 4331, 4332, 4333, 4334, 4335, 4336, 4337, 4338, 4339, 4340, 4341, 4342, 4343, 4344, 4345, 4346, 4347, 4348, 4349, 4350, 4351, 4352, 4353, 4354, 4355, 4356, 4357});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6069build();

            public final native CSGetHotClubs m6070build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6071buildPartial();

            public final native CSGetHotClubs m6072buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6073clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6074clear();

            public final native Builder m6075clear();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6076clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6077clone();

            public final native Builder m6078clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6079getDefaultInstanceForType();

            public final native CSGetHotClubs m6080getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getUuid();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6081mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6082mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6083mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6084mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6085mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetHotClubs cSGetHotClubs);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.f172y;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{12397, 12398, 12399, 12400, 12401, 12402, 12403, 12404, 12405, 12406, 12407, 12408, 12409, 12410, 12411, 12412, 12413, 12414, 12415, 12416, 12417, 12418, 12419, 12420, 12421, 12422});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetHotClubs(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetHotClubs(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetHotClubs cSGetHotClubs);

        private native CSGetHotClubs(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetHotClubs(com.google.protobuf.GeneratedMessage.Builder builder, CSGetHotClubs cSGetHotClubs);

        private native CSGetHotClubs(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6062getDefaultInstanceForType();

        public final native CSGetHotClubs m6063getDefaultInstanceForType();

        public final native Parser<CSGetHotClubs> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6064newBuilderForType();

        public final native Builder m6065newBuilderForType();

        protected final native Builder m6066newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6067toBuilder();

        public final native Builder m6068toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetHotClubs getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.f172y;
        }

        static void __clinit__() {
            PARSER = new C01981();
            CSGetHotClubs cSGetHotClubs = new CSGetHotClubs(true);
            defaultInstance = cSGetHotClubs;
            cSGetHotClubs.initFields();
        }

        public static CSGetHotClubs parseFrom(ByteString byteString) {
            return (CSGetHotClubs) PARSER.parseFrom(byteString);
        }

        public static CSGetHotClubs parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetHotClubs) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetHotClubs parseFrom(byte[] bArr) {
            return (CSGetHotClubs) PARSER.parseFrom(bArr);
        }

        public static CSGetHotClubs parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetHotClubs) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetHotClubs parseFrom(InputStream inputStream) {
            return (CSGetHotClubs) PARSER.parseFrom(inputStream);
        }

        public static CSGetHotClubs parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetHotClubs) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetHotClubs parseDelimitedFrom(InputStream inputStream) {
            return (CSGetHotClubs) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetHotClubs parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetHotClubs) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetHotClubs parseFrom(CodedInputStream codedInputStream) {
            return (CSGetHotClubs) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetHotClubs parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetHotClubs) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetHotClubs cSGetHotClubs) {
            return newBuilder().mergeFrom(cSGetHotClubs);
        }
    }

    public interface CSGetMyClubsOrBuilder extends MessageOrBuilder {
        long getUuid();

        boolean hasUuid();
    }

    public static final class CSGetMyClubs extends GeneratedMessage implements CSGetMyClubsOrBuilder {
        public static Parser<CSGetMyClubs> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetMyClubs defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.CSGetMyClubs.1 */
        class C01991 extends AbstractParser<CSGetMyClubs> {
            static {
                fixHelper.fixfunc(new int[]{16593, 16594});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01991();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetMyClubsOrBuilder {
            private int bitField0_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{7200, 7201, 7202, 7203, 7204, 7205, 7206, 7207, 7208, 7209, 7210, 7211, 7212, 7213, 7214, 7215, 7216, 7217, 7218, 7219, 7220, 7221, 7222, 7223, 7224, 7225, 7226, 7227, 7228, 7229, 7230, 7231, 7232, 7233, 7234, 7235});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6093build();

            public final native CSGetMyClubs m6094build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6095buildPartial();

            public final native CSGetMyClubs m6096buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6097clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6098clear();

            public final native Builder m6099clear();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6100clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6101clone();

            public final native Builder m6102clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6103getDefaultInstanceForType();

            public final native CSGetMyClubs m6104getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getUuid();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6105mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6106mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6107mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6108mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6109mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetMyClubs cSGetMyClubs);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.aa;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{10746, 10747, 10748, 10749, 10750, 10751, 10752, 10753, 10754, 10755, 10756, 10757, 10758, 10759, 10760, 10761, 10762, 10763, 10764, 10765, 10766, 10767, 10768, 10769, 10770, 10771});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetMyClubs(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetMyClubs(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetMyClubs cSGetMyClubs);

        private native CSGetMyClubs(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetMyClubs(com.google.protobuf.GeneratedMessage.Builder builder, CSGetMyClubs cSGetMyClubs);

        private native CSGetMyClubs(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6086getDefaultInstanceForType();

        public final native CSGetMyClubs m6087getDefaultInstanceForType();

        public final native Parser<CSGetMyClubs> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6088newBuilderForType();

        public final native Builder m6089newBuilderForType();

        protected final native Builder m6090newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6091toBuilder();

        public final native Builder m6092toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetMyClubs getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.aa;
        }

        static void __clinit__() {
            PARSER = new C01991();
            CSGetMyClubs cSGetMyClubs = new CSGetMyClubs(true);
            defaultInstance = cSGetMyClubs;
            cSGetMyClubs.initFields();
        }

        public static CSGetMyClubs parseFrom(ByteString byteString) {
            return (CSGetMyClubs) PARSER.parseFrom(byteString);
        }

        public static CSGetMyClubs parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetMyClubs) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetMyClubs parseFrom(byte[] bArr) {
            return (CSGetMyClubs) PARSER.parseFrom(bArr);
        }

        public static CSGetMyClubs parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetMyClubs) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetMyClubs parseFrom(InputStream inputStream) {
            return (CSGetMyClubs) PARSER.parseFrom(inputStream);
        }

        public static CSGetMyClubs parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetMyClubs) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetMyClubs parseDelimitedFrom(InputStream inputStream) {
            return (CSGetMyClubs) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetMyClubs parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetMyClubs) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetMyClubs parseFrom(CodedInputStream codedInputStream) {
            return (CSGetMyClubs) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetMyClubs parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetMyClubs) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetMyClubs cSGetMyClubs) {
            return newBuilder().mergeFrom(cSGetMyClubs);
        }
    }

    public interface CSGetMyClubsV2OrBuilder extends MessageOrBuilder {
        long getUuid();

        boolean hasUuid();
    }

    public static final class CSGetMyClubsV2 extends GeneratedMessage implements CSGetMyClubsV2OrBuilder {
        public static Parser<CSGetMyClubsV2> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetMyClubsV2 defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.CSGetMyClubsV2.1 */
        class C02001 extends AbstractParser<CSGetMyClubsV2> {
            static {
                fixHelper.fixfunc(new int[]{16419, 16420});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02001();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetMyClubsV2OrBuilder {
            private int bitField0_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{30430, 30431, 30432, 30433, 30434, 30435, 30436, 30437, 30438, 30439, 30440, 30441, 30442, 30443, 30444, 30445, 30446, 30447, 30448, 30449, 30450, 30451, 30452, 30453, 30454, 30455, 30456, 30457, 30458, 30459, 30460, 30461, 30462, 30463, 30464, 30465});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6117build();

            public final native CSGetMyClubsV2 m6118build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6119buildPartial();

            public final native CSGetMyClubsV2 m6120buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6121clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6122clear();

            public final native Builder m6123clear();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6124clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6125clone();

            public final native Builder m6126clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6127getDefaultInstanceForType();

            public final native CSGetMyClubsV2 m6128getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getUuid();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6129mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6130mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6131mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6132mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6133mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetMyClubsV2 cSGetMyClubsV2);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.ag;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{18146, 18147, 18148, 18149, 18150, 18151, 18152, 18153, 18154, 18155, 18156, 18157, 18158, 18159, 18160, 18161, 18162, 18163, 18164, 18165, 18166, 18167, 18168, 18169, 18170, 18171});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetMyClubsV2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetMyClubsV2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetMyClubsV2 cSGetMyClubsV2);

        private native CSGetMyClubsV2(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetMyClubsV2(com.google.protobuf.GeneratedMessage.Builder builder, CSGetMyClubsV2 cSGetMyClubsV2);

        private native CSGetMyClubsV2(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6110getDefaultInstanceForType();

        public final native CSGetMyClubsV2 m6111getDefaultInstanceForType();

        public final native Parser<CSGetMyClubsV2> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6112newBuilderForType();

        public final native Builder m6113newBuilderForType();

        protected final native Builder m6114newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6115toBuilder();

        public final native Builder m6116toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetMyClubsV2 getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.ag;
        }

        static void __clinit__() {
            PARSER = new C02001();
            CSGetMyClubsV2 cSGetMyClubsV2 = new CSGetMyClubsV2(true);
            defaultInstance = cSGetMyClubsV2;
            cSGetMyClubsV2.initFields();
        }

        public static CSGetMyClubsV2 parseFrom(ByteString byteString) {
            return (CSGetMyClubsV2) PARSER.parseFrom(byteString);
        }

        public static CSGetMyClubsV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetMyClubsV2) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetMyClubsV2 parseFrom(byte[] bArr) {
            return (CSGetMyClubsV2) PARSER.parseFrom(bArr);
        }

        public static CSGetMyClubsV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetMyClubsV2) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetMyClubsV2 parseFrom(InputStream inputStream) {
            return (CSGetMyClubsV2) PARSER.parseFrom(inputStream);
        }

        public static CSGetMyClubsV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetMyClubsV2) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetMyClubsV2 parseDelimitedFrom(InputStream inputStream) {
            return (CSGetMyClubsV2) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetMyClubsV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetMyClubsV2) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetMyClubsV2 parseFrom(CodedInputStream codedInputStream) {
            return (CSGetMyClubsV2) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetMyClubsV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetMyClubsV2) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetMyClubsV2 cSGetMyClubsV2) {
            return newBuilder().mergeFrom(cSGetMyClubsV2);
        }
    }

    public interface CSGetRecommendClubsOrBuilder extends MessageOrBuilder {
        int getINum();

        int getIOffset();

        long getUuid();

        boolean hasINum();

        boolean hasIOffset();

        boolean hasUuid();
    }

    public static final class CSGetRecommendClubs extends GeneratedMessage implements CSGetRecommendClubsOrBuilder {
        public static final int INUM_FIELD_NUMBER = 3;
        public static final int IOFFSET_FIELD_NUMBER = 2;
        public static Parser<CSGetRecommendClubs> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetRecommendClubs defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int iNum_;
        private int iOffset_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.CSGetRecommendClubs.1 */
        class C02011 extends AbstractParser<CSGetRecommendClubs> {
            static {
                fixHelper.fixfunc(new int[]{24620, 24621});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02011();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetRecommendClubsOrBuilder {
            private int bitField0_;
            private int iNum_;
            private int iOffset_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{8472, 8473, 8474, 8475, 8476, 8477, 8478, 8479, 8480, 8481, 8482, 8483, 8484, 8485, 8486, 8487, 8488, 8489, 8490, 8491, 8492, 8493, 8494, 8495, 8496, 8497, 8498, 8499, 8500, 8501, 8502, 8503, 8504, 8505, 8506, 8507, 8508, 8509, 8510, 8511, 8512, 8513, 8514, 8515});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6141build();

            public final native CSGetRecommendClubs m6142build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6143buildPartial();

            public final native CSGetRecommendClubs m6144buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6145clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6146clear();

            public final native Builder m6147clear();

            public final native Builder clearINum();

            public final native Builder clearIOffset();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6148clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6149clone();

            public final native Builder m6150clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6151getDefaultInstanceForType();

            public final native CSGetRecommendClubs m6152getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getINum();

            public final native int getIOffset();

            public final native long getUuid();

            public final native boolean hasINum();

            public final native boolean hasIOffset();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6153mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6154mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6155mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6156mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6157mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetRecommendClubs cSGetRecommendClubs);

            public final native Builder setINum(int i);

            public final native Builder setIOffset(int i);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.aS;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{19799, 19800, 19801, 19802, 19803, 19804, 19805, 19806, 19807, 19808, 19809, 19810, 19811, 19812, 19813, 19814, 19815, 19816, 19817, 19818, 19819, 19820, 19821, 19822, 19823, 19824, 19825, 19826, 19827, 19828});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetRecommendClubs(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetRecommendClubs(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetRecommendClubs cSGetRecommendClubs);

        private native CSGetRecommendClubs(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetRecommendClubs(com.google.protobuf.GeneratedMessage.Builder builder, CSGetRecommendClubs cSGetRecommendClubs);

        private native CSGetRecommendClubs(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6134getDefaultInstanceForType();

        public final native CSGetRecommendClubs m6135getDefaultInstanceForType();

        public final native int getINum();

        public final native int getIOffset();

        public final native Parser<CSGetRecommendClubs> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasINum();

        public final native boolean hasIOffset();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6136newBuilderForType();

        public final native Builder m6137newBuilderForType();

        protected final native Builder m6138newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6139toBuilder();

        public final native Builder m6140toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetRecommendClubs getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.aS;
        }

        static void __clinit__() {
            PARSER = new C02011();
            CSGetRecommendClubs cSGetRecommendClubs = new CSGetRecommendClubs(true);
            defaultInstance = cSGetRecommendClubs;
            cSGetRecommendClubs.initFields();
        }

        public static CSGetRecommendClubs parseFrom(ByteString byteString) {
            return (CSGetRecommendClubs) PARSER.parseFrom(byteString);
        }

        public static CSGetRecommendClubs parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetRecommendClubs) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetRecommendClubs parseFrom(byte[] bArr) {
            return (CSGetRecommendClubs) PARSER.parseFrom(bArr);
        }

        public static CSGetRecommendClubs parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetRecommendClubs) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetRecommendClubs parseFrom(InputStream inputStream) {
            return (CSGetRecommendClubs) PARSER.parseFrom(inputStream);
        }

        public static CSGetRecommendClubs parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetRecommendClubs) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetRecommendClubs parseDelimitedFrom(InputStream inputStream) {
            return (CSGetRecommendClubs) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetRecommendClubs parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetRecommendClubs) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetRecommendClubs parseFrom(CodedInputStream codedInputStream) {
            return (CSGetRecommendClubs) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetRecommendClubs parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetRecommendClubs) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetRecommendClubs cSGetRecommendClubs) {
            return newBuilder().mergeFrom(cSGetRecommendClubs);
        }
    }

    public interface CSQuitClubOrBuilder extends MessageOrBuilder {
        long getLClubID();

        long getUuid();

        boolean hasLClubID();

        boolean hasUuid();
    }

    public static final class CSQuitClub extends GeneratedMessage implements CSQuitClubOrBuilder {
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static Parser<CSQuitClub> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSQuitClub defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lClubID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.CSQuitClub.1 */
        class C02021 extends AbstractParser<CSQuitClub> {
            static {
                fixHelper.fixfunc(new int[]{11915, 11916});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02021();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSQuitClubOrBuilder {
            private int bitField0_;
            private long lClubID_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{26933, 26934, 26935, 26936, 26937, 26938, 26939, 26940, 26941, 26942, 26943, 26944, 26945, 26946, 26947, 26948, 26949, 26950, 26951, 26952, 26953, 26954, 26955, 26956, 26957, 26958, 26959, 26960, 26961, 26962, 26963, 26964, 26965, 26966, 26967, 26968, 26969, 26970, 26971, 26972});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6165build();

            public final native CSQuitClub m6166build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6167buildPartial();

            public final native CSQuitClub m6168buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6169clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6170clear();

            public final native Builder m6171clear();

            public final native Builder clearLClubID();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6172clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6173clone();

            public final native Builder m6174clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6175getDefaultInstanceForType();

            public final native CSQuitClub m6176getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLClubID();

            public final native long getUuid();

            public final native boolean hasLClubID();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6177mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6178mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6179mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6180mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6181mergeFrom(Message message);

            public final native Builder mergeFrom(CSQuitClub cSQuitClub);

            public final native Builder setLClubID(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.ak;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{26488, 26489, 26490, 26491, 26492, 26493, 26494, 26495, 26496, 26497, 26498, 26499, 26500, 26501, 26502, 26503, 26504, 26505, 26506, 26507, 26508, 26509, 26510, 26511, 26512, 26513, 26514, 26515});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSQuitClub(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSQuitClub(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSQuitClub cSQuitClub);

        private native CSQuitClub(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSQuitClub(com.google.protobuf.GeneratedMessage.Builder builder, CSQuitClub cSQuitClub);

        private native CSQuitClub(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6158getDefaultInstanceForType();

        public final native CSQuitClub m6159getDefaultInstanceForType();

        public final native long getLClubID();

        public final native Parser<CSQuitClub> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasLClubID();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6160newBuilderForType();

        public final native Builder m6161newBuilderForType();

        protected final native Builder m6162newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6163toBuilder();

        public final native Builder m6164toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSQuitClub getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.ak;
        }

        static void __clinit__() {
            PARSER = new C02021();
            CSQuitClub cSQuitClub = new CSQuitClub(true);
            defaultInstance = cSQuitClub;
            cSQuitClub.initFields();
        }

        public static CSQuitClub parseFrom(ByteString byteString) {
            return (CSQuitClub) PARSER.parseFrom(byteString);
        }

        public static CSQuitClub parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSQuitClub) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSQuitClub parseFrom(byte[] bArr) {
            return (CSQuitClub) PARSER.parseFrom(bArr);
        }

        public static CSQuitClub parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSQuitClub) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSQuitClub parseFrom(InputStream inputStream) {
            return (CSQuitClub) PARSER.parseFrom(inputStream);
        }

        public static CSQuitClub parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSQuitClub) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSQuitClub parseDelimitedFrom(InputStream inputStream) {
            return (CSQuitClub) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSQuitClub parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSQuitClub) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSQuitClub parseFrom(CodedInputStream codedInputStream) {
            return (CSQuitClub) PARSER.parseFrom(codedInputStream);
        }

        public static CSQuitClub parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSQuitClub) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSQuitClub cSQuitClub) {
            return newBuilder().mergeFrom(cSQuitClub);
        }
    }

    public interface CSSearchClubOrBuilder extends MessageOrBuilder {
        CLUB_SEARCH_TYPE getEClubSearchType();

        int getINum();

        int getIOffset();

        String getSKeyWord();

        ByteString getSKeyWordBytes();

        long getUuid();

        boolean hasEClubSearchType();

        boolean hasINum();

        boolean hasIOffset();

        boolean hasSKeyWord();

        boolean hasUuid();
    }

    public static final class CSSearchClub extends GeneratedMessage implements CSSearchClubOrBuilder {
        public static final int ECLUBSEARCHTYPE_FIELD_NUMBER = 5;
        public static final int INUM_FIELD_NUMBER = 4;
        public static final int IOFFSET_FIELD_NUMBER = 3;
        public static Parser<CSSearchClub> PARSER = null;
        public static final int SKEYWORD_FIELD_NUMBER = 2;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSSearchClub defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private CLUB_SEARCH_TYPE eClubSearchType_;
        private int iNum_;
        private int iOffset_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sKeyWord_;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.CSSearchClub.1 */
        class C02031 extends AbstractParser<CSSearchClub> {
            static {
                fixHelper.fixfunc(new int[]{31539, 31540});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02031();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSSearchClubOrBuilder {
            private int bitField0_;
            private CLUB_SEARCH_TYPE eClubSearchType_;
            private int iNum_;
            private int iOffset_;
            private Object sKeyWord_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{6373, 6374, 6375, 6376, 6377, 6378, 6379, 6380, 6381, 6382, 6383, 6384, 6385, 6386, 6387, 6388, 6389, 6390, 6391, 6392, 6393, 6394, 6395, 6396, 6397, 6398, 6399, 6400, 6401, 6402, 6403, 6404, 6405, 6406, 6407, 6408, 6409, 6410, 6411, 6412, 6413, 6414, 6415, 6416, 6417, 6418, 6419, 6420, 6421, 6422, 6423, 6424, 6425, 6426});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6189build();

            public final native CSSearchClub m6190build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6191buildPartial();

            public final native CSSearchClub m6192buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6193clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6194clear();

            public final native Builder m6195clear();

            public final native Builder clearEClubSearchType();

            public final native Builder clearINum();

            public final native Builder clearIOffset();

            public final native Builder clearSKeyWord();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6196clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6197clone();

            public final native Builder m6198clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6199getDefaultInstanceForType();

            public final native CSSearchClub m6200getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native CLUB_SEARCH_TYPE getEClubSearchType();

            public final native int getINum();

            public final native int getIOffset();

            public final native String getSKeyWord();

            public final native ByteString getSKeyWordBytes();

            public final native long getUuid();

            public final native boolean hasEClubSearchType();

            public final native boolean hasINum();

            public final native boolean hasIOffset();

            public final native boolean hasSKeyWord();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6201mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6202mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6203mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6204mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6205mergeFrom(Message message);

            public final native Builder mergeFrom(CSSearchClub cSSearchClub);

            public final native Builder setEClubSearchType(CLUB_SEARCH_TYPE club_search_type);

            public final native Builder setINum(int i);

            public final native Builder setIOffset(int i);

            public final native Builder setSKeyWord(String str);

            public final native Builder setSKeyWordBytes(ByteString byteString);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.f164q;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{29482, 29483, 29484, 29485, 29486, 29487, 29488, 29489, 29490, 29491, 29492, 29493, 29494, 29495, 29496, 29497, 29498, 29499, 29500, 29501, 29502, 29503, 29504, 29505, 29506, 29507, 29508, 29509, 29510, 29511, 29512, 29513, 29514, 29515, 29516});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSSearchClub(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSSearchClub(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSSearchClub cSSearchClub);

        private native CSSearchClub(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSSearchClub(com.google.protobuf.GeneratedMessage.Builder builder, CSSearchClub cSSearchClub);

        private native CSSearchClub(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6182getDefaultInstanceForType();

        public final native CSSearchClub m6183getDefaultInstanceForType();

        public final native CLUB_SEARCH_TYPE getEClubSearchType();

        public final native int getINum();

        public final native int getIOffset();

        public final native Parser<CSSearchClub> getParserForType();

        public final native String getSKeyWord();

        public final native ByteString getSKeyWordBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasEClubSearchType();

        public final native boolean hasINum();

        public final native boolean hasIOffset();

        public final native boolean hasSKeyWord();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6184newBuilderForType();

        public final native Builder m6185newBuilderForType();

        protected final native Builder m6186newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6187toBuilder();

        public final native Builder m6188toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSSearchClub getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.f164q;
        }

        static void __clinit__() {
            PARSER = new C02031();
            CSSearchClub cSSearchClub = new CSSearchClub(true);
            defaultInstance = cSSearchClub;
            cSSearchClub.initFields();
        }

        public static CSSearchClub parseFrom(ByteString byteString) {
            return (CSSearchClub) PARSER.parseFrom(byteString);
        }

        public static CSSearchClub parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSearchClub) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSSearchClub parseFrom(byte[] bArr) {
            return (CSSearchClub) PARSER.parseFrom(bArr);
        }

        public static CSSearchClub parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSearchClub) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSSearchClub parseFrom(InputStream inputStream) {
            return (CSSearchClub) PARSER.parseFrom(inputStream);
        }

        public static CSSearchClub parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSearchClub) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSSearchClub parseDelimitedFrom(InputStream inputStream) {
            return (CSSearchClub) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSSearchClub parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSearchClub) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSSearchClub parseFrom(CodedInputStream codedInputStream) {
            return (CSSearchClub) PARSER.parseFrom(codedInputStream);
        }

        public static CSSearchClub parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSearchClub) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSSearchClub cSSearchClub) {
            return newBuilder().mergeFrom(cSSearchClub);
        }
    }

    public interface CSSetClubFundOrBuilder extends MessageOrBuilder {
        long getLClubID();

        long getLClubUserUuid();

        long getLFund();

        long getUuid();

        boolean hasLClubID();

        boolean hasLClubUserUuid();

        boolean hasLFund();

        boolean hasUuid();
    }

    public static final class CSSetClubFund extends GeneratedMessage implements CSSetClubFundOrBuilder {
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static final int LCLUBUSERUUID_FIELD_NUMBER = 3;
        public static final int LFUND_FIELD_NUMBER = 4;
        public static Parser<CSSetClubFund> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSSetClubFund defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lClubID_;
        private long lClubUserUuid_;
        private long lFund_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.CSSetClubFund.1 */
        class C02041 extends AbstractParser<CSSetClubFund> {
            static {
                fixHelper.fixfunc(new int[]{23252, 23253});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02041();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSSetClubFundOrBuilder {
            private int bitField0_;
            private long lClubID_;
            private long lClubUserUuid_;
            private long lFund_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{18585, 18586, 18587, 18588, 18589, 18590, 18591, 18592, 18593, 18594, 18595, 18596, 18597, 18598, 18599, 18600, 18601, 18602, 18603, 18604, 18605, 18606, 18607, 18608, 18609, 18610, 18611, 18612, 18613, 18614, 18615, 18616, 18617, 18618, 18619, 18620, 18621, 18622, 18623, 18624, 18625, 18626, 18627, 18628, 18629, 18630, 18631, 18632});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6213build();

            public final native CSSetClubFund m6214build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6215buildPartial();

            public final native CSSetClubFund m6216buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6217clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6218clear();

            public final native Builder m6219clear();

            public final native Builder clearLClubID();

            public final native Builder clearLClubUserUuid();

            public final native Builder clearLFund();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6220clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6221clone();

            public final native Builder m6222clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6223getDefaultInstanceForType();

            public final native CSSetClubFund m6224getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLClubID();

            public final native long getLClubUserUuid();

            public final native long getLFund();

            public final native long getUuid();

            public final native boolean hasLClubID();

            public final native boolean hasLClubUserUuid();

            public final native boolean hasLFund();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6225mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6226mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6227mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6228mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6229mergeFrom(Message message);

            public final native Builder mergeFrom(CSSetClubFund cSSetClubFund);

            public final native Builder setLClubID(long j);

            public final native Builder setLClubUserUuid(long j);

            public final native Builder setLFund(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.aC;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{18775, 18776, 18777, 18778, 18779, 18780, 18781, 18782, 18783, 18784, 18785, 18786, 18787, 18788, 18789, 18790, 18791, 18792, 18793, 18794, 18795, 18796, 18797, 18798, 18799, 18800, 18801, 18802, 18803, 18804, 18805, 18806});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSSetClubFund(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSSetClubFund(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSSetClubFund cSSetClubFund);

        private native CSSetClubFund(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSSetClubFund(com.google.protobuf.GeneratedMessage.Builder builder, CSSetClubFund cSSetClubFund);

        private native CSSetClubFund(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6206getDefaultInstanceForType();

        public final native CSSetClubFund m6207getDefaultInstanceForType();

        public final native long getLClubID();

        public final native long getLClubUserUuid();

        public final native long getLFund();

        public final native Parser<CSSetClubFund> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasLClubID();

        public final native boolean hasLClubUserUuid();

        public final native boolean hasLFund();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6208newBuilderForType();

        public final native Builder m6209newBuilderForType();

        protected final native Builder m6210newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6211toBuilder();

        public final native Builder m6212toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSSetClubFund getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.aC;
        }

        static void __clinit__() {
            PARSER = new C02041();
            CSSetClubFund cSSetClubFund = new CSSetClubFund(true);
            defaultInstance = cSSetClubFund;
            cSSetClubFund.initFields();
        }

        public static CSSetClubFund parseFrom(ByteString byteString) {
            return (CSSetClubFund) PARSER.parseFrom(byteString);
        }

        public static CSSetClubFund parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetClubFund) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSSetClubFund parseFrom(byte[] bArr) {
            return (CSSetClubFund) PARSER.parseFrom(bArr);
        }

        public static CSSetClubFund parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetClubFund) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSSetClubFund parseFrom(InputStream inputStream) {
            return (CSSetClubFund) PARSER.parseFrom(inputStream);
        }

        public static CSSetClubFund parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetClubFund) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSSetClubFund parseDelimitedFrom(InputStream inputStream) {
            return (CSSetClubFund) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSSetClubFund parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetClubFund) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSSetClubFund parseFrom(CodedInputStream codedInputStream) {
            return (CSSetClubFund) PARSER.parseFrom(codedInputStream);
        }

        public static CSSetClubFund parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetClubFund) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSSetClubFund cSSetClubFund) {
            return newBuilder().mergeFrom(cSSetClubFund);
        }
    }

    public interface CSSetClubInfoOrBuilder extends MessageOrBuilder {
        long getLClubID();

        String getSClubName();

        ByteString getSClubNameBytes();

        String getSDesc();

        ByteString getSDescBytes();

        long getUuid();

        boolean hasLClubID();

        boolean hasSClubName();

        boolean hasSDesc();

        boolean hasUuid();
    }

    public static final class CSSetClubInfo extends GeneratedMessage implements CSSetClubInfoOrBuilder {
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static Parser<CSSetClubInfo> PARSER = null;
        public static final int SCLUBNAME_FIELD_NUMBER = 3;
        public static final int SDESC_FIELD_NUMBER = 4;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSSetClubInfo defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lClubID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sClubName_;
        private Object sDesc_;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.CSSetClubInfo.1 */
        class C02051 extends AbstractParser<CSSetClubInfo> {
            static {
                fixHelper.fixfunc(new int[]{16964, 16965});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02051();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSSetClubInfoOrBuilder {
            private int bitField0_;
            private long lClubID_;
            private Object sClubName_;
            private Object sDesc_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{7406, 7407, 7408, 7409, 7410, 7411, 7412, 7413, 7414, 7415, 7416, 7417, 7418, 7419, 7420, 7421, 7422, 7423, 7424, 7425, 7426, 7427, 7428, 7429, 7430, 7431, 7432, 7433, 7434, 7435, 7436, 7437, 7438, 7439, 7440, 7441, 7442, 7443, 7444, 7445, 7446, 7447, 7448, 7449, 7450, 7451, 7452, 7453, 7454, 7455, 7456, 7457});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6237build();

            public final native CSSetClubInfo m6238build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6239buildPartial();

            public final native CSSetClubInfo m6240buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6241clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6242clear();

            public final native Builder m6243clear();

            public final native Builder clearLClubID();

            public final native Builder clearSClubName();

            public final native Builder clearSDesc();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6244clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6245clone();

            public final native Builder m6246clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6247getDefaultInstanceForType();

            public final native CSSetClubInfo m6248getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLClubID();

            public final native String getSClubName();

            public final native ByteString getSClubNameBytes();

            public final native String getSDesc();

            public final native ByteString getSDescBytes();

            public final native long getUuid();

            public final native boolean hasLClubID();

            public final native boolean hasSClubName();

            public final native boolean hasSDesc();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6249mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6250mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6251mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6252mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6253mergeFrom(Message message);

            public final native Builder mergeFrom(CSSetClubInfo cSSetClubInfo);

            public final native Builder setLClubID(long j);

            public final native Builder setSClubName(String str);

            public final native Builder setSClubNameBytes(ByteString byteString);

            public final native Builder setSDesc(String str);

            public final native Builder setSDescBytes(ByteString byteString);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.f124C;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{18809, 18810, 18811, 18812, 18813, 18814, 18815, 18816, 18817, 18818, 18819, 18820, 18821, 18822, 18823, 18824, 18825, 18826, 18827, 18828, 18829, 18830, 18831, 18832, 18833, 18834, 18835, 18836, 18837, 18838, 18839, 18840, 18841, 18842});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSSetClubInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSSetClubInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSSetClubInfo cSSetClubInfo);

        private native CSSetClubInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSSetClubInfo(com.google.protobuf.GeneratedMessage.Builder builder, CSSetClubInfo cSSetClubInfo);

        private native CSSetClubInfo(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6230getDefaultInstanceForType();

        public final native CSSetClubInfo m6231getDefaultInstanceForType();

        public final native long getLClubID();

        public final native Parser<CSSetClubInfo> getParserForType();

        public final native String getSClubName();

        public final native ByteString getSClubNameBytes();

        public final native String getSDesc();

        public final native ByteString getSDescBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasLClubID();

        public final native boolean hasSClubName();

        public final native boolean hasSDesc();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6232newBuilderForType();

        public final native Builder m6233newBuilderForType();

        protected final native Builder m6234newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6235toBuilder();

        public final native Builder m6236toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSSetClubInfo getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.f124C;
        }

        static void __clinit__() {
            PARSER = new C02051();
            CSSetClubInfo cSSetClubInfo = new CSSetClubInfo(true);
            defaultInstance = cSSetClubInfo;
            cSSetClubInfo.initFields();
        }

        public static CSSetClubInfo parseFrom(ByteString byteString) {
            return (CSSetClubInfo) PARSER.parseFrom(byteString);
        }

        public static CSSetClubInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetClubInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSSetClubInfo parseFrom(byte[] bArr) {
            return (CSSetClubInfo) PARSER.parseFrom(bArr);
        }

        public static CSSetClubInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetClubInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSSetClubInfo parseFrom(InputStream inputStream) {
            return (CSSetClubInfo) PARSER.parseFrom(inputStream);
        }

        public static CSSetClubInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetClubInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSSetClubInfo parseDelimitedFrom(InputStream inputStream) {
            return (CSSetClubInfo) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSSetClubInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetClubInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSSetClubInfo parseFrom(CodedInputStream codedInputStream) {
            return (CSSetClubInfo) PARSER.parseFrom(codedInputStream);
        }

        public static CSSetClubInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetClubInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSSetClubInfo cSSetClubInfo) {
            return newBuilder().mergeFrom(cSSetClubInfo);
        }
    }

    public interface CSSetClubSettingOrBuilder extends MessageOrBuilder {
        int getBClubMsgMute();

        int getBClubMsgVibrate();

        int getBVerify();

        int getIManagerCreate();

        long getLClubID();

        long getUuid();

        boolean hasBClubMsgMute();

        boolean hasBClubMsgVibrate();

        boolean hasBVerify();

        boolean hasIManagerCreate();

        boolean hasLClubID();

        boolean hasUuid();
    }

    public static final class CSSetClubSetting extends GeneratedMessage implements CSSetClubSettingOrBuilder {
        public static final int BCLUBMSGMUTE_FIELD_NUMBER = 3;
        public static final int BCLUBMSGVIBRATE_FIELD_NUMBER = 4;
        public static final int BVERIFY_FIELD_NUMBER = 5;
        public static final int IMANAGERCREATE_FIELD_NUMBER = 20;
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static Parser<CSSetClubSetting> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSSetClubSetting defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bClubMsgMute_;
        private int bClubMsgVibrate_;
        private int bVerify_;
        private int bitField0_;
        private int iManagerCreate_;
        private long lClubID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.CSSetClubSetting.1 */
        class C02061 extends AbstractParser<CSSetClubSetting> {
            static {
                fixHelper.fixfunc(new int[]{9186, 9187});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02061();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSSetClubSettingOrBuilder {
            private int bClubMsgMute_;
            private int bClubMsgVibrate_;
            private int bVerify_;
            private int bitField0_;
            private int iManagerCreate_;
            private long lClubID_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{20077, 20078, 20079, 20080, 20081, 20082, 20083, 20084, 20085, 20086, 20087, 20088, 20089, 20090, 20091, 20092, 20093, 20094, 20095, 20096, 20097, 20098, 20099, 20100, 20101, 20102, 20103, 20104, 20105, 20106, 20107, 20108, 20109, 20110, 20111, 20112, 20113, 20114, 20115, 20116, 20117, 20118, 20119, 20120, 20121, 20122, 20123, 20124, 20125, 20126, 20127, 20128, 20129, 20130, 20131, 20132});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6261build();

            public final native CSSetClubSetting m6262build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6263buildPartial();

            public final native CSSetClubSetting m6264buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6265clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6266clear();

            public final native Builder m6267clear();

            public final native Builder clearBClubMsgMute();

            public final native Builder clearBClubMsgVibrate();

            public final native Builder clearBVerify();

            public final native Builder clearIManagerCreate();

            public final native Builder clearLClubID();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6268clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6269clone();

            public final native Builder m6270clone();

            public final native int getBClubMsgMute();

            public final native int getBClubMsgVibrate();

            public final native int getBVerify();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6271getDefaultInstanceForType();

            public final native CSSetClubSetting m6272getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getIManagerCreate();

            public final native long getLClubID();

            public final native long getUuid();

            public final native boolean hasBClubMsgMute();

            public final native boolean hasBClubMsgVibrate();

            public final native boolean hasBVerify();

            public final native boolean hasIManagerCreate();

            public final native boolean hasLClubID();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6273mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6274mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6275mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6276mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6277mergeFrom(Message message);

            public final native Builder mergeFrom(CSSetClubSetting cSSetClubSetting);

            public final native Builder setBClubMsgMute(int i);

            public final native Builder setBClubMsgVibrate(int i);

            public final native Builder setBVerify(int i);

            public final native Builder setIManagerCreate(int i);

            public final native Builder setLClubID(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.f128G;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{31985, 31986, 31987, 31988, 31989, 31990, 31991, 31992, 31993, 31994, 31995, 31996, 31997, 31998, 31999, 32000, 32001, 32002, 32003, 32004, 32005, 32006, 32007, 32008, 32009, 32010, 32011, 32012, 32013, 32014, 32015, 32016, 32017, 32018, 32019, 32020});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSSetClubSetting(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSSetClubSetting(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSSetClubSetting cSSetClubSetting);

        private native CSSetClubSetting(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSSetClubSetting(com.google.protobuf.GeneratedMessage.Builder builder, CSSetClubSetting cSSetClubSetting);

        private native CSSetClubSetting(boolean z);

        private native void initFields();

        public final native int getBClubMsgMute();

        public final native int getBClubMsgVibrate();

        public final native int getBVerify();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6254getDefaultInstanceForType();

        public final native CSSetClubSetting m6255getDefaultInstanceForType();

        public final native int getIManagerCreate();

        public final native long getLClubID();

        public final native Parser<CSSetClubSetting> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasBClubMsgMute();

        public final native boolean hasBClubMsgVibrate();

        public final native boolean hasBVerify();

        public final native boolean hasIManagerCreate();

        public final native boolean hasLClubID();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6256newBuilderForType();

        public final native Builder m6257newBuilderForType();

        protected final native Builder m6258newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6259toBuilder();

        public final native Builder m6260toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSSetClubSetting getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.f128G;
        }

        static void __clinit__() {
            PARSER = new C02061();
            CSSetClubSetting cSSetClubSetting = new CSSetClubSetting(true);
            defaultInstance = cSSetClubSetting;
            cSSetClubSetting.initFields();
        }

        public static CSSetClubSetting parseFrom(ByteString byteString) {
            return (CSSetClubSetting) PARSER.parseFrom(byteString);
        }

        public static CSSetClubSetting parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetClubSetting) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSSetClubSetting parseFrom(byte[] bArr) {
            return (CSSetClubSetting) PARSER.parseFrom(bArr);
        }

        public static CSSetClubSetting parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetClubSetting) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSSetClubSetting parseFrom(InputStream inputStream) {
            return (CSSetClubSetting) PARSER.parseFrom(inputStream);
        }

        public static CSSetClubSetting parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetClubSetting) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSSetClubSetting parseDelimitedFrom(InputStream inputStream) {
            return (CSSetClubSetting) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSSetClubSetting parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetClubSetting) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSSetClubSetting parseFrom(CodedInputStream codedInputStream) {
            return (CSSetClubSetting) PARSER.parseFrom(codedInputStream);
        }

        public static CSSetClubSetting parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetClubSetting) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSSetClubSetting cSSetClubSetting) {
            return newBuilder().mergeFrom(cSSetClubSetting);
        }
    }

    public interface CSSetClubUserLevelOrBuilder extends MessageOrBuilder {
        CLUB_USER_LEVEL getEClubUserLevel();

        long getLClubID();

        long getLClubUserUuid();

        long getUuid();

        boolean hasEClubUserLevel();

        boolean hasLClubID();

        boolean hasLClubUserUuid();

        boolean hasUuid();
    }

    public static final class CSSetClubUserLevel extends GeneratedMessage implements CSSetClubUserLevelOrBuilder {
        public static final int ECLUBUSERLEVEL_FIELD_NUMBER = 4;
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static final int LCLUBUSERUUID_FIELD_NUMBER = 3;
        public static Parser<CSSetClubUserLevel> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSSetClubUserLevel defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private CLUB_USER_LEVEL eClubUserLevel_;
        private long lClubID_;
        private long lClubUserUuid_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.CSSetClubUserLevel.1 */
        class C02071 extends AbstractParser<CSSetClubUserLevel> {
            static {
                fixHelper.fixfunc(new int[]{18202, 18203});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02071();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSSetClubUserLevelOrBuilder {
            private int bitField0_;
            private CLUB_USER_LEVEL eClubUserLevel_;
            private long lClubID_;
            private long lClubUserUuid_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{11007, 11008, 11009, 11010, 11011, 11012, 11013, 11014, 11015, 11016, 11017, 11018, 11019, 11020, 11021, 11022, 11023, 11024, 11025, 11026, 11027, 11028, 11029, 11030, 11031, 11032, 11033, 11034, 11035, 11036, 11037, 11038, 11039, 11040, 11041, 11042, 11043, 11044, 11045, 11046, 11047, 11048, 11049, 11050, 11051, 11052, 11053, 11054});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6285build();

            public final native CSSetClubUserLevel m6286build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6287buildPartial();

            public final native CSSetClubUserLevel m6288buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6289clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6290clear();

            public final native Builder m6291clear();

            public final native Builder clearEClubUserLevel();

            public final native Builder clearLClubID();

            public final native Builder clearLClubUserUuid();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6292clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6293clone();

            public final native Builder m6294clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6295getDefaultInstanceForType();

            public final native CSSetClubUserLevel m6296getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native CLUB_USER_LEVEL getEClubUserLevel();

            public final native long getLClubID();

            public final native long getLClubUserUuid();

            public final native long getUuid();

            public final native boolean hasEClubUserLevel();

            public final native boolean hasLClubID();

            public final native boolean hasLClubUserUuid();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6297mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6298mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6299mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6300mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6301mergeFrom(Message message);

            public final native Builder mergeFrom(CSSetClubUserLevel cSSetClubUserLevel);

            public final native Builder setEClubUserLevel(CLUB_USER_LEVEL club_user_level);

            public final native Builder setLClubID(long j);

            public final native Builder setLClubUserUuid(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.f132K;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{26777, 26778, 26779, 26780, 26781, 26782, 26783, 26784, 26785, 26786, 26787, 26788, 26789, 26790, 26791, 26792, 26793, 26794, 26795, 26796, 26797, 26798, 26799, 26800, 26801, 26802, 26803, 26804, 26805, 26806, 26807, 26808});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSSetClubUserLevel(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSSetClubUserLevel(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSSetClubUserLevel cSSetClubUserLevel);

        private native CSSetClubUserLevel(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSSetClubUserLevel(com.google.protobuf.GeneratedMessage.Builder builder, CSSetClubUserLevel cSSetClubUserLevel);

        private native CSSetClubUserLevel(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6278getDefaultInstanceForType();

        public final native CSSetClubUserLevel m6279getDefaultInstanceForType();

        public final native CLUB_USER_LEVEL getEClubUserLevel();

        public final native long getLClubID();

        public final native long getLClubUserUuid();

        public final native Parser<CSSetClubUserLevel> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasEClubUserLevel();

        public final native boolean hasLClubID();

        public final native boolean hasLClubUserUuid();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6280newBuilderForType();

        public final native Builder m6281newBuilderForType();

        protected final native Builder m6282newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6283toBuilder();

        public final native Builder m6284toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSSetClubUserLevel getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.f132K;
        }

        static void __clinit__() {
            PARSER = new C02071();
            CSSetClubUserLevel cSSetClubUserLevel = new CSSetClubUserLevel(true);
            defaultInstance = cSSetClubUserLevel;
            cSSetClubUserLevel.initFields();
        }

        public static CSSetClubUserLevel parseFrom(ByteString byteString) {
            return (CSSetClubUserLevel) PARSER.parseFrom(byteString);
        }

        public static CSSetClubUserLevel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetClubUserLevel) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSSetClubUserLevel parseFrom(byte[] bArr) {
            return (CSSetClubUserLevel) PARSER.parseFrom(bArr);
        }

        public static CSSetClubUserLevel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetClubUserLevel) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSSetClubUserLevel parseFrom(InputStream inputStream) {
            return (CSSetClubUserLevel) PARSER.parseFrom(inputStream);
        }

        public static CSSetClubUserLevel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetClubUserLevel) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSSetClubUserLevel parseDelimitedFrom(InputStream inputStream) {
            return (CSSetClubUserLevel) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSSetClubUserLevel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetClubUserLevel) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSSetClubUserLevel parseFrom(CodedInputStream codedInputStream) {
            return (CSSetClubUserLevel) PARSER.parseFrom(codedInputStream);
        }

        public static CSSetClubUserLevel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetClubUserLevel) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSSetClubUserLevel cSSetClubUserLevel) {
            return newBuilder().mergeFrom(cSSetClubUserLevel);
        }
    }

    public interface CSUploadClubCoverOrBuilder extends MessageOrBuilder {
        int getIPos();

        long getLClubID();

        long getUuid();

        ByteString getVIconDatas();

        boolean hasIPos();

        boolean hasLClubID();

        boolean hasUuid();

        boolean hasVIconDatas();
    }

    public static final class CSUploadClubCover extends GeneratedMessage implements CSUploadClubCoverOrBuilder {
        public static final int IPOS_FIELD_NUMBER = 4;
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static Parser<CSUploadClubCover> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        public static final int VICONDATAS_FIELD_NUMBER = 3;
        private static final CSUploadClubCover defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int iPos_;
        private long lClubID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;
        private ByteString vIconDatas_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.CSUploadClubCover.1 */
        class C02081 extends AbstractParser<CSUploadClubCover> {
            static {
                fixHelper.fixfunc(new int[]{31888, 31889});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02081();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSUploadClubCoverOrBuilder {
            private int bitField0_;
            private int iPos_;
            private long lClubID_;
            private long uuid_;
            private ByteString vIconDatas_;

            static {
                fixHelper.fixfunc(new int[]{28506, 28507, 28508, 28509, 28510, 28511, 28512, 28513, 28514, 28515, 28516, 28517, 28518, 28519, 28520, 28521, 28522, 28523, 28524, 28525, 28526, 28527, 28528, 28529, 28530, 28531, 28532, 28533, 28534, 28535, 28536, 28537, 28538, 28539, 28540, 28541, 28542, 28543, 28544, 28545, 28546, 28547, 28548, 28549, 28550, 28551, 28552, 28553});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6309build();

            public final native CSUploadClubCover m6310build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6311buildPartial();

            public final native CSUploadClubCover m6312buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6313clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6314clear();

            public final native Builder m6315clear();

            public final native Builder clearIPos();

            public final native Builder clearLClubID();

            public final native Builder clearUuid();

            public final native Builder clearVIconDatas();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6316clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6317clone();

            public final native Builder m6318clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6319getDefaultInstanceForType();

            public final native CSUploadClubCover m6320getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getIPos();

            public final native long getLClubID();

            public final native long getUuid();

            public final native ByteString getVIconDatas();

            public final native boolean hasIPos();

            public final native boolean hasLClubID();

            public final native boolean hasUuid();

            public final native boolean hasVIconDatas();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6321mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6322mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6323mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6324mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6325mergeFrom(Message message);

            public final native Builder mergeFrom(CSUploadClubCover cSUploadClubCover);

            public final native Builder setIPos(int i);

            public final native Builder setLClubID(long j);

            public final native Builder setUuid(long j);

            public final native Builder setVIconDatas(ByteString byteString);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.f140S;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{18895, 18896, 18897, 18898, 18899, 18900, 18901, 18902, 18903, 18904, 18905, 18906, 18907, 18908, 18909, 18910, 18911, 18912, 18913, 18914, 18915, 18916, 18917, 18918, 18919, 18920, 18921, 18922, 18923, 18924, 18925, 18926});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSUploadClubCover(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSUploadClubCover(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSUploadClubCover cSUploadClubCover);

        private native CSUploadClubCover(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSUploadClubCover(com.google.protobuf.GeneratedMessage.Builder builder, CSUploadClubCover cSUploadClubCover);

        private native CSUploadClubCover(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6302getDefaultInstanceForType();

        public final native CSUploadClubCover m6303getDefaultInstanceForType();

        public final native int getIPos();

        public final native long getLClubID();

        public final native Parser<CSUploadClubCover> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native ByteString getVIconDatas();

        public final native boolean hasIPos();

        public final native boolean hasLClubID();

        public final native boolean hasUuid();

        public final native boolean hasVIconDatas();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6304newBuilderForType();

        public final native Builder m6305newBuilderForType();

        protected final native Builder m6306newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6307toBuilder();

        public final native Builder m6308toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSUploadClubCover getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.f140S;
        }

        static void __clinit__() {
            PARSER = new C02081();
            CSUploadClubCover cSUploadClubCover = new CSUploadClubCover(true);
            defaultInstance = cSUploadClubCover;
            cSUploadClubCover.initFields();
        }

        public static CSUploadClubCover parseFrom(ByteString byteString) {
            return (CSUploadClubCover) PARSER.parseFrom(byteString);
        }

        public static CSUploadClubCover parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUploadClubCover) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSUploadClubCover parseFrom(byte[] bArr) {
            return (CSUploadClubCover) PARSER.parseFrom(bArr);
        }

        public static CSUploadClubCover parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUploadClubCover) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSUploadClubCover parseFrom(InputStream inputStream) {
            return (CSUploadClubCover) PARSER.parseFrom(inputStream);
        }

        public static CSUploadClubCover parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUploadClubCover) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSUploadClubCover parseDelimitedFrom(InputStream inputStream) {
            return (CSUploadClubCover) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSUploadClubCover parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUploadClubCover) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSUploadClubCover parseFrom(CodedInputStream codedInputStream) {
            return (CSUploadClubCover) PARSER.parseFrom(codedInputStream);
        }

        public static CSUploadClubCover parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUploadClubCover) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSUploadClubCover cSUploadClubCover) {
            return newBuilder().mergeFrom(cSUploadClubCover);
        }
    }

    public interface CSUploadClubIConOrBuilder extends MessageOrBuilder {
        long getLClubID();

        long getUuid();

        ByteString getVIconDatas();

        boolean hasLClubID();

        boolean hasUuid();

        boolean hasVIconDatas();
    }

    public static final class CSUploadClubICon extends GeneratedMessage implements CSUploadClubIConOrBuilder {
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static Parser<CSUploadClubICon> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        public static final int VICONDATAS_FIELD_NUMBER = 3;
        private static final CSUploadClubICon defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lClubID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;
        private ByteString vIconDatas_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.CSUploadClubICon.1 */
        class C02091 extends AbstractParser<CSUploadClubICon> {
            static {
                fixHelper.fixfunc(new int[]{4778, 4779});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02091();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSUploadClubIConOrBuilder {
            private int bitField0_;
            private long lClubID_;
            private long uuid_;
            private ByteString vIconDatas_;

            static {
                fixHelper.fixfunc(new int[]{15778, 15779, 15780, 15781, 15782, 15783, 15784, 15785, 15786, 15787, 15788, 15789, 15790, 15791, 15792, 15793, 15794, 15795, 15796, 15797, 15798, 15799, 15800, 15801, 15802, 15803, 15804, 15805, 15806, 15807, 15808, 15809, 15810, 15811, 15812, 15813, 15814, 15815, 15816, 15817, 15818, 15819, 15820, 15821});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6333build();

            public final native CSUploadClubICon m6334build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6335buildPartial();

            public final native CSUploadClubICon m6336buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6337clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6338clear();

            public final native Builder m6339clear();

            public final native Builder clearLClubID();

            public final native Builder clearUuid();

            public final native Builder clearVIconDatas();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6340clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6341clone();

            public final native Builder m6342clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6343getDefaultInstanceForType();

            public final native CSUploadClubICon m6344getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLClubID();

            public final native long getUuid();

            public final native ByteString getVIconDatas();

            public final native boolean hasLClubID();

            public final native boolean hasUuid();

            public final native boolean hasVIconDatas();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6345mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6346mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6347mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6348mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6349mergeFrom(Message message);

            public final native Builder mergeFrom(CSUploadClubICon cSUploadClubICon);

            public final native Builder setLClubID(long j);

            public final native Builder setUuid(long j);

            public final native Builder setVIconDatas(ByteString byteString);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.f136O;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{22325, 22326, 22327, 22328, 22329, 22330, 22331, 22332, 22333, 22334, 22335, 22336, 22337, 22338, 22339, 22340, 22341, 22342, 22343, 22344, 22345, 22346, 22347, 22348, 22349, 22350, 22351, 22352, 22353, 22354});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSUploadClubICon(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSUploadClubICon(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSUploadClubICon cSUploadClubICon);

        private native CSUploadClubICon(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSUploadClubICon(com.google.protobuf.GeneratedMessage.Builder builder, CSUploadClubICon cSUploadClubICon);

        private native CSUploadClubICon(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6326getDefaultInstanceForType();

        public final native CSUploadClubICon m6327getDefaultInstanceForType();

        public final native long getLClubID();

        public final native Parser<CSUploadClubICon> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native ByteString getVIconDatas();

        public final native boolean hasLClubID();

        public final native boolean hasUuid();

        public final native boolean hasVIconDatas();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6328newBuilderForType();

        public final native Builder m6329newBuilderForType();

        protected final native Builder m6330newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6331toBuilder();

        public final native Builder m6332toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSUploadClubICon getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.f136O;
        }

        static void __clinit__() {
            PARSER = new C02091();
            CSUploadClubICon cSUploadClubICon = new CSUploadClubICon(true);
            defaultInstance = cSUploadClubICon;
            cSUploadClubICon.initFields();
        }

        public static CSUploadClubICon parseFrom(ByteString byteString) {
            return (CSUploadClubICon) PARSER.parseFrom(byteString);
        }

        public static CSUploadClubICon parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUploadClubICon) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSUploadClubICon parseFrom(byte[] bArr) {
            return (CSUploadClubICon) PARSER.parseFrom(bArr);
        }

        public static CSUploadClubICon parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUploadClubICon) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSUploadClubICon parseFrom(InputStream inputStream) {
            return (CSUploadClubICon) PARSER.parseFrom(inputStream);
        }

        public static CSUploadClubICon parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUploadClubICon) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSUploadClubICon parseDelimitedFrom(InputStream inputStream) {
            return (CSUploadClubICon) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSUploadClubICon parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUploadClubICon) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSUploadClubICon parseFrom(CodedInputStream codedInputStream) {
            return (CSUploadClubICon) PARSER.parseFrom(codedInputStream);
        }

        public static CSUploadClubICon parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUploadClubICon) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSUploadClubICon cSUploadClubICon) {
            return newBuilder().mergeFrom(cSUploadClubICon);
        }
    }

    public interface ClubInfoOrBuilder extends MessageOrBuilder {
        ClubBaseInfo getStClubBaseInfo();

        ClubBaseInfoOrBuilder getStClubBaseInfoOrBuilder();

        ClubUserInfo getVClubUserInfos(int i);

        int getVClubUserInfosCount();

        List<ClubUserInfo> getVClubUserInfosList();

        ClubUserInfoOrBuilder getVClubUserInfosOrBuilder(int i);

        List<? extends ClubUserInfoOrBuilder> getVClubUserInfosOrBuilderList();

        GameRoomBaseInfo getVGameRoomBaseInfos(int i);

        int getVGameRoomBaseInfosCount();

        List<GameRoomBaseInfo> getVGameRoomBaseInfosList();

        GameRoomBaseInfoOrBuilder getVGameRoomBaseInfosOrBuilder(int i);

        List<? extends GameRoomBaseInfoOrBuilder> getVGameRoomBaseInfosOrBuilderList();

        TexasPoker$SNGGameRoomBaseInfo getVSNGGameRoomBaseInfos(int i);

        int getVSNGGameRoomBaseInfosCount();

        List<TexasPoker$SNGGameRoomBaseInfo> getVSNGGameRoomBaseInfosList();

        TexasPoker$SNGGameRoomBaseInfoOrBuilder getVSNGGameRoomBaseInfosOrBuilder(int i);

        List<? extends TexasPoker$SNGGameRoomBaseInfoOrBuilder> getVSNGGameRoomBaseInfosOrBuilderList();

        boolean hasStClubBaseInfo();
    }

    public static final class ClubInfo extends GeneratedMessage implements ClubInfoOrBuilder {
        public static Parser<ClubInfo> PARSER = null;
        public static final int STCLUBBASEINFO_FIELD_NUMBER = 1;
        public static final int VCLUBUSERINFOS_FIELD_NUMBER = 2;
        public static final int VGAMEROOMBASEINFOS_FIELD_NUMBER = 3;
        public static final int VSNGGAMEROOMBASEINFOS_FIELD_NUMBER = 4;
        private static final ClubInfo defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private ClubBaseInfo stClubBaseInfo_;
        private final UnknownFieldSet unknownFields;
        private List<ClubUserInfo> vClubUserInfos_;
        private List<GameRoomBaseInfo> vGameRoomBaseInfos_;
        private List<TexasPoker$SNGGameRoomBaseInfo> vSNGGameRoomBaseInfos_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.ClubInfo.1 */
        class C02101 extends AbstractParser<ClubInfo> {
            static {
                fixHelper.fixfunc(new int[]{12165, 12166});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02101();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements ClubInfoOrBuilder {
            private int bitField0_;
            private SingleFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> stClubBaseInfoBuilder_;
            private ClubBaseInfo stClubBaseInfo_;
            private RepeatedFieldBuilder<ClubUserInfo, Builder, ClubUserInfoOrBuilder> vClubUserInfosBuilder_;
            private List<ClubUserInfo> vClubUserInfos_;
            private RepeatedFieldBuilder<GameRoomBaseInfo, com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder, GameRoomBaseInfoOrBuilder> vGameRoomBaseInfosBuilder_;
            private List<GameRoomBaseInfo> vGameRoomBaseInfos_;
            private RepeatedFieldBuilder<TexasPoker$SNGGameRoomBaseInfo, com.texaspoker.moment.TexasPoker$SNGGameRoomBaseInfo.Builder, TexasPoker$SNGGameRoomBaseInfoOrBuilder> vSNGGameRoomBaseInfosBuilder_;
            private List<TexasPoker$SNGGameRoomBaseInfo> vSNGGameRoomBaseInfos_;

            static {
                fixHelper.fixfunc(new int[]{12919, 12920, 12921, 12922, 12923, 12924, 12925, 12926, 12927, 12928, 12929, 12930, 12931, 12932, 12933, 12934, 12935, 12936, 12937, 12938, 12939, 12940, 12941, 12942, 12943, 12944, 12945, 12946, 12947, 12948, 12949, 12950, 12951, 12952, 12953, 12954, 12955, 12956, 12957, 12958, 12959, 12960, 12961, 12962, 12963, 12964, 12965, 12966, 12967, 12968, 12969, 12970, 12971, 12972, 12973, 12974, 12975, 12976, 12977, 12978, 12979, 12980, 12981, 12982, 12983, 12984, 12985, 12986, 12987, 12988, 12989, 12990, 12991, 12992, 12993, 12994, 12995, 12996, 12997, 12998, 12999, 13000, 13001, 13002, 13003, 13004, 13005, 13006, 13007, 13008, 13009, 13010, 13011, 13012, 13013, 13014, 13015, 13016, 13017, 13018, 13019});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVClubUserInfosIsMutable();

            private native void ensureVGameRoomBaseInfosIsMutable();

            private native void ensureVSNGGameRoomBaseInfosIsMutable();

            private native SingleFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> getStClubBaseInfoFieldBuilder();

            private native RepeatedFieldBuilder<ClubUserInfo, Builder, ClubUserInfoOrBuilder> getVClubUserInfosFieldBuilder();

            private native RepeatedFieldBuilder<GameRoomBaseInfo, com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder, GameRoomBaseInfoOrBuilder> getVGameRoomBaseInfosFieldBuilder();

            private native RepeatedFieldBuilder<TexasPoker$SNGGameRoomBaseInfo, com.texaspoker.moment.TexasPoker$SNGGameRoomBaseInfo.Builder, TexasPoker$SNGGameRoomBaseInfoOrBuilder> getVSNGGameRoomBaseInfosFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVClubUserInfos(Iterable<? extends ClubUserInfo> iterable);

            public final native Builder addAllVGameRoomBaseInfos(Iterable<? extends GameRoomBaseInfo> iterable);

            public final native Builder addAllVSNGGameRoomBaseInfos(Iterable<? extends TexasPoker$SNGGameRoomBaseInfo> iterable);

            public final native Builder addVClubUserInfos(int i, Builder builder);

            public final native Builder addVClubUserInfos(int i, ClubUserInfo clubUserInfo);

            public final native Builder addVClubUserInfos(Builder builder);

            public final native Builder addVClubUserInfos(ClubUserInfo clubUserInfo);

            public final native Builder addVClubUserInfosBuilder();

            public final native Builder addVClubUserInfosBuilder(int i);

            public final native Builder addVGameRoomBaseInfos(int i, com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder builder);

            public final native Builder addVGameRoomBaseInfos(int i, GameRoomBaseInfo gameRoomBaseInfo);

            public final native Builder addVGameRoomBaseInfos(com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder builder);

            public final native Builder addVGameRoomBaseInfos(GameRoomBaseInfo gameRoomBaseInfo);

            public final native com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder addVGameRoomBaseInfosBuilder();

            public final native com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder addVGameRoomBaseInfosBuilder(int i);

            public final native Builder addVSNGGameRoomBaseInfos(int i, com.texaspoker.moment.TexasPoker$SNGGameRoomBaseInfo.Builder builder);

            public final native Builder addVSNGGameRoomBaseInfos(int i, TexasPoker$SNGGameRoomBaseInfo texasPoker$SNGGameRoomBaseInfo);

            public final native Builder addVSNGGameRoomBaseInfos(com.texaspoker.moment.TexasPoker$SNGGameRoomBaseInfo.Builder builder);

            public final native Builder addVSNGGameRoomBaseInfos(TexasPoker$SNGGameRoomBaseInfo texasPoker$SNGGameRoomBaseInfo);

            public final native com.texaspoker.moment.TexasPoker$SNGGameRoomBaseInfo.Builder addVSNGGameRoomBaseInfosBuilder();

            public final native com.texaspoker.moment.TexasPoker$SNGGameRoomBaseInfo.Builder addVSNGGameRoomBaseInfosBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6357build();

            public final native ClubInfo m6358build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6359buildPartial();

            public final native ClubInfo m6360buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6361clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6362clear();

            public final native Builder m6363clear();

            public final native Builder clearStClubBaseInfo();

            public final native Builder clearVClubUserInfos();

            public final native Builder clearVGameRoomBaseInfos();

            public final native Builder clearVSNGGameRoomBaseInfos();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6364clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6365clone();

            public final native Builder m6366clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6367getDefaultInstanceForType();

            public final native ClubInfo m6368getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ClubBaseInfo getStClubBaseInfo();

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder getStClubBaseInfoBuilder();

            public final native ClubBaseInfoOrBuilder getStClubBaseInfoOrBuilder();

            public final native ClubUserInfo getVClubUserInfos(int i);

            public final native Builder getVClubUserInfosBuilder(int i);

            public final native List<Builder> getVClubUserInfosBuilderList();

            public final native int getVClubUserInfosCount();

            public final native List<ClubUserInfo> getVClubUserInfosList();

            public final native ClubUserInfoOrBuilder getVClubUserInfosOrBuilder(int i);

            public final native List<? extends ClubUserInfoOrBuilder> getVClubUserInfosOrBuilderList();

            public final native GameRoomBaseInfo getVGameRoomBaseInfos(int i);

            public final native com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder getVGameRoomBaseInfosBuilder(int i);

            public final native List<com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder> getVGameRoomBaseInfosBuilderList();

            public final native int getVGameRoomBaseInfosCount();

            public final native List<GameRoomBaseInfo> getVGameRoomBaseInfosList();

            public final native GameRoomBaseInfoOrBuilder getVGameRoomBaseInfosOrBuilder(int i);

            public final native List<? extends GameRoomBaseInfoOrBuilder> getVGameRoomBaseInfosOrBuilderList();

            public final native TexasPoker$SNGGameRoomBaseInfo getVSNGGameRoomBaseInfos(int i);

            public final native com.texaspoker.moment.TexasPoker$SNGGameRoomBaseInfo.Builder getVSNGGameRoomBaseInfosBuilder(int i);

            public final native List<com.texaspoker.moment.TexasPoker$SNGGameRoomBaseInfo.Builder> getVSNGGameRoomBaseInfosBuilderList();

            public final native int getVSNGGameRoomBaseInfosCount();

            public final native List<TexasPoker$SNGGameRoomBaseInfo> getVSNGGameRoomBaseInfosList();

            public final native TexasPoker$SNGGameRoomBaseInfoOrBuilder getVSNGGameRoomBaseInfosOrBuilder(int i);

            public final native List<? extends TexasPoker$SNGGameRoomBaseInfoOrBuilder> getVSNGGameRoomBaseInfosOrBuilderList();

            public final native boolean hasStClubBaseInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6369mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6370mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6371mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6372mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6373mergeFrom(Message message);

            public final native Builder mergeFrom(ClubInfo clubInfo);

            public final native Builder mergeStClubBaseInfo(ClubBaseInfo clubBaseInfo);

            public final native Builder removeVClubUserInfos(int i);

            public final native Builder removeVGameRoomBaseInfos(int i);

            public final native Builder removeVSNGGameRoomBaseInfos(int i);

            public final native Builder setStClubBaseInfo(com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder setStClubBaseInfo(ClubBaseInfo clubBaseInfo);

            public final native Builder setVClubUserInfos(int i, Builder builder);

            public final native Builder setVClubUserInfos(int i, ClubUserInfo clubUserInfo);

            public final native Builder setVGameRoomBaseInfos(int i, com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder builder);

            public final native Builder setVGameRoomBaseInfos(int i, GameRoomBaseInfo gameRoomBaseInfo);

            public final native Builder setVSNGGameRoomBaseInfos(int i, com.texaspoker.moment.TexasPoker$SNGGameRoomBaseInfo.Builder builder);

            public final native Builder setVSNGGameRoomBaseInfos(int i, TexasPoker$SNGGameRoomBaseInfo texasPoker$SNGGameRoomBaseInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.f150c;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{24731, 24732, 24733, 24734, 24735, 24736, 24737, 24738, 24739, 24740, 24741, 24742, 24743, 24744, 24745, 24746, 24747, 24748, 24749, 24750, 24751, 24752, 24753, 24754, 24755, 24756, 24757, 24758, 24759, 24760, 24761, 24762, 24763, 24764, 24765, 24766, 24767, 24768, 24769, 24770, 24771, 24772});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native ClubInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ ClubInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, ClubInfo clubInfo);

        private native ClubInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ ClubInfo(com.google.protobuf.GeneratedMessage.Builder builder, ClubInfo clubInfo);

        private native ClubInfo(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6350getDefaultInstanceForType();

        public final native ClubInfo m6351getDefaultInstanceForType();

        public final native Parser<ClubInfo> getParserForType();

        public final native int getSerializedSize();

        public final native ClubBaseInfo getStClubBaseInfo();

        public final native ClubBaseInfoOrBuilder getStClubBaseInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native ClubUserInfo getVClubUserInfos(int i);

        public final native int getVClubUserInfosCount();

        public final native List<ClubUserInfo> getVClubUserInfosList();

        public final native ClubUserInfoOrBuilder getVClubUserInfosOrBuilder(int i);

        public final native List<? extends ClubUserInfoOrBuilder> getVClubUserInfosOrBuilderList();

        public final native GameRoomBaseInfo getVGameRoomBaseInfos(int i);

        public final native int getVGameRoomBaseInfosCount();

        public final native List<GameRoomBaseInfo> getVGameRoomBaseInfosList();

        public final native GameRoomBaseInfoOrBuilder getVGameRoomBaseInfosOrBuilder(int i);

        public final native List<? extends GameRoomBaseInfoOrBuilder> getVGameRoomBaseInfosOrBuilderList();

        public final native TexasPoker$SNGGameRoomBaseInfo getVSNGGameRoomBaseInfos(int i);

        public final native int getVSNGGameRoomBaseInfosCount();

        public final native List<TexasPoker$SNGGameRoomBaseInfo> getVSNGGameRoomBaseInfosList();

        public final native TexasPoker$SNGGameRoomBaseInfoOrBuilder getVSNGGameRoomBaseInfosOrBuilder(int i);

        public final native List<? extends TexasPoker$SNGGameRoomBaseInfoOrBuilder> getVSNGGameRoomBaseInfosOrBuilderList();

        public final native boolean hasStClubBaseInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6352newBuilderForType();

        public final native Builder m6353newBuilderForType();

        protected final native Builder m6354newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6355toBuilder();

        public final native Builder m6356toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static ClubInfo getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.f150c;
        }

        static void __clinit__() {
            PARSER = new C02101();
            ClubInfo clubInfo = new ClubInfo(true);
            defaultInstance = clubInfo;
            clubInfo.initFields();
        }

        public static ClubInfo parseFrom(ByteString byteString) {
            return (ClubInfo) PARSER.parseFrom(byteString);
        }

        public static ClubInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ClubInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ClubInfo parseFrom(byte[] bArr) {
            return (ClubInfo) PARSER.parseFrom(bArr);
        }

        public static ClubInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ClubInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ClubInfo parseFrom(InputStream inputStream) {
            return (ClubInfo) PARSER.parseFrom(inputStream);
        }

        public static ClubInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClubInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static ClubInfo parseDelimitedFrom(InputStream inputStream) {
            return (ClubInfo) PARSER.parseDelimitedFrom(inputStream);
        }

        public static ClubInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClubInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static ClubInfo parseFrom(CodedInputStream codedInputStream) {
            return (ClubInfo) PARSER.parseFrom(codedInputStream);
        }

        public static ClubInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClubInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(ClubInfo clubInfo) {
            return newBuilder().mergeFrom(clubInfo);
        }
    }

    public interface ClubManagerBaseInfoOrBuilder extends MessageOrBuilder {
        int getBManager();

        ClubBaseInfo getStClubBaseInfo();

        ClubBaseInfoOrBuilder getStClubBaseInfoOrBuilder();

        boolean hasBManager();

        boolean hasStClubBaseInfo();
    }

    public static final class ClubManagerBaseInfo extends GeneratedMessage implements ClubManagerBaseInfoOrBuilder {
        public static final int BMANAGER_FIELD_NUMBER = 2;
        public static Parser<ClubManagerBaseInfo> PARSER = null;
        public static final int STCLUBBASEINFO_FIELD_NUMBER = 1;
        private static final ClubManagerBaseInfo defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bManager_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private ClubBaseInfo stClubBaseInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.ClubManagerBaseInfo.1 */
        class C02111 extends AbstractParser<ClubManagerBaseInfo> {
            static {
                fixHelper.fixfunc(new int[]{3868, 3869});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02111();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements ClubManagerBaseInfoOrBuilder {
            private int bManager_;
            private int bitField0_;
            private SingleFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> stClubBaseInfoBuilder_;
            private ClubBaseInfo stClubBaseInfo_;

            static {
                fixHelper.fixfunc(new int[]{6770, 6771, 6772, 6773, 6774, 6775, 6776, 6777, 6778, 6779, 6780, 6781, 6782, 6783, 6784, 6785, 6786, 6787, 6788, 6789, 6790, 6791, 6792, 6793, 6794, 6795, 6796, 6797, 6798, 6799, 6800, 6801, 6802, 6803, 6804, 6805, 6806, 6807, 6808, 6809, 6810, 6811, 6812, 6813, 6814});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> getStClubBaseInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6381build();

            public final native ClubManagerBaseInfo m6382build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6383buildPartial();

            public final native ClubManagerBaseInfo m6384buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6385clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6386clear();

            public final native Builder m6387clear();

            public final native Builder clearBManager();

            public final native Builder clearStClubBaseInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6388clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6389clone();

            public final native Builder m6390clone();

            public final native int getBManager();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6391getDefaultInstanceForType();

            public final native ClubManagerBaseInfo m6392getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ClubBaseInfo getStClubBaseInfo();

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder getStClubBaseInfoBuilder();

            public final native ClubBaseInfoOrBuilder getStClubBaseInfoOrBuilder();

            public final native boolean hasBManager();

            public final native boolean hasStClubBaseInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6393mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6394mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6395mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6396mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6397mergeFrom(Message message);

            public final native Builder mergeFrom(ClubManagerBaseInfo clubManagerBaseInfo);

            public final native Builder mergeStClubBaseInfo(ClubBaseInfo clubBaseInfo);

            public final native Builder setBManager(int i);

            public final native Builder setStClubBaseInfo(com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder setStClubBaseInfo(ClubBaseInfo clubBaseInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.ae;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{TEXAS_CMD.Cmd_SCGetUserInfoV2Rsp_VALUE, TEXAS_CMD.Cmd_SCGetSystemMsgsRsp_VALUE, TEXAS_CMD.Cmd_SCGetSystemMsgByIDRsp_VALUE, TEXAS_CMD.Cmd_SCGetBenefitsRsp_VALUE, TEXAS_CMD.Cmd_SCGetSystemMsgsByTypeCMSRsp_VALUE, TEXAS_CMD.Cmd_SCGetSystemMsgByIDCMSRsp_VALUE, TEXAS_CMD.Cmd_SCSendSystemMsgCMSRsp_VALUE, TEXAS_CMD.Cmd_SCAddClubMaxMemberRsp_VALUE, TEXAS_CMD.Cmd_SCAddClubFundRsp_VALUE, TEXAS_CMD.Cmd_SCGetClubSellingItemsRsp_VALUE, TEXAS_CMD.Cmd_SCBuyNicknameRsp_VALUE, TEXAS_CMD.Cmd_SCCheckNicknameStatusRsp_VALUE, TEXAS_CMD.Cmd_SCResetBuyinRatioRsp_VALUE, TEXAS_CMD.Cmd_SCGetUserBaseInfoRsp_VALUE, TEXAS_CMD.Cmd_SCSaveFavoriteV2Rsp_VALUE, TEXAS_CMD.Cmd_SCGetFavoriteListV2Rsp_VALUE, TEXAS_CMD.Cmd_SCGetLastPokerHandResultRsp_VALUE, TEXAS_CMD.Cmd_SCGetAllPokerHistoryRsp_VALUE, TEXAS_CMD.Cmd_SCRemoveFavoriteV2Rsp_VALUE, TEXAS_CMD.Cmd_SCRenameFavoriteRsp_VALUE, TEXAS_CMD.Cmd_CSBuyinControlMsgRsp_VALUE, TEXAS_CMD.Cmd_SCBuyinActionRsp_VALUE, TEXAS_CMD.Cmd_SCSetBuyinControlStateRsp_VALUE, TEXAS_CMD.Cmd_SCPauseGameRsp_VALUE, 10161, TEXAS_CMD.Cmd_SCGetAllBuyinControlsRsp_VALUE, TEXAS_CMD.Cmd_SCRenameFPokerHistoryRsp_VALUE, TEXAS_CMD.Cmd_SCCreateSNGGameRoomRsp_VALUE, TEXAS_CMD.Cmd_SCSignUpSNGGameRoomRsp_VALUE});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native ClubManagerBaseInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ ClubManagerBaseInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, ClubManagerBaseInfo clubManagerBaseInfo);

        private native ClubManagerBaseInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ ClubManagerBaseInfo(com.google.protobuf.GeneratedMessage.Builder builder, ClubManagerBaseInfo clubManagerBaseInfo);

        private native ClubManagerBaseInfo(boolean z);

        private native void initFields();

        public final native int getBManager();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6374getDefaultInstanceForType();

        public final native ClubManagerBaseInfo m6375getDefaultInstanceForType();

        public final native Parser<ClubManagerBaseInfo> getParserForType();

        public final native int getSerializedSize();

        public final native ClubBaseInfo getStClubBaseInfo();

        public final native ClubBaseInfoOrBuilder getStClubBaseInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasBManager();

        public final native boolean hasStClubBaseInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6376newBuilderForType();

        public final native Builder m6377newBuilderForType();

        protected final native Builder m6378newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6379toBuilder();

        public final native Builder m6380toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static ClubManagerBaseInfo getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.ae;
        }

        static void __clinit__() {
            PARSER = new C02111();
            ClubManagerBaseInfo clubManagerBaseInfo = new ClubManagerBaseInfo(true);
            defaultInstance = clubManagerBaseInfo;
            clubManagerBaseInfo.initFields();
        }

        public static ClubManagerBaseInfo parseFrom(ByteString byteString) {
            return (ClubManagerBaseInfo) PARSER.parseFrom(byteString);
        }

        public static ClubManagerBaseInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ClubManagerBaseInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ClubManagerBaseInfo parseFrom(byte[] bArr) {
            return (ClubManagerBaseInfo) PARSER.parseFrom(bArr);
        }

        public static ClubManagerBaseInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ClubManagerBaseInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ClubManagerBaseInfo parseFrom(InputStream inputStream) {
            return (ClubManagerBaseInfo) PARSER.parseFrom(inputStream);
        }

        public static ClubManagerBaseInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClubManagerBaseInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static ClubManagerBaseInfo parseDelimitedFrom(InputStream inputStream) {
            return (ClubManagerBaseInfo) PARSER.parseDelimitedFrom(inputStream);
        }

        public static ClubManagerBaseInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClubManagerBaseInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static ClubManagerBaseInfo parseFrom(CodedInputStream codedInputStream) {
            return (ClubManagerBaseInfo) PARSER.parseFrom(codedInputStream);
        }

        public static ClubManagerBaseInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClubManagerBaseInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(ClubManagerBaseInfo clubManagerBaseInfo) {
            return newBuilder().mergeFrom(clubManagerBaseInfo);
        }
    }

    public interface ClubUserInfoOrBuilder extends MessageOrBuilder {
        CLUB_USER_LEVEL getEClubUserLevel();

        UserBaseInfoNet getStUserBaseInfo();

        UserBaseInfoNetOrBuilder getStUserBaseInfoOrBuilder();

        boolean hasEClubUserLevel();

        boolean hasStUserBaseInfo();
    }

    public static final class ClubUserInfo extends GeneratedMessage implements ClubUserInfoOrBuilder {
        public static final int ECLUBUSERLEVEL_FIELD_NUMBER = 2;
        public static Parser<ClubUserInfo> PARSER = null;
        public static final int STUSERBASEINFO_FIELD_NUMBER = 1;
        private static final ClubUserInfo defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private CLUB_USER_LEVEL eClubUserLevel_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private UserBaseInfoNet stUserBaseInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.ClubUserInfo.1 */
        class C02121 extends AbstractParser<ClubUserInfo> {
            static {
                fixHelper.fixfunc(new int[]{25288, 25289});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02121();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements ClubUserInfoOrBuilder {
            private int bitField0_;
            private CLUB_USER_LEVEL eClubUserLevel_;
            private SingleFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> stUserBaseInfoBuilder_;
            private UserBaseInfoNet stUserBaseInfo_;

            static {
                fixHelper.fixfunc(new int[]{16093, 16094, 16095, 16096, 16097, 16098, 16099, 16100, 16101, 16102, 16103, 16104, 16105, 16106, 16107, 16108, 16109, 16110, 16111, 16112, 16113, 16114, 16115, 16116, 16117, 16118, 16119, 16120, 16121, 16122, 16123, 16124, 16125, 16126, 16127, 16128, 16129, 16130, 16131, 16132, 16133, 16134, 16135, 16136, 16137});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> getStUserBaseInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6405build();

            public final native ClubUserInfo m6406build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6407buildPartial();

            public final native ClubUserInfo m6408buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6409clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6410clear();

            public final native Builder m6411clear();

            public final native Builder clearEClubUserLevel();

            public final native Builder clearStUserBaseInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6412clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6413clone();

            public final native Builder m6414clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6415getDefaultInstanceForType();

            public final native ClubUserInfo m6416getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native CLUB_USER_LEVEL getEClubUserLevel();

            public final native UserBaseInfoNet getStUserBaseInfo();

            public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder getStUserBaseInfoBuilder();

            public final native UserBaseInfoNetOrBuilder getStUserBaseInfoOrBuilder();

            public final native boolean hasEClubUserLevel();

            public final native boolean hasStUserBaseInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6417mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6418mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6419mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6420mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6421mergeFrom(Message message);

            public final native Builder mergeFrom(ClubUserInfo clubUserInfo);

            public final native Builder mergeStUserBaseInfo(UserBaseInfoNet userBaseInfoNet);

            public final native Builder setEClubUserLevel(CLUB_USER_LEVEL club_user_level);

            public final native Builder setStUserBaseInfo(com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

            public final native Builder setStUserBaseInfo(UserBaseInfoNet userBaseInfoNet);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.f148a;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{26636, 26637, 26638, 26639, 26640, 26641, 26642, 26643, 26644, 26645, 26646, 26647, 26648, 26649, 26650, 26651, 26652, 26653, 26654, 26655, 26656, 26657, 26658, 26659, 26660, 26661, 26662, 26663, 26664});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native ClubUserInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ ClubUserInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, ClubUserInfo clubUserInfo);

        private native ClubUserInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ ClubUserInfo(com.google.protobuf.GeneratedMessage.Builder builder, ClubUserInfo clubUserInfo);

        private native ClubUserInfo(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6398getDefaultInstanceForType();

        public final native ClubUserInfo m6399getDefaultInstanceForType();

        public final native CLUB_USER_LEVEL getEClubUserLevel();

        public final native Parser<ClubUserInfo> getParserForType();

        public final native int getSerializedSize();

        public final native UserBaseInfoNet getStUserBaseInfo();

        public final native UserBaseInfoNetOrBuilder getStUserBaseInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEClubUserLevel();

        public final native boolean hasStUserBaseInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6400newBuilderForType();

        public final native Builder m6401newBuilderForType();

        protected final native Builder m6402newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6403toBuilder();

        public final native Builder m6404toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static ClubUserInfo getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.f148a;
        }

        static void __clinit__() {
            PARSER = new C02121();
            ClubUserInfo clubUserInfo = new ClubUserInfo(true);
            defaultInstance = clubUserInfo;
            clubUserInfo.initFields();
        }

        public static ClubUserInfo parseFrom(ByteString byteString) {
            return (ClubUserInfo) PARSER.parseFrom(byteString);
        }

        public static ClubUserInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ClubUserInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ClubUserInfo parseFrom(byte[] bArr) {
            return (ClubUserInfo) PARSER.parseFrom(bArr);
        }

        public static ClubUserInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ClubUserInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ClubUserInfo parseFrom(InputStream inputStream) {
            return (ClubUserInfo) PARSER.parseFrom(inputStream);
        }

        public static ClubUserInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClubUserInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static ClubUserInfo parseDelimitedFrom(InputStream inputStream) {
            return (ClubUserInfo) PARSER.parseDelimitedFrom(inputStream);
        }

        public static ClubUserInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClubUserInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static ClubUserInfo parseFrom(CodedInputStream codedInputStream) {
            return (ClubUserInfo) PARSER.parseFrom(codedInputStream);
        }

        public static ClubUserInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClubUserInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(ClubUserInfo clubUserInfo) {
            return newBuilder().mergeFrom(clubUserInfo);
        }
    }

    public enum FUND_BILL_TO_TYPE implements ProtocolMessageEnum {
        ;
        
        public static final int FUND_BILL_TO_TYPE_CLUB_VALUE = 2;
        public static final int FUND_BILL_TO_TYPE_USER_VALUE = 1;
        private static final FUND_BILL_TO_TYPE[] VALUES = null;
        private static EnumLiteMap<FUND_BILL_TO_TYPE> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.FUND_BILL_TO_TYPE.1 */
        class C02131 implements EnumLiteMap<FUND_BILL_TO_TYPE> {
            static {
                fixHelper.fixfunc(new int[]{25015, 25016});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02131();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{6429, 6430, 6431, 6432});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native FUND_BILL_TO_TYPE(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            FUND_BILL_TO_TYPE_USER = new FUND_BILL_TO_TYPE("FUND_BILL_TO_TYPE_USER", 0, 0, FUND_BILL_TO_TYPE_USER_VALUE);
            FUND_BILL_TO_TYPE_CLUB = new FUND_BILL_TO_TYPE("FUND_BILL_TO_TYPE_CLUB", FUND_BILL_TO_TYPE_USER_VALUE, FUND_BILL_TO_TYPE_USER_VALUE, FUND_BILL_TO_TYPE_CLUB_VALUE);
            FUND_BILL_TO_TYPE[] fund_bill_to_typeArr = new FUND_BILL_TO_TYPE[FUND_BILL_TO_TYPE_CLUB_VALUE];
            fund_bill_to_typeArr[0] = FUND_BILL_TO_TYPE_USER;
            fund_bill_to_typeArr[FUND_BILL_TO_TYPE_USER_VALUE] = FUND_BILL_TO_TYPE_CLUB;
            ENUM$VALUES = fund_bill_to_typeArr;
            internalValueMap = new C02131();
            VALUES = values();
        }

        public static FUND_BILL_TO_TYPE valueOf(int i) {
            switch (i) {
                case FUND_BILL_TO_TYPE_USER_VALUE:
                    return FUND_BILL_TO_TYPE_USER;
                case FUND_BILL_TO_TYPE_CLUB_VALUE:
                    return FUND_BILL_TO_TYPE_CLUB;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<FUND_BILL_TO_TYPE> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerHttpClub.m152a().getEnumTypes().get(3);
        }

        public static FUND_BILL_TO_TYPE valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum FUND_BILL_TYPE implements ProtocolMessageEnum {
        ;
        
        public static final int FUND_BILL_IN_VALUE = 1;
        public static final int FUND_BILL_MEMBER_IN_VALUE = 3;
        public static final int FUND_BILL_OUT_VALUE = 2;
        private static final FUND_BILL_TYPE[] VALUES = null;
        private static EnumLiteMap<FUND_BILL_TYPE> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.FUND_BILL_TYPE.1 */
        class C02141 implements EnumLiteMap<FUND_BILL_TYPE> {
            static {
                fixHelper.fixfunc(new int[]{TEXAS_CMD.Cmd_SCMiniGameDoubleRsp_VALUE, TEXAS_CMD.Cmd_SCMiniGameCheckRsp_VALUE});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02141();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{26432, 26433, 26434, 26435});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native FUND_BILL_TYPE(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            FUND_BILL_IN = new FUND_BILL_TYPE("FUND_BILL_IN", 0, 0, FUND_BILL_IN_VALUE);
            FUND_BILL_OUT = new FUND_BILL_TYPE("FUND_BILL_OUT", FUND_BILL_IN_VALUE, FUND_BILL_IN_VALUE, FUND_BILL_OUT_VALUE);
            FUND_BILL_MEMBER_IN = new FUND_BILL_TYPE("FUND_BILL_MEMBER_IN", FUND_BILL_OUT_VALUE, FUND_BILL_OUT_VALUE, FUND_BILL_MEMBER_IN_VALUE);
            FUND_BILL_TYPE[] fund_bill_typeArr = new FUND_BILL_TYPE[FUND_BILL_MEMBER_IN_VALUE];
            fund_bill_typeArr[0] = FUND_BILL_IN;
            fund_bill_typeArr[FUND_BILL_IN_VALUE] = FUND_BILL_OUT;
            fund_bill_typeArr[FUND_BILL_OUT_VALUE] = FUND_BILL_MEMBER_IN;
            ENUM$VALUES = fund_bill_typeArr;
            internalValueMap = new C02141();
            VALUES = values();
        }

        public static FUND_BILL_TYPE valueOf(int i) {
            switch (i) {
                case FUND_BILL_IN_VALUE:
                    return FUND_BILL_IN;
                case FUND_BILL_OUT_VALUE:
                    return FUND_BILL_OUT;
                case FUND_BILL_MEMBER_IN_VALUE:
                    return FUND_BILL_MEMBER_IN;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<FUND_BILL_TYPE> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerHttpClub.m152a().getEnumTypes().get(4);
        }

        public static FUND_BILL_TYPE valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public interface FundBillInfoOrBuilder extends MessageOrBuilder {
        FUND_BILL_TO_TYPE getEFundBillToType();

        FUND_BILL_TYPE getEFundBillType();

        long getLCreateTime();

        long getLFund();

        BillInfoNet getStBillInfoNet();

        BillInfoNetOrBuilder getStBillInfoNetOrBuilder();

        ClubInfo getStClubInfo();

        ClubInfoOrBuilder getStClubInfoOrBuilder();

        UserBaseInfoNet getStUserBaseInfoNet(int i);

        int getStUserBaseInfoNetCount();

        List<UserBaseInfoNet> getStUserBaseInfoNetList();

        UserBaseInfoNetOrBuilder getStUserBaseInfoNetOrBuilder(int i);

        List<? extends UserBaseInfoNetOrBuilder> getStUserBaseInfoNetOrBuilderList();

        boolean hasEFundBillToType();

        boolean hasEFundBillType();

        boolean hasLCreateTime();

        boolean hasLFund();

        boolean hasStBillInfoNet();

        boolean hasStClubInfo();
    }

    public static final class FundBillInfo extends GeneratedMessage implements FundBillInfoOrBuilder {
        public static final int EFUNDBILLTOTYPE_FIELD_NUMBER = 4;
        public static final int EFUNDBILLTYPE_FIELD_NUMBER = 2;
        public static final int LCREATETIME_FIELD_NUMBER = 1;
        public static final int LFUND_FIELD_NUMBER = 3;
        public static Parser<FundBillInfo> PARSER = null;
        public static final int STBILLINFONET_FIELD_NUMBER = 7;
        public static final int STCLUBINFO_FIELD_NUMBER = 6;
        public static final int STUSERBASEINFONET_FIELD_NUMBER = 5;
        private static final FundBillInfo defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private FUND_BILL_TO_TYPE eFundBillToType_;
        private FUND_BILL_TYPE eFundBillType_;
        private long lCreateTime_;
        private long lFund_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private BillInfoNet stBillInfoNet_;
        private ClubInfo stClubInfo_;
        private List<UserBaseInfoNet> stUserBaseInfoNet_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.FundBillInfo.1 */
        class C02151 extends AbstractParser<FundBillInfo> {
            static {
                fixHelper.fixfunc(new int[]{26771, 26772});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02151();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements FundBillInfoOrBuilder {
            private int bitField0_;
            private FUND_BILL_TO_TYPE eFundBillToType_;
            private FUND_BILL_TYPE eFundBillType_;
            private long lCreateTime_;
            private long lFund_;
            private SingleFieldBuilder<BillInfoNet, com.texaspoker.moment.TexasPokerHttpBill.BillInfoNet.Builder, BillInfoNetOrBuilder> stBillInfoNetBuilder_;
            private BillInfoNet stBillInfoNet_;
            private SingleFieldBuilder<ClubInfo, Builder, ClubInfoOrBuilder> stClubInfoBuilder_;
            private ClubInfo stClubInfo_;
            private RepeatedFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> stUserBaseInfoNetBuilder_;
            private List<UserBaseInfoNet> stUserBaseInfoNet_;

            static {
                fixHelper.fixfunc(new int[]{23803, 23804, 23805, 23806, 23807, 23808, 23809, 23810, 23811, 23812, 23813, 23814, 23815, 23816, 23817, 23818, 23819, 23820, 23821, 23822, 23823, 23824, 23825, 23826, 23827, 23828, 23829, 23830, 23831, 23832, 23833, 23834, 23835, 23836, 23837, 23838, 23839, 23840, 23841, 23842, 23843, 23844, 23845, 23846, 23847, 23848, 23849, 23850, 23851, 23852, 23853, 23854, 23855, 23856, 23857, 23858, 23859, 23860, 23861, 23862, 23863, 23864, 23865, 23866, 23867, 23868, 23869, 23870, 23871, 23872, 23873, 23874, 23875, 23876, 23877, 23878, 23879, 23880, 23881, 23882, 23883, 23884, 23885, 23886, 23887, 23888});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureStUserBaseInfoNetIsMutable();

            private native SingleFieldBuilder<BillInfoNet, com.texaspoker.moment.TexasPokerHttpBill.BillInfoNet.Builder, BillInfoNetOrBuilder> getStBillInfoNetFieldBuilder();

            private native SingleFieldBuilder<ClubInfo, Builder, ClubInfoOrBuilder> getStClubInfoFieldBuilder();

            private native RepeatedFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> getStUserBaseInfoNetFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllStUserBaseInfoNet(Iterable<? extends UserBaseInfoNet> iterable);

            public final native Builder addStUserBaseInfoNet(int i, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

            public final native Builder addStUserBaseInfoNet(int i, UserBaseInfoNet userBaseInfoNet);

            public final native Builder addStUserBaseInfoNet(com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

            public final native Builder addStUserBaseInfoNet(UserBaseInfoNet userBaseInfoNet);

            public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder addStUserBaseInfoNetBuilder();

            public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder addStUserBaseInfoNetBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6429build();

            public final native FundBillInfo m6430build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6431buildPartial();

            public final native FundBillInfo m6432buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6433clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6434clear();

            public final native Builder m6435clear();

            public final native Builder clearEFundBillToType();

            public final native Builder clearEFundBillType();

            public final native Builder clearLCreateTime();

            public final native Builder clearLFund();

            public final native Builder clearStBillInfoNet();

            public final native Builder clearStClubInfo();

            public final native Builder clearStUserBaseInfoNet();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6436clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6437clone();

            public final native Builder m6438clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6439getDefaultInstanceForType();

            public final native FundBillInfo m6440getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native FUND_BILL_TO_TYPE getEFundBillToType();

            public final native FUND_BILL_TYPE getEFundBillType();

            public final native long getLCreateTime();

            public final native long getLFund();

            public final native BillInfoNet getStBillInfoNet();

            public final native com.texaspoker.moment.TexasPokerHttpBill.BillInfoNet.Builder getStBillInfoNetBuilder();

            public final native BillInfoNetOrBuilder getStBillInfoNetOrBuilder();

            public final native ClubInfo getStClubInfo();

            public final native Builder getStClubInfoBuilder();

            public final native ClubInfoOrBuilder getStClubInfoOrBuilder();

            public final native UserBaseInfoNet getStUserBaseInfoNet(int i);

            public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder getStUserBaseInfoNetBuilder(int i);

            public final native List<com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder> getStUserBaseInfoNetBuilderList();

            public final native int getStUserBaseInfoNetCount();

            public final native List<UserBaseInfoNet> getStUserBaseInfoNetList();

            public final native UserBaseInfoNetOrBuilder getStUserBaseInfoNetOrBuilder(int i);

            public final native List<? extends UserBaseInfoNetOrBuilder> getStUserBaseInfoNetOrBuilderList();

            public final native boolean hasEFundBillToType();

            public final native boolean hasEFundBillType();

            public final native boolean hasLCreateTime();

            public final native boolean hasLFund();

            public final native boolean hasStBillInfoNet();

            public final native boolean hasStClubInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6441mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6442mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6443mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6444mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6445mergeFrom(Message message);

            public final native Builder mergeFrom(FundBillInfo fundBillInfo);

            public final native Builder mergeStBillInfoNet(BillInfoNet billInfoNet);

            public final native Builder mergeStClubInfo(ClubInfo clubInfo);

            public final native Builder removeStUserBaseInfoNet(int i);

            public final native Builder setEFundBillToType(FUND_BILL_TO_TYPE fund_bill_to_type);

            public final native Builder setEFundBillType(FUND_BILL_TYPE fund_bill_type);

            public final native Builder setLCreateTime(long j);

            public final native Builder setLFund(long j);

            public final native Builder setStBillInfoNet(com.texaspoker.moment.TexasPokerHttpBill.BillInfoNet.Builder builder);

            public final native Builder setStBillInfoNet(BillInfoNet billInfoNet);

            public final native Builder setStClubInfo(Builder builder);

            public final native Builder setStClubInfo(ClubInfo clubInfo);

            public final native Builder setStUserBaseInfoNet(int i, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

            public final native Builder setStUserBaseInfoNet(int i, UserBaseInfoNet userBaseInfoNet);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.ao;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{13747, 13748, 13749, 13750, 13751, 13752, 13753, 13754, 13755, 13756, 13757, 13758, 13759, 13760, 13761, 13762, 13763, 13764, 13765, 13766, 13767, 13768, 13769, 13770, 13771, 13772, 13773, 13774, 13775, 13776, 13777, 13778, 13779, 13780, 13781, 13782, 13783, 13784, 13785, 13786, 13787, 13788, 13789});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native FundBillInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ FundBillInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, FundBillInfo fundBillInfo);

        private native FundBillInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ FundBillInfo(com.google.protobuf.GeneratedMessage.Builder builder, FundBillInfo fundBillInfo);

        private native FundBillInfo(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6422getDefaultInstanceForType();

        public final native FundBillInfo m6423getDefaultInstanceForType();

        public final native FUND_BILL_TO_TYPE getEFundBillToType();

        public final native FUND_BILL_TYPE getEFundBillType();

        public final native long getLCreateTime();

        public final native long getLFund();

        public final native Parser<FundBillInfo> getParserForType();

        public final native int getSerializedSize();

        public final native BillInfoNet getStBillInfoNet();

        public final native BillInfoNetOrBuilder getStBillInfoNetOrBuilder();

        public final native ClubInfo getStClubInfo();

        public final native ClubInfoOrBuilder getStClubInfoOrBuilder();

        public final native UserBaseInfoNet getStUserBaseInfoNet(int i);

        public final native int getStUserBaseInfoNetCount();

        public final native List<UserBaseInfoNet> getStUserBaseInfoNetList();

        public final native UserBaseInfoNetOrBuilder getStUserBaseInfoNetOrBuilder(int i);

        public final native List<? extends UserBaseInfoNetOrBuilder> getStUserBaseInfoNetOrBuilderList();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEFundBillToType();

        public final native boolean hasEFundBillType();

        public final native boolean hasLCreateTime();

        public final native boolean hasLFund();

        public final native boolean hasStBillInfoNet();

        public final native boolean hasStClubInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6424newBuilderForType();

        public final native Builder m6425newBuilderForType();

        protected final native Builder m6426newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6427toBuilder();

        public final native Builder m6428toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static FundBillInfo getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.ao;
        }

        static void __clinit__() {
            PARSER = new C02151();
            FundBillInfo fundBillInfo = new FundBillInfo(true);
            defaultInstance = fundBillInfo;
            fundBillInfo.initFields();
        }

        public static FundBillInfo parseFrom(ByteString byteString) {
            return (FundBillInfo) PARSER.parseFrom(byteString);
        }

        public static FundBillInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (FundBillInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static FundBillInfo parseFrom(byte[] bArr) {
            return (FundBillInfo) PARSER.parseFrom(bArr);
        }

        public static FundBillInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (FundBillInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FundBillInfo parseFrom(InputStream inputStream) {
            return (FundBillInfo) PARSER.parseFrom(inputStream);
        }

        public static FundBillInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FundBillInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static FundBillInfo parseDelimitedFrom(InputStream inputStream) {
            return (FundBillInfo) PARSER.parseDelimitedFrom(inputStream);
        }

        public static FundBillInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FundBillInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static FundBillInfo parseFrom(CodedInputStream codedInputStream) {
            return (FundBillInfo) PARSER.parseFrom(codedInputStream);
        }

        public static FundBillInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FundBillInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(FundBillInfo fundBillInfo) {
            return newBuilder().mergeFrom(fundBillInfo);
        }
    }

    public interface MaxMemberSellingItemOrBuilder extends MessageOrBuilder {
        int getIClubSellingItemID();

        int getIMaxAddMember();

        int getIPerAddMember();

        long getLCoin();

        String getSClubSellingItemDetail();

        ByteString getSClubSellingItemDetailBytes();

        String getSClubSellingItemName();

        ByteString getSClubSellingItemNameBytes();

        boolean hasIClubSellingItemID();

        boolean hasIMaxAddMember();

        boolean hasIPerAddMember();

        boolean hasLCoin();

        boolean hasSClubSellingItemDetail();

        boolean hasSClubSellingItemName();
    }

    public static final class MaxMemberSellingItem extends GeneratedMessage implements MaxMemberSellingItemOrBuilder {
        public static final int ICLUBSELLINGITEMID_FIELD_NUMBER = 1;
        public static final int IMAXADDMEMBER_FIELD_NUMBER = 6;
        public static final int IPERADDMEMBER_FIELD_NUMBER = 5;
        public static final int LCOIN_FIELD_NUMBER = 4;
        public static Parser<MaxMemberSellingItem> PARSER = null;
        public static final int SCLUBSELLINGITEMDETAIL_FIELD_NUMBER = 3;
        public static final int SCLUBSELLINGITEMNAME_FIELD_NUMBER = 2;
        private static final MaxMemberSellingItem defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int iClubSellingItemID_;
        private int iMaxAddMember_;
        private int iPerAddMember_;
        private long lCoin_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sClubSellingItemDetail_;
        private Object sClubSellingItemName_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.MaxMemberSellingItem.1 */
        class C02161 extends AbstractParser<MaxMemberSellingItem> {
            static {
                fixHelper.fixfunc(new int[]{16598, 16599});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02161();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements MaxMemberSellingItemOrBuilder {
            private int bitField0_;
            private int iClubSellingItemID_;
            private int iMaxAddMember_;
            private int iPerAddMember_;
            private long lCoin_;
            private Object sClubSellingItemDetail_;
            private Object sClubSellingItemName_;

            static {
                fixHelper.fixfunc(new int[]{17587, 17588, 17589, 17590, 17591, 17592, 17593, 17594, 17595, 17596, 17597, 17598, 17599, 17600, 17601, 17602, 17603, 17604, 17605, 17606, 17607, 17608, 17609, 17610, 17611, 17612, 17613, 17614, 17615, 17616, 17617, 17618, 17619, 17620, 17621, 17622, 17623, 17624, 17625, 17626, 17627, 17628, 17629, 17630, 17631, 17632, 17633, 17634, 17635, 17636, 17637, 17638, 17639, 17640, 17641, 17642, 17643, 17644, 17645, 17646});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6453build();

            public final native MaxMemberSellingItem m6454build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6455buildPartial();

            public final native MaxMemberSellingItem m6456buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6457clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6458clear();

            public final native Builder m6459clear();

            public final native Builder clearIClubSellingItemID();

            public final native Builder clearIMaxAddMember();

            public final native Builder clearIPerAddMember();

            public final native Builder clearLCoin();

            public final native Builder clearSClubSellingItemDetail();

            public final native Builder clearSClubSellingItemName();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6460clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6461clone();

            public final native Builder m6462clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6463getDefaultInstanceForType();

            public final native MaxMemberSellingItem m6464getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getIClubSellingItemID();

            public final native int getIMaxAddMember();

            public final native int getIPerAddMember();

            public final native long getLCoin();

            public final native String getSClubSellingItemDetail();

            public final native ByteString getSClubSellingItemDetailBytes();

            public final native String getSClubSellingItemName();

            public final native ByteString getSClubSellingItemNameBytes();

            public final native boolean hasIClubSellingItemID();

            public final native boolean hasIMaxAddMember();

            public final native boolean hasIPerAddMember();

            public final native boolean hasLCoin();

            public final native boolean hasSClubSellingItemDetail();

            public final native boolean hasSClubSellingItemName();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6465mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6466mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6467mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6468mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6469mergeFrom(Message message);

            public final native Builder mergeFrom(MaxMemberSellingItem maxMemberSellingItem);

            public final native Builder setIClubSellingItemID(int i);

            public final native Builder setIMaxAddMember(int i);

            public final native Builder setIPerAddMember(int i);

            public final native Builder setLCoin(long j);

            public final native Builder setSClubSellingItemDetail(String str);

            public final native Builder setSClubSellingItemDetailBytes(ByteString byteString);

            public final native Builder setSClubSellingItemName(String str);

            public final native Builder setSClubSellingItemNameBytes(ByteString byteString);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.aW;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{15714, 15715, 15716, 15717, 15718, 15719, 15720, 15721, 15722, 15723, 15724, 15725, 15726, 15727, 15728, 15729, 15730, 15731, 15732, 15733, 15734, 15735, 15736, 15737, 15738, 15739, 15740, 15741, 15742, 15743, 15744, 15745, 15746, 15747, 15748, 15749, 15750, 15751});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native MaxMemberSellingItem(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ MaxMemberSellingItem(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, MaxMemberSellingItem maxMemberSellingItem);

        private native MaxMemberSellingItem(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ MaxMemberSellingItem(com.google.protobuf.GeneratedMessage.Builder builder, MaxMemberSellingItem maxMemberSellingItem);

        private native MaxMemberSellingItem(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6446getDefaultInstanceForType();

        public final native MaxMemberSellingItem m6447getDefaultInstanceForType();

        public final native int getIClubSellingItemID();

        public final native int getIMaxAddMember();

        public final native int getIPerAddMember();

        public final native long getLCoin();

        public final native Parser<MaxMemberSellingItem> getParserForType();

        public final native String getSClubSellingItemDetail();

        public final native ByteString getSClubSellingItemDetailBytes();

        public final native String getSClubSellingItemName();

        public final native ByteString getSClubSellingItemNameBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasIClubSellingItemID();

        public final native boolean hasIMaxAddMember();

        public final native boolean hasIPerAddMember();

        public final native boolean hasLCoin();

        public final native boolean hasSClubSellingItemDetail();

        public final native boolean hasSClubSellingItemName();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6448newBuilderForType();

        public final native Builder m6449newBuilderForType();

        protected final native Builder m6450newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6451toBuilder();

        public final native Builder m6452toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static MaxMemberSellingItem getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.aW;
        }

        static void __clinit__() {
            PARSER = new C02161();
            MaxMemberSellingItem maxMemberSellingItem = new MaxMemberSellingItem(true);
            defaultInstance = maxMemberSellingItem;
            maxMemberSellingItem.initFields();
        }

        public static MaxMemberSellingItem parseFrom(ByteString byteString) {
            return (MaxMemberSellingItem) PARSER.parseFrom(byteString);
        }

        public static MaxMemberSellingItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MaxMemberSellingItem) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static MaxMemberSellingItem parseFrom(byte[] bArr) {
            return (MaxMemberSellingItem) PARSER.parseFrom(bArr);
        }

        public static MaxMemberSellingItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MaxMemberSellingItem) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static MaxMemberSellingItem parseFrom(InputStream inputStream) {
            return (MaxMemberSellingItem) PARSER.parseFrom(inputStream);
        }

        public static MaxMemberSellingItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MaxMemberSellingItem) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static MaxMemberSellingItem parseDelimitedFrom(InputStream inputStream) {
            return (MaxMemberSellingItem) PARSER.parseDelimitedFrom(inputStream);
        }

        public static MaxMemberSellingItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MaxMemberSellingItem) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static MaxMemberSellingItem parseFrom(CodedInputStream codedInputStream) {
            return (MaxMemberSellingItem) PARSER.parseFrom(codedInputStream);
        }

        public static MaxMemberSellingItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MaxMemberSellingItem) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(MaxMemberSellingItem maxMemberSellingItem) {
            return newBuilder().mergeFrom(maxMemberSellingItem);
        }
    }

    public interface SCAddClubFundRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        int getIItemID();

        long getLClubID();

        long getLCoin();

        long getLFund();

        boolean hasEErrCode();

        boolean hasIItemID();

        boolean hasLClubID();

        boolean hasLCoin();

        boolean hasLFund();
    }

    public static final class SCAddClubFundRsp extends GeneratedMessage implements SCAddClubFundRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int IITEMID_FIELD_NUMBER = 3;
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static final int LCOIN_FIELD_NUMBER = 5;
        public static final int LFUND_FIELD_NUMBER = 4;
        public static Parser<SCAddClubFundRsp> PARSER;
        private static final SCAddClubFundRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private int iItemID_;
        private long lClubID_;
        private long lCoin_;
        private long lFund_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.SCAddClubFundRsp.1 */
        class C02171 extends AbstractParser<SCAddClubFundRsp> {
            static {
                fixHelper.fixfunc(new int[]{13410, 13411});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02171();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCAddClubFundRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private int iItemID_;
            private long lClubID_;
            private long lCoin_;
            private long lFund_;

            static {
                fixHelper.fixfunc(new int[]{5404, 5405, 5406, 5407, 5408, 5409, 5410, 5411, 5412, 5413, 5414, 5415, 5416, 5417, 5418, 5419, 5420, 5421, 5422, 5423, 5424, 5425, 5426, 5427, 5428, 5429, 5430, 5431, 5432, 5433, 5434, 5435, 5436, 5437, 5438, 5439, 5440, 5441, 5442, 5443, 5444, 5445, 5446, 5447, 5448, 5449, 5450, 5451, 5452, 5453, 5454, 5455});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6477build();

            public final native SCAddClubFundRsp m6478build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6479buildPartial();

            public final native SCAddClubFundRsp m6480buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6481clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6482clear();

            public final native Builder m6483clear();

            public final native Builder clearEErrCode();

            public final native Builder clearIItemID();

            public final native Builder clearLClubID();

            public final native Builder clearLCoin();

            public final native Builder clearLFund();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6484clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6485clone();

            public final native Builder m6486clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6487getDefaultInstanceForType();

            public final native SCAddClubFundRsp m6488getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native int getIItemID();

            public final native long getLClubID();

            public final native long getLCoin();

            public final native long getLFund();

            public final native boolean hasEErrCode();

            public final native boolean hasIItemID();

            public final native boolean hasLClubID();

            public final native boolean hasLCoin();

            public final native boolean hasLFund();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6489mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6490mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6491mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6492mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6493mergeFrom(Message message);

            public final native Builder mergeFrom(SCAddClubFundRsp sCAddClubFundRsp);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setIItemID(int i);

            public final native Builder setLClubID(long j);

            public final native Builder setLCoin(long j);

            public final native Builder setLFund(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.bk;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{32950, 32951, 32952, 32953, 32954, 32955, 32956, 32957, 32958, 32959, 32960, 32961, 32962, 32963, 32964, 32965, 32966, 32967, 32968, 32969, 32970, 32971, 32972, 32973, 32974, 32975, 32976, 32977, 32978, 32979, 32980, 32981, 32982, 32983});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCAddClubFundRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCAddClubFundRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCAddClubFundRsp sCAddClubFundRsp);

        private native SCAddClubFundRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCAddClubFundRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCAddClubFundRsp sCAddClubFundRsp);

        private native SCAddClubFundRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6470getDefaultInstanceForType();

        public final native SCAddClubFundRsp m6471getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native int getIItemID();

        public final native long getLClubID();

        public final native long getLCoin();

        public final native long getLFund();

        public final native Parser<SCAddClubFundRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasIItemID();

        public final native boolean hasLClubID();

        public final native boolean hasLCoin();

        public final native boolean hasLFund();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6472newBuilderForType();

        public final native Builder m6473newBuilderForType();

        protected final native Builder m6474newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6475toBuilder();

        public final native Builder m6476toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCAddClubFundRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.bk;
        }

        static void __clinit__() {
            PARSER = new C02171();
            SCAddClubFundRsp sCAddClubFundRsp = new SCAddClubFundRsp(true);
            defaultInstance = sCAddClubFundRsp;
            sCAddClubFundRsp.initFields();
        }

        public static SCAddClubFundRsp parseFrom(ByteString byteString) {
            return (SCAddClubFundRsp) PARSER.parseFrom(byteString);
        }

        public static SCAddClubFundRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCAddClubFundRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCAddClubFundRsp parseFrom(byte[] bArr) {
            return (SCAddClubFundRsp) PARSER.parseFrom(bArr);
        }

        public static SCAddClubFundRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCAddClubFundRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCAddClubFundRsp parseFrom(InputStream inputStream) {
            return (SCAddClubFundRsp) PARSER.parseFrom(inputStream);
        }

        public static SCAddClubFundRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCAddClubFundRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCAddClubFundRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCAddClubFundRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCAddClubFundRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCAddClubFundRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCAddClubFundRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCAddClubFundRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCAddClubFundRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCAddClubFundRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCAddClubFundRsp sCAddClubFundRsp) {
            return newBuilder().mergeFrom(sCAddClubFundRsp);
        }
    }

    public interface SCAddClubMaxMemberRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        int getIMaxMembers();

        long getLClubID();

        long getLCoin();

        boolean hasEErrCode();

        boolean hasIMaxMembers();

        boolean hasLClubID();

        boolean hasLCoin();
    }

    public static final class SCAddClubMaxMemberRsp extends GeneratedMessage implements SCAddClubMaxMemberRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int IMAXMEMBERS_FIELD_NUMBER = 3;
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static final int LCOIN_FIELD_NUMBER = 4;
        public static Parser<SCAddClubMaxMemberRsp> PARSER;
        private static final SCAddClubMaxMemberRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private int iMaxMembers_;
        private long lClubID_;
        private long lCoin_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.SCAddClubMaxMemberRsp.1 */
        class C02181 extends AbstractParser<SCAddClubMaxMemberRsp> {
            static {
                fixHelper.fixfunc(new int[]{12393, 12394});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02181();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCAddClubMaxMemberRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private int iMaxMembers_;
            private long lClubID_;
            private long lCoin_;

            static {
                fixHelper.fixfunc(new int[]{5106, 5107, 5108, 5109, 5110, 5111, 5112, 5113, 5114, 5115, 5116, 5117, 5118, 5119, 5120, 5121, 5122, 5123, 5124, 5125, 5126, 5127, 5128, 5129, 5130, 5131, 5132, 5133, 5134, 5135, 5136, 5137, 5138, 5139, 5140, 5141, 5142, 5143, 5144, 5145, 5146, 5147, 5148, 5149, 5150, 5151, 5152, 5153});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6501build();

            public final native SCAddClubMaxMemberRsp m6502build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6503buildPartial();

            public final native SCAddClubMaxMemberRsp m6504buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6505clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6506clear();

            public final native Builder m6507clear();

            public final native Builder clearEErrCode();

            public final native Builder clearIMaxMembers();

            public final native Builder clearLClubID();

            public final native Builder clearLCoin();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6508clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6509clone();

            public final native Builder m6510clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6511getDefaultInstanceForType();

            public final native SCAddClubMaxMemberRsp m6512getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native int getIMaxMembers();

            public final native long getLClubID();

            public final native long getLCoin();

            public final native boolean hasEErrCode();

            public final native boolean hasIMaxMembers();

            public final native boolean hasLClubID();

            public final native boolean hasLCoin();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6513mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6514mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6515mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6516mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6517mergeFrom(Message message);

            public final native Builder mergeFrom(SCAddClubMaxMemberRsp sCAddClubMaxMemberRsp);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setIMaxMembers(int i);

            public final native Builder setLClubID(long j);

            public final native Builder setLCoin(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.bg;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{20392, 20393, 20394, 20395, 20396, 20397, 20398, 20399, 20400, 20401, 20402, 20403, 20404, 20405, 20406, 20407, 20408, 20409, 20410, 20411, 20412, 20413, 20414, 20415, 20416, 20417, 20418, 20419, 20420, 20421, 20422, 20423});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCAddClubMaxMemberRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCAddClubMaxMemberRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCAddClubMaxMemberRsp sCAddClubMaxMemberRsp);

        private native SCAddClubMaxMemberRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCAddClubMaxMemberRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCAddClubMaxMemberRsp sCAddClubMaxMemberRsp);

        private native SCAddClubMaxMemberRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6494getDefaultInstanceForType();

        public final native SCAddClubMaxMemberRsp m6495getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native int getIMaxMembers();

        public final native long getLClubID();

        public final native long getLCoin();

        public final native Parser<SCAddClubMaxMemberRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasIMaxMembers();

        public final native boolean hasLClubID();

        public final native boolean hasLCoin();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6496newBuilderForType();

        public final native Builder m6497newBuilderForType();

        protected final native Builder m6498newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6499toBuilder();

        public final native Builder m6500toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCAddClubMaxMemberRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.bg;
        }

        static void __clinit__() {
            PARSER = new C02181();
            SCAddClubMaxMemberRsp sCAddClubMaxMemberRsp = new SCAddClubMaxMemberRsp(true);
            defaultInstance = sCAddClubMaxMemberRsp;
            sCAddClubMaxMemberRsp.initFields();
        }

        public static SCAddClubMaxMemberRsp parseFrom(ByteString byteString) {
            return (SCAddClubMaxMemberRsp) PARSER.parseFrom(byteString);
        }

        public static SCAddClubMaxMemberRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCAddClubMaxMemberRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCAddClubMaxMemberRsp parseFrom(byte[] bArr) {
            return (SCAddClubMaxMemberRsp) PARSER.parseFrom(bArr);
        }

        public static SCAddClubMaxMemberRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCAddClubMaxMemberRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCAddClubMaxMemberRsp parseFrom(InputStream inputStream) {
            return (SCAddClubMaxMemberRsp) PARSER.parseFrom(inputStream);
        }

        public static SCAddClubMaxMemberRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCAddClubMaxMemberRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCAddClubMaxMemberRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCAddClubMaxMemberRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCAddClubMaxMemberRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCAddClubMaxMemberRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCAddClubMaxMemberRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCAddClubMaxMemberRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCAddClubMaxMemberRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCAddClubMaxMemberRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCAddClubMaxMemberRsp sCAddClubMaxMemberRsp) {
            return newBuilder().mergeFrom(sCAddClubMaxMemberRsp);
        }
    }

    public interface SCClubActionRspOrBuilder extends MessageOrBuilder {
        CLUB_ACT getEClubAct();

        ERROR_CODE_TYPE getEErrCode();

        long getLActionedID();

        ClubInfo getStClubInfo();

        ClubInfoOrBuilder getStClubInfoOrBuilder();

        boolean hasEClubAct();

        boolean hasEErrCode();

        boolean hasLActionedID();

        boolean hasStClubInfo();
    }

    public static final class SCClubActionRsp extends GeneratedMessage implements SCClubActionRspOrBuilder {
        public static final int ECLUBACT_FIELD_NUMBER = 3;
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int LACTIONEDID_FIELD_NUMBER = 4;
        public static Parser<SCClubActionRsp> PARSER = null;
        public static final int STCLUBINFO_FIELD_NUMBER = 2;
        private static final SCClubActionRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private CLUB_ACT eClubAct_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lActionedID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private ClubInfo stClubInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.SCClubActionRsp.1 */
        class C02191 extends AbstractParser<SCClubActionRsp> {
            static {
                fixHelper.fixfunc(new int[]{7402, 7403});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02191();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCClubActionRspOrBuilder {
            private int bitField0_;
            private CLUB_ACT eClubAct_;
            private ERROR_CODE_TYPE eErrCode_;
            private long lActionedID_;
            private SingleFieldBuilder<ClubInfo, Builder, ClubInfoOrBuilder> stClubInfoBuilder_;
            private ClubInfo stClubInfo_;

            static {
                fixHelper.fixfunc(new int[]{7077, 7078, 7079, 7080, 7081, 7082, 7083, 7084, 7085, 7086, 7087, 7088, 7089, 7090, 7091, 7092, 7093, 7094, 7095, 7096, 7097, 7098, 7099, 7100, 7101, 7102, 7103, 7104, 7105, 7106, 7107, 7108, 7109, 7110, 7111, 7112, 7113, 7114, 7115, 7116, 7117, 7118, 7119, 7120, 7121, 7122, 7123, 7124, 7125, 7126, 7127, 7128, 7129});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<ClubInfo, Builder, ClubInfoOrBuilder> getStClubInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6525build();

            public final native SCClubActionRsp m6526build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6527buildPartial();

            public final native SCClubActionRsp m6528buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6529clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6530clear();

            public final native Builder m6531clear();

            public final native Builder clearEClubAct();

            public final native Builder clearEErrCode();

            public final native Builder clearLActionedID();

            public final native Builder clearStClubInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6532clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6533clone();

            public final native Builder m6534clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6535getDefaultInstanceForType();

            public final native SCClubActionRsp m6536getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native CLUB_ACT getEClubAct();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native long getLActionedID();

            public final native ClubInfo getStClubInfo();

            public final native Builder getStClubInfoBuilder();

            public final native ClubInfoOrBuilder getStClubInfoOrBuilder();

            public final native boolean hasEClubAct();

            public final native boolean hasEErrCode();

            public final native boolean hasLActionedID();

            public final native boolean hasStClubInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6537mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6538mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6539mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6540mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6541mergeFrom(Message message);

            public final native Builder mergeFrom(SCClubActionRsp sCClubActionRsp);

            public final native Builder mergeStClubInfo(ClubInfo clubInfo);

            public final native Builder setEClubAct(CLUB_ACT club_act);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setLActionedID(long j);

            public final native Builder setStClubInfo(Builder builder);

            public final native Builder setStClubInfo(ClubInfo clubInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.f162o;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{19623, 19624, 19625, 19626, 19627, 19628, 19629, 19630, 19631, 19632, 19633, 19634, 19635, 19636, 19637, 19638, 19639, 19640, 19641, 19642, 19643, 19644, 19645, 19646, 19647, 19648, 19649, 19650, 19651, 19652, 19653, 19654, 19655});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCClubActionRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCClubActionRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCClubActionRsp sCClubActionRsp);

        private native SCClubActionRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCClubActionRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCClubActionRsp sCClubActionRsp);

        private native SCClubActionRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6518getDefaultInstanceForType();

        public final native SCClubActionRsp m6519getDefaultInstanceForType();

        public final native CLUB_ACT getEClubAct();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLActionedID();

        public final native Parser<SCClubActionRsp> getParserForType();

        public final native int getSerializedSize();

        public final native ClubInfo getStClubInfo();

        public final native ClubInfoOrBuilder getStClubInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEClubAct();

        public final native boolean hasEErrCode();

        public final native boolean hasLActionedID();

        public final native boolean hasStClubInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6520newBuilderForType();

        public final native Builder m6521newBuilderForType();

        protected final native Builder m6522newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6523toBuilder();

        public final native Builder m6524toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCClubActionRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.f162o;
        }

        static void __clinit__() {
            PARSER = new C02191();
            SCClubActionRsp sCClubActionRsp = new SCClubActionRsp(true);
            defaultInstance = sCClubActionRsp;
            sCClubActionRsp.initFields();
        }

        public static SCClubActionRsp parseFrom(ByteString byteString) {
            return (SCClubActionRsp) PARSER.parseFrom(byteString);
        }

        public static SCClubActionRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCClubActionRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCClubActionRsp parseFrom(byte[] bArr) {
            return (SCClubActionRsp) PARSER.parseFrom(bArr);
        }

        public static SCClubActionRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCClubActionRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCClubActionRsp parseFrom(InputStream inputStream) {
            return (SCClubActionRsp) PARSER.parseFrom(inputStream);
        }

        public static SCClubActionRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCClubActionRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCClubActionRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCClubActionRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCClubActionRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCClubActionRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCClubActionRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCClubActionRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCClubActionRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCClubActionRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCClubActionRsp sCClubActionRsp) {
            return newBuilder().mergeFrom(sCClubActionRsp);
        }
    }

    public interface SCCreateClubRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        ClubInfo getStClubInfo();

        ClubInfoOrBuilder getStClubInfoOrBuilder();

        boolean hasEErrCode();

        boolean hasStClubInfo();
    }

    public static final class SCCreateClubRsp extends GeneratedMessage implements SCCreateClubRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCCreateClubRsp> PARSER = null;
        public static final int STCLUBINFO_FIELD_NUMBER = 2;
        private static final SCCreateClubRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private ClubInfo stClubInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.SCCreateClubRsp.1 */
        class C02201 extends AbstractParser<SCCreateClubRsp> {
            static {
                fixHelper.fixfunc(new int[]{10331, 10332});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02201();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCCreateClubRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private SingleFieldBuilder<ClubInfo, Builder, ClubInfoOrBuilder> stClubInfoBuilder_;
            private ClubInfo stClubInfo_;

            static {
                fixHelper.fixfunc(new int[]{14449, 14450, 14451, 14452, 14453, 14454, 14455, 14456, 14457, 14458, 14459, 14460, 14461, 14462, 14463, 14464, 14465, 14466, 14467, 14468, 14469, 14470, 14471, 14472, 14473, 14474, 14475, 14476, 14477, 14478, 14479, 14480, 14481, 14482, 14483, 14484, 14485, 14486, 14487, 14488, 14489, 14490, 14491, 14492, 14493});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<ClubInfo, Builder, ClubInfoOrBuilder> getStClubInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6549build();

            public final native SCCreateClubRsp m6550build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6551buildPartial();

            public final native SCCreateClubRsp m6552buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6553clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6554clear();

            public final native Builder m6555clear();

            public final native Builder clearEErrCode();

            public final native Builder clearStClubInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6556clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6557clone();

            public final native Builder m6558clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6559getDefaultInstanceForType();

            public final native SCCreateClubRsp m6560getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native ClubInfo getStClubInfo();

            public final native Builder getStClubInfoBuilder();

            public final native ClubInfoOrBuilder getStClubInfoOrBuilder();

            public final native boolean hasEErrCode();

            public final native boolean hasStClubInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6561mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6562mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6563mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6564mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6565mergeFrom(Message message);

            public final native Builder mergeFrom(SCCreateClubRsp sCCreateClubRsp);

            public final native Builder mergeStClubInfo(ClubInfo clubInfo);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setStClubInfo(Builder builder);

            public final native Builder setStClubInfo(ClubInfo clubInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.f154g;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{6246, 6247, 6248, 6249, 6250, 6251, 6252, 6253, 6254, 6255, 6256, 6257, 6258, 6259, 6260, 6261, 6262, 6263, 6264, 6265, 6266, 6267, 6268, 6269, 6270, 6271, 6272, 6273, 6274});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCCreateClubRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCCreateClubRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCCreateClubRsp sCCreateClubRsp);

        private native SCCreateClubRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCCreateClubRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCCreateClubRsp sCCreateClubRsp);

        private native SCCreateClubRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6542getDefaultInstanceForType();

        public final native SCCreateClubRsp m6543getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCCreateClubRsp> getParserForType();

        public final native int getSerializedSize();

        public final native ClubInfo getStClubInfo();

        public final native ClubInfoOrBuilder getStClubInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasStClubInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6544newBuilderForType();

        public final native Builder m6545newBuilderForType();

        protected final native Builder m6546newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6547toBuilder();

        public final native Builder m6548toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCCreateClubRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.f154g;
        }

        static void __clinit__() {
            PARSER = new C02201();
            SCCreateClubRsp sCCreateClubRsp = new SCCreateClubRsp(true);
            defaultInstance = sCCreateClubRsp;
            sCCreateClubRsp.initFields();
        }

        public static SCCreateClubRsp parseFrom(ByteString byteString) {
            return (SCCreateClubRsp) PARSER.parseFrom(byteString);
        }

        public static SCCreateClubRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCCreateClubRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCCreateClubRsp parseFrom(byte[] bArr) {
            return (SCCreateClubRsp) PARSER.parseFrom(bArr);
        }

        public static SCCreateClubRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCCreateClubRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCCreateClubRsp parseFrom(InputStream inputStream) {
            return (SCCreateClubRsp) PARSER.parseFrom(inputStream);
        }

        public static SCCreateClubRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCCreateClubRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCCreateClubRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCCreateClubRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCCreateClubRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCCreateClubRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCCreateClubRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCCreateClubRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCCreateClubRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCCreateClubRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCCreateClubRsp sCCreateClubRsp) {
            return newBuilder().mergeFrom(sCCreateClubRsp);
        }
    }

    public interface SCDeleteClubCoverRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        long getLClubID();

        String getSBigAlbums(int i);

        ByteString getSBigAlbumsBytes(int i);

        int getSBigAlbumsCount();

        ProtocolStringList getSBigAlbumsList();

        String getSSmallAlbums(int i);

        ByteString getSSmallAlbumsBytes(int i);

        int getSSmallAlbumsCount();

        ProtocolStringList getSSmallAlbumsList();

        boolean hasEErrCode();

        boolean hasLClubID();
    }

    public static final class SCDeleteClubCoverRsp extends GeneratedMessage implements SCDeleteClubCoverRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static Parser<SCDeleteClubCoverRsp> PARSER = null;
        public static final int SBIGALBUMS_FIELD_NUMBER = 4;
        public static final int SSMALLALBUMS_FIELD_NUMBER = 3;
        private static final SCDeleteClubCoverRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lClubID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private LazyStringList sBigAlbums_;
        private LazyStringList sSmallAlbums_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.SCDeleteClubCoverRsp.1 */
        class C02211 extends AbstractParser<SCDeleteClubCoverRsp> {
            static {
                fixHelper.fixfunc(new int[]{23899, 23900});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02211();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCDeleteClubCoverRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private long lClubID_;
            private LazyStringList sBigAlbums_;
            private LazyStringList sSmallAlbums_;

            static {
                fixHelper.fixfunc(new int[]{13463, 13464, 13465, 13466, 13467, 13468, 13469, 13470, 13471, 13472, 13473, 13474, 13475, 13476, 13477, 13478, 13479, 13480, 13481, 13482, 13483, 13484, 13485, 13486, 13487, 13488, 13489, 13490, 13491, 13492, 13493, 13494, 13495, 13496, 13497, 13498, 13499, 13500, 13501, 13502, 13503, 13504, 13505, 13506, 13507, 13508, 13509, 13510, 13511, 13512, 13513, 13514, 13515, 13516, 13517, 13518, 13519, 13520, 13521, 13522});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureSBigAlbumsIsMutable();

            private native void ensureSSmallAlbumsIsMutable();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllSBigAlbums(Iterable<String> iterable);

            public final native Builder addAllSSmallAlbums(Iterable<String> iterable);

            public final native Builder addSBigAlbums(String str);

            public final native Builder addSBigAlbumsBytes(ByteString byteString);

            public final native Builder addSSmallAlbums(String str);

            public final native Builder addSSmallAlbumsBytes(ByteString byteString);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6573build();

            public final native SCDeleteClubCoverRsp m6574build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6575buildPartial();

            public final native SCDeleteClubCoverRsp m6576buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6577clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6578clear();

            public final native Builder m6579clear();

            public final native Builder clearEErrCode();

            public final native Builder clearLClubID();

            public final native Builder clearSBigAlbums();

            public final native Builder clearSSmallAlbums();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6580clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6581clone();

            public final native Builder m6582clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6583getDefaultInstanceForType();

            public final native SCDeleteClubCoverRsp m6584getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native long getLClubID();

            public final native String getSBigAlbums(int i);

            public final native ByteString getSBigAlbumsBytes(int i);

            public final native int getSBigAlbumsCount();

            public final native ProtocolStringList getSBigAlbumsList();

            public final native String getSSmallAlbums(int i);

            public final native ByteString getSSmallAlbumsBytes(int i);

            public final native int getSSmallAlbumsCount();

            public final native ProtocolStringList getSSmallAlbumsList();

            public final native boolean hasEErrCode();

            public final native boolean hasLClubID();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6585mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6586mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6587mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6588mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6589mergeFrom(Message message);

            public final native Builder mergeFrom(SCDeleteClubCoverRsp sCDeleteClubCoverRsp);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setLClubID(long j);

            public final native Builder setSBigAlbums(int i, String str);

            public final native Builder setSSmallAlbums(int i, String str);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.f146Y;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{3927, 3928, 3929, 3930, 3931, 3932, 3933, 3934, 3935, 3936, 3937, 3938, 3939, 3940, 3941, 3942, 3943, 3944, 3945, 3946, 3947, 3948, 3949, 3950, 3951, 3952, 3953, 3954, 3955, 3956, 3957, 3958, 3959, 3960, 3961, 3962});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCDeleteClubCoverRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCDeleteClubCoverRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCDeleteClubCoverRsp sCDeleteClubCoverRsp);

        private native SCDeleteClubCoverRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCDeleteClubCoverRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCDeleteClubCoverRsp sCDeleteClubCoverRsp);

        private native SCDeleteClubCoverRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6566getDefaultInstanceForType();

        public final native SCDeleteClubCoverRsp m6567getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLClubID();

        public final native Parser<SCDeleteClubCoverRsp> getParserForType();

        public final native String getSBigAlbums(int i);

        public final native ByteString getSBigAlbumsBytes(int i);

        public final native int getSBigAlbumsCount();

        public final native ProtocolStringList getSBigAlbumsList();

        public final native String getSSmallAlbums(int i);

        public final native ByteString getSSmallAlbumsBytes(int i);

        public final native int getSSmallAlbumsCount();

        public final native ProtocolStringList getSSmallAlbumsList();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasLClubID();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6568newBuilderForType();

        public final native Builder m6569newBuilderForType();

        protected final native Builder m6570newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6571toBuilder();

        public final native Builder m6572toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCDeleteClubCoverRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.f146Y;
        }

        static void __clinit__() {
            PARSER = new C02211();
            SCDeleteClubCoverRsp sCDeleteClubCoverRsp = new SCDeleteClubCoverRsp(true);
            defaultInstance = sCDeleteClubCoverRsp;
            sCDeleteClubCoverRsp.initFields();
        }

        public static SCDeleteClubCoverRsp parseFrom(ByteString byteString) {
            return (SCDeleteClubCoverRsp) PARSER.parseFrom(byteString);
        }

        public static SCDeleteClubCoverRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCDeleteClubCoverRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCDeleteClubCoverRsp parseFrom(byte[] bArr) {
            return (SCDeleteClubCoverRsp) PARSER.parseFrom(bArr);
        }

        public static SCDeleteClubCoverRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCDeleteClubCoverRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCDeleteClubCoverRsp parseFrom(InputStream inputStream) {
            return (SCDeleteClubCoverRsp) PARSER.parseFrom(inputStream);
        }

        public static SCDeleteClubCoverRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCDeleteClubCoverRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCDeleteClubCoverRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCDeleteClubCoverRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCDeleteClubCoverRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCDeleteClubCoverRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCDeleteClubCoverRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCDeleteClubCoverRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCDeleteClubCoverRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCDeleteClubCoverRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCDeleteClubCoverRsp sCDeleteClubCoverRsp) {
            return newBuilder().mergeFrom(sCDeleteClubCoverRsp);
        }
    }

    public interface SCEnterClubRspOrBuilder extends MessageOrBuilder {
        CLUB_USER_LEVEL getEClubUserLevel();

        ERROR_CODE_TYPE getEErrCode();

        ClubInfo getStClubInfo();

        ClubInfoOrBuilder getStClubInfoOrBuilder();

        boolean hasEClubUserLevel();

        boolean hasEErrCode();

        boolean hasStClubInfo();
    }

    public static final class SCEnterClubRsp extends GeneratedMessage implements SCEnterClubRspOrBuilder {
        public static final int ECLUBUSERLEVEL_FIELD_NUMBER = 3;
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCEnterClubRsp> PARSER = null;
        public static final int STCLUBINFO_FIELD_NUMBER = 2;
        private static final SCEnterClubRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private CLUB_USER_LEVEL eClubUserLevel_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private ClubInfo stClubInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.SCEnterClubRsp.1 */
        class C02221 extends AbstractParser<SCEnterClubRsp> {
            static {
                fixHelper.fixfunc(new int[]{24967, 24968});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02221();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCEnterClubRspOrBuilder {
            private int bitField0_;
            private CLUB_USER_LEVEL eClubUserLevel_;
            private ERROR_CODE_TYPE eErrCode_;
            private SingleFieldBuilder<ClubInfo, Builder, ClubInfoOrBuilder> stClubInfoBuilder_;
            private ClubInfo stClubInfo_;

            static {
                fixHelper.fixfunc(new int[]{24227, 24228, 24229, 24230, 24231, 24232, 24233, 24234, 24235, 24236, 24237, 24238, 24239, 24240, 24241, 24242, 24243, 24244, 24245, 24246, 24247, 24248, 24249, 24250, 24251, 24252, 24253, 24254, 24255, 24256, 24257, 24258, 24259, 24260, 24261, 24262, 24263, 24264, 24265, 24266, 24267, 24268, 24269, 24270, 24271, 24272, 24273, 24274, 24275});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<ClubInfo, Builder, ClubInfoOrBuilder> getStClubInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6597build();

            public final native SCEnterClubRsp m6598build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6599buildPartial();

            public final native SCEnterClubRsp m6600buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6601clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6602clear();

            public final native Builder m6603clear();

            public final native Builder clearEClubUserLevel();

            public final native Builder clearEErrCode();

            public final native Builder clearStClubInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6604clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6605clone();

            public final native Builder m6606clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6607getDefaultInstanceForType();

            public final native SCEnterClubRsp m6608getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native CLUB_USER_LEVEL getEClubUserLevel();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native ClubInfo getStClubInfo();

            public final native Builder getStClubInfoBuilder();

            public final native ClubInfoOrBuilder getStClubInfoOrBuilder();

            public final native boolean hasEClubUserLevel();

            public final native boolean hasEErrCode();

            public final native boolean hasStClubInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6609mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6610mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6611mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6612mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6613mergeFrom(Message message);

            public final native Builder mergeFrom(SCEnterClubRsp sCEnterClubRsp);

            public final native Builder mergeStClubInfo(ClubInfo clubInfo);

            public final native Builder setEClubUserLevel(CLUB_USER_LEVEL club_user_level);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setStClubInfo(Builder builder);

            public final native Builder setStClubInfo(ClubInfo clubInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.f158k;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{20700, 20701, 20702, 20703, 20704, 20705, 20706, 20707, 20708, 20709, 20710, 20711, 20712, 20713, 20714, 20715, 20716, 20717, 20718, 20719, 20720, 20721, 20722, 20723, 20724, 20725, 20726, 20727, 20728, 20729, 20730});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCEnterClubRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCEnterClubRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCEnterClubRsp sCEnterClubRsp);

        private native SCEnterClubRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCEnterClubRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCEnterClubRsp sCEnterClubRsp);

        private native SCEnterClubRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6590getDefaultInstanceForType();

        public final native SCEnterClubRsp m6591getDefaultInstanceForType();

        public final native CLUB_USER_LEVEL getEClubUserLevel();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCEnterClubRsp> getParserForType();

        public final native int getSerializedSize();

        public final native ClubInfo getStClubInfo();

        public final native ClubInfoOrBuilder getStClubInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEClubUserLevel();

        public final native boolean hasEErrCode();

        public final native boolean hasStClubInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6592newBuilderForType();

        public final native Builder m6593newBuilderForType();

        protected final native Builder m6594newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6595toBuilder();

        public final native Builder m6596toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCEnterClubRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.f158k;
        }

        static void __clinit__() {
            PARSER = new C02221();
            SCEnterClubRsp sCEnterClubRsp = new SCEnterClubRsp(true);
            defaultInstance = sCEnterClubRsp;
            sCEnterClubRsp.initFields();
        }

        public static SCEnterClubRsp parseFrom(ByteString byteString) {
            return (SCEnterClubRsp) PARSER.parseFrom(byteString);
        }

        public static SCEnterClubRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCEnterClubRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCEnterClubRsp parseFrom(byte[] bArr) {
            return (SCEnterClubRsp) PARSER.parseFrom(bArr);
        }

        public static SCEnterClubRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCEnterClubRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCEnterClubRsp parseFrom(InputStream inputStream) {
            return (SCEnterClubRsp) PARSER.parseFrom(inputStream);
        }

        public static SCEnterClubRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCEnterClubRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCEnterClubRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCEnterClubRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCEnterClubRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCEnterClubRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCEnterClubRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCEnterClubRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCEnterClubRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCEnterClubRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCEnterClubRsp sCEnterClubRsp) {
            return newBuilder().mergeFrom(sCEnterClubRsp);
        }
    }

    public interface SCGetClubBaseInfoByClubIDRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        ClubBaseInfo getStClubBaseInfos();

        ClubBaseInfoOrBuilder getStClubBaseInfosOrBuilder();

        boolean hasEErrCode();

        boolean hasStClubBaseInfos();
    }

    public static final class SCGetClubBaseInfoByClubIDRsp extends GeneratedMessage implements SCGetClubBaseInfoByClubIDRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCGetClubBaseInfoByClubIDRsp> PARSER = null;
        public static final int STCLUBBASEINFOS_FIELD_NUMBER = 2;
        private static final SCGetClubBaseInfoByClubIDRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private ClubBaseInfo stClubBaseInfos_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.SCGetClubBaseInfoByClubIDRsp.1 */
        class C02231 extends AbstractParser<SCGetClubBaseInfoByClubIDRsp> {
            static {
                fixHelper.fixfunc(new int[]{14986, 14987});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02231();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetClubBaseInfoByClubIDRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private SingleFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> stClubBaseInfosBuilder_;
            private ClubBaseInfo stClubBaseInfos_;

            static {
                fixHelper.fixfunc(new int[]{4221, 4222, 4223, 4224, 4225, 4226, 4227, 4228, 4229, 4230, 4231, 4232, 4233, 4234, 4235, 4236, 4237, 4238, 4239, 4240, 4241, 4242, 4243, 4244, 4245, 4246, 4247, 4248, 4249, 4250, 4251, 4252, 4253, 4254, 4255, 4256, 4257, 4258, 4259, 4260, 4261, 4262, 4263, 4264, 4265});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> getStClubBaseInfosFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6621build();

            public final native SCGetClubBaseInfoByClubIDRsp m6622build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6623buildPartial();

            public final native SCGetClubBaseInfoByClubIDRsp m6624buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6625clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6626clear();

            public final native Builder m6627clear();

            public final native Builder clearEErrCode();

            public final native Builder clearStClubBaseInfos();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6628clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6629clone();

            public final native Builder m6630clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6631getDefaultInstanceForType();

            public final native SCGetClubBaseInfoByClubIDRsp m6632getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native ClubBaseInfo getStClubBaseInfos();

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder getStClubBaseInfosBuilder();

            public final native ClubBaseInfoOrBuilder getStClubBaseInfosOrBuilder();

            public final native boolean hasEErrCode();

            public final native boolean hasStClubBaseInfos();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6633mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6634mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6635mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6636mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6637mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetClubBaseInfoByClubIDRsp sCGetClubBaseInfoByClubIDRsp);

            public final native Builder mergeStClubBaseInfos(ClubBaseInfo clubBaseInfo);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setStClubBaseInfos(com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder setStClubBaseInfos(ClubBaseInfo clubBaseInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.aw;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{22820, 22821, 22822, 22823, 22824, 22825, 22826, 22827, 22828, 22829, 22830, 22831, 22832, 22833, 22834, 22835, 22836, 22837, 22838, 22839, 22840, 22841, 22842, 22843, 22844, 22845, 22846, 22847, 22848});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetClubBaseInfoByClubIDRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetClubBaseInfoByClubIDRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetClubBaseInfoByClubIDRsp sCGetClubBaseInfoByClubIDRsp);

        private native SCGetClubBaseInfoByClubIDRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetClubBaseInfoByClubIDRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetClubBaseInfoByClubIDRsp sCGetClubBaseInfoByClubIDRsp);

        private native SCGetClubBaseInfoByClubIDRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6614getDefaultInstanceForType();

        public final native SCGetClubBaseInfoByClubIDRsp m6615getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCGetClubBaseInfoByClubIDRsp> getParserForType();

        public final native int getSerializedSize();

        public final native ClubBaseInfo getStClubBaseInfos();

        public final native ClubBaseInfoOrBuilder getStClubBaseInfosOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasStClubBaseInfos();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6616newBuilderForType();

        public final native Builder m6617newBuilderForType();

        protected final native Builder m6618newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6619toBuilder();

        public final native Builder m6620toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetClubBaseInfoByClubIDRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.aw;
        }

        static void __clinit__() {
            PARSER = new C02231();
            SCGetClubBaseInfoByClubIDRsp sCGetClubBaseInfoByClubIDRsp = new SCGetClubBaseInfoByClubIDRsp(true);
            defaultInstance = sCGetClubBaseInfoByClubIDRsp;
            sCGetClubBaseInfoByClubIDRsp.initFields();
        }

        public static SCGetClubBaseInfoByClubIDRsp parseFrom(ByteString byteString) {
            return (SCGetClubBaseInfoByClubIDRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetClubBaseInfoByClubIDRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubBaseInfoByClubIDRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetClubBaseInfoByClubIDRsp parseFrom(byte[] bArr) {
            return (SCGetClubBaseInfoByClubIDRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetClubBaseInfoByClubIDRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubBaseInfoByClubIDRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetClubBaseInfoByClubIDRsp parseFrom(InputStream inputStream) {
            return (SCGetClubBaseInfoByClubIDRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetClubBaseInfoByClubIDRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubBaseInfoByClubIDRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetClubBaseInfoByClubIDRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetClubBaseInfoByClubIDRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetClubBaseInfoByClubIDRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubBaseInfoByClubIDRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetClubBaseInfoByClubIDRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetClubBaseInfoByClubIDRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetClubBaseInfoByClubIDRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubBaseInfoByClubIDRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetClubBaseInfoByClubIDRsp sCGetClubBaseInfoByClubIDRsp) {
            return newBuilder().mergeFrom(sCGetClubBaseInfoByClubIDRsp);
        }
    }

    public interface SCGetClubByClubIDRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        ClubInfo getStClubInfo();

        ClubInfoOrBuilder getStClubInfoOrBuilder();

        boolean hasEErrCode();

        boolean hasStClubInfo();
    }

    public static final class SCGetClubByClubIDRsp extends GeneratedMessage implements SCGetClubByClubIDRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCGetClubByClubIDRsp> PARSER = null;
        public static final int STCLUBINFO_FIELD_NUMBER = 2;
        private static final SCGetClubByClubIDRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private ClubInfo stClubInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.SCGetClubByClubIDRsp.1 */
        class C02241 extends AbstractParser<SCGetClubByClubIDRsp> {
            static {
                fixHelper.fixfunc(new int[]{5964, 5965});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02241();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetClubByClubIDRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private SingleFieldBuilder<ClubInfo, Builder, ClubInfoOrBuilder> stClubInfoBuilder_;
            private ClubInfo stClubInfo_;

            static {
                fixHelper.fixfunc(new int[]{22970, 22971, 22972, 22973, 22974, 22975, 22976, 22977, 22978, 22979, 22980, 22981, 22982, 22983, 22984, 22985, 22986, 22987, 22988, 22989, 22990, 22991, 22992, 22993, 22994, 22995, 22996, 22997, 22998, 22999, 23000, 23001, 23002, 23003, 23004, 23005, 23006, 23007, 23008, 23009, 23010, 23011, 23012, 23013, 23014});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<ClubInfo, Builder, ClubInfoOrBuilder> getStClubInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6645build();

            public final native SCGetClubByClubIDRsp m6646build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6647buildPartial();

            public final native SCGetClubByClubIDRsp m6648buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6649clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6650clear();

            public final native Builder m6651clear();

            public final native Builder clearEErrCode();

            public final native Builder clearStClubInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6652clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6653clone();

            public final native Builder m6654clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6655getDefaultInstanceForType();

            public final native SCGetClubByClubIDRsp m6656getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native ClubInfo getStClubInfo();

            public final native Builder getStClubInfoBuilder();

            public final native ClubInfoOrBuilder getStClubInfoOrBuilder();

            public final native boolean hasEErrCode();

            public final native boolean hasStClubInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6657mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6658mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6659mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6660mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6661mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetClubByClubIDRsp sCGetClubByClubIDRsp);

            public final native Builder mergeStClubInfo(ClubInfo clubInfo);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setStClubInfo(Builder builder);

            public final native Builder setStClubInfo(ClubInfo clubInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.aM;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{32185, 32186, 32187, 32188, 32189, 32190, 32191, 32192, 32193, 32194, 32195, 32196, 32197, 32198, 32199, 32200, 32201, 32202, 32203, 32204, 32205, 32206, 32207, 32208, 32209, 32210, 32211, 32212, 32213});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetClubByClubIDRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetClubByClubIDRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetClubByClubIDRsp sCGetClubByClubIDRsp);

        private native SCGetClubByClubIDRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetClubByClubIDRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetClubByClubIDRsp sCGetClubByClubIDRsp);

        private native SCGetClubByClubIDRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6638getDefaultInstanceForType();

        public final native SCGetClubByClubIDRsp m6639getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCGetClubByClubIDRsp> getParserForType();

        public final native int getSerializedSize();

        public final native ClubInfo getStClubInfo();

        public final native ClubInfoOrBuilder getStClubInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasStClubInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6640newBuilderForType();

        public final native Builder m6641newBuilderForType();

        protected final native Builder m6642newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6643toBuilder();

        public final native Builder m6644toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetClubByClubIDRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.aM;
        }

        static void __clinit__() {
            PARSER = new C02241();
            SCGetClubByClubIDRsp sCGetClubByClubIDRsp = new SCGetClubByClubIDRsp(true);
            defaultInstance = sCGetClubByClubIDRsp;
            sCGetClubByClubIDRsp.initFields();
        }

        public static SCGetClubByClubIDRsp parseFrom(ByteString byteString) {
            return (SCGetClubByClubIDRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetClubByClubIDRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubByClubIDRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetClubByClubIDRsp parseFrom(byte[] bArr) {
            return (SCGetClubByClubIDRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetClubByClubIDRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubByClubIDRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetClubByClubIDRsp parseFrom(InputStream inputStream) {
            return (SCGetClubByClubIDRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetClubByClubIDRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubByClubIDRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetClubByClubIDRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetClubByClubIDRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetClubByClubIDRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubByClubIDRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetClubByClubIDRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetClubByClubIDRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetClubByClubIDRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubByClubIDRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetClubByClubIDRsp sCGetClubByClubIDRsp) {
            return newBuilder().mergeFrom(sCGetClubByClubIDRsp);
        }
    }

    public interface SCGetClubGamesByClubIDRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        ClubBaseInfo getStClubBaseInfos();

        ClubBaseInfoOrBuilder getStClubBaseInfosOrBuilder();

        GameRoomBaseInfo getVGameRoomBaseInfos(int i);

        int getVGameRoomBaseInfosCount();

        List<GameRoomBaseInfo> getVGameRoomBaseInfosList();

        GameRoomBaseInfoOrBuilder getVGameRoomBaseInfosOrBuilder(int i);

        List<? extends GameRoomBaseInfoOrBuilder> getVGameRoomBaseInfosOrBuilderList();

        TexasPoker$SNGGameRoomBaseInfo getVSNGGameRoomBaseInfos(int i);

        int getVSNGGameRoomBaseInfosCount();

        List<TexasPoker$SNGGameRoomBaseInfo> getVSNGGameRoomBaseInfosList();

        TexasPoker$SNGGameRoomBaseInfoOrBuilder getVSNGGameRoomBaseInfosOrBuilder(int i);

        List<? extends TexasPoker$SNGGameRoomBaseInfoOrBuilder> getVSNGGameRoomBaseInfosOrBuilderList();

        boolean hasEErrCode();

        boolean hasStClubBaseInfos();
    }

    public static final class SCGetClubGamesByClubIDRsp extends GeneratedMessage implements SCGetClubGamesByClubIDRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCGetClubGamesByClubIDRsp> PARSER = null;
        public static final int STCLUBBASEINFOS_FIELD_NUMBER = 2;
        public static final int VGAMEROOMBASEINFOS_FIELD_NUMBER = 3;
        public static final int VSNGGAMEROOMBASEINFOS_FIELD_NUMBER = 4;
        private static final SCGetClubGamesByClubIDRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private ClubBaseInfo stClubBaseInfos_;
        private final UnknownFieldSet unknownFields;
        private List<GameRoomBaseInfo> vGameRoomBaseInfos_;
        private List<TexasPoker$SNGGameRoomBaseInfo> vSNGGameRoomBaseInfos_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.SCGetClubGamesByClubIDRsp.1 */
        class C02251 extends AbstractParser<SCGetClubGamesByClubIDRsp> {
            static {
                fixHelper.fixfunc(new int[]{10277, 10278});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02251();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetClubGamesByClubIDRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private SingleFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> stClubBaseInfosBuilder_;
            private ClubBaseInfo stClubBaseInfos_;
            private RepeatedFieldBuilder<GameRoomBaseInfo, com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder, GameRoomBaseInfoOrBuilder> vGameRoomBaseInfosBuilder_;
            private List<GameRoomBaseInfo> vGameRoomBaseInfos_;
            private RepeatedFieldBuilder<TexasPoker$SNGGameRoomBaseInfo, com.texaspoker.moment.TexasPoker$SNGGameRoomBaseInfo.Builder, TexasPoker$SNGGameRoomBaseInfoOrBuilder> vSNGGameRoomBaseInfosBuilder_;
            private List<TexasPoker$SNGGameRoomBaseInfo> vSNGGameRoomBaseInfos_;

            static {
                fixHelper.fixfunc(new int[]{19006, 19007, 19008, 19009, 19010, 19011, 19012, 19013, 19014, 19015, 19016, 19017, 19018, 19019, 19020, 19021, 19022, 19023, 19024, 19025, 19026, 19027, 19028, 19029, 19030, 19031, 19032, 19033, 19034, 19035, 19036, 19037, 19038, 19039, 19040, 19041, 19042, 19043, 19044, 19045, 19046, 19047, 19048, 19049, 19050, 19051, 19052, 19053, 19054, 19055, 19056, 19057, 19058, 19059, 19060, 19061, 19062, 19063, 19064, 19065, 19066, 19067, 19068, 19069, 19070, 19071, 19072, 19073, 19074, 19075, 19076, 19077, 19078, 19079, 19080, 19081, 19082, 19083, 19084, 19085, 19086, 19087, 19088, 19089, 19090});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVGameRoomBaseInfosIsMutable();

            private native void ensureVSNGGameRoomBaseInfosIsMutable();

            private native SingleFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> getStClubBaseInfosFieldBuilder();

            private native RepeatedFieldBuilder<GameRoomBaseInfo, com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder, GameRoomBaseInfoOrBuilder> getVGameRoomBaseInfosFieldBuilder();

            private native RepeatedFieldBuilder<TexasPoker$SNGGameRoomBaseInfo, com.texaspoker.moment.TexasPoker$SNGGameRoomBaseInfo.Builder, TexasPoker$SNGGameRoomBaseInfoOrBuilder> getVSNGGameRoomBaseInfosFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVGameRoomBaseInfos(Iterable<? extends GameRoomBaseInfo> iterable);

            public final native Builder addAllVSNGGameRoomBaseInfos(Iterable<? extends TexasPoker$SNGGameRoomBaseInfo> iterable);

            public final native Builder addVGameRoomBaseInfos(int i, com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder builder);

            public final native Builder addVGameRoomBaseInfos(int i, GameRoomBaseInfo gameRoomBaseInfo);

            public final native Builder addVGameRoomBaseInfos(com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder builder);

            public final native Builder addVGameRoomBaseInfos(GameRoomBaseInfo gameRoomBaseInfo);

            public final native com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder addVGameRoomBaseInfosBuilder();

            public final native com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder addVGameRoomBaseInfosBuilder(int i);

            public final native Builder addVSNGGameRoomBaseInfos(int i, com.texaspoker.moment.TexasPoker$SNGGameRoomBaseInfo.Builder builder);

            public final native Builder addVSNGGameRoomBaseInfos(int i, TexasPoker$SNGGameRoomBaseInfo texasPoker$SNGGameRoomBaseInfo);

            public final native Builder addVSNGGameRoomBaseInfos(com.texaspoker.moment.TexasPoker$SNGGameRoomBaseInfo.Builder builder);

            public final native Builder addVSNGGameRoomBaseInfos(TexasPoker$SNGGameRoomBaseInfo texasPoker$SNGGameRoomBaseInfo);

            public final native com.texaspoker.moment.TexasPoker$SNGGameRoomBaseInfo.Builder addVSNGGameRoomBaseInfosBuilder();

            public final native com.texaspoker.moment.TexasPoker$SNGGameRoomBaseInfo.Builder addVSNGGameRoomBaseInfosBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6669build();

            public final native SCGetClubGamesByClubIDRsp m6670build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6671buildPartial();

            public final native SCGetClubGamesByClubIDRsp m6672buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6673clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6674clear();

            public final native Builder m6675clear();

            public final native Builder clearEErrCode();

            public final native Builder clearStClubBaseInfos();

            public final native Builder clearVGameRoomBaseInfos();

            public final native Builder clearVSNGGameRoomBaseInfos();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6676clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6677clone();

            public final native Builder m6678clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6679getDefaultInstanceForType();

            public final native SCGetClubGamesByClubIDRsp m6680getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native ClubBaseInfo getStClubBaseInfos();

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder getStClubBaseInfosBuilder();

            public final native ClubBaseInfoOrBuilder getStClubBaseInfosOrBuilder();

            public final native GameRoomBaseInfo getVGameRoomBaseInfos(int i);

            public final native com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder getVGameRoomBaseInfosBuilder(int i);

            public final native List<com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder> getVGameRoomBaseInfosBuilderList();

            public final native int getVGameRoomBaseInfosCount();

            public final native List<GameRoomBaseInfo> getVGameRoomBaseInfosList();

            public final native GameRoomBaseInfoOrBuilder getVGameRoomBaseInfosOrBuilder(int i);

            public final native List<? extends GameRoomBaseInfoOrBuilder> getVGameRoomBaseInfosOrBuilderList();

            public final native TexasPoker$SNGGameRoomBaseInfo getVSNGGameRoomBaseInfos(int i);

            public final native com.texaspoker.moment.TexasPoker$SNGGameRoomBaseInfo.Builder getVSNGGameRoomBaseInfosBuilder(int i);

            public final native List<com.texaspoker.moment.TexasPoker$SNGGameRoomBaseInfo.Builder> getVSNGGameRoomBaseInfosBuilderList();

            public final native int getVSNGGameRoomBaseInfosCount();

            public final native List<TexasPoker$SNGGameRoomBaseInfo> getVSNGGameRoomBaseInfosList();

            public final native TexasPoker$SNGGameRoomBaseInfoOrBuilder getVSNGGameRoomBaseInfosOrBuilder(int i);

            public final native List<? extends TexasPoker$SNGGameRoomBaseInfoOrBuilder> getVSNGGameRoomBaseInfosOrBuilderList();

            public final native boolean hasEErrCode();

            public final native boolean hasStClubBaseInfos();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6681mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6682mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6683mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6684mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6685mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetClubGamesByClubIDRsp sCGetClubGamesByClubIDRsp);

            public final native Builder mergeStClubBaseInfos(ClubBaseInfo clubBaseInfo);

            public final native Builder removeVGameRoomBaseInfos(int i);

            public final native Builder removeVSNGGameRoomBaseInfos(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setStClubBaseInfos(com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder setStClubBaseInfos(ClubBaseInfo clubBaseInfo);

            public final native Builder setVGameRoomBaseInfos(int i, com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder builder);

            public final native Builder setVGameRoomBaseInfos(int i, GameRoomBaseInfo gameRoomBaseInfo);

            public final native Builder setVSNGGameRoomBaseInfos(int i, com.texaspoker.moment.TexasPoker$SNGGameRoomBaseInfo.Builder builder);

            public final native Builder setVSNGGameRoomBaseInfos(int i, TexasPoker$SNGGameRoomBaseInfo texasPoker$SNGGameRoomBaseInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.aQ;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{29370, 29371, 29372, 29373, 29374, 29375, 29376, 29377, 29378, 29379, 29380, 29381, 29382, 29383, 29384, 29385, 29386, 29387, 29388, 29389, 29390, 29391, 29392, 29393, 29394, 29395, 29396, 29397, 29398, 29399, 29400, 29401, 29402, 29403, 29404, 29405, 29406, 29407, 29408});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetClubGamesByClubIDRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetClubGamesByClubIDRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetClubGamesByClubIDRsp sCGetClubGamesByClubIDRsp);

        private native SCGetClubGamesByClubIDRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetClubGamesByClubIDRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetClubGamesByClubIDRsp sCGetClubGamesByClubIDRsp);

        private native SCGetClubGamesByClubIDRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6662getDefaultInstanceForType();

        public final native SCGetClubGamesByClubIDRsp m6663getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCGetClubGamesByClubIDRsp> getParserForType();

        public final native int getSerializedSize();

        public final native ClubBaseInfo getStClubBaseInfos();

        public final native ClubBaseInfoOrBuilder getStClubBaseInfosOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native GameRoomBaseInfo getVGameRoomBaseInfos(int i);

        public final native int getVGameRoomBaseInfosCount();

        public final native List<GameRoomBaseInfo> getVGameRoomBaseInfosList();

        public final native GameRoomBaseInfoOrBuilder getVGameRoomBaseInfosOrBuilder(int i);

        public final native List<? extends GameRoomBaseInfoOrBuilder> getVGameRoomBaseInfosOrBuilderList();

        public final native TexasPoker$SNGGameRoomBaseInfo getVSNGGameRoomBaseInfos(int i);

        public final native int getVSNGGameRoomBaseInfosCount();

        public final native List<TexasPoker$SNGGameRoomBaseInfo> getVSNGGameRoomBaseInfosList();

        public final native TexasPoker$SNGGameRoomBaseInfoOrBuilder getVSNGGameRoomBaseInfosOrBuilder(int i);

        public final native List<? extends TexasPoker$SNGGameRoomBaseInfoOrBuilder> getVSNGGameRoomBaseInfosOrBuilderList();

        public final native boolean hasEErrCode();

        public final native boolean hasStClubBaseInfos();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6664newBuilderForType();

        public final native Builder m6665newBuilderForType();

        protected final native Builder m6666newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6667toBuilder();

        public final native Builder m6668toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetClubGamesByClubIDRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.aQ;
        }

        static void __clinit__() {
            PARSER = new C02251();
            SCGetClubGamesByClubIDRsp sCGetClubGamesByClubIDRsp = new SCGetClubGamesByClubIDRsp(true);
            defaultInstance = sCGetClubGamesByClubIDRsp;
            sCGetClubGamesByClubIDRsp.initFields();
        }

        public static SCGetClubGamesByClubIDRsp parseFrom(ByteString byteString) {
            return (SCGetClubGamesByClubIDRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetClubGamesByClubIDRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubGamesByClubIDRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetClubGamesByClubIDRsp parseFrom(byte[] bArr) {
            return (SCGetClubGamesByClubIDRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetClubGamesByClubIDRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubGamesByClubIDRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetClubGamesByClubIDRsp parseFrom(InputStream inputStream) {
            return (SCGetClubGamesByClubIDRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetClubGamesByClubIDRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubGamesByClubIDRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetClubGamesByClubIDRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetClubGamesByClubIDRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetClubGamesByClubIDRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubGamesByClubIDRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetClubGamesByClubIDRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetClubGamesByClubIDRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetClubGamesByClubIDRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubGamesByClubIDRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetClubGamesByClubIDRsp sCGetClubGamesByClubIDRsp) {
            return newBuilder().mergeFrom(sCGetClubGamesByClubIDRsp);
        }
    }

    public interface SCGetClubInfoByUuidRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        long getUuid();

        ClubBaseInfo getVClubBaseInfos(int i);

        int getVClubBaseInfosCount();

        List<ClubBaseInfo> getVClubBaseInfosList();

        ClubBaseInfoOrBuilder getVClubBaseInfosOrBuilder(int i);

        List<? extends ClubBaseInfoOrBuilder> getVClubBaseInfosOrBuilderList();

        boolean hasEErrCode();

        boolean hasUuid();
    }

    public static final class SCGetClubInfoByUuidRsp extends GeneratedMessage implements SCGetClubInfoByUuidRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCGetClubInfoByUuidRsp> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 2;
        public static final int VCLUBBASEINFOS_FIELD_NUMBER = 3;
        private static final SCGetClubInfoByUuidRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;
        private List<ClubBaseInfo> vClubBaseInfos_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.SCGetClubInfoByUuidRsp.1 */
        class C02261 extends AbstractParser<SCGetClubInfoByUuidRsp> {
            static {
                fixHelper.fixfunc(new int[]{6939, 6940});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02261();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetClubInfoByUuidRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private long uuid_;
            private RepeatedFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> vClubBaseInfosBuilder_;
            private List<ClubBaseInfo> vClubBaseInfos_;

            static {
                fixHelper.fixfunc(new int[]{10042, 10043, 10044, 10045, 10046, 10047, 10048, 10049, 10050, 10051, 10052, 10053, 10054, 10055, 10056, 10057, 10058, 10059, 10060, 10061, 10062, 10063, 10064, 10065, 10066, 10067, 10068, 10069, 10070, 10071, 10072, 10073, 10074, 10075, 10076, 10077, 10078, 10079, 10080, 10081, 10082, 10083, 10084, 10085, TEXAS_CMD.Cmd_SCAdminAddCoinRsp_VALUE, TEXAS_CMD.Cmd_SCCreateClubRsp_VALUE, TEXAS_CMD.Cmd_SCEnterClubRsp_VALUE, TEXAS_CMD.Cmd_SCClubActionRsp_VALUE, TEXAS_CMD.Cmd_CSSystemClubMsgRsp_VALUE, TEXAS_CMD.Cmd_SCSearchClubRsp_VALUE, TEXAS_CMD.Cmd_SCGetClubsByLocationRsp_VALUE, TEXAS_CMD.Cmd_SCGetHotClubsRsp_VALUE, TEXAS_CMD.Cmd_SCSetClubInfoRsp_VALUE, TEXAS_CMD.Cmd_SCSetClubUserLevelRsp_VALUE, TEXAS_CMD.Cmd_SCUploadClubIConRsp_VALUE, TEXAS_CMD.Cmd_SCUploadClubCoverRsp_VALUE, TEXAS_CMD.Cmd_SCGetMyClubsRsp_VALUE, TEXAS_CMD.Cmd_SCSetClubSettingRsp_VALUE, TEXAS_CMD.Cmd_SCQuitClubRsp_VALUE, TEXAS_CMD.Cmd_SCSetClubFundRsp_VALUE});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVClubBaseInfosIsMutable();

            private native RepeatedFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> getVClubBaseInfosFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVClubBaseInfos(Iterable<? extends ClubBaseInfo> iterable);

            public final native Builder addVClubBaseInfos(int i, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder addVClubBaseInfos(int i, ClubBaseInfo clubBaseInfo);

            public final native Builder addVClubBaseInfos(com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder addVClubBaseInfos(ClubBaseInfo clubBaseInfo);

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder addVClubBaseInfosBuilder();

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder addVClubBaseInfosBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6693build();

            public final native SCGetClubInfoByUuidRsp m6694build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6695buildPartial();

            public final native SCGetClubInfoByUuidRsp m6696buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6697clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6698clear();

            public final native Builder m6699clear();

            public final native Builder clearEErrCode();

            public final native Builder clearUuid();

            public final native Builder clearVClubBaseInfos();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6700clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6701clone();

            public final native Builder m6702clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6703getDefaultInstanceForType();

            public final native SCGetClubInfoByUuidRsp m6704getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native long getUuid();

            public final native ClubBaseInfo getVClubBaseInfos(int i);

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder getVClubBaseInfosBuilder(int i);

            public final native List<com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder> getVClubBaseInfosBuilderList();

            public final native int getVClubBaseInfosCount();

            public final native List<ClubBaseInfo> getVClubBaseInfosList();

            public final native ClubBaseInfoOrBuilder getVClubBaseInfosOrBuilder(int i);

            public final native List<? extends ClubBaseInfoOrBuilder> getVClubBaseInfosOrBuilderList();

            public final native boolean hasEErrCode();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6705mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6706mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6707mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6708mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6709mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetClubInfoByUuidRsp sCGetClubInfoByUuidRsp);

            public final native Builder removeVClubBaseInfos(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setUuid(long j);

            public final native Builder setVClubBaseInfos(int i, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder setVClubBaseInfos(int i, ClubBaseInfo clubBaseInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.aA;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{31906, 31907, 31908, 31909, 31910, 31911, 31912, 31913, 31914, 31915, 31916, 31917, 31918, 31919, 31920, 31921, 31922, 31923, 31924, 31925, 31926, 31927, 31928, 31929, 31930, 31931, 31932, 31933, 31934, 31935, 31936, 31937, 31938});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetClubInfoByUuidRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetClubInfoByUuidRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetClubInfoByUuidRsp sCGetClubInfoByUuidRsp);

        private native SCGetClubInfoByUuidRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetClubInfoByUuidRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetClubInfoByUuidRsp sCGetClubInfoByUuidRsp);

        private native SCGetClubInfoByUuidRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6686getDefaultInstanceForType();

        public final native SCGetClubInfoByUuidRsp m6687getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCGetClubInfoByUuidRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native ClubBaseInfo getVClubBaseInfos(int i);

        public final native int getVClubBaseInfosCount();

        public final native List<ClubBaseInfo> getVClubBaseInfosList();

        public final native ClubBaseInfoOrBuilder getVClubBaseInfosOrBuilder(int i);

        public final native List<? extends ClubBaseInfoOrBuilder> getVClubBaseInfosOrBuilderList();

        public final native boolean hasEErrCode();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6688newBuilderForType();

        public final native Builder m6689newBuilderForType();

        protected final native Builder m6690newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6691toBuilder();

        public final native Builder m6692toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetClubInfoByUuidRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.aA;
        }

        static void __clinit__() {
            PARSER = new C02261();
            SCGetClubInfoByUuidRsp sCGetClubInfoByUuidRsp = new SCGetClubInfoByUuidRsp(true);
            defaultInstance = sCGetClubInfoByUuidRsp;
            sCGetClubInfoByUuidRsp.initFields();
        }

        public static SCGetClubInfoByUuidRsp parseFrom(ByteString byteString) {
            return (SCGetClubInfoByUuidRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetClubInfoByUuidRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubInfoByUuidRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetClubInfoByUuidRsp parseFrom(byte[] bArr) {
            return (SCGetClubInfoByUuidRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetClubInfoByUuidRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubInfoByUuidRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetClubInfoByUuidRsp parseFrom(InputStream inputStream) {
            return (SCGetClubInfoByUuidRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetClubInfoByUuidRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubInfoByUuidRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetClubInfoByUuidRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetClubInfoByUuidRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetClubInfoByUuidRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubInfoByUuidRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetClubInfoByUuidRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetClubInfoByUuidRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetClubInfoByUuidRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubInfoByUuidRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetClubInfoByUuidRsp sCGetClubInfoByUuidRsp) {
            return newBuilder().mergeFrom(sCGetClubInfoByUuidRsp);
        }
    }

    public interface SCGetClubSellingItemsRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        AddClubFundSellingItem getStAddClubFundSellingItem();

        AddClubFundSellingItemOrBuilder getStAddClubFundSellingItemOrBuilder();

        MaxMemberSellingItem getStMaxMemberSellingItem();

        MaxMemberSellingItemOrBuilder getStMaxMemberSellingItemOrBuilder();

        boolean hasEErrCode();

        boolean hasStAddClubFundSellingItem();

        boolean hasStMaxMemberSellingItem();
    }

    public static final class SCGetClubSellingItemsRsp extends GeneratedMessage implements SCGetClubSellingItemsRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCGetClubSellingItemsRsp> PARSER = null;
        public static final int STADDCLUBFUNDSELLINGITEM_FIELD_NUMBER = 3;
        public static final int STMAXMEMBERSELLINGITEM_FIELD_NUMBER = 2;
        private static final SCGetClubSellingItemsRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private AddClubFundSellingItem stAddClubFundSellingItem_;
        private MaxMemberSellingItem stMaxMemberSellingItem_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.SCGetClubSellingItemsRsp.1 */
        class C02271 extends AbstractParser<SCGetClubSellingItemsRsp> {
            static {
                fixHelper.fixfunc(new int[]{31242, 31243});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02271();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetClubSellingItemsRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private SingleFieldBuilder<AddClubFundSellingItem, Builder, AddClubFundSellingItemOrBuilder> stAddClubFundSellingItemBuilder_;
            private AddClubFundSellingItem stAddClubFundSellingItem_;
            private SingleFieldBuilder<MaxMemberSellingItem, Builder, MaxMemberSellingItemOrBuilder> stMaxMemberSellingItemBuilder_;
            private MaxMemberSellingItem stMaxMemberSellingItem_;

            static {
                fixHelper.fixfunc(new int[]{18461, 18462, 18463, 18464, 18465, 18466, 18467, 18468, 18469, 18470, 18471, 18472, 18473, 18474, 18475, 18476, 18477, 18478, 18479, 18480, 18481, 18482, 18483, 18484, 18485, 18486, 18487, 18488, 18489, 18490, 18491, 18492, 18493, 18494, 18495, 18496, 18497, 18498, 18499, 18500, 18501, 18502, 18503, 18504, 18505, 18506, 18507, 18508, 18509, 18510, 18511, 18512, 18513, 18514});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<AddClubFundSellingItem, Builder, AddClubFundSellingItemOrBuilder> getStAddClubFundSellingItemFieldBuilder();

            private native SingleFieldBuilder<MaxMemberSellingItem, Builder, MaxMemberSellingItemOrBuilder> getStMaxMemberSellingItemFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6717build();

            public final native SCGetClubSellingItemsRsp m6718build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6719buildPartial();

            public final native SCGetClubSellingItemsRsp m6720buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6721clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6722clear();

            public final native Builder m6723clear();

            public final native Builder clearEErrCode();

            public final native Builder clearStAddClubFundSellingItem();

            public final native Builder clearStMaxMemberSellingItem();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6724clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6725clone();

            public final native Builder m6726clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6727getDefaultInstanceForType();

            public final native SCGetClubSellingItemsRsp m6728getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native AddClubFundSellingItem getStAddClubFundSellingItem();

            public final native Builder getStAddClubFundSellingItemBuilder();

            public final native AddClubFundSellingItemOrBuilder getStAddClubFundSellingItemOrBuilder();

            public final native MaxMemberSellingItem getStMaxMemberSellingItem();

            public final native Builder getStMaxMemberSellingItemBuilder();

            public final native MaxMemberSellingItemOrBuilder getStMaxMemberSellingItemOrBuilder();

            public final native boolean hasEErrCode();

            public final native boolean hasStAddClubFundSellingItem();

            public final native boolean hasStMaxMemberSellingItem();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6729mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6730mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6731mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6732mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6733mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetClubSellingItemsRsp sCGetClubSellingItemsRsp);

            public final native Builder mergeStAddClubFundSellingItem(AddClubFundSellingItem addClubFundSellingItem);

            public final native Builder mergeStMaxMemberSellingItem(MaxMemberSellingItem maxMemberSellingItem);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setStAddClubFundSellingItem(Builder builder);

            public final native Builder setStAddClubFundSellingItem(AddClubFundSellingItem addClubFundSellingItem);

            public final native Builder setStMaxMemberSellingItem(Builder builder);

            public final native Builder setStMaxMemberSellingItem(MaxMemberSellingItem maxMemberSellingItem);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.bc;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{14740, 14741, 14742, 14743, 14744, 14745, 14746, 14747, 14748, 14749, 14750, 14751, 14752, 14753, 14754, 14755, 14756, 14757, 14758, 14759, 14760, 14761, 14762, 14763, 14764, 14765, 14766, 14767, 14768, 14769, 14770, 14771});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetClubSellingItemsRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetClubSellingItemsRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetClubSellingItemsRsp sCGetClubSellingItemsRsp);

        private native SCGetClubSellingItemsRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetClubSellingItemsRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetClubSellingItemsRsp sCGetClubSellingItemsRsp);

        private native SCGetClubSellingItemsRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6710getDefaultInstanceForType();

        public final native SCGetClubSellingItemsRsp m6711getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCGetClubSellingItemsRsp> getParserForType();

        public final native int getSerializedSize();

        public final native AddClubFundSellingItem getStAddClubFundSellingItem();

        public final native AddClubFundSellingItemOrBuilder getStAddClubFundSellingItemOrBuilder();

        public final native MaxMemberSellingItem getStMaxMemberSellingItem();

        public final native MaxMemberSellingItemOrBuilder getStMaxMemberSellingItemOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasStAddClubFundSellingItem();

        public final native boolean hasStMaxMemberSellingItem();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6712newBuilderForType();

        public final native Builder m6713newBuilderForType();

        protected final native Builder m6714newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6715toBuilder();

        public final native Builder m6716toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetClubSellingItemsRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.bc;
        }

        static void __clinit__() {
            PARSER = new C02271();
            SCGetClubSellingItemsRsp sCGetClubSellingItemsRsp = new SCGetClubSellingItemsRsp(true);
            defaultInstance = sCGetClubSellingItemsRsp;
            sCGetClubSellingItemsRsp.initFields();
        }

        public static SCGetClubSellingItemsRsp parseFrom(ByteString byteString) {
            return (SCGetClubSellingItemsRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetClubSellingItemsRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubSellingItemsRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetClubSellingItemsRsp parseFrom(byte[] bArr) {
            return (SCGetClubSellingItemsRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetClubSellingItemsRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubSellingItemsRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetClubSellingItemsRsp parseFrom(InputStream inputStream) {
            return (SCGetClubSellingItemsRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetClubSellingItemsRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubSellingItemsRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetClubSellingItemsRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetClubSellingItemsRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetClubSellingItemsRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubSellingItemsRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetClubSellingItemsRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetClubSellingItemsRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetClubSellingItemsRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubSellingItemsRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetClubSellingItemsRsp sCGetClubSellingItemsRsp) {
            return newBuilder().mergeFrom(sCGetClubSellingItemsRsp);
        }
    }

    public interface SCGetClubUsersByClubIDRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        ClubBaseInfo getStClubBaseInfos();

        ClubBaseInfoOrBuilder getStClubBaseInfosOrBuilder();

        ClubUserInfo getVClubUserInfos(int i);

        int getVClubUserInfosCount();

        List<ClubUserInfo> getVClubUserInfosList();

        ClubUserInfoOrBuilder getVClubUserInfosOrBuilder(int i);

        List<? extends ClubUserInfoOrBuilder> getVClubUserInfosOrBuilderList();

        boolean hasEErrCode();

        boolean hasStClubBaseInfos();
    }

    public static final class SCGetClubUsersByClubIDRsp extends GeneratedMessage implements SCGetClubUsersByClubIDRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCGetClubUsersByClubIDRsp> PARSER = null;
        public static final int STCLUBBASEINFOS_FIELD_NUMBER = 2;
        public static final int VCLUBUSERINFOS_FIELD_NUMBER = 3;
        private static final SCGetClubUsersByClubIDRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private ClubBaseInfo stClubBaseInfos_;
        private final UnknownFieldSet unknownFields;
        private List<ClubUserInfo> vClubUserInfos_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.SCGetClubUsersByClubIDRsp.1 */
        class C02281 extends AbstractParser<SCGetClubUsersByClubIDRsp> {
            static {
                fixHelper.fixfunc(new int[]{8028, 8029});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02281();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetClubUsersByClubIDRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private SingleFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> stClubBaseInfosBuilder_;
            private ClubBaseInfo stClubBaseInfos_;
            private RepeatedFieldBuilder<ClubUserInfo, Builder, ClubUserInfoOrBuilder> vClubUserInfosBuilder_;
            private List<ClubUserInfo> vClubUserInfos_;

            static {
                fixHelper.fixfunc(new int[]{32021, 32022, 32023, 32024, 32025, 32026, 32027, 32028, 32029, 32030, 32031, 32032, 32033, 32034, 32035, 32036, 32037, 32038, 32039, 32040, 32041, 32042, 32043, 32044, 32045, 32046, 32047, 32048, 32049, 32050, 32051, 32052, 32053, 32054, 32055, 32056, 32057, 32058, 32059, 32060, 32061, 32062, 32063, 32064, 32065, 32066, 32067, 32068, 32069, 32070, 32071, 32072, 32073, 32074, 32075, 32076, 32077, 32078, 32079, 32080, 32081, 32082, 32083, 32084, 32085});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVClubUserInfosIsMutable();

            private native SingleFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> getStClubBaseInfosFieldBuilder();

            private native RepeatedFieldBuilder<ClubUserInfo, Builder, ClubUserInfoOrBuilder> getVClubUserInfosFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVClubUserInfos(Iterable<? extends ClubUserInfo> iterable);

            public final native Builder addVClubUserInfos(int i, Builder builder);

            public final native Builder addVClubUserInfos(int i, ClubUserInfo clubUserInfo);

            public final native Builder addVClubUserInfos(Builder builder);

            public final native Builder addVClubUserInfos(ClubUserInfo clubUserInfo);

            public final native Builder addVClubUserInfosBuilder();

            public final native Builder addVClubUserInfosBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6741build();

            public final native SCGetClubUsersByClubIDRsp m6742build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6743buildPartial();

            public final native SCGetClubUsersByClubIDRsp m6744buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6745clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6746clear();

            public final native Builder m6747clear();

            public final native Builder clearEErrCode();

            public final native Builder clearStClubBaseInfos();

            public final native Builder clearVClubUserInfos();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6748clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6749clone();

            public final native Builder m6750clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6751getDefaultInstanceForType();

            public final native SCGetClubUsersByClubIDRsp m6752getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native ClubBaseInfo getStClubBaseInfos();

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder getStClubBaseInfosBuilder();

            public final native ClubBaseInfoOrBuilder getStClubBaseInfosOrBuilder();

            public final native ClubUserInfo getVClubUserInfos(int i);

            public final native Builder getVClubUserInfosBuilder(int i);

            public final native List<Builder> getVClubUserInfosBuilderList();

            public final native int getVClubUserInfosCount();

            public final native List<ClubUserInfo> getVClubUserInfosList();

            public final native ClubUserInfoOrBuilder getVClubUserInfosOrBuilder(int i);

            public final native List<? extends ClubUserInfoOrBuilder> getVClubUserInfosOrBuilderList();

            public final native boolean hasEErrCode();

            public final native boolean hasStClubBaseInfos();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6753mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6754mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6755mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6756mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6757mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetClubUsersByClubIDRsp sCGetClubUsersByClubIDRsp);

            public final native Builder mergeStClubBaseInfos(ClubBaseInfo clubBaseInfo);

            public final native Builder removeVClubUserInfos(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setStClubBaseInfos(com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder setStClubBaseInfos(ClubBaseInfo clubBaseInfo);

            public final native Builder setVClubUserInfos(int i, Builder builder);

            public final native Builder setVClubUserInfos(int i, ClubUserInfo clubUserInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.aI;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{26897, 26898, 26899, 26900, 26901, 26902, 26903, 26904, 26905, 26906, 26907, 26908, 26909, 26910, 26911, 26912, 26913, 26914, 26915, 26916, 26917, 26918, 26919, 26920, 26921, 26922, 26923, 26924, 26925, 26926, 26927, 26928, 26929, 26930});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetClubUsersByClubIDRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetClubUsersByClubIDRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetClubUsersByClubIDRsp sCGetClubUsersByClubIDRsp);

        private native SCGetClubUsersByClubIDRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetClubUsersByClubIDRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetClubUsersByClubIDRsp sCGetClubUsersByClubIDRsp);

        private native SCGetClubUsersByClubIDRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6734getDefaultInstanceForType();

        public final native SCGetClubUsersByClubIDRsp m6735getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCGetClubUsersByClubIDRsp> getParserForType();

        public final native int getSerializedSize();

        public final native ClubBaseInfo getStClubBaseInfos();

        public final native ClubBaseInfoOrBuilder getStClubBaseInfosOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native ClubUserInfo getVClubUserInfos(int i);

        public final native int getVClubUserInfosCount();

        public final native List<ClubUserInfo> getVClubUserInfosList();

        public final native ClubUserInfoOrBuilder getVClubUserInfosOrBuilder(int i);

        public final native List<? extends ClubUserInfoOrBuilder> getVClubUserInfosOrBuilderList();

        public final native boolean hasEErrCode();

        public final native boolean hasStClubBaseInfos();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6736newBuilderForType();

        public final native Builder m6737newBuilderForType();

        protected final native Builder m6738newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6739toBuilder();

        public final native Builder m6740toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetClubUsersByClubIDRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.aI;
        }

        static void __clinit__() {
            PARSER = new C02281();
            SCGetClubUsersByClubIDRsp sCGetClubUsersByClubIDRsp = new SCGetClubUsersByClubIDRsp(true);
            defaultInstance = sCGetClubUsersByClubIDRsp;
            sCGetClubUsersByClubIDRsp.initFields();
        }

        public static SCGetClubUsersByClubIDRsp parseFrom(ByteString byteString) {
            return (SCGetClubUsersByClubIDRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetClubUsersByClubIDRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubUsersByClubIDRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetClubUsersByClubIDRsp parseFrom(byte[] bArr) {
            return (SCGetClubUsersByClubIDRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetClubUsersByClubIDRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubUsersByClubIDRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetClubUsersByClubIDRsp parseFrom(InputStream inputStream) {
            return (SCGetClubUsersByClubIDRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetClubUsersByClubIDRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubUsersByClubIDRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetClubUsersByClubIDRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetClubUsersByClubIDRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetClubUsersByClubIDRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubUsersByClubIDRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetClubUsersByClubIDRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetClubUsersByClubIDRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetClubUsersByClubIDRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubUsersByClubIDRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetClubUsersByClubIDRsp sCGetClubUsersByClubIDRsp) {
            return newBuilder().mergeFrom(sCGetClubUsersByClubIDRsp);
        }
    }

    public interface SCGetClubsByLocationRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        ClubBaseInfo getVClubBaseInfos(int i);

        int getVClubBaseInfosCount();

        List<ClubBaseInfo> getVClubBaseInfosList();

        ClubBaseInfoOrBuilder getVClubBaseInfosOrBuilder(int i);

        List<? extends ClubBaseInfoOrBuilder> getVClubBaseInfosOrBuilderList();

        boolean hasEErrCode();
    }

    public static final class SCGetClubsByLocationRsp extends GeneratedMessage implements SCGetClubsByLocationRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCGetClubsByLocationRsp> PARSER = null;
        public static final int VCLUBBASEINFOS_FIELD_NUMBER = 2;
        private static final SCGetClubsByLocationRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private List<ClubBaseInfo> vClubBaseInfos_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.SCGetClubsByLocationRsp.1 */
        class C02291 extends AbstractParser<SCGetClubsByLocationRsp> {
            static {
                fixHelper.fixfunc(new int[]{20424, 20425});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02291();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetClubsByLocationRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private RepeatedFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> vClubBaseInfosBuilder_;
            private List<ClubBaseInfo> vClubBaseInfos_;

            static {
                fixHelper.fixfunc(new int[]{6975, 6976, 6977, 6978, 6979, 6980, 6981, 6982, 6983, 6984, 6985, 6986, 6987, 6988, 6989, 6990, 6991, 6992, 6993, 6994, 6995, 6996, 6997, 6998, 6999, 7000, 7001, 7002, 7003, 7004, 7005, 7006, 7007, 7008, 7009, 7010, 7011, 7012, 7013, 7014, 7015, 7016, 7017, 7018, 7019, 7020, 7021, 7022, 7023, 7024, 7025, 7026, 7027, 7028, 7029, 7030});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVClubBaseInfosIsMutable();

            private native RepeatedFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> getVClubBaseInfosFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVClubBaseInfos(Iterable<? extends ClubBaseInfo> iterable);

            public final native Builder addVClubBaseInfos(int i, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder addVClubBaseInfos(int i, ClubBaseInfo clubBaseInfo);

            public final native Builder addVClubBaseInfos(com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder addVClubBaseInfos(ClubBaseInfo clubBaseInfo);

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder addVClubBaseInfosBuilder();

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder addVClubBaseInfosBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6765build();

            public final native SCGetClubsByLocationRsp m6766build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6767buildPartial();

            public final native SCGetClubsByLocationRsp m6768buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6769clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6770clear();

            public final native Builder m6771clear();

            public final native Builder clearEErrCode();

            public final native Builder clearVClubBaseInfos();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6772clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6773clone();

            public final native Builder m6774clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6775getDefaultInstanceForType();

            public final native SCGetClubsByLocationRsp m6776getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native ClubBaseInfo getVClubBaseInfos(int i);

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder getVClubBaseInfosBuilder(int i);

            public final native List<com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder> getVClubBaseInfosBuilderList();

            public final native int getVClubBaseInfosCount();

            public final native List<ClubBaseInfo> getVClubBaseInfosList();

            public final native ClubBaseInfoOrBuilder getVClubBaseInfosOrBuilder(int i);

            public final native List<? extends ClubBaseInfoOrBuilder> getVClubBaseInfosOrBuilderList();

            public final native boolean hasEErrCode();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6777mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6778mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6779mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6780mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6781mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetClubsByLocationRsp sCGetClubsByLocationRsp);

            public final native Builder removeVClubBaseInfos(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setVClubBaseInfos(int i, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder setVClubBaseInfos(int i, ClubBaseInfo clubBaseInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.f170w;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{22885, 22886, 22887, 22888, 22889, 22890, 22891, 22892, 22893, 22894, 22895, 22896, 22897, 22898, 22899, 22900, 22901, 22902, 22903, 22904, 22905, 22906, 22907, 22908, 22909, 22910, 22911, 22912, 22913, 22914, 22915});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetClubsByLocationRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetClubsByLocationRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetClubsByLocationRsp sCGetClubsByLocationRsp);

        private native SCGetClubsByLocationRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetClubsByLocationRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetClubsByLocationRsp sCGetClubsByLocationRsp);

        private native SCGetClubsByLocationRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6758getDefaultInstanceForType();

        public final native SCGetClubsByLocationRsp m6759getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCGetClubsByLocationRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native ClubBaseInfo getVClubBaseInfos(int i);

        public final native int getVClubBaseInfosCount();

        public final native List<ClubBaseInfo> getVClubBaseInfosList();

        public final native ClubBaseInfoOrBuilder getVClubBaseInfosOrBuilder(int i);

        public final native List<? extends ClubBaseInfoOrBuilder> getVClubBaseInfosOrBuilderList();

        public final native boolean hasEErrCode();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6760newBuilderForType();

        public final native Builder m6761newBuilderForType();

        protected final native Builder m6762newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6763toBuilder();

        public final native Builder m6764toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetClubsByLocationRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.f170w;
        }

        static void __clinit__() {
            PARSER = new C02291();
            SCGetClubsByLocationRsp sCGetClubsByLocationRsp = new SCGetClubsByLocationRsp(true);
            defaultInstance = sCGetClubsByLocationRsp;
            sCGetClubsByLocationRsp.initFields();
        }

        public static SCGetClubsByLocationRsp parseFrom(ByteString byteString) {
            return (SCGetClubsByLocationRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetClubsByLocationRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubsByLocationRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetClubsByLocationRsp parseFrom(byte[] bArr) {
            return (SCGetClubsByLocationRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetClubsByLocationRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubsByLocationRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetClubsByLocationRsp parseFrom(InputStream inputStream) {
            return (SCGetClubsByLocationRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetClubsByLocationRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubsByLocationRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetClubsByLocationRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetClubsByLocationRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetClubsByLocationRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubsByLocationRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetClubsByLocationRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetClubsByLocationRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetClubsByLocationRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetClubsByLocationRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetClubsByLocationRsp sCGetClubsByLocationRsp) {
            return newBuilder().mergeFrom(sCGetClubsByLocationRsp);
        }
    }

    public interface SCGetFundBillInfosRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        long getLClubID();

        FundBillInfo getVFundBillInfos(int i);

        int getVFundBillInfosCount();

        List<FundBillInfo> getVFundBillInfosList();

        FundBillInfoOrBuilder getVFundBillInfosOrBuilder(int i);

        List<? extends FundBillInfoOrBuilder> getVFundBillInfosOrBuilderList();

        boolean hasEErrCode();

        boolean hasLClubID();
    }

    public static final class SCGetFundBillInfosRsp extends GeneratedMessage implements SCGetFundBillInfosRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static Parser<SCGetFundBillInfosRsp> PARSER = null;
        public static final int VFUNDBILLINFOS_FIELD_NUMBER = 3;
        private static final SCGetFundBillInfosRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lClubID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private List<FundBillInfo> vFundBillInfos_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.SCGetFundBillInfosRsp.1 */
        class C02301 extends AbstractParser<SCGetFundBillInfosRsp> {
            static {
                fixHelper.fixfunc(new int[]{11338, 11339});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02301();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetFundBillInfosRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private long lClubID_;
            private RepeatedFieldBuilder<FundBillInfo, Builder, FundBillInfoOrBuilder> vFundBillInfosBuilder_;
            private List<FundBillInfo> vFundBillInfos_;

            static {
                fixHelper.fixfunc(new int[]{5874, 5875, 5876, 5877, 5878, 5879, 5880, 5881, 5882, 5883, 5884, 5885, 5886, 5887, 5888, 5889, 5890, 5891, 5892, 5893, 5894, 5895, 5896, 5897, 5898, 5899, 5900, 5901, 5902, 5903, 5904, 5905, 5906, 5907, 5908, 5909, 5910, 5911, 5912, 5913, 5914, 5915, 5916, 5917, 5918, 5919, 5920, 5921, 5922, 5923, 5924, 5925, 5926, 5927, 5928, 5929, 5930, 5931, 5932, 5933});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVFundBillInfosIsMutable();

            private native RepeatedFieldBuilder<FundBillInfo, Builder, FundBillInfoOrBuilder> getVFundBillInfosFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVFundBillInfos(Iterable<? extends FundBillInfo> iterable);

            public final native Builder addVFundBillInfos(int i, Builder builder);

            public final native Builder addVFundBillInfos(int i, FundBillInfo fundBillInfo);

            public final native Builder addVFundBillInfos(Builder builder);

            public final native Builder addVFundBillInfos(FundBillInfo fundBillInfo);

            public final native Builder addVFundBillInfosBuilder();

            public final native Builder addVFundBillInfosBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6789build();

            public final native SCGetFundBillInfosRsp m6790build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6791buildPartial();

            public final native SCGetFundBillInfosRsp m6792buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6793clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6794clear();

            public final native Builder m6795clear();

            public final native Builder clearEErrCode();

            public final native Builder clearLClubID();

            public final native Builder clearVFundBillInfos();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6796clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6797clone();

            public final native Builder m6798clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6799getDefaultInstanceForType();

            public final native SCGetFundBillInfosRsp m6800getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native long getLClubID();

            public final native FundBillInfo getVFundBillInfos(int i);

            public final native Builder getVFundBillInfosBuilder(int i);

            public final native List<Builder> getVFundBillInfosBuilderList();

            public final native int getVFundBillInfosCount();

            public final native List<FundBillInfo> getVFundBillInfosList();

            public final native FundBillInfoOrBuilder getVFundBillInfosOrBuilder(int i);

            public final native List<? extends FundBillInfoOrBuilder> getVFundBillInfosOrBuilderList();

            public final native boolean hasEErrCode();

            public final native boolean hasLClubID();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6801mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6802mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6803mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6804mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6805mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetFundBillInfosRsp sCGetFundBillInfosRsp);

            public final native Builder removeVFundBillInfos(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setLClubID(long j);

            public final native Builder setVFundBillInfos(int i, Builder builder);

            public final native Builder setVFundBillInfos(int i, FundBillInfo fundBillInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.as;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{18260, 18261, 18262, 18263, 18264, 18265, 18266, 18267, 18268, 18269, 18270, 18271, 18272, 18273, 18274, 18275, 18276, 18277, 18278, 18279, 18280, 18281, 18282, 18283, 18284, 18285, 18286, 18287, 18288, 18289, 18290, 18291, 18292});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetFundBillInfosRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetFundBillInfosRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetFundBillInfosRsp sCGetFundBillInfosRsp);

        private native SCGetFundBillInfosRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetFundBillInfosRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetFundBillInfosRsp sCGetFundBillInfosRsp);

        private native SCGetFundBillInfosRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6782getDefaultInstanceForType();

        public final native SCGetFundBillInfosRsp m6783getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLClubID();

        public final native Parser<SCGetFundBillInfosRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native FundBillInfo getVFundBillInfos(int i);

        public final native int getVFundBillInfosCount();

        public final native List<FundBillInfo> getVFundBillInfosList();

        public final native FundBillInfoOrBuilder getVFundBillInfosOrBuilder(int i);

        public final native List<? extends FundBillInfoOrBuilder> getVFundBillInfosOrBuilderList();

        public final native boolean hasEErrCode();

        public final native boolean hasLClubID();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6784newBuilderForType();

        public final native Builder m6785newBuilderForType();

        protected final native Builder m6786newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6787toBuilder();

        public final native Builder m6788toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetFundBillInfosRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.as;
        }

        static void __clinit__() {
            PARSER = new C02301();
            SCGetFundBillInfosRsp sCGetFundBillInfosRsp = new SCGetFundBillInfosRsp(true);
            defaultInstance = sCGetFundBillInfosRsp;
            sCGetFundBillInfosRsp.initFields();
        }

        public static SCGetFundBillInfosRsp parseFrom(ByteString byteString) {
            return (SCGetFundBillInfosRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetFundBillInfosRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetFundBillInfosRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetFundBillInfosRsp parseFrom(byte[] bArr) {
            return (SCGetFundBillInfosRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetFundBillInfosRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetFundBillInfosRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetFundBillInfosRsp parseFrom(InputStream inputStream) {
            return (SCGetFundBillInfosRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetFundBillInfosRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetFundBillInfosRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetFundBillInfosRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetFundBillInfosRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetFundBillInfosRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetFundBillInfosRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetFundBillInfosRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetFundBillInfosRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetFundBillInfosRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetFundBillInfosRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetFundBillInfosRsp sCGetFundBillInfosRsp) {
            return newBuilder().mergeFrom(sCGetFundBillInfosRsp);
        }
    }

    public interface SCGetHotClubsRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        ClubBaseInfo getVClubBaseInfos(int i);

        int getVClubBaseInfosCount();

        List<ClubBaseInfo> getVClubBaseInfosList();

        ClubBaseInfoOrBuilder getVClubBaseInfosOrBuilder(int i);

        List<? extends ClubBaseInfoOrBuilder> getVClubBaseInfosOrBuilderList();

        boolean hasEErrCode();
    }

    public static final class SCGetHotClubsRsp extends GeneratedMessage implements SCGetHotClubsRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCGetHotClubsRsp> PARSER = null;
        public static final int VCLUBBASEINFOS_FIELD_NUMBER = 2;
        private static final SCGetHotClubsRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private List<ClubBaseInfo> vClubBaseInfos_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.SCGetHotClubsRsp.1 */
        class C02311 extends AbstractParser<SCGetHotClubsRsp> {
            static {
                fixHelper.fixfunc(new int[]{19797, 19798});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02311();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetHotClubsRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private RepeatedFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> vClubBaseInfosBuilder_;
            private List<ClubBaseInfo> vClubBaseInfos_;

            static {
                fixHelper.fixfunc(new int[]{4266, 4267, 4268, 4269, 4270, 4271, 4272, 4273, 4274, 4275, 4276, 4277, 4278, 4279, 4280, 4281, 4282, 4283, 4284, 4285, 4286, 4287, 4288, 4289, 4290, 4291, 4292, 4293, 4294, 4295, 4296, 4297, 4298, 4299, 4300, 4301, 4302, 4303, 4304, 4305, 4306, 4307, 4308, 4309, 4310, 4311, 4312, 4313, 4314, 4315, 4316, 4317, 4318, 4319, 4320, 4321});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVClubBaseInfosIsMutable();

            private native RepeatedFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> getVClubBaseInfosFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVClubBaseInfos(Iterable<? extends ClubBaseInfo> iterable);

            public final native Builder addVClubBaseInfos(int i, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder addVClubBaseInfos(int i, ClubBaseInfo clubBaseInfo);

            public final native Builder addVClubBaseInfos(com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder addVClubBaseInfos(ClubBaseInfo clubBaseInfo);

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder addVClubBaseInfosBuilder();

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder addVClubBaseInfosBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6813build();

            public final native SCGetHotClubsRsp m6814build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6815buildPartial();

            public final native SCGetHotClubsRsp m6816buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6817clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6818clear();

            public final native Builder m6819clear();

            public final native Builder clearEErrCode();

            public final native Builder clearVClubBaseInfos();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6820clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6821clone();

            public final native Builder m6822clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6823getDefaultInstanceForType();

            public final native SCGetHotClubsRsp m6824getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native ClubBaseInfo getVClubBaseInfos(int i);

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder getVClubBaseInfosBuilder(int i);

            public final native List<com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder> getVClubBaseInfosBuilderList();

            public final native int getVClubBaseInfosCount();

            public final native List<ClubBaseInfo> getVClubBaseInfosList();

            public final native ClubBaseInfoOrBuilder getVClubBaseInfosOrBuilder(int i);

            public final native List<? extends ClubBaseInfoOrBuilder> getVClubBaseInfosOrBuilderList();

            public final native boolean hasEErrCode();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6825mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6826mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6827mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6828mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6829mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetHotClubsRsp sCGetHotClubsRsp);

            public final native Builder removeVClubBaseInfos(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setVClubBaseInfos(int i, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder setVClubBaseInfos(int i, ClubBaseInfo clubBaseInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.f122A;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{10976, 10977, 10978, 10979, 10980, 10981, 10982, 10983, 10984, 10985, 10986, 10987, 10988, 10989, 10990, 10991, 10992, 10993, 10994, 10995, 10996, 10997, 10998, 10999, 11000, 11001, 11002, 11003, 11004, 11005, 11006});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetHotClubsRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetHotClubsRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetHotClubsRsp sCGetHotClubsRsp);

        private native SCGetHotClubsRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetHotClubsRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetHotClubsRsp sCGetHotClubsRsp);

        private native SCGetHotClubsRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6806getDefaultInstanceForType();

        public final native SCGetHotClubsRsp m6807getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCGetHotClubsRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native ClubBaseInfo getVClubBaseInfos(int i);

        public final native int getVClubBaseInfosCount();

        public final native List<ClubBaseInfo> getVClubBaseInfosList();

        public final native ClubBaseInfoOrBuilder getVClubBaseInfosOrBuilder(int i);

        public final native List<? extends ClubBaseInfoOrBuilder> getVClubBaseInfosOrBuilderList();

        public final native boolean hasEErrCode();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6808newBuilderForType();

        public final native Builder m6809newBuilderForType();

        protected final native Builder m6810newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6811toBuilder();

        public final native Builder m6812toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetHotClubsRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.f122A;
        }

        static void __clinit__() {
            PARSER = new C02311();
            SCGetHotClubsRsp sCGetHotClubsRsp = new SCGetHotClubsRsp(true);
            defaultInstance = sCGetHotClubsRsp;
            sCGetHotClubsRsp.initFields();
        }

        public static SCGetHotClubsRsp parseFrom(ByteString byteString) {
            return (SCGetHotClubsRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetHotClubsRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetHotClubsRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetHotClubsRsp parseFrom(byte[] bArr) {
            return (SCGetHotClubsRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetHotClubsRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetHotClubsRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetHotClubsRsp parseFrom(InputStream inputStream) {
            return (SCGetHotClubsRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetHotClubsRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetHotClubsRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetHotClubsRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetHotClubsRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetHotClubsRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetHotClubsRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetHotClubsRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetHotClubsRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetHotClubsRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetHotClubsRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetHotClubsRsp sCGetHotClubsRsp) {
            return newBuilder().mergeFrom(sCGetHotClubsRsp);
        }
    }

    public interface SCGetMyClubsRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        ClubBaseInfo getVAttendedClubBaseInfos(int i);

        int getVAttendedClubBaseInfosCount();

        List<ClubBaseInfo> getVAttendedClubBaseInfosList();

        ClubBaseInfoOrBuilder getVAttendedClubBaseInfosOrBuilder(int i);

        List<? extends ClubBaseInfoOrBuilder> getVAttendedClubBaseInfosOrBuilderList();

        ClubBaseInfo getVMyClubBaseInfos(int i);

        int getVMyClubBaseInfosCount();

        List<ClubBaseInfo> getVMyClubBaseInfosList();

        ClubBaseInfoOrBuilder getVMyClubBaseInfosOrBuilder(int i);

        List<? extends ClubBaseInfoOrBuilder> getVMyClubBaseInfosOrBuilderList();

        boolean hasEErrCode();
    }

    public static final class SCGetMyClubsRsp extends GeneratedMessage implements SCGetMyClubsRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCGetMyClubsRsp> PARSER = null;
        public static final int VATTENDEDCLUBBASEINFOS_FIELD_NUMBER = 3;
        public static final int VMYCLUBBASEINFOS_FIELD_NUMBER = 2;
        private static final SCGetMyClubsRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private List<ClubBaseInfo> vAttendedClubBaseInfos_;
        private List<ClubBaseInfo> vMyClubBaseInfos_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.SCGetMyClubsRsp.1 */
        class C02321 extends AbstractParser<SCGetMyClubsRsp> {
            static {
                fixHelper.fixfunc(new int[]{18927, 18928});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02321();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetMyClubsRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private RepeatedFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> vAttendedClubBaseInfosBuilder_;
            private List<ClubBaseInfo> vAttendedClubBaseInfos_;
            private RepeatedFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> vMyClubBaseInfosBuilder_;
            private List<ClubBaseInfo> vMyClubBaseInfos_;

            static {
                fixHelper.fixfunc(new int[]{16852, 16853, 16854, 16855, 16856, 16857, 16858, 16859, 16860, 16861, 16862, 16863, 16864, 16865, 16866, 16867, 16868, 16869, 16870, 16871, 16872, 16873, 16874, 16875, 16876, 16877, 16878, 16879, 16880, 16881, 16882, 16883, 16884, 16885, 16886, 16887, 16888, 16889, 16890, 16891, 16892, 16893, 16894, 16895, 16896, 16897, 16898, 16899, 16900, 16901, 16902, 16903, 16904, 16905, 16906, 16907, 16908, 16909, 16910, 16911, 16912, 16913, 16914, 16915, 16916, 16917, 16918, 16919, 16920, 16921, 16922, 16923, 16924, 16925, 16926, 16927});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVAttendedClubBaseInfosIsMutable();

            private native void ensureVMyClubBaseInfosIsMutable();

            private native RepeatedFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> getVAttendedClubBaseInfosFieldBuilder();

            private native RepeatedFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> getVMyClubBaseInfosFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVAttendedClubBaseInfos(Iterable<? extends ClubBaseInfo> iterable);

            public final native Builder addAllVMyClubBaseInfos(Iterable<? extends ClubBaseInfo> iterable);

            public final native Builder addVAttendedClubBaseInfos(int i, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder addVAttendedClubBaseInfos(int i, ClubBaseInfo clubBaseInfo);

            public final native Builder addVAttendedClubBaseInfos(com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder addVAttendedClubBaseInfos(ClubBaseInfo clubBaseInfo);

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder addVAttendedClubBaseInfosBuilder();

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder addVAttendedClubBaseInfosBuilder(int i);

            public final native Builder addVMyClubBaseInfos(int i, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder addVMyClubBaseInfos(int i, ClubBaseInfo clubBaseInfo);

            public final native Builder addVMyClubBaseInfos(com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder addVMyClubBaseInfos(ClubBaseInfo clubBaseInfo);

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder addVMyClubBaseInfosBuilder();

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder addVMyClubBaseInfosBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6837build();

            public final native SCGetMyClubsRsp m6838build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6839buildPartial();

            public final native SCGetMyClubsRsp m6840buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6841clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6842clear();

            public final native Builder m6843clear();

            public final native Builder clearEErrCode();

            public final native Builder clearVAttendedClubBaseInfos();

            public final native Builder clearVMyClubBaseInfos();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6844clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6845clone();

            public final native Builder m6846clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6847getDefaultInstanceForType();

            public final native SCGetMyClubsRsp m6848getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native ClubBaseInfo getVAttendedClubBaseInfos(int i);

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder getVAttendedClubBaseInfosBuilder(int i);

            public final native List<com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder> getVAttendedClubBaseInfosBuilderList();

            public final native int getVAttendedClubBaseInfosCount();

            public final native List<ClubBaseInfo> getVAttendedClubBaseInfosList();

            public final native ClubBaseInfoOrBuilder getVAttendedClubBaseInfosOrBuilder(int i);

            public final native List<? extends ClubBaseInfoOrBuilder> getVAttendedClubBaseInfosOrBuilderList();

            public final native ClubBaseInfo getVMyClubBaseInfos(int i);

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder getVMyClubBaseInfosBuilder(int i);

            public final native List<com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder> getVMyClubBaseInfosBuilderList();

            public final native int getVMyClubBaseInfosCount();

            public final native List<ClubBaseInfo> getVMyClubBaseInfosList();

            public final native ClubBaseInfoOrBuilder getVMyClubBaseInfosOrBuilder(int i);

            public final native List<? extends ClubBaseInfoOrBuilder> getVMyClubBaseInfosOrBuilderList();

            public final native boolean hasEErrCode();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6849mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6850mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6851mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6852mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6853mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetMyClubsRsp sCGetMyClubsRsp);

            public final native Builder removeVAttendedClubBaseInfos(int i);

            public final native Builder removeVMyClubBaseInfos(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setVAttendedClubBaseInfos(int i, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder setVAttendedClubBaseInfos(int i, ClubBaseInfo clubBaseInfo);

            public final native Builder setVMyClubBaseInfos(int i, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder setVMyClubBaseInfos(int i, ClubBaseInfo clubBaseInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.ac;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{7786, 7787, 7788, 7789, 7790, 7791, 7792, 7793, 7794, 7795, 7796, 7797, 7798, 7799, 7800, 7801, 7802, 7803, 7804, 7805, 7806, 7807, 7808, 7809, 7810, 7811, 7812, 7813, 7814, 7815, 7816, 7817, 7818, 7819, 7820, 7821});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetMyClubsRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetMyClubsRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetMyClubsRsp sCGetMyClubsRsp);

        private native SCGetMyClubsRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetMyClubsRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetMyClubsRsp sCGetMyClubsRsp);

        private native SCGetMyClubsRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6830getDefaultInstanceForType();

        public final native SCGetMyClubsRsp m6831getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCGetMyClubsRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native ClubBaseInfo getVAttendedClubBaseInfos(int i);

        public final native int getVAttendedClubBaseInfosCount();

        public final native List<ClubBaseInfo> getVAttendedClubBaseInfosList();

        public final native ClubBaseInfoOrBuilder getVAttendedClubBaseInfosOrBuilder(int i);

        public final native List<? extends ClubBaseInfoOrBuilder> getVAttendedClubBaseInfosOrBuilderList();

        public final native ClubBaseInfo getVMyClubBaseInfos(int i);

        public final native int getVMyClubBaseInfosCount();

        public final native List<ClubBaseInfo> getVMyClubBaseInfosList();

        public final native ClubBaseInfoOrBuilder getVMyClubBaseInfosOrBuilder(int i);

        public final native List<? extends ClubBaseInfoOrBuilder> getVMyClubBaseInfosOrBuilderList();

        public final native boolean hasEErrCode();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6832newBuilderForType();

        public final native Builder m6833newBuilderForType();

        protected final native Builder m6834newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6835toBuilder();

        public final native Builder m6836toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetMyClubsRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.ac;
        }

        static void __clinit__() {
            PARSER = new C02321();
            SCGetMyClubsRsp sCGetMyClubsRsp = new SCGetMyClubsRsp(true);
            defaultInstance = sCGetMyClubsRsp;
            sCGetMyClubsRsp.initFields();
        }

        public static SCGetMyClubsRsp parseFrom(ByteString byteString) {
            return (SCGetMyClubsRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetMyClubsRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetMyClubsRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetMyClubsRsp parseFrom(byte[] bArr) {
            return (SCGetMyClubsRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetMyClubsRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetMyClubsRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetMyClubsRsp parseFrom(InputStream inputStream) {
            return (SCGetMyClubsRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetMyClubsRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetMyClubsRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetMyClubsRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetMyClubsRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetMyClubsRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetMyClubsRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetMyClubsRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetMyClubsRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetMyClubsRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetMyClubsRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetMyClubsRsp sCGetMyClubsRsp) {
            return newBuilder().mergeFrom(sCGetMyClubsRsp);
        }
    }

    public interface SCGetMyClubsV2RspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        ClubManagerBaseInfo getVAttendedClubBaseInfos(int i);

        int getVAttendedClubBaseInfosCount();

        List<ClubManagerBaseInfo> getVAttendedClubBaseInfosList();

        ClubManagerBaseInfoOrBuilder getVAttendedClubBaseInfosOrBuilder(int i);

        List<? extends ClubManagerBaseInfoOrBuilder> getVAttendedClubBaseInfosOrBuilderList();

        ClubManagerBaseInfo getVMyClubBaseInfos(int i);

        int getVMyClubBaseInfosCount();

        List<ClubManagerBaseInfo> getVMyClubBaseInfosList();

        ClubManagerBaseInfoOrBuilder getVMyClubBaseInfosOrBuilder(int i);

        List<? extends ClubManagerBaseInfoOrBuilder> getVMyClubBaseInfosOrBuilderList();

        boolean hasEErrCode();
    }

    public static final class SCGetMyClubsV2Rsp extends GeneratedMessage implements SCGetMyClubsV2RspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCGetMyClubsV2Rsp> PARSER = null;
        public static final int VATTENDEDCLUBBASEINFOS_FIELD_NUMBER = 3;
        public static final int VMYCLUBBASEINFOS_FIELD_NUMBER = 2;
        private static final SCGetMyClubsV2Rsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private List<ClubManagerBaseInfo> vAttendedClubBaseInfos_;
        private List<ClubManagerBaseInfo> vMyClubBaseInfos_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.SCGetMyClubsV2Rsp.1 */
        class C02331 extends AbstractParser<SCGetMyClubsV2Rsp> {
            static {
                fixHelper.fixfunc(new int[]{10372, 10373});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02331();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetMyClubsV2RspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private RepeatedFieldBuilder<ClubManagerBaseInfo, Builder, ClubManagerBaseInfoOrBuilder> vAttendedClubBaseInfosBuilder_;
            private List<ClubManagerBaseInfo> vAttendedClubBaseInfos_;
            private RepeatedFieldBuilder<ClubManagerBaseInfo, Builder, ClubManagerBaseInfoOrBuilder> vMyClubBaseInfosBuilder_;
            private List<ClubManagerBaseInfo> vMyClubBaseInfos_;

            static {
                fixHelper.fixfunc(new int[]{24373, 24374, 24375, 24376, 24377, 24378, 24379, 24380, 24381, 24382, 24383, 24384, 24385, 24386, 24387, 24388, 24389, 24390, 24391, 24392, 24393, 24394, 24395, 24396, 24397, 24398, 24399, 24400, 24401, 24402, 24403, 24404, 24405, 24406, 24407, 24408, 24409, 24410, 24411, 24412, 24413, 24414, 24415, 24416, 24417, 24418, 24419, 24420, 24421, 24422, 24423, 24424, 24425, 24426, 24427, 24428, 24429, 24430, 24431, 24432, 24433, 24434, 24435, 24436, 24437, 24438, 24439, 24440, 24441, 24442, 24443, 24444, 24445, 24446, 24447, 24448});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVAttendedClubBaseInfosIsMutable();

            private native void ensureVMyClubBaseInfosIsMutable();

            private native RepeatedFieldBuilder<ClubManagerBaseInfo, Builder, ClubManagerBaseInfoOrBuilder> getVAttendedClubBaseInfosFieldBuilder();

            private native RepeatedFieldBuilder<ClubManagerBaseInfo, Builder, ClubManagerBaseInfoOrBuilder> getVMyClubBaseInfosFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVAttendedClubBaseInfos(Iterable<? extends ClubManagerBaseInfo> iterable);

            public final native Builder addAllVMyClubBaseInfos(Iterable<? extends ClubManagerBaseInfo> iterable);

            public final native Builder addVAttendedClubBaseInfos(int i, Builder builder);

            public final native Builder addVAttendedClubBaseInfos(int i, ClubManagerBaseInfo clubManagerBaseInfo);

            public final native Builder addVAttendedClubBaseInfos(Builder builder);

            public final native Builder addVAttendedClubBaseInfos(ClubManagerBaseInfo clubManagerBaseInfo);

            public final native Builder addVAttendedClubBaseInfosBuilder();

            public final native Builder addVAttendedClubBaseInfosBuilder(int i);

            public final native Builder addVMyClubBaseInfos(int i, Builder builder);

            public final native Builder addVMyClubBaseInfos(int i, ClubManagerBaseInfo clubManagerBaseInfo);

            public final native Builder addVMyClubBaseInfos(Builder builder);

            public final native Builder addVMyClubBaseInfos(ClubManagerBaseInfo clubManagerBaseInfo);

            public final native Builder addVMyClubBaseInfosBuilder();

            public final native Builder addVMyClubBaseInfosBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6861build();

            public final native SCGetMyClubsV2Rsp m6862build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6863buildPartial();

            public final native SCGetMyClubsV2Rsp m6864buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6865clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6866clear();

            public final native Builder m6867clear();

            public final native Builder clearEErrCode();

            public final native Builder clearVAttendedClubBaseInfos();

            public final native Builder clearVMyClubBaseInfos();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6868clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6869clone();

            public final native Builder m6870clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6871getDefaultInstanceForType();

            public final native SCGetMyClubsV2Rsp m6872getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native ClubManagerBaseInfo getVAttendedClubBaseInfos(int i);

            public final native Builder getVAttendedClubBaseInfosBuilder(int i);

            public final native List<Builder> getVAttendedClubBaseInfosBuilderList();

            public final native int getVAttendedClubBaseInfosCount();

            public final native List<ClubManagerBaseInfo> getVAttendedClubBaseInfosList();

            public final native ClubManagerBaseInfoOrBuilder getVAttendedClubBaseInfosOrBuilder(int i);

            public final native List<? extends ClubManagerBaseInfoOrBuilder> getVAttendedClubBaseInfosOrBuilderList();

            public final native ClubManagerBaseInfo getVMyClubBaseInfos(int i);

            public final native Builder getVMyClubBaseInfosBuilder(int i);

            public final native List<Builder> getVMyClubBaseInfosBuilderList();

            public final native int getVMyClubBaseInfosCount();

            public final native List<ClubManagerBaseInfo> getVMyClubBaseInfosList();

            public final native ClubManagerBaseInfoOrBuilder getVMyClubBaseInfosOrBuilder(int i);

            public final native List<? extends ClubManagerBaseInfoOrBuilder> getVMyClubBaseInfosOrBuilderList();

            public final native boolean hasEErrCode();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6873mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6874mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6875mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6876mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6877mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetMyClubsV2Rsp sCGetMyClubsV2Rsp);

            public final native Builder removeVAttendedClubBaseInfos(int i);

            public final native Builder removeVMyClubBaseInfos(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setVAttendedClubBaseInfos(int i, Builder builder);

            public final native Builder setVAttendedClubBaseInfos(int i, ClubManagerBaseInfo clubManagerBaseInfo);

            public final native Builder setVMyClubBaseInfos(int i, Builder builder);

            public final native Builder setVMyClubBaseInfos(int i, ClubManagerBaseInfo clubManagerBaseInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.ai;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{29082, 29083, 29084, 29085, 29086, 29087, 29088, 29089, 29090, 29091, 29092, 29093, 29094, 29095, 29096, 29097, 29098, 29099, 29100, 29101, 29102, 29103, 29104, 29105, 29106, 29107, 29108, 29109, 29110, 29111, 29112, 29113, 29114, 29115, 29116, 29117});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetMyClubsV2Rsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetMyClubsV2Rsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetMyClubsV2Rsp sCGetMyClubsV2Rsp);

        private native SCGetMyClubsV2Rsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetMyClubsV2Rsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetMyClubsV2Rsp sCGetMyClubsV2Rsp);

        private native SCGetMyClubsV2Rsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6854getDefaultInstanceForType();

        public final native SCGetMyClubsV2Rsp m6855getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCGetMyClubsV2Rsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native ClubManagerBaseInfo getVAttendedClubBaseInfos(int i);

        public final native int getVAttendedClubBaseInfosCount();

        public final native List<ClubManagerBaseInfo> getVAttendedClubBaseInfosList();

        public final native ClubManagerBaseInfoOrBuilder getVAttendedClubBaseInfosOrBuilder(int i);

        public final native List<? extends ClubManagerBaseInfoOrBuilder> getVAttendedClubBaseInfosOrBuilderList();

        public final native ClubManagerBaseInfo getVMyClubBaseInfos(int i);

        public final native int getVMyClubBaseInfosCount();

        public final native List<ClubManagerBaseInfo> getVMyClubBaseInfosList();

        public final native ClubManagerBaseInfoOrBuilder getVMyClubBaseInfosOrBuilder(int i);

        public final native List<? extends ClubManagerBaseInfoOrBuilder> getVMyClubBaseInfosOrBuilderList();

        public final native boolean hasEErrCode();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6856newBuilderForType();

        public final native Builder m6857newBuilderForType();

        protected final native Builder m6858newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6859toBuilder();

        public final native Builder m6860toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetMyClubsV2Rsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.ai;
        }

        static void __clinit__() {
            PARSER = new C02331();
            SCGetMyClubsV2Rsp sCGetMyClubsV2Rsp = new SCGetMyClubsV2Rsp(true);
            defaultInstance = sCGetMyClubsV2Rsp;
            sCGetMyClubsV2Rsp.initFields();
        }

        public static SCGetMyClubsV2Rsp parseFrom(ByteString byteString) {
            return (SCGetMyClubsV2Rsp) PARSER.parseFrom(byteString);
        }

        public static SCGetMyClubsV2Rsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetMyClubsV2Rsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetMyClubsV2Rsp parseFrom(byte[] bArr) {
            return (SCGetMyClubsV2Rsp) PARSER.parseFrom(bArr);
        }

        public static SCGetMyClubsV2Rsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetMyClubsV2Rsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetMyClubsV2Rsp parseFrom(InputStream inputStream) {
            return (SCGetMyClubsV2Rsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetMyClubsV2Rsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetMyClubsV2Rsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetMyClubsV2Rsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetMyClubsV2Rsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetMyClubsV2Rsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetMyClubsV2Rsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetMyClubsV2Rsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetMyClubsV2Rsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetMyClubsV2Rsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetMyClubsV2Rsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetMyClubsV2Rsp sCGetMyClubsV2Rsp) {
            return newBuilder().mergeFrom(sCGetMyClubsV2Rsp);
        }
    }

    public interface SCGetRecommendClubsRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        ClubBaseInfo getVHotClubBaseInfos(int i);

        int getVHotClubBaseInfosCount();

        List<ClubBaseInfo> getVHotClubBaseInfosList();

        ClubBaseInfoOrBuilder getVHotClubBaseInfosOrBuilder(int i);

        List<? extends ClubBaseInfoOrBuilder> getVHotClubBaseInfosOrBuilderList();

        boolean hasEErrCode();
    }

    public static final class SCGetRecommendClubsRsp extends GeneratedMessage implements SCGetRecommendClubsRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCGetRecommendClubsRsp> PARSER = null;
        public static final int VHOTCLUBBASEINFOS_FIELD_NUMBER = 2;
        private static final SCGetRecommendClubsRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private List<ClubBaseInfo> vHotClubBaseInfos_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.SCGetRecommendClubsRsp.1 */
        class C02341 extends AbstractParser<SCGetRecommendClubsRsp> {
            static {
                fixHelper.fixfunc(new int[]{31544, 31545});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02341();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetRecommendClubsRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private RepeatedFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> vHotClubBaseInfosBuilder_;
            private List<ClubBaseInfo> vHotClubBaseInfos_;

            static {
                fixHelper.fixfunc(new int[]{18204, 18205, 18206, 18207, 18208, 18209, 18210, 18211, 18212, 18213, 18214, 18215, 18216, 18217, 18218, 18219, 18220, 18221, 18222, 18223, 18224, 18225, 18226, 18227, 18228, 18229, 18230, 18231, 18232, 18233, 18234, 18235, 18236, 18237, 18238, 18239, 18240, 18241, 18242, 18243, 18244, 18245, 18246, 18247, 18248, 18249, 18250, 18251, 18252, 18253, 18254, 18255, 18256, 18257, 18258, 18259});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVHotClubBaseInfosIsMutable();

            private native RepeatedFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> getVHotClubBaseInfosFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVHotClubBaseInfos(Iterable<? extends ClubBaseInfo> iterable);

            public final native Builder addVHotClubBaseInfos(int i, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder addVHotClubBaseInfos(int i, ClubBaseInfo clubBaseInfo);

            public final native Builder addVHotClubBaseInfos(com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder addVHotClubBaseInfos(ClubBaseInfo clubBaseInfo);

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder addVHotClubBaseInfosBuilder();

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder addVHotClubBaseInfosBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6885build();

            public final native SCGetRecommendClubsRsp m6886build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6887buildPartial();

            public final native SCGetRecommendClubsRsp m6888buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6889clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6890clear();

            public final native Builder m6891clear();

            public final native Builder clearEErrCode();

            public final native Builder clearVHotClubBaseInfos();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6892clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6893clone();

            public final native Builder m6894clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6895getDefaultInstanceForType();

            public final native SCGetRecommendClubsRsp m6896getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native ClubBaseInfo getVHotClubBaseInfos(int i);

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder getVHotClubBaseInfosBuilder(int i);

            public final native List<com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder> getVHotClubBaseInfosBuilderList();

            public final native int getVHotClubBaseInfosCount();

            public final native List<ClubBaseInfo> getVHotClubBaseInfosList();

            public final native ClubBaseInfoOrBuilder getVHotClubBaseInfosOrBuilder(int i);

            public final native List<? extends ClubBaseInfoOrBuilder> getVHotClubBaseInfosOrBuilderList();

            public final native boolean hasEErrCode();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6897mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6898mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6899mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6900mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6901mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetRecommendClubsRsp sCGetRecommendClubsRsp);

            public final native Builder removeVHotClubBaseInfos(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setVHotClubBaseInfos(int i, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder setVHotClubBaseInfos(int i, ClubBaseInfo clubBaseInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.aU;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{17998, 17999, 18000, 18001, 18002, 18003, 18004, 18005, 18006, 18007, 18008, 18009, 18010, 18011, 18012, 18013, 18014, 18015, 18016, 18017, 18018, 18019, 18020, 18021, 18022, 18023, 18024, 18025, 18026, 18027, 18028});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetRecommendClubsRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetRecommendClubsRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetRecommendClubsRsp sCGetRecommendClubsRsp);

        private native SCGetRecommendClubsRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetRecommendClubsRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetRecommendClubsRsp sCGetRecommendClubsRsp);

        private native SCGetRecommendClubsRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6878getDefaultInstanceForType();

        public final native SCGetRecommendClubsRsp m6879getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCGetRecommendClubsRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native ClubBaseInfo getVHotClubBaseInfos(int i);

        public final native int getVHotClubBaseInfosCount();

        public final native List<ClubBaseInfo> getVHotClubBaseInfosList();

        public final native ClubBaseInfoOrBuilder getVHotClubBaseInfosOrBuilder(int i);

        public final native List<? extends ClubBaseInfoOrBuilder> getVHotClubBaseInfosOrBuilderList();

        public final native boolean hasEErrCode();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6880newBuilderForType();

        public final native Builder m6881newBuilderForType();

        protected final native Builder m6882newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6883toBuilder();

        public final native Builder m6884toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetRecommendClubsRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.aU;
        }

        static void __clinit__() {
            PARSER = new C02341();
            SCGetRecommendClubsRsp sCGetRecommendClubsRsp = new SCGetRecommendClubsRsp(true);
            defaultInstance = sCGetRecommendClubsRsp;
            sCGetRecommendClubsRsp.initFields();
        }

        public static SCGetRecommendClubsRsp parseFrom(ByteString byteString) {
            return (SCGetRecommendClubsRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetRecommendClubsRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetRecommendClubsRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetRecommendClubsRsp parseFrom(byte[] bArr) {
            return (SCGetRecommendClubsRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetRecommendClubsRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetRecommendClubsRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetRecommendClubsRsp parseFrom(InputStream inputStream) {
            return (SCGetRecommendClubsRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetRecommendClubsRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetRecommendClubsRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetRecommendClubsRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetRecommendClubsRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetRecommendClubsRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetRecommendClubsRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetRecommendClubsRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetRecommendClubsRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetRecommendClubsRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetRecommendClubsRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetRecommendClubsRsp sCGetRecommendClubsRsp) {
            return newBuilder().mergeFrom(sCGetRecommendClubsRsp);
        }
    }

    public interface SCQuitClubRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        long getLClubID();

        boolean hasEErrCode();

        boolean hasLClubID();
    }

    public static final class SCQuitClubRsp extends GeneratedMessage implements SCQuitClubRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static Parser<SCQuitClubRsp> PARSER;
        private static final SCQuitClubRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lClubID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.SCQuitClubRsp.1 */
        class C02351 extends AbstractParser<SCQuitClubRsp> {
            static {
                fixHelper.fixfunc(new int[]{4612, 4613});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02351();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCQuitClubRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private long lClubID_;

            static {
                fixHelper.fixfunc(new int[]{20660, 20661, 20662, 20663, 20664, 20665, 20666, 20667, 20668, 20669, 20670, 20671, 20672, 20673, 20674, 20675, 20676, 20677, 20678, 20679, 20680, 20681, 20682, 20683, 20684, 20685, 20686, 20687, 20688, 20689, 20690, 20691, 20692, 20693, 20694, 20695, 20696, 20697, 20698, 20699});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6909build();

            public final native SCQuitClubRsp m6910build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6911buildPartial();

            public final native SCQuitClubRsp m6912buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6913clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6914clear();

            public final native Builder m6915clear();

            public final native Builder clearEErrCode();

            public final native Builder clearLClubID();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6916clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6917clone();

            public final native Builder m6918clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6919getDefaultInstanceForType();

            public final native SCQuitClubRsp m6920getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native long getLClubID();

            public final native boolean hasEErrCode();

            public final native boolean hasLClubID();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6921mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6922mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6923mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6924mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6925mergeFrom(Message message);

            public final native Builder mergeFrom(SCQuitClubRsp sCQuitClubRsp);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setLClubID(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.am;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{18295, 18296, 18297, 18298, 18299, 18300, 18301, 18302, 18303, 18304, 18305, 18306, 18307, 18308, 18309, 18310, 18311, 18312, 18313, 18314, 18315, 18316, 18317, 18318, 18319, 18320, 18321, 18322});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCQuitClubRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCQuitClubRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCQuitClubRsp sCQuitClubRsp);

        private native SCQuitClubRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCQuitClubRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCQuitClubRsp sCQuitClubRsp);

        private native SCQuitClubRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6902getDefaultInstanceForType();

        public final native SCQuitClubRsp m6903getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLClubID();

        public final native Parser<SCQuitClubRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasLClubID();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6904newBuilderForType();

        public final native Builder m6905newBuilderForType();

        protected final native Builder m6906newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6907toBuilder();

        public final native Builder m6908toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCQuitClubRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.am;
        }

        static void __clinit__() {
            PARSER = new C02351();
            SCQuitClubRsp sCQuitClubRsp = new SCQuitClubRsp(true);
            defaultInstance = sCQuitClubRsp;
            sCQuitClubRsp.initFields();
        }

        public static SCQuitClubRsp parseFrom(ByteString byteString) {
            return (SCQuitClubRsp) PARSER.parseFrom(byteString);
        }

        public static SCQuitClubRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCQuitClubRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCQuitClubRsp parseFrom(byte[] bArr) {
            return (SCQuitClubRsp) PARSER.parseFrom(bArr);
        }

        public static SCQuitClubRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCQuitClubRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCQuitClubRsp parseFrom(InputStream inputStream) {
            return (SCQuitClubRsp) PARSER.parseFrom(inputStream);
        }

        public static SCQuitClubRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCQuitClubRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCQuitClubRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCQuitClubRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCQuitClubRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCQuitClubRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCQuitClubRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCQuitClubRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCQuitClubRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCQuitClubRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCQuitClubRsp sCQuitClubRsp) {
            return newBuilder().mergeFrom(sCQuitClubRsp);
        }
    }

    public interface SCSearchClubRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        ClubBaseInfo getVClubBaseInfos(int i);

        int getVClubBaseInfosCount();

        List<ClubBaseInfo> getVClubBaseInfosList();

        ClubBaseInfoOrBuilder getVClubBaseInfosOrBuilder(int i);

        List<? extends ClubBaseInfoOrBuilder> getVClubBaseInfosOrBuilderList();

        boolean hasEErrCode();
    }

    public static final class SCSearchClubRsp extends GeneratedMessage implements SCSearchClubRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCSearchClubRsp> PARSER = null;
        public static final int VCLUBBASEINFOS_FIELD_NUMBER = 2;
        private static final SCSearchClubRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private List<ClubBaseInfo> vClubBaseInfos_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.SCSearchClubRsp.1 */
        class C02361 extends AbstractParser<SCSearchClubRsp> {
            static {
                fixHelper.fixfunc(new int[]{33894, 33895});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02361();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCSearchClubRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private RepeatedFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> vClubBaseInfosBuilder_;
            private List<ClubBaseInfo> vClubBaseInfos_;

            static {
                fixHelper.fixfunc(new int[]{20731, 20732, 20733, 20734, 20735, 20736, 20737, 20738, 20739, 20740, 20741, 20742, 20743, 20744, 20745, 20746, 20747, 20748, 20749, 20750, 20751, 20752, 20753, 20754, 20755, 20756, 20757, 20758, 20759, 20760, 20761, 20762, 20763, 20764, 20765, 20766, 20767, 20768, 20769, 20770, 20771, 20772, 20773, 20774, 20775, 20776, 20777, 20778, 20779, 20780, 20781, 20782, 20783, 20784, 20785, 20786});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVClubBaseInfosIsMutable();

            private native RepeatedFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> getVClubBaseInfosFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVClubBaseInfos(Iterable<? extends ClubBaseInfo> iterable);

            public final native Builder addVClubBaseInfos(int i, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder addVClubBaseInfos(int i, ClubBaseInfo clubBaseInfo);

            public final native Builder addVClubBaseInfos(com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder addVClubBaseInfos(ClubBaseInfo clubBaseInfo);

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder addVClubBaseInfosBuilder();

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder addVClubBaseInfosBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6933build();

            public final native SCSearchClubRsp m6934build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6935buildPartial();

            public final native SCSearchClubRsp m6936buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6937clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6938clear();

            public final native Builder m6939clear();

            public final native Builder clearEErrCode();

            public final native Builder clearVClubBaseInfos();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6940clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6941clone();

            public final native Builder m6942clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6943getDefaultInstanceForType();

            public final native SCSearchClubRsp m6944getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native ClubBaseInfo getVClubBaseInfos(int i);

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder getVClubBaseInfosBuilder(int i);

            public final native List<com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder> getVClubBaseInfosBuilderList();

            public final native int getVClubBaseInfosCount();

            public final native List<ClubBaseInfo> getVClubBaseInfosList();

            public final native ClubBaseInfoOrBuilder getVClubBaseInfosOrBuilder(int i);

            public final native List<? extends ClubBaseInfoOrBuilder> getVClubBaseInfosOrBuilderList();

            public final native boolean hasEErrCode();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6945mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6946mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6947mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6948mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6949mergeFrom(Message message);

            public final native Builder mergeFrom(SCSearchClubRsp sCSearchClubRsp);

            public final native Builder removeVClubBaseInfos(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setVClubBaseInfos(int i, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder setVClubBaseInfos(int i, ClubBaseInfo clubBaseInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.f166s;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{28554, 28555, 28556, 28557, 28558, 28559, 28560, 28561, 28562, 28563, 28564, 28565, 28566, 28567, 28568, 28569, 28570, 28571, 28572, 28573, 28574, 28575, 28576, 28577, 28578, 28579, 28580, 28581, 28582, 28583, 28584});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCSearchClubRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCSearchClubRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCSearchClubRsp sCSearchClubRsp);

        private native SCSearchClubRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCSearchClubRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCSearchClubRsp sCSearchClubRsp);

        private native SCSearchClubRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6926getDefaultInstanceForType();

        public final native SCSearchClubRsp m6927getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCSearchClubRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native ClubBaseInfo getVClubBaseInfos(int i);

        public final native int getVClubBaseInfosCount();

        public final native List<ClubBaseInfo> getVClubBaseInfosList();

        public final native ClubBaseInfoOrBuilder getVClubBaseInfosOrBuilder(int i);

        public final native List<? extends ClubBaseInfoOrBuilder> getVClubBaseInfosOrBuilderList();

        public final native boolean hasEErrCode();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6928newBuilderForType();

        public final native Builder m6929newBuilderForType();

        protected final native Builder m6930newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6931toBuilder();

        public final native Builder m6932toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCSearchClubRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.f166s;
        }

        static void __clinit__() {
            PARSER = new C02361();
            SCSearchClubRsp sCSearchClubRsp = new SCSearchClubRsp(true);
            defaultInstance = sCSearchClubRsp;
            sCSearchClubRsp.initFields();
        }

        public static SCSearchClubRsp parseFrom(ByteString byteString) {
            return (SCSearchClubRsp) PARSER.parseFrom(byteString);
        }

        public static SCSearchClubRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSearchClubRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCSearchClubRsp parseFrom(byte[] bArr) {
            return (SCSearchClubRsp) PARSER.parseFrom(bArr);
        }

        public static SCSearchClubRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSearchClubRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCSearchClubRsp parseFrom(InputStream inputStream) {
            return (SCSearchClubRsp) PARSER.parseFrom(inputStream);
        }

        public static SCSearchClubRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSearchClubRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCSearchClubRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCSearchClubRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCSearchClubRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSearchClubRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCSearchClubRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCSearchClubRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCSearchClubRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSearchClubRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCSearchClubRsp sCSearchClubRsp) {
            return newBuilder().mergeFrom(sCSearchClubRsp);
        }
    }

    public interface SCSetClubFundRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        long getLClubUserUuid();

        ClubInfo getStClubInfo();

        ClubInfoOrBuilder getStClubInfoOrBuilder();

        boolean hasEErrCode();

        boolean hasLClubUserUuid();

        boolean hasStClubInfo();
    }

    public static final class SCSetClubFundRsp extends GeneratedMessage implements SCSetClubFundRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int LCLUBUSERUUID_FIELD_NUMBER = 3;
        public static Parser<SCSetClubFundRsp> PARSER = null;
        public static final int STCLUBINFO_FIELD_NUMBER = 2;
        private static final SCSetClubFundRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lClubUserUuid_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private ClubInfo stClubInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.SCSetClubFundRsp.1 */
        class C02371 extends AbstractParser<SCSetClubFundRsp> {
            static {
                fixHelper.fixfunc(new int[]{31886, 31887});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02371();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCSetClubFundRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private long lClubUserUuid_;
            private SingleFieldBuilder<ClubInfo, Builder, ClubInfoOrBuilder> stClubInfoBuilder_;
            private ClubInfo stClubInfo_;

            static {
                fixHelper.fixfunc(new int[]{7674, 7675, 7676, 7677, 7678, 7679, 7680, 7681, 7682, 7683, 7684, 7685, 7686, 7687, 7688, 7689, 7690, 7691, 7692, 7693, 7694, 7695, 7696, 7697, 7698, 7699, 7700, 7701, 7702, 7703, 7704, 7705, 7706, 7707, 7708, 7709, 7710, 7711, 7712, 7713, 7714, 7715, 7716, 7717, 7718, 7719, 7720, 7721, 7722});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<ClubInfo, Builder, ClubInfoOrBuilder> getStClubInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6957build();

            public final native SCSetClubFundRsp m6958build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6959buildPartial();

            public final native SCSetClubFundRsp m6960buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6961clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6962clear();

            public final native Builder m6963clear();

            public final native Builder clearEErrCode();

            public final native Builder clearLClubUserUuid();

            public final native Builder clearStClubInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6964clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6965clone();

            public final native Builder m6966clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6967getDefaultInstanceForType();

            public final native SCSetClubFundRsp m6968getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native long getLClubUserUuid();

            public final native ClubInfo getStClubInfo();

            public final native Builder getStClubInfoBuilder();

            public final native ClubInfoOrBuilder getStClubInfoOrBuilder();

            public final native boolean hasEErrCode();

            public final native boolean hasLClubUserUuid();

            public final native boolean hasStClubInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6969mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6970mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6971mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6972mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6973mergeFrom(Message message);

            public final native Builder mergeFrom(SCSetClubFundRsp sCSetClubFundRsp);

            public final native Builder mergeStClubInfo(ClubInfo clubInfo);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setLClubUserUuid(long j);

            public final native Builder setStClubInfo(Builder builder);

            public final native Builder setStClubInfo(ClubInfo clubInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.aE;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{22411, 22412, 22413, 22414, 22415, 22416, 22417, 22418, 22419, 22420, 22421, 22422, 22423, 22424, 22425, 22426, 22427, 22428, 22429, 22430, 22431, 22432, 22433, 22434, 22435, 22436, 22437, 22438, 22439, 22440, 22441});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCSetClubFundRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCSetClubFundRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCSetClubFundRsp sCSetClubFundRsp);

        private native SCSetClubFundRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCSetClubFundRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCSetClubFundRsp sCSetClubFundRsp);

        private native SCSetClubFundRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6950getDefaultInstanceForType();

        public final native SCSetClubFundRsp m6951getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLClubUserUuid();

        public final native Parser<SCSetClubFundRsp> getParserForType();

        public final native int getSerializedSize();

        public final native ClubInfo getStClubInfo();

        public final native ClubInfoOrBuilder getStClubInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasLClubUserUuid();

        public final native boolean hasStClubInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6952newBuilderForType();

        public final native Builder m6953newBuilderForType();

        protected final native Builder m6954newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6955toBuilder();

        public final native Builder m6956toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCSetClubFundRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.aE;
        }

        static void __clinit__() {
            PARSER = new C02371();
            SCSetClubFundRsp sCSetClubFundRsp = new SCSetClubFundRsp(true);
            defaultInstance = sCSetClubFundRsp;
            sCSetClubFundRsp.initFields();
        }

        public static SCSetClubFundRsp parseFrom(ByteString byteString) {
            return (SCSetClubFundRsp) PARSER.parseFrom(byteString);
        }

        public static SCSetClubFundRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetClubFundRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCSetClubFundRsp parseFrom(byte[] bArr) {
            return (SCSetClubFundRsp) PARSER.parseFrom(bArr);
        }

        public static SCSetClubFundRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetClubFundRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCSetClubFundRsp parseFrom(InputStream inputStream) {
            return (SCSetClubFundRsp) PARSER.parseFrom(inputStream);
        }

        public static SCSetClubFundRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetClubFundRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCSetClubFundRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCSetClubFundRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCSetClubFundRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetClubFundRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCSetClubFundRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCSetClubFundRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCSetClubFundRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetClubFundRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCSetClubFundRsp sCSetClubFundRsp) {
            return newBuilder().mergeFrom(sCSetClubFundRsp);
        }
    }

    public interface SCSetClubInfoRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        ClubBaseInfo getStClubBaseInfos();

        ClubBaseInfoOrBuilder getStClubBaseInfosOrBuilder();

        boolean hasEErrCode();

        boolean hasStClubBaseInfos();
    }

    public static final class SCSetClubInfoRsp extends GeneratedMessage implements SCSetClubInfoRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCSetClubInfoRsp> PARSER = null;
        public static final int STCLUBBASEINFOS_FIELD_NUMBER = 2;
        private static final SCSetClubInfoRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private ClubBaseInfo stClubBaseInfos_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.SCSetClubInfoRsp.1 */
        class C02381 extends AbstractParser<SCSetClubInfoRsp> {
            static {
                fixHelper.fixfunc(new int[]{33218, 33219});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02381();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCSetClubInfoRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private SingleFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> stClubBaseInfosBuilder_;
            private ClubBaseInfo stClubBaseInfos_;

            static {
                fixHelper.fixfunc(new int[]{11099, 11100, 11101, 11102, 11103, 11104, 11105, 11106, 11107, 11108, 11109, 11110, 11111, 11112, 11113, 11114, 11115, 11116, 11117, 11118, 11119, 11120, 11121, 11122, 11123, 11124, 11125, 11126, 11127, 11128, 11129, 11130, 11131, 11132, 11133, 11134, 11135, 11136, 11137, 11138, 11139, 11140, 11141, 11142, 11143});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> getStClubBaseInfosFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m6981build();

            public final native SCSetClubInfoRsp m6982build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m6983buildPartial();

            public final native SCSetClubInfoRsp m6984buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6985clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6986clear();

            public final native Builder m6987clear();

            public final native Builder clearEErrCode();

            public final native Builder clearStClubBaseInfos();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6988clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6989clone();

            public final native Builder m6990clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m6991getDefaultInstanceForType();

            public final native SCSetClubInfoRsp m6992getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native ClubBaseInfo getStClubBaseInfos();

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder getStClubBaseInfosBuilder();

            public final native ClubBaseInfoOrBuilder getStClubBaseInfosOrBuilder();

            public final native boolean hasEErrCode();

            public final native boolean hasStClubBaseInfos();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6993mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m6994mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6995mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6996mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m6997mergeFrom(Message message);

            public final native Builder mergeFrom(SCSetClubInfoRsp sCSetClubInfoRsp);

            public final native Builder mergeStClubBaseInfos(ClubBaseInfo clubBaseInfo);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setStClubBaseInfos(com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder setStClubBaseInfos(ClubBaseInfo clubBaseInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.f126E;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{10677, 10678, 10679, 10680, 10681, 10682, 10683, 10684, 10685, 10686, 10687, 10688, 10689, 10690, 10691, 10692, 10693, 10694, 10695, 10696, 10697, 10698, 10699, 10700, 10701, 10702, 10703, 10704, 10705});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCSetClubInfoRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCSetClubInfoRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCSetClubInfoRsp sCSetClubInfoRsp);

        private native SCSetClubInfoRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCSetClubInfoRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCSetClubInfoRsp sCSetClubInfoRsp);

        private native SCSetClubInfoRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6974getDefaultInstanceForType();

        public final native SCSetClubInfoRsp m6975getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCSetClubInfoRsp> getParserForType();

        public final native int getSerializedSize();

        public final native ClubBaseInfo getStClubBaseInfos();

        public final native ClubBaseInfoOrBuilder getStClubBaseInfosOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasStClubBaseInfos();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6976newBuilderForType();

        public final native Builder m6977newBuilderForType();

        protected final native Builder m6978newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m6979toBuilder();

        public final native Builder m6980toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCSetClubInfoRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.f126E;
        }

        static void __clinit__() {
            PARSER = new C02381();
            SCSetClubInfoRsp sCSetClubInfoRsp = new SCSetClubInfoRsp(true);
            defaultInstance = sCSetClubInfoRsp;
            sCSetClubInfoRsp.initFields();
        }

        public static SCSetClubInfoRsp parseFrom(ByteString byteString) {
            return (SCSetClubInfoRsp) PARSER.parseFrom(byteString);
        }

        public static SCSetClubInfoRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetClubInfoRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCSetClubInfoRsp parseFrom(byte[] bArr) {
            return (SCSetClubInfoRsp) PARSER.parseFrom(bArr);
        }

        public static SCSetClubInfoRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetClubInfoRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCSetClubInfoRsp parseFrom(InputStream inputStream) {
            return (SCSetClubInfoRsp) PARSER.parseFrom(inputStream);
        }

        public static SCSetClubInfoRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetClubInfoRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCSetClubInfoRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCSetClubInfoRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCSetClubInfoRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetClubInfoRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCSetClubInfoRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCSetClubInfoRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCSetClubInfoRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetClubInfoRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCSetClubInfoRsp sCSetClubInfoRsp) {
            return newBuilder().mergeFrom(sCSetClubInfoRsp);
        }
    }

    public interface SCSetClubSettingRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        ClubBaseInfo getStClubBaseInfos();

        ClubBaseInfoOrBuilder getStClubBaseInfosOrBuilder();

        boolean hasEErrCode();

        boolean hasStClubBaseInfos();
    }

    public static final class SCSetClubSettingRsp extends GeneratedMessage implements SCSetClubSettingRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCSetClubSettingRsp> PARSER = null;
        public static final int STCLUBBASEINFOS_FIELD_NUMBER = 2;
        private static final SCSetClubSettingRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private ClubBaseInfo stClubBaseInfos_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.SCSetClubSettingRsp.1 */
        class C02391 extends AbstractParser<SCSetClubSettingRsp> {
            static {
                fixHelper.fixfunc(new int[]{10370, 10371});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02391();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCSetClubSettingRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private SingleFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> stClubBaseInfosBuilder_;
            private ClubBaseInfo stClubBaseInfos_;

            static {
                fixHelper.fixfunc(new int[]{6553, 6554, 6555, 6556, 6557, 6558, 6559, 6560, 6561, 6562, 6563, 6564, 6565, 6566, 6567, 6568, 6569, 6570, 6571, 6572, 6573, 6574, 6575, 6576, 6577, 6578, 6579, 6580, 6581, 6582, 6583, 6584, 6585, 6586, 6587, 6588, 6589, 6590, 6591, 6592, 6593, 6594, 6595, 6596, 6597});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> getStClubBaseInfosFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7005build();

            public final native SCSetClubSettingRsp m7006build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7007buildPartial();

            public final native SCSetClubSettingRsp m7008buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7009clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7010clear();

            public final native Builder m7011clear();

            public final native Builder clearEErrCode();

            public final native Builder clearStClubBaseInfos();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7012clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7013clone();

            public final native Builder m7014clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7015getDefaultInstanceForType();

            public final native SCSetClubSettingRsp m7016getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native ClubBaseInfo getStClubBaseInfos();

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder getStClubBaseInfosBuilder();

            public final native ClubBaseInfoOrBuilder getStClubBaseInfosOrBuilder();

            public final native boolean hasEErrCode();

            public final native boolean hasStClubBaseInfos();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7017mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7018mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7019mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7020mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7021mergeFrom(Message message);

            public final native Builder mergeFrom(SCSetClubSettingRsp sCSetClubSettingRsp);

            public final native Builder mergeStClubBaseInfos(ClubBaseInfo clubBaseInfo);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setStClubBaseInfos(com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder setStClubBaseInfos(ClubBaseInfo clubBaseInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.f130I;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{23530, 23531, 23532, 23533, 23534, 23535, 23536, 23537, 23538, 23539, 23540, 23541, 23542, 23543, 23544, 23545, 23546, 23547, 23548, 23549, 23550, 23551, 23552, 23553, 23554, 23555, 23556, 23557, 23558});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCSetClubSettingRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCSetClubSettingRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCSetClubSettingRsp sCSetClubSettingRsp);

        private native SCSetClubSettingRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCSetClubSettingRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCSetClubSettingRsp sCSetClubSettingRsp);

        private native SCSetClubSettingRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m6998getDefaultInstanceForType();

        public final native SCSetClubSettingRsp m6999getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCSetClubSettingRsp> getParserForType();

        public final native int getSerializedSize();

        public final native ClubBaseInfo getStClubBaseInfos();

        public final native ClubBaseInfoOrBuilder getStClubBaseInfosOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasStClubBaseInfos();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7000newBuilderForType();

        public final native Builder m7001newBuilderForType();

        protected final native Builder m7002newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7003toBuilder();

        public final native Builder m7004toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCSetClubSettingRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.f130I;
        }

        static void __clinit__() {
            PARSER = new C02391();
            SCSetClubSettingRsp sCSetClubSettingRsp = new SCSetClubSettingRsp(true);
            defaultInstance = sCSetClubSettingRsp;
            sCSetClubSettingRsp.initFields();
        }

        public static SCSetClubSettingRsp parseFrom(ByteString byteString) {
            return (SCSetClubSettingRsp) PARSER.parseFrom(byteString);
        }

        public static SCSetClubSettingRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetClubSettingRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCSetClubSettingRsp parseFrom(byte[] bArr) {
            return (SCSetClubSettingRsp) PARSER.parseFrom(bArr);
        }

        public static SCSetClubSettingRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetClubSettingRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCSetClubSettingRsp parseFrom(InputStream inputStream) {
            return (SCSetClubSettingRsp) PARSER.parseFrom(inputStream);
        }

        public static SCSetClubSettingRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetClubSettingRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCSetClubSettingRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCSetClubSettingRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCSetClubSettingRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetClubSettingRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCSetClubSettingRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCSetClubSettingRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCSetClubSettingRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetClubSettingRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCSetClubSettingRsp sCSetClubSettingRsp) {
            return newBuilder().mergeFrom(sCSetClubSettingRsp);
        }
    }

    public interface SCSetClubUserLevelRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        ClubInfo getStClubInfos();

        ClubInfoOrBuilder getStClubInfosOrBuilder();

        boolean hasEErrCode();

        boolean hasStClubInfos();
    }

    public static final class SCSetClubUserLevelRsp extends GeneratedMessage implements SCSetClubUserLevelRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCSetClubUserLevelRsp> PARSER = null;
        public static final int STCLUBINFOS_FIELD_NUMBER = 2;
        private static final SCSetClubUserLevelRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private ClubInfo stClubInfos_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.SCSetClubUserLevelRsp.1 */
        class C02401 extends AbstractParser<SCSetClubUserLevelRsp> {
            static {
                fixHelper.fixfunc(new int[]{8317, 8318});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02401();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCSetClubUserLevelRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private SingleFieldBuilder<ClubInfo, Builder, ClubInfoOrBuilder> stClubInfosBuilder_;
            private ClubInfo stClubInfos_;

            static {
                fixHelper.fixfunc(new int[]{4358, 4359, 4360, 4361, 4362, 4363, 4364, 4365, 4366, 4367, 4368, 4369, 4370, 4371, 4372, 4373, 4374, 4375, 4376, 4377, 4378, 4379, 4380, 4381, 4382, 4383, 4384, 4385, 4386, 4387, 4388, 4389, 4390, 4391, 4392, 4393, 4394, 4395, 4396, 4397, 4398, 4399, 4400, 4401, 4402});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<ClubInfo, Builder, ClubInfoOrBuilder> getStClubInfosFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7029build();

            public final native SCSetClubUserLevelRsp m7030build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7031buildPartial();

            public final native SCSetClubUserLevelRsp m7032buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7033clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7034clear();

            public final native Builder m7035clear();

            public final native Builder clearEErrCode();

            public final native Builder clearStClubInfos();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7036clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7037clone();

            public final native Builder m7038clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7039getDefaultInstanceForType();

            public final native SCSetClubUserLevelRsp m7040getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native ClubInfo getStClubInfos();

            public final native Builder getStClubInfosBuilder();

            public final native ClubInfoOrBuilder getStClubInfosOrBuilder();

            public final native boolean hasEErrCode();

            public final native boolean hasStClubInfos();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7041mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7042mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7043mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7044mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7045mergeFrom(Message message);

            public final native Builder mergeFrom(SCSetClubUserLevelRsp sCSetClubUserLevelRsp);

            public final native Builder mergeStClubInfos(ClubInfo clubInfo);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setStClubInfos(Builder builder);

            public final native Builder setStClubInfos(ClubInfo clubInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.f134M;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{28854, 28855, 28856, 28857, 28858, 28859, 28860, 28861, 28862, 28863, 28864, 28865, 28866, 28867, 28868, 28869, 28870, 28871, 28872, 28873, 28874, 28875, 28876, 28877, 28878, 28879, 28880, 28881, 28882});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCSetClubUserLevelRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCSetClubUserLevelRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCSetClubUserLevelRsp sCSetClubUserLevelRsp);

        private native SCSetClubUserLevelRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCSetClubUserLevelRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCSetClubUserLevelRsp sCSetClubUserLevelRsp);

        private native SCSetClubUserLevelRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7022getDefaultInstanceForType();

        public final native SCSetClubUserLevelRsp m7023getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCSetClubUserLevelRsp> getParserForType();

        public final native int getSerializedSize();

        public final native ClubInfo getStClubInfos();

        public final native ClubInfoOrBuilder getStClubInfosOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasStClubInfos();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7024newBuilderForType();

        public final native Builder m7025newBuilderForType();

        protected final native Builder m7026newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7027toBuilder();

        public final native Builder m7028toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCSetClubUserLevelRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.f134M;
        }

        static void __clinit__() {
            PARSER = new C02401();
            SCSetClubUserLevelRsp sCSetClubUserLevelRsp = new SCSetClubUserLevelRsp(true);
            defaultInstance = sCSetClubUserLevelRsp;
            sCSetClubUserLevelRsp.initFields();
        }

        public static SCSetClubUserLevelRsp parseFrom(ByteString byteString) {
            return (SCSetClubUserLevelRsp) PARSER.parseFrom(byteString);
        }

        public static SCSetClubUserLevelRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetClubUserLevelRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCSetClubUserLevelRsp parseFrom(byte[] bArr) {
            return (SCSetClubUserLevelRsp) PARSER.parseFrom(bArr);
        }

        public static SCSetClubUserLevelRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetClubUserLevelRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCSetClubUserLevelRsp parseFrom(InputStream inputStream) {
            return (SCSetClubUserLevelRsp) PARSER.parseFrom(inputStream);
        }

        public static SCSetClubUserLevelRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetClubUserLevelRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCSetClubUserLevelRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCSetClubUserLevelRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCSetClubUserLevelRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetClubUserLevelRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCSetClubUserLevelRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCSetClubUserLevelRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCSetClubUserLevelRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetClubUserLevelRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCSetClubUserLevelRsp sCSetClubUserLevelRsp) {
            return newBuilder().mergeFrom(sCSetClubUserLevelRsp);
        }
    }

    public interface SCUploadClubCoverRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        long getLClubID();

        String getSBigAlbums(int i);

        ByteString getSBigAlbumsBytes(int i);

        int getSBigAlbumsCount();

        ProtocolStringList getSBigAlbumsList();

        String getSSmallAlbums(int i);

        ByteString getSSmallAlbumsBytes(int i);

        int getSSmallAlbumsCount();

        ProtocolStringList getSSmallAlbumsList();

        boolean hasEErrCode();

        boolean hasLClubID();
    }

    public static final class SCUploadClubCoverRsp extends GeneratedMessage implements SCUploadClubCoverRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static Parser<SCUploadClubCoverRsp> PARSER = null;
        public static final int SBIGALBUMS_FIELD_NUMBER = 4;
        public static final int SSMALLALBUMS_FIELD_NUMBER = 3;
        private static final SCUploadClubCoverRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lClubID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private LazyStringList sBigAlbums_;
        private LazyStringList sSmallAlbums_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.SCUploadClubCoverRsp.1 */
        class C02411 extends AbstractParser<SCUploadClubCoverRsp> {
            static {
                fixHelper.fixfunc(new int[]{6130, 6131});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02411();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCUploadClubCoverRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private long lClubID_;
            private LazyStringList sBigAlbums_;
            private LazyStringList sSmallAlbums_;

            static {
                fixHelper.fixfunc(new int[]{22195, 22196, 22197, 22198, 22199, 22200, 22201, 22202, 22203, 22204, 22205, 22206, 22207, 22208, 22209, 22210, 22211, 22212, 22213, 22214, 22215, 22216, 22217, 22218, 22219, 22220, 22221, 22222, 22223, 22224, 22225, 22226, 22227, 22228, 22229, 22230, 22231, 22232, 22233, 22234, 22235, 22236, 22237, 22238, 22239, 22240, 22241, 22242, 22243, 22244, 22245, 22246, 22247, 22248, 22249, 22250, 22251, 22252, 22253, 22254});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureSBigAlbumsIsMutable();

            private native void ensureSSmallAlbumsIsMutable();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllSBigAlbums(Iterable<String> iterable);

            public final native Builder addAllSSmallAlbums(Iterable<String> iterable);

            public final native Builder addSBigAlbums(String str);

            public final native Builder addSBigAlbumsBytes(ByteString byteString);

            public final native Builder addSSmallAlbums(String str);

            public final native Builder addSSmallAlbumsBytes(ByteString byteString);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7053build();

            public final native SCUploadClubCoverRsp m7054build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7055buildPartial();

            public final native SCUploadClubCoverRsp m7056buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7057clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7058clear();

            public final native Builder m7059clear();

            public final native Builder clearEErrCode();

            public final native Builder clearLClubID();

            public final native Builder clearSBigAlbums();

            public final native Builder clearSSmallAlbums();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7060clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7061clone();

            public final native Builder m7062clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7063getDefaultInstanceForType();

            public final native SCUploadClubCoverRsp m7064getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native long getLClubID();

            public final native String getSBigAlbums(int i);

            public final native ByteString getSBigAlbumsBytes(int i);

            public final native int getSBigAlbumsCount();

            public final native ProtocolStringList getSBigAlbumsList();

            public final native String getSSmallAlbums(int i);

            public final native ByteString getSSmallAlbumsBytes(int i);

            public final native int getSSmallAlbumsCount();

            public final native ProtocolStringList getSSmallAlbumsList();

            public final native boolean hasEErrCode();

            public final native boolean hasLClubID();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7065mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7066mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7067mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7068mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7069mergeFrom(Message message);

            public final native Builder mergeFrom(SCUploadClubCoverRsp sCUploadClubCoverRsp);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setLClubID(long j);

            public final native Builder setSBigAlbums(int i, String str);

            public final native Builder setSSmallAlbums(int i, String str);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.f142U;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{8319, 8320, 8321, 8322, 8323, 8324, 8325, 8326, 8327, 8328, 8329, 8330, 8331, 8332, 8333, 8334, 8335, 8336, 8337, 8338, 8339, 8340, 8341, 8342, 8343, 8344, 8345, 8346, 8347, 8348, 8349, 8350, 8351, 8352, 8353, 8354});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCUploadClubCoverRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCUploadClubCoverRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCUploadClubCoverRsp sCUploadClubCoverRsp);

        private native SCUploadClubCoverRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCUploadClubCoverRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCUploadClubCoverRsp sCUploadClubCoverRsp);

        private native SCUploadClubCoverRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7046getDefaultInstanceForType();

        public final native SCUploadClubCoverRsp m7047getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLClubID();

        public final native Parser<SCUploadClubCoverRsp> getParserForType();

        public final native String getSBigAlbums(int i);

        public final native ByteString getSBigAlbumsBytes(int i);

        public final native int getSBigAlbumsCount();

        public final native ProtocolStringList getSBigAlbumsList();

        public final native String getSSmallAlbums(int i);

        public final native ByteString getSSmallAlbumsBytes(int i);

        public final native int getSSmallAlbumsCount();

        public final native ProtocolStringList getSSmallAlbumsList();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasLClubID();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7048newBuilderForType();

        public final native Builder m7049newBuilderForType();

        protected final native Builder m7050newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7051toBuilder();

        public final native Builder m7052toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCUploadClubCoverRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.f142U;
        }

        static void __clinit__() {
            PARSER = new C02411();
            SCUploadClubCoverRsp sCUploadClubCoverRsp = new SCUploadClubCoverRsp(true);
            defaultInstance = sCUploadClubCoverRsp;
            sCUploadClubCoverRsp.initFields();
        }

        public static SCUploadClubCoverRsp parseFrom(ByteString byteString) {
            return (SCUploadClubCoverRsp) PARSER.parseFrom(byteString);
        }

        public static SCUploadClubCoverRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUploadClubCoverRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCUploadClubCoverRsp parseFrom(byte[] bArr) {
            return (SCUploadClubCoverRsp) PARSER.parseFrom(bArr);
        }

        public static SCUploadClubCoverRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUploadClubCoverRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCUploadClubCoverRsp parseFrom(InputStream inputStream) {
            return (SCUploadClubCoverRsp) PARSER.parseFrom(inputStream);
        }

        public static SCUploadClubCoverRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUploadClubCoverRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCUploadClubCoverRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCUploadClubCoverRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCUploadClubCoverRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUploadClubCoverRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCUploadClubCoverRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCUploadClubCoverRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCUploadClubCoverRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUploadClubCoverRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCUploadClubCoverRsp sCUploadClubCoverRsp) {
            return newBuilder().mergeFrom(sCUploadClubCoverRsp);
        }
    }

    public interface SCUploadClubIConRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        long getLClubID();

        String getSBigClubIcon();

        ByteString getSBigClubIconBytes();

        String getSSmallClubIcon();

        ByteString getSSmallClubIconBytes();

        boolean hasEErrCode();

        boolean hasLClubID();

        boolean hasSBigClubIcon();

        boolean hasSSmallClubIcon();
    }

    public static final class SCUploadClubIConRsp extends GeneratedMessage implements SCUploadClubIConRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static Parser<SCUploadClubIConRsp> PARSER = null;
        public static final int SBIGCLUBICON_FIELD_NUMBER = 4;
        public static final int SSMALLCLUBICON_FIELD_NUMBER = 3;
        private static final SCUploadClubIConRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lClubID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sBigClubIcon_;
        private Object sSmallClubIcon_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpClub.SCUploadClubIConRsp.1 */
        class C02421 extends AbstractParser<SCUploadClubIConRsp> {
            static {
                fixHelper.fixfunc(new int[]{24034, 24035});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02421();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCUploadClubIConRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private long lClubID_;
            private Object sBigClubIcon_;
            private Object sSmallClubIcon_;

            static {
                fixHelper.fixfunc(new int[]{13790, 13791, 13792, 13793, 13794, 13795, 13796, 13797, 13798, 13799, 13800, 13801, 13802, 13803, 13804, 13805, 13806, 13807, 13808, 13809, 13810, 13811, 13812, 13813, 13814, 13815, 13816, 13817, 13818, 13819, 13820, 13821, 13822, 13823, 13824, 13825, 13826, 13827, 13828, 13829, 13830, 13831, 13832, 13833, 13834, 13835, 13836, 13837, 13838, 13839, 13840, 13841});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7077build();

            public final native SCUploadClubIConRsp m7078build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7079buildPartial();

            public final native SCUploadClubIConRsp m7080buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7081clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7082clear();

            public final native Builder m7083clear();

            public final native Builder clearEErrCode();

            public final native Builder clearLClubID();

            public final native Builder clearSBigClubIcon();

            public final native Builder clearSSmallClubIcon();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7084clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7085clone();

            public final native Builder m7086clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7087getDefaultInstanceForType();

            public final native SCUploadClubIConRsp m7088getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native long getLClubID();

            public final native String getSBigClubIcon();

            public final native ByteString getSBigClubIconBytes();

            public final native String getSSmallClubIcon();

            public final native ByteString getSSmallClubIconBytes();

            public final native boolean hasEErrCode();

            public final native boolean hasLClubID();

            public final native boolean hasSBigClubIcon();

            public final native boolean hasSSmallClubIcon();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7089mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7090mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7091mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7092mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7093mergeFrom(Message message);

            public final native Builder mergeFrom(SCUploadClubIConRsp sCUploadClubIConRsp);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setLClubID(long j);

            public final native Builder setSBigClubIcon(String str);

            public final native Builder setSBigClubIconBytes(ByteString byteString);

            public final native Builder setSSmallClubIcon(String str);

            public final native Builder setSSmallClubIconBytes(ByteString byteString);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpClub.f138Q;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{7368, 7369, 7370, 7371, 7372, 7373, 7374, 7375, 7376, 7377, 7378, 7379, 7380, 7381, 7382, 7383, 7384, 7385, 7386, 7387, 7388, 7389, 7390, 7391, 7392, 7393, 7394, 7395, 7396, 7397, 7398, 7399, 7400, 7401});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCUploadClubIConRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCUploadClubIConRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCUploadClubIConRsp sCUploadClubIConRsp);

        private native SCUploadClubIConRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCUploadClubIConRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCUploadClubIConRsp sCUploadClubIConRsp);

        private native SCUploadClubIConRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7070getDefaultInstanceForType();

        public final native SCUploadClubIConRsp m7071getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLClubID();

        public final native Parser<SCUploadClubIConRsp> getParserForType();

        public final native String getSBigClubIcon();

        public final native ByteString getSBigClubIconBytes();

        public final native String getSSmallClubIcon();

        public final native ByteString getSSmallClubIconBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasLClubID();

        public final native boolean hasSBigClubIcon();

        public final native boolean hasSSmallClubIcon();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7072newBuilderForType();

        public final native Builder m7073newBuilderForType();

        protected final native Builder m7074newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7075toBuilder();

        public final native Builder m7076toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCUploadClubIConRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpClub.f138Q;
        }

        static void __clinit__() {
            PARSER = new C02421();
            SCUploadClubIConRsp sCUploadClubIConRsp = new SCUploadClubIConRsp(true);
            defaultInstance = sCUploadClubIConRsp;
            sCUploadClubIConRsp.initFields();
        }

        public static SCUploadClubIConRsp parseFrom(ByteString byteString) {
            return (SCUploadClubIConRsp) PARSER.parseFrom(byteString);
        }

        public static SCUploadClubIConRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUploadClubIConRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCUploadClubIConRsp parseFrom(byte[] bArr) {
            return (SCUploadClubIConRsp) PARSER.parseFrom(bArr);
        }

        public static SCUploadClubIConRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUploadClubIConRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCUploadClubIConRsp parseFrom(InputStream inputStream) {
            return (SCUploadClubIConRsp) PARSER.parseFrom(inputStream);
        }

        public static SCUploadClubIConRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUploadClubIConRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCUploadClubIConRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCUploadClubIConRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCUploadClubIConRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUploadClubIConRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCUploadClubIConRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCUploadClubIConRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCUploadClubIConRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUploadClubIConRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCUploadClubIConRsp sCUploadClubIConRsp) {
            return newBuilder().mergeFrom(sCUploadClubIConRsp);
        }
    }

    public static FileDescriptor m152a() {
        return bm;
    }

    static {
        FileDescriptor[] fileDescriptorArr = new FileDescriptor[]{TexasPokerCommon.m11a(), TexasPoker.a(), TexasPokerHttpBill.m99a()};
        FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0018TexasPokerHttpClub.proto\u0012\ntexaspoker\u001a\u0016TexasPokerCommon.proto\u001a\u0010TexasPoker.proto\u001a\u0018TexasPokerHttpBill.proto\"x\n\fClubUserInfo\u00123\n\u000estUserBaseInfo\u0018\u0001 \u0002(\u000b2\u001b.texaspoker.UserBaseInfoNet\u00123\n\u000eeClubUserLevel\u0018\u0002 \u0002(\u000e2\u001b.texaspoker.CLUB_USER_LEVEL\"\u00e8\u0001\n\bClubInfo\u00120\n\u000estClubBaseInfo\u0018\u0001 \u0002(\u000b2\u0018.texaspoker.ClubBaseInfo\u00120\n\u000evClubUserInfos\u0018\u0002 \u0003(\u000b2\u0018.texaspoker.ClubUserInfo\u00128\n\u0012vGameRoomBaseInfos\u0018\u0003 \u0003(\u000b2\u001c.texaspoker.GameRoomBaseInfo\u0012", ">\n\u0015vSNGGameRoomBaseInfos\u0018\u0004 \u0003(\u000b2\u001f.texaspoker.SNGGameRoomBaseInfo\"F\n\fCSCreateClub\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0011\n\tsClubName\u0018\u0002 \u0002(\t\u0012\u0015\n\rsClubLocation\u0018\u0003 \u0002(\t\"j\n\u000fSCCreateClubRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012(\n\nstClubInfo\u0018\u0002 \u0001(\u000b2\u0014.texaspoker.ClubInfo\";\n\u000bCSEnterClub\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0002(\u0003\u0012\r\n\u0005sHint\u0018\u0003 \u0002(\t\"\u009e\u0001\n\u000eSCEnterClubRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012(\n\nstClubInfo\u0018\u0002 \u0001(\u000b2\u0014.texaspo", "ker.ClubInfo\u00123\n\u000eeClubUserLevel\u0018\u0003 \u0001(\u000e2\u001b.texaspoker.CLUB_USER_LEVEL\"y\n\fCSClubAction\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0002(\u0003\u0012\u0013\n\u000blActionedID\u0018\u0003 \u0002(\u0003\u0012&\n\beClubAct\u0018\u0004 \u0002(\u000e2\u0014.texaspoker.CLUB_ACT\u0012\r\n\u0005sHint\u0018\u0005 \u0001(\t\"\u00a7\u0001\n\u000fSCClubActionRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012(\n\nstClubInfo\u0018\u0002 \u0001(\u000b2\u0014.texaspoker.ClubInfo\u0012&\n\beClubAct\u0018\u0003 \u0001(\u000e2\u0014.texaspoker.CLUB_ACT\u0012\u0013\n\u000blActionedID\u0018\u0004 \u0001(\u0003\"\u0084\u0001\n\fCSSearchClub\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0010\n\bsKeyWor", "d\u0018\u0002 \u0002(\t\u0012\u000f\n\u0007iOffset\u0018\u0003 \u0002(\u0005\u0012\f\n\u0004iNum\u0018\u0004 \u0002(\u0005\u00125\n\u000feClubSearchType\u0018\u0005 \u0001(\u000e2\u001c.texaspoker.CLUB_SEARCH_TYPE\"r\n\u000fSCSearchClubRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u00120\n\u000evClubBaseInfos\u0018\u0002 \u0003(\u000b2\u0018.texaspoker.ClubBaseInfo\"Z\n\u0014CSGetClubsByLocation\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0015\n\rsClubLocation\u0018\u0002 \u0002(\t\u0012\u000f\n\u0007iOffset\u0018\u0003 \u0002(\u0005\u0012\f\n\u0004iNum\u0018\u0004 \u0002(\u0005\"z\n\u0017SCGetClubsByLocationRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u00120\n\u000evClubBaseInfos\u0018\u0002 \u0003(\u000b2", "\u0018.texaspoker.ClubBaseInfo\"\u001d\n\rCSGetHotClubs\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\"s\n\u0010SCGetHotClubsRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u00120\n\u000evClubBaseInfos\u0018\u0002 \u0003(\u000b2\u0018.texaspoker.ClubBaseInfo\"P\n\rCSSetClubInfo\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0002(\u0003\u0012\u0011\n\tsClubName\u0018\u0003 \u0001(\t\u0012\r\n\u0005sDesc\u0018\u0004 \u0001(\t\"t\n\u0010SCSetClubInfoRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u00121\n\u000fstClubBaseInfos\u0018\u0002 \u0001(\u000b2\u0018.texaspoker.ClubBaseInfo\"\u0089\u0001\n\u0010CSSetClubSetting\u0012\f\n\u0004uu", "id\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0002(\u0003\u0012\u0014\n\fbClubMsgMute\u0018\u0003 \u0001(\u0005\u0012\u0017\n\u000fbClubMsgVibrate\u0018\u0004 \u0001(\u0005\u0012\u000f\n\u0007bVerify\u0018\u0005 \u0001(\u0005\u0012\u0016\n\u000eiManagerCreate\u0018\u0014 \u0001(\u0005\"w\n\u0013SCSetClubSettingRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u00121\n\u000fstClubBaseInfos\u0018\u0002 \u0001(\u000b2\u0018.texaspoker.ClubBaseInfo\"\u007f\n\u0012CSSetClubUserLevel\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0002(\u0003\u0012\u0015\n\rlClubUserUuid\u0018\u0003 \u0002(\u0003\u00123\n\u000eeClubUserLevel\u0018\u0004 \u0002(\u000e2\u001b.texaspoker.CLUB_USER_LEVEL\"q\n\u0015SCSetClubUserLevelRsp\u0012-\n\beErrCode", "\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012)\n\u000bstClubInfos\u0018\u0002 \u0001(\u000b2\u0014.texaspoker.ClubInfo\"E\n\u0010CSUploadClubICon\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0002(\u0003\u0012\u0012\n\nvIconDatas\u0018\u0003 \u0001(\f\"\u0083\u0001\n\u0013SCUploadClubIConRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0001(\u0003\u0012\u0016\n\u000esSmallClubIcon\u0018\u0003 \u0001(\t\u0012\u0014\n\fsBigClubIcon\u0018\u0004 \u0001(\t\"T\n\u0011CSUploadClubCover\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0002(\u0003\u0012\u0012\n\nvIconDatas\u0018\u0003 \u0001(\f\u0012\f\n\u0004iPos\u0018\u0004 \u0001(\u0005\"\u0080\u0001\n\u0014SCUploadClubCoverRsp\u0012-\n\beE", "rrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0001(\u0003\u0012\u0014\n\fsSmallAlbums\u0018\u0003 \u0003(\t\u0012\u0012\n\nsBigAlbums\u0018\u0004 \u0003(\t\"@\n\u0011CSDeleteClubCover\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0002(\u0003\u0012\f\n\u0004iPos\u0018\u0003 \u0001(\u0005\"\u0080\u0001\n\u0014SCDeleteClubCoverRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0001(\u0003\u0012\u0014\n\fsSmallAlbums\u0018\u0003 \u0003(\t\u0012\u0012\n\nsBigAlbums\u0018\u0004 \u0003(\t\"\u001c\n\fCSGetMyClubs\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\"\u00ae\u0001\n\u000fSCGetMyClubsRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u00122\n\u0010vM", "yClubBaseInfos\u0018\u0002 \u0003(\u000b2\u0018.texaspoker.ClubBaseInfo\u00128\n\u0016vAttendedClubBaseInfos\u0018\u0003 \u0003(\u000b2\u0018.texaspoker.ClubBaseInfo\"Y\n\u0013ClubManagerBaseInfo\u00120\n\u000estClubBaseInfo\u0018\u0001 \u0002(\u000b2\u0018.texaspoker.ClubBaseInfo\u0012\u0010\n\bbManager\u0018\u0002 \u0002(\u0005\"\u001e\n\u000eCSGetMyClubsV2\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\"\u00be\u0001\n\u0011SCGetMyClubsV2Rsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u00129\n\u0010vMyClubBaseInfos\u0018\u0002 \u0003(\u000b2\u001f.texaspoker.ClubManagerBaseInfo\u0012?\n\u0016vAttendedClubBaseInfos\u0018\u0003 \u0003(\u000b2\u001f.texaspoker", ".ClubManagerBaseInfo\"+\n\nCSQuitClub\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0002(\u0003\"O\n\rSCQuitClubRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0001(\u0003\"\u00af\u0002\n\fFundBillInfo\u0012\u0013\n\u000blCreateTime\u0018\u0001 \u0002(\u0003\u00121\n\reFundBillType\u0018\u0002 \u0002(\u000e2\u001a.texaspoker.FUND_BILL_TYPE\u0012\r\n\u0005lFund\u0018\u0003 \u0002(\u0003\u00126\n\u000feFundBillToType\u0018\u0004 \u0002(\u000e2\u001d.texaspoker.FUND_BILL_TO_TYPE\u00126\n\u0011stUserBaseInfoNet\u0018\u0005 \u0003(\u000b2\u001b.texaspoker.UserBaseInfoNet\u0012(\n\nstClubInfo\u0018\u0006 \u0001(\u000b2\u0014.texaspoker.Club", "Info\u0012.\n\rstBillInfoNet\u0018\u0007 \u0001(\u000b2\u0017.texaspoker.BillInfoNet\"3\n\u0012CSGetFundBillInfos\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0002(\u0003\"\u0089\u0001\n\u0015SCGetFundBillInfosRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0001(\u0003\u00120\n\u000evFundBillInfos\u0018\u0003 \u0003(\u000b2\u0018.texaspoker.FundBillInfo\":\n\u0019CSGetClubBaseInfoByClubID\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0002(\u0003\"\u0080\u0001\n\u001cSCGetClubBaseInfoByClubIDRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u00121\n\u000fstClubBaseI", "nfos\u0018\u0002 \u0001(\u000b2\u0018.texaspoker.ClubBaseInfo\"5\n\u0013CSGetClubInfoByUuid\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0010\n\blGetUuid\u0018\u0002 \u0002(\u0003\"\u0087\u0001\n\u0016SCGetClubInfoByUuidRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\f\n\u0004uuid\u0018\u0002 \u0002(\u0003\u00120\n\u000evClubBaseInfos\u0018\u0003 \u0003(\u000b2\u0018.texaspoker.ClubBaseInfo\"T\n\rCSSetClubFund\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0002(\u0003\u0012\u0015\n\rlClubUserUuid\u0018\u0003 \u0002(\u0003\u0012\r\n\u0005lFund\u0018\u0004 \u0002(\u0003\"\u0082\u0001\n\u0010SCSetClubFundRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012(\n\nstClubInfo\u0018\u0002 ", "\u0001(\u000b2\u0014.texaspoker.ClubInfo\u0012\u0015\n\rlClubUserUuid\u0018\u0003 \u0001(\u0003\"7\n\u0016CSGetClubUsersByClubID\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0002(\u0003\"\u00af\u0001\n\u0019SCGetClubUsersByClubIDRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u00121\n\u000fstClubBaseInfos\u0018\u0002 \u0001(\u000b2\u0018.texaspoker.ClubBaseInfo\u00120\n\u000evClubUserInfos\u0018\u0003 \u0003(\u000b2\u0018.texaspoker.ClubUserInfo\"2\n\u0011CSGetClubByClubID\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0002(\u0003\"o\n\u0014SCGetClubByClubIDRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_COD", "E_TYPE\u0012(\n\nstClubInfo\u0018\u0002 \u0001(\u000b2\u0014.texaspoker.ClubInfo\"7\n\u0016CSGetClubGamesByClubID\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0002(\u0003\"\u00f7\u0001\n\u0019SCGetClubGamesByClubIDRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u00121\n\u000fstClubBaseInfos\u0018\u0002 \u0001(\u000b2\u0018.texaspoker.ClubBaseInfo\u00128\n\u0012vGameRoomBaseInfos\u0018\u0003 \u0003(\u000b2\u001c.texaspoker.GameRoomBaseInfo\u0012>\n\u0015vSNGGameRoomBaseInfos\u0018\u0004 \u0003(\u000b2\u001f.texaspoker.SNGGameRoomBaseInfo\"B\n\u0013CSGetRecommendClubs\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007iOff", "set\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004iNum\u0018\u0003 \u0002(\u0005\"|\n\u0016SCGetRecommendClubsRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u00123\n\u0011vHotClubBaseInfos\u0018\u0002 \u0003(\u000b2\u0018.texaspoker.ClubBaseInfo\"\u00ad\u0001\n\u0014MaxMemberSellingItem\u0012\u001a\n\u0012iClubSellingItemID\u0018\u0001 \u0002(\u0005\u0012\u001c\n\u0014sClubSellingItemName\u0018\u0002 \u0002(\t\u0012\u001e\n\u0016sClubSellingItemDetail\u0018\u0003 \u0002(\t\u0012\r\n\u0005lCoin\u0018\u0004 \u0001(\u0003\u0012\u0015\n\riPerAddMember\u0018\u0005 \u0001(\u0005\u0012\u0015\n\riMaxAddMember\u0018\u0006 \u0001(\u0005\"\u0093\u0001\n\u0016AddClubFundSellingItem\u0012\u001a\n\u0012iClubSellingItemID\u0018\u0001 \u0002(\u0005\u0012\u001c\n\u0014sClubSellingItem", "Name\u0018\u0002 \u0002(\t\u0012\u001e\n\u0016sClubSellingItemDetail\u0018\u0003 \u0002(\t\u0012\r\n\u0005lCoin\u0018\u0004 \u0001(\u0003\u0012\u0010\n\blAddFund\u0018\u0005 \u0001(\u0003\"%\n\u0015CSGetClubSellingItems\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\"\u00d1\u0001\n\u0018SCGetClubSellingItemsRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012@\n\u0016stMaxMemberSellingItem\u0018\u0002 \u0001(\u000b2 .texaspoker.MaxMemberSellingItem\u0012D\n\u0018stAddClubFundSellingItem\u0018\u0003 \u0001(\u000b2\".texaspoker.AddClubFundSellingItem\"A\n\u0012CSAddClubMaxMember\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0002(\u0003\u0012\f\n\u0004iNum\u0018\u0003 \u0002(\u0005\"{\n\u0015SCA", "ddClubMaxMemberRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0001(\u0003\u0012\u0013\n\u000biMaxMembers\u0018\u0003 \u0001(\u0005\u0012\r\n\u0005lCoin\u0018\u0004 \u0001(\u0003\"Q\n\rCSAddClubFund\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0002(\u0003\u0012\u000f\n\u0007iItemID\u0018\u0003 \u0002(\u0005\u0012\u0010\n\biItemNum\u0018\u0004 \u0002(\u0005\"\u0081\u0001\n\u0010SCAddClubFundRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0001(\u0003\u0012\u000f\n\u0007iItemID\u0018\u0003 \u0001(\u0005\u0012\r\n\u0005lFund\u0018\u0004 \u0001(\u0003\u0012\r\n\u0005lCoin\u0018\u0005 \u0001(\u0003*P\n\bCLUB_ACT\u0012\u0016\n\u0012CLUB_ACCEPT_INVITE\u0010\u0001\u0012\u0014\n\u0010CLUB_DENY_INVITE\u0010\u0002\u0012\u0016\n\u0012CLUB_", "REMOVE_INVITE\u0010\u0003*g\n\u000fCLUB_USER_LEVEL\u0012\u0014\n\u0010CLUB_USER_SENIOR\u0010\u0001\u0012\u0014\n\u0010CLUB_USER_IUNIOR\u0010\u0002\u0012\u0015\n\u0011CLUB_USER_CREATOR\u0010\u0003\u0012\u0011\n\rCLUB_USER_NOT\u0010\u0004*=\n\u0010CLUB_SEARCH_TYPE\u0012\u0012\n\u000eCLUB_ID_SEARCH\u0010\u0001\u0012\u0015\n\u0011CLUB_OTHER_SEARCH\u0010\u0002*K\n\u0011FUND_BILL_TO_TYPE\u0012\u001a\n\u0016FUND_BILL_TO_TYPE_USER\u0010\u0001\u0012\u001a\n\u0016FUND_BILL_TO_TYPE_CLUB\u0010\u0002*N\n\u000eFUND_BILL_TYPE\u0012\u0010\n\fFUND_BILL_IN\u0010\u0001\u0012\u0011\n\rFUND_BILL_OUT\u0010\u0002\u0012\u0017\n\u0013FUND_BILL_MEMBER_IN\u0010\u0003*V\n\u0016CLUB_SELLING_ITEM_TYPE\u0012\u001a\n\u0016CLUB_SELLING_ITEM_COIN\u0010\u0001\u0012 \n\u001cCL", "UB_SELLING_ITEM_POPULARITY\u0010\u0002B+\n\u0015com.texaspoker.momentB\u0012TexasPokerHttpClub"}, fileDescriptorArr, new C01781());
        f148a = (Descriptor) bm.getMessageTypes().get(0);
        f149b = new FieldAccessorTable(f148a, new String[]{"StUserBaseInfo", "EClubUserLevel"});
        f150c = (Descriptor) bm.getMessageTypes().get(1);
        f151d = new FieldAccessorTable(f150c, new String[]{"StClubBaseInfo", "VClubUserInfos", "VGameRoomBaseInfos", "VSNGGameRoomBaseInfos"});
        f152e = (Descriptor) bm.getMessageTypes().get(2);
        f153f = new FieldAccessorTable(f152e, new String[]{"Uuid", "SClubName", "SClubLocation"});
        f154g = (Descriptor) bm.getMessageTypes().get(3);
        f155h = new FieldAccessorTable(f154g, new String[]{"EErrCode", "StClubInfo"});
        f156i = (Descriptor) bm.getMessageTypes().get(4);
        f157j = new FieldAccessorTable(f156i, new String[]{"Uuid", "LClubID", "SHint"});
        f158k = (Descriptor) bm.getMessageTypes().get(5);
        f159l = new FieldAccessorTable(f158k, new String[]{"EErrCode", "StClubInfo", "EClubUserLevel"});
        f160m = (Descriptor) bm.getMessageTypes().get(6);
        f161n = new FieldAccessorTable(f160m, new String[]{"Uuid", "LClubID", "LActionedID", "EClubAct", "SHint"});
        f162o = (Descriptor) bm.getMessageTypes().get(7);
        f163p = new FieldAccessorTable(f162o, new String[]{"EErrCode", "StClubInfo", "EClubAct", "LActionedID"});
        f164q = (Descriptor) bm.getMessageTypes().get(8);
        f165r = new FieldAccessorTable(f164q, new String[]{"Uuid", "SKeyWord", "IOffset", "INum", "EClubSearchType"});
        f166s = (Descriptor) bm.getMessageTypes().get(9);
        f167t = new FieldAccessorTable(f166s, new String[]{"EErrCode", "VClubBaseInfos"});
        f168u = (Descriptor) bm.getMessageTypes().get(10);
        f169v = new FieldAccessorTable(f168u, new String[]{"Uuid", "SClubLocation", "IOffset", "INum"});
        f170w = (Descriptor) bm.getMessageTypes().get(11);
        f171x = new FieldAccessorTable(f170w, new String[]{"EErrCode", "VClubBaseInfos"});
        f172y = (Descriptor) bm.getMessageTypes().get(12);
        f173z = new FieldAccessorTable(f172y, new String[]{"Uuid"});
        f122A = (Descriptor) bm.getMessageTypes().get(13);
        f123B = new FieldAccessorTable(f122A, new String[]{"EErrCode", "VClubBaseInfos"});
        f124C = (Descriptor) bm.getMessageTypes().get(14);
        f125D = new FieldAccessorTable(f124C, new String[]{"Uuid", "LClubID", "SClubName", "SDesc"});
        f126E = (Descriptor) bm.getMessageTypes().get(15);
        f127F = new FieldAccessorTable(f126E, new String[]{"EErrCode", "StClubBaseInfos"});
        f128G = (Descriptor) bm.getMessageTypes().get(16);
        f129H = new FieldAccessorTable(f128G, new String[]{"Uuid", "LClubID", "BClubMsgMute", "BClubMsgVibrate", "BVerify", "IManagerCreate"});
        f130I = (Descriptor) bm.getMessageTypes().get(17);
        f131J = new FieldAccessorTable(f130I, new String[]{"EErrCode", "StClubBaseInfos"});
        f132K = (Descriptor) bm.getMessageTypes().get(18);
        f133L = new FieldAccessorTable(f132K, new String[]{"Uuid", "LClubID", "LClubUserUuid", "EClubUserLevel"});
        f134M = (Descriptor) bm.getMessageTypes().get(19);
        f135N = new FieldAccessorTable(f134M, new String[]{"EErrCode", "StClubInfos"});
        f136O = (Descriptor) bm.getMessageTypes().get(20);
        f137P = new FieldAccessorTable(f136O, new String[]{"Uuid", "LClubID", "VIconDatas"});
        f138Q = (Descriptor) bm.getMessageTypes().get(21);
        f139R = new FieldAccessorTable(f138Q, new String[]{"EErrCode", "LClubID", "SSmallClubIcon", "SBigClubIcon"});
        f140S = (Descriptor) bm.getMessageTypes().get(22);
        f141T = new FieldAccessorTable(f140S, new String[]{"Uuid", "LClubID", "VIconDatas", "IPos"});
        f142U = (Descriptor) bm.getMessageTypes().get(23);
        f143V = new FieldAccessorTable(f142U, new String[]{"EErrCode", "LClubID", "SSmallAlbums", "SBigAlbums"});
        f144W = (Descriptor) bm.getMessageTypes().get(24);
        f145X = new FieldAccessorTable(f144W, new String[]{"Uuid", "LClubID", "IPos"});
        f146Y = (Descriptor) bm.getMessageTypes().get(25);
        f147Z = new FieldAccessorTable(f146Y, new String[]{"EErrCode", "LClubID", "SSmallAlbums", "SBigAlbums"});
        aa = (Descriptor) bm.getMessageTypes().get(26);
        ab = new FieldAccessorTable(aa, new String[]{"Uuid"});
        ac = (Descriptor) bm.getMessageTypes().get(27);
        ad = new FieldAccessorTable(ac, new String[]{"EErrCode", "VMyClubBaseInfos", "VAttendedClubBaseInfos"});
        ae = (Descriptor) bm.getMessageTypes().get(28);
        af = new FieldAccessorTable(ae, new String[]{"StClubBaseInfo", "BManager"});
        ag = (Descriptor) bm.getMessageTypes().get(29);
        ah = new FieldAccessorTable(ag, new String[]{"Uuid"});
        ai = (Descriptor) bm.getMessageTypes().get(30);
        aj = new FieldAccessorTable(ai, new String[]{"EErrCode", "VMyClubBaseInfos", "VAttendedClubBaseInfos"});
        ak = (Descriptor) bm.getMessageTypes().get(31);
        al = new FieldAccessorTable(ak, new String[]{"Uuid", "LClubID"});
        am = (Descriptor) bm.getMessageTypes().get(32);
        an = new FieldAccessorTable(am, new String[]{"EErrCode", "LClubID"});
        ao = (Descriptor) bm.getMessageTypes().get(33);
        ap = new FieldAccessorTable(ao, new String[]{"LCreateTime", "EFundBillType", "LFund", "EFundBillToType", "StUserBaseInfoNet", "StClubInfo", "StBillInfoNet"});
        aq = (Descriptor) bm.getMessageTypes().get(34);
        ar = new FieldAccessorTable(aq, new String[]{"Uuid", "LClubID"});
        as = (Descriptor) bm.getMessageTypes().get(35);
        at = new FieldAccessorTable(as, new String[]{"EErrCode", "LClubID", "VFundBillInfos"});
        au = (Descriptor) bm.getMessageTypes().get(36);
        av = new FieldAccessorTable(au, new String[]{"Uuid", "LClubID"});
        aw = (Descriptor) bm.getMessageTypes().get(37);
        ax = new FieldAccessorTable(aw, new String[]{"EErrCode", "StClubBaseInfos"});
        ay = (Descriptor) bm.getMessageTypes().get(38);
        az = new FieldAccessorTable(ay, new String[]{"Uuid", "LGetUuid"});
        aA = (Descriptor) bm.getMessageTypes().get(39);
        aB = new FieldAccessorTable(aA, new String[]{"EErrCode", "Uuid", "VClubBaseInfos"});
        aC = (Descriptor) bm.getMessageTypes().get(40);
        aD = new FieldAccessorTable(aC, new String[]{"Uuid", "LClubID", "LClubUserUuid", "LFund"});
        aE = (Descriptor) bm.getMessageTypes().get(41);
        aF = new FieldAccessorTable(aE, new String[]{"EErrCode", "StClubInfo", "LClubUserUuid"});
        aG = (Descriptor) bm.getMessageTypes().get(42);
        aH = new FieldAccessorTable(aG, new String[]{"Uuid", "LClubID"});
        aI = (Descriptor) bm.getMessageTypes().get(43);
        aJ = new FieldAccessorTable(aI, new String[]{"EErrCode", "StClubBaseInfos", "VClubUserInfos"});
        aK = (Descriptor) bm.getMessageTypes().get(44);
        aL = new FieldAccessorTable(aK, new String[]{"Uuid", "LClubID"});
        aM = (Descriptor) bm.getMessageTypes().get(45);
        aN = new FieldAccessorTable(aM, new String[]{"EErrCode", "StClubInfo"});
        aO = (Descriptor) bm.getMessageTypes().get(46);
        aP = new FieldAccessorTable(aO, new String[]{"Uuid", "LClubID"});
        aQ = (Descriptor) bm.getMessageTypes().get(47);
        aR = new FieldAccessorTable(aQ, new String[]{"EErrCode", "StClubBaseInfos", "VGameRoomBaseInfos", "VSNGGameRoomBaseInfos"});
        aS = (Descriptor) bm.getMessageTypes().get(48);
        aT = new FieldAccessorTable(aS, new String[]{"Uuid", "IOffset", "INum"});
        aU = (Descriptor) bm.getMessageTypes().get(49);
        aV = new FieldAccessorTable(aU, new String[]{"EErrCode", "VHotClubBaseInfos"});
        aW = (Descriptor) bm.getMessageTypes().get(50);
        aX = new FieldAccessorTable(aW, new String[]{"IClubSellingItemID", "SClubSellingItemName", "SClubSellingItemDetail", "LCoin", "IPerAddMember", "IMaxAddMember"});
        aY = (Descriptor) bm.getMessageTypes().get(51);
        aZ = new FieldAccessorTable(aY, new String[]{"IClubSellingItemID", "SClubSellingItemName", "SClubSellingItemDetail", "LCoin", "LAddFund"});
        ba = (Descriptor) bm.getMessageTypes().get(52);
        bb = new FieldAccessorTable(ba, new String[]{"Uuid"});
        bc = (Descriptor) bm.getMessageTypes().get(53);
        bd = new FieldAccessorTable(bc, new String[]{"EErrCode", "StMaxMemberSellingItem", "StAddClubFundSellingItem"});
        be = (Descriptor) bm.getMessageTypes().get(54);
        bf = new FieldAccessorTable(be, new String[]{"Uuid", "LClubID", "INum"});
        bg = (Descriptor) bm.getMessageTypes().get(55);
        bh = new FieldAccessorTable(bg, new String[]{"EErrCode", "LClubID", "IMaxMembers", "LCoin"});
        bi = (Descriptor) bm.getMessageTypes().get(56);
        bj = new FieldAccessorTable(bi, new String[]{"Uuid", "LClubID", "IItemID", "IItemNum"});
        bk = (Descriptor) bm.getMessageTypes().get(57);
        bl = new FieldAccessorTable(bk, new String[]{"EErrCode", "LClubID", "IItemID", "LFund", "LCoin"});
        TexasPokerCommon.m11a();
        TexasPoker.a();
        TexasPokerHttpBill.m99a();
    }
}
