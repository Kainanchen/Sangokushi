package org.apache.mina.filter.firewall;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.core.filterchain.IoFilterAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.write.WriteRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlacklistFilter extends IoFilterAdapter {
    private static final Logger LOGGER;
    private final List<Subnet> blacklist;

    public BlacklistFilter() {
        this.blacklist = new CopyOnWriteArrayList();
    }

    static {
        LOGGER = LoggerFactory.getLogger(BlacklistFilter.class);
    }

    public void setBlacklist(InetAddress[] inetAddressArr) {
        if (inetAddressArr == null) {
            throw new IllegalArgumentException("addresses");
        }
        this.blacklist.clear();
        for (InetAddress block : inetAddressArr) {
            block(block);
        }
    }

    public void setSubnetBlacklist(Subnet[] subnetArr) {
        if (subnetArr == null) {
            throw new IllegalArgumentException("Subnets must not be null");
        }
        this.blacklist.clear();
        for (Subnet block : subnetArr) {
            block(block);
        }
    }

    public void setBlacklist(Iterable<InetAddress> iterable) {
        if (iterable == null) {
            throw new IllegalArgumentException("addresses");
        }
        this.blacklist.clear();
        for (InetAddress block : iterable) {
            block(block);
        }
    }

    public void setSubnetBlacklist(Iterable<Subnet> iterable) {
        if (iterable == null) {
            throw new IllegalArgumentException("Subnets must not be null");
        }
        this.blacklist.clear();
        for (Subnet block : iterable) {
            block(block);
        }
    }

    public void block(InetAddress inetAddress) {
        if (inetAddress == null) {
            throw new IllegalArgumentException("Adress to block can not be null");
        }
        block(new Subnet(inetAddress, 32));
    }

    public void block(Subnet subnet) {
        if (subnet == null) {
            throw new IllegalArgumentException("Subnet can not be null");
        }
        this.blacklist.add(subnet);
    }

    public void unblock(InetAddress inetAddress) {
        if (inetAddress == null) {
            throw new IllegalArgumentException("Adress to unblock can not be null");
        }
        unblock(new Subnet(inetAddress, 32));
    }

    public void unblock(Subnet subnet) {
        if (subnet == null) {
            throw new IllegalArgumentException("Subnet can not be null");
        }
        this.blacklist.remove(subnet);
    }

    public void sessionCreated(NextFilter nextFilter, IoSession ioSession) {
        if (isBlocked(ioSession)) {
            blockSession(ioSession);
        } else {
            nextFilter.sessionCreated(ioSession);
        }
    }

    public void sessionOpened(NextFilter nextFilter, IoSession ioSession) {
        if (isBlocked(ioSession)) {
            blockSession(ioSession);
        } else {
            nextFilter.sessionOpened(ioSession);
        }
    }

    public void sessionClosed(NextFilter nextFilter, IoSession ioSession) {
        if (isBlocked(ioSession)) {
            blockSession(ioSession);
        } else {
            nextFilter.sessionClosed(ioSession);
        }
    }

    public void sessionIdle(NextFilter nextFilter, IoSession ioSession, IdleStatus idleStatus) {
        if (isBlocked(ioSession)) {
            blockSession(ioSession);
        } else {
            nextFilter.sessionIdle(ioSession, idleStatus);
        }
    }

    public void messageReceived(NextFilter nextFilter, IoSession ioSession, Object obj) {
        if (isBlocked(ioSession)) {
            blockSession(ioSession);
        } else {
            nextFilter.messageReceived(ioSession, obj);
        }
    }

    public void messageSent(NextFilter nextFilter, IoSession ioSession, WriteRequest writeRequest) {
        if (isBlocked(ioSession)) {
            blockSession(ioSession);
        } else {
            nextFilter.messageSent(ioSession, writeRequest);
        }
    }

    private void blockSession(IoSession ioSession) {
        LOGGER.warn("Remote address in the blacklist; closing.");
        ioSession.closeNow();
    }

    private boolean isBlocked(IoSession ioSession) {
        SocketAddress remoteAddress = ioSession.getRemoteAddress();
        if (remoteAddress instanceof InetSocketAddress) {
            InetAddress address = ((InetSocketAddress) remoteAddress).getAddress();
            for (Subnet inSubnet : this.blacklist) {
                if (inSubnet.inSubnet(address)) {
                    return true;
                }
            }
        }
        return false;
    }
}
