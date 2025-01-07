package i1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class q extends r {

    /* renamed from: a, reason: collision with root package name */
    private final b f4193a;

    /* renamed from: b, reason: collision with root package name */
    private final x1.x f4194b;

    /* renamed from: c, reason: collision with root package name */
    private final l1.r f4195c;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4196a;

        static {
            int[] r02 = new int[b.values().length];
            f4196a = r02;
            try {
                r02[b.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4196a[b.LESS_THAN_OR_EQUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4196a[b.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4196a[b.NOT_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4196a[b.GREATER_THAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4196a[b.GREATER_THAN_OR_EQUAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum b {
        LESS_THAN("<"),
        LESS_THAN_OR_EQUAL("<="),
        EQUAL("=="),
        NOT_EQUAL("!="),
        GREATER_THAN(">"),
        GREATER_THAN_OR_EQUAL(">="),
        ARRAY_CONTAINS("array_contains"),
        ARRAY_CONTAINS_ANY("array_contains_any"),
        IN("in"),
        NOT_IN("not_in");


        /* renamed from: e, reason: collision with root package name */
        private final String f4208e;

        b(String str) {
            this.f4208e = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f4208e;
        }
    }

    protected q(l1.r rVar, b bVar, x1.x xVar) {
        this.f4195c = rVar;
        this.f4193a = bVar;
        this.f4194b = xVar;
    }

    public static q f(l1.r rVar, b bVar, x1.x xVar) {
        if (!rVar.z()) {
            return bVar == b.ARRAY_CONTAINS ? new f(rVar, xVar) : bVar == b.IN ? new m0(rVar, xVar) : bVar == b.ARRAY_CONTAINS_ANY ? new e(rVar, xVar) : bVar == b.NOT_IN ? new u0(rVar, xVar) : new q(rVar, bVar, xVar);
        }
        if (bVar == b.IN) {
            return new o0(rVar, xVar);
        }
        if (bVar == b.NOT_IN) {
            return new p0(rVar, xVar);
        }
        p1.b.d((bVar == b.ARRAY_CONTAINS || bVar == b.ARRAY_CONTAINS_ANY) ? false : true, bVar.toString() + "queries don't make sense on document keys", new Object[0]);
        return new n0(rVar, bVar, xVar);
    }

    @Override // i1.r
    public String a() {
        return g().h() + h().toString() + l1.y.b(i());
    }

    @Override // i1.r
    public List<r> b() {
        return Collections.singletonList(this);
    }

    @Override // i1.r
    public l1.r c() {
        if (j()) {
            return g();
        }
        return null;
    }

    @Override // i1.r
    public List<q> d() {
        return Collections.singletonList(this);
    }

    @Override // i1.r
    public boolean e(l1.i iVar) {
        x1.x f5 = iVar.f(this.f4195c);
        return this.f4193a == b.NOT_EQUAL ? f5 != null && k(l1.y.i(f5, this.f4194b)) : f5 != null && l1.y.G(f5) == l1.y.G(this.f4194b) && k(l1.y.i(f5, this.f4194b));
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f4193a == qVar.f4193a && this.f4195c.equals(qVar.f4195c) && this.f4194b.equals(qVar.f4194b);
    }

    public l1.r g() {
        return this.f4195c;
    }

    public b h() {
        return this.f4193a;
    }

    public int hashCode() {
        return ((((1147 + this.f4193a.hashCode()) * 31) + this.f4195c.hashCode()) * 31) + this.f4194b.hashCode();
    }

    public x1.x i() {
        return this.f4194b;
    }

    public boolean j() {
        return Arrays.asList(b.LESS_THAN, b.LESS_THAN_OR_EQUAL, b.GREATER_THAN, b.GREATER_THAN_OR_EQUAL, b.NOT_EQUAL, b.NOT_IN).contains(this.f4193a);
    }

    protected boolean k(int r4) {
        switch (a.f4196a[this.f4193a.ordinal()]) {
            case 1:
                return r4 < 0;
            case 2:
                return r4 <= 0;
            case 3:
                return r4 == 0;
            case 4:
                return r4 != 0;
            case 5:
                return r4 > 0;
            case 6:
                return r4 >= 0;
            default:
                throw p1.b.a("Unknown FieldFilter operator: %s", this.f4193a);
        }
    }

    public String toString() {
        return a();
    }
}
