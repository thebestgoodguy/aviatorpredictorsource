package u2;

import android.app.Activity;
import android.net.Uri;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.e;
import com.google.firebase.auth.m0;
import com.google.firebase.auth.y0;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import j2.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import r2.c;
import r2.j;
import u2.d1;
import u2.t0;

/* loaded from: classes.dex */
public class r0 implements FlutterFirebasePlugin, j.c, j2.a, k2.a, t0.d, t0.b {

    /* renamed from: h, reason: collision with root package name */
    static final HashMap<Integer, com.google.firebase.auth.h> f7766h = new HashMap<>();

    /* renamed from: a, reason: collision with root package name */
    private r2.b f7767a;

    /* renamed from: b, reason: collision with root package name */
    private r2.j f7768b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f7769c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<r2.c, c.d> f7770d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, Map<String, com.google.firebase.auth.g0>> f7771e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, com.google.firebase.auth.k0> f7772f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, com.google.firebase.auth.j0> f7773g = new HashMap();

    class a extends HashMap<String, Object> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FirebaseAuth f7774e;

        a(FirebaseAuth firebaseAuth) {
            this.f7774e = firebaseAuth;
            put("languageCode", firebaseAuth.o());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0(Map map, o0.i iVar) {
        Map<String, Object> q12;
        try {
            com.google.firebase.auth.z n02 = n0(map);
            Object obj = map.get("forceRefresh");
            Objects.requireNonNull(obj);
            Boolean bool = (Boolean) obj;
            Object obj2 = map.get("tokenOnly");
            Objects.requireNonNull(obj2);
            Boolean bool2 = (Boolean) obj2;
            if (n02 == null) {
                iVar.b(s0.f());
                return;
            }
            com.google.firebase.auth.b0 b0Var = (com.google.firebase.auth.b0) o0.k.a(n02.k0(bool.booleanValue()));
            if (bool2.booleanValue()) {
                q12 = new HashMap<>();
                q12.put("token", b0Var.g());
            } else {
                q12 = q1(b0Var);
            }
            iVar.c(q12);
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    private o0.h<Void> A1(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.p0
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.M0(map, iVar);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void B0(x0.e eVar, o0.i iVar) {
        try {
            HashMap hashMap = new HashMap();
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(eVar);
            com.google.firebase.auth.z m4 = firebaseAuth.m();
            String o4 = firebaseAuth.o();
            Map<String, Object> o12 = m4 == null ? null : o1(m4);
            if (o4 != null) {
                hashMap.put("APP_LANGUAGE_CODE", o4);
            }
            if (o12 != null) {
                hashMap.put("APP_CURRENT_USER", o12);
            }
            iVar.c(hashMap);
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    private o0.h<Map<String, Object>> B1(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.m
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.N0(map, iVar);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C0(t0.i iVar, o0.h hVar) {
        if (!hVar.p()) {
            iVar.b(hVar.l());
            return;
        }
        com.google.firebase.auth.k0 k0Var = (com.google.firebase.auth.k0) hVar.m();
        String str = UUID.randomUUID().toString();
        this.f7772f.put(str, k0Var);
        iVar.a(new t0.g.a().b(str).a());
    }

    private o0.h<Void> C1(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.c
            @Override // java.lang.Runnable
            public final void run() {
                r0.O0(map, iVar);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D0(Map map, o0.i iVar) {
        try {
            com.google.firebase.auth.z n02 = n0(map);
            com.google.firebase.auth.h l02 = l0(map);
            if (n02 == null) {
                iVar.b(s0.f());
            } else if (l02 == null) {
                iVar.b(s0.d());
            } else {
                iVar.c(n1((com.google.firebase.auth.i) o0.k.a(n02.q0(l02))));
            }
        } catch (Exception e5) {
            String message = e5.getMessage();
            if (message == null || !message.contains("User has already been linked to the given provider.")) {
                iVar.b(e5);
            } else {
                iVar.b(s0.a());
            }
        }
    }

    private o0.h<Map<String, Object>> D1(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.i
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.P0(map, iVar);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void E0(j.d dVar, o0.h hVar) {
        if (hVar.p()) {
            dVar.a(hVar.m());
        } else {
            Exception l4 = hVar.l();
            dVar.b("firebase_auth", l4 != null ? l4.getMessage() : null, o0(l4));
        }
    }

    private o0.h<Map<String, Object>> E1(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.x
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.Q0(map, iVar);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F0(Map map, o0.i iVar) {
        try {
            com.google.firebase.auth.z n02 = n0(map);
            com.google.firebase.auth.h l02 = l0(map);
            if (n02 == null) {
                iVar.b(s0.f());
            } else if (l02 == null) {
                iVar.b(s0.d());
            } else {
                iVar.c(n1((com.google.firebase.auth.i) o0.k.a(n02.r0(l02))));
            }
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    private o0.h<Map<String, Object>> F1(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.l
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.R0(map, iVar);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G0(Map map, o0.i iVar) {
        try {
            FirebaseAuth k02 = k0(map);
            b bVar = new b(k02);
            String str = "plugins.flutter.io/firebase_auth/auth-state/" + k02.l().q();
            r2.c cVar = new r2.c(this.f7767a, str);
            cVar.d(bVar);
            this.f7770d.put(cVar, bVar);
            iVar.c(str);
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    private o0.h<Map<String, Object>> G1(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.b0
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.S0(map, iVar);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H0(Map map, o0.i iVar) {
        try {
            FirebaseAuth k02 = k0(map);
            c1 c1Var = new c1(k02);
            String str = "plugins.flutter.io/firebase_auth/id-token/" + k02.l().q();
            r2.c cVar = new r2.c(this.f7767a, str);
            cVar.d(c1Var);
            this.f7770d.put(cVar, c1Var);
            iVar.c(str);
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    private o0.h<Map<String, Object>> H1(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.t
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.T0(map, iVar);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0(Map map, o0.i iVar) {
        try {
            com.google.firebase.auth.z n02 = n0(map);
            if (n02 == null) {
                iVar.b(s0.f());
            } else {
                o0.k.a(n02.s0());
                iVar.c(o1(n0(map)));
            }
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    private o0.h<Map<String, Object>> I1(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.s
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.U0(map, iVar);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0(t0.i iVar, o0.h hVar) {
        if (hVar.p()) {
            iVar.a(n1((com.google.firebase.auth.i) hVar.m()));
        } else {
            iVar.b(hVar.l());
        }
    }

    private o0.h<Void> J1(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.m0
            @Override // java.lang.Runnable
            public final void run() {
                r0.V0(map, iVar);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0(Map map, o0.i iVar) {
        try {
            com.google.firebase.auth.z n02 = n0(map);
            if (n02 == null) {
                iVar.b(s0.f());
                return;
            }
            Object obj = map.get("actionCodeSettings");
            if (obj == null) {
                o0.k.a(n02.t0());
                iVar.c(null);
            } else {
                o0.k.a(n02.u0(h0((Map) obj)));
                iVar.c(null);
            }
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    private o0.h<Map<String, Object>> K1(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.d
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.X0(map, iVar);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0(Map map, o0.i iVar) {
        try {
            FirebaseAuth k02 = k0(map);
            Object obj = map.get("email");
            Objects.requireNonNull(obj);
            String str = (String) obj;
            Object obj2 = map.get("actionCodeSettings");
            if (obj2 == null) {
                o0.k.a(k02.s(str));
                iVar.c(null);
            } else {
                o0.k.a(k02.t(str, h0((Map) obj2)));
                iVar.c(null);
            }
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    private o0.h<Map<String, Object>> L1(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.p
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.Y0(map, iVar);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M0(Map map, o0.i iVar) {
        try {
            FirebaseAuth k02 = k0(map);
            Object obj = map.get("email");
            Objects.requireNonNull(obj);
            Object obj2 = map.get("actionCodeSettings");
            Objects.requireNonNull(obj2);
            o0.k.a(k02.u((String) obj, h0((Map) obj2)));
            iVar.c(null);
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    private o0.h<Map<String, Object>> M1(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.r
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.Z0(map, iVar);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N0(Map map, o0.i iVar) {
        try {
            FirebaseAuth k02 = k0(map);
            String str = (String) map.get("languageCode");
            if (str == null) {
                k02.E();
            } else {
                k02.v(str);
            }
            iVar.c(new a(k02));
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    private o0.h<Map<String, Object>> N1(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.a0
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.a1(map, iVar);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void O0(Map map, o0.i iVar) {
        try {
            FirebaseAuth k02 = k0(map);
            Boolean bool = (Boolean) map.get("appVerificationDisabledForTesting");
            Boolean bool2 = (Boolean) map.get("forceRecaptchaFlow");
            String str = (String) map.get("phoneNumber");
            String str2 = (String) map.get("smsCode");
            if (bool != null) {
                k02.n().b(bool.booleanValue());
            }
            if (bool2 != null) {
                k02.n().a(bool2.booleanValue());
            }
            if (str != null && str2 != null) {
                k02.n().c(str, str2);
            }
            iVar.c(null);
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    private o0.h<Map<String, Object>> O1(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.f
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.b1(map, iVar);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P0(Map map, o0.i iVar) {
        try {
            iVar.c(n1((com.google.firebase.auth.i) o0.k.a(k0(map).x())));
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    private o0.h<Void> P1(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.n
            @Override // java.lang.Runnable
            public final void run() {
                r0.c1(map, iVar);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q0(Map map, o0.i iVar) {
        try {
            FirebaseAuth k02 = k0(map);
            Object obj = map.get("signInProvider");
            Objects.requireNonNull(obj);
            iVar.c(n1((com.google.firebase.auth.i) o0.k.a(k02.D(this.f7769c, com.google.firebase.auth.m0.b((String) obj).a()))));
        } catch (Exception e5) {
            if (e5.getCause() instanceof com.google.firebase.auth.t) {
                q0(map, iVar, e5);
            } else {
                iVar.b(e5);
            }
        }
    }

    private o0.h<Void> Q1(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.h
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.d1(map, iVar);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R0(Map map, o0.i iVar) {
        try {
            FirebaseAuth k02 = k0(map);
            com.google.firebase.auth.h l02 = l0(map);
            if (l02 == null) {
                throw s0.d();
            }
            iVar.c(n1((com.google.firebase.auth.i) o0.k.a(k02.y(l02))));
        } catch (Exception e5) {
            if (e5.getCause() instanceof com.google.firebase.auth.t) {
                q0(map, iVar, e5);
            } else {
                iVar.b(e5);
            }
        }
    }

    private o0.h<Map<String, Object>> R1(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.l0
            @Override // java.lang.Runnable
            public final void run() {
                r0.e1(map, iVar);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S0(Map map, o0.i iVar) {
        try {
            FirebaseAuth k02 = k0(map);
            Object obj = map.get("token");
            Objects.requireNonNull(obj);
            iVar.c(n1((com.google.firebase.auth.i) o0.k.a(k02.z((String) obj))));
        } catch (Exception e5) {
            if (e5.getCause() instanceof com.google.firebase.auth.t) {
                q0(map, iVar, e5);
            } else {
                iVar.b(e5);
            }
        }
    }

    private o0.h<String> S1(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.e
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.g1(map, iVar);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T0(Map map, o0.i iVar) {
        try {
            FirebaseAuth k02 = k0(map);
            Object obj = map.get("email");
            Objects.requireNonNull(obj);
            Object obj2 = map.get("password");
            Objects.requireNonNull(obj2);
            iVar.c(n1((com.google.firebase.auth.i) o0.k.a(k02.A((String) obj, (String) obj2))));
        } catch (Exception e5) {
            if (e5.getCause() instanceof com.google.firebase.auth.t) {
                q0(map, iVar, e5);
            } else {
                iVar.b(e5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U0(Map map, o0.i iVar) {
        try {
            FirebaseAuth k02 = k0(map);
            Object obj = map.get("email");
            Objects.requireNonNull(obj);
            Object obj2 = map.get("emailLink");
            Objects.requireNonNull(obj2);
            iVar.c(n1((com.google.firebase.auth.i) o0.k.a(k02.B((String) obj, (String) obj2))));
        } catch (Exception e5) {
            if (e5.getCause() instanceof com.google.firebase.auth.t) {
                q0(map, iVar, e5);
            } else {
                iVar.b(e5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void V0(Map map, o0.i iVar) {
        try {
            k0(map).C();
            iVar.c(null);
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void W0(t0.i iVar, o0.h hVar) {
        if (hVar.p()) {
            iVar.a(null);
        } else {
            iVar.b(hVar.l());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X0(Map map, o0.i iVar) {
        try {
            com.google.firebase.auth.z n02 = n0(map);
            if (n02 == null) {
                iVar.b(s0.f());
                return;
            }
            Object obj = map.get("providerId");
            Objects.requireNonNull(obj);
            iVar.c(n1((com.google.firebase.auth.i) o0.k.a(n02.v0((String) obj))));
        } catch (ExecutionException unused) {
            e = s0.e();
            iVar.b(e);
        } catch (Exception e5) {
            e = e5;
            iVar.b(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y0(Map map, o0.i iVar) {
        try {
            com.google.firebase.auth.z n02 = n0(map);
            if (n02 == null) {
                iVar.b(s0.f());
                return;
            }
            Object obj = map.get("newEmail");
            Objects.requireNonNull(obj);
            o0.k.a(n02.w0((String) obj));
            o0.k.a(n02.s0());
            iVar.c(o1(n02));
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z0(Map map, o0.i iVar) {
        try {
            com.google.firebase.auth.z n02 = n0(map);
            if (n02 == null) {
                iVar.b(s0.f());
                return;
            }
            Object obj = map.get("newPassword");
            Objects.requireNonNull(obj);
            o0.k.a(n02.x0((String) obj));
            o0.k.a(n02.s0());
            iVar.c(o1(n02));
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a1(Map map, o0.i iVar) {
        try {
            com.google.firebase.auth.z n02 = n0(map);
            if (n02 == null) {
                iVar.b(s0.f());
                return;
            }
            com.google.firebase.auth.n0 n0Var = (com.google.firebase.auth.n0) l0(map);
            if (n0Var == null) {
                iVar.b(s0.d());
                return;
            }
            o0.k.a(n02.y0(n0Var));
            o0.k.a(n02.s0());
            iVar.c(o1(n02));
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    private o0.h<Void> b0(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.j0
            @Override // java.lang.Runnable
            public final void run() {
                r0.s0(map, iVar);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b1(Map map, o0.i iVar) {
        try {
            com.google.firebase.auth.z n02 = n0(map);
            if (n02 == null) {
                iVar.b(s0.f());
                return;
            }
            Object obj = map.get("profile");
            Objects.requireNonNull(obj);
            Map map2 = (Map) obj;
            y0.a aVar = new y0.a();
            if (map2.containsKey("displayName")) {
                aVar.b((String) map2.get("displayName"));
            }
            if (map2.containsKey("photoURL")) {
                String str = (String) map2.get("photoURL");
                if (str != null) {
                    aVar.c(Uri.parse(str));
                } else {
                    aVar.c(null);
                }
            }
            o0.k.a(n02.z0(aVar.a()));
            o0.k.a(n02.s0());
            iVar.c(o1(n02));
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    private o0.h<Map<String, Object>> c0(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.k
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.t0(map, iVar);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c1(Map map, o0.i iVar) {
        try {
            k0(map).F((String) map.get("host"), ((Integer) map.get("port")).intValue());
            iVar.c(null);
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    private o0.h<Void> d0(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.n0
            @Override // java.lang.Runnable
            public final void run() {
                r0.u0(map, iVar);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d1(Map map, o0.i iVar) {
        try {
            com.google.firebase.auth.z n02 = n0(map);
            if (n02 == null) {
                iVar.b(s0.f());
            }
            Object obj = map.get("newEmail");
            Objects.requireNonNull(obj);
            String str = (String) obj;
            Object obj2 = map.get("actionCodeSettings");
            if (obj2 == null) {
                o0.k.a(n02.A0(str));
                iVar.c(null);
            } else {
                o0.k.a(n02.B0(str, h0((Map) obj2)));
                iVar.c(null);
            }
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    private o0.h<Map<String, Object>> e0(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.v
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.v0(map, iVar);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e1(Map map, o0.i iVar) {
        try {
            FirebaseAuth k02 = k0(map);
            Object obj = map.get("code");
            Objects.requireNonNull(obj);
            HashMap hashMap = new HashMap();
            hashMap.put("email", o0.k.a(k02.G((String) obj)));
            iVar.c(hashMap);
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    private o0.h<Void> f0(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.z
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.w0(map, iVar);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f1(com.google.firebase.auth.n0 n0Var) {
        f7766h.put(Integer.valueOf(n0Var.hashCode()), n0Var);
    }

    private o0.h<Map<String, Object>> g0(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.y
            @Override // java.lang.Runnable
            public final void run() {
                r0.z0(map, iVar);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g1(Map map, o0.i iVar) {
        try {
            String str = "plugins.flutter.io/firebase_auth/phone/" + UUID.randomUUID().toString();
            r2.c cVar = new r2.c(this.f7767a, str);
            String str2 = (String) map.get("multiFactorSessionId");
            com.google.firebase.auth.s0 s0Var = null;
            com.google.firebase.auth.k0 k0Var = str2 != null ? this.f7772f.get(str2) : null;
            String str3 = (String) map.get("multiFactorInfo");
            if (str3 != null) {
                Iterator<String> it = this.f7773g.keySet().iterator();
                while (it.hasNext()) {
                    Iterator<com.google.firebase.auth.i0> it2 = this.f7773g.get(it.next()).j0().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            com.google.firebase.auth.i0 next = it2.next();
                            if (next.e().equals(str3) && (next instanceof com.google.firebase.auth.s0)) {
                                s0Var = (com.google.firebase.auth.s0) next;
                                break;
                            }
                        }
                    }
                }
            }
            d1 d1Var = new d1(i0(), map, k0Var, s0Var, new d1.b() { // from class: u2.k0
                @Override // u2.d1.b
                public final void a(com.google.firebase.auth.n0 n0Var) {
                    r0.f1(n0Var);
                }
            });
            cVar.d(d1Var);
            this.f7770d.put(cVar, d1Var);
            iVar.c(str);
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    private com.google.firebase.auth.e h0(Map<String, Object> map) {
        e.a p02 = com.google.firebase.auth.e.p0();
        Object obj = map.get("url");
        Objects.requireNonNull(obj);
        p02.f((String) obj);
        if (map.get("dynamicLinkDomain") != null) {
            Object obj2 = map.get("dynamicLinkDomain");
            Objects.requireNonNull(obj2);
            p02.c((String) obj2);
        }
        if (map.get("handleCodeInApp") != null) {
            Object obj3 = map.get("handleCodeInApp");
            Objects.requireNonNull(obj3);
            p02.d(((Boolean) obj3).booleanValue());
        }
        if (map.get("android") != null) {
            Object obj4 = map.get("android");
            Objects.requireNonNull(obj4);
            Map map2 = (Map) obj4;
            boolean z4 = false;
            if (map2.get("installApp") != null) {
                Object obj5 = map2.get("installApp");
                Objects.requireNonNull(obj5);
                z4 = ((Boolean) obj5).booleanValue();
            }
            String str = map2.get("minimumVersion") != null ? (String) map2.get("minimumVersion") : null;
            Object obj6 = map2.get("packageName");
            Objects.requireNonNull(obj6);
            p02.b((String) obj6, z4, str);
        }
        if (map.get("iOS") != null) {
            Object obj7 = map.get("iOS");
            Objects.requireNonNull(obj7);
            Object obj8 = ((Map) obj7).get("bundleId");
            Objects.requireNonNull(obj8);
            p02.e((String) obj8);
        }
        return p02.a();
    }

    private o0.h<Map<String, Object>> h1(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.o
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.D0(map, iVar);
            }
        });
        return iVar.a();
    }

    private Activity i0() {
        return this.f7769c;
    }

    private List<Map<String, Object>> i1(List<com.google.firebase.auth.i0> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<t0.f> it = j1(list).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        return arrayList;
    }

    private com.google.firebase.auth.g0 j0(String str) {
        com.google.firebase.auth.z m02 = m0(str);
        if (m02 == null) {
            throw new t1.a("No user is signed in");
        }
        if (this.f7771e.get(str) == null) {
            this.f7771e.put(str, new HashMap());
        }
        Map<String, com.google.firebase.auth.g0> map = this.f7771e.get(str);
        if (map.get(m02.e()) == null) {
            map.put(m02.e(), m02.m0());
        }
        return map.get(m02.e());
    }

    private List<t0.f> j1(List<com.google.firebase.auth.i0> list) {
        ArrayList arrayList = new ArrayList();
        for (com.google.firebase.auth.i0 i0Var : list) {
            arrayList.add((i0Var instanceof com.google.firebase.auth.s0 ? new t0.f.a().e(((com.google.firebase.auth.s0) i0Var).X()) : new t0.f.a()).b(i0Var.R()).c(Double.valueOf(i0Var.j0())).f(i0Var.e()).d(i0Var.k0()).a());
        }
        return arrayList;
    }

    static FirebaseAuth k0(Map<String, Object> map) {
        Object obj = map.get("appName");
        Objects.requireNonNull(obj);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(x0.e.p((String) obj));
        String str = (String) map.get("tenantId");
        if (str != null) {
            firebaseAuth.w(str);
        }
        return firebaseAuth;
    }

    private Map<String, Object> k1(com.google.firebase.auth.d dVar) {
        int r8;
        int r82;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        int a5 = dVar.a();
        if (a5 == 0) {
            r8 = 1;
        } else if (a5 != 1) {
            if (a5 != 2) {
                r82 = 4;
                if (a5 != 4) {
                    if (a5 == 5) {
                        r8 = 5;
                    } else if (a5 != 6) {
                        r82 = 0;
                    } else {
                        r8 = 6;
                    }
                }
            } else {
                r82 = 3;
            }
            r8 = Integer.valueOf(r82);
        } else {
            r8 = 2;
        }
        hashMap.put("operation", r8);
        com.google.firebase.auth.b b5 = dVar.b();
        if ((b5 != null && a5 == 1) || a5 == 0) {
            hashMap2.put("email", b5.a());
        } else {
            if (a5 != 6) {
                if (a5 == 2 || a5 == 5) {
                    Objects.requireNonNull(b5);
                    com.google.firebase.auth.a aVar = (com.google.firebase.auth.a) b5;
                    hashMap2.put("email", aVar.a());
                    hashMap2.put("previousEmail", aVar.b());
                }
                hashMap.put("data", hashMap2);
                return hashMap;
            }
            hashMap2.put("email", null);
        }
        hashMap2.put("previousEmail", null);
        hashMap.put("data", hashMap2);
        return hashMap;
    }

    private com.google.firebase.auth.h l0(Map<String, Object> map) {
        String str;
        String str2;
        String str3;
        String str4;
        Object obj = map.get("credential");
        Objects.requireNonNull(obj);
        Map map2 = (Map) obj;
        if (map2.get("token") != null) {
            com.google.firebase.auth.h hVar = f7766h.get(Integer.valueOf(((Integer) map2.get("token")).intValue()));
            if (hVar != null) {
                return hVar;
            }
            throw s0.d();
        }
        Object obj2 = map2.get("signInMethod");
        Objects.requireNonNull(obj2);
        String str5 = (String) obj2;
        str = (String) map2.get("secret");
        str2 = (String) map2.get("idToken");
        str3 = (String) map2.get("accessToken");
        str4 = (String) map2.get("rawNonce");
        switch (str5) {
            case "twitter.com":
                Objects.requireNonNull(str3);
                Objects.requireNonNull(str);
                return com.google.firebase.auth.w0.a(str3, str);
            case "google.com":
                return com.google.firebase.auth.f0.a(str2, str3);
            case "facebook.com":
                Objects.requireNonNull(str3);
                return com.google.firebase.auth.m.a(str3);
            case "oauth":
                Object obj3 = map2.get("providerId");
                Objects.requireNonNull(obj3);
                m0.b d5 = com.google.firebase.auth.m0.d((String) obj3);
                Objects.requireNonNull(str3);
                d5.b(str3);
                Objects.requireNonNull(str2);
                if (str4 == null) {
                    d5.c(str2);
                } else {
                    d5.d(str2, str4);
                }
                return d5.a();
            case "phone":
                Object obj4 = map2.get("verificationId");
                Objects.requireNonNull(obj4);
                Object obj5 = map2.get("smsCode");
                Objects.requireNonNull(obj5);
                return com.google.firebase.auth.p0.a((String) obj4, (String) obj5);
            case "password":
                Object obj6 = map2.get("email");
                Objects.requireNonNull(obj6);
                Objects.requireNonNull(str);
                return com.google.firebase.auth.k.a((String) obj6, str);
            case "github.com":
                Objects.requireNonNull(str3);
                return com.google.firebase.auth.d0.a(str3);
            case "emailLink":
                Object obj7 = map2.get("email");
                Objects.requireNonNull(obj7);
                Object obj8 = map2.get("emailLink");
                Objects.requireNonNull(obj8);
                return com.google.firebase.auth.k.b((String) obj7, (String) obj8);
            default:
                return null;
        }
    }

    private Map<String, Object> l1(com.google.firebase.auth.g gVar) {
        if (gVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isNewUser", Boolean.valueOf(gVar.H()));
        hashMap.put("profile", gVar.s());
        hashMap.put("providerId", gVar.h());
        hashMap.put("username", gVar.y());
        return hashMap;
    }

    private com.google.firebase.auth.z m0(String str) {
        return FirebaseAuth.getInstance(x0.e.p(str)).m();
    }

    static Map<String, Object> m1(com.google.firebase.auth.h hVar) {
        if (hVar == null) {
            return null;
        }
        int hashCode = hVar.hashCode();
        f7766h.put(Integer.valueOf(hashCode), hVar);
        HashMap hashMap = new HashMap();
        hashMap.put("providerId", hVar.j0());
        hashMap.put("signInMethod", hVar.k0());
        hashMap.put("token", Integer.valueOf(hashCode));
        return hashMap;
    }

    private com.google.firebase.auth.z n0(Map<String, Object> map) {
        Object obj = map.get("appName");
        Objects.requireNonNull(obj);
        return FirebaseAuth.getInstance(x0.e.p((String) obj)).m();
    }

    private Map<String, Object> n1(com.google.firebase.auth.i iVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("additionalUserInfo", l1(iVar.f0()));
        hashMap.put("authCredential", m1(iVar.r()));
        hashMap.put("user", o1(iVar.k()));
        return hashMap;
    }

    static Map<String, Object> o0(Exception exc) {
        Map<String, Object> hashMap;
        HashMap hashMap2 = new HashMap();
        if (exc == null) {
            return hashMap2;
        }
        s0 s0Var = null;
        if (exc instanceof com.google.firebase.auth.q) {
            s0Var = new s0(exc, exc.getCause());
        } else if (exc.getCause() != null && (exc.getCause() instanceof com.google.firebase.auth.q)) {
            s0Var = new s0((com.google.firebase.auth.q) exc.getCause(), exc.getCause().getCause() != null ? exc.getCause().getCause() : exc.getCause());
        } else if (exc instanceof s0) {
            s0Var = (s0) exc;
        }
        if (s0Var != null) {
            hashMap2.put("code", s0Var.c());
            hashMap2.put("message", s0Var.getMessage());
            hashMap = s0Var.b();
        } else if ((exc instanceof x0.l) || (exc.getCause() != null && (exc.getCause() instanceof x0.l))) {
            hashMap2.put("code", "network-request-failed");
            hashMap2.put("message", "A network error (such as timeout, interrupted connection or unreachable host) has occurred.");
            hashMap = new HashMap<>();
        } else if ((exc instanceof x0.b) || (exc.getCause() != null && (exc.getCause() instanceof x0.b))) {
            hashMap2.put("code", "api-not-available");
            hashMap2.put("message", "The requested API is not available.");
            hashMap = new HashMap<>();
        } else if ((exc instanceof x0.n) || (exc.getCause() != null && (exc.getCause() instanceof x0.n))) {
            hashMap2.put("code", "too-many-requests");
            hashMap2.put("message", "We have blocked all requests from this device due to unusual activity. Try again later.");
            hashMap = new HashMap<>();
        } else {
            if (exc.getMessage() == null || !exc.getMessage().startsWith("Cannot create PhoneAuthCredential without either verificationProof")) {
                return hashMap2;
            }
            hashMap2.put("code", "invalid-verification-id");
            hashMap2.put("message", "The verification ID used to create the phone auth credential is invalid.");
            hashMap = new HashMap<>();
        }
        hashMap2.put("additionalData", hashMap);
        return hashMap2;
    }

    static Map<String, Object> o1(com.google.firebase.auth.z zVar) {
        if (zVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put("displayName", zVar.R());
        hashMap.put("email", zVar.n());
        hashMap.put("emailVerified", Boolean.valueOf(zVar.F()));
        hashMap.put("isAnonymous", Boolean.valueOf(zVar.p0()));
        if (zVar.l0() != null) {
            hashMap2.put("creationTime", Long.valueOf(zVar.l0().c0()));
            hashMap2.put("lastSignInTime", Long.valueOf(zVar.l0().S()));
        }
        hashMap.put("metadata", hashMap2);
        hashMap.put("phoneNumber", zVar.X());
        hashMap.put("photoURL", p1(zVar.l()));
        hashMap.put("providerData", s1(zVar.n0()));
        hashMap.put("refreshToken", "");
        hashMap.put("uid", zVar.e());
        hashMap.put("tenantId", zVar.o0());
        return hashMap;
    }

    private o0.h<Map<String, Object>> p0(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.u
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.A0(map, iVar);
            }
        });
        return iVar.a();
    }

    private static String p1(Uri uri) {
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        if ("".equals(uri2)) {
            return null;
        }
        return uri2;
    }

    private void q0(Map<String, Object> map, o0.i<Map<String, Object>> iVar, Exception exc) {
        com.google.firebase.auth.t tVar = (com.google.firebase.auth.t) exc.getCause();
        HashMap hashMap = new HashMap();
        com.google.firebase.auth.j0 b5 = tVar.b();
        List<com.google.firebase.auth.i0> j02 = b5.j0();
        com.google.firebase.auth.k0 k02 = b5.k0();
        String str = UUID.randomUUID().toString();
        this.f7772f.put(str, k02);
        String str2 = UUID.randomUUID().toString();
        this.f7773g.put(str2, b5);
        List<Map<String, Object>> i12 = i1(j02);
        hashMap.put("appName", k0(map).l().q());
        hashMap.put("multiFactorHints", i12);
        hashMap.put("multiFactorSessionId", str);
        hashMap.put("multiFactorResolverId", str2);
        iVar.b(new s0(tVar.a(), tVar.getLocalizedMessage(), hashMap));
    }

    private Map<String, Object> q1(com.google.firebase.auth.b0 b0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("authTimestamp", Long.valueOf(b0Var.a() * 1000));
        hashMap.put("claims", b0Var.b());
        hashMap.put("expirationTimestamp", Long.valueOf(b0Var.c() * 1000));
        hashMap.put("issuedAtTimestamp", Long.valueOf(b0Var.d() * 1000));
        hashMap.put("signInProvider", b0Var.e());
        hashMap.put("signInSecondFactor", b0Var.f());
        hashMap.put("token", b0Var.g());
        return hashMap;
    }

    private void r0(r2.b bVar) {
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_auth", this);
        r2.j jVar = new r2.j(bVar, "plugins.flutter.io/firebase_auth");
        this.f7768b = jVar;
        jVar.e(this);
        a1.j(bVar, this);
        v0.d(bVar, this);
        this.f7767a = bVar;
    }

    private static Map<String, Object> r1(com.google.firebase.auth.x0 x0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("displayName", x0Var.R());
        hashMap.put("email", x0Var.n());
        hashMap.put("phoneNumber", x0Var.X());
        hashMap.put("photoURL", p1(x0Var.l()));
        hashMap.put("providerId", x0Var.h());
        hashMap.put("uid", x0Var.e());
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s0(Map map, o0.i iVar) {
        try {
            FirebaseAuth k02 = k0(map);
            Object obj = map.get("code");
            Objects.requireNonNull(obj);
            o0.k.a(k02.c((String) obj));
            iVar.c(null);
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    private static List<Map<String, Object>> s1(List<? extends com.google.firebase.auth.x0> list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = new ArrayList(list).iterator();
        while (it.hasNext()) {
            com.google.firebase.auth.x0 x0Var = (com.google.firebase.auth.x0) it.next();
            if (!"firebase".equals(x0Var.h())) {
                arrayList.add(r1(x0Var));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0(Map map, o0.i iVar) {
        try {
            FirebaseAuth k02 = k0(map);
            Object obj = map.get("code");
            Objects.requireNonNull(obj);
            iVar.c(k1((com.google.firebase.auth.d) o0.k.a(k02.d((String) obj))));
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    private o0.h<Map<String, Object>> t1(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.o0
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.F0(map, iVar);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u0(Map map, o0.i iVar) {
        try {
            FirebaseAuth k02 = k0(map);
            Object obj = map.get("code");
            Objects.requireNonNull(obj);
            Object obj2 = map.get("newPassword");
            Objects.requireNonNull(obj2);
            o0.k.a(k02.i((String) obj, (String) obj2));
            iVar.c(null);
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    private o0.h<String> u1(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.q0
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.G0(map, iVar);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0(Map map, o0.i iVar) {
        try {
            FirebaseAuth k02 = k0(map);
            Object obj = map.get("email");
            Objects.requireNonNull(obj);
            Object obj2 = map.get("password");
            Objects.requireNonNull(obj2);
            iVar.c(n1((com.google.firebase.auth.i) o0.k.a(k02.j((String) obj, (String) obj2))));
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    private o0.h<String> v1(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.g
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.H0(map, iVar);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w0(Map map, o0.i iVar) {
        try {
            com.google.firebase.auth.z n02 = n0(map);
            if (n02 == null) {
                iVar.b(s0.f());
            } else {
                o0.k.a(n02.j0());
                iVar.c(null);
            }
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    private o0.h<Map<String, Object>> w1(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.q
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.I0(map, iVar);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x0(o0.i iVar) {
        try {
            x1();
            f7766h.clear();
            iVar.c(null);
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    private void x1() {
        for (r2.c cVar : this.f7770d.keySet()) {
            this.f7770d.get(cVar).a(null);
            cVar.d(null);
        }
        this.f7770d.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y0(t0.i iVar, o0.h hVar) {
        if (hVar.p()) {
            iVar.a(null);
        } else {
            iVar.b(hVar.l());
        }
    }

    private o0.h<Void> y1(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.w
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.K0(map, iVar);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z0(Map map, o0.i iVar) {
        try {
            FirebaseAuth k02 = k0(map);
            Object obj = map.get("email");
            Objects.requireNonNull(obj);
            com.google.firebase.auth.u0 u0Var = (com.google.firebase.auth.u0) o0.k.a(k02.k((String) obj));
            HashMap hashMap = new HashMap();
            hashMap.put("providers", u0Var.a());
            iVar.c(hashMap);
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    private o0.h<Void> z1(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.j
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.L0(map, iVar);
            }
        });
        return iVar.a();
    }

    @Override // r2.j.c
    public void a(r2.i iVar, final j.d dVar) {
        o0.h Q1;
        String str = iVar.f7455a;
        str.hashCode();
        switch (str) {
            case "User#verifyBeforeUpdateEmail":
                Q1 = Q1((Map) iVar.b());
                break;
            case "Auth#signInWithEmailLink":
                Q1 = I1((Map) iVar.b());
                break;
            case "Auth#setLanguageCode":
                Q1 = B1((Map) iVar.b());
                break;
            case "User#reauthenticateUserWithCredential":
                Q1 = t1((Map) iVar.b());
                break;
            case "Auth#signOut":
                Q1 = J1((Map) iVar.b());
                break;
            case "User#updatePhoneNumber":
                Q1 = N1((Map) iVar.b());
                break;
            case "User#updatePassword":
                Q1 = M1((Map) iVar.b());
                break;
            case "Auth#sendSignInLinkToEmail":
                Q1 = A1((Map) iVar.b());
                break;
            case "User#linkWithCredential":
                Q1 = h1((Map) iVar.b());
                break;
            case "Auth#signInWithCredential":
                Q1 = F1((Map) iVar.b());
                break;
            case "Auth#fetchSignInMethodsForEmail":
                Q1 = g0((Map) iVar.b());
                break;
            case "Auth#signInWithEmailAndPassword":
                Q1 = H1((Map) iVar.b());
                break;
            case "Auth#signInWithCustomToken":
                Q1 = G1((Map) iVar.b());
                break;
            case "User#getIdToken":
                Q1 = p0((Map) iVar.b());
                break;
            case "Auth#sendPasswordResetEmail":
                Q1 = z1((Map) iVar.b());
                break;
            case "User#sendEmailVerification":
                Q1 = y1((Map) iVar.b());
                break;
            case "User#delete":
                Q1 = f0((Map) iVar.b());
                break;
            case "Auth#verifyPhoneNumber":
                Q1 = S1((Map) iVar.b());
                break;
            case "Auth#createUserWithEmailAndPassword":
                Q1 = e0((Map) iVar.b());
                break;
            case "User#reload":
                Q1 = w1((Map) iVar.b());
                break;
            case "User#unlink":
                Q1 = K1((Map) iVar.b());
                break;
            case "User#updateProfile":
                Q1 = O1((Map) iVar.b());
                break;
            case "Auth#signInAnonymously":
                Q1 = D1((Map) iVar.b());
                break;
            case "Auth#confirmPasswordReset":
                Q1 = d0((Map) iVar.b());
                break;
            case "Auth#registerAuthStateListener":
                Q1 = u1((Map) iVar.b());
                break;
            case "Auth#signInWithAuthProvider":
                Q1 = E1((Map) iVar.b());
                break;
            case "Auth#checkActionCode":
                Q1 = c0((Map) iVar.b());
                break;
            case "Auth#applyActionCode":
                Q1 = b0((Map) iVar.b());
                break;
            case "Auth#useEmulator":
                Q1 = P1((Map) iVar.b());
                break;
            case "Auth#registerIdTokenListener":
                Q1 = v1((Map) iVar.b());
                break;
            case "Auth#setSettings":
                Q1 = C1((Map) iVar.b());
                break;
            case "Auth#verifyPasswordResetCode":
                Q1 = R1((Map) iVar.b());
                break;
            case "User#updateEmail":
                Q1 = L1((Map) iVar.b());
                break;
            default:
                dVar.c();
                return;
        }
        Q1.c(new o0.d() { // from class: u2.e0
            @Override // o0.d
            public final void a(o0.h hVar) {
                r0.E0(j.d.this, hVar);
            }
        });
    }

    @Override // u2.t0.d
    public void b(String str, final t0.i<t0.g> iVar) {
        try {
            j0(str).c().c(new o0.d() { // from class: u2.g0
                @Override // o0.d
                public final void a(o0.h hVar) {
                    r0.this.C0(iVar, hVar);
                }
            });
        } catch (t1.a e5) {
            iVar.b(e5);
        }
    }

    @Override // j2.a
    public void c(a.b bVar) {
        r0(bVar.b());
    }

    @Override // j2.a
    public void d(a.b bVar) {
        this.f7768b.e(null);
        this.f7768b = null;
        this.f7767a = null;
        a1.j(bVar.b(), null);
        v0.d(bVar.b(), null);
        x1();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public o0.h<Void> didReinitializeFirebaseCore() {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.c0
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.x0(iVar);
            }
        });
        return iVar.a();
    }

    @Override // u2.t0.d
    public void e(String str, t0.i<List<t0.f>> iVar) {
        try {
            iVar.a(j1(j0(str).b()));
        } catch (t1.a e5) {
            iVar.b(e5);
        }
    }

    @Override // k2.a
    public void f() {
        this.f7769c = null;
    }

    @Override // k2.a
    public void g(k2.c cVar) {
        this.f7769c = cVar.d();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public o0.h<Map<String, Object>> getPluginConstantsForFirebaseApp(final x0.e eVar) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u2.d0
            @Override // java.lang.Runnable
            public final void run() {
                r0.B0(x0.e.this, iVar);
            }
        });
        return iVar.a();
    }

    @Override // u2.t0.b
    public void h(String str, t0.h hVar, final t0.i<Map<String, Object>> iVar) {
        this.f7773g.get(str).l0(com.google.firebase.auth.r0.a(com.google.firebase.auth.p0.a(hVar.c(), hVar.b()))).c(new o0.d() { // from class: u2.f0
            @Override // o0.d
            public final void a(o0.h hVar2) {
                r0.this.J0(iVar, hVar2);
            }
        });
    }

    @Override // k2.a
    public void i(k2.c cVar) {
        this.f7769c = cVar.d();
    }

    @Override // u2.t0.d
    public void j(String str, t0.h hVar, String str2, final t0.i<Void> iVar) {
        try {
            j0(str).a(com.google.firebase.auth.r0.a(com.google.firebase.auth.p0.a(hVar.c(), hVar.b())), str2).c(new o0.d() { // from class: u2.h0
                @Override // o0.d
                public final void a(o0.h hVar2) {
                    r0.y0(t0.i.this, hVar2);
                }
            });
        } catch (t1.a e5) {
            iVar.b(e5);
        }
    }

    @Override // k2.a
    public void k() {
        this.f7769c = null;
    }

    @Override // u2.t0.d
    public void l(String str, String str2, final t0.i<Void> iVar) {
        try {
            j0(str).d(str2).c(new o0.d() { // from class: u2.i0
                @Override // o0.d
                public final void a(o0.h hVar) {
                    r0.W0(t0.i.this, hVar);
                }
            });
        } catch (t1.a e5) {
            iVar.b(e5);
        }
    }
}
