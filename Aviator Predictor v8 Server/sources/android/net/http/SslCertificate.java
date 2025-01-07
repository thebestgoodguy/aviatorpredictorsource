package android.net.http;

import android.os.Bundle;
import java.security.cert.X509Certificate;
import java.util.Date;

/* loaded from: classes.dex */
public class SslCertificate {

    public class DName {
        public DName(String dName) {
            throw new RuntimeException("Stub!");
        }

        public String getDName() {
            throw new RuntimeException("Stub!");
        }

        public String getCName() {
            throw new RuntimeException("Stub!");
        }

        public String getOName() {
            throw new RuntimeException("Stub!");
        }

        public String getUName() {
            throw new RuntimeException("Stub!");
        }
    }

    @Deprecated
    public SslCertificate(String issuedTo, String issuedBy, String validNotBefore, String validNotAfter) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public SslCertificate(String issuedTo, String issuedBy, Date validNotBefore, Date validNotAfter) {
        throw new RuntimeException("Stub!");
    }

    public SslCertificate(X509Certificate certificate) {
        throw new RuntimeException("Stub!");
    }

    public static Bundle saveState(SslCertificate certificate) {
        throw new RuntimeException("Stub!");
    }

    public static SslCertificate restoreState(Bundle bundle) {
        throw new RuntimeException("Stub!");
    }

    public Date getValidNotBeforeDate() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public String getValidNotBefore() {
        throw new RuntimeException("Stub!");
    }

    public Date getValidNotAfterDate() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public String getValidNotAfter() {
        throw new RuntimeException("Stub!");
    }

    public DName getIssuedTo() {
        throw new RuntimeException("Stub!");
    }

    public DName getIssuedBy() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
