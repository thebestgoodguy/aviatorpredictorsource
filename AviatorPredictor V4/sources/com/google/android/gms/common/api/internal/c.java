package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import t.a;
import w.j0;

/* loaded from: classes.dex */
public class c implements Handler.Callback {

    /* renamed from: r, reason: collision with root package name */
    public static final Status f1242r = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: s, reason: collision with root package name */
    private static final Status f1243s = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: t, reason: collision with root package name */
    private static final Object f1244t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private static c f1245u;

    /* renamed from: e, reason: collision with root package name */
    private w.v f1250e;

    /* renamed from: f, reason: collision with root package name */
    private w.x f1251f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f1252g;

    /* renamed from: h, reason: collision with root package name */
    private final s.d f1253h;

    /* renamed from: i, reason: collision with root package name */
    private final j0 f1254i;

    /* renamed from: p, reason: collision with root package name */
    @NotOnlyInitialized
    private final Handler f1261p;

    /* renamed from: q, reason: collision with root package name */
    private volatile boolean f1262q;

    /* renamed from: a, reason: collision with root package name */
    private long f1246a = 5000;

    /* renamed from: b, reason: collision with root package name */
    private long f1247b = 120000;

    /* renamed from: c, reason: collision with root package name */
    private long f1248c = 10000;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1249d = false;

    /* renamed from: j, reason: collision with root package name */
    private final AtomicInteger f1255j = new AtomicInteger(1);

    /* renamed from: k, reason: collision with root package name */
    private final AtomicInteger f1256k = new AtomicInteger(0);

    /* renamed from: l, reason: collision with root package name */
    private final Map<u.b<?>, o<?>> f1257l = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: m, reason: collision with root package name */
    private h f1258m = null;

    /* renamed from: n, reason: collision with root package name */
    private final Set<u.b<?>> f1259n = new e.b();

    /* renamed from: o, reason: collision with root package name */
    private final Set<u.b<?>> f1260o = new e.b();

    private c(Context context, Looper looper, s.d dVar) {
        this.f1262q = true;
        this.f1252g = context;
        g0.f fVar = new g0.f(looper, this);
        this.f1261p = fVar;
        this.f1253h = dVar;
        this.f1254i = new j0(dVar);
        if (b0.g.a(context)) {
            this.f1262q = false;
        }
        fVar.sendMessage(fVar.obtainMessage(6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status h(u.b<?> bVar, s.a aVar) {
        String b5 = bVar.b();
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(String.valueOf(b5).length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(b5);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(aVar, sb.toString());
    }

    private final o<?> i(t.e<?> eVar) {
        u.b<?> g5 = eVar.g();
        o<?> oVar = this.f1257l.get(g5);
        if (oVar == null) {
            oVar = new o<>(this, eVar);
            this.f1257l.put(g5, oVar);
        }
        if (oVar.P()) {
            this.f1260o.add(g5);
        }
        oVar.E();
        return oVar;
    }

    private final w.x j() {
        if (this.f1251f == null) {
            this.f1251f = w.w.a(this.f1252g);
        }
        return this.f1251f;
    }

    private final void k() {
        w.v vVar = this.f1250e;
        if (vVar != null) {
            if (vVar.j0() > 0 || f()) {
                j().a(vVar);
            }
            this.f1250e = null;
        }
    }

    private final <T> void l(o0.i<T> iVar, int r32, t.e eVar) {
        s b5;
        if (r32 == 0 || (b5 = s.b(this, r32, eVar.g())) == null) {
            return;
        }
        o0.h<T> a5 = iVar.a();
        final Handler handler = this.f1261p;
        handler.getClass();
        a5.b(new Executor() { // from class: u.n
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, b5);
    }

    public static c x(Context context) {
        c cVar;
        synchronized (f1244t) {
            if (f1245u == null) {
                f1245u = new c(context.getApplicationContext(), w.h.c().getLooper(), s.d.m());
            }
            cVar = f1245u;
        }
        return cVar;
    }

    public final <O extends a.d> void D(t.e<O> eVar, int r4, b<? extends t.k, a.b> bVar) {
        x xVar = new x(r4, bVar);
        Handler handler = this.f1261p;
        handler.sendMessage(handler.obtainMessage(4, new u.v(xVar, this.f1256k.get(), eVar)));
    }

    public final <O extends a.d, ResultT> void E(t.e<O> eVar, int r32, d<a.b, ResultT> dVar, o0.i<ResultT> iVar, u.k kVar) {
        l(iVar, dVar.d(), eVar);
        y yVar = new y(r32, dVar, iVar, kVar);
        Handler handler = this.f1261p;
        handler.sendMessage(handler.obtainMessage(4, new u.v(yVar, this.f1256k.get(), eVar)));
    }

    final void F(w.o oVar, int r10, long j4, int r13) {
        Handler handler = this.f1261p;
        handler.sendMessage(handler.obtainMessage(18, new t(oVar, r10, j4, r13)));
    }

    public final void G(s.a aVar, int r5) {
        if (g(aVar, r5)) {
            return;
        }
        Handler handler = this.f1261p;
        handler.sendMessage(handler.obtainMessage(5, r5, 0, aVar));
    }

    public final void a() {
        Handler handler = this.f1261p;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void b(t.e<?> eVar) {
        Handler handler = this.f1261p;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final void c(h hVar) {
        synchronized (f1244t) {
            if (this.f1258m != hVar) {
                this.f1258m = hVar;
                this.f1259n.clear();
            }
            this.f1259n.addAll(hVar.t());
        }
    }

    final void d(h hVar) {
        synchronized (f1244t) {
            if (this.f1258m == hVar) {
                this.f1258m = null;
                this.f1259n.clear();
            }
        }
    }

    final boolean f() {
        if (this.f1249d) {
            return false;
        }
        w.t a5 = w.s.b().a();
        if (a5 != null && !a5.l0()) {
            return false;
        }
        int a6 = this.f1254i.a(this.f1252g, 203400000);
        return a6 == -1 || a6 == 0;
    }

    final boolean g(s.a aVar, int r4) {
        return this.f1253h.w(this.f1252g, aVar, r4);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        u.b bVar;
        boolean q4;
        o0.i<Boolean> b5;
        Boolean valueOf;
        u.b bVar2;
        u.b bVar3;
        u.b bVar4;
        u.b bVar5;
        int r02 = message.what;
        o<?> oVar = null;
        switch (r02) {
            case 1:
                this.f1248c = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f1261p.removeMessages(12);
                for (u.b<?> bVar6 : this.f1257l.keySet()) {
                    Handler handler = this.f1261p;
                    handler.sendMessageDelayed(handler.obtainMessage(12, bVar6), this.f1248c);
                }
                return true;
            case 2:
                u.c0 c0Var = (u.c0) message.obj;
                Iterator<u.b<?>> it = c0Var.a().iterator();
                while (true) {
                    if (it.hasNext()) {
                        u.b<?> next = it.next();
                        o<?> oVar2 = this.f1257l.get(next);
                        if (oVar2 == null) {
                            c0Var.b(next, new s.a(13), null);
                        } else if (oVar2.O()) {
                            c0Var.b(next, s.a.f7474i, oVar2.v().e());
                        } else {
                            s.a t4 = oVar2.t();
                            if (t4 != null) {
                                c0Var.b(next, t4, null);
                            } else {
                                oVar2.J(c0Var);
                                oVar2.E();
                            }
                        }
                    }
                }
                return true;
            case 3:
                for (o<?> oVar3 : this.f1257l.values()) {
                    oVar3.D();
                    oVar3.E();
                }
                return true;
            case 4:
            case 8:
            case 13:
                u.v vVar = (u.v) message.obj;
                o<?> oVar4 = this.f1257l.get(vVar.f7640c.g());
                if (oVar4 == null) {
                    oVar4 = i(vVar.f7640c);
                }
                if (!oVar4.P() || this.f1256k.get() == vVar.f7639b) {
                    oVar4.F(vVar.f7638a);
                } else {
                    vVar.f7638a.a(f1242r);
                    oVar4.L();
                }
                return true;
            case 5:
                int r03 = message.arg1;
                s.a aVar = (s.a) message.obj;
                Iterator<o<?>> it2 = this.f1257l.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        o<?> next2 = it2.next();
                        if (next2.r() == r03) {
                            oVar = next2;
                        }
                    }
                }
                if (oVar == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(r03);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                } else if (aVar.j0() == 13) {
                    String d5 = this.f1253h.d(aVar.j0());
                    String k02 = aVar.k0();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(d5).length() + 69 + String.valueOf(k02).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(d5);
                    sb2.append(": ");
                    sb2.append(k02);
                    oVar.e(new Status(17, sb2.toString()));
                } else {
                    bVar = ((o) oVar).f1297c;
                    oVar.e(h(bVar, aVar));
                }
                return true;
            case 6:
                if (this.f1252g.getApplicationContext() instanceof Application) {
                    a.c((Application) this.f1252g.getApplicationContext());
                    a.b().a(new j(this));
                    if (!a.b().e(true)) {
                        this.f1248c = 300000L;
                    }
                }
                return true;
            case 7:
                i((t.e) message.obj);
                return true;
            case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                if (this.f1257l.containsKey(message.obj)) {
                    this.f1257l.get(message.obj).K();
                }
                return true;
            case x1.x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                Iterator<u.b<?>> it3 = this.f1260o.iterator();
                while (it3.hasNext()) {
                    o<?> remove = this.f1257l.remove(it3.next());
                    if (remove != null) {
                        remove.L();
                    }
                }
                this.f1260o.clear();
                return true;
            case 11:
                if (this.f1257l.containsKey(message.obj)) {
                    this.f1257l.get(message.obj).M();
                }
                return true;
            case 12:
                if (this.f1257l.containsKey(message.obj)) {
                    this.f1257l.get(message.obj).b();
                }
                return true;
            case 14:
                i iVar = (i) message.obj;
                u.b<?> a5 = iVar.a();
                if (this.f1257l.containsKey(a5)) {
                    q4 = this.f1257l.get(a5).q(false);
                    b5 = iVar.b();
                    valueOf = Boolean.valueOf(q4);
                } else {
                    b5 = iVar.b();
                    valueOf = Boolean.FALSE;
                }
                b5.c(valueOf);
                return true;
            case 15:
                p pVar = (p) message.obj;
                Map<u.b<?>, o<?>> map = this.f1257l;
                bVar2 = pVar.f1308a;
                if (map.containsKey(bVar2)) {
                    Map<u.b<?>, o<?>> map2 = this.f1257l;
                    bVar3 = pVar.f1308a;
                    o.B(map2.get(bVar3), pVar);
                }
                return true;
            case 16:
                p pVar2 = (p) message.obj;
                Map<u.b<?>, o<?>> map3 = this.f1257l;
                bVar4 = pVar2.f1308a;
                if (map3.containsKey(bVar4)) {
                    Map<u.b<?>, o<?>> map4 = this.f1257l;
                    bVar5 = pVar2.f1308a;
                    o.C(map4.get(bVar5), pVar2);
                }
                return true;
            case x1.x.STRING_VALUE_FIELD_NUMBER /* 17 */:
                k();
                return true;
            case x1.x.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                t tVar = (t) message.obj;
                if (tVar.f1325c == 0) {
                    j().a(new w.v(tVar.f1324b, Arrays.asList(tVar.f1323a)));
                } else {
                    w.v vVar2 = this.f1250e;
                    if (vVar2 != null) {
                        List<w.o> k03 = vVar2.k0();
                        if (vVar2.j0() != tVar.f1324b || (k03 != null && k03.size() >= tVar.f1326d)) {
                            this.f1261p.removeMessages(17);
                            k();
                        } else {
                            this.f1250e.l0(tVar.f1323a);
                        }
                    }
                    if (this.f1250e == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(tVar.f1323a);
                        this.f1250e = new w.v(tVar.f1324b, arrayList);
                        Handler handler2 = this.f1261p;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), tVar.f1325c);
                    }
                }
                return true;
            case 19:
                this.f1249d = false;
                return true;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(r02);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
    }

    public final int m() {
        return this.f1255j.getAndIncrement();
    }

    final o w(u.b<?> bVar) {
        return this.f1257l.get(bVar);
    }
}
