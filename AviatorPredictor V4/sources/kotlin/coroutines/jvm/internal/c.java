package kotlin.coroutines.jvm.internal;

/* loaded from: classes.dex */
public final class c implements n3.d<Object> {

    /* renamed from: e, reason: collision with root package name */
    public static final c f6375e = new c();

    private c() {
    }

    @Override // n3.d
    public n3.g getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // n3.d
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
