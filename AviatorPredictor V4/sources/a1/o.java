package a1;

import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
final class o implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final String f97e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ p f98f;

    o(p pVar, String str) {
        this.f98f = pVar;
        this.f97e = w.r.e(str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        z.a aVar;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(x0.e.p(this.f97e));
        if (firebaseAuth.m() != null) {
            o0.h g5 = firebaseAuth.g(true);
            aVar = p.f101h;
            aVar.g("Token refreshing started", new Object[0]);
            g5.e(new n(this));
        }
    }
}
