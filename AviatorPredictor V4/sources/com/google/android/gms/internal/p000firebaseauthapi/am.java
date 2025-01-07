package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.n0;
import w.r;
import z.a;

/* loaded from: classes.dex */
public class am {

    /* renamed from: a, reason: collision with root package name */
    private final zl f1396a;

    /* renamed from: b, reason: collision with root package name */
    private final a f1397b;

    public am(am amVar) {
        this(amVar.f1396a, amVar.f1397b);
    }

    public am(zl zlVar, a aVar) {
        this.f1396a = (zl) r.i(zlVar);
        this.f1397b = (a) r.i(aVar);
    }

    public final void a(String str) {
        try {
            this.f1396a.d(str);
        } catch (RemoteException e5) {
            this.f1397b.b("RemoteException when sending auto retrieval timeout response.", e5, new Object[0]);
        }
    }

    public void b(String str) {
        try {
            this.f1396a.f(str);
        } catch (RemoteException e5) {
            this.f1397b.b("RemoteException when sending send verification code response.", e5, new Object[0]);
        }
    }

    public final void c(fo foVar) {
        try {
            this.f1396a.c(foVar);
        } catch (RemoteException e5) {
            this.f1397b.b("RemoteException when sending create auth uri response.", e5, new Object[0]);
        }
    }

    public final void d() {
        try {
            this.f1396a.e();
        } catch (RemoteException e5) {
            this.f1397b.b("RemoteException when sending delete account response.", e5, new Object[0]);
        }
    }

    public final void e(ni niVar) {
        try {
            this.f1396a.j(niVar);
        } catch (RemoteException e5) {
            this.f1397b.b("RemoteException when sending failure result with credential", e5, new Object[0]);
        }
    }

    public final void f(pi piVar) {
        try {
            this.f1396a.n(piVar);
        } catch (RemoteException e5) {
            this.f1397b.b("RemoteException when sending failure result for mfa", e5, new Object[0]);
        }
    }

    public final void g(Status status, n0 n0Var) {
        try {
            this.f1396a.b(status, n0Var);
        } catch (RemoteException e5) {
            this.f1397b.b("RemoteException when sending failure result.", e5, new Object[0]);
        }
    }

    public void h(Status status) {
        try {
            this.f1396a.m(status);
        } catch (RemoteException e5) {
            this.f1397b.b("RemoteException when sending failure result.", e5, new Object[0]);
        }
    }

    public final void i(bp bpVar, uo uoVar) {
        try {
            this.f1396a.l(bpVar, uoVar);
        } catch (RemoteException e5) {
            this.f1397b.b("RemoteException when sending get token and account info user response", e5, new Object[0]);
        }
    }

    public final void j(np npVar) {
        try {
            this.f1396a.a(npVar);
        } catch (RemoteException e5) {
            this.f1397b.b("RemoteException when sending password reset response.", e5, new Object[0]);
        }
    }

    public final void k() {
        try {
            this.f1396a.h();
        } catch (RemoteException e5) {
            this.f1397b.b("RemoteException when sending email verification response.", e5, new Object[0]);
        }
    }

    public final void l(String str) {
        try {
            this.f1396a.i(str);
        } catch (RemoteException e5) {
            this.f1397b.b("RemoteException when sending set account info response.", e5, new Object[0]);
        }
    }

    public final void m(bp bpVar) {
        try {
            this.f1396a.k(bpVar);
        } catch (RemoteException e5) {
            this.f1397b.b("RemoteException when sending token result.", e5, new Object[0]);
        }
    }

    public final void n(n0 n0Var) {
        try {
            this.f1396a.g(n0Var);
        } catch (RemoteException e5) {
            this.f1397b.b("RemoteException when sending verification completed response.", e5, new Object[0]);
        }
    }
}
