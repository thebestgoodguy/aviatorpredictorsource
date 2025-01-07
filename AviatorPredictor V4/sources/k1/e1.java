package k1;

import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e1 {

    /* renamed from: a, reason: collision with root package name */
    private c1.e<e> f6069a = new c1.e<>(Collections.emptyList(), e.f6062c);

    /* renamed from: b, reason: collision with root package name */
    private c1.e<e> f6070b = new c1.e<>(Collections.emptyList(), e.f6063d);

    private void e(e eVar) {
        this.f6069a = this.f6069a.s(eVar);
        this.f6070b = this.f6070b.s(eVar);
    }

    public void a(l1.l lVar, int r32) {
        e eVar = new e(lVar, r32);
        this.f6069a = this.f6069a.q(eVar);
        this.f6070b = this.f6070b.q(eVar);
    }

    public void b(c1.e<l1.l> eVar, int r32) {
        Iterator<l1.l> it = eVar.iterator();
        while (it.hasNext()) {
            a(it.next(), r32);
        }
    }

    public boolean c(l1.l lVar) {
        Iterator<e> r4 = this.f6069a.r(new e(lVar, 0));
        if (r4.hasNext()) {
            return r4.next().d().equals(lVar);
        }
        return false;
    }

    public c1.e<l1.l> d(int r5) {
        Iterator<e> r4 = this.f6070b.r(new e(l1.l.h(), r5));
        c1.e<l1.l> i4 = l1.l.i();
        while (r4.hasNext()) {
            e next = r4.next();
            if (next.c() != r5) {
                break;
            }
            i4 = i4.q(next.d());
        }
        return i4;
    }

    public void f(l1.l lVar, int r32) {
        e(new e(lVar, r32));
    }

    public void g(c1.e<l1.l> eVar, int r32) {
        Iterator<l1.l> it = eVar.iterator();
        while (it.hasNext()) {
            f(it.next(), r32);
        }
    }

    public c1.e<l1.l> h(int r5) {
        Iterator<e> r4 = this.f6070b.r(new e(l1.l.h(), r5));
        c1.e<l1.l> i4 = l1.l.i();
        while (r4.hasNext()) {
            e next = r4.next();
            if (next.c() != r5) {
                break;
            }
            i4 = i4.q(next.d());
            e(next);
        }
        return i4;
    }
}
