package u2;

import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import r2.c;

/* loaded from: classes.dex */
public class b implements c.d {

    /* renamed from: a, reason: collision with root package name */
    private final FirebaseAuth f7669a;

    /* renamed from: b, reason: collision with root package name */
    private FirebaseAuth.a f7670b;

    public b(FirebaseAuth firebaseAuth) {
        this.f7669a = firebaseAuth;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(AtomicBoolean atomicBoolean, Map map, c.b bVar, FirebaseAuth firebaseAuth) {
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            return;
        }
        com.google.firebase.auth.z m4 = firebaseAuth.m();
        map.put("user", m4 == null ? null : r0.o1(m4));
        bVar.a(map);
    }

    @Override // r2.c.d
    public void a(Object obj) {
        FirebaseAuth.a aVar = this.f7670b;
        if (aVar != null) {
            this.f7669a.q(aVar);
            this.f7670b = null;
        }
    }

    @Override // r2.c.d
    public void b(Object obj, final c.b bVar) {
        final HashMap hashMap = new HashMap();
        hashMap.put("appName", this.f7669a.l().q());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        FirebaseAuth.a aVar = new FirebaseAuth.a() { // from class: u2.a
            @Override // com.google.firebase.auth.FirebaseAuth.a
            public final void a(FirebaseAuth firebaseAuth) {
                b.d(atomicBoolean, hashMap, bVar, firebaseAuth);
            }
        };
        this.f7670b = aVar;
        this.f7669a.a(aVar);
    }
}
