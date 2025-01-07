package w2;

import com.google.firebase.firestore.a0;
import com.google.firebase.firestore.e0;
import com.google.firebase.firestore.u;
import java.util.Map;
import java.util.Objects;
import r2.c;

/* loaded from: classes.dex */
public class b implements c.d {

    /* renamed from: a, reason: collision with root package name */
    a0 f8090a;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(c.b bVar, com.google.firebase.firestore.i iVar, u uVar) {
        if (uVar == null) {
            bVar.a(iVar);
            return;
        }
        bVar.b("firebase_firestore", uVar.getMessage(), x2.a.a(uVar));
        bVar.c();
        a(null);
    }

    @Override // r2.c.d
    public void a(Object obj) {
        a0 a0Var = this.f8090a;
        if (a0Var != null) {
            a0Var.remove();
            this.f8090a = null;
        }
    }

    @Override // r2.c.d
    public void b(Object obj, final c.b bVar) {
        Map map = (Map) obj;
        Object obj2 = map.get("includeMetadataChanges");
        Objects.requireNonNull(obj2);
        e0 e0Var = ((Boolean) obj2).booleanValue() ? e0.INCLUDE : e0.EXCLUDE;
        Object obj3 = map.get("reference");
        Objects.requireNonNull(obj3);
        this.f8090a = ((com.google.firebase.firestore.h) obj3).d(e0Var, new com.google.firebase.firestore.j() { // from class: w2.a
            @Override // com.google.firebase.firestore.j
            public final void a(Object obj4, u uVar) {
                b.this.d(bVar, (com.google.firebase.firestore.i) obj4, uVar);
            }
        });
    }
}
