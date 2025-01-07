package com.google.firebase.firestore;

/* loaded from: classes.dex */
public class a implements Comparable<a> {

    /* renamed from: e, reason: collision with root package name */
    private final com.google.protobuf.j f2620e;

    private a(com.google.protobuf.j jVar) {
        this.f2620e = jVar;
    }

    public static a g(com.google.protobuf.j jVar) {
        p1.x.c(jVar, "Provided ByteString must not be null.");
        return new a(jVar);
    }

    public static a h(byte[] bArr) {
        p1.x.c(bArr, "Provided bytes array must not be null.");
        return new a(com.google.protobuf.j.w(bArr));
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(a aVar) {
        return p1.g0.i(this.f2620e, aVar.f2620e);
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && this.f2620e.equals(((a) obj).f2620e);
    }

    public int hashCode() {
        return this.f2620e.hashCode();
    }

    public com.google.protobuf.j i() {
        return this.f2620e;
    }

    public byte[] k() {
        return this.f2620e.N();
    }

    public String toString() {
        return "Blob { bytes=" + p1.g0.y(this.f2620e) + " }";
    }
}
