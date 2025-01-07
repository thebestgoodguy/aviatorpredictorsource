package x3;

import l3.v;

/* loaded from: classes.dex */
public class a implements Iterable<Integer> {

    /* renamed from: h, reason: collision with root package name */
    public static final C0106a f8296h = new C0106a(null);

    /* renamed from: e, reason: collision with root package name */
    private final int f8297e;

    /* renamed from: f, reason: collision with root package name */
    private final int f8298f;

    /* renamed from: g, reason: collision with root package name */
    private final int f8299g;

    /* renamed from: x3.a$a, reason: collision with other inner class name */
    public static final class C0106a {
        private C0106a() {
        }

        public /* synthetic */ C0106a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final a a(int r22, int r32, int r4) {
            return new a(r22, r32, r4);
        }
    }

    public a(int r22, int r32, int r4) {
        if (r4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (r4 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f8297e = r22;
        this.f8298f = p3.c.b(r22, r32, r4);
        this.f8299g = r4;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f8297e != aVar.f8297e || this.f8298f != aVar.f8298f || this.f8299g != aVar.f8299g) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f8297e * 31) + this.f8298f) * 31) + this.f8299g;
    }

    public final int i() {
        return this.f8297e;
    }

    public boolean isEmpty() {
        if (this.f8299g > 0) {
            if (this.f8297e > this.f8298f) {
                return true;
            }
        } else if (this.f8297e < this.f8298f) {
            return true;
        }
        return false;
    }

    public final int p() {
        return this.f8298f;
    }

    public final int q() {
        return this.f8299g;
    }

    @Override // java.lang.Iterable
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public v iterator() {
        return new b(this.f8297e, this.f8298f, this.f8299g);
    }

    public String toString() {
        StringBuilder sb;
        int r12;
        if (this.f8299g > 0) {
            sb = new StringBuilder();
            sb.append(this.f8297e);
            sb.append("..");
            sb.append(this.f8298f);
            sb.append(" step ");
            r12 = this.f8299g;
        } else {
            sb = new StringBuilder();
            sb.append(this.f8297e);
            sb.append(" downTo ");
            sb.append(this.f8298f);
            sb.append(" step ");
            r12 = -this.f8299g;
        }
        sb.append(r12);
        return sb.toString();
    }
}
