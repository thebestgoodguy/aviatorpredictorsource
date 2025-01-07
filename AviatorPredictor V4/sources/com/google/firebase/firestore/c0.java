package com.google.firebase.firestore;

import com.google.firebase.firestore.c0;
import com.google.firebase.firestore.d0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class c0 extends o0.h<d0> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f2632a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private d0 f2633b = d0.f2639g;

    /* renamed from: c, reason: collision with root package name */
    private final o0.i<d0> f2634c;

    /* renamed from: d, reason: collision with root package name */
    private final o0.h<d0> f2635d;

    /* renamed from: e, reason: collision with root package name */
    private final Queue<a> f2636e;

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        Executor f2637a;

        /* renamed from: b, reason: collision with root package name */
        f0<d0> f2638b;

        a(Executor executor, f0<d0> f0Var) {
            this.f2637a = executor == null ? o0.j.f6711a : executor;
            this.f2638b = f0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(d0 d0Var) {
            this.f2638b.a(d0Var);
        }

        public void b(final d0 d0Var) {
            this.f2637a.execute(new Runnable() { // from class: com.google.firebase.firestore.b0
                @Override // java.lang.Runnable
                public final void run() {
                    c0.a.this.c(d0Var);
                }
            });
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f2638b.equals(((a) obj).f2638b);
        }

        public int hashCode() {
            return this.f2638b.hashCode();
        }
    }

    public c0() {
        o0.i<d0> iVar = new o0.i<>();
        this.f2634c = iVar;
        this.f2635d = iVar.a();
        this.f2636e = new ArrayDeque();
    }

    @Override // o0.h
    public o0.h<d0> a(Executor executor, o0.c cVar) {
        return this.f2635d.a(executor, cVar);
    }

    @Override // o0.h
    public o0.h<d0> b(Executor executor, o0.d<d0> dVar) {
        return this.f2635d.b(executor, dVar);
    }

    @Override // o0.h
    public o0.h<d0> c(o0.d<d0> dVar) {
        return this.f2635d.c(dVar);
    }

    @Override // o0.h
    public o0.h<d0> d(Executor executor, o0.e eVar) {
        return this.f2635d.d(executor, eVar);
    }

    @Override // o0.h
    public o0.h<d0> e(o0.e eVar) {
        return this.f2635d.e(eVar);
    }

    @Override // o0.h
    public o0.h<d0> f(Executor executor, o0.f<? super d0> fVar) {
        return this.f2635d.f(executor, fVar);
    }

    @Override // o0.h
    public o0.h<d0> g(o0.f<? super d0> fVar) {
        return this.f2635d.g(fVar);
    }

    @Override // o0.h
    public <TContinuationResult> o0.h<TContinuationResult> h(Executor executor, o0.a<d0, TContinuationResult> aVar) {
        return this.f2635d.h(executor, aVar);
    }

    @Override // o0.h
    public <TContinuationResult> o0.h<TContinuationResult> i(o0.a<d0, TContinuationResult> aVar) {
        return this.f2635d.i(aVar);
    }

    @Override // o0.h
    public <TContinuationResult> o0.h<TContinuationResult> j(Executor executor, o0.a<d0, o0.h<TContinuationResult>> aVar) {
        return this.f2635d.j(executor, aVar);
    }

    @Override // o0.h
    public <TContinuationResult> o0.h<TContinuationResult> k(o0.a<d0, o0.h<TContinuationResult>> aVar) {
        return this.f2635d.k(aVar);
    }

    @Override // o0.h
    public Exception l() {
        return this.f2635d.l();
    }

    @Override // o0.h
    public boolean n() {
        return this.f2635d.n();
    }

    @Override // o0.h
    public boolean o() {
        return this.f2635d.o();
    }

    @Override // o0.h
    public boolean p() {
        return this.f2635d.p();
    }

    public c0 q(f0<d0> f0Var) {
        a aVar = new a(null, f0Var);
        synchronized (this.f2632a) {
            this.f2636e.add(aVar);
        }
        return this;
    }

    @Override // o0.h
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public d0 m() {
        return this.f2635d.m();
    }

    public void s(Exception exc) {
        synchronized (this.f2632a) {
            d0 d0Var = new d0(this.f2633b.d(), this.f2633b.g(), this.f2633b.c(), this.f2633b.f(), exc, d0.a.ERROR);
            this.f2633b = d0Var;
            Iterator<a> it = this.f2636e.iterator();
            while (it.hasNext()) {
                it.next().b(d0Var);
            }
            this.f2636e.clear();
        }
        this.f2634c.b(exc);
    }

    public void t(d0 d0Var) {
        p1.b.d(d0Var.e().equals(d0.a.SUCCESS), "Expected success, but was " + d0Var.e(), new Object[0]);
        synchronized (this.f2632a) {
            this.f2633b = d0Var;
            Iterator<a> it = this.f2636e.iterator();
            while (it.hasNext()) {
                it.next().b(this.f2633b);
            }
            this.f2636e.clear();
        }
        this.f2634c.c(d0Var);
    }

    public void u(d0 d0Var) {
        synchronized (this.f2632a) {
            this.f2633b = d0Var;
            Iterator<a> it = this.f2636e.iterator();
            while (it.hasNext()) {
                it.next().b(d0Var);
            }
        }
    }
}
