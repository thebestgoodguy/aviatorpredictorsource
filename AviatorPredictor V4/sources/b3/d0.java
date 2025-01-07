package b3;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f723a;

    /* renamed from: b, reason: collision with root package name */
    public final b f724b;

    /* renamed from: c, reason: collision with root package name */
    public final long f725c;

    /* renamed from: d, reason: collision with root package name */
    public final l0 f726d;

    /* renamed from: e, reason: collision with root package name */
    public final l0 f727e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f728a;

        /* renamed from: b, reason: collision with root package name */
        private b f729b;

        /* renamed from: c, reason: collision with root package name */
        private Long f730c;

        /* renamed from: d, reason: collision with root package name */
        private l0 f731d;

        /* renamed from: e, reason: collision with root package name */
        private l0 f732e;

        public d0 a() {
            q0.l.o(this.f728a, "description");
            q0.l.o(this.f729b, "severity");
            q0.l.o(this.f730c, "timestampNanos");
            q0.l.u(this.f731d == null || this.f732e == null, "at least one of channelRef and subchannelRef must be null");
            return new d0(this.f728a, this.f729b, this.f730c.longValue(), this.f731d, this.f732e);
        }

        public a b(String str) {
            this.f728a = str;
            return this;
        }

        public a c(b bVar) {
            this.f729b = bVar;
            return this;
        }

        public a d(l0 l0Var) {
            this.f732e = l0Var;
            return this;
        }

        public a e(long j4) {
            this.f730c = Long.valueOf(j4);
            return this;
        }
    }

    public enum b {
        CT_UNKNOWN,
        CT_INFO,
        CT_WARNING,
        CT_ERROR
    }

    private d0(String str, b bVar, long j4, l0 l0Var, l0 l0Var2) {
        this.f723a = str;
        this.f724b = (b) q0.l.o(bVar, "severity");
        this.f725c = j4;
        this.f726d = l0Var;
        this.f727e = l0Var2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return q0.i.a(this.f723a, d0Var.f723a) && q0.i.a(this.f724b, d0Var.f724b) && this.f725c == d0Var.f725c && q0.i.a(this.f726d, d0Var.f726d) && q0.i.a(this.f727e, d0Var.f727e);
    }

    public int hashCode() {
        return q0.i.b(this.f723a, this.f724b, Long.valueOf(this.f725c), this.f726d, this.f727e);
    }

    public String toString() {
        return q0.h.c(this).d("description", this.f723a).d("severity", this.f724b).c("timestampNanos", this.f725c).d("channelRef", this.f726d).d("subchannelRef", this.f727e).toString();
    }
}
