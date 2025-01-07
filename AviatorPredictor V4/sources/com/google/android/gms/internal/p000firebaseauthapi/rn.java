package com.google.android.gms.internal.p000firebaseauthapi;

import android.app.Activity;
import b0.f;
import com.google.firebase.auth.p0;
import e.a;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class rn {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f2102a = new a();

    public static p0.b a(String str, p0.b bVar, cn cnVar) {
        e(str, cnVar);
        return new pn(bVar, str);
    }

    public static void c() {
        f2102a.clear();
    }

    public static boolean d(String str, p0.b bVar, Activity activity, Executor executor) {
        Map map = f2102a;
        if (!map.containsKey(str)) {
            e(str, null);
            return false;
        }
        qn qnVar = (qn) map.get(str);
        if (f.b().a() - qnVar.f2075b >= 120000) {
            e(str, null);
            return false;
        }
        cn cnVar = qnVar.f2074a;
        if (cnVar == null) {
            return true;
        }
        cnVar.h(bVar, activity, executor, str);
        return true;
    }

    private static void e(String str, cn cnVar) {
        f2102a.put(str, new qn(cnVar, f.b().a()));
    }
}
