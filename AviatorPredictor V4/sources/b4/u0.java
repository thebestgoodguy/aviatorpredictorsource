package b4;

import k3.m;

/* loaded from: classes.dex */
public abstract class u0<T> extends kotlinx.coroutines.scheduling.i {

    /* renamed from: g, reason: collision with root package name */
    public int f1052g;

    public u0(int r12) {
        this.f1052g = r12;
    }

    public void a(Object obj, Throwable th) {
    }

    public abstract n3.d<T> c();

    public Throwable d(Object obj) {
        z zVar = obj instanceof z ? (z) obj : null;
        if (zVar == null) {
            return null;
        }
        return zVar.f1086a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T e(Object obj) {
        return obj;
    }

    public final void g(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            k3.b.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.i.b(th);
        i0.a(c().getContext(), new p0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() {
        Object a5;
        Object a6;
        Object a7;
        if (q0.a()) {
            if (!(this.f1052g != -1)) {
                throw new AssertionError();
            }
        }
        kotlinx.coroutines.scheduling.j jVar = this.f6511f;
        try {
            kotlinx.coroutines.internal.f fVar = (kotlinx.coroutines.internal.f) c();
            n3.d<T> dVar = fVar.f6416i;
            Object obj = fVar.f6418k;
            n3.g context = dVar.getContext();
            Object c5 = kotlinx.coroutines.internal.c0.c(context, obj);
            i2<?> e5 = c5 != kotlinx.coroutines.internal.c0.f6404a ? f0.e(dVar, context, c5) : null;
            try {
                n3.g context2 = dVar.getContext();
                Object h5 = h();
                Throwable d5 = d(h5);
                p1 p1Var = (d5 == null && v0.b(this.f1052g)) ? (p1) context2.get(p1.f1038a) : null;
                if (p1Var != null && !p1Var.e()) {
                    Throwable l4 = p1Var.l();
                    a(h5, l4);
                    m.a aVar = k3.m.f6368e;
                    if (q0.d() && (dVar instanceof kotlin.coroutines.jvm.internal.e)) {
                        l4 = kotlinx.coroutines.internal.x.j(l4, (kotlin.coroutines.jvm.internal.e) dVar);
                    }
                    a6 = k3.m.a(k3.n.a(l4));
                } else if (d5 != null) {
                    m.a aVar2 = k3.m.f6368e;
                    a6 = k3.m.a(k3.n.a(d5));
                } else {
                    T e6 = e(h5);
                    m.a aVar3 = k3.m.f6368e;
                    a6 = k3.m.a(e6);
                }
                dVar.resumeWith(a6);
                k3.s sVar = k3.s.f6374a;
                try {
                    m.a aVar4 = k3.m.f6368e;
                    jVar.C();
                    a7 = k3.m.a(sVar);
                } catch (Throwable th) {
                    m.a aVar5 = k3.m.f6368e;
                    a7 = k3.m.a(k3.n.a(th));
                }
                g(null, k3.m.b(a7));
            } finally {
                if (e5 == null || e5.y0()) {
                    kotlinx.coroutines.internal.c0.a(context, c5);
                }
            }
        } catch (Throwable th2) {
            try {
                m.a aVar6 = k3.m.f6368e;
                jVar.C();
                a5 = k3.m.a(k3.s.f6374a);
            } catch (Throwable th3) {
                m.a aVar7 = k3.m.f6368e;
                a5 = k3.m.a(k3.n.a(th3));
            }
            g(th2, k3.m.b(a5));
        }
    }
}
