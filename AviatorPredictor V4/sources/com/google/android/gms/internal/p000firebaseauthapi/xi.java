package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.n1;
import java.util.List;

/* loaded from: classes.dex */
final class xi implements hn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ gn f2331a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f2332b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f2333c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Boolean f2334d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ n1 f2335e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ am f2336f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ bp f2337g;

    xi(ik ikVar, gn gnVar, String str, String str2, Boolean bool, n1 n1Var, am amVar, bp bpVar) {
        this.f2331a = gnVar;
        this.f2332b = str;
        this.f2333c = str2;
        this.f2334d = bool;
        this.f2335e = n1Var;
        this.f2336f = amVar;
        this.f2337g = bpVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        List j02 = ((so) obj).j0();
        if (j02 == null || j02.isEmpty()) {
            this.f2331a.d("No users.");
            return;
        }
        int r02 = 0;
        uo uoVar = (uo) j02.get(0);
        jp u02 = uoVar.u0();
        List l02 = u02 != null ? u02.l0() : null;
        if (l02 != null && !l02.isEmpty()) {
            if (!TextUtils.isEmpty(this.f2332b)) {
                while (r02 < l02.size()) {
                    if (!((hp) l02.get(r02)).o0().equals(this.f2332b)) {
                        r02++;
                    }
                }
            }
            ((hp) l02.get(r02)).q0(this.f2333c);
            break;
        }
        uoVar.q0(this.f2334d.booleanValue());
        uoVar.n0(this.f2335e);
        this.f2336f.i(this.f2337g, uoVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gn
    public final void d(String str) {
        this.f2331a.d(str);
    }
}
