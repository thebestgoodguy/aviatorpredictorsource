package w2;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.a0;
import java.util.Map;
import java.util.Objects;
import r2.c;

/* loaded from: classes.dex */
public class j implements c.d {

    /* renamed from: a, reason: collision with root package name */
    a0 f8099a;

    @Override // r2.c.d
    public void a(Object obj) {
        a0 a0Var = this.f8099a;
        if (a0Var != null) {
            a0Var.remove();
            this.f8099a = null;
        }
    }

    @Override // r2.c.d
    public void b(Object obj, final c.b bVar) {
        Object obj2 = ((Map) obj).get("firestore");
        Objects.requireNonNull(obj2);
        this.f8099a = ((FirebaseFirestore) obj2).g(new Runnable() { // from class: w2.i
            @Override // java.lang.Runnable
            public final void run() {
                c.b.this.a(null);
            }
        });
    }
}
