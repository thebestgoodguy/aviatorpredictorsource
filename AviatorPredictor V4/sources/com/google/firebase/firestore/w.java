package com.google.firebase.firestore;

import android.content.Context;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
class w implements x0.f, FirebaseFirestore.a {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, FirebaseFirestore> f2761a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final x0.e f2762b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f2763c;

    /* renamed from: d, reason: collision with root package name */
    private final r1.a<a1.b> f2764d;

    /* renamed from: e, reason: collision with root package name */
    private final r1.a<z0.b> f2765e;

    /* renamed from: f, reason: collision with root package name */
    private final o1.e0 f2766f;

    w(Context context, x0.e eVar, r1.a<a1.b> aVar, r1.a<z0.b> aVar2, o1.e0 e0Var) {
        this.f2763c = context;
        this.f2762b = eVar;
        this.f2764d = aVar;
        this.f2765e = aVar2;
        this.f2766f = e0Var;
        eVar.h(this);
    }

    @Override // com.google.firebase.firestore.FirebaseFirestore.a
    public synchronized void a(String str) {
        this.f2761a.remove(str);
    }

    @Override // x0.f
    public synchronized void b(String str, x0.m mVar) {
        Iterator it = new ArrayList(this.f2761a.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((FirebaseFirestore) entry.getValue()).L();
            p1.b.d(!this.f2761a.containsKey(entry.getKey()), "terminate() should have removed its entry from `instances` for key: %s", entry.getKey());
        }
    }

    synchronized FirebaseFirestore c(String str) {
        FirebaseFirestore firebaseFirestore;
        firebaseFirestore = this.f2761a.get(str);
        if (firebaseFirestore == null) {
            firebaseFirestore = FirebaseFirestore.H(this.f2763c, this.f2762b, this.f2764d, this.f2765e, str, this, this.f2766f);
            this.f2761a.put(str, firebaseFirestore);
        }
        return firebaseFirestore;
    }
}
