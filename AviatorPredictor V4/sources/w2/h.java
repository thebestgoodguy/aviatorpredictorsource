package w2;

import com.google.firebase.firestore.a0;
import com.google.firebase.firestore.e0;
import com.google.firebase.firestore.k0;
import com.google.firebase.firestore.m0;
import com.google.firebase.firestore.u;
import java.util.Map;
import java.util.Objects;
import r2.c;

/* loaded from: classes.dex */
public class h implements c.d {

    /* renamed from: a, reason: collision with root package name */
    a0 f8097a;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(c.b bVar, m0 m0Var, u uVar) {
        if (uVar == null) {
            bVar.a(m0Var);
            return;
        }
        bVar.b("firebase_firestore", uVar.getMessage(), x2.a.a(uVar));
        bVar.c();
        a(null);
    }

    @Override // r2.c.d
    public void a(Object obj) {
        a0 a0Var = this.f8097a;
        if (a0Var != null) {
            a0Var.remove();
            this.f8097a = null;
        }
    }

    @Override // r2.c.d
    public void b(Object obj, final c.b bVar) {
        Map map = (Map) obj;
        Object obj2 = map.get("includeMetadataChanges");
        Objects.requireNonNull(obj2);
        e0 e0Var = ((Boolean) obj2).booleanValue() ? e0.INCLUDE : e0.EXCLUDE;
        k0 k0Var = (k0) map.get("query");
        if (k0Var == null) {
            throw new IllegalArgumentException("An error occurred while parsing query arguments, see native logs for more information. Please report this issue.");
        }
        this.f8097a = k0Var.d(e0Var, new com.google.firebase.firestore.j() { // from class: w2.g
            @Override // com.google.firebase.firestore.j
            public final void a(Object obj3, u uVar) {
                h.this.d(bVar, (m0) obj3, uVar);
            }
        });
    }
}
