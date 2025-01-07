package a1;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: c, reason: collision with root package name */
    private static final q0 f110c = new q0();

    /* renamed from: a, reason: collision with root package name */
    private final h0 f111a;

    /* renamed from: b, reason: collision with root package name */
    private final a0 f112b;

    private q0() {
        h0 b5 = h0.b();
        a0 a5 = a0.a();
        this.f111a = b5;
        this.f112b = a5;
    }

    public static q0 b() {
        return f110c;
    }

    public final o0.h a() {
        return this.f111a.a();
    }

    public final void c(Context context) {
        this.f111a.c(context);
    }

    public final void d(FirebaseAuth firebaseAuth) {
        this.f111a.d(firebaseAuth);
    }

    public final void e(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.k0());
        edit.putString("statusMessage", status.l0());
        edit.putLong("timestamp", b0.f.b().a());
        edit.commit();
    }

    public final void f(Context context, FirebaseAuth firebaseAuth) {
        w.r.i(context);
        w.r.i(firebaseAuth);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("firebaseAppName", firebaseAuth.l().q());
        edit.commit();
    }

    public final boolean g(Activity activity, o0.i iVar, FirebaseAuth firebaseAuth) {
        return this.f112b.f(activity, iVar, firebaseAuth, null);
    }
}
