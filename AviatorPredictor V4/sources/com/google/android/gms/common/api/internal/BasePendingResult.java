package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import t.g;
import t.k;

@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends t.k> extends t.g<R> {

    /* renamed from: o, reason: collision with root package name */
    static final ThreadLocal<Boolean> f1215o = new f0();

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f1216p = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Object f1217a;

    /* renamed from: b, reason: collision with root package name */
    protected final a<R> f1218b;

    /* renamed from: c, reason: collision with root package name */
    protected final WeakReference<t.f> f1219c;

    /* renamed from: d, reason: collision with root package name */
    private final CountDownLatch f1220d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList<g.a> f1221e;

    /* renamed from: f, reason: collision with root package name */
    private t.l<? super R> f1222f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference<w> f1223g;

    /* renamed from: h, reason: collision with root package name */
    private R f1224h;

    /* renamed from: i, reason: collision with root package name */
    private Status f1225i;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f1226j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f1227k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f1228l;

    /* renamed from: m, reason: collision with root package name */
    private w.k f1229m;

    @KeepName
    private g0 mResultGuardian;

    /* renamed from: n, reason: collision with root package name */
    private boolean f1230n;

    public static class a<R extends t.k> extends g0.f {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(t.l<? super R> lVar, R r4) {
            int r02 = BasePendingResult.f1216p;
            sendMessage(obtainMessage(1, new Pair((t.l) w.r.i(lVar), r4)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int r02 = message.what;
            if (r02 == 1) {
                Pair pair = (Pair) message.obj;
                t.l lVar = (t.l) pair.first;
                t.k kVar = (t.k) pair.second;
                try {
                    lVar.a(kVar);
                    return;
                } catch (RuntimeException e5) {
                    BasePendingResult.k(kVar);
                    throw e5;
                }
            }
            if (r02 == 2) {
                ((BasePendingResult) message.obj).d(Status.f1206m);
                return;
            }
            StringBuilder sb = new StringBuilder(45);
            sb.append("Don't know how to handle message: ");
            sb.append(r02);
            Log.wtf("BasePendingResult", sb.toString(), new Exception());
        }
    }

    @Deprecated
    BasePendingResult() {
        this.f1217a = new Object();
        this.f1220d = new CountDownLatch(1);
        this.f1221e = new ArrayList<>();
        this.f1223g = new AtomicReference<>();
        this.f1230n = false;
        this.f1218b = new a<>(Looper.getMainLooper());
        this.f1219c = new WeakReference<>(null);
    }

    protected BasePendingResult(t.f fVar) {
        this.f1217a = new Object();
        this.f1220d = new CountDownLatch(1);
        this.f1221e = new ArrayList<>();
        this.f1223g = new AtomicReference<>();
        this.f1230n = false;
        this.f1218b = new a<>(fVar != null ? fVar.b() : Looper.getMainLooper());
        this.f1219c = new WeakReference<>(fVar);
    }

    private final R g() {
        R r4;
        synchronized (this.f1217a) {
            w.r.l(!this.f1226j, "Result has already been consumed.");
            w.r.l(e(), "Result is not ready.");
            r4 = this.f1224h;
            this.f1224h = null;
            this.f1222f = null;
            this.f1226j = true;
        }
        if (this.f1223g.getAndSet(null) == null) {
            return (R) w.r.i(r4);
        }
        throw null;
    }

    private final void h(R r4) {
        this.f1224h = r4;
        this.f1225i = r4.i0();
        u.d0 d0Var = null;
        this.f1229m = null;
        this.f1220d.countDown();
        if (this.f1227k) {
            this.f1222f = null;
        } else {
            t.l<? super R> lVar = this.f1222f;
            if (lVar != null) {
                this.f1218b.removeMessages(2);
                this.f1218b.a(lVar, g());
            } else if (this.f1224h instanceof t.h) {
                this.mResultGuardian = new g0(this, d0Var);
            }
        }
        ArrayList<g.a> arrayList = this.f1221e;
        int size = arrayList.size();
        for (int r12 = 0; r12 < size; r12++) {
            arrayList.get(r12).a(this.f1225i);
        }
        this.f1221e.clear();
    }

    public static void k(t.k kVar) {
        if (kVar instanceof t.h) {
            try {
                ((t.h) kVar).a();
            } catch (RuntimeException e5) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(kVar)), e5);
            }
        }
    }

    @Override // t.g
    public final void a(g.a aVar) {
        w.r.b(aVar != null, "Callback cannot be null.");
        synchronized (this.f1217a) {
            if (e()) {
                aVar.a(this.f1225i);
            } else {
                this.f1221e.add(aVar);
            }
        }
    }

    @Override // t.g
    public final R b(long j4, TimeUnit timeUnit) {
        if (j4 > 0) {
            w.r.h("await must not be called on the UI thread when time is greater than zero.");
        }
        w.r.l(!this.f1226j, "Result has already been consumed.");
        w.r.l(true, "Cannot await if then() has been called.");
        try {
            if (!this.f1220d.await(j4, timeUnit)) {
                d(Status.f1206m);
            }
        } catch (InterruptedException unused) {
            d(Status.f1204k);
        }
        w.r.l(e(), "Result is not ready.");
        return g();
    }

    protected abstract R c(Status status);

    @Deprecated
    public final void d(Status status) {
        synchronized (this.f1217a) {
            if (!e()) {
                f(c(status));
                this.f1228l = true;
            }
        }
    }

    public final boolean e() {
        return this.f1220d.getCount() == 0;
    }

    public final void f(R r4) {
        synchronized (this.f1217a) {
            if (this.f1228l || this.f1227k) {
                k(r4);
                return;
            }
            e();
            w.r.l(!e(), "Results have already been set");
            w.r.l(!this.f1226j, "Result has already been consumed");
            h(r4);
        }
    }

    public final void j() {
        boolean z4 = true;
        if (!this.f1230n && !f1215o.get().booleanValue()) {
            z4 = false;
        }
        this.f1230n = z4;
    }
}
