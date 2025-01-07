package a1;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.internal.p000firebaseauthapi.cq;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: c, reason: collision with root package name */
    private static a0 f13c;

    /* renamed from: a, reason: collision with root package name */
    private boolean f14a = false;

    /* renamed from: b, reason: collision with root package name */
    private BroadcastReceiver f15b;

    private a0() {
    }

    public static a0 a() {
        if (f13c == null) {
            f13c = new a0();
        }
        return f13c;
    }

    static void e(Context context) {
        a0 a0Var = f13c;
        a0Var.f14a = false;
        if (a0Var.f15b != null) {
            m.a.b(context).e(f13c.f15b);
        }
        f13c.f15b = null;
    }

    private final void h(Activity activity, BroadcastReceiver broadcastReceiver) {
        this.f15b = broadcastReceiver;
        m.a.b(activity).c(broadcastReceiver, new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"));
    }

    private static final com.google.firebase.auth.h i(Intent intent) {
        w.r.i(intent);
        cq cqVar = (cq) x.e.b(intent, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", cq.CREATOR);
        cqVar.m0(true);
        return com.google.firebase.auth.n1.m0(cqVar);
    }

    public final boolean f(Activity activity, o0.i iVar, FirebaseAuth firebaseAuth, com.google.firebase.auth.z zVar) {
        if (this.f14a) {
            return false;
        }
        h(activity, new y(this, activity, iVar, firebaseAuth, zVar));
        this.f14a = true;
        return true;
    }

    public final boolean g(Activity activity, o0.i iVar) {
        if (this.f14a) {
            return false;
        }
        h(activity, new z(this, activity, iVar));
        this.f14a = true;
        return true;
    }
}
