package org.apache.mina.core.filterchain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.core.filterchain.IoFilterChain.Entry;
import org.apache.mina.proxy.handlers.http.ntlm.NTLMConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultIoFilterChainBuilder implements IoFilterChainBuilder {
    private static final Logger LOGGER;
    private final List<Entry> entries;

    private final class EntryImpl implements Entry {
        private volatile IoFilter filter;
        private final String name;

        private EntryImpl(String str, IoFilter ioFilter) {
            if (str == null) {
                throw new IllegalArgumentException("name");
            } else if (ioFilter == null) {
                throw new IllegalArgumentException("filter");
            } else {
                this.name = str;
                this.filter = ioFilter;
            }
        }

        public final String getName() {
            return this.name;
        }

        public final IoFilter getFilter() {
            return this.filter;
        }

        private void setFilter(IoFilter ioFilter) {
            this.filter = ioFilter;
        }

        public final NextFilter getNextFilter() {
            throw new IllegalStateException();
        }

        public final String toString() {
            return "(" + getName() + ':' + this.filter + ')';
        }

        public final void addAfter(String str, IoFilter ioFilter) {
            DefaultIoFilterChainBuilder.this.addAfter(getName(), str, ioFilter);
        }

        public final void addBefore(String str, IoFilter ioFilter) {
            DefaultIoFilterChainBuilder.this.addBefore(getName(), str, ioFilter);
        }

        public final void remove() {
            DefaultIoFilterChainBuilder.this.remove(getName());
        }

        public final void replace(IoFilter ioFilter) {
            DefaultIoFilterChainBuilder.this.replace(getName(), ioFilter);
        }
    }

    static {
        LOGGER = LoggerFactory.getLogger(DefaultIoFilterChainBuilder.class);
    }

    public DefaultIoFilterChainBuilder() {
        this.entries = new CopyOnWriteArrayList();
    }

    public DefaultIoFilterChainBuilder(DefaultIoFilterChainBuilder defaultIoFilterChainBuilder) {
        if (defaultIoFilterChainBuilder == null) {
            throw new IllegalArgumentException("filterChain");
        }
        this.entries = new CopyOnWriteArrayList(defaultIoFilterChainBuilder.entries);
    }

    public Entry getEntry(String str) {
        for (Entry entry : this.entries) {
            if (entry.getName().equals(str)) {
                return entry;
            }
        }
        return null;
    }

    public Entry getEntry(IoFilter ioFilter) {
        for (Entry entry : this.entries) {
            if (entry.getFilter() == ioFilter) {
                return entry;
            }
        }
        return null;
    }

    public Entry getEntry(Class<? extends IoFilter> cls) {
        for (Entry entry : this.entries) {
            if (cls.isAssignableFrom(entry.getFilter().getClass())) {
                return entry;
            }
        }
        return null;
    }

    public IoFilter get(String str) {
        Entry entry = getEntry(str);
        if (entry == null) {
            return null;
        }
        return entry.getFilter();
    }

    public IoFilter get(Class<? extends IoFilter> cls) {
        Entry entry = getEntry((Class) cls);
        if (entry == null) {
            return null;
        }
        return entry.getFilter();
    }

    public List<Entry> getAll() {
        return new ArrayList(this.entries);
    }

    public List<Entry> getAllReversed() {
        List<Entry> all = getAll();
        Collections.reverse(all);
        return all;
    }

    public boolean contains(String str) {
        return getEntry(str) != null;
    }

    public boolean contains(IoFilter ioFilter) {
        return getEntry(ioFilter) != null;
    }

    public boolean contains(Class<? extends IoFilter> cls) {
        return getEntry((Class) cls) != null;
    }

    public synchronized void addFirst(String str, IoFilter ioFilter) {
        register(0, new EntryImpl(str, ioFilter, null));
    }

    public synchronized void addLast(String str, IoFilter ioFilter) {
        register(this.entries.size(), new EntryImpl(str, ioFilter, null));
    }

    public synchronized void addBefore(String str, String str2, IoFilter ioFilter) {
        checkBaseName(str);
        ListIterator listIterator = this.entries.listIterator();
        while (listIterator.hasNext()) {
            if (((Entry) listIterator.next()).getName().equals(str)) {
                register(listIterator.previousIndex(), new EntryImpl(str2, ioFilter, null));
                break;
            }
        }
    }

    public synchronized void addAfter(String str, String str2, IoFilter ioFilter) {
        checkBaseName(str);
        ListIterator listIterator = this.entries.listIterator();
        while (listIterator.hasNext()) {
            if (((Entry) listIterator.next()).getName().equals(str)) {
                register(listIterator.nextIndex(), new EntryImpl(str2, ioFilter, null));
                break;
            }
        }
    }

    public synchronized IoFilter remove(String str) {
        Entry entry;
        if (str == null) {
            throw new IllegalArgumentException("name");
        }
        ListIterator listIterator = this.entries.listIterator();
        while (listIterator.hasNext()) {
            entry = (Entry) listIterator.next();
            if (entry.getName().equals(str)) {
                this.entries.remove(listIterator.previousIndex());
            }
        }
        throw new IllegalArgumentException("Unknown filter name: " + str);
        return entry.getFilter();
    }

    public synchronized IoFilter remove(IoFilter ioFilter) {
        Entry entry;
        if (ioFilter == null) {
            throw new IllegalArgumentException("filter");
        }
        ListIterator listIterator = this.entries.listIterator();
        while (listIterator.hasNext()) {
            entry = (Entry) listIterator.next();
            if (entry.getFilter() == ioFilter) {
                this.entries.remove(listIterator.previousIndex());
            }
        }
        throw new IllegalArgumentException("Filter not found: " + ioFilter.getClass().getName());
        return entry.getFilter();
    }

    public synchronized IoFilter remove(Class<? extends IoFilter> cls) {
        Entry entry;
        if (cls == null) {
            throw new IllegalArgumentException("filterType");
        }
        ListIterator listIterator = this.entries.listIterator();
        while (listIterator.hasNext()) {
            entry = (Entry) listIterator.next();
            if (cls.isAssignableFrom(entry.getFilter().getClass())) {
                this.entries.remove(listIterator.previousIndex());
            }
        }
        throw new IllegalArgumentException("Filter not found: " + cls.getName());
        return entry.getFilter();
    }

    public synchronized IoFilter replace(String str, IoFilter ioFilter) {
        IoFilter filter;
        checkBaseName(str);
        EntryImpl entryImpl = (EntryImpl) getEntry(str);
        filter = entryImpl.getFilter();
        entryImpl.setFilter(ioFilter);
        return filter;
    }

    public synchronized void replace(IoFilter ioFilter, IoFilter ioFilter2) {
        for (Entry entry : this.entries) {
            if (entry.getFilter() == ioFilter) {
                ((EntryImpl) entry).setFilter(ioFilter2);
            }
        }
        throw new IllegalArgumentException("Filter not found: " + ioFilter.getClass().getName());
    }

    public synchronized void replace(Class<? extends IoFilter> cls, IoFilter ioFilter) {
        for (Entry entry : this.entries) {
            if (cls.isAssignableFrom(entry.getFilter().getClass())) {
                ((EntryImpl) entry).setFilter(ioFilter);
            }
        }
        throw new IllegalArgumentException("Filter not found: " + cls.getName());
    }

    public synchronized void clear() {
        this.entries.clear();
    }

    public void setFilters(Map<String, ? extends IoFilter> map) {
        if (map == null) {
            throw new IllegalArgumentException("filters");
        } else if (isOrderedMap(map)) {
            Map linkedHashMap = new LinkedHashMap(map);
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (entry.getKey() == null) {
                    throw new IllegalArgumentException("filters contains a null key.");
                } else if (entry.getValue() == null) {
                    throw new IllegalArgumentException("filters contains a null value.");
                }
            }
            synchronized (this) {
                clear();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    addLast((String) entry2.getKey(), (IoFilter) entry2.getValue());
                }
            }
        } else {
            throw new IllegalArgumentException("filters is not an ordered map. Please try " + LinkedHashMap.class.getName() + ".");
        }
    }

    private boolean isOrderedMap(Map<String, ? extends IoFilter> map) {
        Class cls = map.getClass();
        if (LinkedHashMap.class.isAssignableFrom(cls)) {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("{} is an ordered map.", cls.getSimpleName());
            }
            return true;
        }
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("{} is not a {}", cls.getName(), LinkedHashMap.class.getSimpleName());
        }
        for (Class cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            for (Class name : cls2.getInterfaces()) {
                if (name.getName().endsWith("OrderedMap")) {
                    if (LOGGER.isDebugEnabled()) {
                        LOGGER.debug("{} is an ordered map (guessed from that it implements OrderedMap interface.)", cls.getSimpleName());
                    }
                    return true;
                }
            }
        }
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("{} doesn't implement OrderedMap interface.", cls.getName());
        }
        LOGGER.debug("Last resort; trying to create a new map instance with a default constructor and test if insertion order is maintained.");
        try {
            Map map2 = (Map) cls.newInstance();
            Random random = new Random();
            List arrayList = new ArrayList();
            IoFilterAdapter ioFilterAdapter = new IoFilterAdapter();
            for (int i = 0; i < NTLMConstants.FLAG_TARGET_TYPE_DOMAIN; i++) {
                String valueOf;
                do {
                    valueOf = String.valueOf(random.nextInt());
                } while (map2.containsKey(valueOf));
                map2.put(valueOf, ioFilterAdapter);
                arrayList.add(valueOf);
                Iterator it = arrayList.iterator();
                for (Object equals : map2.keySet()) {
                    if (!((String) it.next()).equals(equals)) {
                        if (LOGGER.isDebugEnabled()) {
                            LOGGER.debug("The specified map didn't pass the insertion order test after {} tries.", Integer.valueOf(i + 1));
                        }
                        return false;
                    }
                }
            }
            LOGGER.debug("The specified map passed the insertion order test.");
            return true;
        } catch (Object e) {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("Failed to create a new map instance of '{}'.", cls.getName(), e);
            }
            return false;
        }
    }

    public void buildFilterChain(IoFilterChain ioFilterChain) {
        for (Entry entry : this.entries) {
            ioFilterChain.addLast(entry.getName(), entry.getFilter());
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{ ");
        Object obj = 1;
        for (Entry entry : this.entries) {
            if (obj == null) {
                stringBuilder.append(", ");
            } else {
                obj = null;
            }
            stringBuilder.append('(');
            stringBuilder.append(entry.getName());
            stringBuilder.append(':');
            stringBuilder.append(entry.getFilter());
            stringBuilder.append(')');
        }
        if (obj != null) {
            stringBuilder.append("empty");
        }
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    private void checkBaseName(String str) {
        if (str == null) {
            throw new IllegalArgumentException("baseName");
        } else if (!contains(str)) {
            throw new IllegalArgumentException("Unknown filter name: " + str);
        }
    }

    private void register(int i, Entry entry) {
        if (contains(entry.getName())) {
            throw new IllegalArgumentException("Other filter is using the same name: " + entry.getName());
        }
        this.entries.add(i, entry);
    }
}
