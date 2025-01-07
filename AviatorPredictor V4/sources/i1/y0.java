package i1;

import i1.n;
import i1.p;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class y0 {

    /* renamed from: a, reason: collision with root package name */
    private final x0 f4295a;

    /* renamed from: b, reason: collision with root package name */
    private final p.a f4296b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.firestore.j<u1> f4297c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4298d = false;

    /* renamed from: e, reason: collision with root package name */
    private v0 f4299e = v0.UNKNOWN;

    /* renamed from: f, reason: collision with root package name */
    private u1 f4300f;

    public y0(x0 x0Var, p.a aVar, com.google.firebase.firestore.j<u1> jVar) {
        this.f4295a = x0Var;
        this.f4297c = jVar;
        this.f4296b = aVar;
    }

    private void e(u1 u1Var) {
        p1.b.d(!this.f4298d, "Trying to raise initial event for second time", new Object[0]);
        u1 c5 = u1.c(u1Var.h(), u1Var.e(), u1Var.f(), u1Var.j(), u1Var.b());
        this.f4298d = true;
        this.f4297c.a(c5, null);
    }

    private boolean f(u1 u1Var) {
        if (!u1Var.d().isEmpty()) {
            return true;
        }
        u1 u1Var2 = this.f4300f;
        boolean z4 = (u1Var2 == null || u1Var2.i() == u1Var.i()) ? false : true;
        if (u1Var.a() || z4) {
            return this.f4296b.f4184b;
        }
        return false;
    }

    private boolean g(u1 u1Var, v0 v0Var) {
        p1.b.d(!this.f4298d, "Determining whether to raise first event but already had first event.", new Object[0]);
        if (!u1Var.j()) {
            return true;
        }
        v0 v0Var2 = v0.OFFLINE;
        boolean z4 = !v0Var.equals(v0Var2);
        if (!this.f4296b.f4185c || !z4) {
            return !u1Var.e().isEmpty() || v0Var.equals(v0Var2);
        }
        p1.b.d(u1Var.j(), "Waiting for sync, but snapshot is not from cache", new Object[0]);
        return false;
    }

    public x0 a() {
        return this.f4295a;
    }

    public void b(com.google.firebase.firestore.u uVar) {
        this.f4297c.a(null, uVar);
    }

    public boolean c(v0 v0Var) {
        this.f4299e = v0Var;
        u1 u1Var = this.f4300f;
        if (u1Var == null || this.f4298d || !g(u1Var, v0Var)) {
            return false;
        }
        e(this.f4300f);
        return true;
    }

    public boolean d(u1 u1Var) {
        boolean z4 = false;
        p1.b.d(!u1Var.d().isEmpty() || u1Var.a(), "We got a new snapshot with no changes?", new Object[0]);
        if (!this.f4296b.f4183a) {
            ArrayList arrayList = new ArrayList();
            for (n nVar : u1Var.d()) {
                if (nVar.c() != n.a.METADATA) {
                    arrayList.add(nVar);
                }
            }
            u1Var = new u1(u1Var.h(), u1Var.e(), u1Var.g(), arrayList, u1Var.j(), u1Var.f(), u1Var.a(), true);
        }
        if (this.f4298d) {
            if (f(u1Var)) {
                this.f4297c.a(u1Var, null);
                z4 = true;
            }
        } else if (g(u1Var, this.f4299e)) {
            e(u1Var);
            z4 = true;
        }
        this.f4300f = u1Var;
        return z4;
    }
}
