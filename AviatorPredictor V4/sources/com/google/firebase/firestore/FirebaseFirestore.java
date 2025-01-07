package com.google.firebase.firestore;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.firestore.t0;
import com.google.firebase.firestore.u;
import com.google.firebase.firestore.v;
import i1.g1;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import k1.u2;

/* loaded from: classes.dex */
public class FirebaseFirestore {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2607a;

    /* renamed from: b, reason: collision with root package name */
    private final l1.f f2608b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2609c;

    /* renamed from: d, reason: collision with root package name */
    private final g1.a<g1.j> f2610d;

    /* renamed from: e, reason: collision with root package name */
    private final g1.a<String> f2611e;

    /* renamed from: f, reason: collision with root package name */
    private final p1.g f2612f;

    /* renamed from: g, reason: collision with root package name */
    private final x0.e f2613g;

    /* renamed from: h, reason: collision with root package name */
    private final v0 f2614h;

    /* renamed from: i, reason: collision with root package name */
    private final a f2615i;

    /* renamed from: j, reason: collision with root package name */
    private e1.a f2616j;

    /* renamed from: k, reason: collision with root package name */
    private v f2617k = new v.b().e();

    /* renamed from: l, reason: collision with root package name */
    private volatile i1.l0 f2618l;

    /* renamed from: m, reason: collision with root package name */
    private final o1.e0 f2619m;

    public interface a {
        void a(String str);
    }

    FirebaseFirestore(Context context, l1.f fVar, String str, g1.a<g1.j> aVar, g1.a<String> aVar2, p1.g gVar, x0.e eVar, a aVar3, o1.e0 e0Var) {
        this.f2607a = (Context) p1.x.b(context);
        this.f2608b = (l1.f) p1.x.b((l1.f) p1.x.b(fVar));
        this.f2614h = new v0(fVar);
        this.f2609c = (String) p1.x.b(str);
        this.f2610d = (g1.a) p1.x.b(aVar);
        this.f2611e = (g1.a) p1.x.b(aVar2);
        this.f2612f = (p1.g) p1.x.b(gVar);
        this.f2613g = eVar;
        this.f2615i = aVar3;
        this.f2619m = e0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(o0.i iVar) {
        try {
            if (this.f2618l != null && !this.f2618l.A()) {
                throw new u("Persistence cannot be cleared while the firestore instance is running.", u.a.FAILED_PRECONDITION);
            }
            u2.s(this.f2607a, this.f2608b, this.f2609c);
            iVar.c(null);
        } catch (u e5) {
            iVar.b(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ k0 B(o0.h hVar) {
        i1.x0 x0Var = (i1.x0) hVar.m();
        if (x0Var != null) {
            return new k0(x0Var, this);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object C(t0.a aVar, g1 g1Var) {
        return aVar.a(new t0(g1Var, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ o0.h D(Executor executor, final t0.a aVar, final g1 g1Var) {
        return o0.k.b(executor, new Callable() { // from class: com.google.firebase.firestore.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object C;
                C = FirebaseFirestore.this.C(aVar, g1Var);
                return C;
            }
        });
    }

    private v G(v vVar, e1.a aVar) {
        return vVar;
    }

    static FirebaseFirestore H(Context context, x0.e eVar, r1.a<a1.b> aVar, r1.a<z0.b> aVar2, String str, a aVar3, o1.e0 e0Var) {
        String g5 = eVar.r().g();
        if (g5 == null) {
            throw new IllegalArgumentException("FirebaseOptions.getProjectId() cannot be null");
        }
        l1.f g6 = l1.f.g(g5, str);
        p1.g gVar = new p1.g();
        return new FirebaseFirestore(context, g6, eVar.q(), new g1.i(aVar), new g1.e(aVar2), gVar, eVar, aVar3, e0Var);
    }

    private <ResultT> o0.h<ResultT> J(u0 u0Var, final t0.a<ResultT> aVar, final Executor executor) {
        q();
        return this.f2618l.Z(u0Var, new p1.t() { // from class: com.google.firebase.firestore.t
            @Override // p1.t
            public final Object d(Object obj) {
                o0.h D;
                D = FirebaseFirestore.this.D(executor, aVar, (g1) obj);
                return D;
            }
        });
    }

    private a0 h(Executor executor, Activity activity, final Runnable runnable) {
        q();
        final i1.h hVar = new i1.h(executor, new j() { // from class: com.google.firebase.firestore.o
            @Override // com.google.firebase.firestore.j
            public final void a(Object obj, u uVar) {
                FirebaseFirestore.y(runnable, (Void) obj, uVar);
            }
        });
        this.f2618l.t(hVar);
        return i1.d.c(activity, new a0() { // from class: com.google.firebase.firestore.p
            @Override // com.google.firebase.firestore.a0
            public final void remove() {
                FirebaseFirestore.this.z(hVar);
            }
        });
    }

    private void q() {
        if (this.f2618l != null) {
            return;
        }
        synchronized (this.f2608b) {
            if (this.f2618l != null) {
                return;
            }
            this.f2618l = new i1.l0(this.f2607a, new i1.m(this.f2608b, this.f2609c, this.f2617k.b(), this.f2617k.d()), this.f2617k, this.f2610d, this.f2611e, this.f2612f, this.f2619m);
        }
    }

    @Keep
    static void setClientLanguage(String str) {
        o1.u.p(str);
    }

    public static FirebaseFirestore u(x0.e eVar) {
        return v(eVar, "(default)");
    }

    private static FirebaseFirestore v(x0.e eVar, String str) {
        p1.x.c(eVar, "Provided FirebaseApp must not be null.");
        w wVar = (w) eVar.k(w.class);
        p1.x.c(wVar, "Firestore component is not present.");
        return wVar.c(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y(Runnable runnable, Void r22, u uVar) {
        p1.b.d(uVar == null, "snapshots-in-sync listeners should never get errors.", new Object[0]);
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(i1.h hVar) {
        hVar.d();
        this.f2618l.W(hVar);
    }

    public c0 E(InputStream inputStream) {
        q();
        c0 c0Var = new c0();
        this.f2618l.V(inputStream, c0Var);
        return c0Var;
    }

    public c0 F(byte[] bArr) {
        return E(new ByteArrayInputStream(bArr));
    }

    public <TResult> o0.h<TResult> I(u0 u0Var, t0.a<TResult> aVar) {
        p1.x.c(aVar, "Provided transaction update function must not be null.");
        return J(u0Var, aVar, g1.g());
    }

    public void K(v vVar) {
        v G = G(vVar, this.f2616j);
        synchronized (this.f2608b) {
            p1.x.c(G, "Provided settings must not be null.");
            if (this.f2618l != null && !this.f2617k.equals(G)) {
                throw new IllegalStateException("FirebaseFirestore has already been started and its settings can no longer be changed. You can only call setFirestoreSettings() before calling any other methods on a FirebaseFirestore object.");
            }
            this.f2617k = G;
        }
    }

    public o0.h<Void> L() {
        this.f2615i.a(t().i());
        q();
        return this.f2618l.Y();
    }

    void M(h hVar) {
        p1.x.c(hVar, "Provided DocumentReference must not be null.");
        if (hVar.k() != this) {
            throw new IllegalArgumentException("Provided document reference is from a different Cloud Firestore instance.");
        }
    }

    public o0.h<Void> N() {
        return this.f2618l.b0();
    }

    public a0 g(Runnable runnable) {
        return i(p1.p.f7050a, runnable);
    }

    public a0 i(Executor executor, Runnable runnable) {
        return h(executor, null, runnable);
    }

    public x0 j() {
        q();
        return new x0(this);
    }

    public o0.h<Void> k() {
        final o0.i iVar = new o0.i();
        this.f2612f.m(new Runnable() { // from class: com.google.firebase.firestore.q
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseFirestore.this.A(iVar);
            }
        });
        return iVar.a();
    }

    public b l(String str) {
        p1.x.c(str, "Provided collection path must not be null.");
        q();
        return new b(l1.u.x(str), this);
    }

    public k0 m(String str) {
        p1.x.c(str, "Provided collection ID must not be null.");
        if (str.contains("/")) {
            throw new IllegalArgumentException(String.format("Invalid collectionId '%s'. Collection IDs must not contain '/'.", str));
        }
        q();
        return new k0(new i1.x0(l1.u.f6582f, str), this);
    }

    public o0.h<Void> n() {
        q();
        return this.f2618l.u();
    }

    public h o(String str) {
        p1.x.c(str, "Provided document path must not be null.");
        q();
        return h.i(l1.u.x(str), this);
    }

    public o0.h<Void> p() {
        q();
        return this.f2618l.v();
    }

    public x0.e r() {
        return this.f2613g;
    }

    i1.l0 s() {
        return this.f2618l;
    }

    l1.f t() {
        return this.f2608b;
    }

    public o0.h<k0> w(String str) {
        q();
        return this.f2618l.y(str).i(new o0.a() { // from class: com.google.firebase.firestore.s
            @Override // o0.a
            public final Object a(o0.h hVar) {
                k0 B;
                B = FirebaseFirestore.this.B(hVar);
                return B;
            }
        });
    }

    v0 x() {
        return this.f2614h;
    }
}
