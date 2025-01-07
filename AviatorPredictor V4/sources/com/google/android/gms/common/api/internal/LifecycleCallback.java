package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import u.h0;

/* loaded from: classes.dex */
public class LifecycleCallback {

    /* renamed from: e, reason: collision with root package name */
    protected final u.e f1231e;

    protected LifecycleCallback(u.e eVar) {
        this.f1231e = eVar;
    }

    public static u.e c(Activity activity) {
        return d(new u.d(activity));
    }

    protected static u.e d(u.d dVar) {
        if (dVar.d()) {
            return h0.r1(dVar.b());
        }
        if (dVar.c()) {
            return u.f0.f(dVar.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static u.e getChimeraLifecycleFragmentImpl(u.d dVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity b() {
        Activity d5 = this.f1231e.d();
        w.r.i(d5);
        return d5;
    }

    public void e(int r12, int r22, Intent intent) {
    }

    public void f(Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Bundle bundle) {
    }

    public void j() {
    }

    public void k() {
    }
}
