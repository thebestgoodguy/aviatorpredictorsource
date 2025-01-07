package b1;

import android.util.Log;
import b1.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class n extends b1.a implements d1.a {

    /* renamed from: g, reason: collision with root package name */
    private static final r1.b<Set<Object>> f650g = new r1.b() { // from class: b1.m
        @Override // r1.b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Map<d<?>, r1.b<?>> f651a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, r1.b<?>> f652b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, x<?>> f653c;

    /* renamed from: d, reason: collision with root package name */
    private final List<r1.b<i>> f654d;

    /* renamed from: e, reason: collision with root package name */
    private final u f655e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference<Boolean> f656f;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f657a;

        /* renamed from: b, reason: collision with root package name */
        private final List<r1.b<i>> f658b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final List<d<?>> f659c = new ArrayList();

        b(Executor executor) {
            this.f657a = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ i f(i iVar) {
            return iVar;
        }

        public b b(d<?> dVar) {
            this.f659c.add(dVar);
            return this;
        }

        public b c(final i iVar) {
            this.f658b.add(new r1.b() { // from class: b1.o
                @Override // r1.b
                public final Object get() {
                    i f5;
                    f5 = n.b.f(i.this);
                    return f5;
                }
            });
            return this;
        }

        public b d(Collection<r1.b<i>> collection) {
            this.f658b.addAll(collection);
            return this;
        }

        public n e() {
            return new n(this.f657a, this.f658b, this.f659c);
        }
    }

    private n(Executor executor, Iterable<r1.b<i>> iterable, Collection<d<?>> collection) {
        this.f651a = new HashMap();
        this.f652b = new HashMap();
        this.f653c = new HashMap();
        this.f656f = new AtomicReference<>();
        u uVar = new u(executor);
        this.f655e = uVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(d.p(uVar, u.class, f1.d.class, f1.c.class));
        arrayList.add(d.p(this, d1.a.class, new Class[0]));
        for (d<?> dVar : collection) {
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        this.f654d = m(iterable);
        j(arrayList);
    }

    public static b i(Executor executor) {
        return new b(executor);
    }

    private void j(List<d<?>> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<r1.b<i>> it = this.f654d.iterator();
            while (it.hasNext()) {
                try {
                    i iVar = it.next().get();
                    if (iVar != null) {
                        list.addAll(iVar.getComponents());
                        it.remove();
                    }
                } catch (v e5) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e5);
                }
            }
            if (this.f651a.isEmpty()) {
                p.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f651a.keySet());
                arrayList2.addAll(list);
                p.a(arrayList2);
            }
            for (final d<?> dVar : list) {
                this.f651a.put(dVar, new w(new r1.b() { // from class: b1.l
                    @Override // r1.b
                    public final Object get() {
                        Object n4;
                        n4 = n.this.n(dVar);
                        return n4;
                    }
                }));
            }
            arrayList.addAll(s(list));
            arrayList.addAll(t());
            r();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        q();
    }

    private void k(Map<d<?>, r1.b<?>> map, boolean z4) {
        for (Map.Entry<d<?>, r1.b<?>> entry : map.entrySet()) {
            d<?> key = entry.getKey();
            r1.b<?> value = entry.getValue();
            if (key.k() || (key.l() && z4)) {
                value.get();
            }
        }
        this.f655e.c();
    }

    private static <T> List<T> m(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(d dVar) {
        return dVar.f().a(new e0(dVar, this));
    }

    private void q() {
        Boolean bool = this.f656f.get();
        if (bool != null) {
            k(this.f651a, bool.booleanValue());
        }
    }

    private void r() {
        Map map;
        Class<?> c5;
        r1.b e5;
        for (d<?> dVar : this.f651a.keySet()) {
            for (q qVar : dVar.e()) {
                if (qVar.g() && !this.f653c.containsKey(qVar.c())) {
                    map = this.f653c;
                    c5 = qVar.c();
                    e5 = x.b(Collections.emptySet());
                } else if (this.f652b.containsKey(qVar.c())) {
                    continue;
                } else {
                    if (qVar.f()) {
                        throw new y(String.format("Unsatisfied dependency for component %s: %s", dVar, qVar.c()));
                    }
                    if (!qVar.g()) {
                        map = this.f652b;
                        c5 = qVar.c();
                        e5 = c0.e();
                    }
                }
                map.put(c5, e5);
            }
        }
    }

    private List<Runnable> s(List<d<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (d<?> dVar : list) {
            if (dVar.m()) {
                final r1.b<?> bVar = this.f651a.get(dVar);
                for (Class<? super Object> cls : dVar.g()) {
                    if (this.f652b.containsKey(cls)) {
                        final c0 c0Var = (c0) this.f652b.get(cls);
                        arrayList.add(new Runnable() { // from class: b1.k
                            @Override // java.lang.Runnable
                            public final void run() {
                                c0.this.j(bVar);
                            }
                        });
                    } else {
                        this.f652b.put(cls, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> t() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<d<?>, r1.b<?>> entry : this.f651a.entrySet()) {
            d<?> key = entry.getKey();
            if (!key.m()) {
                r1.b<?> value = entry.getValue();
                for (Class<? super Object> cls : key.g()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (this.f653c.containsKey(entry2.getKey())) {
                final x<?> xVar = this.f653c.get(entry2.getKey());
                for (final r1.b bVar : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: b1.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            x.this.a(bVar);
                        }
                    });
                }
            } else {
                this.f653c.put((Class) entry2.getKey(), x.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // b1.a, b1.e
    public /* bridge */ /* synthetic */ Object a(Class cls) {
        return super.a(cls);
    }

    @Override // b1.e
    public synchronized <T> r1.b<T> b(Class<T> cls) {
        d0.c(cls, "Null interface requested.");
        return (r1.b) this.f652b.get(cls);
    }

    @Override // b1.a, b1.e
    public /* bridge */ /* synthetic */ Set c(Class cls) {
        return super.c(cls);
    }

    @Override // b1.e
    public synchronized <T> r1.b<Set<T>> d(Class<T> cls) {
        x<?> xVar = this.f653c.get(cls);
        if (xVar != null) {
            return xVar;
        }
        return (r1.b<Set<T>>) f650g;
    }

    @Override // b1.e
    public <T> r1.a<T> e(Class<T> cls) {
        r1.b<T> b5 = b(cls);
        return b5 == null ? c0.e() : b5 instanceof c0 ? (c0) b5 : c0.i(b5);
    }

    public void l(boolean z4) {
        HashMap hashMap;
        if (this.f656f.compareAndSet(null, Boolean.valueOf(z4))) {
            synchronized (this) {
                hashMap = new HashMap(this.f651a);
            }
            k(hashMap, z4);
        }
    }
}
