package k3;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class l<A, B> implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    private final A f6366e;

    /* renamed from: f, reason: collision with root package name */
    private final B f6367f;

    public l(A a5, B b5) {
        this.f6366e = a5;
        this.f6367f = b5;
    }

    public final A a() {
        return this.f6366e;
    }

    public final B b() {
        return this.f6367f;
    }

    public final A c() {
        return this.f6366e;
    }

    public final B d() {
        return this.f6367f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.i.a(this.f6366e, lVar.f6366e) && kotlin.jvm.internal.i.a(this.f6367f, lVar.f6367f);
    }

    public int hashCode() {
        A a5 = this.f6366e;
        int hashCode = (a5 == null ? 0 : a5.hashCode()) * 31;
        B b5 = this.f6367f;
        return hashCode + (b5 != null ? b5.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f6366e + ", " + this.f6367f + ')';
    }
}
