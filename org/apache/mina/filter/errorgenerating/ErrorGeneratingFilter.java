package org.apache.mina.filter.errorgenerating;

import java.util.Random;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.core.filterchain.IoFilterAdapter;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.write.DefaultWriteRequest;
import org.apache.mina.core.write.WriteRequest;
import org.apache.mina.proxy.handlers.http.ntlm.NTLMConstants;
import org.cocos2dx.lib.GameControllerDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ErrorGeneratingFilter extends IoFilterAdapter {
    private int changeByteProbability;
    private int duplicatePduProbability;
    private int insertByteProbability;
    private final Logger logger;
    private boolean manipulateReads;
    private boolean manipulateWrites;
    private int maxInsertByte;
    private int removeByteProbability;
    private int removePduProbability;
    private int resendPduLasterProbability;
    private Random rng;

    public ErrorGeneratingFilter() {
        this.removeByteProbability = 0;
        this.insertByteProbability = 0;
        this.changeByteProbability = 0;
        this.removePduProbability = 0;
        this.duplicatePduProbability = 0;
        this.resendPduLasterProbability = 0;
        this.maxInsertByte = 10;
        this.manipulateWrites = false;
        this.manipulateReads = false;
        this.rng = new Random();
        this.logger = LoggerFactory.getLogger(ErrorGeneratingFilter.class);
    }

    public void filterWrite(NextFilter nextFilter, IoSession ioSession, WriteRequest writeRequest) {
        if (this.manipulateWrites) {
            if (writeRequest.getMessage() instanceof IoBuffer) {
                manipulateIoBuffer(ioSession, (IoBuffer) writeRequest.getMessage());
                IoBuffer insertBytesToNewIoBuffer = insertBytesToNewIoBuffer(ioSession, (IoBuffer) writeRequest.getMessage());
                if (insertBytesToNewIoBuffer != null) {
                    writeRequest = new DefaultWriteRequest(insertBytesToNewIoBuffer, writeRequest.getFuture(), writeRequest.getDestination());
                }
            } else {
                if (this.duplicatePduProbability > this.rng.nextInt()) {
                    nextFilter.filterWrite(ioSession, writeRequest);
                }
                this.rng.nextInt();
                if (this.removePduProbability > this.rng.nextInt()) {
                    return;
                }
            }
        }
        nextFilter.filterWrite(ioSession, writeRequest);
    }

    public void messageReceived(NextFilter nextFilter, IoSession ioSession, Object obj) {
        if (this.manipulateReads && (obj instanceof IoBuffer)) {
            manipulateIoBuffer(ioSession, (IoBuffer) obj);
            IoBuffer insertBytesToNewIoBuffer = insertBytesToNewIoBuffer(ioSession, (IoBuffer) obj);
            if (insertBytesToNewIoBuffer != null) {
                obj = insertBytesToNewIoBuffer;
            }
        }
        nextFilter.messageReceived(ioSession, obj);
    }

    private IoBuffer insertBytesToNewIoBuffer(IoSession ioSession, IoBuffer ioBuffer) {
        int i = 0;
        if (this.insertByteProbability <= this.rng.nextInt(GameControllerDelegate.THUMBSTICK_LEFT_X)) {
            return null;
        }
        this.logger.info(ioBuffer.getHexDump());
        int nextInt = this.rng.nextInt(ioBuffer.remaining()) - 1;
        int nextInt2 = this.rng.nextInt(this.maxInsertByte - 1) + 1;
        IoBuffer allocate = IoBuffer.allocate(ioBuffer.remaining() + nextInt2);
        for (int i2 = 0; i2 < nextInt; i2++) {
            allocate.put(ioBuffer.get());
        }
        while (i < nextInt2) {
            allocate.put((byte) this.rng.nextInt(NTLMConstants.FLAG_UNIDENTIFIED_2));
            i++;
        }
        while (ioBuffer.remaining() > 0) {
            allocate.put(ioBuffer.get());
        }
        allocate.flip();
        this.logger.info("Inserted " + nextInt2 + " bytes.");
        this.logger.info(allocate.getHexDump());
        return allocate;
    }

    private void manipulateIoBuffer(IoSession ioSession, IoBuffer ioBuffer) {
        int nextInt;
        int i;
        if (ioBuffer.remaining() > 0 && this.removeByteProbability > this.rng.nextInt(GameControllerDelegate.THUMBSTICK_LEFT_X)) {
            this.logger.info(ioBuffer.getHexDump());
            int nextInt2 = this.rng.nextInt(ioBuffer.remaining());
            nextInt = this.rng.nextInt(ioBuffer.remaining() - nextInt2) + 1;
            if (nextInt == ioBuffer.remaining()) {
                nextInt = ioBuffer.remaining() - 1;
            }
            IoBuffer allocate = IoBuffer.allocate(ioBuffer.remaining() - nextInt);
            for (i = 0; i < nextInt2; i++) {
                allocate.put(ioBuffer.get());
            }
            ioBuffer.skip(nextInt);
            while (allocate.remaining() > 0) {
                allocate.put(ioBuffer.get());
            }
            allocate.flip();
            ioBuffer.rewind();
            ioBuffer.put(allocate);
            ioBuffer.flip();
            this.logger.info("Removed " + nextInt + " bytes at position " + nextInt2 + ".");
            this.logger.info(ioBuffer.getHexDump());
        }
        if (ioBuffer.remaining() > 0 && this.changeByteProbability > this.rng.nextInt(GameControllerDelegate.THUMBSTICK_LEFT_X)) {
            this.logger.info(ioBuffer.getHexDump());
            i = this.rng.nextInt(ioBuffer.remaining() - 1) + 1;
            byte[] bArr = new byte[i];
            this.rng.nextBytes(bArr);
            for (nextInt = 0; nextInt < i; nextInt++) {
                ioBuffer.put(this.rng.nextInt(ioBuffer.remaining()), bArr[nextInt]);
            }
            this.logger.info("Modified " + i + " bytes.");
            this.logger.info(ioBuffer.getHexDump());
        }
    }

    public int getChangeByteProbability() {
        return this.changeByteProbability;
    }

    public void setChangeByteProbability(int i) {
        this.changeByteProbability = i;
    }

    public int getDuplicatePduProbability() {
        return this.duplicatePduProbability;
    }

    public void setDuplicatePduProbability(int i) {
        this.duplicatePduProbability = i;
    }

    public int getInsertByteProbability() {
        return this.insertByteProbability;
    }

    public void setInsertByteProbability(int i) {
        this.insertByteProbability = i;
    }

    public boolean isManipulateReads() {
        return this.manipulateReads;
    }

    public void setManipulateReads(boolean z) {
        this.manipulateReads = z;
    }

    public boolean isManipulateWrites() {
        return this.manipulateWrites;
    }

    public void setManipulateWrites(boolean z) {
        this.manipulateWrites = z;
    }

    public int getRemoveByteProbability() {
        return this.removeByteProbability;
    }

    public void setRemoveByteProbability(int i) {
        this.removeByteProbability = i;
    }

    public int getRemovePduProbability() {
        return this.removePduProbability;
    }

    public void setRemovePduProbability(int i) {
        this.removePduProbability = i;
    }

    public int getResendPduLasterProbability() {
        return this.resendPduLasterProbability;
    }

    public void setResendPduLasterProbability(int i) {
        this.resendPduLasterProbability = i;
    }

    public int getMaxInsertByte() {
        return this.maxInsertByte;
    }

    public void setMaxInsertByte(int i) {
        this.maxInsertByte = i;
    }
}
