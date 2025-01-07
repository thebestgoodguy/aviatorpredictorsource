package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class f implements DynamiteModule.b {
    f() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0022b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0022b c0022b = new DynamiteModule.b.C0022b();
        int b5 = aVar.b(context, str, false);
        c0022b.f1366b = b5;
        if (b5 == 0) {
            c0022b.f1367c = 0;
        } else {
            c0022b.f1367c = 1;
        }
        return c0022b;
    }
}
