package f3;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private int f3777a;

    /* renamed from: b, reason: collision with root package name */
    private int f3778b;

    /* renamed from: c, reason: collision with root package name */
    private int f3779c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f3780d = new int[10];

    public int a(int r22) {
        return this.f3780d[r22];
    }

    int b() {
        if ((this.f3777a & 2) != 0) {
            return this.f3780d[1];
        }
        return -1;
    }

    int c(int r22) {
        return (this.f3777a & 32) != 0 ? this.f3780d[5] : r22;
    }

    public boolean d(int r32) {
        return ((1 << r32) & this.f3777a) != 0;
    }

    public i e(int r5, int r6, int r7) {
        int[] r02 = this.f3780d;
        if (r5 >= r02.length) {
            return this;
        }
        int r12 = 1 << r5;
        this.f3777a |= r12;
        this.f3778b = (r6 & 1) != 0 ? this.f3778b | r12 : this.f3778b & (~r12);
        this.f3779c = (r6 & 2) != 0 ? this.f3779c | r12 : this.f3779c & (~r12);
        r02[r5] = r7;
        return this;
    }

    int f() {
        return Integer.bitCount(this.f3777a);
    }
}
