package com.google.firebase.firestore;

import i1.p1;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public class x0 {

    /* renamed from: a, reason: collision with root package name */
    private final FirebaseFirestore f2771a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<m1.f> f2772b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private boolean f2773c = false;

    x0(FirebaseFirestore firebaseFirestore) {
        this.f2771a = (FirebaseFirestore) p1.x.b(firebaseFirestore);
    }

    private x0 e(h hVar, p1 p1Var) {
        this.f2771a.M(hVar);
        g();
        this.f2772b.add(p1Var.a(hVar.l(), m1.m.a(true)));
        return this;
    }

    private void g() {
        if (this.f2773c) {
            throw new IllegalStateException("A write batch can no longer be used after commit() has been called.");
        }
    }

    public o0.h<Void> a() {
        g();
        this.f2773c = true;
        return this.f2772b.size() > 0 ? this.f2771a.s().c0(this.f2772b) : o0.k.d(null);
    }

    public x0 b(h hVar) {
        this.f2771a.M(hVar);
        g();
        this.f2772b.add(new m1.c(hVar.l(), m1.m.f6655c));
        return this;
    }

    public x0 c(h hVar, Object obj) {
        return d(hVar, obj, o0.f2704c);
    }

    public x0 d(h hVar, Object obj, o0 o0Var) {
        this.f2771a.M(hVar);
        p1.x.c(obj, "Provided data must not be null.");
        p1.x.c(o0Var, "Provided options must not be null.");
        g();
        this.f2772b.add((o0Var.b() ? this.f2771a.x().g(obj, o0Var.a()) : this.f2771a.x().l(obj)).a(hVar.l(), m1.m.f6655c));
        return this;
    }

    public x0 f(h hVar, Map<String, Object> map) {
        return e(hVar, this.f2771a.x().n(map));
    }
}
