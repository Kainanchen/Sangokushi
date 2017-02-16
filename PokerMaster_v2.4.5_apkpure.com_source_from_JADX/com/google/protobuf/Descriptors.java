package com.google.protobuf;

import android.support.v4.internal.view.SupportMenu;
import com.google.protobuf.DescriptorProtos.DescriptorProto;
import com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange;
import com.google.protobuf.DescriptorProtos.EnumDescriptorProto;
import com.google.protobuf.DescriptorProtos.EnumOptions;
import com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto;
import com.google.protobuf.DescriptorProtos.EnumValueOptions;
import com.google.protobuf.DescriptorProtos.FieldDescriptorProto;
import com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label;
import com.google.protobuf.DescriptorProtos.FieldOptions;
import com.google.protobuf.DescriptorProtos.FileDescriptorProto;
import com.google.protobuf.DescriptorProtos.FileOptions;
import com.google.protobuf.DescriptorProtos.MessageOptions;
import com.google.protobuf.DescriptorProtos.MethodDescriptorProto;
import com.google.protobuf.DescriptorProtos.MethodOptions;
import com.google.protobuf.DescriptorProtos.OneofDescriptorProto;
import com.google.protobuf.DescriptorProtos.ServiceDescriptorProto;
import com.google.protobuf.DescriptorProtos.ServiceOptions;
import com.google.protobuf.FieldSet.FieldDescriptorLite;
import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.MessageLite.Builder;
import com.google.protobuf.WireFormat.FieldType;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.texaspoker.moment.TexasPoker.PushMsg;
import com.texaspoker.moment.TexasPoker.QuickGameRoomPushMsg;
import com.texaspoker.moment.TexasPoker.SCGameActionRsp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import net.sqlcipher.database.SQLiteDatabase;

public final class Descriptors {
    private static final Logger logger;

    /* renamed from: com.google.protobuf.Descriptors.1 */
    static /* synthetic */ class C03031 {
        static final /* synthetic */ int[] f2795xdde82548;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type;

        static {
            f2795xdde82548 = new int[JavaType.values().length];
            try {
                f2795xdde82548[JavaType.ENUM.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f2795xdde82548[JavaType.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type = new int[Type.values().length];
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Type.INT32.ordinal()] = 1;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Type.SINT32.ordinal()] = 2;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Type.SFIXED32.ordinal()] = 3;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Type.UINT32.ordinal()] = 4;
            } catch (NoSuchFieldError e6) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Type.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError e7) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Type.INT64.ordinal()] = 6;
            } catch (NoSuchFieldError e8) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Type.SINT64.ordinal()] = 7;
            } catch (NoSuchFieldError e9) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Type.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError e10) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Type.UINT64.ordinal()] = 9;
            } catch (NoSuchFieldError e11) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Type.FIXED64.ordinal()] = 10;
            } catch (NoSuchFieldError e12) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Type.FLOAT.ordinal()] = 11;
            } catch (NoSuchFieldError e13) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Type.DOUBLE.ordinal()] = 12;
            } catch (NoSuchFieldError e14) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Type.BOOL.ordinal()] = 13;
            } catch (NoSuchFieldError e15) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Type.STRING.ordinal()] = 14;
            } catch (NoSuchFieldError e16) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Type.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError e17) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Type.ENUM.ordinal()] = 16;
            } catch (NoSuchFieldError e18) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Type.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError e19) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Type.GROUP.ordinal()] = 18;
            } catch (NoSuchFieldError e20) {
            }
        }
    }

    public static abstract class GenericDescriptor {
        public abstract FileDescriptor getFile();

        public abstract String getFullName();

        public abstract String getName();

        public abstract Message toProto();
    }

    public static final class Descriptor extends GenericDescriptor {
        private final Descriptor containingType;
        private final EnumDescriptor[] enumTypes;
        private final FieldDescriptor[] extensions;
        private final FieldDescriptor[] fields;
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private final Descriptor[] nestedTypes;
        private final OneofDescriptor[] oneofs;
        private DescriptorProto proto;

        public final int getIndex() {
            return this.index;
        }

        public final DescriptorProto toProto() {
            return this.proto;
        }

        public final String getName() {
            return this.proto.getName();
        }

        public final String getFullName() {
            return this.fullName;
        }

        public final FileDescriptor getFile() {
            return this.file;
        }

        public final Descriptor getContainingType() {
            return this.containingType;
        }

        public final MessageOptions getOptions() {
            return this.proto.getOptions();
        }

        public final List<FieldDescriptor> getFields() {
            return Collections.unmodifiableList(Arrays.asList(this.fields));
        }

        public final List<OneofDescriptor> getOneofs() {
            return Collections.unmodifiableList(Arrays.asList(this.oneofs));
        }

        public final List<FieldDescriptor> getExtensions() {
            return Collections.unmodifiableList(Arrays.asList(this.extensions));
        }

        public final List<Descriptor> getNestedTypes() {
            return Collections.unmodifiableList(Arrays.asList(this.nestedTypes));
        }

        public final List<EnumDescriptor> getEnumTypes() {
            return Collections.unmodifiableList(Arrays.asList(this.enumTypes));
        }

        public final boolean isExtensionNumber(int i) {
            for (ExtensionRange extensionRange : this.proto.getExtensionRangeList()) {
                if (extensionRange.getStart() <= i && i < extensionRange.getEnd()) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isExtendable() {
            return this.proto.getExtensionRangeList().size() != 0;
        }

        public final FieldDescriptor findFieldByName(String str) {
            GenericDescriptor findSymbol = this.file.pool.findSymbol(this.fullName + '.' + str);
            if (findSymbol == null || !(findSymbol instanceof FieldDescriptor)) {
                return null;
            }
            return (FieldDescriptor) findSymbol;
        }

        public final FieldDescriptor findFieldByNumber(int i) {
            return (FieldDescriptor) this.file.pool.fieldsByNumber.get(new DescriptorIntPair(this, i));
        }

        public final Descriptor findNestedTypeByName(String str) {
            GenericDescriptor findSymbol = this.file.pool.findSymbol(this.fullName + '.' + str);
            if (findSymbol == null || !(findSymbol instanceof Descriptor)) {
                return null;
            }
            return (Descriptor) findSymbol;
        }

        public final EnumDescriptor findEnumTypeByName(String str) {
            GenericDescriptor findSymbol = this.file.pool.findSymbol(this.fullName + '.' + str);
            if (findSymbol == null || !(findSymbol instanceof EnumDescriptor)) {
                return null;
            }
            return (EnumDescriptor) findSymbol;
        }

        Descriptor(String str) {
            String substring;
            String str2 = LetterIndexBar.SEARCH_ICON_LETTER;
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf != -1) {
                substring = str.substring(lastIndexOf + 1);
                str2 = str.substring(0, lastIndexOf);
            } else {
                substring = str;
            }
            this.index = 0;
            this.proto = DescriptorProto.newBuilder().setName(substring).addExtensionRange(ExtensionRange.newBuilder().setStart(1).setEnd(536870912).build()).build();
            this.fullName = str;
            this.containingType = null;
            this.nestedTypes = new Descriptor[0];
            this.enumTypes = new EnumDescriptor[0];
            this.fields = new FieldDescriptor[0];
            this.extensions = new FieldDescriptor[0];
            this.oneofs = new OneofDescriptor[0];
            this.file = new FileDescriptor(str2, this);
        }

        private Descriptor(DescriptorProto descriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i) {
            int i2;
            int i3;
            this.index = i;
            this.proto = descriptorProto;
            this.fullName = Descriptors.computeFullName(fileDescriptor, descriptor, descriptorProto.getName());
            this.file = fileDescriptor;
            this.containingType = descriptor;
            this.oneofs = new OneofDescriptor[descriptorProto.getOneofDeclCount()];
            for (i2 = 0; i2 < descriptorProto.getOneofDeclCount(); i2++) {
                this.oneofs[i2] = new OneofDescriptor(fileDescriptor, this, i2, null);
            }
            this.nestedTypes = new Descriptor[descriptorProto.getNestedTypeCount()];
            for (i3 = 0; i3 < descriptorProto.getNestedTypeCount(); i3++) {
                this.nestedTypes[i3] = new Descriptor(descriptorProto.getNestedType(i3), fileDescriptor, this, i3);
            }
            this.enumTypes = new EnumDescriptor[descriptorProto.getEnumTypeCount()];
            for (i2 = 0; i2 < descriptorProto.getEnumTypeCount(); i2++) {
                this.enumTypes[i2] = new EnumDescriptor(fileDescriptor, this, i2, null);
            }
            this.fields = new FieldDescriptor[descriptorProto.getFieldCount()];
            for (i2 = 0; i2 < descriptorProto.getFieldCount(); i2++) {
                this.fields[i2] = new FieldDescriptor(fileDescriptor, this, i2, false, null);
            }
            this.extensions = new FieldDescriptor[descriptorProto.getExtensionCount()];
            for (i2 = 0; i2 < descriptorProto.getExtensionCount(); i2++) {
                this.extensions[i2] = new FieldDescriptor(fileDescriptor, this, i2, true, null);
            }
            for (i3 = 0; i3 < descriptorProto.getOneofDeclCount(); i3++) {
                this.oneofs[i3].fields = new FieldDescriptor[this.oneofs[i3].getFieldCount()];
                this.oneofs[i3].fieldCount = 0;
            }
            for (i3 = 0; i3 < descriptorProto.getFieldCount(); i3++) {
                OneofDescriptor containingOneof = this.fields[i3].getContainingOneof();
                if (containingOneof != null) {
                    containingOneof.fields[containingOneof.fieldCount = containingOneof.fieldCount + 1] = this.fields[i3];
                }
            }
            fileDescriptor.pool.addSymbol(this);
        }

        private void crossLink() {
            int i = 0;
            for (Descriptor crossLink : this.nestedTypes) {
                crossLink.crossLink();
            }
            for (FieldDescriptor access$800 : this.fields) {
                access$800.crossLink();
            }
            FieldDescriptor[] fieldDescriptorArr = this.extensions;
            int length = fieldDescriptorArr.length;
            while (i < length) {
                fieldDescriptorArr[i].crossLink();
                i++;
            }
        }

        private void setProto(DescriptorProto descriptorProto) {
            int i;
            int i2 = 0;
            this.proto = descriptorProto;
            for (i = 0; i < this.nestedTypes.length; i++) {
                this.nestedTypes[i].setProto(descriptorProto.getNestedType(i));
            }
            for (i = 0; i < this.enumTypes.length; i++) {
                this.enumTypes[i].setProto(descriptorProto.getEnumType(i));
            }
            for (i = 0; i < this.fields.length; i++) {
                this.fields[i].setProto(descriptorProto.getField(i));
            }
            while (i2 < this.extensions.length) {
                this.extensions[i2].setProto(descriptorProto.getExtension(i2));
                i2++;
            }
        }
    }

    private static final class DescriptorPool {
        static final /* synthetic */ boolean $assertionsDisabled;
        private boolean allowUnknownDependencies;
        private final Set<FileDescriptor> dependencies;
        private final Map<String, GenericDescriptor> descriptorsByName;
        private final Map<DescriptorIntPair, EnumValueDescriptor> enumValuesByNumber;
        private final Map<DescriptorIntPair, FieldDescriptor> fieldsByNumber;

        private static final class DescriptorIntPair {
            private final GenericDescriptor descriptor;
            private final int number;

            DescriptorIntPair(GenericDescriptor genericDescriptor, int i) {
                this.descriptor = genericDescriptor;
                this.number = i;
            }

            public final int hashCode() {
                return (this.descriptor.hashCode() * SupportMenu.USER_MASK) + this.number;
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof DescriptorIntPair)) {
                    return false;
                }
                DescriptorIntPair descriptorIntPair = (DescriptorIntPair) obj;
                if (this.descriptor == descriptorIntPair.descriptor && this.number == descriptorIntPair.number) {
                    return true;
                }
                return false;
            }
        }

        private static final class PackageDescriptor extends GenericDescriptor {
            private final FileDescriptor file;
            private final String fullName;
            private final String name;

            public final Message toProto() {
                return this.file.toProto();
            }

            public final String getName() {
                return this.name;
            }

            public final String getFullName() {
                return this.fullName;
            }

            public final FileDescriptor getFile() {
                return this.file;
            }

            PackageDescriptor(String str, String str2, FileDescriptor fileDescriptor) {
                this.file = fileDescriptor;
                this.fullName = str2;
                this.name = str;
            }
        }

        enum SearchFilter {
            TYPES_ONLY,
            AGGREGATES_ONLY,
            ALL_SYMBOLS
        }

        static {
            $assertionsDisabled = !Descriptors.class.desiredAssertionStatus();
        }

        DescriptorPool(FileDescriptor[] fileDescriptorArr, boolean z) {
            this.descriptorsByName = new HashMap();
            this.fieldsByNumber = new HashMap();
            this.enumValuesByNumber = new HashMap();
            this.dependencies = new HashSet();
            this.allowUnknownDependencies = z;
            for (int i = 0; i < fileDescriptorArr.length; i++) {
                this.dependencies.add(fileDescriptorArr[i]);
                importPublicDependencies(fileDescriptorArr[i]);
            }
            for (FileDescriptor fileDescriptor : this.dependencies) {
                try {
                    addPackage(fileDescriptor.getPackage(), fileDescriptor);
                } catch (DescriptorValidationException e) {
                    if (!$assertionsDisabled) {
                        throw new AssertionError();
                    }
                }
            }
        }

        private void importPublicDependencies(FileDescriptor fileDescriptor) {
            for (FileDescriptor fileDescriptor2 : fileDescriptor.getPublicDependencies()) {
                if (this.dependencies.add(fileDescriptor2)) {
                    importPublicDependencies(fileDescriptor2);
                }
            }
        }

        final GenericDescriptor findSymbol(String str) {
            return findSymbol(str, SearchFilter.ALL_SYMBOLS);
        }

        final GenericDescriptor findSymbol(String str, SearchFilter searchFilter) {
            GenericDescriptor genericDescriptor = (GenericDescriptor) this.descriptorsByName.get(str);
            if (genericDescriptor != null) {
                if (searchFilter == SearchFilter.ALL_SYMBOLS) {
                    return genericDescriptor;
                }
                if (searchFilter == SearchFilter.TYPES_ONLY && isType(genericDescriptor)) {
                    return genericDescriptor;
                }
                if (searchFilter == SearchFilter.AGGREGATES_ONLY && isAggregate(genericDescriptor)) {
                    return genericDescriptor;
                }
            }
            for (FileDescriptor access$1300 : this.dependencies) {
                genericDescriptor = (GenericDescriptor) access$1300.pool.descriptorsByName.get(str);
                if (genericDescriptor != null) {
                    if (searchFilter == SearchFilter.ALL_SYMBOLS) {
                        return genericDescriptor;
                    }
                    if (searchFilter == SearchFilter.TYPES_ONLY && isType(genericDescriptor)) {
                        return genericDescriptor;
                    }
                    if (searchFilter == SearchFilter.AGGREGATES_ONLY && isAggregate(genericDescriptor)) {
                        return genericDescriptor;
                    }
                }
            }
            return null;
        }

        final boolean isType(GenericDescriptor genericDescriptor) {
            return (genericDescriptor instanceof Descriptor) || (genericDescriptor instanceof EnumDescriptor);
        }

        final boolean isAggregate(GenericDescriptor genericDescriptor) {
            return (genericDescriptor instanceof Descriptor) || (genericDescriptor instanceof EnumDescriptor) || (genericDescriptor instanceof PackageDescriptor) || (genericDescriptor instanceof ServiceDescriptor);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        final com.google.protobuf.Descriptors.GenericDescriptor lookupSymbol(java.lang.String r9, com.google.protobuf.Descriptors.GenericDescriptor r10, com.google.protobuf.Descriptors.DescriptorPool.SearchFilter r11) {
            /*
            r8 = this;
            r6 = -1;
            r0 = ".";
            r0 = r9.startsWith(r0);
            if (r0 == 0) goto L_0x004a;
        L_0x0009:
            r0 = 1;
            r0 = r9.substring(r0);
            r1 = r8.findSymbol(r0, r11);
            r7 = r0;
            r0 = r1;
            r1 = r7;
        L_0x0015:
            if (r0 != 0) goto L_0x0049;
        L_0x0017:
            r0 = r8.allowUnknownDependencies;
            if (r0 == 0) goto L_0x00a0;
        L_0x001b:
            r0 = com.google.protobuf.Descriptors.DescriptorPool.SearchFilter.TYPES_ONLY;
            if (r11 != r0) goto L_0x00a0;
        L_0x001f:
            r0 = com.google.protobuf.Descriptors.logger;
            r2 = new java.lang.StringBuilder;
            r3 = "The descriptor for message type \"";
            r2.<init>(r3);
            r2 = r2.append(r9);
            r3 = "\" can not be found and a placeholder is created for it";
            r2 = r2.append(r3);
            r2 = r2.toString();
            r0.warning(r2);
            r0 = new com.google.protobuf.Descriptors$Descriptor;
            r0.<init>(r1);
            r1 = r8.dependencies;
            r2 = r0.getFile();
            r1.add(r2);
        L_0x0049:
            return r0;
        L_0x004a:
            r0 = 46;
            r2 = r9.indexOf(r0);
            if (r2 != r6) goto L_0x006a;
        L_0x0052:
            r0 = r9;
        L_0x0053:
            r3 = new java.lang.StringBuilder;
            r1 = r10.getFullName();
            r3.<init>(r1);
        L_0x005c:
            r1 = ".";
            r4 = r3.lastIndexOf(r1);
            if (r4 != r6) goto L_0x0070;
        L_0x0064:
            r0 = r8.findSymbol(r9, r11);
            r1 = r9;
            goto L_0x0015;
        L_0x006a:
            r0 = 0;
            r0 = r9.substring(r0, r2);
            goto L_0x0053;
        L_0x0070:
            r1 = r4 + 1;
            r3.setLength(r1);
            r3.append(r0);
            r1 = r3.toString();
            r5 = com.google.protobuf.Descriptors.DescriptorPool.SearchFilter.AGGREGATES_ONLY;
            r1 = r8.findSymbol(r1, r5);
            if (r1 == 0) goto L_0x009c;
        L_0x0084:
            if (r2 == r6) goto L_0x00bc;
        L_0x0086:
            r0 = r4 + 1;
            r3.setLength(r0);
            r3.append(r9);
            r0 = r3.toString();
            r0 = r8.findSymbol(r0, r11);
        L_0x0096:
            r1 = r3.toString();
            goto L_0x0015;
        L_0x009c:
            r3.setLength(r4);
            goto L_0x005c;
        L_0x00a0:
            r0 = new com.google.protobuf.Descriptors$DescriptorValidationException;
            r1 = new java.lang.StringBuilder;
            r2 = "\"";
            r1.<init>(r2);
            r1 = r1.append(r9);
            r2 = "\" is not defined.";
            r1 = r1.append(r2);
            r1 = r1.toString();
            r2 = 0;
            r0.<init>(r1, r2);
            throw r0;
        L_0x00bc:
            r0 = r1;
            goto L_0x0096;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Descriptors.DescriptorPool.lookupSymbol(java.lang.String, com.google.protobuf.Descriptors$GenericDescriptor, com.google.protobuf.Descriptors$DescriptorPool$SearchFilter):com.google.protobuf.Descriptors$GenericDescriptor");
        }

        final void addSymbol(GenericDescriptor genericDescriptor) {
            validateSymbolName(genericDescriptor);
            String fullName = genericDescriptor.getFullName();
            int lastIndexOf = fullName.lastIndexOf(46);
            GenericDescriptor genericDescriptor2 = (GenericDescriptor) this.descriptorsByName.put(fullName, genericDescriptor);
            if (genericDescriptor2 != null) {
                this.descriptorsByName.put(fullName, genericDescriptor2);
                if (genericDescriptor.getFile() != genericDescriptor2.getFile()) {
                    throw new DescriptorValidationException("\"" + fullName + "\" is already defined in file \"" + genericDescriptor2.getFile().getName() + "\".", null);
                } else if (lastIndexOf == -1) {
                    throw new DescriptorValidationException("\"" + fullName + "\" is already defined.", null);
                } else {
                    throw new DescriptorValidationException("\"" + fullName.substring(lastIndexOf + 1) + "\" is already defined in \"" + fullName.substring(0, lastIndexOf) + "\".", null);
                }
            }
        }

        final void addPackage(String str, FileDescriptor fileDescriptor) {
            String str2;
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf == -1) {
                str2 = str;
            } else {
                addPackage(str.substring(0, lastIndexOf), fileDescriptor);
                str2 = str.substring(lastIndexOf + 1);
            }
            GenericDescriptor genericDescriptor = (GenericDescriptor) this.descriptorsByName.put(str, new PackageDescriptor(str2, str, fileDescriptor));
            if (genericDescriptor != null) {
                this.descriptorsByName.put(str, genericDescriptor);
                if (!(genericDescriptor instanceof PackageDescriptor)) {
                    throw new DescriptorValidationException("\"" + str2 + "\" is already defined (as something other than a package) in file \"" + genericDescriptor.getFile().getName() + "\".", null);
                }
            }
        }

        final void addFieldByNumber(FieldDescriptor fieldDescriptor) {
            DescriptorIntPair descriptorIntPair = new DescriptorIntPair(fieldDescriptor.getContainingType(), fieldDescriptor.getNumber());
            FieldDescriptor fieldDescriptor2 = (FieldDescriptor) this.fieldsByNumber.put(descriptorIntPair, fieldDescriptor);
            if (fieldDescriptor2 != null) {
                this.fieldsByNumber.put(descriptorIntPair, fieldDescriptor2);
                throw new DescriptorValidationException("Field number " + fieldDescriptor.getNumber() + " has already been used in \"" + fieldDescriptor.getContainingType().getFullName() + "\" by field \"" + fieldDescriptor2.getName() + "\".", null);
            }
        }

        final void addEnumValueByNumber(EnumValueDescriptor enumValueDescriptor) {
            DescriptorIntPair descriptorIntPair = new DescriptorIntPair(enumValueDescriptor.getType(), enumValueDescriptor.getNumber());
            EnumValueDescriptor enumValueDescriptor2 = (EnumValueDescriptor) this.enumValuesByNumber.put(descriptorIntPair, enumValueDescriptor);
            if (enumValueDescriptor2 != null) {
                this.enumValuesByNumber.put(descriptorIntPair, enumValueDescriptor2);
            }
        }

        static void validateSymbolName(GenericDescriptor genericDescriptor) {
            String name = genericDescriptor.getName();
            if (name.length() == 0) {
                throw new DescriptorValidationException("Missing name.", null);
            }
            Object obj = 1;
            int i = 0;
            while (i < name.length()) {
                char charAt = name.charAt(i);
                if (charAt >= '\u0080') {
                    obj = null;
                }
                if (!(Character.isLetter(charAt) || charAt == '_' || (Character.isDigit(charAt) && i > 0))) {
                    obj = null;
                }
                i++;
            }
            if (obj == null) {
                throw new DescriptorValidationException("\"" + name + "\" is not a valid identifier.", null);
            }
        }
    }

    public static class DescriptorValidationException extends Exception {
        private static final long serialVersionUID = 5750205775490483148L;
        private final String description;
        private final String name;
        private final Message proto;

        public String getProblemSymbolName() {
            return this.name;
        }

        public Message getProblemProto() {
            return this.proto;
        }

        public String getDescription() {
            return this.description;
        }

        private DescriptorValidationException(GenericDescriptor genericDescriptor, String str) {
            super(genericDescriptor.getFullName() + ": " + str);
            this.name = genericDescriptor.getFullName();
            this.proto = genericDescriptor.toProto();
            this.description = str;
        }

        private DescriptorValidationException(GenericDescriptor genericDescriptor, String str, Throwable th) {
            this(genericDescriptor, str);
            initCause(th);
        }

        private DescriptorValidationException(FileDescriptor fileDescriptor, String str) {
            super(fileDescriptor.getName() + ": " + str);
            this.name = fileDescriptor.getName();
            this.proto = fileDescriptor.toProto();
            this.description = str;
        }
    }

    public static final class EnumDescriptor extends GenericDescriptor implements EnumLiteMap<EnumValueDescriptor> {
        private final Descriptor containingType;
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private EnumDescriptorProto proto;
        private EnumValueDescriptor[] values;

        public final int getIndex() {
            return this.index;
        }

        public final EnumDescriptorProto toProto() {
            return this.proto;
        }

        public final String getName() {
            return this.proto.getName();
        }

        public final String getFullName() {
            return this.fullName;
        }

        public final FileDescriptor getFile() {
            return this.file;
        }

        public final Descriptor getContainingType() {
            return this.containingType;
        }

        public final EnumOptions getOptions() {
            return this.proto.getOptions();
        }

        public final List<EnumValueDescriptor> getValues() {
            return Collections.unmodifiableList(Arrays.asList(this.values));
        }

        public final EnumValueDescriptor findValueByName(String str) {
            GenericDescriptor findSymbol = this.file.pool.findSymbol(this.fullName + '.' + str);
            if (findSymbol == null || !(findSymbol instanceof EnumValueDescriptor)) {
                return null;
            }
            return (EnumValueDescriptor) findSymbol;
        }

        public final EnumValueDescriptor findValueByNumber(int i) {
            return (EnumValueDescriptor) this.file.pool.enumValuesByNumber.get(new DescriptorIntPair(this, i));
        }

        private EnumDescriptor(EnumDescriptorProto enumDescriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i) {
            this.index = i;
            this.proto = enumDescriptorProto;
            this.fullName = Descriptors.computeFullName(fileDescriptor, descriptor, enumDescriptorProto.getName());
            this.file = fileDescriptor;
            this.containingType = descriptor;
            if (enumDescriptorProto.getValueCount() == 0) {
                throw new DescriptorValidationException("Enums must contain at least one value.", null);
            }
            this.values = new EnumValueDescriptor[enumDescriptorProto.getValueCount()];
            for (int i2 = 0; i2 < enumDescriptorProto.getValueCount(); i2++) {
                this.values[i2] = new EnumValueDescriptor(fileDescriptor, this, i2, null);
            }
            fileDescriptor.pool.addSymbol(this);
        }

        private void setProto(EnumDescriptorProto enumDescriptorProto) {
            this.proto = enumDescriptorProto;
            for (int i = 0; i < this.values.length; i++) {
                this.values[i].setProto(enumDescriptorProto.getValue(i));
            }
        }
    }

    public static final class EnumValueDescriptor extends GenericDescriptor implements EnumLite {
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private EnumValueDescriptorProto proto;
        private final EnumDescriptor type;

        public final int getIndex() {
            return this.index;
        }

        public final EnumValueDescriptorProto toProto() {
            return this.proto;
        }

        public final String getName() {
            return this.proto.getName();
        }

        public final int getNumber() {
            return this.proto.getNumber();
        }

        public final String toString() {
            return this.proto.getName();
        }

        public final String getFullName() {
            return this.fullName;
        }

        public final FileDescriptor getFile() {
            return this.file;
        }

        public final EnumDescriptor getType() {
            return this.type;
        }

        public final EnumValueOptions getOptions() {
            return this.proto.getOptions();
        }

        private EnumValueDescriptor(EnumValueDescriptorProto enumValueDescriptorProto, FileDescriptor fileDescriptor, EnumDescriptor enumDescriptor, int i) {
            this.index = i;
            this.proto = enumValueDescriptorProto;
            this.file = fileDescriptor;
            this.type = enumDescriptor;
            this.fullName = enumDescriptor.getFullName() + '.' + enumValueDescriptorProto.getName();
            fileDescriptor.pool.addSymbol(this);
            fileDescriptor.pool.addEnumValueByNumber(this);
        }

        private void setProto(EnumValueDescriptorProto enumValueDescriptorProto) {
            this.proto = enumValueDescriptorProto;
        }
    }

    public static final class FieldDescriptor extends GenericDescriptor implements FieldDescriptorLite<FieldDescriptor>, Comparable<FieldDescriptor> {
        private static final FieldType[] table;
        private OneofDescriptor containingOneof;
        private Descriptor containingType;
        private Object defaultValue;
        private EnumDescriptor enumType;
        private final Descriptor extensionScope;
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private Descriptor messageType;
        private FieldDescriptorProto proto;
        private Type type;

        public enum JavaType {
            INT(Integer.valueOf(0)),
            LONG(Long.valueOf(0)),
            FLOAT(Float.valueOf(0.0f)),
            DOUBLE(Double.valueOf(0.0d)),
            BOOLEAN(Boolean.valueOf(false)),
            STRING(LetterIndexBar.SEARCH_ICON_LETTER),
            BYTE_STRING(ByteString.EMPTY),
            ENUM(null),
            MESSAGE(null);
            
            private final Object defaultDefault;

            private JavaType(Object obj) {
                this.defaultDefault = obj;
            }
        }

        public enum Type {
            DOUBLE(JavaType.DOUBLE),
            FLOAT(JavaType.FLOAT),
            INT64(JavaType.LONG),
            UINT64(JavaType.LONG),
            INT32(JavaType.INT),
            FIXED64(JavaType.LONG),
            FIXED32(JavaType.INT),
            BOOL(JavaType.BOOLEAN),
            STRING(JavaType.STRING),
            GROUP(JavaType.MESSAGE),
            MESSAGE(JavaType.MESSAGE),
            BYTES(JavaType.BYTE_STRING),
            UINT32(JavaType.INT),
            ENUM(JavaType.ENUM),
            SFIXED32(JavaType.INT),
            SFIXED64(JavaType.LONG),
            SINT32(JavaType.INT),
            SINT64(JavaType.LONG);
            
            private JavaType javaType;

            private Type(JavaType javaType) {
                this.javaType = javaType;
            }

            public final com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type toProto() {
                return com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.valueOf(ordinal() + 1);
            }

            public final JavaType getJavaType() {
                return this.javaType;
            }

            public static Type valueOf(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type type) {
                return values()[type.getNumber() - 1];
            }
        }

        public final int getIndex() {
            return this.index;
        }

        public final FieldDescriptorProto toProto() {
            return this.proto;
        }

        public final String getName() {
            return this.proto.getName();
        }

        public final int getNumber() {
            return this.proto.getNumber();
        }

        public final String getFullName() {
            return this.fullName;
        }

        public final JavaType getJavaType() {
            return this.type.getJavaType();
        }

        public final com.google.protobuf.WireFormat.JavaType getLiteJavaType() {
            return getLiteType().getJavaType();
        }

        public final FileDescriptor getFile() {
            return this.file;
        }

        public final Type getType() {
            return this.type;
        }

        public final FieldType getLiteType() {
            return table[this.type.ordinal()];
        }

        public final boolean needsUtf8Check() {
            return this.type == Type.STRING && getFile().getOptions().getJavaStringCheckUtf8();
        }

        static {
            table = FieldType.values();
            if (Type.values().length != com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.values().length) {
                throw new RuntimeException("descriptor.proto has a new declared type but Desrciptors.java wasn't updated.");
            }
        }

        public final boolean isRequired() {
            return this.proto.getLabel() == Label.LABEL_REQUIRED;
        }

        public final boolean isOptional() {
            return this.proto.getLabel() == Label.LABEL_OPTIONAL;
        }

        public final boolean isRepeated() {
            return this.proto.getLabel() == Label.LABEL_REPEATED;
        }

        public final boolean isPacked() {
            return getOptions().getPacked();
        }

        public final boolean isPackable() {
            return isRepeated() && getLiteType().isPackable();
        }

        public final boolean hasDefaultValue() {
            return this.proto.hasDefaultValue();
        }

        public final Object getDefaultValue() {
            if (getJavaType() != JavaType.MESSAGE) {
                return this.defaultValue;
            }
            throw new UnsupportedOperationException("FieldDescriptor.getDefaultValue() called on an embedded message field.");
        }

        public final FieldOptions getOptions() {
            return this.proto.getOptions();
        }

        public final boolean isExtension() {
            return this.proto.hasExtendee();
        }

        public final Descriptor getContainingType() {
            return this.containingType;
        }

        public final OneofDescriptor getContainingOneof() {
            return this.containingOneof;
        }

        public final Descriptor getExtensionScope() {
            if (isExtension()) {
                return this.extensionScope;
            }
            throw new UnsupportedOperationException("This field is not an extension.");
        }

        public final Descriptor getMessageType() {
            if (getJavaType() == JavaType.MESSAGE) {
                return this.messageType;
            }
            throw new UnsupportedOperationException("This field is not of message type.");
        }

        public final EnumDescriptor getEnumType() {
            if (getJavaType() == JavaType.ENUM) {
                return this.enumType;
            }
            throw new UnsupportedOperationException("This field is not of enum type.");
        }

        public final int compareTo(FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.containingType == this.containingType) {
                return getNumber() - fieldDescriptor.getNumber();
            }
            throw new IllegalArgumentException("FieldDescriptors can only be compared to other FieldDescriptors for fields of the same message type.");
        }

        private FieldDescriptor(FieldDescriptorProto fieldDescriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i, boolean z) {
            this.index = i;
            this.proto = fieldDescriptorProto;
            this.fullName = Descriptors.computeFullName(fileDescriptor, descriptor, fieldDescriptorProto.getName());
            this.file = fileDescriptor;
            if (fieldDescriptorProto.hasType()) {
                this.type = Type.valueOf(fieldDescriptorProto.getType());
            }
            if (getNumber() <= 0) {
                throw new DescriptorValidationException("Field numbers must be positive integers.", null);
            }
            if (z) {
                if (fieldDescriptorProto.hasExtendee()) {
                    this.containingType = null;
                    if (descriptor != null) {
                        this.extensionScope = descriptor;
                    } else {
                        this.extensionScope = null;
                    }
                    if (fieldDescriptorProto.hasOneofIndex()) {
                        throw new DescriptorValidationException("FieldDescriptorProto.oneof_index set for extension field.", null);
                    }
                    this.containingOneof = null;
                } else {
                    throw new DescriptorValidationException("FieldDescriptorProto.extendee not set for extension field.", null);
                }
            } else if (fieldDescriptorProto.hasExtendee()) {
                throw new DescriptorValidationException("FieldDescriptorProto.extendee set for non-extension field.", null);
            } else {
                this.containingType = descriptor;
                if (!fieldDescriptorProto.hasOneofIndex()) {
                    this.containingOneof = null;
                } else if (fieldDescriptorProto.getOneofIndex() < 0 || fieldDescriptorProto.getOneofIndex() >= descriptor.toProto().getOneofDeclCount()) {
                    throw new DescriptorValidationException("FieldDescriptorProto.oneof_index is out of range for type " + descriptor.getName(), null);
                } else {
                    this.containingOneof = (OneofDescriptor) descriptor.getOneofs().get(fieldDescriptorProto.getOneofIndex());
                    containingOneof.fieldCount = this.containingOneof.fieldCount + 1;
                }
                this.extensionScope = null;
            }
            fileDescriptor.pool.addSymbol(this);
        }

        private void crossLink() {
            GenericDescriptor lookupSymbol;
            if (this.proto.hasExtendee()) {
                lookupSymbol = this.file.pool.lookupSymbol(this.proto.getExtendee(), this, SearchFilter.TYPES_ONLY);
                if (lookupSymbol instanceof Descriptor) {
                    this.containingType = (Descriptor) lookupSymbol;
                    if (!getContainingType().isExtensionNumber(getNumber())) {
                        throw new DescriptorValidationException("\"" + getContainingType().getFullName() + "\" does not declare " + getNumber() + " as an extension number.", null);
                    }
                }
                throw new DescriptorValidationException("\"" + this.proto.getExtendee() + "\" is not a message type.", null);
            }
            if (this.proto.hasTypeName()) {
                lookupSymbol = this.file.pool.lookupSymbol(this.proto.getTypeName(), this, SearchFilter.TYPES_ONLY);
                if (!this.proto.hasType()) {
                    if (lookupSymbol instanceof Descriptor) {
                        this.type = Type.MESSAGE;
                    } else if (lookupSymbol instanceof EnumDescriptor) {
                        this.type = Type.ENUM;
                    } else {
                        throw new DescriptorValidationException("\"" + this.proto.getTypeName() + "\" is not a type.", null);
                    }
                }
                if (getJavaType() == JavaType.MESSAGE) {
                    if (lookupSymbol instanceof Descriptor) {
                        this.messageType = (Descriptor) lookupSymbol;
                        if (this.proto.hasDefaultValue()) {
                            throw new DescriptorValidationException("Messages can't have default values.", null);
                        }
                    }
                    throw new DescriptorValidationException("\"" + this.proto.getTypeName() + "\" is not a message type.", null);
                } else if (getJavaType() != JavaType.ENUM) {
                    throw new DescriptorValidationException("Field with primitive type has type_name.", null);
                } else if (lookupSymbol instanceof EnumDescriptor) {
                    this.enumType = (EnumDescriptor) lookupSymbol;
                } else {
                    throw new DescriptorValidationException("\"" + this.proto.getTypeName() + "\" is not an enum type.", null);
                }
            } else if (getJavaType() == JavaType.MESSAGE || getJavaType() == JavaType.ENUM) {
                throw new DescriptorValidationException("Field with message or enum type missing type_name.", null);
            }
            if (!this.proto.getOptions().getPacked() || isPackable()) {
                if (!this.proto.hasDefaultValue()) {
                    if (!isRepeated()) {
                        switch (C03031.f2795xdde82548[getJavaType().ordinal()]) {
                            case SQLiteDatabase.OPEN_READONLY /*1*/:
                                this.defaultValue = this.enumType.getValues().get(0);
                                break;
                            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                                this.defaultValue = null;
                                break;
                            default:
                                this.defaultValue = getJavaType().defaultDefault;
                                break;
                        }
                    }
                    this.defaultValue = Collections.emptyList();
                } else if (isRepeated()) {
                    throw new DescriptorValidationException("Repeated fields cannot have default values.", null);
                } else {
                    try {
                        switch (C03031.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[getType().ordinal()]) {
                            case SQLiteDatabase.OPEN_READONLY /*1*/:
                            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                            case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                                this.defaultValue = Integer.valueOf(TextFormat.parseInt32(this.proto.getDefaultValue()));
                                break;
                            case SQLiteDatabase.CONFLICT_IGNORE /*4*/:
                            case SQLiteDatabase.CONFLICT_REPLACE /*5*/:
                                this.defaultValue = Integer.valueOf(TextFormat.parseUInt32(this.proto.getDefaultValue()));
                                break;
                            case SCGameActionRsp.LBETTINGID_FIELD_NUMBER /*6*/:
                            case QuickGameRoomPushMsg.STFROMUSER_FIELD_NUMBER /*7*/:
                            case QuickGameRoomPushMsg.VUSERS_FIELD_NUMBER /*8*/:
                                this.defaultValue = Long.valueOf(TextFormat.parseInt64(this.proto.getDefaultValue()));
                                break;
                            case PushMsg.STCLUBASEBINFO_FIELD_NUMBER /*9*/:
                            case PushMsg.SMSG_FIELD_NUMBER /*10*/:
                                this.defaultValue = Long.valueOf(TextFormat.parseUInt64(this.proto.getDefaultValue()));
                                break;
                            case PushMsg.VVOICEDATAS_FIELD_NUMBER /*11*/:
                                if (!this.proto.getDefaultValue().equals("inf")) {
                                    if (!this.proto.getDefaultValue().equals("-inf")) {
                                        if (!this.proto.getDefaultValue().equals("nan")) {
                                            this.defaultValue = Float.valueOf(this.proto.getDefaultValue());
                                            break;
                                        } else {
                                            this.defaultValue = Float.valueOf(Float.NaN);
                                            break;
                                        }
                                    }
                                    this.defaultValue = Float.valueOf(Float.NEGATIVE_INFINITY);
                                    break;
                                }
                                this.defaultValue = Float.valueOf(Float.POSITIVE_INFINITY);
                                break;
                            case PushMsg.STSHAREBILLINFO_FIELD_NUMBER /*12*/:
                                if (!this.proto.getDefaultValue().equals("inf")) {
                                    if (!this.proto.getDefaultValue().equals("-inf")) {
                                        if (!this.proto.getDefaultValue().equals("nan")) {
                                            this.defaultValue = Double.valueOf(this.proto.getDefaultValue());
                                            break;
                                        } else {
                                            this.defaultValue = Double.valueOf(Double.NaN);
                                            break;
                                        }
                                    }
                                    this.defaultValue = Double.valueOf(Double.NEGATIVE_INFINITY);
                                    break;
                                }
                                this.defaultValue = Double.valueOf(Double.POSITIVE_INFINITY);
                                break;
                            case PushMsg.STPOKERPROCESSBASEINFO_FIELD_NUMBER /*13*/:
                                this.defaultValue = Boolean.valueOf(this.proto.getDefaultValue());
                                break;
                            case PushMsg.STRPICURL_FIELD_NUMBER /*14*/:
                                this.defaultValue = this.proto.getDefaultValue();
                                break;
                            case PushMsg.LCREATETIME_FIELD_NUMBER /*15*/:
                                this.defaultValue = TextFormat.unescapeBytes(this.proto.getDefaultValue());
                                break;
                            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                                this.defaultValue = this.enumType.findValueByName(this.proto.getDefaultValue());
                                if (this.defaultValue == null) {
                                    throw new DescriptorValidationException("Unknown enum default value: \"" + this.proto.getDefaultValue() + '\"', null);
                                }
                                break;
                            case PushMsg.IMUTE_FIELD_NUMBER /*17*/:
                            case PushMsg.IVIBRATE_FIELD_NUMBER /*18*/:
                                throw new DescriptorValidationException("Message type had default value.", null);
                        }
                    } catch (Throwable e) {
                        throw new DescriptorValidationException("Couldn't parse default value: " + e.getMessage(), e, null);
                    } catch (Throwable e2) {
                        throw new DescriptorValidationException("Could not parse default value: \"" + this.proto.getDefaultValue() + '\"', e2, null);
                    }
                }
                if (!isExtension()) {
                    this.file.pool.addFieldByNumber(this);
                }
                if (this.containingType != null && this.containingType.getOptions().getMessageSetWireFormat()) {
                    if (!isExtension()) {
                        throw new DescriptorValidationException("MessageSets cannot have fields, only extensions.", null);
                    } else if (!isOptional() || getType() != Type.MESSAGE) {
                        throw new DescriptorValidationException("Extensions of MessageSets must be optional messages.", null);
                    } else {
                        return;
                    }
                }
                return;
            }
            throw new DescriptorValidationException("[packed = true] can only be specified for repeated primitive fields.", null);
        }

        private void setProto(FieldDescriptorProto fieldDescriptorProto) {
            this.proto = fieldDescriptorProto;
        }

        public final Builder internalMergeFrom(Builder builder, MessageLite messageLite) {
            return ((Message.Builder) builder).mergeFrom((Message) messageLite);
        }
    }

    public static final class FileDescriptor extends GenericDescriptor {
        private final FileDescriptor[] dependencies;
        private final EnumDescriptor[] enumTypes;
        private final FieldDescriptor[] extensions;
        private final Descriptor[] messageTypes;
        private final DescriptorPool pool;
        private FileDescriptorProto proto;
        private final FileDescriptor[] publicDependencies;
        private final ServiceDescriptor[] services;

        public interface InternalDescriptorAssigner {
            ExtensionRegistry assignDescriptors(FileDescriptor fileDescriptor);
        }

        public final FileDescriptorProto toProto() {
            return this.proto;
        }

        public final String getName() {
            return this.proto.getName();
        }

        public final FileDescriptor getFile() {
            return this;
        }

        public final String getFullName() {
            return this.proto.getName();
        }

        public final String getPackage() {
            return this.proto.getPackage();
        }

        public final FileOptions getOptions() {
            return this.proto.getOptions();
        }

        public final List<Descriptor> getMessageTypes() {
            return Collections.unmodifiableList(Arrays.asList(this.messageTypes));
        }

        public final List<EnumDescriptor> getEnumTypes() {
            return Collections.unmodifiableList(Arrays.asList(this.enumTypes));
        }

        public final List<ServiceDescriptor> getServices() {
            return Collections.unmodifiableList(Arrays.asList(this.services));
        }

        public final List<FieldDescriptor> getExtensions() {
            return Collections.unmodifiableList(Arrays.asList(this.extensions));
        }

        public final List<FileDescriptor> getDependencies() {
            return Collections.unmodifiableList(Arrays.asList(this.dependencies));
        }

        public final List<FileDescriptor> getPublicDependencies() {
            return Collections.unmodifiableList(Arrays.asList(this.publicDependencies));
        }

        public final Descriptor findMessageTypeByName(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            if (getPackage().length() > 0) {
                str = getPackage() + '.' + str;
            }
            GenericDescriptor findSymbol = this.pool.findSymbol(str);
            return (findSymbol != null && (findSymbol instanceof Descriptor) && findSymbol.getFile() == this) ? (Descriptor) findSymbol : null;
        }

        public final EnumDescriptor findEnumTypeByName(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            if (getPackage().length() > 0) {
                str = getPackage() + '.' + str;
            }
            GenericDescriptor findSymbol = this.pool.findSymbol(str);
            return (findSymbol != null && (findSymbol instanceof EnumDescriptor) && findSymbol.getFile() == this) ? (EnumDescriptor) findSymbol : null;
        }

        public final ServiceDescriptor findServiceByName(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            if (getPackage().length() > 0) {
                str = getPackage() + '.' + str;
            }
            GenericDescriptor findSymbol = this.pool.findSymbol(str);
            return (findSymbol != null && (findSymbol instanceof ServiceDescriptor) && findSymbol.getFile() == this) ? (ServiceDescriptor) findSymbol : null;
        }

        public final FieldDescriptor findExtensionByName(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            if (getPackage().length() > 0) {
                str = getPackage() + '.' + str;
            }
            GenericDescriptor findSymbol = this.pool.findSymbol(str);
            return (findSymbol != null && (findSymbol instanceof FieldDescriptor) && findSymbol.getFile() == this) ? (FieldDescriptor) findSymbol : null;
        }

        public static FileDescriptor buildFrom(FileDescriptorProto fileDescriptorProto, FileDescriptor[] fileDescriptorArr) {
            return buildFrom(fileDescriptorProto, fileDescriptorArr, false);
        }

        private static FileDescriptor buildFrom(FileDescriptorProto fileDescriptorProto, FileDescriptor[] fileDescriptorArr, boolean z) {
            FileDescriptor fileDescriptor = new FileDescriptor(fileDescriptorProto, fileDescriptorArr, new DescriptorPool(fileDescriptorArr, z), z);
            fileDescriptor.crossLink();
            return fileDescriptor;
        }

        public static void internalBuildGeneratedFileFrom(String[] strArr, FileDescriptor[] fileDescriptorArr, InternalDescriptorAssigner internalDescriptorAssigner) {
            StringBuilder stringBuilder = new StringBuilder();
            for (String append : strArr) {
                stringBuilder.append(append);
            }
            try {
                byte[] bytes = stringBuilder.toString().getBytes("ISO-8859-1");
                try {
                    try {
                        FileDescriptor buildFrom = buildFrom(FileDescriptorProto.parseFrom(bytes), fileDescriptorArr, true);
                        ExtensionRegistryLite assignDescriptors = internalDescriptorAssigner.assignDescriptors(buildFrom);
                        if (assignDescriptors != null) {
                            try {
                                buildFrom.setProto(FileDescriptorProto.parseFrom(bytes, assignDescriptors));
                            } catch (Throwable e) {
                                throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e);
                            }
                        }
                    } catch (Throwable e2) {
                        throw new IllegalArgumentException("Invalid embedded descriptor for \"" + r1.getName() + "\".", e2);
                    }
                } catch (Throwable e22) {
                    throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e22);
                }
            } catch (Throwable e222) {
                throw new RuntimeException("Standard encoding ISO-8859-1 not supported by JVM.", e222);
            }
        }

        public static void internalBuildGeneratedFileFrom(String[] strArr, Class<?> cls, String[] strArr2, String[] strArr3, InternalDescriptorAssigner internalDescriptorAssigner) {
            List arrayList = new ArrayList();
            for (int i = 0; i < strArr2.length; i++) {
                try {
                    arrayList.add((FileDescriptor) cls.getClassLoader().loadClass(strArr2[i]).getField("descriptor").get(null));
                } catch (Exception e) {
                    Descriptors.logger.warning("Descriptors for \"" + strArr3[i] + "\" can not be found.");
                }
            }
            FileDescriptor[] fileDescriptorArr = new FileDescriptor[arrayList.size()];
            arrayList.toArray(fileDescriptorArr);
            internalBuildGeneratedFileFrom(strArr, fileDescriptorArr, internalDescriptorAssigner);
        }

        public static void internalUpdateFileDescriptor(FileDescriptor fileDescriptor, ExtensionRegistry extensionRegistry) {
            try {
                fileDescriptor.setProto(FileDescriptorProto.parseFrom(fileDescriptor.proto.toByteString(), (ExtensionRegistryLite) extensionRegistry));
            } catch (Throwable e) {
                throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e);
            }
        }

        private FileDescriptor(FileDescriptorProto fileDescriptorProto, FileDescriptor[] fileDescriptorArr, DescriptorPool descriptorPool, boolean z) {
            int publicDependency;
            int i;
            int i2;
            this.pool = descriptorPool;
            this.proto = fileDescriptorProto;
            this.dependencies = (FileDescriptor[]) fileDescriptorArr.clone();
            HashMap hashMap = new HashMap();
            for (FileDescriptor fileDescriptor : fileDescriptorArr) {
                hashMap.put(fileDescriptor.getName(), fileDescriptor);
            }
            List arrayList = new ArrayList();
            for (i = 0; i < fileDescriptorProto.getPublicDependencyCount(); i++) {
                publicDependency = fileDescriptorProto.getPublicDependency(i);
                if (publicDependency < 0 || publicDependency >= fileDescriptorProto.getDependencyCount()) {
                    throw new DescriptorValidationException("Invalid public dependency index.", null);
                }
                String dependency = fileDescriptorProto.getDependency(publicDependency);
                FileDescriptor fileDescriptor2 = (FileDescriptor) hashMap.get(dependency);
                if (fileDescriptor2 != null) {
                    arrayList.add(fileDescriptor2);
                } else if (!z) {
                    throw new DescriptorValidationException("Invalid public dependency: " + dependency, null);
                }
            }
            this.publicDependencies = new FileDescriptor[arrayList.size()];
            arrayList.toArray(this.publicDependencies);
            descriptorPool.addPackage(getPackage(), this);
            this.messageTypes = new Descriptor[fileDescriptorProto.getMessageTypeCount()];
            for (i2 = 0; i2 < fileDescriptorProto.getMessageTypeCount(); i2++) {
                this.messageTypes[i2] = new Descriptor(this, null, i2, null);
            }
            this.enumTypes = new EnumDescriptor[fileDescriptorProto.getEnumTypeCount()];
            for (i2 = 0; i2 < fileDescriptorProto.getEnumTypeCount(); i2++) {
                this.enumTypes[i2] = new EnumDescriptor(this, null, i2, null);
            }
            this.services = new ServiceDescriptor[fileDescriptorProto.getServiceCount()];
            for (publicDependency = 0; publicDependency < fileDescriptorProto.getServiceCount(); publicDependency++) {
                this.services[publicDependency] = new ServiceDescriptor(this, publicDependency, null);
            }
            this.extensions = new FieldDescriptor[fileDescriptorProto.getExtensionCount()];
            for (i2 = 0; i2 < fileDescriptorProto.getExtensionCount(); i2++) {
                this.extensions[i2] = new FieldDescriptor(this, null, i2, true, null);
            }
        }

        FileDescriptor(String str, Descriptor descriptor) {
            this.pool = new DescriptorPool(new FileDescriptor[0], true);
            this.proto = FileDescriptorProto.newBuilder().setName(descriptor.getFullName() + ".placeholder.proto").setPackage(str).addMessageType(descriptor.toProto()).build();
            this.dependencies = new FileDescriptor[0];
            this.publicDependencies = new FileDescriptor[0];
            this.messageTypes = new Descriptor[]{descriptor};
            this.enumTypes = new EnumDescriptor[0];
            this.services = new ServiceDescriptor[0];
            this.extensions = new FieldDescriptor[0];
            this.pool.addPackage(str, this);
            this.pool.addSymbol(descriptor);
        }

        private void crossLink() {
            int i = 0;
            for (Descriptor access$600 : this.messageTypes) {
                access$600.crossLink();
            }
            for (ServiceDescriptor access$700 : this.services) {
                access$700.crossLink();
            }
            FieldDescriptor[] fieldDescriptorArr = this.extensions;
            int length = fieldDescriptorArr.length;
            while (i < length) {
                fieldDescriptorArr[i].crossLink();
                i++;
            }
        }

        private void setProto(FileDescriptorProto fileDescriptorProto) {
            int i;
            int i2 = 0;
            this.proto = fileDescriptorProto;
            for (i = 0; i < this.messageTypes.length; i++) {
                this.messageTypes[i].setProto(fileDescriptorProto.getMessageType(i));
            }
            for (i = 0; i < this.enumTypes.length; i++) {
                this.enumTypes[i].setProto(fileDescriptorProto.getEnumType(i));
            }
            for (i = 0; i < this.services.length; i++) {
                this.services[i].setProto(fileDescriptorProto.getService(i));
            }
            while (i2 < this.extensions.length) {
                this.extensions[i2].setProto(fileDescriptorProto.getExtension(i2));
                i2++;
            }
        }
    }

    public static final class MethodDescriptor extends GenericDescriptor {
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private Descriptor inputType;
        private Descriptor outputType;
        private MethodDescriptorProto proto;
        private final ServiceDescriptor service;

        public final int getIndex() {
            return this.index;
        }

        public final MethodDescriptorProto toProto() {
            return this.proto;
        }

        public final String getName() {
            return this.proto.getName();
        }

        public final String getFullName() {
            return this.fullName;
        }

        public final FileDescriptor getFile() {
            return this.file;
        }

        public final ServiceDescriptor getService() {
            return this.service;
        }

        public final Descriptor getInputType() {
            return this.inputType;
        }

        public final Descriptor getOutputType() {
            return this.outputType;
        }

        public final MethodOptions getOptions() {
            return this.proto.getOptions();
        }

        private MethodDescriptor(MethodDescriptorProto methodDescriptorProto, FileDescriptor fileDescriptor, ServiceDescriptor serviceDescriptor, int i) {
            this.index = i;
            this.proto = methodDescriptorProto;
            this.file = fileDescriptor;
            this.service = serviceDescriptor;
            this.fullName = serviceDescriptor.getFullName() + '.' + methodDescriptorProto.getName();
            fileDescriptor.pool.addSymbol(this);
        }

        private void crossLink() {
            GenericDescriptor lookupSymbol = this.file.pool.lookupSymbol(this.proto.getInputType(), this, SearchFilter.TYPES_ONLY);
            if (lookupSymbol instanceof Descriptor) {
                this.inputType = (Descriptor) lookupSymbol;
                lookupSymbol = this.file.pool.lookupSymbol(this.proto.getOutputType(), this, SearchFilter.TYPES_ONLY);
                if (lookupSymbol instanceof Descriptor) {
                    this.outputType = (Descriptor) lookupSymbol;
                    return;
                }
                throw new DescriptorValidationException("\"" + this.proto.getOutputType() + "\" is not a message type.", null);
            }
            throw new DescriptorValidationException("\"" + this.proto.getInputType() + "\" is not a message type.", null);
        }

        private void setProto(MethodDescriptorProto methodDescriptorProto) {
            this.proto = methodDescriptorProto;
        }
    }

    public static final class OneofDescriptor {
        private Descriptor containingType;
        private int fieldCount;
        private FieldDescriptor[] fields;
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private OneofDescriptorProto proto;

        public final int getIndex() {
            return this.index;
        }

        public final String getName() {
            return this.proto.getName();
        }

        public final FileDescriptor getFile() {
            return this.file;
        }

        public final String getFullName() {
            return this.fullName;
        }

        public final Descriptor getContainingType() {
            return this.containingType;
        }

        public final int getFieldCount() {
            return this.fieldCount;
        }

        public final FieldDescriptor getField(int i) {
            return this.fields[i];
        }

        private OneofDescriptor(OneofDescriptorProto oneofDescriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i) {
            this.proto = oneofDescriptorProto;
            this.fullName = Descriptors.computeFullName(fileDescriptor, descriptor, oneofDescriptorProto.getName());
            this.file = fileDescriptor;
            this.index = i;
            this.containingType = descriptor;
            this.fieldCount = 0;
        }
    }

    public static final class ServiceDescriptor extends GenericDescriptor {
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private MethodDescriptor[] methods;
        private ServiceDescriptorProto proto;

        public final int getIndex() {
            return this.index;
        }

        public final ServiceDescriptorProto toProto() {
            return this.proto;
        }

        public final String getName() {
            return this.proto.getName();
        }

        public final String getFullName() {
            return this.fullName;
        }

        public final FileDescriptor getFile() {
            return this.file;
        }

        public final ServiceOptions getOptions() {
            return this.proto.getOptions();
        }

        public final List<MethodDescriptor> getMethods() {
            return Collections.unmodifiableList(Arrays.asList(this.methods));
        }

        public final MethodDescriptor findMethodByName(String str) {
            GenericDescriptor findSymbol = this.file.pool.findSymbol(this.fullName + '.' + str);
            if (findSymbol == null || !(findSymbol instanceof MethodDescriptor)) {
                return null;
            }
            return (MethodDescriptor) findSymbol;
        }

        private ServiceDescriptor(ServiceDescriptorProto serviceDescriptorProto, FileDescriptor fileDescriptor, int i) {
            this.index = i;
            this.proto = serviceDescriptorProto;
            this.fullName = Descriptors.computeFullName(fileDescriptor, null, serviceDescriptorProto.getName());
            this.file = fileDescriptor;
            this.methods = new MethodDescriptor[serviceDescriptorProto.getMethodCount()];
            for (int i2 = 0; i2 < serviceDescriptorProto.getMethodCount(); i2++) {
                this.methods[i2] = new MethodDescriptor(fileDescriptor, this, i2, null);
            }
            fileDescriptor.pool.addSymbol(this);
        }

        private void crossLink() {
            for (MethodDescriptor access$2600 : this.methods) {
                access$2600.crossLink();
            }
        }

        private void setProto(ServiceDescriptorProto serviceDescriptorProto) {
            this.proto = serviceDescriptorProto;
            for (int i = 0; i < this.methods.length; i++) {
                this.methods[i].setProto(serviceDescriptorProto.getMethod(i));
            }
        }
    }

    static {
        logger = Logger.getLogger(Descriptors.class.getName());
    }

    private static String computeFullName(FileDescriptor fileDescriptor, Descriptor descriptor, String str) {
        if (descriptor != null) {
            return descriptor.getFullName() + '.' + str;
        }
        if (fileDescriptor.getPackage().length() > 0) {
            return fileDescriptor.getPackage() + '.' + str;
        }
        return str;
    }
}
