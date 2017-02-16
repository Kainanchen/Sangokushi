package org.apache.mina.filter.ssl;

import java.security.KeyStore;
import java.security.Provider;
import java.security.cert.X509Certificate;
import javax.net.ssl.ManagerFactoryParameters;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.TrustManagerFactorySpi;
import javax.net.ssl.X509TrustManager;
import org.cocos2dx.lib.BuildConfig;

public class BogusTrustManagerFactory extends TrustManagerFactory {
    private static final X509TrustManager X509;
    private static final TrustManager[] X509_MANAGERS;

    /* renamed from: org.apache.mina.filter.ssl.BogusTrustManagerFactory.1 */
    class C04471 extends Provider {
        private static final long serialVersionUID = -4024169055312053827L;

        C04471(String str, double d, String str2) {
            super(str, d, str2);
        }
    }

    /* renamed from: org.apache.mina.filter.ssl.BogusTrustManagerFactory.2 */
    static class C04482 implements X509TrustManager {
        C04482() {
        }

        public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        public final X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    private static class BogusTrustManagerFactorySpi extends TrustManagerFactorySpi {
        private BogusTrustManagerFactorySpi() {
        }

        protected TrustManager[] engineGetTrustManagers() {
            return BogusTrustManagerFactory.X509_MANAGERS;
        }

        protected void engineInit(KeyStore keyStore) {
        }

        protected void engineInit(ManagerFactoryParameters managerFactoryParameters) {
        }
    }

    public BogusTrustManagerFactory() {
        super(new BogusTrustManagerFactorySpi(), new C04471("MinaBogus", 1.0d, BuildConfig.FLAVOR), "MinaBogus");
    }

    static {
        X509 = new C04482();
        X509_MANAGERS = new TrustManager[]{X509};
    }
}
