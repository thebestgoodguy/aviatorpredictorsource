package com.google.firebase.firestore;

import android.content.Context;
import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public class FirestoreRegistrar implements b1.i {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ w lambda$getComponents$0(b1.e eVar) {
        return new w((Context) eVar.a(Context.class), (x0.e) eVar.a(x0.e.class), eVar.e(a1.b.class), eVar.e(z0.b.class), new o1.o(eVar.b(u1.i.class), eVar.b(q1.k.class), (x0.m) eVar.a(x0.m.class)));
    }

    @Override // b1.i
    @Keep
    public List<b1.d<?>> getComponents() {
        return Arrays.asList(b1.d.c(w.class).b(b1.q.j(x0.e.class)).b(b1.q.j(Context.class)).b(b1.q.i(q1.k.class)).b(b1.q.i(u1.i.class)).b(b1.q.a(a1.b.class)).b(b1.q.a(z0.b.class)).b(b1.q.h(x0.m.class)).e(new b1.h() { // from class: com.google.firebase.firestore.x
            @Override // b1.h
            public final Object a(b1.e eVar) {
                w lambda$getComponents$0;
                lambda$getComponents$0 = FirestoreRegistrar.lambda$getComponents$0(eVar);
                return lambda$getComponents$0;
            }
        }).c(), u1.h.b("fire-fst", "24.2.1"));
    }
}
