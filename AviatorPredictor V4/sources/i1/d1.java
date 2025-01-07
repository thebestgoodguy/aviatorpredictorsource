package i1;

/* loaded from: classes.dex */
public class d1 {

    /* renamed from: a, reason: collision with root package name */
    private int f4073a;

    /* renamed from: b, reason: collision with root package name */
    private int f4074b;

    d1(int r6, int r7) {
        p1.b.d((r6 & 1) == r6, "Generator ID %d contains more than %d reserved bits", Integer.valueOf(r6), 1);
        this.f4074b = r6;
        d(r7);
    }

    public static d1 a() {
        return new d1(1, 1);
    }

    public static d1 b(int r22) {
        d1 d1Var = new d1(0, r22);
        d1Var.c();
        return d1Var;
    }

    private void d(int r4) {
        p1.b.d((r4 & 1) == this.f4074b, "Cannot supply target ID from different generator ID", new Object[0]);
        this.f4073a = r4;
    }

    public int c() {
        int r02 = this.f4073a;
        this.f4073a = r02 + 2;
        return r02;
    }
}
