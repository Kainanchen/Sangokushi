package org.apache.mina.util.byteaccess;

import java.nio.ByteOrder;
import org.apache.mina.util.byteaccess.ByteArray.Cursor;
import org.apache.mina.util.byteaccess.CompositeByteArray.CursorListener;

abstract class CompositeByteArrayRelativeBase {
    protected final CompositeByteArray cba;
    protected final Cursor cursor;

    /* renamed from: org.apache.mina.util.byteaccess.CompositeByteArrayRelativeBase.1 */
    class C04731 implements CursorListener {
        static final /* synthetic */ boolean $assertionsDisabled;

        static {
            $assertionsDisabled = !CompositeByteArrayRelativeBase.class.desiredAssertionStatus();
        }

        C04731() {
        }

        public void enteredFirstComponent(int i, ByteArray byteArray) {
        }

        public void enteredLastComponent(int i, ByteArray byteArray) {
            if (!$assertionsDisabled) {
                throw new AssertionError();
            }
        }

        public void enteredNextComponent(int i, ByteArray byteArray) {
            CompositeByteArrayRelativeBase.this.cursorPassedFirstComponent();
        }

        public void enteredPreviousComponent(int i, ByteArray byteArray) {
            if (!$assertionsDisabled) {
                throw new AssertionError();
            }
        }
    }

    protected abstract void cursorPassedFirstComponent();

    public CompositeByteArrayRelativeBase(CompositeByteArray compositeByteArray) {
        this.cba = compositeByteArray;
        this.cursor = compositeByteArray.cursor(compositeByteArray.first(), new C04731());
    }

    public final int getRemaining() {
        return this.cursor.getRemaining();
    }

    public final boolean hasRemaining() {
        return this.cursor.hasRemaining();
    }

    public ByteOrder order() {
        return this.cba.order();
    }

    public final void append(ByteArray byteArray) {
        this.cba.addLast(byteArray);
    }

    public final void free() {
        this.cba.free();
    }

    public final int getIndex() {
        return this.cursor.getIndex();
    }

    public final int last() {
        return this.cba.last();
    }
}
