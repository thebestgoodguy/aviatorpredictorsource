package a1;

import android.util.Log;

/* loaded from: classes.dex */
final class r0 implements o0.e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o0.i f113a;

    r0(u0 u0Var, o0.i iVar) {
        this.f113a = iVar;
    }

    @Override // o0.e
    public final void c(Exception exc) {
        String str;
        str = u0.f123a;
        Log.e(str, String.format("Failed to get reCAPTCHA token with error [%s]- calling backend without app verification", exc.getMessage()));
        this.f113a.c(new t0(null, null));
    }
}
