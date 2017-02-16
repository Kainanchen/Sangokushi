package com.google.protobuf;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner;
import com.google.protobuf.GeneratedMessage.ExtendableBuilder;
import com.google.protobuf.GeneratedMessage.ExtendableMessage;
import com.google.protobuf.GeneratedMessage.ExtendableMessageOrBuilder;
import com.google.protobuf.GeneratedMessage.FieldAccessorTable;
import com.google.protobuf.Internal.EnumLiteMap;
import com.illuminate.texaspoker.R.R;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.texaspoker.moment.TexasPoker.GameRoomBaseInfo;
import com.texaspoker.moment.TexasPoker.PushMsg;
import com.texaspoker.moment.TexasPoker.QuickGameRoomPushMsg;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;

public final class DescriptorProtos {
    private static FileDescriptor descriptor;
    private static final Descriptor f2773x1458f8d;
    private static FieldAccessorTable f2774xf366d90b;
    private static final Descriptor internal_static_google_protobuf_DescriptorProto_descriptor;
    private static FieldAccessorTable f2775x907d0bf0;
    private static final Descriptor internal_static_google_protobuf_EnumDescriptorProto_descriptor;
    private static FieldAccessorTable f2776x9945f651;
    private static final Descriptor internal_static_google_protobuf_EnumOptions_descriptor;
    private static FieldAccessorTable internal_static_google_protobuf_EnumOptions_fieldAccessorTable;
    private static final Descriptor f2777xf18031a8;
    private static FieldAccessorTable f2778xfb173026;
    private static final Descriptor internal_static_google_protobuf_EnumValueOptions_descriptor;
    private static FieldAccessorTable f2779xdf65a421;
    private static final Descriptor internal_static_google_protobuf_FieldDescriptorProto_descriptor;
    private static FieldAccessorTable f2780x4734b330;
    private static final Descriptor internal_static_google_protobuf_FieldOptions_descriptor;
    private static FieldAccessorTable internal_static_google_protobuf_FieldOptions_fieldAccessorTable;
    private static final Descriptor internal_static_google_protobuf_FileDescriptorProto_descriptor;
    private static FieldAccessorTable f2781x4b52780c;
    private static final Descriptor internal_static_google_protobuf_FileDescriptorSet_descriptor;
    private static FieldAccessorTable f2782x15a6a952;
    private static final Descriptor internal_static_google_protobuf_FileOptions_descriptor;
    private static FieldAccessorTable internal_static_google_protobuf_FileOptions_fieldAccessorTable;
    private static final Descriptor internal_static_google_protobuf_MessageOptions_descriptor;
    private static FieldAccessorTable f2783x9c0b3d38;
    private static final Descriptor internal_static_google_protobuf_MethodDescriptorProto_descriptor;
    private static FieldAccessorTable f2784xc5331ef1;
    private static final Descriptor internal_static_google_protobuf_MethodOptions_descriptor;
    private static FieldAccessorTable internal_static_google_protobuf_MethodOptions_fieldAccessorTable;
    private static final Descriptor internal_static_google_protobuf_OneofDescriptorProto_descriptor;
    private static FieldAccessorTable f2785x69499c33;
    private static final Descriptor f2786x158c73ed;
    private static FieldAccessorTable f2787xee335d6b;
    private static final Descriptor internal_static_google_protobuf_ServiceOptions_descriptor;
    private static FieldAccessorTable f2788x371e666;
    private static final Descriptor f2789xb210d08d;
    private static FieldAccessorTable f2790x9611a0b;
    private static final Descriptor internal_static_google_protobuf_SourceCodeInfo_descriptor;
    private static FieldAccessorTable f2791x532209f9;
    private static final Descriptor f2792xb111d23c;
    private static FieldAccessorTable f2793x1698fcba;
    private static final Descriptor internal_static_google_protobuf_UninterpretedOption_descriptor;
    private static FieldAccessorTable f2794x2101041;

    /* renamed from: com.google.protobuf.DescriptorProtos.1 */
    static class C02771 implements InternalDescriptorAssigner {
        C02771() {
        }

        public final ExtensionRegistry assignDescriptors(FileDescriptor fileDescriptor) {
            DescriptorProtos.descriptor = fileDescriptor;
            return null;
        }
    }

    public interface DescriptorProtoOrBuilder extends MessageOrBuilder {
        EnumDescriptorProto getEnumType(int i);

        int getEnumTypeCount();

        List<EnumDescriptorProto> getEnumTypeList();

        EnumDescriptorProtoOrBuilder getEnumTypeOrBuilder(int i);

        List<? extends EnumDescriptorProtoOrBuilder> getEnumTypeOrBuilderList();

        FieldDescriptorProto getExtension(int i);

        int getExtensionCount();

        List<FieldDescriptorProto> getExtensionList();

        FieldDescriptorProtoOrBuilder getExtensionOrBuilder(int i);

        List<? extends FieldDescriptorProtoOrBuilder> getExtensionOrBuilderList();

        ExtensionRange getExtensionRange(int i);

        int getExtensionRangeCount();

        List<ExtensionRange> getExtensionRangeList();

        ExtensionRangeOrBuilder getExtensionRangeOrBuilder(int i);

        List<? extends ExtensionRangeOrBuilder> getExtensionRangeOrBuilderList();

        FieldDescriptorProto getField(int i);

        int getFieldCount();

        List<FieldDescriptorProto> getFieldList();

        FieldDescriptorProtoOrBuilder getFieldOrBuilder(int i);

        List<? extends FieldDescriptorProtoOrBuilder> getFieldOrBuilderList();

        String getName();

        ByteString getNameBytes();

        DescriptorProto getNestedType(int i);

        int getNestedTypeCount();

        List<DescriptorProto> getNestedTypeList();

        DescriptorProtoOrBuilder getNestedTypeOrBuilder(int i);

        List<? extends DescriptorProtoOrBuilder> getNestedTypeOrBuilderList();

        OneofDescriptorProto getOneofDecl(int i);

        int getOneofDeclCount();

        List<OneofDescriptorProto> getOneofDeclList();

        OneofDescriptorProtoOrBuilder getOneofDeclOrBuilder(int i);

        List<? extends OneofDescriptorProtoOrBuilder> getOneofDeclOrBuilderList();

        MessageOptions getOptions();

        MessageOptionsOrBuilder getOptionsOrBuilder();

        boolean hasName();

        boolean hasOptions();
    }

    public static final class DescriptorProto extends GeneratedMessage implements DescriptorProtoOrBuilder {
        public static final int ENUM_TYPE_FIELD_NUMBER = 4;
        public static final int EXTENSION_FIELD_NUMBER = 6;
        public static final int EXTENSION_RANGE_FIELD_NUMBER = 5;
        public static final int FIELD_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NESTED_TYPE_FIELD_NUMBER = 3;
        public static final int ONEOF_DECL_FIELD_NUMBER = 8;
        public static final int OPTIONS_FIELD_NUMBER = 7;
        public static Parser<DescriptorProto> PARSER;
        private static final DescriptorProto defaultInstance;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private List<EnumDescriptorProto> enumType_;
        private List<ExtensionRange> extensionRange_;
        private List<FieldDescriptorProto> extension_;
        private List<FieldDescriptorProto> field_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object name_;
        private List<DescriptorProto> nestedType_;
        private List<OneofDescriptorProto> oneofDecl_;
        private MessageOptions options_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.google.protobuf.DescriptorProtos.DescriptorProto.1 */
        static class C02781 extends AbstractParser<DescriptorProto> {
            C02781() {
            }

            public final DescriptorProto parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new DescriptorProto(extensionRegistryLite, null);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements DescriptorProtoOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilder<EnumDescriptorProto, Builder, EnumDescriptorProtoOrBuilder> enumTypeBuilder_;
            private List<EnumDescriptorProto> enumType_;
            private RepeatedFieldBuilder<FieldDescriptorProto, Builder, FieldDescriptorProtoOrBuilder> extensionBuilder_;
            private RepeatedFieldBuilder<ExtensionRange, Builder, ExtensionRangeOrBuilder> extensionRangeBuilder_;
            private List<ExtensionRange> extensionRange_;
            private List<FieldDescriptorProto> extension_;
            private RepeatedFieldBuilder<FieldDescriptorProto, Builder, FieldDescriptorProtoOrBuilder> fieldBuilder_;
            private List<FieldDescriptorProto> field_;
            private Object name_;
            private RepeatedFieldBuilder<DescriptorProto, Builder, DescriptorProtoOrBuilder> nestedTypeBuilder_;
            private List<DescriptorProto> nestedType_;
            private RepeatedFieldBuilder<OneofDescriptorProto, Builder, OneofDescriptorProtoOrBuilder> oneofDeclBuilder_;
            private List<OneofDescriptorProto> oneofDecl_;
            private SingleFieldBuilder<MessageOptions, Builder, MessageOptionsOrBuilder> optionsBuilder_;
            private MessageOptions options_;

            public static final Descriptor getDescriptor() {
                return DescriptorProtos.internal_static_google_protobuf_DescriptorProto_descriptor;
            }

            protected final FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.f2775x907d0bf0.ensureFieldAccessorsInitialized(DescriptorProto.class, Builder.class);
            }

            private Builder() {
                this.name_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.field_ = Collections.emptyList();
                this.extension_ = Collections.emptyList();
                this.nestedType_ = Collections.emptyList();
                this.enumType_ = Collections.emptyList();
                this.extensionRange_ = Collections.emptyList();
                this.oneofDecl_ = Collections.emptyList();
                this.options_ = MessageOptions.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent builderParent) {
                super(builderParent);
                this.name_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.field_ = Collections.emptyList();
                this.extension_ = Collections.emptyList();
                this.nestedType_ = Collections.emptyList();
                this.enumType_ = Collections.emptyList();
                this.extensionRange_ = Collections.emptyList();
                this.oneofDecl_ = Collections.emptyList();
                this.options_ = MessageOptions.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    getFieldFieldBuilder();
                    getExtensionFieldBuilder();
                    getNestedTypeFieldBuilder();
                    getEnumTypeFieldBuilder();
                    getExtensionRangeFieldBuilder();
                    getOneofDeclFieldBuilder();
                    getOptionsFieldBuilder();
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public final Builder clear() {
                super.clear();
                this.name_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.bitField0_ &= -2;
                if (this.fieldBuilder_ == null) {
                    this.field_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                } else {
                    this.fieldBuilder_.clear();
                }
                if (this.extensionBuilder_ == null) {
                    this.extension_ = Collections.emptyList();
                    this.bitField0_ &= -5;
                } else {
                    this.extensionBuilder_.clear();
                }
                if (this.nestedTypeBuilder_ == null) {
                    this.nestedType_ = Collections.emptyList();
                    this.bitField0_ &= -9;
                } else {
                    this.nestedTypeBuilder_.clear();
                }
                if (this.enumTypeBuilder_ == null) {
                    this.enumType_ = Collections.emptyList();
                    this.bitField0_ &= -17;
                } else {
                    this.enumTypeBuilder_.clear();
                }
                if (this.extensionRangeBuilder_ == null) {
                    this.extensionRange_ = Collections.emptyList();
                    this.bitField0_ &= -33;
                } else {
                    this.extensionRangeBuilder_.clear();
                }
                if (this.oneofDeclBuilder_ == null) {
                    this.oneofDecl_ = Collections.emptyList();
                    this.bitField0_ &= -65;
                } else {
                    this.oneofDeclBuilder_.clear();
                }
                if (this.optionsBuilder_ == null) {
                    this.options_ = MessageOptions.getDefaultInstance();
                } else {
                    this.optionsBuilder_.clear();
                }
                this.bitField0_ &= -129;
                return this;
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_DescriptorProto_descriptor;
            }

            public final DescriptorProto getDefaultInstanceForType() {
                return DescriptorProto.getDefaultInstance();
            }

            public final DescriptorProto build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
            }

            public final DescriptorProto buildPartial() {
                int i;
                int i2 = DescriptorProto.NAME_FIELD_NUMBER;
                DescriptorProto descriptorProto = new DescriptorProto(null);
                int i3 = this.bitField0_;
                if ((i3 & DescriptorProto.NAME_FIELD_NUMBER) != DescriptorProto.NAME_FIELD_NUMBER) {
                    i2 = 0;
                }
                descriptorProto.name_ = this.name_;
                if (this.fieldBuilder_ == null) {
                    if ((this.bitField0_ & DescriptorProto.FIELD_FIELD_NUMBER) == DescriptorProto.FIELD_FIELD_NUMBER) {
                        this.field_ = Collections.unmodifiableList(this.field_);
                        this.bitField0_ &= -3;
                    }
                    descriptorProto.field_ = this.field_;
                } else {
                    descriptorProto.field_ = this.fieldBuilder_.build();
                }
                if (this.extensionBuilder_ == null) {
                    if ((this.bitField0_ & DescriptorProto.ENUM_TYPE_FIELD_NUMBER) == DescriptorProto.ENUM_TYPE_FIELD_NUMBER) {
                        this.extension_ = Collections.unmodifiableList(this.extension_);
                        this.bitField0_ &= -5;
                    }
                    descriptorProto.extension_ = this.extension_;
                } else {
                    descriptorProto.extension_ = this.extensionBuilder_.build();
                }
                if (this.nestedTypeBuilder_ == null) {
                    if ((this.bitField0_ & DescriptorProto.ONEOF_DECL_FIELD_NUMBER) == DescriptorProto.ONEOF_DECL_FIELD_NUMBER) {
                        this.nestedType_ = Collections.unmodifiableList(this.nestedType_);
                        this.bitField0_ &= -9;
                    }
                    descriptorProto.nestedType_ = this.nestedType_;
                } else {
                    descriptorProto.nestedType_ = this.nestedTypeBuilder_.build();
                }
                if (this.enumTypeBuilder_ == null) {
                    if ((this.bitField0_ & 16) == 16) {
                        this.enumType_ = Collections.unmodifiableList(this.enumType_);
                        this.bitField0_ &= -17;
                    }
                    descriptorProto.enumType_ = this.enumType_;
                } else {
                    descriptorProto.enumType_ = this.enumTypeBuilder_.build();
                }
                if (this.extensionRangeBuilder_ == null) {
                    if ((this.bitField0_ & 32) == 32) {
                        this.extensionRange_ = Collections.unmodifiableList(this.extensionRange_);
                        this.bitField0_ &= -33;
                    }
                    descriptorProto.extensionRange_ = this.extensionRange_;
                } else {
                    descriptorProto.extensionRange_ = this.extensionRangeBuilder_.build();
                }
                if (this.oneofDeclBuilder_ == null) {
                    if ((this.bitField0_ & 64) == 64) {
                        this.oneofDecl_ = Collections.unmodifiableList(this.oneofDecl_);
                        this.bitField0_ &= -65;
                    }
                    descriptorProto.oneofDecl_ = this.oneofDecl_;
                } else {
                    descriptorProto.oneofDecl_ = this.oneofDeclBuilder_.build();
                }
                if ((i3 & AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) == AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) {
                    i = i2 | DescriptorProto.FIELD_FIELD_NUMBER;
                } else {
                    i = i2;
                }
                if (this.optionsBuilder_ == null) {
                    descriptorProto.options_ = this.options_;
                } else {
                    descriptorProto.options_ = (MessageOptions) this.optionsBuilder_.build();
                }
                descriptorProto.bitField0_ = i;
                onBuilt();
                return descriptorProto;
            }

            public final Builder mergeFrom(Message message) {
                if (message instanceof DescriptorProto) {
                    return mergeFrom((DescriptorProto) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public final Builder mergeFrom(DescriptorProto descriptorProto) {
                RepeatedFieldBuilder repeatedFieldBuilder = null;
                if (descriptorProto != DescriptorProto.getDefaultInstance()) {
                    if (descriptorProto.hasName()) {
                        this.bitField0_ |= DescriptorProto.NAME_FIELD_NUMBER;
                        this.name_ = descriptorProto.name_;
                        onChanged();
                    }
                    if (this.fieldBuilder_ == null) {
                        if (!descriptorProto.field_.isEmpty()) {
                            if (this.field_.isEmpty()) {
                                this.field_ = descriptorProto.field_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureFieldIsMutable();
                                this.field_.addAll(descriptorProto.field_);
                            }
                            onChanged();
                        }
                    } else if (!descriptorProto.field_.isEmpty()) {
                        if (this.fieldBuilder_.isEmpty()) {
                            this.fieldBuilder_.dispose();
                            this.fieldBuilder_ = null;
                            this.field_ = descriptorProto.field_;
                            this.bitField0_ &= -3;
                            this.fieldBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? getFieldFieldBuilder() : null;
                        } else {
                            this.fieldBuilder_.addAllMessages(descriptorProto.field_);
                        }
                    }
                    if (this.extensionBuilder_ == null) {
                        if (!descriptorProto.extension_.isEmpty()) {
                            if (this.extension_.isEmpty()) {
                                this.extension_ = descriptorProto.extension_;
                                this.bitField0_ &= -5;
                            } else {
                                ensureExtensionIsMutable();
                                this.extension_.addAll(descriptorProto.extension_);
                            }
                            onChanged();
                        }
                    } else if (!descriptorProto.extension_.isEmpty()) {
                        if (this.extensionBuilder_.isEmpty()) {
                            this.extensionBuilder_.dispose();
                            this.extensionBuilder_ = null;
                            this.extension_ = descriptorProto.extension_;
                            this.bitField0_ &= -5;
                            this.extensionBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? getExtensionFieldBuilder() : null;
                        } else {
                            this.extensionBuilder_.addAllMessages(descriptorProto.extension_);
                        }
                    }
                    if (this.nestedTypeBuilder_ == null) {
                        if (!descriptorProto.nestedType_.isEmpty()) {
                            if (this.nestedType_.isEmpty()) {
                                this.nestedType_ = descriptorProto.nestedType_;
                                this.bitField0_ &= -9;
                            } else {
                                ensureNestedTypeIsMutable();
                                this.nestedType_.addAll(descriptorProto.nestedType_);
                            }
                            onChanged();
                        }
                    } else if (!descriptorProto.nestedType_.isEmpty()) {
                        if (this.nestedTypeBuilder_.isEmpty()) {
                            this.nestedTypeBuilder_.dispose();
                            this.nestedTypeBuilder_ = null;
                            this.nestedType_ = descriptorProto.nestedType_;
                            this.bitField0_ &= -9;
                            this.nestedTypeBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? getNestedTypeFieldBuilder() : null;
                        } else {
                            this.nestedTypeBuilder_.addAllMessages(descriptorProto.nestedType_);
                        }
                    }
                    if (this.enumTypeBuilder_ == null) {
                        if (!descriptorProto.enumType_.isEmpty()) {
                            if (this.enumType_.isEmpty()) {
                                this.enumType_ = descriptorProto.enumType_;
                                this.bitField0_ &= -17;
                            } else {
                                ensureEnumTypeIsMutable();
                                this.enumType_.addAll(descriptorProto.enumType_);
                            }
                            onChanged();
                        }
                    } else if (!descriptorProto.enumType_.isEmpty()) {
                        if (this.enumTypeBuilder_.isEmpty()) {
                            this.enumTypeBuilder_.dispose();
                            this.enumTypeBuilder_ = null;
                            this.enumType_ = descriptorProto.enumType_;
                            this.bitField0_ &= -17;
                            this.enumTypeBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? getEnumTypeFieldBuilder() : null;
                        } else {
                            this.enumTypeBuilder_.addAllMessages(descriptorProto.enumType_);
                        }
                    }
                    if (this.extensionRangeBuilder_ == null) {
                        if (!descriptorProto.extensionRange_.isEmpty()) {
                            if (this.extensionRange_.isEmpty()) {
                                this.extensionRange_ = descriptorProto.extensionRange_;
                                this.bitField0_ &= -33;
                            } else {
                                ensureExtensionRangeIsMutable();
                                this.extensionRange_.addAll(descriptorProto.extensionRange_);
                            }
                            onChanged();
                        }
                    } else if (!descriptorProto.extensionRange_.isEmpty()) {
                        if (this.extensionRangeBuilder_.isEmpty()) {
                            this.extensionRangeBuilder_.dispose();
                            this.extensionRangeBuilder_ = null;
                            this.extensionRange_ = descriptorProto.extensionRange_;
                            this.bitField0_ &= -33;
                            this.extensionRangeBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? getExtensionRangeFieldBuilder() : null;
                        } else {
                            this.extensionRangeBuilder_.addAllMessages(descriptorProto.extensionRange_);
                        }
                    }
                    if (this.oneofDeclBuilder_ == null) {
                        if (!descriptorProto.oneofDecl_.isEmpty()) {
                            if (this.oneofDecl_.isEmpty()) {
                                this.oneofDecl_ = descriptorProto.oneofDecl_;
                                this.bitField0_ &= -65;
                            } else {
                                ensureOneofDeclIsMutable();
                                this.oneofDecl_.addAll(descriptorProto.oneofDecl_);
                            }
                            onChanged();
                        }
                    } else if (!descriptorProto.oneofDecl_.isEmpty()) {
                        if (this.oneofDeclBuilder_.isEmpty()) {
                            this.oneofDeclBuilder_.dispose();
                            this.oneofDeclBuilder_ = null;
                            this.oneofDecl_ = descriptorProto.oneofDecl_;
                            this.bitField0_ &= -65;
                            if (GeneratedMessage.alwaysUseFieldBuilders) {
                                repeatedFieldBuilder = getOneofDeclFieldBuilder();
                            }
                            this.oneofDeclBuilder_ = repeatedFieldBuilder;
                        } else {
                            this.oneofDeclBuilder_.addAllMessages(descriptorProto.oneofDecl_);
                        }
                    }
                    if (descriptorProto.hasOptions()) {
                        mergeOptions(descriptorProto.getOptions());
                    }
                    mergeUnknownFields(descriptorProto.getUnknownFields());
                }
                return this;
            }

            public final boolean isInitialized() {
                int i;
                for (i = 0; i < getFieldCount(); i += DescriptorProto.NAME_FIELD_NUMBER) {
                    if (!getField(i).isInitialized()) {
                        return false;
                    }
                }
                for (i = 0; i < getExtensionCount(); i += DescriptorProto.NAME_FIELD_NUMBER) {
                    if (!getExtension(i).isInitialized()) {
                        return false;
                    }
                }
                for (i = 0; i < getNestedTypeCount(); i += DescriptorProto.NAME_FIELD_NUMBER) {
                    if (!getNestedType(i).isInitialized()) {
                        return false;
                    }
                }
                for (i = 0; i < getEnumTypeCount(); i += DescriptorProto.NAME_FIELD_NUMBER) {
                    if (!getEnumType(i).isInitialized()) {
                        return false;
                    }
                }
                if (!hasOptions() || getOptions().isInitialized()) {
                    return true;
                }
                return false;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.google.protobuf.DescriptorProtos.DescriptorProto.Builder mergeFrom(com.google.protobuf.CodedInputStream r5, com.google.protobuf.ExtensionRegistryLite r6) {
                /*
                r4 = this;
                r2 = 0;
                r0 = com.google.protobuf.DescriptorProtos.DescriptorProto.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = (com.google.protobuf.DescriptorProtos.DescriptorProto) r0;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                if (r0 == 0) goto L_0x000e;
            L_0x000b:
                r4.mergeFrom(r0);
            L_0x000e:
                return r4;
            L_0x000f:
                r0 = move-exception;
                r1 = r0;
                r0 = r1.getUnfinishedMessage();	 Catch:{ all -> 0x0022 }
                r0 = (com.google.protobuf.DescriptorProtos.DescriptorProto) r0;	 Catch:{ all -> 0x0022 }
                throw r1;	 Catch:{ all -> 0x0018 }
            L_0x0018:
                r1 = move-exception;
                r3 = r1;
                r1 = r0;
                r0 = r3;
            L_0x001c:
                if (r1 == 0) goto L_0x0021;
            L_0x001e:
                r4.mergeFrom(r1);
            L_0x0021:
                throw r0;
            L_0x0022:
                r0 = move-exception;
                r1 = r2;
                goto L_0x001c;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.DescriptorProto.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.DescriptorProtos$DescriptorProto$Builder");
            }

            public final boolean hasName() {
                return (this.bitField0_ & DescriptorProto.NAME_FIELD_NUMBER) == DescriptorProto.NAME_FIELD_NUMBER;
            }

            public final String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String toStringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.name_ = toStringUtf8;
                }
                return toStringUtf8;
            }

            public final ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final Builder setName(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= DescriptorProto.NAME_FIELD_NUMBER;
                this.name_ = str;
                onChanged();
                return this;
            }

            public final Builder clearName() {
                this.bitField0_ &= -2;
                this.name_ = DescriptorProto.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public final Builder setNameBytes(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= DescriptorProto.NAME_FIELD_NUMBER;
                this.name_ = byteString;
                onChanged();
                return this;
            }

            private void ensureFieldIsMutable() {
                if ((this.bitField0_ & DescriptorProto.FIELD_FIELD_NUMBER) != DescriptorProto.FIELD_FIELD_NUMBER) {
                    this.field_ = new ArrayList(this.field_);
                    this.bitField0_ |= DescriptorProto.FIELD_FIELD_NUMBER;
                }
            }

            public final List<FieldDescriptorProto> getFieldList() {
                if (this.fieldBuilder_ == null) {
                    return Collections.unmodifiableList(this.field_);
                }
                return this.fieldBuilder_.getMessageList();
            }

            public final int getFieldCount() {
                if (this.fieldBuilder_ == null) {
                    return this.field_.size();
                }
                return this.fieldBuilder_.getCount();
            }

            public final FieldDescriptorProto getField(int i) {
                if (this.fieldBuilder_ == null) {
                    return (FieldDescriptorProto) this.field_.get(i);
                }
                return (FieldDescriptorProto) this.fieldBuilder_.getMessage(i);
            }

            public final Builder setField(int i, FieldDescriptorProto fieldDescriptorProto) {
                if (this.fieldBuilder_ != null) {
                    this.fieldBuilder_.setMessage(i, fieldDescriptorProto);
                } else if (fieldDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureFieldIsMutable();
                    this.field_.set(i, fieldDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder setField(int i, Builder builder) {
                if (this.fieldBuilder_ == null) {
                    ensureFieldIsMutable();
                    this.field_.set(i, builder.build());
                    onChanged();
                } else {
                    this.fieldBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addField(FieldDescriptorProto fieldDescriptorProto) {
                if (this.fieldBuilder_ != null) {
                    this.fieldBuilder_.addMessage(fieldDescriptorProto);
                } else if (fieldDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureFieldIsMutable();
                    this.field_.add(fieldDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder addField(int i, FieldDescriptorProto fieldDescriptorProto) {
                if (this.fieldBuilder_ != null) {
                    this.fieldBuilder_.addMessage(i, fieldDescriptorProto);
                } else if (fieldDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureFieldIsMutable();
                    this.field_.add(i, fieldDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder addField(Builder builder) {
                if (this.fieldBuilder_ == null) {
                    ensureFieldIsMutable();
                    this.field_.add(builder.build());
                    onChanged();
                } else {
                    this.fieldBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public final Builder addField(int i, Builder builder) {
                if (this.fieldBuilder_ == null) {
                    ensureFieldIsMutable();
                    this.field_.add(i, builder.build());
                    onChanged();
                } else {
                    this.fieldBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addAllField(Iterable<? extends FieldDescriptorProto> iterable) {
                if (this.fieldBuilder_ == null) {
                    ensureFieldIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.field_);
                    onChanged();
                } else {
                    this.fieldBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public final Builder clearField() {
                if (this.fieldBuilder_ == null) {
                    this.field_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    onChanged();
                } else {
                    this.fieldBuilder_.clear();
                }
                return this;
            }

            public final Builder removeField(int i) {
                if (this.fieldBuilder_ == null) {
                    ensureFieldIsMutable();
                    this.field_.remove(i);
                    onChanged();
                } else {
                    this.fieldBuilder_.remove(i);
                }
                return this;
            }

            public final Builder getFieldBuilder(int i) {
                return (Builder) getFieldFieldBuilder().getBuilder(i);
            }

            public final FieldDescriptorProtoOrBuilder getFieldOrBuilder(int i) {
                if (this.fieldBuilder_ == null) {
                    return (FieldDescriptorProtoOrBuilder) this.field_.get(i);
                }
                return (FieldDescriptorProtoOrBuilder) this.fieldBuilder_.getMessageOrBuilder(i);
            }

            public final List<? extends FieldDescriptorProtoOrBuilder> getFieldOrBuilderList() {
                if (this.fieldBuilder_ != null) {
                    return this.fieldBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.field_);
            }

            public final Builder addFieldBuilder() {
                return (Builder) getFieldFieldBuilder().addBuilder(FieldDescriptorProto.getDefaultInstance());
            }

            public final Builder addFieldBuilder(int i) {
                return (Builder) getFieldFieldBuilder().addBuilder(i, FieldDescriptorProto.getDefaultInstance());
            }

            public final List<Builder> getFieldBuilderList() {
                return getFieldFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<FieldDescriptorProto, Builder, FieldDescriptorProtoOrBuilder> getFieldFieldBuilder() {
                if (this.fieldBuilder_ == null) {
                    this.fieldBuilder_ = new RepeatedFieldBuilder(this.field_, (this.bitField0_ & DescriptorProto.FIELD_FIELD_NUMBER) == DescriptorProto.FIELD_FIELD_NUMBER, getParentForChildren(), isClean());
                    this.field_ = null;
                }
                return this.fieldBuilder_;
            }

            private void ensureExtensionIsMutable() {
                if ((this.bitField0_ & DescriptorProto.ENUM_TYPE_FIELD_NUMBER) != DescriptorProto.ENUM_TYPE_FIELD_NUMBER) {
                    this.extension_ = new ArrayList(this.extension_);
                    this.bitField0_ |= DescriptorProto.ENUM_TYPE_FIELD_NUMBER;
                }
            }

            public final List<FieldDescriptorProto> getExtensionList() {
                if (this.extensionBuilder_ == null) {
                    return Collections.unmodifiableList(this.extension_);
                }
                return this.extensionBuilder_.getMessageList();
            }

            public final int getExtensionCount() {
                if (this.extensionBuilder_ == null) {
                    return this.extension_.size();
                }
                return this.extensionBuilder_.getCount();
            }

            public final FieldDescriptorProto getExtension(int i) {
                if (this.extensionBuilder_ == null) {
                    return (FieldDescriptorProto) this.extension_.get(i);
                }
                return (FieldDescriptorProto) this.extensionBuilder_.getMessage(i);
            }

            public final Builder setExtension(int i, FieldDescriptorProto fieldDescriptorProto) {
                if (this.extensionBuilder_ != null) {
                    this.extensionBuilder_.setMessage(i, fieldDescriptorProto);
                } else if (fieldDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureExtensionIsMutable();
                    this.extension_.set(i, fieldDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder setExtension(int i, Builder builder) {
                if (this.extensionBuilder_ == null) {
                    ensureExtensionIsMutable();
                    this.extension_.set(i, builder.build());
                    onChanged();
                } else {
                    this.extensionBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addExtension(FieldDescriptorProto fieldDescriptorProto) {
                if (this.extensionBuilder_ != null) {
                    this.extensionBuilder_.addMessage(fieldDescriptorProto);
                } else if (fieldDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureExtensionIsMutable();
                    this.extension_.add(fieldDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder addExtension(int i, FieldDescriptorProto fieldDescriptorProto) {
                if (this.extensionBuilder_ != null) {
                    this.extensionBuilder_.addMessage(i, fieldDescriptorProto);
                } else if (fieldDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureExtensionIsMutable();
                    this.extension_.add(i, fieldDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder addExtension(Builder builder) {
                if (this.extensionBuilder_ == null) {
                    ensureExtensionIsMutable();
                    this.extension_.add(builder.build());
                    onChanged();
                } else {
                    this.extensionBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public final Builder addExtension(int i, Builder builder) {
                if (this.extensionBuilder_ == null) {
                    ensureExtensionIsMutable();
                    this.extension_.add(i, builder.build());
                    onChanged();
                } else {
                    this.extensionBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addAllExtension(Iterable<? extends FieldDescriptorProto> iterable) {
                if (this.extensionBuilder_ == null) {
                    ensureExtensionIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.extension_);
                    onChanged();
                } else {
                    this.extensionBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public final Builder clearExtension() {
                if (this.extensionBuilder_ == null) {
                    this.extension_ = Collections.emptyList();
                    this.bitField0_ &= -5;
                    onChanged();
                } else {
                    this.extensionBuilder_.clear();
                }
                return this;
            }

            public final Builder removeExtension(int i) {
                if (this.extensionBuilder_ == null) {
                    ensureExtensionIsMutable();
                    this.extension_.remove(i);
                    onChanged();
                } else {
                    this.extensionBuilder_.remove(i);
                }
                return this;
            }

            public final Builder getExtensionBuilder(int i) {
                return (Builder) getExtensionFieldBuilder().getBuilder(i);
            }

            public final FieldDescriptorProtoOrBuilder getExtensionOrBuilder(int i) {
                if (this.extensionBuilder_ == null) {
                    return (FieldDescriptorProtoOrBuilder) this.extension_.get(i);
                }
                return (FieldDescriptorProtoOrBuilder) this.extensionBuilder_.getMessageOrBuilder(i);
            }

            public final List<? extends FieldDescriptorProtoOrBuilder> getExtensionOrBuilderList() {
                if (this.extensionBuilder_ != null) {
                    return this.extensionBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.extension_);
            }

            public final Builder addExtensionBuilder() {
                return (Builder) getExtensionFieldBuilder().addBuilder(FieldDescriptorProto.getDefaultInstance());
            }

            public final Builder addExtensionBuilder(int i) {
                return (Builder) getExtensionFieldBuilder().addBuilder(i, FieldDescriptorProto.getDefaultInstance());
            }

            public final List<Builder> getExtensionBuilderList() {
                return getExtensionFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<FieldDescriptorProto, Builder, FieldDescriptorProtoOrBuilder> getExtensionFieldBuilder() {
                if (this.extensionBuilder_ == null) {
                    this.extensionBuilder_ = new RepeatedFieldBuilder(this.extension_, (this.bitField0_ & DescriptorProto.ENUM_TYPE_FIELD_NUMBER) == DescriptorProto.ENUM_TYPE_FIELD_NUMBER, getParentForChildren(), isClean());
                    this.extension_ = null;
                }
                return this.extensionBuilder_;
            }

            private void ensureNestedTypeIsMutable() {
                if ((this.bitField0_ & DescriptorProto.ONEOF_DECL_FIELD_NUMBER) != DescriptorProto.ONEOF_DECL_FIELD_NUMBER) {
                    this.nestedType_ = new ArrayList(this.nestedType_);
                    this.bitField0_ |= DescriptorProto.ONEOF_DECL_FIELD_NUMBER;
                }
            }

            public final List<DescriptorProto> getNestedTypeList() {
                if (this.nestedTypeBuilder_ == null) {
                    return Collections.unmodifiableList(this.nestedType_);
                }
                return this.nestedTypeBuilder_.getMessageList();
            }

            public final int getNestedTypeCount() {
                if (this.nestedTypeBuilder_ == null) {
                    return this.nestedType_.size();
                }
                return this.nestedTypeBuilder_.getCount();
            }

            public final DescriptorProto getNestedType(int i) {
                if (this.nestedTypeBuilder_ == null) {
                    return (DescriptorProto) this.nestedType_.get(i);
                }
                return (DescriptorProto) this.nestedTypeBuilder_.getMessage(i);
            }

            public final Builder setNestedType(int i, DescriptorProto descriptorProto) {
                if (this.nestedTypeBuilder_ != null) {
                    this.nestedTypeBuilder_.setMessage(i, descriptorProto);
                } else if (descriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureNestedTypeIsMutable();
                    this.nestedType_.set(i, descriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder setNestedType(int i, Builder builder) {
                if (this.nestedTypeBuilder_ == null) {
                    ensureNestedTypeIsMutable();
                    this.nestedType_.set(i, builder.build());
                    onChanged();
                } else {
                    this.nestedTypeBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addNestedType(DescriptorProto descriptorProto) {
                if (this.nestedTypeBuilder_ != null) {
                    this.nestedTypeBuilder_.addMessage(descriptorProto);
                } else if (descriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureNestedTypeIsMutable();
                    this.nestedType_.add(descriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder addNestedType(int i, DescriptorProto descriptorProto) {
                if (this.nestedTypeBuilder_ != null) {
                    this.nestedTypeBuilder_.addMessage(i, descriptorProto);
                } else if (descriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureNestedTypeIsMutable();
                    this.nestedType_.add(i, descriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder addNestedType(Builder builder) {
                if (this.nestedTypeBuilder_ == null) {
                    ensureNestedTypeIsMutable();
                    this.nestedType_.add(builder.build());
                    onChanged();
                } else {
                    this.nestedTypeBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public final Builder addNestedType(int i, Builder builder) {
                if (this.nestedTypeBuilder_ == null) {
                    ensureNestedTypeIsMutable();
                    this.nestedType_.add(i, builder.build());
                    onChanged();
                } else {
                    this.nestedTypeBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addAllNestedType(Iterable<? extends DescriptorProto> iterable) {
                if (this.nestedTypeBuilder_ == null) {
                    ensureNestedTypeIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.nestedType_);
                    onChanged();
                } else {
                    this.nestedTypeBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public final Builder clearNestedType() {
                if (this.nestedTypeBuilder_ == null) {
                    this.nestedType_ = Collections.emptyList();
                    this.bitField0_ &= -9;
                    onChanged();
                } else {
                    this.nestedTypeBuilder_.clear();
                }
                return this;
            }

            public final Builder removeNestedType(int i) {
                if (this.nestedTypeBuilder_ == null) {
                    ensureNestedTypeIsMutable();
                    this.nestedType_.remove(i);
                    onChanged();
                } else {
                    this.nestedTypeBuilder_.remove(i);
                }
                return this;
            }

            public final Builder getNestedTypeBuilder(int i) {
                return (Builder) getNestedTypeFieldBuilder().getBuilder(i);
            }

            public final DescriptorProtoOrBuilder getNestedTypeOrBuilder(int i) {
                if (this.nestedTypeBuilder_ == null) {
                    return (DescriptorProtoOrBuilder) this.nestedType_.get(i);
                }
                return (DescriptorProtoOrBuilder) this.nestedTypeBuilder_.getMessageOrBuilder(i);
            }

            public final List<? extends DescriptorProtoOrBuilder> getNestedTypeOrBuilderList() {
                if (this.nestedTypeBuilder_ != null) {
                    return this.nestedTypeBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.nestedType_);
            }

            public final Builder addNestedTypeBuilder() {
                return (Builder) getNestedTypeFieldBuilder().addBuilder(DescriptorProto.getDefaultInstance());
            }

            public final Builder addNestedTypeBuilder(int i) {
                return (Builder) getNestedTypeFieldBuilder().addBuilder(i, DescriptorProto.getDefaultInstance());
            }

            public final List<Builder> getNestedTypeBuilderList() {
                return getNestedTypeFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<DescriptorProto, Builder, DescriptorProtoOrBuilder> getNestedTypeFieldBuilder() {
                if (this.nestedTypeBuilder_ == null) {
                    this.nestedTypeBuilder_ = new RepeatedFieldBuilder(this.nestedType_, (this.bitField0_ & DescriptorProto.ONEOF_DECL_FIELD_NUMBER) == DescriptorProto.ONEOF_DECL_FIELD_NUMBER, getParentForChildren(), isClean());
                    this.nestedType_ = null;
                }
                return this.nestedTypeBuilder_;
            }

            private void ensureEnumTypeIsMutable() {
                if ((this.bitField0_ & 16) != 16) {
                    this.enumType_ = new ArrayList(this.enumType_);
                    this.bitField0_ |= 16;
                }
            }

            public final List<EnumDescriptorProto> getEnumTypeList() {
                if (this.enumTypeBuilder_ == null) {
                    return Collections.unmodifiableList(this.enumType_);
                }
                return this.enumTypeBuilder_.getMessageList();
            }

            public final int getEnumTypeCount() {
                if (this.enumTypeBuilder_ == null) {
                    return this.enumType_.size();
                }
                return this.enumTypeBuilder_.getCount();
            }

            public final EnumDescriptorProto getEnumType(int i) {
                if (this.enumTypeBuilder_ == null) {
                    return (EnumDescriptorProto) this.enumType_.get(i);
                }
                return (EnumDescriptorProto) this.enumTypeBuilder_.getMessage(i);
            }

            public final Builder setEnumType(int i, EnumDescriptorProto enumDescriptorProto) {
                if (this.enumTypeBuilder_ != null) {
                    this.enumTypeBuilder_.setMessage(i, enumDescriptorProto);
                } else if (enumDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureEnumTypeIsMutable();
                    this.enumType_.set(i, enumDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder setEnumType(int i, Builder builder) {
                if (this.enumTypeBuilder_ == null) {
                    ensureEnumTypeIsMutable();
                    this.enumType_.set(i, builder.build());
                    onChanged();
                } else {
                    this.enumTypeBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addEnumType(EnumDescriptorProto enumDescriptorProto) {
                if (this.enumTypeBuilder_ != null) {
                    this.enumTypeBuilder_.addMessage(enumDescriptorProto);
                } else if (enumDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureEnumTypeIsMutable();
                    this.enumType_.add(enumDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder addEnumType(int i, EnumDescriptorProto enumDescriptorProto) {
                if (this.enumTypeBuilder_ != null) {
                    this.enumTypeBuilder_.addMessage(i, enumDescriptorProto);
                } else if (enumDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureEnumTypeIsMutable();
                    this.enumType_.add(i, enumDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder addEnumType(Builder builder) {
                if (this.enumTypeBuilder_ == null) {
                    ensureEnumTypeIsMutable();
                    this.enumType_.add(builder.build());
                    onChanged();
                } else {
                    this.enumTypeBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public final Builder addEnumType(int i, Builder builder) {
                if (this.enumTypeBuilder_ == null) {
                    ensureEnumTypeIsMutable();
                    this.enumType_.add(i, builder.build());
                    onChanged();
                } else {
                    this.enumTypeBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addAllEnumType(Iterable<? extends EnumDescriptorProto> iterable) {
                if (this.enumTypeBuilder_ == null) {
                    ensureEnumTypeIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.enumType_);
                    onChanged();
                } else {
                    this.enumTypeBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public final Builder clearEnumType() {
                if (this.enumTypeBuilder_ == null) {
                    this.enumType_ = Collections.emptyList();
                    this.bitField0_ &= -17;
                    onChanged();
                } else {
                    this.enumTypeBuilder_.clear();
                }
                return this;
            }

            public final Builder removeEnumType(int i) {
                if (this.enumTypeBuilder_ == null) {
                    ensureEnumTypeIsMutable();
                    this.enumType_.remove(i);
                    onChanged();
                } else {
                    this.enumTypeBuilder_.remove(i);
                }
                return this;
            }

            public final Builder getEnumTypeBuilder(int i) {
                return (Builder) getEnumTypeFieldBuilder().getBuilder(i);
            }

            public final EnumDescriptorProtoOrBuilder getEnumTypeOrBuilder(int i) {
                if (this.enumTypeBuilder_ == null) {
                    return (EnumDescriptorProtoOrBuilder) this.enumType_.get(i);
                }
                return (EnumDescriptorProtoOrBuilder) this.enumTypeBuilder_.getMessageOrBuilder(i);
            }

            public final List<? extends EnumDescriptorProtoOrBuilder> getEnumTypeOrBuilderList() {
                if (this.enumTypeBuilder_ != null) {
                    return this.enumTypeBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.enumType_);
            }

            public final Builder addEnumTypeBuilder() {
                return (Builder) getEnumTypeFieldBuilder().addBuilder(EnumDescriptorProto.getDefaultInstance());
            }

            public final Builder addEnumTypeBuilder(int i) {
                return (Builder) getEnumTypeFieldBuilder().addBuilder(i, EnumDescriptorProto.getDefaultInstance());
            }

            public final List<Builder> getEnumTypeBuilderList() {
                return getEnumTypeFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<EnumDescriptorProto, Builder, EnumDescriptorProtoOrBuilder> getEnumTypeFieldBuilder() {
                if (this.enumTypeBuilder_ == null) {
                    this.enumTypeBuilder_ = new RepeatedFieldBuilder(this.enumType_, (this.bitField0_ & 16) == 16, getParentForChildren(), isClean());
                    this.enumType_ = null;
                }
                return this.enumTypeBuilder_;
            }

            private void ensureExtensionRangeIsMutable() {
                if ((this.bitField0_ & 32) != 32) {
                    this.extensionRange_ = new ArrayList(this.extensionRange_);
                    this.bitField0_ |= 32;
                }
            }

            public final List<ExtensionRange> getExtensionRangeList() {
                if (this.extensionRangeBuilder_ == null) {
                    return Collections.unmodifiableList(this.extensionRange_);
                }
                return this.extensionRangeBuilder_.getMessageList();
            }

            public final int getExtensionRangeCount() {
                if (this.extensionRangeBuilder_ == null) {
                    return this.extensionRange_.size();
                }
                return this.extensionRangeBuilder_.getCount();
            }

            public final ExtensionRange getExtensionRange(int i) {
                if (this.extensionRangeBuilder_ == null) {
                    return (ExtensionRange) this.extensionRange_.get(i);
                }
                return (ExtensionRange) this.extensionRangeBuilder_.getMessage(i);
            }

            public final Builder setExtensionRange(int i, ExtensionRange extensionRange) {
                if (this.extensionRangeBuilder_ != null) {
                    this.extensionRangeBuilder_.setMessage(i, extensionRange);
                } else if (extensionRange == null) {
                    throw new NullPointerException();
                } else {
                    ensureExtensionRangeIsMutable();
                    this.extensionRange_.set(i, extensionRange);
                    onChanged();
                }
                return this;
            }

            public final Builder setExtensionRange(int i, Builder builder) {
                if (this.extensionRangeBuilder_ == null) {
                    ensureExtensionRangeIsMutable();
                    this.extensionRange_.set(i, builder.build());
                    onChanged();
                } else {
                    this.extensionRangeBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addExtensionRange(ExtensionRange extensionRange) {
                if (this.extensionRangeBuilder_ != null) {
                    this.extensionRangeBuilder_.addMessage(extensionRange);
                } else if (extensionRange == null) {
                    throw new NullPointerException();
                } else {
                    ensureExtensionRangeIsMutable();
                    this.extensionRange_.add(extensionRange);
                    onChanged();
                }
                return this;
            }

            public final Builder addExtensionRange(int i, ExtensionRange extensionRange) {
                if (this.extensionRangeBuilder_ != null) {
                    this.extensionRangeBuilder_.addMessage(i, extensionRange);
                } else if (extensionRange == null) {
                    throw new NullPointerException();
                } else {
                    ensureExtensionRangeIsMutable();
                    this.extensionRange_.add(i, extensionRange);
                    onChanged();
                }
                return this;
            }

            public final Builder addExtensionRange(Builder builder) {
                if (this.extensionRangeBuilder_ == null) {
                    ensureExtensionRangeIsMutable();
                    this.extensionRange_.add(builder.build());
                    onChanged();
                } else {
                    this.extensionRangeBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public final Builder addExtensionRange(int i, Builder builder) {
                if (this.extensionRangeBuilder_ == null) {
                    ensureExtensionRangeIsMutable();
                    this.extensionRange_.add(i, builder.build());
                    onChanged();
                } else {
                    this.extensionRangeBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addAllExtensionRange(Iterable<? extends ExtensionRange> iterable) {
                if (this.extensionRangeBuilder_ == null) {
                    ensureExtensionRangeIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.extensionRange_);
                    onChanged();
                } else {
                    this.extensionRangeBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public final Builder clearExtensionRange() {
                if (this.extensionRangeBuilder_ == null) {
                    this.extensionRange_ = Collections.emptyList();
                    this.bitField0_ &= -33;
                    onChanged();
                } else {
                    this.extensionRangeBuilder_.clear();
                }
                return this;
            }

            public final Builder removeExtensionRange(int i) {
                if (this.extensionRangeBuilder_ == null) {
                    ensureExtensionRangeIsMutable();
                    this.extensionRange_.remove(i);
                    onChanged();
                } else {
                    this.extensionRangeBuilder_.remove(i);
                }
                return this;
            }

            public final Builder getExtensionRangeBuilder(int i) {
                return (Builder) getExtensionRangeFieldBuilder().getBuilder(i);
            }

            public final ExtensionRangeOrBuilder getExtensionRangeOrBuilder(int i) {
                if (this.extensionRangeBuilder_ == null) {
                    return (ExtensionRangeOrBuilder) this.extensionRange_.get(i);
                }
                return (ExtensionRangeOrBuilder) this.extensionRangeBuilder_.getMessageOrBuilder(i);
            }

            public final List<? extends ExtensionRangeOrBuilder> getExtensionRangeOrBuilderList() {
                if (this.extensionRangeBuilder_ != null) {
                    return this.extensionRangeBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.extensionRange_);
            }

            public final Builder addExtensionRangeBuilder() {
                return (Builder) getExtensionRangeFieldBuilder().addBuilder(ExtensionRange.getDefaultInstance());
            }

            public final Builder addExtensionRangeBuilder(int i) {
                return (Builder) getExtensionRangeFieldBuilder().addBuilder(i, ExtensionRange.getDefaultInstance());
            }

            public final List<Builder> getExtensionRangeBuilderList() {
                return getExtensionRangeFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<ExtensionRange, Builder, ExtensionRangeOrBuilder> getExtensionRangeFieldBuilder() {
                if (this.extensionRangeBuilder_ == null) {
                    this.extensionRangeBuilder_ = new RepeatedFieldBuilder(this.extensionRange_, (this.bitField0_ & 32) == 32, getParentForChildren(), isClean());
                    this.extensionRange_ = null;
                }
                return this.extensionRangeBuilder_;
            }

            private void ensureOneofDeclIsMutable() {
                if ((this.bitField0_ & 64) != 64) {
                    this.oneofDecl_ = new ArrayList(this.oneofDecl_);
                    this.bitField0_ |= 64;
                }
            }

            public final List<OneofDescriptorProto> getOneofDeclList() {
                if (this.oneofDeclBuilder_ == null) {
                    return Collections.unmodifiableList(this.oneofDecl_);
                }
                return this.oneofDeclBuilder_.getMessageList();
            }

            public final int getOneofDeclCount() {
                if (this.oneofDeclBuilder_ == null) {
                    return this.oneofDecl_.size();
                }
                return this.oneofDeclBuilder_.getCount();
            }

            public final OneofDescriptorProto getOneofDecl(int i) {
                if (this.oneofDeclBuilder_ == null) {
                    return (OneofDescriptorProto) this.oneofDecl_.get(i);
                }
                return (OneofDescriptorProto) this.oneofDeclBuilder_.getMessage(i);
            }

            public final Builder setOneofDecl(int i, OneofDescriptorProto oneofDescriptorProto) {
                if (this.oneofDeclBuilder_ != null) {
                    this.oneofDeclBuilder_.setMessage(i, oneofDescriptorProto);
                } else if (oneofDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureOneofDeclIsMutable();
                    this.oneofDecl_.set(i, oneofDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder setOneofDecl(int i, Builder builder) {
                if (this.oneofDeclBuilder_ == null) {
                    ensureOneofDeclIsMutable();
                    this.oneofDecl_.set(i, builder.build());
                    onChanged();
                } else {
                    this.oneofDeclBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addOneofDecl(OneofDescriptorProto oneofDescriptorProto) {
                if (this.oneofDeclBuilder_ != null) {
                    this.oneofDeclBuilder_.addMessage(oneofDescriptorProto);
                } else if (oneofDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureOneofDeclIsMutable();
                    this.oneofDecl_.add(oneofDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder addOneofDecl(int i, OneofDescriptorProto oneofDescriptorProto) {
                if (this.oneofDeclBuilder_ != null) {
                    this.oneofDeclBuilder_.addMessage(i, oneofDescriptorProto);
                } else if (oneofDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureOneofDeclIsMutable();
                    this.oneofDecl_.add(i, oneofDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder addOneofDecl(Builder builder) {
                if (this.oneofDeclBuilder_ == null) {
                    ensureOneofDeclIsMutable();
                    this.oneofDecl_.add(builder.build());
                    onChanged();
                } else {
                    this.oneofDeclBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public final Builder addOneofDecl(int i, Builder builder) {
                if (this.oneofDeclBuilder_ == null) {
                    ensureOneofDeclIsMutable();
                    this.oneofDecl_.add(i, builder.build());
                    onChanged();
                } else {
                    this.oneofDeclBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addAllOneofDecl(Iterable<? extends OneofDescriptorProto> iterable) {
                if (this.oneofDeclBuilder_ == null) {
                    ensureOneofDeclIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.oneofDecl_);
                    onChanged();
                } else {
                    this.oneofDeclBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public final Builder clearOneofDecl() {
                if (this.oneofDeclBuilder_ == null) {
                    this.oneofDecl_ = Collections.emptyList();
                    this.bitField0_ &= -65;
                    onChanged();
                } else {
                    this.oneofDeclBuilder_.clear();
                }
                return this;
            }

            public final Builder removeOneofDecl(int i) {
                if (this.oneofDeclBuilder_ == null) {
                    ensureOneofDeclIsMutable();
                    this.oneofDecl_.remove(i);
                    onChanged();
                } else {
                    this.oneofDeclBuilder_.remove(i);
                }
                return this;
            }

            public final Builder getOneofDeclBuilder(int i) {
                return (Builder) getOneofDeclFieldBuilder().getBuilder(i);
            }

            public final OneofDescriptorProtoOrBuilder getOneofDeclOrBuilder(int i) {
                if (this.oneofDeclBuilder_ == null) {
                    return (OneofDescriptorProtoOrBuilder) this.oneofDecl_.get(i);
                }
                return (OneofDescriptorProtoOrBuilder) this.oneofDeclBuilder_.getMessageOrBuilder(i);
            }

            public final List<? extends OneofDescriptorProtoOrBuilder> getOneofDeclOrBuilderList() {
                if (this.oneofDeclBuilder_ != null) {
                    return this.oneofDeclBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.oneofDecl_);
            }

            public final Builder addOneofDeclBuilder() {
                return (Builder) getOneofDeclFieldBuilder().addBuilder(OneofDescriptorProto.getDefaultInstance());
            }

            public final Builder addOneofDeclBuilder(int i) {
                return (Builder) getOneofDeclFieldBuilder().addBuilder(i, OneofDescriptorProto.getDefaultInstance());
            }

            public final List<Builder> getOneofDeclBuilderList() {
                return getOneofDeclFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<OneofDescriptorProto, Builder, OneofDescriptorProtoOrBuilder> getOneofDeclFieldBuilder() {
                if (this.oneofDeclBuilder_ == null) {
                    this.oneofDeclBuilder_ = new RepeatedFieldBuilder(this.oneofDecl_, (this.bitField0_ & 64) == 64, getParentForChildren(), isClean());
                    this.oneofDecl_ = null;
                }
                return this.oneofDeclBuilder_;
            }

            public final boolean hasOptions() {
                return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) == AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS;
            }

            public final MessageOptions getOptions() {
                if (this.optionsBuilder_ == null) {
                    return this.options_;
                }
                return (MessageOptions) this.optionsBuilder_.getMessage();
            }

            public final Builder setOptions(MessageOptions messageOptions) {
                if (this.optionsBuilder_ != null) {
                    this.optionsBuilder_.setMessage(messageOptions);
                } else if (messageOptions == null) {
                    throw new NullPointerException();
                } else {
                    this.options_ = messageOptions;
                    onChanged();
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS;
                return this;
            }

            public final Builder setOptions(Builder builder) {
                if (this.optionsBuilder_ == null) {
                    this.options_ = builder.build();
                    onChanged();
                } else {
                    this.optionsBuilder_.setMessage(builder.build());
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS;
                return this;
            }

            public final Builder mergeOptions(MessageOptions messageOptions) {
                if (this.optionsBuilder_ == null) {
                    if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) != AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS || this.options_ == MessageOptions.getDefaultInstance()) {
                        this.options_ = messageOptions;
                    } else {
                        this.options_ = MessageOptions.newBuilder(this.options_).mergeFrom(messageOptions).buildPartial();
                    }
                    onChanged();
                } else {
                    this.optionsBuilder_.mergeFrom(messageOptions);
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS;
                return this;
            }

            public final Builder clearOptions() {
                if (this.optionsBuilder_ == null) {
                    this.options_ = MessageOptions.getDefaultInstance();
                    onChanged();
                } else {
                    this.optionsBuilder_.clear();
                }
                this.bitField0_ &= -129;
                return this;
            }

            public final Builder getOptionsBuilder() {
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS;
                onChanged();
                return (Builder) getOptionsFieldBuilder().getBuilder();
            }

            public final MessageOptionsOrBuilder getOptionsOrBuilder() {
                if (this.optionsBuilder_ != null) {
                    return (MessageOptionsOrBuilder) this.optionsBuilder_.getMessageOrBuilder();
                }
                return this.options_;
            }

            private SingleFieldBuilder<MessageOptions, Builder, MessageOptionsOrBuilder> getOptionsFieldBuilder() {
                if (this.optionsBuilder_ == null) {
                    this.optionsBuilder_ = new SingleFieldBuilder(getOptions(), getParentForChildren(), isClean());
                    this.options_ = null;
                }
                return this.optionsBuilder_;
            }
        }

        public interface ExtensionRangeOrBuilder extends MessageOrBuilder {
            int getEnd();

            int getStart();

            boolean hasEnd();

            boolean hasStart();
        }

        public static final class ExtensionRange extends GeneratedMessage implements ExtensionRangeOrBuilder {
            public static final int END_FIELD_NUMBER = 2;
            public static Parser<ExtensionRange> PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private static final ExtensionRange defaultInstance;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private int end_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            private int start_;
            private final UnknownFieldSet unknownFields;

            /* renamed from: com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.1 */
            static class C02791 extends AbstractParser<ExtensionRange> {
                C02791() {
                }

                public final ExtensionRange parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new ExtensionRange(extensionRegistryLite, null);
                }
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements ExtensionRangeOrBuilder {
                private int bitField0_;
                private int end_;
                private int start_;

                public static final Descriptor getDescriptor() {
                    return DescriptorProtos.f2773x1458f8d;
                }

                protected final FieldAccessorTable internalGetFieldAccessorTable() {
                    return DescriptorProtos.f2774xf366d90b.ensureFieldAccessorsInitialized(ExtensionRange.class, Builder.class);
                }

                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(BuilderParent builderParent) {
                    super(builderParent);
                    maybeForceBuilderInitialization();
                }

                private void maybeForceBuilderInitialization() {
                    boolean z = GeneratedMessage.alwaysUseFieldBuilders;
                }

                private static Builder create() {
                    return new Builder();
                }

                public final Builder clear() {
                    super.clear();
                    this.start_ = 0;
                    this.bitField0_ &= -2;
                    this.end_ = 0;
                    this.bitField0_ &= -3;
                    return this;
                }

                public final Builder clone() {
                    return create().mergeFrom(buildPartial());
                }

                public final Descriptor getDescriptorForType() {
                    return DescriptorProtos.f2773x1458f8d;
                }

                public final ExtensionRange getDefaultInstanceForType() {
                    return ExtensionRange.getDefaultInstance();
                }

                public final ExtensionRange build() {
                    Object buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
                }

                public final ExtensionRange buildPartial() {
                    int i = ExtensionRange.START_FIELD_NUMBER;
                    ExtensionRange extensionRange = new ExtensionRange(null);
                    int i2 = this.bitField0_;
                    if ((i2 & ExtensionRange.START_FIELD_NUMBER) != ExtensionRange.START_FIELD_NUMBER) {
                        i = 0;
                    }
                    extensionRange.start_ = this.start_;
                    if ((i2 & ExtensionRange.END_FIELD_NUMBER) == ExtensionRange.END_FIELD_NUMBER) {
                        i |= ExtensionRange.END_FIELD_NUMBER;
                    }
                    extensionRange.end_ = this.end_;
                    extensionRange.bitField0_ = i;
                    onBuilt();
                    return extensionRange;
                }

                public final Builder mergeFrom(Message message) {
                    if (message instanceof ExtensionRange) {
                        return mergeFrom((ExtensionRange) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public final Builder mergeFrom(ExtensionRange extensionRange) {
                    if (extensionRange != ExtensionRange.getDefaultInstance()) {
                        if (extensionRange.hasStart()) {
                            setStart(extensionRange.getStart());
                        }
                        if (extensionRange.hasEnd()) {
                            setEnd(extensionRange.getEnd());
                        }
                        mergeUnknownFields(extensionRange.getUnknownFields());
                    }
                    return this;
                }

                public final boolean isInitialized() {
                    return true;
                }

                /* JADX WARNING: inconsistent code. */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.Builder mergeFrom(com.google.protobuf.CodedInputStream r5, com.google.protobuf.ExtensionRegistryLite r6) {
                    /*
                    r4 = this;
                    r2 = 0;
                    r0 = com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                    r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                    r0 = (com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange) r0;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                    if (r0 == 0) goto L_0x000e;
                L_0x000b:
                    r4.mergeFrom(r0);
                L_0x000e:
                    return r4;
                L_0x000f:
                    r0 = move-exception;
                    r1 = r0;
                    r0 = r1.getUnfinishedMessage();	 Catch:{ all -> 0x0022 }
                    r0 = (com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange) r0;	 Catch:{ all -> 0x0022 }
                    throw r1;	 Catch:{ all -> 0x0018 }
                L_0x0018:
                    r1 = move-exception;
                    r3 = r1;
                    r1 = r0;
                    r0 = r3;
                L_0x001c:
                    if (r1 == 0) goto L_0x0021;
                L_0x001e:
                    r4.mergeFrom(r1);
                L_0x0021:
                    throw r0;
                L_0x0022:
                    r0 = move-exception;
                    r1 = r2;
                    goto L_0x001c;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRange$Builder");
                }

                public final boolean hasStart() {
                    return (this.bitField0_ & ExtensionRange.START_FIELD_NUMBER) == ExtensionRange.START_FIELD_NUMBER;
                }

                public final int getStart() {
                    return this.start_;
                }

                public final Builder setStart(int i) {
                    this.bitField0_ |= ExtensionRange.START_FIELD_NUMBER;
                    this.start_ = i;
                    onChanged();
                    return this;
                }

                public final Builder clearStart() {
                    this.bitField0_ &= -2;
                    this.start_ = 0;
                    onChanged();
                    return this;
                }

                public final boolean hasEnd() {
                    return (this.bitField0_ & ExtensionRange.END_FIELD_NUMBER) == ExtensionRange.END_FIELD_NUMBER;
                }

                public final int getEnd() {
                    return this.end_;
                }

                public final Builder setEnd(int i) {
                    this.bitField0_ |= ExtensionRange.END_FIELD_NUMBER;
                    this.end_ = i;
                    onChanged();
                    return this;
                }

                public final Builder clearEnd() {
                    this.bitField0_ &= -3;
                    this.end_ = 0;
                    onChanged();
                    return this;
                }
            }

            private ExtensionRange(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = builder.getUnknownFields();
            }

            private ExtensionRange(boolean z) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = UnknownFieldSet.getDefaultInstance();
            }

            public static ExtensionRange getDefaultInstance() {
                return defaultInstance;
            }

            public final ExtensionRange getDefaultInstanceForType() {
                return defaultInstance;
            }

            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            private ExtensionRange(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                initFields();
                com.google.protobuf.UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                Object obj = null;
                while (obj == null) {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case SQLiteDatabase.OPEN_READWRITE /*0*/:
                                obj = START_FIELD_NUMBER;
                                break;
                            case DescriptorProto.ONEOF_DECL_FIELD_NUMBER /*8*/:
                                this.bitField0_ |= START_FIELD_NUMBER;
                                this.start_ = codedInputStream.readInt32();
                                break;
                            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                                this.bitField0_ |= END_FIELD_NUMBER;
                                this.end_ = codedInputStream.readInt32();
                                break;
                            default:
                                if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                    obj = START_FIELD_NUMBER;
                                    break;
                                }
                                break;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                    }
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }

            public static final Descriptor getDescriptor() {
                return DescriptorProtos.f2773x1458f8d;
            }

            protected final FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.f2774xf366d90b.ensureFieldAccessorsInitialized(ExtensionRange.class, Builder.class);
            }

            static {
                PARSER = new C02791();
                ExtensionRange extensionRange = new ExtensionRange(true);
                defaultInstance = extensionRange;
                extensionRange.initFields();
            }

            public final Parser<ExtensionRange> getParserForType() {
                return PARSER;
            }

            public final boolean hasStart() {
                return (this.bitField0_ & START_FIELD_NUMBER) == START_FIELD_NUMBER;
            }

            public final int getStart() {
                return this.start_;
            }

            public final boolean hasEnd() {
                return (this.bitField0_ & END_FIELD_NUMBER) == END_FIELD_NUMBER;
            }

            public final int getEnd() {
                return this.end_;
            }

            private void initFields() {
                this.start_ = 0;
                this.end_ = 0;
            }

            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == (byte) 1) {
                    return true;
                }
                if (b == null) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            public final void writeTo(CodedOutputStream codedOutputStream) {
                getSerializedSize();
                if ((this.bitField0_ & START_FIELD_NUMBER) == START_FIELD_NUMBER) {
                    codedOutputStream.writeInt32(START_FIELD_NUMBER, this.start_);
                }
                if ((this.bitField0_ & END_FIELD_NUMBER) == END_FIELD_NUMBER) {
                    codedOutputStream.writeInt32(END_FIELD_NUMBER, this.end_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public final int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                i = 0;
                if ((this.bitField0_ & START_FIELD_NUMBER) == START_FIELD_NUMBER) {
                    i = CodedOutputStream.computeInt32Size(START_FIELD_NUMBER, this.start_) + 0;
                }
                if ((this.bitField0_ & END_FIELD_NUMBER) == END_FIELD_NUMBER) {
                    i += CodedOutputStream.computeInt32Size(END_FIELD_NUMBER, this.end_);
                }
                i += getUnknownFields().getSerializedSize();
                this.memoizedSerializedSize = i;
                return i;
            }

            protected final Object writeReplace() {
                return super.writeReplace();
            }

            public static ExtensionRange parseFrom(ByteString byteString) {
                return (ExtensionRange) PARSER.parseFrom(byteString);
            }

            public static ExtensionRange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ExtensionRange) PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static ExtensionRange parseFrom(byte[] bArr) {
                return (ExtensionRange) PARSER.parseFrom(bArr);
            }

            public static ExtensionRange parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ExtensionRange) PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static ExtensionRange parseFrom(InputStream inputStream) {
                return (ExtensionRange) PARSER.parseFrom(inputStream);
            }

            public static ExtensionRange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ExtensionRange) PARSER.parseFrom(inputStream, extensionRegistryLite);
            }

            public static ExtensionRange parseDelimitedFrom(InputStream inputStream) {
                return (ExtensionRange) PARSER.parseDelimitedFrom(inputStream);
            }

            public static ExtensionRange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ExtensionRange) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
            }

            public static ExtensionRange parseFrom(CodedInputStream codedInputStream) {
                return (ExtensionRange) PARSER.parseFrom(codedInputStream);
            }

            public static ExtensionRange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ExtensionRange) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
            }

            public static Builder newBuilder() {
                return Builder.create();
            }

            public final Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder(ExtensionRange extensionRange) {
                return newBuilder().mergeFrom(extensionRange);
            }

            public final Builder toBuilder() {
                return newBuilder(this);
            }

            protected final Builder newBuilderForType(BuilderParent builderParent) {
                return new Builder(null);
            }
        }

        private DescriptorProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private DescriptorProto(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static DescriptorProto getDefaultInstance() {
            return defaultInstance;
        }

        public final DescriptorProto getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private DescriptorProto(com.google.protobuf.CodedInputStream r12, com.google.protobuf.ExtensionRegistryLite r13) {
            /*
            r11 = this;
            r9 = 32;
            r8 = 16;
            r7 = 8;
            r6 = 4;
            r5 = 2;
            r11.<init>();
            r0 = -1;
            r11.memoizedIsInitialized = r0;
            r0 = -1;
            r11.memoizedSerializedSize = r0;
            r11.initFields();
            r1 = 0;
            r4 = com.google.protobuf.UnknownFieldSet.newBuilder();
            r0 = 0;
            r3 = r0;
        L_0x001b:
            if (r3 != 0) goto L_0x0173;
        L_0x001d:
            r0 = r12.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            switch(r0) {
                case 0: goto L_0x002d;
                case 10: goto L_0x0030;
                case 18: goto L_0x0098;
                case 26: goto L_0x00c1;
                case 34: goto L_0x00db;
                case 42: goto L_0x00f5;
                case 50: goto L_0x010f;
                case 58: goto L_0x0129;
                case 66: goto L_0x0156;
                default: goto L_0x0024;
            };	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
        L_0x0024:
            r0 = r11.parseUnknownField(r12, r4, r13, r0);	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            if (r0 != 0) goto L_0x01de;
        L_0x002a:
            r0 = 1;
            r3 = r0;
            goto L_0x001b;
        L_0x002d:
            r0 = 1;
            r3 = r0;
            goto L_0x001b;
        L_0x0030:
            r0 = r12.readBytes();	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r2 = r11.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r2 = r2 | 1;
            r11.bitField0_ = r2;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r11.name_ = r0;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            goto L_0x001b;
        L_0x003d:
            r0 = move-exception;
        L_0x003e:
            r0 = r0.setUnfinishedMessage(r11);	 Catch:{ all -> 0x0043 }
            throw r0;	 Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception;
        L_0x0044:
            r2 = r1 & 2;
            if (r2 != r5) goto L_0x0050;
        L_0x0048:
            r2 = r11.field_;
            r2 = java.util.Collections.unmodifiableList(r2);
            r11.field_ = r2;
        L_0x0050:
            r2 = r1 & 8;
            if (r2 != r7) goto L_0x005c;
        L_0x0054:
            r2 = r11.nestedType_;
            r2 = java.util.Collections.unmodifiableList(r2);
            r11.nestedType_ = r2;
        L_0x005c:
            r2 = r1 & 16;
            if (r2 != r8) goto L_0x0068;
        L_0x0060:
            r2 = r11.enumType_;
            r2 = java.util.Collections.unmodifiableList(r2);
            r11.enumType_ = r2;
        L_0x0068:
            r2 = r1 & 32;
            if (r2 != r9) goto L_0x0074;
        L_0x006c:
            r2 = r11.extensionRange_;
            r2 = java.util.Collections.unmodifiableList(r2);
            r11.extensionRange_ = r2;
        L_0x0074:
            r2 = r1 & 4;
            if (r2 != r6) goto L_0x0080;
        L_0x0078:
            r2 = r11.extension_;
            r2 = java.util.Collections.unmodifiableList(r2);
            r11.extension_ = r2;
        L_0x0080:
            r1 = r1 & 64;
            r2 = 64;
            if (r1 != r2) goto L_0x008e;
        L_0x0086:
            r1 = r11.oneofDecl_;
            r1 = java.util.Collections.unmodifiableList(r1);
            r11.oneofDecl_ = r1;
        L_0x008e:
            r1 = r4.build();
            r11.unknownFields = r1;
            r11.makeExtensionsImmutable();
            throw r0;
        L_0x0098:
            r0 = r1 & 2;
            if (r0 == r5) goto L_0x00a5;
        L_0x009c:
            r0 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r0.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r11.field_ = r0;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r1 = r1 | 2;
        L_0x00a5:
            r0 = r11.field_;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r2 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r2 = r12.readMessage(r2, r13);	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r0.add(r2);	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            goto L_0x001b;
        L_0x00b2:
            r0 = move-exception;
        L_0x00b3:
            r2 = new com.google.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x0043 }
            r0 = r0.getMessage();	 Catch:{ all -> 0x0043 }
            r2.<init>(r0);	 Catch:{ all -> 0x0043 }
            r0 = r2.setUnfinishedMessage(r11);	 Catch:{ all -> 0x0043 }
            throw r0;	 Catch:{ all -> 0x0043 }
        L_0x00c1:
            r0 = r1 & 8;
            if (r0 == r7) goto L_0x00ce;
        L_0x00c5:
            r0 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r0.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r11.nestedType_ = r0;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r1 = r1 | 8;
        L_0x00ce:
            r0 = r11.nestedType_;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r2 = PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r2 = r12.readMessage(r2, r13);	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r0.add(r2);	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            goto L_0x001b;
        L_0x00db:
            r0 = r1 & 16;
            if (r0 == r8) goto L_0x00e8;
        L_0x00df:
            r0 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r0.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r11.enumType_ = r0;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r1 = r1 | 16;
        L_0x00e8:
            r0 = r11.enumType_;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r2 = com.google.protobuf.DescriptorProtos.EnumDescriptorProto.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r2 = r12.readMessage(r2, r13);	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r0.add(r2);	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            goto L_0x001b;
        L_0x00f5:
            r0 = r1 & 32;
            if (r0 == r9) goto L_0x0102;
        L_0x00f9:
            r0 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r0.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r11.extensionRange_ = r0;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r1 = r1 | 32;
        L_0x0102:
            r0 = r11.extensionRange_;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r2 = com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r2 = r12.readMessage(r2, r13);	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r0.add(r2);	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            goto L_0x001b;
        L_0x010f:
            r0 = r1 & 4;
            if (r0 == r6) goto L_0x011c;
        L_0x0113:
            r0 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r0.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r11.extension_ = r0;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r1 = r1 | 4;
        L_0x011c:
            r0 = r11.extension_;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r2 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r2 = r12.readMessage(r2, r13);	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r0.add(r2);	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            goto L_0x001b;
        L_0x0129:
            r0 = 0;
            r2 = r11.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r2 = r2 & 2;
            if (r2 != r5) goto L_0x01db;
        L_0x0130:
            r0 = r11.options_;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r0 = r0.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r2 = r0;
        L_0x0137:
            r0 = com.google.protobuf.DescriptorProtos.MessageOptions.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r0 = r12.readMessage(r0, r13);	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r0 = (com.google.protobuf.DescriptorProtos.MessageOptions) r0;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r11.options_ = r0;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            if (r2 == 0) goto L_0x014e;
        L_0x0143:
            r0 = r11.options_;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r2.mergeFrom(r0);	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r0 = r2.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r11.options_ = r0;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
        L_0x014e:
            r0 = r11.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r0 = r0 | 2;
            r11.bitField0_ = r0;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            goto L_0x001b;
        L_0x0156:
            r0 = r1 & 64;
            r2 = 64;
            if (r0 == r2) goto L_0x01d9;
        L_0x015c:
            r0 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r0.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r11.oneofDecl_ = r0;	 Catch:{ InvalidProtocolBufferException -> 0x003d, IOException -> 0x00b2 }
            r0 = r1 | 64;
        L_0x0165:
            r1 = r11.oneofDecl_;	 Catch:{ InvalidProtocolBufferException -> 0x01d3, IOException -> 0x01cd, all -> 0x01c7 }
            r2 = com.google.protobuf.DescriptorProtos.OneofDescriptorProto.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x01d3, IOException -> 0x01cd, all -> 0x01c7 }
            r2 = r12.readMessage(r2, r13);	 Catch:{ InvalidProtocolBufferException -> 0x01d3, IOException -> 0x01cd, all -> 0x01c7 }
            r1.add(r2);	 Catch:{ InvalidProtocolBufferException -> 0x01d3, IOException -> 0x01cd, all -> 0x01c7 }
        L_0x0170:
            r1 = r0;
            goto L_0x001b;
        L_0x0173:
            r0 = r1 & 2;
            if (r0 != r5) goto L_0x017f;
        L_0x0177:
            r0 = r11.field_;
            r0 = java.util.Collections.unmodifiableList(r0);
            r11.field_ = r0;
        L_0x017f:
            r0 = r1 & 8;
            if (r0 != r7) goto L_0x018b;
        L_0x0183:
            r0 = r11.nestedType_;
            r0 = java.util.Collections.unmodifiableList(r0);
            r11.nestedType_ = r0;
        L_0x018b:
            r0 = r1 & 16;
            if (r0 != r8) goto L_0x0197;
        L_0x018f:
            r0 = r11.enumType_;
            r0 = java.util.Collections.unmodifiableList(r0);
            r11.enumType_ = r0;
        L_0x0197:
            r0 = r1 & 32;
            if (r0 != r9) goto L_0x01a3;
        L_0x019b:
            r0 = r11.extensionRange_;
            r0 = java.util.Collections.unmodifiableList(r0);
            r11.extensionRange_ = r0;
        L_0x01a3:
            r0 = r1 & 4;
            if (r0 != r6) goto L_0x01af;
        L_0x01a7:
            r0 = r11.extension_;
            r0 = java.util.Collections.unmodifiableList(r0);
            r11.extension_ = r0;
        L_0x01af:
            r0 = r1 & 64;
            r1 = 64;
            if (r0 != r1) goto L_0x01bd;
        L_0x01b5:
            r0 = r11.oneofDecl_;
            r0 = java.util.Collections.unmodifiableList(r0);
            r11.oneofDecl_ = r0;
        L_0x01bd:
            r0 = r4.build();
            r11.unknownFields = r0;
            r11.makeExtensionsImmutable();
            return;
        L_0x01c7:
            r1 = move-exception;
            r10 = r1;
            r1 = r0;
            r0 = r10;
            goto L_0x0044;
        L_0x01cd:
            r1 = move-exception;
            r10 = r1;
            r1 = r0;
            r0 = r10;
            goto L_0x00b3;
        L_0x01d3:
            r1 = move-exception;
            r10 = r1;
            r1 = r0;
            r0 = r10;
            goto L_0x003e;
        L_0x01d9:
            r0 = r1;
            goto L_0x0165;
        L_0x01db:
            r2 = r0;
            goto L_0x0137;
        L_0x01de:
            r0 = r1;
            goto L_0x0170;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.DescriptorProto.<init>(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):void");
        }

        public static final Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_DescriptorProto_descriptor;
        }

        protected final FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.f2775x907d0bf0.ensureFieldAccessorsInitialized(DescriptorProto.class, Builder.class);
        }

        static {
            PARSER = new C02781();
            DescriptorProto descriptorProto = new DescriptorProto(true);
            defaultInstance = descriptorProto;
            descriptorProto.initFields();
        }

        public final Parser<DescriptorProto> getParserForType() {
            return PARSER;
        }

        public final boolean hasName() {
            return (this.bitField0_ & NAME_FIELD_NUMBER) == NAME_FIELD_NUMBER;
        }

        public final String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String toStringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = toStringUtf8;
            }
            return toStringUtf8;
        }

        public final ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final List<FieldDescriptorProto> getFieldList() {
            return this.field_;
        }

        public final List<? extends FieldDescriptorProtoOrBuilder> getFieldOrBuilderList() {
            return this.field_;
        }

        public final int getFieldCount() {
            return this.field_.size();
        }

        public final FieldDescriptorProto getField(int i) {
            return (FieldDescriptorProto) this.field_.get(i);
        }

        public final FieldDescriptorProtoOrBuilder getFieldOrBuilder(int i) {
            return (FieldDescriptorProtoOrBuilder) this.field_.get(i);
        }

        public final List<FieldDescriptorProto> getExtensionList() {
            return this.extension_;
        }

        public final List<? extends FieldDescriptorProtoOrBuilder> getExtensionOrBuilderList() {
            return this.extension_;
        }

        public final int getExtensionCount() {
            return this.extension_.size();
        }

        public final FieldDescriptorProto getExtension(int i) {
            return (FieldDescriptorProto) this.extension_.get(i);
        }

        public final FieldDescriptorProtoOrBuilder getExtensionOrBuilder(int i) {
            return (FieldDescriptorProtoOrBuilder) this.extension_.get(i);
        }

        public final List<DescriptorProto> getNestedTypeList() {
            return this.nestedType_;
        }

        public final List<? extends DescriptorProtoOrBuilder> getNestedTypeOrBuilderList() {
            return this.nestedType_;
        }

        public final int getNestedTypeCount() {
            return this.nestedType_.size();
        }

        public final DescriptorProto getNestedType(int i) {
            return (DescriptorProto) this.nestedType_.get(i);
        }

        public final DescriptorProtoOrBuilder getNestedTypeOrBuilder(int i) {
            return (DescriptorProtoOrBuilder) this.nestedType_.get(i);
        }

        public final List<EnumDescriptorProto> getEnumTypeList() {
            return this.enumType_;
        }

        public final List<? extends EnumDescriptorProtoOrBuilder> getEnumTypeOrBuilderList() {
            return this.enumType_;
        }

        public final int getEnumTypeCount() {
            return this.enumType_.size();
        }

        public final EnumDescriptorProto getEnumType(int i) {
            return (EnumDescriptorProto) this.enumType_.get(i);
        }

        public final EnumDescriptorProtoOrBuilder getEnumTypeOrBuilder(int i) {
            return (EnumDescriptorProtoOrBuilder) this.enumType_.get(i);
        }

        public final List<ExtensionRange> getExtensionRangeList() {
            return this.extensionRange_;
        }

        public final List<? extends ExtensionRangeOrBuilder> getExtensionRangeOrBuilderList() {
            return this.extensionRange_;
        }

        public final int getExtensionRangeCount() {
            return this.extensionRange_.size();
        }

        public final ExtensionRange getExtensionRange(int i) {
            return (ExtensionRange) this.extensionRange_.get(i);
        }

        public final ExtensionRangeOrBuilder getExtensionRangeOrBuilder(int i) {
            return (ExtensionRangeOrBuilder) this.extensionRange_.get(i);
        }

        public final List<OneofDescriptorProto> getOneofDeclList() {
            return this.oneofDecl_;
        }

        public final List<? extends OneofDescriptorProtoOrBuilder> getOneofDeclOrBuilderList() {
            return this.oneofDecl_;
        }

        public final int getOneofDeclCount() {
            return this.oneofDecl_.size();
        }

        public final OneofDescriptorProto getOneofDecl(int i) {
            return (OneofDescriptorProto) this.oneofDecl_.get(i);
        }

        public final OneofDescriptorProtoOrBuilder getOneofDeclOrBuilder(int i) {
            return (OneofDescriptorProtoOrBuilder) this.oneofDecl_.get(i);
        }

        public final boolean hasOptions() {
            return (this.bitField0_ & FIELD_FIELD_NUMBER) == FIELD_FIELD_NUMBER;
        }

        public final MessageOptions getOptions() {
            return this.options_;
        }

        public final MessageOptionsOrBuilder getOptionsOrBuilder() {
            return this.options_;
        }

        private void initFields() {
            this.name_ = LetterIndexBar.SEARCH_ICON_LETTER;
            this.field_ = Collections.emptyList();
            this.extension_ = Collections.emptyList();
            this.nestedType_ = Collections.emptyList();
            this.enumType_ = Collections.emptyList();
            this.extensionRange_ = Collections.emptyList();
            this.oneofDecl_ = Collections.emptyList();
            this.options_ = MessageOptions.getDefaultInstance();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == null) {
                return false;
            }
            int i = 0;
            while (i < getFieldCount()) {
                if (getField(i).isInitialized()) {
                    i += NAME_FIELD_NUMBER;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            i = 0;
            while (i < getExtensionCount()) {
                if (getExtension(i).isInitialized()) {
                    i += NAME_FIELD_NUMBER;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            i = 0;
            while (i < getNestedTypeCount()) {
                if (getNestedType(i).isInitialized()) {
                    i += NAME_FIELD_NUMBER;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            i = 0;
            while (i < getEnumTypeCount()) {
                if (getEnumType(i).isInitialized()) {
                    i += NAME_FIELD_NUMBER;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (!hasOptions() || getOptions().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) {
            int i;
            int i2 = 0;
            getSerializedSize();
            if ((this.bitField0_ & NAME_FIELD_NUMBER) == NAME_FIELD_NUMBER) {
                codedOutputStream.writeBytes(NAME_FIELD_NUMBER, getNameBytes());
            }
            for (i = 0; i < this.field_.size(); i += NAME_FIELD_NUMBER) {
                codedOutputStream.writeMessage(FIELD_FIELD_NUMBER, (MessageLite) this.field_.get(i));
            }
            for (i = 0; i < this.nestedType_.size(); i += NAME_FIELD_NUMBER) {
                codedOutputStream.writeMessage(NESTED_TYPE_FIELD_NUMBER, (MessageLite) this.nestedType_.get(i));
            }
            for (i = 0; i < this.enumType_.size(); i += NAME_FIELD_NUMBER) {
                codedOutputStream.writeMessage(ENUM_TYPE_FIELD_NUMBER, (MessageLite) this.enumType_.get(i));
            }
            for (i = 0; i < this.extensionRange_.size(); i += NAME_FIELD_NUMBER) {
                codedOutputStream.writeMessage(EXTENSION_RANGE_FIELD_NUMBER, (MessageLite) this.extensionRange_.get(i));
            }
            for (i = 0; i < this.extension_.size(); i += NAME_FIELD_NUMBER) {
                codedOutputStream.writeMessage(EXTENSION_FIELD_NUMBER, (MessageLite) this.extension_.get(i));
            }
            if ((this.bitField0_ & FIELD_FIELD_NUMBER) == FIELD_FIELD_NUMBER) {
                codedOutputStream.writeMessage(OPTIONS_FIELD_NUMBER, this.options_);
            }
            while (i2 < this.oneofDecl_.size()) {
                codedOutputStream.writeMessage(ONEOF_DECL_FIELD_NUMBER, (MessageLite) this.oneofDecl_.get(i2));
                i2 += NAME_FIELD_NUMBER;
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public final int getSerializedSize() {
            int i = 0;
            int i2 = this.memoizedSerializedSize;
            if (i2 != -1) {
                return i2;
            }
            int i3;
            if ((this.bitField0_ & NAME_FIELD_NUMBER) == NAME_FIELD_NUMBER) {
                i2 = CodedOutputStream.computeBytesSize(NAME_FIELD_NUMBER, getNameBytes()) + 0;
            } else {
                i2 = 0;
            }
            int i4 = i2;
            for (i3 = 0; i3 < this.field_.size(); i3 += NAME_FIELD_NUMBER) {
                i4 += CodedOutputStream.computeMessageSize(FIELD_FIELD_NUMBER, (MessageLite) this.field_.get(i3));
            }
            for (i3 = 0; i3 < this.nestedType_.size(); i3 += NAME_FIELD_NUMBER) {
                i4 += CodedOutputStream.computeMessageSize(NESTED_TYPE_FIELD_NUMBER, (MessageLite) this.nestedType_.get(i3));
            }
            for (i3 = 0; i3 < this.enumType_.size(); i3 += NAME_FIELD_NUMBER) {
                i4 += CodedOutputStream.computeMessageSize(ENUM_TYPE_FIELD_NUMBER, (MessageLite) this.enumType_.get(i3));
            }
            for (i3 = 0; i3 < this.extensionRange_.size(); i3 += NAME_FIELD_NUMBER) {
                i4 += CodedOutputStream.computeMessageSize(EXTENSION_RANGE_FIELD_NUMBER, (MessageLite) this.extensionRange_.get(i3));
            }
            for (i3 = 0; i3 < this.extension_.size(); i3 += NAME_FIELD_NUMBER) {
                i4 += CodedOutputStream.computeMessageSize(EXTENSION_FIELD_NUMBER, (MessageLite) this.extension_.get(i3));
            }
            if ((this.bitField0_ & FIELD_FIELD_NUMBER) == FIELD_FIELD_NUMBER) {
                i4 += CodedOutputStream.computeMessageSize(OPTIONS_FIELD_NUMBER, this.options_);
            }
            while (i < this.oneofDecl_.size()) {
                i4 += CodedOutputStream.computeMessageSize(ONEOF_DECL_FIELD_NUMBER, (MessageLite) this.oneofDecl_.get(i));
                i += NAME_FIELD_NUMBER;
            }
            i2 = getUnknownFields().getSerializedSize() + i4;
            this.memoizedSerializedSize = i2;
            return i2;
        }

        protected final Object writeReplace() {
            return super.writeReplace();
        }

        public static DescriptorProto parseFrom(ByteString byteString) {
            return (DescriptorProto) PARSER.parseFrom(byteString);
        }

        public static DescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (DescriptorProto) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DescriptorProto parseFrom(byte[] bArr) {
            return (DescriptorProto) PARSER.parseFrom(bArr);
        }

        public static DescriptorProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (DescriptorProto) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DescriptorProto parseFrom(InputStream inputStream) {
            return (DescriptorProto) PARSER.parseFrom(inputStream);
        }

        public static DescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DescriptorProto) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static DescriptorProto parseDelimitedFrom(InputStream inputStream) {
            return (DescriptorProto) PARSER.parseDelimitedFrom(inputStream);
        }

        public static DescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DescriptorProto) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static DescriptorProto parseFrom(CodedInputStream codedInputStream) {
            return (DescriptorProto) PARSER.parseFrom(codedInputStream);
        }

        public static DescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DescriptorProto) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(DescriptorProto descriptorProto) {
            return newBuilder().mergeFrom(descriptorProto);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        protected final Builder newBuilderForType(BuilderParent builderParent) {
            return new Builder(null);
        }
    }

    public interface EnumDescriptorProtoOrBuilder extends MessageOrBuilder {
        String getName();

        ByteString getNameBytes();

        EnumOptions getOptions();

        EnumOptionsOrBuilder getOptionsOrBuilder();

        EnumValueDescriptorProto getValue(int i);

        int getValueCount();

        List<EnumValueDescriptorProto> getValueList();

        EnumValueDescriptorProtoOrBuilder getValueOrBuilder(int i);

        List<? extends EnumValueDescriptorProtoOrBuilder> getValueOrBuilderList();

        boolean hasName();

        boolean hasOptions();
    }

    public static final class EnumDescriptorProto extends GeneratedMessage implements EnumDescriptorProtoOrBuilder {
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        public static Parser<EnumDescriptorProto> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 2;
        private static final EnumDescriptorProto defaultInstance;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object name_;
        private EnumOptions options_;
        private final UnknownFieldSet unknownFields;
        private List<EnumValueDescriptorProto> value_;

        /* renamed from: com.google.protobuf.DescriptorProtos.EnumDescriptorProto.1 */
        static class C02801 extends AbstractParser<EnumDescriptorProto> {
            C02801() {
            }

            public final EnumDescriptorProto parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new EnumDescriptorProto(extensionRegistryLite, null);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements EnumDescriptorProtoOrBuilder {
            private int bitField0_;
            private Object name_;
            private SingleFieldBuilder<EnumOptions, Builder, EnumOptionsOrBuilder> optionsBuilder_;
            private EnumOptions options_;
            private RepeatedFieldBuilder<EnumValueDescriptorProto, Builder, EnumValueDescriptorProtoOrBuilder> valueBuilder_;
            private List<EnumValueDescriptorProto> value_;

            public static final Descriptor getDescriptor() {
                return DescriptorProtos.internal_static_google_protobuf_EnumDescriptorProto_descriptor;
            }

            protected final FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.f2776x9945f651.ensureFieldAccessorsInitialized(EnumDescriptorProto.class, Builder.class);
            }

            private Builder() {
                this.name_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.value_ = Collections.emptyList();
                this.options_ = EnumOptions.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent builderParent) {
                super(builderParent);
                this.name_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.value_ = Collections.emptyList();
                this.options_ = EnumOptions.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    getValueFieldBuilder();
                    getOptionsFieldBuilder();
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public final Builder clear() {
                super.clear();
                this.name_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.bitField0_ &= -2;
                if (this.valueBuilder_ == null) {
                    this.value_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                } else {
                    this.valueBuilder_.clear();
                }
                if (this.optionsBuilder_ == null) {
                    this.options_ = EnumOptions.getDefaultInstance();
                } else {
                    this.optionsBuilder_.clear();
                }
                this.bitField0_ &= -5;
                return this;
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_EnumDescriptorProto_descriptor;
            }

            public final EnumDescriptorProto getDefaultInstanceForType() {
                return EnumDescriptorProto.getDefaultInstance();
            }

            public final EnumDescriptorProto build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
            }

            public final EnumDescriptorProto buildPartial() {
                int i;
                int i2 = EnumDescriptorProto.NAME_FIELD_NUMBER;
                EnumDescriptorProto enumDescriptorProto = new EnumDescriptorProto(null);
                int i3 = this.bitField0_;
                if ((i3 & EnumDescriptorProto.NAME_FIELD_NUMBER) != EnumDescriptorProto.NAME_FIELD_NUMBER) {
                    i2 = 0;
                }
                enumDescriptorProto.name_ = this.name_;
                if (this.valueBuilder_ == null) {
                    if ((this.bitField0_ & EnumDescriptorProto.VALUE_FIELD_NUMBER) == EnumDescriptorProto.VALUE_FIELD_NUMBER) {
                        this.value_ = Collections.unmodifiableList(this.value_);
                        this.bitField0_ &= -3;
                    }
                    enumDescriptorProto.value_ = this.value_;
                } else {
                    enumDescriptorProto.value_ = this.valueBuilder_.build();
                }
                if ((i3 & 4) == 4) {
                    i = i2 | EnumDescriptorProto.VALUE_FIELD_NUMBER;
                } else {
                    i = i2;
                }
                if (this.optionsBuilder_ == null) {
                    enumDescriptorProto.options_ = this.options_;
                } else {
                    enumDescriptorProto.options_ = (EnumOptions) this.optionsBuilder_.build();
                }
                enumDescriptorProto.bitField0_ = i;
                onBuilt();
                return enumDescriptorProto;
            }

            public final Builder mergeFrom(Message message) {
                if (message instanceof EnumDescriptorProto) {
                    return mergeFrom((EnumDescriptorProto) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public final Builder mergeFrom(EnumDescriptorProto enumDescriptorProto) {
                RepeatedFieldBuilder repeatedFieldBuilder = null;
                if (enumDescriptorProto != EnumDescriptorProto.getDefaultInstance()) {
                    if (enumDescriptorProto.hasName()) {
                        this.bitField0_ |= EnumDescriptorProto.NAME_FIELD_NUMBER;
                        this.name_ = enumDescriptorProto.name_;
                        onChanged();
                    }
                    if (this.valueBuilder_ == null) {
                        if (!enumDescriptorProto.value_.isEmpty()) {
                            if (this.value_.isEmpty()) {
                                this.value_ = enumDescriptorProto.value_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureValueIsMutable();
                                this.value_.addAll(enumDescriptorProto.value_);
                            }
                            onChanged();
                        }
                    } else if (!enumDescriptorProto.value_.isEmpty()) {
                        if (this.valueBuilder_.isEmpty()) {
                            this.valueBuilder_.dispose();
                            this.valueBuilder_ = null;
                            this.value_ = enumDescriptorProto.value_;
                            this.bitField0_ &= -3;
                            if (GeneratedMessage.alwaysUseFieldBuilders) {
                                repeatedFieldBuilder = getValueFieldBuilder();
                            }
                            this.valueBuilder_ = repeatedFieldBuilder;
                        } else {
                            this.valueBuilder_.addAllMessages(enumDescriptorProto.value_);
                        }
                    }
                    if (enumDescriptorProto.hasOptions()) {
                        mergeOptions(enumDescriptorProto.getOptions());
                    }
                    mergeUnknownFields(enumDescriptorProto.getUnknownFields());
                }
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < getValueCount(); i += EnumDescriptorProto.NAME_FIELD_NUMBER) {
                    if (!getValue(i).isInitialized()) {
                        return false;
                    }
                }
                if (!hasOptions() || getOptions().isInitialized()) {
                    return true;
                }
                return false;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder mergeFrom(com.google.protobuf.CodedInputStream r5, com.google.protobuf.ExtensionRegistryLite r6) {
                /*
                r4 = this;
                r2 = 0;
                r0 = com.google.protobuf.DescriptorProtos.EnumDescriptorProto.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = (com.google.protobuf.DescriptorProtos.EnumDescriptorProto) r0;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                if (r0 == 0) goto L_0x000e;
            L_0x000b:
                r4.mergeFrom(r0);
            L_0x000e:
                return r4;
            L_0x000f:
                r0 = move-exception;
                r1 = r0;
                r0 = r1.getUnfinishedMessage();	 Catch:{ all -> 0x0022 }
                r0 = (com.google.protobuf.DescriptorProtos.EnumDescriptorProto) r0;	 Catch:{ all -> 0x0022 }
                throw r1;	 Catch:{ all -> 0x0018 }
            L_0x0018:
                r1 = move-exception;
                r3 = r1;
                r1 = r0;
                r0 = r3;
            L_0x001c:
                if (r1 == 0) goto L_0x0021;
            L_0x001e:
                r4.mergeFrom(r1);
            L_0x0021:
                throw r0;
            L_0x0022:
                r0 = move-exception;
                r1 = r2;
                goto L_0x001c;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.DescriptorProtos$EnumDescriptorProto$Builder");
            }

            public final boolean hasName() {
                return (this.bitField0_ & EnumDescriptorProto.NAME_FIELD_NUMBER) == EnumDescriptorProto.NAME_FIELD_NUMBER;
            }

            public final String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String toStringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.name_ = toStringUtf8;
                }
                return toStringUtf8;
            }

            public final ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final Builder setName(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= EnumDescriptorProto.NAME_FIELD_NUMBER;
                this.name_ = str;
                onChanged();
                return this;
            }

            public final Builder clearName() {
                this.bitField0_ &= -2;
                this.name_ = EnumDescriptorProto.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public final Builder setNameBytes(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= EnumDescriptorProto.NAME_FIELD_NUMBER;
                this.name_ = byteString;
                onChanged();
                return this;
            }

            private void ensureValueIsMutable() {
                if ((this.bitField0_ & EnumDescriptorProto.VALUE_FIELD_NUMBER) != EnumDescriptorProto.VALUE_FIELD_NUMBER) {
                    this.value_ = new ArrayList(this.value_);
                    this.bitField0_ |= EnumDescriptorProto.VALUE_FIELD_NUMBER;
                }
            }

            public final List<EnumValueDescriptorProto> getValueList() {
                if (this.valueBuilder_ == null) {
                    return Collections.unmodifiableList(this.value_);
                }
                return this.valueBuilder_.getMessageList();
            }

            public final int getValueCount() {
                if (this.valueBuilder_ == null) {
                    return this.value_.size();
                }
                return this.valueBuilder_.getCount();
            }

            public final EnumValueDescriptorProto getValue(int i) {
                if (this.valueBuilder_ == null) {
                    return (EnumValueDescriptorProto) this.value_.get(i);
                }
                return (EnumValueDescriptorProto) this.valueBuilder_.getMessage(i);
            }

            public final Builder setValue(int i, EnumValueDescriptorProto enumValueDescriptorProto) {
                if (this.valueBuilder_ != null) {
                    this.valueBuilder_.setMessage(i, enumValueDescriptorProto);
                } else if (enumValueDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureValueIsMutable();
                    this.value_.set(i, enumValueDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder setValue(int i, Builder builder) {
                if (this.valueBuilder_ == null) {
                    ensureValueIsMutable();
                    this.value_.set(i, builder.build());
                    onChanged();
                } else {
                    this.valueBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addValue(EnumValueDescriptorProto enumValueDescriptorProto) {
                if (this.valueBuilder_ != null) {
                    this.valueBuilder_.addMessage(enumValueDescriptorProto);
                } else if (enumValueDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureValueIsMutable();
                    this.value_.add(enumValueDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder addValue(int i, EnumValueDescriptorProto enumValueDescriptorProto) {
                if (this.valueBuilder_ != null) {
                    this.valueBuilder_.addMessage(i, enumValueDescriptorProto);
                } else if (enumValueDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureValueIsMutable();
                    this.value_.add(i, enumValueDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder addValue(Builder builder) {
                if (this.valueBuilder_ == null) {
                    ensureValueIsMutable();
                    this.value_.add(builder.build());
                    onChanged();
                } else {
                    this.valueBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public final Builder addValue(int i, Builder builder) {
                if (this.valueBuilder_ == null) {
                    ensureValueIsMutable();
                    this.value_.add(i, builder.build());
                    onChanged();
                } else {
                    this.valueBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addAllValue(Iterable<? extends EnumValueDescriptorProto> iterable) {
                if (this.valueBuilder_ == null) {
                    ensureValueIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.value_);
                    onChanged();
                } else {
                    this.valueBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public final Builder clearValue() {
                if (this.valueBuilder_ == null) {
                    this.value_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    onChanged();
                } else {
                    this.valueBuilder_.clear();
                }
                return this;
            }

            public final Builder removeValue(int i) {
                if (this.valueBuilder_ == null) {
                    ensureValueIsMutable();
                    this.value_.remove(i);
                    onChanged();
                } else {
                    this.valueBuilder_.remove(i);
                }
                return this;
            }

            public final Builder getValueBuilder(int i) {
                return (Builder) getValueFieldBuilder().getBuilder(i);
            }

            public final EnumValueDescriptorProtoOrBuilder getValueOrBuilder(int i) {
                if (this.valueBuilder_ == null) {
                    return (EnumValueDescriptorProtoOrBuilder) this.value_.get(i);
                }
                return (EnumValueDescriptorProtoOrBuilder) this.valueBuilder_.getMessageOrBuilder(i);
            }

            public final List<? extends EnumValueDescriptorProtoOrBuilder> getValueOrBuilderList() {
                if (this.valueBuilder_ != null) {
                    return this.valueBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.value_);
            }

            public final Builder addValueBuilder() {
                return (Builder) getValueFieldBuilder().addBuilder(EnumValueDescriptorProto.getDefaultInstance());
            }

            public final Builder addValueBuilder(int i) {
                return (Builder) getValueFieldBuilder().addBuilder(i, EnumValueDescriptorProto.getDefaultInstance());
            }

            public final List<Builder> getValueBuilderList() {
                return getValueFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<EnumValueDescriptorProto, Builder, EnumValueDescriptorProtoOrBuilder> getValueFieldBuilder() {
                if (this.valueBuilder_ == null) {
                    this.valueBuilder_ = new RepeatedFieldBuilder(this.value_, (this.bitField0_ & EnumDescriptorProto.VALUE_FIELD_NUMBER) == EnumDescriptorProto.VALUE_FIELD_NUMBER, getParentForChildren(), isClean());
                    this.value_ = null;
                }
                return this.valueBuilder_;
            }

            public final boolean hasOptions() {
                return (this.bitField0_ & 4) == 4;
            }

            public final EnumOptions getOptions() {
                if (this.optionsBuilder_ == null) {
                    return this.options_;
                }
                return (EnumOptions) this.optionsBuilder_.getMessage();
            }

            public final Builder setOptions(EnumOptions enumOptions) {
                if (this.optionsBuilder_ != null) {
                    this.optionsBuilder_.setMessage(enumOptions);
                } else if (enumOptions == null) {
                    throw new NullPointerException();
                } else {
                    this.options_ = enumOptions;
                    onChanged();
                }
                this.bitField0_ |= 4;
                return this;
            }

            public final Builder setOptions(Builder builder) {
                if (this.optionsBuilder_ == null) {
                    this.options_ = builder.build();
                    onChanged();
                } else {
                    this.optionsBuilder_.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                return this;
            }

            public final Builder mergeOptions(EnumOptions enumOptions) {
                if (this.optionsBuilder_ == null) {
                    if ((this.bitField0_ & 4) != 4 || this.options_ == EnumOptions.getDefaultInstance()) {
                        this.options_ = enumOptions;
                    } else {
                        this.options_ = EnumOptions.newBuilder(this.options_).mergeFrom(enumOptions).buildPartial();
                    }
                    onChanged();
                } else {
                    this.optionsBuilder_.mergeFrom(enumOptions);
                }
                this.bitField0_ |= 4;
                return this;
            }

            public final Builder clearOptions() {
                if (this.optionsBuilder_ == null) {
                    this.options_ = EnumOptions.getDefaultInstance();
                    onChanged();
                } else {
                    this.optionsBuilder_.clear();
                }
                this.bitField0_ &= -5;
                return this;
            }

            public final Builder getOptionsBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (Builder) getOptionsFieldBuilder().getBuilder();
            }

            public final EnumOptionsOrBuilder getOptionsOrBuilder() {
                if (this.optionsBuilder_ != null) {
                    return (EnumOptionsOrBuilder) this.optionsBuilder_.getMessageOrBuilder();
                }
                return this.options_;
            }

            private SingleFieldBuilder<EnumOptions, Builder, EnumOptionsOrBuilder> getOptionsFieldBuilder() {
                if (this.optionsBuilder_ == null) {
                    this.optionsBuilder_ = new SingleFieldBuilder(getOptions(), getParentForChildren(), isClean());
                    this.options_ = null;
                }
                return this.optionsBuilder_;
            }
        }

        private EnumDescriptorProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private EnumDescriptorProto(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static EnumDescriptorProto getDefaultInstance() {
            return defaultInstance;
        }

        public final EnumDescriptorProto getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private EnumDescriptorProto(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            com.google.protobuf.UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            Object obj = null;
            int i = 0;
            while (obj == null) {
                try {
                    int readTag = codedInputStream.readTag();
                    switch (readTag) {
                        case SQLiteDatabase.OPEN_READWRITE /*0*/:
                            obj = NAME_FIELD_NUMBER;
                            break;
                        case PushMsg.SMSG_FIELD_NUMBER /*10*/:
                            ByteString readBytes = codedInputStream.readBytes();
                            this.bitField0_ |= NAME_FIELD_NUMBER;
                            this.name_ = readBytes;
                            break;
                        case PushMsg.IVIBRATE_FIELD_NUMBER /*18*/:
                            if ((i & VALUE_FIELD_NUMBER) != VALUE_FIELD_NUMBER) {
                                this.value_ = new ArrayList();
                                i |= VALUE_FIELD_NUMBER;
                            }
                            this.value_.add(codedInputStream.readMessage(EnumValueDescriptorProto.PARSER, extensionRegistryLite));
                            break;
                        case GameRoomBaseInfo.EGAMEROOMTYPE_FIELD_NUMBER /*26*/:
                            Builder toBuilder;
                            if ((this.bitField0_ & VALUE_FIELD_NUMBER) == VALUE_FIELD_NUMBER) {
                                toBuilder = this.options_.toBuilder();
                            } else {
                                toBuilder = null;
                            }
                            this.options_ = (EnumOptions) codedInputStream.readMessage(EnumOptions.PARSER, extensionRegistryLite);
                            if (toBuilder != null) {
                                toBuilder.mergeFrom(this.options_);
                                this.options_ = toBuilder.buildPartial();
                            }
                            this.bitField0_ |= VALUE_FIELD_NUMBER;
                            break;
                        default:
                            if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                obj = NAME_FIELD_NUMBER;
                                break;
                            }
                            break;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if ((i & VALUE_FIELD_NUMBER) == VALUE_FIELD_NUMBER) {
                        this.value_ = Collections.unmodifiableList(this.value_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                }
            }
            if ((i & VALUE_FIELD_NUMBER) == VALUE_FIELD_NUMBER) {
                this.value_ = Collections.unmodifiableList(this.value_);
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
        }

        public static final Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_EnumDescriptorProto_descriptor;
        }

        protected final FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.f2776x9945f651.ensureFieldAccessorsInitialized(EnumDescriptorProto.class, Builder.class);
        }

        static {
            PARSER = new C02801();
            EnumDescriptorProto enumDescriptorProto = new EnumDescriptorProto(true);
            defaultInstance = enumDescriptorProto;
            enumDescriptorProto.initFields();
        }

        public final Parser<EnumDescriptorProto> getParserForType() {
            return PARSER;
        }

        public final boolean hasName() {
            return (this.bitField0_ & NAME_FIELD_NUMBER) == NAME_FIELD_NUMBER;
        }

        public final String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String toStringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = toStringUtf8;
            }
            return toStringUtf8;
        }

        public final ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final List<EnumValueDescriptorProto> getValueList() {
            return this.value_;
        }

        public final List<? extends EnumValueDescriptorProtoOrBuilder> getValueOrBuilderList() {
            return this.value_;
        }

        public final int getValueCount() {
            return this.value_.size();
        }

        public final EnumValueDescriptorProto getValue(int i) {
            return (EnumValueDescriptorProto) this.value_.get(i);
        }

        public final EnumValueDescriptorProtoOrBuilder getValueOrBuilder(int i) {
            return (EnumValueDescriptorProtoOrBuilder) this.value_.get(i);
        }

        public final boolean hasOptions() {
            return (this.bitField0_ & VALUE_FIELD_NUMBER) == VALUE_FIELD_NUMBER;
        }

        public final EnumOptions getOptions() {
            return this.options_;
        }

        public final EnumOptionsOrBuilder getOptionsOrBuilder() {
            return this.options_;
        }

        private void initFields() {
            this.name_ = LetterIndexBar.SEARCH_ICON_LETTER;
            this.value_ = Collections.emptyList();
            this.options_ = EnumOptions.getDefaultInstance();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == null) {
                return false;
            }
            int i = 0;
            while (i < getValueCount()) {
                if (getValue(i).isInitialized()) {
                    i += NAME_FIELD_NUMBER;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (!hasOptions() || getOptions().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.bitField0_ & NAME_FIELD_NUMBER) == NAME_FIELD_NUMBER) {
                codedOutputStream.writeBytes(NAME_FIELD_NUMBER, getNameBytes());
            }
            for (int i = 0; i < this.value_.size(); i += NAME_FIELD_NUMBER) {
                codedOutputStream.writeMessage(VALUE_FIELD_NUMBER, (MessageLite) this.value_.get(i));
            }
            if ((this.bitField0_ & VALUE_FIELD_NUMBER) == VALUE_FIELD_NUMBER) {
                codedOutputStream.writeMessage(OPTIONS_FIELD_NUMBER, this.options_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public final int getSerializedSize() {
            int i = 0;
            int i2 = this.memoizedSerializedSize;
            if (i2 != -1) {
                return i2;
            }
            if ((this.bitField0_ & NAME_FIELD_NUMBER) == NAME_FIELD_NUMBER) {
                i2 = CodedOutputStream.computeBytesSize(NAME_FIELD_NUMBER, getNameBytes()) + 0;
            } else {
                i2 = 0;
            }
            int i3 = i2;
            while (i < this.value_.size()) {
                i += NAME_FIELD_NUMBER;
                i3 = CodedOutputStream.computeMessageSize(VALUE_FIELD_NUMBER, (MessageLite) this.value_.get(i)) + i3;
            }
            if ((this.bitField0_ & VALUE_FIELD_NUMBER) == VALUE_FIELD_NUMBER) {
                i3 += CodedOutputStream.computeMessageSize(OPTIONS_FIELD_NUMBER, this.options_);
            }
            i2 = getUnknownFields().getSerializedSize() + i3;
            this.memoizedSerializedSize = i2;
            return i2;
        }

        protected final Object writeReplace() {
            return super.writeReplace();
        }

        public static EnumDescriptorProto parseFrom(ByteString byteString) {
            return (EnumDescriptorProto) PARSER.parseFrom(byteString);
        }

        public static EnumDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumDescriptorProto) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EnumDescriptorProto parseFrom(byte[] bArr) {
            return (EnumDescriptorProto) PARSER.parseFrom(bArr);
        }

        public static EnumDescriptorProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumDescriptorProto) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EnumDescriptorProto parseFrom(InputStream inputStream) {
            return (EnumDescriptorProto) PARSER.parseFrom(inputStream);
        }

        public static EnumDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumDescriptorProto) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static EnumDescriptorProto parseDelimitedFrom(InputStream inputStream) {
            return (EnumDescriptorProto) PARSER.parseDelimitedFrom(inputStream);
        }

        public static EnumDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumDescriptorProto) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static EnumDescriptorProto parseFrom(CodedInputStream codedInputStream) {
            return (EnumDescriptorProto) PARSER.parseFrom(codedInputStream);
        }

        public static EnumDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumDescriptorProto) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(EnumDescriptorProto enumDescriptorProto) {
            return newBuilder().mergeFrom(enumDescriptorProto);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        protected final Builder newBuilderForType(BuilderParent builderParent) {
            return new Builder(null);
        }
    }

    public interface EnumOptionsOrBuilder extends ExtendableMessageOrBuilder<EnumOptions> {
        boolean getAllowAlias();

        boolean getDeprecated();

        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i);

        List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList();

        boolean hasAllowAlias();

        boolean hasDeprecated();
    }

    public static final class EnumOptions extends ExtendableMessage<EnumOptions> implements EnumOptionsOrBuilder {
        public static final int ALLOW_ALIAS_FIELD_NUMBER = 2;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        public static Parser<EnumOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private static final EnumOptions defaultInstance;
        private static final long serialVersionUID = 0;
        private boolean allowAlias_;
        private int bitField0_;
        private boolean deprecated_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<UninterpretedOption> uninterpretedOption_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.google.protobuf.DescriptorProtos.EnumOptions.1 */
        static class C02811 extends AbstractParser<EnumOptions> {
            C02811() {
            }

            public final EnumOptions parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new EnumOptions(extensionRegistryLite, null);
            }
        }

        public static final class Builder extends ExtendableBuilder<EnumOptions, Builder> implements EnumOptionsOrBuilder {
            private boolean allowAlias_;
            private int bitField0_;
            private boolean deprecated_;
            private RepeatedFieldBuilder<UninterpretedOption, Builder, UninterpretedOptionOrBuilder> uninterpretedOptionBuilder_;
            private List<UninterpretedOption> uninterpretedOption_;

            public static final Descriptor getDescriptor() {
                return DescriptorProtos.internal_static_google_protobuf_EnumOptions_descriptor;
            }

            protected final FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.internal_static_google_protobuf_EnumOptions_fieldAccessorTable.ensureFieldAccessorsInitialized(EnumOptions.class, Builder.class);
            }

            private Builder() {
                this.uninterpretedOption_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent builderParent) {
                super(builderParent);
                this.uninterpretedOption_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    getUninterpretedOptionFieldBuilder();
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public final Builder clear() {
                super.clear();
                this.allowAlias_ = false;
                this.bitField0_ &= -2;
                this.deprecated_ = false;
                this.bitField0_ &= -3;
                if (this.uninterpretedOptionBuilder_ == null) {
                    this.uninterpretedOption_ = Collections.emptyList();
                    this.bitField0_ &= -5;
                } else {
                    this.uninterpretedOptionBuilder_.clear();
                }
                return this;
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_EnumOptions_descriptor;
            }

            public final EnumOptions getDefaultInstanceForType() {
                return EnumOptions.getDefaultInstance();
            }

            public final EnumOptions build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
            }

            public final EnumOptions buildPartial() {
                int i = 1;
                EnumOptions enumOptions = new EnumOptions(null);
                int i2 = this.bitField0_;
                if ((i2 & 1) != 1) {
                    i = 0;
                }
                enumOptions.allowAlias_ = this.allowAlias_;
                if ((i2 & EnumOptions.ALLOW_ALIAS_FIELD_NUMBER) == EnumOptions.ALLOW_ALIAS_FIELD_NUMBER) {
                    i |= EnumOptions.ALLOW_ALIAS_FIELD_NUMBER;
                }
                enumOptions.deprecated_ = this.deprecated_;
                if (this.uninterpretedOptionBuilder_ == null) {
                    if ((this.bitField0_ & 4) == 4) {
                        this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                        this.bitField0_ &= -5;
                    }
                    enumOptions.uninterpretedOption_ = this.uninterpretedOption_;
                } else {
                    enumOptions.uninterpretedOption_ = this.uninterpretedOptionBuilder_.build();
                }
                enumOptions.bitField0_ = i;
                onBuilt();
                return enumOptions;
            }

            public final Builder mergeFrom(Message message) {
                if (message instanceof EnumOptions) {
                    return mergeFrom((EnumOptions) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public final Builder mergeFrom(EnumOptions enumOptions) {
                RepeatedFieldBuilder repeatedFieldBuilder = null;
                if (enumOptions != EnumOptions.getDefaultInstance()) {
                    if (enumOptions.hasAllowAlias()) {
                        setAllowAlias(enumOptions.getAllowAlias());
                    }
                    if (enumOptions.hasDeprecated()) {
                        setDeprecated(enumOptions.getDeprecated());
                    }
                    if (this.uninterpretedOptionBuilder_ == null) {
                        if (!enumOptions.uninterpretedOption_.isEmpty()) {
                            if (this.uninterpretedOption_.isEmpty()) {
                                this.uninterpretedOption_ = enumOptions.uninterpretedOption_;
                                this.bitField0_ &= -5;
                            } else {
                                ensureUninterpretedOptionIsMutable();
                                this.uninterpretedOption_.addAll(enumOptions.uninterpretedOption_);
                            }
                            onChanged();
                        }
                    } else if (!enumOptions.uninterpretedOption_.isEmpty()) {
                        if (this.uninterpretedOptionBuilder_.isEmpty()) {
                            this.uninterpretedOptionBuilder_.dispose();
                            this.uninterpretedOptionBuilder_ = null;
                            this.uninterpretedOption_ = enumOptions.uninterpretedOption_;
                            this.bitField0_ &= -5;
                            if (GeneratedMessage.alwaysUseFieldBuilders) {
                                repeatedFieldBuilder = getUninterpretedOptionFieldBuilder();
                            }
                            this.uninterpretedOptionBuilder_ = repeatedFieldBuilder;
                        } else {
                            this.uninterpretedOptionBuilder_.addAllMessages(enumOptions.uninterpretedOption_);
                        }
                    }
                    mergeExtensionFields(enumOptions);
                    mergeUnknownFields(enumOptions.getUnknownFields());
                }
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                    if (!getUninterpretedOption(i).isInitialized()) {
                        return false;
                    }
                }
                if (extensionsAreInitialized()) {
                    return true;
                }
                return false;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.google.protobuf.DescriptorProtos.EnumOptions.Builder mergeFrom(com.google.protobuf.CodedInputStream r5, com.google.protobuf.ExtensionRegistryLite r6) {
                /*
                r4 = this;
                r2 = 0;
                r0 = com.google.protobuf.DescriptorProtos.EnumOptions.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = (com.google.protobuf.DescriptorProtos.EnumOptions) r0;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                if (r0 == 0) goto L_0x000e;
            L_0x000b:
                r4.mergeFrom(r0);
            L_0x000e:
                return r4;
            L_0x000f:
                r0 = move-exception;
                r1 = r0;
                r0 = r1.getUnfinishedMessage();	 Catch:{ all -> 0x0022 }
                r0 = (com.google.protobuf.DescriptorProtos.EnumOptions) r0;	 Catch:{ all -> 0x0022 }
                throw r1;	 Catch:{ all -> 0x0018 }
            L_0x0018:
                r1 = move-exception;
                r3 = r1;
                r1 = r0;
                r0 = r3;
            L_0x001c:
                if (r1 == 0) goto L_0x0021;
            L_0x001e:
                r4.mergeFrom(r1);
            L_0x0021:
                throw r0;
            L_0x0022:
                r0 = move-exception;
                r1 = r2;
                goto L_0x001c;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.EnumOptions.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.DescriptorProtos$EnumOptions$Builder");
            }

            public final boolean hasAllowAlias() {
                return (this.bitField0_ & 1) == 1;
            }

            public final boolean getAllowAlias() {
                return this.allowAlias_;
            }

            public final Builder setAllowAlias(boolean z) {
                this.bitField0_ |= 1;
                this.allowAlias_ = z;
                onChanged();
                return this;
            }

            public final Builder clearAllowAlias() {
                this.bitField0_ &= -2;
                this.allowAlias_ = false;
                onChanged();
                return this;
            }

            public final boolean hasDeprecated() {
                return (this.bitField0_ & EnumOptions.ALLOW_ALIAS_FIELD_NUMBER) == EnumOptions.ALLOW_ALIAS_FIELD_NUMBER;
            }

            public final boolean getDeprecated() {
                return this.deprecated_;
            }

            public final Builder setDeprecated(boolean z) {
                this.bitField0_ |= EnumOptions.ALLOW_ALIAS_FIELD_NUMBER;
                this.deprecated_ = z;
                onChanged();
                return this;
            }

            public final Builder clearDeprecated() {
                this.bitField0_ &= -3;
                this.deprecated_ = false;
                onChanged();
                return this;
            }

            private void ensureUninterpretedOptionIsMutable() {
                if ((this.bitField0_ & 4) != 4) {
                    this.uninterpretedOption_ = new ArrayList(this.uninterpretedOption_);
                    this.bitField0_ |= 4;
                }
            }

            public final List<UninterpretedOption> getUninterpretedOptionList() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    return Collections.unmodifiableList(this.uninterpretedOption_);
                }
                return this.uninterpretedOptionBuilder_.getMessageList();
            }

            public final int getUninterpretedOptionCount() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    return this.uninterpretedOption_.size();
                }
                return this.uninterpretedOptionBuilder_.getCount();
            }

            public final UninterpretedOption getUninterpretedOption(int i) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    return (UninterpretedOption) this.uninterpretedOption_.get(i);
                }
                return (UninterpretedOption) this.uninterpretedOptionBuilder_.getMessage(i);
            }

            public final Builder setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
                if (this.uninterpretedOptionBuilder_ != null) {
                    this.uninterpretedOptionBuilder_.setMessage(i, uninterpretedOption);
                } else if (uninterpretedOption == null) {
                    throw new NullPointerException();
                } else {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.set(i, uninterpretedOption);
                    onChanged();
                }
                return this;
            }

            public final Builder setUninterpretedOption(int i, Builder builder) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.set(i, builder.build());
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
                if (this.uninterpretedOptionBuilder_ != null) {
                    this.uninterpretedOptionBuilder_.addMessage(uninterpretedOption);
                } else if (uninterpretedOption == null) {
                    throw new NullPointerException();
                } else {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.add(uninterpretedOption);
                    onChanged();
                }
                return this;
            }

            public final Builder addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
                if (this.uninterpretedOptionBuilder_ != null) {
                    this.uninterpretedOptionBuilder_.addMessage(i, uninterpretedOption);
                } else if (uninterpretedOption == null) {
                    throw new NullPointerException();
                } else {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.add(i, uninterpretedOption);
                    onChanged();
                }
                return this;
            }

            public final Builder addUninterpretedOption(Builder builder) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.add(builder.build());
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public final Builder addUninterpretedOption(int i, Builder builder) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.add(i, builder.build());
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.uninterpretedOption_);
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public final Builder clearUninterpretedOption() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    this.uninterpretedOption_ = Collections.emptyList();
                    this.bitField0_ &= -5;
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.clear();
                }
                return this;
            }

            public final Builder removeUninterpretedOption(int i) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.remove(i);
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.remove(i);
                }
                return this;
            }

            public final Builder getUninterpretedOptionBuilder(int i) {
                return (Builder) getUninterpretedOptionFieldBuilder().getBuilder(i);
            }

            public final UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    return (UninterpretedOptionOrBuilder) this.uninterpretedOption_.get(i);
                }
                return (UninterpretedOptionOrBuilder) this.uninterpretedOptionBuilder_.getMessageOrBuilder(i);
            }

            public final List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
                if (this.uninterpretedOptionBuilder_ != null) {
                    return this.uninterpretedOptionBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.uninterpretedOption_);
            }

            public final Builder addUninterpretedOptionBuilder() {
                return (Builder) getUninterpretedOptionFieldBuilder().addBuilder(UninterpretedOption.getDefaultInstance());
            }

            public final Builder addUninterpretedOptionBuilder(int i) {
                return (Builder) getUninterpretedOptionFieldBuilder().addBuilder(i, UninterpretedOption.getDefaultInstance());
            }

            public final List<Builder> getUninterpretedOptionBuilderList() {
                return getUninterpretedOptionFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<UninterpretedOption, Builder, UninterpretedOptionOrBuilder> getUninterpretedOptionFieldBuilder() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    this.uninterpretedOptionBuilder_ = new RepeatedFieldBuilder(this.uninterpretedOption_, (this.bitField0_ & 4) == 4, getParentForChildren(), isClean());
                    this.uninterpretedOption_ = null;
                }
                return this.uninterpretedOptionBuilder_;
            }
        }

        private EnumOptions(ExtendableBuilder<EnumOptions, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        private EnumOptions(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static EnumOptions getDefaultInstance() {
            return defaultInstance;
        }

        public final EnumOptions getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private EnumOptions(com.google.protobuf.CodedInputStream r9, com.google.protobuf.ExtensionRegistryLite r10) {
            /*
            r8 = this;
            r2 = 1;
            r0 = 0;
            r1 = -1;
            r6 = 4;
            r8.<init>();
            r8.memoizedIsInitialized = r1;
            r8.memoizedSerializedSize = r1;
            r8.initFields();
            r3 = com.google.protobuf.UnknownFieldSet.newBuilder();
            r1 = r0;
        L_0x0013:
            if (r1 != 0) goto L_0x0090;
        L_0x0015:
            r4 = r9.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x0060, all -> 0x008b }
            switch(r4) {
                case 0: goto L_0x0024;
                case 16: goto L_0x0026;
                case 24: goto L_0x0053;
                case 7994: goto L_0x0072;
                default: goto L_0x001c;
            };	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x0060, all -> 0x008b }
        L_0x001c:
            r4 = r8.parseUnknownField(r9, r3, r10, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x0060, all -> 0x008b }
            if (r4 != 0) goto L_0x0013;
        L_0x0022:
            r1 = r2;
            goto L_0x0013;
        L_0x0024:
            r1 = r2;
            goto L_0x0013;
        L_0x0026:
            r4 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x0060, all -> 0x008b }
            r4 = r4 | 1;
            r8.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x0060, all -> 0x008b }
            r4 = r9.readBool();	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x0060, all -> 0x008b }
            r8.allowAlias_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x0060, all -> 0x008b }
            goto L_0x0013;
        L_0x0033:
            r1 = move-exception;
            r7 = r1;
            r1 = r0;
            r0 = r7;
            r0 = r0.setUnfinishedMessage(r8);	 Catch:{ all -> 0x003c }
            throw r0;	 Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception;
        L_0x003d:
            r1 = r1 & 4;
            if (r1 != r6) goto L_0x0049;
        L_0x0041:
            r1 = r8.uninterpretedOption_;
            r1 = java.util.Collections.unmodifiableList(r1);
            r8.uninterpretedOption_ = r1;
        L_0x0049:
            r1 = r3.build();
            r8.unknownFields = r1;
            r8.makeExtensionsImmutable();
            throw r0;
        L_0x0053:
            r4 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x0060, all -> 0x008b }
            r4 = r4 | 2;
            r8.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x0060, all -> 0x008b }
            r4 = r9.readBool();	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x0060, all -> 0x008b }
            r8.deprecated_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x0060, all -> 0x008b }
            goto L_0x0013;
        L_0x0060:
            r1 = move-exception;
            r7 = r1;
            r1 = r0;
            r0 = r7;
            r2 = new com.google.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x003c }
            r0 = r0.getMessage();	 Catch:{ all -> 0x003c }
            r2.<init>(r0);	 Catch:{ all -> 0x003c }
            r0 = r2.setUnfinishedMessage(r8);	 Catch:{ all -> 0x003c }
            throw r0;	 Catch:{ all -> 0x003c }
        L_0x0072:
            r4 = r0 & 4;
            if (r4 == r6) goto L_0x007f;
        L_0x0076:
            r4 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x0060, all -> 0x008b }
            r4.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x0060, all -> 0x008b }
            r8.uninterpretedOption_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x0060, all -> 0x008b }
            r0 = r0 | 4;
        L_0x007f:
            r4 = r8.uninterpretedOption_;	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x0060, all -> 0x008b }
            r5 = com.google.protobuf.DescriptorProtos.UninterpretedOption.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x0060, all -> 0x008b }
            r5 = r9.readMessage(r5, r10);	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x0060, all -> 0x008b }
            r4.add(r5);	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x0060, all -> 0x008b }
            goto L_0x0013;
        L_0x008b:
            r1 = move-exception;
            r7 = r1;
            r1 = r0;
            r0 = r7;
            goto L_0x003d;
        L_0x0090:
            r0 = r0 & 4;
            if (r0 != r6) goto L_0x009c;
        L_0x0094:
            r0 = r8.uninterpretedOption_;
            r0 = java.util.Collections.unmodifiableList(r0);
            r8.uninterpretedOption_ = r0;
        L_0x009c:
            r0 = r3.build();
            r8.unknownFields = r0;
            r8.makeExtensionsImmutable();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.EnumOptions.<init>(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):void");
        }

        public static final Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_EnumOptions_descriptor;
        }

        protected final FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.internal_static_google_protobuf_EnumOptions_fieldAccessorTable.ensureFieldAccessorsInitialized(EnumOptions.class, Builder.class);
        }

        static {
            PARSER = new C02811();
            EnumOptions enumOptions = new EnumOptions(true);
            defaultInstance = enumOptions;
            enumOptions.initFields();
        }

        public final Parser<EnumOptions> getParserForType() {
            return PARSER;
        }

        public final boolean hasAllowAlias() {
            return (this.bitField0_ & 1) == 1;
        }

        public final boolean getAllowAlias() {
            return this.allowAlias_;
        }

        public final boolean hasDeprecated() {
            return (this.bitField0_ & ALLOW_ALIAS_FIELD_NUMBER) == ALLOW_ALIAS_FIELD_NUMBER;
        }

        public final boolean getDeprecated() {
            return this.deprecated_;
        }

        public final List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public final List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        public final int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public final UninterpretedOption getUninterpretedOption(int i) {
            return (UninterpretedOption) this.uninterpretedOption_.get(i);
        }

        public final UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i) {
            return (UninterpretedOptionOrBuilder) this.uninterpretedOption_.get(i);
        }

        private void initFields() {
            this.allowAlias_ = false;
            this.deprecated_ = false;
            this.uninterpretedOption_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == null) {
                return false;
            }
            int i = 0;
            while (i < getUninterpretedOptionCount()) {
                if (getUninterpretedOption(i).isInitialized()) {
                    i++;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeBool(ALLOW_ALIAS_FIELD_NUMBER, this.allowAlias_);
            }
            if ((this.bitField0_ & ALLOW_ALIAS_FIELD_NUMBER) == ALLOW_ALIAS_FIELD_NUMBER) {
                codedOutputStream.writeBool(DEPRECATED_FIELD_NUMBER, this.deprecated_);
            }
            for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
                codedOutputStream.writeMessage(UNINTERPRETED_OPTION_FIELD_NUMBER, (MessageLite) this.uninterpretedOption_.get(i));
            }
            newExtensionWriter.writeUntil(536870912, codedOutputStream);
            getUnknownFields().writeTo(codedOutputStream);
        }

        public final int getSerializedSize() {
            int i = 0;
            int i2 = this.memoizedSerializedSize;
            if (i2 != -1) {
                return i2;
            }
            if ((this.bitField0_ & 1) == 1) {
                i2 = CodedOutputStream.computeBoolSize(ALLOW_ALIAS_FIELD_NUMBER, this.allowAlias_) + 0;
            } else {
                i2 = 0;
            }
            if ((this.bitField0_ & ALLOW_ALIAS_FIELD_NUMBER) == ALLOW_ALIAS_FIELD_NUMBER) {
                i2 += CodedOutputStream.computeBoolSize(DEPRECATED_FIELD_NUMBER, this.deprecated_);
            }
            int i3 = i2;
            while (i < this.uninterpretedOption_.size()) {
                i++;
                i3 = CodedOutputStream.computeMessageSize(UNINTERPRETED_OPTION_FIELD_NUMBER, (MessageLite) this.uninterpretedOption_.get(i)) + i3;
            }
            i2 = (extensionsSerializedSize() + i3) + getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = i2;
            return i2;
        }

        protected final Object writeReplace() {
            return super.writeReplace();
        }

        public static EnumOptions parseFrom(ByteString byteString) {
            return (EnumOptions) PARSER.parseFrom(byteString);
        }

        public static EnumOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumOptions) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EnumOptions parseFrom(byte[] bArr) {
            return (EnumOptions) PARSER.parseFrom(bArr);
        }

        public static EnumOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumOptions) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EnumOptions parseFrom(InputStream inputStream) {
            return (EnumOptions) PARSER.parseFrom(inputStream);
        }

        public static EnumOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumOptions) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static EnumOptions parseDelimitedFrom(InputStream inputStream) {
            return (EnumOptions) PARSER.parseDelimitedFrom(inputStream);
        }

        public static EnumOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumOptions) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static EnumOptions parseFrom(CodedInputStream codedInputStream) {
            return (EnumOptions) PARSER.parseFrom(codedInputStream);
        }

        public static EnumOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumOptions) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(EnumOptions enumOptions) {
            return newBuilder().mergeFrom(enumOptions);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        protected final Builder newBuilderForType(BuilderParent builderParent) {
            return new Builder(null);
        }
    }

    public interface EnumValueDescriptorProtoOrBuilder extends MessageOrBuilder {
        String getName();

        ByteString getNameBytes();

        int getNumber();

        EnumValueOptions getOptions();

        EnumValueOptionsOrBuilder getOptionsOrBuilder();

        boolean hasName();

        boolean hasNumber();

        boolean hasOptions();
    }

    public static final class EnumValueDescriptorProto extends GeneratedMessage implements EnumValueDescriptorProtoOrBuilder {
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NUMBER_FIELD_NUMBER = 2;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        public static Parser<EnumValueDescriptorProto> PARSER;
        private static final EnumValueDescriptorProto defaultInstance;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object name_;
        private int number_;
        private EnumValueOptions options_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.1 */
        static class C02821 extends AbstractParser<EnumValueDescriptorProto> {
            C02821() {
            }

            public final EnumValueDescriptorProto parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new EnumValueDescriptorProto(extensionRegistryLite, null);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements EnumValueDescriptorProtoOrBuilder {
            private int bitField0_;
            private Object name_;
            private int number_;
            private SingleFieldBuilder<EnumValueOptions, Builder, EnumValueOptionsOrBuilder> optionsBuilder_;
            private EnumValueOptions options_;

            public static final Descriptor getDescriptor() {
                return DescriptorProtos.f2777xf18031a8;
            }

            protected final FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.f2778xfb173026.ensureFieldAccessorsInitialized(EnumValueDescriptorProto.class, Builder.class);
            }

            private Builder() {
                this.name_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.options_ = EnumValueOptions.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent builderParent) {
                super(builderParent);
                this.name_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.options_ = EnumValueOptions.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    getOptionsFieldBuilder();
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public final Builder clear() {
                super.clear();
                this.name_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.bitField0_ &= -2;
                this.number_ = 0;
                this.bitField0_ &= -3;
                if (this.optionsBuilder_ == null) {
                    this.options_ = EnumValueOptions.getDefaultInstance();
                } else {
                    this.optionsBuilder_.clear();
                }
                this.bitField0_ &= -5;
                return this;
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final Descriptor getDescriptorForType() {
                return DescriptorProtos.f2777xf18031a8;
            }

            public final EnumValueDescriptorProto getDefaultInstanceForType() {
                return EnumValueDescriptorProto.getDefaultInstance();
            }

            public final EnumValueDescriptorProto build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
            }

            public final EnumValueDescriptorProto buildPartial() {
                int i;
                int i2 = EnumValueDescriptorProto.NAME_FIELD_NUMBER;
                EnumValueDescriptorProto enumValueDescriptorProto = new EnumValueDescriptorProto(null);
                int i3 = this.bitField0_;
                if ((i3 & EnumValueDescriptorProto.NAME_FIELD_NUMBER) != EnumValueDescriptorProto.NAME_FIELD_NUMBER) {
                    i2 = 0;
                }
                enumValueDescriptorProto.name_ = this.name_;
                if ((i3 & EnumValueDescriptorProto.NUMBER_FIELD_NUMBER) == EnumValueDescriptorProto.NUMBER_FIELD_NUMBER) {
                    i2 |= EnumValueDescriptorProto.NUMBER_FIELD_NUMBER;
                }
                enumValueDescriptorProto.number_ = this.number_;
                if ((i3 & 4) == 4) {
                    i = i2 | 4;
                } else {
                    i = i2;
                }
                if (this.optionsBuilder_ == null) {
                    enumValueDescriptorProto.options_ = this.options_;
                } else {
                    enumValueDescriptorProto.options_ = (EnumValueOptions) this.optionsBuilder_.build();
                }
                enumValueDescriptorProto.bitField0_ = i;
                onBuilt();
                return enumValueDescriptorProto;
            }

            public final Builder mergeFrom(Message message) {
                if (message instanceof EnumValueDescriptorProto) {
                    return mergeFrom((EnumValueDescriptorProto) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public final Builder mergeFrom(EnumValueDescriptorProto enumValueDescriptorProto) {
                if (enumValueDescriptorProto != EnumValueDescriptorProto.getDefaultInstance()) {
                    if (enumValueDescriptorProto.hasName()) {
                        this.bitField0_ |= EnumValueDescriptorProto.NAME_FIELD_NUMBER;
                        this.name_ = enumValueDescriptorProto.name_;
                        onChanged();
                    }
                    if (enumValueDescriptorProto.hasNumber()) {
                        setNumber(enumValueDescriptorProto.getNumber());
                    }
                    if (enumValueDescriptorProto.hasOptions()) {
                        mergeOptions(enumValueDescriptorProto.getOptions());
                    }
                    mergeUnknownFields(enumValueDescriptorProto.getUnknownFields());
                }
                return this;
            }

            public final boolean isInitialized() {
                if (!hasOptions() || getOptions().isInitialized()) {
                    return true;
                }
                return false;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder mergeFrom(com.google.protobuf.CodedInputStream r5, com.google.protobuf.ExtensionRegistryLite r6) {
                /*
                r4 = this;
                r2 = 0;
                r0 = com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = (com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto) r0;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                if (r0 == 0) goto L_0x000e;
            L_0x000b:
                r4.mergeFrom(r0);
            L_0x000e:
                return r4;
            L_0x000f:
                r0 = move-exception;
                r1 = r0;
                r0 = r1.getUnfinishedMessage();	 Catch:{ all -> 0x0022 }
                r0 = (com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto) r0;	 Catch:{ all -> 0x0022 }
                throw r1;	 Catch:{ all -> 0x0018 }
            L_0x0018:
                r1 = move-exception;
                r3 = r1;
                r1 = r0;
                r0 = r3;
            L_0x001c:
                if (r1 == 0) goto L_0x0021;
            L_0x001e:
                r4.mergeFrom(r1);
            L_0x0021:
                throw r0;
            L_0x0022:
                r0 = move-exception;
                r1 = r2;
                goto L_0x001c;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.DescriptorProtos$EnumValueDescriptorProto$Builder");
            }

            public final boolean hasName() {
                return (this.bitField0_ & EnumValueDescriptorProto.NAME_FIELD_NUMBER) == EnumValueDescriptorProto.NAME_FIELD_NUMBER;
            }

            public final String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String toStringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.name_ = toStringUtf8;
                }
                return toStringUtf8;
            }

            public final ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final Builder setName(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= EnumValueDescriptorProto.NAME_FIELD_NUMBER;
                this.name_ = str;
                onChanged();
                return this;
            }

            public final Builder clearName() {
                this.bitField0_ &= -2;
                this.name_ = EnumValueDescriptorProto.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public final Builder setNameBytes(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= EnumValueDescriptorProto.NAME_FIELD_NUMBER;
                this.name_ = byteString;
                onChanged();
                return this;
            }

            public final boolean hasNumber() {
                return (this.bitField0_ & EnumValueDescriptorProto.NUMBER_FIELD_NUMBER) == EnumValueDescriptorProto.NUMBER_FIELD_NUMBER;
            }

            public final int getNumber() {
                return this.number_;
            }

            public final Builder setNumber(int i) {
                this.bitField0_ |= EnumValueDescriptorProto.NUMBER_FIELD_NUMBER;
                this.number_ = i;
                onChanged();
                return this;
            }

            public final Builder clearNumber() {
                this.bitField0_ &= -3;
                this.number_ = 0;
                onChanged();
                return this;
            }

            public final boolean hasOptions() {
                return (this.bitField0_ & 4) == 4;
            }

            public final EnumValueOptions getOptions() {
                if (this.optionsBuilder_ == null) {
                    return this.options_;
                }
                return (EnumValueOptions) this.optionsBuilder_.getMessage();
            }

            public final Builder setOptions(EnumValueOptions enumValueOptions) {
                if (this.optionsBuilder_ != null) {
                    this.optionsBuilder_.setMessage(enumValueOptions);
                } else if (enumValueOptions == null) {
                    throw new NullPointerException();
                } else {
                    this.options_ = enumValueOptions;
                    onChanged();
                }
                this.bitField0_ |= 4;
                return this;
            }

            public final Builder setOptions(Builder builder) {
                if (this.optionsBuilder_ == null) {
                    this.options_ = builder.build();
                    onChanged();
                } else {
                    this.optionsBuilder_.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                return this;
            }

            public final Builder mergeOptions(EnumValueOptions enumValueOptions) {
                if (this.optionsBuilder_ == null) {
                    if ((this.bitField0_ & 4) != 4 || this.options_ == EnumValueOptions.getDefaultInstance()) {
                        this.options_ = enumValueOptions;
                    } else {
                        this.options_ = EnumValueOptions.newBuilder(this.options_).mergeFrom(enumValueOptions).buildPartial();
                    }
                    onChanged();
                } else {
                    this.optionsBuilder_.mergeFrom(enumValueOptions);
                }
                this.bitField0_ |= 4;
                return this;
            }

            public final Builder clearOptions() {
                if (this.optionsBuilder_ == null) {
                    this.options_ = EnumValueOptions.getDefaultInstance();
                    onChanged();
                } else {
                    this.optionsBuilder_.clear();
                }
                this.bitField0_ &= -5;
                return this;
            }

            public final Builder getOptionsBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (Builder) getOptionsFieldBuilder().getBuilder();
            }

            public final EnumValueOptionsOrBuilder getOptionsOrBuilder() {
                if (this.optionsBuilder_ != null) {
                    return (EnumValueOptionsOrBuilder) this.optionsBuilder_.getMessageOrBuilder();
                }
                return this.options_;
            }

            private SingleFieldBuilder<EnumValueOptions, Builder, EnumValueOptionsOrBuilder> getOptionsFieldBuilder() {
                if (this.optionsBuilder_ == null) {
                    this.optionsBuilder_ = new SingleFieldBuilder(getOptions(), getParentForChildren(), isClean());
                    this.options_ = null;
                }
                return this.optionsBuilder_;
            }
        }

        private EnumValueDescriptorProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private EnumValueDescriptorProto(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static EnumValueDescriptorProto getDefaultInstance() {
            return defaultInstance;
        }

        public final EnumValueDescriptorProto getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private EnumValueDescriptorProto(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            com.google.protobuf.UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            Object obj = null;
            while (obj == null) {
                try {
                    int readTag = codedInputStream.readTag();
                    switch (readTag) {
                        case SQLiteDatabase.OPEN_READWRITE /*0*/:
                            obj = NAME_FIELD_NUMBER;
                            break;
                        case PushMsg.SMSG_FIELD_NUMBER /*10*/:
                            ByteString readBytes = codedInputStream.readBytes();
                            this.bitField0_ |= NAME_FIELD_NUMBER;
                            this.name_ = readBytes;
                            break;
                        case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                            this.bitField0_ |= NUMBER_FIELD_NUMBER;
                            this.number_ = codedInputStream.readInt32();
                            break;
                        case GameRoomBaseInfo.EGAMEROOMTYPE_FIELD_NUMBER /*26*/:
                            Builder toBuilder;
                            if ((this.bitField0_ & 4) == 4) {
                                toBuilder = this.options_.toBuilder();
                            } else {
                                toBuilder = null;
                            }
                            this.options_ = (EnumValueOptions) codedInputStream.readMessage(EnumValueOptions.PARSER, extensionRegistryLite);
                            if (toBuilder != null) {
                                toBuilder.mergeFrom(this.options_);
                                this.options_ = toBuilder.buildPartial();
                            }
                            this.bitField0_ |= 4;
                            break;
                        default:
                            if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                obj = NAME_FIELD_NUMBER;
                                break;
                            }
                            break;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                }
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
        }

        public static final Descriptor getDescriptor() {
            return DescriptorProtos.f2777xf18031a8;
        }

        protected final FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.f2778xfb173026.ensureFieldAccessorsInitialized(EnumValueDescriptorProto.class, Builder.class);
        }

        static {
            PARSER = new C02821();
            EnumValueDescriptorProto enumValueDescriptorProto = new EnumValueDescriptorProto(true);
            defaultInstance = enumValueDescriptorProto;
            enumValueDescriptorProto.initFields();
        }

        public final Parser<EnumValueDescriptorProto> getParserForType() {
            return PARSER;
        }

        public final boolean hasName() {
            return (this.bitField0_ & NAME_FIELD_NUMBER) == NAME_FIELD_NUMBER;
        }

        public final String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String toStringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = toStringUtf8;
            }
            return toStringUtf8;
        }

        public final ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean hasNumber() {
            return (this.bitField0_ & NUMBER_FIELD_NUMBER) == NUMBER_FIELD_NUMBER;
        }

        public final int getNumber() {
            return this.number_;
        }

        public final boolean hasOptions() {
            return (this.bitField0_ & 4) == 4;
        }

        public final EnumValueOptions getOptions() {
            return this.options_;
        }

        public final EnumValueOptionsOrBuilder getOptionsOrBuilder() {
            return this.options_;
        }

        private void initFields() {
            this.name_ = LetterIndexBar.SEARCH_ICON_LETTER;
            this.number_ = 0;
            this.options_ = EnumValueOptions.getDefaultInstance();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == null) {
                return false;
            }
            if (!hasOptions() || getOptions().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.bitField0_ & NAME_FIELD_NUMBER) == NAME_FIELD_NUMBER) {
                codedOutputStream.writeBytes(NAME_FIELD_NUMBER, getNameBytes());
            }
            if ((this.bitField0_ & NUMBER_FIELD_NUMBER) == NUMBER_FIELD_NUMBER) {
                codedOutputStream.writeInt32(NUMBER_FIELD_NUMBER, this.number_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeMessage(OPTIONS_FIELD_NUMBER, this.options_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public final int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            i = 0;
            if ((this.bitField0_ & NAME_FIELD_NUMBER) == NAME_FIELD_NUMBER) {
                i = CodedOutputStream.computeBytesSize(NAME_FIELD_NUMBER, getNameBytes()) + 0;
            }
            if ((this.bitField0_ & NUMBER_FIELD_NUMBER) == NUMBER_FIELD_NUMBER) {
                i += CodedOutputStream.computeInt32Size(NUMBER_FIELD_NUMBER, this.number_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i += CodedOutputStream.computeMessageSize(OPTIONS_FIELD_NUMBER, this.options_);
            }
            i += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = i;
            return i;
        }

        protected final Object writeReplace() {
            return super.writeReplace();
        }

        public static EnumValueDescriptorProto parseFrom(ByteString byteString) {
            return (EnumValueDescriptorProto) PARSER.parseFrom(byteString);
        }

        public static EnumValueDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumValueDescriptorProto) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EnumValueDescriptorProto parseFrom(byte[] bArr) {
            return (EnumValueDescriptorProto) PARSER.parseFrom(bArr);
        }

        public static EnumValueDescriptorProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumValueDescriptorProto) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EnumValueDescriptorProto parseFrom(InputStream inputStream) {
            return (EnumValueDescriptorProto) PARSER.parseFrom(inputStream);
        }

        public static EnumValueDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumValueDescriptorProto) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static EnumValueDescriptorProto parseDelimitedFrom(InputStream inputStream) {
            return (EnumValueDescriptorProto) PARSER.parseDelimitedFrom(inputStream);
        }

        public static EnumValueDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumValueDescriptorProto) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static EnumValueDescriptorProto parseFrom(CodedInputStream codedInputStream) {
            return (EnumValueDescriptorProto) PARSER.parseFrom(codedInputStream);
        }

        public static EnumValueDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumValueDescriptorProto) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(EnumValueDescriptorProto enumValueDescriptorProto) {
            return newBuilder().mergeFrom(enumValueDescriptorProto);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        protected final Builder newBuilderForType(BuilderParent builderParent) {
            return new Builder(null);
        }
    }

    public interface EnumValueOptionsOrBuilder extends ExtendableMessageOrBuilder<EnumValueOptions> {
        boolean getDeprecated();

        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i);

        List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList();

        boolean hasDeprecated();
    }

    public static final class EnumValueOptions extends ExtendableMessage<EnumValueOptions> implements EnumValueOptionsOrBuilder {
        public static final int DEPRECATED_FIELD_NUMBER = 1;
        public static Parser<EnumValueOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private static final EnumValueOptions defaultInstance;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean deprecated_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<UninterpretedOption> uninterpretedOption_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.google.protobuf.DescriptorProtos.EnumValueOptions.1 */
        static class C02831 extends AbstractParser<EnumValueOptions> {
            C02831() {
            }

            public final EnumValueOptions parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new EnumValueOptions(extensionRegistryLite, null);
            }
        }

        public static final class Builder extends ExtendableBuilder<EnumValueOptions, Builder> implements EnumValueOptionsOrBuilder {
            private int bitField0_;
            private boolean deprecated_;
            private RepeatedFieldBuilder<UninterpretedOption, Builder, UninterpretedOptionOrBuilder> uninterpretedOptionBuilder_;
            private List<UninterpretedOption> uninterpretedOption_;

            public static final Descriptor getDescriptor() {
                return DescriptorProtos.internal_static_google_protobuf_EnumValueOptions_descriptor;
            }

            protected final FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.f2779xdf65a421.ensureFieldAccessorsInitialized(EnumValueOptions.class, Builder.class);
            }

            private Builder() {
                this.uninterpretedOption_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent builderParent) {
                super(builderParent);
                this.uninterpretedOption_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    getUninterpretedOptionFieldBuilder();
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public final Builder clear() {
                super.clear();
                this.deprecated_ = false;
                this.bitField0_ &= -2;
                if (this.uninterpretedOptionBuilder_ == null) {
                    this.uninterpretedOption_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                } else {
                    this.uninterpretedOptionBuilder_.clear();
                }
                return this;
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_EnumValueOptions_descriptor;
            }

            public final EnumValueOptions getDefaultInstanceForType() {
                return EnumValueOptions.getDefaultInstance();
            }

            public final EnumValueOptions build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
            }

            public final EnumValueOptions buildPartial() {
                int i = EnumValueOptions.DEPRECATED_FIELD_NUMBER;
                EnumValueOptions enumValueOptions = new EnumValueOptions(null);
                if ((this.bitField0_ & EnumValueOptions.DEPRECATED_FIELD_NUMBER) != EnumValueOptions.DEPRECATED_FIELD_NUMBER) {
                    i = 0;
                }
                enumValueOptions.deprecated_ = this.deprecated_;
                if (this.uninterpretedOptionBuilder_ == null) {
                    if ((this.bitField0_ & 2) == 2) {
                        this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                        this.bitField0_ &= -3;
                    }
                    enumValueOptions.uninterpretedOption_ = this.uninterpretedOption_;
                } else {
                    enumValueOptions.uninterpretedOption_ = this.uninterpretedOptionBuilder_.build();
                }
                enumValueOptions.bitField0_ = i;
                onBuilt();
                return enumValueOptions;
            }

            public final Builder mergeFrom(Message message) {
                if (message instanceof EnumValueOptions) {
                    return mergeFrom((EnumValueOptions) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public final Builder mergeFrom(EnumValueOptions enumValueOptions) {
                RepeatedFieldBuilder repeatedFieldBuilder = null;
                if (enumValueOptions != EnumValueOptions.getDefaultInstance()) {
                    if (enumValueOptions.hasDeprecated()) {
                        setDeprecated(enumValueOptions.getDeprecated());
                    }
                    if (this.uninterpretedOptionBuilder_ == null) {
                        if (!enumValueOptions.uninterpretedOption_.isEmpty()) {
                            if (this.uninterpretedOption_.isEmpty()) {
                                this.uninterpretedOption_ = enumValueOptions.uninterpretedOption_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureUninterpretedOptionIsMutable();
                                this.uninterpretedOption_.addAll(enumValueOptions.uninterpretedOption_);
                            }
                            onChanged();
                        }
                    } else if (!enumValueOptions.uninterpretedOption_.isEmpty()) {
                        if (this.uninterpretedOptionBuilder_.isEmpty()) {
                            this.uninterpretedOptionBuilder_.dispose();
                            this.uninterpretedOptionBuilder_ = null;
                            this.uninterpretedOption_ = enumValueOptions.uninterpretedOption_;
                            this.bitField0_ &= -3;
                            if (GeneratedMessage.alwaysUseFieldBuilders) {
                                repeatedFieldBuilder = getUninterpretedOptionFieldBuilder();
                            }
                            this.uninterpretedOptionBuilder_ = repeatedFieldBuilder;
                        } else {
                            this.uninterpretedOptionBuilder_.addAllMessages(enumValueOptions.uninterpretedOption_);
                        }
                    }
                    mergeExtensionFields(enumValueOptions);
                    mergeUnknownFields(enumValueOptions.getUnknownFields());
                }
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < getUninterpretedOptionCount(); i += EnumValueOptions.DEPRECATED_FIELD_NUMBER) {
                    if (!getUninterpretedOption(i).isInitialized()) {
                        return false;
                    }
                }
                if (extensionsAreInitialized()) {
                    return true;
                }
                return false;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder mergeFrom(com.google.protobuf.CodedInputStream r5, com.google.protobuf.ExtensionRegistryLite r6) {
                /*
                r4 = this;
                r2 = 0;
                r0 = com.google.protobuf.DescriptorProtos.EnumValueOptions.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = (com.google.protobuf.DescriptorProtos.EnumValueOptions) r0;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                if (r0 == 0) goto L_0x000e;
            L_0x000b:
                r4.mergeFrom(r0);
            L_0x000e:
                return r4;
            L_0x000f:
                r0 = move-exception;
                r1 = r0;
                r0 = r1.getUnfinishedMessage();	 Catch:{ all -> 0x0022 }
                r0 = (com.google.protobuf.DescriptorProtos.EnumValueOptions) r0;	 Catch:{ all -> 0x0022 }
                throw r1;	 Catch:{ all -> 0x0018 }
            L_0x0018:
                r1 = move-exception;
                r3 = r1;
                r1 = r0;
                r0 = r3;
            L_0x001c:
                if (r1 == 0) goto L_0x0021;
            L_0x001e:
                r4.mergeFrom(r1);
            L_0x0021:
                throw r0;
            L_0x0022:
                r0 = move-exception;
                r1 = r2;
                goto L_0x001c;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.DescriptorProtos$EnumValueOptions$Builder");
            }

            public final boolean hasDeprecated() {
                return (this.bitField0_ & EnumValueOptions.DEPRECATED_FIELD_NUMBER) == EnumValueOptions.DEPRECATED_FIELD_NUMBER;
            }

            public final boolean getDeprecated() {
                return this.deprecated_;
            }

            public final Builder setDeprecated(boolean z) {
                this.bitField0_ |= EnumValueOptions.DEPRECATED_FIELD_NUMBER;
                this.deprecated_ = z;
                onChanged();
                return this;
            }

            public final Builder clearDeprecated() {
                this.bitField0_ &= -2;
                this.deprecated_ = false;
                onChanged();
                return this;
            }

            private void ensureUninterpretedOptionIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.uninterpretedOption_ = new ArrayList(this.uninterpretedOption_);
                    this.bitField0_ |= 2;
                }
            }

            public final List<UninterpretedOption> getUninterpretedOptionList() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    return Collections.unmodifiableList(this.uninterpretedOption_);
                }
                return this.uninterpretedOptionBuilder_.getMessageList();
            }

            public final int getUninterpretedOptionCount() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    return this.uninterpretedOption_.size();
                }
                return this.uninterpretedOptionBuilder_.getCount();
            }

            public final UninterpretedOption getUninterpretedOption(int i) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    return (UninterpretedOption) this.uninterpretedOption_.get(i);
                }
                return (UninterpretedOption) this.uninterpretedOptionBuilder_.getMessage(i);
            }

            public final Builder setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
                if (this.uninterpretedOptionBuilder_ != null) {
                    this.uninterpretedOptionBuilder_.setMessage(i, uninterpretedOption);
                } else if (uninterpretedOption == null) {
                    throw new NullPointerException();
                } else {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.set(i, uninterpretedOption);
                    onChanged();
                }
                return this;
            }

            public final Builder setUninterpretedOption(int i, Builder builder) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.set(i, builder.build());
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
                if (this.uninterpretedOptionBuilder_ != null) {
                    this.uninterpretedOptionBuilder_.addMessage(uninterpretedOption);
                } else if (uninterpretedOption == null) {
                    throw new NullPointerException();
                } else {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.add(uninterpretedOption);
                    onChanged();
                }
                return this;
            }

            public final Builder addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
                if (this.uninterpretedOptionBuilder_ != null) {
                    this.uninterpretedOptionBuilder_.addMessage(i, uninterpretedOption);
                } else if (uninterpretedOption == null) {
                    throw new NullPointerException();
                } else {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.add(i, uninterpretedOption);
                    onChanged();
                }
                return this;
            }

            public final Builder addUninterpretedOption(Builder builder) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.add(builder.build());
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public final Builder addUninterpretedOption(int i, Builder builder) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.add(i, builder.build());
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.uninterpretedOption_);
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public final Builder clearUninterpretedOption() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    this.uninterpretedOption_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.clear();
                }
                return this;
            }

            public final Builder removeUninterpretedOption(int i) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.remove(i);
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.remove(i);
                }
                return this;
            }

            public final Builder getUninterpretedOptionBuilder(int i) {
                return (Builder) getUninterpretedOptionFieldBuilder().getBuilder(i);
            }

            public final UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    return (UninterpretedOptionOrBuilder) this.uninterpretedOption_.get(i);
                }
                return (UninterpretedOptionOrBuilder) this.uninterpretedOptionBuilder_.getMessageOrBuilder(i);
            }

            public final List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
                if (this.uninterpretedOptionBuilder_ != null) {
                    return this.uninterpretedOptionBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.uninterpretedOption_);
            }

            public final Builder addUninterpretedOptionBuilder() {
                return (Builder) getUninterpretedOptionFieldBuilder().addBuilder(UninterpretedOption.getDefaultInstance());
            }

            public final Builder addUninterpretedOptionBuilder(int i) {
                return (Builder) getUninterpretedOptionFieldBuilder().addBuilder(i, UninterpretedOption.getDefaultInstance());
            }

            public final List<Builder> getUninterpretedOptionBuilderList() {
                return getUninterpretedOptionFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<UninterpretedOption, Builder, UninterpretedOptionOrBuilder> getUninterpretedOptionFieldBuilder() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    this.uninterpretedOptionBuilder_ = new RepeatedFieldBuilder(this.uninterpretedOption_, (this.bitField0_ & 2) == 2, getParentForChildren(), isClean());
                    this.uninterpretedOption_ = null;
                }
                return this.uninterpretedOptionBuilder_;
            }
        }

        private EnumValueOptions(ExtendableBuilder<EnumValueOptions, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        private EnumValueOptions(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static EnumValueOptions getDefaultInstance() {
            return defaultInstance;
        }

        public final EnumValueOptions getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private EnumValueOptions(com.google.protobuf.CodedInputStream r9, com.google.protobuf.ExtensionRegistryLite r10) {
            /*
            r8 = this;
            r2 = 1;
            r0 = 0;
            r1 = -1;
            r6 = 2;
            r8.<init>();
            r8.memoizedIsInitialized = r1;
            r8.memoizedSerializedSize = r1;
            r8.initFields();
            r3 = com.google.protobuf.UnknownFieldSet.newBuilder();
            r1 = r0;
        L_0x0013:
            if (r1 != 0) goto L_0x007e;
        L_0x0015:
            r4 = r9.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            switch(r4) {
                case 0: goto L_0x0024;
                case 8: goto L_0x0026;
                case 7994: goto L_0x0053;
                default: goto L_0x001c;
            };	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
        L_0x001c:
            r4 = r8.parseUnknownField(r9, r3, r10, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            if (r4 != 0) goto L_0x0013;
        L_0x0022:
            r1 = r2;
            goto L_0x0013;
        L_0x0024:
            r1 = r2;
            goto L_0x0013;
        L_0x0026:
            r4 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            r4 = r4 | 1;
            r8.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            r4 = r9.readBool();	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            r8.deprecated_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            goto L_0x0013;
        L_0x0033:
            r1 = move-exception;
            r7 = r1;
            r1 = r0;
            r0 = r7;
            r0 = r0.setUnfinishedMessage(r8);	 Catch:{ all -> 0x003c }
            throw r0;	 Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception;
        L_0x003d:
            r1 = r1 & 2;
            if (r1 != r6) goto L_0x0049;
        L_0x0041:
            r1 = r8.uninterpretedOption_;
            r1 = java.util.Collections.unmodifiableList(r1);
            r8.uninterpretedOption_ = r1;
        L_0x0049:
            r1 = r3.build();
            r8.unknownFields = r1;
            r8.makeExtensionsImmutable();
            throw r0;
        L_0x0053:
            r4 = r0 & 2;
            if (r4 == r6) goto L_0x0060;
        L_0x0057:
            r4 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            r4.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            r8.uninterpretedOption_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            r0 = r0 | 2;
        L_0x0060:
            r4 = r8.uninterpretedOption_;	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            r5 = com.google.protobuf.DescriptorProtos.UninterpretedOption.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            r5 = r9.readMessage(r5, r10);	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            r4.add(r5);	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            goto L_0x0013;
        L_0x006c:
            r1 = move-exception;
            r7 = r1;
            r1 = r0;
            r0 = r7;
            r2 = new com.google.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x003c }
            r0 = r0.getMessage();	 Catch:{ all -> 0x003c }
            r2.<init>(r0);	 Catch:{ all -> 0x003c }
            r0 = r2.setUnfinishedMessage(r8);	 Catch:{ all -> 0x003c }
            throw r0;	 Catch:{ all -> 0x003c }
        L_0x007e:
            r0 = r0 & 2;
            if (r0 != r6) goto L_0x008a;
        L_0x0082:
            r0 = r8.uninterpretedOption_;
            r0 = java.util.Collections.unmodifiableList(r0);
            r8.uninterpretedOption_ = r0;
        L_0x008a:
            r0 = r3.build();
            r8.unknownFields = r0;
            r8.makeExtensionsImmutable();
            return;
        L_0x0094:
            r1 = move-exception;
            r7 = r1;
            r1 = r0;
            r0 = r7;
            goto L_0x003d;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.EnumValueOptions.<init>(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):void");
        }

        public static final Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_EnumValueOptions_descriptor;
        }

        protected final FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.f2779xdf65a421.ensureFieldAccessorsInitialized(EnumValueOptions.class, Builder.class);
        }

        static {
            PARSER = new C02831();
            EnumValueOptions enumValueOptions = new EnumValueOptions(true);
            defaultInstance = enumValueOptions;
            enumValueOptions.initFields();
        }

        public final Parser<EnumValueOptions> getParserForType() {
            return PARSER;
        }

        public final boolean hasDeprecated() {
            return (this.bitField0_ & DEPRECATED_FIELD_NUMBER) == DEPRECATED_FIELD_NUMBER;
        }

        public final boolean getDeprecated() {
            return this.deprecated_;
        }

        public final List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public final List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        public final int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public final UninterpretedOption getUninterpretedOption(int i) {
            return (UninterpretedOption) this.uninterpretedOption_.get(i);
        }

        public final UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i) {
            return (UninterpretedOptionOrBuilder) this.uninterpretedOption_.get(i);
        }

        private void initFields() {
            this.deprecated_ = false;
            this.uninterpretedOption_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == null) {
                return false;
            }
            int i = 0;
            while (i < getUninterpretedOptionCount()) {
                if (getUninterpretedOption(i).isInitialized()) {
                    i += DEPRECATED_FIELD_NUMBER;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & DEPRECATED_FIELD_NUMBER) == DEPRECATED_FIELD_NUMBER) {
                codedOutputStream.writeBool(DEPRECATED_FIELD_NUMBER, this.deprecated_);
            }
            for (int i = 0; i < this.uninterpretedOption_.size(); i += DEPRECATED_FIELD_NUMBER) {
                codedOutputStream.writeMessage(UNINTERPRETED_OPTION_FIELD_NUMBER, (MessageLite) this.uninterpretedOption_.get(i));
            }
            newExtensionWriter.writeUntil(536870912, codedOutputStream);
            getUnknownFields().writeTo(codedOutputStream);
        }

        public final int getSerializedSize() {
            int i = 0;
            int i2 = this.memoizedSerializedSize;
            if (i2 != -1) {
                return i2;
            }
            if ((this.bitField0_ & DEPRECATED_FIELD_NUMBER) == DEPRECATED_FIELD_NUMBER) {
                i2 = CodedOutputStream.computeBoolSize(DEPRECATED_FIELD_NUMBER, this.deprecated_) + 0;
            } else {
                i2 = 0;
            }
            int i3 = i2;
            while (i < this.uninterpretedOption_.size()) {
                i += DEPRECATED_FIELD_NUMBER;
                i3 = CodedOutputStream.computeMessageSize(UNINTERPRETED_OPTION_FIELD_NUMBER, (MessageLite) this.uninterpretedOption_.get(i)) + i3;
            }
            i2 = (extensionsSerializedSize() + i3) + getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = i2;
            return i2;
        }

        protected final Object writeReplace() {
            return super.writeReplace();
        }

        public static EnumValueOptions parseFrom(ByteString byteString) {
            return (EnumValueOptions) PARSER.parseFrom(byteString);
        }

        public static EnumValueOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumValueOptions) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EnumValueOptions parseFrom(byte[] bArr) {
            return (EnumValueOptions) PARSER.parseFrom(bArr);
        }

        public static EnumValueOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumValueOptions) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EnumValueOptions parseFrom(InputStream inputStream) {
            return (EnumValueOptions) PARSER.parseFrom(inputStream);
        }

        public static EnumValueOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumValueOptions) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static EnumValueOptions parseDelimitedFrom(InputStream inputStream) {
            return (EnumValueOptions) PARSER.parseDelimitedFrom(inputStream);
        }

        public static EnumValueOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumValueOptions) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static EnumValueOptions parseFrom(CodedInputStream codedInputStream) {
            return (EnumValueOptions) PARSER.parseFrom(codedInputStream);
        }

        public static EnumValueOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumValueOptions) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(EnumValueOptions enumValueOptions) {
            return newBuilder().mergeFrom(enumValueOptions);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        protected final Builder newBuilderForType(BuilderParent builderParent) {
            return new Builder(null);
        }
    }

    public interface FieldDescriptorProtoOrBuilder extends MessageOrBuilder {
        String getDefaultValue();

        ByteString getDefaultValueBytes();

        String getExtendee();

        ByteString getExtendeeBytes();

        Label getLabel();

        String getName();

        ByteString getNameBytes();

        int getNumber();

        int getOneofIndex();

        FieldOptions getOptions();

        FieldOptionsOrBuilder getOptionsOrBuilder();

        Type getType();

        String getTypeName();

        ByteString getTypeNameBytes();

        boolean hasDefaultValue();

        boolean hasExtendee();

        boolean hasLabel();

        boolean hasName();

        boolean hasNumber();

        boolean hasOneofIndex();

        boolean hasOptions();

        boolean hasType();

        boolean hasTypeName();
    }

    public static final class FieldDescriptorProto extends GeneratedMessage implements FieldDescriptorProtoOrBuilder {
        public static final int DEFAULT_VALUE_FIELD_NUMBER = 7;
        public static final int EXTENDEE_FIELD_NUMBER = 2;
        public static final int LABEL_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NUMBER_FIELD_NUMBER = 3;
        public static final int ONEOF_INDEX_FIELD_NUMBER = 9;
        public static final int OPTIONS_FIELD_NUMBER = 8;
        public static Parser<FieldDescriptorProto> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 5;
        public static final int TYPE_NAME_FIELD_NUMBER = 6;
        private static final FieldDescriptorProto defaultInstance;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private Object defaultValue_;
        private Object extendee_;
        private Label label_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object name_;
        private int number_;
        private int oneofIndex_;
        private FieldOptions options_;
        private Object typeName_;
        private Type type_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.google.protobuf.DescriptorProtos.FieldDescriptorProto.1 */
        static class C02841 extends AbstractParser<FieldDescriptorProto> {
            C02841() {
            }

            public final FieldDescriptorProto parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new FieldDescriptorProto(extensionRegistryLite, null);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements FieldDescriptorProtoOrBuilder {
            private int bitField0_;
            private Object defaultValue_;
            private Object extendee_;
            private Label label_;
            private Object name_;
            private int number_;
            private int oneofIndex_;
            private SingleFieldBuilder<FieldOptions, Builder, FieldOptionsOrBuilder> optionsBuilder_;
            private FieldOptions options_;
            private Object typeName_;
            private Type type_;

            public static final Descriptor getDescriptor() {
                return DescriptorProtos.internal_static_google_protobuf_FieldDescriptorProto_descriptor;
            }

            protected final FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.f2780x4734b330.ensureFieldAccessorsInitialized(FieldDescriptorProto.class, Builder.class);
            }

            private Builder() {
                this.name_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.label_ = Label.LABEL_OPTIONAL;
                this.type_ = Type.TYPE_DOUBLE;
                this.typeName_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.extendee_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.defaultValue_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.options_ = FieldOptions.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent builderParent) {
                super(builderParent);
                this.name_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.label_ = Label.LABEL_OPTIONAL;
                this.type_ = Type.TYPE_DOUBLE;
                this.typeName_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.extendee_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.defaultValue_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.options_ = FieldOptions.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    getOptionsFieldBuilder();
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public final Builder clear() {
                super.clear();
                this.name_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.bitField0_ &= -2;
                this.number_ = 0;
                this.bitField0_ &= -3;
                this.label_ = Label.LABEL_OPTIONAL;
                this.bitField0_ &= -5;
                this.type_ = Type.TYPE_DOUBLE;
                this.bitField0_ &= -9;
                this.typeName_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.bitField0_ &= -17;
                this.extendee_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.bitField0_ &= -33;
                this.defaultValue_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.bitField0_ &= -65;
                this.oneofIndex_ = 0;
                this.bitField0_ &= -129;
                if (this.optionsBuilder_ == null) {
                    this.options_ = FieldOptions.getDefaultInstance();
                } else {
                    this.optionsBuilder_.clear();
                }
                this.bitField0_ &= -257;
                return this;
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_FieldDescriptorProto_descriptor;
            }

            public final FieldDescriptorProto getDefaultInstanceForType() {
                return FieldDescriptorProto.getDefaultInstance();
            }

            public final FieldDescriptorProto build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
            }

            public final FieldDescriptorProto buildPartial() {
                int i;
                int i2 = FieldDescriptorProto.NAME_FIELD_NUMBER;
                FieldDescriptorProto fieldDescriptorProto = new FieldDescriptorProto(null);
                int i3 = this.bitField0_;
                if ((i3 & FieldDescriptorProto.NAME_FIELD_NUMBER) != FieldDescriptorProto.NAME_FIELD_NUMBER) {
                    i2 = 0;
                }
                fieldDescriptorProto.name_ = this.name_;
                if ((i3 & FieldDescriptorProto.EXTENDEE_FIELD_NUMBER) == FieldDescriptorProto.EXTENDEE_FIELD_NUMBER) {
                    i2 |= FieldDescriptorProto.EXTENDEE_FIELD_NUMBER;
                }
                fieldDescriptorProto.number_ = this.number_;
                if ((i3 & FieldDescriptorProto.LABEL_FIELD_NUMBER) == FieldDescriptorProto.LABEL_FIELD_NUMBER) {
                    i2 |= FieldDescriptorProto.LABEL_FIELD_NUMBER;
                }
                fieldDescriptorProto.label_ = this.label_;
                if ((i3 & FieldDescriptorProto.OPTIONS_FIELD_NUMBER) == FieldDescriptorProto.OPTIONS_FIELD_NUMBER) {
                    i2 |= FieldDescriptorProto.OPTIONS_FIELD_NUMBER;
                }
                fieldDescriptorProto.type_ = this.type_;
                if ((i3 & 16) == 16) {
                    i2 |= 16;
                }
                fieldDescriptorProto.typeName_ = this.typeName_;
                if ((i3 & 32) == 32) {
                    i2 |= 32;
                }
                fieldDescriptorProto.extendee_ = this.extendee_;
                if ((i3 & 64) == 64) {
                    i2 |= 64;
                }
                fieldDescriptorProto.defaultValue_ = this.defaultValue_;
                if ((i3 & AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) == AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) {
                    i2 |= AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS;
                }
                fieldDescriptorProto.oneofIndex_ = this.oneofIndex_;
                if ((i3 & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
                    i = i2 | AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                } else {
                    i = i2;
                }
                if (this.optionsBuilder_ == null) {
                    fieldDescriptorProto.options_ = this.options_;
                } else {
                    fieldDescriptorProto.options_ = (FieldOptions) this.optionsBuilder_.build();
                }
                fieldDescriptorProto.bitField0_ = i;
                onBuilt();
                return fieldDescriptorProto;
            }

            public final Builder mergeFrom(Message message) {
                if (message instanceof FieldDescriptorProto) {
                    return mergeFrom((FieldDescriptorProto) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public final Builder mergeFrom(FieldDescriptorProto fieldDescriptorProto) {
                if (fieldDescriptorProto != FieldDescriptorProto.getDefaultInstance()) {
                    if (fieldDescriptorProto.hasName()) {
                        this.bitField0_ |= FieldDescriptorProto.NAME_FIELD_NUMBER;
                        this.name_ = fieldDescriptorProto.name_;
                        onChanged();
                    }
                    if (fieldDescriptorProto.hasNumber()) {
                        setNumber(fieldDescriptorProto.getNumber());
                    }
                    if (fieldDescriptorProto.hasLabel()) {
                        setLabel(fieldDescriptorProto.getLabel());
                    }
                    if (fieldDescriptorProto.hasType()) {
                        setType(fieldDescriptorProto.getType());
                    }
                    if (fieldDescriptorProto.hasTypeName()) {
                        this.bitField0_ |= 16;
                        this.typeName_ = fieldDescriptorProto.typeName_;
                        onChanged();
                    }
                    if (fieldDescriptorProto.hasExtendee()) {
                        this.bitField0_ |= 32;
                        this.extendee_ = fieldDescriptorProto.extendee_;
                        onChanged();
                    }
                    if (fieldDescriptorProto.hasDefaultValue()) {
                        this.bitField0_ |= 64;
                        this.defaultValue_ = fieldDescriptorProto.defaultValue_;
                        onChanged();
                    }
                    if (fieldDescriptorProto.hasOneofIndex()) {
                        setOneofIndex(fieldDescriptorProto.getOneofIndex());
                    }
                    if (fieldDescriptorProto.hasOptions()) {
                        mergeOptions(fieldDescriptorProto.getOptions());
                    }
                    mergeUnknownFields(fieldDescriptorProto.getUnknownFields());
                }
                return this;
            }

            public final boolean isInitialized() {
                if (!hasOptions() || getOptions().isInitialized()) {
                    return true;
                }
                return false;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder mergeFrom(com.google.protobuf.CodedInputStream r5, com.google.protobuf.ExtensionRegistryLite r6) {
                /*
                r4 = this;
                r2 = 0;
                r0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = (com.google.protobuf.DescriptorProtos.FieldDescriptorProto) r0;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                if (r0 == 0) goto L_0x000e;
            L_0x000b:
                r4.mergeFrom(r0);
            L_0x000e:
                return r4;
            L_0x000f:
                r0 = move-exception;
                r1 = r0;
                r0 = r1.getUnfinishedMessage();	 Catch:{ all -> 0x0022 }
                r0 = (com.google.protobuf.DescriptorProtos.FieldDescriptorProto) r0;	 Catch:{ all -> 0x0022 }
                throw r1;	 Catch:{ all -> 0x0018 }
            L_0x0018:
                r1 = move-exception;
                r3 = r1;
                r1 = r0;
                r0 = r3;
            L_0x001c:
                if (r1 == 0) goto L_0x0021;
            L_0x001e:
                r4.mergeFrom(r1);
            L_0x0021:
                throw r0;
            L_0x0022:
                r0 = move-exception;
                r1 = r2;
                goto L_0x001c;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Builder");
            }

            public final boolean hasName() {
                return (this.bitField0_ & FieldDescriptorProto.NAME_FIELD_NUMBER) == FieldDescriptorProto.NAME_FIELD_NUMBER;
            }

            public final String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String toStringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.name_ = toStringUtf8;
                }
                return toStringUtf8;
            }

            public final ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final Builder setName(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= FieldDescriptorProto.NAME_FIELD_NUMBER;
                this.name_ = str;
                onChanged();
                return this;
            }

            public final Builder clearName() {
                this.bitField0_ &= -2;
                this.name_ = FieldDescriptorProto.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public final Builder setNameBytes(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= FieldDescriptorProto.NAME_FIELD_NUMBER;
                this.name_ = byteString;
                onChanged();
                return this;
            }

            public final boolean hasNumber() {
                return (this.bitField0_ & FieldDescriptorProto.EXTENDEE_FIELD_NUMBER) == FieldDescriptorProto.EXTENDEE_FIELD_NUMBER;
            }

            public final int getNumber() {
                return this.number_;
            }

            public final Builder setNumber(int i) {
                this.bitField0_ |= FieldDescriptorProto.EXTENDEE_FIELD_NUMBER;
                this.number_ = i;
                onChanged();
                return this;
            }

            public final Builder clearNumber() {
                this.bitField0_ &= -3;
                this.number_ = 0;
                onChanged();
                return this;
            }

            public final boolean hasLabel() {
                return (this.bitField0_ & FieldDescriptorProto.LABEL_FIELD_NUMBER) == FieldDescriptorProto.LABEL_FIELD_NUMBER;
            }

            public final Label getLabel() {
                return this.label_;
            }

            public final Builder setLabel(Label label) {
                if (label == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= FieldDescriptorProto.LABEL_FIELD_NUMBER;
                this.label_ = label;
                onChanged();
                return this;
            }

            public final Builder clearLabel() {
                this.bitField0_ &= -5;
                this.label_ = Label.LABEL_OPTIONAL;
                onChanged();
                return this;
            }

            public final boolean hasType() {
                return (this.bitField0_ & FieldDescriptorProto.OPTIONS_FIELD_NUMBER) == FieldDescriptorProto.OPTIONS_FIELD_NUMBER;
            }

            public final Type getType() {
                return this.type_;
            }

            public final Builder setType(Type type) {
                if (type == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= FieldDescriptorProto.OPTIONS_FIELD_NUMBER;
                this.type_ = type;
                onChanged();
                return this;
            }

            public final Builder clearType() {
                this.bitField0_ &= -9;
                this.type_ = Type.TYPE_DOUBLE;
                onChanged();
                return this;
            }

            public final boolean hasTypeName() {
                return (this.bitField0_ & 16) == 16;
            }

            public final String getTypeName() {
                Object obj = this.typeName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String toStringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.typeName_ = toStringUtf8;
                }
                return toStringUtf8;
            }

            public final ByteString getTypeNameBytes() {
                Object obj = this.typeName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.typeName_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final Builder setTypeName(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 16;
                this.typeName_ = str;
                onChanged();
                return this;
            }

            public final Builder clearTypeName() {
                this.bitField0_ &= -17;
                this.typeName_ = FieldDescriptorProto.getDefaultInstance().getTypeName();
                onChanged();
                return this;
            }

            public final Builder setTypeNameBytes(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 16;
                this.typeName_ = byteString;
                onChanged();
                return this;
            }

            public final boolean hasExtendee() {
                return (this.bitField0_ & 32) == 32;
            }

            public final String getExtendee() {
                Object obj = this.extendee_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String toStringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.extendee_ = toStringUtf8;
                }
                return toStringUtf8;
            }

            public final ByteString getExtendeeBytes() {
                Object obj = this.extendee_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.extendee_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final Builder setExtendee(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 32;
                this.extendee_ = str;
                onChanged();
                return this;
            }

            public final Builder clearExtendee() {
                this.bitField0_ &= -33;
                this.extendee_ = FieldDescriptorProto.getDefaultInstance().getExtendee();
                onChanged();
                return this;
            }

            public final Builder setExtendeeBytes(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 32;
                this.extendee_ = byteString;
                onChanged();
                return this;
            }

            public final boolean hasDefaultValue() {
                return (this.bitField0_ & 64) == 64;
            }

            public final String getDefaultValue() {
                Object obj = this.defaultValue_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String toStringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.defaultValue_ = toStringUtf8;
                }
                return toStringUtf8;
            }

            public final ByteString getDefaultValueBytes() {
                Object obj = this.defaultValue_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.defaultValue_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final Builder setDefaultValue(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 64;
                this.defaultValue_ = str;
                onChanged();
                return this;
            }

            public final Builder clearDefaultValue() {
                this.bitField0_ &= -65;
                this.defaultValue_ = FieldDescriptorProto.getDefaultInstance().getDefaultValue();
                onChanged();
                return this;
            }

            public final Builder setDefaultValueBytes(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 64;
                this.defaultValue_ = byteString;
                onChanged();
                return this;
            }

            public final boolean hasOneofIndex() {
                return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) == AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS;
            }

            public final int getOneofIndex() {
                return this.oneofIndex_;
            }

            public final Builder setOneofIndex(int i) {
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS;
                this.oneofIndex_ = i;
                onChanged();
                return this;
            }

            public final Builder clearOneofIndex() {
                this.bitField0_ &= -129;
                this.oneofIndex_ = 0;
                onChanged();
                return this;
            }

            public final boolean hasOptions() {
                return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
            }

            public final FieldOptions getOptions() {
                if (this.optionsBuilder_ == null) {
                    return this.options_;
                }
                return (FieldOptions) this.optionsBuilder_.getMessage();
            }

            public final Builder setOptions(FieldOptions fieldOptions) {
                if (this.optionsBuilder_ != null) {
                    this.optionsBuilder_.setMessage(fieldOptions);
                } else if (fieldOptions == null) {
                    throw new NullPointerException();
                } else {
                    this.options_ = fieldOptions;
                    onChanged();
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                return this;
            }

            public final Builder setOptions(Builder builder) {
                if (this.optionsBuilder_ == null) {
                    this.options_ = builder.build();
                    onChanged();
                } else {
                    this.optionsBuilder_.setMessage(builder.build());
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                return this;
            }

            public final Builder mergeOptions(FieldOptions fieldOptions) {
                if (this.optionsBuilder_ == null) {
                    if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) != AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY || this.options_ == FieldOptions.getDefaultInstance()) {
                        this.options_ = fieldOptions;
                    } else {
                        this.options_ = FieldOptions.newBuilder(this.options_).mergeFrom(fieldOptions).buildPartial();
                    }
                    onChanged();
                } else {
                    this.optionsBuilder_.mergeFrom(fieldOptions);
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                return this;
            }

            public final Builder clearOptions() {
                if (this.optionsBuilder_ == null) {
                    this.options_ = FieldOptions.getDefaultInstance();
                    onChanged();
                } else {
                    this.optionsBuilder_.clear();
                }
                this.bitField0_ &= -257;
                return this;
            }

            public final Builder getOptionsBuilder() {
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                onChanged();
                return (Builder) getOptionsFieldBuilder().getBuilder();
            }

            public final FieldOptionsOrBuilder getOptionsOrBuilder() {
                if (this.optionsBuilder_ != null) {
                    return (FieldOptionsOrBuilder) this.optionsBuilder_.getMessageOrBuilder();
                }
                return this.options_;
            }

            private SingleFieldBuilder<FieldOptions, Builder, FieldOptionsOrBuilder> getOptionsFieldBuilder() {
                if (this.optionsBuilder_ == null) {
                    this.optionsBuilder_ = new SingleFieldBuilder(getOptions(), getParentForChildren(), isClean());
                    this.options_ = null;
                }
                return this.optionsBuilder_;
            }
        }

        public enum Label implements ProtocolMessageEnum {
            LABEL_OPTIONAL(0, LABEL_OPTIONAL_VALUE),
            LABEL_REQUIRED(LABEL_OPTIONAL_VALUE, LABEL_REQUIRED_VALUE),
            LABEL_REPEATED(LABEL_REQUIRED_VALUE, LABEL_REPEATED_VALUE);
            
            public static final int LABEL_OPTIONAL_VALUE = 1;
            public static final int LABEL_REPEATED_VALUE = 3;
            public static final int LABEL_REQUIRED_VALUE = 2;
            private static final Label[] VALUES;
            private static EnumLiteMap<Label> internalValueMap;
            private final int index;
            private final int value;

            /* renamed from: com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.1 */
            static class C02851 implements EnumLiteMap<Label> {
                C02851() {
                }

                public final Label findValueByNumber(int i) {
                    return Label.valueOf(i);
                }
            }

            static {
                internalValueMap = new C02851();
                VALUES = values();
            }

            public final int getNumber() {
                return this.value;
            }

            public static Label valueOf(int i) {
                switch (i) {
                    case LABEL_OPTIONAL_VALUE:
                        return LABEL_OPTIONAL;
                    case LABEL_REQUIRED_VALUE:
                        return LABEL_REQUIRED;
                    case LABEL_REPEATED_VALUE:
                        return LABEL_REPEATED;
                    default:
                        return null;
                }
            }

            public static EnumLiteMap<Label> internalGetValueMap() {
                return internalValueMap;
            }

            public final EnumValueDescriptor getValueDescriptor() {
                return (EnumValueDescriptor) getDescriptor().getValues().get(this.index);
            }

            public final EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            public static final EnumDescriptor getDescriptor() {
                return (EnumDescriptor) FieldDescriptorProto.getDescriptor().getEnumTypes().get(LABEL_OPTIONAL_VALUE);
            }

            public static Label valueOf(EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }

            private Label(int i, int i2) {
                this.index = i;
                this.value = i2;
            }
        }

        public enum Type implements ProtocolMessageEnum {
            TYPE_DOUBLE(0, TYPE_DOUBLE_VALUE),
            TYPE_FLOAT(TYPE_DOUBLE_VALUE, TYPE_FLOAT_VALUE),
            TYPE_INT64(TYPE_FLOAT_VALUE, TYPE_INT64_VALUE),
            TYPE_UINT64(TYPE_INT64_VALUE, TYPE_UINT64_VALUE),
            TYPE_INT32(TYPE_UINT64_VALUE, TYPE_INT32_VALUE),
            TYPE_FIXED64(TYPE_INT32_VALUE, TYPE_FIXED64_VALUE),
            TYPE_FIXED32(TYPE_FIXED64_VALUE, TYPE_FIXED32_VALUE),
            TYPE_BOOL(TYPE_FIXED32_VALUE, TYPE_BOOL_VALUE),
            TYPE_STRING(TYPE_BOOL_VALUE, TYPE_STRING_VALUE),
            TYPE_GROUP(TYPE_STRING_VALUE, TYPE_GROUP_VALUE),
            TYPE_MESSAGE(TYPE_GROUP_VALUE, TYPE_MESSAGE_VALUE),
            TYPE_BYTES(TYPE_MESSAGE_VALUE, TYPE_BYTES_VALUE),
            TYPE_UINT32(TYPE_BYTES_VALUE, TYPE_UINT32_VALUE),
            TYPE_ENUM(TYPE_UINT32_VALUE, TYPE_ENUM_VALUE),
            TYPE_SFIXED32(TYPE_ENUM_VALUE, TYPE_SFIXED32_VALUE),
            TYPE_SFIXED64(TYPE_SFIXED32_VALUE, TYPE_SFIXED64_VALUE),
            TYPE_SINT32(TYPE_SFIXED64_VALUE, TYPE_SINT32_VALUE),
            TYPE_SINT64(TYPE_SINT32_VALUE, TYPE_SINT64_VALUE);
            
            public static final int TYPE_BOOL_VALUE = 8;
            public static final int TYPE_BYTES_VALUE = 12;
            public static final int TYPE_DOUBLE_VALUE = 1;
            public static final int TYPE_ENUM_VALUE = 14;
            public static final int TYPE_FIXED32_VALUE = 7;
            public static final int TYPE_FIXED64_VALUE = 6;
            public static final int TYPE_FLOAT_VALUE = 2;
            public static final int TYPE_GROUP_VALUE = 10;
            public static final int TYPE_INT32_VALUE = 5;
            public static final int TYPE_INT64_VALUE = 3;
            public static final int TYPE_MESSAGE_VALUE = 11;
            public static final int TYPE_SFIXED32_VALUE = 15;
            public static final int TYPE_SFIXED64_VALUE = 16;
            public static final int TYPE_SINT32_VALUE = 17;
            public static final int TYPE_SINT64_VALUE = 18;
            public static final int TYPE_STRING_VALUE = 9;
            public static final int TYPE_UINT32_VALUE = 13;
            public static final int TYPE_UINT64_VALUE = 4;
            private static final Type[] VALUES;
            private static EnumLiteMap<Type> internalValueMap;
            private final int index;
            private final int value;

            /* renamed from: com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.1 */
            static class C02861 implements EnumLiteMap<Type> {
                C02861() {
                }

                public final Type findValueByNumber(int i) {
                    return Type.valueOf(i);
                }
            }

            static {
                internalValueMap = new C02861();
                VALUES = values();
            }

            public final int getNumber() {
                return this.value;
            }

            public static Type valueOf(int i) {
                switch (i) {
                    case TYPE_DOUBLE_VALUE:
                        return TYPE_DOUBLE;
                    case TYPE_FLOAT_VALUE:
                        return TYPE_FLOAT;
                    case TYPE_INT64_VALUE:
                        return TYPE_INT64;
                    case TYPE_UINT64_VALUE:
                        return TYPE_UINT64;
                    case TYPE_INT32_VALUE:
                        return TYPE_INT32;
                    case TYPE_FIXED64_VALUE:
                        return TYPE_FIXED64;
                    case TYPE_FIXED32_VALUE:
                        return TYPE_FIXED32;
                    case TYPE_BOOL_VALUE:
                        return TYPE_BOOL;
                    case TYPE_STRING_VALUE:
                        return TYPE_STRING;
                    case TYPE_GROUP_VALUE:
                        return TYPE_GROUP;
                    case TYPE_MESSAGE_VALUE:
                        return TYPE_MESSAGE;
                    case TYPE_BYTES_VALUE:
                        return TYPE_BYTES;
                    case TYPE_UINT32_VALUE:
                        return TYPE_UINT32;
                    case TYPE_ENUM_VALUE:
                        return TYPE_ENUM;
                    case TYPE_SFIXED32_VALUE:
                        return TYPE_SFIXED32;
                    case TYPE_SFIXED64_VALUE:
                        return TYPE_SFIXED64;
                    case TYPE_SINT32_VALUE:
                        return TYPE_SINT32;
                    case TYPE_SINT64_VALUE:
                        return TYPE_SINT64;
                    default:
                        return null;
                }
            }

            public static EnumLiteMap<Type> internalGetValueMap() {
                return internalValueMap;
            }

            public final EnumValueDescriptor getValueDescriptor() {
                return (EnumValueDescriptor) getDescriptor().getValues().get(this.index);
            }

            public final EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            public static final EnumDescriptor getDescriptor() {
                return (EnumDescriptor) FieldDescriptorProto.getDescriptor().getEnumTypes().get(0);
            }

            public static Type valueOf(EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }

            private Type(int i, int i2) {
                this.index = i;
                this.value = i2;
            }
        }

        private FieldDescriptorProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private FieldDescriptorProto(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static FieldDescriptorProto getDefaultInstance() {
            return defaultInstance;
        }

        public final FieldDescriptorProto getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private FieldDescriptorProto(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            com.google.protobuf.UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            Object obj = null;
            while (obj == null) {
                try {
                    int readTag = codedInputStream.readTag();
                    ByteString readBytes;
                    switch (readTag) {
                        case SQLiteDatabase.OPEN_READWRITE /*0*/:
                            obj = NAME_FIELD_NUMBER;
                            break;
                        case PushMsg.SMSG_FIELD_NUMBER /*10*/:
                            readBytes = codedInputStream.readBytes();
                            this.bitField0_ |= NAME_FIELD_NUMBER;
                            this.name_ = readBytes;
                            break;
                        case PushMsg.IVIBRATE_FIELD_NUMBER /*18*/:
                            readBytes = codedInputStream.readBytes();
                            this.bitField0_ |= 32;
                            this.extendee_ = readBytes;
                            break;
                        case GameRoomBaseInfo.BINSURANCE_FIELD_NUMBER /*24*/:
                            this.bitField0_ |= EXTENDEE_FIELD_NUMBER;
                            this.number_ = codedInputStream.readInt32();
                            break;
                        case GameRoomBaseInfo.SFROMCLUBNAME_FIELD_NUMBER /*32*/:
                            readTag = codedInputStream.readEnum();
                            Label valueOf = Label.valueOf(readTag);
                            if (valueOf != null) {
                                this.bitField0_ |= LABEL_FIELD_NUMBER;
                                this.label_ = valueOf;
                                break;
                            }
                            newBuilder.mergeVarintField(LABEL_FIELD_NUMBER, readTag);
                            break;
                        case R.AppCompatTheme_textAppearanceLargePopupMenu /*40*/:
                            readTag = codedInputStream.readEnum();
                            Type valueOf2 = Type.valueOf(readTag);
                            if (valueOf2 != null) {
                                this.bitField0_ |= OPTIONS_FIELD_NUMBER;
                                this.type_ = valueOf2;
                                break;
                            }
                            newBuilder.mergeVarintField(TYPE_FIELD_NUMBER, readTag);
                            break;
                        case R.AppCompatTheme_actionButtonStyle /*50*/:
                            readBytes = codedInputStream.readBytes();
                            this.bitField0_ |= 16;
                            this.typeName_ = readBytes;
                            break;
                        case R.AppCompatTheme_activityChooserViewStyle /*58*/:
                            readBytes = codedInputStream.readBytes();
                            this.bitField0_ |= 64;
                            this.defaultValue_ = readBytes;
                            break;
                        case R.AppCompatTheme_textAppearanceSearchResultTitle /*66*/:
                            Builder toBuilder;
                            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
                                toBuilder = this.options_.toBuilder();
                            } else {
                                toBuilder = null;
                            }
                            this.options_ = (FieldOptions) codedInputStream.readMessage(FieldOptions.PARSER, extensionRegistryLite);
                            if (toBuilder != null) {
                                toBuilder.mergeFrom(this.options_);
                                this.options_ = toBuilder.buildPartial();
                            }
                            this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                            break;
                        case R.AppCompatTheme_listPreferredItemHeightLarge /*72*/:
                            this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS;
                            this.oneofIndex_ = codedInputStream.readInt32();
                            break;
                        default:
                            if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                obj = NAME_FIELD_NUMBER;
                                break;
                            }
                            break;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                }
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
        }

        public static final Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_FieldDescriptorProto_descriptor;
        }

        protected final FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.f2780x4734b330.ensureFieldAccessorsInitialized(FieldDescriptorProto.class, Builder.class);
        }

        static {
            PARSER = new C02841();
            FieldDescriptorProto fieldDescriptorProto = new FieldDescriptorProto(true);
            defaultInstance = fieldDescriptorProto;
            fieldDescriptorProto.initFields();
        }

        public final Parser<FieldDescriptorProto> getParserForType() {
            return PARSER;
        }

        public final boolean hasName() {
            return (this.bitField0_ & NAME_FIELD_NUMBER) == NAME_FIELD_NUMBER;
        }

        public final String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String toStringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = toStringUtf8;
            }
            return toStringUtf8;
        }

        public final ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean hasNumber() {
            return (this.bitField0_ & EXTENDEE_FIELD_NUMBER) == EXTENDEE_FIELD_NUMBER;
        }

        public final int getNumber() {
            return this.number_;
        }

        public final boolean hasLabel() {
            return (this.bitField0_ & LABEL_FIELD_NUMBER) == LABEL_FIELD_NUMBER;
        }

        public final Label getLabel() {
            return this.label_;
        }

        public final boolean hasType() {
            return (this.bitField0_ & OPTIONS_FIELD_NUMBER) == OPTIONS_FIELD_NUMBER;
        }

        public final Type getType() {
            return this.type_;
        }

        public final boolean hasTypeName() {
            return (this.bitField0_ & 16) == 16;
        }

        public final String getTypeName() {
            Object obj = this.typeName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String toStringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.typeName_ = toStringUtf8;
            }
            return toStringUtf8;
        }

        public final ByteString getTypeNameBytes() {
            Object obj = this.typeName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.typeName_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean hasExtendee() {
            return (this.bitField0_ & 32) == 32;
        }

        public final String getExtendee() {
            Object obj = this.extendee_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String toStringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.extendee_ = toStringUtf8;
            }
            return toStringUtf8;
        }

        public final ByteString getExtendeeBytes() {
            Object obj = this.extendee_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.extendee_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean hasDefaultValue() {
            return (this.bitField0_ & 64) == 64;
        }

        public final String getDefaultValue() {
            Object obj = this.defaultValue_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String toStringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.defaultValue_ = toStringUtf8;
            }
            return toStringUtf8;
        }

        public final ByteString getDefaultValueBytes() {
            Object obj = this.defaultValue_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.defaultValue_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean hasOneofIndex() {
            return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) == AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS;
        }

        public final int getOneofIndex() {
            return this.oneofIndex_;
        }

        public final boolean hasOptions() {
            return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
        }

        public final FieldOptions getOptions() {
            return this.options_;
        }

        public final FieldOptionsOrBuilder getOptionsOrBuilder() {
            return this.options_;
        }

        private void initFields() {
            this.name_ = LetterIndexBar.SEARCH_ICON_LETTER;
            this.number_ = 0;
            this.label_ = Label.LABEL_OPTIONAL;
            this.type_ = Type.TYPE_DOUBLE;
            this.typeName_ = LetterIndexBar.SEARCH_ICON_LETTER;
            this.extendee_ = LetterIndexBar.SEARCH_ICON_LETTER;
            this.defaultValue_ = LetterIndexBar.SEARCH_ICON_LETTER;
            this.oneofIndex_ = 0;
            this.options_ = FieldOptions.getDefaultInstance();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == null) {
                return false;
            }
            if (!hasOptions() || getOptions().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.bitField0_ & NAME_FIELD_NUMBER) == NAME_FIELD_NUMBER) {
                codedOutputStream.writeBytes(NAME_FIELD_NUMBER, getNameBytes());
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeBytes(EXTENDEE_FIELD_NUMBER, getExtendeeBytes());
            }
            if ((this.bitField0_ & EXTENDEE_FIELD_NUMBER) == EXTENDEE_FIELD_NUMBER) {
                codedOutputStream.writeInt32(NUMBER_FIELD_NUMBER, this.number_);
            }
            if ((this.bitField0_ & LABEL_FIELD_NUMBER) == LABEL_FIELD_NUMBER) {
                codedOutputStream.writeEnum(LABEL_FIELD_NUMBER, this.label_.getNumber());
            }
            if ((this.bitField0_ & OPTIONS_FIELD_NUMBER) == OPTIONS_FIELD_NUMBER) {
                codedOutputStream.writeEnum(TYPE_FIELD_NUMBER, this.type_.getNumber());
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeBytes(TYPE_NAME_FIELD_NUMBER, getTypeNameBytes());
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.writeBytes(DEFAULT_VALUE_FIELD_NUMBER, getDefaultValueBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
                codedOutputStream.writeMessage(OPTIONS_FIELD_NUMBER, this.options_);
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) == AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) {
                codedOutputStream.writeInt32(ONEOF_INDEX_FIELD_NUMBER, this.oneofIndex_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public final int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            i = 0;
            if ((this.bitField0_ & NAME_FIELD_NUMBER) == NAME_FIELD_NUMBER) {
                i = CodedOutputStream.computeBytesSize(NAME_FIELD_NUMBER, getNameBytes()) + 0;
            }
            if ((this.bitField0_ & 32) == 32) {
                i += CodedOutputStream.computeBytesSize(EXTENDEE_FIELD_NUMBER, getExtendeeBytes());
            }
            if ((this.bitField0_ & EXTENDEE_FIELD_NUMBER) == EXTENDEE_FIELD_NUMBER) {
                i += CodedOutputStream.computeInt32Size(NUMBER_FIELD_NUMBER, this.number_);
            }
            if ((this.bitField0_ & LABEL_FIELD_NUMBER) == LABEL_FIELD_NUMBER) {
                i += CodedOutputStream.computeEnumSize(LABEL_FIELD_NUMBER, this.label_.getNumber());
            }
            if ((this.bitField0_ & OPTIONS_FIELD_NUMBER) == OPTIONS_FIELD_NUMBER) {
                i += CodedOutputStream.computeEnumSize(TYPE_FIELD_NUMBER, this.type_.getNumber());
            }
            if ((this.bitField0_ & 16) == 16) {
                i += CodedOutputStream.computeBytesSize(TYPE_NAME_FIELD_NUMBER, getTypeNameBytes());
            }
            if ((this.bitField0_ & 64) == 64) {
                i += CodedOutputStream.computeBytesSize(DEFAULT_VALUE_FIELD_NUMBER, getDefaultValueBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
                i += CodedOutputStream.computeMessageSize(OPTIONS_FIELD_NUMBER, this.options_);
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) == AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) {
                i += CodedOutputStream.computeInt32Size(ONEOF_INDEX_FIELD_NUMBER, this.oneofIndex_);
            }
            i += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = i;
            return i;
        }

        protected final Object writeReplace() {
            return super.writeReplace();
        }

        public static FieldDescriptorProto parseFrom(ByteString byteString) {
            return (FieldDescriptorProto) PARSER.parseFrom(byteString);
        }

        public static FieldDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (FieldDescriptorProto) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static FieldDescriptorProto parseFrom(byte[] bArr) {
            return (FieldDescriptorProto) PARSER.parseFrom(bArr);
        }

        public static FieldDescriptorProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (FieldDescriptorProto) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FieldDescriptorProto parseFrom(InputStream inputStream) {
            return (FieldDescriptorProto) PARSER.parseFrom(inputStream);
        }

        public static FieldDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FieldDescriptorProto) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static FieldDescriptorProto parseDelimitedFrom(InputStream inputStream) {
            return (FieldDescriptorProto) PARSER.parseDelimitedFrom(inputStream);
        }

        public static FieldDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FieldDescriptorProto) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static FieldDescriptorProto parseFrom(CodedInputStream codedInputStream) {
            return (FieldDescriptorProto) PARSER.parseFrom(codedInputStream);
        }

        public static FieldDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FieldDescriptorProto) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(FieldDescriptorProto fieldDescriptorProto) {
            return newBuilder().mergeFrom(fieldDescriptorProto);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        protected final Builder newBuilderForType(BuilderParent builderParent) {
            return new Builder(null);
        }
    }

    public interface FieldOptionsOrBuilder extends ExtendableMessageOrBuilder<FieldOptions> {
        CType getCtype();

        boolean getDeprecated();

        String getExperimentalMapKey();

        ByteString getExperimentalMapKeyBytes();

        boolean getLazy();

        boolean getPacked();

        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i);

        List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList();

        boolean getWeak();

        boolean hasCtype();

        boolean hasDeprecated();

        boolean hasExperimentalMapKey();

        boolean hasLazy();

        boolean hasPacked();

        boolean hasWeak();
    }

    public static final class FieldOptions extends ExtendableMessage<FieldOptions> implements FieldOptionsOrBuilder {
        public static final int CTYPE_FIELD_NUMBER = 1;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        public static final int EXPERIMENTAL_MAP_KEY_FIELD_NUMBER = 9;
        public static final int LAZY_FIELD_NUMBER = 5;
        public static final int PACKED_FIELD_NUMBER = 2;
        public static Parser<FieldOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        public static final int WEAK_FIELD_NUMBER = 10;
        private static final FieldOptions defaultInstance;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private CType ctype_;
        private boolean deprecated_;
        private Object experimentalMapKey_;
        private boolean lazy_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private boolean packed_;
        private List<UninterpretedOption> uninterpretedOption_;
        private final UnknownFieldSet unknownFields;
        private boolean weak_;

        /* renamed from: com.google.protobuf.DescriptorProtos.FieldOptions.1 */
        static class C02871 extends AbstractParser<FieldOptions> {
            C02871() {
            }

            public final FieldOptions parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new FieldOptions(extensionRegistryLite, null);
            }
        }

        public static final class Builder extends ExtendableBuilder<FieldOptions, Builder> implements FieldOptionsOrBuilder {
            private int bitField0_;
            private CType ctype_;
            private boolean deprecated_;
            private Object experimentalMapKey_;
            private boolean lazy_;
            private boolean packed_;
            private RepeatedFieldBuilder<UninterpretedOption, Builder, UninterpretedOptionOrBuilder> uninterpretedOptionBuilder_;
            private List<UninterpretedOption> uninterpretedOption_;
            private boolean weak_;

            public static final Descriptor getDescriptor() {
                return DescriptorProtos.internal_static_google_protobuf_FieldOptions_descriptor;
            }

            protected final FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.internal_static_google_protobuf_FieldOptions_fieldAccessorTable.ensureFieldAccessorsInitialized(FieldOptions.class, Builder.class);
            }

            private Builder() {
                this.ctype_ = CType.STRING;
                this.experimentalMapKey_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.uninterpretedOption_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent builderParent) {
                super(builderParent);
                this.ctype_ = CType.STRING;
                this.experimentalMapKey_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.uninterpretedOption_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    getUninterpretedOptionFieldBuilder();
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public final Builder clear() {
                super.clear();
                this.ctype_ = CType.STRING;
                this.bitField0_ &= -2;
                this.packed_ = false;
                this.bitField0_ &= -3;
                this.lazy_ = false;
                this.bitField0_ &= -5;
                this.deprecated_ = false;
                this.bitField0_ &= -9;
                this.experimentalMapKey_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.bitField0_ &= -17;
                this.weak_ = false;
                this.bitField0_ &= -33;
                if (this.uninterpretedOptionBuilder_ == null) {
                    this.uninterpretedOption_ = Collections.emptyList();
                    this.bitField0_ &= -65;
                } else {
                    this.uninterpretedOptionBuilder_.clear();
                }
                return this;
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_FieldOptions_descriptor;
            }

            public final FieldOptions getDefaultInstanceForType() {
                return FieldOptions.getDefaultInstance();
            }

            public final FieldOptions build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
            }

            public final FieldOptions buildPartial() {
                int i = FieldOptions.CTYPE_FIELD_NUMBER;
                FieldOptions fieldOptions = new FieldOptions(null);
                int i2 = this.bitField0_;
                if ((i2 & FieldOptions.CTYPE_FIELD_NUMBER) != FieldOptions.CTYPE_FIELD_NUMBER) {
                    i = 0;
                }
                fieldOptions.ctype_ = this.ctype_;
                if ((i2 & FieldOptions.PACKED_FIELD_NUMBER) == FieldOptions.PACKED_FIELD_NUMBER) {
                    i |= FieldOptions.PACKED_FIELD_NUMBER;
                }
                fieldOptions.packed_ = this.packed_;
                if ((i2 & 4) == 4) {
                    i |= 4;
                }
                fieldOptions.lazy_ = this.lazy_;
                if ((i2 & 8) == 8) {
                    i |= 8;
                }
                fieldOptions.deprecated_ = this.deprecated_;
                if ((i2 & 16) == 16) {
                    i |= 16;
                }
                fieldOptions.experimentalMapKey_ = this.experimentalMapKey_;
                if ((i2 & 32) == 32) {
                    i |= 32;
                }
                fieldOptions.weak_ = this.weak_;
                if (this.uninterpretedOptionBuilder_ == null) {
                    if ((this.bitField0_ & 64) == 64) {
                        this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                        this.bitField0_ &= -65;
                    }
                    fieldOptions.uninterpretedOption_ = this.uninterpretedOption_;
                } else {
                    fieldOptions.uninterpretedOption_ = this.uninterpretedOptionBuilder_.build();
                }
                fieldOptions.bitField0_ = i;
                onBuilt();
                return fieldOptions;
            }

            public final Builder mergeFrom(Message message) {
                if (message instanceof FieldOptions) {
                    return mergeFrom((FieldOptions) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public final Builder mergeFrom(FieldOptions fieldOptions) {
                RepeatedFieldBuilder repeatedFieldBuilder = null;
                if (fieldOptions != FieldOptions.getDefaultInstance()) {
                    if (fieldOptions.hasCtype()) {
                        setCtype(fieldOptions.getCtype());
                    }
                    if (fieldOptions.hasPacked()) {
                        setPacked(fieldOptions.getPacked());
                    }
                    if (fieldOptions.hasLazy()) {
                        setLazy(fieldOptions.getLazy());
                    }
                    if (fieldOptions.hasDeprecated()) {
                        setDeprecated(fieldOptions.getDeprecated());
                    }
                    if (fieldOptions.hasExperimentalMapKey()) {
                        this.bitField0_ |= 16;
                        this.experimentalMapKey_ = fieldOptions.experimentalMapKey_;
                        onChanged();
                    }
                    if (fieldOptions.hasWeak()) {
                        setWeak(fieldOptions.getWeak());
                    }
                    if (this.uninterpretedOptionBuilder_ == null) {
                        if (!fieldOptions.uninterpretedOption_.isEmpty()) {
                            if (this.uninterpretedOption_.isEmpty()) {
                                this.uninterpretedOption_ = fieldOptions.uninterpretedOption_;
                                this.bitField0_ &= -65;
                            } else {
                                ensureUninterpretedOptionIsMutable();
                                this.uninterpretedOption_.addAll(fieldOptions.uninterpretedOption_);
                            }
                            onChanged();
                        }
                    } else if (!fieldOptions.uninterpretedOption_.isEmpty()) {
                        if (this.uninterpretedOptionBuilder_.isEmpty()) {
                            this.uninterpretedOptionBuilder_.dispose();
                            this.uninterpretedOptionBuilder_ = null;
                            this.uninterpretedOption_ = fieldOptions.uninterpretedOption_;
                            this.bitField0_ &= -65;
                            if (GeneratedMessage.alwaysUseFieldBuilders) {
                                repeatedFieldBuilder = getUninterpretedOptionFieldBuilder();
                            }
                            this.uninterpretedOptionBuilder_ = repeatedFieldBuilder;
                        } else {
                            this.uninterpretedOptionBuilder_.addAllMessages(fieldOptions.uninterpretedOption_);
                        }
                    }
                    mergeExtensionFields(fieldOptions);
                    mergeUnknownFields(fieldOptions.getUnknownFields());
                }
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < getUninterpretedOptionCount(); i += FieldOptions.CTYPE_FIELD_NUMBER) {
                    if (!getUninterpretedOption(i).isInitialized()) {
                        return false;
                    }
                }
                if (extensionsAreInitialized()) {
                    return true;
                }
                return false;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.google.protobuf.DescriptorProtos.FieldOptions.Builder mergeFrom(com.google.protobuf.CodedInputStream r5, com.google.protobuf.ExtensionRegistryLite r6) {
                /*
                r4 = this;
                r2 = 0;
                r0 = com.google.protobuf.DescriptorProtos.FieldOptions.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = (com.google.protobuf.DescriptorProtos.FieldOptions) r0;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                if (r0 == 0) goto L_0x000e;
            L_0x000b:
                r4.mergeFrom(r0);
            L_0x000e:
                return r4;
            L_0x000f:
                r0 = move-exception;
                r1 = r0;
                r0 = r1.getUnfinishedMessage();	 Catch:{ all -> 0x0022 }
                r0 = (com.google.protobuf.DescriptorProtos.FieldOptions) r0;	 Catch:{ all -> 0x0022 }
                throw r1;	 Catch:{ all -> 0x0018 }
            L_0x0018:
                r1 = move-exception;
                r3 = r1;
                r1 = r0;
                r0 = r3;
            L_0x001c:
                if (r1 == 0) goto L_0x0021;
            L_0x001e:
                r4.mergeFrom(r1);
            L_0x0021:
                throw r0;
            L_0x0022:
                r0 = move-exception;
                r1 = r2;
                goto L_0x001c;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.FieldOptions.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.DescriptorProtos$FieldOptions$Builder");
            }

            public final boolean hasCtype() {
                return (this.bitField0_ & FieldOptions.CTYPE_FIELD_NUMBER) == FieldOptions.CTYPE_FIELD_NUMBER;
            }

            public final CType getCtype() {
                return this.ctype_;
            }

            public final Builder setCtype(CType cType) {
                if (cType == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= FieldOptions.CTYPE_FIELD_NUMBER;
                this.ctype_ = cType;
                onChanged();
                return this;
            }

            public final Builder clearCtype() {
                this.bitField0_ &= -2;
                this.ctype_ = CType.STRING;
                onChanged();
                return this;
            }

            public final boolean hasPacked() {
                return (this.bitField0_ & FieldOptions.PACKED_FIELD_NUMBER) == FieldOptions.PACKED_FIELD_NUMBER;
            }

            public final boolean getPacked() {
                return this.packed_;
            }

            public final Builder setPacked(boolean z) {
                this.bitField0_ |= FieldOptions.PACKED_FIELD_NUMBER;
                this.packed_ = z;
                onChanged();
                return this;
            }

            public final Builder clearPacked() {
                this.bitField0_ &= -3;
                this.packed_ = false;
                onChanged();
                return this;
            }

            public final boolean hasLazy() {
                return (this.bitField0_ & 4) == 4;
            }

            public final boolean getLazy() {
                return this.lazy_;
            }

            public final Builder setLazy(boolean z) {
                this.bitField0_ |= 4;
                this.lazy_ = z;
                onChanged();
                return this;
            }

            public final Builder clearLazy() {
                this.bitField0_ &= -5;
                this.lazy_ = false;
                onChanged();
                return this;
            }

            public final boolean hasDeprecated() {
                return (this.bitField0_ & 8) == 8;
            }

            public final boolean getDeprecated() {
                return this.deprecated_;
            }

            public final Builder setDeprecated(boolean z) {
                this.bitField0_ |= 8;
                this.deprecated_ = z;
                onChanged();
                return this;
            }

            public final Builder clearDeprecated() {
                this.bitField0_ &= -9;
                this.deprecated_ = false;
                onChanged();
                return this;
            }

            public final boolean hasExperimentalMapKey() {
                return (this.bitField0_ & 16) == 16;
            }

            public final String getExperimentalMapKey() {
                Object obj = this.experimentalMapKey_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String toStringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.experimentalMapKey_ = toStringUtf8;
                }
                return toStringUtf8;
            }

            public final ByteString getExperimentalMapKeyBytes() {
                Object obj = this.experimentalMapKey_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.experimentalMapKey_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final Builder setExperimentalMapKey(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 16;
                this.experimentalMapKey_ = str;
                onChanged();
                return this;
            }

            public final Builder clearExperimentalMapKey() {
                this.bitField0_ &= -17;
                this.experimentalMapKey_ = FieldOptions.getDefaultInstance().getExperimentalMapKey();
                onChanged();
                return this;
            }

            public final Builder setExperimentalMapKeyBytes(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 16;
                this.experimentalMapKey_ = byteString;
                onChanged();
                return this;
            }

            public final boolean hasWeak() {
                return (this.bitField0_ & 32) == 32;
            }

            public final boolean getWeak() {
                return this.weak_;
            }

            public final Builder setWeak(boolean z) {
                this.bitField0_ |= 32;
                this.weak_ = z;
                onChanged();
                return this;
            }

            public final Builder clearWeak() {
                this.bitField0_ &= -33;
                this.weak_ = false;
                onChanged();
                return this;
            }

            private void ensureUninterpretedOptionIsMutable() {
                if ((this.bitField0_ & 64) != 64) {
                    this.uninterpretedOption_ = new ArrayList(this.uninterpretedOption_);
                    this.bitField0_ |= 64;
                }
            }

            public final List<UninterpretedOption> getUninterpretedOptionList() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    return Collections.unmodifiableList(this.uninterpretedOption_);
                }
                return this.uninterpretedOptionBuilder_.getMessageList();
            }

            public final int getUninterpretedOptionCount() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    return this.uninterpretedOption_.size();
                }
                return this.uninterpretedOptionBuilder_.getCount();
            }

            public final UninterpretedOption getUninterpretedOption(int i) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    return (UninterpretedOption) this.uninterpretedOption_.get(i);
                }
                return (UninterpretedOption) this.uninterpretedOptionBuilder_.getMessage(i);
            }

            public final Builder setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
                if (this.uninterpretedOptionBuilder_ != null) {
                    this.uninterpretedOptionBuilder_.setMessage(i, uninterpretedOption);
                } else if (uninterpretedOption == null) {
                    throw new NullPointerException();
                } else {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.set(i, uninterpretedOption);
                    onChanged();
                }
                return this;
            }

            public final Builder setUninterpretedOption(int i, Builder builder) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.set(i, builder.build());
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
                if (this.uninterpretedOptionBuilder_ != null) {
                    this.uninterpretedOptionBuilder_.addMessage(uninterpretedOption);
                } else if (uninterpretedOption == null) {
                    throw new NullPointerException();
                } else {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.add(uninterpretedOption);
                    onChanged();
                }
                return this;
            }

            public final Builder addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
                if (this.uninterpretedOptionBuilder_ != null) {
                    this.uninterpretedOptionBuilder_.addMessage(i, uninterpretedOption);
                } else if (uninterpretedOption == null) {
                    throw new NullPointerException();
                } else {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.add(i, uninterpretedOption);
                    onChanged();
                }
                return this;
            }

            public final Builder addUninterpretedOption(Builder builder) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.add(builder.build());
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public final Builder addUninterpretedOption(int i, Builder builder) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.add(i, builder.build());
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.uninterpretedOption_);
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public final Builder clearUninterpretedOption() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    this.uninterpretedOption_ = Collections.emptyList();
                    this.bitField0_ &= -65;
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.clear();
                }
                return this;
            }

            public final Builder removeUninterpretedOption(int i) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.remove(i);
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.remove(i);
                }
                return this;
            }

            public final Builder getUninterpretedOptionBuilder(int i) {
                return (Builder) getUninterpretedOptionFieldBuilder().getBuilder(i);
            }

            public final UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    return (UninterpretedOptionOrBuilder) this.uninterpretedOption_.get(i);
                }
                return (UninterpretedOptionOrBuilder) this.uninterpretedOptionBuilder_.getMessageOrBuilder(i);
            }

            public final List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
                if (this.uninterpretedOptionBuilder_ != null) {
                    return this.uninterpretedOptionBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.uninterpretedOption_);
            }

            public final Builder addUninterpretedOptionBuilder() {
                return (Builder) getUninterpretedOptionFieldBuilder().addBuilder(UninterpretedOption.getDefaultInstance());
            }

            public final Builder addUninterpretedOptionBuilder(int i) {
                return (Builder) getUninterpretedOptionFieldBuilder().addBuilder(i, UninterpretedOption.getDefaultInstance());
            }

            public final List<Builder> getUninterpretedOptionBuilderList() {
                return getUninterpretedOptionFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<UninterpretedOption, Builder, UninterpretedOptionOrBuilder> getUninterpretedOptionFieldBuilder() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    this.uninterpretedOptionBuilder_ = new RepeatedFieldBuilder(this.uninterpretedOption_, (this.bitField0_ & 64) == 64, getParentForChildren(), isClean());
                    this.uninterpretedOption_ = null;
                }
                return this.uninterpretedOptionBuilder_;
            }
        }

        public enum CType implements ProtocolMessageEnum {
            STRING(0, 0),
            CORD(CORD_VALUE, CORD_VALUE),
            STRING_PIECE(STRING_PIECE_VALUE, STRING_PIECE_VALUE);
            
            public static final int CORD_VALUE = 1;
            public static final int STRING_PIECE_VALUE = 2;
            public static final int STRING_VALUE = 0;
            private static final CType[] VALUES;
            private static EnumLiteMap<CType> internalValueMap;
            private final int index;
            private final int value;

            /* renamed from: com.google.protobuf.DescriptorProtos.FieldOptions.CType.1 */
            static class C02881 implements EnumLiteMap<CType> {
                C02881() {
                }

                public final CType findValueByNumber(int i) {
                    return CType.valueOf(i);
                }
            }

            static {
                internalValueMap = new C02881();
                VALUES = values();
            }

            public final int getNumber() {
                return this.value;
            }

            public static CType valueOf(int i) {
                switch (i) {
                    case SQLiteDatabase.OPEN_READWRITE /*0*/:
                        return STRING;
                    case CORD_VALUE:
                        return CORD;
                    case STRING_PIECE_VALUE:
                        return STRING_PIECE;
                    default:
                        return null;
                }
            }

            public static EnumLiteMap<CType> internalGetValueMap() {
                return internalValueMap;
            }

            public final EnumValueDescriptor getValueDescriptor() {
                return (EnumValueDescriptor) getDescriptor().getValues().get(this.index);
            }

            public final EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            public static final EnumDescriptor getDescriptor() {
                return (EnumDescriptor) FieldOptions.getDescriptor().getEnumTypes().get(0);
            }

            public static CType valueOf(EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }

            private CType(int i, int i2) {
                this.index = i;
                this.value = i2;
            }
        }

        private FieldOptions(ExtendableBuilder<FieldOptions, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        private FieldOptions(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static FieldOptions getDefaultInstance() {
            return defaultInstance;
        }

        public final FieldOptions getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private FieldOptions(com.google.protobuf.CodedInputStream r9, com.google.protobuf.ExtensionRegistryLite r10) {
            /*
            r8 = this;
            r0 = 0;
            r1 = -1;
            r6 = 64;
            r2 = 1;
            r8.<init>();
            r8.memoizedIsInitialized = r1;
            r8.memoizedSerializedSize = r1;
            r8.initFields();
            r3 = com.google.protobuf.UnknownFieldSet.newBuilder();
            r1 = r0;
        L_0x0014:
            if (r1 != 0) goto L_0x00d5;
        L_0x0016:
            r4 = r9.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            switch(r4) {
                case 0: goto L_0x0025;
                case 8: goto L_0x0027;
                case 16: goto L_0x0071;
                case 24: goto L_0x0083;
                case 40: goto L_0x0091;
                case 74: goto L_0x009f;
                case 80: goto L_0x00ad;
                case 7994: goto L_0x00bb;
                default: goto L_0x001d;
            };	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
        L_0x001d:
            r4 = r8.parseUnknownField(r9, r3, r10, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            if (r4 != 0) goto L_0x0014;
        L_0x0023:
            r1 = r2;
            goto L_0x0014;
        L_0x0025:
            r1 = r2;
            goto L_0x0014;
        L_0x0027:
            r4 = r9.readEnum();	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            r5 = com.google.protobuf.DescriptorProtos.FieldOptions.CType.valueOf(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            if (r5 != 0) goto L_0x0056;
        L_0x0031:
            r5 = 1;
            r3.mergeVarintField(r5, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            goto L_0x0014;
        L_0x0036:
            r1 = move-exception;
            r7 = r1;
            r1 = r0;
            r0 = r7;
            r0 = r0.setUnfinishedMessage(r8);	 Catch:{ all -> 0x003f }
            throw r0;	 Catch:{ all -> 0x003f }
        L_0x003f:
            r0 = move-exception;
        L_0x0040:
            r1 = r1 & 64;
            if (r1 != r6) goto L_0x004c;
        L_0x0044:
            r1 = r8.uninterpretedOption_;
            r1 = java.util.Collections.unmodifiableList(r1);
            r8.uninterpretedOption_ = r1;
        L_0x004c:
            r1 = r3.build();
            r8.unknownFields = r1;
            r8.makeExtensionsImmutable();
            throw r0;
        L_0x0056:
            r4 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            r4 = r4 | 1;
            r8.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            r8.ctype_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            goto L_0x0014;
        L_0x005f:
            r1 = move-exception;
            r7 = r1;
            r1 = r0;
            r0 = r7;
            r2 = new com.google.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x003f }
            r0 = r0.getMessage();	 Catch:{ all -> 0x003f }
            r2.<init>(r0);	 Catch:{ all -> 0x003f }
            r0 = r2.setUnfinishedMessage(r8);	 Catch:{ all -> 0x003f }
            throw r0;	 Catch:{ all -> 0x003f }
        L_0x0071:
            r4 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            r4 = r4 | 2;
            r8.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            r4 = r9.readBool();	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            r8.packed_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            goto L_0x0014;
        L_0x007e:
            r1 = move-exception;
            r7 = r1;
            r1 = r0;
            r0 = r7;
            goto L_0x0040;
        L_0x0083:
            r4 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            r4 = r4 | 8;
            r8.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            r4 = r9.readBool();	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            r8.deprecated_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            goto L_0x0014;
        L_0x0091:
            r4 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            r4 = r4 | 4;
            r8.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            r4 = r9.readBool();	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            r8.lazy_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            goto L_0x0014;
        L_0x009f:
            r4 = r9.readBytes();	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            r5 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            r5 = r5 | 16;
            r8.bitField0_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            r8.experimentalMapKey_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            goto L_0x0014;
        L_0x00ad:
            r4 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            r4 = r4 | 32;
            r8.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            r4 = r9.readBool();	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            r8.weak_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            goto L_0x0014;
        L_0x00bb:
            r4 = r0 & 64;
            if (r4 == r6) goto L_0x00c8;
        L_0x00bf:
            r4 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            r4.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            r8.uninterpretedOption_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            r0 = r0 | 64;
        L_0x00c8:
            r4 = r8.uninterpretedOption_;	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            r5 = com.google.protobuf.DescriptorProtos.UninterpretedOption.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            r5 = r9.readMessage(r5, r10);	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            r4.add(r5);	 Catch:{ InvalidProtocolBufferException -> 0x0036, IOException -> 0x005f, all -> 0x007e }
            goto L_0x0014;
        L_0x00d5:
            r0 = r0 & 64;
            if (r0 != r6) goto L_0x00e1;
        L_0x00d9:
            r0 = r8.uninterpretedOption_;
            r0 = java.util.Collections.unmodifiableList(r0);
            r8.uninterpretedOption_ = r0;
        L_0x00e1:
            r0 = r3.build();
            r8.unknownFields = r0;
            r8.makeExtensionsImmutable();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.FieldOptions.<init>(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):void");
        }

        public static final Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_FieldOptions_descriptor;
        }

        protected final FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.internal_static_google_protobuf_FieldOptions_fieldAccessorTable.ensureFieldAccessorsInitialized(FieldOptions.class, Builder.class);
        }

        static {
            PARSER = new C02871();
            FieldOptions fieldOptions = new FieldOptions(true);
            defaultInstance = fieldOptions;
            fieldOptions.initFields();
        }

        public final Parser<FieldOptions> getParserForType() {
            return PARSER;
        }

        public final boolean hasCtype() {
            return (this.bitField0_ & CTYPE_FIELD_NUMBER) == CTYPE_FIELD_NUMBER;
        }

        public final CType getCtype() {
            return this.ctype_;
        }

        public final boolean hasPacked() {
            return (this.bitField0_ & PACKED_FIELD_NUMBER) == PACKED_FIELD_NUMBER;
        }

        public final boolean getPacked() {
            return this.packed_;
        }

        public final boolean hasLazy() {
            return (this.bitField0_ & 4) == 4;
        }

        public final boolean getLazy() {
            return this.lazy_;
        }

        public final boolean hasDeprecated() {
            return (this.bitField0_ & 8) == 8;
        }

        public final boolean getDeprecated() {
            return this.deprecated_;
        }

        public final boolean hasExperimentalMapKey() {
            return (this.bitField0_ & 16) == 16;
        }

        public final String getExperimentalMapKey() {
            Object obj = this.experimentalMapKey_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String toStringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.experimentalMapKey_ = toStringUtf8;
            }
            return toStringUtf8;
        }

        public final ByteString getExperimentalMapKeyBytes() {
            Object obj = this.experimentalMapKey_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.experimentalMapKey_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean hasWeak() {
            return (this.bitField0_ & 32) == 32;
        }

        public final boolean getWeak() {
            return this.weak_;
        }

        public final List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public final List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        public final int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public final UninterpretedOption getUninterpretedOption(int i) {
            return (UninterpretedOption) this.uninterpretedOption_.get(i);
        }

        public final UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i) {
            return (UninterpretedOptionOrBuilder) this.uninterpretedOption_.get(i);
        }

        private void initFields() {
            this.ctype_ = CType.STRING;
            this.packed_ = false;
            this.lazy_ = false;
            this.deprecated_ = false;
            this.experimentalMapKey_ = LetterIndexBar.SEARCH_ICON_LETTER;
            this.weak_ = false;
            this.uninterpretedOption_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == null) {
                return false;
            }
            int i = 0;
            while (i < getUninterpretedOptionCount()) {
                if (getUninterpretedOption(i).isInitialized()) {
                    i += CTYPE_FIELD_NUMBER;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & CTYPE_FIELD_NUMBER) == CTYPE_FIELD_NUMBER) {
                codedOutputStream.writeEnum(CTYPE_FIELD_NUMBER, this.ctype_.getNumber());
            }
            if ((this.bitField0_ & PACKED_FIELD_NUMBER) == PACKED_FIELD_NUMBER) {
                codedOutputStream.writeBool(PACKED_FIELD_NUMBER, this.packed_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeBool(DEPRECATED_FIELD_NUMBER, this.deprecated_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeBool(LAZY_FIELD_NUMBER, this.lazy_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeBytes(EXPERIMENTAL_MAP_KEY_FIELD_NUMBER, getExperimentalMapKeyBytes());
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeBool(WEAK_FIELD_NUMBER, this.weak_);
            }
            for (int i = 0; i < this.uninterpretedOption_.size(); i += CTYPE_FIELD_NUMBER) {
                codedOutputStream.writeMessage(UNINTERPRETED_OPTION_FIELD_NUMBER, (MessageLite) this.uninterpretedOption_.get(i));
            }
            newExtensionWriter.writeUntil(536870912, codedOutputStream);
            getUnknownFields().writeTo(codedOutputStream);
        }

        public final int getSerializedSize() {
            int i = 0;
            int i2 = this.memoizedSerializedSize;
            if (i2 != -1) {
                return i2;
            }
            if ((this.bitField0_ & CTYPE_FIELD_NUMBER) == CTYPE_FIELD_NUMBER) {
                i2 = CodedOutputStream.computeEnumSize(CTYPE_FIELD_NUMBER, this.ctype_.getNumber()) + 0;
            } else {
                i2 = 0;
            }
            if ((this.bitField0_ & PACKED_FIELD_NUMBER) == PACKED_FIELD_NUMBER) {
                i2 += CodedOutputStream.computeBoolSize(PACKED_FIELD_NUMBER, this.packed_);
            }
            if ((this.bitField0_ & 8) == 8) {
                i2 += CodedOutputStream.computeBoolSize(DEPRECATED_FIELD_NUMBER, this.deprecated_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i2 += CodedOutputStream.computeBoolSize(LAZY_FIELD_NUMBER, this.lazy_);
            }
            if ((this.bitField0_ & 16) == 16) {
                i2 += CodedOutputStream.computeBytesSize(EXPERIMENTAL_MAP_KEY_FIELD_NUMBER, getExperimentalMapKeyBytes());
            }
            if ((this.bitField0_ & 32) == 32) {
                i2 += CodedOutputStream.computeBoolSize(WEAK_FIELD_NUMBER, this.weak_);
            }
            int i3 = i2;
            while (i < this.uninterpretedOption_.size()) {
                i += CTYPE_FIELD_NUMBER;
                i3 = CodedOutputStream.computeMessageSize(UNINTERPRETED_OPTION_FIELD_NUMBER, (MessageLite) this.uninterpretedOption_.get(i)) + i3;
            }
            i2 = (extensionsSerializedSize() + i3) + getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = i2;
            return i2;
        }

        protected final Object writeReplace() {
            return super.writeReplace();
        }

        public static FieldOptions parseFrom(ByteString byteString) {
            return (FieldOptions) PARSER.parseFrom(byteString);
        }

        public static FieldOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (FieldOptions) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static FieldOptions parseFrom(byte[] bArr) {
            return (FieldOptions) PARSER.parseFrom(bArr);
        }

        public static FieldOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (FieldOptions) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FieldOptions parseFrom(InputStream inputStream) {
            return (FieldOptions) PARSER.parseFrom(inputStream);
        }

        public static FieldOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FieldOptions) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static FieldOptions parseDelimitedFrom(InputStream inputStream) {
            return (FieldOptions) PARSER.parseDelimitedFrom(inputStream);
        }

        public static FieldOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FieldOptions) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static FieldOptions parseFrom(CodedInputStream codedInputStream) {
            return (FieldOptions) PARSER.parseFrom(codedInputStream);
        }

        public static FieldOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FieldOptions) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(FieldOptions fieldOptions) {
            return newBuilder().mergeFrom(fieldOptions);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        protected final Builder newBuilderForType(BuilderParent builderParent) {
            return new Builder(null);
        }
    }

    public interface FileDescriptorProtoOrBuilder extends MessageOrBuilder {
        String getDependency(int i);

        ByteString getDependencyBytes(int i);

        int getDependencyCount();

        ProtocolStringList getDependencyList();

        EnumDescriptorProto getEnumType(int i);

        int getEnumTypeCount();

        List<EnumDescriptorProto> getEnumTypeList();

        EnumDescriptorProtoOrBuilder getEnumTypeOrBuilder(int i);

        List<? extends EnumDescriptorProtoOrBuilder> getEnumTypeOrBuilderList();

        FieldDescriptorProto getExtension(int i);

        int getExtensionCount();

        List<FieldDescriptorProto> getExtensionList();

        FieldDescriptorProtoOrBuilder getExtensionOrBuilder(int i);

        List<? extends FieldDescriptorProtoOrBuilder> getExtensionOrBuilderList();

        DescriptorProto getMessageType(int i);

        int getMessageTypeCount();

        List<DescriptorProto> getMessageTypeList();

        DescriptorProtoOrBuilder getMessageTypeOrBuilder(int i);

        List<? extends DescriptorProtoOrBuilder> getMessageTypeOrBuilderList();

        String getName();

        ByteString getNameBytes();

        FileOptions getOptions();

        FileOptionsOrBuilder getOptionsOrBuilder();

        String getPackage();

        ByteString getPackageBytes();

        int getPublicDependency(int i);

        int getPublicDependencyCount();

        List<Integer> getPublicDependencyList();

        ServiceDescriptorProto getService(int i);

        int getServiceCount();

        List<ServiceDescriptorProto> getServiceList();

        ServiceDescriptorProtoOrBuilder getServiceOrBuilder(int i);

        List<? extends ServiceDescriptorProtoOrBuilder> getServiceOrBuilderList();

        SourceCodeInfo getSourceCodeInfo();

        SourceCodeInfoOrBuilder getSourceCodeInfoOrBuilder();

        int getWeakDependency(int i);

        int getWeakDependencyCount();

        List<Integer> getWeakDependencyList();

        boolean hasName();

        boolean hasOptions();

        boolean hasPackage();

        boolean hasSourceCodeInfo();
    }

    public static final class FileDescriptorProto extends GeneratedMessage implements FileDescriptorProtoOrBuilder {
        public static final int DEPENDENCY_FIELD_NUMBER = 3;
        public static final int ENUM_TYPE_FIELD_NUMBER = 5;
        public static final int EXTENSION_FIELD_NUMBER = 7;
        public static final int MESSAGE_TYPE_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 8;
        public static final int PACKAGE_FIELD_NUMBER = 2;
        public static Parser<FileDescriptorProto> PARSER = null;
        public static final int PUBLIC_DEPENDENCY_FIELD_NUMBER = 10;
        public static final int SERVICE_FIELD_NUMBER = 6;
        public static final int SOURCE_CODE_INFO_FIELD_NUMBER = 9;
        public static final int WEAK_DEPENDENCY_FIELD_NUMBER = 11;
        private static final FileDescriptorProto defaultInstance;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private LazyStringList dependency_;
        private List<EnumDescriptorProto> enumType_;
        private List<FieldDescriptorProto> extension_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<DescriptorProto> messageType_;
        private Object name_;
        private FileOptions options_;
        private Object package_;
        private List<Integer> publicDependency_;
        private List<ServiceDescriptorProto> service_;
        private SourceCodeInfo sourceCodeInfo_;
        private final UnknownFieldSet unknownFields;
        private List<Integer> weakDependency_;

        /* renamed from: com.google.protobuf.DescriptorProtos.FileDescriptorProto.1 */
        static class C02891 extends AbstractParser<FileDescriptorProto> {
            C02891() {
            }

            public final FileDescriptorProto parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new FileDescriptorProto(extensionRegistryLite, null);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements FileDescriptorProtoOrBuilder {
            private int bitField0_;
            private LazyStringList dependency_;
            private RepeatedFieldBuilder<EnumDescriptorProto, Builder, EnumDescriptorProtoOrBuilder> enumTypeBuilder_;
            private List<EnumDescriptorProto> enumType_;
            private RepeatedFieldBuilder<FieldDescriptorProto, Builder, FieldDescriptorProtoOrBuilder> extensionBuilder_;
            private List<FieldDescriptorProto> extension_;
            private RepeatedFieldBuilder<DescriptorProto, Builder, DescriptorProtoOrBuilder> messageTypeBuilder_;
            private List<DescriptorProto> messageType_;
            private Object name_;
            private SingleFieldBuilder<FileOptions, Builder, FileOptionsOrBuilder> optionsBuilder_;
            private FileOptions options_;
            private Object package_;
            private List<Integer> publicDependency_;
            private RepeatedFieldBuilder<ServiceDescriptorProto, Builder, ServiceDescriptorProtoOrBuilder> serviceBuilder_;
            private List<ServiceDescriptorProto> service_;
            private SingleFieldBuilder<SourceCodeInfo, Builder, SourceCodeInfoOrBuilder> sourceCodeInfoBuilder_;
            private SourceCodeInfo sourceCodeInfo_;
            private List<Integer> weakDependency_;

            public static final Descriptor getDescriptor() {
                return DescriptorProtos.internal_static_google_protobuf_FileDescriptorProto_descriptor;
            }

            protected final FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.f2781x4b52780c.ensureFieldAccessorsInitialized(FileDescriptorProto.class, Builder.class);
            }

            private Builder() {
                this.name_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.package_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.dependency_ = LazyStringArrayList.EMPTY;
                this.publicDependency_ = Collections.emptyList();
                this.weakDependency_ = Collections.emptyList();
                this.messageType_ = Collections.emptyList();
                this.enumType_ = Collections.emptyList();
                this.service_ = Collections.emptyList();
                this.extension_ = Collections.emptyList();
                this.options_ = FileOptions.getDefaultInstance();
                this.sourceCodeInfo_ = SourceCodeInfo.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent builderParent) {
                super(builderParent);
                this.name_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.package_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.dependency_ = LazyStringArrayList.EMPTY;
                this.publicDependency_ = Collections.emptyList();
                this.weakDependency_ = Collections.emptyList();
                this.messageType_ = Collections.emptyList();
                this.enumType_ = Collections.emptyList();
                this.service_ = Collections.emptyList();
                this.extension_ = Collections.emptyList();
                this.options_ = FileOptions.getDefaultInstance();
                this.sourceCodeInfo_ = SourceCodeInfo.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    getMessageTypeFieldBuilder();
                    getEnumTypeFieldBuilder();
                    getServiceFieldBuilder();
                    getExtensionFieldBuilder();
                    getOptionsFieldBuilder();
                    getSourceCodeInfoFieldBuilder();
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public final Builder clear() {
                super.clear();
                this.name_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.bitField0_ &= -2;
                this.package_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.bitField0_ &= -3;
                this.dependency_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -5;
                this.publicDependency_ = Collections.emptyList();
                this.bitField0_ &= -9;
                this.weakDependency_ = Collections.emptyList();
                this.bitField0_ &= -17;
                if (this.messageTypeBuilder_ == null) {
                    this.messageType_ = Collections.emptyList();
                    this.bitField0_ &= -33;
                } else {
                    this.messageTypeBuilder_.clear();
                }
                if (this.enumTypeBuilder_ == null) {
                    this.enumType_ = Collections.emptyList();
                    this.bitField0_ &= -65;
                } else {
                    this.enumTypeBuilder_.clear();
                }
                if (this.serviceBuilder_ == null) {
                    this.service_ = Collections.emptyList();
                    this.bitField0_ &= -129;
                } else {
                    this.serviceBuilder_.clear();
                }
                if (this.extensionBuilder_ == null) {
                    this.extension_ = Collections.emptyList();
                    this.bitField0_ &= -257;
                } else {
                    this.extensionBuilder_.clear();
                }
                if (this.optionsBuilder_ == null) {
                    this.options_ = FileOptions.getDefaultInstance();
                } else {
                    this.optionsBuilder_.clear();
                }
                this.bitField0_ &= -513;
                if (this.sourceCodeInfoBuilder_ == null) {
                    this.sourceCodeInfo_ = SourceCodeInfo.getDefaultInstance();
                } else {
                    this.sourceCodeInfoBuilder_.clear();
                }
                this.bitField0_ &= -1025;
                return this;
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_FileDescriptorProto_descriptor;
            }

            public final FileDescriptorProto getDefaultInstanceForType() {
                return FileDescriptorProto.getDefaultInstance();
            }

            public final FileDescriptorProto build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
            }

            public final FileDescriptorProto buildPartial() {
                int i;
                int i2 = FileDescriptorProto.NAME_FIELD_NUMBER;
                FileDescriptorProto fileDescriptorProto = new FileDescriptorProto(null);
                int i3 = this.bitField0_;
                if ((i3 & FileDescriptorProto.NAME_FIELD_NUMBER) != FileDescriptorProto.NAME_FIELD_NUMBER) {
                    i2 = 0;
                }
                fileDescriptorProto.name_ = this.name_;
                if ((i3 & FileDescriptorProto.PACKAGE_FIELD_NUMBER) == FileDescriptorProto.PACKAGE_FIELD_NUMBER) {
                    i2 |= FileDescriptorProto.PACKAGE_FIELD_NUMBER;
                }
                fileDescriptorProto.package_ = this.package_;
                if ((this.bitField0_ & FileDescriptorProto.MESSAGE_TYPE_FIELD_NUMBER) == FileDescriptorProto.MESSAGE_TYPE_FIELD_NUMBER) {
                    this.dependency_ = this.dependency_.getUnmodifiableView();
                    this.bitField0_ &= -5;
                }
                fileDescriptorProto.dependency_ = this.dependency_;
                if ((this.bitField0_ & FileDescriptorProto.OPTIONS_FIELD_NUMBER) == FileDescriptorProto.OPTIONS_FIELD_NUMBER) {
                    this.publicDependency_ = Collections.unmodifiableList(this.publicDependency_);
                    this.bitField0_ &= -9;
                }
                fileDescriptorProto.publicDependency_ = this.publicDependency_;
                if ((this.bitField0_ & 16) == 16) {
                    this.weakDependency_ = Collections.unmodifiableList(this.weakDependency_);
                    this.bitField0_ &= -17;
                }
                fileDescriptorProto.weakDependency_ = this.weakDependency_;
                if (this.messageTypeBuilder_ == null) {
                    if ((this.bitField0_ & 32) == 32) {
                        this.messageType_ = Collections.unmodifiableList(this.messageType_);
                        this.bitField0_ &= -33;
                    }
                    fileDescriptorProto.messageType_ = this.messageType_;
                } else {
                    fileDescriptorProto.messageType_ = this.messageTypeBuilder_.build();
                }
                if (this.enumTypeBuilder_ == null) {
                    if ((this.bitField0_ & 64) == 64) {
                        this.enumType_ = Collections.unmodifiableList(this.enumType_);
                        this.bitField0_ &= -65;
                    }
                    fileDescriptorProto.enumType_ = this.enumType_;
                } else {
                    fileDescriptorProto.enumType_ = this.enumTypeBuilder_.build();
                }
                if (this.serviceBuilder_ == null) {
                    if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) == AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) {
                        this.service_ = Collections.unmodifiableList(this.service_);
                        this.bitField0_ &= -129;
                    }
                    fileDescriptorProto.service_ = this.service_;
                } else {
                    fileDescriptorProto.service_ = this.serviceBuilder_.build();
                }
                if (this.extensionBuilder_ == null) {
                    if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
                        this.extension_ = Collections.unmodifiableList(this.extension_);
                        this.bitField0_ &= -257;
                    }
                    fileDescriptorProto.extension_ = this.extension_;
                } else {
                    fileDescriptorProto.extension_ = this.extensionBuilder_.build();
                }
                if ((i3 & AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY) {
                    i = i2 | FileDescriptorProto.MESSAGE_TYPE_FIELD_NUMBER;
                } else {
                    i = i2;
                }
                if (this.optionsBuilder_ == null) {
                    fileDescriptorProto.options_ = this.options_;
                } else {
                    fileDescriptorProto.options_ = (FileOptions) this.optionsBuilder_.build();
                }
                if ((i3 & AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT) == AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT) {
                    i |= FileDescriptorProto.OPTIONS_FIELD_NUMBER;
                }
                if (this.sourceCodeInfoBuilder_ == null) {
                    fileDescriptorProto.sourceCodeInfo_ = this.sourceCodeInfo_;
                } else {
                    fileDescriptorProto.sourceCodeInfo_ = (SourceCodeInfo) this.sourceCodeInfoBuilder_.build();
                }
                fileDescriptorProto.bitField0_ = i;
                onBuilt();
                return fileDescriptorProto;
            }

            public final Builder mergeFrom(Message message) {
                if (message instanceof FileDescriptorProto) {
                    return mergeFrom((FileDescriptorProto) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public final Builder mergeFrom(FileDescriptorProto fileDescriptorProto) {
                RepeatedFieldBuilder repeatedFieldBuilder = null;
                if (fileDescriptorProto != FileDescriptorProto.getDefaultInstance()) {
                    if (fileDescriptorProto.hasName()) {
                        this.bitField0_ |= FileDescriptorProto.NAME_FIELD_NUMBER;
                        this.name_ = fileDescriptorProto.name_;
                        onChanged();
                    }
                    if (fileDescriptorProto.hasPackage()) {
                        this.bitField0_ |= FileDescriptorProto.PACKAGE_FIELD_NUMBER;
                        this.package_ = fileDescriptorProto.package_;
                        onChanged();
                    }
                    if (!fileDescriptorProto.dependency_.isEmpty()) {
                        if (this.dependency_.isEmpty()) {
                            this.dependency_ = fileDescriptorProto.dependency_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureDependencyIsMutable();
                            this.dependency_.addAll(fileDescriptorProto.dependency_);
                        }
                        onChanged();
                    }
                    if (!fileDescriptorProto.publicDependency_.isEmpty()) {
                        if (this.publicDependency_.isEmpty()) {
                            this.publicDependency_ = fileDescriptorProto.publicDependency_;
                            this.bitField0_ &= -9;
                        } else {
                            ensurePublicDependencyIsMutable();
                            this.publicDependency_.addAll(fileDescriptorProto.publicDependency_);
                        }
                        onChanged();
                    }
                    if (!fileDescriptorProto.weakDependency_.isEmpty()) {
                        if (this.weakDependency_.isEmpty()) {
                            this.weakDependency_ = fileDescriptorProto.weakDependency_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureWeakDependencyIsMutable();
                            this.weakDependency_.addAll(fileDescriptorProto.weakDependency_);
                        }
                        onChanged();
                    }
                    if (this.messageTypeBuilder_ == null) {
                        if (!fileDescriptorProto.messageType_.isEmpty()) {
                            if (this.messageType_.isEmpty()) {
                                this.messageType_ = fileDescriptorProto.messageType_;
                                this.bitField0_ &= -33;
                            } else {
                                ensureMessageTypeIsMutable();
                                this.messageType_.addAll(fileDescriptorProto.messageType_);
                            }
                            onChanged();
                        }
                    } else if (!fileDescriptorProto.messageType_.isEmpty()) {
                        if (this.messageTypeBuilder_.isEmpty()) {
                            this.messageTypeBuilder_.dispose();
                            this.messageTypeBuilder_ = null;
                            this.messageType_ = fileDescriptorProto.messageType_;
                            this.bitField0_ &= -33;
                            this.messageTypeBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? getMessageTypeFieldBuilder() : null;
                        } else {
                            this.messageTypeBuilder_.addAllMessages(fileDescriptorProto.messageType_);
                        }
                    }
                    if (this.enumTypeBuilder_ == null) {
                        if (!fileDescriptorProto.enumType_.isEmpty()) {
                            if (this.enumType_.isEmpty()) {
                                this.enumType_ = fileDescriptorProto.enumType_;
                                this.bitField0_ &= -65;
                            } else {
                                ensureEnumTypeIsMutable();
                                this.enumType_.addAll(fileDescriptorProto.enumType_);
                            }
                            onChanged();
                        }
                    } else if (!fileDescriptorProto.enumType_.isEmpty()) {
                        if (this.enumTypeBuilder_.isEmpty()) {
                            this.enumTypeBuilder_.dispose();
                            this.enumTypeBuilder_ = null;
                            this.enumType_ = fileDescriptorProto.enumType_;
                            this.bitField0_ &= -65;
                            this.enumTypeBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? getEnumTypeFieldBuilder() : null;
                        } else {
                            this.enumTypeBuilder_.addAllMessages(fileDescriptorProto.enumType_);
                        }
                    }
                    if (this.serviceBuilder_ == null) {
                        if (!fileDescriptorProto.service_.isEmpty()) {
                            if (this.service_.isEmpty()) {
                                this.service_ = fileDescriptorProto.service_;
                                this.bitField0_ &= -129;
                            } else {
                                ensureServiceIsMutable();
                                this.service_.addAll(fileDescriptorProto.service_);
                            }
                            onChanged();
                        }
                    } else if (!fileDescriptorProto.service_.isEmpty()) {
                        if (this.serviceBuilder_.isEmpty()) {
                            this.serviceBuilder_.dispose();
                            this.serviceBuilder_ = null;
                            this.service_ = fileDescriptorProto.service_;
                            this.bitField0_ &= -129;
                            this.serviceBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? getServiceFieldBuilder() : null;
                        } else {
                            this.serviceBuilder_.addAllMessages(fileDescriptorProto.service_);
                        }
                    }
                    if (this.extensionBuilder_ == null) {
                        if (!fileDescriptorProto.extension_.isEmpty()) {
                            if (this.extension_.isEmpty()) {
                                this.extension_ = fileDescriptorProto.extension_;
                                this.bitField0_ &= -257;
                            } else {
                                ensureExtensionIsMutable();
                                this.extension_.addAll(fileDescriptorProto.extension_);
                            }
                            onChanged();
                        }
                    } else if (!fileDescriptorProto.extension_.isEmpty()) {
                        if (this.extensionBuilder_.isEmpty()) {
                            this.extensionBuilder_.dispose();
                            this.extensionBuilder_ = null;
                            this.extension_ = fileDescriptorProto.extension_;
                            this.bitField0_ &= -257;
                            if (GeneratedMessage.alwaysUseFieldBuilders) {
                                repeatedFieldBuilder = getExtensionFieldBuilder();
                            }
                            this.extensionBuilder_ = repeatedFieldBuilder;
                        } else {
                            this.extensionBuilder_.addAllMessages(fileDescriptorProto.extension_);
                        }
                    }
                    if (fileDescriptorProto.hasOptions()) {
                        mergeOptions(fileDescriptorProto.getOptions());
                    }
                    if (fileDescriptorProto.hasSourceCodeInfo()) {
                        mergeSourceCodeInfo(fileDescriptorProto.getSourceCodeInfo());
                    }
                    mergeUnknownFields(fileDescriptorProto.getUnknownFields());
                }
                return this;
            }

            public final boolean isInitialized() {
                int i;
                for (i = 0; i < getMessageTypeCount(); i += FileDescriptorProto.NAME_FIELD_NUMBER) {
                    if (!getMessageType(i).isInitialized()) {
                        return false;
                    }
                }
                for (i = 0; i < getEnumTypeCount(); i += FileDescriptorProto.NAME_FIELD_NUMBER) {
                    if (!getEnumType(i).isInitialized()) {
                        return false;
                    }
                }
                for (i = 0; i < getServiceCount(); i += FileDescriptorProto.NAME_FIELD_NUMBER) {
                    if (!getService(i).isInitialized()) {
                        return false;
                    }
                }
                for (i = 0; i < getExtensionCount(); i += FileDescriptorProto.NAME_FIELD_NUMBER) {
                    if (!getExtension(i).isInitialized()) {
                        return false;
                    }
                }
                if (!hasOptions() || getOptions().isInitialized()) {
                    return true;
                }
                return false;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder mergeFrom(com.google.protobuf.CodedInputStream r5, com.google.protobuf.ExtensionRegistryLite r6) {
                /*
                r4 = this;
                r2 = 0;
                r0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = (com.google.protobuf.DescriptorProtos.FileDescriptorProto) r0;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                if (r0 == 0) goto L_0x000e;
            L_0x000b:
                r4.mergeFrom(r0);
            L_0x000e:
                return r4;
            L_0x000f:
                r0 = move-exception;
                r1 = r0;
                r0 = r1.getUnfinishedMessage();	 Catch:{ all -> 0x0022 }
                r0 = (com.google.protobuf.DescriptorProtos.FileDescriptorProto) r0;	 Catch:{ all -> 0x0022 }
                throw r1;	 Catch:{ all -> 0x0018 }
            L_0x0018:
                r1 = move-exception;
                r3 = r1;
                r1 = r0;
                r0 = r3;
            L_0x001c:
                if (r1 == 0) goto L_0x0021;
            L_0x001e:
                r4.mergeFrom(r1);
            L_0x0021:
                throw r0;
            L_0x0022:
                r0 = move-exception;
                r1 = r2;
                goto L_0x001c;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.DescriptorProtos$FileDescriptorProto$Builder");
            }

            public final boolean hasName() {
                return (this.bitField0_ & FileDescriptorProto.NAME_FIELD_NUMBER) == FileDescriptorProto.NAME_FIELD_NUMBER;
            }

            public final String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String toStringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.name_ = toStringUtf8;
                }
                return toStringUtf8;
            }

            public final ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final Builder setName(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= FileDescriptorProto.NAME_FIELD_NUMBER;
                this.name_ = str;
                onChanged();
                return this;
            }

            public final Builder clearName() {
                this.bitField0_ &= -2;
                this.name_ = FileDescriptorProto.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public final Builder setNameBytes(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= FileDescriptorProto.NAME_FIELD_NUMBER;
                this.name_ = byteString;
                onChanged();
                return this;
            }

            public final boolean hasPackage() {
                return (this.bitField0_ & FileDescriptorProto.PACKAGE_FIELD_NUMBER) == FileDescriptorProto.PACKAGE_FIELD_NUMBER;
            }

            public final String getPackage() {
                Object obj = this.package_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String toStringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.package_ = toStringUtf8;
                }
                return toStringUtf8;
            }

            public final ByteString getPackageBytes() {
                Object obj = this.package_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.package_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final Builder setPackage(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= FileDescriptorProto.PACKAGE_FIELD_NUMBER;
                this.package_ = str;
                onChanged();
                return this;
            }

            public final Builder clearPackage() {
                this.bitField0_ &= -3;
                this.package_ = FileDescriptorProto.getDefaultInstance().getPackage();
                onChanged();
                return this;
            }

            public final Builder setPackageBytes(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= FileDescriptorProto.PACKAGE_FIELD_NUMBER;
                this.package_ = byteString;
                onChanged();
                return this;
            }

            private void ensureDependencyIsMutable() {
                if ((this.bitField0_ & FileDescriptorProto.MESSAGE_TYPE_FIELD_NUMBER) != FileDescriptorProto.MESSAGE_TYPE_FIELD_NUMBER) {
                    this.dependency_ = new LazyStringArrayList(this.dependency_);
                    this.bitField0_ |= FileDescriptorProto.MESSAGE_TYPE_FIELD_NUMBER;
                }
            }

            public final ProtocolStringList getDependencyList() {
                return this.dependency_.getUnmodifiableView();
            }

            public final int getDependencyCount() {
                return this.dependency_.size();
            }

            public final String getDependency(int i) {
                return (String) this.dependency_.get(i);
            }

            public final ByteString getDependencyBytes(int i) {
                return this.dependency_.getByteString(i);
            }

            public final Builder setDependency(int i, String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                ensureDependencyIsMutable();
                this.dependency_.set(i, str);
                onChanged();
                return this;
            }

            public final Builder addDependency(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                ensureDependencyIsMutable();
                this.dependency_.add(str);
                onChanged();
                return this;
            }

            public final Builder addAllDependency(Iterable<String> iterable) {
                ensureDependencyIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.dependency_);
                onChanged();
                return this;
            }

            public final Builder clearDependency() {
                this.dependency_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public final Builder addDependencyBytes(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                ensureDependencyIsMutable();
                this.dependency_.add(byteString);
                onChanged();
                return this;
            }

            private void ensurePublicDependencyIsMutable() {
                if ((this.bitField0_ & FileDescriptorProto.OPTIONS_FIELD_NUMBER) != FileDescriptorProto.OPTIONS_FIELD_NUMBER) {
                    this.publicDependency_ = new ArrayList(this.publicDependency_);
                    this.bitField0_ |= FileDescriptorProto.OPTIONS_FIELD_NUMBER;
                }
            }

            public final List<Integer> getPublicDependencyList() {
                return Collections.unmodifiableList(this.publicDependency_);
            }

            public final int getPublicDependencyCount() {
                return this.publicDependency_.size();
            }

            public final int getPublicDependency(int i) {
                return ((Integer) this.publicDependency_.get(i)).intValue();
            }

            public final Builder setPublicDependency(int i, int i2) {
                ensurePublicDependencyIsMutable();
                this.publicDependency_.set(i, Integer.valueOf(i2));
                onChanged();
                return this;
            }

            public final Builder addPublicDependency(int i) {
                ensurePublicDependencyIsMutable();
                this.publicDependency_.add(Integer.valueOf(i));
                onChanged();
                return this;
            }

            public final Builder addAllPublicDependency(Iterable<? extends Integer> iterable) {
                ensurePublicDependencyIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.publicDependency_);
                onChanged();
                return this;
            }

            public final Builder clearPublicDependency() {
                this.publicDependency_ = Collections.emptyList();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            private void ensureWeakDependencyIsMutable() {
                if ((this.bitField0_ & 16) != 16) {
                    this.weakDependency_ = new ArrayList(this.weakDependency_);
                    this.bitField0_ |= 16;
                }
            }

            public final List<Integer> getWeakDependencyList() {
                return Collections.unmodifiableList(this.weakDependency_);
            }

            public final int getWeakDependencyCount() {
                return this.weakDependency_.size();
            }

            public final int getWeakDependency(int i) {
                return ((Integer) this.weakDependency_.get(i)).intValue();
            }

            public final Builder setWeakDependency(int i, int i2) {
                ensureWeakDependencyIsMutable();
                this.weakDependency_.set(i, Integer.valueOf(i2));
                onChanged();
                return this;
            }

            public final Builder addWeakDependency(int i) {
                ensureWeakDependencyIsMutable();
                this.weakDependency_.add(Integer.valueOf(i));
                onChanged();
                return this;
            }

            public final Builder addAllWeakDependency(Iterable<? extends Integer> iterable) {
                ensureWeakDependencyIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.weakDependency_);
                onChanged();
                return this;
            }

            public final Builder clearWeakDependency() {
                this.weakDependency_ = Collections.emptyList();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            private void ensureMessageTypeIsMutable() {
                if ((this.bitField0_ & 32) != 32) {
                    this.messageType_ = new ArrayList(this.messageType_);
                    this.bitField0_ |= 32;
                }
            }

            public final List<DescriptorProto> getMessageTypeList() {
                if (this.messageTypeBuilder_ == null) {
                    return Collections.unmodifiableList(this.messageType_);
                }
                return this.messageTypeBuilder_.getMessageList();
            }

            public final int getMessageTypeCount() {
                if (this.messageTypeBuilder_ == null) {
                    return this.messageType_.size();
                }
                return this.messageTypeBuilder_.getCount();
            }

            public final DescriptorProto getMessageType(int i) {
                if (this.messageTypeBuilder_ == null) {
                    return (DescriptorProto) this.messageType_.get(i);
                }
                return (DescriptorProto) this.messageTypeBuilder_.getMessage(i);
            }

            public final Builder setMessageType(int i, DescriptorProto descriptorProto) {
                if (this.messageTypeBuilder_ != null) {
                    this.messageTypeBuilder_.setMessage(i, descriptorProto);
                } else if (descriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureMessageTypeIsMutable();
                    this.messageType_.set(i, descriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder setMessageType(int i, Builder builder) {
                if (this.messageTypeBuilder_ == null) {
                    ensureMessageTypeIsMutable();
                    this.messageType_.set(i, builder.build());
                    onChanged();
                } else {
                    this.messageTypeBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addMessageType(DescriptorProto descriptorProto) {
                if (this.messageTypeBuilder_ != null) {
                    this.messageTypeBuilder_.addMessage(descriptorProto);
                } else if (descriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureMessageTypeIsMutable();
                    this.messageType_.add(descriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder addMessageType(int i, DescriptorProto descriptorProto) {
                if (this.messageTypeBuilder_ != null) {
                    this.messageTypeBuilder_.addMessage(i, descriptorProto);
                } else if (descriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureMessageTypeIsMutable();
                    this.messageType_.add(i, descriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder addMessageType(Builder builder) {
                if (this.messageTypeBuilder_ == null) {
                    ensureMessageTypeIsMutable();
                    this.messageType_.add(builder.build());
                    onChanged();
                } else {
                    this.messageTypeBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public final Builder addMessageType(int i, Builder builder) {
                if (this.messageTypeBuilder_ == null) {
                    ensureMessageTypeIsMutable();
                    this.messageType_.add(i, builder.build());
                    onChanged();
                } else {
                    this.messageTypeBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addAllMessageType(Iterable<? extends DescriptorProto> iterable) {
                if (this.messageTypeBuilder_ == null) {
                    ensureMessageTypeIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.messageType_);
                    onChanged();
                } else {
                    this.messageTypeBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public final Builder clearMessageType() {
                if (this.messageTypeBuilder_ == null) {
                    this.messageType_ = Collections.emptyList();
                    this.bitField0_ &= -33;
                    onChanged();
                } else {
                    this.messageTypeBuilder_.clear();
                }
                return this;
            }

            public final Builder removeMessageType(int i) {
                if (this.messageTypeBuilder_ == null) {
                    ensureMessageTypeIsMutable();
                    this.messageType_.remove(i);
                    onChanged();
                } else {
                    this.messageTypeBuilder_.remove(i);
                }
                return this;
            }

            public final Builder getMessageTypeBuilder(int i) {
                return (Builder) getMessageTypeFieldBuilder().getBuilder(i);
            }

            public final DescriptorProtoOrBuilder getMessageTypeOrBuilder(int i) {
                if (this.messageTypeBuilder_ == null) {
                    return (DescriptorProtoOrBuilder) this.messageType_.get(i);
                }
                return (DescriptorProtoOrBuilder) this.messageTypeBuilder_.getMessageOrBuilder(i);
            }

            public final List<? extends DescriptorProtoOrBuilder> getMessageTypeOrBuilderList() {
                if (this.messageTypeBuilder_ != null) {
                    return this.messageTypeBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.messageType_);
            }

            public final Builder addMessageTypeBuilder() {
                return (Builder) getMessageTypeFieldBuilder().addBuilder(DescriptorProto.getDefaultInstance());
            }

            public final Builder addMessageTypeBuilder(int i) {
                return (Builder) getMessageTypeFieldBuilder().addBuilder(i, DescriptorProto.getDefaultInstance());
            }

            public final List<Builder> getMessageTypeBuilderList() {
                return getMessageTypeFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<DescriptorProto, Builder, DescriptorProtoOrBuilder> getMessageTypeFieldBuilder() {
                if (this.messageTypeBuilder_ == null) {
                    this.messageTypeBuilder_ = new RepeatedFieldBuilder(this.messageType_, (this.bitField0_ & 32) == 32, getParentForChildren(), isClean());
                    this.messageType_ = null;
                }
                return this.messageTypeBuilder_;
            }

            private void ensureEnumTypeIsMutable() {
                if ((this.bitField0_ & 64) != 64) {
                    this.enumType_ = new ArrayList(this.enumType_);
                    this.bitField0_ |= 64;
                }
            }

            public final List<EnumDescriptorProto> getEnumTypeList() {
                if (this.enumTypeBuilder_ == null) {
                    return Collections.unmodifiableList(this.enumType_);
                }
                return this.enumTypeBuilder_.getMessageList();
            }

            public final int getEnumTypeCount() {
                if (this.enumTypeBuilder_ == null) {
                    return this.enumType_.size();
                }
                return this.enumTypeBuilder_.getCount();
            }

            public final EnumDescriptorProto getEnumType(int i) {
                if (this.enumTypeBuilder_ == null) {
                    return (EnumDescriptorProto) this.enumType_.get(i);
                }
                return (EnumDescriptorProto) this.enumTypeBuilder_.getMessage(i);
            }

            public final Builder setEnumType(int i, EnumDescriptorProto enumDescriptorProto) {
                if (this.enumTypeBuilder_ != null) {
                    this.enumTypeBuilder_.setMessage(i, enumDescriptorProto);
                } else if (enumDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureEnumTypeIsMutable();
                    this.enumType_.set(i, enumDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder setEnumType(int i, Builder builder) {
                if (this.enumTypeBuilder_ == null) {
                    ensureEnumTypeIsMutable();
                    this.enumType_.set(i, builder.build());
                    onChanged();
                } else {
                    this.enumTypeBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addEnumType(EnumDescriptorProto enumDescriptorProto) {
                if (this.enumTypeBuilder_ != null) {
                    this.enumTypeBuilder_.addMessage(enumDescriptorProto);
                } else if (enumDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureEnumTypeIsMutable();
                    this.enumType_.add(enumDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder addEnumType(int i, EnumDescriptorProto enumDescriptorProto) {
                if (this.enumTypeBuilder_ != null) {
                    this.enumTypeBuilder_.addMessage(i, enumDescriptorProto);
                } else if (enumDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureEnumTypeIsMutable();
                    this.enumType_.add(i, enumDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder addEnumType(Builder builder) {
                if (this.enumTypeBuilder_ == null) {
                    ensureEnumTypeIsMutable();
                    this.enumType_.add(builder.build());
                    onChanged();
                } else {
                    this.enumTypeBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public final Builder addEnumType(int i, Builder builder) {
                if (this.enumTypeBuilder_ == null) {
                    ensureEnumTypeIsMutable();
                    this.enumType_.add(i, builder.build());
                    onChanged();
                } else {
                    this.enumTypeBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addAllEnumType(Iterable<? extends EnumDescriptorProto> iterable) {
                if (this.enumTypeBuilder_ == null) {
                    ensureEnumTypeIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.enumType_);
                    onChanged();
                } else {
                    this.enumTypeBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public final Builder clearEnumType() {
                if (this.enumTypeBuilder_ == null) {
                    this.enumType_ = Collections.emptyList();
                    this.bitField0_ &= -65;
                    onChanged();
                } else {
                    this.enumTypeBuilder_.clear();
                }
                return this;
            }

            public final Builder removeEnumType(int i) {
                if (this.enumTypeBuilder_ == null) {
                    ensureEnumTypeIsMutable();
                    this.enumType_.remove(i);
                    onChanged();
                } else {
                    this.enumTypeBuilder_.remove(i);
                }
                return this;
            }

            public final Builder getEnumTypeBuilder(int i) {
                return (Builder) getEnumTypeFieldBuilder().getBuilder(i);
            }

            public final EnumDescriptorProtoOrBuilder getEnumTypeOrBuilder(int i) {
                if (this.enumTypeBuilder_ == null) {
                    return (EnumDescriptorProtoOrBuilder) this.enumType_.get(i);
                }
                return (EnumDescriptorProtoOrBuilder) this.enumTypeBuilder_.getMessageOrBuilder(i);
            }

            public final List<? extends EnumDescriptorProtoOrBuilder> getEnumTypeOrBuilderList() {
                if (this.enumTypeBuilder_ != null) {
                    return this.enumTypeBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.enumType_);
            }

            public final Builder addEnumTypeBuilder() {
                return (Builder) getEnumTypeFieldBuilder().addBuilder(EnumDescriptorProto.getDefaultInstance());
            }

            public final Builder addEnumTypeBuilder(int i) {
                return (Builder) getEnumTypeFieldBuilder().addBuilder(i, EnumDescriptorProto.getDefaultInstance());
            }

            public final List<Builder> getEnumTypeBuilderList() {
                return getEnumTypeFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<EnumDescriptorProto, Builder, EnumDescriptorProtoOrBuilder> getEnumTypeFieldBuilder() {
                if (this.enumTypeBuilder_ == null) {
                    this.enumTypeBuilder_ = new RepeatedFieldBuilder(this.enumType_, (this.bitField0_ & 64) == 64, getParentForChildren(), isClean());
                    this.enumType_ = null;
                }
                return this.enumTypeBuilder_;
            }

            private void ensureServiceIsMutable() {
                if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) != AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) {
                    this.service_ = new ArrayList(this.service_);
                    this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS;
                }
            }

            public final List<ServiceDescriptorProto> getServiceList() {
                if (this.serviceBuilder_ == null) {
                    return Collections.unmodifiableList(this.service_);
                }
                return this.serviceBuilder_.getMessageList();
            }

            public final int getServiceCount() {
                if (this.serviceBuilder_ == null) {
                    return this.service_.size();
                }
                return this.serviceBuilder_.getCount();
            }

            public final ServiceDescriptorProto getService(int i) {
                if (this.serviceBuilder_ == null) {
                    return (ServiceDescriptorProto) this.service_.get(i);
                }
                return (ServiceDescriptorProto) this.serviceBuilder_.getMessage(i);
            }

            public final Builder setService(int i, ServiceDescriptorProto serviceDescriptorProto) {
                if (this.serviceBuilder_ != null) {
                    this.serviceBuilder_.setMessage(i, serviceDescriptorProto);
                } else if (serviceDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureServiceIsMutable();
                    this.service_.set(i, serviceDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder setService(int i, Builder builder) {
                if (this.serviceBuilder_ == null) {
                    ensureServiceIsMutable();
                    this.service_.set(i, builder.build());
                    onChanged();
                } else {
                    this.serviceBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addService(ServiceDescriptorProto serviceDescriptorProto) {
                if (this.serviceBuilder_ != null) {
                    this.serviceBuilder_.addMessage(serviceDescriptorProto);
                } else if (serviceDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureServiceIsMutable();
                    this.service_.add(serviceDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder addService(int i, ServiceDescriptorProto serviceDescriptorProto) {
                if (this.serviceBuilder_ != null) {
                    this.serviceBuilder_.addMessage(i, serviceDescriptorProto);
                } else if (serviceDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureServiceIsMutable();
                    this.service_.add(i, serviceDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder addService(Builder builder) {
                if (this.serviceBuilder_ == null) {
                    ensureServiceIsMutable();
                    this.service_.add(builder.build());
                    onChanged();
                } else {
                    this.serviceBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public final Builder addService(int i, Builder builder) {
                if (this.serviceBuilder_ == null) {
                    ensureServiceIsMutable();
                    this.service_.add(i, builder.build());
                    onChanged();
                } else {
                    this.serviceBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addAllService(Iterable<? extends ServiceDescriptorProto> iterable) {
                if (this.serviceBuilder_ == null) {
                    ensureServiceIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.service_);
                    onChanged();
                } else {
                    this.serviceBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public final Builder clearService() {
                if (this.serviceBuilder_ == null) {
                    this.service_ = Collections.emptyList();
                    this.bitField0_ &= -129;
                    onChanged();
                } else {
                    this.serviceBuilder_.clear();
                }
                return this;
            }

            public final Builder removeService(int i) {
                if (this.serviceBuilder_ == null) {
                    ensureServiceIsMutable();
                    this.service_.remove(i);
                    onChanged();
                } else {
                    this.serviceBuilder_.remove(i);
                }
                return this;
            }

            public final Builder getServiceBuilder(int i) {
                return (Builder) getServiceFieldBuilder().getBuilder(i);
            }

            public final ServiceDescriptorProtoOrBuilder getServiceOrBuilder(int i) {
                if (this.serviceBuilder_ == null) {
                    return (ServiceDescriptorProtoOrBuilder) this.service_.get(i);
                }
                return (ServiceDescriptorProtoOrBuilder) this.serviceBuilder_.getMessageOrBuilder(i);
            }

            public final List<? extends ServiceDescriptorProtoOrBuilder> getServiceOrBuilderList() {
                if (this.serviceBuilder_ != null) {
                    return this.serviceBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.service_);
            }

            public final Builder addServiceBuilder() {
                return (Builder) getServiceFieldBuilder().addBuilder(ServiceDescriptorProto.getDefaultInstance());
            }

            public final Builder addServiceBuilder(int i) {
                return (Builder) getServiceFieldBuilder().addBuilder(i, ServiceDescriptorProto.getDefaultInstance());
            }

            public final List<Builder> getServiceBuilderList() {
                return getServiceFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<ServiceDescriptorProto, Builder, ServiceDescriptorProtoOrBuilder> getServiceFieldBuilder() {
                if (this.serviceBuilder_ == null) {
                    this.serviceBuilder_ = new RepeatedFieldBuilder(this.service_, (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) == AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS, getParentForChildren(), isClean());
                    this.service_ = null;
                }
                return this.serviceBuilder_;
            }

            private void ensureExtensionIsMutable() {
                if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) != AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
                    this.extension_ = new ArrayList(this.extension_);
                    this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                }
            }

            public final List<FieldDescriptorProto> getExtensionList() {
                if (this.extensionBuilder_ == null) {
                    return Collections.unmodifiableList(this.extension_);
                }
                return this.extensionBuilder_.getMessageList();
            }

            public final int getExtensionCount() {
                if (this.extensionBuilder_ == null) {
                    return this.extension_.size();
                }
                return this.extensionBuilder_.getCount();
            }

            public final FieldDescriptorProto getExtension(int i) {
                if (this.extensionBuilder_ == null) {
                    return (FieldDescriptorProto) this.extension_.get(i);
                }
                return (FieldDescriptorProto) this.extensionBuilder_.getMessage(i);
            }

            public final Builder setExtension(int i, FieldDescriptorProto fieldDescriptorProto) {
                if (this.extensionBuilder_ != null) {
                    this.extensionBuilder_.setMessage(i, fieldDescriptorProto);
                } else if (fieldDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureExtensionIsMutable();
                    this.extension_.set(i, fieldDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder setExtension(int i, Builder builder) {
                if (this.extensionBuilder_ == null) {
                    ensureExtensionIsMutable();
                    this.extension_.set(i, builder.build());
                    onChanged();
                } else {
                    this.extensionBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addExtension(FieldDescriptorProto fieldDescriptorProto) {
                if (this.extensionBuilder_ != null) {
                    this.extensionBuilder_.addMessage(fieldDescriptorProto);
                } else if (fieldDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureExtensionIsMutable();
                    this.extension_.add(fieldDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder addExtension(int i, FieldDescriptorProto fieldDescriptorProto) {
                if (this.extensionBuilder_ != null) {
                    this.extensionBuilder_.addMessage(i, fieldDescriptorProto);
                } else if (fieldDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureExtensionIsMutable();
                    this.extension_.add(i, fieldDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder addExtension(Builder builder) {
                if (this.extensionBuilder_ == null) {
                    ensureExtensionIsMutable();
                    this.extension_.add(builder.build());
                    onChanged();
                } else {
                    this.extensionBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public final Builder addExtension(int i, Builder builder) {
                if (this.extensionBuilder_ == null) {
                    ensureExtensionIsMutable();
                    this.extension_.add(i, builder.build());
                    onChanged();
                } else {
                    this.extensionBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addAllExtension(Iterable<? extends FieldDescriptorProto> iterable) {
                if (this.extensionBuilder_ == null) {
                    ensureExtensionIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.extension_);
                    onChanged();
                } else {
                    this.extensionBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public final Builder clearExtension() {
                if (this.extensionBuilder_ == null) {
                    this.extension_ = Collections.emptyList();
                    this.bitField0_ &= -257;
                    onChanged();
                } else {
                    this.extensionBuilder_.clear();
                }
                return this;
            }

            public final Builder removeExtension(int i) {
                if (this.extensionBuilder_ == null) {
                    ensureExtensionIsMutable();
                    this.extension_.remove(i);
                    onChanged();
                } else {
                    this.extensionBuilder_.remove(i);
                }
                return this;
            }

            public final Builder getExtensionBuilder(int i) {
                return (Builder) getExtensionFieldBuilder().getBuilder(i);
            }

            public final FieldDescriptorProtoOrBuilder getExtensionOrBuilder(int i) {
                if (this.extensionBuilder_ == null) {
                    return (FieldDescriptorProtoOrBuilder) this.extension_.get(i);
                }
                return (FieldDescriptorProtoOrBuilder) this.extensionBuilder_.getMessageOrBuilder(i);
            }

            public final List<? extends FieldDescriptorProtoOrBuilder> getExtensionOrBuilderList() {
                if (this.extensionBuilder_ != null) {
                    return this.extensionBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.extension_);
            }

            public final Builder addExtensionBuilder() {
                return (Builder) getExtensionFieldBuilder().addBuilder(FieldDescriptorProto.getDefaultInstance());
            }

            public final Builder addExtensionBuilder(int i) {
                return (Builder) getExtensionFieldBuilder().addBuilder(i, FieldDescriptorProto.getDefaultInstance());
            }

            public final List<Builder> getExtensionBuilderList() {
                return getExtensionFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<FieldDescriptorProto, Builder, FieldDescriptorProtoOrBuilder> getExtensionFieldBuilder() {
                if (this.extensionBuilder_ == null) {
                    this.extensionBuilder_ = new RepeatedFieldBuilder(this.extension_, (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY, getParentForChildren(), isClean());
                    this.extension_ = null;
                }
                return this.extensionBuilder_;
            }

            public final boolean hasOptions() {
                return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY;
            }

            public final FileOptions getOptions() {
                if (this.optionsBuilder_ == null) {
                    return this.options_;
                }
                return (FileOptions) this.optionsBuilder_.getMessage();
            }

            public final Builder setOptions(FileOptions fileOptions) {
                if (this.optionsBuilder_ != null) {
                    this.optionsBuilder_.setMessage(fileOptions);
                } else if (fileOptions == null) {
                    throw new NullPointerException();
                } else {
                    this.options_ = fileOptions;
                    onChanged();
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY;
                return this;
            }

            public final Builder setOptions(Builder builder) {
                if (this.optionsBuilder_ == null) {
                    this.options_ = builder.build();
                    onChanged();
                } else {
                    this.optionsBuilder_.setMessage(builder.build());
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY;
                return this;
            }

            public final Builder mergeOptions(FileOptions fileOptions) {
                if (this.optionsBuilder_ == null) {
                    if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY) != AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY || this.options_ == FileOptions.getDefaultInstance()) {
                        this.options_ = fileOptions;
                    } else {
                        this.options_ = FileOptions.newBuilder(this.options_).mergeFrom(fileOptions).buildPartial();
                    }
                    onChanged();
                } else {
                    this.optionsBuilder_.mergeFrom(fileOptions);
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY;
                return this;
            }

            public final Builder clearOptions() {
                if (this.optionsBuilder_ == null) {
                    this.options_ = FileOptions.getDefaultInstance();
                    onChanged();
                } else {
                    this.optionsBuilder_.clear();
                }
                this.bitField0_ &= -513;
                return this;
            }

            public final Builder getOptionsBuilder() {
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY;
                onChanged();
                return (Builder) getOptionsFieldBuilder().getBuilder();
            }

            public final FileOptionsOrBuilder getOptionsOrBuilder() {
                if (this.optionsBuilder_ != null) {
                    return (FileOptionsOrBuilder) this.optionsBuilder_.getMessageOrBuilder();
                }
                return this.options_;
            }

            private SingleFieldBuilder<FileOptions, Builder, FileOptionsOrBuilder> getOptionsFieldBuilder() {
                if (this.optionsBuilder_ == null) {
                    this.optionsBuilder_ = new SingleFieldBuilder(getOptions(), getParentForChildren(), isClean());
                    this.options_ = null;
                }
                return this.optionsBuilder_;
            }

            public final boolean hasSourceCodeInfo() {
                return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT) == AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT;
            }

            public final SourceCodeInfo getSourceCodeInfo() {
                if (this.sourceCodeInfoBuilder_ == null) {
                    return this.sourceCodeInfo_;
                }
                return (SourceCodeInfo) this.sourceCodeInfoBuilder_.getMessage();
            }

            public final Builder setSourceCodeInfo(SourceCodeInfo sourceCodeInfo) {
                if (this.sourceCodeInfoBuilder_ != null) {
                    this.sourceCodeInfoBuilder_.setMessage(sourceCodeInfo);
                } else if (sourceCodeInfo == null) {
                    throw new NullPointerException();
                } else {
                    this.sourceCodeInfo_ = sourceCodeInfo;
                    onChanged();
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT;
                return this;
            }

            public final Builder setSourceCodeInfo(Builder builder) {
                if (this.sourceCodeInfoBuilder_ == null) {
                    this.sourceCodeInfo_ = builder.build();
                    onChanged();
                } else {
                    this.sourceCodeInfoBuilder_.setMessage(builder.build());
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT;
                return this;
            }

            public final Builder mergeSourceCodeInfo(SourceCodeInfo sourceCodeInfo) {
                if (this.sourceCodeInfoBuilder_ == null) {
                    if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT) != AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT || this.sourceCodeInfo_ == SourceCodeInfo.getDefaultInstance()) {
                        this.sourceCodeInfo_ = sourceCodeInfo;
                    } else {
                        this.sourceCodeInfo_ = SourceCodeInfo.newBuilder(this.sourceCodeInfo_).mergeFrom(sourceCodeInfo).buildPartial();
                    }
                    onChanged();
                } else {
                    this.sourceCodeInfoBuilder_.mergeFrom(sourceCodeInfo);
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT;
                return this;
            }

            public final Builder clearSourceCodeInfo() {
                if (this.sourceCodeInfoBuilder_ == null) {
                    this.sourceCodeInfo_ = SourceCodeInfo.getDefaultInstance();
                    onChanged();
                } else {
                    this.sourceCodeInfoBuilder_.clear();
                }
                this.bitField0_ &= -1025;
                return this;
            }

            public final Builder getSourceCodeInfoBuilder() {
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT;
                onChanged();
                return (Builder) getSourceCodeInfoFieldBuilder().getBuilder();
            }

            public final SourceCodeInfoOrBuilder getSourceCodeInfoOrBuilder() {
                if (this.sourceCodeInfoBuilder_ != null) {
                    return (SourceCodeInfoOrBuilder) this.sourceCodeInfoBuilder_.getMessageOrBuilder();
                }
                return this.sourceCodeInfo_;
            }

            private SingleFieldBuilder<SourceCodeInfo, Builder, SourceCodeInfoOrBuilder> getSourceCodeInfoFieldBuilder() {
                if (this.sourceCodeInfoBuilder_ == null) {
                    this.sourceCodeInfoBuilder_ = new SingleFieldBuilder(getSourceCodeInfo(), getParentForChildren(), isClean());
                    this.sourceCodeInfo_ = null;
                }
                return this.sourceCodeInfoBuilder_;
            }
        }

        private FileDescriptorProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private FileDescriptorProto(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static FileDescriptorProto getDefaultInstance() {
            return defaultInstance;
        }

        public final FileDescriptorProto getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private FileDescriptorProto(com.google.protobuf.CodedInputStream r13, com.google.protobuf.ExtensionRegistryLite r14) {
            /*
            r12 = this;
            r10 = 64;
            r9 = 32;
            r8 = 16;
            r7 = 4;
            r6 = 8;
            r12.<init>();
            r0 = -1;
            r12.memoizedIsInitialized = r0;
            r0 = -1;
            r12.memoizedSerializedSize = r0;
            r12.initFields();
            r1 = 0;
            r4 = com.google.protobuf.UnknownFieldSet.newBuilder();
            r0 = 0;
            r3 = r0;
        L_0x001c:
            if (r3 != 0) goto L_0x0249;
        L_0x001e:
            r0 = r13.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            switch(r0) {
                case 0: goto L_0x002e;
                case 10: goto L_0x0031;
                case 18: goto L_0x00a7;
                case 26: goto L_0x00c4;
                case 34: goto L_0x00dc;
                case 42: goto L_0x00f6;
                case 50: goto L_0x0110;
                case 58: goto L_0x012c;
                case 66: goto L_0x0148;
                case 74: goto L_0x0175;
                case 80: goto L_0x01a2;
                case 82: goto L_0x01be;
                case 88: goto L_0x01f2;
                case 90: goto L_0x020e;
                default: goto L_0x0025;
            };	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
        L_0x0025:
            r0 = r12.parseUnknownField(r13, r4, r14, r0);	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            if (r0 != 0) goto L_0x02c0;
        L_0x002b:
            r0 = 1;
            r3 = r0;
            goto L_0x001c;
        L_0x002e:
            r0 = 1;
            r3 = r0;
            goto L_0x001c;
        L_0x0031:
            r0 = r13.readBytes();	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r2 = r12.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r2 = r2 | 1;
            r12.bitField0_ = r2;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r12.name_ = r0;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            goto L_0x001c;
        L_0x003e:
            r0 = move-exception;
        L_0x003f:
            r0 = r0.setUnfinishedMessage(r12);	 Catch:{ all -> 0x0044 }
            throw r0;	 Catch:{ all -> 0x0044 }
        L_0x0044:
            r0 = move-exception;
        L_0x0045:
            r2 = r1 & 4;
            if (r2 != r7) goto L_0x0051;
        L_0x0049:
            r2 = r12.dependency_;
            r2 = r2.getUnmodifiableView();
            r12.dependency_ = r2;
        L_0x0051:
            r2 = r1 & 32;
            if (r2 != r9) goto L_0x005d;
        L_0x0055:
            r2 = r12.messageType_;
            r2 = java.util.Collections.unmodifiableList(r2);
            r12.messageType_ = r2;
        L_0x005d:
            r2 = r1 & 64;
            if (r2 != r10) goto L_0x0069;
        L_0x0061:
            r2 = r12.enumType_;
            r2 = java.util.Collections.unmodifiableList(r2);
            r12.enumType_ = r2;
        L_0x0069:
            r2 = r1 & 128;
            r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
            if (r2 != r3) goto L_0x0077;
        L_0x006f:
            r2 = r12.service_;
            r2 = java.util.Collections.unmodifiableList(r2);
            r12.service_ = r2;
        L_0x0077:
            r2 = r1 & 256;
            r3 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
            if (r2 != r3) goto L_0x0085;
        L_0x007d:
            r2 = r12.extension_;
            r2 = java.util.Collections.unmodifiableList(r2);
            r12.extension_ = r2;
        L_0x0085:
            r2 = r1 & 8;
            if (r2 != r6) goto L_0x0091;
        L_0x0089:
            r2 = r12.publicDependency_;
            r2 = java.util.Collections.unmodifiableList(r2);
            r12.publicDependency_ = r2;
        L_0x0091:
            r1 = r1 & 16;
            if (r1 != r8) goto L_0x009d;
        L_0x0095:
            r1 = r12.weakDependency_;
            r1 = java.util.Collections.unmodifiableList(r1);
            r12.weakDependency_ = r1;
        L_0x009d:
            r1 = r4.build();
            r12.unknownFields = r1;
            r12.makeExtensionsImmutable();
            throw r0;
        L_0x00a7:
            r0 = r13.readBytes();	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r2 = r12.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r2 = r2 | 2;
            r12.bitField0_ = r2;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r12.package_ = r0;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            goto L_0x001c;
        L_0x00b5:
            r0 = move-exception;
        L_0x00b6:
            r2 = new com.google.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x0044 }
            r0 = r0.getMessage();	 Catch:{ all -> 0x0044 }
            r2.<init>(r0);	 Catch:{ all -> 0x0044 }
            r0 = r2.setUnfinishedMessage(r12);	 Catch:{ all -> 0x0044 }
            throw r0;	 Catch:{ all -> 0x0044 }
        L_0x00c4:
            r0 = r13.readBytes();	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r2 = r1 & 4;
            if (r2 == r7) goto L_0x00d5;
        L_0x00cc:
            r2 = new com.google.protobuf.LazyStringArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r2.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r12.dependency_ = r2;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r1 = r1 | 4;
        L_0x00d5:
            r2 = r12.dependency_;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r2.add(r0);	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            goto L_0x001c;
        L_0x00dc:
            r0 = r1 & 32;
            if (r0 == r9) goto L_0x00e9;
        L_0x00e0:
            r0 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r0.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r12.messageType_ = r0;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r1 = r1 | 32;
        L_0x00e9:
            r0 = r12.messageType_;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r2 = com.google.protobuf.DescriptorProtos.DescriptorProto.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r2 = r13.readMessage(r2, r14);	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r0.add(r2);	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            goto L_0x001c;
        L_0x00f6:
            r0 = r1 & 64;
            if (r0 == r10) goto L_0x0103;
        L_0x00fa:
            r0 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r0.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r12.enumType_ = r0;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r1 = r1 | 64;
        L_0x0103:
            r0 = r12.enumType_;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r2 = com.google.protobuf.DescriptorProtos.EnumDescriptorProto.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r2 = r13.readMessage(r2, r14);	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r0.add(r2);	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            goto L_0x001c;
        L_0x0110:
            r0 = r1 & 128;
            r2 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
            if (r0 == r2) goto L_0x011f;
        L_0x0116:
            r0 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r0.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r12.service_ = r0;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r1 = r1 | 128;
        L_0x011f:
            r0 = r12.service_;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r2 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r2 = r13.readMessage(r2, r14);	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r0.add(r2);	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            goto L_0x001c;
        L_0x012c:
            r0 = r1 & 256;
            r2 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
            if (r0 == r2) goto L_0x013b;
        L_0x0132:
            r0 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r0.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r12.extension_ = r0;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r1 = r1 | 256;
        L_0x013b:
            r0 = r12.extension_;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r2 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r2 = r13.readMessage(r2, r14);	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r0.add(r2);	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            goto L_0x001c;
        L_0x0148:
            r0 = 0;
            r2 = r12.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r2 = r2 & 4;
            if (r2 != r7) goto L_0x02bd;
        L_0x014f:
            r0 = r12.options_;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r0 = r0.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r2 = r0;
        L_0x0156:
            r0 = com.google.protobuf.DescriptorProtos.FileOptions.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r0 = r13.readMessage(r0, r14);	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r0 = (com.google.protobuf.DescriptorProtos.FileOptions) r0;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r12.options_ = r0;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            if (r2 == 0) goto L_0x016d;
        L_0x0162:
            r0 = r12.options_;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r2.mergeFrom(r0);	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r0 = r2.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r12.options_ = r0;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
        L_0x016d:
            r0 = r12.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r0 = r0 | 4;
            r12.bitField0_ = r0;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            goto L_0x001c;
        L_0x0175:
            r0 = 0;
            r2 = r12.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r2 = r2 & 8;
            if (r2 != r6) goto L_0x02ba;
        L_0x017c:
            r0 = r12.sourceCodeInfo_;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r0 = r0.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r2 = r0;
        L_0x0183:
            r0 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r0 = r13.readMessage(r0, r14);	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r0 = (com.google.protobuf.DescriptorProtos.SourceCodeInfo) r0;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r12.sourceCodeInfo_ = r0;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            if (r2 == 0) goto L_0x019a;
        L_0x018f:
            r0 = r12.sourceCodeInfo_;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r2.mergeFrom(r0);	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r0 = r2.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r12.sourceCodeInfo_ = r0;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
        L_0x019a:
            r0 = r12.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r0 = r0 | 8;
            r12.bitField0_ = r0;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            goto L_0x001c;
        L_0x01a2:
            r0 = r1 & 8;
            if (r0 == r6) goto L_0x01af;
        L_0x01a6:
            r0 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r0.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r12.publicDependency_ = r0;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r1 = r1 | 8;
        L_0x01af:
            r0 = r12.publicDependency_;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r2 = r13.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r2 = java.lang.Integer.valueOf(r2);	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r0.add(r2);	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            goto L_0x001c;
        L_0x01be:
            r0 = r13.readRawVarint32();	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r0 = r13.pushLimit(r0);	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r2 = r1 & 8;
            if (r2 == r6) goto L_0x01d9;
        L_0x01ca:
            r2 = r13.getBytesUntilLimit();	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            if (r2 <= 0) goto L_0x01d9;
        L_0x01d0:
            r2 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r2.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r12.publicDependency_ = r2;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r1 = r1 | 8;
        L_0x01d9:
            r2 = r13.getBytesUntilLimit();	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            if (r2 <= 0) goto L_0x01ed;
        L_0x01df:
            r2 = r12.publicDependency_;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r5 = r13.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r5 = java.lang.Integer.valueOf(r5);	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r2.add(r5);	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            goto L_0x01d9;
        L_0x01ed:
            r13.popLimit(r0);	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            goto L_0x001c;
        L_0x01f2:
            r0 = r1 & 16;
            if (r0 == r8) goto L_0x01ff;
        L_0x01f6:
            r0 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r0.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r12.weakDependency_ = r0;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r1 = r1 | 16;
        L_0x01ff:
            r0 = r12.weakDependency_;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r2 = r13.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r2 = java.lang.Integer.valueOf(r2);	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r0.add(r2);	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            goto L_0x001c;
        L_0x020e:
            r0 = r13.readRawVarint32();	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r2 = r13.pushLimit(r0);	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r0 = r1 & 16;
            if (r0 == r8) goto L_0x02b7;
        L_0x021a:
            r0 = r13.getBytesUntilLimit();	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            if (r0 <= 0) goto L_0x02b7;
        L_0x0220:
            r0 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r0.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r12.weakDependency_ = r0;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x00b5 }
            r0 = r1 | 16;
        L_0x0229:
            r1 = r13.getBytesUntilLimit();	 Catch:{ InvalidProtocolBufferException -> 0x023d, IOException -> 0x02b1, all -> 0x02ab }
            if (r1 <= 0) goto L_0x0243;
        L_0x022f:
            r1 = r12.weakDependency_;	 Catch:{ InvalidProtocolBufferException -> 0x023d, IOException -> 0x02b1, all -> 0x02ab }
            r5 = r13.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x023d, IOException -> 0x02b1, all -> 0x02ab }
            r5 = java.lang.Integer.valueOf(r5);	 Catch:{ InvalidProtocolBufferException -> 0x023d, IOException -> 0x02b1, all -> 0x02ab }
            r1.add(r5);	 Catch:{ InvalidProtocolBufferException -> 0x023d, IOException -> 0x02b1, all -> 0x02ab }
            goto L_0x0229;
        L_0x023d:
            r1 = move-exception;
            r11 = r1;
            r1 = r0;
            r0 = r11;
            goto L_0x003f;
        L_0x0243:
            r13.popLimit(r2);	 Catch:{ InvalidProtocolBufferException -> 0x023d, IOException -> 0x02b1, all -> 0x02ab }
        L_0x0246:
            r1 = r0;
            goto L_0x001c;
        L_0x0249:
            r0 = r1 & 4;
            if (r0 != r7) goto L_0x0255;
        L_0x024d:
            r0 = r12.dependency_;
            r0 = r0.getUnmodifiableView();
            r12.dependency_ = r0;
        L_0x0255:
            r0 = r1 & 32;
            if (r0 != r9) goto L_0x0261;
        L_0x0259:
            r0 = r12.messageType_;
            r0 = java.util.Collections.unmodifiableList(r0);
            r12.messageType_ = r0;
        L_0x0261:
            r0 = r1 & 64;
            if (r0 != r10) goto L_0x026d;
        L_0x0265:
            r0 = r12.enumType_;
            r0 = java.util.Collections.unmodifiableList(r0);
            r12.enumType_ = r0;
        L_0x026d:
            r0 = r1 & 128;
            r2 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
            if (r0 != r2) goto L_0x027b;
        L_0x0273:
            r0 = r12.service_;
            r0 = java.util.Collections.unmodifiableList(r0);
            r12.service_ = r0;
        L_0x027b:
            r0 = r1 & 256;
            r2 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
            if (r0 != r2) goto L_0x0289;
        L_0x0281:
            r0 = r12.extension_;
            r0 = java.util.Collections.unmodifiableList(r0);
            r12.extension_ = r0;
        L_0x0289:
            r0 = r1 & 8;
            if (r0 != r6) goto L_0x0295;
        L_0x028d:
            r0 = r12.publicDependency_;
            r0 = java.util.Collections.unmodifiableList(r0);
            r12.publicDependency_ = r0;
        L_0x0295:
            r0 = r1 & 16;
            if (r0 != r8) goto L_0x02a1;
        L_0x0299:
            r0 = r12.weakDependency_;
            r0 = java.util.Collections.unmodifiableList(r0);
            r12.weakDependency_ = r0;
        L_0x02a1:
            r0 = r4.build();
            r12.unknownFields = r0;
            r12.makeExtensionsImmutable();
            return;
        L_0x02ab:
            r1 = move-exception;
            r11 = r1;
            r1 = r0;
            r0 = r11;
            goto L_0x0045;
        L_0x02b1:
            r1 = move-exception;
            r11 = r1;
            r1 = r0;
            r0 = r11;
            goto L_0x00b6;
        L_0x02b7:
            r0 = r1;
            goto L_0x0229;
        L_0x02ba:
            r2 = r0;
            goto L_0x0183;
        L_0x02bd:
            r2 = r0;
            goto L_0x0156;
        L_0x02c0:
            r0 = r1;
            goto L_0x0246;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.FileDescriptorProto.<init>(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):void");
        }

        public static final Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_FileDescriptorProto_descriptor;
        }

        protected final FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.f2781x4b52780c.ensureFieldAccessorsInitialized(FileDescriptorProto.class, Builder.class);
        }

        static {
            PARSER = new C02891();
            FileDescriptorProto fileDescriptorProto = new FileDescriptorProto(true);
            defaultInstance = fileDescriptorProto;
            fileDescriptorProto.initFields();
        }

        public final Parser<FileDescriptorProto> getParserForType() {
            return PARSER;
        }

        public final boolean hasName() {
            return (this.bitField0_ & NAME_FIELD_NUMBER) == NAME_FIELD_NUMBER;
        }

        public final String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String toStringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = toStringUtf8;
            }
            return toStringUtf8;
        }

        public final ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean hasPackage() {
            return (this.bitField0_ & PACKAGE_FIELD_NUMBER) == PACKAGE_FIELD_NUMBER;
        }

        public final String getPackage() {
            Object obj = this.package_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String toStringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.package_ = toStringUtf8;
            }
            return toStringUtf8;
        }

        public final ByteString getPackageBytes() {
            Object obj = this.package_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.package_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final ProtocolStringList getDependencyList() {
            return this.dependency_;
        }

        public final int getDependencyCount() {
            return this.dependency_.size();
        }

        public final String getDependency(int i) {
            return (String) this.dependency_.get(i);
        }

        public final ByteString getDependencyBytes(int i) {
            return this.dependency_.getByteString(i);
        }

        public final List<Integer> getPublicDependencyList() {
            return this.publicDependency_;
        }

        public final int getPublicDependencyCount() {
            return this.publicDependency_.size();
        }

        public final int getPublicDependency(int i) {
            return ((Integer) this.publicDependency_.get(i)).intValue();
        }

        public final List<Integer> getWeakDependencyList() {
            return this.weakDependency_;
        }

        public final int getWeakDependencyCount() {
            return this.weakDependency_.size();
        }

        public final int getWeakDependency(int i) {
            return ((Integer) this.weakDependency_.get(i)).intValue();
        }

        public final List<DescriptorProto> getMessageTypeList() {
            return this.messageType_;
        }

        public final List<? extends DescriptorProtoOrBuilder> getMessageTypeOrBuilderList() {
            return this.messageType_;
        }

        public final int getMessageTypeCount() {
            return this.messageType_.size();
        }

        public final DescriptorProto getMessageType(int i) {
            return (DescriptorProto) this.messageType_.get(i);
        }

        public final DescriptorProtoOrBuilder getMessageTypeOrBuilder(int i) {
            return (DescriptorProtoOrBuilder) this.messageType_.get(i);
        }

        public final List<EnumDescriptorProto> getEnumTypeList() {
            return this.enumType_;
        }

        public final List<? extends EnumDescriptorProtoOrBuilder> getEnumTypeOrBuilderList() {
            return this.enumType_;
        }

        public final int getEnumTypeCount() {
            return this.enumType_.size();
        }

        public final EnumDescriptorProto getEnumType(int i) {
            return (EnumDescriptorProto) this.enumType_.get(i);
        }

        public final EnumDescriptorProtoOrBuilder getEnumTypeOrBuilder(int i) {
            return (EnumDescriptorProtoOrBuilder) this.enumType_.get(i);
        }

        public final List<ServiceDescriptorProto> getServiceList() {
            return this.service_;
        }

        public final List<? extends ServiceDescriptorProtoOrBuilder> getServiceOrBuilderList() {
            return this.service_;
        }

        public final int getServiceCount() {
            return this.service_.size();
        }

        public final ServiceDescriptorProto getService(int i) {
            return (ServiceDescriptorProto) this.service_.get(i);
        }

        public final ServiceDescriptorProtoOrBuilder getServiceOrBuilder(int i) {
            return (ServiceDescriptorProtoOrBuilder) this.service_.get(i);
        }

        public final List<FieldDescriptorProto> getExtensionList() {
            return this.extension_;
        }

        public final List<? extends FieldDescriptorProtoOrBuilder> getExtensionOrBuilderList() {
            return this.extension_;
        }

        public final int getExtensionCount() {
            return this.extension_.size();
        }

        public final FieldDescriptorProto getExtension(int i) {
            return (FieldDescriptorProto) this.extension_.get(i);
        }

        public final FieldDescriptorProtoOrBuilder getExtensionOrBuilder(int i) {
            return (FieldDescriptorProtoOrBuilder) this.extension_.get(i);
        }

        public final boolean hasOptions() {
            return (this.bitField0_ & MESSAGE_TYPE_FIELD_NUMBER) == MESSAGE_TYPE_FIELD_NUMBER;
        }

        public final FileOptions getOptions() {
            return this.options_;
        }

        public final FileOptionsOrBuilder getOptionsOrBuilder() {
            return this.options_;
        }

        public final boolean hasSourceCodeInfo() {
            return (this.bitField0_ & OPTIONS_FIELD_NUMBER) == OPTIONS_FIELD_NUMBER;
        }

        public final SourceCodeInfo getSourceCodeInfo() {
            return this.sourceCodeInfo_;
        }

        public final SourceCodeInfoOrBuilder getSourceCodeInfoOrBuilder() {
            return this.sourceCodeInfo_;
        }

        private void initFields() {
            this.name_ = LetterIndexBar.SEARCH_ICON_LETTER;
            this.package_ = LetterIndexBar.SEARCH_ICON_LETTER;
            this.dependency_ = LazyStringArrayList.EMPTY;
            this.publicDependency_ = Collections.emptyList();
            this.weakDependency_ = Collections.emptyList();
            this.messageType_ = Collections.emptyList();
            this.enumType_ = Collections.emptyList();
            this.service_ = Collections.emptyList();
            this.extension_ = Collections.emptyList();
            this.options_ = FileOptions.getDefaultInstance();
            this.sourceCodeInfo_ = SourceCodeInfo.getDefaultInstance();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == null) {
                return false;
            }
            int i = 0;
            while (i < getMessageTypeCount()) {
                if (getMessageType(i).isInitialized()) {
                    i += NAME_FIELD_NUMBER;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            i = 0;
            while (i < getEnumTypeCount()) {
                if (getEnumType(i).isInitialized()) {
                    i += NAME_FIELD_NUMBER;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            i = 0;
            while (i < getServiceCount()) {
                if (getService(i).isInitialized()) {
                    i += NAME_FIELD_NUMBER;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            i = 0;
            while (i < getExtensionCount()) {
                if (getExtension(i).isInitialized()) {
                    i += NAME_FIELD_NUMBER;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (!hasOptions() || getOptions().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) {
            int i;
            int i2 = 0;
            getSerializedSize();
            if ((this.bitField0_ & NAME_FIELD_NUMBER) == NAME_FIELD_NUMBER) {
                codedOutputStream.writeBytes(NAME_FIELD_NUMBER, getNameBytes());
            }
            if ((this.bitField0_ & PACKAGE_FIELD_NUMBER) == PACKAGE_FIELD_NUMBER) {
                codedOutputStream.writeBytes(PACKAGE_FIELD_NUMBER, getPackageBytes());
            }
            for (int i3 = 0; i3 < this.dependency_.size(); i3 += NAME_FIELD_NUMBER) {
                codedOutputStream.writeBytes(DEPENDENCY_FIELD_NUMBER, this.dependency_.getByteString(i3));
            }
            for (i = 0; i < this.messageType_.size(); i += NAME_FIELD_NUMBER) {
                codedOutputStream.writeMessage(MESSAGE_TYPE_FIELD_NUMBER, (MessageLite) this.messageType_.get(i));
            }
            for (i = 0; i < this.enumType_.size(); i += NAME_FIELD_NUMBER) {
                codedOutputStream.writeMessage(ENUM_TYPE_FIELD_NUMBER, (MessageLite) this.enumType_.get(i));
            }
            for (i = 0; i < this.service_.size(); i += NAME_FIELD_NUMBER) {
                codedOutputStream.writeMessage(SERVICE_FIELD_NUMBER, (MessageLite) this.service_.get(i));
            }
            for (i = 0; i < this.extension_.size(); i += NAME_FIELD_NUMBER) {
                codedOutputStream.writeMessage(EXTENSION_FIELD_NUMBER, (MessageLite) this.extension_.get(i));
            }
            if ((this.bitField0_ & MESSAGE_TYPE_FIELD_NUMBER) == MESSAGE_TYPE_FIELD_NUMBER) {
                codedOutputStream.writeMessage(OPTIONS_FIELD_NUMBER, this.options_);
            }
            if ((this.bitField0_ & OPTIONS_FIELD_NUMBER) == OPTIONS_FIELD_NUMBER) {
                codedOutputStream.writeMessage(SOURCE_CODE_INFO_FIELD_NUMBER, this.sourceCodeInfo_);
            }
            for (i = 0; i < this.publicDependency_.size(); i += NAME_FIELD_NUMBER) {
                codedOutputStream.writeInt32(PUBLIC_DEPENDENCY_FIELD_NUMBER, ((Integer) this.publicDependency_.get(i)).intValue());
            }
            while (i2 < this.weakDependency_.size()) {
                codedOutputStream.writeInt32(WEAK_DEPENDENCY_FIELD_NUMBER, ((Integer) this.weakDependency_.get(i2)).intValue());
                i2 += NAME_FIELD_NUMBER;
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public final int getSerializedSize() {
            int i = 0;
            int i2 = this.memoizedSerializedSize;
            if (i2 != -1) {
                return i2;
            }
            int i3;
            if ((this.bitField0_ & NAME_FIELD_NUMBER) == NAME_FIELD_NUMBER) {
                i2 = CodedOutputStream.computeBytesSize(NAME_FIELD_NUMBER, getNameBytes()) + 0;
            } else {
                i2 = 0;
            }
            if ((this.bitField0_ & PACKAGE_FIELD_NUMBER) == PACKAGE_FIELD_NUMBER) {
                i2 += CodedOutputStream.computeBytesSize(PACKAGE_FIELD_NUMBER, getPackageBytes());
            }
            int i4 = 0;
            for (i3 = 0; i3 < this.dependency_.size(); i3 += NAME_FIELD_NUMBER) {
                i4 += CodedOutputStream.computeBytesSizeNoTag(this.dependency_.getByteString(i3));
            }
            i4 = (i2 + i4) + (getDependencyList().size() * NAME_FIELD_NUMBER);
            for (i3 = 0; i3 < this.messageType_.size(); i3 += NAME_FIELD_NUMBER) {
                i4 += CodedOutputStream.computeMessageSize(MESSAGE_TYPE_FIELD_NUMBER, (MessageLite) this.messageType_.get(i3));
            }
            for (i3 = 0; i3 < this.enumType_.size(); i3 += NAME_FIELD_NUMBER) {
                i4 += CodedOutputStream.computeMessageSize(ENUM_TYPE_FIELD_NUMBER, (MessageLite) this.enumType_.get(i3));
            }
            for (i3 = 0; i3 < this.service_.size(); i3 += NAME_FIELD_NUMBER) {
                i4 += CodedOutputStream.computeMessageSize(SERVICE_FIELD_NUMBER, (MessageLite) this.service_.get(i3));
            }
            for (i3 = 0; i3 < this.extension_.size(); i3 += NAME_FIELD_NUMBER) {
                i4 += CodedOutputStream.computeMessageSize(EXTENSION_FIELD_NUMBER, (MessageLite) this.extension_.get(i3));
            }
            if ((this.bitField0_ & MESSAGE_TYPE_FIELD_NUMBER) == MESSAGE_TYPE_FIELD_NUMBER) {
                i4 += CodedOutputStream.computeMessageSize(OPTIONS_FIELD_NUMBER, this.options_);
            }
            if ((this.bitField0_ & OPTIONS_FIELD_NUMBER) == OPTIONS_FIELD_NUMBER) {
                i4 += CodedOutputStream.computeMessageSize(SOURCE_CODE_INFO_FIELD_NUMBER, this.sourceCodeInfo_);
            }
            int i5 = 0;
            for (i3 = 0; i3 < this.publicDependency_.size(); i3 += NAME_FIELD_NUMBER) {
                i5 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.publicDependency_.get(i3)).intValue());
            }
            i4 = (i4 + i5) + (getPublicDependencyList().size() * NAME_FIELD_NUMBER);
            i3 = 0;
            while (i < this.weakDependency_.size()) {
                i += NAME_FIELD_NUMBER;
                i3 = CodedOutputStream.computeInt32SizeNoTag(((Integer) this.weakDependency_.get(i)).intValue()) + i3;
            }
            i2 = ((i4 + i3) + (getWeakDependencyList().size() * NAME_FIELD_NUMBER)) + getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = i2;
            return i2;
        }

        protected final Object writeReplace() {
            return super.writeReplace();
        }

        public static FileDescriptorProto parseFrom(ByteString byteString) {
            return (FileDescriptorProto) PARSER.parseFrom(byteString);
        }

        public static FileDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (FileDescriptorProto) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static FileDescriptorProto parseFrom(byte[] bArr) {
            return (FileDescriptorProto) PARSER.parseFrom(bArr);
        }

        public static FileDescriptorProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (FileDescriptorProto) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FileDescriptorProto parseFrom(InputStream inputStream) {
            return (FileDescriptorProto) PARSER.parseFrom(inputStream);
        }

        public static FileDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileDescriptorProto) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static FileDescriptorProto parseDelimitedFrom(InputStream inputStream) {
            return (FileDescriptorProto) PARSER.parseDelimitedFrom(inputStream);
        }

        public static FileDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileDescriptorProto) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static FileDescriptorProto parseFrom(CodedInputStream codedInputStream) {
            return (FileDescriptorProto) PARSER.parseFrom(codedInputStream);
        }

        public static FileDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileDescriptorProto) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(FileDescriptorProto fileDescriptorProto) {
            return newBuilder().mergeFrom(fileDescriptorProto);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        protected final Builder newBuilderForType(BuilderParent builderParent) {
            return new Builder(null);
        }
    }

    public interface FileDescriptorSetOrBuilder extends MessageOrBuilder {
        FileDescriptorProto getFile(int i);

        int getFileCount();

        List<FileDescriptorProto> getFileList();

        FileDescriptorProtoOrBuilder getFileOrBuilder(int i);

        List<? extends FileDescriptorProtoOrBuilder> getFileOrBuilderList();
    }

    public static final class FileDescriptorSet extends GeneratedMessage implements FileDescriptorSetOrBuilder {
        public static final int FILE_FIELD_NUMBER = 1;
        public static Parser<FileDescriptorSet> PARSER;
        private static final FileDescriptorSet defaultInstance;
        private static final long serialVersionUID = 0;
        private List<FileDescriptorProto> file_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.google.protobuf.DescriptorProtos.FileDescriptorSet.1 */
        static class C02901 extends AbstractParser<FileDescriptorSet> {
            C02901() {
            }

            public final FileDescriptorSet parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new FileDescriptorSet(extensionRegistryLite, null);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements FileDescriptorSetOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilder<FileDescriptorProto, Builder, FileDescriptorProtoOrBuilder> fileBuilder_;
            private List<FileDescriptorProto> file_;

            public static final Descriptor getDescriptor() {
                return DescriptorProtos.internal_static_google_protobuf_FileDescriptorSet_descriptor;
            }

            protected final FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.f2782x15a6a952.ensureFieldAccessorsInitialized(FileDescriptorSet.class, Builder.class);
            }

            private Builder() {
                this.file_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent builderParent) {
                super(builderParent);
                this.file_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    getFileFieldBuilder();
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public final Builder clear() {
                super.clear();
                if (this.fileBuilder_ == null) {
                    this.file_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    this.fileBuilder_.clear();
                }
                return this;
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_FileDescriptorSet_descriptor;
            }

            public final FileDescriptorSet getDefaultInstanceForType() {
                return FileDescriptorSet.getDefaultInstance();
            }

            public final FileDescriptorSet build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
            }

            public final FileDescriptorSet buildPartial() {
                FileDescriptorSet fileDescriptorSet = new FileDescriptorSet(null);
                if (this.fileBuilder_ == null) {
                    if ((this.bitField0_ & FileDescriptorSet.FILE_FIELD_NUMBER) == FileDescriptorSet.FILE_FIELD_NUMBER) {
                        this.file_ = Collections.unmodifiableList(this.file_);
                        this.bitField0_ &= -2;
                    }
                    fileDescriptorSet.file_ = this.file_;
                } else {
                    fileDescriptorSet.file_ = this.fileBuilder_.build();
                }
                onBuilt();
                return fileDescriptorSet;
            }

            public final Builder mergeFrom(Message message) {
                if (message instanceof FileDescriptorSet) {
                    return mergeFrom((FileDescriptorSet) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public final Builder mergeFrom(FileDescriptorSet fileDescriptorSet) {
                RepeatedFieldBuilder repeatedFieldBuilder = null;
                if (fileDescriptorSet != FileDescriptorSet.getDefaultInstance()) {
                    if (this.fileBuilder_ == null) {
                        if (!fileDescriptorSet.file_.isEmpty()) {
                            if (this.file_.isEmpty()) {
                                this.file_ = fileDescriptorSet.file_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureFileIsMutable();
                                this.file_.addAll(fileDescriptorSet.file_);
                            }
                            onChanged();
                        }
                    } else if (!fileDescriptorSet.file_.isEmpty()) {
                        if (this.fileBuilder_.isEmpty()) {
                            this.fileBuilder_.dispose();
                            this.fileBuilder_ = null;
                            this.file_ = fileDescriptorSet.file_;
                            this.bitField0_ &= -2;
                            if (GeneratedMessage.alwaysUseFieldBuilders) {
                                repeatedFieldBuilder = getFileFieldBuilder();
                            }
                            this.fileBuilder_ = repeatedFieldBuilder;
                        } else {
                            this.fileBuilder_.addAllMessages(fileDescriptorSet.file_);
                        }
                    }
                    mergeUnknownFields(fileDescriptorSet.getUnknownFields());
                }
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < getFileCount(); i += FileDescriptorSet.FILE_FIELD_NUMBER) {
                    if (!getFile(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.google.protobuf.DescriptorProtos.FileDescriptorSet.Builder mergeFrom(com.google.protobuf.CodedInputStream r5, com.google.protobuf.ExtensionRegistryLite r6) {
                /*
                r4 = this;
                r2 = 0;
                r0 = com.google.protobuf.DescriptorProtos.FileDescriptorSet.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = (com.google.protobuf.DescriptorProtos.FileDescriptorSet) r0;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                if (r0 == 0) goto L_0x000e;
            L_0x000b:
                r4.mergeFrom(r0);
            L_0x000e:
                return r4;
            L_0x000f:
                r0 = move-exception;
                r1 = r0;
                r0 = r1.getUnfinishedMessage();	 Catch:{ all -> 0x0022 }
                r0 = (com.google.protobuf.DescriptorProtos.FileDescriptorSet) r0;	 Catch:{ all -> 0x0022 }
                throw r1;	 Catch:{ all -> 0x0018 }
            L_0x0018:
                r1 = move-exception;
                r3 = r1;
                r1 = r0;
                r0 = r3;
            L_0x001c:
                if (r1 == 0) goto L_0x0021;
            L_0x001e:
                r4.mergeFrom(r1);
            L_0x0021:
                throw r0;
            L_0x0022:
                r0 = move-exception;
                r1 = r2;
                goto L_0x001c;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.FileDescriptorSet.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.DescriptorProtos$FileDescriptorSet$Builder");
            }

            private void ensureFileIsMutable() {
                if ((this.bitField0_ & FileDescriptorSet.FILE_FIELD_NUMBER) != FileDescriptorSet.FILE_FIELD_NUMBER) {
                    this.file_ = new ArrayList(this.file_);
                    this.bitField0_ |= FileDescriptorSet.FILE_FIELD_NUMBER;
                }
            }

            public final List<FileDescriptorProto> getFileList() {
                if (this.fileBuilder_ == null) {
                    return Collections.unmodifiableList(this.file_);
                }
                return this.fileBuilder_.getMessageList();
            }

            public final int getFileCount() {
                if (this.fileBuilder_ == null) {
                    return this.file_.size();
                }
                return this.fileBuilder_.getCount();
            }

            public final FileDescriptorProto getFile(int i) {
                if (this.fileBuilder_ == null) {
                    return (FileDescriptorProto) this.file_.get(i);
                }
                return (FileDescriptorProto) this.fileBuilder_.getMessage(i);
            }

            public final Builder setFile(int i, FileDescriptorProto fileDescriptorProto) {
                if (this.fileBuilder_ != null) {
                    this.fileBuilder_.setMessage(i, fileDescriptorProto);
                } else if (fileDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureFileIsMutable();
                    this.file_.set(i, fileDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder setFile(int i, Builder builder) {
                if (this.fileBuilder_ == null) {
                    ensureFileIsMutable();
                    this.file_.set(i, builder.build());
                    onChanged();
                } else {
                    this.fileBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addFile(FileDescriptorProto fileDescriptorProto) {
                if (this.fileBuilder_ != null) {
                    this.fileBuilder_.addMessage(fileDescriptorProto);
                } else if (fileDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureFileIsMutable();
                    this.file_.add(fileDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder addFile(int i, FileDescriptorProto fileDescriptorProto) {
                if (this.fileBuilder_ != null) {
                    this.fileBuilder_.addMessage(i, fileDescriptorProto);
                } else if (fileDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureFileIsMutable();
                    this.file_.add(i, fileDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder addFile(Builder builder) {
                if (this.fileBuilder_ == null) {
                    ensureFileIsMutable();
                    this.file_.add(builder.build());
                    onChanged();
                } else {
                    this.fileBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public final Builder addFile(int i, Builder builder) {
                if (this.fileBuilder_ == null) {
                    ensureFileIsMutable();
                    this.file_.add(i, builder.build());
                    onChanged();
                } else {
                    this.fileBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addAllFile(Iterable<? extends FileDescriptorProto> iterable) {
                if (this.fileBuilder_ == null) {
                    ensureFileIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.file_);
                    onChanged();
                } else {
                    this.fileBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public final Builder clearFile() {
                if (this.fileBuilder_ == null) {
                    this.file_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    this.fileBuilder_.clear();
                }
                return this;
            }

            public final Builder removeFile(int i) {
                if (this.fileBuilder_ == null) {
                    ensureFileIsMutable();
                    this.file_.remove(i);
                    onChanged();
                } else {
                    this.fileBuilder_.remove(i);
                }
                return this;
            }

            public final Builder getFileBuilder(int i) {
                return (Builder) getFileFieldBuilder().getBuilder(i);
            }

            public final FileDescriptorProtoOrBuilder getFileOrBuilder(int i) {
                if (this.fileBuilder_ == null) {
                    return (FileDescriptorProtoOrBuilder) this.file_.get(i);
                }
                return (FileDescriptorProtoOrBuilder) this.fileBuilder_.getMessageOrBuilder(i);
            }

            public final List<? extends FileDescriptorProtoOrBuilder> getFileOrBuilderList() {
                if (this.fileBuilder_ != null) {
                    return this.fileBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.file_);
            }

            public final Builder addFileBuilder() {
                return (Builder) getFileFieldBuilder().addBuilder(FileDescriptorProto.getDefaultInstance());
            }

            public final Builder addFileBuilder(int i) {
                return (Builder) getFileFieldBuilder().addBuilder(i, FileDescriptorProto.getDefaultInstance());
            }

            public final List<Builder> getFileBuilderList() {
                return getFileFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<FileDescriptorProto, Builder, FileDescriptorProtoOrBuilder> getFileFieldBuilder() {
                boolean z = true;
                if (this.fileBuilder_ == null) {
                    List list = this.file_;
                    if ((this.bitField0_ & FileDescriptorSet.FILE_FIELD_NUMBER) != FileDescriptorSet.FILE_FIELD_NUMBER) {
                        z = false;
                    }
                    this.fileBuilder_ = new RepeatedFieldBuilder(list, z, getParentForChildren(), isClean());
                    this.file_ = null;
                }
                return this.fileBuilder_;
            }
        }

        private FileDescriptorSet(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private FileDescriptorSet(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static FileDescriptorSet getDefaultInstance() {
            return defaultInstance;
        }

        public final FileDescriptorSet getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private FileDescriptorSet(com.google.protobuf.CodedInputStream r8, com.google.protobuf.ExtensionRegistryLite r9) {
            /*
            r7 = this;
            r0 = 0;
            r1 = -1;
            r2 = 1;
            r7.<init>();
            r7.memoizedIsInitialized = r1;
            r7.memoizedSerializedSize = r1;
            r7.initFields();
            r3 = com.google.protobuf.UnknownFieldSet.newBuilder();
            r1 = r0;
        L_0x0012:
            if (r1 != 0) goto L_0x005e;
        L_0x0014:
            r4 = r8.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x0074, all -> 0x0086 }
            switch(r4) {
                case 0: goto L_0x0023;
                case 10: goto L_0x0025;
                default: goto L_0x001b;
            };	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x0074, all -> 0x0086 }
        L_0x001b:
            r4 = r7.parseUnknownField(r8, r3, r9, r4);	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x0074, all -> 0x0086 }
            if (r4 != 0) goto L_0x0012;
        L_0x0021:
            r1 = r2;
            goto L_0x0012;
        L_0x0023:
            r1 = r2;
            goto L_0x0012;
        L_0x0025:
            r4 = r0 & 1;
            if (r4 == r2) goto L_0x0032;
        L_0x0029:
            r4 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x0074, all -> 0x0086 }
            r4.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x0074, all -> 0x0086 }
            r7.file_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x0074, all -> 0x0086 }
            r0 = r0 | 1;
        L_0x0032:
            r4 = r7.file_;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x0074, all -> 0x0086 }
            r5 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x0074, all -> 0x0086 }
            r5 = r8.readMessage(r5, r9);	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x0074, all -> 0x0086 }
            r4.add(r5);	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x0074, all -> 0x0086 }
            goto L_0x0012;
        L_0x003e:
            r1 = move-exception;
            r6 = r1;
            r1 = r0;
            r0 = r6;
            r0 = r0.setUnfinishedMessage(r7);	 Catch:{ all -> 0x0047 }
            throw r0;	 Catch:{ all -> 0x0047 }
        L_0x0047:
            r0 = move-exception;
        L_0x0048:
            r1 = r1 & 1;
            if (r1 != r2) goto L_0x0054;
        L_0x004c:
            r1 = r7.file_;
            r1 = java.util.Collections.unmodifiableList(r1);
            r7.file_ = r1;
        L_0x0054:
            r1 = r3.build();
            r7.unknownFields = r1;
            r7.makeExtensionsImmutable();
            throw r0;
        L_0x005e:
            r0 = r0 & 1;
            if (r0 != r2) goto L_0x006a;
        L_0x0062:
            r0 = r7.file_;
            r0 = java.util.Collections.unmodifiableList(r0);
            r7.file_ = r0;
        L_0x006a:
            r0 = r3.build();
            r7.unknownFields = r0;
            r7.makeExtensionsImmutable();
            return;
        L_0x0074:
            r1 = move-exception;
            r6 = r1;
            r1 = r0;
            r0 = r6;
            r4 = new com.google.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x0047 }
            r0 = r0.getMessage();	 Catch:{ all -> 0x0047 }
            r4.<init>(r0);	 Catch:{ all -> 0x0047 }
            r0 = r4.setUnfinishedMessage(r7);	 Catch:{ all -> 0x0047 }
            throw r0;	 Catch:{ all -> 0x0047 }
        L_0x0086:
            r1 = move-exception;
            r6 = r1;
            r1 = r0;
            r0 = r6;
            goto L_0x0048;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.FileDescriptorSet.<init>(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):void");
        }

        public static final Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_FileDescriptorSet_descriptor;
        }

        protected final FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.f2782x15a6a952.ensureFieldAccessorsInitialized(FileDescriptorSet.class, Builder.class);
        }

        static {
            PARSER = new C02901();
            FileDescriptorSet fileDescriptorSet = new FileDescriptorSet(true);
            defaultInstance = fileDescriptorSet;
            fileDescriptorSet.initFields();
        }

        public final Parser<FileDescriptorSet> getParserForType() {
            return PARSER;
        }

        public final List<FileDescriptorProto> getFileList() {
            return this.file_;
        }

        public final List<? extends FileDescriptorProtoOrBuilder> getFileOrBuilderList() {
            return this.file_;
        }

        public final int getFileCount() {
            return this.file_.size();
        }

        public final FileDescriptorProto getFile(int i) {
            return (FileDescriptorProto) this.file_.get(i);
        }

        public final FileDescriptorProtoOrBuilder getFileOrBuilder(int i) {
            return (FileDescriptorProtoOrBuilder) this.file_.get(i);
        }

        private void initFields() {
            this.file_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == null) {
                return false;
            }
            int i = 0;
            while (i < getFileCount()) {
                if (getFile(i).isInitialized()) {
                    i += FILE_FIELD_NUMBER;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i = 0; i < this.file_.size(); i += FILE_FIELD_NUMBER) {
                codedOutputStream.writeMessage(FILE_FIELD_NUMBER, (MessageLite) this.file_.get(i));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public final int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (i = 0; i < this.file_.size(); i += FILE_FIELD_NUMBER) {
                i2 += CodedOutputStream.computeMessageSize(FILE_FIELD_NUMBER, (MessageLite) this.file_.get(i));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + i2;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        protected final Object writeReplace() {
            return super.writeReplace();
        }

        public static FileDescriptorSet parseFrom(ByteString byteString) {
            return (FileDescriptorSet) PARSER.parseFrom(byteString);
        }

        public static FileDescriptorSet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (FileDescriptorSet) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static FileDescriptorSet parseFrom(byte[] bArr) {
            return (FileDescriptorSet) PARSER.parseFrom(bArr);
        }

        public static FileDescriptorSet parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (FileDescriptorSet) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FileDescriptorSet parseFrom(InputStream inputStream) {
            return (FileDescriptorSet) PARSER.parseFrom(inputStream);
        }

        public static FileDescriptorSet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileDescriptorSet) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static FileDescriptorSet parseDelimitedFrom(InputStream inputStream) {
            return (FileDescriptorSet) PARSER.parseDelimitedFrom(inputStream);
        }

        public static FileDescriptorSet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileDescriptorSet) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static FileDescriptorSet parseFrom(CodedInputStream codedInputStream) {
            return (FileDescriptorSet) PARSER.parseFrom(codedInputStream);
        }

        public static FileDescriptorSet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileDescriptorSet) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(FileDescriptorSet fileDescriptorSet) {
            return newBuilder().mergeFrom(fileDescriptorSet);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        protected final Builder newBuilderForType(BuilderParent builderParent) {
            return new Builder(null);
        }
    }

    public interface FileOptionsOrBuilder extends ExtendableMessageOrBuilder<FileOptions> {
        boolean getCcGenericServices();

        boolean getDeprecated();

        String getGoPackage();

        ByteString getGoPackageBytes();

        boolean getJavaGenerateEqualsAndHash();

        boolean getJavaGenericServices();

        boolean getJavaMultipleFiles();

        String getJavaOuterClassname();

        ByteString getJavaOuterClassnameBytes();

        String getJavaPackage();

        ByteString getJavaPackageBytes();

        boolean getJavaStringCheckUtf8();

        OptimizeMode getOptimizeFor();

        boolean getPyGenericServices();

        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i);

        List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList();

        boolean hasCcGenericServices();

        boolean hasDeprecated();

        boolean hasGoPackage();

        boolean hasJavaGenerateEqualsAndHash();

        boolean hasJavaGenericServices();

        boolean hasJavaMultipleFiles();

        boolean hasJavaOuterClassname();

        boolean hasJavaPackage();

        boolean hasJavaStringCheckUtf8();

        boolean hasOptimizeFor();

        boolean hasPyGenericServices();
    }

    public static final class FileOptions extends ExtendableMessage<FileOptions> implements FileOptionsOrBuilder {
        public static final int CC_GENERIC_SERVICES_FIELD_NUMBER = 16;
        public static final int DEPRECATED_FIELD_NUMBER = 23;
        public static final int GO_PACKAGE_FIELD_NUMBER = 11;
        public static final int JAVA_GENERATE_EQUALS_AND_HASH_FIELD_NUMBER = 20;
        public static final int JAVA_GENERIC_SERVICES_FIELD_NUMBER = 17;
        public static final int JAVA_MULTIPLE_FILES_FIELD_NUMBER = 10;
        public static final int JAVA_OUTER_CLASSNAME_FIELD_NUMBER = 8;
        public static final int JAVA_PACKAGE_FIELD_NUMBER = 1;
        public static final int JAVA_STRING_CHECK_UTF8_FIELD_NUMBER = 27;
        public static final int OPTIMIZE_FOR_FIELD_NUMBER = 9;
        public static Parser<FileOptions> PARSER = null;
        public static final int PY_GENERIC_SERVICES_FIELD_NUMBER = 18;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private static final FileOptions defaultInstance;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean ccGenericServices_;
        private boolean deprecated_;
        private Object goPackage_;
        private boolean javaGenerateEqualsAndHash_;
        private boolean javaGenericServices_;
        private boolean javaMultipleFiles_;
        private Object javaOuterClassname_;
        private Object javaPackage_;
        private boolean javaStringCheckUtf8_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private OptimizeMode optimizeFor_;
        private boolean pyGenericServices_;
        private List<UninterpretedOption> uninterpretedOption_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.google.protobuf.DescriptorProtos.FileOptions.1 */
        static class C02911 extends AbstractParser<FileOptions> {
            C02911() {
            }

            public final FileOptions parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new FileOptions(extensionRegistryLite, null);
            }
        }

        public static final class Builder extends ExtendableBuilder<FileOptions, Builder> implements FileOptionsOrBuilder {
            private int bitField0_;
            private boolean ccGenericServices_;
            private boolean deprecated_;
            private Object goPackage_;
            private boolean javaGenerateEqualsAndHash_;
            private boolean javaGenericServices_;
            private boolean javaMultipleFiles_;
            private Object javaOuterClassname_;
            private Object javaPackage_;
            private boolean javaStringCheckUtf8_;
            private OptimizeMode optimizeFor_;
            private boolean pyGenericServices_;
            private RepeatedFieldBuilder<UninterpretedOption, Builder, UninterpretedOptionOrBuilder> uninterpretedOptionBuilder_;
            private List<UninterpretedOption> uninterpretedOption_;

            public static final Descriptor getDescriptor() {
                return DescriptorProtos.internal_static_google_protobuf_FileOptions_descriptor;
            }

            protected final FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.internal_static_google_protobuf_FileOptions_fieldAccessorTable.ensureFieldAccessorsInitialized(FileOptions.class, Builder.class);
            }

            private Builder() {
                this.javaPackage_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.javaOuterClassname_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.optimizeFor_ = OptimizeMode.SPEED;
                this.goPackage_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.uninterpretedOption_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent builderParent) {
                super(builderParent);
                this.javaPackage_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.javaOuterClassname_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.optimizeFor_ = OptimizeMode.SPEED;
                this.goPackage_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.uninterpretedOption_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    getUninterpretedOptionFieldBuilder();
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public final Builder clear() {
                super.clear();
                this.javaPackage_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.bitField0_ &= -2;
                this.javaOuterClassname_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.bitField0_ &= -3;
                this.javaMultipleFiles_ = false;
                this.bitField0_ &= -5;
                this.javaGenerateEqualsAndHash_ = false;
                this.bitField0_ &= -9;
                this.javaStringCheckUtf8_ = false;
                this.bitField0_ &= -17;
                this.optimizeFor_ = OptimizeMode.SPEED;
                this.bitField0_ &= -33;
                this.goPackage_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.bitField0_ &= -65;
                this.ccGenericServices_ = false;
                this.bitField0_ &= -129;
                this.javaGenericServices_ = false;
                this.bitField0_ &= -257;
                this.pyGenericServices_ = false;
                this.bitField0_ &= -513;
                this.deprecated_ = false;
                this.bitField0_ &= -1025;
                if (this.uninterpretedOptionBuilder_ == null) {
                    this.uninterpretedOption_ = Collections.emptyList();
                    this.bitField0_ &= -2049;
                } else {
                    this.uninterpretedOptionBuilder_.clear();
                }
                return this;
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_FileOptions_descriptor;
            }

            public final FileOptions getDefaultInstanceForType() {
                return FileOptions.getDefaultInstance();
            }

            public final FileOptions build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
            }

            public final FileOptions buildPartial() {
                int i = FileOptions.JAVA_PACKAGE_FIELD_NUMBER;
                FileOptions fileOptions = new FileOptions(null);
                int i2 = this.bitField0_;
                if ((i2 & FileOptions.JAVA_PACKAGE_FIELD_NUMBER) != FileOptions.JAVA_PACKAGE_FIELD_NUMBER) {
                    i = 0;
                }
                fileOptions.javaPackage_ = this.javaPackage_;
                if ((i2 & 2) == 2) {
                    i |= 2;
                }
                fileOptions.javaOuterClassname_ = this.javaOuterClassname_;
                if ((i2 & 4) == 4) {
                    i |= 4;
                }
                fileOptions.javaMultipleFiles_ = this.javaMultipleFiles_;
                if ((i2 & FileOptions.JAVA_OUTER_CLASSNAME_FIELD_NUMBER) == FileOptions.JAVA_OUTER_CLASSNAME_FIELD_NUMBER) {
                    i |= FileOptions.JAVA_OUTER_CLASSNAME_FIELD_NUMBER;
                }
                fileOptions.javaGenerateEqualsAndHash_ = this.javaGenerateEqualsAndHash_;
                if ((i2 & FileOptions.CC_GENERIC_SERVICES_FIELD_NUMBER) == FileOptions.CC_GENERIC_SERVICES_FIELD_NUMBER) {
                    i |= FileOptions.CC_GENERIC_SERVICES_FIELD_NUMBER;
                }
                fileOptions.javaStringCheckUtf8_ = this.javaStringCheckUtf8_;
                if ((i2 & 32) == 32) {
                    i |= 32;
                }
                fileOptions.optimizeFor_ = this.optimizeFor_;
                if ((i2 & 64) == 64) {
                    i |= 64;
                }
                fileOptions.goPackage_ = this.goPackage_;
                if ((i2 & AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) == AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) {
                    i |= AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS;
                }
                fileOptions.ccGenericServices_ = this.ccGenericServices_;
                if ((i2 & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
                    i |= AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                }
                fileOptions.javaGenericServices_ = this.javaGenericServices_;
                if ((i2 & AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY) {
                    i |= AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY;
                }
                fileOptions.pyGenericServices_ = this.pyGenericServices_;
                if ((i2 & AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT) == AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT) {
                    i |= AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT;
                }
                fileOptions.deprecated_ = this.deprecated_;
                if (this.uninterpretedOptionBuilder_ == null) {
                    if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT) == AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT) {
                        this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                        this.bitField0_ &= -2049;
                    }
                    fileOptions.uninterpretedOption_ = this.uninterpretedOption_;
                } else {
                    fileOptions.uninterpretedOption_ = this.uninterpretedOptionBuilder_.build();
                }
                fileOptions.bitField0_ = i;
                onBuilt();
                return fileOptions;
            }

            public final Builder mergeFrom(Message message) {
                if (message instanceof FileOptions) {
                    return mergeFrom((FileOptions) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public final Builder mergeFrom(FileOptions fileOptions) {
                RepeatedFieldBuilder repeatedFieldBuilder = null;
                if (fileOptions != FileOptions.getDefaultInstance()) {
                    if (fileOptions.hasJavaPackage()) {
                        this.bitField0_ |= FileOptions.JAVA_PACKAGE_FIELD_NUMBER;
                        this.javaPackage_ = fileOptions.javaPackage_;
                        onChanged();
                    }
                    if (fileOptions.hasJavaOuterClassname()) {
                        this.bitField0_ |= 2;
                        this.javaOuterClassname_ = fileOptions.javaOuterClassname_;
                        onChanged();
                    }
                    if (fileOptions.hasJavaMultipleFiles()) {
                        setJavaMultipleFiles(fileOptions.getJavaMultipleFiles());
                    }
                    if (fileOptions.hasJavaGenerateEqualsAndHash()) {
                        setJavaGenerateEqualsAndHash(fileOptions.getJavaGenerateEqualsAndHash());
                    }
                    if (fileOptions.hasJavaStringCheckUtf8()) {
                        setJavaStringCheckUtf8(fileOptions.getJavaStringCheckUtf8());
                    }
                    if (fileOptions.hasOptimizeFor()) {
                        setOptimizeFor(fileOptions.getOptimizeFor());
                    }
                    if (fileOptions.hasGoPackage()) {
                        this.bitField0_ |= 64;
                        this.goPackage_ = fileOptions.goPackage_;
                        onChanged();
                    }
                    if (fileOptions.hasCcGenericServices()) {
                        setCcGenericServices(fileOptions.getCcGenericServices());
                    }
                    if (fileOptions.hasJavaGenericServices()) {
                        setJavaGenericServices(fileOptions.getJavaGenericServices());
                    }
                    if (fileOptions.hasPyGenericServices()) {
                        setPyGenericServices(fileOptions.getPyGenericServices());
                    }
                    if (fileOptions.hasDeprecated()) {
                        setDeprecated(fileOptions.getDeprecated());
                    }
                    if (this.uninterpretedOptionBuilder_ == null) {
                        if (!fileOptions.uninterpretedOption_.isEmpty()) {
                            if (this.uninterpretedOption_.isEmpty()) {
                                this.uninterpretedOption_ = fileOptions.uninterpretedOption_;
                                this.bitField0_ &= -2049;
                            } else {
                                ensureUninterpretedOptionIsMutable();
                                this.uninterpretedOption_.addAll(fileOptions.uninterpretedOption_);
                            }
                            onChanged();
                        }
                    } else if (!fileOptions.uninterpretedOption_.isEmpty()) {
                        if (this.uninterpretedOptionBuilder_.isEmpty()) {
                            this.uninterpretedOptionBuilder_.dispose();
                            this.uninterpretedOptionBuilder_ = null;
                            this.uninterpretedOption_ = fileOptions.uninterpretedOption_;
                            this.bitField0_ &= -2049;
                            if (GeneratedMessage.alwaysUseFieldBuilders) {
                                repeatedFieldBuilder = getUninterpretedOptionFieldBuilder();
                            }
                            this.uninterpretedOptionBuilder_ = repeatedFieldBuilder;
                        } else {
                            this.uninterpretedOptionBuilder_.addAllMessages(fileOptions.uninterpretedOption_);
                        }
                    }
                    mergeExtensionFields(fileOptions);
                    mergeUnknownFields(fileOptions.getUnknownFields());
                }
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < getUninterpretedOptionCount(); i += FileOptions.JAVA_PACKAGE_FIELD_NUMBER) {
                    if (!getUninterpretedOption(i).isInitialized()) {
                        return false;
                    }
                }
                if (extensionsAreInitialized()) {
                    return true;
                }
                return false;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.google.protobuf.DescriptorProtos.FileOptions.Builder mergeFrom(com.google.protobuf.CodedInputStream r5, com.google.protobuf.ExtensionRegistryLite r6) {
                /*
                r4 = this;
                r2 = 0;
                r0 = com.google.protobuf.DescriptorProtos.FileOptions.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = (com.google.protobuf.DescriptorProtos.FileOptions) r0;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                if (r0 == 0) goto L_0x000e;
            L_0x000b:
                r4.mergeFrom(r0);
            L_0x000e:
                return r4;
            L_0x000f:
                r0 = move-exception;
                r1 = r0;
                r0 = r1.getUnfinishedMessage();	 Catch:{ all -> 0x0022 }
                r0 = (com.google.protobuf.DescriptorProtos.FileOptions) r0;	 Catch:{ all -> 0x0022 }
                throw r1;	 Catch:{ all -> 0x0018 }
            L_0x0018:
                r1 = move-exception;
                r3 = r1;
                r1 = r0;
                r0 = r3;
            L_0x001c:
                if (r1 == 0) goto L_0x0021;
            L_0x001e:
                r4.mergeFrom(r1);
            L_0x0021:
                throw r0;
            L_0x0022:
                r0 = move-exception;
                r1 = r2;
                goto L_0x001c;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.FileOptions.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.DescriptorProtos$FileOptions$Builder");
            }

            public final boolean hasJavaPackage() {
                return (this.bitField0_ & FileOptions.JAVA_PACKAGE_FIELD_NUMBER) == FileOptions.JAVA_PACKAGE_FIELD_NUMBER;
            }

            public final String getJavaPackage() {
                Object obj = this.javaPackage_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String toStringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.javaPackage_ = toStringUtf8;
                }
                return toStringUtf8;
            }

            public final ByteString getJavaPackageBytes() {
                Object obj = this.javaPackage_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.javaPackage_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final Builder setJavaPackage(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= FileOptions.JAVA_PACKAGE_FIELD_NUMBER;
                this.javaPackage_ = str;
                onChanged();
                return this;
            }

            public final Builder clearJavaPackage() {
                this.bitField0_ &= -2;
                this.javaPackage_ = FileOptions.getDefaultInstance().getJavaPackage();
                onChanged();
                return this;
            }

            public final Builder setJavaPackageBytes(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= FileOptions.JAVA_PACKAGE_FIELD_NUMBER;
                this.javaPackage_ = byteString;
                onChanged();
                return this;
            }

            public final boolean hasJavaOuterClassname() {
                return (this.bitField0_ & 2) == 2;
            }

            public final String getJavaOuterClassname() {
                Object obj = this.javaOuterClassname_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String toStringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.javaOuterClassname_ = toStringUtf8;
                }
                return toStringUtf8;
            }

            public final ByteString getJavaOuterClassnameBytes() {
                Object obj = this.javaOuterClassname_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.javaOuterClassname_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final Builder setJavaOuterClassname(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 2;
                this.javaOuterClassname_ = str;
                onChanged();
                return this;
            }

            public final Builder clearJavaOuterClassname() {
                this.bitField0_ &= -3;
                this.javaOuterClassname_ = FileOptions.getDefaultInstance().getJavaOuterClassname();
                onChanged();
                return this;
            }

            public final Builder setJavaOuterClassnameBytes(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 2;
                this.javaOuterClassname_ = byteString;
                onChanged();
                return this;
            }

            public final boolean hasJavaMultipleFiles() {
                return (this.bitField0_ & 4) == 4;
            }

            public final boolean getJavaMultipleFiles() {
                return this.javaMultipleFiles_;
            }

            public final Builder setJavaMultipleFiles(boolean z) {
                this.bitField0_ |= 4;
                this.javaMultipleFiles_ = z;
                onChanged();
                return this;
            }

            public final Builder clearJavaMultipleFiles() {
                this.bitField0_ &= -5;
                this.javaMultipleFiles_ = false;
                onChanged();
                return this;
            }

            public final boolean hasJavaGenerateEqualsAndHash() {
                return (this.bitField0_ & FileOptions.JAVA_OUTER_CLASSNAME_FIELD_NUMBER) == FileOptions.JAVA_OUTER_CLASSNAME_FIELD_NUMBER;
            }

            public final boolean getJavaGenerateEqualsAndHash() {
                return this.javaGenerateEqualsAndHash_;
            }

            public final Builder setJavaGenerateEqualsAndHash(boolean z) {
                this.bitField0_ |= FileOptions.JAVA_OUTER_CLASSNAME_FIELD_NUMBER;
                this.javaGenerateEqualsAndHash_ = z;
                onChanged();
                return this;
            }

            public final Builder clearJavaGenerateEqualsAndHash() {
                this.bitField0_ &= -9;
                this.javaGenerateEqualsAndHash_ = false;
                onChanged();
                return this;
            }

            public final boolean hasJavaStringCheckUtf8() {
                return (this.bitField0_ & FileOptions.CC_GENERIC_SERVICES_FIELD_NUMBER) == FileOptions.CC_GENERIC_SERVICES_FIELD_NUMBER;
            }

            public final boolean getJavaStringCheckUtf8() {
                return this.javaStringCheckUtf8_;
            }

            public final Builder setJavaStringCheckUtf8(boolean z) {
                this.bitField0_ |= FileOptions.CC_GENERIC_SERVICES_FIELD_NUMBER;
                this.javaStringCheckUtf8_ = z;
                onChanged();
                return this;
            }

            public final Builder clearJavaStringCheckUtf8() {
                this.bitField0_ &= -17;
                this.javaStringCheckUtf8_ = false;
                onChanged();
                return this;
            }

            public final boolean hasOptimizeFor() {
                return (this.bitField0_ & 32) == 32;
            }

            public final OptimizeMode getOptimizeFor() {
                return this.optimizeFor_;
            }

            public final Builder setOptimizeFor(OptimizeMode optimizeMode) {
                if (optimizeMode == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 32;
                this.optimizeFor_ = optimizeMode;
                onChanged();
                return this;
            }

            public final Builder clearOptimizeFor() {
                this.bitField0_ &= -33;
                this.optimizeFor_ = OptimizeMode.SPEED;
                onChanged();
                return this;
            }

            public final boolean hasGoPackage() {
                return (this.bitField0_ & 64) == 64;
            }

            public final String getGoPackage() {
                Object obj = this.goPackage_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String toStringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.goPackage_ = toStringUtf8;
                }
                return toStringUtf8;
            }

            public final ByteString getGoPackageBytes() {
                Object obj = this.goPackage_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.goPackage_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final Builder setGoPackage(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 64;
                this.goPackage_ = str;
                onChanged();
                return this;
            }

            public final Builder clearGoPackage() {
                this.bitField0_ &= -65;
                this.goPackage_ = FileOptions.getDefaultInstance().getGoPackage();
                onChanged();
                return this;
            }

            public final Builder setGoPackageBytes(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 64;
                this.goPackage_ = byteString;
                onChanged();
                return this;
            }

            public final boolean hasCcGenericServices() {
                return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) == AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS;
            }

            public final boolean getCcGenericServices() {
                return this.ccGenericServices_;
            }

            public final Builder setCcGenericServices(boolean z) {
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS;
                this.ccGenericServices_ = z;
                onChanged();
                return this;
            }

            public final Builder clearCcGenericServices() {
                this.bitField0_ &= -129;
                this.ccGenericServices_ = false;
                onChanged();
                return this;
            }

            public final boolean hasJavaGenericServices() {
                return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
            }

            public final boolean getJavaGenericServices() {
                return this.javaGenericServices_;
            }

            public final Builder setJavaGenericServices(boolean z) {
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                this.javaGenericServices_ = z;
                onChanged();
                return this;
            }

            public final Builder clearJavaGenericServices() {
                this.bitField0_ &= -257;
                this.javaGenericServices_ = false;
                onChanged();
                return this;
            }

            public final boolean hasPyGenericServices() {
                return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY;
            }

            public final boolean getPyGenericServices() {
                return this.pyGenericServices_;
            }

            public final Builder setPyGenericServices(boolean z) {
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY;
                this.pyGenericServices_ = z;
                onChanged();
                return this;
            }

            public final Builder clearPyGenericServices() {
                this.bitField0_ &= -513;
                this.pyGenericServices_ = false;
                onChanged();
                return this;
            }

            public final boolean hasDeprecated() {
                return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT) == AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT;
            }

            public final boolean getDeprecated() {
                return this.deprecated_;
            }

            public final Builder setDeprecated(boolean z) {
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT;
                this.deprecated_ = z;
                onChanged();
                return this;
            }

            public final Builder clearDeprecated() {
                this.bitField0_ &= -1025;
                this.deprecated_ = false;
                onChanged();
                return this;
            }

            private void ensureUninterpretedOptionIsMutable() {
                if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT) != AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT) {
                    this.uninterpretedOption_ = new ArrayList(this.uninterpretedOption_);
                    this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT;
                }
            }

            public final List<UninterpretedOption> getUninterpretedOptionList() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    return Collections.unmodifiableList(this.uninterpretedOption_);
                }
                return this.uninterpretedOptionBuilder_.getMessageList();
            }

            public final int getUninterpretedOptionCount() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    return this.uninterpretedOption_.size();
                }
                return this.uninterpretedOptionBuilder_.getCount();
            }

            public final UninterpretedOption getUninterpretedOption(int i) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    return (UninterpretedOption) this.uninterpretedOption_.get(i);
                }
                return (UninterpretedOption) this.uninterpretedOptionBuilder_.getMessage(i);
            }

            public final Builder setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
                if (this.uninterpretedOptionBuilder_ != null) {
                    this.uninterpretedOptionBuilder_.setMessage(i, uninterpretedOption);
                } else if (uninterpretedOption == null) {
                    throw new NullPointerException();
                } else {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.set(i, uninterpretedOption);
                    onChanged();
                }
                return this;
            }

            public final Builder setUninterpretedOption(int i, Builder builder) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.set(i, builder.build());
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
                if (this.uninterpretedOptionBuilder_ != null) {
                    this.uninterpretedOptionBuilder_.addMessage(uninterpretedOption);
                } else if (uninterpretedOption == null) {
                    throw new NullPointerException();
                } else {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.add(uninterpretedOption);
                    onChanged();
                }
                return this;
            }

            public final Builder addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
                if (this.uninterpretedOptionBuilder_ != null) {
                    this.uninterpretedOptionBuilder_.addMessage(i, uninterpretedOption);
                } else if (uninterpretedOption == null) {
                    throw new NullPointerException();
                } else {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.add(i, uninterpretedOption);
                    onChanged();
                }
                return this;
            }

            public final Builder addUninterpretedOption(Builder builder) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.add(builder.build());
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public final Builder addUninterpretedOption(int i, Builder builder) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.add(i, builder.build());
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.uninterpretedOption_);
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public final Builder clearUninterpretedOption() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    this.uninterpretedOption_ = Collections.emptyList();
                    this.bitField0_ &= -2049;
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.clear();
                }
                return this;
            }

            public final Builder removeUninterpretedOption(int i) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.remove(i);
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.remove(i);
                }
                return this;
            }

            public final Builder getUninterpretedOptionBuilder(int i) {
                return (Builder) getUninterpretedOptionFieldBuilder().getBuilder(i);
            }

            public final UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    return (UninterpretedOptionOrBuilder) this.uninterpretedOption_.get(i);
                }
                return (UninterpretedOptionOrBuilder) this.uninterpretedOptionBuilder_.getMessageOrBuilder(i);
            }

            public final List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
                if (this.uninterpretedOptionBuilder_ != null) {
                    return this.uninterpretedOptionBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.uninterpretedOption_);
            }

            public final Builder addUninterpretedOptionBuilder() {
                return (Builder) getUninterpretedOptionFieldBuilder().addBuilder(UninterpretedOption.getDefaultInstance());
            }

            public final Builder addUninterpretedOptionBuilder(int i) {
                return (Builder) getUninterpretedOptionFieldBuilder().addBuilder(i, UninterpretedOption.getDefaultInstance());
            }

            public final List<Builder> getUninterpretedOptionBuilderList() {
                return getUninterpretedOptionFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<UninterpretedOption, Builder, UninterpretedOptionOrBuilder> getUninterpretedOptionFieldBuilder() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    this.uninterpretedOptionBuilder_ = new RepeatedFieldBuilder(this.uninterpretedOption_, (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT) == AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT, getParentForChildren(), isClean());
                    this.uninterpretedOption_ = null;
                }
                return this.uninterpretedOptionBuilder_;
            }
        }

        public enum OptimizeMode implements ProtocolMessageEnum {
            SPEED(0, SPEED_VALUE),
            CODE_SIZE(SPEED_VALUE, CODE_SIZE_VALUE),
            LITE_RUNTIME(CODE_SIZE_VALUE, LITE_RUNTIME_VALUE);
            
            public static final int CODE_SIZE_VALUE = 2;
            public static final int LITE_RUNTIME_VALUE = 3;
            public static final int SPEED_VALUE = 1;
            private static final OptimizeMode[] VALUES;
            private static EnumLiteMap<OptimizeMode> internalValueMap;
            private final int index;
            private final int value;

            /* renamed from: com.google.protobuf.DescriptorProtos.FileOptions.OptimizeMode.1 */
            static class C02921 implements EnumLiteMap<OptimizeMode> {
                C02921() {
                }

                public final OptimizeMode findValueByNumber(int i) {
                    return OptimizeMode.valueOf(i);
                }
            }

            static {
                internalValueMap = new C02921();
                VALUES = values();
            }

            public final int getNumber() {
                return this.value;
            }

            public static OptimizeMode valueOf(int i) {
                switch (i) {
                    case SPEED_VALUE:
                        return SPEED;
                    case CODE_SIZE_VALUE:
                        return CODE_SIZE;
                    case LITE_RUNTIME_VALUE:
                        return LITE_RUNTIME;
                    default:
                        return null;
                }
            }

            public static EnumLiteMap<OptimizeMode> internalGetValueMap() {
                return internalValueMap;
            }

            public final EnumValueDescriptor getValueDescriptor() {
                return (EnumValueDescriptor) getDescriptor().getValues().get(this.index);
            }

            public final EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            public static final EnumDescriptor getDescriptor() {
                return (EnumDescriptor) FileOptions.getDescriptor().getEnumTypes().get(0);
            }

            public static OptimizeMode valueOf(EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }

            private OptimizeMode(int i, int i2) {
                this.index = i;
                this.value = i2;
            }
        }

        private FileOptions(ExtendableBuilder<FileOptions, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        private FileOptions(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static FileOptions getDefaultInstance() {
            return defaultInstance;
        }

        public final FileOptions getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private FileOptions(com.google.protobuf.CodedInputStream r9, com.google.protobuf.ExtensionRegistryLite r10) {
            /*
            r8 = this;
            r2 = 1;
            r0 = 0;
            r1 = -1;
            r6 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
            r8.<init>();
            r8.memoizedIsInitialized = r1;
            r8.memoizedSerializedSize = r1;
            r8.initFields();
            r3 = com.google.protobuf.UnknownFieldSet.newBuilder();
            r1 = r0;
        L_0x0014:
            if (r1 != 0) goto L_0x011c;
        L_0x0016:
            r4 = r9.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            switch(r4) {
                case 0: goto L_0x0025;
                case 10: goto L_0x0027;
                case 66: goto L_0x0054;
                case 72: goto L_0x0073;
                case 80: goto L_0x0092;
                case 90: goto L_0x00a0;
                case 128: goto L_0x00ae;
                case 136: goto L_0x00bc;
                case 144: goto L_0x00ca;
                case 160: goto L_0x00d8;
                case 184: goto L_0x00e6;
                case 216: goto L_0x00f4;
                case 7994: goto L_0x0102;
                default: goto L_0x001d;
            };	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
        L_0x001d:
            r4 = r8.parseUnknownField(r9, r3, r10, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            if (r4 != 0) goto L_0x0014;
        L_0x0023:
            r1 = r2;
            goto L_0x0014;
        L_0x0025:
            r1 = r2;
            goto L_0x0014;
        L_0x0027:
            r4 = r9.readBytes();	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r5 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r5 = r5 | 1;
            r8.bitField0_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r8.javaPackage_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            goto L_0x0014;
        L_0x0034:
            r1 = move-exception;
            r7 = r1;
            r1 = r0;
            r0 = r7;
            r0 = r0.setUnfinishedMessage(r8);	 Catch:{ all -> 0x003d }
            throw r0;	 Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception;
        L_0x003e:
            r1 = r1 & 2048;
            if (r1 != r6) goto L_0x004a;
        L_0x0042:
            r1 = r8.uninterpretedOption_;
            r1 = java.util.Collections.unmodifiableList(r1);
            r8.uninterpretedOption_ = r1;
        L_0x004a:
            r1 = r3.build();
            r8.unknownFields = r1;
            r8.makeExtensionsImmutable();
            throw r0;
        L_0x0054:
            r4 = r9.readBytes();	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r5 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r5 = r5 | 2;
            r8.bitField0_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r8.javaOuterClassname_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            goto L_0x0014;
        L_0x0061:
            r1 = move-exception;
            r7 = r1;
            r1 = r0;
            r0 = r7;
            r2 = new com.google.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x003d }
            r0 = r0.getMessage();	 Catch:{ all -> 0x003d }
            r2.<init>(r0);	 Catch:{ all -> 0x003d }
            r0 = r2.setUnfinishedMessage(r8);	 Catch:{ all -> 0x003d }
            throw r0;	 Catch:{ all -> 0x003d }
        L_0x0073:
            r4 = r9.readEnum();	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r5 = com.google.protobuf.DescriptorProtos.FileOptions.OptimizeMode.valueOf(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            if (r5 != 0) goto L_0x0088;
        L_0x007d:
            r5 = 9;
            r3.mergeVarintField(r5, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            goto L_0x0014;
        L_0x0083:
            r1 = move-exception;
            r7 = r1;
            r1 = r0;
            r0 = r7;
            goto L_0x003e;
        L_0x0088:
            r4 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r4 = r4 | 32;
            r8.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r8.optimizeFor_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            goto L_0x0014;
        L_0x0092:
            r4 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r4 = r4 | 4;
            r8.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r4 = r9.readBool();	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r8.javaMultipleFiles_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            goto L_0x0014;
        L_0x00a0:
            r4 = r9.readBytes();	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r5 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r5 = r5 | 64;
            r8.bitField0_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r8.goPackage_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            goto L_0x0014;
        L_0x00ae:
            r4 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r4 = r4 | 128;
            r8.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r4 = r9.readBool();	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r8.ccGenericServices_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            goto L_0x0014;
        L_0x00bc:
            r4 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r4 = r4 | 256;
            r8.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r4 = r9.readBool();	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r8.javaGenericServices_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            goto L_0x0014;
        L_0x00ca:
            r4 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r4 = r4 | 512;
            r8.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r4 = r9.readBool();	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r8.pyGenericServices_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            goto L_0x0014;
        L_0x00d8:
            r4 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r4 = r4 | 8;
            r8.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r4 = r9.readBool();	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r8.javaGenerateEqualsAndHash_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            goto L_0x0014;
        L_0x00e6:
            r4 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r4 = r4 | 1024;
            r8.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r4 = r9.readBool();	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r8.deprecated_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            goto L_0x0014;
        L_0x00f4:
            r4 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r4 = r4 | 16;
            r8.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r4 = r9.readBool();	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r8.javaStringCheckUtf8_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            goto L_0x0014;
        L_0x0102:
            r4 = r0 & 2048;
            if (r4 == r6) goto L_0x010f;
        L_0x0106:
            r4 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r4.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r8.uninterpretedOption_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r0 = r0 | 2048;
        L_0x010f:
            r4 = r8.uninterpretedOption_;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r5 = com.google.protobuf.DescriptorProtos.UninterpretedOption.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r5 = r9.readMessage(r5, r10);	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            r4.add(r5);	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0083 }
            goto L_0x0014;
        L_0x011c:
            r0 = r0 & 2048;
            if (r0 != r6) goto L_0x0128;
        L_0x0120:
            r0 = r8.uninterpretedOption_;
            r0 = java.util.Collections.unmodifiableList(r0);
            r8.uninterpretedOption_ = r0;
        L_0x0128:
            r0 = r3.build();
            r8.unknownFields = r0;
            r8.makeExtensionsImmutable();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.FileOptions.<init>(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):void");
        }

        public static final Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_FileOptions_descriptor;
        }

        protected final FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.internal_static_google_protobuf_FileOptions_fieldAccessorTable.ensureFieldAccessorsInitialized(FileOptions.class, Builder.class);
        }

        static {
            PARSER = new C02911();
            FileOptions fileOptions = new FileOptions(true);
            defaultInstance = fileOptions;
            fileOptions.initFields();
        }

        public final Parser<FileOptions> getParserForType() {
            return PARSER;
        }

        public final boolean hasJavaPackage() {
            return (this.bitField0_ & JAVA_PACKAGE_FIELD_NUMBER) == JAVA_PACKAGE_FIELD_NUMBER;
        }

        public final String getJavaPackage() {
            Object obj = this.javaPackage_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String toStringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.javaPackage_ = toStringUtf8;
            }
            return toStringUtf8;
        }

        public final ByteString getJavaPackageBytes() {
            Object obj = this.javaPackage_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.javaPackage_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean hasJavaOuterClassname() {
            return (this.bitField0_ & 2) == 2;
        }

        public final String getJavaOuterClassname() {
            Object obj = this.javaOuterClassname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String toStringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.javaOuterClassname_ = toStringUtf8;
            }
            return toStringUtf8;
        }

        public final ByteString getJavaOuterClassnameBytes() {
            Object obj = this.javaOuterClassname_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.javaOuterClassname_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean hasJavaMultipleFiles() {
            return (this.bitField0_ & 4) == 4;
        }

        public final boolean getJavaMultipleFiles() {
            return this.javaMultipleFiles_;
        }

        public final boolean hasJavaGenerateEqualsAndHash() {
            return (this.bitField0_ & JAVA_OUTER_CLASSNAME_FIELD_NUMBER) == JAVA_OUTER_CLASSNAME_FIELD_NUMBER;
        }

        public final boolean getJavaGenerateEqualsAndHash() {
            return this.javaGenerateEqualsAndHash_;
        }

        public final boolean hasJavaStringCheckUtf8() {
            return (this.bitField0_ & CC_GENERIC_SERVICES_FIELD_NUMBER) == CC_GENERIC_SERVICES_FIELD_NUMBER;
        }

        public final boolean getJavaStringCheckUtf8() {
            return this.javaStringCheckUtf8_;
        }

        public final boolean hasOptimizeFor() {
            return (this.bitField0_ & 32) == 32;
        }

        public final OptimizeMode getOptimizeFor() {
            return this.optimizeFor_;
        }

        public final boolean hasGoPackage() {
            return (this.bitField0_ & 64) == 64;
        }

        public final String getGoPackage() {
            Object obj = this.goPackage_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String toStringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.goPackage_ = toStringUtf8;
            }
            return toStringUtf8;
        }

        public final ByteString getGoPackageBytes() {
            Object obj = this.goPackage_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.goPackage_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean hasCcGenericServices() {
            return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) == AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS;
        }

        public final boolean getCcGenericServices() {
            return this.ccGenericServices_;
        }

        public final boolean hasJavaGenericServices() {
            return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
        }

        public final boolean getJavaGenericServices() {
            return this.javaGenericServices_;
        }

        public final boolean hasPyGenericServices() {
            return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY;
        }

        public final boolean getPyGenericServices() {
            return this.pyGenericServices_;
        }

        public final boolean hasDeprecated() {
            return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT) == AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT;
        }

        public final boolean getDeprecated() {
            return this.deprecated_;
        }

        public final List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public final List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        public final int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public final UninterpretedOption getUninterpretedOption(int i) {
            return (UninterpretedOption) this.uninterpretedOption_.get(i);
        }

        public final UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i) {
            return (UninterpretedOptionOrBuilder) this.uninterpretedOption_.get(i);
        }

        private void initFields() {
            this.javaPackage_ = LetterIndexBar.SEARCH_ICON_LETTER;
            this.javaOuterClassname_ = LetterIndexBar.SEARCH_ICON_LETTER;
            this.javaMultipleFiles_ = false;
            this.javaGenerateEqualsAndHash_ = false;
            this.javaStringCheckUtf8_ = false;
            this.optimizeFor_ = OptimizeMode.SPEED;
            this.goPackage_ = LetterIndexBar.SEARCH_ICON_LETTER;
            this.ccGenericServices_ = false;
            this.javaGenericServices_ = false;
            this.pyGenericServices_ = false;
            this.deprecated_ = false;
            this.uninterpretedOption_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == null) {
                return false;
            }
            int i = 0;
            while (i < getUninterpretedOptionCount()) {
                if (getUninterpretedOption(i).isInitialized()) {
                    i += JAVA_PACKAGE_FIELD_NUMBER;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & JAVA_PACKAGE_FIELD_NUMBER) == JAVA_PACKAGE_FIELD_NUMBER) {
                codedOutputStream.writeBytes(JAVA_PACKAGE_FIELD_NUMBER, getJavaPackageBytes());
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeBytes(JAVA_OUTER_CLASSNAME_FIELD_NUMBER, getJavaOuterClassnameBytes());
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeEnum(OPTIMIZE_FOR_FIELD_NUMBER, this.optimizeFor_.getNumber());
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeBool(JAVA_MULTIPLE_FILES_FIELD_NUMBER, this.javaMultipleFiles_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.writeBytes(GO_PACKAGE_FIELD_NUMBER, getGoPackageBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) == AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) {
                codedOutputStream.writeBool(CC_GENERIC_SERVICES_FIELD_NUMBER, this.ccGenericServices_);
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
                codedOutputStream.writeBool(JAVA_GENERIC_SERVICES_FIELD_NUMBER, this.javaGenericServices_);
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY) {
                codedOutputStream.writeBool(PY_GENERIC_SERVICES_FIELD_NUMBER, this.pyGenericServices_);
            }
            if ((this.bitField0_ & JAVA_OUTER_CLASSNAME_FIELD_NUMBER) == JAVA_OUTER_CLASSNAME_FIELD_NUMBER) {
                codedOutputStream.writeBool(JAVA_GENERATE_EQUALS_AND_HASH_FIELD_NUMBER, this.javaGenerateEqualsAndHash_);
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT) == AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT) {
                codedOutputStream.writeBool(DEPRECATED_FIELD_NUMBER, this.deprecated_);
            }
            if ((this.bitField0_ & CC_GENERIC_SERVICES_FIELD_NUMBER) == CC_GENERIC_SERVICES_FIELD_NUMBER) {
                codedOutputStream.writeBool(JAVA_STRING_CHECK_UTF8_FIELD_NUMBER, this.javaStringCheckUtf8_);
            }
            for (int i = 0; i < this.uninterpretedOption_.size(); i += JAVA_PACKAGE_FIELD_NUMBER) {
                codedOutputStream.writeMessage(UNINTERPRETED_OPTION_FIELD_NUMBER, (MessageLite) this.uninterpretedOption_.get(i));
            }
            newExtensionWriter.writeUntil(536870912, codedOutputStream);
            getUnknownFields().writeTo(codedOutputStream);
        }

        public final int getSerializedSize() {
            int i = 0;
            int i2 = this.memoizedSerializedSize;
            if (i2 != -1) {
                return i2;
            }
            if ((this.bitField0_ & JAVA_PACKAGE_FIELD_NUMBER) == JAVA_PACKAGE_FIELD_NUMBER) {
                i2 = CodedOutputStream.computeBytesSize(JAVA_PACKAGE_FIELD_NUMBER, getJavaPackageBytes()) + 0;
            } else {
                i2 = 0;
            }
            if ((this.bitField0_ & 2) == 2) {
                i2 += CodedOutputStream.computeBytesSize(JAVA_OUTER_CLASSNAME_FIELD_NUMBER, getJavaOuterClassnameBytes());
            }
            if ((this.bitField0_ & 32) == 32) {
                i2 += CodedOutputStream.computeEnumSize(OPTIMIZE_FOR_FIELD_NUMBER, this.optimizeFor_.getNumber());
            }
            if ((this.bitField0_ & 4) == 4) {
                i2 += CodedOutputStream.computeBoolSize(JAVA_MULTIPLE_FILES_FIELD_NUMBER, this.javaMultipleFiles_);
            }
            if ((this.bitField0_ & 64) == 64) {
                i2 += CodedOutputStream.computeBytesSize(GO_PACKAGE_FIELD_NUMBER, getGoPackageBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) == AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) {
                i2 += CodedOutputStream.computeBoolSize(CC_GENERIC_SERVICES_FIELD_NUMBER, this.ccGenericServices_);
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
                i2 += CodedOutputStream.computeBoolSize(JAVA_GENERIC_SERVICES_FIELD_NUMBER, this.javaGenericServices_);
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY) {
                i2 += CodedOutputStream.computeBoolSize(PY_GENERIC_SERVICES_FIELD_NUMBER, this.pyGenericServices_);
            }
            if ((this.bitField0_ & JAVA_OUTER_CLASSNAME_FIELD_NUMBER) == JAVA_OUTER_CLASSNAME_FIELD_NUMBER) {
                i2 += CodedOutputStream.computeBoolSize(JAVA_GENERATE_EQUALS_AND_HASH_FIELD_NUMBER, this.javaGenerateEqualsAndHash_);
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT) == AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT) {
                i2 += CodedOutputStream.computeBoolSize(DEPRECATED_FIELD_NUMBER, this.deprecated_);
            }
            if ((this.bitField0_ & CC_GENERIC_SERVICES_FIELD_NUMBER) == CC_GENERIC_SERVICES_FIELD_NUMBER) {
                i2 += CodedOutputStream.computeBoolSize(JAVA_STRING_CHECK_UTF8_FIELD_NUMBER, this.javaStringCheckUtf8_);
            }
            int i3 = i2;
            while (i < this.uninterpretedOption_.size()) {
                i += JAVA_PACKAGE_FIELD_NUMBER;
                i3 = CodedOutputStream.computeMessageSize(UNINTERPRETED_OPTION_FIELD_NUMBER, (MessageLite) this.uninterpretedOption_.get(i)) + i3;
            }
            i2 = (extensionsSerializedSize() + i3) + getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = i2;
            return i2;
        }

        protected final Object writeReplace() {
            return super.writeReplace();
        }

        public static FileOptions parseFrom(ByteString byteString) {
            return (FileOptions) PARSER.parseFrom(byteString);
        }

        public static FileOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (FileOptions) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static FileOptions parseFrom(byte[] bArr) {
            return (FileOptions) PARSER.parseFrom(bArr);
        }

        public static FileOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (FileOptions) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FileOptions parseFrom(InputStream inputStream) {
            return (FileOptions) PARSER.parseFrom(inputStream);
        }

        public static FileOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileOptions) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static FileOptions parseDelimitedFrom(InputStream inputStream) {
            return (FileOptions) PARSER.parseDelimitedFrom(inputStream);
        }

        public static FileOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileOptions) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static FileOptions parseFrom(CodedInputStream codedInputStream) {
            return (FileOptions) PARSER.parseFrom(codedInputStream);
        }

        public static FileOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileOptions) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(FileOptions fileOptions) {
            return newBuilder().mergeFrom(fileOptions);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        protected final Builder newBuilderForType(BuilderParent builderParent) {
            return new Builder(null);
        }
    }

    public interface MessageOptionsOrBuilder extends ExtendableMessageOrBuilder<MessageOptions> {
        boolean getDeprecated();

        boolean getMessageSetWireFormat();

        boolean getNoStandardDescriptorAccessor();

        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i);

        List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList();

        boolean hasDeprecated();

        boolean hasMessageSetWireFormat();

        boolean hasNoStandardDescriptorAccessor();
    }

    public static final class MessageOptions extends ExtendableMessage<MessageOptions> implements MessageOptionsOrBuilder {
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        public static final int MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER = 1;
        public static final int NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER = 2;
        public static Parser<MessageOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private static final MessageOptions defaultInstance;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean deprecated_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private boolean messageSetWireFormat_;
        private boolean noStandardDescriptorAccessor_;
        private List<UninterpretedOption> uninterpretedOption_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.google.protobuf.DescriptorProtos.MessageOptions.1 */
        static class C02931 extends AbstractParser<MessageOptions> {
            C02931() {
            }

            public final MessageOptions parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new MessageOptions(extensionRegistryLite, null);
            }
        }

        public static final class Builder extends ExtendableBuilder<MessageOptions, Builder> implements MessageOptionsOrBuilder {
            private int bitField0_;
            private boolean deprecated_;
            private boolean messageSetWireFormat_;
            private boolean noStandardDescriptorAccessor_;
            private RepeatedFieldBuilder<UninterpretedOption, Builder, UninterpretedOptionOrBuilder> uninterpretedOptionBuilder_;
            private List<UninterpretedOption> uninterpretedOption_;

            public static final Descriptor getDescriptor() {
                return DescriptorProtos.internal_static_google_protobuf_MessageOptions_descriptor;
            }

            protected final FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.f2783x9c0b3d38.ensureFieldAccessorsInitialized(MessageOptions.class, Builder.class);
            }

            private Builder() {
                this.uninterpretedOption_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent builderParent) {
                super(builderParent);
                this.uninterpretedOption_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    getUninterpretedOptionFieldBuilder();
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public final Builder clear() {
                super.clear();
                this.messageSetWireFormat_ = false;
                this.bitField0_ &= -2;
                this.noStandardDescriptorAccessor_ = false;
                this.bitField0_ &= -3;
                this.deprecated_ = false;
                this.bitField0_ &= -5;
                if (this.uninterpretedOptionBuilder_ == null) {
                    this.uninterpretedOption_ = Collections.emptyList();
                    this.bitField0_ &= -9;
                } else {
                    this.uninterpretedOptionBuilder_.clear();
                }
                return this;
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_MessageOptions_descriptor;
            }

            public final MessageOptions getDefaultInstanceForType() {
                return MessageOptions.getDefaultInstance();
            }

            public final MessageOptions build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
            }

            public final MessageOptions buildPartial() {
                int i = MessageOptions.MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER;
                MessageOptions messageOptions = new MessageOptions(null);
                int i2 = this.bitField0_;
                if ((i2 & MessageOptions.MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER) != MessageOptions.MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER) {
                    i = 0;
                }
                messageOptions.messageSetWireFormat_ = this.messageSetWireFormat_;
                if ((i2 & MessageOptions.NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER) == MessageOptions.NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER) {
                    i |= MessageOptions.NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER;
                }
                messageOptions.noStandardDescriptorAccessor_ = this.noStandardDescriptorAccessor_;
                if ((i2 & 4) == 4) {
                    i |= 4;
                }
                messageOptions.deprecated_ = this.deprecated_;
                if (this.uninterpretedOptionBuilder_ == null) {
                    if ((this.bitField0_ & 8) == 8) {
                        this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                        this.bitField0_ &= -9;
                    }
                    messageOptions.uninterpretedOption_ = this.uninterpretedOption_;
                } else {
                    messageOptions.uninterpretedOption_ = this.uninterpretedOptionBuilder_.build();
                }
                messageOptions.bitField0_ = i;
                onBuilt();
                return messageOptions;
            }

            public final Builder mergeFrom(Message message) {
                if (message instanceof MessageOptions) {
                    return mergeFrom((MessageOptions) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public final Builder mergeFrom(MessageOptions messageOptions) {
                RepeatedFieldBuilder repeatedFieldBuilder = null;
                if (messageOptions != MessageOptions.getDefaultInstance()) {
                    if (messageOptions.hasMessageSetWireFormat()) {
                        setMessageSetWireFormat(messageOptions.getMessageSetWireFormat());
                    }
                    if (messageOptions.hasNoStandardDescriptorAccessor()) {
                        setNoStandardDescriptorAccessor(messageOptions.getNoStandardDescriptorAccessor());
                    }
                    if (messageOptions.hasDeprecated()) {
                        setDeprecated(messageOptions.getDeprecated());
                    }
                    if (this.uninterpretedOptionBuilder_ == null) {
                        if (!messageOptions.uninterpretedOption_.isEmpty()) {
                            if (this.uninterpretedOption_.isEmpty()) {
                                this.uninterpretedOption_ = messageOptions.uninterpretedOption_;
                                this.bitField0_ &= -9;
                            } else {
                                ensureUninterpretedOptionIsMutable();
                                this.uninterpretedOption_.addAll(messageOptions.uninterpretedOption_);
                            }
                            onChanged();
                        }
                    } else if (!messageOptions.uninterpretedOption_.isEmpty()) {
                        if (this.uninterpretedOptionBuilder_.isEmpty()) {
                            this.uninterpretedOptionBuilder_.dispose();
                            this.uninterpretedOptionBuilder_ = null;
                            this.uninterpretedOption_ = messageOptions.uninterpretedOption_;
                            this.bitField0_ &= -9;
                            if (GeneratedMessage.alwaysUseFieldBuilders) {
                                repeatedFieldBuilder = getUninterpretedOptionFieldBuilder();
                            }
                            this.uninterpretedOptionBuilder_ = repeatedFieldBuilder;
                        } else {
                            this.uninterpretedOptionBuilder_.addAllMessages(messageOptions.uninterpretedOption_);
                        }
                    }
                    mergeExtensionFields(messageOptions);
                    mergeUnknownFields(messageOptions.getUnknownFields());
                }
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < getUninterpretedOptionCount(); i += MessageOptions.MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER) {
                    if (!getUninterpretedOption(i).isInitialized()) {
                        return false;
                    }
                }
                if (extensionsAreInitialized()) {
                    return true;
                }
                return false;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.google.protobuf.DescriptorProtos.MessageOptions.Builder mergeFrom(com.google.protobuf.CodedInputStream r5, com.google.protobuf.ExtensionRegistryLite r6) {
                /*
                r4 = this;
                r2 = 0;
                r0 = com.google.protobuf.DescriptorProtos.MessageOptions.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = (com.google.protobuf.DescriptorProtos.MessageOptions) r0;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                if (r0 == 0) goto L_0x000e;
            L_0x000b:
                r4.mergeFrom(r0);
            L_0x000e:
                return r4;
            L_0x000f:
                r0 = move-exception;
                r1 = r0;
                r0 = r1.getUnfinishedMessage();	 Catch:{ all -> 0x0022 }
                r0 = (com.google.protobuf.DescriptorProtos.MessageOptions) r0;	 Catch:{ all -> 0x0022 }
                throw r1;	 Catch:{ all -> 0x0018 }
            L_0x0018:
                r1 = move-exception;
                r3 = r1;
                r1 = r0;
                r0 = r3;
            L_0x001c:
                if (r1 == 0) goto L_0x0021;
            L_0x001e:
                r4.mergeFrom(r1);
            L_0x0021:
                throw r0;
            L_0x0022:
                r0 = move-exception;
                r1 = r2;
                goto L_0x001c;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.MessageOptions.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.DescriptorProtos$MessageOptions$Builder");
            }

            public final boolean hasMessageSetWireFormat() {
                return (this.bitField0_ & MessageOptions.MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER) == MessageOptions.MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER;
            }

            public final boolean getMessageSetWireFormat() {
                return this.messageSetWireFormat_;
            }

            public final Builder setMessageSetWireFormat(boolean z) {
                this.bitField0_ |= MessageOptions.MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER;
                this.messageSetWireFormat_ = z;
                onChanged();
                return this;
            }

            public final Builder clearMessageSetWireFormat() {
                this.bitField0_ &= -2;
                this.messageSetWireFormat_ = false;
                onChanged();
                return this;
            }

            public final boolean hasNoStandardDescriptorAccessor() {
                return (this.bitField0_ & MessageOptions.NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER) == MessageOptions.NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER;
            }

            public final boolean getNoStandardDescriptorAccessor() {
                return this.noStandardDescriptorAccessor_;
            }

            public final Builder setNoStandardDescriptorAccessor(boolean z) {
                this.bitField0_ |= MessageOptions.NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER;
                this.noStandardDescriptorAccessor_ = z;
                onChanged();
                return this;
            }

            public final Builder clearNoStandardDescriptorAccessor() {
                this.bitField0_ &= -3;
                this.noStandardDescriptorAccessor_ = false;
                onChanged();
                return this;
            }

            public final boolean hasDeprecated() {
                return (this.bitField0_ & 4) == 4;
            }

            public final boolean getDeprecated() {
                return this.deprecated_;
            }

            public final Builder setDeprecated(boolean z) {
                this.bitField0_ |= 4;
                this.deprecated_ = z;
                onChanged();
                return this;
            }

            public final Builder clearDeprecated() {
                this.bitField0_ &= -5;
                this.deprecated_ = false;
                onChanged();
                return this;
            }

            private void ensureUninterpretedOptionIsMutable() {
                if ((this.bitField0_ & 8) != 8) {
                    this.uninterpretedOption_ = new ArrayList(this.uninterpretedOption_);
                    this.bitField0_ |= 8;
                }
            }

            public final List<UninterpretedOption> getUninterpretedOptionList() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    return Collections.unmodifiableList(this.uninterpretedOption_);
                }
                return this.uninterpretedOptionBuilder_.getMessageList();
            }

            public final int getUninterpretedOptionCount() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    return this.uninterpretedOption_.size();
                }
                return this.uninterpretedOptionBuilder_.getCount();
            }

            public final UninterpretedOption getUninterpretedOption(int i) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    return (UninterpretedOption) this.uninterpretedOption_.get(i);
                }
                return (UninterpretedOption) this.uninterpretedOptionBuilder_.getMessage(i);
            }

            public final Builder setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
                if (this.uninterpretedOptionBuilder_ != null) {
                    this.uninterpretedOptionBuilder_.setMessage(i, uninterpretedOption);
                } else if (uninterpretedOption == null) {
                    throw new NullPointerException();
                } else {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.set(i, uninterpretedOption);
                    onChanged();
                }
                return this;
            }

            public final Builder setUninterpretedOption(int i, Builder builder) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.set(i, builder.build());
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
                if (this.uninterpretedOptionBuilder_ != null) {
                    this.uninterpretedOptionBuilder_.addMessage(uninterpretedOption);
                } else if (uninterpretedOption == null) {
                    throw new NullPointerException();
                } else {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.add(uninterpretedOption);
                    onChanged();
                }
                return this;
            }

            public final Builder addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
                if (this.uninterpretedOptionBuilder_ != null) {
                    this.uninterpretedOptionBuilder_.addMessage(i, uninterpretedOption);
                } else if (uninterpretedOption == null) {
                    throw new NullPointerException();
                } else {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.add(i, uninterpretedOption);
                    onChanged();
                }
                return this;
            }

            public final Builder addUninterpretedOption(Builder builder) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.add(builder.build());
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public final Builder addUninterpretedOption(int i, Builder builder) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.add(i, builder.build());
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.uninterpretedOption_);
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public final Builder clearUninterpretedOption() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    this.uninterpretedOption_ = Collections.emptyList();
                    this.bitField0_ &= -9;
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.clear();
                }
                return this;
            }

            public final Builder removeUninterpretedOption(int i) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.remove(i);
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.remove(i);
                }
                return this;
            }

            public final Builder getUninterpretedOptionBuilder(int i) {
                return (Builder) getUninterpretedOptionFieldBuilder().getBuilder(i);
            }

            public final UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    return (UninterpretedOptionOrBuilder) this.uninterpretedOption_.get(i);
                }
                return (UninterpretedOptionOrBuilder) this.uninterpretedOptionBuilder_.getMessageOrBuilder(i);
            }

            public final List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
                if (this.uninterpretedOptionBuilder_ != null) {
                    return this.uninterpretedOptionBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.uninterpretedOption_);
            }

            public final Builder addUninterpretedOptionBuilder() {
                return (Builder) getUninterpretedOptionFieldBuilder().addBuilder(UninterpretedOption.getDefaultInstance());
            }

            public final Builder addUninterpretedOptionBuilder(int i) {
                return (Builder) getUninterpretedOptionFieldBuilder().addBuilder(i, UninterpretedOption.getDefaultInstance());
            }

            public final List<Builder> getUninterpretedOptionBuilderList() {
                return getUninterpretedOptionFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<UninterpretedOption, Builder, UninterpretedOptionOrBuilder> getUninterpretedOptionFieldBuilder() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    this.uninterpretedOptionBuilder_ = new RepeatedFieldBuilder(this.uninterpretedOption_, (this.bitField0_ & 8) == 8, getParentForChildren(), isClean());
                    this.uninterpretedOption_ = null;
                }
                return this.uninterpretedOptionBuilder_;
            }
        }

        private MessageOptions(ExtendableBuilder<MessageOptions, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        private MessageOptions(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static MessageOptions getDefaultInstance() {
            return defaultInstance;
        }

        public final MessageOptions getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private MessageOptions(com.google.protobuf.CodedInputStream r9, com.google.protobuf.ExtensionRegistryLite r10) {
            /*
            r8 = this;
            r2 = 1;
            r0 = 0;
            r1 = -1;
            r6 = 8;
            r8.<init>();
            r8.memoizedIsInitialized = r1;
            r8.memoizedSerializedSize = r1;
            r8.initFields();
            r3 = com.google.protobuf.UnknownFieldSet.newBuilder();
            r1 = r0;
        L_0x0014:
            if (r1 != 0) goto L_0x009f;
        L_0x0016:
            r4 = r9.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0080 }
            switch(r4) {
                case 0: goto L_0x0025;
                case 8: goto L_0x0027;
                case 16: goto L_0x0054;
                case 24: goto L_0x0073;
                case 7994: goto L_0x0085;
                default: goto L_0x001d;
            };	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0080 }
        L_0x001d:
            r4 = r8.parseUnknownField(r9, r3, r10, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0080 }
            if (r4 != 0) goto L_0x0014;
        L_0x0023:
            r1 = r2;
            goto L_0x0014;
        L_0x0025:
            r1 = r2;
            goto L_0x0014;
        L_0x0027:
            r4 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0080 }
            r4 = r4 | 1;
            r8.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0080 }
            r4 = r9.readBool();	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0080 }
            r8.messageSetWireFormat_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0080 }
            goto L_0x0014;
        L_0x0034:
            r1 = move-exception;
            r7 = r1;
            r1 = r0;
            r0 = r7;
            r0 = r0.setUnfinishedMessage(r8);	 Catch:{ all -> 0x003d }
            throw r0;	 Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception;
        L_0x003e:
            r1 = r1 & 8;
            if (r1 != r6) goto L_0x004a;
        L_0x0042:
            r1 = r8.uninterpretedOption_;
            r1 = java.util.Collections.unmodifiableList(r1);
            r8.uninterpretedOption_ = r1;
        L_0x004a:
            r1 = r3.build();
            r8.unknownFields = r1;
            r8.makeExtensionsImmutable();
            throw r0;
        L_0x0054:
            r4 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0080 }
            r4 = r4 | 2;
            r8.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0080 }
            r4 = r9.readBool();	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0080 }
            r8.noStandardDescriptorAccessor_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0080 }
            goto L_0x0014;
        L_0x0061:
            r1 = move-exception;
            r7 = r1;
            r1 = r0;
            r0 = r7;
            r2 = new com.google.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x003d }
            r0 = r0.getMessage();	 Catch:{ all -> 0x003d }
            r2.<init>(r0);	 Catch:{ all -> 0x003d }
            r0 = r2.setUnfinishedMessage(r8);	 Catch:{ all -> 0x003d }
            throw r0;	 Catch:{ all -> 0x003d }
        L_0x0073:
            r4 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0080 }
            r4 = r4 | 4;
            r8.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0080 }
            r4 = r9.readBool();	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0080 }
            r8.deprecated_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0080 }
            goto L_0x0014;
        L_0x0080:
            r1 = move-exception;
            r7 = r1;
            r1 = r0;
            r0 = r7;
            goto L_0x003e;
        L_0x0085:
            r4 = r0 & 8;
            if (r4 == r6) goto L_0x0092;
        L_0x0089:
            r4 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0080 }
            r4.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0080 }
            r8.uninterpretedOption_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0080 }
            r0 = r0 | 8;
        L_0x0092:
            r4 = r8.uninterpretedOption_;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0080 }
            r5 = com.google.protobuf.DescriptorProtos.UninterpretedOption.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0080 }
            r5 = r9.readMessage(r5, r10);	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0080 }
            r4.add(r5);	 Catch:{ InvalidProtocolBufferException -> 0x0034, IOException -> 0x0061, all -> 0x0080 }
            goto L_0x0014;
        L_0x009f:
            r0 = r0 & 8;
            if (r0 != r6) goto L_0x00ab;
        L_0x00a3:
            r0 = r8.uninterpretedOption_;
            r0 = java.util.Collections.unmodifiableList(r0);
            r8.uninterpretedOption_ = r0;
        L_0x00ab:
            r0 = r3.build();
            r8.unknownFields = r0;
            r8.makeExtensionsImmutable();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.MessageOptions.<init>(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):void");
        }

        public static final Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_MessageOptions_descriptor;
        }

        protected final FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.f2783x9c0b3d38.ensureFieldAccessorsInitialized(MessageOptions.class, Builder.class);
        }

        static {
            PARSER = new C02931();
            MessageOptions messageOptions = new MessageOptions(true);
            defaultInstance = messageOptions;
            messageOptions.initFields();
        }

        public final Parser<MessageOptions> getParserForType() {
            return PARSER;
        }

        public final boolean hasMessageSetWireFormat() {
            return (this.bitField0_ & MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER) == MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER;
        }

        public final boolean getMessageSetWireFormat() {
            return this.messageSetWireFormat_;
        }

        public final boolean hasNoStandardDescriptorAccessor() {
            return (this.bitField0_ & NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER) == NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER;
        }

        public final boolean getNoStandardDescriptorAccessor() {
            return this.noStandardDescriptorAccessor_;
        }

        public final boolean hasDeprecated() {
            return (this.bitField0_ & 4) == 4;
        }

        public final boolean getDeprecated() {
            return this.deprecated_;
        }

        public final List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public final List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        public final int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public final UninterpretedOption getUninterpretedOption(int i) {
            return (UninterpretedOption) this.uninterpretedOption_.get(i);
        }

        public final UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i) {
            return (UninterpretedOptionOrBuilder) this.uninterpretedOption_.get(i);
        }

        private void initFields() {
            this.messageSetWireFormat_ = false;
            this.noStandardDescriptorAccessor_ = false;
            this.deprecated_ = false;
            this.uninterpretedOption_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == null) {
                return false;
            }
            int i = 0;
            while (i < getUninterpretedOptionCount()) {
                if (getUninterpretedOption(i).isInitialized()) {
                    i += MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER) == MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER) {
                codedOutputStream.writeBool(MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER, this.messageSetWireFormat_);
            }
            if ((this.bitField0_ & NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER) == NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER) {
                codedOutputStream.writeBool(NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER, this.noStandardDescriptorAccessor_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeBool(DEPRECATED_FIELD_NUMBER, this.deprecated_);
            }
            for (int i = 0; i < this.uninterpretedOption_.size(); i += MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER) {
                codedOutputStream.writeMessage(UNINTERPRETED_OPTION_FIELD_NUMBER, (MessageLite) this.uninterpretedOption_.get(i));
            }
            newExtensionWriter.writeUntil(536870912, codedOutputStream);
            getUnknownFields().writeTo(codedOutputStream);
        }

        public final int getSerializedSize() {
            int i = 0;
            int i2 = this.memoizedSerializedSize;
            if (i2 != -1) {
                return i2;
            }
            if ((this.bitField0_ & MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER) == MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER) {
                i2 = CodedOutputStream.computeBoolSize(MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER, this.messageSetWireFormat_) + 0;
            } else {
                i2 = 0;
            }
            if ((this.bitField0_ & NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER) == NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER) {
                i2 += CodedOutputStream.computeBoolSize(NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER, this.noStandardDescriptorAccessor_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i2 += CodedOutputStream.computeBoolSize(DEPRECATED_FIELD_NUMBER, this.deprecated_);
            }
            int i3 = i2;
            while (i < this.uninterpretedOption_.size()) {
                i += MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER;
                i3 = CodedOutputStream.computeMessageSize(UNINTERPRETED_OPTION_FIELD_NUMBER, (MessageLite) this.uninterpretedOption_.get(i)) + i3;
            }
            i2 = (extensionsSerializedSize() + i3) + getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = i2;
            return i2;
        }

        protected final Object writeReplace() {
            return super.writeReplace();
        }

        public static MessageOptions parseFrom(ByteString byteString) {
            return (MessageOptions) PARSER.parseFrom(byteString);
        }

        public static MessageOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MessageOptions) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static MessageOptions parseFrom(byte[] bArr) {
            return (MessageOptions) PARSER.parseFrom(bArr);
        }

        public static MessageOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MessageOptions) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static MessageOptions parseFrom(InputStream inputStream) {
            return (MessageOptions) PARSER.parseFrom(inputStream);
        }

        public static MessageOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MessageOptions) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static MessageOptions parseDelimitedFrom(InputStream inputStream) {
            return (MessageOptions) PARSER.parseDelimitedFrom(inputStream);
        }

        public static MessageOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MessageOptions) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static MessageOptions parseFrom(CodedInputStream codedInputStream) {
            return (MessageOptions) PARSER.parseFrom(codedInputStream);
        }

        public static MessageOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MessageOptions) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(MessageOptions messageOptions) {
            return newBuilder().mergeFrom(messageOptions);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        protected final Builder newBuilderForType(BuilderParent builderParent) {
            return new Builder(null);
        }
    }

    public interface MethodDescriptorProtoOrBuilder extends MessageOrBuilder {
        String getInputType();

        ByteString getInputTypeBytes();

        String getName();

        ByteString getNameBytes();

        MethodOptions getOptions();

        MethodOptionsOrBuilder getOptionsOrBuilder();

        String getOutputType();

        ByteString getOutputTypeBytes();

        boolean hasInputType();

        boolean hasName();

        boolean hasOptions();

        boolean hasOutputType();
    }

    public static final class MethodDescriptorProto extends GeneratedMessage implements MethodDescriptorProtoOrBuilder {
        public static final int INPUT_TYPE_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 4;
        public static final int OUTPUT_TYPE_FIELD_NUMBER = 3;
        public static Parser<MethodDescriptorProto> PARSER;
        private static final MethodDescriptorProto defaultInstance;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private Object inputType_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object name_;
        private MethodOptions options_;
        private Object outputType_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.google.protobuf.DescriptorProtos.MethodDescriptorProto.1 */
        static class C02941 extends AbstractParser<MethodDescriptorProto> {
            C02941() {
            }

            public final MethodDescriptorProto parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new MethodDescriptorProto(extensionRegistryLite, null);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements MethodDescriptorProtoOrBuilder {
            private int bitField0_;
            private Object inputType_;
            private Object name_;
            private SingleFieldBuilder<MethodOptions, Builder, MethodOptionsOrBuilder> optionsBuilder_;
            private MethodOptions options_;
            private Object outputType_;

            public static final Descriptor getDescriptor() {
                return DescriptorProtos.internal_static_google_protobuf_MethodDescriptorProto_descriptor;
            }

            protected final FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.f2784xc5331ef1.ensureFieldAccessorsInitialized(MethodDescriptorProto.class, Builder.class);
            }

            private Builder() {
                this.name_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.inputType_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.outputType_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.options_ = MethodOptions.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent builderParent) {
                super(builderParent);
                this.name_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.inputType_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.outputType_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.options_ = MethodOptions.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    getOptionsFieldBuilder();
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public final Builder clear() {
                super.clear();
                this.name_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.bitField0_ &= -2;
                this.inputType_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.bitField0_ &= -3;
                this.outputType_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.bitField0_ &= -5;
                if (this.optionsBuilder_ == null) {
                    this.options_ = MethodOptions.getDefaultInstance();
                } else {
                    this.optionsBuilder_.clear();
                }
                this.bitField0_ &= -9;
                return this;
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_MethodDescriptorProto_descriptor;
            }

            public final MethodDescriptorProto getDefaultInstanceForType() {
                return MethodDescriptorProto.getDefaultInstance();
            }

            public final MethodDescriptorProto build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
            }

            public final MethodDescriptorProto buildPartial() {
                int i;
                int i2 = MethodDescriptorProto.NAME_FIELD_NUMBER;
                MethodDescriptorProto methodDescriptorProto = new MethodDescriptorProto(null);
                int i3 = this.bitField0_;
                if ((i3 & MethodDescriptorProto.NAME_FIELD_NUMBER) != MethodDescriptorProto.NAME_FIELD_NUMBER) {
                    i2 = 0;
                }
                methodDescriptorProto.name_ = this.name_;
                if ((i3 & MethodDescriptorProto.INPUT_TYPE_FIELD_NUMBER) == MethodDescriptorProto.INPUT_TYPE_FIELD_NUMBER) {
                    i2 |= MethodDescriptorProto.INPUT_TYPE_FIELD_NUMBER;
                }
                methodDescriptorProto.inputType_ = this.inputType_;
                if ((i3 & MethodDescriptorProto.OPTIONS_FIELD_NUMBER) == MethodDescriptorProto.OPTIONS_FIELD_NUMBER) {
                    i2 |= MethodDescriptorProto.OPTIONS_FIELD_NUMBER;
                }
                methodDescriptorProto.outputType_ = this.outputType_;
                if ((i3 & 8) == 8) {
                    i = i2 | 8;
                } else {
                    i = i2;
                }
                if (this.optionsBuilder_ == null) {
                    methodDescriptorProto.options_ = this.options_;
                } else {
                    methodDescriptorProto.options_ = (MethodOptions) this.optionsBuilder_.build();
                }
                methodDescriptorProto.bitField0_ = i;
                onBuilt();
                return methodDescriptorProto;
            }

            public final Builder mergeFrom(Message message) {
                if (message instanceof MethodDescriptorProto) {
                    return mergeFrom((MethodDescriptorProto) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public final Builder mergeFrom(MethodDescriptorProto methodDescriptorProto) {
                if (methodDescriptorProto != MethodDescriptorProto.getDefaultInstance()) {
                    if (methodDescriptorProto.hasName()) {
                        this.bitField0_ |= MethodDescriptorProto.NAME_FIELD_NUMBER;
                        this.name_ = methodDescriptorProto.name_;
                        onChanged();
                    }
                    if (methodDescriptorProto.hasInputType()) {
                        this.bitField0_ |= MethodDescriptorProto.INPUT_TYPE_FIELD_NUMBER;
                        this.inputType_ = methodDescriptorProto.inputType_;
                        onChanged();
                    }
                    if (methodDescriptorProto.hasOutputType()) {
                        this.bitField0_ |= MethodDescriptorProto.OPTIONS_FIELD_NUMBER;
                        this.outputType_ = methodDescriptorProto.outputType_;
                        onChanged();
                    }
                    if (methodDescriptorProto.hasOptions()) {
                        mergeOptions(methodDescriptorProto.getOptions());
                    }
                    mergeUnknownFields(methodDescriptorProto.getUnknownFields());
                }
                return this;
            }

            public final boolean isInitialized() {
                if (!hasOptions() || getOptions().isInitialized()) {
                    return true;
                }
                return false;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder mergeFrom(com.google.protobuf.CodedInputStream r5, com.google.protobuf.ExtensionRegistryLite r6) {
                /*
                r4 = this;
                r2 = 0;
                r0 = com.google.protobuf.DescriptorProtos.MethodDescriptorProto.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = (com.google.protobuf.DescriptorProtos.MethodDescriptorProto) r0;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                if (r0 == 0) goto L_0x000e;
            L_0x000b:
                r4.mergeFrom(r0);
            L_0x000e:
                return r4;
            L_0x000f:
                r0 = move-exception;
                r1 = r0;
                r0 = r1.getUnfinishedMessage();	 Catch:{ all -> 0x0022 }
                r0 = (com.google.protobuf.DescriptorProtos.MethodDescriptorProto) r0;	 Catch:{ all -> 0x0022 }
                throw r1;	 Catch:{ all -> 0x0018 }
            L_0x0018:
                r1 = move-exception;
                r3 = r1;
                r1 = r0;
                r0 = r3;
            L_0x001c:
                if (r1 == 0) goto L_0x0021;
            L_0x001e:
                r4.mergeFrom(r1);
            L_0x0021:
                throw r0;
            L_0x0022:
                r0 = move-exception;
                r1 = r2;
                goto L_0x001c;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.DescriptorProtos$MethodDescriptorProto$Builder");
            }

            public final boolean hasName() {
                return (this.bitField0_ & MethodDescriptorProto.NAME_FIELD_NUMBER) == MethodDescriptorProto.NAME_FIELD_NUMBER;
            }

            public final String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String toStringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.name_ = toStringUtf8;
                }
                return toStringUtf8;
            }

            public final ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final Builder setName(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= MethodDescriptorProto.NAME_FIELD_NUMBER;
                this.name_ = str;
                onChanged();
                return this;
            }

            public final Builder clearName() {
                this.bitField0_ &= -2;
                this.name_ = MethodDescriptorProto.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public final Builder setNameBytes(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= MethodDescriptorProto.NAME_FIELD_NUMBER;
                this.name_ = byteString;
                onChanged();
                return this;
            }

            public final boolean hasInputType() {
                return (this.bitField0_ & MethodDescriptorProto.INPUT_TYPE_FIELD_NUMBER) == MethodDescriptorProto.INPUT_TYPE_FIELD_NUMBER;
            }

            public final String getInputType() {
                Object obj = this.inputType_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String toStringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.inputType_ = toStringUtf8;
                }
                return toStringUtf8;
            }

            public final ByteString getInputTypeBytes() {
                Object obj = this.inputType_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.inputType_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final Builder setInputType(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= MethodDescriptorProto.INPUT_TYPE_FIELD_NUMBER;
                this.inputType_ = str;
                onChanged();
                return this;
            }

            public final Builder clearInputType() {
                this.bitField0_ &= -3;
                this.inputType_ = MethodDescriptorProto.getDefaultInstance().getInputType();
                onChanged();
                return this;
            }

            public final Builder setInputTypeBytes(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= MethodDescriptorProto.INPUT_TYPE_FIELD_NUMBER;
                this.inputType_ = byteString;
                onChanged();
                return this;
            }

            public final boolean hasOutputType() {
                return (this.bitField0_ & MethodDescriptorProto.OPTIONS_FIELD_NUMBER) == MethodDescriptorProto.OPTIONS_FIELD_NUMBER;
            }

            public final String getOutputType() {
                Object obj = this.outputType_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String toStringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.outputType_ = toStringUtf8;
                }
                return toStringUtf8;
            }

            public final ByteString getOutputTypeBytes() {
                Object obj = this.outputType_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.outputType_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final Builder setOutputType(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= MethodDescriptorProto.OPTIONS_FIELD_NUMBER;
                this.outputType_ = str;
                onChanged();
                return this;
            }

            public final Builder clearOutputType() {
                this.bitField0_ &= -5;
                this.outputType_ = MethodDescriptorProto.getDefaultInstance().getOutputType();
                onChanged();
                return this;
            }

            public final Builder setOutputTypeBytes(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= MethodDescriptorProto.OPTIONS_FIELD_NUMBER;
                this.outputType_ = byteString;
                onChanged();
                return this;
            }

            public final boolean hasOptions() {
                return (this.bitField0_ & 8) == 8;
            }

            public final MethodOptions getOptions() {
                if (this.optionsBuilder_ == null) {
                    return this.options_;
                }
                return (MethodOptions) this.optionsBuilder_.getMessage();
            }

            public final Builder setOptions(MethodOptions methodOptions) {
                if (this.optionsBuilder_ != null) {
                    this.optionsBuilder_.setMessage(methodOptions);
                } else if (methodOptions == null) {
                    throw new NullPointerException();
                } else {
                    this.options_ = methodOptions;
                    onChanged();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public final Builder setOptions(Builder builder) {
                if (this.optionsBuilder_ == null) {
                    this.options_ = builder.build();
                    onChanged();
                } else {
                    this.optionsBuilder_.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                return this;
            }

            public final Builder mergeOptions(MethodOptions methodOptions) {
                if (this.optionsBuilder_ == null) {
                    if ((this.bitField0_ & 8) != 8 || this.options_ == MethodOptions.getDefaultInstance()) {
                        this.options_ = methodOptions;
                    } else {
                        this.options_ = MethodOptions.newBuilder(this.options_).mergeFrom(methodOptions).buildPartial();
                    }
                    onChanged();
                } else {
                    this.optionsBuilder_.mergeFrom(methodOptions);
                }
                this.bitField0_ |= 8;
                return this;
            }

            public final Builder clearOptions() {
                if (this.optionsBuilder_ == null) {
                    this.options_ = MethodOptions.getDefaultInstance();
                    onChanged();
                } else {
                    this.optionsBuilder_.clear();
                }
                this.bitField0_ &= -9;
                return this;
            }

            public final Builder getOptionsBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (Builder) getOptionsFieldBuilder().getBuilder();
            }

            public final MethodOptionsOrBuilder getOptionsOrBuilder() {
                if (this.optionsBuilder_ != null) {
                    return (MethodOptionsOrBuilder) this.optionsBuilder_.getMessageOrBuilder();
                }
                return this.options_;
            }

            private SingleFieldBuilder<MethodOptions, Builder, MethodOptionsOrBuilder> getOptionsFieldBuilder() {
                if (this.optionsBuilder_ == null) {
                    this.optionsBuilder_ = new SingleFieldBuilder(getOptions(), getParentForChildren(), isClean());
                    this.options_ = null;
                }
                return this.optionsBuilder_;
            }
        }

        private MethodDescriptorProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private MethodDescriptorProto(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static MethodDescriptorProto getDefaultInstance() {
            return defaultInstance;
        }

        public final MethodDescriptorProto getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private MethodDescriptorProto(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            com.google.protobuf.UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            Object obj = null;
            while (obj == null) {
                try {
                    int readTag = codedInputStream.readTag();
                    ByteString readBytes;
                    switch (readTag) {
                        case SQLiteDatabase.OPEN_READWRITE /*0*/:
                            obj = NAME_FIELD_NUMBER;
                            break;
                        case PushMsg.SMSG_FIELD_NUMBER /*10*/:
                            readBytes = codedInputStream.readBytes();
                            this.bitField0_ |= NAME_FIELD_NUMBER;
                            this.name_ = readBytes;
                            break;
                        case PushMsg.IVIBRATE_FIELD_NUMBER /*18*/:
                            readBytes = codedInputStream.readBytes();
                            this.bitField0_ |= INPUT_TYPE_FIELD_NUMBER;
                            this.inputType_ = readBytes;
                            break;
                        case GameRoomBaseInfo.EGAMEROOMTYPE_FIELD_NUMBER /*26*/:
                            readBytes = codedInputStream.readBytes();
                            this.bitField0_ |= OPTIONS_FIELD_NUMBER;
                            this.outputType_ = readBytes;
                            break;
                        case GameRoomBaseInfo.ITHINKINGINTERVAL_FIELD_NUMBER /*34*/:
                            Builder toBuilder;
                            if ((this.bitField0_ & 8) == 8) {
                                toBuilder = this.options_.toBuilder();
                            } else {
                                toBuilder = null;
                            }
                            this.options_ = (MethodOptions) codedInputStream.readMessage(MethodOptions.PARSER, extensionRegistryLite);
                            if (toBuilder != null) {
                                toBuilder.mergeFrom(this.options_);
                                this.options_ = toBuilder.buildPartial();
                            }
                            this.bitField0_ |= 8;
                            break;
                        default:
                            if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                obj = NAME_FIELD_NUMBER;
                                break;
                            }
                            break;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                }
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
        }

        public static final Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_MethodDescriptorProto_descriptor;
        }

        protected final FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.f2784xc5331ef1.ensureFieldAccessorsInitialized(MethodDescriptorProto.class, Builder.class);
        }

        static {
            PARSER = new C02941();
            MethodDescriptorProto methodDescriptorProto = new MethodDescriptorProto(true);
            defaultInstance = methodDescriptorProto;
            methodDescriptorProto.initFields();
        }

        public final Parser<MethodDescriptorProto> getParserForType() {
            return PARSER;
        }

        public final boolean hasName() {
            return (this.bitField0_ & NAME_FIELD_NUMBER) == NAME_FIELD_NUMBER;
        }

        public final String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String toStringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = toStringUtf8;
            }
            return toStringUtf8;
        }

        public final ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean hasInputType() {
            return (this.bitField0_ & INPUT_TYPE_FIELD_NUMBER) == INPUT_TYPE_FIELD_NUMBER;
        }

        public final String getInputType() {
            Object obj = this.inputType_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String toStringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.inputType_ = toStringUtf8;
            }
            return toStringUtf8;
        }

        public final ByteString getInputTypeBytes() {
            Object obj = this.inputType_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.inputType_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean hasOutputType() {
            return (this.bitField0_ & OPTIONS_FIELD_NUMBER) == OPTIONS_FIELD_NUMBER;
        }

        public final String getOutputType() {
            Object obj = this.outputType_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String toStringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.outputType_ = toStringUtf8;
            }
            return toStringUtf8;
        }

        public final ByteString getOutputTypeBytes() {
            Object obj = this.outputType_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.outputType_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean hasOptions() {
            return (this.bitField0_ & 8) == 8;
        }

        public final MethodOptions getOptions() {
            return this.options_;
        }

        public final MethodOptionsOrBuilder getOptionsOrBuilder() {
            return this.options_;
        }

        private void initFields() {
            this.name_ = LetterIndexBar.SEARCH_ICON_LETTER;
            this.inputType_ = LetterIndexBar.SEARCH_ICON_LETTER;
            this.outputType_ = LetterIndexBar.SEARCH_ICON_LETTER;
            this.options_ = MethodOptions.getDefaultInstance();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == null) {
                return false;
            }
            if (!hasOptions() || getOptions().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.bitField0_ & NAME_FIELD_NUMBER) == NAME_FIELD_NUMBER) {
                codedOutputStream.writeBytes(NAME_FIELD_NUMBER, getNameBytes());
            }
            if ((this.bitField0_ & INPUT_TYPE_FIELD_NUMBER) == INPUT_TYPE_FIELD_NUMBER) {
                codedOutputStream.writeBytes(INPUT_TYPE_FIELD_NUMBER, getInputTypeBytes());
            }
            if ((this.bitField0_ & OPTIONS_FIELD_NUMBER) == OPTIONS_FIELD_NUMBER) {
                codedOutputStream.writeBytes(OUTPUT_TYPE_FIELD_NUMBER, getOutputTypeBytes());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeMessage(OPTIONS_FIELD_NUMBER, this.options_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public final int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            i = 0;
            if ((this.bitField0_ & NAME_FIELD_NUMBER) == NAME_FIELD_NUMBER) {
                i = CodedOutputStream.computeBytesSize(NAME_FIELD_NUMBER, getNameBytes()) + 0;
            }
            if ((this.bitField0_ & INPUT_TYPE_FIELD_NUMBER) == INPUT_TYPE_FIELD_NUMBER) {
                i += CodedOutputStream.computeBytesSize(INPUT_TYPE_FIELD_NUMBER, getInputTypeBytes());
            }
            if ((this.bitField0_ & OPTIONS_FIELD_NUMBER) == OPTIONS_FIELD_NUMBER) {
                i += CodedOutputStream.computeBytesSize(OUTPUT_TYPE_FIELD_NUMBER, getOutputTypeBytes());
            }
            if ((this.bitField0_ & 8) == 8) {
                i += CodedOutputStream.computeMessageSize(OPTIONS_FIELD_NUMBER, this.options_);
            }
            i += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = i;
            return i;
        }

        protected final Object writeReplace() {
            return super.writeReplace();
        }

        public static MethodDescriptorProto parseFrom(ByteString byteString) {
            return (MethodDescriptorProto) PARSER.parseFrom(byteString);
        }

        public static MethodDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MethodDescriptorProto) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static MethodDescriptorProto parseFrom(byte[] bArr) {
            return (MethodDescriptorProto) PARSER.parseFrom(bArr);
        }

        public static MethodDescriptorProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MethodDescriptorProto) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static MethodDescriptorProto parseFrom(InputStream inputStream) {
            return (MethodDescriptorProto) PARSER.parseFrom(inputStream);
        }

        public static MethodDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MethodDescriptorProto) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static MethodDescriptorProto parseDelimitedFrom(InputStream inputStream) {
            return (MethodDescriptorProto) PARSER.parseDelimitedFrom(inputStream);
        }

        public static MethodDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MethodDescriptorProto) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static MethodDescriptorProto parseFrom(CodedInputStream codedInputStream) {
            return (MethodDescriptorProto) PARSER.parseFrom(codedInputStream);
        }

        public static MethodDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MethodDescriptorProto) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(MethodDescriptorProto methodDescriptorProto) {
            return newBuilder().mergeFrom(methodDescriptorProto);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        protected final Builder newBuilderForType(BuilderParent builderParent) {
            return new Builder(null);
        }
    }

    public interface MethodOptionsOrBuilder extends ExtendableMessageOrBuilder<MethodOptions> {
        boolean getDeprecated();

        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i);

        List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList();

        boolean hasDeprecated();
    }

    public static final class MethodOptions extends ExtendableMessage<MethodOptions> implements MethodOptionsOrBuilder {
        public static final int DEPRECATED_FIELD_NUMBER = 33;
        public static Parser<MethodOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private static final MethodOptions defaultInstance;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean deprecated_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<UninterpretedOption> uninterpretedOption_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.google.protobuf.DescriptorProtos.MethodOptions.1 */
        static class C02951 extends AbstractParser<MethodOptions> {
            C02951() {
            }

            public final MethodOptions parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new MethodOptions(extensionRegistryLite, null);
            }
        }

        public static final class Builder extends ExtendableBuilder<MethodOptions, Builder> implements MethodOptionsOrBuilder {
            private int bitField0_;
            private boolean deprecated_;
            private RepeatedFieldBuilder<UninterpretedOption, Builder, UninterpretedOptionOrBuilder> uninterpretedOptionBuilder_;
            private List<UninterpretedOption> uninterpretedOption_;

            public static final Descriptor getDescriptor() {
                return DescriptorProtos.internal_static_google_protobuf_MethodOptions_descriptor;
            }

            protected final FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.internal_static_google_protobuf_MethodOptions_fieldAccessorTable.ensureFieldAccessorsInitialized(MethodOptions.class, Builder.class);
            }

            private Builder() {
                this.uninterpretedOption_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent builderParent) {
                super(builderParent);
                this.uninterpretedOption_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    getUninterpretedOptionFieldBuilder();
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public final Builder clear() {
                super.clear();
                this.deprecated_ = false;
                this.bitField0_ &= -2;
                if (this.uninterpretedOptionBuilder_ == null) {
                    this.uninterpretedOption_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                } else {
                    this.uninterpretedOptionBuilder_.clear();
                }
                return this;
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_MethodOptions_descriptor;
            }

            public final MethodOptions getDefaultInstanceForType() {
                return MethodOptions.getDefaultInstance();
            }

            public final MethodOptions build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
            }

            public final MethodOptions buildPartial() {
                int i = 1;
                MethodOptions methodOptions = new MethodOptions(null);
                if ((this.bitField0_ & 1) != 1) {
                    i = 0;
                }
                methodOptions.deprecated_ = this.deprecated_;
                if (this.uninterpretedOptionBuilder_ == null) {
                    if ((this.bitField0_ & 2) == 2) {
                        this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                        this.bitField0_ &= -3;
                    }
                    methodOptions.uninterpretedOption_ = this.uninterpretedOption_;
                } else {
                    methodOptions.uninterpretedOption_ = this.uninterpretedOptionBuilder_.build();
                }
                methodOptions.bitField0_ = i;
                onBuilt();
                return methodOptions;
            }

            public final Builder mergeFrom(Message message) {
                if (message instanceof MethodOptions) {
                    return mergeFrom((MethodOptions) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public final Builder mergeFrom(MethodOptions methodOptions) {
                RepeatedFieldBuilder repeatedFieldBuilder = null;
                if (methodOptions != MethodOptions.getDefaultInstance()) {
                    if (methodOptions.hasDeprecated()) {
                        setDeprecated(methodOptions.getDeprecated());
                    }
                    if (this.uninterpretedOptionBuilder_ == null) {
                        if (!methodOptions.uninterpretedOption_.isEmpty()) {
                            if (this.uninterpretedOption_.isEmpty()) {
                                this.uninterpretedOption_ = methodOptions.uninterpretedOption_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureUninterpretedOptionIsMutable();
                                this.uninterpretedOption_.addAll(methodOptions.uninterpretedOption_);
                            }
                            onChanged();
                        }
                    } else if (!methodOptions.uninterpretedOption_.isEmpty()) {
                        if (this.uninterpretedOptionBuilder_.isEmpty()) {
                            this.uninterpretedOptionBuilder_.dispose();
                            this.uninterpretedOptionBuilder_ = null;
                            this.uninterpretedOption_ = methodOptions.uninterpretedOption_;
                            this.bitField0_ &= -3;
                            if (GeneratedMessage.alwaysUseFieldBuilders) {
                                repeatedFieldBuilder = getUninterpretedOptionFieldBuilder();
                            }
                            this.uninterpretedOptionBuilder_ = repeatedFieldBuilder;
                        } else {
                            this.uninterpretedOptionBuilder_.addAllMessages(methodOptions.uninterpretedOption_);
                        }
                    }
                    mergeExtensionFields(methodOptions);
                    mergeUnknownFields(methodOptions.getUnknownFields());
                }
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                    if (!getUninterpretedOption(i).isInitialized()) {
                        return false;
                    }
                }
                if (extensionsAreInitialized()) {
                    return true;
                }
                return false;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.google.protobuf.DescriptorProtos.MethodOptions.Builder mergeFrom(com.google.protobuf.CodedInputStream r5, com.google.protobuf.ExtensionRegistryLite r6) {
                /*
                r4 = this;
                r2 = 0;
                r0 = com.google.protobuf.DescriptorProtos.MethodOptions.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = (com.google.protobuf.DescriptorProtos.MethodOptions) r0;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                if (r0 == 0) goto L_0x000e;
            L_0x000b:
                r4.mergeFrom(r0);
            L_0x000e:
                return r4;
            L_0x000f:
                r0 = move-exception;
                r1 = r0;
                r0 = r1.getUnfinishedMessage();	 Catch:{ all -> 0x0022 }
                r0 = (com.google.protobuf.DescriptorProtos.MethodOptions) r0;	 Catch:{ all -> 0x0022 }
                throw r1;	 Catch:{ all -> 0x0018 }
            L_0x0018:
                r1 = move-exception;
                r3 = r1;
                r1 = r0;
                r0 = r3;
            L_0x001c:
                if (r1 == 0) goto L_0x0021;
            L_0x001e:
                r4.mergeFrom(r1);
            L_0x0021:
                throw r0;
            L_0x0022:
                r0 = move-exception;
                r1 = r2;
                goto L_0x001c;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.MethodOptions.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.DescriptorProtos$MethodOptions$Builder");
            }

            public final boolean hasDeprecated() {
                return (this.bitField0_ & 1) == 1;
            }

            public final boolean getDeprecated() {
                return this.deprecated_;
            }

            public final Builder setDeprecated(boolean z) {
                this.bitField0_ |= 1;
                this.deprecated_ = z;
                onChanged();
                return this;
            }

            public final Builder clearDeprecated() {
                this.bitField0_ &= -2;
                this.deprecated_ = false;
                onChanged();
                return this;
            }

            private void ensureUninterpretedOptionIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.uninterpretedOption_ = new ArrayList(this.uninterpretedOption_);
                    this.bitField0_ |= 2;
                }
            }

            public final List<UninterpretedOption> getUninterpretedOptionList() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    return Collections.unmodifiableList(this.uninterpretedOption_);
                }
                return this.uninterpretedOptionBuilder_.getMessageList();
            }

            public final int getUninterpretedOptionCount() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    return this.uninterpretedOption_.size();
                }
                return this.uninterpretedOptionBuilder_.getCount();
            }

            public final UninterpretedOption getUninterpretedOption(int i) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    return (UninterpretedOption) this.uninterpretedOption_.get(i);
                }
                return (UninterpretedOption) this.uninterpretedOptionBuilder_.getMessage(i);
            }

            public final Builder setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
                if (this.uninterpretedOptionBuilder_ != null) {
                    this.uninterpretedOptionBuilder_.setMessage(i, uninterpretedOption);
                } else if (uninterpretedOption == null) {
                    throw new NullPointerException();
                } else {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.set(i, uninterpretedOption);
                    onChanged();
                }
                return this;
            }

            public final Builder setUninterpretedOption(int i, Builder builder) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.set(i, builder.build());
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
                if (this.uninterpretedOptionBuilder_ != null) {
                    this.uninterpretedOptionBuilder_.addMessage(uninterpretedOption);
                } else if (uninterpretedOption == null) {
                    throw new NullPointerException();
                } else {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.add(uninterpretedOption);
                    onChanged();
                }
                return this;
            }

            public final Builder addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
                if (this.uninterpretedOptionBuilder_ != null) {
                    this.uninterpretedOptionBuilder_.addMessage(i, uninterpretedOption);
                } else if (uninterpretedOption == null) {
                    throw new NullPointerException();
                } else {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.add(i, uninterpretedOption);
                    onChanged();
                }
                return this;
            }

            public final Builder addUninterpretedOption(Builder builder) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.add(builder.build());
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public final Builder addUninterpretedOption(int i, Builder builder) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.add(i, builder.build());
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.uninterpretedOption_);
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public final Builder clearUninterpretedOption() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    this.uninterpretedOption_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.clear();
                }
                return this;
            }

            public final Builder removeUninterpretedOption(int i) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.remove(i);
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.remove(i);
                }
                return this;
            }

            public final Builder getUninterpretedOptionBuilder(int i) {
                return (Builder) getUninterpretedOptionFieldBuilder().getBuilder(i);
            }

            public final UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    return (UninterpretedOptionOrBuilder) this.uninterpretedOption_.get(i);
                }
                return (UninterpretedOptionOrBuilder) this.uninterpretedOptionBuilder_.getMessageOrBuilder(i);
            }

            public final List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
                if (this.uninterpretedOptionBuilder_ != null) {
                    return this.uninterpretedOptionBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.uninterpretedOption_);
            }

            public final Builder addUninterpretedOptionBuilder() {
                return (Builder) getUninterpretedOptionFieldBuilder().addBuilder(UninterpretedOption.getDefaultInstance());
            }

            public final Builder addUninterpretedOptionBuilder(int i) {
                return (Builder) getUninterpretedOptionFieldBuilder().addBuilder(i, UninterpretedOption.getDefaultInstance());
            }

            public final List<Builder> getUninterpretedOptionBuilderList() {
                return getUninterpretedOptionFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<UninterpretedOption, Builder, UninterpretedOptionOrBuilder> getUninterpretedOptionFieldBuilder() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    this.uninterpretedOptionBuilder_ = new RepeatedFieldBuilder(this.uninterpretedOption_, (this.bitField0_ & 2) == 2, getParentForChildren(), isClean());
                    this.uninterpretedOption_ = null;
                }
                return this.uninterpretedOptionBuilder_;
            }
        }

        private MethodOptions(ExtendableBuilder<MethodOptions, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        private MethodOptions(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static MethodOptions getDefaultInstance() {
            return defaultInstance;
        }

        public final MethodOptions getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private MethodOptions(com.google.protobuf.CodedInputStream r9, com.google.protobuf.ExtensionRegistryLite r10) {
            /*
            r8 = this;
            r2 = 1;
            r0 = 0;
            r1 = -1;
            r6 = 2;
            r8.<init>();
            r8.memoizedIsInitialized = r1;
            r8.memoizedSerializedSize = r1;
            r8.initFields();
            r3 = com.google.protobuf.UnknownFieldSet.newBuilder();
            r1 = r0;
        L_0x0013:
            if (r1 != 0) goto L_0x007e;
        L_0x0015:
            r4 = r9.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            switch(r4) {
                case 0: goto L_0x0024;
                case 264: goto L_0x0026;
                case 7994: goto L_0x0053;
                default: goto L_0x001c;
            };	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
        L_0x001c:
            r4 = r8.parseUnknownField(r9, r3, r10, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            if (r4 != 0) goto L_0x0013;
        L_0x0022:
            r1 = r2;
            goto L_0x0013;
        L_0x0024:
            r1 = r2;
            goto L_0x0013;
        L_0x0026:
            r4 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            r4 = r4 | 1;
            r8.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            r4 = r9.readBool();	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            r8.deprecated_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            goto L_0x0013;
        L_0x0033:
            r1 = move-exception;
            r7 = r1;
            r1 = r0;
            r0 = r7;
            r0 = r0.setUnfinishedMessage(r8);	 Catch:{ all -> 0x003c }
            throw r0;	 Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception;
        L_0x003d:
            r1 = r1 & 2;
            if (r1 != r6) goto L_0x0049;
        L_0x0041:
            r1 = r8.uninterpretedOption_;
            r1 = java.util.Collections.unmodifiableList(r1);
            r8.uninterpretedOption_ = r1;
        L_0x0049:
            r1 = r3.build();
            r8.unknownFields = r1;
            r8.makeExtensionsImmutable();
            throw r0;
        L_0x0053:
            r4 = r0 & 2;
            if (r4 == r6) goto L_0x0060;
        L_0x0057:
            r4 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            r4.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            r8.uninterpretedOption_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            r0 = r0 | 2;
        L_0x0060:
            r4 = r8.uninterpretedOption_;	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            r5 = com.google.protobuf.DescriptorProtos.UninterpretedOption.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            r5 = r9.readMessage(r5, r10);	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            r4.add(r5);	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            goto L_0x0013;
        L_0x006c:
            r1 = move-exception;
            r7 = r1;
            r1 = r0;
            r0 = r7;
            r2 = new com.google.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x003c }
            r0 = r0.getMessage();	 Catch:{ all -> 0x003c }
            r2.<init>(r0);	 Catch:{ all -> 0x003c }
            r0 = r2.setUnfinishedMessage(r8);	 Catch:{ all -> 0x003c }
            throw r0;	 Catch:{ all -> 0x003c }
        L_0x007e:
            r0 = r0 & 2;
            if (r0 != r6) goto L_0x008a;
        L_0x0082:
            r0 = r8.uninterpretedOption_;
            r0 = java.util.Collections.unmodifiableList(r0);
            r8.uninterpretedOption_ = r0;
        L_0x008a:
            r0 = r3.build();
            r8.unknownFields = r0;
            r8.makeExtensionsImmutable();
            return;
        L_0x0094:
            r1 = move-exception;
            r7 = r1;
            r1 = r0;
            r0 = r7;
            goto L_0x003d;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.MethodOptions.<init>(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):void");
        }

        public static final Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_MethodOptions_descriptor;
        }

        protected final FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.internal_static_google_protobuf_MethodOptions_fieldAccessorTable.ensureFieldAccessorsInitialized(MethodOptions.class, Builder.class);
        }

        static {
            PARSER = new C02951();
            MethodOptions methodOptions = new MethodOptions(true);
            defaultInstance = methodOptions;
            methodOptions.initFields();
        }

        public final Parser<MethodOptions> getParserForType() {
            return PARSER;
        }

        public final boolean hasDeprecated() {
            return (this.bitField0_ & 1) == 1;
        }

        public final boolean getDeprecated() {
            return this.deprecated_;
        }

        public final List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public final List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        public final int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public final UninterpretedOption getUninterpretedOption(int i) {
            return (UninterpretedOption) this.uninterpretedOption_.get(i);
        }

        public final UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i) {
            return (UninterpretedOptionOrBuilder) this.uninterpretedOption_.get(i);
        }

        private void initFields() {
            this.deprecated_ = false;
            this.uninterpretedOption_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == null) {
                return false;
            }
            int i = 0;
            while (i < getUninterpretedOptionCount()) {
                if (getUninterpretedOption(i).isInitialized()) {
                    i++;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeBool(DEPRECATED_FIELD_NUMBER, this.deprecated_);
            }
            for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
                codedOutputStream.writeMessage(UNINTERPRETED_OPTION_FIELD_NUMBER, (MessageLite) this.uninterpretedOption_.get(i));
            }
            newExtensionWriter.writeUntil(536870912, codedOutputStream);
            getUnknownFields().writeTo(codedOutputStream);
        }

        public final int getSerializedSize() {
            int i = 0;
            int i2 = this.memoizedSerializedSize;
            if (i2 != -1) {
                return i2;
            }
            if ((this.bitField0_ & 1) == 1) {
                i2 = CodedOutputStream.computeBoolSize(DEPRECATED_FIELD_NUMBER, this.deprecated_) + 0;
            } else {
                i2 = 0;
            }
            int i3 = i2;
            while (i < this.uninterpretedOption_.size()) {
                i++;
                i3 = CodedOutputStream.computeMessageSize(UNINTERPRETED_OPTION_FIELD_NUMBER, (MessageLite) this.uninterpretedOption_.get(i)) + i3;
            }
            i2 = (extensionsSerializedSize() + i3) + getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = i2;
            return i2;
        }

        protected final Object writeReplace() {
            return super.writeReplace();
        }

        public static MethodOptions parseFrom(ByteString byteString) {
            return (MethodOptions) PARSER.parseFrom(byteString);
        }

        public static MethodOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MethodOptions) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static MethodOptions parseFrom(byte[] bArr) {
            return (MethodOptions) PARSER.parseFrom(bArr);
        }

        public static MethodOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MethodOptions) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static MethodOptions parseFrom(InputStream inputStream) {
            return (MethodOptions) PARSER.parseFrom(inputStream);
        }

        public static MethodOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MethodOptions) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static MethodOptions parseDelimitedFrom(InputStream inputStream) {
            return (MethodOptions) PARSER.parseDelimitedFrom(inputStream);
        }

        public static MethodOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MethodOptions) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static MethodOptions parseFrom(CodedInputStream codedInputStream) {
            return (MethodOptions) PARSER.parseFrom(codedInputStream);
        }

        public static MethodOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MethodOptions) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(MethodOptions methodOptions) {
            return newBuilder().mergeFrom(methodOptions);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        protected final Builder newBuilderForType(BuilderParent builderParent) {
            return new Builder(null);
        }
    }

    public interface OneofDescriptorProtoOrBuilder extends MessageOrBuilder {
        String getName();

        ByteString getNameBytes();

        boolean hasName();
    }

    public static final class OneofDescriptorProto extends GeneratedMessage implements OneofDescriptorProtoOrBuilder {
        public static final int NAME_FIELD_NUMBER = 1;
        public static Parser<OneofDescriptorProto> PARSER;
        private static final OneofDescriptorProto defaultInstance;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object name_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.google.protobuf.DescriptorProtos.OneofDescriptorProto.1 */
        static class C02961 extends AbstractParser<OneofDescriptorProto> {
            C02961() {
            }

            public final OneofDescriptorProto parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new OneofDescriptorProto(extensionRegistryLite, null);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements OneofDescriptorProtoOrBuilder {
            private int bitField0_;
            private Object name_;

            public static final Descriptor getDescriptor() {
                return DescriptorProtos.internal_static_google_protobuf_OneofDescriptorProto_descriptor;
            }

            protected final FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.f2785x69499c33.ensureFieldAccessorsInitialized(OneofDescriptorProto.class, Builder.class);
            }

            private Builder() {
                this.name_ = LetterIndexBar.SEARCH_ICON_LETTER;
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent builderParent) {
                super(builderParent);
                this.name_ = LetterIndexBar.SEARCH_ICON_LETTER;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean z = GeneratedMessage.alwaysUseFieldBuilders;
            }

            private static Builder create() {
                return new Builder();
            }

            public final Builder clear() {
                super.clear();
                this.name_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.bitField0_ &= -2;
                return this;
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_OneofDescriptorProto_descriptor;
            }

            public final OneofDescriptorProto getDefaultInstanceForType() {
                return OneofDescriptorProto.getDefaultInstance();
            }

            public final OneofDescriptorProto build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
            }

            public final OneofDescriptorProto buildPartial() {
                int i = OneofDescriptorProto.NAME_FIELD_NUMBER;
                OneofDescriptorProto oneofDescriptorProto = new OneofDescriptorProto(null);
                if ((this.bitField0_ & OneofDescriptorProto.NAME_FIELD_NUMBER) != OneofDescriptorProto.NAME_FIELD_NUMBER) {
                    i = 0;
                }
                oneofDescriptorProto.name_ = this.name_;
                oneofDescriptorProto.bitField0_ = i;
                onBuilt();
                return oneofDescriptorProto;
            }

            public final Builder mergeFrom(Message message) {
                if (message instanceof OneofDescriptorProto) {
                    return mergeFrom((OneofDescriptorProto) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public final Builder mergeFrom(OneofDescriptorProto oneofDescriptorProto) {
                if (oneofDescriptorProto != OneofDescriptorProto.getDefaultInstance()) {
                    if (oneofDescriptorProto.hasName()) {
                        this.bitField0_ |= OneofDescriptorProto.NAME_FIELD_NUMBER;
                        this.name_ = oneofDescriptorProto.name_;
                        onChanged();
                    }
                    mergeUnknownFields(oneofDescriptorProto.getUnknownFields());
                }
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.google.protobuf.DescriptorProtos.OneofDescriptorProto.Builder mergeFrom(com.google.protobuf.CodedInputStream r5, com.google.protobuf.ExtensionRegistryLite r6) {
                /*
                r4 = this;
                r2 = 0;
                r0 = com.google.protobuf.DescriptorProtos.OneofDescriptorProto.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = (com.google.protobuf.DescriptorProtos.OneofDescriptorProto) r0;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                if (r0 == 0) goto L_0x000e;
            L_0x000b:
                r4.mergeFrom(r0);
            L_0x000e:
                return r4;
            L_0x000f:
                r0 = move-exception;
                r1 = r0;
                r0 = r1.getUnfinishedMessage();	 Catch:{ all -> 0x0022 }
                r0 = (com.google.protobuf.DescriptorProtos.OneofDescriptorProto) r0;	 Catch:{ all -> 0x0022 }
                throw r1;	 Catch:{ all -> 0x0018 }
            L_0x0018:
                r1 = move-exception;
                r3 = r1;
                r1 = r0;
                r0 = r3;
            L_0x001c:
                if (r1 == 0) goto L_0x0021;
            L_0x001e:
                r4.mergeFrom(r1);
            L_0x0021:
                throw r0;
            L_0x0022:
                r0 = move-exception;
                r1 = r2;
                goto L_0x001c;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.OneofDescriptorProto.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.DescriptorProtos$OneofDescriptorProto$Builder");
            }

            public final boolean hasName() {
                return (this.bitField0_ & OneofDescriptorProto.NAME_FIELD_NUMBER) == OneofDescriptorProto.NAME_FIELD_NUMBER;
            }

            public final String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String toStringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.name_ = toStringUtf8;
                }
                return toStringUtf8;
            }

            public final ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final Builder setName(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= OneofDescriptorProto.NAME_FIELD_NUMBER;
                this.name_ = str;
                onChanged();
                return this;
            }

            public final Builder clearName() {
                this.bitField0_ &= -2;
                this.name_ = OneofDescriptorProto.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public final Builder setNameBytes(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= OneofDescriptorProto.NAME_FIELD_NUMBER;
                this.name_ = byteString;
                onChanged();
                return this;
            }
        }

        private OneofDescriptorProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private OneofDescriptorProto(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static OneofDescriptorProto getDefaultInstance() {
            return defaultInstance;
        }

        public final OneofDescriptorProto getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private OneofDescriptorProto(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            com.google.protobuf.UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            Object obj = null;
            while (obj == null) {
                try {
                    int readTag = codedInputStream.readTag();
                    switch (readTag) {
                        case SQLiteDatabase.OPEN_READWRITE /*0*/:
                            obj = NAME_FIELD_NUMBER;
                            break;
                        case PushMsg.SMSG_FIELD_NUMBER /*10*/:
                            ByteString readBytes = codedInputStream.readBytes();
                            this.bitField0_ |= NAME_FIELD_NUMBER;
                            this.name_ = readBytes;
                            break;
                        default:
                            if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                obj = NAME_FIELD_NUMBER;
                                break;
                            }
                            break;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                }
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
        }

        public static final Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_OneofDescriptorProto_descriptor;
        }

        protected final FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.f2785x69499c33.ensureFieldAccessorsInitialized(OneofDescriptorProto.class, Builder.class);
        }

        static {
            PARSER = new C02961();
            OneofDescriptorProto oneofDescriptorProto = new OneofDescriptorProto(true);
            defaultInstance = oneofDescriptorProto;
            oneofDescriptorProto.initFields();
        }

        public final Parser<OneofDescriptorProto> getParserForType() {
            return PARSER;
        }

        public final boolean hasName() {
            return (this.bitField0_ & NAME_FIELD_NUMBER) == NAME_FIELD_NUMBER;
        }

        public final String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String toStringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = toStringUtf8;
            }
            return toStringUtf8;
        }

        public final ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = copyFromUtf8;
            return copyFromUtf8;
        }

        private void initFields() {
            this.name_ = LetterIndexBar.SEARCH_ICON_LETTER;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == null) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.bitField0_ & NAME_FIELD_NUMBER) == NAME_FIELD_NUMBER) {
                codedOutputStream.writeBytes(NAME_FIELD_NUMBER, getNameBytes());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public final int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            i = 0;
            if ((this.bitField0_ & NAME_FIELD_NUMBER) == NAME_FIELD_NUMBER) {
                i = CodedOutputStream.computeBytesSize(NAME_FIELD_NUMBER, getNameBytes()) + 0;
            }
            i += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = i;
            return i;
        }

        protected final Object writeReplace() {
            return super.writeReplace();
        }

        public static OneofDescriptorProto parseFrom(ByteString byteString) {
            return (OneofDescriptorProto) PARSER.parseFrom(byteString);
        }

        public static OneofDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (OneofDescriptorProto) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static OneofDescriptorProto parseFrom(byte[] bArr) {
            return (OneofDescriptorProto) PARSER.parseFrom(bArr);
        }

        public static OneofDescriptorProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (OneofDescriptorProto) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static OneofDescriptorProto parseFrom(InputStream inputStream) {
            return (OneofDescriptorProto) PARSER.parseFrom(inputStream);
        }

        public static OneofDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OneofDescriptorProto) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static OneofDescriptorProto parseDelimitedFrom(InputStream inputStream) {
            return (OneofDescriptorProto) PARSER.parseDelimitedFrom(inputStream);
        }

        public static OneofDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OneofDescriptorProto) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static OneofDescriptorProto parseFrom(CodedInputStream codedInputStream) {
            return (OneofDescriptorProto) PARSER.parseFrom(codedInputStream);
        }

        public static OneofDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OneofDescriptorProto) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(OneofDescriptorProto oneofDescriptorProto) {
            return newBuilder().mergeFrom(oneofDescriptorProto);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        protected final Builder newBuilderForType(BuilderParent builderParent) {
            return new Builder(null);
        }
    }

    public interface ServiceDescriptorProtoOrBuilder extends MessageOrBuilder {
        MethodDescriptorProto getMethod(int i);

        int getMethodCount();

        List<MethodDescriptorProto> getMethodList();

        MethodDescriptorProtoOrBuilder getMethodOrBuilder(int i);

        List<? extends MethodDescriptorProtoOrBuilder> getMethodOrBuilderList();

        String getName();

        ByteString getNameBytes();

        ServiceOptions getOptions();

        ServiceOptionsOrBuilder getOptionsOrBuilder();

        boolean hasName();

        boolean hasOptions();
    }

    public static final class ServiceDescriptorProto extends GeneratedMessage implements ServiceDescriptorProtoOrBuilder {
        public static final int METHOD_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        public static Parser<ServiceDescriptorProto> PARSER;
        private static final ServiceDescriptorProto defaultInstance;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<MethodDescriptorProto> method_;
        private Object name_;
        private ServiceOptions options_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.1 */
        static class C02971 extends AbstractParser<ServiceDescriptorProto> {
            C02971() {
            }

            public final ServiceDescriptorProto parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new ServiceDescriptorProto(extensionRegistryLite, null);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements ServiceDescriptorProtoOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilder<MethodDescriptorProto, Builder, MethodDescriptorProtoOrBuilder> methodBuilder_;
            private List<MethodDescriptorProto> method_;
            private Object name_;
            private SingleFieldBuilder<ServiceOptions, Builder, ServiceOptionsOrBuilder> optionsBuilder_;
            private ServiceOptions options_;

            public static final Descriptor getDescriptor() {
                return DescriptorProtos.f2786x158c73ed;
            }

            protected final FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.f2787xee335d6b.ensureFieldAccessorsInitialized(ServiceDescriptorProto.class, Builder.class);
            }

            private Builder() {
                this.name_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.method_ = Collections.emptyList();
                this.options_ = ServiceOptions.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent builderParent) {
                super(builderParent);
                this.name_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.method_ = Collections.emptyList();
                this.options_ = ServiceOptions.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    getMethodFieldBuilder();
                    getOptionsFieldBuilder();
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public final Builder clear() {
                super.clear();
                this.name_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.bitField0_ &= -2;
                if (this.methodBuilder_ == null) {
                    this.method_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                } else {
                    this.methodBuilder_.clear();
                }
                if (this.optionsBuilder_ == null) {
                    this.options_ = ServiceOptions.getDefaultInstance();
                } else {
                    this.optionsBuilder_.clear();
                }
                this.bitField0_ &= -5;
                return this;
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final Descriptor getDescriptorForType() {
                return DescriptorProtos.f2786x158c73ed;
            }

            public final ServiceDescriptorProto getDefaultInstanceForType() {
                return ServiceDescriptorProto.getDefaultInstance();
            }

            public final ServiceDescriptorProto build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
            }

            public final ServiceDescriptorProto buildPartial() {
                int i;
                int i2 = ServiceDescriptorProto.NAME_FIELD_NUMBER;
                ServiceDescriptorProto serviceDescriptorProto = new ServiceDescriptorProto(null);
                int i3 = this.bitField0_;
                if ((i3 & ServiceDescriptorProto.NAME_FIELD_NUMBER) != ServiceDescriptorProto.NAME_FIELD_NUMBER) {
                    i2 = 0;
                }
                serviceDescriptorProto.name_ = this.name_;
                if (this.methodBuilder_ == null) {
                    if ((this.bitField0_ & ServiceDescriptorProto.METHOD_FIELD_NUMBER) == ServiceDescriptorProto.METHOD_FIELD_NUMBER) {
                        this.method_ = Collections.unmodifiableList(this.method_);
                        this.bitField0_ &= -3;
                    }
                    serviceDescriptorProto.method_ = this.method_;
                } else {
                    serviceDescriptorProto.method_ = this.methodBuilder_.build();
                }
                if ((i3 & 4) == 4) {
                    i = i2 | ServiceDescriptorProto.METHOD_FIELD_NUMBER;
                } else {
                    i = i2;
                }
                if (this.optionsBuilder_ == null) {
                    serviceDescriptorProto.options_ = this.options_;
                } else {
                    serviceDescriptorProto.options_ = (ServiceOptions) this.optionsBuilder_.build();
                }
                serviceDescriptorProto.bitField0_ = i;
                onBuilt();
                return serviceDescriptorProto;
            }

            public final Builder mergeFrom(Message message) {
                if (message instanceof ServiceDescriptorProto) {
                    return mergeFrom((ServiceDescriptorProto) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public final Builder mergeFrom(ServiceDescriptorProto serviceDescriptorProto) {
                RepeatedFieldBuilder repeatedFieldBuilder = null;
                if (serviceDescriptorProto != ServiceDescriptorProto.getDefaultInstance()) {
                    if (serviceDescriptorProto.hasName()) {
                        this.bitField0_ |= ServiceDescriptorProto.NAME_FIELD_NUMBER;
                        this.name_ = serviceDescriptorProto.name_;
                        onChanged();
                    }
                    if (this.methodBuilder_ == null) {
                        if (!serviceDescriptorProto.method_.isEmpty()) {
                            if (this.method_.isEmpty()) {
                                this.method_ = serviceDescriptorProto.method_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureMethodIsMutable();
                                this.method_.addAll(serviceDescriptorProto.method_);
                            }
                            onChanged();
                        }
                    } else if (!serviceDescriptorProto.method_.isEmpty()) {
                        if (this.methodBuilder_.isEmpty()) {
                            this.methodBuilder_.dispose();
                            this.methodBuilder_ = null;
                            this.method_ = serviceDescriptorProto.method_;
                            this.bitField0_ &= -3;
                            if (GeneratedMessage.alwaysUseFieldBuilders) {
                                repeatedFieldBuilder = getMethodFieldBuilder();
                            }
                            this.methodBuilder_ = repeatedFieldBuilder;
                        } else {
                            this.methodBuilder_.addAllMessages(serviceDescriptorProto.method_);
                        }
                    }
                    if (serviceDescriptorProto.hasOptions()) {
                        mergeOptions(serviceDescriptorProto.getOptions());
                    }
                    mergeUnknownFields(serviceDescriptorProto.getUnknownFields());
                }
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < getMethodCount(); i += ServiceDescriptorProto.NAME_FIELD_NUMBER) {
                    if (!getMethod(i).isInitialized()) {
                        return false;
                    }
                }
                if (!hasOptions() || getOptions().isInitialized()) {
                    return true;
                }
                return false;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder mergeFrom(com.google.protobuf.CodedInputStream r5, com.google.protobuf.ExtensionRegistryLite r6) {
                /*
                r4 = this;
                r2 = 0;
                r0 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = (com.google.protobuf.DescriptorProtos.ServiceDescriptorProto) r0;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                if (r0 == 0) goto L_0x000e;
            L_0x000b:
                r4.mergeFrom(r0);
            L_0x000e:
                return r4;
            L_0x000f:
                r0 = move-exception;
                r1 = r0;
                r0 = r1.getUnfinishedMessage();	 Catch:{ all -> 0x0022 }
                r0 = (com.google.protobuf.DescriptorProtos.ServiceDescriptorProto) r0;	 Catch:{ all -> 0x0022 }
                throw r1;	 Catch:{ all -> 0x0018 }
            L_0x0018:
                r1 = move-exception;
                r3 = r1;
                r1 = r0;
                r0 = r3;
            L_0x001c:
                if (r1 == 0) goto L_0x0021;
            L_0x001e:
                r4.mergeFrom(r1);
            L_0x0021:
                throw r0;
            L_0x0022:
                r0 = move-exception;
                r1 = r2;
                goto L_0x001c;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.DescriptorProtos$ServiceDescriptorProto$Builder");
            }

            public final boolean hasName() {
                return (this.bitField0_ & ServiceDescriptorProto.NAME_FIELD_NUMBER) == ServiceDescriptorProto.NAME_FIELD_NUMBER;
            }

            public final String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String toStringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.name_ = toStringUtf8;
                }
                return toStringUtf8;
            }

            public final ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final Builder setName(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ServiceDescriptorProto.NAME_FIELD_NUMBER;
                this.name_ = str;
                onChanged();
                return this;
            }

            public final Builder clearName() {
                this.bitField0_ &= -2;
                this.name_ = ServiceDescriptorProto.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public final Builder setNameBytes(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ServiceDescriptorProto.NAME_FIELD_NUMBER;
                this.name_ = byteString;
                onChanged();
                return this;
            }

            private void ensureMethodIsMutable() {
                if ((this.bitField0_ & ServiceDescriptorProto.METHOD_FIELD_NUMBER) != ServiceDescriptorProto.METHOD_FIELD_NUMBER) {
                    this.method_ = new ArrayList(this.method_);
                    this.bitField0_ |= ServiceDescriptorProto.METHOD_FIELD_NUMBER;
                }
            }

            public final List<MethodDescriptorProto> getMethodList() {
                if (this.methodBuilder_ == null) {
                    return Collections.unmodifiableList(this.method_);
                }
                return this.methodBuilder_.getMessageList();
            }

            public final int getMethodCount() {
                if (this.methodBuilder_ == null) {
                    return this.method_.size();
                }
                return this.methodBuilder_.getCount();
            }

            public final MethodDescriptorProto getMethod(int i) {
                if (this.methodBuilder_ == null) {
                    return (MethodDescriptorProto) this.method_.get(i);
                }
                return (MethodDescriptorProto) this.methodBuilder_.getMessage(i);
            }

            public final Builder setMethod(int i, MethodDescriptorProto methodDescriptorProto) {
                if (this.methodBuilder_ != null) {
                    this.methodBuilder_.setMessage(i, methodDescriptorProto);
                } else if (methodDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureMethodIsMutable();
                    this.method_.set(i, methodDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder setMethod(int i, Builder builder) {
                if (this.methodBuilder_ == null) {
                    ensureMethodIsMutable();
                    this.method_.set(i, builder.build());
                    onChanged();
                } else {
                    this.methodBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addMethod(MethodDescriptorProto methodDescriptorProto) {
                if (this.methodBuilder_ != null) {
                    this.methodBuilder_.addMessage(methodDescriptorProto);
                } else if (methodDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureMethodIsMutable();
                    this.method_.add(methodDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder addMethod(int i, MethodDescriptorProto methodDescriptorProto) {
                if (this.methodBuilder_ != null) {
                    this.methodBuilder_.addMessage(i, methodDescriptorProto);
                } else if (methodDescriptorProto == null) {
                    throw new NullPointerException();
                } else {
                    ensureMethodIsMutable();
                    this.method_.add(i, methodDescriptorProto);
                    onChanged();
                }
                return this;
            }

            public final Builder addMethod(Builder builder) {
                if (this.methodBuilder_ == null) {
                    ensureMethodIsMutable();
                    this.method_.add(builder.build());
                    onChanged();
                } else {
                    this.methodBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public final Builder addMethod(int i, Builder builder) {
                if (this.methodBuilder_ == null) {
                    ensureMethodIsMutable();
                    this.method_.add(i, builder.build());
                    onChanged();
                } else {
                    this.methodBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addAllMethod(Iterable<? extends MethodDescriptorProto> iterable) {
                if (this.methodBuilder_ == null) {
                    ensureMethodIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.method_);
                    onChanged();
                } else {
                    this.methodBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public final Builder clearMethod() {
                if (this.methodBuilder_ == null) {
                    this.method_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    onChanged();
                } else {
                    this.methodBuilder_.clear();
                }
                return this;
            }

            public final Builder removeMethod(int i) {
                if (this.methodBuilder_ == null) {
                    ensureMethodIsMutable();
                    this.method_.remove(i);
                    onChanged();
                } else {
                    this.methodBuilder_.remove(i);
                }
                return this;
            }

            public final Builder getMethodBuilder(int i) {
                return (Builder) getMethodFieldBuilder().getBuilder(i);
            }

            public final MethodDescriptorProtoOrBuilder getMethodOrBuilder(int i) {
                if (this.methodBuilder_ == null) {
                    return (MethodDescriptorProtoOrBuilder) this.method_.get(i);
                }
                return (MethodDescriptorProtoOrBuilder) this.methodBuilder_.getMessageOrBuilder(i);
            }

            public final List<? extends MethodDescriptorProtoOrBuilder> getMethodOrBuilderList() {
                if (this.methodBuilder_ != null) {
                    return this.methodBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.method_);
            }

            public final Builder addMethodBuilder() {
                return (Builder) getMethodFieldBuilder().addBuilder(MethodDescriptorProto.getDefaultInstance());
            }

            public final Builder addMethodBuilder(int i) {
                return (Builder) getMethodFieldBuilder().addBuilder(i, MethodDescriptorProto.getDefaultInstance());
            }

            public final List<Builder> getMethodBuilderList() {
                return getMethodFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<MethodDescriptorProto, Builder, MethodDescriptorProtoOrBuilder> getMethodFieldBuilder() {
                if (this.methodBuilder_ == null) {
                    this.methodBuilder_ = new RepeatedFieldBuilder(this.method_, (this.bitField0_ & ServiceDescriptorProto.METHOD_FIELD_NUMBER) == ServiceDescriptorProto.METHOD_FIELD_NUMBER, getParentForChildren(), isClean());
                    this.method_ = null;
                }
                return this.methodBuilder_;
            }

            public final boolean hasOptions() {
                return (this.bitField0_ & 4) == 4;
            }

            public final ServiceOptions getOptions() {
                if (this.optionsBuilder_ == null) {
                    return this.options_;
                }
                return (ServiceOptions) this.optionsBuilder_.getMessage();
            }

            public final Builder setOptions(ServiceOptions serviceOptions) {
                if (this.optionsBuilder_ != null) {
                    this.optionsBuilder_.setMessage(serviceOptions);
                } else if (serviceOptions == null) {
                    throw new NullPointerException();
                } else {
                    this.options_ = serviceOptions;
                    onChanged();
                }
                this.bitField0_ |= 4;
                return this;
            }

            public final Builder setOptions(Builder builder) {
                if (this.optionsBuilder_ == null) {
                    this.options_ = builder.build();
                    onChanged();
                } else {
                    this.optionsBuilder_.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                return this;
            }

            public final Builder mergeOptions(ServiceOptions serviceOptions) {
                if (this.optionsBuilder_ == null) {
                    if ((this.bitField0_ & 4) != 4 || this.options_ == ServiceOptions.getDefaultInstance()) {
                        this.options_ = serviceOptions;
                    } else {
                        this.options_ = ServiceOptions.newBuilder(this.options_).mergeFrom(serviceOptions).buildPartial();
                    }
                    onChanged();
                } else {
                    this.optionsBuilder_.mergeFrom(serviceOptions);
                }
                this.bitField0_ |= 4;
                return this;
            }

            public final Builder clearOptions() {
                if (this.optionsBuilder_ == null) {
                    this.options_ = ServiceOptions.getDefaultInstance();
                    onChanged();
                } else {
                    this.optionsBuilder_.clear();
                }
                this.bitField0_ &= -5;
                return this;
            }

            public final Builder getOptionsBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (Builder) getOptionsFieldBuilder().getBuilder();
            }

            public final ServiceOptionsOrBuilder getOptionsOrBuilder() {
                if (this.optionsBuilder_ != null) {
                    return (ServiceOptionsOrBuilder) this.optionsBuilder_.getMessageOrBuilder();
                }
                return this.options_;
            }

            private SingleFieldBuilder<ServiceOptions, Builder, ServiceOptionsOrBuilder> getOptionsFieldBuilder() {
                if (this.optionsBuilder_ == null) {
                    this.optionsBuilder_ = new SingleFieldBuilder(getOptions(), getParentForChildren(), isClean());
                    this.options_ = null;
                }
                return this.optionsBuilder_;
            }
        }

        private ServiceDescriptorProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ServiceDescriptorProto(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static ServiceDescriptorProto getDefaultInstance() {
            return defaultInstance;
        }

        public final ServiceDescriptorProto getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ServiceDescriptorProto(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            com.google.protobuf.UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            Object obj = null;
            int i = 0;
            while (obj == null) {
                try {
                    int readTag = codedInputStream.readTag();
                    switch (readTag) {
                        case SQLiteDatabase.OPEN_READWRITE /*0*/:
                            obj = NAME_FIELD_NUMBER;
                            break;
                        case PushMsg.SMSG_FIELD_NUMBER /*10*/:
                            ByteString readBytes = codedInputStream.readBytes();
                            this.bitField0_ |= NAME_FIELD_NUMBER;
                            this.name_ = readBytes;
                            break;
                        case PushMsg.IVIBRATE_FIELD_NUMBER /*18*/:
                            if ((i & METHOD_FIELD_NUMBER) != METHOD_FIELD_NUMBER) {
                                this.method_ = new ArrayList();
                                i |= METHOD_FIELD_NUMBER;
                            }
                            this.method_.add(codedInputStream.readMessage(MethodDescriptorProto.PARSER, extensionRegistryLite));
                            break;
                        case GameRoomBaseInfo.EGAMEROOMTYPE_FIELD_NUMBER /*26*/:
                            Builder toBuilder;
                            if ((this.bitField0_ & METHOD_FIELD_NUMBER) == METHOD_FIELD_NUMBER) {
                                toBuilder = this.options_.toBuilder();
                            } else {
                                toBuilder = null;
                            }
                            this.options_ = (ServiceOptions) codedInputStream.readMessage(ServiceOptions.PARSER, extensionRegistryLite);
                            if (toBuilder != null) {
                                toBuilder.mergeFrom(this.options_);
                                this.options_ = toBuilder.buildPartial();
                            }
                            this.bitField0_ |= METHOD_FIELD_NUMBER;
                            break;
                        default:
                            if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                obj = NAME_FIELD_NUMBER;
                                break;
                            }
                            break;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if ((i & METHOD_FIELD_NUMBER) == METHOD_FIELD_NUMBER) {
                        this.method_ = Collections.unmodifiableList(this.method_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                }
            }
            if ((i & METHOD_FIELD_NUMBER) == METHOD_FIELD_NUMBER) {
                this.method_ = Collections.unmodifiableList(this.method_);
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
        }

        public static final Descriptor getDescriptor() {
            return DescriptorProtos.f2786x158c73ed;
        }

        protected final FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.f2787xee335d6b.ensureFieldAccessorsInitialized(ServiceDescriptorProto.class, Builder.class);
        }

        static {
            PARSER = new C02971();
            ServiceDescriptorProto serviceDescriptorProto = new ServiceDescriptorProto(true);
            defaultInstance = serviceDescriptorProto;
            serviceDescriptorProto.initFields();
        }

        public final Parser<ServiceDescriptorProto> getParserForType() {
            return PARSER;
        }

        public final boolean hasName() {
            return (this.bitField0_ & NAME_FIELD_NUMBER) == NAME_FIELD_NUMBER;
        }

        public final String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String toStringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = toStringUtf8;
            }
            return toStringUtf8;
        }

        public final ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final List<MethodDescriptorProto> getMethodList() {
            return this.method_;
        }

        public final List<? extends MethodDescriptorProtoOrBuilder> getMethodOrBuilderList() {
            return this.method_;
        }

        public final int getMethodCount() {
            return this.method_.size();
        }

        public final MethodDescriptorProto getMethod(int i) {
            return (MethodDescriptorProto) this.method_.get(i);
        }

        public final MethodDescriptorProtoOrBuilder getMethodOrBuilder(int i) {
            return (MethodDescriptorProtoOrBuilder) this.method_.get(i);
        }

        public final boolean hasOptions() {
            return (this.bitField0_ & METHOD_FIELD_NUMBER) == METHOD_FIELD_NUMBER;
        }

        public final ServiceOptions getOptions() {
            return this.options_;
        }

        public final ServiceOptionsOrBuilder getOptionsOrBuilder() {
            return this.options_;
        }

        private void initFields() {
            this.name_ = LetterIndexBar.SEARCH_ICON_LETTER;
            this.method_ = Collections.emptyList();
            this.options_ = ServiceOptions.getDefaultInstance();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == null) {
                return false;
            }
            int i = 0;
            while (i < getMethodCount()) {
                if (getMethod(i).isInitialized()) {
                    i += NAME_FIELD_NUMBER;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (!hasOptions() || getOptions().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.bitField0_ & NAME_FIELD_NUMBER) == NAME_FIELD_NUMBER) {
                codedOutputStream.writeBytes(NAME_FIELD_NUMBER, getNameBytes());
            }
            for (int i = 0; i < this.method_.size(); i += NAME_FIELD_NUMBER) {
                codedOutputStream.writeMessage(METHOD_FIELD_NUMBER, (MessageLite) this.method_.get(i));
            }
            if ((this.bitField0_ & METHOD_FIELD_NUMBER) == METHOD_FIELD_NUMBER) {
                codedOutputStream.writeMessage(OPTIONS_FIELD_NUMBER, this.options_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public final int getSerializedSize() {
            int i = 0;
            int i2 = this.memoizedSerializedSize;
            if (i2 != -1) {
                return i2;
            }
            if ((this.bitField0_ & NAME_FIELD_NUMBER) == NAME_FIELD_NUMBER) {
                i2 = CodedOutputStream.computeBytesSize(NAME_FIELD_NUMBER, getNameBytes()) + 0;
            } else {
                i2 = 0;
            }
            int i3 = i2;
            while (i < this.method_.size()) {
                i += NAME_FIELD_NUMBER;
                i3 = CodedOutputStream.computeMessageSize(METHOD_FIELD_NUMBER, (MessageLite) this.method_.get(i)) + i3;
            }
            if ((this.bitField0_ & METHOD_FIELD_NUMBER) == METHOD_FIELD_NUMBER) {
                i3 += CodedOutputStream.computeMessageSize(OPTIONS_FIELD_NUMBER, this.options_);
            }
            i2 = getUnknownFields().getSerializedSize() + i3;
            this.memoizedSerializedSize = i2;
            return i2;
        }

        protected final Object writeReplace() {
            return super.writeReplace();
        }

        public static ServiceDescriptorProto parseFrom(ByteString byteString) {
            return (ServiceDescriptorProto) PARSER.parseFrom(byteString);
        }

        public static ServiceDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ServiceDescriptorProto) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ServiceDescriptorProto parseFrom(byte[] bArr) {
            return (ServiceDescriptorProto) PARSER.parseFrom(bArr);
        }

        public static ServiceDescriptorProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ServiceDescriptorProto) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ServiceDescriptorProto parseFrom(InputStream inputStream) {
            return (ServiceDescriptorProto) PARSER.parseFrom(inputStream);
        }

        public static ServiceDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ServiceDescriptorProto) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static ServiceDescriptorProto parseDelimitedFrom(InputStream inputStream) {
            return (ServiceDescriptorProto) PARSER.parseDelimitedFrom(inputStream);
        }

        public static ServiceDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ServiceDescriptorProto) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static ServiceDescriptorProto parseFrom(CodedInputStream codedInputStream) {
            return (ServiceDescriptorProto) PARSER.parseFrom(codedInputStream);
        }

        public static ServiceDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ServiceDescriptorProto) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ServiceDescriptorProto serviceDescriptorProto) {
            return newBuilder().mergeFrom(serviceDescriptorProto);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        protected final Builder newBuilderForType(BuilderParent builderParent) {
            return new Builder(null);
        }
    }

    public interface ServiceOptionsOrBuilder extends ExtendableMessageOrBuilder<ServiceOptions> {
        boolean getDeprecated();

        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i);

        List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList();

        boolean hasDeprecated();
    }

    public static final class ServiceOptions extends ExtendableMessage<ServiceOptions> implements ServiceOptionsOrBuilder {
        public static final int DEPRECATED_FIELD_NUMBER = 33;
        public static Parser<ServiceOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private static final ServiceOptions defaultInstance;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean deprecated_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<UninterpretedOption> uninterpretedOption_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.google.protobuf.DescriptorProtos.ServiceOptions.1 */
        static class C02981 extends AbstractParser<ServiceOptions> {
            C02981() {
            }

            public final ServiceOptions parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new ServiceOptions(extensionRegistryLite, null);
            }
        }

        public static final class Builder extends ExtendableBuilder<ServiceOptions, Builder> implements ServiceOptionsOrBuilder {
            private int bitField0_;
            private boolean deprecated_;
            private RepeatedFieldBuilder<UninterpretedOption, Builder, UninterpretedOptionOrBuilder> uninterpretedOptionBuilder_;
            private List<UninterpretedOption> uninterpretedOption_;

            public static final Descriptor getDescriptor() {
                return DescriptorProtos.internal_static_google_protobuf_ServiceOptions_descriptor;
            }

            protected final FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.f2788x371e666.ensureFieldAccessorsInitialized(ServiceOptions.class, Builder.class);
            }

            private Builder() {
                this.uninterpretedOption_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent builderParent) {
                super(builderParent);
                this.uninterpretedOption_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    getUninterpretedOptionFieldBuilder();
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public final Builder clear() {
                super.clear();
                this.deprecated_ = false;
                this.bitField0_ &= -2;
                if (this.uninterpretedOptionBuilder_ == null) {
                    this.uninterpretedOption_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                } else {
                    this.uninterpretedOptionBuilder_.clear();
                }
                return this;
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_ServiceOptions_descriptor;
            }

            public final ServiceOptions getDefaultInstanceForType() {
                return ServiceOptions.getDefaultInstance();
            }

            public final ServiceOptions build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
            }

            public final ServiceOptions buildPartial() {
                int i = 1;
                ServiceOptions serviceOptions = new ServiceOptions(null);
                if ((this.bitField0_ & 1) != 1) {
                    i = 0;
                }
                serviceOptions.deprecated_ = this.deprecated_;
                if (this.uninterpretedOptionBuilder_ == null) {
                    if ((this.bitField0_ & 2) == 2) {
                        this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                        this.bitField0_ &= -3;
                    }
                    serviceOptions.uninterpretedOption_ = this.uninterpretedOption_;
                } else {
                    serviceOptions.uninterpretedOption_ = this.uninterpretedOptionBuilder_.build();
                }
                serviceOptions.bitField0_ = i;
                onBuilt();
                return serviceOptions;
            }

            public final Builder mergeFrom(Message message) {
                if (message instanceof ServiceOptions) {
                    return mergeFrom((ServiceOptions) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public final Builder mergeFrom(ServiceOptions serviceOptions) {
                RepeatedFieldBuilder repeatedFieldBuilder = null;
                if (serviceOptions != ServiceOptions.getDefaultInstance()) {
                    if (serviceOptions.hasDeprecated()) {
                        setDeprecated(serviceOptions.getDeprecated());
                    }
                    if (this.uninterpretedOptionBuilder_ == null) {
                        if (!serviceOptions.uninterpretedOption_.isEmpty()) {
                            if (this.uninterpretedOption_.isEmpty()) {
                                this.uninterpretedOption_ = serviceOptions.uninterpretedOption_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureUninterpretedOptionIsMutable();
                                this.uninterpretedOption_.addAll(serviceOptions.uninterpretedOption_);
                            }
                            onChanged();
                        }
                    } else if (!serviceOptions.uninterpretedOption_.isEmpty()) {
                        if (this.uninterpretedOptionBuilder_.isEmpty()) {
                            this.uninterpretedOptionBuilder_.dispose();
                            this.uninterpretedOptionBuilder_ = null;
                            this.uninterpretedOption_ = serviceOptions.uninterpretedOption_;
                            this.bitField0_ &= -3;
                            if (GeneratedMessage.alwaysUseFieldBuilders) {
                                repeatedFieldBuilder = getUninterpretedOptionFieldBuilder();
                            }
                            this.uninterpretedOptionBuilder_ = repeatedFieldBuilder;
                        } else {
                            this.uninterpretedOptionBuilder_.addAllMessages(serviceOptions.uninterpretedOption_);
                        }
                    }
                    mergeExtensionFields(serviceOptions);
                    mergeUnknownFields(serviceOptions.getUnknownFields());
                }
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                    if (!getUninterpretedOption(i).isInitialized()) {
                        return false;
                    }
                }
                if (extensionsAreInitialized()) {
                    return true;
                }
                return false;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.google.protobuf.DescriptorProtos.ServiceOptions.Builder mergeFrom(com.google.protobuf.CodedInputStream r5, com.google.protobuf.ExtensionRegistryLite r6) {
                /*
                r4 = this;
                r2 = 0;
                r0 = com.google.protobuf.DescriptorProtos.ServiceOptions.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = (com.google.protobuf.DescriptorProtos.ServiceOptions) r0;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                if (r0 == 0) goto L_0x000e;
            L_0x000b:
                r4.mergeFrom(r0);
            L_0x000e:
                return r4;
            L_0x000f:
                r0 = move-exception;
                r1 = r0;
                r0 = r1.getUnfinishedMessage();	 Catch:{ all -> 0x0022 }
                r0 = (com.google.protobuf.DescriptorProtos.ServiceOptions) r0;	 Catch:{ all -> 0x0022 }
                throw r1;	 Catch:{ all -> 0x0018 }
            L_0x0018:
                r1 = move-exception;
                r3 = r1;
                r1 = r0;
                r0 = r3;
            L_0x001c:
                if (r1 == 0) goto L_0x0021;
            L_0x001e:
                r4.mergeFrom(r1);
            L_0x0021:
                throw r0;
            L_0x0022:
                r0 = move-exception;
                r1 = r2;
                goto L_0x001c;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.ServiceOptions.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.DescriptorProtos$ServiceOptions$Builder");
            }

            public final boolean hasDeprecated() {
                return (this.bitField0_ & 1) == 1;
            }

            public final boolean getDeprecated() {
                return this.deprecated_;
            }

            public final Builder setDeprecated(boolean z) {
                this.bitField0_ |= 1;
                this.deprecated_ = z;
                onChanged();
                return this;
            }

            public final Builder clearDeprecated() {
                this.bitField0_ &= -2;
                this.deprecated_ = false;
                onChanged();
                return this;
            }

            private void ensureUninterpretedOptionIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.uninterpretedOption_ = new ArrayList(this.uninterpretedOption_);
                    this.bitField0_ |= 2;
                }
            }

            public final List<UninterpretedOption> getUninterpretedOptionList() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    return Collections.unmodifiableList(this.uninterpretedOption_);
                }
                return this.uninterpretedOptionBuilder_.getMessageList();
            }

            public final int getUninterpretedOptionCount() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    return this.uninterpretedOption_.size();
                }
                return this.uninterpretedOptionBuilder_.getCount();
            }

            public final UninterpretedOption getUninterpretedOption(int i) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    return (UninterpretedOption) this.uninterpretedOption_.get(i);
                }
                return (UninterpretedOption) this.uninterpretedOptionBuilder_.getMessage(i);
            }

            public final Builder setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
                if (this.uninterpretedOptionBuilder_ != null) {
                    this.uninterpretedOptionBuilder_.setMessage(i, uninterpretedOption);
                } else if (uninterpretedOption == null) {
                    throw new NullPointerException();
                } else {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.set(i, uninterpretedOption);
                    onChanged();
                }
                return this;
            }

            public final Builder setUninterpretedOption(int i, Builder builder) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.set(i, builder.build());
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
                if (this.uninterpretedOptionBuilder_ != null) {
                    this.uninterpretedOptionBuilder_.addMessage(uninterpretedOption);
                } else if (uninterpretedOption == null) {
                    throw new NullPointerException();
                } else {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.add(uninterpretedOption);
                    onChanged();
                }
                return this;
            }

            public final Builder addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
                if (this.uninterpretedOptionBuilder_ != null) {
                    this.uninterpretedOptionBuilder_.addMessage(i, uninterpretedOption);
                } else if (uninterpretedOption == null) {
                    throw new NullPointerException();
                } else {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.add(i, uninterpretedOption);
                    onChanged();
                }
                return this;
            }

            public final Builder addUninterpretedOption(Builder builder) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.add(builder.build());
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public final Builder addUninterpretedOption(int i, Builder builder) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.add(i, builder.build());
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.uninterpretedOption_);
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public final Builder clearUninterpretedOption() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    this.uninterpretedOption_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.clear();
                }
                return this;
            }

            public final Builder removeUninterpretedOption(int i) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    ensureUninterpretedOptionIsMutable();
                    this.uninterpretedOption_.remove(i);
                    onChanged();
                } else {
                    this.uninterpretedOptionBuilder_.remove(i);
                }
                return this;
            }

            public final Builder getUninterpretedOptionBuilder(int i) {
                return (Builder) getUninterpretedOptionFieldBuilder().getBuilder(i);
            }

            public final UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i) {
                if (this.uninterpretedOptionBuilder_ == null) {
                    return (UninterpretedOptionOrBuilder) this.uninterpretedOption_.get(i);
                }
                return (UninterpretedOptionOrBuilder) this.uninterpretedOptionBuilder_.getMessageOrBuilder(i);
            }

            public final List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
                if (this.uninterpretedOptionBuilder_ != null) {
                    return this.uninterpretedOptionBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.uninterpretedOption_);
            }

            public final Builder addUninterpretedOptionBuilder() {
                return (Builder) getUninterpretedOptionFieldBuilder().addBuilder(UninterpretedOption.getDefaultInstance());
            }

            public final Builder addUninterpretedOptionBuilder(int i) {
                return (Builder) getUninterpretedOptionFieldBuilder().addBuilder(i, UninterpretedOption.getDefaultInstance());
            }

            public final List<Builder> getUninterpretedOptionBuilderList() {
                return getUninterpretedOptionFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<UninterpretedOption, Builder, UninterpretedOptionOrBuilder> getUninterpretedOptionFieldBuilder() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    this.uninterpretedOptionBuilder_ = new RepeatedFieldBuilder(this.uninterpretedOption_, (this.bitField0_ & 2) == 2, getParentForChildren(), isClean());
                    this.uninterpretedOption_ = null;
                }
                return this.uninterpretedOptionBuilder_;
            }
        }

        private ServiceOptions(ExtendableBuilder<ServiceOptions, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        private ServiceOptions(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static ServiceOptions getDefaultInstance() {
            return defaultInstance;
        }

        public final ServiceOptions getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private ServiceOptions(com.google.protobuf.CodedInputStream r9, com.google.protobuf.ExtensionRegistryLite r10) {
            /*
            r8 = this;
            r2 = 1;
            r0 = 0;
            r1 = -1;
            r6 = 2;
            r8.<init>();
            r8.memoizedIsInitialized = r1;
            r8.memoizedSerializedSize = r1;
            r8.initFields();
            r3 = com.google.protobuf.UnknownFieldSet.newBuilder();
            r1 = r0;
        L_0x0013:
            if (r1 != 0) goto L_0x007e;
        L_0x0015:
            r4 = r9.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            switch(r4) {
                case 0: goto L_0x0024;
                case 264: goto L_0x0026;
                case 7994: goto L_0x0053;
                default: goto L_0x001c;
            };	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
        L_0x001c:
            r4 = r8.parseUnknownField(r9, r3, r10, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            if (r4 != 0) goto L_0x0013;
        L_0x0022:
            r1 = r2;
            goto L_0x0013;
        L_0x0024:
            r1 = r2;
            goto L_0x0013;
        L_0x0026:
            r4 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            r4 = r4 | 1;
            r8.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            r4 = r9.readBool();	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            r8.deprecated_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            goto L_0x0013;
        L_0x0033:
            r1 = move-exception;
            r7 = r1;
            r1 = r0;
            r0 = r7;
            r0 = r0.setUnfinishedMessage(r8);	 Catch:{ all -> 0x003c }
            throw r0;	 Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception;
        L_0x003d:
            r1 = r1 & 2;
            if (r1 != r6) goto L_0x0049;
        L_0x0041:
            r1 = r8.uninterpretedOption_;
            r1 = java.util.Collections.unmodifiableList(r1);
            r8.uninterpretedOption_ = r1;
        L_0x0049:
            r1 = r3.build();
            r8.unknownFields = r1;
            r8.makeExtensionsImmutable();
            throw r0;
        L_0x0053:
            r4 = r0 & 2;
            if (r4 == r6) goto L_0x0060;
        L_0x0057:
            r4 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            r4.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            r8.uninterpretedOption_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            r0 = r0 | 2;
        L_0x0060:
            r4 = r8.uninterpretedOption_;	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            r5 = com.google.protobuf.DescriptorProtos.UninterpretedOption.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            r5 = r9.readMessage(r5, r10);	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            r4.add(r5);	 Catch:{ InvalidProtocolBufferException -> 0x0033, IOException -> 0x006c, all -> 0x0094 }
            goto L_0x0013;
        L_0x006c:
            r1 = move-exception;
            r7 = r1;
            r1 = r0;
            r0 = r7;
            r2 = new com.google.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x003c }
            r0 = r0.getMessage();	 Catch:{ all -> 0x003c }
            r2.<init>(r0);	 Catch:{ all -> 0x003c }
            r0 = r2.setUnfinishedMessage(r8);	 Catch:{ all -> 0x003c }
            throw r0;	 Catch:{ all -> 0x003c }
        L_0x007e:
            r0 = r0 & 2;
            if (r0 != r6) goto L_0x008a;
        L_0x0082:
            r0 = r8.uninterpretedOption_;
            r0 = java.util.Collections.unmodifiableList(r0);
            r8.uninterpretedOption_ = r0;
        L_0x008a:
            r0 = r3.build();
            r8.unknownFields = r0;
            r8.makeExtensionsImmutable();
            return;
        L_0x0094:
            r1 = move-exception;
            r7 = r1;
            r1 = r0;
            r0 = r7;
            goto L_0x003d;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.ServiceOptions.<init>(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):void");
        }

        public static final Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_ServiceOptions_descriptor;
        }

        protected final FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.f2788x371e666.ensureFieldAccessorsInitialized(ServiceOptions.class, Builder.class);
        }

        static {
            PARSER = new C02981();
            ServiceOptions serviceOptions = new ServiceOptions(true);
            defaultInstance = serviceOptions;
            serviceOptions.initFields();
        }

        public final Parser<ServiceOptions> getParserForType() {
            return PARSER;
        }

        public final boolean hasDeprecated() {
            return (this.bitField0_ & 1) == 1;
        }

        public final boolean getDeprecated() {
            return this.deprecated_;
        }

        public final List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public final List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        public final int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public final UninterpretedOption getUninterpretedOption(int i) {
            return (UninterpretedOption) this.uninterpretedOption_.get(i);
        }

        public final UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i) {
            return (UninterpretedOptionOrBuilder) this.uninterpretedOption_.get(i);
        }

        private void initFields() {
            this.deprecated_ = false;
            this.uninterpretedOption_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == null) {
                return false;
            }
            int i = 0;
            while (i < getUninterpretedOptionCount()) {
                if (getUninterpretedOption(i).isInitialized()) {
                    i++;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeBool(DEPRECATED_FIELD_NUMBER, this.deprecated_);
            }
            for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
                codedOutputStream.writeMessage(UNINTERPRETED_OPTION_FIELD_NUMBER, (MessageLite) this.uninterpretedOption_.get(i));
            }
            newExtensionWriter.writeUntil(536870912, codedOutputStream);
            getUnknownFields().writeTo(codedOutputStream);
        }

        public final int getSerializedSize() {
            int i = 0;
            int i2 = this.memoizedSerializedSize;
            if (i2 != -1) {
                return i2;
            }
            if ((this.bitField0_ & 1) == 1) {
                i2 = CodedOutputStream.computeBoolSize(DEPRECATED_FIELD_NUMBER, this.deprecated_) + 0;
            } else {
                i2 = 0;
            }
            int i3 = i2;
            while (i < this.uninterpretedOption_.size()) {
                i++;
                i3 = CodedOutputStream.computeMessageSize(UNINTERPRETED_OPTION_FIELD_NUMBER, (MessageLite) this.uninterpretedOption_.get(i)) + i3;
            }
            i2 = (extensionsSerializedSize() + i3) + getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = i2;
            return i2;
        }

        protected final Object writeReplace() {
            return super.writeReplace();
        }

        public static ServiceOptions parseFrom(ByteString byteString) {
            return (ServiceOptions) PARSER.parseFrom(byteString);
        }

        public static ServiceOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ServiceOptions) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ServiceOptions parseFrom(byte[] bArr) {
            return (ServiceOptions) PARSER.parseFrom(bArr);
        }

        public static ServiceOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ServiceOptions) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ServiceOptions parseFrom(InputStream inputStream) {
            return (ServiceOptions) PARSER.parseFrom(inputStream);
        }

        public static ServiceOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ServiceOptions) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static ServiceOptions parseDelimitedFrom(InputStream inputStream) {
            return (ServiceOptions) PARSER.parseDelimitedFrom(inputStream);
        }

        public static ServiceOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ServiceOptions) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static ServiceOptions parseFrom(CodedInputStream codedInputStream) {
            return (ServiceOptions) PARSER.parseFrom(codedInputStream);
        }

        public static ServiceOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ServiceOptions) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ServiceOptions serviceOptions) {
            return newBuilder().mergeFrom(serviceOptions);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        protected final Builder newBuilderForType(BuilderParent builderParent) {
            return new Builder(null);
        }
    }

    public interface SourceCodeInfoOrBuilder extends MessageOrBuilder {
        Location getLocation(int i);

        int getLocationCount();

        List<Location> getLocationList();

        LocationOrBuilder getLocationOrBuilder(int i);

        List<? extends LocationOrBuilder> getLocationOrBuilderList();
    }

    public static final class SourceCodeInfo extends GeneratedMessage implements SourceCodeInfoOrBuilder {
        public static final int LOCATION_FIELD_NUMBER = 1;
        public static Parser<SourceCodeInfo> PARSER;
        private static final SourceCodeInfo defaultInstance;
        private static final long serialVersionUID = 0;
        private List<Location> location_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.google.protobuf.DescriptorProtos.SourceCodeInfo.1 */
        static class C02991 extends AbstractParser<SourceCodeInfo> {
            C02991() {
            }

            public final SourceCodeInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new SourceCodeInfo(extensionRegistryLite, null);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SourceCodeInfoOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilder<Location, Builder, LocationOrBuilder> locationBuilder_;
            private List<Location> location_;

            public static final Descriptor getDescriptor() {
                return DescriptorProtos.internal_static_google_protobuf_SourceCodeInfo_descriptor;
            }

            protected final FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.f2791x532209f9.ensureFieldAccessorsInitialized(SourceCodeInfo.class, Builder.class);
            }

            private Builder() {
                this.location_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent builderParent) {
                super(builderParent);
                this.location_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    getLocationFieldBuilder();
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public final Builder clear() {
                super.clear();
                if (this.locationBuilder_ == null) {
                    this.location_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    this.locationBuilder_.clear();
                }
                return this;
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_SourceCodeInfo_descriptor;
            }

            public final SourceCodeInfo getDefaultInstanceForType() {
                return SourceCodeInfo.getDefaultInstance();
            }

            public final SourceCodeInfo build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
            }

            public final SourceCodeInfo buildPartial() {
                SourceCodeInfo sourceCodeInfo = new SourceCodeInfo(null);
                if (this.locationBuilder_ == null) {
                    if ((this.bitField0_ & SourceCodeInfo.LOCATION_FIELD_NUMBER) == SourceCodeInfo.LOCATION_FIELD_NUMBER) {
                        this.location_ = Collections.unmodifiableList(this.location_);
                        this.bitField0_ &= -2;
                    }
                    sourceCodeInfo.location_ = this.location_;
                } else {
                    sourceCodeInfo.location_ = this.locationBuilder_.build();
                }
                onBuilt();
                return sourceCodeInfo;
            }

            public final Builder mergeFrom(Message message) {
                if (message instanceof SourceCodeInfo) {
                    return mergeFrom((SourceCodeInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public final Builder mergeFrom(SourceCodeInfo sourceCodeInfo) {
                RepeatedFieldBuilder repeatedFieldBuilder = null;
                if (sourceCodeInfo != SourceCodeInfo.getDefaultInstance()) {
                    if (this.locationBuilder_ == null) {
                        if (!sourceCodeInfo.location_.isEmpty()) {
                            if (this.location_.isEmpty()) {
                                this.location_ = sourceCodeInfo.location_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureLocationIsMutable();
                                this.location_.addAll(sourceCodeInfo.location_);
                            }
                            onChanged();
                        }
                    } else if (!sourceCodeInfo.location_.isEmpty()) {
                        if (this.locationBuilder_.isEmpty()) {
                            this.locationBuilder_.dispose();
                            this.locationBuilder_ = null;
                            this.location_ = sourceCodeInfo.location_;
                            this.bitField0_ &= -2;
                            if (GeneratedMessage.alwaysUseFieldBuilders) {
                                repeatedFieldBuilder = getLocationFieldBuilder();
                            }
                            this.locationBuilder_ = repeatedFieldBuilder;
                        } else {
                            this.locationBuilder_.addAllMessages(sourceCodeInfo.location_);
                        }
                    }
                    mergeUnknownFields(sourceCodeInfo.getUnknownFields());
                }
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder mergeFrom(com.google.protobuf.CodedInputStream r5, com.google.protobuf.ExtensionRegistryLite r6) {
                /*
                r4 = this;
                r2 = 0;
                r0 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = (com.google.protobuf.DescriptorProtos.SourceCodeInfo) r0;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                if (r0 == 0) goto L_0x000e;
            L_0x000b:
                r4.mergeFrom(r0);
            L_0x000e:
                return r4;
            L_0x000f:
                r0 = move-exception;
                r1 = r0;
                r0 = r1.getUnfinishedMessage();	 Catch:{ all -> 0x0022 }
                r0 = (com.google.protobuf.DescriptorProtos.SourceCodeInfo) r0;	 Catch:{ all -> 0x0022 }
                throw r1;	 Catch:{ all -> 0x0018 }
            L_0x0018:
                r1 = move-exception;
                r3 = r1;
                r1 = r0;
                r0 = r3;
            L_0x001c:
                if (r1 == 0) goto L_0x0021;
            L_0x001e:
                r4.mergeFrom(r1);
            L_0x0021:
                throw r0;
            L_0x0022:
                r0 = move-exception;
                r1 = r2;
                goto L_0x001c;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.DescriptorProtos$SourceCodeInfo$Builder");
            }

            private void ensureLocationIsMutable() {
                if ((this.bitField0_ & SourceCodeInfo.LOCATION_FIELD_NUMBER) != SourceCodeInfo.LOCATION_FIELD_NUMBER) {
                    this.location_ = new ArrayList(this.location_);
                    this.bitField0_ |= SourceCodeInfo.LOCATION_FIELD_NUMBER;
                }
            }

            public final List<Location> getLocationList() {
                if (this.locationBuilder_ == null) {
                    return Collections.unmodifiableList(this.location_);
                }
                return this.locationBuilder_.getMessageList();
            }

            public final int getLocationCount() {
                if (this.locationBuilder_ == null) {
                    return this.location_.size();
                }
                return this.locationBuilder_.getCount();
            }

            public final Location getLocation(int i) {
                if (this.locationBuilder_ == null) {
                    return (Location) this.location_.get(i);
                }
                return (Location) this.locationBuilder_.getMessage(i);
            }

            public final Builder setLocation(int i, Location location) {
                if (this.locationBuilder_ != null) {
                    this.locationBuilder_.setMessage(i, location);
                } else if (location == null) {
                    throw new NullPointerException();
                } else {
                    ensureLocationIsMutable();
                    this.location_.set(i, location);
                    onChanged();
                }
                return this;
            }

            public final Builder setLocation(int i, Builder builder) {
                if (this.locationBuilder_ == null) {
                    ensureLocationIsMutable();
                    this.location_.set(i, builder.build());
                    onChanged();
                } else {
                    this.locationBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addLocation(Location location) {
                if (this.locationBuilder_ != null) {
                    this.locationBuilder_.addMessage(location);
                } else if (location == null) {
                    throw new NullPointerException();
                } else {
                    ensureLocationIsMutable();
                    this.location_.add(location);
                    onChanged();
                }
                return this;
            }

            public final Builder addLocation(int i, Location location) {
                if (this.locationBuilder_ != null) {
                    this.locationBuilder_.addMessage(i, location);
                } else if (location == null) {
                    throw new NullPointerException();
                } else {
                    ensureLocationIsMutable();
                    this.location_.add(i, location);
                    onChanged();
                }
                return this;
            }

            public final Builder addLocation(Builder builder) {
                if (this.locationBuilder_ == null) {
                    ensureLocationIsMutable();
                    this.location_.add(builder.build());
                    onChanged();
                } else {
                    this.locationBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public final Builder addLocation(int i, Builder builder) {
                if (this.locationBuilder_ == null) {
                    ensureLocationIsMutable();
                    this.location_.add(i, builder.build());
                    onChanged();
                } else {
                    this.locationBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addAllLocation(Iterable<? extends Location> iterable) {
                if (this.locationBuilder_ == null) {
                    ensureLocationIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.location_);
                    onChanged();
                } else {
                    this.locationBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public final Builder clearLocation() {
                if (this.locationBuilder_ == null) {
                    this.location_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    this.locationBuilder_.clear();
                }
                return this;
            }

            public final Builder removeLocation(int i) {
                if (this.locationBuilder_ == null) {
                    ensureLocationIsMutable();
                    this.location_.remove(i);
                    onChanged();
                } else {
                    this.locationBuilder_.remove(i);
                }
                return this;
            }

            public final Builder getLocationBuilder(int i) {
                return (Builder) getLocationFieldBuilder().getBuilder(i);
            }

            public final LocationOrBuilder getLocationOrBuilder(int i) {
                if (this.locationBuilder_ == null) {
                    return (LocationOrBuilder) this.location_.get(i);
                }
                return (LocationOrBuilder) this.locationBuilder_.getMessageOrBuilder(i);
            }

            public final List<? extends LocationOrBuilder> getLocationOrBuilderList() {
                if (this.locationBuilder_ != null) {
                    return this.locationBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.location_);
            }

            public final Builder addLocationBuilder() {
                return (Builder) getLocationFieldBuilder().addBuilder(Location.getDefaultInstance());
            }

            public final Builder addLocationBuilder(int i) {
                return (Builder) getLocationFieldBuilder().addBuilder(i, Location.getDefaultInstance());
            }

            public final List<Builder> getLocationBuilderList() {
                return getLocationFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<Location, Builder, LocationOrBuilder> getLocationFieldBuilder() {
                boolean z = true;
                if (this.locationBuilder_ == null) {
                    List list = this.location_;
                    if ((this.bitField0_ & SourceCodeInfo.LOCATION_FIELD_NUMBER) != SourceCodeInfo.LOCATION_FIELD_NUMBER) {
                        z = false;
                    }
                    this.locationBuilder_ = new RepeatedFieldBuilder(list, z, getParentForChildren(), isClean());
                    this.location_ = null;
                }
                return this.locationBuilder_;
            }
        }

        public interface LocationOrBuilder extends MessageOrBuilder {
            String getLeadingComments();

            ByteString getLeadingCommentsBytes();

            int getPath(int i);

            int getPathCount();

            List<Integer> getPathList();

            int getSpan(int i);

            int getSpanCount();

            List<Integer> getSpanList();

            String getTrailingComments();

            ByteString getTrailingCommentsBytes();

            boolean hasLeadingComments();

            boolean hasTrailingComments();
        }

        public static final class Location extends GeneratedMessage implements LocationOrBuilder {
            public static final int LEADING_COMMENTS_FIELD_NUMBER = 3;
            public static Parser<Location> PARSER = null;
            public static final int PATH_FIELD_NUMBER = 1;
            public static final int SPAN_FIELD_NUMBER = 2;
            public static final int TRAILING_COMMENTS_FIELD_NUMBER = 4;
            private static final Location defaultInstance;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private Object leadingComments_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            private int pathMemoizedSerializedSize;
            private List<Integer> path_;
            private int spanMemoizedSerializedSize;
            private List<Integer> span_;
            private Object trailingComments_;
            private final UnknownFieldSet unknownFields;

            /* renamed from: com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.1 */
            static class C03001 extends AbstractParser<Location> {
                C03001() {
                }

                public final Location parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new Location(extensionRegistryLite, null);
                }
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements LocationOrBuilder {
                private int bitField0_;
                private Object leadingComments_;
                private List<Integer> path_;
                private List<Integer> span_;
                private Object trailingComments_;

                public static final Descriptor getDescriptor() {
                    return DescriptorProtos.f2789xb210d08d;
                }

                protected final FieldAccessorTable internalGetFieldAccessorTable() {
                    return DescriptorProtos.f2790x9611a0b.ensureFieldAccessorsInitialized(Location.class, Builder.class);
                }

                private Builder() {
                    this.path_ = Collections.emptyList();
                    this.span_ = Collections.emptyList();
                    this.leadingComments_ = LetterIndexBar.SEARCH_ICON_LETTER;
                    this.trailingComments_ = LetterIndexBar.SEARCH_ICON_LETTER;
                    maybeForceBuilderInitialization();
                }

                private Builder(BuilderParent builderParent) {
                    super(builderParent);
                    this.path_ = Collections.emptyList();
                    this.span_ = Collections.emptyList();
                    this.leadingComments_ = LetterIndexBar.SEARCH_ICON_LETTER;
                    this.trailingComments_ = LetterIndexBar.SEARCH_ICON_LETTER;
                    maybeForceBuilderInitialization();
                }

                private void maybeForceBuilderInitialization() {
                    boolean z = GeneratedMessage.alwaysUseFieldBuilders;
                }

                private static Builder create() {
                    return new Builder();
                }

                public final Builder clear() {
                    super.clear();
                    this.path_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    this.span_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    this.leadingComments_ = LetterIndexBar.SEARCH_ICON_LETTER;
                    this.bitField0_ &= -5;
                    this.trailingComments_ = LetterIndexBar.SEARCH_ICON_LETTER;
                    this.bitField0_ &= -9;
                    return this;
                }

                public final Builder clone() {
                    return create().mergeFrom(buildPartial());
                }

                public final Descriptor getDescriptorForType() {
                    return DescriptorProtos.f2789xb210d08d;
                }

                public final Location getDefaultInstanceForType() {
                    return Location.getDefaultInstance();
                }

                public final Location build() {
                    Object buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
                }

                public final Location buildPartial() {
                    int i = Location.PATH_FIELD_NUMBER;
                    Location location = new Location(null);
                    int i2 = this.bitField0_;
                    if ((this.bitField0_ & Location.PATH_FIELD_NUMBER) == Location.PATH_FIELD_NUMBER) {
                        this.path_ = Collections.unmodifiableList(this.path_);
                        this.bitField0_ &= -2;
                    }
                    location.path_ = this.path_;
                    if ((this.bitField0_ & Location.SPAN_FIELD_NUMBER) == Location.SPAN_FIELD_NUMBER) {
                        this.span_ = Collections.unmodifiableList(this.span_);
                        this.bitField0_ &= -3;
                    }
                    location.span_ = this.span_;
                    if ((i2 & Location.TRAILING_COMMENTS_FIELD_NUMBER) != Location.TRAILING_COMMENTS_FIELD_NUMBER) {
                        i = 0;
                    }
                    location.leadingComments_ = this.leadingComments_;
                    if ((i2 & 8) == 8) {
                        i |= Location.SPAN_FIELD_NUMBER;
                    }
                    location.trailingComments_ = this.trailingComments_;
                    location.bitField0_ = i;
                    onBuilt();
                    return location;
                }

                public final Builder mergeFrom(Message message) {
                    if (message instanceof Location) {
                        return mergeFrom((Location) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public final Builder mergeFrom(Location location) {
                    if (location != Location.getDefaultInstance()) {
                        if (!location.path_.isEmpty()) {
                            if (this.path_.isEmpty()) {
                                this.path_ = location.path_;
                                this.bitField0_ &= -2;
                            } else {
                                ensurePathIsMutable();
                                this.path_.addAll(location.path_);
                            }
                            onChanged();
                        }
                        if (!location.span_.isEmpty()) {
                            if (this.span_.isEmpty()) {
                                this.span_ = location.span_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureSpanIsMutable();
                                this.span_.addAll(location.span_);
                            }
                            onChanged();
                        }
                        if (location.hasLeadingComments()) {
                            this.bitField0_ |= Location.TRAILING_COMMENTS_FIELD_NUMBER;
                            this.leadingComments_ = location.leadingComments_;
                            onChanged();
                        }
                        if (location.hasTrailingComments()) {
                            this.bitField0_ |= 8;
                            this.trailingComments_ = location.trailingComments_;
                            onChanged();
                        }
                        mergeUnknownFields(location.getUnknownFields());
                    }
                    return this;
                }

                public final boolean isInitialized() {
                    return true;
                }

                /* JADX WARNING: inconsistent code. */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder mergeFrom(com.google.protobuf.CodedInputStream r5, com.google.protobuf.ExtensionRegistryLite r6) {
                    /*
                    r4 = this;
                    r2 = 0;
                    r0 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                    r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                    r0 = (com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location) r0;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                    if (r0 == 0) goto L_0x000e;
                L_0x000b:
                    r4.mergeFrom(r0);
                L_0x000e:
                    return r4;
                L_0x000f:
                    r0 = move-exception;
                    r1 = r0;
                    r0 = r1.getUnfinishedMessage();	 Catch:{ all -> 0x0022 }
                    r0 = (com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location) r0;	 Catch:{ all -> 0x0022 }
                    throw r1;	 Catch:{ all -> 0x0018 }
                L_0x0018:
                    r1 = move-exception;
                    r3 = r1;
                    r1 = r0;
                    r0 = r3;
                L_0x001c:
                    if (r1 == 0) goto L_0x0021;
                L_0x001e:
                    r4.mergeFrom(r1);
                L_0x0021:
                    throw r0;
                L_0x0022:
                    r0 = move-exception;
                    r1 = r2;
                    goto L_0x001c;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.DescriptorProtos$SourceCodeInfo$Location$Builder");
                }

                private void ensurePathIsMutable() {
                    if ((this.bitField0_ & Location.PATH_FIELD_NUMBER) != Location.PATH_FIELD_NUMBER) {
                        this.path_ = new ArrayList(this.path_);
                        this.bitField0_ |= Location.PATH_FIELD_NUMBER;
                    }
                }

                public final List<Integer> getPathList() {
                    return Collections.unmodifiableList(this.path_);
                }

                public final int getPathCount() {
                    return this.path_.size();
                }

                public final int getPath(int i) {
                    return ((Integer) this.path_.get(i)).intValue();
                }

                public final Builder setPath(int i, int i2) {
                    ensurePathIsMutable();
                    this.path_.set(i, Integer.valueOf(i2));
                    onChanged();
                    return this;
                }

                public final Builder addPath(int i) {
                    ensurePathIsMutable();
                    this.path_.add(Integer.valueOf(i));
                    onChanged();
                    return this;
                }

                public final Builder addAllPath(Iterable<? extends Integer> iterable) {
                    ensurePathIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.path_);
                    onChanged();
                    return this;
                }

                public final Builder clearPath() {
                    this.path_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                private void ensureSpanIsMutable() {
                    if ((this.bitField0_ & Location.SPAN_FIELD_NUMBER) != Location.SPAN_FIELD_NUMBER) {
                        this.span_ = new ArrayList(this.span_);
                        this.bitField0_ |= Location.SPAN_FIELD_NUMBER;
                    }
                }

                public final List<Integer> getSpanList() {
                    return Collections.unmodifiableList(this.span_);
                }

                public final int getSpanCount() {
                    return this.span_.size();
                }

                public final int getSpan(int i) {
                    return ((Integer) this.span_.get(i)).intValue();
                }

                public final Builder setSpan(int i, int i2) {
                    ensureSpanIsMutable();
                    this.span_.set(i, Integer.valueOf(i2));
                    onChanged();
                    return this;
                }

                public final Builder addSpan(int i) {
                    ensureSpanIsMutable();
                    this.span_.add(Integer.valueOf(i));
                    onChanged();
                    return this;
                }

                public final Builder addAllSpan(Iterable<? extends Integer> iterable) {
                    ensureSpanIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.span_);
                    onChanged();
                    return this;
                }

                public final Builder clearSpan() {
                    this.span_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    onChanged();
                    return this;
                }

                public final boolean hasLeadingComments() {
                    return (this.bitField0_ & Location.TRAILING_COMMENTS_FIELD_NUMBER) == Location.TRAILING_COMMENTS_FIELD_NUMBER;
                }

                public final String getLeadingComments() {
                    Object obj = this.leadingComments_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String toStringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.leadingComments_ = toStringUtf8;
                    }
                    return toStringUtf8;
                }

                public final ByteString getLeadingCommentsBytes() {
                    Object obj = this.leadingComments_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.leadingComments_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public final Builder setLeadingComments(String str) {
                    if (str == null) {
                        throw new NullPointerException();
                    }
                    this.bitField0_ |= Location.TRAILING_COMMENTS_FIELD_NUMBER;
                    this.leadingComments_ = str;
                    onChanged();
                    return this;
                }

                public final Builder clearLeadingComments() {
                    this.bitField0_ &= -5;
                    this.leadingComments_ = Location.getDefaultInstance().getLeadingComments();
                    onChanged();
                    return this;
                }

                public final Builder setLeadingCommentsBytes(ByteString byteString) {
                    if (byteString == null) {
                        throw new NullPointerException();
                    }
                    this.bitField0_ |= Location.TRAILING_COMMENTS_FIELD_NUMBER;
                    this.leadingComments_ = byteString;
                    onChanged();
                    return this;
                }

                public final boolean hasTrailingComments() {
                    return (this.bitField0_ & 8) == 8;
                }

                public final String getTrailingComments() {
                    Object obj = this.trailingComments_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String toStringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.trailingComments_ = toStringUtf8;
                    }
                    return toStringUtf8;
                }

                public final ByteString getTrailingCommentsBytes() {
                    Object obj = this.trailingComments_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.trailingComments_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public final Builder setTrailingComments(String str) {
                    if (str == null) {
                        throw new NullPointerException();
                    }
                    this.bitField0_ |= 8;
                    this.trailingComments_ = str;
                    onChanged();
                    return this;
                }

                public final Builder clearTrailingComments() {
                    this.bitField0_ &= -9;
                    this.trailingComments_ = Location.getDefaultInstance().getTrailingComments();
                    onChanged();
                    return this;
                }

                public final Builder setTrailingCommentsBytes(ByteString byteString) {
                    if (byteString == null) {
                        throw new NullPointerException();
                    }
                    this.bitField0_ |= 8;
                    this.trailingComments_ = byteString;
                    onChanged();
                    return this;
                }
            }

            private Location(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.pathMemoizedSerializedSize = -1;
                this.spanMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = builder.getUnknownFields();
            }

            private Location(boolean z) {
                this.pathMemoizedSerializedSize = -1;
                this.spanMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = UnknownFieldSet.getDefaultInstance();
            }

            public static Location getDefaultInstance() {
                return defaultInstance;
            }

            public final Location getDefaultInstanceForType() {
                return defaultInstance;
            }

            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            private Location(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Object obj = null;
                this.pathMemoizedSerializedSize = -1;
                this.spanMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                initFields();
                com.google.protobuf.UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                int i = 0;
                while (obj == null) {
                    try {
                        int readTag = codedInputStream.readTag();
                        ByteString readBytes;
                        switch (readTag) {
                            case SQLiteDatabase.OPEN_READWRITE /*0*/:
                                obj = PATH_FIELD_NUMBER;
                                break;
                            case QuickGameRoomPushMsg.VUSERS_FIELD_NUMBER /*8*/:
                                if ((i & PATH_FIELD_NUMBER) != PATH_FIELD_NUMBER) {
                                    this.path_ = new ArrayList();
                                    i |= PATH_FIELD_NUMBER;
                                }
                                this.path_.add(Integer.valueOf(codedInputStream.readInt32()));
                                break;
                            case PushMsg.SMSG_FIELD_NUMBER /*10*/:
                                readTag = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i & PATH_FIELD_NUMBER) != PATH_FIELD_NUMBER && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.path_ = new ArrayList();
                                    i |= PATH_FIELD_NUMBER;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.path_.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(readTag);
                                break;
                            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                                if ((i & SPAN_FIELD_NUMBER) != SPAN_FIELD_NUMBER) {
                                    this.span_ = new ArrayList();
                                    i |= SPAN_FIELD_NUMBER;
                                }
                                this.span_.add(Integer.valueOf(codedInputStream.readInt32()));
                                break;
                            case PushMsg.IVIBRATE_FIELD_NUMBER /*18*/:
                                readTag = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i & SPAN_FIELD_NUMBER) != SPAN_FIELD_NUMBER && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.span_ = new ArrayList();
                                    i |= SPAN_FIELD_NUMBER;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.span_.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(readTag);
                                break;
                            case GameRoomBaseInfo.EGAMEROOMTYPE_FIELD_NUMBER /*26*/:
                                readBytes = codedInputStream.readBytes();
                                this.bitField0_ |= PATH_FIELD_NUMBER;
                                this.leadingComments_ = readBytes;
                                break;
                            case GameRoomBaseInfo.ITHINKINGINTERVAL_FIELD_NUMBER /*34*/:
                                readBytes = codedInputStream.readBytes();
                                this.bitField0_ |= SPAN_FIELD_NUMBER;
                                this.trailingComments_ = readBytes;
                                break;
                            default:
                                if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                    obj = PATH_FIELD_NUMBER;
                                    break;
                                }
                                break;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        if ((i & PATH_FIELD_NUMBER) == PATH_FIELD_NUMBER) {
                            this.path_ = Collections.unmodifiableList(this.path_);
                        }
                        if ((i & SPAN_FIELD_NUMBER) == SPAN_FIELD_NUMBER) {
                            this.span_ = Collections.unmodifiableList(this.span_);
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                    }
                }
                if ((i & PATH_FIELD_NUMBER) == PATH_FIELD_NUMBER) {
                    this.path_ = Collections.unmodifiableList(this.path_);
                }
                if ((i & SPAN_FIELD_NUMBER) == SPAN_FIELD_NUMBER) {
                    this.span_ = Collections.unmodifiableList(this.span_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }

            public static final Descriptor getDescriptor() {
                return DescriptorProtos.f2789xb210d08d;
            }

            protected final FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.f2790x9611a0b.ensureFieldAccessorsInitialized(Location.class, Builder.class);
            }

            static {
                PARSER = new C03001();
                Location location = new Location(true);
                defaultInstance = location;
                location.initFields();
            }

            public final Parser<Location> getParserForType() {
                return PARSER;
            }

            public final List<Integer> getPathList() {
                return this.path_;
            }

            public final int getPathCount() {
                return this.path_.size();
            }

            public final int getPath(int i) {
                return ((Integer) this.path_.get(i)).intValue();
            }

            public final List<Integer> getSpanList() {
                return this.span_;
            }

            public final int getSpanCount() {
                return this.span_.size();
            }

            public final int getSpan(int i) {
                return ((Integer) this.span_.get(i)).intValue();
            }

            public final boolean hasLeadingComments() {
                return (this.bitField0_ & PATH_FIELD_NUMBER) == PATH_FIELD_NUMBER;
            }

            public final String getLeadingComments() {
                Object obj = this.leadingComments_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String toStringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.leadingComments_ = toStringUtf8;
                }
                return toStringUtf8;
            }

            public final ByteString getLeadingCommentsBytes() {
                Object obj = this.leadingComments_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.leadingComments_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final boolean hasTrailingComments() {
                return (this.bitField0_ & SPAN_FIELD_NUMBER) == SPAN_FIELD_NUMBER;
            }

            public final String getTrailingComments() {
                Object obj = this.trailingComments_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String toStringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.trailingComments_ = toStringUtf8;
                }
                return toStringUtf8;
            }

            public final ByteString getTrailingCommentsBytes() {
                Object obj = this.trailingComments_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.trailingComments_ = copyFromUtf8;
                return copyFromUtf8;
            }

            private void initFields() {
                this.path_ = Collections.emptyList();
                this.span_ = Collections.emptyList();
                this.leadingComments_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.trailingComments_ = LetterIndexBar.SEARCH_ICON_LETTER;
            }

            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == (byte) 1) {
                    return true;
                }
                if (b == null) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            public final void writeTo(CodedOutputStream codedOutputStream) {
                int i = 0;
                getSerializedSize();
                if (getPathList().size() > 0) {
                    codedOutputStream.writeRawVarint32(10);
                    codedOutputStream.writeRawVarint32(this.pathMemoizedSerializedSize);
                }
                for (int i2 = 0; i2 < this.path_.size(); i2 += PATH_FIELD_NUMBER) {
                    codedOutputStream.writeInt32NoTag(((Integer) this.path_.get(i2)).intValue());
                }
                if (getSpanList().size() > 0) {
                    codedOutputStream.writeRawVarint32(18);
                    codedOutputStream.writeRawVarint32(this.spanMemoizedSerializedSize);
                }
                while (i < this.span_.size()) {
                    codedOutputStream.writeInt32NoTag(((Integer) this.span_.get(i)).intValue());
                    i += PATH_FIELD_NUMBER;
                }
                if ((this.bitField0_ & PATH_FIELD_NUMBER) == PATH_FIELD_NUMBER) {
                    codedOutputStream.writeBytes(LEADING_COMMENTS_FIELD_NUMBER, getLeadingCommentsBytes());
                }
                if ((this.bitField0_ & SPAN_FIELD_NUMBER) == SPAN_FIELD_NUMBER) {
                    codedOutputStream.writeBytes(TRAILING_COMMENTS_FIELD_NUMBER, getTrailingCommentsBytes());
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public final int getSerializedSize() {
                int i = 0;
                int i2 = this.memoizedSerializedSize;
                if (i2 != -1) {
                    return i2;
                }
                int i3;
                int i4 = 0;
                for (i3 = 0; i3 < this.path_.size(); i3 += PATH_FIELD_NUMBER) {
                    i4 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.path_.get(i3)).intValue());
                }
                i2 = i4 + 0;
                if (getPathList().isEmpty()) {
                    i3 = i2;
                } else {
                    i3 = (i2 + PATH_FIELD_NUMBER) + CodedOutputStream.computeInt32SizeNoTag(i4);
                }
                this.pathMemoizedSerializedSize = i4;
                i4 = 0;
                while (i < this.span_.size()) {
                    i += PATH_FIELD_NUMBER;
                    i4 = CodedOutputStream.computeInt32SizeNoTag(((Integer) this.span_.get(i)).intValue()) + i4;
                }
                i2 = i3 + i4;
                if (!getSpanList().isEmpty()) {
                    i2 = (i2 + PATH_FIELD_NUMBER) + CodedOutputStream.computeInt32SizeNoTag(i4);
                }
                this.spanMemoizedSerializedSize = i4;
                if ((this.bitField0_ & PATH_FIELD_NUMBER) == PATH_FIELD_NUMBER) {
                    i2 += CodedOutputStream.computeBytesSize(LEADING_COMMENTS_FIELD_NUMBER, getLeadingCommentsBytes());
                }
                if ((this.bitField0_ & SPAN_FIELD_NUMBER) == SPAN_FIELD_NUMBER) {
                    i2 += CodedOutputStream.computeBytesSize(TRAILING_COMMENTS_FIELD_NUMBER, getTrailingCommentsBytes());
                }
                i2 += getUnknownFields().getSerializedSize();
                this.memoizedSerializedSize = i2;
                return i2;
            }

            protected final Object writeReplace() {
                return super.writeReplace();
            }

            public static Location parseFrom(ByteString byteString) {
                return (Location) PARSER.parseFrom(byteString);
            }

            public static Location parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Location) PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static Location parseFrom(byte[] bArr) {
                return (Location) PARSER.parseFrom(bArr);
            }

            public static Location parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Location) PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static Location parseFrom(InputStream inputStream) {
                return (Location) PARSER.parseFrom(inputStream);
            }

            public static Location parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Location) PARSER.parseFrom(inputStream, extensionRegistryLite);
            }

            public static Location parseDelimitedFrom(InputStream inputStream) {
                return (Location) PARSER.parseDelimitedFrom(inputStream);
            }

            public static Location parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Location) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
            }

            public static Location parseFrom(CodedInputStream codedInputStream) {
                return (Location) PARSER.parseFrom(codedInputStream);
            }

            public static Location parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Location) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
            }

            public static Builder newBuilder() {
                return Builder.create();
            }

            public final Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder(Location location) {
                return newBuilder().mergeFrom(location);
            }

            public final Builder toBuilder() {
                return newBuilder(this);
            }

            protected final Builder newBuilderForType(BuilderParent builderParent) {
                return new Builder(null);
            }
        }

        private SourceCodeInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private SourceCodeInfo(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static SourceCodeInfo getDefaultInstance() {
            return defaultInstance;
        }

        public final SourceCodeInfo getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private SourceCodeInfo(com.google.protobuf.CodedInputStream r8, com.google.protobuf.ExtensionRegistryLite r9) {
            /*
            r7 = this;
            r0 = 0;
            r1 = -1;
            r2 = 1;
            r7.<init>();
            r7.memoizedIsInitialized = r1;
            r7.memoizedSerializedSize = r1;
            r7.initFields();
            r3 = com.google.protobuf.UnknownFieldSet.newBuilder();
            r1 = r0;
        L_0x0012:
            if (r1 != 0) goto L_0x0070;
        L_0x0014:
            r4 = r8.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x005e, all -> 0x0086 }
            switch(r4) {
                case 0: goto L_0x0023;
                case 10: goto L_0x0025;
                default: goto L_0x001b;
            };	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x005e, all -> 0x0086 }
        L_0x001b:
            r4 = r7.parseUnknownField(r8, r3, r9, r4);	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x005e, all -> 0x0086 }
            if (r4 != 0) goto L_0x0012;
        L_0x0021:
            r1 = r2;
            goto L_0x0012;
        L_0x0023:
            r1 = r2;
            goto L_0x0012;
        L_0x0025:
            r4 = r0 & 1;
            if (r4 == r2) goto L_0x0032;
        L_0x0029:
            r4 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x005e, all -> 0x0086 }
            r4.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x005e, all -> 0x0086 }
            r7.location_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x005e, all -> 0x0086 }
            r0 = r0 | 1;
        L_0x0032:
            r4 = r7.location_;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x005e, all -> 0x0086 }
            r5 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x005e, all -> 0x0086 }
            r5 = r8.readMessage(r5, r9);	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x005e, all -> 0x0086 }
            r4.add(r5);	 Catch:{ InvalidProtocolBufferException -> 0x003e, IOException -> 0x005e, all -> 0x0086 }
            goto L_0x0012;
        L_0x003e:
            r1 = move-exception;
            r6 = r1;
            r1 = r0;
            r0 = r6;
            r0 = r0.setUnfinishedMessage(r7);	 Catch:{ all -> 0x0047 }
            throw r0;	 Catch:{ all -> 0x0047 }
        L_0x0047:
            r0 = move-exception;
        L_0x0048:
            r1 = r1 & 1;
            if (r1 != r2) goto L_0x0054;
        L_0x004c:
            r1 = r7.location_;
            r1 = java.util.Collections.unmodifiableList(r1);
            r7.location_ = r1;
        L_0x0054:
            r1 = r3.build();
            r7.unknownFields = r1;
            r7.makeExtensionsImmutable();
            throw r0;
        L_0x005e:
            r1 = move-exception;
            r6 = r1;
            r1 = r0;
            r0 = r6;
            r4 = new com.google.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x0047 }
            r0 = r0.getMessage();	 Catch:{ all -> 0x0047 }
            r4.<init>(r0);	 Catch:{ all -> 0x0047 }
            r0 = r4.setUnfinishedMessage(r7);	 Catch:{ all -> 0x0047 }
            throw r0;	 Catch:{ all -> 0x0047 }
        L_0x0070:
            r0 = r0 & 1;
            if (r0 != r2) goto L_0x007c;
        L_0x0074:
            r0 = r7.location_;
            r0 = java.util.Collections.unmodifiableList(r0);
            r7.location_ = r0;
        L_0x007c:
            r0 = r3.build();
            r7.unknownFields = r0;
            r7.makeExtensionsImmutable();
            return;
        L_0x0086:
            r1 = move-exception;
            r6 = r1;
            r1 = r0;
            r0 = r6;
            goto L_0x0048;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.SourceCodeInfo.<init>(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):void");
        }

        public static final Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_SourceCodeInfo_descriptor;
        }

        protected final FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.f2791x532209f9.ensureFieldAccessorsInitialized(SourceCodeInfo.class, Builder.class);
        }

        static {
            PARSER = new C02991();
            SourceCodeInfo sourceCodeInfo = new SourceCodeInfo(true);
            defaultInstance = sourceCodeInfo;
            sourceCodeInfo.initFields();
        }

        public final Parser<SourceCodeInfo> getParserForType() {
            return PARSER;
        }

        public final List<Location> getLocationList() {
            return this.location_;
        }

        public final List<? extends LocationOrBuilder> getLocationOrBuilderList() {
            return this.location_;
        }

        public final int getLocationCount() {
            return this.location_.size();
        }

        public final Location getLocation(int i) {
            return (Location) this.location_.get(i);
        }

        public final LocationOrBuilder getLocationOrBuilder(int i) {
            return (LocationOrBuilder) this.location_.get(i);
        }

        private void initFields() {
            this.location_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == null) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i = 0; i < this.location_.size(); i += LOCATION_FIELD_NUMBER) {
                codedOutputStream.writeMessage(LOCATION_FIELD_NUMBER, (MessageLite) this.location_.get(i));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public final int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (i = 0; i < this.location_.size(); i += LOCATION_FIELD_NUMBER) {
                i2 += CodedOutputStream.computeMessageSize(LOCATION_FIELD_NUMBER, (MessageLite) this.location_.get(i));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + i2;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        protected final Object writeReplace() {
            return super.writeReplace();
        }

        public static SourceCodeInfo parseFrom(ByteString byteString) {
            return (SourceCodeInfo) PARSER.parseFrom(byteString);
        }

        public static SourceCodeInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SourceCodeInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SourceCodeInfo parseFrom(byte[] bArr) {
            return (SourceCodeInfo) PARSER.parseFrom(bArr);
        }

        public static SourceCodeInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SourceCodeInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SourceCodeInfo parseFrom(InputStream inputStream) {
            return (SourceCodeInfo) PARSER.parseFrom(inputStream);
        }

        public static SourceCodeInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SourceCodeInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SourceCodeInfo parseDelimitedFrom(InputStream inputStream) {
            return (SourceCodeInfo) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SourceCodeInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SourceCodeInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SourceCodeInfo parseFrom(CodedInputStream codedInputStream) {
            return (SourceCodeInfo) PARSER.parseFrom(codedInputStream);
        }

        public static SourceCodeInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SourceCodeInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(SourceCodeInfo sourceCodeInfo) {
            return newBuilder().mergeFrom(sourceCodeInfo);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        protected final Builder newBuilderForType(BuilderParent builderParent) {
            return new Builder(null);
        }
    }

    public interface UninterpretedOptionOrBuilder extends MessageOrBuilder {
        String getAggregateValue();

        ByteString getAggregateValueBytes();

        double getDoubleValue();

        String getIdentifierValue();

        ByteString getIdentifierValueBytes();

        NamePart getName(int i);

        int getNameCount();

        List<NamePart> getNameList();

        NamePartOrBuilder getNameOrBuilder(int i);

        List<? extends NamePartOrBuilder> getNameOrBuilderList();

        long getNegativeIntValue();

        long getPositiveIntValue();

        ByteString getStringValue();

        boolean hasAggregateValue();

        boolean hasDoubleValue();

        boolean hasIdentifierValue();

        boolean hasNegativeIntValue();

        boolean hasPositiveIntValue();

        boolean hasStringValue();
    }

    public static final class UninterpretedOption extends GeneratedMessage implements UninterpretedOptionOrBuilder {
        public static final int AGGREGATE_VALUE_FIELD_NUMBER = 8;
        public static final int DOUBLE_VALUE_FIELD_NUMBER = 6;
        public static final int IDENTIFIER_VALUE_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int NEGATIVE_INT_VALUE_FIELD_NUMBER = 5;
        public static Parser<UninterpretedOption> PARSER = null;
        public static final int POSITIVE_INT_VALUE_FIELD_NUMBER = 4;
        public static final int STRING_VALUE_FIELD_NUMBER = 7;
        private static final UninterpretedOption defaultInstance;
        private static final long serialVersionUID = 0;
        private Object aggregateValue_;
        private int bitField0_;
        private double doubleValue_;
        private Object identifierValue_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<NamePart> name_;
        private long negativeIntValue_;
        private long positiveIntValue_;
        private ByteString stringValue_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.google.protobuf.DescriptorProtos.UninterpretedOption.1 */
        static class C03011 extends AbstractParser<UninterpretedOption> {
            C03011() {
            }

            public final UninterpretedOption parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new UninterpretedOption(extensionRegistryLite, null);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements UninterpretedOptionOrBuilder {
            private Object aggregateValue_;
            private int bitField0_;
            private double doubleValue_;
            private Object identifierValue_;
            private RepeatedFieldBuilder<NamePart, Builder, NamePartOrBuilder> nameBuilder_;
            private List<NamePart> name_;
            private long negativeIntValue_;
            private long positiveIntValue_;
            private ByteString stringValue_;

            public static final Descriptor getDescriptor() {
                return DescriptorProtos.internal_static_google_protobuf_UninterpretedOption_descriptor;
            }

            protected final FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.f2794x2101041.ensureFieldAccessorsInitialized(UninterpretedOption.class, Builder.class);
            }

            private Builder() {
                this.name_ = Collections.emptyList();
                this.identifierValue_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.stringValue_ = ByteString.EMPTY;
                this.aggregateValue_ = LetterIndexBar.SEARCH_ICON_LETTER;
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent builderParent) {
                super(builderParent);
                this.name_ = Collections.emptyList();
                this.identifierValue_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.stringValue_ = ByteString.EMPTY;
                this.aggregateValue_ = LetterIndexBar.SEARCH_ICON_LETTER;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    getNameFieldBuilder();
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public final Builder clear() {
                super.clear();
                if (this.nameBuilder_ == null) {
                    this.name_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    this.nameBuilder_.clear();
                }
                this.identifierValue_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.bitField0_ &= -3;
                this.positiveIntValue_ = 0;
                this.bitField0_ &= -5;
                this.negativeIntValue_ = 0;
                this.bitField0_ &= -9;
                this.doubleValue_ = 0.0d;
                this.bitField0_ &= -17;
                this.stringValue_ = ByteString.EMPTY;
                this.bitField0_ &= -33;
                this.aggregateValue_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.bitField0_ &= -65;
                return this;
            }

            public final Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public final Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_UninterpretedOption_descriptor;
            }

            public final UninterpretedOption getDefaultInstanceForType() {
                return UninterpretedOption.getDefaultInstance();
            }

            public final UninterpretedOption build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
            }

            public final UninterpretedOption buildPartial() {
                int i = 1;
                UninterpretedOption uninterpretedOption = new UninterpretedOption(null);
                int i2 = this.bitField0_;
                if (this.nameBuilder_ == null) {
                    if ((this.bitField0_ & 1) == 1) {
                        this.name_ = Collections.unmodifiableList(this.name_);
                        this.bitField0_ &= -2;
                    }
                    uninterpretedOption.name_ = this.name_;
                } else {
                    uninterpretedOption.name_ = this.nameBuilder_.build();
                }
                if ((i2 & UninterpretedOption.NAME_FIELD_NUMBER) != UninterpretedOption.NAME_FIELD_NUMBER) {
                    i = 0;
                }
                uninterpretedOption.identifierValue_ = this.identifierValue_;
                if ((i2 & UninterpretedOption.POSITIVE_INT_VALUE_FIELD_NUMBER) == UninterpretedOption.POSITIVE_INT_VALUE_FIELD_NUMBER) {
                    i |= UninterpretedOption.NAME_FIELD_NUMBER;
                }
                uninterpretedOption.positiveIntValue_ = this.positiveIntValue_;
                if ((i2 & UninterpretedOption.AGGREGATE_VALUE_FIELD_NUMBER) == UninterpretedOption.AGGREGATE_VALUE_FIELD_NUMBER) {
                    i |= UninterpretedOption.POSITIVE_INT_VALUE_FIELD_NUMBER;
                }
                uninterpretedOption.negativeIntValue_ = this.negativeIntValue_;
                if ((i2 & 16) == 16) {
                    i |= UninterpretedOption.AGGREGATE_VALUE_FIELD_NUMBER;
                }
                uninterpretedOption.doubleValue_ = this.doubleValue_;
                if ((i2 & 32) == 32) {
                    i |= 16;
                }
                uninterpretedOption.stringValue_ = this.stringValue_;
                if ((i2 & 64) == 64) {
                    i |= 32;
                }
                uninterpretedOption.aggregateValue_ = this.aggregateValue_;
                uninterpretedOption.bitField0_ = i;
                onBuilt();
                return uninterpretedOption;
            }

            public final Builder mergeFrom(Message message) {
                if (message instanceof UninterpretedOption) {
                    return mergeFrom((UninterpretedOption) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public final Builder mergeFrom(UninterpretedOption uninterpretedOption) {
                RepeatedFieldBuilder repeatedFieldBuilder = null;
                if (uninterpretedOption != UninterpretedOption.getDefaultInstance()) {
                    if (this.nameBuilder_ == null) {
                        if (!uninterpretedOption.name_.isEmpty()) {
                            if (this.name_.isEmpty()) {
                                this.name_ = uninterpretedOption.name_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureNameIsMutable();
                                this.name_.addAll(uninterpretedOption.name_);
                            }
                            onChanged();
                        }
                    } else if (!uninterpretedOption.name_.isEmpty()) {
                        if (this.nameBuilder_.isEmpty()) {
                            this.nameBuilder_.dispose();
                            this.nameBuilder_ = null;
                            this.name_ = uninterpretedOption.name_;
                            this.bitField0_ &= -2;
                            if (GeneratedMessage.alwaysUseFieldBuilders) {
                                repeatedFieldBuilder = getNameFieldBuilder();
                            }
                            this.nameBuilder_ = repeatedFieldBuilder;
                        } else {
                            this.nameBuilder_.addAllMessages(uninterpretedOption.name_);
                        }
                    }
                    if (uninterpretedOption.hasIdentifierValue()) {
                        this.bitField0_ |= UninterpretedOption.NAME_FIELD_NUMBER;
                        this.identifierValue_ = uninterpretedOption.identifierValue_;
                        onChanged();
                    }
                    if (uninterpretedOption.hasPositiveIntValue()) {
                        setPositiveIntValue(uninterpretedOption.getPositiveIntValue());
                    }
                    if (uninterpretedOption.hasNegativeIntValue()) {
                        setNegativeIntValue(uninterpretedOption.getNegativeIntValue());
                    }
                    if (uninterpretedOption.hasDoubleValue()) {
                        setDoubleValue(uninterpretedOption.getDoubleValue());
                    }
                    if (uninterpretedOption.hasStringValue()) {
                        setStringValue(uninterpretedOption.getStringValue());
                    }
                    if (uninterpretedOption.hasAggregateValue()) {
                        this.bitField0_ |= 64;
                        this.aggregateValue_ = uninterpretedOption.aggregateValue_;
                        onChanged();
                    }
                    mergeUnknownFields(uninterpretedOption.getUnknownFields());
                }
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < getNameCount(); i++) {
                    if (!getName(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder mergeFrom(com.google.protobuf.CodedInputStream r5, com.google.protobuf.ExtensionRegistryLite r6) {
                /*
                r4 = this;
                r2 = 0;
                r0 = com.google.protobuf.DescriptorProtos.UninterpretedOption.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                r0 = (com.google.protobuf.DescriptorProtos.UninterpretedOption) r0;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                if (r0 == 0) goto L_0x000e;
            L_0x000b:
                r4.mergeFrom(r0);
            L_0x000e:
                return r4;
            L_0x000f:
                r0 = move-exception;
                r1 = r0;
                r0 = r1.getUnfinishedMessage();	 Catch:{ all -> 0x0022 }
                r0 = (com.google.protobuf.DescriptorProtos.UninterpretedOption) r0;	 Catch:{ all -> 0x0022 }
                throw r1;	 Catch:{ all -> 0x0018 }
            L_0x0018:
                r1 = move-exception;
                r3 = r1;
                r1 = r0;
                r0 = r3;
            L_0x001c:
                if (r1 == 0) goto L_0x0021;
            L_0x001e:
                r4.mergeFrom(r1);
            L_0x0021:
                throw r0;
            L_0x0022:
                r0 = move-exception;
                r1 = r2;
                goto L_0x001c;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.DescriptorProtos$UninterpretedOption$Builder");
            }

            private void ensureNameIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.name_ = new ArrayList(this.name_);
                    this.bitField0_ |= 1;
                }
            }

            public final List<NamePart> getNameList() {
                if (this.nameBuilder_ == null) {
                    return Collections.unmodifiableList(this.name_);
                }
                return this.nameBuilder_.getMessageList();
            }

            public final int getNameCount() {
                if (this.nameBuilder_ == null) {
                    return this.name_.size();
                }
                return this.nameBuilder_.getCount();
            }

            public final NamePart getName(int i) {
                if (this.nameBuilder_ == null) {
                    return (NamePart) this.name_.get(i);
                }
                return (NamePart) this.nameBuilder_.getMessage(i);
            }

            public final Builder setName(int i, NamePart namePart) {
                if (this.nameBuilder_ != null) {
                    this.nameBuilder_.setMessage(i, namePart);
                } else if (namePart == null) {
                    throw new NullPointerException();
                } else {
                    ensureNameIsMutable();
                    this.name_.set(i, namePart);
                    onChanged();
                }
                return this;
            }

            public final Builder setName(int i, Builder builder) {
                if (this.nameBuilder_ == null) {
                    ensureNameIsMutable();
                    this.name_.set(i, builder.build());
                    onChanged();
                } else {
                    this.nameBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addName(NamePart namePart) {
                if (this.nameBuilder_ != null) {
                    this.nameBuilder_.addMessage(namePart);
                } else if (namePart == null) {
                    throw new NullPointerException();
                } else {
                    ensureNameIsMutable();
                    this.name_.add(namePart);
                    onChanged();
                }
                return this;
            }

            public final Builder addName(int i, NamePart namePart) {
                if (this.nameBuilder_ != null) {
                    this.nameBuilder_.addMessage(i, namePart);
                } else if (namePart == null) {
                    throw new NullPointerException();
                } else {
                    ensureNameIsMutable();
                    this.name_.add(i, namePart);
                    onChanged();
                }
                return this;
            }

            public final Builder addName(Builder builder) {
                if (this.nameBuilder_ == null) {
                    ensureNameIsMutable();
                    this.name_.add(builder.build());
                    onChanged();
                } else {
                    this.nameBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public final Builder addName(int i, Builder builder) {
                if (this.nameBuilder_ == null) {
                    ensureNameIsMutable();
                    this.name_.add(i, builder.build());
                    onChanged();
                } else {
                    this.nameBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addAllName(Iterable<? extends NamePart> iterable) {
                if (this.nameBuilder_ == null) {
                    ensureNameIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.name_);
                    onChanged();
                } else {
                    this.nameBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public final Builder clearName() {
                if (this.nameBuilder_ == null) {
                    this.name_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    this.nameBuilder_.clear();
                }
                return this;
            }

            public final Builder removeName(int i) {
                if (this.nameBuilder_ == null) {
                    ensureNameIsMutable();
                    this.name_.remove(i);
                    onChanged();
                } else {
                    this.nameBuilder_.remove(i);
                }
                return this;
            }

            public final Builder getNameBuilder(int i) {
                return (Builder) getNameFieldBuilder().getBuilder(i);
            }

            public final NamePartOrBuilder getNameOrBuilder(int i) {
                if (this.nameBuilder_ == null) {
                    return (NamePartOrBuilder) this.name_.get(i);
                }
                return (NamePartOrBuilder) this.nameBuilder_.getMessageOrBuilder(i);
            }

            public final List<? extends NamePartOrBuilder> getNameOrBuilderList() {
                if (this.nameBuilder_ != null) {
                    return this.nameBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.name_);
            }

            public final Builder addNameBuilder() {
                return (Builder) getNameFieldBuilder().addBuilder(NamePart.getDefaultInstance());
            }

            public final Builder addNameBuilder(int i) {
                return (Builder) getNameFieldBuilder().addBuilder(i, NamePart.getDefaultInstance());
            }

            public final List<Builder> getNameBuilderList() {
                return getNameFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<NamePart, Builder, NamePartOrBuilder> getNameFieldBuilder() {
                boolean z = true;
                if (this.nameBuilder_ == null) {
                    List list = this.name_;
                    if ((this.bitField0_ & 1) != 1) {
                        z = false;
                    }
                    this.nameBuilder_ = new RepeatedFieldBuilder(list, z, getParentForChildren(), isClean());
                    this.name_ = null;
                }
                return this.nameBuilder_;
            }

            public final boolean hasIdentifierValue() {
                return (this.bitField0_ & UninterpretedOption.NAME_FIELD_NUMBER) == UninterpretedOption.NAME_FIELD_NUMBER;
            }

            public final String getIdentifierValue() {
                Object obj = this.identifierValue_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String toStringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.identifierValue_ = toStringUtf8;
                }
                return toStringUtf8;
            }

            public final ByteString getIdentifierValueBytes() {
                Object obj = this.identifierValue_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.identifierValue_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final Builder setIdentifierValue(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= UninterpretedOption.NAME_FIELD_NUMBER;
                this.identifierValue_ = str;
                onChanged();
                return this;
            }

            public final Builder clearIdentifierValue() {
                this.bitField0_ &= -3;
                this.identifierValue_ = UninterpretedOption.getDefaultInstance().getIdentifierValue();
                onChanged();
                return this;
            }

            public final Builder setIdentifierValueBytes(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= UninterpretedOption.NAME_FIELD_NUMBER;
                this.identifierValue_ = byteString;
                onChanged();
                return this;
            }

            public final boolean hasPositiveIntValue() {
                return (this.bitField0_ & UninterpretedOption.POSITIVE_INT_VALUE_FIELD_NUMBER) == UninterpretedOption.POSITIVE_INT_VALUE_FIELD_NUMBER;
            }

            public final long getPositiveIntValue() {
                return this.positiveIntValue_;
            }

            public final Builder setPositiveIntValue(long j) {
                this.bitField0_ |= UninterpretedOption.POSITIVE_INT_VALUE_FIELD_NUMBER;
                this.positiveIntValue_ = j;
                onChanged();
                return this;
            }

            public final Builder clearPositiveIntValue() {
                this.bitField0_ &= -5;
                this.positiveIntValue_ = 0;
                onChanged();
                return this;
            }

            public final boolean hasNegativeIntValue() {
                return (this.bitField0_ & UninterpretedOption.AGGREGATE_VALUE_FIELD_NUMBER) == UninterpretedOption.AGGREGATE_VALUE_FIELD_NUMBER;
            }

            public final long getNegativeIntValue() {
                return this.negativeIntValue_;
            }

            public final Builder setNegativeIntValue(long j) {
                this.bitField0_ |= UninterpretedOption.AGGREGATE_VALUE_FIELD_NUMBER;
                this.negativeIntValue_ = j;
                onChanged();
                return this;
            }

            public final Builder clearNegativeIntValue() {
                this.bitField0_ &= -9;
                this.negativeIntValue_ = 0;
                onChanged();
                return this;
            }

            public final boolean hasDoubleValue() {
                return (this.bitField0_ & 16) == 16;
            }

            public final double getDoubleValue() {
                return this.doubleValue_;
            }

            public final Builder setDoubleValue(double d) {
                this.bitField0_ |= 16;
                this.doubleValue_ = d;
                onChanged();
                return this;
            }

            public final Builder clearDoubleValue() {
                this.bitField0_ &= -17;
                this.doubleValue_ = 0.0d;
                onChanged();
                return this;
            }

            public final boolean hasStringValue() {
                return (this.bitField0_ & 32) == 32;
            }

            public final ByteString getStringValue() {
                return this.stringValue_;
            }

            public final Builder setStringValue(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 32;
                this.stringValue_ = byteString;
                onChanged();
                return this;
            }

            public final Builder clearStringValue() {
                this.bitField0_ &= -33;
                this.stringValue_ = UninterpretedOption.getDefaultInstance().getStringValue();
                onChanged();
                return this;
            }

            public final boolean hasAggregateValue() {
                return (this.bitField0_ & 64) == 64;
            }

            public final String getAggregateValue() {
                Object obj = this.aggregateValue_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String toStringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.aggregateValue_ = toStringUtf8;
                }
                return toStringUtf8;
            }

            public final ByteString getAggregateValueBytes() {
                Object obj = this.aggregateValue_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.aggregateValue_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final Builder setAggregateValue(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 64;
                this.aggregateValue_ = str;
                onChanged();
                return this;
            }

            public final Builder clearAggregateValue() {
                this.bitField0_ &= -65;
                this.aggregateValue_ = UninterpretedOption.getDefaultInstance().getAggregateValue();
                onChanged();
                return this;
            }

            public final Builder setAggregateValueBytes(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 64;
                this.aggregateValue_ = byteString;
                onChanged();
                return this;
            }
        }

        public interface NamePartOrBuilder extends MessageOrBuilder {
            boolean getIsExtension();

            String getNamePart();

            ByteString getNamePartBytes();

            boolean hasIsExtension();

            boolean hasNamePart();
        }

        public static final class NamePart extends GeneratedMessage implements NamePartOrBuilder {
            public static final int IS_EXTENSION_FIELD_NUMBER = 2;
            public static final int NAME_PART_FIELD_NUMBER = 1;
            public static Parser<NamePart> PARSER;
            private static final NamePart defaultInstance;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private boolean isExtension_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            private Object namePart_;
            private final UnknownFieldSet unknownFields;

            /* renamed from: com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart.1 */
            static class C03021 extends AbstractParser<NamePart> {
                C03021() {
                }

                public final NamePart parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new NamePart(extensionRegistryLite, null);
                }
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements NamePartOrBuilder {
                private int bitField0_;
                private boolean isExtension_;
                private Object namePart_;

                public static final Descriptor getDescriptor() {
                    return DescriptorProtos.f2792xb111d23c;
                }

                protected final FieldAccessorTable internalGetFieldAccessorTable() {
                    return DescriptorProtos.f2793x1698fcba.ensureFieldAccessorsInitialized(NamePart.class, Builder.class);
                }

                private Builder() {
                    this.namePart_ = LetterIndexBar.SEARCH_ICON_LETTER;
                    maybeForceBuilderInitialization();
                }

                private Builder(BuilderParent builderParent) {
                    super(builderParent);
                    this.namePart_ = LetterIndexBar.SEARCH_ICON_LETTER;
                    maybeForceBuilderInitialization();
                }

                private void maybeForceBuilderInitialization() {
                    boolean z = GeneratedMessage.alwaysUseFieldBuilders;
                }

                private static Builder create() {
                    return new Builder();
                }

                public final Builder clear() {
                    super.clear();
                    this.namePart_ = LetterIndexBar.SEARCH_ICON_LETTER;
                    this.bitField0_ &= -2;
                    this.isExtension_ = false;
                    this.bitField0_ &= -3;
                    return this;
                }

                public final Builder clone() {
                    return create().mergeFrom(buildPartial());
                }

                public final Descriptor getDescriptorForType() {
                    return DescriptorProtos.f2792xb111d23c;
                }

                public final NamePart getDefaultInstanceForType() {
                    return NamePart.getDefaultInstance();
                }

                public final NamePart build() {
                    Object buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
                }

                public final NamePart buildPartial() {
                    int i = NamePart.NAME_PART_FIELD_NUMBER;
                    NamePart namePart = new NamePart(null);
                    int i2 = this.bitField0_;
                    if ((i2 & NamePart.NAME_PART_FIELD_NUMBER) != NamePart.NAME_PART_FIELD_NUMBER) {
                        i = 0;
                    }
                    namePart.namePart_ = this.namePart_;
                    if ((i2 & NamePart.IS_EXTENSION_FIELD_NUMBER) == NamePart.IS_EXTENSION_FIELD_NUMBER) {
                        i |= NamePart.IS_EXTENSION_FIELD_NUMBER;
                    }
                    namePart.isExtension_ = this.isExtension_;
                    namePart.bitField0_ = i;
                    onBuilt();
                    return namePart;
                }

                public final Builder mergeFrom(Message message) {
                    if (message instanceof NamePart) {
                        return mergeFrom((NamePart) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public final Builder mergeFrom(NamePart namePart) {
                    if (namePart != NamePart.getDefaultInstance()) {
                        if (namePart.hasNamePart()) {
                            this.bitField0_ |= NamePart.NAME_PART_FIELD_NUMBER;
                            this.namePart_ = namePart.namePart_;
                            onChanged();
                        }
                        if (namePart.hasIsExtension()) {
                            setIsExtension(namePart.getIsExtension());
                        }
                        mergeUnknownFields(namePart.getUnknownFields());
                    }
                    return this;
                }

                public final boolean isInitialized() {
                    if (hasNamePart() && hasIsExtension()) {
                        return true;
                    }
                    return false;
                }

                /* JADX WARNING: inconsistent code. */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart.Builder mergeFrom(com.google.protobuf.CodedInputStream r5, com.google.protobuf.ExtensionRegistryLite r6) {
                    /*
                    r4 = this;
                    r2 = 0;
                    r0 = com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                    r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                    r0 = (com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart) r0;	 Catch:{ InvalidProtocolBufferException -> 0x000f }
                    if (r0 == 0) goto L_0x000e;
                L_0x000b:
                    r4.mergeFrom(r0);
                L_0x000e:
                    return r4;
                L_0x000f:
                    r0 = move-exception;
                    r1 = r0;
                    r0 = r1.getUnfinishedMessage();	 Catch:{ all -> 0x0022 }
                    r0 = (com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart) r0;	 Catch:{ all -> 0x0022 }
                    throw r1;	 Catch:{ all -> 0x0018 }
                L_0x0018:
                    r1 = move-exception;
                    r3 = r1;
                    r1 = r0;
                    r0 = r3;
                L_0x001c:
                    if (r1 == 0) goto L_0x0021;
                L_0x001e:
                    r4.mergeFrom(r1);
                L_0x0021:
                    throw r0;
                L_0x0022:
                    r0 = move-exception;
                    r1 = r2;
                    goto L_0x001c;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.DescriptorProtos$UninterpretedOption$NamePart$Builder");
                }

                public final boolean hasNamePart() {
                    return (this.bitField0_ & NamePart.NAME_PART_FIELD_NUMBER) == NamePart.NAME_PART_FIELD_NUMBER;
                }

                public final String getNamePart() {
                    Object obj = this.namePart_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String toStringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.namePart_ = toStringUtf8;
                    }
                    return toStringUtf8;
                }

                public final ByteString getNamePartBytes() {
                    Object obj = this.namePart_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.namePart_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public final Builder setNamePart(String str) {
                    if (str == null) {
                        throw new NullPointerException();
                    }
                    this.bitField0_ |= NamePart.NAME_PART_FIELD_NUMBER;
                    this.namePart_ = str;
                    onChanged();
                    return this;
                }

                public final Builder clearNamePart() {
                    this.bitField0_ &= -2;
                    this.namePart_ = NamePart.getDefaultInstance().getNamePart();
                    onChanged();
                    return this;
                }

                public final Builder setNamePartBytes(ByteString byteString) {
                    if (byteString == null) {
                        throw new NullPointerException();
                    }
                    this.bitField0_ |= NamePart.NAME_PART_FIELD_NUMBER;
                    this.namePart_ = byteString;
                    onChanged();
                    return this;
                }

                public final boolean hasIsExtension() {
                    return (this.bitField0_ & NamePart.IS_EXTENSION_FIELD_NUMBER) == NamePart.IS_EXTENSION_FIELD_NUMBER;
                }

                public final boolean getIsExtension() {
                    return this.isExtension_;
                }

                public final Builder setIsExtension(boolean z) {
                    this.bitField0_ |= NamePart.IS_EXTENSION_FIELD_NUMBER;
                    this.isExtension_ = z;
                    onChanged();
                    return this;
                }

                public final Builder clearIsExtension() {
                    this.bitField0_ &= -3;
                    this.isExtension_ = false;
                    onChanged();
                    return this;
                }
            }

            private NamePart(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = builder.getUnknownFields();
            }

            private NamePart(boolean z) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = UnknownFieldSet.getDefaultInstance();
            }

            public static NamePart getDefaultInstance() {
                return defaultInstance;
            }

            public final NamePart getDefaultInstanceForType() {
                return defaultInstance;
            }

            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            private NamePart(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                initFields();
                com.google.protobuf.UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                Object obj = null;
                while (obj == null) {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case SQLiteDatabase.OPEN_READWRITE /*0*/:
                                obj = NAME_PART_FIELD_NUMBER;
                                break;
                            case PushMsg.SMSG_FIELD_NUMBER /*10*/:
                                ByteString readBytes = codedInputStream.readBytes();
                                this.bitField0_ |= NAME_PART_FIELD_NUMBER;
                                this.namePart_ = readBytes;
                                break;
                            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                                this.bitField0_ |= IS_EXTENSION_FIELD_NUMBER;
                                this.isExtension_ = codedInputStream.readBool();
                                break;
                            default:
                                if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                    obj = NAME_PART_FIELD_NUMBER;
                                    break;
                                }
                                break;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                    }
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }

            public static final Descriptor getDescriptor() {
                return DescriptorProtos.f2792xb111d23c;
            }

            protected final FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.f2793x1698fcba.ensureFieldAccessorsInitialized(NamePart.class, Builder.class);
            }

            static {
                PARSER = new C03021();
                NamePart namePart = new NamePart(true);
                defaultInstance = namePart;
                namePart.initFields();
            }

            public final Parser<NamePart> getParserForType() {
                return PARSER;
            }

            public final boolean hasNamePart() {
                return (this.bitField0_ & NAME_PART_FIELD_NUMBER) == NAME_PART_FIELD_NUMBER;
            }

            public final String getNamePart() {
                Object obj = this.namePart_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String toStringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.namePart_ = toStringUtf8;
                }
                return toStringUtf8;
            }

            public final ByteString getNamePartBytes() {
                Object obj = this.namePart_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.namePart_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final boolean hasIsExtension() {
                return (this.bitField0_ & IS_EXTENSION_FIELD_NUMBER) == IS_EXTENSION_FIELD_NUMBER;
            }

            public final boolean getIsExtension() {
                return this.isExtension_;
            }

            private void initFields() {
                this.namePart_ = LetterIndexBar.SEARCH_ICON_LETTER;
                this.isExtension_ = false;
            }

            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == (byte) 1) {
                    return true;
                }
                if (b == null) {
                    return false;
                }
                if (!hasNamePart()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                } else if (hasIsExtension()) {
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }

            public final void writeTo(CodedOutputStream codedOutputStream) {
                getSerializedSize();
                if ((this.bitField0_ & NAME_PART_FIELD_NUMBER) == NAME_PART_FIELD_NUMBER) {
                    codedOutputStream.writeBytes(NAME_PART_FIELD_NUMBER, getNamePartBytes());
                }
                if ((this.bitField0_ & IS_EXTENSION_FIELD_NUMBER) == IS_EXTENSION_FIELD_NUMBER) {
                    codedOutputStream.writeBool(IS_EXTENSION_FIELD_NUMBER, this.isExtension_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public final int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                i = 0;
                if ((this.bitField0_ & NAME_PART_FIELD_NUMBER) == NAME_PART_FIELD_NUMBER) {
                    i = CodedOutputStream.computeBytesSize(NAME_PART_FIELD_NUMBER, getNamePartBytes()) + 0;
                }
                if ((this.bitField0_ & IS_EXTENSION_FIELD_NUMBER) == IS_EXTENSION_FIELD_NUMBER) {
                    i += CodedOutputStream.computeBoolSize(IS_EXTENSION_FIELD_NUMBER, this.isExtension_);
                }
                i += getUnknownFields().getSerializedSize();
                this.memoizedSerializedSize = i;
                return i;
            }

            protected final Object writeReplace() {
                return super.writeReplace();
            }

            public static NamePart parseFrom(ByteString byteString) {
                return (NamePart) PARSER.parseFrom(byteString);
            }

            public static NamePart parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (NamePart) PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static NamePart parseFrom(byte[] bArr) {
                return (NamePart) PARSER.parseFrom(bArr);
            }

            public static NamePart parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (NamePart) PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static NamePart parseFrom(InputStream inputStream) {
                return (NamePart) PARSER.parseFrom(inputStream);
            }

            public static NamePart parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (NamePart) PARSER.parseFrom(inputStream, extensionRegistryLite);
            }

            public static NamePart parseDelimitedFrom(InputStream inputStream) {
                return (NamePart) PARSER.parseDelimitedFrom(inputStream);
            }

            public static NamePart parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (NamePart) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
            }

            public static NamePart parseFrom(CodedInputStream codedInputStream) {
                return (NamePart) PARSER.parseFrom(codedInputStream);
            }

            public static NamePart parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (NamePart) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
            }

            public static Builder newBuilder() {
                return Builder.create();
            }

            public final Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder(NamePart namePart) {
                return newBuilder().mergeFrom(namePart);
            }

            public final Builder toBuilder() {
                return newBuilder(this);
            }

            protected final Builder newBuilderForType(BuilderParent builderParent) {
                return new Builder(null);
            }
        }

        private UninterpretedOption(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private UninterpretedOption(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static UninterpretedOption getDefaultInstance() {
            return defaultInstance;
        }

        public final UninterpretedOption getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private UninterpretedOption(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            Object obj = null;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            com.google.protobuf.UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            int i = 0;
            while (obj == null) {
                try {
                    int readTag = codedInputStream.readTag();
                    ByteString readBytes;
                    switch (readTag) {
                        case SQLiteDatabase.OPEN_READWRITE /*0*/:
                            obj = 1;
                            break;
                        case PushMsg.IVIBRATE_FIELD_NUMBER /*18*/:
                            if ((i & 1) != 1) {
                                this.name_ = new ArrayList();
                                i |= 1;
                            }
                            this.name_.add(codedInputStream.readMessage(NamePart.PARSER, extensionRegistryLite));
                            break;
                        case GameRoomBaseInfo.EGAMEROOMTYPE_FIELD_NUMBER /*26*/:
                            readBytes = codedInputStream.readBytes();
                            this.bitField0_ |= 1;
                            this.identifierValue_ = readBytes;
                            break;
                        case GameRoomBaseInfo.SFROMCLUBNAME_FIELD_NUMBER /*32*/:
                            this.bitField0_ |= NAME_FIELD_NUMBER;
                            this.positiveIntValue_ = codedInputStream.readUInt64();
                            break;
                        case R.AppCompatTheme_textAppearanceLargePopupMenu /*40*/:
                            this.bitField0_ |= POSITIVE_INT_VALUE_FIELD_NUMBER;
                            this.negativeIntValue_ = codedInputStream.readInt64();
                            break;
                        case R.AppCompatTheme_homeAsUpIndicator /*49*/:
                            this.bitField0_ |= AGGREGATE_VALUE_FIELD_NUMBER;
                            this.doubleValue_ = codedInputStream.readDouble();
                            break;
                        case R.AppCompatTheme_activityChooserViewStyle /*58*/:
                            this.bitField0_ |= 16;
                            this.stringValue_ = codedInputStream.readBytes();
                            break;
                        case R.AppCompatTheme_textAppearanceSearchResultTitle /*66*/:
                            readBytes = codedInputStream.readBytes();
                            this.bitField0_ |= 32;
                            this.aggregateValue_ = readBytes;
                            break;
                        default:
                            if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                obj = 1;
                                break;
                            }
                            break;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if ((i & 1) == 1) {
                        this.name_ = Collections.unmodifiableList(this.name_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                }
            }
            if ((i & 1) == 1) {
                this.name_ = Collections.unmodifiableList(this.name_);
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
        }

        public static final Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_UninterpretedOption_descriptor;
        }

        protected final FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.f2794x2101041.ensureFieldAccessorsInitialized(UninterpretedOption.class, Builder.class);
        }

        static {
            PARSER = new C03011();
            UninterpretedOption uninterpretedOption = new UninterpretedOption(true);
            defaultInstance = uninterpretedOption;
            uninterpretedOption.initFields();
        }

        public final Parser<UninterpretedOption> getParserForType() {
            return PARSER;
        }

        public final List<NamePart> getNameList() {
            return this.name_;
        }

        public final List<? extends NamePartOrBuilder> getNameOrBuilderList() {
            return this.name_;
        }

        public final int getNameCount() {
            return this.name_.size();
        }

        public final NamePart getName(int i) {
            return (NamePart) this.name_.get(i);
        }

        public final NamePartOrBuilder getNameOrBuilder(int i) {
            return (NamePartOrBuilder) this.name_.get(i);
        }

        public final boolean hasIdentifierValue() {
            return (this.bitField0_ & 1) == 1;
        }

        public final String getIdentifierValue() {
            Object obj = this.identifierValue_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String toStringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.identifierValue_ = toStringUtf8;
            }
            return toStringUtf8;
        }

        public final ByteString getIdentifierValueBytes() {
            Object obj = this.identifierValue_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.identifierValue_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean hasPositiveIntValue() {
            return (this.bitField0_ & NAME_FIELD_NUMBER) == NAME_FIELD_NUMBER;
        }

        public final long getPositiveIntValue() {
            return this.positiveIntValue_;
        }

        public final boolean hasNegativeIntValue() {
            return (this.bitField0_ & POSITIVE_INT_VALUE_FIELD_NUMBER) == POSITIVE_INT_VALUE_FIELD_NUMBER;
        }

        public final long getNegativeIntValue() {
            return this.negativeIntValue_;
        }

        public final boolean hasDoubleValue() {
            return (this.bitField0_ & AGGREGATE_VALUE_FIELD_NUMBER) == AGGREGATE_VALUE_FIELD_NUMBER;
        }

        public final double getDoubleValue() {
            return this.doubleValue_;
        }

        public final boolean hasStringValue() {
            return (this.bitField0_ & 16) == 16;
        }

        public final ByteString getStringValue() {
            return this.stringValue_;
        }

        public final boolean hasAggregateValue() {
            return (this.bitField0_ & 32) == 32;
        }

        public final String getAggregateValue() {
            Object obj = this.aggregateValue_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String toStringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.aggregateValue_ = toStringUtf8;
            }
            return toStringUtf8;
        }

        public final ByteString getAggregateValueBytes() {
            Object obj = this.aggregateValue_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.aggregateValue_ = copyFromUtf8;
            return copyFromUtf8;
        }

        private void initFields() {
            this.name_ = Collections.emptyList();
            this.identifierValue_ = LetterIndexBar.SEARCH_ICON_LETTER;
            this.positiveIntValue_ = 0;
            this.negativeIntValue_ = 0;
            this.doubleValue_ = 0.0d;
            this.stringValue_ = ByteString.EMPTY;
            this.aggregateValue_ = LetterIndexBar.SEARCH_ICON_LETTER;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == null) {
                return false;
            }
            int i = 0;
            while (i < getNameCount()) {
                if (getName(i).isInitialized()) {
                    i++;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i = 0; i < this.name_.size(); i++) {
                codedOutputStream.writeMessage(NAME_FIELD_NUMBER, (MessageLite) this.name_.get(i));
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeBytes(IDENTIFIER_VALUE_FIELD_NUMBER, getIdentifierValueBytes());
            }
            if ((this.bitField0_ & NAME_FIELD_NUMBER) == NAME_FIELD_NUMBER) {
                codedOutputStream.writeUInt64(POSITIVE_INT_VALUE_FIELD_NUMBER, this.positiveIntValue_);
            }
            if ((this.bitField0_ & POSITIVE_INT_VALUE_FIELD_NUMBER) == POSITIVE_INT_VALUE_FIELD_NUMBER) {
                codedOutputStream.writeInt64(NEGATIVE_INT_VALUE_FIELD_NUMBER, this.negativeIntValue_);
            }
            if ((this.bitField0_ & AGGREGATE_VALUE_FIELD_NUMBER) == AGGREGATE_VALUE_FIELD_NUMBER) {
                codedOutputStream.writeDouble(DOUBLE_VALUE_FIELD_NUMBER, this.doubleValue_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeBytes(STRING_VALUE_FIELD_NUMBER, this.stringValue_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeBytes(AGGREGATE_VALUE_FIELD_NUMBER, getAggregateValueBytes());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public final int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (i = 0; i < this.name_.size(); i++) {
                i2 += CodedOutputStream.computeMessageSize(NAME_FIELD_NUMBER, (MessageLite) this.name_.get(i));
            }
            if ((this.bitField0_ & 1) == 1) {
                i2 += CodedOutputStream.computeBytesSize(IDENTIFIER_VALUE_FIELD_NUMBER, getIdentifierValueBytes());
            }
            if ((this.bitField0_ & NAME_FIELD_NUMBER) == NAME_FIELD_NUMBER) {
                i2 += CodedOutputStream.computeUInt64Size(POSITIVE_INT_VALUE_FIELD_NUMBER, this.positiveIntValue_);
            }
            if ((this.bitField0_ & POSITIVE_INT_VALUE_FIELD_NUMBER) == POSITIVE_INT_VALUE_FIELD_NUMBER) {
                i2 += CodedOutputStream.computeInt64Size(NEGATIVE_INT_VALUE_FIELD_NUMBER, this.negativeIntValue_);
            }
            if ((this.bitField0_ & AGGREGATE_VALUE_FIELD_NUMBER) == AGGREGATE_VALUE_FIELD_NUMBER) {
                i2 += CodedOutputStream.computeDoubleSize(DOUBLE_VALUE_FIELD_NUMBER, this.doubleValue_);
            }
            if ((this.bitField0_ & 16) == 16) {
                i2 += CodedOutputStream.computeBytesSize(STRING_VALUE_FIELD_NUMBER, this.stringValue_);
            }
            if ((this.bitField0_ & 32) == 32) {
                i2 += CodedOutputStream.computeBytesSize(AGGREGATE_VALUE_FIELD_NUMBER, getAggregateValueBytes());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + i2;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        protected final Object writeReplace() {
            return super.writeReplace();
        }

        public static UninterpretedOption parseFrom(ByteString byteString) {
            return (UninterpretedOption) PARSER.parseFrom(byteString);
        }

        public static UninterpretedOption parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (UninterpretedOption) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UninterpretedOption parseFrom(byte[] bArr) {
            return (UninterpretedOption) PARSER.parseFrom(bArr);
        }

        public static UninterpretedOption parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (UninterpretedOption) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UninterpretedOption parseFrom(InputStream inputStream) {
            return (UninterpretedOption) PARSER.parseFrom(inputStream);
        }

        public static UninterpretedOption parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UninterpretedOption) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static UninterpretedOption parseDelimitedFrom(InputStream inputStream) {
            return (UninterpretedOption) PARSER.parseDelimitedFrom(inputStream);
        }

        public static UninterpretedOption parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UninterpretedOption) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static UninterpretedOption parseFrom(CodedInputStream codedInputStream) {
            return (UninterpretedOption) PARSER.parseFrom(codedInputStream);
        }

        public static UninterpretedOption parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UninterpretedOption) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(UninterpretedOption uninterpretedOption) {
            return newBuilder().mergeFrom(uninterpretedOption);
        }

        public final Builder toBuilder() {
            return newBuilder(this);
        }

        protected final Builder newBuilderForType(BuilderParent builderParent) {
            return new Builder(null);
        }
    }

    private DescriptorProtos() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
    }

    public static FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n google/protobuf/descriptor.proto\u0012\u000fgoogle.protobuf\"G\n\u0011FileDescriptorSet\u00122\n\u0004file\u0018\u0001 \u0003(\u000b2$.google.protobuf.FileDescriptorProto\"\u00cb\u0003\n\u0013FileDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007package\u0018\u0002 \u0001(\t\u0012\u0012\n\ndependency\u0018\u0003 \u0003(\t\u0012\u0019\n\u0011public_dependency\u0018\n \u0003(\u0005\u0012\u0017\n\u000fweak_dependency\u0018\u000b \u0003(\u0005\u00126\n\fmessage_type\u0018\u0004 \u0003(\u000b2 .google.protobuf.DescriptorProto\u00127\n\tenum_type\u0018\u0005 \u0003(\u000b2$.google.protobuf.EnumDescriptorProto\u00128\n\u0007service\u0018\u0006 \u0003(\u000b2'.google.protobuf.", "ServiceDescriptorProto\u00128\n\textension\u0018\u0007 \u0003(\u000b2%.google.protobuf.FieldDescriptorProto\u0012-\n\u0007options\u0018\b \u0001(\u000b2\u001c.google.protobuf.FileOptions\u00129\n\u0010source_code_info\u0018\t \u0001(\u000b2\u001f.google.protobuf.SourceCodeInfo\"\u00e4\u0003\n\u000fDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u00124\n\u0005field\u0018\u0002 \u0003(\u000b2%.google.protobuf.FieldDescriptorProto\u00128\n\textension\u0018\u0006 \u0003(\u000b2%.google.protobuf.FieldDescriptorProto\u00125\n\u000bnested_type\u0018\u0003 \u0003(\u000b2 .google.protobuf.DescriptorProto\u00127\n\tenum_type", "\u0018\u0004 \u0003(\u000b2$.google.protobuf.EnumDescriptorProto\u0012H\n\u000fextension_range\u0018\u0005 \u0003(\u000b2/.google.protobuf.DescriptorProto.ExtensionRange\u00129\n\noneof_decl\u0018\b \u0003(\u000b2%.google.protobuf.OneofDescriptorProto\u00120\n\u0007options\u0018\u0007 \u0001(\u000b2\u001f.google.protobuf.MessageOptions\u001a,\n\u000eExtensionRange\u0012\r\n\u0005start\u0018\u0001 \u0001(\u0005\u0012\u000b\n\u0003end\u0018\u0002 \u0001(\u0005\"\u00a9\u0005\n\u0014FieldDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006number\u0018\u0003 \u0001(\u0005\u0012:\n\u0005label\u0018\u0004 \u0001(\u000e2+.google.protobuf.FieldDescriptorProto.Label\u00128\n\u0004type\u0018\u0005 \u0001", "(\u000e2*.google.protobuf.FieldDescriptorProto.Type\u0012\u0011\n\ttype_name\u0018\u0006 \u0001(\t\u0012\u0010\n\bextendee\u0018\u0002 \u0001(\t\u0012\u0015\n\rdefault_value\u0018\u0007 \u0001(\t\u0012\u0013\n\u000boneof_index\u0018\t \u0001(\u0005\u0012.\n\u0007options\u0018\b \u0001(\u000b2\u001d.google.protobuf.FieldOptions\"\u00b6\u0002\n\u0004Type\u0012\u000f\n\u000bTYPE_DOUBLE\u0010\u0001\u0012\u000e\n\nTYPE_FLOAT\u0010\u0002\u0012\u000e\n\nTYPE_INT64\u0010\u0003\u0012\u000f\n\u000bTYPE_UINT64\u0010\u0004\u0012\u000e\n\nTYPE_INT32\u0010\u0005\u0012\u0010\n\fTYPE_FIXED64\u0010\u0006\u0012\u0010\n\fTYPE_FIXED32\u0010\u0007\u0012\r\n\tTYPE_BOOL\u0010\b\u0012\u000f\n\u000bTYPE_STRING\u0010\t\u0012\u000e\n\nTYPE_GROUP\u0010\n\u0012\u0010\n\fTYPE_MESSAGE\u0010\u000b\u0012\u000e\n\nTYPE_BYTES\u0010\f\u0012\u000f\n\u000bTYPE_UINT32\u0010", "\r\u0012\r\n\tTYPE_ENUM\u0010\u000e\u0012\u0011\n\rTYPE_SFIXED32\u0010\u000f\u0012\u0011\n\rTYPE_SFIXED64\u0010\u0010\u0012\u000f\n\u000bTYPE_SINT32\u0010\u0011\u0012\u000f\n\u000bTYPE_SINT64\u0010\u0012\"C\n\u0005Label\u0012\u0012\n\u000eLABEL_OPTIONAL\u0010\u0001\u0012\u0012\n\u000eLABEL_REQUIRED\u0010\u0002\u0012\u0012\n\u000eLABEL_REPEATED\u0010\u0003\"$\n\u0014OneofDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\"\u008c\u0001\n\u0013EnumDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u00128\n\u0005value\u0018\u0002 \u0003(\u000b2).google.protobuf.EnumValueDescriptorProto\u0012-\n\u0007options\u0018\u0003 \u0001(\u000b2\u001c.google.protobuf.EnumOptions\"l\n\u0018EnumValueDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006number\u0018\u0002 \u0001(\u0005\u00122\n\u0007", "options\u0018\u0003 \u0001(\u000b2!.google.protobuf.EnumValueOptions\"\u0090\u0001\n\u0016ServiceDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u00126\n\u0006method\u0018\u0002 \u0003(\u000b2&.google.protobuf.MethodDescriptorProto\u00120\n\u0007options\u0018\u0003 \u0001(\u000b2\u001f.google.protobuf.ServiceOptions\"\u007f\n\u0015MethodDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0012\n\ninput_type\u0018\u0002 \u0001(\t\u0012\u0013\n\u000boutput_type\u0018\u0003 \u0001(\t\u0012/\n\u0007options\u0018\u0004 \u0001(\u000b2\u001e.google.protobuf.MethodOptions\"\u00ab\u0004\n\u000bFileOptions\u0012\u0014\n\fjava_package\u0018\u0001 \u0001(\t\u0012\u001c\n\u0014java_outer_classname\u0018\b \u0001(\t\u0012\"\n\u0013java", "_multiple_files\u0018\n \u0001(\b:\u0005false\u0012,\n\u001djava_generate_equals_and_hash\u0018\u0014 \u0001(\b:\u0005false\u0012%\n\u0016java_string_check_utf8\u0018\u001b \u0001(\b:\u0005false\u0012F\n\foptimize_for\u0018\t \u0001(\u000e2).google.protobuf.FileOptions.OptimizeMode:\u0005SPEED\u0012\u0012\n\ngo_package\u0018\u000b \u0001(\t\u0012\"\n\u0013cc_generic_services\u0018\u0010 \u0001(\b:\u0005false\u0012$\n\u0015java_generic_services\u0018\u0011 \u0001(\b:\u0005false\u0012\"\n\u0013py_generic_services\u0018\u0012 \u0001(\b:\u0005false\u0012\u0019\n\ndeprecated\u0018\u0017 \u0001(\b:\u0005false\u0012C\n\u0014uninterpreted_option\u0018\u00e7\u0007 \u0003(\u000b2$.google.protobuf.Uninterp", "retedOption\":\n\fOptimizeMode\u0012\t\n\u0005SPEED\u0010\u0001\u0012\r\n\tCODE_SIZE\u0010\u0002\u0012\u0010\n\fLITE_RUNTIME\u0010\u0003*\t\b\u00e8\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"\u00d3\u0001\n\u000eMessageOptions\u0012&\n\u0017message_set_wire_format\u0018\u0001 \u0001(\b:\u0005false\u0012.\n\u001fno_standard_descriptor_accessor\u0018\u0002 \u0001(\b:\u0005false\u0012\u0019\n\ndeprecated\u0018\u0003 \u0001(\b:\u0005false\u0012C\n\u0014uninterpreted_option\u0018\u00e7\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption*\t\b\u00e8\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"\u00be\u0002\n\fFieldOptions\u0012:\n\u0005ctype\u0018\u0001 \u0001(\u000e2#.google.protobuf.FieldOptions.CType:\u0006STRING\u0012\u000e\n\u0006packed\u0018\u0002 \u0001(\b\u0012\u0013\n\u0004lazy\u0018\u0005 ", "\u0001(\b:\u0005false\u0012\u0019\n\ndeprecated\u0018\u0003 \u0001(\b:\u0005false\u0012\u001c\n\u0014experimental_map_key\u0018\t \u0001(\t\u0012\u0013\n\u0004weak\u0018\n \u0001(\b:\u0005false\u0012C\n\u0014uninterpreted_option\u0018\u00e7\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption\"/\n\u0005CType\u0012\n\n\u0006STRING\u0010\u0000\u0012\b\n\u0004CORD\u0010\u0001\u0012\u0010\n\fSTRING_PIECE\u0010\u0002*\t\b\u00e8\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"\u008d\u0001\n\u000bEnumOptions\u0012\u0013\n\u000ballow_alias\u0018\u0002 \u0001(\b\u0012\u0019\n\ndeprecated\u0018\u0003 \u0001(\b:\u0005false\u0012C\n\u0014uninterpreted_option\u0018\u00e7\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption*\t\b\u00e8\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"}\n\u0010EnumValueOptions\u0012\u0019\n\ndeprecated\u0018\u0001 \u0001(", "\b:\u0005false\u0012C\n\u0014uninterpreted_option\u0018\u00e7\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption*\t\b\u00e8\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"{\n\u000eServiceOptions\u0012\u0019\n\ndeprecated\u0018! \u0001(\b:\u0005false\u0012C\n\u0014uninterpreted_option\u0018\u00e7\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption*\t\b\u00e8\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"z\n\rMethodOptions\u0012\u0019\n\ndeprecated\u0018! \u0001(\b:\u0005false\u0012C\n\u0014uninterpreted_option\u0018\u00e7\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption*\t\b\u00e8\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"\u009e\u0002\n\u0013UninterpretedOption\u0012;\n\u0004name\u0018\u0002 \u0003(\u000b2-.google.protobuf.Uninte", "rpretedOption.NamePart\u0012\u0018\n\u0010identifier_value\u0018\u0003 \u0001(\t\u0012\u001a\n\u0012positive_int_value\u0018\u0004 \u0001(\u0004\u0012\u001a\n\u0012negative_int_value\u0018\u0005 \u0001(\u0003\u0012\u0014\n\fdouble_value\u0018\u0006 \u0001(\u0001\u0012\u0014\n\fstring_value\u0018\u0007 \u0001(\f\u0012\u0017\n\u000faggregate_value\u0018\b \u0001(\t\u001a3\n\bNamePart\u0012\u0011\n\tname_part\u0018\u0001 \u0002(\t\u0012\u0014\n\fis_extension\u0018\u0002 \u0002(\b\"\u00b1\u0001\n\u000eSourceCodeInfo\u0012:\n\blocation\u0018\u0001 \u0003(\u000b2(.google.protobuf.SourceCodeInfo.Location\u001ac\n\bLocation\u0012\u0010\n\u0004path\u0018\u0001 \u0003(\u0005B\u0002\u0010\u0001\u0012\u0010\n\u0004span\u0018\u0002 \u0003(\u0005B\u0002\u0010\u0001\u0012\u0018\n\u0010leading_comments\u0018\u0003 \u0001(\t\u0012\u0019\n\u0011trailing_comments", "\u0018\u0004 \u0001(\tB)\n\u0013com.google.protobufB\u0010DescriptorProtosH\u0001"}, new FileDescriptor[0], new C02771());
        internal_static_google_protobuf_FileDescriptorSet_descriptor = (Descriptor) getDescriptor().getMessageTypes().get(0);
        f2782x15a6a952 = new FieldAccessorTable(internal_static_google_protobuf_FileDescriptorSet_descriptor, new String[]{"File"});
        internal_static_google_protobuf_FileDescriptorProto_descriptor = (Descriptor) getDescriptor().getMessageTypes().get(1);
        f2781x4b52780c = new FieldAccessorTable(internal_static_google_protobuf_FileDescriptorProto_descriptor, new String[]{"Name", "Package", "Dependency", "PublicDependency", "WeakDependency", "MessageType", "EnumType", "Service", "Extension", "Options", "SourceCodeInfo"});
        internal_static_google_protobuf_DescriptorProto_descriptor = (Descriptor) getDescriptor().getMessageTypes().get(2);
        f2775x907d0bf0 = new FieldAccessorTable(internal_static_google_protobuf_DescriptorProto_descriptor, new String[]{"Name", "Field", "Extension", "NestedType", "EnumType", "ExtensionRange", "OneofDecl", "Options"});
        f2773x1458f8d = (Descriptor) internal_static_google_protobuf_DescriptorProto_descriptor.getNestedTypes().get(0);
        f2774xf366d90b = new FieldAccessorTable(f2773x1458f8d, new String[]{"Start", "End"});
        internal_static_google_protobuf_FieldDescriptorProto_descriptor = (Descriptor) getDescriptor().getMessageTypes().get(3);
        f2780x4734b330 = new FieldAccessorTable(internal_static_google_protobuf_FieldDescriptorProto_descriptor, new String[]{"Name", "Number", "Label", "Type", "TypeName", "Extendee", "DefaultValue", "OneofIndex", "Options"});
        internal_static_google_protobuf_OneofDescriptorProto_descriptor = (Descriptor) getDescriptor().getMessageTypes().get(4);
        f2785x69499c33 = new FieldAccessorTable(internal_static_google_protobuf_OneofDescriptorProto_descriptor, new String[]{"Name"});
        internal_static_google_protobuf_EnumDescriptorProto_descriptor = (Descriptor) getDescriptor().getMessageTypes().get(5);
        f2776x9945f651 = new FieldAccessorTable(internal_static_google_protobuf_EnumDescriptorProto_descriptor, new String[]{"Name", "Value", "Options"});
        f2777xf18031a8 = (Descriptor) getDescriptor().getMessageTypes().get(6);
        f2778xfb173026 = new FieldAccessorTable(f2777xf18031a8, new String[]{"Name", "Number", "Options"});
        f2786x158c73ed = (Descriptor) getDescriptor().getMessageTypes().get(7);
        f2787xee335d6b = new FieldAccessorTable(f2786x158c73ed, new String[]{"Name", "Method", "Options"});
        internal_static_google_protobuf_MethodDescriptorProto_descriptor = (Descriptor) getDescriptor().getMessageTypes().get(8);
        f2784xc5331ef1 = new FieldAccessorTable(internal_static_google_protobuf_MethodDescriptorProto_descriptor, new String[]{"Name", "InputType", "OutputType", "Options"});
        internal_static_google_protobuf_FileOptions_descriptor = (Descriptor) getDescriptor().getMessageTypes().get(9);
        internal_static_google_protobuf_FileOptions_fieldAccessorTable = new FieldAccessorTable(internal_static_google_protobuf_FileOptions_descriptor, new String[]{"JavaPackage", "JavaOuterClassname", "JavaMultipleFiles", "JavaGenerateEqualsAndHash", "JavaStringCheckUtf8", "OptimizeFor", "GoPackage", "CcGenericServices", "JavaGenericServices", "PyGenericServices", "Deprecated", "UninterpretedOption"});
        internal_static_google_protobuf_MessageOptions_descriptor = (Descriptor) getDescriptor().getMessageTypes().get(10);
        f2783x9c0b3d38 = new FieldAccessorTable(internal_static_google_protobuf_MessageOptions_descriptor, new String[]{"MessageSetWireFormat", "NoStandardDescriptorAccessor", "Deprecated", "UninterpretedOption"});
        internal_static_google_protobuf_FieldOptions_descriptor = (Descriptor) getDescriptor().getMessageTypes().get(11);
        internal_static_google_protobuf_FieldOptions_fieldAccessorTable = new FieldAccessorTable(internal_static_google_protobuf_FieldOptions_descriptor, new String[]{"Ctype", "Packed", "Lazy", "Deprecated", "ExperimentalMapKey", "Weak", "UninterpretedOption"});
        internal_static_google_protobuf_EnumOptions_descriptor = (Descriptor) getDescriptor().getMessageTypes().get(12);
        internal_static_google_protobuf_EnumOptions_fieldAccessorTable = new FieldAccessorTable(internal_static_google_protobuf_EnumOptions_descriptor, new String[]{"AllowAlias", "Deprecated", "UninterpretedOption"});
        internal_static_google_protobuf_EnumValueOptions_descriptor = (Descriptor) getDescriptor().getMessageTypes().get(13);
        f2779xdf65a421 = new FieldAccessorTable(internal_static_google_protobuf_EnumValueOptions_descriptor, new String[]{"Deprecated", "UninterpretedOption"});
        internal_static_google_protobuf_ServiceOptions_descriptor = (Descriptor) getDescriptor().getMessageTypes().get(14);
        f2788x371e666 = new FieldAccessorTable(internal_static_google_protobuf_ServiceOptions_descriptor, new String[]{"Deprecated", "UninterpretedOption"});
        internal_static_google_protobuf_MethodOptions_descriptor = (Descriptor) getDescriptor().getMessageTypes().get(15);
        internal_static_google_protobuf_MethodOptions_fieldAccessorTable = new FieldAccessorTable(internal_static_google_protobuf_MethodOptions_descriptor, new String[]{"Deprecated", "UninterpretedOption"});
        internal_static_google_protobuf_UninterpretedOption_descriptor = (Descriptor) getDescriptor().getMessageTypes().get(16);
        f2794x2101041 = new FieldAccessorTable(internal_static_google_protobuf_UninterpretedOption_descriptor, new String[]{"Name", "IdentifierValue", "PositiveIntValue", "NegativeIntValue", "DoubleValue", "StringValue", "AggregateValue"});
        f2792xb111d23c = (Descriptor) internal_static_google_protobuf_UninterpretedOption_descriptor.getNestedTypes().get(0);
        f2793x1698fcba = new FieldAccessorTable(f2792xb111d23c, new String[]{"NamePart", "IsExtension"});
        internal_static_google_protobuf_SourceCodeInfo_descriptor = (Descriptor) getDescriptor().getMessageTypes().get(17);
        f2791x532209f9 = new FieldAccessorTable(internal_static_google_protobuf_SourceCodeInfo_descriptor, new String[]{"Location"});
        f2789xb210d08d = (Descriptor) internal_static_google_protobuf_SourceCodeInfo_descriptor.getNestedTypes().get(0);
        f2790x9611a0b = new FieldAccessorTable(f2789xb210d08d, new String[]{"Path", "Span", "LeadingComments", "TrailingComments"});
    }
}
