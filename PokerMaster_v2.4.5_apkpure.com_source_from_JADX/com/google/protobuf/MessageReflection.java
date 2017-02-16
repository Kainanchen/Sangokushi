package com.google.protobuf;

import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.FieldDescriptor.JavaType;
import com.google.protobuf.Descriptors.FieldDescriptor.Type;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.ExtensionRegistry.ExtensionInfo;
import com.google.protobuf.Message.Builder;
import com.google.protobuf.UnknownFieldSet.Field;
import com.google.protobuf.WireFormat.FieldType;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import net.sqlcipher.database.SQLiteDatabase;

class MessageReflection {

    /* renamed from: com.google.protobuf.MessageReflection.1 */
    static /* synthetic */ class C03151 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type;

        static {
            $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type = new int[Type.values().length];
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Type.GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Type.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Type.ENUM.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    interface MergeTarget {

        public enum ContainerType {
            MESSAGE,
            EXTENSION_SET
        }

        MergeTarget addRepeatedField(FieldDescriptor fieldDescriptor, Object obj);

        MergeTarget clearField(FieldDescriptor fieldDescriptor);

        MergeTarget clearOneof(OneofDescriptor oneofDescriptor);

        ExtensionInfo findExtensionByName(ExtensionRegistry extensionRegistry, String str);

        ExtensionInfo findExtensionByNumber(ExtensionRegistry extensionRegistry, Descriptor descriptor, int i);

        Object finish();

        ContainerType getContainerType();

        Descriptor getDescriptorForType();

        Object getField(FieldDescriptor fieldDescriptor);

        FieldDescriptor getOneofFieldDescriptor(OneofDescriptor oneofDescriptor);

        boolean hasField(FieldDescriptor fieldDescriptor);

        boolean hasOneof(OneofDescriptor oneofDescriptor);

        MergeTarget newMergeTargetForField(FieldDescriptor fieldDescriptor, Message message);

        Object parseGroup(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, FieldDescriptor fieldDescriptor, Message message);

        Object parseMessage(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, FieldDescriptor fieldDescriptor, Message message);

        Object parseMessageFromBytes(ByteString byteString, ExtensionRegistryLite extensionRegistryLite, FieldDescriptor fieldDescriptor, Message message);

        Object readPrimitiveField(CodedInputStream codedInputStream, FieldType fieldType, boolean z);

        MergeTarget setField(FieldDescriptor fieldDescriptor, Object obj);

        MergeTarget setRepeatedField(FieldDescriptor fieldDescriptor, int i, Object obj);
    }

    static class BuilderAdapter implements MergeTarget {
        private final Builder builder;

        public Descriptor getDescriptorForType() {
            return this.builder.getDescriptorForType();
        }

        public BuilderAdapter(Builder builder) {
            this.builder = builder;
        }

        public Object getField(FieldDescriptor fieldDescriptor) {
            return this.builder.getField(fieldDescriptor);
        }

        public boolean hasField(FieldDescriptor fieldDescriptor) {
            return this.builder.hasField(fieldDescriptor);
        }

        public MergeTarget setField(FieldDescriptor fieldDescriptor, Object obj) {
            this.builder.setField(fieldDescriptor, obj);
            return this;
        }

        public MergeTarget clearField(FieldDescriptor fieldDescriptor) {
            this.builder.clearField(fieldDescriptor);
            return this;
        }

        public MergeTarget setRepeatedField(FieldDescriptor fieldDescriptor, int i, Object obj) {
            this.builder.setRepeatedField(fieldDescriptor, i, obj);
            return this;
        }

        public MergeTarget addRepeatedField(FieldDescriptor fieldDescriptor, Object obj) {
            this.builder.addRepeatedField(fieldDescriptor, obj);
            return this;
        }

        public boolean hasOneof(OneofDescriptor oneofDescriptor) {
            return this.builder.hasOneof(oneofDescriptor);
        }

        public MergeTarget clearOneof(OneofDescriptor oneofDescriptor) {
            this.builder.clearOneof(oneofDescriptor);
            return this;
        }

        public FieldDescriptor getOneofFieldDescriptor(OneofDescriptor oneofDescriptor) {
            return this.builder.getOneofFieldDescriptor(oneofDescriptor);
        }

        public ContainerType getContainerType() {
            return ContainerType.MESSAGE;
        }

        public ExtensionInfo findExtensionByName(ExtensionRegistry extensionRegistry, String str) {
            return extensionRegistry.findImmutableExtensionByName(str);
        }

        public ExtensionInfo findExtensionByNumber(ExtensionRegistry extensionRegistry, Descriptor descriptor, int i) {
            return extensionRegistry.findImmutableExtensionByNumber(descriptor, i);
        }

        public Object parseGroup(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, FieldDescriptor fieldDescriptor, Message message) {
            MessageLite.Builder newBuilderForType;
            if (message != null) {
                newBuilderForType = message.newBuilderForType();
            } else {
                Object newBuilderForField = this.builder.newBuilderForField(fieldDescriptor);
            }
            if (!fieldDescriptor.isRepeated()) {
                Message message2 = (Message) getField(fieldDescriptor);
                if (message2 != null) {
                    newBuilderForType.mergeFrom(message2);
                }
            }
            codedInputStream.readGroup(fieldDescriptor.getNumber(), newBuilderForType, extensionRegistryLite);
            return newBuilderForType.buildPartial();
        }

        public Object parseMessage(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, FieldDescriptor fieldDescriptor, Message message) {
            MessageLite.Builder newBuilderForType;
            if (message != null) {
                newBuilderForType = message.newBuilderForType();
            } else {
                Object newBuilderForField = this.builder.newBuilderForField(fieldDescriptor);
            }
            if (!fieldDescriptor.isRepeated()) {
                Message message2 = (Message) getField(fieldDescriptor);
                if (message2 != null) {
                    newBuilderForType.mergeFrom(message2);
                }
            }
            codedInputStream.readMessage(newBuilderForType, extensionRegistryLite);
            return newBuilderForType.buildPartial();
        }

        public Object parseMessageFromBytes(ByteString byteString, ExtensionRegistryLite extensionRegistryLite, FieldDescriptor fieldDescriptor, Message message) {
            Builder newBuilderForType;
            if (message != null) {
                newBuilderForType = message.newBuilderForType();
            } else {
                newBuilderForType = this.builder.newBuilderForField(fieldDescriptor);
            }
            if (!fieldDescriptor.isRepeated()) {
                Message message2 = (Message) getField(fieldDescriptor);
                if (message2 != null) {
                    newBuilderForType.mergeFrom(message2);
                }
            }
            newBuilderForType.mergeFrom(byteString, extensionRegistryLite);
            return newBuilderForType.buildPartial();
        }

        public MergeTarget newMergeTargetForField(FieldDescriptor fieldDescriptor, Message message) {
            if (message != null) {
                return new BuilderAdapter(message.newBuilderForType());
            }
            return new BuilderAdapter(this.builder.newBuilderForField(fieldDescriptor));
        }

        public Object readPrimitiveField(CodedInputStream codedInputStream, FieldType fieldType, boolean z) {
            return FieldSet.readPrimitiveField(codedInputStream, fieldType, z);
        }

        public Object finish() {
            return this.builder.buildPartial();
        }
    }

    static class ExtensionAdapter implements MergeTarget {
        private final FieldSet<FieldDescriptor> extensions;

        ExtensionAdapter(FieldSet<FieldDescriptor> fieldSet) {
            this.extensions = fieldSet;
        }

        public Descriptor getDescriptorForType() {
            throw new UnsupportedOperationException("getDescriptorForType() called on FieldSet object");
        }

        public Object getField(FieldDescriptor fieldDescriptor) {
            return this.extensions.getField(fieldDescriptor);
        }

        public boolean hasField(FieldDescriptor fieldDescriptor) {
            return this.extensions.hasField(fieldDescriptor);
        }

        public MergeTarget setField(FieldDescriptor fieldDescriptor, Object obj) {
            this.extensions.setField(fieldDescriptor, obj);
            return this;
        }

        public MergeTarget clearField(FieldDescriptor fieldDescriptor) {
            this.extensions.clearField(fieldDescriptor);
            return this;
        }

        public MergeTarget setRepeatedField(FieldDescriptor fieldDescriptor, int i, Object obj) {
            this.extensions.setRepeatedField(fieldDescriptor, i, obj);
            return this;
        }

        public MergeTarget addRepeatedField(FieldDescriptor fieldDescriptor, Object obj) {
            this.extensions.addRepeatedField(fieldDescriptor, obj);
            return this;
        }

        public boolean hasOneof(OneofDescriptor oneofDescriptor) {
            return false;
        }

        public MergeTarget clearOneof(OneofDescriptor oneofDescriptor) {
            return this;
        }

        public FieldDescriptor getOneofFieldDescriptor(OneofDescriptor oneofDescriptor) {
            return null;
        }

        public ContainerType getContainerType() {
            return ContainerType.EXTENSION_SET;
        }

        public ExtensionInfo findExtensionByName(ExtensionRegistry extensionRegistry, String str) {
            return extensionRegistry.findImmutableExtensionByName(str);
        }

        public ExtensionInfo findExtensionByNumber(ExtensionRegistry extensionRegistry, Descriptor descriptor, int i) {
            return extensionRegistry.findImmutableExtensionByNumber(descriptor, i);
        }

        public Object parseGroup(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, FieldDescriptor fieldDescriptor, Message message) {
            MessageLite.Builder newBuilderForType = message.newBuilderForType();
            if (!fieldDescriptor.isRepeated()) {
                Message message2 = (Message) getField(fieldDescriptor);
                if (message2 != null) {
                    newBuilderForType.mergeFrom(message2);
                }
            }
            codedInputStream.readGroup(fieldDescriptor.getNumber(), newBuilderForType, extensionRegistryLite);
            return newBuilderForType.buildPartial();
        }

        public Object parseMessage(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, FieldDescriptor fieldDescriptor, Message message) {
            MessageLite.Builder newBuilderForType = message.newBuilderForType();
            if (!fieldDescriptor.isRepeated()) {
                Message message2 = (Message) getField(fieldDescriptor);
                if (message2 != null) {
                    newBuilderForType.mergeFrom(message2);
                }
            }
            codedInputStream.readMessage(newBuilderForType, extensionRegistryLite);
            return newBuilderForType.buildPartial();
        }

        public Object parseMessageFromBytes(ByteString byteString, ExtensionRegistryLite extensionRegistryLite, FieldDescriptor fieldDescriptor, Message message) {
            Builder newBuilderForType = message.newBuilderForType();
            if (!fieldDescriptor.isRepeated()) {
                Message message2 = (Message) getField(fieldDescriptor);
                if (message2 != null) {
                    newBuilderForType.mergeFrom(message2);
                }
            }
            newBuilderForType.mergeFrom(byteString, extensionRegistryLite);
            return newBuilderForType.buildPartial();
        }

        public MergeTarget newMergeTargetForField(FieldDescriptor fieldDescriptor, Message message) {
            throw new UnsupportedOperationException("newMergeTargetForField() called on FieldSet object");
        }

        public Object readPrimitiveField(CodedInputStream codedInputStream, FieldType fieldType, boolean z) {
            return FieldSet.readPrimitiveField(codedInputStream, fieldType, z);
        }

        public Object finish() {
            throw new UnsupportedOperationException("finish() called on FieldSet object");
        }
    }

    MessageReflection() {
    }

    static void writeMessageTo(Message message, CodedOutputStream codedOutputStream, boolean z) {
        boolean messageSetWireFormat = message.getDescriptorForType().getOptions().getMessageSetWireFormat();
        Map allFields = message.getAllFields();
        if (z) {
            Map treeMap = new TreeMap(allFields);
            for (FieldDescriptor fieldDescriptor : message.getDescriptorForType().getFields()) {
                if (fieldDescriptor.isRequired() && !treeMap.containsKey(fieldDescriptor)) {
                    treeMap.put(fieldDescriptor, message.getField(fieldDescriptor));
                }
            }
            allFields = treeMap;
        }
        for (Entry entry : r0.entrySet()) {
            FieldDescriptor fieldDescriptor2 = (FieldDescriptor) entry.getKey();
            Object value = entry.getValue();
            if (messageSetWireFormat && fieldDescriptor2.isExtension() && fieldDescriptor2.getType() == Type.MESSAGE && !fieldDescriptor2.isRepeated()) {
                codedOutputStream.writeMessageSetExtension(fieldDescriptor2.getNumber(), (Message) value);
            } else {
                FieldSet.writeField(fieldDescriptor2, value, codedOutputStream);
            }
        }
        UnknownFieldSet unknownFields = message.getUnknownFields();
        if (messageSetWireFormat) {
            unknownFields.writeAsMessageSetTo(codedOutputStream);
        } else {
            unknownFields.writeTo(codedOutputStream);
        }
    }

    static int getSerializedSize(Message message) {
        boolean messageSetWireFormat = message.getDescriptorForType().getOptions().getMessageSetWireFormat();
        int i = 0;
        for (Entry entry : message.getAllFields().entrySet()) {
            FieldDescriptor fieldDescriptor = (FieldDescriptor) entry.getKey();
            Object value = entry.getValue();
            if (messageSetWireFormat && fieldDescriptor.isExtension() && fieldDescriptor.getType() == Type.MESSAGE && !fieldDescriptor.isRepeated()) {
                i = CodedOutputStream.computeMessageSetExtensionSize(fieldDescriptor.getNumber(), (Message) value) + i;
            } else {
                i = FieldSet.computeFieldSize(fieldDescriptor, value) + i;
            }
        }
        UnknownFieldSet unknownFields = message.getUnknownFields();
        if (messageSetWireFormat) {
            return unknownFields.getSerializedSizeAsMessageSet() + i;
        }
        return unknownFields.getSerializedSize() + i;
    }

    static String delimitWithCommas(List<String> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : list) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }

    static boolean isInitialized(MessageOrBuilder messageOrBuilder) {
        for (FieldDescriptor fieldDescriptor : messageOrBuilder.getDescriptorForType().getFields()) {
            if (fieldDescriptor.isRequired() && !messageOrBuilder.hasField(fieldDescriptor)) {
                return false;
            }
        }
        for (Entry entry : messageOrBuilder.getAllFields().entrySet()) {
            FieldDescriptor fieldDescriptor2 = (FieldDescriptor) entry.getKey();
            if (fieldDescriptor2.getJavaType() == JavaType.MESSAGE) {
                if (fieldDescriptor2.isRepeated()) {
                    for (Message isInitialized : (List) entry.getValue()) {
                        if (!isInitialized.isInitialized()) {
                            return false;
                        }
                    }
                    continue;
                } else if (!((Message) entry.getValue()).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    private static String subMessagePrefix(String str, FieldDescriptor fieldDescriptor, int i) {
        StringBuilder stringBuilder = new StringBuilder(str);
        if (fieldDescriptor.isExtension()) {
            stringBuilder.append('(').append(fieldDescriptor.getFullName()).append(')');
        } else {
            stringBuilder.append(fieldDescriptor.getName());
        }
        if (i != -1) {
            stringBuilder.append('[').append(i).append(']');
        }
        stringBuilder.append('.');
        return stringBuilder.toString();
    }

    private static void findMissingFields(MessageOrBuilder messageOrBuilder, String str, List<String> list) {
        for (FieldDescriptor fieldDescriptor : messageOrBuilder.getDescriptorForType().getFields()) {
            if (fieldDescriptor.isRequired() && !messageOrBuilder.hasField(fieldDescriptor)) {
                list.add(str + fieldDescriptor.getName());
            }
        }
        for (Entry entry : messageOrBuilder.getAllFields().entrySet()) {
            FieldDescriptor fieldDescriptor2 = (FieldDescriptor) entry.getKey();
            Object value = entry.getValue();
            if (fieldDescriptor2.getJavaType() == JavaType.MESSAGE) {
                if (fieldDescriptor2.isRepeated()) {
                    int i = 0;
                    for (MessageOrBuilder findMissingFields : (List) value) {
                        int i2 = i + 1;
                        findMissingFields(findMissingFields, subMessagePrefix(str, fieldDescriptor2, i), list);
                        i = i2;
                    }
                } else if (messageOrBuilder.hasField(fieldDescriptor2)) {
                    findMissingFields((MessageOrBuilder) value, subMessagePrefix(str, fieldDescriptor2, -1), list);
                }
            }
        }
    }

    static List<String> findMissingFields(MessageOrBuilder messageOrBuilder) {
        List<String> arrayList = new ArrayList();
        findMissingFields(messageOrBuilder, LetterIndexBar.SEARCH_ICON_LETTER, arrayList);
        return arrayList;
    }

    static boolean mergeFieldFrom(CodedInputStream codedInputStream, UnknownFieldSet.Builder builder, ExtensionRegistryLite extensionRegistryLite, Descriptor descriptor, MergeTarget mergeTarget, int i) {
        Message message = null;
        boolean z = false;
        if (descriptor.getOptions().getMessageSetWireFormat() && i == WireFormat.MESSAGE_SET_ITEM_TAG) {
            mergeMessageSetExtensionFromCodedStream(codedInputStream, builder, extensionRegistryLite, descriptor, mergeTarget);
            return true;
        }
        FieldDescriptor findFieldByNumber;
        boolean z2;
        Object parseGroup;
        int readEnum;
        EnumValueDescriptor findValueByNumber;
        int tagWireType = WireFormat.getTagWireType(i);
        int tagFieldNumber = WireFormat.getTagFieldNumber(i);
        if (!descriptor.isExtensionNumber(tagFieldNumber)) {
            if (mergeTarget.getContainerType() == ContainerType.MESSAGE) {
                findFieldByNumber = descriptor.findFieldByNumber(tagFieldNumber);
            }
            findFieldByNumber = null;
        } else if (extensionRegistryLite instanceof ExtensionRegistry) {
            ExtensionInfo findExtensionByNumber = mergeTarget.findExtensionByNumber((ExtensionRegistry) extensionRegistryLite, descriptor, tagFieldNumber);
            if (findExtensionByNumber != null) {
                FieldDescriptor fieldDescriptor = findExtensionByNumber.descriptor;
                Message message2 = findExtensionByNumber.defaultInstance;
                if (message2 == null && fieldDescriptor.getJavaType() == JavaType.MESSAGE) {
                    throw new IllegalStateException("Message-typed extension lacked default instance: " + fieldDescriptor.getFullName());
                }
                findFieldByNumber = fieldDescriptor;
                message = message2;
            }
            findFieldByNumber = null;
        } else {
            findFieldByNumber = null;
        }
        if (findFieldByNumber != null) {
            if (tagWireType == FieldSet.getWireFormatForFieldType(findFieldByNumber.getLiteType(), false)) {
                z2 = false;
            } else if (findFieldByNumber.isPackable() && tagWireType == FieldSet.getWireFormatForFieldType(findFieldByNumber.getLiteType(), true)) {
                z2 = true;
            }
            if (z) {
                return builder.mergeFieldFrom(i, codedInputStream);
            }
            if (z2) {
                switch (C03151.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[findFieldByNumber.getType().ordinal()]) {
                    case SQLiteDatabase.OPEN_READONLY /*1*/:
                        parseGroup = mergeTarget.parseGroup(codedInputStream, extensionRegistryLite, findFieldByNumber, message);
                        break;
                    case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                        parseGroup = mergeTarget.parseMessage(codedInputStream, extensionRegistryLite, findFieldByNumber, message);
                        break;
                    case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                        readEnum = codedInputStream.readEnum();
                        parseGroup = findFieldByNumber.getEnumType().findValueByNumber(readEnum);
                        if (parseGroup == null) {
                            builder.mergeVarintField(tagFieldNumber, readEnum);
                            return true;
                        }
                        break;
                    default:
                        parseGroup = mergeTarget.readPrimitiveField(codedInputStream, findFieldByNumber.getLiteType(), findFieldByNumber.needsUtf8Check());
                        break;
                }
                if (findFieldByNumber.isRepeated()) {
                    mergeTarget.setField(findFieldByNumber, parseGroup);
                } else {
                    mergeTarget.addRepeatedField(findFieldByNumber, parseGroup);
                }
            } else {
                int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                if (findFieldByNumber.getLiteType() != FieldType.ENUM) {
                    while (codedInputStream.getBytesUntilLimit() > 0) {
                        findValueByNumber = findFieldByNumber.getEnumType().findValueByNumber(codedInputStream.readEnum());
                        if (findValueByNumber == null) {
                            return true;
                        }
                        mergeTarget.addRepeatedField(findFieldByNumber, findValueByNumber);
                    }
                } else {
                    while (codedInputStream.getBytesUntilLimit() > 0) {
                        mergeTarget.addRepeatedField(findFieldByNumber, mergeTarget.readPrimitiveField(codedInputStream, findFieldByNumber.getLiteType(), findFieldByNumber.needsUtf8Check()));
                    }
                }
                codedInputStream.popLimit(pushLimit);
            }
            return true;
        }
        z2 = false;
        z = true;
        if (z) {
            return builder.mergeFieldFrom(i, codedInputStream);
        }
        if (z2) {
            switch (C03151.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[findFieldByNumber.getType().ordinal()]) {
                case SQLiteDatabase.OPEN_READONLY /*1*/:
                    parseGroup = mergeTarget.parseGroup(codedInputStream, extensionRegistryLite, findFieldByNumber, message);
                    break;
                case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                    parseGroup = mergeTarget.parseMessage(codedInputStream, extensionRegistryLite, findFieldByNumber, message);
                    break;
                case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                    readEnum = codedInputStream.readEnum();
                    parseGroup = findFieldByNumber.getEnumType().findValueByNumber(readEnum);
                    if (parseGroup == null) {
                        builder.mergeVarintField(tagFieldNumber, readEnum);
                        return true;
                    }
                    break;
                default:
                    parseGroup = mergeTarget.readPrimitiveField(codedInputStream, findFieldByNumber.getLiteType(), findFieldByNumber.needsUtf8Check());
                    break;
            }
            if (findFieldByNumber.isRepeated()) {
                mergeTarget.setField(findFieldByNumber, parseGroup);
            } else {
                mergeTarget.addRepeatedField(findFieldByNumber, parseGroup);
            }
        } else {
            int pushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
            if (findFieldByNumber.getLiteType() != FieldType.ENUM) {
                while (codedInputStream.getBytesUntilLimit() > 0) {
                    mergeTarget.addRepeatedField(findFieldByNumber, mergeTarget.readPrimitiveField(codedInputStream, findFieldByNumber.getLiteType(), findFieldByNumber.needsUtf8Check()));
                }
            } else {
                while (codedInputStream.getBytesUntilLimit() > 0) {
                    findValueByNumber = findFieldByNumber.getEnumType().findValueByNumber(codedInputStream.readEnum());
                    if (findValueByNumber == null) {
                        return true;
                    }
                    mergeTarget.addRepeatedField(findFieldByNumber, findValueByNumber);
                }
            }
            codedInputStream.popLimit(pushLimit2);
        }
        return true;
    }

    private static void mergeMessageSetExtensionFromCodedStream(CodedInputStream codedInputStream, UnknownFieldSet.Builder builder, ExtensionRegistryLite extensionRegistryLite, Descriptor descriptor, MergeTarget mergeTarget) {
        ByteString byteString = null;
        int i = 0;
        ExtensionInfo extensionInfo = null;
        while (true) {
            int readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                i = codedInputStream.readUInt32();
                if (i != 0 && (extensionRegistryLite instanceof ExtensionRegistry)) {
                    extensionInfo = mergeTarget.findExtensionByNumber((ExtensionRegistry) extensionRegistryLite, descriptor, i);
                }
            } else if (readTag == WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                if (i == 0 || extensionInfo == null || !ExtensionRegistryLite.isEagerlyParseMessageSets()) {
                    byteString = codedInputStream.readBytes();
                } else {
                    eagerlyMergeMessageSetExtension(codedInputStream, extensionInfo, extensionRegistryLite, mergeTarget);
                    byteString = null;
                }
            } else if (!codedInputStream.skipField(readTag)) {
                break;
            }
        }
        codedInputStream.checkLastTagWas(WireFormat.MESSAGE_SET_ITEM_END_TAG);
        if (byteString != null && i != 0) {
            if (extensionInfo != null) {
                mergeMessageSetExtensionFromBytes(byteString, extensionInfo, extensionRegistryLite, mergeTarget);
            } else if (byteString != null) {
                builder.mergeField(i, Field.newBuilder().addLengthDelimited(byteString).build());
            }
        }
    }

    private static void mergeMessageSetExtensionFromBytes(ByteString byteString, ExtensionInfo extensionInfo, ExtensionRegistryLite extensionRegistryLite, MergeTarget mergeTarget) {
        FieldDescriptor fieldDescriptor = extensionInfo.descriptor;
        if (mergeTarget.hasField(fieldDescriptor) || ExtensionRegistryLite.isEagerlyParseMessageSets()) {
            mergeTarget.setField(fieldDescriptor, mergeTarget.parseMessageFromBytes(byteString, extensionRegistryLite, fieldDescriptor, extensionInfo.defaultInstance));
        } else {
            mergeTarget.setField(fieldDescriptor, new LazyField(extensionInfo.defaultInstance, extensionRegistryLite, byteString));
        }
    }

    private static void eagerlyMergeMessageSetExtension(CodedInputStream codedInputStream, ExtensionInfo extensionInfo, ExtensionRegistryLite extensionRegistryLite, MergeTarget mergeTarget) {
        FieldDescriptor fieldDescriptor = extensionInfo.descriptor;
        mergeTarget.setField(fieldDescriptor, mergeTarget.parseMessage(codedInputStream, extensionRegistryLite, fieldDescriptor, extensionInfo.defaultInstance));
    }
}
