package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    private final jf f1447a;

    /* renamed from: b, reason: collision with root package name */
    private final b2 f1448b;

    private c2(b2 b2Var) {
        ie ieVar = ie.f1770b;
        this.f1448b = b2Var;
        this.f1447a = ieVar;
    }

    public static c2 b(char c5) {
        return new c2(new b(new gc('.')));
    }

    public static c2 c(String str) {
        ki a5 = lp.a("[.-]");
        if (!((lk) a5.a("")).f1885a.matches()) {
            return new c2(new c1(a5));
        }
        throw new IllegalArgumentException(d2.b("The pattern may not match the empty string: %s", a5));
    }

    public final List d(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        Iterator a5 = this.f1448b.a(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (a5.hasNext()) {
            arrayList.add((String) a5.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
