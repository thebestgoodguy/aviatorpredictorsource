package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class t0 extends e1 {
    t0(int r22) {
        super(r22, null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.e1
    public final void a() {
        if (!j()) {
            for (int r02 = 0; r02 < b(); r02++) {
                Map.Entry g5 = g(r02);
                if (((cs) g5.getKey()).c()) {
                    g5.setValue(Collections.unmodifiableList((List) g5.getValue()));
                }
            }
            for (Map.Entry entry : c()) {
                if (((cs) entry.getKey()).c()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
