package u2;

import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import r2.c;

/* loaded from: classes.dex */
public class c1 implements c.d {

    /* renamed from: a, reason: collision with root package name */
    private final FirebaseAuth f7681a;

    /* renamed from: b, reason: collision with root package name */
    private FirebaseAuth.b f7682b;

    public c1(FirebaseAuth firebaseAuth) {
        this.f7681a = firebaseAuth;
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
        FirebaseAuth.b bVar = this.f7682b;
        if (bVar != null) {
            this.f7681a.r(bVar);
            this.f7682b = null;
        }
    }

    @Override // r2.c.d
    public void b(Object obj, final c.b bVar) {
        final HashMap hashMap = new HashMap();
        hashMap.put("appName", this.f7681a.l().q());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        FirebaseAuth.b bVar2 = new FirebaseAuth.b() { // from class: u2.b1
            @Override // com.google.firebase.auth.FirebaseAuth.b
            public final void a(FirebaseAuth firebaseAuth) {
                c1.d(atomicBoolean, hashMap, bVar, firebaseAuth);
            }
        };
        this.f7682b = bVar2;
        this.f7681a.b(bVar2);
    }
}
