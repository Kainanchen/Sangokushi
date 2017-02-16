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
import java.io.InputStream;

public final class TexasPoker$SystemPushMsg extends GeneratedMessage implements TexasPoker$SystemPushMsgOrBuilder {
    public static final int ESYSTEMMESSAGETYPE_FIELD_NUMBER = 2;
    public static final int LMSGID_FIELD_NUMBER = 1;
    public static final int LTIMEOUTTIME_FIELD_NUMBER = 6;
    public static Parser<TexasPoker$SystemPushMsg> PARSER = null;
    public static final int SCONTENT_FIELD_NUMBER = 5;
    public static final int STITLE_FIELD_NUMBER = 3;
    public static final int SURL_FIELD_NUMBER = 4;
    private static final TexasPoker$SystemPushMsg defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private TexasPoker$SYSTEM_MESSAGE_TYPE eSystemMessageType_;
    private long lMsgID_;
    private long lTimeoutTime_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private Object sContent_;
    private Object sTitle_;
    private Object sUrl_;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SystemPushMsg.1 */
    class C00751 extends AbstractParser<TexasPoker$SystemPushMsg> {
        static {
            fixHelper.fixfunc(new int[]{7067, 7068});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00751();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SystemPushMsg.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SystemPushMsgOrBuilder {
        private int bitField0_;
        private TexasPoker$SYSTEM_MESSAGE_TYPE eSystemMessageType_;
        private long lMsgID_;
        private long lTimeoutTime_;
        private Object sContent_;
        private Object sTitle_;
        private Object sUrl_;

        static {
            fixHelper.fixfunc(new int[]{4907, 4908, 4909, 4910, 4911, 4912, 4913, 4914, 4915, 4916, 4917, 4918, 4919, 4920, 4921, 4922, 4923, 4924, 4925, 4926, 4927, 4928, 4929, 4930, 4931, 4932, 4933, 4934, 4935, 4936, 4937, 4938, 4939, 4940, 4941, 4942, 4943, 4944, 4945, 4946, 4947, 4948, 4949, 4950, 4951, 4952, 4953, 4954, 4955, 4956, 4957, 4958, 4959, 4960, 4961, 4962, 4963, 4964, 4965, 4966, 4967, 4968});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m2541build();

        public final native TexasPoker$SystemPushMsg m2542build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m2543buildPartial();

        public final native TexasPoker$SystemPushMsg m2544buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2545clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2546clear();

        public final native Builder m2547clear();

        public final native Builder clearESystemMessageType();

        public final native Builder clearLMsgID();

        public final native Builder clearLTimeoutTime();

        public final native Builder clearSContent();

        public final native Builder clearSTitle();

        public final native Builder clearSUrl();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2548clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2549clone();

        public final native Builder m2550clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2551getDefaultInstanceForType();

        public final native TexasPoker$SystemPushMsg m2552getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native TexasPoker$SYSTEM_MESSAGE_TYPE getESystemMessageType();

        public final native long getLMsgID();

        public final native long getLTimeoutTime();

        public final native String getSContent();

        public final native ByteString getSContentBytes();

        public final native String getSTitle();

        public final native ByteString getSTitleBytes();

        public final native String getSUrl();

        public final native ByteString getSUrlBytes();

        public final native boolean hasESystemMessageType();

        public final native boolean hasLMsgID();

        public final native boolean hasLTimeoutTime();

        public final native boolean hasSContent();

        public final native boolean hasSTitle();

        public final native boolean hasSUrl();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2553mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2554mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2555mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2556mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2557mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SystemPushMsg texasPoker$SystemPushMsg);

        public final native Builder setESystemMessageType(TexasPoker$SYSTEM_MESSAGE_TYPE texasPoker$SYSTEM_MESSAGE_TYPE);

        public final native Builder setLMsgID(long j);

        public final native Builder setLTimeoutTime(long j);

        public final native Builder setSContent(String str);

        public final native Builder setSContentBytes(ByteString byteString);

        public final native Builder setSTitle(String str);

        public final native Builder setSTitleBytes(ByteString byteString);

        public final native Builder setSUrl(String str);

        public final native Builder setSUrlBytes(ByteString byteString);

        public static final Descriptor getDescriptor() {
            return TexasPoker.fl();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{17310, 17311, 17312, 17313, 17314, 17315, 17316, 17317, 17318, 17319, 17320, 17321, 17322, 17323, 17324, 17325, 17326, 17327, 17328, 17329, 17330, 17331, 17332, 17333, 17334, 17335, 17336, 17337, 17338, 17339, 17340, 17341, 17342, 17343, 17344, 17345, 17346, 17347, 17348});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SystemPushMsg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SystemPushMsg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SystemPushMsg texasPoker$SystemPushMsg);

    private native TexasPoker$SystemPushMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SystemPushMsg(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SystemPushMsg texasPoker$SystemPushMsg);

    private native TexasPoker$SystemPushMsg(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m2534getDefaultInstanceForType();

    public final native TexasPoker$SystemPushMsg m2535getDefaultInstanceForType();

    public final native TexasPoker$SYSTEM_MESSAGE_TYPE getESystemMessageType();

    public final native long getLMsgID();

    public final native long getLTimeoutTime();

    public final native Parser<TexasPoker$SystemPushMsg> getParserForType();

    public final native String getSContent();

    public final native ByteString getSContentBytes();

    public final native String getSTitle();

    public final native ByteString getSTitleBytes();

    public final native String getSUrl();

    public final native ByteString getSUrlBytes();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasESystemMessageType();

    public final native boolean hasLMsgID();

    public final native boolean hasLTimeoutTime();

    public final native boolean hasSContent();

    public final native boolean hasSTitle();

    public final native boolean hasSUrl();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2536newBuilderForType();

    public final native Builder m2537newBuilderForType();

    protected final native Builder m2538newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2539toBuilder();

    public final native Builder m2540toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SystemPushMsg getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.fl();
    }

    static void __clinit__() {
        PARSER = new C00751();
        TexasPoker$SystemPushMsg texasPoker$SystemPushMsg = new TexasPoker$SystemPushMsg(true);
        defaultInstance = texasPoker$SystemPushMsg;
        texasPoker$SystemPushMsg.initFields();
    }

    public static TexasPoker$SystemPushMsg parseFrom(ByteString byteString) {
        return (TexasPoker$SystemPushMsg) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SystemPushMsg parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SystemPushMsg) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SystemPushMsg parseFrom(byte[] bArr) {
        return (TexasPoker$SystemPushMsg) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SystemPushMsg parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SystemPushMsg) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SystemPushMsg parseFrom(InputStream inputStream) {
        return (TexasPoker$SystemPushMsg) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SystemPushMsg parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SystemPushMsg) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SystemPushMsg parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SystemPushMsg) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SystemPushMsg parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SystemPushMsg) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SystemPushMsg parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SystemPushMsg) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SystemPushMsg parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SystemPushMsg) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SystemPushMsg texasPoker$SystemPushMsg) {
        return newBuilder().mergeFrom(texasPoker$SystemPushMsg);
    }
}
