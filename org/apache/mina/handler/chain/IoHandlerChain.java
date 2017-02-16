package org.apache.mina.handler.chain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.handler.chain.IoHandlerCommand.NextCommand;

public class IoHandlerChain implements IoHandlerCommand {
    private static volatile int nextId;
    private final String NEXT_COMMAND;
    private final Entry head;
    private final int id;
    private final Map<String, Entry> name2entry;
    private final Entry tail;

    /* renamed from: org.apache.mina.handler.chain.IoHandlerChain.1 */
    class C04521 implements IoHandlerCommand {
        C04521() {
        }

        public void execute(NextCommand nextCommand, IoSession ioSession, Object obj) {
            nextCommand.execute(ioSession, obj);
        }
    }

    /* renamed from: org.apache.mina.handler.chain.IoHandlerChain.2 */
    class C04532 implements IoHandlerCommand {
        C04532() {
        }

        public void execute(NextCommand nextCommand, IoSession ioSession, Object obj) {
            NextCommand nextCommand2 = (NextCommand) ioSession.getAttribute(IoHandlerChain.this.NEXT_COMMAND);
            if (nextCommand2 != null) {
                nextCommand2.execute(ioSession, obj);
            }
        }
    }

    public class Entry {
        private final IoHandlerCommand command;
        private final String name;
        private final NextCommand nextCommand;
        private Entry nextEntry;
        private Entry prevEntry;

        /* renamed from: org.apache.mina.handler.chain.IoHandlerChain.Entry.1 */
        class C04541 implements NextCommand {
            final /* synthetic */ IoHandlerChain val$this$0;

            C04541(IoHandlerChain ioHandlerChain) {
                this.val$this$0 = ioHandlerChain;
            }

            public void execute(IoSession ioSession, Object obj) {
                IoHandlerChain.this.callNextCommand(Entry.this.nextEntry, ioSession, obj);
            }
        }

        private Entry(Entry entry, Entry entry2, String str, IoHandlerCommand ioHandlerCommand) {
            if (ioHandlerCommand == null) {
                throw new IllegalArgumentException("command");
            } else if (str == null) {
                throw new IllegalArgumentException("name");
            } else {
                this.prevEntry = entry;
                this.nextEntry = entry2;
                this.name = str;
                this.command = ioHandlerCommand;
                this.nextCommand = new C04541(IoHandlerChain.this);
            }
        }

        public String getName() {
            return this.name;
        }

        public IoHandlerCommand getCommand() {
            return this.command;
        }

        public NextCommand getNextCommand() {
            return this.nextCommand;
        }
    }

    static {
        nextId = 0;
    }

    public IoHandlerChain() {
        int i = nextId;
        nextId = i + 1;
        this.id = i;
        this.NEXT_COMMAND = IoHandlerChain.class.getName() + '.' + this.id + ".nextCommand";
        this.name2entry = new ConcurrentHashMap();
        this.head = new Entry(null, null, "head", createHeadCommand(), null);
        this.tail = new Entry(this.head, null, "tail", createTailCommand(), null);
        this.head.nextEntry = this.tail;
    }

    private IoHandlerCommand createHeadCommand() {
        return new C04521();
    }

    private IoHandlerCommand createTailCommand() {
        return new C04532();
    }

    public Entry getEntry(String str) {
        Entry entry = (Entry) this.name2entry.get(str);
        if (entry == null) {
            return null;
        }
        return entry;
    }

    public IoHandlerCommand get(String str) {
        Entry entry = getEntry(str);
        if (entry == null) {
            return null;
        }
        return entry.getCommand();
    }

    public NextCommand getNextCommand(String str) {
        Entry entry = getEntry(str);
        if (entry == null) {
            return null;
        }
        return entry.getNextCommand();
    }

    public synchronized void addFirst(String str, IoHandlerCommand ioHandlerCommand) {
        checkAddable(str);
        register(this.head, str, ioHandlerCommand);
    }

    public synchronized void addLast(String str, IoHandlerCommand ioHandlerCommand) {
        checkAddable(str);
        register(this.tail.prevEntry, str, ioHandlerCommand);
    }

    public synchronized void addBefore(String str, String str2, IoHandlerCommand ioHandlerCommand) {
        Entry checkOldName = checkOldName(str);
        checkAddable(str2);
        register(checkOldName.prevEntry, str2, ioHandlerCommand);
    }

    public synchronized void addAfter(String str, String str2, IoHandlerCommand ioHandlerCommand) {
        Entry checkOldName = checkOldName(str);
        checkAddable(str2);
        register(checkOldName, str2, ioHandlerCommand);
    }

    public synchronized IoHandlerCommand remove(String str) {
        Entry checkOldName;
        checkOldName = checkOldName(str);
        deregister(checkOldName);
        return checkOldName.getCommand();
    }

    public synchronized void clear() {
        Iterator it = new ArrayList(this.name2entry.keySet()).iterator();
        while (it.hasNext()) {
            remove((String) it.next());
        }
    }

    private void register(Entry entry, String str, IoHandlerCommand ioHandlerCommand) {
        Entry entry2 = new Entry(entry, entry.nextEntry, str, ioHandlerCommand, null);
        entry.nextEntry.prevEntry = entry2;
        entry.nextEntry = entry2;
        this.name2entry.put(str, entry2);
    }

    private void deregister(Entry entry) {
        Entry access$300 = entry.prevEntry;
        Entry access$100 = entry.nextEntry;
        access$300.nextEntry = access$100;
        access$100.prevEntry = access$300;
        this.name2entry.remove(entry.name);
    }

    private Entry checkOldName(String str) {
        Entry entry = (Entry) this.name2entry.get(str);
        if (entry != null) {
            return entry;
        }
        throw new IllegalArgumentException("Unknown filter name:" + str);
    }

    private void checkAddable(String str) {
        if (this.name2entry.containsKey(str)) {
            throw new IllegalArgumentException("Other filter is using the same name '" + str + "'");
        }
    }

    public void execute(NextCommand nextCommand, IoSession ioSession, Object obj) {
        if (nextCommand != null) {
            ioSession.setAttribute(this.NEXT_COMMAND, nextCommand);
        }
        try {
            callNextCommand(this.head, ioSession, obj);
        } finally {
            ioSession.removeAttribute(this.NEXT_COMMAND);
        }
    }

    private void callNextCommand(Entry entry, IoSession ioSession, Object obj) {
        entry.getCommand().execute(entry.getNextCommand(), ioSession, obj);
    }

    public List<Entry> getAll() {
        List<Entry> arrayList = new ArrayList();
        for (Entry access$100 = this.head.nextEntry; access$100 != this.tail; access$100 = access$100.nextEntry) {
            arrayList.add(access$100);
        }
        return arrayList;
    }

    public List<Entry> getAllReversed() {
        List<Entry> arrayList = new ArrayList();
        for (Entry access$300 = this.tail.prevEntry; access$300 != this.head; access$300 = access$300.prevEntry) {
            arrayList.add(access$300);
        }
        return arrayList;
    }

    public boolean contains(String str) {
        return getEntry(str) != null;
    }

    public boolean contains(IoHandlerCommand ioHandlerCommand) {
        for (Entry access$100 = this.head.nextEntry; access$100 != this.tail; access$100 = access$100.nextEntry) {
            if (access$100.getCommand() == ioHandlerCommand) {
                return true;
            }
        }
        return false;
    }

    public boolean contains(Class<? extends IoHandlerCommand> cls) {
        for (Entry access$100 = this.head.nextEntry; access$100 != this.tail; access$100 = access$100.nextEntry) {
            if (cls.isAssignableFrom(access$100.getCommand().getClass())) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{ ");
        Object obj = 1;
        for (Entry access$100 = this.head.nextEntry; access$100 != this.tail; access$100 = access$100.nextEntry) {
            if (obj == null) {
                stringBuilder.append(", ");
            } else {
                obj = null;
            }
            stringBuilder.append('(');
            stringBuilder.append(access$100.getName());
            stringBuilder.append(':');
            stringBuilder.append(access$100.getCommand());
            stringBuilder.append(')');
        }
        if (obj != null) {
            stringBuilder.append("empty");
        }
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}
