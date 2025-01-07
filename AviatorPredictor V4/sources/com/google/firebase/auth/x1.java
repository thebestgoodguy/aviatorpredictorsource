package com.google.firebase.auth;

import android.app.Activity;
import android.util.Log;
import com.google.firebase.auth.p0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class x1 implements o0.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f2586a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f2587b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TimeUnit f2588c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ p0.b f2589d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Activity f2590e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Executor f2591f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f2592g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f2593h;

    x1(FirebaseAuth firebaseAuth, String str, long j4, TimeUnit timeUnit, p0.b bVar, Activity activity, Executor executor, boolean z4) {
        this.f2593h = firebaseAuth;
        this.f2586a = str;
        this.f2587b = j4;
        this.f2588c = timeUnit;
        this.f2589d = bVar;
        this.f2590e = activity;
        this.f2591f = executor;
        this.f2592g = z4;
    }

    @Override // o0.d
    public final void a(o0.h hVar) {
        String a5;
        String str;
        if (hVar.p()) {
            String b5 = ((a1.t0) hVar.m()).b();
            a5 = ((a1.t0) hVar.m()).a();
            str = b5;
        } else {
            Log.e("FirebaseAuth", "Error while validating application identity: ".concat(String.valueOf(hVar.l() != null ? hVar.l().getMessage() : "")));
            Log.e("FirebaseAuth", "Proceeding without any application identifier.");
            a5 = null;
            str = null;
        }
        this.f2593h.Q(this.f2586a, this.f2587b, this.f2588c, this.f2589d, this.f2590e, this.f2591f, this.f2592g, a5, str);
    }
}
