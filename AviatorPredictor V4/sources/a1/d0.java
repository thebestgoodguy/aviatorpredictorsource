package a1;

import android.app.Activity;
import com.google.firebase.auth.FirebaseAuth;
import k0.d;

/* loaded from: classes.dex */
final class d0 implements o0.f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o0.i f25a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f26b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ q0 f27c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Activity f28d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ u0 f29e;

    d0(u0 u0Var, o0.i iVar, FirebaseAuth firebaseAuth, q0 q0Var, Activity activity) {
        this.f29e = u0Var;
        this.f25a = iVar;
        this.f26b = firebaseAuth;
        this.f27c = q0Var;
        this.f28d = activity;
    }

    @Override // o0.f
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        d.a aVar = (d.a) obj;
        if (j0.a(aVar)) {
            this.f25a.c(new t0(aVar.c(), null));
        } else {
            this.f29e.e(this.f26b, this.f27c, this.f28d, this.f25a);
        }
    }
}
