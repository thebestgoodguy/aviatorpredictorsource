package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public class j {

    /* renamed from: c, reason: collision with root package name */
    private static final yr f1787c = yr.a();

    /* renamed from: a, reason: collision with root package name */
    protected volatile e0 f1788a;

    /* renamed from: b, reason: collision with root package name */
    private volatile hr f1789b;

    public final int a() {
        if (this.f1789b != null) {
            return ((er) this.f1789b).f1600i.length;
        }
        if (this.f1788a != null) {
            return this.f1788a.k();
        }
        return 0;
    }

    public final hr b() {
        if (this.f1789b != null) {
            return this.f1789b;
        }
        synchronized (this) {
            if (this.f1789b != null) {
                return this.f1789b;
            }
            this.f1789b = this.f1788a == null ? hr.f1739f : this.f1788a.g();
            return this.f1789b;
        }
    }

    protected final void c(e0 e0Var) {
        if (this.f1788a != null) {
            return;
        }
        synchronized (this) {
            if (this.f1788a == null) {
                try {
                    this.f1788a = e0Var;
                    this.f1789b = hr.f1739f;
                } catch (h unused) {
                    this.f1788a = e0Var;
                    this.f1789b = hr.f1739f;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        e0 e0Var = this.f1788a;
        e0 e0Var2 = jVar.f1788a;
        if (e0Var == null && e0Var2 == null) {
            return b().equals(jVar.b());
        }
        if (e0Var != null && e0Var2 != null) {
            return e0Var.equals(e0Var2);
        }
        if (e0Var != null) {
            jVar.c(e0Var.a());
            return e0Var.equals(jVar.f1788a);
        }
        c(e0Var2.a());
        return this.f1788a.equals(e0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
