package androidx.fragment.app;

import androidx.lifecycle.d;

/* loaded from: classes.dex */
class r implements androidx.lifecycle.g {

    /* renamed from: e, reason: collision with root package name */
    private androidx.lifecycle.h f482e = null;

    r() {
    }

    void a(d.a aVar) {
        this.f482e.i(aVar);
    }

    @Override // androidx.lifecycle.g
    public androidx.lifecycle.d b() {
        c();
        return this.f482e;
    }

    void c() {
        if (this.f482e == null) {
            this.f482e = new androidx.lifecycle.h(this);
        }
    }

    boolean d() {
        return this.f482e != null;
    }
}
