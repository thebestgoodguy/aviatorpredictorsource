package com.google.firebase.firestore;

/* loaded from: classes.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f2710a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f2711b;

    p0(boolean z4, boolean z5) {
        this.f2710a = z4;
        this.f2711b = z5;
    }

    public boolean a() {
        return this.f2710a;
    }

    public boolean b() {
        return this.f2711b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return this.f2710a == p0Var.f2710a && this.f2711b == p0Var.f2711b;
    }

    public int hashCode() {
        return ((this.f2710a ? 1 : 0) * 31) + (this.f2711b ? 1 : 0);
    }

    public String toString() {
        return "SnapshotMetadata{hasPendingWrites=" + this.f2710a + ", isFromCache=" + this.f2711b + '}';
    }
}
