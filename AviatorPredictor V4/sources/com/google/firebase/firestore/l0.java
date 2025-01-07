package com.google.firebase.firestore;

import com.google.firebase.firestore.i;
import java.util.Map;

/* loaded from: classes.dex */
public class l0 extends i {
    private l0(FirebaseFirestore firebaseFirestore, l1.l lVar, l1.i iVar, boolean z4, boolean z5) {
        super(firebaseFirestore, lVar, iVar, z4, z5);
    }

    static l0 h(FirebaseFirestore firebaseFirestore, l1.i iVar, boolean z4, boolean z5) {
        return new l0(firebaseFirestore, iVar.getKey(), iVar, z4, z5);
    }

    @Override // com.google.firebase.firestore.i
    public Map<String, Object> d() {
        Map<String, Object> d5 = super.d();
        p1.b.d(d5 != null, "Data in a QueryDocumentSnapshot should be non-null", new Object[0]);
        return d5;
    }

    @Override // com.google.firebase.firestore.i
    public Map<String, Object> e(i.a aVar) {
        p1.x.c(aVar, "Provided serverTimestampBehavior value must not be null.");
        Map<String, Object> e5 = super.e(aVar);
        p1.b.d(e5 != null, "Data in a QueryDocumentSnapshot should be non-null", new Object[0]);
        return e5;
    }
}
