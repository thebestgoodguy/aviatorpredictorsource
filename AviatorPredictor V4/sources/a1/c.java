package a1;

import android.app.Activity;
import android.util.Log;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
final class c implements o0.e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f18a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q0 f19b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Activity f20c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ o0.i f21d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ u0 f22e;

    c(u0 u0Var, FirebaseAuth firebaseAuth, q0 q0Var, Activity activity, o0.i iVar) {
        this.f22e = u0Var;
        this.f18a = firebaseAuth;
        this.f19b = q0Var;
        this.f20c = activity;
        this.f21d = iVar;
    }

    @Override // o0.e
    public final void c(Exception exc) {
        String str;
        str = u0.f123a;
        Log.e(str, "Problem retrieving SafetyNet Token: ".concat(String.valueOf(exc.getMessage())));
        this.f22e.e(this.f18a, this.f19b, this.f20c, this.f21d);
    }
}
