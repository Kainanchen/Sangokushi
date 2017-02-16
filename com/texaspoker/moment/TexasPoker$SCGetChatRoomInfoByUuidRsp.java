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
import com.google.protobuf.RepeatedFieldBuilder;
import com.google.protobuf.UnknownFieldSet;
import com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo;
import com.texaspoker.moment.TexasPoker.ChatRoomBaseInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import java.io.InputStream;
import java.util.List;

public final class TexasPoker$SCGetChatRoomInfoByUuidRsp extends GeneratedMessage implements TexasPoker$SCGetChatRoomInfoByUuidRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static Parser<TexasPoker$SCGetChatRoomInfoByUuidRsp> PARSER = null;
    public static final int VCHATROOMBASEINFOS_FIELD_NUMBER = 2;
    private static final TexasPoker$SCGetChatRoomInfoByUuidRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;
    private List<ChatRoomBaseInfo> vChatRoomBaseInfos_;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCGetChatRoomInfoByUuidRsp.1 */
    class C00011 extends AbstractParser<TexasPoker$SCGetChatRoomInfoByUuidRsp> {
        static {
            fixHelper.fixfunc(new int[]{18744, 18745});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00011();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCGetChatRoomInfoByUuidRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCGetChatRoomInfoByUuidRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private RepeatedFieldBuilder<ChatRoomBaseInfo, com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo.Builder, ChatRoomBaseInfoOrBuilder> vChatRoomBaseInfosBuilder_;
        private List<ChatRoomBaseInfo> vChatRoomBaseInfos_;

        static {
            fixHelper.fixfunc(new int[]{4105, 4106, 4107, 4108, 4109, 4110, 4111, 4112, 4113, 4114, 4115, 4116, 4117, 4118, 4119, 4120, 4121, 4122, 4123, 4124, 4125, 4126, 4127, 4128, 4129, 4130, 4131, 4132, 4133, 4134, 4135, 4136, 4137, 4138, 4139, 4140, 4141, 4142, 4143, 4144, 4145, 4146, 4147, 4148, 4149, 4150, 4151, 4152, 4153, 4154, 4155, 4156, 4157, 4158, 4159, 4160});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void ensureVChatRoomBaseInfosIsMutable();

        private native RepeatedFieldBuilder<ChatRoomBaseInfo, com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo.Builder, ChatRoomBaseInfoOrBuilder> getVChatRoomBaseInfosFieldBuilder();

        private native void maybeForceBuilderInitialization();

        public final native Builder addAllVChatRoomBaseInfos(Iterable<? extends ChatRoomBaseInfo> iterable);

        public final native Builder addVChatRoomBaseInfos(int i, com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo.Builder builder);

        public final native Builder addVChatRoomBaseInfos(int i, ChatRoomBaseInfo chatRoomBaseInfo);

        public final native Builder addVChatRoomBaseInfos(com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo.Builder builder);

        public final native Builder addVChatRoomBaseInfos(ChatRoomBaseInfo chatRoomBaseInfo);

        public final native com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo.Builder addVChatRoomBaseInfosBuilder();

        public final native com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo.Builder addVChatRoomBaseInfosBuilder(int i);

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m573build();

        public final native TexasPoker$SCGetChatRoomInfoByUuidRsp m574build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m575buildPartial();

        public final native TexasPoker$SCGetChatRoomInfoByUuidRsp m576buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m577clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m578clear();

        public final native Builder m579clear();

        public final native Builder clearEErrCode();

        public final native Builder clearVChatRoomBaseInfos();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m580clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m581clone();

        public final native Builder m582clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m583getDefaultInstanceForType();

        public final native TexasPoker$SCGetChatRoomInfoByUuidRsp m584getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native ChatRoomBaseInfo getVChatRoomBaseInfos(int i);

        public final native com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo.Builder getVChatRoomBaseInfosBuilder(int i);

        public final native List<com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo.Builder> getVChatRoomBaseInfosBuilderList();

        public final native int getVChatRoomBaseInfosCount();

        public final native List<ChatRoomBaseInfo> getVChatRoomBaseInfosList();

        public final native ChatRoomBaseInfoOrBuilder getVChatRoomBaseInfosOrBuilder(int i);

        public final native List<? extends ChatRoomBaseInfoOrBuilder> getVChatRoomBaseInfosOrBuilderList();

        public final native boolean hasEErrCode();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m585mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m586mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m587mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m588mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m589mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCGetChatRoomInfoByUuidRsp texasPoker$SCGetChatRoomInfoByUuidRsp);

        public final native Builder removeVChatRoomBaseInfos(int i);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setVChatRoomBaseInfos(int i, com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo.Builder builder);

        public final native Builder setVChatRoomBaseInfos(int i, ChatRoomBaseInfo chatRoomBaseInfo);

        public static final Descriptor getDescriptor() {
            return TexasPoker.bb();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{17967, 17968, 17969, 17970, 17971, 17972, 17973, 17974, 17975, 17976, 17977, 17978, 17979, 17980, 17981, 17982, 17983, 17984, 17985, 17986, 17987, 17988, 17989, 17990, 17991, 17992, 17993, 17994, 17995, 17996, 17997});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCGetChatRoomInfoByUuidRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCGetChatRoomInfoByUuidRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCGetChatRoomInfoByUuidRsp texasPoker$SCGetChatRoomInfoByUuidRsp);

    private native TexasPoker$SCGetChatRoomInfoByUuidRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCGetChatRoomInfoByUuidRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCGetChatRoomInfoByUuidRsp texasPoker$SCGetChatRoomInfoByUuidRsp);

    private native TexasPoker$SCGetChatRoomInfoByUuidRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m566getDefaultInstanceForType();

    public final native TexasPoker$SCGetChatRoomInfoByUuidRsp m567getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native Parser<TexasPoker$SCGetChatRoomInfoByUuidRsp> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native ChatRoomBaseInfo getVChatRoomBaseInfos(int i);

    public final native int getVChatRoomBaseInfosCount();

    public final native List<ChatRoomBaseInfo> getVChatRoomBaseInfosList();

    public final native ChatRoomBaseInfoOrBuilder getVChatRoomBaseInfosOrBuilder(int i);

    public final native List<? extends ChatRoomBaseInfoOrBuilder> getVChatRoomBaseInfosOrBuilderList();

    public final native boolean hasEErrCode();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m568newBuilderForType();

    public final native Builder m569newBuilderForType();

    protected final native Builder m570newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m571toBuilder();

    public final native Builder m572toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCGetChatRoomInfoByUuidRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.bb();
    }

    static void __clinit__() {
        PARSER = new C00011();
        TexasPoker$SCGetChatRoomInfoByUuidRsp texasPoker$SCGetChatRoomInfoByUuidRsp = new TexasPoker$SCGetChatRoomInfoByUuidRsp(true);
        defaultInstance = texasPoker$SCGetChatRoomInfoByUuidRsp;
        texasPoker$SCGetChatRoomInfoByUuidRsp.initFields();
    }

    public static TexasPoker$SCGetChatRoomInfoByUuidRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCGetChatRoomInfoByUuidRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCGetChatRoomInfoByUuidRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetChatRoomInfoByUuidRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCGetChatRoomInfoByUuidRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCGetChatRoomInfoByUuidRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCGetChatRoomInfoByUuidRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetChatRoomInfoByUuidRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCGetChatRoomInfoByUuidRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCGetChatRoomInfoByUuidRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCGetChatRoomInfoByUuidRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetChatRoomInfoByUuidRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCGetChatRoomInfoByUuidRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCGetChatRoomInfoByUuidRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCGetChatRoomInfoByUuidRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetChatRoomInfoByUuidRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCGetChatRoomInfoByUuidRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCGetChatRoomInfoByUuidRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCGetChatRoomInfoByUuidRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetChatRoomInfoByUuidRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCGetChatRoomInfoByUuidRsp texasPoker$SCGetChatRoomInfoByUuidRsp) {
        return newBuilder().mergeFrom(texasPoker$SCGetChatRoomInfoByUuidRsp);
    }
}
