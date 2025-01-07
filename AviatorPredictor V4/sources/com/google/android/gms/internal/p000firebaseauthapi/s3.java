package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class s3 {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f2122a;

    /* renamed from: b, reason: collision with root package name */
    private final m3 f2123b;

    /* renamed from: c, reason: collision with root package name */
    private final Class f2124c;

    /* renamed from: d, reason: collision with root package name */
    private final h8 f2125d;

    /* synthetic */ s3(ConcurrentMap concurrentMap, m3 m3Var, h8 h8Var, Class cls, r3 r3Var) {
        this.f2122a = concurrentMap;
        this.f2123b = m3Var;
        this.f2124c = cls;
        this.f2125d = h8Var;
    }

    public final Class a() {
        return this.f2124c;
    }

    public final List b(byte[] bArr) {
        List list = (List) this.f2122a.get(new o3(bArr, null));
        return list != null ? list : Collections.emptyList();
    }
}
