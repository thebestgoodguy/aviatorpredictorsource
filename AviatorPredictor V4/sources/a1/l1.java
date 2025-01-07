package a1;

/* loaded from: classes.dex */
public final class l1 extends com.google.firebase.auth.v {

    /* renamed from: a, reason: collision with root package name */
    private String f74a;

    /* renamed from: b, reason: collision with root package name */
    private String f75b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f76c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f77d = false;

    @Override // com.google.firebase.auth.v
    public final void a(boolean z4) {
        this.f77d = z4;
    }

    @Override // com.google.firebase.auth.v
    public final void b(boolean z4) {
        this.f76c = z4;
    }

    @Override // com.google.firebase.auth.v
    public final void c(String str, String str2) {
        this.f74a = str;
        this.f75b = str2;
    }

    public final String d() {
        return this.f74a;
    }

    public final String e() {
        return this.f75b;
    }

    public final boolean f() {
        return this.f77d;
    }

    public final boolean g() {
        return (this.f74a == null || this.f75b == null) ? false : true;
    }

    public final boolean h() {
        return this.f76c;
    }
}
