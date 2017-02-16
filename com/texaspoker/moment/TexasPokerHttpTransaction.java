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
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.RepeatedFieldBuilder;
import com.google.protobuf.SingleFieldBuilder;
import com.google.protobuf.UnknownFieldSet;
import com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo;
import com.texaspoker.moment.TexasPokerCommon.ClubBaseInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import com.texaspoker.moment.TexasPokerCommon.GameItemInfo;
import com.texaspoker.moment.TexasPokerCommon.GameItemInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNetOrBuilder;
import java.io.InputStream;
import java.util.List;
import org.slf4j.spi.LocationAwareLogger;

public final class TexasPokerHttpTransaction {
    private static final Descriptor f225A;
    private static FieldAccessorTable f226B;
    private static final Descriptor f227C;
    private static FieldAccessorTable f228D;
    private static final Descriptor f229E;
    private static FieldAccessorTable f230F;
    private static final Descriptor f231G;
    private static FieldAccessorTable f232H;
    private static final Descriptor f233I;
    private static FieldAccessorTable f234J;
    private static final Descriptor f235K;
    private static FieldAccessorTable f236L;
    private static final Descriptor f237M;
    private static FieldAccessorTable f238N;
    private static final Descriptor f239O;
    private static FieldAccessorTable f240P;
    private static final Descriptor f241Q;
    private static FieldAccessorTable f242R;
    private static FileDescriptor f243S;
    private static final Descriptor f244a;
    private static FieldAccessorTable f245b;
    private static final Descriptor f246c;
    private static FieldAccessorTable f247d;
    private static final Descriptor f248e;
    private static FieldAccessorTable f249f;
    private static final Descriptor f250g;
    private static FieldAccessorTable f251h;
    private static final Descriptor f252i;
    private static FieldAccessorTable f253j;
    private static final Descriptor f254k;
    private static FieldAccessorTable f255l;
    private static final Descriptor f256m;
    private static FieldAccessorTable f257n;
    private static final Descriptor f258o;
    private static FieldAccessorTable f259p;
    private static final Descriptor f260q;
    private static FieldAccessorTable f261r;
    private static final Descriptor f262s;
    private static FieldAccessorTable f263t;
    private static final Descriptor f264u;
    private static FieldAccessorTable f265v;
    private static final Descriptor f266w;
    private static FieldAccessorTable f267x;
    private static final Descriptor f268y;
    private static FieldAccessorTable f269z;

    /* renamed from: com.texaspoker.moment.TexasPokerHttpTransaction.1 */
    class C02721 implements InternalDescriptorAssigner {
        static {
            fixHelper.fixfunc(new int[]{20390, 20391});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C02721();

        public final native ExtensionRegistry assignDescriptors(FileDescriptor fileDescriptor);
    }

    public interface AndroidOrderInfoOrBuilder extends MessageOrBuilder {
        ORDER_TYPE getEOrderType();

        PAYMENT_TYPE getEPaymentType();

        int getICoinStoreItemID();

        long getLOrderID();

        long getLOrderTime();

        WXOrderInfo getStWXOrderInfo();

        WXOrderInfoOrBuilder getStWXOrderInfoOrBuilder();

        boolean hasEOrderType();

        boolean hasEPaymentType();

        boolean hasICoinStoreItemID();

        boolean hasLOrderID();

        boolean hasLOrderTime();

        boolean hasStWXOrderInfo();
    }

    public static final class AndroidOrderInfo extends GeneratedMessage implements AndroidOrderInfoOrBuilder {
        public static final int EORDERTYPE_FIELD_NUMBER = 4;
        public static final int EPAYMENTTYPE_FIELD_NUMBER = 5;
        public static final int ICOINSTOREITEMID_FIELD_NUMBER = 2;
        public static final int LORDERID_FIELD_NUMBER = 1;
        public static final int LORDERTIME_FIELD_NUMBER = 3;
        public static Parser<AndroidOrderInfo> PARSER = null;
        public static final int STWXORDERINFO_FIELD_NUMBER = 6;
        private static final AndroidOrderInfo defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ORDER_TYPE eOrderType_;
        private PAYMENT_TYPE ePaymentType_;
        private int iCoinStoreItemID_;
        private long lOrderID_;
        private long lOrderTime_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private WXOrderInfo stWXOrderInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpTransaction.AndroidOrderInfo.1 */
        class C02731 extends AbstractParser<AndroidOrderInfo> {
            static {
                fixHelper.fixfunc(new int[]{19095, 19096});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02731();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements AndroidOrderInfoOrBuilder {
            private int bitField0_;
            private ORDER_TYPE eOrderType_;
            private PAYMENT_TYPE ePaymentType_;
            private int iCoinStoreItemID_;
            private long lOrderID_;
            private long lOrderTime_;
            private SingleFieldBuilder<WXOrderInfo, Builder, WXOrderInfoOrBuilder> stWXOrderInfoBuilder_;
            private WXOrderInfo stWXOrderInfo_;

            static {
                fixHelper.fixfunc(new int[]{21010, 21011, 21012, 21013, 21014, 21015, 21016, 21017, 21018, 21019, 21020, 21021, 21022, 21023, 21024, 21025, 21026, 21027, 21028, 21029, 21030, 21031, 21032, 21033, 21034, 21035, 21036, 21037, 21038, 21039, 21040, 21041, 21042, 21043, 21044, 21045, 21046, 21047, 21048, 21049, 21050, 21051, 21052, 21053, 21054, 21055, 21056, 21057, 21058, 21059, 21060, 21061, 21062, 21063, 21064, 21065, 21066, 21067, 21068, 21069, 21070});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<WXOrderInfo, Builder, WXOrderInfoOrBuilder> getStWXOrderInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3501build();

            public final native AndroidOrderInfo m3502build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3503buildPartial();

            public final native AndroidOrderInfo m3504buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3505clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3506clear();

            public final native Builder m3507clear();

            public final native Builder clearEOrderType();

            public final native Builder clearEPaymentType();

            public final native Builder clearICoinStoreItemID();

            public final native Builder clearLOrderID();

            public final native Builder clearLOrderTime();

            public final native Builder clearStWXOrderInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3508clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3509clone();

            public final native Builder m3510clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3511getDefaultInstanceForType();

            public final native AndroidOrderInfo m3512getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ORDER_TYPE getEOrderType();

            public final native PAYMENT_TYPE getEPaymentType();

            public final native int getICoinStoreItemID();

            public final native long getLOrderID();

            public final native long getLOrderTime();

            public final native WXOrderInfo getStWXOrderInfo();

            public final native Builder getStWXOrderInfoBuilder();

            public final native WXOrderInfoOrBuilder getStWXOrderInfoOrBuilder();

            public final native boolean hasEOrderType();

            public final native boolean hasEPaymentType();

            public final native boolean hasICoinStoreItemID();

            public final native boolean hasLOrderID();

            public final native boolean hasLOrderTime();

            public final native boolean hasStWXOrderInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3513mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3514mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3515mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3516mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3517mergeFrom(Message message);

            public final native Builder mergeFrom(AndroidOrderInfo androidOrderInfo);

            public final native Builder mergeStWXOrderInfo(WXOrderInfo wXOrderInfo);

            public final native Builder setEOrderType(ORDER_TYPE order_type);

            public final native Builder setEPaymentType(PAYMENT_TYPE payment_type);

            public final native Builder setICoinStoreItemID(int i);

            public final native Builder setLOrderID(long j);

            public final native Builder setLOrderTime(long j);

            public final native Builder setStWXOrderInfo(Builder builder);

            public final native Builder setStWXOrderInfo(WXOrderInfo wXOrderInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpTransaction.f233I;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{25956, 25957, 25958, 25959, 25960, 25961, 25962, 25963, 25964, 25965, 25966, 25967, 25968, 25969, 25970, 25971, 25972, 25973, 25974, 25975, 25976, 25977, 25978, 25979, 25980, 25981, 25982, 25983, 25984, 25985, 25986, 25987, 25988, 25989, 25990, 25991, 25992});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native AndroidOrderInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ AndroidOrderInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, AndroidOrderInfo androidOrderInfo);

        private native AndroidOrderInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ AndroidOrderInfo(com.google.protobuf.GeneratedMessage.Builder builder, AndroidOrderInfo androidOrderInfo);

        private native AndroidOrderInfo(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3494getDefaultInstanceForType();

        public final native AndroidOrderInfo m3495getDefaultInstanceForType();

        public final native ORDER_TYPE getEOrderType();

        public final native PAYMENT_TYPE getEPaymentType();

        public final native int getICoinStoreItemID();

        public final native long getLOrderID();

        public final native long getLOrderTime();

        public final native Parser<AndroidOrderInfo> getParserForType();

        public final native int getSerializedSize();

        public final native WXOrderInfo getStWXOrderInfo();

        public final native WXOrderInfoOrBuilder getStWXOrderInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEOrderType();

        public final native boolean hasEPaymentType();

        public final native boolean hasICoinStoreItemID();

        public final native boolean hasLOrderID();

        public final native boolean hasLOrderTime();

        public final native boolean hasStWXOrderInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3496newBuilderForType();

        public final native Builder m3497newBuilderForType();

        protected final native Builder m3498newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3499toBuilder();

        public final native Builder m3500toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static AndroidOrderInfo getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpTransaction.f233I;
        }

        static void __clinit__() {
            PARSER = new C02731();
            AndroidOrderInfo androidOrderInfo = new AndroidOrderInfo(true);
            defaultInstance = androidOrderInfo;
            androidOrderInfo.initFields();
        }

        public static AndroidOrderInfo parseFrom(ByteString byteString) {
            return (AndroidOrderInfo) PARSER.parseFrom(byteString);
        }

        public static AndroidOrderInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (AndroidOrderInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AndroidOrderInfo parseFrom(byte[] bArr) {
            return (AndroidOrderInfo) PARSER.parseFrom(bArr);
        }

        public static AndroidOrderInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (AndroidOrderInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AndroidOrderInfo parseFrom(InputStream inputStream) {
            return (AndroidOrderInfo) PARSER.parseFrom(inputStream);
        }

        public static AndroidOrderInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AndroidOrderInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static AndroidOrderInfo parseDelimitedFrom(InputStream inputStream) {
            return (AndroidOrderInfo) PARSER.parseDelimitedFrom(inputStream);
        }

        public static AndroidOrderInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AndroidOrderInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static AndroidOrderInfo parseFrom(CodedInputStream codedInputStream) {
            return (AndroidOrderInfo) PARSER.parseFrom(codedInputStream);
        }

        public static AndroidOrderInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AndroidOrderInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(AndroidOrderInfo androidOrderInfo) {
            return newBuilder().mergeFrom(androidOrderInfo);
        }
    }

    public interface CSAdminAddClubFundOrBuilder extends MessageOrBuilder {
        long getLClubID();

        long getLFund();

        long getUuid();

        boolean hasLClubID();

        boolean hasLFund();

        boolean hasUuid();
    }

    public static final class CSAdminAddClubFund extends GeneratedMessage implements CSAdminAddClubFundOrBuilder {
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static final int LFUND_FIELD_NUMBER = 3;
        public static Parser<CSAdminAddClubFund> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSAdminAddClubFund defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lClubID_;
        private long lFund_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpTransaction.CSAdminAddClubFund.1 */
        class C02741 extends AbstractParser<CSAdminAddClubFund> {
            static {
                fixHelper.fixfunc(new int[]{17776, 17777});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02741();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSAdminAddClubFundOrBuilder {
            private int bitField0_;
            private long lClubID_;
            private long lFund_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{33291, 33292, 33293, 33294, 33295, 33296, 33297, 33298, 33299, 33300, 33301, 33302, 33303, 33304, 33305, 33306, 33307, 33308, 33309, 33310, 33311, 33312, 33313, 33314, 33315, 33316, 33317, 33318, 33319, 33320, 33321, 33322, 33323, 33324, 33325, 33326, 33327, 33328, 33329, 33330, 33331, 33332, 33333, 33334});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3525build();

            public final native CSAdminAddClubFund m3526build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3527buildPartial();

            public final native CSAdminAddClubFund m3528buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3529clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3530clear();

            public final native Builder m3531clear();

            public final native Builder clearLClubID();

            public final native Builder clearLFund();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3532clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3533clone();

            public final native Builder m3534clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3535getDefaultInstanceForType();

            public final native CSAdminAddClubFund m3536getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLClubID();

            public final native long getLFund();

            public final native long getUuid();

            public final native boolean hasLClubID();

            public final native boolean hasLFund();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3537mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3538mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3539mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3540mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3541mergeFrom(Message message);

            public final native Builder mergeFrom(CSAdminAddClubFund cSAdminAddClubFund);

            public final native Builder setLClubID(long j);

            public final native Builder setLFund(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpTransaction.f227C;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{33102, 33103, 33104, 33105, 33106, 33107, 33108, 33109, 33110, 33111, 33112, 33113, 33114, 33115, 33116, 33117, 33118, 33119, 33120, 33121, 33122, 33123, 33124, 33125, 33126, 33127, 33128, 33129, 33130, 33131});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSAdminAddClubFund(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSAdminAddClubFund(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSAdminAddClubFund cSAdminAddClubFund);

        private native CSAdminAddClubFund(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSAdminAddClubFund(com.google.protobuf.GeneratedMessage.Builder builder, CSAdminAddClubFund cSAdminAddClubFund);

        private native CSAdminAddClubFund(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3518getDefaultInstanceForType();

        public final native CSAdminAddClubFund m3519getDefaultInstanceForType();

        public final native long getLClubID();

        public final native long getLFund();

        public final native Parser<CSAdminAddClubFund> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasLClubID();

        public final native boolean hasLFund();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3520newBuilderForType();

        public final native Builder m3521newBuilderForType();

        protected final native Builder m3522newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3523toBuilder();

        public final native Builder m3524toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSAdminAddClubFund getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpTransaction.f227C;
        }

        static void __clinit__() {
            PARSER = new C02741();
            CSAdminAddClubFund cSAdminAddClubFund = new CSAdminAddClubFund(true);
            defaultInstance = cSAdminAddClubFund;
            cSAdminAddClubFund.initFields();
        }

        public static CSAdminAddClubFund parseFrom(ByteString byteString) {
            return (CSAdminAddClubFund) PARSER.parseFrom(byteString);
        }

        public static CSAdminAddClubFund parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSAdminAddClubFund) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSAdminAddClubFund parseFrom(byte[] bArr) {
            return (CSAdminAddClubFund) PARSER.parseFrom(bArr);
        }

        public static CSAdminAddClubFund parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSAdminAddClubFund) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSAdminAddClubFund parseFrom(InputStream inputStream) {
            return (CSAdminAddClubFund) PARSER.parseFrom(inputStream);
        }

        public static CSAdminAddClubFund parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSAdminAddClubFund) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSAdminAddClubFund parseDelimitedFrom(InputStream inputStream) {
            return (CSAdminAddClubFund) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSAdminAddClubFund parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSAdminAddClubFund) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSAdminAddClubFund parseFrom(CodedInputStream codedInputStream) {
            return (CSAdminAddClubFund) PARSER.parseFrom(codedInputStream);
        }

        public static CSAdminAddClubFund parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSAdminAddClubFund) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSAdminAddClubFund cSAdminAddClubFund) {
            return newBuilder().mergeFrom(cSAdminAddClubFund);
        }
    }

    public interface CSAdminAddCoinOrBuilder extends MessageOrBuilder {
        long getLAddedUuid();

        long getLCoin();

        long getLPopularity();

        long getUuid();

        boolean hasLAddedUuid();

        boolean hasLCoin();

        boolean hasLPopularity();

        boolean hasUuid();
    }

    public static final class CSAdminAddCoin extends GeneratedMessage implements CSAdminAddCoinOrBuilder {
        public static final int LADDEDUUID_FIELD_NUMBER = 2;
        public static final int LCOIN_FIELD_NUMBER = 3;
        public static final int LPOPULARITY_FIELD_NUMBER = 4;
        public static Parser<CSAdminAddCoin> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSAdminAddCoin defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lAddedUuid_;
        private long lCoin_;
        private long lPopularity_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpTransaction.CSAdminAddCoin.1 */
        class C02751 extends AbstractParser<CSAdminAddCoin> {
            static {
                fixHelper.fixfunc(new int[]{14286, 14287});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02751();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSAdminAddCoinOrBuilder {
            private int bitField0_;
            private long lAddedUuid_;
            private long lCoin_;
            private long lPopularity_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{9465, 9466, 9467, 9468, 9469, 9470, 9471, 9472, 9473, 9474, 9475, 9476, 9477, 9478, 9479, 9480, 9481, 9482, 9483, 9484, 9485, 9486, 9487, 9488, 9489, 9490, 9491, 9492, 9493, 9494, 9495, 9496, 9497, 9498, 9499, 9500, 9501, 9502, 9503, 9504, 9505, 9506, 9507, 9508, 9509, 9510, 9511, 9512});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3549build();

            public final native CSAdminAddCoin m3550build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3551buildPartial();

            public final native CSAdminAddCoin m3552buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3553clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3554clear();

            public final native Builder m3555clear();

            public final native Builder clearLAddedUuid();

            public final native Builder clearLCoin();

            public final native Builder clearLPopularity();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3556clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3557clone();

            public final native Builder m3558clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3559getDefaultInstanceForType();

            public final native CSAdminAddCoin m3560getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLAddedUuid();

            public final native long getLCoin();

            public final native long getLPopularity();

            public final native long getUuid();

            public final native boolean hasLAddedUuid();

            public final native boolean hasLCoin();

            public final native boolean hasLPopularity();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3561mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3562mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3563mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3564mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3565mergeFrom(Message message);

            public final native Builder mergeFrom(CSAdminAddCoin cSAdminAddCoin);

            public final native Builder setLAddedUuid(long j);

            public final native Builder setLCoin(long j);

            public final native Builder setLPopularity(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpTransaction.f268y;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{21967, 21968, 21969, 21970, 21971, 21972, 21973, 21974, 21975, 21976, 21977, 21978, 21979, 21980, 21981, 21982, 21983, 21984, 21985, 21986, 21987, 21988, 21989, 21990, 21991, 21992, 21993, 21994, 21995, 21996, 21997, 21998});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSAdminAddCoin(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSAdminAddCoin(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSAdminAddCoin cSAdminAddCoin);

        private native CSAdminAddCoin(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSAdminAddCoin(com.google.protobuf.GeneratedMessage.Builder builder, CSAdminAddCoin cSAdminAddCoin);

        private native CSAdminAddCoin(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3542getDefaultInstanceForType();

        public final native CSAdminAddCoin m3543getDefaultInstanceForType();

        public final native long getLAddedUuid();

        public final native long getLCoin();

        public final native long getLPopularity();

        public final native Parser<CSAdminAddCoin> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasLAddedUuid();

        public final native boolean hasLCoin();

        public final native boolean hasLPopularity();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3544newBuilderForType();

        public final native Builder m3545newBuilderForType();

        protected final native Builder m3546newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3547toBuilder();

        public final native Builder m3548toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSAdminAddCoin getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpTransaction.f268y;
        }

        static void __clinit__() {
            PARSER = new C02751();
            CSAdminAddCoin cSAdminAddCoin = new CSAdminAddCoin(true);
            defaultInstance = cSAdminAddCoin;
            cSAdminAddCoin.initFields();
        }

        public static CSAdminAddCoin parseFrom(ByteString byteString) {
            return (CSAdminAddCoin) PARSER.parseFrom(byteString);
        }

        public static CSAdminAddCoin parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSAdminAddCoin) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSAdminAddCoin parseFrom(byte[] bArr) {
            return (CSAdminAddCoin) PARSER.parseFrom(bArr);
        }

        public static CSAdminAddCoin parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSAdminAddCoin) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSAdminAddCoin parseFrom(InputStream inputStream) {
            return (CSAdminAddCoin) PARSER.parseFrom(inputStream);
        }

        public static CSAdminAddCoin parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSAdminAddCoin) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSAdminAddCoin parseDelimitedFrom(InputStream inputStream) {
            return (CSAdminAddCoin) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSAdminAddCoin parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSAdminAddCoin) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSAdminAddCoin parseFrom(CodedInputStream codedInputStream) {
            return (CSAdminAddCoin) PARSER.parseFrom(codedInputStream);
        }

        public static CSAdminAddCoin parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSAdminAddCoin) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSAdminAddCoin cSAdminAddCoin) {
            return newBuilder().mergeFrom(cSAdminAddCoin);
        }
    }

    public interface CSBuyCoinOrBuilder extends MessageOrBuilder {
        ByteString getEncodingStr();

        int getICoinStoreItemID();

        int getIMobleSystem();

        long getUuid();

        boolean hasEncodingStr();

        boolean hasICoinStoreItemID();

        boolean hasIMobleSystem();

        boolean hasUuid();
    }

    public static final class CSBuyCoin extends GeneratedMessage implements CSBuyCoinOrBuilder {
        public static final int ENCODINGSTR_FIELD_NUMBER = 4;
        public static final int ICOINSTOREITEMID_FIELD_NUMBER = 2;
        public static final int IMOBLESYSTEM_FIELD_NUMBER = 3;
        public static Parser<CSBuyCoin> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSBuyCoin defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString encodingStr_;
        private int iCoinStoreItemID_;
        private int iMobleSystem_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpTransaction.CSBuyCoin.1 */
        class C02761 extends AbstractParser<CSBuyCoin> {
            static {
                fixHelper.fixfunc(new int[]{13287, 13288});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02761();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSBuyCoinOrBuilder {
            private int bitField0_;
            private ByteString encodingStr_;
            private int iCoinStoreItemID_;
            private int iMobleSystem_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{33515, 33516, 33517, 33518, 33519, 33520, 33521, 33522, 33523, 33524, 33525, 33526, 33527, 33528, 33529, 33530, 33531, 33532, 33533, 33534, 33535, 33536, 33537, 33538, 33539, 33540, 33541, 33542, 33543, 33544, 33545, 33546, 33547, 33548, 33549, 33550, 33551, 33552, 33553, 33554, 33555, 33556, 33557, 33558, 33559, 33560, 33561, 33562});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3573build();

            public final native CSBuyCoin m3574build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3575buildPartial();

            public final native CSBuyCoin m3576buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3577clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3578clear();

            public final native Builder m3579clear();

            public final native Builder clearEncodingStr();

            public final native Builder clearICoinStoreItemID();

            public final native Builder clearIMobleSystem();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3580clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3581clone();

            public final native Builder m3582clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3583getDefaultInstanceForType();

            public final native CSBuyCoin m3584getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ByteString getEncodingStr();

            public final native int getICoinStoreItemID();

            public final native int getIMobleSystem();

            public final native long getUuid();

            public final native boolean hasEncodingStr();

            public final native boolean hasICoinStoreItemID();

            public final native boolean hasIMobleSystem();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3585mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3586mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3587mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3588mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3589mergeFrom(Message message);

            public final native Builder mergeFrom(CSBuyCoin cSBuyCoin);

            public final native Builder setEncodingStr(ByteString byteString);

            public final native Builder setICoinStoreItemID(int i);

            public final native Builder setIMobleSystem(int i);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpTransaction.f244a;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{29300, 29301, 29302, 29303, 29304, 29305, 29306, 29307, 29308, 29309, 29310, 29311, 29312, 29313, 29314, 29315, 29316, 29317, 29318, 29319, 29320, 29321, 29322, 29323, 29324, 29325, 29326, 29327, 29328, 29329, 29330, 29331});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSBuyCoin(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSBuyCoin(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSBuyCoin cSBuyCoin);

        private native CSBuyCoin(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSBuyCoin(com.google.protobuf.GeneratedMessage.Builder builder, CSBuyCoin cSBuyCoin);

        private native CSBuyCoin(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3566getDefaultInstanceForType();

        public final native CSBuyCoin m3567getDefaultInstanceForType();

        public final native ByteString getEncodingStr();

        public final native int getICoinStoreItemID();

        public final native int getIMobleSystem();

        public final native Parser<CSBuyCoin> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasEncodingStr();

        public final native boolean hasICoinStoreItemID();

        public final native boolean hasIMobleSystem();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3568newBuilderForType();

        public final native Builder m3569newBuilderForType();

        protected final native Builder m3570newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3571toBuilder();

        public final native Builder m3572toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSBuyCoin getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpTransaction.f244a;
        }

        static void __clinit__() {
            PARSER = new C02761();
            CSBuyCoin cSBuyCoin = new CSBuyCoin(true);
            defaultInstance = cSBuyCoin;
            cSBuyCoin.initFields();
        }

        public static CSBuyCoin parseFrom(ByteString byteString) {
            return (CSBuyCoin) PARSER.parseFrom(byteString);
        }

        public static CSBuyCoin parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSBuyCoin) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSBuyCoin parseFrom(byte[] bArr) {
            return (CSBuyCoin) PARSER.parseFrom(bArr);
        }

        public static CSBuyCoin parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSBuyCoin) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSBuyCoin parseFrom(InputStream inputStream) {
            return (CSBuyCoin) PARSER.parseFrom(inputStream);
        }

        public static CSBuyCoin parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSBuyCoin) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSBuyCoin parseDelimitedFrom(InputStream inputStream) {
            return (CSBuyCoin) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSBuyCoin parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSBuyCoin) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSBuyCoin parseFrom(CodedInputStream codedInputStream) {
            return (CSBuyCoin) PARSER.parseFrom(codedInputStream);
        }

        public static CSBuyCoin parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSBuyCoin) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSBuyCoin cSBuyCoin) {
            return newBuilder().mergeFrom(cSBuyCoin);
        }
    }

    public interface CSBuyCoinAndroidOrBuilder extends MessageOrBuilder {
        int getICoinStoreItemID();

        String getSPurchaseData();

        ByteString getSPurchaseDataBytes();

        String getSPurchaseSignature();

        ByteString getSPurchaseSignatureBytes();

        long getUuid();

        boolean hasICoinStoreItemID();

        boolean hasSPurchaseData();

        boolean hasSPurchaseSignature();

        boolean hasUuid();
    }

    public static final class CSBuyCoinAndroid extends GeneratedMessage implements CSBuyCoinAndroidOrBuilder {
        public static final int ICOINSTOREITEMID_FIELD_NUMBER = 2;
        public static Parser<CSBuyCoinAndroid> PARSER = null;
        public static final int SPURCHASEDATA_FIELD_NUMBER = 3;
        public static final int SPURCHASESIGNATURE_FIELD_NUMBER = 4;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSBuyCoinAndroid defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int iCoinStoreItemID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sPurchaseData_;
        private Object sPurchaseSignature_;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpTransaction.CSBuyCoinAndroid.1 */
        class C02771 extends AbstractParser<CSBuyCoinAndroid> {
            static {
                fixHelper.fixfunc(new int[]{21141, 21142});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02771();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSBuyCoinAndroidOrBuilder {
            private int bitField0_;
            private int iCoinStoreItemID_;
            private Object sPurchaseData_;
            private Object sPurchaseSignature_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{31724, 31725, 31726, 31727, 31728, 31729, 31730, 31731, 31732, 31733, 31734, 31735, 31736, 31737, 31738, 31739, 31740, 31741, 31742, 31743, 31744, 31745, 31746, 31747, 31748, 31749, 31750, 31751, 31752, 31753, 31754, 31755, 31756, 31757, 31758, 31759, 31760, 31761, 31762, 31763, 31764, 31765, 31766, 31767, 31768, 31769, 31770, 31771, 31772, 31773, 31774, 31775});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3597build();

            public final native CSBuyCoinAndroid m3598build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3599buildPartial();

            public final native CSBuyCoinAndroid m3600buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3601clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3602clear();

            public final native Builder m3603clear();

            public final native Builder clearICoinStoreItemID();

            public final native Builder clearSPurchaseData();

            public final native Builder clearSPurchaseSignature();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3604clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3605clone();

            public final native Builder m3606clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3607getDefaultInstanceForType();

            public final native CSBuyCoinAndroid m3608getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getICoinStoreItemID();

            public final native String getSPurchaseData();

            public final native ByteString getSPurchaseDataBytes();

            public final native String getSPurchaseSignature();

            public final native ByteString getSPurchaseSignatureBytes();

            public final native long getUuid();

            public final native boolean hasICoinStoreItemID();

            public final native boolean hasSPurchaseData();

            public final native boolean hasSPurchaseSignature();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3609mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3610mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3611mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3612mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3613mergeFrom(Message message);

            public final native Builder mergeFrom(CSBuyCoinAndroid cSBuyCoinAndroid);

            public final native Builder setICoinStoreItemID(int i);

            public final native Builder setSPurchaseData(String str);

            public final native Builder setSPurchaseDataBytes(ByteString byteString);

            public final native Builder setSPurchaseSignature(String str);

            public final native Builder setSPurchaseSignatureBytes(ByteString byteString);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpTransaction.f239O;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{5666, 5667, 5668, 5669, 5670, 5671, 5672, 5673, 5674, 5675, 5676, 5677, 5678, 5679, 5680, 5681, 5682, 5683, 5684, 5685, 5686, 5687, 5688, 5689, 5690, 5691, 5692, 5693, 5694, 5695, 5696, 5697, 5698, 5699});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSBuyCoinAndroid(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSBuyCoinAndroid(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSBuyCoinAndroid cSBuyCoinAndroid);

        private native CSBuyCoinAndroid(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSBuyCoinAndroid(com.google.protobuf.GeneratedMessage.Builder builder, CSBuyCoinAndroid cSBuyCoinAndroid);

        private native CSBuyCoinAndroid(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3590getDefaultInstanceForType();

        public final native CSBuyCoinAndroid m3591getDefaultInstanceForType();

        public final native int getICoinStoreItemID();

        public final native Parser<CSBuyCoinAndroid> getParserForType();

        public final native String getSPurchaseData();

        public final native ByteString getSPurchaseDataBytes();

        public final native String getSPurchaseSignature();

        public final native ByteString getSPurchaseSignatureBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasICoinStoreItemID();

        public final native boolean hasSPurchaseData();

        public final native boolean hasSPurchaseSignature();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3592newBuilderForType();

        public final native Builder m3593newBuilderForType();

        protected final native Builder m3594newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3595toBuilder();

        public final native Builder m3596toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSBuyCoinAndroid getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpTransaction.f239O;
        }

        static void __clinit__() {
            PARSER = new C02771();
            CSBuyCoinAndroid cSBuyCoinAndroid = new CSBuyCoinAndroid(true);
            defaultInstance = cSBuyCoinAndroid;
            cSBuyCoinAndroid.initFields();
        }

        public static CSBuyCoinAndroid parseFrom(ByteString byteString) {
            return (CSBuyCoinAndroid) PARSER.parseFrom(byteString);
        }

        public static CSBuyCoinAndroid parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSBuyCoinAndroid) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSBuyCoinAndroid parseFrom(byte[] bArr) {
            return (CSBuyCoinAndroid) PARSER.parseFrom(bArr);
        }

        public static CSBuyCoinAndroid parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSBuyCoinAndroid) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSBuyCoinAndroid parseFrom(InputStream inputStream) {
            return (CSBuyCoinAndroid) PARSER.parseFrom(inputStream);
        }

        public static CSBuyCoinAndroid parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSBuyCoinAndroid) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSBuyCoinAndroid parseDelimitedFrom(InputStream inputStream) {
            return (CSBuyCoinAndroid) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSBuyCoinAndroid parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSBuyCoinAndroid) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSBuyCoinAndroid parseFrom(CodedInputStream codedInputStream) {
            return (CSBuyCoinAndroid) PARSER.parseFrom(codedInputStream);
        }

        public static CSBuyCoinAndroid parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSBuyCoinAndroid) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSBuyCoinAndroid cSBuyCoinAndroid) {
            return newBuilder().mergeFrom(cSBuyCoinAndroid);
        }
    }

    public interface CSBuySellingItemOrBuilder extends MessageOrBuilder {
        int getISellingItemID();

        long getUuid();

        boolean hasISellingItemID();

        boolean hasUuid();
    }

    public static final class CSBuySellingItem extends GeneratedMessage implements CSBuySellingItemOrBuilder {
        public static final int ISELLINGITEMID_FIELD_NUMBER = 1;
        public static Parser<CSBuySellingItem> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 2;
        private static final CSBuySellingItem defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int iSellingItemID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpTransaction.CSBuySellingItem.1 */
        class C02781 extends AbstractParser<CSBuySellingItem> {
            static {
                fixHelper.fixfunc(new int[]{34123, 34124});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02781();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSBuySellingItemOrBuilder {
            private int bitField0_;
            private int iSellingItemID_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{14144, 14145, 14146, 14147, 14148, 14149, 14150, 14151, 14152, 14153, 14154, 14155, 14156, 14157, 14158, 14159, 14160, 14161, 14162, 14163, 14164, 14165, 14166, 14167, 14168, 14169, 14170, 14171, 14172, 14173, 14174, 14175, 14176, 14177, 14178, 14179, 14180, 14181, 14182, 14183});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3621build();

            public final native CSBuySellingItem m3622build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3623buildPartial();

            public final native CSBuySellingItem m3624buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3625clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3626clear();

            public final native Builder m3627clear();

            public final native Builder clearISellingItemID();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3628clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3629clone();

            public final native Builder m3630clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3631getDefaultInstanceForType();

            public final native CSBuySellingItem m3632getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getISellingItemID();

            public final native long getUuid();

            public final native boolean hasISellingItemID();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3633mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3634mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3635mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3636mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3637mergeFrom(Message message);

            public final native Builder mergeFrom(CSBuySellingItem cSBuySellingItem);

            public final native Builder setISellingItemID(int i);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpTransaction.f248e;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{17280, 17281, 17282, 17283, 17284, 17285, 17286, 17287, 17288, 17289, 17290, 17291, 17292, 17293, 17294, 17295, 17296, 17297, 17298, 17299, 17300, 17301, 17302, 17303, 17304, 17305, 17306, 17307});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSBuySellingItem(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSBuySellingItem(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSBuySellingItem cSBuySellingItem);

        private native CSBuySellingItem(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSBuySellingItem(com.google.protobuf.GeneratedMessage.Builder builder, CSBuySellingItem cSBuySellingItem);

        private native CSBuySellingItem(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3614getDefaultInstanceForType();

        public final native CSBuySellingItem m3615getDefaultInstanceForType();

        public final native int getISellingItemID();

        public final native Parser<CSBuySellingItem> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasISellingItemID();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3616newBuilderForType();

        public final native Builder m3617newBuilderForType();

        protected final native Builder m3618newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3619toBuilder();

        public final native Builder m3620toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSBuySellingItem getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpTransaction.f248e;
        }

        static void __clinit__() {
            PARSER = new C02781();
            CSBuySellingItem cSBuySellingItem = new CSBuySellingItem(true);
            defaultInstance = cSBuySellingItem;
            cSBuySellingItem.initFields();
        }

        public static CSBuySellingItem parseFrom(ByteString byteString) {
            return (CSBuySellingItem) PARSER.parseFrom(byteString);
        }

        public static CSBuySellingItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSBuySellingItem) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSBuySellingItem parseFrom(byte[] bArr) {
            return (CSBuySellingItem) PARSER.parseFrom(bArr);
        }

        public static CSBuySellingItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSBuySellingItem) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSBuySellingItem parseFrom(InputStream inputStream) {
            return (CSBuySellingItem) PARSER.parseFrom(inputStream);
        }

        public static CSBuySellingItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSBuySellingItem) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSBuySellingItem parseDelimitedFrom(InputStream inputStream) {
            return (CSBuySellingItem) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSBuySellingItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSBuySellingItem) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSBuySellingItem parseFrom(CodedInputStream codedInputStream) {
            return (CSBuySellingItem) PARSER.parseFrom(codedInputStream);
        }

        public static CSBuySellingItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSBuySellingItem) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSBuySellingItem cSBuySellingItem) {
            return newBuilder().mergeFrom(cSBuySellingItem);
        }
    }

    public interface CSGetCoinStoreListOrBuilder extends MessageOrBuilder {
        int getIMobleSystem();

        long getUuid();

        boolean hasIMobleSystem();

        boolean hasUuid();
    }

    public static final class CSGetCoinStoreList extends GeneratedMessage implements CSGetCoinStoreListOrBuilder {
        public static final int IMOBLESYSTEM_FIELD_NUMBER = 2;
        public static Parser<CSGetCoinStoreList> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetCoinStoreList defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int iMobleSystem_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpTransaction.CSGetCoinStoreList.1 */
        class C02791 extends AbstractParser<CSGetCoinStoreList> {
            static {
                fixHelper.fixfunc(new int[]{33392, 33393});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02791();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetCoinStoreListOrBuilder {
            private int bitField0_;
            private int iMobleSystem_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{10411, 10412, 10413, 10414, 10415, 10416, 10417, 10418, 10419, 10420, 10421, 10422, 10423, 10424, 10425, 10426, 10427, 10428, 10429, 10430, 10431, 10432, 10433, 10434, 10435, 10436, 10437, 10438, 10439, 10440, 10441, 10442, 10443, 10444, 10445, 10446, 10447, 10448, 10449, 10450});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3645build();

            public final native CSGetCoinStoreList m3646build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3647buildPartial();

            public final native CSGetCoinStoreList m3648buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3649clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3650clear();

            public final native Builder m3651clear();

            public final native Builder clearIMobleSystem();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3652clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3653clone();

            public final native Builder m3654clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3655getDefaultInstanceForType();

            public final native CSGetCoinStoreList m3656getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getIMobleSystem();

            public final native long getUuid();

            public final native boolean hasIMobleSystem();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3657mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3658mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3659mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3660mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3661mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetCoinStoreList cSGetCoinStoreList);

            public final native Builder setIMobleSystem(int i);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpTransaction.f260q;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{9268, 9269, 9270, 9271, 9272, 9273, 9274, 9275, 9276, 9277, 9278, 9279, 9280, 9281, 9282, 9283, 9284, 9285, 9286, 9287, 9288, 9289, 9290, 9291, 9292, 9293, 9294, 9295});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetCoinStoreList(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetCoinStoreList(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetCoinStoreList cSGetCoinStoreList);

        private native CSGetCoinStoreList(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetCoinStoreList(com.google.protobuf.GeneratedMessage.Builder builder, CSGetCoinStoreList cSGetCoinStoreList);

        private native CSGetCoinStoreList(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3638getDefaultInstanceForType();

        public final native CSGetCoinStoreList m3639getDefaultInstanceForType();

        public final native int getIMobleSystem();

        public final native Parser<CSGetCoinStoreList> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasIMobleSystem();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3640newBuilderForType();

        public final native Builder m3641newBuilderForType();

        protected final native Builder m3642newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3643toBuilder();

        public final native Builder m3644toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetCoinStoreList getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpTransaction.f260q;
        }

        static void __clinit__() {
            PARSER = new C02791();
            CSGetCoinStoreList cSGetCoinStoreList = new CSGetCoinStoreList(true);
            defaultInstance = cSGetCoinStoreList;
            cSGetCoinStoreList.initFields();
        }

        public static CSGetCoinStoreList parseFrom(ByteString byteString) {
            return (CSGetCoinStoreList) PARSER.parseFrom(byteString);
        }

        public static CSGetCoinStoreList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetCoinStoreList) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetCoinStoreList parseFrom(byte[] bArr) {
            return (CSGetCoinStoreList) PARSER.parseFrom(bArr);
        }

        public static CSGetCoinStoreList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetCoinStoreList) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetCoinStoreList parseFrom(InputStream inputStream) {
            return (CSGetCoinStoreList) PARSER.parseFrom(inputStream);
        }

        public static CSGetCoinStoreList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetCoinStoreList) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetCoinStoreList parseDelimitedFrom(InputStream inputStream) {
            return (CSGetCoinStoreList) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetCoinStoreList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetCoinStoreList) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetCoinStoreList parseFrom(CodedInputStream codedInputStream) {
            return (CSGetCoinStoreList) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetCoinStoreList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetCoinStoreList) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetCoinStoreList cSGetCoinStoreList) {
            return newBuilder().mergeFrom(cSGetCoinStoreList);
        }
    }

    public interface CSGetItemListOrBuilder extends MessageOrBuilder {
        long getUuid();

        boolean hasUuid();
    }

    public static final class CSGetItemList extends GeneratedMessage implements CSGetItemListOrBuilder {
        public static Parser<CSGetItemList> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetItemList defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpTransaction.CSGetItemList.1 */
        class C02801 extends AbstractParser<CSGetItemList> {
            static {
                fixHelper.fixfunc(new int[]{18893, 18894});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02801();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetItemListOrBuilder {
            private int bitField0_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{25920, 25921, 25922, 25923, 25924, 25925, 25926, 25927, 25928, 25929, 25930, 25931, 25932, 25933, 25934, 25935, 25936, 25937, 25938, 25939, 25940, 25941, 25942, 25943, 25944, 25945, 25946, 25947, 25948, 25949, 25950, 25951, 25952, 25953, 25954, 25955});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3669build();

            public final native CSGetItemList m3670build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3671buildPartial();

            public final native CSGetItemList m3672buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3673clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3674clear();

            public final native Builder m3675clear();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3676clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3677clone();

            public final native Builder m3678clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3679getDefaultInstanceForType();

            public final native CSGetItemList m3680getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getUuid();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3681mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3682mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3683mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3684mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3685mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetItemList cSGetItemList);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpTransaction.f252i;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{14533, 14534, 14535, 14536, 14537, 14538, 14539, 14540, 14541, 14542, 14543, 14544, 14545, 14546, 14547, 14548, 14549, 14550, 14551, 14552, 14553, 14554, 14555, 14556, 14557, 14558});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetItemList(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetItemList(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetItemList cSGetItemList);

        private native CSGetItemList(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetItemList(com.google.protobuf.GeneratedMessage.Builder builder, CSGetItemList cSGetItemList);

        private native CSGetItemList(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3662getDefaultInstanceForType();

        public final native CSGetItemList m3663getDefaultInstanceForType();

        public final native Parser<CSGetItemList> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3664newBuilderForType();

        public final native Builder m3665newBuilderForType();

        protected final native Builder m3666newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3667toBuilder();

        public final native Builder m3668toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetItemList getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpTransaction.f252i;
        }

        static void __clinit__() {
            PARSER = new C02801();
            CSGetItemList cSGetItemList = new CSGetItemList(true);
            defaultInstance = cSGetItemList;
            cSGetItemList.initFields();
        }

        public static CSGetItemList parseFrom(ByteString byteString) {
            return (CSGetItemList) PARSER.parseFrom(byteString);
        }

        public static CSGetItemList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetItemList) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetItemList parseFrom(byte[] bArr) {
            return (CSGetItemList) PARSER.parseFrom(bArr);
        }

        public static CSGetItemList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetItemList) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetItemList parseFrom(InputStream inputStream) {
            return (CSGetItemList) PARSER.parseFrom(inputStream);
        }

        public static CSGetItemList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetItemList) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetItemList parseDelimitedFrom(InputStream inputStream) {
            return (CSGetItemList) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetItemList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetItemList) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetItemList parseFrom(CodedInputStream codedInputStream) {
            return (CSGetItemList) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetItemList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetItemList) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetItemList cSGetItemList) {
            return newBuilder().mergeFrom(cSGetItemList);
        }
    }

    public interface CSGetSellingItemListOrBuilder extends MessageOrBuilder {
        int getIGetType();

        long getUuid();

        boolean hasIGetType();

        boolean hasUuid();
    }

    public static final class CSGetSellingItemList extends GeneratedMessage implements CSGetSellingItemListOrBuilder {
        public static final int IGETTYPE_FIELD_NUMBER = 2;
        public static Parser<CSGetSellingItemList> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetSellingItemList defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int iGetType_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpTransaction.CSGetSellingItemList.1 */
        class C02811 extends AbstractParser<CSGetSellingItemList> {
            static {
                fixHelper.fixfunc(new int[]{25096, 25097});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02811();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetSellingItemListOrBuilder {
            private int bitField0_;
            private int iGetType_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{22742, 22743, 22744, 22745, 22746, 22747, 22748, 22749, 22750, 22751, 22752, 22753, 22754, 22755, 22756, 22757, 22758, 22759, 22760, 22761, 22762, 22763, 22764, 22765, 22766, 22767, 22768, 22769, 22770, 22771, 22772, 22773, 22774, 22775, 22776, 22777, 22778, 22779, 22780, 22781});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3693build();

            public final native CSGetSellingItemList m3694build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3695buildPartial();

            public final native CSGetSellingItemList m3696buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3697clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3698clear();

            public final native Builder m3699clear();

            public final native Builder clearIGetType();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3700clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3701clone();

            public final native Builder m3702clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3703getDefaultInstanceForType();

            public final native CSGetSellingItemList m3704getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getIGetType();

            public final native long getUuid();

            public final native boolean hasIGetType();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3705mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3706mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3707mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3708mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3709mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetSellingItemList cSGetSellingItemList);

            public final native Builder setIGetType(int i);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpTransaction.f264u;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{18029, 18030, 18031, 18032, 18033, 18034, 18035, 18036, 18037, 18038, 18039, 18040, 18041, 18042, 18043, 18044, 18045, 18046, 18047, 18048, 18049, 18050, 18051, 18052, 18053, 18054, 18055, 18056});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetSellingItemList(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetSellingItemList(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetSellingItemList cSGetSellingItemList);

        private native CSGetSellingItemList(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetSellingItemList(com.google.protobuf.GeneratedMessage.Builder builder, CSGetSellingItemList cSGetSellingItemList);

        private native CSGetSellingItemList(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3686getDefaultInstanceForType();

        public final native CSGetSellingItemList m3687getDefaultInstanceForType();

        public final native int getIGetType();

        public final native Parser<CSGetSellingItemList> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasIGetType();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3688newBuilderForType();

        public final native Builder m3689newBuilderForType();

        protected final native Builder m3690newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3691toBuilder();

        public final native Builder m3692toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetSellingItemList getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpTransaction.f264u;
        }

        static void __clinit__() {
            PARSER = new C02811();
            CSGetSellingItemList cSGetSellingItemList = new CSGetSellingItemList(true);
            defaultInstance = cSGetSellingItemList;
            cSGetSellingItemList.initFields();
        }

        public static CSGetSellingItemList parseFrom(ByteString byteString) {
            return (CSGetSellingItemList) PARSER.parseFrom(byteString);
        }

        public static CSGetSellingItemList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetSellingItemList) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetSellingItemList parseFrom(byte[] bArr) {
            return (CSGetSellingItemList) PARSER.parseFrom(bArr);
        }

        public static CSGetSellingItemList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetSellingItemList) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetSellingItemList parseFrom(InputStream inputStream) {
            return (CSGetSellingItemList) PARSER.parseFrom(inputStream);
        }

        public static CSGetSellingItemList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetSellingItemList) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetSellingItemList parseDelimitedFrom(InputStream inputStream) {
            return (CSGetSellingItemList) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetSellingItemList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetSellingItemList) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetSellingItemList parseFrom(CodedInputStream codedInputStream) {
            return (CSGetSellingItemList) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetSellingItemList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetSellingItemList) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetSellingItemList cSGetSellingItemList) {
            return newBuilder().mergeFrom(cSGetSellingItemList);
        }
    }

    public interface CSPreBuyCoinAndroidOrBuilder extends MessageOrBuilder {
        int getICoinStoreItemID();

        int getIMobleSystem();

        long getUuid();

        boolean hasICoinStoreItemID();

        boolean hasIMobleSystem();

        boolean hasUuid();
    }

    public static final class CSPreBuyCoinAndroid extends GeneratedMessage implements CSPreBuyCoinAndroidOrBuilder {
        public static final int ICOINSTOREITEMID_FIELD_NUMBER = 2;
        public static final int IMOBLESYSTEM_FIELD_NUMBER = 3;
        public static Parser<CSPreBuyCoinAndroid> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSPreBuyCoinAndroid defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int iCoinStoreItemID_;
        private int iMobleSystem_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpTransaction.CSPreBuyCoinAndroid.1 */
        class C02821 extends AbstractParser<CSPreBuyCoinAndroid> {
            static {
                fixHelper.fixfunc(new int[]{21107, 21108});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02821();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSPreBuyCoinAndroidOrBuilder {
            private int bitField0_;
            private int iCoinStoreItemID_;
            private int iMobleSystem_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{30056, 30057, 30058, 30059, 30060, 30061, 30062, 30063, 30064, 30065, 30066, 30067, 30068, 30069, 30070, 30071, 30072, 30073, 30074, 30075, 30076, 30077, 30078, 30079, 30080, 30081, 30082, 30083, 30084, 30085, 30086, 30087, 30088, 30089, 30090, 30091, 30092, 30093, 30094, 30095, 30096, 30097, 30098, 30099});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3717build();

            public final native CSPreBuyCoinAndroid m3718build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3719buildPartial();

            public final native CSPreBuyCoinAndroid m3720buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3721clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3722clear();

            public final native Builder m3723clear();

            public final native Builder clearICoinStoreItemID();

            public final native Builder clearIMobleSystem();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3724clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3725clone();

            public final native Builder m3726clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3727getDefaultInstanceForType();

            public final native CSPreBuyCoinAndroid m3728getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getICoinStoreItemID();

            public final native int getIMobleSystem();

            public final native long getUuid();

            public final native boolean hasICoinStoreItemID();

            public final native boolean hasIMobleSystem();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3729mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3730mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3731mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3732mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3733mergeFrom(Message message);

            public final native Builder mergeFrom(CSPreBuyCoinAndroid cSPreBuyCoinAndroid);

            public final native Builder setICoinStoreItemID(int i);

            public final native Builder setIMobleSystem(int i);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpTransaction.f235K;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{21111, 21112, 21113, 21114, 21115, 21116, 21117, 21118, 21119, 21120, 21121, 21122, 21123, 21124, 21125, 21126, 21127, 21128, 21129, 21130, 21131, 21132, 21133, 21134, 21135, 21136, 21137, 21138, 21139, 21140});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSPreBuyCoinAndroid(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSPreBuyCoinAndroid(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSPreBuyCoinAndroid cSPreBuyCoinAndroid);

        private native CSPreBuyCoinAndroid(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSPreBuyCoinAndroid(com.google.protobuf.GeneratedMessage.Builder builder, CSPreBuyCoinAndroid cSPreBuyCoinAndroid);

        private native CSPreBuyCoinAndroid(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3710getDefaultInstanceForType();

        public final native CSPreBuyCoinAndroid m3711getDefaultInstanceForType();

        public final native int getICoinStoreItemID();

        public final native int getIMobleSystem();

        public final native Parser<CSPreBuyCoinAndroid> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasICoinStoreItemID();

        public final native boolean hasIMobleSystem();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3712newBuilderForType();

        public final native Builder m3713newBuilderForType();

        protected final native Builder m3714newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3715toBuilder();

        public final native Builder m3716toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSPreBuyCoinAndroid getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpTransaction.f235K;
        }

        static void __clinit__() {
            PARSER = new C02821();
            CSPreBuyCoinAndroid cSPreBuyCoinAndroid = new CSPreBuyCoinAndroid(true);
            defaultInstance = cSPreBuyCoinAndroid;
            cSPreBuyCoinAndroid.initFields();
        }

        public static CSPreBuyCoinAndroid parseFrom(ByteString byteString) {
            return (CSPreBuyCoinAndroid) PARSER.parseFrom(byteString);
        }

        public static CSPreBuyCoinAndroid parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSPreBuyCoinAndroid) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSPreBuyCoinAndroid parseFrom(byte[] bArr) {
            return (CSPreBuyCoinAndroid) PARSER.parseFrom(bArr);
        }

        public static CSPreBuyCoinAndroid parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSPreBuyCoinAndroid) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSPreBuyCoinAndroid parseFrom(InputStream inputStream) {
            return (CSPreBuyCoinAndroid) PARSER.parseFrom(inputStream);
        }

        public static CSPreBuyCoinAndroid parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSPreBuyCoinAndroid) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSPreBuyCoinAndroid parseDelimitedFrom(InputStream inputStream) {
            return (CSPreBuyCoinAndroid) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSPreBuyCoinAndroid parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSPreBuyCoinAndroid) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSPreBuyCoinAndroid parseFrom(CodedInputStream codedInputStream) {
            return (CSPreBuyCoinAndroid) PARSER.parseFrom(codedInputStream);
        }

        public static CSPreBuyCoinAndroid parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSPreBuyCoinAndroid) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSPreBuyCoinAndroid cSPreBuyCoinAndroid) {
            return newBuilder().mergeFrom(cSPreBuyCoinAndroid);
        }
    }

    public interface CoinStoreItemInfoOrBuilder extends MessageOrBuilder {
        ITEM_TYPE getECoinStoreItemType();

        int getICoinStoreItemCost();

        int getICoinStoreItemID();

        String getSAdditionalInfo();

        ByteString getSAdditionalInfoBytes();

        String getSCoinStoreItemDescription();

        ByteString getSCoinStoreItemDescriptionBytes();

        String getSCoinStoreItemIcon();

        ByteString getSCoinStoreItemIconBytes();

        String getSCoinStoreItemName();

        ByteString getSCoinStoreItemNameBytes();

        String getSDisplayPrice();

        ByteString getSDisplayPriceBytes();

        String getSProductID();

        ByteString getSProductIDBytes();

        boolean hasECoinStoreItemType();

        boolean hasICoinStoreItemCost();

        boolean hasICoinStoreItemID();

        boolean hasSAdditionalInfo();

        boolean hasSCoinStoreItemDescription();

        boolean hasSCoinStoreItemIcon();

        boolean hasSCoinStoreItemName();

        boolean hasSDisplayPrice();

        boolean hasSProductID();
    }

    public static final class CoinStoreItemInfo extends GeneratedMessage implements CoinStoreItemInfoOrBuilder {
        public static final int ECOINSTOREITEMTYPE_FIELD_NUMBER = 7;
        public static final int ICOINSTOREITEMCOST_FIELD_NUMBER = 4;
        public static final int ICOINSTOREITEMID_FIELD_NUMBER = 1;
        public static Parser<CoinStoreItemInfo> PARSER = null;
        public static final int SADDITIONALINFO_FIELD_NUMBER = 6;
        public static final int SCOINSTOREITEMDESCRIPTION_FIELD_NUMBER = 5;
        public static final int SCOINSTOREITEMICON_FIELD_NUMBER = 3;
        public static final int SCOINSTOREITEMNAME_FIELD_NUMBER = 2;
        public static final int SDISPLAYPRICE_FIELD_NUMBER = 9;
        public static final int SPRODUCTID_FIELD_NUMBER = 8;
        private static final CoinStoreItemInfo defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ITEM_TYPE eCoinStoreItemType_;
        private int iCoinStoreItemCost_;
        private int iCoinStoreItemID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sAdditionalInfo_;
        private Object sCoinStoreItemDescription_;
        private Object sCoinStoreItemIcon_;
        private Object sCoinStoreItemName_;
        private Object sDisplayPrice_;
        private Object sProductID_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpTransaction.CoinStoreItemInfo.1 */
        class C02831 extends AbstractParser<CoinStoreItemInfo> {
            static {
                fixHelper.fixfunc(new int[]{23120, 23121});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02831();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CoinStoreItemInfoOrBuilder {
            private int bitField0_;
            private ITEM_TYPE eCoinStoreItemType_;
            private int iCoinStoreItemCost_;
            private int iCoinStoreItemID_;
            private Object sAdditionalInfo_;
            private Object sCoinStoreItemDescription_;
            private Object sCoinStoreItemIcon_;
            private Object sCoinStoreItemName_;
            private Object sDisplayPrice_;
            private Object sProductID_;

            static {
                fixHelper.fixfunc(new int[]{34005, 34006, 34007, 34008, 34009, 34010, 34011, 34012, 34013, 34014, 34015, 34016, 34017, 34018, 34019, 34020, 34021, 34022, 34023, 34024, 34025, 34026, 34027, 34028, 34029, 34030, 34031, 34032, 34033, 34034, 34035, 34036, 34037, 34038, 34039, 34040, 34041, 34042, 34043, 34044, 34045, 34046, 34047, 34048, 34049, 34050, 34051, 34052, 34053, 34054, 34055, 34056, 34057, 34058, 34059, 34060, 34061, 34062, 34063, 34064, 34065, 34066, 34067, 34068, 34069, 34070, 34071, 34072, 34073, 34074, 34075, 34076, 34077, 34078, 34079, 34080, 34081, 34082, 34083, 34084});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3741build();

            public final native CoinStoreItemInfo m3742build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3743buildPartial();

            public final native CoinStoreItemInfo m3744buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3745clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3746clear();

            public final native Builder m3747clear();

            public final native Builder clearECoinStoreItemType();

            public final native Builder clearICoinStoreItemCost();

            public final native Builder clearICoinStoreItemID();

            public final native Builder clearSAdditionalInfo();

            public final native Builder clearSCoinStoreItemDescription();

            public final native Builder clearSCoinStoreItemIcon();

            public final native Builder clearSCoinStoreItemName();

            public final native Builder clearSDisplayPrice();

            public final native Builder clearSProductID();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3748clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3749clone();

            public final native Builder m3750clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3751getDefaultInstanceForType();

            public final native CoinStoreItemInfo m3752getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ITEM_TYPE getECoinStoreItemType();

            public final native int getICoinStoreItemCost();

            public final native int getICoinStoreItemID();

            public final native String getSAdditionalInfo();

            public final native ByteString getSAdditionalInfoBytes();

            public final native String getSCoinStoreItemDescription();

            public final native ByteString getSCoinStoreItemDescriptionBytes();

            public final native String getSCoinStoreItemIcon();

            public final native ByteString getSCoinStoreItemIconBytes();

            public final native String getSCoinStoreItemName();

            public final native ByteString getSCoinStoreItemNameBytes();

            public final native String getSDisplayPrice();

            public final native ByteString getSDisplayPriceBytes();

            public final native String getSProductID();

            public final native ByteString getSProductIDBytes();

            public final native boolean hasECoinStoreItemType();

            public final native boolean hasICoinStoreItemCost();

            public final native boolean hasICoinStoreItemID();

            public final native boolean hasSAdditionalInfo();

            public final native boolean hasSCoinStoreItemDescription();

            public final native boolean hasSCoinStoreItemIcon();

            public final native boolean hasSCoinStoreItemName();

            public final native boolean hasSDisplayPrice();

            public final native boolean hasSProductID();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3753mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3754mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3755mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3756mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3757mergeFrom(Message message);

            public final native Builder mergeFrom(CoinStoreItemInfo coinStoreItemInfo);

            public final native Builder setECoinStoreItemType(ITEM_TYPE item_type);

            public final native Builder setICoinStoreItemCost(int i);

            public final native Builder setICoinStoreItemID(int i);

            public final native Builder setSAdditionalInfo(String str);

            public final native Builder setSAdditionalInfoBytes(ByteString byteString);

            public final native Builder setSCoinStoreItemDescription(String str);

            public final native Builder setSCoinStoreItemDescriptionBytes(ByteString byteString);

            public final native Builder setSCoinStoreItemIcon(String str);

            public final native Builder setSCoinStoreItemIconBytes(ByteString byteString);

            public final native Builder setSCoinStoreItemName(String str);

            public final native Builder setSCoinStoreItemNameBytes(ByteString byteString);

            public final native Builder setSDisplayPrice(String str);

            public final native Builder setSDisplayPriceBytes(ByteString byteString);

            public final native Builder setSProductID(String str);

            public final native Builder setSProductIDBytes(ByteString byteString);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpTransaction.f256m;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{16138, 16139, 16140, 16141, 16142, 16143, 16144, 16145, 16146, 16147, 16148, 16149, 16150, 16151, 16152, 16153, 16154, 16155, 16156, 16157, 16158, 16159, 16160, 16161, 16162, 16163, 16164, 16165, 16166, 16167, 16168, 16169, 16170, 16171, 16172, 16173, 16174, 16175, 16176, 16177, 16178, 16179, 16180, 16181, 16182, 16183, 16184, 16185});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CoinStoreItemInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CoinStoreItemInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CoinStoreItemInfo coinStoreItemInfo);

        private native CoinStoreItemInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CoinStoreItemInfo(com.google.protobuf.GeneratedMessage.Builder builder, CoinStoreItemInfo coinStoreItemInfo);

        private native CoinStoreItemInfo(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3734getDefaultInstanceForType();

        public final native CoinStoreItemInfo m3735getDefaultInstanceForType();

        public final native ITEM_TYPE getECoinStoreItemType();

        public final native int getICoinStoreItemCost();

        public final native int getICoinStoreItemID();

        public final native Parser<CoinStoreItemInfo> getParserForType();

        public final native String getSAdditionalInfo();

        public final native ByteString getSAdditionalInfoBytes();

        public final native String getSCoinStoreItemDescription();

        public final native ByteString getSCoinStoreItemDescriptionBytes();

        public final native String getSCoinStoreItemIcon();

        public final native ByteString getSCoinStoreItemIconBytes();

        public final native String getSCoinStoreItemName();

        public final native ByteString getSCoinStoreItemNameBytes();

        public final native String getSDisplayPrice();

        public final native ByteString getSDisplayPriceBytes();

        public final native String getSProductID();

        public final native ByteString getSProductIDBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasECoinStoreItemType();

        public final native boolean hasICoinStoreItemCost();

        public final native boolean hasICoinStoreItemID();

        public final native boolean hasSAdditionalInfo();

        public final native boolean hasSCoinStoreItemDescription();

        public final native boolean hasSCoinStoreItemIcon();

        public final native boolean hasSCoinStoreItemName();

        public final native boolean hasSDisplayPrice();

        public final native boolean hasSProductID();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3736newBuilderForType();

        public final native Builder m3737newBuilderForType();

        protected final native Builder m3738newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3739toBuilder();

        public final native Builder m3740toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CoinStoreItemInfo getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpTransaction.f256m;
        }

        static void __clinit__() {
            PARSER = new C02831();
            CoinStoreItemInfo coinStoreItemInfo = new CoinStoreItemInfo(true);
            defaultInstance = coinStoreItemInfo;
            coinStoreItemInfo.initFields();
        }

        public static CoinStoreItemInfo parseFrom(ByteString byteString) {
            return (CoinStoreItemInfo) PARSER.parseFrom(byteString);
        }

        public static CoinStoreItemInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CoinStoreItemInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CoinStoreItemInfo parseFrom(byte[] bArr) {
            return (CoinStoreItemInfo) PARSER.parseFrom(bArr);
        }

        public static CoinStoreItemInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CoinStoreItemInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CoinStoreItemInfo parseFrom(InputStream inputStream) {
            return (CoinStoreItemInfo) PARSER.parseFrom(inputStream);
        }

        public static CoinStoreItemInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CoinStoreItemInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CoinStoreItemInfo parseDelimitedFrom(InputStream inputStream) {
            return (CoinStoreItemInfo) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CoinStoreItemInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CoinStoreItemInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CoinStoreItemInfo parseFrom(CodedInputStream codedInputStream) {
            return (CoinStoreItemInfo) PARSER.parseFrom(codedInputStream);
        }

        public static CoinStoreItemInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CoinStoreItemInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CoinStoreItemInfo coinStoreItemInfo) {
            return newBuilder().mergeFrom(coinStoreItemInfo);
        }
    }

    public enum ITEM_TYPE implements ProtocolMessageEnum {
        ;
        
        public static final int ITEM_TYPE_CHEAP_VALUE = 3;
        public static final int ITEM_TYPE_HOT_VALUE = 1;
        public static final int ITEM_TYPE_NEW_VALUE = 2;
        public static final int ITEM_TYPE_NORMAL_VALUE = 0;
        private static final ITEM_TYPE[] VALUES = null;
        private static EnumLiteMap<ITEM_TYPE> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpTransaction.ITEM_TYPE.1 */
        class C02841 implements EnumLiteMap<ITEM_TYPE> {
            static {
                fixHelper.fixfunc(new int[]{12712, 12713});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02841();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{6877, 6878, 6879, 6880});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native ITEM_TYPE(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            ITEM_TYPE_HOT = new ITEM_TYPE("ITEM_TYPE_HOT", 0, 0, ITEM_TYPE_HOT_VALUE);
            ITEM_TYPE_NEW = new ITEM_TYPE("ITEM_TYPE_NEW", ITEM_TYPE_HOT_VALUE, ITEM_TYPE_HOT_VALUE, ITEM_TYPE_NEW_VALUE);
            ITEM_TYPE_CHEAP = new ITEM_TYPE("ITEM_TYPE_CHEAP", ITEM_TYPE_NEW_VALUE, ITEM_TYPE_NEW_VALUE, ITEM_TYPE_CHEAP_VALUE);
            ITEM_TYPE_NORMAL = new ITEM_TYPE("ITEM_TYPE_NORMAL", ITEM_TYPE_CHEAP_VALUE, ITEM_TYPE_CHEAP_VALUE, 0);
            ENUM$VALUES = new ITEM_TYPE[]{ITEM_TYPE_HOT, ITEM_TYPE_NEW, ITEM_TYPE_CHEAP, ITEM_TYPE_NORMAL};
            internalValueMap = new C02841();
            VALUES = values();
        }

        public static ITEM_TYPE valueOf(int i) {
            switch (i) {
                case LocationAwareLogger.TRACE_INT /*0*/:
                    return ITEM_TYPE_NORMAL;
                case ITEM_TYPE_HOT_VALUE:
                    return ITEM_TYPE_HOT;
                case ITEM_TYPE_NEW_VALUE:
                    return ITEM_TYPE_NEW;
                case ITEM_TYPE_CHEAP_VALUE:
                    return ITEM_TYPE_CHEAP;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<ITEM_TYPE> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerHttpTransaction.m250a().getEnumTypes().get(ITEM_TYPE_CHEAP_VALUE);
        }

        public static ITEM_TYPE valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum ORDER_TYPE implements ProtocolMessageEnum {
        ;
        
        public static final int ORDER_TYPE_ADDED_VALUE = 3;
        public static final int ORDER_TYPE_ORDERED_VALUE = 1;
        public static final int ORDER_TYPE_PAIDED_VALUE = 2;
        private static final ORDER_TYPE[] VALUES = null;
        private static EnumLiteMap<ORDER_TYPE> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpTransaction.ORDER_TYPE.1 */
        class C02851 implements EnumLiteMap<ORDER_TYPE> {
            static {
                fixHelper.fixfunc(new int[]{19347, 19348});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02851();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{13844, 13845, 13846, 13847});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native ORDER_TYPE(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            ORDER_TYPE_ORDERED = new ORDER_TYPE("ORDER_TYPE_ORDERED", 0, 0, ORDER_TYPE_ORDERED_VALUE);
            ORDER_TYPE_PAIDED = new ORDER_TYPE("ORDER_TYPE_PAIDED", ORDER_TYPE_ORDERED_VALUE, ORDER_TYPE_ORDERED_VALUE, ORDER_TYPE_PAIDED_VALUE);
            ORDER_TYPE_ADDED = new ORDER_TYPE("ORDER_TYPE_ADDED", ORDER_TYPE_PAIDED_VALUE, ORDER_TYPE_PAIDED_VALUE, ORDER_TYPE_ADDED_VALUE);
            ORDER_TYPE[] order_typeArr = new ORDER_TYPE[ORDER_TYPE_ADDED_VALUE];
            order_typeArr[0] = ORDER_TYPE_ORDERED;
            order_typeArr[ORDER_TYPE_ORDERED_VALUE] = ORDER_TYPE_PAIDED;
            order_typeArr[ORDER_TYPE_PAIDED_VALUE] = ORDER_TYPE_ADDED;
            ENUM$VALUES = order_typeArr;
            internalValueMap = new C02851();
            VALUES = values();
        }

        public static ORDER_TYPE valueOf(int i) {
            switch (i) {
                case ORDER_TYPE_ORDERED_VALUE:
                    return ORDER_TYPE_ORDERED;
                case ORDER_TYPE_PAIDED_VALUE:
                    return ORDER_TYPE_PAIDED;
                case ORDER_TYPE_ADDED_VALUE:
                    return ORDER_TYPE_ADDED;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<ORDER_TYPE> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerHttpTransaction.m250a().getEnumTypes().get(ORDER_TYPE_PAIDED_VALUE);
        }

        public static ORDER_TYPE valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum PAYMENT_TYPE implements ProtocolMessageEnum {
        ;
        
        public static final int PAYMENT_TYPE_WEIXIN_VALUE = 1;
        public static final int PAYMENT_TYPE_ZHIFUBAO_VALUE = 2;
        private static final PAYMENT_TYPE[] VALUES = null;
        private static EnumLiteMap<PAYMENT_TYPE> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpTransaction.PAYMENT_TYPE.1 */
        class C02861 implements EnumLiteMap<PAYMENT_TYPE> {
            static {
                fixHelper.fixfunc(new int[]{14660, 14661});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02861();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{8156, 8157, 8158, 8159});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native PAYMENT_TYPE(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            PAYMENT_TYPE_WEIXIN = new PAYMENT_TYPE("PAYMENT_TYPE_WEIXIN", 0, 0, PAYMENT_TYPE_WEIXIN_VALUE);
            PAYMENT_TYPE_ZHIFUBAO = new PAYMENT_TYPE("PAYMENT_TYPE_ZHIFUBAO", PAYMENT_TYPE_WEIXIN_VALUE, PAYMENT_TYPE_WEIXIN_VALUE, PAYMENT_TYPE_ZHIFUBAO_VALUE);
            PAYMENT_TYPE[] payment_typeArr = new PAYMENT_TYPE[PAYMENT_TYPE_ZHIFUBAO_VALUE];
            payment_typeArr[0] = PAYMENT_TYPE_WEIXIN;
            payment_typeArr[PAYMENT_TYPE_WEIXIN_VALUE] = PAYMENT_TYPE_ZHIFUBAO;
            ENUM$VALUES = payment_typeArr;
            internalValueMap = new C02861();
            VALUES = values();
        }

        public static PAYMENT_TYPE valueOf(int i) {
            switch (i) {
                case PAYMENT_TYPE_WEIXIN_VALUE:
                    return PAYMENT_TYPE_WEIXIN;
                case PAYMENT_TYPE_ZHIFUBAO_VALUE:
                    return PAYMENT_TYPE_ZHIFUBAO;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<PAYMENT_TYPE> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerHttpTransaction.m250a().getEnumTypes().get(PAYMENT_TYPE_WEIXIN_VALUE);
        }

        public static PAYMENT_TYPE valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public interface SCAdminAddClubFundRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        ClubBaseInfo getStClubBaseInfo();

        ClubBaseInfoOrBuilder getStClubBaseInfoOrBuilder();

        boolean hasEErrCode();

        boolean hasStClubBaseInfo();
    }

    public static final class SCAdminAddClubFundRsp extends GeneratedMessage implements SCAdminAddClubFundRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCAdminAddClubFundRsp> PARSER = null;
        public static final int STCLUBBASEINFO_FIELD_NUMBER = 2;
        private static final SCAdminAddClubFundRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private ClubBaseInfo stClubBaseInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpTransaction.SCAdminAddClubFundRsp.1 */
        class C02871 extends AbstractParser<SCAdminAddClubFundRsp> {
            static {
                fixHelper.fixfunc(new int[]{30157, 30158});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02871();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCAdminAddClubFundRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private SingleFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> stClubBaseInfoBuilder_;
            private ClubBaseInfo stClubBaseInfo_;

            static {
                fixHelper.fixfunc(new int[]{25172, 25173, 25174, 25175, 25176, 25177, 25178, 25179, 25180, 25181, 25182, 25183, 25184, 25185, 25186, 25187, 25188, 25189, 25190, 25191, 25192, 25193, 25194, 25195, 25196, 25197, 25198, 25199, 25200, 25201, 25202, 25203, 25204, 25205, 25206, 25207, 25208, 25209, 25210, 25211, 25212, 25213, 25214, 25215, 25216});
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

            public final native /* bridge */ /* synthetic */ MessageLite m3765build();

            public final native SCAdminAddClubFundRsp m3766build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3767buildPartial();

            public final native SCAdminAddClubFundRsp m3768buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3769clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3770clear();

            public final native Builder m3771clear();

            public final native Builder clearEErrCode();

            public final native Builder clearStClubBaseInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3772clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3773clone();

            public final native Builder m3774clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3775getDefaultInstanceForType();

            public final native SCAdminAddClubFundRsp m3776getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native ClubBaseInfo getStClubBaseInfo();

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder getStClubBaseInfoBuilder();

            public final native ClubBaseInfoOrBuilder getStClubBaseInfoOrBuilder();

            public final native boolean hasEErrCode();

            public final native boolean hasStClubBaseInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3777mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3778mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3779mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3780mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3781mergeFrom(Message message);

            public final native Builder mergeFrom(SCAdminAddClubFundRsp sCAdminAddClubFundRsp);

            public final native Builder mergeStClubBaseInfo(ClubBaseInfo clubBaseInfo);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setStClubBaseInfo(com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder setStClubBaseInfo(ClubBaseInfo clubBaseInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpTransaction.f229E;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{24276, 24277, 24278, 24279, 24280, 24281, 24282, 24283, 24284, 24285, 24286, 24287, 24288, 24289, 24290, 24291, 24292, 24293, 24294, 24295, 24296, 24297, 24298, 24299, 24300, 24301, 24302, 24303, 24304});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCAdminAddClubFundRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCAdminAddClubFundRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCAdminAddClubFundRsp sCAdminAddClubFundRsp);

        private native SCAdminAddClubFundRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCAdminAddClubFundRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCAdminAddClubFundRsp sCAdminAddClubFundRsp);

        private native SCAdminAddClubFundRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3758getDefaultInstanceForType();

        public final native SCAdminAddClubFundRsp m3759getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCAdminAddClubFundRsp> getParserForType();

        public final native int getSerializedSize();

        public final native ClubBaseInfo getStClubBaseInfo();

        public final native ClubBaseInfoOrBuilder getStClubBaseInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasStClubBaseInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3760newBuilderForType();

        public final native Builder m3761newBuilderForType();

        protected final native Builder m3762newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3763toBuilder();

        public final native Builder m3764toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCAdminAddClubFundRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpTransaction.f229E;
        }

        static void __clinit__() {
            PARSER = new C02871();
            SCAdminAddClubFundRsp sCAdminAddClubFundRsp = new SCAdminAddClubFundRsp(true);
            defaultInstance = sCAdminAddClubFundRsp;
            sCAdminAddClubFundRsp.initFields();
        }

        public static SCAdminAddClubFundRsp parseFrom(ByteString byteString) {
            return (SCAdminAddClubFundRsp) PARSER.parseFrom(byteString);
        }

        public static SCAdminAddClubFundRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCAdminAddClubFundRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCAdminAddClubFundRsp parseFrom(byte[] bArr) {
            return (SCAdminAddClubFundRsp) PARSER.parseFrom(bArr);
        }

        public static SCAdminAddClubFundRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCAdminAddClubFundRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCAdminAddClubFundRsp parseFrom(InputStream inputStream) {
            return (SCAdminAddClubFundRsp) PARSER.parseFrom(inputStream);
        }

        public static SCAdminAddClubFundRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCAdminAddClubFundRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCAdminAddClubFundRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCAdminAddClubFundRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCAdminAddClubFundRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCAdminAddClubFundRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCAdminAddClubFundRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCAdminAddClubFundRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCAdminAddClubFundRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCAdminAddClubFundRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCAdminAddClubFundRsp sCAdminAddClubFundRsp) {
            return newBuilder().mergeFrom(sCAdminAddClubFundRsp);
        }
    }

    public interface SCAdminAddCoinRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        boolean hasEErrCode();
    }

    public static final class SCAdminAddCoinRsp extends GeneratedMessage implements SCAdminAddCoinRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCAdminAddCoinRsp> PARSER;
        private static final SCAdminAddCoinRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpTransaction.SCAdminAddCoinRsp.1 */
        class C02881 extends AbstractParser<SCAdminAddCoinRsp> {
            static {
                fixHelper.fixfunc(new int[]{26809, 26810});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02881();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCAdminAddCoinRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;

            static {
                fixHelper.fixfunc(new int[]{21254, 21255, 21256, 21257, 21258, 21259, 21260, 21261, 21262, 21263, 21264, 21265, 21266, 21267, 21268, 21269, 21270, 21271, 21272, 21273, 21274, 21275, 21276, 21277, 21278, 21279, 21280, 21281, 21282, 21283, 21284, 21285, 21286, 21287, 21288, 21289});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3789build();

            public final native SCAdminAddCoinRsp m3790build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3791buildPartial();

            public final native SCAdminAddCoinRsp m3792buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3793clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3794clear();

            public final native Builder m3795clear();

            public final native Builder clearEErrCode();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3796clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3797clone();

            public final native Builder m3798clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3799getDefaultInstanceForType();

            public final native SCAdminAddCoinRsp m3800getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native boolean hasEErrCode();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3801mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3802mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3803mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3804mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3805mergeFrom(Message message);

            public final native Builder mergeFrom(SCAdminAddCoinRsp sCAdminAddCoinRsp);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpTransaction.f225A;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{16567, 16568, 16569, 16570, 16571, 16572, 16573, 16574, 16575, 16576, 16577, 16578, 16579, 16580, 16581, 16582, 16583, 16584, 16585, 16586, 16587, 16588, 16589, 16590, 16591, 16592});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCAdminAddCoinRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCAdminAddCoinRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCAdminAddCoinRsp sCAdminAddCoinRsp);

        private native SCAdminAddCoinRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCAdminAddCoinRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCAdminAddCoinRsp sCAdminAddCoinRsp);

        private native SCAdminAddCoinRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3782getDefaultInstanceForType();

        public final native SCAdminAddCoinRsp m3783getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCAdminAddCoinRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3784newBuilderForType();

        public final native Builder m3785newBuilderForType();

        protected final native Builder m3786newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3787toBuilder();

        public final native Builder m3788toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCAdminAddCoinRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpTransaction.f225A;
        }

        static void __clinit__() {
            PARSER = new C02881();
            SCAdminAddCoinRsp sCAdminAddCoinRsp = new SCAdminAddCoinRsp(true);
            defaultInstance = sCAdminAddCoinRsp;
            sCAdminAddCoinRsp.initFields();
        }

        public static SCAdminAddCoinRsp parseFrom(ByteString byteString) {
            return (SCAdminAddCoinRsp) PARSER.parseFrom(byteString);
        }

        public static SCAdminAddCoinRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCAdminAddCoinRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCAdminAddCoinRsp parseFrom(byte[] bArr) {
            return (SCAdminAddCoinRsp) PARSER.parseFrom(bArr);
        }

        public static SCAdminAddCoinRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCAdminAddCoinRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCAdminAddCoinRsp parseFrom(InputStream inputStream) {
            return (SCAdminAddCoinRsp) PARSER.parseFrom(inputStream);
        }

        public static SCAdminAddCoinRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCAdminAddCoinRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCAdminAddCoinRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCAdminAddCoinRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCAdminAddCoinRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCAdminAddCoinRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCAdminAddCoinRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCAdminAddCoinRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCAdminAddCoinRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCAdminAddCoinRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCAdminAddCoinRsp sCAdminAddCoinRsp) {
            return newBuilder().mergeFrom(sCAdminAddCoinRsp);
        }
    }

    public interface SCBuyCoinAndroidRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        ORDER_TYPE getEOrderType();

        long getLCoin();

        long getLOrderID();

        boolean hasEErrCode();

        boolean hasEOrderType();

        boolean hasLCoin();

        boolean hasLOrderID();
    }

    public static final class SCBuyCoinAndroidRsp extends GeneratedMessage implements SCBuyCoinAndroidRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int EORDERTYPE_FIELD_NUMBER = 2;
        public static final int LCOIN_FIELD_NUMBER = 3;
        public static final int LORDERID_FIELD_NUMBER = 4;
        public static Parser<SCBuyCoinAndroidRsp> PARSER;
        private static final SCBuyCoinAndroidRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private ORDER_TYPE eOrderType_;
        private long lCoin_;
        private long lOrderID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpTransaction.SCBuyCoinAndroidRsp.1 */
        class C02891 extends AbstractParser<SCBuyCoinAndroidRsp> {
            static {
                fixHelper.fixfunc(new int[]{26486, 26487});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02891();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCBuyCoinAndroidRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private ORDER_TYPE eOrderType_;
            private long lCoin_;
            private long lOrderID_;

            static {
                fixHelper.fixfunc(new int[]{24919, 24920, 24921, 24922, 24923, 24924, 24925, 24926, 24927, 24928, 24929, 24930, 24931, 24932, 24933, 24934, 24935, 24936, 24937, 24938, 24939, 24940, 24941, 24942, 24943, 24944, 24945, 24946, 24947, 24948, 24949, 24950, 24951, 24952, 24953, 24954, 24955, 24956, 24957, 24958, 24959, 24960, 24961, 24962, 24963, 24964, 24965, 24966});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3813build();

            public final native SCBuyCoinAndroidRsp m3814build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3815buildPartial();

            public final native SCBuyCoinAndroidRsp m3816buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3817clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3818clear();

            public final native Builder m3819clear();

            public final native Builder clearEErrCode();

            public final native Builder clearEOrderType();

            public final native Builder clearLCoin();

            public final native Builder clearLOrderID();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3820clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3821clone();

            public final native Builder m3822clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3823getDefaultInstanceForType();

            public final native SCBuyCoinAndroidRsp m3824getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native ORDER_TYPE getEOrderType();

            public final native long getLCoin();

            public final native long getLOrderID();

            public final native boolean hasEErrCode();

            public final native boolean hasEOrderType();

            public final native boolean hasLCoin();

            public final native boolean hasLOrderID();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3825mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3826mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3827mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3828mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3829mergeFrom(Message message);

            public final native Builder mergeFrom(SCBuyCoinAndroidRsp sCBuyCoinAndroidRsp);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setEOrderType(ORDER_TYPE order_type);

            public final native Builder setLCoin(long j);

            public final native Builder setLOrderID(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpTransaction.f241Q;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{9025, 9026, 9027, 9028, 9029, 9030, 9031, 9032, 9033, 9034, 9035, 9036, 9037, 9038, 9039, 9040, 9041, 9042, 9043, 9044, 9045, 9046, 9047, 9048, 9049, 9050, 9051, 9052, 9053, 9054, 9055, 9056});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCBuyCoinAndroidRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCBuyCoinAndroidRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCBuyCoinAndroidRsp sCBuyCoinAndroidRsp);

        private native SCBuyCoinAndroidRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCBuyCoinAndroidRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCBuyCoinAndroidRsp sCBuyCoinAndroidRsp);

        private native SCBuyCoinAndroidRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3806getDefaultInstanceForType();

        public final native SCBuyCoinAndroidRsp m3807getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native ORDER_TYPE getEOrderType();

        public final native long getLCoin();

        public final native long getLOrderID();

        public final native Parser<SCBuyCoinAndroidRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasEOrderType();

        public final native boolean hasLCoin();

        public final native boolean hasLOrderID();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3808newBuilderForType();

        public final native Builder m3809newBuilderForType();

        protected final native Builder m3810newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3811toBuilder();

        public final native Builder m3812toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCBuyCoinAndroidRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpTransaction.f241Q;
        }

        static void __clinit__() {
            PARSER = new C02891();
            SCBuyCoinAndroidRsp sCBuyCoinAndroidRsp = new SCBuyCoinAndroidRsp(true);
            defaultInstance = sCBuyCoinAndroidRsp;
            sCBuyCoinAndroidRsp.initFields();
        }

        public static SCBuyCoinAndroidRsp parseFrom(ByteString byteString) {
            return (SCBuyCoinAndroidRsp) PARSER.parseFrom(byteString);
        }

        public static SCBuyCoinAndroidRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCBuyCoinAndroidRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCBuyCoinAndroidRsp parseFrom(byte[] bArr) {
            return (SCBuyCoinAndroidRsp) PARSER.parseFrom(bArr);
        }

        public static SCBuyCoinAndroidRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCBuyCoinAndroidRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCBuyCoinAndroidRsp parseFrom(InputStream inputStream) {
            return (SCBuyCoinAndroidRsp) PARSER.parseFrom(inputStream);
        }

        public static SCBuyCoinAndroidRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCBuyCoinAndroidRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCBuyCoinAndroidRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCBuyCoinAndroidRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCBuyCoinAndroidRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCBuyCoinAndroidRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCBuyCoinAndroidRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCBuyCoinAndroidRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCBuyCoinAndroidRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCBuyCoinAndroidRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCBuyCoinAndroidRsp sCBuyCoinAndroidRsp) {
            return newBuilder().mergeFrom(sCBuyCoinAndroidRsp);
        }
    }

    public interface SCBuyCoinRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        long getLCoin();

        boolean hasEErrCode();

        boolean hasLCoin();
    }

    public static final class SCBuyCoinRsp extends GeneratedMessage implements SCBuyCoinRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int LCOIN_FIELD_NUMBER = 2;
        public static Parser<SCBuyCoinRsp> PARSER;
        private static final SCBuyCoinRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lCoin_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpTransaction.SCBuyCoinRsp.1 */
        class C02901 extends AbstractParser<SCBuyCoinRsp> {
            static {
                fixHelper.fixfunc(new int[]{10040, 10041});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02901();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCBuyCoinRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private long lCoin_;

            static {
                fixHelper.fixfunc(new int[]{31939, 31940, 31941, 31942, 31943, 31944, 31945, 31946, 31947, 31948, 31949, 31950, 31951, 31952, 31953, 31954, 31955, 31956, 31957, 31958, 31959, 31960, 31961, 31962, 31963, 31964, 31965, 31966, 31967, 31968, 31969, 31970, 31971, 31972, 31973, 31974, 31975, 31976, 31977, 31978});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3837build();

            public final native SCBuyCoinRsp m3838build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3839buildPartial();

            public final native SCBuyCoinRsp m3840buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3841clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3842clear();

            public final native Builder m3843clear();

            public final native Builder clearEErrCode();

            public final native Builder clearLCoin();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3844clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3845clone();

            public final native Builder m3846clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3847getDefaultInstanceForType();

            public final native SCBuyCoinRsp m3848getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native long getLCoin();

            public final native boolean hasEErrCode();

            public final native boolean hasLCoin();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3849mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3850mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3851mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3852mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3853mergeFrom(Message message);

            public final native Builder mergeFrom(SCBuyCoinRsp sCBuyCoinRsp);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setLCoin(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpTransaction.f246c;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{27892, 27893, 27894, 27895, 27896, 27897, 27898, 27899, 27900, 27901, 27902, 27903, 27904, 27905, 27906, 27907, 27908, 27909, 27910, 27911, 27912, 27913, 27914, 27915, 27916, 27917, 27918, 27919});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCBuyCoinRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCBuyCoinRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCBuyCoinRsp sCBuyCoinRsp);

        private native SCBuyCoinRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCBuyCoinRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCBuyCoinRsp sCBuyCoinRsp);

        private native SCBuyCoinRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3830getDefaultInstanceForType();

        public final native SCBuyCoinRsp m3831getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLCoin();

        public final native Parser<SCBuyCoinRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasLCoin();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3832newBuilderForType();

        public final native Builder m3833newBuilderForType();

        protected final native Builder m3834newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3835toBuilder();

        public final native Builder m3836toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCBuyCoinRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpTransaction.f246c;
        }

        static void __clinit__() {
            PARSER = new C02901();
            SCBuyCoinRsp sCBuyCoinRsp = new SCBuyCoinRsp(true);
            defaultInstance = sCBuyCoinRsp;
            sCBuyCoinRsp.initFields();
        }

        public static SCBuyCoinRsp parseFrom(ByteString byteString) {
            return (SCBuyCoinRsp) PARSER.parseFrom(byteString);
        }

        public static SCBuyCoinRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCBuyCoinRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCBuyCoinRsp parseFrom(byte[] bArr) {
            return (SCBuyCoinRsp) PARSER.parseFrom(bArr);
        }

        public static SCBuyCoinRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCBuyCoinRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCBuyCoinRsp parseFrom(InputStream inputStream) {
            return (SCBuyCoinRsp) PARSER.parseFrom(inputStream);
        }

        public static SCBuyCoinRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCBuyCoinRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCBuyCoinRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCBuyCoinRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCBuyCoinRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCBuyCoinRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCBuyCoinRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCBuyCoinRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCBuyCoinRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCBuyCoinRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCBuyCoinRsp sCBuyCoinRsp) {
            return newBuilder().mergeFrom(sCBuyCoinRsp);
        }
    }

    public interface SCBuySellingItemRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        int getIMaxClubNums();

        int getIMaxLevel();

        UserBaseInfoNet getStUserBaseInfo();

        UserBaseInfoNetOrBuilder getStUserBaseInfoOrBuilder();

        GameItemInfo getVItemsList(int i);

        int getVItemsListCount();

        List<GameItemInfo> getVItemsListList();

        GameItemInfoOrBuilder getVItemsListOrBuilder(int i);

        List<? extends GameItemInfoOrBuilder> getVItemsListOrBuilderList();

        boolean hasEErrCode();

        boolean hasIMaxClubNums();

        boolean hasIMaxLevel();

        boolean hasStUserBaseInfo();
    }

    public static final class SCBuySellingItemRsp extends GeneratedMessage implements SCBuySellingItemRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int IMAXCLUBNUMS_FIELD_NUMBER = 5;
        public static final int IMAXLEVEL_FIELD_NUMBER = 4;
        public static Parser<SCBuySellingItemRsp> PARSER = null;
        public static final int STUSERBASEINFO_FIELD_NUMBER = 3;
        public static final int VITEMSLIST_FIELD_NUMBER = 2;
        private static final SCBuySellingItemRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private int iMaxClubNums_;
        private int iMaxLevel_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private UserBaseInfoNet stUserBaseInfo_;
        private final UnknownFieldSet unknownFields;
        private List<GameItemInfo> vItemsList_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpTransaction.SCBuySellingItemRsp.1 */
        class C02911 extends AbstractParser<SCBuySellingItemRsp> {
            static {
                fixHelper.fixfunc(new int[]{7936, 7937});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02911();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCBuySellingItemRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private int iMaxClubNums_;
            private int iMaxLevel_;
            private SingleFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> stUserBaseInfoBuilder_;
            private UserBaseInfoNet stUserBaseInfo_;
            private RepeatedFieldBuilder<GameItemInfo, com.texaspoker.moment.TexasPokerCommon.GameItemInfo.Builder, GameItemInfoOrBuilder> vItemsListBuilder_;
            private List<GameItemInfo> vItemsList_;

            static {
                fixHelper.fixfunc(new int[]{33442, 33443, 33444, 33445, 33446, 33447, 33448, 33449, 33450, 33451, 33452, 33453, 33454, 33455, 33456, 33457, 33458, 33459, 33460, 33461, 33462, 33463, 33464, 33465, 33466, 33467, 33468, 33469, 33470, 33471, 33472, 33473, 33474, 33475, 33476, 33477, 33478, 33479, 33480, 33481, 33482, 33483, 33484, 33485, 33486, 33487, 33488, 33489, 33490, 33491, 33492, 33493, 33494, 33495, 33496, 33497, 33498, 33499, 33500, 33501, 33502, 33503, 33504, 33505, 33506, 33507, 33508, 33509, 33510, 33511, 33512, 33513, 33514});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVItemsListIsMutable();

            private native SingleFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> getStUserBaseInfoFieldBuilder();

            private native RepeatedFieldBuilder<GameItemInfo, com.texaspoker.moment.TexasPokerCommon.GameItemInfo.Builder, GameItemInfoOrBuilder> getVItemsListFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVItemsList(Iterable<? extends GameItemInfo> iterable);

            public final native Builder addVItemsList(int i, com.texaspoker.moment.TexasPokerCommon.GameItemInfo.Builder builder);

            public final native Builder addVItemsList(int i, GameItemInfo gameItemInfo);

            public final native Builder addVItemsList(com.texaspoker.moment.TexasPokerCommon.GameItemInfo.Builder builder);

            public final native Builder addVItemsList(GameItemInfo gameItemInfo);

            public final native com.texaspoker.moment.TexasPokerCommon.GameItemInfo.Builder addVItemsListBuilder();

            public final native com.texaspoker.moment.TexasPokerCommon.GameItemInfo.Builder addVItemsListBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3861build();

            public final native SCBuySellingItemRsp m3862build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3863buildPartial();

            public final native SCBuySellingItemRsp m3864buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3865clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3866clear();

            public final native Builder m3867clear();

            public final native Builder clearEErrCode();

            public final native Builder clearIMaxClubNums();

            public final native Builder clearIMaxLevel();

            public final native Builder clearStUserBaseInfo();

            public final native Builder clearVItemsList();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3868clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3869clone();

            public final native Builder m3870clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3871getDefaultInstanceForType();

            public final native SCBuySellingItemRsp m3872getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native int getIMaxClubNums();

            public final native int getIMaxLevel();

            public final native UserBaseInfoNet getStUserBaseInfo();

            public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder getStUserBaseInfoBuilder();

            public final native UserBaseInfoNetOrBuilder getStUserBaseInfoOrBuilder();

            public final native GameItemInfo getVItemsList(int i);

            public final native com.texaspoker.moment.TexasPokerCommon.GameItemInfo.Builder getVItemsListBuilder(int i);

            public final native List<com.texaspoker.moment.TexasPokerCommon.GameItemInfo.Builder> getVItemsListBuilderList();

            public final native int getVItemsListCount();

            public final native List<GameItemInfo> getVItemsListList();

            public final native GameItemInfoOrBuilder getVItemsListOrBuilder(int i);

            public final native List<? extends GameItemInfoOrBuilder> getVItemsListOrBuilderList();

            public final native boolean hasEErrCode();

            public final native boolean hasIMaxClubNums();

            public final native boolean hasIMaxLevel();

            public final native boolean hasStUserBaseInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3873mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3874mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3875mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3876mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3877mergeFrom(Message message);

            public final native Builder mergeFrom(SCBuySellingItemRsp sCBuySellingItemRsp);

            public final native Builder mergeStUserBaseInfo(UserBaseInfoNet userBaseInfoNet);

            public final native Builder removeVItemsList(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setIMaxClubNums(int i);

            public final native Builder setIMaxLevel(int i);

            public final native Builder setStUserBaseInfo(com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

            public final native Builder setStUserBaseInfo(UserBaseInfoNet userBaseInfoNet);

            public final native Builder setVItemsList(int i, com.texaspoker.moment.TexasPokerCommon.GameItemInfo.Builder builder);

            public final native Builder setVItemsList(int i, GameItemInfo gameItemInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpTransaction.f250g;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{24779, 24780, 24781, 24782, 24783, 24784, 24785, 24786, 24787, 24788, 24789, 24790, 24791, 24792, 24793, 24794, 24795, 24796, 24797, 24798, 24799, 24800, 24801, 24802, 24803, 24804, 24805, 24806, 24807, 24808, 24809, 24810, 24811, 24812, 24813, 24814, 24815, 24816});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCBuySellingItemRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCBuySellingItemRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCBuySellingItemRsp sCBuySellingItemRsp);

        private native SCBuySellingItemRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCBuySellingItemRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCBuySellingItemRsp sCBuySellingItemRsp);

        private native SCBuySellingItemRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3854getDefaultInstanceForType();

        public final native SCBuySellingItemRsp m3855getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native int getIMaxClubNums();

        public final native int getIMaxLevel();

        public final native Parser<SCBuySellingItemRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UserBaseInfoNet getStUserBaseInfo();

        public final native UserBaseInfoNetOrBuilder getStUserBaseInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native GameItemInfo getVItemsList(int i);

        public final native int getVItemsListCount();

        public final native List<GameItemInfo> getVItemsListList();

        public final native GameItemInfoOrBuilder getVItemsListOrBuilder(int i);

        public final native List<? extends GameItemInfoOrBuilder> getVItemsListOrBuilderList();

        public final native boolean hasEErrCode();

        public final native boolean hasIMaxClubNums();

        public final native boolean hasIMaxLevel();

        public final native boolean hasStUserBaseInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3856newBuilderForType();

        public final native Builder m3857newBuilderForType();

        protected final native Builder m3858newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3859toBuilder();

        public final native Builder m3860toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCBuySellingItemRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpTransaction.f250g;
        }

        static void __clinit__() {
            PARSER = new C02911();
            SCBuySellingItemRsp sCBuySellingItemRsp = new SCBuySellingItemRsp(true);
            defaultInstance = sCBuySellingItemRsp;
            sCBuySellingItemRsp.initFields();
        }

        public static SCBuySellingItemRsp parseFrom(ByteString byteString) {
            return (SCBuySellingItemRsp) PARSER.parseFrom(byteString);
        }

        public static SCBuySellingItemRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCBuySellingItemRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCBuySellingItemRsp parseFrom(byte[] bArr) {
            return (SCBuySellingItemRsp) PARSER.parseFrom(bArr);
        }

        public static SCBuySellingItemRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCBuySellingItemRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCBuySellingItemRsp parseFrom(InputStream inputStream) {
            return (SCBuySellingItemRsp) PARSER.parseFrom(inputStream);
        }

        public static SCBuySellingItemRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCBuySellingItemRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCBuySellingItemRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCBuySellingItemRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCBuySellingItemRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCBuySellingItemRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCBuySellingItemRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCBuySellingItemRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCBuySellingItemRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCBuySellingItemRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCBuySellingItemRsp sCBuySellingItemRsp) {
            return newBuilder().mergeFrom(sCBuySellingItemRsp);
        }
    }

    public interface SCGetCoinStoreListRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        CoinStoreItemInfo getVCoinItemsList(int i);

        int getVCoinItemsListCount();

        List<CoinStoreItemInfo> getVCoinItemsListList();

        CoinStoreItemInfoOrBuilder getVCoinItemsListOrBuilder(int i);

        List<? extends CoinStoreItemInfoOrBuilder> getVCoinItemsListOrBuilderList();

        boolean hasEErrCode();
    }

    public static final class SCGetCoinStoreListRsp extends GeneratedMessage implements SCGetCoinStoreListRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCGetCoinStoreListRsp> PARSER = null;
        public static final int VCOINITEMSLIST_FIELD_NUMBER = 2;
        private static final SCGetCoinStoreListRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private List<CoinStoreItemInfo> vCoinItemsList_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpTransaction.SCGetCoinStoreListRsp.1 */
        class C02921 extends AbstractParser<SCGetCoinStoreListRsp> {
            static {
                fixHelper.fixfunc(new int[]{23893, 23894});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02921();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetCoinStoreListRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private RepeatedFieldBuilder<CoinStoreItemInfo, Builder, CoinStoreItemInfoOrBuilder> vCoinItemsListBuilder_;
            private List<CoinStoreItemInfo> vCoinItemsList_;

            static {
                fixHelper.fixfunc(new int[]{10451, 10452, 10453, 10454, 10455, 10456, 10457, 10458, 10459, 10460, 10461, 10462, 10463, 10464, 10465, 10466, 10467, 10468, 10469, 10470, 10471, 10472, 10473, 10474, 10475, 10476, 10477, 10478, 10479, 10480, 10481, 10482, 10483, 10484, 10485, 10486, 10487, 10488, 10489, 10490, 10491, 10492, 10493, 10494, 10495, 10496, 10497, 10498, 10499, 10500, 10501, 10502, 10503, 10504, 10505, 10506});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVCoinItemsListIsMutable();

            private native RepeatedFieldBuilder<CoinStoreItemInfo, Builder, CoinStoreItemInfoOrBuilder> getVCoinItemsListFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVCoinItemsList(Iterable<? extends CoinStoreItemInfo> iterable);

            public final native Builder addVCoinItemsList(int i, Builder builder);

            public final native Builder addVCoinItemsList(int i, CoinStoreItemInfo coinStoreItemInfo);

            public final native Builder addVCoinItemsList(Builder builder);

            public final native Builder addVCoinItemsList(CoinStoreItemInfo coinStoreItemInfo);

            public final native Builder addVCoinItemsListBuilder();

            public final native Builder addVCoinItemsListBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3885build();

            public final native SCGetCoinStoreListRsp m3886build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3887buildPartial();

            public final native SCGetCoinStoreListRsp m3888buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3889clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3890clear();

            public final native Builder m3891clear();

            public final native Builder clearEErrCode();

            public final native Builder clearVCoinItemsList();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3892clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3893clone();

            public final native Builder m3894clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3895getDefaultInstanceForType();

            public final native SCGetCoinStoreListRsp m3896getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native CoinStoreItemInfo getVCoinItemsList(int i);

            public final native Builder getVCoinItemsListBuilder(int i);

            public final native List<Builder> getVCoinItemsListBuilderList();

            public final native int getVCoinItemsListCount();

            public final native List<CoinStoreItemInfo> getVCoinItemsListList();

            public final native CoinStoreItemInfoOrBuilder getVCoinItemsListOrBuilder(int i);

            public final native List<? extends CoinStoreItemInfoOrBuilder> getVCoinItemsListOrBuilderList();

            public final native boolean hasEErrCode();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3897mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3898mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3899mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3900mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3901mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetCoinStoreListRsp sCGetCoinStoreListRsp);

            public final native Builder removeVCoinItemsList(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setVCoinItemsList(int i, Builder builder);

            public final native Builder setVCoinItemsList(int i, CoinStoreItemInfo coinStoreItemInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpTransaction.f262s;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{20426, 20427, 20428, 20429, 20430, 20431, 20432, 20433, 20434, 20435, 20436, 20437, 20438, 20439, 20440, 20441, 20442, 20443, 20444, 20445, 20446, 20447, 20448, 20449, 20450, 20451, 20452, 20453, 20454, 20455, 20456});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetCoinStoreListRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetCoinStoreListRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetCoinStoreListRsp sCGetCoinStoreListRsp);

        private native SCGetCoinStoreListRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetCoinStoreListRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetCoinStoreListRsp sCGetCoinStoreListRsp);

        private native SCGetCoinStoreListRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3878getDefaultInstanceForType();

        public final native SCGetCoinStoreListRsp m3879getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCGetCoinStoreListRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native CoinStoreItemInfo getVCoinItemsList(int i);

        public final native int getVCoinItemsListCount();

        public final native List<CoinStoreItemInfo> getVCoinItemsListList();

        public final native CoinStoreItemInfoOrBuilder getVCoinItemsListOrBuilder(int i);

        public final native List<? extends CoinStoreItemInfoOrBuilder> getVCoinItemsListOrBuilderList();

        public final native boolean hasEErrCode();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3880newBuilderForType();

        public final native Builder m3881newBuilderForType();

        protected final native Builder m3882newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3883toBuilder();

        public final native Builder m3884toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetCoinStoreListRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpTransaction.f262s;
        }

        static void __clinit__() {
            PARSER = new C02921();
            SCGetCoinStoreListRsp sCGetCoinStoreListRsp = new SCGetCoinStoreListRsp(true);
            defaultInstance = sCGetCoinStoreListRsp;
            sCGetCoinStoreListRsp.initFields();
        }

        public static SCGetCoinStoreListRsp parseFrom(ByteString byteString) {
            return (SCGetCoinStoreListRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetCoinStoreListRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetCoinStoreListRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetCoinStoreListRsp parseFrom(byte[] bArr) {
            return (SCGetCoinStoreListRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetCoinStoreListRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetCoinStoreListRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetCoinStoreListRsp parseFrom(InputStream inputStream) {
            return (SCGetCoinStoreListRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetCoinStoreListRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetCoinStoreListRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetCoinStoreListRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetCoinStoreListRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetCoinStoreListRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetCoinStoreListRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetCoinStoreListRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetCoinStoreListRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetCoinStoreListRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetCoinStoreListRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetCoinStoreListRsp sCGetCoinStoreListRsp) {
            return newBuilder().mergeFrom(sCGetCoinStoreListRsp);
        }
    }

    public interface SCGetItemListRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        GameItemInfo getVItemsList(int i);

        int getVItemsListCount();

        List<GameItemInfo> getVItemsListList();

        GameItemInfoOrBuilder getVItemsListOrBuilder(int i);

        List<? extends GameItemInfoOrBuilder> getVItemsListOrBuilderList();

        boolean hasEErrCode();
    }

    public static final class SCGetItemListRsp extends GeneratedMessage implements SCGetItemListRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCGetItemListRsp> PARSER = null;
        public static final int VITEMSLIST_FIELD_NUMBER = 2;
        private static final SCGetItemListRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private List<GameItemInfo> vItemsList_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpTransaction.SCGetItemListRsp.1 */
        class C02931 extends AbstractParser<SCGetItemListRsp> {
            static {
                fixHelper.fixfunc(new int[]{11961, 11962});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02931();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetItemListRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private RepeatedFieldBuilder<GameItemInfo, com.texaspoker.moment.TexasPokerCommon.GameItemInfo.Builder, GameItemInfoOrBuilder> vItemsListBuilder_;
            private List<GameItemInfo> vItemsList_;

            static {
                fixHelper.fixfunc(new int[]{10882, 10883, 10884, 10885, 10886, 10887, 10888, 10889, 10890, 10891, 10892, 10893, 10894, 10895, 10896, 10897, 10898, 10899, 10900, 10901, 10902, 10903, 10904, 10905, 10906, 10907, 10908, 10909, 10910, 10911, 10912, 10913, 10914, 10915, 10916, 10917, 10918, 10919, 10920, 10921, 10922, 10923, 10924, 10925, 10926, 10927, 10928, 10929, 10930, 10931, 10932, 10933, 10934, 10935, 10936, 10937});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVItemsListIsMutable();

            private native RepeatedFieldBuilder<GameItemInfo, com.texaspoker.moment.TexasPokerCommon.GameItemInfo.Builder, GameItemInfoOrBuilder> getVItemsListFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVItemsList(Iterable<? extends GameItemInfo> iterable);

            public final native Builder addVItemsList(int i, com.texaspoker.moment.TexasPokerCommon.GameItemInfo.Builder builder);

            public final native Builder addVItemsList(int i, GameItemInfo gameItemInfo);

            public final native Builder addVItemsList(com.texaspoker.moment.TexasPokerCommon.GameItemInfo.Builder builder);

            public final native Builder addVItemsList(GameItemInfo gameItemInfo);

            public final native com.texaspoker.moment.TexasPokerCommon.GameItemInfo.Builder addVItemsListBuilder();

            public final native com.texaspoker.moment.TexasPokerCommon.GameItemInfo.Builder addVItemsListBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3909build();

            public final native SCGetItemListRsp m3910build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3911buildPartial();

            public final native SCGetItemListRsp m3912buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3913clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3914clear();

            public final native Builder m3915clear();

            public final native Builder clearEErrCode();

            public final native Builder clearVItemsList();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3916clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3917clone();

            public final native Builder m4320clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4321getDefaultInstanceForType();

            public final native SCGetItemListRsp m4322getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native GameItemInfo getVItemsList(int i);

            public final native com.texaspoker.moment.TexasPokerCommon.GameItemInfo.Builder getVItemsListBuilder(int i);

            public final native List<com.texaspoker.moment.TexasPokerCommon.GameItemInfo.Builder> getVItemsListBuilderList();

            public final native int getVItemsListCount();

            public final native List<GameItemInfo> getVItemsListList();

            public final native GameItemInfoOrBuilder getVItemsListOrBuilder(int i);

            public final native List<? extends GameItemInfoOrBuilder> getVItemsListOrBuilderList();

            public final native boolean hasEErrCode();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4323mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4324mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4325mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4326mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4327mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetItemListRsp sCGetItemListRsp);

            public final native Builder removeVItemsList(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setVItemsList(int i, com.texaspoker.moment.TexasPokerCommon.GameItemInfo.Builder builder);

            public final native Builder setVItemsList(int i, GameItemInfo gameItemInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpTransaction.f254k;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{31256, 31257, 31258, 31259, 31260, 31261, 31262, 31263, 31264, 31265, 31266, 31267, 31268, 31269, 31270, 31271, 31272, 31273, 31274, 31275, 31276, 31277, 31278, 31279, 31280, 31281, 31282, 31283, 31284, 31285, 31286});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetItemListRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetItemListRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetItemListRsp sCGetItemListRsp);

        private native SCGetItemListRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetItemListRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetItemListRsp sCGetItemListRsp);

        private native SCGetItemListRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3902getDefaultInstanceForType();

        public final native SCGetItemListRsp m3903getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCGetItemListRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native GameItemInfo getVItemsList(int i);

        public final native int getVItemsListCount();

        public final native List<GameItemInfo> getVItemsListList();

        public final native GameItemInfoOrBuilder getVItemsListOrBuilder(int i);

        public final native List<? extends GameItemInfoOrBuilder> getVItemsListOrBuilderList();

        public final native boolean hasEErrCode();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3904newBuilderForType();

        public final native Builder m3905newBuilderForType();

        protected final native Builder m3906newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3907toBuilder();

        public final native Builder m3908toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetItemListRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpTransaction.f254k;
        }

        static void __clinit__() {
            PARSER = new C02931();
            SCGetItemListRsp sCGetItemListRsp = new SCGetItemListRsp(true);
            defaultInstance = sCGetItemListRsp;
            sCGetItemListRsp.initFields();
        }

        public static SCGetItemListRsp parseFrom(ByteString byteString) {
            return (SCGetItemListRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetItemListRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetItemListRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetItemListRsp parseFrom(byte[] bArr) {
            return (SCGetItemListRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetItemListRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetItemListRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetItemListRsp parseFrom(InputStream inputStream) {
            return (SCGetItemListRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetItemListRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetItemListRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetItemListRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetItemListRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetItemListRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetItemListRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetItemListRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetItemListRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetItemListRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetItemListRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetItemListRsp sCGetItemListRsp) {
            return newBuilder().mergeFrom(sCGetItemListRsp);
        }
    }

    public interface SCGetSellingItemListRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        int getIGetType();

        SellingItemInfo getVSellingItemList(int i);

        int getVSellingItemListCount();

        List<SellingItemInfo> getVSellingItemListList();

        SellingItemInfoOrBuilder getVSellingItemListOrBuilder(int i);

        List<? extends SellingItemInfoOrBuilder> getVSellingItemListOrBuilderList();

        boolean hasEErrCode();

        boolean hasIGetType();
    }

    public static final class SCGetSellingItemListRsp extends GeneratedMessage implements SCGetSellingItemListRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int IGETTYPE_FIELD_NUMBER = 2;
        public static Parser<SCGetSellingItemListRsp> PARSER = null;
        public static final int VSELLINGITEMLIST_FIELD_NUMBER = 3;
        private static final SCGetSellingItemListRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private int iGetType_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private List<SellingItemInfo> vSellingItemList_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpTransaction.SCGetSellingItemListRsp.1 */
        class C02941 extends AbstractParser<SCGetSellingItemListRsp> {
            static {
                fixHelper.fixfunc(new int[]{20384, 20385});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02941();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetSellingItemListRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private int iGetType_;
            private RepeatedFieldBuilder<SellingItemInfo, Builder, SellingItemInfoOrBuilder> vSellingItemListBuilder_;
            private List<SellingItemInfo> vSellingItemList_;

            static {
                fixHelper.fixfunc(new int[]{33896, 33897, 33898, 33899, 33900, 33901, 33902, 33903, 33904, 33905, 33906, 33907, 33908, 33909, 33910, 33911, 33912, 33913, 33914, 33915, 33916, 33917, 33918, 33919, 33920, 33921, 33922, 33923, 33924, 33925, 33926, 33927, 33928, 33929, 33930, 33931, 33932, 33933, 33934, 33935, 33936, 33937, 33938, 33939, 33940, 33941, 33942, 33943, 33944, 33945, 33946, 33947, 33948, 33949, 33950, 33951, 33952, 33953, 33954, 33955});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVSellingItemListIsMutable();

            private native RepeatedFieldBuilder<SellingItemInfo, Builder, SellingItemInfoOrBuilder> getVSellingItemListFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVSellingItemList(Iterable<? extends SellingItemInfo> iterable);

            public final native Builder addVSellingItemList(int i, Builder builder);

            public final native Builder addVSellingItemList(int i, SellingItemInfo sellingItemInfo);

            public final native Builder addVSellingItemList(Builder builder);

            public final native Builder addVSellingItemList(SellingItemInfo sellingItemInfo);

            public final native Builder addVSellingItemListBuilder();

            public final native Builder addVSellingItemListBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4335build();

            public final native SCGetSellingItemListRsp m4336build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4337buildPartial();

            public final native SCGetSellingItemListRsp m4338buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4339clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4340clear();

            public final native Builder m4341clear();

            public final native Builder clearEErrCode();

            public final native Builder clearIGetType();

            public final native Builder clearVSellingItemList();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4342clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4343clone();

            public final native Builder m4344clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4345getDefaultInstanceForType();

            public final native SCGetSellingItemListRsp m4346getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native int getIGetType();

            public final native SellingItemInfo getVSellingItemList(int i);

            public final native Builder getVSellingItemListBuilder(int i);

            public final native List<Builder> getVSellingItemListBuilderList();

            public final native int getVSellingItemListCount();

            public final native List<SellingItemInfo> getVSellingItemListList();

            public final native SellingItemInfoOrBuilder getVSellingItemListOrBuilder(int i);

            public final native List<? extends SellingItemInfoOrBuilder> getVSellingItemListOrBuilderList();

            public final native boolean hasEErrCode();

            public final native boolean hasIGetType();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4347mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4348mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4349mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4350mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4351mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetSellingItemListRsp sCGetSellingItemListRsp);

            public final native Builder removeVSellingItemList(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setIGetType(int i);

            public final native Builder setVSellingItemList(int i, Builder builder);

            public final native Builder setVSellingItemList(int i, SellingItemInfo sellingItemInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpTransaction.f266w;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{8439, 8440, 8441, 8442, 8443, 8444, 8445, 8446, 8447, 8448, 8449, 8450, 8451, 8452, 8453, 8454, 8455, 8456, 8457, 8458, 8459, 8460, 8461, 8462, 8463, 8464, 8465, 8466, 8467, 8468, 8469, 8470, 8471});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetSellingItemListRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetSellingItemListRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetSellingItemListRsp sCGetSellingItemListRsp);

        private native SCGetSellingItemListRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetSellingItemListRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetSellingItemListRsp sCGetSellingItemListRsp);

        private native SCGetSellingItemListRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4328getDefaultInstanceForType();

        public final native SCGetSellingItemListRsp m4329getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native int getIGetType();

        public final native Parser<SCGetSellingItemListRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native SellingItemInfo getVSellingItemList(int i);

        public final native int getVSellingItemListCount();

        public final native List<SellingItemInfo> getVSellingItemListList();

        public final native SellingItemInfoOrBuilder getVSellingItemListOrBuilder(int i);

        public final native List<? extends SellingItemInfoOrBuilder> getVSellingItemListOrBuilderList();

        public final native boolean hasEErrCode();

        public final native boolean hasIGetType();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4330newBuilderForType();

        public final native Builder m4331newBuilderForType();

        protected final native Builder m4332newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4333toBuilder();

        public final native Builder m4334toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetSellingItemListRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpTransaction.f266w;
        }

        static void __clinit__() {
            PARSER = new C02941();
            SCGetSellingItemListRsp sCGetSellingItemListRsp = new SCGetSellingItemListRsp(true);
            defaultInstance = sCGetSellingItemListRsp;
            sCGetSellingItemListRsp.initFields();
        }

        public static SCGetSellingItemListRsp parseFrom(ByteString byteString) {
            return (SCGetSellingItemListRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetSellingItemListRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetSellingItemListRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetSellingItemListRsp parseFrom(byte[] bArr) {
            return (SCGetSellingItemListRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetSellingItemListRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetSellingItemListRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetSellingItemListRsp parseFrom(InputStream inputStream) {
            return (SCGetSellingItemListRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetSellingItemListRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetSellingItemListRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetSellingItemListRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetSellingItemListRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetSellingItemListRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetSellingItemListRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetSellingItemListRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetSellingItemListRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetSellingItemListRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetSellingItemListRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetSellingItemListRsp sCGetSellingItemListRsp) {
            return newBuilder().mergeFrom(sCGetSellingItemListRsp);
        }
    }

    public interface SCPreBuyCoinAndroidRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        AndroidOrderInfo getStAndroidOrderInfo();

        AndroidOrderInfoOrBuilder getStAndroidOrderInfoOrBuilder();

        boolean hasEErrCode();

        boolean hasStAndroidOrderInfo();
    }

    public static final class SCPreBuyCoinAndroidRsp extends GeneratedMessage implements SCPreBuyCoinAndroidRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCPreBuyCoinAndroidRsp> PARSER = null;
        public static final int STANDROIDORDERINFO_FIELD_NUMBER = 2;
        private static final SCPreBuyCoinAndroidRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private AndroidOrderInfo stAndroidOrderInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpTransaction.SCPreBuyCoinAndroidRsp.1 */
        class C02951 extends AbstractParser<SCPreBuyCoinAndroidRsp> {
            static {
                fixHelper.fixfunc(new int[]{13997, 13998});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02951();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCPreBuyCoinAndroidRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private SingleFieldBuilder<AndroidOrderInfo, Builder, AndroidOrderInfoOrBuilder> stAndroidOrderInfoBuilder_;
            private AndroidOrderInfo stAndroidOrderInfo_;

            static {
                fixHelper.fixfunc(new int[]{19578, 19579, 19580, 19581, 19582, 19583, 19584, 19585, 19586, 19587, 19588, 19589, 19590, 19591, 19592, 19593, 19594, 19595, 19596, 19597, 19598, 19599, 19600, 19601, 19602, 19603, 19604, 19605, 19606, 19607, 19608, 19609, 19610, 19611, 19612, 19613, 19614, 19615, 19616, 19617, 19618, 19619, 19620, 19621, 19622});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<AndroidOrderInfo, Builder, AndroidOrderInfoOrBuilder> getStAndroidOrderInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4359build();

            public final native SCPreBuyCoinAndroidRsp m4360build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4361buildPartial();

            public final native SCPreBuyCoinAndroidRsp m4362buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4363clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4364clear();

            public final native Builder m4365clear();

            public final native Builder clearEErrCode();

            public final native Builder clearStAndroidOrderInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4366clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4367clone();

            public final native Builder m4368clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4369getDefaultInstanceForType();

            public final native SCPreBuyCoinAndroidRsp m4370getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native AndroidOrderInfo getStAndroidOrderInfo();

            public final native Builder getStAndroidOrderInfoBuilder();

            public final native AndroidOrderInfoOrBuilder getStAndroidOrderInfoOrBuilder();

            public final native boolean hasEErrCode();

            public final native boolean hasStAndroidOrderInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4371mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4372mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4373mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4374mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4375mergeFrom(Message message);

            public final native Builder mergeFrom(SCPreBuyCoinAndroidRsp sCPreBuyCoinAndroidRsp);

            public final native Builder mergeStAndroidOrderInfo(AndroidOrderInfo androidOrderInfo);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setStAndroidOrderInfo(Builder builder);

            public final native Builder setStAndroidOrderInfo(AndroidOrderInfo androidOrderInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpTransaction.f237M;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{11475, 11476, 11477, 11478, 11479, 11480, 11481, 11482, 11483, 11484, 11485, 11486, 11487, 11488, 11489, 11490, 11491, 11492, 11493, 11494, 11495, 11496, 11497, 11498, 11499, 11500, 11501, 11502, 11503});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCPreBuyCoinAndroidRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCPreBuyCoinAndroidRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCPreBuyCoinAndroidRsp sCPreBuyCoinAndroidRsp);

        private native SCPreBuyCoinAndroidRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCPreBuyCoinAndroidRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCPreBuyCoinAndroidRsp sCPreBuyCoinAndroidRsp);

        private native SCPreBuyCoinAndroidRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4352getDefaultInstanceForType();

        public final native SCPreBuyCoinAndroidRsp m4353getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCPreBuyCoinAndroidRsp> getParserForType();

        public final native int getSerializedSize();

        public final native AndroidOrderInfo getStAndroidOrderInfo();

        public final native AndroidOrderInfoOrBuilder getStAndroidOrderInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasStAndroidOrderInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4354newBuilderForType();

        public final native Builder m4355newBuilderForType();

        protected final native Builder m4356newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4357toBuilder();

        public final native Builder m4358toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCPreBuyCoinAndroidRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpTransaction.f237M;
        }

        static void __clinit__() {
            PARSER = new C02951();
            SCPreBuyCoinAndroidRsp sCPreBuyCoinAndroidRsp = new SCPreBuyCoinAndroidRsp(true);
            defaultInstance = sCPreBuyCoinAndroidRsp;
            sCPreBuyCoinAndroidRsp.initFields();
        }

        public static SCPreBuyCoinAndroidRsp parseFrom(ByteString byteString) {
            return (SCPreBuyCoinAndroidRsp) PARSER.parseFrom(byteString);
        }

        public static SCPreBuyCoinAndroidRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCPreBuyCoinAndroidRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCPreBuyCoinAndroidRsp parseFrom(byte[] bArr) {
            return (SCPreBuyCoinAndroidRsp) PARSER.parseFrom(bArr);
        }

        public static SCPreBuyCoinAndroidRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCPreBuyCoinAndroidRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCPreBuyCoinAndroidRsp parseFrom(InputStream inputStream) {
            return (SCPreBuyCoinAndroidRsp) PARSER.parseFrom(inputStream);
        }

        public static SCPreBuyCoinAndroidRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCPreBuyCoinAndroidRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCPreBuyCoinAndroidRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCPreBuyCoinAndroidRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCPreBuyCoinAndroidRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCPreBuyCoinAndroidRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCPreBuyCoinAndroidRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCPreBuyCoinAndroidRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCPreBuyCoinAndroidRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCPreBuyCoinAndroidRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCPreBuyCoinAndroidRsp sCPreBuyCoinAndroidRsp) {
            return newBuilder().mergeFrom(sCPreBuyCoinAndroidRsp);
        }
    }

    public interface SellingItemInfoOrBuilder extends MessageOrBuilder {
        ITEM_TYPE getESellingItemType();

        UNIT_TYPE getESellingStoreUnitType();

        int getISellingItemCost();

        int getISellingItemID();

        String getSSellingItemDescription();

        ByteString getSSellingItemDescriptionBytes();

        String getSSellingItemDetailDescription();

        ByteString getSSellingItemDetailDescriptionBytes();

        String getSSellingItemIcon();

        ByteString getSSellingItemIconBytes();

        String getSSellingItemName();

        ByteString getSSellingItemNameBytes();

        boolean hasESellingItemType();

        boolean hasESellingStoreUnitType();

        boolean hasISellingItemCost();

        boolean hasISellingItemID();

        boolean hasSSellingItemDescription();

        boolean hasSSellingItemDetailDescription();

        boolean hasSSellingItemIcon();

        boolean hasSSellingItemName();
    }

    public static final class SellingItemInfo extends GeneratedMessage implements SellingItemInfoOrBuilder {
        public static final int ESELLINGITEMTYPE_FIELD_NUMBER = 4;
        public static final int ESELLINGSTOREUNITTYPE_FIELD_NUMBER = 7;
        public static final int ISELLINGITEMCOST_FIELD_NUMBER = 5;
        public static final int ISELLINGITEMID_FIELD_NUMBER = 1;
        public static Parser<SellingItemInfo> PARSER = null;
        public static final int SSELLINGITEMDESCRIPTION_FIELD_NUMBER = 6;
        public static final int SSELLINGITEMDETAILDESCRIPTION_FIELD_NUMBER = 8;
        public static final int SSELLINGITEMICON_FIELD_NUMBER = 3;
        public static final int SSELLINGITEMNAME_FIELD_NUMBER = 2;
        private static final SellingItemInfo defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ITEM_TYPE eSellingItemType_;
        private UNIT_TYPE eSellingStoreUnitType_;
        private int iSellingItemCost_;
        private int iSellingItemID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sSellingItemDescription_;
        private Object sSellingItemDetailDescription_;
        private Object sSellingItemIcon_;
        private Object sSellingItemName_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpTransaction.SellingItemInfo.1 */
        class C02961 extends AbstractParser<SellingItemInfo> {
            static {
                fixHelper.fixfunc(new int[]{29368, 29369});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02961();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SellingItemInfoOrBuilder {
            private int bitField0_;
            private ITEM_TYPE eSellingItemType_;
            private UNIT_TYPE eSellingStoreUnitType_;
            private int iSellingItemCost_;
            private int iSellingItemID_;
            private Object sSellingItemDescription_;
            private Object sSellingItemDetailDescription_;
            private Object sSellingItemIcon_;
            private Object sSellingItemName_;

            static {
                fixHelper.fixfunc(new int[]{29947, 29948, 29949, 29950, 29951, 29952, 29953, 29954, 29955, 29956, 29957, 29958, 29959, 29960, 29961, 29962, 29963, 29964, 29965, 29966, 29967, 29968, 29969, 29970, 29971, 29972, 29973, 29974, 29975, 29976, 29977, 29978, 29979, 29980, 29981, 29982, 29983, 29984, 29985, 29986, 29987, 29988, 29989, 29990, 29991, 29992, 29993, 29994, 29995, 29996, 29997, 29998, 29999, 30000, 30001, 30002, 30003, 30004, 30005, 30006, 30007, 30008, 30009, 30010, 30011, 30012, 30013, 30014, 30015, 30016, 30017, 30018});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4383build();

            public final native SellingItemInfo m4384build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4385buildPartial();

            public final native SellingItemInfo m4386buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4387clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4388clear();

            public final native Builder m4389clear();

            public final native Builder clearESellingItemType();

            public final native Builder clearESellingStoreUnitType();

            public final native Builder clearISellingItemCost();

            public final native Builder clearISellingItemID();

            public final native Builder clearSSellingItemDescription();

            public final native Builder clearSSellingItemDetailDescription();

            public final native Builder clearSSellingItemIcon();

            public final native Builder clearSSellingItemName();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4390clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4391clone();

            public final native Builder m4392clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4393getDefaultInstanceForType();

            public final native SellingItemInfo m4394getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ITEM_TYPE getESellingItemType();

            public final native UNIT_TYPE getESellingStoreUnitType();

            public final native int getISellingItemCost();

            public final native int getISellingItemID();

            public final native String getSSellingItemDescription();

            public final native ByteString getSSellingItemDescriptionBytes();

            public final native String getSSellingItemDetailDescription();

            public final native ByteString getSSellingItemDetailDescriptionBytes();

            public final native String getSSellingItemIcon();

            public final native ByteString getSSellingItemIconBytes();

            public final native String getSSellingItemName();

            public final native ByteString getSSellingItemNameBytes();

            public final native boolean hasESellingItemType();

            public final native boolean hasESellingStoreUnitType();

            public final native boolean hasISellingItemCost();

            public final native boolean hasISellingItemID();

            public final native boolean hasSSellingItemDescription();

            public final native boolean hasSSellingItemDetailDescription();

            public final native boolean hasSSellingItemIcon();

            public final native boolean hasSSellingItemName();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4395mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4396mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4397mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4398mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4399mergeFrom(Message message);

            public final native Builder mergeFrom(SellingItemInfo sellingItemInfo);

            public final native Builder setESellingItemType(ITEM_TYPE item_type);

            public final native Builder setESellingStoreUnitType(UNIT_TYPE unit_type);

            public final native Builder setISellingItemCost(int i);

            public final native Builder setISellingItemID(int i);

            public final native Builder setSSellingItemDescription(String str);

            public final native Builder setSSellingItemDescriptionBytes(ByteString byteString);

            public final native Builder setSSellingItemDetailDescription(String str);

            public final native Builder setSSellingItemDetailDescriptionBytes(ByteString byteString);

            public final native Builder setSSellingItemIcon(String str);

            public final native Builder setSSellingItemIconBytes(ByteString byteString);

            public final native Builder setSSellingItemName(String str);

            public final native Builder setSSellingItemNameBytes(ByteString byteString);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpTransaction.f258o;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{32906, 32907, 32908, 32909, 32910, 32911, 32912, 32913, 32914, 32915, 32916, 32917, 32918, 32919, 32920, 32921, 32922, 32923, 32924, 32925, 32926, 32927, 32928, 32929, 32930, 32931, 32932, 32933, 32934, 32935, 32936, 32937, 32938, 32939, 32940, 32941, 32942, 32943, 32944, 32945, 32946, 32947, 32948, 32949});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SellingItemInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SellingItemInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SellingItemInfo sellingItemInfo);

        private native SellingItemInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SellingItemInfo(com.google.protobuf.GeneratedMessage.Builder builder, SellingItemInfo sellingItemInfo);

        private native SellingItemInfo(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4376getDefaultInstanceForType();

        public final native SellingItemInfo m4377getDefaultInstanceForType();

        public final native ITEM_TYPE getESellingItemType();

        public final native UNIT_TYPE getESellingStoreUnitType();

        public final native int getISellingItemCost();

        public final native int getISellingItemID();

        public final native Parser<SellingItemInfo> getParserForType();

        public final native String getSSellingItemDescription();

        public final native ByteString getSSellingItemDescriptionBytes();

        public final native String getSSellingItemDetailDescription();

        public final native ByteString getSSellingItemDetailDescriptionBytes();

        public final native String getSSellingItemIcon();

        public final native ByteString getSSellingItemIconBytes();

        public final native String getSSellingItemName();

        public final native ByteString getSSellingItemNameBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasESellingItemType();

        public final native boolean hasESellingStoreUnitType();

        public final native boolean hasISellingItemCost();

        public final native boolean hasISellingItemID();

        public final native boolean hasSSellingItemDescription();

        public final native boolean hasSSellingItemDetailDescription();

        public final native boolean hasSSellingItemIcon();

        public final native boolean hasSSellingItemName();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4378newBuilderForType();

        public final native Builder m4379newBuilderForType();

        protected final native Builder m4380newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4381toBuilder();

        public final native Builder m4382toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SellingItemInfo getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpTransaction.f258o;
        }

        static void __clinit__() {
            PARSER = new C02961();
            SellingItemInfo sellingItemInfo = new SellingItemInfo(true);
            defaultInstance = sellingItemInfo;
            sellingItemInfo.initFields();
        }

        public static SellingItemInfo parseFrom(ByteString byteString) {
            return (SellingItemInfo) PARSER.parseFrom(byteString);
        }

        public static SellingItemInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SellingItemInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SellingItemInfo parseFrom(byte[] bArr) {
            return (SellingItemInfo) PARSER.parseFrom(bArr);
        }

        public static SellingItemInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SellingItemInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SellingItemInfo parseFrom(InputStream inputStream) {
            return (SellingItemInfo) PARSER.parseFrom(inputStream);
        }

        public static SellingItemInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SellingItemInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SellingItemInfo parseDelimitedFrom(InputStream inputStream) {
            return (SellingItemInfo) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SellingItemInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SellingItemInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SellingItemInfo parseFrom(CodedInputStream codedInputStream) {
            return (SellingItemInfo) PARSER.parseFrom(codedInputStream);
        }

        public static SellingItemInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SellingItemInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SellingItemInfo sellingItemInfo) {
            return newBuilder().mergeFrom(sellingItemInfo);
        }
    }

    public enum UNIT_TYPE implements ProtocolMessageEnum {
        ;
        
        public static final int UNIT_TYPE_COIN_VALUE = 1;
        public static final int UNIT_TYPE_POPULARITY_VALUE = 2;
        private static final UNIT_TYPE[] VALUES = null;
        private static EnumLiteMap<UNIT_TYPE> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpTransaction.UNIT_TYPE.1 */
        class C02971 implements EnumLiteMap<UNIT_TYPE> {
            static {
                fixHelper.fixfunc(new int[]{22261, 22262});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02971();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{22361, 22362, 22363, 22364});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native UNIT_TYPE(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            UNIT_TYPE_COIN = new UNIT_TYPE("UNIT_TYPE_COIN", 0, 0, UNIT_TYPE_COIN_VALUE);
            UNIT_TYPE_POPULARITY = new UNIT_TYPE("UNIT_TYPE_POPULARITY", UNIT_TYPE_COIN_VALUE, UNIT_TYPE_COIN_VALUE, UNIT_TYPE_POPULARITY_VALUE);
            UNIT_TYPE[] unit_typeArr = new UNIT_TYPE[UNIT_TYPE_POPULARITY_VALUE];
            unit_typeArr[0] = UNIT_TYPE_COIN;
            unit_typeArr[UNIT_TYPE_COIN_VALUE] = UNIT_TYPE_POPULARITY;
            ENUM$VALUES = unit_typeArr;
            internalValueMap = new C02971();
            VALUES = values();
        }

        public static UNIT_TYPE valueOf(int i) {
            switch (i) {
                case UNIT_TYPE_COIN_VALUE:
                    return UNIT_TYPE_COIN;
                case UNIT_TYPE_POPULARITY_VALUE:
                    return UNIT_TYPE_POPULARITY;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<UNIT_TYPE> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerHttpTransaction.m250a().getEnumTypes().get(0);
        }

        public static UNIT_TYPE valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public interface WXOrderInfoOrBuilder extends MessageOrBuilder {
        String getLPrepayId();

        ByteString getLPrepayIdBytes();

        long getLTimeStamp();

        String getSNonceStr();

        ByteString getSNonceStrBytes();

        String getSSign();

        ByteString getSSignBytes();

        boolean hasLPrepayId();

        boolean hasLTimeStamp();

        boolean hasSNonceStr();

        boolean hasSSign();
    }

    public static final class WXOrderInfo extends GeneratedMessage implements WXOrderInfoOrBuilder {
        public static final int LPREPAYID_FIELD_NUMBER = 1;
        public static final int LTIMESTAMP_FIELD_NUMBER = 3;
        public static Parser<WXOrderInfo> PARSER = null;
        public static final int SNONCESTR_FIELD_NUMBER = 2;
        public static final int SSIGN_FIELD_NUMBER = 4;
        private static final WXOrderInfo defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private Object lPrepayId_;
        private long lTimeStamp_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sNonceStr_;
        private Object sSign_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpTransaction.WXOrderInfo.1 */
        class C02981 extends AbstractParser<WXOrderInfo> {
            static {
                fixHelper.fixfunc(new int[]{9266, 9267});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02981();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements WXOrderInfoOrBuilder {
            private int bitField0_;
            private Object lPrepayId_;
            private long lTimeStamp_;
            private Object sNonceStr_;
            private Object sSign_;

            static {
                fixHelper.fixfunc(new int[]{19097, 19098, 19099, 19100, 19101, 19102, 19103, 19104, 19105, 19106, 19107, 19108, 19109, 19110, 19111, 19112, 19113, 19114, 19115, 19116, 19117, 19118, 19119, 19120, 19121, 19122, 19123, 19124, 19125, 19126, 19127, 19128, 19129, 19130, 19131, 19132, 19133, 19134, 19135, 19136, 19137, 19138, 19139, 19140, 19141, 19142, 19143, 19144, 19145, 19146, 19147, 19148, 19149, 19150});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4407build();

            public final native WXOrderInfo m4408build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4409buildPartial();

            public final native WXOrderInfo m4410buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4411clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4412clear();

            public final native Builder m4413clear();

            public final native Builder clearLPrepayId();

            public final native Builder clearLTimeStamp();

            public final native Builder clearSNonceStr();

            public final native Builder clearSSign();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4414clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4415clone();

            public final native Builder m4416clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4417getDefaultInstanceForType();

            public final native WXOrderInfo m4418getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native String getLPrepayId();

            public final native ByteString getLPrepayIdBytes();

            public final native long getLTimeStamp();

            public final native String getSNonceStr();

            public final native ByteString getSNonceStrBytes();

            public final native String getSSign();

            public final native ByteString getSSignBytes();

            public final native boolean hasLPrepayId();

            public final native boolean hasLTimeStamp();

            public final native boolean hasSNonceStr();

            public final native boolean hasSSign();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4419mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4420mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4421mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4422mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4423mergeFrom(Message message);

            public final native Builder mergeFrom(WXOrderInfo wXOrderInfo);

            public final native Builder setLPrepayId(String str);

            public final native Builder setLPrepayIdBytes(ByteString byteString);

            public final native Builder setLTimeStamp(long j);

            public final native Builder setSNonceStr(String str);

            public final native Builder setSNonceStrBytes(ByteString byteString);

            public final native Builder setSSign(String str);

            public final native Builder setSSignBytes(ByteString byteString);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpTransaction.f231G;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{10335, 10336, 10337, 10338, 10339, 10340, 10341, 10342, 10343, 10344, 10345, 10346, 10347, 10348, 10349, 10350, 10351, 10352, 10353, 10354, 10355, 10356, 10357, 10358, 10359, 10360, 10361, 10362, 10363, 10364, 10365, 10366, 10367, 10368, 10369});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native WXOrderInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ WXOrderInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, WXOrderInfo wXOrderInfo);

        private native WXOrderInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ WXOrderInfo(com.google.protobuf.GeneratedMessage.Builder builder, WXOrderInfo wXOrderInfo);

        private native WXOrderInfo(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4400getDefaultInstanceForType();

        public final native WXOrderInfo m4401getDefaultInstanceForType();

        public final native String getLPrepayId();

        public final native ByteString getLPrepayIdBytes();

        public final native long getLTimeStamp();

        public final native Parser<WXOrderInfo> getParserForType();

        public final native String getSNonceStr();

        public final native ByteString getSNonceStrBytes();

        public final native String getSSign();

        public final native ByteString getSSignBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasLPrepayId();

        public final native boolean hasLTimeStamp();

        public final native boolean hasSNonceStr();

        public final native boolean hasSSign();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4402newBuilderForType();

        public final native Builder m4403newBuilderForType();

        protected final native Builder m4404newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4405toBuilder();

        public final native Builder m4406toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static WXOrderInfo getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpTransaction.f231G;
        }

        static void __clinit__() {
            PARSER = new C02981();
            WXOrderInfo wXOrderInfo = new WXOrderInfo(true);
            defaultInstance = wXOrderInfo;
            wXOrderInfo.initFields();
        }

        public static WXOrderInfo parseFrom(ByteString byteString) {
            return (WXOrderInfo) PARSER.parseFrom(byteString);
        }

        public static WXOrderInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (WXOrderInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WXOrderInfo parseFrom(byte[] bArr) {
            return (WXOrderInfo) PARSER.parseFrom(bArr);
        }

        public static WXOrderInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (WXOrderInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static WXOrderInfo parseFrom(InputStream inputStream) {
            return (WXOrderInfo) PARSER.parseFrom(inputStream);
        }

        public static WXOrderInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WXOrderInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static WXOrderInfo parseDelimitedFrom(InputStream inputStream) {
            return (WXOrderInfo) PARSER.parseDelimitedFrom(inputStream);
        }

        public static WXOrderInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WXOrderInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static WXOrderInfo parseFrom(CodedInputStream codedInputStream) {
            return (WXOrderInfo) PARSER.parseFrom(codedInputStream);
        }

        public static WXOrderInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WXOrderInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(WXOrderInfo wXOrderInfo) {
            return newBuilder().mergeFrom(wXOrderInfo);
        }
    }

    public static FileDescriptor m250a() {
        return f243S;
    }

    static {
        FileDescriptor[] fileDescriptorArr = new FileDescriptor[]{TexasPokerCommon.m11a()};
        FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001fTexasPokerHttpTransaction.proto\u0012\ntexaspoker\u001a\u0016TexasPokerCommon.proto\"^\n\tCSBuyCoin\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0018\n\u0010iCoinStoreItemID\u0018\u0002 \u0002(\u0005\u0012\u0014\n\fiMobleSystem\u0018\u0003 \u0002(\u0005\u0012\u0013\n\u000bencodingStr\u0018\u0004 \u0001(\f\"L\n\fSCBuyCoinRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\r\n\u0005lCoin\u0018\u0002 \u0001(\u0003\"8\n\u0010CSBuySellingItem\u0012\f\n\u0004uuid\u0018\u0002 \u0002(\u0003\u0012\u0016\n\u000eiSellingItemID\u0018\u0001 \u0002(\u0005\"\u00d0\u0001\n\u0013SCBuySellingItemRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012,\n\nvItemsList\u0018\u0002 \u0003(\u000b2\u0018.texas", "poker.GameItemInfo\u00123\n\u000estUserBaseInfo\u0018\u0003 \u0001(\u000b2\u001b.texaspoker.UserBaseInfoNet\u0012\u0011\n\tiMaxLevel\u0018\u0004 \u0001(\u0005\u0012\u0014\n\fiMaxClubNums\u0018\u0005 \u0001(\u0005\"\u001d\n\rCSGetItemList\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\"o\n\u0010SCGetItemListRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012,\n\nvItemsList\u0018\u0002 \u0003(\u000b2\u0018.texaspoker.GameItemInfo\"\u009b\u0002\n\u0011CoinStoreItemInfo\u0012\u0018\n\u0010iCoinStoreItemID\u0018\u0001 \u0002(\u0005\u0012\u001a\n\u0012sCoinStoreItemName\u0018\u0002 \u0002(\t\u0012\u001a\n\u0012sCoinStoreItemIcon\u0018\u0003 \u0001(\t\u0012\u001a\n\u0012iCoinStoreItemCost\u0018\u0004 \u0001(\u0005\u0012!\n\u0019sCoinSto", "reItemDescription\u0018\u0005 \u0001(\t\u0012\u0017\n\u000fsAdditionalInfo\u0018\u0006 \u0001(\t\u00121\n\u0012eCoinStoreItemType\u0018\u0007 \u0001(\u000e2\u0015.texaspoker.ITEM_TYPE\u0012\u0012\n\nsProductID\u0018\b \u0001(\t\u0012\u0015\n\rsDisplayPrice\u0018\t \u0001(\t\"\u00a6\u0002\n\u000fSellingItemInfo\u0012\u0016\n\u000eiSellingItemID\u0018\u0001 \u0002(\u0005\u0012\u0018\n\u0010sSellingItemName\u0018\u0002 \u0002(\t\u0012\u0018\n\u0010sSellingItemIcon\u0018\u0003 \u0001(\t\u0012/\n\u0010eSellingItemType\u0018\u0004 \u0001(\u000e2\u0015.texaspoker.ITEM_TYPE\u0012\u0018\n\u0010iSellingItemCost\u0018\u0005 \u0001(\u0005\u0012\u001f\n\u0017sSellingItemDescription\u0018\u0006 \u0001(\t\u00124\n\u0015eSellingStoreUnitType\u0018\u0007 \u0001(\u000e2\u0015.texaspoker.UNIT_TYPE", "\u0012%\n\u001dsSellingItemDetailDescription\u0018\b \u0001(\t\"8\n\u0012CSGetCoinStoreList\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0014\n\fiMobleSystem\u0018\u0002 \u0002(\u0005\"}\n\u0015SCGetCoinStoreListRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u00125\n\u000evCoinItemsList\u0018\u0002 \u0003(\u000b2\u001d.texaspoker.CoinStoreItemInfo\"6\n\u0014CSGetSellingItemList\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0010\n\biGetType\u0018\u0002 \u0002(\u0005\"\u0091\u0001\n\u0017SCGetSellingItemListRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\u0010\n\biGetType\u0018\u0002 \u0001(\u0005\u00125\n\u0010vSellingItemList\u0018\u0003 \u0003(\u000b2", "\u001b.texaspoker.SellingItemInfo\"V\n\u000eCSAdminAddCoin\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0012\n\nlAddedUuid\u0018\u0002 \u0002(\u0003\u0012\r\n\u0005lCoin\u0018\u0003 \u0002(\u0003\u0012\u0013\n\u000blPopularity\u0018\u0004 \u0002(\u0003\"B\n\u0011SCAdminAddCoinRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\"B\n\u0012CSAdminAddClubFund\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0002(\u0003\u0012\r\n\u0005lFund\u0018\u0003 \u0002(\u0003\"x\n\u0015SCAdminAddClubFundRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u00120\n\u000estClubBaseInfo\u0018\u0002 \u0001(\u000b2\u0018.texaspoker.ClubBaseInfo\"V\n\u000bWXOrderInfo\u0012\u0011\n\tlPrepay", "Id\u0018\u0001 \u0002(\t\u0012\u0011\n\tsNonceStr\u0018\u0002 \u0001(\t\u0012\u0012\n\nlTimeStamp\u0018\u0003 \u0001(\u0003\u0012\r\n\u0005sSign\u0018\u0004 \u0001(\t\"\u00de\u0001\n\u0010AndroidOrderInfo\u0012\u0010\n\blOrderID\u0018\u0001 \u0002(\u0003\u0012\u0018\n\u0010iCoinStoreItemID\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nlOrderTime\u0018\u0003 \u0001(\u0003\u0012*\n\neOrderType\u0018\u0004 \u0001(\u000e2\u0016.texaspoker.ORDER_TYPE\u0012.\n\fePaymentType\u0018\u0005 \u0001(\u000e2\u0018.texaspoker.PAYMENT_TYPE\u0012.\n\rstWXOrderInfo\u0018\u0006 \u0001(\u000b2\u0017.texaspoker.WXOrderInfo\"S\n\u0013CSPreBuyCoinAndroid\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0018\n\u0010iCoinStoreItemID\u0018\u0002 \u0002(\u0005\u0012\u0014\n\fiMobleSystem\u0018\u0003 \u0002(\u0005\"\u0081\u0001\n\u0016SCPreBuyCoinAndroidRsp\u0012", "-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u00128\n\u0012stAndroidOrderInfo\u0018\u0002 \u0001(\u000b2\u001c.texaspoker.AndroidOrderInfo\"m\n\u0010CSBuyCoinAndroid\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0018\n\u0010iCoinStoreItemID\u0018\u0002 \u0002(\u0005\u0012\u0015\n\rsPurchaseData\u0018\u0003 \u0001(\t\u0012\u001a\n\u0012sPurchaseSignature\u0018\u0004 \u0001(\t\"\u0091\u0001\n\u0013SCBuyCoinAndroidRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012*\n\neOrderType\u0018\u0002 \u0001(\u000e2\u0016.texaspoker.ORDER_TYPE\u0012\r\n\u0005lCoin\u0018\u0003 \u0001(\u0003\u0012\u0010\n\blOrderID\u0018\u0004 \u0001(\u0003*9\n\tUNIT_TYPE\u0012\u0012\n\u000eUNIT_TYPE_COIN\u0010\u0001\u0012\u0018\n\u0014", "UNIT_TYPE_POPULARITY\u0010\u0002*B\n\fPAYMENT_TYPE\u0012\u0017\n\u0013PAYMENT_TYPE_WEIXIN\u0010\u0001\u0012\u0019\n\u0015PAYMENT_TYPE_ZHIFUBAO\u0010\u0002*Q\n\nORDER_TYPE\u0012\u0016\n\u0012ORDER_TYPE_ORDERED\u0010\u0001\u0012\u0015\n\u0011ORDER_TYPE_PAIDED\u0010\u0002\u0012\u0014\n\u0010ORDER_TYPE_ADDED\u0010\u0003*\\\n\tITEM_TYPE\u0012\u0011\n\rITEM_TYPE_HOT\u0010\u0001\u0012\u0011\n\rITEM_TYPE_NEW\u0010\u0002\u0012\u0013\n\u000fITEM_TYPE_CHEAP\u0010\u0003\u0012\u0014\n\u0010ITEM_TYPE_NORMAL\u0010\u0000B2\n\u0015com.texaspoker.momentB\u0019TexasPokerHttpTransaction"}, fileDescriptorArr, new C02721());
        f244a = (Descriptor) f243S.getMessageTypes().get(0);
        f245b = new FieldAccessorTable(f244a, new String[]{"Uuid", "ICoinStoreItemID", "IMobleSystem", "EncodingStr"});
        f246c = (Descriptor) f243S.getMessageTypes().get(1);
        f247d = new FieldAccessorTable(f246c, new String[]{"EErrCode", "LCoin"});
        f248e = (Descriptor) f243S.getMessageTypes().get(2);
        f249f = new FieldAccessorTable(f248e, new String[]{"Uuid", "ISellingItemID"});
        f250g = (Descriptor) f243S.getMessageTypes().get(3);
        f251h = new FieldAccessorTable(f250g, new String[]{"EErrCode", "VItemsList", "StUserBaseInfo", "IMaxLevel", "IMaxClubNums"});
        f252i = (Descriptor) f243S.getMessageTypes().get(4);
        f253j = new FieldAccessorTable(f252i, new String[]{"Uuid"});
        f254k = (Descriptor) f243S.getMessageTypes().get(5);
        f255l = new FieldAccessorTable(f254k, new String[]{"EErrCode", "VItemsList"});
        f256m = (Descriptor) f243S.getMessageTypes().get(6);
        f257n = new FieldAccessorTable(f256m, new String[]{"ICoinStoreItemID", "SCoinStoreItemName", "SCoinStoreItemIcon", "ICoinStoreItemCost", "SCoinStoreItemDescription", "SAdditionalInfo", "ECoinStoreItemType", "SProductID", "SDisplayPrice"});
        f258o = (Descriptor) f243S.getMessageTypes().get(7);
        f259p = new FieldAccessorTable(f258o, new String[]{"ISellingItemID", "SSellingItemName", "SSellingItemIcon", "ESellingItemType", "ISellingItemCost", "SSellingItemDescription", "ESellingStoreUnitType", "SSellingItemDetailDescription"});
        f260q = (Descriptor) f243S.getMessageTypes().get(8);
        f261r = new FieldAccessorTable(f260q, new String[]{"Uuid", "IMobleSystem"});
        f262s = (Descriptor) f243S.getMessageTypes().get(9);
        f263t = new FieldAccessorTable(f262s, new String[]{"EErrCode", "VCoinItemsList"});
        f264u = (Descriptor) f243S.getMessageTypes().get(10);
        f265v = new FieldAccessorTable(f264u, new String[]{"Uuid", "IGetType"});
        f266w = (Descriptor) f243S.getMessageTypes().get(11);
        f267x = new FieldAccessorTable(f266w, new String[]{"EErrCode", "IGetType", "VSellingItemList"});
        f268y = (Descriptor) f243S.getMessageTypes().get(12);
        f269z = new FieldAccessorTable(f268y, new String[]{"Uuid", "LAddedUuid", "LCoin", "LPopularity"});
        f225A = (Descriptor) f243S.getMessageTypes().get(13);
        f226B = new FieldAccessorTable(f225A, new String[]{"EErrCode"});
        f227C = (Descriptor) f243S.getMessageTypes().get(14);
        f228D = new FieldAccessorTable(f227C, new String[]{"Uuid", "LClubID", "LFund"});
        f229E = (Descriptor) f243S.getMessageTypes().get(15);
        f230F = new FieldAccessorTable(f229E, new String[]{"EErrCode", "StClubBaseInfo"});
        f231G = (Descriptor) f243S.getMessageTypes().get(16);
        f232H = new FieldAccessorTable(f231G, new String[]{"LPrepayId", "SNonceStr", "LTimeStamp", "SSign"});
        f233I = (Descriptor) f243S.getMessageTypes().get(17);
        f234J = new FieldAccessorTable(f233I, new String[]{"LOrderID", "ICoinStoreItemID", "LOrderTime", "EOrderType", "EPaymentType", "StWXOrderInfo"});
        f235K = (Descriptor) f243S.getMessageTypes().get(18);
        f236L = new FieldAccessorTable(f235K, new String[]{"Uuid", "ICoinStoreItemID", "IMobleSystem"});
        f237M = (Descriptor) f243S.getMessageTypes().get(19);
        f238N = new FieldAccessorTable(f237M, new String[]{"EErrCode", "StAndroidOrderInfo"});
        f239O = (Descriptor) f243S.getMessageTypes().get(20);
        f240P = new FieldAccessorTable(f239O, new String[]{"Uuid", "ICoinStoreItemID", "SPurchaseData", "SPurchaseSignature"});
        f241Q = (Descriptor) f243S.getMessageTypes().get(21);
        f242R = new FieldAccessorTable(f241Q, new String[]{"EErrCode", "EOrderType", "LCoin", "LOrderID"});
        TexasPokerCommon.m11a();
    }
}
