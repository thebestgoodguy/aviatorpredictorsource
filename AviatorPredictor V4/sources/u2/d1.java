package u2;

import android.app.Activity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.o0;
import com.google.firebase.auth.p0;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import r2.c;

/* loaded from: classes.dex */
public class d1 implements c.d {

    /* renamed from: k, reason: collision with root package name */
    private static final HashMap<Integer, p0.a> f7688k = new HashMap<>();

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<Activity> f7689a;

    /* renamed from: b, reason: collision with root package name */
    final FirebaseAuth f7690b;

    /* renamed from: c, reason: collision with root package name */
    final String f7691c;

    /* renamed from: d, reason: collision with root package name */
    final com.google.firebase.auth.s0 f7692d;

    /* renamed from: e, reason: collision with root package name */
    final int f7693e;

    /* renamed from: f, reason: collision with root package name */
    final b f7694f;

    /* renamed from: g, reason: collision with root package name */
    final com.google.firebase.auth.k0 f7695g;

    /* renamed from: h, reason: collision with root package name */
    String f7696h;

    /* renamed from: i, reason: collision with root package name */
    Integer f7697i;

    /* renamed from: j, reason: collision with root package name */
    private c.b f7698j;

    class a extends p0.b {
        a() {
        }

        @Override // com.google.firebase.auth.p0.b
        public void a(String str) {
            HashMap hashMap = new HashMap();
            hashMap.put("verificationId", str);
            hashMap.put("name", "Auth#phoneCodeAutoRetrievalTimeout");
            if (d1.this.f7698j != null) {
                d1.this.f7698j.a(hashMap);
            }
        }

        @Override // com.google.firebase.auth.p0.b
        public void b(String str, p0.a aVar) {
            int hashCode = aVar.hashCode();
            d1.f7688k.put(Integer.valueOf(hashCode), aVar);
            HashMap hashMap = new HashMap();
            hashMap.put("verificationId", str);
            hashMap.put("forceResendingToken", Integer.valueOf(hashCode));
            hashMap.put("name", "Auth#phoneCodeSent");
            if (d1.this.f7698j != null) {
                d1.this.f7698j.a(hashMap);
            }
        }

        @Override // com.google.firebase.auth.p0.b
        public void c(com.google.firebase.auth.n0 n0Var) {
            int hashCode = n0Var.hashCode();
            d1.this.f7694f.a(n0Var);
            HashMap hashMap = new HashMap();
            hashMap.put("token", Integer.valueOf(hashCode));
            if (n0Var.m0() != null) {
                hashMap.put("smsCode", n0Var.m0());
            }
            hashMap.put("name", "Auth#phoneVerificationCompleted");
            if (d1.this.f7698j != null) {
                d1.this.f7698j.a(hashMap);
            }
        }

        @Override // com.google.firebase.auth.p0.b
        public void d(x0.k kVar) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", kVar.getLocalizedMessage());
            hashMap.put("details", r0.o0(kVar));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("error", hashMap);
            hashMap2.put("name", "Auth#phoneVerificationFailed");
            if (d1.this.f7698j != null) {
                d1.this.f7698j.a(hashMap2);
            }
        }
    }

    interface b {
        void a(com.google.firebase.auth.n0 n0Var);
    }

    public d1(Activity activity, Map<String, Object> map, com.google.firebase.auth.k0 k0Var, com.google.firebase.auth.s0 s0Var, b bVar) {
        AtomicReference<Activity> atomicReference = new AtomicReference<>(null);
        this.f7689a = atomicReference;
        atomicReference.set(activity);
        this.f7695g = k0Var;
        this.f7692d = s0Var;
        this.f7690b = r0.k0(map);
        this.f7691c = (String) map.get("phoneNumber");
        Object obj = map.get("timeout");
        Objects.requireNonNull(obj);
        this.f7693e = ((Integer) obj).intValue();
        if (map.containsKey("autoRetrievedSmsCodeForTesting")) {
            this.f7696h = (String) map.get("autoRetrievedSmsCodeForTesting");
        }
        if (map.containsKey("forceResendingToken")) {
            this.f7697i = (Integer) map.get("forceResendingToken");
        }
        this.f7694f = bVar;
    }

    @Override // r2.c.d
    public void a(Object obj) {
        this.f7698j = null;
        this.f7689a.set(null);
    }

    @Override // r2.c.d
    public void b(Object obj, c.b bVar) {
        p0.a aVar;
        this.f7698j = bVar;
        a aVar2 = new a();
        if (this.f7696h != null) {
            this.f7690b.n().c(this.f7691c, this.f7696h);
        }
        o0.a aVar3 = new o0.a(this.f7690b);
        aVar3.b(this.f7689a.get());
        aVar3.c(aVar2);
        String str = this.f7691c;
        if (str != null) {
            aVar3.g(str);
        }
        com.google.firebase.auth.k0 k0Var = this.f7695g;
        if (k0Var != null) {
            aVar3.f(k0Var);
        }
        com.google.firebase.auth.s0 s0Var = this.f7692d;
        if (s0Var != null) {
            aVar3.e(s0Var);
        }
        aVar3.h(Long.valueOf(this.f7693e), TimeUnit.MILLISECONDS);
        Integer num = this.f7697i;
        if (num != null && (aVar = f7688k.get(num)) != null) {
            aVar3.d(aVar);
        }
        com.google.firebase.auth.p0.b(aVar3.a());
    }
}
