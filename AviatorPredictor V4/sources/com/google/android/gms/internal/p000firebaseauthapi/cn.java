package com.google.android.gms.internal.p000firebaseauthapi;

import a1.r;
import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.h;
import com.google.firebase.auth.p0;
import com.google.firebase.auth.z;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import x0.e;

/* loaded from: classes.dex */
abstract class cn implements en {

    /* renamed from: a, reason: collision with root package name */
    protected final int f1471a;

    /* renamed from: c, reason: collision with root package name */
    protected e f1473c;

    /* renamed from: d, reason: collision with root package name */
    protected z f1474d;

    /* renamed from: e, reason: collision with root package name */
    protected Object f1475e;

    /* renamed from: f, reason: collision with root package name */
    protected r f1476f;

    /* renamed from: h, reason: collision with root package name */
    protected Executor f1478h;

    /* renamed from: i, reason: collision with root package name */
    protected bp f1479i;

    /* renamed from: j, reason: collision with root package name */
    protected uo f1480j;

    /* renamed from: k, reason: collision with root package name */
    protected fo f1481k;

    /* renamed from: l, reason: collision with root package name */
    protected np f1482l;

    /* renamed from: m, reason: collision with root package name */
    protected String f1483m;

    /* renamed from: n, reason: collision with root package name */
    protected String f1484n;

    /* renamed from: o, reason: collision with root package name */
    protected h f1485o;

    /* renamed from: p, reason: collision with root package name */
    protected String f1486p;

    /* renamed from: q, reason: collision with root package name */
    protected String f1487q;

    /* renamed from: r, reason: collision with root package name */
    protected pi f1488r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f1489s;

    /* renamed from: t, reason: collision with root package name */
    Object f1490t;

    /* renamed from: u, reason: collision with root package name */
    Status f1491u;

    /* renamed from: v, reason: collision with root package name */
    protected bn f1492v;

    /* renamed from: b, reason: collision with root package name */
    final zm f1472b = new zm(this);

    /* renamed from: g, reason: collision with root package name */
    protected final List f1477g = new ArrayList();

    public cn(int r22) {
        this.f1471a = r22;
    }

    static /* bridge */ /* synthetic */ void j(cn cnVar) {
        cnVar.c();
        w.r.l(cnVar.f1489s, "no success or failure set on method implementation");
    }

    static /* bridge */ /* synthetic */ void k(cn cnVar, Status status) {
        r rVar = cnVar.f1476f;
        if (rVar != null) {
            rVar.b(status);
        }
    }

    public abstract void c();

    public final cn d(Object obj) {
        this.f1475e = w.r.j(obj, "external callback cannot be null");
        return this;
    }

    public final cn e(r rVar) {
        this.f1476f = (r) w.r.j(rVar, "external failure callback cannot be null");
        return this;
    }

    public final cn f(e eVar) {
        this.f1473c = (e) w.r.j(eVar, "firebaseApp cannot be null");
        return this;
    }

    public final cn g(z zVar) {
        this.f1474d = (z) w.r.j(zVar, "firebaseUser cannot be null");
        return this;
    }

    public final cn h(p0.b bVar, Activity activity, Executor executor, String str) {
        p0.b a5 = rn.a(str, bVar, this);
        synchronized (this.f1477g) {
            this.f1477g.add((p0.b) w.r.i(a5));
        }
        if (activity != null) {
            tm.l(activity, this.f1477g);
        }
        this.f1478h = (Executor) w.r.i(executor);
        return this;
    }

    public final void l(Status status) {
        this.f1489s = true;
        this.f1491u = status;
        this.f1492v.a(null, status);
    }

    public final void m(Object obj) {
        this.f1489s = true;
        this.f1490t = obj;
        this.f1492v.a(obj, null);
    }
}
