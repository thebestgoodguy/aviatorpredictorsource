package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class h implements DynamiteModule.b {
    h() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0022b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0022b c0022b = new DynamiteModule.b.C0022b();
        int a5 = aVar.a(context, str);
        c0022b.f1365a = a5;
        int r32 = 0;
        int b5 = a5 != 0 ? aVar.b(context, str, false) : aVar.b(context, str, true);
        c0022b.f1366b = b5;
        int r6 = c0022b.f1365a;
        if (r6 != 0) {
            r32 = r6;
        } else if (b5 == 0) {
            c0022b.f1367c = 0;
            return c0022b;
        }
        if (r32 >= b5) {
            c0022b.f1367c = -1;
        } else {
            c0022b.f1367c = 1;
        }
        return c0022b;
    }
}
