package com.google.firebase.firestore;

/* loaded from: classes.dex */
public class b extends k0 {
    b(l1.u uVar, FirebaseFirestore firebaseFirestore) {
        super(i1.x0.b(uVar), firebaseFirestore);
        if (uVar.s() % 2 == 1) {
            return;
        }
        throw new IllegalArgumentException("Invalid collection reference. Collection references must have an odd number of segments, but " + uVar.h() + " has " + uVar.s());
    }
}
