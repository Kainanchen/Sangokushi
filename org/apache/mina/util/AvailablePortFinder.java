package org.apache.mina.util;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.util.NoSuchElementException;
import java.util.Set;

public class AvailablePortFinder {
    public static final int MAX_PORT_NUMBER = 49151;
    public static final int MIN_PORT_NUMBER = 1;

    private AvailablePortFinder() {
    }

    public static Set<Integer> getAvailablePorts() {
        return getAvailablePorts(MIN_PORT_NUMBER, MAX_PORT_NUMBER);
    }

    public static int getNextAvailable() {
        try {
            ServerSocket serverSocket = new ServerSocket(0);
            int localPort = serverSocket.getLocalPort();
            serverSocket.close();
            return localPort;
        } catch (IOException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public static int getNextAvailable(int i) {
        if (i <= 0 || i > MAX_PORT_NUMBER) {
            throw new IllegalArgumentException("Invalid start port: " + i);
        }
        for (int i2 = i; i2 <= MAX_PORT_NUMBER; i2 += MIN_PORT_NUMBER) {
            if (available(i2)) {
                return i2;
            }
        }
        throw new NoSuchElementException("Could not find an available port above " + i);
    }

    public static boolean available(int i) {
        ServerSocket serverSocket;
        DatagramSocket datagramSocket;
        ServerSocket serverSocket2;
        Throwable th;
        DatagramSocket datagramSocket2 = null;
        if (i <= 0 || i > MAX_PORT_NUMBER) {
            throw new IllegalArgumentException("Invalid start port: " + i);
        }
        try {
            serverSocket = new ServerSocket(i);
            try {
                serverSocket.setReuseAddress(true);
                DatagramSocket datagramSocket3 = new DatagramSocket(i);
                try {
                    datagramSocket3.setReuseAddress(true);
                    datagramSocket3.close();
                    try {
                        serverSocket.close();
                        return true;
                    } catch (IOException e) {
                        return true;
                    }
                } catch (IOException e2) {
                    datagramSocket = datagramSocket3;
                    serverSocket2 = serverSocket;
                    if (datagramSocket != null) {
                        datagramSocket.close();
                    }
                    if (serverSocket2 != null) {
                        try {
                            serverSocket2.close();
                        } catch (IOException e3) {
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    datagramSocket2 = datagramSocket3;
                    if (datagramSocket2 != null) {
                        datagramSocket2.close();
                    }
                    if (serverSocket != null) {
                        try {
                            serverSocket.close();
                        } catch (IOException e4) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e5) {
                datagramSocket = null;
                serverSocket2 = serverSocket;
                if (datagramSocket != null) {
                    datagramSocket.close();
                }
                if (serverSocket2 != null) {
                    serverSocket2.close();
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                if (datagramSocket2 != null) {
                    datagramSocket2.close();
                }
                if (serverSocket != null) {
                    serverSocket.close();
                }
                throw th;
            }
        } catch (IOException e6) {
            datagramSocket = null;
            if (datagramSocket != null) {
                datagramSocket.close();
            }
            if (serverSocket2 != null) {
                serverSocket2.close();
            }
            return false;
        } catch (Throwable th4) {
            th = th4;
            serverSocket = null;
            if (datagramSocket2 != null) {
                datagramSocket2.close();
            }
            if (serverSocket != null) {
                serverSocket.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Set<java.lang.Integer> getAvailablePorts(int r4, int r5) {
        /*
        if (r4 <= 0) goto L_0x0009;
    L_0x0002:
        r0 = 49151; // 0xbfff float:6.8875E-41 double:2.4284E-319;
        if (r5 > r0) goto L_0x0009;
    L_0x0007:
        if (r4 <= r5) goto L_0x0028;
    L_0x0009:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r2 = "Invalid port range: ";
        r1.<init>(r2);
        r1 = r1.append(r4);
        r2 = " ~ ";
        r1 = r1.append(r2);
        r1 = r1.append(r5);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0028:
        r2 = new java.util.TreeSet;
        r2.<init>();
    L_0x002d:
        if (r4 > r5) goto L_0x0057;
    L_0x002f:
        r1 = 0;
        r0 = new java.net.ServerSocket;	 Catch:{ IOException -> 0x0042, all -> 0x004c }
        r0.<init>(r4);	 Catch:{ IOException -> 0x0042, all -> 0x004c }
        r1 = java.lang.Integer.valueOf(r4);	 Catch:{ IOException -> 0x005d, all -> 0x0058 }
        r2.add(r1);	 Catch:{ IOException -> 0x005d, all -> 0x0058 }
        r0.close();	 Catch:{ IOException -> 0x0053 }
    L_0x003f:
        r4 = r4 + 1;
        goto L_0x002d;
    L_0x0042:
        r0 = move-exception;
        r0 = r1;
    L_0x0044:
        if (r0 == 0) goto L_0x003f;
    L_0x0046:
        r0.close();	 Catch:{ IOException -> 0x004a }
        goto L_0x003f;
    L_0x004a:
        r0 = move-exception;
        goto L_0x003f;
    L_0x004c:
        r0 = move-exception;
    L_0x004d:
        if (r1 == 0) goto L_0x0052;
    L_0x004f:
        r1.close();	 Catch:{ IOException -> 0x0055 }
    L_0x0052:
        throw r0;
    L_0x0053:
        r0 = move-exception;
        goto L_0x003f;
    L_0x0055:
        r1 = move-exception;
        goto L_0x0052;
    L_0x0057:
        return r2;
    L_0x0058:
        r1 = move-exception;
        r3 = r1;
        r1 = r0;
        r0 = r3;
        goto L_0x004d;
    L_0x005d:
        r1 = move-exception;
        goto L_0x0044;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.mina.util.AvailablePortFinder.getAvailablePorts(int, int):java.util.Set<java.lang.Integer>");
    }
}
