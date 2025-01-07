package kotlinx.coroutines.internal;

import b4.m0;

/* loaded from: classes.dex */
public final class e implements m0 {

    /* renamed from: e, reason: collision with root package name */
    private final n3.g f6413e;

    public e(n3.g gVar) {
        this.f6413e = gVar;
    }

    @Override // b4.m0
    public n3.g c() {
        return this.f6413e;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + c() + ')';
    }
}
