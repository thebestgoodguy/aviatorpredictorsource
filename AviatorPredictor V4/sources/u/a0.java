package u;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import t.a;
import t.f;
import w.r0;

/* loaded from: classes.dex */
public final class a0 extends n0.d implements f.a, f.b {

    /* renamed from: h, reason: collision with root package name */
    private static final a.AbstractC0089a<? extends m0.f, m0.a> f7584h = m0.e.f6625c;

    /* renamed from: a, reason: collision with root package name */
    private final Context f7585a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f7586b;

    /* renamed from: c, reason: collision with root package name */
    private final a.AbstractC0089a<? extends m0.f, m0.a> f7587c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<Scope> f7588d;

    /* renamed from: e, reason: collision with root package name */
    private final w.d f7589e;

    /* renamed from: f, reason: collision with root package name */
    private m0.f f7590f;

    /* renamed from: g, reason: collision with root package name */
    private z f7591g;

    public a0(Context context, Handler handler, w.d dVar) {
        a.AbstractC0089a<? extends m0.f, m0.a> abstractC0089a = f7584h;
        this.f7585a = context;
        this.f7586b = handler;
        this.f7589e = (w.d) w.r.j(dVar, "ClientSettings must not be null");
        this.f7588d = dVar.e();
        this.f7587c = abstractC0089a;
    }

    static /* bridge */ /* synthetic */ void y(a0 a0Var, n0.l lVar) {
        s.a j02 = lVar.j0();
        if (j02.n0()) {
            r0 r0Var = (r0) w.r.i(lVar.k0());
            j02 = r0Var.j0();
            if (j02.n0()) {
                a0Var.f7591g.b(r0Var.k0(), a0Var.f7588d);
                a0Var.f7590f.k();
            } else {
                String valueOf = String.valueOf(j02);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
            }
        }
        a0Var.f7591g.a(j02);
        a0Var.f7590f.k();
    }

    public final void A() {
        m0.f fVar = this.f7590f;
        if (fVar != null) {
            fVar.k();
        }
    }

    @Override // u.h
    public final void a(s.a aVar) {
        this.f7591g.a(aVar);
    }

    @Override // u.c
    public final void f(int r12) {
        this.f7590f.k();
    }

    @Override // u.c
    public final void h(Bundle bundle) {
        this.f7590f.j(this);
    }

    @Override // n0.f
    public final void v(n0.l lVar) {
        this.f7586b.post(new y(this, lVar));
    }

    public final void z(z zVar) {
        m0.f fVar = this.f7590f;
        if (fVar != null) {
            fVar.k();
        }
        this.f7589e.i(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0089a<? extends m0.f, m0.a> abstractC0089a = this.f7587c;
        Context context = this.f7585a;
        Looper looper = this.f7586b.getLooper();
        w.d dVar = this.f7589e;
        this.f7590f = abstractC0089a.a(context, looper, dVar, dVar.f(), this, this);
        this.f7591g = zVar;
        Set<Scope> set = this.f7588d;
        if (set == null || set.isEmpty()) {
            this.f7586b.post(new x(this));
        } else {
            this.f7590f.n();
        }
    }
}
