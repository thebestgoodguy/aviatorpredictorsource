package i1;

import i1.b1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class p implements b1.c {

    /* renamed from: a, reason: collision with root package name */
    private final b1 f4179a;

    /* renamed from: c, reason: collision with root package name */
    private final Set<com.google.firebase.firestore.j<Void>> f4181c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private v0 f4182d = v0.UNKNOWN;

    /* renamed from: b, reason: collision with root package name */
    private final Map<x0, b> f4180b = new HashMap();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f4183a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f4184b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f4185c;
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final List<y0> f4186a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private u1 f4187b;

        /* renamed from: c, reason: collision with root package name */
        private int f4188c;

        b() {
        }
    }

    public p(b1 b1Var) {
        this.f4179a = b1Var;
        b1Var.w(this);
    }

    private void f() {
        Iterator<com.google.firebase.firestore.j<Void>> it = this.f4181c.iterator();
        while (it.hasNext()) {
            it.next().a(null, null);
        }
    }

    @Override // i1.b1.c
    public void a(v0 v0Var) {
        this.f4182d = v0Var;
        Iterator<b> it = this.f4180b.values().iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            Iterator it2 = it.next().f4186a.iterator();
            while (it2.hasNext()) {
                if (((y0) it2.next()).c(v0Var)) {
                    z4 = true;
                }
            }
        }
        if (z4) {
            f();
        }
    }

    @Override // i1.b1.c
    public void b(x0 x0Var, b3.f1 f1Var) {
        b bVar = this.f4180b.get(x0Var);
        if (bVar != null) {
            Iterator it = bVar.f4186a.iterator();
            while (it.hasNext()) {
                ((y0) it.next()).b(p1.g0.r(f1Var));
            }
        }
        this.f4180b.remove(x0Var);
    }

    @Override // i1.b1.c
    public void c(List<u1> list) {
        boolean z4 = false;
        for (u1 u1Var : list) {
            b bVar = this.f4180b.get(u1Var.h());
            if (bVar != null) {
                Iterator it = bVar.f4186a.iterator();
                while (it.hasNext()) {
                    if (((y0) it.next()).d(u1Var)) {
                        z4 = true;
                    }
                }
                bVar.f4187b = u1Var;
            }
        }
        if (z4) {
            f();
        }
    }

    public int d(y0 y0Var) {
        x0 a5 = y0Var.a();
        b bVar = this.f4180b.get(a5);
        boolean z4 = bVar == null;
        if (z4) {
            bVar = new b();
            this.f4180b.put(a5, bVar);
        }
        bVar.f4186a.add(y0Var);
        p1.b.d(true ^ y0Var.c(this.f4182d), "onOnlineStateChanged() shouldn't raise an event for brand-new listeners.", new Object[0]);
        if (bVar.f4187b != null && y0Var.d(bVar.f4187b)) {
            f();
        }
        if (z4) {
            bVar.f4188c = this.f4179a.n(a5);
        }
        return bVar.f4188c;
    }

    public void e(com.google.firebase.firestore.j<Void> jVar) {
        this.f4181c.add(jVar);
        jVar.a(null, null);
    }

    public void g(y0 y0Var) {
        boolean z4;
        x0 a5 = y0Var.a();
        b bVar = this.f4180b.get(a5);
        if (bVar != null) {
            bVar.f4186a.remove(y0Var);
            z4 = bVar.f4186a.isEmpty();
        } else {
            z4 = false;
        }
        if (z4) {
            this.f4180b.remove(a5);
            this.f4179a.x(a5);
        }
    }

    public void h(com.google.firebase.firestore.j<Void> jVar) {
        this.f4181c.remove(jVar);
    }
}
