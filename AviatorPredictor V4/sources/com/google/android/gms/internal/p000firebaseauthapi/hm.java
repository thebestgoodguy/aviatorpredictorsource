package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import s.e;
import s.i;

/* loaded from: classes.dex */
public final class hm {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f1730a;

    public static boolean a(Context context) {
        if (f1730a == null) {
            int g5 = e.e().g(context, i.f7494a);
            boolean z4 = true;
            if (g5 != 0 && g5 != 2) {
                z4 = false;
            }
            f1730a = Boolean.valueOf(z4);
        }
        return f1730a.booleanValue();
    }
}
