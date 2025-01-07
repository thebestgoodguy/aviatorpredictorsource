package com.google.protobuf;

/* loaded from: classes.dex */
public class i0 {

    /* renamed from: e, reason: collision with root package name */
    private static final r f2906e = r.b();

    /* renamed from: a, reason: collision with root package name */
    private j f2907a;

    /* renamed from: b, reason: collision with root package name */
    private r f2908b;

    /* renamed from: c, reason: collision with root package name */
    protected volatile v0 f2909c;

    /* renamed from: d, reason: collision with root package name */
    private volatile j f2910d;

    protected void a(v0 v0Var) {
        j jVar;
        if (this.f2909c != null) {
            return;
        }
        synchronized (this) {
            if (this.f2909c != null) {
                return;
            }
            try {
                if (this.f2907a != null) {
                    this.f2909c = v0Var.h().a(this.f2907a, this.f2908b);
                    jVar = this.f2907a;
                } else {
                    this.f2909c = v0Var;
                    jVar = j.f2914f;
                }
                this.f2910d = jVar;
            } catch (e0 unused) {
                this.f2909c = v0Var;
                this.f2910d = j.f2914f;
            }
        }
    }

    public int b() {
        if (this.f2910d != null) {
            return this.f2910d.size();
        }
        j jVar = this.f2907a;
        if (jVar != null) {
            return jVar.size();
        }
        if (this.f2909c != null) {
            return this.f2909c.b();
        }
        return 0;
    }

    public v0 c(v0 v0Var) {
        a(v0Var);
        return this.f2909c;
    }

    public v0 d(v0 v0Var) {
        v0 v0Var2 = this.f2909c;
        this.f2907a = null;
        this.f2910d = null;
        this.f2909c = v0Var;
        return v0Var2;
    }

    public j e() {
        if (this.f2910d != null) {
            return this.f2910d;
        }
        j jVar = this.f2907a;
        if (jVar != null) {
            return jVar;
        }
        synchronized (this) {
            if (this.f2910d != null) {
                return this.f2910d;
            }
            this.f2910d = this.f2909c == null ? j.f2914f : this.f2909c.f();
            return this.f2910d;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        v0 v0Var = this.f2909c;
        v0 v0Var2 = i0Var.f2909c;
        return (v0Var == null && v0Var2 == null) ? e().equals(i0Var.e()) : (v0Var == null || v0Var2 == null) ? v0Var != null ? v0Var.equals(i0Var.c(v0Var.d())) : c(v0Var2.d()).equals(v0Var2) : v0Var.equals(v0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
