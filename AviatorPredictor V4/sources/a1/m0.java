package a1;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.internal.p000firebaseauthapi.bp;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    private volatile int f79a;

    /* renamed from: b, reason: collision with root package name */
    private final p f80b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f81c;

    public m0(x0.e eVar) {
        Context m4 = eVar.m();
        p pVar = new p(eVar);
        this.f81c = false;
        this.f79a = 0;
        this.f80b = pVar;
        com.google.android.gms.common.api.internal.a.c((Application) m4.getApplicationContext());
        com.google.android.gms.common.api.internal.a.b().a(new l0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g() {
        return this.f79a > 0 && !this.f81c;
    }

    public final void c() {
        this.f80b.b();
    }

    public final void d(int r22) {
        if (r22 > 0 && this.f79a == 0) {
            this.f79a = r22;
            if (g()) {
                this.f80b.c();
            }
        } else if (r22 == 0 && this.f79a != 0) {
            this.f80b.b();
        }
        this.f79a = r22;
    }

    public final void e(bp bpVar) {
        if (bpVar == null) {
            return;
        }
        long j02 = bpVar.j0();
        if (j02 <= 0) {
            j02 = 3600;
        }
        long k02 = bpVar.k0();
        p pVar = this.f80b;
        pVar.f103b = k02 + (j02 * 1000);
        pVar.f104c = -1L;
        if (g()) {
            this.f80b.c();
        }
    }
}
