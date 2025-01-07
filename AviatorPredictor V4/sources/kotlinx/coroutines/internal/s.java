package kotlinx.coroutines.internal;

import b4.z1;

/* loaded from: classes.dex */
final class s extends z1 {

    /* renamed from: f, reason: collision with root package name */
    private final Throwable f6457f;

    /* renamed from: g, reason: collision with root package name */
    private final String f6458g;

    public s(Throwable th, String str) {
        this.f6457f = th;
        this.f6458g = str;
    }

    private final Void S() {
        String i4;
        if (this.f6457f == null) {
            r.c();
            throw new k3.d();
        }
        String str = this.f6458g;
        String str2 = "";
        if (str != null && (i4 = kotlin.jvm.internal.i.i(". ", str)) != null) {
            str2 = i4;
        }
        throw new IllegalStateException(kotlin.jvm.internal.i.i("Module with the Main dispatcher had failed to initialize", str2), this.f6457f);
    }

    @Override // b4.g0
    public boolean H(n3.g gVar) {
        S();
        throw new k3.d();
    }

    @Override // b4.z1
    public z1 K() {
        return this;
    }

    @Override // b4.g0
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public Void F(n3.g gVar, Runnable runnable) {
        S();
        throw new k3.d();
    }

    @Override // b4.z1, b4.g0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        Throwable th = this.f6457f;
        sb.append(th != null ? kotlin.jvm.internal.i.i(", cause=", th) : "");
        sb.append(']');
        return sb.toString();
    }
}
