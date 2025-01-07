package a1;

import com.google.firebase.auth.FirebaseAuth;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends com.google.firebase.auth.g0 {

    /* renamed from: a, reason: collision with root package name */
    private final m1 f38a;

    public f(m1 m1Var) {
        w.r.i(m1Var);
        this.f38a = m1Var;
    }

    @Override // com.google.firebase.auth.g0
    public final o0.h<Void> a(com.google.firebase.auth.h0 h0Var, String str) {
        w.r.i(h0Var);
        m1 m1Var = this.f38a;
        return FirebaseAuth.getInstance(m1Var.C0()).V(m1Var, h0Var, str);
    }

    @Override // com.google.firebase.auth.g0
    public final List<com.google.firebase.auth.i0> b() {
        return this.f38a.O0();
    }

    @Override // com.google.firebase.auth.g0
    public final o0.h<com.google.firebase.auth.k0> c() {
        return this.f38a.k0(false).k(new e(this));
    }

    @Override // com.google.firebase.auth.g0
    public final o0.h<Void> d(String str) {
        w.r.e(str);
        m1 m1Var = this.f38a;
        return FirebaseAuth.getInstance(m1Var.C0()).c0(m1Var, str);
    }
}
