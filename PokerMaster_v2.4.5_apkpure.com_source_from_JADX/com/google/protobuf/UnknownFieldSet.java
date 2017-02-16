package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import net.sqlcipher.database.SQLiteDatabase;

public final class UnknownFieldSet implements MessageLite {
    private static final Parser PARSER;
    private static final UnknownFieldSet defaultInstance;
    private Map<Integer, Field> fields;

    public static final class Builder implements com.google.protobuf.MessageLite.Builder {
        private Map<Integer, Field> fields;
        private Builder lastField;
        private int lastFieldNumber;

        private Builder() {
        }

        private static Builder create() {
            Builder builder = new Builder();
            builder.reinitialize();
            return builder;
        }

        private Builder getFieldBuilder(int i) {
            if (this.lastField != null) {
                if (i == this.lastFieldNumber) {
                    return this.lastField;
                }
                addField(this.lastFieldNumber, this.lastField.build());
            }
            if (i == 0) {
                return null;
            }
            Field field = (Field) this.fields.get(Integer.valueOf(i));
            this.lastFieldNumber = i;
            this.lastField = Field.newBuilder();
            if (field != null) {
                this.lastField.mergeFrom(field);
            }
            return this.lastField;
        }

        public final UnknownFieldSet build() {
            UnknownFieldSet defaultInstance;
            getFieldBuilder(0);
            if (this.fields.isEmpty()) {
                defaultInstance = UnknownFieldSet.getDefaultInstance();
            } else {
                defaultInstance = new UnknownFieldSet(null);
            }
            this.fields = null;
            return defaultInstance;
        }

        public final UnknownFieldSet buildPartial() {
            return build();
        }

        public final Builder clone() {
            getFieldBuilder(0);
            return UnknownFieldSet.newBuilder().mergeFrom(new UnknownFieldSet(null));
        }

        public final UnknownFieldSet getDefaultInstanceForType() {
            return UnknownFieldSet.getDefaultInstance();
        }

        private void reinitialize() {
            this.fields = Collections.emptyMap();
            this.lastFieldNumber = 0;
            this.lastField = null;
        }

        public final Builder clear() {
            reinitialize();
            return this;
        }

        public final Builder clearField(int i) {
            if (i == 0) {
                throw new IllegalArgumentException("Zero is not a valid field number.");
            }
            if (this.lastField != null && this.lastFieldNumber == i) {
                this.lastField = null;
                this.lastFieldNumber = 0;
            }
            if (this.fields.containsKey(Integer.valueOf(i))) {
                this.fields.remove(Integer.valueOf(i));
            }
            return this;
        }

        public final Builder mergeFrom(UnknownFieldSet unknownFieldSet) {
            if (unknownFieldSet != UnknownFieldSet.getDefaultInstance()) {
                for (Entry entry : unknownFieldSet.fields.entrySet()) {
                    mergeField(((Integer) entry.getKey()).intValue(), (Field) entry.getValue());
                }
            }
            return this;
        }

        public final Builder mergeField(int i, Field field) {
            if (i == 0) {
                throw new IllegalArgumentException("Zero is not a valid field number.");
            }
            if (hasField(i)) {
                getFieldBuilder(i).mergeFrom(field);
            } else {
                addField(i, field);
            }
            return this;
        }

        public final Builder mergeVarintField(int i, int i2) {
            if (i == 0) {
                throw new IllegalArgumentException("Zero is not a valid field number.");
            }
            getFieldBuilder(i).addVarint((long) i2);
            return this;
        }

        public final boolean hasField(int i) {
            if (i != 0) {
                return i == this.lastFieldNumber || this.fields.containsKey(Integer.valueOf(i));
            } else {
                throw new IllegalArgumentException("Zero is not a valid field number.");
            }
        }

        public final Builder addField(int i, Field field) {
            if (i == 0) {
                throw new IllegalArgumentException("Zero is not a valid field number.");
            }
            if (this.lastField != null && this.lastFieldNumber == i) {
                this.lastField = null;
                this.lastFieldNumber = 0;
            }
            if (this.fields.isEmpty()) {
                this.fields = new TreeMap();
            }
            this.fields.put(Integer.valueOf(i), field);
            return this;
        }

        public final Map<Integer, Field> asMap() {
            getFieldBuilder(0);
            return Collections.unmodifiableMap(this.fields);
        }

        public final Builder mergeFrom(CodedInputStream codedInputStream) {
            int readTag;
            do {
                readTag = codedInputStream.readTag();
                if (readTag == 0) {
                    break;
                }
            } while (mergeFieldFrom(readTag, codedInputStream));
            return this;
        }

        public final boolean mergeFieldFrom(int i, CodedInputStream codedInputStream) {
            int tagFieldNumber = WireFormat.getTagFieldNumber(i);
            switch (WireFormat.getTagWireType(i)) {
                case SQLiteDatabase.OPEN_READWRITE /*0*/:
                    getFieldBuilder(tagFieldNumber).addVarint(codedInputStream.readInt64());
                    return true;
                case SQLiteDatabase.OPEN_READONLY /*1*/:
                    getFieldBuilder(tagFieldNumber).addFixed64(codedInputStream.readFixed64());
                    return true;
                case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                    getFieldBuilder(tagFieldNumber).addLengthDelimited(codedInputStream.readBytes());
                    return true;
                case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                    com.google.protobuf.MessageLite.Builder newBuilder = UnknownFieldSet.newBuilder();
                    codedInputStream.readGroup(tagFieldNumber, newBuilder, ExtensionRegistry.getEmptyRegistry());
                    getFieldBuilder(tagFieldNumber).addGroup(newBuilder.build());
                    return true;
                case SQLiteDatabase.CONFLICT_IGNORE /*4*/:
                    return false;
                case SQLiteDatabase.CONFLICT_REPLACE /*5*/:
                    getFieldBuilder(tagFieldNumber).addFixed32(codedInputStream.readFixed32());
                    return true;
                default:
                    throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        public final Builder mergeFrom(ByteString byteString) {
            try {
                CodedInputStream newCodedInput = byteString.newCodedInput();
                mergeFrom(newCodedInput);
                newCodedInput.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (Throwable e2) {
                throw new RuntimeException("Reading from a ByteString threw an IOException (should never happen).", e2);
            }
        }

        public final Builder mergeFrom(byte[] bArr) {
            try {
                CodedInputStream newInstance = CodedInputStream.newInstance(bArr);
                mergeFrom(newInstance);
                newInstance.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (Throwable e2) {
                throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
            }
        }

        public final Builder mergeFrom(InputStream inputStream) {
            CodedInputStream newInstance = CodedInputStream.newInstance(inputStream);
            mergeFrom(newInstance);
            newInstance.checkLastTagWas(0);
            return this;
        }

        public final boolean mergeDelimitedFrom(InputStream inputStream) {
            int read = inputStream.read();
            if (read == -1) {
                return false;
            }
            mergeFrom(new LimitedInputStream(inputStream, CodedInputStream.readRawVarint32(read, inputStream)));
            return true;
        }

        public final boolean mergeDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return mergeDelimitedFrom(inputStream);
        }

        public final Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return mergeFrom(codedInputStream);
        }

        public final Builder mergeFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return mergeFrom(byteString);
        }

        public final Builder mergeFrom(byte[] bArr, int i, int i2) {
            try {
                CodedInputStream newInstance = CodedInputStream.newInstance(bArr, i, i2);
                mergeFrom(newInstance);
                newInstance.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (Throwable e2) {
                throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
            }
        }

        public final Builder mergeFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return mergeFrom(bArr);
        }

        public final Builder mergeFrom(byte[] bArr, int i, int i2, ExtensionRegistryLite extensionRegistryLite) {
            return mergeFrom(bArr, i, i2);
        }

        public final Builder mergeFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return mergeFrom(inputStream);
        }

        public final boolean isInitialized() {
            return true;
        }
    }

    public static final class Field {
        private static final Field fieldDefaultInstance;
        private List<Integer> fixed32;
        private List<Long> fixed64;
        private List<UnknownFieldSet> group;
        private List<ByteString> lengthDelimited;
        private List<Long> varint;

        public static final class Builder {
            private Field result;

            private Builder() {
            }

            private static Builder create() {
                Builder builder = new Builder();
                builder.result = new Field();
                return builder;
            }

            public final Field build() {
                if (this.result.varint == null) {
                    this.result.varint = Collections.emptyList();
                } else {
                    this.result.varint = Collections.unmodifiableList(this.result.varint);
                }
                if (this.result.fixed32 == null) {
                    this.result.fixed32 = Collections.emptyList();
                } else {
                    this.result.fixed32 = Collections.unmodifiableList(this.result.fixed32);
                }
                if (this.result.fixed64 == null) {
                    this.result.fixed64 = Collections.emptyList();
                } else {
                    this.result.fixed64 = Collections.unmodifiableList(this.result.fixed64);
                }
                if (this.result.lengthDelimited == null) {
                    this.result.lengthDelimited = Collections.emptyList();
                } else {
                    this.result.lengthDelimited = Collections.unmodifiableList(this.result.lengthDelimited);
                }
                if (this.result.group == null) {
                    this.result.group = Collections.emptyList();
                } else {
                    this.result.group = Collections.unmodifiableList(this.result.group);
                }
                Field field = this.result;
                this.result = null;
                return field;
            }

            public final Builder clear() {
                this.result = new Field();
                return this;
            }

            public final Builder mergeFrom(Field field) {
                if (!field.varint.isEmpty()) {
                    if (this.result.varint == null) {
                        this.result.varint = new ArrayList();
                    }
                    this.result.varint.addAll(field.varint);
                }
                if (!field.fixed32.isEmpty()) {
                    if (this.result.fixed32 == null) {
                        this.result.fixed32 = new ArrayList();
                    }
                    this.result.fixed32.addAll(field.fixed32);
                }
                if (!field.fixed64.isEmpty()) {
                    if (this.result.fixed64 == null) {
                        this.result.fixed64 = new ArrayList();
                    }
                    this.result.fixed64.addAll(field.fixed64);
                }
                if (!field.lengthDelimited.isEmpty()) {
                    if (this.result.lengthDelimited == null) {
                        this.result.lengthDelimited = new ArrayList();
                    }
                    this.result.lengthDelimited.addAll(field.lengthDelimited);
                }
                if (!field.group.isEmpty()) {
                    if (this.result.group == null) {
                        this.result.group = new ArrayList();
                    }
                    this.result.group.addAll(field.group);
                }
                return this;
            }

            public final Builder addVarint(long j) {
                if (this.result.varint == null) {
                    this.result.varint = new ArrayList();
                }
                this.result.varint.add(Long.valueOf(j));
                return this;
            }

            public final Builder addFixed32(int i) {
                if (this.result.fixed32 == null) {
                    this.result.fixed32 = new ArrayList();
                }
                this.result.fixed32.add(Integer.valueOf(i));
                return this;
            }

            public final Builder addFixed64(long j) {
                if (this.result.fixed64 == null) {
                    this.result.fixed64 = new ArrayList();
                }
                this.result.fixed64.add(Long.valueOf(j));
                return this;
            }

            public final Builder addLengthDelimited(ByteString byteString) {
                if (this.result.lengthDelimited == null) {
                    this.result.lengthDelimited = new ArrayList();
                }
                this.result.lengthDelimited.add(byteString);
                return this;
            }

            public final Builder addGroup(UnknownFieldSet unknownFieldSet) {
                if (this.result.group == null) {
                    this.result.group = new ArrayList();
                }
                this.result.group.add(unknownFieldSet);
                return this;
            }
        }

        private Field() {
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(Field field) {
            return newBuilder().mergeFrom(field);
        }

        public static Field getDefaultInstance() {
            return fieldDefaultInstance;
        }

        static {
            fieldDefaultInstance = newBuilder().build();
        }

        public final List<Long> getVarintList() {
            return this.varint;
        }

        public final List<Integer> getFixed32List() {
            return this.fixed32;
        }

        public final List<Long> getFixed64List() {
            return this.fixed64;
        }

        public final List<ByteString> getLengthDelimitedList() {
            return this.lengthDelimited;
        }

        public final List<UnknownFieldSet> getGroupList() {
            return this.group;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Field) {
                return Arrays.equals(getIdentityArray(), ((Field) obj).getIdentityArray());
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(getIdentityArray());
        }

        private Object[] getIdentityArray() {
            return new Object[]{this.varint, this.fixed32, this.fixed64, this.lengthDelimited, this.group};
        }

        public final void writeTo(int i, CodedOutputStream codedOutputStream) {
            for (Long longValue : this.varint) {
                codedOutputStream.writeUInt64(i, longValue.longValue());
            }
            for (Integer intValue : this.fixed32) {
                codedOutputStream.writeFixed32(i, intValue.intValue());
            }
            for (Long longValue2 : this.fixed64) {
                codedOutputStream.writeFixed64(i, longValue2.longValue());
            }
            for (ByteString writeBytes : this.lengthDelimited) {
                codedOutputStream.writeBytes(i, writeBytes);
            }
            for (UnknownFieldSet writeGroup : this.group) {
                codedOutputStream.writeGroup(i, writeGroup);
            }
        }

        public final int getSerializedSize(int i) {
            int i2 = 0;
            for (Long longValue : this.varint) {
                i2 = CodedOutputStream.computeUInt64Size(i, longValue.longValue()) + i2;
            }
            for (Integer intValue : this.fixed32) {
                i2 += CodedOutputStream.computeFixed32Size(i, intValue.intValue());
            }
            for (Long longValue2 : this.fixed64) {
                i2 += CodedOutputStream.computeFixed64Size(i, longValue2.longValue());
            }
            for (ByteString computeBytesSize : this.lengthDelimited) {
                i2 += CodedOutputStream.computeBytesSize(i, computeBytesSize);
            }
            for (UnknownFieldSet computeGroupSize : this.group) {
                i2 += CodedOutputStream.computeGroupSize(i, computeGroupSize);
            }
            return i2;
        }

        public final void writeAsMessageSetExtensionTo(int i, CodedOutputStream codedOutputStream) {
            for (ByteString writeRawMessageSetExtension : this.lengthDelimited) {
                codedOutputStream.writeRawMessageSetExtension(i, writeRawMessageSetExtension);
            }
        }

        public final int getSerializedSizeAsMessageSetExtension(int i) {
            int i2 = 0;
            for (ByteString computeRawMessageSetExtensionSize : this.lengthDelimited) {
                i2 = CodedOutputStream.computeRawMessageSetExtensionSize(i, computeRawMessageSetExtensionSize) + i2;
            }
            return i2;
        }
    }

    public static final class Parser extends AbstractParser<UnknownFieldSet> {
        public final UnknownFieldSet parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            Builder newBuilder = UnknownFieldSet.newBuilder();
            try {
                newBuilder.mergeFrom(codedInputStream);
                return newBuilder.buildPartial();
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(newBuilder.buildPartial());
            } catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(newBuilder.buildPartial());
            }
        }
    }

    private UnknownFieldSet() {
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(UnknownFieldSet unknownFieldSet) {
        return newBuilder().mergeFrom(unknownFieldSet);
    }

    public static UnknownFieldSet getDefaultInstance() {
        return defaultInstance;
    }

    public final UnknownFieldSet getDefaultInstanceForType() {
        return defaultInstance;
    }

    static {
        defaultInstance = new UnknownFieldSet(Collections.emptyMap());
        PARSER = new Parser();
    }

    private UnknownFieldSet(Map<Integer, Field> map) {
        this.fields = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof UnknownFieldSet) && this.fields.equals(((UnknownFieldSet) obj).fields)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.fields.hashCode();
    }

    public final Map<Integer, Field> asMap() {
        return this.fields;
    }

    public final boolean hasField(int i) {
        return this.fields.containsKey(Integer.valueOf(i));
    }

    public final Field getField(int i) {
        Field field = (Field) this.fields.get(Integer.valueOf(i));
        return field == null ? Field.getDefaultInstance() : field;
    }

    public final void writeTo(CodedOutputStream codedOutputStream) {
        for (Entry entry : this.fields.entrySet()) {
            ((Field) entry.getValue()).writeTo(((Integer) entry.getKey()).intValue(), codedOutputStream);
        }
    }

    public final String toString() {
        return TextFormat.printToString(this);
    }

    public final ByteString toByteString() {
        try {
            CodedBuilder newCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            writeTo(newCodedBuilder.getCodedOutput());
            return newCodedBuilder.build();
        } catch (Throwable e) {
            throw new RuntimeException("Serializing to a ByteString threw an IOException (should never happen).", e);
        }
    }

    public final byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream newInstance = CodedOutputStream.newInstance(bArr);
            writeTo(newInstance);
            newInstance.checkNoSpaceLeft();
            return bArr;
        } catch (Throwable e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public final void writeTo(OutputStream outputStream) {
        CodedOutputStream newInstance = CodedOutputStream.newInstance(outputStream);
        writeTo(newInstance);
        newInstance.flush();
    }

    public final void writeDelimitedTo(OutputStream outputStream) {
        CodedOutputStream newInstance = CodedOutputStream.newInstance(outputStream);
        newInstance.writeRawVarint32(getSerializedSize());
        writeTo(newInstance);
        newInstance.flush();
    }

    public final int getSerializedSize() {
        int i = 0;
        for (Entry entry : this.fields.entrySet()) {
            i = ((Field) entry.getValue()).getSerializedSize(((Integer) entry.getKey()).intValue()) + i;
        }
        return i;
    }

    public final void writeAsMessageSetTo(CodedOutputStream codedOutputStream) {
        for (Entry entry : this.fields.entrySet()) {
            ((Field) entry.getValue()).writeAsMessageSetExtensionTo(((Integer) entry.getKey()).intValue(), codedOutputStream);
        }
    }

    public final int getSerializedSizeAsMessageSet() {
        int i = 0;
        for (Entry entry : this.fields.entrySet()) {
            i = ((Field) entry.getValue()).getSerializedSizeAsMessageSetExtension(((Integer) entry.getKey()).intValue()) + i;
        }
        return i;
    }

    public final boolean isInitialized() {
        return true;
    }

    public static UnknownFieldSet parseFrom(CodedInputStream codedInputStream) {
        return newBuilder().mergeFrom(codedInputStream).build();
    }

    public static UnknownFieldSet parseFrom(ByteString byteString) {
        return newBuilder().mergeFrom(byteString).build();
    }

    public static UnknownFieldSet parseFrom(byte[] bArr) {
        return newBuilder().mergeFrom(bArr).build();
    }

    public static UnknownFieldSet parseFrom(InputStream inputStream) {
        return newBuilder().mergeFrom(inputStream).build();
    }

    public final Builder newBuilderForType() {
        return newBuilder();
    }

    public final Builder toBuilder() {
        return newBuilder().mergeFrom(this);
    }

    public final Parser getParserForType() {
        return PARSER;
    }
}
