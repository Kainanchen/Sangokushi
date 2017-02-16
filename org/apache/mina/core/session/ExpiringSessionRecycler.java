package org.apache.mina.core.session;

import java.net.SocketAddress;
import org.apache.mina.util.ExpirationListener;
import org.apache.mina.util.ExpiringMap;
import org.apache.mina.util.ExpiringMap.Expirer;

public class ExpiringSessionRecycler implements IoSessionRecycler {
    private Expirer mapExpirer;
    private ExpiringMap<SocketAddress, IoSession> sessionMap;

    private class DefaultExpirationListener implements ExpirationListener<IoSession> {
        private DefaultExpirationListener() {
        }

        public void expired(IoSession ioSession) {
            ioSession.closeNow();
        }
    }

    public ExpiringSessionRecycler() {
        this(60);
    }

    public ExpiringSessionRecycler(int i) {
        this(i, 1);
    }

    public ExpiringSessionRecycler(int i, int i2) {
        this.sessionMap = new ExpiringMap(i, i2);
        this.mapExpirer = this.sessionMap.getExpirer();
        this.sessionMap.addExpirationListener(new DefaultExpirationListener());
    }

    public void put(IoSession ioSession) {
        this.mapExpirer.startExpiringIfNotStarted();
        SocketAddress remoteAddress = ioSession.getRemoteAddress();
        if (!this.sessionMap.containsKey(remoteAddress)) {
            this.sessionMap.put(remoteAddress, ioSession);
        }
    }

    public IoSession recycle(SocketAddress socketAddress) {
        return (IoSession) this.sessionMap.get(socketAddress);
    }

    public void remove(IoSession ioSession) {
        this.sessionMap.remove(ioSession.getRemoteAddress());
    }

    public void stopExpiring() {
        this.mapExpirer.stopExpiring();
    }

    public int getExpirationInterval() {
        return this.sessionMap.getExpirationInterval();
    }

    public int getTimeToLive() {
        return this.sessionMap.getTimeToLive();
    }

    public void setExpirationInterval(int i) {
        this.sessionMap.setExpirationInterval(i);
    }

    public void setTimeToLive(int i) {
        this.sessionMap.setTimeToLive(i);
    }
}
