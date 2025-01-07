package android.net.http;

import java.io.IOException;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public class CertificateChainValidator {
    CertificateChainValidator() {
        throw new RuntimeException("Stub!");
    }

    public static CertificateChainValidator getInstance() {
        throw new RuntimeException("Stub!");
    }

    public SslError doHandshakeAndValidateServerCertificates(HttpsConnection connection, SSLSocket sslSocket, String domain) throws IOException {
        throw new RuntimeException("Stub!");
    }

    public static SslError verifyServerCertificates(byte[][] certChain, String domain, String authType) throws IOException {
        throw new RuntimeException("Stub!");
    }

    public static void handleTrustStorageUpdate() {
        throw new RuntimeException("Stub!");
    }
}
