package c2;

/* loaded from: classes.dex */
public enum d {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");


    /* renamed from: e, reason: collision with root package name */
    private final String f1155e;

    d(String str) {
        this.f1155e = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f1155e;
    }
}
