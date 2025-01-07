package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class g implements DynamiteModule.b {
    g() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0022b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0022b c0022b = new DynamiteModule.b.C0022b();
        c0022b.f1365a = aVar.a(context, str);
        int b5 = aVar.b(context, str, true);
        c0022b.f1366b = b5;
        int r4 = c0022b.f1365a;
        if (r4 == 0) {
            if (b5 == 0) {
                c0022b.f1367c = 0;
                return c0022b;
            }
            r4 = 0;
        }
        if (r4 >= b5) {
            c0022b.f1367c = -1;
        } else {
            c0022b.f1367c = 1;
        }
        return c0022b;
    }
}
