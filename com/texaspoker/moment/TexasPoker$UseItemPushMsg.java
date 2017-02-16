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

public final class TexasPoker$UseItemPushMsg extends GeneratedMessage implements TexasPoker$UseItemPushMsgOrBuilder {
    public static final int LFROMUUID_FIELD_NUMBER = 2;
    public static final int LITEMID_FIELD_NUMBER = 5;
    public static final int LMSGID_FIELD_NUMBER = 1;
    public static final int LROOMID_FIELD_NUMBER = 4;
    public static final int LTOUUID_FIELD_NUMBER = 3;
    public static Parser<TexasPoker$UseItemPushMsg> PARSER = null;
    public static final int SEXTRA_FIELD_NUMBER = 6;
    private static final TexasPoker$UseItemPushMsg defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private long lFromUuid_;
    private int lItemID_;
    private long lMsgID_;
    private long lRoomID_;
    private long lToUuid_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private Object sExtra_;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.UseItemPushMsg.1 */
    class C00791 extends AbstractParser<TexasPoker$UseItemPushMsg> {
        static {
            fixHelper.fixfunc(new int[]{32742, 32743});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00791();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.UseItemPushMsg.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$UseItemPushMsgOrBuilder {
        private int bitField0_;
        private long lFromUuid_;
        private int lItemID_;
        private long lMsgID_;
        private long lRoomID_;
        private long lToUuid_;
        private Object sExtra_;

        static {
            fixHelper.fixfunc(new int[]{9302, 9303, 9304, 9305, 9306, 9307, 9308, 9309, 9310, 9311, 9312, 9313, 9314, 9315, 9316, 9317, 9318, 9319, 9320, 9321, 9322, 9323, 9324, 9325, 9326, 9327, 9328, 9329, 9330, 9331, 9332, 9333, 9334, 9335, 9336, 9337, 9338, 9339, 9340, 9341, 9342, 9343, 9344, 9345, 9346, 9347, 9348, 9349, 9350, 9351, 9352, 9353, 9354, 9355, 9356, 9357, 9358, 9359});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m2685build();

        public final native TexasPoker$UseItemPushMsg m2686build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m2687buildPartial();

        public final native TexasPoker$UseItemPushMsg m2688buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2689clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2690clear();

        public final native Builder m2691clear();

        public final native Builder clearLFromUuid();

        public final native Builder clearLItemID();

        public final native Builder clearLMsgID();

        public final native Builder clearLRoomID();

        public final native Builder clearLToUuid();

        public final native Builder clearSExtra();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2692clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2693clone();

        public final native Builder m2694clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2695getDefaultInstanceForType();

        public final native TexasPoker$UseItemPushMsg m2696getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native long getLFromUuid();

        public final native int getLItemID();

        public final native long getLMsgID();

        public final native long getLRoomID();

        public final native long getLToUuid();

        public final native String getSExtra();

        public final native ByteString getSExtraBytes();

        public final native boolean hasLFromUuid();

        public final native boolean hasLItemID();

        public final native boolean hasLMsgID();

        public final native boolean hasLRoomID();

        public final native boolean hasLToUuid();

        public final native boolean hasSExtra();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2697mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2698mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2699mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2700mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2701mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$UseItemPushMsg texasPoker$UseItemPushMsg);

        public final native Builder setLFromUuid(long j);

        public final native Builder setLItemID(int i);

        public final native Builder setLMsgID(long j);

        public final native Builder setLRoomID(long j);

        public final native Builder setLToUuid(long j);

        public final native Builder setSExtra(String str);

        public final native Builder setSExtraBytes(ByteString byteString);

        public static final Descriptor getDescriptor() {
            return TexasPoker.db();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{28591, 28592, 28593, 28594, 28595, 28596, 28597, 28598, 28599, 28600, 28601, 28602, 28603, 28604, 28605, 28606, 28607, 28608, 28609, 28610, 28611, 28612, 28613, 28614, 28615, 28616, 28617, 28618, 28619, 28620, 28621, 28622, 28623, 28624, 28625, 28626, 28627});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$UseItemPushMsg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$UseItemPushMsg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$UseItemPushMsg texasPoker$UseItemPushMsg);

    private native TexasPoker$UseItemPushMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$UseItemPushMsg(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$UseItemPushMsg texasPoker$UseItemPushMsg);

    private native TexasPoker$UseItemPushMsg(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m2678getDefaultInstanceForType();

    public final native TexasPoker$UseItemPushMsg m2679getDefaultInstanceForType();

    public final native long getLFromUuid();

    public final native int getLItemID();

    public final native long getLMsgID();

    public final native long getLRoomID();

    public final native long getLToUuid();

    public final native Parser<TexasPoker$UseItemPushMsg> getParserForType();

    public final native String getSExtra();

    public final native ByteString getSExtraBytes();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasLFromUuid();

    public final native boolean hasLItemID();

    public final native boolean hasLMsgID();

    public final native boolean hasLRoomID();

    public final native boolean hasLToUuid();

    public final native boolean hasSExtra();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2680newBuilderForType();

    public final native Builder m2681newBuilderForType();

    protected final native Builder m2682newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2683toBuilder();

    public final native Builder m2684toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$UseItemPushMsg getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.db();
    }

    static void __clinit__() {
        PARSER = new C00791();
        TexasPoker$UseItemPushMsg texasPoker$UseItemPushMsg = new TexasPoker$UseItemPushMsg(true);
        defaultInstance = texasPoker$UseItemPushMsg;
        texasPoker$UseItemPushMsg.initFields();
    }

    public static TexasPoker$UseItemPushMsg parseFrom(ByteString byteString) {
        return (TexasPoker$UseItemPushMsg) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$UseItemPushMsg parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$UseItemPushMsg) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$UseItemPushMsg parseFrom(byte[] bArr) {
        return (TexasPoker$UseItemPushMsg) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$UseItemPushMsg parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$UseItemPushMsg) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$UseItemPushMsg parseFrom(InputStream inputStream) {
        return (TexasPoker$UseItemPushMsg) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$UseItemPushMsg parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$UseItemPushMsg) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$UseItemPushMsg parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$UseItemPushMsg) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$UseItemPushMsg parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$UseItemPushMsg) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$UseItemPushMsg parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$UseItemPushMsg) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$UseItemPushMsg parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$UseItemPushMsg) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$UseItemPushMsg texasPoker$UseItemPushMsg) {
        return newBuilder().mergeFrom(texasPoker$UseItemPushMsg);
    }
}
