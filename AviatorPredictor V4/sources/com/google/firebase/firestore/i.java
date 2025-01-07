package com.google.firebase.firestore;

import java.util.Map;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final FirebaseFirestore f2663a;

    /* renamed from: b, reason: collision with root package name */
    private final l1.l f2664b;

    /* renamed from: c, reason: collision with root package name */
    private final l1.i f2665c;

    /* renamed from: d, reason: collision with root package name */
    private final p0 f2666d;

    public enum a {
        NONE,
        ESTIMATE,
        PREVIOUS;


        /* renamed from: h, reason: collision with root package name */
        static final a f2670h = NONE;
    }

    i(FirebaseFirestore firebaseFirestore, l1.l lVar, l1.i iVar, boolean z4, boolean z5) {
        this.f2663a = (FirebaseFirestore) p1.x.b(firebaseFirestore);
        this.f2664b = (l1.l) p1.x.b(lVar);
        this.f2665c = iVar;
        this.f2666d = new p0(z5, z4);
    }

    static i b(FirebaseFirestore firebaseFirestore, l1.i iVar, boolean z4, boolean z5) {
        return new i(firebaseFirestore, iVar.getKey(), iVar, z4, z5);
    }

    static i c(FirebaseFirestore firebaseFirestore, l1.l lVar, boolean z4) {
        return new i(firebaseFirestore, lVar, null, z4, false);
    }

    public boolean a() {
        return this.f2665c != null;
    }

    public Map<String, Object> d() {
        return e(a.f2670h);
    }

    public Map<String, Object> e(a aVar) {
        p1.x.c(aVar, "Provided serverTimestampBehavior value must not be null.");
        w0 w0Var = new w0(this.f2663a, aVar);
        l1.i iVar = this.f2665c;
        if (iVar == null) {
            return null;
        }
        return w0Var.b(iVar.k().k());
    }

    public boolean equals(Object obj) {
        l1.i iVar;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar2 = (i) obj;
        return this.f2663a.equals(iVar2.f2663a) && this.f2664b.equals(iVar2.f2664b) && ((iVar = this.f2665c) != null ? iVar.equals(iVar2.f2665c) : iVar2.f2665c == null) && this.f2666d.equals(iVar2.f2666d);
    }

    public p0 f() {
        return this.f2666d;
    }

    public h g() {
        return new h(this.f2664b, this.f2663a);
    }

    public int hashCode() {
        int hashCode = ((this.f2663a.hashCode() * 31) + this.f2664b.hashCode()) * 31;
        l1.i iVar = this.f2665c;
        int hashCode2 = (hashCode + (iVar != null ? iVar.getKey().hashCode() : 0)) * 31;
        l1.i iVar2 = this.f2665c;
        return ((hashCode2 + (iVar2 != null ? iVar2.k().hashCode() : 0)) * 31) + this.f2666d.hashCode();
    }

    public String toString() {
        return "DocumentSnapshot{key=" + this.f2664b + ", metadata=" + this.f2666d + ", doc=" + this.f2665c + '}';
    }
}
