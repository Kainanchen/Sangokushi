package org.apache.mina.filter.ssl;

import java.security.KeyStore;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.ManagerFactoryParameters;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

public class SslContextFactory {
    private int clientSessionCacheSize;
    private int clientSessionTimeout;
    private KeyManagerFactory keyManagerFactory;
    private String keyManagerFactoryAlgorithm;
    private boolean keyManagerFactoryAlgorithmUseDefault;
    private KeyStore keyManagerFactoryKeyStore;
    private char[] keyManagerFactoryKeyStorePassword;
    private String keyManagerFactoryProvider;
    private String protocol;
    private String provider;
    private SecureRandom secureRandom;
    private int serverSessionCacheSize;
    private int serverSessionTimeout;
    private TrustManagerFactory trustManagerFactory;
    private String trustManagerFactoryAlgorithm;
    private boolean trustManagerFactoryAlgorithmUseDefault;
    private KeyStore trustManagerFactoryKeyStore;
    private ManagerFactoryParameters trustManagerFactoryParameters;
    private String trustManagerFactoryProvider;

    public SslContextFactory() {
        this.provider = null;
        this.protocol = "TLS";
        this.secureRandom = null;
        this.keyManagerFactoryKeyStore = null;
        this.keyManagerFactoryKeyStorePassword = null;
        this.keyManagerFactory = null;
        this.keyManagerFactoryAlgorithm = null;
        this.keyManagerFactoryProvider = null;
        this.keyManagerFactoryAlgorithmUseDefault = true;
        this.trustManagerFactoryKeyStore = null;
        this.trustManagerFactory = null;
        this.trustManagerFactoryAlgorithm = null;
        this.trustManagerFactoryProvider = null;
        this.trustManagerFactoryAlgorithmUseDefault = true;
        this.trustManagerFactoryParameters = null;
        this.clientSessionCacheSize = -1;
        this.clientSessionTimeout = -1;
        this.serverSessionCacheSize = -1;
        this.serverSessionTimeout = -1;
    }

    public SSLContext newInstance() {
        KeyManagerFactory instance;
        String str;
        TrustManagerFactory instance2;
        KeyManager[] keyManagers;
        SSLContext instance3;
        TrustManager[] trustManagerArr = null;
        KeyManagerFactory keyManagerFactory = this.keyManagerFactory;
        TrustManagerFactory trustManagerFactory = this.trustManagerFactory;
        if (keyManagerFactory == null) {
            String str2 = this.keyManagerFactoryAlgorithm;
            if (str2 == null && this.keyManagerFactoryAlgorithmUseDefault) {
                str2 = KeyManagerFactory.getDefaultAlgorithm();
            }
            if (str2 != null) {
                if (this.keyManagerFactoryProvider == null) {
                    instance = KeyManagerFactory.getInstance(str2);
                } else {
                    instance = KeyManagerFactory.getInstance(str2, this.keyManagerFactoryProvider);
                }
                if (trustManagerFactory == null) {
                    str = this.trustManagerFactoryAlgorithm;
                    if (str == null && this.trustManagerFactoryAlgorithmUseDefault) {
                        str = TrustManagerFactory.getDefaultAlgorithm();
                    }
                    if (str != null) {
                        if (this.trustManagerFactoryProvider != null) {
                            instance2 = TrustManagerFactory.getInstance(str);
                        } else {
                            instance2 = TrustManagerFactory.getInstance(str, this.trustManagerFactoryProvider);
                        }
                        if (instance == null) {
                            instance.init(this.keyManagerFactoryKeyStore, this.keyManagerFactoryKeyStorePassword);
                            keyManagers = instance.getKeyManagers();
                        } else {
                            keyManagers = null;
                        }
                        if (instance2 != null) {
                            if (this.trustManagerFactoryParameters == null) {
                                instance2.init(this.trustManagerFactoryParameters);
                            } else {
                                instance2.init(this.trustManagerFactoryKeyStore);
                            }
                            trustManagerArr = instance2.getTrustManagers();
                        }
                        if (this.provider != null) {
                            instance3 = SSLContext.getInstance(this.protocol);
                        } else {
                            instance3 = SSLContext.getInstance(this.protocol, this.provider);
                        }
                        instance3.init(keyManagers, trustManagerArr, this.secureRandom);
                        if (this.clientSessionCacheSize >= 0) {
                            instance3.getClientSessionContext().setSessionCacheSize(this.clientSessionCacheSize);
                        }
                        if (this.clientSessionTimeout >= 0) {
                            instance3.getClientSessionContext().setSessionTimeout(this.clientSessionTimeout);
                        }
                        if (this.serverSessionCacheSize >= 0) {
                            instance3.getServerSessionContext().setSessionCacheSize(this.serverSessionCacheSize);
                        }
                        if (this.serverSessionTimeout >= 0) {
                            instance3.getServerSessionContext().setSessionTimeout(this.serverSessionTimeout);
                        }
                        return instance3;
                    }
                }
                instance2 = trustManagerFactory;
                if (instance == null) {
                    keyManagers = null;
                } else {
                    instance.init(this.keyManagerFactoryKeyStore, this.keyManagerFactoryKeyStorePassword);
                    keyManagers = instance.getKeyManagers();
                }
                if (instance2 != null) {
                    if (this.trustManagerFactoryParameters == null) {
                        instance2.init(this.trustManagerFactoryKeyStore);
                    } else {
                        instance2.init(this.trustManagerFactoryParameters);
                    }
                    trustManagerArr = instance2.getTrustManagers();
                }
                if (this.provider != null) {
                    instance3 = SSLContext.getInstance(this.protocol, this.provider);
                } else {
                    instance3 = SSLContext.getInstance(this.protocol);
                }
                instance3.init(keyManagers, trustManagerArr, this.secureRandom);
                if (this.clientSessionCacheSize >= 0) {
                    instance3.getClientSessionContext().setSessionCacheSize(this.clientSessionCacheSize);
                }
                if (this.clientSessionTimeout >= 0) {
                    instance3.getClientSessionContext().setSessionTimeout(this.clientSessionTimeout);
                }
                if (this.serverSessionCacheSize >= 0) {
                    instance3.getServerSessionContext().setSessionCacheSize(this.serverSessionCacheSize);
                }
                if (this.serverSessionTimeout >= 0) {
                    instance3.getServerSessionContext().setSessionTimeout(this.serverSessionTimeout);
                }
                return instance3;
            }
        }
        instance = keyManagerFactory;
        if (trustManagerFactory == null) {
            str = this.trustManagerFactoryAlgorithm;
            str = TrustManagerFactory.getDefaultAlgorithm();
            if (str != null) {
                if (this.trustManagerFactoryProvider != null) {
                    instance2 = TrustManagerFactory.getInstance(str, this.trustManagerFactoryProvider);
                } else {
                    instance2 = TrustManagerFactory.getInstance(str);
                }
                if (instance == null) {
                    instance.init(this.keyManagerFactoryKeyStore, this.keyManagerFactoryKeyStorePassword);
                    keyManagers = instance.getKeyManagers();
                } else {
                    keyManagers = null;
                }
                if (instance2 != null) {
                    if (this.trustManagerFactoryParameters == null) {
                        instance2.init(this.trustManagerFactoryParameters);
                    } else {
                        instance2.init(this.trustManagerFactoryKeyStore);
                    }
                    trustManagerArr = instance2.getTrustManagers();
                }
                if (this.provider != null) {
                    instance3 = SSLContext.getInstance(this.protocol);
                } else {
                    instance3 = SSLContext.getInstance(this.protocol, this.provider);
                }
                instance3.init(keyManagers, trustManagerArr, this.secureRandom);
                if (this.clientSessionCacheSize >= 0) {
                    instance3.getClientSessionContext().setSessionCacheSize(this.clientSessionCacheSize);
                }
                if (this.clientSessionTimeout >= 0) {
                    instance3.getClientSessionContext().setSessionTimeout(this.clientSessionTimeout);
                }
                if (this.serverSessionCacheSize >= 0) {
                    instance3.getServerSessionContext().setSessionCacheSize(this.serverSessionCacheSize);
                }
                if (this.serverSessionTimeout >= 0) {
                    instance3.getServerSessionContext().setSessionTimeout(this.serverSessionTimeout);
                }
                return instance3;
            }
        }
        instance2 = trustManagerFactory;
        if (instance == null) {
            keyManagers = null;
        } else {
            instance.init(this.keyManagerFactoryKeyStore, this.keyManagerFactoryKeyStorePassword);
            keyManagers = instance.getKeyManagers();
        }
        if (instance2 != null) {
            if (this.trustManagerFactoryParameters == null) {
                instance2.init(this.trustManagerFactoryKeyStore);
            } else {
                instance2.init(this.trustManagerFactoryParameters);
            }
            trustManagerArr = instance2.getTrustManagers();
        }
        if (this.provider != null) {
            instance3 = SSLContext.getInstance(this.protocol, this.provider);
        } else {
            instance3 = SSLContext.getInstance(this.protocol);
        }
        instance3.init(keyManagers, trustManagerArr, this.secureRandom);
        if (this.clientSessionCacheSize >= 0) {
            instance3.getClientSessionContext().setSessionCacheSize(this.clientSessionCacheSize);
        }
        if (this.clientSessionTimeout >= 0) {
            instance3.getClientSessionContext().setSessionTimeout(this.clientSessionTimeout);
        }
        if (this.serverSessionCacheSize >= 0) {
            instance3.getServerSessionContext().setSessionCacheSize(this.serverSessionCacheSize);
        }
        if (this.serverSessionTimeout >= 0) {
            instance3.getServerSessionContext().setSessionTimeout(this.serverSessionTimeout);
        }
        return instance3;
    }

    public void setProvider(String str) {
        this.provider = str;
    }

    public void setProtocol(String str) {
        if (str == null) {
            throw new IllegalArgumentException("protocol");
        }
        this.protocol = str;
    }

    public void setKeyManagerFactoryAlgorithmUseDefault(boolean z) {
        this.keyManagerFactoryAlgorithmUseDefault = z;
    }

    public void setTrustManagerFactoryAlgorithmUseDefault(boolean z) {
        this.trustManagerFactoryAlgorithmUseDefault = z;
    }

    public void setKeyManagerFactory(KeyManagerFactory keyManagerFactory) {
        this.keyManagerFactory = keyManagerFactory;
    }

    public void setKeyManagerFactoryAlgorithm(String str) {
        this.keyManagerFactoryAlgorithm = str;
    }

    public void setKeyManagerFactoryProvider(String str) {
        this.keyManagerFactoryProvider = str;
    }

    public void setKeyManagerFactoryKeyStore(KeyStore keyStore) {
        this.keyManagerFactoryKeyStore = keyStore;
    }

    public void setKeyManagerFactoryKeyStorePassword(String str) {
        if (str != null) {
            this.keyManagerFactoryKeyStorePassword = str.toCharArray();
        } else {
            this.keyManagerFactoryKeyStorePassword = null;
        }
    }

    public void setTrustManagerFactory(TrustManagerFactory trustManagerFactory) {
        this.trustManagerFactory = trustManagerFactory;
    }

    public void setTrustManagerFactoryAlgorithm(String str) {
        this.trustManagerFactoryAlgorithm = str;
    }

    public void setTrustManagerFactoryKeyStore(KeyStore keyStore) {
        this.trustManagerFactoryKeyStore = keyStore;
    }

    public void setTrustManagerFactoryParameters(ManagerFactoryParameters managerFactoryParameters) {
        this.trustManagerFactoryParameters = managerFactoryParameters;
    }

    public void setTrustManagerFactoryProvider(String str) {
        this.trustManagerFactoryProvider = str;
    }

    public void setSecureRandom(SecureRandom secureRandom) {
        this.secureRandom = secureRandom;
    }

    public void setClientSessionCacheSize(int i) {
        this.clientSessionCacheSize = i;
    }

    public void setClientSessionTimeout(int i) {
        this.clientSessionTimeout = i;
    }

    public void setServerSessionCacheSize(int i) {
        this.serverSessionCacheSize = i;
    }

    public void setServerSessionTimeout(int i) {
        this.serverSessionTimeout = i;
    }
}
