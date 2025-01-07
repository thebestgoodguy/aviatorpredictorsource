package com.google.firebase.auth;

import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public class FirebaseAuthRegistrar implements b1.i {
    static /* synthetic */ FirebaseAuth lambda$getComponents$0(b1.e eVar) {
        return new a1.k1((x0.e) eVar.a(x0.e.class), eVar.b(q1.j.class));
    }

    @Override // b1.i
    @Keep
    public List<b1.d<?>> getComponents() {
        return Arrays.asList(b1.d.d(FirebaseAuth.class, a1.b.class).b(b1.q.j(x0.e.class)).b(b1.q.k(q1.j.class)).e(new b1.h() { // from class: com.google.firebase.auth.d2
            @Override // b1.h
            public final Object a(b1.e eVar) {
                return FirebaseAuthRegistrar.lambda$getComponents$0(eVar);
            }
        }).d().c(), q1.i.a(), u1.h.b("fire-auth", "21.0.6"));
    }
}
