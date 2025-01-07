package v2;

import android.app.Activity;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.k0;
import com.google.firebase.firestore.m0;
import com.google.firebase.firestore.o0;
import com.google.firebase.firestore.q0;
import com.google.firebase.firestore.t0;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import j2.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import r2.c;
import r2.j;
import w2.o;

/* loaded from: classes.dex */
public class t implements FlutterFirebasePlugin, j.c, j2.a, k2.a {

    /* renamed from: i, reason: collision with root package name */
    protected static final HashMap<String, FirebaseFirestore> f7893i = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private r2.b f7895b;

    /* renamed from: c, reason: collision with root package name */
    private r2.j f7896c;

    /* renamed from: a, reason: collision with root package name */
    final r2.q f7894a = new r2.q(b.f7854d);

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference<Activity> f7897d = new AtomicReference<>(null);

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, t0> f7898e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, r2.c> f7899f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, c.d> f7900g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, w2.f> f7901h = new HashMap();

    private o0.h<Void> A(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v2.r
            @Override // java.lang.Runnable
            public final void run() {
                t.N(map, iVar);
            }
        });
        return iVar.a();
    }

    private static void B(String str) {
        HashMap<String, FirebaseFirestore> hashMap = f7893i;
        synchronized (hashMap) {
            if (hashMap.get(str) != null) {
                hashMap.remove(str);
            }
        }
    }

    private void C() {
        this.f7897d.set(null);
    }

    private o0.h<Void> D(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v2.o
            @Override // java.lang.Runnable
            public final void run() {
                t.P(map, iVar);
            }
        });
        return iVar.a();
    }

    private o0.h<Void> E(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v2.n
            @Override // java.lang.Runnable
            public final void run() {
                t.Q(map, iVar);
            }
        });
        return iVar.a();
    }

    private o0.h<com.google.firebase.firestore.i> F(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v2.d
            @Override // java.lang.Runnable
            public final void run() {
                t.this.R(map, iVar);
            }
        });
        return iVar.a();
    }

    private o0.h<Void> G(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v2.k
            @Override // java.lang.Runnable
            public final void run() {
                t.S(map, iVar);
            }
        });
        return iVar.a();
    }

    private o0.h<Void> H(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v2.m
            @Override // java.lang.Runnable
            public final void run() {
                t.T(map, iVar);
            }
        });
        return iVar.a();
    }

    private o0.h<Void> I(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v2.l
            @Override // java.lang.Runnable
            public final void run() {
                t.U(map, iVar);
            }
        });
        return iVar.a();
    }

    protected static FirebaseFirestore J(String str) {
        FirebaseFirestore firebaseFirestore;
        HashMap<String, FirebaseFirestore> hashMap = f7893i;
        synchronized (hashMap) {
            firebaseFirestore = hashMap.get(str);
        }
        return firebaseFirestore;
    }

    private q0 K(Map<String, Object> map) {
        Object obj = map.get("source");
        Objects.requireNonNull(obj);
        String str = (String) obj;
        return !str.equals("server") ? !str.equals("cache") ? q0.DEFAULT : q0.CACHE : q0.SERVER;
    }

    private void L(r2.b bVar) {
        this.f7895b = bVar;
        r2.j jVar = new r2.j(bVar, "plugins.flutter.io/firebase_firestore", this.f7894a);
        this.f7896c = jVar;
        jVar.e(this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_firestore", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        if (r8 == 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d5, code lost:
    
        java.util.Objects.requireNonNull(r7);
        r3 = r3.f(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        if (r8 == 2) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        r4 = r4.get("options");
        java.util.Objects.requireNonNull(r4);
        r4 = (java.util.Map) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        if (r4.get("merge") == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
    
        if (((java.lang.Boolean) r4.get("merge")).booleanValue() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        java.util.Objects.requireNonNull(r7);
        r4 = com.google.firebase.firestore.o0.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
    
        r3 = r3.d(r6, r7, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b9, code lost:
    
        if (r4.get("mergeFields") == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cc, code lost:
    
        java.util.Objects.requireNonNull(r7);
        r3 = r3.c(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bb, code lost:
    
        r4 = r4.get("mergeFields");
        java.util.Objects.requireNonNull(r4);
        java.util.Objects.requireNonNull(r7);
        r4 = com.google.firebase.firestore.o0.d((java.util.List) r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void M(java.util.Map r13, o0.i r14) {
        /*
            java.lang.String r0 = "mergeFields"
            java.lang.String r1 = "merge"
            java.lang.String r2 = "writes"
            java.lang.Object r2 = r13.get(r2)     // Catch: java.lang.Exception -> Lf2
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Exception -> Lf2
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Exception -> Lf2
            java.lang.String r3 = "firestore"
            java.lang.Object r13 = r13.get(r3)     // Catch: java.lang.Exception -> Lf2
            java.util.Objects.requireNonNull(r13)     // Catch: java.lang.Exception -> Lf2
            com.google.firebase.firestore.FirebaseFirestore r13 = (com.google.firebase.firestore.FirebaseFirestore) r13     // Catch: java.lang.Exception -> Lf2
            com.google.firebase.firestore.x0 r3 = r13.j()     // Catch: java.lang.Exception -> Lf2
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> Lf2
        L22:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Exception -> Lf2
            if (r4 == 0) goto Le6
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Exception -> Lf2
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Exception -> Lf2
            java.lang.String r5 = "type"
            java.lang.Object r5 = r4.get(r5)     // Catch: java.lang.Exception -> Lf2
            java.util.Objects.requireNonNull(r5)     // Catch: java.lang.Exception -> Lf2
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> Lf2
            java.lang.String r6 = "path"
            java.lang.Object r6 = r4.get(r6)     // Catch: java.lang.Exception -> Lf2
            java.util.Objects.requireNonNull(r6)     // Catch: java.lang.Exception -> Lf2
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> Lf2
            java.lang.String r7 = "data"
            java.lang.Object r7 = r4.get(r7)     // Catch: java.lang.Exception -> Lf2
            java.util.Map r7 = (java.util.Map) r7     // Catch: java.lang.Exception -> Lf2
            com.google.firebase.firestore.h r6 = r13.o(r6)     // Catch: java.lang.Exception -> Lf2
            r8 = -1
            int r9 = r5.hashCode()     // Catch: java.lang.Exception -> Lf2
            r10 = -1785516855(0xffffffff95932cc9, float:-5.9443486E-26)
            r11 = 2
            r12 = 1
            if (r9 == r10) goto L7b
            r10 = 81986(0x14042, float:1.14887E-40)
            if (r9 == r10) goto L71
            r10 = 2012838315(0x77f979ab, float:1.0119919E34)
            if (r9 == r10) goto L67
            goto L84
        L67:
            java.lang.String r9 = "DELETE"
            boolean r5 = r5.equals(r9)     // Catch: java.lang.Exception -> Lf2
            if (r5 == 0) goto L84
            r8 = 0
            goto L84
        L71:
            java.lang.String r9 = "SET"
            boolean r5 = r5.equals(r9)     // Catch: java.lang.Exception -> Lf2
            if (r5 == 0) goto L84
            r8 = 2
            goto L84
        L7b:
            java.lang.String r9 = "UPDATE"
            boolean r5 = r5.equals(r9)     // Catch: java.lang.Exception -> Lf2
            if (r5 == 0) goto L84
            r8 = 1
        L84:
            if (r8 == 0) goto Le0
            if (r8 == r12) goto Ld5
            if (r8 == r11) goto L8b
            goto L22
        L8b:
            java.lang.String r5 = "options"
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Exception -> Lf2
            java.util.Objects.requireNonNull(r4)     // Catch: java.lang.Exception -> Lf2
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Exception -> Lf2
            java.lang.Object r5 = r4.get(r1)     // Catch: java.lang.Exception -> Lf2
            if (r5 == 0) goto Lb5
            java.lang.Object r5 = r4.get(r1)     // Catch: java.lang.Exception -> Lf2
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Exception -> Lf2
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Exception -> Lf2
            if (r5 == 0) goto Lb5
            java.util.Objects.requireNonNull(r7)     // Catch: java.lang.Exception -> Lf2
            com.google.firebase.firestore.o0 r4 = com.google.firebase.firestore.o0.c()     // Catch: java.lang.Exception -> Lf2
        Laf:
            com.google.firebase.firestore.x0 r3 = r3.d(r6, r7, r4)     // Catch: java.lang.Exception -> Lf2
            goto L22
        Lb5:
            java.lang.Object r5 = r4.get(r0)     // Catch: java.lang.Exception -> Lf2
            if (r5 == 0) goto Lcc
            java.lang.Object r4 = r4.get(r0)     // Catch: java.lang.Exception -> Lf2
            java.util.Objects.requireNonNull(r4)     // Catch: java.lang.Exception -> Lf2
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Exception -> Lf2
            java.util.Objects.requireNonNull(r7)     // Catch: java.lang.Exception -> Lf2
            com.google.firebase.firestore.o0 r4 = com.google.firebase.firestore.o0.d(r4)     // Catch: java.lang.Exception -> Lf2
            goto Laf
        Lcc:
            java.util.Objects.requireNonNull(r7)     // Catch: java.lang.Exception -> Lf2
            com.google.firebase.firestore.x0 r3 = r3.c(r6, r7)     // Catch: java.lang.Exception -> Lf2
            goto L22
        Ld5:
            java.util.Objects.requireNonNull(r7)     // Catch: java.lang.Exception -> Lf2
            java.util.Map r7 = (java.util.Map) r7     // Catch: java.lang.Exception -> Lf2
            com.google.firebase.firestore.x0 r3 = r3.f(r6, r7)     // Catch: java.lang.Exception -> Lf2
            goto L22
        Le0:
            com.google.firebase.firestore.x0 r3 = r3.b(r6)     // Catch: java.lang.Exception -> Lf2
            goto L22
        Le6:
            o0.h r13 = r3.a()     // Catch: java.lang.Exception -> Lf2
            o0.k.a(r13)     // Catch: java.lang.Exception -> Lf2
            r13 = 0
            r14.c(r13)     // Catch: java.lang.Exception -> Lf2
            goto Lf6
        Lf2:
            r13 = move-exception
            r14.b(r13)
        Lf6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.t.M(java.util.Map, o0.i):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void N(Map map, o0.i iVar) {
        try {
            Object obj = map.get("firestore");
            Objects.requireNonNull(obj);
            iVar.c((Void) o0.k.a(((FirebaseFirestore) obj).k()));
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(o0.i iVar) {
        try {
            for (x0.e eVar : x0.e.n(null)) {
                o0.k.a(FirebaseFirestore.u(eVar).L());
                B(eVar.q());
            }
            h0();
            iVar.c(null);
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void P(Map map, o0.i iVar) {
        try {
            Object obj = map.get("firestore");
            Objects.requireNonNull(obj);
            o0.k.a(((FirebaseFirestore) obj).n());
            iVar.c(null);
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Q(Map map, o0.i iVar) {
        try {
            Object obj = map.get("reference");
            Objects.requireNonNull(obj);
            iVar.c((Void) o0.k.a(((com.google.firebase.firestore.h) obj).h()));
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(Map map, o0.i iVar) {
        try {
            q0 K = K(map);
            Object obj = map.get("reference");
            Objects.requireNonNull(obj);
            iVar.c((com.google.firebase.firestore.i) o0.k.a(((com.google.firebase.firestore.h) obj).j(K)));
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void S(Map map, o0.i iVar) {
        o0.h<Void> s4;
        o0 d5;
        try {
            Object obj = map.get("reference");
            Objects.requireNonNull(obj);
            com.google.firebase.firestore.h hVar = (com.google.firebase.firestore.h) obj;
            Object obj2 = map.get("data");
            Objects.requireNonNull(obj2);
            Map map2 = (Map) obj2;
            Object obj3 = map.get("options");
            Objects.requireNonNull(obj3);
            Map map3 = (Map) obj3;
            if (map3.get("merge") != null && ((Boolean) map3.get("merge")).booleanValue()) {
                d5 = o0.c();
            } else if (map3.get("mergeFields") == null) {
                s4 = hVar.s(map2);
                iVar.c((Void) o0.k.a(s4));
            } else {
                Object obj4 = map3.get("mergeFields");
                Objects.requireNonNull(obj4);
                d5 = o0.d((List) obj4);
            }
            s4 = hVar.t(map2, d5);
            iVar.c((Void) o0.k.a(s4));
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void T(Map map, o0.i iVar) {
        try {
            Object obj = map.get("reference");
            Objects.requireNonNull(obj);
            Object obj2 = map.get("data");
            Objects.requireNonNull(obj2);
            iVar.c((Void) o0.k.a(((com.google.firebase.firestore.h) obj).v((Map) obj2)));
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void U(Map map, o0.i iVar) {
        try {
            Object obj = map.get("firestore");
            Objects.requireNonNull(obj);
            o0.k.a(((FirebaseFirestore) obj).p());
            iVar.c(null);
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void V(o0.i iVar) {
        try {
            iVar.c(null);
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W(Map map, o0.i iVar) {
        try {
            q0 K = K(map);
            Object obj = map.get("name");
            Objects.requireNonNull(obj);
            Object obj2 = map.get("firestore");
            Objects.requireNonNull(obj2);
            k0 k0Var = (k0) o0.k.a(((FirebaseFirestore) obj2).w((String) obj));
            if (k0Var == null) {
                iVar.b(new NullPointerException("Named query has not been found. Please check it has been loaded properly via loadBundle()."));
            } else {
                iVar.c((m0) o0.k.a(k0Var.l(K)));
            }
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X(String str, t0 t0Var) {
        this.f7898e.put(str, t0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Y(j.d dVar, o0.h hVar) {
        if (hVar.p()) {
            dVar.a(hVar.m());
            return;
        }
        Exception l4 = hVar.l();
        dVar.b("firebase_firestore", l4 != null ? l4.getMessage() : null, x2.a.a(l4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(Map map, o0.i iVar) {
        try {
            q0 K = K(map);
            k0 k0Var = (k0) map.get("query");
            if (k0Var == null) {
                iVar.b(new IllegalArgumentException("An error occurred while parsing query arguments, see native logs for more information. Please report this issue."));
            } else {
                iVar.c((m0) o0.k.a(k0Var.l(K)));
            }
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a0(Map map, o0.i iVar) {
        try {
            Object obj = map.get("firestore");
            Objects.requireNonNull(obj);
            FirebaseFirestore firebaseFirestore = (FirebaseFirestore) obj;
            o0.k.a(firebaseFirestore.L());
            B(firebaseFirestore.r().q());
            iVar.c(null);
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0(Map map, o0.i iVar) {
        try {
            Object obj = map.get("reference");
            Objects.requireNonNull(obj);
            com.google.firebase.firestore.h hVar = (com.google.firebase.firestore.h) obj;
            Object obj2 = map.get("transactionId");
            Objects.requireNonNull(obj2);
            String str = (String) obj2;
            t0 t0Var = this.f7898e.get(str);
            if (t0Var != null) {
                iVar.c(t0Var.c(hVar));
                return;
            }
            iVar.b(new Exception("Transaction.getDocument(): No transaction handler exists for ID: " + str));
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c0(Map map, o0.i iVar) {
        try {
            Object obj = map.get("firestore");
            Objects.requireNonNull(obj);
            iVar.c((Void) o0.k.a(((FirebaseFirestore) obj).N()));
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    private o0.h<m0> d0(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v2.g
            @Override // java.lang.Runnable
            public final void run() {
                t.this.W(map, iVar);
            }
        });
        return iVar.a();
    }

    private o0.h<m0> e0(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v2.e
            @Override // java.lang.Runnable
            public final void run() {
                t.this.Z(map, iVar);
            }
        });
        return iVar.a();
    }

    private String f0(String str, String str2, c.d dVar) {
        r2.c cVar = new r2.c(this.f7895b, str + "/" + str2, this.f7894a);
        cVar.d(dVar);
        this.f7899f.put(str2, cVar);
        this.f7900g.put(str2, dVar);
        return str2;
    }

    private String g0(String str, c.d dVar) {
        return f0(str, UUID.randomUUID().toString().toLowerCase(Locale.US), dVar);
    }

    private void h0() {
        Iterator<String> it = this.f7899f.keySet().iterator();
        while (it.hasNext()) {
            this.f7899f.get(it.next()).d(null);
        }
        this.f7899f.clear();
        Iterator<String> it2 = this.f7900g.keySet().iterator();
        while (it2.hasNext()) {
            this.f7900g.get(it2.next()).a(null);
        }
        this.f7900g.clear();
        this.f7901h.clear();
    }

    protected static void i0(FirebaseFirestore firebaseFirestore, String str) {
        HashMap<String, FirebaseFirestore> hashMap = f7893i;
        synchronized (hashMap) {
            if (hashMap.get(str) == null) {
                hashMap.put(str, firebaseFirestore);
            }
        }
    }

    private o0.h<Void> j0(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v2.p
            @Override // java.lang.Runnable
            public final void run() {
                t.a0(map, iVar);
            }
        });
        return iVar.a();
    }

    private o0.h<com.google.firebase.firestore.i> k0(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v2.f
            @Override // java.lang.Runnable
            public final void run() {
                t.this.b0(map, iVar);
            }
        });
        return iVar.a();
    }

    private void l0(Map<String, Object> map) {
        Object obj = map.get("transactionId");
        Objects.requireNonNull(obj);
        Object obj2 = map.get("result");
        Objects.requireNonNull(obj2);
        this.f7901h.get((String) obj).c((Map) obj2);
    }

    private o0.h<Void> m0(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v2.q
            @Override // java.lang.Runnable
            public final void run() {
                t.c0(map, iVar);
            }
        });
        return iVar.a();
    }

    private void y(k2.c cVar) {
        this.f7897d.set(cVar.d());
    }

    private o0.h<Void> z(final Map<String, Object> map) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v2.c
            @Override // java.lang.Runnable
            public final void run() {
                t.M(map, iVar);
            }
        });
        return iVar.a();
    }

    @Override // r2.j.c
    public void a(r2.i iVar, final j.d dVar) {
        o0.h d02;
        String str = iVar.f7455a;
        str.hashCode();
        switch (str) {
            case "Firestore#namedQueryGet":
                d02 = d0((Map) iVar.b());
                break;
            case "SnapshotsInSync#setup":
                dVar.a(g0("plugins.flutter.io/firebase_firestore/snapshotsInSync", new w2.j()));
                return;
            case "Firestore#disableNetwork":
                d02 = D((Map) iVar.b());
                break;
            case "DocumentReference#snapshots":
                dVar.a(g0("plugins.flutter.io/firebase_firestore/document", new w2.b()));
                return;
            case "WriteBatch#commit":
                d02 = z((Map) iVar.b());
                break;
            case "Transaction#storeResult":
                l0((Map) iVar.b());
                dVar.a(null);
                return;
            case "Transaction#create":
                final String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                w2.o oVar = new w2.o(new o.a() { // from class: v2.j
                    @Override // w2.o.a
                    public final void a(t0 t0Var) {
                        t.this.X(lowerCase, t0Var);
                    }
                });
                f0("plugins.flutter.io/firebase_firestore/transaction", lowerCase, oVar);
                this.f7901h.put(lowerCase, oVar);
                dVar.a(lowerCase);
                return;
            case "LoadBundle#snapshots":
                dVar.a(g0("plugins.flutter.io/firebase_firestore/loadBundle", new w2.e()));
                return;
            case "DocumentReference#delete":
                d02 = E((Map) iVar.b());
                break;
            case "Firestore#terminate":
                d02 = j0((Map) iVar.b());
                break;
            case "DocumentReference#update":
                d02 = H((Map) iVar.b());
                break;
            case "DocumentReference#get":
                d02 = F((Map) iVar.b());
                break;
            case "DocumentReference#set":
                d02 = G((Map) iVar.b());
                break;
            case "Query#snapshots":
                dVar.a(g0("plugins.flutter.io/firebase_firestore/query", new w2.h()));
                return;
            case "Query#get":
                d02 = e0((Map) iVar.b());
                break;
            case "Transaction#get":
                d02 = k0((Map) iVar.b());
                break;
            case "Firestore#clearPersistence":
                d02 = A((Map) iVar.b());
                break;
            case "Firestore#waitForPendingWrites":
                d02 = m0((Map) iVar.b());
                break;
            case "Firestore#enableNetwork":
                d02 = I((Map) iVar.b());
                break;
            default:
                dVar.c();
                return;
        }
        d02.c(new o0.d() { // from class: v2.i
            @Override // o0.d
            public final void a(o0.h hVar) {
                t.Y(j.d.this, hVar);
            }
        });
    }

    @Override // j2.a
    public void c(a.b bVar) {
        L(bVar.b());
    }

    @Override // j2.a
    public void d(a.b bVar) {
        this.f7896c.e(null);
        this.f7896c = null;
        h0();
        this.f7895b = null;
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public o0.h<Void> didReinitializeFirebaseCore() {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v2.h
            @Override // java.lang.Runnable
            public final void run() {
                t.this.O(iVar);
            }
        });
        return iVar.a();
    }

    @Override // k2.a
    public void f() {
        C();
    }

    @Override // k2.a
    public void g(k2.c cVar) {
        y(cVar);
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public o0.h<Map<String, Object>> getPluginConstantsForFirebaseApp(x0.e eVar) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v2.s
            @Override // java.lang.Runnable
            public final void run() {
                t.V(o0.i.this);
            }
        });
        return iVar.a();
    }

    @Override // k2.a
    public void i(k2.c cVar) {
        y(cVar);
    }

    @Override // k2.a
    public void k() {
        C();
    }
}
