package t;

/* loaded from: classes.dex */
public final class m extends UnsupportedOperationException {

    /* renamed from: e, reason: collision with root package name */
    private final s.c f7565e;

    public m(s.c cVar) {
        this.f7565e = cVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f7565e));
    }
}
