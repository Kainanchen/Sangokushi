package com.facebook.p007c.p010b;

import com.facebook.p007c.p010b.DiskStorage.DiskStorage;

/* renamed from: com.facebook.c.b.b */
public final class DefaultEntryEvictionComparatorSupplier implements EntryEvictionComparatorSupplier {

    /* renamed from: com.facebook.c.b.b.1 */
    class DefaultEntryEvictionComparatorSupplier implements EntryEvictionComparator {
        final /* synthetic */ DefaultEntryEvictionComparatorSupplier f1020a;

        DefaultEntryEvictionComparatorSupplier(DefaultEntryEvictionComparatorSupplier defaultEntryEvictionComparatorSupplier) {
            this.f1020a = defaultEntryEvictionComparatorSupplier;
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            DiskStorage diskStorage = (DiskStorage) obj2;
            long b = ((DiskStorage) obj).m920b();
            long b2 = diskStorage.m920b();
            if (b < b2) {
                return -1;
            }
            return b2 == b ? 0 : 1;
        }
    }

    public final EntryEvictionComparator m962a() {
        return new DefaultEntryEvictionComparatorSupplier(this);
    }
}
