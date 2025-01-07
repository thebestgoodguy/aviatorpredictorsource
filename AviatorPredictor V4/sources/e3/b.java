package e3;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    private static final e3.a[] f3545e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f3546f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f3547g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f3548h;

    /* renamed from: a, reason: collision with root package name */
    final boolean f3549a;

    /* renamed from: b, reason: collision with root package name */
    private final String[] f3550b;

    /* renamed from: c, reason: collision with root package name */
    private final String[] f3551c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f3552d;

    /* renamed from: e3.b$b, reason: collision with other inner class name */
    public static final class C0035b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f3553a;

        /* renamed from: b, reason: collision with root package name */
        private String[] f3554b;

        /* renamed from: c, reason: collision with root package name */
        private String[] f3555c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f3556d;

        public C0035b(b bVar) {
            this.f3553a = bVar.f3549a;
            this.f3554b = bVar.f3550b;
            this.f3555c = bVar.f3551c;
            this.f3556d = bVar.f3552d;
        }

        public C0035b(boolean z4) {
            this.f3553a = z4;
        }

        public b e() {
            return new b(this);
        }

        public C0035b f(e3.a... aVarArr) {
            if (!this.f3553a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[aVarArr.length];
            for (int r12 = 0; r12 < aVarArr.length; r12++) {
                strArr[r12] = aVarArr[r12].f3544e;
            }
            this.f3554b = strArr;
            return this;
        }

        public C0035b g(String... strArr) {
            if (!this.f3553a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr == null) {
                this.f3554b = null;
            } else {
                this.f3554b = (String[]) strArr.clone();
            }
            return this;
        }

        public C0035b h(boolean z4) {
            if (!this.f3553a) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.f3556d = z4;
            return this;
        }

        public C0035b i(h... hVarArr) {
            if (!this.f3553a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (hVarArr.length == 0) {
                throw new IllegalArgumentException("At least one TlsVersion is required");
            }
            String[] strArr = new String[hVarArr.length];
            for (int r12 = 0; r12 < hVarArr.length; r12++) {
                strArr[r12] = hVarArr[r12].f3606e;
            }
            this.f3555c = strArr;
            return this;
        }

        public C0035b j(String... strArr) {
            if (!this.f3553a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr == null) {
                this.f3555c = null;
            } else {
                this.f3555c = (String[]) strArr.clone();
            }
            return this;
        }
    }

    static {
        e3.a[] aVarArr = {e3.a.TLS_AES_128_GCM_SHA256, e3.a.TLS_AES_256_GCM_SHA384, e3.a.TLS_CHACHA20_POLY1305_SHA256, e3.a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, e3.a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, e3.a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, e3.a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, e3.a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, e3.a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, e3.a.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, e3.a.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, e3.a.TLS_RSA_WITH_AES_128_GCM_SHA256, e3.a.TLS_RSA_WITH_AES_256_GCM_SHA384, e3.a.TLS_RSA_WITH_AES_128_CBC_SHA, e3.a.TLS_RSA_WITH_AES_256_CBC_SHA, e3.a.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f3545e = aVarArr;
        C0035b f5 = new C0035b(true).f(aVarArr);
        h hVar = h.TLS_1_3;
        h hVar2 = h.TLS_1_2;
        b e5 = f5.i(hVar, hVar2).h(true).e();
        f3546f = e5;
        f3547g = new C0035b(e5).i(hVar, hVar2, h.TLS_1_1, h.TLS_1_0).h(true).e();
        f3548h = new C0035b(false).e();
    }

    private b(C0035b c0035b) {
        this.f3549a = c0035b.f3553a;
        this.f3550b = c0035b.f3554b;
        this.f3551c = c0035b.f3555c;
        this.f3552d = c0035b.f3556d;
    }

    private b e(SSLSocket sSLSocket, boolean z4) {
        String[] strArr;
        if (this.f3550b != null) {
            strArr = (String[]) i.c(String.class, this.f3550b, sSLSocket.getEnabledCipherSuites());
        } else {
            strArr = null;
        }
        if (z4 && Arrays.asList(sSLSocket.getSupportedCipherSuites()).contains("TLS_FALLBACK_SCSV")) {
            if (strArr == null) {
                strArr = sSLSocket.getEnabledCipherSuites();
            }
            int length = strArr.length + 1;
            String[] strArr2 = new String[length];
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            strArr2[length - 1] = "TLS_FALLBACK_SCSV";
            strArr = strArr2;
        }
        return new C0035b(this).g(strArr).j((String[]) i.c(String.class, this.f3551c, sSLSocket.getEnabledProtocols())).e();
    }

    public void c(SSLSocket sSLSocket, boolean z4) {
        b e5 = e(sSLSocket, z4);
        sSLSocket.setEnabledProtocols(e5.f3551c);
        String[] strArr = e5.f3550b;
        if (strArr != null) {
            sSLSocket.setEnabledCipherSuites(strArr);
        }
    }

    public List<e3.a> d() {
        String[] strArr = this.f3550b;
        if (strArr == null) {
            return null;
        }
        e3.a[] aVarArr = new e3.a[strArr.length];
        int r12 = 0;
        while (true) {
            String[] strArr2 = this.f3550b;
            if (r12 >= strArr2.length) {
                return i.a(aVarArr);
            }
            aVarArr[r12] = e3.a.d(strArr2[r12]);
            r12++;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        b bVar = (b) obj;
        boolean z4 = this.f3549a;
        if (z4 != bVar.f3549a) {
            return false;
        }
        return !z4 || (Arrays.equals(this.f3550b, bVar.f3550b) && Arrays.equals(this.f3551c, bVar.f3551c) && this.f3552d == bVar.f3552d);
    }

    public boolean f() {
        return this.f3552d;
    }

    public List<h> g() {
        h[] hVarArr = new h[this.f3551c.length];
        int r12 = 0;
        while (true) {
            String[] strArr = this.f3551c;
            if (r12 >= strArr.length) {
                return i.a(hVarArr);
            }
            hVarArr[r12] = h.d(strArr[r12]);
            r12++;
        }
    }

    public int hashCode() {
        if (this.f3549a) {
            return ((((527 + Arrays.hashCode(this.f3550b)) * 31) + Arrays.hashCode(this.f3551c)) * 31) + (!this.f3552d ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f3549a) {
            return "ConnectionSpec()";
        }
        List<e3.a> d5 = d();
        return "ConnectionSpec(cipherSuites=" + (d5 == null ? "[use default]" : d5.toString()) + ", tlsVersions=" + g() + ", supportsTlsExtensions=" + this.f3552d + ")";
    }
}
