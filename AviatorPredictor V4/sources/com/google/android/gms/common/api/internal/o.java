package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import t.a;
import t.a.d;
import t.f;

/* loaded from: classes.dex */
public final class o<O extends a.d> implements f.a, f.b {

    /* renamed from: b, reason: collision with root package name */
    @NotOnlyInitialized
    private final a.f f1296b;

    /* renamed from: c, reason: collision with root package name */
    private final u.b<O> f1297c;

    /* renamed from: d, reason: collision with root package name */
    private final g f1298d;

    /* renamed from: g, reason: collision with root package name */
    private final int f1301g;

    /* renamed from: h, reason: collision with root package name */
    private final u.a0 f1302h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1303i;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ c f1307m;

    /* renamed from: a, reason: collision with root package name */
    private final Queue<a0> f1295a = new LinkedList();

    /* renamed from: e, reason: collision with root package name */
    private final Set<u.c0> f1299e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final Map<u.f<?>, u.w> f1300f = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private final List<p> f1304j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private s.a f1305k = null;

    /* renamed from: l, reason: collision with root package name */
    private int f1306l = 0;

    public o(c cVar, t.e<O> eVar) {
        this.f1307m = cVar;
        a.f k4 = eVar.k(cVar.f1261p.getLooper(), this);
        this.f1296b = k4;
        this.f1297c = eVar.g();
        this.f1298d = new g();
        this.f1301g = eVar.j();
        if (k4.m()) {
            this.f1302h = eVar.l(cVar.f1252g, cVar.f1261p);
        } else {
            this.f1302h = null;
        }
    }

    static /* bridge */ /* synthetic */ void B(o oVar, p pVar) {
        if (oVar.f1304j.contains(pVar) && !oVar.f1303i) {
            if (oVar.f1296b.d()) {
                oVar.i();
            } else {
                oVar.E();
            }
        }
    }

    static /* bridge */ /* synthetic */ void C(o oVar, p pVar) {
        s.c cVar;
        s.c[] g5;
        if (oVar.f1304j.remove(pVar)) {
            oVar.f1307m.f1261p.removeMessages(15, pVar);
            oVar.f1307m.f1261p.removeMessages(16, pVar);
            cVar = pVar.f1309b;
            ArrayList arrayList = new ArrayList(oVar.f1295a.size());
            for (a0 a0Var : oVar.f1295a) {
                if ((a0Var instanceof u.s) && (g5 = ((u.s) a0Var).g(oVar)) != null && b0.b.b(g5, cVar)) {
                    arrayList.add(a0Var);
                }
            }
            int size = arrayList.size();
            for (int r22 = 0; r22 < size; r22++) {
                a0 a0Var2 = (a0) arrayList.get(r22);
                oVar.f1295a.remove(a0Var2);
                a0Var2.b(new t.m(cVar));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final s.c c(s.c[] cVarArr) {
        if (cVarArr != null && cVarArr.length != 0) {
            s.c[] c5 = this.f1296b.c();
            if (c5 == null) {
                c5 = new s.c[0];
            }
            e.a aVar = new e.a(c5.length);
            for (s.c cVar : c5) {
                aVar.put(cVar.j0(), Long.valueOf(cVar.k0()));
            }
            for (s.c cVar2 : cVarArr) {
                Long l4 = (Long) aVar.get(cVar2.j0());
                if (l4 == null || l4.longValue() < cVar2.k0()) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    private final void d(s.a aVar) {
        Iterator<u.c0> it = this.f1299e.iterator();
        while (it.hasNext()) {
            it.next().b(this.f1297c, aVar, w.p.a(aVar, s.a.f7474i) ? this.f1296b.e() : null);
        }
        this.f1299e.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(Status status) {
        w.r.d(this.f1307m.f1261p);
        g(status, null, false);
    }

    private final void g(Status status, Exception exc, boolean z4) {
        w.r.d(this.f1307m.f1261p);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator<a0> it = this.f1295a.iterator();
        while (it.hasNext()) {
            a0 next = it.next();
            if (!z4 || next.f1237a == 2) {
                if (status != null) {
                    next.a(status);
                } else {
                    next.b(exc);
                }
                it.remove();
            }
        }
    }

    private final void i() {
        ArrayList arrayList = new ArrayList(this.f1295a);
        int size = arrayList.size();
        for (int r22 = 0; r22 < size; r22++) {
            a0 a0Var = (a0) arrayList.get(r22);
            if (!this.f1296b.d()) {
                return;
            }
            if (o(a0Var)) {
                this.f1295a.remove(a0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        D();
        d(s.a.f7474i);
        n();
        Iterator<u.w> it = this.f1300f.values().iterator();
        if (it.hasNext()) {
            u.i<a.b, ?> iVar = it.next().f7641a;
            throw null;
        }
        i();
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(int r4) {
        D();
        this.f1303i = true;
        this.f1298d.e(r4, this.f1296b.h());
        c cVar = this.f1307m;
        cVar.f1261p.sendMessageDelayed(Message.obtain(cVar.f1261p, 9, this.f1297c), this.f1307m.f1246a);
        c cVar2 = this.f1307m;
        cVar2.f1261p.sendMessageDelayed(Message.obtain(cVar2.f1261p, 11, this.f1297c), this.f1307m.f1247b);
        this.f1307m.f1254i.c();
        Iterator<u.w> it = this.f1300f.values().iterator();
        while (it.hasNext()) {
            it.next().f7642b.run();
        }
    }

    private final void l() {
        this.f1307m.f1261p.removeMessages(12, this.f1297c);
        c cVar = this.f1307m;
        cVar.f1261p.sendMessageDelayed(cVar.f1261p.obtainMessage(12, this.f1297c), this.f1307m.f1248c);
    }

    private final void m(a0 a0Var) {
        a0Var.d(this.f1298d, P());
        try {
            a0Var.c(this);
        } catch (DeadObjectException unused) {
            f(1);
            this.f1296b.l("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void n() {
        if (this.f1303i) {
            this.f1307m.f1261p.removeMessages(11, this.f1297c);
            this.f1307m.f1261p.removeMessages(9, this.f1297c);
            this.f1303i = false;
        }
    }

    private final boolean o(a0 a0Var) {
        if (!(a0Var instanceof u.s)) {
            m(a0Var);
            return true;
        }
        u.s sVar = (u.s) a0Var;
        s.c c5 = c(sVar.g(this));
        if (c5 == null) {
            m(a0Var);
            return true;
        }
        String name = this.f1296b.getClass().getName();
        String j02 = c5.j0();
        long k02 = c5.k0();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(j02).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(j02);
        sb.append(", ");
        sb.append(k02);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (!this.f1307m.f1262q || !sVar.f(this)) {
            sVar.b(new t.m(c5));
            return true;
        }
        p pVar = new p(this.f1297c, c5, null);
        int indexOf = this.f1304j.indexOf(pVar);
        if (indexOf >= 0) {
            p pVar2 = this.f1304j.get(indexOf);
            this.f1307m.f1261p.removeMessages(15, pVar2);
            c cVar = this.f1307m;
            cVar.f1261p.sendMessageDelayed(Message.obtain(cVar.f1261p, 15, pVar2), this.f1307m.f1246a);
            return false;
        }
        this.f1304j.add(pVar);
        c cVar2 = this.f1307m;
        cVar2.f1261p.sendMessageDelayed(Message.obtain(cVar2.f1261p, 15, pVar), this.f1307m.f1246a);
        c cVar3 = this.f1307m;
        cVar3.f1261p.sendMessageDelayed(Message.obtain(cVar3.f1261p, 16, pVar), this.f1307m.f1247b);
        s.a aVar = new s.a(2, null);
        if (p(aVar)) {
            return false;
        }
        this.f1307m.g(aVar, this.f1301g);
        return false;
    }

    private final boolean p(s.a aVar) {
        synchronized (c.f1244t) {
            c cVar = this.f1307m;
            if (cVar.f1258m == null || !cVar.f1259n.contains(this.f1297c)) {
                return false;
            }
            this.f1307m.f1258m.s(aVar, this.f1301g);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q(boolean z4) {
        w.r.d(this.f1307m.f1261p);
        if (!this.f1296b.d() || this.f1300f.size() != 0) {
            return false;
        }
        if (!this.f1298d.g()) {
            this.f1296b.l("Timing out service connection.");
            return true;
        }
        if (z4) {
            l();
        }
        return false;
    }

    public final void D() {
        w.r.d(this.f1307m.f1261p);
        this.f1305k = null;
    }

    public final void E() {
        s.a aVar;
        w.r.d(this.f1307m.f1261p);
        if (this.f1296b.d() || this.f1296b.b()) {
            return;
        }
        try {
            c cVar = this.f1307m;
            int b5 = cVar.f1254i.b(cVar.f1252g, this.f1296b);
            if (b5 != 0) {
                s.a aVar2 = new s.a(b5, null);
                String name = this.f1296b.getClass().getName();
                String obj = aVar2.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + obj.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(obj);
                Log.w("GoogleApiManager", sb.toString());
                H(aVar2, null);
                return;
            }
            c cVar2 = this.f1307m;
            a.f fVar = this.f1296b;
            r rVar = new r(cVar2, fVar, this.f1297c);
            if (fVar.m()) {
                ((u.a0) w.r.i(this.f1302h)).z(rVar);
            }
            try {
                this.f1296b.g(rVar);
            } catch (SecurityException e5) {
                e = e5;
                aVar = new s.a(10);
                H(aVar, e);
            }
        } catch (IllegalStateException e6) {
            e = e6;
            aVar = new s.a(10);
        }
    }

    public final void F(a0 a0Var) {
        w.r.d(this.f1307m.f1261p);
        if (this.f1296b.d()) {
            if (o(a0Var)) {
                l();
                return;
            } else {
                this.f1295a.add(a0Var);
                return;
            }
        }
        this.f1295a.add(a0Var);
        s.a aVar = this.f1305k;
        if (aVar == null || !aVar.m0()) {
            E();
        } else {
            H(this.f1305k, null);
        }
    }

    final void G() {
        this.f1306l++;
    }

    public final void H(s.a aVar, Exception exc) {
        w.r.d(this.f1307m.f1261p);
        u.a0 a0Var = this.f1302h;
        if (a0Var != null) {
            a0Var.A();
        }
        D();
        this.f1307m.f1254i.c();
        d(aVar);
        if ((this.f1296b instanceof y.e) && aVar.j0() != 24) {
            this.f1307m.f1249d = true;
            c cVar = this.f1307m;
            cVar.f1261p.sendMessageDelayed(cVar.f1261p.obtainMessage(19), 300000L);
        }
        if (aVar.j0() == 4) {
            e(c.f1243s);
            return;
        }
        if (this.f1295a.isEmpty()) {
            this.f1305k = aVar;
            return;
        }
        if (exc != null) {
            w.r.d(this.f1307m.f1261p);
            g(null, exc, false);
            return;
        }
        if (!this.f1307m.f1262q) {
            e(c.h(this.f1297c, aVar));
            return;
        }
        g(c.h(this.f1297c, aVar), null, true);
        if (this.f1295a.isEmpty() || p(aVar) || this.f1307m.g(aVar, this.f1301g)) {
            return;
        }
        if (aVar.j0() == 18) {
            this.f1303i = true;
        }
        if (!this.f1303i) {
            e(c.h(this.f1297c, aVar));
        } else {
            c cVar2 = this.f1307m;
            cVar2.f1261p.sendMessageDelayed(Message.obtain(cVar2.f1261p, 9, this.f1297c), this.f1307m.f1246a);
        }
    }

    public final void I(s.a aVar) {
        w.r.d(this.f1307m.f1261p);
        a.f fVar = this.f1296b;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(valueOf);
        fVar.l(sb.toString());
        H(aVar, null);
    }

    public final void J(u.c0 c0Var) {
        w.r.d(this.f1307m.f1261p);
        this.f1299e.add(c0Var);
    }

    public final void K() {
        w.r.d(this.f1307m.f1261p);
        if (this.f1303i) {
            E();
        }
    }

    public final void L() {
        w.r.d(this.f1307m.f1261p);
        e(c.f1242r);
        this.f1298d.f();
        for (u.f fVar : (u.f[]) this.f1300f.keySet().toArray(new u.f[0])) {
            F(new z(fVar, new o0.i()));
        }
        d(new s.a(4));
        if (this.f1296b.d()) {
            this.f1296b.a(new n(this));
        }
    }

    public final void M() {
        w.r.d(this.f1307m.f1261p);
        if (this.f1303i) {
            n();
            c cVar = this.f1307m;
            e(cVar.f1253h.f(cVar.f1252g) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f1296b.l("Timing out connection while resuming.");
        }
    }

    final boolean O() {
        return this.f1296b.d();
    }

    public final boolean P() {
        return this.f1296b.m();
    }

    @Override // u.h
    public final void a(s.a aVar) {
        H(aVar, null);
    }

    public final boolean b() {
        return q(true);
    }

    @Override // u.c
    public final void f(int r32) {
        if (Looper.myLooper() == this.f1307m.f1261p.getLooper()) {
            k(r32);
        } else {
            this.f1307m.f1261p.post(new l(this, r32));
        }
    }

    @Override // u.c
    public final void h(Bundle bundle) {
        if (Looper.myLooper() == this.f1307m.f1261p.getLooper()) {
            j();
        } else {
            this.f1307m.f1261p.post(new k(this));
        }
    }

    public final int r() {
        return this.f1301g;
    }

    final int s() {
        return this.f1306l;
    }

    public final s.a t() {
        w.r.d(this.f1307m.f1261p);
        return this.f1305k;
    }

    public final a.f v() {
        return this.f1296b;
    }

    public final Map<u.f<?>, u.w> x() {
        return this.f1300f;
    }
}
