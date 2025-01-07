package a1;

import com.google.android.gms.common.api.internal.a;

/* loaded from: classes.dex */
final class l0 implements a.InterfaceC0021a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m0 f73a;

    l0(m0 m0Var) {
        this.f73a = m0Var;
    }

    @Override // com.google.android.gms.common.api.internal.a.InterfaceC0021a
    public final void a(boolean z4) {
        boolean g5;
        p pVar;
        if (z4) {
            this.f73a.f81c = true;
            this.f73a.c();
            return;
        }
        this.f73a.f81c = false;
        g5 = this.f73a.g();
        if (g5) {
            pVar = this.f73a.f80b;
            pVar.c();
        }
    }
}
