package org.apache.mina.core.session;

public class IdleStatus {
    public static final IdleStatus BOTH_IDLE;
    public static final IdleStatus READER_IDLE;
    public static final IdleStatus WRITER_IDLE;
    private final String strValue;

    static {
        READER_IDLE = new IdleStatus("reader idle");
        WRITER_IDLE = new IdleStatus("writer idle");
        BOTH_IDLE = new IdleStatus("both idle");
    }

    private IdleStatus(String str) {
        this.strValue = str;
    }

    public String toString() {
        return this.strValue;
    }
}
