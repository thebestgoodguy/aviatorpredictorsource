package w2;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.c0;
import com.google.firebase.firestore.d0;
import com.google.firebase.firestore.f0;
import java.util.Map;
import java.util.Objects;
import r2.c;

/* loaded from: classes.dex */
public class e implements c.d {

    /* renamed from: a, reason: collision with root package name */
    private c.b f8094a;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(c.b bVar, Exception exc) {
        bVar.b("firebase_firestore", exc.getMessage(), x2.a.a(exc));
        a(null);
    }

    @Override // r2.c.d
    public void a(Object obj) {
        this.f8094a.c();
    }

    @Override // r2.c.d
    public void b(Object obj, final c.b bVar) {
        this.f8094a = bVar;
        Map map = (Map) obj;
        Object obj2 = map.get("bundle");
        Objects.requireNonNull(obj2);
        Object obj3 = map.get("firestore");
        Objects.requireNonNull(obj3);
        c0 F = ((FirebaseFirestore) obj3).F((byte[]) obj2);
        F.q(new f0() { // from class: w2.c
            @Override // com.google.firebase.firestore.f0
            public final void a(Object obj4) {
                c.b.this.a((d0) obj4);
            }
        });
        F.e(new o0.e() { // from class: w2.d
            @Override // o0.e
            public final void c(Exception exc) {
                e.this.f(bVar, exc);
            }
        });
    }
}
