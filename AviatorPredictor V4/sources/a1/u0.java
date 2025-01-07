package a1;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.bo;
import com.google.android.gms.internal.p000firebaseauthapi.cm;
import com.google.android.gms.internal.p000firebaseauthapi.pm;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.RecaptchaActivity;
import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f123a = "u0";

    /* renamed from: b, reason: collision with root package name */
    private static final u0 f124b = new u0();

    private u0() {
    }

    public static u0 b() {
        return f124b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(FirebaseAuth firebaseAuth, q0 q0Var, Activity activity, o0.i iVar) {
        o0.h a5;
        q0Var.f(firebaseAuth.l().m(), firebaseAuth);
        w.r.i(activity);
        o0.i iVar2 = new o0.i();
        if (a0.a().g(activity, iVar2)) {
            Intent intent = new Intent("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            intent.setClass(activity, RecaptchaActivity.class);
            intent.setPackage(activity.getPackageName());
            intent.putExtra("com.google.firebase.auth.KEY_API_KEY", firebaseAuth.l().r().b());
            if (!TextUtils.isEmpty(firebaseAuth.p())) {
                intent.putExtra("com.google.firebase.auth.KEY_TENANT_ID", firebaseAuth.p());
            }
            intent.putExtra("com.google.firebase.auth.internal.CLIENT_VERSION", pm.a().b());
            intent.putExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME", firebaseAuth.l().q());
            activity.startActivity(intent);
            a5 = iVar2.a();
        } else {
            a5 = o0.k.c(cm.a(new Status(17057, "reCAPTCHA flow already in progress")));
        }
        a5.g(new s0(this, iVar)).e(new r0(this, iVar));
    }

    public final o0.h a(FirebaseAuth firebaseAuth, String str, Activity activity, boolean z4) {
        t0 t0Var;
        l1 l1Var = (l1) firebaseAuth.n();
        k0.e a5 = z4 ? k0.c.a(firebaseAuth.l().m()) : null;
        q0 b5 = q0.b();
        if (!bo.g(firebaseAuth.l()) && !l1Var.h()) {
            o0.i iVar = new o0.i();
            o0.h a6 = b5.a();
            if (a6 != null) {
                if (a6.p()) {
                    t0Var = new t0(null, (String) a6.m());
                } else {
                    String str2 = f123a;
                    Log.e(str2, "Error in previous reCAPTCHA flow: ".concat(String.valueOf(a6.l().getMessage())));
                    Log.e(str2, "Continuing with application verification as normal");
                }
            }
            if (a5 == null || l1Var.f()) {
                e(firebaseAuth, b5, activity, iVar);
            } else {
                x0.e l4 = firebaseAuth.l();
                byte[] bArr = new byte[0];
                if (str != null) {
                    try {
                        bArr = str.getBytes("UTF-8");
                    } catch (UnsupportedEncodingException e5) {
                        Log.e(f123a, "Failed to getBytes with exception: ".concat(String.valueOf(e5.getMessage())));
                    }
                }
                a5.o(bArr, l4.r().b()).g(new d0(this, iVar, firebaseAuth, b5, activity)).e(new c(this, firebaseAuth, b5, activity, iVar));
            }
            return iVar.a();
        }
        t0Var = new t0(null, null);
        return o0.k.d(t0Var);
    }
}
