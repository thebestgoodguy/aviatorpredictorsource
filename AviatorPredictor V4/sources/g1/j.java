package g1;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final j f3883b = new j(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f3884a;

    public j(String str) {
        this.f3884a = str;
    }

    public String a() {
        return this.f3884a;
    }

    public boolean b() {
        return this.f3884a != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        String str = this.f3884a;
        String str2 = ((j) obj).f3884a;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.f3884a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "User(uid:" + this.f3884a + ")";
    }
}
