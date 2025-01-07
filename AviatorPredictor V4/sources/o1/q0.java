package o1;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.protobuf.j f6888a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f6889b;

    /* renamed from: c, reason: collision with root package name */
    private final c1.e<l1.l> f6890c;

    /* renamed from: d, reason: collision with root package name */
    private final c1.e<l1.l> f6891d;

    /* renamed from: e, reason: collision with root package name */
    private final c1.e<l1.l> f6892e;

    public q0(com.google.protobuf.j jVar, boolean z4, c1.e<l1.l> eVar, c1.e<l1.l> eVar2, c1.e<l1.l> eVar3) {
        this.f6888a = jVar;
        this.f6889b = z4;
        this.f6890c = eVar;
        this.f6891d = eVar2;
        this.f6892e = eVar3;
    }

    public static q0 a(boolean z4) {
        return new q0(com.google.protobuf.j.f2914f, z4, l1.l.i(), l1.l.i(), l1.l.i());
    }

    public c1.e<l1.l> b() {
        return this.f6890c;
    }

    public c1.e<l1.l> c() {
        return this.f6891d;
    }

    public c1.e<l1.l> d() {
        return this.f6892e;
    }

    public com.google.protobuf.j e() {
        return this.f6888a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q0.class != obj.getClass()) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (this.f6889b == q0Var.f6889b && this.f6888a.equals(q0Var.f6888a) && this.f6890c.equals(q0Var.f6890c) && this.f6891d.equals(q0Var.f6891d)) {
            return this.f6892e.equals(q0Var.f6892e);
        }
        return false;
    }

    public boolean f() {
        return this.f6889b;
    }

    public int hashCode() {
        return (((((((this.f6888a.hashCode() * 31) + (this.f6889b ? 1 : 0)) * 31) + this.f6890c.hashCode()) * 31) + this.f6891d.hashCode()) * 31) + this.f6892e.hashCode();
    }
}
