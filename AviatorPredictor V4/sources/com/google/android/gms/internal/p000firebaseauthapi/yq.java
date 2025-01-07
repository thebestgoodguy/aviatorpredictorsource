package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class yq extends ar {

    /* renamed from: e, reason: collision with root package name */
    private int f2405e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final int f2406f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ hr f2407g;

    yq(hr hrVar) {
        this.f2407g = hrVar;
        this.f2406f = hrVar.q();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.cr
    public final byte a() {
        int r02 = this.f2405e;
        if (r02 >= this.f2406f) {
            throw new NoSuchElementException();
        }
        this.f2405e = r02 + 1;
        return this.f2407g.p(r02);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2405e < this.f2406f;
    }
}
