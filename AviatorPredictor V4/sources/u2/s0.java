package u2;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class s0 extends Exception {

    /* renamed from: e, reason: collision with root package name */
    private final String f7779e;

    /* renamed from: f, reason: collision with root package name */
    private final String f7780f;

    /* renamed from: g, reason: collision with root package name */
    private Map<String, Object> f7781g;

    s0(Exception exc, Throwable th) {
        super(exc.getMessage(), th);
        this.f7781g = new HashMap();
        String message = exc.getMessage();
        HashMap hashMap = new HashMap();
        String a5 = exc instanceof com.google.firebase.auth.q ? ((com.google.firebase.auth.q) exc).a() : "UNKNOWN";
        message = exc instanceof com.google.firebase.auth.x ? ((com.google.firebase.auth.x) exc).b() : message;
        if (exc instanceof com.google.firebase.auth.w) {
            com.google.firebase.auth.w wVar = (com.google.firebase.auth.w) exc;
            String b5 = wVar.b();
            if (b5 != null) {
                hashMap.put("email", b5);
            }
            com.google.firebase.auth.h c5 = wVar.c();
            if (c5 != null) {
                hashMap.put("authCredential", r0.m1(c5));
            }
        }
        this.f7779e = a5;
        this.f7780f = message;
        this.f7781g = hashMap;
    }

    s0(String str, String str2) {
        super(str2, null);
        this.f7781g = new HashMap();
        this.f7779e = str;
        this.f7780f = str2;
    }

    s0(String str, String str2, Map<String, Object> map) {
        super(str2, null);
        this.f7781g = new HashMap();
        this.f7779e = str;
        this.f7780f = str2;
        this.f7781g = map;
    }

    static s0 a() {
        return new s0("PROVIDER_ALREADY_LINKED", "User has already been linked to the given provider.");
    }

    static s0 d() {
        return new s0("INVALID_CREDENTIAL", "The supplied auth credential is malformed, has expired or is not currently supported.");
    }

    static s0 e() {
        return new s0("NO_SUCH_PROVIDER", "User was not linked to an account with the given provider.");
    }

    static s0 f() {
        return new s0("NO_CURRENT_USER", "No user currently signed in.");
    }

    public Map<String, Object> b() {
        return this.f7781g;
    }

    public String c() {
        return this.f7779e.toLowerCase(Locale.ROOT).replace("error_", "").replace("_", "-");
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f7780f;
    }
}
