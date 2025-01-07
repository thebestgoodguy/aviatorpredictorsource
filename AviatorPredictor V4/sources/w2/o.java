package w2;

import android.os.Handler;
import android.os.Looper;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.o0;
import com.google.firebase.firestore.t0;
import com.google.firebase.firestore.u;
import com.google.firebase.firestore.u0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import r2.c;
import v2.u;

/* loaded from: classes.dex */
public class o implements f, c.d {

    /* renamed from: a, reason: collision with root package name */
    final a f8111a;

    /* renamed from: b, reason: collision with root package name */
    final Semaphore f8112b = new Semaphore(0);

    /* renamed from: c, reason: collision with root package name */
    final Map<String, Object> f8113c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    final Handler f8114d = new Handler(Looper.getMainLooper());

    public interface a {
        void a(t0 t0Var);
    }

    public o(a aVar) {
        this.f8111a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ u i(FirebaseFirestore firebaseFirestore, final c.b bVar, Long l4, t0 t0Var) {
        com.google.firebase.firestore.h o4;
        Map<String, Object> map;
        this.f8111a.a(t0Var);
        final HashMap hashMap = new HashMap();
        hashMap.put("appName", firebaseFirestore.r().q());
        this.f8114d.post(new Runnable() { // from class: w2.m
            @Override // java.lang.Runnable
            public final void run() {
                c.b.this.a(hashMap);
            }
        });
        try {
            if (!this.f8112b.tryAcquire(l4.longValue(), TimeUnit.MILLISECONDS)) {
                return u.b(new com.google.firebase.firestore.u("timed out", u.a.DEADLINE_EXCEEDED));
            }
            if (!this.f8113c.isEmpty() && !"ERROR".equalsIgnoreCase((String) this.f8113c.get("type"))) {
                for (Map map2 : (List) this.f8113c.get("commands")) {
                    Object obj = map2.get("type");
                    Objects.requireNonNull(obj);
                    String str = (String) obj;
                    Object obj2 = map2.get("path");
                    Objects.requireNonNull(obj2);
                    o4 = firebaseFirestore.o((String) obj2);
                    map = (Map) map2.get("data");
                    switch (str) {
                        case "UPDATE":
                            Objects.requireNonNull(map);
                            t0Var.i(o4, map);
                            break;
                        case "SET":
                            Object obj3 = map2.get("options");
                            Objects.requireNonNull(obj3);
                            Map map3 = (Map) obj3;
                            o0 o0Var = null;
                            if (map3.get("merge") != null && ((Boolean) map3.get("merge")).booleanValue()) {
                                o0Var = o0.c();
                            } else if (map3.get("mergeFields") != null) {
                                Object obj4 = map3.get("mergeFields");
                                Objects.requireNonNull(obj4);
                                o0Var = o0.d((List) obj4);
                            }
                            Objects.requireNonNull(map);
                            if (o0Var == null) {
                                t0Var.f(o4, map);
                                break;
                            } else {
                                t0Var.g(o4, map, o0Var);
                                break;
                            }
                        case "DELETE":
                            t0Var.b(o4);
                            break;
                    }
                }
                return v2.u.a();
            }
            return v2.u.a();
        } catch (InterruptedException unused) {
            return v2.u.b(new com.google.firebase.firestore.u("interrupted", u.a.DEADLINE_EXCEEDED));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(c.b bVar, HashMap hashMap) {
        bVar.a(hashMap);
        bVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(FirebaseFirestore firebaseFirestore, final c.b bVar, o0.h hVar) {
        Object a5;
        String str;
        final HashMap hashMap = new HashMap();
        if (hVar.l() == null && ((v2.u) hVar.m()).f7902a == null) {
            if (hVar.m() != null) {
                a5 = Boolean.TRUE;
                str = "complete";
            }
            this.f8114d.post(new Runnable() { // from class: w2.l
                @Override // java.lang.Runnable
                public final void run() {
                    o.j(c.b.this, hashMap);
                }
            });
        }
        Exception l4 = hVar.l() != null ? hVar.l() : ((v2.u) hVar.m()).f7902a;
        hashMap.put("appName", firebaseFirestore.r().q());
        a5 = x2.a.a(l4);
        str = "error";
        hashMap.put(str, a5);
        this.f8114d.post(new Runnable() { // from class: w2.l
            @Override // java.lang.Runnable
            public final void run() {
                o.j(c.b.this, hashMap);
            }
        });
    }

    @Override // r2.c.d
    public void a(Object obj) {
        this.f8112b.release();
    }

    @Override // r2.c.d
    public void b(Object obj, final c.b bVar) {
        final Long valueOf;
        Map map = (Map) obj;
        Object obj2 = map.get("firestore");
        Objects.requireNonNull(obj2);
        final FirebaseFirestore firebaseFirestore = (FirebaseFirestore) obj2;
        Object obj3 = map.get("timeout");
        if (obj3 instanceof Long) {
            valueOf = (Long) obj3;
        } else {
            valueOf = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : 5000L);
        }
        firebaseFirestore.I(new u0.b().b(((Integer) map.get("maxAttempts")).intValue()).a(), new t0.a() { // from class: w2.k
            @Override // com.google.firebase.firestore.t0.a
            public final Object a(t0 t0Var) {
                v2.u i4;
                i4 = o.this.i(firebaseFirestore, bVar, valueOf, t0Var);
                return i4;
            }
        }).c(new o0.d() { // from class: w2.n
            @Override // o0.d
            public final void a(o0.h hVar) {
                o.this.k(firebaseFirestore, bVar, hVar);
            }
        });
    }

    @Override // w2.f
    public void c(Map<String, Object> map) {
        this.f8113c.putAll(map);
        this.f8112b.release();
    }
}
