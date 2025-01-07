package e;

/* loaded from: classes.dex */
public class f<E> implements Cloneable {

    /* renamed from: i, reason: collision with root package name */
    private static final Object f3471i = new Object();

    /* renamed from: e, reason: collision with root package name */
    private boolean f3472e;

    /* renamed from: f, reason: collision with root package name */
    private int[] f3473f;

    /* renamed from: g, reason: collision with root package name */
    private Object[] f3474g;

    /* renamed from: h, reason: collision with root package name */
    private int f3475h;

    public f() {
        this(10);
    }

    public f(int r22) {
        this.f3472e = false;
        if (r22 == 0) {
            this.f3473f = c.f3446a;
            this.f3474g = c.f3448c;
        } else {
            int d5 = c.d(r22);
            this.f3473f = new int[d5];
            this.f3474g = new Object[d5];
        }
    }

    private void c() {
        int r02 = this.f3475h;
        int[] r12 = this.f3473f;
        Object[] objArr = this.f3474g;
        int r5 = 0;
        for (int r4 = 0; r4 < r02; r4++) {
            Object obj = objArr[r4];
            if (obj != f3471i) {
                if (r4 != r5) {
                    r12[r5] = r12[r4];
                    objArr[r5] = obj;
                    objArr[r4] = null;
                }
                r5++;
            }
        }
        this.f3472e = false;
        this.f3475h = r5;
    }

    public void a() {
        int r02 = this.f3475h;
        Object[] objArr = this.f3474g;
        for (int r32 = 0; r32 < r02; r32++) {
            objArr[r32] = null;
        }
        this.f3475h = 0;
        this.f3472e = false;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f<E> clone() {
        try {
            f<E> fVar = (f) super.clone();
            fVar.f3473f = (int[]) this.f3473f.clone();
            fVar.f3474g = (Object[]) this.f3474g.clone();
            return fVar;
        } catch (CloneNotSupportedException e5) {
            throw new AssertionError(e5);
        }
    }

    public E d(int r22) {
        return e(r22, null);
    }

    public E e(int r4, E e5) {
        int a5 = c.a(this.f3473f, this.f3475h, r4);
        if (a5 >= 0) {
            Object[] objArr = this.f3474g;
            if (objArr[a5] != f3471i) {
                return (E) objArr[a5];
            }
        }
        return e5;
    }

    public int f(int r32) {
        if (this.f3472e) {
            c();
        }
        return c.a(this.f3473f, this.f3475h, r32);
    }

    public int g(int r22) {
        if (this.f3472e) {
            c();
        }
        return this.f3473f[r22];
    }

    public void h(int r7, E e5) {
        int a5 = c.a(this.f3473f, this.f3475h, r7);
        if (a5 >= 0) {
            this.f3474g[a5] = e5;
            return;
        }
        int r02 = ~a5;
        int r12 = this.f3475h;
        if (r02 < r12) {
            Object[] objArr = this.f3474g;
            if (objArr[r02] == f3471i) {
                this.f3473f[r02] = r7;
                objArr[r02] = e5;
                return;
            }
        }
        if (this.f3472e && r12 >= this.f3473f.length) {
            c();
            r02 = ~c.a(this.f3473f, this.f3475h, r7);
        }
        int r13 = this.f3475h;
        if (r13 >= this.f3473f.length) {
            int d5 = c.d(r13 + 1);
            int[] r22 = new int[d5];
            Object[] objArr2 = new Object[d5];
            int[] r32 = this.f3473f;
            System.arraycopy(r32, 0, r22, 0, r32.length);
            Object[] objArr3 = this.f3474g;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f3473f = r22;
            this.f3474g = objArr2;
        }
        int r14 = this.f3475h;
        if (r14 - r02 != 0) {
            int[] r23 = this.f3473f;
            int r33 = r02 + 1;
            System.arraycopy(r23, r02, r23, r33, r14 - r02);
            Object[] objArr4 = this.f3474g;
            System.arraycopy(objArr4, r02, objArr4, r33, this.f3475h - r02);
        }
        this.f3473f[r02] = r7;
        this.f3474g[r02] = e5;
        this.f3475h++;
    }

    public void j(int r4) {
        int a5 = c.a(this.f3473f, this.f3475h, r4);
        if (a5 >= 0) {
            Object[] objArr = this.f3474g;
            Object obj = objArr[a5];
            Object obj2 = f3471i;
            if (obj != obj2) {
                objArr[a5] = obj2;
                this.f3472e = true;
            }
        }
    }

    public int k() {
        if (this.f3472e) {
            c();
        }
        return this.f3475h;
    }

    public E l(int r22) {
        if (this.f3472e) {
            c();
        }
        return (E) this.f3474g[r22];
    }

    public String toString() {
        if (k() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3475h * 28);
        sb.append('{');
        for (int r12 = 0; r12 < this.f3475h; r12++) {
            if (r12 > 0) {
                sb.append(", ");
            }
            sb.append(g(r12));
            sb.append('=');
            E l4 = l(r12);
            if (l4 != this) {
                sb.append(l4);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
