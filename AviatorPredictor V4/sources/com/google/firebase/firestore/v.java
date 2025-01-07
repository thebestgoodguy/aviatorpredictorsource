package com.google.firebase.firestore;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final String f2752a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f2753b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f2754c;

    /* renamed from: d, reason: collision with root package name */
    private final long f2755d;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private String f2756a = "firestore.googleapis.com";

        /* renamed from: b, reason: collision with root package name */
        private boolean f2757b = true;

        /* renamed from: c, reason: collision with root package name */
        private boolean f2758c = true;

        /* renamed from: d, reason: collision with root package name */
        private long f2759d = 104857600;

        public v e() {
            if (this.f2757b || !this.f2756a.equals("firestore.googleapis.com")) {
                return new v(this);
            }
            throw new IllegalStateException("You can't set the 'sslEnabled' setting unless you also set a non-default 'host'.");
        }

        public b f(long j4) {
            if (j4 != -1 && j4 < 1048576) {
                throw new IllegalArgumentException("Cache size must be set to at least 1048576 bytes");
            }
            this.f2759d = j4;
            return this;
        }

        public b g(String str) {
            this.f2756a = (String) p1.x.c(str, "Provided host must not be null.");
            return this;
        }

        public b h(boolean z4) {
            this.f2758c = z4;
            return this;
        }

        public b i(boolean z4) {
            this.f2757b = z4;
            return this;
        }
    }

    private v(b bVar) {
        this.f2752a = bVar.f2756a;
        this.f2753b = bVar.f2757b;
        this.f2754c = bVar.f2758c;
        this.f2755d = bVar.f2759d;
    }

    public long a() {
        return this.f2755d;
    }

    public String b() {
        return this.f2752a;
    }

    public boolean c() {
        return this.f2754c;
    }

    public boolean d() {
        return this.f2753b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        return this.f2752a.equals(vVar.f2752a) && this.f2753b == vVar.f2753b && this.f2754c == vVar.f2754c && this.f2755d == vVar.f2755d;
    }

    public int hashCode() {
        return (((((this.f2752a.hashCode() * 31) + (this.f2753b ? 1 : 0)) * 31) + (this.f2754c ? 1 : 0)) * 31) + ((int) this.f2755d);
    }

    public String toString() {
        return "FirebaseFirestoreSettings{host=" + this.f2752a + ", sslEnabled=" + this.f2753b + ", persistenceEnabled=" + this.f2754c + ", cacheSizeBytes=" + this.f2755d + "}";
    }
}
