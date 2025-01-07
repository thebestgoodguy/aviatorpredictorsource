package x3;

/* loaded from: classes.dex */
public final class c extends x3.a {

    /* renamed from: i, reason: collision with root package name */
    public static final a f8304i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    private static final c f8305j = new c(1, 0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final c a() {
            return c.f8305j;
        }
    }

    public c(int r22, int r32) {
        super(r22, r32, 1);
    }

    @Override // x3.a
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (i() != cVar.i() || p() != cVar.p()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // x3.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (i() * 31) + p();
    }

    @Override // x3.a
    public boolean isEmpty() {
        return i() > p();
    }

    public Integer t() {
        return Integer.valueOf(p());
    }

    @Override // x3.a
    public String toString() {
        return i() + ".." + p();
    }

    public Integer u() {
        return Integer.valueOf(i());
    }
}
