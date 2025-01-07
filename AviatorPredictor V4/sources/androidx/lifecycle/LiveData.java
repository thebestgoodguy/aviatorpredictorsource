package androidx.lifecycle;

import androidx.lifecycle.d;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: j, reason: collision with root package name */
    static final Object f488j = new Object();

    /* renamed from: a, reason: collision with root package name */
    final Object f489a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private b.b<m<? super T>, LiveData<T>.b> f490b = new b.b<>();

    /* renamed from: c, reason: collision with root package name */
    int f491c = 0;

    /* renamed from: d, reason: collision with root package name */
    private volatile Object f492d;

    /* renamed from: e, reason: collision with root package name */
    volatile Object f493e;

    /* renamed from: f, reason: collision with root package name */
    private int f494f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f495g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f496h;

    /* renamed from: i, reason: collision with root package name */
    private final Runnable f497i;

    class LifecycleBoundObserver extends LiveData<T>.b implements e {

        /* renamed from: e, reason: collision with root package name */
        final g f498e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ LiveData f499f;

        @Override // androidx.lifecycle.e
        public void d(g gVar, d.a aVar) {
            if (this.f498e.b().b() == d.b.DESTROYED) {
                this.f499f.f(this.f501a);
            } else {
                h(j());
            }
        }

        @Override // androidx.lifecycle.LiveData.b
        void i() {
            this.f498e.b().c(this);
        }

        @Override // androidx.lifecycle.LiveData.b
        boolean j() {
            return this.f498e.b().b().d(d.b.STARTED);
        }
    }

    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f489a) {
                obj = LiveData.this.f493e;
                LiveData.this.f493e = LiveData.f488j;
            }
            LiveData.this.g(obj);
        }
    }

    private abstract class b {

        /* renamed from: a, reason: collision with root package name */
        final m<? super T> f501a;

        /* renamed from: b, reason: collision with root package name */
        boolean f502b;

        /* renamed from: c, reason: collision with root package name */
        int f503c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LiveData f504d;

        void h(boolean z4) {
            if (z4 == this.f502b) {
                return;
            }
            this.f502b = z4;
            LiveData liveData = this.f504d;
            int r12 = liveData.f491c;
            boolean z5 = r12 == 0;
            liveData.f491c = r12 + (z4 ? 1 : -1);
            if (z5 && z4) {
                liveData.d();
            }
            LiveData liveData2 = this.f504d;
            if (liveData2.f491c == 0 && !this.f502b) {
                liveData2.e();
            }
            if (this.f502b) {
                this.f504d.c(this);
            }
        }

        void i() {
        }

        abstract boolean j();
    }

    public LiveData() {
        Object obj = f488j;
        this.f492d = obj;
        this.f493e = obj;
        this.f494f = -1;
        this.f497i = new a();
    }

    private static void a(String str) {
        if (a.a.d().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void b(LiveData<T>.b bVar) {
        if (bVar.f502b) {
            if (!bVar.j()) {
                bVar.h(false);
                return;
            }
            int r02 = bVar.f503c;
            int r12 = this.f494f;
            if (r02 >= r12) {
                return;
            }
            bVar.f503c = r12;
            bVar.f501a.a((Object) this.f492d);
        }
    }

    void c(LiveData<T>.b bVar) {
        if (this.f495g) {
            this.f496h = true;
            return;
        }
        this.f495g = true;
        do {
            this.f496h = false;
            if (bVar != null) {
                b(bVar);
                bVar = null;
            } else {
                b.b<m<? super T>, LiveData<T>.b>.d q4 = this.f490b.q();
                while (q4.hasNext()) {
                    b((b) q4.next().getValue());
                    if (this.f496h) {
                        break;
                    }
                }
            }
        } while (this.f496h);
        this.f495g = false;
    }

    protected void d() {
    }

    protected void e() {
    }

    public void f(m<? super T> mVar) {
        a("removeObserver");
        LiveData<T>.b t4 = this.f490b.t(mVar);
        if (t4 == null) {
            return;
        }
        t4.i();
        t4.h(false);
    }

    protected void g(T t4) {
        a("setValue");
        this.f494f++;
        this.f492d = t4;
        c(null);
    }
}
