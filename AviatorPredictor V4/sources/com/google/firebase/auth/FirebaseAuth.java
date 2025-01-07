package com.google.firebase.auth;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.bo;
import com.google.android.gms.internal.p000firebaseauthapi.bp;
import com.google.android.gms.internal.p000firebaseauthapi.cm;
import com.google.android.gms.internal.p000firebaseauthapi.hm;
import com.google.android.gms.internal.p000firebaseauthapi.pp;
import com.google.android.gms.internal.p000firebaseauthapi.rn;
import com.google.android.gms.internal.p000firebaseauthapi.sm;
import com.google.android.gms.internal.p000firebaseauthapi.yl;
import com.google.firebase.auth.p0;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class FirebaseAuth implements a1.b {

    /* renamed from: a, reason: collision with root package name */
    private x0.e f2448a;

    /* renamed from: b, reason: collision with root package name */
    private final List f2449b;

    /* renamed from: c, reason: collision with root package name */
    private final List f2450c;

    /* renamed from: d, reason: collision with root package name */
    private List f2451d;

    /* renamed from: e, reason: collision with root package name */
    private yl f2452e;

    /* renamed from: f, reason: collision with root package name */
    private z f2453f;

    /* renamed from: g, reason: collision with root package name */
    private a1.l1 f2454g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f2455h;

    /* renamed from: i, reason: collision with root package name */
    private String f2456i;

    /* renamed from: j, reason: collision with root package name */
    private final Object f2457j;

    /* renamed from: k, reason: collision with root package name */
    private String f2458k;

    /* renamed from: l, reason: collision with root package name */
    private final a1.k0 f2459l;

    /* renamed from: m, reason: collision with root package name */
    private final a1.q0 f2460m;

    /* renamed from: n, reason: collision with root package name */
    private final a1.u0 f2461n;

    /* renamed from: o, reason: collision with root package name */
    private final r1.b f2462o;

    /* renamed from: p, reason: collision with root package name */
    private a1.m0 f2463p;

    /* renamed from: q, reason: collision with root package name */
    private a1.n0 f2464q;

    public interface a {
        void a(FirebaseAuth firebaseAuth);
    }

    public interface b {
        void a(FirebaseAuth firebaseAuth);
    }

    public FirebaseAuth(x0.e eVar, r1.b bVar) {
        bp b5;
        yl ylVar = new yl(eVar);
        a1.k0 k0Var = new a1.k0(eVar.m(), eVar.s());
        a1.q0 b6 = a1.q0.b();
        a1.u0 b7 = a1.u0.b();
        this.f2449b = new CopyOnWriteArrayList();
        this.f2450c = new CopyOnWriteArrayList();
        this.f2451d = new CopyOnWriteArrayList();
        this.f2455h = new Object();
        this.f2457j = new Object();
        this.f2464q = a1.n0.a();
        this.f2448a = (x0.e) w.r.i(eVar);
        this.f2452e = (yl) w.r.i(ylVar);
        a1.k0 k0Var2 = (a1.k0) w.r.i(k0Var);
        this.f2459l = k0Var2;
        this.f2454g = new a1.l1();
        a1.q0 q0Var = (a1.q0) w.r.i(b6);
        this.f2460m = q0Var;
        this.f2461n = (a1.u0) w.r.i(b7);
        this.f2462o = bVar;
        z a5 = k0Var2.a();
        this.f2453f = a5;
        if (a5 != null && (b5 = k0Var2.b(a5)) != null) {
            O(this, this.f2453f, b5, false, false);
        }
        q0Var.d(this);
    }

    public static void M(FirebaseAuth firebaseAuth, z zVar) {
        String str;
        if (zVar != null) {
            str = "Notifying auth state listeners about user ( " + zVar.e() + " ).";
        } else {
            str = "Notifying auth state listeners about a sign-out event.";
        }
        Log.d("FirebaseAuth", str);
        firebaseAuth.f2464q.execute(new v1(firebaseAuth));
    }

    public static void N(FirebaseAuth firebaseAuth, z zVar) {
        String str;
        if (zVar != null) {
            str = "Notifying id token listeners about user ( " + zVar.e() + " ).";
        } else {
            str = "Notifying id token listeners about a sign-out event.";
        }
        Log.d("FirebaseAuth", str);
        firebaseAuth.f2464q.execute(new u1(firebaseAuth, new s1.b(zVar != null ? zVar.G0() : null)));
    }

    static void O(FirebaseAuth firebaseAuth, z zVar, bp bpVar, boolean z4, boolean z5) {
        boolean z6;
        w.r.i(zVar);
        w.r.i(bpVar);
        boolean z7 = true;
        boolean z8 = firebaseAuth.f2453f != null && zVar.e().equals(firebaseAuth.f2453f.e());
        if (z8 || !z5) {
            z zVar2 = firebaseAuth.f2453f;
            if (zVar2 == null) {
                z6 = true;
            } else {
                boolean z9 = !z8 || (zVar2.F0().m0().equals(bpVar.m0()) ^ true);
                z6 = true ^ z8;
                z7 = z9;
            }
            w.r.i(zVar);
            z zVar3 = firebaseAuth.f2453f;
            if (zVar3 == null) {
                firebaseAuth.f2453f = zVar;
            } else {
                zVar3.E0(zVar.n0());
                if (!zVar.p0()) {
                    firebaseAuth.f2453f.D0();
                }
                firebaseAuth.f2453f.K0(zVar.m0().b());
            }
            if (z4) {
                firebaseAuth.f2459l.d(firebaseAuth.f2453f);
            }
            if (z7) {
                z zVar4 = firebaseAuth.f2453f;
                if (zVar4 != null) {
                    zVar4.J0(bpVar);
                }
                N(firebaseAuth, firebaseAuth.f2453f);
            }
            if (z6) {
                M(firebaseAuth, firebaseAuth.f2453f);
            }
            if (z4) {
                firebaseAuth.f2459l.e(zVar, bpVar);
            }
            z zVar5 = firebaseAuth.f2453f;
            if (zVar5 != null) {
                o0(firebaseAuth).e(zVar5.F0());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p0.b S(String str, p0.b bVar) {
        return (this.f2454g.g() && str != null && str.equals(this.f2454g.d())) ? new z1(this, bVar) : bVar;
    }

    private final boolean T(String str) {
        f c5 = f.c(str);
        return (c5 == null || TextUtils.equals(this.f2458k, c5.d())) ? false : true;
    }

    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) x0.e.o().k(FirebaseAuth.class);
    }

    @Keep
    public static FirebaseAuth getInstance(x0.e eVar) {
        return (FirebaseAuth) eVar.k(FirebaseAuth.class);
    }

    public static a1.m0 o0(FirebaseAuth firebaseAuth) {
        if (firebaseAuth.f2463p == null) {
            firebaseAuth.f2463p = new a1.m0((x0.e) w.r.i(firebaseAuth.f2448a));
        }
        return firebaseAuth.f2463p;
    }

    public o0.h<i> A(String str, String str2) {
        w.r.e(str);
        w.r.e(str2);
        return this.f2452e.b(this.f2448a, str, str2, this.f2458k, new b2(this));
    }

    public o0.h<i> B(String str, String str2) {
        return y(k.b(str, str2));
    }

    public void C() {
        K();
        a1.m0 m0Var = this.f2463p;
        if (m0Var != null) {
            m0Var.c();
        }
    }

    public o0.h<i> D(Activity activity, n nVar) {
        w.r.i(nVar);
        w.r.i(activity);
        o0.i iVar = new o0.i();
        if (!this.f2460m.g(activity, iVar, this)) {
            return o0.k.c(cm.a(new Status(17057)));
        }
        this.f2460m.f(activity.getApplicationContext(), this);
        nVar.a(activity);
        return iVar.a();
    }

    public void E() {
        synchronized (this.f2455h) {
            this.f2456i = sm.a();
        }
    }

    public void F(String str, int r4) {
        w.r.e(str);
        boolean z4 = false;
        if (r4 >= 0 && r4 <= 65535) {
            z4 = true;
        }
        w.r.b(z4, "Port number must be in the range 0-65535");
        bo.f(this.f2448a, str, r4);
    }

    public o0.h<String> G(String str) {
        w.r.e(str);
        return this.f2452e.n(this.f2448a, str, this.f2458k);
    }

    public final void K() {
        w.r.i(this.f2459l);
        z zVar = this.f2453f;
        if (zVar != null) {
            a1.k0 k0Var = this.f2459l;
            w.r.i(zVar);
            k0Var.c(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", zVar.e()));
            this.f2453f = null;
        }
        this.f2459l.c("com.google.firebase.auth.FIREBASE_USER");
        N(this, null);
        M(this, null);
    }

    public final void L(z zVar, bp bpVar, boolean z4) {
        O(this, zVar, bpVar, true, false);
    }

    public final void P(o0 o0Var) {
        if (o0Var.k()) {
            FirebaseAuth b5 = o0Var.b();
            String e5 = w.r.e(((a1.j) w.r.i(o0Var.c())).n0() ? o0Var.h() : ((s0) w.r.i(o0Var.f())).e());
            if (o0Var.d() == null || !rn.d(e5, o0Var.e(), (Activity) w.r.i(o0Var.a()), o0Var.i())) {
                b5.f2461n.a(b5, o0Var.h(), (Activity) w.r.i(o0Var.a()), b5.R()).c(new y1(b5, o0Var));
                return;
            }
            return;
        }
        FirebaseAuth b6 = o0Var.b();
        String e6 = w.r.e(o0Var.h());
        long longValue = o0Var.g().longValue();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        p0.b e7 = o0Var.e();
        Activity activity = (Activity) w.r.i(o0Var.a());
        Executor i4 = o0Var.i();
        boolean z4 = o0Var.d() != null;
        if (z4 || !rn.d(e6, e7, activity, i4)) {
            b6.f2461n.a(b6, e6, activity, b6.R()).c(new x1(b6, e6, longValue, timeUnit, e7, activity, i4, z4));
        }
    }

    public final void Q(String str, long j4, TimeUnit timeUnit, p0.b bVar, Activity activity, Executor executor, boolean z4, String str2, String str3) {
        long convert = TimeUnit.SECONDS.convert(j4, timeUnit);
        if (convert < 0 || convert > 120) {
            throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
        }
        this.f2452e.p(this.f2448a, new pp(str, convert, z4, this.f2456i, this.f2458k, str2, R(), str3), S(str, bVar), activity, executor);
    }

    final boolean R() {
        return hm.a(l().m());
    }

    public final o0.h U(z zVar) {
        w.r.i(zVar);
        return this.f2452e.u(zVar, new r1(this, zVar));
    }

    public final o0.h V(z zVar, h0 h0Var, String str) {
        w.r.i(zVar);
        w.r.i(h0Var);
        return h0Var instanceof q0 ? this.f2452e.w(this.f2448a, (q0) h0Var, zVar, str, new b2(this)) : o0.k.c(cm.a(new Status(17499)));
    }

    public final o0.h W(z zVar, boolean z4) {
        if (zVar == null) {
            return o0.k.c(cm.a(new Status(17495)));
        }
        bp F0 = zVar.F0();
        return (!F0.r0() || z4) ? this.f2452e.y(this.f2448a, zVar, F0.n0(), new w1(this)) : o0.k.d(a1.b0.a(F0.m0()));
    }

    public final o0.h X(z zVar, h hVar) {
        w.r.i(hVar);
        w.r.i(zVar);
        return this.f2452e.z(this.f2448a, zVar, hVar.l0(), new c2(this));
    }

    public final o0.h Y(z zVar, h hVar) {
        w.r.i(zVar);
        w.r.i(hVar);
        h l02 = hVar.l0();
        if (!(l02 instanceof j)) {
            return l02 instanceof n0 ? this.f2452e.D(this.f2448a, zVar, (n0) l02, this.f2458k, new c2(this)) : this.f2452e.A(this.f2448a, zVar, l02, zVar.o0(), new c2(this));
        }
        j jVar = (j) l02;
        return "password".equals(jVar.k0()) ? this.f2452e.C(this.f2448a, zVar, jVar.o0(), w.r.e(jVar.p0()), zVar.o0(), new c2(this)) : T(w.r.e(jVar.q0())) ? o0.k.c(cm.a(new Status(17072))) : this.f2452e.B(this.f2448a, zVar, jVar, new c2(this));
    }

    public final o0.h Z(z zVar, a1.o0 o0Var) {
        w.r.i(zVar);
        return this.f2452e.E(this.f2448a, zVar, o0Var);
    }

    public void a(a aVar) {
        this.f2451d.add(aVar);
        this.f2464q.execute(new t1(this, aVar));
    }

    public final o0.h a0(h0 h0Var, a1.j jVar, z zVar) {
        w.r.i(h0Var);
        w.r.i(jVar);
        return this.f2452e.x(this.f2448a, zVar, (q0) h0Var, w.r.e(jVar.m0()), new b2(this));
    }

    public void b(b bVar) {
        this.f2449b.add(bVar);
        ((a1.n0) w.r.i(this.f2464q)).execute(new s1(this, bVar));
    }

    public final o0.h b0(e eVar, String str) {
        w.r.e(str);
        if (this.f2456i != null) {
            if (eVar == null) {
                eVar = e.r0();
            }
            eVar.v0(this.f2456i);
        }
        return this.f2452e.F(this.f2448a, eVar, str);
    }

    public o0.h<Void> c(String str) {
        w.r.e(str);
        return this.f2452e.q(this.f2448a, str, this.f2458k);
    }

    public final o0.h c0(z zVar, String str) {
        w.r.i(zVar);
        w.r.e(str);
        return this.f2452e.g(this.f2448a, zVar, str, new c2(this)).k(new a2(this));
    }

    public o0.h<d> d(String str) {
        w.r.e(str);
        return this.f2452e.r(this.f2448a, str, this.f2458k);
    }

    public final o0.h d0(z zVar, String str) {
        w.r.e(str);
        w.r.i(zVar);
        return this.f2452e.h(this.f2448a, zVar, str, new c2(this));
    }

    @Override // a1.b
    public final String e() {
        z zVar = this.f2453f;
        if (zVar == null) {
            return null;
        }
        return zVar.e();
    }

    public final o0.h e0(z zVar, String str) {
        w.r.i(zVar);
        w.r.e(str);
        return this.f2452e.i(this.f2448a, zVar, str, new c2(this));
    }

    @Override // a1.b
    public void f(a1.a aVar) {
        w.r.i(aVar);
        this.f2450c.remove(aVar);
        n0().d(this.f2450c.size());
    }

    public final o0.h f0(z zVar, String str) {
        w.r.i(zVar);
        w.r.e(str);
        return this.f2452e.j(this.f2448a, zVar, str, new c2(this));
    }

    @Override // a1.b
    public final o0.h g(boolean z4) {
        return W(this.f2453f, z4);
    }

    public final o0.h g0(z zVar, n0 n0Var) {
        w.r.i(zVar);
        w.r.i(n0Var);
        return this.f2452e.k(this.f2448a, zVar, n0Var.clone(), new c2(this));
    }

    @Override // a1.b
    public void h(a1.a aVar) {
        w.r.i(aVar);
        this.f2450c.add(aVar);
        n0().d(this.f2450c.size());
    }

    public final o0.h h0(z zVar, y0 y0Var) {
        w.r.i(zVar);
        w.r.i(y0Var);
        return this.f2452e.l(this.f2448a, zVar, y0Var, new c2(this));
    }

    public o0.h<Void> i(String str, String str2) {
        w.r.e(str);
        w.r.e(str2);
        return this.f2452e.s(this.f2448a, str, str2, this.f2458k);
    }

    public final o0.h i0(String str, String str2, e eVar) {
        w.r.e(str);
        w.r.e(str2);
        if (eVar == null) {
            eVar = e.r0();
        }
        String str3 = this.f2456i;
        if (str3 != null) {
            eVar.v0(str3);
        }
        return this.f2452e.m(str, str2, eVar);
    }

    public o0.h<i> j(String str, String str2) {
        w.r.e(str);
        w.r.e(str2);
        return this.f2452e.t(this.f2448a, str, str2, this.f2458k, new b2(this));
    }

    public o0.h<u0> k(String str) {
        w.r.e(str);
        return this.f2452e.v(this.f2448a, str, this.f2458k);
    }

    public x0.e l() {
        return this.f2448a;
    }

    public z m() {
        return this.f2453f;
    }

    public v n() {
        return this.f2454g;
    }

    public final synchronized a1.m0 n0() {
        return o0(this);
    }

    public String o() {
        String str;
        synchronized (this.f2455h) {
            str = this.f2456i;
        }
        return str;
    }

    public String p() {
        String str;
        synchronized (this.f2457j) {
            str = this.f2458k;
        }
        return str;
    }

    public final r1.b p0() {
        return this.f2462o;
    }

    public void q(a aVar) {
        this.f2451d.remove(aVar);
    }

    public void r(b bVar) {
        this.f2449b.remove(bVar);
    }

    public o0.h<Void> s(String str) {
        w.r.e(str);
        return t(str, null);
    }

    public o0.h<Void> t(String str, e eVar) {
        w.r.e(str);
        if (eVar == null) {
            eVar = e.r0();
        }
        String str2 = this.f2456i;
        if (str2 != null) {
            eVar.v0(str2);
        }
        eVar.w0(1);
        return this.f2452e.G(this.f2448a, str, eVar, this.f2458k);
    }

    public o0.h<Void> u(String str, e eVar) {
        w.r.e(str);
        w.r.i(eVar);
        if (!eVar.j0()) {
            throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
        }
        String str2 = this.f2456i;
        if (str2 != null) {
            eVar.v0(str2);
        }
        return this.f2452e.H(this.f2448a, str, eVar, this.f2458k);
    }

    public void v(String str) {
        w.r.e(str);
        synchronized (this.f2455h) {
            this.f2456i = str;
        }
    }

    public void w(String str) {
        w.r.e(str);
        synchronized (this.f2457j) {
            this.f2458k = str;
        }
    }

    public o0.h<i> x() {
        z zVar = this.f2453f;
        if (zVar == null || !zVar.p0()) {
            return this.f2452e.I(this.f2448a, new b2(this), this.f2458k);
        }
        a1.m1 m1Var = (a1.m1) this.f2453f;
        m1Var.R0(false);
        return o0.k.d(new a1.g1(m1Var));
    }

    public o0.h<i> y(h hVar) {
        w.r.i(hVar);
        h l02 = hVar.l0();
        if (l02 instanceof j) {
            j jVar = (j) l02;
            return !jVar.r0() ? this.f2452e.b(this.f2448a, jVar.o0(), w.r.e(jVar.p0()), this.f2458k, new b2(this)) : T(w.r.e(jVar.q0())) ? o0.k.c(cm.a(new Status(17072))) : this.f2452e.c(this.f2448a, jVar, new b2(this));
        }
        if (l02 instanceof n0) {
            return this.f2452e.d(this.f2448a, (n0) l02, this.f2458k, new b2(this));
        }
        return this.f2452e.J(this.f2448a, l02, this.f2458k, new b2(this));
    }

    public o0.h<i> z(String str) {
        w.r.e(str);
        return this.f2452e.K(this.f2448a, str, this.f2458k, new b2(this));
    }
}
