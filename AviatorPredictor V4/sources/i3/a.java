package i3;

import b3.a;
import b3.f1;
import b3.n0;
import b3.p;
import b3.q;
import b3.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import q0.h;
import q0.i;
import q0.l;

/* loaded from: classes.dex */
final class a extends n0 {

    /* renamed from: g, reason: collision with root package name */
    static final a.c<d<q>> f4316g = a.c.a("state-info");

    /* renamed from: h, reason: collision with root package name */
    private static final f1 f4317h = f1.f756f.q("no subchannels ready");

    /* renamed from: b, reason: collision with root package name */
    private final n0.d f4318b;

    /* renamed from: e, reason: collision with root package name */
    private p f4321e;

    /* renamed from: c, reason: collision with root package name */
    private final Map<x, n0.h> f4319c = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private e f4322f = new b(f4317h);

    /* renamed from: d, reason: collision with root package name */
    private final Random f4320d = new Random();

    /* renamed from: i3.a$a, reason: collision with other inner class name */
    class C0046a implements n0.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n0.h f4323a;

        C0046a(n0.h hVar) {
            this.f4323a = hVar;
        }

        @Override // b3.n0.j
        public void a(q qVar) {
            a.this.k(this.f4323a, qVar);
        }
    }

    static final class b extends e {

        /* renamed from: a, reason: collision with root package name */
        private final f1 f4325a;

        b(f1 f1Var) {
            super(null);
            this.f4325a = (f1) l.o(f1Var, "status");
        }

        @Override // b3.n0.i
        public n0.e a(n0.f fVar) {
            return this.f4325a.o() ? n0.e.g() : n0.e.f(this.f4325a);
        }

        @Override // i3.a.e
        boolean c(e eVar) {
            if (eVar instanceof b) {
                b bVar = (b) eVar;
                if (i.a(this.f4325a, bVar.f4325a) || (this.f4325a.o() && bVar.f4325a.o())) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return h.b(b.class).d("status", this.f4325a).toString();
        }
    }

    static final class c extends e {

        /* renamed from: c, reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater<c> f4326c = AtomicIntegerFieldUpdater.newUpdater(c.class, "b");

        /* renamed from: a, reason: collision with root package name */
        private final List<n0.h> f4327a;

        /* renamed from: b, reason: collision with root package name */
        private volatile int f4328b;

        c(List<n0.h> list, int r4) {
            super(null);
            l.e(!list.isEmpty(), "empty list");
            this.f4327a = list;
            this.f4328b = r4 - 1;
        }

        private n0.h d() {
            int size = this.f4327a.size();
            AtomicIntegerFieldUpdater<c> atomicIntegerFieldUpdater = f4326c;
            int incrementAndGet = atomicIntegerFieldUpdater.incrementAndGet(this);
            if (incrementAndGet >= size) {
                int r02 = incrementAndGet % size;
                atomicIntegerFieldUpdater.compareAndSet(this, incrementAndGet, r02);
                incrementAndGet = r02;
            }
            return this.f4327a.get(incrementAndGet);
        }

        @Override // b3.n0.i
        public n0.e a(n0.f fVar) {
            return n0.e.h(d());
        }

        @Override // i3.a.e
        boolean c(e eVar) {
            if (!(eVar instanceof c)) {
                return false;
            }
            c cVar = (c) eVar;
            return cVar == this || (this.f4327a.size() == cVar.f4327a.size() && new HashSet(this.f4327a).containsAll(cVar.f4327a));
        }

        public String toString() {
            return h.b(c.class).d("list", this.f4327a).toString();
        }
    }

    static final class d<T> {

        /* renamed from: a, reason: collision with root package name */
        T f4329a;

        d(T t4) {
            this.f4329a = t4;
        }
    }

    private static abstract class e extends n0.i {
        private e() {
        }

        /* synthetic */ e(C0046a c0046a) {
            this();
        }

        abstract boolean c(e eVar);
    }

    a(n0.d dVar) {
        this.f4318b = (n0.d) l.o(dVar, "helper");
    }

    private static List<n0.h> g(Collection<n0.h> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (n0.h hVar : collection) {
            if (j(hVar)) {
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    private static d<q> h(n0.h hVar) {
        return (d) l.o((d) hVar.c().b(f4316g), "STATE_INFO");
    }

    static boolean j(n0.h hVar) {
        return h(hVar).f4329a.c() == p.READY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void k(n0.h hVar, q qVar) {
        if (this.f4319c.get(n(hVar.a())) != hVar) {
            return;
        }
        p c5 = qVar.c();
        p pVar = p.TRANSIENT_FAILURE;
        if (c5 == pVar || qVar.c() == p.IDLE) {
            this.f4318b.d();
        }
        p c6 = qVar.c();
        p pVar2 = p.IDLE;
        if (c6 == pVar2) {
            hVar.e();
        }
        d<q> h5 = h(hVar);
        if (h5.f4329a.c().equals(pVar) && (qVar.c().equals(p.CONNECTING) || qVar.c().equals(pVar2))) {
            return;
        }
        h5.f4329a = qVar;
        p();
    }

    private static <T> Set<T> l(Set<T> set, Set<T> set2) {
        HashSet hashSet = new HashSet(set);
        hashSet.removeAll(set2);
        return hashSet;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, b3.q] */
    private void m(n0.h hVar) {
        hVar.f();
        h(hVar).f4329a = q.a(p.SHUTDOWN);
    }

    private static x n(x xVar) {
        return new x(xVar.a());
    }

    private static Map<x, x> o(List<x> list) {
        HashMap hashMap = new HashMap(list.size() * 2);
        for (x xVar : list) {
            hashMap.put(n(xVar), xVar);
        }
        return hashMap;
    }

    private void p() {
        List<n0.h> g5 = g(i());
        if (!g5.isEmpty()) {
            q(p.READY, new c(g5, this.f4320d.nextInt(g5.size())));
            return;
        }
        boolean z4 = false;
        f1 f1Var = f4317h;
        Iterator<n0.h> it = i().iterator();
        while (it.hasNext()) {
            q qVar = h(it.next()).f4329a;
            if (qVar.c() == p.CONNECTING || qVar.c() == p.IDLE) {
                z4 = true;
            }
            if (f1Var == f4317h || !f1Var.o()) {
                f1Var = qVar.d();
            }
        }
        q(z4 ? p.CONNECTING : p.TRANSIENT_FAILURE, new b(f1Var));
    }

    private void q(p pVar, e eVar) {
        if (pVar == this.f4321e && eVar.c(this.f4322f)) {
            return;
        }
        this.f4318b.e(pVar, eVar);
        this.f4321e = pVar;
        this.f4322f = eVar;
    }

    @Override // b3.n0
    public void b(f1 f1Var) {
        if (this.f4321e != p.READY) {
            q(p.TRANSIENT_FAILURE, new b(f1Var));
        }
    }

    @Override // b3.n0
    public void c(n0.g gVar) {
        List<x> a5 = gVar.a();
        Set<x> keySet = this.f4319c.keySet();
        Map<x, x> o4 = o(a5);
        Set l4 = l(keySet, o4.keySet());
        for (Map.Entry<x, x> entry : o4.entrySet()) {
            x key = entry.getKey();
            x value = entry.getValue();
            n0.h hVar = this.f4319c.get(key);
            if (hVar != null) {
                hVar.h(Collections.singletonList(value));
            } else {
                n0.h hVar2 = (n0.h) l.o(this.f4318b.a(n0.b.c().d(value).f(b3.a.c().d(f4316g, new d(q.a(p.IDLE))).a()).b()), "subchannel");
                hVar2.g(new C0046a(hVar2));
                this.f4319c.put(key, hVar2);
                hVar2.e();
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = l4.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f4319c.remove((x) it.next()));
        }
        p();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            m((n0.h) it2.next());
        }
    }

    @Override // b3.n0
    public void e() {
        Iterator<n0.h> it = i().iterator();
        while (it.hasNext()) {
            m(it.next());
        }
        this.f4319c.clear();
    }

    Collection<n0.h> i() {
        return this.f4319c.values();
    }
}
