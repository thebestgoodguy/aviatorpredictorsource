package androidx.lifecycle;

import androidx.lifecycle.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class h extends d {

    /* renamed from: d, reason: collision with root package name */
    private final WeakReference<g> f524d;

    /* renamed from: b, reason: collision with root package name */
    private b.a<f, b> f522b = new b.a<>();

    /* renamed from: e, reason: collision with root package name */
    private int f525e = 0;

    /* renamed from: f, reason: collision with root package name */
    private boolean f526f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f527g = false;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList<d.b> f528h = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private d.b f523c = d.b.INITIALIZED;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f529a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f530b;

        static {
            int[] r02 = new int[d.b.values().length];
            f530b = r02;
            try {
                r02[d.b.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f530b[d.b.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f530b[d.b.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f530b[d.b.RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f530b[d.b.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] r5 = new int[d.a.values().length];
            f529a = r5;
            try {
                r5[d.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f529a[d.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f529a[d.a.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f529a[d.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f529a[d.a.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f529a[d.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f529a[d.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        d.b f531a;

        /* renamed from: b, reason: collision with root package name */
        e f532b;

        b(f fVar, d.b bVar) {
            this.f532b = j.f(fVar);
            this.f531a = bVar;
        }

        void a(g gVar, d.a aVar) {
            d.b h5 = h.h(aVar);
            this.f531a = h.l(this.f531a, h5);
            this.f532b.d(gVar, aVar);
            this.f531a = h5;
        }
    }

    public h(g gVar) {
        this.f524d = new WeakReference<>(gVar);
    }

    private void d(g gVar) {
        Iterator<Map.Entry<f, b>> descendingIterator = this.f522b.descendingIterator();
        while (descendingIterator.hasNext() && !this.f527g) {
            Map.Entry<f, b> next = descendingIterator.next();
            b value = next.getValue();
            while (value.f531a.compareTo(this.f523c) > 0 && !this.f527g && this.f522b.contains(next.getKey())) {
                d.a f5 = f(value.f531a);
                o(h(f5));
                value.a(gVar, f5);
                n();
            }
        }
    }

    private d.b e(f fVar) {
        Map.Entry<f, b> u4 = this.f522b.u(fVar);
        d.b bVar = null;
        d.b bVar2 = u4 != null ? u4.getValue().f531a : null;
        if (!this.f528h.isEmpty()) {
            bVar = this.f528h.get(r0.size() - 1);
        }
        return l(l(this.f523c, bVar2), bVar);
    }

    private static d.a f(d.b bVar) {
        int r02 = a.f530b[bVar.ordinal()];
        if (r02 == 1) {
            throw new IllegalArgumentException();
        }
        if (r02 == 2) {
            return d.a.ON_DESTROY;
        }
        if (r02 == 3) {
            return d.a.ON_STOP;
        }
        if (r02 == 4) {
            return d.a.ON_PAUSE;
        }
        if (r02 == 5) {
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Unexpected state value " + bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void g(g gVar) {
        b.b<f, b>.d q4 = this.f522b.q();
        while (q4.hasNext() && !this.f527g) {
            Map.Entry next = q4.next();
            b bVar = (b) next.getValue();
            while (bVar.f531a.compareTo(this.f523c) < 0 && !this.f527g && this.f522b.contains(next.getKey())) {
                o(bVar.f531a);
                bVar.a(gVar, r(bVar.f531a));
                n();
            }
        }
    }

    static d.b h(d.a aVar) {
        switch (a.f529a[aVar.ordinal()]) {
            case 1:
            case 2:
                return d.b.CREATED;
            case 3:
            case 4:
                return d.b.STARTED;
            case 5:
                return d.b.RESUMED;
            case 6:
                return d.b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    private boolean j() {
        if (this.f522b.size() == 0) {
            return true;
        }
        d.b bVar = this.f522b.i().getValue().f531a;
        d.b bVar2 = this.f522b.r().getValue().f531a;
        return bVar == bVar2 && this.f523c == bVar2;
    }

    static d.b l(d.b bVar, d.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    private void m(d.b bVar) {
        if (this.f523c == bVar) {
            return;
        }
        this.f523c = bVar;
        if (this.f526f || this.f525e != 0) {
            this.f527g = true;
            return;
        }
        this.f526f = true;
        q();
        this.f526f = false;
    }

    private void n() {
        this.f528h.remove(r0.size() - 1);
    }

    private void o(d.b bVar) {
        this.f528h.add(bVar);
    }

    private void q() {
        g gVar = this.f524d.get();
        if (gVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean j4 = j();
            this.f527g = false;
            if (j4) {
                return;
            }
            if (this.f523c.compareTo(this.f522b.i().getValue().f531a) < 0) {
                d(gVar);
            }
            Map.Entry<f, b> r4 = this.f522b.r();
            if (!this.f527g && r4 != null && this.f523c.compareTo(r4.getValue().f531a) > 0) {
                g(gVar);
            }
        }
    }

    private static d.a r(d.b bVar) {
        int r02 = a.f530b[bVar.ordinal()];
        if (r02 != 1) {
            if (r02 == 2) {
                return d.a.ON_START;
            }
            if (r02 == 3) {
                return d.a.ON_RESUME;
            }
            if (r02 == 4) {
                throw new IllegalArgumentException();
            }
            if (r02 != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
        }
        return d.a.ON_CREATE;
    }

    @Override // androidx.lifecycle.d
    public void a(f fVar) {
        g gVar;
        d.b bVar = this.f523c;
        d.b bVar2 = d.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = d.b.INITIALIZED;
        }
        b bVar3 = new b(fVar, bVar2);
        if (this.f522b.v(fVar, bVar3) == null && (gVar = this.f524d.get()) != null) {
            boolean z4 = this.f525e != 0 || this.f526f;
            d.b e5 = e(fVar);
            this.f525e++;
            while (bVar3.f531a.compareTo(e5) < 0 && this.f522b.contains(fVar)) {
                o(bVar3.f531a);
                bVar3.a(gVar, r(bVar3.f531a));
                n();
                e5 = e(fVar);
            }
            if (!z4) {
                q();
            }
            this.f525e--;
        }
    }

    @Override // androidx.lifecycle.d
    public d.b b() {
        return this.f523c;
    }

    @Override // androidx.lifecycle.d
    public void c(f fVar) {
        this.f522b.t(fVar);
    }

    public void i(d.a aVar) {
        m(h(aVar));
    }

    @Deprecated
    public void k(d.b bVar) {
        p(bVar);
    }

    public void p(d.b bVar) {
        m(bVar);
    }
}
