package i1;

import com.google.firebase.firestore.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class g1 {

    /* renamed from: g, reason: collision with root package name */
    private static final Executor f4086g = d();

    /* renamed from: a, reason: collision with root package name */
    private final o1.m f4087a;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4090d;

    /* renamed from: e, reason: collision with root package name */
    private com.google.firebase.firestore.u f4091e;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<l1.l, l1.w> f4088b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<m1.f> f4089c = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private Set<l1.l> f4092f = new HashSet();

    public g1(o1.m mVar) {
        this.f4087a = mVar;
    }

    private static Executor d() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    private void f() {
        p1.b.d(!this.f4090d, "A transaction object cannot be used after its update callback has been invoked.", new Object[0]);
    }

    public static Executor g() {
        return f4086g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o0.h h(o0.h hVar) {
        return hVar.p() ? o0.k.d(null) : o0.k.c(hVar.l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ o0.h i(o0.h hVar) {
        if (hVar.p()) {
            Iterator it = ((List) hVar.m()).iterator();
            while (it.hasNext()) {
                m((l1.s) it.next());
            }
        }
        return hVar;
    }

    private m1.m k(l1.l lVar) {
        l1.w wVar = this.f4088b.get(lVar);
        return (this.f4092f.contains(lVar) || wVar == null) ? m1.m.f6655c : m1.m.f(wVar);
    }

    private m1.m l(l1.l lVar) {
        l1.w wVar = this.f4088b.get(lVar);
        if (this.f4092f.contains(lVar) || wVar == null) {
            return m1.m.a(true);
        }
        if (wVar.equals(l1.w.f6583f)) {
            throw new com.google.firebase.firestore.u("Can't update a document that doesn't exist.", u.a.INVALID_ARGUMENT);
        }
        return m1.m.f(wVar);
    }

    private void m(l1.s sVar) {
        l1.w wVar;
        if (sVar.b()) {
            wVar = sVar.j();
        } else {
            if (!sVar.e()) {
                throw p1.b.a("Unexpected document type in transaction: " + sVar, new Object[0]);
            }
            wVar = l1.w.f6583f;
        }
        if (!this.f4088b.containsKey(sVar.getKey())) {
            this.f4088b.put(sVar.getKey(), wVar);
        } else if (!this.f4088b.get(sVar.getKey()).equals(sVar.j())) {
            throw new com.google.firebase.firestore.u("Document version changed between two reads.", u.a.ABORTED);
        }
    }

    private void p(List<m1.f> list) {
        f();
        this.f4089c.addAll(list);
    }

    public o0.h<Void> c() {
        f();
        com.google.firebase.firestore.u uVar = this.f4091e;
        if (uVar != null) {
            return o0.k.c(uVar);
        }
        HashSet hashSet = new HashSet(this.f4088b.keySet());
        Iterator<m1.f> it = this.f4089c.iterator();
        while (it.hasNext()) {
            hashSet.remove(it.next().g());
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            l1.l lVar = (l1.l) it2.next();
            this.f4089c.add(new m1.q(lVar, k(lVar)));
        }
        this.f4090d = true;
        return this.f4087a.d(this.f4089c).j(p1.p.f7051b, new o0.a() { // from class: i1.f1
            @Override // o0.a
            public final Object a(o0.h hVar) {
                o0.h h5;
                h5 = g1.h(hVar);
                return h5;
            }
        });
    }

    public void e(l1.l lVar) {
        p(Collections.singletonList(new m1.c(lVar, k(lVar))));
        this.f4092f.add(lVar);
    }

    public o0.h<List<l1.s>> j(List<l1.l> list) {
        f();
        return this.f4089c.size() != 0 ? o0.k.c(new com.google.firebase.firestore.u("Firestore transactions require all reads to be executed before all writes.", u.a.INVALID_ARGUMENT)) : this.f4087a.m(list).j(p1.p.f7051b, new o0.a() { // from class: i1.e1
            @Override // o0.a
            public final Object a(o0.h hVar) {
                o0.h i4;
                i4 = g1.this.i(hVar);
                return i4;
            }
        });
    }

    public void n(l1.l lVar, o1 o1Var) {
        p(Collections.singletonList(o1Var.a(lVar, k(lVar))));
        this.f4092f.add(lVar);
    }

    public void o(l1.l lVar, p1 p1Var) {
        try {
            p(Collections.singletonList(p1Var.a(lVar, l(lVar))));
        } catch (com.google.firebase.firestore.u e5) {
            this.f4091e = e5;
        }
        this.f4092f.add(lVar);
    }
}
