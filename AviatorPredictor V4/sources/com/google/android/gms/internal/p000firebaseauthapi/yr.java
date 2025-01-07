package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class yr {

    /* renamed from: b, reason: collision with root package name */
    private static volatile yr f2408b;

    /* renamed from: c, reason: collision with root package name */
    static final yr f2409c = new yr(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map f2410a;

    yr() {
        this.f2410a = new HashMap();
    }

    yr(boolean z4) {
        this.f2410a = Collections.emptyMap();
    }

    public static yr a() {
        yr yrVar = f2408b;
        if (yrVar == null) {
            synchronized (yr.class) {
                yrVar = f2408b;
                if (yrVar == null) {
                    yrVar = f2409c;
                    f2408b = yrVar;
                }
            }
        }
        return yrVar;
    }

    public final js b(e0 e0Var, int r4) {
        return (js) this.f2410a.get(new xr(e0Var, r4));
    }
}
