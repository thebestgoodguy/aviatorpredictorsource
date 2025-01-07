package i1;

/* loaded from: classes.dex */
public class n1 {

    /* renamed from: a, reason: collision with root package name */
    private final m1 f4171a;

    /* renamed from: b, reason: collision with root package name */
    private final l1.r f4172b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4173c;

    private n1(m1 m1Var, l1.r rVar, boolean z4) {
        this.f4171a = m1Var;
        this.f4172b = rVar;
        this.f4173c = z4;
    }

    /* synthetic */ n1(m1 m1Var, l1.r rVar, boolean z4, l1 l1Var) {
        this(m1Var, rVar, z4);
    }

    private void k() {
        if (this.f4172b == null) {
            return;
        }
        for (int r02 = 0; r02 < this.f4172b.s(); r02++) {
            l(this.f4172b.p(r02));
        }
    }

    private void l(String str) {
        if (str.isEmpty()) {
            throw f("Document fields must not be empty");
        }
        if (j() && str.startsWith("__") && str.endsWith("__")) {
            throw f("Document fields cannot begin and end with \"__\"");
        }
    }

    public void a(l1.r rVar) {
        this.f4171a.b(rVar);
    }

    public void b(l1.r rVar, m1.p pVar) {
        this.f4171a.c(rVar, pVar);
    }

    public n1 c(int r4) {
        return new n1(this.f4171a, null, true);
    }

    public n1 d(String str) {
        l1.r rVar = this.f4172b;
        n1 n1Var = new n1(this.f4171a, rVar == null ? null : rVar.d(str), false);
        n1Var.l(str);
        return n1Var;
    }

    public n1 e(l1.r rVar) {
        l1.r rVar2 = this.f4172b;
        n1 n1Var = new n1(this.f4171a, rVar2 == null ? null : rVar2.g(rVar), false);
        n1Var.k();
        return n1Var;
    }

    public RuntimeException f(String str) {
        String str2;
        l1.r rVar = this.f4172b;
        if (rVar == null || rVar.q()) {
            str2 = "";
        } else {
            str2 = " (found in field " + this.f4172b.toString() + ")";
        }
        return new IllegalArgumentException("Invalid data. " + str + str2);
    }

    public q1 g() {
        q1 q1Var;
        q1Var = this.f4171a.f4160a;
        return q1Var;
    }

    public l1.r h() {
        return this.f4172b;
    }

    public boolean i() {
        return this.f4173c;
    }

    public boolean j() {
        q1 q1Var;
        q1 q1Var2;
        int[] r02 = l1.f4155a;
        q1Var = this.f4171a.f4160a;
        int r03 = r02[q1Var.ordinal()];
        if (r03 == 1 || r03 == 2 || r03 == 3) {
            return true;
        }
        if (r03 == 4 || r03 == 5) {
            return false;
        }
        q1Var2 = this.f4171a.f4160a;
        throw p1.b.a("Unexpected case for UserDataSource: %s", q1Var2.name());
    }
}
