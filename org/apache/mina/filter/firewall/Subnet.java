package org.apache.mina.filter.firewall;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import org.apache.mina.proxy.handlers.http.ntlm.NTLMConstants;

public class Subnet {
    private static final int BYTE_MASK = 255;
    private static final int IP_MASK_V4 = Integer.MIN_VALUE;
    private static final long IP_MASK_V6 = Long.MIN_VALUE;
    private InetAddress subnet;
    private int subnetInt;
    private long subnetLong;
    private long subnetMask;
    private int suffix;

    public Subnet(InetAddress inetAddress, int i) {
        if (inetAddress == null) {
            throw new IllegalArgumentException("Subnet address can not be null");
        } else if (!(inetAddress instanceof Inet4Address) && !(inetAddress instanceof Inet6Address)) {
            throw new IllegalArgumentException("Only IPv4 and IPV6 supported");
        } else if (inetAddress instanceof Inet4Address) {
            if (i < 0 || i > 32) {
                throw new IllegalArgumentException("Mask has to be an integer between 0 and 32 for an IPV4 address");
            }
            this.subnet = inetAddress;
            this.subnetInt = toInt(inetAddress);
            this.suffix = i;
            this.subnetMask = (long) (IP_MASK_V4 >> (i - 1));
        } else if (i < 0 || i > NTLMConstants.FLAG_NEGOTIATE_LAN_MANAGER_KEY) {
            throw new IllegalArgumentException("Mask has to be an integer between 0 and 128 for an IPV6 address");
        } else {
            this.subnet = inetAddress;
            this.subnetLong = toLong(inetAddress);
            this.suffix = i;
            this.subnetMask = IP_MASK_V6 >> (i - 1);
        }
    }

    private int toInt(InetAddress inetAddress) {
        int i = 0;
        byte[] address = inetAddress.getAddress();
        int i2 = 0;
        while (i < address.length) {
            i2 = (i2 << 8) | (address[i] & BYTE_MASK);
            i++;
        }
        return i2;
    }

    private long toLong(InetAddress inetAddress) {
        long j = 0;
        for (byte b : inetAddress.getAddress()) {
            j = (j << 8) | ((long) (b & BYTE_MASK));
        }
        return j;
    }

    private long toSubnet(InetAddress inetAddress) {
        if (inetAddress instanceof Inet4Address) {
            return (long) (toInt(inetAddress) & ((int) this.subnetMask));
        }
        return toLong(inetAddress) & this.subnetMask;
    }

    public boolean inSubnet(InetAddress inetAddress) {
        if (inetAddress.isAnyLocalAddress()) {
            return true;
        }
        if (inetAddress instanceof Inet4Address) {
            if (((int) toSubnet(inetAddress)) != this.subnetInt) {
                return false;
            }
            return true;
        } else if (toSubnet(inetAddress) != this.subnetLong) {
            return false;
        } else {
            return true;
        }
    }

    public String toString() {
        return this.subnet.getHostAddress() + "/" + this.suffix;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Subnet)) {
            return false;
        }
        Subnet subnet = (Subnet) obj;
        if (subnet.subnetInt == this.subnetInt && subnet.suffix == this.suffix) {
            return true;
        }
        return false;
    }
}
